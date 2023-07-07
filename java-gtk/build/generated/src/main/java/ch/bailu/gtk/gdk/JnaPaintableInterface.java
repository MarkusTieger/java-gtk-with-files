/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaPaintableInterface {

    @FunctionalInterface
    public interface OnSnapshot extends com.sun.jna.Callback {
        void invoke(long paintable, long snapshot, double width, double height);
    }

    @FunctionalInterface
    public interface OnGetCurrentImage extends com.sun.jna.Callback {
        long invoke(long paintable);
    }

    @FunctionalInterface
    public interface OnGetFlags extends com.sun.jna.Callback {
        int invoke(long paintable);
    }

    @FunctionalInterface
    public interface OnGetIntrinsicWidth extends com.sun.jna.Callback {
        int invoke(long paintable);
    }

    @FunctionalInterface
    public interface OnGetIntrinsicHeight extends com.sun.jna.Callback {
        int invoke(long paintable);
    }

    @FunctionalInterface
    public interface OnGetIntrinsicAspectRatio extends com.sun.jna.Callback {
        double invoke(long paintable);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PaintableInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PaintableInterface.G_IFACE, PaintableInterface.SNAPSHOT, PaintableInterface.GET_CURRENT_IMAGE, PaintableInterface.GET_FLAGS, PaintableInterface.GET_INTRINSIC_WIDTH, PaintableInterface.GET_INTRINSIC_HEIGHT, PaintableInterface.GET_INTRINSIC_ASPECT_RATIO})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnSnapshot snapshot;
        public OnGetCurrentImage get_current_image;
        public OnGetFlags get_flags;
        public OnGetIntrinsicWidth get_intrinsic_width;
        public OnGetIntrinsicHeight get_intrinsic_height;
        public OnGetIntrinsicAspectRatio get_intrinsic_aspect_ratio;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
