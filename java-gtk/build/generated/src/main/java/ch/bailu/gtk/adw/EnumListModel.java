/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [iface&#64;Gio.ListModel] representing values of a given enum.
 * <br>
 * <br>`AdwEnumListModel` contains objects of type [class&#64;EnumListItem].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EnumListModel.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EnumListModel.html</a></p>
*/
public class EnumListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EnumListModel.class.getCanonicalName());
    }

    public EnumListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwEnumListModel` for &#64;enum_type.
     * @param enum_type the type of the enum to construct the model from
    */
    public EnumListModel(long enum_type) {
        super(cast(JnaEnumListModel.INST().adw_enum_list_model_new(enum_type)));
    }

    /**
     * Finds the position of a given enum value in &#64;self.
     * @param value an enum value
     * @return 
    */
    public int findPosition(int value)  {
        return JnaEnumListModel.INST().adw_enum_list_model_find_position(asCPointer(), value);
    }

    /**
     * Gets the type of the enum represented by &#64;self.
     * @return the enum type
    */
    public long getEnumType()  {
        return JnaEnumListModel.INST().adw_enum_list_model_get_enum_type(asCPointer());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaEnumListModel.INST().adw_enum_list_model_get_type(); 
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
