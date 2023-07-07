/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a HMAC operation.
 * <br>To create a new GHmac, use g_hmac_new(). To free
 * <br>a GHmac, use g_hmac_unref().
 * <p><a href="https://docs.gtk.org/glib/struct.Hmac.html">https://docs.gtk.org/glib/struct.Hmac.html</a></p>
*/
class Hmac extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Hmac.class.getCanonicalName());
    }

    public Hmac(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Copies a &#35;GHmac. If &#64;hmac has been closed, by calling
     * <br>g_hmac_get_string() or g_hmac_get_digest(), the copied
     * <br>HMAC will be closed as well.
     * @return the copy of the passed &#35;GHmac. Use g_hmac_unref()   when finished using it.
    */
    public Hmac copy()  {
        return new Hmac(new PointerContainer(JnaHmac.INST().g_hmac_copy(asCPointer())));
    }

    /**
     * Gets the HMAC as a hexadecimal string.
     * <br>
     * <br>Once this function has been called the &#35;GHmac can no longer be
     * <br>updated with g_hmac_update().
     * <br>
     * <br>The hexadecimal characters will be lower case.
     * @return the hexadecimal representation of the HMAC. The   returned string is owned by the HMAC and should not be modified   or freed.
    */
    public ch.bailu.gtk.type.Str getString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaHmac.INST().g_hmac_get_string(asCPointer())));
    }

    /**
     * Atomically increments the reference count of &#64;hmac by one.
     * <br>
     * <br>This function is MT-safe and may be called from any thread.
     * @return the passed in &#35;GHmac.
    */
    public Hmac ref()  {
        return new Hmac(new PointerContainer(JnaHmac.INST().g_hmac_ref(asCPointer())));
    }

    /**
     * Atomically decrements the reference count of &#64;hmac by one.
     * <br>
     * <br>If the reference count drops to 0, all keys and values will be
     * <br>destroyed, and all memory allocated by the hash table is released.
     * <br>This function is MT-safe and may be called from any thread.
     * <br>Frees the memory allocated for &#64;hmac.
    */
    public void unref()  {
        JnaHmac.INST().g_hmac_unref(asCPointer());
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:java-type-not-supported:getDigest:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:update:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:Hmac:{c:GHmac*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GChecksumType}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
