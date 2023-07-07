/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaExpander {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_expander_new(long label);
        long gtk_expander_new(String label);
        long gtk_expander_new_with_mnemonic(long label);
        long gtk_expander_new_with_mnemonic(String label);
        long gtk_expander_get_child(long _self);
        boolean gtk_expander_get_expanded(long _self);
        long gtk_expander_get_label(long _self);
        long gtk_expander_get_label_widget(long _self);
        boolean gtk_expander_get_resize_toplevel(long _self);
        boolean gtk_expander_get_use_markup(long _self);
        boolean gtk_expander_get_use_underline(long _self);
        void gtk_expander_set_child(long _self, long child);
        void gtk_expander_set_expanded(long _self, boolean expanded);
        void gtk_expander_set_label(long _self, long label);
        void gtk_expander_set_label(long _self, String label);
        void gtk_expander_set_label_widget(long _self, long label_widget);
        void gtk_expander_set_resize_toplevel(long _self, boolean resize_toplevel);
        void gtk_expander_set_use_markup(long _self, boolean use_markup);
        void gtk_expander_set_use_underline(long _self, boolean use_underline);
        long gtk_expander_get_type();
    }

}
