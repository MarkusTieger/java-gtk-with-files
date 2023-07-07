/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTypeModule provides a simple implementation of the &#35;GTypePlugin
 * <br>interface.
 * <br>
 * <br>The model of &#35;GTypeModule is a dynamically loaded module which
 * <br>implements some number of types and interface implementations.
 * <br>
 * <br>When the module is loaded, it registers its types and interfaces
 * <br>using g_type_module_register_type() and g_type_module_add_interface().
 * <br>As long as any instances of these types and interface implementations
 * <br>are in use, the module is kept loaded. When the types and interfaces
 * <br>are gone, the module may be unloaded. If the types and interfaces
 * <br>become used again, the module will be reloaded. Note that the last
 * <br>reference cannot be released from within the module code, since that
 * <br>would lead to the caller's code being unloaded before g_object_unref()
 * <br>returns to it.
 * <br>
 * <br>Keeping track of whether the module should be loaded or not is done by
 * <br>using a use count - it starts at zero, and whenever it is greater than
 * <br>zero, the module is loaded. The use count is maintained internally by
 * <br>the type system, but also can be explicitly controlled by
 * <br>g_type_module_use() and g_type_module_unuse(). Typically, when loading
 * <br>a module for the first type, g_type_module_use() will be used to load
 * <br>it so that it can initialize its types. At some later point, when the
 * <br>module no longer needs to be loaded except for the type
 * <br>implementations it contains, g_type_module_unuse() is called.
 * <br>
 * <br>&#35;GTypeModule does not actually provide any implementation of module
 * <br>loading and unloading. To create a particular module type you must
 * <br>derive from &#35;GTypeModule and implement the load and unload functions
 * <br>in &#35;GTypeModuleClass.
 * <p><a href="https://docs.gtk.org/gobject/class.TypeModule.html">https://docs.gtk.org/gobject/class.TypeModule.html</a></p>
*/
public class TypeModule extends Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeModule.class.getCanonicalName());
    }

    public TypeModule(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Registers an additional interface for a type, whose interface lives
     * <br>in the given type plugin. If the interface was already registered
     * <br>for the type in this plugin, nothing will be done.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_add_interface_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param instance_type type to which to add the interface.
     * @param interface_type interface type to add
     * @param interface_info type information structure
    */
    public void addInterface(long instance_type, long interface_type, @Nonnull InterfaceInfo interface_info)  {
        JnaTypeModule.INST().g_type_module_add_interface(asCPointer(), instance_type, interface_type, asCPointerNotNull(interface_info));
    }

    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param const_static_values an array of &#35;GEnumValue structs for the                       possible enumeration values. The array is                       terminated by a struct with all members being                       0.
     * @return the new or existing type ID
    */
    public long registerEnum(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull EnumValue const_static_values)  {
        return JnaTypeModule.INST().g_type_module_register_enum(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(const_static_values));
    }

    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param const_static_values an array of &#35;GEnumValue structs for the                       possible enumeration values. The array is                       terminated by a struct with all members being                       0.
     * @return the new or existing type ID
    */
    public long registerEnum(String name, @Nonnull EnumValue const_static_values)  {
        return JnaTypeModule.INST().g_type_module_register_enum(asCPointer(), name, asCPointerNotNull(const_static_values));
    }

    /**
     * Looks up or registers a flags type that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param const_static_values an array of &#35;GFlagsValue structs for the                       possible flags values. The array is                       terminated by a struct with all members being                       0.
     * @return the new or existing type ID
    */
    public long registerFlags(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull FlagsValue const_static_values)  {
        return JnaTypeModule.INST().g_type_module_register_flags(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(const_static_values));
    }

    /**
     * Looks up or registers a flags type that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param const_static_values an array of &#35;GFlagsValue structs for the                       possible flags values. The array is                       terminated by a struct with all members being                       0.
     * @return the new or existing type ID
    */
    public long registerFlags(String name, @Nonnull FlagsValue const_static_values)  {
        return JnaTypeModule.INST().g_type_module_register_flags(asCPointer(), name, asCPointerNotNull(const_static_values));
    }

    /**
     * Looks up or registers a type that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>When reregistering a type (typically because a module is unloaded
     * <br>then reloaded, and reinitialized), &#64;module and &#64;parent_type must
     * <br>be the same as they were previously.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param parent_type the type for the parent class
     * @param type_name name for the type
     * @param type_info type information structure
     * @param flags flags field providing details about the type
     * @return the new or existing type ID
    */
    public long registerType(long parent_type, @Nonnull ch.bailu.gtk.type.Str type_name, @Nonnull TypeInfo type_info, int flags)  {
        return JnaTypeModule.INST().g_type_module_register_type(asCPointer(), parent_type, asCPointerNotNull(type_name), asCPointerNotNull(type_info), flags);
    }

    /**
     * Looks up or registers a type that is implemented with a particular
     * <br>type plugin. If a type with name &#64;type_name was previously registered,
     * <br>the &#35;GType identifier for the type is returned, otherwise the type
     * <br>is newly registered, and the resulting &#35;GType identifier returned.
     * <br>
     * <br>When reregistering a type (typically because a module is unloaded
     * <br>then reloaded, and reinitialized), &#64;module and &#64;parent_type must
     * <br>be the same as they were previously.
     * <br>
     * <br>As long as any instances of the type exist, the type plugin will
     * <br>not be unloaded.
     * <br>
     * <br>Since 2.56 if &#64;module is %NULL this will call g_type_register_static()
     * <br>instead. This can be used when making a static build of the module.
     * @param parent_type the type for the parent class
     * @param type_name name for the type
     * @param type_info type information structure
     * @param flags flags field providing details about the type
     * @return the new or existing type ID
    */
    public long registerType(long parent_type, String type_name, @Nonnull TypeInfo type_info, int flags)  {
        return JnaTypeModule.INST().g_type_module_register_type(asCPointer(), parent_type, type_name, asCPointerNotNull(type_info), flags);
    }

    /**
     * Sets the name for a &#35;GTypeModule
     * @param name a human-readable name to use in error messages.
    */
    public void setName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaTypeModule.INST().g_type_module_set_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets the name for a &#35;GTypeModule
     * @param name a human-readable name to use in error messages.
    */
    public void setName(String name)  {
        JnaTypeModule.INST().g_type_module_set_name(asCPointer(), name);
    }

    /**
     * Decreases the use count of a &#35;GTypeModule by one. If the
     * <br>result is zero, the module will be unloaded. (However, the
     * <br>&#35;GTypeModule will not be freed, and types associated with the
     * <br>&#35;GTypeModule are not unregistered. Once a &#35;GTypeModule is
     * <br>initialized, it must exist forever.)
    */
    public void unuse()  {
        JnaTypeModule.INST().g_type_module_unuse(asCPointer());
    }

    /**
     * Increases the use count of a &#35;GTypeModule by one. If the
     * <br>use count was zero before, the plugin will be loaded.
     * <br>If loading the plugin fails, the use count is reset to
     * <br>its prior value.
     * @return %FALSE if the plugin needed to be loaded and  loading the plugin failed.
    */
    public boolean use()  {
        return JnaTypeModule.INST().g_type_module_use(asCPointer());
    }

    /**
     * Implements interface {@link TypePlugin}. Call this to get access to interface functions.
     * @return {@link TypePlugin}
    */
    public TypePlugin asTypePlugin() {
        return new TypePlugin(cast());
    }

    public static long getTypeID() { 
        return JnaTypeModule.INST().g_type_module_get_type(); 
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
