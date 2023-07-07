/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkInfoBar` can be show messages to the user without a dialog.
 * <br>
 * <br>![An example GtkInfoBar](info-bar.png)
 * <br>
 * <br>It is often temporarily shown at the top or bottom of a document.
 * <br>In contrast to [class&#64;Gtk.Dialog], which has an action area at the
 * <br>bottom, `GtkInfoBar` has an action area at the side.
 * <br>
 * <br>The API of `GtkInfoBar` is very similar to `GtkDialog`, allowing you
 * <br>to add buttons to the action area with [method&#64;Gtk.InfoBar.add_button]
 * <br>or [ctor&#64;Gtk.InfoBar.new_with_buttons]. The sensitivity of action widgets
 * <br>can be controlled with [method&#64;Gtk.InfoBar.set_response_sensitive].
 * <br>
 * <br>To add widgets to the main content area of a `GtkInfoBar`, use
 * <br>[method&#64;Gtk.InfoBar.add_child].
 * <br>
 * <br>Similar to [class&#64;Gtk.MessageDialog], the contents of a `GtkInfoBar`
 * <br>can by classified as error message, warning, informational message, etc,
 * <br>by using [method&#64;Gtk.InfoBar.set_message_type]. GTK may use the message
 * <br>type to determine how the message is displayed.
 * <br>
 * <br>A simple example for using a `GtkInfoBar`:
 * <br>```c
 * <br>GtkWidget *message_label;
 * <br>GtkWidget *widget;
 * <br>GtkWidget *grid;
 * <br>GtkInfoBar *bar;
 * <br>
 * <br>// set up info bar
 * <br>widget = gtk_info_bar_new ();
 * <br>bar = GTK_INFO_BAR (widget);
 * <br>grid = gtk_grid_new ();
 * <br>
 * <br>message_label = gtk_label_new (&quot;&quot;);
 * <br>gtk_info_bar_add_child (bar, message_label);
 * <br>gtk_info_bar_add_button (bar,
 * <br>                         _(&quot;_OK&quot;),
 * <br>                         GTK_RESPONSE_OK);
 * <br>g_signal_connect (bar,
 * <br>                  &quot;response&quot;,
 * <br>                  G_CALLBACK (gtk_widget_hide),
 * <br>                  NULL);
 * <br>gtk_grid_attach (GTK_GRID (grid),
 * <br>                 widget,
 * <br>                 0, 2, 1, 1);
 * <br>
 * <br>// ...
 * <br>
 * <br>// show an error message
 * <br>gtk_label_set_text (GTK_LABEL (message_label), &quot;An error occurred!&quot;);
 * <br>gtk_info_bar_set_message_type (bar, GTK_MESSAGE_ERROR);
 * <br>gtk_widget_show (bar);
 * <br>```
 * <br>
 * <br>&#35; GtkInfoBar as GtkBuildable
 * <br>
 * <br>`GtkInfoBar` supports a custom `&lt;action-widgets&gt;` element, which can contain
 * <br>multiple `&lt;action-widget&gt;` elements. The “response” attribute specifies a
 * <br>numeric response, and the content of the element is the id of widget
 * <br>(which should be a child of the dialogs &#64;action_area).
 * <br>
 * <br>`GtkInfoBar` supports adding action widgets by specifying “action” as
 * <br>the “type” attribute of a `&lt;child&gt;` element. The widget will be added
 * <br>either to the action area. The response id has to be associated
 * <br>with the action widget using the `&lt;action-widgets&gt;` element.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkInfoBar` has a single CSS node with name infobar. The node may get
 * <br>one of the style classes .info, .warning, .error or .question, depending
 * <br>on the message type.
 * <br>If the info bar shows a close button, that button will have the .close
 * <br>style class applied.
 * <p><a href="https://docs.gtk.org/gtk4/class.InfoBar.html">https://docs.gtk.org/gtk4/class.InfoBar.html</a></p>
