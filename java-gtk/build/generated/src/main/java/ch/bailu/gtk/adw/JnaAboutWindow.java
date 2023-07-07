/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaAboutWindow {

    @FunctionalInterface
    public interface OnActivateLink extends com.sun.jna.Callback {
        boolean invoke(long _self, long uri, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_about_window_new();
        void adw_about_window_add_acknowledgement_section(long _self, long name, long people);
        void adw_about_window_add_acknowledgement_section(long _self, String name, long people);
        void adw_about_window_add_credit_section(long _self, long name, long people);
        void adw_about_window_add_credit_section(long _self, String name, long people);
        void adw_about_window_add_legal_section(long _self, long title, long copyright, int license_type, long license);
        void adw_about_window_add_legal_section(long _self, String title, String copyright, int license_type, String license);
        void adw_about_window_add_link(long _self, long title, long url);
        void adw_about_window_add_link(long _self, String title, String url);
        long adw_about_window_get_application_icon(long _self);
        long adw_about_window_get_application_name(long _self);
        long adw_about_window_get_artists(long _self);
        long adw_about_window_get_comments(long _self);
        long adw_about_window_get_copyright(long _self);
        long adw_about_window_get_debug_info(long _self);
        long adw_about_window_get_debug_info_filename(long _self);
        long adw_about_window_get_designers(long _self);
        long adw_about_window_get_developer_name(long _self);
        long adw_about_window_get_developers(long _self);
        long adw_about_window_get_documenters(long _self);
        long adw_about_window_get_issue_url(long _self);
        long adw_about_window_get_license(long _self);
        int adw_about_window_get_license_type(long _self);
        long adw_about_window_get_release_notes(long _self);
        long adw_about_window_get_release_notes_version(long _self);
        long adw_about_window_get_support_url(long _self);
        long adw_about_window_get_translator_credits(long _self);
        long adw_about_window_get_version(long _self);
        long adw_about_window_get_website(long _self);
        void adw_about_window_set_application_icon(long _self, long application_icon);
        void adw_about_window_set_application_icon(long _self, String application_icon);
        void adw_about_window_set_application_name(long _self, long application_name);
        void adw_about_window_set_application_name(long _self, String application_name);
        void adw_about_window_set_artists(long _self, long artists);
        void adw_about_window_set_comments(long _self, long comments);
        void adw_about_window_set_comments(long _self, String comments);
        void adw_about_window_set_copyright(long _self, long copyright);
        void adw_about_window_set_copyright(long _self, String copyright);
        void adw_about_window_set_debug_info(long _self, long debug_info);
        void adw_about_window_set_debug_info(long _self, String debug_info);
        void adw_about_window_set_debug_info_filename(long _self, long filename);
        void adw_about_window_set_debug_info_filename(long _self, String filename);
        void adw_about_window_set_designers(long _self, long designers);
        void adw_about_window_set_developer_name(long _self, long developer_name);
        void adw_about_window_set_developer_name(long _self, String developer_name);
        void adw_about_window_set_developers(long _self, long developers);
        void adw_about_window_set_documenters(long _self, long documenters);
        void adw_about_window_set_issue_url(long _self, long issue_url);
        void adw_about_window_set_issue_url(long _self, String issue_url);
        void adw_about_window_set_license(long _self, long license);
        void adw_about_window_set_license(long _self, String license);
        void adw_about_window_set_license_type(long _self, int license_type);
        void adw_about_window_set_release_notes(long _self, long release_notes);
        void adw_about_window_set_release_notes(long _self, String release_notes);
        void adw_about_window_set_release_notes_version(long _self, long version);
        void adw_about_window_set_release_notes_version(long _self, String version);
        void adw_about_window_set_support_url(long _self, long support_url);
        void adw_about_window_set_support_url(long _self, String support_url);
        void adw_about_window_set_translator_credits(long _self, long translator_credits);
        void adw_about_window_set_translator_credits(long _self, String translator_credits);
        void adw_about_window_set_version(long _self, long version);
        void adw_about_window_set_version(long _self, String version);
        void adw_about_window_set_website(long _self, long website);
        void adw_about_window_set_website(long _self, String website);
        long adw_about_window_get_type();
    }

}
