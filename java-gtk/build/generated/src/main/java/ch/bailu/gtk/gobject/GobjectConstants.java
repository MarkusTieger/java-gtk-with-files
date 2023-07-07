/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface GobjectConstants {

    /**
     * Mask containing the bits of &#35;GParamSpec.flags which are reserved for GLib.
    */
    int PARAM_MASK = 255;

    /**
     * &#35;GParamFlags value alias for %G_PARAM_STATIC_NAME | %G_PARAM_STATIC_NICK | %G_PARAM_STATIC_BLURB.
     * <br>
     * <br>It is recommended to use this for all properties by default, as it allows for
     * <br>internal performance improvements in GObject.
     * <br>
     * <br>It is very rare that a property would have a dynamically constructed name,
     * <br>nickname or blurb.
     * <br>
     * <br>Since 2.13.0
    */
    int PARAM_STATIC_STRINGS = 224;

    /**
     * Minimum shift count to be used for user defined flags, to be stored in
     * <br>&#35;GParamSpec.flags. The maximum allowed is 10.
    */
    int PARAM_USER_SHIFT = 8;

    /**
     * A mask for all &#35;GSignalFlags bits.
    */
    int SIGNAL_FLAGS_MASK = 511;

    /**
     * A mask for all &#35;GSignalMatchType bits.
    */
    int SIGNAL_MATCH_MASK = 63;

    /**
     * A bit in the type number that's supposed to be left untouched.
    */
    long TYPE_FLAG_RESERVED_ID_BIT = 1;

    /**
     * An integer constant that represents the number of identifiers reserved
     * <br>for types that are assigned at compile-time.
    */
    int TYPE_FUNDAMENTAL_MAX = 255;

    /**
     * Shift value used in converting numbers to type IDs.
    */
    int TYPE_FUNDAMENTAL_SHIFT = 2;

    /**
     * First fundamental type number to create a new fundamental type id with
     * <br>G_TYPE_MAKE_FUNDAMENTAL() reserved for BSE.
    */
    int TYPE_RESERVED_BSE_FIRST = 32;

    /**
     * Last fundamental type number reserved for BSE.
    */
    int TYPE_RESERVED_BSE_LAST = 48;

    /**
     * First fundamental type number to create a new fundamental type id with
     * <br>G_TYPE_MAKE_FUNDAMENTAL() reserved for GLib.
    */
    int TYPE_RESERVED_GLIB_FIRST = 22;

    /**
     * Last fundamental type number reserved for GLib.
    */
    int TYPE_RESERVED_GLIB_LAST = 31;

    /**
     * First available fundamental type number to create new fundamental
     * <br>type id with G_TYPE_MAKE_FUNDAMENTAL().
    */
    int TYPE_RESERVED_USER_FIRST = 49;

    /**
     * For string values, indicates that the string contained is canonical and will
     * <br>exist for the duration of the process. See g_value_set_interned_string().
    */
    int VALUE_INTERNED_STRING = 268435456;

    /**
     * If passed to G_VALUE_COLLECT(), allocated data won't be copied
     * <br>but used verbatim. This does not affect ref-counted types like
     * <br>objects. This does not affect usage of g_value_copy(), the data will
     * <br>be copied if it is not ref-counted.
    */
    int VALUE_NOCOPY_CONTENTS = 134217728;

}

/*
enumeration-type
*/
