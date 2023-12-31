/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface DBusProxyFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Don't load properties.
    */
    int DO_NOT_LOAD_PROPERTIES = 1;

    /**
     * Don't connect to signals on the remote object.
    */
    int DO_NOT_CONNECT_SIGNALS = 2;

    /**
     * If the proxy is for a well-known name,
     * <br>do not ask the bus to launch an owner during proxy initialization or a method call.
     * <br>This flag is only meaningful in proxies for well-known names.
    */
    int DO_NOT_AUTO_START = 4;

    /**
     * If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-properties) D-Bus signal and the property will not cause emission of the &#35;GDBusProxy::g-properties-changed signal. When the value is received the &#35;GDBusProxy::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32.
    */
    int GET_INVALIDATED_PROPERTIES = 8;

    /**
     * If the proxy is for a well-known name,
     * <br>do not ask the bus to launch an owner during proxy initialization, but allow it to be
     * <br>autostarted by a method call. This flag is only meaningful in proxies for well-known names,
     * <br>and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also specified.
    */
    int DO_NOT_AUTO_START_AT_CONSTRUCTION = 16;

    /**
     * Don't actually send the AddMatch D-Bus
     * <br>   call for this signal subscription. This gives you more control
     * <br>   over which match rules you add (but you must add them manually). (Since: 2.72)
    */
    int NO_MATCH_RULE = 32;

}

/*
enumeration-type
*/
