/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual function table for &#35;GApplication.
 * <p><a href="https://docs.gtk.org/gio/struct.ApplicationClass.html">https://docs.gtk.org/gio/struct.ApplicationClass.html</a></p>
*/
public class ApplicationClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnStartup {
        /**
         * 
         * @param application 
        */
        void onStartup(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Application application);
    }
    
    private static JnaApplicationClass.OnStartup toOnStartup(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartup in) {
        JnaApplicationClass.OnStartup out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_application) -> in.onStartup(__callback, new Application(new PointerContainer(_application)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param application a &#35;GApplication
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Application application);
    }
    
    private static JnaApplicationClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaApplicationClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_application) -> in.onActivate(__callback, new Application(new PointerContainer(_application)));
            __callback.register(out);
        }
        return out;
    }

    public ApplicationClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaApplicationClass.Fields _fields;
    
    JnaApplicationClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaApplicationClass.Fields(asCPointer());
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
     * <br>See {@link OnStartup#onStartup}
    */
    public static final String STARTUP = "startup";

    /**
     * 
     * <br>See {@link OnStartup#onStartup}
    */
    public void setFieldStartup(OnStartup startup) {
        toFields().startup = toOnStartup(this, STARTUP, startup);
        toFields().writeField(STARTUP);
    }

    /**
     * 
     * <br>See {@link OnStartup#onStartup}
    */
    public JnaApplicationClass.OnStartup getFieldStartup() {
       toFields().readField(STARTUP);
       return toFields().startup;
    } 

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaApplicationClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Application.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Application.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:open:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:command_line:previous-field-unsupported:[MethodModel:Supported:commandLine:[ParameterModel:Supported:{G_::{c:int}}:{j:int}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:ApplicationCommandLine:{c:GApplicationCommandLine*}}:{j:long}]]

[MethodModel:Supported:commandLine:[ParameterModel:Supported:{G_::{c:int}}:{j:int}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:ApplicationCommandLine:{c:GApplicationCommandLine*}}:{j:long}]

[FieldModel:local_command_line:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:before_emit:previous-field-unsupported:[MethodModel:Supported:beforeEmit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:beforeEmit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:after_emit:previous-field-unsupported:[MethodModel:Supported:afterEmit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:afterEmit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:add_platform_data:previous-field-unsupported:[MethodModel:Supported:addPlatformData:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantBuilder:{c:GVariantBuilder*}}:{j:long}]]

[MethodModel:Supported:addPlatformData:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantBuilder:{c:GVariantBuilder*}}:{j:long}]

[FieldModel:quit_mainloop:previous-field-unsupported:[MethodModel:Supported:quitMainloop:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]]

[MethodModel:Supported:quitMainloop:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]

[FieldModel:run_mainloop:previous-field-unsupported:[MethodModel:Supported:runMainloop:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]]

[MethodModel:Supported:runMainloop:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]

[FieldModel:shutdown:previous-field-unsupported:[MethodModel:Supported:shutdown:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]]

[MethodModel:Supported:shutdown:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]

[FieldModel:dbus_register:previous-field-unsupported:[MethodModel:Supported:dbusRegister:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusConnection:{c:GDBusConnection*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:dbusRegister:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusConnection:{c:GDBusConnection*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:dbus_unregister:previous-field-unsupported:[MethodModel:Supported:dbusUnregister:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusConnection:{c:GDBusConnection*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:dbusUnregister:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusConnection:{c:GDBusConnection*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:handle_local_options:previous-field-unsupported:[MethodModel:Supported:handleLocalOptions:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantDict:{c:GVariantDict*}}:{j:long}]]

[MethodModel:Supported:handleLocalOptions:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantDict:{c:GVariantDict*}}:{j:long}]

[FieldModel:name_lost:previous-field-unsupported:[MethodModel:Supported:nameLost:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]]

[MethodModel:Supported:nameLost:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Application:{c:GApplication*}}:{j:long}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
