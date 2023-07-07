/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkTexture` representing image data in memory.
 * <p><a href="https://docs.gtk.org/gdk4/class.MemoryTexture.html">https://docs.gtk.org/gdk4/class.MemoryTexture.html</a></p>
*/
public class MemoryTexture extends Texture {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemoryTexture.class.getCanonicalName());
    }

    public MemoryTexture(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new texture for a blob of image data.
     * <br>
     * <br>The `GBytes` must contain &#64;stride × &#64;height pixels
     * <br>in the given format.
     * @param width the width of the texture
     * @param height the height of the texture
     * @param format the format of the data
     * @param bytes the `GBytes` containing the pixel data
     * @param stride rowstride for the data
    */
    public MemoryTexture(int width, int height, int format, @Nonnull ch.bailu.gtk.glib.Bytes bytes, long stride) {
        super(cast(JnaMemoryTexture.INST().gdk_memory_texture_new(width, height, format, asCPointerNotNull(bytes), stride)));
    }

    /**
     * Implements interface {@link Paintable}. Call this to get access to interface functions.
     * @return {@link Paintable}
    */
    public Paintable asPaintable() {
        return new Paintable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.Icon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.Icon}
    */
    public ch.bailu.gtk.gio.Icon asIcon() {
        return new ch.bailu.gtk.gio.Icon(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.LoadableIcon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.LoadableIcon}
    */
    public ch.bailu.gtk.gio.LoadableIcon asLoadableIcon() {
        return new ch.bailu.gtk.gio.LoadableIcon(cast());
    }

    public static long getTypeID() { 
        return JnaMemoryTexture.INST().gdk_memory_texture_get_type(); 
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
