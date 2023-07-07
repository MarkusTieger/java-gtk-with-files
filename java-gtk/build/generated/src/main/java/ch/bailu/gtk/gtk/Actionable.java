/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkActionable` interface provides a convenient way of asscociating
 * <br>widgets with actions.
 * <br>
 * <br>It primarily consists of two properties: [property&#64;Gtk.Actionable:action-name]
 * <br>and [property&#64;Gtk.Actionable:action-target]. There are also some convenience
 * <br>APIs for setting these properties.
 * <br>
 * <br>The action will be looked up in action groups that are found among
 * <br>the widgets ancestors. Most commonly, these will be the actions with
 * <br>the “win.” or “app.” prefix that are associated with the
 * <br>`GtkApplicationWindow` or `GtkApplication`, but other action groups that
 * <br>are added with [method&#64;Gtk.Widget.insert_action_group] will be consulted
 * <br>as well.
 * <p><a href="https://docs.gtk.org/gtk4/iface.Actionable.html">https://docs.gtk.org/gtk4/iface.Actionable.html</a></p>
*/
public class Actionable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Actionable.class.getCanonicalName());
    }

    public Actionable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the action name for &#64;actionable.
     * @return the action name
    */
    public ch.bailu.gtk.type.Str getActionName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaActionable.INST().gtk_actionable_get_action_name(asCPointer())));
    }

    /**
     * Gets the current target value of &#64;actionable.
     * @return the current target value
    */
    public ch.bailu.gtk.glib.Variant getActionTargetValue()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaActionable.INST().gtk_actionable_get_action_target_value(asCPointer())));
    }

    /**
     * Specifies the name of the action with which this widget should be
     * <br>associated.
     * <br>
     * <br>If &#64;action_name is %NULL then the widget will be unassociated from
     * <br>any previous action.
     * <br>
     * <br>Usually this function is used when the widget is located (or will be
     * <br>located) within the hierarchy of a `GtkApplicationWindow`.
     * <br>
     * <br>Names are of the form “win.save” or “app.quit” for actions on the
     * <br>containing [class&#64;ApplicationWindow] or its associated [class&#64;Application],
     * <br>respectively. This is the same form used for actions in the [class&#64;Gio.Menu]
     * <br>associated with the window.
     * @param action_name an action name
    */
    public void setActionName(@Nullable ch.bailu.gtk.type.Str action_name)  {
        JnaActionable.INST().gtk_actionable_set_action_name(asCPointer(), asCPointer(action_name));
    }

    /**
     * Specifies the name of the action with which this widget should be
     * <br>associated.
     * <br>
     * <br>If &#64;action_name is %NULL then the widget will be unassociated from
     * <br>any previous action.
     * <br>
     * <br>Usually this function is used when the widget is located (or will be
     * <br>located) within the hierarchy of a `GtkApplicationWindow`.
     * <br>
     * <br>Names are of the form “win.save” or “app.quit” for actions on the
     * <br>containing [class&#64;ApplicationWindow] or its associated [class&#64;Application],
     * <br>respectively. This is the same form used for actions in the [class&#64;Gio.Menu]
     * <br>associated with the window.
     * @param action_name an action name
    */
    public void setActionName(String action_name)  {
        JnaActionable.INST().gtk_actionable_set_action_name(asCPointer(), action_name);
    }

    /**
     * Sets the target of an actionable widget.
     * <br>
     * <br>This is a convenience function that calls [ctor&#64;GLib.Variant.new] for
     * <br>&#64;format_string and uses the result to call
     * <br>[method&#64;Gtk.Actionable.set_action_target_value].
     * <br>
     * <br>If you are setting a string-valued target and want to set
     * <br>the action name at the same time, you can use
     * <br>[method&#64;Gtk.Actionable.set_detailed_action_name].
     * @param format_string a [struct&#64;GLib.Variant] format string
     * @param _elipse arguments appropriate for &#64;format_string
    */
    public void setActionTarget(@Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaActionable.INST().gtk_actionable_set_action_target(asCPointer(), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Sets the target of an actionable widget.
     * <br>
     * <br>This is a convenience function that calls [ctor&#64;GLib.Variant.new] for
     * <br>&#64;format_string and uses the result to call
     * <br>[method&#64;Gtk.Actionable.set_action_target_value].
     * <br>
     * <br>If you are setting a string-valued target and want to set
     * <br>the action name at the same time, you can use
     * <br>[method&#64;Gtk.Actionable.set_detailed_action_name].
     * @param format_string a [struct&#64;GLib.Variant] format string
     * @param _elipse arguments appropriate for &#64;format_string
    */
    public void setActionTarget(String format_string, java.lang.Object... _elipse)  {
        JnaActionable.INST().gtk_actionable_set_action_target(asCPointer(), format_string, _elipse);
    }

    /**
     * Sets the target value of an actionable widget.
     * <br>
     * <br>If &#64;target_value is %NULL then the target value is unset.
     * <br>
     * <br>The target value has two purposes. First, it is used as the parameter
     * <br>to activation of the action associated with the `GtkActionable` widget.
     * <br>Second, it is used to determine if the widget should be rendered as
     * <br>“active” — the widget is active if the state is equal to the given target.
     * <br>
     * <br>Consider the example of associating a set of buttons with a [iface&#64;Gio.Action]
     * <br>with string state in a typical “radio button” situation. Each button
     * <br>will be associated with the same action, but with a different target
     * <br>value for that action. Clicking on a particular button will activate
     * <br>the action with the target of that button, which will typically cause
     * <br>the action’s state to change to that value. Since the action’s state
     * <br>is now equal to the target value of the button, the button will now
     * <br>be rendered as active (and the other buttons, with different targets,
     * <br>rendered inactive).
     * @param target_value a [struct&#64;GLib.Variant] to set as the target value
    */
    public void setActionTargetValue(@Nullable ch.bailu.gtk.glib.Variant target_value)  {
        JnaActionable.INST().gtk_actionable_set_action_target_value(asCPointer(), asCPointer(target_value));
    }

    /**
     * Sets the action-name and associated string target value of an
     * <br>actionable widget.
     * <br>
     * <br>&#64;detailed_action_name is a string in the format accepted by
     * <br>[func&#64;Gio.Action.parse_detailed_name].
     * @param detailed_action_name the detailed action name
    */
    public void setDetailedActionName(@Nonnull ch.bailu.gtk.type.Str detailed_action_name)  {
        JnaActionable.INST().gtk_actionable_set_detailed_action_name(asCPointer(), asCPointerNotNull(detailed_action_name));
    }

    /**
     * Sets the action-name and associated string target value of an
     * <br>actionable widget.
     * <br>
     * <br>&#64;detailed_action_name is a string in the format accepted by
     * <br>[func&#64;Gio.Action.parse_detailed_name].
     * @param detailed_action_name the detailed action name
    */
    public void setDetailedActionName(String detailed_action_name)  {
        JnaActionable.INST().gtk_actionable_set_detailed_action_name(asCPointer(), detailed_action_name);
    }

    public static long getTypeID() { 
        return JnaActionable.INST().gtk_actionable_get_type(); 
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
