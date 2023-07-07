/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextBufferClass {

    @FunctionalInterface
    public interface OnInsertText extends com.sun.jna.Callback {
        void invoke(long buffer, long pos, long new_text, int new_text_length);
    }

    @FunctionalInterface
    public interface OnInsertPaintable extends com.sun.jna.Callback {
        void invoke(long buffer, long iter, long paintable);
    }

    @FunctionalInterface
    public interface OnInsertChildAnchor extends com.sun.jna.Callback {
        void invoke(long buffer, long iter, long anchor);
    }

    @FunctionalInterface
    public interface OnDeleteRange extends com.sun.jna.Callback {
        void invoke(long buffer, long start, long end);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnModifiedChanged extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnMarkSet extends com.sun.jna.Callback {
        void invoke(long buffer, long location, long mark);
    }

    @FunctionalInterface
    public interface OnMarkDeleted extends com.sun.jna.Callback {
        void invoke(long buffer, long mark);
    }

    @FunctionalInterface
    public interface OnApplyTag extends com.sun.jna.Callback {
        void invoke(long buffer, long tag, long start, long end);
    }

    @FunctionalInterface
    public interface OnRemoveTag extends com.sun.jna.Callback {
        void invoke(long buffer, long tag, long start, long end);
    }

    @FunctionalInterface
    public interface OnBeginUserAction extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnEndUserAction extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnPasteDone extends com.sun.jna.Callback {
        void invoke(long buffer, long clipboard);
    }

    @FunctionalInterface
    public interface OnUndo extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnRedo extends com.sun.jna.Callback {
        void invoke(long buffer);
    }

    @FunctionalInterface
    public interface OnGtkReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGtkReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TextBufferClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TextBufferClass.PARENT_CLASS, TextBufferClass.INSERT_TEXT, TextBufferClass.INSERT_PAINTABLE, TextBufferClass.INSERT_CHILD_ANCHOR, TextBufferClass.DELETE_RANGE, TextBufferClass.CHANGED, TextBufferClass.MODIFIED_CHANGED, TextBufferClass.MARK_SET, TextBufferClass.MARK_DELETED, TextBufferClass.APPLY_TAG, TextBufferClass.REMOVE_TAG, TextBufferClass.BEGIN_USER_ACTION, TextBufferClass.END_USER_ACTION, TextBufferClass.PASTE_DONE, TextBufferClass.UNDO, TextBufferClass.REDO, TextBufferClass._GTK_RESERVED1, TextBufferClass._GTK_RESERVED2, TextBufferClass._GTK_RESERVED3, TextBufferClass._GTK_RESERVED4})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnInsertText insert_text;
        public OnInsertPaintable insert_paintable;
        public OnInsertChildAnchor insert_child_anchor;
        public OnDeleteRange delete_range;
        public OnChanged changed;
        public OnModifiedChanged modified_changed;
        public OnMarkSet mark_set;
        public OnMarkDeleted mark_deleted;
        public OnApplyTag apply_tag;
        public OnRemoveTag remove_tag;
        public OnBeginUserAction begin_user_action;
        public OnEndUserAction end_user_action;
        public OnPasteDone paste_done;
        public OnUndo undo;
        public OnRedo redo;
        public OnGtkReserved1 _gtk_reserved1;
        public OnGtkReserved2 _gtk_reserved2;
        public OnGtkReserved3 _gtk_reserved3;
        public OnGtkReserved4 _gtk_reserved4;
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
