/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GFileDescriptorBased is implemented by streams (implementations of
 * <br>&#35;GInputStream or &#35;GOutputStream) that are based on file descriptors.
 * <br>
 * <br>Note that `&lt;gio/gfiledescriptorbased.h&gt;` belongs to the UNIX-specific
 * <br>GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * <br>file when using it.
 * <p><a href="https://docs.gtk.org/gio/iface.FileDescriptorBased.html">https://docs.gtk.org/gio/iface.FileDescriptorBased.html</a></p>
*/
public class FileDescriptorBased extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileDescriptorBased.class.getCanonicalName());
    }

    public FileDescriptorBased(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the underlying file descriptor.
     * @return The file descriptor
    */
    public int getFd()  {
        return JnaFileDescriptorBased.INST().g_file_descriptor_based_get_fd(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFileDescriptorBased.INST().g_file_descriptor_based_get_type(); 
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
