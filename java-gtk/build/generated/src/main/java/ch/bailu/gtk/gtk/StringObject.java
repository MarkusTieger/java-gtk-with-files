/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStringObject` is the type of items in a `GtkStringList`.
 * <br>
 * <br>A `GtkStringObject` is a wrapper around a `const char*`; it has
 * <br>a [property&#64;Gtk.StringObject:string] property.
 * <p><a href="https://docs.gtk.org/gtk4/class.StringObject.html">https://docs.gtk.org/gtk4/class.StringObject.html</a></p>
*/
public class StringObject extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StringObject.class.getCanonicalName());
    }

    public StringObject(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Wraps a string in an object for use with `GListModel`.
     * @param string The string to wrap
    */
    public StringObject(@Nonnull ch.bailu.gtk.type.Str string) {
        super(cast(JnaStringObject.INST().gtk_string_object_new(asCPointerNotNull(string))));
    }

    /**
     * Wraps a string in an object for use with `GListModel`.
     * @param string The string to wrap
    */
    public StringObject(String string) {
        super(cast(JnaStringObject.INST().gtk_string_object_new(string)));
    }

    /**
     * Returns the string contained in a `GtkStringObject`.
     * @return the string of &#64;self
    */
    public ch.bailu.gtk.type.Str getString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringObject.INST().gtk_string_object_get_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaStringObject.INST().gtk_string_object_get_type(); 
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
