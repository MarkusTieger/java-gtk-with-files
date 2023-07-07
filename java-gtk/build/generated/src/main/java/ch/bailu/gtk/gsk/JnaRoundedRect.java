/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaRoundedRect {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RoundedRect size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RoundedRect.BOUNDS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] bounds = new byte[ch.bailu.gtk.graphene.Rect.getInstanceSize()];
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gsk_rounded_rect_contains_point(long _self, long point);
        boolean gsk_rounded_rect_contains_rect(long _self, long rect);
        long gsk_rounded_rect_init(long _self, long bounds, long top_left, long top_right, long bottom_right, long bottom_left);
        long gsk_rounded_rect_init_copy(long _self, long src);
        long gsk_rounded_rect_init_from_rect(long _self, long bounds, float radius);
        boolean gsk_rounded_rect_intersects_rect(long _self, long rect);
        boolean gsk_rounded_rect_is_rectilinear(long _self);
        long gsk_rounded_rect_normalize(long _self);
        long gsk_rounded_rect_offset(long _self, float dx, float dy);
        long gsk_rounded_rect_shrink(long _self, float top, float right, float bottom, float left);
    }

}
