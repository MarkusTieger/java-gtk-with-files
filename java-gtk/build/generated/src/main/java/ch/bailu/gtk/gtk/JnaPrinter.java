/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrinter {

    @FunctionalInterface
    public interface OnDetailsAcquired extends com.sun.jna.Callback {
        void invoke(long _self, boolean success, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_printer_new(long name, long backend, boolean virtual_);
        long gtk_printer_new(String name, long backend, boolean virtual_);
        boolean gtk_printer_accepts_pdf(long _self);
        boolean gtk_printer_accepts_ps(long _self);
        int gtk_printer_compare(long _self, long b);
        long gtk_printer_get_backend(long _self);
        int gtk_printer_get_capabilities(long _self);
        long gtk_printer_get_default_page_size(long _self);
        long gtk_printer_get_description(long _self);
        long gtk_printer_get_icon_name(long _self);
        int gtk_printer_get_job_count(long _self);
        long gtk_printer_get_location(long _self);
        long gtk_printer_get_name(long _self);
        long gtk_printer_get_state_message(long _self);
        boolean gtk_printer_has_details(long _self);
        boolean gtk_printer_is_accepting_jobs(long _self);
        boolean gtk_printer_is_active(long _self);
        boolean gtk_printer_is_default(long _self);
        boolean gtk_printer_is_paused(long _self);
        boolean gtk_printer_is_virtual(long _self);
        long gtk_printer_list_papers(long _self);
        void gtk_printer_request_details(long _self);
        long gtk_printer_get_type();
    }

}
