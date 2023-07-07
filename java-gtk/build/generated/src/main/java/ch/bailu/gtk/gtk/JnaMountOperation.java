/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMountOperation {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_mount_operation_new(long parent);
        long gtk_mount_operation_get_display(long _self);
        long gtk_mount_operation_get_parent(long _self);
        boolean gtk_mount_operation_is_showing(long _self);
        void gtk_mount_operation_set_display(long _self, long display);
        void gtk_mount_operation_set_parent(long _self, long parent);
        long gtk_mount_operation_get_type();
    }

}
