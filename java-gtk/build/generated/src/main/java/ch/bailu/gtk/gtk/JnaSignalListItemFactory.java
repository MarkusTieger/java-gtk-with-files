/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSignalListItemFactory {

    @FunctionalInterface
    public interface OnBind extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }

    @FunctionalInterface
    public interface OnSetup extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }

    @FunctionalInterface
    public interface OnTeardown extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }

    @FunctionalInterface
    public interface OnUnbind extends com.sun.jna.Callback {
        void invoke(long _self, long object, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_signal_list_item_factory_new();
        long gtk_signal_list_item_factory_get_type();
    }

}
