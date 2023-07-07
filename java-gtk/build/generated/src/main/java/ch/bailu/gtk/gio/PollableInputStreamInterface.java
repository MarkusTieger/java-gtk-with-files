/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The interface for pollable input streams.
 * <br>
 * <br>The default implementation of &#64;can_poll always returns %TRUE.
 * <br>
 * <br>The default implementation of &#64;read_nonblocking calls
 * <br>g_pollable_input_stream_is_readable(), and then calls
 * <br>g_input_stream_read() if it returns %TRUE. This means you only need
 * <br>to override it if it is possible that your &#64;is_readable
 * <br>implementation may return %TRUE when the stream is not actually
 * <br>readable.
 * <p><a href="https://docs.gtk.org/gio/struct.PollableInputStreamInterface.html">https://docs.gtk.org/gio/struct.PollableInputStreamInterface.html</a></p>
*/
public class PollableInputStreamInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PollableInputStreamInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCanPoll {
        /**
         * 
         * @param stream a &#35;GPollableInputStream.
         * @return %TRUE if &#64;stream is pollable, %FALSE if not.
        */
        boolean onCanPoll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableInputStream stream);
    }
    
    private static JnaPollableInputStreamInterface.OnCanPoll toOnCanPoll(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanPoll in) {
        JnaPollableInputStreamInterface.OnCanPoll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onCanPoll(__callback, new PollableInputStream(new PointerContainer(_stream)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsReadable {
        /**
         * 
         * @param stream a &#35;GPollableInputStream.
         * @return %TRUE if &#64;stream is readable, %FALSE if not. If an error   has occurred on &#64;stream, this will result in   g_pollable_input_stream_is_readable() returning %TRUE, and the   next attempt to read will return the error.
        */
        boolean onIsReadable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableInputStream stream);
    }
    
    private static JnaPollableInputStreamInterface.OnIsReadable toOnIsReadable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsReadable in) {
        JnaPollableInputStreamInterface.OnIsReadable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onIsReadable(__callback, new PollableInputStream(new PointerContainer(_stream)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateSource {
        /**
         * 
         * @param stream a &#35;GPollableInputStream.
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a new &#35;GSource
        */
        ch.bailu.gtk.glib.Source onCreateSource(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableInputStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaPollableInputStreamInterface.OnCreateSource toOnCreateSource(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateSource in) {
        JnaPollableInputStreamInterface.OnCreateSource out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable) -> in.onCreateSource(__callback, new PollableInputStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReadNonblocking {
        /**
         * 
         * @param stream a &#35;GPollableInputStream
         * @param buffer a     buffer to read data into (which should be at least &#64;count bytes long).
         * @param count the number of bytes you want to read
         * @return the number of bytes read, or -1 on error (including   %G_IO_ERROR_WOULD_BLOCK).
        */
        long onReadNonblocking(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableInputStream stream, @Nullable ch.bailu.gtk.type.Pointer buffer, long count);
    }
    
    private static JnaPollableInputStreamInterface.OnReadNonblocking toOnReadNonblocking(ch.bailu.gtk.type.Pointer instance, String methodName, OnReadNonblocking in) {
        JnaPollableInputStreamInterface.OnReadNonblocking out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _buffer, _count, _error) -> in.onReadNonblocking(__callback, new PollableInputStream(new PointerContainer(_stream)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_buffer)), _count);
            __callback.register(out);
        }
        return out;
    }

    public PollableInputStreamInterface(PointerContainer pointer) {
        super(pointer);
    }

    public PollableInputStreamInterface() {
        super(cast(JnaPollableInputStreamInterface.allocateStructure()));
    }

    private JnaPollableInputStreamInterface.Fields _fields;
    
    JnaPollableInputStreamInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPollableInputStreamInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnCanPoll#onCanPoll}
    */
    public static final String CAN_POLL = "can_poll";

    /**
     * 
     * <br>See {@link OnCanPoll#onCanPoll}
    */
    public void setFieldCanPoll(OnCanPoll can_poll) {
        toFields().can_poll = toOnCanPoll(this, CAN_POLL, can_poll);
        toFields().writeField(CAN_POLL);
    }

    /**
     * 
     * <br>See {@link OnCanPoll#onCanPoll}
    */
    public JnaPollableInputStreamInterface.OnCanPoll getFieldCanPoll() {
       toFields().readField(CAN_POLL);
       return toFields().can_poll;
    } 

    /**
     * 
     * <br>See {@link OnIsReadable#onIsReadable}
    */
    public static final String IS_READABLE = "is_readable";

    /**
     * 
     * <br>See {@link OnIsReadable#onIsReadable}
    */
    public void setFieldIsReadable(OnIsReadable is_readable) {
        toFields().is_readable = toOnIsReadable(this, IS_READABLE, is_readable);
        toFields().writeField(IS_READABLE);
    }

    /**
     * 
     * <br>See {@link OnIsReadable#onIsReadable}
    */
    public JnaPollableInputStreamInterface.OnIsReadable getFieldIsReadable() {
       toFields().readField(IS_READABLE);
       return toFields().is_readable;
    } 

    /**
     * 
     * <br>See {@link OnCreateSource#onCreateSource}
    */
    public static final String CREATE_SOURCE = "create_source";

    /**
     * 
     * <br>See {@link OnCreateSource#onCreateSource}
    */
    public void setFieldCreateSource(OnCreateSource create_source) {
        toFields().create_source = toOnCreateSource(this, CREATE_SOURCE, create_source);
        toFields().writeField(CREATE_SOURCE);
    }

    /**
     * 
     * <br>See {@link OnCreateSource#onCreateSource}
    */
    public JnaPollableInputStreamInterface.OnCreateSource getFieldCreateSource() {
       toFields().readField(CREATE_SOURCE);
       return toFields().create_source;
    } 

    /**
     * 
     * <br>See {@link OnReadNonblocking#onReadNonblocking}
    */
    public static final String READ_NONBLOCKING = "read_nonblocking";

    /**
     * 
     * <br>See {@link OnReadNonblocking#onReadNonblocking}
    */
    public void setFieldReadNonblocking(OnReadNonblocking read_nonblocking) {
        toFields().read_nonblocking = toOnReadNonblocking(this, READ_NONBLOCKING, read_nonblocking);
        toFields().writeField(READ_NONBLOCKING);
    }

    /**
     * 
     * <br>See {@link OnReadNonblocking#onReadNonblocking}
    */
    public JnaPollableInputStreamInterface.OnReadNonblocking getFieldReadNonblocking() {
       toFields().readField(READ_NONBLOCKING);
       return toFields().read_nonblocking;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PollableInputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PollableInputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
