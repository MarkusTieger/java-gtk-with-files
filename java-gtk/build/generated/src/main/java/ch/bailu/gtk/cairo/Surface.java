/* this file is machine generated */
package ch.bailu.gtk.cairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.cairographics.org/manual/">https://www.cairographics.org/manual/</a></p>
*/
public class Surface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Surface.class.getCanonicalName());
    }

    public Surface(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * 
     * @return 
    */
    public Context createContext()  {
        return new Context(new PointerContainer(JnaSurface.INST().cairo_create(asCPointer())));
    }

    public void destroy()  {
        JnaSurface.INST().cairo_surface_destroy(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public int getFormat()  {
        return JnaSurface.INST().cairo_image_surface_get_format(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public int getStride()  {
        return JnaSurface.INST().cairo_image_surface_get_stride(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public int getHeight()  {
        return JnaSurface.INST().cairo_image_surface_get_height(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public int getWidth()  {
        return JnaSurface.INST().cairo_image_surface_get_width(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public ch.bailu.gtk.type.Bytes getData()  {
        return new ch.bailu.gtk.type.Bytes(new PointerContainer(JnaSurface.INST().cairo_image_surface_get_data(asCPointer())));
    }

    public void flush()  {
        JnaSurface.INST().cairo_surface_flush(asCPointer());
    }

    public void markDirty()  {
        JnaSurface.INST().cairo_surface_mark_dirty(asCPointer());
    }

    public static long getTypeID() { 
        return JnaSurface.INST().cairo_gobject_surface_get_type(); 
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
*/
