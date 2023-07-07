/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkAppLaunchContext` handles launching an application in a graphical context.
 * <br>
 * <br>It is an implementation of `GAppLaunchContext` that provides startup
 * <br>notification and allows to launch applications on a specific workspace.
 * <br>
 * <br>&#35;&#35; Launching an application
 * <br>
 * <br>```c
 * <br>GdkAppLaunchContext *context;
 * <br>
 * <br>context = gdk_display_get_app_launch_context (display);
 * <br>
 * <br>gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
 * <br>
 * <br>if (!g_app_info_launch_default_for_uri (&quot;http://www.gtk.org&quot;, context, &amp;error))
 * <br>  g_warning (&quot;Launching failed: %s&#92;n&quot;, error-&gt;message);
 * <br>
 * <br>g_object_unref (context);
 * <br>```
 * <p><a href="https://docs.gtk.org/gdk4/class.AppLaunchContext.html">https://docs.gtk.org/gdk4/class.AppLaunchContext.html</a></p>
*/
public class AppLaunchContext extends ch.bailu.gtk.gio.AppLaunchContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppLaunchContext.class.getCanonicalName());
    }

    public AppLaunchContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the `GdkDisplay` that &#64;context is for.
     * @return the display of &#64;context
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaAppLaunchContext.INST().gdk_app_launch_context_get_display(asCPointer())));
    }

    /**
     * Sets the workspace on which applications will be launched.
     * <br>
     * <br>This only works when running under a window manager that
     * <br>supports multiple workspaces, as described in the
     * <br>[Extended Window Manager Hints](http://www.freedesktop.org/Standards/wm-spec).
     * <br>Specifically this sets the `_NET_WM_DESKTOP` property described
     * <br>in that spec.
     * <br>
     * <br>This only works when using the X11 backend.
     * <br>
     * <br>When the workspace is not specified or &#64;desktop is set to -1,
     * <br>it is up to the window manager to pick one, typically it will
     * <br>be the current workspace.
     * @param desktop the number of a workspace, or -1
    */
    public void setDesktop(int desktop)  {
        JnaAppLaunchContext.INST().gdk_app_launch_context_set_desktop(asCPointer(), desktop);
    }

    /**
     * Sets the icon for applications that are launched with this
     * <br>context.
     * <br>
     * <br>Window Managers can use this information when displaying startup
     * <br>notification.
     * <br>
     * <br>See also [method&#64;Gdk.AppLaunchContext.set_icon_name].
     * @param icon a `GIcon`
    */
    public void setIcon(@Nullable ch.bailu.gtk.gio.Icon icon)  {
        JnaAppLaunchContext.INST().gdk_app_launch_context_set_icon(asCPointer(), asCPointer(icon));
    }

    /**
     * Sets the icon for applications that are launched with this context.
     * <br>
     * <br>The &#64;icon_name will be interpreted in the same way as the Icon field
     * <br>in desktop files. See also [method&#64;Gdk.AppLaunchContext.set_icon].
     * <br>
     * <br>If both &#64;icon and &#64;icon_name are set, the &#64;icon_name takes priority.
     * <br>If neither &#64;icon or &#64;icon_name is set, the icon is taken from either
     * <br>the file that is passed to launched application or from the `GAppInfo`
     * <br>for the launched application itself.
     * @param icon_name an icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaAppLaunchContext.INST().gdk_app_launch_context_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon for applications that are launched with this context.
     * <br>
     * <br>The &#64;icon_name will be interpreted in the same way as the Icon field
     * <br>in desktop files. See also [method&#64;Gdk.AppLaunchContext.set_icon].
     * <br>
     * <br>If both &#64;icon and &#64;icon_name are set, the &#64;icon_name takes priority.
     * <br>If neither &#64;icon or &#64;icon_name is set, the icon is taken from either
     * <br>the file that is passed to launched application or from the `GAppInfo`
     * <br>for the launched application itself.
     * @param icon_name an icon name
    */
    public void setIconName(String icon_name)  {
        JnaAppLaunchContext.INST().gdk_app_launch_context_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the timestamp of &#64;context.
     * <br>
     * <br>The timestamp should ideally be taken from the event that
     * <br>triggered the launch.
     * <br>
     * <br>Window managers can use this information to avoid moving the
     * <br>focus to the newly launched application when the user is busy
     * <br>typing in another window. This is also known as 'focus stealing
     * <br>prevention'.
     * @param timestamp a timestamp
    */
    public void setTimestamp(int timestamp)  {
        JnaAppLaunchContext.INST().gdk_app_launch_context_set_timestamp(asCPointer(), timestamp);
    }

    public static long getTypeID() { 
        return JnaAppLaunchContext.INST().gdk_app_launch_context_get_type(); 
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
