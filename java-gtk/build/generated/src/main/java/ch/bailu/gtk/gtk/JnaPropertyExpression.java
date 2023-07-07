/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPropertyExpression {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_property_expression_new(long this_type, long expression, long property_name);
        long gtk_property_expression_new(long this_type, long expression, String property_name);
        long gtk_property_expression_new_for_pspec(long expression, long pspec);
        long gtk_property_expression_get_expression(long _self);
        long gtk_property_expression_get_pspec(long _self);
        long gtk_property_expression_get_type();
    }

}
