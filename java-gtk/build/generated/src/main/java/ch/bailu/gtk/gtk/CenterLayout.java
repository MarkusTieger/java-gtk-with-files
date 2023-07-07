/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCenterLayout` is a layout manager that manages up to three children.
 * <br>
 * <br>The start widget is allocated at the start of the layout (left in
 * <br>left-to-right locales and right in right-to-left ones), and the end
 * <br>widget at the end.
 * <br>
 * <br>The center widget is centered regarding the full width of the layout's.
 * <p><a href="https://docs.gtk.org/gtk4/class.CenterLayout.html">https://docs.gtk.org/gtk4/class.CenterLayout.html</a></p>
*/
public class CenterLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CenterLayout.class.getCanonicalName());
    }

    public CenterLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCenterLayout`.
    */
    public CenterLayout() {
        super(cast(JnaCenterLayout.INST().gtk_center_layout_new()));
    }

    /**
     * Returns the baseline position of the layout.
     * @return The current baseline position of &#64;self.
    */
    public int getBaselinePosition()  {
        return JnaCenterLayout.INST().gtk_center_layout_get_baseline_position(asCPointer());
    }

    /**
     * Returns the center widget of the layout.
     * @return the current center widget of &#64;self
    */
    public Widget getCenterWidget()  {
        return new Widget(new PointerContainer(JnaCenterLayout.INST().gtk_center_layout_get_center_widget(asCPointer())));
    }

    /**
     * Returns the end widget of the layout.
     * @return the current end widget of &#64;self
    */
    public Widget getEndWidget()  {
        return new Widget(new PointerContainer(JnaCenterLayout.INST().gtk_center_layout_get_end_widget(asCPointer())));
    }

    /**
     * Gets the current orienration of the layout manager.
     * @return The current orientation of &#64;self
    */
    public int getOrientation()  {
        return JnaCenterLayout.INST().gtk_center_layout_get_orientation(asCPointer());
    }

    /**
     * Returns the start widget fo the layout.
     * @return The current start widget of &#64;self
    */
    public Widget getStartWidget()  {
        return new Widget(new PointerContainer(JnaCenterLayout.INST().gtk_center_layout_get_start_widget(asCPointer())));
    }

    /**
     * Sets the new baseline position of &#64;self
     * @param baseline_position the new baseline position
    */
    public void setBaselinePosition(int baseline_position)  {
        JnaCenterLayout.INST().gtk_center_layout_set_baseline_position(asCPointer(), baseline_position);
    }

    /**
     * Sets the new center widget of &#64;self.
     * <br>
     * <br>To remove the existing center widget, pass %NULL.
     * @param widget the new center widget
    */
    public void setCenterWidget(@Nullable Widget widget)  {
        JnaCenterLayout.INST().gtk_center_layout_set_center_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets the new end widget of &#64;self.
     * <br>
     * <br>To remove the existing center widget, pass %NULL.
     * @param widget the new end widget
    */
    public void setEndWidget(@Nullable Widget widget)  {
        JnaCenterLayout.INST().gtk_center_layout_set_end_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets the orientation of &#64;self.
     * @param orientation the new orientation
    */
    public void setOrientation(int orientation)  {
        JnaCenterLayout.INST().gtk_center_layout_set_orientation(asCPointer(), orientation);
    }

    /**
     * Sets the new start widget of &#64;self.
     * <br>
     * <br>To remove the existing start widget, pass %NULL.
     * @param widget the new start widget
    */
    public void setStartWidget(@Nullable Widget widget)  {
        JnaCenterLayout.INST().gtk_center_layout_set_start_widget(asCPointer(), asCPointer(widget));
    }

    public static long getTypeID() { 
        return JnaCenterLayout.INST().gtk_center_layout_get_type(); 
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
