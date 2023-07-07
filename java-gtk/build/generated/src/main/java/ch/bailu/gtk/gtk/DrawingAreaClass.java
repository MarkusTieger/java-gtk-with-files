/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.DrawingAreaClass.html">https://docs.gtk.org/gtk4/struct.DrawingAreaClass.html</a></p>
*/
public class DrawingAreaClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DrawingAreaClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResize {
        /**
         * 
         * @param area 
         * @param width 
         * @param height 
        */
        void onResize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DrawingArea area, int width, int height);
    }
    
    private static JnaDrawingAreaClass.OnResize toOnResize(ch.bailu.gtk.type.Pointer instance, String methodName, OnResize in) {
        JnaDrawingAreaClass.OnResize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _width, _height) -> in.onResize(__callback, new DrawingArea(new PointerContainer(_area)), _width, _height);
            __callback.register(out);
        }
        return out;
    }

    public DrawingAreaClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDrawingAreaClass.Fields _fields;
    
    JnaDrawingAreaClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDrawingAreaClass.Fields(asCPointer());
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
     * <br>See {@link OnResize#onResize}
    */
    public static final String RESIZE = "resize";

    /**
     * 
     * <br>See {@link OnResize#onResize}
    */
    public void setFieldResize(OnResize resize) {
        toFields().resize = toOnResize(this, RESIZE, resize);
        toFields().writeField(RESIZE);
    }

    /**
     * 
     * <br>See {@link OnResize#onResize}
    */
    public JnaDrawingAreaClass.OnResize getFieldResize() {
       toFields().readField(RESIZE);
       return toFields().resize;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DrawingArea.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DrawingArea.getParentTypeID());
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
