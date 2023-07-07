/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Defines a Unix mount entry (e.g. &lt;filename&gt;/media/cdrom&lt;/filename&gt;).
 * <br>This corresponds roughly to a mtab entry.
 * <p><a href="https://docs.gtk.org/gio/struct.UnixMountEntry.html">https://docs.gtk.org/gio/struct.UnixMountEntry.html</a></p>
*/
public class UnixMountEntry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixMountEntry.class.getCanonicalName());
    }

    public UnixMountEntry(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaUnixMountEntry.INST().g_unix_mount_entry_get_type(); 
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
record-type
all-fields-supported
*/
