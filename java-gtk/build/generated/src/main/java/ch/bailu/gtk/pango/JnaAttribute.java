/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaAttribute {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Attribute size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Attribute.KLASS, Attribute.START_INDEX, Attribute.END_INDEX})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long klass;
        public int start_index;
        public int end_index;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_attribute_as_color(long _self);
        long pango_attribute_as_float(long _self);
        long pango_attribute_as_font_desc(long _self);
        long pango_attribute_as_font_features(long _self);
        long pango_attribute_as_int(long _self);
        long pango_attribute_as_language(long _self);
        long pango_attribute_as_shape(long _self);
        long pango_attribute_as_size(long _self);
        long pango_attribute_as_string(long _self);
        long pango_attribute_copy(long _self);
        void pango_attribute_destroy(long _self);
        boolean pango_attribute_equal(long _self, long attr2);
        void pango_attribute_init(long _self, long klass);
        long pango_attribute_get_type();
    }

}
