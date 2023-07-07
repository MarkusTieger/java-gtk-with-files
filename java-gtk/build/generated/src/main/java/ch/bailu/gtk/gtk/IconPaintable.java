/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Contains information found when looking up an icon in `GtkIconTheme`.
 * <br>
 * <br>`GtkIconPaintable` implements `GdkPaintable`.
 * <p><a href="https://docs.gtk.org/gtk4/class.IconPaintable.html">https://docs.gtk.org/gtk4/class.IconPaintable.html</a></p>
*/
public class IconPaintable extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IconPaintable.class.getCanonicalName());
    }

    public IconPaintable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkIconPaintable` for a file with a given size and scale.
     * <br>
     * <br>The icon can then be rendered by using it as a `GdkPaintable`.
     * @param file a `GFile`
     * @param size desired icon size
     * @param scale the desired scale
     * @return a `GtkIconPaintable` containing   for the icon. Unref with g_object_unref()
    */
    public static IconPaintable newForFileIconPaintable(@Nonnull ch.bailu.gtk.gio.File file, int size, int scale)  {
        PointerContainer __self = cast(JnaIconPaintable.INST().gtk_icon_paintable_new_for_file(asCPointerNotNull(file), size, scale));
        if (__self.isNull()) {
            throw new NullPointerException("IconPaintable:newForFile");
        }
        return new IconPaintable(__self);
    }        
    

    /**
     * Gets the `GFile` that was used to load the icon.
     * <br>
     * <br>Returns %NULL if the icon was not loaded from a file.
     * @return the `GFile` for the icon
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaIconPaintable.INST().gtk_icon_paintable_get_file(asCPointer())));
    }

    /**
     * Get the icon name being used for this icon.
     * <br>
     * <br>When an icon looked up in the icon theme was not available, the
     * <br>icon theme may use fallback icons - either those specified to
     * <br>gtk_icon_theme_lookup_icon() or the always-available
     * <br>&quot;image-missing&quot;. The icon chosen is returned by this function.
     * <br>
     * <br>If the icon was created without an icon theme, this function
     * <br>returns %NULL.
     * @return the themed icon-name for the   icon, or %NULL if its not a themed icon.
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIconPaintable.INST().gtk_icon_paintable_get_icon_name(asCPointer())));
    }

    /**
     * Checks if the icon is symbolic or not.
     * <br>
     * <br>This currently uses only the file name and not the file contents
     * <br>for determining this. This behaviour may change in the future.
     * <br>
     * <br>Note that to render a symbolic `GtkIconPaintable` properly (with
     * <br>recoloring), you have to set its icon name on a `GtkImage`.
     * @return %TRUE if the icon is symbolic, %FALSE otherwise
    */
    public boolean isSymbolic()  {
        return JnaIconPaintable.INST().gtk_icon_paintable_is_symbolic(asCPointer());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gdk.Paintable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gdk.Paintable}
    */
    public ch.bailu.gtk.gdk.Paintable asPaintable() {
        return new ch.bailu.gtk.gdk.Paintable(cast());
    }

    /**
     * Implements interface {@link SymbolicPaintable}. Call this to get access to interface functions.
     * @return {@link SymbolicPaintable}
    */
    public SymbolicPaintable asSymbolicPaintable() {
        return new SymbolicPaintable(cast());
    }

    public static long getTypeID() { 
        return JnaIconPaintable.INST().gtk_icon_paintable_get_type(); 
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
