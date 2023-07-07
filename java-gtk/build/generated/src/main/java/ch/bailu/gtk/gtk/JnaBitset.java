/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBitset {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_bitset_new_empty();
        long gtk_bitset_new_range(int start, int n_items);
        boolean gtk_bitset_add(long _self, int value);
        void gtk_bitset_add_range(long _self, int start, int n_items);
        void gtk_bitset_add_range_closed(long _self, int first, int last);
        void gtk_bitset_add_rectangle(long _self, int start, int width, int height, int stride);
        boolean gtk_bitset_contains(long _self, int value);
        long gtk_bitset_copy(long _self);
        void gtk_bitset_difference(long _self, long other);
        boolean gtk_bitset_equals(long _self, long other);
        int gtk_bitset_get_maximum(long _self);
        int gtk_bitset_get_minimum(long _self);
        int gtk_bitset_get_nth(long _self, int nth);
        long gtk_bitset_get_size(long _self);
        long gtk_bitset_get_size_in_range(long _self, int first, int last);
        void gtk_bitset_intersect(long _self, long other);
        boolean gtk_bitset_is_empty(long _self);
        long gtk_bitset_ref(long _self);
        boolean gtk_bitset_remove(long _self, int value);
        void gtk_bitset_remove_all(long _self);
        void gtk_bitset_remove_range(long _self, int start, int n_items);
        void gtk_bitset_remove_range_closed(long _self, int first, int last);
        void gtk_bitset_remove_rectangle(long _self, int start, int width, int height, int stride);
        void gtk_bitset_shift_left(long _self, int amount);
        void gtk_bitset_shift_right(long _self, int amount);
        void gtk_bitset_splice(long _self, int position, int removed, int added);
        void gtk_bitset_subtract(long _self, long other);
        void gtk_bitset_union(long _self, long other);
        void gtk_bitset_unref(long _self);
        long gtk_bitset_get_type();
    }

}
