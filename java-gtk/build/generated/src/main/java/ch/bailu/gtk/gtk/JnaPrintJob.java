/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintJob {

    @FunctionalInterface
    public interface OnPrintJobCompleteFunc extends com.sun.jna.Callback {
        void invoke(long print_job, long user_data, long error);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnStatusChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_print_job_new(long title, long printer, long settings, long page_setup);
        long gtk_print_job_new(String title, long printer, long settings, long page_setup);
        boolean gtk_print_job_get_collate(long _self);
        int gtk_print_job_get_n_up(long _self);
        int gtk_print_job_get_n_up_layout(long _self);
        int gtk_print_job_get_num_copies(long _self);
        int gtk_print_job_get_page_set(long _self);
        int gtk_print_job_get_pages(long _self);
        long gtk_print_job_get_printer(long _self);
        boolean gtk_print_job_get_reverse(long _self);
        boolean gtk_print_job_get_rotate(long _self);
        double gtk_print_job_get_scale(long _self);
        long gtk_print_job_get_settings(long _self);
        int gtk_print_job_get_status(long _self);
        long gtk_print_job_get_surface(long _self, long _error);
        long gtk_print_job_get_title(long _self);
        boolean gtk_print_job_get_track_print_status(long _self);
        void gtk_print_job_send(long _self, com.sun.jna.Callback callback, long user_data, com.sun.jna.Callback dnotify);
        void gtk_print_job_set_collate(long _self, boolean collate);
        void gtk_print_job_set_n_up(long _self, int n_up);
        void gtk_print_job_set_n_up_layout(long _self, int layout);
        void gtk_print_job_set_num_copies(long _self, int num_copies);
        void gtk_print_job_set_page_set(long _self, int page_set);
        void gtk_print_job_set_pages(long _self, int pages);
        void gtk_print_job_set_reverse(long _self, boolean reverse);
        void gtk_print_job_set_rotate(long _self, boolean rotate);
        void gtk_print_job_set_scale(long _self, double scale);
        boolean gtk_print_job_set_source_fd(long _self, int fd, long _error);
        boolean gtk_print_job_set_source_file(long _self, long filename, long _error);
        boolean gtk_print_job_set_source_file(long _self, String filename, long _error);
        void gtk_print_job_set_track_print_status(long _self, boolean track_status);
        long gtk_print_job_get_type();
    }

}
