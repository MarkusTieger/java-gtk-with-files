/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `PangoFontsetSimple` is a implementation of the abstract
 * <br>`PangoFontset` base class as an array of fonts.
 * <br>
 * <br>When creating a `PangoFontsetSimple`, you have to provide
 * <br>the array of fonts that make up the fontset.
 * <p><a href="https://docs.gtk.org/Pango/class.FontsetSimple.html">https://docs.gtk.org/Pango/class.FontsetSimple.html</a></p>
*/
public class FontsetSimple extends Fontset {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontsetSimple.class.getCanonicalName());
    }

    public FontsetSimple(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `PangoFontsetSimple` for the given language.
     * @param language a `PangoLanguage` tag
    */
    public FontsetSimple(@Nonnull Language language) {
        super(cast(JnaFontsetSimple.INST().pango_fontset_simple_new(asCPointerNotNull(language))));
    }

    /**
     * Adds a font to the fontset.
     * <br>
     * <br>The fontset takes ownership of &#64;font.
     * @param font a `PangoFont`.
    */
    public void append(@Nonnull Font font)  {
        JnaFontsetSimple.INST().pango_fontset_simple_append(asCPointer(), asCPointerNotNull(font));
    }

    /**
     * Returns the number of fonts in the fontset.
     * @return the size of &#64;fontset
    */
    public int size()  {
        return JnaFontsetSimple.INST().pango_fontset_simple_size(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFontsetSimple.INST().pango_fontset_simple_get_type(); 
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
