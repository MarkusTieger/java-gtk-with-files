/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStyleContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_style_context_add_class(long _self, long class_name);
        void gtk_style_context_add_class(long _self, String class_name);
        void gtk_style_context_add_provider(long _self, long provider, int priority);
        void gtk_style_context_get_border(long _self, long border);
        void gtk_style_context_get_color(long _self, long color);
        long gtk_style_context_get_display(long _self);
        void gtk_style_context_get_margin(long _self, long margin);
        void gtk_style_context_get_padding(long _self, long padding);
        int gtk_style_context_get_scale(long _self);
        int gtk_style_context_get_state(long _self);
        boolean gtk_style_context_has_class(long _self, long class_name);
        boolean gtk_style_context_has_class(long _self, String class_name);
        boolean gtk_style_context_lookup_color(long _self, long color_name, long color);
        boolean gtk_style_context_lookup_color(long _self, String color_name, long color);
        void gtk_style_context_remove_class(long _self, long class_name);
        void gtk_style_context_remove_class(long _self, String class_name);
        void gtk_style_context_remove_provider(long _self, long provider);
        void gtk_style_context_restore(long _self);
        void gtk_style_context_save(long _self);
        void gtk_style_context_set_display(long _self, long display);
        void gtk_style_context_set_scale(long _self, int scale);
        void gtk_style_context_set_state(long _self, int flags);
        long gtk_style_context_to_string(long _self, int flags);
        void gtk_style_context_add_provider_for_display(long display, long provider, int priority);
        void gtk_style_context_remove_provider_for_display(long display, long provider);
        long gtk_style_context_get_type();
    }

}
