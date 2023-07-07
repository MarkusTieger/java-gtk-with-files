/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A singleton object that offers notification when displays appear or
 * <br>disappear.
 * <br>
 * <br>You can use [func&#64;Gdk.DisplayManager.get] to obtain the `GdkDisplayManager`
 * <br>singleton, but that should be rarely necessary. Typically, initializing
 * <br>GTK opens a display that you can work with without ever accessing the
 * <br>`GdkDisplayManager`.
 * <br>
 * <br>The GDK library can be built with support for multiple backends.
 * <br>The `GdkDisplayManager` object determines which backend is used
 * <br>at runtime.
 * <br>
 * <br>In the rare case that you need to influence which of the backends
 * <br>is being used, you can use [func&#64;Gdk.set_allowed_backends]. Note
 * <br>that you need to call this function before initializing GTK.
 * <br>
 * <br>&#35;&#35; Backend-specific code
 * <br>
 * <br>When writing backend-specific code that is supposed to work with
 * <br>multiple GDK backends, you have to consider both compile time and
 * <br>runtime. At compile time, use the `GDK_WINDOWING_X11`, `GDK_WINDOWING_WIN32`
 * <br>macros, etc. to find out which backends are present in the GDK library
 * <br>you are building your application against. At runtime, use type-check
 * <br>macros like GDK_IS_X11_DISPLAY() to find out which backend is in use:
 * <br>
 * <br>```c
 * <br>&#35;ifdef GDK_WINDOWING_X11
 * <br>  if (GDK_IS_X11_DISPLAY (display))
 * <br>    {
 * <br>      // make X11-specific calls here
 * <br>    }
 * <br>  else
 * <br>&#35;endif
 * <br>&#35;ifdef GDK_WINDOWING_MACOS
 * <br>  if (GDK_IS_MACOS_DISPLAY (display))
 * <br>    {
 * <br>      // make Quartz-specific calls here
 * <br>    }
 * <br>  else
 * <br>&#35;endif
 * <br>  g_error (&quot;Unsupported GDK backend&quot;);
 * <br>```
 * <p><a href="https://docs.gtk.org/gdk4/class.DisplayManager.html">https://docs.gtk.org/gdk4/class.DisplayManager.html</a></p>
*/
public class DisplayManager extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DisplayManager.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDisplayOpened {
        /**
         * Emitted when a display is opened.
         * @param display the opened display
        */
        void onDisplayOpened(@Nonnull Display display);
    }
    
    private static com.sun.jna.Callback toOnDisplayOpened(OnDisplayOpened in) {
        return (in == null) ? null: (JnaDisplayManager.OnDisplayOpened) (__self, _display, __data) -> in.onDisplayOpened(new Display(new PointerContainer(_display)));
    }

    public DisplayManager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the default `GdkDisplay`.
     * @return a `GdkDisplay`
    */
    public Display getDefaultDisplay()  {
        return new Display(new PointerContainer(JnaDisplayManager.INST().gdk_display_manager_get_default_display(asCPointer())));
    }

    /**
     * List all currently open displays.
     * @return a newly   allocated `GSList` of `GdkDisplay` objects
    */
    public ch.bailu.gtk.glib.SList listDisplays()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaDisplayManager.INST().gdk_display_manager_list_displays(asCPointer())));
    }

    /**
     * Opens a display.
     * @param name the name of the display to open
     * @return a `GdkDisplay`, or %NULL   if the display could not be opened
    */
    public Display openDisplay(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new Display(new PointerContainer(JnaDisplayManager.INST().gdk_display_manager_open_display(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Opens a display.
     * @param name the name of the display to open
     * @return a `GdkDisplay`, or %NULL   if the display could not be opened
    */
    public Display openDisplay(String name)  {
        return new Display(new PointerContainer(JnaDisplayManager.INST().gdk_display_manager_open_display(asCPointer(), name)));
    }

    /**
     * Sets &#64;display as the default display.
     * @param display a `GdkDisplay`
    */
    public void setDefaultDisplay(@Nonnull Display display)  {
        JnaDisplayManager.INST().gdk_display_manager_set_default_display(asCPointer(), asCPointerNotNull(display));
    }

    public final static String SIGNAL_ON_DISPLAY_OPENED = "display-opened";
    
    /**
     * Connect to signal "display-opened".
     * <br>See {@link OnDisplayOpened#onDisplayOpened} for signal description.
     * <br>Field {@link #SIGNAL_ON_DISPLAY_OPENED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDisplayOpened(OnDisplayOpened signal) {
        return connectSignal(SIGNAL_ON_DISPLAY_OPENED, toOnDisplayOpened(signal));
    }

    /**
     * Gets the singleton `GdkDisplayManager` object.
     * <br>
     * <br>When called for the first time, this function consults the
     * <br>`GDK_BACKEND` environment variable to find out which of the
     * <br>supported GDK backends to use (in case GDK has been compiled
     * <br>with multiple backends).
     * <br>
     * <br>Applications can use [func&#64;set_allowed_backends] to limit what
     * <br>backends wil be used.
     * @return The global `GdkDisplayManager` singleton
    */
    public static DisplayManager get()  {
        return new DisplayManager(new PointerContainer(JnaDisplayManager.INST().gdk_display_manager_get()));
    }

    public static long getTypeID() { 
        return JnaDisplayManager.INST().gdk_display_manager_get_type(); 
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
