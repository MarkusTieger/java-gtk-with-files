/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node using a GL shader when drawing its children nodes.
 * <p><a href="https://docs.gtk.org/gsk4/class.GLShaderNode.html">https://docs.gtk.org/gsk4/class.GLShaderNode.html</a></p>
*/
public class GLShaderNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLShaderNode.class.getCanonicalName());
    }

    public GLShaderNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets args for the node.
     * @return A `GBytes` with the uniform arguments
    */
    public ch.bailu.gtk.glib.Bytes getArgs()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaGLShaderNode.INST().gsk_gl_shader_node_get_args(asCPointer())));
    }

    /**
     * Gets one of the children.
     * @param idx the position of the child to get
     * @return the &#64;idx'th child of &#64;node
    */
    public RenderNode getChild(int idx)  {
        return new RenderNode(new PointerContainer(JnaGLShaderNode.INST().gsk_gl_shader_node_get_child(asCPointer(), idx)));
    }

    /**
     * Returns the number of children
     * @return The number of children
    */
    public int getNChildren()  {
        return JnaGLShaderNode.INST().gsk_gl_shader_node_get_n_children(asCPointer());
    }

    /**
     * Gets shader code for the node.
     * @return the `GskGLShader` shader
    */
    public GLShader getShader()  {
        return new GLShader(new PointerContainer(JnaGLShaderNode.INST().gsk_gl_shader_node_get_shader(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaGLShaderNode.INST().gsk_gl_shader_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:GLShaderNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:GLShader:{c:GskGLShader*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bytes:{c:GBytes*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GskRenderNode**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
*/
