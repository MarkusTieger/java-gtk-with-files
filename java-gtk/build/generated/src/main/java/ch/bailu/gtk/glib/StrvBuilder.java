/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GStrvBuilder is a method of easily building dynamically sized
 * <br>NULL-terminated string arrays.
 * <br>
 * <br>The following example shows how to build a two element array:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, &quot;hello&quot;);
 *   g_strv_builder_add (builder, &quot;world&quot;);
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * </pre>
 * <p><a href="https://docs.gtk.org/glib/struct.StrvBuilder.html">https://docs.gtk.org/glib/struct.StrvBuilder.html</a></p>
*/
class StrvBuilder extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StrvBuilder.class.getCanonicalName());
    }

    public StrvBuilder(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Add a string to the end of the array.
     * <br>
     * <br>Since 2.68
     * @param value a string.
    */
    public void add(@Nonnull ch.bailu.gtk.type.Str value)  {
        JnaStrvBuilder.INST().g_strv_builder_add(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Add a string to the end of the array.
     * <br>
     * <br>Since 2.68
     * @param value a string.
    */
    public void add(String value)  {
        JnaStrvBuilder.INST().g_strv_builder_add(asCPointer(), value);
    }

    /**
     * Appends all the given strings to the builder.
     * <br>
     * <br>Since 2.70
     * @param _elipse one or more strings followed by %NULL
    */
    public void addMany(java.lang.Object... _elipse)  {
        JnaStrvBuilder.INST().g_strv_builder_add_many(asCPointer(), _elipse);
    }

    /**
     * Appends all the strings in the given vector to the builder.
     * <br>
     * <br>Since 2.70
     * @param value the vector of strings to add
    */
    public void addv(@Nonnull ch.bailu.gtk.type.Strs value)  {
        JnaStrvBuilder.INST().g_strv_builder_addv(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Atomically increments the reference count of &#64;builder by one.
     * <br>This function is thread-safe and may be called from any thread.
     * @return The passed in &#35;GStrvBuilder
    */
    public StrvBuilder ref()  {
        return new StrvBuilder(new PointerContainer(JnaStrvBuilder.INST().g_strv_builder_ref(asCPointer())));
    }

    /**
     * Decreases the reference count on &#64;builder.
     * <br>
     * <br>In the event that there are no more references, releases all memory
     * <br>associated with the &#35;GStrvBuilder.
    */
    public void unref()  {
        JnaStrvBuilder.INST().g_strv_builder_unref(asCPointer());
    }

    /**
     * Creates a new &#35;GStrvBuilder with a reference count of 1.
     * <br>Use g_strv_builder_unref() on the returned value when no longer needed.
     * @return the new &#35;GStrvBuilder
    */
    public static StrvBuilder _new()  {
        return new StrvBuilder(new PointerContainer(JnaStrvBuilder.INST().g_strv_builder_new()));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:cb-return-value-not-supported:end:[ParameterModel:java-type-not-supported:{G_::{c:GStrv}}:{j:}]]
*/
