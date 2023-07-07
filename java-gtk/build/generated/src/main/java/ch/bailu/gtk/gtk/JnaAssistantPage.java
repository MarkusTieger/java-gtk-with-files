/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAssistantPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_assistant_page_get_child(long _self);
        long gtk_assistant_page_get_type();
    }

}
