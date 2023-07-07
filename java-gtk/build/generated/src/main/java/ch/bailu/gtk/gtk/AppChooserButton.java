/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkAppChooserButton` lets the user select an application.
 * <br>
 * <br>![An example GtkAppChooserButton](appchooserbutton.png)
 * <br>
 * <br>Initially, a `GtkAppChooserButton` selects the first application
 * <br>in its list, which will either be the most-recently used application
 * <br>or, if [property&#64;Gtk.AppChooserButton:show-default-item] is %TRUE, the
 * <br>default application.
 * <br>
 * <br>The list of applications shown in a `GtkAppChooserButton` includes
 * <br>the recommended applications for the given content type. When
 * <br>[property&#64;Gtk.AppChooserButton:show-default-item] is set, the default
 * <br>application is also included. To let the user chooser other applications,
 * <br>you can set the [property&#64;Gtk.AppChooserButton:show-dialog-item] property,
 * <br>which allows to open a full [class&#64;Gtk.AppChooserDialog].
 * <br>
 * <br>It is possible to add custom items to the list, using
 * <br>[method&#64;Gtk.AppChooserButton.append_custom_item]. These items cause
 * <br>the [signal&#64;Gtk.AppChooserButton::custom-item-activated] signal to be
 * <br>emitted when they are selected.
 * <br>
 * <br>To track changes in the selected application, use the
 * <br>[signal&#64;Gtk.AppChooserButton::changed] signal.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkAppChooserButton` has a single CSS node with the name “appchooserbutton”.
 * <p><a href="https://docs.gtk.org/gtk4/class.AppChooserButton.html">https://docs.gtk.org/gtk4/class.AppChooserButton.html</a></p>
