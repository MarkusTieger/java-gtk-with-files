/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Many URI schemes include one or more attribute/value pairs as part of the URI
 * <br>value. For example `scheme://server/path?query=string&amp;is=there` has two
 * <br>attributes – `query=string` and `is=there` – in its query part.
 * <br>
 * <br>A &#35;GUriParamsIter structure represents an iterator that can be used to
 * <br>iterate over the attribute/value pairs of a URI query string. &#35;GUriParamsIter
 * <br>structures are typically allocated on the stack and then initialized with
 * <br>g_uri_params_iter_init(). See the documentation for g_uri_params_iter_init()
 * <br>for a usage example.
 * <p><a href="https://docs.gtk.org/glib/struct.UriParamsIter.html">https://docs.gtk.org/glib/struct.UriParamsIter.html</a></p>
*/
public class UriParamsIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UriParamsIter.class.getCanonicalName());
    }

    public UriParamsIter(PointerContainer pointer) {
        super(pointer);
    }

    private JnaUriParamsIter.Fields _fields;
    
    JnaUriParamsIter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaUriParamsIter.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String DUMMY0 = "dummy0";

    /**
     * 
    */
    public int getFieldDummy0() {
       toFields().readField(DUMMY0);
       return toFields().dummy0;
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
     * Initializes an attribute/value pair iterator.
     * <br>
     * <br>The iterator keeps pointers to the &#64;params and &#64;separators arguments, those
     * <br>variables must thus outlive the iterator and not be modified during the
     * <br>iteration.
     * <br>
     * <br>If %G_URI_PARAMS_WWW_FORM is passed in &#64;flags, `+` characters in the param
     * <br>string will be replaced with spaces in the output. For example, `foo=bar+baz`
     * <br>will give attribute `foo` with value `bar baz`. This is commonly used on the
     * <br>web (the `https` and `http` schemes only), but is deprecated in favour of
     * <br>the equivalent of encoding spaces as `%20`.
     * <br>
     * <br>Unlike with g_uri_parse_params(), %G_URI_PARAMS_CASE_INSENSITIVE has no
     * <br>effect if passed to &#64;flags for g_uri_params_iter_init(). The caller is
     * <br>responsible for doing their own case-insensitive comparisons.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GUriParamsIter iter;
     * GError *error = NULL;
     * gchar *unowned_attr, *unowned_value;
     * 
     * g_uri_params_iter_init (&amp;iter, &quot;foo=bar&amp;baz=bar&amp;Foo=frob&amp;baz=bar2&quot;, -1, &quot;&amp;&quot;, G_URI_PARAMS_NONE);
     * while (g_uri_params_iter_next (&amp;iter, &amp;unowned_attr, &amp;unowned_value, &amp;error))
     *   {
     *     g_autofree gchar *attr = g_steal_pointer (&amp;unowned_attr);
     *     g_autofree gchar *value = g_steal_pointer (&amp;unowned_value);
     *     // do something with attr and value; this code will be called 4 times
     *     // for the params string in this example: once with attr=foo and value=bar,
     *     // then with baz/bar, then Foo/frob, then baz/bar2.
     *   }
     * if (error)
     *   // handle parsing error
     * </pre>
     * @param params a `%`-encoded string containing `attribute=value`   parameters
     * @param length the length of &#64;params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually   `&amp;`, but sometimes `;` or both `&amp;;`). Note that this function works on   bytes not characters, so it can't be used to delimit UTF-8 strings for   anything but ASCII characters. You may pass an empty set, in which case   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
    */
    public void init(@Nonnull ch.bailu.gtk.type.Str params, long length, @Nonnull ch.bailu.gtk.type.Str separators, int flags)  {
        JnaUriParamsIter.INST().g_uri_params_iter_init(asCPointer(), asCPointerNotNull(params), length, asCPointerNotNull(separators), flags);
    }

    /**
     * Initializes an attribute/value pair iterator.
     * <br>
     * <br>The iterator keeps pointers to the &#64;params and &#64;separators arguments, those
     * <br>variables must thus outlive the iterator and not be modified during the
     * <br>iteration.
     * <br>
     * <br>If %G_URI_PARAMS_WWW_FORM is passed in &#64;flags, `+` characters in the param
     * <br>string will be replaced with spaces in the output. For example, `foo=bar+baz`
     * <br>will give attribute `foo` with value `bar baz`. This is commonly used on the
     * <br>web (the `https` and `http` schemes only), but is deprecated in favour of
     * <br>the equivalent of encoding spaces as `%20`.
     * <br>
     * <br>Unlike with g_uri_parse_params(), %G_URI_PARAMS_CASE_INSENSITIVE has no
     * <br>effect if passed to &#64;flags for g_uri_params_iter_init(). The caller is
     * <br>responsible for doing their own case-insensitive comparisons.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GUriParamsIter iter;
     * GError *error = NULL;
     * gchar *unowned_attr, *unowned_value;
     * 
     * g_uri_params_iter_init (&amp;iter, &quot;foo=bar&amp;baz=bar&amp;Foo=frob&amp;baz=bar2&quot;, -1, &quot;&amp;&quot;, G_URI_PARAMS_NONE);
     * while (g_uri_params_iter_next (&amp;iter, &amp;unowned_attr, &amp;unowned_value, &amp;error))
     *   {
     *     g_autofree gchar *attr = g_steal_pointer (&amp;unowned_attr);
     *     g_autofree gchar *value = g_steal_pointer (&amp;unowned_value);
     *     // do something with attr and value; this code will be called 4 times
     *     // for the params string in this example: once with attr=foo and value=bar,
     *     // then with baz/bar, then Foo/frob, then baz/bar2.
     *   }
     * if (error)
     *   // handle parsing error
     * </pre>
     * @param params a `%`-encoded string containing `attribute=value`   parameters
     * @param length the length of &#64;params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually   `&amp;`, but sometimes `;` or both `&amp;;`). Note that this function works on   bytes not characters, so it can't be used to delimit UTF-8 strings for   anything but ASCII characters. You may pass an empty set, in which case   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
    */
    public void init(String params, long length, String separators, int flags)  {
        JnaUriParamsIter.INST().g_uri_params_iter_init(asCPointer(), params, length, separators, flags);
    }

}

/*
record-type
some-fields-unsupported

[MethodModel:java-type-not-supported:java-type-not-supported:next:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[FieldModel:dummy3:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
