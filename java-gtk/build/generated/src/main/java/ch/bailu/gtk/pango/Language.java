/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoLanguage` structure is used to
 * <br>represent a language.
 * <br>
 * <br>`PangoLanguage` pointers can be efficiently
 * <br>copied and compared with each other.
 * <p><a href="https://docs.gtk.org/Pango/struct.Language.html">https://docs.gtk.org/Pango/struct.Language.html</a></p>
*/
public class Language extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Language.class.getCanonicalName());
    }

    public Language(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get a string that is representative of the characters needed to
     * <br>render a particular language.
     * <br>
     * <br>The sample text may be a pangram, but is not necessarily. It is chosen
     * <br>to be demonstrative of normal text in the language, as well as exposing
     * <br>font feature requirements unique to the language. It is suitable for use
     * <br>as sample text in a font selection dialog.
     * <br>
     * <br>If &#64;language is %NULL, the default language as found by
     * <br>[func&#64;Pango.Language.get_default] is used.
     * <br>
     * <br>If Pango does not have a sample string for &#64;language, the classic
     * <br>&quot;The quick brown fox...&quot; is returned.  This can be detected by
     * <br>comparing the returned pointer value to that returned for (non-existent)
     * <br>language code &quot;xx&quot;.  That is, compare to:
     * <br>
     * <br>```
     * <br>pango_language_get_sample_string (pango_language_from_string (&quot;xx&quot;))
     * <br>```
     * @return the sample string
    */
    public ch.bailu.gtk.type.Str getSampleString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLanguage.INST().pango_language_get_sample_string(asCPointer())));
    }

    /**
     * Determines if &#64;script is one of the scripts used to
     * <br>write &#64;language.
     * <br>
     * <br>The returned value is conservative; if nothing is known about
     * <br>the language tag &#64;language, %TRUE will be returned, since, as
     * <br>far as Pango knows, &#64;script might be used to write &#64;language.
     * <br>
     * <br>This routine is used in Pango's itemization process when
     * <br>determining if a supplied language tag is relevant to
     * <br>a particular section of text. It probably is not useful
     * <br>for applications in most circumstances.
     * <br>
     * <br>This function uses [method&#64;Pango.Language.get_scripts] internally.
     * @param script a `PangoScript`
     * @return %TRUE if &#64;script is one of the scripts used   to write &#64;language or if nothing is known about &#64;language   (including the case that &#64;language is %NULL), %FALSE otherwise.
    */
    public boolean includesScript(int script)  {
        return JnaLanguage.INST().pango_language_includes_script(asCPointer(), script);
    }

    /**
     * Checks if a language tag matches one of the elements in a list of
     * <br>language ranges.
     * <br>
     * <br>A language tag is considered to match a range in the list if the
     * <br>range is '*', the range is exactly the tag, or the range is a prefix
     * <br>of the tag, and the character after it in the tag is '-'.
     * @param range_list a list of language ranges, separated by ';', ':',   ',', or space characters.   Each element must either be '*', or a RFC 3066 language range   canonicalized as by [func&#64;Pango.Language.from_string]
     * @return %TRUE if a match was found
    */
    public boolean matches(@Nonnull ch.bailu.gtk.type.Str range_list)  {
        return JnaLanguage.INST().pango_language_matches(asCPointer(), asCPointerNotNull(range_list));
    }

    /**
     * Checks if a language tag matches one of the elements in a list of
     * <br>language ranges.
     * <br>
     * <br>A language tag is considered to match a range in the list if the
     * <br>range is '*', the range is exactly the tag, or the range is a prefix
     * <br>of the tag, and the character after it in the tag is '-'.
     * @param range_list a list of language ranges, separated by ';', ':',   ',', or space characters.   Each element must either be '*', or a RFC 3066 language range   canonicalized as by [func&#64;Pango.Language.from_string]
     * @return %TRUE if a match was found
    */
    public boolean matches(String range_list)  {
        return JnaLanguage.INST().pango_language_matches(asCPointer(), range_list);
    }

    /**
     * Gets the RFC-3066 format string representing the given language tag.
     * <br>
     * <br>Returns (transfer none): a string representing the language tag
     * @return 
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLanguage.INST().pango_language_to_string(asCPointer())));
    }

    /**
     * Convert a language tag to a `PangoLanguage`.
     * <br>
     * <br>The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
     * <br>can be efficiently copied (copy the pointer) and compared with other
     * <br>language tags (compare the pointer.)
     * <br>
     * <br>This function first canonicalizes the string by converting it to
     * <br>lowercase, mapping '_' to '-', and stripping all characters other
     * <br>than letters and '-'.
     * <br>
     * <br>Use [func&#64;Pango.Language.get_default] if you want to get the
     * <br>`PangoLanguage` for the current locale of the process.
     * @param language a string representing a language tag
     * @return a `PangoLanguage`
    */
    public static Language fromString(@Nullable ch.bailu.gtk.type.Str language)  {
        return new Language(new PointerContainer(JnaLanguage.INST().pango_language_from_string(asCPointer(language))));
    }

    /**
     * Returns the `PangoLanguage` for the current locale of the process.
     * <br>
     * <br>On Unix systems, this is the return value is derived from
     * <br>`setlocale (LC_CTYPE, NULL)`, and the user can
     * <br>affect this through the environment variables LC_ALL, LC_CTYPE or
     * <br>LANG (checked in that order). The locale string typically is in
     * <br>the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * <br>COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * <br>Swedish as written in Finland or pt_BR for Portuguese as written in
     * <br>Brazil.
     * <br>
     * <br>On Windows, the C library does not use any such environment
     * <br>variables, and setting them won't affect the behavior of functions
     * <br>like ctime(). The user sets the locale through the Regional Options
     * <br>in the Control Panel. The C library (in the setlocale() function)
     * <br>does not use country and language codes, but country and language
     * <br>names spelled out in English.
     * <br>However, this function does check the above environment
     * <br>variables, and does return a Unix-style locale string based on
     * <br>either said environment variables or the thread's current locale.
     * <br>
     * <br>Your application should call `setlocale(LC_ALL, &quot;&quot;)` for the user
     * <br>settings to take effect. GTK does this in its initialization
     * <br>functions automatically (by calling gtk_set_locale()).
     * <br>See the setlocale() manpage for more details.
     * <br>
     * <br>Note that the default language can change over the life of an application.
     * <br>
     * <br>Also note that this function will not do the right thing if you
     * <br>use per-thread locales with uselocale(). In that case, you should
     * <br>just call pango_language_from_string() yourself.
     * @return the default language as a `PangoLanguage`
    */
    public static Language getDefault()  {
        return new Language(new PointerContainer(JnaLanguage.INST().pango_language_get_default()));
    }

    public static long getTypeID() { 
        return JnaLanguage.INST().pango_language_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getScripts:[ParameterModel:java-type-not-supported:{G_::{c:const PangoScript*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getPreferred:[ParameterModel:java-type-not-supported:{G_::{c:PangoLanguage**}}:{j:}]]
*/
