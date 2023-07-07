/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAssistant {

    @FunctionalInterface
    public interface OnAssistantPageFunc extends com.sun.jna.Callback {
        int invoke(int current_page, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnApply extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCancel extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnClose extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEscape extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPrepare extends com.sun.jna.Callback {
        void invoke(long _self, long page, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_assistant_new();
        void gtk_assistant_add_action_widget(long _self, long child);
        int gtk_assistant_append_page(long _self, long page);
        void gtk_assistant_commit(long _self);
        int gtk_assistant_get_current_page(long _self);
        int gtk_assistant_get_n_pages(long _self);
        long gtk_assistant_get_nth_page(long _self, int page_num);
        long gtk_assistant_get_page(long _self, long child);
        boolean gtk_assistant_get_page_complete(long _self, long page);
        long gtk_assistant_get_page_title(long _self, long page);
        int gtk_assistant_get_page_type(long _self, long page);
        long gtk_assistant_get_pages(long _self);
        int gtk_assistant_insert_page(long _self, long page, int position);
        void gtk_assistant_next_page(long _self);
        int gtk_assistant_prepend_page(long _self, long page);
        void gtk_assistant_previous_page(long _self);
        void gtk_assistant_remove_action_widget(long _self, long child);
        void gtk_assistant_remove_page(long _self, int page_num);
        void gtk_assistant_set_current_page(long _self, int page_num);
        void gtk_assistant_set_forward_page_func(long _self, com.sun.jna.Callback page_func, long data, com.sun.jna.Callback destroy);
        void gtk_assistant_set_page_complete(long _self, long page, boolean complete);
        void gtk_assistant_set_page_title(long _self, long page, long title);
        void gtk_assistant_set_page_title(long _self, long page, String title);
        void gtk_assistant_set_page_type(long _self, long page, int type);
        void gtk_assistant_update_buttons_state(long _self);
        long gtk_assistant_get_type();
    }

}
