/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
 * <p><a href="https://docs.gtk.org/gtk4/class.AssistantPage.html">https://docs.gtk.org/gtk4/class.AssistantPage.html</a></p>
*/
public class AssistantPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AssistantPage.class.getCanonicalName());
    }

    public AssistantPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the child to which &#64;page belongs.
     * @return the child to which &#64;page belongs
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaAssistantPage.INST().gtk_assistant_page_get_child(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaAssistantPage.INST().gtk_assistant_page_get_type(); 
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
