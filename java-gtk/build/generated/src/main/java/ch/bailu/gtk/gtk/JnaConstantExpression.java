/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaConstantExpression {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_constant_expression_new(long value_type, java.lang.Object... _elipse);
        long gtk_constant_expression_new_for_value(long value);
        long gtk_constant_expression_get_value(long _self);
        long gtk_constant_expression_get_type();
    }

}
