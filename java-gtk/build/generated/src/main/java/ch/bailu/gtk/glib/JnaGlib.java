/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaGlib {

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnDataForeachFunc extends com.sun.jna.Callback {
        void invoke(int key_id, long data, long user_data);
    }

    @FunctionalInterface
    public interface OnSourceFunc extends com.sun.jna.Callback {
        boolean invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnSourceOnceFunc extends com.sun.jna.Callback {
        void invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnIOFunc extends com.sun.jna.Callback {
        boolean invoke(long source, int condition, long user_data);
    }

    @FunctionalInterface
    public interface OnLogFunc extends com.sun.jna.Callback {
        void invoke(long log_domain, int log_level, long message, long user_data);
    }

    @FunctionalInterface
    public interface OnCompareDataFunc extends com.sun.jna.Callback {
        int invoke(long a, long b, long user_data);
    }

    @FunctionalInterface
    public interface OnTestDataFunc extends com.sun.jna.Callback {
        void invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnTestFunc extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnTestFixtureFunc extends com.sun.jna.Callback {
        void invoke(long fixture, long user_data);
    }

    @FunctionalInterface
    public interface OnTestLogFatalFunc extends com.sun.jna.Callback {
        boolean invoke(long log_domain, int log_level, long message, long user_data);
    }

    @FunctionalInterface
    public interface OnUnixFDSourceFunc extends com.sun.jna.Callback {
        boolean invoke(int fd, int condition, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_access(long filename, int mode);
        long g_aligned_alloc(long n_blocks, long n_block_bytes, long alignment);
        long g_aligned_alloc0(long n_blocks, long n_block_bytes, long alignment);
        void g_aligned_free(long mem);
        int g_ascii_digit_value(byte c);
        long g_ascii_dtostr(long buffer, int buf_len, double d);
        long g_ascii_formatd(long buffer, int buf_len, long format, double d);
        int g_ascii_strcasecmp(long s1, long s2);
        long g_ascii_strdown(long str, long len);
        int g_ascii_strncasecmp(long s1, long s2, long n);
        long g_ascii_strup(long str, long len);
        byte g_ascii_tolower(byte c);
        byte g_ascii_toupper(byte c);
        int g_ascii_xdigit_value(byte c);
        void g_assertion_message(long domain, long file, int line, long func, long message);
        void g_assertion_message_cmpstr(long domain, long file, int line, long func, long expr, long arg1, long cmp, long arg2);
        void g_assertion_message_cmpstrv(long domain, long file, int line, long func, long expr, long arg1, long arg2, long first_wrong_idx);
        void g_assertion_message_error(long domain, long file, int line, long func, long expr, long error, int error_domain, int error_code);
        void g_assertion_message_expr(long domain, long file, int line, long func, long expr);
        boolean g_atomic_int_compare_and_exchange_full(long atomic, int oldval, int newval, long preval);
        int g_atomic_int_exchange(long atomic, int newval);
        long g_atomic_pointer_add(long atomic, long val);
        long g_atomic_pointer_and(long atomic, long val);
        boolean g_atomic_pointer_compare_and_exchange(long atomic, long oldval, long newval);
        boolean g_atomic_pointer_compare_and_exchange_full(long atomic, long oldval, long newval, long preval);
        long g_atomic_pointer_exchange(long atomic, long newval);
        long g_atomic_pointer_get(long atomic);
        long g_atomic_pointer_or(long atomic, long val);
        void g_atomic_pointer_set(long atomic, long newval);
        long g_atomic_pointer_xor(long atomic, long val);
        long g_atomic_rc_box_acquire(long mem_block);
        long g_atomic_rc_box_alloc(long block_size);
        long g_atomic_rc_box_alloc0(long block_size);
        long g_atomic_rc_box_dup(long block_size, long mem_block);
        long g_atomic_rc_box_get_size(long mem_block);
        void g_atomic_rc_box_release(long mem_block);
        void g_atomic_rc_box_release_full(long mem_block, com.sun.jna.Callback clear_func);
        long g_base64_encode_close(boolean break_lines, long out, long state, long save);
        int g_bit_nth_lsf(long mask, int nth_bit);
        int g_bit_nth_msf(long mask, int nth_bit);
        int g_bit_storage(long number);
        int g_bookmark_file_error_quark();
        long g_build_filename(long first_element, java.lang.Object... _elipse);
        long g_build_path(long separator, long first_element, java.lang.Object... _elipse);
        long g_byte_array_free_to_bytes(long array);
        long g_byte_array_new();
        void g_byte_array_unref(long array);
        long g_canonicalize_filename(long filename, long relative_to);
        int g_chdir(long path);
        long glib_check_version(int required_major, int required_minor, int required_micro);
        long g_checksum_type_get_length(int checksum_type);
        void g_clear_error(long _error);
        boolean g_close(int fd, long _error);
        long g_compute_checksum_for_bytes(int checksum_type, long data);
        long g_compute_checksum_for_string(int checksum_type, long str, long length);
        long g_compute_hmac_for_bytes(int digest_type, long key, long data);
        long g_convert(long str, long len, long to_codeset, long from_codeset, long bytes_read, long bytes_written, long _error);
        int g_convert_error_quark();
        long g_convert_with_fallback(long str, long len, long to_codeset, long from_codeset, long fallback, long bytes_read, long bytes_written, long _error);
        void g_dataset_destroy(long dataset_location);
        void g_dataset_foreach(long dataset_location, com.sun.jna.Callback func, long user_data);
        long g_dataset_id_get_data(long dataset_location, int key_id);
        long g_dataset_id_remove_no_notify(long dataset_location, int key_id);
        void g_dataset_id_set_data_full(long dataset_location, int key_id, long data, com.sun.jna.Callback destroy_func);
        long g_date_strftime(long s, long slen, long format, long date);
        boolean g_date_valid_julian(int julian_date);
        boolean g_date_valid_month(int month);
        boolean g_date_valid_weekday(int weekday);
        long g_dcgettext(long domain, long msgid, int category);
        long g_dgettext(long domain, long msgid);
        long g_dir_make_tmp(long tmpl, long _error);
        boolean g_direct_equal(long v1, long v2);
        int g_direct_hash(long v);
        long g_dngettext(long domain, long msgid, long msgid_plural, long n);
        boolean g_double_equal(long v1, long v2);
        int g_double_hash(long v);
        long g_dpgettext(long domain, long msgctxtid, long msgidoffset);
        long g_dpgettext2(long domain, long context, long msgid);
        int g_file_error_from_errno(int err_no);
        int g_file_error_quark();
        long g_file_read_link(long filename, long _error);
        boolean g_file_set_contents(long filename, long contents, long length, long _error);
        boolean g_file_set_contents_full(long filename, long contents, long length, int flags, int mode, long _error);
        boolean g_file_test(long filename, int test);
        long g_filename_display_basename(long filename);
        long g_filename_display_name(long filename);
        long g_filename_from_utf8(long utf8string, long len, long bytes_read, long bytes_written, long _error);
        long g_filename_to_uri(long filename, long hostname, long _error);
        long g_filename_to_utf8(long opsysstring, long len, long bytes_read, long bytes_written, long _error);
        long g_find_program_in_path(long program);
        long g_format_size(long size);
        long g_format_size_full(long size, int flags);
        void g_free(long mem);
        long g_get_application_name();
        boolean g_get_charset(long charset);
        long g_get_codeset();
        boolean g_get_console_charset(long charset);
        long g_get_current_dir();
        long g_get_home_dir();
        long g_get_host_name();
        long g_get_monotonic_time();
        int g_get_num_processors();
        long g_get_os_info(long key_name);
        long g_get_prgname();
        long g_get_real_name();
        long g_get_real_time();
        long g_get_tmp_dir();
        long g_get_user_cache_dir();
        long g_get_user_config_dir();
        long g_get_user_data_dir();
        long g_get_user_name();
        long g_get_user_runtime_dir();
        long g_get_user_special_dir(int directory);
        long g_get_user_state_dir();
        long g_getenv(long variable);
        boolean g_hash_table_add(long hash_table, long key);
        boolean g_hash_table_contains(long hash_table, long key);
        void g_hash_table_destroy(long hash_table);
        boolean g_hash_table_insert(long hash_table, long key, long value);
        long g_hash_table_lookup(long hash_table, long key);
        long g_hash_table_new_similar(long other_hash_table);
        boolean g_hash_table_remove(long hash_table, long key);
        void g_hash_table_remove_all(long hash_table);
        boolean g_hash_table_replace(long hash_table, long key, long value);
        int g_hash_table_size(long hash_table);
        boolean g_hash_table_steal(long hash_table, long key);
        void g_hash_table_steal_all(long hash_table);
        void g_hash_table_unref(long hash_table);
        boolean g_hook_destroy(long hook_list, long hook_id);
        void g_hook_destroy_link(long hook_list, long hook);
        void g_hook_free(long hook_list, long hook);
        void g_hook_insert_before(long hook_list, long sibling, long hook);
        void g_hook_prepend(long hook_list, long hook);
        void g_hook_unref(long hook_list, long hook);
        boolean g_hostname_is_ascii_encoded(long hostname);
        boolean g_hostname_is_ip_address(long hostname);
        boolean g_hostname_is_non_ascii(long hostname);
        long g_hostname_to_ascii(long hostname);
        long g_hostname_to_unicode(long hostname);
        int g_idle_add(com.sun.jna.Callback function, long data);
        int g_idle_add_full(int priority, com.sun.jna.Callback function, long data, com.sun.jna.Callback notify);
        int g_idle_add_once(com.sun.jna.Callback function, long data);
        boolean g_idle_remove_by_data(long data);
        long g_idle_source_new();
        boolean g_int64_equal(long v1, long v2);
        int g_int64_hash(long v);
        boolean g_int_equal(long v1, long v2);
        int g_int_hash(long v);
        long g_intern_static_string(long string);
        long g_intern_string(long string);
        int g_io_add_watch(long channel, int condition, com.sun.jna.Callback func, long user_data);
        int g_io_add_watch_full(long channel, int priority, int condition, com.sun.jna.Callback func, long user_data, com.sun.jna.Callback notify);
        int g_io_channel_error_from_errno(int en);
        int g_io_channel_error_quark();
        long g_io_create_watch(long channel, int condition);
        int g_key_file_error_quark();
        long g_locale_from_utf8(long utf8string, long len, long bytes_read, long bytes_written, long _error);
        long g_locale_to_utf8(long opsysstring, long len, long bytes_read, long bytes_written, long _error);
        void g_log(long log_domain, int log_level, long format, java.lang.Object... _elipse);
        void g_log_default_handler(long log_domain, int log_level, long message, long unused_data);
        boolean g_log_get_debug_enabled();
        void g_log_remove_handler(long log_domain, int handler_id);
        int g_log_set_always_fatal(int fatal_mask);
        void g_log_set_debug_enabled(boolean enabled);
        int g_log_set_fatal_mask(long log_domain, int fatal_mask);
        int g_log_set_handler(long log_domain, int log_levels, com.sun.jna.Callback log_func, long user_data);
        int g_log_set_handler_full(long log_domain, int log_levels, com.sun.jna.Callback log_func, long user_data, com.sun.jna.Callback destroy);
        void g_log_structured(long log_domain, int log_level, java.lang.Object... _elipse);
        void g_log_structured_standard(long log_domain, int log_level, long file, long line, long func, long message_format, java.lang.Object... _elipse);
        void g_log_variant(long log_domain, int log_level, long fields);
        void g_log_writer_default_set_use_stderr(boolean use_stderr);
        boolean g_log_writer_default_would_drop(int log_level, long log_domain);
        boolean g_log_writer_is_journald(int output_fd);
        boolean g_log_writer_supports_color(int output_fd);
        long g_main_context_default();
        long g_main_context_get_thread_default();
        long g_main_context_ref_thread_default();
        long g_main_current_source();
        int g_main_depth();
        long g_malloc(long n_bytes);
        long g_malloc0(long n_bytes);
        long g_malloc0_n(long n_blocks, long n_block_bytes);
        long g_malloc_n(long n_blocks, long n_block_bytes);
        int g_markup_error_quark();
        long g_markup_escape_text(long text, long length);
        long g_markup_printf_escaped(long format, java.lang.Object... _elipse);
        long g_memdup2(long mem, long byte_size);
        int g_mkdir_with_parents(long pathname, int mode);
        long g_mkdtemp(long tmpl);
        long g_mkdtemp_full(long tmpl, int mode);
        int g_mkstemp(long tmpl);
        int g_mkstemp_full(long tmpl, int flags, int mode);
        int g_number_parser_error_quark();
        void g_on_error_query(long prg_name);
        void g_on_error_stack_trace(long prg_name);
        boolean g_once_init_enter(long location);
        void g_once_init_leave(long location, long result);
        int g_option_error_quark();
        long g_path_get_basename(long file_name);
        long g_path_get_dirname(long file_name);
        boolean g_path_is_absolute(long file_name);
        long g_path_skip_root(long file_name);
        boolean g_pattern_match_simple(long pattern, long string);
        void g_pointer_bit_lock(long address, int lock_bit);
        boolean g_pointer_bit_trylock(long address, int lock_bit);
        void g_pointer_bit_unlock(long address, int lock_bit);
        int g_poll(long fds, int nfds, int timeout);
        void g_print(long format, java.lang.Object... _elipse);
        void g_printerr(long format, java.lang.Object... _elipse);
        int g_printf(long format, java.lang.Object... _elipse);
        void g_qsort_with_data(long pbase, int total_elems, long size, com.sun.jna.Callback compare_func, long user_data);
        int g_quark_from_static_string(long string);
        int g_quark_from_string(long string);
        long g_quark_to_string(int quark);
        int g_quark_try_string(long string);
        double g_random_double();
        double g_random_double_range(double begin, double end);
        int g_random_int();
        int g_random_int_range(int begin, int end);
        void g_random_set_seed(int seed);
        long g_rc_box_acquire(long mem_block);
        long g_rc_box_alloc(long block_size);
        long g_rc_box_alloc0(long block_size);
        long g_rc_box_dup(long block_size, long mem_block);
        long g_rc_box_get_size(long mem_block);
        void g_rc_box_release(long mem_block);
        void g_rc_box_release_full(long mem_block, com.sun.jna.Callback clear_func);
        long g_realloc(long mem, long n_bytes);
        long g_realloc_n(long mem, long n_blocks, long n_block_bytes);
        long g_ref_string_acquire(long str);
        long g_ref_string_length(long str);
        long g_ref_string_new(long str);
        long g_ref_string_new_intern(long str);
        long g_ref_string_new_len(long str, long len);
        void g_ref_string_release(long str);
        boolean g_regex_check_replacement(long replacement, long has_references, long _error);
        int g_regex_error_quark();
        long g_regex_escape_nul(long string, int length);
        long g_regex_escape_string(long string, int length);
        boolean g_regex_match_simple(long pattern, long string, int compile_options, int match_options);
        void g_reload_user_special_dirs_cache();
        void g_return_if_fail_warning(long log_domain, long pretty_function, long expression);
        int g_rmdir(long filename);
        long g_sequence_get(long iter);
        long g_sequence_insert_before(long iter, long data);
        void g_sequence_move(long src, long dest);
        void g_sequence_move_range(long dest, long begin, long end);
        long g_sequence_range_get_midpoint(long begin, long end);
        void g_sequence_remove(long iter);
        void g_sequence_remove_range(long begin, long end);
        void g_sequence_set(long iter, long data);
        void g_sequence_swap(long a, long b);
        void g_set_application_name(long application_name);
        void g_set_prgname(long prgname);
        boolean g_setenv(long variable, long value, boolean overwrite);
        int g_shell_error_quark();
        long g_shell_quote(long unquoted_string);
        long g_shell_unquote(long quoted_string, long _error);
        long g_slice_alloc(long block_size);
        long g_slice_alloc0(long block_size);
        long g_slice_copy(long block_size, long mem_block);
        void g_slice_free1(long block_size, long mem_block);
        void g_slice_free_chain_with_offset(long block_size, long mem_chain, long next_offset);
        long g_slice_get_config(int ckey);
        void g_slice_set_config(int ckey, long value);
        int g_snprintf(long string, long n, long format, java.lang.Object... _elipse);
        boolean g_source_remove(int tag);
        boolean g_source_remove_by_funcs_user_data(long funcs, long user_data);
        boolean g_source_remove_by_user_data(long user_data);
        void g_source_set_name_by_id(int tag, long name);
        int g_spaced_primes_closest(int num);
        boolean g_spawn_check_wait_status(int wait_status, long _error);
        boolean g_spawn_command_line_async(long command_line, long _error);
        int g_spawn_error_quark();
        int g_spawn_exit_error_quark();
        int g_sprintf(long string, long format, java.lang.Object... _elipse);
        long g_stpcpy(long dest, long src);
        boolean g_str_equal(long v1, long v2);
        boolean g_str_has_prefix(long str, long prefix);
        boolean g_str_has_suffix(long str, long suffix);
        int g_str_hash(long v);
        boolean g_str_is_ascii(long str);
        boolean g_str_match_string(long search_term, long potential_hit, boolean accept_alternates);
        long g_str_to_ascii(long str, long from_locale);
        long g_strcanon(long string, long valid_chars, byte substitutor);
        long g_strchomp(long string);
        long g_strchug(long string);
        int g_strcmp0(long str1, long str2);
        long g_strcompress(long source);
        long g_strconcat(long string1, java.lang.Object... _elipse);
        long g_strdelimit(long string, long delimiters, byte new_delimiter);
        long g_strdup(long str);
        long g_strdup_printf(long format, java.lang.Object... _elipse);
        long g_strerror(int errnum);
        long g_strescape(long source, long exceptions);
        long g_strip_context(long msgid, long msgval);
        long g_strjoin(long separator, java.lang.Object... _elipse);
        long g_strlcat(long dest, long src, long dest_size);
        long g_strlcpy(long dest, long src, long dest_size);
        long g_strndup(long str, long n);
        long g_strnfill(long length, byte fill_char);
        long g_strreverse(long string);
        long g_strrstr(long haystack, long needle);
        long g_strrstr_len(long haystack, long haystack_len, long needle);
        long g_strsignal(int signum);
        long g_strstr_len(long haystack, long haystack_len, long needle);
        long g_strv_get_type();
        void g_test_add_data_func(long testpath, long test_data, com.sun.jna.Callback test_func);
        void g_test_add_data_func_full(long testpath, long test_data, com.sun.jna.Callback test_func, com.sun.jna.Callback data_free_func);
        void g_test_add_func(long testpath, com.sun.jna.Callback test_func);
        void g_test_add_vtable(long testpath, long data_size, long test_data, com.sun.jna.Callback data_setup, com.sun.jna.Callback data_test, com.sun.jna.Callback data_teardown);
        void g_test_assert_expected_messages_internal(long domain, long file, int line, long func);
        void g_test_bug(long bug_uri_snippet);
        void g_test_bug_base(long uri_pattern);
        long g_test_build_filename(int file_type, long first_path, java.lang.Object... _elipse);
        long g_test_create_case(long test_name, long data_size, long test_data, com.sun.jna.Callback data_setup, com.sun.jna.Callback data_test, com.sun.jna.Callback data_teardown);
        long g_test_create_suite(long suite_name);
        void g_test_expect_message(long log_domain, int log_level, long pattern);
        void g_test_fail();
        void g_test_fail_printf(long format, java.lang.Object... _elipse);
        boolean g_test_failed();
        long g_test_get_dir(int file_type);
        long g_test_get_filename(int file_type, long first_path, java.lang.Object... _elipse);
        long g_test_get_path();
        long g_test_get_root();
        void g_test_incomplete(long msg);
        void g_test_incomplete_printf(long format, java.lang.Object... _elipse);
        void g_test_log_set_fatal_handler(com.sun.jna.Callback log_func, long user_data);
        long g_test_log_type_name(int log_type);
        void g_test_maximized_result(double maximized_quantity, long format, java.lang.Object... _elipse);
        void g_test_message(long format, java.lang.Object... _elipse);
        void g_test_minimized_result(double minimized_quantity, long format, java.lang.Object... _elipse);
        void g_test_queue_destroy(com.sun.jna.Callback destroy_func, long destroy_data);
        void g_test_queue_free(long gfree_pointer);
        double g_test_rand_double();
        double g_test_rand_double_range(double range_start, double range_end);
        int g_test_rand_int();
        int g_test_rand_int_range(int begin, int end);
        int g_test_run();
        int g_test_run_suite(long suite);
        void g_test_set_nonfatal_assertions();
        void g_test_skip(long msg);
        void g_test_skip_printf(long format, java.lang.Object... _elipse);
        boolean g_test_subprocess();
        void g_test_summary(long summary);
        double g_test_timer_elapsed();
        double g_test_timer_last();
        void g_test_timer_start();
        void g_test_trap_assertions(long domain, long file, int line, long func, long assertion_flags, long pattern);
        boolean g_test_trap_has_passed();
        boolean g_test_trap_reached_timeout();
        void g_test_trap_subprocess(long test_path, long usec_timeout, int test_flags);
        int g_thread_error_quark();
        void g_thread_exit(long retval);
        int g_thread_pool_get_max_idle_time();
        int g_thread_pool_get_max_unused_threads();
        int g_thread_pool_get_num_unused_threads();
        void g_thread_pool_set_max_idle_time(int interval);
        void g_thread_pool_set_max_unused_threads(int max_threads);
        void g_thread_pool_stop_unused_threads();
        long g_thread_self();
        void g_thread_yield();
        int g_timeout_add(int interval, com.sun.jna.Callback function, long data);
        int g_timeout_add_full(int priority, int interval, com.sun.jna.Callback function, long data, com.sun.jna.Callback notify);
        int g_timeout_add_once(int interval, com.sun.jna.Callback function, long data);
        int g_timeout_add_seconds(int interval, com.sun.jna.Callback function, long data);
        int g_timeout_add_seconds_full(int priority, int interval, com.sun.jna.Callback function, long data, com.sun.jna.Callback notify);
        long g_timeout_source_new(int interval);
        long g_timeout_source_new_seconds(int interval);
        long g_try_malloc(long n_bytes);
        long g_try_malloc0(long n_bytes);
        long g_try_malloc0_n(long n_blocks, long n_block_bytes);
        long g_try_malloc_n(long n_blocks, long n_block_bytes);
        long g_try_realloc(long mem, long n_bytes);
        long g_try_realloc_n(long mem, long n_blocks, long n_block_bytes);
        int g_unichar_break_type(byte c);
        int g_unichar_combining_class(byte uc);
        int g_unichar_digit_value(byte c);
        int g_unichar_get_script(byte ch);
        boolean g_unichar_isalnum(byte c);
        boolean g_unichar_isalpha(byte c);
        boolean g_unichar_iscntrl(byte c);
        boolean g_unichar_isdefined(byte c);
        boolean g_unichar_isdigit(byte c);
        boolean g_unichar_isgraph(byte c);
        boolean g_unichar_islower(byte c);
        boolean g_unichar_ismark(byte c);
        boolean g_unichar_isprint(byte c);
        boolean g_unichar_ispunct(byte c);
        boolean g_unichar_isspace(byte c);
        boolean g_unichar_istitle(byte c);
        boolean g_unichar_isupper(byte c);
        boolean g_unichar_iswide(byte c);
        boolean g_unichar_iswide_cjk(byte c);
        boolean g_unichar_isxdigit(byte c);
        boolean g_unichar_iszerowidth(byte c);
        int g_unichar_to_utf8(byte c, long outbuf);
        byte g_unichar_tolower(byte c);
        byte g_unichar_totitle(byte c);
        byte g_unichar_toupper(byte c);
        int g_unichar_type(byte c);
        boolean g_unichar_validate(byte ch);
        int g_unichar_xdigit_value(byte c);
        int g_unicode_script_from_iso15924(int iso15924);
        int g_unicode_script_to_iso15924(int script);
        int g_unix_error_quark();
        int g_unix_fd_add(int fd, int condition, com.sun.jna.Callback function, long user_data);
        int g_unix_fd_add_full(int priority, int fd, int condition, com.sun.jna.Callback function, long user_data, com.sun.jna.Callback notify);
        long g_unix_fd_source_new(int fd, int condition);
        boolean g_unix_open_pipe(long fds, int flags, long _error);
        boolean g_unix_set_fd_nonblocking(int fd, boolean nonblock, long _error);
        int g_unix_signal_add(int signum, com.sun.jna.Callback handler, long user_data);
        int g_unix_signal_add_full(int priority, int signum, com.sun.jna.Callback handler, long user_data, com.sun.jna.Callback notify);
        long g_unix_signal_source_new(int signum);
        int g_unlink(long filename);
        void g_unsetenv(long variable);
        long g_uri_build(int flags, long scheme, long userinfo, long host, int port, long path, long query, long fragment);
        long g_uri_build_with_user(int flags, long scheme, long user, long password, long auth_params, long host, int port, long path, long query, long fragment);
        int g_uri_error_quark();
        long g_uri_escape_string(long unescaped, long reserved_chars_allowed, boolean allow_utf8);
        boolean g_uri_is_valid(long uri_string, int flags, long _error);
        long g_uri_join(int flags, long scheme, long userinfo, long host, int port, long path, long query, long fragment);
        long g_uri_join_with_user(int flags, long scheme, long user, long password, long auth_params, long host, int port, long path, long query, long fragment);
        long g_uri_parse(long uri_string, int flags, long _error);
        long g_uri_parse_params(long params, long length, long separators, int flags, long _error);
        long g_uri_parse_scheme(long uri);
        long g_uri_peek_scheme(long uri);
        long g_uri_resolve_relative(long base_uri_string, long uri_ref, int flags, long _error);
        long g_uri_unescape_bytes(long escaped_string, long length, long illegal_characters, long _error);
        long g_uri_unescape_segment(long escaped_string, long escaped_string_end, long illegal_characters);
        long g_uri_unescape_string(long escaped_string, long illegal_characters);
        void g_usleep(long microseconds);
        long g_utf8_casefold(long str, long len);
        int g_utf8_collate(long str1, long str2);
        long g_utf8_collate_key(long str, long len);
        long g_utf8_collate_key_for_filename(long str, long len);
        long g_utf8_find_next_char(long p, long end);
        long g_utf8_find_prev_char(long str, long p);
        byte g_utf8_get_char(long p);
        byte g_utf8_get_char_validated(long p, long max_len);
        long g_utf8_make_valid(long str, long len);
        long g_utf8_normalize(long str, long len, int mode);
        long g_utf8_offset_to_pointer(long str, long offset);
        long g_utf8_pointer_to_offset(long str, long pos);
        long g_utf8_prev_char(long p);
        long g_utf8_strchr(long p, long len, byte c);
        long g_utf8_strdown(long str, long len);
        long g_utf8_strlen(long p, long max);
        long g_utf8_strncpy(long dest, long src, long n);
        long g_utf8_strrchr(long p, long len, byte c);
        long g_utf8_strreverse(long str, long len);
        long g_utf8_strup(long str, long len);
        long g_utf8_substring(long str, long start_pos, long end_pos);
        boolean g_uuid_string_is_valid(long str);
        long g_uuid_string_random();
        long g_variant_get_gtype();
        boolean g_variant_is_object_path(long string);
        boolean g_variant_is_signature(long string);
        long g_variant_parse_error_print_context(long error, long source_str);
        int g_variant_parse_error_quark();
        long g_variant_type_checked_(long arg0);
        long g_variant_type_string_get_depth_(long type_string);
        boolean g_variant_type_string_is_valid(long type_string);
        void g_warn_message(long domain, long file, int line, long func, long warnexpr);
    }

}
