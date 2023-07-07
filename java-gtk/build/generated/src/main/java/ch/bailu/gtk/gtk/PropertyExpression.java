/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GObject` property value in a `GtkExpression`.
 * <p><a href="https://docs.gtk.org/gtk4/class.PropertyExpression.html">https://docs.gtk.org/gtk4/class.PropertyExpression.html</a></p>
*/
public class PropertyExpression extends Expression {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PropertyExpression.class.getCanonicalName());
    }

    public PropertyExpression(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an expression that looks up a property.
     * <br>
     * <br>The object to use is found by evaluating the `expression`,
     * <br>or using the `this` argument when `expression` is `NULL`.
     * <br>
     * <br>If the resulting object conforms to `this_type`, its
     * <br>property specified by `pspec` will be queried.
     * <br>Otherwise, this expression's evaluation will fail.
     * @param expression Expression to   evaluate to get the object to query or `NULL` to   query the `this` object
     * @param pspec the `GParamSpec` for the property to query
     * @return a new `GtkExpression`
    */
    public static PropertyExpression newForPspecPropertyExpression(@Nullable Expression expression, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        PointerContainer __self = cast(JnaPropertyExpression.INST().gtk_property_expression_new_for_pspec(asCPointer(expression), asCPointerNotNull(pspec)));
        if (__self.isNull()) {
            throw new NullPointerException("PropertyExpression:newForPspec");
        }
        return new PropertyExpression(__self);
    }        
    

    /**
     * Creates an expression that looks up a property.
     * <br>
     * <br>The object to use is found by evaluating the `expression`,
     * <br>or using the `this` argument when `expression` is `NULL`.
     * <br>
     * <br>If the resulting object conforms to `this_type`, its property named
     * <br>`property_name` will be queried. Otherwise, this expression's
     * <br>evaluation will fail.
     * <br>
     * <br>The given `this_type` must have a property with `property_name`.
     * @param this_type The type to expect for the this type
     * @param expression Expression to   evaluate to get the object to query or `NULL` to   query the `this` object
     * @param property_name name of the property
    */
    public PropertyExpression(long this_type, @Nullable Expression expression, @Nonnull ch.bailu.gtk.type.Str property_name) {
        super(cast(JnaPropertyExpression.INST().gtk_property_expression_new(this_type, asCPointer(expression), asCPointerNotNull(property_name))));
    }

    /**
     * Creates an expression that looks up a property.
     * <br>
     * <br>The object to use is found by evaluating the `expression`,
     * <br>or using the `this` argument when `expression` is `NULL`.
     * <br>
     * <br>If the resulting object conforms to `this_type`, its property named
     * <br>`property_name` will be queried. Otherwise, this expression's
     * <br>evaluation will fail.
     * <br>
     * <br>The given `this_type` must have a property with `property_name`.
     * @param this_type The type to expect for the this type
     * @param expression Expression to   evaluate to get the object to query or `NULL` to   query the `this` object
     * @param property_name name of the property
    */
    public PropertyExpression(long this_type, @Nullable Expression expression, String property_name) {
        super(cast(JnaPropertyExpression.INST().gtk_property_expression_new(this_type, asCPointer(expression), property_name)));
    }

    /**
     * Gets the expression specifying the object of
     * <br>a property expression.
     * @return the object expression
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaPropertyExpression.INST().gtk_property_expression_get_expression(asCPointer())));
    }

    /**
     * Gets the `GParamSpec` specifying the property of
     * <br>a property expression.
     * @return the `GParamSpec` for the property
    */
    public ch.bailu.gtk.gobject.ParamSpec getPspec()  {
        return new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(JnaPropertyExpression.INST().gtk_property_expression_get_pspec(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaPropertyExpression.INST().gtk_property_expression_get_type(); 
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
