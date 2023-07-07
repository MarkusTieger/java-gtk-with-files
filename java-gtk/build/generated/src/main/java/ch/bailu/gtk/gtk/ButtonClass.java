/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ButtonClass.html">https://docs.gtk.org/gtk4/struct.ButtonClass.html</a></p>
*/
public class ButtonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ButtonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClicked {
        /**
         * 
         * @param button 
        */
        void onClicked(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Button button);
    }
    
    private static JnaButtonClass.OnClicked toOnClicked(ch.bailu.gtk.type.Pointer instance, String methodName, OnClicked in) {
        JnaButtonClass.OnClicked out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_button) -> in.onClicked(__callback, new Button(new PointerContainer(_button)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param button 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Button button);
    }
    
    private static JnaButtonClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaButtonClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_button) -> in.onActivate(__callback, new Button(new PointerContainer(_button)));
            __callback.register(out);
        }
        return out;
    }

    public ButtonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaButtonClass.Fields _fields;
    
    JnaButtonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaButtonClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnClicked#onClicked}
    */
    public static final String CLICKED = "clicked";

    /**
     * 
     * <br>See {@link OnClicked#onClicked}
    */
    public void setFieldClicked(OnClicked clicked) {
        toFields().clicked = toOnClicked(this, CLICKED, clicked);
        toFields().writeField(CLICKED);
    }

    /**
     * 
     * <br>See {@link OnClicked#onClicked}
    */
    public JnaButtonClass.OnClicked getFieldClicked() {
       toFields().readField(CLICKED);
       return toFields().clicked;
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
    public JnaButtonClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Button.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Button.getParentTypeID());
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
