/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface UnicodeBreakType {

    /**
     * Mandatory Break (BK)
    */
    int MANDATORY = 0;

    /**
     * Carriage Return (CR)
    */
    int CARRIAGE_RETURN = 1;

    /**
     * Line Feed (LF)
    */
    int LINE_FEED = 2;

    /**
     * Attached Characters and Combining Marks (CM)
    */
    int COMBINING_MARK = 3;

    /**
     * Surrogates (SG)
    */
    int SURROGATE = 4;

    /**
     * Zero Width Space (ZW)
    */
    int ZERO_WIDTH_SPACE = 5;

    /**
     * Inseparable (IN)
    */
    int INSEPARABLE = 6;

    /**
     * Non-breaking (&quot;Glue&quot;) (GL)
    */
    int NON_BREAKING_GLUE = 7;

    /**
     * Contingent Break Opportunity (CB)
    */
    int CONTINGENT = 8;

    /**
     * Space (SP)
    */
    int SPACE = 9;

    /**
     * Break Opportunity After (BA)
    */
    int AFTER = 10;

    /**
     * Break Opportunity Before (BB)
    */
    int BEFORE = 11;

    /**
     * Break Opportunity Before and After (B2)
    */
    int BEFORE_AND_AFTER = 12;

    /**
     * Hyphen (HY)
    */
    int HYPHEN = 13;

    /**
     * Nonstarter (NS)
    */
    int NON_STARTER = 14;

    /**
     * Opening Punctuation (OP)
    */
    int OPEN_PUNCTUATION = 15;

    /**
     * Closing Punctuation (CL)
    */
    int CLOSE_PUNCTUATION = 16;

    /**
     * Ambiguous Quotation (QU)
    */
    int QUOTATION = 17;

    /**
     * Exclamation/Interrogation (EX)
    */
    int EXCLAMATION = 18;

    /**
     * Ideographic (ID)
    */
    int IDEOGRAPHIC = 19;

    /**
     * Numeric (NU)
    */
    int NUMERIC = 20;

    /**
     * Infix Separator (Numeric) (IS)
    */
    int INFIX_SEPARATOR = 21;

    /**
     * Symbols Allowing Break After (SY)
    */
    int SYMBOL = 22;

    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
    */
    int ALPHABETIC = 23;

    /**
     * Prefix (Numeric) (PR)
    */
    int PREFIX = 24;

    /**
     * Postfix (Numeric) (PO)
    */
    int POSTFIX = 25;

    /**
     * Complex Content Dependent (South East Asian) (SA)
    */
    int COMPLEX_CONTEXT = 26;

    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
    */
    int AMBIGUOUS = 27;

    /**
     * Unknown (XX)
    */
    int UNKNOWN = 28;

    /**
     * Next Line (NL)
    */
    int NEXT_LINE = 29;

    /**
     * Word Joiner (WJ)
    */
    int WORD_JOINER = 30;

    /**
     * Hangul L Jamo (JL)
    */
    int HANGUL_L_JAMO = 31;

    /**
     * Hangul V Jamo (JV)
    */
    int HANGUL_V_JAMO = 32;

    /**
     * Hangul T Jamo (JT)
    */
    int HANGUL_T_JAMO = 33;

    /**
     * Hangul LV Syllable (H2)
    */
    int HANGUL_LV_SYLLABLE = 34;

    /**
     * Hangul LVT Syllable (H3)
    */
    int HANGUL_LVT_SYLLABLE = 35;

    /**
     * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
    */
    int CLOSE_PARANTHESIS = 36;

    /**
     * Closing Parenthesis (CP). Since 2.70
    */
    int CLOSE_PARENTHESIS = 36;

    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
    */
    int CONDITIONAL_JAPANESE_STARTER = 37;

    /**
     * Hebrew Letter (HL). Since: 2.32
    */
    int HEBREW_LETTER = 38;

    /**
     * Regional Indicator (RI). Since: 2.36
    */
    int REGIONAL_INDICATOR = 39;

    /**
     * Emoji Base (EB). Since: 2.50
    */
    int EMOJI_BASE = 40;

    /**
     * Emoji Modifier (EM). Since: 2.50
    */
    int EMOJI_MODIFIER = 41;

    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
    */
    int ZERO_WIDTH_JOINER = 42;

}

/*
enumeration-type
*/
