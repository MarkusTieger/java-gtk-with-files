/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGLArea` is a widget that allows drawing with OpenGL.
 * <br>
 * <br>![An example GtkGLArea](glarea.png)
 * <br>
 * <br>`GtkGLArea` sets up its own [class&#64;Gdk.GLContext], and creates a custom
 * <br>GL framebuffer that the widget will do GL rendering onto. It also ensures
 * <br>that this framebuffer is the default GL rendering target when rendering.
 * <br>
 * <br>In order to draw, you have to connect to the [signal&#64;Gtk.GLArea::render]
 * <br>signal, or subclass `GtkGLArea` and override the GtkGLAreaClass.render
 * <br>virtual function.
 * <br>
 * <br>The `GtkGLArea` widget ensures that the `GdkGLContext` is associated with
 * <br>the widget's drawing area, and it is kept updated when the size and
 * <br>position of the drawing area changes.
 * <br>
 * <br>&#35;&#35; Drawing with GtkGLArea
 * <br>
 * <br>The simplest way to draw using OpenGL commands in a `GtkGLArea` is to
 * <br>create a widget instance and connect to the [signal&#64;Gtk.GLArea::render] signal:
 * <br>
 * <br>The `render()` function will be called when the `GtkGLArea` is ready
 * <br>for you to draw its content:
 * <br>
 * <br>```c
 * <br>static gboolean
 * <br>render (GtkGLArea *area, GdkGLContext *context)
 * <br>{
 * <br>  // inside this function it's safe to use GL; the given
 * <br>  // GdkGLContext has been made current to the drawable
 * <br>  // surface used by the `GtkGLArea` and the viewport has
 * <br>  // already been set to be the size of the allocation
 * <br>
 * <br>  // we can start by clearing the buffer
 * <br>  glClearColor (0, 0, 0, 0);
 * <br>  glClear (GL_COLOR_BUFFER_BIT);
 * <br>
 * <br>  // draw your object
 * <br>  // draw_an_object ();
 * <br>
 * <br>  // we completed our drawing; the draw commands will be
 * <br>  // flushed at the end of the signal emission chain, and
 * <br>  // the buffers will be drawn on the window
 * <br>  return TRUE;
 * <br>}
 * <br>
 * <br>void setup_glarea (void)
 * <br>{
 * <br>  // create a GtkGLArea instance
 * <br>  GtkWidget *gl_area = gtk_gl_area_new ();
 * <br>
 * <br>  // connect to the &quot;render&quot; signal
 * <br>  g_signal_connect (gl_area, &quot;render&quot;, G_CALLBACK (render), NULL);
 * <br>}
 * <br>```
 * <br>
 * <br>If you need to initialize OpenGL state, e.g. buffer objects or
 * <br>shaders, you should use the [signal&#64;Gtk.Widget::realize] signal;
 * <br>you can use the [signal&#64;Gtk.Widget::unrealize] signal to clean up.
 * <br>Since the `GdkGLContext` creation and initialization may fail, you
 * <br>will need to check for errors, using [method&#64;Gtk.GLArea.get_error].
 * <br>
 * <br>An example of how to safely initialize the GL state is:
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_realize (GtkGLarea *area)
 * <br>{
 * <br>  // We need to make the context current if we want to
 * <br>  // call GL API
 * <br>  gtk_gl_area_make_current (area);
 * <br>
 * <br>  // If there were errors during the initialization or
 * <br>  // when trying to make the context current, this
 * <br>  // function will return a GError for you to catch
 * <br>  if (gtk_gl_area_get_error (area) != NULL)
 * <br>    return;
 * <br>
 * <br>  // You can also use gtk_gl_area_set_error() in order
 * <br>  // to show eventual initialization errors on the
 * <br>  // GtkGLArea widget itself
 * <br>  GError *internal_error = NULL;
 * <br>  init_buffer_objects (&amp;error);
 * <br>  if (error != NULL)
 * <br>    {
 * <br>      gtk_gl_area_set_error (area, error);
 * <br>      g_error_free (error);
 * <br>      return;
 * <br>    }
 * <br>
 * <br>  init_shaders (&amp;error);
 * <br>  if (error != NULL)
 * <br>    {
 * <br>      gtk_gl_area_set_error (area, error);
 * <br>      g_error_free (error);
 * <br>      return;
 * <br>    }
 * <br>}
 * <br>```
 * <br>
 * <br>If you need to change the options for creating the `GdkGLContext`
 * <br>you should use the [signal&#64;Gtk.GLArea::create-context] signal.
 * <p><a href="https://docs.gtk.org/gtk4/class.GLArea.html">https://docs.gtk.org/gtk4/class.GLArea.html</a></p>
*/
public class GLArea extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLArea.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCreateContext {
        /**
         * Emitted when the widget is being realized.
         * <br>
         * <br>This allows you to override how the GL context is created.
         * <br>This is useful when you want to reuse an existing GL context,
         * <br>or if you want to try creating different kinds of GL options.
         * <br>
         * <br>If context creation fails then the signal handler can use
         * <br>[method&#64;Gtk.GLArea.set_error] to register a more detailed error
         * <br>of how the construction failed.
         * @return a newly created `GdkGLContext`;     the `GtkGLArea` widget will take ownership of the returned value.
        */
        ch.bailu.gtk.gdk.GLContext onCreateContext();
    }
    
    private static com.sun.jna.Callback toOnCreateContext(OnCreateContext in) {
        return (in == null) ? null: (JnaGLArea.OnCreateContext) (__self, __data) -> in.onCreateContext().asCPointer();
    }

    @FunctionalInterface
    public interface OnRender {
        /**
         * Emitted every time the contents of the `GtkGLArea` should be redrawn.
         * <br>
         * <br>The &#64;context is bound to the &#64;area prior to emitting this function,
         * <br>and the buffers are painted to the window once the emission terminates.
         * @param context the `GdkGLContext` used by &#64;area
         * @return %TRUE to stop other handlers from being invoked for the event.   %FALSE to propagate the event further.
        */
        boolean onRender(@Nonnull ch.bailu.gtk.gdk.GLContext context);
    }
    
    private static com.sun.jna.Callback toOnRender(OnRender in) {
        return (in == null) ? null: (JnaGLArea.OnRender) (__self, _context, __data) -> in.onRender(new ch.bailu.gtk.gdk.GLContext(new PointerContainer(_context)));
    }

    @FunctionalInterface
    public interface OnResize {
        /**
         * Emitted once when the widget is realized, and then each time the widget
         * <br>is changed while realized.
         * <br>
         * <br>This is useful in order to keep GL state up to date with the widget size,
         * <br>like for instance camera properties which may depend on the width/height
         * <br>ratio.
         * <br>
         * <br>The GL context for the area is guaranteed to be current when this signal
         * <br>is emitted.
         * <br>
         * <br>The default handler sets up the GL viewport.
         * @param width the width of the viewport
         * @param height the height of the viewport
        */
        void onResize(int width, int height);
    }
    
    private static com.sun.jna.Callback toOnResize(OnResize in) {
        return (in == null) ? null: (JnaGLArea.OnResize) (__self, _width, _height, __data) -> in.onResize(_width, _height);
    }

    public GLArea(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkGLArea` widget.
    */
    public GLArea() {
        super(cast(JnaGLArea.INST().gtk_gl_area_new()));
    }

    /**
     * Binds buffers to the framebuffer.
     * <br>
     * <br>Ensures that the &#64;area framebuffer object is made the current draw
     * <br>and read target, and that all the required buffers for the &#64;area
     * <br>are created and bound to the framebuffer.
     * <br>
     * <br>This function is automatically called before emitting the
     * <br>[signal&#64;Gtk.GLArea::render] signal, and doesn't normally need to be
     * <br>called by application code.
    */
    public void attachBuffers()  {
        JnaGLArea.INST().gtk_gl_area_attach_buffers(asCPointer());
    }

    /**
     * Returns whether the area is in auto render mode or not.
     * @return %TRUE if the &#64;area is auto rendering, %FALSE otherwise
    */
    public boolean getAutoRender()  {
        return JnaGLArea.INST().gtk_gl_area_get_auto_render(asCPointer());
    }

    /**
     * Retrieves the `GdkGLContext` used by &#64;area.
     * @return the `GdkGLContext`
    */
    public ch.bailu.gtk.gdk.GLContext getContext()  {
        return new ch.bailu.gtk.gdk.GLContext(new PointerContainer(JnaGLArea.INST().gtk_gl_area_get_context(asCPointer())));
    }

    /**
     * Gets the current error set on the &#64;area.
     * @return the `GError`
    */
    public ch.bailu.gtk.glib.Error getError()  {
        return new ch.bailu.gtk.glib.Error(new PointerContainer(JnaGLArea.INST().gtk_gl_area_get_error(asCPointer())));
    }

    /**
     * Returns whether the area has a depth buffer.
     * @return %TRUE if the &#64;area has a depth buffer, %FALSE otherwise
    */
    public boolean getHasDepthBuffer()  {
        return JnaGLArea.INST().gtk_gl_area_get_has_depth_buffer(asCPointer());
    }

    /**
     * Returns whether the area has a stencil buffer.
     * @return %TRUE if the &#64;area has a stencil buffer, %FALSE otherwise
    */
    public boolean getHasStencilBuffer()  {
        return JnaGLArea.INST().gtk_gl_area_get_has_stencil_buffer(asCPointer());
    }

    /**
     * Retrieves the required version of OpenGL.
     * <br>
     * <br>See [method&#64;Gtk.GLArea.set_required_version].
     * @param major return location for the required major version
     * @param minor return location for the required minor version
    */
    public void getRequiredVersion(@Nonnull ch.bailu.gtk.type.Int major, @Nonnull ch.bailu.gtk.type.Int minor)  {
        JnaGLArea.INST().gtk_gl_area_get_required_version(asCPointer(), asCPointerNotNull(major), asCPointerNotNull(minor));
    }

    /**
     * Returns whether the `GtkGLArea` should use OpenGL ES.
     * <br>
     * <br>See [method&#64;Gtk.GLArea.set_use_es].
     * @return %TRUE if the `GtkGLArea` should create an OpenGL ES context   and %FALSE otherwise
    */
    public boolean getUseEs()  {
        return JnaGLArea.INST().gtk_gl_area_get_use_es(asCPointer());
    }

    /**
     * Ensures that the `GdkGLContext` used by &#64;area is associated with
     * <br>the `GtkGLArea`.
     * <br>
     * <br>This function is automatically called before emitting the
     * <br>[signal&#64;Gtk.GLArea::render] signal, and doesn't normally need
     * <br>to be called by application code.
    */
    public void makeCurrent()  {
        JnaGLArea.INST().gtk_gl_area_make_current(asCPointer());
    }

    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * <br>a redraw of the widget.
     * <br>
     * <br>This ensures that the [signal&#64;Gtk.GLArea::render] signal
     * <br>is emitted during the draw.
     * <br>
     * <br>This is only needed when [method&#64;Gtk.GLArea.set_auto_render] has
     * <br>been called with a %FALSE value. The default behaviour is to
     * <br>emit [signal&#64;Gtk.GLArea::render] on each draw.
    */
    public void queueRender()  {
        JnaGLArea.INST().gtk_gl_area_queue_render(asCPointer());
    }

    /**
     * Sets whether the `GtkGLArea` is in auto render mode.
     * <br>
     * <br>If &#64;auto_render is %TRUE the [signal&#64;Gtk.GLArea::render] signal will
     * <br>be emitted every time the widget draws. This is the default and is
     * <br>useful if drawing the widget is faster.
     * <br>
     * <br>If &#64;auto_render is %FALSE the data from previous rendering is kept
     * <br>around and will be used for drawing the widget the next time,
     * <br>unless the window is resized. In order to force a rendering
     * <br>[method&#64;Gtk.GLArea.queue_render] must be called. This mode is
     * <br>useful when the scene changes seldom, but takes a long time to redraw.
     * @param auto_render a boolean
    */
    public void setAutoRender(boolean auto_render)  {
        JnaGLArea.INST().gtk_gl_area_set_auto_render(asCPointer(), auto_render);
    }

    /**
     * Sets an error on the area which will be shown instead of the
     * <br>GL rendering.
     * <br>
     * <br>This is useful in the [signal&#64;Gtk.GLArea::create-context]
     * <br>signal if GL context creation fails.
     * @param error a new `GError`, or %NULL to unset the error
    */
    public void setError(@Nullable ch.bailu.gtk.glib.Error error)  {
        JnaGLArea.INST().gtk_gl_area_set_error(asCPointer(), asCPointer(error));
    }

    /**
     * Sets whether the `GtkGLArea` should use a depth buffer.
     * <br>
     * <br>If &#64;has_depth_buffer is %TRUE the widget will allocate and
     * <br>enable a depth buffer for the target framebuffer. Otherwise
     * <br>there will be none.
     * @param has_depth_buffer %TRUE to add a depth buffer
    */
    public void setHasDepthBuffer(boolean has_depth_buffer)  {
        JnaGLArea.INST().gtk_gl_area_set_has_depth_buffer(asCPointer(), has_depth_buffer);
    }

    /**
     * Sets whether the `GtkGLArea` should use a stencil buffer.
     * <br>
     * <br>If &#64;has_stencil_buffer is %TRUE the widget will allocate and
     * <br>enable a stencil buffer for the target framebuffer. Otherwise
     * <br>there will be none.
     * @param has_stencil_buffer %TRUE to add a stencil buffer
    */
    public void setHasStencilBuffer(boolean has_stencil_buffer)  {
        JnaGLArea.INST().gtk_gl_area_set_has_stencil_buffer(asCPointer(), has_stencil_buffer);
    }

    /**
     * Sets the required version of OpenGL to be used when creating
     * <br>the context for the widget.
     * <br>
     * <br>This function must be called before the area has been realized.
     * @param major the major version
     * @param minor the minor version
    */
    public void setRequiredVersion(int major, int minor)  {
        JnaGLArea.INST().gtk_gl_area_set_required_version(asCPointer(), major, minor);
    }

    /**
     * Sets whether the &#64;area should create an OpenGL or an OpenGL ES context.
     * <br>
     * <br>You should check the capabilities of the `GdkGLContext` before drawing
     * <br>with either API.
     * @param use_es whether to use OpenGL or OpenGL ES
    */
    public void setUseEs(boolean use_es)  {
        JnaGLArea.INST().gtk_gl_area_set_use_es(asCPointer(), use_es);
    }

    public final static String SIGNAL_ON_CREATE_CONTEXT = "create-context";
    
    /**
     * Connect to signal "create-context".
     * <br>See {@link OnCreateContext#onCreateContext} for signal description.
     * <br>Field {@link #SIGNAL_ON_CREATE_CONTEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCreateContext(OnCreateContext signal) {
        return connectSignal(SIGNAL_ON_CREATE_CONTEXT, toOnCreateContext(signal));
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
        return JnaGLArea.INST().gtk_gl_area_get_type(); 
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
