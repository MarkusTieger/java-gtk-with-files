/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Defines a Unix mount point (e.g. &lt;filename&gt;/dev&lt;/filename&gt;).
 * <br>This corresponds roughly to a fstab entry.
 * <p><a href="https://docs.gtk.org/gio/struct.UnixMountPoint.html">https://docs.gtk.org/gio/struct.UnixMountPoint.html</a></p>
*/
public class UnixMountPoint extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixMountPoint.class.getCanonicalName());
    }

    public UnixMountPoint(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Compares two unix mount points.
     * @param mount2 a &#35;GUnixMount.
     * @return 1, 0 or -1 if &#64;mount1 is greater than, equal to, or less than &#64;mount2, respectively.
    */
    public int compare(@Nonnull UnixMountPoint mount2)  {
        return JnaUnixMountPoint.INST().g_unix_mount_point_compare(asCPointer(), asCPointerNotNull(mount2));
    }

    /**
     * Makes a copy of &#64;mount_point.
     * @return a new &#35;GUnixMountPoint
    */
    public UnixMountPoint copy()  {
        return new UnixMountPoint(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_copy(asCPointer())));
    }

    /**
     * Frees a unix mount point.
    */
    public void free()  {
        JnaUnixMountPoint.INST().g_unix_mount_point_free(asCPointer());
    }

    /**
     * Gets the device path for a unix mount point.
     * @return a string containing the device path.
    */
    public ch.bailu.gtk.type.Str getDevicePath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_get_device_path(asCPointer())));
    }

    /**
     * Gets the file system type for the mount point.
     * @return a string containing the file system type.
    */
    public ch.bailu.gtk.type.Str getFsType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_get_fs_type(asCPointer())));
    }

    /**
     * Gets the mount path for a unix mount point.
     * @return a string containing the mount path.
    */
    public ch.bailu.gtk.type.Str getMountPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_get_mount_path(asCPointer())));
    }

    /**
     * Gets the options for the mount point.
     * @return a string containing the options.
    */
    public ch.bailu.gtk.type.Str getOptions()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_get_options(asCPointer())));
    }

    /**
     * Guesses whether a Unix mount point can be ejected.
     * @return %TRUE if &#64;mount_point is deemed to be ejectable.
    */
    public boolean guessCanEject()  {
        return JnaUnixMountPoint.INST().g_unix_mount_point_guess_can_eject(asCPointer());
    }

    /**
     * Guesses the icon of a Unix mount point.
     * @return a &#35;GIcon
    */
    public Icon guessIcon()  {
        return new Icon(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_guess_icon(asCPointer())));
    }

    /**
     * Guesses the name of a Unix mount point.
     * <br>The result is a translated string.
     * @return A newly allocated string that must     be freed with g_free()
    */
    public ch.bailu.gtk.type.Str guessName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_guess_name(asCPointer())));
    }

    /**
     * Guesses the symbolic icon of a Unix mount point.
     * @return a &#35;GIcon
    */
    public Icon guessSymbolicIcon()  {
        return new Icon(new PointerContainer(JnaUnixMountPoint.INST().g_unix_mount_point_guess_symbolic_icon(asCPointer())));
    }

    /**
     * Checks if a unix mount point is a loopback device.
     * @return %TRUE if the mount point is a loopback. %FALSE otherwise.
    */
    public boolean isLoopback()  {
        return JnaUnixMountPoint.INST().g_unix_mount_point_is_loopback(asCPointer());
    }

    /**
     * Checks if a unix mount point is read only.
     * @return %TRUE if a mount point is read only.
    */
    public boolean isReadonly()  {
        return JnaUnixMountPoint.INST().g_unix_mount_point_is_readonly(asCPointer());
    }

    /**
     * Checks if a unix mount point is mountable by the user.
     * @return %TRUE if the mount point is user mountable.
    */
    public boolean isUserMountable()  {
        return JnaUnixMountPoint.INST().g_unix_mount_point_is_user_mountable(asCPointer());
    }

    public static long getTypeID() { 
        return JnaUnixMountPoint.INST().g_unix_mount_point_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:at:[ParameterModel:Supported:{Gg:UnixMountPoint:{c:GUnixMountPoint*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]
*/
