/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaTabArray {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_tab_array_new(int initial_size, boolean positions_in_pixels);
        long pango_tab_array_new_with_positions(int size, boolean positions_in_pixels, int first_alignment, int first_position, java.lang.Object... _elipse);
        long pango_tab_array_copy(long _self);
        void pango_tab_array_free(long _self);
        byte pango_tab_array_get_decimal_point(long _self, int tab_index);
        boolean pango_tab_array_get_positions_in_pixels(long _self);
        int pango_tab_array_get_size(long _self);
        void pango_tab_array_get_tab(long _self, int tab_index, long alignment, long location);
        void pango_tab_array_resize(long _self, int new_size);
        void pango_tab_array_set_decimal_point(long _self, int tab_index, byte decimal_point);
        void pango_tab_array_set_positions_in_pixels(long _self, boolean positions_in_pixels);
        void pango_tab_array_set_tab(long _self, int tab_index, int alignment, int location);
        void pango_tab_array_sort(long _self);
        long pango_tab_array_to_string(long _self);
        long pango_tab_array_from_string(long text);
        long pango_tab_array_get_type();
    }

}
