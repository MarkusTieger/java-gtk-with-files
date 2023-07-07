/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GOptionContext` struct defines which options
 * <br>are accepted by the commandline option parser. The struct has only private
 * <br>fields and should not be directly accessed.
 * <p><a href="https://docs.gtk.org/glib/struct.OptionContext.html">https://docs.gtk.org/glib/struct.OptionContext.html</a></p>
*/
class OptionContext extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OptionContext.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTranslateFunc {
        /**
         * The type of functions which are used to translate user-visible
         * <br>strings, for &lt;option&gt;--help&lt;/option&gt; output.
         * @param str the untranslated string
         * @param user_data user data specified when installing the function, e.g.  in g_option_group_set_translate_func()
         * @return a translation of the string for the current locale.  The returned string is owned by GLib and must not be freed.
        */
        ch.bailu.gtk.type.Str onTranslateFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Str str, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaOptionContext.OnTranslateFunc toOnTranslateFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTranslateFunc in) {
        JnaOptionContext.OnTranslateFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_str, _user_data) -> in.onTranslateFunc(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_str)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaOptionContext.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaOptionContext.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public OptionContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds a &#35;GOptionGroup to the &#64;context, so that parsing with &#64;context
     * <br>will recognize the options in the group. Note that this will take
     * <br>ownership of the &#64;group and thus the &#64;group should not be freed.
     * @param group the group to add
    */
    public void addGroup(@Nonnull OptionGroup group)  {
        JnaOptionContext.INST().g_option_context_add_group(asCPointer(), asCPointerNotNull(group));
    }

    /**
     * Frees context and all the groups which have been
     * <br>added to it.
     * <br>
     * <br>Please note that parsed arguments need to be freed separately (see
     * <br>&#35;GOptionEntry).
    */
    public void free()  {
        JnaOptionContext.INST().g_option_context_free(asCPointer());
    }

    /**
     * Returns the description. See g_option_context_set_description().
     * @return the description
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaOptionContext.INST().g_option_context_get_description(asCPointer())));
    }

    /**
     * Returns a formatted, translated help text for the given context.
     * <br>To obtain the text produced by `--help`, call
     * <br>`g_option_context_get_help (context, TRUE, NULL)`.
     * <br>To obtain the text produced by `--help-all`, call
     * <br>`g_option_context_get_help (context, FALSE, NULL)`.
     * <br>To obtain the help text for an option group, call
     * <br>`g_option_context_get_help (context, FALSE, group)`.
     * @param main_help if %TRUE, only include the main group
     * @param group the &#35;GOptionGroup to create help for, or %NULL
     * @return A newly allocated string containing the help text
    */
    public ch.bailu.gtk.type.Str getHelp(boolean main_help, @Nullable OptionGroup group)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaOptionContext.INST().g_option_context_get_help(asCPointer(), main_help, asCPointer(group))));
    }

    /**
     * Returns whether automatic `--help` generation
     * <br>is turned on for &#64;context. See g_option_context_set_help_enabled().
     * @return %TRUE if automatic help generation is turned on.
    */
    public boolean getHelpEnabled()  {
        return JnaOptionContext.INST().g_option_context_get_help_enabled(asCPointer());
    }

    /**
     * Returns whether unknown options are ignored or not. See
     * <br>g_option_context_set_ignore_unknown_options().
     * @return %TRUE if unknown options are ignored.
    */
    public boolean getIgnoreUnknownOptions()  {
        return JnaOptionContext.INST().g_option_context_get_ignore_unknown_options(asCPointer());
    }

    /**
     * Returns a pointer to the main group of &#64;context.
     * @return the main group of &#64;context, or %NULL if  &#64;context doesn't have a main group. Note that group belongs to  &#64;context and should not be modified or freed.
    */
    public OptionGroup getMainGroup()  {
        return new OptionGroup(new PointerContainer(JnaOptionContext.INST().g_option_context_get_main_group(asCPointer())));
    }

    /**
     * Returns whether strict POSIX code is enabled.
     * <br>
     * <br>See g_option_context_set_strict_posix() for more information.
     * @return %TRUE if strict POSIX is enabled, %FALSE otherwise.
    */
    public boolean getStrictPosix()  {
        return JnaOptionContext.INST().g_option_context_get_strict_posix(asCPointer());
    }

    /**
     * Returns the summary. See g_option_context_set_summary().
     * @return the summary
    */
    public ch.bailu.gtk.type.Str getSummary()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaOptionContext.INST().g_option_context_get_summary(asCPointer())));
    }

    /**
     * Adds a string to be displayed in `--help` output after the list
     * <br>of options. This text often includes a bug reporting address.
     * <br>
     * <br>Note that the summary is translated (see
     * <br>g_option_context_set_translate_func()).
     * @param description a string to be shown in `--help` output   after the list of options, or %NULL
    */
    public void setDescription(@Nullable ch.bailu.gtk.type.Str description)  {
        JnaOptionContext.INST().g_option_context_set_description(asCPointer(), asCPointer(description));
    }

    /**
     * Adds a string to be displayed in `--help` output after the list
     * <br>of options. This text often includes a bug reporting address.
     * <br>
     * <br>Note that the summary is translated (see
     * <br>g_option_context_set_translate_func()).
     * @param description a string to be shown in `--help` output   after the list of options, or %NULL
    */
    public void setDescription(String description)  {
        JnaOptionContext.INST().g_option_context_set_description(asCPointer(), description);
    }

    /**
     * Enables or disables automatic generation of `--help` output.
     * <br>By default, g_option_context_parse() recognizes `--help`, `-h`,
     * <br>`-?`, `--help-all` and `--help-groupname` and creates suitable
     * <br>output to stdout.
     * @param help_enabled %TRUE to enable `--help`, %FALSE to disable it
    */
    public void setHelpEnabled(boolean help_enabled)  {
        JnaOptionContext.INST().g_option_context_set_help_enabled(asCPointer(), help_enabled);
    }

    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * <br>ignored, it is left in the &#64;argv array after parsing. By default,
     * <br>g_option_context_parse() treats unknown options as error.
     * <br>
     * <br>This setting does not affect non-option arguments (i.e. arguments
     * <br>which don't start with a dash). But note that GOption cannot reliably
     * <br>determine whether a non-option belongs to a preceding unknown option.
     * @param ignore_unknown %TRUE to ignore unknown options, %FALSE to produce    an error when unknown options are met
    */
    public void setIgnoreUnknownOptions(boolean ignore_unknown)  {
        JnaOptionContext.INST().g_option_context_set_ignore_unknown_options(asCPointer(), ignore_unknown);
    }

    /**
     * Sets a &#35;GOptionGroup as main group of the &#64;context.
     * <br>This has the same effect as calling g_option_context_add_group(),
     * <br>the only difference is that the options in the main group are
     * <br>treated differently when generating `--help` output.
     * @param group the group to set as main group
    */
    public void setMainGroup(@Nonnull OptionGroup group)  {
        JnaOptionContext.INST().g_option_context_set_main_group(asCPointer(), asCPointerNotNull(group));
    }

    /**
     * Sets strict POSIX mode.
     * <br>
     * <br>By default, this mode is disabled.
     * <br>
     * <br>In strict POSIX mode, the first non-argument parameter encountered
     * <br>(eg: filename) terminates argument processing.  Remaining arguments
     * <br>are treated as non-options and are not attempted to be parsed.
     * <br>
     * <br>If strict POSIX mode is disabled then parsing is done in the GNU way
     * <br>where option arguments can be freely mixed with non-options.
     * <br>
     * <br>As an example, consider &quot;ls foo -l&quot;.  With GNU style parsing, this
     * <br>will list &quot;foo&quot; in long mode.  In strict POSIX style, this will list
     * <br>the files named &quot;foo&quot; and &quot;-l&quot;.
     * <br>
     * <br>It may be useful to force strict POSIX mode when creating &quot;verb
     * <br>style&quot; command line tools.  For example, the &quot;gsettings&quot; command line
     * <br>tool supports the global option &quot;--schemadir&quot; as well as many
     * <br>subcommands (&quot;get&quot;, &quot;set&quot;, etc.) which each have their own set of
     * <br>arguments.  Using strict POSIX mode will allow parsing the global
     * <br>options up to the verb name while leaving the remaining options to be
     * <br>parsed by the relevant subcommand (which can be determined by
     * <br>examining the verb name, which should be present in argv[1] after
     * <br>parsing).
     * @param strict_posix the new value
    */
    public void setStrictPosix(boolean strict_posix)  {
        JnaOptionContext.INST().g_option_context_set_strict_posix(asCPointer(), strict_posix);
    }

    /**
     * Adds a string to be displayed in `--help` output before the list
     * <br>of options. This is typically a summary of the program functionality.
     * <br>
     * <br>Note that the summary is translated (see
     * <br>g_option_context_set_translate_func() and
     * <br>g_option_context_set_translation_domain()).
     * @param summary a string to be shown in `--help` output  before the list of options, or %NULL
    */
    public void setSummary(@Nullable ch.bailu.gtk.type.Str summary)  {
        JnaOptionContext.INST().g_option_context_set_summary(asCPointer(), asCPointer(summary));
    }

    /**
     * Adds a string to be displayed in `--help` output before the list
     * <br>of options. This is typically a summary of the program functionality.
     * <br>
     * <br>Note that the summary is translated (see
     * <br>g_option_context_set_translate_func() and
     * <br>g_option_context_set_translation_domain()).
     * @param summary a string to be shown in `--help` output  before the list of options, or %NULL
    */
    public void setSummary(String summary)  {
        JnaOptionContext.INST().g_option_context_set_summary(asCPointer(), summary);
    }

    /**
     * Sets the function which is used to translate the contexts
     * <br>user-visible strings, for `--help` output. If &#64;func is %NULL,
     * <br>strings are not translated.
     * <br>
     * <br>Note that option groups have their own translation functions,
     * <br>this function only affects the &#64;parameter_string (see g_option_context_new()),
     * <br>the summary (see g_option_context_set_summary()) and the description
     * <br>(see g_option_context_set_description()).
     * <br>
     * <br>If you are using gettext(), you only need to set the translation
     * <br>domain, see g_option_context_set_translation_domain().
     * @param func the &#35;GTranslateFunc, or %NULL
     * @param data user data to pass to &#64;func, or %NULL
     * @param destroy_notify a function which gets called to free &#64;data, or %NULL
    */
    public void setTranslateFunc(OnTranslateFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy_notify)  {
        JnaOptionContext.INST().g_option_context_set_translate_func(asCPointer(), toOnTranslateFunc(this, "setTranslateFunc", func), asCPointer(data), toOnDestroyNotify(this, "setTranslateFunc", destroy_notify));
    }

    /**
     * A convenience function to use gettext() for translating
     * <br>user-visible strings.
     * @param domain the domain to use
    */
    public void setTranslationDomain(@Nonnull ch.bailu.gtk.type.Str domain)  {
        JnaOptionContext.INST().g_option_context_set_translation_domain(asCPointer(), asCPointerNotNull(domain));
    }

    /**
     * A convenience function to use gettext() for translating
     * <br>user-visible strings.
     * @param domain the domain to use
    */
    public void setTranslationDomain(String domain)  {
        JnaOptionContext.INST().g_option_context_set_translation_domain(asCPointer(), domain);
    }

    /**
     * Creates a new option context.
     * <br>
     * <br>The &#64;parameter_string can serve multiple purposes. It can be used
     * <br>to add descriptions for &quot;rest&quot; arguments, which are not parsed by
     * <br>the &#35;GOptionContext, typically something like &quot;FILES&quot; or
     * <br>&quot;FILE1 FILE2...&quot;. If you are using %G_OPTION_REMAINING for
     * <br>collecting &quot;rest&quot; arguments, GLib handles this automatically by
     * <br>using the &#64;arg_description of the corresponding &#35;GOptionEntry in
     * <br>the usage summary.
     * <br>
     * <br>Another usage is to give a short summary of the program
     * <br>functionality, like &quot; - frob the strings&quot;, which will be displayed
     * <br>in the same line as the usage. For a longer description of the
     * <br>program functionality that should be displayed as a paragraph
     * <br>below the usage line, use g_option_context_set_summary().
     * <br>
     * <br>Note that the &#64;parameter_string is translated using the
     * <br>function set with g_option_context_set_translate_func(), so
     * <br>it should normally be passed untranslated.
     * @param parameter_string a string which is displayed in    the first line of `--help` output, after the usage summary    `programname [OPTION...]`
     * @return a newly created &#35;GOptionContext, which must be    freed with g_option_context_free() after use.
    */
    public static OptionContext _new(@Nullable ch.bailu.gtk.type.Str parameter_string)  {
        return new OptionContext(new PointerContainer(JnaOptionContext.INST().g_option_context_new(asCPointer(parameter_string))));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:java-type-not-supported:addMainEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOptionEntry*}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:parse:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]

[MethodModel:java-type-not-supported:parseStrv:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]
*/
