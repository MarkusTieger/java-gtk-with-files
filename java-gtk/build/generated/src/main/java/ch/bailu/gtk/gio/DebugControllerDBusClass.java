/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GDebugControllerDBus.
 * <p><a href="https://docs.gtk.org/gio/struct.DebugControllerDBusClass.html">https://docs.gtk.org/gio/struct.DebugControllerDBusClass.html</a></p>
*/
public class DebugControllerDBusClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugControllerDBusClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAuthorize {
        /**
         * 
         * @param controller 
         * @param invocation 
         * @return 
        */
        boolean onAuthorize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DebugControllerDBus controller, @Nonnull DBusMethodInvocation invocation);
    }
    
    private static JnaDebugControllerDBusClass.OnAuthorize toOnAuthorize(ch.bailu.gtk.type.Pointer instance, String methodName, OnAuthorize in) {
        JnaDebugControllerDBusClass.OnAuthorize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_controller, _invocation) -> in.onAuthorize(__callback, new DebugControllerDBus(new PointerContainer(_controller)), new DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    public DebugControllerDBusClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDebugControllerDBusClass.Fields _fields;
    
    JnaDebugControllerDBusClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDebugControllerDBusClass.Fields(asCPointer());
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
     * <br>See {@link OnAuthorize#onAuthorize}
    */
    public static final String AUTHORIZE = "authorize";

    /**
     * 
     * <br>See {@link OnAuthorize#onAuthorize}
    */
    public void setFieldAuthorize(OnAuthorize authorize) {
        toFields().authorize = toOnAuthorize(this, AUTHORIZE, authorize);
        toFields().writeField(AUTHORIZE);
    }

    /**
     * 
     * <br>See {@link OnAuthorize#onAuthorize}
    */
    public JnaDebugControllerDBusClass.OnAuthorize getFieldAuthorize() {
       toFields().readField(AUTHORIZE);
       return toFields().authorize;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DebugControllerDBus.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DebugControllerDBus.getParentTypeID());
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
