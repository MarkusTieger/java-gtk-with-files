/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Dialogs are a convenient way to prompt the user for a small amount
 * <br>of input.
 * <br>
 * <br>![An example GtkDialog](dialog.png)
 * <br>
 * <br>Typical uses are to display a message, ask a question, or anything else
 * <br>that does not require extensive effort on the user’s part.
 * <br>
 * <br>The main area of a `GtkDialog` is called the &quot;content area&quot;, and is yours
 * <br>to populate with widgets such a `GtkLabel` or `GtkEntry`, to present
 * <br>your information, questions, or tasks to the user.
 * <br>
 * <br>In addition, dialogs allow you to add &quot;action widgets&quot;. Most commonly,
 * <br>action widgets are buttons. Depending on the platform, action widgets may
 * <br>be presented in the header bar at the top of the window, or at the bottom
 * <br>of the window. To add action widgets, create your `GtkDialog` using
 * <br>[ctor&#64;Gtk.Dialog.new_with_buttons], or use
 * <br>[method&#64;Gtk.Dialog.add_button], [method&#64;Gtk.Dialog.add_buttons],
 * <br>or [method&#64;Gtk.Dialog.add_action_widget].
 * <br>
 * <br>`GtkDialogs` uses some heuristics to decide whether to add a close
 * <br>button to the window decorations. If any of the action buttons use
 * <br>the response ID %GTK_RESPONSE_CLOSE or %GTK_RESPONSE_CANCEL, the
 * <br>close button is omitted.
 * <br>
 * <br>Clicking a button that was added as an action widget will emit the
 * <br>[signal&#64;Gtk.Dialog::response] signal with a response ID that you specified.
 * <br>GTK will never assign a meaning to positive response IDs; these are
 * <br>entirely user-defined. But for convenience, you can use the response
 * <br>IDs in the [enum&#64;Gtk.ResponseType] enumeration (these all have values
 * <br>less than zero). If a dialog receives a delete event, the
 * <br>[signal&#64;Gtk.Dialog::response] signal will be emitted with the
 * <br>%GTK_RESPONSE_DELETE_EVENT response ID.
 * <br>
 * <br>Dialogs are created with a call to [ctor&#64;Gtk.Dialog.new] or
 * <br>[ctor&#64;Gtk.Dialog.new_with_buttons]. The latter is recommended; it allows
 * <br>you to set the dialog title, some convenient flags, and add buttons.
 * <br>
 * <br>A “modal” dialog (that is, one which freezes the rest of the application
 * <br>from user input), can be created by calling [method&#64;Gtk.Window.set_modal]
 * <br>on the dialog. When using [ctor&#64;Gtk.Dialog.new_with_buttons], you can also
 * <br>pass the %GTK_DIALOG_MODAL flag to make a dialog modal.
 * <br>
 * <br>For the simple dialog in the following example, a [class&#64;Gtk.MessageDialog]
 * <br>would save some effort. But you’d need to create the dialog contents manually
 * <br>if you had more than a simple message in the dialog.
 * <br>
 * <br>An example for simple `GtkDialog` usage:
 * <br>
 * <br>```c
 * <br>// Function to open a dialog box with a message
 * <br>void
 * <br>quick_message (GtkWindow *parent, char *message)
 * <br>{
 * <br> GtkWidget *dialog, *label, *content_area;
 * <br> GtkDialogFlags flags;
 * <br>
 * <br> // Create the widgets
 * <br> flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 * <br> dialog = gtk_dialog_new_with_buttons (&quot;Message&quot;,
 * <br>                                       parent,
 * <br>                                       flags,
 * <br>                                       _(&quot;_OK&quot;),
 * <br>                                       GTK_RESPONSE_NONE,
 * <br>                                       NULL);
 * <br> content_area = gtk_dialog_get_content_area (GTK_DIALOG (dialog));
 * <br> label = gtk_label_new (message);
 * <br>
 * <br> // Ensure that the dialog box is destroyed when the user responds
 * <br>
 * <br> g_signal_connect_swapped (dialog,
 * <br>                           &quot;response&quot;,
 * <br>                           G_CALLBACK (gtk_window_destroy),
 * <br>                           dialog);
 * <br>
 * <br> // Add the label, and show everything we’ve added
 * <br>
 * <br> gtk_box_append (GTK_BOX (content_area), label);
 * <br> gtk_widget_show (dialog);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35; GtkDialog as GtkBuildable
 * <br>
 * <br>The `GtkDialog` implementation of the `GtkBuildable` interface exposes the
 * <br>&#64;content_area as an internal child with the name “content_area”.
 * <br>
 * <br>`GtkDialog` supports a custom `&lt;action-widgets&gt;` element, which can contain
 * <br>multiple `&lt;action-widget&gt;` elements. The “response” attribute specifies a
 * <br>numeric response, and the content of the element is the id of widget
 * <br>(which should be a child of the dialogs &#64;action_area). To mark a response
 * <br>as default, set the “default” attribute of the `&lt;action-widget&gt;` element
 * <br>to true.
 * <br>
 * <br>`GtkDialog` supports adding action widgets by specifying “action” as
 * <br>the “type” attribute of a `&lt;child&gt;` element. The widget will be added
 * <br>either to the action area or the headerbar of the dialog, depending
 * <br>on the “use-header-bar” property. The response id has to be associated
 * <br>with the action widget using the `&lt;action-widgets&gt;` element.
 * <br>
 * <br>An example of a `GtkDialog` UI definition fragment:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkDialog&quot; id=&quot;dialog1&quot;&gt;
 * <br>  &lt;child type=&quot;action&quot;&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button_cancel&quot;/&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child type=&quot;action&quot;&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button_ok&quot;&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;action-widgets&gt;
 * <br>    &lt;action-widget response=&quot;cancel&quot;&gt;button_cancel&lt;/action-widget&gt;
 * <br>    &lt;action-widget response=&quot;ok&quot; default=&quot;true&quot;&gt;button_ok&lt;/action-widget&gt;
 * <br>  &lt;/action-widgets&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkDialog` uses the %GTK_ACCESSIBLE_ROLE_DIALOG role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Dialog.html">https://docs.gtk.org/gtk4/class.Dialog.html</a></p>
*/
public class Dialog extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Dialog.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClose {
        /**
         * Emitted when the user uses a keybinding to close the dialog.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is the Escape key.
        */
        void onClose();
    }
    
    private static com.sun.jna.Callback toOnClose(OnClose in) {
        return (in == null) ? null: (JnaDialog.OnClose) (__self, __data) -> in.onClose();
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * Emitted when an action widget is clicked.
         * <br>
         * <br>The signal is also emitted when the dialog receives a
         * <br>delete event, and when [method&#64;Gtk.Dialog.response] is called.
         * <br>On a delete event, the response ID is %GTK_RESPONSE_DELETE_EVENT.
         * <br>Otherwise, it depends on which action widget was clicked.
         * @param response_id the response ID
        */
        void onResponse(int response_id);
    }
    
    private static com.sun.jna.Callback toOnResponse(OnResponse in) {
        return (in == null) ? null: (JnaDialog.OnResponse) (__self, _response_id, __data) -> in.onResponse(_response_id);
    }

    public Dialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDialog` with the given title and transient parent.
     * <br>
     * <br>The &#64;flags argument can be used to make the dialog modal, have it
     * <br>destroyed along with its transient parent, or make it use a headerbar.
     * <br>
     * <br>Button text/response ID pairs should be listed in pairs, with a %NULL
     * <br>pointer ending the list. Button text can be arbitrary text. A response
     * <br>ID can be any positive number, or one of the values in the
     * <br>[enum&#64;Gtk.ResponseType] enumeration. If the user clicks one of these
     * <br>buttons, `GtkDialog` will emit the [signal&#64;Gtk.Dialog::response] signal
     * <br>with the corresponding response ID.
     * <br>
     * <br>If a `GtkDialog` receives a delete event, it will emit ::response with a
     * <br>response ID of %GTK_RESPONSE_DELETE_EVENT.
     * <br>
     * <br>However, destroying a dialog does not emit the ::response signal;
     * <br>so be careful relying on ::response when using the
     * <br>%GTK_DIALOG_DESTROY_WITH_PARENT flag.
     * <br>
     * <br>Here’s a simple example:
     * <br>```c
     * <br>GtkWindow *main_app_window; // Window the dialog should show up on
     * <br>GtkWidget *dialog;
     * <br>GtkDialogFlags flags = GTK_DIALOG_MODAL | GTK_DIALOG_DESTROY_WITH_PARENT;
     * <br>dialog = gtk_dialog_new_with_buttons (&quot;My dialog&quot;,
     * <br>                                      main_app_window,
     * <br>                                      flags,
     * <br>                                      _(&quot;_OK&quot;),
     * <br>                                      GTK_RESPONSE_ACCEPT,
     * <br>                                      _(&quot;_Cancel&quot;),
     * <br>                                      GTK_RESPONSE_REJECT,
     * <br>                                      NULL);
     * <br>```
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param flags from `GtkDialogFlags`
     * @param first_button_text text to go in first button
     * @param _elipse response ID for first button, then additional buttons, ending with %NULL
     * @return a new `GtkDialog`
    */
    public static Dialog newWithButtonsDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent, int flags, @Nullable ch.bailu.gtk.type.Str first_button_text, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaDialog.INST().gtk_dialog_new_with_buttons(asCPointer(title), asCPointer(parent), flags, asCPointer(first_button_text), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Dialog:newWithButtons");
        }
        return new Dialog(__self);
    }        
    

    /**
     * Creates a new `GtkDialog` with the given title and transient parent.
     * <br>
     * <br>The &#64;flags argument can be used to make the dialog modal, have it
     * <br>destroyed along with its transient parent, or make it use a headerbar.
     * <br>
     * <br>Button text/response ID pairs should be listed in pairs, with a %NULL
     * <br>pointer ending the list. Button text can be arbitrary text. A response
     * <br>ID can be any positive number, or one of the values in the
     * <br>[enum&#64;Gtk.ResponseType] enumeration. If the user clicks one of these
     * <br>buttons, `GtkDialog` will emit the [signal&#64;Gtk.Dialog::response] signal
     * <br>with the corresponding response ID.
     * <br>
     * <br>If a `GtkDialog` receives a delete event, it will emit ::response with a
     * <br>response ID of %GTK_RESPONSE_DELETE_EVENT.
     * <br>
     * <br>However, destroying a dialog does not emit the ::response signal;
     * <br>so be careful relying on ::response when using the
     * <br>%GTK_DIALOG_DESTROY_WITH_PARENT flag.
     * <br>
     * <br>Here’s a simple example:
     * <br>```c
     * <br>GtkWindow *main_app_window; // Window the dialog should show up on
     * <br>GtkWidget *dialog;
     * <br>GtkDialogFlags flags = GTK_DIALOG_MODAL | GTK_DIALOG_DESTROY_WITH_PARENT;
     * <br>dialog = gtk_dialog_new_with_buttons (&quot;My dialog&quot;,
     * <br>                                      main_app_window,
     * <br>                                      flags,
     * <br>                                      _(&quot;_OK&quot;),
     * <br>                                      GTK_RESPONSE_ACCEPT,
     * <br>                                      _(&quot;_Cancel&quot;),
     * <br>                                      GTK_RESPONSE_REJECT,
     * <br>                                      NULL);
     * <br>```
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param flags from `GtkDialogFlags`
     * @param first_button_text text to go in first button
     * @param _elipse response ID for first button, then additional buttons, ending with %NULL
     * @return a new `GtkDialog`
    */
    public static Dialog newWithButtonsDialog(String title, @Nullable Window parent, int flags, String first_button_text, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaDialog.INST().gtk_dialog_new_with_buttons(title, asCPointer(parent), flags, first_button_text, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Dialog:newWithButtons");
        }
        return new Dialog(__self);
    }        
    

    /**
     * Creates a new dialog box.
     * <br>
     * <br>Widgets should not be packed into the `GtkWindow`
     * <br>directly, but into the &#64;content_area and &#64;action_area,
     * <br>as described above.
    */
    public Dialog() {
        super(cast(JnaDialog.INST().gtk_dialog_new()));
    }

    /**
     * Adds an activatable widget to the action area of a `GtkDialog`.
     * <br>
     * <br>GTK connects a signal handler that will emit the
     * <br>[signal&#64;Gtk.Dialog::response] signal on the dialog when the widget
     * <br>is activated. The widget is appended to the end of the dialog’s action
     * <br>area.
     * <br>
     * <br>If you want to add a non-activatable widget, simply pack it into
     * <br>the &#64;action_area field of the `GtkDialog` struct.
     * @param child an activatable widget
     * @param response_id response ID for &#64;child
    */
    public void addActionWidget(@Nonnull Widget child, int response_id)  {
        JnaDialog.INST().gtk_dialog_add_action_widget(asCPointer(), asCPointerNotNull(child), response_id);
    }

    /**
     * Adds a button with the given text.
     * <br>
     * <br>GTK arranges things so that clicking the button will emit the
     * <br>[signal&#64;Gtk.Dialog::response] signal with the given &#64;response_id.
     * <br>The button is appended to the end of the dialog’s action area.
     * <br>The button widget is returned, but usually you don’t need it.
     * @param button_text text of button
     * @param response_id response ID for the button
     * @return the `GtkButton` widget that was added
    */
    public Widget addButton(@Nonnull ch.bailu.gtk.type.Str button_text, int response_id)  {
        return new Widget(new PointerContainer(JnaDialog.INST().gtk_dialog_add_button(asCPointer(), asCPointerNotNull(button_text), response_id)));
    }

    /**
     * Adds a button with the given text.
     * <br>
     * <br>GTK arranges things so that clicking the button will emit the
     * <br>[signal&#64;Gtk.Dialog::response] signal with the given &#64;response_id.
     * <br>The button is appended to the end of the dialog’s action area.
     * <br>The button widget is returned, but usually you don’t need it.
     * @param button_text text of button
     * @param response_id response ID for the button
     * @return the `GtkButton` widget that was added
    */
    public Widget addButton(String button_text, int response_id)  {
        return new Widget(new PointerContainer(JnaDialog.INST().gtk_dialog_add_button(asCPointer(), button_text, response_id)));
    }

    /**
     * Adds multiple buttons.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.Dialog.add_button]
     * <br>repeatedly. The variable argument list should be %NULL-terminated
     * <br>as with [ctor&#64;Gtk.Dialog.new_with_buttons]. Each button must have both
     * <br>text and response ID.
     * @param first_button_text button text
     * @param _elipse response ID for first button, then more text-response_id pairs
    */
    public void addButtons(@Nonnull ch.bailu.gtk.type.Str first_button_text, java.lang.Object... _elipse)  {
        JnaDialog.INST().gtk_dialog_add_buttons(asCPointer(), asCPointerNotNull(first_button_text), _elipse);
    }

    /**
     * Adds multiple buttons.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.Dialog.add_button]
     * <br>repeatedly. The variable argument list should be %NULL-terminated
     * <br>as with [ctor&#64;Gtk.Dialog.new_with_buttons]. Each button must have both
     * <br>text and response ID.
     * @param first_button_text button text
     * @param _elipse response ID for first button, then more text-response_id pairs
    */
    public void addButtons(String first_button_text, java.lang.Object... _elipse)  {
        JnaDialog.INST().gtk_dialog_add_buttons(asCPointer(), first_button_text, _elipse);
    }

    /**
     * Returns the content area of &#64;dialog.
     * @return the content area `GtkBox`.
    */
    public Box getContentArea()  {
        return new Box(new PointerContainer(JnaDialog.INST().gtk_dialog_get_content_area(asCPointer())));
    }

    /**
     * Returns the header bar of &#64;dialog.
     * <br>
     * <br>Note that the headerbar is only used by the dialog if the
     * <br>[property&#64;Gtk.Dialog:use-header-bar] property is %TRUE.
     * @return the header bar
    */
    public HeaderBar getHeaderBar()  {
        return new HeaderBar(new PointerContainer(JnaDialog.INST().gtk_dialog_get_header_bar(asCPointer())));
    }

    /**
     * Gets the response id of a widget in the action area
     * <br>of a dialog.
     * @param widget a widget in the action area of &#64;dialog
     * @return the response id of &#64;widget, or %GTK_RESPONSE_NONE  if &#64;widget doesn’t have a response id set.
    */
    public int getResponseForWidget(@Nonnull Widget widget)  {
        return JnaDialog.INST().gtk_dialog_get_response_for_widget(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets the widget button that uses the given response ID in the action area
     * <br>of a dialog.
     * @param response_id the response ID used by the &#64;dialog widget
     * @return the &#64;widget button that uses the given   &#64;response_id
    */
    public Widget getWidgetForResponse(int response_id)  {
        return new Widget(new PointerContainer(JnaDialog.INST().gtk_dialog_get_widget_for_response(asCPointer(), response_id)));
    }

    /**
     * Emits the ::response signal with the given response ID.
     * <br>
     * <br>Used to indicate that the user has responded to the dialog in some way.
     * @param response_id response ID
    */
    public void response(int response_id)  {
        JnaDialog.INST().gtk_dialog_response(asCPointer(), response_id);
    }

    /**
     * Sets the default widget for the dialog based on the response ID.
     * <br>
     * <br>Pressing “Enter” normally activates the default widget.
     * @param response_id a response ID
    */
    public void setDefaultResponse(int response_id)  {
        JnaDialog.INST().gtk_dialog_set_default_response(asCPointer(), response_id);
    }

    /**
     * A convenient way to sensitize/desensitize dialog buttons.
     * <br>
     * <br>Calls `gtk_widget_set_sensitive (widget, &#64;setting)`
     * <br>for each widget in the dialog’s action area with the given &#64;response_id.
     * @param response_id a response ID
     * @param setting %TRUE for sensitive
    */
    public void setResponseSensitive(int response_id, boolean setting)  {
        JnaDialog.INST().gtk_dialog_set_response_sensitive(asCPointer(), response_id, setting);
    }

    public final static String SIGNAL_ON_CLOSE = "close";
    
    /**
     * Connect to signal "close".
     * <br>See {@link OnClose#onClose} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClose(OnClose signal) {
        return connectSignal(SIGNAL_ON_CLOSE, toOnClose(signal));
    }

    public final static String SIGNAL_ON_RESPONSE = "response";
    
    /**
     * Connect to signal "response".
     * <br>See {@link OnResponse#onResponse} for signal description.
     * <br>Field {@link #SIGNAL_ON_RESPONSE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onResponse(OnResponse signal) {
        return connectSignal(SIGNAL_ON_RESPONSE, toOnResponse(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaDialog.INST().gtk_dialog_get_type(); 
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
