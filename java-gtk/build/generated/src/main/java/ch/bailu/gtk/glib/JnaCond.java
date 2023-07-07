/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaCond {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Cond size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Cond.P})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long p;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_cond_broadcast(long _self);
        void g_cond_clear(long _self);
        void g_cond_init(long _self);
        void g_cond_signal(long _self);
        void g_cond_wait(long _self, long mutex);
        boolean g_cond_wait_until(long _self, long mutex, long end_time);
    }

}