/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GObject` value in a `GtkExpression`.
 * <p><a href="https://docs.gtk.org/gtk4/class.ObjectExpression.html">https://docs.gtk.org/gtk4/class.ObjectExpression.html</a></p>
*/
public class ObjectExpression extends Expression {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ObjectExpression.class.getCanonicalName());
    }

    public ObjectExpression(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an expression evaluating to the given `object` with a weak reference.
     * <br>
     * <br>Once the `object` is disposed, it will fail to evaluate.
     * <br>
     * <br>This expression is meant to break reference cycles.
     * <br>
     * <br>If you want to keep a reference to `object`, use [ctor&#64;Gtk.ConstantExpression.new].
     * @param object object to watch
    */
    public ObjectExpression(@Nonnull ch.bailu.gtk.gobject.Object object) {
        super(cast(JnaObjectExpression.INST().gtk_object_expression_new(asCPointerNotNull(object))));
    }

    /**
     * Gets the object that the expression evaluates to.
     * @return the object, or `NULL`
    */
    public ch.bailu.gtk.gobject.Object getObject()  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaObjectExpression.INST().gtk_object_expression_get_object(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaObjectExpression.INST().gtk_object_expression_get_type(); 
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
