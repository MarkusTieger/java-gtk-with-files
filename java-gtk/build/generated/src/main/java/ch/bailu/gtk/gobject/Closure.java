/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GClosure represents a callback supplied by the programmer.
 * <br>
 * <br>It will generally comprise a function of some kind and a marshaller
 * <br>used to call it. It is the responsibility of the marshaller to
 * <br>convert the arguments for the invocation from &#35;GValues into
 * <br>a suitable form, perform the callback on the converted arguments,
 * <br>and transform the return value back into a &#35;GValue.
 * <br>
 * <br>In the case of C programs, a closure usually just holds a pointer
 * <br>to a function and maybe a data argument, and the marshaller
 * <br>converts between &#35;GValue and native C types. The GObject
 * <br>library provides the &#35;GCClosure type for this purpose. Bindings for
 * <br>other languages need marshallers which convert between &#35;GValues
 * <br>and suitable representations in the runtime of the language in
 * <br>order to use functions written in that language as callbacks. Use
 * <br>g_closure_set_marshal() to set the marshaller on such a custom
 * <br>closure implementation.
 * <br>
 * <br>Within GObject, closures play an important role in the
 * <br>implementation of signals. When a signal is registered, the
 * <br>&#64;c_marshaller argument to g_signal_new() specifies the default C
 * <br>marshaller for any closure which is connected to this
 * <br>signal. GObject provides a number of C marshallers for this
 * <br>purpose, see the g_cclosure_marshal_*() functions. Additional C
 * <br>marshallers can be generated with the [glib-genmarshal][glib-genmarshal]
 * <br>utility.  Closures can be explicitly connected to signals with
 * <br>g_signal_connect_closure(), but it usually more convenient to let
 * <br>GObject create a closure automatically by using one of the
 * <br>g_signal_connect_*() functions which take a callback function/user
 * <br>data pair.
 * <br>
 * <br>Using closures has a number of important advantages over a simple
 * <br>callback function/data pointer combination:
 * <br>
 * <br>- Closures allow the callee to get the types of the callback parameters,
 * <br>  which means that language bindings don't have to write individual glue
 * <br>  for each callback type.
 * <br>
 * <br>- The reference counting of &#35;GClosure makes it easy to handle reentrancy
 * <br>  right; if a callback is removed while it is being invoked, the closure
 * <br>  and its parameters won't be freed until the invocation finishes.
 * <br>
 * <br>- g_closure_invalidate() and invalidation notifiers allow callbacks to be
 * <br>  automatically removed when the objects they point to go away.
 * <p><a href="https://docs.gtk.org/gobject/struct.Closure.html">https://docs.gtk.org/gobject/struct.Closure.html</a></p>
