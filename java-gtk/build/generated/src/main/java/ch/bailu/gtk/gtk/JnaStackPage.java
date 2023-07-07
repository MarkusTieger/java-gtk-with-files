/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStackPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_stack_page_get_child(long _self);
        long gtk_stack_page_get_icon_name(long _self);
        long gtk_stack_page_get_name(long _self);
        boolean gtk_stack_page_get_needs_attention(long _self);
        long gtk_stack_page_get_title(long _self);
        boolean gtk_stack_page_get_use_underline(long _self);
        boolean gtk_stack_page_get_visible(long _self);
        void gtk_stack_page_set_icon_name(long _self, long setting);
        void gtk_stack_page_set_icon_name(long _self, String setting);
        void gtk_stack_page_set_name(long _self, long setting);
        void gtk_stack_page_set_name(long _self, String setting);
        void gtk_stack_page_set_needs_attention(long _self, boolean setting);
        void gtk_stack_page_set_title(long _self, long setting);
        void gtk_stack_page_set_title(long _self, String setting);
        void gtk_stack_page_set_use_underline(long _self, boolean setting);
        void gtk_stack_page_set_visible(long _self, boolean visible);
        long gtk_stack_page_get_type();
    }

}
