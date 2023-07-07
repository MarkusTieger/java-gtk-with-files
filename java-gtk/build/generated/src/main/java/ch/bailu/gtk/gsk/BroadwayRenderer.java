/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gsk4/class.BroadwayRenderer.html">https://docs.gtk.org/gsk4/class.BroadwayRenderer.html</a></p>
*/
public class BroadwayRenderer extends Renderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BroadwayRenderer.class.getCanonicalName());
    }

    public BroadwayRenderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new Broadway renderer.
     * <br>
     * <br>The Broadway renderer is the default renderer for the broadway backend.
     * <br>It will only work with broadway surfaces, otherwise it will fail the
     * <br>call to gsk_renderer_realize().
     * <br>
     * <br>This function is only available when GTK was compiled with Broadway
     * <br>support.
    */
    public BroadwayRenderer() {
        super(cast(JnaBroadwayRenderer.INST().gsk_broadway_renderer_new()));
    }

    public static long getTypeID() { 
        return JnaBroadwayRenderer.INST().gsk_broadway_renderer_get_type(); 
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
