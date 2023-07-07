/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaObjectExpression {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_object_expression_new(long object);
        long gtk_object_expression_get_object(long _self);
        long gtk_object_expression_get_type();
    }

}
