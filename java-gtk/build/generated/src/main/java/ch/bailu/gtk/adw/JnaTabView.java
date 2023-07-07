/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaTabView {

    @FunctionalInterface
    public interface OnClosePage extends com.sun.jna.Callback {
        boolean invoke(long _self, long page, long _data);
    }

    @FunctionalInterface
    public interface OnCreateWindow extends com.sun.jna.Callback {
        long invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnIndicatorActivated extends com.sun.jna.Callback {
        void invoke(long _self, long page, long _data);
    }

    @FunctionalInterface
    public interface OnPageAttached extends com.sun.jna.Callback {
        void invoke(long _self, long page, int position, long _data);
    }

    @FunctionalInterface
    public interface OnPageDetached extends com.sun.jna.Callback {
        void invoke(long _self, long page, int position, long _data);
    }

    @FunctionalInterface
    public interface OnPageReordered extends com.sun.jna.Callback {
        void invoke(long _self, long page, int position, long _data);
    }

    @FunctionalInterface
    public interface OnSetupMenu extends com.sun.jna.Callback {
        void invoke(long _self, long page, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_tab_view_new();
        long adw_tab_view_add_page(long _self, long child, long parent);
        void adw_tab_view_add_shortcuts(long _self, int shortcuts);
        long adw_tab_view_append(long _self, long child);
        long adw_tab_view_append_pinned(long _self, long child);
        void adw_tab_view_close_other_pages(long _self, long page);
        void adw_tab_view_close_page(long _self, long page);
        void adw_tab_view_close_page_finish(long _self, long page, boolean confirm);
        void adw_tab_view_close_pages_after(long _self, long page);
        void adw_tab_view_close_pages_before(long _self, long page);
        long adw_tab_view_get_default_icon(long _self);
        boolean adw_tab_view_get_is_transferring_page(long _self);
        long adw_tab_view_get_menu_model(long _self);
        int adw_tab_view_get_n_pages(long _self);
        int adw_tab_view_get_n_pinned_pages(long _self);
        long adw_tab_view_get_nth_page(long _self, int position);
        long adw_tab_view_get_page(long _self, long child);
        int adw_tab_view_get_page_position(long _self, long page);
        long adw_tab_view_get_pages(long _self);
        long adw_tab_view_get_selected_page(long _self);
        int adw_tab_view_get_shortcuts(long _self);
        long adw_tab_view_insert(long _self, long child, int position);
        long adw_tab_view_insert_pinned(long _self, long child, int position);
        long adw_tab_view_prepend(long _self, long child);
        long adw_tab_view_prepend_pinned(long _self, long child);
        void adw_tab_view_remove_shortcuts(long _self, int shortcuts);
        boolean adw_tab_view_reorder_backward(long _self, long page);
        boolean adw_tab_view_reorder_first(long _self, long page);
        boolean adw_tab_view_reorder_forward(long _self, long page);
        boolean adw_tab_view_reorder_last(long _self, long page);
        boolean adw_tab_view_reorder_page(long _self, long page, int position);
        boolean adw_tab_view_select_next_page(long _self);
        boolean adw_tab_view_select_previous_page(long _self);
        void adw_tab_view_set_default_icon(long _self, long default_icon);
        void adw_tab_view_set_menu_model(long _self, long menu_model);
        void adw_tab_view_set_page_pinned(long _self, long page, boolean pinned);
        void adw_tab_view_set_selected_page(long _self, long selected_page);
        void adw_tab_view_set_shortcuts(long _self, int shortcuts);
        void adw_tab_view_transfer_page(long _self, long page, long other_view, int position);
        long adw_tab_view_get_type();
    }

}
