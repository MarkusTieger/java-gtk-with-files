/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.FileInputStreamClass.html">https://docs.gtk.org/gio/struct.FileInputStreamClass.html</a></p>
*/
public class FileInputStreamClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileInputStreamClass.class.getCanonicalName());
    }

    public FileInputStreamClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFileInputStreamClass.Fields _fields;
    
    JnaFileInputStreamClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileInputStreamClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileInputStream.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FileInputStream.getParentTypeID());
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
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]]

[MethodModel:Supported:canSeek:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]

[FieldModel:seek:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:query_info:previous-field-unsupported:[MethodModel:Supported:queryInfo:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:queryInfo:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:query_info_async:previous-field-unsupported:[MethodModel:Supported:queryInfoAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:queryInfoAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:query_info_finish:previous-field-unsupported:[MethodModel:Supported:queryInfoFinish:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:queryInfoFinish:[ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

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
