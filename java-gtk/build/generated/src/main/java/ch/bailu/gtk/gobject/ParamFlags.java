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
public interface ParamFlags {

    /**
     * the parameter is readable
    */
    int READABLE = 1;

    /**
     * the parameter is writable
    */
    int WRITABLE = 2;

    /**
     * alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE
    */
    int READWRITE = 3;

    /**
     * the parameter will be set upon object construction
    */
    int CONSTRUCT = 4;

    /**
     * the parameter can only be set upon object construction
    */
    int CONSTRUCT_ONLY = 8;

    /**
     * upon parameter conversion (see g_param_value_convert())
     * <br> strict validation is not required
    */
    int LAX_VALIDATION = 16;

    /**
     * the string used as name when constructing the
     * <br> parameter is guaranteed to remain valid and
     * <br> unmodified for the lifetime of the parameter.
     * <br> Since 2.8
    */
    int STATIC_NAME = 32;

    /**
     * internal
    */
    int PRIVATE = 32;

    /**
     * the string used as nick when constructing the
     * <br> parameter is guaranteed to remain valid and
     * <br> unmmodified for the lifetime of the parameter.
     * <br> Since 2.8
    */
    int STATIC_NICK = 64;

    /**
     * the string used as blurb when constructing the
     * <br> parameter is guaranteed to remain valid and
     * <br> unmodified for the lifetime of the parameter.
     * <br> Since 2.8
    */
    int STATIC_BLURB = 128;

    /**
     * calls to g_object_set_property() for this
     * <br>  property will not automatically result in a &quot;notify&quot; signal being
     * <br>  emitted: the implementation must call g_object_notify() themselves
     * <br>  in case the property actually changes.  Since: 2.42.
    */
    int EXPLICIT_NOTIFY = 1073741824;

}

/*
enumeration-type

[ParameterModel:value-not-supported:{G_::{c:int}}:{j:int}]
*/
