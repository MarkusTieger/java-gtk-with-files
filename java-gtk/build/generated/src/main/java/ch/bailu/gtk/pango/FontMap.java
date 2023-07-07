/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontMap` represents the set of fonts available for a
 * <br>particular rendering system.
 * <br>
 * <br>This is a virtual object with implementations being specific to
 * <br>particular rendering systems.
 * <p><a href="https://docs.gtk.org/Pango/class.FontMap.html">https://docs.gtk.org/Pango/class.FontMap.html</a></p>
*/
public class FontMap extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontMap.class.getCanonicalName());
    }

    public FontMap(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Forces a change in the context, which will cause any `PangoContext`
     * <br>using this fontmap to change.
     * <br>
     * <br>This function is only useful when implementing a new backend
     * <br>for Pango, something applications won't do. Backends should
     * <br>call this function if they have attached extra data to the
     * <br>context and such data is changed.
    */
    public void changed()  {
        JnaFontMap.INST().pango_font_map_changed(asCPointer());
    }

    /**
     * Creates a `PangoContext` connected to &#64;fontmap.
     * <br>
     * <br>This is equivalent to [ctor&#64;Pango.Context.new] followed by
     * <br>[method&#64;Pango.Context.set_font_map].
     * <br>
     * <br>If you are using Pango as part of a higher-level system,
     * <br>that system may have it's own way of create a `PangoContext`.
     * <br>For instance, the GTK toolkit has, among others,
     * <br>gtk_widget_get_pango_context(). Use those instead.
     * @return the newly allocated `PangoContext`,   which should be freed with g_object_unref().
    */
    public Context createContext()  {
        return new Context(new PointerContainer(JnaFontMap.INST().pango_font_map_create_context(asCPointer())));
    }

    /**
     * Gets a font family by name.
     * @param name a family name
     * @return the `PangoFontFamily`
    */
    public FontFamily getFamily(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new FontFamily(new PointerContainer(JnaFontMap.INST().pango_font_map_get_family(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets a font family by name.
     * @param name a family name
     * @return the `PangoFontFamily`
    */
    public FontFamily getFamily(String name)  {
        return new FontFamily(new PointerContainer(JnaFontMap.INST().pango_font_map_get_family(asCPointer(), name)));
    }

    /**
     * Returns the current serial number of &#64;fontmap.
     * <br>
     * <br>The serial number is initialized to an small number larger than zero
     * <br>when a new fontmap is created and is increased whenever the fontmap
     * <br>is changed. It may wrap, but will never have the value 0. Since it can
     * <br>wrap, never compare it with &quot;less than&quot;, always use &quot;not equals&quot;.
     * <br>
     * <br>The fontmap can only be changed using backend-specific API, like changing
     * <br>fontmap resolution.
     * <br>
     * <br>This can be used to automatically detect changes to a `PangoFontMap`,
     * <br>like in `PangoContext`.
     * @return The current serial number of &#64;fontmap.
    */
    public int getSerial()  {
        return JnaFontMap.INST().pango_font_map_get_serial(asCPointer());
    }

    /**
     * Load the font in the fontmap that is the closest match for &#64;desc.
     * @param context the `PangoContext` the font will be used with
     * @param desc a `PangoFontDescription` describing the font to load
     * @return the newly allocated `PangoFont`   loaded, or %NULL if no font matched.
    */
    public Font loadFont(@Nonnull Context context, @Nonnull FontDescription desc)  {
        return new Font(new PointerContainer(JnaFontMap.INST().pango_font_map_load_font(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(desc))));
    }

    /**
     * Load a set of fonts in the fontmap that can be used to render
     * <br>a font matching &#64;desc.
     * @param context the `PangoContext` the font will be used with
     * @param desc a `PangoFontDescription` describing the font to load
     * @param language a `PangoLanguage` the fonts will be used for
     * @return the newly allocated   `PangoFontset` loaded, or %NULL if no font matched.
    */
    public Fontset loadFontset(@Nonnull Context context, @Nonnull FontDescription desc, @Nonnull Language language)  {
        return new Fontset(new PointerContainer(JnaFontMap.INST().pango_font_map_load_fontset(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(desc), asCPointerNotNull(language))));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaFontMap.INST().pango_font_map_get_type(); 
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

[MethodModel:java-type-not-supported:listFamilies:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoFontFamily***}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
