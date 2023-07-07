/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFlowBoxChild` is the kind of widget that can be added to a `GtkFlowBox`.
 * <p><a href="https://docs.gtk.org/gtk4/class.FlowBoxChild.html">https://docs.gtk.org/gtk4/class.FlowBoxChild.html</a></p>
*/
public class FlowBoxChild extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlowBoxChild.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when the user activates a child widget in a `GtkFlowBox`.
         * <br>
         * <br>This can be happen either by clicking or double-clicking,
         * <br>or via a keybinding.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html),
         * <br>but it can be used by applications for their own purposes.
         * <br>
         * <br>The default bindings are &lt;kbd&gt;Space&lt;/kbd&gt; and &lt;kbd&gt;Enter&lt;/kbd&gt;.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaFlowBoxChild.OnActivate) (__self, __data) -> in.onActivate();
    }

    public FlowBoxChild(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFlowBoxChild`.
     * <br>
     * <br>This should only be used as a child of a `GtkFlowBox`.
    */
    public FlowBoxChild() {
        super(cast(JnaFlowBoxChild.INST().gtk_flow_box_child_new()));
    }

    /**
     * Marks &#64;child as changed, causing any state that depends on this
     * <br>to be updated.
     * <br>
     * <br>This affects sorting and filtering.
     * <br>
     * <br>Note that calls to this method must be in sync with the data
     * <br>used for the sorting and filtering functions. For instance, if
     * <br>the list is mirroring some external data set, and *two* children
     * <br>changed in the external data set when you call
     * <br>gtk_flow_box_child_changed() on the first child, the sort function
     * <br>must only read the new data for the first of the two changed
     * <br>children, otherwise the resorting of the children will be wrong.
     * <br>
     * <br>This generally means that if you don’t fully control the data
     * <br>model, you have to duplicate the data that affects the sorting
     * <br>and filtering functions into the widgets themselves.
     * <br>
     * <br>Another alternative is to call [method&#64;Gtk.FlowBox.invalidate_sort]
     * <br>on any model change, but that is more expensive.
    */
    public void changed()  {
        JnaFlowBoxChild.INST().gtk_flow_box_child_changed(asCPointer());
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaFlowBoxChild.INST().gtk_flow_box_child_get_child(asCPointer())));
    }

    /**
     * Gets the current index of the &#64;child in its `GtkFlowBox` container.
     * @return the index of the &#64;child, or -1 if the &#64;child is not   in a flow box
    */
    public int getIndex()  {
        return JnaFlowBoxChild.INST().gtk_flow_box_child_get_index(asCPointer());
    }

    /**
     * Returns whether the &#64;child is currently selected in its
     * <br>`GtkFlowBox` container.
     * @return %TRUE if &#64;child is selected
    */
    public boolean isSelected()  {
        return JnaFlowBoxChild.INST().gtk_flow_box_child_is_selected(asCPointer());
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaFlowBoxChild.INST().gtk_flow_box_child_set_child(asCPointer(), asCPointer(child));
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
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
        return JnaFlowBoxChild.INST().gtk_flow_box_child_get_type(); 
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
