/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeDragDestIface.html">https://docs.gtk.org/gtk4/struct.TreeDragDestIface.html</a></p>
*/
public class TreeDragDestIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeDragDestIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDragDataReceived {
        /**
         * 
         * @param drag_dest a `GtkTreeDragDest`
         * @param dest row to drop in front of
         * @param value data to drop
         * @return whether a new row was created before position &#64;dest
        */
        boolean onDragDataReceived(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeDragDest drag_dest, @Nonnull TreePath dest, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static JnaTreeDragDestIface.OnDragDataReceived toOnDragDataReceived(ch.bailu.gtk.type.Pointer instance, String methodName, OnDragDataReceived in) {
        JnaTreeDragDestIface.OnDragDataReceived out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drag_dest, _dest, _value) -> in.onDragDataReceived(__callback, new TreeDragDest(new PointerContainer(_drag_dest)), new TreePath(new PointerContainer(_dest)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowDropPossible {
        /**
         * 
         * @param drag_dest a `GtkTreeDragDest`
         * @param dest_path destination row
         * @param value the data being dropped
         * @return %TRUE if a drop is possible before &#64;dest_path
        */
        boolean onRowDropPossible(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeDragDest drag_dest, @Nonnull TreePath dest_path, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static JnaTreeDragDestIface.OnRowDropPossible toOnRowDropPossible(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowDropPossible in) {
        JnaTreeDragDestIface.OnRowDropPossible out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drag_dest, _dest_path, _value) -> in.onRowDropPossible(__callback, new TreeDragDest(new PointerContainer(_drag_dest)), new TreePath(new PointerContainer(_dest_path)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    public TreeDragDestIface(PointerContainer pointer) {
        super(pointer);
    }

    public TreeDragDestIface() {
        super(cast(JnaTreeDragDestIface.allocateStructure()));
    }

    private JnaTreeDragDestIface.Fields _fields;
    
    JnaTreeDragDestIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeDragDestIface.Fields(asCPointer());
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
     * <br>See {@link OnDragDataReceived#onDragDataReceived}
    */
    public static final String DRAG_DATA_RECEIVED = "drag_data_received";

    /**
     * 
     * <br>See {@link OnDragDataReceived#onDragDataReceived}
    */
    public void setFieldDragDataReceived(OnDragDataReceived drag_data_received) {
        toFields().drag_data_received = toOnDragDataReceived(this, DRAG_DATA_RECEIVED, drag_data_received);
        toFields().writeField(DRAG_DATA_RECEIVED);
    }

    /**
     * 
     * <br>See {@link OnDragDataReceived#onDragDataReceived}
    */
    public JnaTreeDragDestIface.OnDragDataReceived getFieldDragDataReceived() {
       toFields().readField(DRAG_DATA_RECEIVED);
       return toFields().drag_data_received;
    } 

    /**
     * 
     * <br>See {@link OnRowDropPossible#onRowDropPossible}
    */
    public static final String ROW_DROP_POSSIBLE = "row_drop_possible";

    /**
     * 
     * <br>See {@link OnRowDropPossible#onRowDropPossible}
    */
    public void setFieldRowDropPossible(OnRowDropPossible row_drop_possible) {
        toFields().row_drop_possible = toOnRowDropPossible(this, ROW_DROP_POSSIBLE, row_drop_possible);
        toFields().writeField(ROW_DROP_POSSIBLE);
    }

    /**
     * 
     * <br>See {@link OnRowDropPossible#onRowDropPossible}
    */
    public JnaTreeDragDestIface.OnRowDropPossible getFieldRowDropPossible() {
       toFields().readField(ROW_DROP_POSSIBLE);
       return toFields().row_drop_possible;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeDragDest.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeDragDest.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
