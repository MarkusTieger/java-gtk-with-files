/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure that provides information to the type system which is
 * <br>used specifically for managing interface types.
 * <p><a href="https://docs.gtk.org/gobject/struct.InterfaceInfo.html">https://docs.gtk.org/gobject/struct.InterfaceInfo.html</a></p>
*/
public class InterfaceInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InterfaceInfo.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInterfaceInitFunc {
        /**
         * A callback function used by the type system to initialize a new
         * <br>interface.
         * <br>
         * <br>This function should initialize all internal data and* allocate any
         * <br>resources required by the interface.
         * <br>
         * <br>The members of &#64;iface_data are guaranteed to have been filled with
         * <br>zeros before this function is called.
         * @param g_iface The interface structure to initialize
         * @param iface_data The &#64;interface_data supplied via the &#35;GInterfaceInfo structure
        */
        void onInterfaceInitFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_iface, @Nullable ch.bailu.gtk.type.Pointer iface_data);
    }
    
    private static JnaInterfaceInfo.OnInterfaceInitFunc toOnInterfaceInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceInitFunc in) {
        JnaInterfaceInfo.OnInterfaceInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_iface, _iface_data) -> in.onInterfaceInitFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_iface)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_iface_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceFinalizeFunc {
        /**
         * A callback function used by the type system to finalize an interface.
         * <br>
         * <br>This function should destroy any internal data and release any resources
         * <br>allocated by the corresponding GInterfaceInitFunc() function.
         * @param g_iface The interface structure to finalize
         * @param iface_data The &#64;interface_data supplied via the &#35;GInterfaceInfo structure
        */
        void onInterfaceFinalizeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_iface, @Nullable ch.bailu.gtk.type.Pointer iface_data);
    }
    
    private static JnaInterfaceInfo.OnInterfaceFinalizeFunc toOnInterfaceFinalizeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceFinalizeFunc in) {
        JnaInterfaceInfo.OnInterfaceFinalizeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_iface, _iface_data) -> in.onInterfaceFinalizeFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_iface)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_iface_data)));
            __callback.register(out);
        }
        return out;
    }

    public InterfaceInfo(PointerContainer pointer) {
        super(pointer);
    }

    public InterfaceInfo() {
        super(cast(JnaInterfaceInfo.allocateStructure()));
    }

    private JnaInterfaceInfo.Fields _fields;
    
    JnaInterfaceInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInterfaceInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * location of the interface initialization function
     * <br>See {@link OnInterfaceInitFunc#onInterfaceInitFunc}
    */
    public static final String INTERFACE_INIT = "interface_init";

    /**
     * location of the interface initialization function
     * <br>See {@link OnInterfaceInitFunc#onInterfaceInitFunc}
    */
    public void setFieldInterfaceInit(OnInterfaceInitFunc interface_init) {
        toFields().interface_init = toOnInterfaceInitFunc(this, INTERFACE_INIT, interface_init);
        toFields().writeField(INTERFACE_INIT);
    }

    /**
     * location of the interface initialization function
     * <br>See {@link OnInterfaceInitFunc#onInterfaceInitFunc}
    */
    public JnaInterfaceInfo.OnInterfaceInitFunc getFieldInterfaceInit() {
       toFields().readField(INTERFACE_INIT);
       return toFields().interface_init;
    } 

    /**
     * location of the interface finalization function
     * <br>See {@link OnInterfaceFinalizeFunc#onInterfaceFinalizeFunc}
    */
    public static final String INTERFACE_FINALIZE = "interface_finalize";

    /**
     * location of the interface finalization function
     * <br>See {@link OnInterfaceFinalizeFunc#onInterfaceFinalizeFunc}
    */
    public void setFieldInterfaceFinalize(OnInterfaceFinalizeFunc interface_finalize) {
        toFields().interface_finalize = toOnInterfaceFinalizeFunc(this, INTERFACE_FINALIZE, interface_finalize);
        toFields().writeField(INTERFACE_FINALIZE);
    }

    /**
     * location of the interface finalization function
     * <br>See {@link OnInterfaceFinalizeFunc#onInterfaceFinalizeFunc}
    */
    public JnaInterfaceInfo.OnInterfaceFinalizeFunc getFieldInterfaceFinalize() {
       toFields().readField(INTERFACE_FINALIZE);
       return toFields().interface_finalize;
    } 

    /**
     * user-supplied data passed to the interface init/finalize functions
    */
    public static final String INTERFACE_DATA = "interface_data";

    /**
     * user-supplied data passed to the interface init/finalize functions
    */
    public void setFieldInterfaceData(ch.bailu.gtk.type.Pointer interface_data) {
        toFields().interface_data = interface_data.asCPointer();
        toFields().writeField(INTERFACE_DATA);
    }

    /**
     * user-supplied data passed to the interface init/finalize functions
    */
    public ch.bailu.gtk.type.Pointer getFieldInterfaceData() {
       toFields().readField(INTERFACE_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().interface_data));
    } 

}

/*
record-type
all-fields-supported
*/
