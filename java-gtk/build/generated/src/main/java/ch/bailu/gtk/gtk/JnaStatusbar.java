/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStatusbar {

    @FunctionalInterface
    public interface OnTextPopped extends com.sun.jna.Callback {
        void invoke(long _self, int context_id, long text, long _data);
    }

    @FunctionalInterface
    public interface OnTextPushed extends com.sun.jna.Callback {
        void invoke(long _self, int context_id, long text, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_statusbar_new();
        int gtk_statusbar_get_context_id(long _self, long context_description);
        int gtk_statusbar_get_context_id(long _self, String context_description);
        void gtk_statusbar_pop(long _self, int context_id);
        int gtk_statusbar_push(long _self, int context_id, long text);
        int gtk_statusbar_push(long _self, int context_id, String text);
        void gtk_statusbar_remove(long _self, int context_id, int message_id);
        void gtk_statusbar_remove_all(long _self, int context_id);
        long gtk_statusbar_get_type();
    }

}
