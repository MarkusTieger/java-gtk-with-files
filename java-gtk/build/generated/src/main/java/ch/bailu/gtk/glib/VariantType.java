/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This section introduces the GVariant type system. It is based, in
 * <br>large part, on the D-Bus type system, with two major changes and
 * <br>some minor lifting of restrictions. The
 * <br>[D-Bus specification](http://dbus.freedesktop.org/doc/dbus-specification.html),
 * <br>therefore, provides a significant amount of
 * <br>information that is useful when working with GVariant.
 * <br>
 * <br>The first major change with respect to the D-Bus type system is the
 * <br>introduction of maybe (or &quot;nullable&quot;) types.  Any type in GVariant can be
 * <br>converted to a maybe type, in which case, &quot;nothing&quot; (or &quot;null&quot;) becomes a
 * <br>valid value.  Maybe types have been added by introducing the
 * <br>character &quot;m&quot; to type strings.
 * <br>
 * <br>The second major change is that the GVariant type system supports the
 * <br>concept of &quot;indefinite types&quot; -- types that are less specific than
 * <br>the normal types found in D-Bus.  For example, it is possible to speak
 * <br>of &quot;an array of any type&quot; in GVariant, where the D-Bus type system
 * <br>would require you to speak of &quot;an array of integers&quot; or &quot;an array of
 * <br>strings&quot;.  Indefinite types have been added by introducing the
 * <br>characters &quot;*&quot;, &quot;?&quot; and &quot;r&quot; to type strings.
 * <br>
 * <br>Finally, all arbitrary restrictions relating to the complexity of
 * <br>types are lifted along with the restriction that dictionary entries
 * <br>may only appear nested inside of arrays.
 * <br>
 * <br>Just as in D-Bus, GVariant types are described with strings (&quot;type
 * <br>strings&quot;).  Subject to the differences mentioned above, these strings
 * <br>are of the same form as those found in D-Bus.  Note, however: D-Bus
 * <br>always works in terms of messages and therefore individual type
 * <br>strings appear nowhere in its interface.  Instead, &quot;signatures&quot;
 * <br>are a concatenation of the strings of the type of each argument in a
 * <br>message.  GVariant deals with single values directly so GVariant type
 * <br>strings always describe the type of exactly one value.  This means
 * <br>that a D-Bus signature string is generally not a valid GVariant type
 * <br>string -- except in the case that it is the signature of a message
 * <br>containing exactly one argument.
 * <br>
 * <br>An indefinite type is similar in spirit to what may be called an
 * <br>abstract type in other type systems.  No value can exist that has an
 * <br>indefinite type as its type, but values can exist that have types
 * <br>that are subtypes of indefinite types.  That is to say,
 * <br>g_variant_get_type() will never return an indefinite type, but
 * <br>calling g_variant_is_of_type() with an indefinite type may return
 * <br>%TRUE.  For example, you cannot have a value that represents &quot;an
 * <br>array of no particular type&quot;, but you can have an &quot;array of integers&quot;
 * <br>which certainly matches the type of &quot;an array of no particular type&quot;,
 * <br>since &quot;array of integers&quot; is a subtype of &quot;array of no particular
 * <br>type&quot;.
 * <br>
 * <br>This is similar to how instances of abstract classes may not
 * <br>directly exist in other type systems, but instances of their
 * <br>non-abstract subtypes may.  For example, in GTK, no object that has
 * <br>the type of &#35;GtkBin can exist (since &#35;GtkBin is an abstract class),
 * <br>but a &#35;GtkWindow can certainly be instantiated, and you would say
 * <br>that the &#35;GtkWindow is a &#35;GtkBin (since &#35;GtkWindow is a subclass of
 * <br>&#35;GtkBin).
 * <br>
 * <br>&#35;&#35; GVariant Type Strings
 * <br>
 * <br>A GVariant type string can be any of the following:
 * <br>
 * <br>- any basic type string (listed below)
 * <br>
 * <br>- &quot;v&quot;, &quot;r&quot; or &quot;*&quot;
 * <br>
 * <br>- one of the characters 'a' or 'm', followed by another type string
 * <br>
 * <br>- the character '(', followed by a concatenation of zero or more other
 * <br>  type strings, followed by the character ')'
 * <br>
 * <br>- the character '{', followed by a basic type string (see below),
 * <br>  followed by another type string, followed by the character '}'
 * <br>
 * <br>A basic type string describes a basic type (as per
 * <br>g_variant_type_is_basic()) and is always a single character in length.
 * <br>The valid basic type strings are &quot;b&quot;, &quot;y&quot;, &quot;n&quot;, &quot;q&quot;, &quot;i&quot;, &quot;u&quot;, &quot;x&quot;, &quot;t&quot;,
 * <br>&quot;h&quot;, &quot;d&quot;, &quot;s&quot;, &quot;o&quot;, &quot;g&quot; and &quot;?&quot;.
 * <br>
 * <br>The above definition is recursive to arbitrary depth. &quot;aaaaai&quot; and
 * <br>&quot;(ui(nq((y)))s)&quot; are both valid type strings, as is
 * <br>&quot;a(aa(ui)(qna{ya(yd)}))&quot;. In order to not hit memory limits, &#35;GVariant
 * <br>imposes a limit on recursion depth of 65 nested containers. This is the
 * <br>limit in the D-Bus specification (64) plus one to allow a &#35;GDBusMessage to
 * <br>be nested in a top-level tuple.
 * <br>
 * <br>The meaning of each of the characters is as follows:
 * <br>- `b`: the type string of %G_VARIANT_TYPE_BOOLEAN; a boolean value.
 * <br>- `y`: the type string of %G_VARIANT_TYPE_BYTE; a byte.
 * <br>- `n`: the type string of %G_VARIANT_TYPE_INT16; a signed 16 bit integer.
 * <br>- `q`: the type string of %G_VARIANT_TYPE_UINT16; an unsigned 16 bit integer.
 * <br>- `i`: the type string of %G_VARIANT_TYPE_INT32; a signed 32 bit integer.
 * <br>- `u`: the type string of %G_VARIANT_TYPE_UINT32; an unsigned 32 bit integer.
 * <br>- `x`: the type string of %G_VARIANT_TYPE_INT64; a signed 64 bit integer.
 * <br>- `t`: the type string of %G_VARIANT_TYPE_UINT64; an unsigned 64 bit integer.
 * <br>- `h`: the type string of %G_VARIANT_TYPE_HANDLE; a signed 32 bit value
 * <br>  that, by convention, is used as an index into an array of file
 * <br>  descriptors that are sent alongside a D-Bus message.
 * <br>- `d`: the type string of %G_VARIANT_TYPE_DOUBLE; a double precision
 * <br>  floating point value.
 * <br>- `s`: the type string of %G_VARIANT_TYPE_STRING; a string.
 * <br>- `o`: the type string of %G_VARIANT_TYPE_OBJECT_PATH; a string in the form
 * <br>  of a D-Bus object path.
 * <br>- `g`: the type string of %G_VARIANT_TYPE_SIGNATURE; a string in the form of
 * <br>  a D-Bus type signature.
 * <br>- `?`: the type string of %G_VARIANT_TYPE_BASIC; an indefinite type that
 * <br>  is a supertype of any of the basic types.
 * <br>- `v`: the type string of %G_VARIANT_TYPE_VARIANT; a container type that
 * <br>  contain any other type of value.
 * <br>- `a`: used as a prefix on another type string to mean an array of that
 * <br>  type; the type string &quot;ai&quot;, for example, is the type of an array of
 * <br>  signed 32-bit integers.
 * <br>- `m`: used as a prefix on another type string to mean a &quot;maybe&quot;, or
 * <br>  &quot;nullable&quot;, version of that type; the type string &quot;ms&quot;, for example,
 * <br>  is the type of a value that maybe contains a string, or maybe contains
 * <br>  nothing.
 * <br>- `()`: used to enclose zero or more other concatenated type strings to
 * <br>  create a tuple type; the type string &quot;(is)&quot;, for example, is the type of
 * <br>  a pair of an integer and a string.
 * <br>- `r`: the type string of %G_VARIANT_TYPE_TUPLE; an indefinite type that is
 * <br>  a supertype of any tuple type, regardless of the number of items.
 * <br>- `{}`: used to enclose a basic type string concatenated with another type
 * <br>  string to create a dictionary entry type, which usually appears inside of
 * <br>  an array to form a dictionary; the type string &quot;a{sd}&quot;, for example, is
 * <br>  the type of a dictionary that maps strings to double precision floating
 * <br>  point values.
 * <br>
 * <br>  The first type (the basic type) is the key type and the second type is
 * <br>  the value type. The reason that the first type is restricted to being a
 * <br>  basic type is so that it can easily be hashed.
 * <br>- `*`: the type string of %G_VARIANT_TYPE_ANY; the indefinite type that is
 * <br>  a supertype of all types.  Note that, as with all type strings, this
 * <br>  character represents exactly one type. It cannot be used inside of tuples
 * <br>  to mean &quot;any number of items&quot;.
 * <br>
 * <br>Any type string of a container that contains an indefinite type is,
 * <br>itself, an indefinite type. For example, the type string &quot;a*&quot;
 * <br>(corresponding to %G_VARIANT_TYPE_ARRAY) is an indefinite type
 * <br>that is a supertype of every array type. &quot;(*s)&quot; is a supertype
 * <br>of all tuples that contain exactly two items where the second
 * <br>item is a string.
 * <br>
 * <br>&quot;a{?*}&quot; is an indefinite type that is a supertype of all arrays
 * <br>containing dictionary entries where the key is any basic type and
 * <br>the value is any type at all.  This is, by definition, a dictionary,
 * <br>so this type string corresponds to %G_VARIANT_TYPE_DICTIONARY. Note
 * <br>that, due to the restriction that the key of a dictionary entry must
 * <br>be a basic type, &quot;{**}&quot; is not a valid type string.
 * <p><a href="https://docs.gtk.org/glib/struct.VariantType.html">https://docs.gtk.org/glib/struct.VariantType.html</a></p>
*/
public class VariantType extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VariantType.class.getCanonicalName());
    }

    public VariantType(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Constructs the type corresponding to an array of elements of the
     * <br>type &#64;type.
     * <br>
     * <br>It is appropriate to call g_variant_type_free() on the return value.
     * @param element a &#35;GVariantType
     * @return a new array &#35;GVariantType  Since 2.24
    */
    public static VariantType newArrayVariantType(@Nonnull VariantType element)  {
        PointerContainer __self = cast(JnaVariantType.INST().g_variant_type_new_array(asCPointerNotNull(element)));
        if (__self.isNull()) {
            throw new NullPointerException("VariantType:newArray");
        }
        return new VariantType(__self);
    }        
    

    /**
     * Constructs the type corresponding to a dictionary entry with a key
     * <br>of type &#64;key and a value of type &#64;value.
     * <br>
     * <br>It is appropriate to call g_variant_type_free() on the return value.
     * @param key a basic &#35;GVariantType
     * @param value a &#35;GVariantType
     * @return a new dictionary entry &#35;GVariantType  Since 2.24
    */
    public static VariantType newDictEntryVariantType(@Nonnull VariantType key, @Nonnull VariantType value)  {
        PointerContainer __self = cast(JnaVariantType.INST().g_variant_type_new_dict_entry(asCPointerNotNull(key), asCPointerNotNull(value)));
        if (__self.isNull()) {
            throw new NullPointerException("VariantType:newDictEntry");
        }
        return new VariantType(__self);
    }        
    

    /**
     * Constructs the type corresponding to a maybe instance containing
     * <br>type &#64;type or Nothing.
     * <br>
     * <br>It is appropriate to call g_variant_type_free() on the return value.
     * @param element a &#35;GVariantType
     * @return a new maybe &#35;GVariantType  Since 2.24
    */
    public static VariantType newMaybeVariantType(@Nonnull VariantType element)  {
        PointerContainer __self = cast(JnaVariantType.INST().g_variant_type_new_maybe(asCPointerNotNull(element)));
        if (__self.isNull()) {
            throw new NullPointerException("VariantType:newMaybe");
        }
        return new VariantType(__self);
    }        
    

    /**
     * Creates a new &#35;GVariantType corresponding to the type string given
     * <br>by &#64;type_string.  It is appropriate to call g_variant_type_free() on
     * <br>the return value.
     * <br>
     * <br>It is a programmer error to call this function with an invalid type
     * <br>string.  Use g_variant_type_string_is_valid() if you are unsure.
     * @param type_string a valid GVariant type string
    */
    public VariantType(@Nonnull ch.bailu.gtk.type.Str type_string) {
        super(cast(JnaVariantType.INST().g_variant_type_new(asCPointerNotNull(type_string))));
    }

    /**
     * Creates a new &#35;GVariantType corresponding to the type string given
     * <br>by &#64;type_string.  It is appropriate to call g_variant_type_free() on
     * <br>the return value.
     * <br>
     * <br>It is a programmer error to call this function with an invalid type
     * <br>string.  Use g_variant_type_string_is_valid() if you are unsure.
     * @param type_string a valid GVariant type string
    */
    public VariantType(String type_string) {
        super(cast(JnaVariantType.INST().g_variant_type_new(type_string)));
    }

    /**
     * Makes a copy of a &#35;GVariantType.  It is appropriate to call
     * <br>g_variant_type_free() on the return value.  &#64;type may not be %NULL.
     * @return a new &#35;GVariantType  Since 2.24
    */
    public VariantType copy()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_copy(asCPointer())));
    }

    /**
     * Returns a newly-allocated copy of the type string corresponding to
     * <br>&#64;type.  The returned string is nul-terminated.  It is appropriate to
     * <br>call g_free() on the return value.
     * @return the corresponding type string  Since 2.24
    */
    public ch.bailu.gtk.type.Str dupString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariantType.INST().g_variant_type_dup_string(asCPointer())));
    }

    /**
     * Determines the element type of an array or maybe type.
     * <br>
     * <br>This function may only be used with array or maybe types.
     * @return the element type of &#64;type  Since 2.24
    */
    public VariantType element()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_element(asCPointer())));
    }

    /**
     * Compares &#64;type1 and &#64;type2 for equality.
     * <br>
     * <br>Only returns %TRUE if the types are exactly equal.  Even if one type
     * <br>is an indefinite type and the other is a subtype of it, %FALSE will
     * <br>be returned if they are not exactly equal.  If you want to check for
     * <br>subtypes, use g_variant_type_is_subtype_of().
     * <br>
     * <br>The argument types of &#64;type1 and &#64;type2 are only &#35;gconstpointer to
     * <br>allow use with &#35;GHashTable without function pointer casting.  For
     * <br>both arguments, a valid &#35;GVariantType must be provided.
     * @param type2 a &#35;GVariantType
     * @return %TRUE if &#64;type1 and &#64;type2 are exactly equal  Since 2.24
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer type2)  {
        return JnaVariantType.INST().g_variant_type_equal(asCPointer(), asCPointerNotNull(type2));
    }

    /**
     * Determines the first item type of a tuple or dictionary entry
     * <br>type.
     * <br>
     * <br>This function may only be used with tuple or dictionary entry types,
     * <br>but must not be used with the generic tuple type
     * <br>%G_VARIANT_TYPE_TUPLE.
     * <br>
     * <br>In the case of a dictionary entry type, this returns the type of
     * <br>the key.
     * <br>
     * <br>%NULL is returned in case of &#64;type being %G_VARIANT_TYPE_UNIT.
     * <br>
     * <br>This call, together with g_variant_type_next() provides an iterator
     * <br>interface over tuple and dictionary entry types.
     * @return the first item type of &#64;type, or %NULL  Since 2.24
    */
    public VariantType first()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_first(asCPointer())));
    }

    /**
     * Frees a &#35;GVariantType that was allocated with
     * <br>g_variant_type_copy(), g_variant_type_new() or one of the container
     * <br>type constructor functions.
     * <br>
     * <br>In the case that &#64;type is %NULL, this function does nothing.
     * <br>
     * <br>Since 2.24
    */
    public void free()  {
        JnaVariantType.INST().g_variant_type_free(asCPointer());
    }

    /**
     * Returns the length of the type string corresponding to the given
     * <br>&#64;type.  This function must be used to determine the valid extent of
     * <br>the memory region returned by g_variant_type_peek_string().
     * @return the length of the corresponding type string  Since 2.24
    */
    public long getStringLength()  {
        return JnaVariantType.INST().g_variant_type_get_string_length(asCPointer());
    }

    /**
     * Hashes &#64;type.
     * <br>
     * <br>The argument type of &#64;type is only &#35;gconstpointer to allow use with
     * <br>&#35;GHashTable without function pointer casting.  A valid
     * <br>&#35;GVariantType must be provided.
     * @return the hash value  Since 2.24
    */
    public int hash()  {
        return JnaVariantType.INST().g_variant_type_hash(asCPointer());
    }

    /**
     * Determines if the given &#64;type is an array type.  This is true if the
     * <br>type string for &#64;type starts with an 'a'.
     * <br>
     * <br>This function returns %TRUE for any indefinite type for which every
     * <br>definite subtype is an array type -- %G_VARIANT_TYPE_ARRAY, for
     * <br>example.
     * @return %TRUE if &#64;type is an array type  Since 2.24
    */
    public boolean isArray()  {
        return JnaVariantType.INST().g_variant_type_is_array(asCPointer());
    }

    /**
     * Determines if the given &#64;type is a basic type.
     * <br>
     * <br>Basic types are booleans, bytes, integers, doubles, strings, object
     * <br>paths and signatures.
     * <br>
     * <br>Only a basic type may be used as the key of a dictionary entry.
     * <br>
     * <br>This function returns %FALSE for all indefinite types except
     * <br>%G_VARIANT_TYPE_BASIC.
     * @return %TRUE if &#64;type is a basic type  Since 2.24
    */
    public boolean isBasic()  {
        return JnaVariantType.INST().g_variant_type_is_basic(asCPointer());
    }

    /**
     * Determines if the given &#64;type is a container type.
     * <br>
     * <br>Container types are any array, maybe, tuple, or dictionary
     * <br>entry types plus the variant type.
     * <br>
     * <br>This function returns %TRUE for any indefinite type for which every
     * <br>definite subtype is a container -- %G_VARIANT_TYPE_ARRAY, for
     * <br>example.
     * @return %TRUE if &#64;type is a container type  Since 2.24
    */
    public boolean isContainer()  {
        return JnaVariantType.INST().g_variant_type_is_container(asCPointer());
    }

    /**
     * Determines if the given &#64;type is definite (ie: not indefinite).
     * <br>
     * <br>A type is definite if its type string does not contain any indefinite
     * <br>type characters ('*', '?', or 'r').
     * <br>
     * <br>A &#35;GVariant instance may not have an indefinite type, so calling
     * <br>this function on the result of g_variant_get_type() will always
     * <br>result in %TRUE being returned.  Calling this function on an
     * <br>indefinite type like %G_VARIANT_TYPE_ARRAY, however, will result in
     * <br>%FALSE being returned.
     * @return %TRUE if &#64;type is definite  Since 2.24
    */
    public boolean isDefinite()  {
        return JnaVariantType.INST().g_variant_type_is_definite(asCPointer());
    }

    /**
     * Determines if the given &#64;type is a dictionary entry type.  This is
     * <br>true if the type string for &#64;type starts with a '{'.
     * <br>
     * <br>This function returns %TRUE for any indefinite type for which every
     * <br>definite subtype is a dictionary entry type --
     * <br>%G_VARIANT_TYPE_DICT_ENTRY, for example.
     * @return %TRUE if &#64;type is a dictionary entry type  Since 2.24
    */
    public boolean isDictEntry()  {
        return JnaVariantType.INST().g_variant_type_is_dict_entry(asCPointer());
    }

    /**
     * Determines if the given &#64;type is a maybe type.  This is true if the
     * <br>type string for &#64;type starts with an 'm'.
     * <br>
     * <br>This function returns %TRUE for any indefinite type for which every
     * <br>definite subtype is a maybe type -- %G_VARIANT_TYPE_MAYBE, for
     * <br>example.
     * @return %TRUE if &#64;type is a maybe type  Since 2.24
    */
    public boolean isMaybe()  {
        return JnaVariantType.INST().g_variant_type_is_maybe(asCPointer());
    }

    /**
     * Checks if &#64;type is a subtype of &#64;supertype.
     * <br>
     * <br>This function returns %TRUE if &#64;type is a subtype of &#64;supertype.  All
     * <br>types are considered to be subtypes of themselves.  Aside from that,
     * <br>only indefinite types can have subtypes.
     * @param supertype a &#35;GVariantType
     * @return %TRUE if &#64;type is a subtype of &#64;supertype  Since 2.24
    */
    public boolean isSubtypeOf(@Nonnull VariantType supertype)  {
        return JnaVariantType.INST().g_variant_type_is_subtype_of(asCPointer(), asCPointerNotNull(supertype));
    }

    /**
     * Determines if the given &#64;type is a tuple type.  This is true if the
     * <br>type string for &#64;type starts with a '(' or if &#64;type is
     * <br>%G_VARIANT_TYPE_TUPLE.
     * <br>
     * <br>This function returns %TRUE for any indefinite type for which every
     * <br>definite subtype is a tuple type -- %G_VARIANT_TYPE_TUPLE, for
     * <br>example.
     * @return %TRUE if &#64;type is a tuple type  Since 2.24
    */
    public boolean isTuple()  {
        return JnaVariantType.INST().g_variant_type_is_tuple(asCPointer());
    }

    /**
     * Determines if the given &#64;type is the variant type.
     * @return %TRUE if &#64;type is the variant type  Since 2.24
    */
    public boolean isVariant()  {
        return JnaVariantType.INST().g_variant_type_is_variant(asCPointer());
    }

    /**
     * Determines the key type of a dictionary entry type.
     * <br>
     * <br>This function may only be used with a dictionary entry type.  Other
     * <br>than the additional restriction, this call is equivalent to
     * <br>g_variant_type_first().
     * @return the key type of the dictionary entry  Since 2.24
    */
    public VariantType key()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_key(asCPointer())));
    }

    /**
     * Determines the number of items contained in a tuple or
     * <br>dictionary entry type.
     * <br>
     * <br>This function may only be used with tuple or dictionary entry types,
     * <br>but must not be used with the generic tuple type
     * <br>%G_VARIANT_TYPE_TUPLE.
     * <br>
     * <br>In the case of a dictionary entry type, this function will always
     * <br>return 2.
     * @return the number of items in &#64;type  Since 2.24
    */
    public long nItems()  {
        return JnaVariantType.INST().g_variant_type_n_items(asCPointer());
    }

    /**
     * Determines the next item type of a tuple or dictionary entry
     * <br>type.
     * <br>
     * <br>&#64;type must be the result of a previous call to
     * <br>g_variant_type_first() or g_variant_type_next().
     * <br>
     * <br>If called on the key type of a dictionary entry then this call
     * <br>returns the value type.  If called on the value type of a dictionary
     * <br>entry then this call returns %NULL.
     * <br>
     * <br>For tuples, %NULL is returned when &#64;type is the last item in a tuple.
     * @return the next &#35;GVariantType after &#64;type, or %NULL  Since 2.24
    */
    public VariantType next()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_next(asCPointer())));
    }

    /**
     * Returns the type string corresponding to the given &#64;type.  The
     * <br>result is not nul-terminated; in order to determine its length you
     * <br>must call g_variant_type_get_string_length().
     * <br>
     * <br>To get a nul-terminated string, see g_variant_type_dup_string().
     * @return the corresponding type string (not nul-terminated)  Since 2.24
    */
    public ch.bailu.gtk.type.Str peekString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVariantType.INST().g_variant_type_peek_string(asCPointer())));
    }

    /**
     * Determines the value type of a dictionary entry type.
     * <br>
     * <br>This function may only be used with a dictionary entry type.
     * @return the value type of the dictionary entry  Since 2.24
    */
    public VariantType value()  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_value(asCPointer())));
    }

    /**
     * 
     * @param arg0 
     * @return 
    */
    public static VariantType checked(@Nonnull ch.bailu.gtk.type.Str arg0)  {
        return new VariantType(new PointerContainer(JnaVariantType.INST().g_variant_type_checked_(asCPointerNotNull(arg0))));
    }

    /**
     * 
     * @param type_string 
     * @return 
    */
    public static long stringGetDepth(@Nonnull ch.bailu.gtk.type.Str type_string)  {
        return JnaVariantType.INST().g_variant_type_string_get_depth_(asCPointerNotNull(type_string));
    }

    /**
     * Checks if &#64;type_string is a valid GVariant type string.  This call is
     * <br>equivalent to calling g_variant_type_string_scan() and confirming
     * <br>that the following character is a nul terminator.
     * @param type_string a pointer to any string
     * @return %TRUE if &#64;type_string is exactly one valid type string  Since 2.24
    */
    public static boolean stringIsValid(@Nonnull ch.bailu.gtk.type.Str type_string)  {
        return JnaVariantType.INST().g_variant_type_string_is_valid(asCPointerNotNull(type_string));
    }

    public static long getTypeID() { 
        return JnaVariantType.INST().g_variant_type_get_gtype(); 
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

[MethodModel:java-type-not-supported:newTuple:[ParameterModel:Supported:{Gg:VariantType:{c:GVariantType*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GVariantType* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:stringScan:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
*/
