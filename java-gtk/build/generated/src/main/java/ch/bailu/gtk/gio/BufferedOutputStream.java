/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Buffered output stream implements &#35;GFilterOutputStream and provides
 * <br>for buffered writes.
 * <br>
 * <br>By default, &#35;GBufferedOutputStream's buffer size is set at 4 kilobytes.
 * <br>
 * <br>To create a buffered output stream, use g_buffered_output_stream_new(),
 * <br>or g_buffered_output_stream_new_sized() to specify the buffer's size
 * <br>at construction.
 * <br>
 * <br>To get the size of a buffer within a buffered input stream, use
 * <br>g_buffered_output_stream_get_buffer_size(). To change the size of a
 * <br>buffered output stream's buffer, use
 * <br>g_buffered_output_stream_set_buffer_size(). Note that the buffer's
 * <br>size cannot be reduced below the size of the data within the buffer.
 * <p><a href="https://docs.gtk.org/gio/class.BufferedOutputStream.html">https://docs.gtk.org/gio/class.BufferedOutputStream.html</a></p>
*/
public class BufferedOutputStream extends FilterOutputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BufferedOutputStream.class.getCanonicalName());
    }

    public BufferedOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new buffered output stream with a given buffer size.
     * @param base_stream a &#35;GOutputStream.
     * @param size a &#35;gsize.
     * @return a &#35;GOutputStream with an internal buffer set to &#64;size.
    */
    public static BufferedOutputStream newSizedBufferedOutputStream(@Nonnull OutputStream base_stream, long size)  {
        PointerContainer __self = cast(JnaBufferedOutputStream.INST().g_buffered_output_stream_new_sized(asCPointerNotNull(base_stream), size));
        if (__self.isNull()) {
            throw new NullPointerException("BufferedOutputStream:newSized");
        }
        return new BufferedOutputStream(__self);
    }        
    

    /**
     * Creates a new buffered output stream for a base stream.
     * @param base_stream a &#35;GOutputStream.
    */
    public BufferedOutputStream(@Nonnull OutputStream base_stream) {
        super(cast(JnaBufferedOutputStream.INST().g_buffered_output_stream_new(asCPointerNotNull(base_stream))));
    }

    /**
     * Checks if the buffer automatically grows as data is added.
     * @return %TRUE if the &#64;stream's buffer automatically grows, %FALSE otherwise.
    */
    public boolean getAutoGrow()  {
        return JnaBufferedOutputStream.INST().g_buffered_output_stream_get_auto_grow(asCPointer());
    }

    /**
     * Gets the size of the buffer in the &#64;stream.
     * @return the current size of the buffer.
    */
    public long getBufferSize()  {
        return JnaBufferedOutputStream.INST().g_buffered_output_stream_get_buffer_size(asCPointer());
    }

    /**
     * Sets whether or not the &#64;stream's buffer should automatically grow.
     * <br>If &#64;auto_grow is true, then each write will just make the buffer
     * <br>larger, and you must manually flush the buffer to actually write out
     * <br>the data to the underlying stream.
     * @param auto_grow a &#35;gboolean.
    */
    public void setAutoGrow(boolean auto_grow)  {
        JnaBufferedOutputStream.INST().g_buffered_output_stream_set_auto_grow(asCPointer(), auto_grow);
    }

    /**
     * Sets the size of the internal buffer to &#64;size.
     * @param size a &#35;gsize.
    */
    public void setBufferSize(long size)  {
        JnaBufferedOutputStream.INST().g_buffered_output_stream_set_buffer_size(asCPointer(), size);
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaBufferedOutputStream.INST().g_buffered_output_stream_get_type(); 
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
*/
