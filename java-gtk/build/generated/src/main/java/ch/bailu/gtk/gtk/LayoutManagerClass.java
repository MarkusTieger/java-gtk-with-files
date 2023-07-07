/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkLayoutManagerClass` structure contains only private data, and
 * <br>should only be accessed through the provided API, or when subclassing
 * <br>`GtkLayoutManager`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.LayoutManagerClass.html">https://docs.gtk.org/gtk4/struct.LayoutManagerClass.html</a></p>
*/
public class LayoutManagerClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LayoutManagerClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetRequestMode {
        /**
         * 
         * @param manager 
         * @param widget 
         * @return 
        */
        int onGetRequestMode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager, @Nonnull Widget widget);
    }
    
    private static JnaLayoutManagerClass.OnGetRequestMode toOnGetRequestMode(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRequestMode in) {
        JnaLayoutManagerClass.OnGetRequestMode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _widget) -> in.onGetRequestMode(__callback, new LayoutManager(new PointerContainer(_manager)), new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMeasure {
        /**
         * 
         * @param manager a `GtkLayoutManager`
         * @param widget the `GtkWidget` using &#64;manager
         * @param orientation the orientation to measure
         * @param for_size Size for the opposite of &#64;orientation; for instance, if   the &#64;orientation is %GTK_ORIENTATION_HORIZONTAL, this is the height   of the widget; if the &#64;orientation is %GTK_ORIENTATION_VERTICAL, this   is the width of the widget. This allows to measure the height for the   given width, and the width for the given height. Use -1 if the size   is not known
         * @param minimum the minimum size for the given size and   orientation
         * @param natural the natural, or preferred size for the   given size and orientation
         * @param minimum_baseline the baseline position for the   minimum size
         * @param natural_baseline the baseline position for the   natural size
        */
        void onMeasure(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager, @Nonnull Widget widget, int orientation, int for_size, @Nullable ch.bailu.gtk.type.Int minimum, @Nullable ch.bailu.gtk.type.Int natural, @Nullable ch.bailu.gtk.type.Int minimum_baseline, @Nullable ch.bailu.gtk.type.Int natural_baseline);
    }
    
    private static JnaLayoutManagerClass.OnMeasure toOnMeasure(ch.bailu.gtk.type.Pointer instance, String methodName, OnMeasure in) {
        JnaLayoutManagerClass.OnMeasure out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _widget, _orientation, _for_size, _minimum, _natural, _minimum_baseline, _natural_baseline) -> in.onMeasure(__callback, new LayoutManager(new PointerContainer(_manager)), new Widget(new PointerContainer(_widget)), _orientation, _for_size, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_baseline)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_baseline)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAllocate {
        /**
         * 
         * @param manager a `GtkLayoutManager`
         * @param widget the `GtkWidget` using &#64;manager
         * @param width the new width of the &#64;widget
         * @param height the new height of the &#64;widget
         * @param baseline the baseline position of the &#64;widget, or -1
        */
        void onAllocate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager, @Nonnull Widget widget, int width, int height, int baseline);
    }
    
    private static JnaLayoutManagerClass.OnAllocate toOnAllocate(ch.bailu.gtk.type.Pointer instance, String methodName, OnAllocate in) {
        JnaLayoutManagerClass.OnAllocate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _widget, _width, _height, _baseline) -> in.onAllocate(__callback, new LayoutManager(new PointerContainer(_manager)), new Widget(new PointerContainer(_widget)), _width, _height, _baseline);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateLayoutChild {
        /**
         * 
         * @param manager the `GtkLayoutManager`
         * @param widget the widget using the &#64;manager
         * @param for_child the child of &#64;widget
         * @return a `GtkLayoutChild`
        */
        LayoutChild onCreateLayoutChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager, @Nonnull Widget widget, @Nonnull Widget for_child);
    }
    
    private static JnaLayoutManagerClass.OnCreateLayoutChild toOnCreateLayoutChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateLayoutChild in) {
        JnaLayoutManagerClass.OnCreateLayoutChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _widget, _for_child) -> in.onCreateLayoutChild(__callback, new LayoutManager(new PointerContainer(_manager)), new Widget(new PointerContainer(_widget)), new Widget(new PointerContainer(_for_child))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRoot {
        /**
         * 
         * @param manager 
        */
        void onRoot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager);
    }
    
    private static JnaLayoutManagerClass.OnRoot toOnRoot(ch.bailu.gtk.type.Pointer instance, String methodName, OnRoot in) {
        JnaLayoutManagerClass.OnRoot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager) -> in.onRoot(__callback, new LayoutManager(new PointerContainer(_manager)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnroot {
        /**
         * 
         * @param manager 
        */
        void onUnroot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull LayoutManager manager);
    }
    
    private static JnaLayoutManagerClass.OnUnroot toOnUnroot(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnroot in) {
        JnaLayoutManagerClass.OnUnroot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager) -> in.onUnroot(__callback, new LayoutManager(new PointerContainer(_manager)));
            __callback.register(out);
        }
        return out;
    }

    public LayoutManagerClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaLayoutManagerClass.Fields _fields;
    
    JnaLayoutManagerClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLayoutManagerClass.Fields(asCPointer());
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
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public static final String GET_REQUEST_MODE = "get_request_mode";

    /**
     * 
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public void setFieldGetRequestMode(OnGetRequestMode get_request_mode) {
        toFields().get_request_mode = toOnGetRequestMode(this, GET_REQUEST_MODE, get_request_mode);
        toFields().writeField(GET_REQUEST_MODE);
    }

    /**
     * 
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public JnaLayoutManagerClass.OnGetRequestMode getFieldGetRequestMode() {
       toFields().readField(GET_REQUEST_MODE);
       return toFields().get_request_mode;
    } 

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public static final String MEASURE = "measure";

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public void setFieldMeasure(OnMeasure measure) {
        toFields().measure = toOnMeasure(this, MEASURE, measure);
        toFields().writeField(MEASURE);
    }

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public JnaLayoutManagerClass.OnMeasure getFieldMeasure() {
       toFields().readField(MEASURE);
       return toFields().measure;
    } 

    /**
     * 
     * <br>See {@link OnAllocate#onAllocate}
    */
    public static final String ALLOCATE = "allocate";

    /**
     * 
     * <br>See {@link OnAllocate#onAllocate}
    */
    public void setFieldAllocate(OnAllocate allocate) {
        toFields().allocate = toOnAllocate(this, ALLOCATE, allocate);
        toFields().writeField(ALLOCATE);
    }

    /**
     * 
     * <br>See {@link OnAllocate#onAllocate}
    */
    public JnaLayoutManagerClass.OnAllocate getFieldAllocate() {
       toFields().readField(ALLOCATE);
       return toFields().allocate;
    } 

    /**
     * the type of `GtkLayoutChild` used by this layout manager
    */
    public static final String LAYOUT_CHILD_TYPE = "layout_child_type";

    /**
     * the type of `GtkLayoutChild` used by this layout manager
    */
    public long getFieldLayoutChildType() {
       toFields().readField(LAYOUT_CHILD_TYPE);
       return toFields().layout_child_type;
    } 

    /**
     * 
     * <br>See {@link OnCreateLayoutChild#onCreateLayoutChild}
    */
    public static final String CREATE_LAYOUT_CHILD = "create_layout_child";

    /**
     * 
     * <br>See {@link OnCreateLayoutChild#onCreateLayoutChild}
    */
    public void setFieldCreateLayoutChild(OnCreateLayoutChild create_layout_child) {
        toFields().create_layout_child = toOnCreateLayoutChild(this, CREATE_LAYOUT_CHILD, create_layout_child);
        toFields().writeField(CREATE_LAYOUT_CHILD);
    }

    /**
     * 
     * <br>See {@link OnCreateLayoutChild#onCreateLayoutChild}
    */
    public JnaLayoutManagerClass.OnCreateLayoutChild getFieldCreateLayoutChild() {
       toFields().readField(CREATE_LAYOUT_CHILD);
       return toFields().create_layout_child;
    } 

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public static final String ROOT = "root";

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public void setFieldRoot(OnRoot root) {
        toFields().root = toOnRoot(this, ROOT, root);
        toFields().writeField(ROOT);
    }

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public JnaLayoutManagerClass.OnRoot getFieldRoot() {
       toFields().readField(ROOT);
       return toFields().root;
    } 

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public static final String UNROOT = "unroot";

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public void setFieldUnroot(OnUnroot unroot) {
        toFields().unroot = toOnUnroot(this, UNROOT, unroot);
        toFields().writeField(UNROOT);
    }

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public JnaLayoutManagerClass.OnUnroot getFieldUnroot() {
       toFields().readField(UNROOT);
       return toFields().unroot;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(LayoutManager.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(LayoutManager.getParentTypeID());
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
