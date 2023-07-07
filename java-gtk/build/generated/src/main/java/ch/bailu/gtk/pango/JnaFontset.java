/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontset {

    @FunctionalInterface
    public interface OnFontsetForeachFunc extends com.sun.jna.Callback {
        boolean invoke(long fontset, long font, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void pango_fontset_foreach(long _self, com.sun.jna.Callback func, long data);
        long pango_fontset_get_font(long _self, int wc);
        long pango_fontset_get_metrics(long _self);
        long pango_fontset_get_type();
    }

}
