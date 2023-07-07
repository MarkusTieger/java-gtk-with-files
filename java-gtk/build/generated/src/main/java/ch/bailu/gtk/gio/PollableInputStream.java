/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GPollableInputStream is implemented by &#35;GInputStreams that
 * <br>can be polled for readiness to read. This can be used when
 * <br>interfacing with a non-GIO API that expects
 * <br>UNIX-file-descriptor-style asynchronous I/O rather than GIO-style.
 * <p><a href="https://docs.gtk.org/gio/iface.PollableInputStream.html">https://docs.gtk.org/gio/iface.PollableInputStream.html</a></p>
*/
public class PollableInputStream extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PollableInputStream.class.getCanonicalName());
    }

    public PollableInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if &#64;stream is actually pollable. Some classes may implement
     * <br>&#35;GPollableInputStream but have only certain instances of that class
     * <br>be pollable. If this method returns %FALSE, then the behavior of
     * <br>other &#35;GPollableInputStream methods is undefined.
     * <br>
     * <br>For any given stream, the value returned by this method is constant;
     * <br>a stream cannot switch from pollable to non-pollable or vice versa.
     * @return %TRUE if &#64;stream is pollable, %FALSE if not.
    */
    public boolean canPoll()  {
        return JnaPollableInputStream.INST().g_pollable_input_stream_can_poll(asCPointer());
    }

    /**
     * Creates a &#35;GSource that triggers when &#64;stream can be read, or
     * <br>&#64;cancellable is triggered or an error occurs. The callback on the
     * <br>source is of the &#35;GPollableSourceFunc type.
     * <br>
     * <br>As with g_pollable_input_stream_is_readable(), it is possible that
     * <br>the stream may not actually be readable even after the source
     * <br>triggers, so you should use g_pollable_input_stream_read_nonblocking()
     * <br>rather than g_input_stream_read() from the callback.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a new &#35;GSource
    */
    public ch.bailu.gtk.glib.Source createSource(@Nullable Cancellable cancellable)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaPollableInputStream.INST().g_pollable_input_stream_create_source(asCPointer(), asCPointer(cancellable))));
    }

    /**
     * Checks if &#64;stream can be read.
     * <br>
     * <br>Note that some stream types may not be able to implement this 100%
     * <br>reliably, and it is possible that a call to g_input_stream_read()
     * <br>after this returns %TRUE would still block. To guarantee
     * <br>non-blocking behavior, you should always use
     * <br>g_pollable_input_stream_read_nonblocking(), which will return a
     * <br>%G_IO_ERROR_WOULD_BLOCK error rather than blocking.
     * @return %TRUE if &#64;stream is readable, %FALSE if not. If an error   has occurred on &#64;stream, this will result in   g_pollable_input_stream_is_readable() returning %TRUE, and the   next attempt to read will return the error.
    */
    public boolean isReadable()  {
        return JnaPollableInputStream.INST().g_pollable_input_stream_is_readable(asCPointer());
    }

    /**
     * Attempts to read up to &#64;count bytes from &#64;stream into &#64;buffer, as
     * <br>with g_input_stream_read(). If &#64;stream is not currently readable,
     * <br>this will immediately return %G_IO_ERROR_WOULD_BLOCK, and you can
     * <br>use g_pollable_input_stream_create_source() to create a &#35;GSource
     * <br>that will be triggered when &#64;stream is readable.
     * <br>
     * <br>Note that since this method never blocks, you cannot actually
     * <br>use &#64;cancellable to cancel it. However, it will return an error
     * <br>if &#64;cancellable has already been cancelled when you call, which
     * <br>may happen if you call this method after a source triggers due
     * <br>to having been cancelled.
     * @param buffer a     buffer to read data into (which should be at least &#64;count bytes long).
     * @param count the number of bytes you want to read
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return the number of bytes read, or -1 on error (including   %G_IO_ERROR_WOULD_BLOCK).
    */
    public long readNonblocking(@Nonnull ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPollableInputStream.INST().g_pollable_input_stream_read_nonblocking(asCPointer(), asCPointerNotNull(buffer), count, asCPointer(cancellable), 0L);
    }

    public static long getTypeID() { 
        return JnaPollableInputStream.INST().g_pollable_input_stream_get_type(); 
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
*/
