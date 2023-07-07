/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a watched `GtkExpression`.
 * <br>
 * <br>The contents of `GtkExpressionWatch` should only be accessed through the
 * <br>provided API.
 * <p><a href="https://docs.gtk.org/gtk4/struct.ExpressionWatch.html">https://docs.gtk.org/gtk4/struct.ExpressionWatch.html</a></p>
*/
public class ExpressionWatch extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ExpressionWatch.class.getCanonicalName());
    }

    public ExpressionWatch(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Evaluates the watched expression and on success stores the result
     * <br>in `value`.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.Expression.evaluate] with the
     * <br>expression and this pointer originally used to create `watch`.
     * @param value an empty `GValue` to be set
     * @return `TRUE` if the expression could be evaluated and `value` was set
    */
    public boolean evaluate(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaExpressionWatch.INST().gtk_expression_watch_evaluate(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Acquires a reference on the given `GtkExpressionWatch`.
     * @return the `GtkExpressionWatch` with an additional reference
    */
    public ExpressionWatch ref()  {
        return new ExpressionWatch(new PointerContainer(JnaExpressionWatch.INST().gtk_expression_watch_ref(asCPointer())));
    }

    /**
     * Releases a reference on the given `GtkExpressionWatch`.
     * <br>
     * <br>If the reference was the last, the resources associated to `self` are
     * <br>freed.
    */
    public void unref()  {
        JnaExpressionWatch.INST().gtk_expression_watch_unref(asCPointer());
    }

    /**
     * Stops watching an expression.
     * <br>
     * <br>See [method&#64;Gtk.Expression.watch] for how the watch
     * <br>was established.
    */
    public void unwatch()  {
        JnaExpressionWatch.INST().gtk_expression_watch_unwatch(asCPointer());
    }

    public static long getTypeID() { 
        return JnaExpressionWatch.INST().gtk_expression_watch_get_type(); 
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
record-type
all-fields-supported
*/
