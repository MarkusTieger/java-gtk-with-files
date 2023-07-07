/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPrintUnixDialog` implements a print dialog for platforms
 * <br>which don’t provide a native print dialog, like Unix.
 * <br>
 * <br>![An example GtkPrintUnixDialog](printdialog.png)
 * <br>
 * <br>It can be used very much like any other GTK dialog, at the cost of
 * <br>the portability offered by the high-level printing API with
 * <br>[class&#64;Gtk.PrintOperation].
 * <br>
 * <br>In order to print something with `GtkPrintUnixDialog`, you need to
 * <br>use [method&#64;Gtk.PrintUnixDialog.get_selected_printer] to obtain a
 * <br>[class&#64;Gtk.Printer] object and use it to construct a [class&#64;Gtk.PrintJob]
 * <br>using [ctor&#64;Gtk.PrintJob.new].
 * <br>
 * <br>`GtkPrintUnixDialog` uses the following response values:
 * <br>
 * <br>- %GTK_RESPONSE_OK: for the “Print” button
 * <br>- %GTK_RESPONSE_APPLY: for the “Preview” button
 * <br>- %GTK_RESPONSE_CANCEL: for the “Cancel” button
 * <br>
 * <br>&#35; GtkPrintUnixDialog as GtkBuildable
 * <br>
 * <br>The `GtkPrintUnixDialog` implementation of the `GtkBuildable` interface
 * <br>exposes its &#64;notebook internal children with the name “notebook”.
 * <br>
 * <br>An example of a `GtkPrintUnixDialog` UI definition fragment:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkPrintUnixDialog&quot; id=&quot;dialog1&quot;&gt;
 * <br>  &lt;child internal-child=&quot;notebook&quot;&gt;
 * <br>    &lt;object class=&quot;GtkNotebook&quot; id=&quot;notebook&quot;&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object type=&quot;GtkNotebookPage&quot;&gt;
 * <br>          &lt;property name=&quot;tab_expand&quot;&gt;False&lt;/property&gt;
 * <br>          &lt;property name=&quot;tab_fill&quot;&gt;False&lt;/property&gt;
 * <br>          &lt;property name=&quot;tab&quot;&gt;
 * <br>            &lt;object class=&quot;GtkLabel&quot; id=&quot;tablabel&quot;&gt;
 * <br>              &lt;property name=&quot;label&quot;&gt;Tab label&lt;/property&gt;
 * <br>            &lt;/object&gt;
 * <br>          &lt;/property&gt;
 * <br>          &lt;property name=&quot;child&quot;&gt;
 * <br>            &lt;object class=&quot;GtkLabel&quot; id=&quot;tabcontent&quot;&gt;
 * <br>              &lt;property name=&quot;label&quot;&gt;Content on notebook tab&lt;/property&gt;
 * <br>            &lt;/object&gt;
 * <br>          &lt;/property&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/child&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkPrintUnixDialog` has a single CSS node with name window. The style classes
 * <br>dialog and print are added.
 * <p><a href="https://docs.gtk.org/gtk4/class.PrintUnixDialog.html">https://docs.gtk.org/gtk4/class.PrintUnixDialog.html</a></p>
