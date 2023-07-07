/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a checksumming operation.
 * <br>
 * <br>To create a new GChecksum, use g_checksum_new(). To free
 * <br>a GChecksum, use g_checksum_free().
 * <p><a href="https://docs.gtk.org/glib/struct.Checksum.html">https://docs.gtk.org/glib/struct.Checksum.html</a></p>
*/
public class Checksum extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Checksum.class.getCanonicalName());
    }

    public Checksum(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GChecksum, using the checksum algorithm &#64;checksum_type.
     * <br>If the &#64;checksum_type is not known, %NULL is returned.
     * <br>A &#35;GChecksum can be used to compute the checksum, or digest, of an
     * <br>arbitrary binary blob, using different hashing algorithms.
     * <br>
     * <br>A &#35;GChecksum works by feeding a binary blob through g_checksum_update()
     * <br>until there is data to be checked; the digest can then be extracted
     * <br>using g_checksum_get_string(), which will return the checksum as a
     * <br>hexadecimal string; or g_checksum_get_digest(), which will return a
     * <br>vector of raw bytes. Once either g_checksum_get_string() or
     * <br>g_checksum_get_digest() have been called on a &#35;GChecksum, the checksum
     * <br>will be closed and it won't be possible to call g_checksum_update()
     * <br>on it anymore.
     * @param checksum_type the desired type of checksum
    */
    public Checksum(int checksum_type) {
        super(cast(JnaChecksum.INST().g_checksum_new(checksum_type)));
    }

    /**
     * Copies a &#35;GChecksum. If &#64;checksum has been closed, by calling
     * <br>g_checksum_get_string() or g_checksum_get_digest(), the copied
     * <br>checksum will be closed as well.
     * @return the copy of the passed &#35;GChecksum. Use   g_checksum_free() when finished using it.
    */
    public Checksum copy()  {
        return new Checksum(new PointerContainer(JnaChecksum.INST().g_checksum_copy(asCPointer())));
    }

    /**
     * Frees the memory allocated for &#64;checksum.
    */
    public void free()  {
        JnaChecksum.INST().g_checksum_free(asCPointer());
    }

    /**
     * Gets the digest as a hexadecimal string.
     * <br>
     * <br>Once this function has been called the &#35;GChecksum can no longer be
     * <br>updated with g_checksum_update().
     * <br>
     * <br>The hexadecimal characters will be lower case.
     * @return the hexadecimal representation of the checksum. The   returned string is owned by the checksum and should not be modified   or freed.
    */
    public ch.bailu.gtk.type.Str getString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaChecksum.INST().g_checksum_get_string(asCPointer())));
    }

    /**
     * Resets the state of the &#64;checksum back to its initial state.
    */
    public void reset()  {
        JnaChecksum.INST().g_checksum_reset(asCPointer());
    }

    /**
     * Gets the length in bytes of digests of type &#64;checksum_type
     * @param checksum_type a &#35;GChecksumType
     * @return the checksum length, or -1 if &#64;checksum_type is not supported.
    */
    public static long typeGetLength(int checksum_type)  {
        return JnaChecksum.INST().g_checksum_type_get_length(checksum_type);
    }

    public static long getTypeID() { 
        return JnaChecksum.INST().g_checksum_get_type(); 
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

[MethodModel:java-type-not-supported:getDigest:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:update:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
*/
