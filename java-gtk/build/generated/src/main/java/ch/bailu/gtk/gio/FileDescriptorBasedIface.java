/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface for file descriptor based io objects.
 * <p><a href="https://docs.gtk.org/gio/struct.FileDescriptorBasedIface.html">https://docs.gtk.org/gio/struct.FileDescriptorBasedIface.html</a></p>
*/
public class FileDescriptorBasedIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileDescriptorBasedIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetFd {
        /**
         * 
         * @param fd_based a &#35;GFileDescriptorBased.
         * @return The file descriptor
        */
        int onGetFd(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FileDescriptorBased fd_based);
    }
    
    private static JnaFileDescriptorBasedIface.OnGetFd toOnGetFd(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFd in) {
        JnaFileDescriptorBasedIface.OnGetFd out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fd_based) -> in.onGetFd(__callback, new FileDescriptorBased(new PointerContainer(_fd_based)));
            __callback.register(out);
        }
        return out;
    }

    public FileDescriptorBasedIface(PointerContainer pointer) {
        super(pointer);
    }

    public FileDescriptorBasedIface() {
        super(cast(JnaFileDescriptorBasedIface.allocateStructure()));
    }

    private JnaFileDescriptorBasedIface.Fields _fields;
    
    JnaFileDescriptorBasedIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileDescriptorBasedIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnGetFd#onGetFd}
    */
    public static final String GET_FD = "get_fd";

    /**
     * 
     * <br>See {@link OnGetFd#onGetFd}
    */
    public void setFieldGetFd(OnGetFd get_fd) {
        toFields().get_fd = toOnGetFd(this, GET_FD, get_fd);
        toFields().writeField(GET_FD);
    }

    /**
     * 
     * <br>See {@link OnGetFd#onGetFd}
    */
    public JnaFileDescriptorBasedIface.OnGetFd getFieldGetFd() {
       toFields().readField(GET_FD);
       return toFields().get_fd;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileDescriptorBased.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileDescriptorBased.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
