/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCustomLayout {

    @FunctionalInterface
    public interface OnCustomRequestModeFunc extends com.sun.jna.Callback {
        int invoke(long widget);
    }

    @FunctionalInterface
    public interface OnCustomMeasureFunc extends com.sun.jna.Callback {
        void invoke(long widget, int orientation, int for_size, long minimum, long natural, long minimum_baseline, long natural_baseline);
    }

    @FunctionalInterface
    public interface OnCustomAllocateFunc extends com.sun.jna.Callback {
        void invoke(long widget, int width, int height, int baseline);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_custom_layout_new(com.sun.jna.Callback request_mode, com.sun.jna.Callback measure, com.sun.jna.Callback allocate);
        long gtk_custom_layout_get_type();
    }

}
