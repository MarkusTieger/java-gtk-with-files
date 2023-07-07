/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPageSetupUnixDialog` implements a page setup dialog for platforms
 * <br>which don’t provide a native page setup dialog, like Unix.
 * <br>
 * <br>![An example GtkPageSetupUnixDialog](pagesetupdialog.png)
 * <br>
 * <br>It can be used very much like any other GTK dialog, at the
 * <br>cost of the portability offered by the high-level printing
 * <br>API in [class&#64;Gtk.PrintOperation].
 * <p><a href="https://docs.gtk.org/gtk4/class.PageSetupUnixDialog.html">https://docs.gtk.org/gtk4/class.PageSetupUnixDialog.html</a></p>
*/
public class PageSetupUnixDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PageSetupUnixDialog.class.getCanonicalName());
    }

    public PageSetupUnixDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new page setup dialog.
     * @param title the title of the dialog
     * @param parent transient parent of the dialog
    */
    public PageSetupUnixDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent) {
        super(cast(JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_new(asCPointer(title), asCPointer(parent))));
    }

    /**
     * Creates a new page setup dialog.
     * @param title the title of the dialog
     * @param parent transient parent of the dialog
    */
    public PageSetupUnixDialog(String title, @Nullable Window parent) {
        super(cast(JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_new(title, asCPointer(parent))));
    }

    /**
     * Gets the currently selected page setup from the dialog.
     * @return the current page setup
    */
    public PageSetup getPageSetup()  {
        return new PageSetup(new PointerContainer(JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_get_page_setup(asCPointer())));
    }

    /**
     * Gets the current print settings from the dialog.
     * @return the current print settings
    */
    public PrintSettings getPrintSettings()  {
        return new PrintSettings(new PointerContainer(JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_get_print_settings(asCPointer())));
    }

    /**
     * Sets the `GtkPageSetup` from which the page setup
     * <br>dialog takes its values.
     * @param page_setup a `GtkPageSetup`
    */
    public void setPageSetup(@Nonnull PageSetup page_setup)  {
        JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_set_page_setup(asCPointer(), asCPointerNotNull(page_setup));
    }

    /**
     * Sets the `GtkPrintSettings` from which the page setup dialog
     * <br>takes its values.
     * @param print_settings a `GtkPrintSettings`
    */
    public void setPrintSettings(@Nullable PrintSettings print_settings)  {
        JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_set_print_settings(asCPointer(), asCPointer(print_settings));
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
        return JnaPageSetupUnixDialog.INST().gtk_page_setup_unix_dialog_get_type(); 
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
