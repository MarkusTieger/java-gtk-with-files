/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAppChooserDialog` shows a `GtkAppChooserWidget` inside a `GtkDialog`.
 * <br>
 * <br>![An example GtkAppChooserDialog](appchooserdialog.png)
 * <br>
 * <br>Note that `GtkAppChooserDialog` does not have any interesting methods
 * <br>of its own. Instead, you should get the embedded `GtkAppChooserWidget`
 * <br>using [method&#64;Gtk.AppChooserDialog.get_widget] and call its methods if
 * <br>the generic [iface&#64;Gtk.AppChooser] interface is not sufficient for
 * <br>your needs.
 * <br>
 * <br>To set the heading that is shown above the `GtkAppChooserWidget`,
 * <br>use [method&#64;Gtk.AppChooserDialog.set_heading].
 * <p><a href="https://docs.gtk.org/gtk4/class.AppChooserDialog.html">https://docs.gtk.org/gtk4/class.AppChooserDialog.html</a></p>
*/
public class AppChooserDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppChooserDialog.class.getCanonicalName());
    }

    public AppChooserDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAppChooserDialog` for the provided content type.
     * <br>
     * <br>The dialog will show applications that can open the content type.
     * @param parent a `GtkWindow`
     * @param flags flags for this dialog
     * @param content_type a content type string
     * @return a newly created `GtkAppChooserDialog`
    */
    public static AppChooserDialog newForContentTypeAppChooserDialog(@Nullable Window parent, int flags, @Nonnull ch.bailu.gtk.type.Str content_type)  {
        PointerContainer __self = cast(JnaAppChooserDialog.INST().gtk_app_chooser_dialog_new_for_content_type(asCPointer(parent), flags, asCPointerNotNull(content_type)));
        if (__self.isNull()) {
            throw new NullPointerException("AppChooserDialog:newForContentType");
        }
        return new AppChooserDialog(__self);
    }        
    

    /**
     * Creates a new `GtkAppChooserDialog` for the provided content type.
     * <br>
     * <br>The dialog will show applications that can open the content type.
     * @param parent a `GtkWindow`
     * @param flags flags for this dialog
     * @param content_type a content type string
     * @return a newly created `GtkAppChooserDialog`
    */
    public static AppChooserDialog newForContentTypeAppChooserDialog(@Nullable Window parent, int flags, String content_type)  {
        PointerContainer __self = cast(JnaAppChooserDialog.INST().gtk_app_chooser_dialog_new_for_content_type(asCPointer(parent), flags, content_type));
        if (__self.isNull()) {
            throw new NullPointerException("AppChooserDialog:newForContentType");
        }
        return new AppChooserDialog(__self);
    }        
    

    /**
     * Creates a new `GtkAppChooserDialog` for the provided `GFile`.
     * <br>
     * <br>The dialog will show applications that can open the file.
     * @param parent a `GtkWindow`
     * @param flags flags for this dialog
     * @param file a `GFile`
    */
    public AppChooserDialog(@Nullable Window parent, int flags, @Nonnull ch.bailu.gtk.gio.File file) {
        super(cast(JnaAppChooserDialog.INST().gtk_app_chooser_dialog_new(asCPointer(parent), flags, asCPointerNotNull(file))));
    }

    /**
     * Returns the text to display at the top of the dialog.
     * @return the text to display at the top of the dialog,   or %NULL, in which case a default text is displayed
    */
    public ch.bailu.gtk.type.Str getHeading()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppChooserDialog.INST().gtk_app_chooser_dialog_get_heading(asCPointer())));
    }

    /**
     * Returns the `GtkAppChooserWidget` of this dialog.
     * @return the `GtkAppChooserWidget` of &#64;self
    */
    public Widget getWidget()  {
        return new Widget(new PointerContainer(JnaAppChooserDialog.INST().gtk_app_chooser_dialog_get_widget(asCPointer())));
    }

    /**
     * Sets the text to display at the top of the dialog.
     * <br>
     * <br>If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
    */
    public void setHeading(@Nonnull ch.bailu.gtk.type.Str heading)  {
        JnaAppChooserDialog.INST().gtk_app_chooser_dialog_set_heading(asCPointer(), asCPointerNotNull(heading));
    }

    /**
     * Sets the text to display at the top of the dialog.
     * <br>
     * <br>If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
    */
    public void setHeading(String heading)  {
        JnaAppChooserDialog.INST().gtk_app_chooser_dialog_set_heading(asCPointer(), heading);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link AppChooser}. Call this to get access to interface functions.
     * @return {@link AppChooser}
    */
    public AppChooser asAppChooser() {
        return new AppChooser(cast());
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
        return JnaAppChooserDialog.INST().gtk_app_chooser_dialog_get_type(); 
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
