/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEventController` is the base class for event controllers.
 * <br>
 * <br>These are ancillary objects associated to widgets, which react
 * <br>to `GdkEvents`, and possibly trigger actions as a consequence.
 * <br>
 * <br>Event controllers are added to a widget with
 * <br>[method&#64;Gtk.Widget.add_controller]. It is rarely necessary to
 * <br>explicitly remove a controller with [method&#64;Gtk.Widget.remove_controller].
 * <br>
 * <br>See the chapter on [input handling](input-handling.html) for
 * <br>an overview of the basic concepts, such as the capture and bubble
 * <br>phases of even propagation.
 * <p><a href="https://docs.gtk.org/gtk4/class.EventController.html">https://docs.gtk.org/gtk4/class.EventController.html</a></p>
*/
public class EventController extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EventController.class.getCanonicalName());
    }

    public EventController(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the event that is currently being handled by the controller.
     * <br>
     * <br>At other times, %NULL is returned.
     * @return the event that is currently   handled by &#64;controller
    */
    public ch.bailu.gtk.gdk.Event getCurrentEvent()  {
        return new ch.bailu.gtk.gdk.Event(new PointerContainer(JnaEventController.INST().gtk_event_controller_get_current_event(asCPointer())));
    }

    /**
     * Returns the device of the event that is currently being
     * <br>handled by the controller.
     * <br>
     * <br>At other times, %NULL is returned.
     * @return device of the event is   currently handled by &#64;controller
    */
    public ch.bailu.gtk.gdk.Device getCurrentEventDevice()  {
        return new ch.bailu.gtk.gdk.Device(new PointerContainer(JnaEventController.INST().gtk_event_controller_get_current_event_device(asCPointer())));
    }

    /**
     * Returns the modifier state of the event that is currently being
     * <br>handled by the controller.
     * <br>
     * <br>At other times, 0 is returned.
     * @return modifier state of the event is currently handled by &#64;controller
    */
    public int getCurrentEventState()  {
        return JnaEventController.INST().gtk_event_controller_get_current_event_state(asCPointer());
    }

    /**
     * Returns the timestamp of the event that is currently being
     * <br>handled by the controller.
     * <br>
     * <br>At other times, 0 is returned.
     * @return timestamp of the event is currently handled by &#64;controller
    */
    public int getCurrentEventTime()  {
        return JnaEventController.INST().gtk_event_controller_get_current_event_time(asCPointer());
    }

    /**
     * Gets the name of &#64;controller.
     * @return The controller name
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEventController.INST().gtk_event_controller_get_name(asCPointer())));
    }

    /**
     * Gets the propagation limit of the event controller.
     * @return the propagation limit
    */
    public int getPropagationLimit()  {
        return JnaEventController.INST().gtk_event_controller_get_propagation_limit(asCPointer());
    }

    /**
     * Gets the propagation phase at which &#64;controller handles events.
     * @return the propagation phase
    */
    public int getPropagationPhase()  {
        return JnaEventController.INST().gtk_event_controller_get_propagation_phase(asCPointer());
    }

    /**
     * Returns the `GtkWidget` this controller relates to.
     * @return a `GtkWidget`
    */
    public Widget getWidget()  {
        return new Widget(new PointerContainer(JnaEventController.INST().gtk_event_controller_get_widget(asCPointer())));
    }

    /**
     * Resets the &#64;controller to a clean state.
    */
    public void reset()  {
        JnaEventController.INST().gtk_event_controller_reset(asCPointer());
    }

    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for &#64;controller
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaEventController.INST().gtk_event_controller_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for &#64;controller
    */
    public void setName(String name)  {
        JnaEventController.INST().gtk_event_controller_set_name(asCPointer(), name);
    }

    /**
     * Sets the event propagation limit on the event controller.
     * <br>
     * <br>If the limit is set to %GTK_LIMIT_SAME_NATIVE, the controller
     * <br>won't handle events that are targeted at widgets on a different
     * <br>surface, such as popovers.
     * @param limit the propagation limit
    */
    public void setPropagationLimit(int limit)  {
        JnaEventController.INST().gtk_event_controller_set_propagation_limit(asCPointer(), limit);
    }

    /**
     * Sets the propagation phase at which a controller handles events.
     * <br>
     * <br>If &#64;phase is %GTK_PHASE_NONE, no automatic event handling will be
     * <br>performed, but other additional gesture maintenance will.
     * @param phase a propagation phase
    */
    public void setPropagationPhase(int phase)  {
        JnaEventController.INST().gtk_event_controller_set_propagation_phase(asCPointer(), phase);
    }

    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for &#64;controller, must be a static string
    */
    public void setStaticName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaEventController.INST().gtk_event_controller_set_static_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for &#64;controller, must be a static string
    */
    public void setStaticName(String name)  {
        JnaEventController.INST().gtk_event_controller_set_static_name(asCPointer(), name);
    }

    public static long getTypeID() { 
        return JnaEventController.INST().gtk_event_controller_get_type(); 
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
