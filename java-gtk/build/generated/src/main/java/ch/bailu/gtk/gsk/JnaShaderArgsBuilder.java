/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaShaderArgsBuilder {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_shader_args_builder_new(long shader, long initial_values);
        long gsk_shader_args_builder_free_to_args(long _self);
        long gsk_shader_args_builder_ref(long _self);
        void gsk_shader_args_builder_set_bool(long _self, int idx, boolean value);
        void gsk_shader_args_builder_set_float(long _self, int idx, float value);
        void gsk_shader_args_builder_set_int(long _self, int idx, int value);
        void gsk_shader_args_builder_set_uint(long _self, int idx, int value);
        void gsk_shader_args_builder_set_vec2(long _self, int idx, long value);
        void gsk_shader_args_builder_set_vec3(long _self, int idx, long value);
        void gsk_shader_args_builder_set_vec4(long _self, int idx, long value);
        long gsk_shader_args_builder_to_args(long _self);
        void gsk_shader_args_builder_unref(long _self);
        long gsk_shader_args_builder_get_type();
    }

}
