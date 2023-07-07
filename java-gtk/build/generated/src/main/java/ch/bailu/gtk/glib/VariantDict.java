/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GVariantDict is a mutable interface to &#35;GVariant dictionaries.
 * <br>
 * <br>It can be used for doing a sequence of dictionary lookups in an
 * <br>efficient way on an existing &#35;GVariant dictionary or it can be used
 * <br>to construct new dictionaries with a hashtable-like interface.  It
 * <br>can also be used for taking existing dictionaries and modifying them
 * <br>in order to create new ones.
 * <br>
 * <br>&#35;GVariantDict can only be used with %G_VARIANT_TYPE_VARDICT
 * <br>dictionaries.
 * <br>
 * <br>It is possible to use &#35;GVariantDict allocated on the stack or on the
 * <br>heap.  When using a stack-allocated &#35;GVariantDict, you begin with a
 * <br>call to g_variant_dict_init() and free the resources with a call to
 * <br>g_variant_dict_clear().
 * <br>
 * <br>Heap-allocated &#35;GVariantDict follows normal refcounting rules: you
 * <br>allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * <br>and g_variant_dict_unref().
 * <br>
 * <br>g_variant_dict_end() is used to convert the &#35;GVariantDict back into a
 * <br>dictionary-type &#35;GVariant.  When used with stack-allocated instances,
 * <br>this also implicitly frees all associated memory, but for
 * <br>heap-allocated instances, you must still call g_variant_dict_unref()
 * <br>afterwards.
 * <br>
 * <br>You will typically want to use a heap-allocated &#35;GVariantDict when
 * <br>you expose it as part of an API.  For most other uses, the
 * <br>stack-allocated form will be more convenient.
 * <br>
 * <br>Consider the following two examples that do the same thing in each
 * <br>style: take an existing dictionary and look up the &quot;count&quot; uint32
 * <br>key, adding 1 to it if it is found, or returning an error if the
 * <br>key is not found.  Each returns the new dictionary as a floating
 * <br>&#35;GVariant.
 * <br>
 * <br>&#35;&#35; Using a stack-allocated GVariantDict
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 * 
 *     g_variant_dict_init (&amp;dict, orig);
 *     if (!g_variant_dict_lookup (&amp;dict, &quot;count&quot;, &quot;u&quot;, &amp;count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&amp;dict);
 *         return NULL;
 *       }
 * 
 *     g_variant_dict_insert (&amp;dict, &quot;count&quot;, &quot;u&quot;, count + 1);
 * 
 *     return g_variant_dict_end (&amp;dict);
 *   }
 * </pre>
 * <br>
 * <br>&#35;&#35; Using heap-allocated GVariantDict
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict *dict;
 *     GVariant *result;
 *     guint32 count;
 * 
 *     dict = g_variant_dict_new (orig);
 * 
 *     if (g_variant_dict_lookup (dict, &quot;count&quot;, &quot;u&quot;, &amp;count))
 *       {
 *         g_variant_dict_insert (dict, &quot;count&quot;, &quot;u&quot;, count + 1);
 *         result = g_variant_dict_end (dict);
 *       }
 *     else
 *       {
 *         g_set_error (...);
 *         result = NULL;
 *       }
 * 
 *     g_variant_dict_unref (dict);
 * 
 *     return result;
 *   }
 * </pre>
 * <p><a href="https://docs.gtk.org/glib/struct.VariantDict.html">https://docs.gtk.org/glib/struct.VariantDict.html</a></p>
