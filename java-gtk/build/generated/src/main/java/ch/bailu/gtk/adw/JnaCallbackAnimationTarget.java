/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaCallbackAnimationTarget {

    @FunctionalInterface
    public interface OnAnimationTargetFunc extends com.sun.jna.Callback {
        void invoke(double value, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_callback_animation_target_new(com.sun.jna.Callback callback, long user_data, com.sun.jna.Callback destroy);
        long adw_callback_animation_target_get_type();
    }

}
