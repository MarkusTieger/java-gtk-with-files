/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A simple refcounted data type representing an immutable sequence of zero or
 * <br>more bytes from an unspecified origin.
 * <br>
 * <br>The purpose of a &#35;GBytes is to keep the memory region that it holds
 * <br>alive for as long as anyone holds a reference to the bytes.  When
 * <br>the last reference count is dropped, the memory is released. Multiple
 * <br>unrelated callers can use byte data in the &#35;GBytes without coordinating
 * <br>their activities, resting assured that the byte data will not change or
 * <br>move while they hold a reference.
 * <br>
 * <br>A &#35;GBytes can come from many different origins that may have
 * <br>different procedures for freeing the memory region.  Examples are
 * <br>memory from g_malloc(), from memory slices, from a &#35;GMappedFile or
 * <br>memory from other allocators.
 * <br>
 * <br>&#35;GBytes work well as keys in &#35;GHashTable. Use g_bytes_equal() and
 * <br>g_bytes_hash() as parameters to g_hash_table_new() or g_hash_table_new_full().
 * <br>&#35;GBytes can also be used as keys in a &#35;GTree by passing the g_bytes_compare()
 * <br>function to g_tree_new().
 * <br>
 * <br>The data pointed to by this bytes must not be modified. For a mutable
 * <br>array of bytes see &#35;GByteArray. Use g_bytes_unref_to_array() to create a
 * <br>mutable array for a &#35;GBytes sequence. To create an immutable &#35;GBytes from
 * <br>a mutable &#35;GByteArray, use the g_byte_array_free_to_bytes() function.
 * <p><a href="https://docs.gtk.org/glib/struct.Bytes.html">https://docs.gtk.org/glib/struct.Bytes.html</a></p>
