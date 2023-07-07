/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaRGBA {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RGBA size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RGBA.RED, RGBA.GREEN, RGBA.BLUE, RGBA.ALPHA})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public float red;
        public float green;
        public float blue;
        public float alpha;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_rgba_copy(long _self);
        boolean gdk_rgba_equal(long _self, long p2);
        void gdk_rgba_free(long _self);
        int gdk_rgba_hash(long _self);
        boolean gdk_rgba_is_clear(long _self);
        boolean gdk_rgba_is_opaque(long _self);
        boolean gdk_rgba_parse(long _self, long spec);
        boolean gdk_rgba_parse(long _self, String spec);
        long gdk_rgba_to_string(long _self);
        long gdk_rgba_get_type();
    }

}
