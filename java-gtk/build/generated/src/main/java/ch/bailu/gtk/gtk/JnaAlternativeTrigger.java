/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAlternativeTrigger {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_alternative_trigger_new(long first, long second);
        long gtk_alternative_trigger_get_first(long _self);
        long gtk_alternative_trigger_get_second(long _self);
        long gtk_alternative_trigger_get_type();
    }

}
