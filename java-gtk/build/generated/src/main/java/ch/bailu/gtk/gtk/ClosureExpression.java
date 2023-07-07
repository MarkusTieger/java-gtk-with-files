/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An expression using a custom `GClosure` to compute the value from
 * <br>its parameters.
 * <p><a href="https://docs.gtk.org/gtk4/class.ClosureExpression.html">https://docs.gtk.org/gtk4/class.ClosureExpression.html</a></p>
*/
public class ClosureExpression extends Expression {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClosureExpression.class.getCanonicalName());
    }

    public ClosureExpression(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaClosureExpression.INST().gtk_closure_expression_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:ClosureExpression:{c:GtkExpression*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkExpression**}}:{j:}]
*/
