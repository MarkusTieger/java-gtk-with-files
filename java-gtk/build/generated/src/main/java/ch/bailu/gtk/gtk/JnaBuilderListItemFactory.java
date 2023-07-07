/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuilderListItemFactory {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_builder_list_item_factory_new_from_bytes(long scope, long bytes);
        long gtk_builder_list_item_factory_new_from_resource(long scope, long resource_path);
        long gtk_builder_list_item_factory_new_from_resource(long scope, String resource_path);
        long gtk_builder_list_item_factory_get_bytes(long _self);
        long gtk_builder_list_item_factory_get_resource(long _self);
        long gtk_builder_list_item_factory_get_scope(long _self);
        long gtk_builder_list_item_factory_get_type();
    }

}
