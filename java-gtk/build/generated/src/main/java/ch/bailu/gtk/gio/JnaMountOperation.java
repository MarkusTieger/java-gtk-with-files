/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMountOperation {

    @FunctionalInterface
    public interface OnAborted extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnAskPassword extends com.sun.jna.Callback {
        void invoke(long _self, long message, long default_user, long default_domain, int flags, long _data);
    }

    @FunctionalInterface
    public interface OnReply extends com.sun.jna.Callback {
        void invoke(long _self, int result, long _data);
    }

    @FunctionalInterface
    public interface OnShowUnmountProgress extends com.sun.jna.Callback {
        void invoke(long _self, long message, long time_left, long bytes_left, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_mount_operation_new();
        boolean g_mount_operation_get_anonymous(long _self);
        int g_mount_operation_get_choice(long _self);
        long g_mount_operation_get_domain(long _self);
        boolean g_mount_operation_get_is_tcrypt_hidden_volume(long _self);
        boolean g_mount_operation_get_is_tcrypt_system_volume(long _self);
        long g_mount_operation_get_password(long _self);
        int g_mount_operation_get_password_save(long _self);
        int g_mount_operation_get_pim(long _self);
        long g_mount_operation_get_username(long _self);
        void g_mount_operation_reply(long _self, int result);
        void g_mount_operation_set_anonymous(long _self, boolean anonymous);
        void g_mount_operation_set_choice(long _self, int choice);
        void g_mount_operation_set_domain(long _self, long domain);
        void g_mount_operation_set_domain(long _self, String domain);
        void g_mount_operation_set_is_tcrypt_hidden_volume(long _self, boolean hidden_volume);
        void g_mount_operation_set_is_tcrypt_system_volume(long _self, boolean system_volume);
        void g_mount_operation_set_password(long _self, long password);
        void g_mount_operation_set_password(long _self, String password);
        void g_mount_operation_set_password_save(long _self, int save);
        void g_mount_operation_set_pim(long _self, int pim);
        void g_mount_operation_set_username(long _self, long username);
        void g_mount_operation_set_username(long _self, String username);
        long g_mount_operation_get_type();
    }

}
