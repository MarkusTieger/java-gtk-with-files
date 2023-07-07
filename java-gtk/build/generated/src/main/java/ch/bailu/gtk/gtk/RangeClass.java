/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.RangeClass.html">https://docs.gtk.org/gtk4/struct.RangeClass.html</a></p>
*/
public class RangeClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RangeClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * 
         * @param range 
        */
        void onValueChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Range range);
    }
    
    private static JnaRangeClass.OnValueChanged toOnValueChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueChanged in) {
        JnaRangeClass.OnValueChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_range) -> in.onValueChanged(__callback, new Range(new PointerContainer(_range)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAdjustBounds {
        /**
         * 
         * @param range 
         * @param new_value 
        */
        void onAdjustBounds(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Range range, double new_value);
    }
    
    private static JnaRangeClass.OnAdjustBounds toOnAdjustBounds(ch.bailu.gtk.type.Pointer instance, String methodName, OnAdjustBounds in) {
        JnaRangeClass.OnAdjustBounds out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_range, _new_value) -> in.onAdjustBounds(__callback, new Range(new PointerContainer(_range)), _new_value);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMoveSlider {
        /**
         * 
         * @param range 
         * @param scroll 
        */
        void onMoveSlider(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Range range, int scroll);
    }
    
    private static JnaRangeClass.OnMoveSlider toOnMoveSlider(ch.bailu.gtk.type.Pointer instance, String methodName, OnMoveSlider in) {
        JnaRangeClass.OnMoveSlider out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_range, _scroll) -> in.onMoveSlider(__callback, new Range(new PointerContainer(_range)), _scroll);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRangeBorder {
        /**
         * 
         * @param range 
         * @param border_ 
        */
        void onGetRangeBorder(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Range range, @Nonnull Border border_);
    }
    
    private static JnaRangeClass.OnGetRangeBorder toOnGetRangeBorder(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRangeBorder in) {
        JnaRangeClass.OnGetRangeBorder out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_range, _border_) -> in.onGetRangeBorder(__callback, new Range(new PointerContainer(_range)), new Border(new PointerContainer(_border_)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChangeValue {
        /**
         * 
         * @param range 
         * @param scroll 
         * @param new_value 
         * @return 
        */
        boolean onChangeValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Range range, int scroll, double new_value);
    }
    
    private static JnaRangeClass.OnChangeValue toOnChangeValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnChangeValue in) {
        JnaRangeClass.OnChangeValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_range, _scroll, _new_value) -> in.onChangeValue(__callback, new Range(new PointerContainer(_range)), _scroll, _new_value);
            __callback.register(out);
        }
        return out;
    }

    public RangeClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRangeClass.Fields _fields;
    
    JnaRangeClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRangeClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnValueChanged#onValueChanged}
    */
    public static final String VALUE_CHANGED = "value_changed";

    /**
     * 
     * <br>See {@link OnValueChanged#onValueChanged}
    */
    public void setFieldValueChanged(OnValueChanged value_changed) {
        toFields().value_changed = toOnValueChanged(this, VALUE_CHANGED, value_changed);
        toFields().writeField(VALUE_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnValueChanged#onValueChanged}
    */
    public JnaRangeClass.OnValueChanged getFieldValueChanged() {
       toFields().readField(VALUE_CHANGED);
       return toFields().value_changed;
    } 

    /**
     * 
     * <br>See {@link OnAdjustBounds#onAdjustBounds}
    */
    public static final String ADJUST_BOUNDS = "adjust_bounds";

    /**
     * 
     * <br>See {@link OnAdjustBounds#onAdjustBounds}
    */
    public void setFieldAdjustBounds(OnAdjustBounds adjust_bounds) {
        toFields().adjust_bounds = toOnAdjustBounds(this, ADJUST_BOUNDS, adjust_bounds);
        toFields().writeField(ADJUST_BOUNDS);
    }

    /**
     * 
     * <br>See {@link OnAdjustBounds#onAdjustBounds}
    */
    public JnaRangeClass.OnAdjustBounds getFieldAdjustBounds() {
       toFields().readField(ADJUST_BOUNDS);
       return toFields().adjust_bounds;
    } 

    /**
     * 
     * <br>See {@link OnMoveSlider#onMoveSlider}
    */
    public static final String MOVE_SLIDER = "move_slider";

    /**
     * 
     * <br>See {@link OnMoveSlider#onMoveSlider}
    */
    public void setFieldMoveSlider(OnMoveSlider move_slider) {
        toFields().move_slider = toOnMoveSlider(this, MOVE_SLIDER, move_slider);
        toFields().writeField(MOVE_SLIDER);
    }

    /**
     * 
     * <br>See {@link OnMoveSlider#onMoveSlider}
    */
    public JnaRangeClass.OnMoveSlider getFieldMoveSlider() {
       toFields().readField(MOVE_SLIDER);
       return toFields().move_slider;
    } 

    /**
     * 
     * <br>See {@link OnGetRangeBorder#onGetRangeBorder}
    */
    public static final String GET_RANGE_BORDER = "get_range_border";

    /**
     * 
     * <br>See {@link OnGetRangeBorder#onGetRangeBorder}
    */
    public void setFieldGetRangeBorder(OnGetRangeBorder get_range_border) {
        toFields().get_range_border = toOnGetRangeBorder(this, GET_RANGE_BORDER, get_range_border);
        toFields().writeField(GET_RANGE_BORDER);
    }

    /**
     * 
     * <br>See {@link OnGetRangeBorder#onGetRangeBorder}
    */
    public JnaRangeClass.OnGetRangeBorder getFieldGetRangeBorder() {
       toFields().readField(GET_RANGE_BORDER);
       return toFields().get_range_border;
    } 

    /**
     * 
     * <br>See {@link OnChangeValue#onChangeValue}
    */
    public static final String CHANGE_VALUE = "change_value";

    /**
     * 
     * <br>See {@link OnChangeValue#onChangeValue}
    */
    public void setFieldChangeValue(OnChangeValue change_value) {
        toFields().change_value = toOnChangeValue(this, CHANGE_VALUE, change_value);
        toFields().writeField(CHANGE_VALUE);
    }

    /**
     * 
     * <br>See {@link OnChangeValue#onChangeValue}
    */
    public JnaRangeClass.OnChangeValue getFieldChangeValue() {
       toFields().readField(CHANGE_VALUE);
       return toFields().change_value;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Range.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Range.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
