/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBuildable` allows objects to extend and customize their deserialization
 * <br>from ui files.
 * <br>
 * <br>The interface includes methods for setting names and properties of objects,
 * <br>parsing custom tags and constructing child objects.
 * <br>
 * <br>The `GtkBuildable` interface is implemented by all widgets and
 * <br>many of the non-widget objects that are provided by GTK. The
 * <br>main user of this interface is [class&#64;Gtk.Builder]. There should be
 * <br>very little need for applications to call any of these functions directly.
 * <br>
 * <br>An object only needs to implement this interface if it needs to extend the
 * <br>`GtkBuilder` XML format or run any extra routines at deserialization time.
 * <p><a href="https://docs.gtk.org/gtk4/iface.Buildable.html">https://docs.gtk.org/gtk4/iface.Buildable.html</a></p>
*/
public class Buildable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Buildable.class.getCanonicalName());
    }

    public Buildable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the ID of the &#64;buildable object.
     * <br>
     * <br>`GtkBuilder` sets the name based on the ID attribute
     * <br>of the &lt;object&gt; tag used to construct the &#64;buildable.
     * @return the ID of the buildable object
    */
    public ch.bailu.gtk.type.Str getBuildableId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBuildable.INST().gtk_buildable_get_buildable_id(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaBuildable.INST().gtk_buildable_get_type(); 
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
