/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSeekable is implemented by streams (implementations of
 * <br>&#35;GInputStream or &#35;GOutputStream) that support seeking.
 * <br>
 * <br>Seekable streams largely fall into two categories: resizable and
 * <br>fixed-size.
 * <br>
 * <br>&#35;GSeekable on fixed-sized streams is approximately the same as POSIX
 * <br>lseek() on a block device (for example: attempting to seek past the
 * <br>end of the device is an error).  Fixed streams typically cannot be
 * <br>truncated.
 * <br>
 * <br>&#35;GSeekable on resizable streams is approximately the same as POSIX
 * <br>lseek() on a normal file.  Seeking past the end and writing data will
 * <br>usually cause the stream to resize by introducing zero bytes.
 * <p><a href="https://docs.gtk.org/gio/iface.Seekable.html">https://docs.gtk.org/gio/iface.Seekable.html</a></p>
*/
public class Seekable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Seekable.class.getCanonicalName());
    }

    public Seekable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Tests if the stream supports the &#35;GSeekableIface.
     * @return %TRUE if &#64;seekable can be seeked. %FALSE otherwise.
    */
    public boolean canSeek()  {
        return JnaSeekable.INST().g_seekable_can_seek(asCPointer());
    }

    /**
     * Tests if the length of the stream can be adjusted with
     * <br>g_seekable_truncate().
     * @return %TRUE if the stream can be truncated, %FALSE otherwise.
    */
    public boolean canTruncate()  {
        return JnaSeekable.INST().g_seekable_can_truncate(asCPointer());
    }

    public static long getTypeID() { 
        return JnaSeekable.INST().g_seekable_get_type(); 
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

[MethodModel:java-type-not-supported:seek:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSeekType}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:tell:[ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]]

[MethodModel:java-type-not-supported:truncate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
