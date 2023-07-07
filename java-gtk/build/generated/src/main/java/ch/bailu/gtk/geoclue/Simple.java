/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class Simple extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Simple.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull ch.bailu.gtk.gio.AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSimple.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSimple.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Simple(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finishes an operation started with &#35;gclue_simple_new().
     * @param result The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to          &#35;gclue_simple_new().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static Simple newFinishSimple(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_finish(asCPointerNotNull(result), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newFinish");
        }
        return new Simple(__self);
    }        
    

    /**
     * The synchronous and blocking version of &#35;gclue_simple_new().
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The new &#35;GClueSimple object or %NULL if &#64;error is set.
    */
    public static Simple newSyncSimple(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_sync(asCPointerNotNull(desktop_id), accuracy_level, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newSync");
        }
        return new Simple(__self);
    }        
    

    /**
     * The synchronous and blocking version of &#35;gclue_simple_new().
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The new &#35;GClueSimple object or %NULL if &#64;error is set.
    */
    public static Simple newSyncSimple(String desktop_id, int accuracy_level, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_sync(desktop_id, accuracy_level, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newSync");
        }
        return new Simple(__self);
    }        
    

    /**
     * Finishes an operation started with &#35;gclue_simple_new_with_thresholds().
     * @param result The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to          &#35;gclue_simple_new_with_thresholds().
     * @return The constructed proxy object or %NULL if &#64;error is set.
    */
    public static Simple newWithThresholdsFinishSimple(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_with_thresholds_finish(asCPointerNotNull(result), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newWithThresholdsFinish");
        }
        return new Simple(__self);
    }        
    

    /**
     * The synchronous and blocking version of &#35;gclue_simple_new_with_thresholds().
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param time_threshold Time threshold in seconds, 0 for no limit.
     * @param distance_threshold Distance threshold in meters, 0 for no limit.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The new &#35;GClueSimple object or %NULL if &#64;error is set.
    */
    public static Simple newWithThresholdsSyncSimple(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, int time_threshold, int distance_threshold, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_with_thresholds_sync(asCPointerNotNull(desktop_id), accuracy_level, time_threshold, distance_threshold, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newWithThresholdsSync");
        }
        return new Simple(__self);
    }        
    

    /**
     * The synchronous and blocking version of &#35;gclue_simple_new_with_thresholds().
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param time_threshold Time threshold in seconds, 0 for no limit.
     * @param distance_threshold Distance threshold in meters, 0 for no limit.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return The new &#35;GClueSimple object or %NULL if &#64;error is set.
    */
    public static Simple newWithThresholdsSyncSimple(String desktop_id, int accuracy_level, int time_threshold, int distance_threshold, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSimple.INST().gclue_simple_new_with_thresholds_sync(desktop_id, accuracy_level, time_threshold, distance_threshold, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Simple:newWithThresholdsSync");
        }
        return new Simple(__self);
    }        
    

    /**
     * Gets the client proxy, or %NULL if &#64;simple is not using a client proxy (i-e
     * <br>when inside the Flatpak sandbox).
     * @return The client object.
    */
    public ClientProxy getClient()  {
        return new ClientProxy(new PointerContainer(JnaSimple.INST().gclue_simple_get_client(asCPointer())));
    }

    /**
     * Gets the current location.
     * @return The last known location as &#35;GClueLocation.
    */
    public Location getLocation()  {
        return new Location(new PointerContainer(JnaSimple.INST().gclue_simple_get_location(asCPointer())));
    }

    /**
     * Asynchronously creates a &#35;GClueSimple instance. Use
     * <br>&#35;gclue_simple_new_finish() to get the created &#35;GClueSimple instance.
     * <br>
     * <br>See &#35;gclue_simple_new_sync() for the synchronous, blocking version
     * <br>of this function.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the results are ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void _new(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSimple.INST().gclue_simple_new(asCPointerNotNull(desktop_id), accuracy_level, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously creates a &#35;GClueSimple instance. Use
     * <br>&#35;gclue_simple_new_with_thresholds_finish() to get the created &#35;GClueSimple instance.
     * <br>
     * <br>See &#35;gclue_simple_new_with_thresholds_sync() for the synchronous,
     * <br>blocking version of this function.
     * @param desktop_id The desktop file id (the basename of the desktop file).
     * @param accuracy_level The requested accuracy level as &#35;GClueAccuracyLevel.
     * @param time_threshold Time threshold in seconds, 0 for no limit.
     * @param distance_threshold Distance threshold in meters, 0 for no limit.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the results are ready.
     * @param user_data User data to pass to &#64;callback.
    */
    public static void newWithThresholds(@Nonnull ch.bailu.gtk.type.Str desktop_id, int accuracy_level, int time_threshold, int distance_threshold, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSimple.INST().gclue_simple_new_with_thresholds(asCPointerNotNull(desktop_id), accuracy_level, time_threshold, distance_threshold, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newWithThresholds", callback), asCPointer(user_data));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.AsyncInitable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.AsyncInitable}
    */
    public ch.bailu.gtk.gio.AsyncInitable asAsyncInitable() {
        return new ch.bailu.gtk.gio.AsyncInitable(cast());
    }

    public static long getTypeID() { 
        return JnaSimple.INST().gclue_simple_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
