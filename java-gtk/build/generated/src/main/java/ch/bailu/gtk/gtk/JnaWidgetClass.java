/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWidgetClass {

    @FunctionalInterface
    public interface OnShortcutFunc extends com.sun.jna.Callback {
        boolean invoke(long widget, long args, long user_data);
    }

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnWidgetActionActivateFunc extends com.sun.jna.Callback {
        void invoke(long widget, long action_name, long parameter);
    }

    @FunctionalInterface
    public interface OnShow extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnHide extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnMap extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnUnmap extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnRealize extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnUnrealize extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnRoot extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnUnroot extends com.sun.jna.Callback {
        void invoke(long widget);
    }

    @FunctionalInterface
    public interface OnSizeAllocate extends com.sun.jna.Callback {
        void invoke(long widget, int width, int height, int baseline);
    }

    @FunctionalInterface
    public interface OnStateFlagsChanged extends com.sun.jna.Callback {
        void invoke(long widget, int previous_state_flags);
    }

    @FunctionalInterface
    public interface OnDirectionChanged extends com.sun.jna.Callback {
        void invoke(long widget, int previous_direction);
    }

    @FunctionalInterface
    public interface OnGetRequestMode extends com.sun.jna.Callback {
        int invoke(long widget);
    }

    @FunctionalInterface
    public interface OnMeasure extends com.sun.jna.Callback {
        void invoke(long widget, int orientation, int for_size, long minimum, long natural, long minimum_baseline, long natural_baseline);
    }

    @FunctionalInterface
    public interface OnMnemonicActivate extends com.sun.jna.Callback {
        boolean invoke(long widget, boolean group_cycling);
    }

    @FunctionalInterface
    public interface OnGrabFocus extends com.sun.jna.Callback {
        boolean invoke(long widget);
    }

    @FunctionalInterface
    public interface OnFocus extends com.sun.jna.Callback {
        boolean invoke(long widget, int direction);
    }

    @FunctionalInterface
    public interface OnSetFocusChild extends com.sun.jna.Callback {
        void invoke(long widget, long child);
    }

    @FunctionalInterface
    public interface OnMoveFocus extends com.sun.jna.Callback {
        void invoke(long widget, int direction);
    }

    @FunctionalInterface
    public interface OnKeynavFailed extends com.sun.jna.Callback {
        boolean invoke(long widget, int direction);
    }

    @FunctionalInterface
    public interface OnQueryTooltip extends com.sun.jna.Callback {
        boolean invoke(long widget, int x, int y, boolean keyboard_tooltip, long tooltip);
    }

    @FunctionalInterface
    public interface OnComputeExpand extends com.sun.jna.Callback {
        void invoke(long widget, long hexpand_p, long vexpand_p);
    }

    @FunctionalInterface
    public interface OnCssChanged extends com.sun.jna.Callback {
        void invoke(long widget, long change);
    }

    @FunctionalInterface
    public interface OnSystemSettingChanged extends com.sun.jna.Callback {
        void invoke(long widget, int settings);
    }

    @FunctionalInterface
    public interface OnSnapshot extends com.sun.jna.Callback {
        void invoke(long widget, long snapshot);
    }

    @FunctionalInterface
    public interface OnContains extends com.sun.jna.Callback {
        boolean invoke(long widget, double x, double y);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("WidgetClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({WidgetClass.PARENT_CLASS, WidgetClass.SHOW, WidgetClass.HIDE, WidgetClass.MAP, WidgetClass.UNMAP, WidgetClass.REALIZE, WidgetClass.UNREALIZE, WidgetClass.ROOT, WidgetClass.UNROOT, WidgetClass.SIZE_ALLOCATE, WidgetClass.STATE_FLAGS_CHANGED, WidgetClass.DIRECTION_CHANGED, WidgetClass.GET_REQUEST_MODE, WidgetClass.MEASURE, WidgetClass.MNEMONIC_ACTIVATE, WidgetClass.GRAB_FOCUS, WidgetClass.FOCUS, WidgetClass.SET_FOCUS_CHILD, WidgetClass.MOVE_FOCUS, WidgetClass.KEYNAV_FAILED, WidgetClass.QUERY_TOOLTIP, WidgetClass.COMPUTE_EXPAND, WidgetClass.CSS_CHANGED, WidgetClass.SYSTEM_SETTING_CHANGED, WidgetClass.SNAPSHOT, WidgetClass.CONTAINS, WidgetClass.PRIV})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.InitiallyUnownedClass.getInstanceSize()];
        public OnShow show;
        public OnHide hide;
        public OnMap map;
        public OnUnmap unmap;
        public OnRealize realize;
        public OnUnrealize unrealize;
        public OnRoot root;
        public OnUnroot unroot;
        public OnSizeAllocate size_allocate;
        public OnStateFlagsChanged state_flags_changed;
        public OnDirectionChanged direction_changed;
        public OnGetRequestMode get_request_mode;
        public OnMeasure measure;
        public OnMnemonicActivate mnemonic_activate;
        public OnGrabFocus grab_focus;
        public OnFocus focus;
        public OnSetFocusChild set_focus_child;
        public OnMoveFocus move_focus;
        public OnKeynavFailed keynav_failed;
        public OnQueryTooltip query_tooltip;
        public OnComputeExpand compute_expand;
        public OnCssChanged css_changed;
        public OnSystemSettingChanged system_setting_changed;
        public OnSnapshot snapshot;
        public OnContains contains;
        public long priv;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_widget_class_add_binding(long _self, int keyval, int mods, com.sun.jna.Callback callback, long format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_binding(long _self, int keyval, int mods, com.sun.jna.Callback callback, String format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_binding_action(long _self, int keyval, int mods, long action_name, long format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_binding_action(long _self, int keyval, int mods, String action_name, String format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_binding_signal(long _self, int keyval, int mods, long signal, long format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_binding_signal(long _self, int keyval, int mods, String signal, String format_string, java.lang.Object... _elipse);
        void gtk_widget_class_add_shortcut(long _self, long shortcut);
        void gtk_widget_class_bind_template_callback_full(long _self, long callback_name, com.sun.jna.Callback callback_symbol);
        void gtk_widget_class_bind_template_callback_full(long _self, String callback_name, com.sun.jna.Callback callback_symbol);
        void gtk_widget_class_bind_template_child_full(long _self, long name, boolean internal_child, long struct_offset);
        void gtk_widget_class_bind_template_child_full(long _self, String name, boolean internal_child, long struct_offset);
        int gtk_widget_class_get_accessible_role(long _self);
        int gtk_widget_class_get_activate_signal(long _self);
        long gtk_widget_class_get_css_name(long _self);
        long gtk_widget_class_get_layout_manager_type(long _self);
        void gtk_widget_class_install_action(long _self, long action_name, long parameter_type, com.sun.jna.Callback activate);
        void gtk_widget_class_install_action(long _self, String action_name, String parameter_type, com.sun.jna.Callback activate);
        void gtk_widget_class_install_property_action(long _self, long action_name, long property_name);
        void gtk_widget_class_install_property_action(long _self, String action_name, String property_name);
        void gtk_widget_class_set_accessible_role(long _self, int accessible_role);
        void gtk_widget_class_set_activate_signal(long _self, int signal_id);
        void gtk_widget_class_set_activate_signal_from_name(long _self, long signal_name);
        void gtk_widget_class_set_activate_signal_from_name(long _self, String signal_name);
        void gtk_widget_class_set_css_name(long _self, long name);
        void gtk_widget_class_set_css_name(long _self, String name);
        void gtk_widget_class_set_layout_manager_type(long _self, long type);
        void gtk_widget_class_set_template(long _self, long template_bytes);
        void gtk_widget_class_set_template_from_resource(long _self, long resource_name);
        void gtk_widget_class_set_template_from_resource(long _self, String resource_name);
        void gtk_widget_class_set_template_scope(long _self, long scope);
    }

}
