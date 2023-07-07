/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface that handles the lifecycle of dynamically loaded types.
 * <br>
 * <br>The GObject type system supports dynamic loading of types.
 * <br>It goes as follows:
 * <br>
 * <br>1. The type is initially introduced (usually upon loading the module
 * <br>   the first time, or by your main application that knows what modules
 * <br>   introduces what types), like this:
 *    <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *    new_type_id = g_type_register_dynamic (parent_type_id,
 *                                           &quot;TypeName&quot;,
 *                                           new_type_plugin,
 *                                           type_flags);
 *    </pre>
 * <br>   where &#64;new_type_plugin is an implementation of the
 * <br>   &#35;GTypePlugin interface.
 * <br>
 * <br>2. The type's implementation is referenced, e.g. through
 * <br>   g_type_class_ref() or through g_type_create_instance() (this is
 * <br>   being called by g_object_new()) or through one of the above done on
 * <br>   a type derived from &#64;new_type_id.
 * <br>
 * <br>3. This causes the type system to load the type's implementation by
 * <br>   calling g_type_plugin_use() and g_type_plugin_complete_type_info()
 * <br>   on &#64;new_type_plugin.
 * <br>
 * <br>4. At some point the type's implementation isn't required anymore,
 * <br>   e.g. after g_type_class_unref() or g_type_free_instance() (called
 * <br>   when the reference count of an instance drops to zero).
 * <br>
 * <br>5. This causes the type system to throw away the information retrieved
 * <br>   from g_type_plugin_complete_type_info() and then it calls
 * <br>   g_type_plugin_unuse() on &#64;new_type_plugin.
 * <br>
 * <br>6. Things may repeat from the second step.
 * <br>
 * <br>So basically, you need to implement a &#35;GTypePlugin type that
 * <br>carries a use_count, once use_count goes from zero to one, you need
 * <br>to load the implementation to successfully handle the upcoming
 * <br>g_type_plugin_complete_type_info() call. Later, maybe after
 * <br>succeeding use/unuse calls, once use_count drops to zero, you can
 * <br>unload the implementation again. The type system makes sure to call
 * <br>g_type_plugin_use() and g_type_plugin_complete_type_info() again
 * <br>when the type is needed again.
 * <br>
 * <br>&#35;GTypeModule is an implementation of &#35;GTypePlugin that already
 * <br>implements most of this except for the actual module loading and
 * <br>unloading. It even handles multiple registered types per module.
 * <p><a href="https://docs.gtk.org/gobject/iface.TypePlugin.html">https://docs.gtk.org/gobject/iface.TypePlugin.html</a></p>
*/
public class TypePlugin extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypePlugin.class.getCanonicalName());
    }

    public TypePlugin(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Calls the &#64;complete_interface_info function from the
     * <br>&#35;GTypePluginClass of &#64;plugin. There should be no need to use this
     * <br>function outside of the GObject type system itself.
     * @param instance_type the &#35;GType of an instantiatable type to which the interface  is added
     * @param interface_type the &#35;GType of the interface whose info is completed
     * @param info the &#35;GInterfaceInfo to fill in
    */
    public void completeInterfaceInfo(long instance_type, long interface_type, @Nonnull InterfaceInfo info)  {
        JnaTypePlugin.INST().g_type_plugin_complete_interface_info(asCPointer(), instance_type, interface_type, asCPointerNotNull(info));
    }

    /**
     * Calls the &#64;complete_type_info function from the &#35;GTypePluginClass of &#64;plugin.
     * <br>There should be no need to use this function outside of the GObject
     * <br>type system itself.
     * @param g_type the &#35;GType whose info is completed
     * @param info the &#35;GTypeInfo struct to fill in
     * @param value_table the &#35;GTypeValueTable to fill in
    */
    public void completeTypeInfo(long g_type, @Nonnull TypeInfo info, @Nonnull TypeValueTable value_table)  {
        JnaTypePlugin.INST().g_type_plugin_complete_type_info(asCPointer(), g_type, asCPointerNotNull(info), asCPointerNotNull(value_table));
    }

    /**
     * Calls the &#64;unuse_plugin function from the &#35;GTypePluginClass of
     * <br>&#64;plugin.  There should be no need to use this function outside of
     * <br>the GObject type system itself.
    */
    public void unuse()  {
        JnaTypePlugin.INST().g_type_plugin_unuse(asCPointer());
    }

    /**
     * Calls the &#64;use_plugin function from the &#35;GTypePluginClass of
     * <br>&#64;plugin.  There should be no need to use this function outside of
     * <br>the GObject type system itself.
    */
    public void use()  {
        JnaTypePlugin.INST().g_type_plugin_use(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTypePlugin.INST().g_type_plugin_get_type(); 
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
