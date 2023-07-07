/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkTextChildAnchor` is a spot in a `GtkTextBuffer` where child widgets can
 * <br>be “anchored”.
 * <br>
 * <br>The anchor can have multiple widgets anchored, to allow for multiple views.
 * <p><a href="https://docs.gtk.org/gtk4/class.TextChildAnchor.html">https://docs.gtk.org/gtk4/class.TextChildAnchor.html</a></p>
*/
public class TextChildAnchor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextChildAnchor.class.getCanonicalName());
    }

    public TextChildAnchor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTextChildAnchor` with the given replacement character.
     * <br>
     * <br>Usually you would then insert it into a `GtkTextBuffer` with
     * <br>[method&#64;Gtk.TextBuffer.insert_child_anchor].
     * @param character 
     * @return a new `GtkTextChildAnchor`
    */
    public static TextChildAnchor newWithReplacementTextChildAnchor(@Nonnull ch.bailu.gtk.type.Str character)  {
        PointerContainer __self = cast(JnaTextChildAnchor.INST().gtk_text_child_anchor_new_with_replacement(asCPointerNotNull(character)));
        if (__self.isNull()) {
            throw new NullPointerException("TextChildAnchor:newWithReplacement");
        }
        return new TextChildAnchor(__self);
    }        
    

    /**
     * Creates a new `GtkTextChildAnchor` with the given replacement character.
     * <br>
     * <br>Usually you would then insert it into a `GtkTextBuffer` with
     * <br>[method&#64;Gtk.TextBuffer.insert_child_anchor].
     * @param character 
     * @return a new `GtkTextChildAnchor`
    */
    public static TextChildAnchor newWithReplacementTextChildAnchor(String character)  {
        PointerContainer __self = cast(JnaTextChildAnchor.INST().gtk_text_child_anchor_new_with_replacement(character));
        if (__self.isNull()) {
            throw new NullPointerException("TextChildAnchor:newWithReplacement");
        }
        return new TextChildAnchor(__self);
    }        
    

    /**
     * Creates a new `GtkTextChildAnchor`.
     * <br>
     * <br>Usually you would then insert it into a `GtkTextBuffer` with
     * <br>[method&#64;Gtk.TextBuffer.insert_child_anchor]. To perform the
     * <br>creation and insertion in one step, use the convenience
     * <br>function [method&#64;Gtk.TextBuffer.create_child_anchor].
    */
    public TextChildAnchor() {
        super(cast(JnaTextChildAnchor.INST().gtk_text_child_anchor_new()));
    }

    /**
     * Determines whether a child anchor has been deleted from
     * <br>the buffer.
     * <br>
     * <br>Keep in mind that the child anchor will be unreferenced
     * <br>when removed from the buffer, so you need to hold your own
     * <br>reference (with g_object_ref()) if you plan to use this
     * <br>function — otherwise all deleted child anchors will also
     * <br>be finalized.
     * @return %TRUE if the child anchor has been deleted from its buffer
    */
    public boolean getDeleted()  {
        return JnaTextChildAnchor.INST().gtk_text_child_anchor_get_deleted(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTextChildAnchor.INST().gtk_text_child_anchor_get_type(); 
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

[MethodModel:cb-return-value-not-supported:java-type-not-supported:getWidgets:[ParameterModel:java-type-not-supported:{G_::{c:GtkWidget**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
