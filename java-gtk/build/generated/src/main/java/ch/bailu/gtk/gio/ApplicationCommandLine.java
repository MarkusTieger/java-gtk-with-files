/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GApplicationCommandLine represents a command-line invocation of
 * <br>an application.  It is created by &#35;GApplication and emitted
 * <br>in the &#35;GApplication::command-line signal and virtual function.
 * <br>
 * <br>The class contains the list of arguments that the program was invoked
 * <br>with.  It is also possible to query if the commandline invocation was
 * <br>local (ie: the current process is running in direct response to the
 * <br>invocation) or remote (ie: some other process forwarded the
 * <br>commandline to this process).
 * <br>
 * <br>The GApplicationCommandLine object can provide the &#64;argc and &#64;argv
 * <br>parameters for use with the &#35;GOptionContext command-line parsing API,
 * <br>with the g_application_command_line_get_arguments() function. See
 * <br>[gapplication-example-cmdline3.c][gapplication-example-cmdline3]
 * <br>for an example.
 * <br>
 * <br>The exit status of the originally-invoked process may be set and
 * <br>messages can be printed to stdout or stderr of that process.  The
 * <br>lifecycle of the originally-invoked process is tied to the lifecycle
 * <br>of this object (ie: the process exits when the last reference is
 * <br>dropped).
 * <br>
 * <br>The main use for &#35;GApplicationCommandLine (and the
 * <br>&#35;GApplication::command-line signal) is 'Emacs server' like use cases:
 * <br>You can set the `EDITOR` environment variable to have e.g. git use
 * <br>your favourite editor to edit commit messages, and if you already
 * <br>have an instance of the editor running, the editing will happen
 * <br>in the running instance, instead of opening a new one. An important
 * <br>aspect of this use case is that the process that gets started by git
 * <br>does not return until the editing is done.
 * <br>
 * <br>Normally, the commandline is completely handled in the
 * <br>&#35;GApplication::command-line handler. The launching instance exits
 * <br>once the signal handler in the primary instance has returned, and
 * <br>the return value of the signal handler becomes the exit status
 * <br>of the launching instance.
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   gchar **argv;
 *   gint argc;
 *   gint i;
 * 
 *   argv = g_application_command_line_get_arguments (cmdline, &amp;argc);
 * 
 *   g_application_command_line_print (cmdline,
 *                                     &quot;This text is written back&#92;n&quot;
 *                                     &quot;to stdout of the caller&#92;n&quot;);
 * 
 *   for (i = 0; i &lt; argc; i++)
 *     g_print (&quot;argument %d: %s&#92;n&quot;, i, argv[i]);
 * 
 *   g_strfreev (argv);
 * 
 *   return 0;
 * }
 * </pre>
 * <br>The complete example can be found here:
 * <br>[gapplication-example-cmdline.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline.c)
 * <br>
 * <br>In more complicated cases, the handling of the commandline can be
 * <br>split between the launcher and the primary instance.
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static gboolean
 *  test_local_cmdline (GApplication   *application,
 *                      gchar        ***arguments,
 *                      gint           *exit_status)
 * {
 *   gint i, j;
 *   gchar **argv;
 * 
 *   argv = *arguments;
 * 
 *   if (argv[0] == NULL)
 *     {
 *       *exit_status = 0;
 *       return FALSE;
 *     }
 * 
 *   i = 1;
 *   while (argv[i])
 *     {
 *       if (g_str_has_prefix (argv[i], &quot;--local-&quot;))
 *         {
 *           g_print (&quot;handling argument %s locally&#92;n&quot;, argv[i]);
 *           g_free (argv[i]);
 *           for (j = i; argv[j]; j++)
 *             argv[j] = argv[j + 1];
 *         }
 *       else
 *         {
 *           g_print (&quot;not handling argument %s locally&#92;n&quot;, argv[i]);
 *           i++;
 *         }
 *     }
 * 
 *   *exit_status = 0;
 * 
 *   return FALSE;
 * }
 * 
 * static void
 * test_application_class_init (TestApplicationClass *class)
 * {
 *   G_APPLICATION_CLASS (class)-&gt;local_command_line = test_local_cmdline;
 * 
 *   ...
 * }
 * </pre>
 * <br>In this example of split commandline handling, options that start
 * <br>with `--local-` are handled locally, all other options are passed
 * <br>to the &#35;GApplication::command-line handler which runs in the primary
 * <br>instance.
 * <br>
 * <br>The complete example can be found here:
 * <br>[gapplication-example-cmdline2.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c)
 * <br>
 * <br>If handling the commandline requires a lot of work, it may
 * <br>be better to defer it.
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static gboolean
 * my_cmdline_handler (gpointer data)
 * {
 *   GApplicationCommandLine *cmdline = data;
 * 
 *   // do the heavy lifting in an idle
 * 
 *   g_application_command_line_set_exit_status (cmdline, 0);
 *   g_object_unref (cmdline); // this releases the application
 * 
 *   return G_SOURCE_REMOVE;
 * }
 * 
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   // keep the application running until we are done with this commandline
 *   g_application_hold (application);
 * 
 *   g_object_set_data_full (G_OBJECT (cmdline),
 *                           &quot;application&quot;, application,
 *                           (GDestroyNotify)g_application_release);
 * 
 *   g_object_ref (cmdline);
 *   g_idle_add (my_cmdline_handler, cmdline);
 * 
 *   return 0;
 * }
 * </pre>
 * <br>In this example the commandline is not completely handled before
 * <br>the &#35;GApplication::command-line handler returns. Instead, we keep
 * <br>a reference to the &#35;GApplicationCommandLine object and handle it
 * <br>later (in this example, in an idle). Note that it is necessary to
 * <br>hold the application until you are done with the commandline.
 * <br>
 * <br>The complete example can be found here:
 * <br>[gapplication-example-cmdline3.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline3.c)
 * <p><a href="https://docs.gtk.org/gio/class.ApplicationCommandLine.html">https://docs.gtk.org/gio/class.ApplicationCommandLine.html</a></p>
*/
public class ApplicationCommandLine extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationCommandLine.class.getCanonicalName());
    }

    public ApplicationCommandLine(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GFile corresponding to a filename that was given as part
     * <br>of the invocation of &#64;cmdline.
     * <br>
     * <br>This differs from g_file_new_for_commandline_arg() in that it
     * <br>resolves relative pathnames using the current working directory of
     * <br>the invoking process rather than the local process.
     * @param arg an argument from &#64;cmdline
     * @return a new &#35;GFile
    */
    public File createFileForArg(@Nonnull ch.bailu.gtk.type.Str arg)  {
        return new File(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_create_file_for_arg(asCPointer(), asCPointerNotNull(arg))));
    }

    /**
     * Creates a &#35;GFile corresponding to a filename that was given as part
     * <br>of the invocation of &#64;cmdline.
     * <br>
     * <br>This differs from g_file_new_for_commandline_arg() in that it
     * <br>resolves relative pathnames using the current working directory of
     * <br>the invoking process rather than the local process.
     * @param arg an argument from &#64;cmdline
     * @return a new &#35;GFile
    */
    public File createFileForArg(String arg)  {
        return new File(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_create_file_for_arg(asCPointer(), arg)));
    }

    /**
     * Gets the working directory of the command line invocation.
     * <br>The string may contain non-utf8 data.
     * <br>
     * <br>It is possible that the remote application did not send a working
     * <br>directory, so this may be %NULL.
     * <br>
     * <br>The return value should not be modified or freed and is valid for as
     * <br>long as &#64;cmdline exists.
     * @return the current directory, or %NULL
    */
    public ch.bailu.gtk.type.Str getCwd()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_get_cwd(asCPointer())));
    }

    /**
     * Gets the exit status of &#64;cmdline.  See
     * <br>g_application_command_line_set_exit_status() for more information.
     * @return the exit status
    */
    public int getExitStatus()  {
        return JnaApplicationCommandLine.INST().g_application_command_line_get_exit_status(asCPointer());
    }

    /**
     * Determines if &#64;cmdline represents a remote invocation.
     * @return %TRUE if the invocation was remote
    */
    public boolean getIsRemote()  {
        return JnaApplicationCommandLine.INST().g_application_command_line_get_is_remote(asCPointer());
    }

    /**
     * Gets the options there were passed to g_application_command_line().
     * <br>
     * <br>If you did not override local_command_line() then these are the same
     * <br>options that were parsed according to the &#35;GOptionEntrys added to the
     * <br>application with g_application_add_main_option_entries() and possibly
     * <br>modified from your GApplication::handle-local-options handler.
     * <br>
     * <br>If no options were sent then an empty dictionary is returned so that
     * <br>you don't need to check for %NULL.
     * @return a &#35;GVariantDict with the options
    */
    public ch.bailu.gtk.glib.VariantDict getOptionsDict()  {
        return new ch.bailu.gtk.glib.VariantDict(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_get_options_dict(asCPointer())));
    }

    /**
     * Gets the platform data associated with the invocation of &#64;cmdline.
     * <br>
     * <br>This is a &#35;GVariant dictionary containing information about the
     * <br>context in which the invocation occurred.  It typically contains
     * <br>information like the current working directory and the startup
     * <br>notification ID.
     * <br>
     * <br>For local invocation, it will be %NULL.
     * @return the platform data, or %NULL
    */
    public ch.bailu.gtk.glib.Variant getPlatformData()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_get_platform_data(asCPointer())));
    }

    /**
     * Gets the stdin of the invoking process.
     * <br>
     * <br>The &#35;GInputStream can be used to read data passed to the standard
     * <br>input of the invoking process.
     * <br>This doesn't work on all platforms.  Presently, it is only available
     * <br>on UNIX when using a D-Bus daemon capable of passing file descriptors.
     * <br>If stdin is not available then %NULL will be returned.  In the
     * <br>future, support may be expanded to other platforms.
     * <br>
     * <br>You must only call this function once per commandline invocation.
     * @return a &#35;GInputStream for stdin
    */
    public InputStream getStdin()  {
        return new InputStream(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_get_stdin(asCPointer())));
    }

    /**
     * Gets the value of a particular environment variable of the command
     * <br>line invocation, as would be returned by g_getenv().  The strings may
     * <br>contain non-utf8 data.
     * <br>
     * <br>The remote application usually does not send an environment.  Use
     * <br>%G_APPLICATION_SEND_ENVIRONMENT to affect that.  Even with this flag
     * <br>set it is possible that the environment is still not available (due
     * <br>to invocation messages from other applications).
     * <br>
     * <br>The return value should not be modified or freed and is valid for as
     * <br>long as &#64;cmdline exists.
     * @param name the environment variable to get
     * @return the value of the variable, or %NULL if unset or unsent
    */
    public ch.bailu.gtk.type.Str getenv(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_getenv(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets the value of a particular environment variable of the command
     * <br>line invocation, as would be returned by g_getenv().  The strings may
     * <br>contain non-utf8 data.
     * <br>
     * <br>The remote application usually does not send an environment.  Use
     * <br>%G_APPLICATION_SEND_ENVIRONMENT to affect that.  Even with this flag
     * <br>set it is possible that the environment is still not available (due
     * <br>to invocation messages from other applications).
     * <br>
     * <br>The return value should not be modified or freed and is valid for as
     * <br>long as &#64;cmdline exists.
     * @param name the environment variable to get
     * @return the value of the variable, or %NULL if unset or unsent
    */
    public ch.bailu.gtk.type.Str getenv(String name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaApplicationCommandLine.INST().g_application_command_line_getenv(asCPointer(), name)));
    }

    /**
     * Formats a message and prints it using the stdout print handler in the
     * <br>invoking process.
     * <br>
     * <br>If &#64;cmdline is a local invocation then this is exactly equivalent to
     * <br>g_print().  If &#64;cmdline is remote then this is equivalent to calling
     * <br>g_print() in the invoking process.
     * @param format a printf-style format string
     * @param _elipse arguments, as per &#64;format
    */
    public void print(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaApplicationCommandLine.INST().g_application_command_line_print(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Formats a message and prints it using the stdout print handler in the
     * <br>invoking process.
     * <br>
     * <br>If &#64;cmdline is a local invocation then this is exactly equivalent to
     * <br>g_print().  If &#64;cmdline is remote then this is equivalent to calling
     * <br>g_print() in the invoking process.
     * @param format a printf-style format string
     * @param _elipse arguments, as per &#64;format
    */
    public void print(String format, java.lang.Object... _elipse)  {
        JnaApplicationCommandLine.INST().g_application_command_line_print(asCPointer(), format, _elipse);
    }

    /**
     * Formats a message and prints it using the stderr print handler in the
     * <br>invoking process.
     * <br>
     * <br>If &#64;cmdline is a local invocation then this is exactly equivalent to
     * <br>g_printerr().  If &#64;cmdline is remote then this is equivalent to
     * <br>calling g_printerr() in the invoking process.
     * @param format a printf-style format string
     * @param _elipse arguments, as per &#64;format
    */
    public void printerr(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaApplicationCommandLine.INST().g_application_command_line_printerr(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Formats a message and prints it using the stderr print handler in the
     * <br>invoking process.
     * <br>
     * <br>If &#64;cmdline is a local invocation then this is exactly equivalent to
     * <br>g_printerr().  If &#64;cmdline is remote then this is equivalent to
     * <br>calling g_printerr() in the invoking process.
     * @param format a printf-style format string
     * @param _elipse arguments, as per &#64;format
    */
    public void printerr(String format, java.lang.Object... _elipse)  {
        JnaApplicationCommandLine.INST().g_application_command_line_printerr(asCPointer(), format, _elipse);
    }

    /**
     * Sets the exit status that will be used when the invoking process
     * <br>exits.
     * <br>
     * <br>The return value of the &#35;GApplication::command-line signal is
     * <br>passed to this function when the handler returns.  This is the usual
     * <br>way of setting the exit status.
     * <br>
     * <br>In the event that you want the remote invocation to continue running
     * <br>and want to decide on the exit status in the future, you can use this
     * <br>call.  For the case of a remote invocation, the remote process will
     * <br>typically exit when the last reference is dropped on &#64;cmdline.  The
     * <br>exit status of the remote process will be equal to the last value
     * <br>that was set with this function.
     * <br>
     * <br>In the case that the commandline invocation is local, the situation
     * <br>is slightly more complicated.  If the commandline invocation results
     * <br>in the mainloop running (ie: because the use-count of the application
     * <br>increased to a non-zero value) then the application is considered to
     * <br>have been 'successful' in a certain sense, and the exit status is
     * <br>always zero.  If the application use count is zero, though, the exit
     * <br>status of the local &#35;GApplicationCommandLine is used.
     * @param exit_status the exit status
    */
    public void setExitStatus(int exit_status)  {
        JnaApplicationCommandLine.INST().g_application_command_line_set_exit_status(asCPointer(), exit_status);
    }

    public static long getTypeID() { 
        return JnaApplicationCommandLine.INST().g_application_command_line_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getArguments:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getEnviron:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]
*/