*/
public class Closure extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Closure.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClosureNotify {
        /**
         * The type used for the various notification callbacks which can be registered
         * <br>on closures.
         * @param data data specified when registering the notification callback
         * @param closure the &#35;GClosure on which the notification is emitted
        */
        void onClosureNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Closure closure);
    }
    
    private static JnaClosure.OnClosureNotify toOnClosureNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosureNotify in) {
        JnaClosure.OnClosureNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _closure) -> in.onClosureNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Closure(new PointerContainer(_closure)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMarshal {
        /**
         * 
         * @param closure 
         * @param return_value 
         * @param n_param_values 
         * @param param_values 
         * @param invocation_hint 
         * @param marshal_data 
        */
        void onMarshal(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nonnull ch.bailu.gtk.type.Pointer invocation_hint, @Nonnull ch.bailu.gtk.type.Pointer marshal_data);
    }
    
    private static JnaClosure.OnMarshal toOnMarshal(ch.bailu.gtk.type.Pointer instance, String methodName, OnMarshal in) {
        JnaClosure.OnMarshal out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_closure, _return_value, _n_param_values, _param_values, _invocation_hint, _marshal_data) -> in.onMarshal(__callback, new Closure(new PointerContainer(_closure)), new Value(new PointerContainer(_return_value)), _n_param_values, new Value(new PointerContainer(_param_values)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_invocation_hint)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_marshal_data)));
            __callback.register(out);
        }
        return out;
    }

    public Closure(PointerContainer pointer) {
        super(pointer);
    }

    public Closure() {
        super(cast(JnaClosure.allocateStructure()));
    }

    private JnaClosure.Fields _fields;
    
    JnaClosure.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaClosure.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * 
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * 
    */
    public static final String META_MARSHAL_NOUSE = "meta_marshal_nouse";

    /**
     * 
    */
    public int getFieldMetaMarshalNouse() {
       toFields().readField(META_MARSHAL_NOUSE);
       return toFields().meta_marshal_nouse;
    } 

    /**
     * 
    */
    public static final String N_GUARDS = "n_guards";

    /**
     * 
    */
    public int getFieldNGuards() {
       toFields().readField(N_GUARDS);
       return toFields().n_guards;
    } 

    /**
     * 
    */
    public static final String N_FNOTIFIERS = "n_fnotifiers";

    /**
     * 
    */
    public int getFieldNFnotifiers() {
       toFields().readField(N_FNOTIFIERS);
       return toFields().n_fnotifiers;
    } 

    /**
     * 
    */
    public static final String N_INOTIFIERS = "n_inotifiers";

    /**
     * 
    */
    public int getFieldNInotifiers() {
       toFields().readField(N_INOTIFIERS);
       return toFields().n_inotifiers;
    } 

    /**
     * 
    */
    public static final String IN_INOTIFY = "in_inotify";

    /**
     * 
    */
    public int getFieldInInotify() {
       toFields().readField(IN_INOTIFY);
       return toFields().in_inotify;
    } 

    /**
     * 
    */
    public static final String FLOATING = "floating";

    /**
     * 
    */
    public int getFieldFloating() {
       toFields().readField(FLOATING);
       return toFields().floating;
    } 

    /**
     * 
    */
    public static final String DERIVATIVE_FLAG = "derivative_flag";

    /**
     * 
    */
    public int getFieldDerivativeFlag() {
       toFields().readField(DERIVATIVE_FLAG);
       return toFields().derivative_flag;
    } 

    /**
     * Indicates whether the closure is currently being invoked with
     * <br> g_closure_invoke()
    */
    public static final String IN_MARSHAL = "in_marshal";

    /**
     * Indicates whether the closure is currently being invoked with
     * <br> g_closure_invoke()
    */
    public void setFieldInMarshal(int in_marshal) {
        toFields().in_marshal = in_marshal;
        toFields().writeField(IN_MARSHAL);
    }

    /**
     * Indicates whether the closure is currently being invoked with
     * <br> g_closure_invoke()
    */
    public int getFieldInMarshal() {
       toFields().readField(IN_MARSHAL);
       return toFields().in_marshal;
    } 

    /**
     * Indicates whether the closure has been invalidated by
     * <br> g_closure_invalidate()
    */
    public static final String IS_INVALID = "is_invalid";

    /**
     * Indicates whether the closure has been invalidated by
     * <br> g_closure_invalidate()
    */
    public void setFieldIsInvalid(int is_invalid) {
        toFields().is_invalid = is_invalid;
        toFields().writeField(IS_INVALID);
    }

    /**
     * Indicates whether the closure has been invalidated by
     * <br> g_closure_invalidate()
    */
    public int getFieldIsInvalid() {
       toFields().readField(IS_INVALID);
       return toFields().is_invalid;
    } 

    /**
     * 
     * <br>See {@link OnMarshal#onMarshal}
    */
    public static final String MARSHAL = "marshal";

    /**
     * 
     * <br>See {@link OnMarshal#onMarshal}
    */
    public void setFieldMarshal(OnMarshal marshal) {
        toFields().marshal = toOnMarshal(this, MARSHAL, marshal);
        toFields().writeField(MARSHAL);
    }

    /**
     * 
     * <br>See {@link OnMarshal#onMarshal}
    */
    public JnaClosure.OnMarshal getFieldMarshal() {
       toFields().readField(MARSHAL);
       return toFields().marshal;
    } 

    /**
     * 
    */
    public static final String DATA = "data";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * 
    */
    public static final String NOTIFIERS = "notifiers";

    /**
     * 
    */
    public ClosureNotifyData getFieldNotifiers() {
       toFields().readField(NOTIFIERS);
       return new ClosureNotifyData(new PointerContainer(toFields().notifiers));
    } 

    /**
     * A variant of g_closure_new_simple() which stores &#64;object in the
     * <br>&#64;data field of the closure and calls g_object_watch_closure() on
     * <br>&#64;object and the created closure. This function is mainly useful
     * <br>when implementing new types of closures.
     * @param sizeof_closure the size of the structure to allocate, must be at least  `sizeof (GClosure)`
     * @param object a &#35;GObject pointer to store in the &#64;data field of the newly  allocated &#35;GClosure
     * @return a newly allocated &#35;GClosure
    */
    public static Closure newObjectClosure(int sizeof_closure, @Nonnull Object object)  {
        PointerContainer __self = cast(JnaClosure.INST().g_closure_new_object(sizeof_closure, asCPointerNotNull(object)));
        if (__self.isNull()) {
            throw new NullPointerException("Closure:newObject");
        }
        return new Closure(__self);
    }        
    

    /**
     * Allocates a struct of the given size and initializes the initial
     * <br>part as a &#35;GClosure.
     * <br>
     * <br>This function is mainly useful when implementing new types of closures:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * typedef struct _MyClosure MyClosure;
     * struct _MyClosure
     * {
     *   GClosure closure;
     *   // extra data goes here
     * };
     * 
     * static void
     * my_closure_finalize (gpointer  notify_data,
     *                      GClosure *closure)
     * {
     *   MyClosure *my_closure = (MyClosure *)closure;
     * 
     *   // free extra data here
     * }
     * 
     * MyClosure *my_closure_new (gpointer data)
     * {
     *   GClosure *closure;
     *   MyClosure *my_closure;
     * 
     *   closure = g_closure_new_simple (sizeof (MyClosure), data);
     *   my_closure = (MyClosure *) closure;
     * 
     *   // initialize extra data here
     * 
     *   g_closure_add_finalize_notifier (closure, notify_data,
     *                                    my_closure_finalize);
     *   return my_closure;
     * }
     * </pre>
     * @param sizeof_closure the size of the structure to allocate, must be at least                  `sizeof (GClosure)`
     * @param data data to store in the &#64;data field of the newly allocated &#35;GClosure
     * @return a floating reference to a new &#35;GClosure
    */
    public static Closure newSimpleClosure(int sizeof_closure, @Nullable ch.bailu.gtk.type.Pointer data)  {
        PointerContainer __self = cast(JnaClosure.INST().g_closure_new_simple(sizeof_closure, asCPointer(data)));
        if (__self.isNull()) {
            throw new NullPointerException("Closure:newSimple");
        }
        return new Closure(__self);
    }        
    

    /**
     * Registers a finalization notifier which will be called when the
     * <br>reference count of &#64;closure goes down to 0.
     * <br>
     * <br>Multiple finalization notifiers on a single closure are invoked in
     * <br>unspecified order. If a single call to g_closure_unref() results in
     * <br>the closure being both invalidated and finalized, then the invalidate
     * <br>notifiers will be run before the finalize notifiers.
     * @param notify_data data to pass to &#64;notify_func
     * @param notify_func the callback function to register
    */
    public void addFinalizeNotifier(@Nullable ch.bailu.gtk.type.Pointer notify_data, OnClosureNotify notify_func)  {
        JnaClosure.INST().g_closure_add_finalize_notifier(asCPointer(), asCPointer(notify_data), toOnClosureNotify(this, "addFinalizeNotifier", notify_func));
    }

    /**
     * Registers an invalidation notifier which will be called when the
     * <br>&#64;closure is invalidated with g_closure_invalidate().
     * <br>
     * <br>Invalidation notifiers are invoked before finalization notifiers,
     * <br>in an unspecified order.
     * @param notify_data data to pass to &#64;notify_func
     * @param notify_func the callback function to register
    */
    public void addInvalidateNotifier(@Nullable ch.bailu.gtk.type.Pointer notify_data, OnClosureNotify notify_func)  {
        JnaClosure.INST().g_closure_add_invalidate_notifier(asCPointer(), asCPointer(notify_data), toOnClosureNotify(this, "addInvalidateNotifier", notify_func));
    }

    /**
     * Adds a pair of notifiers which get invoked before and after the
     * <br>closure callback, respectively.
     * <br>
     * <br>This is typically used to protect the extra arguments for the
     * <br>duration of the callback. See g_object_watch_closure() for an
     * <br>example of marshal guards.
     * @param pre_marshal_data data to pass  to &#64;pre_marshal_notify
     * @param pre_marshal_notify a function to call before the closure callback
     * @param post_marshal_data data to pass  to &#64;post_marshal_notify
     * @param post_marshal_notify a function to call after the closure callback
    */
    public void addMarshalGuards(@Nullable ch.bailu.gtk.type.Pointer pre_marshal_data, OnClosureNotify pre_marshal_notify, @Nullable ch.bailu.gtk.type.Pointer post_marshal_data, OnClosureNotify post_marshal_notify)  {
        JnaClosure.INST().g_closure_add_marshal_guards(asCPointer(), asCPointer(pre_marshal_data), toOnClosureNotify(this, "addMarshalGuards", pre_marshal_notify), asCPointer(post_marshal_data), toOnClosureNotify(this, "addMarshalGuards", post_marshal_notify));
    }

    /**
     * Sets a flag on the closure to indicate that its calling
     * <br>environment has become invalid, and thus causes any future
     * <br>invocations of g_closure_invoke() on this &#64;closure to be
     * <br>ignored.
     * <br>
     * <br>Also, invalidation notifiers installed on the closure will
     * <br>be called at this point. Note that unless you are holding a
     * <br>reference to the closure yourself, the invalidation notifiers may
     * <br>unref the closure and cause it to be destroyed, so if you need to
     * <br>access the closure after calling g_closure_invalidate(), make sure
     * <br>that you've previously called g_closure_ref().
     * <br>
     * <br>Note that g_closure_invalidate() will also be called when the
     * <br>reference count of a closure drops to zero (unless it has already
     * <br>been invalidated before).
    */
    public void invalidate()  {
        JnaClosure.INST().g_closure_invalidate(asCPointer());
    }

    /**
     * Increments the reference count on a closure to force it staying
     * <br>alive while the caller holds a pointer to it.
     * @return The &#64;closure passed in, for convenience
    */
    public Closure ref()  {
        return new Closure(new PointerContainer(JnaClosure.INST().g_closure_ref(asCPointer())));
    }

    /**
     * Removes a finalization notifier.
     * <br>
     * <br>Notice that notifiers are automatically removed after they are run.
     * @param notify_data data which was passed to g_closure_add_finalize_notifier()  when registering &#64;notify_func
     * @param notify_func the callback function to remove
    */
    public void removeFinalizeNotifier(@Nullable ch.bailu.gtk.type.Pointer notify_data, OnClosureNotify notify_func)  {
        JnaClosure.INST().g_closure_remove_finalize_notifier(asCPointer(), asCPointer(notify_data), toOnClosureNotify(this, "removeFinalizeNotifier", notify_func));
    }

    /**
     * Removes an invalidation notifier.
     * <br>
     * <br>Notice that notifiers are automatically removed after they are run.
     * @param notify_data data which was passed to g_closure_add_invalidate_notifier()               when registering &#64;notify_func
     * @param notify_func the callback function to remove
    */
    public void removeInvalidateNotifier(@Nullable ch.bailu.gtk.type.Pointer notify_data, OnClosureNotify notify_func)  {
        JnaClosure.INST().g_closure_remove_invalidate_notifier(asCPointer(), asCPointer(notify_data), toOnClosureNotify(this, "removeInvalidateNotifier", notify_func));
    }

    /**
     * Takes over the initial ownership of a closure.
     * <br>
     * <br>Each closure is initially created in a &quot;floating&quot; state, which means
     * <br>that the initial reference count is not owned by any caller.
     * <br>
     * <br>This function checks to see if the object is still floating, and if so,
     * <br>unsets the floating state and decreases the reference count. If the
     * <br>closure is not floating, g_closure_sink() does nothing.
     * <br>
     * <br>The reason for the existence of the floating state is to prevent
     * <br>cumbersome code sequences like:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * closure = g_cclosure_new (cb_func, cb_data);
     * g_source_set_closure (source, closure);
     * g_closure_unref (closure); // GObject doesn't really need this
     * </pre>
     * <br>
     * <br>Because g_source_set_closure() (and similar functions) take ownership of the
     * <br>initial reference count, if it is unowned, we instead can write:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_source_set_closure (source, g_cclosure_new (cb_func, cb_data));
     * </pre>
     * <br>
     * <br>Generally, this function is used together with g_closure_ref(). An example
     * <br>of storing a closure for later notification looks like:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static GClosure *notify_closure = NULL;
     * void
     * foo_notify_set_closure (GClosure *closure)
     * {
     *   if (notify_closure)
     *     g_closure_unref (notify_closure);
     *   notify_closure = closure;
     *   if (notify_closure)
     *     {
     *       g_closure_ref (notify_closure);
     *       g_closure_sink (notify_closure);
     *     }
     * }
     * </pre>
     * <br>
     * <br>Because g_closure_sink() may decrement the reference count of a closure
     * <br>(if it hasn't been called on &#64;closure yet) just like g_closure_unref(),
     * <br>g_closure_ref() should be called prior to this function.
    */
    public void sink()  {
        JnaClosure.INST().g_closure_sink(asCPointer());
    }

    /**
     * Decrements the reference count of a closure after it was previously
     * <br>incremented by the same caller.
     * <br>
     * <br>If no other callers are using the closure, then the closure will be
     * <br>destroyed and freed.
    */
    public void unref()  {
        JnaClosure.INST().g_closure_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaClosure.INST().g_closure_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:invoke:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:setMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:cb-not-supported:setMetaMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
*/
