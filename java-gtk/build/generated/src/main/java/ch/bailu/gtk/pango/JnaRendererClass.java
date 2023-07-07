/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaRendererClass {

    @FunctionalInterface
    public interface OnDrawGlyphs extends com.sun.jna.Callback {
        void invoke(long renderer, long font, long glyphs, int x, int y);
    }

    @FunctionalInterface
    public interface OnDrawRectangle extends com.sun.jna.Callback {
        void invoke(long renderer, int part, int x, int y, int width, int height);
    }

    @FunctionalInterface
    public interface OnDrawErrorUnderline extends com.sun.jna.Callback {
        void invoke(long renderer, int x, int y, int width, int height);
    }

    @FunctionalInterface
    public interface OnDrawShape extends com.sun.jna.Callback {
        void invoke(long renderer, long attr, int x, int y);
    }

    @FunctionalInterface
    public interface OnDrawTrapezoid extends com.sun.jna.Callback {
        void invoke(long renderer, int part, double y1_, double x11, double x21, double y2, double x12, double x22);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RendererClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RendererClass.PARENT_CLASS, RendererClass.DRAW_GLYPHS, RendererClass.DRAW_RECTANGLE, RendererClass.DRAW_ERROR_UNDERLINE, RendererClass.DRAW_SHAPE, RendererClass.DRAW_TRAPEZOID})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnDrawGlyphs draw_glyphs;
        public OnDrawRectangle draw_rectangle;
        public OnDrawErrorUnderline draw_error_underline;
        public OnDrawShape draw_shape;
        public OnDrawTrapezoid draw_trapezoid;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
