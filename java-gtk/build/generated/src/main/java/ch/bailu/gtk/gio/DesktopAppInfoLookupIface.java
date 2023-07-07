/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface that is used by backends to associate default
 * <br>handlers with URI schemes.
 * <p><a href="https://docs.gtk.org/gio/struct.DesktopAppInfoLookupIface.html">https://docs.gtk.org/gio/struct.DesktopAppInfoLookupIface.html</a></p>
*/
public class DesktopAppInfoLookupIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DesktopAppInfoLookupIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetDefaultForUriScheme {
        /**
         * 
         * @param lookup a &#35;GDesktopAppInfoLookup
         * @param uri_scheme a string containing a URI scheme.
         * @return &#35;GAppInfo for given &#64;uri_scheme or    %NULL on error.
        */
        AppInfo onGetDefaultForUriScheme(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DesktopAppInfoLookup lookup, @Nonnull ch.bailu.gtk.type.Str uri_scheme);
    }
    
    private static JnaDesktopAppInfoLookupIface.OnGetDefaultForUriScheme toOnGetDefaultForUriScheme(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDefaultForUriScheme in) {
        JnaDesktopAppInfoLookupIface.OnGetDefaultForUriScheme out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_lookup, _uri_scheme) -> in.onGetDefaultForUriScheme(__callback, new DesktopAppInfoLookup(new PointerContainer(_lookup)), new ch.bailu.gtk.type.Str(new PointerContainer(_uri_scheme))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public DesktopAppInfoLookupIface(PointerContainer pointer) {
        super(pointer);
    }

    public DesktopAppInfoLookupIface() {
        super(cast(JnaDesktopAppInfoLookupIface.allocateStructure()));
    }

    private JnaDesktopAppInfoLookupIface.Fields _fields;
    
    JnaDesktopAppInfoLookupIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDesktopAppInfoLookupIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnGetDefaultForUriScheme#onGetDefaultForUriScheme}
    */
    public static final String GET_DEFAULT_FOR_URI_SCHEME = "get_default_for_uri_scheme";

    /**
     * 
     * <br>See {@link OnGetDefaultForUriScheme#onGetDefaultForUriScheme}
    */
    public void setFieldGetDefaultForUriScheme(OnGetDefaultForUriScheme get_default_for_uri_scheme) {
        toFields().get_default_for_uri_scheme = toOnGetDefaultForUriScheme(this, GET_DEFAULT_FOR_URI_SCHEME, get_default_for_uri_scheme);
        toFields().writeField(GET_DEFAULT_FOR_URI_SCHEME);
    }

    /**
     * 
     * <br>See {@link OnGetDefaultForUriScheme#onGetDefaultForUriScheme}
    */
    public JnaDesktopAppInfoLookupIface.OnGetDefaultForUriScheme getFieldGetDefaultForUriScheme() {
       toFields().readField(GET_DEFAULT_FOR_URI_SCHEME);
       return toFields().get_default_for_uri_scheme;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DesktopAppInfoLookup.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DesktopAppInfoLookup.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
