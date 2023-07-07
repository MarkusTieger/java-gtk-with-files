/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererClass {

    @FunctionalInterface
    public interface OnGetRequestMode extends com.sun.jna.Callback {
        int invoke(long cell);
    }

    @FunctionalInterface
    public interface OnGetPreferredWidth extends com.sun.jna.Callback {
        void invoke(long cell, long widget, long minimum_size, long natural_size);
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth extends com.sun.jna.Callback {
        void invoke(long cell, long widget, int width, long minimum_height, long natural_height);
    }

    @FunctionalInterface
    public interface OnGetPreferredHeight extends com.sun.jna.Callback {
        void invoke(long cell, long widget, long minimum_size, long natural_size);
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight extends com.sun.jna.Callback {
        void invoke(long cell, long widget, int height, long minimum_width, long natural_width);
    }

    @FunctionalInterface
    public interface OnGetAlignedArea extends com.sun.jna.Callback {
        void invoke(long cell, long widget, int flags, long cell_area, long aligned_area);
    }

    @FunctionalInterface
    public interface OnSnapshot extends com.sun.jna.Callback {
        void invoke(long cell, long snapshot, long widget, long background_area, long cell_area, int flags);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        boolean invoke(long cell, long event, long widget, long path, long background_area, long cell_area, int flags);
    }

    @FunctionalInterface
    public interface OnStartEditing extends com.sun.jna.Callback {
        long invoke(long cell, long event, long widget, long path, long background_area, long cell_area, int flags);
    }

    @FunctionalInterface
    public interface OnEditingCanceled extends com.sun.jna.Callback {
        void invoke(long cell);
    }

    @FunctionalInterface
    public interface OnEditingStarted extends com.sun.jna.Callback {
        void invoke(long cell, long editable, long path);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CellRendererClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CellRendererClass.PARENT_CLASS, CellRendererClass.GET_REQUEST_MODE, CellRendererClass.GET_PREFERRED_WIDTH, CellRendererClass.GET_PREFERRED_HEIGHT_FOR_WIDTH, CellRendererClass.GET_PREFERRED_HEIGHT, CellRendererClass.GET_PREFERRED_WIDTH_FOR_HEIGHT, CellRendererClass.GET_ALIGNED_AREA, CellRendererClass.SNAPSHOT, CellRendererClass.ACTIVATE, CellRendererClass.START_EDITING, CellRendererClass.EDITING_CANCELED, CellRendererClass.EDITING_STARTED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.InitiallyUnownedClass.getInstanceSize()];
        public OnGetRequestMode get_request_mode;
        public OnGetPreferredWidth get_preferred_width;
        public OnGetPreferredHeightForWidth get_preferred_height_for_width;
        public OnGetPreferredHeight get_preferred_height;
        public OnGetPreferredWidthForHeight get_preferred_width_for_height;
        public OnGetAlignedArea get_aligned_area;
        public OnSnapshot snapshot;
        public OnActivate activate;
        public OnStartEditing start_editing;
        public OnEditingCanceled editing_canceled;
        public OnEditingStarted editing_started;
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
