/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.IOStreamClass.html">https://docs.gtk.org/gio/struct.IOStreamClass.html</a></p>
*/
public class IOStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetInputStream {
        /**
         * 
         * @param stream a &#35;GIOStream
         * @return a &#35;GInputStream, owned by the &#35;GIOStream. Do not free.
        */
        InputStream onGetInputStream(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOStream stream);
    }
    
    private static JnaIOStreamClass.OnGetInputStream toOnGetInputStream(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInputStream in) {
        JnaIOStreamClass.OnGetInputStream out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onGetInputStream(__callback, new IOStream(new PointerContainer(_stream))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetOutputStream {
        /**
         * 
         * @param stream a &#35;GIOStream
         * @return a &#35;GOutputStream, owned by the &#35;GIOStream. Do not free.
        */
        OutputStream onGetOutputStream(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOStream stream);
    }
    
    private static JnaIOStreamClass.OnGetOutputStream toOnGetOutputStream(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetOutputStream in) {
        JnaIOStreamClass.OnGetOutputStream out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream) -> in.onGetOutputStream(__callback, new IOStream(new PointerContainer(_stream))).asCPointer();
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
        boolean onCloseFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaIOStreamClass.OnCloseFn toOnCloseFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFn in) {
        JnaIOStreamClass.OnCloseFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable, _error) -> in.onCloseFn(__callback, new IOStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFinish {
        /**
         * 
         * @param stream a &#35;GIOStream
         * @param result a &#35;GAsyncResult
         * @return %TRUE if stream was successfully closed, %FALSE otherwise.
        */
        boolean onCloseFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaIOStreamClass.OnCloseFinish toOnCloseFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFinish in) {
        JnaIOStreamClass.OnCloseFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onCloseFinish(__callback, new IOStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaIOStreamClass.OnGReserved1 out = null;
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
    
    private static JnaIOStreamClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaIOStreamClass.OnGReserved2 out = null;
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
    
    private static JnaIOStreamClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaIOStreamClass.OnGReserved3 out = null;
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
    
    private static JnaIOStreamClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaIOStreamClass.OnGReserved4 out = null;
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
    
    private static JnaIOStreamClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaIOStreamClass.OnGReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved6 {
        void onGReserved6(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved6 toOnGReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved6 in) {
        JnaIOStreamClass.OnGReserved6 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved6(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved7 {
        void onGReserved7(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved7 toOnGReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved7 in) {
        JnaIOStreamClass.OnGReserved7 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved7(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved8 {
        void onGReserved8(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved8 toOnGReserved8(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved8 in) {
        JnaIOStreamClass.OnGReserved8 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved8(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved9 {
        void onGReserved9(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved9 toOnGReserved9(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved9 in) {
        JnaIOStreamClass.OnGReserved9 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved9(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved10 {
        void onGReserved10(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaIOStreamClass.OnGReserved10 toOnGReserved10(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved10 in) {
        JnaIOStreamClass.OnGReserved10 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved10(__callback);
            __callback.register(out);
        }
        return out;
    }

    public IOStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    public IOStreamClass() {
        super(cast(JnaIOStreamClass.allocateStructure()));
    }

    private JnaIOStreamClass.Fields _fields;
    
    JnaIOStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaIOStreamClass.Fields(asCPointer());
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
     * <br>See {@link OnGetInputStream#onGetInputStream}
    */
    public static final String GET_INPUT_STREAM = "get_input_stream";

    /**
     * 
     * <br>See {@link OnGetInputStream#onGetInputStream}
    */
    public void setFieldGetInputStream(OnGetInputStream get_input_stream) {
        toFields().get_input_stream = toOnGetInputStream(this, GET_INPUT_STREAM, get_input_stream);
        toFields().writeField(GET_INPUT_STREAM);
    }

    /**
     * 
     * <br>See {@link OnGetInputStream#onGetInputStream}
    */
    public JnaIOStreamClass.OnGetInputStream getFieldGetInputStream() {
       toFields().readField(GET_INPUT_STREAM);
       return toFields().get_input_stream;
    } 

    /**
     * 
     * <br>See {@link OnGetOutputStream#onGetOutputStream}
    */
    public static final String GET_OUTPUT_STREAM = "get_output_stream";

    /**
     * 
     * <br>See {@link OnGetOutputStream#onGetOutputStream}
    */
    public void setFieldGetOutputStream(OnGetOutputStream get_output_stream) {
        toFields().get_output_stream = toOnGetOutputStream(this, GET_OUTPUT_STREAM, get_output_stream);
        toFields().writeField(GET_OUTPUT_STREAM);
    }

    /**
     * 
     * <br>See {@link OnGetOutputStream#onGetOutputStream}
    */
    public JnaIOStreamClass.OnGetOutputStream getFieldGetOutputStream() {
       toFields().readField(GET_OUTPUT_STREAM);
       return toFields().get_output_stream;
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
    public JnaIOStreamClass.OnCloseFn getFieldCloseFn() {
       toFields().readField(CLOSE_FN);
       return toFields().close_fn;
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
    public JnaIOStreamClass.OnCloseFinish getFieldCloseFinish() {
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
    public JnaIOStreamClass.OnGReserved1 getFieldGReserved1() {
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
    public JnaIOStreamClass.OnGReserved2 getFieldGReserved2() {
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
    public JnaIOStreamClass.OnGReserved3 getFieldGReserved3() {
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
    public JnaIOStreamClass.OnGReserved4 getFieldGReserved4() {
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
    public JnaIOStreamClass.OnGReserved5 getFieldGReserved5() {
       toFields().readField(_G_RESERVED5);
       return toFields()._g_reserved5;
    } 

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public static final String _G_RESERVED6 = "_g_reserved6";

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public void setFieldGReserved6(OnGReserved6 _g_reserved6) {
        toFields()._g_reserved6 = toOnGReserved6(this, _G_RESERVED6, _g_reserved6);
        toFields().writeField(_G_RESERVED6);
    }

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public JnaIOStreamClass.OnGReserved6 getFieldGReserved6() {
       toFields().readField(_G_RESERVED6);
       return toFields()._g_reserved6;
    } 

    /**
     * 
     * <br>See {@link OnGReserved7#onGReserved7}
    */
    public static final String _G_RESERVED7 = "_g_reserved7";

    /**
     * 
     * <br>See {@link OnGReserved7#onGReserved7}
    */
    public void setFieldGReserved7(OnGReserved7 _g_reserved7) {
        toFields()._g_reserved7 = toOnGReserved7(this, _G_RESERVED7, _g_reserved7);
        toFields().writeField(_G_RESERVED7);
    }

    /**
     * 
     * <br>See {@link OnGReserved7#onGReserved7}
    */
    public JnaIOStreamClass.OnGReserved7 getFieldGReserved7() {
       toFields().readField(_G_RESERVED7);
       return toFields()._g_reserved7;
    } 

    /**
     * 
     * <br>See {@link OnGReserved8#onGReserved8}
    */
    public static final String _G_RESERVED8 = "_g_reserved8";

    /**
     * 
     * <br>See {@link OnGReserved8#onGReserved8}
    */
    public void setFieldGReserved8(OnGReserved8 _g_reserved8) {
        toFields()._g_reserved8 = toOnGReserved8(this, _G_RESERVED8, _g_reserved8);
        toFields().writeField(_G_RESERVED8);
    }

    /**
     * 
     * <br>See {@link OnGReserved8#onGReserved8}
    */
    public JnaIOStreamClass.OnGReserved8 getFieldGReserved8() {
       toFields().readField(_G_RESERVED8);
       return toFields()._g_reserved8;
    } 

    /**
     * 
     * <br>See {@link OnGReserved9#onGReserved9}
    */
    public static final String _G_RESERVED9 = "_g_reserved9";

    /**
     * 
     * <br>See {@link OnGReserved9#onGReserved9}
    */
    public void setFieldGReserved9(OnGReserved9 _g_reserved9) {
        toFields()._g_reserved9 = toOnGReserved9(this, _G_RESERVED9, _g_reserved9);
        toFields().writeField(_G_RESERVED9);
    }

    /**
     * 
     * <br>See {@link OnGReserved9#onGReserved9}
    */
    public JnaIOStreamClass.OnGReserved9 getFieldGReserved9() {
       toFields().readField(_G_RESERVED9);
       return toFields()._g_reserved9;
    } 

    /**
     * 
     * <br>See {@link OnGReserved10#onGReserved10}
    */
    public static final String _G_RESERVED10 = "_g_reserved10";

    /**
     * 
     * <br>See {@link OnGReserved10#onGReserved10}
    */
    public void setFieldGReserved10(OnGReserved10 _g_reserved10) {
        toFields()._g_reserved10 = toOnGReserved10(this, _G_RESERVED10, _g_reserved10);
        toFields().writeField(_G_RESERVED10);
    }

    /**
     * 
     * <br>See {@link OnGReserved10#onGReserved10}
    */
    public JnaIOStreamClass.OnGReserved10 getFieldGReserved10() {
       toFields().readField(_G_RESERVED10);
       return toFields()._g_reserved10;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(IOStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(IOStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
