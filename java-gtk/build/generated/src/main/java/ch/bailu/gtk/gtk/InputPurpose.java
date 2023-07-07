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
public interface InputPurpose {

    /**
     * Allow any character
    */
    int FREE_FORM = 0;

    /**
     * Allow only alphabetic characters
    */
    int ALPHA = 1;

    /**
     * Allow only digits
    */
    int DIGITS = 2;

    /**
     * Edited field expects numbers
    */
    int NUMBER = 3;

    /**
     * Edited field expects phone number
    */
    int PHONE = 4;

    /**
     * Edited field expects URL
    */
    int URL = 5;

    /**
     * Edited field expects email address
    */
    int EMAIL = 6;

    /**
     * Edited field expects the name of a person
    */
    int NAME = 7;

    /**
     * Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden
    */
    int PASSWORD = 8;

    /**
     * Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden
    */
    int PIN = 9;

    /**
     * Allow any character, in addition to control codes
    */
    int TERMINAL = 10;

}

/*
enumeration-type
*/
