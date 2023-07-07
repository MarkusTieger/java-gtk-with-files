/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for icons that can be loaded as a stream.
 * <p><a href="https://docs.gtk.org/gio/struct.LoadableIconIface.html">https://docs.gtk.org/gio/struct.LoadableIconIface.html</a></p>
*/
public class LoadableIconIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LoadableIconIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLoad {
        /**
         * 
         * @param icon a &#35;GLoadableIcon.
         * @param size an integer.
         * @param type a location to store the type of the loaded icon, %NULL to ignore.
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return a &#35;GInputStream to read the icon from.
        */
        InputStream onLoad(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LoadableIcon icon, int size, @Nullable ch.bailu.gtk.type.Strs type, @Nullable Cancellable cancellable);
    }
    
    private static JnaLoadableIconIface.OnLoad toOnLoad(ch.bailu.gtk.type.Pointer instance, String methodName, OnLoad in) {
        JnaLoadableIconIface.OnLoad out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon, _size, _type, _cancellable, _error) -> in.onLoad(__callback, new LoadableIcon(new PointerContainer(_icon)), _size, new ch.bailu.gtk.type.Strs(new PointerContainer(_type)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLoadFinish {
        /**
         * 
         * @param icon a &#35;GLoadableIcon.
         * @param res a &#35;GAsyncResult.
         * @param type a location to store the type of the loaded        icon, %NULL to ignore.
         * @return a &#35;GInputStream to read the icon from.
        */
        InputStream onLoadFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LoadableIcon icon, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Strs type);
    }
    
    private static JnaLoadableIconIface.OnLoadFinish toOnLoadFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLoadFinish in) {
        JnaLoadableIconIface.OnLoadFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon, _res, _type, _error) -> in.onLoadFinish(__callback, new LoadableIcon(new PointerContainer(_icon)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Strs(new PointerContainer(_type))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public LoadableIconIface(PointerContainer pointer) {
        super(pointer);
    }

    public LoadableIconIface() {
        super(cast(JnaLoadableIconIface.allocateStructure()));
    }

    private JnaLoadableIconIface.Fields _fields;
    
    JnaLoadableIconIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLoadableIconIface.Fields(asCPointer());
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
     * <br>See {@link OnLoad#onLoad}
    */
    public static final String LOAD = "load";

    /**
     * 
     * <br>See {@link OnLoad#onLoad}
    */
    public void setFieldLoad(OnLoad load) {
        toFields().load = toOnLoad(this, LOAD, load);
        toFields().writeField(LOAD);
    }

    /**
     * 
     * <br>See {@link OnLoad#onLoad}
    */
    public JnaLoadableIconIface.OnLoad getFieldLoad() {
       toFields().readField(LOAD);
       return toFields().load;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOAD_ASYNC = "load_async";

    /**
     * 
     * <br>See {@link OnLoadFinish#onLoadFinish}
    */
    public static final String LOAD_FINISH = "load_finish";

    /**
     * 
     * <br>See {@link OnLoadFinish#onLoadFinish}
    */
    public void setFieldLoadFinish(OnLoadFinish load_finish) {
        toFields().load_finish = toOnLoadFinish(this, LOAD_FINISH, load_finish);
        toFields().writeField(LOAD_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLoadFinish#onLoadFinish}
    */
    public JnaLoadableIconIface.OnLoadFinish getFieldLoadFinish() {
       toFields().readField(LOAD_FINISH);
       return toFields().load_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(LoadableIcon.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(LoadableIcon.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
