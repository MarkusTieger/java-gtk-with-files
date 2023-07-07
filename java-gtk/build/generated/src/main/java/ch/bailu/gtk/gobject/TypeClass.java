/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure used as the base of all classes.
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeClass.html">https://docs.gtk.org/gobject/struct.TypeClass.html</a></p>
*/
public class TypeClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeClass.class.getCanonicalName());
    }

    public TypeClass(PointerContainer pointer) {
        super(pointer);
    }

    public TypeClass() {
        super(cast(JnaTypeClass.allocateStructure()));
    }

    private JnaTypeClass.Fields _fields;
    
    JnaTypeClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String G_TYPE = "g_type";

    /**
     * 
    */
    public long getFieldGType() {
       toFields().readField(G_TYPE);
       return toFields().g_type;
    } 

    /**
     * Gets the offset of the private data for instances of &#64;g_class.
     * <br>
     * <br>This is how many bytes you should add to the instance pointer of a
     * <br>class in order to get the private data for the type represented by
     * <br>&#64;g_class.
     * <br>
     * <br>You can only call this function after you have registered a private
     * <br>data area for &#64;g_class using g_type_class_add_private().
     * @return the offset, in bytes
    */
    public int getInstancePrivateOffset()  {
        return JnaTypeClass.INST().g_type_class_get_instance_private_offset(asCPointer());
    }

    /**
     * 
     * @param private_type 
     * @return 
    */
    public ch.bailu.gtk.type.Pointer getPrivate(long private_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeClass.INST().g_type_class_get_private(asCPointer(), private_type)));
    }

    /**
     * This is a convenience function often needed in class initializers.
     * <br>It returns the class structure of the immediate parent type of the
     * <br>class passed in.  Since derived classes hold a reference count on
     * <br>their parent classes as long as they are instantiated, the returned
     * <br>class will always exist.
     * <br>
     * <br>This function is essentially equivalent to:
     * <br>g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     * @return the parent class     of &#64;g_class
    */
    public ch.bailu.gtk.type.Pointer peekParent()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeClass.INST().g_type_class_peek_parent(asCPointer())));
    }

    /**
     * Decrements the reference count of the class structure being passed in.
     * <br>Once the last reference count of a class has been released, classes
     * <br>may be finalized by the type system, so further dereferencing of a
     * <br>class pointer after g_type_class_unref() are invalid.
    */
    public void unref()  {
        JnaTypeClass.INST().g_type_class_unref(asCPointer());
    }

    /**
     * A variant of g_type_class_unref() for use in &#35;GTypeClassCacheFunc
     * <br>implementations. It unreferences a class without consulting the chain
     * <br>of &#35;GTypeClassCacheFuncs, avoiding the recursion which would occur
     * <br>otherwise.
    */
    public void unrefUncached()  {
        JnaTypeClass.INST().g_type_class_unref_uncached(asCPointer());
    }

    /**
     * 
     * @param g_class 
     * @param private_size_or_offset 
    */
    public static void adjustPrivateOffset(@Nullable ch.bailu.gtk.type.Pointer g_class, @Nonnull ch.bailu.gtk.type.Int private_size_or_offset)  {
        JnaTypeClass.INST().g_type_class_adjust_private_offset(asCPointer(g_class), asCPointerNotNull(private_size_or_offset));
    }

    /**
     * This function is essentially the same as g_type_class_ref(),
     * <br>except that the classes reference count isn't incremented.
     * <br>As a consequence, this function may return %NULL if the class
     * <br>of the type passed in does not currently exist (hasn't been
     * <br>referenced before).
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID or %NULL if the class does not     currently exist
    */
    public static ch.bailu.gtk.type.Pointer peek(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeClass.INST().g_type_class_peek(type)));
    }

    /**
     * A more efficient version of g_type_class_peek() which works only for
     * <br>static types.
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID or %NULL if the class does not     currently exist or is dynamically loaded
    */
    public static ch.bailu.gtk.type.Pointer peekStatic(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeClass.INST().g_type_class_peek_static(type)));
    }

    /**
     * Increments the reference count of the class structure belonging to
     * <br>&#64;type. This function will demand-create the class if it doesn't
     * <br>exist already.
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID
    */
    public static ch.bailu.gtk.type.Pointer ref(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTypeClass.INST().g_type_class_ref(type)));
    }

    public static int getInstanceSize() {
        return 8;
    }

}

/*
record-type
all-fields-supported

[MethodModel:cb-deprecated:addPrivate:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
