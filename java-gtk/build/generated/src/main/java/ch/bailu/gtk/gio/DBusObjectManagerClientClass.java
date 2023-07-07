/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GDBusObjectManagerClient.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusObjectManagerClientClass.html">https://docs.gtk.org/gio/struct.DBusObjectManagerClientClass.html</a></p>
*/
public class DBusObjectManagerClientClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManagerClientClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInterfaceProxySignal {
        /**
         * 
         * @param manager 
         * @param object_proxy 
         * @param interface_proxy 
         * @param sender_name 
         * @param signal_name 
         * @param parameters 
        */
        void onInterfaceProxySignal(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManagerClient manager, @Nonnull DBusObjectProxy object_proxy, @Nonnull DBusProxy interface_proxy, @Nonnull ch.bailu.gtk.type.Str sender_name, @Nonnull ch.bailu.gtk.type.Str signal_name, @Nonnull ch.bailu.gtk.glib.Variant parameters);
    }
    
    private static JnaDBusObjectManagerClientClass.OnInterfaceProxySignal toOnInterfaceProxySignal(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceProxySignal in) {
        JnaDBusObjectManagerClientClass.OnInterfaceProxySignal out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object_proxy, _interface_proxy, _sender_name, _signal_name, _parameters) -> in.onInterfaceProxySignal(__callback, new DBusObjectManagerClient(new PointerContainer(_manager)), new DBusObjectProxy(new PointerContainer(_object_proxy)), new DBusProxy(new PointerContainer(_interface_proxy)), new ch.bailu.gtk.type.Str(new PointerContainer(_sender_name)), new ch.bailu.gtk.type.Str(new PointerContainer(_signal_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameters)));
            __callback.register(out);
        }
        return out;
    }

    public DBusObjectManagerClientClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusObjectManagerClientClass.Fields _fields;
    
    JnaDBusObjectManagerClientClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusObjectManagerClientClass.Fields(asCPointer());
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
     * <br>See {@link OnInterfaceProxySignal#onInterfaceProxySignal}
    */
    public static final String INTERFACE_PROXY_SIGNAL = "interface_proxy_signal";

    /**
     * 
     * <br>See {@link OnInterfaceProxySignal#onInterfaceProxySignal}
    */
    public void setFieldInterfaceProxySignal(OnInterfaceProxySignal interface_proxy_signal) {
        toFields().interface_proxy_signal = toOnInterfaceProxySignal(this, INTERFACE_PROXY_SIGNAL, interface_proxy_signal);
        toFields().writeField(INTERFACE_PROXY_SIGNAL);
    }

    /**
     * 
     * <br>See {@link OnInterfaceProxySignal#onInterfaceProxySignal}
    */
    public JnaDBusObjectManagerClientClass.OnInterfaceProxySignal getFieldInterfaceProxySignal() {
       toFields().readField(INTERFACE_PROXY_SIGNAL);
       return toFields().interface_proxy_signal;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManagerClient.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManagerClient.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:interface_proxy_properties_changed:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
