/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Gtk extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gtk.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPrinterFunc {
        /**
         * The type of function passed to gtk_enumerate_printers().
         * <br>
         * <br>Note that you need to ref &#64;printer, if you want to keep
         * <br>a reference to it after the function has returned.
         * @param printer a `GtkPrinter`
         * @param data user data passed to gtk_enumerate_printers()
         * @return %TRUE to stop the enumeration, %FALSE to continue
        */
        boolean onPrinterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Printer printer, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaGtk.OnPrinterFunc toOnPrinterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrinterFunc in) {
        JnaGtk.OnPrinterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_printer, _data) -> in.onPrinterFunc(__callback, new Printer(new PointerContainer(_printer)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaGtk.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaGtk.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPageSetupDoneFunc {
        /**
         * The type of function that is passed to
         * <br>gtk_print_run_page_setup_dialog_async().
         * <br>
         * <br>This function will be called when the page setup dialog
         * <br>is dismissed, and also serves as destroy notify for &#64;data.
         * @param page_setup the `GtkPageSetup` that has been passed to   gtk_print_run_page_setup_dialog_async()
         * @param data user data that has been passed to   gtk_print_run_page_setup_dialog_async()
        */
        void onPageSetupDoneFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PageSetup page_setup, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaGtk.OnPageSetupDoneFunc toOnPageSetupDoneFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnPageSetupDoneFunc in) {
        JnaGtk.OnPageSetupDoneFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_page_setup, _data) -> in.onPageSetupDoneFunc(__callback, new PageSetup(new PointerContainer(_page_setup)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull ch.bailu.gtk.gio.AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGtk.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaGtk.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Gets the modifier mask.
     * <br>
     * <br>The modifier mask determines which modifiers are considered significant
     * <br>for keyboard accelerators. This includes all keyboard modifiers except
     * <br>for %GDK_LOCK_MASK.
     * @return the modifier mask for accelerators
    */
    public static int acceleratorGetDefaultModMask()  {
        return JnaGtk.INST().gtk_accelerator_get_default_mod_mask();
    }

    /**
     * Converts an accelerator keyval and modifier mask into a string
     * <br>which can be used to represent the accelerator to the user.
     * @param accelerator_key accelerator keyval
     * @param accelerator_mods accelerator modifier mask
     * @return a newly-allocated string representing the accelerator
    */
    public static ch.bailu.gtk.type.Str acceleratorGetLabel(int accelerator_key, int accelerator_mods)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_accelerator_get_label(accelerator_key, accelerator_mods)));
    }

    /**
     * Converts an accelerator keyval and modifier mask
     * <br>into a string that can be displayed to the user.
     * <br>
     * <br>The string may be translated.
     * <br>
     * <br>This function is similar to [func&#64;Gtk.accelerator_get_label],
     * <br>but handling keycodes. This is only useful for system-level
     * <br>components, applications should use [func&#64;Gtk.accelerator_get_label]
     * <br>instead.
     * @param display a `GdkDisplay` or %NULL to use the default display
     * @param accelerator_key accelerator keyval
     * @param keycode accelerator keycode
     * @param accelerator_mods accelerator modifier mask
     * @return a newly-allocated string representing the accelerator
    */
    public static ch.bailu.gtk.type.Str acceleratorGetLabelWithKeycode(@Nullable ch.bailu.gtk.gdk.Display display, int accelerator_key, int keycode, int accelerator_mods)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_accelerator_get_label_with_keycode(asCPointer(display), accelerator_key, keycode, accelerator_mods)));
    }

    /**
     * Converts an accelerator keyval and modifier mask into a string
     * <br>parseable by gtk_accelerator_parse().
     * <br>
     * <br>For example, if you pass in %GDK_KEY_q and %GDK_CONTROL_MASK,
     * <br>this function returns `&lt;Control&gt;q`.
     * <br>
     * <br>If you need to display accelerators in the user interface,
     * <br>see [func&#64;Gtk.accelerator_get_label].
     * @param accelerator_key accelerator keyval
     * @param accelerator_mods accelerator modifier mask
     * @return a newly-allocated accelerator name
    */
    public static ch.bailu.gtk.type.Str acceleratorName(int accelerator_key, int accelerator_mods)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_accelerator_name(accelerator_key, accelerator_mods)));
    }

    /**
     * Converts an accelerator keyval and modifier mask
     * <br>into a string parseable by gtk_accelerator_parse_with_keycode().
     * <br>
     * <br>This is similar to [func&#64;Gtk.accelerator_name] but handling keycodes.
     * <br>This is only useful for system-level components, applications
     * <br>should use [func&#64;Gtk.accelerator_name] instead.
     * @param display a `GdkDisplay` or %NULL to use the default display
     * @param accelerator_key accelerator keyval
     * @param keycode accelerator keycode
     * @param accelerator_mods accelerator modifier mask
     * @return a newly allocated accelerator name.
    */
    public static ch.bailu.gtk.type.Str acceleratorNameWithKeycode(@Nullable ch.bailu.gtk.gdk.Display display, int accelerator_key, int keycode, int accelerator_mods)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_accelerator_name_with_keycode(asCPointer(display), accelerator_key, keycode, accelerator_mods)));
    }

    /**
     * Determines whether a given keyval and modifier mask constitute
     * <br>a valid keyboard accelerator.
     * <br>
     * <br>For example, the %GDK_KEY_a keyval plus %GDK_CONTROL_MASK mark is valid,
     * <br>and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
     * <br>the %GDK_KEY_Control_L keyval as an accelerator.
     * @param keyval a GDK keyval
     * @param modifiers modifier mask
     * @return %TRUE if the accelerator is valid
    */
    public static boolean acceleratorValid(int keyval, int modifiers)  {
        return JnaGtk.INST().gtk_accelerator_valid(keyval, modifiers);
    }

    /**
     * 
     * @param property 
     * @param value 
    */
    public static void accessiblePropertyInitValue(int property, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaGtk.INST().gtk_accessible_property_init_value(property, asCPointerNotNull(value));
    }

    /**
     * 
     * @param relation 
     * @param value 
    */
    public static void accessibleRelationInitValue(int relation, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaGtk.INST().gtk_accessible_relation_init_value(relation, asCPointerNotNull(value));
    }

    /**
     * 
     * @param state 
     * @param value 
    */
    public static void accessibleStateInitValue(int state, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaGtk.INST().gtk_accessible_state_init_value(state, asCPointerNotNull(value));
    }

    /**
     * 
     * @return 
    */
    public static int builderErrorQuark()  {
        return JnaGtk.INST().gtk_builder_error_quark();
    }

    /**
     * Checks that the GTK library in use is compatible with the
     * <br>given version.
     * <br>
     * <br>Generally you would pass in the constants %GTK_MAJOR_VERSION,
     * <br>%GTK_MINOR_VERSION, %GTK_MICRO_VERSION as the three arguments
     * <br>to this function; that produces a check that the library in
     * <br>use is compatible with the version of GTK the application or
     * <br>module was compiled against.
     * <br>
     * <br>Compatibility is defined by two things: first the version
     * <br>of the running library is newer than the version
     * <br>&#64;required_major.required_minor.&#64;required_micro. Second
     * <br>the running library must be binary compatible with the
     * <br>version &#64;required_major.required_minor.&#64;required_micro
     * <br>(same major version.)
     * <br>
     * <br>This function is primarily for GTK modules; the module
     * <br>can call this function to check that it wasn’t loaded
     * <br>into an incompatible version of GTK. However, such a
     * <br>check isn’t completely reliable, since the module may be
     * <br>linked against an old version of GTK and calling the
     * <br>old version of gtk_check_version(), but still get loaded
     * <br>into an application using a newer version of GTK.
     * @param required_major the required major version
     * @param required_minor the required minor version
     * @param required_micro the required micro version
     * @return %NULL if the GTK library is compatible with the   given version, or a string describing the version mismatch.   The returned string is owned by GTK and should not be modified   or freed.
    */
    public static ch.bailu.gtk.type.Str checkVersion(int required_major, int required_minor, int required_micro)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_check_version(required_major, required_minor, required_micro)));
    }

    /**
     * 
     * @return 
    */
    public static int constraintVflParserErrorQuark()  {
        return JnaGtk.INST().gtk_constraint_vfl_parser_error_quark();
    }

    /**
     * 
     * @return 
    */
    public static int cssParserErrorQuark()  {
        return JnaGtk.INST().gtk_css_parser_error_quark();
    }

    /**
     * 
     * @return 
    */
    public static int cssParserWarningQuark()  {
        return JnaGtk.INST().gtk_css_parser_warning_quark();
    }

    /**
     * Prevents [id&#64;gtk_init] and [id&#64;gtk_init_check] from automatically calling
     * <br>`setlocale (LC_ALL, &quot;&quot;)`.
     * <br>
     * <br>You would want to use this function if you wanted to set the locale for
     * <br>your program to something other than the user’s locale, or if
     * <br>you wanted to set different values for different locale categories.
     * <br>
     * <br>Most programs should not need to call this function.
    */
    public static void disableSetlocale()  {
        JnaGtk.INST().gtk_disable_setlocale();
    }

    /**
     * Gets a property of the `GtkEditable` delegate for &#64;object.
     * <br>
     * <br>This is helper function that should be called in the `get_property`
     * <br>function of your `GtkEditable` implementation, before handling your
     * <br>own properties.
     * @param object a `GObject`
     * @param prop_id a property ID
     * @param value value to set
     * @param pspec the `GParamSpec` for the property
     * @return %TRUE if the property was found
    */
    public static boolean editableDelegateGetProperty(@Nonnull ch.bailu.gtk.gobject.Object object, int prop_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        return JnaGtk.INST().gtk_editable_delegate_get_property(asCPointerNotNull(object), prop_id, asCPointerNotNull(value), asCPointerNotNull(pspec));
    }

    /**
     * Sets a property on the `GtkEditable` delegate for &#64;object.
     * <br>
     * <br>This is a helper function that should be called in the `set_property`
     * <br>function of your `GtkEditable` implementation, before handling your
     * <br>own properties.
     * @param object a `GObject`
     * @param prop_id a property ID
     * @param value value to set
     * @param pspec the `GParamSpec` for the property
     * @return %TRUE if the property was found
    */
    public static boolean editableDelegateSetProperty(@Nonnull ch.bailu.gtk.gobject.Object object, int prop_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        return JnaGtk.INST().gtk_editable_delegate_set_property(asCPointerNotNull(object), prop_id, asCPointerNotNull(value), asCPointerNotNull(pspec));
    }

    /**
     * Overrides the `GtkEditable` properties for &#64;class.
     * <br>
     * <br>This is a helper function that should be called in class_init,
     * <br>after installing your own properties.
     * <br>
     * <br>Note that your class must have &quot;text&quot;, &quot;cursor-position&quot;,
     * <br>&quot;selection-bound&quot;, &quot;editable&quot;, &quot;width-chars&quot;, &quot;max-width-chars&quot;,
     * <br>&quot;xalign&quot; and &quot;enable-undo&quot; properties for this function to work.
     * <br>
     * <br>To handle the properties in your set_property and get_property
     * <br>functions, you can either use [func&#64;Gtk.Editable.delegate_set_property]
     * <br>and [func&#64;Gtk.Editable.delegate_get_property] (if you are using
     * <br>a delegate), or remember the &#64;first_prop offset and add it to the
     * <br>values in the [enum&#64;Gtk.EditableProperties] enumeration to get the
     * <br>property IDs for these properties.
     * @param object_class a `GObjectClass`
     * @param first_prop property ID to use for the first property
     * @return the number of properties that were installed
    */
    public static int editableInstallProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass object_class, int first_prop)  {
        return JnaGtk.INST().gtk_editable_install_properties(asCPointerNotNull(object_class), first_prop);
    }

    /**
     * Calls a function for all `GtkPrinter`s.
     * <br>
     * <br>If &#64;func returns %TRUE, the enumeration is stopped.
     * @param func a function to call for each printer
     * @param data user data to pass to &#64;func
     * @param destroy function to call if &#64;data is no longer needed
     * @param wait if %TRUE, wait in a recursive mainloop until    all printers are enumerated; otherwise return early
    */
    public static void enumeratePrinters(OnPrinterFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy, boolean wait)  {
        JnaGtk.INST().gtk_enumerate_printers(toOnPrinterFunc(getClassHandler().getInstance(), "enumeratePrinters", func), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "enumeratePrinters", destroy), wait);
    }

    /**
     * Registers an error quark for `GtkFileChooser` errors.
     * @return The error quark used for `GtkFileChooser` errors.
    */
    public static int fileChooserErrorQuark()  {
        return JnaGtk.INST().gtk_file_chooser_error_quark();
    }

    /**
     * Returns the binary age as passed to `libtool`.
     * <br>
     * <br>If `libtool` means nothing to you, don't worry about it.
     * @return the binary age of the GTK library
    */
    public static int getBinaryAge()  {
        return JnaGtk.INST().gtk_get_binary_age();
    }

    /**
     * Returns the GTK debug flags that are currently active.
     * <br>
     * <br>This function is intended for GTK modules that want
     * <br>to adjust their debug output based on GTK debug flags.
     * @return the GTK debug flags.
    */
    public static int getDebugFlags()  {
        return JnaGtk.INST().gtk_get_debug_flags();
    }

    /**
     * Returns the `PangoLanguage` for the default language
     * <br>currently in effect.
     * <br>
     * <br>Note that this can change over the life of an
     * <br>application.
     * <br>
     * <br>The default language is derived from the current
     * <br>locale. It determines, for example, whether GTK uses
     * <br>the right-to-left or left-to-right text direction.
     * <br>
     * <br>This function is equivalent to
     * <br>[func&#64;Pango.Language.get_default].
     * <br>See that function for details.
     * @return the default language as a   `PangoLanguage`
    */
    public static ch.bailu.gtk.pango.Language getDefaultLanguage()  {
        return new ch.bailu.gtk.pango.Language(new PointerContainer(JnaGtk.INST().gtk_get_default_language()));
    }

    /**
     * Returns the interface age as passed to `libtool`.
     * <br>
     * <br>If `libtool` means nothing to you, don't worry about it.
     * @return the interface age of the GTK library
    */
    public static int getInterfaceAge()  {
        return JnaGtk.INST().gtk_get_interface_age();
    }

    /**
     * Get the direction of the current locale. This is the expected
     * <br>reading direction for text and UI.
     * <br>
     * <br>This function depends on the current locale being set with
     * <br>setlocale() and will default to setting the %GTK_TEXT_DIR_LTR
     * <br>direction otherwise. %GTK_TEXT_DIR_NONE will never be returned.
     * <br>
     * <br>GTK sets the default text direction according to the locale
     * <br>during gtk_init(), and you should normally use
     * <br>gtk_widget_get_direction() or gtk_widget_get_default_direction()
     * <br>to obtain the current direction.
     * <br>
     * <br>This function is only needed rare cases when the locale is
     * <br>changed after GTK has already been initialized. In this case,
     * <br>you can use it to update the default text direction as follows:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * &#35;include &lt;locale.h&gt;
     * 
     * static void
     * update_locale (const char *new_locale)
     * {
     *   setlocale (LC_ALL, new_locale);
     *   GtkTextDirection direction = gtk_get_locale_direction ();
     *   gtk_widget_set_default_direction (direction);
     * }
     * </pre>
     * @return the `GtkTextDirection` of the current locale
    */
    public static int getLocaleDirection()  {
        return JnaGtk.INST().gtk_get_locale_direction();
    }

    /**
     * Returns the major version number of the GTK library.
     * <br>
     * <br>For example, in GTK version 3.1.5 this is 3.
     * <br>
     * <br>This function is in the library, so it represents the GTK library
     * <br>your code is running against. Contrast with the %GTK_MAJOR_VERSION
     * <br>macro, which represents the major version of the GTK headers you
     * <br>have included when compiling your code.
     * @return the major version number of the GTK library
    */
    public static int getMajorVersion()  {
        return JnaGtk.INST().gtk_get_major_version();
    }

    /**
     * Returns the micro version number of the GTK library.
     * <br>
     * <br>For example, in GTK version 3.1.5 this is 5.
     * <br>
     * <br>This function is in the library, so it represents the GTK library
     * <br>your code is are running against. Contrast with the
     * <br>%GTK_MICRO_VERSION macro, which represents the micro version of the
     * <br>GTK headers you have included when compiling your code.
     * @return the micro version number of the GTK library
    */
    public static int getMicroVersion()  {
        return JnaGtk.INST().gtk_get_micro_version();
    }

    /**
     * Returns the minor version number of the GTK library.
     * <br>
     * <br>For example, in GTK version 3.1.5 this is 1.
     * <br>
     * <br>This function is in the library, so it represents the GTK library
     * <br>your code is are running against. Contrast with the
     * <br>%GTK_MINOR_VERSION macro, which represents the minor version of the
     * <br>GTK headers you have included when compiling your code.
     * @return the minor version number of the GTK library
    */
    public static int getMinorVersion()  {
        return JnaGtk.INST().gtk_get_minor_version();
    }

    /**
     * Converts a color from HSV space to RGB.
     * <br>
     * <br>Input values must be in the [0.0, 1.0] range;
     * <br>output values will be in the same range.
     * @param h Hue
     * @param s Saturation
     * @param v Value
     * @param r Return value for the red component
     * @param g Return value for the green component
     * @param b Return value for the blue component
    */
    public static void hsvToRgb(float h, float s, float v, @Nonnull ch.bailu.gtk.type.Flt r, @Nonnull ch.bailu.gtk.type.Flt g, @Nonnull ch.bailu.gtk.type.Flt b)  {
        JnaGtk.INST().gtk_hsv_to_rgb(h, s, v, asCPointerNotNull(r), asCPointerNotNull(g), asCPointerNotNull(b));
    }

    /**
     * 
     * @return 
    */
    public static int iconThemeErrorQuark()  {
        return JnaGtk.INST().gtk_icon_theme_error_quark();
    }

    /**
     * Call this function before using any other GTK functions in your GUI
     * <br>applications.  It will initialize everything needed to operate the
     * <br>toolkit.
     * <br>
     * <br>If you are using `GtkApplication`, you don't have to call gtk_init()
     * <br>or gtk_init_check(); the `GApplication::startup` handler
     * <br>does it for you.
     * <br>
     * <br>This function will terminate your program if it was unable to
     * <br>initialize the windowing system for some reason. If you want
     * <br>your program to fall back to a textual interface you want to
     * <br>call gtk_init_check() instead.
     * <br>
     * <br>GTK calls `signal (SIGPIPE, SIG_IGN)`
     * <br>during initialization, to ignore SIGPIPE signals, since these are
     * <br>almost never wanted in graphical applications. If you do need to
     * <br>handle SIGPIPE for some reason, reset the handler after gtk_init(),
     * <br>but notice that other libraries (e.g. libdbus or gvfs) might do
     * <br>similar things.
    */
    public static void init()  {
        JnaGtk.INST().gtk_init();
    }

    /**
     * This function does the same work as gtk_init() with only a single
     * <br>change: It does not terminate the program if the windowing system
     * <br>can’t be initialized. Instead it returns %FALSE on failure.
     * <br>
     * <br>This way the application can fall back to some other means of
     * <br>communication with the user - for example a curses or command line
     * <br>interface.
     * @return %TRUE if the windowing system has been successfully   initialized, %FALSE otherwise
    */
    public static boolean initCheck()  {
        return JnaGtk.INST().gtk_init_check();
    }

    /**
     * Use this function to check if GTK has been initialized with gtk_init()
     * <br>or gtk_init_check().
     * @return the initialization status
    */
    public static boolean isInitialized()  {
        return JnaGtk.INST().gtk_is_initialized();
    }

    /**
     * Finds the `GtkNative` associated with the surface.
     * @param surface a `GdkSurface`
     * @return the `GtkNative` that is associated with &#64;surface
    */
    public static Native nativeGetForSurface(@Nonnull ch.bailu.gtk.gdk.Surface surface)  {
        return new Native(new PointerContainer(JnaGtk.INST().gtk_native_get_for_surface(asCPointerNotNull(surface))));
    }

    /**
     * Converts the result of a `GCompareFunc` like strcmp() to a
     * <br>`GtkOrdering` value.
     * @param cmpfunc_result Result of a comparison function
     * @return the corresponding `GtkOrdering`
    */
    public static int orderingFromCmpfunc(int cmpfunc_result)  {
        return JnaGtk.INST().gtk_ordering_from_cmpfunc(cmpfunc_result);
    }

    /**
     * Returns the name of the default paper size, which
     * <br>depends on the current locale.
     * @return the name of the default paper size. The string is owned by GTK and should not be modified.
    */
    public static ch.bailu.gtk.type.Str paperSizeGetDefault()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_paper_size_get_default()));
    }

    /**
     * Creates a list of known paper sizes.
     * @param include_custom whether to include custom paper sizes   as defined in the page setup dialog
     * @return a newly allocated list of newly    allocated `GtkPaperSize` objects
    */
    public static ch.bailu.gtk.glib.List paperSizeGetPaperSizes(boolean include_custom)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaGtk.INST().gtk_paper_size_get_paper_sizes(include_custom)));
    }

    /**
     * Creates a new `GParamSpec` instance for a property holding a `GtkExpression`.
     * <br>
     * <br>See `g_param_spec_internal()` for details on the property strings.
     * @param name canonical name of the property
     * @param nick a user-readable name for the property
     * @param blurb a user-readable description of the property
     * @param flags flags for the property
     * @return a newly created property specification
    */
    public static ch.bailu.gtk.gobject.ParamSpec paramSpecExpression(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str nick, @Nonnull ch.bailu.gtk.type.Str blurb, int flags)  {
        return new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(JnaGtk.INST().gtk_param_spec_expression(asCPointerNotNull(name), asCPointerNotNull(nick), asCPointerNotNull(blurb), flags)));
    }

    /**
     * Registers an error quark for `GtkPrintOperation` if necessary.
     * @return The error quark used for `GtkPrintOperation` errors.
    */
    public static int printErrorQuark()  {
        return JnaGtk.INST().gtk_print_error_quark();
    }

    /**
     * Runs a page setup dialog, letting the user modify the values from
     * <br>&#64;page_setup. If the user cancels the dialog, the returned `GtkPageSetup`
     * <br>is identical to the passed in &#64;page_setup, otherwise it contains the
     * <br>modifications done in the dialog.
     * <br>
     * <br>Note that this function may use a recursive mainloop to show the page
     * <br>setup dialog. See gtk_print_run_page_setup_dialog_async() if this is
     * <br>a problem.
     * @param parent transient parent
     * @param page_setup an existing `GtkPageSetup`
     * @param settings a `GtkPrintSettings`
     * @return a new `GtkPageSetup`
    */
    public static PageSetup printRunPageSetupDialog(@Nullable Window parent, @Nullable PageSetup page_setup, @Nonnull PrintSettings settings)  {
        return new PageSetup(new PointerContainer(JnaGtk.INST().gtk_print_run_page_setup_dialog(asCPointer(parent), asCPointer(page_setup), asCPointerNotNull(settings))));
    }

    /**
     * Runs a page setup dialog, letting the user modify the values from &#64;page_setup.
     * <br>
     * <br>In contrast to gtk_print_run_page_setup_dialog(), this function  returns after
     * <br>showing the page setup dialog on platforms that support this, and calls &#64;done_cb
     * <br>from a signal handler for the ::response signal of the dialog.
     * @param parent transient parent
     * @param page_setup an existing `GtkPageSetup`
     * @param settings a `GtkPrintSettings`
     * @param done_cb a function to call when the user saves    the modified page setup
     * @param data user data to pass to &#64;done_cb
    */
    public static void printRunPageSetupDialogAsync(@Nullable Window parent, @Nullable PageSetup page_setup, @Nonnull PrintSettings settings, OnPageSetupDoneFunc done_cb, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaGtk.INST().gtk_print_run_page_setup_dialog_async(asCPointer(parent), asCPointer(page_setup), asCPointerNotNull(settings), toOnPageSetupDoneFunc(getClassHandler().getInstance(), "printRunPageSetupDialogAsync", done_cb), asCPointer(data));
    }

    /**
     * 
     * @return 
    */
    public static int recentManagerErrorQuark()  {
        return JnaGtk.INST().gtk_recent_manager_error_quark();
    }

    /**
     * Renders an activity indicator (such as in `GtkSpinner`).
     * <br>The state %GTK_STATE_FLAG_CHECKED determines whether there is
     * <br>activity going on.
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderActivity(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_activity(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders an arrow pointing to &#64;angle.
     * <br>
     * <br>Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
     * <br>
     * <br>![](arrows.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param angle arrow angle from 0 to 2 * %G_PI, being 0 the arrow pointing to the north
     * @param x X origin of the render area
     * @param y Y origin of the render area
     * @param size square side for render area
    */
    public static void renderArrow(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double angle, double x, double y, double size)  {
        JnaGtk.INST().gtk_render_arrow(asCPointerNotNull(context), asCPointerNotNull(cr), angle, x, y, size);
    }

    /**
     * Renders the background of an element.
     * <br>
     * <br>Typical background rendering, showing the effect of
     * <br>`background-image`, `border-width` and `border-radius`:
     * <br>
     * <br>![](background.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderBackground(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_background(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders a checkmark (as in a `GtkCheckButton`).
     * <br>
     * <br>The %GTK_STATE_FLAG_CHECKED state determines whether the check is
     * <br>on or off, and %GTK_STATE_FLAG_INCONSISTENT determines whether it
     * <br>should be marked as undefined.
     * <br>
     * <br>Typical checkmark rendering:
     * <br>
     * <br>![](checks.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderCheck(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_check(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders an expander (as used in `GtkTreeView` and `GtkExpander`) in the area
     * <br>defined by &#64;x, &#64;y, &#64;width, &#64;height. The state %GTK_STATE_FLAG_CHECKED
     * <br>determines whether the expander is collapsed or expanded.
     * <br>
     * <br>Typical expander rendering:
     * <br>
     * <br>![](expanders.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderExpander(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_expander(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders a focus indicator on the rectangle determined by &#64;x, &#64;y, &#64;width, &#64;height.
     * <br>
     * <br>Typical focus rendering:
     * <br>
     * <br>![](focus.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderFocus(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_focus(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders a frame around the rectangle defined by &#64;x, &#64;y, &#64;width, &#64;height.
     * <br>
     * <br>Examples of frame rendering, showing the effect of `border-image`,
     * <br>`border-color`, `border-width`, `border-radius` and junctions:
     * <br>
     * <br>![](frames.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderFrame(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_frame(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders a handle (as in `GtkPaned` and `GtkWindow`’s resize grip),
     * <br>in the rectangle determined by &#64;x, &#64;y, &#64;width, &#64;height.
     * <br>
     * <br>Handles rendered for the paned and grip classes:
     * <br>
     * <br>![](handles.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderHandle(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_handle(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Renders the icon in &#64;texture at the specified &#64;x and &#64;y coordinates.
     * <br>
     * <br>This function will render the icon in &#64;texture at exactly its size,
     * <br>regardless of scaling factors, which may not be appropriate when
     * <br>drawing on displays with high pixel densities.
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param texture a `GdkTexture` containing the icon to draw
     * @param x X position for the &#64;texture
     * @param y Y position for the &#64;texture
    */
    public static void renderIcon(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.gdk.Texture texture, double x, double y)  {
        JnaGtk.INST().gtk_render_icon(asCPointerNotNull(context), asCPointerNotNull(cr), asCPointerNotNull(texture), x, y);
    }

    /**
     * Renders &#64;layout on the coordinates &#64;x, &#64;y
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin
     * @param y Y origin
     * @param layout the `PangoLayout` to render
    */
    public static void renderLayout(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, @Nonnull ch.bailu.gtk.pango.Layout layout)  {
        JnaGtk.INST().gtk_render_layout(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, asCPointerNotNull(layout));
    }

    /**
     * Renders a line from (x0, y0) to (x1, y1).
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x0 X coordinate for the origin of the line
     * @param y0 Y coordinate for the origin of the line
     * @param x1 X coordinate for the end of the line
     * @param y1 Y coordinate for the end of the line
    */
    public static void renderLine(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x0, double y0, double x1, double y1)  {
        JnaGtk.INST().gtk_render_line(asCPointerNotNull(context), asCPointerNotNull(cr), x0, y0, x1, y1);
    }

    /**
     * Renders an option mark (as in a radio button), the %GTK_STATE_FLAG_CHECKED
     * <br>state will determine whether the option is on or off, and
     * <br>%GTK_STATE_FLAG_INCONSISTENT whether it should be marked as undefined.
     * <br>
     * <br>Typical option mark rendering:
     * <br>
     * <br>![](options.png)
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
    */
    public static void renderOption(@Nonnull StyleContext context, @Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaGtk.INST().gtk_render_option(asCPointerNotNull(context), asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Converts a color from RGB space to HSV.
     * <br>
     * <br>Input values must be in the [0.0, 1.0] range;
     * <br>output values will be in the same range.
     * @param r Red
     * @param g Green
     * @param b Blue
     * @param h Return value for the hue component
     * @param s Return value for the saturation component
     * @param v Return value for the value component
    */
    public static void rgbToHsv(float r, float g, float b, @Nonnull ch.bailu.gtk.type.Flt h, @Nonnull ch.bailu.gtk.type.Flt s, @Nonnull ch.bailu.gtk.type.Flt v)  {
        JnaGtk.INST().gtk_rgb_to_hsv(r, g, b, asCPointerNotNull(h), asCPointerNotNull(s), asCPointerNotNull(v));
    }

    /**
     * Sets the GTK debug flags.
     * @param flags the debug flags to set
    */
    public static void setDebugFlags(int flags)  {
        JnaGtk.INST().gtk_set_debug_flags(flags);
    }

    /**
     * A convenience function for showing an application’s about dialog.
     * <br>
     * <br>The constructed dialog is associated with the parent window and
     * <br>reused for future invocations of this function.
     * @param parent the parent top-level window
     * @param first_property_name the name of the first property
     * @param _elipse value of first property, followed by more pairs of property   name and value, `NULL`-terminated
    */
    public static void showAboutDialog(@Nullable Window parent, @Nonnull ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        JnaGtk.INST().gtk_show_about_dialog(asCPointer(parent), asCPointerNotNull(first_property_name), _elipse);
    }

    /**
     * This function launches the default application for showing
     * <br>a given uri, or shows an error dialog if that fails.
     * @param parent parent window
     * @param uri the uri to show
     * @param timestamp timestamp from the event that triggered this call, or %GDK_CURRENT_TIME
    */
    public static void showUri(@Nullable Window parent, @Nonnull ch.bailu.gtk.type.Str uri, int timestamp)  {
        JnaGtk.INST().gtk_show_uri(asCPointer(parent), asCPointerNotNull(uri), timestamp);
    }

    /**
     * This function launches the default application for showing
     * <br>a given uri.
     * <br>
     * <br>The &#64;callback will be called when the launch is completed.
     * <br>It should call gtk_show_uri_full_finish() to obtain the result.
     * <br>
     * <br>This is the recommended call to be used as it passes information
     * <br>necessary for sandbox helpers to parent their dialogs properly.
     * @param parent parent window
     * @param uri the uri to show
     * @param timestamp timestamp from the event that triggered this call, or %GDK_CURRENT_TIME
     * @param cancellable a `GCancellable` to cancel the launch
     * @param callback a callback to call when the action is complete
     * @param user_data data to pass to &#64;callback
    */
    public static void showUriFull(@Nullable Window parent, @Nonnull ch.bailu.gtk.type.Str uri, int timestamp, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGtk.INST().gtk_show_uri_full(asCPointer(parent), asCPointerNotNull(uri), timestamp, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "showUriFull", callback), asCPointer(user_data));
    }

    /**
     * Finishes the gtk_show_uri() call and returns the result
     * <br>of the operation.
     * @param parent the `GtkWindow` passed to gtk_show_uri()
     * @param result `GAsyncResult` that was passed to &#64;callback
     * @return %TRUE if the URI was shown successfully.   Otherwise, %FALSE is returned and &#64;error is set
    */
    public static boolean showUriFullFinish(@Nonnull Window parent, @Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGtk.INST().gtk_show_uri_full_finish(asCPointerNotNull(parent), asCPointerNotNull(result), 0L);
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param expr 
     * @param accessible 
     * @param expected_role 
     * @param actual_role 
    */
    public static void testAccessibleAssertionMessageRole(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str expr, @Nonnull Accessible accessible, int expected_role, int actual_role)  {
        JnaGtk.INST().gtk_test_accessible_assertion_message_role(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointerNotNull(expr), asCPointerNotNull(accessible), expected_role, actual_role);
    }

    /**
     * Checks whether the accessible &#64;property of &#64;accessible is set to
     * <br>a specific value.
     * @param accessible a `GtkAccessible`
     * @param property a `GtkAccessibleProperty`
     * @param _elipse the expected value of &#64;property
     * @return the value of the accessible property
    */
    public static ch.bailu.gtk.type.Str testAccessibleCheckProperty(@Nonnull Accessible accessible, int property, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_test_accessible_check_property(asCPointerNotNull(accessible), property, _elipse)));
    }

    /**
     * Checks whether the accessible &#64;relation of &#64;accessible is set to
     * <br>a specific value.
     * @param accessible a `GtkAccessible`
     * @param relation a `GtkAccessibleRelation`
     * @param _elipse the expected value of &#64;relation
     * @return the value of the accessible relation
    */
    public static ch.bailu.gtk.type.Str testAccessibleCheckRelation(@Nonnull Accessible accessible, int relation, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_test_accessible_check_relation(asCPointerNotNull(accessible), relation, _elipse)));
    }

    /**
     * Checks whether the accessible &#64;state of &#64;accessible is set to
     * <br>a specific value.
     * @param accessible a `GtkAccessible`
     * @param state a `GtkAccessibleState`
     * @param _elipse the expected value of &#64;state
     * @return the value of the accessible state
    */
    public static ch.bailu.gtk.type.Str testAccessibleCheckState(@Nonnull Accessible accessible, int state, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGtk.INST().gtk_test_accessible_check_state(asCPointerNotNull(accessible), state, _elipse)));
    }

    /**
     * Checks whether the `GtkAccessible` has &#64;property set.
     * @param accessible a `GtkAccessible`
     * @param property a `GtkAccessibleProperty`
     * @return %TRUE if the &#64;property is set in the &#64;accessible
    */
    public static boolean testAccessibleHasProperty(@Nonnull Accessible accessible, int property)  {
        return JnaGtk.INST().gtk_test_accessible_has_property(asCPointerNotNull(accessible), property);
    }

    /**
     * Checks whether the `GtkAccessible` has &#64;relation set.
     * @param accessible a `GtkAccessible`
     * @param relation a `GtkAccessibleRelation`
     * @return %TRUE if the &#64;relation is set in the &#64;accessible
    */
    public static boolean testAccessibleHasRelation(@Nonnull Accessible accessible, int relation)  {
        return JnaGtk.INST().gtk_test_accessible_has_relation(asCPointerNotNull(accessible), relation);
    }

    /**
     * Checks whether the `GtkAccessible:accessible-role` of the accessible
     * <br>is &#64;role.
     * @param accessible a `GtkAccessible`
     * @param role a `GtkAccessibleRole`
     * @return %TRUE if the role matches
    */
    public static boolean testAccessibleHasRole(@Nonnull Accessible accessible, int role)  {
        return JnaGtk.INST().gtk_test_accessible_has_role(asCPointerNotNull(accessible), role);
    }

    /**
     * Checks whether the `GtkAccessible` has &#64;state set.
     * @param accessible a `GtkAccessible`
     * @param state a `GtkAccessibleState`
     * @return %TRUE if the &#64;state is set in the &#64;accessible
    */
    public static boolean testAccessibleHasState(@Nonnull Accessible accessible, int state)  {
        return JnaGtk.INST().gtk_test_accessible_has_state(asCPointerNotNull(accessible), state);
    }

    /**
     * Force registration of all core GTK object types.
     * <br>
     * <br>This allowes to refer to any of those object types via
     * <br>g_type_from_name() after calling this function.
    */
    public static void testRegisterAllTypes()  {
        JnaGtk.INST().gtk_test_register_all_types();
    }

    /**
     * Enters the main loop and waits for &#64;widget to be “drawn”.
     * <br>
     * <br>In this context that means it waits for the frame clock of
     * <br>&#64;widget to have run a full styling, layout and drawing cycle.
     * <br>
     * <br>This function is intended to be used for syncing with actions that
     * <br>depend on &#64;widget relayouting or on interaction with the display
     * <br>server.
     * @param widget the widget to wait for
    */
    public static void testWidgetWaitForDraw(@Nonnull Widget widget)  {
        JnaGtk.INST().gtk_test_widget_wait_for_draw(asCPointerNotNull(widget));
    }

    /**
     * Creates a content provider for dragging &#64;path from &#64;tree_model.
     * @param tree_model a `GtkTreeModel`
     * @param path a row in &#64;tree_model
     * @return a new `GdkContentProvider`
    */
    public static ch.bailu.gtk.gdk.ContentProvider treeCreateRowDragContent(@Nonnull TreeModel tree_model, @Nonnull TreePath path)  {
        return new ch.bailu.gtk.gdk.ContentProvider(new PointerContainer(JnaGtk.INST().gtk_tree_create_row_drag_content(asCPointerNotNull(tree_model), asCPointerNotNull(path))));
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::row-deleted signal.
     * @param proxy a `GObject`
     * @param path the path position that was deleted
    */
    public static void treeRowReferenceDeleted(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path)  {
        JnaGtk.INST().gtk_tree_row_reference_deleted(asCPointerNotNull(proxy), asCPointerNotNull(path));
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::row-inserted signal.
     * @param proxy a `GObject`
     * @param path the row position that was inserted
    */
    public static void treeRowReferenceInserted(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path)  {
        JnaGtk.INST().gtk_tree_row_reference_inserted(asCPointerNotNull(proxy), asCPointerNotNull(path));
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::rows-reordered signal.
     * @param proxy a `GObject`
     * @param path the parent path of the reordered signal
     * @param iter the iter pointing to the parent of the reordered
     * @param new_order the new order of rows
    */
    public static void treeRowReferenceReordered(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.type.Int new_order)  {
        JnaGtk.INST().gtk_tree_row_reference_reordered(asCPointerNotNull(proxy), asCPointerNotNull(path), asCPointerNotNull(iter), asCPointerNotNull(new_order));
    }

    /**
     * Retrieves the `GtkExpression` stored inside the given `value`, and acquires
     * <br>a reference to it.
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @return a `GtkExpression`
    */
    public static Expression valueDupExpression(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return new Expression(new PointerContainer(JnaGtk.INST().gtk_value_dup_expression(asCPointerNotNull(value))));
    }

    /**
     * Retrieves the `GtkExpression` stored inside the given `value`.
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @return a `GtkExpression`
    */
    public static Expression valueGetExpression(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return new Expression(new PointerContainer(JnaGtk.INST().gtk_value_get_expression(asCPointerNotNull(value))));
    }

    /**
     * Stores the given `GtkExpression` inside `value`.
     * <br>
     * <br>The `GValue` will acquire a reference to the `expression`.
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @param expression a `GtkExpression`
    */
    public static void valueSetExpression(@Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull Expression expression)  {
        JnaGtk.INST().gtk_value_set_expression(asCPointerNotNull(value), asCPointerNotNull(expression));
    }

    /**
     * Stores the given `GtkExpression` inside `value`.
     * <br>
     * <br>This function transfers the ownership of the `expression` to the `GValue`.
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @param expression a `GtkExpression`
    */
    public static void valueTakeExpression(@Nonnull ch.bailu.gtk.gobject.Value value, @Nullable Expression expression)  {
        JnaGtk.INST().gtk_value_take_expression(asCPointerNotNull(value), asCPointer(expression));
    }

}

/*
package-type

[MethodModel:java-type-not-supported:acceleratorParse:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:acceleratorParseWithKeycode:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Display:{c:GdkDisplay*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:bitsetIterInitAt:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:bitsetIterInitFirst:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:bitsetIterInitLast:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:distributeNaturalAllocation:[ParameterModel:Supported:{G_::{c:int}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkRequestedSize*}}:{j:}]

[MethodModel:java-type-not-supported:testInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:char***}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:testListAllTypes:[ParameterModel:java-type-not-supported:{G_::{c:const GType*}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:treeGetRowDragData:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeModel**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
*/
