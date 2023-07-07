/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkWindowGroup` makes group of windows behave like separate applications.
 * <br>
 * <br>It achieves this by limiting the effect of GTK grabs and modality
 * <br>to windows in the same group.
 * <br>
 * <br>A window can be a member in at most one window group at a time.
 * <br>Windows that have not been explicitly assigned to a group are
 * <br>implicitly treated like windows of the default window group.
 * <br>
 * <br>`GtkWindowGroup` objects are referenced by each window in the group,
 * <br>so once you have added all windows to a `GtkWindowGroup`, you can drop
 * <br>the initial reference to the window group with g_object_unref(). If the
 * <br>windows in the window group are subsequently destroyed, then they will
 * <br>be removed from the window group and drop their references on the window
 * <br>group; when all window have been removed, the window group will be
 * <br>freed.
 * <p><a href="https://docs.gtk.org/gtk4/class.WindowGroup.html">https://docs.gtk.org/gtk4/class.WindowGroup.html</a></p>
*/
public class WindowGroup extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowGroup.class.getCanonicalName());
    }

    public WindowGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkWindowGroup` object.
     * <br>
     * <br>Modality of windows only affects windows
     * <br>within the same `GtkWindowGroup`.
    */
    public WindowGroup() {
        super(cast(JnaWindowGroup.INST().gtk_window_group_new()));
    }

    /**
     * Adds a window to a `GtkWindowGroup`.
     * @param window the `GtkWindow` to add
    */
    public void addWindow(@Nonnull Window window)  {
        JnaWindowGroup.INST().gtk_window_group_add_window(asCPointer(), asCPointerNotNull(window));
    }

    /**
     * Returns a list of the `GtkWindows` that belong to &#64;window_group.
     * @return A   newly-allocated list of windows inside the group.
    */
    public ch.bailu.gtk.glib.List listWindows()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaWindowGroup.INST().gtk_window_group_list_windows(asCPointer())));
    }

    /**
     * Removes a window from a `GtkWindowGroup`.
     * @param window the `GtkWindow` to remove
    */
    public void removeWindow(@Nonnull Window window)  {
        JnaWindowGroup.INST().gtk_window_group_remove_window(asCPointer(), asCPointerNotNull(window));
    }

    public static long getTypeID() { 
        return JnaWindowGroup.INST().gtk_window_group_get_type(); 
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
