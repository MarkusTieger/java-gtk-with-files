/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * <br>private data and should only be accessed using the following functions.
 * <p><a href="https://docs.gtk.org/glib/struct.IConv.html">https://docs.gtk.org/glib/struct.IConv.html</a></p>
*/
class IConv extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IConv.class.getCanonicalName());
    }

    public IConv(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Same as the standard UNIX routine iconv_close(), but
     * <br>may be implemented via libiconv on UNIX flavors that lack
     * <br>a native implementation. Should be called to clean up
     * <br>the conversion descriptor from g_iconv_open() when
     * <br>you are done converting things.
     * <br>
     * <br>GLib provides g_convert() and g_locale_to_utf8() which are likely
     * <br>more convenient than the raw iconv wrappers.
     * @return -1 on error, 0 on success
    */
    public int close()  {
        return JnaIConv.INST().g_iconv_close(asCPointer());
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:java-type-not-supported:java-type-not-supported::[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:open:[ParameterModel:direct-type:{Gg:IConv:{c:GIConv}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
*/
