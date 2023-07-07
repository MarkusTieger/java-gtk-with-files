/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaGlyphItemIter {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("GlyphItemIter size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({GlyphItemIter.GLYPH_ITEM, GlyphItemIter.TEXT, GlyphItemIter.START_GLYPH, GlyphItemIter.START_INDEX, GlyphItemIter.START_CHAR, GlyphItemIter.END_GLYPH, GlyphItemIter.END_INDEX, GlyphItemIter.END_CHAR})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long glyph_item;
        public long text;
        public int start_glyph;
        public int start_index;
        public int start_char;
        public int end_glyph;
        public int end_index;
        public int end_char;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_glyph_item_iter_copy(long _self);
        void pango_glyph_item_iter_free(long _self);
        boolean pango_glyph_item_iter_init_end(long _self, long glyph_item, long text);
        boolean pango_glyph_item_iter_init_end(long _self, long glyph_item, String text);
        boolean pango_glyph_item_iter_init_start(long _self, long glyph_item, long text);
        boolean pango_glyph_item_iter_init_start(long _self, long glyph_item, String text);
        boolean pango_glyph_item_iter_next_cluster(long _self);
        boolean pango_glyph_item_iter_prev_cluster(long _self);
        long pango_glyph_item_iter_get_type();
    }

}
