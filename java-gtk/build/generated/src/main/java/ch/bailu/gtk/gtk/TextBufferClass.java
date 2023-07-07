/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class structure for `GtkTextBuffer`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.TextBufferClass.html">https://docs.gtk.org/gtk4/struct.TextBufferClass.html</a></p>
*/
public class TextBufferClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextBufferClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInsertText {
        /**
         * 
         * @param buffer 
         * @param pos 
         * @param new_text 
         * @param new_text_length 
        */
        void onInsertText(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextIter pos, @Nonnull ch.bailu.gtk.type.Str new_text, int new_text_length);
    }
    
    private static JnaTextBufferClass.OnInsertText toOnInsertText(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertText in) {
        JnaTextBufferClass.OnInsertText out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _pos, _new_text, _new_text_length) -> in.onInsertText(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextIter(new PointerContainer(_pos)), new ch.bailu.gtk.type.Str(new PointerContainer(_new_text)), _new_text_length);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInsertPaintable {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
         * @param iter location to insert the paintable
         * @param paintable a `GdkPaintable`
        */
        void onInsertPaintable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextIter iter, @Nonnull ch.bailu.gtk.gdk.Paintable paintable);
    }
    
    private static JnaTextBufferClass.OnInsertPaintable toOnInsertPaintable(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertPaintable in) {
        JnaTextBufferClass.OnInsertPaintable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _iter, _paintable) -> in.onInsertPaintable(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextIter(new PointerContainer(_iter)), new ch.bailu.gtk.gdk.Paintable(new PointerContainer(_paintable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInsertChildAnchor {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
         * @param iter location to insert the anchor
         * @param anchor a `GtkTextChildAnchor`
        */
        void onInsertChildAnchor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextIter iter, @Nonnull TextChildAnchor anchor);
    }
    
    private static JnaTextBufferClass.OnInsertChildAnchor toOnInsertChildAnchor(ch.bailu.gtk.type.Pointer instance, String methodName, OnInsertChildAnchor in) {
        JnaTextBufferClass.OnInsertChildAnchor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _iter, _anchor) -> in.onInsertChildAnchor(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextIter(new PointerContainer(_iter)), new TextChildAnchor(new PointerContainer(_anchor)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDeleteRange {
        /**
         * 
         * @param buffer 
         * @param start 
         * @param end 
        */
        void onDeleteRange(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static JnaTextBufferClass.OnDeleteRange toOnDeleteRange(ch.bailu.gtk.type.Pointer instance, String methodName, OnDeleteRange in) {
        JnaTextBufferClass.OnDeleteRange out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _start, _end) -> in.onDeleteRange(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param buffer 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaTextBufferClass.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onChanged(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnModifiedChanged {
        /**
         * 
         * @param buffer 
        */
        void onModifiedChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnModifiedChanged toOnModifiedChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnModifiedChanged in) {
        JnaTextBufferClass.OnModifiedChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onModifiedChanged(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMarkSet {
        /**
         * 
         * @param buffer 
         * @param location 
         * @param mark 
        */
        void onMarkSet(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextIter location, @Nonnull TextMark mark);
    }
    
    private static JnaTextBufferClass.OnMarkSet toOnMarkSet(ch.bailu.gtk.type.Pointer instance, String methodName, OnMarkSet in) {
        JnaTextBufferClass.OnMarkSet out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _location, _mark) -> in.onMarkSet(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextIter(new PointerContainer(_location)), new TextMark(new PointerContainer(_mark)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMarkDeleted {
        /**
         * 
         * @param buffer 
         * @param mark 
        */
        void onMarkDeleted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextMark mark);
    }
    
    private static JnaTextBufferClass.OnMarkDeleted toOnMarkDeleted(ch.bailu.gtk.type.Pointer instance, String methodName, OnMarkDeleted in) {
        JnaTextBufferClass.OnMarkDeleted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _mark) -> in.onMarkDeleted(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextMark(new PointerContainer(_mark)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnApplyTag {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
         * @param tag a `GtkTextTag`
         * @param start one bound of range to be tagged
         * @param end other bound of range to be tagged
        */
        void onApplyTag(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static JnaTextBufferClass.OnApplyTag toOnApplyTag(ch.bailu.gtk.type.Pointer instance, String methodName, OnApplyTag in) {
        JnaTextBufferClass.OnApplyTag out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _tag, _start, _end) -> in.onApplyTag(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextTag(new PointerContainer(_tag)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoveTag {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
         * @param tag a `GtkTextTag`
         * @param start one bound of range to be untagged
         * @param end other bound of range to be untagged
        */
        void onRemoveTag(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static JnaTextBufferClass.OnRemoveTag toOnRemoveTag(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoveTag in) {
        JnaTextBufferClass.OnRemoveTag out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _tag, _start, _end) -> in.onRemoveTag(__callback, new TextBuffer(new PointerContainer(_buffer)), new TextTag(new PointerContainer(_tag)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBeginUserAction {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
        */
        void onBeginUserAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnBeginUserAction toOnBeginUserAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnBeginUserAction in) {
        JnaTextBufferClass.OnBeginUserAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onBeginUserAction(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEndUserAction {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
        */
        void onEndUserAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnEndUserAction toOnEndUserAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnEndUserAction in) {
        JnaTextBufferClass.OnEndUserAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onEndUserAction(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPasteDone {
        /**
         * 
         * @param buffer 
         * @param clipboard 
        */
        void onPasteDone(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer, @Nonnull ch.bailu.gtk.gdk.Clipboard clipboard);
    }
    
    private static JnaTextBufferClass.OnPasteDone toOnPasteDone(ch.bailu.gtk.type.Pointer instance, String methodName, OnPasteDone in) {
        JnaTextBufferClass.OnPasteDone out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer, _clipboard) -> in.onPasteDone(__callback, new TextBuffer(new PointerContainer(_buffer)), new ch.bailu.gtk.gdk.Clipboard(new PointerContainer(_clipboard)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUndo {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
        */
        void onUndo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnUndo toOnUndo(ch.bailu.gtk.type.Pointer instance, String methodName, OnUndo in) {
        JnaTextBufferClass.OnUndo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onUndo(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRedo {
        /**
         * 
         * @param buffer a `GtkTextBuffer`
        */
        void onRedo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TextBuffer buffer);
    }
    
    private static JnaTextBufferClass.OnRedo toOnRedo(ch.bailu.gtk.type.Pointer instance, String methodName, OnRedo in) {
        JnaTextBufferClass.OnRedo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buffer) -> in.onRedo(__callback, new TextBuffer(new PointerContainer(_buffer)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved1 {
        void onGtkReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTextBufferClass.OnGtkReserved1 toOnGtkReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved1 in) {
        JnaTextBufferClass.OnGtkReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved2 {
        void onGtkReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTextBufferClass.OnGtkReserved2 toOnGtkReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved2 in) {
        JnaTextBufferClass.OnGtkReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved3 {
        void onGtkReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTextBufferClass.OnGtkReserved3 toOnGtkReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved3 in) {
        JnaTextBufferClass.OnGtkReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGtkReserved4 {
        void onGtkReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaTextBufferClass.OnGtkReserved4 toOnGtkReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGtkReserved4 in) {
        JnaTextBufferClass.OnGtkReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGtkReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    public TextBufferClass(PointerContainer pointer) {
        super(pointer);
    }

    public TextBufferClass() {
        super(cast(JnaTextBufferClass.allocateStructure()));
    }

    private JnaTextBufferClass.Fields _fields;
    
    JnaTextBufferClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTextBufferClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The object class structure needs to be the first.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

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
    public JnaTextBufferClass.OnInsertText getFieldInsertText() {
       toFields().readField(INSERT_TEXT);
       return toFields().insert_text;
    } 

    /**
     * 
     * <br>See {@link OnInsertPaintable#onInsertPaintable}
    */
    public static final String INSERT_PAINTABLE = "insert_paintable";

    /**
     * 
     * <br>See {@link OnInsertPaintable#onInsertPaintable}
    */
    public void setFieldInsertPaintable(OnInsertPaintable insert_paintable) {
        toFields().insert_paintable = toOnInsertPaintable(this, INSERT_PAINTABLE, insert_paintable);
        toFields().writeField(INSERT_PAINTABLE);
    }

    /**
     * 
     * <br>See {@link OnInsertPaintable#onInsertPaintable}
    */
    public JnaTextBufferClass.OnInsertPaintable getFieldInsertPaintable() {
       toFields().readField(INSERT_PAINTABLE);
       return toFields().insert_paintable;
    } 

    /**
     * 
     * <br>See {@link OnInsertChildAnchor#onInsertChildAnchor}
    */
    public static final String INSERT_CHILD_ANCHOR = "insert_child_anchor";

    /**
     * 
     * <br>See {@link OnInsertChildAnchor#onInsertChildAnchor}
    */
    public void setFieldInsertChildAnchor(OnInsertChildAnchor insert_child_anchor) {
        toFields().insert_child_anchor = toOnInsertChildAnchor(this, INSERT_CHILD_ANCHOR, insert_child_anchor);
        toFields().writeField(INSERT_CHILD_ANCHOR);
    }

    /**
     * 
     * <br>See {@link OnInsertChildAnchor#onInsertChildAnchor}
    */
    public JnaTextBufferClass.OnInsertChildAnchor getFieldInsertChildAnchor() {
       toFields().readField(INSERT_CHILD_ANCHOR);
       return toFields().insert_child_anchor;
    } 

    /**
     * 
     * <br>See {@link OnDeleteRange#onDeleteRange}
    */
    public static final String DELETE_RANGE = "delete_range";

    /**
     * 
     * <br>See {@link OnDeleteRange#onDeleteRange}
    */
    public void setFieldDeleteRange(OnDeleteRange delete_range) {
        toFields().delete_range = toOnDeleteRange(this, DELETE_RANGE, delete_range);
        toFields().writeField(DELETE_RANGE);
    }

    /**
     * 
     * <br>See {@link OnDeleteRange#onDeleteRange}
    */
    public JnaTextBufferClass.OnDeleteRange getFieldDeleteRange() {
       toFields().readField(DELETE_RANGE);
       return toFields().delete_range;
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
    public JnaTextBufferClass.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnModifiedChanged#onModifiedChanged}
    */
    public static final String MODIFIED_CHANGED = "modified_changed";

    /**
     * 
     * <br>See {@link OnModifiedChanged#onModifiedChanged}
    */
    public void setFieldModifiedChanged(OnModifiedChanged modified_changed) {
        toFields().modified_changed = toOnModifiedChanged(this, MODIFIED_CHANGED, modified_changed);
        toFields().writeField(MODIFIED_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnModifiedChanged#onModifiedChanged}
    */
    public JnaTextBufferClass.OnModifiedChanged getFieldModifiedChanged() {
       toFields().readField(MODIFIED_CHANGED);
       return toFields().modified_changed;
    } 

    /**
     * 
     * <br>See {@link OnMarkSet#onMarkSet}
    */
    public static final String MARK_SET = "mark_set";

    /**
     * 
     * <br>See {@link OnMarkSet#onMarkSet}
    */
    public void setFieldMarkSet(OnMarkSet mark_set) {
        toFields().mark_set = toOnMarkSet(this, MARK_SET, mark_set);
        toFields().writeField(MARK_SET);
    }

    /**
     * 
     * <br>See {@link OnMarkSet#onMarkSet}
    */
    public JnaTextBufferClass.OnMarkSet getFieldMarkSet() {
       toFields().readField(MARK_SET);
       return toFields().mark_set;
    } 

    /**
     * 
     * <br>See {@link OnMarkDeleted#onMarkDeleted}
    */
    public static final String MARK_DELETED = "mark_deleted";

    /**
     * 
     * <br>See {@link OnMarkDeleted#onMarkDeleted}
    */
    public void setFieldMarkDeleted(OnMarkDeleted mark_deleted) {
        toFields().mark_deleted = toOnMarkDeleted(this, MARK_DELETED, mark_deleted);
        toFields().writeField(MARK_DELETED);
    }

    /**
     * 
     * <br>See {@link OnMarkDeleted#onMarkDeleted}
    */
    public JnaTextBufferClass.OnMarkDeleted getFieldMarkDeleted() {
       toFields().readField(MARK_DELETED);
       return toFields().mark_deleted;
    } 

    /**
     * 
     * <br>See {@link OnApplyTag#onApplyTag}
    */
    public static final String APPLY_TAG = "apply_tag";

    /**
     * 
     * <br>See {@link OnApplyTag#onApplyTag}
    */
    public void setFieldApplyTag(OnApplyTag apply_tag) {
        toFields().apply_tag = toOnApplyTag(this, APPLY_TAG, apply_tag);
        toFields().writeField(APPLY_TAG);
    }

    /**
     * 
     * <br>See {@link OnApplyTag#onApplyTag}
    */
    public JnaTextBufferClass.OnApplyTag getFieldApplyTag() {
       toFields().readField(APPLY_TAG);
       return toFields().apply_tag;
    } 

    /**
     * 
     * <br>See {@link OnRemoveTag#onRemoveTag}
    */
    public static final String REMOVE_TAG = "remove_tag";

    /**
     * 
     * <br>See {@link OnRemoveTag#onRemoveTag}
    */
    public void setFieldRemoveTag(OnRemoveTag remove_tag) {
        toFields().remove_tag = toOnRemoveTag(this, REMOVE_TAG, remove_tag);
        toFields().writeField(REMOVE_TAG);
    }

    /**
     * 
     * <br>See {@link OnRemoveTag#onRemoveTag}
    */
    public JnaTextBufferClass.OnRemoveTag getFieldRemoveTag() {
       toFields().readField(REMOVE_TAG);
       return toFields().remove_tag;
    } 

    /**
     * 
     * <br>See {@link OnBeginUserAction#onBeginUserAction}
    */
    public static final String BEGIN_USER_ACTION = "begin_user_action";

    /**
     * 
     * <br>See {@link OnBeginUserAction#onBeginUserAction}
    */
    public void setFieldBeginUserAction(OnBeginUserAction begin_user_action) {
        toFields().begin_user_action = toOnBeginUserAction(this, BEGIN_USER_ACTION, begin_user_action);
        toFields().writeField(BEGIN_USER_ACTION);
    }

    /**
     * 
     * <br>See {@link OnBeginUserAction#onBeginUserAction}
    */
    public JnaTextBufferClass.OnBeginUserAction getFieldBeginUserAction() {
       toFields().readField(BEGIN_USER_ACTION);
       return toFields().begin_user_action;
    } 

    /**
     * 
     * <br>See {@link OnEndUserAction#onEndUserAction}
    */
    public static final String END_USER_ACTION = "end_user_action";

    /**
     * 
     * <br>See {@link OnEndUserAction#onEndUserAction}
    */
    public void setFieldEndUserAction(OnEndUserAction end_user_action) {
        toFields().end_user_action = toOnEndUserAction(this, END_USER_ACTION, end_user_action);
        toFields().writeField(END_USER_ACTION);
    }

    /**
     * 
     * <br>See {@link OnEndUserAction#onEndUserAction}
    */
    public JnaTextBufferClass.OnEndUserAction getFieldEndUserAction() {
       toFields().readField(END_USER_ACTION);
       return toFields().end_user_action;
    } 

    /**
     * 
     * <br>See {@link OnPasteDone#onPasteDone}
    */
    public static final String PASTE_DONE = "paste_done";

    /**
     * 
     * <br>See {@link OnPasteDone#onPasteDone}
    */
    public void setFieldPasteDone(OnPasteDone paste_done) {
        toFields().paste_done = toOnPasteDone(this, PASTE_DONE, paste_done);
        toFields().writeField(PASTE_DONE);
    }

    /**
     * 
     * <br>See {@link OnPasteDone#onPasteDone}
    */
    public JnaTextBufferClass.OnPasteDone getFieldPasteDone() {
       toFields().readField(PASTE_DONE);
       return toFields().paste_done;
    } 

    /**
     * 
     * <br>See {@link OnUndo#onUndo}
    */
    public static final String UNDO = "undo";

    /**
     * 
     * <br>See {@link OnUndo#onUndo}
    */
    public void setFieldUndo(OnUndo undo) {
        toFields().undo = toOnUndo(this, UNDO, undo);
        toFields().writeField(UNDO);
    }

    /**
     * 
     * <br>See {@link OnUndo#onUndo}
    */
    public JnaTextBufferClass.OnUndo getFieldUndo() {
       toFields().readField(UNDO);
       return toFields().undo;
    } 

    /**
     * 
     * <br>See {@link OnRedo#onRedo}
    */
    public static final String REDO = "redo";

    /**
     * 
     * <br>See {@link OnRedo#onRedo}
    */
    public void setFieldRedo(OnRedo redo) {
        toFields().redo = toOnRedo(this, REDO, redo);
        toFields().writeField(REDO);
    }

    /**
     * 
     * <br>See {@link OnRedo#onRedo}
    */
    public JnaTextBufferClass.OnRedo getFieldRedo() {
       toFields().readField(REDO);
       return toFields().redo;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public static final String _GTK_RESERVED1 = "_gtk_reserved1";

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public void setFieldGtkReserved1(OnGtkReserved1 _gtk_reserved1) {
        toFields()._gtk_reserved1 = toOnGtkReserved1(this, _GTK_RESERVED1, _gtk_reserved1);
        toFields().writeField(_GTK_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved1#onGtkReserved1}
    */
    public JnaTextBufferClass.OnGtkReserved1 getFieldGtkReserved1() {
       toFields().readField(_GTK_RESERVED1);
       return toFields()._gtk_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public static final String _GTK_RESERVED2 = "_gtk_reserved2";

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public void setFieldGtkReserved2(OnGtkReserved2 _gtk_reserved2) {
        toFields()._gtk_reserved2 = toOnGtkReserved2(this, _GTK_RESERVED2, _gtk_reserved2);
        toFields().writeField(_GTK_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved2#onGtkReserved2}
    */
    public JnaTextBufferClass.OnGtkReserved2 getFieldGtkReserved2() {
       toFields().readField(_GTK_RESERVED2);
       return toFields()._gtk_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public static final String _GTK_RESERVED3 = "_gtk_reserved3";

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public void setFieldGtkReserved3(OnGtkReserved3 _gtk_reserved3) {
        toFields()._gtk_reserved3 = toOnGtkReserved3(this, _GTK_RESERVED3, _gtk_reserved3);
        toFields().writeField(_GTK_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved3#onGtkReserved3}
    */
    public JnaTextBufferClass.OnGtkReserved3 getFieldGtkReserved3() {
       toFields().readField(_GTK_RESERVED3);
       return toFields()._gtk_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public static final String _GTK_RESERVED4 = "_gtk_reserved4";

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public void setFieldGtkReserved4(OnGtkReserved4 _gtk_reserved4) {
        toFields()._gtk_reserved4 = toOnGtkReserved4(this, _GTK_RESERVED4, _gtk_reserved4);
        toFields().writeField(_GTK_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGtkReserved4#onGtkReserved4}
    */
    public JnaTextBufferClass.OnGtkReserved4 getFieldGtkReserved4() {
       toFields().readField(_GTK_RESERVED4);
       return toFields()._gtk_reserved4;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TextBuffer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TextBuffer.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
