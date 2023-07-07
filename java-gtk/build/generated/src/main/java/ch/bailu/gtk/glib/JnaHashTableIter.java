/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaHashTableIter {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("HashTableIter size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({HashTableIter.DUMMY1, HashTableIter.DUMMY2, HashTableIter.DUMMY3, HashTableIter.DUMMY4, HashTableIter.DUMMY5, HashTableIter.DUMMY6})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long dummy1;
        public long dummy2;
        public long dummy3;
        public int dummy4;
        public boolean dummy5;
        public long dummy6;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_hash_table_iter_get_hash_table(long _self);
        void g_hash_table_iter_init(long _self, long hash_table);
        void g_hash_table_iter_remove(long _self);
        void g_hash_table_iter_replace(long _self, long value);
        void g_hash_table_iter_steal(long _self);
    }

}
