/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkActionBar` is designed to present contextual actions.
 * <br>
 * <br>![An example GtkActionBar](action-bar.png)
 * <br>
 * <br>It is expected to be displayed below the content and expand
 * <br>horizontally to fill the area.
 * <br>
 * <br>It allows placing children at the start or the end. In addition, it
 * <br>contains an internal centered box which is centered with respect to
 * <br>the full width of the box, even if the children at either side take
 * <br>up different amounts of space.
 * <br>
 * <br>&#35; GtkActionBar as GtkBuildable
 * <br>
 * <br>The `GtkActionBar` implementation of the `GtkBuildable` interface supports
 * <br>adding children at the start or end sides by specifying “start” or “end” as
 * <br>the “type” attribute of a `&lt;child&gt;` element, or setting the center widget
 * <br>by specifying “center” value.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>actionbar
 * <br>╰── revealer
 * <br>    ╰── box
 * <br>        ├── box.start
 * <br>        │   ╰── [start children]
 * <br>        ├── [center widget]
 * <br>        ╰── box.end
 * <br>            ╰── [end children]
 * <br>```
 * <br>
 * <br>A `GtkActionBar`'s CSS node is called `actionbar`. It contains a `revealer`
 * <br>subnode, which contains a `box` subnode, which contains two `box` subnodes at
 * <br>the start and end of the action bar, with `start` and `end style classes
 * <br>respectively, as well as a center node that represents the center child.
 * <br>
 * <br>Each of the boxes contains children packed for that side.
 * <p><a href="https://docs.gtk.org/gtk4/class.ActionBar.html">https://docs.gtk.org/gtk4/class.ActionBar.html</a></p>
*/
public class ActionBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionBar.class.getCanonicalName());
    }

    public ActionBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkActionBar` widget.
    */
    public ActionBar() {
        super(cast(JnaActionBar.INST().gtk_action_bar_new()));
    }

    /**
     * Retrieves the center bar widget of the bar.
     * @return the center `GtkWidget`
    */
    public Widget getCenterWidget()  {
        return new Widget(new PointerContainer(JnaActionBar.INST().gtk_action_bar_get_center_widget(asCPointer())));
    }

    /**
     * Gets whether the contents of the action bar are revealed.
     * @return the current value of the [property&#64;Gtk.ActionBar:revealed]   property
    */
    public boolean getRevealed()  {
        return JnaActionBar.INST().gtk_action_bar_get_revealed(asCPointer());
    }

    /**
     * Adds &#64;child to &#64;action_bar, packed with reference to the
     * <br>end of the &#64;action_bar.
     * @param child the `GtkWidget` to be added to &#64;action_bar
    */
    public void packEnd(@Nonnull Widget child)  {
        JnaActionBar.INST().gtk_action_bar_pack_end(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Adds &#64;child to &#64;action_bar, packed with reference to the
     * <br>start of the &#64;action_bar.
     * @param child the `GtkWidget` to be added to &#64;action_bar
    */
    public void packStart(@Nonnull Widget child)  {
        JnaActionBar.INST().gtk_action_bar_pack_start(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child from &#64;action_bar.
     * @param child the `GtkWidget` to be removed
    */
    public void remove(@Nonnull Widget child)  {
        JnaActionBar.INST().gtk_action_bar_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets the center widget for the `GtkActionBar`.
     * @param center_widget a widget to use for the center
    */
    public void setCenterWidget(@Nullable Widget center_widget)  {
        JnaActionBar.INST().gtk_action_bar_set_center_widget(asCPointer(), asCPointer(center_widget));
    }

    /**
     * Reveals or conceals the content of the action bar.
     * <br>
     * <br>Note: this does not show or hide &#64;action_bar in the
     * <br>[property&#64;Gtk.Widget:visible] sense, so revealing has
     * <br>no effect if the action bar is hidden.
     * @param revealed The new value of the property
    */
    public void setRevealed(boolean revealed)  {
        JnaActionBar.INST().gtk_action_bar_set_revealed(asCPointer(), revealed);
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
        return JnaActionBar.INST().gtk_action_bar_get_type(); 
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
