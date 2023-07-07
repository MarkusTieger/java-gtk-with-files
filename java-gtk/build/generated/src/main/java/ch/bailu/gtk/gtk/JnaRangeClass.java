/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRangeClass {

    @FunctionalInterface
    public interface OnValueChanged extends com.sun.jna.Callback {
        void invoke(long range);
    }

    @FunctionalInterface
    public interface OnAdjustBounds extends com.sun.jna.Callback {
        void invoke(long range, double new_value);
    }

    @FunctionalInterface
    public interface OnMoveSlider extends com.sun.jna.Callback {
        void invoke(long range, int scroll);
    }

    @FunctionalInterface
    public interface OnGetRangeBorder extends com.sun.jna.Callback {
        void invoke(long range, long border_);
    }

    @FunctionalInterface
    public interface OnChangeValue extends com.sun.jna.Callback {
        boolean invoke(long range, int scroll, double new_value);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RangeClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RangeClass.PARENT_CLASS, RangeClass.VALUE_CHANGED, RangeClass.ADJUST_BOUNDS, RangeClass.MOVE_SLIDER, RangeClass.GET_RANGE_BORDER, RangeClass.CHANGE_VALUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WidgetClass.getInstanceSize()];
        public OnValueChanged value_changed;
        public OnAdjustBounds adjust_bounds;
        public OnMoveSlider move_slider;
        public OnGetRangeBorder get_range_border;
        public OnChangeValue change_value;
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
