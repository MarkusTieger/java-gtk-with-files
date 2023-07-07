/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GEmblemedIcon is an implementation of &#35;GIcon that supports
 * <br>adding an emblem to an icon. Adding multiple emblems to an
 * <br>icon is ensured via g_emblemed_icon_add_emblem().
 * <br>
 * <br>Note that &#35;GEmblemedIcon allows no control over the position
 * <br>of the emblems. See also &#35;GEmblem for more information.
 * <p><a href="https://docs.gtk.org/gio/class.EmblemedIcon.html">https://docs.gtk.org/gio/class.EmblemedIcon.html</a></p>
*/
public class EmblemedIcon extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EmblemedIcon.class.getCanonicalName());
    }

    public EmblemedIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new emblemed icon for &#64;icon with the emblem &#64;emblem.
     * @param icon a &#35;GIcon
     * @param emblem a &#35;GEmblem, or %NULL
    */
    public EmblemedIcon(@Nonnull Icon icon, @Nullable Emblem emblem) {
        super(cast(JnaEmblemedIcon.INST().g_emblemed_icon_new(asCPointerNotNull(icon), asCPointer(emblem))));
    }

    /**
     * Adds &#64;emblem to the &#35;GList of &#35;GEmblems.
     * @param emblem a &#35;GEmblem
    */
    public void addEmblem(@Nonnull Emblem emblem)  {
        JnaEmblemedIcon.INST().g_emblemed_icon_add_emblem(asCPointer(), asCPointerNotNull(emblem));
    }

    /**
     * Removes all the emblems from &#64;icon.
    */
    public void clearEmblems()  {
        JnaEmblemedIcon.INST().g_emblemed_icon_clear_emblems(asCPointer());
    }

    /**
     * Gets the list of emblems for the &#64;icon.
     * @return a &#35;GList of     &#35;GEmblems that is owned by &#64;emblemed
    */
    public ch.bailu.gtk.glib.List getEmblems()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaEmblemedIcon.INST().g_emblemed_icon_get_emblems(asCPointer())));
    }

    /**
     * Gets the main icon for &#64;emblemed.
     * @return a &#35;GIcon that is owned by &#64;emblemed
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaEmblemedIcon.INST().g_emblemed_icon_get_icon(asCPointer())));
    }

    /**
     * Implements interface {@link Icon}. Call this to get access to interface functions.
     * @return {@link Icon}
    */
    public Icon asIcon() {
        return new Icon(cast());
    }

    public static long getTypeID() { 
        return JnaEmblemedIcon.INST().g_emblemed_icon_get_type(); 
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
