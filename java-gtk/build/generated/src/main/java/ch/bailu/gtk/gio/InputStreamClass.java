/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.InputStreamClass.html">https://docs.gtk.org/gio/struct.InputStreamClass.html</a></p>
*/
public class InputStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InputStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnReadFn {
        /**
         * 
         * @param stream 
         * @param buffer 
         * @param count 
         * @param cancellable 
         * @return 
        */
        long onReadFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, @Nullable ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable);
    }
    
    private static JnaInputStreamClass.OnReadFn toOnReadFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnReadFn in) {
        JnaInputStreamClass.OnReadFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _buffer, _count, _cancellable, _error) -> in.onReadFn(__callback, new InputStream(new PointerContainer(_stream)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_buffer)), _count, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSkip {
        /**
         * 
         * @param stream a &#35;GInputStream.
         * @param count the number of bytes that will be skipped from the stream
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return Number of bytes skipped, or -1 on error
        */
        long onSkip(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, long count, @Nullable Cancellable cancellable);
    }
    
    private static JnaInputStreamClass.OnSkip toOnSkip(ch.bailu.gtk.type.Pointer instance, String methodName, OnSkip in) {
        JnaInputStreamClass.OnSkip out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _count, _cancellable, _error) -> in.onSkip(__callback, new InputStream(new PointerContainer(_stream)), _count, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFn {
        /**
         * 
         * @param stream 
         * @param cancellable 
         * @return 
        */
        boolean onCloseFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaInputStreamClass.OnCloseFn toOnCloseFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFn in) {
        JnaInputStreamClass.OnCloseFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable, _error) -> in.onCloseFn(__callback, new InputStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReadFinish {
        /**
         * 
         * @param stream a &#35;GInputStream.
         * @param result a &#35;GAsyncResult.
         * @return number of bytes read in, or -1 on error, or 0 on end of file.
        */
        long onReadFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaInputStreamClass.OnReadFinish toOnReadFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnReadFinish in) {
        JnaInputStreamClass.OnReadFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onReadFinish(__callback, new InputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSkipFinish {
        /**
         * 
         * @param stream a &#35;GInputStream.
         * @param result a &#35;GAsyncResult.
         * @return the size of the bytes skipped, or `-1` on error.
        */
        long onSkipFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaInputStreamClass.OnSkipFinish toOnSkipFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnSkipFinish in) {
        JnaInputStreamClass.OnSkipFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onSkipFinish(__callback, new InputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFinish {
        /**
         * 
         * @param stream a &#35;GInputStream.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the stream was closed successfully.
        */
        boolean onCloseFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull InputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaInputStreamClass.OnCloseFinish toOnCloseFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFinish in) {
        JnaInputStreamClass.OnCloseFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onCloseFinish(__callback, new InputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaInputStreamClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaInputStreamClass.OnGReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved2 {
        void onGReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaInputStreamClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaInputStreamClass.OnGReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved3 {
        void onGReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaInputStreamClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaInputStreamClass.OnGReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved4 {
        void onGReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaInputStreamClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaInputStreamClass.OnGReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved5 {
        void onGReserved5(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaInputStreamClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaInputStreamClass.OnGReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    public InputStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    public InputStreamClass() {
        super(cast(JnaInputStreamClass.allocateStructure()));
    }

    private JnaInputStreamClass.Fields _fields;
    
    JnaInputStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInputStreamClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnReadFn#onReadFn}
    */
    public static final String READ_FN = "read_fn";

    /**
     * 
     * <br>See {@link OnReadFn#onReadFn}
    */
    public void setFieldReadFn(OnReadFn read_fn) {
        toFields().read_fn = toOnReadFn(this, READ_FN, read_fn);
        toFields().writeField(READ_FN);
    }

    /**
     * 
     * <br>See {@link OnReadFn#onReadFn}
    */
    public JnaInputStreamClass.OnReadFn getFieldReadFn() {
       toFields().readField(READ_FN);
       return toFields().read_fn;
    } 

    /**
     * 
     * <br>See {@link OnSkip#onSkip}
    */
    public static final String SKIP = "skip";

    /**
     * 
     * <br>See {@link OnSkip#onSkip}
    */
    public void setFieldSkip(OnSkip skip) {
        toFields().skip = toOnSkip(this, SKIP, skip);
        toFields().writeField(SKIP);
    }

    /**
     * 
     * <br>See {@link OnSkip#onSkip}
    */
    public JnaInputStreamClass.OnSkip getFieldSkip() {
       toFields().readField(SKIP);
       return toFields().skip;
    } 

    /**
     * 
     * <br>See {@link OnCloseFn#onCloseFn}
    */
    public static final String CLOSE_FN = "close_fn";

    /**
     * 
     * <br>See {@link OnCloseFn#onCloseFn}
    */
    public void setFieldCloseFn(OnCloseFn close_fn) {
        toFields().close_fn = toOnCloseFn(this, CLOSE_FN, close_fn);
        toFields().writeField(CLOSE_FN);
    }

    /**
     * 
     * <br>See {@link OnCloseFn#onCloseFn}
    */
    public JnaInputStreamClass.OnCloseFn getFieldCloseFn() {
       toFields().readField(CLOSE_FN);
       return toFields().close_fn;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String READ_ASYNC = "read_async";

    /**
     * 
     * <br>See {@link OnReadFinish#onReadFinish}
    */
    public static final String READ_FINISH = "read_finish";

    /**
     * 
     * <br>See {@link OnReadFinish#onReadFinish}
    */
    public void setFieldReadFinish(OnReadFinish read_finish) {
        toFields().read_finish = toOnReadFinish(this, READ_FINISH, read_finish);
        toFields().writeField(READ_FINISH);
    }

    /**
     * 
     * <br>See {@link OnReadFinish#onReadFinish}
    */
    public JnaInputStreamClass.OnReadFinish getFieldReadFinish() {
       toFields().readField(READ_FINISH);
       return toFields().read_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SKIP_ASYNC = "skip_async";

    /**
     * 
     * <br>See {@link OnSkipFinish#onSkipFinish}
    */
    public static final String SKIP_FINISH = "skip_finish";

    /**
     * 
     * <br>See {@link OnSkipFinish#onSkipFinish}
    */
    public void setFieldSkipFinish(OnSkipFinish skip_finish) {
        toFields().skip_finish = toOnSkipFinish(this, SKIP_FINISH, skip_finish);
        toFields().writeField(SKIP_FINISH);
    }

    /**
     * 
     * <br>See {@link OnSkipFinish#onSkipFinish}
    */
    public JnaInputStreamClass.OnSkipFinish getFieldSkipFinish() {
       toFields().readField(SKIP_FINISH);
       return toFields().skip_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String CLOSE_ASYNC = "close_async";

    /**
     * 
     * <br>See {@link OnCloseFinish#onCloseFinish}
    */
    public static final String CLOSE_FINISH = "close_finish";

    /**
     * 
     * <br>See {@link OnCloseFinish#onCloseFinish}
    */
    public void setFieldCloseFinish(OnCloseFinish close_finish) {
        toFields().close_finish = toOnCloseFinish(this, CLOSE_FINISH, close_finish);
        toFields().writeField(CLOSE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnCloseFinish#onCloseFinish}
    */
    public JnaInputStreamClass.OnCloseFinish getFieldCloseFinish() {
       toFields().readField(CLOSE_FINISH);
       return toFields().close_finish;
    } 

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public static final String _G_RESERVED1 = "_g_reserved1";

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public void setFieldGReserved1(OnGReserved1 _g_reserved1) {
        toFields()._g_reserved1 = toOnGReserved1(this, _G_RESERVED1, _g_reserved1);
        toFields().writeField(_G_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public JnaInputStreamClass.OnGReserved1 getFieldGReserved1() {
       toFields().readField(_G_RESERVED1);
       return toFields()._g_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public static final String _G_RESERVED2 = "_g_reserved2";

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public void setFieldGReserved2(OnGReserved2 _g_reserved2) {
        toFields()._g_reserved2 = toOnGReserved2(this, _G_RESERVED2, _g_reserved2);
        toFields().writeField(_G_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public JnaInputStreamClass.OnGReserved2 getFieldGReserved2() {
       toFields().readField(_G_RESERVED2);
       return toFields()._g_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public static final String _G_RESERVED3 = "_g_reserved3";

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public void setFieldGReserved3(OnGReserved3 _g_reserved3) {
        toFields()._g_reserved3 = toOnGReserved3(this, _G_RESERVED3, _g_reserved3);
        toFields().writeField(_G_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public JnaInputStreamClass.OnGReserved3 getFieldGReserved3() {
       toFields().readField(_G_RESERVED3);
       return toFields()._g_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public static final String _G_RESERVED4 = "_g_reserved4";

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public void setFieldGReserved4(OnGReserved4 _g_reserved4) {
        toFields()._g_reserved4 = toOnGReserved4(this, _G_RESERVED4, _g_reserved4);
        toFields().writeField(_G_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public JnaInputStreamClass.OnGReserved4 getFieldGReserved4() {
       toFields().readField(_G_RESERVED4);
       return toFields()._g_reserved4;
    } 

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public static final String _G_RESERVED5 = "_g_reserved5";

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public void setFieldGReserved5(OnGReserved5 _g_reserved5) {
        toFields()._g_reserved5 = toOnGReserved5(this, _G_RESERVED5, _g_reserved5);
        toFields().writeField(_G_RESERVED5);
    }

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public JnaInputStreamClass.OnGReserved5 getFieldGReserved5() {
       toFields().readField(_G_RESERVED5);
       return toFields()._g_reserved5;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
