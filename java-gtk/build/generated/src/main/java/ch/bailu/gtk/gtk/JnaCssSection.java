/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCssSection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_css_section_new(long file, long start, long end);
        long gtk_css_section_get_end_location(long _self);
        long gtk_css_section_get_file(long _self);
        long gtk_css_section_get_parent(long _self);
        long gtk_css_section_get_start_location(long _self);
        void gtk_css_section_print(long _self, long string);
        long gtk_css_section_ref(long _self);
        long gtk_css_section_to_string(long _self);
        void gtk_css_section_unref(long _self);
        long gtk_css_section_get_type();
    }

}
