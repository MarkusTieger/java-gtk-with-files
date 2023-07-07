/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GThemedIcon is an implementation of &#35;GIcon that supports icon themes.
 * <br>&#35;GThemedIcon contains a list of all of the icons present in an icon
 * <br>theme, so that icons can be looked up quickly. &#35;GThemedIcon does
 * <br>not provide actual pixmaps for icons, just the icon names.
 * <br>Ideally something like gtk_icon_theme_choose_icon() should be used to
 * <br>resolve the list of names so that fallback icons work nicely with
 * <br>themes that inherit other themes.
 * <p><a href="https://docs.gtk.org/gio/class.ThemedIcon.html">https://docs.gtk.org/gio/class.ThemedIcon.html</a></p>
*/
public class ThemedIcon extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ThemedIcon.class.getCanonicalName());
    }

    public ThemedIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new themed icon for &#64;iconnames.
     * @param iconnames an array of strings containing icon names.
     * @param len the length of the &#64;iconnames array, or -1 if &#64;iconnames is     %NULL-terminated
     * @return a new &#35;GThemedIcon
    */
    public static ThemedIcon newFromNamesThemedIcon(@Nonnull ch.bailu.gtk.type.Strs iconnames, int len)  {
        PointerContainer __self = cast(JnaThemedIcon.INST().g_themed_icon_new_from_names(asCPointerNotNull(iconnames), len));
        if (__self.isNull()) {
            throw new NullPointerException("ThemedIcon:newFromNames");
        }
        return new ThemedIcon(__self);
    }        
    

    /**
     * Creates a new themed icon for &#64;iconname, and all the names
     * <br>that can be created by shortening &#64;iconname at '-' characters.
     * <br>
     * <br>In the following example, &#64;icon1 and &#64;icon2 are equivalent:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * const char *names[] = {
     *   &quot;gnome-dev-cdrom-audio&quot;,
     *   &quot;gnome-dev-cdrom&quot;,
     *   &quot;gnome-dev&quot;,
     *   &quot;gnome&quot;
     * };
     * 
     * icon1 = g_themed_icon_new_from_names (names, 4);
     * icon2 = g_themed_icon_new_with_default_fallbacks (&quot;gnome-dev-cdrom-audio&quot;);
     * </pre>
     * @param iconname a string containing an icon name
     * @return a new &#35;GThemedIcon.
    */
    public static ThemedIcon newWithDefaultFallbacksThemedIcon(@Nonnull ch.bailu.gtk.type.Str iconname)  {
        PointerContainer __self = cast(JnaThemedIcon.INST().g_themed_icon_new_with_default_fallbacks(asCPointerNotNull(iconname)));
        if (__self.isNull()) {
            throw new NullPointerException("ThemedIcon:newWithDefaultFallbacks");
        }
        return new ThemedIcon(__self);
    }        
    

    /**
     * Creates a new themed icon for &#64;iconname, and all the names
     * <br>that can be created by shortening &#64;iconname at '-' characters.
     * <br>
     * <br>In the following example, &#64;icon1 and &#64;icon2 are equivalent:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * const char *names[] = {
     *   &quot;gnome-dev-cdrom-audio&quot;,
     *   &quot;gnome-dev-cdrom&quot;,
     *   &quot;gnome-dev&quot;,
     *   &quot;gnome&quot;
     * };
     * 
     * icon1 = g_themed_icon_new_from_names (names, 4);
     * icon2 = g_themed_icon_new_with_default_fallbacks (&quot;gnome-dev-cdrom-audio&quot;);
     * </pre>
     * @param iconname a string containing an icon name
     * @return a new &#35;GThemedIcon.
    */
    public static ThemedIcon newWithDefaultFallbacksThemedIcon(String iconname)  {
        PointerContainer __self = cast(JnaThemedIcon.INST().g_themed_icon_new_with_default_fallbacks(iconname));
        if (__self.isNull()) {
            throw new NullPointerException("ThemedIcon:newWithDefaultFallbacks");
        }
        return new ThemedIcon(__self);
    }        
    

    /**
     * Creates a new themed icon for &#64;iconname.
     * @param iconname a string containing an icon name.
    */
    public ThemedIcon(@Nonnull ch.bailu.gtk.type.Str iconname) {
        super(cast(JnaThemedIcon.INST().g_themed_icon_new(asCPointerNotNull(iconname))));
    }

    /**
     * Creates a new themed icon for &#64;iconname.
     * @param iconname a string containing an icon name.
    */
    public ThemedIcon(String iconname) {
        super(cast(JnaThemedIcon.INST().g_themed_icon_new(iconname)));
    }

    /**
     * Append a name to the list of icons from within &#64;icon.
     * <br>
     * <br>Note that doing so invalidates the hash computed by prior calls
     * <br>to g_icon_hash().
     * @param iconname name of icon to append to list of icons from within &#64;icon.
    */
    public void appendName(@Nonnull ch.bailu.gtk.type.Str iconname)  {
        JnaThemedIcon.INST().g_themed_icon_append_name(asCPointer(), asCPointerNotNull(iconname));
    }

    /**
     * Append a name to the list of icons from within &#64;icon.
     * <br>
     * <br>Note that doing so invalidates the hash computed by prior calls
     * <br>to g_icon_hash().
     * @param iconname name of icon to append to list of icons from within &#64;icon.
    */
    public void appendName(String iconname)  {
        JnaThemedIcon.INST().g_themed_icon_append_name(asCPointer(), iconname);
    }

    /**
     * Prepend a name to the list of icons from within &#64;icon.
     * <br>
     * <br>Note that doing so invalidates the hash computed by prior calls
     * <br>to g_icon_hash().
     * @param iconname name of icon to prepend to list of icons from within &#64;icon.
    */
    public void prependName(@Nonnull ch.bailu.gtk.type.Str iconname)  {
        JnaThemedIcon.INST().g_themed_icon_prepend_name(asCPointer(), asCPointerNotNull(iconname));
    }

    /**
     * Prepend a name to the list of icons from within &#64;icon.
     * <br>
     * <br>Note that doing so invalidates the hash computed by prior calls
     * <br>to g_icon_hash().
     * @param iconname name of icon to prepend to list of icons from within &#64;icon.
    */
    public void prependName(String iconname)  {
        JnaThemedIcon.INST().g_themed_icon_prepend_name(asCPointer(), iconname);
    }

    /**
     * Implements interface {@link Icon}. Call this to get access to interface functions.
     * @return {@link Icon}
    */
    public Icon asIcon() {
        return new Icon(cast());
    }

    public static long getTypeID() { 
        return JnaThemedIcon.INST().g_themed_icon_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getNames:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]
*/
