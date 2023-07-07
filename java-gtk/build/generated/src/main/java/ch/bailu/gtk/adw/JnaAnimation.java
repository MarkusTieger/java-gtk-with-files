/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaAnimation {

    @FunctionalInterface
    public interface OnDone extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int adw_animation_get_state(long _self);
        long adw_animation_get_target(long _self);
        double adw_animation_get_value(long _self);
        long adw_animation_get_widget(long _self);
        void adw_animation_pause(long _self);
        void adw_animation_play(long _self);
        void adw_animation_reset(long _self);
        void adw_animation_resume(long _self);
        void adw_animation_set_target(long _self, long target);
        void adw_animation_skip(long _self);
        long adw_animation_get_type();
    }

}
