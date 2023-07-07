/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GHashTable struct is an opaque data structure to represent a
 * <br>[Hash Table][glib-Hash-Tables]. It should only be accessed via the
 * <br>following functions.
 * <p><a href="https://docs.gtk.org/glib/struct.HashTable.html">https://docs.gtk.org/glib/struct.HashTable.html</a></p>
*/
public class HashTable extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HashTable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHRFunc {
        /**
         * Specifies the type of the function passed to
         * <br>g_hash_table_foreach_remove(). It is called with each key/value
         * <br>pair, together with the &#64;user_data parameter passed to
         * <br>g_hash_table_foreach_remove(). It should return %TRUE if the
         * <br>key/value pair should be removed from the &#35;GHashTable.
         * @param key a key
         * @param value the value associated with the key
         * @param user_data user data passed to g_hash_table_remove()
         * @return %TRUE if the key/value pair should be removed from the     &#35;GHashTable
        */
        boolean onHRFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaHashTable.OnHRFunc toOnHRFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHRFunc in) {
        JnaHashTable.OnHRFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key, _value, _user_data) -> in.onHRFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_key)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHFunc {
        /**
         * Specifies the type of the function passed to g_hash_table_foreach().
         * <br>It is called with each key/value pair, together with the &#64;user_data
         * <br>parameter which is passed to g_hash_table_foreach().
         * @param key a key
         * @param value the value corresponding to the key
         * @param user_data user data passed to g_hash_table_foreach()
        */
        void onHFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaHashTable.OnHFunc toOnHFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHFunc in) {
        JnaHashTable.OnHFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key, _value, _user_data) -> in.onHFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_key)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHashFunc {
        /**
         * Specifies the type of the hash function which is passed to
         * <br>g_hash_table_new() when a &#35;GHashTable is created.
         * <br>
         * <br>The function is passed a key and should return a &#35;guint hash value.
         * <br>The functions g_direct_hash(), g_int_hash() and g_str_hash() provide
         * <br>hash functions which can be used when the key is a &#35;gpointer, &#35;gint*,
         * <br>and &#35;gchar* respectively.
         * <br>
         * <br>g_direct_hash() is also the appropriate hash function for keys
         * <br>of the form `GINT_TO_POINTER (n)` (or similar macros).
         * <br>
         * <br>A good hash functions should produce
         * <br>hash values that are evenly distributed over a fairly large range.
         * <br>The modulus is taken with the hash table size (a prime number) to
         * <br>find the 'bucket' to place each key into. The function should also
         * <br>be very fast, since it is called for each key lookup.
         * <br>
         * <br>Note that the hash functions provided by GLib have these qualities,
         * <br>but are not particularly robust against manufactured keys that
         * <br>cause hash collisions. Therefore, you should consider choosing
         * <br>a more secure hash function when using a GHashTable with keys
         * <br>that originate in untrusted data (such as HTTP requests).
         * <br>Using g_str_hash() in that situation might make your application
         * <br>vulnerable to
         * <br>[Algorithmic Complexity Attacks](https://lwn.net/Articles/474912/).
         * <br>
         * <br>The key to choosing a good hash is unpredictability.  Even
         * <br>cryptographic hashes are very easy to find collisions for when the
         * <br>remainder is taken modulo a somewhat predictable prime number.  There
         * <br>must be an element of randomness that an attacker is unable to guess.
         * @param key a key
         * @return the hash value corresponding to the key
        */
        int onHashFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer key);
    }
    
    private static JnaHashTable.OnHashFunc toOnHashFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHashFunc in) {
        JnaHashTable.OnHashFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key) -> in.onHashFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_key)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEqualFunc {
        /**
         * Specifies the type of a function used to test two values for
         * <br>equality. The function should return %TRUE if both values are equal
         * <br>and %FALSE otherwise.
         * @param a a value
         * @param b a value to compare with
         * @return %TRUE if &#64;a = &#64;b; %FALSE otherwise
        */
        boolean onEqualFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b);
    }
    
    private static JnaHashTable.OnEqualFunc toOnEqualFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnEqualFunc in) {
        JnaHashTable.OnEqualFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b) -> in.onEqualFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)));
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
    
    private static JnaHashTable.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaHashTable.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public HashTable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * This is a convenience function for using a &#35;GHashTable as a set.  It
     * <br>is equivalent to calling g_hash_table_replace() with &#64;key as both the
     * <br>key and the value.
     * <br>
     * <br>In particular, this means that if &#64;key already exists in the hash table, then
     * <br>the old copy of &#64;key in the hash table is freed and &#64;key replaces it in the
     * <br>table.
     * <br>
     * <br>When a hash table only ever contains keys that have themselves as the
     * <br>corresponding value it is able to be stored more efficiently.  See
     * <br>the discussion in the section description.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @return %TRUE if the key did not exist yet
    */
    public static boolean add(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaHashTable.INST().g_hash_table_add(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Checks if &#64;key is in &#64;hash_table.
     * @param hash_table a &#35;GHashTable
     * @param key a key to check
     * @return %TRUE if &#64;key is in &#64;hash_table, %FALSE otherwise.
    */
    public static boolean contains(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaHashTable.INST().g_hash_table_contains(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Destroys all keys and values in the &#35;GHashTable and decrements its
     * <br>reference count by 1. If keys and/or values are dynamically allocated,
     * <br>you should either free them first or create the &#35;GHashTable with destroy
     * <br>notifiers using g_hash_table_new_full(). In the latter case the destroy
     * <br>functions you supplied will be called on all keys and values during the
     * <br>destruction phase.
     * @param hash_table a &#35;GHashTable
    */
    public static void destroy(@Nonnull HashTable hash_table)  {
        JnaHashTable.INST().g_hash_table_destroy(asCPointerNotNull(hash_table));
    }

    /**
     * Calls the given function for key/value pairs in the &#35;GHashTable
     * <br>until &#64;predicate returns %TRUE. The function is passed the key
     * <br>and value of each pair, and the given &#64;user_data parameter. The
     * <br>hash table may not be modified while iterating over it (you can't
     * <br>add/remove items).
     * <br>
     * <br>Note, that hash tables are really only optimized for forward
     * <br>lookups, i.e. g_hash_table_lookup(). So code that frequently issues
     * <br>g_hash_table_find() or g_hash_table_foreach() (e.g. in the order of
     * <br>once per every entry in a hash table) should probably be reworked
     * <br>to use additional or different data structures for reverse lookups
     * <br>(keep in mind that an O(n) find/foreach operation issued for all n
     * <br>values in a hash table ends up needing O(n*n) operations).
     * @param hash_table a &#35;GHashTable
     * @param predicate function to test the key/value pairs for a certain property
     * @param user_data user data to pass to the function
     * @return The value of the first key/value pair is returned,     for which &#64;predicate evaluates to %TRUE. If no pair with the     requested property is found, %NULL is returned.
    */
    public static ch.bailu.gtk.type.Pointer find(@Nonnull HashTable hash_table, OnHRFunc predicate, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaHashTable.INST().g_hash_table_find(asCPointerNotNull(hash_table), toOnHRFunc(getClassHandler().getInstance(), "find", predicate), asCPointer(user_data))));
    }

    /**
     * Calls the given function for each of the key/value pairs in the
     * <br>&#35;GHashTable.  The function is passed the key and value of each
     * <br>pair, and the given &#64;user_data parameter.  The hash table may not
     * <br>be modified while iterating over it (you can't add/remove
     * <br>items). To remove all items matching a predicate, use
     * <br>g_hash_table_foreach_remove().
     * <br>
     * <br>The order in which g_hash_table_foreach() iterates over the keys/values in
     * <br>the hash table is not defined.
     * <br>
     * <br>See g_hash_table_find() for performance caveats for linear
     * <br>order searches in contrast to g_hash_table_lookup().
     * @param hash_table a &#35;GHashTable
     * @param func the function to call for each key/value pair
     * @param user_data user data to pass to the function
    */
    public static void foreach(@Nonnull HashTable hash_table, OnHFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaHashTable.INST().g_hash_table_foreach(asCPointerNotNull(hash_table), toOnHFunc(getClassHandler().getInstance(), "foreach", func), asCPointer(user_data));
    }

    /**
     * Calls the given function for each key/value pair in the
     * <br>&#35;GHashTable. If the function returns %TRUE, then the key/value
     * <br>pair is removed from the &#35;GHashTable. If you supplied key or
     * <br>value destroy functions when creating the &#35;GHashTable, they are
     * <br>used to free the memory allocated for the removed keys and values.
     * <br>
     * <br>See &#35;GHashTableIter for an alternative way to loop over the
     * <br>key/value pairs in the hash table.
     * @param hash_table a &#35;GHashTable
     * @param func the function to call for each key/value pair
     * @param user_data user data to pass to the function
     * @return the number of key/value pairs removed
    */
    public static int foreachRemove(@Nonnull HashTable hash_table, OnHRFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaHashTable.INST().g_hash_table_foreach_remove(asCPointerNotNull(hash_table), toOnHRFunc(getClassHandler().getInstance(), "foreachRemove", func), asCPointer(user_data));
    }

    /**
     * Calls the given function for each key/value pair in the
     * <br>&#35;GHashTable. If the function returns %TRUE, then the key/value
     * <br>pair is removed from the &#35;GHashTable, but no key or value
     * <br>destroy functions are called.
     * <br>
     * <br>See &#35;GHashTableIter for an alternative way to loop over the
     * <br>key/value pairs in the hash table.
     * @param hash_table a &#35;GHashTable
     * @param func the function to call for each key/value pair
     * @param user_data user data to pass to the function
     * @return the number of key/value pairs removed.
    */
    public static int foreachSteal(@Nonnull HashTable hash_table, OnHRFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaHashTable.INST().g_hash_table_foreach_steal(asCPointerNotNull(hash_table), toOnHRFunc(getClassHandler().getInstance(), "foreachSteal", func), asCPointer(user_data));
    }

    /**
     * Retrieves every key inside &#64;hash_table. The returned data is valid
     * <br>until changes to the hash release those keys.
     * <br>
     * <br>This iterates over every entry in the hash table to build its return value.
     * <br>To iterate over the entries in a &#35;GHashTable more efficiently, use a
     * <br>&#35;GHashTableIter.
     * @param hash_table a &#35;GHashTable
     * @return a &#35;GList containing all the keys     inside the hash table. The content of the list is owned by the     hash table and should not be modified or freed. Use g_list_free()     when done using the list.
    */
    public static List getKeys(@Nonnull HashTable hash_table)  {
        return new List(new PointerContainer(JnaHashTable.INST().g_hash_table_get_keys(asCPointerNotNull(hash_table))));
    }

    /**
     * Retrieves every value inside &#64;hash_table. The returned data
     * <br>is valid until &#64;hash_table is modified.
     * <br>
     * <br>This iterates over every entry in the hash table to build its return value.
     * <br>To iterate over the entries in a &#35;GHashTable more efficiently, use a
     * <br>&#35;GHashTableIter.
     * @param hash_table a &#35;GHashTable
     * @return a &#35;GList containing all the values     inside the hash table. The content of the list is owned by the     hash table and should not be modified or freed. Use g_list_free()     when done using the list.
    */
    public static List getValues(@Nonnull HashTable hash_table)  {
        return new List(new PointerContainer(JnaHashTable.INST().g_hash_table_get_values(asCPointerNotNull(hash_table))));
    }

    /**
     * Inserts a new key and value into a &#35;GHashTable.
     * <br>
     * <br>If the key already exists in the &#35;GHashTable its current
     * <br>value is replaced with the new value. If you supplied a
     * <br>&#64;value_destroy_func when creating the &#35;GHashTable, the old
     * <br>value is freed using that function. If you supplied a
     * <br>&#64;key_destroy_func when creating the &#35;GHashTable, the passed
     * <br>key is freed using that function.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return %TRUE if the key did not exist yet
    */
    public static boolean insert(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return JnaHashTable.INST().g_hash_table_insert(asCPointerNotNull(hash_table), asCPointer(key), asCPointer(value));
    }

    /**
     * Looks up a key in a &#35;GHashTable. Note that this function cannot
     * <br>distinguish between a key that is not present and one which is present
     * <br>and has the value %NULL. If you need this distinction, use
     * <br>g_hash_table_lookup_extended().
     * @param hash_table a &#35;GHashTable
     * @param key the key to look up
     * @return the associated value, or %NULL if the key is not found
    */
    public static ch.bailu.gtk.type.Pointer lookup(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaHashTable.INST().g_hash_table_lookup(asCPointerNotNull(hash_table), asCPointer(key))));
    }

    /**
     * Creates a new &#35;GHashTable with a reference count of 1.
     * <br>
     * <br>Hash values returned by &#64;hash_func are used to determine where keys
     * <br>are stored within the &#35;GHashTable data structure. The g_direct_hash(),
     * <br>g_int_hash(), g_int64_hash(), g_double_hash() and g_str_hash()
     * <br>functions are provided for some common types of keys.
     * <br>If &#64;hash_func is %NULL, g_direct_hash() is used.
     * <br>
     * <br>&#64;key_equal_func is used when looking up keys in the &#35;GHashTable.
     * <br>The g_direct_equal(), g_int_equal(), g_int64_equal(), g_double_equal()
     * <br>and g_str_equal() functions are provided for the most common types
     * <br>of keys. If &#64;key_equal_func is %NULL, keys are compared directly in
     * <br>a similar fashion to g_direct_equal(), but without the overhead of
     * <br>a function call. &#64;key_equal_func is called with the key from the hash table
     * <br>as its first parameter, and the user-provided key to check against as
     * <br>its second.
     * @param hash_func a function to create a hash value from a key
     * @param key_equal_func a function to check two keys for equality
     * @return a new &#35;GHashTable
    */
    public static HashTable _new(OnHashFunc hash_func, OnEqualFunc key_equal_func)  {
        return new HashTable(new PointerContainer(JnaHashTable.INST().g_hash_table_new(toOnHashFunc(getClassHandler().getInstance(), "_new", hash_func), toOnEqualFunc(getClassHandler().getInstance(), "_new", key_equal_func))));
    }

    /**
     * Creates a new &#35;GHashTable like g_hash_table_new() with a reference
     * <br>count of 1 and allows to specify functions to free the memory
     * <br>allocated for the key and value that get called when removing the
     * <br>entry from the &#35;GHashTable.
     * <br>
     * <br>Since version 2.42 it is permissible for destroy notify functions to
     * <br>recursively remove further items from the hash table. This is only
     * <br>permissible if the application still holds a reference to the hash table.
     * <br>This means that you may need to ensure that the hash table is empty by
     * <br>calling g_hash_table_remove_all() before releasing the last reference using
     * <br>g_hash_table_unref().
     * @param hash_func a function to create a hash value from a key
     * @param key_equal_func a function to check two keys for equality
     * @param key_destroy_func a function to free the memory allocated for the key     used when removing the entry from the &#35;GHashTable, or %NULL     if you don't want to supply such a function.
     * @param value_destroy_func a function to free the memory allocated for the     value used when removing the entry from the &#35;GHashTable, or %NULL     if you don't want to supply such a function.
     * @return a new &#35;GHashTable
    */
    public static HashTable newFull(OnHashFunc hash_func, OnEqualFunc key_equal_func, OnDestroyNotify key_destroy_func, OnDestroyNotify value_destroy_func)  {
        return new HashTable(new PointerContainer(JnaHashTable.INST().g_hash_table_new_full(toOnHashFunc(getClassHandler().getInstance(), "newFull", hash_func), toOnEqualFunc(getClassHandler().getInstance(), "newFull", key_equal_func), toOnDestroyNotify(getClassHandler().getInstance(), "newFull", key_destroy_func), toOnDestroyNotify(getClassHandler().getInstance(), "newFull", value_destroy_func))));
    }

    /**
     * Creates a new &#35;GHashTable like g_hash_table_new_full() with a reference
     * <br>count of 1.
     * <br>
     * <br>It inherits the hash function, the key equal function, the key destroy function,
     * <br>as well as the value destroy function, from &#64;other_hash_table.
     * <br>
     * <br>The returned hash table will be empty; it will not contain the keys
     * <br>or values from &#64;other_hash_table.
     * @param other_hash_table Another &#35;GHashTable
     * @return a new &#35;GHashTable
    */
    public static HashTable newSimilar(@Nonnull HashTable other_hash_table)  {
        return new HashTable(new PointerContainer(JnaHashTable.INST().g_hash_table_new_similar(asCPointerNotNull(other_hash_table))));
    }

    /**
     * Atomically increments the reference count of &#64;hash_table by one.
     * <br>This function is MT-safe and may be called from any thread.
     * @param hash_table a valid &#35;GHashTable
     * @return the passed in &#35;GHashTable
    */
    public static HashTable ref(@Nonnull HashTable hash_table)  {
        return new HashTable(new PointerContainer(JnaHashTable.INST().g_hash_table_ref(asCPointerNotNull(hash_table))));
    }

    /**
     * Removes a key and its associated value from a &#35;GHashTable.
     * <br>
     * <br>If the &#35;GHashTable was created using g_hash_table_new_full(), the
     * <br>key and value are freed using the supplied destroy functions, otherwise
     * <br>you have to make sure that any dynamically allocated values are freed
     * <br>yourself.
     * @param hash_table a &#35;GHashTable
     * @param key the key to remove
     * @return %TRUE if the key was found and removed from the &#35;GHashTable
    */
    public static boolean remove(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaHashTable.INST().g_hash_table_remove(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Removes all keys and their associated values from a &#35;GHashTable.
     * <br>
     * <br>If the &#35;GHashTable was created using g_hash_table_new_full(),
     * <br>the keys and values are freed using the supplied destroy functions,
     * <br>otherwise you have to make sure that any dynamically allocated
     * <br>values are freed yourself.
     * @param hash_table a &#35;GHashTable
    */
    public static void removeAll(@Nonnull HashTable hash_table)  {
        JnaHashTable.INST().g_hash_table_remove_all(asCPointerNotNull(hash_table));
    }

    /**
     * Inserts a new key and value into a &#35;GHashTable similar to
     * <br>g_hash_table_insert(). The difference is that if the key
     * <br>already exists in the &#35;GHashTable, it gets replaced by the
     * <br>new key. If you supplied a &#64;value_destroy_func when creating
     * <br>the &#35;GHashTable, the old value is freed using that function.
     * <br>If you supplied a &#64;key_destroy_func when creating the
     * <br>&#35;GHashTable, the old key is freed using that function.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return %TRUE if the key did not exist yet
    */
    public static boolean replace(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return JnaHashTable.INST().g_hash_table_replace(asCPointerNotNull(hash_table), asCPointer(key), asCPointer(value));
    }

    /**
     * Returns the number of elements contained in the &#35;GHashTable.
     * @param hash_table a &#35;GHashTable
     * @return the number of key/value pairs in the &#35;GHashTable.
    */
    public static int size(@Nonnull HashTable hash_table)  {
        return JnaHashTable.INST().g_hash_table_size(asCPointerNotNull(hash_table));
    }

    /**
     * Removes a key and its associated value from a &#35;GHashTable without
     * <br>calling the key and value destroy functions.
     * @param hash_table a &#35;GHashTable
     * @param key the key to remove
     * @return %TRUE if the key was found and removed from the &#35;GHashTable
    */
    public static boolean steal(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaHashTable.INST().g_hash_table_steal(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Removes all keys and their associated values from a &#35;GHashTable
     * <br>without calling the key and value destroy functions.
     * @param hash_table a &#35;GHashTable
    */
    public static void stealAll(@Nonnull HashTable hash_table)  {
        JnaHashTable.INST().g_hash_table_steal_all(asCPointerNotNull(hash_table));
    }

    /**
     * Atomically decrements the reference count of &#64;hash_table by one.
     * <br>If the reference count drops to 0, all keys and values will be
     * <br>destroyed, and all memory allocated by the hash table is released.
     * <br>This function is MT-safe and may be called from any thread.
     * @param hash_table a valid &#35;GHashTable
    */
    public static void unref(@Nonnull HashTable hash_table)  {
        JnaHashTable.INST().g_hash_table_unref(asCPointerNotNull(hash_table));
    }

    public static long getTypeID() { 
        return JnaHashTable.INST().g_hash_table_get_type(); 
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

[MethodModel:cb-return-value-not-supported:java-type-not-supported:getKeysAsArray:[ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]]
        [ParameterModel:Supported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:lookupExtended:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:stealExtended:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
*/
