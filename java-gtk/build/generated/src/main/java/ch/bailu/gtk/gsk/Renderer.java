/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GskRenderer` is a class that renders a scene graph defined via a
 * <br>tree of [class&#64;Gsk.RenderNode] instances.
 * <br>
 * <br>Typically you will use a `GskRenderer` instance to repeatedly call
 * <br>[method&#64;Gsk.Renderer.render] to update the contents of its associated
 * <br>[class&#64;Gdk.Surface].
 * <br>
 * <br>It is necessary to realize a `GskRenderer` instance using
 * <br>[method&#64;Gsk.Renderer.realize] before calling [method&#64;Gsk.Renderer.render],
 * <br>in order to create the appropriate windowing system resources needed
 * <br>to render the scene.
 * <p><a href="https://docs.gtk.org/gsk4/class.Renderer.html">https://docs.gtk.org/gsk4/class.Renderer.html</a></p>
*/
public class Renderer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Renderer.class.getCanonicalName());
    }

    public Renderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an appropriate `GskRenderer` instance for the given &#64;surface.
     * <br>
     * <br>If the `GSK_RENDERER` environment variable is set, GSK will
     * <br>try that renderer first, before trying the backend-specific
     * <br>default. The ultimate fallback is the cairo renderer.
     * <br>
     * <br>The renderer will be realized before it is returned.
     * @param surface a `GdkSurface`
     * @return a `GskRenderer`
    */
    public static Renderer newForSurfaceRenderer(@Nonnull ch.bailu.gtk.gdk.Surface surface)  {
        PointerContainer __self = cast(JnaRenderer.INST().gsk_renderer_new_for_surface(asCPointerNotNull(surface)));
        if (__self.isNull()) {
            throw new NullPointerException("Renderer:newForSurface");
        }
        return new Renderer(__self);
    }        
    

    /**
     * Retrieves the `GdkSurface` set using gsk_enderer_realize().
     * <br>
     * <br>If the renderer has not been realized yet, %NULL will be returned.
     * @return a `GdkSurface`
    */
    public ch.bailu.gtk.gdk.Surface getSurface()  {
        return new ch.bailu.gtk.gdk.Surface(new PointerContainer(JnaRenderer.INST().gsk_renderer_get_surface(asCPointer())));
    }

    /**
     * Checks whether the &#64;renderer is realized or not.
     * @return %TRUE if the `GskRenderer` was realized, and %FALSE otherwise
    */
    public boolean isRealized()  {
        return JnaRenderer.INST().gsk_renderer_is_realized(asCPointer());
    }

    /**
     * Creates the resources needed by the &#64;renderer to render the scene
     * <br>graph.
     * <br>
     * <br>Since GTK 4.6, the surface may be `NULL`, which allows using
     * <br>renderers without having to create a surface.
     * <br>
     * <br>Note that it is mandatory to call [method&#64;Gsk.Renderer.unrealize] before
     * <br>destroying the renderer.
     * @param surface the `GdkSurface` renderer will be used on
     * @return Whether the renderer was successfully realized
    */
    public boolean realize(@Nullable ch.bailu.gtk.gdk.Surface surface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRenderer.INST().gsk_renderer_realize(asCPointer(), asCPointer(surface), 0L);
    }

    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances
     * <br>to the renderer's surface,  ensuring that the given &#64;region gets redrawn.
     * <br>
     * <br>If the renderer has no associated surface, this function does nothing.
     * <br>
     * <br>Renderers must ensure that changes of the contents given by the &#64;root
     * <br>node as well as the area given by &#64;region are redrawn. They are however
     * <br>free to not redraw any pixel outside of &#64;region if they can guarantee that
     * <br>it didn't change.
     * <br>
     * <br>The &#64;renderer will acquire a reference on the `GskRenderNode` tree while
     * <br>the rendering is in progress.
     * @param root a `GskRenderNode`
     * @param region the `cairo_region_t` that must be redrawn or %NULL   for the whole window
    */
    public void render(@Nonnull RenderNode root, @Nullable ch.bailu.gtk.cairo.Region region)  {
        JnaRenderer.INST().gsk_renderer_render(asCPointer(), asCPointerNotNull(root), asCPointer(region));
    }

    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances,
     * <br>to a `GdkTexture`.
     * <br>
     * <br>The &#64;renderer will acquire a reference on the `GskRenderNode` tree while
     * <br>the rendering is in progress.
     * <br>
     * <br>If you want to apply any transformations to &#64;root, you should put it into a
     * <br>transform node and pass that node instead.
     * @param root a `GskRenderNode`
     * @param viewport the section to draw or %NULL to use &#64;root's bounds
     * @return a `GdkTexture` with the rendered contents of &#64;root.
    */
    public ch.bailu.gtk.gdk.Texture renderTexture(@Nonnull RenderNode root, @Nullable ch.bailu.gtk.graphene.Rect viewport)  {
        return new ch.bailu.gtk.gdk.Texture(new PointerContainer(JnaRenderer.INST().gsk_renderer_render_texture(asCPointer(), asCPointerNotNull(root), asCPointer(viewport))));
    }

    /**
     * Releases all the resources created by gsk_renderer_realize().
    */
    public void unrealize()  {
        JnaRenderer.INST().gsk_renderer_unrealize(asCPointer());
    }

    public static long getTypeID() { 
        return JnaRenderer.INST().gsk_renderer_get_type(); 
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
