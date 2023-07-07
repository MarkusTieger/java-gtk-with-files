/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A dialog presenting a message or a question.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;message-dialog-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;message-dialog.png&quot; alt=&quot;message-dialog&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>Message dialogs have a heading, a body, an optional child widget, and one or
 * <br>multiple responses, each presented as a button.
 * <br>
 * <br>Each response has a unique string ID, and a button label. Additionally, each
 * <br>response can be enabled or disabled, and can have a suggested or destructive
 * <br>appearance.
 * <br>
 * <br>When one of the responses is activated, or the dialog is closed, the
 * <br>[signal&#64;MessageDialog::response] signal will be emitted. This signal is
 * <br>detailed, and the detail, as well as the `response` parameter will be set to
 * <br>the ID of the activated response, or to the value of the
 * <br>[property&#64;MessageDialog:close-response] property if the dialog had been
 * <br>closed without activating any of the responses.
 * <br>
 * <br>Response buttons can be presented horizontally or vertically depending on
 * <br>available space.
 * <br>
 * <br>When a response is activated, `AdwMessageDialog` is closed automatically.
 * <br>
 * <br>An example of using a message dialog:
 * <br>
 * <br>```c
 * <br>GtkWidget *dialog;
 * <br>
 * <br>dialog = adw_message_dialog_new (parent, _(&quot;Replace File?&quot;), NULL);
 * <br>
 * <br>adw_message_dialog_format_body (ADW_MESSAGE_DIALOG (dialog),
 * <br>                                _(&quot;A file named “%s” already exists. Do you want to replace it?&quot;),
 * <br>                                filename);
 * <br>
 * <br>adw_message_dialog_add_responses (ADW_MESSAGE_DIALOG (dialog),
 * <br>                                  &quot;cancel&quot;,  _(&quot;_Cancel&quot;),
 * <br>                                  &quot;replace&quot;, _(&quot;_Replace&quot;),
 * <br>                                  NULL);
 * <br>
 * <br>adw_message_dialog_set_response_appearance (ADW_MESSAGE_DIALOG (dialog), &quot;replace&quot;, ADW_RESPONSE_DESTRUCTIVE);
 * <br>
 * <br>adw_message_dialog_set_default_response (ADW_MESSAGE_DIALOG (dialog), &quot;cancel&quot;);
 * <br>adw_message_dialog_set_close_response (ADW_MESSAGE_DIALOG (dialog), &quot;cancel&quot;);
 * <br>
 * <br>g_signal_connect (dialog, &quot;response&quot;, G_CALLBACK (response_cb), self);
 * <br>
 * <br>gtk_window_present (GTK_WINDOW (dialog));
 * <br>```
 * <br>
 * <br>&#35;&#35; AdwMessageDialog as GtkBuildable
 * <br>
 * <br>`AdwMessageDialog` supports adding responses in UI definitions by via the
 * <br>`&lt;responses&gt;` element that may contain multiple `&lt;response&gt;` elements, each
 * <br>respresenting a response.
 * <br>
 * <br>Each of the `&lt;response&gt;` elements must have the `id` attribute specifying the
 * <br>response ID. The contents of the element are used as the response label.
 * <br>
 * <br>Response labels can be translated with the usual `translatable`, `context`
 * <br>and `comments` attributes.
 * <br>
 * <br>The `&lt;response&gt;` elements can also have `enabled` and/or `appearance`
 * <br>attributes. See [method&#64;MessageDialog.set_response_enabled] and
 * <br>[method&#64;MessageDialog.set_response_appearance] for details.
 * <br>
 * <br>Example of an `AdwMessageDialog` UI definition:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;AdwMessageDialog&quot; id=&quot;dialog&quot;&gt;
 * <br>  &lt;property name=&quot;heading&quot; translatable=&quot;yes&quot;&gt;Save Changes?&lt;/property&gt;
 * <br>  &lt;property name=&quot;body&quot; translatable=&quot;yes&quot;&gt;Open documents contain unsaved changes. Changes which are not saved will be permanently lost.&lt;/property&gt;
 * <br>  &lt;property name=&quot;default-response&quot;&gt;save&lt;/property&gt;
 * <br>  &lt;property name=&quot;close-response&quot;&gt;cancel&lt;/property&gt;
 * <br>  &lt;signal name=&quot;response&quot; handler=&quot;response_cb&quot;/&gt;
 * <br>  &lt;responses&gt;
 * <br>    &lt;response id=&quot;cancel&quot; translatable=&quot;yes&quot;&gt;_Cancel&lt;/response&gt;
 * <br>    &lt;response id=&quot;discard&quot; translatable=&quot;yes&quot; appearance=&quot;destructive&quot;&gt;_Discard&lt;/response&gt;
 * <br>    &lt;response id=&quot;save&quot; translatable=&quot;yes&quot; appearance=&quot;suggested&quot; enabled=&quot;false&quot;&gt;_Save&lt;/response&gt;
 * <br>  &lt;/responses&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwMessageDialog` uses the `GTK_ACCESSIBLE_ROLE_DIALOG` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.MessageDialog.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.MessageDialog.html</a></p>
*/
public class MessageDialog extends ch.bailu.gtk.gtk.Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MessageDialog.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * This signal is emitted when the dialog is closed.
         * <br>
         * <br>&#64;response will be set to the response ID of the button that had been
         * <br>activated.
         * <br>
         * <br>if the dialog was closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system
         * <br>action, &#64;response will be set to the value of
         * <br>[property&#64;MessageDialog:close-response].
         * @param response the response ID
        */
        void onResponse(@Nonnull ch.bailu.gtk.type.Str response);
    }
    
    private static com.sun.jna.Callback toOnResponse(OnResponse in) {
        return (in == null) ? null: (JnaMessageDialog.OnResponse) (__self, _response, __data) -> in.onResponse(new ch.bailu.gtk.type.Str(new PointerContainer(_response)));
    }

    public MessageDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwMessageDialog`.
     * <br>
     * <br>&#64;heading and &#64;body can be set to `NULL`. This can be useful if they need to
     * <br>be formatted or use markup. In that case, set them to `NULL` and call
     * <br>[method&#64;MessageDialog.format_body] or similar methods afterwards:
     * <br>
     * <br>```c
     * <br>GtkWidget *dialog;
     * <br>
     * <br>dialog = adw_message_dialog_new (parent, _(&quot;Replace File?&quot;), NULL);
     * <br>adw_message_dialog_format_body (ADW_MESSAGE_DIALOG (dialog),
     * <br>                                _(&quot;A file named “%s” already exists.  Do you want to replace it?&quot;),
     * <br>                                filename);
     * <br>```
     * @param parent transient parent
     * @param heading the heading
     * @param body the body text
    */
    public MessageDialog(@Nullable ch.bailu.gtk.gtk.Window parent, @Nullable ch.bailu.gtk.type.Str heading, @Nullable ch.bailu.gtk.type.Str body) {
        super(cast(JnaMessageDialog.INST().adw_message_dialog_new(asCPointer(parent), asCPointer(heading), asCPointer(body))));
    }

    /**
     * Creates a new `AdwMessageDialog`.
     * <br>
     * <br>&#64;heading and &#64;body can be set to `NULL`. This can be useful if they need to
     * <br>be formatted or use markup. In that case, set them to `NULL` and call
     * <br>[method&#64;MessageDialog.format_body] or similar methods afterwards:
     * <br>
     * <br>```c
     * <br>GtkWidget *dialog;
     * <br>
     * <br>dialog = adw_message_dialog_new (parent, _(&quot;Replace File?&quot;), NULL);
     * <br>adw_message_dialog_format_body (ADW_MESSAGE_DIALOG (dialog),
     * <br>                                _(&quot;A file named “%s” already exists.  Do you want to replace it?&quot;),
     * <br>                                filename);
     * <br>```
     * @param parent transient parent
     * @param heading the heading
     * @param body the body text
    */
    public MessageDialog(@Nullable ch.bailu.gtk.gtk.Window parent, String heading, String body) {
        super(cast(JnaMessageDialog.INST().adw_message_dialog_new(asCPointer(parent), heading, body)));
    }

    /**
     * Adds a response with &#64;id and &#64;label to &#64;self.
     * <br>
     * <br>Responses are represented as buttons in the dialog.
     * <br>
     * <br>Response ID must be unique. It will be used in
     * <br>[signal&#64;MessageDialog::response] to tell which response had been activated,
     * <br>as well as to inspect and modify the response later.
     * <br>
     * <br>An embedded underline in &#64;label indicates a mnemonic.
     * <br>
     * <br>[method&#64;MessageDialog.set_response_label] can be used to change the response
     * <br>label after it had been added.
     * <br>
     * <br>[method&#64;MessageDialog.set_response_enabled] and
     * <br>[method&#64;MessageDialog.set_response_appearance] can be used to customize the
     * <br>responses further.
     * @param id the response ID
     * @param label the response label
    */
    public void addResponse(@Nonnull ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str label)  {
        JnaMessageDialog.INST().adw_message_dialog_add_response(asCPointer(), asCPointerNotNull(id), asCPointerNotNull(label));
    }

    /**
     * Adds a response with &#64;id and &#64;label to &#64;self.
     * <br>
     * <br>Responses are represented as buttons in the dialog.
     * <br>
     * <br>Response ID must be unique. It will be used in
     * <br>[signal&#64;MessageDialog::response] to tell which response had been activated,
     * <br>as well as to inspect and modify the response later.
     * <br>
     * <br>An embedded underline in &#64;label indicates a mnemonic.
     * <br>
     * <br>[method&#64;MessageDialog.set_response_label] can be used to change the response
     * <br>label after it had been added.
     * <br>
     * <br>[method&#64;MessageDialog.set_response_enabled] and
     * <br>[method&#64;MessageDialog.set_response_appearance] can be used to customize the
     * <br>responses further.
     * @param id the response ID
     * @param label the response label
    */
    public void addResponse(String id, String label)  {
        JnaMessageDialog.INST().adw_message_dialog_add_response(asCPointer(), id, label);
    }

    /**
     * Adds multiple responses to &#64;self.
     * <br>
     * <br>This is the same as calling [method&#64;MessageDialog.add_response] repeatedly.
     * <br>The variable argument list should be `NULL`-terminated list of response IDs
     * <br>and labels.
     * <br>
     * <br>Example:
     * <br>
     * <br>```c
     * <br>adw_message_dialog_add_responses (dialog,
     * <br>                                  &quot;cancel&quot;,  _(&quot;_Cancel&quot;),
     * <br>                                  &quot;discard&quot;, _(&quot;_Discard&quot;),
     * <br>                                  &quot;save&quot;,    _(&quot;_Save&quot;),
     * <br>                                  NULL);
     * <br>```
     * @param first_id response id
     * @param _elipse label for first response, then more id-label pairs
    */
    public void addResponses(@Nonnull ch.bailu.gtk.type.Str first_id, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_add_responses(asCPointer(), asCPointerNotNull(first_id), _elipse);
    }

    /**
     * Adds multiple responses to &#64;self.
     * <br>
     * <br>This is the same as calling [method&#64;MessageDialog.add_response] repeatedly.
     * <br>The variable argument list should be `NULL`-terminated list of response IDs
     * <br>and labels.
     * <br>
     * <br>Example:
     * <br>
     * <br>```c
     * <br>adw_message_dialog_add_responses (dialog,
     * <br>                                  &quot;cancel&quot;,  _(&quot;_Cancel&quot;),
     * <br>                                  &quot;discard&quot;, _(&quot;_Discard&quot;),
     * <br>                                  &quot;save&quot;,    _(&quot;_Save&quot;),
     * <br>                                  NULL);
     * <br>```
     * @param first_id response id
     * @param _elipse label for first response, then more id-label pairs
    */
    public void addResponses(String first_id, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_add_responses(asCPointer(), first_id, _elipse);
    }

    /**
     * Sets the formatted body text of &#64;self.
     * <br>
     * <br>See [property&#64;MessageDialog:body].
     * @param format the formatted string for the body text
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatBody(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_body(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets the formatted body text of &#64;self.
     * <br>
     * <br>See [property&#64;MessageDialog:body].
     * @param format the formatted string for the body text
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatBody(String format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_body(asCPointer(), format, _elipse);
    }

    /**
     * Sets the formatted body text of &#64;self with Pango markup.
     * <br>
     * <br>The &#64;format is assumed to contain Pango markup.
     * <br>
     * <br>Special XML characters in the `printf()` arguments passed to this function
     * <br>will  automatically be escaped as necessary, see
     * <br>[func&#64;GLib.markup_printf_escaped].
     * <br>
     * <br>See [property&#64;MessageDialog:body].
     * @param format the formatted string for the body text with Pango markup
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatBodyMarkup(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_body_markup(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets the formatted body text of &#64;self with Pango markup.
     * <br>
     * <br>The &#64;format is assumed to contain Pango markup.
     * <br>
     * <br>Special XML characters in the `printf()` arguments passed to this function
     * <br>will  automatically be escaped as necessary, see
     * <br>[func&#64;GLib.markup_printf_escaped].
     * <br>
     * <br>See [property&#64;MessageDialog:body].
     * @param format the formatted string for the body text with Pango markup
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatBodyMarkup(String format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_body_markup(asCPointer(), format, _elipse);
    }

    /**
     * Sets the formatted heading of &#64;self.
     * <br>
     * <br>See [property&#64;MessageDialog:heading].
     * @param format the formatted string for the heading
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatHeading(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_heading(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets the formatted heading of &#64;self.
     * <br>
     * <br>See [property&#64;MessageDialog:heading].
     * @param format the formatted string for the heading
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatHeading(String format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_heading(asCPointer(), format, _elipse);
    }

    /**
     * Sets the formatted heading of &#64;self with Pango markup.
     * <br>
     * <br>The &#64;format is assumed to contain Pango markup.
     * <br>
     * <br>Special XML characters in the `printf()` arguments passed to this function
     * <br>will automatically be escaped as necessary, see
     * <br>[func&#64;GLib.markup_printf_escaped].
     * <br>
     * <br>See [property&#64;MessageDialog:heading].
     * @param format the formatted string for the heading with Pango markup
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatHeadingMarkup(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_heading_markup(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets the formatted heading of &#64;self with Pango markup.
     * <br>
     * <br>The &#64;format is assumed to contain Pango markup.
     * <br>
     * <br>Special XML characters in the `printf()` arguments passed to this function
     * <br>will automatically be escaped as necessary, see
     * <br>[func&#64;GLib.markup_printf_escaped].
     * <br>
     * <br>See [property&#64;MessageDialog:heading].
     * @param format the formatted string for the heading with Pango markup
     * @param _elipse the parameters to insert into &#64;format
    */
    public void formatHeadingMarkup(String format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().adw_message_dialog_format_heading_markup(asCPointer(), format, _elipse);
    }

    /**
     * Gets the body text of &#64;self.
     * @return the body of &#64;self.
    */
    public ch.bailu.gtk.type.Str getBody()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_body(asCPointer())));
    }

    /**
     * Gets whether the body text of &#64;self includes Pango markup.
     * @return whether &#64;self uses markup for body text
    */
    public boolean getBodyUseMarkup()  {
        return JnaMessageDialog.INST().adw_message_dialog_get_body_use_markup(asCPointer());
    }

    /**
     * Gets the ID of the close response of &#64;self.
     * @return the close response ID
    */
    public ch.bailu.gtk.type.Str getCloseResponse()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_close_response(asCPointer())));
    }

    /**
     * Gets the ID of the default response of &#64;self.
     * @return the default response ID
    */
    public ch.bailu.gtk.type.Str getDefaultResponse()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_default_response(asCPointer())));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self.
    */
    public ch.bailu.gtk.gtk.Widget getExtraChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_extra_child(asCPointer())));
    }

    /**
     * Gets the heading of &#64;self.
     * @return the heading of &#64;self.
    */
    public ch.bailu.gtk.type.Str getHeading()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_heading(asCPointer())));
    }

    /**
     * Gets whether the heading of &#64;self includes Pango markup.
     * @return whether &#64;self uses markup for heading
    */
    public boolean getHeadingUseMarkup()  {
        return JnaMessageDialog.INST().adw_message_dialog_get_heading_use_markup(asCPointer());
    }

    /**
     * Gets the appearance of &#64;response.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_appearance].
     * @param response a response ID
     * @return the appearance of &#64;response
    */
    public int getResponseAppearance(@Nonnull ch.bailu.gtk.type.Str response)  {
        return JnaMessageDialog.INST().adw_message_dialog_get_response_appearance(asCPointer(), asCPointerNotNull(response));
    }

    /**
     * Gets the appearance of &#64;response.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_appearance].
     * @param response a response ID
     * @return the appearance of &#64;response
    */
    public int getResponseAppearance(String response)  {
        return JnaMessageDialog.INST().adw_message_dialog_get_response_appearance(asCPointer(), response);
    }

    /**
     * Gets whether &#64;response is enabled.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_enabled].
     * @param response a response ID
     * @return whether &#64;response is enabled
    */
    public boolean getResponseEnabled(@Nonnull ch.bailu.gtk.type.Str response)  {
        return JnaMessageDialog.INST().adw_message_dialog_get_response_enabled(asCPointer(), asCPointerNotNull(response));
    }

    /**
     * Gets whether &#64;response is enabled.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_enabled].
     * @param response a response ID
     * @return whether &#64;response is enabled
    */
    public boolean getResponseEnabled(String response)  {
        return JnaMessageDialog.INST().adw_message_dialog_get_response_enabled(asCPointer(), response);
    }

    /**
     * Gets the label of &#64;response.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_label].
     * @param response a response ID
     * @return the label of &#64;response
    */
    public ch.bailu.gtk.type.Str getResponseLabel(@Nonnull ch.bailu.gtk.type.Str response)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_response_label(asCPointer(), asCPointerNotNull(response))));
    }

    /**
     * Gets the label of &#64;response.
     * <br>
     * <br>See [method&#64;MessageDialog.set_response_label].
     * @param response a response ID
     * @return the label of &#64;response
    */
    public ch.bailu.gtk.type.Str getResponseLabel(String response)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMessageDialog.INST().adw_message_dialog_get_response_label(asCPointer(), response)));
    }

    /**
     * Gets whether &#64;self has a response with the ID &#64;response.
     * @param response response ID
     * @return whether &#64;self has a response with the ID &#64;response.
    */
    public boolean hasResponse(@Nonnull ch.bailu.gtk.type.Str response)  {
        return JnaMessageDialog.INST().adw_message_dialog_has_response(asCPointer(), asCPointerNotNull(response));
    }

    /**
     * Gets whether &#64;self has a response with the ID &#64;response.
     * @param response response ID
     * @return whether &#64;self has a response with the ID &#64;response.
    */
    public boolean hasResponse(String response)  {
        return JnaMessageDialog.INST().adw_message_dialog_has_response(asCPointer(), response);
    }

    /**
     * Emits the [signal&#64;MessageDialog::response] signal with the given response ID.
     * <br>
     * <br>Used to indicate that the user has responded to the dialog in some way.
     * @param response response ID
    */
    public void response(@Nonnull ch.bailu.gtk.type.Str response)  {
        JnaMessageDialog.INST().adw_message_dialog_response(asCPointer(), asCPointerNotNull(response));
    }

    /**
     * Emits the [signal&#64;MessageDialog::response] signal with the given response ID.
     * <br>
     * <br>Used to indicate that the user has responded to the dialog in some way.
     * @param response response ID
    */
    public void response(String response)  {
        JnaMessageDialog.INST().adw_message_dialog_response(asCPointer(), response);
    }

    /**
     * Sets the body text of &#64;self.
     * @param body the body of &#64;self
    */
    public void setBody(@Nonnull ch.bailu.gtk.type.Str body)  {
        JnaMessageDialog.INST().adw_message_dialog_set_body(asCPointer(), asCPointerNotNull(body));
    }

    /**
     * Sets the body text of &#64;self.
     * @param body the body of &#64;self
    */
    public void setBody(String body)  {
        JnaMessageDialog.INST().adw_message_dialog_set_body(asCPointer(), body);
    }

    /**
     * Sets whether the body text of &#64;self includes Pango markup.
     * <br>
     * <br>See [func&#64;Pango.parse_markup].
     * @param use_markup whether to use markup for body text
    */
    public void setBodyUseMarkup(boolean use_markup)  {
        JnaMessageDialog.INST().adw_message_dialog_set_body_use_markup(asCPointer(), use_markup);
    }

    /**
     * Sets the ID of the close response of &#64;self.
     * <br>
     * <br>It will be passed to [signal&#64;MessageDialog::response] if the window is
     * <br>closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system action.
     * <br>
     * <br>It doesn't have to correspond to any of the responses in the dialog.
     * <br>
     * <br>The default close response is `close`.
     * @param response the close response ID
    */
    public void setCloseResponse(@Nonnull ch.bailu.gtk.type.Str response)  {
        JnaMessageDialog.INST().adw_message_dialog_set_close_response(asCPointer(), asCPointerNotNull(response));
    }

    /**
     * Sets the ID of the close response of &#64;self.
     * <br>
     * <br>It will be passed to [signal&#64;MessageDialog::response] if the window is
     * <br>closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system action.
     * <br>
     * <br>It doesn't have to correspond to any of the responses in the dialog.
     * <br>
     * <br>The default close response is `close`.
     * @param response the close response ID
    */
    public void setCloseResponse(String response)  {
        JnaMessageDialog.INST().adw_message_dialog_set_close_response(asCPointer(), response);
    }

    /**
     * Sets the ID of the default response of &#64;self.
     * <br>
     * <br>If set, pressing &lt;kbd&gt;Enter&lt;/kbd&gt; will activate the corresponding button.
     * <br>
     * <br>If set to `NULL` or to a non-existent response ID, pressing &lt;kbd&gt;Enter&lt;/kbd&gt;
     * <br>will do nothing.
     * @param response the default response ID
    */
    public void setDefaultResponse(@Nullable ch.bailu.gtk.type.Str response)  {
        JnaMessageDialog.INST().adw_message_dialog_set_default_response(asCPointer(), asCPointer(response));
    }

    /**
     * Sets the ID of the default response of &#64;self.
     * <br>
     * <br>If set, pressing &lt;kbd&gt;Enter&lt;/kbd&gt; will activate the corresponding button.
     * <br>
     * <br>If set to `NULL` or to a non-existent response ID, pressing &lt;kbd&gt;Enter&lt;/kbd&gt;
     * <br>will do nothing.
     * @param response the default response ID
    */
    public void setDefaultResponse(String response)  {
        JnaMessageDialog.INST().adw_message_dialog_set_default_response(asCPointer(), response);
    }

    /**
     * Sets the child widget of &#64;self.
     * <br>
     * <br>The child widget is displayed below the heading and body.
     * @param child the child widget
    */
    public void setExtraChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaMessageDialog.INST().adw_message_dialog_set_extra_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the heading of &#64;self.
     * @param heading the heading of &#64;self
    */
    public void setHeading(@Nullable ch.bailu.gtk.type.Str heading)  {
        JnaMessageDialog.INST().adw_message_dialog_set_heading(asCPointer(), asCPointer(heading));
    }

    /**
     * Sets the heading of &#64;self.
     * @param heading the heading of &#64;self
    */
    public void setHeading(String heading)  {
        JnaMessageDialog.INST().adw_message_dialog_set_heading(asCPointer(), heading);
    }

    /**
     * Sets whether the heading of &#64;self includes Pango markup.
     * <br>
     * <br>See [func&#64;Pango.parse_markup].
     * @param use_markup whether to use markup for heading
    */
    public void setHeadingUseMarkup(boolean use_markup)  {
        JnaMessageDialog.INST().adw_message_dialog_set_heading_use_markup(asCPointer(), use_markup);
    }

    /**
     * Sets the appearance for &#64;response.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;message-dialog-appearance-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img src=&quot;message-dialog-appearance.png&quot; alt=&quot;message-dialog-appearance&quot;&gt;
     * <br>&lt;/picture&gt;
     * <br>
     * <br>Use `ADW_RESPONSE_SUGGESTED` to mark important responses such as the
     * <br>affirmative action, like the Save button in the example.
     * <br>
     * <br>Use `ADW_RESPONSE_DESTRUCTIVE` to draw attention to the potentially damaging
     * <br>consequences of using &#64;response. This appearance acts as a warning to the
     * <br>user. The Discard button in the example is using this appearance.
     * <br>
     * <br>The default appearance is `ADW_RESPONSE_DEFAULT`.
     * <br>
     * <br>Negative responses like Cancel or Close should use the default appearance.
     * @param response a response ID
     * @param appearance appearance for &#64;response
    */
    public void setResponseAppearance(@Nonnull ch.bailu.gtk.type.Str response, int appearance)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_appearance(asCPointer(), asCPointerNotNull(response), appearance);
    }

    /**
     * Sets the appearance for &#64;response.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;message-dialog-appearance-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img src=&quot;message-dialog-appearance.png&quot; alt=&quot;message-dialog-appearance&quot;&gt;
     * <br>&lt;/picture&gt;
     * <br>
     * <br>Use `ADW_RESPONSE_SUGGESTED` to mark important responses such as the
     * <br>affirmative action, like the Save button in the example.
     * <br>
     * <br>Use `ADW_RESPONSE_DESTRUCTIVE` to draw attention to the potentially damaging
     * <br>consequences of using &#64;response. This appearance acts as a warning to the
     * <br>user. The Discard button in the example is using this appearance.
     * <br>
     * <br>The default appearance is `ADW_RESPONSE_DEFAULT`.
     * <br>
     * <br>Negative responses like Cancel or Close should use the default appearance.
     * @param response a response ID
     * @param appearance appearance for &#64;response
    */
    public void setResponseAppearance(String response, int appearance)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_appearance(asCPointer(), response, appearance);
    }

    /**
     * Sets whether &#64;response is enabled.
     * <br>
     * <br>If &#64;response is not enabled, the corresponding button will have
     * <br>[property&#64;Gtk.Widget:sensitive] set to `FALSE` and it can't be activated as
     * <br>a default response.
     * <br>
     * <br>&#64;response can still be used as [property&#64;MessageDialog:close-response] while
     * <br>it's not enabled.
     * <br>
     * <br>Responses are enabled by default.
     * @param response a response ID
     * @param enabled whether to enable &#64;response
    */
    public void setResponseEnabled(@Nonnull ch.bailu.gtk.type.Str response, boolean enabled)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_enabled(asCPointer(), asCPointerNotNull(response), enabled);
    }

    /**
     * Sets whether &#64;response is enabled.
     * <br>
     * <br>If &#64;response is not enabled, the corresponding button will have
     * <br>[property&#64;Gtk.Widget:sensitive] set to `FALSE` and it can't be activated as
     * <br>a default response.
     * <br>
     * <br>&#64;response can still be used as [property&#64;MessageDialog:close-response] while
     * <br>it's not enabled.
     * <br>
     * <br>Responses are enabled by default.
     * @param response a response ID
     * @param enabled whether to enable &#64;response
    */
    public void setResponseEnabled(String response, boolean enabled)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_enabled(asCPointer(), response, enabled);
    }

    /**
     * Sets the label of &#64;response to &#64;label.
     * <br>
     * <br>Labels are displayed on the dialog buttons. An embedded underline in &#64;label
     * <br>indicates a mnemonic.
     * @param response a response ID
     * @param label the label of &#64;response
    */
    public void setResponseLabel(@Nonnull ch.bailu.gtk.type.Str response, @Nonnull ch.bailu.gtk.type.Str label)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_label(asCPointer(), asCPointerNotNull(response), asCPointerNotNull(label));
    }

    /**
     * Sets the label of &#64;response to &#64;label.
     * <br>
     * <br>Labels are displayed on the dialog buttons. An embedded underline in &#64;label
     * <br>indicates a mnemonic.
     * @param response a response ID
     * @param label the label of &#64;response
    */
    public void setResponseLabel(String response, String label)  {
        JnaMessageDialog.INST().adw_message_dialog_set_response_label(asCPointer(), response, label);
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
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Native}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Native}
    */
    public ch.bailu.gtk.gtk.Native asNative() {
        return new ch.bailu.gtk.gtk.Native(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Root}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Root}
    */
    public ch.bailu.gtk.gtk.Root asRoot() {
        return new ch.bailu.gtk.gtk.Root(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ShortcutManager}
    */
    public ch.bailu.gtk.gtk.ShortcutManager asShortcutManager() {
        return new ch.bailu.gtk.gtk.ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaMessageDialog.INST().adw_message_dialog_get_type(); 
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
