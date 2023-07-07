/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GTypePlugin interface is used by the type system in order to handle
 * <br>the lifecycle of dynamically loaded types.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypePluginClass.html">https://docs.gtk.org/gobject/struct.TypePluginClass.html</a></p>
*/
public class TypePluginClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypePluginClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTypePluginUse {
        /**
         * The type of the &#64;use_plugin function of &#35;GTypePluginClass, which gets called
         * <br>to increase the use count of &#64;plugin.
         * @param plugin the &#35;GTypePlugin whose use count should be increased
        */
        void onTypePluginUse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypePlugin plugin);
    }
    
    private static JnaTypePluginClass.OnTypePluginUse toOnTypePluginUse(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypePluginUse in) {
        JnaTypePluginClass.OnTypePluginUse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_plugin) -> in.onTypePluginUse(__callback, new TypePlugin(new PointerContainer(_plugin)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTypePluginUnuse {
        /**
         * The type of the &#64;unuse_plugin function of &#35;GTypePluginClass.
         * @param plugin the &#35;GTypePlugin whose use count should be decreased
        */
        void onTypePluginUnuse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypePlugin plugin);
    }
    
    private static JnaTypePluginClass.OnTypePluginUnuse toOnTypePluginUnuse(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypePluginUnuse in) {
        JnaTypePluginClass.OnTypePluginUnuse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_plugin) -> in.onTypePluginUnuse(__callback, new TypePlugin(new PointerContainer(_plugin)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTypePluginCompleteTypeInfo {
        /**
         * The type of the &#64;complete_type_info function of &#35;GTypePluginClass.
         * @param plugin the &#35;GTypePlugin
         * @param g_type the &#35;GType whose info is completed
         * @param info the &#35;GTypeInfo struct to fill in
         * @param value_table the &#35;GTypeValueTable to fill in
        */
        void onTypePluginCompleteTypeInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypePlugin plugin, long g_type, @Nonnull TypeInfo info, @Nonnull TypeValueTable value_table);
    }
    
    private static JnaTypePluginClass.OnTypePluginCompleteTypeInfo toOnTypePluginCompleteTypeInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypePluginCompleteTypeInfo in) {
        JnaTypePluginClass.OnTypePluginCompleteTypeInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_plugin, _g_type, _info, _value_table) -> in.onTypePluginCompleteTypeInfo(__callback, new TypePlugin(new PointerContainer(_plugin)), _g_type, new TypeInfo(new PointerContainer(_info)), new TypeValueTable(new PointerContainer(_value_table)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTypePluginCompleteInterfaceInfo {
        /**
         * The type of the &#64;complete_interface_info function of &#35;GTypePluginClass.
         * @param plugin the &#35;GTypePlugin
         * @param instance_type the &#35;GType of an instantiatable type to which the interface  is added
         * @param interface_type the &#35;GType of the interface whose info is completed
         * @param info the &#35;GInterfaceInfo to fill in
        */
        void onTypePluginCompleteInterfaceInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypePlugin plugin, long instance_type, long interface_type, @Nonnull InterfaceInfo info);
    }
    
    private static JnaTypePluginClass.OnTypePluginCompleteInterfaceInfo toOnTypePluginCompleteInterfaceInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypePluginCompleteInterfaceInfo in) {
        JnaTypePluginClass.OnTypePluginCompleteInterfaceInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_plugin, _instance_type, _interface_type, _info) -> in.onTypePluginCompleteInterfaceInfo(__callback, new TypePlugin(new PointerContainer(_plugin)), _instance_type, _interface_type, new InterfaceInfo(new PointerContainer(_info)));
            __callback.register(out);
        }
        return out;
    }

    public TypePluginClass(PointerContainer pointer) {
        super(pointer);
    }

    public TypePluginClass() {
        super(cast(JnaTypePluginClass.allocateStructure()));
    }

    private JnaTypePluginClass.Fields _fields;
    
    JnaTypePluginClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypePluginClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_IFACE = "base_iface";

    /**
     * Increases the use count of the plugin.
     * <br>See {@link OnTypePluginUse#onTypePluginUse}
    */
    public static final String USE_PLUGIN = "use_plugin";

    /**
     * Increases the use count of the plugin.
     * <br>See {@link OnTypePluginUse#onTypePluginUse}
    */
    public void setFieldUsePlugin(OnTypePluginUse use_plugin) {
        toFields().use_plugin = toOnTypePluginUse(this, USE_PLUGIN, use_plugin);
        toFields().writeField(USE_PLUGIN);
    }

    /**
     * Increases the use count of the plugin.
     * <br>See {@link OnTypePluginUse#onTypePluginUse}
    */
    public JnaTypePluginClass.OnTypePluginUse getFieldUsePlugin() {
       toFields().readField(USE_PLUGIN);
       return toFields().use_plugin;
    } 

    /**
     * Decreases the use count of the plugin.
     * <br>See {@link OnTypePluginUnuse#onTypePluginUnuse}
    */
    public static final String UNUSE_PLUGIN = "unuse_plugin";

    /**
     * Decreases the use count of the plugin.
     * <br>See {@link OnTypePluginUnuse#onTypePluginUnuse}
    */
    public void setFieldUnusePlugin(OnTypePluginUnuse unuse_plugin) {
        toFields().unuse_plugin = toOnTypePluginUnuse(this, UNUSE_PLUGIN, unuse_plugin);
        toFields().writeField(UNUSE_PLUGIN);
    }

    /**
     * Decreases the use count of the plugin.
     * <br>See {@link OnTypePluginUnuse#onTypePluginUnuse}
    */
    public JnaTypePluginClass.OnTypePluginUnuse getFieldUnusePlugin() {
       toFields().readField(UNUSE_PLUGIN);
       return toFields().unuse_plugin;
    } 

    /**
     * Fills in the &#35;GTypeInfo and
     * <br> &#35;GTypeValueTable structs for the type. The structs are initialized
     * <br> with `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteTypeInfo#onTypePluginCompleteTypeInfo}
    */
    public static final String COMPLETE_TYPE_INFO = "complete_type_info";

    /**
     * Fills in the &#35;GTypeInfo and
     * <br> &#35;GTypeValueTable structs for the type. The structs are initialized
     * <br> with `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteTypeInfo#onTypePluginCompleteTypeInfo}
    */
    public void setFieldCompleteTypeInfo(OnTypePluginCompleteTypeInfo complete_type_info) {
        toFields().complete_type_info = toOnTypePluginCompleteTypeInfo(this, COMPLETE_TYPE_INFO, complete_type_info);
        toFields().writeField(COMPLETE_TYPE_INFO);
    }

    /**
     * Fills in the &#35;GTypeInfo and
     * <br> &#35;GTypeValueTable structs for the type. The structs are initialized
     * <br> with `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteTypeInfo#onTypePluginCompleteTypeInfo}
    */
    public JnaTypePluginClass.OnTypePluginCompleteTypeInfo getFieldCompleteTypeInfo() {
       toFields().readField(COMPLETE_TYPE_INFO);
       return toFields().complete_type_info;
    } 

    /**
     * Fills in missing parts of the &#35;GInterfaceInfo
     * <br> for the interface. The structs is initialized with
     * <br> `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteInterfaceInfo#onTypePluginCompleteInterfaceInfo}
    */
    public static final String COMPLETE_INTERFACE_INFO = "complete_interface_info";

    /**
     * Fills in missing parts of the &#35;GInterfaceInfo
     * <br> for the interface. The structs is initialized with
     * <br> `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteInterfaceInfo#onTypePluginCompleteInterfaceInfo}
    */
    public void setFieldCompleteInterfaceInfo(OnTypePluginCompleteInterfaceInfo complete_interface_info) {
        toFields().complete_interface_info = toOnTypePluginCompleteInterfaceInfo(this, COMPLETE_INTERFACE_INFO, complete_interface_info);
        toFields().writeField(COMPLETE_INTERFACE_INFO);
    }

    /**
     * Fills in missing parts of the &#35;GInterfaceInfo
     * <br> for the interface. The structs is initialized with
     * <br> `memset(s, 0, sizeof (s))` before calling this function.
     * <br>See {@link OnTypePluginCompleteInterfaceInfo#onTypePluginCompleteInterfaceInfo}
    */
    public JnaTypePluginClass.OnTypePluginCompleteInterfaceInfo getFieldCompleteInterfaceInfo() {
       toFields().readField(COMPLETE_INTERFACE_INFO);
       return toFields().complete_interface_info;
    } 

}

/*
record-type
all-fields-supported
*/
