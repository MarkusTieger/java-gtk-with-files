/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkSurface` is a rectangular region on the screen.
 * <br>
 * <br>It’s a low-level object, used to implement high-level objects
 * <br>such as [class&#64;Gtk.Window] or [class&#64;Gtk.Dialog] in GTK.
 * <br>
 * <br>The surfaces you see in practice are either [iface&#64;Gdk.Toplevel] or
 * <br>[iface&#64;Gdk.Popup], and those interfaces provide much of the required
 * <br>API to interact with these surfaces. Other, more specialized surface
 * <br>types exist, but you will rarely interact with them directly.
 * <p><a href="https://docs.gtk.org/gdk4/class.Surface.html">https://docs.gtk.org/gdk4/class.Surface.html</a></p>
*/
public class Surface extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Surface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEnterMonitor {
        /**
         * Emitted when &#64;surface starts being present on the monitor.
         * @param monitor the monitor
        */
        void onEnterMonitor(@Nonnull Monitor monitor);
    }
    
    private static com.sun.jna.Callback toOnEnterMonitor(OnEnterMonitor in) {
        return (in == null) ? null: (JnaSurface.OnEnterMonitor) (__self, _monitor, __data) -> in.onEnterMonitor(new Monitor(new PointerContainer(_monitor)));
    }

    @FunctionalInterface
    public interface OnEvent {
        /**
         * Emitted when GDK receives an input event for &#64;surface.
         * @param event an input event
         * @return %TRUE to indicate that the event has been handled
        */
        boolean onEvent(@Nonnull ch.bailu.gtk.type.Pointer event);
    }
    
    private static com.sun.jna.Callback toOnEvent(OnEvent in) {
        return (in == null) ? null: (JnaSurface.OnEvent) (__self, _event, __data) -> in.onEvent(new ch.bailu.gtk.type.Pointer(new PointerContainer(_event)));
    }

    @FunctionalInterface
    public interface OnLayout {
        /**
         * Emitted when the size of &#64;surface is changed, or when relayout should
         * <br>be performed.
         * <br>
         * <br>Surface size is reported in ”application pixels”, not
         * <br>”device pixels” (see gdk_surface_get_scale_factor()).
         * @param width the current width
         * @param height the current height
        */
        void onLayout(int width, int height);
    }
    
    private static com.sun.jna.Callback toOnLayout(OnLayout in) {
        return (in == null) ? null: (JnaSurface.OnLayout) (__self, _width, _height, __data) -> in.onLayout(_width, _height);
    }

    @FunctionalInterface
    public interface OnLeaveMonitor {
        /**
         * Emitted when &#64;surface stops being present on the monitor.
         * @param monitor the monitor
        */
        void onLeaveMonitor(@Nonnull Monitor monitor);
    }
    
    private static com.sun.jna.Callback toOnLeaveMonitor(OnLeaveMonitor in) {
        return (in == null) ? null: (JnaSurface.OnLeaveMonitor) (__self, _monitor, __data) -> in.onLeaveMonitor(new Monitor(new PointerContainer(_monitor)));
    }

    @FunctionalInterface
    public interface OnRender {
        /**
         * Emitted when part of the surface needs to be redrawn.
         * @param region the region that needs to be redrawn
         * @return %TRUE to indicate that the signal has been handled
        */
        boolean onRender(@Nonnull ch.bailu.gtk.cairo.Region region);
    }
    
    private static com.sun.jna.Callback toOnRender(OnRender in) {
        return (in == null) ? null: (JnaSurface.OnRender) (__self, _region, __data) -> in.onRender(new ch.bailu.gtk.cairo.Region(new PointerContainer(_region)));
    }

    public Surface(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new popup surface.
     * <br>
     * <br>The surface will be attached to &#64;parent and can be positioned
     * <br>relative to it using [method&#64;Gdk.Popup.present].
     * @param parent the parent surface to attach the surface to
     * @param autohide whether to hide the surface on outside clicks
     * @return a new `GdkSurface`
    */
    public static Surface newPopupSurface(@Nonnull Surface parent, boolean autohide)  {
        PointerContainer __self = cast(JnaSurface.INST().gdk_surface_new_popup(asCPointerNotNull(parent), autohide));
        if (__self.isNull()) {
            throw new NullPointerException("Surface:newPopup");
        }
        return new Surface(__self);
    }        
    

    /**
     * Creates a new toplevel surface.
     * @param display the display to create the surface on
     * @return the new `GdkSurface`
    */
    public static Surface newToplevelSurface(@Nonnull Display display)  {
        PointerContainer __self = cast(JnaSurface.INST().gdk_surface_new_toplevel(asCPointerNotNull(display)));
        if (__self.isNull()) {
            throw new NullPointerException("Surface:newToplevel");
        }
        return new Surface(__self);
    }        
    

    /**
     * Emits a short beep associated to &#64;surface.
     * <br>
     * <br>If the display of &#64;surface does not support per-surface beeps,
     * <br>emits a short beep on the display just as [method&#64;Gdk.Display.beep].
    */
    public void beep()  {
        JnaSurface.INST().gdk_surface_beep(asCPointer());
    }

    /**
     * Creates a new `GdkCairoContext` for rendering on &#64;surface.
     * @return the newly created `GdkCairoContext`
    */
    public CairoContext createCairoContext()  {
        return new CairoContext(new PointerContainer(JnaSurface.INST().gdk_surface_create_cairo_context(asCPointer())));
    }

    /**
     * Creates a new `GdkGLContext` for the `GdkSurface`.
     * <br>
     * <br>The context is disconnected from any particular surface or surface.
     * <br>If the creation of the `GdkGLContext` failed, &#64;error will be set.
     * <br>Before using the returned `GdkGLContext`, you will need to
     * <br>call [method&#64;Gdk.GLContext.make_current] or [method&#64;Gdk.GLContext.realize].
     * @return the newly created `GdkGLContext`
    */
    public GLContext createGlContext() throws ch.bailu.gtk.type.exception.AllocationError {
        return new GLContext(new PointerContainer(JnaSurface.INST().gdk_surface_create_gl_context(asCPointer(), 0L)));
    }

    /**
     * Create a new Cairo surface that is as compatible as possible with the
     * <br>given &#64;surface.
     * <br>
     * <br>For example the new surface will have the same fallback resolution
     * <br>and font options as &#64;surface. Generally, the new surface will also
     * <br>use the same backend as &#64;surface, unless that is not possible for
     * <br>some reason. The type of the returned surface may be examined with
     * <br>cairo_surface_get_type().
     * <br>
     * <br>Initially the surface contents are all 0 (transparent if contents
     * <br>have transparency, black otherwise.)
     * <br>
     * <br>This function always returns a valid pointer, but it will return a
     * <br>pointer to a “nil” surface if &#64;other is already in an error state
     * <br>or any other error occurs.
     * @param content the content for the new surface
     * @param width width of the new surface
     * @param height height of the new surface
     * @return a pointer to the newly allocated surface. The caller   owns the surface and should call cairo_surface_destroy() when done   with it.
    */
    public ch.bailu.gtk.cairo.Surface createSimilarSurface(int content, int width, int height)  {
        return new ch.bailu.gtk.cairo.Surface(new PointerContainer(JnaSurface.INST().gdk_surface_create_similar_surface(asCPointer(), content, width, height)));
    }

    /**
     * Creates a new `GdkVulkanContext` for rendering on &#64;surface.
     * <br>
     * <br>If the creation of the `GdkVulkanContext` failed, &#64;error will be set.
     * @return the newly created `GdkVulkanContext`, or   %NULL on error
    */
    public VulkanContext createVulkanContext() throws ch.bailu.gtk.type.exception.AllocationError {
        return new VulkanContext(new PointerContainer(JnaSurface.INST().gdk_surface_create_vulkan_context(asCPointer(), 0L)));
    }

    /**
     * Destroys the window system resources associated with &#64;surface and
     * <br>decrements &#64;surface's reference count.
     * <br>
     * <br>The window system resources for all children of &#64;surface are also
     * <br>destroyed, but the children’s reference counts are not decremented.
     * <br>
     * <br>Note that a surface will not be destroyed automatically when its
     * <br>reference count reaches zero. You must call this function yourself
     * <br>before that happens.
    */
    public void destroy()  {
        JnaSurface.INST().gdk_surface_destroy(asCPointer());
    }

    /**
     * Retrieves a `GdkCursor` pointer for the cursor currently set on the
     * <br>`GdkSurface`.
     * <br>
     * <br>If the return value is %NULL then there is no custom cursor set on
     * <br>the surface, and it is using the cursor for its parent surface.
     * <br>
     * <br>Use [method&#64;Gdk.Surface.set_cursor] to unset the cursor of the surface.
     * @return a `GdkCursor`
    */
    public Cursor getCursor()  {
        return new Cursor(new PointerContainer(JnaSurface.INST().gdk_surface_get_cursor(asCPointer())));
    }

    /**
     * Retrieves a `GdkCursor` pointer for the &#64;device currently set on the
     * <br>specified `GdkSurface`.
     * <br>
     * <br>If the return value is %NULL then there is no custom cursor set on the
     * <br>specified surface, and it is using the cursor for its parent surface.
     * <br>
     * <br>Use [method&#64;Gdk.Surface.set_cursor] to unset the cursor of the surface.
     * @param device a pointer `GdkDevice`
     * @return a `GdkCursor`
    */
    public Cursor getDeviceCursor(@Nonnull Device device)  {
        return new Cursor(new PointerContainer(JnaSurface.INST().gdk_surface_get_device_cursor(asCPointer(), asCPointerNotNull(device))));
    }

    /**
     * Gets the `GdkDisplay` associated with a `GdkSurface`.
     * @return the `GdkDisplay` associated with &#64;surface
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaSurface.INST().gdk_surface_get_display(asCPointer())));
    }

    /**
     * Gets the frame clock for the surface.
     * <br>
     * <br>The frame clock for a surface never changes unless the surface is
     * <br>reparented to a new toplevel surface.
     * @return the frame clock
    */
    public FrameClock getFrameClock()  {
        return new FrameClock(new PointerContainer(JnaSurface.INST().gdk_surface_get_frame_clock(asCPointer())));
    }

    /**
     * Returns the height of the given &#64;surface.
     * <br>
     * <br>Surface size is reported in ”application pixels”, not
     * <br>”device pixels” (see [method&#64;Gdk.Surface.get_scale_factor]).
     * @return The height of &#64;surface
    */
    public int getHeight()  {
        return JnaSurface.INST().gdk_surface_get_height(asCPointer());
    }

    /**
     * Checks whether the surface has been mapped.
     * <br>
     * <br>A surface is mapped with [method&#64;Gdk.Toplevel.present]
     * <br>or [method&#64;Gdk.Popup.present].
     * @return %TRUE if the surface is mapped
    */
    public boolean getMapped()  {
        return JnaSurface.INST().gdk_surface_get_mapped(asCPointer());
    }

    /**
     * Returns the internal scale factor that maps from surface coordinates
     * <br>to the actual device pixels.
     * <br>
     * <br>On traditional systems this is 1, but on very high density outputs
     * <br>this can be a higher value (often 2). A higher value means that drawing
     * <br>is automatically scaled up to a higher resolution, so any code doing
     * <br>drawing will automatically look nicer. However, if you are supplying
     * <br>pixel-based data the scale value can be used to determine whether to
     * <br>use a pixel resource with higher resolution data.
     * <br>
     * <br>The scale of a surface may change during runtime.
     * @return the scale factor
    */
    public int getScaleFactor()  {
        return JnaSurface.INST().gdk_surface_get_scale_factor(asCPointer());
    }

    /**
     * Returns the width of the given &#64;surface.
     * <br>
     * <br>Surface size is reported in ”application pixels”, not
     * <br>”device pixels” (see [method&#64;Gdk.Surface.get_scale_factor]).
     * @return The width of &#64;surface
    */
    public int getWidth()  {
        return JnaSurface.INST().gdk_surface_get_width(asCPointer());
    }

    /**
     * Hide the surface.
     * <br>
     * <br>For toplevel surfaces, withdraws them, so they will no longer be
     * <br>known to the window manager; for all surfaces, unmaps them, so
     * <br>they won’t be displayed. Normally done automatically as
     * <br>part of [method&#64;Gtk.Widget.hide].
    */
    public void hide()  {
        JnaSurface.INST().gdk_surface_hide(asCPointer());
    }

    /**
     * Check to see if a surface is destroyed.
     * @return %TRUE if the surface is destroyed
    */
    public boolean isDestroyed()  {
        return JnaSurface.INST().gdk_surface_is_destroyed(asCPointer());
    }

    /**
     * Forces a [signal&#64;Gdk.Surface::render] signal emission for &#64;surface
     * <br>to be scheduled.
     * <br>
     * <br>This function is useful for implementations that track invalid
     * <br>regions on their own.
    */
    public void queueRender()  {
        JnaSurface.INST().gdk_surface_queue_render(asCPointer());
    }

    /**
     * Request a layout phase from the surface's frame clock.
     * <br>
     * <br>See [method&#64;Gdk.FrameClock.request_phase].
    */
    public void requestLayout()  {
        JnaSurface.INST().gdk_surface_request_layout(asCPointer());
    }

    /**
     * Sets the default mouse pointer for a `GdkSurface`.
     * <br>
     * <br>Passing %NULL for the &#64;cursor argument means that &#64;surface will use
     * <br>the cursor of its parent surface. Most surfaces should use this default.
     * <br>Note that &#64;cursor must be for the same display as &#64;surface.
     * <br>
     * <br>Use [ctor&#64;Gdk.Cursor.new_from_name] or [ctor&#64;Gdk.Cursor.new_from_texture]
     * <br>to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     * @param cursor a `GdkCursor`
    */
    public void setCursor(@Nullable Cursor cursor)  {
        JnaSurface.INST().gdk_surface_set_cursor(asCPointer(), asCPointer(cursor));
    }

    /**
     * Sets a specific `GdkCursor` for a given device when it gets inside &#64;surface.
     * <br>
     * <br>Passing %NULL for the &#64;cursor argument means that &#64;surface will use the
     * <br>cursor of its parent surface. Most surfaces should use this default.
     * <br>
     * <br>Use [ctor&#64;Gdk.Cursor.new_from_name] or [ctor&#64;Gdk.Cursor.new_from_texture]
     * <br>to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     * @param device a pointer `GdkDevice`
     * @param cursor a `GdkCursor`
    */
    public void setDeviceCursor(@Nonnull Device device, @Nonnull Cursor cursor)  {
        JnaSurface.INST().gdk_surface_set_device_cursor(asCPointer(), asCPointerNotNull(device), asCPointerNotNull(cursor));
    }

    /**
     * Apply the region to the surface for the purpose of event
     * <br>handling.
     * <br>
     * <br>Mouse events which happen while the pointer position corresponds
     * <br>to an unset bit in the mask will be passed on the surface below
     * <br>&#64;surface.
     * <br>
     * <br>An input region is typically used with RGBA surfaces. The alpha
     * <br>channel of the surface defines which pixels are invisible and
     * <br>allows for nicely antialiased borders, and the input region
     * <br>controls where the surface is “clickable”.
     * <br>
     * <br>Use [method&#64;Gdk.Display.supports_input_shapes] to find out if
     * <br>a particular backend supports input regions.
     * @param region region of surface to be reactive
    */
    public void setInputRegion(@Nonnull ch.bailu.gtk.cairo.Region region)  {
        JnaSurface.INST().gdk_surface_set_input_region(asCPointer(), asCPointerNotNull(region));
    }

    /**
     * Marks a region of the `GdkSurface` as opaque.
     * <br>
     * <br>For optimisation purposes, compositing window managers may
     * <br>like to not draw obscured regions of surfaces, or turn off blending
     * <br>during for these regions. With RGB windows with no transparency,
     * <br>this is just the shape of the window, but with ARGB32 windows, the
     * <br>compositor does not know what regions of the window are transparent
     * <br>or not.
     * <br>
     * <br>This function only works for toplevel surfaces.
     * <br>
     * <br>GTK will update this property automatically if the &#64;surface background
     * <br>is opaque, as we know where the opaque regions are. If your surface
     * <br>background is not opaque, please update this property in your
     * <br>[vfunc&#64;Gtk.Widget.css_changed] handler.
     * @param region a region, or %NULL to make the entire   surface opaque
    */
    public void setOpaqueRegion(@Nullable ch.bailu.gtk.cairo.Region region)  {
        JnaSurface.INST().gdk_surface_set_opaque_region(asCPointer(), asCPointer(region));
    }

    public final static String SIGNAL_ON_ENTER_MONITOR = "enter-monitor";
    
    /**
     * Connect to signal "enter-monitor".
     * <br>See {@link OnEnterMonitor#onEnterMonitor} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENTER_MONITOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnterMonitor(OnEnterMonitor signal) {
        return connectSignal(SIGNAL_ON_ENTER_MONITOR, toOnEnterMonitor(signal));
    }

    public final static String SIGNAL_ON_EVENT = "event";
    
    /**
     * Connect to signal "event".
     * <br>See {@link OnEvent#onEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEvent(OnEvent signal) {
        return connectSignal(SIGNAL_ON_EVENT, toOnEvent(signal));
    }

    public final static String SIGNAL_ON_LAYOUT = "layout";
    
    /**
     * Connect to signal "layout".
     * <br>See {@link OnLayout#onLayout} for signal description.
     * <br>Field {@link #SIGNAL_ON_LAYOUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLayout(OnLayout signal) {
        return connectSignal(SIGNAL_ON_LAYOUT, toOnLayout(signal));
    }

    public final static String SIGNAL_ON_LEAVE_MONITOR = "leave-monitor";
    
    /**
     * Connect to signal "leave-monitor".
     * <br>See {@link OnLeaveMonitor#onLeaveMonitor} for signal description.
     * <br>Field {@link #SIGNAL_ON_LEAVE_MONITOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLeaveMonitor(OnLeaveMonitor signal) {
        return connectSignal(SIGNAL_ON_LEAVE_MONITOR, toOnLeaveMonitor(signal));
    }

    public final static String SIGNAL_ON_RENDER = "render";
    
    /**
     * Connect to signal "render".
     * <br>See {@link OnRender#onRender} for signal description.
     * <br>Field {@link #SIGNAL_ON_RENDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRender(OnRender signal) {
        return connectSignal(SIGNAL_ON_RENDER, toOnRender(signal));
    }

    public static long getTypeID() { 
        return JnaSurface.INST().gdk_surface_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getDevicePosition:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Device:{c:GdkDevice*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:translateCoordinates:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Surface:{c:GdkSurface*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
