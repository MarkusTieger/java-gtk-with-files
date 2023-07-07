/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaGlyphString {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("GlyphString size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({GlyphString.NUM_GLYPHS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int num_glyphs;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_glyph_string_new();
        long pango_glyph_string_copy(long _self);
        void pango_glyph_string_extents(long _self, long font, long ink_rect, long logical_rect);
        void pango_glyph_string_extents_range(long _self, int start, int end, long font, long ink_rect, long logical_rect);
        void pango_glyph_string_free(long _self);
        void pango_glyph_string_get_logical_widths(long _self, long text, int length, int embedding_level, long logical_widths);
        void pango_glyph_string_get_logical_widths(long _self, String text, int length, int embedding_level, long logical_widths);
        int pango_glyph_string_get_width(long _self);
        void pango_glyph_string_index_to_x(long _self, long text, int length, long analysis, int index_, boolean trailing, long x_pos);
        void pango_glyph_string_index_to_x(long _self, String text, int length, long analysis, int index_, boolean trailing, long x_pos);
        void pango_glyph_string_index_to_x_full(long _self, long text, int length, long analysis, long attrs, int index_, boolean trailing, long x_pos);
        void pango_glyph_string_index_to_x_full(long _self, String text, int length, long analysis, long attrs, int index_, boolean trailing, long x_pos);
        void pango_glyph_string_set_size(long _self, int new_len);
        void pango_glyph_string_x_to_index(long _self, long text, int length, long analysis, int x_pos, long index_, long trailing);
        void pango_glyph_string_x_to_index(long _self, String text, int length, long analysis, int x_pos, long index_, long trailing);
        long pango_glyph_string_get_type();
    }

}
