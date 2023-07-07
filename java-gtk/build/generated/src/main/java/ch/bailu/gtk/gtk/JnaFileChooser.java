/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFileChooser {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_file_chooser_add_choice(long _self, long id, long label, long options, long option_labels);
        void gtk_file_chooser_add_choice(long _self, String id, String label, long options, long option_labels);
        void gtk_file_chooser_add_filter(long _self, long filter);
        boolean gtk_file_chooser_add_shortcut_folder(long _self, long folder, long _error);
        int gtk_file_chooser_get_action(long _self);
        long gtk_file_chooser_get_choice(long _self, long id);
        long gtk_file_chooser_get_choice(long _self, String id);
        boolean gtk_file_chooser_get_create_folders(long _self);
        long gtk_file_chooser_get_current_folder(long _self);
        long gtk_file_chooser_get_current_name(long _self);
        long gtk_file_chooser_get_file(long _self);
        long gtk_file_chooser_get_files(long _self);
        long gtk_file_chooser_get_filter(long _self);
        long gtk_file_chooser_get_filters(long _self);
        boolean gtk_file_chooser_get_select_multiple(long _self);
        long gtk_file_chooser_get_shortcut_folders(long _self);
        void gtk_file_chooser_remove_choice(long _self, long id);
        void gtk_file_chooser_remove_choice(long _self, String id);
        void gtk_file_chooser_remove_filter(long _self, long filter);
        boolean gtk_file_chooser_remove_shortcut_folder(long _self, long folder, long _error);
        void gtk_file_chooser_set_action(long _self, int action);
        void gtk_file_chooser_set_choice(long _self, long id, long option);
        void gtk_file_chooser_set_choice(long _self, String id, String option);
        void gtk_file_chooser_set_create_folders(long _self, boolean create_folders);
        boolean gtk_file_chooser_set_current_folder(long _self, long file, long _error);
        void gtk_file_chooser_set_current_name(long _self, long name);
        void gtk_file_chooser_set_current_name(long _self, String name);
        boolean gtk_file_chooser_set_file(long _self, long file, long _error);
        void gtk_file_chooser_set_filter(long _self, long filter);
        void gtk_file_chooser_set_select_multiple(long _self, boolean select_multiple);
        long gtk_file_chooser_get_type();
    }

}
