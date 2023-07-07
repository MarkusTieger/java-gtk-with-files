/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeIter {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeIter size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeIter.STAMP, TreeIter.USER_DATA, TreeIter.USER_DATA2, TreeIter.USER_DATA3})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int stamp;
        public long user_data;
        public long user_data2;
        public long user_data3;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_iter_copy(long _self);
        void gtk_tree_iter_free(long _self);
        long gtk_tree_iter_get_type();
    }

}
