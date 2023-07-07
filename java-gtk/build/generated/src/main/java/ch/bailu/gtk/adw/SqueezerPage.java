/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An auxiliary class used by [class&#64;Squeezer].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SqueezerPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SqueezerPage.html</a></p>
*/
public class SqueezerPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SqueezerPage.class.getCanonicalName());
    }

    public SqueezerPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the squeezer child to which &#64;self belongs.
     * @return the child to which &#64;self belongs
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaSqueezerPage.INST().adw_squeezer_page_get_child(asCPointer())));
    }

    /**
     * Gets whether &#64;self is enabled.
     * @return whether &#64;self is enabled
    */
    public boolean getEnabled()  {
        return JnaSqueezerPage.INST().adw_squeezer_page_get_enabled(asCPointer());
    }

    /**
     * Sets whether &#64;self is enabled.
     * <br>
     * <br>If a child is disabled, it will be ignored when looking for the child
     * <br>fitting the available size best.
     * <br>
     * <br>This allows to programmatically and prematurely hide a child even if it fits
     * <br>in the available space.
     * <br>
     * <br>This can be used e.g. to ensure a certain child is hidden below a certain
     * <br>window width, or any other constraint you find suitable.
     * @param enabled whether &#64;self is enabled
    */
    public void setEnabled(boolean enabled)  {
        JnaSqueezerPage.INST().adw_squeezer_page_set_enabled(asCPointer(), enabled);
    }

    public static long getTypeID() { 
        return JnaSqueezerPage.INST().adw_squeezer_page_get_type(); 
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
