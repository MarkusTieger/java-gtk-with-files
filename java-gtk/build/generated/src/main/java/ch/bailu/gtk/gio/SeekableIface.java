/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for implementing seekable functionality on I/O Streams.
 * <p><a href="https://docs.gtk.org/gio/struct.SeekableIface.html">https://docs.gtk.org/gio/struct.SeekableIface.html</a></p>
*/
public class SeekableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SeekableIface.class.getCanonicalName());
    }

    public SeekableIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSeekableIface.Fields _fields;
    
    JnaSeekableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSeekableIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Seekable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Seekable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:tell:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:can_seek:previous-field-unsupported:[MethodModel:Supported:canSeek:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Seekable:{c:GSeekable*}}:{j:long}]]

[MethodModel:Supported:canSeek:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Seekable:{c:GSeekable*}}:{j:long}]

[FieldModel:seek:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:can_truncate:previous-field-unsupported:[MethodModel:Supported:canTruncate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Seekable:{c:GSeekable*}}:{j:long}]]

[MethodModel:Supported:canTruncate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Seekable:{c:GSeekable*}}:{j:long}]

[FieldModel:truncate_fn:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
