/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellAreaClass {

    @FunctionalInterface
    public interface OnAdd extends com.sun.jna.Callback {
        void invoke(long area, long renderer);
    }

    @FunctionalInterface
    public interface OnRemove extends com.sun.jna.Callback {
        void invoke(long area, long renderer);
    }

    @FunctionalInterface
    public interface OnForeach extends com.sun.jna.Callback {
        void invoke(long area, com.sun.jna.Callback callback, long callback_data);
    }

    @FunctionalInterface
    public interface OnForeachAlloc extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, long cell_area, long background_area, com.sun.jna.Callback callback, long callback_data);
    }

    @FunctionalInterface
    public interface OnEvent extends com.sun.jna.Callback {
        int invoke(long area, long context, long widget, long event, long cell_area, int flags);
    }

    @FunctionalInterface
    public interface OnSnapshot extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, long snapshot, long background_area, long cell_area, int flags, boolean paint_focus);
    }

    @FunctionalInterface
    public interface OnApplyAttributes extends com.sun.jna.Callback {
        void invoke(long area, long tree_model, long iter, boolean is_expander, boolean is_expanded);
    }

    @FunctionalInterface
    public interface OnCreateContext extends com.sun.jna.Callback {
        long invoke(long area);
    }

    @FunctionalInterface
    public interface OnCopyContext extends com.sun.jna.Callback {
        long invoke(long area, long context);
    }

    @FunctionalInterface
    public interface OnGetRequestMode extends com.sun.jna.Callback {
        int invoke(long area);
    }

    @FunctionalInterface
    public interface OnGetPreferredWidth extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, long minimum_width, long natural_width);
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, int width, long minimum_height, long natural_height);
    }

    @FunctionalInterface
    public interface OnGetPreferredHeight extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, long minimum_height, long natural_height);
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight extends com.sun.jna.Callback {
        void invoke(long area, long context, long widget, int height, long minimum_width, long natural_width);
    }

    @FunctionalInterface
    public interface OnSetCellProperty extends com.sun.jna.Callback {
        void invoke(long area, long renderer, int property_id, long value, long pspec);
    }

    @FunctionalInterface
    public interface OnGetCellProperty extends com.sun.jna.Callback {
        void invoke(long area, long renderer, int property_id, long value, long pspec);
    }

    @FunctionalInterface
    public interface OnFocus extends com.sun.jna.Callback {
        boolean invoke(long area, int direction);
    }

    @FunctionalInterface
    public interface OnIsActivatable extends com.sun.jna.Callback {
        boolean invoke(long area);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        boolean invoke(long area, long context, long widget, long cell_area, int flags, boolean edit_only);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("CellAreaClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({CellAreaClass.PARENT_CLASS, CellAreaClass.ADD, CellAreaClass.REMOVE, CellAreaClass.FOREACH, CellAreaClass.FOREACH_ALLOC, CellAreaClass.EVENT, CellAreaClass.SNAPSHOT, CellAreaClass.APPLY_ATTRIBUTES, CellAreaClass.CREATE_CONTEXT, CellAreaClass.COPY_CONTEXT, CellAreaClass.GET_REQUEST_MODE, CellAreaClass.GET_PREFERRED_WIDTH, CellAreaClass.GET_PREFERRED_HEIGHT_FOR_WIDTH, CellAreaClass.GET_PREFERRED_HEIGHT, CellAreaClass.GET_PREFERRED_WIDTH_FOR_HEIGHT, CellAreaClass.SET_CELL_PROPERTY, CellAreaClass.GET_CELL_PROPERTY, CellAreaClass.FOCUS, CellAreaClass.IS_ACTIVATABLE, CellAreaClass.ACTIVATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.InitiallyUnownedClass.getInstanceSize()];
        public OnAdd add;
        public OnRemove remove;
        public OnForeach foreach;
        public OnForeachAlloc foreach_alloc;
        public OnEvent event;
        public OnSnapshot snapshot;
        public OnApplyAttributes apply_attributes;
        public OnCreateContext create_context;
        public OnCopyContext copy_context;
        public OnGetRequestMode get_request_mode;
        public OnGetPreferredWidth get_preferred_width;
        public OnGetPreferredHeightForWidth get_preferred_height_for_width;
        public OnGetPreferredHeight get_preferred_height;
        public OnGetPreferredWidthForHeight get_preferred_width_for_height;
        public OnSetCellProperty set_cell_property;
        public OnGetCellProperty get_cell_property;
        public OnFocus focus;
        public OnIsActivatable is_activatable;
        public OnActivate activate;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_area_class_find_cell_property(long _self, long property_name);
        long gtk_cell_area_class_find_cell_property(long _self, String property_name);
        void gtk_cell_area_class_install_cell_property(long _self, int property_id, long pspec);
    }

}
