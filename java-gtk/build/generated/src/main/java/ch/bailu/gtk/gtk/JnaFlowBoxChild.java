/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFlowBoxChild {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_flow_box_child_new();
        void gtk_flow_box_child_changed(long _self);
        long gtk_flow_box_child_get_child(long _self);
        int gtk_flow_box_child_get_index(long _self);
        boolean gtk_flow_box_child_is_selected(long _self);
        void gtk_flow_box_child_set_child(long _self, long child);
        long gtk_flow_box_child_get_type();
    }

}
