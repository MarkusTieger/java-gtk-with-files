/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The base class for all widgets.
 * <br>
 * <br>`GtkWidget` is the base class all widgets in GTK derive from. It manages the
 * <br>widget lifecycle, layout, states and style.
 * <br>
 * <br>&#35;&#35;&#35; Height-for-width Geometry Management
 * <br>
 * <br>GTK uses a height-for-width (and width-for-height) geometry management
 * <br>system. Height-for-width means that a widget can change how much
 * <br>vertical space it needs, depending on the amount of horizontal space
 * <br>that it is given (and similar for width-for-height). The most common
 * <br>example is a label that reflows to fill up the available width, wraps
 * <br>to fewer lines, and therefore needs less height.
 * <br>
 * <br>Height-for-width geometry management is implemented in GTK by way
 * <br>of two virtual methods:
 * <br>
 * <br>- [vfunc&#64;Gtk.Widget.get_request_mode]
 * <br>- [vfunc&#64;Gtk.Widget.measure]
 * <br>
 * <br>There are some important things to keep in mind when implementing
 * <br>height-for-width and when using it in widget implementations.
 * <br>
 * <br>If you implement a direct `GtkWidget` subclass that supports
 * <br>height-for-width or width-for-height geometry management for itself
 * <br>or its child widgets, the [vfunc&#64;Gtk.Widget.get_request_mode] virtual
 * <br>function must be implemented as well and return the widget's preferred
 * <br>request mode. The default implementation of this virtual function
 * <br>returns %GTK_SIZE_REQUEST_CONSTANT_SIZE, which means that the widget will
 * <br>only ever get -1 passed as the for_size value to its
 * <br>[vfunc&#64;Gtk.Widget.measure] implementation.
 * <br>
 * <br>The geometry management system will query a widget hierarchy in
 * <br>only one orientation at a time. When widgets are initially queried
 * <br>for their minimum sizes it is generally done in two initial passes
 * <br>in the [enum&#64;Gtk.SizeRequestMode] chosen by the toplevel.
 * <br>
 * <br>For example, when queried in the normal %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH mode:
 * <br>
 * <br>First, the default minimum and natural width for each widget
 * <br>in the interface will be computed using [id&#64;gtk_widget_measure] with an
 * <br>orientation of %GTK_ORIENTATION_HORIZONTAL and a for_size of -1.
 * <br>Because the preferred widths for each widget depend on the preferred
 * <br>widths of their children, this information propagates up the hierarchy,
 * <br>and finally a minimum and natural width is determined for the entire
 * <br>toplevel. Next, the toplevel will use the minimum width to query for the
 * <br>minimum height contextual to that width using [id&#64;gtk_widget_measure] with an
 * <br>orientation of %GTK_ORIENTATION_VERTICAL and a for_size of the just computed
 * <br>width. This will also be a highly recursive operation. The minimum height
 * <br>for the minimum width is normally used to set the minimum size constraint
 * <br>on the toplevel.
 * <br>
 * <br>After the toplevel window has initially requested its size in both
 * <br>dimensions it can go on to allocate itself a reasonable size (or a size
 * <br>previously specified with [method&#64;Gtk.Window.set_default_size]). During the
 * <br>recursive allocation process it’s important to note that request cycles
 * <br>will be recursively executed while widgets allocate their children.
 * <br>Each widget, once allocated a size, will go on to first share the
 * <br>space in one orientation among its children and then request each child's
 * <br>height for its target allocated width or its width for allocated height,
 * <br>depending. In this way a `GtkWidget` will typically be requested its size
 * <br>a number of times before actually being allocated a size. The size a
 * <br>widget is finally allocated can of course differ from the size it has
 * <br>requested. For this reason, `GtkWidget` caches a  small number of results
 * <br>to avoid re-querying for the same sizes in one allocation cycle.
 * <br>
 * <br>If a widget does move content around to intelligently use up the
 * <br>allocated size then it must support the request in both
 * <br>`GtkSizeRequestMode`s even if the widget in question only
 * <br>trades sizes in a single orientation.
 * <br>
 * <br>For instance, a [class&#64;Gtk.Label] that does height-for-width word wrapping
 * <br>will not expect to have [vfunc&#64;Gtk.Widget.measure] with an orientation of
 * <br>%GTK_ORIENTATION_VERTICAL called because that call is specific to a
 * <br>width-for-height request. In this case the label must return the height
 * <br>required for its own minimum possible width. By following this rule any
 * <br>widget that handles height-for-width or width-for-height requests will
 * <br>always be allocated at least enough space to fit its own content.
 * <br>
 * <br>Here are some examples of how a %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH widget
 * <br>generally deals with width-for-height requests:
 * <br>
 * <br>```c
 * <br>static void
 * <br>foo_widget_measure (GtkWidget      *widget,
 * <br>                    GtkOrientation  orientation,
 * <br>                    int             for_size,
 * <br>                    int            *minimum_size,
 * <br>                    int            *natural_size,
 * <br>                    int            *minimum_baseline,
 * <br>                    int            *natural_baseline)
 * <br>{
 * <br>  if (orientation == GTK_ORIENTATION_HORIZONTAL)
 * <br>    {
 * <br>      // Calculate minimum and natural width
 * <br>    }
 * <br>  else // VERTICAL
 * <br>    {
 * <br>      if (i_am_in_height_for_width_mode)
 * <br>        {
 * <br>          int min_width, dummy;
 * <br>
 * <br>          // First, get the minimum width of our widget
 * <br>          GTK_WIDGET_GET_CLASS (widget)-&gt;measure (widget, GTK_ORIENTATION_HORIZONTAL, -1,
 * <br>                                                  &amp;min_width, &amp;dummy, &amp;dummy, &amp;dummy);
 * <br>
 * <br>          // Now use the minimum width to retrieve the minimum and natural height to display
 * <br>          // that width.
 * <br>          GTK_WIDGET_GET_CLASS (widget)-&gt;measure (widget, GTK_ORIENTATION_VERTICAL, min_width,
 * <br>                                                  minimum_size, natural_size, &amp;dummy, &amp;dummy);
 * <br>        }
 * <br>      else
 * <br>        {
 * <br>          // ... some widgets do both.
 * <br>        }
 * <br>    }
 * <br>}
 * <br>```
 * <br>
 * <br>Often a widget needs to get its own request during size request or
 * <br>allocation. For example, when computing height it may need to also
 * <br>compute width. Or when deciding how to use an allocation, the widget
 * <br>may need to know its natural size. In these cases, the widget should
 * <br>be careful to call its virtual methods directly, like in the code
 * <br>example above.
 * <br>
 * <br>It will not work to use the wrapper function [method&#64;Gtk.Widget.measure]
 * <br>inside your own [vfunc&#64;Gtk.Widget.size_allocate] implementation.
 * <br>These return a request adjusted by [class&#64;Gtk.SizeGroup], the widget's
 * <br>align and expand flags, as well as its CSS style.
 * <br>
 * <br>If a widget used the wrappers inside its virtual method implementations,
 * <br>then the adjustments (such as widget margins) would be applied
 * <br>twice. GTK therefore does not allow this and will warn if you try
 * <br>to do it.
 * <br>
 * <br>Of course if you are getting the size request for another widget, such
 * <br>as a child widget, you must use [id&#64;gtk_widget_measure]; otherwise, you
 * <br>would not properly consider widget margins, [class&#64;Gtk.SizeGroup], and
 * <br>so forth.
 * <br>
 * <br>GTK also supports baseline vertical alignment of widgets. This
 * <br>means that widgets are positioned such that the typographical baseline of
 * <br>widgets in the same row are aligned. This happens if a widget supports
 * <br>baselines, has a vertical alignment of %GTK_ALIGN_BASELINE, and is inside
 * <br>a widget that supports baselines and has a natural “row” that it aligns to
 * <br>the baseline, or a baseline assigned to it by the grandparent.
 * <br>
 * <br>Baseline alignment support for a widget is also done by the
 * <br>[vfunc&#64;Gtk.Widget.measure] virtual function. It allows you to report
 * <br>both a minimum and natural size.
 * <br>
 * <br>If a widget ends up baseline aligned it will be allocated all the space in
 * <br>the parent as if it was %GTK_ALIGN_FILL, but the selected baseline can be
 * <br>found via [id&#64;gtk_widget_get_allocated_baseline]. If the baseline has a
 * <br>value other than -1 you need to align the widget such that the baseline
 * <br>appears at the position.
 * <br>
 * <br>&#35;&#35;&#35; GtkWidget as GtkBuildable
 * <br>
 * <br>The `GtkWidget` implementation of the `GtkBuildable` interface
 * <br>supports various custom elements to specify additional aspects of widgets
 * <br>that are not directly expressed as properties.
 * <br>
 * <br>If the widget uses a [class&#64;Gtk.LayoutManager], `GtkWidget` supports
 * <br>a custom `&lt;layout&gt;` element, used to define layout properties:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkGrid&quot; id=&quot;my_grid&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot; id=&quot;label1&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Description&lt;/property&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row-span&quot;&gt;1&lt;/property&gt;
 * <br>        &lt;property name=&quot;column-span&quot;&gt;1&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkEntry&quot; id=&quot;description_entry&quot;&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;1&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row-span&quot;&gt;1&lt;/property&gt;
 * <br>        &lt;property name=&quot;column-span&quot;&gt;1&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>`GtkWidget` allows style information such as style classes to
 * <br>be associated with widgets, using the custom `&lt;style&gt;` element:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkButton&quot; id=&quot;button1&quot;&gt;
 * <br>  &lt;style&gt;
 * <br>    &lt;class name=&quot;my-special-button-class&quot;/&gt;
 * <br>    &lt;class name=&quot;dark-button&quot;/&gt;
 * <br>  &lt;/style&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>`GtkWidget` allows defining accessibility information, such as properties,
 * <br>relations, and states, using the custom `&lt;accessibility&gt;` element:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkButton&quot; id=&quot;button1&quot;&gt;
 * <br>  &lt;accessibility&gt;
 * <br>    &lt;property name=&quot;label&quot;&gt;Download&lt;/property&gt;
 * <br>    &lt;relation name=&quot;labelled-by&quot;&gt;label1&lt;/relation&gt;
 * <br>  &lt;/accessibility&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35;&#35;&#35; Building composite widgets from template XML
 * <br>
 * <br>`GtkWidget `exposes some facilities to automate the procedure
 * <br>of creating composite widgets using &quot;templates&quot;.
 * <br>
 * <br>To create composite widgets with `GtkBuilder` XML, one must associate
 * <br>the interface description with the widget class at class initialization
 * <br>time using [method&#64;Gtk.WidgetClass.set_template].
 * <br>
 * <br>The interface description semantics expected in composite template descriptions
 * <br>is slightly different from regular [class&#64;Gtk.Builder] XML.
 * <br>
 * <br>Unlike regular interface descriptions, [method&#64;Gtk.WidgetClass.set_template] will
 * <br>expect a `&lt;template&gt;` tag as a direct child of the toplevel `&lt;interface&gt;`
 * <br>tag. The `&lt;template&gt;` tag must specify the “class” attribute which must be
 * <br>the type name of the widget. Optionally, the “parent” attribute may be
 * <br>specified to specify the direct parent type of the widget type, this is
 * <br>ignored by `GtkBuilder` but required for UI design tools like
 * <br>[Glade](https://glade.gnome.org/) to introspect what kind of properties and
 * <br>internal children exist for a given type when the actual type does not exist.
 * <br>
 * <br>The XML which is contained inside the `&lt;template&gt;` tag behaves as if it were
 * <br>added to the `&lt;object&gt;` tag defining the widget itself. You may set properties
 * <br>on a widget by inserting `&lt;property&gt;` tags into the `&lt;template&gt;` tag, and also
 * <br>add `&lt;child&gt;` tags to add children and extend a widget in the normal way you
 * <br>would with `&lt;object&gt;` tags.
 * <br>
 * <br>Additionally, `&lt;object&gt;` tags can also be added before and after the initial
 * <br>`&lt;template&gt;` tag in the normal way, allowing one to define auxiliary objects
 * <br>which might be referenced by other widgets declared as children of the
 * <br>`&lt;template&gt;` tag.
 * <br>
 * <br>An example of a template definition:
 * <br>
 * <br>```xml
 * <br>&lt;interface&gt;
 * <br>  &lt;template class=&quot;FooWidget&quot; parent=&quot;GtkBox&quot;&gt;
 * <br>    &lt;property name=&quot;orientation&quot;&gt;horizontal&lt;/property&gt;
 * <br>    &lt;property name=&quot;spacing&quot;&gt;4&lt;/property&gt;
 * <br>    &lt;child&gt;
 * <br>      &lt;object class=&quot;GtkButton&quot; id=&quot;hello_button&quot;&gt;
 * <br>        &lt;property name=&quot;label&quot;&gt;Hello World&lt;/property&gt;
 * <br>        &lt;signal name=&quot;clicked&quot; handler=&quot;hello_button_clicked&quot; object=&quot;FooWidget&quot; swapped=&quot;yes&quot;/&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>    &lt;child&gt;
 * <br>      &lt;object class=&quot;GtkButton&quot; id=&quot;goodbye_button&quot;&gt;
 * <br>        &lt;property name=&quot;label&quot;&gt;Goodbye World&lt;/property&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>  &lt;/template&gt;
 * <br>&lt;/interface&gt;
 * <br>```
 * <br>
 * <br>Typically, you'll place the template fragment into a file that is
 * <br>bundled with your project, using `GResource`. In order to load the
 * <br>template, you need to call [method&#64;Gtk.WidgetClass.set_template_from_resource]
 * <br>from the class initialization of your `GtkWidget` type:
 * <br>
 * <br>```c
 * <br>static void
 * <br>foo_widget_class_init (FooWidgetClass *klass)
 * <br>{
 * <br>  // ...
 * <br>
 * <br>  gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 * <br>                                               &quot;/com/example/ui/foowidget.ui&quot;);
 * <br>}
 * <br>```
 * <br>
 * <br>You will also need to call [method&#64;Gtk.Widget.init_template] from the
 * <br>instance initialization function:
 * <br>
 * <br>```c
 * <br>static void
 * <br>foo_widget_init (FooWidget *self)
 * <br>{
 * <br>  gtk_widget_init_template (GTK_WIDGET (self));
 * <br>
 * <br>  // Initialize the rest of the widget...
 * <br>}
 * <br>```
 * <br>
 * <br>as well as calling [method&#64;Gtk.Widget.dispose_template] from the dispose
 * <br>function:
 * <br>
 * <br>```c
 * <br>static void
 * <br>foo_widget_dispose (GObject *gobject)
 * <br>{
 * <br>  FooWidget *self = FOO_WIDGET (gobject);
 * <br>
 * <br>  // Dispose objects for which you have a reference...
 * <br>
 * <br>  // Clear the template children for this widget type
 * <br>  gtk_widget_dispose_template (GTK_WIDGET (self), FOO_TYPE_WIDGET);
 * <br>
 * <br>  G_OBJECT_CLASS (foo_widget_parent_class)-&gt;dispose (gobject);
 * <br>}
 * <br>```
 * <br>
 * <br>You can access widgets defined in the template using the
 * <br>[id&#64;gtk_widget_get_template_child] function, but you will typically declare
 * <br>a pointer in the instance private data structure of your type using the same
 * <br>name as the widget in the template definition, and call
 * <br>[method&#64;Gtk.WidgetClass.bind_template_child_full] (or one of its wrapper macros
 * <br>[func&#64;Gtk.widget_class_bind_template_child] and [func&#64;Gtk.widget_class_bind_template_child_private])
 * <br>with that name, e.g.
 * <br>
 * <br>```c
 * <br>typedef struct {
 * <br>  GtkWidget *hello_button;
 * <br>  GtkWidget *goodbye_button;
 * <br>} FooWidgetPrivate;
 * <br>
 * <br>G_DEFINE_TYPE_WITH_PRIVATE (FooWidget, foo_widget, GTK_TYPE_BOX)
 * <br>
 * <br>static void
 * <br>foo_widget_dispose (GObject *gobject)
 * <br>{
 * <br>  gtk_widget_dispose_template (GTK_WIDGET (gobject), FOO_TYPE_WIDGET);
 * <br>
 * <br>  G_OBJECT_CLASS (foo_widget_parent_class)-&gt;dispose (gobject);
 * <br>}
 * <br>
 * <br>static void
 * <br>foo_widget_class_init (FooWidgetClass *klass)
 * <br>{
 * <br>  // ...
 * <br>  G_OBJECT_CLASS (klass)-&gt;dispose = foo_widget_dispose;
 * <br>
 * <br>  gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 * <br>                                               &quot;/com/example/ui/foowidget.ui&quot;);
 * <br>  gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 * <br>                                                FooWidget, hello_button);
 * <br>  gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 * <br>                                                FooWidget, goodbye_button);
 * <br>}
 * <br>
 * <br>static void
 * <br>foo_widget_init (FooWidget *widget)
 * <br>{
 * <br>  gtk_widget_init_template (GTK_WIDGET (widget));
 * <br>}
 * <br>```
 * <br>
 * <br>You can also use [method&#64;Gtk.WidgetClass.bind_template_callback_full] (or
 * <br>is wrapper macro [func&#64;Gtk.widget_class_bind_template_callback]) to connect
 * <br>a signal callback defined in the template with a function visible in the
 * <br>scope of the class, e.g.
 * <br>
 * <br>```c
 * <br>// the signal handler has the instance and user data swapped
 * <br>// because of the swapped=&quot;yes&quot; attribute in the template XML
 * <br>static void
 * <br>hello_button_clicked (FooWidget *self,
 * <br>                      GtkButton *button)
 * <br>{
 * <br>  g_print (&quot;Hello, world!&#92;n&quot;);
 * <br>}
 * <br>
 * <br>static void
 * <br>foo_widget_class_init (FooWidgetClass *klass)
 * <br>{
 * <br>  // ...
 * <br>  gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 * <br>                                               &quot;/com/example/ui/foowidget.ui&quot;);
 * <br>  gtk_widget_class_bind_template_callback (GTK_WIDGET_CLASS (klass), hello_button_clicked);
 * <br>}
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.Widget.html">https://docs.gtk.org/gtk4/class.Widget.html</a></p>
*/
public class Widget extends ch.bailu.gtk.gobject.InitiallyUnowned {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Widget.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTickCallback {
        /**
         * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
         * @param widget the widget
         * @param frame_clock the frame clock for the widget (same as calling gtk_widget_get_frame_clock())
         * @param user_data user data passed to gtk_widget_add_tick_callback().
         * @return %G_SOURCE_CONTINUE if the tick callback should continue to be called,  %G_SOURCE_REMOVE if the tick callback should be removed.
        */
        boolean onTickCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.FrameClock frame_clock, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaWidget.OnTickCallback toOnTickCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnTickCallback in) {
        JnaWidget.OnTickCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _frame_clock, _user_data) -> in.onTickCallback(__callback, new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.gdk.FrameClock(new PointerContainer(_frame_clock)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaWidget.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaWidget.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroy {
        /**
         * Signals that all holders of a reference to the widget should release
         * <br>the reference that they hold.
         * <br>
         * <br>May result in finalization of the widget if all references are released.
         * <br>
         * <br>This signal is not suitable for saving widget state.
        */
        void onDestroy();
    }
    
    private static com.sun.jna.Callback toOnDestroy(OnDestroy in) {
        return (in == null) ? null: (JnaWidget.OnDestroy) (__self, __data) -> in.onDestroy();
    }

    @FunctionalInterface
    public interface OnDirectionChanged {
        /**
         * Emitted when the text direction of a widget changes.
         * @param previous_direction the previous text direction of &#64;widget
        */
        void onDirectionChanged(int previous_direction);
    }
    
    private static com.sun.jna.Callback toOnDirectionChanged(OnDirectionChanged in) {
        return (in == null) ? null: (JnaWidget.OnDirectionChanged) (__self, _previous_direction, __data) -> in.onDirectionChanged(_previous_direction);
    }

    @FunctionalInterface
    public interface OnHide {
        /**
         * Emitted when &#64;widget is hidden.
        */
        void onHide();
    }
    
    private static com.sun.jna.Callback toOnHide(OnHide in) {
        return (in == null) ? null: (JnaWidget.OnHide) (__self, __data) -> in.onHide();
    }

    @FunctionalInterface
    public interface OnKeynavFailed {
        /**
         * Emitted if keyboard navigation fails.
         * <br>
         * <br>See [method&#64;Gtk.Widget.keynav_failed] for details.
         * @param direction the direction of movement
         * @return %TRUE if stopping keyboard navigation is fine, %FALSE   if the emitting widget should try to handle the keyboard   navigation attempt in its parent widget(s).
        */
        boolean onKeynavFailed(int direction);
    }
    
    private static com.sun.jna.Callback toOnKeynavFailed(OnKeynavFailed in) {
        return (in == null) ? null: (JnaWidget.OnKeynavFailed) (__self, _direction, __data) -> in.onKeynavFailed(_direction);
    }

    @FunctionalInterface
    public interface OnMap {
        /**
         * Emitted when &#64;widget is going to be mapped.
         * <br>
         * <br>A widget is mapped when the widget is visible (which is controlled with
         * <br>[property&#64;Gtk.Widget:visible]) and all its parents up to the toplevel widget
         * <br>are also visible.
         * <br>
         * <br>The ::map signal can be used to determine whether a widget will be drawn,
         * <br>for instance it can resume an animation that was stopped during the
         * <br>emission of [signal&#64;Gtk.Widget::unmap].
        */
        void onMap();
    }
    
    private static com.sun.jna.Callback toOnMap(OnMap in) {
        return (in == null) ? null: (JnaWidget.OnMap) (__self, __data) -> in.onMap();
    }

    @FunctionalInterface
    public interface OnMnemonicActivate {
        /**
         * Emitted when a widget is activated via a mnemonic.
         * <br>
         * <br>The default handler for this signal activates &#64;widget if &#64;group_cycling
         * <br>is %FALSE, or just makes &#64;widget grab focus if &#64;group_cycling is %TRUE.
         * @param group_cycling %TRUE if there are other widgets with the same mnemonic
         * @return %TRUE to stop other handlers from being invoked for the event. %FALSE to propagate the event further.
        */
        boolean onMnemonicActivate(boolean group_cycling);
    }
    
    private static com.sun.jna.Callback toOnMnemonicActivate(OnMnemonicActivate in) {
        return (in == null) ? null: (JnaWidget.OnMnemonicActivate) (__self, _group_cycling, __data) -> in.onMnemonicActivate(_group_cycling);
    }

    @FunctionalInterface
    public interface OnMoveFocus {
        /**
         * Emitted when the focus is moved.
         * @param direction the direction of the focus move
        */
        void onMoveFocus(int direction);
    }
    
    private static com.sun.jna.Callback toOnMoveFocus(OnMoveFocus in) {
        return (in == null) ? null: (JnaWidget.OnMoveFocus) (__self, _direction, __data) -> in.onMoveFocus(_direction);
    }

    @FunctionalInterface
    public interface OnQueryTooltip {
        /**
         * Emitted when the widgets tooltip is about to be shown.
         * <br>
         * <br>This happens when the [property&#64;Gtk.Widget:has-tooltip] property
         * <br>is %TRUE and the hover timeout has expired with the cursor hovering
         * <br>&quot;above&quot; &#64;widget; or emitted when &#64;widget got focus in keyboard mode.
         * <br>
         * <br>Using the given coordinates, the signal handler should determine
         * <br>whether a tooltip should be shown for &#64;widget. If this is the case
         * <br>%TRUE should be returned, %FALSE otherwise.  Note that if
         * <br>&#64;keyboard_mode is %TRUE, the values of &#64;x and &#64;y are undefined and
         * <br>should not be used.
         * <br>
         * <br>The signal handler is free to manipulate &#64;tooltip with the therefore
         * <br>destined function calls.
         * @param x the x coordinate of the cursor position where the request has   been emitted, relative to &#64;widget's left side
         * @param y the y coordinate of the cursor position where the request has   been emitted, relative to &#64;widget's top
         * @param keyboard_mode %TRUE if the tooltip was triggered using the keyboard
         * @param tooltip a `GtkTooltip`
         * @return %TRUE if &#64;tooltip should be shown right now, %FALSE otherwise.
        */
        boolean onQueryTooltip(int x, int y, boolean keyboard_mode, @Nonnull Tooltip tooltip);
    }
    
    private static com.sun.jna.Callback toOnQueryTooltip(OnQueryTooltip in) {
        return (in == null) ? null: (JnaWidget.OnQueryTooltip) (__self, _x, _y, _keyboard_mode, _tooltip, __data) -> in.onQueryTooltip(_x, _y, _keyboard_mode, new Tooltip(new PointerContainer(_tooltip)));
    }

    @FunctionalInterface
    public interface OnRealize {
        /**
         * Emitted when &#64;widget is associated with a `GdkSurface`.
         * <br>
         * <br>This means that [method&#64;Gtk.Widget.realize] has been called
         * <br>or the widget has been mapped (that is, it is going to be drawn).
        */
        void onRealize();
    }
    
    private static com.sun.jna.Callback toOnRealize(OnRealize in) {
        return (in == null) ? null: (JnaWidget.OnRealize) (__self, __data) -> in.onRealize();
    }

    @FunctionalInterface
    public interface OnShow {
        /**
         * Emitted when &#64;widget is shown.
        */
        void onShow();
    }
    
    private static com.sun.jna.Callback toOnShow(OnShow in) {
        return (in == null) ? null: (JnaWidget.OnShow) (__self, __data) -> in.onShow();
    }

    @FunctionalInterface
    public interface OnStateFlagsChanged {
        /**
         * Emitted when the widget state changes.
         * <br>
         * <br>See [method&#64;Gtk.Widget.get_state_flags].
         * @param flags The previous state flags.
        */
        void onStateFlagsChanged(int flags);
    }
    
    private static com.sun.jna.Callback toOnStateFlagsChanged(OnStateFlagsChanged in) {
        return (in == null) ? null: (JnaWidget.OnStateFlagsChanged) (__self, _flags, __data) -> in.onStateFlagsChanged(_flags);
    }

    @FunctionalInterface
    public interface OnUnmap {
        /**
         * Emitted when &#64;widget is going to be unmapped.
         * <br>
         * <br>A widget is unmapped when either it or any of its parents up to the
         * <br>toplevel widget have been set as hidden.
         * <br>
         * <br>As ::unmap indicates that a widget will not be shown any longer,
         * <br>it can be used to, for example, stop an animation on the widget.
        */
        void onUnmap();
    }
    
    private static com.sun.jna.Callback toOnUnmap(OnUnmap in) {
        return (in == null) ? null: (JnaWidget.OnUnmap) (__self, __data) -> in.onUnmap();
    }

    @FunctionalInterface
    public interface OnUnrealize {
        /**
         * Emitted when the `GdkSurface` associated with &#64;widget is destroyed.
         * <br>
         * <br>This means that [method&#64;Gtk.Widget.unrealize] has been called
         * <br>or the widget has been unmapped (that is, it is going to be hidden).
        */
        void onUnrealize();
    }
    
    private static com.sun.jna.Callback toOnUnrealize(OnUnrealize in) {
        return (in == null) ? null: (JnaWidget.OnUnrealize) (__self, __data) -> in.onUnrealize();
    }

    public Widget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Enable or disable an action installed with
     * <br>gtk_widget_class_install_action().
     * @param action_name action name, such as &quot;clipboard.paste&quot;
     * @param enabled whether the action is now enabled
    */
    public void actionSetEnabled(@Nonnull ch.bailu.gtk.type.Str action_name, boolean enabled)  {
        JnaWidget.INST().gtk_widget_action_set_enabled(asCPointer(), asCPointerNotNull(action_name), enabled);
    }

    /**
     * Enable or disable an action installed with
     * <br>gtk_widget_class_install_action().
     * @param action_name action name, such as &quot;clipboard.paste&quot;
     * @param enabled whether the action is now enabled
    */
    public void actionSetEnabled(String action_name, boolean enabled)  {
        JnaWidget.INST().gtk_widget_action_set_enabled(asCPointer(), action_name, enabled);
    }

    /**
     * For widgets that can be “activated” (buttons, menu items, etc.),
     * <br>this function activates them.
     * <br>
     * <br>The activation will emit the signal set using
     * <br>[method&#64;Gtk.WidgetClass.set_activate_signal] during class initialization.
     * <br>
     * <br>Activation is what happens when you press &lt;kbd&gt;Enter&lt;/kbd&gt;
     * <br>on a widget during key navigation.
     * <br>
     * <br>If you wish to handle the activation keybinding yourself, it is
     * <br>recommended to use [method&#64;Gtk.WidgetClass.add_shortcut] with an action
     * <br>created with [ctor&#64;Gtk.SignalAction.new].
     * <br>
     * <br>If &#64;widget isn't activatable, the function returns %FALSE.
     * @return %TRUE if the widget was activatable
    */
    public boolean activate()  {
        return JnaWidget.INST().gtk_widget_activate(asCPointer());
    }

    /**
     * Looks up the action in the action groups associated
     * <br>with &#64;widget and its ancestors, and activates it.
     * <br>
     * <br>This is a wrapper around [method&#64;Gtk.Widget.activate_action_variant]
     * <br>that constructs the &#64;args variant according to &#64;format_string.
     * @param name the name of the action to activate
     * @param format_string GVariant format string for arguments or %NULL   for no arguments
     * @param _elipse arguments, as given by format string
     * @return %TRUE if the action was activated, %FALSE if the action   does not exist
    */
    public boolean activateAction(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaWidget.INST().gtk_widget_activate_action(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Looks up the action in the action groups associated
     * <br>with &#64;widget and its ancestors, and activates it.
     * <br>
     * <br>This is a wrapper around [method&#64;Gtk.Widget.activate_action_variant]
     * <br>that constructs the &#64;args variant according to &#64;format_string.
     * @param name the name of the action to activate
     * @param format_string GVariant format string for arguments or %NULL   for no arguments
     * @param _elipse arguments, as given by format string
     * @return %TRUE if the action was activated, %FALSE if the action   does not exist
    */
    public boolean activateAction(String name, String format_string, java.lang.Object... _elipse)  {
        return JnaWidget.INST().gtk_widget_activate_action(asCPointer(), name, format_string, _elipse);
    }

    /**
     * Looks up the action in the action groups associated with
     * <br>&#64;widget and its ancestors, and activates it.
     * <br>
     * <br>If the action is in an action group added with
     * <br>[method&#64;Gtk.Widget.insert_action_group], the &#64;name is expected
     * <br>to be prefixed with the prefix that was used when the group was
     * <br>inserted.
     * <br>
     * <br>The arguments must match the actions expected parameter type,
     * <br>as returned by `g_action_get_parameter_type()`.
     * @param name the name of the action to activate
     * @param args parameters to use
     * @return %TRUE if the action was activated, %FALSE if the   action does not exist.
    */
    public boolean activateActionVariant(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.glib.Variant args)  {
        return JnaWidget.INST().gtk_widget_activate_action_variant(asCPointer(), asCPointerNotNull(name), asCPointer(args));
    }

    /**
     * Looks up the action in the action groups associated with
     * <br>&#64;widget and its ancestors, and activates it.
     * <br>
     * <br>If the action is in an action group added with
     * <br>[method&#64;Gtk.Widget.insert_action_group], the &#64;name is expected
     * <br>to be prefixed with the prefix that was used when the group was
     * <br>inserted.
     * <br>
     * <br>The arguments must match the actions expected parameter type,
     * <br>as returned by `g_action_get_parameter_type()`.
     * @param name the name of the action to activate
     * @param args parameters to use
     * @return %TRUE if the action was activated, %FALSE if the   action does not exist.
    */
    public boolean activateActionVariant(String name, @Nullable ch.bailu.gtk.glib.Variant args)  {
        return JnaWidget.INST().gtk_widget_activate_action_variant(asCPointer(), name, asCPointer(args));
    }

    /**
     * Activates the `default.activate` action from &#64;widget.
    */
    public void activateDefault()  {
        JnaWidget.INST().gtk_widget_activate_default(asCPointer());
    }

    /**
     * Adds &#64;controller to &#64;widget so that it will receive events.
     * <br>
     * <br>You will usually want to call this function right after
     * <br>creating any kind of [class&#64;Gtk.EventController].
     * @param controller a `GtkEventController` that hasn't been   added to a widget yet
    */
    public void addController(@Nonnull EventController controller)  {
        JnaWidget.INST().gtk_widget_add_controller(asCPointer(), asCPointerNotNull(controller));
    }

    /**
     * Adds a style class to &#64;widget.
     * <br>
     * <br>After calling this function, the widgets style will match
     * <br>for &#64;css_class, according to CSS matching rules.
     * <br>
     * <br>Use [method&#64;Gtk.Widget.remove_css_class] to remove the
     * <br>style again.
     * @param css_class The style class to add to &#64;widget, without   the leading '.' used for notation of style classes
    */
    public void addCssClass(@Nonnull ch.bailu.gtk.type.Str css_class)  {
        JnaWidget.INST().gtk_widget_add_css_class(asCPointer(), asCPointerNotNull(css_class));
    }

    /**
     * Adds a style class to &#64;widget.
     * <br>
     * <br>After calling this function, the widgets style will match
     * <br>for &#64;css_class, according to CSS matching rules.
     * <br>
     * <br>Use [method&#64;Gtk.Widget.remove_css_class] to remove the
     * <br>style again.
     * @param css_class The style class to add to &#64;widget, without   the leading '.' used for notation of style classes
    */
    public void addCssClass(String css_class)  {
        JnaWidget.INST().gtk_widget_add_css_class(asCPointer(), css_class);
    }

    /**
     * Adds a widget to the list of mnemonic labels for this widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.list_mnemonic_labels]. Note the
     * <br>list of mnemonic labels for the widget is cleared when the
     * <br>widget is destroyed, so the caller must make sure to update
     * <br>its internal state at this point as well.
     * @param label a `GtkWidget` that acts as a mnemonic label for &#64;widget
    */
    public void addMnemonicLabel(@Nonnull Widget label)  {
        JnaWidget.INST().gtk_widget_add_mnemonic_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Queues an animation frame update and adds a callback to be called
     * <br>before each frame.
     * <br>
     * <br>Until the tick callback is removed, it will be called frequently
     * <br>(usually at the frame rate of the output device or as quickly as
     * <br>the application can be repainted, whichever is slower). For this
     * <br>reason, is most suitable for handling graphics that change every
     * <br>frame or every few frames. The tick callback does not automatically
     * <br>imply a relayout or repaint. If you want a repaint or relayout, and
     * <br>aren’t changing widget properties that would trigger that (for example,
     * <br>changing the text of a `GtkLabel`), then you will have to call
     * <br>[method&#64;Gtk.Widget.queue_resize] or [method&#64;Gtk.Widget.queue_draw]
     * <br>yourself.
     * <br>
     * <br>[method&#64;Gdk.FrameClock.get_frame_time] should generally be used
     * <br>for timing continuous animations and
     * <br>[method&#64;Gdk.FrameTimings.get_predicted_presentation_time] if you are
     * <br>trying to display isolated frames at particular times.
     * <br>
     * <br>This is a more convenient alternative to connecting directly to the
     * <br>[signal&#64;Gdk.FrameClock::update] signal of `GdkFrameClock`, since you
     * <br>don't have to worry about when a `GdkFrameClock` is assigned to a widget.
     * @param callback function to call for updating animations
     * @param user_data data to pass to &#64;callback
     * @param notify function to call to free &#64;user_data when the callback is removed.
     * @return an id for the connection of this callback. Remove the callback   by passing the id returned from this function to   [method&#64;Gtk.Widget.remove_tick_callback]
    */
    public int addTickCallback(OnTickCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return JnaWidget.INST().gtk_widget_add_tick_callback(asCPointer(), toOnTickCallback(this, "addTickCallback", callback), asCPointer(user_data), toOnDestroyNotify(this, "addTickCallback", notify));
    }

    /**
     * This function is only used by `GtkWidget` subclasses, to
     * <br>assign a size, position and (optionally) baseline to their
     * <br>child widgets.
     * <br>
     * <br>In this function, the allocation and baseline may be adjusted.
     * <br>The given allocation will be forced to be bigger than the
     * <br>widget's minimum size, as well as at least 0×0 in size.
     * <br>
     * <br>For a version that does not take a transform, see
     * <br>[method&#64;Gtk.Widget.size_allocate].
     * @param width New width of &#64;widget
     * @param height New height of &#64;widget
     * @param baseline New baseline of &#64;widget, or -1
     * @param transform Transformation to be applied to &#64;widget
    */
    public void allocate(int width, int height, int baseline, @Nullable ch.bailu.gtk.gsk.Transform transform)  {
        JnaWidget.INST().gtk_widget_allocate(asCPointer(), width, height, baseline, asCPointer(transform));
    }

    /**
     * Called by widgets as the user moves around the window using
     * <br>keyboard shortcuts.
     * <br>
     * <br>The &#64;direction argument indicates what kind of motion is taking place (up,
     * <br>down, left, right, tab forward, tab backward).
     * <br>
     * <br>This function calls the [vfunc&#64;Gtk.Widget.focus] virtual function; widgets
     * <br>can override the virtual function in order to implement appropriate focus
     * <br>behavior.
     * <br>
     * <br>The default `focus()` virtual function for a widget should return `TRUE` if
     * <br>moving in &#64;direction left the focus on a focusable location inside that
     * <br>widget, and `FALSE` if moving in &#64;direction moved the focus outside the
     * <br>widget. When returning `TRUE`, widgets normally call [method&#64;Gtk.Widget.grab_focus]
     * <br>to place the focus accordingly; when returning `FALSE`, they don’t modify
     * <br>the current focus location.
     * <br>
     * <br>This function is used by custom widget implementations; if you're
     * <br>writing an app, you’d use [method&#64;Gtk.Widget.grab_focus] to move
     * <br>the focus to a particular widget.
     * @param direction direction of focus movement
     * @return %TRUE if focus ended up inside &#64;widget
    */
    public boolean childFocus(int direction)  {
        return JnaWidget.INST().gtk_widget_child_focus(asCPointer(), direction);
    }

    /**
     * Computes the bounds for &#64;widget in the coordinate space of &#64;target.
     * <br>
     * <br>FIXME: Explain what &quot;bounds&quot; are.
     * <br>
     * <br>If the operation is successful, %TRUE is returned. If &#64;widget has no
     * <br>bounds or the bounds cannot be expressed in &#64;target's coordinate space
     * <br>(for example if both widgets are in different windows), %FALSE is
     * <br>returned and &#64;bounds is set to the zero rectangle.
     * <br>
     * <br>It is valid for &#64;widget and &#64;target to be the same widget.
     * @param target the `GtkWidget`
     * @param out_bounds the rectangle taking the bounds
     * @return %TRUE if the bounds could be computed
    */
    public boolean computeBounds(@Nonnull Widget target, @Nonnull ch.bailu.gtk.graphene.Rect out_bounds)  {
        return JnaWidget.INST().gtk_widget_compute_bounds(asCPointer(), asCPointerNotNull(target), asCPointerNotNull(out_bounds));
    }

    /**
     * Computes whether a container should give this widget
     * <br>extra space when possible.
     * <br>
     * <br>Containers should check this, rather than looking at
     * <br>[method&#64;Gtk.Widget.get_hexpand] or [method&#64;Gtk.Widget.get_vexpand].
     * <br>
     * <br>This function already checks whether the widget is visible, so
     * <br>visibility does not need to be checked separately. Non-visible
     * <br>widgets are not expanded.
     * <br>
     * <br>The computed expand value uses either the expand setting explicitly
     * <br>set on the widget itself, or, if none has been explicitly set,
     * <br>the widget may expand if some of its children do.
     * @param orientation expand direction
     * @return whether widget tree rooted here should be expanded
    */
    public boolean computeExpand(int orientation)  {
        return JnaWidget.INST().gtk_widget_compute_expand(asCPointer(), orientation);
    }

    /**
     * Translates the given &#64;point in &#64;widget's coordinates to coordinates
     * <br>relative to &#64;target’s coordinate system.
     * <br>
     * <br>In order to perform this operation, both widgets must share a
     * <br>common ancestor.
     * @param target the `GtkWidget` to transform into
     * @param point a point in &#64;widget's coordinate system
     * @param out_point Set to the corresponding coordinates in   &#64;target's coordinate system
     * @return %TRUE if the point could be determined, %FALSE on failure.   In this case, 0 is stored in &#64;out_point.
    */
    public boolean computePoint(@Nonnull Widget target, @Nonnull ch.bailu.gtk.graphene.Point point, @Nonnull ch.bailu.gtk.graphene.Point out_point)  {
        return JnaWidget.INST().gtk_widget_compute_point(asCPointer(), asCPointerNotNull(target), asCPointerNotNull(point), asCPointerNotNull(out_point));
    }

    /**
     * Computes a matrix suitable to describe a transformation from
     * <br>&#64;widget's coordinate system into &#64;target's coordinate system.
     * <br>
     * <br>The transform can not be computed in certain cases, for example
     * <br>when &#64;widget and &#64;target do not share a common ancestor. In that
     * <br>case &#64;out_transform gets set to the identity matrix.
     * @param target the target widget that the matrix will transform to
     * @param out_transform location to   store the final transformation
     * @return %TRUE if the transform could be computed, %FALSE otherwise
    */
    public boolean computeTransform(@Nonnull Widget target, @Nonnull ch.bailu.gtk.graphene.Matrix out_transform)  {
        return JnaWidget.INST().gtk_widget_compute_transform(asCPointer(), asCPointerNotNull(target), asCPointerNotNull(out_transform));
    }

    /**
     * Tests if the point at (&#64;x, &#64;y) is contained in &#64;widget.
     * <br>
     * <br>The coordinates for (&#64;x, &#64;y) must be in widget coordinates, so
     * <br>(0, 0) is assumed to be the top left of &#64;widget's content area.
     * @param x X coordinate to test, relative to &#64;widget's origin
     * @param y Y coordinate to test, relative to &#64;widget's origin
     * @return %TRUE if &#64;widget contains (&#64;x, &#64;y).
    */
    public boolean contains(double x, double y)  {
        return JnaWidget.INST().gtk_widget_contains(asCPointer(), x, y);
    }

    /**
     * Creates a new `PangoContext` with the appropriate font map,
     * <br>font options, font description, and base direction for drawing
     * <br>text for this widget.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.get_pango_context].
     * @return the new `PangoContext`
    */
    public ch.bailu.gtk.pango.Context createPangoContext()  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaWidget.INST().gtk_widget_create_pango_context(asCPointer())));
    }

    /**
     * Creates a new `PangoLayout` with the appropriate font map,
     * <br>font description, and base direction for drawing text for
     * <br>this widget.
     * <br>
     * <br>If you keep a `PangoLayout` created in this way around,
     * <br>you need to re-create it when the widget `PangoContext`
     * <br>is replaced. This can be tracked by listening to changes
     * <br>of the [property&#64;Gtk.Widget:root] property on the widget.
     * @param text text to set on the layout
     * @return the new `PangoLayout`
    */
    public ch.bailu.gtk.pango.Layout createPangoLayout(@Nullable ch.bailu.gtk.type.Str text)  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaWidget.INST().gtk_widget_create_pango_layout(asCPointer(), asCPointer(text))));
    }

    /**
     * Creates a new `PangoLayout` with the appropriate font map,
     * <br>font description, and base direction for drawing text for
     * <br>this widget.
     * <br>
     * <br>If you keep a `PangoLayout` created in this way around,
     * <br>you need to re-create it when the widget `PangoContext`
     * <br>is replaced. This can be tracked by listening to changes
     * <br>of the [property&#64;Gtk.Widget:root] property on the widget.
     * @param text text to set on the layout
     * @return the new `PangoLayout`
    */
    public ch.bailu.gtk.pango.Layout createPangoLayout(String text)  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaWidget.INST().gtk_widget_create_pango_layout(asCPointer(), text)));
    }

    /**
     * Clears the template children for the given widget.
     * <br>
     * <br>This function is the opposite of [method&#64;Gtk.Widget.init_template], and
     * <br>it is used to clear all the template children from a widget instance.
     * <br>If you bound a template child to a field in the instance structure, or
     * <br>in the instance private data structure, the field will be set to `NULL`
     * <br>after this function returns.
     * <br>
     * <br>You should call this function inside the `GObjectClass.dispose()`
     * <br>implementation of any widget that called `gtk_widget_init_template()`.
     * <br>Typically, you will want to call this function last, right before
     * <br>chaining up to the parent type's dispose implementation, e.g.
     * <br>
     * <br>```c
     * <br>static void
     * <br>some_widget_dispose (GObject *gobject)
     * <br>{
     * <br>  SomeWidget *self = SOME_WIDGET (gobject);
     * <br>
     * <br>  // Clear the template data for SomeWidget
     * <br>  gtk_widget_dispose_template (GTK_WIDGET (self), SOME_TYPE_WIDGET);
     * <br>
     * <br>  G_OBJECT_CLASS (some_widget_parent_class)-&gt;dispose (gobject);
     * <br>}
     * <br>```
     * @param widget_type the type of the widget to finalize the template for
    */
    public void disposeTemplate(long widget_type)  {
        JnaWidget.INST().gtk_widget_dispose_template(asCPointer(), widget_type);
    }

    /**
     * Checks to see if a drag movement has passed the GTK drag threshold.
     * @param start_x X coordinate of start of drag
     * @param start_y Y coordinate of start of drag
     * @param current_x current X coordinate
     * @param current_y current Y coordinate
     * @return %TRUE if the drag threshold has been passed.
    */
    public boolean dragCheckThreshold(int start_x, int start_y, int current_x, int current_y)  {
        return JnaWidget.INST().gtk_drag_check_threshold(asCPointer(), start_x, start_y, current_x, current_y);
    }

    /**
     * Notifies the user about an input-related error on this widget.
     * <br>
     * <br>If the [property&#64;Gtk.Settings:gtk-error-bell] setting is %TRUE,
     * <br>it calls [method&#64;Gdk.Surface.beep], otherwise it does nothing.
     * <br>
     * <br>Note that the effect of [method&#64;Gdk.Surface.beep] can be configured
     * <br>in many ways, depending on the windowing backend and the desktop
     * <br>environment or window manager that is used.
    */
    public void errorBell()  {
        JnaWidget.INST().gtk_widget_error_bell(asCPointer());
    }

    /**
     * Returns the baseline that has currently been allocated to &#64;widget.
     * <br>
     * <br>This function is intended to be used when implementing handlers
     * <br>for the `GtkWidget`Class.snapshot() function, and when allocating
     * <br>child widgets in `GtkWidget`Class.size_allocate().
     * @return the baseline of the &#64;widget, or -1 if none
    */
    public int getAllocatedBaseline()  {
        return JnaWidget.INST().gtk_widget_get_allocated_baseline(asCPointer());
    }

    /**
     * Returns the height that has currently been allocated to &#64;widget.
     * @return the height of the &#64;widget
    */
    public int getAllocatedHeight()  {
        return JnaWidget.INST().gtk_widget_get_allocated_height(asCPointer());
    }

    /**
     * Returns the width that has currently been allocated to &#64;widget.
     * @return the width of the &#64;widget
    */
    public int getAllocatedWidth()  {
        return JnaWidget.INST().gtk_widget_get_allocated_width(asCPointer());
    }

    /**
     * Retrieves the widget’s allocation.
     * <br>
     * <br>Note, when implementing a layout container: a widget’s allocation
     * <br>will be its “adjusted” allocation, that is, the widget’s parent
     * <br>typically calls [method&#64;Gtk.Widget.size_allocate] with an allocation,
     * <br>and that allocation is then adjusted (to handle margin
     * <br>and alignment for example) before assignment to the widget.
     * <br>[method&#64;Gtk.Widget.get_allocation] returns the adjusted allocation that
     * <br>was actually assigned to the widget. The adjusted allocation is
     * <br>guaranteed to be completely contained within the
     * <br>[method&#64;Gtk.Widget.size_allocate] allocation, however.
     * <br>
     * <br>So a layout container is guaranteed that its children stay inside
     * <br>the assigned bounds, but not that they have exactly the bounds the
     * <br>container assigned.
     * @param allocation a pointer to a `GtkAllocation` to copy to
    */
    public void getAllocation(@Nonnull ch.bailu.gtk.gdk.Rectangle allocation)  {
        JnaWidget.INST().gtk_widget_get_allocation(asCPointer(), asCPointerNotNull(allocation));
    }

    /**
     * Gets the first ancestor of &#64;widget with type &#64;widget_type.
     * <br>
     * <br>For example, `gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)`
     * <br>gets the first `GtkBox` that’s an ancestor of &#64;widget. No
     * <br>reference will be added to the returned widget; it should
     * <br>not be unreferenced.
     * <br>
     * <br>Note that unlike [method&#64;Gtk.Widget.is_ancestor], this function
     * <br>considers &#64;widget to be an ancestor of itself.
     * @param widget_type ancestor type
     * @return the ancestor widget
    */
    public Widget getAncestor(long widget_type)  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_ancestor(asCPointer(), widget_type)));
    }

    /**
     * Determines whether the input focus can enter &#64;widget or any
     * <br>of its children.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_focusable].
     * @return %TRUE if the input focus can enter &#64;widget, %FALSE otherwise
    */
    public boolean getCanFocus()  {
        return JnaWidget.INST().gtk_widget_get_can_focus(asCPointer());
    }

    /**
     * Queries whether &#64;widget can be the target of pointer events.
     * @return %TRUE if &#64;widget can receive pointer events
    */
    public boolean getCanTarget()  {
        return JnaWidget.INST().gtk_widget_get_can_target(asCPointer());
    }

    /**
     * Gets the value set with gtk_widget_set_child_visible().
     * <br>
     * <br>If you feel a need to use this function, your code probably
     * <br>needs reorganization.
     * <br>
     * <br>This function is only useful for container implementations
     * <br>and should never be called by an application.
     * @return %TRUE if the widget is mapped with the parent.
    */
    public boolean getChildVisible()  {
        return JnaWidget.INST().gtk_widget_get_child_visible(asCPointer());
    }

    /**
     * Gets the clipboard object for &#64;widget.
     * <br>
     * <br>This is a utility function to get the clipboard object for the
     * <br>`GdkDisplay` that &#64;widget is using.
     * <br>
     * <br>Note that this function always works, even when &#64;widget is not
     * <br>realized yet.
     * @return the appropriate clipboard object
    */
    public ch.bailu.gtk.gdk.Clipboard getClipboard()  {
        return new ch.bailu.gtk.gdk.Clipboard(new PointerContainer(JnaWidget.INST().gtk_widget_get_clipboard(asCPointer())));
    }

    /**
     * Returns the list of style classes applied to &#64;widget.
     * @return a %NULL-terminated list of   css classes currently applied to &#64;widget. The returned   list must freed using g_strfreev().
    */
    public ch.bailu.gtk.type.Strs getCssClasses()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaWidget.INST().gtk_widget_get_css_classes(asCPointer())));
    }

    /**
     * Returns the CSS name that is used for &#64;self.
     * @return the CSS name
    */
    public ch.bailu.gtk.type.Str getCssName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWidget.INST().gtk_widget_get_css_name(asCPointer())));
    }

    /**
     * Queries the cursor set on &#64;widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_cursor] for details.
     * @return the cursor   currently in use or %NULL if the cursor is inherited
    */
    public ch.bailu.gtk.gdk.Cursor getCursor()  {
        return new ch.bailu.gtk.gdk.Cursor(new PointerContainer(JnaWidget.INST().gtk_widget_get_cursor(asCPointer())));
    }

    /**
     * Gets the reading direction for a particular widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_direction].
     * @return the reading direction for the widget.
    */
    public int getDirection()  {
        return JnaWidget.INST().gtk_widget_get_direction(asCPointer());
    }

    /**
     * Get the `GdkDisplay` for the toplevel window associated with
     * <br>this widget.
     * <br>
     * <br>This function can only be called after the widget has been
     * <br>added to a widget hierarchy with a `GtkWindow` at the top.
     * <br>
     * <br>In general, you should only create display specific
     * <br>resources when a widget has been realized, and you should
     * <br>free those resources when the widget is unrealized.
     * @return the `GdkDisplay` for the toplevel   for this widget.
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaWidget.INST().gtk_widget_get_display(asCPointer())));
    }

    /**
     * Returns the widgets first child.
     * <br>
     * <br>This API is primarily meant for widget implementations.
     * @return The widget's first child
    */
    public Widget getFirstChild()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_first_child(asCPointer())));
    }

    /**
     * Returns the current focus child of &#64;widget.
     * @return The current focus   child of &#64;widget
    */
    public Widget getFocusChild()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_focus_child(asCPointer())));
    }

    /**
     * Returns whether the widget should grab focus when it is clicked
     * <br>with the mouse.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_focus_on_click].
     * @return %TRUE if the widget should grab focus when it is   clicked with the mouse
    */
    public boolean getFocusOnClick()  {
        return JnaWidget.INST().gtk_widget_get_focus_on_click(asCPointer());
    }

    /**
     * Determines whether &#64;widget can own the input focus.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_focusable].
     * @return %TRUE if &#64;widget can own the input focus, %FALSE otherwise
    */
    public boolean getFocusable()  {
        return JnaWidget.INST().gtk_widget_get_focusable(asCPointer());
    }

    /**
     * Gets the font map of &#64;widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_font_map].
     * @return A `PangoFontMap`
    */
    public ch.bailu.gtk.pango.FontMap getFontMap()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaWidget.INST().gtk_widget_get_font_map(asCPointer())));
    }

    /**
     * Returns the `cairo_font_options_t` of widget.
     * <br>
     * <br>Seee [method&#64;Gtk.Widget.set_font_options].
     * @return the `cairo_font_options_t`   of widget
    */
    public ch.bailu.gtk.cairo.FontOptions getFontOptions()  {
        return new ch.bailu.gtk.cairo.FontOptions(new PointerContainer(JnaWidget.INST().gtk_widget_get_font_options(asCPointer())));
    }

    /**
     * Obtains the frame clock for a widget.
     * <br>
     * <br>The frame clock is a global “ticker” that can be used to drive
     * <br>animations and repaints. The most common reason to get the frame
     * <br>clock is to call [method&#64;Gdk.FrameClock.get_frame_time], in order
     * <br>to get a time to use for animating. For example you might record
     * <br>the start of the animation with an initial value from
     * <br>[method&#64;Gdk.FrameClock.get_frame_time], and then update the animation
     * <br>by calling [method&#64;Gdk.FrameClock.get_frame_time] again during each repaint.
     * <br>
     * <br>[method&#64;Gdk.FrameClock.request_phase] will result in a new frame on the
     * <br>clock, but won’t necessarily repaint any widgets. To repaint a
     * <br>widget, you have to use [method&#64;Gtk.Widget.queue_draw] which invalidates
     * <br>the widget (thus scheduling it to receive a draw on the next
     * <br>frame). gtk_widget_queue_draw() will also end up requesting a frame
     * <br>on the appropriate frame clock.
     * <br>
     * <br>A widget’s frame clock will not change while the widget is
     * <br>mapped. Reparenting a widget (which implies a temporary unmap) can
     * <br>change the widget’s frame clock.
     * <br>
     * <br>Unrealized widgets do not have a frame clock.
     * @return a `GdkFrameClock`
    */
    public ch.bailu.gtk.gdk.FrameClock getFrameClock()  {
        return new ch.bailu.gtk.gdk.FrameClock(new PointerContainer(JnaWidget.INST().gtk_widget_get_frame_clock(asCPointer())));
    }

    /**
     * Gets the horizontal alignment of &#64;widget.
     * <br>
     * <br>For backwards compatibility reasons this method will never return
     * <br>%GTK_ALIGN_BASELINE, but instead it will convert it to
     * <br>%GTK_ALIGN_FILL. Baselines are not supported for horizontal
     * <br>alignment.
     * @return the horizontal alignment of &#64;widget
    */
    public int getHalign()  {
        return JnaWidget.INST().gtk_widget_get_halign(asCPointer());
    }

    /**
     * Returns the current value of the `has-tooltip` property.
     * @return current value of `has-tooltip` on &#64;widget.
    */
    public boolean getHasTooltip()  {
        return JnaWidget.INST().gtk_widget_get_has_tooltip(asCPointer());
    }

    /**
     * Returns the content height of the widget.
     * <br>
     * <br>This function returns the height passed to its
     * <br>size-allocate implementation, which is the height you
     * <br>should be using in [vfunc&#64;Gtk.Widget.snapshot].
     * <br>
     * <br>For pointer events, see [method&#64;Gtk.Widget.contains].
     * @return The height of &#64;widget
    */
    public int getHeight()  {
        return JnaWidget.INST().gtk_widget_get_height(asCPointer());
    }

    /**
     * Gets whether the widget would like any available extra horizontal
     * <br>space.
     * <br>
     * <br>When a user resizes a `GtkWindow`, widgets with expand=TRUE
     * <br>generally receive the extra space. For example, a list or
     * <br>scrollable area or document in your window would often be set to
     * <br>expand.
     * <br>
     * <br>Containers should use [method&#64;Gtk.Widget.compute_expand] rather
     * <br>than this function, to see whether a widget, or any of its children,
     * <br>has the expand flag set. If any child of a widget wants to
     * <br>expand, the parent may ask to expand also.
     * <br>
     * <br>This function only looks at the widget’s own hexpand flag, rather
     * <br>than computing whether the entire widget tree rooted at this widget
     * <br>wants to expand.
     * @return whether hexpand flag is set
    */
    public boolean getHexpand()  {
        return JnaWidget.INST().gtk_widget_get_hexpand(asCPointer());
    }

    /**
     * Gets whether gtk_widget_set_hexpand() has been used
     * <br>to explicitly set the expand flag on this widget.
     * <br>
     * <br>If [property&#64;Gtk.Widget:hexpand] property is set, then it
     * <br>overrides any computed expand value based on child widgets.
     * <br>If `hexpand` is not set, then the expand value depends on
     * <br>whether any children of the widget would like to expand.
     * <br>
     * <br>There are few reasons to use this function, but it’s here
     * <br>for completeness and consistency.
     * @return whether hexpand has been explicitly set
    */
    public boolean getHexpandSet()  {
        return JnaWidget.INST().gtk_widget_get_hexpand_set(asCPointer());
    }

    /**
     * Returns the widgets last child.
     * <br>
     * <br>This API is primarily meant for widget implementations.
     * @return The widget's last child
    */
    public Widget getLastChild()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_last_child(asCPointer())));
    }

    /**
     * Retrieves the layout manager used by &#64;widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_layout_manager].
     * @return a `GtkLayoutManager`
    */
    public LayoutManager getLayoutManager()  {
        return new LayoutManager(new PointerContainer(JnaWidget.INST().gtk_widget_get_layout_manager(asCPointer())));
    }

    /**
     * Whether the widget is mapped.
     * @return %TRUE if the widget is mapped, %FALSE otherwise.
    */
    public boolean getMapped()  {
        return JnaWidget.INST().gtk_widget_get_mapped(asCPointer());
    }

    /**
     * Gets the bottom margin of &#64;widget.
     * @return The bottom margin of &#64;widget
    */
    public int getMarginBottom()  {
        return JnaWidget.INST().gtk_widget_get_margin_bottom(asCPointer());
    }

    /**
     * Gets the end margin of &#64;widget.
     * @return The end margin of &#64;widget
    */
    public int getMarginEnd()  {
        return JnaWidget.INST().gtk_widget_get_margin_end(asCPointer());
    }

    /**
     * Gets the start margin of &#64;widget.
     * @return The start margin of &#64;widget
    */
    public int getMarginStart()  {
        return JnaWidget.INST().gtk_widget_get_margin_start(asCPointer());
    }

    /**
     * Gets the top margin of &#64;widget.
     * @return The top margin of &#64;widget
    */
    public int getMarginTop()  {
        return JnaWidget.INST().gtk_widget_get_margin_top(asCPointer());
    }

    /**
     * Retrieves the name of a widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_name] for the significance of widget names.
     * @return name of the widget. This string is owned by GTK and   should not be modified or freed
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWidget.INST().gtk_widget_get_name(asCPointer())));
    }

    /**
     * Returns the nearest `GtkNative` ancestor of &#64;widget.
     * <br>
     * <br>This function will return %NULL if the widget is not
     * <br>contained inside a widget tree with a native ancestor.
     * <br>
     * <br>`GtkNative` widgets will return themselves here.
     * @return the `GtkNative` ancestor of &#64;widget
    */
    public Native getNative()  {
        return new Native(new PointerContainer(JnaWidget.INST().gtk_widget_get_native(asCPointer())));
    }

    /**
     * Returns the widgets next sibling.
     * <br>
     * <br>This API is primarily meant for widget implementations.
     * @return The widget's next sibling
    */
    public Widget getNextSibling()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_next_sibling(asCPointer())));
    }

    /**
     * &#35;Fetches the requested opacity for this widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_opacity].
     * @return the requested opacity for this widget.
    */
    public double getOpacity()  {
        return JnaWidget.INST().gtk_widget_get_opacity(asCPointer());
    }

    /**
     * Returns the widgets overflow value.
     * @return The widget's overflow.
    */
    public int getOverflow()  {
        return JnaWidget.INST().gtk_widget_get_overflow(asCPointer());
    }

    /**
     * Gets a `PangoContext` with the appropriate font map, font description,
     * <br>and base direction for this widget.
     * <br>
     * <br>Unlike the context returned by [method&#64;Gtk.Widget.create_pango_context],
     * <br>this context is owned by the widget (it can be used until the screen
     * <br>for the widget changes or the widget is removed from its toplevel),
     * <br>and will be updated to match any changes to the widget’s attributes.
     * <br>This can be tracked by listening to changes of the
     * <br>[property&#64;Gtk.Widget:root] property on the widget.
     * @return the `PangoContext` for the widget.
    */
    public ch.bailu.gtk.pango.Context getPangoContext()  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaWidget.INST().gtk_widget_get_pango_context(asCPointer())));
    }

    /**
     * Returns the parent widget of &#64;widget.
     * @return the parent widget of &#64;widget
    */
    public Widget getParent()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_parent(asCPointer())));
    }

    /**
     * Retrieves the minimum and natural size of a widget, taking
     * <br>into account the widget’s preference for height-for-width management.
     * <br>
     * <br>This is used to retrieve a suitable size by container widgets which do
     * <br>not impose any restrictions on the child placement. It can be used
     * <br>to deduce toplevel window and menu sizes as well as child widgets in
     * <br>free-form containers such as `GtkFixed`.
     * <br>
     * <br>Handle with care. Note that the natural height of a height-for-width
     * <br>widget will generally be a smaller size than the minimum height, since
     * <br>the required height for the natural width is generally smaller than the
     * <br>required height for the minimum width.
     * <br>
     * <br>Use [id&#64;gtk_widget_measure] if you want to support baseline alignment.
     * @param minimum_size location for storing the minimum size
     * @param natural_size location for storing the natural size
    */
    public void getPreferredSize(@Nullable Requisition minimum_size, @Nullable Requisition natural_size)  {
        JnaWidget.INST().gtk_widget_get_preferred_size(asCPointer(), asCPointer(minimum_size), asCPointer(natural_size));
    }

    /**
     * Returns the widgets previous sibling.
     * <br>
     * <br>This API is primarily meant for widget implementations.
     * @return The widget's previous sibling
    */
    public Widget getPrevSibling()  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_get_prev_sibling(asCPointer())));
    }

    /**
     * Gets the primary clipboard of &#64;widget.
     * <br>
     * <br>This is a utility function to get the primary clipboard object
     * <br>for the `GdkDisplay` that &#64;widget is using.
     * <br>
     * <br>Note that this function always works, even when &#64;widget is not
     * <br>realized yet.
     * @return the appropriate clipboard object
    */
    public ch.bailu.gtk.gdk.Clipboard getPrimaryClipboard()  {
        return new ch.bailu.gtk.gdk.Clipboard(new PointerContainer(JnaWidget.INST().gtk_widget_get_primary_clipboard(asCPointer())));
    }

    /**
     * Determines whether &#64;widget is realized.
     * @return %TRUE if &#64;widget is realized, %FALSE otherwise
    */
    public boolean getRealized()  {
        return JnaWidget.INST().gtk_widget_get_realized(asCPointer());
    }

    /**
     * Determines whether &#64;widget is always treated as the default widget
     * <br>within its toplevel when it has the focus, even if another widget
     * <br>is the default.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_receives_default].
     * @return %TRUE if &#64;widget acts as the default widget when focused,   %FALSE otherwise
    */
    public boolean getReceivesDefault()  {
        return JnaWidget.INST().gtk_widget_get_receives_default(asCPointer());
    }

    /**
     * Gets whether the widget prefers a height-for-width layout
     * <br>or a width-for-height layout.
     * <br>
     * <br>Single-child widgets generally propagate the preference of
     * <br>their child, more complex widgets need to request something
     * <br>either in context of their children or in context of their
     * <br>allocation capabilities.
     * @return The `GtkSizeRequestMode` preferred by &#64;widget.
    */
    public int getRequestMode()  {
        return JnaWidget.INST().gtk_widget_get_request_mode(asCPointer());
    }

    /**
     * Returns the `GtkRoot` widget of &#64;widget.
     * <br>
     * <br>This function will return %NULL if the widget is not contained
     * <br>inside a widget tree with a root widget.
     * <br>
     * <br>`GtkRoot` widgets will return themselves here.
     * @return the root widget of &#64;widget
    */
    public Root getRoot()  {
        return new Root(new PointerContainer(JnaWidget.INST().gtk_widget_get_root(asCPointer())));
    }

    /**
     * Retrieves the internal scale factor that maps from window
     * <br>coordinates to the actual device pixels.
     * <br>
     * <br>On traditional systems this is 1, on high density outputs,
     * <br>it can be a higher value (typically 2).
     * <br>
     * <br>See [method&#64;Gdk.Surface.get_scale_factor].
     * @return the scale factor for &#64;widget
    */
    public int getScaleFactor()  {
        return JnaWidget.INST().gtk_widget_get_scale_factor(asCPointer());
    }

    /**
     * Returns the widget’s sensitivity.
     * <br>
     * <br>This function returns the value that has been set using
     * <br>[method&#64;Gtk.Widget.set_sensitive]).
     * <br>
     * <br>The effective sensitivity of a widget is however determined
     * <br>by both its own and its parent widget’s sensitivity.
     * <br>See [method&#64;Gtk.Widget.is_sensitive].
     * @return %TRUE if the widget is sensitive
    */
    public boolean getSensitive()  {
        return JnaWidget.INST().gtk_widget_get_sensitive(asCPointer());
    }

    /**
     * Gets the settings object holding the settings used for this widget.
     * <br>
     * <br>Note that this function can only be called when the `GtkWidget`
     * <br>is attached to a toplevel, since the settings object is specific
     * <br>to a particular `GdkDisplay`. If you want to monitor the widget for
     * <br>changes in its settings, connect to the `notify::display` signal.
     * @return the relevant `GtkSettings` object
    */
    public Settings getSettings()  {
        return new Settings(new PointerContainer(JnaWidget.INST().gtk_widget_get_settings(asCPointer())));
    }

    /**
     * Returns the content width or height of the widget.
     * <br>
     * <br>Which dimension is returned depends on &#64;orientation.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.Widget.get_width]
     * <br>for %GTK_ORIENTATION_HORIZONTAL or [method&#64;Gtk.Widget.get_height]
     * <br>for %GTK_ORIENTATION_VERTICAL, but can be used when
     * <br>writing orientation-independent code, such as when
     * <br>implementing [iface&#64;Gtk.Orientable] widgets.
     * @param orientation the orientation to query
     * @return The size of &#64;widget in &#64;orientation.
    */
    public int getSize(int orientation)  {
        return JnaWidget.INST().gtk_widget_get_size(asCPointer(), orientation);
    }

    /**
     * Gets the size request that was explicitly set for the widget using
     * <br>gtk_widget_set_size_request().
     * <br>
     * <br>A value of -1 stored in &#64;width or &#64;height indicates that that
     * <br>dimension has not been set explicitly and the natural requisition
     * <br>of the widget will be used instead. See
     * <br>[method&#64;Gtk.Widget.set_size_request]. To get the size a widget will
     * <br>actually request, call [method&#64;Gtk.Widget.measure] instead of
     * <br>this function.
     * @param width return location for width
     * @param height return location for height
    */
    public void getSizeRequest(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaWidget.INST().gtk_widget_get_size_request(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Returns the widget state as a flag set.
     * <br>
     * <br>It is worth mentioning that the effective %GTK_STATE_FLAG_INSENSITIVE
     * <br>state will be returned, that is, also based on parent insensitivity,
     * <br>even if &#64;widget itself is sensitive.
     * <br>
     * <br>Also note that if you are looking for a way to obtain the
     * <br>[flags&#64;Gtk.StateFlags] to pass to a [class&#64;Gtk.StyleContext]
     * <br>method, you should look at [method&#64;Gtk.StyleContext.get_state].
     * @return The state flags for widget
    */
    public int getStateFlags()  {
        return JnaWidget.INST().gtk_widget_get_state_flags(asCPointer());
    }

    /**
     * Returns the style context associated to &#64;widget.
     * <br>
     * <br>The returned object is guaranteed to be the same
     * <br>for the lifetime of &#64;widget.
     * @return the widgets `GtkStyleContext`
    */
    public StyleContext getStyleContext()  {
        return new StyleContext(new PointerContainer(JnaWidget.INST().gtk_widget_get_style_context(asCPointer())));
    }

    /**
     * Fetch an object build from the template XML for &#64;widget_type in
     * <br>this &#64;widget instance.
     * <br>
     * <br>This will only report children which were previously declared
     * <br>with [method&#64;Gtk.WidgetClass.bind_template_child_full] or one of its
     * <br>variants.
     * <br>
     * <br>This function is only meant to be called for code which is private
     * <br>to the &#64;widget_type which declared the child and is meant for language
     * <br>bindings which cannot easily make use of the GObject structure offsets.
     * @param widget_type The `GType` to get a template child for
     * @param name The “id” of the child defined in the template XML
     * @return The object built in the template XML with   the id &#64;name
    */
    public ch.bailu.gtk.gobject.Object getTemplateChild(long widget_type, @Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaWidget.INST().gtk_widget_get_template_child(asCPointer(), widget_type, asCPointerNotNull(name))));
    }

    /**
     * Fetch an object build from the template XML for &#64;widget_type in
     * <br>this &#64;widget instance.
     * <br>
     * <br>This will only report children which were previously declared
     * <br>with [method&#64;Gtk.WidgetClass.bind_template_child_full] or one of its
     * <br>variants.
     * <br>
     * <br>This function is only meant to be called for code which is private
     * <br>to the &#64;widget_type which declared the child and is meant for language
     * <br>bindings which cannot easily make use of the GObject structure offsets.
     * @param widget_type The `GType` to get a template child for
     * @param name The “id” of the child defined in the template XML
     * @return The object built in the template XML with   the id &#64;name
    */
    public ch.bailu.gtk.gobject.Object getTemplateChild(long widget_type, String name)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaWidget.INST().gtk_widget_get_template_child(asCPointer(), widget_type, name)));
    }

    /**
     * Gets the contents of the tooltip for &#64;widget.
     * <br>
     * <br>If the tooltip has not been set using
     * <br>[method&#64;Gtk.Widget.set_tooltip_markup], this
     * <br>function returns %NULL.
     * @return the tooltip text
    */
    public ch.bailu.gtk.type.Str getTooltipMarkup()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWidget.INST().gtk_widget_get_tooltip_markup(asCPointer())));
    }

    /**
     * Gets the contents of the tooltip for &#64;widget.
     * <br>
     * <br>If the &#64;widget's tooltip was set using
     * <br>[method&#64;Gtk.Widget.set_tooltip_markup],
     * <br>this function will return the escaped text.
     * @return the tooltip text
    */
    public ch.bailu.gtk.type.Str getTooltipText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWidget.INST().gtk_widget_get_tooltip_text(asCPointer())));
    }

    /**
     * Gets the vertical alignment of &#64;widget.
     * @return the vertical alignment of &#64;widget
    */
    public int getValign()  {
        return JnaWidget.INST().gtk_widget_get_valign(asCPointer());
    }

    /**
     * Gets whether the widget would like any available extra vertical
     * <br>space.
     * <br>
     * <br>See [method&#64;Gtk.Widget.get_hexpand] for more detail.
     * @return whether vexpand flag is set
    */
    public boolean getVexpand()  {
        return JnaWidget.INST().gtk_widget_get_vexpand(asCPointer());
    }

    /**
     * Gets whether gtk_widget_set_vexpand() has been used to
     * <br>explicitly set the expand flag on this widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.get_hexpand_set] for more detail.
     * @return whether vexpand has been explicitly set
    */
    public boolean getVexpandSet()  {
        return JnaWidget.INST().gtk_widget_get_vexpand_set(asCPointer());
    }

    /**
     * Determines whether the widget is visible.
     * <br>
     * <br>If you want to take into account whether the widget’s
     * <br>parent is also marked as visible, use
     * <br>[method&#64;Gtk.Widget.is_visible] instead.
     * <br>
     * <br>This function does not check if the widget is
     * <br>obscured in any way.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_visible].
     * @return %TRUE if the widget is visible
    */
    public boolean getVisible()  {
        return JnaWidget.INST().gtk_widget_get_visible(asCPointer());
    }

    /**
     * Returns the content width of the widget.
     * <br>
     * <br>This function returns the width passed to its
     * <br>size-allocate implementation, which is the width you
     * <br>should be using in [vfunc&#64;Gtk.Widget.snapshot].
     * <br>
     * <br>For pointer events, see [method&#64;Gtk.Widget.contains].
     * @return The width of &#64;widget
    */
    public int getWidth()  {
        return JnaWidget.INST().gtk_widget_get_width(asCPointer());
    }

    /**
     * Causes &#64;widget to have the keyboard focus for the `GtkWindow` it's inside.
     * <br>
     * <br>If &#64;widget is not focusable, or its [vfunc&#64;Gtk.Widget.grab_focus]
     * <br>implementation cannot transfer the focus to a descendant of &#64;widget
     * <br>that is focusable, it will not take focus and %FALSE will be returned.
     * <br>
     * <br>Calling [method&#64;Gtk.Widget.grab_focus] on an already focused widget
     * <br>is allowed, should not have an effect, and return %TRUE.
     * @return %TRUE if focus is now inside &#64;widget.
    */
    public boolean grabFocus()  {
        return JnaWidget.INST().gtk_widget_grab_focus(asCPointer());
    }

    /**
     * Returns whether &#64;css_class is currently applied to &#64;widget.
     * @param css_class A style class, without the leading '.'   used for notation of style classes
     * @return %TRUE if &#64;css_class is currently applied to &#64;widget,   %FALSE otherwise.
    */
    public boolean hasCssClass(@Nonnull ch.bailu.gtk.type.Str css_class)  {
        return JnaWidget.INST().gtk_widget_has_css_class(asCPointer(), asCPointerNotNull(css_class));
    }

    /**
     * Returns whether &#64;css_class is currently applied to &#64;widget.
     * @param css_class A style class, without the leading '.'   used for notation of style classes
     * @return %TRUE if &#64;css_class is currently applied to &#64;widget,   %FALSE otherwise.
    */
    public boolean hasCssClass(String css_class)  {
        return JnaWidget.INST().gtk_widget_has_css_class(asCPointer(), css_class);
    }

    /**
     * Determines whether &#64;widget is the current default widget
     * <br>within its toplevel.
     * @return %TRUE if &#64;widget is the current default widget   within its toplevel, %FALSE otherwise
    */
    public boolean hasDefault()  {
        return JnaWidget.INST().gtk_widget_has_default(asCPointer());
    }

    /**
     * Determines if the widget has the global input focus.
     * <br>
     * <br>See [method&#64;Gtk.Widget.is_focus] for the difference between
     * <br>having the global input focus, and only having the focus
     * <br>within a toplevel.
     * @return %TRUE if the widget has the global input focus.
    */
    public boolean hasFocus()  {
        return JnaWidget.INST().gtk_widget_has_focus(asCPointer());
    }

    /**
     * Determines if the widget should show a visible indication that
     * <br>it has the global input focus.
     * <br>
     * <br>This is a convenience function that takes into account whether
     * <br>focus indication should currently be shown in the toplevel window
     * <br>of &#64;widget. See [method&#64;Gtk.Window.get_focus_visible] for more
     * <br>information about focus indication.
     * <br>
     * <br>To find out if the widget has the global input focus, use
     * <br>[method&#64;Gtk.Widget.has_focus].
     * @return %TRUE if the widget should display a “focus rectangle”
    */
    public boolean hasVisibleFocus()  {
        return JnaWidget.INST().gtk_widget_has_visible_focus(asCPointer());
    }

    /**
     * Reverses the effects of gtk_widget_show().
     * <br>
     * <br>This is causing the widget to be hidden (invisible to the user).
    */
    public void hide()  {
        JnaWidget.INST().gtk_widget_hide(asCPointer());
    }

    /**
     * Returns whether the widget is currently being destroyed.
     * <br>
     * <br>This information can sometimes be used to avoid doing
     * <br>unnecessary work.
     * @return %TRUE if &#64;widget is being destroyed
    */
    public boolean inDestruction()  {
        return JnaWidget.INST().gtk_widget_in_destruction(asCPointer());
    }

    /**
     * Creates and initializes child widgets defined in templates.
     * <br>
     * <br>This function must be called in the instance initializer
     * <br>for any class which assigned itself a template using
     * <br>[method&#64;Gtk.WidgetClass.set_template].
     * <br>
     * <br>It is important to call this function in the instance initializer
     * <br>of a `GtkWidget` subclass and not in `GObject.constructed()` or
     * <br>`GObject.constructor()` for two reasons:
     * <br>
     * <br> - derived widgets will assume that the composite widgets
     * <br>   defined by its parent classes have been created in their
     * <br>   relative instance initializers
     * <br> - when calling `g_object_new()` on a widget with composite templates,
     * <br>   it’s important to build the composite widgets before the construct
     * <br>   properties are set. Properties passed to `g_object_new()` should
     * <br>   take precedence over properties set in the private template XML
     * <br>
     * <br>A good rule of thumb is to call this function as the first thing in
     * <br>an instance initialization function.
    */
    public void initTemplate()  {
        JnaWidget.INST().gtk_widget_init_template(asCPointer());
    }

    /**
     * Inserts &#64;group into &#64;widget.
     * <br>
     * <br>Children of &#64;widget that implement [iface&#64;Gtk.Actionable] can
     * <br>then be associated with actions in &#64;group by setting their
     * <br>“action-name” to &#64;prefix.`action-name`.
     * <br>
     * <br>Note that inheritance is defined for individual actions. I.e.
     * <br>even if you insert a group with prefix &#64;prefix, actions with
     * <br>the same prefix will still be inherited from the parent, unless
     * <br>the group contains an action with the same name.
     * <br>
     * <br>If &#64;group is %NULL, a previously inserted group for &#64;name is
     * <br>removed from &#64;widget.
     * @param name the prefix for actions in &#64;group
     * @param group a `GActionGroup`, or %NULL to remove   the previously inserted group for &#64;name
    */
    public void insertActionGroup(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.gio.ActionGroup group)  {
        JnaWidget.INST().gtk_widget_insert_action_group(asCPointer(), asCPointerNotNull(name), asCPointer(group));
    }

    /**
     * Inserts &#64;group into &#64;widget.
     * <br>
     * <br>Children of &#64;widget that implement [iface&#64;Gtk.Actionable] can
     * <br>then be associated with actions in &#64;group by setting their
     * <br>“action-name” to &#64;prefix.`action-name`.
     * <br>
     * <br>Note that inheritance is defined for individual actions. I.e.
     * <br>even if you insert a group with prefix &#64;prefix, actions with
     * <br>the same prefix will still be inherited from the parent, unless
     * <br>the group contains an action with the same name.
     * <br>
     * <br>If &#64;group is %NULL, a previously inserted group for &#64;name is
     * <br>removed from &#64;widget.
     * @param name the prefix for actions in &#64;group
     * @param group a `GActionGroup`, or %NULL to remove   the previously inserted group for &#64;name
    */
    public void insertActionGroup(String name, @Nullable ch.bailu.gtk.gio.ActionGroup group)  {
        JnaWidget.INST().gtk_widget_insert_action_group(asCPointer(), name, asCPointer(group));
    }

    /**
     * Inserts &#64;widget into the child widget list of &#64;parent.
     * <br>
     * <br>It will be placed after &#64;previous_sibling, or at the beginning if
     * <br>&#64;previous_sibling is %NULL.
     * <br>
     * <br>After calling this function, `gtk_widget_get_prev_sibling(widget)`
     * <br>will return &#64;previous_sibling.
     * <br>
     * <br>If &#64;parent is already set as the parent widget of &#64;widget, this
     * <br>function can also be used to reorder &#64;widget in the child widget
     * <br>list of &#64;parent.
     * <br>
     * <br>This API is primarily meant for widget implementations; if you are
     * <br>just using a widget, you *must* use its own API for adding children.
     * @param parent the parent `GtkWidget` to insert &#64;widget into
     * @param previous_sibling the new previous sibling of &#64;widget
    */
    public void insertAfter(@Nonnull Widget parent, @Nullable Widget previous_sibling)  {
        JnaWidget.INST().gtk_widget_insert_after(asCPointer(), asCPointerNotNull(parent), asCPointer(previous_sibling));
    }

    /**
     * Inserts &#64;widget into the child widget list of &#64;parent.
     * <br>
     * <br>It will be placed before &#64;next_sibling, or at the end if
     * <br>&#64;next_sibling is %NULL.
     * <br>
     * <br>After calling this function, `gtk_widget_get_next_sibling(widget)`
     * <br>will return &#64;next_sibling.
     * <br>
     * <br>If &#64;parent is already set as the parent widget of &#64;widget, this function
     * <br>can also be used to reorder &#64;widget in the child widget list of &#64;parent.
     * <br>
     * <br>This API is primarily meant for widget implementations; if you are
     * <br>just using a widget, you *must* use its own API for adding children.
     * @param parent the parent `GtkWidget` to insert &#64;widget into
     * @param next_sibling the new next sibling of &#64;widget
    */
    public void insertBefore(@Nonnull Widget parent, @Nullable Widget next_sibling)  {
        JnaWidget.INST().gtk_widget_insert_before(asCPointer(), asCPointerNotNull(parent), asCPointer(next_sibling));
    }

    /**
     * Determines whether &#64;widget is somewhere inside &#64;ancestor,
     * <br>possibly with intermediate containers.
     * @param ancestor another `GtkWidget`
     * @return %TRUE if &#64;ancestor contains &#64;widget as a child,   grandchild, great grandchild, etc.
    */
    public boolean isAncestor(@Nonnull Widget ancestor)  {
        return JnaWidget.INST().gtk_widget_is_ancestor(asCPointer(), asCPointerNotNull(ancestor));
    }

    /**
     * Determines whether &#64;widget can be drawn to.
     * <br>
     * <br>A widget can be drawn if it is mapped and visible.
     * @return %TRUE if &#64;widget is drawable, %FALSE otherwise
    */
    public boolean isDrawable()  {
        return JnaWidget.INST().gtk_widget_is_drawable(asCPointer());
    }

    /**
     * Determines if the widget is the focus widget within its
     * <br>toplevel.
     * <br>
     * <br>This does not mean that the [property&#64;Gtk.Widget:has-focus]
     * <br>property is necessarily set; [property&#64;Gtk.Widget:has-focus]
     * <br>will only be set if the toplevel widget additionally has the
     * <br>global input focus.
     * @return %TRUE if the widget is the focus widget.
    */
    public boolean isFocus()  {
        return JnaWidget.INST().gtk_widget_is_focus(asCPointer());
    }

    /**
     * Returns the widget’s effective sensitivity.
     * <br>
     * <br>This means it is sensitive itself and also its
     * <br>parent widget is sensitive.
     * @return %TRUE if the widget is effectively sensitive
    */
    public boolean isSensitive()  {
        return JnaWidget.INST().gtk_widget_is_sensitive(asCPointer());
    }

    /**
     * Determines whether the widget and all its parents are marked as
     * <br>visible.
     * <br>
     * <br>This function does not check if the widget is obscured in any way.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.get_visible] and
     * <br>[method&#64;Gtk.Widget.set_visible].
     * @return %TRUE if the widget and all its parents are visible
    */
    public boolean isVisible()  {
        return JnaWidget.INST().gtk_widget_is_visible(asCPointer());
    }

    /**
     * Emits the `::keynav-failed` signal on the widget.
     * <br>
     * <br>This function should be called whenever keyboard navigation
     * <br>within a single widget hits a boundary.
     * <br>
     * <br>The return value of this function should be interpreted
     * <br>in a way similar to the return value of
     * <br>[method&#64;Gtk.Widget.child_focus]. When %TRUE is returned,
     * <br>stay in the widget, the failed keyboard  navigation is OK
     * <br>and/or there is nowhere we can/should move the focus to.
     * <br>When %FALSE is returned, the caller should continue with
     * <br>keyboard navigation outside the widget, e.g. by calling
     * <br>[method&#64;Gtk.Widget.child_focus] on the widget’s toplevel.
     * <br>
     * <br>The default [signal&#64;Gtk.Widget::keynav-failed] handler returns
     * <br>%FALSE for %GTK_DIR_TAB_FORWARD and %GTK_DIR_TAB_BACKWARD.
     * <br>For the other values of `GtkDirectionType` it returns %TRUE.
     * <br>
     * <br>Whenever the default handler returns %TRUE, it also calls
     * <br>[method&#64;Gtk.Widget.error_bell] to notify the user of the
     * <br>failed keyboard navigation.
     * <br>
     * <br>A use case for providing an own implementation of ::keynav-failed
     * <br>(either by connecting to it or by overriding it) would be a row of
     * <br>[class&#64;Gtk.Entry] widgets where the user should be able to navigate
     * <br>the entire row with the cursor keys, as e.g. known from user
     * <br>interfaces that require entering license keys.
     * @param direction direction of focus movement
     * @return %TRUE if stopping keyboard navigation is fine, %FALSE   if the emitting widget should try to handle the keyboard   navigation attempt in its parent container(s).
    */
    public boolean keynavFailed(int direction)  {
        return JnaWidget.INST().gtk_widget_keynav_failed(asCPointer(), direction);
    }

    /**
     * Returns the widgets for which this widget is the target of a
     * <br>mnemonic.
     * <br>
     * <br>Typically, these widgets will be labels. See, for example,
     * <br>[method&#64;Gtk.Label.set_mnemonic_widget].
     * <br>
     * <br>The widgets in the list are not individually referenced.
     * <br>If you want to iterate through the list and perform actions
     * <br>involving callbacks that might destroy the widgets, you
     * <br>must call `g_list_foreach (result, (GFunc)g_object_ref, NULL)`
     * <br>first, and then unref all the widgets afterwards.
     * @return the list   of mnemonic labels; free this list with g_list_free() when you   are done with it.
    */
    public ch.bailu.gtk.glib.List listMnemonicLabels()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaWidget.INST().gtk_widget_list_mnemonic_labels(asCPointer())));
    }

    /**
     * Causes a widget to be mapped if it isn’t already.
     * <br>
     * <br>This function is only for use in widget implementations.
    */
    public void map()  {
        JnaWidget.INST().gtk_widget_map(asCPointer());
    }

    /**
     * Measures &#64;widget in the orientation &#64;orientation and for the given &#64;for_size.
     * <br>
     * <br>As an example, if &#64;orientation is %GTK_ORIENTATION_HORIZONTAL and &#64;for_size
     * <br>is 300, this functions will compute the minimum and natural width of &#64;widget
     * <br>if it is allocated at a height of 300 pixels.
     * <br>
     * <br>See [GtkWidget’s geometry management section](class.Widget.html&#35;height-for-width-geometry-management) for
     * <br>a more details on implementing `GtkWidgetClass.measure()`.
     * @param orientation the orientation to measure
     * @param for_size Size for the opposite of &#64;orientation, i.e.   if &#64;orientation is %GTK_ORIENTATION_HORIZONTAL, this is   the height the widget should be measured with. The %GTK_ORIENTATION_VERTICAL   case is analogous. This way, both height-for-width and width-for-height   requests can be implemented. If no size is known, -1 can be passed.
     * @param minimum location to store the minimum size
     * @param natural location to store the natural size
     * @param minimum_baseline location to store the baseline   position for the minimum size, or -1 to report no baseline
     * @param natural_baseline location to store the baseline   position for the natural size, or -1 to report no baseline
    */
    public void measure(int orientation, int for_size, @Nullable ch.bailu.gtk.type.Int minimum, @Nullable ch.bailu.gtk.type.Int natural, @Nullable ch.bailu.gtk.type.Int minimum_baseline, @Nullable ch.bailu.gtk.type.Int natural_baseline)  {
        JnaWidget.INST().gtk_widget_measure(asCPointer(), orientation, for_size, asCPointer(minimum), asCPointer(natural), asCPointer(minimum_baseline), asCPointer(natural_baseline));
    }

    /**
     * Emits the ::mnemonic-activate signal.
     * <br>
     * <br>See [signal&#64;Gtk.Widget::mnemonic-activate].
     * @param group_cycling %TRUE if there are other widgets with the same mnemonic
     * @return %TRUE if the signal has been handled
    */
    public boolean mnemonicActivate(boolean group_cycling)  {
        return JnaWidget.INST().gtk_widget_mnemonic_activate(asCPointer(), group_cycling);
    }

    /**
     * Returns a `GListModel` to track the children of &#64;widget.
     * <br>
     * <br>Calling this function will enable extra internal bookkeeping
     * <br>to track children and emit signals on the returned listmodel.
     * <br>It may slow down operations a lot.
     * <br>
     * <br>Applications should try hard to avoid calling this function
     * <br>because of the slowdowns.
     * @return    a `GListModel` tracking &#64;widget's children
    */
    public ch.bailu.gtk.gio.ListModel observeChildren()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaWidget.INST().gtk_widget_observe_children(asCPointer())));
    }

    /**
     * Returns a `GListModel` to track the [class&#64;Gtk.EventController]s
     * <br>of &#64;widget.
     * <br>
     * <br>Calling this function will enable extra internal bookkeeping
     * <br>to track controllers and emit signals on the returned listmodel.
     * <br>It may slow down operations a lot.
     * <br>
     * <br>Applications should try hard to avoid calling this function
     * <br>because of the slowdowns.
     * @return    a `GListModel` tracking &#64;widget's controllers
    */
    public ch.bailu.gtk.gio.ListModel observeControllers()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaWidget.INST().gtk_widget_observe_controllers(asCPointer())));
    }

    /**
     * Finds the descendant of &#64;widget closest to the point (&#64;x, &#64;y).
     * <br>
     * <br>The point must be given in widget coordinates, so (0, 0) is assumed
     * <br>to be the top left of &#64;widget's content area.
     * <br>
     * <br>Usually widgets will return %NULL if the given coordinate is not
     * <br>contained in &#64;widget checked via [method&#64;Gtk.Widget.contains].
     * <br>Otherwise they will recursively try to find a child that does
     * <br>not return %NULL. Widgets are however free to customize their
     * <br>picking algorithm.
     * <br>
     * <br>This function is used on the toplevel to determine the widget
     * <br>below the mouse cursor for purposes of hover highlighting and
     * <br>delivering events.
     * @param x X coordinate to test, relative to &#64;widget's origin
     * @param y Y coordinate to test, relative to &#64;widget's origin
     * @param flags Flags to influence what is picked
     * @return The widget descendant at   the given point
    */
    public Widget pick(double x, double y, int flags)  {
        return new Widget(new PointerContainer(JnaWidget.INST().gtk_widget_pick(asCPointer(), x, y, flags)));
    }

    /**
     * Flags the widget for a rerun of the [vfunc&#64;Gtk.Widget.size_allocate]
     * <br>function.
     * <br>
     * <br>Use this function instead of [method&#64;Gtk.Widget.queue_resize]
     * <br>when the &#64;widget's size request didn't change but it wants to
     * <br>reposition its contents.
     * <br>
     * <br>An example user of this function is [method&#64;Gtk.Widget.set_halign].
     * <br>
     * <br>This function is only for use in widget implementations.
    */
    public void queueAllocate()  {
        JnaWidget.INST().gtk_widget_queue_allocate(asCPointer());
    }

    /**
     * Schedules this widget to be redrawn in the paint phase
     * <br>of the current or the next frame.
     * <br>
     * <br>This means &#64;widget's [vfunc&#64;Gtk.Widget.snapshot]
     * <br>implementation will be called.
    */
    public void queueDraw()  {
        JnaWidget.INST().gtk_widget_queue_draw(asCPointer());
    }

    /**
     * Flags a widget to have its size renegotiated.
     * <br>
     * <br>This should be called when a widget for some reason has a new
     * <br>size request. For example, when you change the text in a
     * <br>[class&#64;Gtk.Label], the label queues a resize to ensure there’s
     * <br>enough space for the new text.
     * <br>
     * <br>Note that you cannot call gtk_widget_queue_resize() on a widget
     * <br>from inside its implementation of the [vfunc&#64;Gtk.Widget.size_allocate]
     * <br>virtual method. Calls to gtk_widget_queue_resize() from inside
     * <br>[vfunc&#64;Gtk.Widget.size_allocate] will be silently ignored.
     * <br>
     * <br>This function is only for use in widget implementations.
    */
    public void queueResize()  {
        JnaWidget.INST().gtk_widget_queue_resize(asCPointer());
    }

    /**
     * Creates the GDK resources associated with a widget.
     * <br>
     * <br>Normally realization happens implicitly; if you show a widget
     * <br>and all its parent containers, then the widget will be realized
     * <br>and mapped automatically.
     * <br>
     * <br>Realizing a widget requires all the widget’s parent widgets to be
     * <br>realized; calling this function realizes the widget’s parents
     * <br>in addition to &#64;widget itself. If a widget is not yet inside a
     * <br>toplevel window when you realize it, bad things will happen.
     * <br>
     * <br>This function is primarily used in widget implementations, and
     * <br>isn’t very useful otherwise. Many times when you think you might
     * <br>need it, a better approach is to connect to a signal that will be
     * <br>called after the widget is realized automatically, such as
     * <br>[signal&#64;Gtk.Widget::realize].
    */
    public void realize()  {
        JnaWidget.INST().gtk_widget_realize(asCPointer());
    }

    /**
     * Removes &#64;controller from &#64;widget, so that it doesn't process
     * <br>events anymore.
     * <br>
     * <br>It should not be used again.
     * <br>
     * <br>Widgets will remove all event controllers automatically when they
     * <br>are destroyed, there is normally no need to call this function.
     * @param controller a `GtkEventController`
    */
    public void removeController(@Nonnull EventController controller)  {
        JnaWidget.INST().gtk_widget_remove_controller(asCPointer(), asCPointerNotNull(controller));
    }

    /**
     * Removes a style from &#64;widget.
     * <br>
     * <br>After this, the style of &#64;widget will stop matching for &#64;css_class.
     * @param css_class The style class to remove from &#64;widget, without   the leading '.' used for notation of style classes
    */
    public void removeCssClass(@Nonnull ch.bailu.gtk.type.Str css_class)  {
        JnaWidget.INST().gtk_widget_remove_css_class(asCPointer(), asCPointerNotNull(css_class));
    }

    /**
     * Removes a style from &#64;widget.
     * <br>
     * <br>After this, the style of &#64;widget will stop matching for &#64;css_class.
     * @param css_class The style class to remove from &#64;widget, without   the leading '.' used for notation of style classes
    */
    public void removeCssClass(String css_class)  {
        JnaWidget.INST().gtk_widget_remove_css_class(asCPointer(), css_class);
    }

    /**
     * Removes a widget from the list of mnemonic labels for this widget.
     * <br>
     * <br>See [method&#64;Gtk.Widget.list_mnemonic_labels]. The widget must
     * <br>have previously been added to the list with
     * <br>[method&#64;Gtk.Widget.add_mnemonic_label].
     * @param label a `GtkWidget` that was previously set as a mnemonic   label for &#64;widget with [method&#64;Gtk.Widget.add_mnemonic_label]
    */
    public void removeMnemonicLabel(@Nonnull Widget label)  {
        JnaWidget.INST().gtk_widget_remove_mnemonic_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Removes a tick callback previously registered with
     * <br>gtk_widget_add_tick_callback().
     * @param id an id returned by [method&#64;Gtk.Widget.add_tick_callback]
    */
    public void removeTickCallback(int id)  {
        JnaWidget.INST().gtk_widget_remove_tick_callback(asCPointer(), id);
    }

    /**
     * Specifies whether the input focus can enter the widget
     * <br>or any of its children.
     * <br>
     * <br>Applications should set &#64;can_focus to %FALSE to mark a
     * <br>widget as for pointer/touch use only.
     * <br>
     * <br>Note that having &#64;can_focus be %TRUE is only one of the
     * <br>necessary conditions for being focusable. A widget must
     * <br>also be sensitive and focusable and not have an ancestor
     * <br>that is marked as not can-focus in order to receive input
     * <br>focus.
     * <br>
     * <br>See [method&#64;Gtk.Widget.grab_focus] for actually setting
     * <br>the input focus on a widget.
     * @param can_focus whether or not the input focus can enter   the widget or any of its children
    */
    public void setCanFocus(boolean can_focus)  {
        JnaWidget.INST().gtk_widget_set_can_focus(asCPointer(), can_focus);
    }

    /**
     * Sets whether &#64;widget can be the target of pointer events.
     * @param can_target whether this widget should be able to   receive pointer events
    */
    public void setCanTarget(boolean can_target)  {
        JnaWidget.INST().gtk_widget_set_can_target(asCPointer(), can_target);
    }

    /**
     * Sets whether &#64;widget should be mapped along with its parent.
     * <br>
     * <br>The child visibility can be set for widget before it is added
     * <br>to a container with [method&#64;Gtk.Widget.set_parent], to avoid
     * <br>mapping children unnecessary before immediately unmapping them.
     * <br>However it will be reset to its default state of %TRUE when the
     * <br>widget is removed from a container.
     * <br>
     * <br>Note that changing the child visibility of a widget does not
     * <br>queue a resize on the widget. Most of the time, the size of
     * <br>a widget is computed from all visible children, whether or
     * <br>not they are mapped. If this is not the case, the container
     * <br>can queue a resize itself.
     * <br>
     * <br>This function is only useful for container implementations
     * <br>and should never be called by an application.
     * @param child_visible if %TRUE, &#64;widget should be mapped along   with its parent.
    */
    public void setChildVisible(boolean child_visible)  {
        JnaWidget.INST().gtk_widget_set_child_visible(asCPointer(), child_visible);
    }

    /**
     * Clear all style classes applied to &#64;widget
     * <br>and replace them with &#64;classes.
     * @param classes    %NULL-terminated list of style classes to apply to &#64;widget.
    */
    public void setCssClasses(@Nonnull ch.bailu.gtk.type.Strs classes)  {
        JnaWidget.INST().gtk_widget_set_css_classes(asCPointer(), asCPointerNotNull(classes));
    }

    /**
     * Sets the cursor to be shown when pointer devices point
     * <br>towards &#64;widget.
     * <br>
     * <br>If the &#64;cursor is NULL, &#64;widget will use the cursor
     * <br>inherited from the parent widget.
     * @param cursor the new cursor
    */
    public void setCursor(@Nullable ch.bailu.gtk.gdk.Cursor cursor)  {
        JnaWidget.INST().gtk_widget_set_cursor(asCPointer(), asCPointer(cursor));
    }

    /**
     * Sets a named cursor to be shown when pointer devices point
     * <br>towards &#64;widget.
     * <br>
     * <br>This is a utility function that creates a cursor via
     * <br>[ctor&#64;Gdk.Cursor.new_from_name] and then sets it on &#64;widget
     * <br>with [method&#64;Gtk.Widget.set_cursor]. See those functions for
     * <br>details.
     * <br>
     * <br>On top of that, this function allows &#64;name to be %NULL, which
     * <br>will do the same as calling [method&#64;Gtk.Widget.set_cursor]
     * <br>with a %NULL cursor.
     * @param name The name of the cursor
    */
    public void setCursorFromName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaWidget.INST().gtk_widget_set_cursor_from_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets a named cursor to be shown when pointer devices point
     * <br>towards &#64;widget.
     * <br>
     * <br>This is a utility function that creates a cursor via
     * <br>[ctor&#64;Gdk.Cursor.new_from_name] and then sets it on &#64;widget
     * <br>with [method&#64;Gtk.Widget.set_cursor]. See those functions for
     * <br>details.
     * <br>
     * <br>On top of that, this function allows &#64;name to be %NULL, which
     * <br>will do the same as calling [method&#64;Gtk.Widget.set_cursor]
     * <br>with a %NULL cursor.
     * @param name The name of the cursor
    */
    public void setCursorFromName(String name)  {
        JnaWidget.INST().gtk_widget_set_cursor_from_name(asCPointer(), name);
    }

    /**
     * Sets the reading direction on a particular widget.
     * <br>
     * <br>This direction controls the primary direction for widgets
     * <br>containing text, and also the direction in which the children
     * <br>of a container are packed. The ability to set the direction is
     * <br>present in order so that correct localization into languages with
     * <br>right-to-left reading directions can be done. Generally, applications
     * <br>will let the default reading direction present, except for containers
     * <br>where the containers are arranged in an order that is explicitly
     * <br>visual rather than logical (such as buttons for text justification).
     * <br>
     * <br>If the direction is set to %GTK_TEXT_DIR_NONE, then the value
     * <br>set by [func&#64;Gtk.Widget.set_default_direction] will be used.
     * @param dir the new direction
    */
    public void setDirection(int dir)  {
        JnaWidget.INST().gtk_widget_set_direction(asCPointer(), dir);
    }

    /**
     * Set &#64;child as the current focus child of &#64;widget.
     * <br>
     * <br>This function is only suitable for widget implementations.
     * <br>If you want a certain widget to get the input focus, call
     * <br>[method&#64;Gtk.Widget.grab_focus] on it.
     * @param child a direct child widget of &#64;widget or %NULL   to unset the focus child of &#64;widget
    */
    public void setFocusChild(@Nullable Widget child)  {
        JnaWidget.INST().gtk_widget_set_focus_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether the widget should grab focus when it is clicked
     * <br>with the mouse.
     * <br>
     * <br>Making mouse clicks not grab focus is useful in places like
     * <br>toolbars where you don’t want the keyboard focus removed from
     * <br>the main area of the application.
     * @param focus_on_click whether the widget should grab focus when clicked   with the mouse
    */
    public void setFocusOnClick(boolean focus_on_click)  {
        JnaWidget.INST().gtk_widget_set_focus_on_click(asCPointer(), focus_on_click);
    }

    /**
     * Specifies whether &#64;widget can own the input focus.
     * <br>
     * <br>Widget implementations should set &#64;focusable to %TRUE in
     * <br>their init() function if they want to receive keyboard input.
     * <br>
     * <br>Note that having &#64;focusable be %TRUE is only one of the
     * <br>necessary conditions for being focusable. A widget must
     * <br>also be sensitive and can-focus and not have an ancestor
     * <br>that is marked as not can-focus in order to receive input
     * <br>focus.
     * <br>
     * <br>See [method&#64;Gtk.Widget.grab_focus] for actually setting
     * <br>the input focus on a widget.
     * @param focusable whether or not &#64;widget can own the input focus
    */
    public void setFocusable(boolean focusable)  {
        JnaWidget.INST().gtk_widget_set_focusable(asCPointer(), focusable);
    }

    /**
     * Sets the font map to use for Pango rendering.
     * <br>
     * <br>The font map is the object that is used to look up fonts.
     * <br>Setting a custom font map can be useful in special situations,
     * <br>e.g. when you need to add application-specific fonts to the set
     * <br>of available fonts.
     * <br>
     * <br>When not set, the widget will inherit the font map from its parent.
     * @param font_map a `PangoFontMap`, or %NULL to unset any   previously set font map
    */
    public void setFontMap(@Nullable ch.bailu.gtk.pango.FontMap font_map)  {
        JnaWidget.INST().gtk_widget_set_font_map(asCPointer(), asCPointer(font_map));
    }

    /**
     * Sets the `cairo_font_options_t` used for Pango rendering
     * <br>in this widget.
     * <br>
     * <br>When not set, the default font options for the `GdkDisplay`
     * <br>will be used.
     * @param options a `cairo_font_options_t`   to unset any previously set default font options
    */
    public void setFontOptions(@Nullable ch.bailu.gtk.cairo.FontOptions options)  {
        JnaWidget.INST().gtk_widget_set_font_options(asCPointer(), asCPointer(options));
    }

    /**
     * Sets the horizontal alignment of &#64;widget.
     * @param align the horizontal alignment
    */
    public void setHalign(int align)  {
        JnaWidget.INST().gtk_widget_set_halign(asCPointer(), align);
    }

    /**
     * Sets the `has-tooltip` property on &#64;widget to &#64;has_tooltip.
     * @param has_tooltip whether or not &#64;widget has a tooltip.
    */
    public void setHasTooltip(boolean has_tooltip)  {
        JnaWidget.INST().gtk_widget_set_has_tooltip(asCPointer(), has_tooltip);
    }

    /**
     * Sets whether the widget would like any available extra horizontal
     * <br>space.
     * <br>
     * <br>When a user resizes a `GtkWindow`, widgets with expand=TRUE
     * <br>generally receive the extra space. For example, a list or
     * <br>scrollable area or document in your window would often be set to
     * <br>expand.
     * <br>
     * <br>Call this function to set the expand flag if you would like your
     * <br>widget to become larger horizontally when the window has extra
     * <br>room.
     * <br>
     * <br>By default, widgets automatically expand if any of their children
     * <br>want to expand. (To see if a widget will automatically expand given
     * <br>its current children and state, call [method&#64;Gtk.Widget.compute_expand].
     * <br>A container can decide how the expandability of children affects the
     * <br>expansion of the container by overriding the compute_expand virtual
     * <br>method on `GtkWidget`.).
     * <br>
     * <br>Setting hexpand explicitly with this function will override the
     * <br>automatic expand behavior.
     * <br>
     * <br>This function forces the widget to expand or not to expand,
     * <br>regardless of children.  The override occurs because
     * <br>[method&#64;Gtk.Widget.set_hexpand] sets the hexpand-set property (see
     * <br>[method&#64;Gtk.Widget.set_hexpand_set]) which causes the widget’s hexpand
     * <br>value to be used, rather than looking at children and widget state.
     * @param expand whether to expand
    */
    public void setHexpand(boolean expand)  {
        JnaWidget.INST().gtk_widget_set_hexpand(asCPointer(), expand);
    }

    /**
     * Sets whether the hexpand flag will be used.
     * <br>
     * <br>The [property&#64;Gtk.Widget:hexpand-set] property will be set
     * <br>automatically when you call [method&#64;Gtk.Widget.set_hexpand]
     * <br>to set hexpand, so the most likely reason to use this function
     * <br>would be to unset an explicit expand flag.
     * <br>
     * <br>If hexpand is set, then it overrides any computed
     * <br>expand value based on child widgets. If hexpand is not
     * <br>set, then the expand value depends on whether any
     * <br>children of the widget would like to expand.
     * <br>
     * <br>There are few reasons to use this function, but it’s here
     * <br>for completeness and consistency.
     * @param set value for hexpand-set property
    */
    public void setHexpandSet(boolean set)  {
        JnaWidget.INST().gtk_widget_set_hexpand_set(asCPointer(), set);
    }

    /**
     * Sets the layout manager delegate instance that provides an
     * <br>implementation for measuring and allocating the children of &#64;widget.
     * @param layout_manager a `GtkLayoutManager`
    */
    public void setLayoutManager(@Nullable LayoutManager layout_manager)  {
        JnaWidget.INST().gtk_widget_set_layout_manager(asCPointer(), asCPointer(layout_manager));
    }

    /**
     * Sets the bottom margin of &#64;widget.
     * @param margin the bottom margin
    */
    public void setMarginBottom(int margin)  {
        JnaWidget.INST().gtk_widget_set_margin_bottom(asCPointer(), margin);
    }

    /**
     * Sets the end margin of &#64;widget.
     * @param margin the end margin
    */
    public void setMarginEnd(int margin)  {
        JnaWidget.INST().gtk_widget_set_margin_end(asCPointer(), margin);
    }

    /**
     * Sets the start margin of &#64;widget.
     * @param margin the start margin
    */
    public void setMarginStart(int margin)  {
        JnaWidget.INST().gtk_widget_set_margin_start(asCPointer(), margin);
    }

    /**
     * Sets the top margin of &#64;widget.
     * @param margin the top margin
    */
    public void setMarginTop(int margin)  {
        JnaWidget.INST().gtk_widget_set_margin_top(asCPointer(), margin);
    }

    /**
     * Sets a widgets name.
     * <br>
     * <br>Setting a name allows you to refer to the widget from a
     * <br>CSS file. You can apply a style to widgets with a particular name
     * <br>in the CSS file. See the documentation for the CSS syntax (on the
     * <br>same page as the docs for [class&#64;Gtk.StyleContext].
     * <br>
     * <br>Note that the CSS syntax has certain special characters to delimit
     * <br>and represent elements in a selector (period, &#35;, &gt;, *...), so using
     * <br>these will make your widget impossible to match by name. Any combination
     * <br>of alphanumeric symbols, dashes and underscores will suffice.
     * @param name name for the widget
    */
    public void setName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaWidget.INST().gtk_widget_set_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets a widgets name.
     * <br>
     * <br>Setting a name allows you to refer to the widget from a
     * <br>CSS file. You can apply a style to widgets with a particular name
     * <br>in the CSS file. See the documentation for the CSS syntax (on the
     * <br>same page as the docs for [class&#64;Gtk.StyleContext].
     * <br>
     * <br>Note that the CSS syntax has certain special characters to delimit
     * <br>and represent elements in a selector (period, &#35;, &gt;, *...), so using
     * <br>these will make your widget impossible to match by name. Any combination
     * <br>of alphanumeric symbols, dashes and underscores will suffice.
     * @param name name for the widget
    */
    public void setName(String name)  {
        JnaWidget.INST().gtk_widget_set_name(asCPointer(), name);
    }

    /**
     * Request the &#64;widget to be rendered partially transparent.
     * <br>
     * <br>An opacity of 0 is fully transparent and an opacity of 1
     * <br>is fully opaque.
     * <br>
     * <br>Opacity works on both toplevel widgets and child widgets, although
     * <br>there are some limitations: For toplevel widgets, applying opacity
     * <br>depends on the capabilities of the windowing system. On X11, this
     * <br>has any effect only on X displays with a compositing manager,
     * <br>see gdk_display_is_composited(). On Windows and Wayland it should
     * <br>always work, although setting a window’s opacity after the window
     * <br>has been shown may cause some flicker.
     * <br>
     * <br>Note that the opacity is inherited through inclusion — if you set
     * <br>a toplevel to be partially translucent, all of its content will
     * <br>appear translucent, since it is ultimatively rendered on that
     * <br>toplevel. The opacity value itself is not inherited by child
     * <br>widgets (since that would make widgets deeper in the hierarchy
     * <br>progressively more translucent). As a consequence, [class&#64;Gtk.Popover]s
     * <br>and other [iface&#64;Gtk.Native] widgets with their own surface will use their
     * <br>own opacity value, and thus by default appear non-translucent,
     * <br>even if they are attached to a toplevel that is translucent.
     * @param opacity desired opacity, between 0 and 1
    */
    public void setOpacity(double opacity)  {
        JnaWidget.INST().gtk_widget_set_opacity(asCPointer(), opacity);
    }

    /**
     * Sets how &#64;widget treats content that is drawn outside the
     * <br>widget's content area.
     * <br>
     * <br>See the definition of [enum&#64;Gtk.Overflow] for details.
     * <br>
     * <br>This setting is provided for widget implementations and
     * <br>should not be used by application code.
     * <br>
     * <br>The default value is %GTK_OVERFLOW_VISIBLE.
     * @param overflow desired overflow
    */
    public void setOverflow(int overflow)  {
        JnaWidget.INST().gtk_widget_set_overflow(asCPointer(), overflow);
    }

    /**
     * Sets &#64;parent as the parent widget of &#64;widget.
     * <br>
     * <br>This takes care of details such as updating the state and style
     * <br>of the child to reflect its new location and resizing the parent.
     * <br>The opposite function is [method&#64;Gtk.Widget.unparent].
     * <br>
     * <br>This function is useful only when implementing subclasses of
     * <br>`GtkWidget`.
     * @param parent parent widget
    */
    public void setParent(@Nonnull Widget parent)  {
        JnaWidget.INST().gtk_widget_set_parent(asCPointer(), asCPointerNotNull(parent));
    }

    /**
     * Specifies whether &#64;widget will be treated as the default
     * <br>widget within its toplevel when it has the focus, even if
     * <br>another widget is the default.
     * @param receives_default whether or not &#64;widget can be a default widget.
    */
    public void setReceivesDefault(boolean receives_default)  {
        JnaWidget.INST().gtk_widget_set_receives_default(asCPointer(), receives_default);
    }

    /**
     * Sets the sensitivity of a widget.
     * <br>
     * <br>A widget is sensitive if the user can interact with it.
     * <br>Insensitive widgets are “grayed out” and the user can’t
     * <br>interact with them. Insensitive widgets are known as
     * <br>“inactive”, “disabled”, or “ghosted” in some other toolkits.
     * @param sensitive %TRUE to make the widget sensitive
    */
    public void setSensitive(boolean sensitive)  {
        JnaWidget.INST().gtk_widget_set_sensitive(asCPointer(), sensitive);
    }

    /**
     * Sets the minimum size of a widget.
     * <br>
     * <br>That is, the widget’s size request will be at least &#64;width
     * <br>by &#64;height. You can use this function to force a widget to
     * <br>be larger than it normally would be.
     * <br>
     * <br>In most cases, [method&#64;Gtk.Window.set_default_size] is a better
     * <br>choice for toplevel windows than this function; setting the default
     * <br>size will still allow users to shrink the window. Setting the size
     * <br>request will force them to leave the window at least as large as
     * <br>the size request.
     * <br>
     * <br>Note the inherent danger of setting any fixed size - themes,
     * <br>translations into other languages, different fonts, and user action
     * <br>can all change the appropriate size for a given widget. So, it's
     * <br>basically impossible to hardcode a size that will always be
     * <br>correct.
     * <br>
     * <br>The size request of a widget is the smallest size a widget can
     * <br>accept while still functioning well and drawing itself correctly.
     * <br>However in some strange cases a widget may be allocated less than
     * <br>its requested size, and in many cases a widget may be allocated more
     * <br>space than it requested.
     * <br>
     * <br>If the size request in a given direction is -1 (unset), then
     * <br>the “natural” size request of the widget will be used instead.
     * <br>
     * <br>The size request set here does not include any margin from the
     * <br>properties
     * <br>[property&#64;Gtk.Widget:margin-start],
     * <br>[property&#64;Gtk.Widget:margin-end],
     * <br>[property&#64;Gtk.Widget:margin-top], and
     * <br>[property&#64;Gtk.Widget:margin-bottom], but it does include pretty
     * <br>much all other padding or border properties set by any subclass
     * <br>of `GtkWidget`.
     * @param width width &#64;widget should request, or -1 to unset
     * @param height height &#64;widget should request, or -1 to unset
    */
    public void setSizeRequest(int width, int height)  {
        JnaWidget.INST().gtk_widget_set_size_request(asCPointer(), width, height);
    }

    /**
     * Turns on flag values in the current widget state.
     * <br>
     * <br>Typical widget states are insensitive, prelighted, etc.
     * <br>
     * <br>This function accepts the values %GTK_STATE_FLAG_DIR_LTR and
     * <br>%GTK_STATE_FLAG_DIR_RTL but ignores them. If you want to set
     * <br>the widget's direction, use [method&#64;Gtk.Widget.set_direction].
     * <br>
     * <br>This function is for use in widget implementations.
     * @param flags State flags to turn on
     * @param clear Whether to clear state before turning on &#64;flags
    */
    public void setStateFlags(int flags, boolean clear)  {
        JnaWidget.INST().gtk_widget_set_state_flags(asCPointer(), flags, clear);
    }

    /**
     * Sets &#64;markup as the contents of the tooltip, which is marked
     * <br>up with Pango markup.
     * <br>
     * <br>This function will take care of setting the
     * <br>[property&#64;Gtk.Widget:has-tooltip] as a side effect, and of the
     * <br>default handler for the [signal&#64;Gtk.Widget::query-tooltip] signal.
     * <br>
     * <br>See also [method&#64;Gtk.Tooltip.set_markup].
     * @param markup the contents of the tooltip for &#64;widget
    */
    public void setTooltipMarkup(@Nullable ch.bailu.gtk.type.Str markup)  {
        JnaWidget.INST().gtk_widget_set_tooltip_markup(asCPointer(), asCPointer(markup));
    }

    /**
     * Sets &#64;markup as the contents of the tooltip, which is marked
     * <br>up with Pango markup.
     * <br>
     * <br>This function will take care of setting the
     * <br>[property&#64;Gtk.Widget:has-tooltip] as a side effect, and of the
     * <br>default handler for the [signal&#64;Gtk.Widget::query-tooltip] signal.
     * <br>
     * <br>See also [method&#64;Gtk.Tooltip.set_markup].
     * @param markup the contents of the tooltip for &#64;widget
    */
    public void setTooltipMarkup(String markup)  {
        JnaWidget.INST().gtk_widget_set_tooltip_markup(asCPointer(), markup);
    }

    /**
     * Sets &#64;text as the contents of the tooltip.
     * <br>
     * <br>If &#64;text contains any markup, it will be escaped.
     * <br>
     * <br>This function will take care of setting
     * <br>[property&#64;Gtk.Widget:has-tooltip] as a side effect,
     * <br>and of the default handler for the
     * <br>[signal&#64;Gtk.Widget::query-tooltip] signal.
     * <br>
     * <br>See also [method&#64;Gtk.Tooltip.set_text].
     * @param text the contents of the tooltip for &#64;widget
    */
    public void setTooltipText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaWidget.INST().gtk_widget_set_tooltip_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets &#64;text as the contents of the tooltip.
     * <br>
     * <br>If &#64;text contains any markup, it will be escaped.
     * <br>
     * <br>This function will take care of setting
     * <br>[property&#64;Gtk.Widget:has-tooltip] as a side effect,
     * <br>and of the default handler for the
     * <br>[signal&#64;Gtk.Widget::query-tooltip] signal.
     * <br>
     * <br>See also [method&#64;Gtk.Tooltip.set_text].
     * @param text the contents of the tooltip for &#64;widget
    */
    public void setTooltipText(String text)  {
        JnaWidget.INST().gtk_widget_set_tooltip_text(asCPointer(), text);
    }

    /**
     * Sets the vertical alignment of &#64;widget.
     * @param align the vertical alignment
    */
    public void setValign(int align)  {
        JnaWidget.INST().gtk_widget_set_valign(asCPointer(), align);
    }

    /**
     * Sets whether the widget would like any available extra vertical
     * <br>space.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_hexpand] for more detail.
     * @param expand whether to expand
    */
    public void setVexpand(boolean expand)  {
        JnaWidget.INST().gtk_widget_set_vexpand(asCPointer(), expand);
    }

    /**
     * Sets whether the vexpand flag will be used.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_hexpand_set] for more detail.
     * @param set value for vexpand-set property
    */
    public void setVexpandSet(boolean set)  {
        JnaWidget.INST().gtk_widget_set_vexpand_set(asCPointer(), set);
    }

    /**
     * Sets the visibility state of &#64;widget.
     * <br>
     * <br>Note that setting this to %TRUE doesn’t mean the widget is
     * <br>actually viewable, see [method&#64;Gtk.Widget.get_visible].
     * <br>
     * <br>This function simply calls [method&#64;Gtk.Widget.show] or
     * <br>[method&#64;Gtk.Widget.hide] but is nicer to use when the
     * <br>visibility of the widget depends on some condition.
     * @param visible whether the widget should be shown or not
    */
    public void setVisible(boolean visible)  {
        JnaWidget.INST().gtk_widget_set_visible(asCPointer(), visible);
    }

    /**
     * Returns whether &#64;widget should contribute to
     * <br>the measuring and allocation of its parent.
     * <br>
     * <br>This is %FALSE for invisible children, but also
     * <br>for children that have their own surface.
     * @return %TRUE if child should be included in   measuring and allocating
    */
    public boolean shouldLayout()  {
        return JnaWidget.INST().gtk_widget_should_layout(asCPointer());
    }

    /**
     * Flags a widget to be displayed.
     * <br>
     * <br>Any widget that isn’t shown will not appear on the screen.
     * <br>
     * <br>Remember that you have to show the containers containing a widget,
     * <br>in addition to the widget itself, before it will appear onscreen.
     * <br>
     * <br>When a toplevel container is shown, it is immediately realized and
     * <br>mapped; other shown widgets are realized and mapped when their
     * <br>toplevel container is realized and mapped.
    */
    public void show()  {
        JnaWidget.INST().gtk_widget_show(asCPointer());
    }

    /**
     * Allocates widget with a transformation that translates
     * <br>the origin to the position in &#64;allocation.
     * <br>
     * <br>This is a simple form of [method&#64;Gtk.Widget.allocate].
     * @param allocation position and size to be allocated to &#64;widget
     * @param baseline The baseline of the child, or -1
    */
    public void sizeAllocate(@Nonnull ch.bailu.gtk.gdk.Rectangle allocation, int baseline)  {
        JnaWidget.INST().gtk_widget_size_allocate(asCPointer(), asCPointerNotNull(allocation), baseline);
    }

    /**
     * Snapshot the a child of &#64;widget.
     * <br>
     * <br>When a widget receives a call to the snapshot function,
     * <br>it must send synthetic [vfunc&#64;Gtk.Widget.snapshot] calls
     * <br>to all children. This function provides a convenient way
     * <br>of doing this. A widget, when it receives a call to its
     * <br>[vfunc&#64;Gtk.Widget.snapshot] function, calls
     * <br>gtk_widget_snapshot_child() once for each child, passing in
     * <br>the &#64;snapshot the widget received.
     * <br>
     * <br>gtk_widget_snapshot_child() takes care of translating the origin of
     * <br>&#64;snapshot, and deciding whether the child needs to be snapshot.
     * <br>
     * <br>This function does nothing for children that implement `GtkNative`.
     * @param child a child of &#64;widget
     * @param snapshot `GtkSnapshot` as passed to the widget. In particular, no   calls to gtk_snapshot_translate() or other transform calls should   have been made.
    */
    public void snapshotChild(@Nonnull Widget child, @Nonnull Snapshot snapshot)  {
        JnaWidget.INST().gtk_widget_snapshot_child(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(snapshot));
    }

    /**
     * Triggers a tooltip query on the display where the toplevel
     * <br>of &#64;widget is located.
    */
    public void triggerTooltipQuery()  {
        JnaWidget.INST().gtk_widget_trigger_tooltip_query(asCPointer());
    }

    /**
     * Causes a widget to be unmapped if it’s currently mapped.
     * <br>
     * <br>This function is only for use in widget implementations.
    */
    public void unmap()  {
        JnaWidget.INST().gtk_widget_unmap(asCPointer());
    }

    /**
     * Dissociate &#64;widget from its parent.
     * <br>
     * <br>This function is only for use in widget implementations,
     * <br>typically in dispose.
    */
    public void unparent()  {
        JnaWidget.INST().gtk_widget_unparent(asCPointer());
    }

    /**
     * Causes a widget to be unrealized (frees all GDK resources
     * <br>associated with the widget).
     * <br>
     * <br>This function is only useful in widget implementations.
    */
    public void unrealize()  {
        JnaWidget.INST().gtk_widget_unrealize(asCPointer());
    }

    /**
     * Turns off flag values for the current widget state.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_state_flags].
     * <br>
     * <br>This function is for use in widget implementations.
     * @param flags State flags to turn off
    */
    public void unsetStateFlags(int flags)  {
        JnaWidget.INST().gtk_widget_unset_state_flags(asCPointer(), flags);
    }

    public final static String SIGNAL_ON_DESTROY = "destroy";
    
    /**
     * Connect to signal "destroy".
     * <br>See {@link OnDestroy#onDestroy} for signal description.
     * <br>Field {@link #SIGNAL_ON_DESTROY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDestroy(OnDestroy signal) {
        return connectSignal(SIGNAL_ON_DESTROY, toOnDestroy(signal));
    }

    public final static String SIGNAL_ON_DIRECTION_CHANGED = "direction-changed";
    
    /**
     * Connect to signal "direction-changed".
     * <br>See {@link OnDirectionChanged#onDirectionChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_DIRECTION_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDirectionChanged(OnDirectionChanged signal) {
        return connectSignal(SIGNAL_ON_DIRECTION_CHANGED, toOnDirectionChanged(signal));
    }

    public final static String SIGNAL_ON_HIDE = "hide";
    
    /**
     * Connect to signal "hide".
     * <br>See {@link OnHide#onHide} for signal description.
     * <br>Field {@link #SIGNAL_ON_HIDE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHide(OnHide signal) {
        return connectSignal(SIGNAL_ON_HIDE, toOnHide(signal));
    }

    public final static String SIGNAL_ON_KEYNAV_FAILED = "keynav-failed";
    
    /**
     * Connect to signal "keynav-failed".
     * <br>See {@link OnKeynavFailed#onKeynavFailed} for signal description.
     * <br>Field {@link #SIGNAL_ON_KEYNAV_FAILED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onKeynavFailed(OnKeynavFailed signal) {
        return connectSignal(SIGNAL_ON_KEYNAV_FAILED, toOnKeynavFailed(signal));
    }

    public final static String SIGNAL_ON_MAP = "map";
    
    /**
     * Connect to signal "map".
     * <br>See {@link OnMap#onMap} for signal description.
     * <br>Field {@link #SIGNAL_ON_MAP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMap(OnMap signal) {
        return connectSignal(SIGNAL_ON_MAP, toOnMap(signal));
    }

    public final static String SIGNAL_ON_MNEMONIC_ACTIVATE = "mnemonic-activate";
    
    /**
     * Connect to signal "mnemonic-activate".
     * <br>See {@link OnMnemonicActivate#onMnemonicActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_MNEMONIC_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMnemonicActivate(OnMnemonicActivate signal) {
        return connectSignal(SIGNAL_ON_MNEMONIC_ACTIVATE, toOnMnemonicActivate(signal));
    }

    public final static String SIGNAL_ON_MOVE_FOCUS = "move-focus";
    
    /**
     * Connect to signal "move-focus".
     * <br>See {@link OnMoveFocus#onMoveFocus} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_FOCUS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveFocus(OnMoveFocus signal) {
        return connectSignal(SIGNAL_ON_MOVE_FOCUS, toOnMoveFocus(signal));
    }

    public final static String SIGNAL_ON_QUERY_TOOLTIP = "query-tooltip";
    
    /**
     * Connect to signal "query-tooltip".
     * <br>See {@link OnQueryTooltip#onQueryTooltip} for signal description.
     * <br>Field {@link #SIGNAL_ON_QUERY_TOOLTIP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onQueryTooltip(OnQueryTooltip signal) {
        return connectSignal(SIGNAL_ON_QUERY_TOOLTIP, toOnQueryTooltip(signal));
    }

    public final static String SIGNAL_ON_REALIZE = "realize";
    
    /**
     * Connect to signal "realize".
     * <br>See {@link OnRealize#onRealize} for signal description.
     * <br>Field {@link #SIGNAL_ON_REALIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRealize(OnRealize signal) {
        return connectSignal(SIGNAL_ON_REALIZE, toOnRealize(signal));
    }

    public final static String SIGNAL_ON_SHOW = "show";
    
    /**
     * Connect to signal "show".
     * <br>See {@link OnShow#onShow} for signal description.
     * <br>Field {@link #SIGNAL_ON_SHOW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onShow(OnShow signal) {
        return connectSignal(SIGNAL_ON_SHOW, toOnShow(signal));
    }

    public final static String SIGNAL_ON_STATE_FLAGS_CHANGED = "state-flags-changed";
    
    /**
     * Connect to signal "state-flags-changed".
     * <br>See {@link OnStateFlagsChanged#onStateFlagsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_STATE_FLAGS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStateFlagsChanged(OnStateFlagsChanged signal) {
        return connectSignal(SIGNAL_ON_STATE_FLAGS_CHANGED, toOnStateFlagsChanged(signal));
    }

    public final static String SIGNAL_ON_UNMAP = "unmap";
    
    /**
     * Connect to signal "unmap".
     * <br>See {@link OnUnmap#onUnmap} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNMAP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnmap(OnUnmap signal) {
        return connectSignal(SIGNAL_ON_UNMAP, toOnUnmap(signal));
    }

    public final static String SIGNAL_ON_UNREALIZE = "unrealize";
    
    /**
     * Connect to signal "unrealize".
     * <br>See {@link OnUnrealize#onUnrealize} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNREALIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnrealize(OnUnrealize signal) {
        return connectSignal(SIGNAL_ON_UNREALIZE, toOnUnrealize(signal));
    }

    /**
     * Obtains the current default reading direction.
     * <br>
     * <br>See [func&#64;Gtk.Widget.set_default_direction].
     * @return the current default direction.
    */
    public static int getDefaultDirection()  {
        return JnaWidget.INST().gtk_widget_get_default_direction();
    }

    /**
     * Sets the default reading direction for widgets.
     * <br>
     * <br>See [method&#64;Gtk.Widget.set_direction].
     * @param dir the new default direction. This cannot be %GTK_TEXT_DIR_NONE.
    */
    public static void setDefaultDirection(int dir)  {
        JnaWidget.INST().gtk_widget_set_default_direction(dir);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaWidget.INST().gtk_widget_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:translateCoordinates:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Widget:{c:GtkWidget*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
