/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A parse context is used to parse a stream of bytes that
 * <br>you expect to contain marked-up text.
 * <br>
 * <br>See g_markup_parse_context_new(), &#35;GMarkupParser, and so
 * <br>on for more details.
 * <p><a href="https://docs.gtk.org/glib/struct.MarkupParseContext.html">https://docs.gtk.org/glib/struct.MarkupParseContext.html</a></p>
*/
public class MarkupParseContext extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MarkupParseContext.class.getCanonicalName());
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
    
    private static JnaMarkupParseContext.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMarkupParseContext.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public MarkupParseContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new parse context. A parse context is used to parse
     * <br>marked-up documents. You can feed any number of documents into
     * <br>a context, as long as no errors occur; once an error occurs,
     * <br>the parse context can't continue to parse text (you have to
     * <br>free it and create a new parse context).
     * @param parser a &#35;GMarkupParser
     * @param flags one or more &#35;GMarkupParseFlags
     * @param user_data user data to pass to &#35;GMarkupParser functions
     * @param user_data_dnotify user data destroy notifier called when     the parse context is freed
    */
    public MarkupParseContext(@Nonnull MarkupParser parser, int flags, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_dnotify) {
        super(cast(JnaMarkupParseContext.INST().g_markup_parse_context_new(asCPointerNotNull(parser), flags, asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", user_data_dnotify))));
    }

    /**
     * Signals to the &#35;GMarkupParseContext that all data has been
     * <br>fed into the parse context with g_markup_parse_context_parse().
     * <br>
     * <br>This function reports an error if the document isn't complete,
     * <br>for example if elements are still open.
     * @return %TRUE on success, %FALSE if an error was set
    */
    public boolean endParse() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMarkupParseContext.INST().g_markup_parse_context_end_parse(asCPointer(), 0L);
    }

    /**
     * Frees a &#35;GMarkupParseContext.
     * <br>
     * <br>This function can't be called from inside one of the
     * <br>&#35;GMarkupParser functions or while a subparser is pushed.
    */
    public void free()  {
        JnaMarkupParseContext.INST().g_markup_parse_context_free(asCPointer());
    }

    /**
     * Retrieves the name of the currently open element.
     * <br>
     * <br>If called from the start_element or end_element handlers this will
     * <br>give the element_name as passed to those functions. For the parent
     * <br>elements, see g_markup_parse_context_get_element_stack().
     * @return the name of the currently open element, or %NULL
    */
    public ch.bailu.gtk.type.Str getElement()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMarkupParseContext.INST().g_markup_parse_context_get_element(asCPointer())));
    }

    /**
     * Retrieves the element stack from the internal state of the parser.
     * <br>
     * <br>The returned &#35;GSList is a list of strings where the first item is
     * <br>the currently open tag (as would be returned by
     * <br>g_markup_parse_context_get_element()) and the next item is its
     * <br>immediate parent.
     * <br>
     * <br>This function is intended to be used in the start_element and
     * <br>end_element handlers where g_markup_parse_context_get_element()
     * <br>would merely return the name of the element that is being
     * <br>processed.
     * @return the element stack, which must not be modified
    */
    public SList getElementStack()  {
        return new SList(new PointerContainer(JnaMarkupParseContext.INST().g_markup_parse_context_get_element_stack(asCPointer())));
    }

    /**
     * Retrieves the current line number and the number of the character on
     * <br>that line. Intended for use in error messages; there are no strict
     * <br>semantics for what constitutes the &quot;current&quot; line number other than
     * <br>&quot;the best number we could come up with for error messages.&quot;
     * @param line_number return location for a line number, or %NULL
     * @param char_number return location for a char-on-line number, or %NULL
    */
    public void getPosition(@Nullable ch.bailu.gtk.type.Int line_number, @Nullable ch.bailu.gtk.type.Int char_number)  {
        JnaMarkupParseContext.INST().g_markup_parse_context_get_position(asCPointer(), asCPointer(line_number), asCPointer(char_number));
    }

    /**
     * Returns the user_data associated with &#64;context.
     * <br>
     * <br>This will either be the user_data that was provided to
     * <br>g_markup_parse_context_new() or to the most recent call
     * <br>of g_markup_parse_context_push().
     * @return the provided user_data. The returned data belongs to     the markup context and will be freed when     g_markup_parse_context_free() is called.
    */
    public ch.bailu.gtk.type.Pointer getUserData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaMarkupParseContext.INST().g_markup_parse_context_get_user_data(asCPointer())));
    }

    /**
     * Feed some data to the &#35;GMarkupParseContext.
     * <br>
     * <br>The data need not be valid UTF-8; an error will be signaled if
     * <br>it's invalid. The data need not be an entire document; you can
     * <br>feed a document into the parser incrementally, via multiple calls
     * <br>to this function. Typically, as you receive data from a network
     * <br>connection or file, you feed each received chunk of data into this
     * <br>function, aborting the process if an error occurs. Once an error
     * <br>is reported, no further data may be fed to the &#35;GMarkupParseContext;
     * <br>all errors are fatal.
     * @param text chunk of text to parse
     * @param text_len length of &#64;text in bytes
     * @return %FALSE if an error occurred, %TRUE on success
    */
    public boolean parse(@Nonnull ch.bailu.gtk.type.Str text, long text_len) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMarkupParseContext.INST().g_markup_parse_context_parse(asCPointer(), asCPointerNotNull(text), text_len, 0L);
    }

    /**
     * Feed some data to the &#35;GMarkupParseContext.
     * <br>
     * <br>The data need not be valid UTF-8; an error will be signaled if
     * <br>it's invalid. The data need not be an entire document; you can
     * <br>feed a document into the parser incrementally, via multiple calls
     * <br>to this function. Typically, as you receive data from a network
     * <br>connection or file, you feed each received chunk of data into this
     * <br>function, aborting the process if an error occurs. Once an error
     * <br>is reported, no further data may be fed to the &#35;GMarkupParseContext;
     * <br>all errors are fatal.
     * @param text chunk of text to parse
     * @param text_len length of &#64;text in bytes
     * @return %FALSE if an error occurred, %TRUE on success
    */
    public boolean parse(String text, long text_len) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMarkupParseContext.INST().g_markup_parse_context_parse(asCPointer(), text, text_len, 0L);
    }

    /**
     * Completes the process of a temporary sub-parser redirection.
     * <br>
     * <br>This function exists to collect the user_data allocated by a
     * <br>matching call to g_markup_parse_context_push(). It must be called
     * <br>in the end_element handler corresponding to the start_element
     * <br>handler during which g_markup_parse_context_push() was called.
     * <br>You must not call this function from the error callback -- the
     * <br>&#64;user_data is provided directly to the callback in that case.
     * <br>
     * <br>This function is not intended to be directly called by users
     * <br>interested in invoking subparsers. Instead, it is intended to
     * <br>be used by the subparsers themselves to implement a higher-level
     * <br>interface.
     * @return the user data passed to g_markup_parse_context_push()
    */
    public ch.bailu.gtk.type.Pointer pop()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaMarkupParseContext.INST().g_markup_parse_context_pop(asCPointer())));
    }

    /**
     * Temporarily redirects markup data to a sub-parser.
     * <br>
     * <br>This function may only be called from the start_element handler of
     * <br>a &#35;GMarkupParser. It must be matched with a corresponding call to
     * <br>g_markup_parse_context_pop() in the matching end_element handler
     * <br>(except in the case that the parser aborts due to an error).
     * <br>
     * <br>All tags, text and other data between the matching tags is
     * <br>redirected to the subparser given by &#64;parser. &#64;user_data is used
     * <br>as the user_data for that parser. &#64;user_data is also passed to the
     * <br>error callback in the event that an error occurs. This includes
     * <br>errors that occur in subparsers of the subparser.
     * <br>
     * <br>The end tag matching the start tag for which this call was made is
     * <br>handled by the previous parser (which is given its own user_data)
     * <br>which is why g_markup_parse_context_pop() is provided to allow &quot;one
     * <br>last access&quot; to the &#64;user_data provided to this function. In the
     * <br>case of error, the &#64;user_data provided here is passed directly to
     * <br>the error callback of the subparser and g_markup_parse_context_pop()
     * <br>should not be called. In either case, if &#64;user_data was allocated
     * <br>then it ought to be freed from both of these locations.
     * <br>
     * <br>This function is not intended to be directly called by users
     * <br>interested in invoking subparsers. Instead, it is intended to be
     * <br>used by the subparsers themselves to implement a higher-level
     * <br>interface.
     * <br>
     * <br>As an example, see the following implementation of a simple
     * <br>parser that counts the number of tags encountered.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * typedef struct
     * {
     *   gint tag_count;
     * } CounterData;
     * 
     * static void
     * counter_start_element (GMarkupParseContext  *context,
     *                        const gchar          *element_name,
     *                        const gchar         **attribute_names,
     *                        const gchar         **attribute_values,
     *                        gpointer              user_data,
     *                        GError              **error)
     * {
     *   CounterData *data = user_data;
     * 
     *   data-&gt;tag_count++;
     * }
     * 
     * static void
     * counter_error (GMarkupParseContext *context,
     *                GError              *error,
     *                gpointer             user_data)
     * {
     *   CounterData *data = user_data;
     * 
     *   g_slice_free (CounterData, data);
     * }
     * 
     * static GMarkupParser counter_subparser =
     * {
     *   counter_start_element,
     *   NULL,
     *   NULL,
     *   NULL,
     *   counter_error
     * };
     * </pre>
     * <br>
     * <br>In order to allow this parser to be easily used as a subparser, the
     * <br>following interface is provided:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * void
     * start_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_slice_new (CounterData);
     * 
     *   data-&gt;tag_count = 0;
     *   g_markup_parse_context_push (context, &amp;counter_subparser, data);
     * }
     * 
     * gint
     * end_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_markup_parse_context_pop (context);
     *   int result;
     * 
     *   result = data-&gt;tag_count;
     *   g_slice_free (CounterData, data);
     * 
     *   return result;
     * }
     * </pre>
     * <br>
     * <br>The subparser would then be used as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static void start_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, &quot;count-these&quot;) == 0)
     *     start_counting (context);
     * 
     *   // else, handle other tags...
     * }
     * 
     * static void end_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, &quot;count-these&quot;) == 0)
     *     g_print (&quot;Counted %d tags&#92;n&quot;, end_counting (context));
     * 
     *   // else, handle other tags...
     * }
     * </pre>
     * @param parser a &#35;GMarkupParser
     * @param user_data user data to pass to &#35;GMarkupParser functions
    */
    public void push(@Nonnull MarkupParser parser, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaMarkupParseContext.INST().g_markup_parse_context_push(asCPointer(), asCPointerNotNull(parser), asCPointer(user_data));
    }

    /**
     * Increases the reference count of &#64;context.
     * @return the same &#64;context
    */
    public MarkupParseContext ref()  {
        return new MarkupParseContext(new PointerContainer(JnaMarkupParseContext.INST().g_markup_parse_context_ref(asCPointer())));
    }

    /**
     * Decreases the reference count of &#64;context.  When its reference count
     * <br>drops to 0, it is freed.
    */
    public void unref()  {
        JnaMarkupParseContext.INST().g_markup_parse_context_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMarkupParseContext.INST().g_markup_parse_context_get_type(); 
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
