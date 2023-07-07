/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaLayoutLine {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("LayoutLine size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({LayoutLine.LAYOUT, LayoutLine.START_INDEX, LayoutLine.LENGTH, LayoutLine.RUNS, LayoutLine.IS_PARAGRAPH_START, LayoutLine.RESOLVED_DIR})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long layout;
        public int start_index;
        public int length;
        public long runs;
        public int is_paragraph_start;
        public int resolved_dir;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void pango_layout_line_get_extents(long _self, long ink_rect, long logical_rect);
        void pango_layout_line_get_height(long _self, long height);
        int pango_layout_line_get_length(long _self);
        void pango_layout_line_get_pixel_extents(long _self, long ink_rect, long logical_rect);
        int pango_layout_line_get_resolved_direction(long _self);
        int pango_layout_line_get_start_index(long _self);
        void pango_layout_line_index_to_x(long _self, int index_, boolean trailing, long x_pos);
        boolean pango_layout_line_is_paragraph_start(long _self);
        long pango_layout_line_ref(long _self);
        void pango_layout_line_unref(long _self);
        boolean pango_layout_line_x_to_index(long _self, int x_pos, long index_, long trailing);
        long pango_layout_line_get_type();
    }

}
