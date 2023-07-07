/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Data output stream implements &#35;GOutputStream and includes functions for
 * <br>writing data directly to an output stream.
 * <p><a href="https://docs.gtk.org/gio/class.DataOutputStream.html">https://docs.gtk.org/gio/class.DataOutputStream.html</a></p>
*/
public class DataOutputStream extends FilterOutputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DataOutputStream.class.getCanonicalName());
    }

    public DataOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new data output stream for &#64;base_stream.
     * @param base_stream a &#35;GOutputStream.
    */
    public DataOutputStream(@Nonnull OutputStream base_stream) {
        super(cast(JnaDataOutputStream.INST().g_data_output_stream_new(asCPointerNotNull(base_stream))));
    }

    /**
     * Gets the byte order for the stream.
     * @return the &#35;GDataStreamByteOrder for the &#64;stream.
    */
    public int getByteOrder()  {
        return JnaDataOutputStream.INST().g_data_output_stream_get_byte_order(asCPointer());
    }

    /**
     * Puts a signed 16-bit integer into the output stream.
     * @param data a &#35;gint16.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putInt16(int data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_int16(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Puts a signed 32-bit integer into the output stream.
     * @param data a &#35;gint32.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putInt32(int data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_int32(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Puts a signed 64-bit integer into the stream.
     * @param data a &#35;gint64.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putInt64(long data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_int64(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Puts a string into the output stream.
     * @param str a string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;string was successfully added to the &#64;stream.
    */
    public boolean putString(@Nonnull ch.bailu.gtk.type.Str str, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_string(asCPointer(), asCPointerNotNull(str), asCPointer(cancellable), 0L);
    }

    /**
     * Puts a string into the output stream.
     * @param str a string.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;string was successfully added to the &#64;stream.
    */
    public boolean putString(String str, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_string(asCPointer(), str, asCPointer(cancellable), 0L);
    }

    /**
     * Puts an unsigned 16-bit integer into the output stream.
     * @param data a &#35;guint16.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putUint16(int data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_uint16(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Puts an unsigned 32-bit integer into the stream.
     * @param data a &#35;guint32.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putUint32(int data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_uint32(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Puts an unsigned 64-bit integer into the stream.
     * @param data a &#35;guint64.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if &#64;data was successfully added to the &#64;stream.
    */
    public boolean putUint64(long data, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDataOutputStream.INST().g_data_output_stream_put_uint64(asCPointer(), data, asCPointer(cancellable), 0L);
    }

    /**
     * Sets the byte order of the data output stream to &#64;order.
     * @param order a %GDataStreamByteOrder.
    */
    public void setByteOrder(int order)  {
        JnaDataOutputStream.INST().g_data_output_stream_set_byte_order(asCPointer(), order);
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaDataOutputStream.INST().g_data_output_stream_get_type(); 
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
class-type

[MethodModel:java-type-not-supported:putByte:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