*/
public class AppChooserButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppChooserButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the button is activated.
         * <br>
         * <br>The `::activate` signal on `GtkAppChooserButton` is an action signal and
         * <br>emitting it causes the button to pop up its dialog.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaAppChooserButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the active application changes.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaAppChooserButton.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnCustomItemActivated {
        /**
         * Emitted when a custom item is activated.
         * <br>
         * <br>Use [method&#64;Gtk.AppChooserButton.append_custom_item],
         * <br>to add custom items.
         * @param item_name the name of the activated item
        */
        void onCustomItemActivated(@Nonnull ch.bailu.gtk.type.Str item_name);
    }
    
    private static com.sun.jna.Callback toOnCustomItemActivated(OnCustomItemActivated in) {
        return (in == null) ? null: (JnaAppChooserButton.OnCustomItemActivated) (__self, _item_name, __data) -> in.onCustomItemActivated(new ch.bailu.gtk.type.Str(new PointerContainer(_item_name)));
    }

    public AppChooserButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAppChooserButton` for applications
     * <br>that can handle content of the given type.
     * @param content_type the content type to show applications for
    */
    public AppChooserButton(@Nonnull ch.bailu.gtk.type.Str content_type) {
        super(cast(JnaAppChooserButton.INST().gtk_app_chooser_button_new(asCPointerNotNull(content_type))));
    }

    /**
     * Creates a new `GtkAppChooserButton` for applications
     * <br>that can handle content of the given type.
     * @param content_type the content type to show applications for
    */
    public AppChooserButton(String content_type) {
        super(cast(JnaAppChooserButton.INST().gtk_app_chooser_button_new(content_type)));
    }

    /**
     * Appends a custom item to the list of applications that is shown
     * <br>in the popup.
     * <br>
     * <br>The item name must be unique per-widget. Clients can use the
     * <br>provided name as a detail for the
     * <br>[signal&#64;Gtk.AppChooserButton::custom-item-activated] signal, to add a
     * <br>callback for the activation of a particular custom item in the list.
     * <br>
     * <br>See also [method&#64;Gtk.AppChooserButton.append_separator].
     * @param name the name of the custom item
     * @param label the label for the custom item
     * @param icon the icon for the custom item
    */
    public void appendCustomItem(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str label, @Nonnull ch.bailu.gtk.gio.Icon icon)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_append_custom_item(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(label), asCPointerNotNull(icon));
    }

    /**
     * Appends a custom item to the list of applications that is shown
     * <br>in the popup.
     * <br>
     * <br>The item name must be unique per-widget. Clients can use the
     * <br>provided name as a detail for the
     * <br>[signal&#64;Gtk.AppChooserButton::custom-item-activated] signal, to add a
     * <br>callback for the activation of a particular custom item in the list.
     * <br>
     * <br>See also [method&#64;Gtk.AppChooserButton.append_separator].
     * @param name the name of the custom item
     * @param label the label for the custom item
     * @param icon the icon for the custom item
    */
    public void appendCustomItem(String name, String label, @Nonnull ch.bailu.gtk.gio.Icon icon)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_append_custom_item(asCPointer(), name, label, asCPointerNotNull(icon));
    }

    /**
     * Appends a separator to the list of applications that is shown
     * <br>in the popup.
    */
    public void appendSeparator()  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_append_separator(asCPointer());
    }

    /**
     * Returns the text to display at the top of the dialog.
     * @return the text to display at the top of the dialog,   or %NULL, in which case a default text is displayed
    */
    public ch.bailu.gtk.type.Str getHeading()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppChooserButton.INST().gtk_app_chooser_button_get_heading(asCPointer())));
    }

    /**
     * Gets whether the dialog is modal.
     * @return %TRUE if the dialog is modal
    */
    public boolean getModal()  {
        return JnaAppChooserButton.INST().gtk_app_chooser_button_get_modal(asCPointer());
    }

    /**
     * Returns whether the dropdown menu should show the default
     * <br>application at the top.
     * @return the value of [property&#64;Gtk.AppChooserButton:show-default-item]
    */
    public boolean getShowDefaultItem()  {
        return JnaAppChooserButton.INST().gtk_app_chooser_button_get_show_default_item(asCPointer());
    }

    /**
     * Returns whether the dropdown menu shows an item
     * <br>for a `GtkAppChooserDialog`.
     * @return the value of [property&#64;Gtk.AppChooserButton:show-dialog-item]
    */
    public boolean getShowDialogItem()  {
        return JnaAppChooserButton.INST().gtk_app_chooser_button_get_show_dialog_item(asCPointer());
    }

    /**
     * Selects a custom item.
     * <br>
     * <br>See [method&#64;Gtk.AppChooserButton.append_custom_item].
     * <br>
     * <br>Use [method&#64;Gtk.AppChooser.refresh] to bring the selection
     * <br>to its initial state.
     * @param name the name of the custom item
    */
    public void setActiveCustomItem(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_active_custom_item(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Selects a custom item.
     * <br>
     * <br>See [method&#64;Gtk.AppChooserButton.append_custom_item].
     * <br>
     * <br>Use [method&#64;Gtk.AppChooser.refresh] to bring the selection
     * <br>to its initial state.
     * @param name the name of the custom item
    */
    public void setActiveCustomItem(String name)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_active_custom_item(asCPointer(), name);
    }

    /**
     * Sets the text to display at the top of the dialog.
     * <br>
     * <br>If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
    */
    public void setHeading(@Nonnull ch.bailu.gtk.type.Str heading)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_heading(asCPointer(), asCPointerNotNull(heading));
    }

    /**
     * Sets the text to display at the top of the dialog.
     * <br>
     * <br>If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
    */
    public void setHeading(String heading)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_heading(asCPointer(), heading);
    }

    /**
     * Sets whether the dialog should be modal.
     * @param modal %TRUE to make the dialog modal
    */
    public void setModal(boolean modal)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_modal(asCPointer(), modal);
    }

    /**
     * Sets whether the dropdown menu of this button should show the
     * <br>default application for the given content type at top.
     * @param setting the new value for [property&#64;Gtk.AppChooserButton:show-default-item]
    */
    public void setShowDefaultItem(boolean setting)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_show_default_item(asCPointer(), setting);
    }

    /**
     * Sets whether the dropdown menu of this button should show an
     * <br>entry to trigger a `GtkAppChooserDialog`.
     * @param setting the new value for [property&#64;Gtk.AppChooserButton:show-dialog-item]
    */
    public void setShowDialogItem(boolean setting)  {
        JnaAppChooserButton.INST().gtk_app_chooser_button_set_show_dialog_item(asCPointer(), setting);
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

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_CUSTOM_ITEM_ACTIVATED = "custom-item-activated";
    
    /**
     * Connect to signal "custom-item-activated".
     * <br>See {@link OnCustomItemActivated#onCustomItemActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_CUSTOM_ITEM_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCustomItemActivated(OnCustomItemActivated signal) {
        return connectSignal(SIGNAL_ON_CUSTOM_ITEM_ACTIVATED, toOnCustomItemActivated(signal));
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

    public static long getTypeID() { 
        return JnaAppChooserButton.INST().gtk_app_chooser_button_get_type(); 
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
