/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDrawingArea` is a widget that allows drawing with cairo.
 * <br>
 * <br>![An example GtkDrawingArea](drawingarea.png)
 * <br>
 * <br>It’s essentially a blank widget; you can draw on it. After
 * <br>creating a drawing area, the application may want to connect to:
 * <br>
 * <br>- The [signal&#64;Gtk.Widget::realize] signal to take any necessary actions
 * <br>  when the widget is instantiated on a particular display.
 * <br>  (Create GDK resources in response to this signal.)
 * <br>
 * <br>- The [signal&#64;Gtk.DrawingArea::resize] signal to take any necessary
 * <br>  actions when the widget changes size.
 * <br>
 * <br>- Call [method&#64;Gtk.DrawingArea.set_draw_func] to handle redrawing the
 * <br>  contents of the widget.
 * <br>
 * <br>The following code portion demonstrates using a drawing
 * <br>area to display a circle in the normal widget foreground
 * <br>color.
 * <br>
 * <br>&#35;&#35; Simple GtkDrawingArea usage
 * <br>
 * <br>```c
 * <br>static void
 * <br>draw_function (GtkDrawingArea *area,
 * <br>               cairo_t        *cr,
 * <br>               int             width,
 * <br>               int             height,
 * <br>               gpointer        data)
 * <br>{
 * <br>  GdkRGBA color;
 * <br>  GtkStyleContext *context;
 * <br>
 * <br>  context = gtk_widget_get_style_context (GTK_WIDGET (area));
 * <br>
 * <br>  cairo_arc (cr,
 * <br>             width / 2.0, height / 2.0,
 * <br>             MIN (width, height) / 2.0,
 * <br>             0, 2 * G_PI);
 * <br>
 * <br>  gtk_style_context_get_color (context,
 * <br>                               &amp;color);
 * <br>  gdk_cairo_set_source_rgba (cr, &amp;color);
 * <br>
 * <br>  cairo_fill (cr);
 * <br>}
 * <br>
 * <br>int
 * <br>main (int argc, char **argv)
 * <br>{
 * <br>  gtk_init ();
 * <br>
 * <br>  GtkWidget *area = gtk_drawing_area_new ();
 * <br>  gtk_drawing_area_set_content_width (GTK_DRAWING_AREA (area), 100);
 * <br>  gtk_drawing_area_set_content_height (GTK_DRAWING_AREA (area), 100);
 * <br>  gtk_drawing_area_set_draw_func (GTK_DRAWING_AREA (area),
 * <br>                                  draw_function,
 * <br>                                  NULL, NULL);
 * <br>  return 0;
 * <br>}
 * <br>```
 * <br>
 * <br>The draw function is normally called when a drawing area first comes
 * <br>onscreen, or when it’s covered by another window and then uncovered.
 * <br>You can also force a redraw by adding to the “damage region” of the
 * <br>drawing area’s window using [method&#64;Gtk.Widget.queue_draw].
 * <br>This will cause the drawing area to call the draw function again.
 * <br>
 * <br>The available routines for drawing are documented in the
 * <br>[Cairo documentation](https://www.cairographics.org/manual/); GDK
 * <br>offers additional API to integrate with Cairo, like [func&#64;Gdk.cairo_set_source_rgba]
 * <br>or [func&#64;Gdk.cairo_set_source_pixbuf].
 * <br>
 * <br>To receive mouse events on a drawing area, you will need to use
 * <br>event controllers. To receive keyboard events, you will need to set
 * <br>the “can-focus” property on the drawing area, and you should probably
 * <br>draw some user-visible indication that the drawing area is focused.
 * <br>
 * <br>If you need more complex control over your widget, you should consider
 * <br>creating your own `GtkWidget` subclass.
 * <p><a href="https://docs.gtk.org/gtk4/class.DrawingArea.html">https://docs.gtk.org/gtk4/class.DrawingArea.html</a></p>
*/
public class DrawingArea extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DrawingArea.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDrawingAreaDrawFunc {
        /**
         * Whenever &#64;drawing_area needs to redraw, this function will be called.
         * <br>
         * <br>This function should exclusively redraw the contents of the drawing area
         * <br>and must not call any widget functions that cause changes.
         * @param drawing_area the `GtkDrawingArea` to redraw
         * @param cr the context to draw to
         * @param width the actual width of the contents. This value will be at least   as wide as GtkDrawingArea:width.
         * @param height the actual height of the contents. This value will be at least   as wide as GtkDrawingArea:height.
         * @param user_data user data
        */
        void onDrawingAreaDrawFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DrawingArea drawing_area, @Nonnull ch.bailu.gtk.cairo.Context cr, int width, int height, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDrawingArea.OnDrawingAreaDrawFunc toOnDrawingAreaDrawFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawingAreaDrawFunc in) {
        JnaDrawingArea.OnDrawingAreaDrawFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drawing_area, _cr, _width, _height, _user_data) -> in.onDrawingAreaDrawFunc(__callback, new DrawingArea(new PointerContainer(_drawing_area)), new ch.bailu.gtk.cairo.Context(new PointerContainer(_cr)), _width, _height, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaDrawingArea.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaDrawingArea.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnResize {
        /**
         * Emitted once when the widget is realized, and then each time the widget
         * <br>is changed while realized.
         * <br>
         * <br>This is useful in order to keep state up to date with the widget size,
         * <br>like for instance a backing surface.
         * @param width the width of the viewport
         * @param height the height of the viewport
        */
        void onResize(int width, int height);
    }
    
    private static com.sun.jna.Callback toOnResize(OnResize in) {
        return (in == null) ? null: (JnaDrawingArea.OnResize) (__self, _width, _height, __data) -> in.onResize(_width, _height);
    }

    public DrawingArea(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new drawing area.
    */
    public DrawingArea() {
        super(cast(JnaDrawingArea.INST().gtk_drawing_area_new()));
    }

    /**
     * Retrieves the content height of the `GtkDrawingArea`.
     * @return The height requested for content of the drawing area
    */
    public int getContentHeight()  {
        return JnaDrawingArea.INST().gtk_drawing_area_get_content_height(asCPointer());
    }

    /**
     * Retrieves the content width of the `GtkDrawingArea`.
     * @return The width requested for content of the drawing area
    */
    public int getContentWidth()  {
        return JnaDrawingArea.INST().gtk_drawing_area_get_content_width(asCPointer());
    }

    /**
     * Sets the desired height of the contents of the drawing area.
     * <br>
     * <br>Note that because widgets may be allocated larger sizes than they
     * <br>requested, it is possible that the actual height passed to your draw
     * <br>function is larger than the height set here. You can use
     * <br>[method&#64;Gtk.Widget.set_valign] to avoid that.
     * <br>
     * <br>If the height is set to 0 (the default), the drawing area may disappear.
     * @param height the height of contents
    */
    public void setContentHeight(int height)  {
        JnaDrawingArea.INST().gtk_drawing_area_set_content_height(asCPointer(), height);
    }

    /**
     * Sets the desired width of the contents of the drawing area.
     * <br>
     * <br>Note that because widgets may be allocated larger sizes than they
     * <br>requested, it is possible that the actual width passed to your draw
     * <br>function is larger than the width set here. You can use
     * <br>[method&#64;Gtk.Widget.set_halign] to avoid that.
     * <br>
     * <br>If the width is set to 0 (the default), the drawing area may disappear.
     * @param width the width of contents
    */
    public void setContentWidth(int width)  {
        JnaDrawingArea.INST().gtk_drawing_area_set_content_width(asCPointer(), width);
    }

    /**
     * Setting a draw function is the main thing you want to do when using
     * <br>a drawing area.
     * <br>
     * <br>The draw function is called whenever GTK needs to draw the contents
     * <br>of the drawing area to the screen.
     * <br>
     * <br>The draw function will be called during the drawing stage of GTK.
     * <br>In the drawing stage it is not allowed to change properties of any
     * <br>GTK widgets or call any functions that would cause any properties
     * <br>to be changed. You should restrict yourself exclusively to drawing
     * <br>your contents in the draw function.
     * <br>
     * <br>If what you are drawing does change, call [method&#64;Gtk.Widget.queue_draw]
     * <br>on the drawing area. This will cause a redraw and will call &#64;draw_func again.
     * @param draw_func callback that lets you draw   the drawing area's contents
     * @param user_data user data passed to &#64;draw_func
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setDrawFunc(OnDrawingAreaDrawFunc draw_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaDrawingArea.INST().gtk_drawing_area_set_draw_func(asCPointer(), toOnDrawingAreaDrawFunc(this, "setDrawFunc", draw_func), asCPointer(user_data), toOnDestroyNotify(this, "setDrawFunc", destroy));
    }

    public final static String SIGNAL_ON_RESIZE = "resize";
    
    /**
     * Connect to signal "resize".
     * <br>See {@link OnResize#onResize} for signal description.
     * <br>Field {@link #SIGNAL_ON_RESIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onResize(OnResize signal) {
        return connectSignal(SIGNAL_ON_RESIZE, toOnResize(signal));
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
        return JnaDrawingArea.INST().gtk_drawing_area_get_type(); 
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
