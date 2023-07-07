/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GUnixOutputStream implements &#35;GOutputStream for writing to a UNIX
 * <br>file descriptor, including asynchronous operations. (If the file
 * <br>descriptor refers to a socket or pipe, this will use poll() to do
 * <br>asynchronous I/O. If it refers to a regular file, it will fall back
 * <br>to doing asynchronous I/O in another thread.)
 * <br>
 * <br>Note that `&lt;gio/gunixoutputstream.h&gt;` belongs to the UNIX-specific GIO
 * <br>interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config file
 * <br>when using it.
 * <p><a href="https://docs.gtk.org/gio/class.UnixOutputStream.html">https://docs.gtk.org/gio/class.UnixOutputStream.html</a></p>
*/
public class UnixOutputStream extends OutputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixOutputStream.class.getCanonicalName());
    }

    public UnixOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GUnixOutputStream for the given &#64;fd.
     * <br>
     * <br>If &#64;close_fd, is %TRUE, the file descriptor will be closed when
     * <br>the output stream is destroyed.
     * @param fd a UNIX file descriptor
     * @param close_fd %TRUE to close the file descriptor when done
    */
    public UnixOutputStream(int fd, boolean close_fd) {
        super(cast(JnaUnixOutputStream.INST().g_unix_output_stream_new(fd, close_fd)));
    }

    /**
     * Returns whether the file descriptor of &#64;stream will be
     * <br>closed when the stream is closed.
     * @return %TRUE if the file descriptor is closed when done
    */
    public boolean getCloseFd()  {
        return JnaUnixOutputStream.INST().g_unix_output_stream_get_close_fd(asCPointer());
    }

    /**
     * Return the UNIX file descriptor that the stream writes to.
     * @return The file descriptor of &#64;stream
    */
    public int getFd()  {
        return JnaUnixOutputStream.INST().g_unix_output_stream_get_fd(asCPointer());
    }

    /**
     * Sets whether the file descriptor of &#64;stream shall be closed
     * <br>when the stream is closed.
     * @param close_fd %TRUE to close the file descriptor when done
    */
    public void setCloseFd(boolean close_fd)  {
        JnaUnixOutputStream.INST().g_unix_output_stream_set_close_fd(asCPointer(), close_fd);
    }

    /**
     * Implements interface {@link FileDescriptorBased}. Call this to get access to interface functions.
     * @return {@link FileDescriptorBased}
    */
    public FileDescriptorBased asFileDescriptorBased() {
        return new FileDescriptorBased(cast());
    }

    /**
     * Implements interface {@link PollableOutputStream}. Call this to get access to interface functions.
     * @return {@link PollableOutputStream}
    */
    public PollableOutputStream asPollableOutputStream() {
        return new PollableOutputStream(cast());
    }

    public static long getTypeID() { 
        return JnaUnixOutputStream.INST().g_unix_output_stream_get_type(); 
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
