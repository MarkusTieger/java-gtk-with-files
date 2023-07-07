/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufAnimationIterClass {

    @FunctionalInterface
    public interface OnGetDelayTime extends com.sun.jna.Callback {
        int invoke(long iter);
    }

    @FunctionalInterface
    public interface OnGetPixbuf extends com.sun.jna.Callback {
        long invoke(long iter);
    }

    @FunctionalInterface
    public interface OnOnCurrentlyLoadingFrame extends com.sun.jna.Callback {
        boolean invoke(long iter);
    }

    @FunctionalInterface
    public interface OnAdvance extends com.sun.jna.Callback {
        boolean invoke(long iter, long current_time);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PixbufAnimationIterClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PixbufAnimationIterClass.PARENT_CLASS, PixbufAnimationIterClass.GET_DELAY_TIME, PixbufAnimationIterClass.GET_PIXBUF, PixbufAnimationIterClass.ON_CURRENTLY_LOADING_FRAME, PixbufAnimationIterClass.ADVANCE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetDelayTime get_delay_time;
        public OnGetPixbuf get_pixbuf;
        public OnOnCurrentlyLoadingFrame on_currently_loading_frame;
        public OnAdvance advance;
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
