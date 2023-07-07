/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEventControllerLegacy {

    @FunctionalInterface
    public interface OnEvent extends com.sun.jna.Callback {
        boolean invoke(long _self, long event, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_event_controller_legacy_new();
        long gtk_event_controller_legacy_get_type();
    }

}
