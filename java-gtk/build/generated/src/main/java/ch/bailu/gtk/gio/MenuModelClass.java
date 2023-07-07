/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.MenuModelClass.html">https://docs.gtk.org/gio/struct.MenuModelClass.html</a></p>
*/
public class MenuModelClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuModelClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIsMutable {
        /**
         * 
         * @param model a &#35;GMenuModel
         * @return %TRUE if the model is mutable (ie: &quot;items-changed&quot; may be     emitted).
        */
        boolean onIsMutable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MenuModel model);
    }
    
    private static JnaMenuModelClass.OnIsMutable toOnIsMutable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsMutable in) {
        JnaMenuModelClass.OnIsMutable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model) -> in.onIsMutable(__callback, new MenuModel(new PointerContainer(_model)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetNItems {
        /**
         * 
         * @param model a &#35;GMenuModel
         * @return the number of items
        */
        int onGetNItems(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MenuModel model);
    }
    
    private static JnaMenuModelClass.OnGetNItems toOnGetNItems(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetNItems in) {
        JnaMenuModelClass.OnGetNItems out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model) -> in.onGetNItems(__callback, new MenuModel(new PointerContainer(_model)));
            __callback.register(out);
        }
        return out;
    }

    public MenuModelClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMenuModelClass.Fields _fields;
    
    JnaMenuModelClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMenuModelClass.Fields(asCPointer());
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
     * <br>See {@link OnIsMutable#onIsMutable}
    */
    public static final String IS_MUTABLE = "is_mutable";

    /**
     * 
     * <br>See {@link OnIsMutable#onIsMutable}
    */
    public void setFieldIsMutable(OnIsMutable is_mutable) {
        toFields().is_mutable = toOnIsMutable(this, IS_MUTABLE, is_mutable);
        toFields().writeField(IS_MUTABLE);
    }

    /**
     * 
     * <br>See {@link OnIsMutable#onIsMutable}
    */
    public JnaMenuModelClass.OnIsMutable getFieldIsMutable() {
       toFields().readField(IS_MUTABLE);
       return toFields().is_mutable;
    } 

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public static final String GET_N_ITEMS = "get_n_items";

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public void setFieldGetNItems(OnGetNItems get_n_items) {
        toFields().get_n_items = toOnGetNItems(this, GET_N_ITEMS, get_n_items);
        toFields().writeField(GET_N_ITEMS);
    }

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public JnaMenuModelClass.OnGetNItems getFieldGetNItems() {
       toFields().readField(GET_N_ITEMS);
       return toFields().get_n_items;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuModel.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MenuModel.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_item_attributes:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:iterate_item_attributes:previous-field-unsupported:[MethodModel:Supported:iterateItemAttributes:[ParameterModel:Supported:{Gg:MenuAttributeIter:{c:GMenuAttributeIter*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]

[MethodModel:Supported:iterateItemAttributes:[ParameterModel:Supported:{Gg:MenuAttributeIter:{c:GMenuAttributeIter*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[FieldModel:get_item_attribute_value:previous-field-unsupported:[MethodModel:Supported:getItemAttributeValue:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]]

[MethodModel:Supported:getItemAttributeValue:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]

[FieldModel:get_item_links:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:iterate_item_links:previous-field-unsupported:[MethodModel:Supported:iterateItemLinks:[ParameterModel:Supported:{Gg:MenuLinkIter:{c:GMenuLinkIter*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]

[MethodModel:Supported:iterateItemLinks:[ParameterModel:Supported:{Gg:MenuLinkIter:{c:GMenuLinkIter*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[FieldModel:get_item_link:previous-field-unsupported:[MethodModel:Supported:getItemLink:[ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:Supported:getItemLink:[ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:MenuModel:{c:GMenuModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
*/
