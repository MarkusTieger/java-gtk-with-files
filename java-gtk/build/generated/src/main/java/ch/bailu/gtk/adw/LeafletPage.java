/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An auxiliary class used by [class&#64;Leaflet].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.LeafletPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.LeafletPage.html</a></p>
*/
public class LeafletPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LeafletPage.class.getCanonicalName());
    }

    public LeafletPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the leaflet child to which &#64;self belongs.
     * @return the child to which &#64;self belongs
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaLeafletPage.INST().adw_leaflet_page_get_child(asCPointer())));
    }

    /**
     * Gets the name of &#64;self.
     * @return the name of &#64;self.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLeafletPage.INST().adw_leaflet_page_get_name(asCPointer())));
    }

    /**
     * Gets whether the child can be navigated to when folded.
     * @return whether &#64;self can be navigated to when folded
    */
    public boolean getNavigatable()  {
        return JnaLeafletPage.INST().adw_leaflet_page_get_navigatable(asCPointer());
    }

    /**
     * Sets the name of the &#64;self.
     * @param name the new value to set
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaLeafletPage.INST().adw_leaflet_page_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets the name of the &#64;self.
     * @param name the new value to set
    */
    public void setName(String name)  {
        JnaLeafletPage.INST().adw_leaflet_page_set_name(asCPointer(), name);
    }

    /**
     * Sets whether &#64;self can be navigated to when folded.
     * <br>
     * <br>If `FALSE`, the child will be ignored by [method&#64;Leaflet.get_adjacent_child],
     * <br>[method&#64;Leaflet.navigate], and swipe gestures.
     * <br>
     * <br>This can be used used to prevent switching to widgets like separators.
     * @param navigatable whether &#64;self can be navigated to when folded
    */
    public void setNavigatable(boolean navigatable)  {
        JnaLeafletPage.INST().adw_leaflet_page_set_navigatable(asCPointer(), navigatable);
    }

    public static long getTypeID() { 
        return JnaLeafletPage.INST().adw_leaflet_page_get_type(); 
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
