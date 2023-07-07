/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaNotebook {

    @FunctionalInterface
    public interface OnChangeCurrentPage extends com.sun.jna.Callback {
        boolean invoke(long _self, int object, long _data);
    }

    @FunctionalInterface
    public interface OnCreateWindow extends com.sun.jna.Callback {
        long invoke(long _self, long page, long _data);
    }

    @FunctionalInterface
    public interface OnFocusTab extends com.sun.jna.Callback {
        boolean invoke(long _self, int object, long _data);
    }

    @FunctionalInterface
    public interface OnMoveFocusOut extends com.sun.jna.Callback {
        void invoke(long _self, int object, long _data);
    }

    @FunctionalInterface
    public interface OnPageAdded extends com.sun.jna.Callback {
        void invoke(long _self, long child, int page_num, long _data);
    }

    @FunctionalInterface
    public interface OnPageRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long child, int page_num, long _data);
    }

    @FunctionalInterface
    public interface OnPageReordered extends com.sun.jna.Callback {
        void invoke(long _self, long child, int page_num, long _data);
    }

    @FunctionalInterface
    public interface OnReorderTab extends com.sun.jna.Callback {
        boolean invoke(long _self, int object, boolean p0, long _data);
    }

    @FunctionalInterface
    public interface OnSelectPage extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean object, long _data);
    }

    @FunctionalInterface
    public interface OnSwitchPage extends com.sun.jna.Callback {
        void invoke(long _self, long page, int page_num, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_notebook_new();
        int gtk_notebook_append_page(long _self, long child, long tab_label);
        int gtk_notebook_append_page_menu(long _self, long child, long tab_label, long menu_label);
        void gtk_notebook_detach_tab(long _self, long child);
        long gtk_notebook_get_action_widget(long _self, int pack_type);
        int gtk_notebook_get_current_page(long _self);
        long gtk_notebook_get_group_name(long _self);
        long gtk_notebook_get_menu_label(long _self, long child);
        long gtk_notebook_get_menu_label_text(long _self, long child);
        int gtk_notebook_get_n_pages(long _self);
        long gtk_notebook_get_nth_page(long _self, int page_num);
        long gtk_notebook_get_page(long _self, long child);
        long gtk_notebook_get_pages(long _self);
        boolean gtk_notebook_get_scrollable(long _self);
        boolean gtk_notebook_get_show_border(long _self);
        boolean gtk_notebook_get_show_tabs(long _self);
        boolean gtk_notebook_get_tab_detachable(long _self, long child);
        long gtk_notebook_get_tab_label(long _self, long child);
        long gtk_notebook_get_tab_label_text(long _self, long child);
        int gtk_notebook_get_tab_pos(long _self);
        boolean gtk_notebook_get_tab_reorderable(long _self, long child);
        int gtk_notebook_insert_page(long _self, long child, long tab_label, int position);
        int gtk_notebook_insert_page_menu(long _self, long child, long tab_label, long menu_label, int position);
        void gtk_notebook_next_page(long _self);
        int gtk_notebook_page_num(long _self, long child);
        void gtk_notebook_popup_disable(long _self);
        void gtk_notebook_popup_enable(long _self);
        int gtk_notebook_prepend_page(long _self, long child, long tab_label);
        int gtk_notebook_prepend_page_menu(long _self, long child, long tab_label, long menu_label);
        void gtk_notebook_prev_page(long _self);
        void gtk_notebook_remove_page(long _self, int page_num);
        void gtk_notebook_reorder_child(long _self, long child, int position);
        void gtk_notebook_set_action_widget(long _self, long widget, int pack_type);
        void gtk_notebook_set_current_page(long _self, int page_num);
        void gtk_notebook_set_group_name(long _self, long group_name);
        void gtk_notebook_set_group_name(long _self, String group_name);
        void gtk_notebook_set_menu_label(long _self, long child, long menu_label);
        void gtk_notebook_set_menu_label_text(long _self, long child, long menu_text);
        void gtk_notebook_set_menu_label_text(long _self, long child, String menu_text);
        void gtk_notebook_set_scrollable(long _self, boolean scrollable);
        void gtk_notebook_set_show_border(long _self, boolean show_border);
        void gtk_notebook_set_show_tabs(long _self, boolean show_tabs);
        void gtk_notebook_set_tab_detachable(long _self, long child, boolean detachable);
        void gtk_notebook_set_tab_label(long _self, long child, long tab_label);
        void gtk_notebook_set_tab_label_text(long _self, long child, long tab_text);
        void gtk_notebook_set_tab_label_text(long _self, long child, String tab_text);
        void gtk_notebook_set_tab_pos(long _self, int pos);
        void gtk_notebook_set_tab_reorderable(long _self, long child, boolean reorderable);
        long gtk_notebook_get_type();
    }

}
