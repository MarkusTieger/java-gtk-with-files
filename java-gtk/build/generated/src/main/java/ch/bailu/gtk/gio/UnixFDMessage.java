/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This &#35;GSocketControlMessage contains a &#35;GUnixFDList.
 * <br>It may be sent using g_socket_send_message() and received using
 * <br>g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * <br>%G_SOCKET_FAMILY_UNIX family). The file descriptors are copied
 * <br>between processes by the kernel.
 * <br>
 * <br>For an easier way to send and receive file descriptors over
 * <br>stream-oriented UNIX sockets, see g_unix_connection_send_fd() and
 * <br>g_unix_connection_receive_fd().
 * <br>
 * <br>Note that `&lt;gio/gunixfdmessage.h&gt;` belongs to the UNIX-specific GIO
 * <br>interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * <br>file when using it.
 * <p><a href="https://docs.gtk.org/gio/class.UnixFDMessage.html">https://docs.gtk.org/gio/class.UnixFDMessage.html</a></p>
*/
public class UnixFDMessage extends SocketControlMessage {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixFDMessage.class.getCanonicalName());
    }

    public UnixFDMessage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GUnixFDMessage containing &#64;list.
     * @param fd_list a &#35;GUnixFDList
     * @return a new &#35;GUnixFDMessage
    */
    public static UnixFDMessage newWithFdListUnixFDMessage(@Nonnull UnixFDList fd_list)  {
        PointerContainer __self = cast(JnaUnixFDMessage.INST().g_unix_fd_message_new_with_fd_list(asCPointerNotNull(fd_list)));
        if (__self.isNull()) {
            throw new NullPointerException("UnixFDMessage:newWithFdList");
        }
        return new UnixFDMessage(__self);
    }        
    

    /**
     * Creates a new &#35;GUnixFDMessage containing an empty file descriptor
     * <br>list.
    */
    public UnixFDMessage() {
        super(cast(JnaUnixFDMessage.INST().g_unix_fd_message_new()));
    }

    /**
     * Adds a file descriptor to &#64;message.
     * <br>
     * <br>The file descriptor is duplicated using dup(). You keep your copy
     * <br>of the descriptor and the copy contained in &#64;message will be closed
     * <br>when &#64;message is finalized.
     * <br>
     * <br>A possible cause of failure is exceeding the per-process or
     * <br>system-wide file descriptor limit.
     * @param fd a valid open file descriptor
     * @return %TRUE in case of success, else %FALSE (and &#64;error is set)
    */
    public boolean appendFd(int fd) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixFDMessage.INST().g_unix_fd_message_append_fd(asCPointer(), fd, 0L);
    }

    /**
     * Gets the &#35;GUnixFDList contained in &#64;message.  This function does not
     * <br>return a reference to the caller, but the returned list is valid for
     * <br>the lifetime of &#64;message.
     * @return the &#35;GUnixFDList from &#64;message
    */
    public UnixFDList getFdList()  {
        return new UnixFDList(new PointerContainer(JnaUnixFDMessage.INST().g_unix_fd_message_get_fd_list(asCPointer())));
    }

    /**
     * Returns the array of file descriptors that is contained in this
     * <br>object.
     * <br>
     * <br>After this call, the descriptors are no longer contained in
     * <br>&#64;message. Further calls will return an empty list (unless more
     * <br>descriptors have been added).
     * <br>
     * <br>The return result of this function must be freed with g_free().
     * <br>The caller is also responsible for closing all of the file
     * <br>descriptors.
     * <br>
     * <br>If &#64;length is non-%NULL then it is set to the number of file
     * <br>descriptors in the returned array. The returned array is also
     * <br>terminated with -1.
     * <br>
     * <br>This function never returns %NULL. In case there are no file
     * <br>descriptors contained in &#64;message, an empty array is returned.
     * @param length pointer to the length of the returned     array, or %NULL
     * @return an array of file     descriptors
    */
    public ch.bailu.gtk.type.Int stealFds(@Nullable ch.bailu.gtk.type.Int length)  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaUnixFDMessage.INST().g_unix_fd_message_steal_fds(asCPointer(), asCPointer(length))));
    }

    public static long getTypeID() { 
        return JnaUnixFDMessage.INST().g_unix_fd_message_get_type(); 
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
