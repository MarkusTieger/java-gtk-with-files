/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaGtk {

    @FunctionalInterface
    public interface OnPrinterFunc extends com.sun.jna.Callback {
        boolean invoke(long printer, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnPageSetupDoneFunc extends com.sun.jna.Callback {
        void invoke(long page_setup, long data);
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_accelerator_get_default_mod_mask();
        long gtk_accelerator_get_label(int accelerator_key, int accelerator_mods);
        long gtk_accelerator_get_label_with_keycode(long display, int accelerator_key, int keycode, int accelerator_mods);
        long gtk_accelerator_name(int accelerator_key, int accelerator_mods);
        long gtk_accelerator_name_with_keycode(long display, int accelerator_key, int keycode, int accelerator_mods);
        boolean gtk_accelerator_valid(int keyval, int modifiers);
        void gtk_accessible_property_init_value(int property, long value);
        void gtk_accessible_relation_init_value(int relation, long value);
        void gtk_accessible_state_init_value(int state, long value);
        int gtk_builder_error_quark();
        long gtk_check_version(int required_major, int required_minor, int required_micro);
        int gtk_constraint_vfl_parser_error_quark();
        int gtk_css_parser_error_quark();
        int gtk_css_parser_warning_quark();
        void gtk_disable_setlocale();
        boolean gtk_editable_delegate_get_property(long object, int prop_id, long value, long pspec);
        boolean gtk_editable_delegate_set_property(long object, int prop_id, long value, long pspec);
        int gtk_editable_install_properties(long object_class, int first_prop);
        void gtk_enumerate_printers(com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy, boolean wait);
        int gtk_file_chooser_error_quark();
        int gtk_get_binary_age();
        int gtk_get_debug_flags();
        long gtk_get_default_language();
        int gtk_get_interface_age();
        int gtk_get_locale_direction();
        int gtk_get_major_version();
        int gtk_get_micro_version();
        int gtk_get_minor_version();
        void gtk_hsv_to_rgb(float h, float s, float v, long r, long g, long b);
        int gtk_icon_theme_error_quark();
        void gtk_init();
        boolean gtk_init_check();
        boolean gtk_is_initialized();
        long gtk_native_get_for_surface(long surface);
        int gtk_ordering_from_cmpfunc(int cmpfunc_result);
        long gtk_paper_size_get_default();
        long gtk_paper_size_get_paper_sizes(boolean include_custom);
        long gtk_param_spec_expression(long name, long nick, long blurb, int flags);
        int gtk_print_error_quark();
        long gtk_print_run_page_setup_dialog(long parent, long page_setup, long settings);
        void gtk_print_run_page_setup_dialog_async(long parent, long page_setup, long settings, com.sun.jna.Callback done_cb, long data);
        int gtk_recent_manager_error_quark();
        void gtk_render_activity(long context, long cr, double x, double y, double width, double height);
        void gtk_render_arrow(long context, long cr, double angle, double x, double y, double size);
        void gtk_render_background(long context, long cr, double x, double y, double width, double height);
        void gtk_render_check(long context, long cr, double x, double y, double width, double height);
        void gtk_render_expander(long context, long cr, double x, double y, double width, double height);
        void gtk_render_focus(long context, long cr, double x, double y, double width, double height);
        void gtk_render_frame(long context, long cr, double x, double y, double width, double height);
        void gtk_render_handle(long context, long cr, double x, double y, double width, double height);
        void gtk_render_icon(long context, long cr, long texture, double x, double y);
        void gtk_render_layout(long context, long cr, double x, double y, long layout);
        void gtk_render_line(long context, long cr, double x0, double y0, double x1, double y1);
        void gtk_render_option(long context, long cr, double x, double y, double width, double height);
        void gtk_rgb_to_hsv(float r, float g, float b, long h, long s, long v);
        void gtk_set_debug_flags(int flags);
        void gtk_show_about_dialog(long parent, long first_property_name, java.lang.Object... _elipse);
        void gtk_show_uri(long parent, long uri, int timestamp);
        void gtk_show_uri_full(long parent, long uri, int timestamp, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gtk_show_uri_full_finish(long parent, long result, long _error);
        void gtk_test_accessible_assertion_message_role(long domain, long file, int line, long func, long expr, long accessible, int expected_role, int actual_role);
        long gtk_test_accessible_check_property(long accessible, int property, java.lang.Object... _elipse);
        long gtk_test_accessible_check_relation(long accessible, int relation, java.lang.Object... _elipse);
        long gtk_test_accessible_check_state(long accessible, int state, java.lang.Object... _elipse);
        boolean gtk_test_accessible_has_property(long accessible, int property);
        boolean gtk_test_accessible_has_relation(long accessible, int relation);
        boolean gtk_test_accessible_has_role(long accessible, int role);
        boolean gtk_test_accessible_has_state(long accessible, int state);
        void gtk_test_register_all_types();
        void gtk_test_widget_wait_for_draw(long widget);
        long gtk_tree_create_row_drag_content(long tree_model, long path);
        void gtk_tree_row_reference_deleted(long proxy, long path);
        void gtk_tree_row_reference_inserted(long proxy, long path);
        void gtk_tree_row_reference_reordered(long proxy, long path, long iter, long new_order);
        long gtk_value_dup_expression(long value);
        long gtk_value_get_expression(long value);
        void gtk_value_set_expression(long value, long expression);
        void gtk_value_take_expression(long value, long expression);
    }

}
