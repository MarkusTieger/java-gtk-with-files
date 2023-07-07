/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPrintOperationPreview {

    @FunctionalInterface
    public interface OnGotPageSize extends com.sun.jna.Callback {
        void invoke(long _self, long context, long page_setup, long _data);
    }

    @FunctionalInterface
    public interface OnReady extends com.sun.jna.Callback {
        void invoke(long _self, long context, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_print_operation_preview_end_preview(long _self);
        boolean gtk_print_operation_preview_is_selected(long _self, int page_nr);
        void gtk_print_operation_preview_render_page(long _self, int page_nr);
        long gtk_print_operation_preview_get_type();
    }

}
