/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Gsk extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gsk.class.getCanonicalName());
    }

    /**
     * 
     * @return 
    */
    public static int serializationErrorQuark()  {
        return JnaGsk.INST().gsk_serialization_error_quark();
    }

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`, and acquires
     * <br>a reference to it.
     * @param value a [struct&#64;GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
    */
    public static RenderNode valueDupRenderNode(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return new RenderNode(new PointerContainer(JnaGsk.INST().gsk_value_dup_render_node(asCPointerNotNull(value))));
    }

    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`.
     * @param value a `GValue` initialized with type `GSK_TYPE_RENDER_NODE`
     * @return a `GskRenderNode`
    */
    public static RenderNode valueGetRenderNode(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return new RenderNode(new PointerContainer(JnaGsk.INST().gsk_value_get_render_node(asCPointerNotNull(value))));
    }

    /**
     * Stores the given `GskRenderNode` inside `value`.
     * <br>
     * <br>The [struct&#64;GObject.Value] will acquire a reference to the `node`.
     * @param value a [struct&#64;GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
    */
    public static void valueSetRenderNode(@Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull RenderNode node)  {
        JnaGsk.INST().gsk_value_set_render_node(asCPointerNotNull(value), asCPointerNotNull(node));
    }

    /**
     * Stores the given `GskRenderNode` inside `value`.
     * <br>
     * <br>This function transfers the ownership of the `node` to the `GValue`.
     * @param value a [struct&#64;GObject.Value] initialized with type `GSK_TYPE_RENDER_NODE`
     * @param node a `GskRenderNode`
    */
    public static void valueTakeRenderNode(@Nonnull ch.bailu.gtk.gobject.Value value, @Nullable RenderNode node)  {
        JnaGsk.INST().gsk_value_take_render_node(asCPointerNotNull(value), asCPointer(node));
    }

}

/*
package-type

[MethodModel:java-type-not-supported:transformParse:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GskTransform**}}:{j:}]
*/
