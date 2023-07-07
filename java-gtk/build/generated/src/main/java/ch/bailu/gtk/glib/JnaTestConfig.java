/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTestConfig {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TestConfig size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TestConfig.TEST_INITIALIZED, TestConfig.TEST_QUICK, TestConfig.TEST_PERF, TestConfig.TEST_VERBOSE, TestConfig.TEST_QUIET, TestConfig.TEST_UNDEFINED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public boolean test_initialized;
        public boolean test_quick;
        public boolean test_perf;
        public boolean test_verbose;
        public boolean test_quiet;
        public boolean test_undefined;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
