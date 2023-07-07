/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Support for UNIX-domain (also known as local) sockets.
 * <br>
 * <br>UNIX domain sockets are generally visible in the filesystem.
 * <br>However, some systems support abstract socket names which are not
 * <br>visible in the filesystem and not affected by the filesystem
 * <br>permissions, visibility, etc. Currently this is only supported
 * <br>under Linux. If you attempt to use abstract sockets on other
 * <br>systems, function calls may return %G_IO_ERROR_NOT_SUPPORTED
 * <br>errors. You can use g_unix_socket_address_abstract_names_supported()
 * <br>to see if abstract names are supported.
 * <br>
 * <br>Since GLib 2.72, &#35;GUnixSocketAddress is available on all platforms. It
 * <br>requires underlying system support (such as Windows 10 with `AF_UNIX`) at
 * <br>run time.
 * <br>
 * <br>Before GLib 2.72, `&lt;gio/gunixsocketaddress.h&gt;` belonged to the UNIX-specific
 * <br>GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
 * <br>when using it. This is no longer necessary since GLib 2.72.
 * <p><a href="https://docs.gtk.org/gio/class.UnixSocketAddress.html">https://docs.gtk.org/gio/class.UnixSocketAddress.html</a></p>
*/
public class UnixSocketAddress extends SocketAddress {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixSocketAddress.class.getCanonicalName());
    }

    public UnixSocketAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GUnixSocketAddress of type &#64;type with name &#64;path.
     * <br>
     * <br>If &#64;type is %G_UNIX_SOCKET_ADDRESS_PATH, this is equivalent to
     * <br>calling g_unix_socket_address_new().
     * <br>
     * <br>If &#64;type is %G_UNIX_SOCKET_ADDRESS_ANONYMOUS, &#64;path and &#64;path_len will be
     * <br>ignored.
     * <br>
     * <br>If &#64;path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT, then &#64;path_len
     * <br>bytes of &#64;path will be copied to the socket's path, and only those
     * <br>bytes will be considered part of the name. (If &#64;path_len is -1,
     * <br>then &#64;path is assumed to be NUL-terminated.) For example, if &#64;path
     * <br>was &quot;test&quot;, then calling g_socket_address_get_native_size() on the
     * <br>returned socket would return 7 (2 bytes of overhead, 1 byte for the
     * <br>abstract-socket indicator byte, and 4 bytes for the name &quot;test&quot;).
     * <br>
     * <br>If &#64;path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED, then
     * <br>&#64;path_len bytes of &#64;path will be copied to the socket's path, the
     * <br>rest of the path will be padded with 0 bytes, and the entire
     * <br>zero-padded buffer will be considered the name. (As above, if
     * <br>&#64;path_len is -1, then &#64;path is assumed to be NUL-terminated.) In
     * <br>this case, g_socket_address_get_native_size() will always return
     * <br>the full size of a `struct sockaddr_un`, although
     * <br>g_unix_socket_address_get_path_len() will still return just the
     * <br>length of &#64;path.
     * <br>
     * <br>%G_UNIX_SOCKET_ADDRESS_ABSTRACT is preferred over
     * <br>%G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED for new programs. Of course,
     * <br>when connecting to a server created by another process, you must
     * <br>use the appropriate type corresponding to how that process created
     * <br>its listening socket.
     * @param path the name
     * @param path_len the length of &#64;path, or -1
     * @param type a &#35;GUnixSocketAddressType
     * @return a new &#35;GUnixSocketAddress
    */
    public static UnixSocketAddress newWithTypeUnixSocketAddress(@Nonnull ch.bailu.gtk.type.Str path, int path_len, int type)  {
        PointerContainer __self = cast(JnaUnixSocketAddress.INST().g_unix_socket_address_new_with_type(asCPointerNotNull(path), path_len, type));
        if (__self.isNull()) {
            throw new NullPointerException("UnixSocketAddress:newWithType");
        }
        return new UnixSocketAddress(__self);
    }        
    

    /**
     * Creates a new &#35;GUnixSocketAddress of type &#64;type with name &#64;path.
     * <br>
     * <br>If &#64;type is %G_UNIX_SOCKET_ADDRESS_PATH, this is equivalent to
     * <br>calling g_unix_socket_address_new().
     * <br>
     * <br>If &#64;type is %G_UNIX_SOCKET_ADDRESS_ANONYMOUS, &#64;path and &#64;path_len will be
     * <br>ignored.
     * <br>
     * <br>If &#64;path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT, then &#64;path_len
     * <br>bytes of &#64;path will be copied to the socket's path, and only those
     * <br>bytes will be considered part of the name. (If &#64;path_len is -1,
     * <br>then &#64;path is assumed to be NUL-terminated.) For example, if &#64;path
     * <br>was &quot;test&quot;, then calling g_socket_address_get_native_size() on the
     * <br>returned socket would return 7 (2 bytes of overhead, 1 byte for the
     * <br>abstract-socket indicator byte, and 4 bytes for the name &quot;test&quot;).
     * <br>
     * <br>If &#64;path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED, then
     * <br>&#64;path_len bytes of &#64;path will be copied to the socket's path, the
     * <br>rest of the path will be padded with 0 bytes, and the entire
     * <br>zero-padded buffer will be considered the name. (As above, if
     * <br>&#64;path_len is -1, then &#64;path is assumed to be NUL-terminated.) In
     * <br>this case, g_socket_address_get_native_size() will always return
     * <br>the full size of a `struct sockaddr_un`, although
     * <br>g_unix_socket_address_get_path_len() will still return just the
     * <br>length of &#64;path.
     * <br>
     * <br>%G_UNIX_SOCKET_ADDRESS_ABSTRACT is preferred over
     * <br>%G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED for new programs. Of course,
     * <br>when connecting to a server created by another process, you must
     * <br>use the appropriate type corresponding to how that process created
     * <br>its listening socket.
     * @param path the name
     * @param path_len the length of &#64;path, or -1
     * @param type a &#35;GUnixSocketAddressType
     * @return a new &#35;GUnixSocketAddress
    */
    public static UnixSocketAddress newWithTypeUnixSocketAddress(String path, int path_len, int type)  {
        PointerContainer __self = cast(JnaUnixSocketAddress.INST().g_unix_socket_address_new_with_type(path, path_len, type));
        if (__self.isNull()) {
            throw new NullPointerException("UnixSocketAddress:newWithType");
        }
        return new UnixSocketAddress(__self);
    }        
    

    /**
     * Creates a new &#35;GUnixSocketAddress for &#64;path.
     * <br>
     * <br>To create abstract socket addresses, on systems that support that,
     * <br>use g_unix_socket_address_new_abstract().
     * @param path the socket path
    */
    public UnixSocketAddress(@Nonnull ch.bailu.gtk.type.Str path) {
        super(cast(JnaUnixSocketAddress.INST().g_unix_socket_address_new(asCPointerNotNull(path))));
    }

    /**
     * Creates a new &#35;GUnixSocketAddress for &#64;path.
     * <br>
     * <br>To create abstract socket addresses, on systems that support that,
     * <br>use g_unix_socket_address_new_abstract().
     * @param path the socket path
    */
    public UnixSocketAddress(String path) {
        super(cast(JnaUnixSocketAddress.INST().g_unix_socket_address_new(path)));
    }

    /**
     * Gets &#64;address's type.
     * @return a &#35;GUnixSocketAddressType
    */
    public int getAddressType()  {
        return JnaUnixSocketAddress.INST().g_unix_socket_address_get_address_type(asCPointer());
    }

    /**
     * Gets &#64;address's path, or for abstract sockets the &quot;name&quot;.
     * <br>
     * <br>Guaranteed to be zero-terminated, but an abstract socket
     * <br>may contain embedded zeros, and thus you should use
     * <br>g_unix_socket_address_get_path_len() to get the true length
     * <br>of this string.
     * @return the path for &#64;address
    */
    public ch.bailu.gtk.type.Str getPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixSocketAddress.INST().g_unix_socket_address_get_path(asCPointer())));
    }

    /**
     * Gets the length of &#64;address's path.
     * <br>
     * <br>For details, see g_unix_socket_address_get_path().
     * @return the length of the path
    */
    public long getPathLen()  {
        return JnaUnixSocketAddress.INST().g_unix_socket_address_get_path_len(asCPointer());
    }

    /**
     * Checks if abstract UNIX domain socket names are supported.
     * @return %TRUE if supported, %FALSE otherwise
    */
    public static boolean abstractNamesSupported()  {
        return JnaUnixSocketAddress.INST().g_unix_socket_address_abstract_names_supported();
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaUnixSocketAddress.INST().g_unix_socket_address_get_type(); 
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

[MethodModel:cb-deprecated:newAbstract:[ParameterModel:Supported:{Gg:SocketAddress:{c:GSocketAddress*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-deprecated:getIsAbstract:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
*/
