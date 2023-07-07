/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFrame` is a widget that surrounds its child with a decorative
 * <br>frame and an optional label.
 * <br>
 * <br>![An example GtkFrame](frame.png)
 * <br>
 * <br>If present, the label is drawn inside the top edge of the frame.
 * <br>The horizontal position of the label can be controlled with
 * <br>[method&#64;Gtk.Frame.set_label_align].
 * <br>
 * <br>`GtkFrame` clips its child. You can use this to add rounded corners
 * <br>to widgets, but be aware that it also cuts off shadows.
 * <br>
 * <br>&#35; GtkFrame as GtkBuildable
 * <br>
 * <br>The `GtkFrame` implementation of the `GtkBuildable` interface supports
 * <br>placing a child in the label position by specifying “label” as the
 * <br>“type” attribute of a &lt;child&gt; element. A normal content child can
 * <br>be specified without specifying a &lt;child&gt; type attribute.
 * <br>
 * <br>An example of a UI definition fragment with GtkFrame:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkFrame&quot;&gt;
 * <br>  &lt;child type=&quot;label&quot;&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot; id=&quot;frame_label&quot;/&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkEntry&quot; id=&quot;frame_content&quot;/&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>frame
 * <br>├── &lt;label widget&gt;
 * <br>╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>`GtkFrame` has a main CSS node with name “frame”, which is used to draw the
 * <br>visible border. You can set the appearance of the border using CSS properties
 * <br>like “border-style” on this node.
 * <p><a href="https://docs.gtk.org/gtk4/class.Frame.html">https://docs.gtk.org/gtk4/class.Frame.html</a></p>
*/
public class Frame extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Frame.class.getCanonicalName());
    }

    public Frame(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFrame`, with optional label &#64;label.
     * <br>
     * <br>If &#64;label is %NULL, the label is omitted.
     * @param label the text to use as the label of the frame
    */
    public Frame(@Nullable ch.bailu.gtk.type.Str label) {
        super(cast(JnaFrame.INST().gtk_frame_new(asCPointer(label))));
    }

    /**
     * Creates a new `GtkFrame`, with optional label &#64;label.
     * <br>
     * <br>If &#64;label is %NULL, the label is omitted.
     * @param label the text to use as the label of the frame
    */
    public Frame(String label) {
        super(cast(JnaFrame.INST().gtk_frame_new(label)));
    }

    /**
     * Gets the child widget of &#64;frame.
     * @return the child widget of &#64;frame
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaFrame.INST().gtk_frame_get_child(asCPointer())));
    }

    /**
     * Returns the frame labels text.
     * <br>
     * <br>If the frame's label widget is not a `GtkLabel`, %NULL
     * <br>is returned.
     * @return the text in the label, or %NULL if there    was no label widget or the label widget was not a `GtkLabel`.    This string is owned by GTK and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFrame.INST().gtk_frame_get_label(asCPointer())));
    }

    /**
     * Retrieves the X alignment of the frame’s label.
     * @return the frames X alignment
    */
    public float getLabelAlign()  {
        return JnaFrame.INST().gtk_frame_get_label_align(asCPointer());
    }

    /**
     * Retrieves the label widget for the frame.
     * @return the label widget
    */
    public Widget getLabelWidget()  {
        return new Widget(new PointerContainer(JnaFrame.INST().gtk_frame_get_label_widget(asCPointer())));
    }

    /**
     * Sets the child widget of &#64;frame.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaFrame.INST().gtk_frame_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Creates a new `GtkLabel` with the &#64;label and sets it as the frame's
     * <br>label widget.
     * @param label the text to use as the label of the frame
    */
    public void setLabel(@Nullable ch.bailu.gtk.type.Str label)  {
        JnaFrame.INST().gtk_frame_set_label(asCPointer(), asCPointer(label));
    }

    /**
     * Creates a new `GtkLabel` with the &#64;label and sets it as the frame's
     * <br>label widget.
     * @param label the text to use as the label of the frame
    */
    public void setLabel(String label)  {
        JnaFrame.INST().gtk_frame_set_label(asCPointer(), label);
    }

    /**
     * Sets the X alignment of the frame widget’s label.
     * <br>
     * <br>The default value for a newly created frame is 0.0.
     * @param xalign The position of the label along the top edge   of the widget. A value of 0.0 represents left alignment;   1.0 represents right alignment.
    */
    public void setLabelAlign(float xalign)  {
        JnaFrame.INST().gtk_frame_set_label_align(asCPointer(), xalign);
    }

    /**
     * Sets the label widget for the frame.
     * <br>
     * <br>This is the widget that will appear embedded in the top edge
     * <br>of the frame as a title.
     * @param label_widget the new label widget
    */
    public void setLabelWidget(@Nullable Widget label_widget)  {
        JnaFrame.INST().gtk_frame_set_label_widget(asCPointer(), asCPointer(label_widget));
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
        return JnaFrame.INST().gtk_frame_get_type(); 
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
