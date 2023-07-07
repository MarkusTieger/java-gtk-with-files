/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaRWLock {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RWLock size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RWLock.P})
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
        void g_rw_lock_clear(long _self);
        void g_rw_lock_init(long _self);
        void g_rw_lock_reader_lock(long _self);
        boolean g_rw_lock_reader_trylock(long _self);
        void g_rw_lock_reader_unlock(long _self);
        void g_rw_lock_writer_lock(long _self);
        boolean g_rw_lock_writer_trylock(long _self);
        void g_rw_lock_writer_unlock(long _self);
    }

}
