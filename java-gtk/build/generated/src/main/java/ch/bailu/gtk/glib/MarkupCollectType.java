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
public interface MarkupCollectType {

    /**
     * used to terminate the list of attributes
     * <br>    to collect
    */
    int INVALID = 0;

    /**
     * collect the string pointer directly from
     * <br>    the attribute_values[] array. Expects a parameter of type (const
     * <br>    char **). If %G_MARKUP_COLLECT_OPTIONAL is specified and the
     * <br>    attribute isn't present then the pointer will be set to %NULL
    */
    int STRING = 1;

    /**
     * as with %G_MARKUP_COLLECT_STRING, but
     * <br>    expects a parameter of type (char **) and g_strdup()s the
     * <br>    returned pointer. The pointer must be freed with g_free()
    */
    int STRDUP = 2;

    /**
     * expects a parameter of type (gboolean *)
     * <br>    and parses the attribute value as a boolean. Sets %FALSE if the
     * <br>    attribute isn't present. Valid boolean values consist of
     * <br>    (case-insensitive) &quot;false&quot;, &quot;f&quot;, &quot;no&quot;, &quot;n&quot;, &quot;0&quot; and &quot;true&quot;, &quot;t&quot;,
     * <br>    &quot;yes&quot;, &quot;y&quot;, &quot;1&quot;
    */
    int BOOLEAN = 3;

    /**
     * as with %G_MARKUP_COLLECT_BOOLEAN, but
     * <br>    in the case of a missing attribute a value is set that compares
     * <br>    equal to neither %FALSE nor %TRUE G_MARKUP_COLLECT_OPTIONAL is
     * <br>    implied
    */
    int TRISTATE = 4;

    /**
     * can be bitwise ORed with the other fields.
     * <br>    If present, allows the attribute not to appear. A default value
     * <br>    is set depending on what value type is used
    */
    int OPTIONAL = 65536;

}

/*
enumeration-type
*/
