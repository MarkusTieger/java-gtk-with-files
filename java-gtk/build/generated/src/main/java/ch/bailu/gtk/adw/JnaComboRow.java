/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaComboRow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_combo_row_new();
        long adw_combo_row_get_expression(long _self);
        long adw_combo_row_get_factory(long _self);
        long adw_combo_row_get_list_factory(long _self);
        long adw_combo_row_get_model(long _self);
        int adw_combo_row_get_selected(long _self);
        long adw_combo_row_get_selected_item(long _self);
        boolean adw_combo_row_get_use_subtitle(long _self);
        void adw_combo_row_set_expression(long _self, long expression);
        void adw_combo_row_set_factory(long _self, long factory);
        void adw_combo_row_set_list_factory(long _self, long factory);
        void adw_combo_row_set_model(long _self, long model);
        void adw_combo_row_set_selected(long _self, int position);
        void adw_combo_row_set_use_subtitle(long _self, boolean use_subtitle);
        long adw_combo_row_get_type();
    }

}
