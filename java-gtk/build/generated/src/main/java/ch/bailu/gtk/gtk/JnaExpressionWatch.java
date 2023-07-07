/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaExpressionWatch {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_expression_watch_evaluate(long _self, long value);
        long gtk_expression_watch_ref(long _self);
        void gtk_expression_watch_unref(long _self);
        void gtk_expression_watch_unwatch(long _self);
        long gtk_expression_watch_get_type();
    }

}
