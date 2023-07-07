/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkWindowControls` shows window frame controls.
 * <br>
 * <br>Typical window frame controls are minimize, maximize and close buttons,
 * <br>and the window icon.
 * <br>
 * <br>![An example GtkWindowControls](windowcontrols.png)
 * <br>
 * <br>`GtkWindowControls` only displays start or end side of the controls (see
 * <br>[property&#64;Gtk.WindowControls:side]), so it's intended to be always used
 * <br>in pair with another `GtkWindowControls` for the opposite side, for example:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkBox&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkWindowControls&quot;&gt;
 * <br>      &lt;property name=&quot;side&quot;&gt;start&lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>
 * <br>  ...
 * <br>
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkWindowControls&quot;&gt;
 * <br>      &lt;property name=&quot;side&quot;&gt;end&lt;/property&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>windowcontrols
 * <br>├── [image.icon]
 * <br>├── [button.minimize]
 * <br>├── [button.maximize]
 * <br>╰── [button.close]
 * <br>```
 * <br>
 * <br>A `GtkWindowControls`' CSS node is called windowcontrols. It contains
 * <br>subnodes corresponding to each title button. Which of the title buttons
 * <br>exist and where they are placed exactly depends on the desktop environment
 * <br>and [property&#64;Gtk.WindowControls:decoration-layout] value.
 * <br>
 * <br>When [property&#64;Gtk.WindowControls:empty] is %TRUE, it gets the .empty
 * <br>style class.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkWindowControls` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.WindowControls.html">https://docs.gtk.org/gtk4/class.WindowControls.html</a></p>
*/
public class WindowControls extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowControls.class.getCanonicalName());
    }

    public WindowControls(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkWindowControls`.
     * @param side the side
    */
    public WindowControls(int side) {
        super(cast(JnaWindowControls.INST().gtk_window_controls_new(side)));
    }

    /**
     * Gets the decoration layout of this `GtkWindowControls`.
     * @return the decoration layout or %NULL if it is unset
    */
    public ch.bailu.gtk.type.Str getDecorationLayout()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindowControls.INST().gtk_window_controls_get_decoration_layout(asCPointer())));
    }

    /**
     * Gets whether the widget has any window buttons.
     * @return %TRUE if the widget has window buttons, otherwise %FALSE
    */
    public boolean getEmpty()  {
        return JnaWindowControls.INST().gtk_window_controls_get_empty(asCPointer());
    }

    /**
     * Gets the side to which this `GtkWindowControls` instance belongs.
     * @return the side
    */
    public int getSide()  {
        return JnaWindowControls.INST().gtk_window_controls_get_side(asCPointer());
    }

    /**
     * Sets the decoration layout for the title buttons.
     * <br>
     * <br>This overrides the [property&#64;Gtk.Settings:gtk-decoration-layout]
     * <br>setting.
     * <br>
     * <br>The format of the string is button names, separated by commas.
     * <br>A colon separates the buttons that should appear on the left
     * <br>from those on the right. Recognized button names are minimize,
     * <br>maximize, close and icon (the window icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies a icon
     * <br>on the left, and minimize, maximize and close buttons on the right.
     * <br>
     * <br>If [property&#64;Gtk.WindowControls:side] value is &#64;GTK_PACK_START, &#64;self
     * <br>will display the part before the colon, otherwise after that.
     * @param layout a decoration layout, or %NULL to unset the layout
    */
    public void setDecorationLayout(@Nullable ch.bailu.gtk.type.Str layout)  {
        JnaWindowControls.INST().gtk_window_controls_set_decoration_layout(asCPointer(), asCPointer(layout));
    }

    /**
     * Sets the decoration layout for the title buttons.
     * <br>
     * <br>This overrides the [property&#64;Gtk.Settings:gtk-decoration-layout]
     * <br>setting.
     * <br>
     * <br>The format of the string is button names, separated by commas.
     * <br>A colon separates the buttons that should appear on the left
     * <br>from those on the right. Recognized button names are minimize,
     * <br>maximize, close and icon (the window icon).
     * <br>
     * <br>For example, “icon:minimize,maximize,close” specifies a icon
     * <br>on the left, and minimize, maximize and close buttons on the right.
     * <br>
     * <br>If [property&#64;Gtk.WindowControls:side] value is &#64;GTK_PACK_START, &#64;self
     * <br>will display the part before the colon, otherwise after that.
     * @param layout a decoration layout, or %NULL to unset the layout
    */
    public void setDecorationLayout(String layout)  {
        JnaWindowControls.INST().gtk_window_controls_set_decoration_layout(asCPointer(), layout);
    }

    /**
     * Determines which part of decoration layout the `GtkWindowControls` uses.
     * <br>
     * <br>See [property&#64;Gtk.WindowControls:decoration-layout].
     * @param side a side
    */
    public void setSide(int side)  {
        JnaWindowControls.INST().gtk_window_controls_set_side(asCPointer(), side);
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
        return JnaWindowControls.INST().gtk_window_controls_get_type(); 
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
