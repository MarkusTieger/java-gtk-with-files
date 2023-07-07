/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GProxyResolver.
 * <p><a href="https://docs.gtk.org/gio/struct.ProxyResolverInterface.html">https://docs.gtk.org/gio/struct.ProxyResolverInterface.html</a></p>
*/
public class ProxyResolverInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyResolverInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIsSupported {
        /**
         * 
         * @param resolver a &#35;GProxyResolver
         * @return %TRUE if &#64;resolver is supported.
        */
        boolean onIsSupported(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ProxyResolver resolver);
    }
    
    private static JnaProxyResolverInterface.OnIsSupported toOnIsSupported(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsSupported in) {
        JnaProxyResolverInterface.OnIsSupported out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver) -> in.onIsSupported(__callback, new ProxyResolver(new PointerContainer(_resolver)));
            __callback.register(out);
        }
        return out;
    }

    public ProxyResolverInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaProxyResolverInterface.Fields _fields;
    
    JnaProxyResolverInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaProxyResolverInterface.Fields(asCPointer());
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
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public static final String IS_SUPPORTED = "is_supported";

    /**
     * 
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public void setFieldIsSupported(OnIsSupported is_supported) {
        toFields().is_supported = toOnIsSupported(this, IS_SUPPORTED, is_supported);
        toFields().writeField(IS_SUPPORTED);
    }

    /**
     * 
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public JnaProxyResolverInterface.OnIsSupported getFieldIsSupported() {
       toFields().readField(IS_SUPPORTED);
       return toFields().is_supported;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ProxyResolver.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ProxyResolver.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:lookup:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:lookup_async:previous-field-unsupported:[MethodModel:Supported:lookupAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ProxyResolver:{c:GProxyResolver*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:lookupAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ProxyResolver:{c:GProxyResolver*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:lookup_finish:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
