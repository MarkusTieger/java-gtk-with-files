/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GVariantIter is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/glib/struct.VariantIter.html">https://docs.gtk.org/glib/struct.VariantIter.html</a></p>
*/
public class VariantIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VariantIter.class.getCanonicalName());
    }

    public VariantIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new heap-allocated &#35;GVariantIter to iterate over the
     * <br>container that was being iterated over by &#64;iter.  Iteration begins on
     * <br>the new iterator from the current position of the old iterator but
     * <br>the two copies are independent past that point.
     * <br>
     * <br>Use g_variant_iter_free() to free the return value when you no longer
     * <br>need it.
     * <br>
     * <br>A reference is taken to the container that &#64;iter is iterating over
     * <br>and will be related only when g_variant_iter_free() is called.
     * @return a new heap-allocated &#35;GVariantIter
    */
    public VariantIter copy()  {
        return new VariantIter(new PointerContainer(JnaVariantIter.INST().g_variant_iter_copy(asCPointer())));
    }

    /**
     * Frees a heap-allocated &#35;GVariantIter.  Only call this function on
     * <br>iterators that were returned by g_variant_iter_new() or
     * <br>g_variant_iter_copy().
    */
    public void free()  {
        JnaVariantIter.INST().g_variant_iter_free(asCPointer());
    }

    /**
     * Initialises (without allocating) a &#35;GVariantIter.  &#64;iter may be
     * <br>completely uninitialised prior to this call; its old value is
     * <br>ignored.
     * <br>
     * <br>The iterator remains valid for as long as &#64;value exists, and need not
     * <br>be freed in any way.
     * @param value a container &#35;GVariant
     * @return the number of items in &#64;value
    */
    public long init(@Nonnull Variant value)  {
        return JnaVariantIter.INST().g_variant_iter_init(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Gets the next item in the container and unpacks it into the variable
     * <br>argument list according to &#64;format_string, returning %TRUE.
     * <br>
     * <br>If no more items remain then %FALSE is returned.
     * <br>
     * <br>On the first call to this function, the pointers appearing on the
     * <br>variable argument list are assumed to point at uninitialised memory.
     * <br>On the second and later calls, it is assumed that the same pointers
     * <br>will be given and that they will point to the memory as set by the
     * <br>previous call to this function.  This allows the previous values to
     * <br>be freed, as appropriate.
     * <br>
     * <br>This function is intended to be used with a while loop as
     * <br>demonstrated in the following example.  This function can only be
     * <br>used when iterating over an array.  It is only valid to call this
     * <br>function with a string constant for the format string and the same
     * <br>string constant must be used each time.  Mixing calls to this
     * <br>function and g_variant_iter_next() or g_variant_iter_next_value() on
     * <br>the same iterator causes undefined behavior.
     * <br>
     * <br>If you break out of a such a while loop using g_variant_iter_loop() then
     * <br>you must free or unreference all the unpacked values as you would with
     * <br>g_variant_get(). Failure to do so will cause a memory leak.
     * <br>
     * <br>Here is an example for memory management with g_variant_iter_loop():
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&amp;iter, dictionary);
     *     while (g_variant_iter_loop (&amp;iter, &quot;{sv}&quot;, &amp;key, &amp;value))
     *       {
     *         g_print (&quot;Item '%s' has type '%s'&#92;n&quot;, key,
     *                  g_variant_get_type_string (value));
     * 
     *         // no need to free 'key' and 'value' here
     *         // unless breaking out of this loop
     *       }
     *   }
     * </pre>
     * <br>
     * <br>For most cases you should use g_variant_iter_next().
     * <br>
     * <br>This function is really only useful when unpacking into &#35;GVariant or
     * <br>&#35;GVariantIter in order to allow you to skip the call to
     * <br>g_variant_unref() or g_variant_iter_free().
     * <br>
     * <br>For example, if you are only looping over simple integer and string
     * <br>types, g_variant_iter_next() is definitely preferred.  For string
     * <br>types, use the '&amp;' prefix to avoid allocating any memory at all (and
     * <br>thereby avoiding the need to free anything as well).
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed.
     * <br>
     * <br>See the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked, or %FALSE if there was no          value
    */
    public boolean loop(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaVariantIter.INST().g_variant_iter_loop(asCPointer(), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Gets the next item in the container and unpacks it into the variable
     * <br>argument list according to &#64;format_string, returning %TRUE.
     * <br>
     * <br>If no more items remain then %FALSE is returned.
     * <br>
     * <br>On the first call to this function, the pointers appearing on the
     * <br>variable argument list are assumed to point at uninitialised memory.
     * <br>On the second and later calls, it is assumed that the same pointers
     * <br>will be given and that they will point to the memory as set by the
     * <br>previous call to this function.  This allows the previous values to
     * <br>be freed, as appropriate.
     * <br>
     * <br>This function is intended to be used with a while loop as
     * <br>demonstrated in the following example.  This function can only be
     * <br>used when iterating over an array.  It is only valid to call this
     * <br>function with a string constant for the format string and the same
     * <br>string constant must be used each time.  Mixing calls to this
     * <br>function and g_variant_iter_next() or g_variant_iter_next_value() on
     * <br>the same iterator causes undefined behavior.
     * <br>
     * <br>If you break out of a such a while loop using g_variant_iter_loop() then
     * <br>you must free or unreference all the unpacked values as you would with
     * <br>g_variant_get(). Failure to do so will cause a memory leak.
     * <br>
     * <br>Here is an example for memory management with g_variant_iter_loop():
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&amp;iter, dictionary);
     *     while (g_variant_iter_loop (&amp;iter, &quot;{sv}&quot;, &amp;key, &amp;value))
     *       {
     *         g_print (&quot;Item '%s' has type '%s'&#92;n&quot;, key,
     *                  g_variant_get_type_string (value));
     * 
     *         // no need to free 'key' and 'value' here
     *         // unless breaking out of this loop
     *       }
     *   }
     * </pre>
     * <br>
     * <br>For most cases you should use g_variant_iter_next().
     * <br>
     * <br>This function is really only useful when unpacking into &#35;GVariant or
     * <br>&#35;GVariantIter in order to allow you to skip the call to
     * <br>g_variant_unref() or g_variant_iter_free().
     * <br>
     * <br>For example, if you are only looping over simple integer and string
     * <br>types, g_variant_iter_next() is definitely preferred.  For string
     * <br>types, use the '&amp;' prefix to avoid allocating any memory at all (and
     * <br>thereby avoiding the need to free anything as well).
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed.
     * <br>
     * <br>See the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked, or %FALSE if there was no          value
    */
    public boolean loop(String format_string, java.lang.Object... _elipse)  {
        return JnaVariantIter.INST().g_variant_iter_loop(asCPointer(), format_string, _elipse);
    }

    /**
     * Queries the number of child items in the container that we are
     * <br>iterating over.  This is the total number of items -- not the number
     * <br>of items remaining.
     * <br>
     * <br>This function might be useful for preallocation of arrays.
     * @return the number of children in the container
    */
    public long nChildren()  {
        return JnaVariantIter.INST().g_variant_iter_n_children(asCPointer());
    }

    /**
     * Gets the next item in the container and unpacks it into the variable
     * <br>argument list according to &#64;format_string, returning %TRUE.
     * <br>
     * <br>If no more items remain then %FALSE is returned.
     * <br>
     * <br>All of the pointers given on the variable arguments list of this
     * <br>function are assumed to point at uninitialised memory.  It is the
     * <br>responsibility of the caller to free all of the values returned by
     * <br>the unpacking process.
     * <br>
     * <br>Here is an example for memory management with g_variant_iter_next():
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&amp;iter, dictionary);
     *     while (g_variant_iter_next (&amp;iter, &quot;{sv}&quot;, &amp;key, &amp;value))
     *       {
     *         g_print (&quot;Item '%s' has type '%s'&#92;n&quot;, key,
     *                  g_variant_get_type_string (value));
     * 
     *         // must free data for ourselves
     *         g_variant_unref (value);
     *         g_free (key);
     *       }
     *   }
     * </pre>
     * <br>
     * <br>For a solution that is likely to be more convenient to C programmers
     * <br>when dealing with loops, see g_variant_iter_loop().
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed.
     * <br>
     * <br>See the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked, or %FALSE if there as no value
    */
    public boolean next(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaVariantIter.INST().g_variant_iter_next(asCPointer(), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Gets the next item in the container and unpacks it into the variable
     * <br>argument list according to &#64;format_string, returning %TRUE.
     * <br>
     * <br>If no more items remain then %FALSE is returned.
     * <br>
     * <br>All of the pointers given on the variable arguments list of this
     * <br>function are assumed to point at uninitialised memory.  It is the
     * <br>responsibility of the caller to free all of the values returned by
     * <br>the unpacking process.
     * <br>
     * <br>Here is an example for memory management with g_variant_iter_next():
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // Iterates a dictionary of type 'a{sv}'
     *   void
     *   iterate_dictionary (GVariant *dictionary)
     *   {
     *     GVariantIter iter;
     *     GVariant *value;
     *     gchar *key;
     * 
     *     g_variant_iter_init (&amp;iter, dictionary);
     *     while (g_variant_iter_next (&amp;iter, &quot;{sv}&quot;, &amp;key, &amp;value))
     *       {
     *         g_print (&quot;Item '%s' has type '%s'&#92;n&quot;, key,
     *                  g_variant_get_type_string (value));
     * 
     *         // must free data for ourselves
     *         g_variant_unref (value);
     *         g_free (key);
     *       }
     *   }
     * </pre>
     * <br>
     * <br>For a solution that is likely to be more convenient to C programmers
     * <br>when dealing with loops, see g_variant_iter_loop().
     * <br>
     * <br>&#64;format_string determines the C types that are used for unpacking
     * <br>the values and also determines if the values are copied or borrowed.
     * <br>
     * <br>See the section on
     * <br>[GVariant format strings][gvariant-format-strings-pointers].
     * @param format_string a GVariant format string
     * @param _elipse the arguments to unpack the value into
     * @return %TRUE if a value was unpacked, or %FALSE if there as no value
    */
    public boolean next(String format_string, java.lang.Object... _elipse)  {
        return JnaVariantIter.INST().g_variant_iter_next(asCPointer(), format_string, _elipse);
    }

    /**
     * Gets the next item in the container.  If no more items remain then
     * <br>%NULL is returned.
     * <br>
     * <br>Use g_variant_unref() to drop your reference on the return value when
     * <br>you no longer need it.
     * <br>
     * <br>Here is an example for iterating with g_variant_iter_next_value():
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // recursively iterate a container
     *   void
     *   iterate_container_recursive (GVariant *container)
     *   {
     *     GVariantIter iter;
     *     GVariant *child;
     * 
     *     g_variant_iter_init (&amp;iter, container);
     *     while ((child = g_variant_iter_next_value (&amp;iter)))
     *       {
     *         g_print (&quot;type '%s'&#92;n&quot;, g_variant_get_type_string (child));
     * 
     *         if (g_variant_is_container (child))
     *           iterate_container_recursive (child);
     * 
     *         g_variant_unref (child);
     *       }
     *   }
     * </pre>
     * @return a &#35;GVariant, or %NULL
    */
    public Variant nextValue()  {
        return new Variant(new PointerContainer(JnaVariantIter.INST().g_variant_iter_next_value(asCPointer())));
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:x:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
