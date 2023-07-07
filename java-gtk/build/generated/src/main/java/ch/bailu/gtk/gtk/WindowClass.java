/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.WindowClass.html">https://docs.gtk.org/gtk4/struct.WindowClass.html</a></p>
*/
public class WindowClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateFocus {
        /**
         * 
         * @param window 
        */
        void onActivateFocus(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Window window);
    }
    
    private static JnaWindowClass.OnActivateFocus toOnActivateFocus(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivateFocus in) {
        JnaWindowClass.OnActivateFocus out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_window) -> in.onActivateFocus(__callback, new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivateDefault {
        /**
         * 
         * @param window 
        */
        void onActivateDefault(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Window window);
    }
    
    private static JnaWindowClass.OnActivateDefault toOnActivateDefault(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivateDefault in) {
        JnaWindowClass.OnActivateDefault out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_window) -> in.onActivateDefault(__callback, new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnKeysChanged {
        /**
         * 
         * @param window 
        */
        void onKeysChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Window window);
    }
    
    private static JnaWindowClass.OnKeysChanged toOnKeysChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnKeysChanged in) {
        JnaWindowClass.OnKeysChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_window) -> in.onKeysChanged(__callback, new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEnableDebugging {
        /**
         * 
         * @param window 
         * @param toggle 
         * @return 
        */
        boolean onEnableDebugging(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Window window, boolean toggle);
    }
    
    private static JnaWindowClass.OnEnableDebugging toOnEnableDebugging(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnableDebugging in) {
        JnaWindowClass.OnEnableDebugging out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_window, _toggle) -> in.onEnableDebugging(__callback, new Window(new PointerContainer(_window)), _toggle);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseRequest {
        /**
         * 
         * @param window 
         * @return 
        */
        boolean onCloseRequest(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Window window);
    }
    
    private static JnaWindowClass.OnCloseRequest toOnCloseRequest(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseRequest in) {
        JnaWindowClass.OnCloseRequest out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_window) -> in.onCloseRequest(__callback, new Window(new PointerContainer(_window)));
            __callback.register(out);
        }
        return out;
    }

    public WindowClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaWindowClass.Fields _fields;
    
    JnaWindowClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaWindowClass.Fields(asCPointer());
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
     * <br>See {@link OnActivateFocus#onActivateFocus}
    */
    public static final String ACTIVATE_FOCUS = "activate_focus";

    /**
     * 
     * <br>See {@link OnActivateFocus#onActivateFocus}
    */
    public void setFieldActivateFocus(OnActivateFocus activate_focus) {
        toFields().activate_focus = toOnActivateFocus(this, ACTIVATE_FOCUS, activate_focus);
        toFields().writeField(ACTIVATE_FOCUS);
    }

    /**
     * 
     * <br>See {@link OnActivateFocus#onActivateFocus}
    */
    public JnaWindowClass.OnActivateFocus getFieldActivateFocus() {
       toFields().readField(ACTIVATE_FOCUS);
       return toFields().activate_focus;
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
    public JnaWindowClass.OnActivateDefault getFieldActivateDefault() {
       toFields().readField(ACTIVATE_DEFAULT);
       return toFields().activate_default;
    } 

    /**
     * 
     * <br>See {@link OnKeysChanged#onKeysChanged}
    */
    public static final String KEYS_CHANGED = "keys_changed";

    /**
     * 
     * <br>See {@link OnKeysChanged#onKeysChanged}
    */
    public void setFieldKeysChanged(OnKeysChanged keys_changed) {
        toFields().keys_changed = toOnKeysChanged(this, KEYS_CHANGED, keys_changed);
        toFields().writeField(KEYS_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnKeysChanged#onKeysChanged}
    */
    public JnaWindowClass.OnKeysChanged getFieldKeysChanged() {
       toFields().readField(KEYS_CHANGED);
       return toFields().keys_changed;
    } 

    /**
     * 
     * <br>See {@link OnEnableDebugging#onEnableDebugging}
    */
    public static final String ENABLE_DEBUGGING = "enable_debugging";

    /**
     * 
     * <br>See {@link OnEnableDebugging#onEnableDebugging}
    */
    public void setFieldEnableDebugging(OnEnableDebugging enable_debugging) {
        toFields().enable_debugging = toOnEnableDebugging(this, ENABLE_DEBUGGING, enable_debugging);
        toFields().writeField(ENABLE_DEBUGGING);
    }

    /**
     * 
     * <br>See {@link OnEnableDebugging#onEnableDebugging}
    */
    public JnaWindowClass.OnEnableDebugging getFieldEnableDebugging() {
       toFields().readField(ENABLE_DEBUGGING);
       return toFields().enable_debugging;
    } 

    /**
     * 
     * <br>See {@link OnCloseRequest#onCloseRequest}
    */
    public static final String CLOSE_REQUEST = "close_request";

    /**
     * 
     * <br>See {@link OnCloseRequest#onCloseRequest}
    */
    public void setFieldCloseRequest(OnCloseRequest close_request) {
        toFields().close_request = toOnCloseRequest(this, CLOSE_REQUEST, close_request);
        toFields().writeField(CLOSE_REQUEST);
    }

    /**
     * 
     * <br>See {@link OnCloseRequest#onCloseRequest}
    */
    public JnaWindowClass.OnCloseRequest getFieldCloseRequest() {
       toFields().readField(CLOSE_REQUEST);
       return toFields().close_request;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Window.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Window.getParentTypeID());
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
