/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CheckButtonClass.html">https://docs.gtk.org/gtk4/struct.CheckButtonClass.html</a></p>
*/
public class CheckButtonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CheckButtonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToggled {
        /**
         * 
         * @param check_button 
        */
        void onToggled(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CheckButton check_button);
    }
    
    private static JnaCheckButtonClass.OnToggled toOnToggled(ch.bailu.gtk.type.Pointer instance, String methodName, OnToggled in) {
        JnaCheckButtonClass.OnToggled out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_check_button) -> in.onToggled(__callback, new CheckButton(new PointerContainer(_check_button)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param check_button 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CheckButton check_button);
    }
    
    private static JnaCheckButtonClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaCheckButtonClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_check_button) -> in.onActivate(__callback, new CheckButton(new PointerContainer(_check_button)));
            __callback.register(out);
        }
        return out;
    }

    public CheckButtonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCheckButtonClass.Fields _fields;
    
    JnaCheckButtonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCheckButtonClass.Fields(asCPointer());
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
    public JnaCheckButtonClass.OnToggled getFieldToggled() {
       toFields().readField(TOGGLED);
       return toFields().toggled;
    } 

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaCheckButtonClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CheckButton.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CheckButton.getParentTypeID());
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
