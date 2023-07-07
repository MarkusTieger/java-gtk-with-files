/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellEditable {

    @FunctionalInterface
    public interface OnEditingDone extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnRemoveWidget extends com.sun.jna.Callback {
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
        void gtk_cell_editable_editing_done(long _self);
        void gtk_cell_editable_remove_widget(long _self);
        void gtk_cell_editable_start_editing(long _self, long event);
        long gtk_cell_editable_get_type();
    }

}
