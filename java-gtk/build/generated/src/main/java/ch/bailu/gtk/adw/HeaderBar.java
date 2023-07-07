/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A title bar widget.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;header-bar-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;header-bar.png&quot; alt=&quot;header-bar&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwHeaderBar` is similar to [class&#64;Gtk.HeaderBar], but provides additional
 * <br>features compared to it. Refer to `GtkHeaderBar` for details.
 * <br>
 * <br>[property&#64;HeaderBar:centering-policy] allows to enforce strict centering of
 * <br>the title widget, this is useful for [class&#64;ViewSwitcherTitle].
 * <br>
 * <br>[property&#64;HeaderBar:show-start-title-buttons] and
 * <br>[property&#64;HeaderBar:show-end-title-buttons] allow to easily create split
 * <br>header bar layouts using [class&#64;Leaflet], as follows:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;AdwLeaflet&quot; id=&quot;leaflet&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkBox&quot;&gt;
 * <br>      &lt;property name=&quot;orientation&quot;&gt;vertical&lt;/property&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;AdwHeaderBar&quot;&gt;
 * <br>          &lt;binding name=&quot;show-end-title-buttons&quot;&gt;
 * <br>            &lt;lookup name=&quot;folded&quot;&gt;leaflet&lt;/lookup&gt;
 * <br>          &lt;/binding&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/child&gt;
 * <br>      &lt;!-- ... --&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;!-- ... --&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkBox&quot;&gt;
 * <br>      &lt;property name=&quot;orientation&quot;&gt;vertical&lt;/property&gt;
 * <br>      &lt;property name=&quot;hexpand&quot;&gt;True&lt;/property&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;AdwHeaderBar&quot;&gt;
 * <br>          &lt;binding name=&quot;show-start-title-buttons&quot;&gt;
 * <br>            &lt;lookup name=&quot;folded&quot;&gt;leaflet&lt;/lookup&gt;
 * <br>          &lt;/binding&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/child&gt;
 * <br>      &lt;!-- ... --&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;header-bar-split-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;header-bar-split.png&quot; alt=&quot;header-bar-split&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>headerbar
 * <br>╰── windowhandle
 * <br>    ╰── box
 * <br>        ├── widget
 * <br>        │   ╰── box.start
 * <br>        │       ├── windowcontrols.start
 * <br>        │       ╰── [other children]
 * <br>        ├── [Title Widget]
 * <br>        ╰── widget
 * <br>            ╰── box.end
 * <br>                ├── [other children]
 * <br>                ╰── windowcontrols.end
 * <br>```
 * <br>
 * <br>`AdwHeaderBar`'s CSS node is called `headerbar`. It contains a `windowhandle`
 * <br>subnode, which contains a `box` subnode, which contains two `widget` subnodes
 * <br>at the start and end of the header bar, each of which contains a `box`
 * <br>subnode with the `.start` and `.end` style classes respectively, as well as a
 * <br>center node that represents the title.
 * <br>
 * <br>Each of the boxes contains a `windowcontrols` subnode, see
 * <br>[class&#64;Gtk.WindowControls] for details, as well as other children.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwHeaderBar` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.HeaderBar.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.HeaderBar.html</a></p>
*/
public class HeaderBar extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HeaderBar.class.getCanonicalName());
    }

    public HeaderBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwHeaderBar`.
    */
    public HeaderBar() {
        super(cast(JnaHeaderBar.INST().adw_header_bar_new()));
    }

    /**
     * Gets the policy for aligning the center widget.
     * @return the centering policy
    */
    public int getCenteringPolicy()  {
        return JnaHeaderBar.INST().adw_header_bar_get_centering_policy(asCPointer());
    }

    /**
     * Gets the decoration layout for &#64;self.
     * @return the decoration layout
    */
    public ch.bailu.gtk.type.Str getDecorationLayout()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaHeaderBar.INST().adw_header_bar_get_decoration_layout(asCPointer())));
    }

    /**
     * Gets whether to show title buttons at the end of &#64;self.
     * @return `TRUE` if title buttons at the end are shown
    */
    public boolean getShowEndTitleButtons()  {
        return JnaHeaderBar.INST().adw_header_bar_get_show_end_title_buttons(asCPointer());
    }

    /**
     * Gets whether to show title buttons at the start of &#64;self.
     * @return `TRUE` if title buttons at the start are shown
    */
    public boolean getShowStartTitleButtons()  {
        return JnaHeaderBar.INST().adw_header_bar_get_show_start_title_buttons(asCPointer());
    }

    /**
     * Gets the title widget widget of &#64;self.
     * @return the title widget
    */
    public ch.bailu.gtk.gtk.Widget getTitleWidget()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaHeaderBar.INST().adw_header_bar_get_title_widget(asCPointer())));
    }

    /**
     * Adds &#64;child to &#64;self, packed with reference to the end of &#64;self.
     * @param child the widget to be added to &#64;self
    */
    public void packEnd(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaHeaderBar.INST().adw_header_bar_pack_end(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Adds &#64;child to &#64;self, packed with reference to the start of the &#64;self.
     * @param child the widget to be added to &#64;self
    */
    public void packStart(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaHeaderBar.INST().adw_header_bar_pack_start(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child from &#64;self.
     * <br>
     * <br>The child must have been added with [method&#64;HeaderBar.pack_start],
     * <br>[method&#64;HeaderBar.pack_end] or [property&#64;HeaderBar:title-widget].
     * @param child the child to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaHeaderBar.INST().adw_header_bar_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets the policy for aligning the center widget.
     * @param centering_policy the centering policy
    */
    public void setCenteringPolicy(int centering_policy)  {
        JnaHeaderBar.INST().adw_header_bar_set_centering_policy(asCPointer(), centering_policy);
    }

    /**
     * Sets the decoration layout for &#64;self.
     * <br>
     * <br>If this property is not set, the
     * <br>[property&#64;Gtk.Settings:gtk-decoration-layout] setting is used.
     * <br>
     * <br>The format of the string is button names, separated by commas. A colon
     * <br>separates the buttons that should appear at the start from those at the end.
     * <br>Recognized button names are minimize, maximize, close and icon (the window
     * <br>icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies an icon at the start,
     * <br>and minimize, maximize and close buttons at the end.
     * @param layout a decoration layout
    */
    public void setDecorationLayout(@Nullable ch.bailu.gtk.type.Str layout)  {
        JnaHeaderBar.INST().adw_header_bar_set_decoration_layout(asCPointer(), asCPointer(layout));
    }

    /**
     * Sets the decoration layout for &#64;self.
     * <br>
     * <br>If this property is not set, the
     * <br>[property&#64;Gtk.Settings:gtk-decoration-layout] setting is used.
     * <br>
     * <br>The format of the string is button names, separated by commas. A colon
     * <br>separates the buttons that should appear at the start from those at the end.
     * <br>Recognized button names are minimize, maximize, close and icon (the window
     * <br>icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies an icon at the start,
     * <br>and minimize, maximize and close buttons at the end.
     * @param layout a decoration layout
    */
    public void setDecorationLayout(String layout)  {
        JnaHeaderBar.INST().adw_header_bar_set_decoration_layout(asCPointer(), layout);
    }

    /**
     * Sets whether to show title buttons at the end of &#64;self.
     * <br>
     * <br>See [property&#64;HeaderBar:show-start-title-buttons] for the other side.
     * <br>
     * <br>Which buttons are actually shown and where is determined by the
     * <br>[property&#64;HeaderBar:decoration-layout] property, and by the state of the
     * <br>window (e.g. a close button will not be shown if the window can't be closed).
     * @param setting `TRUE` to show standard title buttons
    */
    public void setShowEndTitleButtons(boolean setting)  {
        JnaHeaderBar.INST().adw_header_bar_set_show_end_title_buttons(asCPointer(), setting);
    }

    /**
     * Sets whether to show title buttons at the start of &#64;self.
     * <br>
     * <br>See [property&#64;HeaderBar:show-end-title-buttons] for the other side.
     * <br>
     * <br>Which buttons are actually shown and where is determined by the
     * <br>[property&#64;HeaderBar:decoration-layout] property, and by the state of the
     * <br>window (e.g. a close button will not be shown if the window can't be closed).
     * @param setting `TRUE` to show standard title buttons
    */
    public void setShowStartTitleButtons(boolean setting)  {
        JnaHeaderBar.INST().adw_header_bar_set_show_start_title_buttons(asCPointer(), setting);
    }

    /**
     * Sets the title widget for &#64;self.
     * <br>
     * <br>When set to `NULL`, the header bar will display the title of the window it
     * <br>is contained in.
     * <br>
     * <br>To use a different title, use [class&#64;WindowTitle]:
     * <br>
     * <br>```xml
     * <br>&lt;object class=&quot;AdwHeaderBar&quot;&gt;
     * <br>  &lt;property name=&quot;title-widget&quot;&gt;
     * <br>    &lt;object class=&quot;AdwWindowTitle&quot;&gt;
     * <br>      &lt;property name=&quot;title&quot; translatable=&quot;yes&quot;&gt;Title&lt;/property&gt;
     * <br>    &lt;/object&gt;
     * <br>  &lt;/property&gt;
     * <br>&lt;/object&gt;
     * <br>```
     * @param title_widget a widget to use for a title
    */
    public void setTitleWidget(@Nullable ch.bailu.gtk.gtk.Widget title_widget)  {
        JnaHeaderBar.INST().adw_header_bar_set_title_widget(asCPointer(), asCPointer(title_widget));
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
        return JnaHeaderBar.INST().adw_header_bar_get_type(); 
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
