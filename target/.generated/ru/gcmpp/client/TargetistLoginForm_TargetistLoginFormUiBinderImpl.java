// .ui.xml template last modified: 1471266944943
package ru.gcmpp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;

public class TargetistLoginForm_TargetistLoginFormUiBinderImpl implements UiBinder<com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer, ru.gcmpp.client.TargetistLoginForm>, ru.gcmpp.client.TargetistLoginForm.TargetistLoginFormUiBinder {


  public com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer createAndBindUi(final ru.gcmpp.client.TargetistLoginForm owner) {


    return new Widgets(owner).get_f_HBoxLayoutContainer1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ru.gcmpp.client.TargetistLoginForm owner;


    public Widgets(final ru.gcmpp.client.TargetistLoginForm owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ru.gcmpp.client.TargetistLoginForm_TargetistLoginFormUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ru.gcmpp.client.TargetistLoginForm_TargetistLoginFormUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ru.gcmpp.client.TargetistLoginForm_TargetistLoginFormUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ru.gcmpp.client.TargetistLoginForm_TargetistLoginFormUiBinderImpl_GenBundle) GWT.create(ru.gcmpp.client.TargetistLoginForm_TargetistLoginFormUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for loginMargins called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sencha.gxt.core.client.util.Margins get_loginMargins() {
      return build_loginMargins();
    }
    private com.sencha.gxt.core.client.util.Margins build_loginMargins() {
      // Creation section.
      final com.sencha.gxt.core.client.util.Margins loginMargins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
      // Setup section.
      loginMargins.setTop(20);
      loginMargins.setLeft(0);
      loginMargins.setBottom(0);
      loginMargins.setRight(0);

      return loginMargins;
    }

    /**
     * Getter for verticalLayoutData called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData get_verticalLayoutData() {
      return build_verticalLayoutData();
    }
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData build_verticalLayoutData() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData verticalLayoutData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
      // Setup section.
      verticalLayoutData.setMargins(get_loginMargins());
      verticalLayoutData.setWidth(1);
      verticalLayoutData.setHeight(-1);

      return verticalLayoutData;
    }

    /**
     * Getter for verticalLayoutDataPass called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData get_verticalLayoutDataPass() {
      return build_verticalLayoutDataPass();
    }
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData build_verticalLayoutDataPass() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData verticalLayoutDataPass = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
      // Setup section.
      verticalLayoutDataPass.setWidth(1);
      verticalLayoutDataPass.setHeight(-1);

      return verticalLayoutDataPass;
    }

    /**
     * Getter for f_HBoxLayoutContainer1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer get_f_HBoxLayoutContainer1() {
      return build_f_HBoxLayoutContainer1();
    }
    private com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer build_f_HBoxLayoutContainer1() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer f_HBoxLayoutContainer1 = (com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.class);
      // Setup section.
      f_HBoxLayoutContainer1.add(get_f_FramedPanel2());
      f_HBoxLayoutContainer1.setHBoxLayoutAlign(com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign.MIDDLE);
      f_HBoxLayoutContainer1.setPack(com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack.CENTER);

      return f_HBoxLayoutContainer1;
    }

    /**
     * Getter for f_FramedPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sencha.gxt.widget.core.client.FramedPanel get_f_FramedPanel2() {
      return build_f_FramedPanel2();
    }
    private com.sencha.gxt.widget.core.client.FramedPanel build_f_FramedPanel2() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.FramedPanel f_FramedPanel2 = (com.sencha.gxt.widget.core.client.FramedPanel) GWT.create(com.sencha.gxt.widget.core.client.FramedPanel.class);
      // Setup section.
      f_FramedPanel2.addButton(get_enterButton());
      f_FramedPanel2.add(get_f_VerticalLayoutContainer3());
      f_FramedPanel2.setHeadingText("Авторизация");
      f_FramedPanel2.setWidth("300");
      f_FramedPanel2.setHeight("150");

      return f_FramedPanel2;
    }

    /**
     * Getter for enterButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sencha.gxt.widget.core.client.button.TextButton get_enterButton() {
      return build_enterButton();
    }
    private com.sencha.gxt.widget.core.client.button.TextButton build_enterButton() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.button.TextButton enterButton = (com.sencha.gxt.widget.core.client.button.TextButton) GWT.create(com.sencha.gxt.widget.core.client.button.TextButton.class);
      // Setup section.
      enterButton.setText("Вход");

      this.owner.enterButton = enterButton;

      return enterButton;
    }

    /**
     * Getter for f_VerticalLayoutContainer3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer get_f_VerticalLayoutContainer3() {
      return build_f_VerticalLayoutContainer3();
    }
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer build_f_VerticalLayoutContainer3() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer3 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);
      // Setup section.
      f_VerticalLayoutContainer3.add(get_f_FieldLabel4(), get_verticalLayoutData());
      f_VerticalLayoutContainer3.add(get_f_FieldLabel5(), get_verticalLayoutDataPass());

      return f_VerticalLayoutContainer3;
    }

    /**
     * Getter for f_FieldLabel4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.FieldLabel get_f_FieldLabel4() {
      return build_f_FieldLabel4();
    }
    private com.sencha.gxt.widget.core.client.form.FieldLabel build_f_FieldLabel4() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.FieldLabel f_FieldLabel4 = (com.sencha.gxt.widget.core.client.form.FieldLabel) GWT.create(com.sencha.gxt.widget.core.client.form.FieldLabel.class);
      // Setup section.
      f_FieldLabel4.setWidget(get_login());
      f_FieldLabel4.setText("Логин");

      return f_FieldLabel4;
    }

    /**
     * Getter for login called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.sencha.gxt.widget.core.client.form.TextField get_login() {
      return build_login();
    }
    private com.sencha.gxt.widget.core.client.form.TextField build_login() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.TextField login = (com.sencha.gxt.widget.core.client.form.TextField) GWT.create(com.sencha.gxt.widget.core.client.form.TextField.class);
      // Setup section.
      login.setAllowBlank(false);

      this.owner.login = login;

      return login;
    }

    /**
     * Getter for f_FieldLabel5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.FieldLabel get_f_FieldLabel5() {
      return build_f_FieldLabel5();
    }
    private com.sencha.gxt.widget.core.client.form.FieldLabel build_f_FieldLabel5() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.FieldLabel f_FieldLabel5 = (com.sencha.gxt.widget.core.client.form.FieldLabel) GWT.create(com.sencha.gxt.widget.core.client.form.FieldLabel.class);
      // Setup section.
      f_FieldLabel5.setWidget(get_pass());
      f_FieldLabel5.setText("Пароль");

      return f_FieldLabel5;
    }

    /**
     * Getter for pass called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.sencha.gxt.widget.core.client.form.PasswordField get_pass() {
      return build_pass();
    }
    private com.sencha.gxt.widget.core.client.form.PasswordField build_pass() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.PasswordField pass = (com.sencha.gxt.widget.core.client.form.PasswordField) GWT.create(com.sencha.gxt.widget.core.client.form.PasswordField.class);
      // Setup section.
      pass.setAllowBlank(false);

      this.owner.pass = pass;

      return pass;
    }
  }
}
