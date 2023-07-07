/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GIcon is a very minimal interface for icons. It provides functions
 * <br>for checking the equality of two icons, hashing of icons and
 * <br>serializing an icon to and from strings.
 * <br>
 * <br>&#35;GIcon does not provide the actual pixmap for the icon as this is out
 * <br>of GIO's scope, however implementations of &#35;GIcon may contain the name
 * <br>of an icon (see &#35;GThemedIcon), or the path to an icon (see &#35;GLoadableIcon).
 * <br>
 * <br>To obtain a hash of a &#35;GIcon, see g_icon_hash().
 * <br>
 * <br>To check if two &#35;GIcons are equal, see g_icon_equal().
 * <br>
 * <br>For serializing a &#35;GIcon, use g_icon_serialize() and
 * <br>g_icon_deserialize().
 * <br>
 * <br>If you want to consume &#35;GIcon (for example, in a toolkit) you must
 * <br>be prepared to handle at least the three following cases:
 * <br>&#35;GLoadableIcon, &#35;GThemedIcon and &#35;GEmblemedIcon.  It may also make
 * <br>sense to have fast-paths for other cases (like handling &#35;GdkPixbuf
 * <br>directly, for example) but all compliant &#35;GIcon implementations
 * <br>outside of GIO must implement &#35;GLoadableIcon.
 * <br>
 * <br>If your application or library provides one or more &#35;GIcon
 * <br>implementations you need to ensure that your new implementation also
 * <br>implements &#35;GLoadableIcon.  Additionally, you must provide an
 * <br>implementation of g_icon_serialize() that gives a result that is
 * <br>understood by g_icon_deserialize(), yielding one of the built-in icon
 * <br>types.
 * <p><a href="https://docs.gtk.org/gio/iface.Icon.html">https://docs.gtk.org/gio/iface.Icon.html</a></p>
*/
public class Icon extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Icon.class.getCanonicalName());
    }

    public Icon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if two icons are equal.
     * @param icon2 pointer to the second &#35;GIcon.
     * @return %TRUE if &#64;icon1 is equal to &#64;icon2. %FALSE otherwise.
    */
    public boolean equal(@Nullable Icon icon2)  {
        return JnaIcon.INST().g_icon_equal(asCPointer(), asCPointer(icon2));
    }

    /**
     * Serializes a &#35;GIcon into a &#35;GVariant. An equivalent &#35;GIcon can be retrieved
     * <br>back by calling g_icon_deserialize() on the returned value.
     * <br>As serialization will avoid using raw icon data when possible, it only
     * <br>makes sense to transfer the &#35;GVariant between processes on the same machine,
     * <br>(as opposed to over the network), and within the same file system namespace.
     * @return a &#35;GVariant, or %NULL when serialization fails. The &#35;GVariant will not be floating.
    */
    public ch.bailu.gtk.glib.Variant serialize()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaIcon.INST().g_icon_serialize(asCPointer())));
    }

    /**
     * Generates a textual representation of &#64;icon that can be used for
     * <br>serialization such as when passing &#64;icon to a different process or
     * <br>saving it to persistent storage. Use g_icon_new_for_string() to
     * <br>get &#64;icon back from the returned string.
     * <br>
     * <br>The encoding of the returned string is proprietary to &#35;GIcon except
     * <br>in the following two cases
     * <br>
     * <br>- If &#64;icon is a &#35;GFileIcon, the returned string is a native path
     * <br>  (such as `/path/to/my icon.png`) without escaping
     * <br>  if the &#35;GFile for &#64;icon is a native file.  If the file is not
     * <br>  native, the returned string is the result of g_file_get_uri()
     * <br>  (such as `sftp://path/to/my%20icon.png`).
     * <br>
     * <br>- If &#64;icon is a &#35;GThemedIcon with exactly one name and no fallbacks,
     * <br>  the encoding is simply the name (such as `network-server`).
     * @return An allocated NUL-terminated UTF8 string or %NULL if &#64;icon can't be serialized. Use g_free() to free.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIcon.INST().g_icon_to_string(asCPointer())));
    }

    /**
     * Deserializes a &#35;GIcon previously serialized using g_icon_serialize().
     * @param value a &#35;GVariant created with g_icon_serialize()
     * @return a &#35;GIcon, or %NULL when deserialization fails.
    */
    public static Icon deserialize(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        return new Icon(new PointerContainer(JnaIcon.INST().g_icon_deserialize(asCPointerNotNull(value))));
    }

    /**
     * Gets a hash for an icon.
     * @param icon &#35;gconstpointer to an icon object.
     * @return a &#35;guint containing a hash for the &#64;icon, suitable for use in a &#35;GHashTable or similar data structure.
    */
    public static int hash(@Nonnull ch.bailu.gtk.type.Pointer icon)  {
        return JnaIcon.INST().g_icon_hash(asCPointerNotNull(icon));
    }

    /**
     * Generate a &#35;GIcon instance from &#64;str. This function can fail if
     * <br>&#64;str is not valid - see g_icon_to_string() for discussion.
     * <br>
     * <br>If your application or library provides one or more &#35;GIcon
     * <br>implementations you need to ensure that each &#35;GType is registered
     * <br>with the type system prior to calling g_icon_new_for_string().
     * @param str A string obtained via g_icon_to_string().
     * @return An object implementing the &#35;GIcon          interface or %NULL if &#64;error is set.
    */
    public static Icon newForString(@Nonnull ch.bailu.gtk.type.Str str) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Icon(new PointerContainer(JnaIcon.INST().g_icon_new_for_string(asCPointerNotNull(str), 0L)));
    }

    public static long getTypeID() { 
        return JnaIcon.INST().g_icon_get_type(); 
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
