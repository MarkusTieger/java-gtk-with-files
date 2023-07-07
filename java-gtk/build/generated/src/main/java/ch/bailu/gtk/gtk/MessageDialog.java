/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMessageDialog` presents a dialog with some message text.
 * <br>
 * <br>![An example GtkMessageDialog](messagedialog.png)
 * <br>
 * <br>It’s simply a convenience widget; you could construct the equivalent of
 * <br>`GtkMessageDialog` from `GtkDialog` without too much effort, but
 * <br>`GtkMessageDialog` saves typing.
 * <br>
 * <br>The easiest way to do a modal message dialog is to use the %GTK_DIALOG_MODAL
 * <br>flag, which will call [method&#64;Gtk.Window.set_modal] internally. The dialog will
 * <br>prevent interaction with the parent window until it's hidden or destroyed.
 * <br>You can use the [signal&#64;Gtk.Dialog::response] signal to know when the user
 * <br>dismissed the dialog.
 * <br>
 * <br>An example for using a modal dialog:
 * <br>```c
 * <br>GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT | GTK_DIALOG_MODAL;
 * <br>dialog = gtk_message_dialog_new (parent_window,
 * <br>                                 flags,
 * <br>                                 GTK_MESSAGE_ERROR,
 * <br>                                 GTK_BUTTONS_CLOSE,
 * <br>                                 &quot;Error reading “%s”: %s&quot;,
 * <br>                                 filename,
 * <br>                                 g_strerror (errno));
 * <br>// Destroy the dialog when the user responds to it
 * <br>// (e.g. clicks a button)
 * <br>
 * <br>g_signal_connect (dialog, &quot;response&quot;,
 * <br>                  G_CALLBACK (gtk_window_destroy),
 * <br>                  NULL);
 * <br>```
 * <br>
 * <br>You might do a non-modal `GtkMessageDialog` simply by omitting the
 * <br>%GTK_DIALOG_MODAL flag:
 * <br>
 * <br>```c
 * <br>GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 * <br>dialog = gtk_message_dialog_new (parent_window,
 * <br>                                 flags,
 * <br>                                 GTK_MESSAGE_ERROR,
 * <br>                                 GTK_BUTTONS_CLOSE,
 * <br>                                 &quot;Error reading “%s”: %s&quot;,
 * <br>                                 filename,
 * <br>                                 g_strerror (errno));
 * <br>
 * <br>// Destroy the dialog when the user responds to it
 * <br>// (e.g. clicks a button)
 * <br>g_signal_connect (dialog, &quot;response&quot;,
 * <br>                  G_CALLBACK (gtk_window_destroy),
 * <br>                  NULL);
 * <br>```
 * <br>
 * <br>&#35; GtkMessageDialog as GtkBuildable
 * <br>
 * <br>The `GtkMessageDialog` implementation of the `GtkBuildable` interface exposes
 * <br>the message area as an internal child with the name “message_area”.
 * <p><a href="https://docs.gtk.org/gtk4/class.MessageDialog.html">https://docs.gtk.org/gtk4/class.MessageDialog.html</a></p>
*/
public class MessageDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MessageDialog.class.getCanonicalName());
    }

    public MessageDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new message dialog.
     * <br>
     * <br>This is a simple dialog with some text that is marked up with
     * <br>Pango markup. When the user clicks a button a “response” signal
     * <br>is emitted with response IDs from [enum&#64;Gtk.ResponseType]. See
     * <br>[class&#64;Gtk.Dialog] for more details.
     * <br>
     * <br>Special XML characters in the printf() arguments passed to this
     * <br>function will automatically be escaped as necessary.
     * <br>(See g_markup_printf_escaped() for how this is implemented.)
     * <br>Usually this is what you want, but if you have an existing
     * <br>Pango markup string that you want to use literally as the
     * <br>label, then you need to use [method&#64;Gtk.MessageDialog.set_markup]
     * <br>instead, since you can’t pass the markup string either
     * <br>as the format (it might contain “%” characters) or as a string
     * <br>argument.
     * <br>
     * <br>```c
     * <br>GtkWidget *dialog;
     * <br>GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
     * <br>dialog = gtk_message_dialog_new (parent_window,
     * <br>                                 flags,
     * <br>                                 GTK_MESSAGE_ERROR,
     * <br>                                 GTK_BUTTONS_CLOSE,
     * <br>                                 NULL);
     * <br>gtk_message_dialog_set_markup (GTK_MESSAGE_DIALOG (dialog),
     * <br>                               markup);
     * <br>```
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
     * @return a new `GtkMessageDialog`
    */
    public static MessageDialog newWithMarkupMessageDialog(@Nullable Window parent, int flags, int type, int buttons, @Nullable ch.bailu.gtk.type.Str message_format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaMessageDialog.INST().gtk_message_dialog_new_with_markup(asCPointer(parent), flags, type, buttons, asCPointer(message_format), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("MessageDialog:newWithMarkup");
        }
        return new MessageDialog(__self);
    }        
    

    /**
     * Creates a new message dialog.
     * <br>
     * <br>This is a simple dialog with some text that is marked up with
     * <br>Pango markup. When the user clicks a button a “response” signal
     * <br>is emitted with response IDs from [enum&#64;Gtk.ResponseType]. See
     * <br>[class&#64;Gtk.Dialog] for more details.
     * <br>
     * <br>Special XML characters in the printf() arguments passed to this
     * <br>function will automatically be escaped as necessary.
     * <br>(See g_markup_printf_escaped() for how this is implemented.)
     * <br>Usually this is what you want, but if you have an existing
     * <br>Pango markup string that you want to use literally as the
     * <br>label, then you need to use [method&#64;Gtk.MessageDialog.set_markup]
     * <br>instead, since you can’t pass the markup string either
     * <br>as the format (it might contain “%” characters) or as a string
     * <br>argument.
     * <br>
     * <br>```c
     * <br>GtkWidget *dialog;
     * <br>GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
     * <br>dialog = gtk_message_dialog_new (parent_window,
     * <br>                                 flags,
     * <br>                                 GTK_MESSAGE_ERROR,
     * <br>                                 GTK_BUTTONS_CLOSE,
     * <br>                                 NULL);
     * <br>gtk_message_dialog_set_markup (GTK_MESSAGE_DIALOG (dialog),
     * <br>                               markup);
     * <br>```
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
     * @return a new `GtkMessageDialog`
    */
    public static MessageDialog newWithMarkupMessageDialog(@Nullable Window parent, int flags, int type, int buttons, String message_format, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaMessageDialog.INST().gtk_message_dialog_new_with_markup(asCPointer(parent), flags, type, buttons, message_format, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("MessageDialog:newWithMarkup");
        }
        return new MessageDialog(__self);
    }        
    

    /**
     * Creates a new message dialog.
     * <br>
     * <br>This is a simple dialog with some text the user may want to see.
     * <br>When the user clicks a button a “response” signal is emitted with
     * <br>response IDs from [enum&#64;Gtk.ResponseType]. See [class&#64;Gtk.Dialog]
     * <br>for more details.
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
    */
    public MessageDialog(@Nullable Window parent, int flags, int type, int buttons, @Nullable ch.bailu.gtk.type.Str message_format, java.lang.Object... _elipse) {
        super(cast(JnaMessageDialog.INST().gtk_message_dialog_new(asCPointer(parent), flags, type, buttons, asCPointer(message_format), _elipse)));
    }

    /**
     * Creates a new message dialog.
     * <br>
     * <br>This is a simple dialog with some text the user may want to see.
     * <br>When the user clicks a button a “response” signal is emitted with
     * <br>response IDs from [enum&#64;Gtk.ResponseType]. See [class&#64;Gtk.Dialog]
     * <br>for more details.
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
    */
    public MessageDialog(@Nullable Window parent, int flags, int type, int buttons, String message_format, java.lang.Object... _elipse) {
        super(cast(JnaMessageDialog.INST().gtk_message_dialog_new(asCPointer(parent), flags, type, buttons, message_format, _elipse)));
    }

    /**
     * Sets the secondary text of the message dialog.
     * <br>
     * <br>The &#64;message_format is assumed to contain Pango markup.
     * <br>
     * <br>Due to an oversight, this function does not escape special
     * <br>XML characters like [ctor&#64;Gtk.MessageDialog.new_with_markup]
     * <br>does. Thus, if the arguments may contain special XML characters,
     * <br>you should use g_markup_printf_escaped() to escape it.
     * <br>
     * <br>```c
     * <br>char *msg;
     * <br>
     * <br>msg = g_markup_printf_escaped (message_format, ...);
     * <br>gtk_message_dialog_format_secondary_markup (message_dialog,
     * <br>                                            &quot;%s&quot;, msg);
     * <br>g_free (msg);
     * <br>```
     * @param message_format printf()-style string with Pango markup
     * @param _elipse arguments for &#64;message_format
    */
    public void formatSecondaryMarkup(@Nonnull ch.bailu.gtk.type.Str message_format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().gtk_message_dialog_format_secondary_markup(asCPointer(), asCPointerNotNull(message_format), _elipse);
    }

    /**
     * Sets the secondary text of the message dialog.
     * <br>
     * <br>The &#64;message_format is assumed to contain Pango markup.
     * <br>
     * <br>Due to an oversight, this function does not escape special
     * <br>XML characters like [ctor&#64;Gtk.MessageDialog.new_with_markup]
     * <br>does. Thus, if the arguments may contain special XML characters,
     * <br>you should use g_markup_printf_escaped() to escape it.
     * <br>
     * <br>```c
     * <br>char *msg;
     * <br>
     * <br>msg = g_markup_printf_escaped (message_format, ...);
     * <br>gtk_message_dialog_format_secondary_markup (message_dialog,
     * <br>                                            &quot;%s&quot;, msg);
     * <br>g_free (msg);
     * <br>```
     * @param message_format printf()-style string with Pango markup
     * @param _elipse arguments for &#64;message_format
    */
    public void formatSecondaryMarkup(String message_format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().gtk_message_dialog_format_secondary_markup(asCPointer(), message_format, _elipse);
    }

    /**
     * Sets the secondary text of the message dialog.
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
    */
    public void formatSecondaryText(@Nullable ch.bailu.gtk.type.Str message_format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().gtk_message_dialog_format_secondary_text(asCPointer(), asCPointer(message_format), _elipse);
    }

    /**
     * Sets the secondary text of the message dialog.
     * @param message_format printf()-style format string
     * @param _elipse arguments for &#64;message_format
    */
    public void formatSecondaryText(String message_format, java.lang.Object... _elipse)  {
        JnaMessageDialog.INST().gtk_message_dialog_format_secondary_text(asCPointer(), message_format, _elipse);
    }

    /**
     * Returns the message area of the dialog.
     * <br>
     * <br>This is the box where the dialog’s primary and secondary labels
     * <br>are packed. You can add your own extra content to that box and it
     * <br>will appear below those labels. See [method&#64;Gtk.Dialog.get_content_area]
     * <br>for the corresponding function in the parent [class&#64;Gtk.Dialog].
     * @return A `GtkBox` corresponding to the   “message area” in the &#64;message_dialog
    */
    public Widget getMessageArea()  {
        return new Widget(new PointerContainer(JnaMessageDialog.INST().gtk_message_dialog_get_message_area(asCPointer())));
    }

    /**
     * Sets the text of the message dialog.
     * @param str string with Pango markup
    */
    public void setMarkup(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaMessageDialog.INST().gtk_message_dialog_set_markup(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the text of the message dialog.
     * @param str string with Pango markup
    */
    public void setMarkup(String str)  {
        JnaMessageDialog.INST().gtk_message_dialog_set_markup(asCPointer(), str);
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
        return JnaMessageDialog.INST().gtk_message_dialog_get_type(); 
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
