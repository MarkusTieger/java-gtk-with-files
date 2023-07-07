/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellAreaBox {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_area_box_new();
        int gtk_cell_area_box_get_spacing(long _self);
        void gtk_cell_area_box_pack_end(long _self, long renderer, boolean expand, boolean align, boolean fixed);
        void gtk_cell_area_box_pack_start(long _self, long renderer, boolean expand, boolean align, boolean fixed);
        void gtk_cell_area_box_set_spacing(long _self, int spacing);
        long gtk_cell_area_box_get_type();
    }

}
