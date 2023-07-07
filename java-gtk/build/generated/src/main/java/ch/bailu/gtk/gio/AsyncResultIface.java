/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface definition for &#35;GAsyncResult.
 * <p><a href="https://docs.gtk.org/gio/struct.AsyncResultIface.html">https://docs.gtk.org/gio/struct.AsyncResultIface.html</a></p>
*/
public class AsyncResultIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AsyncResultIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetUserData {
        /**
         * 
         * @param res a &#35;GAsyncResult.
         * @return the user data for &#64;res.
        */
        ch.bailu.gtk.type.Pointer onGetUserData(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AsyncResult res);
    }
    
    private static JnaAsyncResultIface.OnGetUserData toOnGetUserData(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetUserData in) {
        JnaAsyncResultIface.OnGetUserData out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_res) -> in.onGetUserData(__callback, new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSourceObject {
        /**
         * 
         * @param res a &#35;GAsyncResult
         * @return a new reference to the source    object for the &#64;res, or %NULL if there is none.
        */
        ch.bailu.gtk.gobject.Object onGetSourceObject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AsyncResult res);
    }
    
    private static JnaAsyncResultIface.OnGetSourceObject toOnGetSourceObject(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSourceObject in) {
        JnaAsyncResultIface.OnGetSourceObject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_res) -> in.onGetSourceObject(__callback, new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsTagged {
        /**
         * 
         * @param res a &#35;GAsyncResult
         * @param source_tag an application-defined tag
         * @return %TRUE if &#64;res has the indicated &#64;source_tag, %FALSE if   not.
        */
        boolean onIsTagged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer source_tag);
    }
    
    private static JnaAsyncResultIface.OnIsTagged toOnIsTagged(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsTagged in) {
        JnaAsyncResultIface.OnIsTagged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_res, _source_tag) -> in.onIsTagged(__callback, new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_source_tag)));
            __callback.register(out);
        }
        return out;
    }

    public AsyncResultIface(PointerContainer pointer) {
        super(pointer);
    }

    public AsyncResultIface() {
        super(cast(JnaAsyncResultIface.allocateStructure()));
    }

    private JnaAsyncResultIface.Fields _fields;
    
    JnaAsyncResultIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAsyncResultIface.Fields(asCPointer());
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
     * <br>See {@link OnGetUserData#onGetUserData}
    */
    public static final String GET_USER_DATA = "get_user_data";

    /**
     * 
     * <br>See {@link OnGetUserData#onGetUserData}
    */
    public void setFieldGetUserData(OnGetUserData get_user_data) {
        toFields().get_user_data = toOnGetUserData(this, GET_USER_DATA, get_user_data);
        toFields().writeField(GET_USER_DATA);
    }

    /**
     * 
     * <br>See {@link OnGetUserData#onGetUserData}
    */
    public JnaAsyncResultIface.OnGetUserData getFieldGetUserData() {
       toFields().readField(GET_USER_DATA);
       return toFields().get_user_data;
    } 

    /**
     * 
     * <br>See {@link OnGetSourceObject#onGetSourceObject}
    */
    public static final String GET_SOURCE_OBJECT = "get_source_object";

    /**
     * 
     * <br>See {@link OnGetSourceObject#onGetSourceObject}
    */
    public void setFieldGetSourceObject(OnGetSourceObject get_source_object) {
        toFields().get_source_object = toOnGetSourceObject(this, GET_SOURCE_OBJECT, get_source_object);
        toFields().writeField(GET_SOURCE_OBJECT);
    }

    /**
     * 
     * <br>See {@link OnGetSourceObject#onGetSourceObject}
    */
    public JnaAsyncResultIface.OnGetSourceObject getFieldGetSourceObject() {
       toFields().readField(GET_SOURCE_OBJECT);
       return toFields().get_source_object;
    } 

    /**
     * 
     * <br>See {@link OnIsTagged#onIsTagged}
    */
    public static final String IS_TAGGED = "is_tagged";

    /**
     * 
     * <br>See {@link OnIsTagged#onIsTagged}
    */
    public void setFieldIsTagged(OnIsTagged is_tagged) {
        toFields().is_tagged = toOnIsTagged(this, IS_TAGGED, is_tagged);
        toFields().writeField(IS_TAGGED);
    }

    /**
     * 
     * <br>See {@link OnIsTagged#onIsTagged}
    */
    public JnaAsyncResultIface.OnIsTagged getFieldIsTagged() {
       toFields().readField(IS_TAGGED);
       return toFields().is_tagged;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AsyncResult.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AsyncResult.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
