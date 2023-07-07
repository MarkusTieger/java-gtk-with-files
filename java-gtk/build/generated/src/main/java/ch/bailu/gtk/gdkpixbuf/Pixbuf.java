/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A pixel buffer.
 * <br>
 * <br>`GdkPixbuf` contains information about an image's pixel data,
 * <br>its color space, bits per sample, width and height, and the
 * <br>rowstride (the number of bytes between the start of one row
 * <br>and the start of the next).
 * <br>
 * <br>&#35;&#35; Creating new `GdkPixbuf`
 * <br>
 * <br>The most basic way to create a pixbuf is to wrap an existing pixel
 * <br>buffer with a [class&#64;GdkPixbuf.Pixbuf] instance. You can use the
 * <br>[`ctor&#64;GdkPixbuf.Pixbuf.new_from_data`] function to do this.
 * <br>
 * <br>Every time you create a new `GdkPixbuf` instance for some data, you
 * <br>will need to specify the destroy notification function that will be
 * <br>called when the data buffer needs to be freed; this will happen when
 * <br>a `GdkPixbuf` is finalized by the reference counting functions. If
 * <br>you have a chunk of static data compiled into your application, you
 * <br>can pass in `NULL` as the destroy notification function so that the
 * <br>data will not be freed.
 * <br>
 * <br>The [`ctor&#64;GdkPixbuf.Pixbuf.new`] constructor function can be used
 * <br>as a convenience to create a pixbuf with an empty buffer; this is
 * <br>equivalent to allocating a data buffer using `malloc()` and then
 * <br>wrapping it with `gdk_pixbuf_new_from_data()`. The `gdk_pixbuf_new()`
 * <br>function will compute an optimal rowstride so that rendering can be
 * <br>performed with an efficient algorithm.
 * <br>
 * <br>As a special case, you can use the [`ctor&#64;GdkPixbuf.Pixbuf.new_from_xpm_data`]
 * <br>function to create a pixbuf from inline XPM image data.
 * <br>
 * <br>You can also copy an existing pixbuf with the [method&#64;Pixbuf.copy]
 * <br>function. This is not the same as just acquiring a reference to
 * <br>the old pixbuf instance: the copy function will actually duplicate
 * <br>the pixel data in memory and create a new [class&#64;Pixbuf] instance
 * <br>for it.
 * <br>
 * <br>&#35;&#35; Reference counting
 * <br>
 * <br>`GdkPixbuf` structures are reference counted. This means that an
 * <br>application can share a single pixbuf among many parts of the
 * <br>code. When a piece of the program needs to use a pixbuf, it should
 * <br>acquire a reference to it by calling `g_object_ref()`; when it no
 * <br>longer needs the pixbuf, it should release the reference it acquired
 * <br>by calling `g_object_unref()`. The resources associated with a
 * <br>`GdkPixbuf` will be freed when its reference count drops to zero.
 * <br>Newly-created `GdkPixbuf` instances start with a reference count
 * <br>of one.
 * <br>
 * <br>&#35;&#35; Image Data
 * <br>
 * <br>Image data in a pixbuf is stored in memory in an uncompressed,
 * <br>packed format. Rows in the image are stored top to bottom, and
 * <br>in each row pixels are stored from left to right.
 * <br>
 * <br>There may be padding at the end of a row.
 * <br>
 * <br>The &quot;rowstride&quot; value of a pixbuf, as returned by [`method&#64;GdkPixbuf.Pixbuf.get_rowstride`],
 * <br>indicates the number of bytes between rows.
 * <br>
 * <br>**NOTE**: If you are copying raw pixbuf data with `memcpy()` note that the
 * <br>last row in the pixbuf may not be as wide as the full rowstride, but rather
 * <br>just as wide as the pixel data needs to be; that is: it is unsafe to do
 * <br>`memcpy (dest, pixels, rowstride * height)` to copy a whole pixbuf. Use
 * <br>[method&#64;GdkPixbuf.Pixbuf.copy] instead, or compute the width in bytes of the
 * <br>last row as:
 * <br>
 * <br>```c
 * <br>last_row = width * ((n_channels * bits_per_sample + 7) / 8);
 * <br>```
 * <br>
 * <br>The same rule applies when iterating over each row of a `GdkPixbuf` pixels
 * <br>array.
 * <br>
 * <br>The following code illustrates a simple `put_pixel()`
 * <br>function for RGB pixbufs with 8 bits per channel with an alpha
 * <br>channel.
 * <br>
 * <br>```c
 * <br>static void
 * <br>put_pixel (GdkPixbuf *pixbuf,
 * <br>           int x,
 * <br>	   int y,
 * <br>	   guchar red,
 * <br>	   guchar green,
 * <br>	   guchar blue,
 * <br>	   guchar alpha)
 * <br>{
 * <br>  int n_channels = gdk_pixbuf_get_n_channels (pixbuf);
 * <br>
 * <br>  // Ensure that the pixbuf is valid
 * <br>  g_assert (gdk_pixbuf_get_colorspace (pixbuf) == GDK_COLORSPACE_RGB);
 * <br>  g_assert (gdk_pixbuf_get_bits_per_sample (pixbuf) == 8);
 * <br>  g_assert (gdk_pixbuf_get_has_alpha (pixbuf));
 * <br>  g_assert (n_channels == 4);
 * <br>
 * <br>  int width = gdk_pixbuf_get_width (pixbuf);
 * <br>  int height = gdk_pixbuf_get_height (pixbuf);
 * <br>
 * <br>  // Ensure that the coordinates are in a valid range
 * <br>  g_assert (x &gt;= 0 &amp;&amp; x &lt; width);
 * <br>  g_assert (y &gt;= 0 &amp;&amp; y &lt; height);
 * <br>
 * <br>  int rowstride = gdk_pixbuf_get_rowstride (pixbuf);
 * <br>
 * <br>  // The pixel buffer in the GdkPixbuf instance
 * <br>  guchar *pixels = gdk_pixbuf_get_pixels (pixbuf);
 * <br>
 * <br>  // The pixel we wish to modify
 * <br>  guchar *p = pixels + y * rowstride + x * n_channels;
 * <br>  p[0] = red;
 * <br>  p[1] = green;
 * <br>  p[2] = blue;
 * <br>  p[3] = alpha;
 * <br>}
 * <br>```
 * <br>
 * <br>&#35;&#35; Loading images
 * <br>
 * <br>The `GdkPixBuf` class provides a simple mechanism for loading
 * <br>an image from a file in synchronous and asynchronous fashion.
 * <br>
 * <br>For GUI applications, it is recommended to use the asynchronous
 * <br>stream API to avoid blocking the control flow of the application.
 * <br>
 * <br>Additionally, `GdkPixbuf` provides the [class&#64;GdkPixbuf.PixbufLoader`]
 * <br>API for progressive image loading.
 * <br>
 * <br>&#35;&#35; Saving images
 * <br>
 * <br>The `GdkPixbuf` class provides methods for saving image data in
 * <br>a number of file formats. The formatted data can be written to a
 * <br>file or to a memory buffer. `GdkPixbuf` can also call a user-defined
 * <br>callback on the data, which allows to e.g. write the image
 * <br>to a socket or store it in a database.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.Pixbuf.html">https://docs.gtk.org/gdk-pixbuf/class.Pixbuf.html</a></p>
*/
public class Pixbuf extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Pixbuf.class.getCanonicalName());
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
    
    private static JnaPixbuf.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaPixbuf.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Pixbuf(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GdkPixbuf out of in-memory readonly image data.
     * <br>
     * <br>Currently only RGB images with 8 bits per sample are supported.
     * <br>
     * <br>This is the `GBytes` variant of gdk_pixbuf_new_from_data(), useful
     * <br>for language bindings.
     * @param data Image data in 8-bit/sample packed format inside a &#35;GBytes
     * @param colorspace Colorspace for the image data
     * @param has_alpha Whether the data has an opacity channel
     * @param bits_per_sample Number of bits per sample
     * @param width Width of the image in pixels, must be &gt; 0
     * @param height Height of the image in pixels, must be &gt; 0
     * @param rowstride Distance in bytes between row starts
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromBytesPixbuf(@Nonnull ch.bailu.gtk.glib.Bytes data, int colorspace, boolean has_alpha, int bits_per_sample, int width, int height, int rowstride)  {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_bytes(asCPointerNotNull(data), colorspace, has_alpha, bits_per_sample, width, height, rowstride));
        if (__self.isNull()) {
            throw new NullPointerException("Pixbuf:newFromBytes");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * @param filename Name of file to load, in the GLib file   name encoding
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFilePixbuf(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file(asCPointerNotNull(filename), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFile");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * @param filename Name of file to load, in the GLib file   name encoding
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFilePixbuf(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file(filename, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFile");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * <br>
     * <br>The image will be scaled to fit in the requested size, optionally preserving
     * <br>the image's aspect ratio.
     * <br>
     * <br>When preserving the aspect ratio, a `width` of -1 will cause the image
     * <br>to be scaled to the exact given height, and a `height` of -1 will cause
     * <br>the image to be scaled to the exact given width. When not preserving
     * <br>aspect ratio, a `width` or `height` of -1 means to not scale the image
     * <br>at all in that dimension. Negative values for `width` and `height` are
     * <br>allowed since 2.8.
     * @param filename Name of file to load, in the GLib file     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFileAtScalePixbuf(@Nonnull ch.bailu.gtk.type.Str filename, int width, int height, boolean preserve_aspect_ratio) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file_at_scale(asCPointerNotNull(filename), width, height, preserve_aspect_ratio, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFileAtScale");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * <br>
     * <br>The image will be scaled to fit in the requested size, optionally preserving
     * <br>the image's aspect ratio.
     * <br>
     * <br>When preserving the aspect ratio, a `width` of -1 will cause the image
     * <br>to be scaled to the exact given height, and a `height` of -1 will cause
     * <br>the image to be scaled to the exact given width. When not preserving
     * <br>aspect ratio, a `width` or `height` of -1 means to not scale the image
     * <br>at all in that dimension. Negative values for `width` and `height` are
     * <br>allowed since 2.8.
     * @param filename Name of file to load, in the GLib file     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFileAtScalePixbuf(String filename, int width, int height, boolean preserve_aspect_ratio) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file_at_scale(filename, width, height, preserve_aspect_ratio, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFileAtScale");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * <br>
     * <br>The image will be scaled to fit in the requested size, preserving
     * <br>the image's aspect ratio. Note that the returned pixbuf may be smaller
     * <br>than `width` x `height`, if the aspect ratio requires it. To load
     * <br>and image at the requested size, regardless of aspect ratio, use
     * <br>[ctor&#64;GdkPixbuf.Pixbuf.new_from_file_at_scale].
     * @param filename Name of file to load, in the GLib file     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFileAtSizePixbuf(@Nonnull ch.bailu.gtk.type.Str filename, int width, int height) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file_at_size(asCPointerNotNull(filename), width, height, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFileAtSize");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then &#64;error will be set. Possible errors are:
     * <br>
     * <br> - the file could not be opened
     * <br> - there is no loader for the file's format
     * <br> - there is not enough memory to allocate the image buffer
     * <br> - the image buffer contains invalid data
     * <br>
     * <br>The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * <br>
     * <br>The image will be scaled to fit in the requested size, preserving
     * <br>the image's aspect ratio. Note that the returned pixbuf may be smaller
     * <br>than `width` x `height`, if the aspect ratio requires it. To load
     * <br>and image at the requested size, regardless of aspect ratio, use
     * <br>[ctor&#64;GdkPixbuf.Pixbuf.new_from_file_at_scale].
     * @param filename Name of file to load, in the GLib file     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromFileAtSizePixbuf(String filename, int width, int height) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_file_at_size(filename, width, height, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromFileAtSize");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * @param resource_path the path of the resource file
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromResourcePixbuf(@Nonnull ch.bailu.gtk.type.Str resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_resource(asCPointerNotNull(resource_path), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromResource");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * @param resource_path the path of the resource file
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromResourcePixbuf(String resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_resource(resource_path, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromResource");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * <br>
     * <br>The image will be scaled to fit in the requested size, optionally
     * <br>preserving the image's aspect ratio. When preserving the aspect ratio,
     * <br>a &#64;width of -1 will cause the image to be scaled to the exact given
     * <br>height, and a &#64;height of -1 will cause the image to be scaled to the
     * <br>exact given width. When not preserving aspect ratio, a &#64;width or
     * <br>&#64;height of -1 means to not scale the image at all in that dimension.
     * <br>
     * <br>The stream is not closed.
     * @param resource_path the path of the resource file
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromResourceAtScalePixbuf(@Nonnull ch.bailu.gtk.type.Str resource_path, int width, int height, boolean preserve_aspect_ratio) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_resource_at_scale(asCPointerNotNull(resource_path), width, height, preserve_aspect_ratio, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromResourceAtScale");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set.
     * <br>
     * <br>The image will be scaled to fit in the requested size, optionally
     * <br>preserving the image's aspect ratio. When preserving the aspect ratio,
     * <br>a &#64;width of -1 will cause the image to be scaled to the exact given
     * <br>height, and a &#64;height of -1 will cause the image to be scaled to the
     * <br>exact given width. When not preserving aspect ratio, a &#64;width or
     * <br>&#64;height of -1 means to not scale the image at all in that dimension.
     * <br>
     * <br>The stream is not closed.
     * @param resource_path the path of the resource file
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromResourceAtScalePixbuf(String resource_path, int width, int height, boolean preserve_aspect_ratio) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_resource_at_scale(resource_path, width, height, preserve_aspect_ratio, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromResourceAtScale");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * <br>
     * <br>The file format is detected automatically.
     * <br>
     * <br>If `NULL` is returned, then `error` will be set.
     * <br>
     * <br>The `cancellable` can be used to abort the operation from another thread.
     * <br>If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * <br>returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * <br>`G_IO_ERROR` domains.
     * <br>
     * <br>The stream is not closed.
     * @param stream a `GInputStream` to load the pixbuf from
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromStreamPixbuf(@Nonnull ch.bailu.gtk.gio.InputStream stream, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_stream(asCPointerNotNull(stream), asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromStream");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * <br>
     * <br>The file format is detected automatically. If `NULL` is returned, then
     * <br>&#64;error will be set. The &#64;cancellable can be used to abort the operation
     * <br>from another thread. If the operation was cancelled, the error
     * <br>`G_IO_ERROR_CANCELLED` will be returned. Other possible errors are in
     * <br>the `GDK_PIXBUF_ERROR` and `G_IO_ERROR` domains.
     * <br>
     * <br>The image will be scaled to fit in the requested size, optionally
     * <br>preserving the image's aspect ratio.
     * <br>
     * <br>When preserving the aspect ratio, a `width` of -1 will cause the image to be
     * <br>scaled to the exact given height, and a `height` of -1 will cause the image
     * <br>to be scaled to the exact given width. If both `width` and `height` are
     * <br>given, this function will behave as if the smaller of the two values
     * <br>is passed as -1.
     * <br>
     * <br>When not preserving aspect ratio, a `width` or `height` of -1 means to not
     * <br>scale the image at all in that dimension.
     * <br>
     * <br>The stream is not closed.
     * @param stream a `GInputStream` to load the pixbuf from
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromStreamAtScalePixbuf(@Nonnull ch.bailu.gtk.gio.InputStream stream, int width, int height, boolean preserve_aspect_ratio, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_stream_at_scale(asCPointerNotNull(stream), width, height, preserve_aspect_ratio, asCPointer(cancellable), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromStreamAtScale");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Finishes an asynchronous pixbuf creation operation started with
     * <br>gdk_pixbuf_new_from_stream_async().
     * @param async_result a `GAsyncResult`
     * @return the newly created pixbuf
    */
    public static Pixbuf newFromStreamFinishPixbuf(@Nonnull ch.bailu.gtk.gio.AsyncResult async_result) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_stream_finish(asCPointerNotNull(async_result), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Pixbuf:newFromStreamFinish");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     * <br>
     * <br>This data is commonly the result of including an XPM file into a
     * <br>program's C source.
     * @param data Pointer to inline XPM data.
     * @return A newly-created pixbuf
    */
    public static Pixbuf newFromXpmDataPixbuf(@Nonnull ch.bailu.gtk.type.Strs data)  {
        PointerContainer __self = cast(JnaPixbuf.INST().gdk_pixbuf_new_from_xpm_data(asCPointerNotNull(data)));
        if (__self.isNull()) {
            throw new NullPointerException("Pixbuf:newFromXpmData");
        }
        return new Pixbuf(__self);
    }        
    

    /**
     * Creates a new `GdkPixbuf` structure and allocates a buffer for it.
     * <br>
     * <br>If the allocation of the buffer failed, this function will return `NULL`.
     * <br>
     * <br>The buffer has an optimal rowstride. Note that the buffer is not cleared;
     * <br>you will have to fill it completely yourself.
     * @param colorspace Color space for image
     * @param has_alpha Whether the image should have transparency information
     * @param bits_per_sample Number of bits per color sample
     * @param width Width of image in pixels, must be &gt; 0
     * @param height Height of image in pixels, must be &gt; 0
    */
    public Pixbuf(int colorspace, boolean has_alpha, int bits_per_sample, int width, int height) {
        super(cast(JnaPixbuf.INST().gdk_pixbuf_new(colorspace, has_alpha, bits_per_sample, width, height)));
    }

    /**
     * Takes an existing pixbuf and checks for the presence of an
     * <br>associated &quot;orientation&quot; option.
     * <br>
     * <br>The orientation option may be provided by the JPEG loader (which
     * <br>reads the exif orientation tag) or the TIFF loader (which reads
     * <br>the TIFF orientation tag, and compensates it for the partial
     * <br>transforms performed by libtiff).
     * <br>
     * <br>If an orientation option/tag is present, the appropriate transform
     * <br>will be performed so that the pixbuf is oriented correctly.
     * @return A newly-created pixbuf
    */
    public Pixbuf applyEmbeddedOrientation()  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_apply_embedded_orientation(asCPointer())));
    }

    /**
     * Creates a transformation of the source image &#64;src by scaling by
     * <br>&#64;scale_x and &#64;scale_y then translating by &#64;offset_x and &#64;offset_y.
     * <br>
     * <br>This gives an image in the coordinates of the destination pixbuf.
     * <br>The rectangle (&#64;dest_x, &#64;dest_y, &#64;dest_width, &#64;dest_height)
     * <br>is then alpha blended onto the corresponding rectangle of the
     * <br>original destination image.
     * <br>
     * <br>When the destination rectangle contains parts not in the source
     * <br>image, the data at the edges of the source image is replicated
     * <br>to infinity.
     * <br>
     * <br>![](composite.png)
     * @param dest the &#35;GdkPixbuf into which to render the results
     * @param dest_x the left coordinate for region to render
     * @param dest_y the top coordinate for region to render
     * @param dest_width the width of the region to render
     * @param dest_height the height of the region to render
     * @param offset_x the offset in the X direction (currently rounded to an integer)
     * @param offset_y the offset in the Y direction (currently rounded to an integer)
     * @param scale_x the scale factor in the X direction
     * @param scale_y the scale factor in the Y direction
     * @param interp_type the interpolation type for the transformation.
     * @param overall_alpha overall alpha for source image (0..255)
    */
    public void composite(@Nonnull Pixbuf dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type, int overall_alpha)  {
        JnaPixbuf.INST().gdk_pixbuf_composite(asCPointer(), asCPointerNotNull(dest), dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type, overall_alpha);
    }

    /**
     * Creates a transformation of the source image &#64;src by scaling by
     * <br>&#64;scale_x and &#64;scale_y then translating by &#64;offset_x and &#64;offset_y,
     * <br>then alpha blends the rectangle (&#64;dest_x ,&#64;dest_y, &#64;dest_width,
     * <br>&#64;dest_height) of the resulting image with a checkboard of the
     * <br>colors &#64;color1 and &#64;color2 and renders it onto the destination
     * <br>image.
     * <br>
     * <br>If the source image has no alpha channel, and &#64;overall_alpha is 255, a fast
     * <br>path is used which omits the alpha blending and just performs the scaling.
     * <br>
     * <br>See gdk_pixbuf_composite_color_simple() for a simpler variant of this
     * <br>function suitable for many tasks.
     * @param dest the &#35;GdkPixbuf into which to render the results
     * @param dest_x the left coordinate for region to render
     * @param dest_y the top coordinate for region to render
     * @param dest_width the width of the region to render
     * @param dest_height the height of the region to render
     * @param offset_x the offset in the X direction (currently rounded to an integer)
     * @param offset_y the offset in the Y direction (currently rounded to an integer)
     * @param scale_x the scale factor in the X direction
     * @param scale_y the scale factor in the Y direction
     * @param interp_type the interpolation type for the transformation.
     * @param overall_alpha overall alpha for source image (0..255)
     * @param check_x the X offset for the checkboard (origin of checkboard is at -&#64;check_x, -&#64;check_y)
     * @param check_y the Y offset for the checkboard
     * @param check_size the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
    */
    public void compositeColor(@Nonnull Pixbuf dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type, int overall_alpha, int check_x, int check_y, int check_size, int color1, int color2)  {
        JnaPixbuf.INST().gdk_pixbuf_composite_color(asCPointer(), asCPointerNotNull(dest), dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type, overall_alpha, check_x, check_y, check_size, color1, color2);
    }

    /**
     * Creates a new pixbuf by scaling `src` to `dest_width` x `dest_height`
     * <br>and alpha blending the result with a checkboard of colors `color1`
     * <br>and `color2`.
     * @param dest_width the width of destination image
     * @param dest_height the height of destination image
     * @param interp_type the interpolation type for the transformation.
     * @param overall_alpha overall alpha for source image (0..255)
     * @param check_size the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
     * @return the new pixbuf
    */
    public Pixbuf compositeColorSimple(int dest_width, int dest_height, int interp_type, int overall_alpha, int check_size, int color1, int color2)  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_composite_color_simple(asCPointer(), dest_width, dest_height, interp_type, overall_alpha, check_size, color1, color2)));
    }

    /**
     * Creates a new `GdkPixbuf` with a copy of the information in the specified
     * <br>`pixbuf`.
     * <br>
     * <br>Note that this does not copy the options set on the original `GdkPixbuf`,
     * <br>use gdk_pixbuf_copy_options() for this.
     * @return A newly-created pixbuf
    */
    public Pixbuf copy()  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_copy(asCPointer())));
    }

    /**
     * Copies a rectangular area from `src_pixbuf` to `dest_pixbuf`.
     * <br>
     * <br>Conversion of pixbuf formats is done automatically.
     * <br>
     * <br>If the source rectangle overlaps the destination rectangle on the
     * <br>same pixbuf, it will be overwritten during the copy operation.
     * <br>Therefore, you can not use this function to scroll a pixbuf.
     * @param src_x Source X coordinate within &#64;src_pixbuf.
     * @param src_y Source Y coordinate within &#64;src_pixbuf.
     * @param width Width of the area to copy.
     * @param height Height of the area to copy.
     * @param dest_pixbuf Destination pixbuf.
     * @param dest_x X coordinate within &#64;dest_pixbuf.
     * @param dest_y Y coordinate within &#64;dest_pixbuf.
    */
    public void copyArea(int src_x, int src_y, int width, int height, @Nonnull Pixbuf dest_pixbuf, int dest_x, int dest_y)  {
        JnaPixbuf.INST().gdk_pixbuf_copy_area(asCPointer(), src_x, src_y, width, height, asCPointerNotNull(dest_pixbuf), dest_x, dest_y);
    }

    /**
     * Copies the key/value pair options attached to a `GdkPixbuf` to another
     * <br>`GdkPixbuf`.
     * <br>
     * <br>This is useful to keep original metadata after having manipulated
     * <br>a file. However be careful to remove metadata which you've already
     * <br>applied, such as the &quot;orientation&quot; option after rotating the image.
     * @param dest_pixbuf the destination pixbuf
     * @return `TRUE` on success.
    */
    public boolean copyOptions(@Nonnull Pixbuf dest_pixbuf)  {
        return JnaPixbuf.INST().gdk_pixbuf_copy_options(asCPointer(), asCPointerNotNull(dest_pixbuf));
    }

    /**
     * Clears a pixbuf to the given RGBA value, converting the RGBA value into
     * <br>the pixbuf's pixel format.
     * <br>
     * <br>The alpha component will be ignored if the pixbuf doesn't have an alpha
     * <br>channel.
     * @param pixel RGBA pixel to used to clear (`0xffffffff` is opaque white,   `0x00000000` transparent black)
    */
    public void fill(int pixel)  {
        JnaPixbuf.INST().gdk_pixbuf_fill(asCPointer(), pixel);
    }

    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * <br>result in a new pixbuf.
     * @param horizontal `TRUE` to flip horizontally, `FALSE` to flip vertically
     * @return the new pixbuf
    */
    public Pixbuf flip(boolean horizontal)  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_flip(asCPointer(), horizontal)));
    }

    /**
     * Queries the number of bits per color sample in a pixbuf.
     * @return Number of bits per color sample.
    */
    public int getBitsPerSample()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_bits_per_sample(asCPointer());
    }

    /**
     * Returns the length of the pixel data, in bytes.
     * @return The length of the pixel data.
    */
    public long getByteLength()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_byte_length(asCPointer());
    }

    /**
     * Queries the color space of a pixbuf.
     * @return Color space.
    */
    public int getColorspace()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_colorspace(asCPointer());
    }

    /**
     * Queries whether a pixbuf has an alpha channel (opacity information).
     * @return `TRUE` if it has an alpha channel, `FALSE` otherwise.
    */
    public boolean getHasAlpha()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_has_alpha(asCPointer());
    }

    /**
     * Queries the height of a pixbuf.
     * @return Height in pixels.
    */
    public int getHeight()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_height(asCPointer());
    }

    /**
     * Queries the number of channels of a pixbuf.
     * @return Number of channels.
    */
    public int getNChannels()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_n_channels(asCPointer());
    }

    /**
     * Looks up &#64;key in the list of options that may have been attached to the
     * <br>&#64;pixbuf when it was loaded, or that may have been attached by another
     * <br>function using gdk_pixbuf_set_option().
     * <br>
     * <br>For instance, the ANI loader provides &quot;Title&quot; and &quot;Artist&quot; options.
     * <br>The ICO, XBM, and XPM loaders provide &quot;x_hot&quot; and &quot;y_hot&quot; hot-spot
     * <br>options for cursor definitions. The PNG loader provides the tEXt ancillary
     * <br>chunk key/value pairs as options. Since 2.12, the TIFF and JPEG loaders
     * <br>return an &quot;orientation&quot; option string that corresponds to the embedded
     * <br>TIFF/Exif orientation tag (if present). Since 2.32, the TIFF loader sets
     * <br>the &quot;multipage&quot; option string to &quot;yes&quot; when a multi-page TIFF is loaded.
     * <br>Since 2.32 the JPEG and PNG loaders set &quot;x-dpi&quot; and &quot;y-dpi&quot; if the file
     * <br>contains image density information in dots per inch.
     * <br>Since 2.36.6, the JPEG loader sets the &quot;comment&quot; option with the comment
     * <br>EXIF tag.
     * @param key a nul-terminated string.
     * @return the value associated with `key`
    */
    public ch.bailu.gtk.type.Str getOption(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_option(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Looks up &#64;key in the list of options that may have been attached to the
     * <br>&#64;pixbuf when it was loaded, or that may have been attached by another
     * <br>function using gdk_pixbuf_set_option().
     * <br>
     * <br>For instance, the ANI loader provides &quot;Title&quot; and &quot;Artist&quot; options.
     * <br>The ICO, XBM, and XPM loaders provide &quot;x_hot&quot; and &quot;y_hot&quot; hot-spot
     * <br>options for cursor definitions. The PNG loader provides the tEXt ancillary
     * <br>chunk key/value pairs as options. Since 2.12, the TIFF and JPEG loaders
     * <br>return an &quot;orientation&quot; option string that corresponds to the embedded
     * <br>TIFF/Exif orientation tag (if present). Since 2.32, the TIFF loader sets
     * <br>the &quot;multipage&quot; option string to &quot;yes&quot; when a multi-page TIFF is loaded.
     * <br>Since 2.32 the JPEG and PNG loaders set &quot;x-dpi&quot; and &quot;y-dpi&quot; if the file
     * <br>contains image density information in dots per inch.
     * <br>Since 2.36.6, the JPEG loader sets the &quot;comment&quot; option with the comment
     * <br>EXIF tag.
     * @param key a nul-terminated string.
     * @return the value associated with `key`
    */
    public ch.bailu.gtk.type.Str getOption(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_option(asCPointer(), key)));
    }

    /**
     * Returns a `GHashTable` with a list of all the options that may have been
     * <br>attached to the `pixbuf` when it was loaded, or that may have been
     * <br>attached by another function using [method&#64;GdkPixbuf.Pixbuf.set_option].
     * @return a &#35;GHashTable   of key/values pairs
    */
    public ch.bailu.gtk.glib.HashTable getOptions()  {
        return new ch.bailu.gtk.glib.HashTable(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_options(asCPointer())));
    }

    /**
     * Queries the rowstride of a pixbuf, which is the number of bytes between
     * <br>the start of a row and the start of the next row.
     * @return Distance between row starts.
    */
    public int getRowstride()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_rowstride(asCPointer());
    }

    /**
     * Queries the width of a pixbuf.
     * @return Width in pixels.
    */
    public int getWidth()  {
        return JnaPixbuf.INST().gdk_pixbuf_get_width(asCPointer());
    }

    /**
     * Creates a new pixbuf which represents a sub-region of `src_pixbuf`.
     * <br>
     * <br>The new pixbuf shares its pixels with the original pixbuf, so
     * <br>writing to one affects both.  The new pixbuf holds a reference to
     * <br>`src_pixbuf`, so `src_pixbuf` will not be finalized until the new
     * <br>pixbuf is finalized.
     * <br>
     * <br>Note that if `src_pixbuf` is read-only, this function will force it
     * <br>to be mutable.
     * @param src_x X coord in &#64;src_pixbuf
     * @param src_y Y coord in &#64;src_pixbuf
     * @param width width of region in &#64;src_pixbuf
     * @param height height of region in &#64;src_pixbuf
     * @return a new pixbuf
    */
    public Pixbuf newSubpixbuf(int src_x, int src_y, int width, int height)  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_new_subpixbuf(asCPointer(), src_x, src_y, width, height)));
    }

    /**
     * Provides a &#35;GBytes buffer containing the raw pixel data; the data
     * <br>must not be modified.
     * <br>
     * <br>This function allows skipping the implicit copy that must be made
     * <br>if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     * @return A new reference to a read-only copy of   the pixel data.  Note that for mutable pixbufs, this function will   incur a one-time copy of the pixel data for conversion into the   returned &#35;GBytes.
    */
    public ch.bailu.gtk.glib.Bytes readPixelBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_read_pixel_bytes(asCPointer())));
    }

    /**
     * Removes the key/value pair option attached to a `GdkPixbuf`.
     * @param key a nul-terminated string representing the key to remove.
     * @return `TRUE` if an option was removed, `FALSE` if not.
    */
    public boolean removeOption(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaPixbuf.INST().gdk_pixbuf_remove_option(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Removes the key/value pair option attached to a `GdkPixbuf`.
     * @param key a nul-terminated string representing the key to remove.
     * @return `TRUE` if an option was removed, `FALSE` if not.
    */
    public boolean removeOption(String key)  {
        return JnaPixbuf.INST().gdk_pixbuf_remove_option(asCPointer(), key);
    }

    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * <br>result in a new pixbuf.
     * <br>
     * <br>If `angle` is 0, this function will return a copy of `src`.
     * @param angle the angle to rotate by
     * @return the new pixbuf
    */
    public Pixbuf rotateSimple(int angle)  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_rotate_simple(asCPointer(), angle)));
    }

    /**
     * Modifies saturation and optionally pixelates `src`, placing the result in
     * <br>`dest`.
     * <br>
     * <br>The `src` and `dest` pixbufs must have the same image format, size, and
     * <br>rowstride.
     * <br>
     * <br>The `src` and `dest` arguments may be the same pixbuf with no ill effects.
     * <br>
     * <br>If `saturation` is 1.0 then saturation is not changed. If it's less than 1.0,
     * <br>saturation is reduced (the image turns toward grayscale); if greater than
     * <br>1.0, saturation is increased (the image gets more vivid colors).
     * <br>
     * <br>If `pixelate` is `TRUE`, then pixels are faded in a checkerboard pattern to
     * <br>create a pixelated image.
     * @param dest place to write modified version of &#64;src
     * @param saturation saturation factor
     * @param pixelate whether to pixelate
    */
    public void saturateAndPixelate(@Nonnull Pixbuf dest, float saturation, boolean pixelate)  {
        JnaPixbuf.INST().gdk_pixbuf_saturate_and_pixelate(asCPointer(), asCPointerNotNull(dest), saturation, pixelate);
    }

    /**
     * Saves `pixbuf` to an output stream asynchronously.
     * <br>
     * <br>For more details see gdk_pixbuf_save_to_stream(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, `callback` will be called in the main thread.
     * <br>
     * <br>You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * <br>the operation.
     * @param stream a `GOutputStream` to which to save the pixbuf
     * @param type name of file format
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is saved
     * @param user_data the data to pass to the callback function
     * @param _elipse list of key-value save options
    */
    public void saveToStreamAsync(@Nonnull ch.bailu.gtk.gio.OutputStream stream, @Nonnull ch.bailu.gtk.type.Str type, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, java.lang.Object... _elipse)  {
        JnaPixbuf.INST().gdk_pixbuf_save_to_stream_async(asCPointer(), asCPointerNotNull(stream), asCPointerNotNull(type), asCPointer(cancellable), toOnAsyncReadyCallback(this, "saveToStreamAsync", callback), asCPointer(user_data), _elipse);
    }

    /**
     * Saves `pixbuf` to an output stream asynchronously.
     * <br>
     * <br>For more details see gdk_pixbuf_save_to_stream(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, `callback` will be called in the main thread.
     * <br>
     * <br>You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * <br>the operation.
     * @param stream a `GOutputStream` to which to save the pixbuf
     * @param type name of file format
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is saved
     * @param user_data the data to pass to the callback function
     * @param _elipse list of key-value save options
    */
    public void saveToStreamAsync(@Nonnull ch.bailu.gtk.gio.OutputStream stream, String type, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, java.lang.Object... _elipse)  {
        JnaPixbuf.INST().gdk_pixbuf_save_to_stream_async(asCPointer(), asCPointerNotNull(stream), type, asCPointer(cancellable), toOnAsyncReadyCallback(this, "saveToStreamAsync", callback), asCPointer(user_data), _elipse);
    }

    /**
     * Saves `pixbuf` to an output stream.
     * <br>
     * <br>Supported file formats are currently &quot;jpeg&quot;, &quot;tiff&quot;, &quot;png&quot;, &quot;ico&quot; or
     * <br>&quot;bmp&quot;.
     * <br>
     * <br>See [method&#64;GdkPixbuf.Pixbuf.save_to_stream] for more details.
     * @param stream a `GOutputStream` to save the pixbuf to
     * @param type name of file format
     * @param option_keys name of options to set
     * @param option_values values for named options
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return `TRUE` if the pixbuf was saved successfully, `FALSE` if an   error was set.
    */
    public boolean saveToStreamv(@Nonnull ch.bailu.gtk.gio.OutputStream stream, @Nonnull ch.bailu.gtk.type.Str type, @Nullable ch.bailu.gtk.type.Strs option_keys, @Nullable ch.bailu.gtk.type.Strs option_values, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_save_to_streamv(asCPointer(), asCPointerNotNull(stream), asCPointerNotNull(type), asCPointer(option_keys), asCPointer(option_values), asCPointer(cancellable), 0L);
    }

    /**
     * Saves `pixbuf` to an output stream.
     * <br>
     * <br>Supported file formats are currently &quot;jpeg&quot;, &quot;tiff&quot;, &quot;png&quot;, &quot;ico&quot; or
     * <br>&quot;bmp&quot;.
     * <br>
     * <br>See [method&#64;GdkPixbuf.Pixbuf.save_to_stream] for more details.
     * @param stream a `GOutputStream` to save the pixbuf to
     * @param type name of file format
     * @param option_keys name of options to set
     * @param option_values values for named options
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @return `TRUE` if the pixbuf was saved successfully, `FALSE` if an   error was set.
    */
    public boolean saveToStreamv(@Nonnull ch.bailu.gtk.gio.OutputStream stream, String type, @Nullable ch.bailu.gtk.type.Strs option_keys, @Nullable ch.bailu.gtk.type.Strs option_values, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_save_to_streamv(asCPointer(), asCPointerNotNull(stream), type, asCPointer(option_keys), asCPointer(option_values), asCPointer(cancellable), 0L);
    }

    /**
     * Vector version of `gdk_pixbuf_save()`.
     * <br>
     * <br>Saves pixbuf to a file in `type`, which is currently &quot;jpeg&quot;, &quot;png&quot;, &quot;tiff&quot;, &quot;ico&quot; or &quot;bmp&quot;.
     * <br>
     * <br>If &#64;error is set, `FALSE` will be returned.
     * <br>
     * <br>See [method&#64;GdkPixbuf.Pixbuf.save] for more details.
     * @param filename name of file to save.
     * @param type name of file format.
     * @param option_keys name of options to set
     * @param option_values values for named options
     * @return whether an error was set
    */
    public boolean savev(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Str type, @Nullable ch.bailu.gtk.type.Strs option_keys, @Nullable ch.bailu.gtk.type.Strs option_values) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_savev(asCPointer(), asCPointerNotNull(filename), asCPointerNotNull(type), asCPointer(option_keys), asCPointer(option_values), 0L);
    }

    /**
     * Vector version of `gdk_pixbuf_save()`.
     * <br>
     * <br>Saves pixbuf to a file in `type`, which is currently &quot;jpeg&quot;, &quot;png&quot;, &quot;tiff&quot;, &quot;ico&quot; or &quot;bmp&quot;.
     * <br>
     * <br>If &#64;error is set, `FALSE` will be returned.
     * <br>
     * <br>See [method&#64;GdkPixbuf.Pixbuf.save] for more details.
     * @param filename name of file to save.
     * @param type name of file format.
     * @param option_keys name of options to set
     * @param option_values values for named options
     * @return whether an error was set
    */
    public boolean savev(String filename, String type, @Nullable ch.bailu.gtk.type.Strs option_keys, @Nullable ch.bailu.gtk.type.Strs option_values) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_savev(asCPointer(), filename, type, asCPointer(option_keys), asCPointer(option_values), 0L);
    }

    /**
     * Creates a transformation of the source image &#64;src by scaling by
     * <br>&#64;scale_x and &#64;scale_y then translating by &#64;offset_x and &#64;offset_y,
     * <br>then renders the rectangle (&#64;dest_x, &#64;dest_y, &#64;dest_width,
     * <br>&#64;dest_height) of the resulting image onto the destination image
     * <br>replacing the previous contents.
     * <br>
     * <br>Try to use gdk_pixbuf_scale_simple() first; this function is
     * <br>the industrial-strength power tool you can fall back to, if
     * <br>gdk_pixbuf_scale_simple() isn't powerful enough.
     * <br>
     * <br>If the source rectangle overlaps the destination rectangle on the
     * <br>same pixbuf, it will be overwritten during the scaling which
     * <br>results in rendering artifacts.
     * @param dest the &#35;GdkPixbuf into which to render the results
     * @param dest_x the left coordinate for region to render
     * @param dest_y the top coordinate for region to render
     * @param dest_width the width of the region to render
     * @param dest_height the height of the region to render
     * @param offset_x the offset in the X direction (currently rounded to an integer)
     * @param offset_y the offset in the Y direction (currently rounded to an integer)
     * @param scale_x the scale factor in the X direction
     * @param scale_y the scale factor in the Y direction
     * @param interp_type the interpolation type for the transformation.
    */
    public void scale(@Nonnull Pixbuf dest, int dest_x, int dest_y, int dest_width, int dest_height, double offset_x, double offset_y, double scale_x, double scale_y, int interp_type)  {
        JnaPixbuf.INST().gdk_pixbuf_scale(asCPointer(), asCPointerNotNull(dest), dest_x, dest_y, dest_width, dest_height, offset_x, offset_y, scale_x, scale_y, interp_type);
    }

    /**
     * Create a new pixbuf containing a copy of `src` scaled to
     * <br>`dest_width` x `dest_height`.
     * <br>
     * <br>This function leaves `src` unaffected.
     * <br>
     * <br>The `interp_type` should be `GDK_INTERP_NEAREST` if you want maximum
     * <br>speed (but when scaling down `GDK_INTERP_NEAREST` is usually unusably
     * <br>ugly). The default `interp_type` should be `GDK_INTERP_BILINEAR` which
     * <br>offers reasonable quality and speed.
     * <br>
     * <br>You can scale a sub-portion of `src` by creating a sub-pixbuf
     * <br>pointing into `src`; see [method&#64;GdkPixbuf.Pixbuf.new_subpixbuf].
     * <br>
     * <br>If `dest_width` and `dest_height` are equal to the width and height of
     * <br>`src`, this function will return an unscaled copy of `src`.
     * <br>
     * <br>For more complicated scaling/alpha blending see [method&#64;GdkPixbuf.Pixbuf.scale]
     * <br>and [method&#64;GdkPixbuf.Pixbuf.composite].
     * @param dest_width the width of destination image
     * @param dest_height the height of destination image
     * @param interp_type the interpolation type for the transformation.
     * @return the new pixbuf
    */
    public Pixbuf scaleSimple(int dest_width, int dest_height, int interp_type)  {
        return new Pixbuf(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_scale_simple(asCPointer(), dest_width, dest_height, interp_type)));
    }

    /**
     * Attaches a key/value pair as an option to a `GdkPixbuf`.
     * <br>
     * <br>If `key` already exists in the list of options attached to the `pixbuf`,
     * <br>the new value is ignored and `FALSE` is returned.
     * @param key a nul-terminated string.
     * @param value a nul-terminated string.
     * @return `TRUE` on success
    */
    public boolean setOption(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str value)  {
        return JnaPixbuf.INST().gdk_pixbuf_set_option(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(value));
    }

    /**
     * Attaches a key/value pair as an option to a `GdkPixbuf`.
     * <br>
     * <br>If `key` already exists in the list of options attached to the `pixbuf`,
     * <br>the new value is ignored and `FALSE` is returned.
     * @param key a nul-terminated string.
     * @param value a nul-terminated string.
     * @return `TRUE` on success
    */
    public boolean setOption(String key, String value)  {
        return JnaPixbuf.INST().gdk_pixbuf_set_option(asCPointer(), key, value);
    }

    /**
     * Calculates the rowstride that an image created with those values would
     * <br>have.
     * <br>
     * <br>This function is useful for front-ends and backends that want to check
     * <br>image values without needing to create a `GdkPixbuf`.
     * @param colorspace Color space for image
     * @param has_alpha Whether the image should have transparency information
     * @param bits_per_sample Number of bits per color sample
     * @param width Width of image in pixels, must be &gt; 0
     * @param height Height of image in pixels, must be &gt; 0
     * @return the rowstride for the given values, or -1 in case of error.
    */
    public static int calculateRowstride(int colorspace, boolean has_alpha, int bits_per_sample, int width, int height)  {
        return JnaPixbuf.INST().gdk_pixbuf_calculate_rowstride(colorspace, has_alpha, bits_per_sample, width, height);
    }

    /**
     * Parses an image file far enough to determine its format and size.
     * @param filename The name of the file to identify.
     * @param width Return location for the width of the image
     * @param height Return location for the height of the image
     * @return A `GdkPixbufFormat` describing   the image format of the file
    */
    public static PixbufFormat getFileInfo(@Nonnull ch.bailu.gtk.type.Str filename, @Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        return new PixbufFormat(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_file_info(asCPointerNotNull(filename), asCPointer(width), asCPointer(height))));
    }

    /**
     * Asynchronously parses an image file far enough to determine its
     * <br>format and size.
     * <br>
     * <br>For more details see gdk_pixbuf_get_file_info(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called in the
     * <br>main thread. You can then call gdk_pixbuf_get_file_info_finish() to
     * <br>get the result of the operation.
     * @param filename The name of the file to identify
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the file info is available
     * @param user_data the data to pass to the callback function
    */
    public static void getFileInfoAsync(@Nonnull ch.bailu.gtk.type.Str filename, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPixbuf.INST().gdk_pixbuf_get_file_info_async(asCPointerNotNull(filename), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "getFileInfoAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous pixbuf parsing operation started with
     * <br>gdk_pixbuf_get_file_info_async().
     * @param async_result a `GAsyncResult`
     * @param width Return location for the width of the image, or `NULL`
     * @param height Return location for the height of the image, or `NULL`
     * @return A `GdkPixbufFormat` describing the   image format of the file
    */
    public static PixbufFormat getFileInfoFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult async_result, @Nonnull ch.bailu.gtk.type.Int width, @Nonnull ch.bailu.gtk.type.Int height) throws ch.bailu.gtk.type.exception.AllocationError {
        return new PixbufFormat(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_file_info_finish(asCPointerNotNull(async_result), asCPointerNotNull(width), asCPointerNotNull(height), 0L)));
    }

    /**
     * Obtains the available information about the image formats supported
     * <br>by GdkPixbuf.
     * @return A list of   support image formats.
    */
    public static ch.bailu.gtk.glib.SList getFormats()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaPixbuf.INST().gdk_pixbuf_get_formats()));
    }

    /**
     * Initalizes the gdk-pixbuf loader modules referenced by the `loaders.cache`
     * <br>file present inside that directory.
     * <br>
     * <br>This is to be used by applications that want to ship certain loaders
     * <br>in a different location from the system ones.
     * <br>
     * <br>This is needed when the OS or runtime ships a minimal number of loaders
     * <br>so as to reduce the potential attack surface of carefully crafted image
     * <br>files, especially for uncommon file types. Applications that require
     * <br>broader image file types coverage, such as image viewers, would be
     * <br>expected to ship the gdk-pixbuf modules in a separate location, bundled
     * <br>with the application in a separate directory from the OS or runtime-
     * <br>provided modules.
     * @param path Path to directory where the `loaders.cache` is installed
     * @return 
    */
    public static boolean initModules(@Nonnull ch.bailu.gtk.type.Str path) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_init_modules(asCPointerNotNull(path), 0L);
    }

    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <br>
     * <br>For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called in the main thread.
     * <br>You can then call gdk_pixbuf_new_from_stream_finish() to get the result of
     * <br>the operation.
     * @param stream a `GInputStream` from which to load the pixbuf
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
     * @param user_data the data to pass to the callback function
    */
    public static void newFromStreamAsync(@Nonnull ch.bailu.gtk.gio.InputStream stream, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPixbuf.INST().gdk_pixbuf_new_from_stream_async(asCPointerNotNull(stream), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newFromStreamAsync", callback), asCPointer(user_data));
    }

    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <br>
     * <br>For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the synchronous
     * <br>version of this function.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called in the main thread.
     * <br>You can then call gdk_pixbuf_new_from_stream_finish() to get the result of the operation.
     * @param stream a `GInputStream` from which to load the pixbuf
     * @param width the width the image should have or -1 to not constrain the width
     * @param height the height the image should have or -1 to not constrain the height
     * @param preserve_aspect_ratio `TRUE` to preserve the image's aspect ratio
     * @param cancellable optional `GCancellable` object, `NULL` to ignore
     * @param callback a `GAsyncReadyCallback` to call when the pixbuf is loaded
     * @param user_data the data to pass to the callback function
    */
    public static void newFromStreamAtScaleAsync(@Nonnull ch.bailu.gtk.gio.InputStream stream, int width, int height, boolean preserve_aspect_ratio, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPixbuf.INST().gdk_pixbuf_new_from_stream_at_scale_async(asCPointerNotNull(stream), width, height, preserve_aspect_ratio, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newFromStreamAtScaleAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous pixbuf save operation started with
     * <br>gdk_pixbuf_save_to_stream_async().
     * @param async_result a `GAsyncResult`
     * @return `TRUE` if the pixbuf was saved successfully, `FALSE` if an error was set.
    */
    public static boolean saveToStreamFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult async_result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbuf.INST().gdk_pixbuf_save_to_stream_finish(asCPointerNotNull(async_result), 0L);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.Icon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.Icon}
    */
    public ch.bailu.gtk.gio.Icon asIcon() {
        return new ch.bailu.gtk.gio.Icon(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.LoadableIcon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.LoadableIcon}
    */
    public ch.bailu.gtk.gio.LoadableIcon asLoadableIcon() {
        return new ch.bailu.gtk.gio.LoadableIcon(cast());
    }

    public static long getTypeID() { 
        return JnaPixbuf.INST().gdk_pixbuf_get_type(); 
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

[MethodModel:java-type-not-supported:cb-not-supported:newFromData:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GdkColorspace}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:PixbufDestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:java-type-not-supported:newFromInline:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:addAlpha:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]

[MethodModel:cb-return-value-not-supported:getPixels:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:getPixelsWithLength:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:cb-return-value-not-supported:readPixels:[ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]]

[MethodModel:cb-deprecated:ref:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]

[MethodModel:java-type-not-supported:save:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:java-type-not-supported:saveToBuffer:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:saveToBufferv:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]

[MethodModel:cb-not-supported:java-type-not-supported:saveToCallback:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:PixbufSaveFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-not-supported:saveToCallbackv:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:PixbufSaveFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]

[MethodModel:java-type-not-supported:saveToStream:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:OutputStream:{c:GOutputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:java-type-not-supported:saveToStreamvAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:OutputStream:{c:GOutputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:unref:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
