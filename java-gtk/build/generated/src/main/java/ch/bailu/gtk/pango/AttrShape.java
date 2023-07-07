/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrShape` structure is used to represent attributes which
 * <br>impose shape restrictions.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrShape.html">https://docs.gtk.org/Pango/struct.AttrShape.html</a></p>
*/
public class AttrShape extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrShape.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAttrDataCopyFunc {
        /**
         * Type of a function that can duplicate user data for an attribute.
         * @param user_data user data to copy
         * @return new copy of &#64;user_data.
        */
        ch.bailu.gtk.type.Pointer onAttrDataCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaAttrShape.OnAttrDataCopyFunc toOnAttrDataCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnAttrDataCopyFunc in) {
        JnaAttrShape.OnAttrDataCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onAttrDataCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaAttrShape.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaAttrShape.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public AttrShape(PointerContainer pointer) {
        super(pointer);
    }

    private JnaAttrShape.Fields _fields;
    
    JnaAttrShape.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrShape.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * Create a new shape attribute.
     * <br>
     * <br>A shape is used to impose a particular ink and logical
     * <br>rectangle on the result of shaping a particular glyph.
     * <br>This might be used, for instance, for embedding a picture
     * <br>or a widget inside a `PangoLayout`.
     * @param ink_rect ink rectangle to assign to each character
     * @param logical_rect logical rectangle to assign to each character
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute _new(@Nonnull Rectangle ink_rect, @Nonnull Rectangle logical_rect)  {
        return new Attribute(new PointerContainer(JnaAttrShape.INST().pango_attr_shape_new(asCPointerNotNull(ink_rect), asCPointerNotNull(logical_rect))));
    }

    /**
     * Creates a new shape attribute.
     * <br>
     * <br>Like [func&#64;Pango.AttrShape.new], but a user data pointer
     * <br>is also provided; this pointer can be accessed when later
     * <br>rendering the glyph.
     * @param ink_rect ink rectangle to assign to each character
     * @param logical_rect logical rectangle to assign to each character
     * @param data user data pointer
     * @param copy_func function to copy &#64;data when the   attribute is copied. If %NULL, &#64;data is simply copied   as a pointer
     * @param destroy_func function to free &#64;data when the   attribute is freed
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute newWithData(@Nonnull Rectangle ink_rect, @Nonnull Rectangle logical_rect, @Nullable ch.bailu.gtk.type.Pointer data, OnAttrDataCopyFunc copy_func, OnDestroyNotify destroy_func)  {
        return new Attribute(new PointerContainer(JnaAttrShape.INST().pango_attr_shape_new_with_data(asCPointerNotNull(ink_rect), asCPointerNotNull(logical_rect), asCPointer(data), toOnAttrDataCopyFunc(getClassHandler().getInstance(), "newWithData", copy_func), toOnDestroyNotify(getClassHandler().getInstance(), "newWithData", destroy_func))));
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:ink_rect:direct-type:{Gg:Rectangle:{c:PangoRectangle}}:{j:long}]

[FieldModel:logical_rect:direct-type:previous-field-unsupported:{Gg:Rectangle:{c:PangoRectangle}}:{j:long}]

[FieldModel:data:previous-field-unsupported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:copy_func:previous-field-unsupported:[MethodModel:Supported:AttrDataCopyFunc:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]

[MethodModel:Supported:AttrDataCopyFunc:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]

[FieldModel:destroy_func:previous-field-unsupported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
