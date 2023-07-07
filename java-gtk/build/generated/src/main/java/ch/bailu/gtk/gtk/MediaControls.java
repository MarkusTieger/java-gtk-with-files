/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMediaControls` is a widget to show controls for a video.
 * <br>
 * <br>![An example GtkMediaControls](media-controls.png)
 * <br>
 * <br>Usually, `GtkMediaControls` is used as part of [class&#64;Gtk.Video].
 * <p><a href="https://docs.gtk.org/gtk4/class.MediaControls.html">https://docs.gtk.org/gtk4/class.MediaControls.html</a></p>
*/
public class MediaControls extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MediaControls.class.getCanonicalName());
    }

    public MediaControls(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkMediaControls` managing the &#64;stream passed to it.
     * @param stream a `GtkMediaStream` to manage
    */
    public MediaControls(@Nullable MediaStream stream) {
        super(cast(JnaMediaControls.INST().gtk_media_controls_new(asCPointer(stream))));
    }

    /**
     * Gets the media stream managed by &#64;controls or %NULL if none.
     * @return The media stream managed by &#64;controls
    */
    public MediaStream getMediaStream()  {
        return new MediaStream(new PointerContainer(JnaMediaControls.INST().gtk_media_controls_get_media_stream(asCPointer())));
    }

    /**
     * Sets the stream that is controlled by &#64;controls.
     * @param stream a `GtkMediaStream`
    */
    public void setMediaStream(@Nullable MediaStream stream)  {
        JnaMediaControls.INST().gtk_media_controls_set_media_stream(asCPointer(), asCPointer(stream));
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
        return JnaMediaControls.INST().gtk_media_controls_get_type(); 
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
