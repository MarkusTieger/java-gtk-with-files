/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMediaFile` implements `GtkMediaStream` for files.
 * <br>
 * <br>This provides a simple way to play back video files with GTK.
 * <br>
 * <br>GTK provides a GIO extension point for `GtkMediaFile` implementations
 * <br>to allow for external implementations using various media frameworks.
 * <br>
 * <br>GTK itself includes implementations using GStreamer and ffmpeg.
 * <p><a href="https://docs.gtk.org/gtk4/class.MediaFile.html">https://docs.gtk.org/gtk4/class.MediaFile.html</a></p>
*/
public class MediaFile extends MediaStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MediaFile.class.getCanonicalName());
    }

    public MediaFile(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new media file to play &#64;file.
     * @param file The file to play
     * @return a new `GtkMediaFile` playing &#64;file
    */
    public static MediaFile newForFileMediaFile(@Nonnull ch.bailu.gtk.gio.File file)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_file(asCPointerNotNull(file)));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForFile");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new media file for the given filename.
     * <br>
     * <br>This is a utility function that converts the given &#64;filename
     * <br>to a `GFile` and calls [ctor&#64;Gtk.MediaFile.new_for_file].
     * @param filename filename to open
     * @return a new `GtkMediaFile` playing &#64;filename
    */
    public static MediaFile newForFilenameMediaFile(@Nonnull ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_filename(asCPointerNotNull(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForFilename");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new media file for the given filename.
     * <br>
     * <br>This is a utility function that converts the given &#64;filename
     * <br>to a `GFile` and calls [ctor&#64;Gtk.MediaFile.new_for_file].
     * @param filename filename to open
     * @return a new `GtkMediaFile` playing &#64;filename
    */
    public static MediaFile newForFilenameMediaFile(String filename)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_filename(filename));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForFilename");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new media file to play &#64;stream.
     * <br>
     * <br>If you want the resulting media to be seekable,
     * <br>the stream should implement the `GSeekable` interface.
     * @param stream The stream to play
     * @return a new `GtkMediaFile`
    */
    public static MediaFile newForInputStreamMediaFile(@Nonnull ch.bailu.gtk.gio.InputStream stream)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_input_stream(asCPointerNotNull(stream)));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForInputStream");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new new media file for the given resource.
     * <br>
     * <br>This is a utility function that converts the given &#64;resource
     * <br>to a `GFile` and calls [ctor&#64;Gtk.MediaFile.new_for_file].
     * @param resource_path resource path to open
     * @return a new `GtkMediaFile` playing &#64;resource_path
    */
    public static MediaFile newForResourceMediaFile(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_resource(asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForResource");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new new media file for the given resource.
     * <br>
     * <br>This is a utility function that converts the given &#64;resource
     * <br>to a `GFile` and calls [ctor&#64;Gtk.MediaFile.new_for_file].
     * @param resource_path resource path to open
     * @return a new `GtkMediaFile` playing &#64;resource_path
    */
    public static MediaFile newForResourceMediaFile(String resource_path)  {
        PointerContainer __self = cast(JnaMediaFile.INST().gtk_media_file_new_for_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("MediaFile:newForResource");
        }
        return new MediaFile(__self);
    }        
    

    /**
     * Creates a new empty media file.
    */
    public MediaFile() {
        super(cast(JnaMediaFile.INST().gtk_media_file_new()));
    }

    /**
     * Resets the media file to be empty.
    */
    public void clear()  {
        JnaMediaFile.INST().gtk_media_file_clear(asCPointer());
    }

    /**
     * Returns the file that &#64;self is currently playing from.
     * <br>
     * <br>When &#64;self is not playing or not playing from a file,
     * <br>%NULL is returned.
     * @return The currently playing file
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaMediaFile.INST().gtk_media_file_get_file(asCPointer())));
    }

    /**
     * Returns the stream that &#64;self is currently playing from.
     * <br>
     * <br>When &#64;self is not playing or not playing from a stream,
     * <br>%NULL is returned.
     * @return The currently playing stream
    */
    public ch.bailu.gtk.gio.InputStream getInputStream()  {
        return new ch.bailu.gtk.gio.InputStream(new PointerContainer(JnaMediaFile.INST().gtk_media_file_get_input_stream(asCPointer())));
    }

    /**
     * Sets the `GtkMediaFile` to play the given file.
     * <br>
     * <br>If any file is still playing, stop playing it.
     * @param file the file to play
    */
    public void setFile(@Nullable ch.bailu.gtk.gio.File file)  {
        JnaMediaFile.INST().gtk_media_file_set_file(asCPointer(), asCPointer(file));
    }

    /**
     * Sets the `GtkMediaFile to play the given file.
     * <br>
     * <br>This is a utility function that converts the given &#64;filename
     * <br>to a `GFile` and calls [method&#64;Gtk.MediaFile.set_file].
     * @param filename name of file to play
    */
    public void setFilename(@Nullable ch.bailu.gtk.type.Str filename)  {
        JnaMediaFile.INST().gtk_media_file_set_filename(asCPointer(), asCPointer(filename));
    }

    /**
     * Sets the `GtkMediaFile to play the given file.
     * <br>
     * <br>This is a utility function that converts the given &#64;filename
     * <br>to a `GFile` and calls [method&#64;Gtk.MediaFile.set_file].
     * @param filename name of file to play
    */
    public void setFilename(String filename)  {
        JnaMediaFile.INST().gtk_media_file_set_filename(asCPointer(), filename);
    }

    /**
     * Sets the `GtkMediaFile` to play the given stream.
     * <br>
     * <br>If anything is still playing, stop playing it.
     * <br>
     * <br>Full control about the &#64;stream is assumed for the duration of
     * <br>playback. The stream will not be closed.
     * @param stream the stream to play from
    */
    public void setInputStream(@Nullable ch.bailu.gtk.gio.InputStream stream)  {
        JnaMediaFile.INST().gtk_media_file_set_input_stream(asCPointer(), asCPointer(stream));
    }

    /**
     * Sets the `GtkMediaFile to play the given resource.
     * <br>
     * <br>This is a utility function that converts the given &#64;resource_path
     * <br>to a `GFile` and calls [method&#64;Gtk.MediaFile.set_file].
     * @param resource_path path to resource to play
    */
    public void setResource(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        JnaMediaFile.INST().gtk_media_file_set_resource(asCPointer(), asCPointer(resource_path));
    }

    /**
     * Sets the `GtkMediaFile to play the given resource.
     * <br>
     * <br>This is a utility function that converts the given &#64;resource_path
     * <br>to a `GFile` and calls [method&#64;Gtk.MediaFile.set_file].
     * @param resource_path path to resource to play
    */
    public void setResource(String resource_path)  {
        JnaMediaFile.INST().gtk_media_file_set_resource(asCPointer(), resource_path);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gdk.Paintable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gdk.Paintable}
    */
    public ch.bailu.gtk.gdk.Paintable asPaintable() {
        return new ch.bailu.gtk.gdk.Paintable(cast());
    }

    public static long getTypeID() { 
        return JnaMediaFile.INST().gtk_media_file_get_type(); 
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
