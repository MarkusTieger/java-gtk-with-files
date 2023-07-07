/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkShortcutManager` interface is used to implement
 * <br>shortcut scopes.
 * <br>
 * <br>This is important for [iface&#64;Gtk.Native] widgets that have their
 * <br>own surface, since the event controllers that are used to implement
 * <br>managed and global scopes are limited to the same native.
 * <br>
 * <br>Examples for widgets implementing `GtkShortcutManager` are
 * <br>[class&#64;Gtk.Window] and [class&#64;Gtk.Popover].
 * <br>
 * <br>Every widget that implements `GtkShortcutManager` will be used as a
 * <br>%GTK_SHORTCUT_SCOPE_MANAGED.
 * <p><a href="https://docs.gtk.org/gtk4/iface.ShortcutManager.html">https://docs.gtk.org/gtk4/iface.ShortcutManager.html</a></p>
*/
public class ShortcutManager extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutManager.class.getCanonicalName());
    }

    public ShortcutManager(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaShortcutManager.INST().gtk_shortcut_manager_get_type(); 
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
