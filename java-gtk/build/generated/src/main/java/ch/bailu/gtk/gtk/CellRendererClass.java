/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellRendererClass.html">https://docs.gtk.org/gtk4/struct.CellRendererClass.html</a></p>
*/
public class CellRendererClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetRequestMode {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @return The `GtkSizeRequestMode` preferred by this renderer.
        */
        int onGetRequestMode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell);
    }
    
    private static JnaCellRendererClass.OnGetRequestMode toOnGetRequestMode(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRequestMode in) {
        JnaCellRendererClass.OnGetRequestMode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell) -> in.onGetRequestMode(__callback, new CellRenderer(new PointerContainer(_cell)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredWidth {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @param widget the `GtkWidget` this cell will be rendering to
         * @param minimum_size location to store the minimum size
         * @param natural_size location to store the natural size
        */
        void onGetPreferredWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_size, @Nullable ch.bailu.gtk.type.Int natural_size);
    }
    
    private static JnaCellRendererClass.OnGetPreferredWidth toOnGetPreferredWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredWidth in) {
        JnaCellRendererClass.OnGetPreferredWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _widget, _minimum_size, _natural_size) -> in.onGetPreferredWidth(__callback, new CellRenderer(new PointerContainer(_cell)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_size)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_size)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @param widget the `GtkWidget` this cell will be rendering to
         * @param width the size which is available for allocation
         * @param minimum_height location for storing the minimum size
         * @param natural_height location for storing the preferred size
        */
        void onGetPreferredHeightForWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Widget widget, int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height);
    }
    
    private static JnaCellRendererClass.OnGetPreferredHeightForWidth toOnGetPreferredHeightForWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredHeightForWidth in) {
        JnaCellRendererClass.OnGetPreferredHeightForWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _widget, _width, _minimum_height, _natural_height) -> in.onGetPreferredHeightForWidth(__callback, new CellRenderer(new PointerContainer(_cell)), new Widget(new PointerContainer(_widget)), _width, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_height)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_height)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredHeight {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @param widget the `GtkWidget` this cell will be rendering to
         * @param minimum_size location to store the minimum size
         * @param natural_size location to store the natural size
        */
        void onGetPreferredHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_size, @Nullable ch.bailu.gtk.type.Int natural_size);
    }
    
    private static JnaCellRendererClass.OnGetPreferredHeight toOnGetPreferredHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredHeight in) {
        JnaCellRendererClass.OnGetPreferredHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _widget, _minimum_size, _natural_size) -> in.onGetPreferredHeight(__callback, new CellRenderer(new PointerContainer(_cell)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_size)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_size)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @param widget the `GtkWidget` this cell will be rendering to
         * @param height the size which is available for allocation
         * @param minimum_width location for storing the minimum size
         * @param natural_width location for storing the preferred size
        */
        void onGetPreferredWidthForHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Widget widget, int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width);
    }
    
    private static JnaCellRendererClass.OnGetPreferredWidthForHeight toOnGetPreferredWidthForHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredWidthForHeight in) {
        JnaCellRendererClass.OnGetPreferredWidthForHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _widget, _height, _minimum_width, _natural_width) -> in.onGetPreferredWidthForHeight(__callback, new CellRenderer(new PointerContainer(_cell)), new Widget(new PointerContainer(_widget)), _height, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_width)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_width)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetAlignedArea {
        /**
         * 
         * @param cell a `GtkCellRenderer` instance
         * @param widget the `GtkWidget` this cell will be rendering to
         * @param flags render flags
         * @param cell_area cell area which would be passed to gtk_cell_renderer_render()
         * @param aligned_area the return location for the space inside &#64;cell_area                that would actually be used to render.
        */
        void onGetAlignedArea(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Widget widget, int flags, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle aligned_area);
    }
    
    private static JnaCellRendererClass.OnGetAlignedArea toOnGetAlignedArea(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetAlignedArea in) {
        JnaCellRendererClass.OnGetAlignedArea out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _widget, _flags, _cell_area, _aligned_area) -> in.onGetAlignedArea(__callback, new CellRenderer(new PointerContainer(_cell)), new Widget(new PointerContainer(_widget)), _flags, new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_aligned_area)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSnapshot {
        /**
         * 
         * @param cell a `GtkCellRenderer`
         * @param snapshot a `GtkSnapshot` to draw to
         * @param widget the widget owning &#64;window
         * @param background_area entire cell area (including tree expanders and maybe    padding on the sides)
         * @param cell_area area normally rendered by a cell renderer
         * @param flags flags that affect rendering
        */
        void onSnapshot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull Snapshot snapshot, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags);
    }
    
    private static JnaCellRendererClass.OnSnapshot toOnSnapshot(ch.bailu.gtk.type.Pointer instance, String methodName, OnSnapshot in) {
        JnaCellRendererClass.OnSnapshot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _snapshot, _widget, _background_area, _cell_area, _flags) -> in.onSnapshot(__callback, new CellRenderer(new PointerContainer(_cell)), new Snapshot(new PointerContainer(_snapshot)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_background_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param cell a `GtkCellRenderer`
         * @param event a `GdkEvent`
         * @param widget widget that received the event
         * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
         * @param background_area background area as passed to gtk_cell_renderer_render()
         * @param cell_area cell area as passed to gtk_cell_renderer_render()
         * @param flags render flags
         * @return %TRUE if the event was consumed/handled
        */
        boolean onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags);
    }
    
    private static JnaCellRendererClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaCellRendererClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _event, _widget, _path, _background_area, _cell_area, _flags) -> in.onActivate(__callback, new CellRenderer(new PointerContainer(_cell)), new ch.bailu.gtk.gdk.Event(new PointerContainer(_event)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_background_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStartEditing {
        /**
         * 
         * @param cell a `GtkCellRenderer`
         * @param event a `GdkEvent`
         * @param widget widget that received the event
         * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
         * @param background_area background area as passed to gtk_cell_renderer_render()
         * @param cell_area cell area as passed to gtk_cell_renderer_render()
         * @param flags render flags
         * @return A new `GtkCellEditable` for editing this   &#64;cell, or %NULL if editing is not possible
        */
        CellEditable onStartEditing(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nullable ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags);
    }
    
    private static JnaCellRendererClass.OnStartEditing toOnStartEditing(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartEditing in) {
        JnaCellRendererClass.OnStartEditing out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _event, _widget, _path, _background_area, _cell_area, _flags) -> in.onStartEditing(__callback, new CellRenderer(new PointerContainer(_cell)), new ch.bailu.gtk.gdk.Event(new PointerContainer(_event)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_background_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEditingCanceled {
        /**
         * 
         * @param cell 
        */
        void onEditingCanceled(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell);
    }
    
    private static JnaCellRendererClass.OnEditingCanceled toOnEditingCanceled(ch.bailu.gtk.type.Pointer instance, String methodName, OnEditingCanceled in) {
        JnaCellRendererClass.OnEditingCanceled out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell) -> in.onEditingCanceled(__callback, new CellRenderer(new PointerContainer(_cell)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEditingStarted {
        /**
         * 
         * @param cell 
         * @param editable 
         * @param path 
        */
        void onEditingStarted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer cell, @Nonnull CellEditable editable, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static JnaCellRendererClass.OnEditingStarted toOnEditingStarted(ch.bailu.gtk.type.Pointer instance, String methodName, OnEditingStarted in) {
        JnaCellRendererClass.OnEditingStarted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell, _editable, _path) -> in.onEditingStarted(__callback, new CellRenderer(new PointerContainer(_cell)), new CellEditable(new PointerContainer(_editable)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    public CellRendererClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCellRendererClass.Fields _fields;
    
    JnaCellRendererClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellRendererClass.Fields(asCPointer());
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
    public JnaCellRendererClass.OnGetRequestMode getFieldGetRequestMode() {
       toFields().readField(GET_REQUEST_MODE);
       return toFields().get_request_mode;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredWidth#onGetPreferredWidth}
    */
    public static final String GET_PREFERRED_WIDTH = "get_preferred_width";

    /**
     * 
     * <br>See {@link OnGetPreferredWidth#onGetPreferredWidth}
    */
    public void setFieldGetPreferredWidth(OnGetPreferredWidth get_preferred_width) {
        toFields().get_preferred_width = toOnGetPreferredWidth(this, GET_PREFERRED_WIDTH, get_preferred_width);
        toFields().writeField(GET_PREFERRED_WIDTH);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredWidth#onGetPreferredWidth}
    */
    public JnaCellRendererClass.OnGetPreferredWidth getFieldGetPreferredWidth() {
       toFields().readField(GET_PREFERRED_WIDTH);
       return toFields().get_preferred_width;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public static final String GET_PREFERRED_HEIGHT_FOR_WIDTH = "get_preferred_height_for_width";

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public void setFieldGetPreferredHeightForWidth(OnGetPreferredHeightForWidth get_preferred_height_for_width) {
        toFields().get_preferred_height_for_width = toOnGetPreferredHeightForWidth(this, GET_PREFERRED_HEIGHT_FOR_WIDTH, get_preferred_height_for_width);
        toFields().writeField(GET_PREFERRED_HEIGHT_FOR_WIDTH);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public JnaCellRendererClass.OnGetPreferredHeightForWidth getFieldGetPreferredHeightForWidth() {
       toFields().readField(GET_PREFERRED_HEIGHT_FOR_WIDTH);
       return toFields().get_preferred_height_for_width;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredHeight#onGetPreferredHeight}
    */
    public static final String GET_PREFERRED_HEIGHT = "get_preferred_height";

    /**
     * 
     * <br>See {@link OnGetPreferredHeight#onGetPreferredHeight}
    */
    public void setFieldGetPreferredHeight(OnGetPreferredHeight get_preferred_height) {
        toFields().get_preferred_height = toOnGetPreferredHeight(this, GET_PREFERRED_HEIGHT, get_preferred_height);
        toFields().writeField(GET_PREFERRED_HEIGHT);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredHeight#onGetPreferredHeight}
    */
    public JnaCellRendererClass.OnGetPreferredHeight getFieldGetPreferredHeight() {
       toFields().readField(GET_PREFERRED_HEIGHT);
       return toFields().get_preferred_height;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public static final String GET_PREFERRED_WIDTH_FOR_HEIGHT = "get_preferred_width_for_height";

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public void setFieldGetPreferredWidthForHeight(OnGetPreferredWidthForHeight get_preferred_width_for_height) {
        toFields().get_preferred_width_for_height = toOnGetPreferredWidthForHeight(this, GET_PREFERRED_WIDTH_FOR_HEIGHT, get_preferred_width_for_height);
        toFields().writeField(GET_PREFERRED_WIDTH_FOR_HEIGHT);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public JnaCellRendererClass.OnGetPreferredWidthForHeight getFieldGetPreferredWidthForHeight() {
       toFields().readField(GET_PREFERRED_WIDTH_FOR_HEIGHT);
       return toFields().get_preferred_width_for_height;
    } 

    /**
     * 
     * <br>See {@link OnGetAlignedArea#onGetAlignedArea}
    */
    public static final String GET_ALIGNED_AREA = "get_aligned_area";

    /**
     * 
     * <br>See {@link OnGetAlignedArea#onGetAlignedArea}
    */
    public void setFieldGetAlignedArea(OnGetAlignedArea get_aligned_area) {
        toFields().get_aligned_area = toOnGetAlignedArea(this, GET_ALIGNED_AREA, get_aligned_area);
        toFields().writeField(GET_ALIGNED_AREA);
    }

    /**
     * 
     * <br>See {@link OnGetAlignedArea#onGetAlignedArea}
    */
    public JnaCellRendererClass.OnGetAlignedArea getFieldGetAlignedArea() {
       toFields().readField(GET_ALIGNED_AREA);
       return toFields().get_aligned_area;
    } 

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public static final String SNAPSHOT = "snapshot";

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public void setFieldSnapshot(OnSnapshot snapshot) {
        toFields().snapshot = toOnSnapshot(this, SNAPSHOT, snapshot);
        toFields().writeField(SNAPSHOT);
    }

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public JnaCellRendererClass.OnSnapshot getFieldSnapshot() {
       toFields().readField(SNAPSHOT);
       return toFields().snapshot;
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
    public JnaCellRendererClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    /**
     * 
     * <br>See {@link OnStartEditing#onStartEditing}
    */
    public static final String START_EDITING = "start_editing";

    /**
     * 
     * <br>See {@link OnStartEditing#onStartEditing}
    */
    public void setFieldStartEditing(OnStartEditing start_editing) {
        toFields().start_editing = toOnStartEditing(this, START_EDITING, start_editing);
        toFields().writeField(START_EDITING);
    }

    /**
     * 
     * <br>See {@link OnStartEditing#onStartEditing}
    */
    public JnaCellRendererClass.OnStartEditing getFieldStartEditing() {
       toFields().readField(START_EDITING);
       return toFields().start_editing;
    } 

    /**
     * 
     * <br>See {@link OnEditingCanceled#onEditingCanceled}
    */
    public static final String EDITING_CANCELED = "editing_canceled";

    /**
     * 
     * <br>See {@link OnEditingCanceled#onEditingCanceled}
    */
    public void setFieldEditingCanceled(OnEditingCanceled editing_canceled) {
        toFields().editing_canceled = toOnEditingCanceled(this, EDITING_CANCELED, editing_canceled);
        toFields().writeField(EDITING_CANCELED);
    }

    /**
     * 
     * <br>See {@link OnEditingCanceled#onEditingCanceled}
    */
    public JnaCellRendererClass.OnEditingCanceled getFieldEditingCanceled() {
       toFields().readField(EDITING_CANCELED);
       return toFields().editing_canceled;
    } 

    /**
     * 
     * <br>See {@link OnEditingStarted#onEditingStarted}
    */
    public static final String EDITING_STARTED = "editing_started";

    /**
     * 
     * <br>See {@link OnEditingStarted#onEditingStarted}
    */
    public void setFieldEditingStarted(OnEditingStarted editing_started) {
        toFields().editing_started = toOnEditingStarted(this, EDITING_STARTED, editing_started);
        toFields().writeField(EDITING_STARTED);
    }

    /**
     * 
     * <br>See {@link OnEditingStarted#onEditingStarted}
    */
    public JnaCellRendererClass.OnEditingStarted getFieldEditingStarted() {
       toFields().readField(EDITING_STARTED);
       return toFields().editing_started;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellRenderer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellRenderer.getParentTypeID());
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
