/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaListStore {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_list_store_new(int n_columns, java.lang.Object... _elipse);
        long gtk_list_store_newv(int n_columns, long types);
        void gtk_list_store_append(long _self, long iter);
        void gtk_list_store_clear(long _self);
        void gtk_list_store_insert(long _self, long iter, int position);
        void gtk_list_store_insert_after(long _self, long iter, long sibling);
        void gtk_list_store_insert_before(long _self, long iter, long sibling);
        void gtk_list_store_insert_with_values(long _self, long iter, int position, java.lang.Object... _elipse);
        boolean gtk_list_store_iter_is_valid(long _self, long iter);
        void gtk_list_store_move_after(long _self, long iter, long position);
        void gtk_list_store_move_before(long _self, long iter, long position);
        void gtk_list_store_prepend(long _self, long iter);
        boolean gtk_list_store_remove(long _self, long iter);
        void gtk_list_store_reorder(long _self, long new_order);
        void gtk_list_store_set(long _self, long iter, java.lang.Object... _elipse);
        void gtk_list_store_set_column_types(long _self, int n_columns, long types);
        void gtk_list_store_set_value(long _self, long iter, int column, long value);
        void gtk_list_store_swap(long _self, long a, long b);
        long gtk_list_store_get_type();
    }

}
