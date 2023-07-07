/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMountOperation` is an implementation of `GMountOperation`.
 * <br>
 * <br>The functions and objects described here make working with GTK and
 * <br>GIO more convenient.
 * <br>
 * <br>`GtkMountOperation` is needed when mounting volumes:
 * <br>It is an implementation of `GMountOperation` that can be used with
 * <br>GIO functions for mounting volumes such as
 * <br>g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * <br>g_volume_mount(), g_mount_unmount_with_operation() and others.
 * <br>
 * <br>When necessary, `GtkMountOperation` shows dialogs to let the user
 * <br>enter passwords, ask questions or show processes blocking unmount.
 * <p><a href="https://docs.gtk.org/gtk4/class.MountOperation.html">https://docs.gtk.org/gtk4/class.MountOperation.html</a></p>
*/
public class MountOperation extends ch.bailu.gtk.gio.MountOperation {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MountOperation.class.getCanonicalName());
    }

    public MountOperation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkMountOperation`.
     * @param parent transient parent of the window
    */
    public MountOperation(@Nullable Window parent) {
        super(cast(JnaMountOperation.INST().gtk_mount_operation_new(asCPointer(parent))));
    }

    /**
     * Gets the display on which windows of the `GtkMountOperation`
     * <br>will be shown.
     * @return the display on which windows of &#64;op are shown
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaMountOperation.INST().gtk_mount_operation_get_display(asCPointer())));
    }

    /**
     * Gets the transient parent used by the `GtkMountOperation`.
     * @return the transient parent for windows shown by &#64;op
    */
    public Window getParent()  {
        return new Window(new PointerContainer(JnaMountOperation.INST().gtk_mount_operation_get_parent(asCPointer())));
    }

    /**
     * Returns whether the `GtkMountOperation` is currently displaying
     * <br>a window.
     * @return %TRUE if &#64;op is currently displaying a window
    */
    public boolean isShowing()  {
        return JnaMountOperation.INST().gtk_mount_operation_is_showing(asCPointer());
    }

    /**
     * Sets the display to show windows of the `GtkMountOperation` on.
     * @param display a `GdkDisplay`
    */
    public void setDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        JnaMountOperation.INST().gtk_mount_operation_set_display(asCPointer(), asCPointerNotNull(display));
    }

    /**
     * Sets the transient parent for windows shown by the
     * <br>`GtkMountOperation`.
     * @param parent transient parent of the window
    */
    public void setParent(@Nullable Window parent)  {
        JnaMountOperation.INST().gtk_mount_operation_set_parent(asCPointer(), asCPointer(parent));
    }

    public static long getTypeID() { 
        return JnaMountOperation.INST().gtk_mount_operation_get_type(); 
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
