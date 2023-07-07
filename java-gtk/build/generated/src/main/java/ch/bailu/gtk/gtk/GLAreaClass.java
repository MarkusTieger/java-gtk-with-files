/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkGLAreaClass` structure contains only private data.
 * <p><a href="https://docs.gtk.org/gtk4/struct.GLAreaClass.html">https://docs.gtk.org/gtk4/struct.GLAreaClass.html</a></p>
*/
public class GLAreaClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLAreaClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRender {
        /**
         * 
         * @param area 
         * @param context 
         * @return 
        */
        boolean onRender(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull GLArea area, @Nonnull ch.bailu.gtk.gdk.GLContext context);
    }
    
    private static JnaGLAreaClass.OnRender toOnRender(ch.bailu.gtk.type.Pointer instance, String methodName, OnRender in) {
        JnaGLAreaClass.OnRender out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context) -> in.onRender(__callback, new GLArea(new PointerContainer(_area)), new ch.bailu.gtk.gdk.GLContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnResize {
        /**
         * 
         * @param area 
         * @param width 
         * @param height 
        */
        void onResize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull GLArea area, int width, int height);
    }
    
    private static JnaGLAreaClass.OnResize toOnResize(ch.bailu.gtk.type.Pointer instance, String methodName, OnResize in) {
        JnaGLAreaClass.OnResize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _width, _height) -> in.onResize(__callback, new GLArea(new PointerContainer(_area)), _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateContext {
        /**
         * 
         * @param area 
         * @return 
        */
        ch.bailu.gtk.gdk.GLContext onCreateContext(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull GLArea area);
    }
    
    private static JnaGLAreaClass.OnCreateContext toOnCreateContext(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateContext in) {
        JnaGLAreaClass.OnCreateContext out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area) -> in.onCreateContext(__callback, new GLArea(new PointerContainer(_area))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public GLAreaClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaGLAreaClass.Fields _fields;
    
    JnaGLAreaClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGLAreaClass.Fields(asCPointer());
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
     * <br>See {@link OnRender#onRender}
    */
    public static final String RENDER = "render";

    /**
     * 
     * <br>See {@link OnRender#onRender}
    */
    public void setFieldRender(OnRender render) {
        toFields().render = toOnRender(this, RENDER, render);
        toFields().writeField(RENDER);
    }

    /**
     * 
     * <br>See {@link OnRender#onRender}
    */
    public JnaGLAreaClass.OnRender getFieldRender() {
       toFields().readField(RENDER);
       return toFields().render;
    } 

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
    public JnaGLAreaClass.OnResize getFieldResize() {
       toFields().readField(RESIZE);
       return toFields().resize;
    } 

    /**
     * 
     * <br>See {@link OnCreateContext#onCreateContext}
    */
    public static final String CREATE_CONTEXT = "create_context";

    /**
     * 
     * <br>See {@link OnCreateContext#onCreateContext}
    */
    public void setFieldCreateContext(OnCreateContext create_context) {
        toFields().create_context = toOnCreateContext(this, CREATE_CONTEXT, create_context);
        toFields().writeField(CREATE_CONTEXT);
    }

    /**
     * 
     * <br>See {@link OnCreateContext#onCreateContext}
    */
    public JnaGLAreaClass.OnCreateContext getFieldCreateContext() {
       toFields().readField(CREATE_CONTEXT);
       return toFields().create_context;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(GLArea.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(GLArea.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:_padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
