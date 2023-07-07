/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFileChooserWidget {

    @FunctionalInterface
    public interface OnDesktopFolder extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDownFolder extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnHomeFolder extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnLocationPopup extends com.sun.jna.Callback {
        void invoke(long _self, long path, long _data);
    }

    @FunctionalInterface
    public interface OnLocationPopupOnPaste extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnLocationTogglePopup extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPlacesShortcut extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnQuickBookmark extends com.sun.jna.Callback {
        void invoke(long _self, int bookmark_index, long _data);
    }

    @FunctionalInterface
    public interface OnRecentShortcut extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSearchShortcut extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnShowHidden extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUpFolder extends com.sun.jna.Callback {
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
        long gtk_file_chooser_widget_new(int action);
        long gtk_file_chooser_widget_get_type();
    }

}
