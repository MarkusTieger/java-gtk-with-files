/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuildableParseContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_buildable_parse_context_get_element(long _self);
        long gtk_buildable_parse_context_get_element_stack(long _self);
        void gtk_buildable_parse_context_get_position(long _self, long line_number, long char_number);
        long gtk_buildable_parse_context_pop(long _self);
        void gtk_buildable_parse_context_push(long _self, long parser, long user_data);
    }

}
