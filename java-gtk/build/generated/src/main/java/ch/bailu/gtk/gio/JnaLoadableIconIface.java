/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaLoadableIconIface {

    @FunctionalInterface
    public interface OnLoad extends com.sun.jna.Callback {
        long invoke(long icon, int size, long type, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLoadAsync extends com.sun.jna.Callback {
        void invoke(long icon, int size, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLoadFinish extends com.sun.jna.Callback {
        long invoke(long icon, long res, long type, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("LoadableIconIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({LoadableIconIface.G_IFACE, LoadableIconIface.LOAD, LoadableIconIface.LOAD_ASYNC, LoadableIconIface.LOAD_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnLoad load;
        public OnLoadAsync load_async;
        public OnLoadFinish load_finish;
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
