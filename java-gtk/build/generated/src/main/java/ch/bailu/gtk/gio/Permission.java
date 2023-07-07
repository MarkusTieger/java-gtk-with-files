/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GPermission represents the status of the caller's permission to
 * <br>perform a certain action.
 * <br>
 * <br>You can query if the action is currently allowed and if it is
 * <br>possible to acquire the permission so that the action will be allowed
 * <br>in the future.
 * <br>
 * <br>There is also an API to actually acquire the permission and one to
 * <br>release it.
 * <br>
 * <br>As an example, a &#35;GPermission might represent the ability for the
 * <br>user to write to a &#35;GSettings object.  This &#35;GPermission object could
 * <br>then be used to decide if it is appropriate to show a &quot;Click here to
 * <br>unlock&quot; button in a dialog and to provide the mechanism to invoke
 * <br>when that button is clicked.
 * <p><a href="https://docs.gtk.org/gio/class.Permission.html">https://docs.gtk.org/gio/class.Permission.html</a></p>
*/
public class Permission extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Permission.class.getCanonicalName());
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
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaPermission.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaPermission.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Permission(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Attempts to acquire the permission represented by &#64;permission.
     * <br>
     * <br>The precise method by which this happens depends on the permission
     * <br>and the underlying authentication mechanism.  A simple example is
     * <br>that a dialog may appear asking the user to enter their password.
     * <br>
     * <br>You should check with g_permission_get_can_acquire() before calling
     * <br>this function.
     * <br>
     * <br>If the permission is acquired then %TRUE is returned.  Otherwise,
     * <br>%FALSE is returned and &#64;error is set appropriately.
     * <br>
     * <br>This call is blocking, likely for a very long time (in the case that
     * <br>user interaction is required).  See g_permission_acquire_async() for
     * <br>the non-blocking version.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if the permission was successfully acquired
    */
    public boolean acquire(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPermission.INST().g_permission_acquire(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Attempts to acquire the permission represented by &#64;permission.
     * <br>
     * <br>This is the first half of the asynchronous version of
     * <br>g_permission_acquire().
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback the &#35;GAsyncReadyCallback to call when done
     * @param user_data the user data to pass to &#64;callback
    */
    public void acquireAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPermission.INST().g_permission_acquire_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "acquireAsync", callback), asCPointer(user_data));
    }

    /**
     * Collects the result of attempting to acquire the permission
     * <br>represented by &#64;permission.
     * <br>
     * <br>This is the second half of the asynchronous version of
     * <br>g_permission_acquire().
     * @param result the &#35;GAsyncResult given to the &#35;GAsyncReadyCallback
     * @return %TRUE if the permission was successfully acquired
    */
    public boolean acquireFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPermission.INST().g_permission_acquire_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the value of the 'allowed' property.  This property is %TRUE if
     * <br>the caller currently has permission to perform the action that
     * <br>&#64;permission represents the permission to perform.
     * @return the value of the 'allowed' property
    */
    public boolean getAllowed()  {
        return JnaPermission.INST().g_permission_get_allowed(asCPointer());
    }

    /**
     * Gets the value of the 'can-acquire' property.  This property is %TRUE
     * <br>if it is generally possible to acquire the permission by calling
     * <br>g_permission_acquire().
     * @return the value of the 'can-acquire' property
    */
    public boolean getCanAcquire()  {
        return JnaPermission.INST().g_permission_get_can_acquire(asCPointer());
    }

    /**
     * Gets the value of the 'can-release' property.  This property is %TRUE
     * <br>if it is generally possible to release the permission by calling
     * <br>g_permission_release().
     * @return the value of the 'can-release' property
    */
    public boolean getCanRelease()  {
        return JnaPermission.INST().g_permission_get_can_release(asCPointer());
    }

    /**
     * This function is called by the &#35;GPermission implementation to update
     * <br>the properties of the permission.  You should never call this
     * <br>function except from a &#35;GPermission implementation.
     * <br>
     * <br>GObject notify signals are generated, as appropriate.
     * @param allowed the new value for the 'allowed' property
     * @param can_acquire the new value for the 'can-acquire' property
     * @param can_release the new value for the 'can-release' property
    */
    public void implUpdate(boolean allowed, boolean can_acquire, boolean can_release)  {
        JnaPermission.INST().g_permission_impl_update(asCPointer(), allowed, can_acquire, can_release);
    }

    /**
     * Attempts to release the permission represented by &#64;permission.
     * <br>
     * <br>The precise method by which this happens depends on the permission
     * <br>and the underlying authentication mechanism.  In most cases the
     * <br>permission will be dropped immediately without further action.
     * <br>
     * <br>You should check with g_permission_get_can_release() before calling
     * <br>this function.
     * <br>
     * <br>If the permission is released then %TRUE is returned.  Otherwise,
     * <br>%FALSE is returned and &#64;error is set appropriately.
     * <br>
     * <br>This call is blocking, likely for a very long time (in the case that
     * <br>user interaction is required).  See g_permission_release_async() for
     * <br>the non-blocking version.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if the permission was successfully released
    */
    public boolean release(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPermission.INST().g_permission_release(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Attempts to release the permission represented by &#64;permission.
     * <br>
     * <br>This is the first half of the asynchronous version of
     * <br>g_permission_release().
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback the &#35;GAsyncReadyCallback to call when done
     * @param user_data the user data to pass to &#64;callback
    */
    public void releaseAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPermission.INST().g_permission_release_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "releaseAsync", callback), asCPointer(user_data));
    }

    /**
     * Collects the result of attempting to release the permission
     * <br>represented by &#64;permission.
     * <br>
     * <br>This is the second half of the asynchronous version of
     * <br>g_permission_release().
     * @param result the &#35;GAsyncResult given to the &#35;GAsyncReadyCallback
     * @return %TRUE if the permission was successfully released
    */
    public boolean releaseFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPermission.INST().g_permission_release_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public static long getTypeID() { 
        return JnaPermission.INST().g_permission_get_type(); 
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
