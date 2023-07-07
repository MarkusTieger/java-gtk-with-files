/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFileChooser` is an interface that can be implemented by file
 * <br>selection widgets.
 * <br>
 * <br>In GTK, the main objects that implement this interface are
 * <br>[class&#64;Gtk.FileChooserWidget] and [class&#64;Gtk.FileChooserDialog].
 * <br>
 * <br>You do not need to write an object that implements the `GtkFileChooser`
 * <br>interface unless you are trying to adapt an existing file selector to
 * <br>expose a standard programming interface.
 * <br>
 * <br>`GtkFileChooser` allows for shortcuts to various places in the filesystem.
 * <br>In the default implementation these are displayed in the left pane. It
 * <br>may be a bit confusing at first that these shortcuts come from various
 * <br>sources and in various flavours, so lets explain the terminology here:
 * <br>
 * <br>- Bookmarks: are created by the user, by dragging folders from the
 * <br>  right pane to the left pane, or by using the “Add”. Bookmarks
 * <br>  can be renamed and deleted by the user.
 * <br>
 * <br>- Shortcuts: can be provided by the application. For example, a Paint
 * <br>  program may want to add a shortcut for a Clipart folder. Shortcuts
 * <br>  cannot be modified by the user.
 * <br>
 * <br>- Volumes: are provided by the underlying filesystem abstraction. They are
 * <br>  the “roots” of the filesystem.
 * <br>
 * <br>&#35; File Names and Encodings
 * <br>
 * <br>When the user is finished selecting files in a `GtkFileChooser`, your
 * <br>program can get the selected filenames as `GFile`s.
 * <br>
 * <br>&#35; Adding options
 * <br>
 * <br>You can add extra widgets to a file chooser to provide options
 * <br>that are not present in the default design, by using
 * <br>[method&#64;Gtk.FileChooser.add_choice]. Each choice has an identifier and
 * <br>a user visible label; additionally, each choice can have multiple
 * <br>options. If a choice has no option, it will be rendered as a
 * <br>check button with the given label; if a choice has options, it will
 * <br>be rendered as a combo box.
 * <p><a href="https://docs.gtk.org/gtk4/iface.FileChooser.html">https://docs.gtk.org/gtk4/iface.FileChooser.html</a></p>
*/
public class FileChooser extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileChooser.class.getCanonicalName());
    }

    public FileChooser(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a 'choice' to the file chooser.
     * <br>
     * <br>This is typically implemented as a combobox or, for boolean choices,
     * <br>as a checkbutton. You can select a value using
     * <br>[method&#64;Gtk.FileChooser.set_choice] before the dialog is shown,
     * <br>and you can obtain the user-selected value in the
     * <br>[signal&#64;Gtk.Dialog::response] signal handler using
     * <br>[method&#64;Gtk.FileChooser.get_choice].
     * @param id id for the added choice
     * @param label user-visible label for the added choice
     * @param options ids for the options of the choice, or %NULL for a boolean choice
     * @param option_labels user-visible labels for the options, must be the same length as &#64;options
    */
    public void addChoice(@Nonnull ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str label, @Nullable ch.bailu.gtk.type.Strs options, @Nullable ch.bailu.gtk.type.Strs option_labels)  {
        JnaFileChooser.INST().gtk_file_chooser_add_choice(asCPointer(), asCPointerNotNull(id), asCPointerNotNull(label), asCPointer(options), asCPointer(option_labels));
    }

    /**
     * Adds a 'choice' to the file chooser.
     * <br>
     * <br>This is typically implemented as a combobox or, for boolean choices,
     * <br>as a checkbutton. You can select a value using
     * <br>[method&#64;Gtk.FileChooser.set_choice] before the dialog is shown,
     * <br>and you can obtain the user-selected value in the
     * <br>[signal&#64;Gtk.Dialog::response] signal handler using
     * <br>[method&#64;Gtk.FileChooser.get_choice].
     * @param id id for the added choice
     * @param label user-visible label for the added choice
     * @param options ids for the options of the choice, or %NULL for a boolean choice
     * @param option_labels user-visible labels for the options, must be the same length as &#64;options
    */
    public void addChoice(String id, String label, @Nullable ch.bailu.gtk.type.Strs options, @Nullable ch.bailu.gtk.type.Strs option_labels)  {
        JnaFileChooser.INST().gtk_file_chooser_add_choice(asCPointer(), id, label, asCPointer(options), asCPointer(option_labels));
    }

    /**
     * Adds &#64;filter to the list of filters that the user can select between.
     * <br>
     * <br>When a filter is selected, only files that are passed by that
     * <br>filter are displayed.
     * <br>
     * <br>Note that the &#64;chooser takes ownership of the filter if it is floating,
     * <br>so you have to ref and sink it if you want to keep a reference.
     * @param filter a `GtkFileFilter`
    */
    public void addFilter(@Nonnull FileFilter filter)  {
        JnaFileChooser.INST().gtk_file_chooser_add_filter(asCPointer(), asCPointerNotNull(filter));
    }

    /**
     * Adds a folder to be displayed with the shortcut folders
     * <br>in a file chooser.
     * @param folder a `GFile` for the folder to add
     * @return %TRUE if the folder could be added successfully,   %FALSE otherwise.
    */
    public boolean addShortcutFolder(@Nonnull ch.bailu.gtk.gio.File folder) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileChooser.INST().gtk_file_chooser_add_shortcut_folder(asCPointer(), asCPointerNotNull(folder), 0L);
    }

    /**
     * Gets the type of operation that the file chooser is performing.
     * @return the action that the file selector is performing
    */
    public int getAction()  {
        return JnaFileChooser.INST().gtk_file_chooser_get_action(asCPointer());
    }

    /**
     * Gets the currently selected option in the 'choice' with the given ID.
     * @param id the ID of the choice to get
     * @return the ID of the currently selected option
    */
    public ch.bailu.gtk.type.Str getChoice(@Nonnull ch.bailu.gtk.type.Str id)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_choice(asCPointer(), asCPointerNotNull(id))));
    }

    /**
     * Gets the currently selected option in the 'choice' with the given ID.
     * @param id the ID of the choice to get
     * @return the ID of the currently selected option
    */
    public ch.bailu.gtk.type.Str getChoice(String id)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_choice(asCPointer(), id)));
    }

    /**
     * Gets whether file chooser will offer to create new folders.
     * @return %TRUE if the Create Folder button should be displayed.
    */
    public boolean getCreateFolders()  {
        return JnaFileChooser.INST().gtk_file_chooser_get_create_folders(asCPointer());
    }

    /**
     * Gets the current folder of &#64;chooser as `GFile`.
     * @return the `GFile` for the current folder.
    */
    public ch.bailu.gtk.gio.File getCurrentFolder()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_current_folder(asCPointer())));
    }

    /**
     * Gets the current name in the file selector, as entered by the user.
     * <br>
     * <br>This is meant to be used in save dialogs, to get the currently typed
     * <br>filename when the file itself does not exist yet.
     * @return The raw text from the file chooser’s “Name” entry. Free with   g_free(). Note that this string is not a full pathname or URI; it is   whatever the contents of the entry are. Note also that this string is   in UTF-8 encoding, which is not necessarily the system’s encoding for   filenames.
    */
    public ch.bailu.gtk.type.Str getCurrentName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_current_name(asCPointer())));
    }

    /**
     * Gets the `GFile` for the currently selected file in
     * <br>the file selector.
     * <br>
     * <br>If multiple files are selected, one of the files will be
     * <br>returned at random.
     * <br>
     * <br>If the file chooser is in folder mode, this function returns
     * <br>the selected folder.
     * @return a selected `GFile`. You own the   returned file; use g_object_unref() to release it.
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_file(asCPointer())));
    }

    /**
     * Lists all the selected files and subfolders in the current folder
     * <br>of &#64;chooser as `GFile`.
     * @return a list model containing a `GFile` for each   selected file and subfolder in the current folder. Free the returned   list with g_object_unref().
    */
    public ch.bailu.gtk.gio.ListModel getFiles()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_files(asCPointer())));
    }

    /**
     * Gets the current filter.
     * @return the current filter
    */
    public FileFilter getFilter()  {
        return new FileFilter(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_filter(asCPointer())));
    }

    /**
     * Gets the current set of user-selectable filters, as a list model.
     * <br>
     * <br>See [method&#64;Gtk.FileChooser.add_filter] and
     * <br>[method&#64;Gtk.FileChooser.remove_filter] for changing individual filters.
     * <br>
     * <br>You should not modify the returned list model. Future changes to
     * <br>&#64;chooser may or may not affect the returned model.
     * @return a `GListModel` containing the current set   of user-selectable filters.
    */
    public ch.bailu.gtk.gio.ListModel getFilters()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_filters(asCPointer())));
    }

    /**
     * Gets whether multiple files can be selected in the file
     * <br>chooser.
     * @return %TRUE if multiple files can be selected.
    */
    public boolean getSelectMultiple()  {
        return JnaFileChooser.INST().gtk_file_chooser_get_select_multiple(asCPointer());
    }

    /**
     * Queries the list of shortcut folders in the file chooser.
     * <br>
     * <br>You should not modify the returned list model. Future changes to
     * <br>&#64;chooser may or may not affect the returned model.
     * @return A list model of `GFile`s
    */
    public ch.bailu.gtk.gio.ListModel getShortcutFolders()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFileChooser.INST().gtk_file_chooser_get_shortcut_folders(asCPointer())));
    }

    /**
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     * @param id the ID of the choice to remove
    */
    public void removeChoice(@Nonnull ch.bailu.gtk.type.Str id)  {
        JnaFileChooser.INST().gtk_file_chooser_remove_choice(asCPointer(), asCPointerNotNull(id));
    }

    /**
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     * @param id the ID of the choice to remove
    */
    public void removeChoice(String id)  {
        JnaFileChooser.INST().gtk_file_chooser_remove_choice(asCPointer(), id);
    }

    /**
     * Removes &#64;filter from the list of filters that the user can select between.
     * @param filter a `GtkFileFilter`
    */
    public void removeFilter(@Nonnull FileFilter filter)  {
        JnaFileChooser.INST().gtk_file_chooser_remove_filter(asCPointer(), asCPointerNotNull(filter));
    }

    /**
     * Removes a folder from the shortcut folders in a file chooser.
     * @param folder a `GFile` for the folder to remove
     * @return %TRUE if the folder could be removed successfully,   %FALSE otherwise.
    */
    public boolean removeShortcutFolder(@Nonnull ch.bailu.gtk.gio.File folder) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileChooser.INST().gtk_file_chooser_remove_shortcut_folder(asCPointer(), asCPointerNotNull(folder), 0L);
    }

    /**
     * Sets the type of operation that the chooser is performing.
     * <br>
     * <br>The user interface is adapted to suit the selected action.
     * <br>
     * <br>For example, an option to create a new folder might be shown
     * <br>if the action is %GTK_FILE_CHOOSER_ACTION_SAVE but not if the
     * <br>action is %GTK_FILE_CHOOSER_ACTION_OPEN.
     * @param action the action that the file selector is performing
    */
    public void setAction(int action)  {
        JnaFileChooser.INST().gtk_file_chooser_set_action(asCPointer(), action);
    }

    /**
     * Selects an option in a 'choice' that has been added with
     * <br>gtk_file_chooser_add_choice().
     * <br>
     * <br>For a boolean choice, the possible options are &quot;true&quot; and &quot;false&quot;.
     * @param id the ID of the choice to set
     * @param option the ID of the option to select
    */
    public void setChoice(@Nonnull ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str option)  {
        JnaFileChooser.INST().gtk_file_chooser_set_choice(asCPointer(), asCPointerNotNull(id), asCPointerNotNull(option));
    }

    /**
     * Selects an option in a 'choice' that has been added with
     * <br>gtk_file_chooser_add_choice().
     * <br>
     * <br>For a boolean choice, the possible options are &quot;true&quot; and &quot;false&quot;.
     * @param id the ID of the choice to set
     * @param option the ID of the option to select
    */
    public void setChoice(String id, String option)  {
        JnaFileChooser.INST().gtk_file_chooser_set_choice(asCPointer(), id, option);
    }

    /**
     * Sets whether file chooser will offer to create new folders.
     * <br>
     * <br>This is only relevant if the action is not set to be
     * <br>%GTK_FILE_CHOOSER_ACTION_OPEN.
     * @param create_folders %TRUE if the Create Folder button should be displayed
    */
    public void setCreateFolders(boolean create_folders)  {
        JnaFileChooser.INST().gtk_file_chooser_set_create_folders(asCPointer(), create_folders);
    }

    /**
     * Sets the current folder for &#64;chooser from a `GFile`.
     * @param file the `GFile` for the new folder
     * @return %TRUE if the folder could be changed successfully, %FALSE   otherwise.
    */
    public boolean setCurrentFolder(@Nullable ch.bailu.gtk.gio.File file) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileChooser.INST().gtk_file_chooser_set_current_folder(asCPointer(), asCPointer(file), 0L);
    }

    /**
     * Sets the current name in the file selector, as if entered
     * <br>by the user.
     * <br>
     * <br>Note that the name passed in here is a UTF-8 string rather
     * <br>than a filename. This function is meant for such uses as a
     * <br>suggested name in a “Save As...” dialog.  You can pass
     * <br>“Untitled.doc” or a similarly suitable suggestion for the &#64;name.
     * <br>
     * <br>If you want to preselect a particular existing file, you should
     * <br>use [method&#64;Gtk.FileChooser.set_file] instead.
     * <br>
     * <br>Please see the documentation for those functions for an example
     * <br>of using [method&#64;Gtk.FileChooser.set_current_name] as well.
     * @param name the filename to use, as a UTF-8 string
    */
    public void setCurrentName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaFileChooser.INST().gtk_file_chooser_set_current_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets the current name in the file selector, as if entered
     * <br>by the user.
     * <br>
     * <br>Note that the name passed in here is a UTF-8 string rather
     * <br>than a filename. This function is meant for such uses as a
     * <br>suggested name in a “Save As...” dialog.  You can pass
     * <br>“Untitled.doc” or a similarly suitable suggestion for the &#64;name.
     * <br>
     * <br>If you want to preselect a particular existing file, you should
     * <br>use [method&#64;Gtk.FileChooser.set_file] instead.
     * <br>
     * <br>Please see the documentation for those functions for an example
     * <br>of using [method&#64;Gtk.FileChooser.set_current_name] as well.
     * @param name the filename to use, as a UTF-8 string
    */
    public void setCurrentName(String name)  {
        JnaFileChooser.INST().gtk_file_chooser_set_current_name(asCPointer(), name);
    }

    /**
     * Sets &#64;file as the current filename for the file chooser.
     * <br>
     * <br>This includes changing to the file’s parent folder and actually selecting
     * <br>the file in list. If the &#64;chooser is in %GTK_FILE_CHOOSER_ACTION_SAVE mode,
     * <br>the file’s base name will also appear in the dialog’s file name entry.
     * <br>
     * <br>If the file name isn’t in the current folder of &#64;chooser, then the current
     * <br>folder of &#64;chooser will be changed to the folder containing &#64;file.
     * <br>
     * <br>Note that the file must exist, or nothing will be done except
     * <br>for the directory change.
     * <br>
     * <br>If you are implementing a save dialog, you should use this function if
     * <br>you already have a file name to which the user may save; for example,
     * <br>when the user opens an existing file and then does “Save As…”. If you
     * <br>don’t have a file name already — for example, if the user just created
     * <br>a new file and is saving it for the first time, do not call this function.
     * <br>
     * <br>Instead, use something similar to this:
     * <br>
     * <br>```c
     * <br>static void
     * <br>prepare_file_chooser (GtkFileChooser *chooser,
     * <br>                      GFile          *existing_file)
     * <br>{
     * <br>  gboolean document_is_new = (existing_file == NULL);
     * <br>
     * <br>  if (document_is_new)
     * <br>    {
     * <br>      GFile *default_file_for_saving = g_file_new_for_path (&quot;./out.txt&quot;);
     * <br>      // the user just created a new document
     * <br>      gtk_file_chooser_set_current_folder (chooser, default_file_for_saving, NULL);
     * <br>      gtk_file_chooser_set_current_name (chooser, &quot;Untitled document&quot;);
     * <br>      g_object_unref (default_file_for_saving);
     * <br>    }
     * <br>  else
     * <br>    {
     * <br>      // the user edited an existing document
     * <br>      gtk_file_chooser_set_file (chooser, existing_file, NULL);
     * <br>    }
     * <br>}
     * <br>```
     * @param file the `GFile` to set as current
     * @return Not useful
    */
    public boolean setFile(@Nonnull ch.bailu.gtk.gio.File file) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaFileChooser.INST().gtk_file_chooser_set_file(asCPointer(), asCPointerNotNull(file), 0L);
    }

    /**
     * Sets the current filter.
     * <br>
     * <br>Only the files that pass the filter will be displayed.
     * <br>If the user-selectable list of filters is non-empty, then
     * <br>the filter should be one of the filters in that list.
     * <br>
     * <br>Setting the current filter when the list of filters is
     * <br>empty is useful if you want to restrict the displayed
     * <br>set of files without letting the user change it.
     * @param filter a `GtkFileFilter`
    */
    public void setFilter(@Nonnull FileFilter filter)  {
        JnaFileChooser.INST().gtk_file_chooser_set_filter(asCPointer(), asCPointerNotNull(filter));
    }

    /**
     * Sets whether multiple files can be selected in the file chooser.
     * <br>
     * <br>This is only relevant if the action is set to be
     * <br>%GTK_FILE_CHOOSER_ACTION_OPEN or
     * <br>%GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
     * @param select_multiple %TRUE if multiple files can be selected.
    */
    public void setSelectMultiple(boolean select_multiple)  {
        JnaFileChooser.INST().gtk_file_chooser_set_select_multiple(asCPointer(), select_multiple);
    }

    public static long getTypeID() { 
        return JnaFileChooser.INST().gtk_file_chooser_get_type(); 
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
interface-type
*/
