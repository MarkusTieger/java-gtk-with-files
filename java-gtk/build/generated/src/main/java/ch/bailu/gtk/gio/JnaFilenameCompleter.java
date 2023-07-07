/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFilenameCompleter {

    @FunctionalInterface
    public interface OnGotCompletionData extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_filename_completer_new();
        long g_filename_completer_get_completion_suffix(long _self, long initial_text);
        long g_filename_completer_get_completion_suffix(long _self, String initial_text);
        long g_filename_completer_get_completions(long _self, long initial_text);
        long g_filename_completer_get_completions(long _self, String initial_text);
        void g_filename_completer_set_dirs_only(long _self, boolean dirs_only);
        long g_filename_completer_get_type();
    }

}
