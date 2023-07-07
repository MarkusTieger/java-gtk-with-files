/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMenuLinkIter is an opaque structure type.  You must access it using
 * <br>the functions below.
 * <p><a href="https://docs.gtk.org/gio/class.MenuLinkIter.html">https://docs.gtk.org/gio/class.MenuLinkIter.html</a></p>
*/
public class MenuLinkIter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuLinkIter.class.getCanonicalName());
    }

    public MenuLinkIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the name of the link at the current iterator position.
     * <br>
     * <br>The iterator is not advanced.
     * @return the type of the link
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMenuLinkIter.INST().g_menu_link_iter_get_name(asCPointer())));
    }

    /**
     * Gets the linked &#35;GMenuModel at the current iterator position.
     * <br>
     * <br>The iterator is not advanced.
     * @return the &#35;GMenuModel that is linked to
    */
    public MenuModel getValue()  {
        return new MenuModel(new PointerContainer(JnaMenuLinkIter.INST().g_menu_link_iter_get_value(asCPointer())));
    }

    /**
     * Attempts to advance the iterator to the next (possibly first)
     * <br>link.
     * <br>
     * <br>%TRUE is returned on success, or %FALSE if there are no more links.
     * <br>
     * <br>You must call this function when you first acquire the iterator to
     * <br>advance it to the first link (and determine if the first link exists
     * <br>at all).
     * @return %TRUE on success, or %FALSE when there are no more links
    */
    public boolean next()  {
        return JnaMenuLinkIter.INST().g_menu_link_iter_next(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMenuLinkIter.INST().g_menu_link_iter_get_type(); 
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
        [ParameterModel:java-type-not-supported:{G_::{c:GMenuModel**}}:{j:}]
*/
