/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GDBusObjectSkeleton.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusObjectSkeletonClass.html">https://docs.gtk.org/gio/struct.DBusObjectSkeletonClass.html</a></p>
*/
public class DBusObjectSkeletonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectSkeletonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAuthorizeMethod {
        /**
         * 
         * @param object 
         * @param interface_ 
         * @param invocation 
         * @return 
        */
        boolean onAuthorizeMethod(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectSkeleton object, @Nonnull DBusInterfaceSkeleton interface_, @Nonnull DBusMethodInvocation invocation);
    }
    
    private static JnaDBusObjectSkeletonClass.OnAuthorizeMethod toOnAuthorizeMethod(ch.bailu.gtk.type.Pointer instance, String methodName, OnAuthorizeMethod in) {
        JnaDBusObjectSkeletonClass.OnAuthorizeMethod out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _interface_, _invocation) -> in.onAuthorizeMethod(__callback, new DBusObjectSkeleton(new PointerContainer(_object)), new DBusInterfaceSkeleton(new PointerContainer(_interface_)), new DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    public DBusObjectSkeletonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusObjectSkeletonClass.Fields _fields;
    
    JnaDBusObjectSkeletonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusObjectSkeletonClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnAuthorizeMethod#onAuthorizeMethod}
    */
    public static final String AUTHORIZE_METHOD = "authorize_method";

    /**
     * 
     * <br>See {@link OnAuthorizeMethod#onAuthorizeMethod}
    */
    public void setFieldAuthorizeMethod(OnAuthorizeMethod authorize_method) {
        toFields().authorize_method = toOnAuthorizeMethod(this, AUTHORIZE_METHOD, authorize_method);
        toFields().writeField(AUTHORIZE_METHOD);
    }

    /**
     * 
     * <br>See {@link OnAuthorizeMethod#onAuthorizeMethod}
    */
    public JnaDBusObjectSkeletonClass.OnAuthorizeMethod getFieldAuthorizeMethod() {
       toFields().readField(AUTHORIZE_METHOD);
       return toFields().authorize_method;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectSkeleton.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectSkeleton.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
