package ru.gcmpp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.chart.client.chart.Chart;
import com.sencha.gxt.chart.client.chart.Legend;
import com.sencha.gxt.chart.client.chart.series.PieSeries;
import com.sencha.gxt.chart.client.chart.series.Series;
import com.sencha.gxt.chart.client.chart.series.SeriesLabelConfig;
import com.sencha.gxt.chart.client.draw.Gradient;
import com.sencha.gxt.chart.client.draw.RGB;
import com.sencha.gxt.chart.client.draw.Stop;
import com.sencha.gxt.chart.client.draw.sprite.TextSprite;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.*;
import com.sencha.gxt.explorer.client.app.ui.ExampleContainer;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Targetist implements EntryPoint, IsWidget {


    public interface DataPropertyAccess extends PropertyAccess<Data> {
        ValueProvider<Data, Double> data1();
        ValueProvider<Data, String> name();
        @Editor.Path("id")
        ModelKeyProvider<Data> nameKey();
    }

    protected static final int MIN_HEIGHT = 480;
    protected static final int MIN_WIDTH = 640;

    private static final DataPropertyAccess dataAccess = GWT.create(DataPropertyAccess.class);

    private ContentPanel panel;

    @Override
    public Widget asWidget() {
        if (panel == null) {
            final ListStore<Data> store = new ListStore<Data>(dataAccess.nameKey());
            store.addAll(TestData.getData(6, 20, 100));

            Gradient slice1 = new Gradient(45);
            slice1.addStop(new Stop(0, new RGB(148, 174, 10)));
            slice1.addStop(new Stop(100, new RGB(107, 126, 7)));

            Gradient slice2 = new Gradient(45);
            slice2.addStop(new Stop(0, new RGB(17, 95, 166)));
            slice2.addStop(new Stop(100, new RGB(12, 69, 120)));

            Gradient slice3 = new Gradient(45);
            slice3.addStop(new Stop(0, new RGB(166, 17, 32)));
            slice3.addStop(new Stop(100, new RGB(120, 12, 23)));

            Gradient slice4 = new Gradient(45);
            slice4.addStop(new Stop(0, new RGB(255, 136, 9)));
            slice4.addStop(new Stop(100, new RGB(213, 110, 0)));

            Gradient slice5 = new Gradient(45);
            slice5.addStop(new Stop(0, new RGB(255, 209, 62)));
            slice5.addStop(new Stop(100, new RGB(255, 197, 11)));

            Gradient slice6 = new Gradient(45);
            slice6.addStop(new Stop(0, new RGB(166, 17, 135)));
            slice6.addStop(new Stop(100, new RGB(120, 12, 97)));

            TextSprite textConfig = new TextSprite();
            textConfig.setFont("Arial");
            textConfig.setTextBaseline(TextSprite.TextBaseline.MIDDLE);
            textConfig.setFontSize(18);
            textConfig.setTextAnchor(TextSprite.TextAnchor.MIDDLE);
            textConfig.setZIndex(15);

            SeriesLabelConfig<Data> labelConfig = new SeriesLabelConfig<Data>();
            labelConfig.setSpriteConfig(textConfig);
            labelConfig.setLabelPosition(Series.LabelPosition.START);
            labelConfig.setValueProvider(dataAccess.name(), new StringLabelProvider<String>());

            final PieSeries<Data> series = new PieSeries<Data>();
            series.setAngleField(dataAccess.data1());
            series.addColor(slice1);
            series.addColor(slice2);
            series.addColor(slice3);
            series.addColor(slice4);
            series.addColor(slice5);
            series.addColor(slice6);
            series.setLabelConfig(labelConfig);
            series.setHighlighting(true);
            series.setLegendValueProvider(dataAccess.name(), new LabelProvider<String>() {
                @Override
                public String getLabel(String item) {
                    return item.substring(0, 3);
                }
            });

            final Legend<Data> legend = new Legend<Data>();
            legend.setPosition(Chart.Position.RIGHT);
            legend.setItemHighlighting(true);
            legend.setItemHiding(true);
            legend.getBorderConfig().setStrokeWidth(0);

            final Chart<Data> chart = new Chart<Data>();
            chart.setDefaultInsets(30);
            chart.setStore(store);
            chart.setShadowChart(false);
            chart.addGradient(slice1);
            chart.addGradient(slice2);
            chart.addGradient(slice3);
            chart.addGradient(slice4);
            chart.addGradient(slice5);
            chart.addGradient(slice6);
            chart.addSeries(series);
            chart.setLegend(legend);

            TextButton regenerate = new TextButton("Перезарузка данных");
            regenerate.addSelectHandler(new SelectEvent.SelectHandler() {
                @Override
                public void onSelect(SelectEvent event) {
                    store.clear();
                    store.addAll(TestData.getData(6, 20, 100));
                    chart.redrawChart();
                }
            });

            ToggleButton donut = new ToggleButton("Донат хз. что это");
            donut.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
                @Override
                public void onValueChange(ValueChangeEvent<Boolean> event) {
                    if (event.getValue()) {
                        series.setDonut(35);
                    } else {
                        series.setDonut(0);
                    }
                    chart.redrawChart();
                }
            });

            ToggleButton animation = new ToggleButton("Анимация");
            animation.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
                @Override
                public void onValueChange(ValueChangeEvent<Boolean> event) {
                    chart.setAnimated(event.getValue());
                }
            });
            animation.setValue(true, true);

            ToggleButton shadow = new ToggleButton("Анимация");
            shadow.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
                @Override
                public void onValueChange(ValueChangeEvent<Boolean> event) {
                    chart.setShadowChart(event.getValue());
                    chart.redrawChart();
                }
            });
            shadow.setValue(false);

            ToolBar toolBar = new ToolBar();
            toolBar.add(regenerate);
            toolBar.add(animation);
            toolBar.add(shadow);
            toolBar.add(donut);

            VerticalLayoutContainer layout = new VerticalLayoutContainer();
            layout.add(toolBar, new VerticalLayoutContainer.VerticalLayoutData(1, -1));
            layout.add(chart, new VerticalLayoutContainer.VerticalLayoutData(1, 1));

            panel = new ContentPanel();
            panel.setHeadingText("Моя диаграмма");
            panel.add(layout);

            }
        return panel;
    }

  public void onModuleLoad() {
      new ExampleContainer(this)
              .se


//      TargetistLoginForm form = new TargetistLoginForm();
//
//      RootPanel.get("loginContainer").add(form);
  }



}
