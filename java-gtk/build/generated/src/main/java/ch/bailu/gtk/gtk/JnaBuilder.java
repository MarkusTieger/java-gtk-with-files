/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBuilder {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_builder_new();
        long gtk_builder_new_from_file(long filename);
        long gtk_builder_new_from_file(String filename);
        long gtk_builder_new_from_resource(long resource_path);
        long gtk_builder_new_from_resource(String resource_path);
        long gtk_builder_new_from_string(long string, long length);
        long gtk_builder_new_from_string(String string, long length);
        boolean gtk_builder_add_from_file(long _self, long filename, long _error);
        boolean gtk_builder_add_from_file(long _self, String filename, long _error);
        boolean gtk_builder_add_from_resource(long _self, long resource_path, long _error);
        boolean gtk_builder_add_from_resource(long _self, String resource_path, long _error);
        boolean gtk_builder_add_from_string(long _self, long buffer, long length, long _error);
        boolean gtk_builder_add_from_string(long _self, String buffer, long length, long _error);
        boolean gtk_builder_add_objects_from_file(long _self, long filename, long object_ids, long _error);
        boolean gtk_builder_add_objects_from_file(long _self, String filename, long object_ids, long _error);
        boolean gtk_builder_add_objects_from_resource(long _self, long resource_path, long object_ids, long _error);
        boolean gtk_builder_add_objects_from_resource(long _self, String resource_path, long object_ids, long _error);
        boolean gtk_builder_add_objects_from_string(long _self, long buffer, long length, long object_ids, long _error);
        boolean gtk_builder_add_objects_from_string(long _self, String buffer, long length, long object_ids, long _error);
        long gtk_builder_create_closure(long _self, long function_name, int flags, long object, long _error);
        long gtk_builder_create_closure(long _self, String function_name, int flags, long object, long _error);
        void gtk_builder_expose_object(long _self, long name, long object);
        void gtk_builder_expose_object(long _self, String name, long object);
        boolean gtk_builder_extend_with_template(long _self, long object, long template_type, long buffer, long length, long _error);
        boolean gtk_builder_extend_with_template(long _self, long object, long template_type, String buffer, long length, long _error);
        long gtk_builder_get_current_object(long _self);
        long gtk_builder_get_object(long _self, long name);
        long gtk_builder_get_object(long _self, String name);
        long gtk_builder_get_objects(long _self);
        long gtk_builder_get_scope(long _self);
        long gtk_builder_get_translation_domain(long _self);
        long gtk_builder_get_type_from_name(long _self, long type_name);
        long gtk_builder_get_type_from_name(long _self, String type_name);
        void gtk_builder_set_current_object(long _self, long current_object);
        void gtk_builder_set_scope(long _self, long scope);
        void gtk_builder_set_translation_domain(long _self, long domain);
        void gtk_builder_set_translation_domain(long _self, String domain);
        boolean gtk_builder_value_from_string(long _self, long pspec, long string, long value, long _error);
        boolean gtk_builder_value_from_string(long _self, long pspec, String string, long value, long _error);
        boolean gtk_builder_value_from_string_type(long _self, long type, long string, long value, long _error);
        boolean gtk_builder_value_from_string_type(long _self, long type, String string, long value, long _error);
        long gtk_builder_get_type();
    }

}
