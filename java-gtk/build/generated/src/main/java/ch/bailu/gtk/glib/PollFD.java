/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a file descriptor, which events to poll for, and which events
 * <br>occurred.
 * <p><a href="https://docs.gtk.org/glib/struct.PollFD.html">https://docs.gtk.org/glib/struct.PollFD.html</a></p>
*/
public class PollFD extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PollFD.class.getCanonicalName());
    }

    public PollFD(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPollFD.Fields _fields;
    
    JnaPollFD.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPollFD.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the file descriptor to poll (or a HANDLE on Win32)
    */
    public static final String FD = "fd";

    /**
     * the file descriptor to poll (or a HANDLE on Win32)
    */
    public void setFieldFd(int fd) {
        toFields().fd = fd;
        toFields().writeField(FD);
    }

    /**
     * the file descriptor to poll (or a HANDLE on Win32)
    */
    public int getFieldFd() {
       toFields().readField(FD);
       return toFields().fd;
    } 

    public static long getTypeID() { 
        return JnaPollFD.INST().g_pollfd_get_type(); 
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
some-fields-unsupported

[FieldModel:events:java-type-not-supported:{G_::{c:gushort}}:{j:}]

[FieldModel:revents:java-type-not-supported:previous-field-unsupported:{G_::{c:gushort}}:{j:}]
*/
