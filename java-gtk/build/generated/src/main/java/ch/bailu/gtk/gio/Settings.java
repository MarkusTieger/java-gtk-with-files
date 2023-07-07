/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSettings class provides a convenient API for storing and retrieving
 * <br>application settings.
 * <br>
 * <br>Reads and writes can be considered to be non-blocking.  Reading
 * <br>settings with &#35;GSettings is typically extremely fast: on
 * <br>approximately the same order of magnitude (but slower than) a
 * <br>&#35;GHashTable lookup.  Writing settings is also extremely fast in terms
 * <br>of time to return to your application, but can be extremely expensive
 * <br>for other threads and other processes.  Many settings backends
 * <br>(including dconf) have lazy initialisation which means in the common
 * <br>case of the user using their computer without modifying any settings
 * <br>a lot of work can be avoided.  For dconf, the D-Bus service doesn't
 * <br>even need to be started in this case.  For this reason, you should
 * <br>only ever modify &#35;GSettings keys in response to explicit user action.
 * <br>Particular care should be paid to ensure that modifications are not
 * <br>made during startup -- for example, when setting the initial value
 * <br>of preferences widgets.  The built-in g_settings_bind() functionality
 * <br>is careful not to write settings in response to notify signals as a
 * <br>result of modifications that it makes to widgets.
 * <br>
 * <br>When creating a GSettings instance, you have to specify a schema
 * <br>that describes the keys in your settings and their types and default
 * <br>values, as well as some other information.
 * <br>
 * <br>Normally, a schema has a fixed path that determines where the settings
 * <br>are stored in the conceptual global tree of settings. However, schemas
 * <br>can also be '[relocatable][gsettings-relocatable]', i.e. not equipped with
 * <br>a fixed path. This is
 * <br>useful e.g. when the schema describes an 'account', and you want to be
 * <br>able to store a arbitrary number of accounts.
 * <br>
 * <br>Paths must start with and end with a forward slash character ('/')
 * <br>and must not contain two sequential slash characters.  Paths should
 * <br>be chosen based on a domain name associated with the program or
 * <br>library to which the settings belong.  Examples of paths are
 * <br>&quot;/org/gtk/settings/file-chooser/&quot; and &quot;/ca/desrt/dconf-editor/&quot;.
 * <br>Paths should not start with &quot;/apps/&quot;, &quot;/desktop/&quot; or &quot;/system/&quot; as
 * <br>they often did in GConf.
 * <br>
 * <br>Unlike other configuration systems (like GConf), GSettings does not
 * <br>restrict keys to basic types like strings and numbers. GSettings stores
 * <br>values as &#35;GVariant, and allows any &#35;GVariantType for keys. Key names
 * <br>are restricted to lowercase characters, numbers and '-'. Furthermore,
 * <br>the names must begin with a lowercase character, must not end
 * <br>with a '-', and must not contain consecutive dashes.
 * <br>
 * <br>Similar to GConf, the default values in GSettings schemas can be
 * <br>localized, but the localized values are stored in gettext catalogs
 * <br>and looked up with the domain that is specified in the
 * <br>`gettext-domain` attribute of the &lt;schemalist&gt; or &lt;schema&gt;
 * <br>elements and the category that is specified in the `l10n` attribute of
 * <br>the &lt;default&gt; element. The string which is translated includes all text in
 * <br>the &lt;default&gt; element, including any surrounding quotation marks.
 * <br>
 * <br>The `l10n` attribute must be set to `messages` or `time`, and sets the
 * <br>[locale category for
 * <br>translation](https://www.gnu.org/software/gettext/manual/html_node/Aspects.html&#35;index-locale-categories-1).
 * <br>The `messages` category should be used by default; use `time` for
 * <br>translatable date or time formats. A translation comment can be added as an
 * <br>XML comment immediately above the &lt;default&gt; element — it is recommended to
 * <br>add these comments to aid translators understand the meaning and
 * <br>implications of the default value. An optional translation `context`
 * <br>attribute can be set on the &lt;default&gt; element to disambiguate multiple
 * <br>defaults which use the same string.
 * <br>
 * <br>For example:
 * <pre>
 *  &lt;!-- Translators: A list of words which are not allowed to be typed, in
 *       GVariant serialization syntax.
 *       See: https://developer.gnome.org/glib/stable/gvariant-text.html --&gt;
 *  &lt;default l10n='messages' context='Banned words'&gt;['bad', 'words']&lt;/default&gt;
 * </pre>
 * <br>
 * <br>Translations of default values must remain syntactically valid serialized
 * <br>&#35;GVariants (e.g. retaining any surrounding quotation marks) or runtime
 * <br>errors will occur.
 * <br>
 * <br>GSettings uses schemas in a compact binary form that is created
 * <br>by the [glib-compile-schemas][glib-compile-schemas]
 * <br>utility. The input is a schema description in an XML format.
 * <br>
 * <br>A DTD for the gschema XML format can be found here:
 * <br>[gschema.dtd](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/gschema.dtd)
 * <br>
 * <br>The [glib-compile-schemas][glib-compile-schemas] tool expects schema
 * <br>files to have the extension `.gschema.xml`.
 * <br>
 * <br>At runtime, schemas are identified by their id (as specified in the
 * <br>id attribute of the &lt;schema&gt; element). The convention for schema
 * <br>ids is to use a dotted name, similar in style to a D-Bus bus name,
 * <br>e.g. &quot;org.gnome.SessionManager&quot;. In particular, if the settings are
 * <br>for a specific service that owns a D-Bus bus name, the D-Bus bus name
 * <br>and schema id should match. For schemas which deal with settings not
 * <br>associated with one named application, the id should not use
 * <br>StudlyCaps, e.g. &quot;org.gnome.font-rendering&quot;.
 * <br>
 * <br>In addition to &#35;GVariant types, keys can have types that have
 * <br>enumerated types. These can be described by a &lt;choice&gt;,
 * <br>&lt;enum&gt; or &lt;flags&gt; element, as seen in the
 * <br>[example][schema-enumerated]. The underlying type of such a key
 * <br>is string, but you can use g_settings_get_enum(), g_settings_set_enum(),
 * <br>g_settings_get_flags(), g_settings_set_flags() access the numeric values
 * <br>corresponding to the string value of enum and flags keys.
 * <br>
 * <br>An example for default value:
 * <pre>
 * &lt;schemalist&gt;
 *   &lt;schema id=&quot;org.gtk.Test&quot; path=&quot;/org/gtk/Test/&quot; gettext-domain=&quot;test&quot;&gt;
 * 
 *     &lt;key name=&quot;greeting&quot; type=&quot;s&quot;&gt;
 *       &lt;default l10n=&quot;messages&quot;&gt;&quot;Hello, earthlings&quot;&lt;/default&gt;
 *       &lt;summary&gt;A greeting&lt;/summary&gt;
 *       &lt;description&gt;
 *         Greeting of the invading martians
 *       &lt;/description&gt;
 *     &lt;/key&gt;
 * 
 *     &lt;key name=&quot;box&quot; type=&quot;(ii)&quot;&gt;
 *       &lt;default&gt;(20,30)&lt;/default&gt;
 *     &lt;/key&gt;
 * 
 *     &lt;key name=&quot;empty-string&quot; type=&quot;s&quot;&gt;
 *       &lt;default&gt;&quot;&quot;&lt;/default&gt;
 *       &lt;summary&gt;Empty strings have to be provided in GVariant form&lt;/summary&gt;
 *     &lt;/key&gt;
 * 
 *   &lt;/schema&gt;
 * &lt;/schemalist&gt;
 * </pre>
 * <br>
 * <br>An example for ranges, choices and enumerated types:
 * <pre>
 * &lt;schemalist&gt;
 * 
 *   &lt;enum id=&quot;org.gtk.Test.myenum&quot;&gt;
 *     &lt;value nick=&quot;first&quot; value=&quot;1&quot;/&gt;
 *     &lt;value nick=&quot;second&quot; value=&quot;2&quot;/&gt;
 *   &lt;/enum&gt;
 * 
 *   &lt;flags id=&quot;org.gtk.Test.myflags&quot;&gt;
 *     &lt;value nick=&quot;flag1&quot; value=&quot;1&quot;/&gt;
 *     &lt;value nick=&quot;flag2&quot; value=&quot;2&quot;/&gt;
 *     &lt;value nick=&quot;flag3&quot; value=&quot;4&quot;/&gt;
 *   &lt;/flags&gt;
 * 
 *   &lt;schema id=&quot;org.gtk.Test&quot;&gt;
 * 
 *     &lt;key name=&quot;key-with-range&quot; type=&quot;i&quot;&gt;
 *       &lt;range min=&quot;1&quot; max=&quot;100&quot;/&gt;
 *       &lt;default&gt;10&lt;/default&gt;
 *     &lt;/key&gt;
 * 
 *     &lt;key name=&quot;key-with-choices&quot; type=&quot;s&quot;&gt;
 *       &lt;choices&gt;
 *         &lt;choice value='Elisabeth'/&gt;
 *         &lt;choice value='Annabeth'/&gt;
 *         &lt;choice value='Joe'/&gt;
 *       &lt;/choices&gt;
 *       &lt;aliases&gt;
 *         &lt;alias value='Anna' target='Annabeth'/&gt;
 *         &lt;alias value='Beth' target='Elisabeth'/&gt;
 *       &lt;/aliases&gt;
 *       &lt;default&gt;'Joe'&lt;/default&gt;
 *     &lt;/key&gt;
 * 
 *     &lt;key name='enumerated-key' enum='org.gtk.Test.myenum'&gt;
 *       &lt;default&gt;'first'&lt;/default&gt;
 *     &lt;/key&gt;
 * 
 *     &lt;key name='flags-key' flags='org.gtk.Test.myflags'&gt;
 *       &lt;default&gt;[&quot;flag1&quot;,&quot;flag2&quot;]&lt;/default&gt;
 *     &lt;/key&gt;
 *   &lt;/schema&gt;
 * &lt;/schemalist&gt;
 * </pre>
 * <br>
 * <br>&#35;&#35; Vendor overrides
 * <br>
 * <br>Default values are defined in the schemas that get installed by
 * <br>an application. Sometimes, it is necessary for a vendor or distributor
 * <br>to adjust these defaults. Since patching the XML source for the schema
 * <br>is inconvenient and error-prone,
 * <br>[glib-compile-schemas][glib-compile-schemas] reads so-called vendor
 * <br>override' files. These are keyfiles in the same directory as the XML
 * <br>schema sources which can override default values. The schema id serves
 * <br>as the group name in the key file, and the values are expected in
 * <br>serialized GVariant form, as in the following example:
 * <pre>
 *     [org.gtk.Example]
 *     key1='string'
 *     key2=1.5
 * </pre>
 * <br>
 * <br>glib-compile-schemas expects schema files to have the extension
 * <br>`.gschema.override`.
 * <br>
 * <br>&#35;&#35; Binding
 * <br>
 * <br>A very convenient feature of GSettings lets you bind &#35;GObject properties
 * <br>directly to settings, using g_settings_bind(). Once a GObject property
 * <br>has been bound to a setting, changes on either side are automatically
 * <br>propagated to the other side. GSettings handles details like mapping
 * <br>between GObject and GVariant types, and preventing infinite cycles.
 * <br>
 * <br>This makes it very easy to hook up a preferences dialog to the
 * <br>underlying settings. To make this even more convenient, GSettings
 * <br>looks for a boolean property with the name &quot;sensitivity&quot; and
 * <br>automatically binds it to the writability of the bound setting.
 * <br>If this 'magic' gets in the way, it can be suppressed with the
 * <br>%G_SETTINGS_BIND_NO_SENSITIVITY flag.
 * <br>
 * <br>&#35;&#35; Relocatable schemas &#35; {&#35;gsettings-relocatable}
 * <br>
 * <br>A relocatable schema is one with no `path` attribute specified on its
 * <br>&lt;schema&gt; element. By using g_settings_new_with_path(), a &#35;GSettings object
 * <br>can be instantiated for a relocatable schema, assigning a path to the
 * <br>instance. Paths passed to g_settings_new_with_path() will typically be
 * <br>constructed dynamically from a constant prefix plus some form of instance
 * <br>identifier; but they must still be valid GSettings paths. Paths could also
 * <br>be constant and used with a globally installed schema originating from a
 * <br>dependency library.
 * <br>
 * <br>For example, a relocatable schema could be used to store geometry information
 * <br>for different windows in an application. If the schema ID was
 * <br>`org.foo.MyApp.Window`, it could be instantiated for paths
 * <br>`/org/foo/MyApp/main/`, `/org/foo/MyApp/document-1/`,
 * <br>`/org/foo/MyApp/document-2/`, etc. If any of the paths are well-known
 * <br>they can be specified as &lt;child&gt; elements in the parent schema, e.g.:
 * <pre>
 * &lt;schema id=&quot;org.foo.MyApp&quot; path=&quot;/org/foo/MyApp/&quot;&gt;
 *   &lt;child name=&quot;main&quot; schema=&quot;org.foo.MyApp.Window&quot;/&gt;
 * &lt;/schema&gt;
 * </pre>
 * <br>
 * <br>&#35;&#35; Build system integration &#35; {&#35;gsettings-build-system}
 * <br>
 * <br>GSettings comes with autotools integration to simplify compiling and
 * <br>installing schemas. To add GSettings support to an application, add the
 * <br>following to your `configure.ac`:
 * <pre>
 * GLIB_GSETTINGS
 * </pre>
 * <br>
 * <br>In the appropriate `Makefile.am`, use the following snippet to compile and
 * <br>install the named schema:
 * <pre>
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 * 
 * &#64;GSETTINGS_RULES&#64;
 * </pre>
 * <br>
 * <br>No changes are needed to the build system to mark a schema XML file for
 * <br>translation. Assuming it sets the `gettext-domain` attribute, a schema may
 * <br>be marked for translation by adding it to `POTFILES.in`, assuming gettext
 * <br>0.19 is in use (the preferred method for translation):
 * <pre>
 * data/org.foo.MyApp.gschema.xml
 * </pre>
 * <br>
 * <br>Alternatively, if intltool 0.50.1 is in use:
 * <pre>
 * [type: gettext/gsettings]data/org.foo.MyApp.gschema.xml
 * </pre>
 * <br>
 * <br>GSettings will use gettext to look up translations for the &lt;summary&gt; and
 * <br>&lt;description&gt; elements, and also any &lt;default&gt; elements which have a `l10n`
 * <br>attribute set. Translations must not be included in the `.gschema.xml` file
 * <br>by the build system, for example by using intltool XML rules with a
 * <br>`.gschema.xml.in` template.
 * <br>
 * <br>If an enumerated type defined in a C header file is to be used in a GSettings
 * <br>schema, it can either be defined manually using an &lt;enum&gt; element in the
 * <br>schema XML, or it can be extracted automatically from the C header. This
 * <br>approach is preferred, as it ensures the two representations are always
 * <br>synchronised. To do so, add the following to the relevant `Makefile.am`:
 * <pre>
 * gsettings_ENUM_NAMESPACE = org.foo.MyApp
 * gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
 * </pre>
 * <br>
 * <br>`gsettings_ENUM_NAMESPACE` specifies the schema namespace for the enum files,
 * <br>which are specified in `gsettings_ENUM_FILES`. This will generate a
 * <br>`org.foo.MyApp.enums.xml` file containing the extracted enums, which will be
 * <br>automatically included in the schema compilation, install and uninstall
 * <br>rules. It should not be committed to version control or included in
 * <br>`EXTRA_DIST`.
 * <p><a href="https://docs.gtk.org/gio/class.Settings.html">https://docs.gtk.org/gio/class.Settings.html</a></p>
*/
public class Settings extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Settings.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSettingsBindGetMapping {
        /**
         * The type for the function that is used to convert from &#35;GSettings to
         * <br>an object property. The &#64;value is already initialized to hold values
         * <br>of the appropriate type.
         * @param value return location for the property value
         * @param variant the &#35;GVariant
         * @param user_data user data that was specified when the binding was created
         * @return %TRUE if the conversion succeeded, %FALSE in case of an error
        */
        boolean onSettingsBindGetMapping(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.glib.Variant variant, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSettings.OnSettingsBindGetMapping toOnSettingsBindGetMapping(ch.bailu.gtk.type.Pointer instance, String methodName, OnSettingsBindGetMapping in) {
        JnaSettings.OnSettingsBindGetMapping out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value, _variant, _user_data) -> in.onSettingsBindGetMapping(__callback, new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_variant)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSettingsBindSetMapping {
        /**
         * The type for the function that is used to convert an object property
         * <br>value to a &#35;GVariant for storing it in &#35;GSettings.
         * @param value a &#35;GValue containing the property value to map
         * @param expected_type the &#35;GVariantType to create
         * @param user_data user data that was specified when the binding was created
         * @return a new &#35;GVariant holding the data from &#64;value,     or %NULL in case of an error
        */
        ch.bailu.gtk.glib.Variant onSettingsBindSetMapping(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.glib.VariantType expected_type, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSettings.OnSettingsBindSetMapping toOnSettingsBindSetMapping(ch.bailu.gtk.type.Pointer instance, String methodName, OnSettingsBindSetMapping in) {
        JnaSettings.OnSettingsBindSetMapping out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_value, _expected_type, _user_data) -> in.onSettingsBindSetMapping(__callback, new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), new ch.bailu.gtk.glib.VariantType(new PointerContainer(_expected_type)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaSettings.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaSettings.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChangeEvent {
        /**
         * The &quot;change-event&quot; signal is emitted once per change event that
         * <br>affects this settings object.  You should connect to this signal
         * <br>only if you are interested in viewing groups of changes before they
         * <br>are split out into multiple emissions of the &quot;changed&quot; signal.
         * <br>For most use cases it is more appropriate to use the &quot;changed&quot; signal.
         * <br>
         * <br>In the event that the change event applies to one or more specified
         * <br>keys, &#64;keys will be an array of &#35;GQuark of length &#64;n_keys.  In the
         * <br>event that the change event applies to the &#35;GSettings object as a
         * <br>whole (ie: potentially every key has been changed) then &#64;keys will
         * <br>be %NULL and &#64;n_keys will be 0.
         * <br>
         * <br>The default handler for this signal invokes the &quot;changed&quot; signal
         * <br>for each affected key.  If any other connected handler returns
         * <br>%TRUE then this default functionality will be suppressed.
         * @param keys         an array of &#35;GQuarks for the changed keys, or %NULL
         * @param n_keys the length of the &#64;keys array, or 0
         * @return %TRUE to stop other handlers from being invoked for the          event. FALSE to propagate the event further.
        */
        boolean onChangeEvent(@Nullable ch.bailu.gtk.type.Pointer keys, int n_keys);
    }
    
    private static com.sun.jna.Callback toOnChangeEvent(OnChangeEvent in) {
        return (in == null) ? null: (JnaSettings.OnChangeEvent) (__self, _keys, _n_keys, __data) -> in.onChangeEvent(new ch.bailu.gtk.type.Pointer(new PointerContainer(_keys)), _n_keys);
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * The &quot;changed&quot; signal is emitted when a key has potentially changed.
         * <br>You should call one of the g_settings_get() calls to check the new
         * <br>value.
         * <br>
         * <br>This signal supports detailed connections.  You can connect to the
         * <br>detailed signal &quot;changed::x&quot; in order to only receive callbacks
         * <br>when key &quot;x&quot; changes.
         * <br>
         * <br>Note that &#64;settings only emits this signal if you have read &#64;key at
         * <br>least once while a signal handler was already connected for &#64;key.
         * @param key the name of the key that changed
        */
        void onChanged(@Nonnull ch.bailu.gtk.type.Str key);
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaSettings.OnChanged) (__self, _key, __data) -> in.onChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_key)));
    }

    @FunctionalInterface
    public interface OnWritableChangeEvent {
        /**
         * The &quot;writable-change-event&quot; signal is emitted once per writability
         * <br>change event that affects this settings object.  You should connect
         * <br>to this signal if you are interested in viewing groups of changes
         * <br>before they are split out into multiple emissions of the
         * <br>&quot;writable-changed&quot; signal.  For most use cases it is more
         * <br>appropriate to use the &quot;writable-changed&quot; signal.
         * <br>
         * <br>In the event that the writability change applies only to a single
         * <br>key, &#64;key will be set to the &#35;GQuark for that key.  In the event
         * <br>that the writability change affects the entire settings object,
         * <br>&#64;key will be 0.
         * <br>
         * <br>The default handler for this signal invokes the &quot;writable-changed&quot;
         * <br>and &quot;changed&quot; signals for each affected key.  This is done because
         * <br>changes in writability might also imply changes in value (if for
         * <br>example, a new mandatory setting is introduced).  If any other
         * <br>connected handler returns %TRUE then this default functionality
         * <br>will be suppressed.
         * @param key the quark of the key, or 0
         * @return %TRUE to stop other handlers from being invoked for the          event. FALSE to propagate the event further.
        */
        boolean onWritableChangeEvent(int key);
    }
    
    private static com.sun.jna.Callback toOnWritableChangeEvent(OnWritableChangeEvent in) {
        return (in == null) ? null: (JnaSettings.OnWritableChangeEvent) (__self, _key, __data) -> in.onWritableChangeEvent(_key);
    }

    @FunctionalInterface
    public interface OnWritableChanged {
        /**
         * The &quot;writable-changed&quot; signal is emitted when the writability of a
         * <br>key has potentially changed.  You should call
         * <br>g_settings_is_writable() in order to determine the new status.
         * <br>
         * <br>This signal supports detailed connections.  You can connect to the
         * <br>detailed signal &quot;writable-changed::x&quot; in order to only receive
         * <br>callbacks when the writability of &quot;x&quot; changes.
         * @param key the key
        */
        void onWritableChanged(@Nonnull ch.bailu.gtk.type.Str key);
    }
    
    private static com.sun.jna.Callback toOnWritableChanged(OnWritableChanged in) {
        return (in == null) ? null: (JnaSettings.OnWritableChanged) (__self, _key, __data) -> in.onWritableChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_key)));
    }

    public Settings(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSettings object with a given schema, backend and
     * <br>path.
     * <br>
     * <br>It should be extremely rare that you ever want to use this function.
     * <br>It is made available for advanced use-cases (such as plugin systems
     * <br>that want to provide access to schemas loaded from custom locations,
     * <br>etc).
     * <br>
     * <br>At the most basic level, a &#35;GSettings object is a pure composition of
     * <br>4 things: a &#35;GSettingsSchema, a &#35;GSettingsBackend, a path within that
     * <br>backend, and a &#35;GMainContext to which signals are dispatched.
     * <br>
     * <br>This constructor therefore gives you full control over constructing
     * <br>&#35;GSettings instances.  The first 3 parameters are given directly as
     * <br>&#64;schema, &#64;backend and &#64;path, and the main context is taken from the
     * <br>thread-default (as per g_settings_new()).
     * <br>
     * <br>If &#64;backend is %NULL then the default backend is used.
     * <br>
     * <br>If &#64;path is %NULL then the path from the schema is used.  It is an
     * <br>error if &#64;path is %NULL and the schema has no path of its own or if
     * <br>&#64;path is non-%NULL and not equal to the path that the schema does
     * <br>have.
     * @param schema a &#35;GSettingsSchema
     * @param backend a &#35;GSettingsBackend
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newFullSettings(@Nonnull SettingsSchema schema, @Nullable SettingsBackend backend, @Nullable ch.bailu.gtk.type.Str path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_full(asCPointerNotNull(schema), asCPointer(backend), asCPointer(path)));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newFull");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with a given schema, backend and
     * <br>path.
     * <br>
     * <br>It should be extremely rare that you ever want to use this function.
     * <br>It is made available for advanced use-cases (such as plugin systems
     * <br>that want to provide access to schemas loaded from custom locations,
     * <br>etc).
     * <br>
     * <br>At the most basic level, a &#35;GSettings object is a pure composition of
     * <br>4 things: a &#35;GSettingsSchema, a &#35;GSettingsBackend, a path within that
     * <br>backend, and a &#35;GMainContext to which signals are dispatched.
     * <br>
     * <br>This constructor therefore gives you full control over constructing
     * <br>&#35;GSettings instances.  The first 3 parameters are given directly as
     * <br>&#64;schema, &#64;backend and &#64;path, and the main context is taken from the
     * <br>thread-default (as per g_settings_new()).
     * <br>
     * <br>If &#64;backend is %NULL then the default backend is used.
     * <br>
     * <br>If &#64;path is %NULL then the path from the schema is used.  It is an
     * <br>error if &#64;path is %NULL and the schema has no path of its own or if
     * <br>&#64;path is non-%NULL and not equal to the path that the schema does
     * <br>have.
     * @param schema a &#35;GSettingsSchema
     * @param backend a &#35;GSettingsBackend
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newFullSettings(@Nonnull SettingsSchema schema, @Nullable SettingsBackend backend, String path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_full(asCPointerNotNull(schema), asCPointer(backend), path));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newFull");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id and a given &#35;GSettingsBackend.
     * <br>
     * <br>Creating a &#35;GSettings object with a different backend allows accessing
     * <br>settings from a database other than the usual one. For example, it may make
     * <br>sense to pass a backend corresponding to the &quot;defaults&quot; settings database on
     * <br>the system to get a settings object that modifies the system default
     * <br>settings instead of the settings for this user.
     * @param schema_id the id of the schema
     * @param backend the &#35;GSettingsBackend to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithBackendSettings(@Nonnull ch.bailu.gtk.type.Str schema_id, @Nonnull SettingsBackend backend)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_backend(asCPointerNotNull(schema_id), asCPointerNotNull(backend)));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithBackend");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id and a given &#35;GSettingsBackend.
     * <br>
     * <br>Creating a &#35;GSettings object with a different backend allows accessing
     * <br>settings from a database other than the usual one. For example, it may make
     * <br>sense to pass a backend corresponding to the &quot;defaults&quot; settings database on
     * <br>the system to get a settings object that modifies the system default
     * <br>settings instead of the settings for this user.
     * @param schema_id the id of the schema
     * @param backend the &#35;GSettingsBackend to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithBackendSettings(String schema_id, @Nonnull SettingsBackend backend)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_backend(schema_id, asCPointerNotNull(backend)));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithBackend");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id and a given &#35;GSettingsBackend and path.
     * <br>
     * <br>This is a mix of g_settings_new_with_backend() and
     * <br>g_settings_new_with_path().
     * @param schema_id the id of the schema
     * @param backend the &#35;GSettingsBackend to use
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithBackendAndPathSettings(@Nonnull ch.bailu.gtk.type.Str schema_id, @Nonnull SettingsBackend backend, @Nonnull ch.bailu.gtk.type.Str path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_backend_and_path(asCPointerNotNull(schema_id), asCPointerNotNull(backend), asCPointerNotNull(path)));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithBackendAndPath");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id and a given &#35;GSettingsBackend and path.
     * <br>
     * <br>This is a mix of g_settings_new_with_backend() and
     * <br>g_settings_new_with_path().
     * @param schema_id the id of the schema
     * @param backend the &#35;GSettingsBackend to use
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithBackendAndPathSettings(String schema_id, @Nonnull SettingsBackend backend, String path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_backend_and_path(schema_id, asCPointerNotNull(backend), path));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithBackendAndPath");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the relocatable schema specified
     * <br>by &#64;schema_id and a given path.
     * <br>
     * <br>You only need to do this if you want to directly create a settings
     * <br>object with a schema that doesn't have a specified path of its own.
     * <br>That's quite rare.
     * <br>
     * <br>It is a programmer error to call this function for a schema that
     * <br>has an explicitly specified path.
     * <br>
     * <br>It is a programmer error if &#64;path is not a valid path.  A valid path
     * <br>begins and ends with '/' and does not contain two consecutive '/'
     * <br>characters.
     * @param schema_id the id of the schema
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithPathSettings(@Nonnull ch.bailu.gtk.type.Str schema_id, @Nonnull ch.bailu.gtk.type.Str path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_path(asCPointerNotNull(schema_id), asCPointerNotNull(path)));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithPath");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the relocatable schema specified
     * <br>by &#64;schema_id and a given path.
     * <br>
     * <br>You only need to do this if you want to directly create a settings
     * <br>object with a schema that doesn't have a specified path of its own.
     * <br>That's quite rare.
     * <br>
     * <br>It is a programmer error to call this function for a schema that
     * <br>has an explicitly specified path.
     * <br>
     * <br>It is a programmer error if &#64;path is not a valid path.  A valid path
     * <br>begins and ends with '/' and does not contain two consecutive '/'
     * <br>characters.
     * @param schema_id the id of the schema
     * @param path the path to use
     * @return a new &#35;GSettings object
    */
    public static Settings newWithPathSettings(String schema_id, String path)  {
        PointerContainer __self = cast(JnaSettings.INST().g_settings_new_with_path(schema_id, path));
        if (__self.isNull()) {
            throw new NullPointerException("Settings:newWithPath");
        }
        return new Settings(__self);
    }        
    

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id.
     * <br>
     * <br>It is an error for the schema to not exist: schemas are an
     * <br>essential part of a program, as they provide type information.
     * <br>If schemas need to be dynamically loaded (for example, from an
     * <br>optional runtime dependency), g_settings_schema_source_lookup()
     * <br>can be used to test for their existence before loading them.
     * <br>
     * <br>Signals on the newly created &#35;GSettings object will be dispatched
     * <br>via the thread-default &#35;GMainContext in effect at the time of the
     * <br>call to g_settings_new().  The new &#35;GSettings will hold a reference
     * <br>on the context.  See g_main_context_push_thread_default().
     * @param schema_id the id of the schema
    */
    public Settings(@Nonnull ch.bailu.gtk.type.Str schema_id) {
        super(cast(JnaSettings.INST().g_settings_new(asCPointerNotNull(schema_id))));
    }

    /**
     * Creates a new &#35;GSettings object with the schema specified by
     * <br>&#64;schema_id.
     * <br>
     * <br>It is an error for the schema to not exist: schemas are an
     * <br>essential part of a program, as they provide type information.
     * <br>If schemas need to be dynamically loaded (for example, from an
     * <br>optional runtime dependency), g_settings_schema_source_lookup()
     * <br>can be used to test for their existence before loading them.
     * <br>
     * <br>Signals on the newly created &#35;GSettings object will be dispatched
     * <br>via the thread-default &#35;GMainContext in effect at the time of the
     * <br>call to g_settings_new().  The new &#35;GSettings will hold a reference
     * <br>on the context.  See g_main_context_push_thread_default().
     * @param schema_id the id of the schema
    */
    public Settings(String schema_id) {
        super(cast(JnaSettings.INST().g_settings_new(schema_id)));
    }

    /**
     * Applies any changes that have been made to the settings.  This
     * <br>function does nothing unless &#64;settings is in 'delay-apply' mode;
     * <br>see g_settings_delay().  In the normal case settings are always
     * <br>applied immediately.
    */
    public void apply()  {
        JnaSettings.INST().g_settings_apply(asCPointer());
    }

    /**
     * Create a binding between the &#64;key in the &#64;settings object
     * <br>and the property &#64;property of &#64;object.
     * <br>
     * <br>The binding uses the default GIO mapping functions to map
     * <br>between the settings and property values. These functions
     * <br>handle booleans, numeric types and string types in a
     * <br>straightforward way. Use g_settings_bind_with_mapping() if
     * <br>you need a custom mapping, or map between types that are not
     * <br>supported by the default mapping functions.
     * <br>
     * <br>Unless the &#64;flags include %G_SETTINGS_BIND_NO_SENSITIVITY, this
     * <br>function also establishes a binding between the writability of
     * <br>&#64;key and the &quot;sensitive&quot; property of &#64;object (if &#64;object has
     * <br>a boolean property by that name). See g_settings_bind_writable()
     * <br>for more details about writable bindings.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of the property to bind
     * @param flags flags for the binding
    */
    public void bind(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property, int flags)  {
        JnaSettings.INST().g_settings_bind(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(object), asCPointerNotNull(property), flags);
    }

    /**
     * Create a binding between the &#64;key in the &#64;settings object
     * <br>and the property &#64;property of &#64;object.
     * <br>
     * <br>The binding uses the default GIO mapping functions to map
     * <br>between the settings and property values. These functions
     * <br>handle booleans, numeric types and string types in a
     * <br>straightforward way. Use g_settings_bind_with_mapping() if
     * <br>you need a custom mapping, or map between types that are not
     * <br>supported by the default mapping functions.
     * <br>
     * <br>Unless the &#64;flags include %G_SETTINGS_BIND_NO_SENSITIVITY, this
     * <br>function also establishes a binding between the writability of
     * <br>&#64;key and the &quot;sensitive&quot; property of &#64;object (if &#64;object has
     * <br>a boolean property by that name). See g_settings_bind_writable()
     * <br>for more details about writable bindings.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of the property to bind
     * @param flags flags for the binding
    */
    public void bind(String key, @Nonnull ch.bailu.gtk.type.Pointer object, String property, int flags)  {
        JnaSettings.INST().g_settings_bind(asCPointer(), key, asCPointerNotNull(object), property, flags);
    }

    /**
     * Create a binding between the &#64;key in the &#64;settings object
     * <br>and the property &#64;property of &#64;object.
     * <br>
     * <br>The binding uses the provided mapping functions to map between
     * <br>settings and property values.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of the property to bind
     * @param flags flags for the binding
     * @param get_mapping a function that gets called to convert values     from &#64;settings to &#64;object, or %NULL to use the default GIO mapping
     * @param set_mapping a function that gets called to convert values     from &#64;object to &#64;settings, or %NULL to use the default GIO mapping
     * @param user_data data that gets passed to &#64;get_mapping and &#64;set_mapping
     * @param destroy &#35;GDestroyNotify function for &#64;user_data
    */
    public void bindWithMapping(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property, int flags, OnSettingsBindGetMapping get_mapping, OnSettingsBindSetMapping set_mapping, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaSettings.INST().g_settings_bind_with_mapping(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(object), asCPointerNotNull(property), flags, toOnSettingsBindGetMapping(this, "bindWithMapping", get_mapping), toOnSettingsBindSetMapping(this, "bindWithMapping", set_mapping), asCPointer(user_data), toOnDestroyNotify(this, "bindWithMapping", destroy));
    }

    /**
     * Create a binding between the &#64;key in the &#64;settings object
     * <br>and the property &#64;property of &#64;object.
     * <br>
     * <br>The binding uses the provided mapping functions to map between
     * <br>settings and property values.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of the property to bind
     * @param flags flags for the binding
     * @param get_mapping a function that gets called to convert values     from &#64;settings to &#64;object, or %NULL to use the default GIO mapping
     * @param set_mapping a function that gets called to convert values     from &#64;object to &#64;settings, or %NULL to use the default GIO mapping
     * @param user_data data that gets passed to &#64;get_mapping and &#64;set_mapping
     * @param destroy &#35;GDestroyNotify function for &#64;user_data
    */
    public void bindWithMapping(String key, @Nonnull ch.bailu.gtk.type.Pointer object, String property, int flags, OnSettingsBindGetMapping get_mapping, OnSettingsBindSetMapping set_mapping, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaSettings.INST().g_settings_bind_with_mapping(asCPointer(), key, asCPointerNotNull(object), property, flags, toOnSettingsBindGetMapping(this, "bindWithMapping", get_mapping), toOnSettingsBindSetMapping(this, "bindWithMapping", set_mapping), asCPointer(user_data), toOnDestroyNotify(this, "bindWithMapping", destroy));
    }

    /**
     * Create a binding between the writability of &#64;key in the
     * <br>&#64;settings object and the property &#64;property of &#64;object.
     * <br>The property must be boolean; &quot;sensitive&quot; or &quot;visible&quot;
     * <br>properties of widgets are the most likely candidates.
     * <br>
     * <br>Writable bindings are always uni-directional; changes of the
     * <br>writability of the setting will be propagated to the object
     * <br>property, not the other way.
     * <br>
     * <br>When the &#64;inverted argument is %TRUE, the binding inverts the
     * <br>value as it passes from the setting to the object, i.e. &#64;property
     * <br>will be set to %TRUE if the key is not writable.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of a boolean property to bind
     * @param inverted whether to 'invert' the value
    */
    public void bindWritable(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property, boolean inverted)  {
        JnaSettings.INST().g_settings_bind_writable(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(object), asCPointerNotNull(property), inverted);
    }

    /**
     * Create a binding between the writability of &#64;key in the
     * <br>&#64;settings object and the property &#64;property of &#64;object.
     * <br>The property must be boolean; &quot;sensitive&quot; or &quot;visible&quot;
     * <br>properties of widgets are the most likely candidates.
     * <br>
     * <br>Writable bindings are always uni-directional; changes of the
     * <br>writability of the setting will be propagated to the object
     * <br>property, not the other way.
     * <br>
     * <br>When the &#64;inverted argument is %TRUE, the binding inverts the
     * <br>value as it passes from the setting to the object, i.e. &#64;property
     * <br>will be set to %TRUE if the key is not writable.
     * <br>
     * <br>Note that the lifecycle of the binding is tied to &#64;object,
     * <br>and that you can have only one binding per object property.
     * <br>If you bind the same property twice on the same object, the second
     * <br>binding overrides the first one.
     * @param key the key to bind
     * @param object a &#35;GObject
     * @param property the name of a boolean property to bind
     * @param inverted whether to 'invert' the value
    */
    public void bindWritable(String key, @Nonnull ch.bailu.gtk.type.Pointer object, String property, boolean inverted)  {
        JnaSettings.INST().g_settings_bind_writable(asCPointer(), key, asCPointerNotNull(object), property, inverted);
    }

    /**
     * Creates a &#35;GAction corresponding to a given &#35;GSettings key.
     * <br>
     * <br>The action has the same name as the key.
     * <br>
     * <br>The value of the key becomes the state of the action and the action
     * <br>is enabled when the key is writable.  Changing the state of the
     * <br>action results in the key being written to.  Changes to the value or
     * <br>writability of the key cause appropriate change notifications to be
     * <br>emitted for the action.
     * <br>
     * <br>For boolean-valued keys, action activations take no parameter and
     * <br>result in the toggling of the value.  For all other types,
     * <br>activations take the new value for the key (which must have the
     * <br>correct type).
     * @param key the name of a key in &#64;settings
     * @return a new &#35;GAction
    */
    public Action createAction(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new Action(new PointerContainer(JnaSettings.INST().g_settings_create_action(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Creates a &#35;GAction corresponding to a given &#35;GSettings key.
     * <br>
     * <br>The action has the same name as the key.
     * <br>
     * <br>The value of the key becomes the state of the action and the action
     * <br>is enabled when the key is writable.  Changing the state of the
     * <br>action results in the key being written to.  Changes to the value or
     * <br>writability of the key cause appropriate change notifications to be
     * <br>emitted for the action.
     * <br>
     * <br>For boolean-valued keys, action activations take no parameter and
     * <br>result in the toggling of the value.  For all other types,
     * <br>activations take the new value for the key (which must have the
     * <br>correct type).
     * @param key the name of a key in &#64;settings
     * @return a new &#35;GAction
    */
    public Action createAction(String key)  {
        return new Action(new PointerContainer(JnaSettings.INST().g_settings_create_action(asCPointer(), key)));
    }

    /**
     * Changes the &#35;GSettings object into 'delay-apply' mode. In this
     * <br>mode, changes to &#64;settings are not immediately propagated to the
     * <br>backend, but kept locally until g_settings_apply() is called.
    */
    public void delay()  {
        JnaSettings.INST().g_settings_delay(asCPointer());
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience function that combines g_settings_get_value() with
     * <br>g_variant_get().
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for the &#35;GVariantType of &#64;format to mismatch
     * <br>the type given in the schema.
     * @param key the key to get the value for
     * @param format a &#35;GVariant format string
     * @param _elipse arguments as per &#64;format
    */
    public void get(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaSettings.INST().g_settings_get(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(format), _elipse);
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience function that combines g_settings_get_value() with
     * <br>g_variant_get().
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for the &#35;GVariantType of &#64;format to mismatch
     * <br>the type given in the schema.
     * @param key the key to get the value for
     * @param format a &#35;GVariant format string
     * @param _elipse arguments as per &#64;format
    */
    public void get(String key, String format, java.lang.Object... _elipse)  {
        JnaSettings.INST().g_settings_get(asCPointer(), key, format, _elipse);
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for booleans.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a boolean type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a boolean
    */
    public boolean getBoolean(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_boolean(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for booleans.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a boolean type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a boolean
    */
    public boolean getBoolean(String key)  {
        return JnaSettings.INST().g_settings_get_boolean(asCPointer(), key);
    }

    /**
     * Creates a child settings object which has a base path of
     * <br>`base-path/&#64;name`, where `base-path` is the base path of
     * <br>&#64;settings.
     * <br>
     * <br>The schema for the child settings object must have been declared
     * <br>in the schema of &#64;settings using a `&lt;child&gt;` element.
     * <br>
     * <br>The created child settings object will inherit the &#35;GSettings:delay-apply
     * <br>mode from &#64;settings.
     * @param name the name of the child schema
     * @return a 'child' settings object
    */
    public Settings getChild(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new Settings(new PointerContainer(JnaSettings.INST().g_settings_get_child(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Creates a child settings object which has a base path of
     * <br>`base-path/&#64;name`, where `base-path` is the base path of
     * <br>&#64;settings.
     * <br>
     * <br>The schema for the child settings object must have been declared
     * <br>in the schema of &#64;settings using a `&lt;child&gt;` element.
     * <br>
     * <br>The created child settings object will inherit the &#35;GSettings:delay-apply
     * <br>mode from &#64;settings.
     * @param name the name of the child schema
     * @return a 'child' settings object
    */
    public Settings getChild(String name)  {
        return new Settings(new PointerContainer(JnaSettings.INST().g_settings_get_child(asCPointer(), name)));
    }

    /**
     * Gets the &quot;default value&quot; of a key.
     * <br>
     * <br>This is the value that would be read if g_settings_reset() were to be
     * <br>called on the key.
     * <br>
     * <br>Note that this may be a different value than returned by
     * <br>g_settings_schema_key_get_default_value() if the system administrator
     * <br>has provided a default value.
     * <br>
     * <br>Comparing the return values of g_settings_get_default_value() and
     * <br>g_settings_get_value() is not sufficient for determining if a value
     * <br>has been set because the user may have explicitly set the value to
     * <br>something that happens to be equal to the default.  The difference
     * <br>here is that if the default changes in the future, the user's key
     * <br>will still be set.
     * <br>
     * <br>This function may be useful for adding an indication to a UI of what
     * <br>the default value was before the user set it.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the default value for
     * @return the default value
    */
    public ch.bailu.gtk.glib.Variant getDefaultValue(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_default_value(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Gets the &quot;default value&quot; of a key.
     * <br>
     * <br>This is the value that would be read if g_settings_reset() were to be
     * <br>called on the key.
     * <br>
     * <br>Note that this may be a different value than returned by
     * <br>g_settings_schema_key_get_default_value() if the system administrator
     * <br>has provided a default value.
     * <br>
     * <br>Comparing the return values of g_settings_get_default_value() and
     * <br>g_settings_get_value() is not sufficient for determining if a value
     * <br>has been set because the user may have explicitly set the value to
     * <br>something that happens to be equal to the default.  The difference
     * <br>here is that if the default changes in the future, the user's key
     * <br>will still be set.
     * <br>
     * <br>This function may be useful for adding an indication to a UI of what
     * <br>the default value was before the user set it.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the default value for
     * @return the default value
    */
    public ch.bailu.gtk.glib.Variant getDefaultValue(String key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_default_value(asCPointer(), key)));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for doubles.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a 'double' type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a double
    */
    public double getDouble(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_double(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for doubles.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a 'double' type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a double
    */
    public double getDouble(String key)  {
        return JnaSettings.INST().g_settings_get_double(asCPointer(), key);
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key and converts it
     * <br>to the enum value that it represents.
     * <br>
     * <br>In order to use this function the type of the value must be a string
     * <br>and it must be marked in the schema file as an enumerated type.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as an enumerated type.
     * <br>
     * <br>If the value stored in the configuration database is not a valid
     * <br>value for the enumerated type then this function will return the
     * <br>default value.
     * @param key the key to get the value for
     * @return the enum value
    */
    public int getEnum(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_enum(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key and converts it
     * <br>to the enum value that it represents.
     * <br>
     * <br>In order to use this function the type of the value must be a string
     * <br>and it must be marked in the schema file as an enumerated type.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as an enumerated type.
     * <br>
     * <br>If the value stored in the configuration database is not a valid
     * <br>value for the enumerated type then this function will return the
     * <br>default value.
     * @param key the key to get the value for
     * @return the enum value
    */
    public int getEnum(String key)  {
        return JnaSettings.INST().g_settings_get_enum(asCPointer(), key);
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key and converts it
     * <br>to the flags value that it represents.
     * <br>
     * <br>In order to use this function the type of the value must be an array
     * <br>of strings and it must be marked in the schema file as a flags type.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as a flags type.
     * <br>
     * <br>If the value stored in the configuration database is not a valid
     * <br>value for the flags type then this function will return the default
     * <br>value.
     * @param key the key to get the value for
     * @return the flags value
    */
    public int getFlags(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_flags(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key and converts it
     * <br>to the flags value that it represents.
     * <br>
     * <br>In order to use this function the type of the value must be an array
     * <br>of strings and it must be marked in the schema file as a flags type.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as a flags type.
     * <br>
     * <br>If the value stored in the configuration database is not a valid
     * <br>value for the flags type then this function will return the default
     * <br>value.
     * @param key the key to get the value for
     * @return the flags value
    */
    public int getFlags(String key)  {
        return JnaSettings.INST().g_settings_get_flags(asCPointer(), key);
    }

    /**
     * Returns whether the &#35;GSettings object has any unapplied
     * <br>changes.  This can only be the case if it is in 'delayed-apply' mode.
     * @return %TRUE if &#64;settings has unapplied changes
    */
    public boolean getHasUnapplied()  {
        return JnaSettings.INST().g_settings_get_has_unapplied(asCPointer());
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 32-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int32 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return an integer
    */
    public int getInt(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_int(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 32-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int32 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return an integer
    */
    public int getInt(String key)  {
        return JnaSettings.INST().g_settings_get_int(asCPointer(), key);
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 64-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int64 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a 64-bit integer
    */
    public long getInt64(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_int64(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 64-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int64 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a 64-bit integer
    */
    public long getInt64(String key)  {
        return JnaSettings.INST().g_settings_get_int64(asCPointer(), key);
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for strings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a string type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a newly-allocated string
    */
    public ch.bailu.gtk.type.Str getString(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettings.INST().g_settings_get_string(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for strings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a string type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a newly-allocated string
    */
    public ch.bailu.gtk.type.Str getString(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettings.INST().g_settings_get_string(asCPointer(), key)));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 32-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint32 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return an unsigned integer
    */
    public int getUint(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_uint(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 32-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint32 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return an unsigned integer
    */
    public int getUint(String key)  {
        return JnaSettings.INST().g_settings_get_uint(asCPointer(), key);
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 64-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint64 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a 64-bit unsigned integer
    */
    public long getUint64(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaSettings.INST().g_settings_get_uint64(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Gets the value that is stored at &#64;key in &#64;settings.
     * <br>
     * <br>A convenience variant of g_settings_get() for 64-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint64 type in the schema for &#64;settings.
     * @param key the key to get the value for
     * @return a 64-bit unsigned integer
    */
    public long getUint64(String key)  {
        return JnaSettings.INST().g_settings_get_uint64(asCPointer(), key);
    }

    /**
     * Checks the &quot;user value&quot; of a key, if there is one.
     * <br>
     * <br>The user value of a key is the last value that was set by the user.
     * <br>
     * <br>After calling g_settings_reset() this function should always return
     * <br>%NULL (assuming something is not wrong with the system
     * <br>configuration).
     * <br>
     * <br>It is possible that g_settings_get_value() will return a different
     * <br>value than this function.  This can happen in the case that the user
     * <br>set a value for a key that was subsequently locked down by the system
     * <br>administrator -- this function will return the user's old value.
     * <br>
     * <br>This function may be useful for adding a &quot;reset&quot; option to a UI or
     * <br>for providing indication that a particular value has been changed.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the user value for
     * @return the user's value, if set
    */
    public ch.bailu.gtk.glib.Variant getUserValue(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_user_value(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Checks the &quot;user value&quot; of a key, if there is one.
     * <br>
     * <br>The user value of a key is the last value that was set by the user.
     * <br>
     * <br>After calling g_settings_reset() this function should always return
     * <br>%NULL (assuming something is not wrong with the system
     * <br>configuration).
     * <br>
     * <br>It is possible that g_settings_get_value() will return a different
     * <br>value than this function.  This can happen in the case that the user
     * <br>set a value for a key that was subsequently locked down by the system
     * <br>administrator -- this function will return the user's old value.
     * <br>
     * <br>This function may be useful for adding a &quot;reset&quot; option to a UI or
     * <br>for providing indication that a particular value has been changed.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the user value for
     * @return the user's value, if set
    */
    public ch.bailu.gtk.glib.Variant getUserValue(String key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_user_value(asCPointer(), key)));
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the value for
     * @return a new &#35;GVariant
    */
    public ch.bailu.gtk.glib.Variant getValue(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_value(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Gets the value that is stored in &#64;settings for &#64;key.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings.
     * @param key the key to get the value for
     * @return a new &#35;GVariant
    */
    public ch.bailu.gtk.glib.Variant getValue(String key)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettings.INST().g_settings_get_value(asCPointer(), key)));
    }

    /**
     * Finds out if a key can be written or not
     * @param name the name of a key
     * @return %TRUE if the key &#64;name is writable
    */
    public boolean isWritable(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaSettings.INST().g_settings_is_writable(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Finds out if a key can be written or not
     * @param name the name of a key
     * @return %TRUE if the key &#64;name is writable
    */
    public boolean isWritable(String name)  {
        return JnaSettings.INST().g_settings_is_writable(asCPointer(), name);
    }

    /**
     * Resets &#64;key to its default value.
     * <br>
     * <br>This call resets the key, as much as possible, to its default value.
     * <br>That might be the value specified in the schema or the one set by the
     * <br>administrator.
     * @param key the name of a key
    */
    public void reset(@Nonnull ch.bailu.gtk.type.Str key)  {
        JnaSettings.INST().g_settings_reset(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Resets &#64;key to its default value.
     * <br>
     * <br>This call resets the key, as much as possible, to its default value.
     * <br>That might be the value specified in the schema or the one set by the
     * <br>administrator.
     * @param key the name of a key
    */
    public void reset(String key)  {
        JnaSettings.INST().g_settings_reset(asCPointer(), key);
    }

    /**
     * Reverts all non-applied changes to the settings.  This function
     * <br>does nothing unless &#64;settings is in 'delay-apply' mode; see
     * <br>g_settings_delay().  In the normal case settings are always applied
     * <br>immediately.
     * <br>
     * <br>Change notifications will be emitted for affected keys.
    */
    public void revert()  {
        JnaSettings.INST().g_settings_revert(asCPointer());
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience function that combines g_settings_set_value() with
     * <br>g_variant_new().
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for the &#35;GVariantType of &#64;format to mismatch
     * <br>the type given in the schema.
     * @param key the name of the key to set
     * @param format a &#35;GVariant format string
     * @param _elipse arguments as per &#64;format
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean set(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return JnaSettings.INST().g_settings_set(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience function that combines g_settings_set_value() with
     * <br>g_variant_new().
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for the &#35;GVariantType of &#64;format to mismatch
     * <br>the type given in the schema.
     * @param key the name of the key to set
     * @param format a &#35;GVariant format string
     * @param _elipse arguments as per &#64;format
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean set(String key, String format, java.lang.Object... _elipse)  {
        return JnaSettings.INST().g_settings_set(asCPointer(), key, format, _elipse);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for booleans.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a boolean type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setBoolean(@Nonnull ch.bailu.gtk.type.Str key, boolean value)  {
        return JnaSettings.INST().g_settings_set_boolean(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for booleans.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a boolean type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setBoolean(String key, boolean value)  {
        return JnaSettings.INST().g_settings_set_boolean(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for doubles.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a 'double' type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setDouble(@Nonnull ch.bailu.gtk.type.Str key, double value)  {
        return JnaSettings.INST().g_settings_set_double(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for doubles.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a 'double' type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setDouble(String key, double value)  {
        return JnaSettings.INST().g_settings_set_double(asCPointer(), key, value);
    }

    /**
     * Looks up the enumerated type nick for &#64;value and writes it to &#64;key,
     * <br>within &#64;settings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as an enumerated type, or for
     * <br>&#64;value not to be a valid value for the named type.
     * <br>
     * <br>After performing the write, accessing &#64;key directly with
     * <br>g_settings_get_string() will return the 'nick' associated with
     * <br>&#64;value.
     * @param key a key, within &#64;settings
     * @param value an enumerated value
     * @return %TRUE, if the set succeeds
    */
    public boolean setEnum(@Nonnull ch.bailu.gtk.type.Str key, int value)  {
        return JnaSettings.INST().g_settings_set_enum(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Looks up the enumerated type nick for &#64;value and writes it to &#64;key,
     * <br>within &#64;settings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as an enumerated type, or for
     * <br>&#64;value not to be a valid value for the named type.
     * <br>
     * <br>After performing the write, accessing &#64;key directly with
     * <br>g_settings_get_string() will return the 'nick' associated with
     * <br>&#64;value.
     * @param key a key, within &#64;settings
     * @param value an enumerated value
     * @return %TRUE, if the set succeeds
    */
    public boolean setEnum(String key, int value)  {
        return JnaSettings.INST().g_settings_set_enum(asCPointer(), key, value);
    }

    /**
     * Looks up the flags type nicks for the bits specified by &#64;value, puts
     * <br>them in an array of strings and writes the array to &#64;key, within
     * <br>&#64;settings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as a flags type, or for &#64;value
     * <br>to contain any bits that are not value for the named type.
     * <br>
     * <br>After performing the write, accessing &#64;key directly with
     * <br>g_settings_get_strv() will return an array of 'nicks'; one for each
     * <br>bit in &#64;value.
     * @param key a key, within &#64;settings
     * @param value a flags value
     * @return %TRUE, if the set succeeds
    */
    public boolean setFlags(@Nonnull ch.bailu.gtk.type.Str key, int value)  {
        return JnaSettings.INST().g_settings_set_flags(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Looks up the flags type nicks for the bits specified by &#64;value, puts
     * <br>them in an array of strings and writes the array to &#64;key, within
     * <br>&#64;settings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or is not marked as a flags type, or for &#64;value
     * <br>to contain any bits that are not value for the named type.
     * <br>
     * <br>After performing the write, accessing &#64;key directly with
     * <br>g_settings_get_strv() will return an array of 'nicks'; one for each
     * <br>bit in &#64;value.
     * @param key a key, within &#64;settings
     * @param value a flags value
     * @return %TRUE, if the set succeeds
    */
    public boolean setFlags(String key, int value)  {
        return JnaSettings.INST().g_settings_set_flags(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 32-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int32 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setInt(@Nonnull ch.bailu.gtk.type.Str key, int value)  {
        return JnaSettings.INST().g_settings_set_int(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 32-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int32 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setInt(String key, int value)  {
        return JnaSettings.INST().g_settings_set_int(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 64-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int64 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setInt64(@Nonnull ch.bailu.gtk.type.Str key, long value)  {
        return JnaSettings.INST().g_settings_set_int64(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 64-bit integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a int64 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setInt64(String key, long value)  {
        return JnaSettings.INST().g_settings_set_int64(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for strings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a string type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setString(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str value)  {
        return JnaSettings.INST().g_settings_set_string(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(value));
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for strings.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a string type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setString(String key, String value)  {
        return JnaSettings.INST().g_settings_set_string(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 32-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint32 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setUint(@Nonnull ch.bailu.gtk.type.Str key, int value)  {
        return JnaSettings.INST().g_settings_set_uint(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 32-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint32 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setUint(String key, int value)  {
        return JnaSettings.INST().g_settings_set_uint(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 64-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint64 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setUint64(@Nonnull ch.bailu.gtk.type.Str key, long value)  {
        return JnaSettings.INST().g_settings_set_uint64(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>A convenience variant of g_settings_set() for 64-bit unsigned
     * <br>integers.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't specified as
     * <br>having a uint64 type in the schema for &#64;settings.
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setUint64(String key, long value)  {
        return JnaSettings.INST().g_settings_set_uint64(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for &#64;value to have the incorrect type, per
     * <br>the schema.
     * <br>
     * <br>If &#64;value is floating then this function consumes the reference.
     * @param key the name of the key to set
     * @param value a &#35;GVariant of the correct type
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setValue(@Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.glib.Variant value)  {
        return JnaSettings.INST().g_settings_set_value(asCPointer(), asCPointerNotNull(key), asCPointerNotNull(value));
    }

    /**
     * Sets &#64;key in &#64;settings to &#64;value.
     * <br>
     * <br>It is a programmer error to give a &#64;key that isn't contained in the
     * <br>schema for &#64;settings or for &#64;value to have the incorrect type, per
     * <br>the schema.
     * <br>
     * <br>If &#64;value is floating then this function consumes the reference.
     * @param key the name of the key to set
     * @param value a &#35;GVariant of the correct type
     * @return %TRUE if setting the key succeeded,     %FALSE if the key was not writable
    */
    public boolean setValue(String key, @Nonnull ch.bailu.gtk.glib.Variant value)  {
        return JnaSettings.INST().g_settings_set_value(asCPointer(), key, asCPointerNotNull(value));
    }

    public final static String SIGNAL_ON_CHANGE_EVENT = "change-event";
    
    /**
     * Connect to signal "change-event".
     * <br>See {@link OnChangeEvent#onChangeEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGE_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChangeEvent(OnChangeEvent signal) {
        return connectSignal(SIGNAL_ON_CHANGE_EVENT, toOnChangeEvent(signal));
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_WRITABLE_CHANGE_EVENT = "writable-change-event";
    
    /**
     * Connect to signal "writable-change-event".
     * <br>See {@link OnWritableChangeEvent#onWritableChangeEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_WRITABLE_CHANGE_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onWritableChangeEvent(OnWritableChangeEvent signal) {
        return connectSignal(SIGNAL_ON_WRITABLE_CHANGE_EVENT, toOnWritableChangeEvent(signal));
    }

    public final static String SIGNAL_ON_WRITABLE_CHANGED = "writable-changed";
    
    /**
     * Connect to signal "writable-changed".
     * <br>See {@link OnWritableChanged#onWritableChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_WRITABLE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onWritableChanged(OnWritableChanged signal) {
        return connectSignal(SIGNAL_ON_WRITABLE_CHANGED, toOnWritableChanged(signal));
    }

    /**
     * Ensures that all pending operations are complete for the default backend.
     * <br>
     * <br>Writes made to a &#35;GSettings are handled asynchronously.  For this
     * <br>reason, it is very unlikely that the changes have it to disk by the
     * <br>time g_settings_set() returns.
     * <br>
     * <br>This call will block until all of the writes have made it to the
     * <br>backend.  Since the mainloop is not running, no change notifications
     * <br>will be dispatched during this call (but some may be queued by the
     * <br>time the call is done).
    */
    public static void sync()  {
        JnaSettings.INST().g_settings_sync();
    }

    /**
     * Removes an existing binding for &#64;property on &#64;object.
     * <br>
     * <br>Note that bindings are automatically removed when the
     * <br>object is finalized, so it is rarely necessary to call this
     * <br>function.
     * @param object the object
     * @param property the property whose binding is removed
    */
    public static void unbind(@Nonnull ch.bailu.gtk.type.Pointer object, @Nonnull ch.bailu.gtk.type.Str property)  {
        JnaSettings.INST().g_settings_unbind(asCPointerNotNull(object), asCPointerNotNull(property));
    }

    public static long getTypeID() { 
        return JnaSettings.INST().g_settings_get_type(); 
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

[MethodModel:cb-not-supported:getMapped:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:SettingsGetMapping:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:getRange:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getStrv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:listChildren:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:cb-deprecated:cb-return-value-not-supported:listKeys:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:cb-deprecated:rangeCheck:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[MethodModel:java-type-not-supported:setStrv:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]

[MethodModel:cb-deprecated:cb-return-value-not-supported:listRelocatableSchemas:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:cb-deprecated:cb-return-value-not-supported:listSchemas:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]
*/
