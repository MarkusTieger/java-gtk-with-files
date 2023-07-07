/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeDragSourceIface.html">https://docs.gtk.org/gtk4/struct.TreeDragSourceIface.html</a></p>
*/
public class TreeDragSourceIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeDragSourceIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRowDraggable {
        /**
         * 
         * @param drag_source a `GtkTreeDragSource`
         * @param path row on which user is initiating a drag
         * @return %TRUE if the row can be dragged
        */
        boolean onRowDraggable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeDragSource drag_source, @Nonnull TreePath path);
    }
    
    private static JnaTreeDragSourceIface.OnRowDraggable toOnRowDraggable(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowDraggable in) {
        JnaTreeDragSourceIface.OnRowDraggable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drag_source, _path) -> in.onRowDraggable(__callback, new TreeDragSource(new PointerContainer(_drag_source)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDragDataGet {
        /**
         * 
         * @param drag_source a `GtkTreeDragSource`
         * @param path row that was dragged
         * @return a `GdkContentProvider` for the    given &#64;path
        */
        ch.bailu.gtk.gdk.ContentProvider onDragDataGet(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeDragSource drag_source, @Nonnull TreePath path);
    }
    
    private static JnaTreeDragSourceIface.OnDragDataGet toOnDragDataGet(ch.bailu.gtk.type.Pointer instance, String methodName, OnDragDataGet in) {
        JnaTreeDragSourceIface.OnDragDataGet out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drag_source, _path) -> in.onDragDataGet(__callback, new TreeDragSource(new PointerContainer(_drag_source)), new TreePath(new PointerContainer(_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDragDataDelete {
        /**
         * 
         * @param drag_source a `GtkTreeDragSource`
         * @param path row that was being dragged
         * @return %TRUE if the row was successfully deleted
        */
        boolean onDragDataDelete(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeDragSource drag_source, @Nonnull TreePath path);
    }
    
    private static JnaTreeDragSourceIface.OnDragDataDelete toOnDragDataDelete(ch.bailu.gtk.type.Pointer instance, String methodName, OnDragDataDelete in) {
        JnaTreeDragSourceIface.OnDragDataDelete out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drag_source, _path) -> in.onDragDataDelete(__callback, new TreeDragSource(new PointerContainer(_drag_source)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    public TreeDragSourceIface(PointerContainer pointer) {
        super(pointer);
    }

    public TreeDragSourceIface() {
        super(cast(JnaTreeDragSourceIface.allocateStructure()));
    }

    private JnaTreeDragSourceIface.Fields _fields;
    
    JnaTreeDragSourceIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeDragSourceIface.Fields(asCPointer());
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
     * <br>See {@link OnRowDraggable#onRowDraggable}
    */
    public static final String ROW_DRAGGABLE = "row_draggable";

    /**
     * 
     * <br>See {@link OnRowDraggable#onRowDraggable}
    */
    public void setFieldRowDraggable(OnRowDraggable row_draggable) {
        toFields().row_draggable = toOnRowDraggable(this, ROW_DRAGGABLE, row_draggable);
        toFields().writeField(ROW_DRAGGABLE);
    }

    /**
     * 
     * <br>See {@link OnRowDraggable#onRowDraggable}
    */
    public JnaTreeDragSourceIface.OnRowDraggable getFieldRowDraggable() {
       toFields().readField(ROW_DRAGGABLE);
       return toFields().row_draggable;
    } 

    /**
     * 
     * <br>See {@link OnDragDataGet#onDragDataGet}
    */
    public static final String DRAG_DATA_GET = "drag_data_get";

    /**
     * 
     * <br>See {@link OnDragDataGet#onDragDataGet}
    */
    public void setFieldDragDataGet(OnDragDataGet drag_data_get) {
        toFields().drag_data_get = toOnDragDataGet(this, DRAG_DATA_GET, drag_data_get);
        toFields().writeField(DRAG_DATA_GET);
    }

    /**
     * 
     * <br>See {@link OnDragDataGet#onDragDataGet}
    */
    public JnaTreeDragSourceIface.OnDragDataGet getFieldDragDataGet() {
       toFields().readField(DRAG_DATA_GET);
       return toFields().drag_data_get;
    } 

    /**
     * 
     * <br>See {@link OnDragDataDelete#onDragDataDelete}
    */
    public static final String DRAG_DATA_DELETE = "drag_data_delete";

    /**
     * 
     * <br>See {@link OnDragDataDelete#onDragDataDelete}
    */
    public void setFieldDragDataDelete(OnDragDataDelete drag_data_delete) {
        toFields().drag_data_delete = toOnDragDataDelete(this, DRAG_DATA_DELETE, drag_data_delete);
        toFields().writeField(DRAG_DATA_DELETE);
    }

    /**
     * 
     * <br>See {@link OnDragDataDelete#onDragDataDelete}
    */
    public JnaTreeDragSourceIface.OnDragDataDelete getFieldDragDataDelete() {
       toFields().readField(DRAG_DATA_DELETE);
       return toFields().drag_data_delete;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeDragSource.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeDragSource.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
