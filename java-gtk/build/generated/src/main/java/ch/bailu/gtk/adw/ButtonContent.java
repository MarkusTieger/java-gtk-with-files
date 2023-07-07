/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A helper widget for creating buttons.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;button-content-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;button-content.png&quot; alt=&quot;button-content&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwButtonContent` is a box-like widget with an icon and a label.
 * <br>
 * <br>It's intended to be used as a direct child of [class&#64;Gtk.Button],
 * <br>[class&#64;Gtk.MenuButton] or [class&#64;SplitButton], when they need to have both an
 * <br>icon and a label, as follows:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkButton&quot;&gt;
 * <br>  &lt;property name=&quot;child&quot;&gt;
 * <br>    &lt;object class=&quot;AdwButtonContent&quot;&gt;
 * <br>      &lt;property name=&quot;icon-name&quot;&gt;document-open-symbolic&lt;/property&gt;
 * <br>      &lt;property name=&quot;label&quot; translatable=&quot;yes&quot;&gt;_Open&lt;/property&gt;
 * <br>      &lt;property name=&quot;use-underline&quot;&gt;True&lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>`AdwButtonContent` handles style classes and connecting the mnemonic to the
 * <br>button automatically.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>buttoncontent
 * <br>├── image
 * <br>╰── label
 * <br>```
 * <br>
 * <br>`AdwButtonContent`'s CSS node is called `buttoncontent`. It contains the
 * <br>subnodes `image` and `label`.
 * <br>
 * <br>When inside a `GtkButton` or `AdwSplitButton`, the button will receive the
 * <br>`.image-text-button` style class. When inside a `GtkMenuButton`, the
 * <br>internal `GtkButton` will receive it instead.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwButtonContent` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ButtonContent.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ButtonContent.html</a></p>
*/
public class ButtonContent extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ButtonContent.class.getCanonicalName());
    }

    public ButtonContent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwButtonContent`.
    */
    public ButtonContent() {
        super(cast(JnaButtonContent.INST().adw_button_content_new()));
    }

    /**
     * Gets the name of the displayed icon.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaButtonContent.INST().adw_button_content_get_icon_name(asCPointer())));
    }

    /**
     * Gets the displayed label.
     * @return the label
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaButtonContent.INST().adw_button_content_get_label(asCPointer())));
    }

    /**
     * Gets whether an underline in the text indicates a mnemonic.
     * @return whether an underline in the text indicates a mnemonic
    */
    public boolean getUseUnderline()  {
        return JnaButtonContent.INST().adw_button_content_get_use_underline(asCPointer());
    }

    /**
     * Sets the name of the displayed icon.
     * <br>
     * <br>If empty, the icon is not shown.
     * @param icon_name the new icon name
    */
    public void setIconName(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        JnaButtonContent.INST().adw_button_content_set_icon_name(asCPointer(), asCPointerNotNull(icon_name));
    }

    /**
     * Sets the name of the displayed icon.
     * <br>
     * <br>If empty, the icon is not shown.
     * @param icon_name the new icon name
    */
    public void setIconName(String icon_name)  {
        JnaButtonContent.INST().adw_button_content_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the displayed label.
     * @param label the new label
    */
    public void setLabel(@Nonnull ch.bailu.gtk.type.Str label)  {
        JnaButtonContent.INST().adw_button_content_set_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Sets the displayed label.
     * @param label the new label
    */
    public void setLabel(String label)  {
        JnaButtonContent.INST().adw_button_content_set_label(asCPointer(), label);
    }

    /**
     * Sets whether an underline in the text indicates a mnemonic.
     * <br>
     * <br>The mnemonic can be used to activate the parent button.
     * <br>
     * <br>See [property&#64;ButtonContent:label].
     * @param use_underline whether an underline in the text indicates a mnemonic
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaButtonContent.INST().adw_button_content_set_use_underline(asCPointer(), use_underline);
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
        return JnaButtonContent.INST().adw_button_content_get_type(); 
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
