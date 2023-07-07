/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The interface for pollable output streams.
 * <br>
 * <br>The default implementation of &#64;can_poll always returns %TRUE.
 * <br>
 * <br>The default implementation of &#64;write_nonblocking calls
 * <br>g_pollable_output_stream_is_writable(), and then calls
 * <br>g_output_stream_write() if it returns %TRUE. This means you only
 * <br>need to override it if it is possible that your &#64;is_writable
 * <br>implementation may return %TRUE when the stream is not actually
 * <br>writable.
 * <br>
 * <br>The default implementation of &#64;writev_nonblocking calls
 * <br>g_pollable_output_stream_write_nonblocking() for each vector, and converts
 * <br>its return value and error (if set) to a &#35;GPollableReturn. You should
 * <br>override this where possible to avoid having to allocate a &#35;GError to return
 * <br>%G_IO_ERROR_WOULD_BLOCK.
 * <p><a href="https://docs.gtk.org/gio/struct.PollableOutputStreamInterface.html">https://docs.gtk.org/gio/struct.PollableOutputStreamInterface.html</a></p>
*/
public class PollableOutputStreamInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PollableOutputStreamInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCanPoll {
        /**
         * 
         * @param stream a &#35;GPollableOutputStream.
         * @return %TRUE if &#64;stream is pollable, %FALSE if not.
        */
        boolean onCanPoll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableOutputStream stream);
    }
    
    private static JnaPollableOutputStreamInterface.OnCanPoll toOnCanPoll(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanPoll in) {
        JnaPollableOutputStreamInterface.OnCanPoll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onCanPoll(__callback, new PollableOutputStream(new PointerContainer(_stream)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsWritable {
        /**
         * 
         * @param stream a &#35;GPollableOutputStream.
         * @return %TRUE if &#64;stream is writable, %FALSE if not. If an error   has occurred on &#64;stream, this will result in   g_pollable_output_stream_is_writable() returning %TRUE, and the   next attempt to write will return the error.
        */
        boolean onIsWritable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableOutputStream stream);
    }
    
    private static JnaPollableOutputStreamInterface.OnIsWritable toOnIsWritable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsWritable in) {
        JnaPollableOutputStreamInterface.OnIsWritable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onIsWritable(__callback, new PollableOutputStream(new PointerContainer(_stream)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateSource {
        /**
         * 
         * @param stream a &#35;GPollableOutputStream.
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a new &#35;GSource
        */
        ch.bailu.gtk.glib.Source onCreateSource(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableOutputStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaPollableOutputStreamInterface.OnCreateSource toOnCreateSource(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateSource in) {
        JnaPollableOutputStreamInterface.OnCreateSource out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable) -> in.onCreateSource(__callback, new PollableOutputStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWriteNonblocking {
        /**
         * 
         * @param stream a &#35;GPollableOutputStream
         * @param buffer a buffer to write     data from
         * @param count the number of bytes you want to write
         * @return the number of bytes written, or -1 on error (including   %G_IO_ERROR_WOULD_BLOCK).
        */
        long onWriteNonblocking(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollableOutputStream stream, @Nullable ch.bailu.gtk.type.Pointer buffer, long count);
    }
    
    private static JnaPollableOutputStreamInterface.OnWriteNonblocking toOnWriteNonblocking(ch.bailu.gtk.type.Pointer instance, String methodName, OnWriteNonblocking in) {
        JnaPollableOutputStreamInterface.OnWriteNonblocking out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _buffer, _count, _error) -> in.onWriteNonblocking(__callback, new PollableOutputStream(new PointerContainer(_stream)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_buffer)), _count);
            __callback.register(out);
        }
        return out;
    }

    public PollableOutputStreamInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPollableOutputStreamInterface.Fields _fields;
    
    JnaPollableOutputStreamInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPollableOutputStreamInterface.Fields(asCPointer());
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
    public JnaPollableOutputStreamInterface.OnCanPoll getFieldCanPoll() {
       toFields().readField(CAN_POLL);
       return toFields().can_poll;
    } 

    /**
     * 
     * <br>See {@link OnIsWritable#onIsWritable}
    */
    public static final String IS_WRITABLE = "is_writable";

    /**
     * 
     * <br>See {@link OnIsWritable#onIsWritable}
    */
    public void setFieldIsWritable(OnIsWritable is_writable) {
        toFields().is_writable = toOnIsWritable(this, IS_WRITABLE, is_writable);
        toFields().writeField(IS_WRITABLE);
    }

    /**
     * 
     * <br>See {@link OnIsWritable#onIsWritable}
    */
    public JnaPollableOutputStreamInterface.OnIsWritable getFieldIsWritable() {
       toFields().readField(IS_WRITABLE);
       return toFields().is_writable;
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
    public JnaPollableOutputStreamInterface.OnCreateSource getFieldCreateSource() {
       toFields().readField(CREATE_SOURCE);
       return toFields().create_source;
    } 

    /**
     * 
     * <br>See {@link OnWriteNonblocking#onWriteNonblocking}
    */
    public static final String WRITE_NONBLOCKING = "write_nonblocking";

    /**
     * 
     * <br>See {@link OnWriteNonblocking#onWriteNonblocking}
    */
    public void setFieldWriteNonblocking(OnWriteNonblocking write_nonblocking) {
        toFields().write_nonblocking = toOnWriteNonblocking(this, WRITE_NONBLOCKING, write_nonblocking);
        toFields().writeField(WRITE_NONBLOCKING);
    }

    /**
     * 
     * <br>See {@link OnWriteNonblocking#onWriteNonblocking}
    */
    public JnaPollableOutputStreamInterface.OnWriteNonblocking getFieldWriteNonblocking() {
       toFields().readField(WRITE_NONBLOCKING);
       return toFields().write_nonblocking;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PollableOutputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PollableOutputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:writev_nonblocking:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
