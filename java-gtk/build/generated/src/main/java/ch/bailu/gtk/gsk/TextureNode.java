/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a `GdkTexture`.
 * <p><a href="https://docs.gtk.org/gsk4/class.TextureNode.html">https://docs.gtk.org/gsk4/class.TextureNode.html</a></p>
*/
public class TextureNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextureNode.class.getCanonicalName());
    }

    public TextureNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will render the given
     * <br>&#64;texture into the area given by &#64;bounds.
     * @param texture the `GdkTexture`
     * @param bounds the rectangle to render the texture into
    */
    public TextureNode(@Nonnull ch.bailu.gtk.gdk.Texture texture, @Nonnull ch.bailu.gtk.graphene.Rect bounds) {
        super(cast(JnaTextureNode.INST().gsk_texture_node_new(asCPointerNotNull(texture), asCPointerNotNull(bounds))));
    }

    /**
     * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
     * @return the `GdkTexture`
    */
    public ch.bailu.gtk.gdk.Texture getTexture()  {
        return new ch.bailu.gtk.gdk.Texture(new PointerContainer(JnaTextureNode.INST().gsk_texture_node_get_texture(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaTextureNode.INST().gsk_texture_node_get_type(); 
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
