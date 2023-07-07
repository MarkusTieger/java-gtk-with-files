/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkDevicePad` is an interface implemented by devices of type
 * <br>%GDK_SOURCE_TABLET_PAD
 * <br>
 * <br>It allows querying the features provided by the pad device.
 * <br>
 * <br>Tablet pads may contain one or more groups, each containing a subset
 * <br>of the buttons/rings/strips available. [method&#64;Gdk.DevicePad.get_n_groups]
 * <br>can be used to obtain the number of groups, [method&#64;Gdk.DevicePad.get_n_features]
 * <br>and [method&#64;Gdk.DevicePad.get_feature_group] can be combined to find out
 * <br>the number of buttons/rings/strips the device has, and how are they grouped.
 * <br>
 * <br>Each of those groups have different modes, which may be used to map each
 * <br>individual pad feature to multiple actions. Only one mode is effective
 * <br>(current) for each given group, different groups may have different
 * <br>current modes. The number of available modes in a group can be found
 * <br>out through [method&#64;Gdk.DevicePad.get_group_n_modes], and the current mode
 * <br>for a given group will be notified through events of type `GDK_PAD_GROUP_MODE`.
 * <p><a href="https://docs.gtk.org/gdk4/iface.DevicePad.html">https://docs.gtk.org/gdk4/iface.DevicePad.html</a></p>
*/
public class DevicePad extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DevicePad.class.getCanonicalName());
    }

    public DevicePad(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the group the given &#64;feature and &#64;idx belong to.
     * <br>
     * <br>f the feature or index do not exist in &#64;pad, -1 is returned.
     * @param feature the feature type to get the group from
     * @param feature_idx the index of the feature to get the group from
     * @return The group number of the queried pad feature.
    */
    public int getFeatureGroup(int feature, int feature_idx)  {
        return JnaDevicePad.INST().gdk_device_pad_get_feature_group(asCPointer(), feature, feature_idx);
    }

    /**
     * Returns the number of modes that &#64;group may have.
     * @param group_idx group to get the number of available modes from
     * @return The number of modes available in &#64;group.
    */
    public int getGroupNModes(int group_idx)  {
        return JnaDevicePad.INST().gdk_device_pad_get_group_n_modes(asCPointer(), group_idx);
    }

    /**
     * Returns the number of features a tablet pad has.
     * @param feature a pad feature
     * @return The amount of elements of type &#64;feature that this pad has.
    */
    public int getNFeatures(int feature)  {
        return JnaDevicePad.INST().gdk_device_pad_get_n_features(asCPointer(), feature);
    }

    /**
     * Returns the number of groups this pad device has.
     * <br>
     * <br>Pads have at least one group. A pad group is a subcollection of
     * <br>buttons/strip/rings that is affected collectively by a same
     * <br>current mode.
     * @return The number of button/ring/strip groups in the pad.
    */
    public int getNGroups()  {
        return JnaDevicePad.INST().gdk_device_pad_get_n_groups(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDevicePad.INST().gdk_device_pad_get_type(); 
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
interface-type
*/
