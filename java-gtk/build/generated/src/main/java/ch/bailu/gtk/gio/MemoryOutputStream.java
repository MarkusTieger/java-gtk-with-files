/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMemoryOutputStream is a class for using arbitrary
 * <br>memory chunks as output for GIO streaming output operations.
 * <br>
 * <br>As of GLib 2.34, &#35;GMemoryOutputStream trivially implements
 * <br>&#35;GPollableOutputStream: it always polls as ready.
 * <p><a href="https://docs.gtk.org/gio/class.MemoryOutputStream.html">https://docs.gtk.org/gio/class.MemoryOutputStream.html</a></p>
*/
public class MemoryOutputStream extends OutputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemoryOutputStream.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnReallocFunc {
        /**
         * Changes the size of the memory block pointed to by &#64;data to
         * <br>&#64;size bytes.
         * <br>
         * <br>The function should have the same semantics as realloc().
         * @param data memory block to reallocate
         * @param size size to reallocate &#64;data to
         * @return a pointer to the reallocated memory
        */
        ch.bailu.gtk.type.Pointer onReallocFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, long size);
    }
    
    private static JnaMemoryOutputStream.OnReallocFunc toOnReallocFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnReallocFunc in) {
        JnaMemoryOutputStream.OnReallocFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _size) -> in.onReallocFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), _size).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaMemoryOutputStream.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMemoryOutputStream.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public MemoryOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GMemoryOutputStream, using g_realloc() and g_free()
     * <br>for memory allocation.
     * @return 
    */
    public static MemoryOutputStream newResizableMemoryOutputStream()  {
        PointerContainer __self = cast(JnaMemoryOutputStream.INST().g_memory_output_stream_new_resizable());
        if (__self.isNull()) {
            throw new NullPointerException("MemoryOutputStream:newResizable");
        }
        return new MemoryOutputStream(__self);
    }        
    

    /**
     * Creates a new &#35;GMemoryOutputStream.
     * <br>
     * <br>In most cases this is not the function you want.  See
     * <br>g_memory_output_stream_new_resizable() instead.
     * <br>
     * <br>If &#64;data is non-%NULL, the stream will use that for its internal storage.
     * <br>
     * <br>If &#64;realloc_fn is non-%NULL, it will be used for resizing the internal
     * <br>storage when necessary and the stream will be considered resizable.
     * <br>In that case, the stream will start out being (conceptually) empty.
     * <br>&#64;size is used only as a hint for how big &#64;data is.  Specifically,
     * <br>seeking to the end of a newly-created stream will seek to zero, not
     * <br>&#64;size.  Seeking past the end of the stream and then writing will
     * <br>introduce a zero-filled gap.
     * <br>
     * <br>If &#64;realloc_fn is %NULL then the stream is fixed-sized.  Seeking to
     * <br>the end will seek to &#64;size exactly.  Writing past the end will give
     * <br>an 'out of space' error.  Attempting to seek past the end will fail.
     * <br>Unlike the resizable case, seeking to an offset within the stream and
     * <br>writing will preserve the bytes passed in as &#64;data before that point
     * <br>and will return them as part of g_memory_output_stream_steal_data().
     * <br>If you intend to seek you should probably therefore ensure that &#64;data
     * <br>is properly initialised.
     * <br>
     * <br>It is probably only meaningful to provide &#64;data and &#64;size in the case
     * <br>that you want a fixed-sized stream.  Put another way: if &#64;realloc_fn
     * <br>is non-%NULL then it makes most sense to give &#64;data as %NULL and
     * <br>&#64;size as 0 (allowing &#35;GMemoryOutputStream to do the initial
     * <br>allocation for itself).
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // a stream that can grow
     * stream = g_memory_output_stream_new (NULL, 0, realloc, free);
     * 
     * // another stream that can grow
     * stream2 = g_memory_output_stream_new (NULL, 0, g_realloc, g_free);
     * 
     * // a fixed-size stream
     * data = malloc (200);
     * stream3 = g_memory_output_stream_new (data, 200, NULL, free);
     * </pre>
     * @param data pointer to a chunk of memory to use, or %NULL
     * @param size the size of &#64;data
     * @param realloc_function a function with realloc() semantics (like g_realloc())     to be called when &#64;data needs to be grown, or %NULL
     * @param destroy_function a function to be called on &#64;data when the stream is     finalized, or %NULL
    */
    public MemoryOutputStream(@Nullable ch.bailu.gtk.type.Pointer data, long size, OnReallocFunc realloc_function, OnDestroyNotify destroy_function) {
        super(cast(JnaMemoryOutputStream.INST().g_memory_output_stream_new(asCPointer(data), size, toOnReallocFunc(getClassHandler().getInstance(), "_new", realloc_function), toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy_function))));
    }

    /**
     * Gets any loaded data from the &#64;ostream.
     * <br>
     * <br>Note that the returned pointer may become invalid on the next
     * <br>write or truncate operation on the stream.
     * @return pointer to the stream's data, or %NULL if the data    has been stolen
    */
    public ch.bailu.gtk.type.Pointer getData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaMemoryOutputStream.INST().g_memory_output_stream_get_data(asCPointer())));
    }

    /**
     * Returns the number of bytes from the start up to including the last
     * <br>byte written in the stream that has not been truncated away.
     * @return the number of bytes written to the stream
    */
    public long getDataSize()  {
        return JnaMemoryOutputStream.INST().g_memory_output_stream_get_data_size(asCPointer());
    }

    /**
     * Gets the size of the currently allocated data area (available from
     * <br>g_memory_output_stream_get_data()).
     * <br>
     * <br>You probably don't want to use this function on resizable streams.
     * <br>See g_memory_output_stream_get_data_size() instead.  For resizable
     * <br>streams the size returned by this function is an implementation
     * <br>detail and may be change at any time in response to operations on the
     * <br>stream.
     * <br>
     * <br>If the stream is fixed-sized (ie: no realloc was passed to
     * <br>g_memory_output_stream_new()) then this is the maximum size of the
     * <br>stream and further writes will return %G_IO_ERROR_NO_SPACE.
     * <br>
     * <br>In any case, if you want the number of bytes currently written to the
     * <br>stream, use g_memory_output_stream_get_data_size().
     * @return the number of bytes allocated for the data buffer
    */
    public long getSize()  {
        return JnaMemoryOutputStream.INST().g_memory_output_stream_get_size(asCPointer());
    }

    /**
     * Returns data from the &#64;ostream as a &#35;GBytes. &#64;ostream must be
     * <br>closed before calling this function.
     * @return the stream's data
    */
    public ch.bailu.gtk.glib.Bytes stealAsBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaMemoryOutputStream.INST().g_memory_output_stream_steal_as_bytes(asCPointer())));
    }

    /**
     * Gets any loaded data from the &#64;ostream. Ownership of the data
     * <br>is transferred to the caller; when no longer needed it must be
     * <br>freed using the free function set in &#64;ostream's
     * <br>&#35;GMemoryOutputStream:destroy-function property.
     * <br>
     * <br>&#64;ostream must be closed before calling this function.
     * @return the stream's data, or %NULL if it has previously    been stolen
    */
    public ch.bailu.gtk.type.Pointer stealData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaMemoryOutputStream.INST().g_memory_output_stream_steal_data(asCPointer())));
    }

    /**
     * Implements interface {@link PollableOutputStream}. Call this to get access to interface functions.
     * @return {@link PollableOutputStream}
    */
    public PollableOutputStream asPollableOutputStream() {
        return new PollableOutputStream(cast());
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaMemoryOutputStream.INST().g_memory_output_stream_get_type(); 
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
