/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.PermissionClass.html">https://docs.gtk.org/gio/struct.PermissionClass.html</a></p>
*/
public class PermissionClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PermissionClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAcquire {
        /**
         * 
         * @param permission a &#35;GPermission instance
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return %TRUE if the permission was successfully acquired
        */
        boolean onAcquire(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Permission permission, @Nullable Cancellable cancellable);
    }
    
    private static JnaPermissionClass.OnAcquire toOnAcquire(ch.bailu.gtk.type.Pointer instance, String methodName, OnAcquire in) {
        JnaPermissionClass.OnAcquire out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_permission, _cancellable, _error) -> in.onAcquire(__callback, new Permission(new PointerContainer(_permission)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAcquireFinish {
        /**
         * 
         * @param permission a &#35;GPermission instance
         * @param result the &#35;GAsyncResult given to the &#35;GAsyncReadyCallback
         * @return %TRUE if the permission was successfully acquired
        */
        boolean onAcquireFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Permission permission, @Nonnull AsyncResult result);
    }
    
    private static JnaPermissionClass.OnAcquireFinish toOnAcquireFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnAcquireFinish in) {
        JnaPermissionClass.OnAcquireFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_permission, _result, _error) -> in.onAcquireFinish(__callback, new Permission(new PointerContainer(_permission)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRelease {
        /**
         * 
         * @param permission a &#35;GPermission instance
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return %TRUE if the permission was successfully released
        */
        boolean onRelease(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Permission permission, @Nullable Cancellable cancellable);
    }
    
    private static JnaPermissionClass.OnRelease toOnRelease(ch.bailu.gtk.type.Pointer instance, String methodName, OnRelease in) {
        JnaPermissionClass.OnRelease out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_permission, _cancellable, _error) -> in.onRelease(__callback, new Permission(new PointerContainer(_permission)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReleaseFinish {
        /**
         * 
         * @param permission a &#35;GPermission instance
         * @param result the &#35;GAsyncResult given to the &#35;GAsyncReadyCallback
         * @return %TRUE if the permission was successfully released
        */
        boolean onReleaseFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Permission permission, @Nonnull AsyncResult result);
    }
    
    private static JnaPermissionClass.OnReleaseFinish toOnReleaseFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnReleaseFinish in) {
        JnaPermissionClass.OnReleaseFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_permission, _result, _error) -> in.onReleaseFinish(__callback, new Permission(new PointerContainer(_permission)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public PermissionClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPermissionClass.Fields _fields;
    
    JnaPermissionClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPermissionClass.Fields(asCPointer());
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
     * <br>See {@link OnAcquire#onAcquire}
    */
    public static final String ACQUIRE = "acquire";

    /**
     * 
     * <br>See {@link OnAcquire#onAcquire}
    */
    public void setFieldAcquire(OnAcquire acquire) {
        toFields().acquire = toOnAcquire(this, ACQUIRE, acquire);
        toFields().writeField(ACQUIRE);
    }

    /**
     * 
     * <br>See {@link OnAcquire#onAcquire}
    */
    public JnaPermissionClass.OnAcquire getFieldAcquire() {
       toFields().readField(ACQUIRE);
       return toFields().acquire;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String ACQUIRE_ASYNC = "acquire_async";

    /**
     * 
     * <br>See {@link OnAcquireFinish#onAcquireFinish}
    */
    public static final String ACQUIRE_FINISH = "acquire_finish";

    /**
     * 
     * <br>See {@link OnAcquireFinish#onAcquireFinish}
    */
    public void setFieldAcquireFinish(OnAcquireFinish acquire_finish) {
        toFields().acquire_finish = toOnAcquireFinish(this, ACQUIRE_FINISH, acquire_finish);
        toFields().writeField(ACQUIRE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnAcquireFinish#onAcquireFinish}
    */
    public JnaPermissionClass.OnAcquireFinish getFieldAcquireFinish() {
       toFields().readField(ACQUIRE_FINISH);
       return toFields().acquire_finish;
    } 

    /**
     * 
     * <br>See {@link OnRelease#onRelease}
    */
    public static final String RELEASE = "release";

    /**
     * 
     * <br>See {@link OnRelease#onRelease}
    */
    public void setFieldRelease(OnRelease release) {
        toFields().release = toOnRelease(this, RELEASE, release);
        toFields().writeField(RELEASE);
    }

    /**
     * 
     * <br>See {@link OnRelease#onRelease}
    */
    public JnaPermissionClass.OnRelease getFieldRelease() {
       toFields().readField(RELEASE);
       return toFields().release;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String RELEASE_ASYNC = "release_async";

    /**
     * 
     * <br>See {@link OnReleaseFinish#onReleaseFinish}
    */
    public static final String RELEASE_FINISH = "release_finish";

    /**
     * 
     * <br>See {@link OnReleaseFinish#onReleaseFinish}
    */
    public void setFieldReleaseFinish(OnReleaseFinish release_finish) {
        toFields().release_finish = toOnReleaseFinish(this, RELEASE_FINISH, release_finish);
        toFields().writeField(RELEASE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnReleaseFinish#onReleaseFinish}
    */
    public JnaPermissionClass.OnReleaseFinish getFieldReleaseFinish() {
       toFields().readField(RELEASE_FINISH);
       return toFields().release_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Permission.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Permission.getParentTypeID());
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
