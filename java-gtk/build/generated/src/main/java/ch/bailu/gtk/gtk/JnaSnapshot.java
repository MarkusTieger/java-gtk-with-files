/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSnapshot {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_snapshot_new();
        long gtk_snapshot_append_cairo(long _self, long bounds);
        void gtk_snapshot_append_color(long _self, long color, long bounds);
        void gtk_snapshot_append_inset_shadow(long _self, long outline, long color, float dx, float dy, float spread, float blur_radius);
        void gtk_snapshot_append_layout(long _self, long layout, long color);
        void gtk_snapshot_append_node(long _self, long node);
        void gtk_snapshot_append_outset_shadow(long _self, long outline, long color, float dx, float dy, float spread, float blur_radius);
        void gtk_snapshot_append_texture(long _self, long texture, long bounds);
        long gtk_snapshot_free_to_node(long _self);
        long gtk_snapshot_free_to_paintable(long _self, long size);
        void gtk_snapshot_gl_shader_pop_texture(long _self);
        void gtk_snapshot_perspective(long _self, float depth);
        void gtk_snapshot_pop(long _self);
        void gtk_snapshot_push_blend(long _self, int blend_mode);
        void gtk_snapshot_push_blur(long _self, double radius);
        void gtk_snapshot_push_clip(long _self, long bounds);
        void gtk_snapshot_push_color_matrix(long _self, long color_matrix, long color_offset);
        void gtk_snapshot_push_cross_fade(long _self, double progress);
        void gtk_snapshot_push_debug(long _self, long message, java.lang.Object... _elipse);
        void gtk_snapshot_push_debug(long _self, String message, java.lang.Object... _elipse);
        void gtk_snapshot_push_gl_shader(long _self, long shader, long bounds, long take_args);
        void gtk_snapshot_push_opacity(long _self, double opacity);
        void gtk_snapshot_push_repeat(long _self, long bounds, long child_bounds);
        void gtk_snapshot_push_rounded_clip(long _self, long bounds);
        void gtk_snapshot_render_background(long _self, long context, double x, double y, double width, double height);
        void gtk_snapshot_render_focus(long _self, long context, double x, double y, double width, double height);
        void gtk_snapshot_render_frame(long _self, long context, double x, double y, double width, double height);
        void gtk_snapshot_render_insertion_cursor(long _self, long context, double x, double y, long layout, int index, int direction);
        void gtk_snapshot_render_layout(long _self, long context, double x, double y, long layout);
        void gtk_snapshot_restore(long _self);
        void gtk_snapshot_rotate(long _self, float angle);
        void gtk_snapshot_rotate_3d(long _self, float angle, long axis);
        void gtk_snapshot_save(long _self);
        void gtk_snapshot_scale(long _self, float factor_x, float factor_y);
        void gtk_snapshot_scale_3d(long _self, float factor_x, float factor_y, float factor_z);
        long gtk_snapshot_to_node(long _self);
        long gtk_snapshot_to_paintable(long _self, long size);
        void gtk_snapshot_transform(long _self, long transform);
        void gtk_snapshot_transform_matrix(long _self, long matrix);
        void gtk_snapshot_translate(long _self, long point);
        void gtk_snapshot_translate_3d(long _self, long point);
        long gtk_snapshot_get_type();
    }

}
