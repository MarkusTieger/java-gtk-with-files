/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GIOExtensionPoint is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/gio/struct.IOExtensionPoint.html">https://docs.gtk.org/gio/struct.IOExtensionPoint.html</a></p>
*/
class IOExtensionPoint extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOExtensionPoint.class.getCanonicalName());
    }

    public IOExtensionPoint(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finds a &#35;GIOExtension for an extension point by name.
     * @param name the name of the extension to get
     * @return the &#35;GIOExtension for &#64;extension_point that has the    given name, or %NULL if there is no extension with that name
    */
    public IOExtension getExtensionByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new IOExtension(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_get_extension_by_name(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Finds a &#35;GIOExtension for an extension point by name.
     * @param name the name of the extension to get
     * @return the &#35;GIOExtension for &#64;extension_point that has the    given name, or %NULL if there is no extension with that name
    */
    public IOExtension getExtensionByName(String name)  {
        return new IOExtension(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_get_extension_by_name(asCPointer(), name)));
    }

    /**
     * Gets a list of all extensions that implement this extension point.
     * <br>The list is sorted by priority, beginning with the highest priority.
     * @return a &#35;GList of     &#35;GIOExtensions. The list is owned by GIO and should not be     modified.
    */
    public ch.bailu.gtk.glib.List getExtensions()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_get_extensions(asCPointer())));
    }

    /**
     * Gets the required type for &#64;extension_point.
     * @return the &#35;GType that all implementations must have,   or %G_TYPE_INVALID if the extension point has no required type
    */
    public long getRequiredType()  {
        return JnaIOExtensionPoint.INST().g_io_extension_point_get_required_type(asCPointer());
    }

    /**
     * Sets the required type for &#64;extension_point to &#64;type.
     * <br>All implementations must henceforth have this type.
     * @param type the &#35;GType to require
    */
    public void setRequiredType(long type)  {
        JnaIOExtensionPoint.INST().g_io_extension_point_set_required_type(asCPointer(), type);
    }

    /**
     * Registers &#64;type as extension for the extension point with name
     * <br>&#64;extension_point_name.
     * <br>
     * <br>If &#64;type has already been registered as an extension for this
     * <br>extension point, the existing &#35;GIOExtension object is returned.
     * @param extension_point_name the name of the extension point
     * @param type the &#35;GType to register as extension
     * @param extension_name the name for the extension
     * @param priority the priority for the extension
     * @return a &#35;GIOExtension object for &#35;GType
    */
    public static IOExtension implement(@Nonnull ch.bailu.gtk.type.Str extension_point_name, long type, @Nonnull ch.bailu.gtk.type.Str extension_name, int priority)  {
        return new IOExtension(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_implement(asCPointerNotNull(extension_point_name), type, asCPointerNotNull(extension_name), priority)));
    }

    /**
     * Looks up an existing extension point.
     * @param name the name of the extension point
     * @return the &#35;GIOExtensionPoint, or %NULL if there    is no registered extension point with the given name.
    */
    public static IOExtensionPoint lookup(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new IOExtensionPoint(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_lookup(asCPointerNotNull(name))));
    }

    /**
     * Registers an extension point.
     * @param name The name of the extension point
     * @return the new &#35;GIOExtensionPoint. This object is    owned by GIO and should not be freed.
    */
    public static IOExtensionPoint register(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new IOExtensionPoint(new PointerContainer(JnaIOExtensionPoint.INST().g_io_extension_point_register(asCPointerNotNull(name))));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
