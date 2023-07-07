/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaLeaflet {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_leaflet_new();
        long adw_leaflet_append(long _self, long child);
        long adw_leaflet_get_adjacent_child(long _self, int direction);
        boolean adw_leaflet_get_can_navigate_back(long _self);
        boolean adw_leaflet_get_can_navigate_forward(long _self);
        boolean adw_leaflet_get_can_unfold(long _self);
        long adw_leaflet_get_child_by_name(long _self, long name);
        long adw_leaflet_get_child_by_name(long _self, String name);
        long adw_leaflet_get_child_transition_params(long _self);
        boolean adw_leaflet_get_child_transition_running(long _self);
        int adw_leaflet_get_fold_threshold_policy(long _self);
        boolean adw_leaflet_get_folded(long _self);
        boolean adw_leaflet_get_homogeneous(long _self);
        int adw_leaflet_get_mode_transition_duration(long _self);
        long adw_leaflet_get_page(long _self, long child);
        long adw_leaflet_get_pages(long _self);
        int adw_leaflet_get_transition_type(long _self);
        long adw_leaflet_get_visible_child(long _self);
        long adw_leaflet_get_visible_child_name(long _self);
        long adw_leaflet_insert_child_after(long _self, long child, long sibling);
        boolean adw_leaflet_navigate(long _self, int direction);
        long adw_leaflet_prepend(long _self, long child);
        void adw_leaflet_remove(long _self, long child);
        void adw_leaflet_reorder_child_after(long _self, long child, long sibling);
        void adw_leaflet_set_can_navigate_back(long _self, boolean can_navigate_back);
        void adw_leaflet_set_can_navigate_forward(long _self, boolean can_navigate_forward);
        void adw_leaflet_set_can_unfold(long _self, boolean can_unfold);
        void adw_leaflet_set_child_transition_params(long _self, long params);
        void adw_leaflet_set_fold_threshold_policy(long _self, int policy);
        void adw_leaflet_set_homogeneous(long _self, boolean homogeneous);
        void adw_leaflet_set_mode_transition_duration(long _self, int duration);
        void adw_leaflet_set_transition_type(long _self, int transition);
        void adw_leaflet_set_visible_child(long _self, long visible_child);
        void adw_leaflet_set_visible_child_name(long _self, long name);
        void adw_leaflet_set_visible_child_name(long _self, String name);
        long adw_leaflet_get_type();
    }

}
