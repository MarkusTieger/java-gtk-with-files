/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCssProvider` is an object implementing the `GtkStyleProvider` interface
 * <br>for CSS.
 * <br>
 * <br>It is able to parse CSS-like input in order to style widgets.
 * <br>
 * <br>An application can make GTK parse a specific CSS style sheet by calling
 * <br>[method&#64;Gtk.CssProvider.load_from_file] or
 * <br>[method&#64;Gtk.CssProvider.load_from_resource]
 * <br>and adding the provider with [method&#64;Gtk.StyleContext.add_provider] or
 * <br>[func&#64;Gtk.StyleContext.add_provider_for_display].
 * <br>
 * <br>In addition, certain files will be read when GTK is initialized.
 * <br>First, the file `$XDG_CONFIG_HOME/gtk-4.0/gtk.css` is loaded if it
 * <br>exists. Then, GTK loads the first existing file among
 * <br>`XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * <br>`$HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * <br>`$XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css` and
 * <br>`DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * <br>where `THEME` is the name of the current theme (see the
 * <br>[property&#64;Gtk.Settings:gtk-theme-name] setting), `VARIANT` is the
 * <br>variant to load (see the
 * <br>[property&#64;Gtk.Settings:gtk-application-prefer-dark-theme] setting),
 * <br>`DATADIR` is the prefix configured when GTK was compiled (unless
 * <br>overridden by the `GTK_DATA_PREFIX` environment variable), and
 * <br>`VERSION` is the GTK version number. If no file is found for the
 * <br>current version, GTK tries older versions all the way back to 4.0.
 * <br>
 * <br>To track errors while loading CSS, connect to the
 * <br>[signal&#64;Gtk.CssProvider::parsing-error] signal.
 * <p><a href="https://docs.gtk.org/gtk4/class.CssProvider.html">https://docs.gtk.org/gtk4/class.CssProvider.html</a></p>
*/
public class CssProvider extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CssProvider.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnParsingError {
        /**
         * Signals that a parsing error occurred.
         * <br>
         * <br>The &#64;path, &#64;line and &#64;position describe the actual location of
         * <br>the error as accurately as possible.
         * <br>
         * <br>Parsing errors are never fatal, so the parsing will resume after
         * <br>the error. Errors may however cause parts of the given data or
         * <br>even all of it to not be parsed at all. So it is a useful idea
         * <br>to check that the parsing succeeds by connecting to this signal.
         * <br>
         * <br>Note that this signal may be emitted at any time as the css provider
         * <br>may opt to defer parsing parts or all of the input to a later time
         * <br>than when a loading function was called.
         * @param section section the error happened in
         * @param error The parsing error
        */
        void onParsingError(@Nonnull CssSection section, @Nonnull ch.bailu.gtk.glib.Error error);
    }
    
    private static com.sun.jna.Callback toOnParsingError(OnParsingError in) {
        return (in == null) ? null: (JnaCssProvider.OnParsingError) (__self, _section, _error, __data) -> in.onParsingError(new CssSection(new PointerContainer(_section)), new ch.bailu.gtk.glib.Error(new PointerContainer(_error)));
    }

    public CssProvider(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkCssProvider`.
    */
    public CssProvider() {
        super(cast(JnaCssProvider.INST().gtk_css_provider_new()));
    }

    /**
     * Loads &#64;data into &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param data CSS data loaded in memory
     * @param length the length of &#64;data in bytes, or -1 for NUL terminated strings. If   &#64;length is not -1, the code will assume it is not NUL terminated and will   potentially do a copy.
    */
    public void loadFromData(@Nonnull ch.bailu.gtk.type.Str data, long length)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_data(asCPointer(), asCPointerNotNull(data), length);
    }

    /**
     * Loads &#64;data into &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param data CSS data loaded in memory
     * @param length the length of &#64;data in bytes, or -1 for NUL terminated strings. If   &#64;length is not -1, the code will assume it is not NUL terminated and will   potentially do a copy.
    */
    public void loadFromData(String data, long length)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_data(asCPointer(), data, length);
    }

    /**
     * Loads the data contained in &#64;file into &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param file `GFile` pointing to a file to load
    */
    public void loadFromFile(@Nonnull ch.bailu.gtk.gio.File file)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_file(asCPointer(), asCPointerNotNull(file));
    }

    /**
     * Loads the data contained in &#64;path into &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param path the path of a filename to load, in the GLib filename encoding
    */
    public void loadFromPath(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Loads the data contained in &#64;path into &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param path the path of a filename to load, in the GLib filename encoding
    */
    public void loadFromPath(String path)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_path(asCPointer(), path);
    }

    /**
     * Loads the data contained in the resource at &#64;resource_path into
     * <br>the &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param resource_path a `GResource` resource path
    */
    public void loadFromResource(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_resource(asCPointer(), asCPointerNotNull(resource_path));
    }

    /**
     * Loads the data contained in the resource at &#64;resource_path into
     * <br>the &#64;css_provider.
     * <br>
     * <br>This clears any previously loaded information.
     * @param resource_path a `GResource` resource path
    */
    public void loadFromResource(String resource_path)  {
        JnaCssProvider.INST().gtk_css_provider_load_from_resource(asCPointer(), resource_path);
    }

    /**
     * Loads a theme from the usual theme paths.
     * <br>
     * <br>The actual process of finding the theme might change between
     * <br>releases, but it is guaranteed that this function uses the same
     * <br>mechanism to load the theme that GTK uses for loading its own theme.
     * @param name A theme name
     * @param variant variant to load, for example, &quot;dark&quot;, or   %NULL for the default
    */
    public void loadNamed(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str variant)  {
        JnaCssProvider.INST().gtk_css_provider_load_named(asCPointer(), asCPointerNotNull(name), asCPointer(variant));
    }

    /**
     * Loads a theme from the usual theme paths.
     * <br>
     * <br>The actual process of finding the theme might change between
     * <br>releases, but it is guaranteed that this function uses the same
     * <br>mechanism to load the theme that GTK uses for loading its own theme.
     * @param name A theme name
     * @param variant variant to load, for example, &quot;dark&quot;, or   %NULL for the default
    */
    public void loadNamed(String name, String variant)  {
        JnaCssProvider.INST().gtk_css_provider_load_named(asCPointer(), name, variant);
    }

    /**
     * Converts the &#64;provider into a string representation in CSS
     * <br>format.
     * <br>
     * <br>Using [method&#64;Gtk.CssProvider.load_from_data] with the return
     * <br>value from this function on a new provider created with
     * <br>[ctor&#64;Gtk.CssProvider.new] will basically create a duplicate
     * <br>of this &#64;provider.
     * @return a new string representing the &#64;provider.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCssProvider.INST().gtk_css_provider_to_string(asCPointer())));
    }

    public final static String SIGNAL_ON_PARSING_ERROR = "parsing-error";
    
    /**
     * Connect to signal "parsing-error".
     * <br>See {@link OnParsingError#onParsingError} for signal description.
     * <br>Field {@link #SIGNAL_ON_PARSING_ERROR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onParsingError(OnParsingError signal) {
        return connectSignal(SIGNAL_ON_PARSING_ERROR, toOnParsingError(signal));
    }

    /**
     * Implements interface {@link StyleProvider}. Call this to get access to interface functions.
     * @return {@link StyleProvider}
    */
    public StyleProvider asStyleProvider() {
        return new StyleProvider(cast());
    }

    public static long getTypeID() { 
        return JnaCssProvider.INST().gtk_css_provider_get_type(); 
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
