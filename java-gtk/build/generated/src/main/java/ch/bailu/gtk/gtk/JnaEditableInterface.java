/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEditableInterface {

    @FunctionalInterface
    public interface OnInsertText extends com.sun.jna.Callback {
        void invoke(long editable, long text, int length, long position);
    }

    @FunctionalInterface
    public interface OnDeleteText extends com.sun.jna.Callback {
        void invoke(long editable, int start_pos, int end_pos);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long editable);
    }

    @FunctionalInterface
    public interface OnGetText extends com.sun.jna.Callback {
        long invoke(long editable);
    }

    @FunctionalInterface
    public interface OnDoInsertText extends com.sun.jna.Callback {
        void invoke(long editable, long text, int length, long position);
    }

    @FunctionalInterface
    public interface OnDoDeleteText extends com.sun.jna.Callback {
        void invoke(long editable, int start_pos, int end_pos);
    }

    @FunctionalInterface
    public interface OnGetSelectionBounds extends com.sun.jna.Callback {
        boolean invoke(long editable, long start_pos, long end_pos);
    }

    @FunctionalInterface
    public interface OnSetSelectionBounds extends com.sun.jna.Callback {
        void invoke(long editable, int start_pos, int end_pos);
    }

    @FunctionalInterface
    public interface OnGetDelegate extends com.sun.jna.Callback {
        long invoke(long editable);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("EditableInterface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({EditableInterface.BASE_IFACE, EditableInterface.INSERT_TEXT, EditableInterface.DELETE_TEXT, EditableInterface.CHANGED, EditableInterface.GET_TEXT, EditableInterface.DO_INSERT_TEXT, EditableInterface.DO_DELETE_TEXT, EditableInterface.GET_SELECTION_BOUNDS, EditableInterface.SET_SELECTION_BOUNDS, EditableInterface.GET_DELEGATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] base_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnInsertText insert_text;
        public OnDeleteText delete_text;
        public OnChanged changed;
        public OnGetText get_text;
        public OnDoInsertText do_insert_text;
        public OnDoDeleteText do_delete_text;
        public OnGetSelectionBounds get_selection_bounds;
        public OnSetSelectionBounds set_selection_bounds;
        public OnGetDelegate get_delegate;
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
