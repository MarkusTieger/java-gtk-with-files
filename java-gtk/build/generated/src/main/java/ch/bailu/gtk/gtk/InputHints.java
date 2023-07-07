/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface InputHints {

    /**
     * No special behaviour suggested
    */
    int NONE = 0;

    /**
     * Suggest checking for typos
    */
    int SPELLCHECK = 1;

    /**
     * Suggest not checking for typos
    */
    int NO_SPELLCHECK = 2;

    /**
     * Suggest word completion
    */
    int WORD_COMPLETION = 4;

    /**
     * Suggest to convert all text to lowercase
    */
    int LOWERCASE = 8;

    /**
     * Suggest to capitalize all text
    */
    int UPPERCASE_CHARS = 16;

    /**
     * Suggest to capitalize the first
     * <br>  character of each word
    */
    int UPPERCASE_WORDS = 32;

    /**
     * Suggest to capitalize the
     * <br>  first word of each sentence
    */
    int UPPERCASE_SENTENCES = 64;

    /**
     * Suggest to not show an onscreen keyboard
     * <br>  (e.g for a calculator that already has all the keys).
    */
    int INHIBIT_OSK = 128;

    /**
     * The text is vertical
    */
    int VERTICAL_WRITING = 256;

    /**
     * Suggest offering Emoji support
    */
    int EMOJI = 512;

    /**
     * Suggest not offering Emoji support
    */
    int NO_EMOJI = 1024;

    /**
     * Request that the input method should not
     * <br>   update personalized data (like typing history)
    */
    int PRIVATE = 2048;

}

/*
enumeration-type
*/
