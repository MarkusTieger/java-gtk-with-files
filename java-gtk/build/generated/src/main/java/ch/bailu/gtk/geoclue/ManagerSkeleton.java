/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GClueManagerSkeleton structure contains only private data and should only be accessed using the provided API.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class ManagerSkeleton extends ch.bailu.gtk.gio.DBusInterfaceSkeleton {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ManagerSkeleton.class.getCanonicalName());
    }

    public ManagerSkeleton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a skeleton object for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Manager.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Manager&lt;/link&gt;.
    */
    public ManagerSkeleton() {
        super(cast(JnaManagerSkeleton.INST().gclue_manager_skeleton_new()));
    }

    /**
     * Implements interface {@link Manager}. Call this to get access to interface functions.
     * @return {@link Manager}
    */
    public Manager asManager() {
        return new Manager(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.DBusInterface}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.DBusInterface}
    */
    public ch.bailu.gtk.gio.DBusInterface asDBusInterface() {
        return new ch.bailu.gtk.gio.DBusInterface(cast());
    }

    public static long getTypeID() { 
        return JnaManagerSkeleton.INST().gclue_manager_skeleton_get_type(); 
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
class-type
*/
