/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.FileEnumeratorClass.html">https://docs.gtk.org/gio/struct.FileEnumeratorClass.html</a></p>
*/
public class FileEnumeratorClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileEnumeratorClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnNextFile {
        /**
         * 
         * @param enumerator a &#35;GFileEnumerator.
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return A &#35;GFileInfo or %NULL on error    or end of enumerator.  Free the returned object with    g_object_unref() when no longer needed.
        */
        FileInfo onNextFile(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FileEnumerator enumerator, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileEnumeratorClass.OnNextFile toOnNextFile(ch.bailu.gtk.type.Pointer instance, String methodName, OnNextFile in) {
        JnaFileEnumeratorClass.OnNextFile out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _cancellable, _error) -> in.onNextFile(__callback, new FileEnumerator(new PointerContainer(_enumerator)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFn {
        /**
         * 
         * @param enumerator 
         * @param cancellable 
         * @return 
        */
        boolean onCloseFn(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FileEnumerator enumerator, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileEnumeratorClass.OnCloseFn toOnCloseFn(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFn in) {
        JnaFileEnumeratorClass.OnCloseFn out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _cancellable, _error) -> in.onCloseFn(__callback, new FileEnumerator(new PointerContainer(_enumerator)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnNextFilesFinish {
        /**
         * 
         * @param enumerator a &#35;GFileEnumerator.
         * @param result a &#35;GAsyncResult.
         * @return a &#35;GList of &#35;GFileInfos. You must free the list with     g_list_free() and unref the infos with g_object_unref() when you're     done with them.
        */
        ch.bailu.gtk.glib.List onNextFilesFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FileEnumerator enumerator, @Nonnull AsyncResult result);
    }
    
    private static JnaFileEnumeratorClass.OnNextFilesFinish toOnNextFilesFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnNextFilesFinish in) {
        JnaFileEnumeratorClass.OnNextFilesFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _result, _error) -> in.onNextFilesFinish(__callback, new FileEnumerator(new PointerContainer(_enumerator)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCloseFinish {
        /**
         * 
         * @param enumerator a &#35;GFileEnumerator.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the close operation has finished successfully.
        */
        boolean onCloseFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FileEnumerator enumerator, @Nonnull AsyncResult result);
    }
    
    private static JnaFileEnumeratorClass.OnCloseFinish toOnCloseFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnCloseFinish in) {
        JnaFileEnumeratorClass.OnCloseFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _result, _error) -> in.onCloseFinish(__callback, new FileEnumerator(new PointerContainer(_enumerator)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFileEnumeratorClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaFileEnumeratorClass.OnGReserved1 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaFileEnumeratorClass.OnGReserved2 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaFileEnumeratorClass.OnGReserved3 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaFileEnumeratorClass.OnGReserved4 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaFileEnumeratorClass.OnGReserved5 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved6 toOnGReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved6 in) {
        JnaFileEnumeratorClass.OnGReserved6 out = null;
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
    
    private static JnaFileEnumeratorClass.OnGReserved7 toOnGReserved7(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved7 in) {
        JnaFileEnumeratorClass.OnGReserved7 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved7(__callback);
            __callback.register(out);
        }
        return out;
    }

    public FileEnumeratorClass(PointerContainer pointer) {
        super(pointer);
    }

    public FileEnumeratorClass() {
        super(cast(JnaFileEnumeratorClass.allocateStructure()));
    }

    private JnaFileEnumeratorClass.Fields _fields;
    
    JnaFileEnumeratorClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileEnumeratorClass.Fields(asCPointer());
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
     * <br>See {@link OnNextFile#onNextFile}
    */
    public static final String NEXT_FILE = "next_file";

    /**
     * 
     * <br>See {@link OnNextFile#onNextFile}
    */
    public void setFieldNextFile(OnNextFile next_file) {
        toFields().next_file = toOnNextFile(this, NEXT_FILE, next_file);
        toFields().writeField(NEXT_FILE);
    }

    /**
     * 
     * <br>See {@link OnNextFile#onNextFile}
    */
    public JnaFileEnumeratorClass.OnNextFile getFieldNextFile() {
       toFields().readField(NEXT_FILE);
       return toFields().next_file;
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
    public JnaFileEnumeratorClass.OnCloseFn getFieldCloseFn() {
       toFields().readField(CLOSE_FN);
       return toFields().close_fn;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String NEXT_FILES_ASYNC = "next_files_async";

    /**
     * 
     * <br>See {@link OnNextFilesFinish#onNextFilesFinish}
    */
    public static final String NEXT_FILES_FINISH = "next_files_finish";

    /**
     * 
     * <br>See {@link OnNextFilesFinish#onNextFilesFinish}
    */
    public void setFieldNextFilesFinish(OnNextFilesFinish next_files_finish) {
        toFields().next_files_finish = toOnNextFilesFinish(this, NEXT_FILES_FINISH, next_files_finish);
        toFields().writeField(NEXT_FILES_FINISH);
    }

    /**
     * 
     * <br>See {@link OnNextFilesFinish#onNextFilesFinish}
    */
    public JnaFileEnumeratorClass.OnNextFilesFinish getFieldNextFilesFinish() {
       toFields().readField(NEXT_FILES_FINISH);
       return toFields().next_files_finish;
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
    public JnaFileEnumeratorClass.OnCloseFinish getFieldCloseFinish() {
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
    public JnaFileEnumeratorClass.OnGReserved1 getFieldGReserved1() {
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
    public JnaFileEnumeratorClass.OnGReserved2 getFieldGReserved2() {
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
    public JnaFileEnumeratorClass.OnGReserved3 getFieldGReserved3() {
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
    public JnaFileEnumeratorClass.OnGReserved4 getFieldGReserved4() {
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
    public JnaFileEnumeratorClass.OnGReserved5 getFieldGReserved5() {
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
    public JnaFileEnumeratorClass.OnGReserved6 getFieldGReserved6() {
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
    public JnaFileEnumeratorClass.OnGReserved7 getFieldGReserved7() {
       toFields().readField(_G_RESERVED7);
       return toFields()._g_reserved7;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileEnumerator.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileEnumerator.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
