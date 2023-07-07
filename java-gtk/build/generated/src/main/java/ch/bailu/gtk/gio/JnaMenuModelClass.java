/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMenuModelClass {

    @FunctionalInterface
    public interface OnIsMutable extends com.sun.jna.Callback {
        boolean invoke(long model);
    }

    @FunctionalInterface
    public interface OnGetNItems extends com.sun.jna.Callback {
        int invoke(long model);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("MenuModelClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({MenuModelClass.PARENT_CLASS, MenuModelClass.IS_MUTABLE, MenuModelClass.GET_N_ITEMS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnIsMutable is_mutable;
        public OnGetNItems get_n_items;
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
