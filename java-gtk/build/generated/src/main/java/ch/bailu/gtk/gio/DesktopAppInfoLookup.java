/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDesktopAppInfoLookup is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/gio/iface.DesktopAppInfoLookup.html">https://docs.gtk.org/gio/iface.DesktopAppInfoLookup.html</a></p>
*/
public class DesktopAppInfoLookup extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DesktopAppInfoLookup.class.getCanonicalName());
    }

    public DesktopAppInfoLookup(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaDesktopAppInfoLookup.INST().g_desktop_app_info_lookup_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
interface-type

[MethodModel:cb-deprecated:getDefaultForUriScheme:[ParameterModel:Supported:{Gg:AppInfo:{c:GAppInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
