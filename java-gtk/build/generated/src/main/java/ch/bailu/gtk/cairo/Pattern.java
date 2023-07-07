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
public class Pattern extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Pattern.class.getCanonicalName());
    }

    public Pattern(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * 
     * @param surface 
     * @return 
    */
    public static Pattern createForSurfacePattern(@Nonnull Surface surface)  {
        PointerContainer __self = cast(JnaPattern.INST().cairo_pattern_create_for_surface(asCPointerNotNull(surface)));
        if (__self.isNull()) {
            throw new NullPointerException("Pattern:createForSurface");
        }
        return new Pattern(__self);
    }        
    

    /**
     * 
     * @param x0 
     * @param y0 
     * @param x1 
     * @param y1 
    */
    public Pattern(double x0, double y0, double x1, double y1) {
        super(cast(JnaPattern.INST().cairo_pattern_create_linear(x0, y0, x1, y1)));
    }

    /**
     * 
     * @param offset 
     * @param red 
     * @param green 
     * @param blue 
    */
    public void addColorStopRgb(double offset, double red, double green, double blue)  {
        JnaPattern.INST().cairo_pattern_add_color_stop_rgb(asCPointer(), offset, red, green, blue);
    }

    /**
     * 
     * @param offset 
     * @param red 
     * @param green 
     * @param blue 
     * @param alpha 
    */
    public void addColorStopRgba(double offset, double red, double green, double blue, double alpha)  {
        JnaPattern.INST().cairo_pattern_add_color_stop_rgba(asCPointer(), offset, red, green, blue, alpha);
    }

    /**
     * 
     * @param extend 
    */
    public void setExtend(int extend)  {
        JnaPattern.INST().cairo_pattern_set_extend(asCPointer(), extend);
    }

    public void destroy()  {
        JnaPattern.INST().cairo_pattern_destroy(asCPointer());
    }

    public static long getTypeID() { 
        return JnaPattern.INST().cairo_gobject_pattern_get_type(); 
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
