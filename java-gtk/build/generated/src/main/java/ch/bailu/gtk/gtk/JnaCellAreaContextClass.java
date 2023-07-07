/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellAreaContextClass {

    @FunctionalInterface
    public interface OnAllocate extends com.sun.jna.Callback {
        void invoke(long context, int width, int height);
    }

    @FunctionalInterface
    public interface OnReset extends com.sun.jna.Callback {
        void invoke(long context);
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth extends com.sun.jna.Callback {
        void invoke(long context, int width, long minimum_height, long natural_height);
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight extends com.sun.jna.Callback {
        void invoke(long context, int height, long minimum_width, long natural_width);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CellAreaContextClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CellAreaContextClass.PARENT_CLASS, CellAreaContextClass.ALLOCATE, CellAreaContextClass.RESET, CellAreaContextClass.GET_PREFERRED_HEIGHT_FOR_WIDTH, CellAreaContextClass.GET_PREFERRED_WIDTH_FOR_HEIGHT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnAllocate allocate;
        public OnReset reset;
        public OnGetPreferredHeightForWidth get_preferred_height_for_width;
        public OnGetPreferredWidthForHeight get_preferred_width_for_height;
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
