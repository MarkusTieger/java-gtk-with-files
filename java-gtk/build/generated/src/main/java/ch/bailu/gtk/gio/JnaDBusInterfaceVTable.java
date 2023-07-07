/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterfaceVTable {

    @FunctionalInterface
    public interface OnDBusInterfaceMethodCallFunc extends com.sun.jna.Callback {
        void invoke(long connection, long sender, long object_path, long interface_name, long method_name, long parameters, long invocation, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusInterfaceVTable size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusInterfaceVTable.METHOD_CALL})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnDBusInterfaceMethodCallFunc method_call;
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
