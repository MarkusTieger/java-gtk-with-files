/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A tag that can be applied to text contained in a `GtkTextBuffer`.
 * <br>
 * <br>You may wish to begin by reading the
 * <br>[text widget conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types
 * <br>related to the text widget and how they work together.
 * <br>
 * <br>Tags should be in the [class&#64;Gtk.TextTagTable] for a given
 * <br>`GtkTextBuffer` before using them with that buffer.
 * <br>
 * <br>[method&#64;Gtk.TextBuffer.create_tag] is the best way to create tags.
 * <br>See “gtk4-demo” for numerous examples.
 * <br>
 * <br>For each property of `GtkTextTag`, there is a “set” property, e.g.
 * <br>“font-set” corresponds to “font”. These “set” properties reflect
 * <br>whether a property has been set or not.
 * <br>
 * <br>They are maintained by GTK and you should not set them independently.
 * <p><a href="https://docs.gtk.org/gtk4/class.TextTag.html">https://docs.gtk.org/gtk4/class.TextTag.html</a></p>
*/
public class TextTag extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextTag.class.getCanonicalName());
    }

    public TextTag(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkTextTag`.
     * @param name tag name
    */
    public TextTag(@Nullable ch.bailu.gtk.type.Str name) {
        super(cast(JnaTextTag.INST().gtk_text_tag_new(asCPointer(name))));
    }

    /**
     * Creates a `GtkTextTag`.
     * @param name tag name
    */
    public TextTag(String name) {
        super(cast(JnaTextTag.INST().gtk_text_tag_new(name)));
    }

    /**
     * Emits the [signal&#64;Gtk.TextTagTable::tag-changed] signal on the
     * <br>`GtkTextTagTable` where the tag is included.
     * <br>
     * <br>The signal is already emitted when setting a `GtkTextTag` property.
     * <br>This function is useful for a `GtkTextTag` subclass.
     * @param size_changed whether the change affects the `GtkTextView` layout
    */
    public void changed(boolean size_changed)  {
        JnaTextTag.INST().gtk_text_tag_changed(asCPointer(), size_changed);
    }

    /**
     * Get the tag priority.
     * @return The tag’s priority.
    */
    public int getPriority()  {
        return JnaTextTag.INST().gtk_text_tag_get_priority(asCPointer());
    }

    /**
     * Sets the priority of a `GtkTextTag`.
     * <br>
     * <br>Valid priorities start at 0 and go to one less than
     * <br>[method&#64;Gtk.TextTagTable.get_size]. Each tag in a table
     * <br>has a unique priority; setting the priority of one tag shifts
     * <br>the priorities of all the other tags in the table to maintain
     * <br>a unique priority for each tag.
     * <br>
     * <br>Higher priority tags “win” if two tags both set the same text
     * <br>attribute. When adding a tag to a tag table, it will be assigned
     * <br>the highest priority in the table by default; so normally the
     * <br>precedence of a set of tags is the order in which they were added
     * <br>to the table, or created with [method&#64;Gtk.TextBuffer.create_tag],
     * <br>which adds the tag to the buffer’s table automatically.
     * @param priority the new priority
    */
    public void setPriority(int priority)  {
        JnaTextTag.INST().gtk_text_tag_set_priority(asCPointer(), priority);
    }

    public static long getTypeID() { 
        return JnaTextTag.INST().gtk_text_tag_get_type(); 
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
