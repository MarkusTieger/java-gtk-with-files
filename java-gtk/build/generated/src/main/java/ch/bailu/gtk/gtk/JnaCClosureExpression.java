/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCClosureExpression {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cclosure_expression_get_type();
    }

}
