/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GEmblem is an implementation of &#35;GIcon that supports
 * <br>having an emblem, which is an icon with additional properties.
 * <br>It can than be added to a &#35;GEmblemedIcon.
 * <br>
 * <br>Currently, only metainformation about the emblem's origin is
 * <br>supported. More may be added in the future.
 * <p><a href="https://docs.gtk.org/gio/class.Emblem.html">https://docs.gtk.org/gio/class.Emblem.html</a></p>
*/
public class Emblem extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Emblem.class.getCanonicalName());
    }

    public Emblem(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new emblem for &#64;icon.
     * @param icon a GIcon containing the icon.
     * @param origin a GEmblemOrigin enum defining the emblem's origin
     * @return a new &#35;GEmblem.
    */
    public static Emblem newWithOriginEmblem(@Nonnull Icon icon, int origin)  {
        PointerContainer __self = cast(JnaEmblem.INST().g_emblem_new_with_origin(asCPointerNotNull(icon), origin));
        if (__self.isNull()) {
            throw new NullPointerException("Emblem:newWithOrigin");
        }
        return new Emblem(__self);
    }        
    

    /**
     * Creates a new emblem for &#64;icon.
     * @param icon a GIcon containing the icon.
    */
    public Emblem(@Nonnull Icon icon) {
        super(cast(JnaEmblem.INST().g_emblem_new(asCPointerNotNull(icon))));
    }

    /**
     * Gives back the icon from &#64;emblem.
     * @return a &#35;GIcon. The returned object belongs to          the emblem and should not be modified or freed.
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaEmblem.INST().g_emblem_get_icon(asCPointer())));
    }

    /**
     * Gets the origin of the emblem.
     * @return the origin of the emblem
    */
    public int getOrigin()  {
        return JnaEmblem.INST().g_emblem_get_origin(asCPointer());
    }

    /**
     * Implements interface {@link Icon}. Call this to get access to interface functions.
     * @return {@link Icon}
    */
    public Icon asIcon() {
        return new Icon(cast());
    }

    public static long getTypeID() { 
        return JnaEmblem.INST().g_emblem_get_type(); 
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
