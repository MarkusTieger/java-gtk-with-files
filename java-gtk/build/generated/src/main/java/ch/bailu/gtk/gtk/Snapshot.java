/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSnapshot` assists in creating [class&#64;Gsk.RenderNode]s for widgets.
 * <br>
 * <br>It functions in a similar way to a cairo context, and maintains a stack
 * <br>of render nodes and their associated transformations.
 * <br>
 * <br>The node at the top of the stack is the one that `gtk_snapshot_append_…()`
 * <br>functions operate on. Use the `gtk_snapshot_push_…()` functions and
 * <br>[method&#64;Snapshot.pop] to change the current node.
 * <br>
 * <br>The typical way to obtain a `GtkSnapshot` object is as an argument to
 * <br>the [vfunc&#64;Gtk.Widget.snapshot] vfunc. If you need to create your own
 * <br>`GtkSnapshot`, use [ctor&#64;Gtk.Snapshot.new].
 * <p><a href="https://docs.gtk.org/gtk4/class.Snapshot.html">https://docs.gtk.org/gtk4/class.Snapshot.html</a></p>
*/
public class Snapshot extends ch.bailu.gtk.gdk.Snapshot {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Snapshot.class.getCanonicalName());
    }

    public Snapshot(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSnapshot`.
    */
    public Snapshot() {
        super(cast(JnaSnapshot.INST().gtk_snapshot_new()));
    }

    /**
     * Creates a new [class&#64;Gsk.CairoNode] and appends it to the current
     * <br>render node of &#64;snapshot, without changing the current node.
     * @param bounds the bounds for the new node
     * @return a `cairo_t` suitable for drawing the contents of   the newly created render node
    */
    public ch.bailu.gtk.cairo.Context appendCairo(@Nonnull ch.bailu.gtk.graphene.Rect bounds)  {
        return new ch.bailu.gtk.cairo.Context(new PointerContainer(JnaSnapshot.INST().gtk_snapshot_append_cairo(asCPointer(), asCPointerNotNull(bounds))));
    }

    /**
     * Creates a new render node drawing the &#64;color into the
     * <br>given &#64;bounds and appends it to the current render node
     * <br>of &#64;snapshot.
     * <br>
     * <br>You should try to avoid calling this function if
     * <br>&#64;color is transparent.
     * @param color the color to draw
     * @param bounds the bounds for the new node
    */
    public void appendColor(@Nonnull ch.bailu.gtk.gdk.RGBA color, @Nonnull ch.bailu.gtk.graphene.Rect bounds)  {
        JnaSnapshot.INST().gtk_snapshot_append_color(asCPointer(), asCPointerNotNull(color), asCPointerNotNull(bounds));
    }

    /**
     * Appends an inset shadow into the box given by &#64;outline.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blur_radius how much blur to apply to the shadow
    */
    public void appendInsetShadow(@Nonnull ch.bailu.gtk.gsk.RoundedRect outline, @Nonnull ch.bailu.gtk.gdk.RGBA color, float dx, float dy, float spread, float blur_radius)  {
        JnaSnapshot.INST().gtk_snapshot_append_inset_shadow(asCPointer(), asCPointerNotNull(outline), asCPointerNotNull(color), dx, dy, spread, blur_radius);
    }

    /**
     * 
     * @param layout 
     * @param color 
    */
    public void appendLayout(@Nonnull ch.bailu.gtk.pango.Layout layout, @Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        JnaSnapshot.INST().gtk_snapshot_append_layout(asCPointer(), asCPointerNotNull(layout), asCPointerNotNull(color));
    }

    /**
     * Appends &#64;node to the current render node of &#64;snapshot,
     * <br>without changing the current node.
     * <br>
     * <br>If &#64;snapshot does not have a current node yet, &#64;node
     * <br>will become the initial node.
     * @param node a `GskRenderNode`
    */
    public void appendNode(@Nonnull ch.bailu.gtk.gsk.RenderNode node)  {
        JnaSnapshot.INST().gtk_snapshot_append_node(asCPointer(), asCPointerNotNull(node));
    }

    /**
     * Appends an outset shadow node around the box given by &#64;outline.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the outside
     * @param blur_radius how much blur to apply to the shadow
    */
    public void appendOutsetShadow(@Nonnull ch.bailu.gtk.gsk.RoundedRect outline, @Nonnull ch.bailu.gtk.gdk.RGBA color, float dx, float dy, float spread, float blur_radius)  {
        JnaSnapshot.INST().gtk_snapshot_append_outset_shadow(asCPointer(), asCPointerNotNull(outline), asCPointerNotNull(color), dx, dy, spread, blur_radius);
    }

    /**
     * Creates a new render node drawing the &#64;texture
     * <br>into the given &#64;bounds and appends it to the
     * <br>current render node of &#64;snapshot.
     * @param texture the texture to render
     * @param bounds the bounds for the new node
    */
    public void appendTexture(@Nonnull ch.bailu.gtk.gdk.Texture texture, @Nonnull ch.bailu.gtk.graphene.Rect bounds)  {
        JnaSnapshot.INST().gtk_snapshot_append_texture(asCPointer(), asCPointerNotNull(texture), asCPointerNotNull(bounds));
    }

    /**
     * Returns the node that was constructed by &#64;snapshot
     * <br>and frees &#64;snapshot.
     * @return a newly-created [class&#64;Gsk.RenderNode]
    */
    public ch.bailu.gtk.gsk.RenderNode freeToNode()  {
        return new ch.bailu.gtk.gsk.RenderNode(new PointerContainer(JnaSnapshot.INST().gtk_snapshot_free_to_node(asCPointer())));
    }

    /**
     * Returns a paintable for the node that was
     * <br>constructed by &#64;snapshot and frees &#64;snapshot.
     * @param size The size of the resulting paintable   or %NULL to use the bounds of the snapshot
     * @return a newly-created [iface&#64;Gdk.Paintable]
    */
    public ch.bailu.gtk.gdk.Paintable freeToPaintable(@Nullable ch.bailu.gtk.graphene.Size size)  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaSnapshot.INST().gtk_snapshot_free_to_paintable(asCPointer(), asCPointer(size))));
    }

    /**
     * Removes the top element from the stack of render nodes and
     * <br>adds it to the nearest [class&#64;Gsk.GLShaderNode] below it.
     * <br>
     * <br>This must be called the same number of times as the number
     * <br>of textures is needed for the shader in
     * <br>[method&#64;Gtk.Snapshot.push_gl_shader].
    */
    public void glShaderPopTexture()  {
        JnaSnapshot.INST().gtk_snapshot_gl_shader_pop_texture(asCPointer());
    }

    /**
     * Applies a perspective projection transform.
     * <br>
     * <br>See [method&#64;Gsk.Transform.perspective] for a discussion on the details.
     * @param depth distance of the z=0 plane
    */
    public void perspective(float depth)  {
        JnaSnapshot.INST().gtk_snapshot_perspective(asCPointer(), depth);
    }

    /**
     * Removes the top element from the stack of render nodes,
     * <br>and appends it to the node underneath it.
    */
    public void pop()  {
        JnaSnapshot.INST().gtk_snapshot_pop(asCPointer());
    }

    /**
     * Blends together two images with the given blend mode.
     * <br>
     * <br>Until the first call to [method&#64;Gtk.Snapshot.pop], the
     * <br>bottom image for the blend operation will be recorded.
     * <br>After that call, the top image to be blended will be
     * <br>recorded until the second call to [method&#64;Gtk.Snapshot.pop].
     * <br>
     * <br>Calling this function requires two subsequent calls
     * <br>to [method&#64;Gtk.Snapshot.pop].
     * @param blend_mode blend mode to use
    */
    public void pushBlend(int blend_mode)  {
        JnaSnapshot.INST().gtk_snapshot_push_blend(asCPointer(), blend_mode);
    }

    /**
     * Blurs an image.
     * <br>
     * <br>The image is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param radius the blur radius to use. Must be positive
    */
    public void pushBlur(double radius)  {
        JnaSnapshot.INST().gtk_snapshot_push_blur(asCPointer(), radius);
    }

    /**
     * Clips an image to a rectangle.
     * <br>
     * <br>The image is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param bounds the rectangle to clip to
    */
    public void pushClip(@Nonnull ch.bailu.gtk.graphene.Rect bounds)  {
        JnaSnapshot.INST().gtk_snapshot_push_clip(asCPointer(), asCPointerNotNull(bounds));
    }

    /**
     * Modifies the colors of an image by applying an affine transformation
     * <br>in RGB space.
     * <br>
     * <br>The image is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param color_matrix the color matrix to use
     * @param color_offset the color offset to use
    */
    public void pushColorMatrix(@Nonnull ch.bailu.gtk.graphene.Matrix color_matrix, @Nonnull ch.bailu.gtk.graphene.Vec4 color_offset)  {
        JnaSnapshot.INST().gtk_snapshot_push_color_matrix(asCPointer(), asCPointerNotNull(color_matrix), asCPointerNotNull(color_offset));
    }

    /**
     * Snapshots a cross-fade operation between two images with the
     * <br>given &#64;progress.
     * <br>
     * <br>Until the first call to [method&#64;Gtk.Snapshot.pop], the start image
     * <br>will be snapshot. After that call, the end image will be recorded
     * <br>until the second call to [method&#64;Gtk.Snapshot.pop].
     * <br>
     * <br>Calling this function requires two subsequent calls
     * <br>to [method&#64;Gtk.Snapshot.pop].
     * @param progress progress between 0.0 and 1.0
    */
    public void pushCrossFade(double progress)  {
        JnaSnapshot.INST().gtk_snapshot_push_cross_fade(asCPointer(), progress);
    }

    /**
     * Inserts a debug node with a message.
     * <br>
     * <br>Debug nodes don't affect the rendering at all, but can be
     * <br>helpful in identifying parts of a render node tree dump,
     * <br>for example in the GTK inspector.
     * @param message a printf-style format string
     * @param _elipse arguments for &#64;message
    */
    public void pushDebug(@Nonnull ch.bailu.gtk.type.Str message, java.lang.Object... _elipse)  {
        JnaSnapshot.INST().gtk_snapshot_push_debug(asCPointer(), asCPointerNotNull(message), _elipse);
    }

    /**
     * Inserts a debug node with a message.
     * <br>
     * <br>Debug nodes don't affect the rendering at all, but can be
     * <br>helpful in identifying parts of a render node tree dump,
     * <br>for example in the GTK inspector.
     * @param message a printf-style format string
     * @param _elipse arguments for &#64;message
    */
    public void pushDebug(String message, java.lang.Object... _elipse)  {
        JnaSnapshot.INST().gtk_snapshot_push_debug(asCPointer(), message, _elipse);
    }

    /**
     * Push a [class&#64;Gsk.GLShaderNode].
     * <br>
     * <br>The node uses the given [class&#64;Gsk.GLShader] and uniform values
     * <br>Additionally this takes a list of &#64;n_children other nodes
     * <br>which will be passed to the [class&#64;Gsk.GLShaderNode].
     * <br>
     * <br>The &#64;take_args argument is a block of data to use for uniform
     * <br>arguments, as per types and offsets defined by the &#64;shader.
     * <br>Normally this is generated by [method&#64;Gsk.GLShader.format_args]
     * <br>or [struct&#64;Gsk.ShaderArgsBuilder].
     * <br>
     * <br>The snapshotter takes ownership of &#64;take_args, so the caller should
     * <br>not free it after this.
     * <br>
     * <br>If the renderer doesn't support GL shaders, or if there is any
     * <br>problem when compiling the shader, then the node will draw pink.
     * <br>You should use [method&#64;Gsk.GLShader.compile] to ensure the &#64;shader
     * <br>will work for the renderer before using it.
     * <br>
     * <br>If the shader requires textures (see [method&#64;Gsk.GLShader.get_n_textures]),
     * <br>then it is expected that you call [method&#64;Gtk.Snapshot.gl_shader_pop_texture]
     * <br>the number of times that are required. Each of these calls will generate
     * <br>a node that is added as a child to the `GskGLShaderNode`, which in turn
     * <br>will render these offscreen and pass as a texture to the shader.
     * <br>
     * <br>Once all textures (if any) are pop:ed, you must call the regular
     * <br>[method&#64;Gtk.Snapshot.pop].
     * <br>
     * <br>If you want to use pre-existing textures as input to the shader rather
     * <br>than rendering new ones, use [method&#64;Gtk.Snapshot.append_texture] to
     * <br>push a texture node. These will be used directly rather than being
     * <br>re-rendered.
     * <br>
     * <br>For details on how to write shaders, see [class&#64;Gsk.GLShader].
     * @param shader The code to run
     * @param bounds the rectangle to render into
     * @param take_args Data block with arguments for the shader.
    */
    public void pushGlShader(@Nonnull ch.bailu.gtk.gsk.GLShader shader, @Nonnull ch.bailu.gtk.graphene.Rect bounds, @Nonnull ch.bailu.gtk.glib.Bytes take_args)  {
        JnaSnapshot.INST().gtk_snapshot_push_gl_shader(asCPointer(), asCPointerNotNull(shader), asCPointerNotNull(bounds), asCPointerNotNull(take_args));
    }

    /**
     * Modifies the opacity of an image.
     * <br>
     * <br>The image is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param opacity the opacity to use
    */
    public void pushOpacity(double opacity)  {
        JnaSnapshot.INST().gtk_snapshot_push_opacity(asCPointer(), opacity);
    }

    /**
     * Creates a node that repeats the child node.
     * <br>
     * <br>The child is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param bounds the bounds within which to repeat
     * @param child_bounds the bounds of the child or %NULL   to use the full size of the collected child node
    */
    public void pushRepeat(@Nonnull ch.bailu.gtk.graphene.Rect bounds, @Nullable ch.bailu.gtk.graphene.Rect child_bounds)  {
        JnaSnapshot.INST().gtk_snapshot_push_repeat(asCPointer(), asCPointerNotNull(bounds), asCPointer(child_bounds));
    }

    /**
     * Clips an image to a rounded rectangle.
     * <br>
     * <br>The image is recorded until the next call to [method&#64;Gtk.Snapshot.pop].
     * @param bounds the rounded rectangle to clip to
    */
    public void pushRoundedClip(@Nonnull ch.bailu.gtk.gsk.RoundedRect bounds)  {
        JnaSnapshot.INST().gtk_snapshot_push_rounded_clip(asCPointer(), asCPointerNotNull(bounds));
    }

    /**
     * Creates a render node for the CSS background according to &#64;context,
     * <br>and appends it to the current node of &#64;snapshot, without changing
     * <br>the current node.
     * @param context the style context that defines the background
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public void renderBackground(@Nonnull StyleContext context, double x, double y, double width, double height)  {
        JnaSnapshot.INST().gtk_snapshot_render_background(asCPointer(), asCPointerNotNull(context), x, y, width, height);
    }

    /**
     * Creates a render node for the focus outline according to &#64;context,
     * <br>and appends it to the current node of &#64;snapshot, without changing
     * <br>the current node.
     * @param context the style context that defines the focus ring
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public void renderFocus(@Nonnull StyleContext context, double x, double y, double width, double height)  {
        JnaSnapshot.INST().gtk_snapshot_render_focus(asCPointer(), asCPointerNotNull(context), x, y, width, height);
    }

    /**
     * Creates a render node for the CSS border according to &#64;context,
     * <br>and appends it to the current node of &#64;snapshot, without changing
     * <br>the current node.
     * @param context the style context that defines the frame
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public void renderFrame(@Nonnull StyleContext context, double x, double y, double width, double height)  {
        JnaSnapshot.INST().gtk_snapshot_render_frame(asCPointer(), asCPointerNotNull(context), x, y, width, height);
    }

    /**
     * Draws a text caret using &#64;snapshot at the specified index of &#64;layout.
     * @param context a `GtkStyleContext`
     * @param x X origin
     * @param y Y origin
     * @param layout the `PangoLayout` of the text
     * @param index the index in the `PangoLayout`
     * @param direction the `PangoDirection` of the text
    */
    public void renderInsertionCursor(@Nonnull StyleContext context, double x, double y, @Nonnull ch.bailu.gtk.pango.Layout layout, int index, int direction)  {
        JnaSnapshot.INST().gtk_snapshot_render_insertion_cursor(asCPointer(), asCPointerNotNull(context), x, y, asCPointerNotNull(layout), index, direction);
    }

    /**
     * Creates a render node for rendering &#64;layout according to the style
     * <br>information in &#64;context, and appends it to the current node of &#64;snapshot,
     * <br>without changing the current node.
     * @param context the style context that defines the text
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param layout the `PangoLayout` to render
    */
    public void renderLayout(@Nonnull StyleContext context, double x, double y, @Nonnull ch.bailu.gtk.pango.Layout layout)  {
        JnaSnapshot.INST().gtk_snapshot_render_layout(asCPointer(), asCPointerNotNull(context), x, y, asCPointerNotNull(layout));
    }

    /**
     * Restores &#64;snapshot to the state saved by a preceding call to
     * <br>[method&#64;Snapshot.save] and removes that state from the stack of
     * <br>saved states.
    */
    public void restore()  {
        JnaSnapshot.INST().gtk_snapshot_restore(asCPointer());
    }

    /**
     * Rotates &#64;&#64;snapshot's coordinate system by &#64;angle degrees in 2D space -
     * <br>or in 3D speak, rotates around the Z axis.
     * <br>
     * <br>To rotate around other axes, use [method&#64;Gsk.Transform.rotate_3d].
     * @param angle the rotation angle, in degrees (clockwise)
    */
    public void rotate(float angle)  {
        JnaSnapshot.INST().gtk_snapshot_rotate(asCPointer(), angle);
    }

    /**
     * Rotates &#64;snapshot's coordinate system by &#64;angle degrees around &#64;axis.
     * <br>
     * <br>For a rotation in 2D space, use [method&#64;Gsk.Transform.rotate].
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
    */
    public void rotate3d(float angle, @Nonnull ch.bailu.gtk.graphene.Vec3 axis)  {
        JnaSnapshot.INST().gtk_snapshot_rotate_3d(asCPointer(), angle, asCPointerNotNull(axis));
    }

    /**
     * Makes a copy of the current state of &#64;snapshot and saves it
     * <br>on an internal stack.
     * <br>
     * <br>When [method&#64;Gtk.Snapshot.restore] is called, &#64;snapshot will
     * <br>be restored to the saved state. Multiple calls to
     * <br>[method&#64;Snapshot.save] and [class&#64;Snapshot.restore] can be nested;
     * <br>each call to `gtk_snapshot_restore()` restores the state from
     * <br>the matching paired `gtk_snapshot_save()`.
     * <br>
     * <br>It is necessary to clear all saved states with corresponding
     * <br>calls to `gtk_snapshot_restore()`.
    */
    public void save()  {
        JnaSnapshot.INST().gtk_snapshot_save(asCPointer());
    }

    /**
     * Scales &#64;snapshot's coordinate system in 2-dimensional space by
     * <br>the given factors.
     * <br>
     * <br>Use [method&#64;Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
     * @param factor_x scaling factor on the X axis
     * @param factor_y scaling factor on the Y axis
    */
    public void scale(float factor_x, float factor_y)  {
        JnaSnapshot.INST().gtk_snapshot_scale(asCPointer(), factor_x, factor_y);
    }

    /**
     * Scales &#64;snapshot's coordinate system by the given factors.
     * @param factor_x scaling factor on the X axis
     * @param factor_y scaling factor on the Y axis
     * @param factor_z scaling factor on the Z axis
    */
    public void scale3d(float factor_x, float factor_y, float factor_z)  {
        JnaSnapshot.INST().gtk_snapshot_scale_3d(asCPointer(), factor_x, factor_y, factor_z);
    }

    /**
     * Returns the render node that was constructed
     * <br>by &#64;snapshot.
     * <br>
     * <br>After calling this function, it is no longer possible to
     * <br>add more nodes to &#64;snapshot. The only function that should
     * <br>be called after this is [method&#64;GObject.Object.unref].
     * @return the constructed `GskRenderNode`
    */
    public ch.bailu.gtk.gsk.RenderNode toNode()  {
        return new ch.bailu.gtk.gsk.RenderNode(new PointerContainer(JnaSnapshot.INST().gtk_snapshot_to_node(asCPointer())));
    }

    /**
     * Returns a paintable encapsulating the render node
     * <br>that was constructed by &#64;snapshot.
     * <br>
     * <br>After calling this function, it is no longer possible to
     * <br>add more nodes to &#64;snapshot. The only function that should
     * <br>be called after this is [method&#64;GObject.Object.unref].
     * @param size The size of the resulting paintable   or %NULL to use the bounds of the snapshot
     * @return a new `GdkPaintable`
    */
    public ch.bailu.gtk.gdk.Paintable toPaintable(@Nullable ch.bailu.gtk.graphene.Size size)  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaSnapshot.INST().gtk_snapshot_to_paintable(asCPointer(), asCPointer(size))));
    }

    /**
     * Transforms &#64;snapshot's coordinate system with the given &#64;transform.
     * @param transform the transform to apply
    */
    public void transform(@Nullable ch.bailu.gtk.gsk.Transform transform)  {
        JnaSnapshot.INST().gtk_snapshot_transform(asCPointer(), asCPointer(transform));
    }

    /**
     * Transforms &#64;snapshot's coordinate system with the given &#64;matrix.
     * @param matrix the matrix to multiply the transform with
    */
    public void transformMatrix(@Nonnull ch.bailu.gtk.graphene.Matrix matrix)  {
        JnaSnapshot.INST().gtk_snapshot_transform_matrix(asCPointer(), asCPointerNotNull(matrix));
    }

    /**
     * Translates &#64;snapshot's coordinate system by &#64;point in 2-dimensional space.
     * @param point the point to translate the snapshot by
    */
    public void translate(@Nonnull ch.bailu.gtk.graphene.Point point)  {
        JnaSnapshot.INST().gtk_snapshot_translate(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Translates &#64;snapshot's coordinate system by &#64;point.
     * @param point the point to translate the snapshot by
    */
    public void translate3d(@Nonnull ch.bailu.gtk.graphene.Point3D point)  {
        JnaSnapshot.INST().gtk_snapshot_translate_3d(asCPointer(), asCPointerNotNull(point));
    }

    public static long getTypeID() { 
        return JnaSnapshot.INST().gtk_snapshot_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:appendBorder:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:RoundedRect:{c:const GskRoundedRect*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GdkRGBA*}}:{j:}]

[MethodModel:java-type-not-supported:appendConicGradient:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:appendLinearGradient:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:appendRadialGradient:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:appendRepeatingLinearGradient:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:appendRepeatingRadialGradient:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:pushShadow:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskShadow*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
