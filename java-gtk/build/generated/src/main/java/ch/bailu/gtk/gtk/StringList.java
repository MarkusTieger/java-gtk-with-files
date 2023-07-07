/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStringList` is a list model that wraps an array of strings.
 * <br>
 * <br>The objects in the model have a &quot;string&quot; property.
 * <br>
 * <br>`GtkStringList` is well-suited for any place where you would
 * <br>typically use a `char*[]`, but need a list model.
 * <br>
 * <br>&#35; GtkStringList as GtkBuildable
 * <br>
 * <br>The `GtkStringList` implementation of the `GtkBuildable` interface
 * <br>supports adding items directly using the &lt;items&gt; element and
 * <br>specifying &lt;item&gt; elements for each item. Each &lt;item&gt; element
 * <br>supports the regular translation attributes “translatable”,
 * <br>“context” and “comments”.
 * <br>
 * <br>Here is a UI definition fragment specifying a `GtkStringList`
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkStringList&quot;&gt;
 * <br>  &lt;items&gt;
 * <br>    &lt;item translatable=&quot;yes&quot;&gt;Factory&lt;/item&gt;
 * <br>    &lt;item translatable=&quot;yes&quot;&gt;Home&lt;/item&gt;
 * <br>    &lt;item translatable=&quot;yes&quot;&gt;Subway&lt;/item&gt;
 * <br>  &lt;/items&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.StringList.html">https://docs.gtk.org/gtk4/class.StringList.html</a></p>
*/
public class StringList extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StringList.class.getCanonicalName());
    }

    public StringList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkStringList` with the given &#64;strings.
     * @param strings The strings to put in the model
    */
    public StringList(@Nullable ch.bailu.gtk.type.Strs strings) {
        super(cast(JnaStringList.INST().gtk_string_list_new(asCPointer(strings))));
    }

    /**
     * Appends &#64;string to &#64;self.
     * <br>
     * <br>The &#64;string will be copied. See
     * <br>[method&#64;Gtk.StringList.take] for a way to avoid that.
     * @param string the string to insert
    */
    public void append(@Nonnull ch.bailu.gtk.type.Str string)  {
        JnaStringList.INST().gtk_string_list_append(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Appends &#64;string to &#64;self.
     * <br>
     * <br>The &#64;string will be copied. See
     * <br>[method&#64;Gtk.StringList.take] for a way to avoid that.
     * @param string the string to insert
    */
    public void append(String string)  {
        JnaStringList.INST().gtk_string_list_append(asCPointer(), string);
    }

    /**
     * Gets the string that is at &#64;position in &#64;self.
     * <br>
     * <br>If &#64;self does not contain &#64;position items, %NULL is returned.
     * <br>
     * <br>This function returns the const char *. To get the
     * <br>object wrapping it, use g_list_model_get_item().
     * @param position the position to get the string for
     * @return the string at the given position
    */
    public ch.bailu.gtk.type.Str getString(int position)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringList.INST().gtk_string_list_get_string(asCPointer(), position)));
    }

    /**
     * Removes the string at &#64;position from &#64;self.
     * <br>
     * <br>&#64;position must be smaller than the current
     * <br>length of the list.
     * @param position the position of the string that is to be removed
    */
    public void remove(int position)  {
        JnaStringList.INST().gtk_string_list_remove(asCPointer(), position);
    }

    /**
     * Changes &#64;self by removing &#64;n_removals strings and adding &#64;additions
     * <br>to it.
     * <br>
     * <br>This function is more efficient than [method&#64;Gtk.StringList.append]
     * <br>and [method&#64;Gtk.StringList.remove], because it only emits the
     * <br>::items-changed signal once for the change.
     * <br>
     * <br>This function copies the strings in &#64;additions.
     * <br>
     * <br>The parameters &#64;position and &#64;n_removals must be correct (ie:
     * <br>&#64;position + &#64;n_removals must be less than or equal to the length
     * <br>of the list at the time this function is called).
     * @param position the position at which to make the change
     * @param n_removals the number of strings to remove
     * @param additions The strings to add
    */
    public void splice(int position, int n_removals, @Nullable ch.bailu.gtk.type.Strs additions)  {
        JnaStringList.INST().gtk_string_list_splice(asCPointer(), position, n_removals, asCPointer(additions));
    }

    /**
     * Adds &#64;string to self at the end, and takes
     * <br>ownership of it.
     * <br>
     * <br>This variant of [method&#64;Gtk.StringList.append]
     * <br>is convenient for formatting strings:
     * <br>
     * <br>```c
     * <br>gtk_string_list_take (self, g_strdup_print (&quot;%d dollars&quot;, lots));
     * <br>```
     * @param string the string to insert
    */
    public void take(@Nonnull ch.bailu.gtk.type.Str string)  {
        JnaStringList.INST().gtk_string_list_take(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaStringList.INST().gtk_string_list_get_type(); 
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
