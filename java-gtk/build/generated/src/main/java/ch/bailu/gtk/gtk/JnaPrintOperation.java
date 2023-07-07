/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintOperation {

    @FunctionalInterface
    public interface OnBeginPrint extends com.sun.jna.Callback {
        void invoke(long _self, long context, long _data);
    }

    @FunctionalInterface
    public interface OnCreateCustomWidget extends com.sun.jna.Callback {
        long invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCustomWidgetApply extends com.sun.jna.Callback {
        void invoke(long _self, long widget, long _data);
    }

    @FunctionalInterface
    public interface OnDone extends com.sun.jna.Callback {
        void invoke(long _self, int result, long _data);
    }

    @FunctionalInterface
    public interface OnDrawPage extends com.sun.jna.Callback {
        void invoke(long _self, long context, int page_nr, long _data);
    }

    @FunctionalInterface
    public interface OnEndPrint extends com.sun.jna.Callback {
        void invoke(long _self, long context, long _data);
    }

    @FunctionalInterface
    public interface OnPaginate extends com.sun.jna.Callback {
        boolean invoke(long _self, long context, long _data);
    }

    @FunctionalInterface
    public interface OnPreview extends com.sun.jna.Callback {
        boolean invoke(long _self, long preview, long context, long parent, long _data);
    }

    @FunctionalInterface
    public interface OnRequestPageSetup extends com.sun.jna.Callback {
        void invoke(long _self, long context, int page_nr, long setup, long _data);
    }

    @FunctionalInterface
    public interface OnStatusChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUpdateCustomWidget extends com.sun.jna.Callback {
        void invoke(long _self, long widget, long setup, long settings, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_print_operation_new();
        void gtk_print_operation_cancel(long _self);
        void gtk_print_operation_draw_page_finish(long _self);
        long gtk_print_operation_get_default_page_setup(long _self);
        boolean gtk_print_operation_get_embed_page_setup(long _self);
        void gtk_print_operation_get_error(long _self, long _error);
        boolean gtk_print_operation_get_has_selection(long _self);
        int gtk_print_operation_get_n_pages_to_print(long _self);
        long gtk_print_operation_get_print_settings(long _self);
        int gtk_print_operation_get_status(long _self);
        long gtk_print_operation_get_status_string(long _self);
        boolean gtk_print_operation_get_support_selection(long _self);
        boolean gtk_print_operation_is_finished(long _self);
        int gtk_print_operation_run(long _self, int action, long parent, long _error);
        void gtk_print_operation_set_allow_async(long _self, boolean allow_async);
        void gtk_print_operation_set_current_page(long _self, int current_page);
        void gtk_print_operation_set_custom_tab_label(long _self, long label);
        void gtk_print_operation_set_custom_tab_label(long _self, String label);
        void gtk_print_operation_set_default_page_setup(long _self, long default_page_setup);
        void gtk_print_operation_set_defer_drawing(long _self);
        void gtk_print_operation_set_embed_page_setup(long _self, boolean embed);
        void gtk_print_operation_set_export_filename(long _self, long filename);
        void gtk_print_operation_set_export_filename(long _self, String filename);
        void gtk_print_operation_set_has_selection(long _self, boolean has_selection);
        void gtk_print_operation_set_job_name(long _self, long job_name);
        void gtk_print_operation_set_job_name(long _self, String job_name);
        void gtk_print_operation_set_n_pages(long _self, int n_pages);
        void gtk_print_operation_set_print_settings(long _self, long print_settings);
        void gtk_print_operation_set_show_progress(long _self, boolean show_progress);
        void gtk_print_operation_set_support_selection(long _self, boolean support_selection);
        void gtk_print_operation_set_track_print_status(long _self, boolean track_status);
        void gtk_print_operation_set_unit(long _self, int unit);
        void gtk_print_operation_set_use_full_page(long _self, boolean full_page);
        long gtk_print_operation_get_type();
    }

}
