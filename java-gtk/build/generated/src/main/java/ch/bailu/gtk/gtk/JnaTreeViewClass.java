/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeViewClass {

    @FunctionalInterface
    public interface OnRowActivated extends com.sun.jna.Callback {
        void invoke(long tree_view, long path, long column);
    }

    @FunctionalInterface
    public interface OnTestExpandRow extends com.sun.jna.Callback {
        boolean invoke(long tree_view, long iter, long path);
    }

    @FunctionalInterface
    public interface OnTestCollapseRow extends com.sun.jna.Callback {
        boolean invoke(long tree_view, long iter, long path);
    }

    @FunctionalInterface
    public interface OnRowExpanded extends com.sun.jna.Callback {
        void invoke(long tree_view, long iter, long path);
    }

    @FunctionalInterface
    public interface OnRowCollapsed extends com.sun.jna.Callback {
        void invoke(long tree_view, long iter, long path);
    }

    @FunctionalInterface
    public interface OnColumnsChanged extends com.sun.jna.Callback {
        void invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnCursorChanged extends com.sun.jna.Callback {
        void invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnMoveCursor extends com.sun.jna.Callback {
        boolean invoke(long tree_view, int step, int count, boolean extend, boolean modify);
    }

    @FunctionalInterface
    public interface OnSelectAll extends com.sun.jna.Callback {
        boolean invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnUnselectAll extends com.sun.jna.Callback {
        boolean invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnSelectCursorRow extends com.sun.jna.Callback {
        boolean invoke(long tree_view, boolean start_editing);
    }

    @FunctionalInterface
    public interface OnToggleCursorRow extends com.sun.jna.Callback {
        boolean invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnExpandCollapseCursorRow extends com.sun.jna.Callback {
        boolean invoke(long tree_view, boolean logical, boolean expand, boolean open_all);
    }

    @FunctionalInterface
    public interface OnSelectCursorParent extends com.sun.jna.Callback {
        boolean invoke(long tree_view);
    }

    @FunctionalInterface
    public interface OnStartInteractiveSearch extends com.sun.jna.Callback {
        boolean invoke(long tree_view);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TreeViewClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TreeViewClass.PARENT_CLASS, TreeViewClass.ROW_ACTIVATED, TreeViewClass.TEST_EXPAND_ROW, TreeViewClass.TEST_COLLAPSE_ROW, TreeViewClass.ROW_EXPANDED, TreeViewClass.ROW_COLLAPSED, TreeViewClass.COLUMNS_CHANGED, TreeViewClass.CURSOR_CHANGED, TreeViewClass.MOVE_CURSOR, TreeViewClass.SELECT_ALL, TreeViewClass.UNSELECT_ALL, TreeViewClass.SELECT_CURSOR_ROW, TreeViewClass.TOGGLE_CURSOR_ROW, TreeViewClass.EXPAND_COLLAPSE_CURSOR_ROW, TreeViewClass.SELECT_CURSOR_PARENT, TreeViewClass.START_INTERACTIVE_SEARCH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WidgetClass.getInstanceSize()];
        public OnRowActivated row_activated;
        public OnTestExpandRow test_expand_row;
        public OnTestCollapseRow test_collapse_row;
        public OnRowExpanded row_expanded;
        public OnRowCollapsed row_collapsed;
        public OnColumnsChanged columns_changed;
        public OnCursorChanged cursor_changed;
        public OnMoveCursor move_cursor;
        public OnSelectAll select_all;
        public OnUnselectAll unselect_all;
        public OnSelectCursorRow select_cursor_row;
        public OnToggleCursorRow toggle_cursor_row;
        public OnExpandCollapseCursorRow expand_collapse_cursor_row;
        public OnSelectCursorParent select_cursor_parent;
        public OnStartInteractiveSearch start_interactive_search;
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
