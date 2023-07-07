/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkScrollbar` widget is a horizontal or vertical scrollbar.
 * <br>
 * <br>![An example GtkScrollbar](scrollbar.png)
 * <br>
 * <br>Its position and movement are controlled by the adjustment that is passed to
 * <br>or created by [ctor&#64;Gtk.Scrollbar.new]. See [class&#64;Gtk.Adjustment] for more
 * <br>details. The [property&#64;Gtk.Adjustment:value] field sets the position of the
 * <br>thumb and must be between [property&#64;Gtk.Adjustment:lower] and
 * <br>[property&#64;Gtk.Adjustment:upper] - [property&#64;Gtk.Adjustment:page-size].
 * <br>The [property&#64;Gtk.Adjustment:page-size] represents the size of the visible
 * <br>scrollable area.
 * <br>
 * <br>The fields [property&#64;Gtk.Adjustment:step-increment] and
 * <br>[property&#64;Gtk.Adjustment:page-increment] fields are added to or subtracted
 * <br>from the [property&#64;Gtk.Adjustment:value] when the user asks to move by a step
 * <br>(using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * <br>keys).
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>scrollbar
 * <br>╰── range[.fine-tune]
 * <br>    ╰── trough
 * <br>        ╰── slider
 * <br>```
 * <br>
 * <br>`GtkScrollbar` has a main CSS node with name scrollbar and a subnode for its
 * <br>contents. The main node gets the .horizontal or .vertical style classes applied,
 * <br>depending on the scrollbar's orientation.
 * <br>
 * <br>The range node gets the style class .fine-tune added when the scrollbar is
 * <br>in 'fine-tuning' mode.
 * <br>
 * <br>Other style classes that may be added to scrollbars inside
 * <br>[class&#64;Gtk.ScrolledWindow] include the positional classes (.left, .right,
 * <br>.top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * <br>.dragging, .hovering).
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkScrollbar` uses the %GTK_ACCESSIBLE_ROLE_SCROLLBAR role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Scrollbar.html">https://docs.gtk.org/gtk4/class.Scrollbar.html</a></p>
*/
public class Scrollbar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Scrollbar.class.getCanonicalName());
    }

    public Scrollbar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new scrollbar with the given orientation.
     * @param orientation the scrollbar’s orientation.
     * @param adjustment the [class&#64;Gtk.Adjustment] to use, or %NULL   to create a new adjustment.
    */
    public Scrollbar(int orientation, @Nullable Adjustment adjustment) {
        super(cast(JnaScrollbar.INST().gtk_scrollbar_new(orientation, asCPointer(adjustment))));
    }

    /**
     * Returns the scrollbar's adjustment.
     * @return the scrollbar's adjustment
    */
    public Adjustment getAdjustment()  {
        return new Adjustment(new PointerContainer(JnaScrollbar.INST().gtk_scrollbar_get_adjustment(asCPointer())));
    }

    /**
     * Makes the scrollbar use the given adjustment.
     * @param adjustment the adjustment to set
    */
    public void setAdjustment(@Nullable Adjustment adjustment)  {
        JnaScrollbar.INST().gtk_scrollbar_set_adjustment(asCPointer(), asCPointer(adjustment));
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
        return JnaScrollbar.INST().gtk_scrollbar_get_type(); 
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
