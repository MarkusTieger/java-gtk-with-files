/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ScaleClass.html">https://docs.gtk.org/gtk4/struct.ScaleClass.html</a></p>
*/
public class ScaleClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScaleClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetLayoutOffsets {
        /**
         * 
         * @param scale a `GtkScale`
         * @param x location to store X offset of layout
         * @param y location to store Y offset of layout
        */
        void onGetLayoutOffsets(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Scale scale, @Nullable ch.bailu.gtk.type.Int x, @Nullable ch.bailu.gtk.type.Int y);
    }
    
    private static JnaScaleClass.OnGetLayoutOffsets toOnGetLayoutOffsets(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLayoutOffsets in) {
        JnaScaleClass.OnGetLayoutOffsets out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_scale, _x, _y) -> in.onGetLayoutOffsets(__callback, new Scale(new PointerContainer(_scale)), new ch.bailu.gtk.type.Int(new PointerContainer(_x)), new ch.bailu.gtk.type.Int(new PointerContainer(_y)));
            __callback.register(out);
        }
        return out;
    }

    public ScaleClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaScaleClass.Fields _fields;
    
    JnaScaleClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaScaleClass.Fields(asCPointer());
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
     * <br>See {@link OnGetLayoutOffsets#onGetLayoutOffsets}
    */
    public static final String GET_LAYOUT_OFFSETS = "get_layout_offsets";

    /**
     * 
     * <br>See {@link OnGetLayoutOffsets#onGetLayoutOffsets}
    */
    public void setFieldGetLayoutOffsets(OnGetLayoutOffsets get_layout_offsets) {
        toFields().get_layout_offsets = toOnGetLayoutOffsets(this, GET_LAYOUT_OFFSETS, get_layout_offsets);
        toFields().writeField(GET_LAYOUT_OFFSETS);
    }

    /**
     * 
     * <br>See {@link OnGetLayoutOffsets#onGetLayoutOffsets}
    */
    public JnaScaleClass.OnGetLayoutOffsets getFieldGetLayoutOffsets() {
       toFields().readField(GET_LAYOUT_OFFSETS);
       return toFields().get_layout_offsets;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Scale.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Scale.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
