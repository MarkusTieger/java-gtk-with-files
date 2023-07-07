/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ToggleButtonClass.html">https://docs.gtk.org/gtk4/struct.ToggleButtonClass.html</a></p>
*/
public class ToggleButtonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ToggleButtonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToggled {
        /**
         * 
         * @param toggle_button a `GtkToggleButton`.
        */
        void onToggled(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ToggleButton toggle_button);
    }
    
    private static JnaToggleButtonClass.OnToggled toOnToggled(ch.bailu.gtk.type.Pointer instance, String methodName, OnToggled in) {
        JnaToggleButtonClass.OnToggled out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_toggle_button) -> in.onToggled(__callback, new ToggleButton(new PointerContainer(_toggle_button)));
            __callback.register(out);
        }
        return out;
    }

    public ToggleButtonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaToggleButtonClass.Fields _fields;
    
    JnaToggleButtonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaToggleButtonClass.Fields(asCPointer());
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
     * <br>See {@link OnToggled#onToggled}
    */
    public static final String TOGGLED = "toggled";

    /**
     * 
     * <br>See {@link OnToggled#onToggled}
    */
    public void setFieldToggled(OnToggled toggled) {
        toFields().toggled = toOnToggled(this, TOGGLED, toggled);
        toFields().writeField(TOGGLED);
    }

    /**
     * 
     * <br>See {@link OnToggled#onToggled}
    */
    public JnaToggleButtonClass.OnToggled getFieldToggled() {
       toFields().readField(TOGGLED);
       return toFields().toggled;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ToggleButton.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ToggleButton.getParentTypeID());
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
