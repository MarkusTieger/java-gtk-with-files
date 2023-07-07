/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellAreaClass.html">https://docs.gtk.org/gtk4/struct.CellAreaClass.html</a></p>
*/
public class CellAreaClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellAreaClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAdd {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param renderer the `GtkCellRenderer` to add to &#64;area
        */
        void onAdd(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellRenderer renderer);
    }
    
    private static JnaCellAreaClass.OnAdd toOnAdd(ch.bailu.gtk.type.Pointer instance, String methodName, OnAdd in) {
        JnaCellAreaClass.OnAdd out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _renderer) -> in.onAdd(__callback, new CellArea(new PointerContainer(_area)), new CellRenderer(new PointerContainer(_renderer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemove {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param renderer the `GtkCellRenderer` to remove from &#64;area
        */
        void onRemove(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellRenderer renderer);
    }
    
    private static JnaCellAreaClass.OnRemove toOnRemove(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemove in) {
        JnaCellAreaClass.OnRemove out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _renderer) -> in.onRemove(__callback, new CellArea(new PointerContainer(_area)), new CellRenderer(new PointerContainer(_renderer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEvent {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context for this row of data.
         * @param widget the `GtkWidget` that &#64;area is rendering to
         * @param event the `GdkEvent` to handle
         * @param cell_area the &#64;widget relative coordinates for &#64;area
         * @param flags the `GtkCellRenderer`State for &#64;area in this row.
         * @return %TRUE if the event was handled by &#64;area.
        */
        int onEvent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags);
    }
    
    private static JnaCellAreaClass.OnEvent toOnEvent(ch.bailu.gtk.type.Pointer instance, String methodName, OnEvent in) {
        JnaCellAreaClass.OnEvent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _event, _cell_area, _flags) -> in.onEvent(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.gdk.Event(new PointerContainer(_event)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSnapshot {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context for this row of data.
         * @param widget the `GtkWidget` that &#64;area is rendering to
         * @param snapshot the `GtkSnapshot` to draw to
         * @param background_area the &#64;widget relative coordinates for &#64;area’s background
         * @param cell_area the &#64;widget relative coordinates for &#64;area
         * @param flags the `GtkCellRenderer`State for &#64;area in this row.
         * @param paint_focus whether &#64;area should paint focus on focused cells for focused rows or not.
        */
        void onSnapshot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull Snapshot snapshot, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags, boolean paint_focus);
    }
    
    private static JnaCellAreaClass.OnSnapshot toOnSnapshot(ch.bailu.gtk.type.Pointer instance, String methodName, OnSnapshot in) {
        JnaCellAreaClass.OnSnapshot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _snapshot, _background_area, _cell_area, _flags, _paint_focus) -> in.onSnapshot(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), new Snapshot(new PointerContainer(_snapshot)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_background_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags, _paint_focus);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnApplyAttributes {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param tree_model the `GtkTreeModel` to pull values from
         * @param iter the `GtkTreeIter` in &#64;tree_model to apply values for
         * @param is_expander whether &#64;iter has children
         * @param is_expanded whether &#64;iter is expanded in the view and               children are visible
        */
        void onApplyAttributes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, boolean is_expander, boolean is_expanded);
    }
    
    private static JnaCellAreaClass.OnApplyAttributes toOnApplyAttributes(ch.bailu.gtk.type.Pointer instance, String methodName, OnApplyAttributes in) {
        JnaCellAreaClass.OnApplyAttributes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _tree_model, _iter, _is_expander, _is_expanded) -> in.onApplyAttributes(__callback, new CellArea(new PointerContainer(_area)), new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), _is_expander, _is_expanded);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateContext {
        /**
         * 
         * @param area a `GtkCellArea`
         * @return a newly created `GtkCellArea`Context which can be used with &#64;area.
        */
        CellAreaContext onCreateContext(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area);
    }
    
    private static JnaCellAreaClass.OnCreateContext toOnCreateContext(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateContext in) {
        JnaCellAreaClass.OnCreateContext out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area) -> in.onCreateContext(__callback, new CellArea(new PointerContainer(_area))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCopyContext {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context to copy
         * @return a newly created `GtkCellArea`Context copy of &#64;context.
        */
        CellAreaContext onCopyContext(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context);
    }
    
    private static JnaCellAreaClass.OnCopyContext toOnCopyContext(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyContext in) {
        JnaCellAreaClass.OnCopyContext out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context) -> in.onCopyContext(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRequestMode {
        /**
         * 
         * @param area a `GtkCellArea`
         * @return The `GtkSizeRequestMode` preferred by &#64;area.
        */
        int onGetRequestMode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area);
    }
    
    private static JnaCellAreaClass.OnGetRequestMode toOnGetRequestMode(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRequestMode in) {
        JnaCellAreaClass.OnGetRequestMode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area) -> in.onGetRequestMode(__callback, new CellArea(new PointerContainer(_area)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredWidth {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context to perform this request with
         * @param widget the `GtkWidget` where &#64;area will be rendering
         * @param minimum_width location to store the minimum width
         * @param natural_width location to store the natural width
        */
        void onGetPreferredWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width);
    }
    
    private static JnaCellAreaClass.OnGetPreferredWidth toOnGetPreferredWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredWidth in) {
        JnaCellAreaClass.OnGetPreferredWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _minimum_width, _natural_width) -> in.onGetPreferredWidth(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_width)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_width)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context which has already been requested for widths.
         * @param widget the `GtkWidget` where &#64;area will be rendering
         * @param width the width for which to check the height of this area
         * @param minimum_height location to store the minimum height
         * @param natural_height location to store the natural height
        */
        void onGetPreferredHeightForWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height);
    }
    
    private static JnaCellAreaClass.OnGetPreferredHeightForWidth toOnGetPreferredHeightForWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredHeightForWidth in) {
        JnaCellAreaClass.OnGetPreferredHeightForWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _width, _minimum_height, _natural_height) -> in.onGetPreferredHeightForWidth(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), _width, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_height)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_height)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredHeight {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context to perform this request with
         * @param widget the `GtkWidget` where &#64;area will be rendering
         * @param minimum_height location to store the minimum height
         * @param natural_height location to store the natural height
        */
        void onGetPreferredHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height);
    }
    
    private static JnaCellAreaClass.OnGetPreferredHeight toOnGetPreferredHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredHeight in) {
        JnaCellAreaClass.OnGetPreferredHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _minimum_height, _natural_height) -> in.onGetPreferredHeight(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_height)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_height)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context which has already been requested for widths.
         * @param widget the `GtkWidget` where &#64;area will be rendering
         * @param height the height for which to check the width of this area
         * @param minimum_width location to store the minimum width
         * @param natural_width location to store the natural width
        */
        void onGetPreferredWidthForHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width);
    }
    
    private static JnaCellAreaClass.OnGetPreferredWidthForHeight toOnGetPreferredWidthForHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredWidthForHeight in) {
        JnaCellAreaClass.OnGetPreferredWidthForHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _height, _minimum_width, _natural_width) -> in.onGetPreferredWidthForHeight(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), _height, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_width)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_width)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetCellProperty {
        /**
         * 
         * @param area 
         * @param renderer 
         * @param property_id 
         * @param value 
         * @param pspec 
        */
        void onSetCellProperty(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellRenderer renderer, int property_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec);
    }
    
    private static JnaCellAreaClass.OnSetCellProperty toOnSetCellProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetCellProperty in) {
        JnaCellAreaClass.OnSetCellProperty out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _renderer, _property_id, _value, _pspec) -> in.onSetCellProperty(__callback, new CellArea(new PointerContainer(_area)), new CellRenderer(new PointerContainer(_renderer)), _property_id, new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCellProperty {
        /**
         * 
         * @param area 
         * @param renderer 
         * @param property_id 
         * @param value 
         * @param pspec 
        */
        void onGetCellProperty(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellRenderer renderer, int property_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec);
    }
    
    private static JnaCellAreaClass.OnGetCellProperty toOnGetCellProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCellProperty in) {
        JnaCellAreaClass.OnGetCellProperty out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _renderer, _property_id, _value, _pspec) -> in.onGetCellProperty(__callback, new CellArea(new PointerContainer(_area)), new CellRenderer(new PointerContainer(_renderer)), _property_id, new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFocus {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param direction the `GtkDirectionType`
         * @return %TRUE if focus remains inside &#64;area as a result of this call.
        */
        boolean onFocus(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, int direction);
    }
    
    private static JnaCellAreaClass.OnFocus toOnFocus(ch.bailu.gtk.type.Pointer instance, String methodName, OnFocus in) {
        JnaCellAreaClass.OnFocus out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _direction) -> in.onFocus(__callback, new CellArea(new PointerContainer(_area)), _direction);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsActivatable {
        /**
         * 
         * @param area a `GtkCellArea`
         * @return whether &#64;area can do anything when activated.
        */
        boolean onIsActivatable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area);
    }
    
    private static JnaCellAreaClass.OnIsActivatable toOnIsActivatable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsActivatable in) {
        JnaCellAreaClass.OnIsActivatable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area) -> in.onIsActivatable(__callback, new CellArea(new PointerContainer(_area)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param area a `GtkCellArea`
         * @param context the `GtkCellArea`Context in context with the current row data
         * @param widget the `GtkWidget` that &#64;area is rendering on
         * @param cell_area the size and location of &#64;area relative to &#64;widget’s allocation
         * @param flags the `GtkCellRenderer`State flags for &#64;area for this row of data.
         * @param edit_only if %TRUE then only cell renderers that are %GTK_CELL_RENDERER_MODE_EDITABLE             will be activated.
         * @return Whether &#64;area was successfully activated.
        */
        boolean onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellArea area, @Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags, boolean edit_only);
    }
    
    private static JnaCellAreaClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaCellAreaClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_area, _context, _widget, _cell_area, _flags, _edit_only) -> in.onActivate(__callback, new CellArea(new PointerContainer(_area)), new CellAreaContext(new PointerContainer(_context)), new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), _flags, _edit_only);
            __callback.register(out);
        }
        return out;
    }

    public CellAreaClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCellAreaClass.Fields _fields;
    
    JnaCellAreaClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellAreaClass.Fields(asCPointer());
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
     * <br>See {@link OnAdd#onAdd}
    */
    public static final String ADD = "add";

    /**
     * 
     * <br>See {@link OnAdd#onAdd}
    */
    public void setFieldAdd(OnAdd add) {
        toFields().add = toOnAdd(this, ADD, add);
        toFields().writeField(ADD);
    }

    /**
     * 
     * <br>See {@link OnAdd#onAdd}
    */
    public JnaCellAreaClass.OnAdd getFieldAdd() {
       toFields().readField(ADD);
       return toFields().add;
    } 

    /**
     * 
     * <br>See {@link OnRemove#onRemove}
    */
    public static final String REMOVE = "remove";

    /**
     * 
     * <br>See {@link OnRemove#onRemove}
    */
    public void setFieldRemove(OnRemove remove) {
        toFields().remove = toOnRemove(this, REMOVE, remove);
        toFields().writeField(REMOVE);
    }

    /**
     * 
     * <br>See {@link OnRemove#onRemove}
    */
    public JnaCellAreaClass.OnRemove getFieldRemove() {
       toFields().readField(REMOVE);
       return toFields().remove;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FOREACH = "foreach";

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FOREACH_ALLOC = "foreach_alloc";

    /**
     * 
     * <br>See {@link OnEvent#onEvent}
    */
    public static final String EVENT = "event";

    /**
     * 
     * <br>See {@link OnEvent#onEvent}
    */
    public void setFieldEvent(OnEvent event) {
        toFields().event = toOnEvent(this, EVENT, event);
        toFields().writeField(EVENT);
    }

    /**
     * 
     * <br>See {@link OnEvent#onEvent}
    */
    public JnaCellAreaClass.OnEvent getFieldEvent() {
       toFields().readField(EVENT);
       return toFields().event;
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
    public JnaCellAreaClass.OnSnapshot getFieldSnapshot() {
       toFields().readField(SNAPSHOT);
       return toFields().snapshot;
    } 

    /**
     * 
     * <br>See {@link OnApplyAttributes#onApplyAttributes}
    */
    public static final String APPLY_ATTRIBUTES = "apply_attributes";

    /**
     * 
     * <br>See {@link OnApplyAttributes#onApplyAttributes}
    */
    public void setFieldApplyAttributes(OnApplyAttributes apply_attributes) {
        toFields().apply_attributes = toOnApplyAttributes(this, APPLY_ATTRIBUTES, apply_attributes);
        toFields().writeField(APPLY_ATTRIBUTES);
    }

    /**
     * 
     * <br>See {@link OnApplyAttributes#onApplyAttributes}
    */
    public JnaCellAreaClass.OnApplyAttributes getFieldApplyAttributes() {
       toFields().readField(APPLY_ATTRIBUTES);
       return toFields().apply_attributes;
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
    public JnaCellAreaClass.OnCreateContext getFieldCreateContext() {
       toFields().readField(CREATE_CONTEXT);
       return toFields().create_context;
    } 

    /**
     * 
     * <br>See {@link OnCopyContext#onCopyContext}
    */
    public static final String COPY_CONTEXT = "copy_context";

    /**
     * 
     * <br>See {@link OnCopyContext#onCopyContext}
    */
    public void setFieldCopyContext(OnCopyContext copy_context) {
        toFields().copy_context = toOnCopyContext(this, COPY_CONTEXT, copy_context);
        toFields().writeField(COPY_CONTEXT);
    }

    /**
     * 
     * <br>See {@link OnCopyContext#onCopyContext}
    */
    public JnaCellAreaClass.OnCopyContext getFieldCopyContext() {
       toFields().readField(COPY_CONTEXT);
       return toFields().copy_context;
    } 

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
    public JnaCellAreaClass.OnGetRequestMode getFieldGetRequestMode() {
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
    public JnaCellAreaClass.OnGetPreferredWidth getFieldGetPreferredWidth() {
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
    public JnaCellAreaClass.OnGetPreferredHeightForWidth getFieldGetPreferredHeightForWidth() {
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
    public JnaCellAreaClass.OnGetPreferredHeight getFieldGetPreferredHeight() {
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
    public JnaCellAreaClass.OnGetPreferredWidthForHeight getFieldGetPreferredWidthForHeight() {
       toFields().readField(GET_PREFERRED_WIDTH_FOR_HEIGHT);
       return toFields().get_preferred_width_for_height;
    } 

    /**
     * 
     * <br>See {@link OnSetCellProperty#onSetCellProperty}
    */
    public static final String SET_CELL_PROPERTY = "set_cell_property";

    /**
     * 
     * <br>See {@link OnSetCellProperty#onSetCellProperty}
    */
    public void setFieldSetCellProperty(OnSetCellProperty set_cell_property) {
        toFields().set_cell_property = toOnSetCellProperty(this, SET_CELL_PROPERTY, set_cell_property);
        toFields().writeField(SET_CELL_PROPERTY);
    }

    /**
     * 
     * <br>See {@link OnSetCellProperty#onSetCellProperty}
    */
    public JnaCellAreaClass.OnSetCellProperty getFieldSetCellProperty() {
       toFields().readField(SET_CELL_PROPERTY);
       return toFields().set_cell_property;
    } 

    /**
     * 
     * <br>See {@link OnGetCellProperty#onGetCellProperty}
    */
    public static final String GET_CELL_PROPERTY = "get_cell_property";

    /**
     * 
     * <br>See {@link OnGetCellProperty#onGetCellProperty}
    */
    public void setFieldGetCellProperty(OnGetCellProperty get_cell_property) {
        toFields().get_cell_property = toOnGetCellProperty(this, GET_CELL_PROPERTY, get_cell_property);
        toFields().writeField(GET_CELL_PROPERTY);
    }

    /**
     * 
     * <br>See {@link OnGetCellProperty#onGetCellProperty}
    */
    public JnaCellAreaClass.OnGetCellProperty getFieldGetCellProperty() {
       toFields().readField(GET_CELL_PROPERTY);
       return toFields().get_cell_property;
    } 

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public static final String FOCUS = "focus";

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public void setFieldFocus(OnFocus focus) {
        toFields().focus = toOnFocus(this, FOCUS, focus);
        toFields().writeField(FOCUS);
    }

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public JnaCellAreaClass.OnFocus getFieldFocus() {
       toFields().readField(FOCUS);
       return toFields().focus;
    } 

    /**
     * 
     * <br>See {@link OnIsActivatable#onIsActivatable}
    */
    public static final String IS_ACTIVATABLE = "is_activatable";

    /**
     * 
     * <br>See {@link OnIsActivatable#onIsActivatable}
    */
    public void setFieldIsActivatable(OnIsActivatable is_activatable) {
        toFields().is_activatable = toOnIsActivatable(this, IS_ACTIVATABLE, is_activatable);
        toFields().writeField(IS_ACTIVATABLE);
    }

    /**
     * 
     * <br>See {@link OnIsActivatable#onIsActivatable}
    */
    public JnaCellAreaClass.OnIsActivatable getFieldIsActivatable() {
       toFields().readField(IS_ACTIVATABLE);
       return toFields().is_activatable;
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
    public JnaCellAreaClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    /**
     * Finds a cell property of a cell area class by name.
     * @param property_name the name of the child property to find
     * @return the `GParamSpec` of the child property
    */
    public ch.bailu.gtk.gobject.ParamSpec findCellProperty(@Nonnull ch.bailu.gtk.type.Str property_name)  {
        return new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(JnaCellAreaClass.INST().gtk_cell_area_class_find_cell_property(asCPointer(), asCPointerNotNull(property_name))));
    }

    /**
     * Finds a cell property of a cell area class by name.
     * @param property_name the name of the child property to find
     * @return the `GParamSpec` of the child property
    */
    public ch.bailu.gtk.gobject.ParamSpec findCellProperty(String property_name)  {
        return new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(JnaCellAreaClass.INST().gtk_cell_area_class_find_cell_property(asCPointer(), property_name)));
    }

    /**
     * Installs a cell property on a cell area class.
     * @param property_id the id for the property
     * @param pspec the `GParamSpec` for the property
    */
    public void installCellProperty(int property_id, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        JnaCellAreaClass.INST().gtk_cell_area_class_install_cell_property(asCPointer(), property_id, asCPointerNotNull(pspec));
    }

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellArea.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellArea.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[MethodModel:cb-return-value-not-supported:java-type-not-supported:listCellProperties:[ParameterModel:java-type-not-supported:{G_::{c:GParamSpec**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
