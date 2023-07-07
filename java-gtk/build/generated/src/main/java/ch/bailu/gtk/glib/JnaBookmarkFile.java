/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaBookmarkFile {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_bookmark_file_add_application(long _self, long uri, long name, long exec);
        void g_bookmark_file_add_application(long _self, String uri, String name, String exec);
        void g_bookmark_file_add_group(long _self, long uri, long group);
        void g_bookmark_file_add_group(long _self, String uri, String group);
        void g_bookmark_file_free(long _self);
        long g_bookmark_file_get_added_date_time(long _self, long uri, long _error);
        long g_bookmark_file_get_added_date_time(long _self, String uri, long _error);
        long g_bookmark_file_get_description(long _self, long uri, long _error);
        long g_bookmark_file_get_description(long _self, String uri, long _error);
        boolean g_bookmark_file_get_is_private(long _self, long uri, long _error);
        boolean g_bookmark_file_get_is_private(long _self, String uri, long _error);
        long g_bookmark_file_get_mime_type(long _self, long uri, long _error);
        long g_bookmark_file_get_mime_type(long _self, String uri, long _error);
        long g_bookmark_file_get_modified_date_time(long _self, long uri, long _error);
        long g_bookmark_file_get_modified_date_time(long _self, String uri, long _error);
        int g_bookmark_file_get_size(long _self);
        long g_bookmark_file_get_title(long _self, long uri, long _error);
        long g_bookmark_file_get_title(long _self, String uri, long _error);
        long g_bookmark_file_get_visited_date_time(long _self, long uri, long _error);
        long g_bookmark_file_get_visited_date_time(long _self, String uri, long _error);
        boolean g_bookmark_file_has_application(long _self, long uri, long name, long _error);
        boolean g_bookmark_file_has_application(long _self, String uri, String name, long _error);
        boolean g_bookmark_file_has_group(long _self, long uri, long group, long _error);
        boolean g_bookmark_file_has_group(long _self, String uri, String group, long _error);
        boolean g_bookmark_file_has_item(long _self, long uri);
        boolean g_bookmark_file_has_item(long _self, String uri);
        boolean g_bookmark_file_load_from_data(long _self, long data, long length, long _error);
        boolean g_bookmark_file_load_from_data(long _self, String data, long length, long _error);
        boolean g_bookmark_file_load_from_file(long _self, long filename, long _error);
        boolean g_bookmark_file_load_from_file(long _self, String filename, long _error);
        boolean g_bookmark_file_move_item(long _self, long old_uri, long new_uri, long _error);
        boolean g_bookmark_file_move_item(long _self, String old_uri, String new_uri, long _error);
        boolean g_bookmark_file_remove_application(long _self, long uri, long name, long _error);
        boolean g_bookmark_file_remove_application(long _self, String uri, String name, long _error);
        boolean g_bookmark_file_remove_group(long _self, long uri, long group, long _error);
        boolean g_bookmark_file_remove_group(long _self, String uri, String group, long _error);
        boolean g_bookmark_file_remove_item(long _self, long uri, long _error);
        boolean g_bookmark_file_remove_item(long _self, String uri, long _error);
        void g_bookmark_file_set_added_date_time(long _self, long uri, long added);
        void g_bookmark_file_set_added_date_time(long _self, String uri, long added);
        boolean g_bookmark_file_set_application_info(long _self, long uri, long name, long exec, int count, long stamp, long _error);
        boolean g_bookmark_file_set_application_info(long _self, String uri, String name, String exec, int count, long stamp, long _error);
        void g_bookmark_file_set_description(long _self, long uri, long description);
        void g_bookmark_file_set_description(long _self, String uri, String description);
        void g_bookmark_file_set_icon(long _self, long uri, long href, long mime_type);
        void g_bookmark_file_set_icon(long _self, String uri, String href, String mime_type);
        void g_bookmark_file_set_is_private(long _self, long uri, boolean is_private);
        void g_bookmark_file_set_is_private(long _self, String uri, boolean is_private);
        void g_bookmark_file_set_mime_type(long _self, long uri, long mime_type);
        void g_bookmark_file_set_mime_type(long _self, String uri, String mime_type);
        void g_bookmark_file_set_modified_date_time(long _self, long uri, long modified);
        void g_bookmark_file_set_modified_date_time(long _self, String uri, long modified);
        void g_bookmark_file_set_title(long _self, long uri, long title);
        void g_bookmark_file_set_title(long _self, String uri, String title);
        void g_bookmark_file_set_visited_date_time(long _self, long uri, long visited);
        void g_bookmark_file_set_visited_date_time(long _self, String uri, long visited);
        long g_bookmark_file_to_data(long _self, long length, long _error);
        boolean g_bookmark_file_to_file(long _self, long filename, long _error);
        boolean g_bookmark_file_to_file(long _self, String filename, long _error);
        int g_bookmark_file_error_quark();
        long g_bookmark_file_new();
    }

}
