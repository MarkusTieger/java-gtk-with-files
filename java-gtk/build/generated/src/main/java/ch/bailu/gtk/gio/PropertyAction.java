/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GPropertyAction is a way to get a &#35;GAction with a state value
 * <br>reflecting and controlling the value of a &#35;GObject property.
 * <br>
 * <br>The state of the action will correspond to the value of the property.
 * <br>Changing it will change the property (assuming the requested value
 * <br>matches the requirements as specified in the &#35;GParamSpec).
 * <br>
 * <br>Only the most common types are presently supported.  Booleans are
 * <br>mapped to booleans, strings to strings, signed/unsigned integers to
 * <br>int32/uint32 and floats and doubles to doubles.
 * <br>
 * <br>If the property is an enum then the state will be string-typed and
 * <br>conversion will automatically be performed between the enum value and
 * <br>&quot;nick&quot; string as per the &#35;GEnumValue table.
 * <br>
 * <br>Flags types are not currently supported.
 * <br>
 * <br>Properties of object types, boxed types and pointer types are not
 * <br>supported and probably never will be.
 * <br>
 * <br>Properties of &#35;GVariant types are not currently supported.
 * <br>
 * <br>If the property is boolean-valued then the action will have a NULL
 * <br>parameter type, and activating the action (with no parameter) will
 * <br>toggle the value of the property.
 * <br>
 * <br>In all other cases, the parameter type will correspond to the type of
 * <br>the property.
 * <br>
 * <br>The general idea here is to reduce the number of locations where a
 * <br>particular piece of state is kept (and therefore has to be synchronised
 * <br>between). &#35;GPropertyAction does not have a separate state that is kept
 * <br>in sync with the property value -- its state is the property value.
 * <br>
 * <br>For example, it might be useful to create a &#35;GAction corresponding to
 * <br>the &quot;visible-child-name&quot; property of a &#35;GtkStack so that the current
 * <br>page can be switched from a menu.  The active radio indication in the
 * <br>menu is then directly determined from the active page of the
 * <br>&#35;GtkStack.
 * <br>
 * <br>An anti-example would be binding the &quot;active-id&quot; property on a
 * <br>&#35;GtkComboBox.  This is because the state of the combobox itself is
 * <br>probably uninteresting and is actually being used to control
 * <br>something else.
 * <br>
 * <br>Another anti-example would be to bind to the &quot;visible-child-name&quot;
 * <br>property of a &#35;GtkStack if this value is actually stored in
 * <br>&#35;GSettings.  In that case, the real source of the value is
 * <br>&#35;GSettings.  If you want a &#35;GAction to control a setting stored in
 * <br>&#35;GSettings, see g_settings_create_action() instead, and possibly
 * <br>combine its use with g_settings_bind().
 * <p><a href="https://docs.gtk.org/gio/class.PropertyAction.html">https://docs.gtk.org/gio/class.PropertyAction.html</a></p>
*/
public class PropertyAction extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PropertyAction.class.getCanonicalName());
    }

    public PropertyAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GAction corresponding to the value of property
     * <br>&#64;property_name on &#64;object.
     * <br>
     * <br>The property must be existent and readable and writable (and not
     * <br>construct-only).
     * <br>
     * <br>This function takes a reference on &#64;object and doesn't release it
     * <br>until the action is destroyed.
     * @param name the name of the action to create
     * @param object the object that has the property   to wrap
     * @param property_name the name of the property
    */
    public PropertyAction(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property_name) {
        super(cast(JnaPropertyAction.INST().g_property_action_new(asCPointerNotNull(name), asCPointerNotNull(object), asCPointerNotNull(property_name))));
    }

    /**
     * Creates a &#35;GAction corresponding to the value of property
     * <br>&#64;property_name on &#64;object.
     * <br>
     * <br>The property must be existent and readable and writable (and not
     * <br>construct-only).
     * <br>
     * <br>This function takes a reference on &#64;object and doesn't release it
     * <br>until the action is destroyed.
     * @param name the name of the action to create
     * @param object the object that has the property   to wrap
     * @param property_name the name of the property
    */
    public PropertyAction(String name, @Nonnull ch.bailu.gtk.type.Pointer object, String property_name) {
        super(cast(JnaPropertyAction.INST().g_property_action_new(name, asCPointerNotNull(object), property_name)));
    }

    /**
     * Implements interface {@link Action}. Call this to get access to interface functions.
     * @return {@link Action}
    */
    public Action asAction() {
        return new Action(cast());
    }

    public static long getTypeID() { 
        return JnaPropertyAction.INST().g_property_action_get_type(); 
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
