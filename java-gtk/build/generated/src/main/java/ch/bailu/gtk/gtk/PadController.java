/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPadController` is an event controller for the pads found in drawing
 * <br>tablets.
 * <br>
 * <br>Pads are the collection of buttons and tactile sensors often found around
 * <br>the stylus-sensitive area.
 * <br>
 * <br>These buttons and sensors have no implicit meaning, and by default they
 * <br>perform no action. `GtkPadController` is provided to map those to
 * <br>[iface&#64;Gio.Action] objects, thus letting the application give them a more
 * <br>semantic meaning.
 * <br>
 * <br>Buttons and sensors are not constrained to triggering a single action,
 * <br>some %GDK_SOURCE_TABLET_PAD devices feature multiple &quot;modes&quot;. All these
 * <br>input elements have one current mode, which may determine the final action
 * <br>being triggered.
 * <br>
 * <br>Pad devices often divide buttons and sensors into groups. All elements
 * <br>in a group share the same current mode, but different groups may have
 * <br>different modes. See [method&#64;Gdk.DevicePad.get_n_groups] and
 * <br>[method&#64;Gdk.DevicePad.get_group_n_modes].
 * <br>
 * <br>Each of the actions that a given button/strip/ring performs for a given mode
 * <br>is defined by a [struct&#64;Gtk.PadActionEntry]. It contains an action name that
 * <br>will be looked up in the given [iface&#64;Gio.ActionGroup] and activated whenever
 * <br>the specified input element and mode are triggered.
 * <br>
 * <br>A simple example of `GtkPadController` usage: Assigning button 1 in all
 * <br>modes and pad devices to an &quot;invert-selection&quot; action:
 * <br>
 * <br>```c
 * <br>GtkPadActionEntry *pad_actions[] = {
 * <br>  { GTK_PAD_ACTION_BUTTON, 1, -1, &quot;Invert selection&quot;, &quot;pad-actions.invert-selection&quot; },
 * <br>  …
 * <br>};
 * <br>
 * <br>…
 * <br>action_group = g_simple_action_group_new ();
 * <br>action = g_simple_action_new (&quot;pad-actions.invert-selection&quot;, NULL);
 * <br>g_signal_connect (action, &quot;activate&quot;, on_invert_selection_activated, NULL);
 * <br>g_action_map_add_action (G_ACTION_MAP (action_group), action);
 * <br>…
 * <br>pad_controller = gtk_pad_controller_new (action_group, NULL);
 * <br>```
 * <br>
 * <br>The actions belonging to rings/strips will be activated with a parameter
 * <br>of type %G_VARIANT_TYPE_DOUBLE bearing the value of the given axis, it
 * <br>is required that those are made stateful and accepting this `GVariantType`.
 * <p><a href="https://docs.gtk.org/gtk4/class.PadController.html">https://docs.gtk.org/gtk4/class.PadController.html</a></p>
*/
public class PadController extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PadController.class.getCanonicalName());
    }

    public PadController(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPadController` that will associate events from &#64;pad to
     * <br>actions.
     * <br>
     * <br>A %NULL pad may be provided so the controller manages all pad devices
     * <br>generically, it is discouraged to mix `GtkPadController` objects with
     * <br>%NULL and non-%NULL &#64;pad argument on the same toplevel window, as execution
     * <br>order is not guaranteed.
     * <br>
     * <br>The `GtkPadController` is created with no mapped actions. In order to
     * <br>map pad events to actions, use [method&#64;Gtk.PadController.set_action_entries]
     * <br>or [method&#64;Gtk.PadController.set_action].
     * <br>
     * <br>Be aware that pad events will only be delivered to `GtkWindow`s, so adding
     * <br>a pad controller to any other type of widget will not have an effect.
     * @param group `GActionGroup` to trigger actions from
     * @param pad A %GDK_SOURCE_TABLET_PAD device, or %NULL to handle all pads
    */
    public PadController(@Nonnull ch.bailu.gtk.gio.ActionGroup group, @Nullable ch.bailu.gtk.gdk.Device pad) {
        super(cast(JnaPadController.INST().gtk_pad_controller_new(asCPointerNotNull(group), asCPointer(pad))));
    }

    /**
     * Adds an individual action to &#64;controller.
     * <br>
     * <br>This action will only be activated if the given button/ring/strip number
     * <br>in &#64;index is interacted while the current mode is &#64;mode. -1 may be used
     * <br>for simple cases, so the action is triggered on all modes.
     * <br>
     * <br>The given &#64;label should be considered user-visible, so internationalization
     * <br>rules apply. Some windowing systems may be able to use those for user
     * <br>feedback.
     * @param type the type of pad feature that will trigger this action
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     * @param mode the mode that will trigger this action, or -1 for all modes.
     * @param label Human readable description of this action, this string should   be deemed user-visible.
     * @param action_name action name that will be activated in the `GActionGroup`
    */
    public void setAction(int type, int index, int mode, @Nonnull ch.bailu.gtk.type.Str label, @Nonnull ch.bailu.gtk.type.Str action_name)  {
        JnaPadController.INST().gtk_pad_controller_set_action(asCPointer(), type, index, mode, asCPointerNotNull(label), asCPointerNotNull(action_name));
    }

    /**
     * Adds an individual action to &#64;controller.
     * <br>
     * <br>This action will only be activated if the given button/ring/strip number
     * <br>in &#64;index is interacted while the current mode is &#64;mode. -1 may be used
     * <br>for simple cases, so the action is triggered on all modes.
     * <br>
     * <br>The given &#64;label should be considered user-visible, so internationalization
     * <br>rules apply. Some windowing systems may be able to use those for user
     * <br>feedback.
     * @param type the type of pad feature that will trigger this action
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     * @param mode the mode that will trigger this action, or -1 for all modes.
     * @param label Human readable description of this action, this string should   be deemed user-visible.
     * @param action_name action name that will be activated in the `GActionGroup`
    */
    public void setAction(int type, int index, int mode, String label, String action_name)  {
        JnaPadController.INST().gtk_pad_controller_set_action(asCPointer(), type, index, mode, label, action_name);
    }

    public static long getTypeID() { 
        return JnaPadController.INST().gtk_pad_controller_get_type(); 
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

[MethodModel:java-type-not-supported:setActionEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GtkPadActionEntry*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
