/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkTexture` is the basic element used to refer to pixel data.
 * <br>
 * <br>It is primarily meant for pixel data that will not change over
 * <br>multiple frames, and will be used for a long time.
 * <br>
 * <br>There are various ways to create `GdkTexture` objects from a
 * <br>[class&#64;GdkPixbuf.Pixbuf], or a Cairo surface, or other pixel data.
 * <br>
 * <br>The ownership of the pixel data is transferred to the `GdkTexture`
 * <br>instance; you can only make a copy of it, via [method&#64;Gdk.Texture.download].
 * <br>
 * <br>`GdkTexture` is an immutable object: That means you cannot change
 * <br>anything about it other than increasing the reference count via
 * <br>[method&#64;GObject.Object.ref], and consequently, it is a thread-safe object.
 * <p><a href="https://docs.gtk.org/gdk4/class.Texture.html">https://docs.gtk.org/gdk4/class.Texture.html</a></p>
*/
public class Texture extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Texture.class.getCanonicalName());
    }

    public Texture(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new texture object representing the `GdkPixbuf`.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GdkTexture`
    */
    public static Texture newForPixbufTexture(@Nonnull ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf)  {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_for_pixbuf(asCPointerNotNull(pixbuf)));
        if (__self.isNull()) {
            throw new NullPointerException("Texture:newForPixbuf");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from memory,
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>If %NULL is returned, then &#64;error will be set.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param bytes a `GBytes` containing the data to load
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromBytesTexture(@Nonnull ch.bailu.gtk.glib.Bytes bytes) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_bytes(asCPointerNotNull(bytes), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Texture:newFromBytes");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>If %NULL is returned, then &#64;error will be set.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param file `GFile` to load
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromFileTexture(@Nonnull ch.bailu.gtk.gio.File file) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_file(asCPointerNotNull(file), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Texture:newFromFile");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>If %NULL is returned, then &#64;error will be set.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param path the filename to load
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromFilenameTexture(@Nonnull ch.bailu.gtk.type.Str path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_filename(asCPointerNotNull(path), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Texture:newFromFilename");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from a file.
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>If %NULL is returned, then &#64;error will be set.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param path the filename to load
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromFilenameTexture(String path) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_filename(path, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Texture:newFromFilename");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from a resource.
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>It is a fatal error if &#64;resource_path does not specify a valid
     * <br>image resource and the program will abort if that happens.
     * <br>If you are unsure about the validity of a resource, use
     * <br>[ctor&#64;Gdk.Texture.new_from_file] to load it.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param resource_path the path of the resource file
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromResourceTexture(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_resource(asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Texture:newFromResource");
        }
        return new Texture(__self);
    }        
    

    /**
     * Creates a new texture by loading an image from a resource.
     * <br>
     * <br>The file format is detected automatically. The supported formats
     * <br>are PNG and JPEG, though more formats might be available.
     * <br>
     * <br>It is a fatal error if &#64;resource_path does not specify a valid
     * <br>image resource and the program will abort if that happens.
     * <br>If you are unsure about the validity of a resource, use
     * <br>[ctor&#64;Gdk.Texture.new_from_file] to load it.
     * <br>
     * <br>This function is threadsafe, so that you can e.g. use GTask
     * <br>and [method&#64;Gio.Task.run_in_thread] to avoid blocking the main thread
     * <br>while loading a big image.
     * @param resource_path the path of the resource file
     * @return A newly-created `GdkTexture`
    */
    public static Texture newFromResourceTexture(String resource_path)  {
        PointerContainer __self = cast(JnaTexture.INST().gdk_texture_new_from_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("Texture:newFromResource");
        }
        return new Texture(__self);
    }        
    

    /**
     * Returns the height of the &#64;texture, in pixels.
     * @return the height of the `GdkTexture`
    */
    public int getHeight()  {
        return JnaTexture.INST().gdk_texture_get_height(asCPointer());
    }

    /**
     * Returns the width of &#64;texture, in pixels.
     * @return the width of the `GdkTexture`
    */
    public int getWidth()  {
        return JnaTexture.INST().gdk_texture_get_width(asCPointer());
    }

    /**
     * Store the given &#64;texture to the &#64;filename as a PNG file.
     * <br>
     * <br>This is a utility function intended for debugging and testing.
     * <br>If you want more control over formats, proper error handling or
     * <br>want to store to a [iface&#64;Gio.File] or other location, you might want to
     * <br>use [method&#64;Gdk.Texture.save_to_png_bytes] or look into the
     * <br>gdk-pixbuf library.
     * @param filename the filename to store to
     * @return %TRUE if saving succeeded, %FALSE on failure.
    */
    public boolean saveToPng(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return JnaTexture.INST().gdk_texture_save_to_png(asCPointer(), asCPointerNotNull(filename));
    }

    /**
     * Store the given &#64;texture to the &#64;filename as a PNG file.
     * <br>
     * <br>This is a utility function intended for debugging and testing.
     * <br>If you want more control over formats, proper error handling or
     * <br>want to store to a [iface&#64;Gio.File] or other location, you might want to
     * <br>use [method&#64;Gdk.Texture.save_to_png_bytes] or look into the
     * <br>gdk-pixbuf library.
     * @param filename the filename to store to
     * @return %TRUE if saving succeeded, %FALSE on failure.
    */
    public boolean saveToPng(String filename)  {
        return JnaTexture.INST().gdk_texture_save_to_png(asCPointer(), filename);
    }

    /**
     * Store the given &#64;texture in memory as a PNG file.
     * <br>
     * <br>Use [ctor&#64;Gdk.Texture.new_from_bytes] to read it back.
     * <br>
     * <br>If you want to serialize a texture, this is a convenient and
     * <br>portable way to do that.
     * <br>
     * <br>If you need more control over the generated image, such as
     * <br>attaching metadata, you should look into an image handling
     * <br>library such as the gdk-pixbuf library.
     * <br>
     * <br>If you are dealing with high dynamic range float data, you
     * <br>might also want to consider [method&#64;Gdk.Texture.save_to_tiff_bytes]
     * <br>instead.
     * @return a newly allocated `GBytes` containing PNG data
    */
    public ch.bailu.gtk.glib.Bytes saveToPngBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaTexture.INST().gdk_texture_save_to_png_bytes(asCPointer())));
    }

    /**
     * Store the given &#64;texture to the &#64;filename as a TIFF file.
     * <br>
     * <br>GTK will attempt to store data without loss.
     * @param filename the filename to store to
     * @return %TRUE if saving succeeded, %FALSE on failure.
    */
    public boolean saveToTiff(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return JnaTexture.INST().gdk_texture_save_to_tiff(asCPointer(), asCPointerNotNull(filename));
    }

    /**
     * Store the given &#64;texture to the &#64;filename as a TIFF file.
     * <br>
     * <br>GTK will attempt to store data without loss.
     * @param filename the filename to store to
     * @return %TRUE if saving succeeded, %FALSE on failure.
    */
    public boolean saveToTiff(String filename)  {
        return JnaTexture.INST().gdk_texture_save_to_tiff(asCPointer(), filename);
    }

    /**
     * Store the given &#64;texture in memory as a TIFF file.
     * <br>
     * <br>Use [ctor&#64;Gdk.Texture.new_from_bytes] to read it back.
     * <br>
     * <br>This function is intended to store a representation of the
     * <br>texture's data that is as accurate as possible. This is
     * <br>particularly relevant when working with high dynamic range
     * <br>images and floating-point texture data.
     * <br>
     * <br>If that is not your concern and you are interested in a
     * <br>smaller size and a more portable format, you might want to
     * <br>use [method&#64;Gdk.Texture.save_to_png_bytes].
     * @return a newly allocated `GBytes` containing TIFF data
    */
    public ch.bailu.gtk.glib.Bytes saveToTiffBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaTexture.INST().gdk_texture_save_to_tiff_bytes(asCPointer())));
    }

    /**
     * Implements interface {@link Paintable}. Call this to get access to interface functions.
     * @return {@link Paintable}
    */
    public Paintable asPaintable() {
        return new Paintable(cast());
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
        return JnaTexture.INST().gdk_texture_get_type(); 
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

[MethodModel:java-type-not-supported:download:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
