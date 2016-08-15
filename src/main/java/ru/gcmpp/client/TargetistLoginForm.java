package ru.gcmpp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;



/**
 * Created by Mihail.Amaev on 15.08.2016.
 */
public class TargetistLoginForm implements IsWidget {

    // Переменные для примера диаграммы:




    private final HBoxLayoutContainer rootElement;

    private static TargetistLoginFormUiBinder ourUiBinder = GWT.create(TargetistLoginFormUiBinder.class);

    interface TargetistLoginFormUiBinder extends UiBinder<HBoxLayoutContainer, TargetistLoginForm> {
    }

    @UiField
    TextField login;
    @UiField
    PasswordField pass;
    @UiField
    TextButton enterButton;
    @UiField
    ToggleButton toggleButton;

    public TargetistLoginForm() {
//        Info.display("Начинаем рисоваться","Но что-то не получается");
        rootElement = ourUiBinder.createAndBindUi(this);
    }

    @Override
    public Widget asWidget() {


        return this.rootElement;
    }
}
