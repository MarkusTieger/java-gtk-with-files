/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
 * <p><a href="https://docs.gtk.org/gtk4/class.FixedLayoutChild.html">https://docs.gtk.org/gtk4/class.FixedLayoutChild.html</a></p>
*/
public class FixedLayoutChild extends LayoutChild {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FixedLayoutChild.class.getCanonicalName());
    }

    public FixedLayoutChild(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the transformation of the child.
     * @return a `GskTransform`
    */
    public ch.bailu.gtk.gsk.Transform getTransform()  {
        return new ch.bailu.gtk.gsk.Transform(new PointerContainer(JnaFixedLayoutChild.INST().gtk_fixed_layout_child_get_transform(asCPointer())));
    }

    /**
     * Sets the transformation of the child of a `GtkFixedLayout`.
     * @param transform a `GskTransform`
    */
    public void setTransform(@Nonnull ch.bailu.gtk.gsk.Transform transform)  {
        JnaFixedLayoutChild.INST().gtk_fixed_layout_child_set_transform(asCPointer(), asCPointerNotNull(transform));
    }

    public static long getTypeID() { 
        return JnaFixedLayoutChild.INST().gtk_fixed_layout_child_get_type(); 
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
