/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaGlyphItem {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("GlyphItem size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({GlyphItem.ITEM, GlyphItem.GLYPHS, GlyphItem.Y_OFFSET, GlyphItem.START_X_OFFSET, GlyphItem.END_X_OFFSET})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long item;
        public long glyphs;
        public int y_offset;
        public int start_x_offset;
        public int end_x_offset;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_glyph_item_apply_attrs(long _self, long text, long list);
        long pango_glyph_item_apply_attrs(long _self, String text, long list);
        long pango_glyph_item_copy(long _self);
        void pango_glyph_item_free(long _self);
        void pango_glyph_item_get_logical_widths(long _self, long text, long logical_widths);
        void pango_glyph_item_get_logical_widths(long _self, String text, long logical_widths);
        long pango_glyph_item_split(long _self, long text, int split_index);
        long pango_glyph_item_split(long _self, String text, int split_index);
        long pango_glyph_item_get_type();
    }

}
