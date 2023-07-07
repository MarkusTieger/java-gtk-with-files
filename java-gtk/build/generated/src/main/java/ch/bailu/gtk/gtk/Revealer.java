/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkRevealer` animates the transition of its child from invisible to visible.
 * <br>
 * <br>The style of transition can be controlled with
 * <br>[method&#64;Gtk.Revealer.set_transition_type].
 * <br>
 * <br>These animations respect the [property&#64;Gtk.Settings:gtk-enable-animations]
 * <br>setting.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkRevealer` has a single CSS node with name revealer.
 * <br>When styling `GtkRevealer` using CSS, remember that it only hides its contents,
 * <br>not itself. That means applied margin, padding and borders will be visible even
 * <br>when the [property&#64;Gtk.Revealer:reveal-child] property is set to %FALSE.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkRevealer` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <br>
 * <br>The child of `GtkRevealer`, if set, is always available in the accessibility
 * <br>tree, regardless of the state of the revealer widget.
 * <p><a href="https://docs.gtk.org/gtk4/class.Revealer.html">https://docs.gtk.org/gtk4/class.Revealer.html</a></p>
*/
public class Revealer extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Revealer.class.getCanonicalName());
    }

    public Revealer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkRevealer`.
    */
    public Revealer() {
        super(cast(JnaRevealer.INST().gtk_revealer_new()));
    }

    /**
     * Gets the child widget of &#64;revealer.
     * @return the child widget of &#64;revealer
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaRevealer.INST().gtk_revealer_get_child(asCPointer())));
    }

    /**
     * Returns whether the child is fully revealed.
     * <br>
     * <br>In other words, this returns whether the transition
     * <br>to the revealed state is completed.
     * @return %TRUE if the child is fully revealed
    */
    public boolean getChildRevealed()  {
        return JnaRevealer.INST().gtk_revealer_get_child_revealed(asCPointer());
    }

    /**
     * Returns whether the child is currently revealed.
     * <br>
     * <br>This function returns %TRUE as soon as the transition
     * <br>is to the revealed state is started. To learn whether
     * <br>the child is fully revealed (ie the transition is completed),
     * <br>use [method&#64;Gtk.Revealer.get_child_revealed].
     * @return %TRUE if the child is revealed.
    */
    public boolean getRevealChild()  {
        return JnaRevealer.INST().gtk_revealer_get_reveal_child(asCPointer());
    }

    /**
     * Returns the amount of time (in milliseconds) that
     * <br>transitions will take.
     * @return the transition duration
    */
    public int getTransitionDuration()  {
        return JnaRevealer.INST().gtk_revealer_get_transition_duration(asCPointer());
    }

    /**
     * Gets the type of animation that will be used
     * <br>for transitions in &#64;revealer.
     * @return the current transition type of &#64;revealer
    */
    public int getTransitionType()  {
        return JnaRevealer.INST().gtk_revealer_get_transition_type(asCPointer());
    }

    /**
     * Sets the child widget of &#64;revealer.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaRevealer.INST().gtk_revealer_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Tells the `GtkRevealer` to reveal or conceal its child.
     * <br>
     * <br>The transition will be animated with the current
     * <br>transition type of &#64;revealer.
     * @param reveal_child %TRUE to reveal the child
    */
    public void setRevealChild(boolean reveal_child)  {
        JnaRevealer.INST().gtk_revealer_set_reveal_child(asCPointer(), reveal_child);
    }

    /**
     * Sets the duration that transitions will take.
     * @param duration the new duration, in milliseconds
    */
    public void setTransitionDuration(int duration)  {
        JnaRevealer.INST().gtk_revealer_set_transition_duration(asCPointer(), duration);
    }

    /**
     * Sets the type of animation that will be used for
     * <br>transitions in &#64;revealer.
     * <br>
     * <br>Available types include various kinds of fades and slides.
     * @param transition the new transition type
    */
    public void setTransitionType(int transition)  {
        JnaRevealer.INST().gtk_revealer_set_transition_type(asCPointer(), transition);
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
        return JnaRevealer.INST().gtk_revealer_get_type(); 
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
