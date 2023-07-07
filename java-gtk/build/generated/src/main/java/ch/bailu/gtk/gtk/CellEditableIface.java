/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellEditableIface.html">https://docs.gtk.org/gtk4/struct.CellEditableIface.html</a></p>
*/
public class CellEditableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellEditableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEditingDone {
        /**
         * 
         * @param cell_editable A `GtkCellEditable`
        */
        void onEditingDone(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellEditable cell_editable);
    }
    
    private static JnaCellEditableIface.OnEditingDone toOnEditingDone(ch.bailu.gtk.type.Pointer instance, String methodName, OnEditingDone in) {
        JnaCellEditableIface.OnEditingDone out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_editable) -> in.onEditingDone(__callback, new CellEditable(new PointerContainer(_cell_editable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoveWidget {
        /**
         * 
         * @param cell_editable A `GtkCellEditable`
        */
        void onRemoveWidget(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellEditable cell_editable);
    }
    
    private static JnaCellEditableIface.OnRemoveWidget toOnRemoveWidget(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoveWidget in) {
        JnaCellEditableIface.OnRemoveWidget out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_editable) -> in.onRemoveWidget(__callback, new CellEditable(new PointerContainer(_cell_editable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStartEditing {
        /**
         * 
         * @param cell_editable A `GtkCellEditable`
         * @param event The `GdkEvent` that began the editing process, or   %NULL if editing was initiated programmatically
        */
        void onStartEditing(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellEditable cell_editable, @Nullable ch.bailu.gtk.gdk.Event event);
    }
    
    private static JnaCellEditableIface.OnStartEditing toOnStartEditing(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartEditing in) {
        JnaCellEditableIface.OnStartEditing out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_editable, _event) -> in.onStartEditing(__callback, new CellEditable(new PointerContainer(_cell_editable)), new ch.bailu.gtk.gdk.Event(new PointerContainer(_event)));
            __callback.register(out);
        }
        return out;
    }

    public CellEditableIface(PointerContainer pointer) {
        super(pointer);
    }

    public CellEditableIface() {
        super(cast(JnaCellEditableIface.allocateStructure()));
    }

    private JnaCellEditableIface.Fields _fields;
    
    JnaCellEditableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellEditableIface.Fields(asCPointer());
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
     * <br>See {@link OnEditingDone#onEditingDone}
    */
    public static final String EDITING_DONE = "editing_done";

    /**
     * 
     * <br>See {@link OnEditingDone#onEditingDone}
    */
    public void setFieldEditingDone(OnEditingDone editing_done) {
        toFields().editing_done = toOnEditingDone(this, EDITING_DONE, editing_done);
        toFields().writeField(EDITING_DONE);
    }

    /**
     * 
     * <br>See {@link OnEditingDone#onEditingDone}
    */
    public JnaCellEditableIface.OnEditingDone getFieldEditingDone() {
       toFields().readField(EDITING_DONE);
       return toFields().editing_done;
    } 

    /**
     * 
     * <br>See {@link OnRemoveWidget#onRemoveWidget}
    */
    public static final String REMOVE_WIDGET = "remove_widget";

    /**
     * 
     * <br>See {@link OnRemoveWidget#onRemoveWidget}
    */
    public void setFieldRemoveWidget(OnRemoveWidget remove_widget) {
        toFields().remove_widget = toOnRemoveWidget(this, REMOVE_WIDGET, remove_widget);
        toFields().writeField(REMOVE_WIDGET);
    }

    /**
     * 
     * <br>See {@link OnRemoveWidget#onRemoveWidget}
    */
    public JnaCellEditableIface.OnRemoveWidget getFieldRemoveWidget() {
       toFields().readField(REMOVE_WIDGET);
       return toFields().remove_widget;
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
    public JnaCellEditableIface.OnStartEditing getFieldStartEditing() {
       toFields().readField(START_EDITING);
       return toFields().start_editing;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellEditable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellEditable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
