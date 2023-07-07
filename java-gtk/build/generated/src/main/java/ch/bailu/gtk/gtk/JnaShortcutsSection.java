/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaShortcutsSection {

    @FunctionalInterface
    public interface OnChangeCurrentPage extends com.sun.jna.Callback {
        boolean invoke(long _self, int object, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_shortcuts_section_get_type();
    }

}
