/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextViewClass {

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        void invoke(long text_view, int step, int count, boolean extend_selection);
    }

    @FunctionalInterface
    public interface OnSetAnchor extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnInsertAtCursor extends com.sun.jna.Callback {
        void invoke(long text_view, long str);
    }

    @FunctionalInterface
    public interface OnDeleteFromCursor extends com.sun.jna.Callback {
        void invoke(long text_view, int type, int count);
    }

    @FunctionalInterface
    public interface OnBackspace extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnCutClipboard extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnCopyClipboard extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnPasteClipboard extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnToggleOverwrite extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnCreateBuffer extends com.sun.jna.Callback {
        long invoke(long text_view);
    }

    @FunctionalInterface
    public interface OnSnapshotLayer extends com.sun.jna.Callback {
        void invoke(long text_view, int layer, long snapshot);
    }

    @FunctionalInterface
    public interface OnExtendSelection extends com.sun.jna.Callback {
        boolean invoke(long text_view, int granularity, long location, long start, long end);
    }

    @FunctionalInterface
    public interface OnInsertEmoji extends com.sun.jna.Callback {
        void invoke(long text_view);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TextViewClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TextViewClass.PARENT_CLASS, TextViewClass.MOVE_CURSOR, TextViewClass.SET_ANCHOR, TextViewClass.INSERT_AT_CURSOR, TextViewClass.DELETE_FROM_CURSOR, TextViewClass.BACKSPACE, TextViewClass.CUT_CLIPBOARD, TextViewClass.COPY_CLIPBOARD, TextViewClass.PASTE_CLIPBOARD, TextViewClass.TOGGLE_OVERWRITE, TextViewClass.CREATE_BUFFER, TextViewClass.SNAPSHOT_LAYER, TextViewClass.EXTEND_SELECTION, TextViewClass.INSERT_EMOJI})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WidgetClass.getInstanceSize()];
        public OnMoveCursor move_cursor;
        public OnSetAnchor set_anchor;
        public OnInsertAtCursor insert_at_cursor;
        public OnDeleteFromCursor delete_from_cursor;
        public OnBackspace backspace;
        public OnCutClipboard cut_clipboard;
        public OnCopyClipboard copy_clipboard;
        public OnPasteClipboard paste_clipboard;
        public OnToggleOverwrite toggle_overwrite;
        public OnCreateBuffer create_buffer;
        public OnSnapshotLayer snapshot_layer;
        public OnExtendSelection extend_selection;
        public OnInsertEmoji insert_emoji;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
