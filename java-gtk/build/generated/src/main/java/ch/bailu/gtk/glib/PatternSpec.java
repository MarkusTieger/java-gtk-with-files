/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GPatternSpec struct is the 'compiled' form of a pattern. This
 * <br>structure is opaque and its fields cannot be accessed directly.
 * <p><a href="https://docs.gtk.org/glib/struct.PatternSpec.html">https://docs.gtk.org/glib/struct.PatternSpec.html</a></p>
*/
public class PatternSpec extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PatternSpec.class.getCanonicalName());
    }

    public PatternSpec(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Compiles a pattern to a &#35;GPatternSpec.
     * @param pattern a zero-terminated UTF-8 encoded string
    */
    public PatternSpec(@Nonnull ch.bailu.gtk.type.Str pattern) {
        super(cast(JnaPatternSpec.INST().g_pattern_spec_new(asCPointerNotNull(pattern))));
    }

    /**
     * Compiles a pattern to a &#35;GPatternSpec.
     * @param pattern a zero-terminated UTF-8 encoded string
    */
    public PatternSpec(String pattern) {
        super(cast(JnaPatternSpec.INST().g_pattern_spec_new(pattern)));
    }

    /**
     * Copies &#64;pspec in a new &#35;GPatternSpec.
     * @return a copy of &#64;pspec.
    */
    public PatternSpec copy()  {
        return new PatternSpec(new PointerContainer(JnaPatternSpec.INST().g_pattern_spec_copy(asCPointer())));
    }

    /**
     * Compares two compiled pattern specs and returns whether they will
     * <br>match the same set of strings.
     * @param pspec2 another &#35;GPatternSpec
     * @return Whether the compiled patterns are equal
    */
    public boolean equal(@Nonnull PatternSpec pspec2)  {
        return JnaPatternSpec.INST().g_pattern_spec_equal(asCPointer(), asCPointerNotNull(pspec2));
    }

    /**
     * Frees the memory allocated for the &#35;GPatternSpec.
    */
    public void free()  {
        JnaPatternSpec.INST().g_pattern_spec_free(asCPointer());
    }

    /**
     * Matches a string against a compiled pattern. Passing the correct
     * <br>length of the string given is mandatory. The reversed string can be
     * <br>omitted by passing %NULL, this is more efficient if the reversed
     * <br>version of the string to be matched is not at hand, as
     * <br>g_pattern_match() will only construct it if the compiled pattern
     * <br>requires reverse matches.
     * <br>
     * <br>Note that, if the user code will (possibly) match a string against a
     * <br>multitude of patterns containing wildcards, chances are high that
     * <br>some patterns will require a reversed string. In this case, it's
     * <br>more efficient to provide the reversed string to avoid multiple
     * <br>constructions thereof in the various calls to g_pattern_match().
     * <br>
     * <br>Note also that the reverse of a UTF-8 encoded string can in general
     * <br>not be obtained by g_strreverse(). This works only if the string
     * <br>does not contain any multibyte characters. GLib offers the
     * <br>g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     * @param string_length the length of &#64;string (in bytes, i.e. strlen(),     not g_utf8_strlen())
     * @param string the UTF-8 encoded string to match
     * @param string_reversed the reverse of &#64;string or %NULL
     * @return %TRUE if &#64;string matches &#64;pspec
    */
    public boolean match(long string_length, @Nonnull ch.bailu.gtk.type.Str string, @Nullable ch.bailu.gtk.type.Str string_reversed)  {
        return JnaPatternSpec.INST().g_pattern_spec_match(asCPointer(), string_length, asCPointerNotNull(string), asCPointer(string_reversed));
    }

    /**
     * Matches a string against a compiled pattern. Passing the correct
     * <br>length of the string given is mandatory. The reversed string can be
     * <br>omitted by passing %NULL, this is more efficient if the reversed
     * <br>version of the string to be matched is not at hand, as
     * <br>g_pattern_match() will only construct it if the compiled pattern
     * <br>requires reverse matches.
     * <br>
     * <br>Note that, if the user code will (possibly) match a string against a
     * <br>multitude of patterns containing wildcards, chances are high that
     * <br>some patterns will require a reversed string. In this case, it's
     * <br>more efficient to provide the reversed string to avoid multiple
     * <br>constructions thereof in the various calls to g_pattern_match().
     * <br>
     * <br>Note also that the reverse of a UTF-8 encoded string can in general
     * <br>not be obtained by g_strreverse(). This works only if the string
     * <br>does not contain any multibyte characters. GLib offers the
     * <br>g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     * @param string_length the length of &#64;string (in bytes, i.e. strlen(),     not g_utf8_strlen())
     * @param string the UTF-8 encoded string to match
     * @param string_reversed the reverse of &#64;string or %NULL
     * @return %TRUE if &#64;string matches &#64;pspec
    */
    public boolean match(long string_length, String string, String string_reversed)  {
        return JnaPatternSpec.INST().g_pattern_spec_match(asCPointer(), string_length, string, string_reversed);
    }

    /**
     * Matches a string against a compiled pattern. If the string is to be
     * <br>matched against more than one pattern, consider using
     * <br>g_pattern_match() instead while supplying the reversed string.
     * @param string the UTF-8 encoded string to match
     * @return %TRUE if &#64;string matches &#64;pspec
    */
    public boolean matchString(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaPatternSpec.INST().g_pattern_spec_match_string(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Matches a string against a compiled pattern. If the string is to be
     * <br>matched against more than one pattern, consider using
     * <br>g_pattern_match() instead while supplying the reversed string.
     * @param string the UTF-8 encoded string to match
     * @return %TRUE if &#64;string matches &#64;pspec
    */
    public boolean matchString(String string)  {
        return JnaPatternSpec.INST().g_pattern_spec_match_string(asCPointer(), string);
    }

    public static long getTypeID() { 
        return JnaPatternSpec.INST().g_pattern_spec_get_type(); 
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
