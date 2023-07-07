/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaAppLaunchContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_app_launch_context_get_display(long _self);
        void gdk_app_launch_context_set_desktop(long _self, int desktop);
        void gdk_app_launch_context_set_icon(long _self, long icon);
        void gdk_app_launch_context_set_icon_name(long _self, long icon_name);
        void gdk_app_launch_context_set_icon_name(long _self, String icon_name);
        void gdk_app_launch_context_set_timestamp(long _self, int timestamp);
        long gdk_app_launch_context_get_type();
    }

}
