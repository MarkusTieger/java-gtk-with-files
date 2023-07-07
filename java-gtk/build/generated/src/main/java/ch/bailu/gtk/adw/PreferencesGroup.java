/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A group of preference rows.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;preferences-group-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;preferences-group.png&quot; alt=&quot;preferences-group&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>An `AdwPreferencesGroup` represents a group or tightly related preferences,
 * <br>which in turn are represented by [class&#64;PreferencesRow].
 * <br>
 * <br>To summarize the role of the preferences it gathers, a group can have both a
 * <br>title and a description. The title will be used by [class&#64;PreferencesWindow]
 * <br>to let the user look for a preference.
 * <br>
 * <br>&#35;&#35; AdwPreferencesGroup as GtkBuildable
 * <br>
 * <br>The `AdwPreferencesGroup` implementation of the [iface&#64;Gtk.Buildable] interface
 * <br>supports adding [class&#64;PreferencesRow]s to the list by omitting &quot;type&quot;. If &quot;type&quot;
 * <br>is omitted and the widget isn't a [class&#64;PreferencesRow] the child is added to
 * <br>a box below the list.
 * <br>
 * <br>When the &quot;type&quot; attribute of a child is `header-suffix`, the child
 * <br>is set as the suffix on the end of the title and description.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwPreferencesGroup` has a single CSS node with name `preferencesgroup`.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwPreferencesGroup` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesGroup.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesGroup.html</a></p>
*/
public class PreferencesGroup extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PreferencesGroup.class.getCanonicalName());
    }

    public PreferencesGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPreferencesGroup`.
    */
    public PreferencesGroup() {
        super(cast(JnaPreferencesGroup.INST().adw_preferences_group_new()));
    }

    /**
     * Adds a child to &#64;self.
     * @param child the widget to add
    */
    public void add(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaPreferencesGroup.INST().adw_preferences_group_add(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Gets the description of &#64;self.
     * @return the description of &#64;self
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesGroup.INST().adw_preferences_group_get_description(asCPointer())));
    }

    /**
     * Gets the suffix for &#64;self's header.
     * @return the suffix for &#64;self's header.
    */
    public ch.bailu.gtk.gtk.Widget getHeaderSuffix()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaPreferencesGroup.INST().adw_preferences_group_get_header_suffix(asCPointer())));
    }

    /**
     * Gets the title of &#64;self.
     * @return the title of &#64;self
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesGroup.INST().adw_preferences_group_get_title(asCPointer())));
    }

    /**
     * Removes a child from &#64;self.
     * @param child the child to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaPreferencesGroup.INST().adw_preferences_group_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets the description for &#64;self.
     * @param description the description
    */
    public void setDescription(@Nullable ch.bailu.gtk.type.Str description)  {
        JnaPreferencesGroup.INST().adw_preferences_group_set_description(asCPointer(), asCPointer(description));
    }

    /**
     * Sets the description for &#64;self.
     * @param description the description
    */
    public void setDescription(String description)  {
        JnaPreferencesGroup.INST().adw_preferences_group_set_description(asCPointer(), description);
    }

    /**
     * Sets the suffix for &#64;self's header.
     * <br>
     * <br>Displayed above the list, next to the title and description.
     * <br>
     * <br>Suffixes are commonly used to show a button or a spinner for the whole group.
     * @param suffix the suffix to set
    */
    public void setHeaderSuffix(@Nullable ch.bailu.gtk.gtk.Widget suffix)  {
        JnaPreferencesGroup.INST().adw_preferences_group_set_header_suffix(asCPointer(), asCPointer(suffix));
    }

    /**
     * Sets the title for &#64;self.
     * @param title the title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaPreferencesGroup.INST().adw_preferences_group_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title for &#64;self.
     * @param title the title
    */
    public void setTitle(String title)  {
        JnaPreferencesGroup.INST().adw_preferences_group_set_title(asCPointer(), title);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaPreferencesGroup.INST().adw_preferences_group_get_type(); 
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
