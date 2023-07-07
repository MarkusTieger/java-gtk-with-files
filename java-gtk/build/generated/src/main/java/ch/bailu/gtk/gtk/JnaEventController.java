/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEventController {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_event_controller_get_current_event(long _self);
        long gtk_event_controller_get_current_event_device(long _self);
        int gtk_event_controller_get_current_event_state(long _self);
        int gtk_event_controller_get_current_event_time(long _self);
        long gtk_event_controller_get_name(long _self);
        int gtk_event_controller_get_propagation_limit(long _self);
        int gtk_event_controller_get_propagation_phase(long _self);
        long gtk_event_controller_get_widget(long _self);
        void gtk_event_controller_reset(long _self);
        void gtk_event_controller_set_name(long _self, long name);
        void gtk_event_controller_set_name(long _self, String name);
        void gtk_event_controller_set_propagation_limit(long _self, int limit);
        void gtk_event_controller_set_propagation_phase(long _self, int phase);
        void gtk_event_controller_set_static_name(long _self, long name);
        void gtk_event_controller_set_static_name(long _self, String name);
        long gtk_event_controller_get_type();
    }

}
