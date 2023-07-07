/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;Gtk.ListBoxRow] used to present actions.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;action-row-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;action-row.png&quot; alt=&quot;action-row&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwActionRow` widget can have a title, a subtitle and an icon. The row
 * <br>can receive additional widgets at its end, or prefix widgets at its start.
 * <br>
 * <br>It is convenient to present a preference and its related actions.
 * <br>
 * <br>`AdwActionRow` is unactivatable by default, giving it an activatable widget
 * <br>will automatically make it activatable, but unsetting it won't change the
 * <br>row's activatability.
 * <br>
 * <br>&#35;&#35; AdwActionRow as GtkBuildable
 * <br>
 * <br>The `AdwActionRow` implementation of the [iface&#64;Gtk.Buildable] interface
 * <br>supports adding a child at its end by specifying “suffix” or omitting the
 * <br>“type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>It also supports adding a child as a prefix widget by specifying “prefix” as
 * <br>the “type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwActionRow` has a main CSS node with name `row`.
 * <br>
 * <br>It contains the subnode `box.header` for its main horizontal box, and
 * <br>`box.title` for the vertical box containing the title and subtitle labels.
 * <br>
 * <br>It contains subnodes `label.title` and `label.subtitle` representing
 * <br>respectively the title label and subtitle label.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ActionRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ActionRow.html</a></p>
*/
public class ActionRow extends PreferencesRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionRow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivated {
        /**
         * This signal is emitted after the row has been activated.
        */
        void onActivated();
    }
    
    private static com.sun.jna.Callback toOnActivated(OnActivated in) {
        return (in == null) ? null: (JnaActionRow.OnActivated) (__self, __data) -> in.onActivated();
    }

    public ActionRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwActionRow`.
    */
    public ActionRow() {
        super(cast(JnaActionRow.INST().adw_action_row_new()));
    }

    /**
     * Adds a prefix widget to &#64;self.
     * @param widget a widget
    */
    public void addPrefix(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaActionRow.INST().adw_action_row_add_prefix(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Adds a suffix widget to &#64;self.
     * @param widget a widget
    */
    public void addSuffix(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaActionRow.INST().adw_action_row_add_suffix(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets the widget activated when &#64;self is activated.
     * @return the activatable widget for &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getActivatableWidget()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaActionRow.INST().adw_action_row_get_activatable_widget(asCPointer())));
    }

    /**
     * Gets the icon name for &#64;self.
     * @return the icon name for &#64;self
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaActionRow.INST().adw_action_row_get_icon_name(asCPointer())));
    }

    /**
     * Gets the subtitle for &#64;self.
     * @return the subtitle for &#64;self
    */
    public ch.bailu.gtk.type.Str getSubtitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaActionRow.INST().adw_action_row_get_subtitle(asCPointer())));
    }

    /**
     * Gets the number of lines at the end of which the subtitle label will be
     * <br>ellipsized.
     * @return the number of lines at the end of which the subtitle label will be   ellipsized
    */
    public int getSubtitleLines()  {
        return JnaActionRow.INST().adw_action_row_get_subtitle_lines(asCPointer());
    }

    /**
     * Gets the number of lines at the end of which the title label will be
     * <br>ellipsized.
     * @return the number of lines at the end of which the title label will be   ellipsized
    */
    public int getTitleLines()  {
        return JnaActionRow.INST().adw_action_row_get_title_lines(asCPointer());
    }

    /**
     * Removes a child from &#64;self.
     * @param widget the child to be removed
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaActionRow.INST().adw_action_row_remove(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Sets the widget to activate when &#64;self is activated.
     * <br>
     * <br>The row can be activated either by clicking on it, calling
     * <br>[method&#64;ActionRow.activate], or via mnemonics in the title or the subtitle.
     * <br>See the [property&#64;PreferencesRow:use-underline] property to enable mnemonics.
     * <br>
     * <br>The target widget will be activated by emitting the
     * <br>[signal&#64;Gtk.Widget::mnemonic-activate] signal on it.
     * @param widget the target widget
    */
    public void setActivatableWidget(@Nullable ch.bailu.gtk.gtk.Widget widget)  {
        JnaActionRow.INST().adw_action_row_set_activatable_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaActionRow.INST().adw_action_row_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name for &#64;self.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaActionRow.INST().adw_action_row_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the subtitle for &#64;self.
     * <br>
     * <br>The subtitle is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param subtitle the subtitle
    */
    public void setSubtitle(@Nonnull ch.bailu.gtk.type.Str subtitle)  {
        JnaActionRow.INST().adw_action_row_set_subtitle(asCPointer(), asCPointerNotNull(subtitle));
    }

    /**
     * Sets the subtitle for &#64;self.
     * <br>
     * <br>The subtitle is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param subtitle the subtitle
    */
    public void setSubtitle(String subtitle)  {
        JnaActionRow.INST().adw_action_row_set_subtitle(asCPointer(), subtitle);
    }

    /**
     * Sets the number of lines at the end of which the subtitle label will be
     * <br>ellipsized.
     * <br>
     * <br>If the value is 0, the number of lines won't be limited.
     * @param subtitle_lines the number of lines at the end of which the subtitle label will be ellipsized
    */
    public void setSubtitleLines(int subtitle_lines)  {
        JnaActionRow.INST().adw_action_row_set_subtitle_lines(asCPointer(), subtitle_lines);
    }

    /**
     * Sets the number of lines at the end of which the title label will be
     * <br>ellipsized.
     * <br>
     * <br>If the value is 0, the number of lines won't be limited.
     * @param title_lines the number of lines at the end of which the title label will be ellipsized
    */
    public void setTitleLines(int title_lines)  {
        JnaActionRow.INST().adw_action_row_set_title_lines(asCPointer(), title_lines);
    }

    public final static String SIGNAL_ON_ACTIVATED = "activated";
    
    /**
     * Connect to signal "activated".
     * <br>See {@link OnActivated#onActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivated(OnActivated signal) {
        return connectSignal(SIGNAL_ON_ACTIVATED, toOnActivated(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Actionable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Actionable}
    */
    public ch.bailu.gtk.gtk.Actionable asActionable() {
        return new ch.bailu.gtk.gtk.Actionable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaActionRow.INST().adw_action_row_get_type(); 
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

[MethodModel:method-filter:activate:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
