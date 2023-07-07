/* this file is machine generated */
package ch.bailu.gtk.pangocairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `PangoCairoFont` is an interface exported by fonts for
 * <br>use with Cairo.
 * <br>
 * <br>The actual type of the font will depend on the particular
 * <br>font technology Cairo was compiled to use.
 * <p><a href="https://docs.gtk.org/PangoCairo/iface.Font.html">https://docs.gtk.org/PangoCairo/iface.Font.html</a></p>
*/
public class Font extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Font.class.getCanonicalName());
    }

    public Font(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the `cairo_scaled_font_t` used by &#64;font.
     * <br>The scaled font can be referenced and kept using
     * <br>cairo_scaled_font_reference().
     * @return the `cairo_scaled_font_t`   used by &#64;font
    */
    public ch.bailu.gtk.cairo.ScaledFont getScaledFont()  {
        return new ch.bailu.gtk.cairo.ScaledFont(new PointerContainer(JnaFont.INST().pango_cairo_font_get_scaled_font(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaFont.INST().pango_cairo_font_get_type(); 
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
