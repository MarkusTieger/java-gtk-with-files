/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCssProvider {

    @FunctionalInterface
    public interface OnParsingError extends com.sun.jna.Callback {
        void invoke(long _self, long section, long error, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_css_provider_new();
        void gtk_css_provider_load_from_data(long _self, long data, long length);
        void gtk_css_provider_load_from_data(long _self, String data, long length);
        void gtk_css_provider_load_from_file(long _self, long file);
        void gtk_css_provider_load_from_path(long _self, long path);
        void gtk_css_provider_load_from_path(long _self, String path);
        void gtk_css_provider_load_from_resource(long _self, long resource_path);
        void gtk_css_provider_load_from_resource(long _self, String resource_path);
        void gtk_css_provider_load_named(long _self, long name, long variant);
        void gtk_css_provider_load_named(long _self, String name, String variant);
        long gtk_css_provider_to_string(long _self);
        long gtk_css_provider_get_type();
    }

}
