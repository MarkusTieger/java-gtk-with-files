/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStyleContext` stores styling information affecting a widget.
 * <br>
 * <br>In order to construct the final style information, `GtkStyleContext`
 * <br>queries information from all attached `GtkStyleProviders`. Style
 * <br>providers can be either attached explicitly to the context through
 * <br>[method&#64;Gtk.StyleContext.add_provider], or to the display through
 * <br>[func&#64;Gtk.StyleContext.add_provider_for_display]. The resulting
 * <br>style is a combination of all providers’ information in priority order.
 * <br>
 * <br>For GTK widgets, any `GtkStyleContext` returned by
 * <br>[method&#64;Gtk.Widget.get_style_context] will already have a `GdkDisplay`
 * <br>and RTL/LTR information set. The style context will also be updated
 * <br>automatically if any of these settings change on the widget.
 * <br>
 * <br>&#35; Style Classes
 * <br>
 * <br>Widgets can add style classes to their context, which can be used to associate
 * <br>different styles by class. The documentation for individual widgets lists
 * <br>which style classes it uses itself, and which style classes may be added by
 * <br>applications to affect their appearance.
 * <br>
 * <br>&#35; Custom styling in UI libraries and applications
 * <br>
 * <br>If you are developing a library with custom widgets that render differently
 * <br>than standard components, you may need to add a `GtkStyleProvider` yourself
 * <br>with the %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK priority, either a
 * <br>`GtkCssProvider` or a custom object implementing the `GtkStyleProvider`
 * <br>interface. This way themes may still attempt to style your UI elements in
 * <br>a different way if needed so.
 * <br>
 * <br>If you are using custom styling on an applications, you probably want then
 * <br>to make your style information prevail to the theme’s, so you must use
 * <br>a `GtkStyleProvider` with the %GTK_STYLE_PROVIDER_PRIORITY_APPLICATION
 * <br>priority, keep in mind that the user settings in
 * <br>`XDG_CONFIG_HOME/gtk-4.0/gtk.css` will
 * <br>still take precedence over your changes, as it uses the
 * <br>%GTK_STYLE_PROVIDER_PRIORITY_USER priority.
 * <p><a href="https://docs.gtk.org/gtk4/class.StyleContext.html">https://docs.gtk.org/gtk4/class.StyleContext.html</a></p>
*/
public class StyleContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StyleContext.class.getCanonicalName());
    }

    public StyleContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a style class to &#64;context, so later uses of the
     * <br>style context will make use of this new class for styling.
     * <br>
     * <br>In the CSS file format, a `GtkEntry` defining a “search”
     * <br>class, would be matched by:
     * <br>
     * <br>```css
     * <br>entry.search { ... }
     * <br>```
     * <br>
     * <br>While any widget defining a “search” class would be
     * <br>matched by:
     * <br>```css
     * <br>.search { ... }
     * <br>```
     * @param class_name class name to use in styling
    */
    public void addClass(@Nonnull ch.bailu.gtk.type.Str class_name)  {
        JnaStyleContext.INST().gtk_style_context_add_class(asCPointer(), asCPointerNotNull(class_name));
    }

    /**
     * Adds a style class to &#64;context, so later uses of the
     * <br>style context will make use of this new class for styling.
     * <br>
     * <br>In the CSS file format, a `GtkEntry` defining a “search”
     * <br>class, would be matched by:
     * <br>
     * <br>```css
     * <br>entry.search { ... }
     * <br>```
     * <br>
     * <br>While any widget defining a “search” class would be
     * <br>matched by:
     * <br>```css
     * <br>.search { ... }
     * <br>```
     * @param class_name class name to use in styling
    */
    public void addClass(String class_name)  {
        JnaStyleContext.INST().gtk_style_context_add_class(asCPointer(), class_name);
    }

    /**
     * Adds a style provider to &#64;context, to be used in style construction.
     * <br>
     * <br>Note that a style provider added by this function only affects
     * <br>the style of the widget to which &#64;context belongs. If you want
     * <br>to affect the style of all widgets, use
     * <br>[func&#64;Gtk.StyleContext.add_provider_for_display].
     * <br>
     * <br>Note: If both priorities are the same, a `GtkStyleProvider`
     * <br>added through this function takes precedence over another added
     * <br>through [func&#64;Gtk.StyleContext.add_provider_for_display].
     * @param provider a `GtkStyleProvider`
     * @param priority the priority of the style provider. The lower   it is, the earlier it will be used in the style construction.   Typically this will be in the range between   %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK and   %GTK_STYLE_PROVIDER_PRIORITY_USER
    */
    public void addProvider(@Nonnull StyleProvider provider, int priority)  {
        JnaStyleContext.INST().gtk_style_context_add_provider(asCPointer(), asCPointerNotNull(provider), priority);
    }

    /**
     * Gets the border for a given state as a `GtkBorder`.
     * @param border return value for the border settings
    */
    public void getBorder(@Nonnull Border border)  {
        JnaStyleContext.INST().gtk_style_context_get_border(asCPointer(), asCPointerNotNull(border));
    }

    /**
     * Gets the foreground color for a given state.
     * @param color return value for the foreground color
    */
    public void getColor(@Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        JnaStyleContext.INST().gtk_style_context_get_color(asCPointer(), asCPointerNotNull(color));
    }

    /**
     * Returns the `GdkDisplay` to which &#64;context is attached.
     * @return a `GdkDisplay`.
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaStyleContext.INST().gtk_style_context_get_display(asCPointer())));
    }

    /**
     * Gets the margin for a given state as a `GtkBorder`.
     * @param margin return value for the margin settings
    */
    public void getMargin(@Nonnull Border margin)  {
        JnaStyleContext.INST().gtk_style_context_get_margin(asCPointer(), asCPointerNotNull(margin));
    }

    /**
     * Gets the padding for a given state as a `GtkBorder`.
     * @param padding return value for the padding settings
    */
    public void getPadding(@Nonnull Border padding)  {
        JnaStyleContext.INST().gtk_style_context_get_padding(asCPointer(), asCPointerNotNull(padding));
    }

    /**
     * Returns the scale used for assets.
     * @return the scale
    */
    public int getScale()  {
        return JnaStyleContext.INST().gtk_style_context_get_scale(asCPointer());
    }

    /**
     * Returns the state used for style matching.
     * <br>
     * <br>This method should only be used to retrieve the `GtkStateFlags`
     * <br>to pass to `GtkStyleContext` methods, like
     * <br>[method&#64;Gtk.StyleContext.get_padding].
     * <br>If you need to retrieve the current state of a `GtkWidget`, use
     * <br>[method&#64;Gtk.Widget.get_state_flags].
     * @return the state flags
    */
    public int getState()  {
        return JnaStyleContext.INST().gtk_style_context_get_state(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;context currently has defined the
     * <br>given class name.
     * @param class_name a class name
     * @return %TRUE if &#64;context has &#64;class_name defined
    */
    public boolean hasClass(@Nonnull ch.bailu.gtk.type.Str class_name)  {
        return JnaStyleContext.INST().gtk_style_context_has_class(asCPointer(), asCPointerNotNull(class_name));
    }

    /**
     * Returns %TRUE if &#64;context currently has defined the
     * <br>given class name.
     * @param class_name a class name
     * @return %TRUE if &#64;context has &#64;class_name defined
    */
    public boolean hasClass(String class_name)  {
        return JnaStyleContext.INST().gtk_style_context_has_class(asCPointer(), class_name);
    }

    /**
     * Looks up and resolves a color name in the &#64;context color map.
     * @param color_name color name to lookup
     * @param color Return location for the looked up color
     * @return %TRUE if &#64;color_name was found and resolved, %FALSE otherwise
    */
    public boolean lookupColor(@Nonnull ch.bailu.gtk.type.Str color_name, @Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        return JnaStyleContext.INST().gtk_style_context_lookup_color(asCPointer(), asCPointerNotNull(color_name), asCPointerNotNull(color));
    }

    /**
     * Looks up and resolves a color name in the &#64;context color map.
     * @param color_name color name to lookup
     * @param color Return location for the looked up color
     * @return %TRUE if &#64;color_name was found and resolved, %FALSE otherwise
    */
    public boolean lookupColor(String color_name, @Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        return JnaStyleContext.INST().gtk_style_context_lookup_color(asCPointer(), color_name, asCPointerNotNull(color));
    }

    /**
     * Removes &#64;class_name from &#64;context.
     * @param class_name class name to remove
    */
    public void removeClass(@Nonnull ch.bailu.gtk.type.Str class_name)  {
        JnaStyleContext.INST().gtk_style_context_remove_class(asCPointer(), asCPointerNotNull(class_name));
    }

    /**
     * Removes &#64;class_name from &#64;context.
     * @param class_name class name to remove
    */
    public void removeClass(String class_name)  {
        JnaStyleContext.INST().gtk_style_context_remove_class(asCPointer(), class_name);
    }

    /**
     * Removes &#64;provider from the style providers list in &#64;context.
     * @param provider a `GtkStyleProvider`
    */
    public void removeProvider(@Nonnull StyleProvider provider)  {
        JnaStyleContext.INST().gtk_style_context_remove_provider(asCPointer(), asCPointerNotNull(provider));
    }

    /**
     * Restores &#64;context state to a previous stage.
     * <br>
     * <br>See [method&#64;Gtk.StyleContext.save].
    */
    public void restore()  {
        JnaStyleContext.INST().gtk_style_context_restore(asCPointer());
    }

    /**
     * Saves the &#64;context state.
     * <br>
     * <br>This allows temporary modifications done through
     * <br>[method&#64;Gtk.StyleContext.add_class],
     * <br>[method&#64;Gtk.StyleContext.remove_class],
     * <br>[method&#64;Gtk.StyleContext.set_state] to be quickly
     * <br>reverted in one go through [method&#64;Gtk.StyleContext.restore].
     * <br>
     * <br>The matching call to [method&#64;Gtk.StyleContext.restore]
     * <br>must be done before GTK returns to the main loop.
    */
    public void save()  {
        JnaStyleContext.INST().gtk_style_context_save(asCPointer());
    }

    /**
     * Attaches &#64;context to the given display.
     * <br>
     * <br>The display is used to add style information from “global”
     * <br>style providers, such as the display's `GtkSettings` instance.
     * <br>
     * <br>If you are using a `GtkStyleContext` returned from
     * <br>[method&#64;Gtk.Widget.get_style_context], you do not need to
     * <br>call this yourself.
     * @param display a `GdkDisplay`
    */
    public void setDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        JnaStyleContext.INST().gtk_style_context_set_display(asCPointer(), asCPointerNotNull(display));
    }

    /**
     * Sets the scale to use when getting image assets for the style.
     * @param scale scale
    */
    public void setScale(int scale)  {
        JnaStyleContext.INST().gtk_style_context_set_scale(asCPointer(), scale);
    }

    /**
     * Sets the state to be used for style matching.
     * @param flags state to represent
    */
    public void setState(int flags)  {
        JnaStyleContext.INST().gtk_style_context_set_state(asCPointer(), flags);
    }

    /**
     * Converts the style context into a string representation.
     * <br>
     * <br>The string representation always includes information about
     * <br>the name, state, id, visibility and style classes of the CSS
     * <br>node that is backing &#64;context. Depending on the flags, more
     * <br>information may be included.
     * <br>
     * <br>This function is intended for testing and debugging of the
     * <br>CSS implementation in GTK. There are no guarantees about
     * <br>the format of the returned string, it may change.
     * @param flags Flags that determine what to print
     * @return a newly allocated string representing &#64;context
    */
    public ch.bailu.gtk.type.Str toStr(int flags)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStyleContext.INST().gtk_style_context_to_string(asCPointer(), flags)));
    }

    /**
     * Adds a global style provider to &#64;display, which will be used
     * <br>in style construction for all `GtkStyleContexts` under &#64;display.
     * <br>
     * <br>GTK uses this to make styling information from `GtkSettings`
     * <br>available.
     * <br>
     * <br>Note: If both priorities are the same, A `GtkStyleProvider`
     * <br>added through [method&#64;Gtk.StyleContext.add_provider] takes
     * <br>precedence over another added through this function.
     * @param display a `GdkDisplay`
     * @param provider a `GtkStyleProvider`
     * @param priority the priority of the style provider. The lower   it is, the earlier it will be used in the style construction.   Typically this will be in the range between   %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK and   %GTK_STYLE_PROVIDER_PRIORITY_USER
    */
    public static void addProviderForDisplay(@Nonnull ch.bailu.gtk.gdk.Display display, @Nonnull StyleProvider provider, int priority)  {
        JnaStyleContext.INST().gtk_style_context_add_provider_for_display(asCPointerNotNull(display), asCPointerNotNull(provider), priority);
    }

    /**
     * Removes &#64;provider from the global style providers list in &#64;display.
     * @param display a `GdkDisplay`
     * @param provider a `GtkStyleProvider`
    */
    public static void removeProviderForDisplay(@Nonnull ch.bailu.gtk.gdk.Display display, @Nonnull StyleProvider provider)  {
        JnaStyleContext.INST().gtk_style_context_remove_provider_for_display(asCPointerNotNull(display), asCPointerNotNull(provider));
    }

    public static long getTypeID() { 
        return JnaStyleContext.INST().gtk_style_context_get_type(); 
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
