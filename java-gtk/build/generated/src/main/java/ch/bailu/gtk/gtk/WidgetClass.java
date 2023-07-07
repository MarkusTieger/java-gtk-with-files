/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.WidgetClass.html">https://docs.gtk.org/gtk4/struct.WidgetClass.html</a></p>
*/
public class WidgetClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WidgetClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnShortcutFunc {
        /**
         * Prototype for shortcuts based on user callbacks.
         * @param widget The widget passed to the activation
         * @param args The arguments passed to the activation
         * @param user_data The user data provided when activating the action
         * @return %TRUE if the action was successful.
        */
        boolean onShortcutFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nullable ch.bailu.gtk.glib.Variant args, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaWidgetClass.OnShortcutFunc toOnShortcutFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnShortcutFunc in) {
        JnaWidgetClass.OnShortcutFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _args, _user_data) -> in.onShortcutFunc(__callback, new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_args)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCallback {
        /**
         * The type used for callback functions in structure definitions and function
         * <br>signatures.
         * <br>
         * <br>This doesn't mean that all callback functions must take no  parameters and
         * <br>return void. The required signature of a callback function is determined by
         * <br>the context in which is used (e.g. the signal to which it is connected).
         * <br>
         * <br>Use G_CALLBACK() to cast the callback function to a &#35;GCallback.
        */
        void onCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaWidgetClass.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaWidgetClass.OnCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onCallback(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnWidgetActionActivateFunc {
        /**
         * The type of the callback functions used for activating
         * <br>actions installed with gtk_widget_class_install_action().
         * <br>
         * <br>The &#64;parameter must match the &#64;parameter_type of the action.
         * @param widget the widget to which the action belongs
         * @param action_name the action name
         * @param parameter parameter for activation
        */
        void onWidgetActionActivateFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant parameter);
    }
    
    private static JnaWidgetClass.OnWidgetActionActivateFunc toOnWidgetActionActivateFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnWidgetActionActivateFunc in) {
        JnaWidgetClass.OnWidgetActionActivateFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _action_name, _parameter) -> in.onWidgetActionActivateFunc(__callback, new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShow {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onShow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnShow toOnShow(ch.bailu.gtk.type.Pointer instance, String methodName, OnShow in) {
        JnaWidgetClass.OnShow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onShow(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHide {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onHide(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnHide toOnHide(ch.bailu.gtk.type.Pointer instance, String methodName, OnHide in) {
        JnaWidgetClass.OnHide out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onHide(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMap {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onMap(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnMap toOnMap(ch.bailu.gtk.type.Pointer instance, String methodName, OnMap in) {
        JnaWidgetClass.OnMap out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onMap(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnmap {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onUnmap(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnUnmap toOnUnmap(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnmap in) {
        JnaWidgetClass.OnUnmap out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onUnmap(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRealize {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onRealize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnRealize toOnRealize(ch.bailu.gtk.type.Pointer instance, String methodName, OnRealize in) {
        JnaWidgetClass.OnRealize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onRealize(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnrealize {
        /**
         * 
         * @param widget a `GtkWidget`
        */
        void onUnrealize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnUnrealize toOnUnrealize(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnrealize in) {
        JnaWidgetClass.OnUnrealize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onUnrealize(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRoot {
        /**
         * 
         * @param widget 
        */
        void onRoot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnRoot toOnRoot(ch.bailu.gtk.type.Pointer instance, String methodName, OnRoot in) {
        JnaWidgetClass.OnRoot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onRoot(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnroot {
        /**
         * 
         * @param widget 
        */
        void onUnroot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnUnroot toOnUnroot(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnroot in) {
        JnaWidgetClass.OnUnroot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onUnroot(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSizeAllocate {
        /**
         * 
         * @param widget 
         * @param width 
         * @param height 
         * @param baseline 
        */
        void onSizeAllocate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int width, int height, int baseline);
    }
    
    private static JnaWidgetClass.OnSizeAllocate toOnSizeAllocate(ch.bailu.gtk.type.Pointer instance, String methodName, OnSizeAllocate in) {
        JnaWidgetClass.OnSizeAllocate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _width, _height, _baseline) -> in.onSizeAllocate(__callback, new Widget(new PointerContainer(_widget)), _width, _height, _baseline);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStateFlagsChanged {
        /**
         * 
         * @param widget 
         * @param previous_state_flags 
        */
        void onStateFlagsChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int previous_state_flags);
    }
    
    private static JnaWidgetClass.OnStateFlagsChanged toOnStateFlagsChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnStateFlagsChanged in) {
        JnaWidgetClass.OnStateFlagsChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _previous_state_flags) -> in.onStateFlagsChanged(__callback, new Widget(new PointerContainer(_widget)), _previous_state_flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDirectionChanged {
        /**
         * 
         * @param widget 
         * @param previous_direction 
        */
        void onDirectionChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int previous_direction);
    }
    
    private static JnaWidgetClass.OnDirectionChanged toOnDirectionChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnDirectionChanged in) {
        JnaWidgetClass.OnDirectionChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _previous_direction) -> in.onDirectionChanged(__callback, new Widget(new PointerContainer(_widget)), _previous_direction);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRequestMode {
        /**
         * 
         * @param widget a `GtkWidget` instance
         * @return The `GtkSizeRequestMode` preferred by &#64;widget.
        */
        int onGetRequestMode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnGetRequestMode toOnGetRequestMode(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRequestMode in) {
        JnaWidgetClass.OnGetRequestMode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onGetRequestMode(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMeasure {
        /**
         * 
         * @param widget A `GtkWidget` instance
         * @param orientation the orientation to measure
         * @param for_size Size for the opposite of &#64;orientation, i.e.   if &#64;orientation is %GTK_ORIENTATION_HORIZONTAL, this is   the height the widget should be measured with. The %GTK_ORIENTATION_VERTICAL   case is analogous. This way, both height-for-width and width-for-height   requests can be implemented. If no size is known, -1 can be passed.
         * @param minimum location to store the minimum size
         * @param natural location to store the natural size
         * @param minimum_baseline location to store the baseline   position for the minimum size, or -1 to report no baseline
         * @param natural_baseline location to store the baseline   position for the natural size, or -1 to report no baseline
        */
        void onMeasure(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int orientation, int for_size, @Nullable ch.bailu.gtk.type.Int minimum, @Nullable ch.bailu.gtk.type.Int natural, @Nullable ch.bailu.gtk.type.Int minimum_baseline, @Nullable ch.bailu.gtk.type.Int natural_baseline);
    }
    
    private static JnaWidgetClass.OnMeasure toOnMeasure(ch.bailu.gtk.type.Pointer instance, String methodName, OnMeasure in) {
        JnaWidgetClass.OnMeasure out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _orientation, _for_size, _minimum, _natural, _minimum_baseline, _natural_baseline) -> in.onMeasure(__callback, new Widget(new PointerContainer(_widget)), _orientation, _for_size, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_baseline)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_baseline)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMnemonicActivate {
        /**
         * 
         * @param widget a `GtkWidget`
         * @param group_cycling %TRUE if there are other widgets with the same mnemonic
         * @return %TRUE if the signal has been handled
        */
        boolean onMnemonicActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, boolean group_cycling);
    }
    
    private static JnaWidgetClass.OnMnemonicActivate toOnMnemonicActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnMnemonicActivate in) {
        JnaWidgetClass.OnMnemonicActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _group_cycling) -> in.onMnemonicActivate(__callback, new Widget(new PointerContainer(_widget)), _group_cycling);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGrabFocus {
        /**
         * 
         * @param widget a `GtkWidget`
         * @return %TRUE if focus is now inside &#64;widget.
        */
        boolean onGrabFocus(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaWidgetClass.OnGrabFocus toOnGrabFocus(ch.bailu.gtk.type.Pointer instance, String methodName, OnGrabFocus in) {
        JnaWidgetClass.OnGrabFocus out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onGrabFocus(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFocus {
        /**
         * 
         * @param widget 
         * @param direction 
         * @return 
        */
        boolean onFocus(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int direction);
    }
    
    private static JnaWidgetClass.OnFocus toOnFocus(ch.bailu.gtk.type.Pointer instance, String methodName, OnFocus in) {
        JnaWidgetClass.OnFocus out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _direction) -> in.onFocus(__callback, new Widget(new PointerContainer(_widget)), _direction);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetFocusChild {
        /**
         * 
         * @param widget a `GtkWidget`
         * @param child a direct child widget of &#64;widget or %NULL   to unset the focus child of &#64;widget
        */
        void onSetFocusChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nullable Widget child);
    }
    
    private static JnaWidgetClass.OnSetFocusChild toOnSetFocusChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetFocusChild in) {
        JnaWidgetClass.OnSetFocusChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _child) -> in.onSetFocusChild(__callback, new Widget(new PointerContainer(_widget)), new Widget(new PointerContainer(_child)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMoveFocus {
        /**
         * 
         * @param widget 
         * @param direction 
        */
        void onMoveFocus(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int direction);
    }
    
    private static JnaWidgetClass.OnMoveFocus toOnMoveFocus(ch.bailu.gtk.type.Pointer instance, String methodName, OnMoveFocus in) {
        JnaWidgetClass.OnMoveFocus out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _direction) -> in.onMoveFocus(__callback, new Widget(new PointerContainer(_widget)), _direction);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnKeynavFailed {
        /**
         * 
         * @param widget a `GtkWidget`
         * @param direction direction of focus movement
         * @return %TRUE if stopping keyboard navigation is fine, %FALSE   if the emitting widget should try to handle the keyboard   navigation attempt in its parent container(s).
        */
        boolean onKeynavFailed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int direction);
    }
    
    private static JnaWidgetClass.OnKeynavFailed toOnKeynavFailed(ch.bailu.gtk.type.Pointer instance, String methodName, OnKeynavFailed in) {
        JnaWidgetClass.OnKeynavFailed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _direction) -> in.onKeynavFailed(__callback, new Widget(new PointerContainer(_widget)), _direction);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryTooltip {
        /**
         * 
         * @param widget 
         * @param x 
         * @param y 
         * @param keyboard_tooltip 
         * @param tooltip 
         * @return 
        */
        boolean onQueryTooltip(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int x, int y, boolean keyboard_tooltip, @Nonnull Tooltip tooltip);
    }
    
    private static JnaWidgetClass.OnQueryTooltip toOnQueryTooltip(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryTooltip in) {
        JnaWidgetClass.OnQueryTooltip out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _x, _y, _keyboard_tooltip, _tooltip) -> in.onQueryTooltip(__callback, new Widget(new PointerContainer(_widget)), _x, _y, _keyboard_tooltip, new Tooltip(new PointerContainer(_tooltip)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnComputeExpand {
        /**
         * 
         * @param widget 
         * @param hexpand_p 
         * @param vexpand_p 
        */
        void onComputeExpand(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Int hexpand_p, @Nonnull ch.bailu.gtk.type.Int vexpand_p);
    }
    
    private static JnaWidgetClass.OnComputeExpand toOnComputeExpand(ch.bailu.gtk.type.Pointer instance, String methodName, OnComputeExpand in) {
        JnaWidgetClass.OnComputeExpand out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _hexpand_p, _vexpand_p) -> in.onComputeExpand(__callback, new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.type.Int(new PointerContainer(_hexpand_p)), new ch.bailu.gtk.type.Int(new PointerContainer(_vexpand_p)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCssChanged {
        /**
         * 
         * @param widget 
         * @param change 
        */
        void onCssChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nonnull CssStyleChange change);
    }
    
    private static JnaWidgetClass.OnCssChanged toOnCssChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnCssChanged in) {
        JnaWidgetClass.OnCssChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _change) -> in.onCssChanged(__callback, new Widget(new PointerContainer(_widget)), new CssStyleChange(new PointerContainer(_change)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSystemSettingChanged {
        /**
         * 
         * @param widget 
         * @param settings 
        */
        void onSystemSettingChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int settings);
    }
    
    private static JnaWidgetClass.OnSystemSettingChanged toOnSystemSettingChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnSystemSettingChanged in) {
        JnaWidgetClass.OnSystemSettingChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _settings) -> in.onSystemSettingChanged(__callback, new Widget(new PointerContainer(_widget)), _settings);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSnapshot {
        /**
         * 
         * @param widget 
         * @param snapshot 
        */
        void onSnapshot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nonnull Snapshot snapshot);
    }
    
    private static JnaWidgetClass.OnSnapshot toOnSnapshot(ch.bailu.gtk.type.Pointer instance, String methodName, OnSnapshot in) {
        JnaWidgetClass.OnSnapshot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _snapshot) -> in.onSnapshot(__callback, new Widget(new PointerContainer(_widget)), new Snapshot(new PointerContainer(_snapshot)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnContains {
        /**
         * 
         * @param widget the widget to query
         * @param x X coordinate to test, relative to &#64;widget's origin
         * @param y Y coordinate to test, relative to &#64;widget's origin
         * @return %TRUE if &#64;widget contains (&#64;x, &#64;y).
        */
        boolean onContains(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, double x, double y);
    }
    
    private static JnaWidgetClass.OnContains toOnContains(ch.bailu.gtk.type.Pointer instance, String methodName, OnContains in) {
        JnaWidgetClass.OnContains out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _x, _y) -> in.onContains(__callback, new Widget(new PointerContainer(_widget)), _x, _y);
            __callback.register(out);
        }
        return out;
    }

    public WidgetClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaWidgetClass.Fields _fields;
    
    JnaWidgetClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaWidgetClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The object class structure needs to be the first
     * <br>  element in the widget class structure in order for the class mechanism
     * <br>  to work correctly. This allows a GtkWidgetClass pointer to be cast to
     * <br>  a GObjectClass pointer.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public static final String SHOW = "show";

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public void setFieldShow(OnShow show) {
        toFields().show = toOnShow(this, SHOW, show);
        toFields().writeField(SHOW);
    }

    /**
     * 
     * <br>See {@link OnShow#onShow}
    */
    public JnaWidgetClass.OnShow getFieldShow() {
       toFields().readField(SHOW);
       return toFields().show;
    } 

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public static final String HIDE = "hide";

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public void setFieldHide(OnHide hide) {
        toFields().hide = toOnHide(this, HIDE, hide);
        toFields().writeField(HIDE);
    }

    /**
     * 
     * <br>See {@link OnHide#onHide}
    */
    public JnaWidgetClass.OnHide getFieldHide() {
       toFields().readField(HIDE);
       return toFields().hide;
    } 

    /**
     * 
     * <br>See {@link OnMap#onMap}
    */
    public static final String MAP = "map";

    /**
     * 
     * <br>See {@link OnMap#onMap}
    */
    public void setFieldMap(OnMap map) {
        toFields().map = toOnMap(this, MAP, map);
        toFields().writeField(MAP);
    }

    /**
     * 
     * <br>See {@link OnMap#onMap}
    */
    public JnaWidgetClass.OnMap getFieldMap() {
       toFields().readField(MAP);
       return toFields().map;
    } 

    /**
     * 
     * <br>See {@link OnUnmap#onUnmap}
    */
    public static final String UNMAP = "unmap";

    /**
     * 
     * <br>See {@link OnUnmap#onUnmap}
    */
    public void setFieldUnmap(OnUnmap unmap) {
        toFields().unmap = toOnUnmap(this, UNMAP, unmap);
        toFields().writeField(UNMAP);
    }

    /**
     * 
     * <br>See {@link OnUnmap#onUnmap}
    */
    public JnaWidgetClass.OnUnmap getFieldUnmap() {
       toFields().readField(UNMAP);
       return toFields().unmap;
    } 

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public static final String REALIZE = "realize";

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public void setFieldRealize(OnRealize realize) {
        toFields().realize = toOnRealize(this, REALIZE, realize);
        toFields().writeField(REALIZE);
    }

    /**
     * 
     * <br>See {@link OnRealize#onRealize}
    */
    public JnaWidgetClass.OnRealize getFieldRealize() {
       toFields().readField(REALIZE);
       return toFields().realize;
    } 

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public static final String UNREALIZE = "unrealize";

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public void setFieldUnrealize(OnUnrealize unrealize) {
        toFields().unrealize = toOnUnrealize(this, UNREALIZE, unrealize);
        toFields().writeField(UNREALIZE);
    }

    /**
     * 
     * <br>See {@link OnUnrealize#onUnrealize}
    */
    public JnaWidgetClass.OnUnrealize getFieldUnrealize() {
       toFields().readField(UNREALIZE);
       return toFields().unrealize;
    } 

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public static final String ROOT = "root";

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public void setFieldRoot(OnRoot root) {
        toFields().root = toOnRoot(this, ROOT, root);
        toFields().writeField(ROOT);
    }

    /**
     * 
     * <br>See {@link OnRoot#onRoot}
    */
    public JnaWidgetClass.OnRoot getFieldRoot() {
       toFields().readField(ROOT);
       return toFields().root;
    } 

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public static final String UNROOT = "unroot";

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public void setFieldUnroot(OnUnroot unroot) {
        toFields().unroot = toOnUnroot(this, UNROOT, unroot);
        toFields().writeField(UNROOT);
    }

    /**
     * 
     * <br>See {@link OnUnroot#onUnroot}
    */
    public JnaWidgetClass.OnUnroot getFieldUnroot() {
       toFields().readField(UNROOT);
       return toFields().unroot;
    } 

    /**
     * 
     * <br>See {@link OnSizeAllocate#onSizeAllocate}
    */
    public static final String SIZE_ALLOCATE = "size_allocate";

    /**
     * 
     * <br>See {@link OnSizeAllocate#onSizeAllocate}
    */
    public void setFieldSizeAllocate(OnSizeAllocate size_allocate) {
        toFields().size_allocate = toOnSizeAllocate(this, SIZE_ALLOCATE, size_allocate);
        toFields().writeField(SIZE_ALLOCATE);
    }

    /**
     * 
     * <br>See {@link OnSizeAllocate#onSizeAllocate}
    */
    public JnaWidgetClass.OnSizeAllocate getFieldSizeAllocate() {
       toFields().readField(SIZE_ALLOCATE);
       return toFields().size_allocate;
    } 

    /**
     * 
     * <br>See {@link OnStateFlagsChanged#onStateFlagsChanged}
    */
    public static final String STATE_FLAGS_CHANGED = "state_flags_changed";

    /**
     * 
     * <br>See {@link OnStateFlagsChanged#onStateFlagsChanged}
    */
    public void setFieldStateFlagsChanged(OnStateFlagsChanged state_flags_changed) {
        toFields().state_flags_changed = toOnStateFlagsChanged(this, STATE_FLAGS_CHANGED, state_flags_changed);
        toFields().writeField(STATE_FLAGS_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnStateFlagsChanged#onStateFlagsChanged}
    */
    public JnaWidgetClass.OnStateFlagsChanged getFieldStateFlagsChanged() {
       toFields().readField(STATE_FLAGS_CHANGED);
       return toFields().state_flags_changed;
    } 

    /**
     * 
     * <br>See {@link OnDirectionChanged#onDirectionChanged}
    */
    public static final String DIRECTION_CHANGED = "direction_changed";

    /**
     * 
     * <br>See {@link OnDirectionChanged#onDirectionChanged}
    */
    public void setFieldDirectionChanged(OnDirectionChanged direction_changed) {
        toFields().direction_changed = toOnDirectionChanged(this, DIRECTION_CHANGED, direction_changed);
        toFields().writeField(DIRECTION_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnDirectionChanged#onDirectionChanged}
    */
    public JnaWidgetClass.OnDirectionChanged getFieldDirectionChanged() {
       toFields().readField(DIRECTION_CHANGED);
       return toFields().direction_changed;
    } 

    /**
     * 
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public static final String GET_REQUEST_MODE = "get_request_mode";

    /**
     * 
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public void setFieldGetRequestMode(OnGetRequestMode get_request_mode) {
        toFields().get_request_mode = toOnGetRequestMode(this, GET_REQUEST_MODE, get_request_mode);
        toFields().writeField(GET_REQUEST_MODE);
    }

    /**
     * 
     * <br>See {@link OnGetRequestMode#onGetRequestMode}
    */
    public JnaWidgetClass.OnGetRequestMode getFieldGetRequestMode() {
       toFields().readField(GET_REQUEST_MODE);
       return toFields().get_request_mode;
    } 

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public static final String MEASURE = "measure";

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public void setFieldMeasure(OnMeasure measure) {
        toFields().measure = toOnMeasure(this, MEASURE, measure);
        toFields().writeField(MEASURE);
    }

    /**
     * 
     * <br>See {@link OnMeasure#onMeasure}
    */
    public JnaWidgetClass.OnMeasure getFieldMeasure() {
       toFields().readField(MEASURE);
       return toFields().measure;
    } 

    /**
     * 
     * <br>See {@link OnMnemonicActivate#onMnemonicActivate}
    */
    public static final String MNEMONIC_ACTIVATE = "mnemonic_activate";

    /**
     * 
     * <br>See {@link OnMnemonicActivate#onMnemonicActivate}
    */
    public void setFieldMnemonicActivate(OnMnemonicActivate mnemonic_activate) {
        toFields().mnemonic_activate = toOnMnemonicActivate(this, MNEMONIC_ACTIVATE, mnemonic_activate);
        toFields().writeField(MNEMONIC_ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnMnemonicActivate#onMnemonicActivate}
    */
    public JnaWidgetClass.OnMnemonicActivate getFieldMnemonicActivate() {
       toFields().readField(MNEMONIC_ACTIVATE);
       return toFields().mnemonic_activate;
    } 

    /**
     * 
     * <br>See {@link OnGrabFocus#onGrabFocus}
    */
    public static final String GRAB_FOCUS = "grab_focus";

    /**
     * 
     * <br>See {@link OnGrabFocus#onGrabFocus}
    */
    public void setFieldGrabFocus(OnGrabFocus grab_focus) {
        toFields().grab_focus = toOnGrabFocus(this, GRAB_FOCUS, grab_focus);
        toFields().writeField(GRAB_FOCUS);
    }

    /**
     * 
     * <br>See {@link OnGrabFocus#onGrabFocus}
    */
    public JnaWidgetClass.OnGrabFocus getFieldGrabFocus() {
       toFields().readField(GRAB_FOCUS);
       return toFields().grab_focus;
    } 

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public static final String FOCUS = "focus";

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public void setFieldFocus(OnFocus focus) {
        toFields().focus = toOnFocus(this, FOCUS, focus);
        toFields().writeField(FOCUS);
    }

    /**
     * 
     * <br>See {@link OnFocus#onFocus}
    */
    public JnaWidgetClass.OnFocus getFieldFocus() {
       toFields().readField(FOCUS);
       return toFields().focus;
    } 

    /**
     * 
     * <br>See {@link OnSetFocusChild#onSetFocusChild}
    */
    public static final String SET_FOCUS_CHILD = "set_focus_child";

    /**
     * 
     * <br>See {@link OnSetFocusChild#onSetFocusChild}
    */
    public void setFieldSetFocusChild(OnSetFocusChild set_focus_child) {
        toFields().set_focus_child = toOnSetFocusChild(this, SET_FOCUS_CHILD, set_focus_child);
        toFields().writeField(SET_FOCUS_CHILD);
    }

    /**
     * 
     * <br>See {@link OnSetFocusChild#onSetFocusChild}
    */
    public JnaWidgetClass.OnSetFocusChild getFieldSetFocusChild() {
       toFields().readField(SET_FOCUS_CHILD);
       return toFields().set_focus_child;
    } 

    /**
     * 
     * <br>See {@link OnMoveFocus#onMoveFocus}
    */
    public static final String MOVE_FOCUS = "move_focus";

    /**
     * 
     * <br>See {@link OnMoveFocus#onMoveFocus}
    */
    public void setFieldMoveFocus(OnMoveFocus move_focus) {
        toFields().move_focus = toOnMoveFocus(this, MOVE_FOCUS, move_focus);
        toFields().writeField(MOVE_FOCUS);
    }

    /**
     * 
     * <br>See {@link OnMoveFocus#onMoveFocus}
    */
    public JnaWidgetClass.OnMoveFocus getFieldMoveFocus() {
       toFields().readField(MOVE_FOCUS);
       return toFields().move_focus;
    } 

    /**
     * 
     * <br>See {@link OnKeynavFailed#onKeynavFailed}
    */
    public static final String KEYNAV_FAILED = "keynav_failed";

    /**
     * 
     * <br>See {@link OnKeynavFailed#onKeynavFailed}
    */
    public void setFieldKeynavFailed(OnKeynavFailed keynav_failed) {
        toFields().keynav_failed = toOnKeynavFailed(this, KEYNAV_FAILED, keynav_failed);
        toFields().writeField(KEYNAV_FAILED);
    }

    /**
     * 
     * <br>See {@link OnKeynavFailed#onKeynavFailed}
    */
    public JnaWidgetClass.OnKeynavFailed getFieldKeynavFailed() {
       toFields().readField(KEYNAV_FAILED);
       return toFields().keynav_failed;
    } 

    /**
     * 
     * <br>See {@link OnQueryTooltip#onQueryTooltip}
    */
    public static final String QUERY_TOOLTIP = "query_tooltip";

    /**
     * 
     * <br>See {@link OnQueryTooltip#onQueryTooltip}
    */
    public void setFieldQueryTooltip(OnQueryTooltip query_tooltip) {
        toFields().query_tooltip = toOnQueryTooltip(this, QUERY_TOOLTIP, query_tooltip);
        toFields().writeField(QUERY_TOOLTIP);
    }

    /**
     * 
     * <br>See {@link OnQueryTooltip#onQueryTooltip}
    */
    public JnaWidgetClass.OnQueryTooltip getFieldQueryTooltip() {
       toFields().readField(QUERY_TOOLTIP);
       return toFields().query_tooltip;
    } 

    /**
     * 
     * <br>See {@link OnComputeExpand#onComputeExpand}
    */
    public static final String COMPUTE_EXPAND = "compute_expand";

    /**
     * 
     * <br>See {@link OnComputeExpand#onComputeExpand}
    */
    public void setFieldComputeExpand(OnComputeExpand compute_expand) {
        toFields().compute_expand = toOnComputeExpand(this, COMPUTE_EXPAND, compute_expand);
        toFields().writeField(COMPUTE_EXPAND);
    }

    /**
     * 
     * <br>See {@link OnComputeExpand#onComputeExpand}
    */
    public JnaWidgetClass.OnComputeExpand getFieldComputeExpand() {
       toFields().readField(COMPUTE_EXPAND);
       return toFields().compute_expand;
    } 

    /**
     * 
     * <br>See {@link OnCssChanged#onCssChanged}
    */
    public static final String CSS_CHANGED = "css_changed";

    /**
     * 
     * <br>See {@link OnCssChanged#onCssChanged}
    */
    public void setFieldCssChanged(OnCssChanged css_changed) {
        toFields().css_changed = toOnCssChanged(this, CSS_CHANGED, css_changed);
        toFields().writeField(CSS_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnCssChanged#onCssChanged}
    */
    public JnaWidgetClass.OnCssChanged getFieldCssChanged() {
       toFields().readField(CSS_CHANGED);
       return toFields().css_changed;
    } 

    /**
     * 
     * <br>See {@link OnSystemSettingChanged#onSystemSettingChanged}
    */
    public static final String SYSTEM_SETTING_CHANGED = "system_setting_changed";

    /**
     * 
     * <br>See {@link OnSystemSettingChanged#onSystemSettingChanged}
    */
    public void setFieldSystemSettingChanged(OnSystemSettingChanged system_setting_changed) {
        toFields().system_setting_changed = toOnSystemSettingChanged(this, SYSTEM_SETTING_CHANGED, system_setting_changed);
        toFields().writeField(SYSTEM_SETTING_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnSystemSettingChanged#onSystemSettingChanged}
    */
    public JnaWidgetClass.OnSystemSettingChanged getFieldSystemSettingChanged() {
       toFields().readField(SYSTEM_SETTING_CHANGED);
       return toFields().system_setting_changed;
    } 

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public static final String SNAPSHOT = "snapshot";

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public void setFieldSnapshot(OnSnapshot snapshot) {
        toFields().snapshot = toOnSnapshot(this, SNAPSHOT, snapshot);
        toFields().writeField(SNAPSHOT);
    }

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public JnaWidgetClass.OnSnapshot getFieldSnapshot() {
       toFields().readField(SNAPSHOT);
       return toFields().snapshot;
    } 

    /**
     * 
     * <br>See {@link OnContains#onContains}
    */
    public static final String CONTAINS = "contains";

    /**
     * 
     * <br>See {@link OnContains#onContains}
    */
    public void setFieldContains(OnContains contains) {
        toFields().contains = toOnContains(this, CONTAINS, contains);
        toFields().writeField(CONTAINS);
    }

    /**
     * 
     * <br>See {@link OnContains#onContains}
    */
    public JnaWidgetClass.OnContains getFieldContains() {
       toFields().readField(CONTAINS);
       return toFields().contains;
    } 

    /**
     * 
    */
    public static final String PRIV = "priv";

    /**
     * 
    */
    public WidgetClassPrivate getFieldPriv() {
       toFields().readField(PRIV);
       return new WidgetClassPrivate(new PointerContainer(toFields().priv));
    } 

    /**
     * Creates a new shortcut for &#64;widget_class that calls the given &#64;callback
     * <br>with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization. It does not provide for user_data, if you need that,
     * <br>you will have to use [method&#64;GtkWidgetClass.add_shortcut] with a custom
     * <br>shortcut.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param callback the callback to call upon activation
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBinding(int keyval, int mods, OnShortcutFunc callback, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding(asCPointer(), keyval, mods, toOnShortcutFunc(this, "addBinding", callback), asCPointer(format_string), _elipse);
    }

    /**
     * Creates a new shortcut for &#64;widget_class that calls the given &#64;callback
     * <br>with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization. It does not provide for user_data, if you need that,
     * <br>you will have to use [method&#64;GtkWidgetClass.add_shortcut] with a custom
     * <br>shortcut.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param callback the callback to call upon activation
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBinding(int keyval, int mods, OnShortcutFunc callback, String format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding(asCPointer(), keyval, mods, toOnShortcutFunc(this, "addBinding", callback), format_string, _elipse);
    }

    /**
     * Creates a new shortcut for &#64;widget_class that activates the given
     * <br>&#64;action_name with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param action_name the action to activate
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBindingAction(int keyval, int mods, @Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding_action(asCPointer(), keyval, mods, asCPointerNotNull(action_name), asCPointer(format_string), _elipse);
    }

    /**
     * Creates a new shortcut for &#64;widget_class that activates the given
     * <br>&#64;action_name with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param action_name the action to activate
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBindingAction(int keyval, int mods, String action_name, String format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding_action(asCPointer(), keyval, mods, action_name, format_string, _elipse);
    }

    /**
     * Creates a new shortcut for &#64;widget_class that emits the given action
     * <br>&#64;signal with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param signal the signal to execute
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBindingSignal(int keyval, int mods, @Nonnull ch.bailu.gtk.type.Str signal, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding_signal(asCPointer(), keyval, mods, asCPointerNotNull(signal), asCPointer(format_string), _elipse);
    }

    /**
     * Creates a new shortcut for &#64;widget_class that emits the given action
     * <br>&#64;signal with arguments read according to &#64;format_string.
     * <br>
     * <br>The arguments and format string must be provided in the same way as
     * <br>with g_variant_new().
     * <br>
     * <br>This function is a convenience wrapper around
     * <br>[method&#64;Gtk.WidgetClass.add_shortcut] and must be called during class
     * <br>initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param signal the signal to execute
     * @param format_string GVariant format string for arguments   or %NULL for no arguments
     * @param _elipse arguments, as given by format string
    */
    public void addBindingSignal(int keyval, int mods, String signal, String format_string, java.lang.Object... _elipse)  {
        JnaWidgetClass.INST().gtk_widget_class_add_binding_signal(asCPointer(), keyval, mods, signal, format_string, _elipse);
    }

    /**
     * Installs a shortcut in &#64;widget_class.
     * <br>
     * <br>Every instance created for &#64;widget_class or its subclasses will
     * <br>inherit this shortcut and trigger it.
     * <br>
     * <br>Shortcuts added this way will be triggered in the %GTK_PHASE_BUBBLE
     * <br>phase, which means they may also trigger if child widgets have focus.
     * <br>
     * <br>This function must only be used in class initialization functions
     * <br>otherwise it is not guaranteed that the shortcut will be installed.
     * @param shortcut the `GtkShortcut` to add
    */
    public void addShortcut(@Nonnull Shortcut shortcut)  {
        JnaWidgetClass.INST().gtk_widget_class_add_shortcut(asCPointer(), asCPointerNotNull(shortcut));
    }

    /**
     * Declares a &#64;callback_symbol to handle &#64;callback_name from
     * <br>the template XML defined for &#64;widget_type.
     * <br>
     * <br>This function is not supported after [method&#64;Gtk.WidgetClass.set_template_scope]
     * <br>has been used on &#64;widget_class. See [method&#64;Gtk.BuilderCScope.add_callback_symbol].
     * <br>
     * <br>Note that this must be called from a composite widget classes
     * <br>class initializer after calling [method&#64;Gtk.WidgetClass.set_template].
     * @param callback_name The name of the callback as expected in the template XML
     * @param callback_symbol The callback symbol
    */
    public void bindTemplateCallbackFull(@Nonnull ch.bailu.gtk.type.Str callback_name, OnCallback callback_symbol)  {
        JnaWidgetClass.INST().gtk_widget_class_bind_template_callback_full(asCPointer(), asCPointerNotNull(callback_name), toOnCallback(this, "bindTemplateCallbackFull", callback_symbol));
    }

    /**
     * Declares a &#64;callback_symbol to handle &#64;callback_name from
     * <br>the template XML defined for &#64;widget_type.
     * <br>
     * <br>This function is not supported after [method&#64;Gtk.WidgetClass.set_template_scope]
     * <br>has been used on &#64;widget_class. See [method&#64;Gtk.BuilderCScope.add_callback_symbol].
     * <br>
     * <br>Note that this must be called from a composite widget classes
     * <br>class initializer after calling [method&#64;Gtk.WidgetClass.set_template].
     * @param callback_name The name of the callback as expected in the template XML
     * @param callback_symbol The callback symbol
    */
    public void bindTemplateCallbackFull(String callback_name, OnCallback callback_symbol)  {
        JnaWidgetClass.INST().gtk_widget_class_bind_template_callback_full(asCPointer(), callback_name, toOnCallback(this, "bindTemplateCallbackFull", callback_symbol));
    }

    /**
     * Automatically assign an object declared in the class template XML to
     * <br>be set to a location on a freshly built instance’s private data, or
     * <br>alternatively accessible via [method&#64;Gtk.Widget.get_template_child].
     * <br>
     * <br>The struct can point either into the public instance, then you should
     * <br>use `G_STRUCT_OFFSET(WidgetType, member)` for &#64;struct_offset, or in the
     * <br>private struct, then you should use `G_PRIVATE_OFFSET(WidgetType, member)`.
     * <br>
     * <br>An explicit strong reference will be held automatically for the duration
     * <br>of your instance’s life cycle, it will be released automatically when
     * <br>`GObjectClass.dispose()` runs on your instance and if a &#64;struct_offset
     * <br>that is `!= 0` is specified, then the automatic location in your instance
     * <br>public or private data will be set to %NULL. You can however access an
     * <br>automated child pointer the first time your classes `GObjectClass.dispose()`
     * <br>runs, or alternatively in [signal&#64;Gtk.Widget::destroy].
     * <br>
     * <br>If &#64;internal_child is specified, [vfunc&#64;Gtk.Buildable.get_internal_child]
     * <br>will be automatically implemented by the `GtkWidget` class so there is no
     * <br>need to implement it manually.
     * <br>
     * <br>The wrapper macros [func&#64;Gtk.widget_class_bind_template_child],
     * <br>[func&#64;Gtk.widget_class_bind_template_child_internal],
     * <br>[func&#64;Gtk.widget_class_bind_template_child_private] and
     * <br>[func&#64;Gtk.widget_class_bind_template_child_internal_private]
     * <br>might be more convenient to use.
     * <br>
     * <br>Note that this must be called from a composite widget classes class
     * <br>initializer after calling [method&#64;Gtk.WidgetClass.set_template].
     * @param name The “id” of the child defined in the template XML
     * @param internal_child Whether the child should be accessible as an “internal-child”   when this class is used in GtkBuilder XML
     * @param struct_offset The structure offset into the composite widget’s instance   public or private structure where the automated child pointer should be set,   or 0 to not assign the pointer.
    */
    public void bindTemplateChildFull(@Nonnull ch.bailu.gtk.type.Str name, boolean internal_child, long struct_offset)  {
        JnaWidgetClass.INST().gtk_widget_class_bind_template_child_full(asCPointer(), asCPointerNotNull(name), internal_child, struct_offset);
    }

    /**
     * Automatically assign an object declared in the class template XML to
     * <br>be set to a location on a freshly built instance’s private data, or
     * <br>alternatively accessible via [method&#64;Gtk.Widget.get_template_child].
     * <br>
     * <br>The struct can point either into the public instance, then you should
     * <br>use `G_STRUCT_OFFSET(WidgetType, member)` for &#64;struct_offset, or in the
     * <br>private struct, then you should use `G_PRIVATE_OFFSET(WidgetType, member)`.
     * <br>
     * <br>An explicit strong reference will be held automatically for the duration
     * <br>of your instance’s life cycle, it will be released automatically when
     * <br>`GObjectClass.dispose()` runs on your instance and if a &#64;struct_offset
     * <br>that is `!= 0` is specified, then the automatic location in your instance
     * <br>public or private data will be set to %NULL. You can however access an
     * <br>automated child pointer the first time your classes `GObjectClass.dispose()`
     * <br>runs, or alternatively in [signal&#64;Gtk.Widget::destroy].
     * <br>
     * <br>If &#64;internal_child is specified, [vfunc&#64;Gtk.Buildable.get_internal_child]
     * <br>will be automatically implemented by the `GtkWidget` class so there is no
     * <br>need to implement it manually.
     * <br>
     * <br>The wrapper macros [func&#64;Gtk.widget_class_bind_template_child],
     * <br>[func&#64;Gtk.widget_class_bind_template_child_internal],
     * <br>[func&#64;Gtk.widget_class_bind_template_child_private] and
     * <br>[func&#64;Gtk.widget_class_bind_template_child_internal_private]
     * <br>might be more convenient to use.
     * <br>
     * <br>Note that this must be called from a composite widget classes class
     * <br>initializer after calling [method&#64;Gtk.WidgetClass.set_template].
     * @param name The “id” of the child defined in the template XML
     * @param internal_child Whether the child should be accessible as an “internal-child”   when this class is used in GtkBuilder XML
     * @param struct_offset The structure offset into the composite widget’s instance   public or private structure where the automated child pointer should be set,   or 0 to not assign the pointer.
    */
    public void bindTemplateChildFull(String name, boolean internal_child, long struct_offset)  {
        JnaWidgetClass.INST().gtk_widget_class_bind_template_child_full(asCPointer(), name, internal_child, struct_offset);
    }

    /**
     * Retrieves the accessible role used by the given `GtkWidget` class.
     * <br>
     * <br>Different accessible roles have different states, and are rendered
     * <br>differently by assistive technologies.
     * <br>
     * <br>See also: [method&#64;Gtk.Accessible.get_accessible_role].
     * @return the accessible role for the widget class
    */
    public int getAccessibleRole()  {
        return JnaWidgetClass.INST().gtk_widget_class_get_accessible_role(asCPointer());
    }

    /**
     * Retrieves the signal id for the activation signal.
     * <br>
     * <br>the activation signal is set using
     * <br>[method&#64;Gtk.WidgetClass.set_activate_signal].
     * @return a signal id, or 0 if the widget class does not   specify an activation signal
    */
    public int getActivateSignal()  {
        return JnaWidgetClass.INST().gtk_widget_class_get_activate_signal(asCPointer());
    }

    /**
     * Gets the name used by this class for matching in CSS code.
     * <br>
     * <br>See [method&#64;Gtk.WidgetClass.set_css_name] for details.
     * @return the CSS name of the given class
    */
    public ch.bailu.gtk.type.Str getCssName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWidgetClass.INST().gtk_widget_class_get_css_name(asCPointer())));
    }

    /**
     * Retrieves the type of the [class&#64;Gtk.LayoutManager]
     * <br>used by widgets of class &#64;widget_class.
     * <br>
     * <br>See also: [method&#64;Gtk.WidgetClass.set_layout_manager_type].
     * @return type of a `GtkLayoutManager` subclass, or %G_TYPE_INVALID
    */
    public long getLayoutManagerType()  {
        return JnaWidgetClass.INST().gtk_widget_class_get_layout_manager_type(asCPointer());
    }

    /**
     * This should be called at class initialization time to specify
     * <br>actions to be added for all instances of this class.
     * <br>
     * <br>Actions installed by this function are stateless. The only state
     * <br>they have is whether they are enabled or not.
     * @param action_name a prefixed action name, such as &quot;clipboard.paste&quot;
     * @param parameter_type the parameter type
     * @param activate callback to use when the action is activated
    */
    public void installAction(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.type.Str parameter_type, OnWidgetActionActivateFunc activate)  {
        JnaWidgetClass.INST().gtk_widget_class_install_action(asCPointer(), asCPointerNotNull(action_name), asCPointer(parameter_type), toOnWidgetActionActivateFunc(this, "installAction", activate));
    }

    /**
     * This should be called at class initialization time to specify
     * <br>actions to be added for all instances of this class.
     * <br>
     * <br>Actions installed by this function are stateless. The only state
     * <br>they have is whether they are enabled or not.
     * @param action_name a prefixed action name, such as &quot;clipboard.paste&quot;
     * @param parameter_type the parameter type
     * @param activate callback to use when the action is activated
    */
    public void installAction(String action_name, String parameter_type, OnWidgetActionActivateFunc activate)  {
        JnaWidgetClass.INST().gtk_widget_class_install_action(asCPointer(), action_name, parameter_type, toOnWidgetActionActivateFunc(this, "installAction", activate));
    }

    /**
     * Installs an action called &#64;action_name on &#64;widget_class and
     * <br>binds its state to the value of the &#64;property_name property.
     * <br>
     * <br>This function will perform a few santity checks on the property selected
     * <br>via &#64;property_name. Namely, the property must exist, must be readable,
     * <br>writable and must not be construct-only. There are also restrictions
     * <br>on the type of the given property, it must be boolean, int, unsigned int,
     * <br>double or string. If any of these conditions are not met, a critical
     * <br>warning will be printed and no action will be added.
     * <br>
     * <br>The state type of the action matches the property type.
     * <br>
     * <br>If the property is boolean, the action will have no parameter and
     * <br>toggle the property value. Otherwise, the action will have a parameter
     * <br>of the same type as the property.
     * @param action_name name of the action
     * @param property_name name of the property in instances of &#64;widget_class   or any parent class.
    */
    public void installPropertyAction(@Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.type.Str property_name)  {
        JnaWidgetClass.INST().gtk_widget_class_install_property_action(asCPointer(), asCPointerNotNull(action_name), asCPointerNotNull(property_name));
    }

    /**
     * Installs an action called &#64;action_name on &#64;widget_class and
     * <br>binds its state to the value of the &#64;property_name property.
     * <br>
     * <br>This function will perform a few santity checks on the property selected
     * <br>via &#64;property_name. Namely, the property must exist, must be readable,
     * <br>writable and must not be construct-only. There are also restrictions
     * <br>on the type of the given property, it must be boolean, int, unsigned int,
     * <br>double or string. If any of these conditions are not met, a critical
     * <br>warning will be printed and no action will be added.
     * <br>
     * <br>The state type of the action matches the property type.
     * <br>
     * <br>If the property is boolean, the action will have no parameter and
     * <br>toggle the property value. Otherwise, the action will have a parameter
     * <br>of the same type as the property.
     * @param action_name name of the action
     * @param property_name name of the property in instances of &#64;widget_class   or any parent class.
    */
    public void installPropertyAction(String action_name, String property_name)  {
        JnaWidgetClass.INST().gtk_widget_class_install_property_action(asCPointer(), action_name, property_name);
    }

    /**
     * Sets the accessible role used by the given `GtkWidget` class.
     * <br>
     * <br>Different accessible roles have different states, and are
     * <br>rendered differently by assistive technologies.
     * @param accessible_role the `GtkAccessibleRole` used by the &#64;widget_class
    */
    public void setAccessibleRole(int accessible_role)  {
        JnaWidgetClass.INST().gtk_widget_class_set_accessible_role(asCPointer(), accessible_role);
    }

    /**
     * Sets the `GtkWidgetClass.activate_signal` field with the
     * <br>given &#64;signal_id.
     * <br>
     * <br>The signal will be emitted when calling [method&#64;Gtk.Widget.activate].
     * <br>
     * <br>The &#64;signal_id must have been registered with `g_signal_new()`
     * <br>or g_signal_newv() before calling this function.
     * @param signal_id the id for the activate signal
    */
    public void setActivateSignal(int signal_id)  {
        JnaWidgetClass.INST().gtk_widget_class_set_activate_signal(asCPointer(), signal_id);
    }

    /**
     * Sets the `GtkWidgetClass.activate_signal` field with the signal id for
     * <br>the given &#64;signal_name.
     * <br>
     * <br>The signal will be emitted when calling [method&#64;Gtk.Widget.activate].
     * <br>
     * <br>The &#64;signal_name of &#64;widget_type must have been registered with
     * <br>g_signal_new() or g_signal_newv() before calling this function.
     * @param signal_name the name of the activate signal of &#64;widget_type
    */
    public void setActivateSignalFromName(@Nonnull ch.bailu.gtk.type.Str signal_name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_activate_signal_from_name(asCPointer(), asCPointerNotNull(signal_name));
    }

    /**
     * Sets the `GtkWidgetClass.activate_signal` field with the signal id for
     * <br>the given &#64;signal_name.
     * <br>
     * <br>The signal will be emitted when calling [method&#64;Gtk.Widget.activate].
     * <br>
     * <br>The &#64;signal_name of &#64;widget_type must have been registered with
     * <br>g_signal_new() or g_signal_newv() before calling this function.
     * @param signal_name the name of the activate signal of &#64;widget_type
    */
    public void setActivateSignalFromName(String signal_name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_activate_signal_from_name(asCPointer(), signal_name);
    }

    /**
     * Sets the name to be used for CSS matching of widgets.
     * <br>
     * <br>If this function is not called for a given class, the name
     * <br>set on the parent class is used. By default, `GtkWidget`
     * <br>uses the name &quot;widget&quot;.
     * @param name name to use
    */
    public void setCssName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_css_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets the name to be used for CSS matching of widgets.
     * <br>
     * <br>If this function is not called for a given class, the name
     * <br>set on the parent class is used. By default, `GtkWidget`
     * <br>uses the name &quot;widget&quot;.
     * @param name name to use
    */
    public void setCssName(String name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_css_name(asCPointer(), name);
    }

    /**
     * Sets the type to be used for creating layout managers for
     * <br>widgets of &#64;widget_class.
     * <br>
     * <br>The given &#64;type must be a subtype of [class&#64;Gtk.LayoutManager].
     * <br>
     * <br>This function should only be called from class init functions
     * <br>of widgets.
     * @param type The object type that implements the `GtkLayoutManager`   for &#64;widget_class
    */
    public void setLayoutManagerType(long type)  {
        JnaWidgetClass.INST().gtk_widget_class_set_layout_manager_type(asCPointer(), type);
    }

    /**
     * This should be called at class initialization time to specify
     * <br>the `GtkBuilder` XML to be used to extend a widget.
     * <br>
     * <br>For convenience, [method&#64;Gtk.WidgetClass.set_template_from_resource]
     * <br>is also provided.
     * <br>
     * <br>Note that any class that installs templates must call
     * <br>[method&#64;Gtk.Widget.init_template] in the widget’s instance initializer.
     * @param template_bytes A `GBytes` holding the `GtkBuilder` XML
    */
    public void setTemplate(@Nonnull ch.bailu.gtk.glib.Bytes template_bytes)  {
        JnaWidgetClass.INST().gtk_widget_class_set_template(asCPointer(), asCPointerNotNull(template_bytes));
    }

    /**
     * A convenience function that calls [method&#64;Gtk.WidgetClass.set_template]
     * <br>with the contents of a `GResource`.
     * <br>
     * <br>Note that any class that installs templates must call
     * <br>[method&#64;Gtk.Widget.init_template] in the widget’s instance
     * <br>initializer.
     * @param resource_name The name of the resource to load the template from
    */
    public void setTemplateFromResource(@Nonnull ch.bailu.gtk.type.Str resource_name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_template_from_resource(asCPointer(), asCPointerNotNull(resource_name));
    }

    /**
     * A convenience function that calls [method&#64;Gtk.WidgetClass.set_template]
     * <br>with the contents of a `GResource`.
     * <br>
     * <br>Note that any class that installs templates must call
     * <br>[method&#64;Gtk.Widget.init_template] in the widget’s instance
     * <br>initializer.
     * @param resource_name The name of the resource to load the template from
    */
    public void setTemplateFromResource(String resource_name)  {
        JnaWidgetClass.INST().gtk_widget_class_set_template_from_resource(asCPointer(), resource_name);
    }

    /**
     * For use in language bindings, this will override the default
     * <br>`GtkBuilderScope` to be used when parsing GtkBuilder XML from
     * <br>this class’s template data.
     * <br>
     * <br>Note that this must be called from a composite widget classes class
     * <br>initializer after calling [method&#64;GtkWidgetClass.set_template].
     * @param scope The `GtkBuilderScope` to use when loading   the class template
    */
    public void setTemplateScope(@Nonnull BuilderScope scope)  {
        JnaWidgetClass.INST().gtk_widget_class_set_template_scope(asCPointer(), asCPointerNotNull(scope));
    }

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Widget.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Widget.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[MethodModel:java-type-not-supported:queryAction:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GVariantType**}}:{j:}]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
