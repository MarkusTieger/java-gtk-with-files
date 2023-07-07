/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeExpander {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_expander_new();
        long gtk_tree_expander_get_child(long _self);
        boolean gtk_tree_expander_get_indent_for_icon(long _self);
        long gtk_tree_expander_get_item(long _self);
        long gtk_tree_expander_get_list_row(long _self);
        void gtk_tree_expander_set_child(long _self, long child);
        void gtk_tree_expander_set_indent_for_icon(long _self, boolean indent_for_icon);
        void gtk_tree_expander_set_list_row(long _self, long list_row);
        long gtk_tree_expander_get_type();
    }

}
