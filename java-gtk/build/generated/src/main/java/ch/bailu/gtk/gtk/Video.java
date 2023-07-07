/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkVideo` is a widget to show a `GtkMediaStream` with media controls.
 * <br>
 * <br>![An example GtkVideo](video.png)
 * <br>
 * <br>The controls are available separately as [class&#64;Gtk.MediaControls].
 * <br>If you just want to display a video without controls, you can treat it
 * <br>like any other paintable and for example put it into a [class&#64;Gtk.Picture].
 * <br>
 * <br>`GtkVideo` aims to cover use cases such as previews, embedded animations,
 * <br>etc. It supports autoplay, looping, and simple media controls. It does
 * <br>not have support for video overlays, multichannel audio, device
 * <br>selection, or input. If you are writing a full-fledged video player,
 * <br>you may want to use the [iface&#64;Gdk.Paintable] API and a media framework
 * <br>such as Gstreamer directly.
 * <p><a href="https://docs.gtk.org/gtk4/class.Video.html">https://docs.gtk.org/gtk4/class.Video.html</a></p>
*/
public class Video extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Video.class.getCanonicalName());
    }

    public Video(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkVideo` to play back the given &#64;file.
     * @param file a `GFile`
     * @return a new `GtkVideo`
    */
    public static Video newForFileVideo(@Nullable ch.bailu.gtk.gio.File file)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_file(asCPointer(file)));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForFile");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a `GtkVideo` to play back the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Video.new_for_file],
     * <br>See that function for details.
     * @param filename filename to play back
     * @return a new `GtkVideo`
    */
    public static Video newForFilenameVideo(@Nullable ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_filename(asCPointer(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForFilename");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a `GtkVideo` to play back the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Video.new_for_file],
     * <br>See that function for details.
     * @param filename filename to play back
     * @return a new `GtkVideo`
    */
    public static Video newForFilenameVideo(String filename)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_filename(filename));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForFilename");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a `GtkVideo` to play back the given &#64;stream.
     * @param stream a `GtkMediaStream`
     * @return a new `GtkVideo`
    */
    public static Video newForMediaStreamVideo(@Nullable MediaStream stream)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_media_stream(asCPointer(stream)));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForMediaStream");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a `GtkVideo` to play back the resource at the
     * <br>given &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Video.new_for_file].
     * @param resource_path resource path to play back
     * @return a new `GtkVideo`
    */
    public static Video newForResourceVideo(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_resource(asCPointer(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForResource");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a `GtkVideo` to play back the resource at the
     * <br>given &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Video.new_for_file].
     * @param resource_path resource path to play back
     * @return a new `GtkVideo`
    */
    public static Video newForResourceVideo(String resource_path)  {
        PointerContainer __self = cast(JnaVideo.INST().gtk_video_new_for_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("Video:newForResource");
        }
        return new Video(__self);
    }        
    

    /**
     * Creates a new empty `GtkVideo`.
    */
    public Video() {
        super(cast(JnaVideo.INST().gtk_video_new()));
    }

    /**
     * Returns %TRUE if videos have been set to loop.
     * @return %TRUE if streams should autoplay
    */
    public boolean getAutoplay()  {
        return JnaVideo.INST().gtk_video_get_autoplay(asCPointer());
    }

    /**
     * Gets the file played by &#64;self or %NULL if not playing back
     * <br>a file.
     * @return The file played by &#64;self
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaVideo.INST().gtk_video_get_file(asCPointer())));
    }

    /**
     * Returns %TRUE if videos have been set to loop.
     * @return %TRUE if streams should loop
    */
    public boolean getLoop()  {
        return JnaVideo.INST().gtk_video_get_loop(asCPointer());
    }

    /**
     * Gets the media stream managed by &#64;self or %NULL if none.
     * @return The media stream managed by &#64;self
    */
    public MediaStream getMediaStream()  {
        return new MediaStream(new PointerContainer(JnaVideo.INST().gtk_video_get_media_stream(asCPointer())));
    }

    /**
     * Sets whether &#64;self automatically starts playback when it
     * <br>becomes visible or when a new file gets loaded.
     * @param autoplay whether media streams should autoplay
    */
    public void setAutoplay(boolean autoplay)  {
        JnaVideo.INST().gtk_video_set_autoplay(asCPointer(), autoplay);
    }

    /**
     * Makes &#64;self play the given &#64;file.
     * @param file the file to play
    */
    public void setFile(@Nullable ch.bailu.gtk.gio.File file)  {
        JnaVideo.INST().gtk_video_set_file(asCPointer(), asCPointer(file));
    }

    /**
     * Makes &#64;self play the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls gtk_video_set_file(),
     * @param filename the filename to play
    */
    public void setFilename(@Nullable ch.bailu.gtk.type.Str filename)  {
        JnaVideo.INST().gtk_video_set_filename(asCPointer(), asCPointer(filename));
    }

    /**
     * Makes &#64;self play the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls gtk_video_set_file(),
     * @param filename the filename to play
    */
    public void setFilename(String filename)  {
        JnaVideo.INST().gtk_video_set_filename(asCPointer(), filename);
    }

    /**
     * Sets whether new files loaded by &#64;self should be set to loop.
     * @param loop whether media streams should loop
    */
    public void setLoop(boolean loop)  {
        JnaVideo.INST().gtk_video_set_loop(asCPointer(), loop);
    }

    /**
     * Sets the media stream to be played back.
     * <br>
     * <br>&#64;self will take full control of managing the media stream. If you
     * <br>want to manage a media stream yourself, consider using a
     * <br>[class&#64;Gtk.Picture] for display.
     * <br>
     * <br>If you want to display a file, consider using [method&#64;Gtk.Video.set_file]
     * <br>instead.
     * @param stream The media stream to play or %NULL to unset
    */
    public void setMediaStream(@Nullable MediaStream stream)  {
        JnaVideo.INST().gtk_video_set_media_stream(asCPointer(), asCPointer(stream));
    }

    /**
     * Makes &#64;self play the resource at the given &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Video.set_file].
     * @param resource_path the resource to set
    */
    public void setResource(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        JnaVideo.INST().gtk_video_set_resource(asCPointer(), asCPointer(resource_path));
    }

    /**
     * Makes &#64;self play the resource at the given &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Video.set_file].
     * @param resource_path the resource to set
    */
    public void setResource(String resource_path)  {
        JnaVideo.INST().gtk_video_set_resource(asCPointer(), resource_path);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaVideo.INST().gtk_video_get_type(); 
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
