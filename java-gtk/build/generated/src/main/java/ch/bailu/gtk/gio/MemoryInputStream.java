/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMemoryInputStream is a class for using arbitrary
 * <br>memory chunks as input for GIO streaming input operations.
 * <br>
 * <br>As of GLib 2.34, &#35;GMemoryInputStream implements
 * <br>&#35;GPollableInputStream.
 * <p><a href="https://docs.gtk.org/gio/class.MemoryInputStream.html">https://docs.gtk.org/gio/class.MemoryInputStream.html</a></p>
*/
public class MemoryInputStream extends InputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemoryInputStream.class.getCanonicalName());
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
    
    private static JnaMemoryInputStream.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMemoryInputStream.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public MemoryInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GMemoryInputStream with data from the given &#64;bytes.
     * @param bytes a &#35;GBytes
     * @return new &#35;GInputStream read from &#64;bytes
    */
    public static MemoryInputStream newFromBytesMemoryInputStream(@Nonnull ch.bailu.gtk.glib.Bytes bytes)  {
        PointerContainer __self = cast(JnaMemoryInputStream.INST().g_memory_input_stream_new_from_bytes(asCPointerNotNull(bytes)));
        if (__self.isNull()) {
            throw new NullPointerException("MemoryInputStream:newFromBytes");
        }
        return new MemoryInputStream(__self);
    }        
    

    /**
     * Creates a new &#35;GMemoryInputStream with data in memory of a given size.
     * @param data input data
     * @param len length of the data, may be -1 if &#64;data is a nul-terminated string
     * @param destroy function that is called to free &#64;data, or %NULL
     * @return new &#35;GInputStream read from &#64;data of &#64;len bytes.
    */
    public static MemoryInputStream newFromDataMemoryInputStream(@Nonnull ch.bailu.gtk.type.Pointer data, long len, OnDestroyNotify destroy)  {
        PointerContainer __self = cast(JnaMemoryInputStream.INST().g_memory_input_stream_new_from_data(asCPointerNotNull(data), len, toOnDestroyNotify(getClassHandler().getInstance(), "newFromData", destroy)));
        if (__self.isNull()) {
            throw new NullPointerException("MemoryInputStream:newFromData");
        }
        return new MemoryInputStream(__self);
    }        
    

    /**
     * Creates a new empty &#35;GMemoryInputStream.
    */
    public MemoryInputStream() {
        super(cast(JnaMemoryInputStream.INST().g_memory_input_stream_new()));
    }

    /**
     * Appends &#64;bytes to data that can be read from the input stream.
     * @param bytes input data
    */
    public void addBytes(@Nonnull ch.bailu.gtk.glib.Bytes bytes)  {
        JnaMemoryInputStream.INST().g_memory_input_stream_add_bytes(asCPointer(), asCPointerNotNull(bytes));
    }

    /**
     * Appends &#64;data to data that can be read from the input stream
     * @param data input data
     * @param len length of the data, may be -1 if &#64;data is a nul-terminated string
     * @param destroy function that is called to free &#64;data, or %NULL
    */
    public void addData(@Nonnull ch.bailu.gtk.type.Pointer data, long len, OnDestroyNotify destroy)  {
        JnaMemoryInputStream.INST().g_memory_input_stream_add_data(asCPointer(), asCPointerNotNull(data), len, toOnDestroyNotify(this, "addData", destroy));
    }

    /**
     * Implements interface {@link PollableInputStream}. Call this to get access to interface functions.
     * @return {@link PollableInputStream}
    */
    public PollableInputStream asPollableInputStream() {
        return new PollableInputStream(cast());
    }

    /**
     * Implements interface {@link Seekable}. Call this to get access to interface functions.
     * @return {@link Seekable}
    */
    public Seekable asSeekable() {
        return new Seekable(cast());
    }

    public static long getTypeID() { 
        return JnaMemoryInputStream.INST().g_memory_input_stream_get_type(); 
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
