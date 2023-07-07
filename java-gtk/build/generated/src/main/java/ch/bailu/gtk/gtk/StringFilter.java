/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStringFilter` determines whether to include items by comparing
 * <br>strings to a fixed search term.
 * <br>
 * <br>The strings are obtained from the items by evaluating a `GtkExpression`
 * <br>set with [method&#64;Gtk.StringFilter.set_expression], and they are
 * <br>compared against a search term set with [method&#64;Gtk.StringFilter.set_search].
 * <br>
 * <br>`GtkStringFilter` has several different modes of comparison - it
 * <br>can match the whole string, just a prefix, or any substring. Use
 * <br>[method&#64;Gtk.StringFilter.set_match_mode] choose a mode.
 * <br>
 * <br>It is also possible to make case-insensitive comparisons, with
 * <br>[method&#64;Gtk.StringFilter.set_ignore_case].
 * <p><a href="https://docs.gtk.org/gtk4/class.StringFilter.html">https://docs.gtk.org/gtk4/class.StringFilter.html</a></p>
*/
public class StringFilter extends Filter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StringFilter.class.getCanonicalName());
    }

    public StringFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new string filter.
     * <br>
     * <br>You will want to set up the filter by providing a string to search for
     * <br>and by providing a property to look up on the item.
     * @param expression The expression to evaluate
    */
    public StringFilter(@Nullable Expression expression) {
        super(cast(JnaStringFilter.INST().gtk_string_filter_new(asCPointer(expression))));
    }

    /**
     * Gets the expression that the string filter uses to
     * <br>obtain strings from items.
     * @return a `GtkExpression`
    */
    public Expression getExpression()  {
        return new Expression(new PointerContainer(JnaStringFilter.INST().gtk_string_filter_get_expression(asCPointer())));
    }

    /**
     * Returns whether the filter ignores case differences.
     * @return %TRUE if the filter ignores case
    */
    public boolean getIgnoreCase()  {
        return JnaStringFilter.INST().gtk_string_filter_get_ignore_case(asCPointer());
    }

    /**
     * Returns the match mode that the filter is using.
     * @return the match mode of the filter
    */
    public int getMatchMode()  {
        return JnaStringFilter.INST().gtk_string_filter_get_match_mode(asCPointer());
    }

    /**
     * Gets the search term.
     * @return The search term
    */
    public ch.bailu.gtk.type.Str getSearch()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringFilter.INST().gtk_string_filter_get_search(asCPointer())));
    }

    /**
     * Sets the expression that the string filter uses to
     * <br>obtain strings from items.
     * <br>
     * <br>The expression must have a value type of %G_TYPE_STRING.
     * @param expression a `GtkExpression`
    */
    public void setExpression(@Nullable Expression expression)  {
        JnaStringFilter.INST().gtk_string_filter_set_expression(asCPointer(), asCPointer(expression));
    }

    /**
     * Sets whether the filter ignores case differences.
     * @param ignore_case %TRUE to ignore case
    */
    public void setIgnoreCase(boolean ignore_case)  {
        JnaStringFilter.INST().gtk_string_filter_set_ignore_case(asCPointer(), ignore_case);
    }

    /**
     * Sets the match mode for the filter.
     * @param mode the new match mode
    */
    public void setMatchMode(int mode)  {
        JnaStringFilter.INST().gtk_string_filter_set_match_mode(asCPointer(), mode);
    }

    /**
     * Sets the string to search for.
     * @param search The string to search for   or %NULL to clear the search
    */
    public void setSearch(@Nullable ch.bailu.gtk.type.Str search)  {
        JnaStringFilter.INST().gtk_string_filter_set_search(asCPointer(), asCPointer(search));
    }

    /**
     * Sets the string to search for.
     * @param search The string to search for   or %NULL to clear the search
    */
    public void setSearch(String search)  {
        JnaStringFilter.INST().gtk_string_filter_set_search(asCPointer(), search);
    }

    public static long getTypeID() { 
        return JnaStringFilter.INST().gtk_string_filter_get_type(); 
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
