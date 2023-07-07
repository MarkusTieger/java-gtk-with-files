/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaExpression {

    @FunctionalInterface
    public interface OnExpressionNotify extends com.sun.jna.Callback {
        void invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_expression_bind(long _self, long target, long property, long this_);
        long gtk_expression_bind(long _self, long target, String property, long this_);
        boolean gtk_expression_evaluate(long _self, long this_, long value);
        long gtk_expression_get_value_type(long _self);
        boolean gtk_expression_is_static(long _self);
        long gtk_expression_ref(long _self);
        void gtk_expression_unref(long _self);
        long gtk_expression_watch(long _self, long this_, com.sun.jna.Callback notify, long user_data, com.sun.jna.Callback user_destroy);
        long gtk_expression_get_type();
    }

}
