/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkClipboard` object represents data shared between applications or
 * <br>inside an application.
 * <br>
 * <br>To get a `GdkClipboard` object, use [method&#64;Gdk.Display.get_clipboard] or
 * <br>[method&#64;Gdk.Display.get_primary_clipboard]. You can find out about the data
 * <br>that is currently available in a clipboard using
 * <br>[method&#64;Gdk.Clipboard.get_formats].
 * <br>
 * <br>To make text or image data available in a clipboard, use
 * <br>[method&#64;Gdk.Clipboard.set_text] or [method&#64;Gdk.Clipboard.set_texture].
 * <br>For other data, you can use [method&#64;Gdk.Clipboard.set_content], which
 * <br>takes a [class&#64;Gdk.ContentProvider] object.
 * <br>
 * <br>To read textual or image data from a clipboard, use
 * <br>[method&#64;Gdk.Clipboard.read_text_async] or
 * <br>[method&#64;Gdk.Clipboard.read_texture_async]. For other data, use
 * <br>[method&#64;Gdk.Clipboard.read_async], which provides a `GInputStream` object.
 * <p><a href="https://docs.gtk.org/gdk4/class.Clipboard.html">https://docs.gtk.org/gdk4/class.Clipboard.html</a></p>
*/
public class Clipboard extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Clipboard.class.getCanonicalName());
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
    
    private static JnaClipboard.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaClipboard.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the clipboard changes ownership.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaClipboard.OnChanged) (__self, __data) -> in.onChanged();
    }

    public Clipboard(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the `GdkContentProvider` currently set on &#64;clipboard.
     * <br>
     * <br>If the &#64;clipboard is empty or its contents are not owned by the
     * <br>current process, %NULL will be returned.
     * @return The content of a clipboard   if the clipboard does not maintain any content
    */
    public ContentProvider getContent()  {
        return new ContentProvider(new PointerContainer(JnaClipboard.INST().gdk_clipboard_get_content(asCPointer())));
    }

    /**
     * Gets the `GdkDisplay` that the clipboard was created for.
     * @return a `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaClipboard.INST().gdk_clipboard_get_display(asCPointer())));
    }

    /**
     * Gets the formats that the clipboard can provide its current contents in.
     * @return The formats of the clipboard
    */
    public ContentFormats getFormats()  {
        return new ContentFormats(new PointerContainer(JnaClipboard.INST().gdk_clipboard_get_formats(asCPointer())));
    }

    /**
     * Returns if the clipboard is local.
     * <br>
     * <br>A clipboard is considered local if it was last claimed
     * <br>by the running application.
     * <br>
     * <br>Note that [method&#64;Gdk.Clipboard.get_content] may return %NULL
     * <br>even on a local clipboard. In this case the clipboard is empty.
     * @return %TRUE if the clipboard is local
    */
    public boolean isLocal()  {
        return JnaClipboard.INST().gdk_clipboard_is_local(asCPointer());
    }

    /**
     * Asynchronously requests an input stream to read the &#64;clipboard's
     * <br>contents from.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then
     * <br>call [method&#64;Gdk.Clipboard.read_finish] to get the result of the operation.
     * <br>
     * <br>The clipboard will choose the most suitable mime type from the given list
     * <br>to fulfill the request, preferring the ones listed first.
     * @param mime_types a %NULL-terminated array of mime types to choose from
     * @param io_priority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readAsync(@Nonnull ch.bailu.gtk.type.Strs mime_types, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClipboard.INST().gdk_clipboard_read_async(asCPointer(), asCPointerNotNull(mime_types), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous clipboard read.
     * <br>
     * <br>See [method&#64;Gdk.Clipboard.read_async].
     * @param result a `GAsyncResult`
     * @param out_mime_type location to store   the chosen mime type
     * @return a `GInputStream`
    */
    public ch.bailu.gtk.gio.InputStream readFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result, @Nullable ch.bailu.gtk.type.Strs out_mime_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gio.InputStream(new PointerContainer(JnaClipboard.INST().gdk_clipboard_read_finish(asCPointer(), asCPointerNotNull(result), asCPointer(out_mime_type), 0L)));
    }

    /**
     * Asynchronously request the &#64;clipboard contents converted to a string.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then
     * <br>call [method&#64;Gdk.Clipboard.read_text_finish] to get the result.
     * <br>
     * <br>This is a simple wrapper around [method&#64;Gdk.Clipboard.read_value_async].
     * <br>Use that function or [method&#64;Gdk.Clipboard.read_async] directly if you
     * <br>need more control over the operation.
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readTextAsync(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClipboard.INST().gdk_clipboard_read_text_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "readTextAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous clipboard read.
     * <br>
     * <br>See [method&#64;Gdk.Clipboard.read_text_async].
     * @param result a `GAsyncResult`
     * @return a new string
    */
    public ch.bailu.gtk.type.Str readTextFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaClipboard.INST().gdk_clipboard_read_text_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Asynchronously request the &#64;clipboard contents converted to a `GdkPixbuf`.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then
     * <br>call [method&#64;Gdk.Clipboard.read_texture_finish] to get the result.
     * <br>
     * <br>This is a simple wrapper around [method&#64;Gdk.Clipboard.read_value_async].
     * <br>Use that function or [method&#64;Gdk.Clipboard.read_async] directly if you
     * <br>need more control over the operation.
     * @param cancellable optional `GCancellable` object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readTextureAsync(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClipboard.INST().gdk_clipboard_read_texture_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "readTextureAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous clipboard read.
     * <br>
     * <br>See [method&#64;Gdk.Clipboard.read_texture_async].
     * @param result a `GAsyncResult`
     * @return a new `GdkTexture`
    */
    public Texture readTextureFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Texture(new PointerContainer(JnaClipboard.INST().gdk_clipboard_read_texture_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Asynchronously request the &#64;clipboard contents converted to the given
     * <br>&#64;type.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must then call
     * <br>[method&#64;Gdk.Clipboard.read_value_finish] to get the resulting `GValue`.
     * <br>
     * <br>For local clipboard contents that are available in the given `GType`,
     * <br>the value will be copied directly. Otherwise, GDK will try to use
     * <br>[func&#64;content_deserialize_async] to convert the clipboard's data.
     * @param type a `GType` to read
     * @param io_priority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readValueAsync(long type, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClipboard.INST().gdk_clipboard_read_value_async(asCPointer(), type, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readValueAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous clipboard read.
     * <br>
     * <br>See [method&#64;Gdk.Clipboard.read_value_async].
     * @param result a `GAsyncResult`
     * @return a `GValue` containing the result.
    */
    public ch.bailu.gtk.gobject.Value readValueFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gobject.Value(new PointerContainer(JnaClipboard.INST().gdk_clipboard_read_value_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Sets the clipboard to contain the value collected from the given varargs.
     * <br>
     * <br>Values should be passed the same way they are passed to other value
     * <br>collecting APIs, such as [`method&#64;GObject.Object.set`] or
     * <br>[`func&#64;GObject.signal_emit`].
     * <br>
     * <br>```c
     * <br>gdk_clipboard_set (clipboard, GTK_TYPE_STRING, &quot;Hello World&quot;);
     * <br>
     * <br>gdk_clipboard_set (clipboard, GDK_TYPE_TEXTURE, some_texture);
     * <br>```
     * @param type type of value to set
     * @param _elipse value contents conforming to &#64;type
    */
    public void set(long type, java.lang.Object... _elipse)  {
        JnaClipboard.INST().gdk_clipboard_set(asCPointer(), type, _elipse);
    }

    /**
     * Sets a new content provider on &#64;clipboard.
     * <br>
     * <br>The clipboard will claim the `GdkDisplay`'s resources and advertise
     * <br>these new contents to other applications.
     * <br>
     * <br>In the rare case of a failure, this function will return %FALSE. The
     * <br>clipboard will then continue reporting its old contents and ignore
     * <br>&#64;provider.
     * <br>
     * <br>If the contents are read by either an external application or the
     * <br>&#64;clipboard's read functions, &#64;clipboard will select the best format to
     * <br>transfer the contents and then request that format from &#64;provider.
     * @param provider the new contents of &#64;clipboard   or %NULL to clear the clipboard
     * @return %TRUE if setting the clipboard succeeded
    */
    public boolean setContent(@Nullable ContentProvider provider)  {
        return JnaClipboard.INST().gdk_clipboard_set_content(asCPointer(), asCPointer(provider));
    }

    /**
     * Puts the given &#64;text into the clipboard.
     * @param text Text to put into the clipboard
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaClipboard.INST().gdk_clipboard_set_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Puts the given &#64;text into the clipboard.
     * @param text Text to put into the clipboard
    */
    public void setText(String text)  {
        JnaClipboard.INST().gdk_clipboard_set_text(asCPointer(), text);
    }

    /**
     * Puts the given &#64;texture into the clipboard.
     * @param texture a `GdkTexture` to put into the clipboard
    */
    public void setTexture(@Nonnull Texture texture)  {
        JnaClipboard.INST().gdk_clipboard_set_texture(asCPointer(), asCPointerNotNull(texture));
    }

    /**
     * Sets the &#64;clipboard to contain the given &#64;value.
     * @param value a `GValue` to set
    */
    public void setValue(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaClipboard.INST().gdk_clipboard_set_value(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Asynchronously instructs the &#64;clipboard to store its contents remotely.
     * <br>
     * <br>If the clipboard is not local, this function does nothing but report success.
     * <br>
     * <br>The &#64;callback must call [method&#64;Gdk.Clipboard.store_finish].
     * <br>
     * <br>The purpose of this call is to preserve clipboard contents beyond the
     * <br>lifetime of an application, so this function is typically called on
     * <br>exit. Depending on the platform, the functionality may not be available
     * <br>unless a &quot;clipboard manager&quot; is running.
     * <br>
     * <br>This function is called automatically when a [class&#64;Gtk.Application] is
     * <br>shut down, so you likely don't need to call it.
     * @param io_priority the I/O priority of the request
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void storeAsync(int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClipboard.INST().gdk_clipboard_store_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "storeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous clipboard store.
     * <br>
     * <br>See [method&#64;Gdk.Clipboard.store_async].
     * @param result a `GAsyncResult`
     * @return %TRUE if storing was successful.
    */
    public boolean storeFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaClipboard.INST().gdk_clipboard_store_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaClipboard.INST().gdk_clipboard_get_type(); 
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

[MethodModel:java-type-not-supported:setValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
