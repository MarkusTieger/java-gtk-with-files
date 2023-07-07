/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMnemonicTrigger {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_mnemonic_trigger_new(int keyval);
        int gtk_mnemonic_trigger_get_keyval(long _self);
        long gtk_mnemonic_trigger_get_type();
    }

}
