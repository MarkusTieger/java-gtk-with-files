/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAppChooserWidget` is a widget for selecting applications.
 * <br>
 * <br>It is the main building block for [class&#64;Gtk.AppChooserDialog].
 * <br>Most applications only need to use the latter; but you can use
 * <br>this widget as part of a larger widget if you have special needs.
 * <br>
 * <br>`GtkAppChooserWidget` offers detailed control over what applications
 * <br>are shown, using the
 * <br>[property&#64;Gtk.AppChooserWidget:show-default],
 * <br>[property&#64;Gtk.AppChooserWidget:show-recommended],
 * <br>[property&#64;Gtk.AppChooserWidget:show-fallback],
 * <br>[property&#64;Gtk.AppChooserWidget:show-other] and
 * <br>[property&#64;Gtk.AppChooserWidget:show-all] properties. See the
 * <br>[iface&#64;Gtk.AppChooser] documentation for more information about these
 * <br>groups of applications.
 * <br>
 * <br>To keep track of the selected application, use the
 * <br>[signal&#64;Gtk.AppChooserWidget::application-selected] and
 * <br>[signal&#64;Gtk.AppChooserWidget::application-activated] signals.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkAppChooserWidget` has a single CSS node with name appchooser.
 * <p><a href="https://docs.gtk.org/gtk4/class.AppChooserWidget.html">https://docs.gtk.org/gtk4/class.AppChooserWidget.html</a></p>
