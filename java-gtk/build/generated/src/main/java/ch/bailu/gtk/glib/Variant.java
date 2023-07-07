/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GVariant is a variant datatype; it can contain one or more values
 * <br>along with information about the type of the values.
 * <br>
 * <br>A &#35;GVariant may contain simple types, like an integer, or a boolean value;
 * <br>or complex types, like an array of two strings, or a dictionary of key
 * <br>value pairs. A &#35;GVariant is also immutable: once it's been created neither
 * <br>its type nor its content can be modified further.
 * <br>
 * <br>GVariant is useful whenever data needs to be serialized, for example when
 * <br>sending method parameters in D-Bus, or when saving settings using GSettings.
 * <br>
 * <br>When creating a new &#35;GVariant, you pass the data you want to store in it
 * <br>along with a string representing the type of data you wish to pass to it.
 * <br>
 * <br>For instance, if you want to create a &#35;GVariant holding an integer value you
 * <br>can use:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   GVariant *v = g_variant_new (&quot;u&quot;, 40);
 * </pre>
 * <br>
 * <br>The string &quot;u&quot; in the first argument tells &#35;GVariant that the data passed to
 * <br>the constructor (40) is going to be an unsigned integer.
 * <br>
 * <br>More advanced examples of &#35;GVariant in use can be found in documentation for
 * <br>[GVariant format strings][gvariant-format-strings-pointers].
 * <br>
 * <br>The range of possible values is determined by the type.
 * <br>
 * <br>The type system used by &#35;GVariant is &#35;GVariantType.
 * <br>
 * <br>&#35;GVariant instances always have a type and a value (which are given
 * <br>at construction time).  The type and value of a &#35;GVariant instance
 * <br>can never change other than by the &#35;GVariant itself being
 * <br>destroyed.  A &#35;GVariant cannot contain a pointer.
 * <br>
 * <br>&#35;GVariant is reference counted using g_variant_ref() and
 * <br>g_variant_unref().  &#35;GVariant also has floating reference counts --
 * <br>see g_variant_ref_sink().
 * <br>
 * <br>&#35;GVariant is completely threadsafe.  A &#35;GVariant instance can be
 * <br>concurrently accessed in any way from any number of threads without
 * <br>problems.
 * <br>
 * <br>&#35;GVariant is heavily optimised for dealing with data in serialized
 * <br>form.  It works particularly well with data located in memory-mapped
 * <br>files.  It can perform nearly all deserialization operations in a
 * <br>small constant time, usually touching only a single memory page.
 * <br>Serialized &#35;GVariant data can also be sent over the network.
 * <br>
 * <br>&#35;GVariant is largely compatible with D-Bus.  Almost all types of
 * <br>&#35;GVariant instances can be sent over D-Bus.  See &#35;GVariantType for
 * <br>exceptions.  (However, &#35;GVariant's serialization format is not the same
 * <br>as the serialization format of a D-Bus message body: use &#35;GDBusMessage,
 * <br>in the gio library, for those.)
 * <br>
 * <br>For space-efficiency, the &#35;GVariant serialization format does not
 * <br>automatically include the variant's length, type or endianness,
 * <br>which must either be implied from context (such as knowledge that a
 * <br>particular file format always contains a little-endian
 * <br>%G_VARIANT_TYPE_VARIANT which occupies the whole length of the file)
 * <br>or supplied out-of-band (for instance, a length, type and/or endianness
 * <br>indicator could be placed at the beginning of a file, network message
 * <br>or network stream).
 * <br>
 * <br>A &#35;GVariant's size is limited mainly by any lower level operating
 * <br>system constraints, such as the number of bits in &#35;gsize.  For
 * <br>example, it is reasonable to have a 2GB file mapped into memory
 * <br>with &#35;GMappedFile, and call g_variant_new_from_data() on it.
 * <br>
 * <br>For convenience to C programmers, &#35;GVariant features powerful
 * <br>varargs-based value construction and destruction.  This feature is
 * <br>designed to be embedded in other libraries.
 * <br>
 * <br>There is a Python-inspired text language for describing &#35;GVariant
 * <br>values.  &#35;GVariant includes a printer for this language and a parser
 * <br>with type inferencing.
 * <br>
 * <br>&#35;&#35; Memory Use
 * <br>
 * <br>&#35;GVariant tries to be quite efficient with respect to memory use.
 * <br>This section gives a rough idea of how much memory is used by the
 * <br>current implementation.  The information here is subject to change
 * <br>in the future.
 * <br>
 * <br>The memory allocated by &#35;GVariant can be grouped into 4 broad
 * <br>purposes: memory for serialized data, memory for the type
 * <br>information cache, buffer management memory and memory for the
 * <br>&#35;GVariant structure itself.
 * <br>
 * <br>&#35;&#35; Serialized Data Memory
 * <br>
 * <br>This is the memory that is used for storing GVariant data in
 * <br>serialized form.  This is what would be sent over the network or
 * <br>what would end up on disk, not counting any indicator of the
 * <br>endianness, or of the length or type of the top-level variant.
 * <br>
 * <br>The amount of memory required to store a boolean is 1 byte. 16,
 * <br>32 and 64 bit integers and double precision floating point numbers
 * <br>use their &quot;natural&quot; size.  Strings (including object path and
 * <br>signature strings) are stored with a nul terminator, and as such
 * <br>use the length of the string plus 1 byte.
 * <br>
 * <br>Maybe types use no space at all to represent the null value and
 * <br>use the same amount of space (sometimes plus one byte) as the
 * <br>equivalent non-maybe-typed value to represent the non-null case.
 * <br>
 * <br>Arrays use the amount of space required to store each of their
 * <br>members, concatenated.  Additionally, if the items stored in an
 * <br>array are not of a fixed-size (ie: strings, other arrays, etc)
 * <br>then an additional framing offset is stored for each item.  The
 * <br>size of this offset is either 1, 2 or 4 bytes depending on the
 * <br>overall size of the container.  Additionally, extra padding bytes
 * <br>are added as required for alignment of child values.
 * <br>
 * <br>Tuples (including dictionary entries) use the amount of space
 * <br>required to store each of their members, concatenated, plus one
 * <br>framing offset (as per arrays) for each non-fixed-sized item in
 * <br>the tuple, except for the last one.  Additionally, extra padding
 * <br>bytes are added as required for alignment of child values.
 * <br>
 * <br>Variants use the same amount of space as the item inside of the
 * <br>variant, plus 1 byte, plus the length of the type string for the
 * <br>item inside the variant.
 * <br>
 * <br>As an example, consider a dictionary mapping strings to variants.
 * <br>In the case that the dictionary is empty, 0 bytes are required for
 * <br>the serialization.
 * <br>
 * <br>If we add an item &quot;width&quot; that maps to the int32 value of 500 then
 * <br>we will use 4 byte to store the int32 (so 6 for the variant
 * <br>containing it) and 6 bytes for the string.  The variant must be
 * <br>aligned to 8 after the 6 bytes of the string, so that's 2 extra
 * <br>bytes.  6 (string) + 2 (padding) + 6 (variant) is 14 bytes used
 * <br>for the dictionary entry.  An additional 1 byte is added to the
 * <br>array as a framing offset making a total of 15 bytes.
 * <br>
 * <br>If we add another entry, &quot;title&quot; that maps to a nullable string
 * <br>that happens to have a value of null, then we use 0 bytes for the
 * <br>null value (and 3 bytes for the variant to contain it along with
 * <br>its type string) plus 6 bytes for the string.  Again, we need 2
 * <br>padding bytes.  That makes a total of 6 + 2 + 3 = 11 bytes.
 * <br>
 * <br>We now require extra padding between the two items in the array.
 * <br>After the 14 bytes of the first item, that's 2 bytes required.
 * <br>We now require 2 framing offsets for an extra two
 * <br>bytes. 14 + 2 + 11 + 2 = 29 bytes to encode the entire two-item
 * <br>dictionary.
 * <br>
 * <br>&#35;&#35; Type Information Cache
 * <br>
 * <br>For each GVariant type that currently exists in the program a type
 * <br>information structure is kept in the type information cache.  The
 * <br>type information structure is required for rapid deserialization.
 * <br>
 * <br>Continuing with the above example, if a &#35;GVariant exists with the
 * <br>type &quot;a{sv}&quot; then a type information struct will exist for
 * <br>&quot;a{sv}&quot;, &quot;{sv}&quot;, &quot;s&quot;, and &quot;v&quot;.  Multiple uses of the same type
 * <br>will share the same type information.  Additionally, all
 * <br>single-digit types are stored in read-only static memory and do
 * <br>not contribute to the writable memory footprint of a program using
 * <br>&#35;GVariant.
 * <br>
 * <br>Aside from the type information structures stored in read-only
 * <br>memory, there are two forms of type information.  One is used for
 * <br>container types where there is a single element type: arrays and
 * <br>maybe types.  The other is used for container types where there
 * <br>are multiple element types: tuples and dictionary entries.
 * <br>
 * <br>Array type info structures are 6 * sizeof (void *), plus the
 * <br>memory required to store the type string itself.  This means that
 * <br>on 32-bit systems, the cache entry for &quot;a{sv}&quot; would require 30
 * <br>bytes of memory (plus malloc overhead).
 * <br>
 * <br>Tuple type info structures are 6 * sizeof (void *), plus 4 *
 * <br>sizeof (void *) for each item in the tuple, plus the memory
 * <br>required to store the type string itself.  A 2-item tuple, for
 * <br>example, would have a type information structure that consumed
 * <br>writable memory in the size of 14 * sizeof (void *) (plus type
 * <br>string)  This means that on 32-bit systems, the cache entry for
 * <br>&quot;{sv}&quot; would require 61 bytes of memory (plus malloc overhead).
 * <br>
 * <br>This means that in total, for our &quot;a{sv}&quot; example, 91 bytes of
 * <br>type information would be allocated.
 * <br>
 * <br>The type information cache, additionally, uses a &#35;GHashTable to
 * <br>store and look up the cached items and stores a pointer to this
 * <br>hash table in static storage.  The hash table is freed when there
 * <br>are zero items in the type cache.
 * <br>
 * <br>Although these sizes may seem large it is important to remember
 * <br>that a program will probably only have a very small number of
 * <br>different types of values in it and that only one type information
 * <br>structure is required for many different values of the same type.
 * <br>
 * <br>&#35;&#35; Buffer Management Memory
 * <br>
 * <br>&#35;GVariant uses an internal buffer management structure to deal
 * <br>with the various different possible sources of serialized data
 * <br>that it uses.  The buffer is responsible for ensuring that the
 * <br>correct call is made when the data is no longer in use by
 * <br>&#35;GVariant.  This may involve a g_free() or a g_slice_free() or
 * <br>even g_mapped_file_unref().
 * <br>
 * <br>One buffer management structure is used for each chunk of
 * <br>serialized data.  The size of the buffer management structure
 * <br>is 4 * (void *).  On 32-bit systems, that's 16 bytes.
 * <br>
 * <br>&#35;&#35; GVariant structure
 * <br>
 * <br>The size of a &#35;GVariant structure is 6 * (void *).  On 32-bit
 * <br>systems, that's 24 bytes.
 * <br>
 * <br>&#35;GVariant structures only exist if they are explicitly created
 * <br>with API calls.  For example, if a &#35;GVariant is constructed out of
 * <br>serialized data for the example given above (with the dictionary)
 * <br>then although there are 9 individual values that comprise the
 * <br>entire dictionary (two keys, two values, two variants containing
 * <br>the values, two dictionary entries, plus the dictionary itself),
 * <br>only 1 &#35;GVariant instance exists -- the one referring to the
 * <br>dictionary.
 * <br>
 * <br>If calls are made to start accessing the other values then
 * <br>&#35;GVariant instances will exist for those values only for as long
 * <br>as they are in use (ie: until you call g_variant_unref()).  The
 * <br>type information is shared.  The serialized data and the buffer
 * <br>management structure for that serialized data is shared by the
 * <br>child.
 * <br>
 * <br>&#35;&#35; Summary
 * <br>
 * <br>To put the entire example together, for our dictionary mapping
 * <br>strings to variants (with two entries, as given above), we are
 * <br>using 91 bytes of memory for type information, 29 bytes of memory
 * <br>for the serialized data, 16 bytes for buffer management and 24
 * <br>bytes for the &#35;GVariant instance, or a total of 160 bytes, plus
 * <br>malloc overhead.  If we were to use g_variant_get_child_value() to
 * <br>access the two dictionary entries, we would use an additional 48
 * <br>bytes.  If we were to have other dictionaries of the same type, we
 * <br>would use more memory for the serialized data and buffer
 * <br>management for those dictionaries, but the type information would
 * <br>be shared.
 * <p><a href="https://docs.gtk.org/glib/struct.Variant.html">https://docs.gtk.org/glib/struct.Variant.html</a></p>
