/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkIMMulticontext` is an input method context supporting multiple,
 * <br>switchable input methods.
 * <br>
 * <br>Text widgets such as `GtkText` or `GtkTextView` use a `GtkIMMultiContext`
 * <br>to implement their `im-module` property for switching between different
 * <br>input methods.
 * <p><a href="https://docs.gtk.org/gtk4/class.IMMulticontext.html">https://docs.gtk.org/gtk4/class.IMMulticontext.html</a></p>
*/
public class IMMulticontext extends IMContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IMMulticontext.class.getCanonicalName());
    }

    public IMMulticontext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkIMMulticontext`.
    */
    public IMMulticontext() {
        super(cast(JnaIMMulticontext.INST().gtk_im_multicontext_new()));
    }

    /**
     * Gets the id of the currently active delegate of the &#64;context.
     * @return the id of the currently active delegate
    */
    public ch.bailu.gtk.type.Str getContextId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIMMulticontext.INST().gtk_im_multicontext_get_context_id(asCPointer())));
    }

    /**
     * Sets the context id for &#64;context.
     * <br>
     * <br>This causes the currently active delegate of &#64;context to be
     * <br>replaced by the delegate corresponding to the new context id.
     * <br>
     * <br>Setting this to a non-%NULL value overrides the system-wide
     * <br>IM module setting. See the [property&#64;Gtk.Settings:gtk-im-module]
     * <br>property.
     * @param context_id the id to use
    */
    public void setContextId(@Nullable ch.bailu.gtk.type.Str context_id)  {
        JnaIMMulticontext.INST().gtk_im_multicontext_set_context_id(asCPointer(), asCPointer(context_id));
    }

    /**
     * Sets the context id for &#64;context.
     * <br>
     * <br>This causes the currently active delegate of &#64;context to be
     * <br>replaced by the delegate corresponding to the new context id.
     * <br>
     * <br>Setting this to a non-%NULL value overrides the system-wide
     * <br>IM module setting. See the [property&#64;Gtk.Settings:gtk-im-module]
     * <br>property.
     * @param context_id the id to use
    */
    public void setContextId(String context_id)  {
        JnaIMMulticontext.INST().gtk_im_multicontext_set_context_id(asCPointer(), context_id);
    }

    public static long getTypeID() { 
        return JnaIMMulticontext.INST().gtk_im_multicontext_get_type(); 
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
