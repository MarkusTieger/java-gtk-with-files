/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLockButton` is a widget to obtain and revoke authorizations
 * <br>needed to operate the controls.
 * <br>
 * <br>![An example GtkLockButton](lock-button.png)
 * <br>
 * <br>It is typically used in preference dialogs or control panels.
 * <br>
 * <br>The required authorization is represented by a `GPermission` object.
 * <br>Concrete implementations of `GPermission` may use PolicyKit or some
 * <br>other authorization framework. To obtain a PolicyKit-based
 * <br>`GPermission`, use `polkit_permission_new()`.
 * <br>
 * <br>If the user is not currently allowed to perform the action, but can
 * <br>obtain the permission, the widget looks like this:
 * <br>
 * <br>![](lockbutton-locked.png)
 * <br>
 * <br>and the user can click the button to request the permission. Depending
 * <br>on the platform, this may pop up an authentication dialog or ask the user
 * <br>to authenticate in some other way. Once the user has obtained the permission,
 * <br>the widget changes to this:
 * <br>
 * <br>![](lockbutton-unlocked.png)
 * <br>
 * <br>and the permission can be dropped again by clicking the button. If the user
 * <br>is not able to obtain the permission at all, the widget looks like this:
 * <br>
 * <br>![](lockbutton-sorry.png)
 * <br>
 * <br>If the user has the permission and cannot drop it, the button is hidden.
 * <br>
 * <br>The text (and tooltips) that are shown in the various cases can be adjusted
 * <br>with the [property&#64;Gtk.LockButton:text-lock],
 * <br>[property&#64;Gtk.LockButton:text-unlock],
 * <br>[property&#64;Gtk.LockButton:tooltip-lock],
 * <br>[property&#64;Gtk.LockButton:tooltip-unlock] and
 * <br>[property&#64;Gtk.LockButton:tooltip-not-authorized] properties.
 * <p><a href="https://docs.gtk.org/gtk4/class.LockButton.html">https://docs.gtk.org/gtk4/class.LockButton.html</a></p>
*/
public class LockButton extends Button {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LockButton.class.getCanonicalName());
    }

    public LockButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new lock button which reflects the &#64;permission.
     * @param permission a `GPermission`
    */
    public LockButton(@Nullable ch.bailu.gtk.gio.Permission permission) {
        super(cast(JnaLockButton.INST().gtk_lock_button_new(asCPointer(permission))));
    }

    /**
     * Obtains the `GPermission` object that controls &#64;button.
     * @return the `GPermission` of &#64;button
    */
    public ch.bailu.gtk.gio.Permission getPermission()  {
        return new ch.bailu.gtk.gio.Permission(new PointerContainer(JnaLockButton.INST().gtk_lock_button_get_permission(asCPointer())));
    }

    /**
     * Sets the `GPermission` object that controls &#64;button.
     * @param permission a `GPermission` object
    */
    public void setPermission(@Nullable ch.bailu.gtk.gio.Permission permission)  {
        JnaLockButton.INST().gtk_lock_button_set_permission(asCPointer(), asCPointer(permission));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Actionable}. Call this to get access to interface functions.
     * @return {@link Actionable}
    */
    public Actionable asActionable() {
        return new Actionable(cast());
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
        return JnaLockButton.INST().gtk_lock_button_get_type(); 
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
