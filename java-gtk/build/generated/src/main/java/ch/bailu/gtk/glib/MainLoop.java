/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GMainLoop` struct is an opaque data type
 * <br>representing the main event loop of a GLib or GTK+ application.
 * <p><a href="https://docs.gtk.org/glib/struct.MainLoop.html">https://docs.gtk.org/glib/struct.MainLoop.html</a></p>
*/
public class MainLoop extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MainLoop.class.getCanonicalName());
    }

    public MainLoop(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GMainLoop structure.
     * @param context a &#35;GMainContext  (if %NULL, the default context will be used).
     * @param is_running set to %TRUE to indicate that the loop is running. This is not very important since calling g_main_loop_run() will set this to %TRUE anyway.
    */
    public MainLoop(@Nullable MainContext context, boolean is_running) {
        super(cast(JnaMainLoop.INST().g_main_loop_new(asCPointer(context), is_running)));
    }

    /**
     * Returns the &#35;GMainContext of &#64;loop.
     * @return the &#35;GMainContext of &#64;loop
    */
    public MainContext getContext()  {
        return new MainContext(new PointerContainer(JnaMainLoop.INST().g_main_loop_get_context(asCPointer())));
    }

    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     * @return %TRUE if the mainloop is currently being run.
    */
    public boolean isRunning()  {
        return JnaMainLoop.INST().g_main_loop_is_running(asCPointer());
    }

    /**
     * Stops a &#35;GMainLoop from running. Any calls to g_main_loop_run()
     * <br>for the loop will return.
     * <br>
     * <br>Note that sources that have already been dispatched when
     * <br>g_main_loop_quit() is called will still be executed.
    */
    public void quit()  {
        JnaMainLoop.INST().g_main_loop_quit(asCPointer());
    }

    /**
     * Increases the reference count on a &#35;GMainLoop object by one.
     * @return &#64;loop
    */
    public MainLoop ref()  {
        return new MainLoop(new PointerContainer(JnaMainLoop.INST().g_main_loop_ref(asCPointer())));
    }

    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * <br>If this is called for the thread of the loop's &#35;GMainContext,
     * <br>it will process events from the loop, otherwise it will
     * <br>simply wait.
    */
    public void run()  {
        JnaMainLoop.INST().g_main_loop_run(asCPointer());
    }

    /**
     * Decreases the reference count on a &#35;GMainLoop object by one. If
     * <br>the result is zero, free the loop and free all associated memory.
    */
    public void unref()  {
        JnaMainLoop.INST().g_main_loop_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMainLoop.INST().g_main_loop_get_type(); 
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
record-type
all-fields-supported
*/
