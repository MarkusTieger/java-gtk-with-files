/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStyleProvider {

    @FunctionalInterface
    public interface OnGtkPrivateChanged extends com.sun.jna.Callback {
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
        long gtk_style_provider_get_type();
    }

}
