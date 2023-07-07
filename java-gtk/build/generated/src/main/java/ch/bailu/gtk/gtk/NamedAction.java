/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutAction` that activates an action by name.
 * <p><a href="https://docs.gtk.org/gtk4/class.NamedAction.html">https://docs.gtk.org/gtk4/class.NamedAction.html</a></p>
*/
public class NamedAction extends ShortcutAction {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NamedAction.class.getCanonicalName());
    }

    public NamedAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an action that when activated, activates
     * <br>the named action on the widget.
     * <br>
     * <br>It also passes the given arguments to it.
     * <br>
     * <br>See [method&#64;Gtk.Widget.insert_action_group] for
     * <br>how to add actions to widgets.
     * @param name the detailed name of the action
    */
    public NamedAction(@Nonnull ch.bailu.gtk.type.Str name) {
        super(cast(JnaNamedAction.INST().gtk_named_action_new(asCPointerNotNull(name))));
    }

    /**
     * Creates an action that when activated, activates
     * <br>the named action on the widget.
     * <br>
     * <br>It also passes the given arguments to it.
     * <br>
     * <br>See [method&#64;Gtk.Widget.insert_action_group] for
     * <br>how to add actions to widgets.
     * @param name the detailed name of the action
    */
    public NamedAction(String name) {
        super(cast(JnaNamedAction.INST().gtk_named_action_new(name)));
    }

    /**
     * Returns the name of the action that will be activated.
     * @return the name of the action to activate
    */
    public ch.bailu.gtk.type.Str getActionName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNamedAction.INST().gtk_named_action_get_action_name(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaNamedAction.INST().gtk_named_action_get_type(); 
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
