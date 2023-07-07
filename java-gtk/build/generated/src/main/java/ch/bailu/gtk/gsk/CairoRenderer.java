/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GSK renderer that is using cairo.
 * <br>
 * <br>Since it is using cairo, this renderer cannot support
 * <br>3D transformations.
 * <p><a href="https://docs.gtk.org/gsk4/class.CairoRenderer.html">https://docs.gtk.org/gsk4/class.CairoRenderer.html</a></p>
*/
public class CairoRenderer extends Renderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CairoRenderer.class.getCanonicalName());
    }

    public CairoRenderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new Cairo renderer.
     * <br>
     * <br>The Cairo renderer is the fallback renderer drawing in ways similar
     * <br>to how GTK 3 drew its content. Its primary use is as comparison tool.
     * <br>
     * <br>The Cairo renderer is incomplete. It cannot render 3D transformed
     * <br>content and will instead render an error marker. Its usage should be
     * <br>avoided.
    */
    public CairoRenderer() {
        super(cast(JnaCairoRenderer.INST().gsk_cairo_renderer_new()));
    }

    public static long getTypeID() { 
        return JnaCairoRenderer.INST().gsk_cairo_renderer_get_type(); 
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
