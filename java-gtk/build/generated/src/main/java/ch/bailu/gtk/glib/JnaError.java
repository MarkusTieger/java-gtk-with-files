/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaError {

    @FunctionalInterface
    public interface OnErrorInitFunc extends com.sun.jna.Callback {
        void invoke(long error);
    }

    @FunctionalInterface
    public interface OnErrorCopyFunc extends com.sun.jna.Callback {
        void invoke(long src_error, long dest_error);
    }

    @FunctionalInterface
    public interface OnErrorClearFunc extends com.sun.jna.Callback {
        void invoke(long error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Error size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Error.DOMAIN, Error.CODE, Error.MESSAGE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int domain;
        public int code;
        public long message;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_error_new(int domain, int code, long format, java.lang.Object... _elipse);
        long g_error_new(int domain, int code, String format, java.lang.Object... _elipse);
        long g_error_new_literal(int domain, int code, long message);
        long g_error_new_literal(int domain, int code, String message);
        long g_error_copy(long _self);
        void g_error_free(long _self);
        boolean g_error_matches(long _self, int domain, int code);
        int g_error_domain_register(long error_type_name, long error_type_private_size, com.sun.jna.Callback error_type_init, com.sun.jna.Callback error_type_copy, com.sun.jna.Callback error_type_clear);
        int g_error_domain_register_static(long error_type_name, long error_type_private_size, com.sun.jna.Callback error_type_init, com.sun.jna.Callback error_type_copy, com.sun.jna.Callback error_type_clear);
        long g_error_get_type();
    }

}
