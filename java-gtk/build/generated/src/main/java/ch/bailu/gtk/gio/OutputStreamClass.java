/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.OutputStreamClass.html">https://docs.gtk.org/gio/struct.OutputStreamClass.html</a></p>
*/
public class OutputStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OutputStreamClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnWriteFn {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param buffer the buffer containing the data to write.
         * @param count the number of bytes to write
         * @param cancellable optional cancellable object
         * @return Number of bytes written, or -1 on error
        */
        long onWriteFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nullable ch.bailu.gtk.type.Pointer buffer, long count, @Nullable Cancellable cancellable);
    }
    
    private static JnaOutputStreamClass.OnWriteFn toOnWriteFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnWriteFn in) {
        JnaOutputStreamClass.OnWriteFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _buffer, _count, _cancellable, _error) -> in.onWriteFn(__callback, new OutputStream(new PointerContainer(_stream)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_buffer)), _count, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSplice {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param source a &#35;GInputStream.
         * @param flags a set of &#35;GOutputStreamSpliceFlags.
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return a &#35;gssize containing the size of the data spliced, or     -1 if an error occurred. Note that if the number of bytes     spliced is greater than %G_MAXSSIZE, then that will be     returned, and there is no way to determine the actual number     of bytes spliced.
        */
        long onSplice(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nonnull InputStream source, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaOutputStreamClass.OnSplice toOnSplice(ch.bailu.gtk.type.Pointer instance, String methodName, OnSplice in) {
        JnaOutputStreamClass.OnSplice out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _source, _flags, _cancellable, _error) -> in.onSplice(__callback, new OutputStream(new PointerContainer(_stream)), new InputStream(new PointerContainer(_source)), _flags, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlush {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param cancellable optional cancellable object
         * @return %TRUE on success, %FALSE on error
        */
        boolean onFlush(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaOutputStreamClass.OnFlush toOnFlush(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlush in) {
        JnaOutputStreamClass.OnFlush out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable, _error) -> in.onFlush(__callback, new OutputStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable)));
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
        boolean onCloseFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nullable Cancellable cancellable);
    }
    
    private static JnaOutputStreamClass.OnCloseFn toOnCloseFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFn in) {
        JnaOutputStreamClass.OnCloseFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _cancellable, _error) -> in.onCloseFn(__callback, new OutputStream(new PointerContainer(_stream)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWriteFinish {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param result a &#35;GAsyncResult.
         * @return a &#35;gssize containing the number of bytes written to the stream.
        */
        long onWriteFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaOutputStreamClass.OnWriteFinish toOnWriteFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnWriteFinish in) {
        JnaOutputStreamClass.OnWriteFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onWriteFinish(__callback, new OutputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSpliceFinish {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param result a &#35;GAsyncResult.
         * @return a &#35;gssize of the number of bytes spliced. Note that if the     number of bytes spliced is greater than %G_MAXSSIZE, then that     will be returned, and there is no way to determine the actual     number of bytes spliced.
        */
        long onSpliceFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaOutputStreamClass.OnSpliceFinish toOnSpliceFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnSpliceFinish in) {
        JnaOutputStreamClass.OnSpliceFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onSpliceFinish(__callback, new OutputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlushFinish {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param result a GAsyncResult.
         * @return %TRUE if flush operation succeeded, %FALSE otherwise.
        */
        boolean onFlushFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaOutputStreamClass.OnFlushFinish toOnFlushFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlushFinish in) {
        JnaOutputStreamClass.OnFlushFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onFlushFinish(__callback, new OutputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFinish {
        /**
         * 
         * @param stream a &#35;GOutputStream.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if stream was successfully closed, %FALSE otherwise.
        */
        boolean onCloseFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OutputStream stream, @Nonnull AsyncResult result);
    }
    
    private static JnaOutputStreamClass.OnCloseFinish toOnCloseFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFinish in) {
        JnaOutputStreamClass.OnCloseFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_stream, _result, _error) -> in.onCloseFinish(__callback, new OutputStream(new PointerContainer(_stream)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public OutputStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaOutputStreamClass.Fields _fields;
    
    JnaOutputStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOutputStreamClass.Fields(asCPointer());
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
     * <br>See {@link OnWriteFn#onWriteFn}
    */
    public static final String WRITE_FN = "write_fn";

    /**
     * 
     * <br>See {@link OnWriteFn#onWriteFn}
    */
    public void setFieldWriteFn(OnWriteFn write_fn) {
        toFields().write_fn = toOnWriteFn(this, WRITE_FN, write_fn);
        toFields().writeField(WRITE_FN);
    }

    /**
     * 
     * <br>See {@link OnWriteFn#onWriteFn}
    */
    public JnaOutputStreamClass.OnWriteFn getFieldWriteFn() {
       toFields().readField(WRITE_FN);
       return toFields().write_fn;
    } 

    /**
     * 
     * <br>See {@link OnSplice#onSplice}
    */
    public static final String SPLICE = "splice";

    /**
     * 
     * <br>See {@link OnSplice#onSplice}
    */
    public void setFieldSplice(OnSplice splice) {
        toFields().splice = toOnSplice(this, SPLICE, splice);
        toFields().writeField(SPLICE);
    }

    /**
     * 
     * <br>See {@link OnSplice#onSplice}
    */
    public JnaOutputStreamClass.OnSplice getFieldSplice() {
       toFields().readField(SPLICE);
       return toFields().splice;
    } 

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public static final String FLUSH = "flush";

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public void setFieldFlush(OnFlush flush) {
        toFields().flush = toOnFlush(this, FLUSH, flush);
        toFields().writeField(FLUSH);
    }

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public JnaOutputStreamClass.OnFlush getFieldFlush() {
       toFields().readField(FLUSH);
       return toFields().flush;
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
    public JnaOutputStreamClass.OnCloseFn getFieldCloseFn() {
       toFields().readField(CLOSE_FN);
       return toFields().close_fn;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String WRITE_ASYNC = "write_async";

    /**
     * 
     * <br>See {@link OnWriteFinish#onWriteFinish}
    */
    public static final String WRITE_FINISH = "write_finish";

    /**
     * 
     * <br>See {@link OnWriteFinish#onWriteFinish}
    */
    public void setFieldWriteFinish(OnWriteFinish write_finish) {
        toFields().write_finish = toOnWriteFinish(this, WRITE_FINISH, write_finish);
        toFields().writeField(WRITE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnWriteFinish#onWriteFinish}
    */
    public JnaOutputStreamClass.OnWriteFinish getFieldWriteFinish() {
       toFields().readField(WRITE_FINISH);
       return toFields().write_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SPLICE_ASYNC = "splice_async";

    /**
     * 
     * <br>See {@link OnSpliceFinish#onSpliceFinish}
    */
    public static final String SPLICE_FINISH = "splice_finish";

    /**
     * 
     * <br>See {@link OnSpliceFinish#onSpliceFinish}
    */
    public void setFieldSpliceFinish(OnSpliceFinish splice_finish) {
        toFields().splice_finish = toOnSpliceFinish(this, SPLICE_FINISH, splice_finish);
        toFields().writeField(SPLICE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnSpliceFinish#onSpliceFinish}
    */
    public JnaOutputStreamClass.OnSpliceFinish getFieldSpliceFinish() {
       toFields().readField(SPLICE_FINISH);
       return toFields().splice_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FLUSH_ASYNC = "flush_async";

    /**
     * 
     * <br>See {@link OnFlushFinish#onFlushFinish}
    */
    public static final String FLUSH_FINISH = "flush_finish";

    /**
     * 
     * <br>See {@link OnFlushFinish#onFlushFinish}
    */
    public void setFieldFlushFinish(OnFlushFinish flush_finish) {
        toFields().flush_finish = toOnFlushFinish(this, FLUSH_FINISH, flush_finish);
        toFields().writeField(FLUSH_FINISH);
    }

    /**
     * 
     * <br>See {@link OnFlushFinish#onFlushFinish}
    */
    public JnaOutputStreamClass.OnFlushFinish getFieldFlushFinish() {
       toFields().readField(FLUSH_FINISH);
       return toFields().flush_finish;
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
    public JnaOutputStreamClass.OnCloseFinish getFieldCloseFinish() {
       toFields().readField(CLOSE_FINISH);
       return toFields().close_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(OutputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(OutputStream.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:writev_fn:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:writev_async:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:writev_finish:previous-field-unsupported:[MethodModel:Supported:writevFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:OutputStream:{c:GOutputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]]

[MethodModel:Supported:writevFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:OutputStream:{c:GOutputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[FieldModel:_g_reserved4:previous-field-unsupported:[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved5:previous-field-unsupported:[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved6:previous-field-unsupported:[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved7:previous-field-unsupported:[MethodModel:Supported:gReserved7:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved7:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved8:previous-field-unsupported:[MethodModel:Supported:gReserved8:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved8:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
