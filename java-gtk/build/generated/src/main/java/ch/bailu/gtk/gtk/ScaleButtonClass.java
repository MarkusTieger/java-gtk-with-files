/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ScaleButtonClass.html">https://docs.gtk.org/gtk4/struct.ScaleButtonClass.html</a></p>
*/
public class ScaleButtonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScaleButtonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * 
         * @param button 
         * @param value 
        */
        void onValueChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ScaleButton button, double value);
    }
    
    private static JnaScaleButtonClass.OnValueChanged toOnValueChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueChanged in) {
        JnaScaleButtonClass.OnValueChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_button, _value) -> in.onValueChanged(__callback, new ScaleButton(new PointerContainer(_button)), _value);
            __callback.register(out);
        }
        return out;
    }

    public ScaleButtonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaScaleButtonClass.Fields _fields;
    
    JnaScaleButtonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaScaleButtonClass.Fields(asCPointer());
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
    public JnaScaleButtonClass.OnValueChanged getFieldValueChanged() {
       toFields().readField(VALUE_CHANGED);
       return toFields().value_changed;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ScaleButton.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ScaleButton.getParentTypeID());
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
