/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAppChooserWidget {

    @FunctionalInterface
    public interface OnApplicationActivated extends com.sun.jna.Callback {
        void invoke(long _self, long application, long _data);
    }

    @FunctionalInterface
    public interface OnApplicationSelected extends com.sun.jna.Callback {
        void invoke(long _self, long application, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_app_chooser_widget_new(long content_type);
        long gtk_app_chooser_widget_new(String content_type);
        long gtk_app_chooser_widget_get_default_text(long _self);
        boolean gtk_app_chooser_widget_get_show_all(long _self);
        boolean gtk_app_chooser_widget_get_show_default(long _self);
        boolean gtk_app_chooser_widget_get_show_fallback(long _self);
        boolean gtk_app_chooser_widget_get_show_other(long _self);
        boolean gtk_app_chooser_widget_get_show_recommended(long _self);
        void gtk_app_chooser_widget_set_default_text(long _self, long text);
        void gtk_app_chooser_widget_set_default_text(long _self, String text);
        void gtk_app_chooser_widget_set_show_all(long _self, boolean setting);
        void gtk_app_chooser_widget_set_show_default(long _self, boolean setting);
        void gtk_app_chooser_widget_set_show_fallback(long _self, boolean setting);
        void gtk_app_chooser_widget_set_show_other(long _self, boolean setting);
        void gtk_app_chooser_widget_set_show_recommended(long _self, boolean setting);
        long gtk_app_chooser_widget_get_type();
    }

}
