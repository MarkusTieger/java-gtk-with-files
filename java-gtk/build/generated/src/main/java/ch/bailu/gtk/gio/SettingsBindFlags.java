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
public interface SettingsBindFlags {

    /**
     * Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET`
    */
    int DEFAULT = 0;

    /**
     * Update the &#35;GObject property when the setting changes.
     * <br>    It is an error to use this flag if the property is not writable.
    */
    int GET = 1;

    /**
     * Update the setting when the &#35;GObject property changes.
     * <br>    It is an error to use this flag if the property is not readable.
    */
    int SET = 2;

    /**
     * Do not try to bind a &quot;sensitivity&quot; property to the writability of the setting
    */
    int NO_SENSITIVITY = 4;

    /**
     * When set in addition to %G_SETTINGS_BIND_GET, set the &#35;GObject property
     * <br>    value initially from the setting, but do not listen for changes of the setting
    */
    int GET_NO_CHANGES = 8;

    /**
     * When passed to g_settings_bind(), uses a pair of mapping functions that invert
     * <br>    the boolean value when mapping between the setting and the property.  The setting and property must both
     * <br>    be booleans.  You cannot pass this flag to g_settings_bind_with_mapping().
    */
    int INVERT_BOOLEAN = 16;

}

/*
enumeration-type
*/
