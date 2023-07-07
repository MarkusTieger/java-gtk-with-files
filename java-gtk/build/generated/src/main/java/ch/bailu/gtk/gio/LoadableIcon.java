/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Extends the &#35;GIcon interface and adds the ability to
 * <br>load icons from streams.
 * <p><a href="https://docs.gtk.org/gio/iface.LoadableIcon.html">https://docs.gtk.org/gio/iface.LoadableIcon.html</a></p>
*/
public class LoadableIcon extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LoadableIcon.class.getCanonicalName());
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
    
    private static JnaLoadableIcon.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaLoadableIcon.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public LoadableIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Loads a loadable icon. For the asynchronous version of this function,
     * <br>see g_loadable_icon_load_async().
     * @param size an integer.
     * @param type a location to store the type of the loaded icon, %NULL to ignore.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GInputStream to read the icon from.
    */
    public InputStream load(int size, @Nullable ch.bailu.gtk.type.Strs type, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new InputStream(new PointerContainer(JnaLoadableIcon.INST().g_loadable_icon_load(asCPointer(), size, asCPointer(type), asCPointer(cancellable), 0L)));
    }

    /**
     * Loads an icon asynchronously. To finish this function, see
     * <br>g_loadable_icon_load_finish(). For the synchronous, blocking
     * <br>version of this function, see g_loadable_icon_load().
     * @param size an integer.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the            request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void loadAsync(int size, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaLoadableIcon.INST().g_loadable_icon_load_async(asCPointer(), size, asCPointer(cancellable), toOnAsyncReadyCallback(this, "loadAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous icon load started in g_loadable_icon_load_async().
     * @param res a &#35;GAsyncResult.
     * @param type a location to store the type of the loaded        icon, %NULL to ignore.
     * @return a &#35;GInputStream to read the icon from.
    */
    public InputStream loadFinish(@Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Strs type) throws ch.bailu.gtk.type.exception.AllocationError {
        return new InputStream(new PointerContainer(JnaLoadableIcon.INST().g_loadable_icon_load_finish(asCPointer(), asCPointerNotNull(res), asCPointer(type), 0L)));
    }

    public static long getTypeID() { 
        return JnaLoadableIcon.INST().g_loadable_icon_get_type(); 
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
interface-type
*/
