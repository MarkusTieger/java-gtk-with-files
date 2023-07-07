/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMediaStream` is the integration point for media playback inside GTK.
 * <br>
 * <br>GTK provides an implementation of the `GtkMediaStream` interface that
 * <br>is called [class&#64;Gtk.MediaFile].
 * <br>
 * <br>Apart from application-facing API for stream playback, `GtkMediaStream`
 * <br>has a number of APIs that are only useful for implementations and should
 * <br>not be used in applications:
 * <br>[method&#64;Gtk.MediaStream.prepared],
 * <br>[method&#64;Gtk.MediaStream.unprepared],
 * <br>[method&#64;Gtk.MediaStream.update],
 * <br>[method&#64;Gtk.MediaStream.ended],
 * <br>[method&#64;Gtk.MediaStream.seek_success],
 * <br>[method&#64;Gtk.MediaStream.seek_failed],
 * <br>[method&#64;Gtk.MediaStream.gerror],
 * <br>[method&#64;Gtk.MediaStream.error],
 * <br>[method&#64;Gtk.MediaStream.error_valist].
 * <p><a href="https://docs.gtk.org/gtk4/class.MediaStream.html">https://docs.gtk.org/gtk4/class.MediaStream.html</a></p>
*/
public class MediaStream extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MediaStream.class.getCanonicalName());
    }

    public MediaStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Sets &#64;self into an error state using a printf()-style format string.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.MediaStream.gerror].
     * <br>See that function for details.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param _elipse parameters for message format
    */
    public void error(int domain, int code, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaMediaStream.INST().gtk_media_stream_error(asCPointer(), domain, code, asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets &#64;self into an error state using a printf()-style format string.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.MediaStream.gerror].
     * <br>See that function for details.
     * @param domain error domain
     * @param code error code
     * @param format printf()-style format for error message
     * @param _elipse parameters for message format
    */
    public void error(int domain, int code, String format, java.lang.Object... _elipse)  {
        JnaMediaStream.INST().gtk_media_stream_error(asCPointer(), domain, code, format, _elipse);
    }

    /**
     * Sets &#64;self into an error state.
     * <br>
     * <br>This will pause the stream (you can check for an error
     * <br>via [method&#64;Gtk.MediaStream.get_error] in your
     * <br>GtkMediaStream.pause() implementation), abort pending
     * <br>seeks and mark the stream as prepared.
     * <br>
     * <br>if the stream is already in an error state, this call
     * <br>will be ignored and the existing error will be retained.
     * <br>
     * <br>To unset an error, the stream must be reset via a call to
     * <br>[method&#64;Gtk.MediaStream.unprepared].
     * @param error the `GError` to set
    */
    public void gerror(@Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaMediaStream.INST().gtk_media_stream_gerror(asCPointer(), asCPointerNotNull(error));
    }

    /**
     * Gets the duration of the stream.
     * <br>
     * <br>If the duration is not known, 0 will be returned.
     * @return the duration of the stream or 0 if not known.
    */
    public long getDuration()  {
        return JnaMediaStream.INST().gtk_media_stream_get_duration(asCPointer());
    }

    /**
     * Returns whether the streams playback is finished.
     * @return %TRUE if playback is finished
    */
    public boolean getEnded()  {
        return JnaMediaStream.INST().gtk_media_stream_get_ended(asCPointer());
    }

    /**
     * If the stream is in an error state, returns the `GError`
     * <br>explaining that state.
     * <br>
     * <br>Any type of error can be reported here depending on the
     * <br>implementation of the media stream.
     * <br>
     * <br>A media stream in an error cannot be operated on, calls
     * <br>like [method&#64;Gtk.MediaStream.play] or
     * <br>[method&#64;Gtk.MediaStream.seek] will not have any effect.
     * <br>
     * <br>`GtkMediaStream` itself does not provide a way to unset
     * <br>an error, but implementations may provide options. For example,
     * <br>a [class&#64;Gtk.MediaFile] will unset errors when a new source is
     * <br>set, e.g. with [method&#64;Gtk.MediaFile.set_file].
     * @return %NULL if not in an   error state or the `GError` of the stream
    */
    public ch.bailu.gtk.glib.Error getError()  {
        return new ch.bailu.gtk.glib.Error(new PointerContainer(JnaMediaStream.INST().gtk_media_stream_get_error(asCPointer())));
    }

    /**
     * Returns whether the stream is set to loop.
     * <br>
     * <br>See [method&#64;Gtk.MediaStream.set_loop] for details.
     * @return %TRUE if the stream should loop
    */
    public boolean getLoop()  {
        return JnaMediaStream.INST().gtk_media_stream_get_loop(asCPointer());
    }

    /**
     * Returns whether the audio for the stream is muted.
     * <br>
     * <br>See [method&#64;Gtk.MediaStream.set_muted] for details.
     * @return %TRUE if the stream is muted
    */
    public boolean getMuted()  {
        return JnaMediaStream.INST().gtk_media_stream_get_muted(asCPointer());
    }

    /**
     * Return whether the stream is currently playing.
     * @return %TRUE if the stream is playing
    */
    public boolean getPlaying()  {
        return JnaMediaStream.INST().gtk_media_stream_get_playing(asCPointer());
    }

    /**
     * Returns the current presentation timestamp in microseconds.
     * @return the timestamp in microseconds
    */
    public long getTimestamp()  {
        return JnaMediaStream.INST().gtk_media_stream_get_timestamp(asCPointer());
    }

    /**
     * Returns the volume of the audio for the stream.
     * <br>
     * <br>See [method&#64;Gtk.MediaStream.set_volume] for details.
     * @return volume of the stream from 0.0 to 1.0
    */
    public double getVolume()  {
        return JnaMediaStream.INST().gtk_media_stream_get_volume(asCPointer());
    }

    /**
     * Returns whether the stream has audio.
     * @return %TRUE if the stream has audio
    */
    public boolean hasAudio()  {
        return JnaMediaStream.INST().gtk_media_stream_has_audio(asCPointer());
    }

    /**
     * Returns whether the stream has video.
     * @return %TRUE if the stream has video
    */
    public boolean hasVideo()  {
        return JnaMediaStream.INST().gtk_media_stream_has_video(asCPointer());
    }

    /**
     * Returns whether the stream has finished initializing.
     * <br>
     * <br>At this point the existence of audio and video is known.
     * @return %TRUE if the stream is prepared
    */
    public boolean isPrepared()  {
        return JnaMediaStream.INST().gtk_media_stream_is_prepared(asCPointer());
    }

    /**
     * Checks if a stream may be seekable.
     * <br>
     * <br>This is meant to be a hint. Streams may not allow seeking even if
     * <br>this function returns %TRUE. However, if this function returns
     * <br>%FALSE, streams are guaranteed to not be seekable and user interfaces
     * <br>may hide controls that allow seeking.
     * <br>
     * <br>It is allowed to call [method&#64;Gtk.MediaStream.seek] on a non-seekable
     * <br>stream, though it will not do anything.
     * @return %TRUE if the stream may support seeking
    */
    public boolean isSeekable()  {
        return JnaMediaStream.INST().gtk_media_stream_is_seekable(asCPointer());
    }

    /**
     * Checks if there is currently a seek operation going on.
     * @return %TRUE if a seek operation is ongoing.
    */
    public boolean isSeeking()  {
        return JnaMediaStream.INST().gtk_media_stream_is_seeking(asCPointer());
    }

    /**
     * Pauses playback of the stream.
     * <br>
     * <br>If the stream is not playing, do nothing.
    */
    public void pause()  {
        JnaMediaStream.INST().gtk_media_stream_pause(asCPointer());
    }

    /**
     * Starts playing the stream.
     * <br>
     * <br>If the stream is in error or already playing, do nothing.
    */
    public void play()  {
        JnaMediaStream.INST().gtk_media_stream_play(asCPointer());
    }

    /**
     * Called by users to attach the media stream to a `GdkSurface` they manage.
     * <br>
     * <br>The stream can then access the resources of &#64;surface for its
     * <br>rendering purposes. In particular, media streams might want to
     * <br>create a `GdkGLContext` or sync to the `GdkFrameClock`.
     * <br>
     * <br>Whoever calls this function is responsible for calling
     * <br>[method&#64;Gtk.MediaStream.unrealize] before either the stream
     * <br>or &#64;surface get destroyed.
     * <br>
     * <br>Multiple calls to this function may happen from different
     * <br>users of the video, even with the same &#64;surface. Each of these
     * <br>calls must be followed by its own call to
     * <br>[method&#64;Gtk.MediaStream.unrealize].
     * <br>
     * <br>It is not required to call this function to make a media stream work.
     * @param surface a `GdkSurface`
    */
    public void realize(@Nonnull ch.bailu.gtk.gdk.Surface surface)  {
        JnaMediaStream.INST().gtk_media_stream_realize(asCPointer(), asCPointerNotNull(surface));
    }

    /**
     * Start a seek operation on &#64;self to &#64;timestamp.
     * <br>
     * <br>If &#64;timestamp is out of range, it will be clamped.
     * <br>
     * <br>Seek operations may not finish instantly. While a
     * <br>seek operation is in process, the [property&#64;Gtk.MediaStream:seeking]
     * <br>property will be set.
     * <br>
     * <br>When calling gtk_media_stream_seek() during an
     * <br>ongoing seek operation, the new seek will override
     * <br>any pending seek.
     * @param timestamp timestamp to seek to.
    */
    public void seek(long timestamp)  {
        JnaMediaStream.INST().gtk_media_stream_seek(asCPointer(), timestamp);
    }

    /**
     * Ends a seek operation started via GtkMediaStream.seek() as a failure.
     * <br>
     * <br>This will not cause an error on the stream and will assume that
     * <br>playback continues as if no seek had happened.
     * <br>
     * <br>See [method&#64;Gtk.MediaStream.seek_success] for the other way of
     * <br>ending a seek.
    */
    public void seekFailed()  {
        JnaMediaStream.INST().gtk_media_stream_seek_failed(asCPointer());
    }

    /**
     * Ends a seek operation started via GtkMediaStream.seek() successfully.
     * <br>
     * <br>This function will unset the GtkMediaStream:ended property
     * <br>if it was set.
     * <br>
     * <br>See [method&#64;Gtk.MediaStream.seek_failed] for the other way of
     * <br>ending a seek.
    */
    public void seekSuccess()  {
        JnaMediaStream.INST().gtk_media_stream_seek_success(asCPointer());
    }

    /**
     * Sets whether the stream should loop.
     * <br>
     * <br>In this case, it will attempt to restart playback
     * <br>from the beginning instead of stopping at the end.
     * <br>
     * <br>Not all streams may support looping, in particular
     * <br>non-seekable streams. Those streams will ignore the
     * <br>loop setting and just end.
     * @param loop %TRUE if the stream should loop
    */
    public void setLoop(boolean loop)  {
        JnaMediaStream.INST().gtk_media_stream_set_loop(asCPointer(), loop);
    }

    /**
     * Sets whether the audio stream should be muted.
     * <br>
     * <br>Muting a stream will cause no audio to be played, but it
     * <br>does not modify the volume. This means that muting and
     * <br>then unmuting the stream will restore the volume settings.
     * <br>
     * <br>If the stream has no audio, calling this function will
     * <br>still work but it will not have an audible effect.
     * @param muted %TRUE if the stream should be muted
    */
    public void setMuted(boolean muted)  {
        JnaMediaStream.INST().gtk_media_stream_set_muted(asCPointer(), muted);
    }

    /**
     * Starts or pauses playback of the stream.
     * @param playing whether to start or pause playback
    */
    public void setPlaying(boolean playing)  {
        JnaMediaStream.INST().gtk_media_stream_set_playing(asCPointer(), playing);
    }

    /**
     * Sets the volume of the audio stream.
     * <br>
     * <br>This function call will work even if the stream is muted.
     * <br>
     * <br>The given &#64;volume should range from 0.0 for silence to 1.0
     * <br>for as loud as possible. Values outside of this range will
     * <br>be clamped to the nearest value.
     * <br>
     * <br>If the stream has no audio or is muted, calling this function
     * <br>will still work but it will not have an immediate audible effect.
     * <br>When the stream is unmuted, the new volume setting will take effect.
     * @param volume New volume of the stream from 0.0 to 1.0
    */
    public void setVolume(double volume)  {
        JnaMediaStream.INST().gtk_media_stream_set_volume(asCPointer(), volume);
    }

    /**
     * Pauses the media stream and marks it as ended.
     * <br>
     * <br>This is a hint only, calls to [method&#64;Gtk.MediaStream.play]
     * <br>may still happen.
     * <br>
     * <br>The media stream must be prepared when this function is called.
    */
    public void streamEnded()  {
        JnaMediaStream.INST().gtk_media_stream_stream_ended(asCPointer());
    }

    /**
     * Called by `GtkMediaStream` implementations to advertise the stream
     * <br>being ready to play and providing details about the stream.
     * <br>
     * <br>Note that the arguments are hints. If the stream implementation
     * <br>cannot determine the correct values, it is better to err on the
     * <br>side of caution and return %TRUE. User interfaces will use those
     * <br>values to determine what controls to show.
     * <br>
     * <br>This function may not be called again until the stream has been
     * <br>reset via [method&#64;Gtk.MediaStream.stream_unprepared].
     * @param has_audio %TRUE if the stream should advertise audio support
     * @param has_video %TRUE if the stream should advertise video support
     * @param seekable %TRUE if the stream should advertise seekability
     * @param duration The duration of the stream or 0 if unknown
    */
    public void streamPrepared(boolean has_audio, boolean has_video, boolean seekable, long duration)  {
        JnaMediaStream.INST().gtk_media_stream_stream_prepared(asCPointer(), has_audio, has_video, seekable, duration);
    }

    /**
     * Resets a given media stream implementation.
     * <br>
     * <br>[method&#64;Gtk.MediaStream.stream_prepared] can then be called again.
     * <br>
     * <br>This function will also reset any error state the stream was in.
    */
    public void streamUnprepared()  {
        JnaMediaStream.INST().gtk_media_stream_stream_unprepared(asCPointer());
    }

    /**
     * Undoes a previous call to gtk_media_stream_realize().
     * <br>
     * <br>This causes the stream to release all resources it had
     * <br>allocated from &#64;surface.
     * @param surface the `GdkSurface` the stream was realized with
    */
    public void unrealize(@Nonnull ch.bailu.gtk.gdk.Surface surface)  {
        JnaMediaStream.INST().gtk_media_stream_unrealize(asCPointer(), asCPointerNotNull(surface));
    }

    /**
     * Media stream implementations should regularly call this
     * <br>function to update the timestamp reported by the stream.
     * <br>
     * <br>It is up to implementations to call this at the frequency
     * <br>they deem appropriate.
     * <br>
     * <br>The media stream must be prepared when this function is called.
     * @param timestamp the new timestamp
    */
    public void update(long timestamp)  {
        JnaMediaStream.INST().gtk_media_stream_update(asCPointer(), timestamp);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gdk.Paintable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gdk.Paintable}
    */
    public ch.bailu.gtk.gdk.Paintable asPaintable() {
        return new ch.bailu.gtk.gdk.Paintable(cast());
    }

    public static long getTypeID() { 
        return JnaMediaStream.INST().gtk_media_stream_get_type(); 
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

[MethodModel:cb-deprecated:ended:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:java-type-not-supported:errorValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-deprecated:prepared:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]

[MethodModel:cb-deprecated:unprepared:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
