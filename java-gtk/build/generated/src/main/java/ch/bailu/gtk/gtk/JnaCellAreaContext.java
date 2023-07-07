/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellAreaContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_cell_area_context_allocate(long _self, int width, int height);
        void gtk_cell_area_context_get_allocation(long _self, long width, long height);
        long gtk_cell_area_context_get_area(long _self);
        void gtk_cell_area_context_get_preferred_height(long _self, long minimum_height, long natural_height);
        void gtk_cell_area_context_get_preferred_height_for_width(long _self, int width, long minimum_height, long natural_height);
        void gtk_cell_area_context_get_preferred_width(long _self, long minimum_width, long natural_width);
        void gtk_cell_area_context_get_preferred_width_for_height(long _self, int height, long minimum_width, long natural_width);
        void gtk_cell_area_context_push_preferred_height(long _self, int minimum_height, int natural_height);
        void gtk_cell_area_context_push_preferred_width(long _self, int minimum_width, int natural_width);
        void gtk_cell_area_context_reset(long _self);
        long gtk_cell_area_context_get_type();
    }

}
