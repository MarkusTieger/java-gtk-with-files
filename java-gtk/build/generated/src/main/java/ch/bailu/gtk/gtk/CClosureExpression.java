/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A variant of `GtkClosureExpression` using a C closure.
 * <p><a href="https://docs.gtk.org/gtk4/class.CClosureExpression.html">https://docs.gtk.org/gtk4/class.CClosureExpression.html</a></p>
*/
public class CClosureExpression extends Expression {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CClosureExpression.class.getCanonicalName());
    }

    public CClosureExpression(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaCClosureExpression.INST().gtk_cclosure_expression_get_type(); 
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

[MethodModel:cb-not-supported:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:CClosureExpression:{c:GtkExpression*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkExpression**}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:Callback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:ClosureNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]]
*/
