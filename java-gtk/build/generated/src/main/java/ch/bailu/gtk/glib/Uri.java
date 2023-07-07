/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GUri type and related functions can be used to parse URIs into
 * <br>their components, and build valid URIs from individual components.
 * <br>
 * <br>Note that &#35;GUri scope is to help manipulate URIs in various applications,
 * <br>following [RFC 3986](https://tools.ietf.org/html/rfc3986). In particular,
 * <br>it doesn't intend to cover web browser needs, and doesn't implement the
 * <br>[WHATWG URL](https://url.spec.whatwg.org/) standard. No APIs are provided to
 * <br>help prevent
 * <br>[homograph attacks](https://en.wikipedia.org/wiki/IDN_homograph_attack), so
 * <br>&#35;GUri is not suitable for formatting URIs for display to the user for making
 * <br>security-sensitive decisions.
 * <br>
 * <br>&#35;&#35; Relative and absolute URIs &#35; {&#35;relative-absolute-uris}
 * <br>
 * <br>As defined in [RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-4), the
 * <br>hierarchical nature of URIs means that they can either be ‘relative
 * <br>references’ (sometimes referred to as ‘relative URIs’) or ‘URIs’ (for
 * <br>clarity, ‘URIs’ are referred to in this documentation as
 * <br>‘absolute URIs’ — although
 * <br>[in constrast to RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-4.3),
 * <br>fragment identifiers are always allowed).
 * <br>
 * <br>Relative references have one or more components of the URI missing. In
 * <br>particular, they have no scheme. Any other component, such as hostname,
 * <br>query, etc. may be missing, apart from a path, which has to be specified (but
 * <br>may be empty). The path may be relative, starting with `./` rather than `/`.
 * <br>
 * <br>For example, a valid relative reference is `./path?query`,
 * <br>`/?query&#35;fragment` or `//example.com`.
 * <br>
 * <br>Absolute URIs have a scheme specified. Any other components of the URI which
 * <br>are missing are specified as explicitly unset in the URI, rather than being
 * <br>resolved relative to a base URI using g_uri_parse_relative().
 * <br>
 * <br>For example, a valid absolute URI is `file:///home/bob` or
 * <br>`https://search.com?query=string`.
 * <br>
 * <br>A &#35;GUri instance is always an absolute URI. A string may be an absolute URI
 * <br>or a relative reference; see the documentation for individual functions as to
 * <br>what forms they accept.
 * <br>
 * <br>&#35;&#35; Parsing URIs
 * <br>
 * <br>The most minimalist APIs for parsing URIs are g_uri_split() and
 * <br>g_uri_split_with_user(). These split a URI into its component
 * <br>parts, and return the parts; the difference between the two is that
 * <br>g_uri_split() treats the ‘userinfo’ component of the URI as a
 * <br>single element, while g_uri_split_with_user() can (depending on the
 * <br>&#35;GUriFlags you pass) treat it as containing a username, password,
 * <br>and authentication parameters. Alternatively, g_uri_split_network()
 * <br>can be used when you are only interested in the components that are
 * <br>needed to initiate a network connection to the service (scheme,
 * <br>host, and port).
 * <br>
 * <br>g_uri_parse() is similar to g_uri_split(), but instead of returning
 * <br>individual strings, it returns a &#35;GUri structure (and it requires
 * <br>that the URI be an absolute URI).
 * <br>
 * <br>g_uri_resolve_relative() and g_uri_parse_relative() allow you to
 * <br>resolve a relative URI relative to a base URI.
 * <br>g_uri_resolve_relative() takes two strings and returns a string,
 * <br>and g_uri_parse_relative() takes a &#35;GUri and a string and returns a
 * <br>&#35;GUri.
 * <br>
 * <br>All of the parsing functions take a &#35;GUriFlags argument describing
 * <br>exactly how to parse the URI; see the documentation for that type
 * <br>for more details on the specific flags that you can pass. If you
 * <br>need to choose different flags based on the type of URI, you can
 * <br>use g_uri_peek_scheme() on the URI string to check the scheme
 * <br>first, and use that to decide what flags to parse it with.
 * <br>
 * <br>For example, you might want to use %G_URI_PARAMS_WWW_FORM when parsing the
 * <br>params for a web URI, so compare the result of g_uri_peek_scheme() against
 * <br>`http` and `https`.
 * <br>
 * <br>&#35;&#35; Building URIs
 * <br>
 * <br>g_uri_join() and g_uri_join_with_user() can be used to construct
 * <br>valid URI strings from a set of component strings. They are the
 * <br>inverse of g_uri_split() and g_uri_split_with_user().
 * <br>
 * <br>Similarly, g_uri_build() and g_uri_build_with_user() can be used to
 * <br>construct a &#35;GUri from a set of component strings.
 * <br>
 * <br>As with the parsing functions, the building functions take a
 * <br>&#35;GUriFlags argument. In particular, it is important to keep in mind
 * <br>whether the URI components you are using are already `%`-encoded. If so,
 * <br>you must pass the %G_URI_FLAGS_ENCODED flag.
 * <br>
 * <br>&#35;&#35; `file://` URIs
 * <br>
 * <br>Note that Windows and Unix both define special rules for parsing
 * <br>`file://` URIs (involving non-UTF-8 character sets on Unix, and the
 * <br>interpretation of path separators on Windows). &#35;GUri does not
 * <br>implement these rules. Use g_filename_from_uri() and
 * <br>g_filename_to_uri() if you want to properly convert between
 * <br>`file://` URIs and local filenames.
 * <br>
 * <br>&#35;&#35; URI Equality
 * <br>
 * <br>Note that there is no `g_uri_equal ()` function, because comparing
 * <br>URIs usefully requires scheme-specific knowledge that &#35;GUri does
 * <br>not have. &#35;GUri can help with normalization if you use the various
 * <br>encoded &#35;GUriFlags as well as %G_URI_FLAGS_SCHEME_NORMALIZE however
 * <br>it is not comprehensive.
 * <br>For example, `data:,foo` and `data:;base64,Zm9v` resolve to the same
 * <br>thing according to the `data:` URI specification which GLib does not
 * <br>handle.
 * <p><a href="https://docs.gtk.org/glib/struct.Uri.html">https://docs.gtk.org/glib/struct.Uri.html</a></p>
*/
public class Uri extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Uri.class.getCanonicalName());
    }

    public Uri(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets &#64;uri's authentication parameters, which may contain
     * <br>`%`-encoding, depending on the flags with which &#64;uri was created.
     * <br>(If &#64;uri was not created with %G_URI_FLAGS_HAS_AUTH_PARAMS then this will
     * <br>be %NULL.)
     * <br>
     * <br>Depending on the URI scheme, g_uri_parse_params() may be useful for
     * <br>further parsing this information.
     * @return &#64;uri's authentication parameters.
    */
    public ch.bailu.gtk.type.Str getAuthParams()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_auth_params(asCPointer())));
    }

    /**
     * Gets &#64;uri's flags set upon construction.
     * @return &#64;uri's flags.
    */
    public int getFlags()  {
        return JnaUri.INST().g_uri_get_flags(asCPointer());
    }

    /**
     * Gets &#64;uri's fragment, which may contain `%`-encoding, depending on
     * <br>the flags with which &#64;uri was created.
     * @return &#64;uri's fragment.
    */
    public ch.bailu.gtk.type.Str getFragment()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_fragment(asCPointer())));
    }

    /**
     * Gets &#64;uri's host. This will never have `%`-encoded characters,
     * <br>unless it is non-UTF-8 (which can only be the case if &#64;uri was
     * <br>created with %G_URI_FLAGS_NON_DNS).
     * <br>
     * <br>If &#64;uri contained an IPv6 address literal, this value will be just
     * <br>that address, without the brackets around it that are necessary in
     * <br>the string form of the URI. Note that in this case there may also
     * <br>be a scope ID attached to the address. Eg, `fe80::1234%``em1` (or
     * <br>`fe80::1234%``25em1` if the string is still encoded).
     * @return &#64;uri's host.
    */
    public ch.bailu.gtk.type.Str getHost()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_host(asCPointer())));
    }

    /**
     * Gets &#64;uri's password, which may contain `%`-encoding, depending on
     * <br>the flags with which &#64;uri was created. (If &#64;uri was not created
     * <br>with %G_URI_FLAGS_HAS_PASSWORD then this will be %NULL.)
     * @return &#64;uri's password.
    */
    public ch.bailu.gtk.type.Str getPassword()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_password(asCPointer())));
    }

    /**
     * Gets &#64;uri's path, which may contain `%`-encoding, depending on the
     * <br>flags with which &#64;uri was created.
     * @return &#64;uri's path.
    */
    public ch.bailu.gtk.type.Str getPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_path(asCPointer())));
    }

    /**
     * Gets &#64;uri's port.
     * @return &#64;uri's port, or `-1` if no port was specified.
    */
    public int getPort()  {
        return JnaUri.INST().g_uri_get_port(asCPointer());
    }

    /**
     * Gets &#64;uri's query, which may contain `%`-encoding, depending on the
     * <br>flags with which &#64;uri was created.
     * <br>
     * <br>For queries consisting of a series of `name=value` parameters,
     * <br>&#35;GUriParamsIter or g_uri_parse_params() may be useful.
     * @return &#64;uri's query.
    */
    public ch.bailu.gtk.type.Str getQuery()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_query(asCPointer())));
    }

    /**
     * Gets &#64;uri's scheme. Note that this will always be all-lowercase,
     * <br>regardless of the string or strings that &#64;uri was created from.
     * @return &#64;uri's scheme.
    */
    public ch.bailu.gtk.type.Str getScheme()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_scheme(asCPointer())));
    }

    /**
     * Gets the ‘username’ component of &#64;uri's userinfo, which may contain
     * <br>`%`-encoding, depending on the flags with which &#64;uri was created.
     * <br>If &#64;uri was not created with %G_URI_FLAGS_HAS_PASSWORD or
     * <br>%G_URI_FLAGS_HAS_AUTH_PARAMS, this is the same as g_uri_get_userinfo().
     * @return &#64;uri's user.
    */
    public ch.bailu.gtk.type.Str getUser()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_user(asCPointer())));
    }

    /**
     * Gets &#64;uri's userinfo, which may contain `%`-encoding, depending on
     * <br>the flags with which &#64;uri was created.
     * @return &#64;uri's userinfo.
    */
    public ch.bailu.gtk.type.Str getUserinfo()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_get_userinfo(asCPointer())));
    }

    /**
     * Parses &#64;uri_ref according to &#64;flags and, if it is a
     * <br>[relative URI][relative-absolute-uris], resolves it relative to &#64;base_uri.
     * <br>If the result is not a valid absolute URI, it will be discarded, and an error
     * <br>returned.
     * @param uri_ref a string representing a relative or absolute URI
     * @param flags flags describing how to parse &#64;uri_ref
     * @return a new &#35;GUri, or NULL on error.
    */
    public Uri parseRelative(@Nonnull ch.bailu.gtk.type.Str uri_ref, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_parse_relative(asCPointer(), asCPointerNotNull(uri_ref), flags, 0L)));
    }

    /**
     * Parses &#64;uri_ref according to &#64;flags and, if it is a
     * <br>[relative URI][relative-absolute-uris], resolves it relative to &#64;base_uri.
     * <br>If the result is not a valid absolute URI, it will be discarded, and an error
     * <br>returned.
     * @param uri_ref a string representing a relative or absolute URI
     * @param flags flags describing how to parse &#64;uri_ref
     * @return a new &#35;GUri, or NULL on error.
    */
    public Uri parseRelative(String uri_ref, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_parse_relative(asCPointer(), uri_ref, flags, 0L)));
    }

    /**
     * Increments the reference count of &#64;uri by one.
     * @return &#64;uri
    */
    public Uri ref()  {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_ref(asCPointer())));
    }

    /**
     * Returns a string representing &#64;uri.
     * <br>
     * <br>This is not guaranteed to return a string which is identical to the
     * <br>string that &#64;uri was parsed from. However, if the source URI was
     * <br>syntactically correct (according to RFC 3986), and it was parsed
     * <br>with %G_URI_FLAGS_ENCODED, then g_uri_to_string() is guaranteed to return
     * <br>a string which is at least semantically equivalent to the source
     * <br>URI (according to RFC 3986).
     * <br>
     * <br>If &#64;uri might contain sensitive details, such as authentication parameters,
     * <br>or private data in its query string, and the returned string is going to be
     * <br>logged, then consider using g_uri_to_string_partial() to redact parts.
     * @return a string representing &#64;uri,     which the caller must free.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_to_string(asCPointer())));
    }

    /**
     * Returns a string representing &#64;uri, subject to the options in
     * <br>&#64;flags. See g_uri_to_string() and &#35;GUriHideFlags for more details.
     * @param flags flags describing what parts of &#64;uri to hide
     * @return a string representing     &#64;uri, which the caller must free.
    */
    public ch.bailu.gtk.type.Str toStringPartial(int flags)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_to_string_partial(asCPointer(), flags)));
    }

    /**
     * Atomically decrements the reference count of &#64;uri by one.
     * <br>
     * <br>When the reference count reaches zero, the resources allocated by
     * <br>&#64;uri are freed
    */
    public void unref()  {
        JnaUri.INST().g_uri_unref(asCPointer());
    }

    /**
     * Creates a new &#35;GUri from the given components according to &#64;flags.
     * <br>
     * <br>See also g_uri_build_with_user(), which allows specifying the
     * <br>components of the &quot;userinfo&quot; separately.
     * @param flags flags describing how to build the &#35;GUri
     * @param scheme the URI scheme
     * @param userinfo the userinfo component, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return a new &#35;GUri
    */
    public static Uri build(int flags, @Nonnull ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str userinfo, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_build(flags, asCPointerNotNull(scheme), asCPointer(userinfo), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Creates a new &#35;GUri from the given components according to &#64;flags
     * <br>(%G_URI_FLAGS_HAS_PASSWORD is added unconditionally). The &#64;flags must be
     * <br>coherent with the passed values, in particular use `%`-encoded values with
     * <br>%G_URI_FLAGS_ENCODED.
     * <br>
     * <br>In contrast to g_uri_build(), this allows specifying the components
     * <br>of the ‘userinfo’ field separately. Note that &#64;user must be non-%NULL
     * <br>if either &#64;password or &#64;auth_params is non-%NULL.
     * @param flags flags describing how to build the &#35;GUri
     * @param scheme the URI scheme
     * @param user the user component of the userinfo, or %NULL
     * @param password the password component of the userinfo, or %NULL
     * @param auth_params the auth params of the userinfo, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return a new &#35;GUri
    */
    public static Uri buildWithUser(int flags, @Nonnull ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str user, @Nullable ch.bailu.gtk.type.Str password, @Nullable ch.bailu.gtk.type.Str auth_params, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_build_with_user(flags, asCPointerNotNull(scheme), asCPointer(user), asCPointer(password), asCPointer(auth_params), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaUri.INST().g_uri_error_quark();
    }

    /**
     * Escapes a string for use in a URI.
     * <br>
     * <br>Normally all characters that are not &quot;unreserved&quot; (i.e. ASCII
     * <br>alphanumerical characters plus dash, dot, underscore and tilde) are
     * <br>escaped. But if you specify characters in &#64;reserved_chars_allowed
     * <br>they are not escaped. This is useful for the &quot;reserved&quot; characters
     * <br>in the URI specification, since those are allowed unescaped in some
     * <br>portions of a URI.
     * @param unescaped the unescaped input string.
     * @param reserved_chars_allowed a string of reserved   characters that are allowed to be used, or %NULL.
     * @param allow_utf8 %TRUE if the result can include UTF-8 characters.
     * @return an escaped version of &#64;unescaped. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str escapeString(@Nonnull ch.bailu.gtk.type.Str unescaped, @Nullable ch.bailu.gtk.type.Str reserved_chars_allowed, boolean allow_utf8)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_escape_string(asCPointerNotNull(unescaped), asCPointer(reserved_chars_allowed), allow_utf8)));
    }

    /**
     * Parses &#64;uri_string according to &#64;flags, to determine whether it is a valid
     * <br>[absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
     * <br>relative to another URI using g_uri_parse_relative().
     * <br>
     * <br>If it’s not a valid URI, an error is returned explaining how it’s invalid.
     * <br>
     * <br>See g_uri_split(), and the definition of &#35;GUriFlags, for more
     * <br>information on the effect of &#64;flags.
     * @param uri_string a string containing an absolute URI
     * @param flags flags for parsing &#64;uri_string
     * @return %TRUE if &#64;uri_string is a valid absolute URI, %FALSE on error.
    */
    public static boolean isValid(@Nonnull ch.bailu.gtk.type.Str uri_string, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUri.INST().g_uri_is_valid(asCPointerNotNull(uri_string), flags, 0L);
    }

    /**
     * Joins the given components together according to &#64;flags to create
     * <br>an absolute URI string. &#64;path may not be %NULL (though it may be the empty
     * <br>string).
     * <br>
     * <br>When &#64;host is present, &#64;path must either be empty or begin with a slash (`/`)
     * <br>character. When &#64;host is not present, &#64;path cannot begin with two slash
     * <br>   characters (`//`). See
     * <br>[RFC 3986, section 3](https://tools.ietf.org/html/rfc3986&#35;section-3).
     * <br>
     * <br>See also g_uri_join_with_user(), which allows specifying the
     * <br>components of the ‘userinfo’ separately.
     * <br>
     * <br>%G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * <br>in &#64;flags.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or %NULL
     * @param userinfo the userinfo component, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return an absolute URI string
    */
    public static ch.bailu.gtk.type.Str join(int flags, @Nullable ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str userinfo, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_join(flags, asCPointer(scheme), asCPointer(userinfo), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Joins the given components together according to &#64;flags to create
     * <br>an absolute URI string. &#64;path may not be %NULL (though it may be the empty
     * <br>string).
     * <br>
     * <br>In contrast to g_uri_join(), this allows specifying the components
     * <br>of the ‘userinfo’ separately. It otherwise behaves the same.
     * <br>
     * <br>%G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * <br>in &#64;flags.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or %NULL
     * @param user the user component of the userinfo, or %NULL
     * @param password the password component of the userinfo, or   %NULL
     * @param auth_params the auth params of the userinfo, or   %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return an absolute URI string
    */
    public static ch.bailu.gtk.type.Str joinWithUser(int flags, @Nullable ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str user, @Nullable ch.bailu.gtk.type.Str password, @Nullable ch.bailu.gtk.type.Str auth_params, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_join_with_user(flags, asCPointer(scheme), asCPointer(user), asCPointer(password), asCPointer(auth_params), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Parses &#64;uri_string according to &#64;flags. If the result is not a
     * <br>valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * <br>error returned.
     * @param uri_string a string representing an absolute URI
     * @param flags flags describing how to parse &#64;uri_string
     * @return a new &#35;GUri, or NULL on error.
    */
    public static Uri parse(@Nonnull ch.bailu.gtk.type.Str uri_string, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Uri(new PointerContainer(JnaUri.INST().g_uri_parse(asCPointerNotNull(uri_string), flags, 0L)));
    }

    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * <br>value. This method can be used to parse them into a hash table. When an
     * <br>attribute has multiple occurrences, the last value is the final returned
     * <br>value. If you need to handle repeated attributes differently, use
     * <br>&#35;GUriParamsIter.
     * <br>
     * <br>The &#64;params string is assumed to still be `%`-encoded, but the returned
     * <br>values will be fully decoded. (Thus it is possible that the returned values
     * <br>may contain `=` or &#64;separators, if the value was encoded in the input.)
     * <br>Invalid `%`-encoding is treated as with the %G_URI_FLAGS_PARSE_RELAXED
     * <br>rules for g_uri_parse(). (However, if &#64;params is the path or query string
     * <br>from a &#35;GUri that was parsed without %G_URI_FLAGS_PARSE_RELAXED and
     * <br>%G_URI_FLAGS_ENCODED, then you already know that it does not contain any
     * <br>invalid encoding.)
     * <br>
     * <br>%G_URI_PARAMS_WWW_FORM is handled as documented for g_uri_params_iter_init().
     * <br>
     * <br>If %G_URI_PARAMS_CASE_INSENSITIVE is passed to &#64;flags, attributes will be
     * <br>compared case-insensitively, so a params string `attr=123&amp;Attr=456` will only
     * <br>return a single attribute–value pair, `Attr=456`. Case will be preserved in
     * <br>the returned attributes.
     * <br>
     * <br>If &#64;params cannot be parsed (for example, it contains two &#64;separators
     * <br>characters in a row), then &#64;error is set and %NULL is returned.
     * @param params a `%`-encoded string containing `attribute=value`   parameters
     * @param length the length of &#64;params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually   `&amp;`, but sometimes `;` or both `&amp;;`). Note that this function works on   bytes not characters, so it can't be used to delimit UTF-8 strings for   anything but ASCII characters. You may pass an empty set, in which case   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     * @return      A hash table of attribute/value pairs, with both names and values     fully-decoded; or %NULL on error.
    */
    public static HashTable parseParams(@Nonnull ch.bailu.gtk.type.Str params, long length, @Nonnull ch.bailu.gtk.type.Str separators, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new HashTable(new PointerContainer(JnaUri.INST().g_uri_parse_params(asCPointerNotNull(params), length, asCPointerNotNull(separators), flags, 0L)));
    }

    /**
     * Gets the scheme portion of a URI string.
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-3) decodes the scheme
     * <br>as:
     * <pre>
     * URI = scheme &quot;:&quot; hier-part [ &quot;?&quot; query ] [ &quot;&#35;&quot; fragment ]
     * </pre>
     * <br>Common schemes include `file`, `https`, `svn+ssh`, etc.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or     %NULL on error. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str parseScheme(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_parse_scheme(asCPointerNotNull(uri))));
    }

    /**
     * Gets the scheme portion of a URI string.
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-3) decodes the scheme
     * <br>as:
     * <pre>
     * URI = scheme &quot;:&quot; hier-part [ &quot;?&quot; query ] [ &quot;&#35;&quot; fragment ]
     * </pre>
     * <br>Common schemes include `file`, `https`, `svn+ssh`, etc.
     * <br>
     * <br>Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * <br>all-lowercase and does not need to be freed.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or     %NULL on error. The returned string is normalized to all-lowercase, and     interned via g_intern_string(), so it does not need to be freed.
    */
    public static ch.bailu.gtk.type.Str peekScheme(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_peek_scheme(asCPointerNotNull(uri))));
    }

    /**
     * Parses &#64;uri_ref according to &#64;flags and, if it is a
     * <br>[relative URI][relative-absolute-uris], resolves it relative to
     * <br>&#64;base_uri_string. If the result is not a valid absolute URI, it will be
     * <br>discarded, and an error returned.
     * <br>
     * <br>(If &#64;base_uri_string is %NULL, this just returns &#64;uri_ref, or
     * <br>%NULL if &#64;uri_ref is invalid or not absolute.)
     * @param base_uri_string a string representing a base URI
     * @param uri_ref a string representing a relative or absolute URI
     * @param flags flags describing how to parse &#64;uri_ref
     * @return the resolved URI string, or NULL on error.
    */
    public static ch.bailu.gtk.type.Str resolveRelative(@Nullable ch.bailu.gtk.type.Str base_uri_string, @Nonnull ch.bailu.gtk.type.Str uri_ref, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_resolve_relative(asCPointer(base_uri_string), asCPointerNotNull(uri_ref), flags, 0L)));
    }

    /**
     * Unescapes a segment of an escaped string as binary data.
     * <br>
     * <br>Note that in contrast to g_uri_unescape_string(), this does allow
     * <br>nul bytes to appear in the output.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters appears as an escaped
     * <br>character in &#64;escaped_string, then that is an error and %NULL will be
     * <br>returned. This is useful if you want to avoid for instance having a slash
     * <br>being expanded in an escaped path element, which might confuse pathname
     * <br>handling.
     * @param escaped_string A URI-escaped string
     * @param length the length (in bytes) of &#64;escaped_string to escape, or `-1` if it   is nul-terminated.
     * @param illegal_characters a string of illegal characters   not to be allowed, or %NULL.
     * @return an unescaped version of &#64;escaped_string     or %NULL on error (if decoding failed, using %G_URI_ERROR_FAILED error     code). The returned &#35;GBytes should be unreffed when no longer needed.
    */
    public static Bytes unescapeBytes(@Nonnull ch.bailu.gtk.type.Str escaped_string, long length, @Nullable ch.bailu.gtk.type.Str illegal_characters) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Bytes(new PointerContainer(JnaUri.INST().g_uri_unescape_bytes(asCPointerNotNull(escaped_string), length, asCPointer(illegal_characters), 0L)));
    }

    /**
     * Unescapes a segment of an escaped string.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters or the NUL
     * <br>character appears as an escaped character in &#64;escaped_string, then
     * <br>that is an error and %NULL will be returned. This is useful if you
     * <br>want to avoid for instance having a slash being expanded in an
     * <br>escaped path element, which might confuse pathname handling.
     * <br>
     * <br>Note: `NUL` byte is not accepted in the output, in contrast to
     * <br>g_uri_unescape_bytes().
     * @param escaped_string A string, may be %NULL
     * @param escaped_string_end Pointer to end of &#64;escaped_string,   may be %NULL
     * @param illegal_characters An optional string of illegal   characters not to be allowed, may be %NULL
     * @return an unescaped version of &#64;escaped_string, or %NULL on error. The returned string should be freed when no longer needed.  As a special case if %NULL is given for &#64;escaped_string, this function will return %NULL.
    */
    public static ch.bailu.gtk.type.Str unescapeSegment(@Nullable ch.bailu.gtk.type.Str escaped_string, @Nullable ch.bailu.gtk.type.Str escaped_string_end, @Nullable ch.bailu.gtk.type.Str illegal_characters)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_unescape_segment(asCPointer(escaped_string), asCPointer(escaped_string_end), asCPointer(illegal_characters))));
    }

    /**
     * Unescapes a whole escaped string.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters or the NUL
     * <br>character appears as an escaped character in &#64;escaped_string, then
     * <br>that is an error and %NULL will be returned. This is useful if you
     * <br>want to avoid for instance having a slash being expanded in an
     * <br>escaped path element, which might confuse pathname handling.
     * @param escaped_string an escaped string to be unescaped.
     * @param illegal_characters a string of illegal characters   not to be allowed, or %NULL.
     * @return an unescaped version of &#64;escaped_string. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str unescapeString(@Nonnull ch.bailu.gtk.type.Str escaped_string, @Nullable ch.bailu.gtk.type.Str illegal_characters)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaUri.INST().g_uri_unescape_string(asCPointerNotNull(escaped_string), asCPointer(illegal_characters))));
    }

    public static long getTypeID() { 
        return JnaUri.INST().g_uri_get_type(); 
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

[MethodModel:java-type-not-supported:escapeBytes:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:listExtractUris:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:split:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:splitNetwork:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:splitWithUser:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
*/
