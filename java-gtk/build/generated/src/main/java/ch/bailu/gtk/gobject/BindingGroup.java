/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GBindingGroup can be used to bind multiple properties
 * <br>from an object collectively.
 * <br>
 * <br>Use the various methods to bind properties from a single source
 * <br>object to multiple destination objects. Properties can be bound
 * <br>bidirectionally and are connected when the source object is set
 * <br>with g_binding_group_set_source().
 * <p><a href="https://docs.gtk.org/gobject/class.BindingGroup.html">https://docs.gtk.org/gobject/class.BindingGroup.html</a></p>
*/
public class BindingGroup extends Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BindingGroup.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBindingTransformFunc {
        /**
         * A function to be called to transform &#64;from_value to &#64;to_value.
         * <br>
         * <br>If this is the &#64;transform_to function of a binding, then &#64;from_value
         * <br>is the &#64;source_property on the &#64;source object, and &#64;to_value is the
         * <br>&#64;target_property on the &#64;target object. If this is the
         * <br>&#64;transform_from function of a %G_BINDING_BIDIRECTIONAL binding,
         * <br>then those roles are reversed.
         * @param binding a &#35;GBinding
         * @param from_value the &#35;GValue containing the value to transform
         * @param to_value the &#35;GValue in which to store the transformed value
         * @param user_data data passed to the transform function
         * @return %TRUE if the transformation was successful, and %FALSE   otherwise
        */
        boolean onBindingTransformFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Binding binding, @Nonnull Value from_value, @Nonnull Value to_value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaBindingGroup.OnBindingTransformFunc toOnBindingTransformFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBindingTransformFunc in) {
        JnaBindingGroup.OnBindingTransformFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_binding, _from_value, _to_value, _user_data) -> in.onBindingTransformFunc(__callback, new Binding(new PointerContainer(_binding)), new Value(new PointerContainer(_from_value)), new Value(new PointerContainer(_to_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaBindingGroup.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaBindingGroup.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public BindingGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GBindingGroup.
    */
    public BindingGroup() {
        super(cast(JnaBindingGroup.INST().g_binding_group_new()));
    }

    /**
     * Creates a binding between &#64;source_property on the source object
     * <br>and &#64;target_property on &#64;target. Whenever the &#64;source_property
     * <br>is changed the &#64;target_property is updated using the same value.
     * <br>The binding flag %G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>See g_object_bind_property() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
    */
    public void bind(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags)  {
        JnaBindingGroup.INST().g_binding_group_bind(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags);
    }

    /**
     * Creates a binding between &#64;source_property on the source object
     * <br>and &#64;target_property on &#64;target. Whenever the &#64;source_property
     * <br>is changed the &#64;target_property is updated using the same value.
     * <br>The binding flag %G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>See g_object_bind_property() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
    */
    public void bind(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags)  {
        JnaBindingGroup.INST().g_binding_group_bind(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags);
    }

    /**
     * Creates a binding between &#64;source_property on the source object and
     * <br>&#64;target_property on &#64;target, allowing you to set the transformation
     * <br>functions to be used by the binding. The binding flag
     * <br>%G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>See g_object_bind_property_full() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
     * @param transform_to the transformation function     from the source object to the &#64;target, or %NULL to use the default
     * @param transform_from the transformation function     from the &#64;target to the source object, or %NULL to use the default
     * @param user_data custom data to be passed to the transformation             functions, or %NULL
     * @param user_data_destroy function to be called when disposing the binding,     to free the resources used by the transformation functions
    */
    public void bindFull(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags, OnBindingTransformFunc transform_to, OnBindingTransformFunc transform_from, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_destroy)  {
        JnaBindingGroup.INST().g_binding_group_bind_full(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags, toOnBindingTransformFunc(this, "bindFull", transform_to), toOnBindingTransformFunc(this, "bindFull", transform_from), asCPointer(user_data), toOnDestroyNotify(this, "bindFull", user_data_destroy));
    }

    /**
     * Creates a binding between &#64;source_property on the source object and
     * <br>&#64;target_property on &#64;target, allowing you to set the transformation
     * <br>functions to be used by the binding. The binding flag
     * <br>%G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>See g_object_bind_property_full() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
     * @param transform_to the transformation function     from the source object to the &#64;target, or %NULL to use the default
     * @param transform_from the transformation function     from the &#64;target to the source object, or %NULL to use the default
     * @param user_data custom data to be passed to the transformation             functions, or %NULL
     * @param user_data_destroy function to be called when disposing the binding,     to free the resources used by the transformation functions
    */
    public void bindFull(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags, OnBindingTransformFunc transform_to, OnBindingTransformFunc transform_from, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_destroy)  {
        JnaBindingGroup.INST().g_binding_group_bind_full(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags, toOnBindingTransformFunc(this, "bindFull", transform_to), toOnBindingTransformFunc(this, "bindFull", transform_from), asCPointer(user_data), toOnDestroyNotify(this, "bindFull", user_data_destroy));
    }

    /**
     * Creates a binding between &#64;source_property on the source object and
     * <br>&#64;target_property on &#64;target, allowing you to set the transformation
     * <br>functions to be used by the binding. The binding flag
     * <br>%G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>This function is the language bindings friendly version of
     * <br>g_binding_group_bind_property_full(), using &#35;GClosures
     * <br>instead of function pointers.
     * <br>
     * <br>See g_object_bind_property_with_closures() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
     * @param transform_to a &#35;GClosure wrapping the     transformation function from the source object to the &#64;target,     or %NULL to use the default
     * @param transform_from a &#35;GClosure wrapping the     transformation function from the &#64;target to the source object,     or %NULL to use the default
    */
    public void bindWithClosures(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags, @Nullable Closure transform_to, @Nullable Closure transform_from)  {
        JnaBindingGroup.INST().g_binding_group_bind_with_closures(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags, asCPointer(transform_to), asCPointer(transform_from));
    }

    /**
     * Creates a binding between &#64;source_property on the source object and
     * <br>&#64;target_property on &#64;target, allowing you to set the transformation
     * <br>functions to be used by the binding. The binding flag
     * <br>%G_BINDING_SYNC_CREATE is automatically specified.
     * <br>
     * <br>This function is the language bindings friendly version of
     * <br>g_binding_group_bind_property_full(), using &#35;GClosures
     * <br>instead of function pointers.
     * <br>
     * <br>See g_object_bind_property_with_closures() for more information.
     * @param source_property the property on the source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags the flags used to create the &#35;GBinding
     * @param transform_to a &#35;GClosure wrapping the     transformation function from the source object to the &#64;target,     or %NULL to use the default
     * @param transform_from a &#35;GClosure wrapping the     transformation function from the &#64;target to the source object,     or %NULL to use the default
    */
    public void bindWithClosures(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags, @Nullable Closure transform_to, @Nullable Closure transform_from)  {
        JnaBindingGroup.INST().g_binding_group_bind_with_closures(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags, asCPointer(transform_to), asCPointer(transform_from));
    }

    /**
     * Gets the source object used for binding properties.
     * @return a &#35;GObject or %NULL.
    */
    public ch.bailu.gtk.type.Pointer dupSource()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBindingGroup.INST().g_binding_group_dup_source(asCPointer())));
    }

    /**
     * Sets &#64;source as the source object used for creating property
     * <br>bindings. If there is already a source object all bindings from it
     * <br>will be removed.
     * <br>
     * <br>Note that all properties that have been bound must exist on &#64;source.
     * @param source the source &#35;GObject,   or %NULL to clear it
    */
    public void setSource(@Nullable ch.bailu.gtk.type.Pointer source)  {
        JnaBindingGroup.INST().g_binding_group_set_source(asCPointer(), asCPointer(source));
    }

    public static long getTypeID() { 
        return JnaBindingGroup.INST().g_binding_group_get_type(); 
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
