/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStringSorter` is a `GtkSorter` that compares strings.
 * <br>
 * <br>It does the comparison in a linguistically correct way using the
 * <br>current locale by normalizing Unicode strings and possibly case-folding
 * <br>them before performing the comparison.
 * <br>
 * <br>To obtain the strings to compare, this sorter evaluates a
 * <br>[class&#64;Gtk.Expression].
 * <p><a href="https://docs.gtk.org/gtk4/class.StringSorter.html">https://docs.gtk.org/gtk4/class.StringSorter.html</a></p>
*/
public class StringSorter extends Sorter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StringSorter.class.getCanonicalName());
    }

    public StringSorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new string sorter that compares items using the given
     * <br>&#64;expression.
     * <br>
     * <br>Unless an expression is set on it, this sorter will always
     * <br>compare items as invalid.
     * @param expression The expression to evaluate
    */
    public StringSorter(@Nullable Expression expression) {
        super(cast(JnaStringSorter.INST().gtk_string_sorter_new(asCPointer(expression))));
    }

    /**
     * Gets the expression that is evaluated to obtain strings from items.
     * @return a `GtkExpression`
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaStringSorter.INST().gtk_string_sorter_get_expression(asCPointer())));
    }

    /**
     * Gets whether the sorter ignores case differences.
     * @return %TRUE if &#64;self is ignoring case differences
    */
    public boolean getIgnoreCase()  {
        return JnaStringSorter.INST().gtk_string_sorter_get_ignore_case(asCPointer());
    }

    /**
     * Sets the expression that is evaluated to obtain strings from items.
     * <br>
     * <br>The expression must have the type %G_TYPE_STRING.
     * @param expression a `GtkExpression`
    */
    public void setExpression(@Nullable Expression expression)  {
        JnaStringSorter.INST().gtk_string_sorter_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets whether the sorter will ignore case differences.
     * @param ignore_case %TRUE to ignore case differences
    */
    public void setIgnoreCase(boolean ignore_case)  {
        JnaStringSorter.INST().gtk_string_sorter_set_ignore_case(asCPointer(), ignore_case);
    }

    public static long getTypeID() { 
        return JnaStringSorter.INST().gtk_string_sorter_get_type(); 
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
