/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GCharsetConverter is an implementation of &#35;GConverter based on
 * <br>GIConv.
 * <p><a href="https://docs.gtk.org/gio/class.CharsetConverter.html">https://docs.gtk.org/gio/class.CharsetConverter.html</a></p>
*/
public class CharsetConverter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CharsetConverter.class.getCanonicalName());
    }

    public CharsetConverter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GCharsetConverter.
     * @param to_charset destination charset
     * @param from_charset source charset
    */
    public CharsetConverter(@Nonnull ch.bailu.gtk.type.Str to_charset, @Nonnull ch.bailu.gtk.type.Str from_charset) {
        super(cast(JnaCharsetConverter.INST().g_charset_converter_new(asCPointerNotNull(to_charset), asCPointerNotNull(from_charset), 0L)));
    }

    /**
     * Creates a new &#35;GCharsetConverter.
     * @param to_charset destination charset
     * @param from_charset source charset
    */
    public CharsetConverter(String to_charset, String from_charset) {
        super(cast(JnaCharsetConverter.INST().g_charset_converter_new(to_charset, from_charset, 0L)));
    }

    /**
     * Gets the number of fallbacks that &#64;converter has applied so far.
     * @return the number of fallbacks that &#64;converter has applied
    */
    public int getNumFallbacks()  {
        return JnaCharsetConverter.INST().g_charset_converter_get_num_fallbacks(asCPointer());
    }

    /**
     * Gets the &#35;GCharsetConverter:use-fallback property.
     * @return %TRUE if fallbacks are used by &#64;converter
    */
    public boolean getUseFallback()  {
        return JnaCharsetConverter.INST().g_charset_converter_get_use_fallback(asCPointer());
    }

    /**
     * Sets the &#35;GCharsetConverter:use-fallback property.
     * @param use_fallback %TRUE to use fallbacks
    */
    public void setUseFallback(boolean use_fallback)  {
        JnaCharsetConverter.INST().g_charset_converter_set_use_fallback(asCPointer(), use_fallback);
    }

    /**
     * Implements interface {@link Converter}. Call this to get access to interface functions.
     * @return {@link Converter}
    */
    public Converter asConverter() {
        return new Converter(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaCharsetConverter.INST().g_charset_converter_get_type(); 
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
