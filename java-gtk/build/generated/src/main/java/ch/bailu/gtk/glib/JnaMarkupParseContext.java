/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMarkupParseContext {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_markup_parse_context_new(long parser, int flags, long user_data, com.sun.jna.Callback user_data_dnotify);
        boolean g_markup_parse_context_end_parse(long _self, long _error);
        void g_markup_parse_context_free(long _self);
        long g_markup_parse_context_get_element(long _self);
        long g_markup_parse_context_get_element_stack(long _self);
        void g_markup_parse_context_get_position(long _self, long line_number, long char_number);
        long g_markup_parse_context_get_user_data(long _self);
        boolean g_markup_parse_context_parse(long _self, long text, long text_len, long _error);
        boolean g_markup_parse_context_parse(long _self, String text, long text_len, long _error);
        long g_markup_parse_context_pop(long _self);
        void g_markup_parse_context_push(long _self, long parser, long user_data);
        long g_markup_parse_context_ref(long _self);
        void g_markup_parse_context_unref(long _self);
        long g_markup_parse_context_get_type();
    }

}
