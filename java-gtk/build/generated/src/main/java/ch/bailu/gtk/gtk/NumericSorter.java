/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkNumericSorter` is a `GtkSorter` that compares numbers.
 * <br>
 * <br>To obtain the numbers to compare, this sorter evaluates a
 * <br>[class&#64;Gtk.Expression].
 * <p><a href="https://docs.gtk.org/gtk4/class.NumericSorter.html">https://docs.gtk.org/gtk4/class.NumericSorter.html</a></p>
*/
public class NumericSorter extends Sorter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NumericSorter.class.getCanonicalName());
    }

    public NumericSorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new numeric sorter using the given &#64;expression.
     * <br>
     * <br>Smaller numbers will be sorted first. You can call
     * <br>[method&#64;Gtk.NumericSorter.set_sort_order] to change this.
     * @param expression The expression to evaluate
    */
    public NumericSorter(@Nullable Expression expression) {
        super(cast(JnaNumericSorter.INST().gtk_numeric_sorter_new(asCPointer(expression))));
    }

    /**
     * Gets the expression that is evaluated to obtain numbers from items.
     * @return a `GtkExpression`
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaNumericSorter.INST().gtk_numeric_sorter_get_expression(asCPointer())));
    }

    /**
     * Gets whether this sorter will sort smaller numbers first.
     * @return the order of the numbers
    */
    public int getSortOrder()  {
        return JnaNumericSorter.INST().gtk_numeric_sorter_get_sort_order(asCPointer());
    }

    /**
     * Sets the expression that is evaluated to obtain numbers from items.
     * <br>
     * <br>Unless an expression is set on &#64;self, the sorter will always
     * <br>compare items as invalid.
     * <br>
     * <br>The expression must have a return type that can be compared
     * <br>numerically, such as %G_TYPE_INT or %G_TYPE_DOUBLE.
     * @param expression a `GtkExpression`
    */
    public void setExpression(@Nullable Expression expression)  {
        JnaNumericSorter.INST().gtk_numeric_sorter_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets whether to sort smaller numbers before larger ones.
     * @param sort_order whether to sort smaller numbers first
    */
    public void setSortOrder(int sort_order)  {
        JnaNumericSorter.INST().gtk_numeric_sorter_set_sort_order(asCPointer(), sort_order);
    }

    public static long getTypeID() { 
        return JnaNumericSorter.INST().gtk_numeric_sorter_get_type(); 
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
