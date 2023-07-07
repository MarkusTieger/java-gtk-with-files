/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkPixbufModule` contains the necessary functions to load and save
 * <br>images in a certain file format.
 * <br>
 * <br>If `GdkPixbuf` has been compiled with `GModule` support, it can be extended
 * <br>by modules which can load (and perhaps also save) new image and animation
 * <br>formats.
 * <br>
 * <br>&#35;&#35; Implementing modules
 * <br>
 * <br>The `GdkPixbuf` interfaces needed for implementing modules are contained in
 * <br>`gdk-pixbuf-io.h` (and `gdk-pixbuf-animation.h` if the module supports
 * <br>animations). They are not covered by the same stability guarantees as the
 * <br>regular GdkPixbuf API. To underline this fact, they are protected by the
 * <br>`GDK_PIXBUF_ENABLE_BACKEND` pre-processor symbol.
 * <br>
 * <br>Each loadable module must contain a `GdkPixbufModuleFillVtableFunc` function
 * <br>named `fill_vtable`, which will get called when the module
 * <br>is loaded and must set the function pointers of the `GdkPixbufModule`.
 * <br>
 * <br>In order to make format-checking work before actually loading the modules
 * <br>(which may require calling `dlopen` to load image libraries), modules export
 * <br>their signatures (and other information) via the `fill_info` function. An
 * <br>external utility, `gdk-pixbuf-query-loaders`, uses this to create a text
 * <br>file containing a list of all available loaders and  their signatures.
 * <br>This file is then read at runtime by `GdkPixbuf` to obtain the list of
 * <br>available loaders and their signatures.
 * <br>
 * <br>Modules may only implement a subset of the functionality available via
 * <br>`GdkPixbufModule`. If a particular functionality is not implemented, the
 * <br>`fill_vtable` function will simply not set the corresponding
 * <br>function pointers of the `GdkPixbufModule` structure. If a module supports
 * <br>incremental loading (i.e. provides `begin_load`, `stop_load` and
 * <br>`load_increment`), it doesn't have to implement `load`, since `GdkPixbuf`
 * <br>can supply a generic `load` implementation wrapping the incremental loading.
 * <br>
 * <br>&#35;&#35; Installing modules
 * <br>
 * <br>Installing a module is a two-step process:
 * <br>
 * <br> - copy the module file(s) to the loader directory (normally
 * <br>   `$libdir/gdk-pixbuf-2.0/$version/loaders`, unless overridden by the
 * <br>   environment variable `GDK_PIXBUF_MODULEDIR`)
 * <br> - call `gdk-pixbuf-query-loaders` to update the module file (normally
 * <br>   `$libdir/gdk-pixbuf-2.0/$version/loaders.cache`, unless overridden
 * <br>   by the environment variable `GDK_PIXBUF_MODULE_FILE`)
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufModule.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufModule.html</a></p>
*/
public class PixbufModule extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufModule.class.getCanonicalName());
    }

    public PixbufModule(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPixbufModule.Fields _fields;
    
    JnaPixbufModule.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufModule.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the name of the module, usually the same as the
     * <br> usual file extension for images of this type, eg. &quot;xpm&quot;, &quot;jpeg&quot; or &quot;png&quot;.
    */
    public static final String MODULE_NAME = "module_name";

    /**
     * the name of the module, usually the same as the
     * <br> usual file extension for images of this type, eg. &quot;xpm&quot;, &quot;jpeg&quot; or &quot;png&quot;.
    */
    public void setFieldModuleName(ch.bailu.gtk.type.Str module_name) {
        toFields().module_name = module_name.asCPointer();
        toFields().writeField(MODULE_NAME);
    }

    /**
     * the name of the module, usually the same as the
     * <br> usual file extension for images of this type, eg. &quot;xpm&quot;, &quot;jpeg&quot; or &quot;png&quot;.
    */
    public ch.bailu.gtk.type.Str getFieldModuleName() {
       toFields().readField(MODULE_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().module_name));
    } 

    /**
     * the path from which the module is loaded.
    */
    public static final String MODULE_PATH = "module_path";

    /**
     * the path from which the module is loaded.
    */
    public void setFieldModulePath(ch.bailu.gtk.type.Str module_path) {
        toFields().module_path = module_path.asCPointer();
        toFields().writeField(MODULE_PATH);
    }

    /**
     * the path from which the module is loaded.
    */
    public ch.bailu.gtk.type.Str getFieldModulePath() {
       toFields().readField(MODULE_PATH);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().module_path));
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:module:java-type-not-supported:{G_::{c:GModule*}}:{j:}]

[FieldModel:info:previous-field-unsupported:{Gg:PixbufFormat:{c:GdkPixbufFormat*}}:{j:long}]

[FieldModel:load:java-type-not-supported:previous-field-unsupported:{G_::{c:GdkPixbufModuleLoadFunc}}:{j:}]

[FieldModel:load_xpm_data:previous-field-unsupported:[MethodModel:Supported:PixbufModuleLoadXpmDataFunc:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]]

[MethodModel:Supported:PixbufModuleLoadXpmDataFunc:[ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]

[FieldModel:begin_load:previous-field-unsupported:[MethodModel:Supported:PixbufModuleBeginLoadFunc:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModuleSizeFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModulePreparedFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]
        [ParameterModel:Supported:{Gg:PixbufAnimation:{c:GdkPixbufAnimation*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModuleUpdatedFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:PixbufModuleBeginLoadFunc:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModuleSizeFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModulePreparedFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]
        [ParameterModel:Supported:{Gg:PixbufAnimation:{c:GdkPixbufAnimation*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:PixbufModuleUpdatedFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Pixbuf:{c:GdkPixbuf*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:stop_load:previous-field-unsupported:[MethodModel:Supported:PixbufModuleStopLoadFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:PixbufModuleStopLoadFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:load_increment:java-type-not-supported:previous-field-unsupported:{G_::{c:GdkPixbufModuleIncrementLoadFunc}}:{j:}]

[FieldModel:load_animation:java-type-not-supported:previous-field-unsupported:{G_::{c:GdkPixbufModuleLoadAnimationFunc}}:{j:}]

[FieldModel:save:java-type-not-supported:previous-field-unsupported:{G_::{c:GdkPixbufModuleSaveFunc}}:{j:}]

[FieldModel:save_to_callback:java-type-not-supported:previous-field-unsupported:{G_::{c:GdkPixbufModuleSaveCallbackFunc}}:{j:}]

[FieldModel:is_save_option_supported:previous-field-unsupported:[MethodModel:Supported:PixbufModuleSaveOptionSupportedFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:PixbufModuleSaveOptionSupportedFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:_reserved1:previous-field-unsupported:[MethodModel:Supported:reserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:reserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_reserved2:previous-field-unsupported:[MethodModel:Supported:reserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:reserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_reserved3:previous-field-unsupported:[MethodModel:Supported:reserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:reserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_reserved4:previous-field-unsupported:[MethodModel:Supported:reserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:reserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
