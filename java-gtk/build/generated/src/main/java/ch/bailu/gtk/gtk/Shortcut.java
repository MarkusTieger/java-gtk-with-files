/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcut` describes a keyboard shortcut.
 * <br>
 * <br>It contains a description of how to trigger the shortcut via a
 * <br>[class&#64;Gtk.ShortcutTrigger] and a way to activate the shortcut
 * <br>on a widget via a [class&#64;Gtk.ShortcutAction].
 * <br>
 * <br>The actual work is usually done via [class&#64;Gtk.ShortcutController],
 * <br>which decides if and when to activate a shortcut. Using that controller
 * <br>directly however is rarely necessary as various higher level
 * <br>convenience APIs exist on `GtkWidget`s that make it easier to use
 * <br>shortcuts in GTK.
 * <br>
 * <br>`GtkShortcut` does provide functionality to make it easy for users
 * <br>to work with shortcuts, either by providing informational strings
 * <br>for display purposes or by allowing shortcuts to be configured.
 * <p><a href="https://docs.gtk.org/gtk4/class.Shortcut.html">https://docs.gtk.org/gtk4/class.Shortcut.html</a></p>
*/
public class Shortcut extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Shortcut.class.getCanonicalName());
    }

    public Shortcut(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkShortcut` that is triggered by &#64;trigger and then activates
     * <br>&#64;action with arguments given by &#64;format_string.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon   triggering
     * @param format_string GVariant format string for arguments or %NULL for   no arguments
     * @param _elipse arguments, as given by format string.
     * @return a new `GtkShortcut`
    */
    public static Shortcut newWithArgumentsShortcut(@Nullable ShortcutTrigger trigger, @Nullable ShortcutAction action, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaShortcut.INST().gtk_shortcut_new_with_arguments(asCPointer(trigger), asCPointer(action), asCPointer(format_string), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Shortcut:newWithArguments");
        }
        return new Shortcut(__self);
    }        
    

    /**
     * Creates a new `GtkShortcut` that is triggered by &#64;trigger and then activates
     * <br>&#64;action with arguments given by &#64;format_string.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon   triggering
     * @param format_string GVariant format string for arguments or %NULL for   no arguments
     * @param _elipse arguments, as given by format string.
     * @return a new `GtkShortcut`
    */
    public static Shortcut newWithArgumentsShortcut(@Nullable ShortcutTrigger trigger, @Nullable ShortcutAction action, String format_string, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaShortcut.INST().gtk_shortcut_new_with_arguments(asCPointer(trigger), asCPointer(action), format_string, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("Shortcut:newWithArguments");
        }
        return new Shortcut(__self);
    }        
    

    /**
     * Creates a new `GtkShortcut` that is triggered by
     * <br>&#64;trigger and then activates &#64;action.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon    triggering
    */
    public Shortcut(@Nullable ShortcutTrigger trigger, @Nullable ShortcutAction action) {
        super(cast(JnaShortcut.INST().gtk_shortcut_new(asCPointer(trigger), asCPointer(action))));
    }

    /**
     * Gets the action that is activated by this shortcut.
     * @return the action
    */
    public ShortcutAction getAction()  {
        return new ShortcutAction(new PointerContainer(JnaShortcut.INST().gtk_shortcut_get_action(asCPointer())));
    }

    /**
     * Gets the arguments that are passed when activating the shortcut.
     * @return the arguments
    */
    public ch.bailu.gtk.glib.Variant getArguments()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaShortcut.INST().gtk_shortcut_get_arguments(asCPointer())));
    }

    /**
     * Gets the trigger used to trigger &#64;self.
     * @return the trigger used
    */
    public ShortcutTrigger getTrigger()  {
        return new ShortcutTrigger(new PointerContainer(JnaShortcut.INST().gtk_shortcut_get_trigger(asCPointer())));
    }

    /**
     * Sets the new action for &#64;self to be &#64;action.
     * @param action The new action.   If the &#64;action is %NULL, the nothing action will be used.
    */
    public void setAction(@Nullable ShortcutAction action)  {
        JnaShortcut.INST().gtk_shortcut_set_action(asCPointer(), asCPointer(action));
    }

    /**
     * Sets the arguments to pass when activating the shortcut.
     * @param args arguments to pass when activating &#64;self
    */
    public void setArguments(@Nullable ch.bailu.gtk.glib.Variant args)  {
        JnaShortcut.INST().gtk_shortcut_set_arguments(asCPointer(), asCPointer(args));
    }

    /**
     * Sets the new trigger for &#64;self to be &#64;trigger.
     * @param trigger The new trigger.   If the &#64;trigger is %NULL, the never trigger will be used.
    */
    public void setTrigger(@Nullable ShortcutTrigger trigger)  {
        JnaShortcut.INST().gtk_shortcut_set_trigger(asCPointer(), asCPointer(trigger));
    }

    public static long getTypeID() { 
        return JnaShortcut.INST().gtk_shortcut_get_type(); 
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
