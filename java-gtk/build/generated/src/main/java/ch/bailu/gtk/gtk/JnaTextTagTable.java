/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTextTagTable {

    @FunctionalInterface
    public interface OnTextTagTableForeach extends com.sun.jna.Callback {
        void invoke(long tag, long data);
    }

    @FunctionalInterface
    public interface OnTagAdded extends com.sun.jna.Callback {
        void invoke(long _self, long tag, long _data);
    }

    @FunctionalInterface
    public interface OnTagChanged extends com.sun.jna.Callback {
        void invoke(long _self, long tag, boolean size_changed, long _data);
    }

    @FunctionalInterface
    public interface OnTagRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long tag, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_text_tag_table_new();
        boolean gtk_text_tag_table_add(long _self, long tag);
        void gtk_text_tag_table_foreach(long _self, com.sun.jna.Callback func, long data);
        int gtk_text_tag_table_get_size(long _self);
        long gtk_text_tag_table_lookup(long _self, long name);
        long gtk_text_tag_table_lookup(long _self, String name);
        void gtk_text_tag_table_remove(long _self, long tag);
        long gtk_text_tag_table_get_type();
    }

}
