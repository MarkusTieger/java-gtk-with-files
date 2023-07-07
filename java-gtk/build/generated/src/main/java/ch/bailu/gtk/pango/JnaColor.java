/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaColor {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Color size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Color.RED, Color.GREEN, Color.BLUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int red;
        public int green;
        public int blue;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_color_copy(long _self);
        void pango_color_free(long _self);
        boolean pango_color_parse(long _self, long spec);
        boolean pango_color_parse(long _self, String spec);
        long pango_color_to_string(long _self);
        long pango_color_get_type();
    }

}
