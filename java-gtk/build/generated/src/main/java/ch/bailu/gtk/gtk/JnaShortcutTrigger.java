/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutTrigger {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcut_trigger_parse_string(long string);
        long gtk_shortcut_trigger_parse_string(String string);
        int gtk_shortcut_trigger_compare(long _self, long trigger2);
        boolean gtk_shortcut_trigger_equal(long _self, long trigger2);
        int gtk_shortcut_trigger_hash(long _self);
        void gtk_shortcut_trigger_print(long _self, long string);
        boolean gtk_shortcut_trigger_print_label(long _self, long display, long string);
        long gtk_shortcut_trigger_to_label(long _self, long display);
        long gtk_shortcut_trigger_to_string(long _self);
        int gtk_shortcut_trigger_trigger(long _self, long event, boolean enable_mnemonics);
        long gtk_shortcut_trigger_get_type();
    }

}
