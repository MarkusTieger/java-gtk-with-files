/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GDatagramBased is a networking interface for representing datagram-based
 * <br>communications. It is a more or less direct mapping of the core parts of the
 * <br>BSD socket API in a portable GObject interface. It is implemented by
 * <br>&#35;GSocket, which wraps the UNIX socket API on UNIX and winsock2 on Windows.
 * <br>
 * <br>&#35;GDatagramBased is entirely platform independent, and is intended to be used
 * <br>alongside higher-level networking APIs such as &#35;GIOStream.
 * <br>
 * <br>It uses vectored scatter/gather I/O by default, allowing for many messages
 * <br>to be sent or received in a single call. Where possible, implementations of
 * <br>the interface should take advantage of vectored I/O to minimise processing
 * <br>or system calls. For example, &#35;GSocket uses recvmmsg() and sendmmsg() where
 * <br>possible. Callers should take advantage of scatter/gather I/O (the use of
 * <br>multiple buffers per message) to avoid unnecessary copying of data to
 * <br>assemble or disassemble a message.
 * <br>
 * <br>Each &#35;GDatagramBased operation has a timeout parameter which may be negative
 * <br>for blocking behaviour, zero for non-blocking behaviour, or positive for
 * <br>timeout behaviour. A blocking operation blocks until finished or there is an
 * <br>error. A non-blocking operation will return immediately with a
 * <br>%G_IO_ERROR_WOULD_BLOCK error if it cannot make progress. A timeout operation
 * <br>will block until the operation is complete or the timeout expires; if the
 * <br>timeout expires it will return what progress it made, or
 * <br>%G_IO_ERROR_TIMED_OUT if no progress was made. To know when a call would
 * <br>successfully run you can call g_datagram_based_condition_check() or
 * <br>g_datagram_based_condition_wait(). You can also use
 * <br>g_datagram_based_create_source() and attach it to a &#35;GMainContext to get
 * <br>callbacks when I/O is possible.
 * <br>
 * <br>When running a non-blocking operation applications should always be able to
 * <br>handle getting a %G_IO_ERROR_WOULD_BLOCK error even when some other function
 * <br>said that I/O was possible. This can easily happen in case of a race
 * <br>condition in the application, but it can also happen for other reasons. For
 * <br>instance, on Windows a socket is always seen as writable until a write
 * <br>returns %G_IO_ERROR_WOULD_BLOCK.
 * <br>
 * <br>As with &#35;GSocket, &#35;GDatagramBaseds can be either connection oriented (for
 * <br>example, SCTP) or connectionless (for example, UDP). &#35;GDatagramBaseds must be
 * <br>datagram-based, not stream-based. The interface does not cover connection
 * <br>establishment — use methods on the underlying type to establish a connection
 * <br>before sending and receiving data through the &#35;GDatagramBased API. For
 * <br>connectionless socket types the target/source address is specified or
 * <br>received in each I/O operation.
 * <br>
 * <br>Like most other APIs in GLib, &#35;GDatagramBased is not inherently thread safe.
 * <br>To use a &#35;GDatagramBased concurrently from multiple threads, you must
 * <br>implement your own locking.
 * <p><a href="https://docs.gtk.org/gio/iface.DatagramBased.html">https://docs.gtk.org/gio/iface.DatagramBased.html</a></p>
