/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.PopoverClass.html">https://docs.gtk.org/gtk4/struct.PopoverClass.html</a></p>
*/
public class PopoverClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PopoverClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * 
         * @param popover 
        */
        void onClosed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Popover popover);
    }
    
    private static JnaPopoverClass.OnClosed toOnClosed(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosed in) {
        JnaPopoverClass.OnClosed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_popover) -> in.onClosed(__callback, new Popover(new PointerContainer(_popover)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivateDefault {
        /**
         * 
         * @param popover 
        */
        void onActivateDefault(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Popover popover);
    }
    
    private static JnaPopoverClass.OnActivateDefault toOnActivateDefault(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivateDefault in) {
        JnaPopoverClass.OnActivateDefault out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_popover) -> in.onActivateDefault(__callback, new Popover(new PointerContainer(_popover)));
            __callback.register(out);
        }
        return out;
    }

    public PopoverClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPopoverClass.Fields _fields;
    
    JnaPopoverClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPopoverClass.Fields(asCPointer());
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
     * <br>See {@link OnClosed#onClosed}
    */
    public static final String CLOSED = "closed";

    /**
     * 
     * <br>See {@link OnClosed#onClosed}
    */
    public void setFieldClosed(OnClosed closed) {
        toFields().closed = toOnClosed(this, CLOSED, closed);
        toFields().writeField(CLOSED);
    }

    /**
     * 
     * <br>See {@link OnClosed#onClosed}
    */
    public JnaPopoverClass.OnClosed getFieldClosed() {
       toFields().readField(CLOSED);
       return toFields().closed;
    } 

    /**
     * 
     * <br>See {@link OnActivateDefault#onActivateDefault}
    */
    public static final String ACTIVATE_DEFAULT = "activate_default";

    /**
     * 
     * <br>See {@link OnActivateDefault#onActivateDefault}
    */
    public void setFieldActivateDefault(OnActivateDefault activate_default) {
        toFields().activate_default = toOnActivateDefault(this, ACTIVATE_DEFAULT, activate_default);
        toFields().writeField(ACTIVATE_DEFAULT);
    }

    /**
     * 
     * <br>See {@link OnActivateDefault#onActivateDefault}
    */
    public JnaPopoverClass.OnActivateDefault getFieldActivateDefault() {
       toFields().readField(ACTIVATE_DEFAULT);
       return toFields().activate_default;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Popover.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Popover.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:reserved:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
