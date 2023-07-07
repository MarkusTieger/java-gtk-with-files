/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkEditableLabel` is a label that allows users to
 * <br>edit the text by switching to an “edit mode”.
 * <br>
 * <br>![An example GtkEditableLabel](editable-label.png)
 * <br>
 * <br>`GtkEditableLabel` does not have API of its own, but it
 * <br>implements the [iface&#64;Gtk.Editable] interface.
 * <br>
 * <br>The default bindings for activating the edit mode is
 * <br>to click or press the Enter key. The default bindings
 * <br>for leaving the edit mode are the Enter key (to save
 * <br>the results) or the Escape key (to cancel the editing).
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>editablelabel[.editing]
 * <br>╰── stack
 * <br>    ├── label
 * <br>    ╰── text
 * <br>```
 * <br>
 * <br>`GtkEditableLabel` has a main node with the name editablelabel.
 * <br>When the entry is in editing mode, it gets the .editing style
 * <br>class.
 * <br>
 * <br>For all the subnodes added to the text node in various situations,
 * <br>see [class&#64;Gtk.Text].
 * <p><a href="https://docs.gtk.org/gtk4/class.EditableLabel.html">https://docs.gtk.org/gtk4/class.EditableLabel.html</a></p>
*/
public class EditableLabel extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EditableLabel.class.getCanonicalName());
    }

    public EditableLabel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkEditableLabel` widget.
     * @param str the text for the label
    */
    public EditableLabel(@Nonnull ch.bailu.gtk.type.Str str) {
        super(cast(JnaEditableLabel.INST().gtk_editable_label_new(asCPointerNotNull(str))));
    }

    /**
     * Creates a new `GtkEditableLabel` widget.
     * @param str the text for the label
    */
    public EditableLabel(String str) {
        super(cast(JnaEditableLabel.INST().gtk_editable_label_new(str)));
    }

    /**
     * Returns whether the label is currently in “editing mode”.
     * @return %TRUE if &#64;self is currently in editing mode
    */
    public boolean getEditing()  {
        return JnaEditableLabel.INST().gtk_editable_label_get_editing(asCPointer());
    }

    /**
     * Switches the label into “editing mode”.
    */
    public void startEditing()  {
        JnaEditableLabel.INST().gtk_editable_label_start_editing(asCPointer());
    }

    /**
     * Switches the label out of “editing mode”.
     * <br>
     * <br>If &#64;commit is %TRUE, the resulting text is kept as the
     * <br>[property&#64;Gtk.Editable:text] property value, otherwise the
     * <br>resulting text is discarded and the label will keep its
     * <br>previous [property&#64;Gtk.Editable:text] property value.
     * @param commit whether to set the edited text on the label
    */
    public void stopEditing(boolean commit)  {
        JnaEditableLabel.INST().gtk_editable_label_stop_editing(asCPointer(), commit);
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

    /**
     * Implements interface {@link Editable}. Call this to get access to interface functions.
     * @return {@link Editable}
    */
    public Editable asEditable() {
        return new Editable(cast());
    }

    public static long getTypeID() { 
        return JnaEditableLabel.INST().gtk_editable_label_get_type(); 
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
