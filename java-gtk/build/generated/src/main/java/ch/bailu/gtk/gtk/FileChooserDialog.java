/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFileChooserDialog` is a dialog suitable for use with
 * <br>“File Open” or “File Save” commands.
 * <br>
 * <br>![An example GtkFileChooserDialog](filechooser.png)
 * <br>
 * <br>This widget works by putting a [class&#64;Gtk.FileChooserWidget]
 * <br>inside a [class&#64;Gtk.Dialog]. It exposes the [iface&#64;Gtk.FileChooser]
 * <br>interface, so you can use all of the [iface&#64;Gtk.FileChooser] functions
 * <br>on the file chooser dialog as well as those for [class&#64;Gtk.Dialog].
 * <br>
 * <br>Note that `GtkFileChooserDialog` does not have any methods of its
 * <br>own. Instead, you should use the functions that work on a
 * <br>[iface&#64;Gtk.FileChooser].
 * <br>
 * <br>If you want to integrate well with the platform you should use the
 * <br>[class&#64;Gtk.FileChooserNative] API, which will use a platform-specific
 * <br>dialog if available and fall back to `GtkFileChooserDialog`
 * <br>otherwise.
 * <br>
 * <br>&#35;&#35; Typical usage
 * <br>
 * <br>In the simplest of cases, you can the following code to use
 * <br>`GtkFileChooserDialog` to select a file for opening:
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_open_response (GtkDialog *dialog,
 * <br>                  int        response)
 * <br>{
 * <br>  if (response == GTK_RESPONSE_ACCEPT)
 * <br>    {
 * <br>      GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * <br>
 * <br>      g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * <br>
 * <br>      open_file (file);
 * <br>    }
 * <br>
 * <br>  gtk_window_destroy (GTK_WINDOW (dialog));
 * <br>}
 * <br>
 * <br>  // ...
 * <br>  GtkWidget *dialog;
 * <br>  GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <br>
 * <br>  dialog = gtk_file_chooser_dialog_new (&quot;Open File&quot;,
 * <br>                                        parent_window,
 * <br>                                        action,
 * <br>                                        _(&quot;_Cancel&quot;),
 * <br>                                        GTK_RESPONSE_CANCEL,
 * <br>                                        _(&quot;_Open&quot;),
 * <br>                                        GTK_RESPONSE_ACCEPT,
 * <br>                                        NULL);
 * <br>
 * <br>  gtk_widget_show (dialog);
 * <br>
 * <br>  g_signal_connect (dialog, &quot;response&quot;,
 * <br>                    G_CALLBACK (on_open_response),
 * <br>                    NULL);
 * <br>```
 * <br>
 * <br>To use a dialog for saving, you can use this:
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_save_response (GtkDialog *dialog,
 * <br>                  int        response)
 * <br>{
 * <br>  if (response == GTK_RESPONSE_ACCEPT)
 * <br>    {
 * <br>      GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * <br>
 * <br>      g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * <br>
 * <br>      save_to_file (file);
 * <br>    }
 * <br>
 * <br>  gtk_window_destroy (GTK_WINDOW (dialog));
 * <br>}
 * <br>
 * <br>  // ...
 * <br>  GtkWidget *dialog;
 * <br>  GtkFileChooser *chooser;
 * <br>  GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * <br>
 * <br>  dialog = gtk_file_chooser_dialog_new (&quot;Save File&quot;,
 * <br>                                        parent_window,
 * <br>                                        action,
 * <br>                                        _(&quot;_Cancel&quot;),
 * <br>                                        GTK_RESPONSE_CANCEL,
 * <br>                                        _(&quot;_Save&quot;),
 * <br>                                        GTK_RESPONSE_ACCEPT,
 * <br>                                        NULL);
 * <br>  chooser = GTK_FILE_CHOOSER (dialog);
 * <br>
 * <br>  if (user_edited_a_new_document)
 * <br>    gtk_file_chooser_set_current_name (chooser, _(&quot;Untitled document&quot;));
 * <br>  else
 * <br>    gtk_file_chooser_set_file (chooser, existing_filename);
 * <br>
 * <br>  gtk_widget_show (dialog);
 * <br>
 * <br>  g_signal_connect (dialog, &quot;response&quot;,
 * <br>                    G_CALLBACK (on_save_response),
 * <br>                    NULL);
 * <br>```
 * <br>
 * <br>&#35;&#35; Setting up a file chooser dialog
 * <br>
 * <br>There are various cases in which you may need to use a `GtkFileChooserDialog`:
 * <br>
 * <br>- To select a file for opening, use %GTK_FILE_CHOOSER_ACTION_OPEN.
 * <br>
 * <br>- To save a file for the first time, use %GTK_FILE_CHOOSER_ACTION_SAVE,
 * <br>  and suggest a name such as “Untitled” with
 * <br>  [method&#64;Gtk.FileChooser.set_current_name].
 * <br>
 * <br>- To save a file under a different name, use %GTK_FILE_CHOOSER_ACTION_SAVE,
 * <br>  and set the existing file with [method&#64;Gtk.FileChooser.set_file].
 * <br>
 * <br>- To choose a folder instead of a filem use %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
 * <br>
 * <br>In general, you should only cause the file chooser to show a specific
 * <br>folder when it is appropriate to use [method&#64;Gtk.FileChooser.set_file],
 * <br>i.e. when you are doing a “Save As” command and you already have a file
 * <br>saved somewhere.
 * <br>
 * <br>&#35;&#35; Response Codes
 * <br>
 * <br>`GtkFileChooserDialog` inherits from [class&#64;Gtk.Dialog], so buttons that
 * <br>go in its action area have response codes such as %GTK_RESPONSE_ACCEPT and
 * <br>%GTK_RESPONSE_CANCEL. For example, you could call
 * <br>[ctor&#64;Gtk.FileChooserDialog.new] as follows:
 * <br>
 * <br>```c
 * <br>GtkWidget *dialog;
 * <br>GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <br>
 * <br>dialog = gtk_file_chooser_dialog_new (&quot;Open File&quot;,
 * <br>                                      parent_window,
 * <br>                                      action,
 * <br>                                      _(&quot;_Cancel&quot;),
 * <br>                                      GTK_RESPONSE_CANCEL,
 * <br>                                      _(&quot;_Open&quot;),
 * <br>                                      GTK_RESPONSE_ACCEPT,
 * <br>                                      NULL);
 * <br>```
 * <br>
 * <br>This will create buttons for “Cancel” and “Open” that use predefined
 * <br>response identifiers from [enum&#64;Gtk.ResponseType].  For most dialog
 * <br>boxes you can use your own custom response codes rather than the
 * <br>ones in [enum&#64;Gtk.ResponseType], but `GtkFileChooserDialog` assumes that
 * <br>its “accept”-type action, e.g. an “Open” or “Save” button,
 * <br>will have one of the following response codes:
 * <br>
 * <br>- %GTK_RESPONSE_ACCEPT
 * <br>- %GTK_RESPONSE_OK
 * <br>- %GTK_RESPONSE_YES
 * <br>- %GTK_RESPONSE_APPLY
 * <br>
 * <br>This is because `GtkFileChooserDialog` must intercept responses and switch
 * <br>to folders if appropriate, rather than letting the dialog terminate — the
 * <br>implementation uses these known response codes to know which responses can
 * <br>be blocked if appropriate.
 * <br>
 * <br>To summarize, make sure you use a predefined response code
 * <br>when you use `GtkFileChooserDialog` to ensure proper operation.
 * <p><a href="https://docs.gtk.org/gtk4/class.FileChooserDialog.html">https://docs.gtk.org/gtk4/class.FileChooserDialog.html</a></p>
*/
public class FileChooserDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileChooserDialog.class.getCanonicalName());
    }

    public FileChooserDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFileChooserDialog`.
     * <br>
     * <br>This function is analogous to [ctor&#64;Gtk.Dialog.new_with_buttons].
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param action Open or save mode for the dialog
     * @param first_button_text text to go in the first button
     * @param _elipse response ID for the first button, then additional (button, id) pairs, ending with %NULL
    */
    public FileChooserDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent, int action, @Nullable ch.bailu.gtk.type.Str first_button_text, java.lang.Object... _elipse) {
        super(cast(JnaFileChooserDialog.INST().gtk_file_chooser_dialog_new(asCPointer(title), asCPointer(parent), action, asCPointer(first_button_text), _elipse)));
    }

    /**
     * Creates a new `GtkFileChooserDialog`.
     * <br>
     * <br>This function is analogous to [ctor&#64;Gtk.Dialog.new_with_buttons].
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param action Open or save mode for the dialog
     * @param first_button_text text to go in the first button
     * @param _elipse response ID for the first button, then additional (button, id) pairs, ending with %NULL
    */
    public FileChooserDialog(String title, @Nullable Window parent, int action, String first_button_text, java.lang.Object... _elipse) {
        super(cast(JnaFileChooserDialog.INST().gtk_file_chooser_dialog_new(title, asCPointer(parent), action, first_button_text, _elipse)));
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
     * Implements interface {@link FileChooser}. Call this to get access to interface functions.
     * @return {@link FileChooser}
    */
    public FileChooser asFileChooser() {
        return new FileChooser(cast());
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
        return JnaFileChooserDialog.INST().gtk_file_chooser_dialog_get_type(); 
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
