/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkEntryBuffer` that locks the underlying memory to prevent it
 * <br>from being swapped to disk.
 * <br>
 * <br>`GtkPasswordEntry` uses a `GtkPasswordEntryBuffer`.
 * <p><a href="https://docs.gtk.org/gtk4/class.PasswordEntryBuffer.html">https://docs.gtk.org/gtk4/class.PasswordEntryBuffer.html</a></p>
*/
public class PasswordEntryBuffer extends EntryBuffer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PasswordEntryBuffer.class.getCanonicalName());
    }

    public PasswordEntryBuffer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkEntryBuffer` using secure memory allocations.
    */
    public PasswordEntryBuffer() {
        super(cast(JnaPasswordEntryBuffer.INST().gtk_password_entry_buffer_new()));
    }

    public static long getTypeID() { 
        return JnaPasswordEntryBuffer.INST().gtk_password_entry_buffer_get_type(); 
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
