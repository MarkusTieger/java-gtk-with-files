/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkShortcutController` is an event controller that manages shortcuts.
 * <br>
 * <br>Most common shortcuts are using this controller implicitly, e.g. by
 * <br>adding a mnemonic underline to a `GtkLabel`, or by installing a key
 * <br>binding using [method&#64;Gtk.WidgetClass.add_binding], or by adding accelerators
 * <br>to global actions using [method&#64;Gtk.Application.set_accels_for_action].
 * <br>
 * <br>But it is possible to create your own shortcut controller, and add
 * <br>shortcuts to it.
 * <br>
 * <br>`GtkShortcutController` implements `GListModel` for querying the
 * <br>shortcuts that have been added to it.
 * <br>
 * <br>&#35; GtkShortcutController as a GtkBuildable
 * <br>
 * <br>`GtkShortcutControllers` can be creates in ui files to set up
 * <br>shortcuts in the same place as the widgets.
 * <br>
 * <br>An example of a UI definition fragment with `GtkShortcutController`:
 * <br>```xml
 * <br>  &lt;object class='GtkButton'&gt;
 * <br>    &lt;child&gt;
 * <br>      &lt;object class='GtkShortcutController'&gt;
 * <br>        &lt;property name='scope'&gt;managed&lt;/property&gt;
 * <br>        &lt;child&gt;
 * <br>          &lt;object class='GtkShortcut'&gt;
 * <br>            &lt;property name='trigger'&gt;&amp;lt;Control&amp;gt;k&lt;/property&gt;
 * <br>            &lt;property name='action'&gt;activate&lt;/property&gt;
 * <br>          &lt;/object&gt;
 * <br>        &lt;/child&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>  &lt;/object&gt;
 * <br>```
 * <br>
 * <br>This example creates a [class&#64;Gtk.ActivateAction] for triggering the
 * <br>`activate` signal of the `GtkButton`. See [ctor&#64;Gtk.ShortcutAction.parse_string]
 * <br>for the syntax for other kinds of `GtkShortcutAction`. See
 * <br>[ctor&#64;Gtk.ShortcutTrigger.parse_string] to learn more about the syntax
 * <br>for triggers.
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutController.html">https://docs.gtk.org/gtk4/class.ShortcutController.html</a></p>
*/
public class ShortcutController extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutController.class.getCanonicalName());
    }

    public ShortcutController(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new shortcut controller that takes its shortcuts from
     * <br>the given list model.
     * <br>
     * <br>A controller created by this function does not let you add or
     * <br>remove individual shortcuts using the shortcut controller api,
     * <br>but you can change the contents of the model.
     * @param model a `GListModel` containing shortcuts
     * @return a newly created shortcut controller
    */
    public static ShortcutController newForModelShortcutController(@Nonnull ch.bailu.gtk.gio.ListModel model)  {
        PointerContainer __self = cast(JnaShortcutController.INST().gtk_shortcut_controller_new_for_model(asCPointerNotNull(model)));
        if (__self.isNull()) {
            throw new NullPointerException("ShortcutController:newForModel");
        }
        return new ShortcutController(__self);
    }        
    

    /**
     * Creates a new shortcut controller.
    */
    public ShortcutController() {
        super(cast(JnaShortcutController.INST().gtk_shortcut_controller_new()));
    }

    /**
     * Adds &#64;shortcut to the list of shortcuts handled by &#64;self.
     * <br>
     * <br>If this controller uses an external shortcut list, this
     * <br>function does nothing.
     * @param shortcut a `GtkShortcut`
    */
    public void addShortcut(@Nonnull Shortcut shortcut)  {
        JnaShortcutController.INST().gtk_shortcut_controller_add_shortcut(asCPointer(), asCPointerNotNull(shortcut));
    }

    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     * @return the controller's mnemonics modifiers
    */
    public int getMnemonicsModifiers()  {
        return JnaShortcutController.INST().gtk_shortcut_controller_get_mnemonics_modifiers(asCPointer());
    }

    /**
     * Gets the scope for when this controller activates its shortcuts.
     * <br>
     * <br>See [method&#64;Gtk.ShortcutController.set_scope] for details.
     * @return the controller's scope
    */
    public int getScope()  {
        return JnaShortcutController.INST().gtk_shortcut_controller_get_scope(asCPointer());
    }

    /**
     * Removes &#64;shortcut from the list of shortcuts handled by &#64;self.
     * <br>
     * <br>If &#64;shortcut had not been added to &#64;controller or this controller
     * <br>uses an external shortcut list, this function does nothing.
     * @param shortcut a `GtkShortcut`
    */
    public void removeShortcut(@Nonnull Shortcut shortcut)  {
        JnaShortcutController.INST().gtk_shortcut_controller_remove_shortcut(asCPointer(), asCPointerNotNull(shortcut));
    }

    /**
     * Sets the controller to use the given modifier for mnemonics.
     * <br>
     * <br>The mnemonics modifiers determines which modifiers need to be pressed to allow
     * <br>activation of shortcuts with mnemonics triggers.
     * <br>
     * <br>GTK normally uses the Alt modifier for mnemonics, except in `GtkPopoverMenu`s,
     * <br>where mnemonics can be triggered without any modifiers. It should be very
     * <br>rarely necessary to change this, and doing so is likely to interfere with
     * <br>other shortcuts.
     * <br>
     * <br>This value is only relevant for local shortcut controllers. Global and managed
     * <br>shortcut controllers will have their shortcuts activated from other places which
     * <br>have their own modifiers for activating mnemonics.
     * @param modifiers the new mnemonics_modifiers to use
    */
    public void setMnemonicsModifiers(int modifiers)  {
        JnaShortcutController.INST().gtk_shortcut_controller_set_mnemonics_modifiers(asCPointer(), modifiers);
    }

    /**
     * Sets the controller to have the given &#64;scope.
     * <br>
     * <br>The scope allows shortcuts to be activated outside of the normal
     * <br>event propagation. In particular, it allows installing global
     * <br>keyboard shortcuts that can be activated even when a widget does
     * <br>not have focus.
     * <br>
     * <br>With %GTK_SHORTCUT_SCOPE_LOCAL, shortcuts will only be activated
     * <br>when the widget has focus.
     * @param scope the new scope to use
    */
    public void setScope(int scope)  {
        JnaShortcutController.INST().gtk_shortcut_controller_set_scope(asCPointer(), scope);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaShortcutController.INST().gtk_shortcut_controller_get_type(); 
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
