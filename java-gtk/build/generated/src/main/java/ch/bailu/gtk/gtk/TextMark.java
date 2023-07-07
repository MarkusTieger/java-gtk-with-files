/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkTextMark` is a position in a `GtkTextbuffer` that is preserved
 * <br>across modifications.
 * <br>
 * <br>You may wish to begin by reading the
 * <br>[text widget conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types
 * <br>related to the text widget and how they work together.
 * <br>
 * <br>A `GtkTextMark` is like a bookmark in a text buffer; it preserves
 * <br>a position in the text. You can convert the mark to an iterator using
 * <br>[method&#64;Gtk.TextBuffer.get_iter_at_mark]. Unlike iterators, marks remain
 * <br>valid across buffer mutations, because their behavior is defined when
 * <br>text is inserted or deleted. When text containing a mark is deleted,
 * <br>the mark remains in the position originally occupied by the deleted
 * <br>text. When text is inserted at a mark, a mark with “left gravity” will
 * <br>be moved to the beginning of the newly-inserted text, and a mark with
 * <br>“right gravity” will be moved to the end.
 * <br>
 * <br>Note that “left” and “right” here refer to logical direction (left
 * <br>is the toward the start of the buffer); in some languages such as
 * <br>Hebrew the logically-leftmost text is not actually on the left when
 * <br>displayed.
 * <br>
 * <br>Marks are reference counted, but the reference count only controls
 * <br>the validity of the memory; marks can be deleted from the buffer at
 * <br>any time with [method&#64;Gtk.TextBuffer.delete_mark]. Once deleted from
 * <br>the buffer, a mark is essentially useless.
 * <br>
 * <br>Marks optionally have names; these can be convenient to avoid passing
 * <br>the `GtkTextMark` object around.
 * <br>
 * <br>Marks are typically created using the [method&#64;Gtk.TextBuffer.create_mark]
 * <br>function.
 * <p><a href="https://docs.gtk.org/gtk4/class.TextMark.html">https://docs.gtk.org/gtk4/class.TextMark.html</a></p>
*/
public class TextMark extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextMark.class.getCanonicalName());
    }

    public TextMark(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a text mark.
     * <br>
     * <br>Add it to a buffer using [method&#64;Gtk.TextBuffer.add_mark].
     * <br>If &#64;name is %NULL, the mark is anonymous; otherwise, the mark can be
     * <br>retrieved by name using [method&#64;Gtk.TextBuffer.get_mark]. If a mark
     * <br>has left gravity, and text is inserted at the mark’s current location,
     * <br>the mark will be moved to the left of the newly-inserted text. If the
     * <br>mark has right gravity (&#64;left_gravity = %FALSE), the mark will end up
     * <br>on the right of newly-inserted text. The standard left-to-right cursor
     * <br>is a mark with right gravity (when you type, the cursor stays on the
     * <br>right side of the text you’re typing).
     * @param name mark name
     * @param left_gravity whether the mark should have left gravity
    */
    public TextMark(@Nullable ch.bailu.gtk.type.Str name, boolean left_gravity) {
        super(cast(JnaTextMark.INST().gtk_text_mark_new(asCPointer(name), left_gravity)));
    }

    /**
     * Creates a text mark.
     * <br>
     * <br>Add it to a buffer using [method&#64;Gtk.TextBuffer.add_mark].
     * <br>If &#64;name is %NULL, the mark is anonymous; otherwise, the mark can be
     * <br>retrieved by name using [method&#64;Gtk.TextBuffer.get_mark]. If a mark
     * <br>has left gravity, and text is inserted at the mark’s current location,
     * <br>the mark will be moved to the left of the newly-inserted text. If the
     * <br>mark has right gravity (&#64;left_gravity = %FALSE), the mark will end up
     * <br>on the right of newly-inserted text. The standard left-to-right cursor
     * <br>is a mark with right gravity (when you type, the cursor stays on the
     * <br>right side of the text you’re typing).
     * @param name mark name
     * @param left_gravity whether the mark should have left gravity
    */
    public TextMark(String name, boolean left_gravity) {
        super(cast(JnaTextMark.INST().gtk_text_mark_new(name, left_gravity)));
    }

    /**
     * Gets the buffer this mark is located inside.
     * <br>
     * <br>Returns %NULL if the mark is deleted.
     * @return the mark’s `GtkTextBuffer`
    */
    public TextBuffer getBuffer()  {
        return new TextBuffer(new PointerContainer(JnaTextMark.INST().gtk_text_mark_get_buffer(asCPointer())));
    }

    /**
     * Returns %TRUE if the mark has been removed from its buffer.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.add_mark] for a way to add it
     * <br>to a buffer again.
     * @return whether the mark is deleted
    */
    public boolean getDeleted()  {
        return JnaTextMark.INST().gtk_text_mark_get_deleted(asCPointer());
    }

    /**
     * Determines whether the mark has left gravity.
     * @return %TRUE if the mark has left gravity, %FALSE otherwise
    */
    public boolean getLeftGravity()  {
        return JnaTextMark.INST().gtk_text_mark_get_left_gravity(asCPointer());
    }

    /**
     * Returns the mark name.
     * <br>
     * <br>Returns %NULL for anonymous marks.
     * @return mark name
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextMark.INST().gtk_text_mark_get_name(asCPointer())));
    }

    /**
     * Returns %TRUE if the mark is visible.
     * <br>
     * <br>A cursor is displayed for visible marks.
     * @return %TRUE if visible
    */
    public boolean getVisible()  {
        return JnaTextMark.INST().gtk_text_mark_get_visible(asCPointer());
    }

    /**
     * 
     * @param setting 
    */
    public void setVisible(boolean setting)  {
        JnaTextMark.INST().gtk_text_mark_set_visible(asCPointer(), setting);
    }

    public static long getTypeID() { 
        return JnaTextMark.INST().gtk_text_mark_get_type(); 
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
