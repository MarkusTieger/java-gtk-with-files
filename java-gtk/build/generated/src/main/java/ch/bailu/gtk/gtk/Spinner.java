/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkSpinner` widget displays an icon-size spinning animation.
 * <br>
 * <br>It is often used as an alternative to a [class&#64;Gtk.ProgressBar]
 * <br>for displaying indefinite activity, instead of actual progress.
 * <br>
 * <br>![An example GtkSpinner](spinner.png)
 * <br>
 * <br>To start the animation, use [method&#64;Gtk.Spinner.start], to stop it
 * <br>use [method&#64;Gtk.Spinner.stop].
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkSpinner` has a single CSS node with the name spinner.
 * <br>When the animation is active, the :checked pseudoclass is
 * <br>added to this node.
 * <p><a href="https://docs.gtk.org/gtk4/class.Spinner.html">https://docs.gtk.org/gtk4/class.Spinner.html</a></p>
*/
public class Spinner extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Spinner.class.getCanonicalName());
    }

    public Spinner(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a new spinner widget. Not yet started.
    */
    public Spinner() {
        super(cast(JnaSpinner.INST().gtk_spinner_new()));
    }

    /**
     * Returns whether the spinner is spinning.
     * @return %TRUE if the spinner is active
    */
    public boolean getSpinning()  {
        return JnaSpinner.INST().gtk_spinner_get_spinning(asCPointer());
    }

    /**
     * Sets the activity of the spinner.
     * @param spinning whether the spinner should be spinning
    */
    public void setSpinning(boolean spinning)  {
        JnaSpinner.INST().gtk_spinner_set_spinning(asCPointer(), spinning);
    }

    /**
     * Starts the animation of the spinner.
    */
    public void start()  {
        JnaSpinner.INST().gtk_spinner_start(asCPointer());
    }

    /**
     * Stops the animation of the spinner.
    */
    public void stop()  {
        JnaSpinner.INST().gtk_spinner_stop(asCPointer());
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
        return JnaSpinner.INST().gtk_spinner_get_type(); 
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
