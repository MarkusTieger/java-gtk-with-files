/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaATContext {

    @FunctionalInterface
    public interface OnStateChange extends com.sun.jna.Callback {
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
        long gtk_at_context_create(int accessible_role, long accessible, long display);
        long gtk_at_context_get_accessible(long _self);
        int gtk_at_context_get_accessible_role(long _self);
        long gtk_at_context_get_type();
    }

}
