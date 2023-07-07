/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkBuilder` reads XML descriptions of a user interface and
 * <br>instantiates the described objects.
 * <br>
 * <br>To create a `GtkBuilder` from a user interface description, call
 * <br>[ctor&#64;Gtk.Builder.new_from_file], [ctor&#64;Gtk.Builder.new_from_resource]
 * <br>or [ctor&#64;Gtk.Builder.new_from_string].
 * <br>
 * <br>In the (unusual) case that you want to add user interface
 * <br>descriptions from multiple sources to the same `GtkBuilder` you can
 * <br>call [ctor&#64;Gtk.Builder.new] to get an empty builder and populate it by
 * <br>(multiple) calls to [method&#64;Gtk.Builder.add_from_file],
 * <br>[method&#64;Gtk.Builder.add_from_resource] or
 * <br>[method&#64;Gtk.Builder.add_from_string].
 * <br>
 * <br>A `GtkBuilder` holds a reference to all objects that it has constructed
 * <br>and drops these references when it is finalized. This finalization can
 * <br>cause the destruction of non-widget objects or widgets which are not
 * <br>contained in a toplevel window. For toplevel windows constructed by a
 * <br>builder, it is the responsibility of the user to call
 * <br>[method&#64;Gtk.Window.destroy] to get rid of them and all the widgets
 * <br>they contain.
 * <br>
 * <br>The functions [method&#64;Gtk.Builder.get_object] and
 * <br>[method&#64;Gtk.Builder.get_objects] can be used to access the widgets in
 * <br>the interface by the names assigned to them inside the UI description.
 * <br>Toplevel windows returned by these functions will stay around until the
 * <br>user explicitly destroys them with [method&#64;Gtk.Window.destroy]. Other
 * <br>widgets will either be part of a larger hierarchy constructed by the
 * <br>builder (in which case you should not have to worry about their lifecycle),
 * <br>or without a parent, in which case they have to be added to some container
 * <br>to make use of them. Non-widget objects need to be reffed with
 * <br>g_object_ref() to keep them beyond the lifespan of the builder.
 * <br>
 * <br>&#35; GtkBuilder UI Definitions
 * <br>
 * <br>`GtkBuilder` parses textual descriptions of user interfaces which are
 * <br>specified in XML format. We refer to these descriptions as “GtkBuilder
 * <br>UI definitions” or just “UI definitions” if the context is clear.
 * <br>
 * <br>The toplevel element is `&lt;interface&gt;`. It optionally takes a “domain”
 * <br>attribute, which will make the builder look for translated strings
 * <br>using `dgettext()` in the domain specified. This can also be done by
 * <br>calling [method&#64;Gtk.Builder.set_translation_domain] on the builder.
 * <br>
 * <br>Objects are described by `&lt;object&gt;` elements, which can contain
 * <br>`&lt;property&gt;` elements to set properties, `&lt;signal&gt;` elements which
 * <br>connect signals to handlers, and `&lt;child&gt;` elements, which describe
 * <br>child objects (most often widgets inside a container, but also e.g.
 * <br>actions in an action group, or columns in a tree model). A `&lt;child&gt;`
 * <br>element contains an `&lt;object&gt;` element which describes the child object.
 * <br>
 * <br>The target toolkit version(s) are described by `&lt;requires&gt;` elements,
 * <br>the “lib” attribute specifies the widget library in question (currently
 * <br>the only supported value is “gtk”) and the “version” attribute specifies
 * <br>the target version in the form “`&lt;major&gt;`.`&lt;minor&gt;`”. `GtkBuilder` will
 * <br>error out if the version requirements are not met.
 * <br>
 * <br>Typically, the specific kind of object represented by an `&lt;object&gt;`
 * <br>element is specified by the “class” attribute. If the type has not
 * <br>been loaded yet, GTK tries to find the `get_type()` function from the
 * <br>class name by applying heuristics. This works in most cases, but if
 * <br>necessary, it is possible to specify the name of the `get_type()`
 * <br>function explicitly with the &quot;type-func&quot; attribute.
 * <br>
 * <br>Objects may be given a name with the “id” attribute, which allows the
 * <br>application to retrieve them from the builder with
 * <br>[method&#64;Gtk.Builder.get_object]. An id is also necessary to use the
 * <br>object as property value in other parts of the UI definition. GTK
 * <br>reserves ids starting and ending with `___` (three consecutive
 * <br>underscores) for its own purposes.
 * <br>
 * <br>Setting properties of objects is pretty straightforward with the
 * <br>`&lt;property&gt;` element: the “name” attribute specifies the name of the
 * <br>property, and the content of the element specifies the value.
 * <br>If the “translatable” attribute is set to a true value, GTK uses
 * <br>`gettext()` (or `dgettext()` if the builder has a translation domain set)
 * <br>to find a translation for the value. This happens before the value
 * <br>is parsed, so it can be used for properties of any type, but it is
 * <br>probably most useful for string properties. It is also possible to
 * <br>specify a context to disambiguate short strings, and comments which
 * <br>may help the translators.
 * <br>
 * <br>`GtkBuilder` can parse textual representations for the most common
 * <br>property types: characters, strings, integers, floating-point numbers,
 * <br>booleans (strings like “TRUE”, “t”, “yes”, “y”, “1” are interpreted
 * <br>as %TRUE, strings like “FALSE”, “f”, “no”, “n”, “0” are interpreted
 * <br>as %FALSE), enumerations (can be specified by their name, nick or
 * <br>integer value), flags (can be specified by their name, nick, integer
 * <br>value, optionally combined with “|”, e.g.
 * <br>“GTK_INPUT_HINT_EMOJI|GTK_INPUT_HINT_LOWERCASE”)
 * <br>and colors (in a format understood by [method&#64;Gdk.RGBA.parse]).
 * <br>
 * <br>`GVariant`s can be specified in the format understood by
 * <br>g_variant_parse(), and pixbufs can be specified as a filename of an
 * <br>image file to load.
 * <br>
 * <br>Objects can be referred to by their name and by default refer to
 * <br>objects declared in the local XML fragment and objects exposed via
 * <br>[method&#64;Gtk.Builder.expose_object]. In general, `GtkBuilder` allows
 * <br>forward references to objects — declared in the local XML; an object
 * <br>doesn’t have to be constructed before it can be referred to. The
 * <br>exception to this rule is that an object has to be constructed before
 * <br>it can be used as the value of a construct-only property.
 * <br>
 * <br>It is also possible to bind a property value to another object's
 * <br>property value using the attributes &quot;bind-source&quot; to specify the
 * <br>source object of the binding, and optionally, &quot;bind-property&quot; and
 * <br>&quot;bind-flags&quot; to specify the source property and source binding flags
 * <br>respectively. Internally, `GtkBuilder` implements this using `GBinding`
 * <br>objects. For more information see g_object_bind_property().
 * <br>
 * <br>Sometimes it is necessary to refer to widgets which have implicitly
 * <br>been constructed by GTK as part of a composite widget, to set
 * <br>properties on them or to add further children (e.g. the content area
 * <br>of a `GtkDialog`). This can be achieved by setting the “internal-child”
 * <br>property of the `&lt;child&gt;` element to a true value. Note that `GtkBuilder`
 * <br>still requires an `&lt;object&gt;` element for the internal child, even if it
 * <br>has already been constructed.
 * <br>
 * <br>A number of widgets have different places where a child can be added
 * <br>(e.g. tabs vs. page content in notebooks). This can be reflected in
 * <br>a UI definition by specifying the “type” attribute on a `&lt;child&gt;`
 * <br>The possible values for the “type” attribute are described in the
 * <br>sections describing the widget-specific portions of UI definitions.
 * <br>
 * <br>&#35; Signal handlers and function pointers
 * <br>
 * <br>Signal handlers are set up with the `&lt;signal&gt;` element. The “name”
 * <br>attribute specifies the name of the signal, and the “handler” attribute
 * <br>specifies the function to connect to the signal.
 * <br>The remaining attributes, “after”, “swapped” and “object”, have the
 * <br>same meaning as the corresponding parameters of the
 * <br>g_signal_connect_object() or g_signal_connect_data() functions. A
 * <br>“last_modification_time” attribute is also allowed, but it does not
 * <br>have a meaning to the builder.
 * <br>
 * <br>If you rely on `GModule` support to lookup callbacks in the symbol table,
 * <br>the following details should be noted:
 * <br>
 * <br>When compiling applications for Windows, you must declare signal callbacks
 * <br>with %G_MODULE_EXPORT, or they will not be put in the symbol table.
 * <br>On Linux and Unix, this is not necessary; applications should instead
 * <br>be compiled with the -Wl,--export-dynamic `CFLAGS`, and linked against
 * <br>`gmodule-export-2.0`.
 * <br>
 * <br>&#35; A GtkBuilder UI Definition
 * <br>
 * <br>```xml
 * <br>&lt;interface&gt;
 * <br>  &lt;object class=&quot;GtkDialog&quot; id=&quot;dialog1&quot;&gt;
 * <br>    &lt;child internal-child=&quot;content_area&quot;&gt;
 * <br>      &lt;object class=&quot;GtkBox&quot; id=&quot;vbox1&quot;&gt;
 * <br>        &lt;child internal-child=&quot;action_area&quot;&gt;
 * <br>          &lt;object class=&quot;GtkBox&quot; id=&quot;hbuttonbox1&quot;&gt;
 * <br>            &lt;child&gt;
 * <br>              &lt;object class=&quot;GtkButton&quot; id=&quot;ok_button&quot;&gt;
 * <br>                &lt;property name=&quot;label&quot; translatable=&quot;yes&quot;&gt;_Ok&lt;/property&gt;
 * <br>                &lt;property name=&quot;use-underline&quot;&gt;True&lt;/property&gt;
 * <br>                &lt;signal name=&quot;clicked&quot; handler=&quot;ok_button_clicked&quot;/&gt;
 * <br>              &lt;/object&gt;
 * <br>            &lt;/child&gt;
 * <br>          &lt;/object&gt;
 * <br>        &lt;/child&gt;
 * <br>      &lt;/object&gt;
 * <br>    &lt;/child&gt;
 * <br>  &lt;/object&gt;
 * <br>&lt;/interface&gt;
 * <br>```
 * <br>
 * <br>Beyond this general structure, several object classes define their
 * <br>own XML DTD fragments for filling in the ANY placeholders in the DTD
 * <br>above. Note that a custom element in a &lt;child&gt; element gets parsed by
 * <br>the custom tag handler of the parent object, while a custom element in
 * <br>an &lt;object&gt; element gets parsed by the custom tag handler of the object.
 * <br>
 * <br>These XML fragments are explained in the documentation of the
 * <br>respective objects.
 * <br>
 * <br>A `&lt;template&gt;` tag can be used to define a widget class’s components.
 * <br>See the [GtkWidget documentation](class.Widget.html&#35;building-composite-widgets-from-template-xml) for details.
 * <p><a href="https://docs.gtk.org/gtk4/class.Builder.html">https://docs.gtk.org/gtk4/class.Builder.html</a></p>
*/
public class Builder extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Builder.class.getCanonicalName());
    }

    public Builder(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Parses the UI definition in the file &#64;filename.
     * <br>
     * <br>If there is an error opening the file or parsing the description then
     * <br>the program will be aborted. You should only ever attempt to parse
     * <br>user interface descriptions that are shipped as part of your program.
     * @param filename filename of user interface description file
     * @return a `GtkBuilder` containing the described interface
    */
    public static Builder newFromFileBuilder(@Nonnull ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_file(asCPointerNotNull(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromFile");
        }
        return new Builder(__self);
    }        
    

    /**
     * Parses the UI definition in the file &#64;filename.
     * <br>
     * <br>If there is an error opening the file or parsing the description then
     * <br>the program will be aborted. You should only ever attempt to parse
     * <br>user interface descriptions that are shipped as part of your program.
     * @param filename filename of user interface description file
     * @return a `GtkBuilder` containing the described interface
    */
    public static Builder newFromFileBuilder(String filename)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_file(filename));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromFile");
        }
        return new Builder(__self);
    }        
    

    /**
     * Parses the UI definition at &#64;resource_path.
     * <br>
     * <br>If there is an error locating the resource or parsing the
     * <br>description, then the program will be aborted.
     * @param resource_path a `GResource` resource path
     * @return a `GtkBuilder` containing the described interface
    */
    public static Builder newFromResourceBuilder(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_resource(asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromResource");
        }
        return new Builder(__self);
    }        
    

    /**
     * Parses the UI definition at &#64;resource_path.
     * <br>
     * <br>If there is an error locating the resource or parsing the
     * <br>description, then the program will be aborted.
     * @param resource_path a `GResource` resource path
     * @return a `GtkBuilder` containing the described interface
    */
    public static Builder newFromResourceBuilder(String resource_path)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromResource");
        }
        return new Builder(__self);
    }        
    

    /**
     * Parses the UI definition in &#64;string.
     * <br>
     * <br>If &#64;string is %NULL-terminated, then &#64;length should be -1.
     * <br>If &#64;length is not -1, then it is the length of &#64;string.
     * <br>
     * <br>If there is an error parsing &#64;string then the program will be
     * <br>aborted. You should not attempt to parse user interface description
     * <br>from untrusted sources.
     * @param string a user interface (XML) description
     * @param length the length of &#64;string, or -1
     * @return a `GtkBuilder` containing the interface described by &#64;string
    */
    public static Builder newFromStringBuilder(@Nonnull ch.bailu.gtk.type.Str string, long length)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_string(asCPointerNotNull(string), length));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromString");
        }
        return new Builder(__self);
    }        
    

    /**
     * Parses the UI definition in &#64;string.
     * <br>
     * <br>If &#64;string is %NULL-terminated, then &#64;length should be -1.
     * <br>If &#64;length is not -1, then it is the length of &#64;string.
     * <br>
     * <br>If there is an error parsing &#64;string then the program will be
     * <br>aborted. You should not attempt to parse user interface description
     * <br>from untrusted sources.
     * @param string a user interface (XML) description
     * @param length the length of &#64;string, or -1
     * @return a `GtkBuilder` containing the interface described by &#64;string
    */
    public static Builder newFromStringBuilder(String string, long length)  {
        PointerContainer __self = cast(JnaBuilder.INST().gtk_builder_new_from_string(string, length));
        if (__self.isNull()) {
            throw new NullPointerException("Builder:newFromString");
        }
        return new Builder(__self);
    }        
    

    /**
     * Creates a new empty builder object.
     * <br>
     * <br>This function is only useful if you intend to make multiple calls
     * <br>to [method&#64;Gtk.Builder.add_from_file], [method&#64;Gtk.Builder.add_from_resource]
     * <br>or [method&#64;Gtk.Builder.add_from_string] in order to merge multiple UI
     * <br>descriptions into a single builder.
    */
    public Builder() {
        super(cast(JnaBuilder.INST().gtk_builder_new()));
    }

    /**
     * Parses a file containing a UI definition and merges it with
     * <br>the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object]) to add user data to
     * <br>callbacks before loading GtkBuilder UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_file] instead.
     * <br>
     * <br>If an error occurs, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the `GTK_BUILDER_ERROR`, `G_MARKUP_ERROR` or `G_FILE_ERROR`
     * <br>domains.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call. You should not use this function with untrusted files (ie:
     * <br>files that are not part of your application). Broken `GtkBuilder`
     * <br>files can easily crash your program, and it’s possible that memory
     * <br>was leaked leading up to the reported failure. The only reasonable
     * <br>thing to do when an error is detected is to call `g_error()`.
     * @param filename the name of the file to parse
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * Parses a file containing a UI definition and merges it with
     * <br>the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object]) to add user data to
     * <br>callbacks before loading GtkBuilder UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_file] instead.
     * <br>
     * <br>If an error occurs, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the `GTK_BUILDER_ERROR`, `G_MARKUP_ERROR` or `G_FILE_ERROR`
     * <br>domains.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call. You should not use this function with untrusted files (ie:
     * <br>files that are not part of your application). Broken `GtkBuilder`
     * <br>files can easily crash your program, and it’s possible that memory
     * <br>was leaked leading up to the reported failure. The only reasonable
     * <br>thing to do when an error is detected is to call `g_error()`.
     * @param filename the name of the file to parse
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_file(asCPointer(), filename, 0L);
    }

    /**
     * Parses a resource file containing a UI definition
     * <br>and merges it with the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object] to add user data to
     * <br>callbacks before loading GtkBuilder UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_resource] instead.
     * <br>
     * <br>If an error occurs, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * <br>domain.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call.  The only reasonable thing to do when an error is detected is
     * <br>to call g_error().
     * @param resource_path the path of the resource file to parse
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromResource(@Nonnull ch.bailu.gtk.type.Str resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_resource(asCPointer(), asCPointerNotNull(resource_path), 0L);
    }

    /**
     * Parses a resource file containing a UI definition
     * <br>and merges it with the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object] to add user data to
     * <br>callbacks before loading GtkBuilder UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_resource] instead.
     * <br>
     * <br>If an error occurs, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * <br>domain.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call.  The only reasonable thing to do when an error is detected is
     * <br>to call g_error().
     * @param resource_path the path of the resource file to parse
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromResource(String resource_path) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_resource(asCPointer(), resource_path, 0L);
    }

    /**
     * Parses a string containing a UI definition and merges it
     * <br>with the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object] to add user data to
     * <br>callbacks before loading `GtkBuilder` UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_string] instead.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or
     * <br>%G_VARIANT_PARSE_ERROR domain.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call.  The only reasonable thing to do when an error is detected is
     * <br>to call g_error().
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromString(@Nonnull ch.bailu.gtk.type.Str buffer, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_string(asCPointer(), asCPointerNotNull(buffer), length, 0L);
    }

    /**
     * Parses a string containing a UI definition and merges it
     * <br>with the current contents of &#64;builder.
     * <br>
     * <br>This function is useful if you need to call
     * <br>[method&#64;Gtk.Builder.set_current_object] to add user data to
     * <br>callbacks before loading `GtkBuilder` UI. Otherwise, you probably
     * <br>want [ctor&#64;Gtk.Builder.new_from_string] instead.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or
     * <br>%G_VARIANT_PARSE_ERROR domain.
     * <br>
     * <br>It’s not really reasonable to attempt to handle failures of this
     * <br>call.  The only reasonable thing to do when an error is detected is
     * <br>to call g_error().
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addFromString(String buffer, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_from_string(asCPointer(), buffer, length, 0L);
    }

    /**
     * Parses a file containing a UI definition building only the
     * <br>requested objects and merges them with the current contents
     * <br>of &#64;builder.
     * <br>
     * <br>Upon errors, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_FILE_ERROR
     * <br>domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param filename the name of the file to parse
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromFile(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_file(asCPointer(), asCPointerNotNull(filename), asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Parses a file containing a UI definition building only the
     * <br>requested objects and merges them with the current contents
     * <br>of &#64;builder.
     * <br>
     * <br>Upon errors, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_FILE_ERROR
     * <br>domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param filename the name of the file to parse
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromFile(String filename, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_file(asCPointer(), filename, asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Parses a resource file containing a UI definition, building
     * <br>only the requested objects and merges them with the current
     * <br>contents of &#64;builder.
     * <br>
     * <br>Upon errors, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * <br>domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param resource_path the path of the resource file to parse
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromResource(@Nonnull ch.bailu.gtk.type.Str resource_path, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_resource(asCPointer(), asCPointerNotNull(resource_path), asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Parses a resource file containing a UI definition, building
     * <br>only the requested objects and merges them with the current
     * <br>contents of &#64;builder.
     * <br>
     * <br>Upon errors, 0 will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * <br>domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param resource_path the path of the resource file to parse
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromResource(String resource_path, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_resource(asCPointer(), resource_path, asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Parses a string containing a UI definition, building only the
     * <br>requested objects and merges them with the current contents of
     * <br>&#64;builder.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR or %G_MARKUP_ERROR domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromString(@Nonnull ch.bailu.gtk.type.Str buffer, long length, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_string(asCPointer(), asCPointerNotNull(buffer), length, asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Parses a string containing a UI definition, building only the
     * <br>requested objects and merges them with the current contents of
     * <br>&#64;builder.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be assigned a
     * <br>`GError` from the %GTK_BUILDER_ERROR or %G_MARKUP_ERROR domain.
     * <br>
     * <br>If you are adding an object that depends on an object that is not
     * <br>its child (for instance a `GtkTreeView` that depends on its
     * <br>`GtkTreeModel`), you have to explicitly list all of them in &#64;object_ids.
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @param object_ids nul-terminated array of objects to build
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean addObjectsFromString(String buffer, long length, @Nonnull ch.bailu.gtk.type.Strs object_ids) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_add_objects_from_string(asCPointer(), buffer, length, asCPointerNotNull(object_ids), 0L);
    }

    /**
     * Creates a closure to invoke the function called &#64;function_name.
     * <br>
     * <br>This is using the create_closure() implementation of &#64;builder's
     * <br>[iface&#64;Gtk.BuilderScope].
     * <br>
     * <br>If no closure could be created, %NULL will be returned and &#64;error
     * <br>will be set.
     * @param function_name name of the function to look up
     * @param flags closure creation flags
     * @param object Object to create the closure with
     * @return A new closure for invoking &#64;function_name
    */
    public ch.bailu.gtk.gobject.Closure createClosure(@Nonnull ch.bailu.gtk.type.Str function_name, int flags, @Nullable ch.bailu.gtk.gobject.Object object) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gobject.Closure(new PointerContainer(JnaBuilder.INST().gtk_builder_create_closure(asCPointer(), asCPointerNotNull(function_name), flags, asCPointer(object), 0L)));
    }

    /**
     * Creates a closure to invoke the function called &#64;function_name.
     * <br>
     * <br>This is using the create_closure() implementation of &#64;builder's
     * <br>[iface&#64;Gtk.BuilderScope].
     * <br>
     * <br>If no closure could be created, %NULL will be returned and &#64;error
     * <br>will be set.
     * @param function_name name of the function to look up
     * @param flags closure creation flags
     * @param object Object to create the closure with
     * @return A new closure for invoking &#64;function_name
    */
    public ch.bailu.gtk.gobject.Closure createClosure(String function_name, int flags, @Nullable ch.bailu.gtk.gobject.Object object) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gobject.Closure(new PointerContainer(JnaBuilder.INST().gtk_builder_create_closure(asCPointer(), function_name, flags, asCPointer(object), 0L)));
    }

    /**
     * Add &#64;object to the &#64;builder object pool so it can be
     * <br>referenced just like any other object built by builder.
     * <br>
     * <br>Only a single object may be added using &#64;name. However,
     * <br>it is not an error to expose the same object under multiple
     * <br>names. `gtk_builder_get_object()` may be used to determine
     * <br>if an object has already been added with &#64;name.
     * @param name the name of the object exposed to the builder
     * @param object the object to expose
    */
    public void exposeObject(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.gobject.Object object)  {
        JnaBuilder.INST().gtk_builder_expose_object(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(object));
    }

    /**
     * Add &#64;object to the &#64;builder object pool so it can be
     * <br>referenced just like any other object built by builder.
     * <br>
     * <br>Only a single object may be added using &#64;name. However,
     * <br>it is not an error to expose the same object under multiple
     * <br>names. `gtk_builder_get_object()` may be used to determine
     * <br>if an object has already been added with &#64;name.
     * @param name the name of the object exposed to the builder
     * @param object the object to expose
    */
    public void exposeObject(String name, @Nonnull ch.bailu.gtk.gobject.Object object)  {
        JnaBuilder.INST().gtk_builder_expose_object(asCPointer(), name, asCPointerNotNull(object));
    }

    /**
     * Main private entry point for building composite components
     * <br>from template XML.
     * <br>
     * <br>Most likely you do not need to call this function in applications as
     * <br>templates are handled by `GtkWidget`.
     * @param object the object that is being extended
     * @param template_type the type that the template is for
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @return A positive value on success, 0 if an error occurred
    */
    public boolean extendWithTemplate(@Nonnull ch.bailu.gtk.gobject.Object object, long template_type, @Nonnull ch.bailu.gtk.type.Str buffer, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_extend_with_template(asCPointer(), asCPointerNotNull(object), template_type, asCPointerNotNull(buffer), length, 0L);
    }

    /**
     * Main private entry point for building composite components
     * <br>from template XML.
     * <br>
     * <br>Most likely you do not need to call this function in applications as
     * <br>templates are handled by `GtkWidget`.
     * @param object the object that is being extended
     * @param template_type the type that the template is for
     * @param buffer the string to parse
     * @param length the length of &#64;buffer (may be -1 if &#64;buffer is nul-terminated)
     * @return A positive value on success, 0 if an error occurred
    */
    public boolean extendWithTemplate(@Nonnull ch.bailu.gtk.gobject.Object object, long template_type, String buffer, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_extend_with_template(asCPointer(), asCPointerNotNull(object), template_type, buffer, length, 0L);
    }

    /**
     * Gets the current object set via gtk_builder_set_current_object().
     * @return the current object
    */
    public ch.bailu.gtk.gobject.Object getCurrentObject()  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaBuilder.INST().gtk_builder_get_current_object(asCPointer())));
    }

    /**
     * Gets the object named &#64;name.
     * <br>
     * <br>Note that this function does not increment the reference count
     * <br>of the returned object.
     * @param name name of object to get
     * @return the object named &#64;name
    */
    public ch.bailu.gtk.gobject.Object getObject(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaBuilder.INST().gtk_builder_get_object(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets the object named &#64;name.
     * <br>
     * <br>Note that this function does not increment the reference count
     * <br>of the returned object.
     * @param name name of object to get
     * @return the object named &#64;name
    */
    public ch.bailu.gtk.gobject.Object getObject(String name)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaBuilder.INST().gtk_builder_get_object(asCPointer(), name)));
    }

    /**
     * Gets all objects that have been constructed by &#64;builder.
     * <br>
     * <br>Note that this function does not increment the reference
     * <br>counts of the returned objects.
     * @return a   newly-allocated `GSList` containing all the objects   constructed by the `GtkBuilder instance`. It should be   freed by g_slist_free()
    */
    public ch.bailu.gtk.glib.SList getObjects()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaBuilder.INST().gtk_builder_get_objects(asCPointer())));
    }

    /**
     * Gets the scope in use that was set via gtk_builder_set_scope().
     * @return the current scope
    */
    public BuilderScope getScope()  {
        return new BuilderScope(new PointerContainer(JnaBuilder.INST().gtk_builder_get_scope(asCPointer())));
    }

    /**
     * Gets the translation domain of &#64;builder.
     * @return the translation domain
    */
    public ch.bailu.gtk.type.Str getTranslationDomain()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBuilder.INST().gtk_builder_get_translation_domain(asCPointer())));
    }

    /**
     * Looks up a type by name.
     * <br>
     * <br>This is using the virtual function that `GtkBuilder` has
     * <br>for that purpose. This is mainly used when implementing
     * <br>the `GtkBuildable` interface on a type.
     * @param type_name type name to lookup
     * @return the `GType` found for &#64;type_name or %G_TYPE_INVALID   if no type was found
    */
    public long getTypeFromName(@Nonnull ch.bailu.gtk.type.Str type_name)  {
        return JnaBuilder.INST().gtk_builder_get_type_from_name(asCPointer(), asCPointerNotNull(type_name));
    }

    /**
     * Looks up a type by name.
     * <br>
     * <br>This is using the virtual function that `GtkBuilder` has
     * <br>for that purpose. This is mainly used when implementing
     * <br>the `GtkBuildable` interface on a type.
     * @param type_name type name to lookup
     * @return the `GType` found for &#64;type_name or %G_TYPE_INVALID   if no type was found
    */
    public long getTypeFromName(String type_name)  {
        return JnaBuilder.INST().gtk_builder_get_type_from_name(asCPointer(), type_name);
    }

    /**
     * Sets the current object for the &#64;builder.
     * <br>
     * <br>The current object can be thought of as the `this` object that the
     * <br>builder is working for and will often be used as the default object
     * <br>when an object is optional.
     * <br>
     * <br>[method&#64;Gtk.Widget.init_template] for example will set the current
     * <br>object to the widget the template is inited for. For functions like
     * <br>[ctor&#64;Gtk.Builder.new_from_resource], the current object will be %NULL.
     * @param current_object the new current object
    */
    public void setCurrentObject(@Nullable ch.bailu.gtk.gobject.Object current_object)  {
        JnaBuilder.INST().gtk_builder_set_current_object(asCPointer(), asCPointer(current_object));
    }

    /**
     * Sets the scope the builder should operate in.
     * <br>
     * <br>If &#64;scope is %NULL, a new [class&#64;Gtk.BuilderCScope] will be created.
     * @param scope the scope to use
    */
    public void setScope(@Nullable BuilderScope scope)  {
        JnaBuilder.INST().gtk_builder_set_scope(asCPointer(), asCPointer(scope));
    }

    /**
     * Sets the translation domain of &#64;builder.
     * @param domain the translation domain
    */
    public void setTranslationDomain(@Nullable ch.bailu.gtk.type.Str domain)  {
        JnaBuilder.INST().gtk_builder_set_translation_domain(asCPointer(), asCPointer(domain));
    }

    /**
     * Sets the translation domain of &#64;builder.
     * @param domain the translation domain
    */
    public void setTranslationDomain(String domain)  {
        JnaBuilder.INST().gtk_builder_set_translation_domain(asCPointer(), domain);
    }

    /**
     * Demarshals a value from a string.
     * <br>
     * <br>This function calls g_value_init() on the &#64;value argument,
     * <br>so it need not be initialised beforehand.
     * <br>
     * <br>Can handle char, uchar, boolean, int, uint, long,
     * <br>ulong, enum, flags, float, double, string, `GdkRGBA` and
     * <br>`GtkAdjustment` type values.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be
     * <br>assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     * @param pspec the `GParamSpec` for the property
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return %TRUE on success
    */
    public boolean valueFromString(@Nonnull ch.bailu.gtk.gobject.ParamSpec pspec, @Nonnull ch.bailu.gtk.type.Str string, @Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_value_from_string(asCPointer(), asCPointerNotNull(pspec), asCPointerNotNull(string), asCPointerNotNull(value), 0L);
    }

    /**
     * Demarshals a value from a string.
     * <br>
     * <br>This function calls g_value_init() on the &#64;value argument,
     * <br>so it need not be initialised beforehand.
     * <br>
     * <br>Can handle char, uchar, boolean, int, uint, long,
     * <br>ulong, enum, flags, float, double, string, `GdkRGBA` and
     * <br>`GtkAdjustment` type values.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be
     * <br>assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     * @param pspec the `GParamSpec` for the property
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return %TRUE on success
    */
    public boolean valueFromString(@Nonnull ch.bailu.gtk.gobject.ParamSpec pspec, String string, @Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_value_from_string(asCPointer(), asCPointerNotNull(pspec), string, asCPointerNotNull(value), 0L);
    }

    /**
     * Demarshals a value from a string.
     * <br>
     * <br>Unlike [method&#64;Gtk.Builder.value_from_string], this function
     * <br>takes a `GType` instead of `GParamSpec`.
     * <br>
     * <br>Calls g_value_init() on the &#64;value argument, so it
     * <br>need not be initialised beforehand.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be
     * <br>assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     * @param type the `GType` of the value
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return %TRUE on success
    */
    public boolean valueFromStringType(long type, @Nonnull ch.bailu.gtk.type.Str string, @Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_value_from_string_type(asCPointer(), type, asCPointerNotNull(string), asCPointerNotNull(value), 0L);
    }

    /**
     * Demarshals a value from a string.
     * <br>
     * <br>Unlike [method&#64;Gtk.Builder.value_from_string], this function
     * <br>takes a `GType` instead of `GParamSpec`.
     * <br>
     * <br>Calls g_value_init() on the &#64;value argument, so it
     * <br>need not be initialised beforehand.
     * <br>
     * <br>Upon errors %FALSE will be returned and &#64;error will be
     * <br>assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     * @param type the `GType` of the value
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return %TRUE on success
    */
    public boolean valueFromStringType(long type, String string, @Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBuilder.INST().gtk_builder_value_from_string_type(asCPointer(), type, string, asCPointerNotNull(value), 0L);
    }

    public static long getTypeID() { 
        return JnaBuilder.INST().gtk_builder_get_type(); 
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
