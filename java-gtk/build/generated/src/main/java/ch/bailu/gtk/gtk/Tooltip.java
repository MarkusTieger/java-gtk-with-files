/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkTooltip` is an object representing a widget tooltip.
 * <br>
 * <br>Basic tooltips can be realized simply by using
 * <br>[method&#64;Gtk.Widget.set_tooltip_text] or
 * <br>[method&#64;Gtk.Widget.set_tooltip_markup] without
 * <br>any explicit tooltip object.
 * <br>
 * <br>When you need a tooltip with a little more fancy contents,
 * <br>like adding an image, or you want the tooltip to have different
 * <br>contents per `GtkTreeView` row or cell, you will have to do a
 * <br>little more work:
 * <br>
 * <br>- Set the [property&#64;Gtk.Widget:has-tooltip] property to %TRUE.
 * <br>  This will make GTK monitor the widget for motion and related events
 * <br>  which are needed to determine when and where to show a tooltip.
 * <br>
 * <br>- Connect to the [signal&#64;Gtk.Widget::query-tooltip] signal.
 * <br>  This signal will be emitted when a tooltip is supposed to be shown.
 * <br>  One of the arguments passed to the signal handler is a `GtkTooltip`
 * <br>  object. This is the object that we are about to display as a tooltip,
 * <br>  and can be manipulated in your callback using functions like
 * <br>  [method&#64;Gtk.Tooltip.set_icon]. There are functions for setting
 * <br>  the tooltip’s markup, setting an image from a named icon, or even
 * <br>  putting in a custom widget.
 * <br>
 * <br>- Return %TRUE from your ::query-tooltip handler. This causes the tooltip
 * <br>  to be show. If you return %FALSE, it will not be shown.
 * <p><a href="https://docs.gtk.org/gtk4/class.Tooltip.html">https://docs.gtk.org/gtk4/class.Tooltip.html</a></p>
*/
public class Tooltip extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Tooltip.class.getCanonicalName());
    }

    public Tooltip(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Replaces the widget packed into the tooltip with
     * <br>&#64;custom_widget. &#64;custom_widget does not get destroyed when the tooltip goes
     * <br>away.
     * <br>By default a box with a `GtkImage` and `GtkLabel` is embedded in
     * <br>the tooltip, which can be configured using gtk_tooltip_set_markup()
     * <br>and gtk_tooltip_set_icon().
     * @param custom_widget a `GtkWidget`, or %NULL to unset the old custom widget.
    */
    public void setCustom(@Nullable Widget custom_widget)  {
        JnaTooltip.INST().gtk_tooltip_set_custom(asCPointer(), asCPointer(custom_widget));
    }

    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * <br>&#64;paintable.  If &#64;paintable is %NULL, the image will be hidden.
     * @param paintable a `GdkPaintable`
    */
    public void setIcon(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaTooltip.INST().gtk_tooltip_set_icon(asCPointer(), asCPointer(paintable));
    }

    /**
     * Sets the icon of the tooltip (which is in front of the text)
     * <br>to be the icon indicated by &#64;gicon with the size indicated
     * <br>by &#64;size. If &#64;gicon is %NULL, the image will be hidden.
     * @param gicon a `GIcon` representing the icon
    */
    public void setIconFromGicon(@Nullable ch.bailu.gtk.gio.Icon gicon)  {
        JnaTooltip.INST().gtk_tooltip_set_icon_from_gicon(asCPointer(), asCPointer(gicon));
    }

    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * <br>the icon indicated by &#64;icon_name with the size indicated
     * <br>by &#64;size.  If &#64;icon_name is %NULL, the image will be hidden.
     * @param icon_name an icon name
    */
    public void setIconFromIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaTooltip.INST().gtk_tooltip_set_icon_from_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * <br>the icon indicated by &#64;icon_name with the size indicated
     * <br>by &#64;size.  If &#64;icon_name is %NULL, the image will be hidden.
     * @param icon_name an icon name
    */
    public void setIconFromIconName(String icon_name)  {
        JnaTooltip.INST().gtk_tooltip_set_icon_from_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the text of the tooltip to be &#64;markup.
     * <br>
     * <br>The string must be marked up with Pango markup.
     * <br>If &#64;markup is %NULL, the label will be hidden.
     * @param markup a string with Pango markup or %NLL
    */
    public void setMarkup(@Nullable ch.bailu.gtk.type.Str markup)  {
        JnaTooltip.INST().gtk_tooltip_set_markup(asCPointer(), asCPointer(markup));
    }

    /**
     * Sets the text of the tooltip to be &#64;markup.
     * <br>
     * <br>The string must be marked up with Pango markup.
     * <br>If &#64;markup is %NULL, the label will be hidden.
     * @param markup a string with Pango markup or %NLL
    */
    public void setMarkup(String markup)  {
        JnaTooltip.INST().gtk_tooltip_set_markup(asCPointer(), markup);
    }

    /**
     * Sets the text of the tooltip to be &#64;text.
     * <br>
     * <br>If &#64;text is %NULL, the label will be hidden.
     * <br>See also [method&#64;Gtk.Tooltip.set_markup].
     * @param text a text string
    */
    public void setText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaTooltip.INST().gtk_tooltip_set_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets the text of the tooltip to be &#64;text.
     * <br>
     * <br>If &#64;text is %NULL, the label will be hidden.
     * <br>See also [method&#64;Gtk.Tooltip.set_markup].
     * @param text a text string
    */
    public void setText(String text)  {
        JnaTooltip.INST().gtk_tooltip_set_text(asCPointer(), text);
    }

    /**
     * Sets the area of the widget, where the contents of this tooltip apply,
     * <br>to be &#64;rect (in widget coordinates).  This is especially useful for
     * <br>properly setting tooltips on `GtkTreeView` rows and cells, `GtkIconViews`,
     * <br>etc.
     * <br>
     * <br>For setting tooltips on `GtkTreeView`, please refer to the convenience
     * <br>functions for this: gtk_tree_view_set_tooltip_row() and
     * <br>gtk_tree_view_set_tooltip_cell().
     * @param rect a `GdkRectangle`
    */
    public void setTipArea(@Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        JnaTooltip.INST().gtk_tooltip_set_tip_area(asCPointer(), asCPointerNotNull(rect));
    }

    public static long getTypeID() { 
        return JnaTooltip.INST().gtk_tooltip_get_type(); 
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
