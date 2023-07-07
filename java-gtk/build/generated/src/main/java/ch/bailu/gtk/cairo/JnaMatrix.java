/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaMatrix {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Matrix size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Matrix.XX, Matrix.YX, Matrix.XY, Matrix.YY, Matrix.X0, Matrix.Y0})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public double xx;
        public double yx;
        public double xy;
        public double yy;
        public double x0;
        public double y0;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void cairo_matrix_init_identity(long _self);
        void cairo_matrix_translate(long _self, double tx, double ty);
        void cairo_matrix_scale(long _self, double sx, double sy);
        void cairo_matrix_rotate(long _self, double radians);
        void cairo_matrix_invert(long _self);
        void cairo_matrix_multiply(long _self, long a, long b);
        void cairo_matrix_init(long _self, double xx, double yx, double xy, double yy, double x0, double y0);
    }

}
