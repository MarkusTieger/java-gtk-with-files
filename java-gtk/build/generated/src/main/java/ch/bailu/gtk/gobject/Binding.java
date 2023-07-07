/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GBinding is the representation of a binding between a property on a
 * <br>&#35;GObject instance (or source) and another property on another &#35;GObject
 * <br>instance (or target).
 * <br>
 * <br>Whenever the source property changes, the same value is applied to the
 * <br>target property; for instance, the following binding:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   g_object_bind_property (object1, &quot;property-a&quot;,
 *                           object2, &quot;property-b&quot;,
 *                           G_BINDING_DEFAULT);
 * </pre>
 * <br>
 * <br>will cause the property named &quot;property-b&quot; of &#64;object2 to be updated
 * <br>every time g_object_set() or the specific accessor changes the value of
 * <br>the property &quot;property-a&quot; of &#64;object1.
 * <br>
 * <br>It is possible to create a bidirectional binding between two properties
 * <br>of two &#35;GObject instances, so that if either property changes, the
 * <br>other is updated as well, for instance:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   g_object_bind_property (object1, &quot;property-a&quot;,
 *                           object2, &quot;property-b&quot;,
 *                           G_BINDING_BIDIRECTIONAL);
 * </pre>
 * <br>
 * <br>will keep the two properties in sync.
 * <br>
 * <br>It is also possible to set a custom transformation function (in both
 * <br>directions, in case of a bidirectional binding) to apply a custom
 * <br>transformation from the source value to the target value before
 * <br>applying it; for instance, the following binding:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   g_object_bind_property_full (adjustment1, &quot;value&quot;,
 *                                adjustment2, &quot;value&quot;,
 *                                G_BINDING_BIDIRECTIONAL,
 *                                celsius_to_fahrenheit,
 *                                fahrenheit_to_celsius,
 *                                NULL, NULL);
 * </pre>
 * <br>
 * <br>will keep the &quot;value&quot; property of the two adjustments in sync; the
 * <br>&#64;celsius_to_fahrenheit function will be called whenever the &quot;value&quot;
 * <br>property of &#64;adjustment1 changes and will transform the current value
 * <br>of the property before applying it to the &quot;value&quot; property of &#64;adjustment2.
 * <br>
 * <br>Vice versa, the &#64;fahrenheit_to_celsius function will be called whenever
 * <br>the &quot;value&quot; property of &#64;adjustment2 changes, and will transform the
 * <br>current value of the property before applying it to the &quot;value&quot; property
 * <br>of &#64;adjustment1.
 * <br>
 * <br>Note that &#35;GBinding does not resolve cycles by itself; a cycle like
 * <br>
 * <pre>
 *   object1:propertyA -&gt; object2:propertyB
 *   object2:propertyB -&gt; object3:propertyC
 *   object3:propertyC -&gt; object1:propertyA
 * </pre>
 * <br>
 * <br>might lead to an infinite loop. The loop, in this particular case,
 * <br>can be avoided if the objects emit the &#35;GObject::notify signal only
 * <br>if the value has effectively been changed. A binding is implemented
 * <br>using the &#35;GObject::notify signal, so it is susceptible to all the
 * <br>various ways of blocking a signal emission, like g_signal_stop_emission()
 * <br>or g_signal_handler_block().
 * <br>
 * <br>A binding will be severed, and the resources it allocates freed, whenever
 * <br>either one of the &#35;GObject instances it refers to are finalized, or when
 * <br>the &#35;GBinding instance loses its last reference.
 * <br>
 * <br>Bindings for languages with garbage collection can use
 * <br>g_binding_unbind() to explicitly release a binding between the source
 * <br>and target properties, instead of relying on the last reference on the
 * <br>binding, source, and target instances to drop.
 * <br>
 * <br>&#35;GBinding is available since GObject 2.26
 * <p><a href="https://docs.gtk.org/gobject/class.Binding.html">https://docs.gtk.org/gobject/class.Binding.html</a></p>
*/
public class Binding extends Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Binding.class.getCanonicalName());
    }

    public Binding(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the &#35;GObject instance used as the source of the binding.
     * <br>
     * <br>A &#35;GBinding can outlive the source &#35;GObject as the binding does not hold a
     * <br>strong reference to the source. If the source is destroyed before the
     * <br>binding then this function will return %NULL.
     * @return the source &#35;GObject, or %NULL if the     source does not exist any more.
    */
    public Object dupSource()  {
        return new Object(new PointerContainer(JnaBinding.INST().g_binding_dup_source(asCPointer())));
    }

    /**
     * Retrieves the &#35;GObject instance used as the target of the binding.
     * <br>
     * <br>A &#35;GBinding can outlive the target &#35;GObject as the binding does not hold a
     * <br>strong reference to the target. If the target is destroyed before the
     * <br>binding then this function will return %NULL.
     * @return the target &#35;GObject, or %NULL if the     target does not exist any more.
    */
    public Object dupTarget()  {
        return new Object(new PointerContainer(JnaBinding.INST().g_binding_dup_target(asCPointer())));
    }

    /**
     * Retrieves the flags passed when constructing the &#35;GBinding.
     * @return the &#35;GBindingFlags used by the &#35;GBinding
    */
    public int getFlags()  {
        return JnaBinding.INST().g_binding_get_flags(asCPointer());
    }

    /**
     * Retrieves the name of the property of &#35;GBinding:source used as the source
     * <br>of the binding.
     * @return the name of the source property
    */
    public ch.bailu.gtk.type.Str getSourceProperty()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBinding.INST().g_binding_get_source_property(asCPointer())));
    }

    /**
     * Retrieves the name of the property of &#35;GBinding:target used as the target
     * <br>of the binding.
     * @return the name of the target property
    */
    public ch.bailu.gtk.type.Str getTargetProperty()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBinding.INST().g_binding_get_target_property(asCPointer())));
    }

    /**
     * Explicitly releases the binding between the source and the target
     * <br>property expressed by &#64;binding.
     * <br>
     * <br>This function will release the reference that is being held on
     * <br>the &#64;binding instance if the binding is still bound; if you want to hold on
     * <br>to the &#35;GBinding instance after calling g_binding_unbind(), you will need
     * <br>to hold a reference to it.
     * <br>
     * <br>Note however that this function does not take ownership of &#64;binding, it
     * <br>only unrefs the reference that was initially created by
     * <br>g_object_bind_property() and is owned by the binding.
    */
    public void unbind()  {
        JnaBinding.INST().g_binding_unbind(asCPointer());
    }

    public static long getTypeID() { 
        return JnaBinding.INST().g_binding_get_type(); 
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

[MethodModel:cb-deprecated:getSource:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]

[MethodModel:cb-deprecated:getTarget:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
*/
