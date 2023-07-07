/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaLayoutIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean pango_layout_iter_at_last_line(long _self);
        long pango_layout_iter_copy(long _self);
        void pango_layout_iter_free(long _self);
        int pango_layout_iter_get_baseline(long _self);
        void pango_layout_iter_get_char_extents(long _self, long logical_rect);
        void pango_layout_iter_get_cluster_extents(long _self, long ink_rect, long logical_rect);
        int pango_layout_iter_get_index(long _self);
        long pango_layout_iter_get_layout(long _self);
        void pango_layout_iter_get_layout_extents(long _self, long ink_rect, long logical_rect);
        long pango_layout_iter_get_line(long _self);
        void pango_layout_iter_get_line_extents(long _self, long ink_rect, long logical_rect);
        long pango_layout_iter_get_line_readonly(long _self);
        void pango_layout_iter_get_line_yrange(long _self, long y0_, long y1_);
        long pango_layout_iter_get_run(long _self);
        int pango_layout_iter_get_run_baseline(long _self);
        void pango_layout_iter_get_run_extents(long _self, long ink_rect, long logical_rect);
        long pango_layout_iter_get_run_readonly(long _self);
        boolean pango_layout_iter_next_char(long _self);
        boolean pango_layout_iter_next_cluster(long _self);
        boolean pango_layout_iter_next_line(long _self);
        boolean pango_layout_iter_next_run(long _self);
        long pango_layout_iter_get_type();
    }

}
