/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAccessible {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_accessible_get_accessible_role(long _self);
        void gtk_accessible_reset_property(long _self, int property);
        void gtk_accessible_reset_relation(long _self, int relation);
        void gtk_accessible_reset_state(long _self, int state);
        void gtk_accessible_update_property(long _self, int first_property, java.lang.Object... _elipse);
        void gtk_accessible_update_relation(long _self, int first_relation, java.lang.Object... _elipse);
        void gtk_accessible_update_state(long _self, int first_state, java.lang.Object... _elipse);
        long gtk_accessible_get_type();
    }

}
