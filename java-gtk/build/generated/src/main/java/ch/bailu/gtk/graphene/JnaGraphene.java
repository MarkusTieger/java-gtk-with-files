/* this file is machine generated */
package ch.bailu.gtk.graphene;




class JnaGraphene {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("graphene-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long graphene_box_empty();
        long graphene_box_infinite();
        long graphene_box_minus_one();
        long graphene_box_one();
        long graphene_box_one_minus_one();
        long graphene_box_zero();
        long graphene_point3d_zero();
        long graphene_point_zero();
        long graphene_rect_alloc();
        long graphene_rect_zero();
        long graphene_size_zero();
        long graphene_vec2_one();
        long graphene_vec2_x_axis();
        long graphene_vec2_y_axis();
        long graphene_vec2_zero();
        long graphene_vec3_one();
        long graphene_vec3_x_axis();
        long graphene_vec3_y_axis();
        long graphene_vec3_z_axis();
        long graphene_vec3_zero();
        long graphene_vec4_one();
        long graphene_vec4_w_axis();
        long graphene_vec4_x_axis();
        long graphene_vec4_y_axis();
        long graphene_vec4_z_axis();
        long graphene_vec4_zero();
    }

}
