/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaRect {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Rect size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Rect.ORIGIN, Rect.SIZE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] origin = new byte[Point.getInstanceSize()];
        public byte[] size = new byte[Size.getInstanceSize()];
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean graphene_rect_contains_point(long _self, long p);
        boolean graphene_rect_contains_rect(long _self, long b);
        boolean graphene_rect_equal(long _self, long b);
        void graphene_rect_expand(long _self, long p, long res);
        void graphene_rect_free(long _self);
        float graphene_rect_get_area(long _self);
        void graphene_rect_get_bottom_left(long _self, long p);
        void graphene_rect_get_bottom_right(long _self, long p);
        void graphene_rect_get_center(long _self, long p);
        float graphene_rect_get_height(long _self);
        void graphene_rect_get_top_left(long _self, long p);
        void graphene_rect_get_top_right(long _self, long p);
        float graphene_rect_get_width(long _self);
        float graphene_rect_get_x(long _self);
        float graphene_rect_get_y(long _self);
        long graphene_rect_init(long _self, float x, float y, float width, float height);
        long graphene_rect_init_from_rect(long _self, long src);
        long graphene_rect_inset(long _self, float d_x, float d_y);
        void graphene_rect_inset_r(long _self, float d_x, float d_y, long res);
        void graphene_rect_interpolate(long _self, long b, double factor, long res);
        boolean graphene_rect_intersection(long _self, long b, long res);
        long graphene_rect_normalize(long _self);
        void graphene_rect_normalize_r(long _self, long res);
        long graphene_rect_offset(long _self, float d_x, float d_y);
        void graphene_rect_offset_r(long _self, float d_x, float d_y, long res);
        void graphene_rect_round_extents(long _self, long res);
        void graphene_rect_scale(long _self, float s_h, float s_v, long res);
        void graphene_rect_union(long _self, long b, long res);
        long graphene_rect_alloc();
        long graphene_rect_zero();
        long graphene_rect_get_type();
    }

}
