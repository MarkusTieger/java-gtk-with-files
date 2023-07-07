/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAboutDialog {

    @FunctionalInterface
    public interface OnActivateLink extends com.sun.jna.Callback {
        boolean invoke(long _self, long uri, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_about_dialog_new();
        void gtk_about_dialog_add_credit_section(long _self, long section_name, long people);
        void gtk_about_dialog_add_credit_section(long _self, String section_name, long people);
        long gtk_about_dialog_get_artists(long _self);
        long gtk_about_dialog_get_authors(long _self);
        long gtk_about_dialog_get_comments(long _self);
        long gtk_about_dialog_get_copyright(long _self);
        long gtk_about_dialog_get_documenters(long _self);
        long gtk_about_dialog_get_license(long _self);
        int gtk_about_dialog_get_license_type(long _self);
        long gtk_about_dialog_get_logo(long _self);
        long gtk_about_dialog_get_logo_icon_name(long _self);
        long gtk_about_dialog_get_program_name(long _self);
        long gtk_about_dialog_get_system_information(long _self);
        long gtk_about_dialog_get_translator_credits(long _self);
        long gtk_about_dialog_get_version(long _self);
        long gtk_about_dialog_get_website(long _self);
        long gtk_about_dialog_get_website_label(long _self);
        boolean gtk_about_dialog_get_wrap_license(long _self);
        void gtk_about_dialog_set_artists(long _self, long artists);
        void gtk_about_dialog_set_authors(long _self, long authors);
        void gtk_about_dialog_set_comments(long _self, long comments);
        void gtk_about_dialog_set_comments(long _self, String comments);
        void gtk_about_dialog_set_copyright(long _self, long copyright);
        void gtk_about_dialog_set_copyright(long _self, String copyright);
        void gtk_about_dialog_set_documenters(long _self, long documenters);
        void gtk_about_dialog_set_license(long _self, long license);
        void gtk_about_dialog_set_license(long _self, String license);
        void gtk_about_dialog_set_license_type(long _self, int license_type);
        void gtk_about_dialog_set_logo(long _self, long logo);
        void gtk_about_dialog_set_logo_icon_name(long _self, long icon_name);
        void gtk_about_dialog_set_logo_icon_name(long _self, String icon_name);
        void gtk_about_dialog_set_program_name(long _self, long name);
        void gtk_about_dialog_set_program_name(long _self, String name);
        void gtk_about_dialog_set_system_information(long _self, long system_information);
        void gtk_about_dialog_set_system_information(long _self, String system_information);
        void gtk_about_dialog_set_translator_credits(long _self, long translator_credits);
        void gtk_about_dialog_set_translator_credits(long _self, String translator_credits);
        void gtk_about_dialog_set_version(long _self, long version);
        void gtk_about_dialog_set_version(long _self, String version);
        void gtk_about_dialog_set_website(long _self, long website);
        void gtk_about_dialog_set_website(long _self, String website);
        void gtk_about_dialog_set_website_label(long _self, long website_label);
        void gtk_about_dialog_set_website_label(long _self, String website_label);
        void gtk_about_dialog_set_wrap_license(long _self, boolean wrap_license);
        long gtk_about_dialog_get_type();
    }

}
