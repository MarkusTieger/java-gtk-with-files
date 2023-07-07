/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GActionGroup.
 * <p><a href="https://docs.gtk.org/gio/struct.ActionGroupInterface.html">https://docs.gtk.org/gio/struct.ActionGroupInterface.html</a></p>
*/
public class ActionGroupInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionGroupInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHasAction {
        /**
         * 
         * @param action_group a &#35;GActionGroup
         * @param action_name the name of the action to check for
         * @return whether the named action exists
        */
        boolean onHasAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ActionGroup action_group, @Nonnull ch.bailu.gtk.type.Str action_name);
    }
    
    private static JnaActionGroupInterface.OnHasAction toOnHasAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnHasAction in) {
        JnaActionGroupInterface.OnHasAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action_group, _action_name) -> in.onHasAction(__callback, new ActionGroup(new PointerContainer(_action_group)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)));
            __callback.register(out);
        }
        return out;
    }

    public ActionGroupInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaActionGroupInterface.Fields _fields;
    
    JnaActionGroupInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionGroupInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnHasAction#onHasAction}
    */
    public static final String HAS_ACTION = "has_action";

    /**
     * 
     * <br>See {@link OnHasAction#onHasAction}
    */
    public void setFieldHasAction(OnHasAction has_action) {
        toFields().has_action = toOnHasAction(this, HAS_ACTION, has_action);
        toFields().writeField(HAS_ACTION);
    }

    /**
     * 
     * <br>See {@link OnHasAction#onHasAction}
    */
    public JnaActionGroupInterface.OnHasAction getFieldHasAction() {
       toFields().readField(HAS_ACTION);
       return toFields().has_action;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionGroup.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionGroup.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:list_actions:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:get_action_enabled:previous-field-unsupported:[MethodModel:Supported:getActionEnabled:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getActionEnabled:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:get_action_parameter_type:previous-field-unsupported:[MethodModel:Supported:getActionParameterType:[ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getActionParameterType:[ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:get_action_state_type:previous-field-unsupported:[MethodModel:Supported:getActionStateType:[ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getActionStateType:[ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:get_action_state_hint:previous-field-unsupported:[MethodModel:Supported:getActionStateHint:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getActionStateHint:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:get_action_state:previous-field-unsupported:[MethodModel:Supported:getActionState:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getActionState:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:change_action_state:previous-field-unsupported:[MethodModel:Supported:changeActionState:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:changeActionState:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:activate_action:previous-field-unsupported:[MethodModel:Supported:activateAction:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:activateAction:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:action_added:previous-field-unsupported:[MethodModel:Supported:actionAdded:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:actionAdded:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:action_removed:previous-field-unsupported:[MethodModel:Supported:actionRemoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:actionRemoved:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:action_enabled_changed:previous-field-unsupported:[MethodModel:Supported:actionEnabledChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:Supported:actionEnabledChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[FieldModel:action_state_changed:previous-field-unsupported:[MethodModel:Supported:actionStateChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:actionStateChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ActionGroup:{c:GActionGroup*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:query_action:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
