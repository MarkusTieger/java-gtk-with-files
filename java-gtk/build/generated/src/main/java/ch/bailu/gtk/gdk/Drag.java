/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkDrag` object represents the source of an ongoing DND operation.
 * <br>
 * <br>A `GdkDrag` is created when a drag is started, and stays alive for duration of
 * <br>the DND operation. After a drag has been started with [func&#64;Gdk.Drag.begin],
 * <br>the caller gets informed about the status of the ongoing drag operation
 * <br>with signals on the `GdkDrag` object.
 * <br>
 * <br>GTK provides a higher level abstraction based on top of these functions,
 * <br>and so they are not normally needed in GTK applications. See the
 * <br>&quot;Drag and Drop&quot; section of the GTK documentation for more information.
 * <p><a href="https://docs.gtk.org/gdk4/class.Drag.html">https://docs.gtk.org/gdk4/class.Drag.html</a></p>
*/
public class Drag extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Drag.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCancel {
        /**
         * Emitted when the drag operation is cancelled.
         * @param reason The reason the drag was cancelled
        */
        void onCancel(int reason);
    }
    
    private static com.sun.jna.Callback toOnCancel(OnCancel in) {
        return (in == null) ? null: (JnaDrag.OnCancel) (__self, _reason, __data) -> in.onCancel(_reason);
    }

    @FunctionalInterface
    public interface OnDndFinished {
        /**
         * Emitted when the destination side has finished reading all data.
         * <br>
         * <br>The drag object can now free all miscellaneous data.
        */
        void onDndFinished();
    }
    
    private static com.sun.jna.Callback toOnDndFinished(OnDndFinished in) {
        return (in == null) ? null: (JnaDrag.OnDndFinished) (__self, __data) -> in.onDndFinished();
    }

    @FunctionalInterface
    public interface OnDropPerformed {
        /**
         * Emitted when the drop operation is performed on an accepting client.
        */
        void onDropPerformed();
    }
    
    private static com.sun.jna.Callback toOnDropPerformed(OnDropPerformed in) {
        return (in == null) ? null: (JnaDrag.OnDropPerformed) (__self, __data) -> in.onDropPerformed();
    }

    public Drag(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Informs GDK that the drop ended.
     * <br>
     * <br>Passing %FALSE for &#64;success may trigger a drag cancellation
     * <br>animation.
     * <br>
     * <br>This function is called by the drag source, and should be the
     * <br>last call before dropping the reference to the &#64;drag.
     * <br>
     * <br>The `GdkDrag` will only take the first [method&#64;Gdk.Drag.drop_done]
     * <br>call as effective, if this function is called multiple times,
     * <br>all subsequent calls will be ignored.
     * @param success whether the drag was ultimatively successful
    */
    public void dropDone(boolean success)  {
        JnaDrag.INST().gdk_drag_drop_done(asCPointer(), success);
    }

    /**
     * Determines the bitmask of possible actions proposed by the source.
     * @return the `GdkDragAction` flags
    */
    public int getActions()  {
        return JnaDrag.INST().gdk_drag_get_actions(asCPointer());
    }

    /**
     * Returns the `GdkContentProvider` associated to the `GdkDrag` object.
     * @return The `GdkContentProvider` associated to &#64;drag.
    */
    public ContentProvider getContent()  {
        return new ContentProvider(new PointerContainer(JnaDrag.INST().gdk_drag_get_content(asCPointer())));
    }

    /**
     * Returns the `GdkDevice` associated to the `GdkDrag` object.
     * @return The `GdkDevice` associated to &#64;drag.
    */
    public Device getDevice()  {
        return new Device(new PointerContainer(JnaDrag.INST().gdk_drag_get_device(asCPointer())));
    }

    /**
     * Gets the `GdkDisplay` that the drag object was created for.
     * @return a `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaDrag.INST().gdk_drag_get_display(asCPointer())));
    }

    /**
     * Returns the surface on which the drag icon should be rendered
     * <br>during the drag operation.
     * <br>
     * <br>Note that the surface may not be available until the drag operation
     * <br>has begun. GDK will move the surface in accordance with the ongoing
     * <br>drag operation. The surface is owned by &#64;drag and will be destroyed
     * <br>when the drag operation is over.
     * @return the drag surface
    */
    public Surface getDragSurface()  {
        return new Surface(new PointerContainer(JnaDrag.INST().gdk_drag_get_drag_surface(asCPointer())));
    }

    /**
     * Retrieves the formats supported by this `GdkDrag` object.
     * @return a `GdkContentFormats`
    */
    public ContentFormats getFormats()  {
        return new ContentFormats(new PointerContainer(JnaDrag.INST().gdk_drag_get_formats(asCPointer())));
    }

    /**
     * Determines the action chosen by the drag destination.
     * @return a `GdkDragAction` value
    */
    public int getSelectedAction()  {
        return JnaDrag.INST().gdk_drag_get_selected_action(asCPointer());
    }

    /**
     * Returns the `GdkSurface` where the drag originates.
     * @return The `GdkSurface` where the drag originates
    */
    public Surface getSurface()  {
        return new Surface(new PointerContainer(JnaDrag.INST().gdk_drag_get_surface(asCPointer())));
    }

    /**
     * Sets the position of the drag surface that will be kept
     * <br>under the cursor hotspot.
     * <br>
     * <br>Initially, the hotspot is at the top left corner of the drag surface.
     * @param hot_x x coordinate of the drag surface hotspot
     * @param hot_y y coordinate of the drag surface hotspot
    */
    public void setHotspot(int hot_x, int hot_y)  {
        JnaDrag.INST().gdk_drag_set_hotspot(asCPointer(), hot_x, hot_y);
    }

    public final static String SIGNAL_ON_CANCEL = "cancel";
    
    /**
     * Connect to signal "cancel".
     * <br>See {@link OnCancel#onCancel} for signal description.
     * <br>Field {@link #SIGNAL_ON_CANCEL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCancel(OnCancel signal) {
        return connectSignal(SIGNAL_ON_CANCEL, toOnCancel(signal));
    }

    public final static String SIGNAL_ON_DND_FINISHED = "dnd-finished";
    
    /**
     * Connect to signal "dnd-finished".
     * <br>See {@link OnDndFinished#onDndFinished} for signal description.
     * <br>Field {@link #SIGNAL_ON_DND_FINISHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDndFinished(OnDndFinished signal) {
        return connectSignal(SIGNAL_ON_DND_FINISHED, toOnDndFinished(signal));
    }

    public final static String SIGNAL_ON_DROP_PERFORMED = "drop-performed";
    
    /**
     * Connect to signal "drop-performed".
     * <br>See {@link OnDropPerformed#onDropPerformed} for signal description.
     * <br>Field {@link #SIGNAL_ON_DROP_PERFORMED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDropPerformed(OnDropPerformed signal) {
        return connectSignal(SIGNAL_ON_DROP_PERFORMED, toOnDropPerformed(signal));
    }

    /**
     * Starts a drag and creates a new drag context for it.
     * <br>
     * <br>This function is called by the drag source. After this call, you
     * <br>probably want to set up the drag icon using the surface returned
     * <br>by [method&#64;Gdk.Drag.get_drag_surface].
     * <br>
     * <br>This function returns a reference to the [class&#64;Gdk.Drag] object,
     * <br>but GTK keeps its own reference as well, as long as the DND operation
     * <br>is going on.
     * <br>
     * <br>Note: if &#64;actions include %GDK_ACTION_MOVE, you need to listen for
     * <br>the [signal&#64;Gdk.Drag::dnd-finished] signal and delete the data at
     * <br>the source if [method&#64;Gdk.Drag.get_selected_action] returns
     * <br>%GDK_ACTION_MOVE.
     * @param surface the source surface for this drag
     * @param device the device that controls this drag
     * @param content the offered content
     * @param actions the actions supported by this drag
     * @param dx the x offset to &#64;device's position where the drag nominally started
     * @param dy the y offset to &#64;device's position where the drag nominally started
     * @return a newly created `GdkDrag`
    */
    public static Drag begin(@Nonnull Surface surface, @Nonnull Device device, @Nonnull ContentProvider content, int actions, double dx, double dy)  {
        return new Drag(new PointerContainer(JnaDrag.INST().gdk_drag_begin(asCPointerNotNull(surface), asCPointerNotNull(device), asCPointerNotNull(content), actions, dx, dy)));
    }

    public static long getTypeID() { 
        return JnaDrag.INST().gdk_drag_get_type(); 
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
