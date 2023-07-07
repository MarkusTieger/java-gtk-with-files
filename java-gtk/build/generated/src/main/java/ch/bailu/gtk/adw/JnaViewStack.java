/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaViewStack {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_view_stack_new();
        long adw_view_stack_add(long _self, long child);
        long adw_view_stack_add_named(long _self, long child, long name);
        long adw_view_stack_add_named(long _self, long child, String name);
        long adw_view_stack_add_titled(long _self, long child, long name, long title);
        long adw_view_stack_add_titled(long _self, long child, String name, String title);
        long adw_view_stack_add_titled_with_icon(long _self, long child, long name, long title, long icon_name);
        long adw_view_stack_add_titled_with_icon(long _self, long child, String name, String title, String icon_name);
        long adw_view_stack_get_child_by_name(long _self, long name);
        long adw_view_stack_get_child_by_name(long _self, String name);
        boolean adw_view_stack_get_hhomogeneous(long _self);
        long adw_view_stack_get_page(long _self, long child);
        long adw_view_stack_get_pages(long _self);
        boolean adw_view_stack_get_vhomogeneous(long _self);
        long adw_view_stack_get_visible_child(long _self);
        long adw_view_stack_get_visible_child_name(long _self);
        void adw_view_stack_remove(long _self, long child);
        void adw_view_stack_set_hhomogeneous(long _self, boolean hhomogeneous);
        void adw_view_stack_set_vhomogeneous(long _self, boolean vhomogeneous);
        void adw_view_stack_set_visible_child(long _self, long child);
        void adw_view_stack_set_visible_child_name(long _self, long name);
        void adw_view_stack_set_visible_child_name(long _self, String name);
        long adw_view_stack_get_type();
    }

}
