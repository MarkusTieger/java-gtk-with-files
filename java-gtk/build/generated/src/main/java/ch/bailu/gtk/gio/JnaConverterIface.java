/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaConverterIface {

    @FunctionalInterface
    public interface OnConvert extends com.sun.jna.Callback {
        int invoke(long converter, long inbuf, long inbuf_size, long outbuf, long outbuf_size, int flags, long bytes_read, long bytes_written, long _error);
    }

    @FunctionalInterface
    public interface OnReset extends com.sun.jna.Callback {
        void invoke(long converter);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ConverterIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ConverterIface.G_IFACE, ConverterIface.CONVERT, ConverterIface.RESET})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnConvert convert;
        public OnReset reset;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
