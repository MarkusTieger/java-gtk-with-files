/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLayoutManagerClass {

    @FunctionalInterface
    public interface OnGetRequestMode extends com.sun.jna.Callback {
        int invoke(long manager, long widget);
    }

    @FunctionalInterface
    public interface OnMeasure extends com.sun.jna.Callback {
        void invoke(long manager, long widget, int orientation, int for_size, long minimum, long natural, long minimum_baseline, long natural_baseline);
    }

    @FunctionalInterface
    public interface OnAllocate extends com.sun.jna.Callback {
        void invoke(long manager, long widget, int width, int height, int baseline);
    }

    @FunctionalInterface
    public interface OnCreateLayoutChild extends com.sun.jna.Callback {
        long invoke(long manager, long widget, long for_child);
    }

    @FunctionalInterface
    public interface OnRoot extends com.sun.jna.Callback {
        void invoke(long manager);
    }

    @FunctionalInterface
    public interface OnUnroot extends com.sun.jna.Callback {
        void invoke(long manager);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("LayoutManagerClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({LayoutManagerClass.PARENT_CLASS, LayoutManagerClass.GET_REQUEST_MODE, LayoutManagerClass.MEASURE, LayoutManagerClass.ALLOCATE, LayoutManagerClass.LAYOUT_CHILD_TYPE, LayoutManagerClass.CREATE_LAYOUT_CHILD, LayoutManagerClass.ROOT, LayoutManagerClass.UNROOT})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetRequestMode get_request_mode;
        public OnMeasure measure;
        public OnAllocate allocate;
        public long layout_child_type;
        public OnCreateLayoutChild create_layout_child;
        public OnRoot root;
        public OnUnroot unroot;
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
