/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEventControllerScroll {

    @FunctionalInterface
    public interface OnDecelerate extends com.sun.jna.Callback {
        void invoke(long _self, double vel_x, double vel_y, long _data);
    }

    @FunctionalInterface
    public interface OnScroll extends com.sun.jna.Callback {
        boolean invoke(long _self, double dx, double dy, long _data);
    }

    @FunctionalInterface
    public interface OnScrollBegin extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnScrollEnd extends com.sun.jna.Callback {
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
        long gtk_event_controller_scroll_new(int flags);
        int gtk_event_controller_scroll_get_flags(long _self);
        int gtk_event_controller_scroll_get_unit(long _self);
        void gtk_event_controller_scroll_set_flags(long _self, int flags);
        long gtk_event_controller_scroll_get_type();
    }

}
