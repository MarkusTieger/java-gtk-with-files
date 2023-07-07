/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gsk4/class.GLRenderer.html">https://docs.gtk.org/gsk4/class.GLRenderer.html</a></p>
*/
public class GLRenderer extends Renderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLRenderer.class.getCanonicalName());
    }

    public GLRenderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GskRenderer` using the new OpenGL renderer.
    */
    public GLRenderer() {
        super(cast(JnaGLRenderer.INST().gsk_gl_renderer_new()));
    }

    public static long getTypeID() { 
        return JnaGLRenderer.INST().gsk_gl_renderer_get_type(); 
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
