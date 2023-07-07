/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStack {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_stack_new();
        long gtk_stack_add_child(long _self, long child);
        long gtk_stack_add_named(long _self, long child, long name);
        long gtk_stack_add_named(long _self, long child, String name);
        long gtk_stack_add_titled(long _self, long child, long name, long title);
        long gtk_stack_add_titled(long _self, long child, String name, String title);
        long gtk_stack_get_child_by_name(long _self, long name);
        long gtk_stack_get_child_by_name(long _self, String name);
        boolean gtk_stack_get_hhomogeneous(long _self);
        boolean gtk_stack_get_interpolate_size(long _self);
        long gtk_stack_get_page(long _self, long child);
        long gtk_stack_get_pages(long _self);
        int gtk_stack_get_transition_duration(long _self);
        boolean gtk_stack_get_transition_running(long _self);
        int gtk_stack_get_transition_type(long _self);
        boolean gtk_stack_get_vhomogeneous(long _self);
        long gtk_stack_get_visible_child(long _self);
        long gtk_stack_get_visible_child_name(long _self);
        void gtk_stack_remove(long _self, long child);
        void gtk_stack_set_hhomogeneous(long _self, boolean hhomogeneous);
        void gtk_stack_set_interpolate_size(long _self, boolean interpolate_size);
        void gtk_stack_set_transition_duration(long _self, int duration);
        void gtk_stack_set_transition_type(long _self, int transition);
        void gtk_stack_set_vhomogeneous(long _self, boolean vhomogeneous);
        void gtk_stack_set_visible_child(long _self, long child);
        void gtk_stack_set_visible_child_full(long _self, long name, int transition);
        void gtk_stack_set_visible_child_full(long _self, String name, int transition);
        void gtk_stack_set_visible_child_name(long _self, long name);
        void gtk_stack_set_visible_child_name(long _self, String name);
        long gtk_stack_get_type();
    }

}
