/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TextViewClass.html">https://docs.gtk.org/gtk4/struct.TextViewClass.html</a></p>
*/
public class TextViewClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextViewClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * 
         * @param text_view 
         * @param step 
         * @param count 
         * @param extend_selection 
        */
        void onMoveCursor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view, int step, int count, boolean extend_selection);
    }
    
    private static JnaTextViewClass.OnMoveCursor toOnMoveCursor(ch.bailu.gtk.type.Pointer instance, String methodName, OnMoveCursor in) {
        JnaTextViewClass.OnMoveCursor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view, _step, _count, _extend_selection) -> in.onMoveCursor(__callback, new TextView(new PointerContainer(_text_view)), _step, _count, _extend_selection);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAnchor {
        /**
         * 
         * @param text_view 
        */
        void onSetAnchor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnSetAnchor toOnSetAnchor(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAnchor in) {
        JnaTextViewClass.OnSetAnchor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onSetAnchor(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInsertAtCursor {
        /**
         * 
         * @param text_view 
         * @param str 
        */
        void onInsertAtCursor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view, @Nonnull ch.bailu.gtk.type.Str str);
    }
    
    private static JnaTextViewClass.OnInsertAtCursor toOnInsertAtCursor(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertAtCursor in) {
        JnaTextViewClass.OnInsertAtCursor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view, _str) -> in.onInsertAtCursor(__callback, new TextView(new PointerContainer(_text_view)), new ch.bailu.gtk.type.Str(new PointerContainer(_str)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeleteFromCursor {
        /**
         * 
         * @param text_view 
         * @param type 
         * @param count 
        */
        void onDeleteFromCursor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view, int type, int count);
    }
    
    private static JnaTextViewClass.OnDeleteFromCursor toOnDeleteFromCursor(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeleteFromCursor in) {
        JnaTextViewClass.OnDeleteFromCursor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view, _type, _count) -> in.onDeleteFromCursor(__callback, new TextView(new PointerContainer(_text_view)), _type, _count);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBackspace {
        /**
         * 
         * @param text_view 
        */
        void onBackspace(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnBackspace toOnBackspace(ch.bailu.gtk.type.Pointer instance, String methodName, OnBackspace in) {
        JnaTextViewClass.OnBackspace out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onBackspace(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCutClipboard {
        /**
         * 
         * @param text_view 
        */
        void onCutClipboard(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnCutClipboard toOnCutClipboard(ch.bailu.gtk.type.Pointer instance, String methodName, OnCutClipboard in) {
        JnaTextViewClass.OnCutClipboard out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onCutClipboard(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCopyClipboard {
        /**
         * 
         * @param text_view 
        */
        void onCopyClipboard(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnCopyClipboard toOnCopyClipboard(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyClipboard in) {
        JnaTextViewClass.OnCopyClipboard out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onCopyClipboard(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPasteClipboard {
        /**
         * 
         * @param text_view 
        */
        void onPasteClipboard(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnPasteClipboard toOnPasteClipboard(ch.bailu.gtk.type.Pointer instance, String methodName, OnPasteClipboard in) {
        JnaTextViewClass.OnPasteClipboard out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onPasteClipboard(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnToggleOverwrite {
        /**
         * 
         * @param text_view 
        */
        void onToggleOverwrite(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnToggleOverwrite toOnToggleOverwrite(ch.bailu.gtk.type.Pointer instance, String methodName, OnToggleOverwrite in) {
        JnaTextViewClass.OnToggleOverwrite out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onToggleOverwrite(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCreateBuffer {
        /**
         * 
         * @param text_view 
         * @return 
        */
        TextBuffer onCreateBuffer(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnCreateBuffer toOnCreateBuffer(ch.bailu.gtk.type.Pointer instance, String methodName, OnCreateBuffer in) {
        JnaTextViewClass.OnCreateBuffer out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onCreateBuffer(__callback, new TextView(new PointerContainer(_text_view))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSnapshotLayer {
        /**
         * 
         * @param text_view 
         * @param layer 
         * @param snapshot 
        */
        void onSnapshotLayer(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view, int layer, @Nonnull Snapshot snapshot);
    }
    
    private static JnaTextViewClass.OnSnapshotLayer toOnSnapshotLayer(ch.bailu.gtk.type.Pointer instance, String methodName, OnSnapshotLayer in) {
        JnaTextViewClass.OnSnapshotLayer out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view, _layer, _snapshot) -> in.onSnapshotLayer(__callback, new TextView(new PointerContainer(_text_view)), _layer, new Snapshot(new PointerContainer(_snapshot)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnExtendSelection {
        /**
         * 
         * @param text_view 
         * @param granularity 
         * @param location 
         * @param start 
         * @param end 
         * @return 
        */
        boolean onExtendSelection(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view, int granularity, @Nonnull TextIter location, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static JnaTextViewClass.OnExtendSelection toOnExtendSelection(ch.bailu.gtk.type.Pointer instance, String methodName, OnExtendSelection in) {
        JnaTextViewClass.OnExtendSelection out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view, _granularity, _location, _start, _end) -> in.onExtendSelection(__callback, new TextView(new PointerContainer(_text_view)), _granularity, new TextIter(new PointerContainer(_location)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInsertEmoji {
        /**
         * 
         * @param text_view 
        */
        void onInsertEmoji(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextView text_view);
    }
    
    private static JnaTextViewClass.OnInsertEmoji toOnInsertEmoji(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertEmoji in) {
        JnaTextViewClass.OnInsertEmoji out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_text_view) -> in.onInsertEmoji(__callback, new TextView(new PointerContainer(_text_view)));
            __callback.register(out);
        }
        return out;
    }

    public TextViewClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTextViewClass.Fields _fields;
    
    JnaTextViewClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTextViewClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The object class structure needs to be the first
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public static final String MOVE_CURSOR = "move_cursor";

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public void setFieldMoveCursor(OnMoveCursor move_cursor) {
        toFields().move_cursor = toOnMoveCursor(this, MOVE_CURSOR, move_cursor);
        toFields().writeField(MOVE_CURSOR);
    }

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public JnaTextViewClass.OnMoveCursor getFieldMoveCursor() {
       toFields().readField(MOVE_CURSOR);
       return toFields().move_cursor;
    } 

    /**
     * 
     * <br>See {@link OnSetAnchor#onSetAnchor}
    */
    public static final String SET_ANCHOR = "set_anchor";

    /**
     * 
     * <br>See {@link OnSetAnchor#onSetAnchor}
    */
    public void setFieldSetAnchor(OnSetAnchor set_anchor) {
        toFields().set_anchor = toOnSetAnchor(this, SET_ANCHOR, set_anchor);
        toFields().writeField(SET_ANCHOR);
    }

    /**
     * 
     * <br>See {@link OnSetAnchor#onSetAnchor}
    */
    public JnaTextViewClass.OnSetAnchor getFieldSetAnchor() {
       toFields().readField(SET_ANCHOR);
       return toFields().set_anchor;
    } 

    /**
     * 
     * <br>See {@link OnInsertAtCursor#onInsertAtCursor}
    */
    public static final String INSERT_AT_CURSOR = "insert_at_cursor";

    /**
     * 
     * <br>See {@link OnInsertAtCursor#onInsertAtCursor}
    */
    public void setFieldInsertAtCursor(OnInsertAtCursor insert_at_cursor) {
        toFields().insert_at_cursor = toOnInsertAtCursor(this, INSERT_AT_CURSOR, insert_at_cursor);
        toFields().writeField(INSERT_AT_CURSOR);
    }

    /**
     * 
     * <br>See {@link OnInsertAtCursor#onInsertAtCursor}
    */
    public JnaTextViewClass.OnInsertAtCursor getFieldInsertAtCursor() {
       toFields().readField(INSERT_AT_CURSOR);
       return toFields().insert_at_cursor;
    } 

    /**
     * 
     * <br>See {@link OnDeleteFromCursor#onDeleteFromCursor}
    */
    public static final String DELETE_FROM_CURSOR = "delete_from_cursor";

    /**
     * 
     * <br>See {@link OnDeleteFromCursor#onDeleteFromCursor}
    */
    public void setFieldDeleteFromCursor(OnDeleteFromCursor delete_from_cursor) {
        toFields().delete_from_cursor = toOnDeleteFromCursor(this, DELETE_FROM_CURSOR, delete_from_cursor);
        toFields().writeField(DELETE_FROM_CURSOR);
    }

    /**
     * 
     * <br>See {@link OnDeleteFromCursor#onDeleteFromCursor}
    */
    public JnaTextViewClass.OnDeleteFromCursor getFieldDeleteFromCursor() {
       toFields().readField(DELETE_FROM_CURSOR);
       return toFields().delete_from_cursor;
    } 

    /**
     * 
     * <br>See {@link OnBackspace#onBackspace}
    */
    public static final String BACKSPACE = "backspace";

    /**
     * 
     * <br>See {@link OnBackspace#onBackspace}
    */
    public void setFieldBackspace(OnBackspace backspace) {
        toFields().backspace = toOnBackspace(this, BACKSPACE, backspace);
        toFields().writeField(BACKSPACE);
    }

    /**
     * 
     * <br>See {@link OnBackspace#onBackspace}
    */
    public JnaTextViewClass.OnBackspace getFieldBackspace() {
       toFields().readField(BACKSPACE);
       return toFields().backspace;
    } 

    /**
     * 
     * <br>See {@link OnCutClipboard#onCutClipboard}
    */
    public static final String CUT_CLIPBOARD = "cut_clipboard";

    /**
     * 
     * <br>See {@link OnCutClipboard#onCutClipboard}
    */
    public void setFieldCutClipboard(OnCutClipboard cut_clipboard) {
        toFields().cut_clipboard = toOnCutClipboard(this, CUT_CLIPBOARD, cut_clipboard);
        toFields().writeField(CUT_CLIPBOARD);
    }

    /**
     * 
     * <br>See {@link OnCutClipboard#onCutClipboard}
    */
    public JnaTextViewClass.OnCutClipboard getFieldCutClipboard() {
       toFields().readField(CUT_CLIPBOARD);
       return toFields().cut_clipboard;
    } 

    /**
     * 
     * <br>See {@link OnCopyClipboard#onCopyClipboard}
    */
    public static final String COPY_CLIPBOARD = "copy_clipboard";

    /**
     * 
     * <br>See {@link OnCopyClipboard#onCopyClipboard}
    */
    public void setFieldCopyClipboard(OnCopyClipboard copy_clipboard) {
        toFields().copy_clipboard = toOnCopyClipboard(this, COPY_CLIPBOARD, copy_clipboard);
        toFields().writeField(COPY_CLIPBOARD);
    }

    /**
     * 
     * <br>See {@link OnCopyClipboard#onCopyClipboard}
    */
    public JnaTextViewClass.OnCopyClipboard getFieldCopyClipboard() {
       toFields().readField(COPY_CLIPBOARD);
       return toFields().copy_clipboard;
    } 

    /**
     * 
     * <br>See {@link OnPasteClipboard#onPasteClipboard}
    */
    public static final String PASTE_CLIPBOARD = "paste_clipboard";

    /**
     * 
     * <br>See {@link OnPasteClipboard#onPasteClipboard}
    */
    public void setFieldPasteClipboard(OnPasteClipboard paste_clipboard) {
        toFields().paste_clipboard = toOnPasteClipboard(this, PASTE_CLIPBOARD, paste_clipboard);
        toFields().writeField(PASTE_CLIPBOARD);
    }

    /**
     * 
     * <br>See {@link OnPasteClipboard#onPasteClipboard}
    */
    public JnaTextViewClass.OnPasteClipboard getFieldPasteClipboard() {
       toFields().readField(PASTE_CLIPBOARD);
       return toFields().paste_clipboard;
    } 

    /**
     * 
     * <br>See {@link OnToggleOverwrite#onToggleOverwrite}
    */
    public static final String TOGGLE_OVERWRITE = "toggle_overwrite";

    /**
     * 
     * <br>See {@link OnToggleOverwrite#onToggleOverwrite}
    */
    public void setFieldToggleOverwrite(OnToggleOverwrite toggle_overwrite) {
        toFields().toggle_overwrite = toOnToggleOverwrite(this, TOGGLE_OVERWRITE, toggle_overwrite);
        toFields().writeField(TOGGLE_OVERWRITE);
    }

    /**
     * 
     * <br>See {@link OnToggleOverwrite#onToggleOverwrite}
    */
    public JnaTextViewClass.OnToggleOverwrite getFieldToggleOverwrite() {
       toFields().readField(TOGGLE_OVERWRITE);
       return toFields().toggle_overwrite;
    } 

    /**
     * 
     * <br>See {@link OnCreateBuffer#onCreateBuffer}
    */
    public static final String CREATE_BUFFER = "create_buffer";

    /**
     * 
     * <br>See {@link OnCreateBuffer#onCreateBuffer}
    */
    public void setFieldCreateBuffer(OnCreateBuffer create_buffer) {
        toFields().create_buffer = toOnCreateBuffer(this, CREATE_BUFFER, create_buffer);
        toFields().writeField(CREATE_BUFFER);
    }

    /**
     * 
     * <br>See {@link OnCreateBuffer#onCreateBuffer}
    */
    public JnaTextViewClass.OnCreateBuffer getFieldCreateBuffer() {
       toFields().readField(CREATE_BUFFER);
       return toFields().create_buffer;
    } 

    /**
     * 
     * <br>See {@link OnSnapshotLayer#onSnapshotLayer}
    */
    public static final String SNAPSHOT_LAYER = "snapshot_layer";

    /**
     * 
     * <br>See {@link OnSnapshotLayer#onSnapshotLayer}
    */
    public void setFieldSnapshotLayer(OnSnapshotLayer snapshot_layer) {
        toFields().snapshot_layer = toOnSnapshotLayer(this, SNAPSHOT_LAYER, snapshot_layer);
        toFields().writeField(SNAPSHOT_LAYER);
    }

    /**
     * 
     * <br>See {@link OnSnapshotLayer#onSnapshotLayer}
    */
    public JnaTextViewClass.OnSnapshotLayer getFieldSnapshotLayer() {
       toFields().readField(SNAPSHOT_LAYER);
       return toFields().snapshot_layer;
    } 

    /**
     * 
     * <br>See {@link OnExtendSelection#onExtendSelection}
    */
    public static final String EXTEND_SELECTION = "extend_selection";

    /**
     * 
     * <br>See {@link OnExtendSelection#onExtendSelection}
    */
    public void setFieldExtendSelection(OnExtendSelection extend_selection) {
        toFields().extend_selection = toOnExtendSelection(this, EXTEND_SELECTION, extend_selection);
        toFields().writeField(EXTEND_SELECTION);
    }

    /**
     * 
     * <br>See {@link OnExtendSelection#onExtendSelection}
    */
    public JnaTextViewClass.OnExtendSelection getFieldExtendSelection() {
       toFields().readField(EXTEND_SELECTION);
       return toFields().extend_selection;
    } 

    /**
     * 
     * <br>See {@link OnInsertEmoji#onInsertEmoji}
    */
    public static final String INSERT_EMOJI = "insert_emoji";

    /**
     * 
     * <br>See {@link OnInsertEmoji#onInsertEmoji}
    */
    public void setFieldInsertEmoji(OnInsertEmoji insert_emoji) {
        toFields().insert_emoji = toOnInsertEmoji(this, INSERT_EMOJI, insert_emoji);
        toFields().writeField(INSERT_EMOJI);
    }

    /**
     * 
     * <br>See {@link OnInsertEmoji#onInsertEmoji}
    */
    public JnaTextViewClass.OnInsertEmoji getFieldInsertEmoji() {
       toFields().readField(INSERT_EMOJI);
       return toFields().insert_emoji;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TextView.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TextView.getParentTypeID());
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
