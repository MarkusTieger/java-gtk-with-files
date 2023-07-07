/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A page from [class&#64;PreferencesWindow].
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;preferences-page-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;preferences-page.png&quot; alt=&quot;preferences-page&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwPreferencesPage` widget gathers preferences groups into a single page
 * <br>of a preferences window.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwPreferencesPage` has a single CSS node with name `preferencespage`.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwPreferencesPage` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesPage.html</a></p>
*/
public class PreferencesPage extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PreferencesPage.class.getCanonicalName());
    }

    public PreferencesPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPreferencesPage`.
    */
    public PreferencesPage() {
        super(cast(JnaPreferencesPage.INST().adw_preferences_page_new()));
    }

    /**
     * Adds a preferences group to &#64;self.
     * @param group the group to add
    */
    public void add(@Nonnull PreferencesGroup group)  {
        JnaPreferencesPage.INST().adw_preferences_page_add(asCPointer(), asCPointerNotNull(group));
    }

    /**
     * Gets the icon name for &#64;self.
     * @return the icon name for &#64;self
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesPage.INST().adw_preferences_page_get_icon_name(asCPointer())));
    }

    /**
     * Gets the name of &#64;self.
     * @return the name of &#64;self
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesPage.INST().adw_preferences_page_get_name(asCPointer())));
    }

    /**
     * Gets the title of &#64;self.
     * @return the title of &#64;self.
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesPage.INST().adw_preferences_page_get_title(asCPointer())));
    }

    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     * @return whether an embedded underline in the title indicates a mnemonic
    */
    public boolean getUseUnderline()  {
        return JnaPreferencesPage.INST().adw_preferences_page_get_use_underline(asCPointer());
    }

    /**
     * Removes a group from &#64;self.
     * @param group the group to remove
    */
    public void remove(@Nonnull PreferencesGroup group)  {
        JnaPreferencesPage.INST().adw_preferences_page_remove(asCPointer(), asCPointerNotNull(group));
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the name of &#64;self.
     * @param name the name
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets the name of &#64;self.
     * @param name the name
    */
    public void setName(String name)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_name(asCPointer(), name);
    }

    /**
     * Sets the title of &#64;self.
     * @param title the title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of &#64;self.
     * @param title the title
    */
    public void setTitle(String title)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_title(asCPointer(), title);
    }

    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     * @param use_underline `TRUE` if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaPreferencesPage.INST().adw_preferences_page_set_use_underline(asCPointer(), use_underline);
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
        return JnaPreferencesPage.INST().adw_preferences_page_get_type(); 
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
