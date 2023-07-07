/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaMatrix {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Matrix size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Matrix.XX, Matrix.XY, Matrix.YX, Matrix.YY, Matrix.X0, Matrix.Y0})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public double xx;
        public double xy;
        public double yx;
        public double yy;
        public double x0;
        public double y0;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void pango_matrix_concat(long _self, long new_matrix);
        long pango_matrix_copy(long _self);
        void pango_matrix_free(long _self);
        double pango_matrix_get_font_scale_factor(long _self);
        double pango_matrix_get_slant_ratio(long _self);
        void pango_matrix_rotate(long _self, double degrees);
        void pango_matrix_scale(long _self, double scale_x, double scale_y);
        void pango_matrix_transform_pixel_rectangle(long _self, long rect);
        void pango_matrix_transform_rectangle(long _self, long rect);
        void pango_matrix_translate(long _self, double tx, double ty);
        long pango_matrix_get_type();
    }

}
