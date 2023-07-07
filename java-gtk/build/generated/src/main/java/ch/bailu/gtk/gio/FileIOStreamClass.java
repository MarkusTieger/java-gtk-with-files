/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.FileIOStreamClass.html">https://docs.gtk.org/gio/struct.FileIOStreamClass.html</a></p>
*/
public class FileIOStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileIOStreamClass.class.getCanonicalName());
    }

    public FileIOStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFileIOStreamClass.Fields _fields;
    
    JnaFileIOStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileIOStreamClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileIOStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileIOStream.getParentTypeID());
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
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]

[MethodModel:Supported:canSeek:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]

[FieldModel:seek:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:can_truncate:previous-field-unsupported:[MethodModel:Supported:canTruncate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]

[MethodModel:Supported:canTruncate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]

[FieldModel:truncate_fn:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:query_info:previous-field-unsupported:[MethodModel:Supported:queryInfo:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:queryInfo:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:query_info_async:previous-field-unsupported:[MethodModel:Supported:queryInfoAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:queryInfoAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:query_info_finish:previous-field-unsupported:[MethodModel:Supported:queryInfoFinish:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:queryInfoFinish:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:get_etag:previous-field-unsupported:[MethodModel:Supported:getEtag:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]

[MethodModel:Supported:getEtag:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]

[FieldModel:_g_reserved1:previous-field-unsupported:[MethodModel:Supported:gReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved2:previous-field-unsupported:[MethodModel:Supported:gReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved3:previous-field-unsupported:[MethodModel:Supported:gReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved4:previous-field-unsupported:[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved5:previous-field-unsupported:[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
