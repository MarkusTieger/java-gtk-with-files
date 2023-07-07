/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque context struct for `GtkBuildableParser`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.BuildableParseContext.html">https://docs.gtk.org/gtk4/struct.BuildableParseContext.html</a></p>
*/
class BuildableParseContext extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuildableParseContext.class.getCanonicalName());
    }

    public BuildableParseContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the name of the currently open element.
     * <br>
     * <br>If called from the start_element or end_element handlers this will
     * <br>give the element_name as passed to those functions. For the parent
     * <br>elements, see gtk_buildable_parse_context_get_element_stack().
     * @return the name of the currently open element
    */
    public ch.bailu.gtk.type.Str getElement()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBuildableParseContext.INST().gtk_buildable_parse_context_get_element(asCPointer())));
    }

    /**
     * Retrieves the element stack from the internal state of the parser.
     * <br>
     * <br>The returned `GPtrArray` is an array of strings where the last item is
     * <br>the currently open tag (as would be returned by
     * <br>gtk_buildable_parse_context_get_element()) and the previous item is its
     * <br>immediate parent.
     * <br>
     * <br>This function is intended to be used in the start_element and
     * <br>end_element handlers where gtk_buildable_parse_context_get_element()
     * <br>would merely return the name of the element that is being
     * <br>processed.
     * @return the element stack, which must not be modified
    */
    public ch.bailu.gtk.glib.PtrArray getElementStack()  {
        return new ch.bailu.gtk.glib.PtrArray(new PointerContainer(JnaBuildableParseContext.INST().gtk_buildable_parse_context_get_element_stack(asCPointer())));
    }

    /**
     * Retrieves the current line number and the number of the character on
     * <br>that line. Intended for use in error messages; there are no strict
     * <br>semantics for what constitutes the &quot;current&quot; line number other than
     * <br>&quot;the best number we could come up with for error messages.&quot;
     * @param line_number return location for a line number
     * @param char_number return location for a char-on-line number
    */
    public void getPosition(@Nullable ch.bailu.gtk.type.Int line_number, @Nullable ch.bailu.gtk.type.Int char_number)  {
        JnaBuildableParseContext.INST().gtk_buildable_parse_context_get_position(asCPointer(), asCPointer(line_number), asCPointer(char_number));
    }

    /**
     * Completes the process of a temporary sub-parser redirection.
     * <br>
     * <br>This function exists to collect the user_data allocated by a
     * <br>matching call to gtk_buildable_parse_context_push(). It must be called
     * <br>in the end_element handler corresponding to the start_element
     * <br>handler during which gtk_buildable_parse_context_push() was called.
     * <br>You must not call this function from the error callback -- the
     * <br>&#64;user_data is provided directly to the callback in that case.
     * <br>
     * <br>This function is not intended to be directly called by users
     * <br>interested in invoking subparsers. Instead, it is intended to
     * <br>be used by the subparsers themselves to implement a higher-level
     * <br>interface.
     * @return the user data passed to gtk_buildable_parse_context_push()
    */
    public ch.bailu.gtk.type.Pointer pop()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaBuildableParseContext.INST().gtk_buildable_parse_context_pop(asCPointer())));
    }

    /**
     * Temporarily redirects markup data to a sub-parser.
     * <br>
     * <br>This function may only be called from the start_element handler of
     * <br>a `GtkBuildableParser`. It must be matched with a corresponding call to
     * <br>gtk_buildable_parse_context_pop() in the matching end_element handler
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
     * <br>which is why gtk_buildable_parse_context_pop() is provided to allow &quot;one
     * <br>last access&quot; to the &#64;user_data provided to this function. In the
     * <br>case of error, the &#64;user_data provided here is passed directly to
     * <br>the error callback of the subparser and gtk_buildable_parse_context_pop()
     * <br>should not be called. In either case, if &#64;user_data was allocated
     * <br>then it ought to be freed from both of these locations.
     * <br>
     * <br>This function is not intended to be directly called by users
     * <br>interested in invoking subparsers. Instead, it is intended to be
     * <br>used by the subparsers themselves to implement a higher-level
     * <br>interface.
     * <br>
     * <br>For an example of how to use this, see g_markup_parse_context_push() which
     * <br>has the same kind of API.
     * @param parser a `GtkBuildableParser`
     * @param user_data user data to pass to `GtkBuildableParser` functions
    */
    public void push(@Nonnull BuildableParser parser, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaBuildableParseContext.INST().gtk_buildable_parse_context_push(asCPointer(), asCPointerNotNull(parser), asCPointer(user_data));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
