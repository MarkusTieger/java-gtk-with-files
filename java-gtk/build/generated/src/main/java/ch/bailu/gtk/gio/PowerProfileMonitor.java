/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GPowerProfileMonitor makes it possible for applications as well as OS components
 * <br>to monitor system power profiles and act upon them. It currently only exports
 * <br>whether the system is in “Power Saver” mode (known as “Low Power” mode on
 * <br>some systems).
 * <br>
 * <br>When in “Low Power” mode, it is recommended that applications:
 * <br>- disable automatic downloads;
 * <br>- reduce the rate of refresh from online sources such as calendar or
 * <br>  email synchronisation;
 * <br>- reduce the use of expensive visual effects.
 * <br>
 * <br>It is also likely that OS components providing services to applications will
 * <br>lower their own background activity, for the sake of the system.
 * <br>
 * <br>There are a variety of tools that exist for power consumption analysis, but those
 * <br>usually depend on the OS and hardware used. On Linux, one could use `upower` to
 * <br>monitor the battery discharge rate, `powertop` to check on the background activity
 * <br>or activity at all), `sysprof` to inspect CPU usage, and `intel_gpu_time` to
 * <br>profile GPU usage.
 * <br>
 * <br>Don't forget to disconnect the &#35;GPowerProfileMonitor::notify::power-saver-enabled
 * <br>signal, and unref the &#35;GPowerProfileMonitor itself when exiting.
 * <p><a href="https://docs.gtk.org/gio/iface.PowerProfileMonitor.html">https://docs.gtk.org/gio/iface.PowerProfileMonitor.html</a></p>
*/
public class PowerProfileMonitor extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PowerProfileMonitor.class.getCanonicalName());
    }

    public PowerProfileMonitor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets whether the system is in “Power Saver” mode.
     * <br>
     * <br>You are expected to listen to the
     * <br>&#35;GPowerProfileMonitor::notify::power-saver-enabled signal to know when the profile has
     * <br>changed.
     * @return Whether the system is in “Power Saver” mode.
    */
    public boolean getPowerSaverEnabled()  {
        return JnaPowerProfileMonitor.INST().g_power_profile_monitor_get_power_saver_enabled(asCPointer());
    }

    /**
     * Gets a reference to the default &#35;GPowerProfileMonitor for the system.
     * @return a new reference to the default &#35;GPowerProfileMonitor
    */
    public static PowerProfileMonitor dupDefault()  {
        return new PowerProfileMonitor(new PointerContainer(JnaPowerProfileMonitor.INST().g_power_profile_monitor_dup_default()));
    }

    public static long getTypeID() { 
        return JnaPowerProfileMonitor.INST().g_power_profile_monitor_get_type(); 
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
