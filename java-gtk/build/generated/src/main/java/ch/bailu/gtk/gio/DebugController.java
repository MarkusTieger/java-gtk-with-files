/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDebugController is an interface to expose control of debugging features and
 * <br>debug output.
 * <br>
 * <br>It is implemented on Linux using &#35;GDebugControllerDBus, which exposes a D-Bus
 * <br>interface to allow authenticated peers to control debug features in this
 * <br>process.
 * <br>
 * <br>Whether debug output is enabled is exposed as
 * <br>&#35;GDebugController:debug-enabled. This controls g_log_set_debug_enabled() by
 * <br>default. Application code may connect to the &#35;GObject::notify signal for it
 * <br>to control other parts of its debug infrastructure as necessary.
 * <br>
 * <br>If your application or service is using the default GLib log writer function,
 * <br>creating one of the built-in implementations of &#35;GDebugController should be
 * <br>all that’s needed to dynamically enable or disable debug output.
 * <p><a href="https://docs.gtk.org/gio/iface.DebugController.html">https://docs.gtk.org/gio/iface.DebugController.html</a></p>
*/
public class DebugController extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugController.class.getCanonicalName());
    }

    public DebugController(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get the value of &#35;GDebugController:debug-enabled.
     * @return %TRUE if debug output should be exposed, %FALSE otherwise
    */
    public boolean getDebugEnabled()  {
        return JnaDebugController.INST().g_debug_controller_get_debug_enabled(asCPointer());
    }

    /**
     * Set the value of &#35;GDebugController:debug-enabled.
     * @param debug_enabled %TRUE if debug output should be exposed, %FALSE otherwise
    */
    public void setDebugEnabled(boolean debug_enabled)  {
        JnaDebugController.INST().g_debug_controller_set_debug_enabled(asCPointer(), debug_enabled);
    }

    public static long getTypeID() { 
        return JnaDebugController.INST().g_debug_controller_get_type(); 
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
interface-type
*/
