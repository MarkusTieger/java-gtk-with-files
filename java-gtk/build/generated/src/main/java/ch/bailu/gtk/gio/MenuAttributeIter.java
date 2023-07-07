/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMenuAttributeIter is an opaque structure type.  You must access it
 * <br>using the functions below.
 * <p><a href="https://docs.gtk.org/gio/class.MenuAttributeIter.html">https://docs.gtk.org/gio/class.MenuAttributeIter.html</a></p>
*/
public class MenuAttributeIter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuAttributeIter.class.getCanonicalName());
    }

    public MenuAttributeIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the name of the attribute at the current iterator position, as
     * <br>a string.
     * <br>
     * <br>The iterator is not advanced.
     * @return the name of the attribute
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMenuAttributeIter.INST().g_menu_attribute_iter_get_name(asCPointer())));
    }

    /**
     * Gets the value of the attribute at the current iterator position.
     * <br>
     * <br>The iterator is not advanced.
     * @return the value of the current attribute
    */
    public ch.bailu.gtk.glib.Variant getValue()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaMenuAttributeIter.INST().g_menu_attribute_iter_get_value(asCPointer())));
    }

    /**
     * Attempts to advance the iterator to the next (possibly first)
     * <br>attribute.
     * <br>
     * <br>%TRUE is returned on success, or %FALSE if there are no more
     * <br>attributes.
     * <br>
     * <br>You must call this function when you first acquire the iterator
     * <br>to advance it to the first attribute (and determine if the first
     * <br>attribute exists at all).
     * @return %TRUE on success, or %FALSE when there are no more attributes
    */
    public boolean next()  {
        return JnaMenuAttributeIter.INST().g_menu_attribute_iter_next(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMenuAttributeIter.INST().g_menu_attribute_iter_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getNext:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant**}}:{j:}]
*/
