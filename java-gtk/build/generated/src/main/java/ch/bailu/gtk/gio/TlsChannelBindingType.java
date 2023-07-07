/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface TlsChannelBindingType {

    /**
     * [`tls-unique`](https://tools.ietf.org/html/rfc5929&#35;section-3) binding
     * <br>   type
    */
    int UNIQUE = 0;

    /**
     * [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929&#35;section-4)
     * <br>   binding type
    */
    int SERVER_END_POINT = 1;

    /**
     * [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding
     * <br>   type. Since: 2.74
    */
    int EXPORTER = 2;

}

/*
enumeration-type
*/
