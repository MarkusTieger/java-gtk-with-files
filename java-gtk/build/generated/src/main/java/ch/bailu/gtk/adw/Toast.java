/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A helper object for [class&#64;ToastOverlay].
 * <br>
 * <br>Toasts are meant to be passed into [method&#64;ToastOverlay.add_toast] as
 * <br>follows:
 * <br>
 * <br>```c
 * <br>adw_toast_overlay_add_toast (overlay, adw_toast_new (_(&quot;Simple Toast&quot;)));
 * <br>```
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;toast-simple-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;toast-simple.png&quot; alt=&quot;toast-simple&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>Toasts always have a close button. They emit the [signal&#64;Toast::dismissed]
 * <br>signal when disappearing.
 * <br>
 * <br>[property&#64;Toast:timeout] determines how long the toast stays on screen, while
 * <br>[property&#64;Toast:priority] determines how it behaves if another toast is
 * <br>already being displayed.
 * <br>
 * <br>[property&#64;Toast:custom-title] can be used to replace the title label with a
 * <br>custom widget.
 * <br>
 * <br>&#35;&#35; Actions
 * <br>
 * <br>Toasts can have one button on them, with a label and an attached
 * <br>[iface&#64;Gio.Action].
 * <br>
 * <br>```c
 * <br>AdwToast *toast = adw_toast_new (_(&quot;Toast with Action&quot;));
 * <br>
 * <br>adw_toast_set_button_label (toast, _(&quot;_Example&quot;));
 * <br>adw_toast_set_action_name (toast, &quot;win.example&quot;);
 * <br>
 * <br>adw_toast_overlay_add_toast (overlay, toast);
 * <br>```
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;toast-action-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;toast-action.png&quot; alt=&quot;toast-action&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>&#35;&#35; Modifying toasts
 * <br>
 * <br>Toasts can be modified after they have been shown. For this, an `AdwToast`
 * <br>reference must be kept around while the toast is visible.
 * <br>
 * <br>A common use case for this is using toasts as undo prompts that stack with
 * <br>each other, allowing to batch undo the last deleted items:
 * <br>
 * <br>```c
 * <br>
 * <br>static void
 * <br>toast_undo_cb (GtkWidget  *sender,
 * <br>               const char *action,
 * <br>               GVariant   *param)
 * <br>{
 * <br>  // Undo the deletion
 * <br>}
 * <br>
 * <br>static void
 * <br>dismissed_cb (MyWindow *self)
 * <br>{
 * <br>  self-&gt;undo_toast = NULL;
 * <br>
 * <br>  // Permanently delete the items
 * <br>}
 * <br>
 * <br>static void
 * <br>delete_item (MyWindow *self,
 * <br>             MyItem   *item)
 * <br>{
 * <br>  g_autofree char *title = NULL;
 * <br>  int n_items;
 * <br>
 * <br>  // Mark the item as waiting for deletion
 * <br>  n_items = ... // The number of waiting items
 * <br>
 * <br>  if (!self-&gt;undo_toast) {
 * <br>    self-&gt;undo_toast = adw_toast_new_format (_(&quot;‘%s’ deleted&quot;), ...);
 * <br>
 * <br>    adw_toast_set_priority (self-&gt;undo_toast, ADW_TOAST_PRIORITY_HIGH);
 * <br>    adw_toast_set_button_label (self-&gt;undo_toast, _(&quot;_Undo&quot;));
 * <br>    adw_toast_set_action_name (self-&gt;undo_toast, &quot;toast.undo&quot;);
 * <br>
 * <br>    g_signal_connect_swapped (self-&gt;undo_toast, &quot;dismissed&quot;,
 * <br>                              G_CALLBACK (dismissed_cb), self);
 * <br>
 * <br>    adw_toast_overlay_add_toast (self-&gt;toast_overlay, self-&gt;undo_toast);
 * <br>
 * <br>    return;
 * <br>  }
 * <br>
 * <br>  title =
 * <br>    g_strdup_printf (ngettext (&quot;&lt;span font_features='tnum=1'&gt;%d&lt;/span&gt; item deleted&quot;,
 * <br>                               &quot;&lt;span font_features='tnum=1'&gt;%d&lt;/span&gt; items deleted&quot;,
 * <br>                               n_items), n_items);
 * <br>
 * <br>  adw_toast_set_title (self-&gt;undo_toast, title);
 * <br>
 * <br>  // Bump the toast timeout
 * <br>  adw_toast_overlay_add_toast (self-&gt;toast_overlay, g_object_ref (self-&gt;undo_toast));
 * <br>}
 * <br>
 * <br>static void
 * <br>my_window_class_init (MyWindowClass *klass)
 * <br>{
 * <br>  GtkWidgetClass *widget_class = GTK_WIDGET_CLASS (klass);
 * <br>
 * <br>  gtk_widget_class_install_action (widget_class, &quot;toast.undo&quot;, NULL, toast_undo_cb);
 * <br>}
 * <br>```
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;toast-undo-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;toast-undo.png&quot; alt=&quot;toast-undo&quot;&gt;
 * <br>&lt;/picture&gt;
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Toast.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Toast.html</a></p>
*/
public class Toast extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Toast.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnButtonClicked {
        /**
         * Emitted after the button has been clicked.
         * <br>
         * <br>It can be used as an alternative to setting an action.
        */
        void onButtonClicked();
    }
    
    private static com.sun.jna.Callback toOnButtonClicked(OnButtonClicked in) {
        return (in == null) ? null: (JnaToast.OnButtonClicked) (__self, __data) -> in.onButtonClicked();
    }

    @FunctionalInterface
    public interface OnDismissed {
        /**
         * Emitted when the toast has been dismissed.
        */
        void onDismissed();
    }
    
    private static com.sun.jna.Callback toOnDismissed(OnDismissed in) {
        return (in == null) ? null: (JnaToast.OnDismissed) (__self, __data) -> in.onDismissed();
    }

    public Toast(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwToast`.
     * <br>
     * <br>The toast will use the format string as its title.
     * <br>
     * <br>See also: [ctor&#64;Toast.new]
     * @param format the formatted string for the toast title
     * @param _elipse the parameters to insert into the format string
     * @return the newly created toast object
    */
    public static Toast newFormatToast(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaToast.INST().adw_toast_new_format(asCPointerNotNull(format), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Toast:newFormat");
        }
        return new Toast(__self);
    }        
    

    /**
     * Creates a new `AdwToast`.
     * <br>
     * <br>The toast will use the format string as its title.
     * <br>
     * <br>See also: [ctor&#64;Toast.new]
     * @param format the formatted string for the toast title
     * @param _elipse the parameters to insert into the format string
     * @return the newly created toast object
    */
    public static Toast newFormatToast(String format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaToast.INST().adw_toast_new_format(format, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Toast:newFormat");
        }
        return new Toast(__self);
    }        
    

    /**
     * Creates a new `AdwToast`.
     * <br>
     * <br>The toast will use &#64;title as its title.
     * <br>
     * <br>&#64;title can be marked up with the Pango text markup language.
     * @param title the title to be displayed
    */
    public Toast(@Nonnull ch.bailu.gtk.type.Str title) {
        super(cast(JnaToast.INST().adw_toast_new(asCPointerNotNull(title))));
    }

    /**
     * Creates a new `AdwToast`.
     * <br>
     * <br>The toast will use &#64;title as its title.
     * <br>
     * <br>&#64;title can be marked up with the Pango text markup language.
     * @param title the title to be displayed
    */
    public Toast(String title) {
        super(cast(JnaToast.INST().adw_toast_new(title)));
    }

    /**
     * Dismisses &#64;self.
     * <br>
     * <br>Does nothing if &#64;self has already been dismissed, or hasn't been added to an
     * <br>[class&#64;ToastOverlay].
    */
    public void dismiss()  {
        JnaToast.INST().adw_toast_dismiss(asCPointer());
    }

    /**
     * Gets the name of the associated action.
     * @return the action name
    */
    public ch.bailu.gtk.type.Str getActionName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaToast.INST().adw_toast_get_action_name(asCPointer())));
    }

    /**
     * Gets the parameter for action invocations.
     * @return the action target
    */
    public ch.bailu.gtk.glib.Variant getActionTargetValue()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaToast.INST().adw_toast_get_action_target_value(asCPointer())));
    }

    /**
     * Gets the label to show on the button.
     * @return the button label
    */
    public ch.bailu.gtk.type.Str getButtonLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaToast.INST().adw_toast_get_button_label(asCPointer())));
    }

    /**
     * Gets the custom title widget of &#64;self.
     * @return the custom title widget
    */
    public ch.bailu.gtk.gtk.Widget getCustomTitle()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaToast.INST().adw_toast_get_custom_title(asCPointer())));
    }

    /**
     * Gets priority for &#64;self.
     * @return the priority
    */
    public int getPriority()  {
        return JnaToast.INST().adw_toast_get_priority(asCPointer());
    }

    /**
     * Gets timeout for &#64;self.
     * @return the timeout
    */
    public int getTimeout()  {
        return JnaToast.INST().adw_toast_get_timeout(asCPointer());
    }

    /**
     * Gets the title that will be displayed on the toast.
     * <br>
     * <br>If a custom title has been set with [method&#64;Adw.Toast.set_custom_title]
     * <br>the return value will be %NULL.
     * @return the title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaToast.INST().adw_toast_get_title(asCPointer())));
    }

    /**
     * Sets the name of the associated action.
     * <br>
     * <br>It will be activated when clicking the button.
     * <br>
     * <br>See [property&#64;Toast:action-target].
     * @param action_name the action name
    */
    public void setActionName(@Nullable ch.bailu.gtk.type.Str action_name)  {
        JnaToast.INST().adw_toast_set_action_name(asCPointer(), asCPointer(action_name));
    }

    /**
     * Sets the name of the associated action.
     * <br>
     * <br>It will be activated when clicking the button.
     * <br>
     * <br>See [property&#64;Toast:action-target].
     * @param action_name the action name
    */
    public void setActionName(String action_name)  {
        JnaToast.INST().adw_toast_set_action_name(asCPointer(), action_name);
    }

    /**
     * Sets the parameter for action invocations.
     * <br>
     * <br>This is a convenience function that calls [ctor&#64;GLib.Variant.new] for
     * <br>&#64;format_string and uses the result to call
     * <br>[method&#64;Toast.set_action_target_value].
     * <br>
     * <br>If you are setting a string-valued target and want to set
     * <br>the action name at the same time, you can use
     * <br>[method&#64;Toast.set_detailed_action_name].
     * @param format_string a variant format string
     * @param _elipse arguments appropriate for &#64;target_format
    */
    public void setActionTarget(@Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaToast.INST().adw_toast_set_action_target(asCPointer(), asCPointer(format_string), _elipse);
    }

    /**
     * Sets the parameter for action invocations.
     * <br>
     * <br>This is a convenience function that calls [ctor&#64;GLib.Variant.new] for
     * <br>&#64;format_string and uses the result to call
     * <br>[method&#64;Toast.set_action_target_value].
     * <br>
     * <br>If you are setting a string-valued target and want to set
     * <br>the action name at the same time, you can use
     * <br>[method&#64;Toast.set_detailed_action_name].
     * @param format_string a variant format string
     * @param _elipse arguments appropriate for &#64;target_format
    */
    public void setActionTarget(String format_string, java.lang.Object... _elipse)  {
        JnaToast.INST().adw_toast_set_action_target(asCPointer(), format_string, _elipse);
    }

    /**
     * Sets the parameter for action invocations.
     * <br>
     * <br>If the &#64;action_target variant has a floating reference this function
     * <br>will sink it.
     * @param action_target the action target
    */
    public void setActionTargetValue(@Nullable ch.bailu.gtk.glib.Variant action_target)  {
        JnaToast.INST().adw_toast_set_action_target_value(asCPointer(), asCPointer(action_target));
    }

    /**
     * Sets the label to show on the button.
     * <br>
     * <br>Underlines in the button text can be used to indicate a mnemonic.
     * <br>
     * <br>If set to `NULL`, the button won't be shown.
     * <br>
     * <br>See [property&#64;Toast:action-name].
     * @param button_label a button label
    */
    public void setButtonLabel(@Nullable ch.bailu.gtk.type.Str button_label)  {
        JnaToast.INST().adw_toast_set_button_label(asCPointer(), asCPointer(button_label));
    }

    /**
     * Sets the label to show on the button.
     * <br>
     * <br>Underlines in the button text can be used to indicate a mnemonic.
     * <br>
     * <br>If set to `NULL`, the button won't be shown.
     * <br>
     * <br>See [property&#64;Toast:action-name].
     * @param button_label a button label
    */
    public void setButtonLabel(String button_label)  {
        JnaToast.INST().adw_toast_set_button_label(asCPointer(), button_label);
    }

    /**
     * Sets the custom title widget of &#64;self.
     * <br>
     * <br>It will be displayed instead of the title if set. In this case,
     * <br>[property&#64;Toast:title] is ignored.
     * <br>
     * <br>Setting a custom title will unset [property&#64;Toast:title].
     * @param widget the custom title widget
    */
    public void setCustomTitle(@Nullable ch.bailu.gtk.gtk.Widget widget)  {
        JnaToast.INST().adw_toast_set_custom_title(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets the action name and its parameter.
     * <br>
     * <br>&#64;detailed_action_name is a string in the format accepted by
     * <br>[func&#64;Gio.Action.parse_detailed_name].
     * @param detailed_action_name the detailed action name
    */
    public void setDetailedActionName(@Nullable ch.bailu.gtk.type.Str detailed_action_name)  {
        JnaToast.INST().adw_toast_set_detailed_action_name(asCPointer(), asCPointer(detailed_action_name));
    }

    /**
     * Sets the action name and its parameter.
     * <br>
     * <br>&#64;detailed_action_name is a string in the format accepted by
     * <br>[func&#64;Gio.Action.parse_detailed_name].
     * @param detailed_action_name the detailed action name
    */
    public void setDetailedActionName(String detailed_action_name)  {
        JnaToast.INST().adw_toast_set_detailed_action_name(asCPointer(), detailed_action_name);
    }

    /**
     * Sets priority for &#64;self.
     * <br>
     * <br>Priority controls how the toast behaves when another toast is already
     * <br>being displayed.
     * <br>
     * <br>If &#64;priority is `ADW_TOAST_PRIORITY_NORMAL`, the toast will be queued.
     * <br>
     * <br>If &#64;priority is `ADW_TOAST_PRIORITY_HIGH`, the toast will be displayed
     * <br>immediately, pushing the previous toast into the queue instead.
     * @param priority the priority
    */
    public void setPriority(int priority)  {
        JnaToast.INST().adw_toast_set_priority(asCPointer(), priority);
    }

    /**
     * Sets timeout for &#64;self.
     * <br>
     * <br>If &#64;timeout is 0, the toast is displayed indefinitely until manually
     * <br>dismissed.
     * <br>
     * <br>Toasts cannot disappear while being hovered, pressed (on touchscreen), or
     * <br>have keyboard focus inside them.
     * @param timeout the timeout
    */
    public void setTimeout(int timeout)  {
        JnaToast.INST().adw_toast_set_timeout(asCPointer(), timeout);
    }

    /**
     * Sets the title that will be displayed on the toast.
     * <br>
     * <br>The title can be marked up with the Pango text markup language.
     * <br>
     * <br>Setting a title will unset [property&#64;Toast:custom-title].
     * <br>
     * <br>If [property&#64;Toast:custom-title] is set, it will be used instead.
     * @param title a title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaToast.INST().adw_toast_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title that will be displayed on the toast.
     * <br>
     * <br>The title can be marked up with the Pango text markup language.
     * <br>
     * <br>Setting a title will unset [property&#64;Toast:custom-title].
     * <br>
     * <br>If [property&#64;Toast:custom-title] is set, it will be used instead.
     * @param title a title
    */
    public void setTitle(String title)  {
        JnaToast.INST().adw_toast_set_title(asCPointer(), title);
    }

    public final static String SIGNAL_ON_BUTTON_CLICKED = "button-clicked";
    
    /**
     * Connect to signal "button-clicked".
     * <br>See {@link OnButtonClicked#onButtonClicked} for signal description.
     * <br>Field {@link #SIGNAL_ON_BUTTON_CLICKED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onButtonClicked(OnButtonClicked signal) {
        return connectSignal(SIGNAL_ON_BUTTON_CLICKED, toOnButtonClicked(signal));
    }

    public final static String SIGNAL_ON_DISMISSED = "dismissed";
    
    /**
     * Connect to signal "dismissed".
     * <br>See {@link OnDismissed#onDismissed} for signal description.
     * <br>Field {@link #SIGNAL_ON_DISMISSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDismissed(OnDismissed signal) {
        return connectSignal(SIGNAL_ON_DISMISSED, toOnDismissed(signal));
    }

    public static long getTypeID() { 
        return JnaToast.INST().adw_toast_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
