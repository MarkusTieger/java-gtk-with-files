/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaAvatar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_avatar_new(int size, long text, boolean show_initials);
        long adw_avatar_new(int size, String text, boolean show_initials);
        long adw_avatar_draw_to_texture(long _self, int scale_factor);
        long adw_avatar_get_custom_image(long _self);
        long adw_avatar_get_icon_name(long _self);
        boolean adw_avatar_get_show_initials(long _self);
        int adw_avatar_get_size(long _self);
        long adw_avatar_get_text(long _self);
        void adw_avatar_set_custom_image(long _self, long custom_image);
        void adw_avatar_set_icon_name(long _self, long icon_name);
        void adw_avatar_set_icon_name(long _self, String icon_name);
        void adw_avatar_set_show_initials(long _self, boolean show_initials);
        void adw_avatar_set_size(long _self, int size);
        void adw_avatar_set_text(long _self, long text);
        void adw_avatar_set_text(long _self, String text);
        long adw_avatar_get_type();
    }

}
