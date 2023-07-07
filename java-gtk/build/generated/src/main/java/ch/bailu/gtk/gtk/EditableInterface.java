/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.EditableInterface.html">https://docs.gtk.org/gtk4/struct.EditableInterface.html</a></p>
*/
public class EditableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EditableInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInsertText {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param text the text to append
         * @param length the length of the text in bytes, or -1
         * @param position location of the position text will be inserted at
        */
        void onInsertText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, @Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull ch.bailu.gtk.type.Int position);
    }
    
    private static JnaEditableInterface.OnInsertText toOnInsertText(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertText in) {
        JnaEditableInterface.OnInsertText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _text, _length, _position) -> in.onInsertText(__callback, new Editable(new PointerContainer(_editable)), new ch.bailu.gtk.type.Str(new PointerContainer(_text)), _length, new ch.bailu.gtk.type.Int(new PointerContainer(_position)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeleteText {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param start_pos start position
         * @param end_pos end position
        */
        void onDeleteText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, int start_pos, int end_pos);
    }
    
    private static JnaEditableInterface.OnDeleteText toOnDeleteText(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeleteText in) {
        JnaEditableInterface.OnDeleteText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _start_pos, _end_pos) -> in.onDeleteText(__callback, new Editable(new PointerContainer(_editable)), _start_pos, _end_pos);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param editable 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable);
    }
    
    private static JnaEditableInterface.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaEditableInterface.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable) -> in.onChanged(__callback, new Editable(new PointerContainer(_editable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetText {
        /**
         * 
         * @param editable a `GtkEditable`
         * @return a pointer to the contents of the editable
        */
        ch.bailu.gtk.type.Str onGetText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable);
    }
    
    private static JnaEditableInterface.OnGetText toOnGetText(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetText in) {
        JnaEditableInterface.OnGetText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable) -> in.onGetText(__callback, new Editable(new PointerContainer(_editable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDoInsertText {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param text the text to append
         * @param length the length of the text in bytes, or -1
         * @param position location of the position text will be inserted at
        */
        void onDoInsertText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, @Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull ch.bailu.gtk.type.Int position);
    }
    
    private static JnaEditableInterface.OnDoInsertText toOnDoInsertText(ch.bailu.gtk.type.Pointer instance, String methodName, OnDoInsertText in) {
        JnaEditableInterface.OnDoInsertText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _text, _length, _position) -> in.onDoInsertText(__callback, new Editable(new PointerContainer(_editable)), new ch.bailu.gtk.type.Str(new PointerContainer(_text)), _length, new ch.bailu.gtk.type.Int(new PointerContainer(_position)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDoDeleteText {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param start_pos start position
         * @param end_pos end position
        */
        void onDoDeleteText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, int start_pos, int end_pos);
    }
    
    private static JnaEditableInterface.OnDoDeleteText toOnDoDeleteText(ch.bailu.gtk.type.Pointer instance, String methodName, OnDoDeleteText in) {
        JnaEditableInterface.OnDoDeleteText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _start_pos, _end_pos) -> in.onDoDeleteText(__callback, new Editable(new PointerContainer(_editable)), _start_pos, _end_pos);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSelectionBounds {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param start_pos location to store the starting position
         * @param end_pos location to store the end position
         * @return %TRUE if there is a non-empty selection, %FALSE otherwise
        */
        boolean onGetSelectionBounds(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, @Nullable ch.bailu.gtk.type.Int start_pos, @Nullable ch.bailu.gtk.type.Int end_pos);
    }
    
    private static JnaEditableInterface.OnGetSelectionBounds toOnGetSelectionBounds(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSelectionBounds in) {
        JnaEditableInterface.OnGetSelectionBounds out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _start_pos, _end_pos) -> in.onGetSelectionBounds(__callback, new Editable(new PointerContainer(_editable)), new ch.bailu.gtk.type.Int(new PointerContainer(_start_pos)), new ch.bailu.gtk.type.Int(new PointerContainer(_end_pos)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetSelectionBounds {
        /**
         * 
         * @param editable a `GtkEditable`
         * @param start_pos start of region
         * @param end_pos end of region
        */
        void onSetSelectionBounds(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable, int start_pos, int end_pos);
    }
    
    private static JnaEditableInterface.OnSetSelectionBounds toOnSetSelectionBounds(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetSelectionBounds in) {
        JnaEditableInterface.OnSetSelectionBounds out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable, _start_pos, _end_pos) -> in.onSetSelectionBounds(__callback, new Editable(new PointerContainer(_editable)), _start_pos, _end_pos);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDelegate {
        /**
         * 
         * @param editable a `GtkEditable`
         * @return the delegate `GtkEditable`
        */
        Editable onGetDelegate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Editable editable);
    }
    
    private static JnaEditableInterface.OnGetDelegate toOnGetDelegate(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDelegate in) {
        JnaEditableInterface.OnGetDelegate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_editable) -> in.onGetDelegate(__callback, new Editable(new PointerContainer(_editable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public EditableInterface(PointerContainer pointer) {
        super(pointer);
    }

    public EditableInterface() {
        super(cast(JnaEditableInterface.allocateStructure()));
    }

    private JnaEditableInterface.Fields _fields;
    
    JnaEditableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEditableInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_IFACE = "base_iface";

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public static final String INSERT_TEXT = "insert_text";

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public void setFieldInsertText(OnInsertText insert_text) {
        toFields().insert_text = toOnInsertText(this, INSERT_TEXT, insert_text);
        toFields().writeField(INSERT_TEXT);
    }

    /**
     * 
     * <br>See {@link OnInsertText#onInsertText}
    */
    public JnaEditableInterface.OnInsertText getFieldInsertText() {
       toFields().readField(INSERT_TEXT);
       return toFields().insert_text;
    } 

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public static final String DELETE_TEXT = "delete_text";

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public void setFieldDeleteText(OnDeleteText delete_text) {
        toFields().delete_text = toOnDeleteText(this, DELETE_TEXT, delete_text);
        toFields().writeField(DELETE_TEXT);
    }

    /**
     * 
     * <br>See {@link OnDeleteText#onDeleteText}
    */
    public JnaEditableInterface.OnDeleteText getFieldDeleteText() {
       toFields().readField(DELETE_TEXT);
       return toFields().delete_text;
    } 

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaEditableInterface.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public static final String GET_TEXT = "get_text";

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public void setFieldGetText(OnGetText get_text) {
        toFields().get_text = toOnGetText(this, GET_TEXT, get_text);
        toFields().writeField(GET_TEXT);
    }

    /**
     * 
     * <br>See {@link OnGetText#onGetText}
    */
    public JnaEditableInterface.OnGetText getFieldGetText() {
       toFields().readField(GET_TEXT);
       return toFields().get_text;
    } 

    /**
     * 
     * <br>See {@link OnDoInsertText#onDoInsertText}
    */
    public static final String DO_INSERT_TEXT = "do_insert_text";

    /**
     * 
     * <br>See {@link OnDoInsertText#onDoInsertText}
    */
    public void setFieldDoInsertText(OnDoInsertText do_insert_text) {
        toFields().do_insert_text = toOnDoInsertText(this, DO_INSERT_TEXT, do_insert_text);
        toFields().writeField(DO_INSERT_TEXT);
    }

    /**
     * 
     * <br>See {@link OnDoInsertText#onDoInsertText}
    */
    public JnaEditableInterface.OnDoInsertText getFieldDoInsertText() {
       toFields().readField(DO_INSERT_TEXT);
       return toFields().do_insert_text;
    } 

    /**
     * 
     * <br>See {@link OnDoDeleteText#onDoDeleteText}
    */
    public static final String DO_DELETE_TEXT = "do_delete_text";

    /**
     * 
     * <br>See {@link OnDoDeleteText#onDoDeleteText}
    */
    public void setFieldDoDeleteText(OnDoDeleteText do_delete_text) {
        toFields().do_delete_text = toOnDoDeleteText(this, DO_DELETE_TEXT, do_delete_text);
        toFields().writeField(DO_DELETE_TEXT);
    }

    /**
     * 
     * <br>See {@link OnDoDeleteText#onDoDeleteText}
    */
    public JnaEditableInterface.OnDoDeleteText getFieldDoDeleteText() {
       toFields().readField(DO_DELETE_TEXT);
       return toFields().do_delete_text;
    } 

    /**
     * 
     * <br>See {@link OnGetSelectionBounds#onGetSelectionBounds}
    */
    public static final String GET_SELECTION_BOUNDS = "get_selection_bounds";

    /**
     * 
     * <br>See {@link OnGetSelectionBounds#onGetSelectionBounds}
    */
    public void setFieldGetSelectionBounds(OnGetSelectionBounds get_selection_bounds) {
        toFields().get_selection_bounds = toOnGetSelectionBounds(this, GET_SELECTION_BOUNDS, get_selection_bounds);
        toFields().writeField(GET_SELECTION_BOUNDS);
    }

    /**
     * 
     * <br>See {@link OnGetSelectionBounds#onGetSelectionBounds}
    */
    public JnaEditableInterface.OnGetSelectionBounds getFieldGetSelectionBounds() {
       toFields().readField(GET_SELECTION_BOUNDS);
       return toFields().get_selection_bounds;
    } 

    /**
     * 
     * <br>See {@link OnSetSelectionBounds#onSetSelectionBounds}
    */
    public static final String SET_SELECTION_BOUNDS = "set_selection_bounds";

    /**
     * 
     * <br>See {@link OnSetSelectionBounds#onSetSelectionBounds}
    */
    public void setFieldSetSelectionBounds(OnSetSelectionBounds set_selection_bounds) {
        toFields().set_selection_bounds = toOnSetSelectionBounds(this, SET_SELECTION_BOUNDS, set_selection_bounds);
        toFields().writeField(SET_SELECTION_BOUNDS);
    }

    /**
     * 
     * <br>See {@link OnSetSelectionBounds#onSetSelectionBounds}
    */
    public JnaEditableInterface.OnSetSelectionBounds getFieldSetSelectionBounds() {
       toFields().readField(SET_SELECTION_BOUNDS);
       return toFields().set_selection_bounds;
    } 

    /**
     * 
     * <br>See {@link OnGetDelegate#onGetDelegate}
    */
    public static final String GET_DELEGATE = "get_delegate";

    /**
     * 
     * <br>See {@link OnGetDelegate#onGetDelegate}
    */
    public void setFieldGetDelegate(OnGetDelegate get_delegate) {
        toFields().get_delegate = toOnGetDelegate(this, GET_DELEGATE, get_delegate);
        toFields().writeField(GET_DELEGATE);
    }

    /**
     * 
     * <br>See {@link OnGetDelegate#onGetDelegate}
    */
    public JnaEditableInterface.OnGetDelegate getFieldGetDelegate() {
       toFields().readField(GET_DELEGATE);
       return toFields().get_delegate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Editable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Editable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
