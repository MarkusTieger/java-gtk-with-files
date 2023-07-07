/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBoolFilter` evaluates a boolean `GtkExpression`
 * <br>to determine whether to include items.
 * <p><a href="https://docs.gtk.org/gtk4/class.BoolFilter.html">https://docs.gtk.org/gtk4/class.BoolFilter.html</a></p>
*/
public class BoolFilter extends Filter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BoolFilter.class.getCanonicalName());
    }

    public BoolFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new bool filter.
     * @param expression The expression to evaluate
    */
    public BoolFilter(@Nullable Expression expression) {
        super(cast(JnaBoolFilter.INST().gtk_bool_filter_new(asCPointer(expression))));
    }

    /**
     * Gets the expression that the filter uses to evaluate if
     * <br>an item should be filtered.
     * @return a `GtkExpression`
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaBoolFilter.INST().gtk_bool_filter_get_expression(asCPointer())));
    }

    /**
     * Returns whether the filter inverts the expression.
     * @return %TRUE if the filter inverts
    */
    public boolean getInvert()  {
        return JnaBoolFilter.INST().gtk_bool_filter_get_invert(asCPointer());
    }

    /**
     * Sets the expression that the filter uses to check if items
     * <br>should be filtered.
     * <br>
     * <br>The expression must have a value type of %G_TYPE_BOOLEAN.
     * @param expression a `GtkExpression`
    */
    public void setExpression(@Nullable Expression expression)  {
        JnaBoolFilter.INST().gtk_bool_filter_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets whether the filter should invert the expression.
     * @param invert %TRUE to invert
    */
    public void setInvert(boolean invert)  {
        JnaBoolFilter.INST().gtk_bool_filter_set_invert(asCPointer(), invert);
    }

    public static long getTypeID() { 
        return JnaBoolFilter.INST().gtk_bool_filter_get_type(); 
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
