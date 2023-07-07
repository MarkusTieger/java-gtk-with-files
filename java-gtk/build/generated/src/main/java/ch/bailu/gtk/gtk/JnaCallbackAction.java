/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCallbackAction {

    @FunctionalInterface
    public interface OnShortcutFunc extends com.sun.jna.Callback {
        boolean invoke(long widget, long args, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_callback_action_new(com.sun.jna.Callback callback, long data, com.sun.jna.Callback destroy);
        long gtk_callback_action_get_type();
    }

}
