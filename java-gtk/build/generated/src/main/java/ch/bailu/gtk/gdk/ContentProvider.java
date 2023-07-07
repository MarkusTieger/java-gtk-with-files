/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkContentProvider` is used to provide content for the clipboard or
 * <br>for drag-and-drop operations in a number of formats.
 * <br>
 * <br>To create a `GdkContentProvider`, use [ctor&#64;Gdk.ContentProvider.new_for_value]
 * <br>or [ctor&#64;Gdk.ContentProvider.new_for_bytes].
 * <br>
 * <br>GDK knows how to handle common text and image formats out-of-the-box. See
 * <br>[class&#64;Gdk.ContentSerializer] and [class&#64;Gdk.ContentDeserializer] if you want
 * <br>to add support for application-specific data formats.
 * <p><a href="https://docs.gtk.org/gdk4/class.ContentProvider.html">https://docs.gtk.org/gdk4/class.ContentProvider.html</a></p>
*/
public class ContentProvider extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContentProvider.class.getCanonicalName());
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
    
    private static JnaContentProvider.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaContentProvider.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnContentChanged {
        /**
         * Emitted whenever the content provided by this provider has changed.
        */
        void onContentChanged();
    }
    
    private static com.sun.jna.Callback toOnContentChanged(OnContentChanged in) {
        return (in == null) ? null: (JnaContentProvider.OnContentChanged) (__self, __data) -> in.onContentChanged();
    }

    public ContentProvider(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a content provider that provides the given &#64;bytes as data for
     * <br>the given &#64;mime_type.
     * @param mime_type the mime type
     * @param bytes a `GBytes` with the data for &#64;mime_type
     * @return a new `GdkContentProvider`
    */
    public static ContentProvider newForBytesContentProvider(@Nonnull ch.bailu.gtk.type.Str mime_type, @Nonnull ch.bailu.gtk.glib.Bytes bytes)  {
        PointerContainer __self = cast(JnaContentProvider.INST().gdk_content_provider_new_for_bytes(asCPointerNotNull(mime_type), asCPointerNotNull(bytes)));
        if (__self.isNull()) {
            throw new NullPointerException("ContentProvider:newForBytes");
        }
        return new ContentProvider(__self);
    }        
    

    /**
     * Create a content provider that provides the given &#64;bytes as data for
     * <br>the given &#64;mime_type.
     * @param mime_type the mime type
     * @param bytes a `GBytes` with the data for &#64;mime_type
     * @return a new `GdkContentProvider`
    */
    public static ContentProvider newForBytesContentProvider(String mime_type, @Nonnull ch.bailu.gtk.glib.Bytes bytes)  {
        PointerContainer __self = cast(JnaContentProvider.INST().gdk_content_provider_new_for_bytes(mime_type, asCPointerNotNull(bytes)));
        if (__self.isNull()) {
            throw new NullPointerException("ContentProvider:newForBytes");
        }
        return new ContentProvider(__self);
    }        
    

    /**
     * Create a content provider that provides the given &#64;value.
     * @param value a `GValue`
     * @return a new `GdkContentProvider`
    */
    public static ContentProvider newForValueContentProvider(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        PointerContainer __self = cast(JnaContentProvider.INST().gdk_content_provider_new_for_value(asCPointerNotNull(value)));
        if (__self.isNull()) {
            throw new NullPointerException("ContentProvider:newForValue");
        }
        return new ContentProvider(__self);
    }        
    

    /**
     * Create a content provider that provides the value of the given
     * <br>&#64;type.
     * <br>
     * <br>The value is provided using G_VALUE_COLLECT(), so the same rules
     * <br>apply as when calling g_object_new() or g_object_set().
     * @param type Type of value to follow
     * @param _elipse value
     * @return a new `GdkContentProvider`
    */
    public static ContentProvider newTypedContentProvider(long type, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaContentProvider.INST().gdk_content_provider_new_typed(type, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("ContentProvider:newTyped");
        }
        return new ContentProvider(__self);
    }        
    

    /**
     * Emits the ::content-changed signal.
    */
    public void contentChanged()  {
        JnaContentProvider.INST().gdk_content_provider_content_changed(asCPointer());
    }

    /**
     * Gets the contents of &#64;provider stored in &#64;value.
     * <br>
     * <br>The &#64;value will have been initialized to the `GType` the value should be
     * <br>provided in. This given `GType` does not need to be listed in the formats
     * <br>returned by [method&#64;Gdk.ContentProvider.ref_formats]. However, if the
     * <br>given `GType` is not supported, this operation can fail and
     * <br>`G_IO_ERROR_NOT_SUPPORTED` will be reported.
     * @param value the `GValue` to fill
     * @return %TRUE if the value was set successfully. Otherwise   &#64;error will be set to describe the failure.
    */
    public boolean getValue(@Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaContentProvider.INST().gdk_content_provider_get_value(asCPointer(), asCPointerNotNull(value), 0L);
    }

    /**
     * Gets the formats that the provider can provide its current contents in.
     * @return The formats of the provider
    */
    public ContentFormats refFormats()  {
        return new ContentFormats(new PointerContainer(JnaContentProvider.INST().gdk_content_provider_ref_formats(asCPointer())));
    }

    /**
     * Gets the formats that the provider suggests other applications to store
     * <br>the data in.
     * <br>
     * <br>An example of such an application would be a clipboard manager.
     * <br>
     * <br>This can be assumed to be a subset of [method&#64;Gdk.ContentProvider.ref_formats].
     * @return The storable formats of the provider
    */
    public ContentFormats refStorableFormats()  {
        return new ContentFormats(new PointerContainer(JnaContentProvider.INST().gdk_content_provider_ref_storable_formats(asCPointer())));
    }

    /**
     * Asynchronously writes the contents of &#64;provider to &#64;stream in the given
     * <br>&#64;mime_type.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then call
     * <br>[method&#64;Gdk.ContentProvider.write_mime_type_finish] to get the result
     * <br>of the operation.
     * <br>
     * <br>The given mime type does not need to be listed in the formats returned by
     * <br>[method&#64;Gdk.ContentProvider.ref_formats]. However, if the given `GType` is
     * <br>not supported, `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     * <br>
     * <br>The given &#64;stream will not be closed.
     * @param mime_type the mime type to provide the data in
     * @param stream the `GOutputStream` to write to
     * @param io_priority I/O priority of the request.
     * @param cancellable optional `GCancellable` object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void writeMimeTypeAsync(@Nonnull ch.bailu.gtk.type.Str mime_type, @Nonnull ch.bailu.gtk.gio.OutputStream stream, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaContentProvider.INST().gdk_content_provider_write_mime_type_async(asCPointer(), asCPointerNotNull(mime_type), asCPointerNotNull(stream), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "writeMimeTypeAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously writes the contents of &#64;provider to &#64;stream in the given
     * <br>&#64;mime_type.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then call
     * <br>[method&#64;Gdk.ContentProvider.write_mime_type_finish] to get the result
     * <br>of the operation.
     * <br>
     * <br>The given mime type does not need to be listed in the formats returned by
     * <br>[method&#64;Gdk.ContentProvider.ref_formats]. However, if the given `GType` is
     * <br>not supported, `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     * <br>
     * <br>The given &#64;stream will not be closed.
     * @param mime_type the mime type to provide the data in
     * @param stream the `GOutputStream` to write to
     * @param io_priority I/O priority of the request.
     * @param cancellable optional `GCancellable` object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void writeMimeTypeAsync(String mime_type, @Nonnull ch.bailu.gtk.gio.OutputStream stream, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaContentProvider.INST().gdk_content_provider_write_mime_type_async(asCPointer(), mime_type, asCPointerNotNull(stream), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "writeMimeTypeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous write operation.
     * <br>
     * <br>See [method&#64;Gdk.ContentProvider.write_mime_type_async].
     * @param result a `GAsyncResult`
     * @return %TRUE if the operation was completed successfully. Otherwise   &#64;error will be set to describe the failure.
    */
    public boolean writeMimeTypeFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaContentProvider.INST().gdk_content_provider_write_mime_type_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public final static String SIGNAL_ON_CONTENT_CHANGED = "content-changed";
    
    /**
     * Connect to signal "content-changed".
     * <br>See {@link OnContentChanged#onContentChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CONTENT_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onContentChanged(OnContentChanged signal) {
        return connectSignal(SIGNAL_ON_CONTENT_CHANGED, toOnContentChanged(signal));
    }

    public static long getTypeID() { 
        return JnaContentProvider.INST().gdk_content_provider_get_type(); 
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

[MethodModel:java-type-not-supported:newUnion:[ParameterModel:Supported:{Gg:ContentProvider:{c:GdkContentProvider*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkContentProvider**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
