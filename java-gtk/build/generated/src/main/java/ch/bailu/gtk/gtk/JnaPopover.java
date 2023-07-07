/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPopover {

    @FunctionalInterface
    public interface OnActivateDefault extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnClosed extends com.sun.jna.Callback {
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
        long gtk_popover_new();
        boolean gtk_popover_get_autohide(long _self);
        boolean gtk_popover_get_cascade_popdown(long _self);
        long gtk_popover_get_child(long _self);
        boolean gtk_popover_get_has_arrow(long _self);
        boolean gtk_popover_get_mnemonics_visible(long _self);
        void gtk_popover_get_offset(long _self, long x_offset, long y_offset);
        boolean gtk_popover_get_pointing_to(long _self, long rect);
        int gtk_popover_get_position(long _self);
        void gtk_popover_popdown(long _self);
        void gtk_popover_popup(long _self);
        void gtk_popover_present(long _self);
        void gtk_popover_set_autohide(long _self, boolean autohide);
        void gtk_popover_set_cascade_popdown(long _self, boolean cascade_popdown);
        void gtk_popover_set_child(long _self, long child);
        void gtk_popover_set_default_widget(long _self, long widget);
        void gtk_popover_set_has_arrow(long _self, boolean has_arrow);
        void gtk_popover_set_mnemonics_visible(long _self, boolean mnemonics_visible);
        void gtk_popover_set_offset(long _self, int x_offset, int y_offset);
        void gtk_popover_set_pointing_to(long _self, long rect);
        void gtk_popover_set_position(long _self, int position);
        long gtk_popover_get_type();
    }

}
