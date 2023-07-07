/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufAnimationClass {

    @FunctionalInterface
    public interface OnIsStaticImage extends com.sun.jna.Callback {
        boolean invoke(long animation);
    }

    @FunctionalInterface
    public interface OnGetStaticImage extends com.sun.jna.Callback {
        long invoke(long animation);
    }

    @FunctionalInterface
    public interface OnGetSize extends com.sun.jna.Callback {
        void invoke(long animation, long width, long height);
    }

    @FunctionalInterface
    public interface OnGetIter extends com.sun.jna.Callback {
        long invoke(long animation, long start_time);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PixbufAnimationClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PixbufAnimationClass.PARENT_CLASS, PixbufAnimationClass.IS_STATIC_IMAGE, PixbufAnimationClass.GET_STATIC_IMAGE, PixbufAnimationClass.GET_SIZE, PixbufAnimationClass.GET_ITER})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnIsStaticImage is_static_image;
        public OnGetStaticImage get_static_image;
        public OnGetSize get_size;
        public OnGetIter get_iter;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
