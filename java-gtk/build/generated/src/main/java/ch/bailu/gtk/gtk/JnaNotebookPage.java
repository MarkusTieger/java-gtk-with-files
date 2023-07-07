/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaNotebookPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_notebook_page_get_child(long _self);
        long gtk_notebook_page_get_type();
    }

}
