/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWidget {

    @FunctionalInterface
    public interface OnTickCallback extends com.sun.jna.Callback {
        boolean invoke(long widget, long frame_clock, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnDestroy extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDirectionChanged extends com.sun.jna.Callback {
        void invoke(long _self, int previous_direction, long _data);
    }

    @FunctionalInterface
    public interface OnHide extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnKeynavFailed extends com.sun.jna.Callback {
        boolean invoke(long _self, int direction, long _data);
    }

    @FunctionalInterface
    public interface OnMap extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnMnemonicActivate extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean group_cycling, long _data);
    }

    @FunctionalInterface
    public interface OnMoveFocus extends com.sun.jna.Callback {
        void invoke(long _self, int direction, long _data);
    }

    @FunctionalInterface
    public interface OnQueryTooltip extends com.sun.jna.Callback {
        boolean invoke(long _self, int x, int y, boolean keyboard_mode, long tooltip, long _data);
    }

    @FunctionalInterface
    public interface OnRealize extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnShow extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnStateFlagsChanged extends com.sun.jna.Callback {
        void invoke(long _self, int flags, long _data);
    }

    @FunctionalInterface
    public interface OnUnmap extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnUnrealize extends com.sun.jna.Callback {
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
        void gtk_widget_action_set_enabled(long _self, long action_name, boolean enabled);
        void gtk_widget_action_set_enabled(long _self, String action_name, boolean enabled);
        boolean gtk_widget_activate(long _self);
        boolean gtk_widget_activate_action(long _self, long name, long format_string, java.lang.Object... _elipse);
        boolean gtk_widget_activate_action(long _self, String name, String format_string, java.lang.Object... _elipse);
        boolean gtk_widget_activate_action_variant(long _self, long name, long args);
        boolean gtk_widget_activate_action_variant(long _self, String name, long args);
        void gtk_widget_activate_default(long _self);
        void gtk_widget_add_controller(long _self, long controller);
        void gtk_widget_add_css_class(long _self, long css_class);
        void gtk_widget_add_css_class(long _self, String css_class);
        void gtk_widget_add_mnemonic_label(long _self, long label);
        int gtk_widget_add_tick_callback(long _self, com.sun.jna.Callback callback, long user_data, com.sun.jna.Callback notify);
        void gtk_widget_allocate(long _self, int width, int height, int baseline, long transform);
        boolean gtk_widget_child_focus(long _self, int direction);
        boolean gtk_widget_compute_bounds(long _self, long target, long out_bounds);
        boolean gtk_widget_compute_expand(long _self, int orientation);
        boolean gtk_widget_compute_point(long _self, long target, long point, long out_point);
        boolean gtk_widget_compute_transform(long _self, long target, long out_transform);
        boolean gtk_widget_contains(long _self, double x, double y);
        long gtk_widget_create_pango_context(long _self);
        long gtk_widget_create_pango_layout(long _self, long text);
        long gtk_widget_create_pango_layout(long _self, String text);
        void gtk_widget_dispose_template(long _self, long widget_type);
        boolean gtk_drag_check_threshold(long _self, int start_x, int start_y, int current_x, int current_y);
        void gtk_widget_error_bell(long _self);
        int gtk_widget_get_allocated_baseline(long _self);
        int gtk_widget_get_allocated_height(long _self);
        int gtk_widget_get_allocated_width(long _self);
        void gtk_widget_get_allocation(long _self, long allocation);
        long gtk_widget_get_ancestor(long _self, long widget_type);
        boolean gtk_widget_get_can_focus(long _self);
        boolean gtk_widget_get_can_target(long _self);
        boolean gtk_widget_get_child_visible(long _self);
        long gtk_widget_get_clipboard(long _self);
        long gtk_widget_get_css_classes(long _self);
        long gtk_widget_get_css_name(long _self);
        long gtk_widget_get_cursor(long _self);
        int gtk_widget_get_direction(long _self);
        long gtk_widget_get_display(long _self);
        long gtk_widget_get_first_child(long _self);
        long gtk_widget_get_focus_child(long _self);
        boolean gtk_widget_get_focus_on_click(long _self);
        boolean gtk_widget_get_focusable(long _self);
        long gtk_widget_get_font_map(long _self);
        long gtk_widget_get_font_options(long _self);
        long gtk_widget_get_frame_clock(long _self);
        int gtk_widget_get_halign(long _self);
        boolean gtk_widget_get_has_tooltip(long _self);
        int gtk_widget_get_height(long _self);
        boolean gtk_widget_get_hexpand(long _self);
        boolean gtk_widget_get_hexpand_set(long _self);
        long gtk_widget_get_last_child(long _self);
        long gtk_widget_get_layout_manager(long _self);
        boolean gtk_widget_get_mapped(long _self);
        int gtk_widget_get_margin_bottom(long _self);
        int gtk_widget_get_margin_end(long _self);
        int gtk_widget_get_margin_start(long _self);
        int gtk_widget_get_margin_top(long _self);
        long gtk_widget_get_name(long _self);
        long gtk_widget_get_native(long _self);
        long gtk_widget_get_next_sibling(long _self);
        double gtk_widget_get_opacity(long _self);
        int gtk_widget_get_overflow(long _self);
        long gtk_widget_get_pango_context(long _self);
        long gtk_widget_get_parent(long _self);
        void gtk_widget_get_preferred_size(long _self, long minimum_size, long natural_size);
        long gtk_widget_get_prev_sibling(long _self);
        long gtk_widget_get_primary_clipboard(long _self);
        boolean gtk_widget_get_realized(long _self);
        boolean gtk_widget_get_receives_default(long _self);
        int gtk_widget_get_request_mode(long _self);
        long gtk_widget_get_root(long _self);
        int gtk_widget_get_scale_factor(long _self);
        boolean gtk_widget_get_sensitive(long _self);
        long gtk_widget_get_settings(long _self);
        int gtk_widget_get_size(long _self, int orientation);
        void gtk_widget_get_size_request(long _self, long width, long height);
        int gtk_widget_get_state_flags(long _self);
        long gtk_widget_get_style_context(long _self);
        long gtk_widget_get_template_child(long _self, long widget_type, long name);
        long gtk_widget_get_template_child(long _self, long widget_type, String name);
        long gtk_widget_get_tooltip_markup(long _self);
        long gtk_widget_get_tooltip_text(long _self);
        int gtk_widget_get_valign(long _self);
        boolean gtk_widget_get_vexpand(long _self);
        boolean gtk_widget_get_vexpand_set(long _self);
        boolean gtk_widget_get_visible(long _self);
        int gtk_widget_get_width(long _self);
        boolean gtk_widget_grab_focus(long _self);
        boolean gtk_widget_has_css_class(long _self, long css_class);
        boolean gtk_widget_has_css_class(long _self, String css_class);
        boolean gtk_widget_has_default(long _self);
        boolean gtk_widget_has_focus(long _self);
        boolean gtk_widget_has_visible_focus(long _self);
        void gtk_widget_hide(long _self);
        boolean gtk_widget_in_destruction(long _self);
        void gtk_widget_init_template(long _self);
        void gtk_widget_insert_action_group(long _self, long name, long group);
        void gtk_widget_insert_action_group(long _self, String name, long group);
        void gtk_widget_insert_after(long _self, long parent, long previous_sibling);
        void gtk_widget_insert_before(long _self, long parent, long next_sibling);
        boolean gtk_widget_is_ancestor(long _self, long ancestor);
        boolean gtk_widget_is_drawable(long _self);
        boolean gtk_widget_is_focus(long _self);
        boolean gtk_widget_is_sensitive(long _self);
        boolean gtk_widget_is_visible(long _self);
        boolean gtk_widget_keynav_failed(long _self, int direction);
        long gtk_widget_list_mnemonic_labels(long _self);
        void gtk_widget_map(long _self);
        void gtk_widget_measure(long _self, int orientation, int for_size, long minimum, long natural, long minimum_baseline, long natural_baseline);
        boolean gtk_widget_mnemonic_activate(long _self, boolean group_cycling);
        long gtk_widget_observe_children(long _self);
        long gtk_widget_observe_controllers(long _self);
        long gtk_widget_pick(long _self, double x, double y, int flags);
        void gtk_widget_queue_allocate(long _self);
        void gtk_widget_queue_draw(long _self);
        void gtk_widget_queue_resize(long _self);
        void gtk_widget_realize(long _self);
        void gtk_widget_remove_controller(long _self, long controller);
        void gtk_widget_remove_css_class(long _self, long css_class);
        void gtk_widget_remove_css_class(long _self, String css_class);
        void gtk_widget_remove_mnemonic_label(long _self, long label);
        void gtk_widget_remove_tick_callback(long _self, int id);
        void gtk_widget_set_can_focus(long _self, boolean can_focus);
        void gtk_widget_set_can_target(long _self, boolean can_target);
        void gtk_widget_set_child_visible(long _self, boolean child_visible);
        void gtk_widget_set_css_classes(long _self, long classes);
        void gtk_widget_set_cursor(long _self, long cursor);
        void gtk_widget_set_cursor_from_name(long _self, long name);
        void gtk_widget_set_cursor_from_name(long _self, String name);
        void gtk_widget_set_direction(long _self, int dir);
        void gtk_widget_set_focus_child(long _self, long child);
        void gtk_widget_set_focus_on_click(long _self, boolean focus_on_click);
        void gtk_widget_set_focusable(long _self, boolean focusable);
        void gtk_widget_set_font_map(long _self, long font_map);
        void gtk_widget_set_font_options(long _self, long options);
        void gtk_widget_set_halign(long _self, int align);
        void gtk_widget_set_has_tooltip(long _self, boolean has_tooltip);
        void gtk_widget_set_hexpand(long _self, boolean expand);
        void gtk_widget_set_hexpand_set(long _self, boolean set);
        void gtk_widget_set_layout_manager(long _self, long layout_manager);
        void gtk_widget_set_margin_bottom(long _self, int margin);
        void gtk_widget_set_margin_end(long _self, int margin);
        void gtk_widget_set_margin_start(long _self, int margin);
        void gtk_widget_set_margin_top(long _self, int margin);
        void gtk_widget_set_name(long _self, long name);
        void gtk_widget_set_name(long _self, String name);
        void gtk_widget_set_opacity(long _self, double opacity);
        void gtk_widget_set_overflow(long _self, int overflow);
        void gtk_widget_set_parent(long _self, long parent);
        void gtk_widget_set_receives_default(long _self, boolean receives_default);
        void gtk_widget_set_sensitive(long _self, boolean sensitive);
        void gtk_widget_set_size_request(long _self, int width, int height);
        void gtk_widget_set_state_flags(long _self, int flags, boolean clear);
        void gtk_widget_set_tooltip_markup(long _self, long markup);
        void gtk_widget_set_tooltip_markup(long _self, String markup);
        void gtk_widget_set_tooltip_text(long _self, long text);
        void gtk_widget_set_tooltip_text(long _self, String text);
        void gtk_widget_set_valign(long _self, int align);
        void gtk_widget_set_vexpand(long _self, boolean expand);
        void gtk_widget_set_vexpand_set(long _self, boolean set);
        void gtk_widget_set_visible(long _self, boolean visible);
        boolean gtk_widget_should_layout(long _self);
        void gtk_widget_show(long _self);
        void gtk_widget_size_allocate(long _self, long allocation, int baseline);
        void gtk_widget_snapshot_child(long _self, long child, long snapshot);
        void gtk_widget_trigger_tooltip_query(long _self);
        void gtk_widget_unmap(long _self);
        void gtk_widget_unparent(long _self);
        void gtk_widget_unrealize(long _self);
        void gtk_widget_unset_state_flags(long _self, int flags);
        int gtk_widget_get_default_direction();
        void gtk_widget_set_default_direction(int dir);
        long gtk_widget_get_type();
    }

}
