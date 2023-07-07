/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for socket-like objects which have datagram semantics,
 * <br>following the Berkeley sockets API. The interface methods are thin wrappers
 * <br>around the corresponding virtual methods, and no pre-processing of inputs is
 * <br>implemented — so implementations of this API must handle all functionality
 * <br>documented in the interface methods.
 * <p><a href="https://docs.gtk.org/gio/struct.DatagramBasedInterface.html">https://docs.gtk.org/gio/struct.DatagramBasedInterface.html</a></p>
*/
public class DatagramBasedInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DatagramBasedInterface.class.getCanonicalName());
    }

    public DatagramBasedInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDatagramBasedInterface.Fields _fields;
    
    JnaDatagramBasedInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDatagramBasedInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DatagramBased.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DatagramBased.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:receive_messages:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:send_messages:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:create_source:previous-field-unsupported:[MethodModel:Supported:createSource:[ParameterModel:Supported:{Gg:Source:{c:GSource*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:createSource:[ParameterModel:Supported:{Gg:Source:{c:GSource*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:condition_check:previous-field-unsupported:[MethodModel:Supported:conditionCheck:[ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]]

[MethodModel:Supported:conditionCheck:[ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]

[FieldModel:condition_wait:previous-field-unsupported:[MethodModel:Supported:conditionWait:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:conditionWait:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DatagramBased:{c:GDatagramBased*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GIOCondition}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
