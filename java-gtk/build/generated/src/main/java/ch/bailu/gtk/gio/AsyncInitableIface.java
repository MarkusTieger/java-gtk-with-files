/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for asynchronous initializing object such that
 * <br>initialization may fail.
 * <p><a href="https://docs.gtk.org/gio/struct.AsyncInitableIface.html">https://docs.gtk.org/gio/struct.AsyncInitableIface.html</a></p>
*/
public class AsyncInitableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AsyncInitableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInitFinish {
        /**
         * 
         * @param initable a &#35;GAsyncInitable.
         * @param res a &#35;GAsyncResult.
         * @return %TRUE if successful. If an error has occurred, this function will return %FALSE and set &#64;error appropriately if present.
        */
        boolean onInitFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AsyncInitable initable, @Nonnull AsyncResult res);
    }
    
    private static JnaAsyncInitableIface.OnInitFinish toOnInitFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnInitFinish in) {
        JnaAsyncInitableIface.OnInitFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_initable, _res, _error) -> in.onInitFinish(__callback, new AsyncInitable(new PointerContainer(_initable)), new AsyncResult(new PointerContainer(_res)));
            __callback.register(out);
        }
        return out;
    }

    public AsyncInitableIface(PointerContainer pointer) {
        super(pointer);
    }

    public AsyncInitableIface() {
        super(cast(JnaAsyncInitableIface.allocateStructure()));
    }

    private JnaAsyncInitableIface.Fields _fields;
    
    JnaAsyncInitableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAsyncInitableIface.Fields(asCPointer());
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
     * <br>Private field: cb-with-cb
    */
    public static final String INIT_ASYNC = "init_async";

    /**
     * 
     * <br>See {@link OnInitFinish#onInitFinish}
    */
    public static final String INIT_FINISH = "init_finish";

    /**
     * 
     * <br>See {@link OnInitFinish#onInitFinish}
    */
    public void setFieldInitFinish(OnInitFinish init_finish) {
        toFields().init_finish = toOnInitFinish(this, INIT_FINISH, init_finish);
        toFields().writeField(INIT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnInitFinish#onInitFinish}
    */
    public JnaAsyncInitableIface.OnInitFinish getFieldInitFinish() {
       toFields().readField(INIT_FINISH);
       return toFields().init_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AsyncInitable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AsyncInitable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