*/
public class Bytes extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Bytes.class.getCanonicalName());
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
    
    private static JnaBytes.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaBytes.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Bytes(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GBytes from static data.
     * <br>
     * <br>&#64;data must be static (ie: never modified or freed). It may be %NULL if &#64;size
     * <br>is 0.
     * @param data         the data to be used for the bytes
     * @param size the size of &#64;data
     * @return a new &#35;GBytes
    */
    public static Bytes newStaticBytes(@Nullable ch.bailu.gtk.type.Pointer data, long size)  {
        PointerContainer __self = cast(JnaBytes.INST().g_bytes_new_static(asCPointer(data), size));
        if (__self.isNull()) {
            throw new NullPointerException("Bytes:newStatic");
        }
        return new Bytes(__self);
    }        
    

    /**
     * Creates a new &#35;GBytes from &#64;data.
     * <br>
     * <br>After this call, &#64;data belongs to the bytes and may no longer be
     * <br>modified by the caller.  g_free() will be called on &#64;data when the
     * <br>bytes is no longer in use. Because of this &#64;data must have been created by
     * <br>a call to g_malloc(), g_malloc0() or g_realloc() or by one of the many
     * <br>functions that wrap these calls (such as g_new(), g_strdup(), etc).
     * <br>
     * <br>For creating &#35;GBytes with memory from other allocators, see
     * <br>g_bytes_new_with_free_func().
     * <br>
     * <br>&#64;data may be %NULL if &#64;size is 0.
     * @param data         the data to be used for the bytes
     * @param size the size of &#64;data
     * @return a new &#35;GBytes
    */
    public static Bytes newTakeBytes(@Nullable ch.bailu.gtk.type.Pointer data, long size)  {
        PointerContainer __self = cast(JnaBytes.INST().g_bytes_new_take(asCPointer(data), size));
        if (__self.isNull()) {
            throw new NullPointerException("Bytes:newTake");
        }
        return new Bytes(__self);
    }        
    

    /**
     * Creates a &#35;GBytes from &#64;data.
     * <br>
     * <br>When the last reference is dropped, &#64;free_func will be called with the
     * <br>&#64;user_data argument.
     * <br>
     * <br>&#64;data must not be modified after this call is made until &#64;free_func has
     * <br>been called to indicate that the bytes is no longer in use.
     * <br>
     * <br>&#64;data may be %NULL if &#64;size is 0.
     * @param data         the data to be used for the bytes
     * @param size the size of &#64;data
     * @param free_func the function to call to release the data
     * @param user_data data to pass to &#64;free_func
     * @return a new &#35;GBytes
    */
    public static Bytes newWithFreeFuncBytes(@Nullable ch.bailu.gtk.type.Pointer data, long size, OnDestroyNotify free_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        PointerContainer __self = cast(JnaBytes.INST().g_bytes_new_with_free_func(asCPointer(data), size, toOnDestroyNotify(getClassHandler().getInstance(), "newWithFreeFunc", free_func), asCPointer(user_data)));
        if (__self.isNull()) {
            throw new NullPointerException("Bytes:newWithFreeFunc");
        }
        return new Bytes(__self);
    }        
    

    /**
     * Creates a new &#35;GBytes from &#64;data.
     * <br>
     * <br>&#64;data is copied. If &#64;size is 0, &#64;data may be %NULL.
     * @param data         the data to be used for the bytes
     * @param size the size of &#64;data
    */
    public Bytes(@Nullable ch.bailu.gtk.type.Pointer data, long size) {
        super(cast(JnaBytes.INST().g_bytes_new(asCPointer(data), size)));
    }

    /**
     * Compares the two &#35;GBytes values.
     * <br>
     * <br>This function can be used to sort GBytes instances in lexicographical order.
     * <br>
     * <br>If &#64;bytes1 and &#64;bytes2 have different length but the shorter one is a
     * <br>prefix of the longer one then the shorter one is considered to be less than
     * <br>the longer one. Otherwise the first byte where both differ is used for
     * <br>comparison. If &#64;bytes1 has a smaller value at that position it is
     * <br>considered less, otherwise greater than &#64;bytes2.
     * @param bytes2 a pointer to a &#35;GBytes to compare with &#64;bytes1
     * @return a negative value if &#64;bytes1 is less than &#64;bytes2, a positive value          if &#64;bytes1 is greater than &#64;bytes2, and zero if &#64;bytes1 is equal to          &#64;bytes2
    */
    public int compare(@Nonnull ch.bailu.gtk.type.Pointer bytes2)  {
        return JnaBytes.INST().g_bytes_compare(asCPointer(), asCPointerNotNull(bytes2));
    }

    /**
     * Compares the two &#35;GBytes values being pointed to and returns
     * <br>%TRUE if they are equal.
     * <br>
     * <br>This function can be passed to g_hash_table_new() as the &#64;key_equal_func
     * <br>parameter, when using non-%NULL &#35;GBytes pointers as keys in a &#35;GHashTable.
     * @param bytes2 a pointer to a &#35;GBytes to compare with &#64;bytes1
     * @return %TRUE if the two keys match.
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer bytes2)  {
        return JnaBytes.INST().g_bytes_equal(asCPointer(), asCPointerNotNull(bytes2));
    }

    /**
     * Get the byte data in the &#35;GBytes. This data should not be modified.
     * <br>
     * <br>This function will always return the same pointer for a given &#35;GBytes.
     * <br>
     * <br>%NULL may be returned if &#64;size is 0. This is not guaranteed, as the &#35;GBytes
     * <br>may represent an empty string with &#64;data non-%NULL and &#64;size as 0. %NULL will
     * <br>not be returned if &#64;size is non-zero.
     * @param size location to return size of byte data
     * @return           a pointer to the byte data, or %NULL
    */
    public ch.bailu.gtk.type.Pointer getData(@Nullable ch.bailu.gtk.type.Int64 size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBytes.INST().g_bytes_get_data(asCPointer(), asCPointer(size))));
    }

    /**
     * Gets a pointer to a region in &#64;bytes.
     * <br>
     * <br>The region starts at &#64;offset many bytes from the start of the data
     * <br>and contains &#64;n_elements many elements of &#64;element_size size.
     * <br>
     * <br>&#64;n_elements may be zero, but &#64;element_size must always be non-zero.
     * <br>Ideally, &#64;element_size is a static constant (eg: sizeof a struct).
     * <br>
     * <br>This function does careful bounds checking (including checking for
     * <br>arithmetic overflows) and returns a non-%NULL pointer if the
     * <br>specified region lies entirely within the &#64;bytes. If the region is
     * <br>in some way out of range, or if an overflow has occurred, then %NULL
     * <br>is returned.
     * <br>
     * <br>Note: it is possible to have a valid zero-size region. In this case,
     * <br>the returned pointer will be equal to the base pointer of the data of
     * <br>&#64;bytes, plus &#64;offset.  This will be non-%NULL except for the case
     * <br>where &#64;bytes itself was a zero-sized region.  Since it is unlikely
     * <br>that you will be using this function to check for a zero-sized region
     * <br>in a zero-sized &#64;bytes, %NULL effectively always means &quot;error&quot;.
     * @param element_size a non-zero element size
     * @param offset an offset to the start of the region within the &#64;bytes
     * @param n_elements the number of elements in the region
     * @return the requested region, or %NULL in case of an error
    */
    public ch.bailu.gtk.type.Pointer getRegion(long element_size, long offset, long n_elements)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBytes.INST().g_bytes_get_region(asCPointer(), element_size, offset, n_elements)));
    }

    /**
     * Get the size of the byte data in the &#35;GBytes.
     * <br>
     * <br>This function will always return the same value for a given &#35;GBytes.
     * @return the size
    */
    public long getSize()  {
        return JnaBytes.INST().g_bytes_get_size(asCPointer());
    }

    /**
     * Creates an integer hash code for the byte data in the &#35;GBytes.
     * <br>
     * <br>This function can be passed to g_hash_table_new() as the &#64;key_hash_func
     * <br>parameter, when using non-%NULL &#35;GBytes pointers as keys in a &#35;GHashTable.
     * @return a hash value corresponding to the key.
    */
    public int hash()  {
        return JnaBytes.INST().g_bytes_hash(asCPointer());
    }

    /**
     * Creates a &#35;GBytes which is a subsection of another &#35;GBytes. The &#64;offset +
     * <br>&#64;length may not be longer than the size of &#64;bytes.
     * <br>
     * <br>A reference to &#64;bytes will be held by the newly created &#35;GBytes until
     * <br>the byte data is no longer needed.
     * <br>
     * <br>Since 2.56, if &#64;offset is 0 and &#64;length matches the size of &#64;bytes, then
     * <br>&#64;bytes will be returned with the reference count incremented by 1. If &#64;bytes
     * <br>is a slice of another &#35;GBytes, then the resulting &#35;GBytes will reference
     * <br>the same &#35;GBytes instead of &#64;bytes. This allows consumers to simplify the
     * <br>usage of &#35;GBytes when asynchronously writing to streams.
     * @param offset offset which subsection starts at
     * @param length length of subsection
     * @return a new &#35;GBytes
    */
    public Bytes newFromBytes(long offset, long length)  {
        return new Bytes(new PointerContainer(JnaBytes.INST().g_bytes_new_from_bytes(asCPointer(), offset, length)));
    }

    /**
     * Increase the reference count on &#64;bytes.
     * @return the &#35;GBytes
    */
    public Bytes ref()  {
        return new Bytes(new PointerContainer(JnaBytes.INST().g_bytes_ref(asCPointer())));
    }

    /**
     * Releases a reference on &#64;bytes.  This may result in the bytes being
     * <br>freed. If &#64;bytes is %NULL, it will return immediately.
    */
    public void unref()  {
        JnaBytes.INST().g_bytes_unref(asCPointer());
    }

    /**
     * Unreferences the bytes, and returns a new mutable &#35;GByteArray containing
     * <br>the same byte data.
     * <br>
     * <br>As an optimization, the byte data is transferred to the array without copying
     * <br>if this was the last reference to bytes and bytes was created with
     * <br>g_bytes_new(), g_bytes_new_take() or g_byte_array_free_to_bytes(). In all
     * <br>other cases the data is copied.
     * <br>
     * <br>Do not use it if &#64;bytes contains more than %G_MAXUINT
     * <br>bytes. &#35;GByteArray stores the length of its data in &#35;guint, which
     * <br>may be shorter than &#35;gsize, that &#64;bytes is using.
     * @return a new mutable &#35;GByteArray containing the same byte data
    */
    public ByteArray unrefToArray()  {
        return new ByteArray(new PointerContainer(JnaBytes.INST().g_bytes_unref_to_array(asCPointer())));
    }

    /**
     * Unreferences the bytes, and returns a pointer the same byte data
     * <br>contents.
     * <br>
     * <br>As an optimization, the byte data is returned without copying if this was
     * <br>the last reference to bytes and bytes was created with g_bytes_new(),
     * <br>g_bytes_new_take() or g_byte_array_free_to_bytes(). In all other cases the
     * <br>data is copied.
     * @param size location to place the length of the returned data
     * @return a pointer to the same byte data, which should be          freed with g_free()
    */
    public ch.bailu.gtk.type.Pointer unrefToData(@Nonnull ch.bailu.gtk.type.Int64 size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBytes.INST().g_bytes_unref_to_data(asCPointer(), asCPointerNotNull(size))));
    }

    public static long getTypeID() { 
        return JnaBytes.INST().g_bytes_get_type(); 
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
*/
