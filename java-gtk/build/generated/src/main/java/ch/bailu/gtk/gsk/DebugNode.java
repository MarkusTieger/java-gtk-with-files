/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node that emits a debugging message when drawing its
 * <br>child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.DebugNode.html">https://docs.gtk.org/gsk4/class.DebugNode.html</a></p>
*/
public class DebugNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugNode.class.getCanonicalName());
    }

    public DebugNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will add debug information about
     * <br>the given &#64;child.
     * <br>
     * <br>Adding this node has no visual effect.
     * @param child The child to add debug info for
     * @param message The debug message
    */
    public DebugNode(@Nonnull RenderNode child, @Nonnull ch.bailu.gtk.type.Str message) {
        super(cast(JnaDebugNode.INST().gsk_debug_node_new(asCPointerNotNull(child), asCPointerNotNull(message))));
    }

    /**
     * Gets the child node that is getting drawn by the given &#64;node.
     * @return the child `GskRenderNode`
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaDebugNode.INST().gsk_debug_node_get_child(asCPointer())));
    }

    /**
     * Gets the debug message that was set on this node
     * @return The debug message
    */
    public ch.bailu.gtk.type.Str getMessage()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDebugNode.INST().gsk_debug_node_get_message(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaDebugNode.INST().gsk_debug_node_get_type(); 
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