*/
public class AppChooserWidget extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppChooserWidget.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnApplicationActivated {
        /**
         * Emitted when an application item is activated from the widget's list.
         * <br>
         * <br>This usually happens when the user double clicks an item, or an item
         * <br>is selected and the user presses one of the keys Space, Shift+Space,
         * <br>Return or Enter.
         * @param application the activated `GAppInfo`
        */
        void onApplicationActivated(@Nonnull ch.bailu.gtk.gio.AppInfo application);
    }
    
    private static com.sun.jna.Callback toOnApplicationActivated(OnApplicationActivated in) {
        return (in == null) ? null: (JnaAppChooserWidget.OnApplicationActivated) (__self, _application, __data) -> in.onApplicationActivated(new ch.bailu.gtk.gio.AppInfo(new PointerContainer(_application)));
    }

    @FunctionalInterface
    public interface OnApplicationSelected {
        /**
         * Emitted when an application item is selected from the widget's list.
         * @param application the selected `GAppInfo`
        */
        void onApplicationSelected(@Nonnull ch.bailu.gtk.gio.AppInfo application);
    }
    
    private static com.sun.jna.Callback toOnApplicationSelected(OnApplicationSelected in) {
        return (in == null) ? null: (JnaAppChooserWidget.OnApplicationSelected) (__self, _application, __data) -> in.onApplicationSelected(new ch.bailu.gtk.gio.AppInfo(new PointerContainer(_application)));
    }

    public AppChooserWidget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAppChooserWidget` for applications
     * <br>that can handle content of the given type.
     * @param content_type the content type to show applications for
    */
    public AppChooserWidget(@Nonnull ch.bailu.gtk.type.Str content_type) {
        super(cast(JnaAppChooserWidget.INST().gtk_app_chooser_widget_new(asCPointerNotNull(content_type))));
    }

    /**
     * Creates a new `GtkAppChooserWidget` for applications
     * <br>that can handle content of the given type.
     * @param content_type the content type to show applications for
    */
    public AppChooserWidget(String content_type) {
        super(cast(JnaAppChooserWidget.INST().gtk_app_chooser_widget_new(content_type)));
    }

    /**
     * Returns the text that is shown if there are not applications
     * <br>that can handle the content type.
     * @return the value of [property&#64;Gtk.AppChooserWidget:default-text]
    */
    public ch.bailu.gtk.type.Str getDefaultText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_default_text(asCPointer())));
    }

    /**
     * Gets whether the app chooser should show all applications
     * <br>in a flat list.
     * @return the value of [property&#64;Gtk.AppChooserWidget:show-all]
    */
    public boolean getShowAll()  {
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_show_all(asCPointer());
    }

    /**
     * Gets whether the app chooser should show the default handler
     * <br>for the content type in a separate section.
     * @return the value of [property&#64;Gtk.AppChooserWidget:show-default]
    */
    public boolean getShowDefault()  {
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_show_default(asCPointer());
    }

    /**
     * Gets whether the app chooser should show related applications
     * <br>for the content type in a separate section.
     * @return the value of [property&#64;Gtk.AppChooserWidget:show-fallback]
    */
    public boolean getShowFallback()  {
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_show_fallback(asCPointer());
    }

    /**
     * Gets whether the app chooser should show applications
     * <br>which are unrelated to the content type.
     * @return the value of [property&#64;Gtk.AppChooserWidget:show-other]
    */
    public boolean getShowOther()  {
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_show_other(asCPointer());
    }

    /**
     * Gets whether the app chooser should show recommended applications
     * <br>for the content type in a separate section.
     * @return the value of [property&#64;Gtk.AppChooserWidget:show-recommended]
    */
    public boolean getShowRecommended()  {
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_show_recommended(asCPointer());
    }

    /**
     * Sets the text that is shown if there are not applications
     * <br>that can handle the content type.
     * @param text the new value for [property&#64;Gtk.AppChooserWidget:default-text]
    */
    public void setDefaultText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_default_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Sets the text that is shown if there are not applications
     * <br>that can handle the content type.
     * @param text the new value for [property&#64;Gtk.AppChooserWidget:default-text]
    */
    public void setDefaultText(String text)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_default_text(asCPointer(), text);
    }

    /**
     * Sets whether the app chooser should show all applications
     * <br>in a flat list.
     * @param setting the new value for [property&#64;Gtk.AppChooserWidget:show-all]
    */
    public void setShowAll(boolean setting)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_show_all(asCPointer(), setting);
    }

    /**
     * Sets whether the app chooser should show the default handler
     * <br>for the content type in a separate section.
     * @param setting the new value for [property&#64;Gtk.AppChooserWidget:show-default]
    */
    public void setShowDefault(boolean setting)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_show_default(asCPointer(), setting);
    }

    /**
     * Sets whether the app chooser should show related applications
     * <br>for the content type in a separate section.
     * @param setting the new value for [property&#64;Gtk.AppChooserWidget:show-fallback]
    */
    public void setShowFallback(boolean setting)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_show_fallback(asCPointer(), setting);
    }

    /**
     * Sets whether the app chooser should show applications
     * <br>which are unrelated to the content type.
     * @param setting the new value for [property&#64;Gtk.AppChooserWidget:show-other]
    */
    public void setShowOther(boolean setting)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_show_other(asCPointer(), setting);
    }

    /**
     * Sets whether the app chooser should show recommended applications
     * <br>for the content type in a separate section.
     * @param setting the new value for [property&#64;Gtk.AppChooserWidget:show-recommended]
    */
    public void setShowRecommended(boolean setting)  {
        JnaAppChooserWidget.INST().gtk_app_chooser_widget_set_show_recommended(asCPointer(), setting);
    }

    public final static String SIGNAL_ON_APPLICATION_ACTIVATED = "application-activated";
    
    /**
     * Connect to signal "application-activated".
     * <br>See {@link OnApplicationActivated#onApplicationActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLICATION_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApplicationActivated(OnApplicationActivated signal) {
        return connectSignal(SIGNAL_ON_APPLICATION_ACTIVATED, toOnApplicationActivated(signal));
    }

    public final static String SIGNAL_ON_APPLICATION_SELECTED = "application-selected";
    
    /**
     * Connect to signal "application-selected".
     * <br>See {@link OnApplicationSelected#onApplicationSelected} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLICATION_SELECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApplicationSelected(OnApplicationSelected signal) {
        return connectSignal(SIGNAL_ON_APPLICATION_SELECTED, toOnApplicationSelected(signal));
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
        return JnaAppChooserWidget.INST().gtk_app_chooser_widget_get_type(); 
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
