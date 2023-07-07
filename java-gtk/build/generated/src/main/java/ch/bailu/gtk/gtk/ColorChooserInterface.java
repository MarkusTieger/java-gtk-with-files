/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ColorChooserInterface.html">https://docs.gtk.org/gtk4/struct.ColorChooserInterface.html</a></p>
*/
public class ColorChooserInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorChooserInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetRgba {
        /**
         * 
         * @param chooser a `GtkColorChooser`
         * @param color a `GdkRGBA` to fill in with the current color
        */
        void onGetRgba(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ColorChooser chooser, @Nonnull ch.bailu.gtk.gdk.RGBA color);
    }
    
    private static JnaColorChooserInterface.OnGetRgba toOnGetRgba(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRgba in) {
        JnaColorChooserInterface.OnGetRgba out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_chooser, _color) -> in.onGetRgba(__callback, new ColorChooser(new PointerContainer(_chooser)), new ch.bailu.gtk.gdk.RGBA(new PointerContainer(_color)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetRgba {
        /**
         * 
         * @param chooser a `GtkColorChooser`
         * @param color the new color
        */
        void onSetRgba(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ColorChooser chooser, @Nonnull ch.bailu.gtk.gdk.RGBA color);
    }
    
    private static JnaColorChooserInterface.OnSetRgba toOnSetRgba(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetRgba in) {
        JnaColorChooserInterface.OnSetRgba out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_chooser, _color) -> in.onSetRgba(__callback, new ColorChooser(new PointerContainer(_chooser)), new ch.bailu.gtk.gdk.RGBA(new PointerContainer(_color)));
            __callback.register(out);
        }
        return out;
    }

    public ColorChooserInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaColorChooserInterface.Fields _fields;
    
    JnaColorChooserInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaColorChooserInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_INTERFACE = "base_interface";

    /**
     * 
     * <br>See {@link OnGetRgba#onGetRgba}
    */
    public static final String GET_RGBA = "get_rgba";

    /**
     * 
     * <br>See {@link OnGetRgba#onGetRgba}
    */
    public void setFieldGetRgba(OnGetRgba get_rgba) {
        toFields().get_rgba = toOnGetRgba(this, GET_RGBA, get_rgba);
        toFields().writeField(GET_RGBA);
    }

    /**
     * 
     * <br>See {@link OnGetRgba#onGetRgba}
    */
    public JnaColorChooserInterface.OnGetRgba getFieldGetRgba() {
       toFields().readField(GET_RGBA);
       return toFields().get_rgba;
    } 

    /**
     * 
     * <br>See {@link OnSetRgba#onSetRgba}
    */
    public static final String SET_RGBA = "set_rgba";

    /**
     * 
     * <br>See {@link OnSetRgba#onSetRgba}
    */
    public void setFieldSetRgba(OnSetRgba set_rgba) {
        toFields().set_rgba = toOnSetRgba(this, SET_RGBA, set_rgba);
        toFields().writeField(SET_RGBA);
    }

    /**
     * 
     * <br>See {@link OnSetRgba#onSetRgba}
    */
    public JnaColorChooserInterface.OnSetRgba getFieldSetRgba() {
       toFields().readField(SET_RGBA);
       return toFields().set_rgba;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ColorChooser.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ColorChooser.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:add_palette:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:color_activated:previous-field-unsupported:[MethodModel:Supported:colorActivated:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ColorChooser:{c:GtkColorChooser*}}:{j:long}]
        [ParameterModel:Supported:{Gg:RGBA:{c:const GdkRGBA*}}:{j:long}]]

[MethodModel:Supported:colorActivated:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:ColorChooser:{c:GtkColorChooser*}}:{j:long}]
        [ParameterModel:Supported:{Gg:RGBA:{c:const GdkRGBA*}}:{j:long}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
