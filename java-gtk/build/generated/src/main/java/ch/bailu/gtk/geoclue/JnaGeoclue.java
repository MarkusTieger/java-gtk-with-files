/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaGeoclue {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gclue_client_interface_info();
        int gclue_client_override_properties(long klass, int property_id_begin);
        long gclue_location_interface_info();
        int gclue_location_override_properties(long klass, int property_id_begin);
        long gclue_manager_interface_info();
        int gclue_manager_override_properties(long klass, int property_id_begin);
    }

}
