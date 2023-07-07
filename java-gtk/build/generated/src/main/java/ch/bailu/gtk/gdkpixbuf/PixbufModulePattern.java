/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The signature prefix for a module.
 * <br>
 * <br>The signature of a module is a set of prefixes. Prefixes are encoded as
 * <br>pairs of ordinary strings, where the second string, called the mask, if
 * <br>not `NULL`, must be of the same length as the first one and may contain
 * <br>' ', '!', 'x', 'z', and 'n' to indicate bytes that must be matched,
 * <br>not matched, &quot;don't-care&quot;-bytes, zeros and non-zeros, respectively.
 * <br>
 * <br>Each prefix has an associated integer that describes the relevance of
 * <br>the prefix, with 0 meaning a mismatch and 100 a &quot;perfect match&quot;.
 * <br>
 * <br>Starting with gdk-pixbuf 2.8, the first byte of the mask may be '*',
 * <br>indicating an unanchored pattern that matches not only at the beginning,
 * <br>but also in the middle. Versions prior to 2.8 will interpret the '*'
 * <br>like an 'x'.
 * <br>
 * <br>The signature of a module is stored as an array of
 * <br>`GdkPixbufModulePatterns`. The array is terminated by a pattern
 * <br>where the `prefix` is `NULL`.
 * <br>
 * <br>```c
 * <br>GdkPixbufModulePattern *signature[] = {
 * <br>  { &quot;abcdx&quot;, &quot; !x z&quot;, 100 },
 * <br>  { &quot;bla&quot;, NULL,  90 },
 * <br>  { NULL, NULL, 0 }
 * <br>};
 * <br>```
 * <br>
 * <br>In the example above, the signature matches e.g. &quot;auud&#92;0&quot; with
 * <br>relevance 100, and &quot;blau&quot; with relevance 90.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufModulePattern.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufModulePattern.html</a></p>
*/
public class PixbufModulePattern extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufModulePattern.class.getCanonicalName());
    }

    public PixbufModulePattern(PointerContainer pointer) {
        super(pointer);
    }

    public PixbufModulePattern() {
        super(cast(JnaPixbufModulePattern.allocateStructure()));
    }

    private JnaPixbufModulePattern.Fields _fields;
    
    JnaPixbufModulePattern.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufModulePattern.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the prefix for this pattern
    */
    public static final String PREFIX = "prefix";

    /**
     * the prefix for this pattern
    */
    public void setFieldPrefix(ch.bailu.gtk.type.Str prefix) {
        toFields().prefix = prefix.asCPointer();
        toFields().writeField(PREFIX);
    }

    /**
     * the prefix for this pattern
    */
    public ch.bailu.gtk.type.Str getFieldPrefix() {
       toFields().readField(PREFIX);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().prefix));
    } 

    /**
     * mask containing bytes which modify how the prefix is matched against
     * <br> test data
    */
    public static final String MASK = "mask";

    /**
     * mask containing bytes which modify how the prefix is matched against
     * <br> test data
    */
    public void setFieldMask(ch.bailu.gtk.type.Str mask) {
        toFields().mask = mask.asCPointer();
        toFields().writeField(MASK);
    }

    /**
     * mask containing bytes which modify how the prefix is matched against
     * <br> test data
    */
    public ch.bailu.gtk.type.Str getFieldMask() {
       toFields().readField(MASK);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().mask));
    } 

    /**
     * relevance of this pattern
    */
    public static final String RELEVANCE = "relevance";

    /**
     * relevance of this pattern
    */
    public void setFieldRelevance(int relevance) {
        toFields().relevance = relevance;
        toFields().writeField(RELEVANCE);
    }

    /**
     * relevance of this pattern
    */
    public int getFieldRelevance() {
       toFields().readField(RELEVANCE);
       return toFields().relevance;
    } 

}

/*
record-type
all-fields-supported
*/
