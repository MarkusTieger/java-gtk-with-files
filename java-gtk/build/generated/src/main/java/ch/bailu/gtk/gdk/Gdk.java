/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Gdk extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gdk.class.getCanonicalName());
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
    
    private static JnaGdk.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaGdk.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnContentDeserializeFunc {
        /**
         * The type of a function that can be registered with gdk_content_register_deserializer().
         * <br>
         * <br>When the function gets called to operate on content, it can call functions on the
         * <br>&#64;deserializer object to obtain the mime type, input stream, user data, etc. for its
         * <br>operation.
         * @param deserializer a `GdkContentDeserializer`
        */
        void onContentDeserializeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentDeserializer deserializer);
    }
    
    private static JnaGdk.OnContentDeserializeFunc toOnContentDeserializeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnContentDeserializeFunc in) {
        JnaGdk.OnContentDeserializeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_deserializer) -> in.onContentDeserializeFunc(__callback, new ContentDeserializer(new PointerContainer(_deserializer)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaGdk.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaGdk.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnContentSerializeFunc {
        /**
         * The type of a function that can be registered with gdk_content_register_serializer().
         * <br>
         * <br>When the function gets called to operate on content, it can call functions on the
         * <br>&#64;serializer object to obtain the mime type, output stream, user data, etc. for its
         * <br>operation.
         * @param serializer a `GdkContentSerializer`
        */
        void onContentSerializeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ContentSerializer serializer);
    }
    
    private static JnaGdk.OnContentSerializeFunc toOnContentSerializeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnContentSerializeFunc in) {
        JnaGdk.OnContentSerializeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_serializer) -> in.onContentSerializeFunc(__callback, new ContentSerializer(new PointerContainer(_serializer)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Adds the given rectangle to the current path of &#64;cr.
     * @param cr a cairo context
     * @param rectangle a `GdkRectangle`
    */
    public static void cairoRectangle(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull Rectangle rectangle)  {
        JnaGdk.INST().gdk_cairo_rectangle(asCPointerNotNull(cr), asCPointerNotNull(rectangle));
    }

    /**
     * Adds the given region to the current path of &#64;cr.
     * @param cr a cairo context
     * @param region a `cairo_region_t`
    */
    public static void cairoRegion(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.cairo.Region region)  {
        JnaGdk.INST().gdk_cairo_region(asCPointerNotNull(cr), asCPointerNotNull(region));
    }

    /**
     * Creates region that covers the area where the given
     * <br>&#64;surface is more than 50% opaque.
     * <br>
     * <br>This function takes into account device offsets that might be
     * <br>set with cairo_surface_set_device_offset().
     * @param surface a cairo surface
     * @return A `cairo_region_t`
    */
    public static ch.bailu.gtk.cairo.Region cairoRegionCreateFromSurface(@Nonnull ch.bailu.gtk.cairo.Surface surface)  {
        return new ch.bailu.gtk.cairo.Region(new PointerContainer(JnaGdk.INST().gdk_cairo_region_create_from_surface(asCPointerNotNull(surface))));
    }

    /**
     * Sets the given pixbuf as the source pattern for &#64;cr.
     * <br>
     * <br>The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned
     * <br>so that the origin of &#64;pixbuf is &#64;pixbuf_x, &#64;pixbuf_y.
     * @param cr a cairo context
     * @param pixbuf a `GdkPixbuf`
     * @param pixbuf_x X coordinate of location to place upper left corner of &#64;pixbuf
     * @param pixbuf_y Y coordinate of location to place upper left corner of &#64;pixbuf
    */
    public static void cairoSetSourcePixbuf(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf, double pixbuf_x, double pixbuf_y)  {
        JnaGdk.INST().gdk_cairo_set_source_pixbuf(asCPointerNotNull(cr), asCPointerNotNull(pixbuf), pixbuf_x, pixbuf_y);
    }

    /**
     * Sets the specified `GdkRGBA` as the source color of &#64;cr.
     * @param cr a cairo context
     * @param rgba a `GdkRGBA`
    */
    public static void cairoSetSourceRgba(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull RGBA rgba)  {
        JnaGdk.INST().gdk_cairo_set_source_rgba(asCPointerNotNull(cr), asCPointerNotNull(rgba));
    }

    /**
     * Read content from the given input stream and deserialize it, asynchronously.
     * <br>
     * <br>The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * <br>indicate a higher priority.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You must then
     * <br>call [func&#64;Gdk.content_deserialize_finish] to get the result of the operation.
     * @param stream a `GInputStream` to read the serialized content from
     * @param mime_type the mime type to deserialize from
     * @param type the GType to deserialize from
     * @param io_priority the I/O priority of the operation
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the operation is done
     * @param user_data data to pass to the callback function
    */
    public static void contentDeserializeAsync(@Nonnull ch.bailu.gtk.gio.InputStream stream, @Nonnull ch.bailu.gtk.type.Str mime_type, long type, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGdk.INST().gdk_content_deserialize_async(asCPointerNotNull(stream), asCPointerNotNull(mime_type), type, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "contentDeserializeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a content deserialization operation.
     * @param result the `GAsyncResult`
     * @param value return location for the result of the operation
     * @return %TRUE if the operation was successful. In this case,   &#64;value is set. %FALSE if an error occurred. In this case,   &#64;error is set
    */
    public static boolean contentDeserializeFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result, @Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGdk.INST().gdk_content_deserialize_finish(asCPointerNotNull(result), asCPointerNotNull(value), 0L);
    }

    /**
     * Parses the given &#64;string into `GdkContentFormats` and
     * <br>returns the formats.
     * <br>
     * <br>Strings printed via [method&#64;Gdk.ContentFormats.to_string]
     * <br>can be read in again successfully using this function.
     * <br>
     * <br>If &#64;string does not describe valid content formats, %NULL
     * <br>is returned.
     * @param string the string to parse
     * @return the content formats if &#64;string is valid
    */
    public static ContentFormats contentFormatsParse(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ContentFormats(new PointerContainer(JnaGdk.INST().gdk_content_formats_parse(asCPointerNotNull(string))));
    }

    /**
     * Registers a function to deserialize object of a given type.
     * @param mime_type the mime type which the function can deserialize from
     * @param type the type of objects that the function creates
     * @param deserialize the callback
     * @param data data that &#64;deserialize can access
     * @param notify destroy notify for &#64;data
    */
    public static void contentRegisterDeserializer(@Nonnull ch.bailu.gtk.type.Str mime_type, long type, OnContentDeserializeFunc deserialize, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        JnaGdk.INST().gdk_content_register_deserializer(asCPointerNotNull(mime_type), type, toOnContentDeserializeFunc(getClassHandler().getInstance(), "contentRegisterDeserializer", deserialize), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "contentRegisterDeserializer", notify));
    }

    /**
     * Registers a function to serialize objects of a given type.
     * @param type the type of objects that the function can serialize
     * @param mime_type the mime type to serialize to
     * @param serialize the callback
     * @param data data that &#64;serialize can access
     * @param notify destroy notify for &#64;data
    */
    public static void contentRegisterSerializer(long type, @Nonnull ch.bailu.gtk.type.Str mime_type, OnContentSerializeFunc serialize, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        JnaGdk.INST().gdk_content_register_serializer(type, asCPointerNotNull(mime_type), toOnContentSerializeFunc(getClassHandler().getInstance(), "contentRegisterSerializer", serialize), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "contentRegisterSerializer", notify));
    }

    /**
     * Serialize content and write it to the given output stream, asynchronously.
     * <br>
     * <br>The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower numbers
     * <br>indicate a higher priority.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You must then
     * <br>call [func&#64;Gdk.content_serialize_finish] to get the result of the operation.
     * @param stream a `GOutputStream` to write the serialized content to
     * @param mime_type the mime type to serialize to
     * @param value the content to serialize
     * @param io_priority the I/O priority of the operation
     * @param cancellable optional `GCancellable` object
     * @param callback callback to call when the operation is done
     * @param user_data data to pass to the callback function
    */
    public static void contentSerializeAsync(@Nonnull ch.bailu.gtk.gio.OutputStream stream, @Nonnull ch.bailu.gtk.type.Str mime_type, @Nonnull ch.bailu.gtk.gobject.Value value, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGdk.INST().gdk_content_serialize_async(asCPointerNotNull(stream), asCPointerNotNull(mime_type), asCPointerNotNull(value), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "contentSerializeAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes a content serialization operation.
     * @param result the `GAsyncResult`
     * @return %TRUE if the operation was successful, %FALSE if an   error occurred. In this case, &#64;error is set
    */
    public static boolean contentSerializeFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGdk.INST().gdk_content_serialize_finish(asCPointerNotNull(result), 0L);
    }

    /**
     * Checks if &#64;action represents a single action or includes
     * <br>multiple actions.
     * <br>
     * <br>When &#64;action is 0 - ie no action was given, %TRUE
     * <br>is returned.
     * @param action a `GdkDragAction`
     * @return %TRUE if exactly one action was given
    */
    public static boolean dragActionIsUnique(int action)  {
        return JnaGdk.INST().gdk_drag_action_is_unique(action);
    }

    /**
     * 
     * @return 
    */
    public static int glErrorQuark()  {
        return JnaGdk.INST().gdk_gl_error_quark();
    }

    /**
     * Canonicalizes the given mime type and interns the result.
     * <br>
     * <br>If &#64;string is not a valid mime type, %NULL is returned instead.
     * <br>See RFC 2048 for the syntax if mime types.
     * @param string string of a potential mime type
     * @return An interned string for the canonicalized   mime type or %NULL if the string wasn't a valid mime type
    */
    public static ch.bailu.gtk.type.Str internMimeType(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGdk.INST().gdk_intern_mime_type(asCPointerNotNull(string))));
    }

    /**
     * Converts a key name to a key value.
     * <br>
     * <br>The names are the same as those in the
     * <br>`gdk/gdkkeysyms.h` header file
     * <br>but without the leading “GDK_KEY_”.
     * @param keyval_name a key name
     * @return the corresponding key value, or %GDK_KEY_VoidSymbol   if the key name is not a valid key
    */
    public static int keyvalFromName(@Nonnull ch.bailu.gtk.type.Str keyval_name)  {
        return JnaGdk.INST().gdk_keyval_from_name(asCPointerNotNull(keyval_name));
    }

    /**
     * Returns %TRUE if the given key value is in lower case.
     * @param keyval a key value.
     * @return %TRUE if &#64;keyval is in lower case, or if &#64;keyval is not   subject to case conversion.
    */
    public static boolean keyvalIsLower(int keyval)  {
        return JnaGdk.INST().gdk_keyval_is_lower(keyval);
    }

    /**
     * Returns %TRUE if the given key value is in upper case.
     * @param keyval a key value.
     * @return %TRUE if &#64;keyval is in upper case, or if &#64;keyval is not subject to  case conversion.
    */
    public static boolean keyvalIsUpper(int keyval)  {
        return JnaGdk.INST().gdk_keyval_is_upper(keyval);
    }

    /**
     * Converts a key value into a symbolic name.
     * <br>
     * <br>The names are the same as those in the
     * <br>`gdk/gdkkeysyms.h` header file
     * <br>but without the leading “GDK_KEY_”.
     * @param keyval a key value
     * @return a string containing the name   of the key
    */
    public static ch.bailu.gtk.type.Str keyvalName(int keyval)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGdk.INST().gdk_keyval_name(keyval)));
    }

    /**
     * Converts a key value to lower case, if applicable.
     * @param keyval a key value.
     * @return the lower case form of &#64;keyval, or &#64;keyval itself if it is already  in lower case or it is not subject to case conversion.
    */
    public static int keyvalToLower(int keyval)  {
        return JnaGdk.INST().gdk_keyval_to_lower(keyval);
    }

    /**
     * Convert from a GDK key symbol to the corresponding Unicode
     * <br>character.
     * <br>
     * <br>Note that the conversion does not take the current locale
     * <br>into consideration, which might be expected for particular
     * <br>keyvals, such as %GDK_KEY_KP_Decimal.
     * @param keyval a GDK key symbol
     * @return the corresponding unicode character, or 0 if there   is no corresponding character.
    */
    public static int keyvalToUnicode(int keyval)  {
        return JnaGdk.INST().gdk_keyval_to_unicode(keyval);
    }

    /**
     * Converts a key value to upper case, if applicable.
     * @param keyval a key value.
     * @return the upper case form of &#64;keyval, or &#64;keyval itself if it is already   in upper case or it is not subject to case conversion.
    */
    public static int keyvalToUpper(int keyval)  {
        return JnaGdk.INST().gdk_keyval_to_upper(keyval);
    }

    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * <br>
     * <br>This is often useful for implementing the
     * <br>[vfunc&#64;Gdk.Paintable.get_current_image] virtual function
     * <br>when the paintable is in an incomplete state (like a
     * <br>[class&#64;Gtk.MediaStream] before receiving the first frame).
     * @param intrinsic_width The intrinsic width to report. Can be 0 for no width.
     * @param intrinsic_height The intrinsic height to report. Can be 0 for no height.
     * @return a `GdkPaintable`
    */
    public static Paintable paintableNewEmpty(int intrinsic_width, int intrinsic_height)  {
        return new Paintable(new PointerContainer(JnaGdk.INST().gdk_paintable_new_empty(intrinsic_width, intrinsic_height)));
    }

    /**
     * Transfers image data from a `cairo_surface_t` and converts it
     * <br>to a `GdkPixbuf`.
     * <br>
     * <br>This allows you to efficiently read individual pixels from cairo surfaces.
     * <br>
     * <br>This function will create an RGB pixbuf with 8 bits per channel.
     * <br>The pixbuf will contain an alpha channel if the &#64;surface contains one.
     * @param surface surface to copy from
     * @param src_x Source X coordinate within &#64;surface
     * @param src_y Source Y coordinate within &#64;surface
     * @param width Width in pixels of region to get
     * @param height Height in pixels of region to get
     * @return A newly-created pixbuf with a   reference count of 1
    */
    public static ch.bailu.gtk.gdkpixbuf.Pixbuf pixbufGetFromSurface(@Nonnull ch.bailu.gtk.cairo.Surface surface, int src_x, int src_y, int width, int height)  {
        return new ch.bailu.gtk.gdkpixbuf.Pixbuf(new PointerContainer(JnaGdk.INST().gdk_pixbuf_get_from_surface(asCPointerNotNull(surface), src_x, src_y, width, height)));
    }

    /**
     * Creates a new pixbuf from &#64;texture.
     * <br>
     * <br>This should generally not be used in newly written code as later
     * <br>stages will almost certainly convert the pixbuf back into a texture
     * <br>to draw it on screen.
     * @param texture a `GdkTexture`
     * @return a new `GdkPixbuf`
    */
    public static ch.bailu.gtk.gdkpixbuf.Pixbuf pixbufGetFromTexture(@Nonnull Texture texture)  {
        return new ch.bailu.gtk.gdkpixbuf.Pixbuf(new PointerContainer(JnaGdk.INST().gdk_pixbuf_get_from_texture(asCPointerNotNull(texture))));
    }

    /**
     * Sets a list of backends that GDK should try to use.
     * <br>
     * <br>This can be useful if your application does not
     * <br>work with certain GDK backends.
     * <br>
     * <br>By default, GDK tries all included backends.
     * <br>
     * <br>For example:
     * <br>
     * <br>```c
     * <br>gdk_set_allowed_backends (&quot;wayland,macos,*&quot;);
     * <br>```
     * <br>
     * <br>instructs GDK to try the Wayland backend first, followed by the
     * <br>MacOs backend, and then all others.
     * <br>
     * <br>If the `GDK_BACKEND` environment variable is set, it determines
     * <br>what backends are tried in what order, while still respecting the
     * <br>set of allowed backends that are specified by this function.
     * <br>
     * <br>The possible backend names are:
     * <br>
     * <br>  - `broadway`
     * <br>  - `macos`
     * <br>  - `wayland`.
     * <br>  - `win32`
     * <br>  - `x11`
     * <br>
     * <br>You can also include a `*` in the list to try all remaining backends.
     * <br>
     * <br>This call must happen prior to functions that open a display, such
     * <br>as [func&#64;Gdk.Display.open], `gtk_init()`, or `gtk_init_check()`
     * <br>in order to take effect.
     * @param backends a comma-separated list of backends
    */
    public static void setAllowedBackends(@Nonnull ch.bailu.gtk.type.Str backends)  {
        JnaGdk.INST().gdk_set_allowed_backends(asCPointerNotNull(backends));
    }

    /**
     * 
     * @return 
    */
    public static int textureErrorQuark()  {
        return JnaGdk.INST().gdk_texture_error_quark();
    }

    /**
     * 
     * @return 
    */
    public static long toplevelSizeGetType()  {
        return JnaGdk.INST().gdk_toplevel_size_get_type();
    }

    /**
     * Convert from a Unicode character to a key symbol.
     * @param wc a Unicode character
     * @return the corresponding GDK key symbol, if one exists.   or, if there is no corresponding symbol, wc | 0x01000000
    */
    public static int unicodeToKeyval(int wc)  {
        return JnaGdk.INST().gdk_unicode_to_keyval(wc);
    }

    /**
     * 
     * @return 
    */
    public static int vulkanErrorQuark()  {
        return JnaGdk.INST().gdk_vulkan_error_quark();
    }

}

/*
package-type

[MethodModel:cb-deprecated:cairoDrawFromGl:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Context:{c:cairo_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Surface:{c:GdkSurface*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:java-type-not-supported:eventsGetAngle:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:eventsGetCenter:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:eventsGetDistance:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Event:{c:GdkEvent*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:keyvalConvertCase:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:pangoLayoutGetClipRegion:[ParameterModel:Supported:{Gg:Region:{c:cairo_region_t*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Layout:{c:PangoLayout*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const int*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:java-type-not-supported:pangoLayoutLineGetClipRegion:[ParameterModel:Supported:{Gg:Region:{c:cairo_region_t*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:LayoutLine:{c:PangoLayoutLine*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const int*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
