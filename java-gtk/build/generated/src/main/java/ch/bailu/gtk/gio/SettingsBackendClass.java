/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GSettingsBackend.
 * <p><a href="https://docs.gtk.org/gio/struct.SettingsBackendClass.html">https://docs.gtk.org/gio/struct.SettingsBackendClass.html</a></p>
*/
public class SettingsBackendClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsBackendClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRead {
        /**
         * 
         * @param backend 
         * @param key 
         * @param expected_type 
         * @param default_value 
         * @return 
        */
        ch.bailu.gtk.glib.Variant onRead(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.glib.VariantType expected_type, boolean default_value);
    }
    
    private static JnaSettingsBackendClass.OnRead toOnRead(ch.bailu.gtk.type.Pointer instance, String methodName, OnRead in) {
        JnaSettingsBackendClass.OnRead out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _key, _expected_type, _default_value) -> in.onRead(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new ch.bailu.gtk.glib.VariantType(new PointerContainer(_expected_type)), _default_value).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetWritable {
        /**
         * 
         * @param backend 
         * @param key 
         * @return 
        */
        boolean onGetWritable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str key);
    }
    
    private static JnaSettingsBackendClass.OnGetWritable toOnGetWritable(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetWritable in) {
        JnaSettingsBackendClass.OnGetWritable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _key) -> in.onGetWritable(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWrite {
        /**
         * 
         * @param backend 
         * @param key 
         * @param value 
         * @param origin_tag 
         * @return 
        */
        boolean onWrite(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.glib.Variant value, @Nullable ch.bailu.gtk.type.Pointer origin_tag);
    }
    
    private static JnaSettingsBackendClass.OnWrite toOnWrite(ch.bailu.gtk.type.Pointer instance, String methodName, OnWrite in) {
        JnaSettingsBackendClass.OnWrite out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _key, _value, _origin_tag) -> in.onWrite(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_origin_tag)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWriteTree {
        /**
         * 
         * @param backend 
         * @param tree 
         * @param origin_tag 
         * @return 
        */
        boolean onWriteTree(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.glib.Tree tree, @Nullable ch.bailu.gtk.type.Pointer origin_tag);
    }
    
    private static JnaSettingsBackendClass.OnWriteTree toOnWriteTree(ch.bailu.gtk.type.Pointer instance, String methodName, OnWriteTree in) {
        JnaSettingsBackendClass.OnWriteTree out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _tree, _origin_tag) -> in.onWriteTree(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.glib.Tree(new PointerContainer(_tree)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_origin_tag)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReset {
        /**
         * 
         * @param backend 
         * @param key 
         * @param origin_tag 
        */
        void onReset(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Pointer origin_tag);
    }
    
    private static JnaSettingsBackendClass.OnReset toOnReset(ch.bailu.gtk.type.Pointer instance, String methodName, OnReset in) {
        JnaSettingsBackendClass.OnReset out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _key, _origin_tag) -> in.onReset(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_origin_tag)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSubscribe {
        /**
         * 
         * @param backend 
         * @param name 
        */
        void onSubscribe(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str name);
    }
    
    private static JnaSettingsBackendClass.OnSubscribe toOnSubscribe(ch.bailu.gtk.type.Pointer instance, String methodName, OnSubscribe in) {
        JnaSettingsBackendClass.OnSubscribe out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _name) -> in.onSubscribe(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnsubscribe {
        /**
         * 
         * @param backend 
         * @param name 
        */
        void onUnsubscribe(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str name);
    }
    
    private static JnaSettingsBackendClass.OnUnsubscribe toOnUnsubscribe(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnsubscribe in) {
        JnaSettingsBackendClass.OnUnsubscribe out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _name) -> in.onUnsubscribe(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSync {
        /**
         * 
         * @param backend 
        */
        void onSync(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend);
    }
    
    private static JnaSettingsBackendClass.OnSync toOnSync(ch.bailu.gtk.type.Pointer instance, String methodName, OnSync in) {
        JnaSettingsBackendClass.OnSync out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend) -> in.onSync(__callback, new SettingsBackend(new PointerContainer(_backend)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPermission {
        /**
         * 
         * @param backend 
         * @param path 
         * @return 
        */
        Permission onGetPermission(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static JnaSettingsBackendClass.OnGetPermission toOnGetPermission(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPermission in) {
        JnaSettingsBackendClass.OnGetPermission out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _path) -> in.onGetPermission(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReadUserValue {
        /**
         * 
         * @param backend 
         * @param key 
         * @param expected_type 
         * @return 
        */
        ch.bailu.gtk.glib.Variant onReadUserValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.glib.VariantType expected_type);
    }
    
    private static JnaSettingsBackendClass.OnReadUserValue toOnReadUserValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnReadUserValue in) {
        JnaSettingsBackendClass.OnReadUserValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_backend, _key, _expected_type) -> in.onReadUserValue(__callback, new SettingsBackend(new PointerContainer(_backend)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new ch.bailu.gtk.glib.VariantType(new PointerContainer(_expected_type))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public SettingsBackendClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSettingsBackendClass.Fields _fields;
    
    JnaSettingsBackendClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSettingsBackendClass.Fields(asCPointer());
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
     * <br>See {@link OnRead#onRead}
    */
    public static final String READ = "read";

    /**
     * 
     * <br>See {@link OnRead#onRead}
    */
    public void setFieldRead(OnRead read) {
        toFields().read = toOnRead(this, READ, read);
        toFields().writeField(READ);
    }

    /**
     * 
     * <br>See {@link OnRead#onRead}
    */
    public JnaSettingsBackendClass.OnRead getFieldRead() {
       toFields().readField(READ);
       return toFields().read;
    } 

    /**
     * 
     * <br>See {@link OnGetWritable#onGetWritable}
    */
    public static final String GET_WRITABLE = "get_writable";

    /**
     * 
     * <br>See {@link OnGetWritable#onGetWritable}
    */
    public void setFieldGetWritable(OnGetWritable get_writable) {
        toFields().get_writable = toOnGetWritable(this, GET_WRITABLE, get_writable);
        toFields().writeField(GET_WRITABLE);
    }

    /**
     * 
     * <br>See {@link OnGetWritable#onGetWritable}
    */
    public JnaSettingsBackendClass.OnGetWritable getFieldGetWritable() {
       toFields().readField(GET_WRITABLE);
       return toFields().get_writable;
    } 

    /**
     * 
     * <br>See {@link OnWrite#onWrite}
    */
    public static final String WRITE = "write";

    /**
     * 
     * <br>See {@link OnWrite#onWrite}
    */
    public void setFieldWrite(OnWrite write) {
        toFields().write = toOnWrite(this, WRITE, write);
        toFields().writeField(WRITE);
    }

    /**
     * 
     * <br>See {@link OnWrite#onWrite}
    */
    public JnaSettingsBackendClass.OnWrite getFieldWrite() {
       toFields().readField(WRITE);
       return toFields().write;
    } 

    /**
     * 
     * <br>See {@link OnWriteTree#onWriteTree}
    */
    public static final String WRITE_TREE = "write_tree";

    /**
     * 
     * <br>See {@link OnWriteTree#onWriteTree}
    */
    public void setFieldWriteTree(OnWriteTree write_tree) {
        toFields().write_tree = toOnWriteTree(this, WRITE_TREE, write_tree);
        toFields().writeField(WRITE_TREE);
    }

    /**
     * 
     * <br>See {@link OnWriteTree#onWriteTree}
    */
    public JnaSettingsBackendClass.OnWriteTree getFieldWriteTree() {
       toFields().readField(WRITE_TREE);
       return toFields().write_tree;
    } 

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public static final String RESET = "reset";

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public void setFieldReset(OnReset reset) {
        toFields().reset = toOnReset(this, RESET, reset);
        toFields().writeField(RESET);
    }

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public JnaSettingsBackendClass.OnReset getFieldReset() {
       toFields().readField(RESET);
       return toFields().reset;
    } 

    /**
     * 
     * <br>See {@link OnSubscribe#onSubscribe}
    */
    public static final String SUBSCRIBE = "subscribe";

    /**
     * 
     * <br>See {@link OnSubscribe#onSubscribe}
    */
    public void setFieldSubscribe(OnSubscribe subscribe) {
        toFields().subscribe = toOnSubscribe(this, SUBSCRIBE, subscribe);
        toFields().writeField(SUBSCRIBE);
    }

    /**
     * 
     * <br>See {@link OnSubscribe#onSubscribe}
    */
    public JnaSettingsBackendClass.OnSubscribe getFieldSubscribe() {
       toFields().readField(SUBSCRIBE);
       return toFields().subscribe;
    } 

    /**
     * 
     * <br>See {@link OnUnsubscribe#onUnsubscribe}
    */
    public static final String UNSUBSCRIBE = "unsubscribe";

    /**
     * 
     * <br>See {@link OnUnsubscribe#onUnsubscribe}
    */
    public void setFieldUnsubscribe(OnUnsubscribe unsubscribe) {
        toFields().unsubscribe = toOnUnsubscribe(this, UNSUBSCRIBE, unsubscribe);
        toFields().writeField(UNSUBSCRIBE);
    }

    /**
     * 
     * <br>See {@link OnUnsubscribe#onUnsubscribe}
    */
    public JnaSettingsBackendClass.OnUnsubscribe getFieldUnsubscribe() {
       toFields().readField(UNSUBSCRIBE);
       return toFields().unsubscribe;
    } 

    /**
     * 
     * <br>See {@link OnSync#onSync}
    */
    public static final String SYNC = "sync";

    /**
     * 
     * <br>See {@link OnSync#onSync}
    */
    public void setFieldSync(OnSync sync) {
        toFields().sync = toOnSync(this, SYNC, sync);
        toFields().writeField(SYNC);
    }

    /**
     * 
     * <br>See {@link OnSync#onSync}
    */
    public JnaSettingsBackendClass.OnSync getFieldSync() {
       toFields().readField(SYNC);
       return toFields().sync;
    } 

    /**
     * 
     * <br>See {@link OnGetPermission#onGetPermission}
    */
    public static final String GET_PERMISSION = "get_permission";

    /**
     * 
     * <br>See {@link OnGetPermission#onGetPermission}
    */
    public void setFieldGetPermission(OnGetPermission get_permission) {
        toFields().get_permission = toOnGetPermission(this, GET_PERMISSION, get_permission);
        toFields().writeField(GET_PERMISSION);
    }

    /**
     * 
     * <br>See {@link OnGetPermission#onGetPermission}
    */
    public JnaSettingsBackendClass.OnGetPermission getFieldGetPermission() {
       toFields().readField(GET_PERMISSION);
       return toFields().get_permission;
    } 

    /**
     * 
     * <br>See {@link OnReadUserValue#onReadUserValue}
    */
    public static final String READ_USER_VALUE = "read_user_value";

    /**
     * 
     * <br>See {@link OnReadUserValue#onReadUserValue}
    */
    public void setFieldReadUserValue(OnReadUserValue read_user_value) {
        toFields().read_user_value = toOnReadUserValue(this, READ_USER_VALUE, read_user_value);
        toFields().writeField(READ_USER_VALUE);
    }

    /**
     * 
     * <br>See {@link OnReadUserValue#onReadUserValue}
    */
    public JnaSettingsBackendClass.OnReadUserValue getFieldReadUserValue() {
       toFields().readField(READ_USER_VALUE);
       return toFields().read_user_value;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SettingsBackend.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SettingsBackend.getParentTypeID());
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
