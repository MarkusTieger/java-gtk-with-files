/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkShortcutAction` encodes an action that can be triggered by a
 * <br>keyboard shortcut.
 * <br>
 * <br>`GtkShortcutActions` contain functions that allow easy presentation
 * <br>to end users as well as being printed for debugging.
 * <br>
 * <br>All `GtkShortcutActions` are immutable, you can only specify their
 * <br>properties during construction. If you want to change a action, you
 * <br>have to replace it with a new one. If you need to pass arguments to
 * <br>an action, these are specified by the higher-level `GtkShortcut` object.
 * <br>
 * <br>To activate a `GtkShortcutAction` manually, [method&#64;Gtk.ShortcutAction.activate]
 * <br>can be called.
 * <br>
 * <br>GTK provides various actions:
 * <br>
 * <br> - [class&#64;Gtk.MnemonicAction]: a shortcut action that calls
 * <br>   gtk_widget_mnemonic_activate()
 * <br> - [class&#64;Gtk.CallbackAction]: a shortcut action that invokes
 * <br>   a given callback
 * <br> - [class&#64;Gtk.SignalAction]: a shortcut action that emits a
 * <br>   given signal
 * <br> - [class&#64;Gtk.ActivateAction]: a shortcut action that calls
 * <br>   gtk_widget_activate()
 * <br> - [class&#64;Gtk.NamedAction]: a shortcut action that calls
 * <br>   gtk_widget_activate_action()
 * <br> - [class&#64;Gtk.NothingAction]: a shortcut action that does nothing
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutAction.html">https://docs.gtk.org/gtk4/class.ShortcutAction.html</a></p>
*/
public class ShortcutAction extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutAction.class.getCanonicalName());
    }

    public ShortcutAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Tries to parse the given string into an action.
     * <br>
     * <br>On success, the parsed action is returned. When parsing
     * <br>failed, %NULL is returned.
     * <br>
     * <br>The accepted strings are:
     * <br>
     * <br>- `nothing`, for `GtkNothingAction`
     * <br>- `activate`, for `GtkActivateAction`
     * <br>- `mnemonic-activate`, for `GtkMnemonicAction`
     * <br>- `action(NAME)`, for a `GtkNamedAction` for the action named `NAME`
     * <br>- `signal(NAME)`, for a `GtkSignalAction` for the signal `NAME`
     * @param string the string to parse
     * @return a new `GtkShortcutAction`
    */
    public static ShortcutAction parseStringShortcutAction(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaShortcutAction.INST().gtk_shortcut_action_parse_string(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("ShortcutAction:parseString");
        }
        return new ShortcutAction(__self);
    }        
    

    /**
     * Tries to parse the given string into an action.
     * <br>
     * <br>On success, the parsed action is returned. When parsing
     * <br>failed, %NULL is returned.
     * <br>
     * <br>The accepted strings are:
     * <br>
     * <br>- `nothing`, for `GtkNothingAction`
     * <br>- `activate`, for `GtkActivateAction`
     * <br>- `mnemonic-activate`, for `GtkMnemonicAction`
     * <br>- `action(NAME)`, for a `GtkNamedAction` for the action named `NAME`
     * <br>- `signal(NAME)`, for a `GtkSignalAction` for the signal `NAME`
     * @param string the string to parse
     * @return a new `GtkShortcutAction`
    */
    public static ShortcutAction parseStringShortcutAction(String string)  {
        PointerContainer __self = cast(JnaShortcutAction.INST().gtk_shortcut_action_parse_string(string));
        if (__self.isNull()) {
            throw new NullPointerException("ShortcutAction:parseString");
        }
        return new ShortcutAction(__self);
    }        
    

    /**
     * Activates the action on the &#64;widget with the given &#64;args.
     * <br>
     * <br>Note that some actions ignore the passed in &#64;flags, &#64;widget or &#64;args.
     * <br>
     * <br>Activation of an action can fail for various reasons. If the action
     * <br>is not supported by the &#64;widget, if the &#64;args don't match the action
     * <br>or if the activation otherwise had no effect, %FALSE will be returned.
     * @param flags flags to activate with
     * @param widget Target of the activation
     * @param args arguments to pass
     * @return %TRUE if this action was activated successfully
    */
    public boolean activate(int flags, @Nonnull Widget widget, @Nullable ch.bailu.gtk.glib.Variant args)  {
        return JnaShortcutAction.INST().gtk_shortcut_action_activate(asCPointer(), flags, asCPointerNotNull(widget), asCPointer(args));
    }

    /**
     * Prints the given action into a string for the developer.
     * <br>
     * <br>This is meant for debugging and logging.
     * <br>
     * <br>The form of the representation may change at any time and is
     * <br>not guaranteed to stay identical.
     * @param string a `GString` to print into
    */
    public void print(@Nonnull ch.bailu.gtk.glib.GString string)  {
        JnaShortcutAction.INST().gtk_shortcut_action_print(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Prints the given action into a human-readable string.
     * <br>
     * <br>This is a small wrapper around [method&#64;Gtk.ShortcutAction.print]
     * <br>to help when debugging.
     * @return a new string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaShortcutAction.INST().gtk_shortcut_action_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaShortcutAction.INST().gtk_shortcut_action_get_type(); 
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
