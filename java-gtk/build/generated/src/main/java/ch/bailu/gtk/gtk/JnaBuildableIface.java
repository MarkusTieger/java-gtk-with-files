/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuildableIface {

    @FunctionalInterface
    public interface OnSetId extends com.sun.jna.Callback {
        void invoke(long buildable, long id);
    }

    @FunctionalInterface
    public interface OnGetId extends com.sun.jna.Callback {
        long invoke(long buildable);
    }

    @FunctionalInterface
    public interface OnAddChild extends com.sun.jna.Callback {
        void invoke(long buildable, long builder, long child, long type);
    }

    @FunctionalInterface
    public interface OnSetBuildableProperty extends com.sun.jna.Callback {
        void invoke(long buildable, long builder, long name, long value);
    }

    @FunctionalInterface
    public interface OnConstructChild extends com.sun.jna.Callback {
        long invoke(long buildable, long builder, long name);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("BuildableIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({BuildableIface.G_IFACE, BuildableIface.SET_ID, BuildableIface.GET_ID, BuildableIface.ADD_CHILD, BuildableIface.SET_BUILDABLE_PROPERTY, BuildableIface.CONSTRUCT_CHILD})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnSetId set_id;
        public OnGetId get_id;
        public OnAddChild add_child;
        public OnSetBuildableProperty set_buildable_property;
        public OnConstructChild construct_child;
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
