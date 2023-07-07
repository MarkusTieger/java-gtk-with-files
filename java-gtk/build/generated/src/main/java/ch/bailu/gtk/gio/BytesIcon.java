/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GBytesIcon specifies an image held in memory in a common format (usually
 * <br>png) to be used as icon.
 * <p><a href="https://docs.gtk.org/gio/class.BytesIcon.html">https://docs.gtk.org/gio/class.BytesIcon.html</a></p>
*/
public class BytesIcon extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BytesIcon.class.getCanonicalName());
    }

    public BytesIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new icon for a bytes.
     * <br>
     * <br>This cannot fail, but loading and interpreting the bytes may fail later on
     * <br>(for example, if g_loadable_icon_load() is called) if the image is invalid.
     * @param bytes a &#35;GBytes.
    */
    public BytesIcon(@Nonnull ch.bailu.gtk.glib.Bytes bytes) {
        super(cast(JnaBytesIcon.INST().g_bytes_icon_new(asCPointerNotNull(bytes))));
    }

    /**
     * Gets the &#35;GBytes associated with the given &#64;icon.
     * @return a &#35;GBytes.
    */
    public ch.bailu.gtk.glib.Bytes getBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaBytesIcon.INST().g_bytes_icon_get_bytes(asCPointer())));
    }

    /**
     * Implements interface {@link Icon}. Call this to get access to interface functions.
     * @return {@link Icon}
    */
    public Icon asIcon() {
        return new Icon(cast());
    }

    /**
     * Implements interface {@link LoadableIcon}. Call this to get access to interface functions.
     * @return {@link LoadableIcon}
    */
    public LoadableIcon asLoadableIcon() {
        return new LoadableIcon(cast());
    }

    public static long getTypeID() { 
        return JnaBytesIcon.INST().g_bytes_icon_get_type(); 
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
