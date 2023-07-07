/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node cross fading between two child nodes.
 * <p><a href="https://docs.gtk.org/gsk4/class.CrossFadeNode.html">https://docs.gtk.org/gsk4/class.CrossFadeNode.html</a></p>
*/
public class CrossFadeNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CrossFadeNode.class.getCanonicalName());
    }

    public CrossFadeNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will do a cross-fade between &#64;start and &#64;end.
     * @param start The start node to be drawn
     * @param end The node to be cross_fadeed onto the &#64;start node
     * @param progress How far the fade has progressed from start to end. The value will     be clamped to the range [0 ... 1]
    */
    public CrossFadeNode(@Nonnull RenderNode start, @Nonnull RenderNode end, float progress) {
        super(cast(JnaCrossFadeNode.INST().gsk_cross_fade_node_new(asCPointerNotNull(start), asCPointerNotNull(end), progress)));
    }

    /**
     * Retrieves the child `GskRenderNode` at the end of the cross-fade.
     * @return a `GskRenderNode`
    */
    public RenderNode getEndChild()  {
        return new RenderNode(new PointerContainer(JnaCrossFadeNode.INST().gsk_cross_fade_node_get_end_child(asCPointer())));
    }

    /**
     * Retrieves the progress value of the cross fade.
     * @return the progress value, between 0 and 1
    */
    public float getProgress()  {
        return JnaCrossFadeNode.INST().gsk_cross_fade_node_get_progress(asCPointer());
    }

    /**
     * Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
     * @return a `GskRenderNode`
    */
    public RenderNode getStartChild()  {
        return new RenderNode(new PointerContainer(JnaCrossFadeNode.INST().gsk_cross_fade_node_get_start_child(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaCrossFadeNode.INST().gsk_cross_fade_node_get_type(); 
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
