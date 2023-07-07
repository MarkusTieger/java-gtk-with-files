/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `AdwEnumListItem` is the type of items in a [class&#64;EnumListModel].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EnumListItem.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EnumListItem.html</a></p>
*/
public class EnumListItem extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EnumListItem.class.getCanonicalName());
    }

    public EnumListItem(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the enum value name.
     * @return the enum value name
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEnumListItem.INST().adw_enum_list_item_get_name(asCPointer())));
    }

    /**
     * Gets the enum value nick.
     * @return the enum value nick
    */
    public ch.bailu.gtk.type.Str getNick()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEnumListItem.INST().adw_enum_list_item_get_nick(asCPointer())));
    }

    /**
     * Gets the enum value.
     * @return the enum value
    */
    public int getValue()  {
        return JnaEnumListItem.INST().adw_enum_list_item_get_value(asCPointer());
    }

    public static long getTypeID() { 
        return JnaEnumListItem.INST().adw_enum_list_item_get_type(); 
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
