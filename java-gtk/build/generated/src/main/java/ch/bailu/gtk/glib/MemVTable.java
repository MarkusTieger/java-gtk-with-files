/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A set of functions used to perform memory allocation. The same &#35;GMemVTable must
 * <br>be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * <br>if it exists, should be prior to any use of GLib.
 * <br>
 * <br>This functions related to this has been deprecated in 2.46, and no longer work.
 * <p><a href="https://docs.gtk.org/glib/struct.MemVTable.html">https://docs.gtk.org/glib/struct.MemVTable.html</a></p>
*/
public class MemVTable extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemVTable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMalloc {
        /**
         * 
         * @param n_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onMalloc(ch.bailu.gtk.lib.handler.CallbackHandler __self, long n_bytes);
    }
    
    private static JnaMemVTable.OnMalloc toOnMalloc(ch.bailu.gtk.type.Pointer instance, String methodName, OnMalloc in) {
        JnaMemVTable.OnMalloc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_n_bytes) -> in.onMalloc(__callback, _n_bytes).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRealloc {
        /**
         * 
         * @param mem 
         * @param n_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onRealloc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer mem, long n_bytes);
    }
    
    private static JnaMemVTable.OnRealloc toOnRealloc(ch.bailu.gtk.type.Pointer instance, String methodName, OnRealloc in) {
        JnaMemVTable.OnRealloc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mem, _n_bytes) -> in.onRealloc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_mem)), _n_bytes).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFree {
        /**
         * 
         * @param mem 
        */
        void onFree(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer mem);
    }
    
    private static JnaMemVTable.OnFree toOnFree(ch.bailu.gtk.type.Pointer instance, String methodName, OnFree in) {
        JnaMemVTable.OnFree out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mem) -> in.onFree(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_mem)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCalloc {
        /**
         * 
         * @param n_blocks 
         * @param n_block_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onCalloc(ch.bailu.gtk.lib.handler.CallbackHandler __self, long n_blocks, long n_block_bytes);
    }
    
    private static JnaMemVTable.OnCalloc toOnCalloc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCalloc in) {
        JnaMemVTable.OnCalloc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_n_blocks, _n_block_bytes) -> in.onCalloc(__callback, _n_blocks, _n_block_bytes).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTryMalloc {
        /**
         * 
         * @param n_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onTryMalloc(ch.bailu.gtk.lib.handler.CallbackHandler __self, long n_bytes);
    }
    
    private static JnaMemVTable.OnTryMalloc toOnTryMalloc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTryMalloc in) {
        JnaMemVTable.OnTryMalloc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_n_bytes) -> in.onTryMalloc(__callback, _n_bytes).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTryRealloc {
        /**
         * 
         * @param mem 
         * @param n_bytes 
         * @return 
        */
        ch.bailu.gtk.type.Pointer onTryRealloc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer mem, long n_bytes);
    }
    
    private static JnaMemVTable.OnTryRealloc toOnTryRealloc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTryRealloc in) {
        JnaMemVTable.OnTryRealloc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mem, _n_bytes) -> in.onTryRealloc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_mem)), _n_bytes).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public MemVTable(PointerContainer pointer) {
        super(pointer);
    }

    public MemVTable() {
        super(cast(JnaMemVTable.allocateStructure()));
    }

    private JnaMemVTable.Fields _fields;
    
    JnaMemVTable.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMemVTable.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnMalloc#onMalloc}
    */
    public static final String MALLOC = "malloc";

    /**
     * 
     * <br>See {@link OnMalloc#onMalloc}
    */
    public void setFieldMalloc(OnMalloc malloc) {
        toFields().malloc = toOnMalloc(this, MALLOC, malloc);
        toFields().writeField(MALLOC);
    }

    /**
     * 
     * <br>See {@link OnMalloc#onMalloc}
    */
    public JnaMemVTable.OnMalloc getFieldMalloc() {
       toFields().readField(MALLOC);
       return toFields().malloc;
    } 

    /**
     * 
     * <br>See {@link OnRealloc#onRealloc}
    */
    public static final String REALLOC = "realloc";

    /**
     * 
     * <br>See {@link OnRealloc#onRealloc}
    */
    public void setFieldRealloc(OnRealloc realloc) {
        toFields().realloc = toOnRealloc(this, REALLOC, realloc);
        toFields().writeField(REALLOC);
    }

    /**
     * 
     * <br>See {@link OnRealloc#onRealloc}
    */
    public JnaMemVTable.OnRealloc getFieldRealloc() {
       toFields().readField(REALLOC);
       return toFields().realloc;
    } 

    /**
     * 
     * <br>See {@link OnFree#onFree}
    */
    public static final String FREE = "free";

    /**
     * 
     * <br>See {@link OnFree#onFree}
    */
    public void setFieldFree(OnFree free) {
        toFields().free = toOnFree(this, FREE, free);
        toFields().writeField(FREE);
    }

    /**
     * 
     * <br>See {@link OnFree#onFree}
    */
    public JnaMemVTable.OnFree getFieldFree() {
       toFields().readField(FREE);
       return toFields().free;
    } 

    /**
     * 
     * <br>See {@link OnCalloc#onCalloc}
    */
    public static final String CALLOC = "calloc";

    /**
     * 
     * <br>See {@link OnCalloc#onCalloc}
    */
    public void setFieldCalloc(OnCalloc calloc) {
        toFields().calloc = toOnCalloc(this, CALLOC, calloc);
        toFields().writeField(CALLOC);
    }

    /**
     * 
     * <br>See {@link OnCalloc#onCalloc}
    */
    public JnaMemVTable.OnCalloc getFieldCalloc() {
       toFields().readField(CALLOC);
       return toFields().calloc;
    } 

    /**
     * 
     * <br>See {@link OnTryMalloc#onTryMalloc}
    */
    public static final String TRY_MALLOC = "try_malloc";

    /**
     * 
     * <br>See {@link OnTryMalloc#onTryMalloc}
    */
    public void setFieldTryMalloc(OnTryMalloc try_malloc) {
        toFields().try_malloc = toOnTryMalloc(this, TRY_MALLOC, try_malloc);
        toFields().writeField(TRY_MALLOC);
    }

    /**
     * 
     * <br>See {@link OnTryMalloc#onTryMalloc}
    */
    public JnaMemVTable.OnTryMalloc getFieldTryMalloc() {
       toFields().readField(TRY_MALLOC);
       return toFields().try_malloc;
    } 

    /**
     * 
     * <br>See {@link OnTryRealloc#onTryRealloc}
    */
    public static final String TRY_REALLOC = "try_realloc";

    /**
     * 
     * <br>See {@link OnTryRealloc#onTryRealloc}
    */
    public void setFieldTryRealloc(OnTryRealloc try_realloc) {
        toFields().try_realloc = toOnTryRealloc(this, TRY_REALLOC, try_realloc);
        toFields().writeField(TRY_REALLOC);
    }

    /**
     * 
     * <br>See {@link OnTryRealloc#onTryRealloc}
    */
    public JnaMemVTable.OnTryRealloc getFieldTryRealloc() {
       toFields().readField(TRY_REALLOC);
       return toFields().try_realloc;
    } 

}

/*
record-type
all-fields-supported
*/
