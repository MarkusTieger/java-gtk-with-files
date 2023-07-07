/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.BufferedInputStreamClass.html">https://docs.gtk.org/gio/struct.BufferedInputStreamClass.html</a></p>
*/
public class BufferedInputStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BufferedInputStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnFill {
        /**
         * 
         * @param stream a &#35;GBufferedInputStream
         * @param count the number of bytes that will be read from the stream
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore
         * @return the number of bytes read into &#64;stream's buffer, up to &#64;count,     or -1 on error.
        */
        long onFill(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BufferedInputStream stream, long count, @Nullable Cancellable cancellable);
    }
    
    private static JnaBufferedInputStreamClass.OnFill toOnFill(ch.bailu.gtk.type.Pointer instance, String methodName, OnFill in) {
        JnaBufferedInputStreamClass.OnFill out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _count, _cancellable, _error) -> in.onFill(__callback, new BufferedInputStream(new PointerContainer(_stream)), _count, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFillFinish {
        /**
         * 
         * @param stream a &#35;GBufferedInputStream
         * @param result a &#35;GAsyncResult
         * @return a &#35;gssize of the read stream, or `-1` on an error.
        */
        long onFillFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull BufferedInputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaBufferedInputStreamClass.OnFillFinish toOnFillFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnFillFinish in) {
        JnaBufferedInputStreamClass.OnFillFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onFillFinish(__callback, new BufferedInputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaBufferedInputStreamClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaBufferedInputStreamClass.OnGReserved1 out = null;
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
    
    private static JnaBufferedInputStreamClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaBufferedInputStreamClass.OnGReserved2 out = null;
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
    
    private static JnaBufferedInputStreamClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaBufferedInputStreamClass.OnGReserved3 out = null;
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
    
    private static JnaBufferedInputStreamClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaBufferedInputStreamClass.OnGReserved4 out = null;
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
    
    private static JnaBufferedInputStreamClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaBufferedInputStreamClass.OnGReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    public BufferedInputStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    public BufferedInputStreamClass() {
        super(cast(JnaBufferedInputStreamClass.allocateStructure()));
    }

    private JnaBufferedInputStreamClass.Fields _fields;
    
    JnaBufferedInputStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBufferedInputStreamClass.Fields(asCPointer());
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
     * <br>See {@link OnFill#onFill}
    */
    public static final String FILL = "fill";

    /**
     * 
     * <br>See {@link OnFill#onFill}
    */
    public void setFieldFill(OnFill fill) {
        toFields().fill = toOnFill(this, FILL, fill);
        toFields().writeField(FILL);
    }

    /**
     * 
     * <br>See {@link OnFill#onFill}
    */
    public JnaBufferedInputStreamClass.OnFill getFieldFill() {
       toFields().readField(FILL);
       return toFields().fill;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FILL_ASYNC = "fill_async";

    /**
     * 
     * <br>See {@link OnFillFinish#onFillFinish}
    */
    public static final String FILL_FINISH = "fill_finish";

    /**
     * 
     * <br>See {@link OnFillFinish#onFillFinish}
    */
    public void setFieldFillFinish(OnFillFinish fill_finish) {
        toFields().fill_finish = toOnFillFinish(this, FILL_FINISH, fill_finish);
        toFields().writeField(FILL_FINISH);
    }

    /**
     * 
     * <br>See {@link OnFillFinish#onFillFinish}
    */
    public JnaBufferedInputStreamClass.OnFillFinish getFieldFillFinish() {
       toFields().readField(FILL_FINISH);
       return toFields().fill_finish;
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
    public JnaBufferedInputStreamClass.OnGReserved1 getFieldGReserved1() {
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
    public JnaBufferedInputStreamClass.OnGReserved2 getFieldGReserved2() {
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
    public JnaBufferedInputStreamClass.OnGReserved3 getFieldGReserved3() {
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
    public JnaBufferedInputStreamClass.OnGReserved4 getFieldGReserved4() {
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
    public JnaBufferedInputStreamClass.OnGReserved5 getFieldGReserved5() {
       toFields().readField(_G_RESERVED5);
       return toFields()._g_reserved5;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(BufferedInputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(BufferedInputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
