/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEmojiChooser {

    @FunctionalInterface
    public interface OnEmojiPicked extends com.sun.jna.Callback {
        void invoke(long _self, long text, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_emoji_chooser_new();
        long gtk_emoji_chooser_get_type();
    }

}
