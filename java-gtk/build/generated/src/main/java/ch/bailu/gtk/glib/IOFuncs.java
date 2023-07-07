/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A table of functions used to handle different types of &#35;GIOChannel
 * <br>in a generic way.
 * <p><a href="https://docs.gtk.org/glib/struct.IOFuncs.html">https://docs.gtk.org/glib/struct.IOFuncs.html</a></p>
*/
public class IOFuncs extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOFuncs.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIoRead {
        /**
         * 
         * @param channel 
         * @param buf 
         * @param count 
         * @param bytes_read 
         * @return 
        */
        int onIoRead(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel, @Nonnull ch.bailu.gtk.type.Str buf, long count, @Nonnull ch.bailu.gtk.type.Int64 bytes_read);
    }
    
    private static JnaIOFuncs.OnIoRead toOnIoRead(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoRead in) {
        JnaIOFuncs.OnIoRead out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _buf, _count, _bytes_read, _error) -> in.onIoRead(__callback, new IOChannel(new PointerContainer(_channel)), new ch.bailu.gtk.type.Str(new PointerContainer(_buf)), _count, new ch.bailu.gtk.type.Int64(new PointerContainer(_bytes_read)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoWrite {
        /**
         * 
         * @param channel 
         * @param buf 
         * @param count 
         * @param bytes_written 
         * @return 
        */
        int onIoWrite(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel, @Nonnull ch.bailu.gtk.type.Str buf, long count, @Nonnull ch.bailu.gtk.type.Int64 bytes_written);
    }
    
    private static JnaIOFuncs.OnIoWrite toOnIoWrite(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoWrite in) {
        JnaIOFuncs.OnIoWrite out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _buf, _count, _bytes_written, _error) -> in.onIoWrite(__callback, new IOChannel(new PointerContainer(_channel)), new ch.bailu.gtk.type.Str(new PointerContainer(_buf)), _count, new ch.bailu.gtk.type.Int64(new PointerContainer(_bytes_written)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoSeek {
        /**
         * 
         * @param channel 
         * @param offset 
         * @param type 
         * @return 
        */
        int onIoSeek(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel, long offset, int type);
    }
    
    private static JnaIOFuncs.OnIoSeek toOnIoSeek(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoSeek in) {
        JnaIOFuncs.OnIoSeek out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _offset, _type, _error) -> in.onIoSeek(__callback, new IOChannel(new PointerContainer(_channel)), _offset, _type);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoClose {
        /**
         * 
         * @param channel 
         * @return 
        */
        int onIoClose(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel);
    }
    
    private static JnaIOFuncs.OnIoClose toOnIoClose(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoClose in) {
        JnaIOFuncs.OnIoClose out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _error) -> in.onIoClose(__callback, new IOChannel(new PointerContainer(_channel)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoCreateWatch {
        /**
         * 
         * @param channel 
         * @param condition 
         * @return 
        */
        Source onIoCreateWatch(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel, int condition);
    }
    
    private static JnaIOFuncs.OnIoCreateWatch toOnIoCreateWatch(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoCreateWatch in) {
        JnaIOFuncs.OnIoCreateWatch out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _condition) -> in.onIoCreateWatch(__callback, new IOChannel(new PointerContainer(_channel)), _condition).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoFree {
        /**
         * 
         * @param channel 
        */
        void onIoFree(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel);
    }
    
    private static JnaIOFuncs.OnIoFree toOnIoFree(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoFree in) {
        JnaIOFuncs.OnIoFree out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel) -> in.onIoFree(__callback, new IOChannel(new PointerContainer(_channel)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoSetFlags {
        /**
         * 
         * @param channel 
         * @param flags 
         * @return 
        */
        int onIoSetFlags(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel, int flags);
    }
    
    private static JnaIOFuncs.OnIoSetFlags toOnIoSetFlags(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoSetFlags in) {
        JnaIOFuncs.OnIoSetFlags out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel, _flags, _error) -> in.onIoSetFlags(__callback, new IOChannel(new PointerContainer(_channel)), _flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIoGetFlags {
        /**
         * 
         * @param channel 
         * @return 
        */
        int onIoGetFlags(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel channel);
    }
    
    private static JnaIOFuncs.OnIoGetFlags toOnIoGetFlags(ch.bailu.gtk.type.Pointer instance, String methodName, OnIoGetFlags in) {
        JnaIOFuncs.OnIoGetFlags out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_channel) -> in.onIoGetFlags(__callback, new IOChannel(new PointerContainer(_channel)));
            __callback.register(out);
        }
        return out;
    }

    public IOFuncs(PointerContainer pointer) {
        super(pointer);
    }

    public IOFuncs() {
        super(cast(JnaIOFuncs.allocateStructure()));
    }

    private JnaIOFuncs.Fields _fields;
    
    JnaIOFuncs.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaIOFuncs.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnIoRead#onIoRead}
    */
    public static final String IO_READ = "io_read";

    /**
     * 
     * <br>See {@link OnIoRead#onIoRead}
    */
    public void setFieldIoRead(OnIoRead io_read) {
        toFields().io_read = toOnIoRead(this, IO_READ, io_read);
        toFields().writeField(IO_READ);
    }

    /**
     * 
     * <br>See {@link OnIoRead#onIoRead}
    */
    public JnaIOFuncs.OnIoRead getFieldIoRead() {
       toFields().readField(IO_READ);
       return toFields().io_read;
    } 

    /**
     * 
     * <br>See {@link OnIoWrite#onIoWrite}
    */
    public static final String IO_WRITE = "io_write";

    /**
     * 
     * <br>See {@link OnIoWrite#onIoWrite}
    */
    public void setFieldIoWrite(OnIoWrite io_write) {
        toFields().io_write = toOnIoWrite(this, IO_WRITE, io_write);
        toFields().writeField(IO_WRITE);
    }

    /**
     * 
     * <br>See {@link OnIoWrite#onIoWrite}
    */
    public JnaIOFuncs.OnIoWrite getFieldIoWrite() {
       toFields().readField(IO_WRITE);
       return toFields().io_write;
    } 

    /**
     * 
     * <br>See {@link OnIoSeek#onIoSeek}
    */
    public static final String IO_SEEK = "io_seek";

    /**
     * 
     * <br>See {@link OnIoSeek#onIoSeek}
    */
    public void setFieldIoSeek(OnIoSeek io_seek) {
        toFields().io_seek = toOnIoSeek(this, IO_SEEK, io_seek);
        toFields().writeField(IO_SEEK);
    }

    /**
     * 
     * <br>See {@link OnIoSeek#onIoSeek}
    */
    public JnaIOFuncs.OnIoSeek getFieldIoSeek() {
       toFields().readField(IO_SEEK);
       return toFields().io_seek;
    } 

    /**
     * 
     * <br>See {@link OnIoClose#onIoClose}
    */
    public static final String IO_CLOSE = "io_close";

    /**
     * 
     * <br>See {@link OnIoClose#onIoClose}
    */
    public void setFieldIoClose(OnIoClose io_close) {
        toFields().io_close = toOnIoClose(this, IO_CLOSE, io_close);
        toFields().writeField(IO_CLOSE);
    }

    /**
     * 
     * <br>See {@link OnIoClose#onIoClose}
    */
    public JnaIOFuncs.OnIoClose getFieldIoClose() {
       toFields().readField(IO_CLOSE);
       return toFields().io_close;
    } 

    /**
     * 
     * <br>See {@link OnIoCreateWatch#onIoCreateWatch}
    */
    public static final String IO_CREATE_WATCH = "io_create_watch";

    /**
     * 
     * <br>See {@link OnIoCreateWatch#onIoCreateWatch}
    */
    public void setFieldIoCreateWatch(OnIoCreateWatch io_create_watch) {
        toFields().io_create_watch = toOnIoCreateWatch(this, IO_CREATE_WATCH, io_create_watch);
        toFields().writeField(IO_CREATE_WATCH);
    }

    /**
     * 
     * <br>See {@link OnIoCreateWatch#onIoCreateWatch}
    */
    public JnaIOFuncs.OnIoCreateWatch getFieldIoCreateWatch() {
       toFields().readField(IO_CREATE_WATCH);
       return toFields().io_create_watch;
    } 

    /**
     * 
     * <br>See {@link OnIoFree#onIoFree}
    */
    public static final String IO_FREE = "io_free";

    /**
     * 
     * <br>See {@link OnIoFree#onIoFree}
    */
    public void setFieldIoFree(OnIoFree io_free) {
        toFields().io_free = toOnIoFree(this, IO_FREE, io_free);
        toFields().writeField(IO_FREE);
    }

    /**
     * 
     * <br>See {@link OnIoFree#onIoFree}
    */
    public JnaIOFuncs.OnIoFree getFieldIoFree() {
       toFields().readField(IO_FREE);
       return toFields().io_free;
    } 

    /**
     * 
     * <br>See {@link OnIoSetFlags#onIoSetFlags}
    */
    public static final String IO_SET_FLAGS = "io_set_flags";

    /**
     * 
     * <br>See {@link OnIoSetFlags#onIoSetFlags}
    */
    public void setFieldIoSetFlags(OnIoSetFlags io_set_flags) {
        toFields().io_set_flags = toOnIoSetFlags(this, IO_SET_FLAGS, io_set_flags);
        toFields().writeField(IO_SET_FLAGS);
    }

    /**
     * 
     * <br>See {@link OnIoSetFlags#onIoSetFlags}
    */
    public JnaIOFuncs.OnIoSetFlags getFieldIoSetFlags() {
       toFields().readField(IO_SET_FLAGS);
       return toFields().io_set_flags;
    } 

    /**
     * 
     * <br>See {@link OnIoGetFlags#onIoGetFlags}
    */
    public static final String IO_GET_FLAGS = "io_get_flags";

    /**
     * 
     * <br>See {@link OnIoGetFlags#onIoGetFlags}
    */
    public void setFieldIoGetFlags(OnIoGetFlags io_get_flags) {
        toFields().io_get_flags = toOnIoGetFlags(this, IO_GET_FLAGS, io_get_flags);
        toFields().writeField(IO_GET_FLAGS);
    }

    /**
     * 
     * <br>See {@link OnIoGetFlags#onIoGetFlags}
    */
    public JnaIOFuncs.OnIoGetFlags getFieldIoGetFlags() {
       toFields().readField(IO_GET_FLAGS);
       return toFields().io_get_flags;
    } 

}

/*
record-type
all-fields-supported
*/
