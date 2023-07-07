/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GUnixFDList contains a list of file descriptors.  It owns the file
 * <br>descriptors that it contains, closing them when finalized.
 * <br>
 * <br>It may be wrapped in a &#35;GUnixFDMessage and sent over a &#35;GSocket in
 * <br>the %G_SOCKET_FAMILY_UNIX family by using g_socket_send_message()
 * <br>and received using g_socket_receive_message().
 * <br>
 * <br>Before 2.74, `&lt;gio/gunixfdlist.h&gt;` belonged to the UNIX-specific GIO
 * <br>interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
 * <br>using it.
 * <br>
 * <br>Since 2.74, the API is available for Windows.
 * <p><a href="https://docs.gtk.org/gio/class.UnixFDList.html">https://docs.gtk.org/gio/class.UnixFDList.html</a></p>
*/
public class UnixFDList extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixFDList.class.getCanonicalName());
    }

    public UnixFDList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GUnixFDList containing no file descriptors.
    */
    public UnixFDList() {
        super(cast(JnaUnixFDList.INST().g_unix_fd_list_new()));
    }

    /**
     * Adds a file descriptor to &#64;list.
     * <br>
     * <br>The file descriptor is duplicated using dup(). You keep your copy
     * <br>of the descriptor and the copy contained in &#64;list will be closed
     * <br>when &#64;list is finalized.
     * <br>
     * <br>A possible cause of failure is exceeding the per-process or
     * <br>system-wide file descriptor limit.
     * <br>
     * <br>The index of the file descriptor in the list is returned.  If you use
     * <br>this index with g_unix_fd_list_get() then you will receive back a
     * <br>duplicated copy of the same file descriptor.
     * @param fd a valid open file descriptor
     * @return the index of the appended fd in case of success, else -1          (and &#64;error is set)
    */
    public int append(int fd) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixFDList.INST().g_unix_fd_list_append(asCPointer(), fd, 0L);
    }

    /**
     * Gets a file descriptor out of &#64;list.
     * <br>
     * <br>&#64;index_ specifies the index of the file descriptor to get.  It is a
     * <br>programmer error for &#64;index_ to be out of range; see
     * <br>g_unix_fd_list_get_length().
     * <br>
     * <br>The file descriptor is duplicated using dup() and set as
     * <br>close-on-exec before being returned.  You must call close() on it
     * <br>when you are done.
     * <br>
     * <br>A possible cause of failure is exceeding the per-process or
     * <br>system-wide file descriptor limit.
     * @param index_ the index into the list
     * @return the file descriptor, or -1 in case of error
    */
    public int get(int index_) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixFDList.INST().g_unix_fd_list_get(asCPointer(), index_, 0L);
    }

    /**
     * Gets the length of &#64;list (ie: the number of file descriptors
     * <br>contained within).
     * @return the length of &#64;list
    */
    public int getLength()  {
        return JnaUnixFDList.INST().g_unix_fd_list_get_length(asCPointer());
    }

    /**
     * Returns the array of file descriptors that is contained in this
     * <br>object.
     * <br>
     * <br>After this call, the descriptors are no longer contained in
     * <br>&#64;list. Further calls will return an empty list (unless more
     * <br>descriptors have been added).
     * <br>
     * <br>The return result of this function must be freed with g_free().
     * <br>The caller is also responsible for closing all of the file
     * <br>descriptors.  The file descriptors in the array are set to
     * <br>close-on-exec.
     * <br>
     * <br>If &#64;length is non-%NULL then it is set to the number of file
     * <br>descriptors in the returned array. The returned array is also
     * <br>terminated with -1.
     * <br>
     * <br>This function never returns %NULL. In case there are no file
     * <br>descriptors contained in &#64;list, an empty array is returned.
     * @param length pointer to the length of the returned     array, or %NULL
     * @return an array of file     descriptors
    */
    public ch.bailu.gtk.type.Int stealFds(@Nullable ch.bailu.gtk.type.Int length)  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaUnixFDList.INST().g_unix_fd_list_steal_fds(asCPointer(), asCPointer(length))));
    }

    public static long getTypeID() { 
        return JnaUnixFDList.INST().g_unix_fd_list_get_type(); 
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

[MethodModel:java-type-not-supported:newFromArray:[ParameterModel:Supported:{Gg:UnixFDList:{c:GUnixFDList*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:peekFds:[ParameterModel:java-type-not-supported:{G_::{c:const gint*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
*/
