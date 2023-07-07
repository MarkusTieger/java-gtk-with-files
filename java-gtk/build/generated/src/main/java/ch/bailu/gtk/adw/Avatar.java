/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget displaying an image, with a generated fallback.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;avatar-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;avatar.png&quot; alt=&quot;avatar&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwAvatar` is a widget that shows a round avatar.
 * <br>
 * <br>`AdwAvatar` generates an avatar with the initials of  the
 * <br>[property&#64;Avatar:text] on top of a colored background.
 * <br>
 * <br>The color is picked based on the hash of the [property&#64;Avatar:text].
 * <br>
 * <br>If [property&#64;Avatar:show-initials] is set to `FALSE`,
 * <br>[property&#64;Avatar:icon-name] or `avatar-default-symbolic` is shown instead of
 * <br>the initials.
 * <br>
 * <br>Use [property&#64;Avatar:custom-image] to set a custom image.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwAvatar` has a single CSS node with name `avatar`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Avatar.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Avatar.html</a></p>
*/
public class Avatar extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Avatar.class.getCanonicalName());
    }

    public Avatar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwAvatar`.
     * @param size The size of the avatar
     * @param text the text used to get the initials and color
     * @param show_initials whether to use initials instead of an icon as fallback
    */
    public Avatar(int size, @Nullable ch.bailu.gtk.type.Str text, boolean show_initials) {
        super(cast(JnaAvatar.INST().adw_avatar_new(size, asCPointer(text), show_initials)));
    }

    /**
     * Creates a new `AdwAvatar`.
     * @param size The size of the avatar
     * @param text the text used to get the initials and color
     * @param show_initials whether to use initials instead of an icon as fallback
    */
    public Avatar(int size, String text, boolean show_initials) {
        super(cast(JnaAvatar.INST().adw_avatar_new(size, text, show_initials)));
    }

    /**
     * Renders &#64;self into a [class&#64;Gdk.Texture] at &#64;scale_factor.
     * <br>
     * <br>This can be used to export the fallback avatar.
     * @param scale_factor The scale factor
     * @return the texture
    */
    public ch.bailu.gtk.gdk.Texture drawToTexture(int scale_factor)  {
        return new ch.bailu.gtk.gdk.Texture(new PointerContainer(JnaAvatar.INST().adw_avatar_draw_to_texture(asCPointer(), scale_factor)));
    }

    /**
     * Gets the custom image paintable.
     * @return the custom image
    */
    public ch.bailu.gtk.gdk.Paintable getCustomImage()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaAvatar.INST().adw_avatar_get_custom_image(asCPointer())));
    }

    /**
     * Gets the name of an icon to use as a fallback.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAvatar.INST().adw_avatar_get_icon_name(asCPointer())));
    }

    /**
     * Gets whether initials are used instead of an icon on the fallback avatar.
     * @return whether initials are used instead of an icon as fallback
    */
    public boolean getShowInitials()  {
        return JnaAvatar.INST().adw_avatar_get_show_initials(asCPointer());
    }

    /**
     * Gets the size of the avatar.
     * @return the size of the avatar
    */
    public int getSize()  {
        return JnaAvatar.INST().adw_avatar_get_size(asCPointer());
    }

    /**
     * Gets the text used to generate the fallback initials and color.
     * @return the text used to generate the fallback initials and   color
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAvatar.INST().adw_avatar_get_text(asCPointer())));
    }

    /**
     * Sets the custom image paintable.
     * <br>
     * <br>Custom image is displayed instead of initials or icon.
     * @param custom_image a custom image
    */
    public void setCustomImage(@Nullable ch.bailu.gtk.gdk.Paintable custom_image)  {
        JnaAvatar.INST().adw_avatar_set_custom_image(asCPointer(), asCPointer(custom_image));
    }

    /**
     * Sets the name of an icon to use as a fallback.
     * <br>
     * <br>If no name is set, `avatar-default-symbolic` will be used.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaAvatar.INST().adw_avatar_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the name of an icon to use as a fallback.
     * <br>
     * <br>If no name is set, `avatar-default-symbolic` will be used.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaAvatar.INST().adw_avatar_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets whether to use initials instead of an icon on the fallback avatar.
     * <br>
     * <br>See [property&#64;Avatar:icon-name] for how to change the fallback icon.
     * @param show_initials whether to use initials instead of an icon as fallback
    */
    public void setShowInitials(boolean show_initials)  {
        JnaAvatar.INST().adw_avatar_set_show_initials(asCPointer(), show_initials);
    }

    /**
     * Sets the size of the avatar.
     * @param size The size of the avatar
    */
    public void setSize(int size)  {
        JnaAvatar.INST().adw_avatar_set_size(asCPointer(), size);
    }

    /**
     * Sets the text used to generate the fallback initials and color.
     * <br>
     * <br>It's only used to generate the color if [property&#64;Avatar:show-initials] is
     * <br>`FALSE`.
     * @param text the text used to get the initials and color
    */
    public void setText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaAvatar.INST().adw_avatar_set_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets the text used to generate the fallback initials and color.
     * <br>
     * <br>It's only used to generate the color if [property&#64;Avatar:show-initials] is
     * <br>`FALSE`.
     * @param text the text used to get the initials and color
    */
    public void setText(String text)  {
        JnaAvatar.INST().adw_avatar_set_text(asCPointer(), text);
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
        return JnaAvatar.INST().adw_avatar_get_type(); 
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
