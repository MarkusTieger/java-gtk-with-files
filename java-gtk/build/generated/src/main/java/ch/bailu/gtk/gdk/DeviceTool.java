/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A physical tool associated to a `GdkDevice`.
 * <p><a href="https://docs.gtk.org/gdk4/class.DeviceTool.html">https://docs.gtk.org/gdk4/class.DeviceTool.html</a></p>
*/
public class DeviceTool extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DeviceTool.class.getCanonicalName());
    }

    public DeviceTool(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the axes of the tool.
     * @return the axes of &#64;tool
    */
    public int getAxes()  {
        return JnaDeviceTool.INST().gdk_device_tool_get_axes(asCPointer());
    }

    /**
     * Gets the hardware ID of this tool, or 0 if it's not known.
     * <br>
     * <br>When non-zero, the identificator is unique for the given tool model,
     * <br>meaning that two identical tools will share the same &#64;hardware_id,
     * <br>but will have different serial numbers (see
     * <br>[method&#64;Gdk.DeviceTool.get_serial]).
     * <br>
     * <br>This is a more concrete (and device specific) method to identify
     * <br>a `GdkDeviceTool` than [method&#64;Gdk.DeviceTool.get_tool_type],
     * <br>as a tablet may support multiple devices with the same
     * <br>`GdkDeviceToolType`, but different hardware identificators.
     * @return The hardware identificator of this tool.
    */
    public long getHardwareId()  {
        return JnaDeviceTool.INST().gdk_device_tool_get_hardware_id(asCPointer());
    }

    /**
     * Gets the serial number of this tool.
     * <br>
     * <br>This value can be used to identify a physical tool
     * <br>(eg. a tablet pen) across program executions.
     * @return The serial ID for this tool
    */
    public long getSerial()  {
        return JnaDeviceTool.INST().gdk_device_tool_get_serial(asCPointer());
    }

    /**
     * Gets the `GdkDeviceToolType` of the tool.
     * @return The physical type for this tool. This can be used to   figure out what sort of pen is being used, such as an airbrush   or a pencil.
    */
    public int getToolType()  {
        return JnaDeviceTool.INST().gdk_device_tool_get_tool_type(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDeviceTool.INST().gdk_device_tool_get_type(); 
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