*/
public class Variant extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Variant.class.getCanonicalName());
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
    
    private static JnaVariant.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaVariant.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Variant(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new boolean &#35;GVariant instance -- either %TRUE or %FALSE.
     * @param value a &#35;gboolean value
     * @return a floating reference to a new boolean &#35;GVariant instance
    */
    public static Variant newBooleanVariant(boolean value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_boolean(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newBoolean");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new byte &#35;GVariant instance.
     * @param value a &#35;guint8 value
     * @return a floating reference to a new byte &#35;GVariant instance
    */
    public static Variant newByteVariant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_byte(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newByte");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates an array-of-bytes &#35;GVariant with the contents of &#64;string.
     * <br>This function is just like g_variant_new_string() except that the
     * <br>string need not be valid UTF-8.
     * <br>
     * <br>The nul terminator character at the end of the string is stored in
     * <br>the array.
     * @param string a normal          nul-terminated string in no particular encoding
     * @return a floating reference to a new bytestring &#35;GVariant instance
    */
    public static Variant newBytestringVariant(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_bytestring(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newBytestring");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates an array-of-bytes &#35;GVariant with the contents of &#64;string.
     * <br>This function is just like g_variant_new_string() except that the
     * <br>string need not be valid UTF-8.
     * <br>
     * <br>The nul terminator character at the end of the string is stored in
     * <br>the array.
     * @param string a normal          nul-terminated string in no particular encoding
     * @return a floating reference to a new bytestring &#35;GVariant instance
    */
    public static Variant newBytestringVariant(String string)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_bytestring(string));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newBytestring");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new dictionary entry &#35;GVariant. &#64;key and &#64;value must be
     * <br>non-%NULL. &#64;key must be a value of a basic type (ie: not a container).
     * <br>
     * <br>If the &#64;key or &#64;value are floating references (see g_variant_ref_sink()),
     * <br>the new instance takes ownership of them as if via g_variant_ref_sink().
     * @param key a basic &#35;GVariant, the key
     * @param value a &#35;GVariant, the value
     * @return a floating reference to a new dictionary entry &#35;GVariant
    */
    public static Variant newDictEntryVariant(@Nonnull Variant key, @Nonnull Variant value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_dict_entry(asCPointerNotNull(key), asCPointerNotNull(value)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newDictEntry");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new double &#35;GVariant instance.
     * @param value a &#35;gdouble floating point value
     * @return a floating reference to a new double &#35;GVariant instance
    */
    public static Variant newDoubleVariant(double value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_double(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newDouble");
        }
        return new Variant(__self);
    }        
    

    /**
     * Constructs a new array &#35;GVariant instance, where the elements are
     * <br>of &#64;element_type type.
     * <br>
     * <br>&#64;elements must be an array with fixed-sized elements.  Numeric types are
     * <br>fixed-size as are tuples containing only other fixed-sized types.
     * <br>
     * <br>&#64;element_size must be the size of a single element in the array.
     * <br>For example, if calling this function for an array of 32-bit integers,
     * <br>you might say sizeof(gint32). This value isn't used except for the purpose
     * <br>of a double-check that the form of the serialized data matches the caller's
     * <br>expectation.
     * <br>
     * <br>&#64;n_elements must be the length of the &#64;elements array.
     * @param element_type the &#35;GVariantType of each element
     * @param elements a pointer to the fixed array of contiguous elements
     * @param n_elements the number of elements
     * @param element_size the size of each element
     * @return a floating reference to a new array &#35;GVariant instance
    */
    public static Variant newFixedArrayVariant(@Nonnull VariantType element_type, @Nullable ch.bailu.gtk.type.Pointer elements, long n_elements, long element_size)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_fixed_array(asCPointerNotNull(element_type), asCPointer(elements), n_elements, element_size));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newFixedArray");
        }
        return new Variant(__self);
    }        
    

    /**
     * Constructs a new serialized-mode &#35;GVariant instance.  This is the
     * <br>inner interface for creation of new serialized values that gets
     * <br>called from various functions in gvariant.c.
     * <br>
     * <br>A reference is taken on &#64;bytes.
     * <br>
     * <br>The data in &#64;bytes must be aligned appropriately for the &#64;type being loaded.
     * <br>Otherwise this function will internally create a copy of the memory (since
     * <br>GLib 2.60) or (in older versions) fail and exit the process.
     * @param type a &#35;GVariantType
     * @param bytes a &#35;GBytes
     * @param trusted if the contents of &#64;bytes are trusted
     * @return a new &#35;GVariant with a floating reference
    */
    public static Variant newFromBytesVariant(@Nonnull VariantType type, @Nonnull Bytes bytes, boolean trusted)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_from_bytes(asCPointerNotNull(type), asCPointerNotNull(bytes), trusted));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newFromBytes");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new &#35;GVariant instance from serialized data.
     * <br>
     * <br>&#64;type is the type of &#35;GVariant instance that will be constructed.
     * <br>The interpretation of &#64;data depends on knowing the type.
     * <br>
     * <br>&#64;data is not modified by this function and must remain valid with an
     * <br>unchanging value until such a time as &#64;notify is called with
     * <br>&#64;user_data.  If the contents of &#64;data change before that time then
     * <br>the result is undefined.
     * <br>
     * <br>If &#64;data is trusted to be serialized data in normal form then
     * <br>&#64;trusted should be %TRUE.  This applies to serialized data created
     * <br>within this process or read from a trusted location on the disk (such
     * <br>as a file installed in /usr/lib alongside your application).  You
     * <br>should set trusted to %FALSE if &#64;data is read from the network, a
     * <br>file in the user's home directory, etc.
     * <br>
     * <br>If &#64;data was not stored in this machine's native endianness, any multi-byte
     * <br>numeric values in the returned variant will also be in non-native
     * <br>endianness. g_variant_byteswap() can be used to recover the original values.
     * <br>
     * <br>&#64;notify will be called with &#64;user_data when &#64;data is no longer
     * <br>needed.  The exact time of this call is unspecified and might even be
     * <br>before this function returns.
     * <br>
     * <br>Note: &#64;data must be backed by memory that is aligned appropriately for the
     * <br>&#64;type being loaded. Otherwise this function will internally create a copy of
     * <br>the memory (since GLib 2.60) or (in older versions) fail and exit the
     * <br>process.
     * @param type a definite &#35;GVariantType
     * @param data the serialized data
     * @param size the size of &#64;data
     * @param trusted %TRUE if &#64;data is definitely in normal form
     * @param notify function to call when &#64;data is no longer needed
     * @param user_data data for &#64;notify
     * @return a new floating &#35;GVariant of type &#64;type
    */
    public static Variant newFromDataVariant(@Nonnull VariantType type, @Nonnull ch.bailu.gtk.type.Pointer data, long size, boolean trusted, OnDestroyNotify notify, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_from_data(asCPointerNotNull(type), asCPointerNotNull(data), size, trusted, toOnDestroyNotify(getClassHandler().getInstance(), "newFromData", notify), asCPointer(user_data)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newFromData");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new handle &#35;GVariant instance.
     * <br>
     * <br>By convention, handles are indexes into an array of file descriptors
     * <br>that are sent alongside a D-Bus message.  If you're not interacting
     * <br>with D-Bus, you probably don't need them.
     * @param value a &#35;gint32 value
     * @return a floating reference to a new handle &#35;GVariant instance
    */
    public static Variant newHandleVariant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_handle(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newHandle");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new int16 &#35;GVariant instance.
     * @param value a &#35;gint16 value
     * @return a floating reference to a new int16 &#35;GVariant instance
    */
    public static Variant newInt16Variant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_int16(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newInt16");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new int32 &#35;GVariant instance.
     * @param value a &#35;gint32 value
     * @return a floating reference to a new int32 &#35;GVariant instance
    */
    public static Variant newInt32Variant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_int32(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newInt32");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new int64 &#35;GVariant instance.
     * @param value a &#35;gint64 value
     * @return a floating reference to a new int64 &#35;GVariant instance
    */
    public static Variant newInt64Variant(long value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_int64(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newInt64");
        }
        return new Variant(__self);
    }        
    

    /**
     * Depending on if &#64;child is %NULL, either wraps &#64;child inside of a
     * <br>maybe container or creates a Nothing instance for the given &#64;type.
     * <br>
     * <br>At least one of &#64;child_type and &#64;child must be non-%NULL.
     * <br>If &#64;child_type is non-%NULL then it must be a definite type.
     * <br>If they are both non-%NULL then &#64;child_type must be the type
     * <br>of &#64;child.
     * <br>
     * <br>If &#64;child is a floating reference (see g_variant_ref_sink()), the new
     * <br>instance takes ownership of &#64;child.
     * @param child_type the &#35;GVariantType of the child, or %NULL
     * @param child the child value, or %NULL
     * @return a floating reference to a new &#35;GVariant maybe instance
    */
    public static Variant newMaybeVariant(@Nullable VariantType child_type, @Nullable Variant child)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_maybe(asCPointer(child_type), asCPointer(child)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newMaybe");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a D-Bus object path &#35;GVariant with the contents of &#64;string.
     * <br>&#64;string must be a valid D-Bus object path.  Use
     * <br>g_variant_is_object_path() if you're not sure.
     * @param object_path a normal C nul-terminated string
     * @return a floating reference to a new object path &#35;GVariant instance
    */
    public static Variant newObjectPathVariant(@Nonnull ch.bailu.gtk.type.Str object_path)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_object_path(asCPointerNotNull(object_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newObjectPath");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a D-Bus object path &#35;GVariant with the contents of &#64;string.
     * <br>&#64;string must be a valid D-Bus object path.  Use
     * <br>g_variant_is_object_path() if you're not sure.
     * @param object_path a normal C nul-terminated string
     * @return a floating reference to a new object path &#35;GVariant instance
    */
    public static Variant newObjectPathVariant(String object_path)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_object_path(object_path));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newObjectPath");
        }
        return new Variant(__self);
    }        
    

    /**
     * Parses &#64;format and returns the result.
     * <br>
     * <br>&#64;format must be a text format &#35;GVariant with one extension: at any
     * <br>point that a value may appear in the text, a '%' character followed
     * <br>by a GVariant format string (as per g_variant_new()) may appear.  In
     * <br>that case, the same arguments are collected from the argument list as
     * <br>g_variant_new() would have collected.
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>Consider this simple example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_variant_new_parsed (&quot;[('one', 1), ('two', %i), (%s, 3)]&quot;, 2, &quot;three&quot;);
     * </pre>
     * <br>
     * <br>In the example, the variable argument parameters are collected and
     * <br>filled in as if they were part of the original string to produce the
     * <br>result of
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * [('one', 1), ('two', 2), ('three', 3)]
     * </pre>
     * <br>
     * <br>This function is intended only to be used with &#64;format as a string
     * <br>literal.  Any parse error is fatal to the calling process.  If you
     * <br>want to parse data from untrusted sources, use g_variant_parse().
     * <br>
     * <br>You may not use this function to return, unmodified, a single
     * <br>&#35;GVariant pointer from the argument list.  ie: &#64;format may not solely
     * <br>be anything along the lines of &quot;%*&quot;, &quot;%?&quot;, &quot;&#92;%r&quot;, or anything starting
     * <br>with &quot;%&#64;&quot;.
     * @param format a text format &#35;GVariant
     * @param _elipse arguments as per &#64;format
     * @return a new floating &#35;GVariant instance
    */
    public static Variant newParsedVariant(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_parsed(asCPointerNotNull(format), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newParsed");
        }
        return new Variant(__self);
    }        
    

    /**
     * Parses &#64;format and returns the result.
     * <br>
     * <br>&#64;format must be a text format &#35;GVariant with one extension: at any
     * <br>point that a value may appear in the text, a '%' character followed
     * <br>by a GVariant format string (as per g_variant_new()) may appear.  In
     * <br>that case, the same arguments are collected from the argument list as
     * <br>g_variant_new() would have collected.
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>Consider this simple example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  g_variant_new_parsed (&quot;[('one', 1), ('two', %i), (%s, 3)]&quot;, 2, &quot;three&quot;);
     * </pre>
     * <br>
     * <br>In the example, the variable argument parameters are collected and
     * <br>filled in as if they were part of the original string to produce the
     * <br>result of
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * [('one', 1), ('two', 2), ('three', 3)]
     * </pre>
     * <br>
     * <br>This function is intended only to be used with &#64;format as a string
     * <br>literal.  Any parse error is fatal to the calling process.  If you
     * <br>want to parse data from untrusted sources, use g_variant_parse().
     * <br>
     * <br>You may not use this function to return, unmodified, a single
     * <br>&#35;GVariant pointer from the argument list.  ie: &#64;format may not solely
     * <br>be anything along the lines of &quot;%*&quot;, &quot;%?&quot;, &quot;&#92;%r&quot;, or anything starting
     * <br>with &quot;%&#64;&quot;.
     * @param format a text format &#35;GVariant
     * @param _elipse arguments as per &#64;format
     * @return a new floating &#35;GVariant instance
    */
    public static Variant newParsedVariant(String format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_parsed(format, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newParsed");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a string-type GVariant using printf formatting.
     * <br>
     * <br>This is similar to calling g_strdup_printf() and then
     * <br>g_variant_new_string() but it saves a temporary variable and an
     * <br>unnecessary copy.
     * @param format_string a printf-style format string
     * @param _elipse arguments for &#64;format_string
     * @return a floating reference to a new string   &#35;GVariant instance
    */
    public static Variant newPrintfVariant(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_printf(asCPointerNotNull(format_string), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newPrintf");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a string-type GVariant using printf formatting.
     * <br>
     * <br>This is similar to calling g_strdup_printf() and then
     * <br>g_variant_new_string() but it saves a temporary variable and an
     * <br>unnecessary copy.
     * @param format_string a printf-style format string
     * @param _elipse arguments for &#64;format_string
     * @return a floating reference to a new string   &#35;GVariant instance
    */
    public static Variant newPrintfVariant(String format_string, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_printf(format_string, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newPrintf");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a D-Bus type signature &#35;GVariant with the contents of
     * <br>&#64;string.  &#64;string must be a valid D-Bus type signature.  Use
     * <br>g_variant_is_signature() if you're not sure.
     * @param signature a normal C nul-terminated string
     * @return a floating reference to a new signature &#35;GVariant instance
    */
    public static Variant newSignatureVariant(@Nonnull ch.bailu.gtk.type.Str signature)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_signature(asCPointerNotNull(signature)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newSignature");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a D-Bus type signature &#35;GVariant with the contents of
     * <br>&#64;string.  &#64;string must be a valid D-Bus type signature.  Use
     * <br>g_variant_is_signature() if you're not sure.
     * @param signature a normal C nul-terminated string
     * @return a floating reference to a new signature &#35;GVariant instance
    */
    public static Variant newSignatureVariant(String signature)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_signature(signature));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newSignature");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a string &#35;GVariant with the contents of &#64;string.
     * <br>
     * <br>&#64;string must be valid UTF-8, and must not be %NULL. To encode
     * <br>potentially-%NULL strings, use g_variant_new() with `ms` as the
     * <br>[format string][gvariant-format-strings-maybe-types].
     * @param string a normal UTF-8 nul-terminated string
     * @return a floating reference to a new string &#35;GVariant instance
    */
    public static Variant newStringVariant(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_string(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newString");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a string &#35;GVariant with the contents of &#64;string.
     * <br>
     * <br>&#64;string must be valid UTF-8, and must not be %NULL. To encode
     * <br>potentially-%NULL strings, use g_variant_new() with `ms` as the
     * <br>[format string][gvariant-format-strings-maybe-types].
     * @param string a normal UTF-8 nul-terminated string
     * @return a floating reference to a new string &#35;GVariant instance
    */
    public static Variant newStringVariant(String string)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_string(string));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newString");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a string &#35;GVariant with the contents of &#64;string.
     * <br>
     * <br>&#64;string must be valid UTF-8, and must not be %NULL. To encode
     * <br>potentially-%NULL strings, use this with g_variant_new_maybe().
     * <br>
     * <br>This function consumes &#64;string.  g_free() will be called on &#64;string
     * <br>when it is no longer required.
     * <br>
     * <br>You must not modify or access &#64;string in any other way after passing
     * <br>it to this function.  It is even possible that &#64;string is immediately
     * <br>freed.
     * @param string a normal UTF-8 nul-terminated string
     * @return a floating reference to a new string   &#35;GVariant instance
    */
    public static Variant newTakeStringVariant(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_take_string(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newTakeString");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new uint16 &#35;GVariant instance.
     * @param value a &#35;guint16 value
     * @return a floating reference to a new uint16 &#35;GVariant instance
    */
    public static Variant newUint16Variant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_uint16(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newUint16");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new uint32 &#35;GVariant instance.
     * @param value a &#35;guint32 value
     * @return a floating reference to a new uint32 &#35;GVariant instance
    */
    public static Variant newUint32Variant(int value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_uint32(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newUint32");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new uint64 &#35;GVariant instance.
     * @param value a &#35;guint64 value
     * @return a floating reference to a new uint64 &#35;GVariant instance
    */
    public static Variant newUint64Variant(long value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_uint64(value));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newUint64");
        }
        return new Variant(__self);
    }        
    

    /**
     * Boxes &#64;value.  The result is a &#35;GVariant instance representing a
     * <br>variant containing the original value.
     * <br>
     * <br>If &#64;child is a floating reference (see g_variant_ref_sink()), the new
     * <br>instance takes ownership of &#64;child.
     * @param value a &#35;GVariant instance
     * @return a floating reference to a new variant &#35;GVariant instance
    */
    public static Variant newVariantVariant(@Nonnull Variant value)  {
        PointerContainer __self = cast(JnaVariant.INST().g_variant_new_variant(asCPointerNotNull(value)));
        if (__self.isNull()) {
            throw new NullPointerException("Variant:newVariant");
        }
        return new Variant(__self);
    }        
    

    /**
     * Creates a new &#35;GVariant instance.
     * <br>
     * <br>Think of this function as an analogue to g_strdup_printf().
     * <br>
     * <br>The type of the created instance and the arguments that are expected
     * <br>by this function are determined by &#64;format_string. See the section on
     * <br>[GVariant format strings][gvariant-format-strings]. Please note that
     * <br>the syntax of the format string is very likely to be extended in the
     * <br>future.
     * <br>
     * <br>The first character of the format string must not be '*' '?' '&#64;' or
     * <br>'r'; in essence, a new &#35;GVariant must always be constructed by this
     * <br>function (and not merely passed through it unmodified).
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * MyFlags some_flags = FLAG_ONE | FLAG_TWO;
     * const gchar *some_strings[] = { &quot;a&quot;, &quot;b&quot;, &quot;c&quot;, NULL };
     * GVariant *new_variant;
     * 
     * new_variant = g_variant_new (&quot;(t^as)&quot;,
     *                              // This cast is required.
     *                              (guint64) some_flags,
     *                              some_strings);
     * </pre>
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public Variant(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse) {
        super(cast(JnaVariant.INST().g_variant_new(asCPointerNotNull(format_string), _elipse)));
    }

    /**
     * Creates a new &#35;GVariant instance.
     * <br>
     * <br>Think of this function as an analogue to g_strdup_printf().
     * <br>
     * <br>The type of the created instance and the arguments that are expected
     * <br>by this function are determined by &#64;format_string. See the section on
     * <br>[GVariant format strings][gvariant-format-strings]. Please note that
     * <br>the syntax of the format string is very likely to be extended in the
     * <br>future.
     * <br>
     * <br>The first character of the format string must not be '*' '?' '&#64;' or
     * <br>'r'; in essence, a new &#35;GVariant must always be constructed by this
     * <br>function (and not merely passed through it unmodified).
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * MyFlags some_flags = FLAG_ONE | FLAG_TWO;
     * const gchar *some_strings[] = { &quot;a&quot;, &quot;b&quot;, &quot;c&quot;, NULL };
     * GVariant *new_variant;
     * 
     * new_variant = g_variant_new (&quot;(t^as)&quot;,
     *                              // This cast is required.
     *                              (guint64) some_flags,
     *                              some_strings);
     * </pre>
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public Variant(String format_string, java.lang.Object... _elipse) {
        super(cast(JnaVariant.INST().g_variant_new(format_string, _elipse)));
    }

    /**
     * Performs a byteswapping operation on the contents of &#64;value.  The
     * <br>result is that all multi-byte numeric data contained in &#64;value is
     * <br>byteswapped.  That includes 16, 32, and 64bit signed and unsigned
     * <br>integers as well as file handles and double precision floating point
     * <br>values.
     * <br>
     * <br>This function is an identity mapping on any value that does not
     * <br>contain multi-byte numeric data.  That include strings, booleans,
     * <br>bytes and containers containing only these things (recursively).
     * <br>
     * <br>The returned value is always in normal form and is marked as trusted.
     * @return the byteswapped form of &#64;value
    */
    public Variant byteswap()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_byteswap(asCPointer())));
    }

    /**
     * Checks if calling g_variant_get() with &#64;format_string on &#64;value would
     * <br>be valid from a type-compatibility standpoint.  &#64;format_string is
     * <br>assumed to be a valid format string (from a syntactic standpoint).
     * <br>
     * <br>If &#64;copy_only is %TRUE then this function additionally checks that it
     * <br>would be safe to call g_variant_unref() on &#64;value immediately after
     * <br>the call to g_variant_get() without invalidating the result.  This is
     * <br>only possible if deep copies are made (ie: there are no pointers to
     * <br>the data inside of the soon-to-be-freed &#35;GVariant instance).  If this
     * <br>check fails then a g_critical() is printed and %FALSE is returned.
     * <br>
     * <br>This function is meant to be used by functions that wish to provide
     * <br>varargs accessors to &#35;GVariant values of uncertain values (eg:
     * <br>g_variant_lookup() or g_menu_model_get_item_attribute()).
     * @param format_string a valid &#35;GVariant format string
     * @param copy_only %TRUE to ensure the format string makes deep copies
     * @return %TRUE if &#64;format_string is safe to use
    */
    public boolean checkFormatString(@Nonnull ch.bailu.gtk.type.Str format_string, boolean copy_only)  {
        return JnaVariant.INST().g_variant_check_format_string(asCPointer(), asCPointerNotNull(format_string), copy_only);
    }

    /**
     * Checks if calling g_variant_get() with &#64;format_string on &#64;value would
     * <br>be valid from a type-compatibility standpoint.  &#64;format_string is
     * <br>assumed to be a valid format string (from a syntactic standpoint).
     * <br>
     * <br>If &#64;copy_only is %TRUE then this function additionally checks that it
     * <br>would be safe to call g_variant_unref() on &#64;value immediately after
     * <br>the call to g_variant_get() without invalidating the result.  This is
     * <br>only possible if deep copies are made (ie: there are no pointers to
     * <br>the data inside of the soon-to-be-freed &#35;GVariant instance).  If this
     * <br>check fails then a g_critical() is printed and %FALSE is returned.
     * <br>
     * <br>This function is meant to be used by functions that wish to provide
     * <br>varargs accessors to &#35;GVariant values of uncertain values (eg:
     * <br>g_variant_lookup() or g_menu_model_get_item_attribute()).
     * @param format_string a valid &#35;GVariant format string
     * @param copy_only %TRUE to ensure the format string makes deep copies
     * @return %TRUE if &#64;format_string is safe to use
    */
    public boolean checkFormatString(String format_string, boolean copy_only)  {
        return JnaVariant.INST().g_variant_check_format_string(asCPointer(), format_string, copy_only);
    }

    /**
     * Classifies &#64;value according to its top-level type.
     * @return the &#35;GVariantClass of &#64;value
    */
    public int classify()  {
        return JnaVariant.INST().g_variant_classify(asCPointer());
    }

    /**
     * Compares &#64;one and &#64;two.
     * <br>
     * <br>The types of &#64;one and &#64;two are &#35;gconstpointer only to allow use of
     * <br>this function with &#35;GTree, &#35;GPtrArray, etc.  They must each be a
     * <br>&#35;GVariant.
     * <br>
     * <br>Comparison is only defined for basic types (ie: booleans, numbers,
     * <br>strings).  For booleans, %FALSE is less than %TRUE.  Numbers are
     * <br>ordered in the usual way.  Strings are in ASCII lexographical order.
     * <br>
     * <br>It is a programmer error to attempt to compare container values or
     * <br>two values that have types that are not exactly equal.  For example,
     * <br>you cannot compare a 32-bit signed integer with a 32-bit unsigned
     * <br>integer.  Also note that this function is not particularly
     * <br>well-behaved when it comes to comparison of doubles; in particular,
     * <br>the handling of incomparable values (ie: NaN) is undefined.
     * <br>
     * <br>If you only require an equality comparison, g_variant_equal() is more
     * <br>general.
     * @param two a &#35;GVariant instance of the same type
     * @return negative value if a &lt; b;          zero if a = b;          positive value if a &gt; b.
    */
    public int compare(@Nonnull ch.bailu.gtk.type.Pointer two)  {
        return JnaVariant.INST().g_variant_compare(asCPointer(), asCPointerNotNull(two));
    }

    /**
     * Similar to g_variant_get_bytestring() except that instead of
     * <br>returning a constant string, the string is duplicated.
     * <br>
     * <br>The return value must be freed using g_free().
     * @param length a pointer to a &#35;gsize, to store          the length (not including the nul terminator)
     * @return           a newly allocated string
    */
    public ch.bailu.gtk.type.Str dupBytestring(@Nullable ch.bailu.gtk.type.Int64 length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_dup_bytestring(asCPointer(), asCPointer(length))));
    }

    /**
     * Similar to g_variant_get_string() except that instead of returning
     * <br>a constant string, the string is duplicated.
     * <br>
     * <br>The string will always be UTF-8 encoded.
     * <br>
     * <br>The return value must be freed using g_free().
     * @param length a pointer to a &#35;gsize, to store the length
     * @return a newly allocated string, UTF-8 encoded
    */
    public ch.bailu.gtk.type.Str dupString(@Nonnull ch.bailu.gtk.type.Int64 length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_dup_string(asCPointer(), asCPointerNotNull(length))));
    }

    /**
     * Checks if &#64;one and &#64;two have the same type and value.
     * <br>
     * <br>The types of &#64;one and &#64;two are &#35;gconstpointer only to allow use of
     * <br>this function with &#35;GHashTable.  They must each be a &#35;GVariant.
     * @param two a &#35;GVariant instance
     * @return %TRUE if &#64;one and &#64;two are equal
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer two)  {
        return JnaVariant.INST().g_variant_equal(asCPointer(), asCPointerNotNull(two));
    }

    /**
     * Deconstructs a &#35;GVariant instance.
     * <br>
     * <br>Think of this function as an analogue to scanf().
     * <br>
     * <br>The arguments that are expected by this function are entirely
     * <br>determined by &#64;format_string.  &#64;format_string also restricts the
     * <br>permissible types of &#64;value.  It is an error to give a value with
     * <br>an incompatible type.  See the section on
     * <br>[GVariant format strings][gvariant-format-strings].
     * <br>Please note that the syntax of the format string is very likely to be
     * <br>extended in the future.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void get(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaVariant.INST().g_variant_get(asCPointer(), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Deconstructs a &#35;GVariant instance.
     * <br>
     * <br>Think of this function as an analogue to scanf().
     * <br>
     * <br>The arguments that are expected by this function are entirely
     * <br>determined by &#64;format_string.  &#64;format_string also restricts the
     * <br>permissible types of &#64;value.  It is an error to give a value with
     * <br>an incompatible type.  See the section on
     * <br>[GVariant format strings][gvariant-format-strings].
     * <br>Please note that the syntax of the format string is very likely to be
     * <br>extended in the future.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void get(String format_string, java.lang.Object... _elipse)  {
        JnaVariant.INST().g_variant_get(asCPointer(), format_string, _elipse);
    }

    /**
     * Returns the boolean value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_BOOLEAN.
     * @return %TRUE or %FALSE
    */
    public boolean getBoolean()  {
        return JnaVariant.INST().g_variant_get_boolean(asCPointer());
    }

    /**
     * Returns the byte value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_BYTE.
     * @return a &#35;guint8
    */
    public int getByte()  {
        return JnaVariant.INST().g_variant_get_byte(asCPointer());
    }

    /**
     * Returns the string value of a &#35;GVariant instance with an
     * <br>array-of-bytes type.  The string has no particular encoding.
     * <br>
     * <br>If the array does not end with a nul terminator character, the empty
     * <br>string is returned.  For this reason, you can always trust that a
     * <br>non-%NULL nul-terminated string will be returned by this function.
     * <br>
     * <br>If the array contains a nul terminator character somewhere other than
     * <br>the last byte then the returned string is the string, up to the first
     * <br>such nul character.
     * <br>
     * <br>g_variant_get_fixed_array() should be used instead if the array contains
     * <br>arbitrary data that could not be nul-terminated or could contain nul bytes.
     * <br>
     * <br>It is an error to call this function with a &#64;value that is not an
     * <br>array of bytes.
     * <br>
     * <br>The return value remains valid as long as &#64;value exists.
     * @return           the constant string
    */
    public ch.bailu.gtk.type.Str getBytestring()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_get_bytestring(asCPointer())));
    }

    /**
     * Reads a child item out of a container &#35;GVariant instance and
     * <br>deconstructs it according to &#64;format_string.  This call is
     * <br>essentially a combination of g_variant_get_child_value() and
     * <br>g_variant_get().
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param index_ the index of the child to deconstruct
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void getChild(long index_, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaVariant.INST().g_variant_get_child(asCPointer(), index_, asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Reads a child item out of a container &#35;GVariant instance and
     * <br>deconstructs it according to &#64;format_string.  This call is
     * <br>essentially a combination of g_variant_get_child_value() and
     * <br>g_variant_get().
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param index_ the index of the child to deconstruct
     * @param format_string a &#35;GVariant format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void getChild(long index_, String format_string, java.lang.Object... _elipse)  {
        JnaVariant.INST().g_variant_get_child(asCPointer(), index_, format_string, _elipse);
    }

    /**
     * Reads a child item out of a container &#35;GVariant instance.  This
     * <br>includes variants, maybes, arrays, tuples and dictionary
     * <br>entries.  It is an error to call this function on any other type of
     * <br>&#35;GVariant.
     * <br>
     * <br>It is an error if &#64;index_ is greater than the number of child items
     * <br>in the container.  See g_variant_n_children().
     * <br>
     * <br>The returned value is never floating.  You should free it with
     * <br>g_variant_unref() when you're done with it.
     * <br>
     * <br>Note that values borrowed from the returned child are not guaranteed to
     * <br>still be valid after the child is freed even if you still hold a reference
     * <br>to &#64;value, if &#64;value has not been serialized at the time this function is
     * <br>called. To avoid this, you can serialize &#64;value by calling
     * <br>g_variant_get_data() and optionally ignoring the return value.
     * <br>
     * <br>There may be implementation specific restrictions on deeply nested values,
     * <br>which would result in the unit tuple being returned as the child value,
     * <br>instead of further nested children. &#35;GVariant is guaranteed to handle
     * <br>nesting up to at least 64 levels.
     * <br>
     * <br>This function is O(1).
     * @param index_ the index of the child to fetch
     * @return the child at the specified index
    */
    public Variant getChildValue(long index_)  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_get_child_value(asCPointer(), index_)));
    }

    /**
     * Returns a pointer to the serialized form of a &#35;GVariant instance.
     * <br>The returned data may not be in fully-normalised form if read from an
     * <br>untrusted source.  The returned data must not be freed; it remains
     * <br>valid for as long as &#64;value exists.
     * <br>
     * <br>If &#64;value is a fixed-sized value that was deserialized from a
     * <br>corrupted serialized container then %NULL may be returned.  In this
     * <br>case, the proper thing to do is typically to use the appropriate
     * <br>number of nul bytes in place of &#64;value.  If &#64;value is not fixed-sized
     * <br>then %NULL is never returned.
     * <br>
     * <br>In the case that &#64;value is already in serialized form, this function
     * <br>is O(1).  If the value is not already in serialized form,
     * <br>serialization occurs implicitly and is approximately O(n) in the size
     * <br>of the result.
     * <br>
     * <br>To deserialize the data returned by this function, in addition to the
     * <br>serialized data, you must know the type of the &#35;GVariant, and (if the
     * <br>machine might be different) the endianness of the machine that stored
     * <br>it. As a result, file formats or network messages that incorporate
     * <br>serialized &#35;GVariants must include this information either
     * <br>implicitly (for instance &quot;the file always contains a
     * <br>%G_VARIANT_TYPE_VARIANT and it is always in little-endian order&quot;) or
     * <br>explicitly (by storing the type and/or endianness in addition to the
     * <br>serialized data).
     * @return the serialized form of &#64;value, or %NULL
    */
    public ch.bailu.gtk.type.Pointer getData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaVariant.INST().g_variant_get_data(asCPointer())));
    }

    /**
     * Returns a pointer to the serialized form of a &#35;GVariant instance.
     * <br>The semantics of this function are exactly the same as
     * <br>g_variant_get_data(), except that the returned &#35;GBytes holds
     * <br>a reference to the variant data.
     * @return A new &#35;GBytes representing the variant data
    */
    public Bytes getDataAsBytes()  {
        return new Bytes(new PointerContainer(JnaVariant.INST().g_variant_get_data_as_bytes(asCPointer())));
    }

    /**
     * Returns the double precision floating point value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_DOUBLE.
     * @return a &#35;gdouble
    */
    public double getDouble()  {
        return JnaVariant.INST().g_variant_get_double(asCPointer());
    }

    /**
     * Provides access to the serialized data for an array of fixed-sized
     * <br>items.
     * <br>
     * <br>&#64;value must be an array with fixed-sized elements.  Numeric types are
     * <br>fixed-size, as are tuples containing only other fixed-sized types.
     * <br>
     * <br>&#64;element_size must be the size of a single element in the array,
     * <br>as given by the section on
     * <br>[serialized data memory][gvariant-serialized-data-memory].
     * <br>
     * <br>In particular, arrays of these fixed-sized types can be interpreted
     * <br>as an array of the given C type, with &#64;element_size set to the size
     * <br>the appropriate type:
     * <br>- %G_VARIANT_TYPE_INT16 (etc.): &#35;gint16 (etc.)
     * <br>- %G_VARIANT_TYPE_BOOLEAN: &#35;guchar (not &#35;gboolean!)
     * <br>- %G_VARIANT_TYPE_BYTE: &#35;guint8
     * <br>- %G_VARIANT_TYPE_HANDLE: &#35;guint32
     * <br>- %G_VARIANT_TYPE_DOUBLE: &#35;gdouble
     * <br>
     * <br>For example, if calling this function for an array of 32-bit integers,
     * <br>you might say `sizeof(gint32)`. This value isn't used except for the purpose
     * <br>of a double-check that the form of the serialized data matches the caller's
     * <br>expectation.
     * <br>
     * <br>&#64;n_elements, which must be non-%NULL, is set equal to the number of
     * <br>items in the array.
     * @param n_elements a pointer to the location to store the number of items
     * @param element_size the size of each element
     * @return a pointer to     the fixed array
    */
    public ch.bailu.gtk.type.Pointer getFixedArray(@Nonnull ch.bailu.gtk.type.Int64 n_elements, long element_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaVariant.INST().g_variant_get_fixed_array(asCPointer(), asCPointerNotNull(n_elements), element_size)));
    }

    /**
     * Returns the 32-bit signed integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type other
     * <br>than %G_VARIANT_TYPE_HANDLE.
     * <br>
     * <br>By convention, handles are indexes into an array of file descriptors
     * <br>that are sent alongside a D-Bus message.  If you're not interacting
     * <br>with D-Bus, you probably don't need them.
     * @return a &#35;gint32
    */
    public int getHandle()  {
        return JnaVariant.INST().g_variant_get_handle(asCPointer());
    }

    /**
     * Returns the 16-bit signed integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_INT16.
     * @return a &#35;gint16
    */
    public int getInt16()  {
        return JnaVariant.INST().g_variant_get_int16(asCPointer());
    }

    /**
     * Returns the 32-bit signed integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_INT32.
     * @return a &#35;gint32
    */
    public int getInt32()  {
        return JnaVariant.INST().g_variant_get_int32(asCPointer());
    }

    /**
     * Returns the 64-bit signed integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_INT64.
     * @return a &#35;gint64
    */
    public long getInt64()  {
        return JnaVariant.INST().g_variant_get_int64(asCPointer());
    }

    /**
     * Given a maybe-typed &#35;GVariant instance, extract its value.  If the
     * <br>value is Nothing, then this function returns %NULL.
     * @return the contents of &#64;value, or %NULL
    */
    public Variant getMaybe()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_get_maybe(asCPointer())));
    }

    /**
     * Gets a &#35;GVariant instance that has the same value as &#64;value and is
     * <br>trusted to be in normal form.
     * <br>
     * <br>If &#64;value is already trusted to be in normal form then a new
     * <br>reference to &#64;value is returned.
     * <br>
     * <br>If &#64;value is not already trusted, then it is scanned to check if it
     * <br>is in normal form.  If it is found to be in normal form then it is
     * <br>marked as trusted and a new reference to it is returned.
     * <br>
     * <br>If &#64;value is found not to be in normal form then a new trusted
     * <br>&#35;GVariant is created with the same value as &#64;value.
     * <br>
     * <br>It makes sense to call this function if you've received &#35;GVariant
     * <br>data from untrusted sources and you want to ensure your serialized
     * <br>output is definitely in normal form.
     * <br>
     * <br>If &#64;value is already in normal form, a new reference will be returned
     * <br>(which will be floating if &#64;value is floating). If it is not in normal form,
     * <br>the newly created &#35;GVariant will be returned with a single non-floating
     * <br>reference. Typically, g_variant_take_ref() should be called on the return
     * <br>value from this function to guarantee ownership of a single non-floating
     * <br>reference to it.
     * @return a trusted &#35;GVariant
    */
    public Variant getNormalForm()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_get_normal_form(asCPointer())));
    }

    /**
     * Determines the number of bytes that would be required to store &#64;value
     * <br>with g_variant_store().
     * <br>
     * <br>If &#64;value has a fixed-sized type then this function always returned
     * <br>that fixed size.
     * <br>
     * <br>In the case that &#64;value is already in serialized form or the size has
     * <br>already been calculated (ie: this function has been called before)
     * <br>then this function is O(1).  Otherwise, the size is calculated, an
     * <br>operation which is approximately O(n) in the number of values
     * <br>involved.
     * @return the serialized size of &#64;value
    */
    public long getSize()  {
        return JnaVariant.INST().g_variant_get_size(asCPointer());
    }

    /**
     * Returns the string value of a &#35;GVariant instance with a string
     * <br>type.  This includes the types %G_VARIANT_TYPE_STRING,
     * <br>%G_VARIANT_TYPE_OBJECT_PATH and %G_VARIANT_TYPE_SIGNATURE.
     * <br>
     * <br>The string will always be UTF-8 encoded, will never be %NULL, and will never
     * <br>contain nul bytes.
     * <br>
     * <br>If &#64;length is non-%NULL then the length of the string (in bytes) is
     * <br>returned there.  For trusted values, this information is already
     * <br>known.  Untrusted values will be validated and, if valid, a strlen() will be
     * <br>performed. If invalid, a default value will be returned — for
     * <br>%G_VARIANT_TYPE_OBJECT_PATH, this is `&quot;/&quot;`, and for other types it is the
     * <br>empty string.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than those three.
     * <br>
     * <br>The return value remains valid as long as &#64;value exists.
     * @param length a pointer to a &#35;gsize,          to store the length
     * @return the constant string, UTF-8 encoded
    */
    public ch.bailu.gtk.type.Str getString(@Nullable ch.bailu.gtk.type.Int64 length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_get_string(asCPointer(), asCPointer(length))));
    }

    /**
     * Determines the type of &#64;value.
     * <br>
     * <br>The return value is valid for the lifetime of &#64;value and must not
     * <br>be freed.
     * @return a &#35;GVariantType
    */
    public VariantType getType()  {
        return new VariantType(new PointerContainer(JnaVariant.INST().g_variant_get_type(asCPointer())));
    }

    /**
     * Returns the type string of &#64;value.  Unlike the result of calling
     * <br>g_variant_type_peek_string(), this string is nul-terminated.  This
     * <br>string belongs to &#35;GVariant and must not be freed.
     * @return the type string for the type of &#64;value
    */
    public ch.bailu.gtk.type.Str getTypeString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_get_type_string(asCPointer())));
    }

    /**
     * Returns the 16-bit unsigned integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_UINT16.
     * @return a &#35;guint16
    */
    public int getUint16()  {
        return JnaVariant.INST().g_variant_get_uint16(asCPointer());
    }

    /**
     * Returns the 32-bit unsigned integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_UINT32.
     * @return a &#35;guint32
    */
    public int getUint32()  {
        return JnaVariant.INST().g_variant_get_uint32(asCPointer());
    }

    /**
     * Returns the 64-bit unsigned integer value of &#64;value.
     * <br>
     * <br>It is an error to call this function with a &#64;value of any type
     * <br>other than %G_VARIANT_TYPE_UINT64.
     * @return a &#35;guint64
    */
    public long getUint64()  {
        return JnaVariant.INST().g_variant_get_uint64(asCPointer());
    }

    /**
     * Unboxes &#64;value.  The result is the &#35;GVariant instance that was
     * <br>contained in &#64;value.
     * @return the item contained in the variant
    */
    public Variant getVariant()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_get_variant(asCPointer())));
    }

    /**
     * Generates a hash value for a &#35;GVariant instance.
     * <br>
     * <br>The output of this function is guaranteed to be the same for a given
     * <br>value only per-process.  It may change between different processor
     * <br>architectures or even different versions of GLib.  Do not use this
     * <br>function as a basis for building protocols or file formats.
     * <br>
     * <br>The type of &#64;value is &#35;gconstpointer only to allow use of this
     * <br>function with &#35;GHashTable.  &#64;value must be a &#35;GVariant.
     * @return a hash value corresponding to &#64;value
    */
    public int hash()  {
        return JnaVariant.INST().g_variant_hash(asCPointer());
    }

    /**
     * Checks if &#64;value is a container.
     * @return %TRUE if &#64;value is a container
    */
    public boolean isContainer()  {
        return JnaVariant.INST().g_variant_is_container(asCPointer());
    }

    /**
     * Checks whether &#64;value has a floating reference count.
     * <br>
     * <br>This function should only ever be used to assert that a given variant
     * <br>is or is not floating, or for debug purposes. To acquire a reference
     * <br>to a variant that might be floating, always use g_variant_ref_sink()
     * <br>or g_variant_take_ref().
     * <br>
     * <br>See g_variant_ref_sink() for more information about floating reference
     * <br>counts.
     * @return whether &#64;value is floating
    */
    public boolean isFloating()  {
        return JnaVariant.INST().g_variant_is_floating(asCPointer());
    }

    /**
     * Checks if &#64;value is in normal form.
     * <br>
     * <br>The main reason to do this is to detect if a given chunk of
     * <br>serialized data is in normal form: load the data into a &#35;GVariant
     * <br>using g_variant_new_from_data() and then use this function to
     * <br>check.
     * <br>
     * <br>If &#64;value is found to be in normal form then it will be marked as
     * <br>being trusted.  If the value was already marked as being trusted then
     * <br>this function will immediately return %TRUE.
     * <br>
     * <br>There may be implementation specific restrictions on deeply nested values.
     * <br>GVariant is guaranteed to handle nesting up to at least 64 levels.
     * @return %TRUE if &#64;value is in normal form
    */
    public boolean isNormalForm()  {
        return JnaVariant.INST().g_variant_is_normal_form(asCPointer());
    }

    /**
     * Checks if a value has a type matching the provided type.
     * @param type a &#35;GVariantType
     * @return %TRUE if the type of &#64;value matches &#64;type
    */
    public boolean isOfType(@Nonnull VariantType type)  {
        return JnaVariant.INST().g_variant_is_of_type(asCPointer(), asCPointerNotNull(type));
    }

    /**
     * Creates a heap-allocated &#35;GVariantIter for iterating over the items
     * <br>in &#64;value.
     * <br>
     * <br>Use g_variant_iter_free() to free the return value when you no longer
     * <br>need it.
     * <br>
     * <br>A reference is taken to &#64;value and will be released only when
     * <br>g_variant_iter_free() is called.
     * @return a new heap-allocated &#35;GVariantIter
    */
    public VariantIter iterNew()  {
        return new VariantIter(new PointerContainer(JnaVariant.INST().g_variant_iter_new(asCPointer())));
    }

    /**
     * Looks up a value in a dictionary &#35;GVariant.
     * <br>
     * <br>This function is a wrapper around g_variant_lookup_value() and
     * <br>g_variant_get().  In the case that %NULL would have been returned,
     * <br>this function returns %FALSE.  Otherwise, it unpacks the returned
     * <br>value and returns %TRUE.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * <br>
     * <br>This function is currently implemented with a linear scan.  If you
     * <br>plan to do many lookups then &#35;GVariantDict may be more efficient.
     * @param key the key to look up in the dictionary
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked
    */
    public boolean lookup(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaVariant.INST().g_variant_lookup(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Looks up a value in a dictionary &#35;GVariant.
     * <br>
     * <br>This function is a wrapper around g_variant_lookup_value() and
     * <br>g_variant_get().  In the case that %NULL would have been returned,
     * <br>this function returns %FALSE.  Otherwise, it unpacks the returned
     * <br>value and returns %TRUE.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed,
     * <br>see the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * <br>
     * <br>This function is currently implemented with a linear scan.  If you
     * <br>plan to do many lookups then &#35;GVariantDict may be more efficient.
     * @param key the key to look up in the dictionary
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked
    */
    public boolean lookup(String key, String format_string, java.lang.Object... _elipse)  {
        return JnaVariant.INST().g_variant_lookup(asCPointer(), key, format_string, _elipse);
    }

    /**
     * Looks up a value in a dictionary &#35;GVariant.
     * <br>
     * <br>This function works with dictionaries of the type a{s*} (and equally
     * <br>well with type a{o*}, but we only further discuss the string case
     * <br>for sake of clarity).
     * <br>
     * <br>In the event that &#64;dictionary has the type a{sv}, the &#64;expected_type
     * <br>string specifies what type of value is expected to be inside of the
     * <br>variant. If the value inside the variant has a different type then
     * <br>%NULL is returned. In the event that &#64;dictionary has a value type other
     * <br>than v then &#64;expected_type must directly match the value type and it is
     * <br>used to unpack the value directly or an error occurs.
     * <br>
     * <br>In either case, if &#64;key is not found in &#64;dictionary, %NULL is returned.
     * <br>
     * <br>If the key is found and the value has the correct type, it is
     * <br>returned.  If &#64;expected_type was specified then any non-%NULL return
     * <br>value will have this type.
     * <br>
     * <br>This function is currently implemented with a linear scan.  If you
     * <br>plan to do many lookups then &#35;GVariantDict may be more efficient.
     * @param key the key to look up in the dictionary
     * @param expected_type a &#35;GVariantType, or %NULL
     * @return the value of the dictionary key, or %NULL
    */
    public Variant lookupValue(@Nonnull ch.bailu.gtk.type.Str key, @Nullable VariantType expected_type)  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_lookup_value(asCPointer(), asCPointerNotNull(key), asCPointer(expected_type))));
    }

    /**
     * Looks up a value in a dictionary &#35;GVariant.
     * <br>
     * <br>This function works with dictionaries of the type a{s*} (and equally
     * <br>well with type a{o*}, but we only further discuss the string case
     * <br>for sake of clarity).
     * <br>
     * <br>In the event that &#64;dictionary has the type a{sv}, the &#64;expected_type
     * <br>string specifies what type of value is expected to be inside of the
     * <br>variant. If the value inside the variant has a different type then
     * <br>%NULL is returned. In the event that &#64;dictionary has a value type other
     * <br>than v then &#64;expected_type must directly match the value type and it is
     * <br>used to unpack the value directly or an error occurs.
     * <br>
     * <br>In either case, if &#64;key is not found in &#64;dictionary, %NULL is returned.
     * <br>
     * <br>If the key is found and the value has the correct type, it is
     * <br>returned.  If &#64;expected_type was specified then any non-%NULL return
     * <br>value will have this type.
     * <br>
     * <br>This function is currently implemented with a linear scan.  If you
     * <br>plan to do many lookups then &#35;GVariantDict may be more efficient.
     * @param key the key to look up in the dictionary
     * @param expected_type a &#35;GVariantType, or %NULL
     * @return the value of the dictionary key, or %NULL
    */
    public Variant lookupValue(String key, @Nullable VariantType expected_type)  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_lookup_value(asCPointer(), key, asCPointer(expected_type))));
    }

    /**
     * Determines the number of children in a container &#35;GVariant instance.
     * <br>This includes variants, maybes, arrays, tuples and dictionary
     * <br>entries.  It is an error to call this function on any other type of
     * <br>&#35;GVariant.
     * <br>
     * <br>For variants, the return value is always 1.  For values with maybe
     * <br>types, it is always zero or one.  For arrays, it is the length of the
     * <br>array.  For tuples it is the number of tuple items (which depends
     * <br>only on the type).  For dictionary entries, it is always 2
     * <br>
     * <br>This function is O(1).
     * @return the number of children in the container
    */
    public long nChildren()  {
        return JnaVariant.INST().g_variant_n_children(asCPointer());
    }

    /**
     * Pretty-prints &#64;value in the format understood by g_variant_parse().
     * <br>
     * <br>The format is described [here][gvariant-text].
     * <br>
     * <br>If &#64;type_annotate is %TRUE, then type information is included in
     * <br>the output.
     * @param type_annotate %TRUE if type information should be included in                 the output
     * @return a newly-allocated string holding the result.
    */
    public ch.bailu.gtk.type.Str print(boolean type_annotate)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_print(asCPointer(), type_annotate)));
    }

    /**
     * Behaves as g_variant_print(), but operates on a &#35;GString.
     * <br>
     * <br>If &#64;string is non-%NULL then it is appended to and returned.  Else,
     * <br>a new empty &#35;GString is allocated and it is returned.
     * @param string a &#35;GString, or %NULL
     * @param type_annotate %TRUE if type information should be included in                 the output
     * @return a &#35;GString containing the string
    */
    public GString printString(@Nullable GString string, boolean type_annotate)  {
        return new GString(new PointerContainer(JnaVariant.INST().g_variant_print_string(asCPointer(), asCPointer(string), type_annotate)));
    }

    /**
     * Increases the reference count of &#64;value.
     * @return the same &#64;value
    */
    public Variant ref()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_ref(asCPointer())));
    }

    /**
     * &#35;GVariant uses a floating reference count system.  All functions with
     * <br>names starting with `g_variant_new_` return floating
     * <br>references.
     * <br>
     * <br>Calling g_variant_ref_sink() on a &#35;GVariant with a floating reference
     * <br>will convert the floating reference into a full reference.  Calling
     * <br>g_variant_ref_sink() on a non-floating &#35;GVariant results in an
     * <br>additional normal reference being added.
     * <br>
     * <br>In other words, if the &#64;value is floating, then this call &quot;assumes
     * <br>ownership&quot; of the floating reference, converting it to a normal
     * <br>reference.  If the &#64;value is not floating, then this call adds a
     * <br>new normal reference increasing the reference count by one.
     * <br>
     * <br>All calls that result in a &#35;GVariant instance being inserted into a
     * <br>container will call g_variant_ref_sink() on the instance.  This means
     * <br>that if the value was just created (and has only its floating
     * <br>reference) then the container will assume sole ownership of the value
     * <br>at that point and the caller will not need to unreference it.  This
     * <br>makes certain common styles of programming much easier while still
     * <br>maintaining normal refcounting semantics in situations where values
     * <br>are not floating.
     * @return the same &#64;value
    */
    public Variant refSink()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_ref_sink(asCPointer())));
    }

    /**
     * Stores the serialized form of &#64;value at &#64;data.  &#64;data should be
     * <br>large enough.  See g_variant_get_size().
     * <br>
     * <br>The stored data is in machine native byte order but may not be in
     * <br>fully-normalised form if read from an untrusted source.  See
     * <br>g_variant_get_normal_form() for a solution.
     * <br>
     * <br>As with g_variant_get_data(), to be able to deserialize the
     * <br>serialized variant successfully, its type and (if the destination
     * <br>machine might be different) its endianness must also be available.
     * <br>
     * <br>This function is approximately O(n) in the size of &#64;data.
     * @param data the location to store the serialized data at
    */
    public void store(@Nonnull ch.bailu.gtk.type.Pointer data)  {
        JnaVariant.INST().g_variant_store(asCPointer(), asCPointerNotNull(data));
    }

    /**
     * If &#64;value is floating, sink it.  Otherwise, do nothing.
     * <br>
     * <br>Typically you want to use g_variant_ref_sink() in order to
     * <br>automatically do the correct thing with respect to floating or
     * <br>non-floating references, but there is one specific scenario where
     * <br>this function is helpful.
     * <br>
     * <br>The situation where this function is helpful is when creating an API
     * <br>that allows the user to provide a callback function that returns a
     * <br>&#35;GVariant.  We certainly want to allow the user the flexibility to
     * <br>return a non-floating reference from this callback (for the case
     * <br>where the value that is being returned already exists).
     * <br>
     * <br>At the same time, the style of the &#35;GVariant API makes it likely that
     * <br>for newly-created &#35;GVariant instances, the user can be saved some
     * <br>typing if they are allowed to return a &#35;GVariant with a floating
     * <br>reference.
     * <br>
     * <br>Using this function on the return value of the user's callback allows
     * <br>the user to do whichever is more convenient for them.  The caller
     * <br>will always receives exactly one full reference to the value: either
     * <br>the one that was returned in the first place, or a floating reference
     * <br>that has been converted to a full reference.
     * <br>
     * <br>This function has an odd interaction when combined with
     * <br>g_variant_ref_sink() running at the same time in another thread on
     * <br>the same &#35;GVariant instance.  If g_variant_ref_sink() runs first then
     * <br>the result will be that the floating reference is converted to a hard
     * <br>reference.  If g_variant_take_ref() runs first then the result will
     * <br>be that the floating reference is converted to a hard reference and
     * <br>an additional reference on top of that one is added.  It is best to
     * <br>avoid this situation.
     * @return the same &#64;value
    */
    public Variant takeRef()  {
        return new Variant(new PointerContainer(JnaVariant.INST().g_variant_take_ref(asCPointer())));
    }

    /**
     * Decreases the reference count of &#64;value.  When its reference count
     * <br>drops to 0, the memory used by the variant is freed.
    */
    public void unref()  {
        JnaVariant.INST().g_variant_unref(asCPointer());
    }

    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * <br>should ensure that a string is a valid D-Bus object path before
     * <br>passing it to g_variant_new_object_path().
     * <br>
     * <br>A valid object path starts with `/` followed by zero or more
     * <br>sequences of characters separated by `/` characters.  Each sequence
     * <br>must contain only the characters `[A-Z][a-z][0-9]_`.  No sequence
     * <br>(including the one following the final `/` character) may be empty.
     * @param string a normal C nul-terminated string
     * @return %TRUE if &#64;string is a D-Bus object path
    */
    public static boolean isObjectPath(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaVariant.INST().g_variant_is_object_path(asCPointerNotNull(string));
    }

    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * <br>should ensure that a string is a valid D-Bus type signature before
     * <br>passing it to g_variant_new_signature().
     * <br>
     * <br>D-Bus type signatures consist of zero or more definite &#35;GVariantType
     * <br>strings in sequence.
     * @param string a normal C nul-terminated string
     * @return %TRUE if &#64;string is a D-Bus type signature
    */
    public static boolean isSignature(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaVariant.INST().g_variant_is_signature(asCPointerNotNull(string));
    }

    /**
     * Pretty-prints a message showing the context of a &#35;GVariant parse
     * <br>error within the string for which parsing was attempted.
     * <br>
     * <br>The resulting string is suitable for output to the console or other
     * <br>monospace media where newlines are treated in the usual way.
     * <br>
     * <br>The message will typically look something like one of the following:
     * <br>
     * <pre>
     * unterminated string constant:
     *   (1, 2, 3, 'abc
     *             ^^^^
     * </pre>
     * <br>
     * <br>or
     * <br>
     * <pre>
     * unable to find a common type:
     *   [1, 2, 3, 'str']
     *    ^        ^^^^^
     * </pre>
     * <br>
     * <br>The format of the message may change in a future version.
     * <br>
     * <br>&#64;error must have come from a failed attempt to g_variant_parse() and
     * <br>&#64;source_str must be exactly the same string that caused the error.
     * <br>If &#64;source_str was not nul-terminated when you passed it to
     * <br>g_variant_parse() then you must add nul termination before using this
     * <br>function.
     * @param error a &#35;GError from the &#35;GVariantParseError domain
     * @param source_str the string that was given to the parser
     * @return the printed message
    */
    public static ch.bailu.gtk.type.Str parseErrorPrintContext(@Nonnull Error error, @Nonnull ch.bailu.gtk.type.Str source_str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariant.INST().g_variant_parse_error_print_context(asCPointerNotNull(error), asCPointerNotNull(source_str))));
    }

    /**
     * 
     * @return 
    */
    public static int parseErrorQuark()  {
        return JnaVariant.INST().g_variant_parse_error_quark();
    }

    public static long getTypeID() { 
        return JnaVariant.INST().intern(); 
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

[MethodModel:java-type-not-supported:newArray:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:newBytestringArray:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:java-type-not-supported:newObjv:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:java-type-not-supported:newParsedVa:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list*}}:{j:}]

[MethodModel:java-type-not-supported:newStrv:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:java-type-not-supported:newTuple:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:newVa:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list*}}:{j:}]

[MethodModel:cb-return-value-not-supported:dupBytestringArray:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:dupObjv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:dupStrv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getBytestringArray:[ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getObjv:[ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getStrv:[ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getVa:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list*}}:{j:}]

[MethodModel:java-type-not-supported:parse:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]

[MethodModel:cb-deprecated:parserGetErrorQuark:[ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]]
*/
