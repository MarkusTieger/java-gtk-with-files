/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkHeaderBar` is a widget for creating custom title bars for windows.
 * <br>
 * <br>![An example GtkHeaderBar](headerbar.png)
 * <br>
 * <br>`GtkHeaderBar` is similar to a horizontal `GtkCenterBox`. It allows
 * <br>children to be placed at the start or the end. In addition, it allows
 * <br>the window title to be displayed. The title will be centered with respect
 * <br>to the width of the box, even if the children at either side take up
 * <br>different amounts of space.
 * <br>
 * <br>`GtkHeaderBar` can add typical window frame controls, such as minimize,
 * <br>maximize and close buttons, or the window icon.
 * <br>
 * <br>For these reasons, `GtkHeaderBar` is the natural choice for use as the
 * <br>custom titlebar widget of a `GtkWindow` (see [method&#64;Gtk.Window.set_titlebar]),
 * <br>as it gives features typical of titlebars while allowing the addition of
 * <br>child widgets.
 * <br>
 * <br>&#35;&#35; GtkHeaderBar as GtkBuildable
 * <br>
 * <br>The `GtkHeaderBar` implementation of the `GtkBuildable` interface supports
 * <br>adding children at the start or end sides by specifying “start” or “end” as
 * <br>the “type” attribute of a &lt;child&gt; element, or setting the title widget by
 * <br>specifying “title” value.
 * <br>
 * <br>By default the `GtkHeaderBar` uses a `GtkLabel` displaying the title of the
 * <br>window it is contained in as the title widget, equivalent to the following
 * <br>UI definition:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkHeaderBar&quot;&gt;
 * <br>  &lt;property name=&quot;title-widget&quot;&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot; translatable=&quot;yes&quot;&gt;Label&lt;/property&gt;
 * <br>      &lt;property name=&quot;single-line-mode&quot;&gt;True&lt;/property&gt;
 * <br>      &lt;property name=&quot;ellipsize&quot;&gt;end&lt;/property&gt;
 * <br>      &lt;property name=&quot;width-chars&quot;&gt;5&lt;/property&gt;
 * <br>      &lt;style&gt;
 * <br>        &lt;class name=&quot;title&quot;/&gt;
 * <br>      &lt;/style&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>headerbar
 * <br>╰── windowhandle
 * <br>    ╰── box
 * <br>        ├── box.start
 * <br>        │   ├── windowcontrols.start
 * <br>        │   ╰── [other children]
 * <br>        ├── [Title Widget]
 * <br>        ╰── box.end
 * <br>            ├── [other children]
 * <br>            ╰── windowcontrols.end
 * <br>```
 * <br>
 * <br>A `GtkHeaderBar`'s CSS node is called `headerbar`. It contains a `windowhandle`
 * <br>subnode, which contains a `box` subnode, which contains two `box` subnodes at
 * <br>the start and end of the header bar, as well as a center node that represents
 * <br>the title.
 * <br>
 * <br>Each of the boxes contains a `windowcontrols` subnode, see
 * <br>[class&#64;Gtk.WindowControls] for details, as well as other children.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkHeaderBar` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.HeaderBar.html">https://docs.gtk.org/gtk4/class.HeaderBar.html</a></p>
*/
public class HeaderBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HeaderBar.class.getCanonicalName());
    }

    public HeaderBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkHeaderBar` widget.
    */
    public HeaderBar() {
        super(cast(JnaHeaderBar.INST().gtk_header_bar_new()));
    }

    /**
     * Gets the decoration layout of the `GtkHeaderBar`.
     * @return the decoration layout
    */
    public ch.bailu.gtk.type.Str getDecorationLayout()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaHeaderBar.INST().gtk_header_bar_get_decoration_layout(asCPointer())));
    }

    /**
     * Returns whether this header bar shows the standard window
     * <br>title buttons.
     * @return %TRUE if title buttons are shown
    */
    public boolean getShowTitleButtons()  {
        return JnaHeaderBar.INST().gtk_header_bar_get_show_title_buttons(asCPointer());
    }

    /**
     * Retrieves the title widget of the header.
     * <br>
     * <br>See [method&#64;Gtk.HeaderBar.set_title_widget].
     * @return the title widget of the header
    */
    public Widget getTitleWidget()  {
        return new Widget(new PointerContainer(JnaHeaderBar.INST().gtk_header_bar_get_title_widget(asCPointer())));
    }

    /**
     * Adds &#64;child to &#64;bar, packed with reference to the
     * <br>end of the &#64;bar.
     * @param child the `GtkWidget` to be added to &#64;bar
    */
    public void packEnd(@Nonnull Widget child)  {
        JnaHeaderBar.INST().gtk_header_bar_pack_end(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Adds &#64;child to &#64;bar, packed with reference to the
     * <br>start of the &#64;bar.
     * @param child the `GtkWidget` to be added to &#64;bar
    */
    public void packStart(@Nonnull Widget child)  {
        JnaHeaderBar.INST().gtk_header_bar_pack_start(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child from the `GtkHeaderBar`.
     * <br>
     * <br>The child must have been added with
     * <br>[method&#64;Gtk.HeaderBar.pack_start],
     * <br>[method&#64;Gtk.HeaderBar.pack_end] or
     * <br>[method&#64;Gtk.HeaderBar.set_title_widget].
     * @param child the child to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaHeaderBar.INST().gtk_header_bar_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets the decoration layout for this header bar.
     * <br>
     * <br>This property overrides the
     * <br>[property&#64;Gtk.Settings:gtk-decoration-layout] setting.
     * <br>
     * <br>There can be valid reasons for overriding the setting, such
     * <br>as a header bar design that does not allow for buttons to take
     * <br>room on the right, or only offers room for a single close button.
     * <br>Split header bars are another example for overriding the setting.
     * <br>
     * <br>The format of the string is button names, separated by commas.
     * <br>A colon separates the buttons that should appear on the left
     * <br>from those on the right. Recognized button names are minimize,
     * <br>maximize, close and icon (the window icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies a icon
     * <br>on the left, and minimize, maximize and close buttons on the right.
     * @param layout a decoration layout, or %NULL to unset the layout
    */
    public void setDecorationLayout(@Nullable ch.bailu.gtk.type.Str layout)  {
        JnaHeaderBar.INST().gtk_header_bar_set_decoration_layout(asCPointer(), asCPointer(layout));
    }

    /**
     * Sets the decoration layout for this header bar.
     * <br>
     * <br>This property overrides the
     * <br>[property&#64;Gtk.Settings:gtk-decoration-layout] setting.
     * <br>
     * <br>There can be valid reasons for overriding the setting, such
     * <br>as a header bar design that does not allow for buttons to take
     * <br>room on the right, or only offers room for a single close button.
     * <br>Split header bars are another example for overriding the setting.
     * <br>
     * <br>The format of the string is button names, separated by commas.
     * <br>A colon separates the buttons that should appear on the left
     * <br>from those on the right. Recognized button names are minimize,
     * <br>maximize, close and icon (the window icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies a icon
     * <br>on the left, and minimize, maximize and close buttons on the right.
     * @param layout a decoration layout, or %NULL to unset the layout
    */
    public void setDecorationLayout(String layout)  {
        JnaHeaderBar.INST().gtk_header_bar_set_decoration_layout(asCPointer(), layout);
    }

    /**
     * Sets whether this header bar shows the standard window
     * <br>title buttons.
     * @param setting %TRUE to show standard title buttons
    */
    public void setShowTitleButtons(boolean setting)  {
        JnaHeaderBar.INST().gtk_header_bar_set_show_title_buttons(asCPointer(), setting);
    }

    /**
     * Sets the title for the `GtkHeaderBar`.
     * <br>
     * <br>When set to %NULL, the headerbar will display the title of
     * <br>the window it is contained in.
     * <br>
     * <br>The title should help a user identify the current view.
     * <br>To achieve the same style as the builtin title, use the
     * <br>“title” style class.
     * <br>
     * <br>You should set the title widget to %NULL, for the window
     * <br>title label to be visible again.
     * @param title_widget a widget to use for a title
    */
    public void setTitleWidget(@Nullable Widget title_widget)  {
        JnaHeaderBar.INST().gtk_header_bar_set_title_widget(asCPointer(), asCPointer(title_widget));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaHeaderBar.INST().gtk_header_bar_get_type(); 
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
