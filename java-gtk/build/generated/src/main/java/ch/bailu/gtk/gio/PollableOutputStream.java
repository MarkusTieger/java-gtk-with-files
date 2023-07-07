/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GPollableOutputStream is implemented by &#35;GOutputStreams that
 * <br>can be polled for readiness to write. This can be used when
 * <br>interfacing with a non-GIO API that expects
 * <br>UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 * <p><a href="https://docs.gtk.org/gio/iface.PollableOutputStream.html">https://docs.gtk.org/gio/iface.PollableOutputStream.html</a></p>
*/
public class PollableOutputStream extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PollableOutputStream.class.getCanonicalName());
    }

    public PollableOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if &#64;stream is actually pollable. Some classes may implement
     * <br>&#35;GPollableOutputStream but have only certain instances of that
     * <br>class be pollable. If this method returns %FALSE, then the behavior
     * <br>of other &#35;GPollableOutputStream methods is undefined.
     * <br>
     * <br>For any given stream, the value returned by this method is constant;
     * <br>a stream cannot switch from pollable to non-pollable or vice versa.
     * @return %TRUE if &#64;stream is pollable, %FALSE if not.
    */
    public boolean canPoll()  {
        return JnaPollableOutputStream.INST().g_pollable_output_stream_can_poll(asCPointer());
    }

    /**
     * Creates a &#35;GSource that triggers when &#64;stream can be written, or
     * <br>&#64;cancellable is triggered or an error occurs. The callback on the
     * <br>source is of the &#35;GPollableSourceFunc type.
     * <br>
     * <br>As with g_pollable_output_stream_is_writable(), it is possible that
     * <br>the stream may not actually be writable even after the source
     * <br>triggers, so you should use g_pollable_output_stream_write_nonblocking()
     * <br>rather than g_output_stream_write() from the callback.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a new &#35;GSource
    */
    public ch.bailu.gtk.glib.Source createSource(@Nullable Cancellable cancellable)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaPollableOutputStream.INST().g_pollable_output_stream_create_source(asCPointer(), asCPointer(cancellable))));
    }

    /**
     * Checks if &#64;stream can be written.
     * <br>
     * <br>Note that some stream types may not be able to implement this 100%
     * <br>reliably, and it is possible that a call to g_output_stream_write()
     * <br>after this returns %TRUE would still block. To guarantee
     * <br>non-blocking behavior, you should always use
     * <br>g_pollable_output_stream_write_nonblocking(), which will return a
     * <br>%G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     * @return %TRUE if &#64;stream is writable, %FALSE if not. If an error   has occurred on &#64;stream, this will result in   g_pollable_output_stream_is_writable() returning %TRUE, and the   next attempt to write will return the error.
    */
    public boolean isWritable()  {
        return JnaPollableOutputStream.INST().g_pollable_output_stream_is_writable(asCPointer());
    }

    /**
     * Attempts to write up to &#64;count bytes from &#64;buffer to &#64;stream, as
     * <br>with g_output_stream_write(). If &#64;stream is not currently writable,
     * <br>this will immediately return %G_IO_ERROR_WOULD_BLOCK, and you can
     * <br>use g_pollable_output_stream_create_source() to create a &#35;GSource
     * <br>that will be triggered when &#64;stream is writable.
     * <br>
     * <br>Note that since this method never blocks, you cannot actually
     * <br>use &#64;cancellable to cancel it. However, it will return an error
     * <br>if &#64;cancellable has already been cancelled when you call, which
     * <br>may happen if you call this method after a source triggers due
     * <br>to having been cancelled.
     * <br>
     * <br>Also note that if %G_IO_ERROR_WOULD_BLOCK is returned some underlying
     * <br>transports like D/TLS require that you re-send the same &#64;buffer and
     * <br>&#64;count in the next write call.
     * @param buffer a buffer to write     data from
     * @param count the number of bytes you want to write
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return the number of bytes written, or -1 on error (including   %G_IO_ERROR_WOULD_BLOCK).
    */
    public long writeNonblocking(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPollableOutputStream.INST().g_pollable_output_stream_write_nonblocking(asCPointer(), asCPointerNotNull(buffer), count, asCPointer(cancellable), 0L);
    }

    public static long getTypeID() { 
        return JnaPollableOutputStream.INST().g_pollable_output_stream_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:writevNonblocking:[ParameterModel:Supported:{G_::{c:GPollableReturn}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
