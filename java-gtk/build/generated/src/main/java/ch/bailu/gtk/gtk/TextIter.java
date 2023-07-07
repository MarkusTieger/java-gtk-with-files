/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An iterator for the contents of a `GtkTextBuffer`.
 * <br>
 * <br>You may wish to begin by reading the
 * <br>[text widget conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types
 * <br>related to the text widget and how they work together.
 * <p><a href="https://docs.gtk.org/gtk4/struct.TextIter.html">https://docs.gtk.org/gtk4/struct.TextIter.html</a></p>
*/
public class TextIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextIter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTextCharPredicate {
        /**
         * The predicate function used by gtk_text_iter_forward_find_char() and
         * <br>gtk_text_iter_backward_find_char().
         * @param ch a Unicode code point
         * @param user_data data passed to the callback
         * @return %TRUE if the predicate is satisfied, and the iteration should   stop, and %FALSE otherwise
        */
        boolean onTextCharPredicate(ch.bailu.gtk.lib.handler.CallbackHandler __self, byte ch, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTextIter.OnTextCharPredicate toOnTextCharPredicate(ch.bailu.gtk.type.Pointer instance, String methodName, OnTextCharPredicate in) {
        JnaTextIter.OnTextCharPredicate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_ch, _user_data) -> in.onTextCharPredicate(__callback, _ch, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public TextIter(PointerContainer pointer) {
        super(pointer);
    }

    public TextIter() {
        super(cast(JnaTextIter.allocateStructure()));
    }

    private JnaTextIter.Fields _fields;
    
    JnaTextIter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTextIter.Fields(asCPointer());
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
    public int getFieldDummy3() {
       toFields().readField(DUMMY3);
       return toFields().dummy3;
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
    public int getFieldDummy5() {
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
    public int getFieldDummy6() {
       toFields().readField(DUMMY6);
       return toFields().dummy6;
    } 

    /**
     * 
    */
    public static final String DUMMY7 = "dummy7";

    /**
     * 
    */
    public int getFieldDummy7() {
       toFields().readField(DUMMY7);
       return toFields().dummy7;
    } 

    /**
     * 
    */
    public static final String DUMMY8 = "dummy8";

    /**
     * 
    */
    public int getFieldDummy8() {
       toFields().readField(DUMMY8);
       return toFields().dummy8;
    } 

    /**
     * 
    */
    public static final String DUMMY9 = "dummy9";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy9() {
       toFields().readField(DUMMY9);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy9));
    } 

    /**
     * 
    */
    public static final String DUMMY10 = "dummy10";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy10() {
       toFields().readField(DUMMY10);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy10));
    } 

    /**
     * 
    */
    public static final String DUMMY11 = "dummy11";

    /**
     * 
    */
    public int getFieldDummy11() {
       toFields().readField(DUMMY11);
       return toFields().dummy11;
    } 

    /**
     * 
    */
    public static final String DUMMY12 = "dummy12";

    /**
     * 
    */
    public int getFieldDummy12() {
       toFields().readField(DUMMY12);
       return toFields().dummy12;
    } 

    /**
     * 
    */
    public static final String DUMMY13 = "dummy13";

    /**
     * 
    */
    public int getFieldDummy13() {
       toFields().readField(DUMMY13);
       return toFields().dummy13;
    } 

    /**
     * 
    */
    public static final String DUMMY14 = "dummy14";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldDummy14() {
       toFields().readField(DUMMY14);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().dummy14));
    } 

    /**
     * Assigns the value of &#64;other to &#64;iter.
     * <br>
     * <br>This function is not useful in applications, because
     * <br>iterators can be assigned with `GtkTextIter i = j;`.
     * <br>
     * <br>The function is used by language bindings.
     * @param other another `GtkTextIter`
    */
    public void assign(@Nonnull TextIter other)  {
        JnaTextIter.INST().gtk_text_iter_assign(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Moves backward by one character offset.
     * <br>
     * <br>Returns %TRUE if movement was possible; if &#64;iter was the first
     * <br>in the buffer (character offset 0), this function returns %FALSE
     * <br>for convenience when writing loops.
     * @return whether movement was possible
    */
    public boolean backwardChar()  {
        return JnaTextIter.INST().gtk_text_iter_backward_char(asCPointer());
    }

    /**
     * Moves &#64;count characters backward, if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer, moves
     * <br>to the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the iterator moved
     * <br>onto a dereferenceable position; if the iterator didn’t move, or
     * <br>moved onto the end iterator, then %FALSE is returned. If &#64;count is 0,
     * <br>the function does nothing and returns %FALSE.
     * @param count number of characters to move
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean backwardChars(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_chars(asCPointer(), count);
    }

    /**
     * Like gtk_text_iter_forward_cursor_position(), but moves backward.
     * @return %TRUE if we moved
    */
    public boolean backwardCursorPosition()  {
        return JnaTextIter.INST().gtk_text_iter_backward_cursor_position(asCPointer());
    }

    /**
     * Moves up to &#64;count cursor positions.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.forward_cursor_position] for details.
     * @param count number of positions to move
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean backwardCursorPositions(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_cursor_positions(asCPointer(), count);
    }

    /**
     * Same as gtk_text_iter_forward_find_char(),
     * <br>but goes backward from &#64;iter.
     * @param pred function to be called on each character
     * @param user_data user data for &#64;pred
     * @param limit search limit
     * @return whether a match was found
    */
    public boolean backwardFindChar(OnTextCharPredicate pred, @Nullable ch.bailu.gtk.type.Pointer user_data, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_backward_find_char(asCPointer(), toOnTextCharPredicate(this, "backwardFindChar", pred), asCPointer(user_data), asCPointer(limit));
    }

    /**
     * Moves &#64;iter to the start of the previous line.
     * <br>
     * <br>Returns %TRUE if &#64;iter could be moved; i.e. if &#64;iter was at
     * <br>character offset 0, this function returns %FALSE. Therefore,
     * <br>if &#64;iter was already on line 0, but not at the start of the line,
     * <br>&#64;iter is snapped to the start of the line and the function returns
     * <br>%TRUE. (Note that this implies that
     * <br>in a loop calling this function, the line number may not change on
     * <br>every iteration, if your first iteration is on line 0.)
     * @return whether &#64;iter moved
    */
    public boolean backwardLine()  {
        return JnaTextIter.INST().gtk_text_iter_backward_line(asCPointer());
    }

    /**
     * Moves &#64;count lines backward, if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer, moves to
     * <br>the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the iterator moved
     * <br>onto a dereferenceable position; if the iterator didn’t move, or
     * <br>moved onto the end iterator, then %FALSE is returned. If &#64;count is 0,
     * <br>the function does nothing and returns %FALSE. If &#64;count is negative,
     * <br>moves forward by 0 - &#64;count lines.
     * @param count number of lines to move backward
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean backwardLines(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_lines(asCPointer(), count);
    }

    /**
     * Same as gtk_text_iter_forward_search(), but moves backward.
     * <br>
     * <br>&#64;match_end will never be set to a `GtkTextIter` located after &#64;iter,
     * <br>even if there is a possible &#64;match_start before or at &#64;iter.
     * @param str search string
     * @param flags bitmask of flags affecting the search
     * @param match_start return location for start of match
     * @param match_end return location for end of match
     * @param limit location of last possible &#64;match_start, or %NULL for start of buffer
     * @return whether a match was found
    */
    public boolean backwardSearch(@Nonnull ch.bailu.gtk.type.Str str, int flags, @Nullable TextIter match_start, @Nullable TextIter match_end, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_backward_search(asCPointer(), asCPointerNotNull(str), flags, asCPointer(match_start), asCPointer(match_end), asCPointer(limit));
    }

    /**
     * Same as gtk_text_iter_forward_search(), but moves backward.
     * <br>
     * <br>&#64;match_end will never be set to a `GtkTextIter` located after &#64;iter,
     * <br>even if there is a possible &#64;match_start before or at &#64;iter.
     * @param str search string
     * @param flags bitmask of flags affecting the search
     * @param match_start return location for start of match
     * @param match_end return location for end of match
     * @param limit location of last possible &#64;match_start, or %NULL for start of buffer
     * @return whether a match was found
    */
    public boolean backwardSearch(String str, int flags, @Nullable TextIter match_start, @Nullable TextIter match_end, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_backward_search(asCPointer(), str, flags, asCPointer(match_start), asCPointer(match_end), asCPointer(limit));
    }

    /**
     * Moves backward to the previous sentence start.
     * <br>
     * <br>If &#64;iter is already at the start of a sentence, moves backward
     * <br>to the next one.
     * <br>
     * <br>Sentence boundaries are determined by Pango and should
     * <br>be correct for nearly any language.
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardSentenceStart()  {
        return JnaTextIter.INST().gtk_text_iter_backward_sentence_start(asCPointer());
    }

    /**
     * Calls gtk_text_iter_backward_sentence_start() up to &#64;count times.
     * <br>
     * <br>If &#64;count is negative, moves forward instead of backward.
     * @param count number of sentences to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardSentenceStarts(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_sentence_starts(asCPointer(), count);
    }

    /**
     * Moves backward to the next toggle (on or off) of the
     * <br>&#64;tag, or to the next toggle of any tag if
     * <br>&#64;tag is %NULL.
     * <br>
     * <br>If no matching tag toggles are found,
     * <br>returns %FALSE, otherwise %TRUE. Does not return toggles
     * <br>located at &#64;iter, only toggles before &#64;iter. Sets &#64;iter
     * <br>to the location of the toggle, or the start of the buffer
     * <br>if no toggle is found.
     * @param tag a `GtkTextTag`
     * @return whether we found a tag toggle before &#64;iter
    */
    public boolean backwardToTagToggle(@Nullable TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_backward_to_tag_toggle(asCPointer(), asCPointer(tag));
    }

    /**
     * Moves &#64;iter forward to the previous visible cursor position.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.backward_cursor_position] for details.
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean backwardVisibleCursorPosition()  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_cursor_position(asCPointer());
    }

    /**
     * Moves up to &#64;count visible cursor positions.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.backward_cursor_position] for details.
     * @param count number of positions to move
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean backwardVisibleCursorPositions(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_cursor_positions(asCPointer(), count);
    }

    /**
     * Moves &#64;iter to the start of the previous visible line.
     * <br>
     * <br>Returns %TRUE if
     * <br>&#64;iter could be moved; i.e. if &#64;iter was at character offset 0, this
     * <br>function returns %FALSE. Therefore if &#64;iter was already on line 0,
     * <br>but not at the start of the line, &#64;iter is snapped to the start of
     * <br>the line and the function returns %TRUE. (Note that this implies that
     * <br>in a loop calling this function, the line number may not change on
     * <br>every iteration, if your first iteration is on line 0.)
     * @return whether &#64;iter moved
    */
    public boolean backwardVisibleLine()  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_line(asCPointer());
    }

    /**
     * Moves &#64;count visible lines backward, if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer, moves to
     * <br>the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the iterator moved
     * <br>onto a dereferenceable position; if the iterator didn’t move, or
     * <br>moved onto the end iterator, then %FALSE is returned. If &#64;count is 0,
     * <br>the function does nothing and returns %FALSE. If &#64;count is negative,
     * <br>moves forward by 0 - &#64;count lines.
     * @param count number of lines to move backward
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean backwardVisibleLines(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_lines(asCPointer(), count);
    }

    /**
     * Moves backward to the previous visible word start.
     * <br>
     * <br>If &#64;iter is currently on a word start, moves backward to the
     * <br>next one after that.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language.
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardVisibleWordStart()  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_word_start(asCPointer());
    }

    /**
     * Calls gtk_text_iter_backward_visible_word_start() up to &#64;count times.
     * @param count number of times to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardVisibleWordStarts(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_visible_word_starts(asCPointer(), count);
    }

    /**
     * Moves backward to the previous word start.
     * <br>
     * <br>If &#64;iter is currently on a word start, moves backward to the
     * <br>next one after that.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardWordStart()  {
        return JnaTextIter.INST().gtk_text_iter_backward_word_start(asCPointer());
    }

    /**
     * Calls gtk_text_iter_backward_word_start() up to &#64;count times.
     * @param count number of times to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean backwardWordStarts(int count)  {
        return JnaTextIter.INST().gtk_text_iter_backward_word_starts(asCPointer(), count);
    }

    /**
     * Considering the default editability of the buffer, and tags that
     * <br>affect editability, determines whether text inserted at &#64;iter would
     * <br>be editable.
     * <br>
     * <br>If text inserted at &#64;iter would be editable then the
     * <br>user should be allowed to insert text at &#64;iter.
     * <br>[method&#64;Gtk.TextBuffer.insert_interactive] uses this function
     * <br>to decide whether insertions are allowed at a given position.
     * @param default_editability %TRUE if text is editable by default
     * @return whether text inserted at &#64;iter would be editable
    */
    public boolean canInsert(boolean default_editability)  {
        return JnaTextIter.INST().gtk_text_iter_can_insert(asCPointer(), default_editability);
    }

    /**
     * A qsort()-style function that returns negative if &#64;lhs is less than
     * <br>&#64;rhs, positive if &#64;lhs is greater than &#64;rhs, and 0 if they’re equal.
     * <br>
     * <br>Ordering is in character offset order, i.e. the first character
     * <br>in the buffer is less than the second character in the buffer.
     * @param rhs another `GtkTextIter`
     * @return -1 if &#64;lhs is less than &#64;rhs, 1 if &#64;lhs is greater, 0 if they are equal
    */
    public int compare(@Nonnull TextIter rhs)  {
        return JnaTextIter.INST().gtk_text_iter_compare(asCPointer(), asCPointerNotNull(rhs));
    }

    /**
     * Creates a dynamically-allocated copy of an iterator.
     * <br>
     * <br>This function is not useful in applications, because
     * <br>iterators can be copied with a simple assignment
     * <br>(`GtkTextIter i = j;`).
     * <br>
     * <br>The function is used by language bindings.
     * @return a copy of the &#64;iter, free with [method&#64;Gtk.TextIter.free]
    */
    public TextIter copy()  {
        return new TextIter(new PointerContainer(JnaTextIter.INST().gtk_text_iter_copy(asCPointer())));
    }

    /**
     * Returns whether the character at &#64;iter is within an editable region
     * <br>of text.
     * <br>
     * <br>Non-editable text is “locked” and can’t be changed by the
     * <br>user via `GtkTextView`. If no tags applied to this text affect
     * <br>editability, &#64;default_setting will be returned.
     * <br>
     * <br>You don’t want to use this function to decide whether text can be
     * <br>inserted at &#64;iter, because for insertion you don’t want to know
     * <br>whether the char at &#64;iter is inside an editable range, you want to
     * <br>know whether a new character inserted at &#64;iter would be inside an
     * <br>editable range. Use [method&#64;Gtk.TextIter.can_insert] to handle this
     * <br>case.
     * @param default_setting %TRUE if text is editable by default
     * @return whether &#64;iter is inside an editable range
    */
    public boolean editable(boolean default_setting)  {
        return JnaTextIter.INST().gtk_text_iter_editable(asCPointer(), default_setting);
    }

    /**
     * Returns %TRUE if &#64;iter points to the start of the paragraph
     * <br>delimiter characters for a line.
     * <br>
     * <br>Delimiters will be either a newline, a carriage return, a carriage
     * <br>return followed by a newline, or a Unicode paragraph separator
     * <br>character.
     * <br>
     * <br>Note that an iterator pointing to the &#92;n of a &#92;r&#92;n pair will not be
     * <br>counted as the end of a line, the line ends before the &#92;r. The end
     * <br>iterator is considered to be at the end of a line, even though there
     * <br>are no paragraph delimiter chars there.
     * @return whether &#64;iter is at the end of a line
    */
    public boolean endsLine()  {
        return JnaTextIter.INST().gtk_text_iter_ends_line(asCPointer());
    }

    /**
     * Determines whether &#64;iter ends a sentence.
     * <br>
     * <br>Sentence boundaries are determined by Pango and should
     * <br>be correct for nearly any language.
     * @return %TRUE if &#64;iter is at the end of a sentence.
    */
    public boolean endsSentence()  {
        return JnaTextIter.INST().gtk_text_iter_ends_sentence(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;tag is toggled off at exactly this point.
     * <br>
     * <br>If &#64;tag is %NULL, returns %TRUE if any tag is toggled off at this point.
     * <br>
     * <br>Note that if this function returns %TRUE, it means that
     * <br>&#64;iter is at the end of the tagged range, but that the character
     * <br>at &#64;iter is outside the tagged range. In other words,
     * <br>unlike [method&#64;Gtk.TextIter.starts_tag], if this function
     * <br>returns %TRUE, [method&#64;Gtk.TextIter.has_tag] will return
     * <br>%FALSE for the same parameters.
     * @param tag a `GtkTextTag`
     * @return whether &#64;iter is the end of a range tagged with &#64;tag
    */
    public boolean endsTag(@Nullable TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_ends_tag(asCPointer(), asCPointer(tag));
    }

    /**
     * Determines whether &#64;iter ends a natural-language word.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language.
     * @return %TRUE if &#64;iter is at the end of a word
    */
    public boolean endsWord()  {
        return JnaTextIter.INST().gtk_text_iter_ends_word(asCPointer());
    }

    /**
     * Tests whether two iterators are equal, using the fastest possible
     * <br>mechanism.
     * <br>
     * <br>This function is very fast; you can expect it to perform
     * <br>better than e.g. getting the character offset for each
     * <br>iterator and comparing the offsets yourself. Also, it’s a
     * <br>bit faster than [method&#64;Gtk.TextIter.compare].
     * @param rhs another `GtkTextIter`
     * @return %TRUE if the iterators point to the same place in the buffer
    */
    public boolean equal(@Nonnull TextIter rhs)  {
        return JnaTextIter.INST().gtk_text_iter_equal(asCPointer(), asCPointerNotNull(rhs));
    }

    /**
     * Moves &#64;iter forward by one character offset.
     * <br>
     * <br>Note that images embedded in the buffer occupy 1 character slot, so
     * <br>this function may actually move onto an image instead of a character,
     * <br>if you have images in your buffer. If &#64;iter is the end iterator or
     * <br>one character before it, &#64;iter will now point at the end iterator,
     * <br>and this function returns %FALSE for convenience when writing loops.
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean forwardChar()  {
        return JnaTextIter.INST().gtk_text_iter_forward_char(asCPointer());
    }

    /**
     * Moves &#64;count characters if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer,
     * <br>moves to the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the new position of
     * <br>&#64;iter is different from its original position, and dereferenceable
     * <br>(the last iterator in the buffer is not dereferenceable). If &#64;count
     * <br>is 0, the function does nothing and returns %FALSE.
     * @param count number of characters to move, may be negative
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean forwardChars(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_chars(asCPointer(), count);
    }

    /**
     * Moves &#64;iter forward by a single cursor position.
     * <br>
     * <br>Cursor positions are (unsurprisingly) positions where the
     * <br>cursor can appear. Perhaps surprisingly, there may not be
     * <br>a cursor position between all characters. The most common
     * <br>example for European languages would be a carriage return/newline
     * <br>sequence.
     * <br>
     * <br>For some Unicode characters, the equivalent of say the letter “a”
     * <br>with an accent mark will be represented as two characters, first
     * <br>the letter then a &quot;combining mark&quot; that causes the accent to be
     * <br>rendered; so the cursor can’t go between those two characters.
     * <br>
     * <br>See also the [struct&#64;Pango.LogAttr] struct and the [func&#64;Pango.break]
     * <br>function.
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean forwardCursorPosition()  {
        return JnaTextIter.INST().gtk_text_iter_forward_cursor_position(asCPointer());
    }

    /**
     * Moves up to &#64;count cursor positions.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.forward_cursor_position] for details.
     * @param count number of positions to move
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean forwardCursorPositions(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_cursor_positions(asCPointer(), count);
    }

    /**
     * Advances &#64;iter, calling &#64;pred on each character.
     * <br>
     * <br>If &#64;pred returns %TRUE, returns %TRUE and stops scanning.
     * <br>If &#64;pred never returns %TRUE, &#64;iter is set to &#64;limit if
     * <br>&#64;limit is non-%NULL, otherwise to the end iterator.
     * @param pred a function to be called on each character
     * @param user_data user data for &#64;pred
     * @param limit search limit
     * @return whether a match was found
    */
    public boolean forwardFindChar(OnTextCharPredicate pred, @Nullable ch.bailu.gtk.type.Pointer user_data, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_forward_find_char(asCPointer(), toOnTextCharPredicate(this, "forwardFindChar", pred), asCPointer(user_data), asCPointer(limit));
    }

    /**
     * Moves &#64;iter to the start of the next line.
     * <br>
     * <br>If the iter is already on the last line of the buffer,
     * <br>moves the iter to the end of the current line. If after
     * <br>the operation, the iter is at the end of the buffer and not
     * <br>dereferenceable, returns %FALSE. Otherwise, returns %TRUE.
     * @return whether &#64;iter can be dereferenced
    */
    public boolean forwardLine()  {
        return JnaTextIter.INST().gtk_text_iter_forward_line(asCPointer());
    }

    /**
     * Moves &#64;count lines forward, if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer, moves to
     * <br>the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the iterator moved
     * <br>onto a dereferenceable position; if the iterator didn’t move, or
     * <br>moved onto the end iterator, then %FALSE is returned. If &#64;count is 0,
     * <br>the function does nothing and returns %FALSE. If &#64;count is negative,
     * <br>moves backward by 0 - &#64;count lines.
     * @param count number of lines to move forward
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean forwardLines(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_lines(asCPointer(), count);
    }

    /**
     * Searches forward for &#64;str.
     * <br>
     * <br>Any match is returned by setting &#64;match_start to the first character
     * <br>of the match and &#64;match_end to the first character after the match.
     * <br>The search will not continue past &#64;limit. Note that a search is a
     * <br>linear or O(n) operation, so you may wish to use &#64;limit to avoid
     * <br>locking up your UI on large buffers.
     * <br>
     * <br>&#64;match_start will never be set to a `GtkTextIter` located before &#64;iter,
     * <br>even if there is a possible &#64;match_end after or at &#64;iter.
     * @param str a search string
     * @param flags flags affecting how the search is done
     * @param match_start return location for start of match
     * @param match_end return location for end of match
     * @param limit location of last possible &#64;match_end, or %NULL for the end of the buffer
     * @return whether a match was found
    */
    public boolean forwardSearch(@Nonnull ch.bailu.gtk.type.Str str, int flags, @Nullable TextIter match_start, @Nullable TextIter match_end, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_forward_search(asCPointer(), asCPointerNotNull(str), flags, asCPointer(match_start), asCPointer(match_end), asCPointer(limit));
    }

    /**
     * Searches forward for &#64;str.
     * <br>
     * <br>Any match is returned by setting &#64;match_start to the first character
     * <br>of the match and &#64;match_end to the first character after the match.
     * <br>The search will not continue past &#64;limit. Note that a search is a
     * <br>linear or O(n) operation, so you may wish to use &#64;limit to avoid
     * <br>locking up your UI on large buffers.
     * <br>
     * <br>&#64;match_start will never be set to a `GtkTextIter` located before &#64;iter,
     * <br>even if there is a possible &#64;match_end after or at &#64;iter.
     * @param str a search string
     * @param flags flags affecting how the search is done
     * @param match_start return location for start of match
     * @param match_end return location for end of match
     * @param limit location of last possible &#64;match_end, or %NULL for the end of the buffer
     * @return whether a match was found
    */
    public boolean forwardSearch(String str, int flags, @Nullable TextIter match_start, @Nullable TextIter match_end, @Nullable TextIter limit)  {
        return JnaTextIter.INST().gtk_text_iter_forward_search(asCPointer(), str, flags, asCPointer(match_start), asCPointer(match_end), asCPointer(limit));
    }

    /**
     * Moves forward to the next sentence end.
     * <br>
     * <br>If &#64;iter is at the end of a sentence, moves to the next
     * <br>end of sentence.
     * <br>
     * <br>Sentence boundaries are determined by Pango and should
     * <br>be correct for nearly any language.
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardSentenceEnd()  {
        return JnaTextIter.INST().gtk_text_iter_forward_sentence_end(asCPointer());
    }

    /**
     * Calls gtk_text_iter_forward_sentence_end() &#64;count times.
     * <br>
     * <br>If &#64;count is negative, moves backward instead of forward.
     * @param count number of sentences to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardSentenceEnds(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_sentence_ends(asCPointer(), count);
    }

    /**
     * Moves &#64;iter forward to the “end iterator”, which points
     * <br>one past the last valid character in the buffer.
     * <br>
     * <br>gtk_text_iter_get_char() called on the end iterator
     * <br>returns 0, which is convenient for writing loops.
    */
    public void forwardToEnd()  {
        JnaTextIter.INST().gtk_text_iter_forward_to_end(asCPointer());
    }

    /**
     * Moves the iterator to point to the paragraph delimiter characters.
     * <br>
     * <br>The possible characters are either a newline, a carriage return,
     * <br>a carriage return/newline in sequence, or the Unicode paragraph
     * <br>separator character.
     * <br>
     * <br>If the iterator is already at the paragraph delimiter
     * <br>characters, moves to the paragraph delimiter characters for the
     * <br>next line. If &#64;iter is on the last line in the buffer, which does
     * <br>not end in paragraph delimiters, moves to the end iterator (end of
     * <br>the last line), and returns %FALSE.
     * @return %TRUE if we moved and the new location is not the end iterator
    */
    public boolean forwardToLineEnd()  {
        return JnaTextIter.INST().gtk_text_iter_forward_to_line_end(asCPointer());
    }

    /**
     * Moves forward to the next toggle (on or off) of the
     * <br>&#64;tag, or to the next toggle of any tag if
     * <br>&#64;tag is %NULL.
     * <br>
     * <br>If no matching tag toggles are found,
     * <br>returns %FALSE, otherwise %TRUE. Does not return toggles
     * <br>located at &#64;iter, only toggles after &#64;iter. Sets &#64;iter to
     * <br>the location of the toggle, or to the end of the buffer
     * <br>if no toggle is found.
     * @param tag a `GtkTextTag`
     * @return whether we found a tag toggle after &#64;iter
    */
    public boolean forwardToTagToggle(@Nullable TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_forward_to_tag_toggle(asCPointer(), asCPointer(tag));
    }

    /**
     * Moves &#64;iter forward to the next visible cursor position.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.forward_cursor_position] for details.
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean forwardVisibleCursorPosition()  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_cursor_position(asCPointer());
    }

    /**
     * Moves up to &#64;count visible cursor positions.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.forward_cursor_position] for details.
     * @param count number of positions to move
     * @return %TRUE if we moved and the new position is dereferenceable
    */
    public boolean forwardVisibleCursorPositions(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_cursor_positions(asCPointer(), count);
    }

    /**
     * Moves &#64;iter to the start of the next visible line.
     * <br>
     * <br>Returns %TRUE if there
     * <br>was a next line to move to, and %FALSE if &#64;iter was simply moved to
     * <br>the end of the buffer and is now not dereferenceable, or if &#64;iter was
     * <br>already at the end of the buffer.
     * @return whether &#64;iter can be dereferenced
    */
    public boolean forwardVisibleLine()  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_line(asCPointer());
    }

    /**
     * Moves &#64;count visible lines forward, if possible.
     * <br>
     * <br>If &#64;count would move past the start or end of the buffer, moves to
     * <br>the start or end of the buffer.
     * <br>
     * <br>The return value indicates whether the iterator moved
     * <br>onto a dereferenceable position; if the iterator didn’t move, or
     * <br>moved onto the end iterator, then %FALSE is returned. If &#64;count is 0,
     * <br>the function does nothing and returns %FALSE. If &#64;count is negative,
     * <br>moves backward by 0 - &#64;count lines.
     * @param count number of lines to move forward
     * @return whether &#64;iter moved and is dereferenceable
    */
    public boolean forwardVisibleLines(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_lines(asCPointer(), count);
    }

    /**
     * Moves forward to the next visible word end.
     * <br>
     * <br>If &#64;iter is currently on a word end, moves forward to the
     * <br>next one after that.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardVisibleWordEnd()  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_word_end(asCPointer());
    }

    /**
     * Calls gtk_text_iter_forward_visible_word_end() up to &#64;count times.
     * @param count number of times to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardVisibleWordEnds(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_visible_word_ends(asCPointer(), count);
    }

    /**
     * Moves forward to the next word end.
     * <br>
     * <br>If &#64;iter is currently on a word end, moves forward to the
     * <br>next one after that.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language.
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardWordEnd()  {
        return JnaTextIter.INST().gtk_text_iter_forward_word_end(asCPointer());
    }

    /**
     * Calls gtk_text_iter_forward_word_end() up to &#64;count times.
     * @param count number of times to move
     * @return %TRUE if &#64;iter moved and is not the end iterator
    */
    public boolean forwardWordEnds(int count)  {
        return JnaTextIter.INST().gtk_text_iter_forward_word_ends(asCPointer(), count);
    }

    /**
     * Free an iterator allocated on the heap.
     * <br>
     * <br>This function is intended for use in language bindings,
     * <br>and is not especially useful for applications, because
     * <br>iterators can simply be allocated on the stack.
    */
    public void free()  {
        JnaTextIter.INST().gtk_text_iter_free(asCPointer());
    }

    /**
     * Returns the `GtkTextBuffer` this iterator is associated with.
     * @return the buffer
    */
    public TextBuffer getBuffer()  {
        return new TextBuffer(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_buffer(asCPointer())));
    }

    /**
     * Returns the number of bytes in the line containing &#64;iter,
     * <br>including the paragraph delimiters.
     * @return number of bytes in the line
    */
    public int getBytesInLine()  {
        return JnaTextIter.INST().gtk_text_iter_get_bytes_in_line(asCPointer());
    }

    /**
     * The Unicode character at this iterator is returned.
     * <br>
     * <br>Equivalent to operator* on a C++ iterator. If the element at
     * <br>this iterator is a non-character element, such as an image
     * <br>embedded in the buffer, the Unicode “unknown” character 0xFFFC
     * <br>is returned. If invoked on the end iterator, zero is returned;
     * <br>zero is not a valid Unicode character.
     * <br>
     * <br>So you can write a loop which ends when this function returns 0.
     * @return a Unicode character, or 0 if &#64;iter is not dereferenceable
    */
    public byte getChar()  {
        return JnaTextIter.INST().gtk_text_iter_get_char(asCPointer());
    }

    /**
     * Returns the number of characters in the line containing &#64;iter,
     * <br>including the paragraph delimiters.
     * @return number of characters in the line
    */
    public int getCharsInLine()  {
        return JnaTextIter.INST().gtk_text_iter_get_chars_in_line(asCPointer());
    }

    /**
     * If the location at &#64;iter contains a child anchor, the
     * <br>anchor is returned.
     * <br>
     * <br>Otherwise, %NULL is returned.
     * @return the anchor at &#64;iter
    */
    public TextChildAnchor getChildAnchor()  {
        return new TextChildAnchor(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_child_anchor(asCPointer())));
    }

    /**
     * Returns the language in effect at &#64;iter.
     * <br>
     * <br>If no tags affecting language apply to &#64;iter, the return
     * <br>value is identical to that of [func&#64;Gtk.get_default_language].
     * @return language in effect at &#64;iter
    */
    public ch.bailu.gtk.pango.Language getLanguage()  {
        return new ch.bailu.gtk.pango.Language(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_language(asCPointer())));
    }

    /**
     * Returns the line number containing the iterator.
     * <br>
     * <br>Lines in a `GtkTextBuffer` are numbered beginning
     * <br>with 0 for the first line in the buffer.
     * @return a line number
    */
    public int getLine()  {
        return JnaTextIter.INST().gtk_text_iter_get_line(asCPointer());
    }

    /**
     * Returns the byte index of the iterator, counting
     * <br>from the start of a newline-terminated line.
     * <br>
     * <br>Remember that `GtkTextBuffer` encodes text in
     * <br>UTF-8, and that characters can require a variable
     * <br>number of bytes to represent.
     * @return distance from start of line, in bytes
    */
    public int getLineIndex()  {
        return JnaTextIter.INST().gtk_text_iter_get_line_index(asCPointer());
    }

    /**
     * Returns the character offset of the iterator,
     * <br>counting from the start of a newline-terminated line.
     * <br>
     * <br>The first character on the line has offset 0.
     * @return offset from start of line
    */
    public int getLineOffset()  {
        return JnaTextIter.INST().gtk_text_iter_get_line_offset(asCPointer());
    }

    /**
     * Returns a list of all `GtkTextMark` at this location.
     * <br>
     * <br>Because marks are not iterable (they don’t take up any &quot;space&quot;
     * <br>in the buffer, they are just marks in between iterable locations),
     * <br>multiple marks can exist in the same place.
     * <br>
     * <br>The returned list is not in any meaningful order.
     * @return    list of `GtkTextMark`
    */
    public ch.bailu.gtk.glib.SList getMarks()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_marks(asCPointer())));
    }

    /**
     * Returns the character offset of an iterator.
     * <br>
     * <br>Each character in a `GtkTextBuffer` has an offset,
     * <br>starting with 0 for the first character in the buffer.
     * <br>Use [method&#64;Gtk,TextBuffer.get_iter_at_offset] to convert
     * <br>an offset back into an iterator.
     * @return a character offset
    */
    public int getOffset()  {
        return JnaTextIter.INST().gtk_text_iter_get_offset(asCPointer());
    }

    /**
     * If the element at &#64;iter is a paintable, the paintable is returned.
     * <br>
     * <br>Otherwise, %NULL is returned.
     * @return the paintable at &#64;iter
    */
    public ch.bailu.gtk.gdk.Paintable getPaintable()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_paintable(asCPointer())));
    }

    /**
     * Returns the text in the given range.
     * <br>
     * <br>A “slice” is an array of characters encoded in UTF-8 format,
     * <br>including the Unicode “unknown” character 0xFFFC for iterable
     * <br>non-character elements in the buffer, such as images.
     * <br>Because images are encoded in the slice, byte and
     * <br>character offsets in the returned array will correspond to byte
     * <br>offsets in the text buffer. Note that 0xFFFC can occur in normal
     * <br>text as well, so it is not a reliable indicator that a paintable or
     * <br>widget is in the buffer.
     * @param end iterator at end of a range
     * @return slice of text from the buffer
    */
    public ch.bailu.gtk.type.Str getSlice(@Nonnull TextIter end)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_slice(asCPointer(), asCPointerNotNull(end))));
    }

    /**
     * Returns a list of tags that apply to &#64;iter, in ascending order of
     * <br>priority.
     * <br>
     * <br>The highest-priority tags are last.
     * <br>
     * <br>The `GtkTextTag`s in the list don’t have a reference added,
     * <br>but you have to free the list itself.
     * @return list of   `GtkTextTag`
    */
    public ch.bailu.gtk.glib.SList getTags()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_tags(asCPointer())));
    }

    /**
     * Returns text in the given range.
     * <br>
     * <br>If the range
     * <br>contains non-text elements such as images, the character and byte
     * <br>offsets in the returned string will not correspond to character and
     * <br>byte offsets in the buffer. If you want offsets to correspond, see
     * <br>[method&#64;Gtk.TextIter.get_slice].
     * @param end iterator at end of a range
     * @return array of characters from the buffer
    */
    public ch.bailu.gtk.type.Str getText(@Nonnull TextIter end)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_text(asCPointer(), asCPointerNotNull(end))));
    }

    /**
     * Returns a list of `GtkTextTag` that are toggled on or off at this
     * <br>point.
     * <br>
     * <br>If &#64;toggled_on is %TRUE, the list contains tags that are
     * <br>toggled on. If a tag is toggled on at &#64;iter, then some non-empty
     * <br>range of characters following &#64;iter has that tag applied to it.  If
     * <br>a tag is toggled off, then some non-empty range following &#64;iter
     * <br>does not have the tag applied to it.
     * @param toggled_on %TRUE to get toggled-on tags
     * @return tags   toggled at this point
    */
    public ch.bailu.gtk.glib.SList getToggledTags(boolean toggled_on)  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_toggled_tags(asCPointer(), toggled_on)));
    }

    /**
     * Returns the number of bytes from the start of the
     * <br>line to the given &#64;iter, not counting bytes that
     * <br>are invisible due to tags with the “invisible” flag
     * <br>toggled on.
     * @return byte index of &#64;iter with respect to the start of the line
    */
    public int getVisibleLineIndex()  {
        return JnaTextIter.INST().gtk_text_iter_get_visible_line_index(asCPointer());
    }

    /**
     * Returns the offset in characters from the start of the
     * <br>line to the given &#64;iter, not counting characters that
     * <br>are invisible due to tags with the “invisible” flag
     * <br>toggled on.
     * @return offset in visible characters from the start of the line
    */
    public int getVisibleLineOffset()  {
        return JnaTextIter.INST().gtk_text_iter_get_visible_line_offset(asCPointer());
    }

    /**
     * Returns visible text in the given range.
     * <br>
     * <br>Like [method&#64;Gtk.TextIter.get_slice], but invisible text
     * <br>is not included. Invisible text is usually invisible because
     * <br>a `GtkTextTag` with the “invisible” attribute turned on has
     * <br>been applied to it.
     * @param end iterator at end of range
     * @return slice of text from the buffer
    */
    public ch.bailu.gtk.type.Str getVisibleSlice(@Nonnull TextIter end)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_visible_slice(asCPointer(), asCPointerNotNull(end))));
    }

    /**
     * Returns visible text in the given range.
     * <br>
     * <br>Like [method&#64;Gtk.TextIter.get_text], but invisible text
     * <br>is not included. Invisible text is usually invisible because
     * <br>a `GtkTextTag` with the “invisible” attribute turned on has
     * <br>been applied to it.
     * @param end iterator at end of range
     * @return string containing visible text in the range
    */
    public ch.bailu.gtk.type.Str getVisibleText(@Nonnull TextIter end)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextIter.INST().gtk_text_iter_get_visible_text(asCPointer(), asCPointerNotNull(end))));
    }

    /**
     * Returns %TRUE if &#64;iter points to a character that is part
     * <br>of a range tagged with &#64;tag.
     * <br>
     * <br>See also [method&#64;Gtk.TextIter.starts_tag] and
     * <br>[method&#64;Gtk.TextIter.ends_tag].
     * @param tag a `GtkTextTag`
     * @return whether &#64;iter is tagged with &#64;tag
    */
    public boolean hasTag(@Nonnull TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_has_tag(asCPointer(), asCPointerNotNull(tag));
    }

    /**
     * Checks whether &#64;iter falls in the range [&#64;start, &#64;end).
     * <br>
     * <br>&#64;start and &#64;end must be in ascending order.
     * @param start start of range
     * @param end end of range
     * @return %TRUE if &#64;iter is in the range
    */
    public boolean inRange(@Nonnull TextIter start, @Nonnull TextIter end)  {
        return JnaTextIter.INST().gtk_text_iter_in_range(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Determines whether &#64;iter is inside a sentence (as opposed to in
     * <br>between two sentences, e.g. after a period and before the first
     * <br>letter of the next sentence).
     * <br>
     * <br>Sentence boundaries are determined by Pango and should be correct
     * <br>for nearly any language.
     * @return %TRUE if &#64;iter is inside a sentence.
    */
    public boolean insideSentence()  {
        return JnaTextIter.INST().gtk_text_iter_inside_sentence(asCPointer());
    }

    /**
     * Determines whether the character pointed by &#64;iter is part of a
     * <br>natural-language word (as opposed to say inside some whitespace).
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language.
     * <br>
     * <br>Note that if [method&#64;Gtk.TextIter.starts_word] returns %TRUE,
     * <br>then this function returns %TRUE too, since &#64;iter points to
     * <br>the first character of the word.
     * @return %TRUE if &#64;iter is inside a word
    */
    public boolean insideWord()  {
        return JnaTextIter.INST().gtk_text_iter_inside_word(asCPointer());
    }

    /**
     * Determine if &#64;iter is at a cursor position.
     * <br>
     * <br>See [method&#64;Gtk.TextIter.forward_cursor_position] or
     * <br>[struct&#64;Pango.LogAttr] or [func&#64;Pango.break] for details
     * <br>on what a cursor position is.
     * @return %TRUE if the cursor can be placed at &#64;iter
    */
    public boolean isCursorPosition()  {
        return JnaTextIter.INST().gtk_text_iter_is_cursor_position(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;iter is the end iterator.
     * <br>
     * <br>This means it is one past the last dereferenceable iterator
     * <br>in the buffer. gtk_text_iter_is_end() is the most efficient
     * <br>way to check whether an iterator is the end iterator.
     * @return whether &#64;iter is the end iterator
    */
    public boolean isEnd()  {
        return JnaTextIter.INST().gtk_text_iter_is_end(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;iter is the first iterator in the buffer.
     * @return whether &#64;iter is the first in the buffer
    */
    public boolean isStart()  {
        return JnaTextIter.INST().gtk_text_iter_is_start(asCPointer());
    }

    /**
     * Swaps the value of &#64;first and &#64;second if &#64;second comes before
     * <br>&#64;first in the buffer.
     * <br>
     * <br>That is, ensures that &#64;first and &#64;second are in sequence.
     * <br>Most text buffer functions that take a range call this
     * <br>automatically on your behalf, so there’s no real reason to
     * <br>call it yourself in those cases. There are some exceptions,
     * <br>such as [method&#64;Gtk.TextIter.in_range], that expect a
     * <br>pre-sorted range.
     * @param second another `GtkTextIter`
    */
    public void order(@Nonnull TextIter second)  {
        JnaTextIter.INST().gtk_text_iter_order(asCPointer(), asCPointerNotNull(second));
    }

    /**
     * Moves iterator &#64;iter to the start of the line &#64;line_number.
     * <br>
     * <br>If &#64;line_number is negative or larger than or equal to the number of lines
     * <br>in the buffer, moves &#64;iter to the start of the last line in the buffer.
     * @param line_number line number (counted from 0)
    */
    public void setLine(int line_number)  {
        JnaTextIter.INST().gtk_text_iter_set_line(asCPointer(), line_number);
    }

    /**
     * Same as gtk_text_iter_set_line_offset(), but works with a
     * <br>byte index. The given byte index must be at
     * <br>the start of a character, it can’t be in the middle of a UTF-8
     * <br>encoded character.
     * @param byte_on_line a byte index relative to the start of &#64;iter’s current line
    */
    public void setLineIndex(int byte_on_line)  {
        JnaTextIter.INST().gtk_text_iter_set_line_index(asCPointer(), byte_on_line);
    }

    /**
     * Moves &#64;iter within a line, to a new character (not byte) offset.
     * <br>
     * <br>The given character offset must be less than or equal to the number
     * <br>of characters in the line; if equal, &#64;iter moves to the start of the
     * <br>next line. See [method&#64;Gtk.TextIter.set_line_index] if you have a byte
     * <br>index rather than a character offset.
     * @param char_on_line a character offset relative to the start of &#64;iter’s current line
    */
    public void setLineOffset(int char_on_line)  {
        JnaTextIter.INST().gtk_text_iter_set_line_offset(asCPointer(), char_on_line);
    }

    /**
     * Sets &#64;iter to point to &#64;char_offset.
     * <br>
     * <br>&#64;char_offset counts from the start
     * <br>of the entire text buffer, starting with 0.
     * @param char_offset a character number
    */
    public void setOffset(int char_offset)  {
        JnaTextIter.INST().gtk_text_iter_set_offset(asCPointer(), char_offset);
    }

    /**
     * Like gtk_text_iter_set_line_index(), but the index is in visible
     * <br>bytes, i.e. text with a tag making it invisible is not counted
     * <br>in the index.
     * @param byte_on_line a byte index
    */
    public void setVisibleLineIndex(int byte_on_line)  {
        JnaTextIter.INST().gtk_text_iter_set_visible_line_index(asCPointer(), byte_on_line);
    }

    /**
     * Like gtk_text_iter_set_line_offset(), but the offset is in visible
     * <br>characters, i.e. text with a tag making it invisible is not
     * <br>counted in the offset.
     * @param char_on_line a character offset
    */
    public void setVisibleLineOffset(int char_on_line)  {
        JnaTextIter.INST().gtk_text_iter_set_visible_line_offset(asCPointer(), char_on_line);
    }

    /**
     * Returns %TRUE if &#64;iter begins a paragraph.
     * <br>
     * <br>This is the case if [method&#64;Gtk.TextIter.get_line_offset]
     * <br>would return 0. However this function is potentially more
     * <br>efficient than [method&#64;Gtk.TextIter.get_line_offset], because
     * <br>it doesn’t have to compute the offset, it just has to see
     * <br>whether it’s 0.
     * @return whether &#64;iter begins a line
    */
    public boolean startsLine()  {
        return JnaTextIter.INST().gtk_text_iter_starts_line(asCPointer());
    }

    /**
     * Determines whether &#64;iter begins a sentence.
     * <br>
     * <br>Sentence boundaries are determined by Pango and
     * <br>should be correct for nearly any language.
     * @return %TRUE if &#64;iter is at the start of a sentence.
    */
    public boolean startsSentence()  {
        return JnaTextIter.INST().gtk_text_iter_starts_sentence(asCPointer());
    }

    /**
     * Returns %TRUE if &#64;tag is toggled on at exactly this point.
     * <br>
     * <br>If &#64;tag is %NULL, returns %TRUE if any tag is toggled on at this point.
     * <br>
     * <br>Note that if this function returns %TRUE, it means that
     * <br>&#64;iter is at the beginning of the tagged range, and that the
     * <br>character at &#64;iter is inside the tagged range. In other
     * <br>words, unlike [method&#64;Gtk.TextIter.ends_tag], if
     * <br>this function returns %TRUE, [method&#64;Gtk.TextIter.has_tag
     * <br>will also return %TRUE for the same parameters.
     * @param tag a `GtkTextTag`
     * @return whether &#64;iter is the start of a range tagged with &#64;tag
    */
    public boolean startsTag(@Nullable TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_starts_tag(asCPointer(), asCPointer(tag));
    }

    /**
     * Determines whether &#64;iter begins a natural-language word.
     * <br>
     * <br>Word breaks are determined by Pango and should be correct
     * <br>for nearly any language.
     * @return %TRUE if &#64;iter is at the start of a word
    */
    public boolean startsWord()  {
        return JnaTextIter.INST().gtk_text_iter_starts_word(asCPointer());
    }

    /**
     * Gets whether a range with &#64;tag applied to it begins
     * <br>or ends at &#64;iter.
     * <br>
     * <br>This is equivalent to (gtk_text_iter_starts_tag() ||
     * <br>gtk_text_iter_ends_tag())
     * @param tag a `GtkTextTag`
     * @return whether &#64;tag is toggled on or off at &#64;iter
    */
    public boolean togglesTag(@Nullable TextTag tag)  {
        return JnaTextIter.INST().gtk_text_iter_toggles_tag(asCPointer(), asCPointer(tag));
    }

    public static long getTypeID() { 
        return JnaTextIter.INST().gtk_text_iter_get_type(); 
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
