/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A constant value in a `GtkExpression`.
 * <p><a href="https://docs.gtk.org/gtk4/class.ConstantExpression.html">https://docs.gtk.org/gtk4/class.ConstantExpression.html</a></p>
*/
public class ConstantExpression extends Expression {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstantExpression.class.getCanonicalName());
    }

    public ConstantExpression(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an expression that always evaluates to the given `value`.
     * @param value a `GValue`
     * @return a new `GtkExpression`
    */
    public static ConstantExpression newForValueConstantExpression(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        PointerContainer __self = cast(JnaConstantExpression.INST().gtk_constant_expression_new_for_value(asCPointerNotNull(value)));
        if (__self.isNull()) {
            throw new NullPointerException("ConstantExpression:newForValue");
        }
        return new ConstantExpression(__self);
    }        
    

    /**
     * Creates a `GtkExpression` that evaluates to the
     * <br>object given by the arguments.
     * @param value_type The type of the object
     * @param _elipse arguments to create the object from
    */
    public ConstantExpression(long value_type, java.lang.Object... _elipse) {
        super(cast(JnaConstantExpression.INST().gtk_constant_expression_new(value_type, _elipse)));
    }

    /**
     * Gets the value that a constant expression evaluates to.
     * @return the value
    */
    public ch.bailu.gtk.gobject.Value getValue()  {
        return new ch.bailu.gtk.gobject.Value(new PointerContainer(JnaConstantExpression.INST().gtk_constant_expression_get_value(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaConstantExpression.INST().gtk_constant_expression_get_type(); 
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
