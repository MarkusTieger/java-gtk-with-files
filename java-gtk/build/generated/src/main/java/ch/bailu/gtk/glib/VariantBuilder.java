/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A utility type for constructing container-type &#35;GVariant instances.
 * <br>
 * <br>This is an opaque structure and may only be accessed using the
 * <br>following functions.
 * <br>
 * <br>&#35;GVariantBuilder is not threadsafe in any way.  Do not attempt to
 * <br>access it from more than one thread.
 * <p><a href="https://docs.gtk.org/glib/struct.VariantBuilder.html">https://docs.gtk.org/glib/struct.VariantBuilder.html</a></p>
*/
public class VariantBuilder extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VariantBuilder.class.getCanonicalName());
    }

    public VariantBuilder(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates and initialises a new &#35;GVariantBuilder.
     * <br>
     * <br>You should call g_variant_builder_unref() on the return value when it
     * <br>is no longer needed.  The memory will not be automatically freed by
     * <br>any other call.
     * <br>
     * <br>In most cases it is easier to place a &#35;GVariantBuilder directly on
     * <br>the stack of the calling function and initialise it with
     * <br>g_variant_builder_init().
     * @param type a container type
    */
    public VariantBuilder(@Nonnull VariantType type) {
        super(cast(JnaVariantBuilder.INST().g_variant_builder_new(asCPointerNotNull(type))));
    }

    /**
     * Adds to a &#35;GVariantBuilder.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new() followed by g_variant_builder_add_value().
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>This function might be used as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GVariant *
     * make_pointless_dictionary (void)
     * {
     *   GVariantBuilder builder;
     *   int i;
     * 
     *   g_variant_builder_init (&amp;builder, G_VARIANT_TYPE_ARRAY);
     *   for (i = 0; i &lt; 16; i++)
     *     {
     *       gchar buf[3];
     * 
     *       sprintf (buf, &quot;%d&quot;, i);
     *       g_variant_builder_add (&amp;builder, &quot;{is}&quot;, i, buf);
     *     }
     * 
     *   return g_variant_builder_end (&amp;builder);
     * }
     * </pre>
     * @param format_string a &#35;GVariant varargs format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void add(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaVariantBuilder.INST().g_variant_builder_add(asCPointer(), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Adds to a &#35;GVariantBuilder.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new() followed by g_variant_builder_add_value().
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>This function might be used as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GVariant *
     * make_pointless_dictionary (void)
     * {
     *   GVariantBuilder builder;
     *   int i;
     * 
     *   g_variant_builder_init (&amp;builder, G_VARIANT_TYPE_ARRAY);
     *   for (i = 0; i &lt; 16; i++)
     *     {
     *       gchar buf[3];
     * 
     *       sprintf (buf, &quot;%d&quot;, i);
     *       g_variant_builder_add (&amp;builder, &quot;{is}&quot;, i, buf);
     *     }
     * 
     *   return g_variant_builder_end (&amp;builder);
     * }
     * </pre>
     * @param format_string a &#35;GVariant varargs format string
     * @param _elipse arguments, as per &#64;format_string
    */
    public void add(String format_string, java.lang.Object... _elipse)  {
        JnaVariantBuilder.INST().g_variant_builder_add(asCPointer(), format_string, _elipse);
    }

    /**
     * Adds to a &#35;GVariantBuilder.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new_parsed() followed by
     * <br>g_variant_builder_add_value().
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>This function might be used as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GVariant *
     * make_pointless_dictionary (void)
     * {
     *   GVariantBuilder builder;
     *   int i;
     * 
     *   g_variant_builder_init (&amp;builder, G_VARIANT_TYPE_ARRAY);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'width', &lt;%i&gt;}&quot;, 600);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'title', &lt;%s&gt;}&quot;, &quot;foo&quot;);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'transparency', &lt;0.5&gt;}&quot;);
     *   return g_variant_builder_end (&amp;builder);
     * }
     * </pre>
     * @param format a text format &#35;GVariant
     * @param _elipse arguments as per &#64;format
    */
    public void addParsed(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaVariantBuilder.INST().g_variant_builder_add_parsed(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Adds to a &#35;GVariantBuilder.
     * <br>
     * <br>This call is a convenience wrapper that is exactly equivalent to
     * <br>calling g_variant_new_parsed() followed by
     * <br>g_variant_builder_add_value().
     * <br>
     * <br>Note that the arguments must be of the correct width for their types
     * <br>specified in &#64;format_string. This can be achieved by casting them. See
     * <br>the [GVariant varargs documentation][gvariant-varargs].
     * <br>
     * <br>This function might be used as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GVariant *
     * make_pointless_dictionary (void)
     * {
     *   GVariantBuilder builder;
     *   int i;
     * 
     *   g_variant_builder_init (&amp;builder, G_VARIANT_TYPE_ARRAY);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'width', &lt;%i&gt;}&quot;, 600);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'title', &lt;%s&gt;}&quot;, &quot;foo&quot;);
     *   g_variant_builder_add_parsed (&amp;builder, &quot;{'transparency', &lt;0.5&gt;}&quot;);
     *   return g_variant_builder_end (&amp;builder);
     * }
     * </pre>
     * @param format a text format &#35;GVariant
     * @param _elipse arguments as per &#64;format
    */
    public void addParsed(String format, java.lang.Object... _elipse)  {
        JnaVariantBuilder.INST().g_variant_builder_add_parsed(asCPointer(), format, _elipse);
    }

    /**
     * Adds &#64;value to &#64;builder.
     * <br>
     * <br>It is an error to call this function in any way that would create an
     * <br>inconsistent value to be constructed.  Some examples of this are
     * <br>putting different types of items into an array, putting the wrong
     * <br>types or number of items in a tuple, putting more than one value into
     * <br>a variant, etc.
     * <br>
     * <br>If &#64;value is a floating reference (see g_variant_ref_sink()),
     * <br>the &#64;builder instance takes ownership of &#64;value.
     * @param value a &#35;GVariant
    */
    public void addValue(@Nonnull Variant value)  {
        JnaVariantBuilder.INST().g_variant_builder_add_value(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Releases all memory associated with a &#35;GVariantBuilder without
     * <br>freeing the &#35;GVariantBuilder structure itself.
     * <br>
     * <br>It typically only makes sense to do this on a stack-allocated
     * <br>&#35;GVariantBuilder if you want to abort building the value part-way
     * <br>through.  This function need not be called if you call
     * <br>g_variant_builder_end() and it also doesn't need to be called on
     * <br>builders allocated with g_variant_builder_new() (see
     * <br>g_variant_builder_unref() for that).
     * <br>
     * <br>This function leaves the &#35;GVariantBuilder structure set to all-zeros.
     * <br>It is valid to call this function on either an initialised
     * <br>&#35;GVariantBuilder or one that is set to all-zeros but it is not valid
     * <br>to call this function on uninitialised memory.
    */
    public void clear()  {
        JnaVariantBuilder.INST().g_variant_builder_clear(asCPointer());
    }

    /**
     * Closes the subcontainer inside the given &#64;builder that was opened by
     * <br>the most recent call to g_variant_builder_open().
     * <br>
     * <br>It is an error to call this function in any way that would create an
     * <br>inconsistent value to be constructed (ie: too few values added to the
     * <br>subcontainer).
    */
    public void close()  {
        JnaVariantBuilder.INST().g_variant_builder_close(asCPointer());
    }

    /**
     * Ends the builder process and returns the constructed value.
     * <br>
     * <br>It is not permissible to use &#64;builder in any way after this call
     * <br>except for reference counting operations (in the case of a
     * <br>heap-allocated &#35;GVariantBuilder) or by reinitialising it with
     * <br>g_variant_builder_init() (in the case of stack-allocated). This
     * <br>means that for the stack-allocated builders there is no need to
     * <br>call g_variant_builder_clear() after the call to
     * <br>g_variant_builder_end().
     * <br>
     * <br>It is an error to call this function in any way that would create an
     * <br>inconsistent value to be constructed (ie: insufficient number of
     * <br>items added to a container with a specific number of children
     * <br>required).  It is also an error to call this function if the builder
     * <br>was created with an indefinite array or maybe type and no children
     * <br>have been added; in this case it is impossible to infer the type of
     * <br>the empty array.
     * @return a new, floating, &#35;GVariant
    */
    public Variant end()  {
        return new Variant(new PointerContainer(JnaVariantBuilder.INST().g_variant_builder_end(asCPointer())));
    }

    /**
     * Initialises a &#35;GVariantBuilder structure.
     * <br>
     * <br>&#64;type must be non-%NULL.  It specifies the type of container to
     * <br>construct.  It can be an indefinite type such as
     * <br>%G_VARIANT_TYPE_ARRAY or a definite type such as &quot;as&quot; or &quot;(ii)&quot;.
     * <br>Maybe, array, tuple, dictionary entry and variant-typed values may be
     * <br>constructed.
     * <br>
     * <br>After the builder is initialised, values are added using
     * <br>g_variant_builder_add_value() or g_variant_builder_add().
     * <br>
     * <br>After all the child values are added, g_variant_builder_end() frees
     * <br>the memory associated with the builder and returns the &#35;GVariant that
     * <br>was created.
     * <br>
     * <br>This function completely ignores the previous contents of &#64;builder.
     * <br>On one hand this means that it is valid to pass in completely
     * <br>uninitialised memory.  On the other hand, this means that if you are
     * <br>initialising over top of an existing &#35;GVariantBuilder you need to
     * <br>first call g_variant_builder_clear() in order to avoid leaking
     * <br>memory.
     * <br>
     * <br>You must not call g_variant_builder_ref() or
     * <br>g_variant_builder_unref() on a &#35;GVariantBuilder that was initialised
     * <br>with this function.  If you ever pass a reference to a
     * <br>&#35;GVariantBuilder outside of the control of your own code then you
     * <br>should assume that the person receiving that reference may try to use
     * <br>reference counting; you should use g_variant_builder_new() instead of
     * <br>this function.
     * @param type a container type
    */
    public void init(@Nonnull VariantType type)  {
        JnaVariantBuilder.INST().g_variant_builder_init(asCPointer(), asCPointerNotNull(type));
    }

    /**
     * Opens a subcontainer inside the given &#64;builder.  When done adding
     * <br>items to the subcontainer, g_variant_builder_close() must be called. &#64;type
     * <br>is the type of the container: so to build a tuple of several values, &#64;type
     * <br>must include the tuple itself.
     * <br>
     * <br>It is an error to call this function in any way that would cause an
     * <br>inconsistent value to be constructed (ie: adding too many values or
     * <br>a value of an incorrect type).
     * <br>
     * <br>Example of building a nested variant:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GVariantBuilder builder;
     * guint32 some_number = get_number ();
     * g_autoptr (GHashTable) some_dict = get_dict ();
     * GHashTableIter iter;
     * const gchar *key;
     * const GVariant *value;
     * g_autoptr (GVariant) output = NULL;
     * 
     * g_variant_builder_init (&amp;builder, G_VARIANT_TYPE (&quot;(ua{sv})&quot;));
     * g_variant_builder_add (&amp;builder, &quot;u&quot;, some_number);
     * g_variant_builder_open (&amp;builder, G_VARIANT_TYPE (&quot;a{sv}&quot;));
     * 
     * g_hash_table_iter_init (&amp;iter, some_dict);
     * while (g_hash_table_iter_next (&amp;iter, (gpointer *) &amp;key, (gpointer *) &amp;value))
     *   {
     *     g_variant_builder_open (&amp;builder, G_VARIANT_TYPE (&quot;{sv}&quot;));
     *     g_variant_builder_add (&amp;builder, &quot;s&quot;, key);
     *     g_variant_builder_add (&amp;builder, &quot;v&quot;, value);
     *     g_variant_builder_close (&amp;builder);
     *   }
     * 
     * g_variant_builder_close (&amp;builder);
     * 
     * output = g_variant_builder_end (&amp;builder);
     * </pre>
     * @param type the &#35;GVariantType of the container
    */
    public void open(@Nonnull VariantType type)  {
        JnaVariantBuilder.INST().g_variant_builder_open(asCPointer(), asCPointerNotNull(type));
    }

    /**
     * Increases the reference count on &#64;builder.
     * <br>
     * <br>Don't call this on stack-allocated &#35;GVariantBuilder instances or bad
     * <br>things will happen.
     * @return a new reference to &#64;builder
    */
    public VariantBuilder ref()  {
        return new VariantBuilder(new PointerContainer(JnaVariantBuilder.INST().g_variant_builder_ref(asCPointer())));
    }

    /**
     * Decreases the reference count on &#64;builder.
     * <br>
     * <br>In the event that there are no more references, releases all memory
     * <br>associated with the &#35;GVariantBuilder.
     * <br>
     * <br>Don't call this on stack-allocated &#35;GVariantBuilder instances or bad
     * <br>things will happen.
    */
    public void unref()  {
        JnaVariantBuilder.INST().g_variant_builder_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaVariantBuilder.INST().g_variant_builder_get_type(); 
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
