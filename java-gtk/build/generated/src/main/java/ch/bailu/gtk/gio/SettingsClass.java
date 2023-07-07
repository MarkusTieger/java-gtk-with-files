/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.SettingsClass.html">https://docs.gtk.org/gio/struct.SettingsClass.html</a></p>
*/
public class SettingsClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnWritableChanged {
        /**
         * 
         * @param settings 
         * @param key 
        */
        void onWritableChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Settings settings, @Nonnull ch.bailu.gtk.type.Str key);
    }
    
    private static JnaSettingsClass.OnWritableChanged toOnWritableChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnWritableChanged in) {
        JnaSettingsClass.OnWritableChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_settings, _key) -> in.onWritableChanged(__callback, new Settings(new PointerContainer(_settings)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param settings 
         * @param key 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Settings settings, @Nonnull ch.bailu.gtk.type.Str key);
    }
    
    private static JnaSettingsClass.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaSettingsClass.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_settings, _key) -> in.onChanged(__callback, new Settings(new PointerContainer(_settings)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWritableChangeEvent {
        /**
         * 
         * @param settings 
         * @param key 
         * @return 
        */
        boolean onWritableChangeEvent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Settings settings, int key);
    }
    
    private static JnaSettingsClass.OnWritableChangeEvent toOnWritableChangeEvent(ch.bailu.gtk.type.Pointer instance, String methodName, OnWritableChangeEvent in) {
        JnaSettingsClass.OnWritableChangeEvent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_settings, _key) -> in.onWritableChangeEvent(__callback, new Settings(new PointerContainer(_settings)), _key);
            __callback.register(out);
        }
        return out;
    }

    public SettingsClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSettingsClass.Fields _fields;
    
    JnaSettingsClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSettingsClass.Fields(asCPointer());
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
     * <br>See {@link OnWritableChanged#onWritableChanged}
    */
    public static final String WRITABLE_CHANGED = "writable_changed";

    /**
     * 
     * <br>See {@link OnWritableChanged#onWritableChanged}
    */
    public void setFieldWritableChanged(OnWritableChanged writable_changed) {
        toFields().writable_changed = toOnWritableChanged(this, WRITABLE_CHANGED, writable_changed);
        toFields().writeField(WRITABLE_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnWritableChanged#onWritableChanged}
    */
    public JnaSettingsClass.OnWritableChanged getFieldWritableChanged() {
       toFields().readField(WRITABLE_CHANGED);
       return toFields().writable_changed;
    } 

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaSettingsClass.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnWritableChangeEvent#onWritableChangeEvent}
    */
    public static final String WRITABLE_CHANGE_EVENT = "writable_change_event";

    /**
     * 
     * <br>See {@link OnWritableChangeEvent#onWritableChangeEvent}
    */
    public void setFieldWritableChangeEvent(OnWritableChangeEvent writable_change_event) {
        toFields().writable_change_event = toOnWritableChangeEvent(this, WRITABLE_CHANGE_EVENT, writable_change_event);
        toFields().writeField(WRITABLE_CHANGE_EVENT);
    }

    /**
     * 
     * <br>See {@link OnWritableChangeEvent#onWritableChangeEvent}
    */
    public JnaSettingsClass.OnWritableChangeEvent getFieldWritableChangeEvent() {
       toFields().readField(WRITABLE_CHANGE_EVENT);
       return toFields().writable_change_event;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Settings.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Settings.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:change_event:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
