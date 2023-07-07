/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkExpression` provides a way to describe references to values.
 * <br>
 * <br>An important aspect of expressions is that the value can be obtained
 * <br>from a source that is several steps away. For example, an expression
 * <br>may describe ‘the value of property A of `object1`, which is itself the
 * <br>value of a property of `object2`’. And `object1` may not even exist yet
 * <br>at the time that the expression is created. This is contrast to `GObject`
 * <br>property bindings, which can only create direct connections between
 * <br>the properties of two objects that must both exist for the duration
 * <br>of the binding.
 * <br>
 * <br>An expression needs to be &quot;evaluated&quot; to obtain the value that it currently
 * <br>refers to. An evaluation always happens in the context of a current object
 * <br>called `this` (it mirrors the behavior of object-oriented languages),
 * <br>which may or may not influence the result of the evaluation. Use
 * <br>[method&#64;Gtk.Expression.evaluate] for evaluating an expression.
 * <br>
 * <br>Various methods for defining expressions exist, from simple constants via
 * <br>[ctor&#64;Gtk.ConstantExpression.new] to looking up properties in a `GObject`
 * <br>(even recursively) via [ctor&#64;Gtk.PropertyExpression.new] or providing
 * <br>custom functions to transform and combine expressions via
 * <br>[ctor&#64;Gtk.ClosureExpression.new].
 * <br>
 * <br>Here is an example of a complex expression:
 * <br>
 * <br>```c
 * <br>  color_expr = gtk_property_expression_new (GTK_TYPE_LIST_ITEM,
 * <br>                                            NULL, &quot;item&quot;);
 * <br>  expression = gtk_property_expression_new (GTK_TYPE_COLOR,
 * <br>                                            color_expr, &quot;name&quot;);
 * <br>```
 * <br>
 * <br>when evaluated with `this` being a `GtkListItem`, it will obtain the
 * <br>&quot;item&quot; property from the `GtkListItem`, and then obtain the &quot;name&quot; property
 * <br>from the resulting object (which is assumed to be of type `GTK_TYPE_COLOR`).
 * <br>
 * <br>A more concise way to describe this would be
 * <br>
 * <br>```
 * <br>  this-&gt;item-&gt;name
 * <br>```
 * <br>
 * <br>The most likely place where you will encounter expressions is in the context
 * <br>of list models and list widgets using them. For example, `GtkDropDown` is
 * <br>evaluating a `GtkExpression` to obtain strings from the items in its model
 * <br>that it can then use to match against the contents of its search entry.
 * <br>`GtkStringFilter` is using a `GtkExpression` for similar reasons.
 * <br>
 * <br>By default, expressions are not paying attention to changes and evaluation is
 * <br>just a snapshot of the current state at a given time. To get informed about
 * <br>changes, an expression needs to be &quot;watched&quot; via a [struct&#64;Gtk.ExpressionWatch],
 * <br>which will cause a callback to be called whenever the value of the expression may
 * <br>have changed; [method&#64;Gtk.Expression.watch] starts watching an expression, and
 * <br>[method&#64;Gtk.ExpressionWatch.unwatch] stops.
 * <br>
 * <br>Watches can be created for automatically updating the property of an object,
 * <br>similar to GObject's `GBinding` mechanism, by using [method&#64;Gtk.Expression.bind].
 * <br>
 * <br>&#35;&#35; GtkExpression in GObject properties
 * <br>
 * <br>In order to use a `GtkExpression` as a `GObject` property, you must use the
 * <br>[id&#64;gtk_param_spec_expression] when creating a `GParamSpec` to install in the
 * <br>`GObject` class being defined; for instance:
 * <br>
 * <br>```c
 * <br>obj_props[PROP_EXPRESSION] =
 * <br>  gtk_param_spec_expression (&quot;expression&quot;,
 * <br>                             &quot;Expression&quot;,
 * <br>                             &quot;The expression used by the widget&quot;,
 * <br>                             G_PARAM_READWRITE |
 * <br>                             G_PARAM_STATIC_STRINGS |
 * <br>                             G_PARAM_EXPLICIT_NOTIFY);
 * <br>```
 * <br>
 * <br>When implementing the `GObjectClass.set_property` and `GObjectClass.get_property`
 * <br>virtual functions, you must use [id&#64;gtk_value_get_expression], to retrieve the
 * <br>stored `GtkExpression` from the `GValue` container, and [id&#64;gtk_value_set_expression],
 * <br>to store the `GtkExpression` into the `GValue`; for instance:
 * <br>
 * <br>```c
 * <br>  // in set_property()...
 * <br>  case PROP_EXPRESSION:
 * <br>    foo_widget_set_expression (foo, gtk_value_get_expression (value));
 * <br>    break;
 * <br>
 * <br>  // in get_property()...
 * <br>  case PROP_EXPRESSION:
 * <br>    gtk_value_set_expression (value, foo-&gt;expression);
 * <br>    break;
 * <br>```
 * <br>
 * <br>&#35;&#35; GtkExpression in .ui files
 * <br>
 * <br>`GtkBuilder` has support for creating expressions. The syntax here can be used where
 * <br>a `GtkExpression` object is needed like in a `&lt;property&gt;` tag for an expression
 * <br>property, or in a `&lt;binding name=&quot;property&quot;&gt;` tag to bind a property to an expression.
 * <br>
 * <br>To create a property expression, use the `&lt;lookup&gt;` element. It can have a `type`
 * <br>attribute to specify the object type, and a `name` attribute to specify the property
 * <br>to look up. The content of `&lt;lookup&gt;` can either be an element specfiying the expression
 * <br>to use the object, or a string that specifies the name of the object to use.
 * <br>
 * <br>Example:
 * <br>
 * <br>```xml
 * <br>  &lt;lookup name='search'&gt;string_filter&lt;/lookup&gt;
 * <br>```
 * <br>
 * <br>To create a constant expression, use the `&lt;constant&gt;` element. If the type attribute
 * <br>is specified, the element content is interpreted as a value of that type. Otherwise,
 * <br>it is assumed to be an object. For instance:
 * <br>
 * <br>```xml
 * <br>  &lt;constant&gt;string_filter&lt;/constant&gt;
 * <br>  &lt;constant type='gchararray'&gt;Hello, world&lt;/constant&gt;
 * <br>```
 * <br>
 * <br>To create a closure expression, use the `&lt;closure&gt;` element. The `type` and `function`
 * <br>attributes specify what function to use for the closure, the content of the element
 * <br>contains the expressions for the parameters. For instance:
 * <br>
 * <br>```xml
 * <br>  &lt;closure type='gchararray' function='combine_args_somehow'&gt;
 * <br>    &lt;constant type='gchararray'&gt;File size:&lt;/constant&gt;
 * <br>    &lt;lookup type='GFile' name='size'&gt;myfile&lt;/lookup&gt;
 * <br>  &lt;/closure&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.Expression.html">https://docs.gtk.org/gtk4/class.Expression.html</a></p>
