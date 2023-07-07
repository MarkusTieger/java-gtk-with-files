/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaApplicationCommandLine {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_application_command_line_create_file_for_arg(long _self, long arg);
        long g_application_command_line_create_file_for_arg(long _self, String arg);
        long g_application_command_line_get_cwd(long _self);
        int g_application_command_line_get_exit_status(long _self);
        boolean g_application_command_line_get_is_remote(long _self);
        long g_application_command_line_get_options_dict(long _self);
        long g_application_command_line_get_platform_data(long _self);
        long g_application_command_line_get_stdin(long _self);
        long g_application_command_line_getenv(long _self, long name);
        long g_application_command_line_getenv(long _self, String name);
        void g_application_command_line_print(long _self, long format, java.lang.Object... _elipse);
        void g_application_command_line_print(long _self, String format, java.lang.Object... _elipse);
        void g_application_command_line_printerr(long _self, long format, java.lang.Object... _elipse);
        void g_application_command_line_printerr(long _self, String format, java.lang.Object... _elipse);
        void g_application_command_line_set_exit_status(long _self, int exit_status);
        long g_application_command_line_get_type();
    }

}
