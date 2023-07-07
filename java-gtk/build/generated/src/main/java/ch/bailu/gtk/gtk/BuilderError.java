/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface BuilderError {

    /**
     * A type-func attribute didn’t name
     * <br> a function that returns a `GType`.
    */
    int INVALID_TYPE_FUNCTION = 0;

    /**
     * The input contained a tag that `GtkBuilder`
     * <br> can’t handle.
    */
    int UNHANDLED_TAG = 1;

    /**
     * An attribute that is required by
     * <br> `GtkBuilder` was missing.
    */
    int MISSING_ATTRIBUTE = 2;

    /**
     * `GtkBuilder` found an attribute that
     * <br> it doesn’t understand.
    */
    int INVALID_ATTRIBUTE = 3;

    /**
     * `GtkBuilder` found a tag that
     * <br> it doesn’t understand.
    */
    int INVALID_TAG = 4;

    /**
     * A required property value was
     * <br> missing.
    */
    int MISSING_PROPERTY_VALUE = 5;

    /**
     * `GtkBuilder` couldn’t parse
     * <br> some attribute value.
    */
    int INVALID_VALUE = 6;

    /**
     * The input file requires a newer version
     * <br> of GTK.
    */
    int VERSION_MISMATCH = 7;

    /**
     * An object id occurred twice.
    */
    int DUPLICATE_ID = 8;

    /**
     * A specified object type is of the same type or
     * <br> derived from the type of the composite class being extended with builder XML.
    */
    int OBJECT_TYPE_REFUSED = 9;

    /**
     * The wrong type was specified in a composite class’s template XML
    */
    int TEMPLATE_MISMATCH = 10;

    /**
     * The specified property is unknown for the object class.
    */
    int INVALID_PROPERTY = 11;

    /**
     * The specified signal is unknown for the object class.
    */
    int INVALID_SIGNAL = 12;

    /**
     * An object id is unknown.
    */
    int INVALID_ID = 13;

    /**
     * A function could not be found. This often happens
     * <br>  when symbols are set to be kept private. Compiling code with -rdynamic or using the
     * <br>  `gmodule-export-2.0` pkgconfig module can fix this problem.
    */
    int INVALID_FUNCTION = 14;

}

/*
enumeration-type
*/
