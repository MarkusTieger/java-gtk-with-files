/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.VfsClass.html">https://docs.gtk.org/gio/struct.VfsClass.html</a></p>
*/
public class VfsClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VfsClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIsActive {
        /**
         * 
         * @param vfs a &#35;GVfs.
         * @return %TRUE if construction of the &#64;vfs was successful     and it is now active.
        */
        boolean onIsActive(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Vfs vfs);
    }
    
    private static JnaVfsClass.OnIsActive toOnIsActive(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsActive in) {
        JnaVfsClass.OnIsActive out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_vfs) -> in.onIsActive(__callback, new Vfs(new PointerContainer(_vfs)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFileForPath {
        /**
         * 
         * @param vfs a &#35;GVfs.
         * @param path a string containing a VFS path.
         * @return a &#35;GFile.     Free the returned object with g_object_unref().
        */
        File onGetFileForPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Vfs vfs, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static JnaVfsClass.OnGetFileForPath toOnGetFileForPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFileForPath in) {
        JnaVfsClass.OnGetFileForPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_vfs, _path) -> in.onGetFileForPath(__callback, new Vfs(new PointerContainer(_vfs)), new ch.bailu.gtk.type.Str(new PointerContainer(_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFileForUri {
        /**
         * 
         * @param vfs a&#35;GVfs.
         * @param uri a string containing a URI
         * @return a &#35;GFile.     Free the returned object with g_object_unref().
        */
        File onGetFileForUri(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Vfs vfs, @Nonnull ch.bailu.gtk.type.Str uri);
    }
    
    private static JnaVfsClass.OnGetFileForUri toOnGetFileForUri(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFileForUri in) {
        JnaVfsClass.OnGetFileForUri out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_vfs, _uri) -> in.onGetFileForUri(__callback, new Vfs(new PointerContainer(_vfs)), new ch.bailu.gtk.type.Str(new PointerContainer(_uri))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public VfsClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaVfsClass.Fields _fields;
    
    JnaVfsClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaVfsClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnIsActive#onIsActive}
    */
    public static final String IS_ACTIVE = "is_active";

    /**
     * 
     * <br>See {@link OnIsActive#onIsActive}
    */
    public void setFieldIsActive(OnIsActive is_active) {
        toFields().is_active = toOnIsActive(this, IS_ACTIVE, is_active);
        toFields().writeField(IS_ACTIVE);
    }

    /**
     * 
     * <br>See {@link OnIsActive#onIsActive}
    */
    public JnaVfsClass.OnIsActive getFieldIsActive() {
       toFields().readField(IS_ACTIVE);
       return toFields().is_active;
    } 

    /**
     * 
     * <br>See {@link OnGetFileForPath#onGetFileForPath}
    */
    public static final String GET_FILE_FOR_PATH = "get_file_for_path";

    /**
     * 
     * <br>See {@link OnGetFileForPath#onGetFileForPath}
    */
    public void setFieldGetFileForPath(OnGetFileForPath get_file_for_path) {
        toFields().get_file_for_path = toOnGetFileForPath(this, GET_FILE_FOR_PATH, get_file_for_path);
        toFields().writeField(GET_FILE_FOR_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetFileForPath#onGetFileForPath}
    */
    public JnaVfsClass.OnGetFileForPath getFieldGetFileForPath() {
       toFields().readField(GET_FILE_FOR_PATH);
       return toFields().get_file_for_path;
    } 

    /**
     * 
     * <br>See {@link OnGetFileForUri#onGetFileForUri}
    */
    public static final String GET_FILE_FOR_URI = "get_file_for_uri";

    /**
     * 
     * <br>See {@link OnGetFileForUri#onGetFileForUri}
    */
    public void setFieldGetFileForUri(OnGetFileForUri get_file_for_uri) {
        toFields().get_file_for_uri = toOnGetFileForUri(this, GET_FILE_FOR_URI, get_file_for_uri);
        toFields().writeField(GET_FILE_FOR_URI);
    }

    /**
     * 
     * <br>See {@link OnGetFileForUri#onGetFileForUri}
    */
    public JnaVfsClass.OnGetFileForUri getFieldGetFileForUri() {
       toFields().readField(GET_FILE_FOR_URI);
       return toFields().get_file_for_uri;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Vfs.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Vfs.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_supported_uri_schemes:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:parse_name:previous-field-unsupported:[MethodModel:Supported:parseName:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:parseName:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:local_file_add_info:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:add_writable_namespaces:previous-field-unsupported:[MethodModel:Supported:addWritableNamespaces:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FileAttributeInfoList:{c:GFileAttributeInfoList*}}:{j:long}]]

[MethodModel:Supported:addWritableNamespaces:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FileAttributeInfoList:{c:GFileAttributeInfoList*}}:{j:long}]

[FieldModel:local_file_set_attributes:previous-field-unsupported:[MethodModel:Supported:localFileSetAttributes:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileQueryInfoFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:localFileSetAttributes:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:FileInfo:{c:GFileInfo*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileQueryInfoFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:local_file_removed:previous-field-unsupported:[MethodModel:Supported:localFileRemoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:localFileRemoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:local_file_moved:previous-field-unsupported:[MethodModel:Supported:localFileMoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:localFileMoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[FieldModel:deserialize_icon:previous-field-unsupported:[MethodModel:Supported:deserializeIcon:[ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:deserializeIcon:[ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Vfs:{c:GVfs*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

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

[FieldModel:_g_reserved6:previous-field-unsupported:[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
