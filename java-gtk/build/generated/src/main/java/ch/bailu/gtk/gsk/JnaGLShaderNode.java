/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaGLShaderNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_gl_shader_node_get_args(long _self);
        long gsk_gl_shader_node_get_child(long _self, int idx);
        int gsk_gl_shader_node_get_n_children(long _self);
        long gsk_gl_shader_node_get_shader(long _self);
        long gsk_gl_shader_node_get_type();
    }

}