*/
public class Expression extends ch.bailu.gtk.type.Pointer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Expression.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnExpressionNotify {
        /**
         * Callback called by gtk_expression_watch() when the
         * <br>expression value changes.
         * @param user_data data passed to gtk_expression_watch()
        */
        void onExpressionNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaExpression.OnExpressionNotify toOnExpressionNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnExpressionNotify in) {
        JnaExpression.OnExpressionNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onExpressionNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaExpression.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaExpression.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Expression(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Bind `target`'s property named `property` to `self`.
     * <br>
     * <br>The value that `self` evaluates to is set via `g_object_set()` on
     * <br>`target`. This is repeated whenever `self` changes to ensure that
     * <br>the object's property stays synchronized with `self`.
     * <br>
     * <br>If `self`'s evaluation fails, `target`'s `property` is not updated.
     * <br>You can ensure that this doesn't happen by using a fallback
     * <br>expression.
     * <br>
     * <br>Note that this function takes ownership of `self`. If you want
     * <br>to keep it around, you should [method&#64;Gtk.Expression.ref] it beforehand.
     * @param target the target object to bind to
     * @param property name of the property on `target` to bind to
     * @param this_ the this argument for   the evaluation of `self`
     * @return a `GtkExpressionWatch`
    */
    public ExpressionWatch bind(@Nonnull ch.bailu.gtk.type.Pointer target, @Nonnull ch.bailu.gtk.type.Str property, @Nullable ch.bailu.gtk.type.Pointer this_)  {
        return new ExpressionWatch(new PointerContainer(JnaExpression.INST().gtk_expression_bind(asCPointer(), asCPointerNotNull(target), asCPointerNotNull(property), asCPointer(this_))));
    }

    /**
     * Bind `target`'s property named `property` to `self`.
     * <br>
     * <br>The value that `self` evaluates to is set via `g_object_set()` on
     * <br>`target`. This is repeated whenever `self` changes to ensure that
     * <br>the object's property stays synchronized with `self`.
     * <br>
     * <br>If `self`'s evaluation fails, `target`'s `property` is not updated.
     * <br>You can ensure that this doesn't happen by using a fallback
     * <br>expression.
     * <br>
     * <br>Note that this function takes ownership of `self`. If you want
     * <br>to keep it around, you should [method&#64;Gtk.Expression.ref] it beforehand.
     * @param target the target object to bind to
     * @param property name of the property on `target` to bind to
     * @param this_ the this argument for   the evaluation of `self`
     * @return a `GtkExpressionWatch`
    */
    public ExpressionWatch bind(@Nonnull ch.bailu.gtk.type.Pointer target, String property, @Nullable ch.bailu.gtk.type.Pointer this_)  {
        return new ExpressionWatch(new PointerContainer(JnaExpression.INST().gtk_expression_bind(asCPointer(), asCPointerNotNull(target), property, asCPointer(this_))));
    }

    /**
     * Evaluates the given expression and on success stores the result
     * <br>in &#64;value.
     * <br>
     * <br>The `GType` of `value` will be the type given by
     * <br>[method&#64;Gtk.Expression.get_value_type].
     * <br>
     * <br>It is possible that expressions cannot be evaluated - for example
     * <br>when the expression references objects that have been destroyed or
     * <br>set to `NULL`. In that case `value` will remain empty and `FALSE`
     * <br>will be returned.
     * @param this_ the this argument for the evaluation
     * @param value an empty `GValue`
     * @return `TRUE` if the expression could be evaluated
    */
    public boolean evaluate(@Nullable ch.bailu.gtk.type.Pointer this_, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaExpression.INST().gtk_expression_evaluate(asCPointer(), asCPointer(this_), asCPointerNotNull(value));
    }

    /**
     * Gets the `GType` that this expression evaluates to.
     * <br>
     * <br>This type is constant and will not change over the lifetime
     * <br>of this expression.
     * @return The type returned from [method&#64;Gtk.Expression.evaluate]
    */
    public long getValueType()  {
        return JnaExpression.INST().gtk_expression_get_value_type(asCPointer());
    }

    /**
     * Checks if the expression is static.
     * <br>
     * <br>A static expression will never change its result when
     * <br>[method&#64;Gtk.Expression.evaluate] is called on it with the same arguments.
     * <br>
     * <br>That means a call to [method&#64;Gtk.Expression.watch] is not necessary because
     * <br>it will never trigger a notify.
     * @return `TRUE` if the expression is static
    */
    public boolean isStatic()  {
        return JnaExpression.INST().gtk_expression_is_static(asCPointer());
    }

    /**
     * Acquires a reference on the given `GtkExpression`.
     * @return the `GtkExpression` with an additional reference
    */
    public Expression ref()  {
        return new Expression(new PointerContainer(JnaExpression.INST().gtk_expression_ref(asCPointer())));
    }

    /**
     * Releases a reference on the given `GtkExpression`.
     * <br>
     * <br>If the reference was the last, the resources associated to the `self` are
     * <br>freed.
    */
    public void unref()  {
        JnaExpression.INST().gtk_expression_unref(asCPointer());
    }

    /**
     * Watch the given `expression` for changes.
     * <br>
     * <br>The &#64;notify function will be called whenever the evaluation of `self`
     * <br>may have changed.
     * <br>
     * <br>GTK cannot guarantee that the evaluation did indeed change when the &#64;notify
     * <br>gets invoked, but it guarantees the opposite: When it did in fact change,
     * <br>the &#64;notify will be invoked.
     * @param this_ the `this` argument to   watch
     * @param notify callback to invoke when the expression changes
     * @param user_data user data to pass to the `notify` callback
     * @param user_destroy destroy notify for `user_data`
     * @return The newly installed watch. Note that the only   reference held to the watch will be released when the watch is unwatched   which can happen automatically, and not just via   [method&#64;Gtk.ExpressionWatch.unwatch]. You should call [method&#64;Gtk.ExpressionWatch.ref]   if you want to keep the watch around.
    */
    public ExpressionWatch watch(@Nullable ch.bailu.gtk.type.Pointer this_, OnExpressionNotify notify, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy)  {
        return new ExpressionWatch(new PointerContainer(JnaExpression.INST().gtk_expression_watch(asCPointer(), asCPointer(this_), toOnExpressionNotify(this, "watch", notify), asCPointer(user_data), toOnDestroyNotify(this, "watch", user_destroy))));
    }

    public static long getTypeID() { 
        return JnaExpression.INST().gtk_expression_get_type(); 
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
