/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface FormatSizeFlags {

    /**
     * behave the same as g_format_size()
    */
    int DEFAULT = 0;

    /**
     * include the exact number of bytes as part
     * <br>    of the returned string.  For example, &quot;45.6 kB (45,612 bytes)&quot;.
    */
    int LONG_FORMAT = 1;

    /**
     * use IEC (base 1024) units with &quot;KiB&quot;-style
     * <br>    suffixes. IEC units should only be used for reporting things with
     * <br>    a strong &quot;power of 2&quot; basis, like RAM sizes or RAID stripe sizes.
     * <br>    Network and storage sizes should be reported in the normal SI units.
    */
    int IEC_UNITS = 2;

    /**
     * set the size as a quantity in bits, rather than
     * <br>    bytes, and return units in bits. For example, ‘Mb’ rather than ‘MB’.
    */
    int BITS = 4;

    /**
     * return only value, without unit; this should
     * <br>    not be used together with &#64;G_FORMAT_SIZE_LONG_FORMAT
     * <br>    nor &#64;G_FORMAT_SIZE_ONLY_UNIT. Since: 2.74
    */
    int ONLY_VALUE = 8;

    /**
     * return only unit, without value; this should
     * <br>    not be used together with &#64;G_FORMAT_SIZE_LONG_FORMAT
     * <br>    nor &#64;G_FORMAT_SIZE_ONLY_VALUE. Since: 2.74
    */
    int ONLY_UNIT = 16;

}

/*
enumeration-type
*/
