/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoLogAttr` structure stores information about the attributes of a
 * <br>single character.
 * <p><a href="https://docs.gtk.org/Pango/struct.LogAttr.html">https://docs.gtk.org/Pango/struct.LogAttr.html</a></p>
*/
public class LogAttr extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LogAttr.class.getCanonicalName());
    }

    public LogAttr(PointerContainer pointer) {
        super(pointer);
    }

    public LogAttr() {
        super(cast(JnaLogAttr.allocateStructure()));
    }

    private JnaLogAttr.Fields _fields;
    
    JnaLogAttr.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLogAttr.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * if set, can break line in front of character
    */
    public static final String IS_LINE_BREAK = "is_line_break";

    /**
     * if set, can break line in front of character
    */
    public void setFieldIsLineBreak(int is_line_break) {
        toFields().is_line_break = is_line_break;
        toFields().writeField(IS_LINE_BREAK);
    }

    /**
     * if set, can break line in front of character
    */
    public int getFieldIsLineBreak() {
       toFields().readField(IS_LINE_BREAK);
       return toFields().is_line_break;
    } 

    /**
     * if set, must break line in front of character
    */
    public static final String IS_MANDATORY_BREAK = "is_mandatory_break";

    /**
     * if set, must break line in front of character
    */
    public void setFieldIsMandatoryBreak(int is_mandatory_break) {
        toFields().is_mandatory_break = is_mandatory_break;
        toFields().writeField(IS_MANDATORY_BREAK);
    }

    /**
     * if set, must break line in front of character
    */
    public int getFieldIsMandatoryBreak() {
       toFields().readField(IS_MANDATORY_BREAK);
       return toFields().is_mandatory_break;
    } 

    /**
     * if set, can break here when doing character wrapping
    */
    public static final String IS_CHAR_BREAK = "is_char_break";

    /**
     * if set, can break here when doing character wrapping
    */
    public void setFieldIsCharBreak(int is_char_break) {
        toFields().is_char_break = is_char_break;
        toFields().writeField(IS_CHAR_BREAK);
    }

    /**
     * if set, can break here when doing character wrapping
    */
    public int getFieldIsCharBreak() {
       toFields().readField(IS_CHAR_BREAK);
       return toFields().is_char_break;
    } 

    /**
     * is whitespace character
    */
    public static final String IS_WHITE = "is_white";

    /**
     * is whitespace character
    */
    public void setFieldIsWhite(int is_white) {
        toFields().is_white = is_white;
        toFields().writeField(IS_WHITE);
    }

    /**
     * is whitespace character
    */
    public int getFieldIsWhite() {
       toFields().readField(IS_WHITE);
       return toFields().is_white;
    } 

    /**
     * if set, cursor can appear in front of character.
     * <br>  i.e. this is a grapheme boundary, or the first character in the text.
     * <br>  This flag implements Unicode's
     * <br>  [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics.
    */
    public static final String IS_CURSOR_POSITION = "is_cursor_position";

    /**
     * if set, cursor can appear in front of character.
     * <br>  i.e. this is a grapheme boundary, or the first character in the text.
     * <br>  This flag implements Unicode's
     * <br>  [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics.
    */
    public void setFieldIsCursorPosition(int is_cursor_position) {
        toFields().is_cursor_position = is_cursor_position;
        toFields().writeField(IS_CURSOR_POSITION);
    }

    /**
     * if set, cursor can appear in front of character.
     * <br>  i.e. this is a grapheme boundary, or the first character in the text.
     * <br>  This flag implements Unicode's
     * <br>  [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics.
    */
    public int getFieldIsCursorPosition() {
       toFields().readField(IS_CURSOR_POSITION);
       return toFields().is_cursor_position;
    } 

    /**
     * is first character in a word
    */
    public static final String IS_WORD_START = "is_word_start";

    /**
     * is first character in a word
    */
    public void setFieldIsWordStart(int is_word_start) {
        toFields().is_word_start = is_word_start;
        toFields().writeField(IS_WORD_START);
    }

    /**
     * is first character in a word
    */
    public int getFieldIsWordStart() {
       toFields().readField(IS_WORD_START);
       return toFields().is_word_start;
    } 

    /**
     * is first non-word char after a word
     * <br>  Note that in degenerate cases, you could have both &#64;is_word_start
     * <br>  and &#64;is_word_end set for some character.
    */
    public static final String IS_WORD_END = "is_word_end";

    /**
     * is first non-word char after a word
     * <br>  Note that in degenerate cases, you could have both &#64;is_word_start
     * <br>  and &#64;is_word_end set for some character.
    */
    public void setFieldIsWordEnd(int is_word_end) {
        toFields().is_word_end = is_word_end;
        toFields().writeField(IS_WORD_END);
    }

    /**
     * is first non-word char after a word
     * <br>  Note that in degenerate cases, you could have both &#64;is_word_start
     * <br>  and &#64;is_word_end set for some character.
    */
    public int getFieldIsWordEnd() {
       toFields().readField(IS_WORD_END);
       return toFields().is_word_end;
    } 

    /**
     * is a sentence boundary.
     * <br>  There are two ways to divide sentences. The first assigns all
     * <br>  inter-sentence whitespace/control/format chars to some sentence,
     * <br>  so all chars are in some sentence; &#64;is_sentence_boundary denotes
     * <br>  the boundaries there. The second way doesn't assign
     * <br>  between-sentence spaces, etc. to any sentence, so
     * <br>  &#64;is_sentence_start/&#64;is_sentence_end mark the boundaries of those sentences.
    */
    public static final String IS_SENTENCE_BOUNDARY = "is_sentence_boundary";

    /**
     * is a sentence boundary.
     * <br>  There are two ways to divide sentences. The first assigns all
     * <br>  inter-sentence whitespace/control/format chars to some sentence,
     * <br>  so all chars are in some sentence; &#64;is_sentence_boundary denotes
     * <br>  the boundaries there. The second way doesn't assign
     * <br>  between-sentence spaces, etc. to any sentence, so
     * <br>  &#64;is_sentence_start/&#64;is_sentence_end mark the boundaries of those sentences.
    */
    public void setFieldIsSentenceBoundary(int is_sentence_boundary) {
        toFields().is_sentence_boundary = is_sentence_boundary;
        toFields().writeField(IS_SENTENCE_BOUNDARY);
    }

    /**
     * is a sentence boundary.
     * <br>  There are two ways to divide sentences. The first assigns all
     * <br>  inter-sentence whitespace/control/format chars to some sentence,
     * <br>  so all chars are in some sentence; &#64;is_sentence_boundary denotes
     * <br>  the boundaries there. The second way doesn't assign
     * <br>  between-sentence spaces, etc. to any sentence, so
     * <br>  &#64;is_sentence_start/&#64;is_sentence_end mark the boundaries of those sentences.
    */
    public int getFieldIsSentenceBoundary() {
       toFields().readField(IS_SENTENCE_BOUNDARY);
       return toFields().is_sentence_boundary;
    } 

    /**
     * is first character in a sentence
    */
    public static final String IS_SENTENCE_START = "is_sentence_start";

    /**
     * is first character in a sentence
    */
    public void setFieldIsSentenceStart(int is_sentence_start) {
        toFields().is_sentence_start = is_sentence_start;
        toFields().writeField(IS_SENTENCE_START);
    }

    /**
     * is first character in a sentence
    */
    public int getFieldIsSentenceStart() {
       toFields().readField(IS_SENTENCE_START);
       return toFields().is_sentence_start;
    } 

    /**
     * is first char after a sentence.
     * <br>  Note that in degenerate cases, you could have both &#64;is_sentence_start
     * <br>  and &#64;is_sentence_end set for some character. (e.g. no space after a
     * <br>  period, so the next sentence starts right away)
    */
    public static final String IS_SENTENCE_END = "is_sentence_end";

    /**
     * is first char after a sentence.
     * <br>  Note that in degenerate cases, you could have both &#64;is_sentence_start
     * <br>  and &#64;is_sentence_end set for some character. (e.g. no space after a
     * <br>  period, so the next sentence starts right away)
    */
    public void setFieldIsSentenceEnd(int is_sentence_end) {
        toFields().is_sentence_end = is_sentence_end;
        toFields().writeField(IS_SENTENCE_END);
    }

    /**
     * is first char after a sentence.
     * <br>  Note that in degenerate cases, you could have both &#64;is_sentence_start
     * <br>  and &#64;is_sentence_end set for some character. (e.g. no space after a
     * <br>  period, so the next sentence starts right away)
    */
    public int getFieldIsSentenceEnd() {
       toFields().readField(IS_SENTENCE_END);
       return toFields().is_sentence_end;
    } 

    /**
     * if set, backspace deletes one character
     * <br>  rather than the entire grapheme cluster. This field is only meaningful
     * <br>  on grapheme boundaries (where &#64;is_cursor_position is set). In some languages,
     * <br>  the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     * <br>  others, each decomposed character in the grapheme is a unit. In the default
     * <br>  implementation of [func&#64;break], this bit is set on all grapheme boundaries
     * <br>  except those following Latin, Cyrillic or Greek base characters.
    */
    public static final String BACKSPACE_DELETES_CHARACTER = "backspace_deletes_character";

    /**
     * if set, backspace deletes one character
     * <br>  rather than the entire grapheme cluster. This field is only meaningful
     * <br>  on grapheme boundaries (where &#64;is_cursor_position is set). In some languages,
     * <br>  the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     * <br>  others, each decomposed character in the grapheme is a unit. In the default
     * <br>  implementation of [func&#64;break], this bit is set on all grapheme boundaries
     * <br>  except those following Latin, Cyrillic or Greek base characters.
    */
    public void setFieldBackspaceDeletesCharacter(int backspace_deletes_character) {
        toFields().backspace_deletes_character = backspace_deletes_character;
        toFields().writeField(BACKSPACE_DELETES_CHARACTER);
    }

    /**
     * if set, backspace deletes one character
     * <br>  rather than the entire grapheme cluster. This field is only meaningful
     * <br>  on grapheme boundaries (where &#64;is_cursor_position is set). In some languages,
     * <br>  the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     * <br>  others, each decomposed character in the grapheme is a unit. In the default
     * <br>  implementation of [func&#64;break], this bit is set on all grapheme boundaries
     * <br>  except those following Latin, Cyrillic or Greek base characters.
    */
    public int getFieldBackspaceDeletesCharacter() {
       toFields().readField(BACKSPACE_DELETES_CHARACTER);
       return toFields().backspace_deletes_character;
    } 

    /**
     * is a whitespace character that can possibly be
     * <br>  expanded for justification purposes. (Since: 1.18)
    */
    public static final String IS_EXPANDABLE_SPACE = "is_expandable_space";

    /**
     * is a whitespace character that can possibly be
     * <br>  expanded for justification purposes. (Since: 1.18)
    */
    public void setFieldIsExpandableSpace(int is_expandable_space) {
        toFields().is_expandable_space = is_expandable_space;
        toFields().writeField(IS_EXPANDABLE_SPACE);
    }

    /**
     * is a whitespace character that can possibly be
     * <br>  expanded for justification purposes. (Since: 1.18)
    */
    public int getFieldIsExpandableSpace() {
       toFields().readField(IS_EXPANDABLE_SPACE);
       return toFields().is_expandable_space;
    } 

    /**
     * is a word boundary, as defined by UAX&#35;29.
     * <br>  More specifically, means that this is not a position in the middle of a word.
     * <br>  For example, both sides of a punctuation mark are considered word boundaries.
     * <br>  This flag is particularly useful when selecting text word-by-word. This flag
     * <br>  implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics. (Since: 1.22)
    */
    public static final String IS_WORD_BOUNDARY = "is_word_boundary";

    /**
     * is a word boundary, as defined by UAX&#35;29.
     * <br>  More specifically, means that this is not a position in the middle of a word.
     * <br>  For example, both sides of a punctuation mark are considered word boundaries.
     * <br>  This flag is particularly useful when selecting text word-by-word. This flag
     * <br>  implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics. (Since: 1.22)
    */
    public void setFieldIsWordBoundary(int is_word_boundary) {
        toFields().is_word_boundary = is_word_boundary;
        toFields().writeField(IS_WORD_BOUNDARY);
    }

    /**
     * is a word boundary, as defined by UAX&#35;29.
     * <br>  More specifically, means that this is not a position in the middle of a word.
     * <br>  For example, both sides of a punctuation mark are considered word boundaries.
     * <br>  This flag is particularly useful when selecting text word-by-word. This flag
     * <br>  implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     * <br>  semantics. (Since: 1.22)
    */
    public int getFieldIsWordBoundary() {
       toFields().readField(IS_WORD_BOUNDARY);
       return toFields().is_word_boundary;
    } 

    /**
     * when breaking lines before this char, insert a hyphen.
     * <br>  Since: 1.50
    */
    public static final String BREAK_INSERTS_HYPHEN = "break_inserts_hyphen";

    /**
     * when breaking lines before this char, insert a hyphen.
     * <br>  Since: 1.50
    */
    public void setFieldBreakInsertsHyphen(int break_inserts_hyphen) {
        toFields().break_inserts_hyphen = break_inserts_hyphen;
        toFields().writeField(BREAK_INSERTS_HYPHEN);
    }

    /**
     * when breaking lines before this char, insert a hyphen.
     * <br>  Since: 1.50
    */
    public int getFieldBreakInsertsHyphen() {
       toFields().readField(BREAK_INSERTS_HYPHEN);
       return toFields().break_inserts_hyphen;
    } 

    /**
     * when breaking lines before this char, remove the
     * <br>  preceding char. Since 1.50
    */
    public static final String BREAK_REMOVES_PRECEDING = "break_removes_preceding";

    /**
     * when breaking lines before this char, remove the
     * <br>  preceding char. Since 1.50
    */
    public void setFieldBreakRemovesPreceding(int break_removes_preceding) {
        toFields().break_removes_preceding = break_removes_preceding;
        toFields().writeField(BREAK_REMOVES_PRECEDING);
    }

    /**
     * when breaking lines before this char, remove the
     * <br>  preceding char. Since 1.50
    */
    public int getFieldBreakRemovesPreceding() {
       toFields().readField(BREAK_REMOVES_PRECEDING);
       return toFields().break_removes_preceding;
    } 

    /**
     * 
    */
    public static final String RESERVED = "reserved";

    /**
     * 
    */
    public void setFieldReserved(int reserved) {
        toFields().reserved = reserved;
        toFields().writeField(RESERVED);
    }

    /**
     * 
    */
    public int getFieldReserved() {
       toFields().readField(RESERVED);
       return toFields().reserved;
    } 

}

/*
record-type
all-fields-supported
*/
