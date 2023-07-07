/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFileChooserNative` is an abstraction of a dialog suitable
 * <br>for use with “File Open” or “File Save as” commands.
 * <br>
 * <br>By default, this just uses a `GtkFileChooserDialog` to implement
 * <br>the actual dialog. However, on some platforms, such as Windows and
 * <br>macOS, the native platform file chooser is used instead. When the
 * <br>application is running in a sandboxed environment without direct
 * <br>filesystem access (such as Flatpak), `GtkFileChooserNative` may call
 * <br>the proper APIs (portals) to let the user choose a file and make it
 * <br>available to the application.
 * <br>
 * <br>While the API of `GtkFileChooserNative` closely mirrors `GtkFileChooserDialog`,
 * <br>the main difference is that there is no access to any `GtkWindow` or `GtkWidget`
 * <br>for the dialog. This is required, as there may not be one in the case of a
 * <br>platform native dialog.
 * <br>
 * <br>Showing, hiding and running the dialog is handled by the
 * <br>[class&#64;Gtk.NativeDialog] functions.
 * <br>
 * <br>Note that unlike `GtkFileChooserDialog`, `GtkFileChooserNative` objects
 * <br>are not toplevel widgets, and GTK does not keep them alive. It is your
 * <br>responsibility to keep a reference until you are done with the
 * <br>object.
 * <br>
 * <br>&#35;&#35; Typical usage
 * <br>
 * <br>In the simplest of cases, you can the following code to use
 * <br>`GtkFileChooserNative` to select a file for opening:
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_response (GtkNativeDialog *native,
 * <br>             int              response)
 * <br>{
 * <br>  if (response == GTK_RESPONSE_ACCEPT)
 * <br>    {
 * <br>      GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 * <br>      GFile *file = gtk_file_chooser_get_file (chooser);
 * <br>
 * <br>      open_file (file);
 * <br>
 * <br>      g_object_unref (file);
 * <br>    }
 * <br>
 * <br>  g_object_unref (native);
 * <br>}
 * <br>
 * <br>  // ...
 * <br>  GtkFileChooserNative *native;
 * <br>  GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <br>
 * <br>  native = gtk_file_chooser_native_new (&quot;Open File&quot;,
 * <br>                                        parent_window,
 * <br>                                        action,
 * <br>                                        &quot;_Open&quot;,
 * <br>                                        &quot;_Cancel&quot;);
 * <br>
 * <br>  g_signal_connect (native, &quot;response&quot;, G_CALLBACK (on_response), NULL);
 * <br>  gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * <br>```
 * <br>
 * <br>To use a `GtkFileChooserNative` for saving, you can use this:
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_response (GtkNativeDialog *native,
 * <br>             int              response)
 * <br>{
 * <br>  if (response == GTK_RESPONSE_ACCEPT)
 * <br>    {
 * <br>      GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 * <br>      GFile *file = gtk_file_chooser_get_file (chooser);
 * <br>
 * <br>      save_to_file (file);
 * <br>
 * <br>      g_object_unref (file);
 * <br>    }
 * <br>
 * <br>  g_object_unref (native);
 * <br>}
 * <br>
 * <br>  // ...
 * <br>  GtkFileChooserNative *native;
 * <br>  GtkFileChooser *chooser;
 * <br>  GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * <br>
 * <br>  native = gtk_file_chooser_native_new (&quot;Save File&quot;,
 * <br>                                        parent_window,
 * <br>                                        action,
 * <br>                                        &quot;_Save&quot;,
 * <br>                                        &quot;_Cancel&quot;);
 * <br>  chooser = GTK_FILE_CHOOSER (native);
 * <br>
 * <br>  if (user_edited_a_new_document)
 * <br>    gtk_file_chooser_set_current_name (chooser, _(&quot;Untitled document&quot;));
 * <br>  else
 * <br>    gtk_file_chooser_set_file (chooser, existing_file, NULL);
 * <br>
 * <br>  g_signal_connect (native, &quot;response&quot;, G_CALLBACK (on_response), NULL);
 * <br>  gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * <br>```
 * <br>
 * <br>For more information on how to best set up a file dialog,
 * <br>see the [class&#64;Gtk.FileChooserDialog] documentation.
 * <br>
 * <br>&#35;&#35; Response Codes
 * <br>
 * <br>`GtkFileChooserNative` inherits from [class&#64;Gtk.NativeDialog],
 * <br>which means it will return %GTK_RESPONSE_ACCEPT if the user accepted,
 * <br>and %GTK_RESPONSE_CANCEL if he pressed cancel. It can also return
 * <br>%GTK_RESPONSE_DELETE_EVENT if the window was unexpectedly closed.
 * <br>
 * <br>&#35;&#35; Differences from `GtkFileChooserDialog`
 * <br>
 * <br>There are a few things in the [iface&#64;Gtk.FileChooser] interface that
 * <br>are not possible to use with `GtkFileChooserNative`, as such use would
 * <br>prohibit the use of a native dialog.
 * <br>
 * <br>No operations that change the dialog work while the dialog is visible.
 * <br>Set all the properties that are required before showing the dialog.
 * <br>
 * <br>&#35;&#35; Win32 details
 * <br>
 * <br>On windows the `IFileDialog` implementation (added in Windows Vista) is
 * <br>used. It supports many of the features that `GtkFileChooser` has, but
 * <br>there are some things it does not handle:
 * <br>
 * <br>* Any [class&#64;Gtk.FileFilter] added using a mimetype
 * <br>
 * <br>If any of these features are used the regular `GtkFileChooserDialog`
 * <br>will be used in place of the native one.
 * <br>
 * <br>&#35;&#35; Portal details
 * <br>
 * <br>When the `org.freedesktop.portal.FileChooser` portal is available on
 * <br>the session bus, it is used to bring up an out-of-process file chooser.
 * <br>Depending on the kind of session the application is running in, this may
 * <br>or may not be a GTK file chooser.
 * <br>
 * <br>&#35;&#35; macOS details
 * <br>
 * <br>On macOS the `NSSavePanel` and `NSOpenPanel` classes are used to provide
 * <br>native file chooser dialogs. Some features provided by `GtkFileChooser`
 * <br>are not supported:
 * <br>
 * <br>* Shortcut folders.
 * <p><a href="https://docs.gtk.org/gtk4/class.FileChooserNative.html">https://docs.gtk.org/gtk4/class.FileChooserNative.html</a></p>
*/
public class FileChooserNative extends NativeDialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileChooserNative.class.getCanonicalName());
    }

    public FileChooserNative(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFileChooserNative`.
     * @param title Title of the native
     * @param parent Transient parent of the native
     * @param action Open or save mode for the dialog
     * @param accept_label text to go in the accept button, or %NULL for the default
     * @param cancel_label text to go in the cancel button, or %NULL for the default
    */
    public FileChooserNative(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent, int action, @Nullable ch.bailu.gtk.type.Str accept_label, @Nullable ch.bailu.gtk.type.Str cancel_label) {
        super(cast(JnaFileChooserNative.INST().gtk_file_chooser_native_new(asCPointer(title), asCPointer(parent), action, asCPointer(accept_label), asCPointer(cancel_label))));
    }

    /**
     * Creates a new `GtkFileChooserNative`.
     * @param title Title of the native
     * @param parent Transient parent of the native
     * @param action Open or save mode for the dialog
     * @param accept_label text to go in the accept button, or %NULL for the default
     * @param cancel_label text to go in the cancel button, or %NULL for the default
    */
    public FileChooserNative(String title, @Nullable Window parent, int action, String accept_label, String cancel_label) {
        super(cast(JnaFileChooserNative.INST().gtk_file_chooser_native_new(title, asCPointer(parent), action, accept_label, cancel_label)));
    }

    /**
     * Retrieves the custom label text for the accept button.
     * @return The custom label
    */
    public ch.bailu.gtk.type.Str getAcceptLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileChooserNative.INST().gtk_file_chooser_native_get_accept_label(asCPointer())));
    }

    /**
     * Retrieves the custom label text for the cancel button.
     * @return The custom label
    */
    public ch.bailu.gtk.type.Str getCancelLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileChooserNative.INST().gtk_file_chooser_native_get_cancel_label(asCPointer())));
    }

    /**
     * Sets the custom label text for the accept button.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key should activate the button.
     * @param accept_label custom label
    */
    public void setAcceptLabel(@Nullable ch.bailu.gtk.type.Str accept_label)  {
        JnaFileChooserNative.INST().gtk_file_chooser_native_set_accept_label(asCPointer(), asCPointer(accept_label));
    }

    /**
     * Sets the custom label text for the accept button.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key should activate the button.
     * @param accept_label custom label
    */
    public void setAcceptLabel(String accept_label)  {
        JnaFileChooserNative.INST().gtk_file_chooser_native_set_accept_label(asCPointer(), accept_label);
    }

    /**
     * Sets the custom label text for the cancel button.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key should activate the button.
     * @param cancel_label custom label
    */
    public void setCancelLabel(@Nullable ch.bailu.gtk.type.Str cancel_label)  {
        JnaFileChooserNative.INST().gtk_file_chooser_native_set_cancel_label(asCPointer(), asCPointer(cancel_label));
    }

    /**
     * Sets the custom label text for the cancel button.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key should activate the button.
     * @param cancel_label custom label
    */
    public void setCancelLabel(String cancel_label)  {
        JnaFileChooserNative.INST().gtk_file_chooser_native_set_cancel_label(asCPointer(), cancel_label);
    }

    /**
     * Implements interface {@link FileChooser}. Call this to get access to interface functions.
     * @return {@link FileChooser}
    */
    public FileChooser asFileChooser() {
        return new FileChooser(cast());
    }

    public static long getTypeID() { 
        return JnaFileChooserNative.INST().gtk_file_chooser_native_get_type(); 
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
