/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Incremental image loader.
 * <br>
 * <br>`GdkPixbufLoader` provides a way for applications to drive the
 * <br>process of loading an image, by letting them send the image data
 * <br>directly to the loader instead of having the loader read the data
 * <br>from a file. Applications can use this functionality instead of
 * <br>`gdk_pixbuf_new_from_file()` or `gdk_pixbuf_animation_new_from_file()`
 * <br>when they need to parse image data in small chunks. For example,
 * <br>it should be used when reading an image from a (potentially) slow
 * <br>network connection, or when loading an extremely large file.
 * <br>
 * <br>To use `GdkPixbufLoader` to load an image, create a new instance,
 * <br>and call [method&#64;GdkPixbuf.PixbufLoader.write] to send the data
 * <br>to it. When done, [method&#64;GdkPixbuf.PixbufLoader.close] should be
 * <br>called to end the stream and finalize everything.
 * <br>
 * <br>The loader will emit three important signals throughout the process:
 * <br>
 * <br> - [signal&#64;GdkPixbuf.PixbufLoader::size-prepared] will be emitted as
 * <br>   soon as the image has enough information to determine the size of
 * <br>   the image to be used. If you want to scale the image while loading
 * <br>   it, you can call [method&#64;GdkPixbuf.PixbufLoader.set_size] in
 * <br>   response to this signal.
 * <br> - [signal&#64;GdkPixbuf.PixbufLoader::area-prepared] will be emitted as
 * <br>   soon as the pixbuf of the desired has been allocated. You can obtain
 * <br>   the `GdkPixbuf` instance by calling [method&#64;GdkPixbuf.PixbufLoader.get_pixbuf].
 * <br>   If you want to use it, simply acquire a reference to it. You can
 * <br>   also call `gdk_pixbuf_loader_get_pixbuf()` later to get the same
 * <br>   pixbuf.
 * <br> - [signal&#64;GdkPixbuf.PixbufLoader::area-updated] will be emitted every
 * <br>   time a region is updated. This way you can update a partially
 * <br>   completed image. Note that you do not know anything about the
 * <br>   completeness of an image from the updated area. For example, in an
 * <br>   interlaced image you will need to make several passes before the
 * <br>   image is done loading.
 * <br>
 * <br>&#35;&#35; Loading an animation
 * <br>
 * <br>Loading an animation is almost as easy as loading an image. Once the
 * <br>first [signal&#64;GdkPixbuf.PixbufLoader::area-prepared] signal has been
 * <br>emitted, you can call [method&#64;GdkPixbuf.PixbufLoader.get_animation] to
 * <br>get the [class&#64;GdkPixbuf.PixbufAnimation] instance, and then call
 * <br>and [method&#64;GdkPixbuf.PixbufAnimation.get_iter] to get a
 * <br>[class&#64;GdkPixbuf.PixbufAnimationIter] to retrieve the pixbuf for the
 * <br>desired time stamp.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufLoader.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufLoader.html</a></p>
*/
public class PixbufLoader extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufLoader.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAreaPrepared {
        /**
         * This signal is emitted when the pixbuf loader has allocated the
         * <br>pixbuf in the desired size.
         * <br>
         * <br>After this signal is emitted, applications can call
         * <br>gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded
         * <br>pixbuf.
        */
        void onAreaPrepared();
    }
    
    private static com.sun.jna.Callback toOnAreaPrepared(OnAreaPrepared in) {
        return (in == null) ? null: (JnaPixbufLoader.OnAreaPrepared) (__self, __data) -> in.onAreaPrepared();
    }

    @FunctionalInterface
    public interface OnAreaUpdated {
        /**
         * This signal is emitted when a significant area of the image being
         * <br>loaded has been updated.
         * <br>
         * <br>Normally it means that a complete scanline has been read in, but
         * <br>it could be a different area as well.
         * <br>
         * <br>Applications can use this signal to know when to repaint
         * <br>areas of an image that is being loaded.
         * @param x X offset of upper-left corner of the updated area.
         * @param y Y offset of upper-left corner of the updated area.
         * @param width Width of updated area.
         * @param height Height of updated area.
        */
        void onAreaUpdated(int x, int y, int width, int height);
    }
    
    private static com.sun.jna.Callback toOnAreaUpdated(OnAreaUpdated in) {
        return (in == null) ? null: (JnaPixbufLoader.OnAreaUpdated) (__self, _x, _y, _width, _height, __data) -> in.onAreaUpdated(_x, _y, _width, _height);
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * This signal is emitted when gdk_pixbuf_loader_close() is called.
         * <br>
         * <br>It can be used by different parts of an application to receive
         * <br>notification when an image loader is closed by the code that
         * <br>drives it.
        */
        void onClosed();
    }
    
    private static com.sun.jna.Callback toOnClosed(OnClosed in) {
        return (in == null) ? null: (JnaPixbufLoader.OnClosed) (__self, __data) -> in.onClosed();
    }

    @FunctionalInterface
    public interface OnSizePrepared {
        /**
         * This signal is emitted when the pixbuf loader has been fed the
         * <br>initial amount of data that is required to figure out the size
         * <br>of the image that it will create.
         * <br>
         * <br>Applications can call gdk_pixbuf_loader_set_size() in response
         * <br>to this signal to set the desired size to which the image
         * <br>should be scaled.
         * @param width the original width of the image
         * @param height the original height of the image
        */
        void onSizePrepared(int width, int height);
    }
    
    private static com.sun.jna.Callback toOnSizePrepared(OnSizePrepared in) {
        return (in == null) ? null: (JnaPixbufLoader.OnSizePrepared) (__self, _width, _height, __data) -> in.onSizePrepared(_width, _height);
    }

    public PixbufLoader(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * <br>image data as if it were an image of MIME type &#64;mime_type, instead of
     * <br>identifying the type automatically.
     * <br>
     * <br>This function is useful if you want an error if the image isn't the
     * <br>expected MIME type; for loading image formats that can't be reliably
     * <br>identified by looking at the data; or if the user manually forces a
     * <br>specific MIME type.
     * <br>
     * <br>The list of supported mime types depends on what image loaders
     * <br>are installed, but typically &quot;image/png&quot;, &quot;image/jpeg&quot;, &quot;image/gif&quot;,
     * <br>&quot;image/tiff&quot; and &quot;image/x-xpixmap&quot; are among the supported mime types.
     * <br>To obtain the full list of supported mime types, call
     * <br>gdk_pixbuf_format_get_mime_types() on each of the &#35;GdkPixbufFormat
     * <br>structs returned by gdk_pixbuf_get_formats().
     * @param mime_type the mime type to be loaded
     * @return A newly-created pixbuf loader.
    */
    public static PixbufLoader newWithMimeTypePixbufLoader(@Nonnull ch.bailu.gtk.type.Str mime_type) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufLoader.INST().gdk_pixbuf_loader_new_with_mime_type(asCPointerNotNull(mime_type), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufLoader:newWithMimeType");
        }
        return new PixbufLoader(__self);
    }        
    

    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * <br>image data as if it were an image of MIME type &#64;mime_type, instead of
     * <br>identifying the type automatically.
     * <br>
     * <br>This function is useful if you want an error if the image isn't the
     * <br>expected MIME type; for loading image formats that can't be reliably
     * <br>identified by looking at the data; or if the user manually forces a
     * <br>specific MIME type.
     * <br>
     * <br>The list of supported mime types depends on what image loaders
     * <br>are installed, but typically &quot;image/png&quot;, &quot;image/jpeg&quot;, &quot;image/gif&quot;,
     * <br>&quot;image/tiff&quot; and &quot;image/x-xpixmap&quot; are among the supported mime types.
     * <br>To obtain the full list of supported mime types, call
     * <br>gdk_pixbuf_format_get_mime_types() on each of the &#35;GdkPixbufFormat
     * <br>structs returned by gdk_pixbuf_get_formats().
     * @param mime_type the mime type to be loaded
     * @return A newly-created pixbuf loader.
    */
    public static PixbufLoader newWithMimeTypePixbufLoader(String mime_type) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufLoader.INST().gdk_pixbuf_loader_new_with_mime_type(mime_type, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufLoader:newWithMimeType");
        }
        return new PixbufLoader(__self);
    }        
    

    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * <br>image data as if it were an image of type &#64;image_type, instead of
     * <br>identifying the type automatically.
     * <br>
     * <br>This function is useful if you want an error if the image isn't the
     * <br>expected type; for loading image formats that can't be reliably
     * <br>identified by looking at the data; or if the user manually forces
     * <br>a specific type.
     * <br>
     * <br>The list of supported image formats depends on what image loaders
     * <br>are installed, but typically &quot;png&quot;, &quot;jpeg&quot;, &quot;gif&quot;, &quot;tiff&quot; and
     * <br>&quot;xpm&quot; are among the supported formats. To obtain the full list of
     * <br>supported image formats, call gdk_pixbuf_format_get_name() on each
     * <br>of the &#35;GdkPixbufFormat structs returned by gdk_pixbuf_get_formats().
     * @param image_type name of the image format to be loaded with the image
     * @return A newly-created pixbuf loader.
    */
    public static PixbufLoader newWithTypePixbufLoader(@Nonnull ch.bailu.gtk.type.Str image_type) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufLoader.INST().gdk_pixbuf_loader_new_with_type(asCPointerNotNull(image_type), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufLoader:newWithType");
        }
        return new PixbufLoader(__self);
    }        
    

    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * <br>image data as if it were an image of type &#64;image_type, instead of
     * <br>identifying the type automatically.
     * <br>
     * <br>This function is useful if you want an error if the image isn't the
     * <br>expected type; for loading image formats that can't be reliably
     * <br>identified by looking at the data; or if the user manually forces
     * <br>a specific type.
     * <br>
     * <br>The list of supported image formats depends on what image loaders
     * <br>are installed, but typically &quot;png&quot;, &quot;jpeg&quot;, &quot;gif&quot;, &quot;tiff&quot; and
     * <br>&quot;xpm&quot; are among the supported formats. To obtain the full list of
     * <br>supported image formats, call gdk_pixbuf_format_get_name() on each
     * <br>of the &#35;GdkPixbufFormat structs returned by gdk_pixbuf_get_formats().
     * @param image_type name of the image format to be loaded with the image
     * @return A newly-created pixbuf loader.
    */
    public static PixbufLoader newWithTypePixbufLoader(String image_type) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPixbufLoader.INST().gdk_pixbuf_loader_new_with_type(image_type, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PixbufLoader:newWithType");
        }
        return new PixbufLoader(__self);
    }        
    

    /**
     * Creates a new pixbuf loader object.
    */
    public PixbufLoader() {
        super(cast(JnaPixbufLoader.INST().gdk_pixbuf_loader_new()));
    }

    /**
     * Informs a pixbuf loader that no further writes with
     * <br>gdk_pixbuf_loader_write() will occur, so that it can free its
     * <br>internal loading structures.
     * <br>
     * <br>This function also tries to parse any data that hasn't yet been parsed;
     * <br>if the remaining data is partial or corrupt, an error will be returned.
     * <br>
     * <br>If `FALSE` is returned, `error` will be set to an error from the
     * <br>`GDK_PIXBUF_ERROR` or `G_FILE_ERROR` domains.
     * <br>
     * <br>If you're just cancelling a load rather than expecting it to be finished,
     * <br>passing `NULL` for `error` to ignore it is reasonable.
     * <br>
     * <br>Remember that this function does not release a reference on the loader, so
     * <br>you will need to explicitly release any reference you hold.
     * @return `TRUE` if all image data written so far was successfully   passed out via the update_area signal
    */
    public boolean close() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbufLoader.INST().gdk_pixbuf_loader_close(asCPointer(), 0L);
    }

    /**
     * Queries the &#35;GdkPixbufAnimation that a pixbuf loader is currently creating.
     * <br>
     * <br>In general it only makes sense to call this function after the
     * <br>[signal&#64;GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted by
     * <br>the loader.
     * <br>
     * <br>If the loader doesn't have enough bytes yet, and hasn't emitted the `area-prepared`
     * <br>signal, this function will return `NULL`.
     * @return The animation that the loader is   currently loading
    */
    public PixbufAnimation getAnimation()  {
        return new PixbufAnimation(new PointerContainer(JnaPixbufLoader.INST().gdk_pixbuf_loader_get_animation(asCPointer())));
    }

    /**
     * Obtains the available information about the format of the
     * <br>currently loading image file.
     * @return A &#35;GdkPixbufFormat
    */
    public PixbufFormat getFormat()  {
        return new PixbufFormat(new PointerContainer(JnaPixbufLoader.INST().gdk_pixbuf_loader_get_format(asCPointer())));
    }

    /**
     * Queries the &#35;GdkPixbuf that a pixbuf loader is currently creating.
     * <br>
     * <br>In general it only makes sense to call this function after the
     * <br>[signal&#64;GdkPixbuf.PixbufLoader::area-prepared] signal has been
     * <br>emitted by the loader; this means that enough data has been read
     * <br>to know the size of the image that will be allocated.
     * <br>
     * <br>If the loader has not received enough data via gdk_pixbuf_loader_write(),
     * <br>then this function returns `NULL`.
     * <br>
     * <br>The returned pixbuf will be the same in all future calls to the loader,
     * <br>so if you want to keep using it, you should acquire a reference to it.
     * <br>
     * <br>Additionally, if the loader is an animation, it will return the &quot;static
     * <br>image&quot; of the animation (see gdk_pixbuf_animation_get_static_image()).
     * @return The pixbuf that the loader is   creating
    */
    public Pixbuf getPixbuf()  {
        return new Pixbuf(new PointerContainer(JnaPixbufLoader.INST().gdk_pixbuf_loader_get_pixbuf(asCPointer())));
    }

    /**
     * Causes the image to be scaled while it is loaded.
     * <br>
     * <br>The desired image size can be determined relative to the original
     * <br>size of the image by calling gdk_pixbuf_loader_set_size() from a
     * <br>signal handler for the ::size-prepared signal.
     * <br>
     * <br>Attempts to set the desired image size  are ignored after the
     * <br>emission of the ::size-prepared signal.
     * @param width The desired width of the image being loaded.
     * @param height The desired height of the image being loaded.
    */
    public void setSize(int width, int height)  {
        JnaPixbufLoader.INST().gdk_pixbuf_loader_set_size(asCPointer(), width, height);
    }

    /**
     * Parses the next contents of the given image buffer.
     * @param buffer The image data as a `GBytes` buffer.
     * @return `TRUE` if the write was successful, or `FALSE` if   the loader cannot parse the buffer
    */
    public boolean writeBytes(@Nonnull ch.bailu.gtk.glib.Bytes buffer) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPixbufLoader.INST().gdk_pixbuf_loader_write_bytes(asCPointer(), asCPointerNotNull(buffer), 0L);
    }

    public final static String SIGNAL_ON_AREA_PREPARED = "area-prepared";
    
    /**
     * Connect to signal "area-prepared".
     * <br>See {@link OnAreaPrepared#onAreaPrepared} for signal description.
     * <br>Field {@link #SIGNAL_ON_AREA_PREPARED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAreaPrepared(OnAreaPrepared signal) {
        return connectSignal(SIGNAL_ON_AREA_PREPARED, toOnAreaPrepared(signal));
    }

    public final static String SIGNAL_ON_AREA_UPDATED = "area-updated";
    
    /**
     * Connect to signal "area-updated".
     * <br>See {@link OnAreaUpdated#onAreaUpdated} for signal description.
     * <br>Field {@link #SIGNAL_ON_AREA_UPDATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAreaUpdated(OnAreaUpdated signal) {
        return connectSignal(SIGNAL_ON_AREA_UPDATED, toOnAreaUpdated(signal));
    }

    public final static String SIGNAL_ON_CLOSED = "closed";
    
    /**
     * Connect to signal "closed".
     * <br>See {@link OnClosed#onClosed} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClosed(OnClosed signal) {
        return connectSignal(SIGNAL_ON_CLOSED, toOnClosed(signal));
    }

    public final static String SIGNAL_ON_SIZE_PREPARED = "size-prepared";
    
    /**
     * Connect to signal "size-prepared".
     * <br>See {@link OnSizePrepared#onSizePrepared} for signal description.
     * <br>Field {@link #SIGNAL_ON_SIZE_PREPARED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSizePrepared(OnSizePrepared signal) {
        return connectSignal(SIGNAL_ON_SIZE_PREPARED, toOnSizePrepared(signal));
    }

    public static long getTypeID() { 
        return JnaPixbufLoader.INST().gdk_pixbuf_loader_get_type(); 
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

[MethodModel:java-type-not-supported:write:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