*/
public class DatagramBased extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DatagramBased.class.getCanonicalName());
    }

    public DatagramBased(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks on the readiness of &#64;datagram_based to perform operations. The
     * <br>operations specified in &#64;condition are checked for and masked against the
     * <br>currently-satisfied conditions on &#64;datagram_based. The result is returned.
     * <br>
     * <br>%G_IO_IN will be set in the return value if data is available to read with
     * <br>g_datagram_based_receive_messages(), or if the connection is closed remotely
     * <br>(EOS); and if the datagram_based has not been closed locally using some
     * <br>implementation-specific method (such as g_socket_close() or
     * <br>g_socket_shutdown() with &#64;shutdown_read set, if it’s a &#35;GSocket).
     * <br>
     * <br>If the connection is shut down or closed (by calling g_socket_close() or
     * <br>g_socket_shutdown() with &#64;shutdown_read set, if it’s a &#35;GSocket, for
     * <br>example), all calls to this function will return %G_IO_ERROR_CLOSED.
     * <br>
     * <br>%G_IO_OUT will be set if it is expected that at least one byte can be sent
     * <br>using g_datagram_based_send_messages() without blocking. It will not be set
     * <br>if the datagram_based has been closed locally.
     * <br>
     * <br>%G_IO_HUP will be set if the connection has been closed locally.
     * <br>
     * <br>%G_IO_ERR will be set if there was an asynchronous error in transmitting data
     * <br>previously enqueued using g_datagram_based_send_messages().
     * <br>
     * <br>Note that on Windows, it is possible for an operation to return
     * <br>%G_IO_ERROR_WOULD_BLOCK even immediately after
     * <br>g_datagram_based_condition_check() has claimed that the &#35;GDatagramBased is
     * <br>ready for writing. Rather than calling g_datagram_based_condition_check() and
     * <br>then writing to the &#35;GDatagramBased if it succeeds, it is generally better to
     * <br>simply try writing right away, and try again later if the initial attempt
     * <br>returns %G_IO_ERROR_WOULD_BLOCK.
     * <br>
     * <br>It is meaningless to specify %G_IO_ERR or %G_IO_HUP in &#64;condition; these
     * <br>conditions will always be set in the output if they are true. Apart from
     * <br>these flags, the output is guaranteed to be masked by &#64;condition.
     * <br>
     * <br>This call never blocks.
     * @param condition a &#35;GIOCondition mask to check
     * @return the &#35;GIOCondition mask of the current state
    */
    public int conditionCheck(int condition)  {
        return JnaDatagramBased.INST().g_datagram_based_condition_check(asCPointer(), condition);
    }

    /**
     * Waits for up to &#64;timeout microseconds for condition to become true on
     * <br>&#64;datagram_based. If the condition is met, %TRUE is returned.
     * <br>
     * <br>If &#64;cancellable is cancelled before the condition is met, or if &#64;timeout is
     * <br>reached before the condition is met, then %FALSE is returned and &#64;error is
     * <br>set appropriately (%G_IO_ERROR_CANCELLED or %G_IO_ERROR_TIMED_OUT).
     * @param condition a &#35;GIOCondition mask to wait for
     * @param timeout the maximum time (in microseconds) to wait, 0 to not block, or -1   to block indefinitely
     * @param cancellable a &#35;GCancellable
     * @return %TRUE if the condition was met, %FALSE otherwise
    */
    public boolean conditionWait(int condition, long timeout, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDatagramBased.INST().g_datagram_based_condition_wait(asCPointer(), condition, timeout, asCPointer(cancellable), 0L);
    }

    /**
     * Creates a &#35;GSource that can be attached to a &#35;GMainContext to monitor for
     * <br>the availability of the specified &#64;condition on the &#35;GDatagramBased. The
     * <br>&#35;GSource keeps a reference to the &#64;datagram_based.
     * <br>
     * <br>The callback on the source is of the &#35;GDatagramBasedSourceFunc type.
     * <br>
     * <br>It is meaningless to specify %G_IO_ERR or %G_IO_HUP in &#64;condition; these
     * <br>conditions will always be reported in the callback if they are true.
     * <br>
     * <br>If non-%NULL, &#64;cancellable can be used to cancel the source, which will
     * <br>cause the source to trigger, reporting the current condition (which is
     * <br>likely 0 unless cancellation happened at the same time as a condition
     * <br>change). You can check for this in the callback using
     * <br>g_cancellable_is_cancelled().
     * @param condition a &#35;GIOCondition mask to monitor
     * @param cancellable a &#35;GCancellable
     * @return a newly allocated &#35;GSource
    */
    public ch.bailu.gtk.glib.Source createSource(int condition, @Nullable Cancellable cancellable)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaDatagramBased.INST().g_datagram_based_create_source(asCPointer(), condition, asCPointer(cancellable))));
    }

    public static long getTypeID() { 
        return JnaDatagramBased.INST().g_datagram_based_get_type(); 
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

[MethodModel:java-type-not-supported:receiveMessages:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GInputMessage*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:sendMessages:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GOutputMessage*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
