/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GHashTableIter structure represents an iterator that can be used
 * <br>to iterate over the elements of a &#35;GHashTable. GHashTableIter
 * <br>structures are typically allocated on the stack and then initialized
 * <br>with g_hash_table_iter_init().
 * <br>
 * <br>The iteration order of a &#35;GHashTableIter over the keys/values in a hash
 * <br>table is not defined.
 * <p><a href="https://docs.gtk.org/glib/struct.HashTableIter.html">https://docs.gtk.org/glib/struct.HashTableIter.html</a></p>
*/
public class HashTableIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(HashTableIter.class.getCanonicalName());
    }

    public HashTableIter(PointerContainer pointer) {
        super(pointer);
    }

    public HashTableIter() {
        super(cast(JnaHashTableIter.allocateStructure()));
    }

    private JnaHashTableIter.Fields _fields;
    
    JnaHashTableIter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaHashTableIter.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String DUMMY1 = "dummy1";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy1() {
       toFields().readField(DUMMY1);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy1));
    } 

    /**
     * 
    */
    public static final String DUMMY2 = "dummy2";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy2() {
       toFields().readField(DUMMY2);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy2));
    } 

    /**
     * 
    */
    public static final String DUMMY3 = "dummy3";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy3() {
       toFields().readField(DUMMY3);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy3));
    } 

    /**
     * 
    */
    public static final String DUMMY4 = "dummy4";

    /**
     * 
    */
    public int getFieldDummy4() {
       toFields().readField(DUMMY4);
       return toFields().dummy4;
    } 

    /**
     * 
    */
    public static final String DUMMY5 = "dummy5";

    /**
     * 
    */
    public boolean getFieldDummy5() {
       toFields().readField(DUMMY5);
       return toFields().dummy5;
    } 

    /**
     * 
    */
    public static final String DUMMY6 = "dummy6";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy6() {
       toFields().readField(DUMMY6);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy6));
    } 

    /**
     * Returns the &#35;GHashTable associated with &#64;iter.
     * @return the &#35;GHashTable associated with &#64;iter.
    */
    public HashTable getHashTable()  {
        return new HashTable(new PointerContainer(JnaHashTableIter.INST().g_hash_table_iter_get_hash_table(asCPointer())));
    }

    /**
     * Initializes a key/value pair iterator and associates it with
     * <br>&#64;hash_table. Modifying the hash table after calling this function
     * <br>invalidates the returned iterator.
     * <br>
     * <br>The iteration order of a &#35;GHashTableIter over the keys/values in a hash
     * <br>table is not defined.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GHashTableIter iter;
     * gpointer key, value;
     * 
     * g_hash_table_iter_init (&amp;iter, hash_table);
     * while (g_hash_table_iter_next (&amp;iter, &amp;key, &amp;value))
     *   {
     *     // do something with key and value
     *   }
     * </pre>
     * @param hash_table a &#35;GHashTable
    */
    public void init(@Nonnull HashTable hash_table)  {
        JnaHashTableIter.INST().g_hash_table_iter_init(asCPointer(), asCPointerNotNull(hash_table));
    }

    /**
     * Removes the key/value pair currently pointed to by the iterator
     * <br>from its associated &#35;GHashTable. Can only be called after
     * <br>g_hash_table_iter_next() returned %TRUE, and cannot be called
     * <br>more than once for the same key/value pair.
     * <br>
     * <br>If the &#35;GHashTable was created using g_hash_table_new_full(),
     * <br>the key and value are freed using the supplied destroy functions,
     * <br>otherwise you have to make sure that any dynamically allocated
     * <br>values are freed yourself.
     * <br>
     * <br>It is safe to continue iterating the &#35;GHashTable afterward:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * while (g_hash_table_iter_next (&amp;iter, &amp;key, &amp;value))
     *   {
     *     if (condition)
     *       g_hash_table_iter_remove (&amp;iter);
     *   }
     * </pre>
    */
    public void remove()  {
        JnaHashTableIter.INST().g_hash_table_iter_remove(asCPointer());
    }

    /**
     * Replaces the value currently pointed to by the iterator
     * <br>from its associated &#35;GHashTable. Can only be called after
     * <br>g_hash_table_iter_next() returned %TRUE.
     * <br>
     * <br>If you supplied a &#64;value_destroy_func when creating the
     * <br>&#35;GHashTable, the old value is freed using that function.
     * @param value the value to replace with
    */
    public void replace(@Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaHashTableIter.INST().g_hash_table_iter_replace(asCPointer(), asCPointer(value));
    }

    /**
     * Removes the key/value pair currently pointed to by the
     * <br>iterator from its associated &#35;GHashTable, without calling
     * <br>the key and value destroy functions. Can only be called
     * <br>after g_hash_table_iter_next() returned %TRUE, and cannot
     * <br>be called more than once for the same key/value pair.
    */
    public void steal()  {
        JnaHashTableIter.INST().g_hash_table_iter_steal(asCPointer());
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:java-type-not-supported:next:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
*/
