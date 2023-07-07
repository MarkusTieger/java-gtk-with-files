/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPasswordEntry` is an entry that has been tailored for entering secrets.
 * <br>
 * <br>![An example GtkPasswordEntry](password-entry.png)
 * <br>
 * <br>It does not show its contents in clear text, does not allow to copy it
 * <br>to the clipboard, and it shows a warning when Caps Lock is engaged. If
 * <br>the underlying platform allows it, `GtkPasswordEntry` will also place
 * <br>the text in a non-pageable memory area, to avoid it being written out
 * <br>to disk by the operating system.
 * <br>
 * <br>Optionally, it can offer a way to reveal the contents in clear text.
 * <br>
 * <br>`GtkPasswordEntry` provides only minimal API and should be used with
 * <br>the [iface&#64;Gtk.Editable] API.
 * <br>
 * <br>&#35; CSS Nodes
 * <br>
 * <br>```
 * <br>entry.password
 * <br>╰── text
 * <br>    ├── image.caps-lock-indicator
 * <br>    ┊
 * <br>```
 * <br>
 * <br>`GtkPasswordEntry` has a single CSS node with name entry that carries
 * <br>a .passwordstyle class. The text Css node below it has a child with
 * <br>name image and style class .caps-lock-indicator for the Caps Lock
 * <br>icon, and possibly other children.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkPasswordEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.PasswordEntry.html">https://docs.gtk.org/gtk4/class.PasswordEntry.html</a></p>
*/
public class PasswordEntry extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PasswordEntry.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when the entry is activated.
         * <br>
         * <br>The keybindings for this signal are all forms of the Enter key.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaPasswordEntry.OnActivate) (__self, __data) -> in.onActivate();
    }

    public PasswordEntry(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkPasswordEntry`.
    */
    public PasswordEntry() {
        super(cast(JnaPasswordEntry.INST().gtk_password_entry_new()));
    }

    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getExtraMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaPasswordEntry.INST().gtk_password_entry_get_extra_menu(asCPointer())));
    }

    /**
     * Returns whether the entry is showing an icon to
     * <br>reveal the contents.
     * @return %TRUE if an icon is shown
    */
    public boolean getShowPeekIcon()  {
        return JnaPasswordEntry.INST().gtk_password_entry_get_show_peek_icon(asCPointer());
    }

    /**
     * Sets a menu model to add when constructing
     * <br>the context menu for &#64;entry.
     * @param model a `GMenuModel`
    */
    public void setExtraMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaPasswordEntry.INST().gtk_password_entry_set_extra_menu(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether the entry should have a clickable icon
     * <br>to reveal the contents.
     * <br>
     * <br>Setting this to %FALSE also hides the text again.
     * @param show_peek_icon whether to show the peek icon
    */
    public void setShowPeekIcon(boolean show_peek_icon)  {
        JnaPasswordEntry.INST().gtk_password_entry_set_show_peek_icon(asCPointer(), show_peek_icon);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
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
     * Implements interface {@link Editable}. Call this to get access to interface functions.
     * @return {@link Editable}
    */
    public Editable asEditable() {
        return new Editable(cast());
    }

    public static long getTypeID() { 
        return JnaPasswordEntry.INST().gtk_password_entry_get_type(); 
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
