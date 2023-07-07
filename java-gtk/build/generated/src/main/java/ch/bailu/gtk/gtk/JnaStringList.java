/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStringList {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_string_list_new(long strings);
        void gtk_string_list_append(long _self, long string);
        void gtk_string_list_append(long _self, String string);
        long gtk_string_list_get_string(long _self, int position);
        void gtk_string_list_remove(long _self, int position);
        void gtk_string_list_splice(long _self, int position, int n_removals, long additions);
        void gtk_string_list_take(long _self, long string);
        long gtk_string_list_get_type();
    }

}
