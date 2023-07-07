/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget showing toasts above its content.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;toast-overlay-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;toast-overlay.png&quot; alt=&quot;toast-overlay&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>Much like [class&#64;Gtk.Overlay], `AdwToastOverlay` is a container with a single
 * <br>main child, on top of which it can display a [class&#64;Toast], overlaid.
 * <br>Toasts can be shown with [method&#64;ToastOverlay.add_toast].
 * <br>
 * <br>See [class&#64;Toast] for details.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>toastoverlay
 * <br>├── [child]
 * <br>├── toast
 * <br>┊   ├── widget
 * <br>┊   │   ├── [label.heading]
 * <br>    │   ╰── [custom title]
 * <br>    ├── [button]
 * <br>    ╰── button.circular.flat
 * <br>```
 * <br>
 * <br>`AdwToastOverlay`'s CSS node is called `toastoverlay`. It contains the child,
 * <br>as well as zero or more `toast` subnodes.
 * <br>
 * <br>Each of the `toast` nodes contains a `widget` subnode, optionally a `button`
 * <br>subnode, and another `button` subnode with `.circular` and `.flat` style
 * <br>classes.
 * <br>
 * <br>The `widget` subnode contains a `label` subnode with the `.heading` style
 * <br>class, or a custom widget provided by the application.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwToastOverlay` uses the `GTK_ACCESSIBLE_ROLE_TAB_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ToastOverlay.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ToastOverlay.html</a></p>
*/
public class ToastOverlay extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ToastOverlay.class.getCanonicalName());
    }

    public ToastOverlay(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwToastOverlay`.
    */
    public ToastOverlay() {
        super(cast(JnaToastOverlay.INST().adw_toast_overlay_new()));
    }

    /**
     * Displays &#64;toast.
     * <br>
     * <br>Only one toast can be shown at a time; if a toast is already being displayed,
     * <br>either &#64;toast or the original toast will be placed in a queue, depending on
     * <br>the priority of &#64;toast. See [property&#64;Toast:priority].
     * <br>
     * <br>If called on a toast that's already displayed, its timeout will be reset.
     * <br>
     * <br>If called on a toast currently in the queue, the toast will be bumped
     * <br>forward to be shown as soon as possible.
     * @param toast a toast
    */
    public void addToast(@Nonnull Toast toast)  {
        JnaToastOverlay.INST().adw_toast_overlay_add_toast(asCPointer(), asCPointerNotNull(toast));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaToastOverlay.INST().adw_toast_overlay_get_child(asCPointer())));
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaToastOverlay.INST().adw_toast_overlay_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
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
        return JnaToastOverlay.INST().adw_toast_overlay_get_type(); 
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