*/
public class VariantDict extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VariantDict.class.getCanonicalName());
    }

    public VariantDict(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates and initialises a new &#35;GVariantDict.
     * <br>
     * <br>You should call g_variant_dict_unref() on the return value when it
     * <br>is no longer needed.  The memory will not be automatically freed by
     * <br>any other call.
     * <br>
     * <br>In some cases it may be easier to place a &#35;GVariantDict directly on
     * <br>the stack of the calling function and initialise it with
     * <br>g_variant_dict_init().  This is particularly useful when you are
     * <br>using &#35;GVariantDict to construct a &#35;GVariant.
     * @param from_asv the &#35;GVariant with which to initialise the   dictionary
    */
    public VariantDict(@Nullable Variant from_asv) {
        super(cast(JnaVariantDict.INST().g_variant_dict_new(asCPointer(from_asv))));
    }

    /**
     * Releases all memory associated with a &#35;GVariantDict without freeing
     * <br>the &#35;GVariantDict structure itself.
     * <br>
     * <br>It typically only makes sense to do this on a stack-allocated
     * <br>&#35;GVariantDict if you want to abort building the value part-way
     * <br>through.  This function need not be called if you call
     * <br>g_variant_dict_end() and it also doesn't need to be called on dicts
     * <br>allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * <br>that).
     * <br>
     * <br>It is valid to call this function on either an initialised
     * <br>&#35;GVariantDict or one that was previously cleared by an earlier call
     * <br>to g_variant_dict_clear() but it is not valid to call this function
     * <br>on uninitialised memory.
    */
    public void clear()  {
        JnaVariantDict.INST().g_variant_dict_clear(asCPointer());
    }

    /**
     * Checks if &#64;key exists in &#64;dict.
     * @param key the key to look up in the dictionary
     * @return %TRUE if &#64;key is in &#64;dict
    */
    public boolean contains(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaVariantDict.INST().g_variant_dict_contains(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Checks if &#64;key exists in &#64;dict.
     * @param key the key to look up in the dictionary
     * @return %TRUE if &#64;key is in &#64;dict
    */
    public boolean contains(String key)  {
        return JnaVariantDict.INST().g_variant_dict_contains(asCPointer(), key);
    }

    /**
     * Returns the current value of &#64;dict as a &#35;GVariant of type
     * <br>%G_VARIANT_TYPE_VARDICT, clearing it in the process.
     * <br>
     * <br>It is not permissible to use &#64;dict in any way after this call except
     * <br>for reference counting operations (in the case of a heap-allocated
     * <br>&#35;GVariantDict) or by reinitialising it with g_variant_dict_init() (in
     * <br>the case of stack-allocated).
     * @return a new, floating, &#35;GVariant
    */
    public Variant end()  {
        return new Variant(new PointerContainer(JnaVariantDict.INST().g_variant_dict_end(asCPointer())));
    }

    /**
     * Initialises a &#35;GVariantDict structure.
     * <br>
     * <br>If &#64;from_asv is given, it is used to initialise the dictionary.
     * <br>
     * <br>This function completely ignores the previous contents of &#64;dict.  On
     * <br>one hand this means that it is valid to pass in completely
     * <br>uninitialised memory.  On the other hand, this means that if you are
     * <br>initialising over top of an existing &#35;GVariantDict you need to first
     * <br>call g_variant_dict_clear() in order to avoid leaking memory.
     * <br>
     * <br>You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
     * <br>&#35;GVariantDict that was initialised with this function.  If you ever
     * <br>pass a reference to a &#35;GVariantDict outside of the control of your
     * <br>own code then you should assume that the person receiving that
     * <br>reference may try to use reference counting; you should use
     * <br>g_variant_dict_new() instead of this function.
     * @param from_asv the initial value for &#64;dict
    */
    public void init(@Nullable Variant from_asv)  {
        JnaVariantDict.INST().g_variant_dict_init(asCPointer(), asCPointer(from_asv));
    }

    /**
     * Inserts a value into a &#35;GVariantDict.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new() followed by g_variant_dict_insert_value().
     * @param key the key to insert a value for
     * @param format_string a &#35;GVariant varargs format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void insert(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaVariantDict.INST().g_variant_dict_insert(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Inserts a value into a &#35;GVariantDict.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new() followed by g_variant_dict_insert_value().
     * @param key the key to insert a value for
     * @param format_string a &#35;GVariant varargs format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void insert(String key, String format_string, java.lang.Object... _elipse)  {
        JnaVariantDict.INST().g_variant_dict_insert(asCPointer(), key, format_string, _elipse);
    }

    /**
     * Inserts (or replaces) a key in a &#35;GVariantDict.
     * <br>
     * <br>&#64;value is consumed if it is floating.
     * @param key the key to insert a value for
     * @param value the value to insert
    */
    public void insertValue(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull Variant value)  {
        JnaVariantDict.INST().g_variant_dict_insert_value(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(value));
    }

    /**
     * Inserts (or replaces) a key in a &#35;GVariantDict.
     * <br>
     * <br>&#64;value is consumed if it is floating.
     * @param key the key to insert a value for
     * @param value the value to insert
    */
    public void insertValue(String key, @Nonnull Variant value)  {
        JnaVariantDict.INST().g_variant_dict_insert_value(asCPointer(), key, asCPointerNotNull(value));
    }

    /**
     * Looks up a value in a &#35;GVariantDict.
     * <br>
     * <br>This function is a wrapper around g_variant_dict_lookup_value() and
     * <br>g_variant_get().  In the case that %NULL would have been returned,
     * <br>this function returns %FALSE.  Otherwise, it unpacks the returned
     * <br>value and returns %TRUE.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking the
     * <br>values and also determines if the values are copied or borrowed, see the
     * <br>section on [GVariant format strings][gvariant-format-strings-pointers].
     * @param key the key to look up in the dictionary
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked
    */
    public boolean lookup(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaVariantDict.INST().g_variant_dict_lookup(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Looks up a value in a &#35;GVariantDict.
     * <br>
     * <br>This function is a wrapper around g_variant_dict_lookup_value() and
     * <br>g_variant_get().  In the case that %NULL would have been returned,
     * <br>this function returns %FALSE.  Otherwise, it unpacks the returned
     * <br>value and returns %TRUE.
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking the
     * <br>values and also determines if the values are copied or borrowed, see the
     * <br>section on [GVariant format strings][gvariant-format-strings-pointers].
     * @param key the key to look up in the dictionary
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked
    */
    public boolean lookup(String key, String format_string, java.lang.Object... _elipse)  {
        return JnaVariantDict.INST().g_variant_dict_lookup(asCPointer(), key, format_string, _elipse);
    }

    /**
     * Looks up a value in a &#35;GVariantDict.
     * <br>
     * <br>If &#64;key is not found in &#64;dictionary, %NULL is returned.
     * <br>
     * <br>The &#64;expected_type string specifies what type of value is expected.
     * <br>If the value associated with &#64;key has a different type then %NULL is
     * <br>returned.
     * <br>
     * <br>If the key is found and the value has the correct type, it is
     * <br>returned.  If &#64;expected_type was specified then any non-%NULL return
     * <br>value will have this type.
     * @param key the key to look up in the dictionary
     * @param expected_type a &#35;GVariantType, or %NULL
     * @return the value of the dictionary key, or %NULL
    */
    public Variant lookupValue(@Nonnull ch.bailu.gtk.type.Str key, @Nullable VariantType expected_type)  {
        return new Variant(new PointerContainer(JnaVariantDict.INST().g_variant_dict_lookup_value(asCPointer(), asCPointerNotNull(key), asCPointer(expected_type))));
    }

    /**
     * Looks up a value in a &#35;GVariantDict.
     * <br>
     * <br>If &#64;key is not found in &#64;dictionary, %NULL is returned.
     * <br>
     * <br>The &#64;expected_type string specifies what type of value is expected.
     * <br>If the value associated with &#64;key has a different type then %NULL is
     * <br>returned.
     * <br>
     * <br>If the key is found and the value has the correct type, it is
     * <br>returned.  If &#64;expected_type was specified then any non-%NULL return
     * <br>value will have this type.
     * @param key the key to look up in the dictionary
     * @param expected_type a &#35;GVariantType, or %NULL
     * @return the value of the dictionary key, or %NULL
    */
    public Variant lookupValue(String key, @Nullable VariantType expected_type)  {
        return new Variant(new PointerContainer(JnaVariantDict.INST().g_variant_dict_lookup_value(asCPointer(), key, asCPointer(expected_type))));
    }

    /**
     * Increases the reference count on &#64;dict.
     * <br>
     * <br>Don't call this on stack-allocated &#35;GVariantDict instances or bad
     * <br>things will happen.
     * @return a new reference to &#64;dict
    */
    public VariantDict ref()  {
        return new VariantDict(new PointerContainer(JnaVariantDict.INST().g_variant_dict_ref(asCPointer())));
    }

    /**
     * Removes a key and its associated value from a &#35;GVariantDict.
     * @param key the key to remove
     * @return %TRUE if the key was found and removed
    */
    public boolean remove(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaVariantDict.INST().g_variant_dict_remove(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Removes a key and its associated value from a &#35;GVariantDict.
     * @param key the key to remove
     * @return %TRUE if the key was found and removed
    */
    public boolean remove(String key)  {
        return JnaVariantDict.INST().g_variant_dict_remove(asCPointer(), key);
    }

    /**
     * Decreases the reference count on &#64;dict.
     * <br>
     * <br>In the event that there are no more references, releases all memory
     * <br>associated with the &#35;GVariantDict.
     * <br>
     * <br>Don't call this on stack-allocated &#35;GVariantDict instances or bad
     * <br>things will happen.
    */
    public void unref()  {
        JnaVariantDict.INST().g_variant_dict_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaVariantDict.INST().g_variant_dict_get_type(); 
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
