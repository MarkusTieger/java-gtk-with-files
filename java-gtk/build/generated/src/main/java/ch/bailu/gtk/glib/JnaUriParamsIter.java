/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaUriParamsIter {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("UriParamsIter size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({UriParamsIter.DUMMY0, UriParamsIter.DUMMY1, UriParamsIter.DUMMY2})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int dummy0;
        public long dummy1;
        public long dummy2;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_uri_params_iter_init(long _self, long params, long length, long separators, int flags);
        void g_uri_params_iter_init(long _self, String params, long length, String separators, int flags);
    }

}
