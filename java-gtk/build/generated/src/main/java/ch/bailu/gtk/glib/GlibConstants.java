/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface GlibConstants {

    /**
     * 
    */
    int ANALYZER_ANALYZING = 1;

    /**
     * A good size for a buffer to be passed into g_ascii_dtostr().
     * <br>It is guaranteed to be enough for all output of that function
     * <br>on systems with 64bit IEEE-compatible doubles.
     * <br>
     * <br>The typical usage would be something like:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   char buf[G_ASCII_DTOSTR_BUF_SIZE];
     * 
     *   fprintf (out, &quot;value=%s&#92;n&quot;, g_ascii_dtostr (buf, sizeof (buf), value));
     * </pre>
    */
    int ASCII_DTOSTR_BUF_SIZE = 39;

    /**
     * Specifies one of the possible types of byte order.
     * <br>See %G_BYTE_ORDER.
    */
    int BIG_ENDIAN = 4321;

    /**
     * The set of uppercase ASCII alphabet characters.
     * <br>Used for specifying valid identifier characters
     * <br>in &#35;GScannerConfig.
    */
    String CSET_A_2_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * The set of ASCII digits.
     * <br>Used for specifying valid identifier characters
     * <br>in &#35;GScannerConfig.
    */
    String CSET_DIGITS = "0123456789";

    /**
     * The set of lowercase ASCII alphabet characters.
     * <br>Used for specifying valid identifier characters
     * <br>in &#35;GScannerConfig.
    */
    String CSET_a_2_z = "abcdefghijklmnopqrstuvwxyz";

    /**
     * A bitmask that restricts the possible flags passed to
     * <br>g_datalist_set_flags(). Passing a flags value where
     * <br>flags &amp; ~G_DATALIST_FLAGS_MASK != 0 is an error.
    */
    int DATALIST_FLAGS_MASK = 3;

    /**
     * Represents an invalid &#35;GDateDay.
    */
    int DATE_BAD_DAY = 0;

    /**
     * Represents an invalid Julian day number.
    */
    int DATE_BAD_JULIAN = 0;

    /**
     * Represents an invalid year.
    */
    int DATE_BAD_YEAR = 0;

    /**
     * The directory separator character.
     * <br>This is '/' on UNIX machines and '&#92;' under Windows.
    */
    int DIR_SEPARATOR = 47;

    /**
     * The directory separator as a string.
     * <br>This is &quot;/&quot; on UNIX machines and &quot;&#92;&quot; under Windows.
    */
    String DIR_SEPARATOR_S = "/";

    /**
     * The base of natural logarithms.
    */
    double E = 2.718282;

    /**
     * This is the platform dependent conversion specifier for scanning and
     * <br>printing values of type &#35;gint16. It is a string literal, but doesn't
     * <br>include the percent-sign, such that you can add precision and length
     * <br>modifiers between percent-sign and conversion specifier.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * gint16 in;
     * gint32 out;
     * sscanf (&quot;42&quot;, &quot;%&quot; G_GINT16_FORMAT, &amp;in)
     * out = in * 1000;
     * g_print (&quot;%&quot; G_GINT32_FORMAT, out);
     * </pre>
    */
    String GINT16_FORMAT = "hi";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gint16 or &#35;guint16. It
     * <br>is a string literal, but doesn't include the percent-sign, such
     * <br>that you can add precision and length modifiers between percent-sign
     * <br>and conversion specifier and append a conversion specifier.
     * <br>
     * <br>The following example prints &quot;0x7b&quot;;
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * gint16 value = 123;
     * g_print (&quot;%&#35;&quot; G_GINT16_MODIFIER &quot;x&quot;, value);
     * </pre>
    */
    String GINT16_MODIFIER = "h";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;gint32. See also %G_GINT16_FORMAT.
    */
    String GINT32_FORMAT = "i";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gint32 or &#35;guint32. It
     * <br>is a string literal. See also %G_GINT16_MODIFIER.
    */
    String GINT32_MODIFIER = "";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;gint64. See also %G_GINT16_FORMAT.
     * <br>
     * <br>Some platforms do not support scanning and printing 64-bit integers,
     * <br>even though the types are supported. On such platforms %G_GINT64_FORMAT
     * <br>is not defined. Note that scanf() may not support 64-bit integers, even
     * <br>if %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf()
     * <br>is not recommended for parsing anyway; consider using g_ascii_strtoull()
     * <br>instead.
    */
    String GINT64_FORMAT = "li";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gint64 or &#35;guint64.
     * <br>It is a string literal.
     * <br>
     * <br>Some platforms do not support printing 64-bit integers, even
     * <br>though the types are supported. On such platforms %G_GINT64_MODIFIER
     * <br>is not defined.
    */
    String GINT64_MODIFIER = "l";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;gintptr.
    */
    String GINTPTR_FORMAT = "li";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gintptr or &#35;guintptr.
     * <br>It is a string literal.
    */
    String GINTPTR_MODIFIER = "l";

    /**
     * Expands to &quot;&quot; on all modern compilers, and to  __FUNCTION__ on gcc
     * <br>version 2.x. Don't use it.
    */
    String GNUC_FUNCTION = "";

    /**
     * Expands to &quot;&quot; on all modern compilers, and to __PRETTY_FUNCTION__
     * <br>on gcc version 2.x. Don't use it.
    */
    String GNUC_PRETTY_FUNCTION = "";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;gsize. See also %G_GINT16_FORMAT.
    */
    String GSIZE_FORMAT = "lu";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gsize. It
     * <br>is a string literal.
    */
    String GSIZE_MODIFIER = "l";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;gssize. See also %G_GINT16_FORMAT.
    */
    String GSSIZE_FORMAT = "li";

    /**
     * The platform dependent length modifier for conversion specifiers
     * <br>for scanning and printing values of type &#35;gssize. It
     * <br>is a string literal.
    */
    String GSSIZE_MODIFIER = "l";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;guint16. See also %G_GINT16_FORMAT
    */
    String GUINT16_FORMAT = "hu";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;guint32. See also %G_GINT16_FORMAT.
    */
    String GUINT32_FORMAT = "u";

    /**
     * This is the platform dependent conversion specifier for scanning
     * <br>and printing values of type &#35;guint64. See also %G_GINT16_FORMAT.
     * <br>
     * <br>Some platforms do not support scanning and printing 64-bit integers,
     * <br>even though the types are supported. On such platforms %G_GUINT64_FORMAT
     * <br>is not defined.  Note that scanf() may not support 64-bit integers, even
     * <br>if %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf()
     * <br>is not recommended for parsing anyway; consider using g_ascii_strtoull()
     * <br>instead.
    */
    String GUINT64_FORMAT = "lu";

    /**
     * This is the platform dependent conversion specifier
     * <br>for scanning and printing values of type &#35;guintptr.
    */
    String GUINTPTR_FORMAT = "lu";

    /**
     * 
    */
    int HAVE_GINT64 = 1;

    /**
     * 
    */
    int HAVE_GNUC_VARARGS = 1;

    /**
     * Defined to 1 if gcc-style visibility handling is supported.
    */
    int HAVE_GNUC_VISIBILITY = 1;

    /**
     * 
    */
    int HAVE_GROWING_STACK = 0;

    /**
     * 
    */
    int HAVE_ISO_VARARGS = 1;

    /**
     * The position of the first bit which is not reserved for internal
     * <br>use be the &#35;GHook implementation, i.e.
     * <br>`1 &lt;&lt; G_HOOK_FLAG_USER_SHIFT` is the first
     * <br>bit which can be used for application-defined flags.
    */
    int HOOK_FLAG_USER_SHIFT = 4;

    /**
     * The bias by which exponents in double-precision floats are offset.
    */
    int IEEE754_DOUBLE_BIAS = 1023;

    /**
     * The bias by which exponents in single-precision floats are offset.
    */
    int IEEE754_FLOAT_BIAS = 127;

    /**
     * The name of the main group of a desktop entry file, as defined in the
     * <br>[Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec).
     * <br>Consult the specification for more
     * <br>details about the meanings of the keys below.
    */
    String KEY_FILE_DESKTOP_GROUP = "Desktop Entry";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string list
     * <br>giving the available application actions.
    */
    String KEY_FILE_DESKTOP_KEY_ACTIONS = "Actions";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list
     * <br>of strings giving the categories in which the desktop entry
     * <br>should be shown in a menu.
    */
    String KEY_FILE_DESKTOP_KEY_CATEGORIES = "Categories";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * <br>string giving the tooltip for the desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_COMMENT = "Comment";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * <br>set to true if the application is D-Bus activatable.
    */
    String KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE = "DBusActivatable";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>giving the command line to execute. It is only valid for desktop
     * <br>entries with the `Application` type.
    */
    String KEY_FILE_DESKTOP_KEY_EXEC = "Exec";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * <br>string giving the generic name of the desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_GENERIC_NAME = "GenericName";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * <br>stating whether the desktop entry has been deleted by the user.
    */
    String KEY_FILE_DESKTOP_KEY_HIDDEN = "Hidden";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * <br>string giving the name of the icon to be displayed for the desktop
     * <br>entry.
    */
    String KEY_FILE_DESKTOP_KEY_ICON = "Icon";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list
     * <br>of strings giving the MIME types supported by this desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_MIME_TYPE = "MimeType";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * <br>string giving the specific name of the desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_NAME = "Name";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of
     * <br>strings identifying the environments that should not display the
     * <br>desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN = "NotShowIn";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * <br>stating whether the desktop entry should be shown in menus.
    */
    String KEY_FILE_DESKTOP_KEY_NO_DISPLAY = "NoDisplay";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of
     * <br>strings identifying the environments that should display the
     * <br>desktop entry.
    */
    String KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN = "OnlyShowIn";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>containing the working directory to run the program in. It is only
     * <br>valid for desktop entries with the `Application` type.
    */
    String KEY_FILE_DESKTOP_KEY_PATH = "Path";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * <br>stating whether the application supports the
     * <br>[Startup Notification Protocol Specification](http://www.freedesktop.org/Standards/startup-notification-spec).
    */
    String KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY = "StartupNotify";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is string
     * <br>identifying the WM class or name hint of a window that the application
     * <br>will create, which can be used to emulate Startup Notification with
     * <br>older applications.
    */
    String KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS = "StartupWMClass";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * <br>stating whether the program should be run in a terminal window.
     * <br>
     * <br>It is only valid for desktop entries with the `Application` type.
    */
    String KEY_FILE_DESKTOP_KEY_TERMINAL = "Terminal";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>giving the file name of a binary on disk used to determine if the
     * <br>program is actually installed. It is only valid for desktop entries
     * <br>with the `Application` type.
    */
    String KEY_FILE_DESKTOP_KEY_TRY_EXEC = "TryExec";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>giving the type of the desktop entry.
     * <br>
     * <br>Usually %G_KEY_FILE_DESKTOP_TYPE_APPLICATION,
     * <br>%G_KEY_FILE_DESKTOP_TYPE_LINK, or
     * <br>%G_KEY_FILE_DESKTOP_TYPE_DIRECTORY.
    */
    String KEY_FILE_DESKTOP_KEY_TYPE = "Type";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>giving the URL to access. It is only valid for desktop entries
     * <br>with the `Link` type.
    */
    String KEY_FILE_DESKTOP_KEY_URL = "URL";

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * <br>giving the version of the Desktop Entry Specification used for
     * <br>the desktop entry file.
    */
    String KEY_FILE_DESKTOP_KEY_VERSION = "Version";

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * <br>entries representing applications.
    */
    String KEY_FILE_DESKTOP_TYPE_APPLICATION = "Application";

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * <br>entries representing directories.
    */
    String KEY_FILE_DESKTOP_TYPE_DIRECTORY = "Directory";

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * <br>entries representing links to documents.
    */
    String KEY_FILE_DESKTOP_TYPE_LINK = "Link";

    /**
     * Specifies one of the possible types of byte order.
     * <br>See %G_BYTE_ORDER.
    */
    int LITTLE_ENDIAN = 1234;

    /**
     * The natural logarithm of 10.
    */
    double LN10 = 2.302585;

    /**
     * The natural logarithm of 2.
    */
    double LN2 = 0.693147;

    /**
     * Multiplying the base 2 exponent by this number yields the base 10 exponent.
    */
    double LOG_2_BASE_10 = 0.301030;

    /**
     * Defines the log domain. See [Log Domains](&#35;log-domains).
     * <br>
     * <br>Libraries should define this so that any messages
     * <br>which they log can be differentiated from messages from other
     * <br>libraries and application code. But be careful not to define
     * <br>it in any public header files.
     * <br>
     * <br>Log domains must be unique, and it is recommended that they are the
     * <br>application or library name, optionally followed by a hyphen and a sub-domain
     * <br>name. For example, `bloatpad` or `bloatpad-io`.
     * <br>
     * <br>If undefined, it defaults to the default %NULL (or `&quot;&quot;`) log domain; this is
     * <br>not advisable, as it cannot be filtered against using the `G_MESSAGES_DEBUG`
     * <br>environment variable.
     * <br>
     * <br>For example, GTK+ uses this in its `Makefile.am`:
     * <pre>
     * AM_CPPFLAGS = -DG_LOG_DOMAIN=&#92;&quot;Gtk&#92;&quot;
     * </pre>
     * <br>
     * <br>Applications can choose to leave it as the default %NULL (or `&quot;&quot;`)
     * <br>domain. However, defining the domain offers the same advantages as
     * <br>above.
    */
    byte LOG_DOMAIN = 0;

    /**
     * GLib log levels that are considered fatal by default.
     * <br>
     * <br>This is not used if structured logging is enabled; see
     * <br>[Using Structured Logging][using-structured-logging].
    */
    int LOG_FATAL_MASK = 5;

    /**
     * Log levels below 1&lt;&lt;G_LOG_LEVEL_USER_SHIFT are used by GLib.
     * <br>Higher bits can be used for user-defined log levels.
    */
    int LOG_LEVEL_USER_SHIFT = 8;

    /**
     * The major version number of the GLib library.
     * <br>
     * <br>Like &#35;glib_major_version, but from the headers used at
     * <br>application compile time, rather than from the library
     * <br>linked against at application run time.
    */
    int MAJOR_VERSION = 2;

    /**
     * The maximum value which can be held in a &#35;gint16.
    */
    int MAXINT16 = 32767;

    /**
     * The maximum value which can be held in a &#35;gint32.
    */
    int MAXINT32 = 2147483647;

    /**
     * The maximum value which can be held in a &#35;gint8.
    */
    int MAXINT8 = 127;

    /**
     * The maximum value which can be held in a &#35;guint16.
    */
    int MAXUINT16 = 65535;

    /**
     * The maximum value which can be held in a &#35;guint8.
    */
    int MAXUINT8 = 255;

    /**
     * The micro version number of the GLib library.
     * <br>
     * <br>Like &#35;gtk_micro_version, but from the headers used at
     * <br>application compile time, rather than from the library
     * <br>linked against at application run time.
    */
    int MICRO_VERSION = 4;

    /**
     * The minimum value which can be held in a &#35;gint16.
    */
    int MININT16 = -32768;

    /**
     * The minimum value which can be held in a &#35;gint32.
    */
    int MININT32 = -2147483648;

    /**
     * The minimum value which can be held in a &#35;gint8.
    */
    int MININT8 = -128;

    /**
     * The minor version number of the GLib library.
     * <br>
     * <br>Like &#35;gtk_minor_version, but from the headers used at
     * <br>application compile time, rather than from the library
     * <br>linked against at application run time.
    */
    int MINOR_VERSION = 74;

    /**
     * 
    */
    String MODULE_SUFFIX = "so";

    /**
     * If a long option in the main group has this name, it is not treated as a
     * <br>regular option. Instead it collects all non-option arguments which would
     * <br>otherwise be left in `argv`. The option must be of type
     * <br>%G_OPTION_ARG_CALLBACK, %G_OPTION_ARG_STRING_ARRAY
     * <br>or %G_OPTION_ARG_FILENAME_ARRAY.
     * <br>
     * <br>
     * <br>Using %G_OPTION_REMAINING instead of simply scanning `argv`
     * <br>for leftover arguments has the advantage that GOption takes care of
     * <br>necessary encoding conversions for strings or filenames.
    */
    String OPTION_REMAINING = "";

    /**
     * Specifies one of the possible types of byte order
     * <br>(currently unused). See %G_BYTE_ORDER.
    */
    int PDP_ENDIAN = 3412;

    /**
     * The value of pi (ratio of circle's circumference to its diameter).
    */
    double PI = 3.141593;

    /**
     * A format specifier that can be used in printf()-style format strings
     * <br>when printing a &#35;GPid.
    */
    String PID_FORMAT = "i";

    /**
     * Pi divided by 2.
    */
    double PI_2 = 1.570796;

    /**
     * Pi divided by 4.
    */
    double PI_4 = 0.785398;

    /**
     * A format specifier that can be used in printf()-style format strings
     * <br>when printing the &#64;fd member of a &#35;GPollFD.
    */
    String POLLFD_FORMAT = "%d";

    /**
     * Use this for default priority event sources.
     * <br>
     * <br>In GLib this priority is used when adding timeout functions
     * <br>with g_timeout_add(). In GDK this priority is used for events
     * <br>from the X server.
    */
    int PRIORITY_DEFAULT = 0;

    /**
     * Use this for default priority idle functions.
     * <br>
     * <br>In GLib this priority is used when adding idle functions with
     * <br>g_idle_add().
    */
    int PRIORITY_DEFAULT_IDLE = 200;

    /**
     * Use this for high priority event sources.
     * <br>
     * <br>It is not used within GLib or GTK+.
    */
    int PRIORITY_HIGH = -100;

    /**
     * Use this for high priority idle functions.
     * <br>
     * <br>GTK+ uses %G_PRIORITY_HIGH_IDLE + 10 for resizing operations,
     * <br>and %G_PRIORITY_HIGH_IDLE + 20 for redrawing operations. (This is
     * <br>done to ensure that any pending resizes are processed before any
     * <br>pending redraws, so that widgets are not redrawn twice unnecessarily.)
    */
    int PRIORITY_HIGH_IDLE = 100;

    /**
     * Use this for very low priority background tasks.
     * <br>
     * <br>It is not used within GLib or GTK+.
    */
    int PRIORITY_LOW = 300;

    /**
     * The search path separator character.
     * <br>This is ':' on UNIX machines and ';' under Windows.
    */
    int SEARCHPATH_SEPARATOR = 58;

    /**
     * The search path separator as a string.
     * <br>This is &quot;:&quot; on UNIX machines and &quot;;&quot; under Windows.
    */
    String SEARCHPATH_SEPARATOR_S = ":";

    /**
     * 
    */
    int SIZEOF_LONG = 8;

    /**
     * 
    */
    int SIZEOF_SIZE_T = 8;

    /**
     * 
    */
    int SIZEOF_SSIZE_T = 8;

    /**
     * 
    */
    int SIZEOF_VOID_P = 8;

    /**
     * Use this macro as the return value of a &#35;GSourceFunc to leave
     * <br>the &#35;GSource in the main loop.
    */
    boolean SOURCE_CONTINUE = true;

    /**
     * Use this macro as the return value of a &#35;GSourceFunc to remove
     * <br>the &#35;GSource from the main loop.
    */
    boolean SOURCE_REMOVE = false;

    /**
     * The square root of two.
    */
    double SQRT2 = 1.414214;

    /**
     * The standard delimiters, used in g_strdelimit().
    */
    String STR_DELIMITERS = "_-|> <.";

    /**
     * 
    */
    int SYSDEF_AF_INET = 2;

    /**
     * 
    */
    int SYSDEF_AF_INET6 = 10;

    /**
     * 
    */
    int SYSDEF_AF_UNIX = 1;

    /**
     * 
    */
    int SYSDEF_MSG_DONTROUTE = 4;

    /**
     * 
    */
    int SYSDEF_MSG_OOB = 1;

    /**
     * 
    */
    int SYSDEF_MSG_PEEK = 2;

    /**
     * Creates a unique temporary directory for each unit test and uses
     * <br>g_set_user_dirs() to set XDG directories to point into subdirectories of it
     * <br>for the duration of the unit test. The directory tree is cleaned up after the
     * <br>test finishes successfully. Note that this doesn’t take effect until
     * <br>g_test_run() is called, so calls to (for example) g_get_user_home_dir() will
     * <br>return the system-wide value when made in a test program’s main() function.
     * <br>
     * <br>The following functions will return subdirectories of the temporary directory
     * <br>when this option is used. The specific subdirectory paths in use are not
     * <br>guaranteed to be stable API — always use a getter function to retrieve them.
     * <br>
     * <br> - g_get_home_dir()
     * <br> - g_get_user_cache_dir()
     * <br> - g_get_system_config_dirs()
     * <br> - g_get_user_config_dir()
     * <br> - g_get_system_data_dirs()
     * <br> - g_get_user_data_dir()
     * <br> - g_get_user_state_dir()
     * <br> - g_get_user_runtime_dir()
     * <br>
     * <br>The subdirectories may not be created by the test harness; as with normal
     * <br>calls to functions like g_get_user_cache_dir(), the caller must be prepared
     * <br>to create the directory if it doesn’t exist.
    */
    String TEST_OPTION_ISOLATE_DIRS = "isolate_dirs";

    /**
     * Evaluates to a time span of one millisecond.
    */
    long TIME_SPAN_MILLISECOND = 1000;

    /**
     * Evaluates to a time span of one minute.
    */
    long TIME_SPAN_MINUTE = 60000000;

    /**
     * Evaluates to a time span of one second.
    */
    long TIME_SPAN_SECOND = 1000000;

    /**
     * The maximum length (in codepoints) of a compatibility or canonical
     * <br>decomposition of a single Unicode character.
     * <br>
     * <br>This is as defined by Unicode 6.1.
    */
    int UNICHAR_MAX_DECOMPOSITION_LENGTH = 18;

    /**
     * Generic delimiters characters as defined in
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986). Includes `:/?&#35;[]&#64;`.
    */
    String URI_RESERVED_CHARS_GENERIC_DELIMITERS = ":/?#[]@";

    /**
     * Subcomponent delimiter characters as defined in
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986). Includes `!$&amp;'()*+,;=`.
    */
    String URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS = "!$&'()*+,;=";

    /**
     * Number of microseconds in one second (1 million).
     * <br>This macro is provided for code readability.
    */
    int USEC_PER_SEC = 1000000;

    /**
     * 
    */
    int VA_COPY_AS_ARRAY = 1;

    /**
     * A macro that should be defined by the user prior to including
     * <br>the glib.h header.
     * <br>The definition should be one of the predefined GLib version
     * <br>macros: %GLIB_VERSION_2_26, %GLIB_VERSION_2_28,...
     * <br>
     * <br>This macro defines the earliest version of GLib that the package is
     * <br>required to be able to compile against.
     * <br>
     * <br>If the compiler is configured to warn about the use of deprecated
     * <br>functions, then using functions that were deprecated in version
     * <br>%GLIB_VERSION_MIN_REQUIRED or earlier will cause warnings (but
     * <br>using functions deprecated in later releases will not).
    */
    int VERSION_MIN_REQUIRED = 2;

    /**
     * 
    */
    int WIN32_MSG_HANDLE = 19981206;

    /**
     * 
    */
    int macro__has_attribute___noreturn__ = 0;

}

/*
enumeration-type

[ParameterModel:value-not-supported:{G_::{c:gint64}}:{j:long}]

[ParameterModel:value-not-supported:{G_::{c:guint32}}:{j:int}]

[ParameterModel:value-not-supported:{G_::{c:guint64}}:{j:long}]

[ParameterModel:value-not-supported:{G_::{c:gint64}}:{j:long}]

[ParameterModel:value-not-supported:{G_::{c:gint64}}:{j:long}]

[ParameterModel:value-not-supported:{G_::{c:gint64}}:{j:long}]
*/
