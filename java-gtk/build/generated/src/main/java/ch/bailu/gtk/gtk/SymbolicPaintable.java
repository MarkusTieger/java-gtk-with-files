/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSymbolicPaintable` is an interface that support symbolic colors in
 * <br>paintables.
 * <br>
 * <br>`GdkPaintable`s implementing the interface will have the
 * <br>[vfunc&#64;Gtk.SymbolicPaintable.snapshot_symbolic] function called and
 * <br>have the colors for drawing symbolic icons passed. At least 4 colors are guaranteed
 * <br>to be passed every time.
 * <br>
 * <br>These 4 colors are the foreground color, and the colors to use for errors, warnings
 * <br>and success information in that order.
 * <br>
 * <br>More colors may be added in the future.
 * <p><a href="https://docs.gtk.org/gtk4/iface.SymbolicPaintable.html">https://docs.gtk.org/gtk4/iface.SymbolicPaintable.html</a></p>
*/
public class SymbolicPaintable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SymbolicPaintable.class.getCanonicalName());
    }

    public SymbolicPaintable(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaSymbolicPaintable.INST().gtk_symbolic_paintable_get_type(); 
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

[MethodModel:java-type-not-supported:snapshotSymbolic:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Snapshot:{c:GdkSnapshot*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GdkRGBA*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
