/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkProgressBar` is typically used to display the progress of a long
 * <br>running operation.
 * <br>
 * <br>It provides a visual clue that processing is underway. `GtkProgressBar`
 * <br>can be used in two different modes: percentage mode and activity mode.
 * <br>
 * <br>![An example GtkProgressBar](progressbar.png)
 * <br>
 * <br>When an application can determine how much work needs to take place
 * <br>(e.g. read a fixed number of bytes from a file) and can monitor its
 * <br>progress, it can use the `GtkProgressBar` in percentage mode and the
 * <br>user sees a growing bar indicating the percentage of the work that
 * <br>has been completed. In this mode, the application is required to call
 * <br>[method&#64;Gtk.ProgressBar.set_fraction] periodically to update the progress bar.
 * <br>
 * <br>When an application has no accurate way of knowing the amount of work
 * <br>to do, it can use the `GtkProgressBar` in activity mode, which shows
 * <br>activity by a block moving back and forth within the progress area. In
 * <br>this mode, the application is required to call [method&#64;Gtk.ProgressBar.pulse]
 * <br>periodically to update the progress bar.
 * <br>
 * <br>There is quite a bit of flexibility provided to control the appearance
 * <br>of the `GtkProgressBar`. Functions are provided to control the orientation
 * <br>of the bar, optional text can be displayed along with the bar, and the
 * <br>step size used in activity mode can be set.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>progressbar[.osd]
 * <br>├── [text]
 * <br>╰── trough[.empty][.full]
 * <br>    ╰── progress[.pulse]
 * <br>```
 * <br>
 * <br>`GtkProgressBar` has a main CSS node with name progressbar and subnodes with
 * <br>names text and trough, of which the latter has a subnode named progress. The
 * <br>text subnode is only present if text is shown. The progress subnode has the
 * <br>style class .pulse when in activity mode. It gets the style classes .left,
 * <br>.right, .top or .bottom added when the progress 'touches' the corresponding
 * <br>end of the GtkProgressBar. The .osd class on the progressbar node is for use
 * <br>in overlays like the one Epiphany has for page loading progress.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkProgressBar` uses the %GTK_ACCESSIBLE_ROLE_PROGRESS_BAR role.
 * <p><a href="https://docs.gtk.org/gtk4/class.ProgressBar.html">https://docs.gtk.org/gtk4/class.ProgressBar.html</a></p>
*/
public class ProgressBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProgressBar.class.getCanonicalName());
    }

    public ProgressBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkProgressBar`.
    */
    public ProgressBar() {
        super(cast(JnaProgressBar.INST().gtk_progress_bar_new()));
    }

    /**
     * Returns the ellipsizing position of the progress bar.
     * <br>
     * <br>See [method&#64;Gtk.ProgressBar.set_ellipsize].
     * @return `PangoEllipsizeMode`
    */
    public int getEllipsize()  {
        return JnaProgressBar.INST().gtk_progress_bar_get_ellipsize(asCPointer());
    }

    /**
     * Returns the current fraction of the task that’s been completed.
     * @return a fraction from 0.0 to 1.0
    */
    public double getFraction()  {
        return JnaProgressBar.INST().gtk_progress_bar_get_fraction(asCPointer());
    }

    /**
     * Returns whether the progress bar is inverted.
     * @return %TRUE if the progress bar is inverted
    */
    public boolean getInverted()  {
        return JnaProgressBar.INST().gtk_progress_bar_get_inverted(asCPointer());
    }

    /**
     * Retrieves the pulse step.
     * <br>
     * <br>See [method&#64;Gtk.ProgressBar.set_pulse_step].
     * @return a fraction from 0.0 to 1.0
    */
    public double getPulseStep()  {
        return JnaProgressBar.INST().gtk_progress_bar_get_pulse_step(asCPointer());
    }

    /**
     * Returns whether the `GtkProgressBar` shows text.
     * <br>
     * <br>See [method&#64;Gtk.ProgressBar.set_show_text].
     * @return %TRUE if text is shown in the progress bar
    */
    public boolean getShowText()  {
        return JnaProgressBar.INST().gtk_progress_bar_get_show_text(asCPointer());
    }

    /**
     * Retrieves the text that is displayed with the progress bar.
     * <br>
     * <br>The return value is a reference to the text, not a copy of it,
     * <br>so will become invalid if you change the text in the progress bar.
     * @return the text
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProgressBar.INST().gtk_progress_bar_get_text(asCPointer())));
    }

    /**
     * Indicates that some progress has been made, but you don’t know how much.
     * <br>
     * <br>Causes the progress bar to enter “activity mode,” where a block
     * <br>bounces back and forth. Each call to [method&#64;Gtk.ProgressBar.pulse]
     * <br>causes the block to move by a little bit (the amount of movement
     * <br>per pulse is determined by [method&#64;Gtk.ProgressBar.set_pulse_step]).
    */
    public void pulse()  {
        JnaProgressBar.INST().gtk_progress_bar_pulse(asCPointer());
    }

    /**
     * Sets the mode used to ellipsize the text.
     * <br>
     * <br>The text is ellipsized if there is not enough space
     * <br>to render the entire string.
     * @param mode a `PangoEllipsizeMode`
    */
    public void setEllipsize(int mode)  {
        JnaProgressBar.INST().gtk_progress_bar_set_ellipsize(asCPointer(), mode);
    }

    /**
     * Causes the progress bar to “fill in” the given fraction
     * <br>of the bar.
     * <br>
     * <br>The fraction should be between 0.0 and 1.0, inclusive.
     * @param fraction fraction of the task that’s been completed
    */
    public void setFraction(double fraction)  {
        JnaProgressBar.INST().gtk_progress_bar_set_fraction(asCPointer(), fraction);
    }

    /**
     * Sets whether the progress bar is inverted.
     * <br>
     * <br>Progress bars normally grow from top to bottom or left to right.
     * <br>Inverted progress bars grow in the opposite direction.
     * @param inverted %TRUE to invert the progress bar
    */
    public void setInverted(boolean inverted)  {
        JnaProgressBar.INST().gtk_progress_bar_set_inverted(asCPointer(), inverted);
    }

    /**
     * Sets the fraction of total progress bar length to move the
     * <br>bouncing block.
     * <br>
     * <br>The bouncing block is moved when [method&#64;Gtk.ProgressBar.pulse]
     * <br>is called.
     * @param fraction fraction between 0.0 and 1.0
    */
    public void setPulseStep(double fraction)  {
        JnaProgressBar.INST().gtk_progress_bar_set_pulse_step(asCPointer(), fraction);
    }

    /**
     * Sets whether the progress bar will show text next to the bar.
     * <br>
     * <br>The shown text is either the value of the [property&#64;Gtk.ProgressBar:text]
     * <br>property or, if that is %NULL, the [property&#64;Gtk.ProgressBar:fraction] value,
     * <br>as a percentage.
     * <br>
     * <br>To make a progress bar that is styled and sized suitably for containing
     * <br>text (even if the actual text is blank), set [property&#64;Gtk.ProgressBar:show-text]
     * <br>to %TRUE and [property&#64;Gtk.ProgressBar:text] to the empty string (not %NULL).
     * @param show_text whether to show text
    */
    public void setShowText(boolean show_text)  {
        JnaProgressBar.INST().gtk_progress_bar_set_show_text(asCPointer(), show_text);
    }

    /**
     * Causes the given &#64;text to appear next to the progress bar.
     * <br>
     * <br>If &#64;text is %NULL and [property&#64;Gtk.ProgressBar:show-text] is %TRUE,
     * <br>the current value of [property&#64;Gtk.ProgressBar:fraction] will be displayed
     * <br>as a percentage.
     * <br>
     * <br>If &#64;text is non-%NULL and [property&#64;Gtk.ProgressBar:show-text] is %TRUE,
     * <br>the text will be displayed. In this case, it will not display the progress
     * <br>percentage. If &#64;text is the empty string, the progress bar will still
     * <br>be styled and sized suitably for containing text, as long as
     * <br>[property&#64;Gtk.ProgressBar:show-text] is %TRUE.
     * @param text a UTF-8 string
    */
    public void setText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaProgressBar.INST().gtk_progress_bar_set_text(asCPointer(), asCPointer(text));
    }

    /**
     * Causes the given &#64;text to appear next to the progress bar.
     * <br>
     * <br>If &#64;text is %NULL and [property&#64;Gtk.ProgressBar:show-text] is %TRUE,
     * <br>the current value of [property&#64;Gtk.ProgressBar:fraction] will be displayed
     * <br>as a percentage.
     * <br>
     * <br>If &#64;text is non-%NULL and [property&#64;Gtk.ProgressBar:show-text] is %TRUE,
     * <br>the text will be displayed. In this case, it will not display the progress
     * <br>percentage. If &#64;text is the empty string, the progress bar will still
     * <br>be styled and sized suitably for containing text, as long as
     * <br>[property&#64;Gtk.ProgressBar:show-text] is %TRUE.
     * @param text a UTF-8 string
    */
    public void setText(String text)  {
        JnaProgressBar.INST().gtk_progress_bar_set_text(asCPointer(), text);
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

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaProgressBar.INST().gtk_progress_bar_get_type(); 
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
