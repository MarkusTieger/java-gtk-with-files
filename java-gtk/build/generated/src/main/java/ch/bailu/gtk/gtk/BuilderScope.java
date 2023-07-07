/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBuilderScope` is an interface to provide language binding support
 * <br>to `GtkBuilder`.
 * <br>
 * <br>The goal of `GtkBuilderScope` is to look up programming-language-specific
 * <br>values for strings that are given in a `GtkBuilder` UI file.
 * <br>
 * <br>The primary intended audience is bindings that want to provide deeper
 * <br>integration of `GtkBuilder` into the language.
 * <br>
 * <br>A `GtkBuilderScope` instance may be used with multiple `GtkBuilder` objects,
 * <br>even at once.
 * <br>
 * <br>By default, GTK will use its own implementation of `GtkBuilderScope`
 * <br>for the C language which can be created via [ctor&#64;Gtk.BuilderCScope.new].
 * <p><a href="https://docs.gtk.org/gtk4/iface.BuilderScope.html">https://docs.gtk.org/gtk4/iface.BuilderScope.html</a></p>
*/
public class BuilderScope extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuilderScope.class.getCanonicalName());
    }

    public BuilderScope(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaBuilderScope.INST().gtk_builder_scope_get_type(); 
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
