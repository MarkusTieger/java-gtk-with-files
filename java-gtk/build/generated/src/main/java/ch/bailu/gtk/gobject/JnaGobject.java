/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaGobject {

    @FunctionalInterface
    public interface OnBoxedCopyFunc extends com.sun.jna.Callback {
        long invoke(long boxed);
    }

    @FunctionalInterface
    public interface OnBoxedFreeFunc extends com.sun.jna.Callback {
        void invoke(long boxed);
    }

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnClosureNotify extends com.sun.jna.Callback {
        void invoke(long data, long closure);
    }

    @FunctionalInterface
    public interface OnTypeClassCacheFunc extends com.sun.jna.Callback {
        boolean invoke(long cache_data, long g_class);
    }

    @FunctionalInterface
    public interface OnTypeInterfaceCheckFunc extends com.sun.jna.Callback {
        void invoke(long check_data, long g_iface);
    }

    @FunctionalInterface
    public interface OnClassInitFunc extends com.sun.jna.Callback {
        void invoke(long g_class, long class_data);
    }

    @FunctionalInterface
    public interface OnInstanceInitFunc extends com.sun.jna.Callback {
        void invoke(long instance, long g_class);
    }

    @FunctionalInterface
    public interface OnValueTransform extends com.sun.jna.Callback {
        void invoke(long src_value, long dest_value);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_boxed_copy(long boxed_type, long src_boxed);
        void g_boxed_free(long boxed_type, long boxed);
        long g_boxed_type_register_static(long name, com.sun.jna.Callback boxed_copy, com.sun.jna.Callback boxed_free);
        void g_cclosure_marshal_BOOLEAN__BOXED_BOXED(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_BOOLEAN__FLAGS(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_STRING__OBJECT_POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__BOOLEAN(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__BOXED(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__CHAR(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__DOUBLE(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__ENUM(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__FLAGS(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__FLOAT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__INT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__LONG(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__OBJECT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__PARAM(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__STRING(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UCHAR(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UINT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__UINT_POINTER(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__ULONG(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__VARIANT(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_VOID__VOID(long closure, long return_value, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        void g_cclosure_marshal_generic(long closure, long return_gvalue, int n_param_values, long param_values, long invocation_hint, long marshal_data);
        long g_cclosure_new(com.sun.jna.Callback callback_func, long user_data, com.sun.jna.Callback destroy_data);
        long g_cclosure_new_object(com.sun.jna.Callback callback_func, long object);
        long g_cclosure_new_object_swap(com.sun.jna.Callback callback_func, long object);
        long g_cclosure_new_swap(com.sun.jna.Callback callback_func, long user_data, com.sun.jna.Callback destroy_data);
        void g_enum_complete_type_info(long g_enum_type, long info, long const_values);
        long g_enum_get_value(long enum_class, int value);
        long g_enum_get_value_by_name(long enum_class, long name);
        long g_enum_get_value_by_nick(long enum_class, long nick);
        long g_enum_register_static(long name, long const_static_values);
        long g_enum_to_string(long g_enum_type, int value);
        void g_flags_complete_type_info(long g_flags_type, long info, long const_values);
        long g_flags_get_first_value(long flags_class, int value);
        long g_flags_get_value_by_name(long flags_class, long name);
        long g_flags_get_value_by_nick(long flags_class, long nick);
        long g_flags_register_static(long name, long const_static_values);
        long g_flags_to_string(long flags_type, int value);
        long g_gtype_get_type();
        long g_param_spec_boolean(long name, long nick, long blurb, boolean default_value, int flags);
        long g_param_spec_boxed(long name, long nick, long blurb, long boxed_type, int flags);
        long g_param_spec_char(long name, long nick, long blurb, int minimum, int maximum, int default_value, int flags);
        long g_param_spec_double(long name, long nick, long blurb, double minimum, double maximum, double default_value, int flags);
        long g_param_spec_enum(long name, long nick, long blurb, long enum_type, int default_value, int flags);
        long g_param_spec_flags(long name, long nick, long blurb, long flags_type, int default_value, int flags);
        long g_param_spec_float(long name, long nick, long blurb, float minimum, float maximum, float default_value, int flags);
        long g_param_spec_gtype(long name, long nick, long blurb, long is_a_type, int flags);
        long g_param_spec_int(long name, long nick, long blurb, int minimum, int maximum, int default_value, int flags);
        long g_param_spec_int64(long name, long nick, long blurb, long minimum, long maximum, long default_value, int flags);
        long g_param_spec_long(long name, long nick, long blurb, long minimum, long maximum, long default_value, int flags);
        long g_param_spec_object(long name, long nick, long blurb, long object_type, int flags);
        long g_param_spec_override(long name, long overridden);
        long g_param_spec_param(long name, long nick, long blurb, long param_type, int flags);
        long g_param_spec_pointer(long name, long nick, long blurb, int flags);
        long g_param_spec_string(long name, long nick, long blurb, long default_value, int flags);
        long g_param_spec_uchar(long name, long nick, long blurb, int minimum, int maximum, int default_value, int flags);
        long g_param_spec_uint(long name, long nick, long blurb, int minimum, int maximum, int default_value, int flags);
        long g_param_spec_uint64(long name, long nick, long blurb, long minimum, long maximum, long default_value, int flags);
        long g_param_spec_ulong(long name, long nick, long blurb, long minimum, long maximum, long default_value, int flags);
        long g_param_spec_unichar(long name, long nick, long blurb, byte default_value, int flags);
        long g_param_spec_value_array(long name, long nick, long blurb, long element_spec, int flags);
        long g_param_spec_variant(long name, long nick, long blurb, long type, long default_value, int flags);
        long g_param_type_register_static(long name, long pspec_info);
        boolean g_param_value_convert(long pspec, long src_value, long dest_value, boolean strict_validation);
        boolean g_param_value_defaults(long pspec, long value);
        boolean g_param_value_is_valid(long pspec, long value);
        void g_param_value_set_default(long pspec, long value);
        boolean g_param_value_validate(long pspec, long value);
        int g_param_values_cmp(long pspec, long value1, long value2);
        long g_pointer_type_register_static(long name);
        boolean g_signal_accumulator_first_wins(long ihint, long return_accu, long handler_return, long dummy);
        boolean g_signal_accumulator_true_handled(long ihint, long return_accu, long handler_return, long dummy);
        void g_signal_chain_from_overridden_handler(long instance, java.lang.Object... _elipse);
        long g_signal_connect_closure(long instance, long detailed_signal, long closure, boolean after);
        long g_signal_connect_closure_by_id(long instance, int signal_id, int detail, long closure, boolean after);
        long g_signal_connect_data(long instance, long detailed_signal, com.sun.jna.Callback c_handler, long data, com.sun.jna.Callback destroy_data, int connect_flags);
        long g_signal_connect_object(long instance, long detailed_signal, com.sun.jna.Callback c_handler, long gobject, int connect_flags);
        void g_signal_emit(long instance, int signal_id, int detail, java.lang.Object... _elipse);
        void g_signal_emit_by_name(long instance, long detailed_signal, java.lang.Object... _elipse);
        long g_signal_get_invocation_hint(long instance);
        void g_signal_handler_block(long instance, long handler_id);
        void g_signal_handler_disconnect(long instance, long handler_id);
        long g_signal_handler_find(long instance, int mask, int signal_id, int detail, long closure, long func, long data);
        boolean g_signal_handler_is_connected(long instance, long handler_id);
        void g_signal_handler_unblock(long instance, long handler_id);
        int g_signal_handlers_block_matched(long instance, int mask, int signal_id, int detail, long closure, long func, long data);
        void g_signal_handlers_destroy(long instance);
        int g_signal_handlers_disconnect_matched(long instance, int mask, int signal_id, int detail, long closure, long func, long data);
        int g_signal_handlers_unblock_matched(long instance, int mask, int signal_id, int detail, long closure, long func, long data);
        boolean g_signal_has_handler_pending(long instance, int signal_id, int detail, boolean may_be_blocked);
        boolean g_signal_is_valid_name(long name);
        int g_signal_lookup(long name, long itype);
        long g_signal_name(int signal_id);
        void g_signal_override_class_closure(int signal_id, long instance_type, long class_closure);
        void g_signal_override_class_handler(long signal_name, long instance_type, com.sun.jna.Callback class_handler);
        void g_signal_query(int signal_id, long query);
        void g_signal_remove_emission_hook(int signal_id, long hook_id);
        void g_signal_stop_emission(long instance, int signal_id, int detail);
        void g_signal_stop_emission_by_name(long instance, long detailed_signal);
        long g_signal_type_cclosure_new(long itype, int struct_offset);
        void g_source_set_closure(long source, long closure);
        void g_source_set_dummy_callback(long source);
        long g_strdup_value_contents(long value);
        void g_type_add_class_cache_func(long cache_data, com.sun.jna.Callback cache_func);
        void g_type_add_class_private(long class_type, long private_size);
        int g_type_add_instance_private(long class_type, long private_size);
        void g_type_add_interface_check(long check_data, com.sun.jna.Callback check_func);
        void g_type_add_interface_dynamic(long instance_type, long interface_type, long plugin);
        void g_type_add_interface_static(long instance_type, long interface_type, long info);
        long g_type_check_class_cast(long g_class, long is_a_type);
        boolean g_type_check_class_is_a(long g_class, long is_a_type);
        boolean g_type_check_instance(long instance);
        long g_type_check_instance_cast(long instance, long iface_type);
        boolean g_type_check_instance_is_a(long instance, long iface_type);
        boolean g_type_check_instance_is_fundamentally_a(long instance, long fundamental_type);
        boolean g_type_check_is_value_type(long type);
        boolean g_type_check_value(long value);
        boolean g_type_check_value_holds(long value, long type);
        void g_type_class_adjust_private_offset(long g_class, long private_size_or_offset);
        long g_type_class_peek(long type);
        long g_type_class_peek_static(long type);
        long g_type_class_ref(long type);
        long g_type_create_instance(long type);
        long g_type_default_interface_peek(long g_type);
        long g_type_default_interface_ref(long g_type);
        void g_type_default_interface_unref(long g_iface);
        int g_type_depth(long type);
        void g_type_ensure(long type);
        void g_type_free_instance(long instance);
        long g_type_from_name(long name);
        long g_type_fundamental(long type_id);
        long g_type_fundamental_next();
        int g_type_get_instance_count(long type);
        long g_type_get_plugin(long type);
        long g_type_get_qdata(long type, int quark);
        int g_type_get_type_registration_serial();
        void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);
        long g_type_interface_get_plugin(long instance_type, long interface_type);
        long g_type_interface_instantiatable_prerequisite(long interface_type);
        long g_type_interface_peek(long instance_class, long iface_type);
        boolean g_type_is_a(long type, long is_a_type);
        long g_type_name(long type);
        long g_type_name_from_class(long g_class);
        long g_type_name_from_instance(long instance);
        long g_type_next_base(long leaf_type, long root_type);
        long g_type_parent(long type);
        int g_type_qname(long type);
        void g_type_query(long type, long query);
        long g_type_register_dynamic(long parent_type, long type_name, long plugin, int flags);
        long g_type_register_fundamental(long type_id, long type_name, long info, long finfo, int flags);
        long g_type_register_static(long parent_type, long type_name, long info, int flags);
        long g_type_register_static_simple(long parent_type, long type_name, int class_size, com.sun.jna.Callback class_init, int instance_size, com.sun.jna.Callback instance_init, int flags);
        void g_type_remove_class_cache_func(long cache_data, com.sun.jna.Callback cache_func);
        void g_type_remove_interface_check(long check_data, com.sun.jna.Callback check_func);
        void g_type_set_qdata(long type, int quark, long data);
        boolean g_type_test_flags(long type, int flags);
        long g_type_value_table_peek(long type);
        void g_value_register_transform_func(long src_type, long dest_type, com.sun.jna.Callback transform_func);
        boolean g_value_type_compatible(long src_type, long dest_type);
        boolean g_value_type_transformable(long src_type, long dest_type);
    }

}
