/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkNative` is the interface implemented by all widgets that have
 * <br>their own `GdkSurface`.
 * <br>
 * <br>The obvious example of a `GtkNative` is `GtkWindow`.
 * <br>
 * <br>Every widget that is not itself a `GtkNative` is contained in one,
 * <br>and you can get it with [method&#64;Gtk.Widget.get_native].
 * <br>
 * <br>To get the surface of a `GtkNative`, use [method&#64;Gtk.Native.get_surface].
 * <br>It is also possible to find the `GtkNative` to which a surface
 * <br>belongs, with [func&#64;Gtk.Native.get_for_surface].
 * <br>
 * <br>In addition to a [class&#64;Gdk.Surface], a `GtkNative` also provides
 * <br>a [class&#64;Gsk.Renderer] for rendering on that surface. To get the
 * <br>renderer, use [method&#64;Gtk.Native.get_renderer].
 * <p><a href="https://docs.gtk.org/gtk4/iface.Native.html">https://docs.gtk.org/gtk4/iface.Native.html</a></p>
*/
public class Native extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Native.class.getCanonicalName());
    }

    public Native(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the renderer that is used for this `GtkNative`.
     * @return the renderer for &#64;self
    */
    public ch.bailu.gtk.gsk.Renderer getRenderer()  {
        return new ch.bailu.gtk.gsk.Renderer(new PointerContainer(JnaNative.INST().gtk_native_get_renderer(asCPointer())));
    }

    /**
     * Returns the surface of this `GtkNative`.
     * @return the surface of &#64;self
    */
    public ch.bailu.gtk.gdk.Surface getSurface()  {
        return new ch.bailu.gtk.gdk.Surface(new PointerContainer(JnaNative.INST().gtk_native_get_surface(asCPointer())));
    }

    /**
     * Realizes a `GtkNative`.
     * <br>
     * <br>This should only be used by subclasses.
    */
    public void realize()  {
        JnaNative.INST().gtk_native_realize(asCPointer());
    }

    /**
     * Unrealizes a `GtkNative`.
     * <br>
     * <br>This should only be used by subclasses.
    */
    public void unrealize()  {
        JnaNative.INST().gtk_native_unrealize(asCPointer());
    }

    /**
     * Finds the `GtkNative` associated with the surface.
     * @param surface a `GdkSurface`
     * @return the `GtkNative` that is associated with &#64;surface
    */
    public static Native getForSurface(@Nonnull ch.bailu.gtk.gdk.Surface surface)  {
        return new Native(new PointerContainer(JnaNative.INST().gtk_native_get_for_surface(asCPointerNotNull(surface))));
    }

    public static long getTypeID() { 
        return JnaNative.INST().gtk_native_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getSurfaceTransform:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
