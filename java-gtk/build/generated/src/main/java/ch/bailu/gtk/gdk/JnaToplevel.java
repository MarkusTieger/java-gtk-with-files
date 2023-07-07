/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaToplevel {

    @FunctionalInterface
    public interface OnComputeSize extends com.sun.jna.Callback {
        void invoke(long _self, long size, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_toplevel_begin_move(long _self, long device, int button, double x, double y, int timestamp);
        void gdk_toplevel_begin_resize(long _self, int edge, long device, int button, double x, double y, int timestamp);
        void gdk_toplevel_focus(long _self, int timestamp);
        int gdk_toplevel_get_state(long _self);
        void gdk_toplevel_inhibit_system_shortcuts(long _self, long event);
        boolean gdk_toplevel_lower(long _self);
        boolean gdk_toplevel_minimize(long _self);
        void gdk_toplevel_present(long _self, long layout);
        void gdk_toplevel_restore_system_shortcuts(long _self);
        void gdk_toplevel_set_decorated(long _self, boolean decorated);
        void gdk_toplevel_set_deletable(long _self, boolean deletable);
        void gdk_toplevel_set_icon_list(long _self, long surfaces);
        void gdk_toplevel_set_modal(long _self, boolean modal);
        void gdk_toplevel_set_startup_id(long _self, long startup_id);
        void gdk_toplevel_set_startup_id(long _self, String startup_id);
        void gdk_toplevel_set_title(long _self, long title);
        void gdk_toplevel_set_title(long _self, String title);
        void gdk_toplevel_set_transient_for(long _self, long parent);
        boolean gdk_toplevel_show_window_menu(long _self, long event);
        boolean gdk_toplevel_supports_edge_constraints(long _self);
        boolean gdk_toplevel_titlebar_gesture(long _self, int gesture);
        long gdk_toplevel_get_type();
    }

}