*/
public class PrintUnixDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintUnixDialog.class.getCanonicalName());
    }

    public PrintUnixDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPrintUnixDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public PrintUnixDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent) {
        super(cast(JnaPrintUnixDialog.INST().gtk_print_unix_dialog_new(asCPointer(title), asCPointer(parent))));
    }

    /**
     * Creates a new `GtkPrintUnixDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public PrintUnixDialog(String title, @Nullable Window parent) {
        super(cast(JnaPrintUnixDialog.INST().gtk_print_unix_dialog_new(title, asCPointer(parent))));
    }

    /**
     * Adds a custom tab to the print dialog.
     * @param child the widget to put in the custom tab
     * @param tab_label the widget to use as tab label
    */
    public void addCustomTab(@Nonnull Widget child, @Nonnull Widget tab_label)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_add_custom_tab(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(tab_label));
    }

    /**
     * Gets the current page of the `GtkPrintUnixDialog`.
     * @return the current page of &#64;dialog
    */
    public int getCurrentPage()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_current_page(asCPointer());
    }

    /**
     * Gets whether to embed the page setup.
     * @return whether to embed the page setup
    */
    public boolean getEmbedPageSetup()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_embed_page_setup(asCPointer());
    }

    /**
     * Gets whether there is a selection.
     * @return whether there is a selection
    */
    public boolean getHasSelection()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_has_selection(asCPointer());
    }

    /**
     * Gets the capabilities that have been set on this `GtkPrintUnixDialog`.
     * @return the printing capabilities
    */
    public int getManualCapabilities()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_manual_capabilities(asCPointer());
    }

    /**
     * Gets the page setup that is used by the `GtkPrintUnixDialog`.
     * @return the page setup of &#64;dialog.
    */
    public PageSetup getPageSetup()  {
        return new PageSetup(new PointerContainer(JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_page_setup(asCPointer())));
    }

    /**
     * Gets whether a page setup was set by the user.
     * @return whether a page setup was set by user.
    */
    public boolean getPageSetupSet()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_page_setup_set(asCPointer());
    }

    /**
     * Gets the currently selected printer.
     * @return the currently selected printer
    */
    public Printer getSelectedPrinter()  {
        return new Printer(new PointerContainer(JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_selected_printer(asCPointer())));
    }

    /**
     * Gets whether the print dialog allows user to print a selection.
     * @return whether the application supports print of selection
    */
    public boolean getSupportSelection()  {
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_support_selection(asCPointer());
    }

    /**
     * Sets the current page number.
     * <br>
     * <br>If &#64;current_page is not -1, this enables the current page choice
     * <br>for the range of pages to print.
     * @param current_page the current page number.
    */
    public void setCurrentPage(int current_page)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_current_page(asCPointer(), current_page);
    }

    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * @param embed embed page setup selection
    */
    public void setEmbedPageSetup(boolean embed)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_embed_page_setup(asCPointer(), embed);
    }

    /**
     * Sets whether a selection exists.
     * @param has_selection %TRUE indicates that a selection exists
    */
    public void setHasSelection(boolean has_selection)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_has_selection(asCPointer(), has_selection);
    }

    /**
     * This lets you specify the printing capabilities your application
     * <br>supports.
     * <br>
     * <br>For instance, if you can handle scaling the output then you pass
     * <br>%GTK_PRINT_CAPABILITY_SCALE. If you don’t pass that, then the dialog
     * <br>will only let you select the scale if the printing system automatically
     * <br>handles scaling.
     * @param capabilities the printing capabilities of your application
    */
    public void setManualCapabilities(int capabilities)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_manual_capabilities(asCPointer(), capabilities);
    }

    /**
     * Sets the page setup of the `GtkPrintUnixDialog`.
     * @param page_setup a `GtkPageSetup`
    */
    public void setPageSetup(@Nonnull PageSetup page_setup)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_page_setup(asCPointer(), asCPointerNotNull(page_setup));
    }

    /**
     * Sets the `GtkPrintSettings` for the `GtkPrintUnixDialog`.
     * <br>
     * <br>Typically, this is used to restore saved print settings
     * <br>from a previous print operation before the print dialog
     * <br>is shown.
     * @param settings a `GtkPrintSettings`
    */
    public void setSettings(@Nullable PrintSettings settings)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_settings(asCPointer(), asCPointer(settings));
    }

    /**
     * Sets whether the print dialog allows user to print a selection.
     * @param support_selection %TRUE to allow print selection
    */
    public void setSupportSelection(boolean support_selection)  {
        JnaPrintUnixDialog.INST().gtk_print_unix_dialog_set_support_selection(asCPointer(), support_selection);
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
        return JnaPrintUnixDialog.INST().gtk_print_unix_dialog_get_type(); 
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

[MethodModel:method-filter:getSettings:[ParameterModel:Supported:{Gg:PrintSettings:{c:GtkPrintSettings*}}:{j:long}]]
*/
