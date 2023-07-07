/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque object representing an animation.
 * <br>
 * <br>The GdkPixBuf library provides a simple mechanism to load and
 * <br>represent animations. An animation is conceptually a series of
 * <br>frames to be displayed over time.
 * <br>
 * <br>The animation may not be represented as a series of frames
 * <br>internally; for example, it may be stored as a sprite and
 * <br>instructions for moving the sprite around a background.
 * <br>
 * <br>To display an animation you don't need to understand its
 * <br>representation, however; you just ask `GdkPixbuf` what should
 * <br>be displayed at a given point in time.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufAnimation.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufAnimation.html</a></p>
*/
public class PixbufAnimation extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufAnimation.class.getCanonicalName());
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
    
    private static JnaPixbufAnimation.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaPixbufAnimation.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public PixbufAnimation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new animation by loading it from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If the file's format does not support multi-frame images, then an animation
     * <br>with a single frame will be created.
     * <br>
     * <br>Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
     * @param filename Name of file to load, in the GLib file   name encoding
     * @return A newly-created animation
    */
    public static PixbufAnimation newFromFilePixbufAnimation(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_file(asCPointerNotNull(filename), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromFile");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Creates a new animation by loading it from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If the file's format does not support multi-frame images, then an animation
     * <br>with a single frame will be created.
     * <br>
     * <br>Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
     * @param filename Name of file to load, in the GLib file   name encoding
     * @return A newly-created animation
    */
    public static PixbufAnimation newFromFilePixbufAnimation(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_file(filename, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromFile");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Creates a new pixbuf animation by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * @param resource_path the path of the resource file
     * @return A newly-created animation
    */
    public static PixbufAnimation newFromResourcePixbufAnimation(@Nonnull ch.bailu.gtk.type.Str resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_resource(asCPointerNotNull(resource_path), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromResource");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Creates a new pixbuf animation by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * @param resource_path the path of the resource file
     * @return A newly-created animation
    */
    public static PixbufAnimation newFromResourcePixbufAnimation(String resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_resource(resource_path, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromResource");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Creates a new animation by loading it from an input stream.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set.
     * <br>
     * <br>The &#64;cancellable can be used to abort the operation from another thread.
     * <br>If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * <br>returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * <br>`G_IO_ERROR` domains.
     * <br>
     * <br>The stream is not closed.
     * @param stream a `GInputStream` to load the pixbuf from
     * @param cancellable optional `GCancellable` object
     * @return A newly-created animation
    */
    public static PixbufAnimation newFromStreamPixbufAnimation(@Nonnull ch.bailu.gtk.gio.InputStream stream, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_stream(asCPointerNotNull(stream), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromStream");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Finishes an asynchronous pixbuf animation creation operation started with
     * <br>[func&#64;GdkPixbuf.PixbufAnimation.new_from_stream_async].
     * @param async_result a &#35;GAsyncResult
     * @return the newly created animation
    */
    public static PixbufAnimation newFromStreamFinishPixbufAnimation(@Nonnull ch.bailu.gtk.gio.AsyncResult async_result) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_stream_finish(asCPointerNotNull(async_result), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufAnimation:newFromStreamFinish");
        }
        return new PixbufAnimation(__self);
    }        
    

    /**
     * Queries the height of the bounding box of a pixbuf animation.
     * @return Height of the bounding box of the animation.
    */
    public int getHeight()  {
        return JnaPixbufAnimation.INST().gdk_pixbuf_animation_get_height(asCPointer());
    }

    /**
     * Get an iterator for displaying an animation.
     * <br>
     * <br>The iterator provides the frames that should be displayed at a
     * <br>given time.
     * <br>
     * <br>&#64;start_time would normally come from g_get_current_time(), and marks
     * <br>the beginning of animation playback. After creating an iterator, you
     * <br>should immediately display the pixbuf returned by
     * <br>gdk_pixbuf_animation_iter_get_pixbuf(). Then, you should install
     * <br>a timeout (with g_timeout_add()) or by some other mechanism ensure
     * <br>that you'll update the image after
     * <br>gdk_pixbuf_animation_iter_get_delay_time() milliseconds. Each time
     * <br>the image is updated, you should reinstall the timeout with the new,
     * <br>possibly-changed delay time.
     * <br>
     * <br>As a shortcut, if &#64;start_time is `NULL`, the result of
     * <br>g_get_current_time() will be used automatically.
     * <br>
     * <br>To update the image (i.e. possibly change the result of
     * <br>gdk_pixbuf_animation_iter_get_pixbuf() to a new frame of the animation),
     * <br>call gdk_pixbuf_animation_iter_advance().
     * <br>
     * <br>If you're using &#35;GdkPixbufLoader, in addition to updating the image
     * <br>after the delay time, you should also update it whenever you
     * <br>receive the area_updated signal and
     * <br>gdk_pixbuf_animation_iter_on_currently_loading_frame() returns
     * <br>`TRUE`. In this case, the frame currently being fed into the loader
     * <br>has received new data, so needs to be refreshed. The delay time for
     * <br>a frame may also be modified after an area_updated signal, for
     * <br>example if the delay time for a frame is encoded in the data after
     * <br>the frame itself. So your timeout should be reinstalled after any
     * <br>area_updated signal.
     * <br>
     * <br>A delay time of -1 is possible, indicating &quot;infinite&quot;.
     * @param start_time time when the animation starts playing
     * @return an iterator to move over the animation
    */
    public PixbufAnimationIter getIter(@Nullable ch.bailu.gtk.glib.TimeVal start_time)  {
        return new PixbufAnimationIter(new PointerContainer(JnaPixbufAnimation.INST().gdk_pixbuf_animation_get_iter(asCPointer(), asCPointer(start_time))));
    }

    /**
     * Retrieves a static image for the animation.
     * <br>
     * <br>If an animation is really just a plain image (has only one frame),
     * <br>this function returns that image.
     * <br>
     * <br>If the animation is an animation, this function returns a reasonable
     * <br>image to use as a static unanimated image, which might be the first
     * <br>frame, or something more sophisticated depending on the file format.
     * <br>
     * <br>If an animation hasn't loaded any frames yet, this function will
     * <br>return `NULL`.
     * @return unanimated image representing the animation
    */
    public Pixbuf getStaticImage()  {
        return new Pixbuf(new PointerContainer(JnaPixbufAnimation.INST().gdk_pixbuf_animation_get_static_image(asCPointer())));
    }

    /**
     * Queries the width of the bounding box of a pixbuf animation.
     * @return Width of the bounding box of the animation.
    */
    public int getWidth()  {
        return JnaPixbufAnimation.INST().gdk_pixbuf_animation_get_width(asCPointer());
    }

    /**
     * Checks whether the animation is a static image.
     * <br>
     * <br>If you load a file with gdk_pixbuf_animation_new_from_file() and it
     * <br>turns out to be a plain, unanimated image, then this function will
     * <br>return `TRUE`. Use gdk_pixbuf_animation_get_static_image() to retrieve
     * <br>the image.
     * @return `TRUE` if the &quot;animation&quot; was really just an image
    */
    public boolean isStaticImage()  {
        return JnaPixbufAnimation.INST().gdk_pixbuf_animation_is_static_image(asCPointer());
    }

    /**
     * Creates a new animation by asynchronously loading an image from an input stream.
     * <br>
     * <br>For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, `callback` will be called in the main thread.
     * <br>You can then call gdk_pixbuf_animation_new_from_stream_finish() to get the
     * <br>result of the operation.
     * @param stream a &#35;GInputStream from which to load the animation
     * @param cancellable optional &#35;GCancellable object
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
     * @param user_data the data to pass to the callback function
    */
    public static void newFromStreamAsync(@Nonnull ch.bailu.gtk.gio.InputStream stream, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPixbufAnimation.INST().gdk_pixbuf_animation_new_from_stream_async(asCPointerNotNull(stream), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newFromStreamAsync", callback), asCPointer(user_data));
    }

    public static long getTypeID() { 
        return JnaPixbufAnimation.INST().gdk_pixbuf_animation_get_type(); 
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

[MethodModel:cb-deprecated:ref:[ParameterModel:Supported:{Gg:PixbufAnimation:{c:GdkPixbufAnimation*}}:{j:long}]]

[MethodModel:cb-deprecated:unref:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
