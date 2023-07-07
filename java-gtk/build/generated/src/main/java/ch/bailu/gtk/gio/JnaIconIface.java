/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIconIface {

    @FunctionalInterface
    public interface OnHash extends com.sun.jna.Callback {
        int invoke(long icon);
    }

    @FunctionalInterface
    public interface OnEqual extends com.sun.jna.Callback {
        boolean invoke(long icon1, long icon2);
    }

    @FunctionalInterface
    public interface OnToTokens extends com.sun.jna.Callback {
        boolean invoke(long icon, long tokens, long out_version);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("IconIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({IconIface.G_IFACE, IconIface.HASH, IconIface.EQUAL, IconIface.TO_TOKENS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnHash hash;
        public OnEqual equal;
        public OnToTokens to_tokens;
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
