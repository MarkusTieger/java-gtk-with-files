/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaGLShader {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_gl_shader_new_from_bytes(long sourcecode);
        long gsk_gl_shader_new_from_resource(long resource_path);
        long gsk_gl_shader_new_from_resource(String resource_path);
        boolean gsk_gl_shader_compile(long _self, long renderer, long _error);
        int gsk_gl_shader_find_uniform_by_name(long _self, long name);
        int gsk_gl_shader_find_uniform_by_name(long _self, String name);
        long gsk_gl_shader_format_args(long _self, java.lang.Object... _elipse);
        boolean gsk_gl_shader_get_arg_bool(long _self, long args, int idx);
        float gsk_gl_shader_get_arg_float(long _self, long args, int idx);
        int gsk_gl_shader_get_arg_int(long _self, long args, int idx);
        int gsk_gl_shader_get_arg_uint(long _self, long args, int idx);
        void gsk_gl_shader_get_arg_vec2(long _self, long args, int idx, long out_value);
        void gsk_gl_shader_get_arg_vec3(long _self, long args, int idx, long out_value);
        void gsk_gl_shader_get_arg_vec4(long _self, long args, int idx, long out_value);
        long gsk_gl_shader_get_args_size(long _self);
        int gsk_gl_shader_get_n_textures(long _self);
        int gsk_gl_shader_get_n_uniforms(long _self);
        long gsk_gl_shader_get_resource(long _self);
        long gsk_gl_shader_get_source(long _self);
        long gsk_gl_shader_get_uniform_name(long _self, int idx);
        int gsk_gl_shader_get_uniform_offset(long _self, int idx);
        int gsk_gl_shader_get_uniform_type(long _self, int idx);
        long gsk_gl_shader_get_type();
    }

}
