/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellLayoutIface.html">https://docs.gtk.org/gtk4/struct.CellLayoutIface.html</a></p>
*/
public class CellLayoutIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellLayoutIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPackStart {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @param cell a `GtkCellRenderer`
         * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;cell_layout
        */
        void onPackStart(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell, boolean expand);
    }
    
    private static JnaCellLayoutIface.OnPackStart toOnPackStart(ch.bailu.gtk.type.Pointer instance, String methodName, OnPackStart in) {
        JnaCellLayoutIface.OnPackStart out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell, _expand) -> in.onPackStart(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)), _expand);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPackEnd {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @param cell a `GtkCellRenderer`
         * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;cell_layout
        */
        void onPackEnd(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell, boolean expand);
    }
    
    private static JnaCellLayoutIface.OnPackEnd toOnPackEnd(ch.bailu.gtk.type.Pointer instance, String methodName, OnPackEnd in) {
        JnaCellLayoutIface.OnPackEnd out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell, _expand) -> in.onPackEnd(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)), _expand);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClear {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
        */
        void onClear(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout);
    }
    
    private static JnaCellLayoutIface.OnClear toOnClear(ch.bailu.gtk.type.Pointer instance, String methodName, OnClear in) {
        JnaCellLayoutIface.OnClear out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout) -> in.onClear(__callback, new CellLayout(new PointerContainer(_cell_layout)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAddAttribute {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @param cell a `GtkCellRenderer`
         * @param attribute a property on the renderer
         * @param column the column position on the model to get the attribute from
        */
        void onAddAttribute(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell, @Nonnull ch.bailu.gtk.type.Str attribute, int column);
    }
    
    private static JnaCellLayoutIface.OnAddAttribute toOnAddAttribute(ch.bailu.gtk.type.Pointer instance, String methodName, OnAddAttribute in) {
        JnaCellLayoutIface.OnAddAttribute out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell, _attribute, _column) -> in.onAddAttribute(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)), new ch.bailu.gtk.type.Str(new PointerContainer(_attribute)), _column);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClearAttributes {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @param cell a `GtkCellRenderer` to clear the attribute mapping on
        */
        void onClearAttributes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell);
    }
    
    private static JnaCellLayoutIface.OnClearAttributes toOnClearAttributes(ch.bailu.gtk.type.Pointer instance, String methodName, OnClearAttributes in) {
        JnaCellLayoutIface.OnClearAttributes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell) -> in.onClearAttributes(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReorder {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @param cell a `GtkCellRenderer` to reorder
         * @param position new position to insert &#64;cell at
        */
        void onReorder(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell, int position);
    }
    
    private static JnaCellLayoutIface.OnReorder toOnReorder(ch.bailu.gtk.type.Pointer instance, String methodName, OnReorder in) {
        JnaCellLayoutIface.OnReorder out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell, _position) -> in.onReorder(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)), _position);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCells {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @return    a list of cell renderers. The list, but not the renderers has   been newly allocated and should be freed with g_list_free()   when no longer needed.
        */
        ch.bailu.gtk.glib.List onGetCells(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout);
    }
    
    private static JnaCellLayoutIface.OnGetCells toOnGetCells(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCells in) {
        JnaCellLayoutIface.OnGetCells out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout) -> in.onGetCells(__callback, new CellLayout(new PointerContainer(_cell_layout))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetArea {
        /**
         * 
         * @param cell_layout a `GtkCellLayout`
         * @return the cell area used by &#64;cell_layout
        */
        CellArea onGetArea(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout);
    }
    
    private static JnaCellLayoutIface.OnGetArea toOnGetArea(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetArea in) {
        JnaCellLayoutIface.OnGetArea out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout) -> in.onGetArea(__callback, new CellLayout(new PointerContainer(_cell_layout))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public CellLayoutIface(PointerContainer pointer) {
        super(pointer);
    }

    public CellLayoutIface() {
        super(cast(JnaCellLayoutIface.allocateStructure()));
    }

    private JnaCellLayoutIface.Fields _fields;
    
    JnaCellLayoutIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellLayoutIface.Fields(asCPointer());
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
     * <br>See {@link OnPackStart#onPackStart}
    */
    public static final String PACK_START = "pack_start";

    /**
     * 
     * <br>See {@link OnPackStart#onPackStart}
    */
    public void setFieldPackStart(OnPackStart pack_start) {
        toFields().pack_start = toOnPackStart(this, PACK_START, pack_start);
        toFields().writeField(PACK_START);
    }

    /**
     * 
     * <br>See {@link OnPackStart#onPackStart}
    */
    public JnaCellLayoutIface.OnPackStart getFieldPackStart() {
       toFields().readField(PACK_START);
       return toFields().pack_start;
    } 

    /**
     * 
     * <br>See {@link OnPackEnd#onPackEnd}
    */
    public static final String PACK_END = "pack_end";

    /**
     * 
     * <br>See {@link OnPackEnd#onPackEnd}
    */
    public void setFieldPackEnd(OnPackEnd pack_end) {
        toFields().pack_end = toOnPackEnd(this, PACK_END, pack_end);
        toFields().writeField(PACK_END);
    }

    /**
     * 
     * <br>See {@link OnPackEnd#onPackEnd}
    */
    public JnaCellLayoutIface.OnPackEnd getFieldPackEnd() {
       toFields().readField(PACK_END);
       return toFields().pack_end;
    } 

    /**
     * 
     * <br>See {@link OnClear#onClear}
    */
    public static final String CLEAR = "clear";

    /**
     * 
     * <br>See {@link OnClear#onClear}
    */
    public void setFieldClear(OnClear clear) {
        toFields().clear = toOnClear(this, CLEAR, clear);
        toFields().writeField(CLEAR);
    }

    /**
     * 
     * <br>See {@link OnClear#onClear}
    */
    public JnaCellLayoutIface.OnClear getFieldClear() {
       toFields().readField(CLEAR);
       return toFields().clear;
    } 

    /**
     * 
     * <br>See {@link OnAddAttribute#onAddAttribute}
    */
    public static final String ADD_ATTRIBUTE = "add_attribute";

    /**
     * 
     * <br>See {@link OnAddAttribute#onAddAttribute}
    */
    public void setFieldAddAttribute(OnAddAttribute add_attribute) {
        toFields().add_attribute = toOnAddAttribute(this, ADD_ATTRIBUTE, add_attribute);
        toFields().writeField(ADD_ATTRIBUTE);
    }

    /**
     * 
     * <br>See {@link OnAddAttribute#onAddAttribute}
    */
    public JnaCellLayoutIface.OnAddAttribute getFieldAddAttribute() {
       toFields().readField(ADD_ATTRIBUTE);
       return toFields().add_attribute;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_CELL_DATA_FUNC = "set_cell_data_func";

    /**
     * 
     * <br>See {@link OnClearAttributes#onClearAttributes}
    */
    public static final String CLEAR_ATTRIBUTES = "clear_attributes";

    /**
     * 
     * <br>See {@link OnClearAttributes#onClearAttributes}
    */
    public void setFieldClearAttributes(OnClearAttributes clear_attributes) {
        toFields().clear_attributes = toOnClearAttributes(this, CLEAR_ATTRIBUTES, clear_attributes);
        toFields().writeField(CLEAR_ATTRIBUTES);
    }

    /**
     * 
     * <br>See {@link OnClearAttributes#onClearAttributes}
    */
    public JnaCellLayoutIface.OnClearAttributes getFieldClearAttributes() {
       toFields().readField(CLEAR_ATTRIBUTES);
       return toFields().clear_attributes;
    } 

    /**
     * 
     * <br>See {@link OnReorder#onReorder}
    */
    public static final String REORDER = "reorder";

    /**
     * 
     * <br>See {@link OnReorder#onReorder}
    */
    public void setFieldReorder(OnReorder reorder) {
        toFields().reorder = toOnReorder(this, REORDER, reorder);
        toFields().writeField(REORDER);
    }

    /**
     * 
     * <br>See {@link OnReorder#onReorder}
    */
    public JnaCellLayoutIface.OnReorder getFieldReorder() {
       toFields().readField(REORDER);
       return toFields().reorder;
    } 

    /**
     * 
     * <br>See {@link OnGetCells#onGetCells}
    */
    public static final String GET_CELLS = "get_cells";

    /**
     * 
     * <br>See {@link OnGetCells#onGetCells}
    */
    public void setFieldGetCells(OnGetCells get_cells) {
        toFields().get_cells = toOnGetCells(this, GET_CELLS, get_cells);
        toFields().writeField(GET_CELLS);
    }

    /**
     * 
     * <br>See {@link OnGetCells#onGetCells}
    */
    public JnaCellLayoutIface.OnGetCells getFieldGetCells() {
       toFields().readField(GET_CELLS);
       return toFields().get_cells;
    } 

    /**
     * 
     * <br>See {@link OnGetArea#onGetArea}
    */
    public static final String GET_AREA = "get_area";

    /**
     * 
     * <br>See {@link OnGetArea#onGetArea}
    */
    public void setFieldGetArea(OnGetArea get_area) {
        toFields().get_area = toOnGetArea(this, GET_AREA, get_area);
        toFields().writeField(GET_AREA);
    }

    /**
     * 
     * <br>See {@link OnGetArea#onGetArea}
    */
    public JnaCellLayoutIface.OnGetArea getFieldGetArea() {
       toFields().readField(GET_AREA);
       return toFields().get_area;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellLayout.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellLayout.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
