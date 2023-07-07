/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontMetrics {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FontMetrics size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FontMetrics.REF_COUNT, FontMetrics.ASCENT, FontMetrics.DESCENT, FontMetrics.HEIGHT, FontMetrics.APPROXIMATE_CHAR_WIDTH, FontMetrics.APPROXIMATE_DIGIT_WIDTH, FontMetrics.UNDERLINE_POSITION, FontMetrics.UNDERLINE_THICKNESS, FontMetrics.STRIKETHROUGH_POSITION, FontMetrics.STRIKETHROUGH_THICKNESS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int ref_count;
        public int ascent;
        public int descent;
        public int height;
        public int approximate_char_width;
        public int approximate_digit_width;
        public int underline_position;
        public int underline_thickness;
        public int strikethrough_position;
        public int strikethrough_thickness;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int pango_font_metrics_get_approximate_char_width(long _self);
        int pango_font_metrics_get_approximate_digit_width(long _self);
        int pango_font_metrics_get_ascent(long _self);
        int pango_font_metrics_get_descent(long _self);
        int pango_font_metrics_get_height(long _self);
        int pango_font_metrics_get_strikethrough_position(long _self);
        int pango_font_metrics_get_strikethrough_thickness(long _self);
        int pango_font_metrics_get_underline_position(long _self);
        int pango_font_metrics_get_underline_thickness(long _self);
        long pango_font_metrics_ref(long _self);
        void pango_font_metrics_unref(long _self);
        long pango_font_metrics_get_type();
    }

}
