/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GskRenderNode` is the basic block in a scene graph to be
 * <br>rendered using [class&#64;Gsk.Renderer].
 * <br>
 * <br>Each node has a parent, except the top-level node; each node may have
 * <br>children nodes.
 * <br>
 * <br>Each node has an associated drawing surface, which has the size of
 * <br>the rectangle set when creating it.
 * <br>
 * <br>Render nodes are meant to be transient; once they have been associated
 * <br>to a [class&#64;Gsk.Renderer] it's safe to release any reference you have on
 * <br>them. All [class&#64;Gsk.RenderNode]s are immutable, you can only specify their
 * <br>properties during construction.
 * <p><a href="https://docs.gtk.org/gsk4/class.RenderNode.html">https://docs.gtk.org/gsk4/class.RenderNode.html</a></p>
*/
public class RenderNode extends ch.bailu.gtk.type.Pointer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RenderNode.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnParseErrorFunc {
        /**
         * Type of callback that is called when an error occurs
         * <br>during node deserialization.
         * @param start start of the error location
         * @param end end of the error location
         * @param error the error
         * @param user_data user data
        */
        void onParseErrorFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParseLocation start, @Nonnull ParseLocation end, @Nonnull ch.bailu.gtk.glib.Error error, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaRenderNode.OnParseErrorFunc toOnParseErrorFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnParseErrorFunc in) {
        JnaRenderNode.OnParseErrorFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_start, _end, _error, _user_data) -> in.onParseErrorFunc(__callback, new ParseLocation(new PointerContainer(_start)), new ParseLocation(new PointerContainer(_end)), new ch.bailu.gtk.glib.Error(new PointerContainer(_error)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public RenderNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Draw the contents of &#64;node to the given cairo context.
     * <br>
     * <br>Typically, you'll use this function to implement fallback rendering
     * <br>of `GskRenderNode`s on an intermediate Cairo context, instead of using
     * <br>the drawing context associated to a [class&#64;Gdk.Surface]'s rendering buffer.
     * <br>
     * <br>For advanced nodes that cannot be supported using Cairo, in particular
     * <br>for nodes doing 3D operations, this function may fail.
     * @param cr cairo context to draw to
    */
    public void draw(@Nonnull ch.bailu.gtk.cairo.Context cr)  {
        JnaRenderNode.INST().gsk_render_node_draw(asCPointer(), asCPointerNotNull(cr));
    }

    /**
     * Retrieves the boundaries of the &#64;node.
     * <br>
     * <br>The node will not draw outside of its boundaries.
     * @param bounds return location for the boundaries
    */
    public void getBounds(@Nonnull ch.bailu.gtk.graphene.Rect bounds)  {
        JnaRenderNode.INST().gsk_render_node_get_bounds(asCPointer(), asCPointerNotNull(bounds));
    }

    /**
     * Returns the type of the &#64;node.
     * @return the type of the `GskRenderNode`
    */
    public int getNodeType()  {
        return JnaRenderNode.INST().gsk_render_node_get_node_type(asCPointer());
    }

    /**
     * Acquires a reference on the given `GskRenderNode`.
     * @return the `GskRenderNode` with an additional reference
    */
    public RenderNode ref()  {
        return new RenderNode(new PointerContainer(JnaRenderNode.INST().gsk_render_node_ref(asCPointer())));
    }

    /**
     * Serializes the &#64;node for later deserialization via
     * <br>gsk_render_node_deserialize(). No guarantees are made about the format
     * <br>used other than that the same version of GTK will be able to deserialize
     * <br>the result of a call to gsk_render_node_serialize() and
     * <br>gsk_render_node_deserialize() will correctly reject files it cannot open
     * <br>that were created with previous versions of GTK.
     * <br>
     * <br>The intended use of this functions is testing, benchmarking and debugging.
     * <br>The format is not meant as a permanent storage format.
     * @return a `GBytes` representing the node.
    */
    public ch.bailu.gtk.glib.Bytes serialize()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaRenderNode.INST().gsk_render_node_serialize(asCPointer())));
    }

    /**
     * Releases a reference on the given `GskRenderNode`.
     * <br>
     * <br>If the reference was the last, the resources associated to the &#64;node are
     * <br>freed.
    */
    public void unref()  {
        JnaRenderNode.INST().gsk_render_node_unref(asCPointer());
    }

    /**
     * This function is equivalent to calling [method&#64;Gsk.RenderNode.serialize]
     * <br>followed by [func&#64;GLib.file_set_contents].
     * <br>
     * <br>See those two functions for details on the arguments.
     * <br>
     * <br>It is mostly intended for use inside a debugger to quickly dump a render
     * <br>node to a file for later inspection.
     * @param filename the file to save it to.
     * @return %TRUE if saving was successful
    */
    public boolean writeToFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRenderNode.INST().gsk_render_node_write_to_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * This function is equivalent to calling [method&#64;Gsk.RenderNode.serialize]
     * <br>followed by [func&#64;GLib.file_set_contents].
     * <br>
     * <br>See those two functions for details on the arguments.
     * <br>
     * <br>It is mostly intended for use inside a debugger to quickly dump a render
     * <br>node to a file for later inspection.
     * @param filename the file to save it to.
     * @return %TRUE if saving was successful
    */
    public boolean writeToFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRenderNode.INST().gsk_render_node_write_to_file(asCPointer(), filename, 0L);
    }

    /**
     * Loads data previously created via [method&#64;Gsk.RenderNode.serialize].
     * <br>
     * <br>For a discussion of the supported format, see that function.
     * @param bytes the bytes containing the data
     * @param error_func Callback on parsing errors
     * @param user_data user_data for &#64;error_func
     * @return a new `GskRenderNode`
    */
    public static RenderNode deserialize(@Nonnull ch.bailu.gtk.glib.Bytes bytes, OnParseErrorFunc error_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new RenderNode(new PointerContainer(JnaRenderNode.INST().gsk_render_node_deserialize(asCPointerNotNull(bytes), toOnParseErrorFunc(getClassHandler().getInstance(), "deserialize", error_func), asCPointer(user_data))));
    }

    public static long getTypeID() { 
        return JnaRenderNode.INST().gsk_render_node_get_type(); 
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
