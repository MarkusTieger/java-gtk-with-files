/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuilderCScope {

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_builder_cscope_new();
        void gtk_builder_cscope_add_callback_symbol(long _self, long callback_name, com.sun.jna.Callback callback_symbol);
        void gtk_builder_cscope_add_callback_symbol(long _self, String callback_name, com.sun.jna.Callback callback_symbol);
        void gtk_builder_cscope_add_callback_symbols(long _self, long first_callback_name, com.sun.jna.Callback first_callback_symbol, java.lang.Object... _elipse);
        void gtk_builder_cscope_add_callback_symbols(long _self, String first_callback_name, com.sun.jna.Callback first_callback_symbol, java.lang.Object... _elipse);
        long gtk_builder_cscope_get_type();
    }

}
