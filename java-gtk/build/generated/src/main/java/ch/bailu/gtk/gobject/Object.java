/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The base object type.
 * <br>
 * <br>All the fields in the `GObject` structure are private to the implementation
 * <br>and should never be accessed directly.
 * <br>
 * <br>Since GLib 2.72, all &#35;GObjects are guaranteed to be aligned to at least the
 * <br>alignment of the largest basic GLib type (typically this is &#35;guint64 or
 * <br>&#35;gdouble). If you need larger alignment for an element in a &#35;GObject, you
 * <br>should allocate it on the heap (aligned), or arrange for your &#35;GObject to be
 * <br>appropriately padded. This guarantee applies to the &#35;GObject (or derived)
 * <br>struct, the &#35;GObjectClass (or derived) struct, and any private data allocated
 * <br>by G_ADD_PRIVATE().
 * <p><a href="https://docs.gtk.org/gobject/class.Object.html">https://docs.gtk.org/gobject/class.Object.html</a></p>
*/
public class Object extends ch.bailu.gtk.type.Pointer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Object.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToggleNotify {
        /**
         * A callback function used for notification when the state
         * <br>of a toggle reference changes.
         * <br>
         * <br>See also: g_object_add_toggle_ref()
         * @param data Callback data passed to g_object_add_toggle_ref()
         * @param object The object on which g_object_add_toggle_ref() was called.
         * @param is_last_ref %TRUE if the toggle reference is now the  last reference to the object. %FALSE if the toggle  reference was the last reference and there are now other  references.
        */
        void onToggleNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Object object, boolean is_last_ref);
    }
    
    private static JnaObject.OnToggleNotify toOnToggleNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnToggleNotify in) {
        JnaObject.OnToggleNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _object, _is_last_ref) -> in.onToggleNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Object(new PointerContainer(_object)), _is_last_ref);
            __callback.register(out);
        }
        return out;
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
    
    private static JnaObject.OnBindingTransformFunc toOnBindingTransformFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBindingTransformFunc in) {
        JnaObject.OnBindingTransformFunc out = null;
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
    
    private static JnaObject.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaObject.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDuplicateFunc {
        /**
         * The type of functions that are used to 'duplicate' an object.
         * <br>What this means depends on the context, it could just be
         * <br>incrementing the reference count, if &#64;data is a ref-counted
         * <br>object.
         * @param data the data to duplicate
         * @param user_data user data that was specified in             g_datalist_id_dup_data()
         * @return a duplicate of data
        */
        ch.bailu.gtk.type.Pointer onDuplicateFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaObject.OnDuplicateFunc toOnDuplicateFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnDuplicateFunc in) {
        JnaObject.OnDuplicateFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _user_data) -> in.onDuplicateFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWeakNotify {
        /**
         * A &#35;GWeakNotify function can be added to an object as a callback that gets
         * <br>triggered when the object is finalized.
         * <br>
         * <br>Since the object is already being disposed when the &#35;GWeakNotify is called,
         * <br>there's not much you could do with the object, apart from e.g. using its
         * <br>address as hash-index or the like.
         * <br>
         * <br>In particular, this means it’s invalid to call g_object_ref(),
         * <br>g_weak_ref_init(), g_weak_ref_set(), g_object_add_toggle_ref(),
         * <br>g_object_weak_ref(), g_object_add_weak_pointer() or any function which calls
         * <br>them on the object from this callback.
         * @param data data that was provided when the weak reference was established
         * @param where_the_object_was the object being disposed
        */
        void onWeakNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Object where_the_object_was);
    }
    
    private static JnaObject.OnWeakNotify toOnWeakNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnWeakNotify in) {
        JnaObject.OnWeakNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _where_the_object_was) -> in.onWeakNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Object(new PointerContainer(_where_the_object_was)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnNotify {
        /**
         * The notify signal is emitted on an object when one of its properties has
         * <br>its value set through g_object_set_property(), g_object_set(), et al.
         * <br>
         * <br>Note that getting this signal doesn’t itself guarantee that the value of
         * <br>the property has actually changed. When it is emitted is determined by the
         * <br>derived GObject class. If the implementor did not create the property with
         * <br>%G_PARAM_EXPLICIT_NOTIFY, then any call to g_object_set_property() results
         * <br>in ::notify being emitted, even if the new value is the same as the old.
         * <br>If they did pass %G_PARAM_EXPLICIT_NOTIFY, then this signal is emitted only
         * <br>when they explicitly call g_object_notify() or g_object_notify_by_pspec(),
         * <br>and common practice is to do that only when the value has actually changed.
         * <br>
         * <br>This signal is typically used to obtain change notification for a
         * <br>single property, by specifying the property name as a detail in the
         * <br>g_signal_connect() call, like this:
         * <br>
         * <pre>&lt;!-- language=&quot;C&quot; --&gt;
         * g_signal_connect (text_view-&gt;buffer, &quot;notify::paste-target-list&quot;,
         *                   G_CALLBACK (gtk_text_view_target_list_notify),
         *                   text_view)
         * </pre>
         * <br>
         * <br>It is important to note that you must use
         * <br>[canonical parameter names][canonical-parameter-names] as
         * <br>detail strings for the notify signal.
         * @param pspec the &#35;GParamSpec of the property which changed.
        */
        void onNotify(@Nonnull ParamSpec pspec);
    }
    
    private static com.sun.jna.Callback toOnNotify(OnNotify in) {
        return (in == null) ? null: (JnaObject.OnNotify) (__self, _pspec, __data) -> in.onNotify(new ParamSpec(new PointerContainer(_pspec)));
    }

    public Object(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new instance of a &#35;GObject subtype and sets its properties.
     * <br>
     * <br>Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * <br>which are not explicitly specified are set to their default values. Any
     * <br>private data for the object is guaranteed to be initialized with zeros, as
     * <br>per g_type_create_instance().
     * <br>
     * <br>Note that in C, small integer types in variable argument lists are promoted
     * <br>up to &#35;gint or &#35;guint as appropriate, and read back accordingly. &#35;gint is 32
     * <br>bits on every platform on which GLib is currently supported. This means that
     * <br>you can use C expressions of type &#35;gint with g_object_new() and properties of
     * <br>type &#35;gint or &#35;guint or smaller. Specifically, you can use integer literals
     * <br>with these property types.
     * <br>
     * <br>When using property types of &#35;gint64 or &#35;guint64, you must ensure that the
     * <br>value that you provide is 64 bit. This means that you should use a cast or
     * <br>make use of the %G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
     * <br>
     * <br>Similarly, &#35;gfloat is promoted to &#35;gdouble, so you must ensure that the value
     * <br>you provide is a &#35;gdouble, even for a property of type &#35;gfloat.
     * <br>
     * <br>Since GLib 2.72, all &#35;GObjects are guaranteed to be aligned to at least the
     * <br>alignment of the largest basic GLib type (typically this is &#35;guint64 or
     * <br>&#35;gdouble). If you need larger alignment for an element in a &#35;GObject, you
     * <br>should allocate it on the heap (aligned), or arrange for your &#35;GObject to be
     * <br>appropriately padded.
     * @param object_type the type id of the &#35;GObject subtype to instantiate
     * @param first_property_name the name of the first property
     * @param _elipse the value of the first property, followed optionally by more  name/value pairs, followed by %NULL
    */
    public Object(long object_type, @Nonnull ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse) {
        super(cast(JnaObject.INST().g_object_new(object_type, asCPointerNotNull(first_property_name), _elipse)));
    }

    /**
     * Creates a new instance of a &#35;GObject subtype and sets its properties.
     * <br>
     * <br>Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * <br>which are not explicitly specified are set to their default values. Any
     * <br>private data for the object is guaranteed to be initialized with zeros, as
     * <br>per g_type_create_instance().
     * <br>
     * <br>Note that in C, small integer types in variable argument lists are promoted
     * <br>up to &#35;gint or &#35;guint as appropriate, and read back accordingly. &#35;gint is 32
     * <br>bits on every platform on which GLib is currently supported. This means that
     * <br>you can use C expressions of type &#35;gint with g_object_new() and properties of
     * <br>type &#35;gint or &#35;guint or smaller. Specifically, you can use integer literals
     * <br>with these property types.
     * <br>
     * <br>When using property types of &#35;gint64 or &#35;guint64, you must ensure that the
     * <br>value that you provide is 64 bit. This means that you should use a cast or
     * <br>make use of the %G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
     * <br>
     * <br>Similarly, &#35;gfloat is promoted to &#35;gdouble, so you must ensure that the value
     * <br>you provide is a &#35;gdouble, even for a property of type &#35;gfloat.
     * <br>
     * <br>Since GLib 2.72, all &#35;GObjects are guaranteed to be aligned to at least the
     * <br>alignment of the largest basic GLib type (typically this is &#35;guint64 or
     * <br>&#35;gdouble). If you need larger alignment for an element in a &#35;GObject, you
     * <br>should allocate it on the heap (aligned), or arrange for your &#35;GObject to be
     * <br>appropriately padded.
     * @param object_type the type id of the &#35;GObject subtype to instantiate
     * @param first_property_name the name of the first property
     * @param _elipse the value of the first property, followed optionally by more  name/value pairs, followed by %NULL
    */
    public Object(long object_type, String first_property_name, java.lang.Object... _elipse) {
        super(cast(JnaObject.INST().g_object_new(object_type, first_property_name, _elipse)));
    }

    /**
     * Increases the reference count of the object by one and sets a
     * <br>callback to be called when all other references to the object are
     * <br>dropped, or when this is already the last reference to the object
     * <br>and another reference is established.
     * <br>
     * <br>This functionality is intended for binding &#64;object to a proxy
     * <br>object managed by another memory manager. This is done with two
     * <br>paired references: the strong reference added by
     * <br>g_object_add_toggle_ref() and a reverse reference to the proxy
     * <br>object which is either a strong reference or weak reference.
     * <br>
     * <br>The setup is that when there are no other references to &#64;object,
     * <br>only a weak reference is held in the reverse direction from &#64;object
     * <br>to the proxy object, but when there are other references held to
     * <br>&#64;object, a strong reference is held. The &#64;notify callback is called
     * <br>when the reference from &#64;object to the proxy object should be
     * <br>&quot;toggled&quot; from strong to weak (&#64;is_last_ref true) or weak to strong
     * <br>(&#64;is_last_ref false).
     * <br>
     * <br>Since a (normal) reference must be held to the object before
     * <br>calling g_object_add_toggle_ref(), the initial state of the reverse
     * <br>link is always strong.
     * <br>
     * <br>Multiple toggle references may be added to the same gobject,
     * <br>however if there are multiple toggle references to an object, none
     * <br>of them will ever be notified until all but one are removed.  For
     * <br>this reason, you should only ever use a toggle reference if there
     * <br>is important state in the proxy object.
     * @param notify a function to call when this reference is the  last reference to the object, or is no longer  the last reference.
     * @param data data to pass to &#64;notify
    */
    public void addToggleRef(OnToggleNotify notify, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_add_toggle_ref(asCPointer(), toOnToggleNotify(this, "addToggleRef", notify), asCPointer(data));
    }

    /**
     * Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target.
     * <br>
     * <br>Whenever the &#64;source_property is changed the &#64;target_property is
     * <br>updated using the same value. For instance:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   g_object_bind_property (action, &quot;active&quot;, widget, &quot;sensitive&quot;, 0);
     * </pre>
     * <br>
     * <br>Will result in the &quot;sensitive&quot; property of the widget &#35;GObject instance to be
     * <br>updated with the same value of the &quot;active&quot; property of the action &#35;GObject
     * <br>instance.
     * <br>
     * <br>If &#64;flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * <br>if &#64;target_property on &#64;target changes then the &#64;source_property on &#64;source
     * <br>will be updated as well.
     * <br>
     * <br>The binding will automatically be removed when either the &#64;source or the
     * <br>&#64;target instances are finalized. To remove the binding without affecting the
     * <br>&#64;source and the &#64;target you can just call g_object_unref() on the returned
     * <br>&#35;GBinding instance.
     * <br>
     * <br>Removing the binding by calling g_object_unref() on it must only be done if
     * <br>the binding, &#64;source and &#64;target are only used from a single thread and it
     * <br>is clear that both &#64;source and &#64;target outlive the binding. Especially it
     * <br>is not safe to rely on this if the binding, &#64;source or &#64;target can be
     * <br>finalized from different threads. Keep another reference to the binding and
     * <br>use g_binding_unbind() instead to be on the safe side.
     * <br>
     * <br>A &#35;GObject can have multiple bindings.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindProperty(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags)));
    }

    /**
     * Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target.
     * <br>
     * <br>Whenever the &#64;source_property is changed the &#64;target_property is
     * <br>updated using the same value. For instance:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   g_object_bind_property (action, &quot;active&quot;, widget, &quot;sensitive&quot;, 0);
     * </pre>
     * <br>
     * <br>Will result in the &quot;sensitive&quot; property of the widget &#35;GObject instance to be
     * <br>updated with the same value of the &quot;active&quot; property of the action &#35;GObject
     * <br>instance.
     * <br>
     * <br>If &#64;flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * <br>if &#64;target_property on &#64;target changes then the &#64;source_property on &#64;source
     * <br>will be updated as well.
     * <br>
     * <br>The binding will automatically be removed when either the &#64;source or the
     * <br>&#64;target instances are finalized. To remove the binding without affecting the
     * <br>&#64;source and the &#64;target you can just call g_object_unref() on the returned
     * <br>&#35;GBinding instance.
     * <br>
     * <br>Removing the binding by calling g_object_unref() on it must only be done if
     * <br>the binding, &#64;source and &#64;target are only used from a single thread and it
     * <br>is clear that both &#64;source and &#64;target outlive the binding. Especially it
     * <br>is not safe to rely on this if the binding, &#64;source or &#64;target can be
     * <br>finalized from different threads. Keep another reference to the binding and
     * <br>use g_binding_unbind() instead to be on the safe side.
     * <br>
     * <br>A &#35;GObject can have multiple bindings.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindProperty(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags)));
    }

    /**
     * Complete version of g_object_bind_property().
     * <br>
     * <br>Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target, allowing you to set the transformation functions to be used by
     * <br>the binding.
     * <br>
     * <br>If &#64;flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * <br>if &#64;target_property on &#64;target changes then the &#64;source_property on &#64;source
     * <br>will be updated as well. The &#64;transform_from function is only used in case
     * <br>of bidirectional bindings, otherwise it will be ignored
     * <br>
     * <br>The binding will automatically be removed when either the &#64;source or the
     * <br>&#64;target instances are finalized. This will release the reference that is
     * <br>being held on the &#35;GBinding instance; if you want to hold on to the
     * <br>&#35;GBinding instance, you will need to hold a reference to it.
     * <br>
     * <br>To remove the binding, call g_binding_unbind().
     * <br>
     * <br>A &#35;GObject can have multiple bindings.
     * <br>
     * <br>The same &#64;user_data parameter will be used for both &#64;transform_to
     * <br>and &#64;transform_from transformation functions; the &#64;notify function will
     * <br>be called once, when the binding is removed. If you need different data
     * <br>for each transformation function, please use
     * <br>g_object_bind_property_with_closures() instead.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @param transform_to the transformation function     from the &#64;source to the &#64;target, or %NULL to use the default
     * @param transform_from the transformation function     from the &#64;target to the &#64;source, or %NULL to use the default
     * @param user_data custom data to be passed to the transformation functions,     or %NULL
     * @param notify a function to call when disposing the binding, to free     resources used by the transformation functions, or %NULL if not required
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindPropertyFull(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags, OnBindingTransformFunc transform_to, OnBindingTransformFunc transform_from, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property_full(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags, toOnBindingTransformFunc(this, "bindPropertyFull", transform_to), toOnBindingTransformFunc(this, "bindPropertyFull", transform_from), asCPointer(user_data), toOnDestroyNotify(this, "bindPropertyFull", notify))));
    }

    /**
     * Complete version of g_object_bind_property().
     * <br>
     * <br>Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target, allowing you to set the transformation functions to be used by
     * <br>the binding.
     * <br>
     * <br>If &#64;flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * <br>if &#64;target_property on &#64;target changes then the &#64;source_property on &#64;source
     * <br>will be updated as well. The &#64;transform_from function is only used in case
     * <br>of bidirectional bindings, otherwise it will be ignored
     * <br>
     * <br>The binding will automatically be removed when either the &#64;source or the
     * <br>&#64;target instances are finalized. This will release the reference that is
     * <br>being held on the &#35;GBinding instance; if you want to hold on to the
     * <br>&#35;GBinding instance, you will need to hold a reference to it.
     * <br>
     * <br>To remove the binding, call g_binding_unbind().
     * <br>
     * <br>A &#35;GObject can have multiple bindings.
     * <br>
     * <br>The same &#64;user_data parameter will be used for both &#64;transform_to
     * <br>and &#64;transform_from transformation functions; the &#64;notify function will
     * <br>be called once, when the binding is removed. If you need different data
     * <br>for each transformation function, please use
     * <br>g_object_bind_property_with_closures() instead.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @param transform_to the transformation function     from the &#64;source to the &#64;target, or %NULL to use the default
     * @param transform_from the transformation function     from the &#64;target to the &#64;source, or %NULL to use the default
     * @param user_data custom data to be passed to the transformation functions,     or %NULL
     * @param notify a function to call when disposing the binding, to free     resources used by the transformation functions, or %NULL if not required
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindPropertyFull(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags, OnBindingTransformFunc transform_to, OnBindingTransformFunc transform_from, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property_full(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags, toOnBindingTransformFunc(this, "bindPropertyFull", transform_to), toOnBindingTransformFunc(this, "bindPropertyFull", transform_from), asCPointer(user_data), toOnDestroyNotify(this, "bindPropertyFull", notify))));
    }

    /**
     * Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target, allowing you to set the transformation functions to be used by
     * <br>the binding.
     * <br>
     * <br>This function is the language bindings friendly version of
     * <br>g_object_bind_property_full(), using &#35;GClosures instead of
     * <br>function pointers.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @param transform_to a &#35;GClosure wrapping the transformation function     from the &#64;source to the &#64;target, or %NULL to use the default
     * @param transform_from a &#35;GClosure wrapping the transformation function     from the &#64;target to the &#64;source, or %NULL to use the default
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindPropertyWithClosures(@Nonnull ch.bailu.gtk.type.Str source_property, @Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str target_property, int flags, @Nonnull Closure transform_to, @Nonnull Closure transform_from)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property_with_closures(asCPointer(), asCPointerNotNull(source_property), asCPointerNotNull(target), asCPointerNotNull(target_property), flags, asCPointerNotNull(transform_to), asCPointerNotNull(transform_from))));
    }

    /**
     * Creates a binding between &#64;source_property on &#64;source and &#64;target_property
     * <br>on &#64;target, allowing you to set the transformation functions to be used by
     * <br>the binding.
     * <br>
     * <br>This function is the language bindings friendly version of
     * <br>g_object_bind_property_full(), using &#35;GClosures instead of
     * <br>function pointers.
     * @param source_property the property on &#64;source to bind
     * @param target the target &#35;GObject
     * @param target_property the property on &#64;target to bind
     * @param flags flags to pass to &#35;GBinding
     * @param transform_to a &#35;GClosure wrapping the transformation function     from the &#64;source to the &#64;target, or %NULL to use the default
     * @param transform_from a &#35;GClosure wrapping the transformation function     from the &#64;target to the &#64;source, or %NULL to use the default
     * @return the &#35;GBinding instance representing the     binding between the two &#35;GObject instances. The binding is released     whenever the &#35;GBinding reference count reaches zero.
    */
    public Binding bindPropertyWithClosures(String source_property, @Nonnull ch.bailu.gtk.type.Pointer target, String target_property, int flags, @Nonnull Closure transform_to, @Nonnull Closure transform_from)  {
        return new Binding(new PointerContainer(JnaObject.INST().g_object_bind_property_with_closures(asCPointer(), source_property, asCPointerNotNull(target), target_property, flags, asCPointerNotNull(transform_to), asCPointerNotNull(transform_from))));
    }

    /**
     * A convenience function to connect multiple signals at once.
     * <br>
     * <br>The signal specs expected by this function have the form
     * <br>&quot;modifier::signal_name&quot;, where modifier can be one of the following:
     * <br>- signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_DEFAULT)
     * <br>- object-signal, object_signal: equivalent to g_signal_connect_object (..., G_CONNECT_DEFAULT)
     * <br>- swapped-signal, swapped_signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED)
     * <br>- swapped_object_signal, swapped-object-signal: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED)
     * <br>- signal_after, signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_AFTER)
     * <br>- object_signal_after, object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_AFTER)
     * <br>- swapped_signal_after, swapped-signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * <br>- swapped_object_signal_after, swapped-object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   menu-&gt;toplevel = g_object_connect (g_object_new (GTK_TYPE_WINDOW,
     * 						   &quot;type&quot;, GTK_WINDOW_POPUP,
     * 						   &quot;child&quot;, menu,
     * 						   NULL),
     * 				     &quot;signal::event&quot;, gtk_menu_window_event, menu,
     * 				     &quot;signal::size_request&quot;, gtk_menu_window_size_request, menu,
     * 				     &quot;signal::destroy&quot;, gtk_widget_destroyed, &amp;menu-&gt;toplevel,
     * 				     NULL);
     * </pre>
     * @param signal_spec the spec for the first signal
     * @param _elipse &#35;GCallback for the first signal, followed by data for the       first signal, followed optionally by more signal       spec/callback/data triples, followed by %NULL
     * @return &#64;object
    */
    public ch.bailu.gtk.type.Pointer connect(@Nonnull ch.bailu.gtk.type.Str signal_spec, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_connect(asCPointer(), asCPointerNotNull(signal_spec), _elipse)));
    }

    /**
     * A convenience function to connect multiple signals at once.
     * <br>
     * <br>The signal specs expected by this function have the form
     * <br>&quot;modifier::signal_name&quot;, where modifier can be one of the following:
     * <br>- signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_DEFAULT)
     * <br>- object-signal, object_signal: equivalent to g_signal_connect_object (..., G_CONNECT_DEFAULT)
     * <br>- swapped-signal, swapped_signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED)
     * <br>- swapped_object_signal, swapped-object-signal: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED)
     * <br>- signal_after, signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_AFTER)
     * <br>- object_signal_after, object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_AFTER)
     * <br>- swapped_signal_after, swapped-signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * <br>- swapped_object_signal_after, swapped-object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   menu-&gt;toplevel = g_object_connect (g_object_new (GTK_TYPE_WINDOW,
     * 						   &quot;type&quot;, GTK_WINDOW_POPUP,
     * 						   &quot;child&quot;, menu,
     * 						   NULL),
     * 				     &quot;signal::event&quot;, gtk_menu_window_event, menu,
     * 				     &quot;signal::size_request&quot;, gtk_menu_window_size_request, menu,
     * 				     &quot;signal::destroy&quot;, gtk_widget_destroyed, &amp;menu-&gt;toplevel,
     * 				     NULL);
     * </pre>
     * @param signal_spec the spec for the first signal
     * @param _elipse &#35;GCallback for the first signal, followed by data for the       first signal, followed optionally by more signal       spec/callback/data triples, followed by %NULL
     * @return &#64;object
    */
    public ch.bailu.gtk.type.Pointer connect(String signal_spec, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_connect(asCPointer(), signal_spec, _elipse)));
    }

    /**
     * A convenience function to disconnect multiple signals at once.
     * <br>
     * <br>The signal specs expected by this function have the form
     * <br>&quot;any_signal&quot;, which means to disconnect any signal with matching
     * <br>callback and data, or &quot;any_signal::signal_name&quot;, which only
     * <br>disconnects the signal named &quot;signal_name&quot;.
     * @param signal_spec the spec for the first signal
     * @param _elipse &#35;GCallback for the first signal, followed by data for the first signal,  followed optionally by more signal spec/callback/data triples,  followed by %NULL
    */
    public void disconnect(@Nonnull ch.bailu.gtk.type.Str signal_spec, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_disconnect(asCPointer(), asCPointerNotNull(signal_spec), _elipse);
    }

    /**
     * A convenience function to disconnect multiple signals at once.
     * <br>
     * <br>The signal specs expected by this function have the form
     * <br>&quot;any_signal&quot;, which means to disconnect any signal with matching
     * <br>callback and data, or &quot;any_signal::signal_name&quot;, which only
     * <br>disconnects the signal named &quot;signal_name&quot;.
     * @param signal_spec the spec for the first signal
     * @param _elipse &#35;GCallback for the first signal, followed by data for the first signal,  followed optionally by more signal spec/callback/data triples,  followed by %NULL
    */
    public void disconnect(String signal_spec, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_disconnect(asCPointer(), signal_spec, _elipse);
    }

    /**
     * This is a variant of g_object_get_data() which returns
     * <br>a 'duplicate' of the value. &#64;dup_func defines the
     * <br>meaning of 'duplicate' in this context, it could e.g.
     * <br>take a reference on a ref-counted object.
     * <br>
     * <br>If the &#64;key is not set on the object then &#64;dup_func
     * <br>will be called with a %NULL argument.
     * <br>
     * <br>Note that &#64;dup_func is called while user data of &#64;object
     * <br>is locked.
     * <br>
     * <br>This function can be useful to avoid races when multiple
     * <br>threads are using object data on the same key on the same
     * <br>object.
     * @param key a string, naming the user data pointer
     * @param dup_func function to dup the value
     * @param user_data passed as user_data to &#64;dup_func
     * @return the result of calling &#64;dup_func on the value     associated with &#64;key on &#64;object, or %NULL if not set.     If &#64;dup_func is %NULL, the value is returned     unmodified.
    */
    public ch.bailu.gtk.type.Pointer dupData(@Nonnull ch.bailu.gtk.type.Str key, OnDuplicateFunc dup_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_dup_data(asCPointer(), asCPointerNotNull(key), toOnDuplicateFunc(this, "dupData", dup_func), asCPointer(user_data))));
    }

    /**
     * This is a variant of g_object_get_data() which returns
     * <br>a 'duplicate' of the value. &#64;dup_func defines the
     * <br>meaning of 'duplicate' in this context, it could e.g.
     * <br>take a reference on a ref-counted object.
     * <br>
     * <br>If the &#64;key is not set on the object then &#64;dup_func
     * <br>will be called with a %NULL argument.
     * <br>
     * <br>Note that &#64;dup_func is called while user data of &#64;object
     * <br>is locked.
     * <br>
     * <br>This function can be useful to avoid races when multiple
     * <br>threads are using object data on the same key on the same
     * <br>object.
     * @param key a string, naming the user data pointer
     * @param dup_func function to dup the value
     * @param user_data passed as user_data to &#64;dup_func
     * @return the result of calling &#64;dup_func on the value     associated with &#64;key on &#64;object, or %NULL if not set.     If &#64;dup_func is %NULL, the value is returned     unmodified.
    */
    public ch.bailu.gtk.type.Pointer dupData(String key, OnDuplicateFunc dup_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_dup_data(asCPointer(), key, toOnDuplicateFunc(this, "dupData", dup_func), asCPointer(user_data))));
    }

    /**
     * This is a variant of g_object_get_qdata() which returns
     * <br>a 'duplicate' of the value. &#64;dup_func defines the
     * <br>meaning of 'duplicate' in this context, it could e.g.
     * <br>take a reference on a ref-counted object.
     * <br>
     * <br>If the &#64;quark is not set on the object then &#64;dup_func
     * <br>will be called with a %NULL argument.
     * <br>
     * <br>Note that &#64;dup_func is called while user data of &#64;object
     * <br>is locked.
     * <br>
     * <br>This function can be useful to avoid races when multiple
     * <br>threads are using object data on the same key on the same
     * <br>object.
     * @param quark a &#35;GQuark, naming the user data pointer
     * @param dup_func function to dup the value
     * @param user_data passed as user_data to &#64;dup_func
     * @return the result of calling &#64;dup_func on the value     associated with &#64;quark on &#64;object, or %NULL if not set.     If &#64;dup_func is %NULL, the value is returned     unmodified.
    */
    public ch.bailu.gtk.type.Pointer dupQdata(int quark, OnDuplicateFunc dup_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_dup_qdata(asCPointer(), quark, toOnDuplicateFunc(this, "dupQdata", dup_func), asCPointer(user_data))));
    }

    /**
     * This function is intended for &#35;GObject implementations to re-enforce
     * <br>a [floating][floating-ref] object reference. Doing this is seldom
     * <br>required: all &#35;GInitiallyUnowneds are created with a floating reference
     * <br>which usually just needs to be sunken by calling g_object_ref_sink().
    */
    public void forceFloating()  {
        JnaObject.INST().g_object_force_floating(asCPointer());
    }

    /**
     * Increases the freeze count on &#64;object. If the freeze count is
     * <br>non-zero, the emission of &quot;notify&quot; signals on &#64;object is
     * <br>stopped. The signals are queued until the freeze count is decreased
     * <br>to zero. Duplicate notifications are squashed so that at most one
     * <br>&#35;GObject::notify signal is emitted for each property modified while the
     * <br>object is frozen.
     * <br>
     * <br>This is necessary for accessors that modify multiple properties to prevent
     * <br>premature notification while the object is still being modified.
    */
    public void freezeNotify()  {
        JnaObject.INST().g_object_freeze_notify(asCPointer());
    }

    /**
     * Gets properties of an object.
     * <br>
     * <br>In general, a copy is made of the property contents and the caller
     * <br>is responsible for freeing the memory in the appropriate manner for
     * <br>the type, for instance by calling g_free() or g_object_unref().
     * <br>
     * <br>Here is an example of using g_object_get() to get the contents
     * <br>of three properties: an integer, a string and an object:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  gint intval;
     *  guint64 uint64val;
     *  gchar *strval;
     *  GObject *objval;
     * 
     *  g_object_get (my_object,
     *                &quot;int-property&quot;, &amp;intval,
     *                &quot;uint64-property&quot;, &amp;uint64val,
     *                &quot;str-property&quot;, &amp;strval,
     *                &quot;obj-property&quot;, &amp;objval,
     *                NULL);
     * 
     *  // Do something with intval, uint64val, strval, objval
     * 
     *  g_free (strval);
     *  g_object_unref (objval);
     * </pre>
     * @param first_property_name name of the first property to get
     * @param _elipse return location for the first property, followed optionally by more  name/return location pairs, followed by %NULL
    */
    public void get(@Nonnull ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_get(asCPointer(), asCPointerNotNull(first_property_name), _elipse);
    }

    /**
     * Gets properties of an object.
     * <br>
     * <br>In general, a copy is made of the property contents and the caller
     * <br>is responsible for freeing the memory in the appropriate manner for
     * <br>the type, for instance by calling g_free() or g_object_unref().
     * <br>
     * <br>Here is an example of using g_object_get() to get the contents
     * <br>of three properties: an integer, a string and an object:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  gint intval;
     *  guint64 uint64val;
     *  gchar *strval;
     *  GObject *objval;
     * 
     *  g_object_get (my_object,
     *                &quot;int-property&quot;, &amp;intval,
     *                &quot;uint64-property&quot;, &amp;uint64val,
     *                &quot;str-property&quot;, &amp;strval,
     *                &quot;obj-property&quot;, &amp;objval,
     *                NULL);
     * 
     *  // Do something with intval, uint64val, strval, objval
     * 
     *  g_free (strval);
     *  g_object_unref (objval);
     * </pre>
     * @param first_property_name name of the first property to get
     * @param _elipse return location for the first property, followed optionally by more  name/return location pairs, followed by %NULL
    */
    public void get(String first_property_name, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_get(asCPointer(), first_property_name, _elipse);
    }

    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     * @param key name of the key for that association
     * @return the data if found,          or %NULL if no such data exists.
    */
    public ch.bailu.gtk.type.Pointer getData(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_get_data(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     * @param key name of the key for that association
     * @return the data if found,          or %NULL if no such data exists.
    */
    public ch.bailu.gtk.type.Pointer getData(String key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_get_data(asCPointer(), key)));
    }

    /**
     * Gets a property of an object.
     * <br>
     * <br>The &#64;value can be:
     * <br>
     * <br> - an empty &#35;GValue initialized by %G_VALUE_INIT, which will be
     * <br>   automatically initialized with the expected type of the property
     * <br>   (since GLib 2.60)
     * <br> - a &#35;GValue initialized with the expected type of the property
     * <br> - a &#35;GValue initialized with a type to which the expected type
     * <br>   of the property can be transformed
     * <br>
     * <br>In general, a copy is made of the property contents and the caller is
     * <br>responsible for freeing the memory by calling g_value_unset().
     * <br>
     * <br>Note that g_object_get_property() is really intended for language
     * <br>bindings, g_object_get() is much more convenient for C programming.
     * @param property_name the name of the property to get
     * @param value return location for the property value
    */
    public void getProperty(@Nonnull ch.bailu.gtk.type.Str property_name, @Nonnull Value value)  {
        JnaObject.INST().g_object_get_property(asCPointer(), asCPointerNotNull(property_name), asCPointerNotNull(value));
    }

    /**
     * Gets a property of an object.
     * <br>
     * <br>The &#64;value can be:
     * <br>
     * <br> - an empty &#35;GValue initialized by %G_VALUE_INIT, which will be
     * <br>   automatically initialized with the expected type of the property
     * <br>   (since GLib 2.60)
     * <br> - a &#35;GValue initialized with the expected type of the property
     * <br> - a &#35;GValue initialized with a type to which the expected type
     * <br>   of the property can be transformed
     * <br>
     * <br>In general, a copy is made of the property contents and the caller is
     * <br>responsible for freeing the memory by calling g_value_unset().
     * <br>
     * <br>Note that g_object_get_property() is really intended for language
     * <br>bindings, g_object_get() is much more convenient for C programming.
     * @param property_name the name of the property to get
     * @param value return location for the property value
    */
    public void getProperty(String property_name, @Nonnull Value value)  {
        JnaObject.INST().g_object_get_property(asCPointer(), property_name, asCPointerNotNull(value));
    }

    /**
     * This function gets back user data pointers stored via
     * <br>g_object_set_qdata().
     * @param quark A &#35;GQuark, naming the user data pointer
     * @return The user data pointer set, or %NULL
    */
    public ch.bailu.gtk.type.Pointer getQdata(int quark)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_get_qdata(asCPointer(), quark)));
    }

    /**
     * Checks whether &#64;object has a [floating][floating-ref] reference.
     * @return %TRUE if &#64;object has a floating reference
    */
    public boolean isFloating()  {
        return JnaObject.INST().g_object_is_floating(asCPointer());
    }

    /**
     * Emits a &quot;notify&quot; signal for the property &#64;property_name on &#64;object.
     * <br>
     * <br>When possible, eg. when signaling a property change from within the class
     * <br>that registered the property, you should use g_object_notify_by_pspec()
     * <br>instead.
     * <br>
     * <br>Note that emission of the notify signal may be blocked with
     * <br>g_object_freeze_notify(). In this case, the signal emissions are queued
     * <br>and will be emitted (in reverse order) when g_object_thaw_notify() is
     * <br>called.
     * @param property_name the name of a property installed on the class of &#64;object.
    */
    public void notify(@Nonnull ch.bailu.gtk.type.Str property_name)  {
        JnaObject.INST().g_object_notify(asCPointer(), asCPointerNotNull(property_name));
    }

    /**
     * Emits a &quot;notify&quot; signal for the property &#64;property_name on &#64;object.
     * <br>
     * <br>When possible, eg. when signaling a property change from within the class
     * <br>that registered the property, you should use g_object_notify_by_pspec()
     * <br>instead.
     * <br>
     * <br>Note that emission of the notify signal may be blocked with
     * <br>g_object_freeze_notify(). In this case, the signal emissions are queued
     * <br>and will be emitted (in reverse order) when g_object_thaw_notify() is
     * <br>called.
     * @param property_name the name of a property installed on the class of &#64;object.
    */
    public void notify(String property_name)  {
        JnaObject.INST().g_object_notify(asCPointer(), property_name);
    }

    /**
     * Emits a &quot;notify&quot; signal for the property specified by &#64;pspec on &#64;object.
     * <br>
     * <br>This function omits the property name lookup, hence it is faster than
     * <br>g_object_notify().
     * <br>
     * <br>One way to avoid using g_object_notify() from within the
     * <br>class that registered the properties, and using g_object_notify_by_pspec()
     * <br>instead, is to store the GParamSpec used with
     * <br>g_object_class_install_property() inside a static array, e.g.:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   typedef enum
     *   {
     *     PROP_FOO = 1,
     *     PROP_LAST
     *   } MyObjectProperty;
     * 
     *   static GParamSpec *properties[PROP_LAST];
     * 
     *   static void
     *   my_object_class_init (MyObjectClass *klass)
     *   {
     *     properties[PROP_FOO] = g_param_spec_int (&quot;foo&quot;, &quot;Foo&quot;, &quot;The foo&quot;,
     *                                              0, 100,
     *                                              50,
     *                                              G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
     *     g_object_class_install_property (gobject_class,
     *                                      PROP_FOO,
     *                                      properties[PROP_FOO]);
     *   }
     * </pre>
     * <br>
     * <br>and then notify a change on the &quot;foo&quot; property with:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   g_object_notify_by_pspec (self, properties[PROP_FOO]);
     * </pre>
     * @param pspec the &#35;GParamSpec of a property installed on the class of &#64;object.
    */
    public void notifyByPspec(@Nonnull ParamSpec pspec)  {
        JnaObject.INST().g_object_notify_by_pspec(asCPointer(), asCPointerNotNull(pspec));
    }

    /**
     * Increases the reference count of &#64;object.
     * <br>
     * <br>Since GLib 2.56, if `GLIB_VERSION_MAX_ALLOWED` is 2.56 or greater, the type
     * <br>of &#64;object will be propagated to the return type (using the GCC typeof()
     * <br>extension), so any casting the caller needs to do on the return type must be
     * <br>explicit.
     * @return the same &#64;object
    */
    public ch.bailu.gtk.type.Pointer ref()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_ref(asCPointer())));
    }

    /**
     * Increase the reference count of &#64;object, and possibly remove the
     * <br>[floating][floating-ref] reference, if &#64;object has a floating reference.
     * <br>
     * <br>In other words, if the object is floating, then this call &quot;assumes
     * <br>ownership&quot; of the floating reference, converting it to a normal
     * <br>reference by clearing the floating flag while leaving the reference
     * <br>count unchanged.  If the object is not floating, then this call
     * <br>adds a new normal reference increasing the reference count by one.
     * <br>
     * <br>Since GLib 2.56, the type of &#64;object will be propagated to the return type
     * <br>under the same conditions as for g_object_ref().
     * @return &#64;object
    */
    public ch.bailu.gtk.type.Pointer refSink()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_ref_sink(asCPointer())));
    }

    /**
     * Removes a reference added with g_object_add_toggle_ref(). The
     * <br>reference count of the object is decreased by one.
     * @param notify a function to call when this reference is the  last reference to the object, or is no longer  the last reference.
     * @param data data to pass to &#64;notify, or %NULL to  match any toggle refs with the &#64;notify argument.
    */
    public void removeToggleRef(OnToggleNotify notify, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_remove_toggle_ref(asCPointer(), toOnToggleNotify(this, "removeToggleRef", notify), asCPointer(data));
    }

    /**
     * Compares the user data for the key &#64;key on &#64;object with
     * <br>&#64;oldval, and if they are the same, replaces &#64;oldval with
     * <br>&#64;newval.
     * <br>
     * <br>This is like a typical atomic compare-and-exchange
     * <br>operation, for user data on an object.
     * <br>
     * <br>If the previous value was replaced then ownership of the
     * <br>old value (&#64;oldval) is passed to the caller, including
     * <br>the registered destroy notify for it (passed out in &#64;old_destroy).
     * <br>It’s up to the caller to free this as needed, which may
     * <br>or may not include using &#64;old_destroy as sometimes replacement
     * <br>should not destroy the object in the normal way.
     * <br>
     * <br>See g_object_set_data() for guidance on using a small, bounded set of values
     * <br>for &#64;key.
     * @param key a string, naming the user data pointer
     * @param oldval the old value to compare against
     * @param newval the new value
     * @param destroy a destroy notify for the new value
     * @param old_destroy destroy notify for the existing value
     * @return %TRUE if the existing value for &#64;key was replaced  by &#64;newval, %FALSE otherwise.
    */
    public boolean replaceData(@Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Pointer oldval, @Nullable ch.bailu.gtk.type.Pointer newval, OnDestroyNotify destroy, OnDestroyNotify old_destroy)  {
        return JnaObject.INST().g_object_replace_data(asCPointer(), asCPointerNotNull(key), asCPointer(oldval), asCPointer(newval), toOnDestroyNotify(this, "replaceData", destroy), toOnDestroyNotify(this, "replaceData", old_destroy));
    }

    /**
     * Compares the user data for the key &#64;key on &#64;object with
     * <br>&#64;oldval, and if they are the same, replaces &#64;oldval with
     * <br>&#64;newval.
     * <br>
     * <br>This is like a typical atomic compare-and-exchange
     * <br>operation, for user data on an object.
     * <br>
     * <br>If the previous value was replaced then ownership of the
     * <br>old value (&#64;oldval) is passed to the caller, including
     * <br>the registered destroy notify for it (passed out in &#64;old_destroy).
     * <br>It’s up to the caller to free this as needed, which may
     * <br>or may not include using &#64;old_destroy as sometimes replacement
     * <br>should not destroy the object in the normal way.
     * <br>
     * <br>See g_object_set_data() for guidance on using a small, bounded set of values
     * <br>for &#64;key.
     * @param key a string, naming the user data pointer
     * @param oldval the old value to compare against
     * @param newval the new value
     * @param destroy a destroy notify for the new value
     * @param old_destroy destroy notify for the existing value
     * @return %TRUE if the existing value for &#64;key was replaced  by &#64;newval, %FALSE otherwise.
    */
    public boolean replaceData(String key, @Nullable ch.bailu.gtk.type.Pointer oldval, @Nullable ch.bailu.gtk.type.Pointer newval, OnDestroyNotify destroy, OnDestroyNotify old_destroy)  {
        return JnaObject.INST().g_object_replace_data(asCPointer(), key, asCPointer(oldval), asCPointer(newval), toOnDestroyNotify(this, "replaceData", destroy), toOnDestroyNotify(this, "replaceData", old_destroy));
    }

    /**
     * Compares the user data for the key &#64;quark on &#64;object with
     * <br>&#64;oldval, and if they are the same, replaces &#64;oldval with
     * <br>&#64;newval.
     * <br>
     * <br>This is like a typical atomic compare-and-exchange
     * <br>operation, for user data on an object.
     * <br>
     * <br>If the previous value was replaced then ownership of the
     * <br>old value (&#64;oldval) is passed to the caller, including
     * <br>the registered destroy notify for it (passed out in &#64;old_destroy).
     * <br>It’s up to the caller to free this as needed, which may
     * <br>or may not include using &#64;old_destroy as sometimes replacement
     * <br>should not destroy the object in the normal way.
     * @param quark a &#35;GQuark, naming the user data pointer
     * @param oldval the old value to compare against
     * @param newval the new value
     * @param destroy a destroy notify for the new value
     * @param old_destroy destroy notify for the existing value
     * @return %TRUE if the existing value for &#64;quark was replaced  by &#64;newval, %FALSE otherwise.
    */
    public boolean replaceQdata(int quark, @Nullable ch.bailu.gtk.type.Pointer oldval, @Nullable ch.bailu.gtk.type.Pointer newval, OnDestroyNotify destroy, OnDestroyNotify old_destroy)  {
        return JnaObject.INST().g_object_replace_qdata(asCPointer(), quark, asCPointer(oldval), asCPointer(newval), toOnDestroyNotify(this, "replaceQdata", destroy), toOnDestroyNotify(this, "replaceQdata", old_destroy));
    }

    /**
     * Releases all references to other objects. This can be used to break
     * <br>reference cycles.
     * <br>
     * <br>This function should only be called from object system implementations.
    */
    public void runDispose()  {
        JnaObject.INST().g_object_run_dispose(asCPointer());
    }

    /**
     * Sets properties on an object.
     * <br>
     * <br>The same caveats about passing integer literals as varargs apply as with
     * <br>g_object_new(). In particular, any integer literals set as the values for
     * <br>properties of type &#35;gint64 or &#35;guint64 must be 64 bits wide, using the
     * <br>%G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
     * <br>
     * <br>Note that the &quot;notify&quot; signals are queued and only emitted (in
     * <br>reverse order) after all properties have been set. See
     * <br>g_object_freeze_notify().
     * @param first_property_name name of the first property to set
     * @param _elipse value for the first property, followed optionally by more  name/value pairs, followed by %NULL
    */
    public void set(@Nonnull ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_set(asCPointer(), asCPointerNotNull(first_property_name), _elipse);
    }

    /**
     * Sets properties on an object.
     * <br>
     * <br>The same caveats about passing integer literals as varargs apply as with
     * <br>g_object_new(). In particular, any integer literals set as the values for
     * <br>properties of type &#35;gint64 or &#35;guint64 must be 64 bits wide, using the
     * <br>%G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
     * <br>
     * <br>Note that the &quot;notify&quot; signals are queued and only emitted (in
     * <br>reverse order) after all properties have been set. See
     * <br>g_object_freeze_notify().
     * @param first_property_name name of the first property to set
     * @param _elipse value for the first property, followed optionally by more  name/value pairs, followed by %NULL
    */
    public void set(String first_property_name, java.lang.Object... _elipse)  {
        JnaObject.INST().g_object_set(asCPointer(), first_property_name, _elipse);
    }

    /**
     * Each object carries around a table of associations from
     * <br>strings to pointers.  This function lets you set an association.
     * <br>
     * <br>If the object already had an association with that name,
     * <br>the old association will be destroyed.
     * <br>
     * <br>Internally, the &#64;key is converted to a &#35;GQuark using g_quark_from_string().
     * <br>This means a copy of &#64;key is kept permanently (even after &#64;object has been
     * <br>finalized) — so it is recommended to only use a small, bounded set of values
     * <br>for &#64;key in your program, to avoid the &#35;GQuark storage growing unbounded.
     * @param key name of the key
     * @param data data to associate with that key
    */
    public void setData(@Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_set_data(asCPointer(), asCPointerNotNull(key), asCPointer(data));
    }

    /**
     * Each object carries around a table of associations from
     * <br>strings to pointers.  This function lets you set an association.
     * <br>
     * <br>If the object already had an association with that name,
     * <br>the old association will be destroyed.
     * <br>
     * <br>Internally, the &#64;key is converted to a &#35;GQuark using g_quark_from_string().
     * <br>This means a copy of &#64;key is kept permanently (even after &#64;object has been
     * <br>finalized) — so it is recommended to only use a small, bounded set of values
     * <br>for &#64;key in your program, to avoid the &#35;GQuark storage growing unbounded.
     * @param key name of the key
     * @param data data to associate with that key
    */
    public void setData(String key, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_set_data(asCPointer(), key, asCPointer(data));
    }

    /**
     * Like g_object_set_data() except it adds notification
     * <br>for when the association is destroyed, either by setting it
     * <br>to a different value or when the object is destroyed.
     * <br>
     * <br>Note that the &#64;destroy callback is not called if &#64;data is %NULL.
     * @param key name of the key
     * @param data data to associate with that key
     * @param destroy function to call when the association is destroyed
    */
    public void setDataFull(@Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaObject.INST().g_object_set_data_full(asCPointer(), asCPointerNotNull(key), asCPointer(data), toOnDestroyNotify(this, "setDataFull", destroy));
    }

    /**
     * Like g_object_set_data() except it adds notification
     * <br>for when the association is destroyed, either by setting it
     * <br>to a different value or when the object is destroyed.
     * <br>
     * <br>Note that the &#64;destroy callback is not called if &#64;data is %NULL.
     * @param key name of the key
     * @param data data to associate with that key
     * @param destroy function to call when the association is destroyed
    */
    public void setDataFull(String key, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaObject.INST().g_object_set_data_full(asCPointer(), key, asCPointer(data), toOnDestroyNotify(this, "setDataFull", destroy));
    }

    /**
     * Sets a property on an object.
     * @param property_name the name of the property to set
     * @param value the value
    */
    public void setProperty(@Nonnull ch.bailu.gtk.type.Str property_name, @Nonnull Value value)  {
        JnaObject.INST().g_object_set_property(asCPointer(), asCPointerNotNull(property_name), asCPointerNotNull(value));
    }

    /**
     * Sets a property on an object.
     * @param property_name the name of the property to set
     * @param value the value
    */
    public void setProperty(String property_name, @Nonnull Value value)  {
        JnaObject.INST().g_object_set_property(asCPointer(), property_name, asCPointerNotNull(value));
    }

    /**
     * This sets an opaque, named pointer on an object.
     * <br>The name is specified through a &#35;GQuark (retrieved e.g. via
     * <br>g_quark_from_static_string()), and the pointer
     * <br>can be gotten back from the &#64;object with g_object_get_qdata()
     * <br>until the &#64;object is finalized.
     * <br>Setting a previously set user data pointer, overrides (frees)
     * <br>the old pointer set, using &#35;NULL as pointer essentially
     * <br>removes the data stored.
     * @param quark A &#35;GQuark, naming the user data pointer
     * @param data An opaque user data pointer
    */
    public void setQdata(int quark, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_set_qdata(asCPointer(), quark, asCPointer(data));
    }

    /**
     * This function works like g_object_set_qdata(), but in addition,
     * <br>a void (*destroy) (gpointer) function may be specified which is
     * <br>called with &#64;data as argument when the &#64;object is finalized, or
     * <br>the data is being overwritten by a call to g_object_set_qdata()
     * <br>with the same &#64;quark.
     * @param quark A &#35;GQuark, naming the user data pointer
     * @param data An opaque user data pointer
     * @param destroy Function to invoke with &#64;data as argument, when &#64;data           needs to be freed
    */
    public void setQdataFull(int quark, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaObject.INST().g_object_set_qdata_full(asCPointer(), quark, asCPointer(data), toOnDestroyNotify(this, "setQdataFull", destroy));
    }

    /**
     * Remove a specified datum from the object's data associations,
     * <br>without invoking the association's destroy handler.
     * @param key name of the key
     * @return the data if found, or %NULL          if no such data exists.
    */
    public ch.bailu.gtk.type.Pointer stealData(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_steal_data(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Remove a specified datum from the object's data associations,
     * <br>without invoking the association's destroy handler.
     * @param key name of the key
     * @return the data if found, or %NULL          if no such data exists.
    */
    public ch.bailu.gtk.type.Pointer stealData(String key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_steal_data(asCPointer(), key)));
    }

    /**
     * This function gets back user data pointers stored via
     * <br>g_object_set_qdata() and removes the &#64;data from object
     * <br>without invoking its destroy() function (if any was
     * <br>set).
     * <br>Usually, calling this function is only required to update
     * <br>user data pointers with a destroy notifier, for example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * void
     * object_add_to_user_list (GObject     *object,
     *                          const gchar *new_string)
     * {
     *   // the quark, naming the object data
     *   GQuark quark_string_list = g_quark_from_static_string (&quot;my-string-list&quot;);
     *   // retrieve the old string list
     *   GList *list = g_object_steal_qdata (object, quark_string_list);
     * 
     *   // prepend new string
     *   list = g_list_prepend (list, g_strdup (new_string));
     *   // this changed 'list', so we need to set it again
     *   g_object_set_qdata_full (object, quark_string_list, list, free_string_list);
     * }
     * static void
     * free_string_list (gpointer data)
     * {
     *   GList *node, *list = data;
     * 
     *   for (node = list; node; node = node-&gt;next)
     *     g_free (node-&gt;data);
     *   g_list_free (list);
     * }
     * </pre>
     * <br>Using g_object_get_qdata() in the above example, instead of
     * <br>g_object_steal_qdata() would have left the destroy function set,
     * <br>and thus the partial string list would have been freed upon
     * <br>g_object_set_qdata_full().
     * @param quark A &#35;GQuark, naming the user data pointer
     * @return The user data pointer set, or %NULL
    */
    public ch.bailu.gtk.type.Pointer stealQdata(int quark)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_steal_qdata(asCPointer(), quark)));
    }

    /**
     * If &#64;object is floating, sink it.  Otherwise, do nothing.
     * <br>
     * <br>In other words, this function will convert a floating reference (if
     * <br>present) into a full reference.
     * <br>
     * <br>Typically you want to use g_object_ref_sink() in order to
     * <br>automatically do the correct thing with respect to floating or
     * <br>non-floating references, but there is one specific scenario where
     * <br>this function is helpful.
     * <br>
     * <br>The situation where this function is helpful is when creating an API
     * <br>that allows the user to provide a callback function that returns a
     * <br>GObject. We certainly want to allow the user the flexibility to
     * <br>return a non-floating reference from this callback (for the case
     * <br>where the object that is being returned already exists).
     * <br>
     * <br>At the same time, the API style of some popular GObject-based
     * <br>libraries (such as Gtk) make it likely that for newly-created GObject
     * <br>instances, the user can be saved some typing if they are allowed to
     * <br>return a floating reference.
     * <br>
     * <br>Using this function on the return value of the user's callback allows
     * <br>the user to do whichever is more convenient for them. The caller will
     * <br>alway receives exactly one full reference to the value: either the
     * <br>one that was returned in the first place, or a floating reference
     * <br>that has been converted to a full reference.
     * <br>
     * <br>This function has an odd interaction when combined with
     * <br>g_object_ref_sink() running at the same time in another thread on
     * <br>the same &#35;GObject instance. If g_object_ref_sink() runs first then
     * <br>the result will be that the floating reference is converted to a hard
     * <br>reference. If g_object_take_ref() runs first then the result will be
     * <br>that the floating reference is converted to a hard reference and an
     * <br>additional reference on top of that one is added. It is best to avoid
     * <br>this situation.
     * @return &#64;object
    */
    public ch.bailu.gtk.type.Pointer takeRef()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaObject.INST().g_object_take_ref(asCPointer())));
    }

    /**
     * Reverts the effect of a previous call to
     * <br>g_object_freeze_notify(). The freeze count is decreased on &#64;object
     * <br>and when it reaches zero, queued &quot;notify&quot; signals are emitted.
     * <br>
     * <br>Duplicate notifications for each property are squashed so that at most one
     * <br>&#35;GObject::notify signal is emitted for each property, in the reverse order
     * <br>in which they have been queued.
     * <br>
     * <br>It is an error to call this function when the freeze count is zero.
    */
    public void thawNotify()  {
        JnaObject.INST().g_object_thaw_notify(asCPointer());
    }

    /**
     * Decreases the reference count of &#64;object. When its reference count
     * <br>drops to 0, the object is finalized (i.e. its memory is freed).
     * <br>
     * <br>If the pointer to the &#35;GObject may be reused in future (for example, if it is
     * <br>an instance variable of another object), it is recommended to clear the
     * <br>pointer to %NULL rather than retain a dangling pointer to a potentially
     * <br>invalid &#35;GObject instance. Use g_clear_object() for this.
    */
    public void unref()  {
        JnaObject.INST().g_object_unref(asCPointer());
    }

    /**
     * This function essentially limits the life time of the &#64;closure to
     * <br>the life time of the object. That is, when the object is finalized,
     * <br>the &#64;closure is invalidated by calling g_closure_invalidate() on
     * <br>it, in order to prevent invocations of the closure with a finalized
     * <br>(nonexisting) object. Also, g_object_ref() and g_object_unref() are
     * <br>added as marshal guards to the &#64;closure, to ensure that an extra
     * <br>reference count is held on &#64;object during invocation of the
     * <br>&#64;closure.  Usually, this function will be called on closures that
     * <br>use this &#64;object as closure data.
     * @param closure &#35;GClosure to watch
    */
    public void watchClosure(@Nonnull Closure closure)  {
        JnaObject.INST().g_object_watch_closure(asCPointer(), asCPointerNotNull(closure));
    }

    /**
     * Adds a weak reference callback to an object. Weak references are
     * <br>used for notification when an object is disposed. They are called
     * <br>&quot;weak references&quot; because they allow you to safely hold a pointer
     * <br>to an object without calling g_object_ref() (g_object_ref() adds a
     * <br>strong reference, that is, forces the object to stay alive).
     * <br>
     * <br>Note that the weak references created by this method are not
     * <br>thread-safe: they cannot safely be used in one thread if the
     * <br>object's last g_object_unref() might happen in another thread.
     * <br>Use &#35;GWeakRef if thread-safety is required.
     * @param notify callback to invoke before the object is freed
     * @param data extra data to pass to notify
    */
    public void weakRef(OnWeakNotify notify, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_weak_ref(asCPointer(), toOnWeakNotify(this, "weakRef", notify), asCPointer(data));
    }

    /**
     * Removes a weak reference callback to an object.
     * @param notify callback to search for
     * @param data data to search for
    */
    public void weakUnref(OnWeakNotify notify, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaObject.INST().g_object_weak_unref(asCPointer(), toOnWeakNotify(this, "weakUnref", notify), asCPointer(data));
    }

    public final static String SIGNAL_ON_NOTIFY = "notify";
    
    /**
     * Connect to signal "notify".
     * <br>See {@link OnNotify#onNotify} for signal description.
     * <br>Field {@link #SIGNAL_ON_NOTIFY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNotify(OnNotify signal) {
        return connectSignal(SIGNAL_ON_NOTIFY, toOnNotify(signal));
    }

    /**
     * 
     * @param what 
     * @param data 
     * @return 
    */
    public static long compatControl(long what, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaObject.INST().g_object_compat_control(what, asCPointer(data));
    }

    /**
     * Find the &#35;GParamSpec with the given name for an
     * <br>interface. Generally, the interface vtable passed in as &#64;g_iface
     * <br>will be the default vtable from g_type_default_interface_ref(), or,
     * <br>if you know the interface has already been loaded,
     * <br>g_type_default_interface_peek().
     * @param g_iface any interface vtable for the  interface, or the default vtable for the interface
     * @param property_name name of a property to look up.
     * @return the &#35;GParamSpec for the property of the          interface with the name &#64;property_name, or %NULL if no          such property exists.
    */
    public static ParamSpec interfaceFindProperty(@Nonnull ch.bailu.gtk.type.Pointer g_iface, @Nonnull ch.bailu.gtk.type.Str property_name)  {
        return new ParamSpec(new PointerContainer(JnaObject.INST().g_object_interface_find_property(asCPointerNotNull(g_iface), asCPointerNotNull(property_name))));
    }

    /**
     * Add a property to an interface; this is only useful for interfaces
     * <br>that are added to GObject-derived types. Adding a property to an
     * <br>interface forces all objects classes with that interface to have a
     * <br>compatible property. The compatible property could be a newly
     * <br>created &#35;GParamSpec, but normally
     * <br>g_object_class_override_property() will be used so that the object
     * <br>class only needs to provide an implementation and inherits the
     * <br>property description, default value, bounds, and so forth from the
     * <br>interface property.
     * <br>
     * <br>This function is meant to be called from the interface's default
     * <br>vtable initialization function (the &#64;class_init member of
     * <br>&#35;GTypeInfo.) It must not be called after after &#64;class_init has
     * <br>been called for any object types implementing this interface.
     * <br>
     * <br>If &#64;pspec is a floating reference, it will be consumed.
     * @param g_iface any interface vtable for the    interface, or the default  vtable for the interface.
     * @param pspec the &#35;GParamSpec for the new property
    */
    public static void interfaceInstallProperty(@Nonnull ch.bailu.gtk.type.Pointer g_iface, @Nonnull ParamSpec pspec)  {
        JnaObject.INST().g_object_interface_install_property(asCPointerNotNull(g_iface), asCPointerNotNull(pspec));
    }

    public static long getTypeID() { 
        return JnaObject.INST().g_object_get_type(); 
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

[MethodModel:java-type-not-supported:newValist:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:newWithProperties:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:newv:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GParameter*}}:{j:}]

[MethodModel:java-type-not-supported:addWeakPointer:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:java-type-not-supported:getValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GValue*}}:{j:}]

[MethodModel:java-type-not-supported:removeWeakPointer:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:java-type-not-supported:setValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:setv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]

[FieldModel:g_type_instance:direct-type:{Gg:TypeInstance:{c:GTypeInstance}}:{j:long}]

[FieldModel:ref_count:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:qdata:previous-field-unsupported:{Gg:Data:{c:GData*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:interfaceListProperties:[ParameterModel:java-type-not-supported:{G_::{c:GParamSpec**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