*/
public class InfoBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InfoBar.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClose {
        /**
         * Gets emitted when the user uses a keybinding to dismiss the info bar.
         * <br>
         * <br>The ::close signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is the Escape key.
        */
        void onClose();
    }
    
    private static com.sun.jna.Callback toOnClose(OnClose in) {
        return (in == null) ? null: (JnaInfoBar.OnClose) (__self, __data) -> in.onClose();
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * Emitted when an action widget is clicked.
         * <br>
         * <br>The signal is also emitted when the application programmer
         * <br>calls [method&#64;Gtk.InfoBar.response]. The &#64;response_id depends
         * <br>on which action widget was clicked.
         * @param response_id the response ID
        */
        void onResponse(int response_id);
    }
    
    private static com.sun.jna.Callback toOnResponse(OnResponse in) {
        return (in == null) ? null: (JnaInfoBar.OnResponse) (__self, _response_id, __data) -> in.onResponse(_response_id);
    }

    public InfoBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkInfoBar` with buttons.
     * <br>
     * <br>Button text/response ID pairs should be listed, with a %NULL pointer
     * <br>ending the list. A response ID can be any positive number,
     * <br>or one of the values in the `GtkResponseType` enumeration. If the
     * <br>user clicks one of these dialog buttons, GtkInfoBar will emit
     * <br>the [signal&#64;Gtk.InfoBar::response] signal with the corresponding
     * <br>response ID.
     * @param first_button_text ext to go in first button
     * @param _elipse response ID for first button, then additional buttons, ending    with %NULL
     * @return a new `GtkInfoBar`
    */
    public static InfoBar newWithButtonsInfoBar(@Nullable ch.bailu.gtk.type.Str first_button_text, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaInfoBar.INST().gtk_info_bar_new_with_buttons(asCPointer(first_button_text), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("InfoBar:newWithButtons");
        }
        return new InfoBar(__self);
    }        
    

    /**
     * Creates a new `GtkInfoBar` with buttons.
     * <br>
     * <br>Button text/response ID pairs should be listed, with a %NULL pointer
     * <br>ending the list. A response ID can be any positive number,
     * <br>or one of the values in the `GtkResponseType` enumeration. If the
     * <br>user clicks one of these dialog buttons, GtkInfoBar will emit
     * <br>the [signal&#64;Gtk.InfoBar::response] signal with the corresponding
     * <br>response ID.
     * @param first_button_text ext to go in first button
     * @param _elipse response ID for first button, then additional buttons, ending    with %NULL
     * @return a new `GtkInfoBar`
    */
    public static InfoBar newWithButtonsInfoBar(String first_button_text, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaInfoBar.INST().gtk_info_bar_new_with_buttons(first_button_text, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("InfoBar:newWithButtons");
        }
        return new InfoBar(__self);
    }        
    

    /**
     * Creates a new `GtkInfoBar` object.
    */
    public InfoBar() {
        super(cast(JnaInfoBar.INST().gtk_info_bar_new()));
    }

    /**
     * Add an activatable widget to the action area of a `GtkInfoBar`.
     * <br>
     * <br>This also connects a signal handler that will emit the
     * <br>[signal&#64;Gtk.InfoBar::response] signal on the message area
     * <br>when the widget is activated. The widget is appended to the
     * <br>end of the message areas action area.
     * @param child an activatable widget
     * @param response_id response ID for &#64;child
    */
    public void addActionWidget(@Nonnull Widget child, int response_id)  {
        JnaInfoBar.INST().gtk_info_bar_add_action_widget(asCPointer(), asCPointerNotNull(child), response_id);
    }

    /**
     * Adds a button with the given text.
     * <br>
     * <br>Clicking the button will emit the [signal&#64;Gtk.InfoBar::response]
     * <br>signal with the given response_id. The button is appended to the
     * <br>end of the info bars's action area. The button widget is returned,
     * <br>but usually you don't need it.
     * @param button_text text of button
     * @param response_id response ID for the button
     * @return the `GtkButton` widget that was added
    */
    public Button addButton(@Nonnull ch.bailu.gtk.type.Str button_text, int response_id)  {
        return new Button(new PointerContainer(JnaInfoBar.INST().gtk_info_bar_add_button(asCPointer(), asCPointerNotNull(button_text), response_id)));
    }

    /**
     * Adds a button with the given text.
     * <br>
     * <br>Clicking the button will emit the [signal&#64;Gtk.InfoBar::response]
     * <br>signal with the given response_id. The button is appended to the
     * <br>end of the info bars's action area. The button widget is returned,
     * <br>but usually you don't need it.
     * @param button_text text of button
     * @param response_id response ID for the button
     * @return the `GtkButton` widget that was added
    */
    public Button addButton(String button_text, int response_id)  {
        return new Button(new PointerContainer(JnaInfoBar.INST().gtk_info_bar_add_button(asCPointer(), button_text, response_id)));
    }

    /**
     * Adds multiple buttons.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.InfoBar.add_button]
     * <br>repeatedly. The variable argument list should be %NULL-terminated
     * <br>as with [ctor&#64;Gtk.InfoBar.new_with_buttons]. Each button must have both
     * <br>text and response ID.
     * @param first_button_text button text
     * @param _elipse response ID for first button, then more text-response_id pairs,   ending with %NULL
    */
    public void addButtons(@Nonnull ch.bailu.gtk.type.Str first_button_text, java.lang.Object... _elipse)  {
        JnaInfoBar.INST().gtk_info_bar_add_buttons(asCPointer(), asCPointerNotNull(first_button_text), _elipse);
    }

    /**
     * Adds multiple buttons.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.InfoBar.add_button]
     * <br>repeatedly. The variable argument list should be %NULL-terminated
     * <br>as with [ctor&#64;Gtk.InfoBar.new_with_buttons]. Each button must have both
     * <br>text and response ID.
     * @param first_button_text button text
     * @param _elipse response ID for first button, then more text-response_id pairs,   ending with %NULL
    */
    public void addButtons(String first_button_text, java.lang.Object... _elipse)  {
        JnaInfoBar.INST().gtk_info_bar_add_buttons(asCPointer(), first_button_text, _elipse);
    }

    /**
     * Adds a widget to the content area of the info bar.
     * @param widget the child to be added
    */
    public void addChild(@Nonnull Widget widget)  {
        JnaInfoBar.INST().gtk_info_bar_add_child(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Returns the message type of the message area.
     * @return the message type of the message area.
    */
    public int getMessageType()  {
        return JnaInfoBar.INST().gtk_info_bar_get_message_type(asCPointer());
    }

    /**
     * Returns whether the info bar is currently revealed.
     * @return the current value of the [property&#64;Gtk.InfoBar:revealed] property
    */
    public boolean getRevealed()  {
        return JnaInfoBar.INST().gtk_info_bar_get_revealed(asCPointer());
    }

    /**
     * Returns whether the widget will display a standard close button.
     * @return %TRUE if the widget displays standard close button
    */
    public boolean getShowCloseButton()  {
        return JnaInfoBar.INST().gtk_info_bar_get_show_close_button(asCPointer());
    }

    /**
     * Removes a widget from the action area of &#64;info_bar.
     * <br>
     * <br>The widget must have been put there by a call to
     * <br>[method&#64;Gtk.InfoBar.add_action_widget] or [method&#64;Gtk.InfoBar.add_button].
     * @param widget an action widget to remove
    */
    public void removeActionWidget(@Nonnull Widget widget)  {
        JnaInfoBar.INST().gtk_info_bar_remove_action_widget(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Removes a widget from the content area of the info bar.
     * @param widget a child that has been added to the content area
    */
    public void removeChild(@Nonnull Widget widget)  {
        JnaInfoBar.INST().gtk_info_bar_remove_child(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Emits the “response” signal with the given &#64;response_id.
     * @param response_id a response ID
    */
    public void response(int response_id)  {
        JnaInfoBar.INST().gtk_info_bar_response(asCPointer(), response_id);
    }

    /**
     * Sets the last widget in the info bar’s action area with
     * <br>the given response_id as the default widget for the dialog.
     * <br>
     * <br>Pressing “Enter” normally activates the default widget.
     * <br>
     * <br>Note that this function currently requires &#64;info_bar to
     * <br>be added to a widget hierarchy.
     * @param response_id a response ID
    */
    public void setDefaultResponse(int response_id)  {
        JnaInfoBar.INST().gtk_info_bar_set_default_response(asCPointer(), response_id);
    }

    /**
     * Sets the message type of the message area.
     * <br>
     * <br>GTK uses this type to determine how the message is displayed.
     * @param message_type a `GtkMessageType`
    */
    public void setMessageType(int message_type)  {
        JnaInfoBar.INST().gtk_info_bar_set_message_type(asCPointer(), message_type);
    }

    /**
     * Sets the sensitivity of action widgets for &#64;response_id.
     * <br>
     * <br>Calls `gtk_widget_set_sensitive (widget, setting)` for each
     * <br>widget in the info bars’s action area with the given &#64;response_id.
     * <br>A convenient way to sensitize/desensitize buttons.
     * @param response_id a response ID
     * @param setting TRUE for sensitive
    */
    public void setResponseSensitive(int response_id, boolean setting)  {
        JnaInfoBar.INST().gtk_info_bar_set_response_sensitive(asCPointer(), response_id, setting);
    }

    /**
     * Sets whether the `GtkInfoBar` is revealed.
     * <br>
     * <br>Changing this will make &#64;info_bar reveal or conceal
     * <br>itself via a sliding transition.
     * <br>
     * <br>Note: this does not show or hide &#64;info_bar in the
     * <br>[property&#64;Gtk.Widget:visible] sense, so revealing has no effect
     * <br>if [property&#64;Gtk.Widget:visible] is %FALSE.
     * @param revealed The new value of the property
    */
    public void setRevealed(boolean revealed)  {
        JnaInfoBar.INST().gtk_info_bar_set_revealed(asCPointer(), revealed);
    }

    /**
     * If true, a standard close button is shown.
     * <br>
     * <br>When clicked it emits the response %GTK_RESPONSE_CLOSE.
     * @param setting %TRUE to include a close button
    */
    public void setShowCloseButton(boolean setting)  {
        JnaInfoBar.INST().gtk_info_bar_set_show_close_button(asCPointer(), setting);
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

    public static long getTypeID() { 
        return JnaInfoBar.INST().gtk_info_bar_get_type(); 
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
