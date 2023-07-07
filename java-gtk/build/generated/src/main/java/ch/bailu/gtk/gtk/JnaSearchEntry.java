/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSearchEntry {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnNextMatch extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPreviousMatch extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSearchChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSearchStarted extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnStopSearch extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_search_entry_new();
        long gtk_search_entry_get_key_capture_widget(long _self);
        int gtk_search_entry_get_search_delay(long _self);
        void gtk_search_entry_set_key_capture_widget(long _self, long widget);
        void gtk_search_entry_set_search_delay(long _self, int delay);
        long gtk_search_entry_get_type();
    }

}
