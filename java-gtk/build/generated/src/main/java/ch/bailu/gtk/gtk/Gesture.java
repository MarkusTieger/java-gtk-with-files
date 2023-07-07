/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGesture` is the base class for gesture recognition.
 * <br>
 * <br>Although `GtkGesture` is quite generalized to serve as a base for
 * <br>multi-touch gestures, it is suitable to implement single-touch and
 * <br>pointer-based gestures (using the special %NULL `GdkEventSequence`
 * <br>value for these).
 * <br>
 * <br>The number of touches that a `GtkGesture` need to be recognized is
 * <br>controlled by the [property&#64;Gtk.Gesture:n-points] property, if a
 * <br>gesture is keeping track of less or more than that number of sequences,
 * <br>it won't check whether the gesture is recognized.
 * <br>
 * <br>As soon as the gesture has the expected number of touches, it will check
 * <br>regularly if it is recognized, the criteria to consider a gesture as
 * <br>&quot;recognized&quot; is left to `GtkGesture` subclasses.
 * <br>
 * <br>A recognized gesture will then emit the following signals:
 * <br>
 * <br>- [signal&#64;Gtk.Gesture::begin] when the gesture is recognized.
 * <br>- [signal&#64;Gtk.Gesture::update], whenever an input event is processed.
 * <br>- [signal&#64;Gtk.Gesture::end] when the gesture is no longer recognized.
 * <br>
 * <br>&#35;&#35; Event propagation
 * <br>
 * <br>In order to receive events, a gesture needs to set a propagation phase
 * <br>through [method&#64;Gtk.EventController.set_propagation_phase].
 * <br>
 * <br>In the capture phase, events are propagated from the toplevel down
 * <br>to the target widget, and gestures that are attached to containers
 * <br>above the widget get a chance to interact with the event before it
 * <br>reaches the target.
 * <br>
 * <br>In the bubble phase, events are propagated up from the target widget
 * <br>to the toplevel, and gestures that are attached to containers above
 * <br>the widget get a chance to interact with events that have not been
 * <br>handled yet.
 * <br>
 * <br>&#35;&#35; States of a sequence
 * <br>
 * <br>Whenever input interaction happens, a single event may trigger a cascade
 * <br>of `GtkGesture`s, both across the parents of the widget receiving the
 * <br>event and in parallel within an individual widget. It is a responsibility
 * <br>of the widgets using those gestures to set the state of touch sequences
 * <br>accordingly in order to enable cooperation of gestures around the
 * <br>`GdkEventSequence`s triggering those.
 * <br>
 * <br>Within a widget, gestures can be grouped through [method&#64;Gtk.Gesture.group].
 * <br>Grouped gestures synchronize the state of sequences, so calling
 * <br>[method&#64;Gtk.Gesture.set_sequence_state] on one will effectively propagate
 * <br>the state throughout the group.
 * <br>
 * <br>By default, all sequences start out in the %GTK_EVENT_SEQUENCE_NONE state,
 * <br>sequences in this state trigger the gesture event handler, but event
 * <br>propagation will continue unstopped by gestures.
 * <br>
 * <br>If a sequence enters into the %GTK_EVENT_SEQUENCE_DENIED state, the gesture
 * <br>group will effectively ignore the sequence, letting events go unstopped
 * <br>through the gesture, but the &quot;slot&quot; will still remain occupied while
 * <br>the touch is active.
 * <br>
 * <br>If a sequence enters in the %GTK_EVENT_SEQUENCE_CLAIMED state, the gesture
 * <br>group will grab all interaction on the sequence, by:
 * <br>
 * <br>- Setting the same sequence to %GTK_EVENT_SEQUENCE_DENIED on every other
 * <br>  gesture group within the widget, and every gesture on parent widgets
 * <br>  in the propagation chain.
 * <br>- Emitting [signal&#64;Gtk.Gesture::cancel] on every gesture in widgets
 * <br>  underneath in the propagation chain.
 * <br>- Stopping event propagation after the gesture group handles the event.
 * <br>
 * <br>Note: if a sequence is set early to %GTK_EVENT_SEQUENCE_CLAIMED on
 * <br>%GDK_TOUCH_BEGIN/%GDK_BUTTON_PRESS (so those events are captured before
 * <br>reaching the event widget, this implies %GTK_PHASE_CAPTURE), one similar
 * <br>event will be emulated if the sequence changes to %GTK_EVENT_SEQUENCE_DENIED.
 * <br>This way event coherence is preserved before event propagation is unstopped
 * <br>again.
 * <br>
 * <br>Sequence states can't be changed freely.
 * <br>See [method&#64;Gtk.Gesture.set_sequence_state] to know about the possible
 * <br>lifetimes of a `GdkEventSequence`.
 * <br>
 * <br>&#35;&#35; Touchpad gestures
 * <br>
 * <br>On the platforms that support it, `GtkGesture` will handle transparently
 * <br>touchpad gesture events. The only precautions users of `GtkGesture` should
 * <br>do to enable this support are:
 * <br>
 * <br>- If the gesture has %GTK_PHASE_NONE, ensuring events of type
 * <br>  %GDK_TOUCHPAD_SWIPE and %GDK_TOUCHPAD_PINCH are handled by the `GtkGesture`
 * <p><a href="https://docs.gtk.org/gtk4/class.Gesture.html">https://docs.gtk.org/gtk4/class.Gesture.html</a></p>
*/
public class Gesture extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gesture.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBegin {
        /**
         * Emitted when the gesture is recognized.
         * <br>
         * <br>This means the number of touch sequences matches
         * <br>[property&#64;Gtk.Gesture:n-points].
         * <br>
         * <br>Note: These conditions may also happen when an extra touch
         * <br>(eg. a third touch on a 2-touches gesture) is lifted, in that
         * <br>situation &#64;sequence won't pertain to the current set of active
         * <br>touches, so don't rely on this being true.
         * @param sequence the `GdkEventSequence` that made the gesture   to be recognized
        */
        void onBegin(@Nullable ch.bailu.gtk.gdk.EventSequence sequence);
    }
    
    private static com.sun.jna.Callback toOnBegin(OnBegin in) {
        return (in == null) ? null: (JnaGesture.OnBegin) (__self, _sequence, __data) -> in.onBegin(new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)));
    }

    @FunctionalInterface
    public interface OnCancel {
        /**
         * Emitted whenever a sequence is cancelled.
         * <br>
         * <br>This usually happens on active touches when
         * <br>[method&#64;Gtk.EventController.reset] is called on &#64;gesture
         * <br>(manually, due to grabs...), or the individual &#64;sequence
         * <br>was claimed by parent widgets' controllers (see
         * <br>[method&#64;Gtk.Gesture.set_sequence_state]).
         * <br>
         * <br>&#64;gesture must forget everything about &#64;sequence as in
         * <br>response to this signal.
         * @param sequence the `GdkEventSequence` that was cancelled
        */
        void onCancel(@Nullable ch.bailu.gtk.gdk.EventSequence sequence);
    }
    
    private static com.sun.jna.Callback toOnCancel(OnCancel in) {
        return (in == null) ? null: (JnaGesture.OnCancel) (__self, _sequence, __data) -> in.onCancel(new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)));
    }

    @FunctionalInterface
    public interface OnEnd {
        /**
         * Emitted when &#64;gesture either stopped recognizing the event
         * <br>sequences as something to be handled, or the number of touch
         * <br>sequences became higher or lower than [property&#64;Gtk.Gesture:n-points].
         * <br>
         * <br>Note: &#64;sequence might not pertain to the group of sequences that
         * <br>were previously triggering recognition on &#64;gesture (ie. a just
         * <br>pressed touch sequence that exceeds [property&#64;Gtk.Gesture:n-points]).
         * <br>This situation may be detected by checking through
         * <br>[method&#64;Gtk.Gesture.handles_sequence].
         * @param sequence the `GdkEventSequence` that made gesture   recognition to finish
        */
        void onEnd(@Nullable ch.bailu.gtk.gdk.EventSequence sequence);
    }
    
    private static com.sun.jna.Callback toOnEnd(OnEnd in) {
        return (in == null) ? null: (JnaGesture.OnEnd) (__self, _sequence, __data) -> in.onEnd(new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)));
    }

    @FunctionalInterface
    public interface OnSequenceStateChanged {
        /**
         * Emitted whenever a sequence state changes.
         * <br>
         * <br>See [method&#64;Gtk.Gesture.set_sequence_state] to know
         * <br>more about the expectable sequence lifetimes.
         * @param sequence the `GdkEventSequence` that was cancelled
         * @param state the new sequence state
        */
        void onSequenceStateChanged(@Nullable ch.bailu.gtk.gdk.EventSequence sequence, int state);
    }
    
    private static com.sun.jna.Callback toOnSequenceStateChanged(OnSequenceStateChanged in) {
        return (in == null) ? null: (JnaGesture.OnSequenceStateChanged) (__self, _sequence, _state, __data) -> in.onSequenceStateChanged(new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)), _state);
    }

    @FunctionalInterface
    public interface OnUpdate {
        /**
         * Emitted whenever an event is handled while the gesture is recognized.
         * <br>
         * <br>&#64;sequence is guaranteed to pertain to the set of active touches.
         * @param sequence the `GdkEventSequence` that was updated
        */
        void onUpdate(@Nullable ch.bailu.gtk.gdk.EventSequence sequence);
    }
    
    private static com.sun.jna.Callback toOnUpdate(OnUpdate in) {
        return (in == null) ? null: (JnaGesture.OnUpdate) (__self, _sequence, __data) -> in.onUpdate(new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)));
    }

    public Gesture(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * If there are touch sequences being currently handled by &#64;gesture,
     * <br>returns %TRUE and fills in &#64;rect with the bounding box containing
     * <br>all active touches.
     * <br>
     * <br>Otherwise, %FALSE will be returned.
     * <br>
     * <br>Note: This function will yield unexpected results on touchpad
     * <br>gestures. Since there is no correlation between physical and
     * <br>pixel distances, these will look as if constrained in an
     * <br>infinitely small area, &#64;rect width and height will thus be 0
     * <br>regardless of the number of touchpoints.
     * @param rect bounding box containing all active touches.
     * @return %TRUE if there are active touches, %FALSE otherwise
    */
    public boolean getBoundingBox(@Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        return JnaGesture.INST().gtk_gesture_get_bounding_box(asCPointer(), asCPointerNotNull(rect));
    }

    /**
     * Returns the logical `GdkDevice` that is currently operating
     * <br>on &#64;gesture.
     * <br>
     * <br>This returns %NULL if the gesture is not being interacted.
     * @return a `GdkDevice`
    */
    public ch.bailu.gtk.gdk.Device getDevice()  {
        return new ch.bailu.gtk.gdk.Device(new PointerContainer(JnaGesture.INST().gtk_gesture_get_device(asCPointer())));
    }

    /**
     * Returns all gestures in the group of &#64;gesture
     * @return The list   of `GtkGesture`s, free with g_list_free()
    */
    public ch.bailu.gtk.glib.List getGroup()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGesture.INST().gtk_gesture_get_group(asCPointer())));
    }

    /**
     * Returns the last event that was processed for &#64;sequence.
     * <br>
     * <br>Note that the returned pointer is only valid as long as the
     * <br>&#64;sequence is still interpreted by the &#64;gesture. If in doubt,
     * <br>you should make a copy of the event.
     * @param sequence a `GdkEventSequence`
     * @return The last event from &#64;sequence
    */
    public ch.bailu.gtk.gdk.Event getLastEvent(@Nullable ch.bailu.gtk.gdk.EventSequence sequence)  {
        return new ch.bailu.gtk.gdk.Event(new PointerContainer(JnaGesture.INST().gtk_gesture_get_last_event(asCPointer(), asCPointer(sequence))));
    }

    /**
     * Returns the `GdkEventSequence` that was last updated on &#64;gesture.
     * @return The last updated sequence
    */
    public ch.bailu.gtk.gdk.EventSequence getLastUpdatedSequence()  {
        return new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(JnaGesture.INST().gtk_gesture_get_last_updated_sequence(asCPointer())));
    }

    /**
     * Returns the &#64;sequence state, as seen by &#64;gesture.
     * @param sequence a `GdkEventSequence`
     * @return The sequence state in &#64;gesture
    */
    public int getSequenceState(@Nonnull ch.bailu.gtk.gdk.EventSequence sequence)  {
        return JnaGesture.INST().gtk_gesture_get_sequence_state(asCPointer(), asCPointerNotNull(sequence));
    }

    /**
     * Returns the list of `GdkEventSequences` currently being interpreted
     * <br>by &#64;gesture.
     * @return A list   of `GdkEventSequence`, the list elements are owned by GTK and must   not be freed or modified, the list itself must be deleted   through g_list_free()
    */
    public ch.bailu.gtk.glib.List getSequences()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGesture.INST().gtk_gesture_get_sequences(asCPointer())));
    }

    /**
     * Adds &#64;gesture to the same group than &#64;group_gesture.
     * <br>
     * <br>Gestures are by default isolated in their own groups.
     * <br>
     * <br>Both gestures must have been added to the same widget before
     * <br>they can be grouped.
     * <br>
     * <br>When gestures are grouped, the state of `GdkEventSequences`
     * <br>is kept in sync for all of those, so calling
     * <br>[method&#64;Gtk.Gesture.set_sequence_state], on one will transfer
     * <br>the same value to the others.
     * <br>
     * <br>Groups also perform an &quot;implicit grabbing&quot; of sequences, if a
     * <br>`GdkEventSequence` state is set to %GTK_EVENT_SEQUENCE_CLAIMED
     * <br>on one group, every other gesture group attached to the same
     * <br>`GtkWidget` will switch the state for that sequence to
     * <br>%GTK_EVENT_SEQUENCE_DENIED.
     * @param gesture a `GtkGesture`
    */
    public void group(@Nonnull Gesture gesture)  {
        JnaGesture.INST().gtk_gesture_group(asCPointer(), asCPointerNotNull(gesture));
    }

    /**
     * Returns %TRUE if &#64;gesture is currently handling events
     * <br>corresponding to &#64;sequence.
     * @param sequence a `GdkEventSequence`
     * @return %TRUE if &#64;gesture is handling &#64;sequence, %FALSE otherwise
    */
    public boolean handlesSequence(@Nullable ch.bailu.gtk.gdk.EventSequence sequence)  {
        return JnaGesture.INST().gtk_gesture_handles_sequence(asCPointer(), asCPointer(sequence));
    }

    /**
     * Returns %TRUE if the gesture is currently active.
     * <br>
     * <br>A gesture is active while there are touch sequences
     * <br>interacting with it.
     * @return %TRUE if gesture is active
    */
    public boolean isActive()  {
        return JnaGesture.INST().gtk_gesture_is_active(asCPointer());
    }

    /**
     * Returns %TRUE if both gestures pertain to the same group.
     * @param other another `GtkGesture`
     * @return whether the gestures are grouped
    */
    public boolean isGroupedWith(@Nonnull Gesture other)  {
        return JnaGesture.INST().gtk_gesture_is_grouped_with(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Returns %TRUE if the gesture is currently recognized.
     * <br>
     * <br>A gesture is recognized if there are as many interacting
     * <br>touch sequences as required by &#64;gesture.
     * @return %TRUE if gesture is recognized
    */
    public boolean isRecognized()  {
        return JnaGesture.INST().gtk_gesture_is_recognized(asCPointer());
    }

    /**
     * Sets the state of &#64;sequence in &#64;gesture.
     * <br>
     * <br>Sequences start in state %GTK_EVENT_SEQUENCE_NONE, and whenever
     * <br>they change state, they can never go back to that state. Likewise,
     * <br>sequences in state %GTK_EVENT_SEQUENCE_DENIED cannot turn back to
     * <br>a not denied state. With these rules, the lifetime of an event
     * <br>sequence is constrained to the next four:
     * <br>
     * <br>* None
     * <br>* None → Denied
     * <br>* None → Claimed
     * <br>* None → Claimed → Denied
     * <br>
     * <br>Note: Due to event handling ordering, it may be unsafe to set the
     * <br>state on another gesture within a [signal&#64;Gtk.Gesture::begin] signal
     * <br>handler, as the callback might be executed before the other gesture
     * <br>knows about the sequence. A safe way to perform this could be:
     * <br>
     * <br>```c
     * <br>static void
     * <br>first_gesture_begin_cb (GtkGesture       *first_gesture,
     * <br>                        GdkEventSequence *sequence,
     * <br>                        gpointer          user_data)
     * <br>{
     * <br>  gtk_gesture_set_sequence_state (first_gesture, sequence, GTK_EVENT_SEQUENCE_CLAIMED);
     * <br>  gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * <br>}
     * <br>
     * <br>static void
     * <br>second_gesture_begin_cb (GtkGesture       *second_gesture,
     * <br>                         GdkEventSequence *sequence,
     * <br>                         gpointer          user_data)
     * <br>{
     * <br>  if (gtk_gesture_get_sequence_state (first_gesture, sequence) == GTK_EVENT_SEQUENCE_CLAIMED)
     * <br>    gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * <br>}
     * <br>```
     * <br>
     * <br>If both gestures are in the same group, just set the state on
     * <br>the gesture emitting the event, the sequence will be already
     * <br>be initialized to the group's global state when the second
     * <br>gesture processes the event.
     * @param sequence a `GdkEventSequence`
     * @param state the sequence state
     * @return %TRUE if &#64;sequence is handled by &#64;gesture,   and the state is changed successfully
    */
    public boolean setSequenceState(@Nonnull ch.bailu.gtk.gdk.EventSequence sequence, int state)  {
        return JnaGesture.INST().gtk_gesture_set_sequence_state(asCPointer(), asCPointerNotNull(sequence), state);
    }

    /**
     * Sets the state of all sequences that &#64;gesture is currently
     * <br>interacting with.
     * <br>
     * <br>See [method&#64;Gtk.Gesture.set_sequence_state] for more details
     * <br>on sequence states.
     * @param state the sequence state
     * @return %TRUE if the state of at least one sequence   was changed successfully
    */
    public boolean setState(int state)  {
        return JnaGesture.INST().gtk_gesture_set_state(asCPointer(), state);
    }

    /**
     * Separates &#64;gesture into an isolated group.
    */
    public void ungroup()  {
        JnaGesture.INST().gtk_gesture_ungroup(asCPointer());
    }

    public final static String SIGNAL_ON_BEGIN = "begin";
    
    /**
     * Connect to signal "begin".
     * <br>See {@link OnBegin#onBegin} for signal description.
     * <br>Field {@link #SIGNAL_ON_BEGIN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBegin(OnBegin signal) {
        return connectSignal(SIGNAL_ON_BEGIN, toOnBegin(signal));
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

    public final static String SIGNAL_ON_END = "end";
    
    /**
     * Connect to signal "end".
     * <br>See {@link OnEnd#onEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnd(OnEnd signal) {
        return connectSignal(SIGNAL_ON_END, toOnEnd(signal));
    }

    public final static String SIGNAL_ON_SEQUENCE_STATE_CHANGED = "sequence-state-changed";
    
    /**
     * Connect to signal "sequence-state-changed".
     * <br>See {@link OnSequenceStateChanged#onSequenceStateChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEQUENCE_STATE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSequenceStateChanged(OnSequenceStateChanged signal) {
        return connectSignal(SIGNAL_ON_SEQUENCE_STATE_CHANGED, toOnSequenceStateChanged(signal));
    }

    public final static String SIGNAL_ON_UPDATE = "update";
    
    /**
     * Connect to signal "update".
     * <br>See {@link OnUpdate#onUpdate} for signal description.
     * <br>Field {@link #SIGNAL_ON_UPDATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUpdate(OnUpdate signal) {
        return connectSignal(SIGNAL_ON_UPDATE, toOnUpdate(signal));
    }

    public static long getTypeID() { 
        return JnaGesture.INST().gtk_gesture_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getBoundingBoxCenter:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getPoint:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:EventSequence:{c:GdkEventSequence*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
