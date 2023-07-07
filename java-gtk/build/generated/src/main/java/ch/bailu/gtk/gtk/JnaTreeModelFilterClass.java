/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeModelFilterClass {

    @FunctionalInterface
    public interface OnVisible extends com.sun.jna.Callback {
        boolean invoke(long self, long child_model, long iter);
    }

    @FunctionalInterface
    public interface OnModify extends com.sun.jna.Callback {
        void invoke(long self, long child_model, long iter, long value, int column);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeModelFilterClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeModelFilterClass.PARENT_CLASS, TreeModelFilterClass.VISIBLE, TreeModelFilterClass.MODIFY})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnVisible visible;
        public OnModify modify;
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
