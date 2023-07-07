/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaLocation {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gclue_location_dup_description(long _self);
        long gclue_location_dup_timestamp(long _self);
        double gclue_location_get_accuracy(long _self);
        double gclue_location_get_altitude(long _self);
        long gclue_location_get_description(long _self);
        double gclue_location_get_heading(long _self);
        double gclue_location_get_latitude(long _self);
        double gclue_location_get_longitude(long _self);
        double gclue_location_get_speed(long _self);
        long gclue_location_get_timestamp(long _self);
        void gclue_location_set_accuracy(long _self, double value);
        void gclue_location_set_altitude(long _self, double value);
        void gclue_location_set_description(long _self, long value);
        void gclue_location_set_description(long _self, String value);
        void gclue_location_set_heading(long _self, double value);
        void gclue_location_set_latitude(long _self, double value);
        void gclue_location_set_longitude(long _self, double value);
        void gclue_location_set_speed(long _self, double value);
        void gclue_location_set_timestamp(long _self, long value);
        long gclue_location_interface_info();
        int gclue_location_override_properties(long klass, int property_id_begin);
        long gclue_location_get_type();
    }

}
