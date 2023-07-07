/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkShortcutTrigger` tracks how a `GtkShortcut` should be activated.
 * <br>
 * <br>To find out if a `GtkShortcutTrigger` triggers, you can call
 * <br>[method&#64;Gtk.ShortcutTrigger.trigger] on a `GdkEvent`.
 * <br>
 * <br>`GtkShortcutTriggers` contain functions that allow easy presentation
 * <br>to end users as well as being printed for debugging.
 * <br>
 * <br>All `GtkShortcutTriggers` are immutable, you can only specify their
 * <br>properties during construction. If you want to change a trigger, you
 * <br>have to replace it with a new one.
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutTrigger.html">https://docs.gtk.org/gtk4/class.ShortcutTrigger.html</a></p>
*/
public class ShortcutTrigger extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutTrigger.class.getCanonicalName());
    }

    public ShortcutTrigger(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Tries to parse the given string into a trigger.
     * <br>
     * <br>On success, the parsed trigger is returned.
     * <br>When parsing failed, %NULL is returned.
     * <br>
     * <br>The accepted strings are:
     * <br>
     * <br>  - `never`, for `GtkNeverTrigger`
     * <br>  - a string parsed by gtk_accelerator_parse(), for a `GtkKeyvalTrigger`, e.g. `&lt;Control&gt;C`
     * <br>  - underscore, followed by a single character, for `GtkMnemonicTrigger`, e.g. `_l`
     * <br>  - two valid trigger strings, separated by a `|` character, for a
     * <br>    `GtkAlternativeTrigger`: `&lt;Control&gt;q|&lt;Control&gt;w`
     * <br>
     * <br>Note that you will have to escape the `&lt;` and `&gt;` characters when specifying
     * <br>triggers in XML files, such as GtkBuilder ui files. Use `&amp;lt;` instead of
     * <br>`&lt;` and `&amp;gt;` instead of `&gt;`.
     * @param string the string to parse
     * @return a new `GtkShortcutTrigger`
    */
    public static ShortcutTrigger parseStringShortcutTrigger(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaShortcutTrigger.INST().gtk_shortcut_trigger_parse_string(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("ShortcutTrigger:parseString");
        }
        return new ShortcutTrigger(__self);
    }        
    

    /**
     * Tries to parse the given string into a trigger.
     * <br>
     * <br>On success, the parsed trigger is returned.
     * <br>When parsing failed, %NULL is returned.
     * <br>
     * <br>The accepted strings are:
     * <br>
     * <br>  - `never`, for `GtkNeverTrigger`
     * <br>  - a string parsed by gtk_accelerator_parse(), for a `GtkKeyvalTrigger`, e.g. `&lt;Control&gt;C`
     * <br>  - underscore, followed by a single character, for `GtkMnemonicTrigger`, e.g. `_l`
     * <br>  - two valid trigger strings, separated by a `|` character, for a
     * <br>    `GtkAlternativeTrigger`: `&lt;Control&gt;q|&lt;Control&gt;w`
     * <br>
     * <br>Note that you will have to escape the `&lt;` and `&gt;` characters when specifying
     * <br>triggers in XML files, such as GtkBuilder ui files. Use `&amp;lt;` instead of
     * <br>`&lt;` and `&amp;gt;` instead of `&gt;`.
     * @param string the string to parse
     * @return a new `GtkShortcutTrigger`
    */
    public static ShortcutTrigger parseStringShortcutTrigger(String string)  {
        PointerContainer __self = cast(JnaShortcutTrigger.INST().gtk_shortcut_trigger_parse_string(string));
        if (__self.isNull()) {
            throw new NullPointerException("ShortcutTrigger:parseString");
        }
        return new ShortcutTrigger(__self);
    }        
    

    /**
     * The types of &#64;trigger1 and &#64;trigger2 are `gconstpointer` only to allow
     * <br>use of this function as a `GCompareFunc`.
     * <br>
     * <br>They must each be a `GtkShortcutTrigger`.
     * @param trigger2 a `GtkShortcutTrigger`
     * @return An integer less than, equal to, or greater than zero if   &#64;trigger1 is found, respectively, to be less than, to match,   or be greater than &#64;trigger2.
    */
    public int compare(@Nonnull ch.bailu.gtk.type.Pointer trigger2)  {
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_compare(asCPointer(), asCPointerNotNull(trigger2));
    }

    /**
     * Checks if &#64;trigger1 and &#64;trigger2 trigger under the same conditions.
     * <br>
     * <br>The types of &#64;one and &#64;two are `gconstpointer` only to allow use of this
     * <br>function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     * @param trigger2 a `GtkShortcutTrigger`
     * @return %TRUE if &#64;trigger1 and &#64;trigger2 are equal
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer trigger2)  {
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_equal(asCPointer(), asCPointerNotNull(trigger2));
    }

    /**
     * Generates a hash value for a `GtkShortcutTrigger`.
     * <br>
     * <br>The output of this function is guaranteed to be the same for a given
     * <br>value only per-process. It may change between different processor
     * <br>architectures or even different versions of GTK. Do not use this
     * <br>function as a basis for building protocols or file formats.
     * <br>
     * <br>The types of &#64;trigger is `gconstpointer` only to allow use of this
     * <br>function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     * @return a hash value corresponding to &#64;trigger
    */
    public int hash()  {
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_hash(asCPointer());
    }

    /**
     * Prints the given trigger into a string for the developer.
     * <br>This is meant for debugging and logging.
     * <br>
     * <br>The form of the representation may change at any time
     * <br>and is not guaranteed to stay identical.
     * @param string a `GString` to print into
    */
    public void print(@Nonnull ch.bailu.gtk.glib.GString string)  {
        JnaShortcutTrigger.INST().gtk_shortcut_trigger_print(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Prints the given trigger into a string.
     * <br>
     * <br>This function is returning a translated string for presentation
     * <br>to end users for example in menu items or in help texts.
     * <br>
     * <br>The &#64;display in use may influence the resulting string in
     * <br>various forms, such as resolving hardware keycodes or by
     * <br>causing display-specific modifier names.
     * <br>
     * <br>The form of the representation may change at any time and is
     * <br>not guaranteed to stay identical.
     * @param display `GdkDisplay` to print for
     * @param string a `GString` to print into
     * @return %TRUE if something was printed or %FALSE if the   trigger did not have a textual representation suitable   for end users.
    */
    public boolean printLabel(@Nonnull ch.bailu.gtk.gdk.Display display, @Nonnull ch.bailu.gtk.glib.GString string)  {
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_print_label(asCPointer(), asCPointerNotNull(display), asCPointerNotNull(string));
    }

    /**
     * Gets textual representation for the given trigger.
     * <br>
     * <br>This function is returning a translated string for
     * <br>presentation to end users for example in menu items
     * <br>or in help texts.
     * <br>
     * <br>The &#64;display in use may influence the resulting string in
     * <br>various forms, such as resolving hardware keycodes or by
     * <br>causing display-specific modifier names.
     * <br>
     * <br>The form of the representation may change at any time and is
     * <br>not guaranteed to stay identical.
     * @param display `GdkDisplay` to print for
     * @return a new string
    */
    public ch.bailu.gtk.type.Str toLabel(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaShortcutTrigger.INST().gtk_shortcut_trigger_to_label(asCPointer(), asCPointerNotNull(display))));
    }

    /**
     * Prints the given trigger into a human-readable string.
     * <br>
     * <br>This is a small wrapper around [method&#64;Gtk.ShortcutTrigger.print]
     * <br>to help when debugging.
     * @return a new string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaShortcutTrigger.INST().gtk_shortcut_trigger_to_string(asCPointer())));
    }

    /**
     * Checks if the given &#64;event triggers &#64;self.
     * @param event the event to check
     * @param enable_mnemonics %TRUE if mnemonics should trigger. Usually the   value of this property is determined by checking that the passed   in &#64;event is a Key event and has the right modifiers set.
     * @return Whether the event triggered the shortcut
    */
    public int trigger(@Nonnull ch.bailu.gtk.gdk.Event event, boolean enable_mnemonics)  {
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_trigger(asCPointer(), asCPointerNotNull(event), enable_mnemonics);
    }

    public static long getTypeID() { 
        return JnaShortcutTrigger.INST().gtk_shortcut_trigger_get_type(); 
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
