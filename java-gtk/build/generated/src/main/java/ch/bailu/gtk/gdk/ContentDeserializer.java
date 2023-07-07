/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkContentDeserializer` is used to deserialize content received via
 * <br>inter-application data transfers.
 * <br>
 * <br>The `GdkContentDeserializer` transforms serialized content that is
 * <br>identified by a mime type into an object identified by a GType.
 * <br>
 * <br>GTK provides serializers and deserializers for common data types
 * <br>such as text, colors, images or file lists. To register your own
 * <br>deserialization functions, use [func&#64;content_register_deserializer].
 * <br>
 * <br>Also see [class&#64;Gdk.ContentSerializer].
 * <p><a href="https://docs.gtk.org/gdk4/class.ContentDeserializer.html">https://docs.gtk.org/gdk4/class.ContentDeserializer.html</a></p>
*/
public class ContentDeserializer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContentDeserializer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaContentDeserializer.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaContentDeserializer.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public ContentDeserializer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the cancellable for the current operation.
     * <br>
     * <br>This is the `GCancellable` that was passed to [func&#64;Gdk.content_deserialize_async].
     * @return the cancellable for the current operation
    */
    public ch.bailu.gtk.gio.Cancellable getCancellable()  {
        return new ch.bailu.gtk.gio.Cancellable(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_cancellable(asCPointer())));
    }

    /**
     * Gets the `GType` to create an instance of.
     * @return the `GType` for the current operation
    */
    public long getGtype()  {
        return JnaContentDeserializer.INST().gdk_content_deserializer_get_gtype(asCPointer());
    }

    /**
     * Gets the input stream for the current operation.
     * <br>
     * <br>This is the stream that was passed to [func&#64;Gdk.content_deserialize_async].
     * @return the input stream for the current operation
    */
    public ch.bailu.gtk.gio.InputStream getInputStream()  {
        return new ch.bailu.gtk.gio.InputStream(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_input_stream(asCPointer())));
    }

    /**
     * Gets the mime type to deserialize from.
     * @return the mime type for the current operation
    */
    public ch.bailu.gtk.type.Str getMimeType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_mime_type(asCPointer())));
    }

    /**
     * Gets the I/O priority for the current operation.
     * <br>
     * <br>This is the priority that was passed to [func&#64;Gdk.content_deserialize_async].
     * @return the I/O priority for the current operation
    */
    public int getPriority()  {
        return JnaContentDeserializer.INST().gdk_content_deserializer_get_priority(asCPointer());
    }

    /**
     * Gets the data that was associated with the current operation.
     * <br>
     * <br>See [method&#64;Gdk.ContentDeserializer.set_task_data].
     * @return the task data for &#64;deserializer
    */
    public ch.bailu.gtk.type.Pointer getTaskData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_task_data(asCPointer())));
    }

    /**
     * Gets the user data that was passed when the deserializer was registered.
     * @return the user data for this deserializer
    */
    public ch.bailu.gtk.type.Pointer getUserData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_user_data(asCPointer())));
    }

    /**
     * Gets the `GValue` to store the deserialized object in.
     * @return the `GValue` for the current operation
    */
    public ch.bailu.gtk.gobject.Value getValue()  {
        return new ch.bailu.gtk.gobject.Value(new PointerContainer(JnaContentDeserializer.INST().gdk_content_deserializer_get_value(asCPointer())));
    }

    /**
     * Indicate that the deserialization has ended with an error.
     * <br>
     * <br>This function consumes &#64;error.
     * @param error a `GError`
    */
    public void returnError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaContentDeserializer.INST().gdk_content_deserializer_return_error(asCPointer(), asCPointerNotNull(error));
    }

    /**
     * Indicate that the deserialization has been successfully completed.
    */
    public void returnSuccess()  {
        JnaContentDeserializer.INST().gdk_content_deserializer_return_success(asCPointer());
    }

    /**
     * Associate data with the current deserialization operation.
     * @param data data to associate with this operation
     * @param notify destroy notify for &#64;data
    */
    public void setTaskData(@Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        JnaContentDeserializer.INST().gdk_content_deserializer_set_task_data(asCPointer(), asCPointer(data), toOnDestroyNotify(this, "setTaskData", notify));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.AsyncResult}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.AsyncResult}
    */
    public ch.bailu.gtk.gio.AsyncResult asAsyncResult() {
        return new ch.bailu.gtk.gio.AsyncResult(cast());
    }

    public static long getTypeID() { 
        return JnaContentDeserializer.INST().gdk_content_deserializer_get_type(); 
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
