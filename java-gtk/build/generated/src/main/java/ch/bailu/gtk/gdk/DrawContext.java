/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base class for objects implementing different rendering methods.
 * <br>
 * <br>`GdkDrawContext` is the base object used by contexts implementing different
 * <br>rendering methods, such as [class&#64;Gdk.CairoContext] or [class&#64;Gdk.GLContext].
 * <br>It provides shared functionality between those contexts.
 * <br>
 * <br>You will always interact with one of those subclasses.
 * <br>
 * <br>A `GdkDrawContext` is always associated with a single toplevel surface.
 * <p><a href="https://docs.gtk.org/gdk4/class.DrawContext.html">https://docs.gtk.org/gdk4/class.DrawContext.html</a></p>
*/
public class DrawContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DrawContext.class.getCanonicalName());
    }

    public DrawContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Indicates that you are beginning the process of redrawing &#64;region
     * <br>on the &#64;context's surface.
     * <br>
     * <br>Calling this function begins a drawing operation using &#64;context on the
     * <br>surface that &#64;context was created from. The actual requirements and
     * <br>guarantees for the drawing operation vary for different implementations
     * <br>of drawing, so a [class&#64;Gdk.CairoContext] and a [class&#64;Gdk.GLContext]
     * <br>need to be treated differently.
     * <br>
     * <br>A call to this function is a requirement for drawing and must be
     * <br>followed by a call to [method&#64;Gdk.DrawContext.end_frame], which will
     * <br>complete the drawing operation and ensure the contents become visible
     * <br>on screen.
     * <br>
     * <br>Note that the &#64;region passed to this function is the minimum region that
     * <br>needs to be drawn and depending on implementation, windowing system and
     * <br>hardware in use, it might be necessary to draw a larger region. Drawing
     * <br>implementation must use [method&#64;Gdk.DrawContext.get_frame_region] to
     * <br>query the region that must be drawn.
     * <br>
     * <br>When using GTK, the widget system automatically places calls to
     * <br>gdk_draw_context_begin_frame() and gdk_draw_context_end_frame() via the
     * <br>use of [class&#64;Gsk.Renderer]s, so application code does not need to call
     * <br>these functions explicitly.
     * @param region minimum region that should be drawn
    */
    public void beginFrame(@Nonnull ch.bailu.gtk.cairo.Region region)  {
        JnaDrawContext.INST().gdk_draw_context_begin_frame(asCPointer(), asCPointerNotNull(region));
    }

    /**
     * Ends a drawing operation started with gdk_draw_context_begin_frame().
     * <br>
     * <br>This makes the drawing available on screen.
     * <br>See [method&#64;Gdk.DrawContext.begin_frame] for more details about drawing.
     * <br>
     * <br>When using a [class&#64;Gdk.GLContext], this function may call `glFlush()`
     * <br>implicitly before returning; it is not recommended to call `glFlush()`
     * <br>explicitly before calling this function.
    */
    public void endFrame()  {
        JnaDrawContext.INST().gdk_draw_context_end_frame(asCPointer());
    }

    /**
     * Retrieves the `GdkDisplay` the &#64;context is created for
     * @return the `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaDrawContext.INST().gdk_draw_context_get_display(asCPointer())));
    }

    /**
     * Retrieves the region that is currently being repainted.
     * <br>
     * <br>After a call to [method&#64;Gdk.DrawContext.begin_frame] this function will
     * <br>return a union of the region passed to that function and the area of the
     * <br>surface that the &#64;context determined needs to be repainted.
     * <br>
     * <br>If &#64;context is not in between calls to [method&#64;Gdk.DrawContext.begin_frame]
     * <br>and [method&#64;Gdk.DrawContext.end_frame], %NULL will be returned.
     * @return a Cairo region
    */
    public ch.bailu.gtk.cairo.Region getFrameRegion()  {
        return new ch.bailu.gtk.cairo.Region(new PointerContainer(JnaDrawContext.INST().gdk_draw_context_get_frame_region(asCPointer())));
    }

    /**
     * Retrieves the surface that &#64;context is bound to.
     * @return a `GdkSurface`
    */
    public Surface getSurface()  {
        return new Surface(new PointerContainer(JnaDrawContext.INST().gdk_draw_context_get_surface(asCPointer())));
    }

    /**
     * Returns %TRUE if &#64;context is in the process of drawing to its surface.
     * <br>
     * <br>This is the case between calls to [method&#64;Gdk.DrawContext.begin_frame]
     * <br>and [method&#64;Gdk.DrawContext.end_frame]. In this situation, drawing commands
     * <br>may be effecting the contents of the &#64;context's surface.
     * @return %TRUE if the context is between [method&#64;Gdk.DrawContext.begin_frame]   and [method&#64;Gdk.DrawContext.end_frame] calls.
    */
    public boolean isInFrame()  {
        return JnaDrawContext.INST().gdk_draw_context_is_in_frame(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDrawContext.INST().gdk_draw_context_get_type(); 
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
