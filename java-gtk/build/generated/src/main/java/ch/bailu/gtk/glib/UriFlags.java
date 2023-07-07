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
public interface UriFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Parse the URI more relaxedly than the
     * <br>    [RFC 3986](https://tools.ietf.org/html/rfc3986) grammar specifies,
     * <br>    fixing up or ignoring common mistakes in URIs coming from external
     * <br>    sources. This is also needed for some obscure URI schemes where `;`
     * <br>    separates the host from the path. Don’t use this flag unless you need to.
    */
    int PARSE_RELAXED = 1;

    /**
     * The userinfo field may contain a password,
     * <br>    which will be separated from the username by `:`.
    */
    int HAS_PASSWORD = 2;

    /**
     * The userinfo may contain additional
     * <br>    authentication-related parameters, which will be separated from
     * <br>    the username and/or password by `;`.
    */
    int HAS_AUTH_PARAMS = 4;

    /**
     * When parsing a URI, this indicates that `%`-encoded
     * <br>    characters in the userinfo, path, query, and fragment fields
     * <br>    should not be decoded. (And likewise the host field if
     * <br>    %G_URI_FLAGS_NON_DNS is also set.) When building a URI, it indicates
     * <br>    that you have already `%`-encoded the components, and so &#35;GUri
     * <br>    should not do any encoding itself.
    */
    int ENCODED = 8;

    /**
     * The host component should not be assumed to be a
     * <br>    DNS hostname or IP address (for example, for `smb` URIs with NetBIOS
     * <br>    hostnames).
    */
    int NON_DNS = 16;

    /**
     * Same as %G_URI_FLAGS_ENCODED, for the query
     * <br>    field only.
    */
    int ENCODED_QUERY = 32;

    /**
     * Same as %G_URI_FLAGS_ENCODED, for the path only.
    */
    int ENCODED_PATH = 64;

    /**
     * Same as %G_URI_FLAGS_ENCODED, for the
     * <br>    fragment only.
    */
    int ENCODED_FRAGMENT = 128;

    /**
     * A scheme-based normalization will be applied.
     * <br>    For example, when parsing an HTTP URI changing omitted path to `/` and
     * <br>    omitted port to `80`; and when building a URI, changing empty path to `/`
     * <br>    and default port `80`). This only supports a subset of known schemes. (Since: 2.68)
    */
    int SCHEME_NORMALIZE = 256;

}

/*
enumeration-type
*/
