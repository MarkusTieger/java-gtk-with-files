/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaPixbufLoaderClass {

    @FunctionalInterface
    public interface OnSizePrepared extends com.sun.jna.Callback {
        void invoke(long loader, int width, int height);
    }

    @FunctionalInterface
    public interface OnAreaPrepared extends com.sun.jna.Callback {
        void invoke(long loader);
    }

    @FunctionalInterface
    public interface OnAreaUpdated extends com.sun.jna.Callback {
        void invoke(long loader, int x, int y, int width, int height);
    }

    @FunctionalInterface
    public interface OnClosed extends com.sun.jna.Callback {
        void invoke(long loader);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PixbufLoaderClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PixbufLoaderClass.PARENT_CLASS, PixbufLoaderClass.SIZE_PREPARED, PixbufLoaderClass.AREA_PREPARED, PixbufLoaderClass.AREA_UPDATED, PixbufLoaderClass.CLOSED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnSizePrepared size_prepared;
        public OnAreaPrepared area_prepared;
        public OnAreaUpdated area_updated;
        public OnClosed closed;
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
