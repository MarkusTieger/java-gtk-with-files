/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The list of functions that can be implemented for the `GtkShortcutManager`
 * <br>interface.
 * <br>
 * <br>Note that no function is mandatory to implement, the default implementation
 * <br>will work fine.
 * <p><a href="https://docs.gtk.org/gtk4/struct.ShortcutManagerInterface.html">https://docs.gtk.org/gtk4/struct.ShortcutManagerInterface.html</a></p>
*/
public class ShortcutManagerInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutManagerInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAddController {
        /**
         * 
         * @param self 
         * @param controller 
        */
        void onAddController(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ShortcutManager self, @Nonnull ShortcutController controller);
    }
    
    private static JnaShortcutManagerInterface.OnAddController toOnAddController(ch.bailu.gtk.type.Pointer instance, String methodName, OnAddController in) {
        JnaShortcutManagerInterface.OnAddController out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _controller) -> in.onAddController(__callback, new ShortcutManager(new PointerContainer(_self)), new ShortcutController(new PointerContainer(_controller)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoveController {
        /**
         * 
         * @param self 
         * @param controller 
        */
        void onRemoveController(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ShortcutManager self, @Nonnull ShortcutController controller);
    }
    
    private static JnaShortcutManagerInterface.OnRemoveController toOnRemoveController(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoveController in) {
        JnaShortcutManagerInterface.OnRemoveController out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _controller) -> in.onRemoveController(__callback, new ShortcutManager(new PointerContainer(_self)), new ShortcutController(new PointerContainer(_controller)));
            __callback.register(out);
        }
        return out;
    }

    public ShortcutManagerInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ShortcutManagerInterface() {
        super(cast(JnaShortcutManagerInterface.allocateStructure()));
    }

    private JnaShortcutManagerInterface.Fields _fields;
    
    JnaShortcutManagerInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaShortcutManagerInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnAddController#onAddController}
    */
    public static final String ADD_CONTROLLER = "add_controller";

    /**
     * 
     * <br>See {@link OnAddController#onAddController}
    */
    public void setFieldAddController(OnAddController add_controller) {
        toFields().add_controller = toOnAddController(this, ADD_CONTROLLER, add_controller);
        toFields().writeField(ADD_CONTROLLER);
    }

    /**
     * 
     * <br>See {@link OnAddController#onAddController}
    */
    public JnaShortcutManagerInterface.OnAddController getFieldAddController() {
       toFields().readField(ADD_CONTROLLER);
       return toFields().add_controller;
    } 

    /**
     * 
     * <br>See {@link OnRemoveController#onRemoveController}
    */
    public static final String REMOVE_CONTROLLER = "remove_controller";

    /**
     * 
     * <br>See {@link OnRemoveController#onRemoveController}
    */
    public void setFieldRemoveController(OnRemoveController remove_controller) {
        toFields().remove_controller = toOnRemoveController(this, REMOVE_CONTROLLER, remove_controller);
        toFields().writeField(REMOVE_CONTROLLER);
    }

    /**
     * 
     * <br>See {@link OnRemoveController#onRemoveController}
    */
    public JnaShortcutManagerInterface.OnRemoveController getFieldRemoveController() {
       toFields().readField(REMOVE_CONTROLLER);
       return toFields().remove_controller;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ShortcutManager.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ShortcutManager.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
