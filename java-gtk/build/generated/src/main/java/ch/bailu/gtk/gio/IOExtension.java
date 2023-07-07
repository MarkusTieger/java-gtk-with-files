/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GIOExtension is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/gio/struct.IOExtension.html">https://docs.gtk.org/gio/struct.IOExtension.html</a></p>
*/
class IOExtension extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOExtension.class.getCanonicalName());
    }

    public IOExtension(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the name under which &#64;extension was registered.
     * <br>
     * <br>Note that the same type may be registered as extension
     * <br>for multiple extension points, under different names.
     * @return the name of &#64;extension.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIOExtension.INST().g_io_extension_get_name(asCPointer())));
    }

    /**
     * Gets the priority with which &#64;extension was registered.
     * @return the priority of &#64;extension
    */
    public int getPriority()  {
        return JnaIOExtension.INST().g_io_extension_get_priority(asCPointer());
    }

    /**
     * Gets the type associated with &#64;extension.
     * @return the type of &#64;extension
    */
    public long getType()  {
        return JnaIOExtension.INST().g_io_extension_get_type(asCPointer());
    }

    /**
     * Gets a reference to the class for the type that is
     * <br>associated with &#64;extension.
     * @return the &#35;GTypeClass for the type of &#64;extension
    */
    public ch.bailu.gtk.gobject.TypeClass refClass()  {
        return new ch.bailu.gtk.gobject.TypeClass(new PointerContainer(JnaIOExtension.INST().g_io_extension_ref_class(asCPointer())));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
