/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTimeZone {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_time_zone_new_identifier(long identifier);
        long g_time_zone_new_identifier(String identifier);
        long g_time_zone_new_local();
        long g_time_zone_new_offset(int seconds);
        long g_time_zone_new_utc();
        int g_time_zone_find_interval(long _self, int type, long time_);
        long g_time_zone_get_abbreviation(long _self, int interval);
        long g_time_zone_get_identifier(long _self);
        int g_time_zone_get_offset(long _self, int interval);
        boolean g_time_zone_is_dst(long _self, int interval);
        long g_time_zone_ref(long _self);
        void g_time_zone_unref(long _self);
        long g_time_zone_get_type();
    }

}
