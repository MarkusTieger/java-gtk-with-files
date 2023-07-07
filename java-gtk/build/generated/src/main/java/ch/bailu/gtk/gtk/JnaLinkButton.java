/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLinkButton {

    @FunctionalInterface
    public interface OnActivateLink extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_link_button_new(long uri);
        long gtk_link_button_new(String uri);
        long gtk_link_button_new_with_label(long uri, long label);
        long gtk_link_button_new_with_label(String uri, String label);
        long gtk_link_button_get_uri(long _self);
        boolean gtk_link_button_get_visited(long _self);
        void gtk_link_button_set_uri(long _self, long uri);
        void gtk_link_button_set_uri(long _self, String uri);
        void gtk_link_button_set_visited(long _self, boolean visited);
        long gtk_link_button_get_type();
    }

}
