/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuilderScopeInterface {

    @FunctionalInterface
    public interface OnGetTypeFromName extends com.sun.jna.Callback {
        long invoke(long self, long builder, long type_name);
    }

    @FunctionalInterface
    public interface OnGetTypeFromFunction extends com.sun.jna.Callback {
        long invoke(long self, long builder, long function_name);
    }

    @FunctionalInterface
    public interface OnCreateClosure extends com.sun.jna.Callback {
        long invoke(long self, long builder, long function_name, int flags, long object, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("BuilderScopeInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({BuilderScopeInterface.G_IFACE, BuilderScopeInterface.GET_TYPE_FROM_NAME, BuilderScopeInterface.GET_TYPE_FROM_FUNCTION, BuilderScopeInterface.CREATE_CLOSURE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetTypeFromName get_type_from_name;
        public OnGetTypeFromFunction get_type_from_function;
        public OnCreateClosure create_closure;
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
