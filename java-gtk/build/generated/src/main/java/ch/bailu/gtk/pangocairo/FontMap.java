/* this file is machine generated */
package ch.bailu.gtk.pangocairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `PangoCairoFontMap` is an interface exported by font maps for
 * <br>use with Cairo.
 * <br>
 * <br>The actual type of the font map will depend on the particular
 * <br>font technology Cairo was compiled to use.
 * <p><a href="https://docs.gtk.org/PangoCairo/iface.FontMap.html">https://docs.gtk.org/PangoCairo/iface.FontMap.html</a></p>
*/
public class FontMap extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontMap.class.getCanonicalName());
    }

    public FontMap(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the type of Cairo font backend that &#64;fontmap uses.
     * @return the `cairo_font_type_t` cairo font backend type
    */
    public int getFontType()  {
        return JnaFontMap.INST().pango_cairo_font_map_get_font_type(asCPointer());
    }

    /**
     * Gets the resolution for the fontmap.
     * <br>
     * <br>See [method&#64;PangoCairo.FontMap.set_resolution].
     * @return the resolution in &quot;dots per inch&quot;
    */
    public double getResolution()  {
        return JnaFontMap.INST().pango_cairo_font_map_get_resolution(asCPointer());
    }

    /**
     * Sets a default `PangoCairoFontMap` to use with Cairo.
     * <br>
     * <br>This can be used to change the Cairo font backend that the
     * <br>default fontmap uses for example. The old default font map
     * <br>is unreffed and the new font map referenced.
     * <br>
     * <br>Note that since Pango 1.32.6, the default fontmap is per-thread.
     * <br>This function only changes the default fontmap for
     * <br>the current thread. Default fontmaps of existing threads
     * <br>are not changed. Default fontmaps of any new threads will
     * <br>still be created using [func&#64;PangoCairo.FontMap.new].
     * <br>
     * <br>A value of %NULL for &#64;fontmap will cause the current default
     * <br>font map to be released and a new default font map to be created
     * <br>on demand, using [func&#64;PangoCairo.FontMap.new].
    */
    public void setDefault()  {
        JnaFontMap.INST().pango_cairo_font_map_set_default(asCPointer());
    }

    /**
     * Sets the resolution for the fontmap.
     * <br>
     * <br>This is a scale factor between
     * <br>points specified in a `PangoFontDescription` and Cairo units. The
     * <br>default value is 96, meaning that a 10 point font will be 13
     * <br>units high. (10 * 96. / 72. = 13.3).
     * @param dpi the resolution in &quot;dots per inch&quot;. (Physical inches aren't actually   involved; the terminology is conventional.)
    */
    public void setResolution(double dpi)  {
        JnaFontMap.INST().pango_cairo_font_map_set_resolution(asCPointer(), dpi);
    }

    /**
     * Gets a default `PangoCairoFontMap` to use with Cairo.
     * <br>
     * <br>Note that the type of the returned object will depend on the
     * <br>particular font backend Cairo was compiled to use; you generally
     * <br>should only use the `PangoFontMap` and `PangoCairoFontMap`
     * <br>interfaces on the returned object.
     * <br>
     * <br>The default Cairo fontmap can be changed by using
     * <br>[method&#64;PangoCairo.FontMap.set_default]. This can be used to
     * <br>change the Cairo font backend that the default fontmap uses
     * <br>for example.
     * <br>
     * <br>Note that since Pango 1.32.6, the default fontmap is per-thread.
     * <br>Each thread gets its own default fontmap. In this way, PangoCairo
     * <br>can be used safely from multiple threads.
     * @return the default PangoCairo fontmap  for the current thread. This object is owned by Pango and must  not be freed.
    */
    public static ch.bailu.gtk.pango.FontMap getDefault()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaFontMap.INST().pango_cairo_font_map_get_default()));
    }

    /**
     * Creates a new `PangoCairoFontMap` object.
     * <br>
     * <br>A fontmap is used to cache information about available fonts,
     * <br>and holds certain global parameters such as the resolution.
     * <br>In most cases, you can use `func&#64;PangoCairo.font_map_get_default]
     * <br>instead.
     * <br>
     * <br>Note that the type of the returned object will depend
     * <br>on the particular font backend Cairo was compiled to use;
     * <br>You generally should only use the `PangoFontMap` and
     * <br>`PangoCairoFontMap` interfaces on the returned object.
     * <br>
     * <br>You can override the type of backend returned by using an
     * <br>environment variable %PANGOCAIRO_BACKEND. Supported types,
     * <br>based on your build, are fc (fontconfig), win32, and coretext.
     * <br>If requested type is not available, NULL is returned. Ie.
     * <br>this is only useful for testing, when at least two backends
     * <br>are compiled in.
     * @return the newly allocated `PangoFontMap`,   which should be freed with g_object_unref().
    */
    public static ch.bailu.gtk.pango.FontMap _new()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaFontMap.INST().pango_cairo_font_map_new()));
    }

    /**
     * Creates a new `PangoCairoFontMap` object of the type suitable
     * <br>to be used with cairo font backend of type &#64;fonttype.
     * <br>
     * <br>In most cases one should simply use [func&#64;PangoCairo.FontMap.new], or
     * <br>in fact in most of those cases, just use [func&#64;PangoCairo.FontMap.get_default].
     * @param fonttype desired &#35;cairo_font_type_t
     * @return the newly allocated   `PangoFontMap` of suitable type which should be freed with   g_object_unref(), or %NULL if the requested cairo font backend   is not supported / compiled in.
    */
    public static ch.bailu.gtk.pango.FontMap newForFontType(int fonttype)  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaFontMap.INST().pango_cairo_font_map_new_for_font_type(fonttype)));
    }

    public static long getTypeID() { 
        return JnaFontMap.INST().pango_cairo_font_map_get_type(); 
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

[MethodModel:cb-deprecated:createContext:[ParameterModel:Supported:{Gg:Context:{c:PangoContext*}}:{j:long}]]
*/
