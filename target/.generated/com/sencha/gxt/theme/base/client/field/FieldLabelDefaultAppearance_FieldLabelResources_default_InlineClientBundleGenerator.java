package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FieldLabelDefaultAppearance_FieldLabelResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.FieldLabelResources {
  private static FieldLabelDefaultAppearance_FieldLabelResources_default_InlineClientBundleGenerator _instance0 = new FieldLabelDefaultAppearance_FieldLabelResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("div.GCGCW0WDJT{display:" + ("block")  + ";margin-bottom:" + ("5px")  + ";position:" + ("relative")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDKT{margin-bottom:" + ("2px")  + ";padding-bottom:" + ("0")  + ";padding-bottom:" + ("4px")  + ";}.GCGCW0WDJT .GCGCW0WDLT{clear:" + ("right")  + ";display:" + ("block")  + ";float:" + ("right")  + ";padding:") + (("3px"+ " " +"0"+ " " +"0")  + ";position:" + ("relative")  + ";z-index:" + ("2")  + ";-moz-user-select:" + ("none")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDKT .GCGCW0WDLT{width:" + ("auto")  + " !important;float:" + ("none")  + " !important;clear:" + ("none")  + ";display:" + ("inline")  + ";margin-bottom:" + ("4px")  + ";position:" + ("static") ) + (";}.GCGCW0WDKT .GCGCW0WDIT{padding-right:" + ("0")  + " !important;padding-top:" + ("4px")  + ";}.GCGCW0WDHT{clear:" + ("right")  + ";font-size:" + ("0")  + ";height:" + ("0")  + ";line-height:" + ("0")  + ";overflow:" + ("hidden")  + ";}")) : (("div.GCGCW0WDJT{display:" + ("block")  + ";margin-bottom:" + ("5px")  + ";position:" + ("relative")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDKT{margin-bottom:" + ("2px")  + ";padding-bottom:" + ("0")  + ";padding-bottom:" + ("4px")  + ";}.GCGCW0WDJT .GCGCW0WDLT{clear:" + ("left")  + ";display:" + ("block")  + ";float:" + ("left")  + ";padding:") + (("3px"+ " " +"0"+ " " +"0")  + ";position:" + ("relative")  + ";z-index:" + ("2")  + ";-moz-user-select:" + ("none")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";}.GCGCW0WDKT .GCGCW0WDLT{width:" + ("auto")  + " !important;float:" + ("none")  + " !important;clear:" + ("none")  + ";display:" + ("inline")  + ";margin-bottom:" + ("4px")  + ";position:" + ("static") ) + (";}.GCGCW0WDKT .GCGCW0WDIT{padding-left:" + ("0")  + " !important;padding-top:" + ("4px")  + ";}.GCGCW0WDHT{clear:" + ("left")  + ";font-size:" + ("0")  + ";height:" + ("0")  + ";line-height:" + ("0")  + ";overflow:" + ("hidden")  + ";}"));
      }
      public java.lang.String clearLeft() {
        return "GCGCW0WDHT";
      }
      public java.lang.String fieldElement() {
        return "GCGCW0WDIT";
      }
      public java.lang.String fieldItem() {
        return "GCGCW0WDJT";
      }
      public java.lang.String fieldItemLabelTop() {
        return "GCGCW0WDKT";
      }
      public java.lang.String fieldLabel() {
        return "GCGCW0WDLT";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.FieldLabelResources::css()();
    }
    return null;
  }-*/;
}
