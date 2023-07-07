/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GOptionGroup` struct defines the options in a single
 * <br>group. The struct has only private fields and should not be directly accessed.
 * <br>
 * <br>All options in a group share the same translation function. Libraries which
 * <br>need to parse commandline options are expected to provide a function for
 * <br>getting a `GOptionGroup` holding their options, which
 * <br>the application can then add to its &#35;GOptionContext.
 * <p><a href="https://docs.gtk.org/glib/struct.OptionGroup.html">https://docs.gtk.org/glib/struct.OptionGroup.html</a></p>
*/
public class OptionGroup extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OptionGroup.class.getCanonicalName());
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
    
    private static JnaOptionGroup.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaOptionGroup.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnOptionErrorFunc {
        /**
         * The type of function to be used as callback when a parse error occurs.
         * @param context The active &#35;GOptionContext
         * @param group The group to which the function belongs
         * @param user_data User data added to the &#35;GOptionGroup containing the option when  it was created with g_option_group_new()
        */
        void onOptionErrorFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OptionContext context, @Nonnull OptionGroup group, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaOptionGroup.OnOptionErrorFunc toOnOptionErrorFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnOptionErrorFunc in) {
        JnaOptionGroup.OnOptionErrorFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _group, _user_data, _error) -> in.onOptionErrorFunc(__callback, new OptionContext(new PointerContainer(_context)), new OptionGroup(new PointerContainer(_group)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnOptionParseFunc {
        /**
         * The type of function that can be called before and after parsing.
         * @param context The active &#35;GOptionContext
         * @param group The group to which the function belongs
         * @param user_data User data added to the &#35;GOptionGroup containing the option when  it was created with g_option_group_new()
         * @return %TRUE if the function completed successfully, %FALSE if an error  occurred, in which case &#64;error should be set with g_set_error()
        */
        boolean onOptionParseFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull OptionContext context, @Nonnull OptionGroup group, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaOptionGroup.OnOptionParseFunc toOnOptionParseFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnOptionParseFunc in) {
        JnaOptionGroup.OnOptionParseFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _group, _user_data, _error) -> in.onOptionParseFunc(__callback, new OptionContext(new PointerContainer(_context)), new OptionGroup(new PointerContainer(_group)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaOptionGroup.OnTranslateFunc toOnTranslateFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTranslateFunc in) {
        JnaOptionGroup.OnTranslateFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_str, _user_data) -> in.onTranslateFunc(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_str)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public OptionGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GOptionGroup.
     * @param name the name for the option group, this is used to provide   help for the options in this group with `--help-`&#64;name
     * @param description a description for this group to be shown in   `--help`. This string is translated using the translation   domain or translation function of the group
     * @param help_description a description for the `--help-`&#64;name option.   This string is translated using the translation domain or translation function   of the group
     * @param user_data user data that will be passed to the pre- and post-parse hooks,   the error hook and to callbacks of %G_OPTION_ARG_CALLBACK options, or %NULL
     * @param destroy a function that will be called to free &#64;user_data, or %NULL
    */
    public OptionGroup(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str description, @Nonnull ch.bailu.gtk.type.Str help_description, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy) {
        super(cast(JnaOptionGroup.INST().g_option_group_new(asCPointerNotNull(name), asCPointerNotNull(description), asCPointerNotNull(help_description), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy))));
    }

    /**
     * Creates a new &#35;GOptionGroup.
     * @param name the name for the option group, this is used to provide   help for the options in this group with `--help-`&#64;name
     * @param description a description for this group to be shown in   `--help`. This string is translated using the translation   domain or translation function of the group
     * @param help_description a description for the `--help-`&#64;name option.   This string is translated using the translation domain or translation function   of the group
     * @param user_data user data that will be passed to the pre- and post-parse hooks,   the error hook and to callbacks of %G_OPTION_ARG_CALLBACK options, or %NULL
     * @param destroy a function that will be called to free &#64;user_data, or %NULL
    */
    public OptionGroup(String name, String description, String help_description, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy) {
        super(cast(JnaOptionGroup.INST().g_option_group_new(name, description, help_description, asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy))));
    }

    /**
     * Increments the reference count of &#64;group by one.
     * @return a &#35;GOptionGroup
    */
    public OptionGroup ref()  {
        return new OptionGroup(new PointerContainer(JnaOptionGroup.INST().g_option_group_ref(asCPointer())));
    }

    /**
     * Associates a function with &#64;group which will be called
     * <br>from g_option_context_parse() when an error occurs.
     * <br>
     * <br>Note that the user data to be passed to &#64;error_func can be
     * <br>specified when constructing the group with g_option_group_new().
     * @param error_func a function to call when an error occurs
    */
    public void setErrorHook(OnOptionErrorFunc error_func)  {
        JnaOptionGroup.INST().g_option_group_set_error_hook(asCPointer(), toOnOptionErrorFunc(this, "setErrorHook", error_func));
    }

    /**
     * Associates two functions with &#64;group which will be called
     * <br>from g_option_context_parse() before the first option is parsed
     * <br>and after the last option has been parsed, respectively.
     * <br>
     * <br>Note that the user data to be passed to &#64;pre_parse_func and
     * <br>&#64;post_parse_func can be specified when constructing the group
     * <br>with g_option_group_new().
     * @param pre_parse_func a function to call before parsing, or %NULL
     * @param post_parse_func a function to call after parsing, or %NULL
    */
    public void setParseHooks(OnOptionParseFunc pre_parse_func, OnOptionParseFunc post_parse_func)  {
        JnaOptionGroup.INST().g_option_group_set_parse_hooks(asCPointer(), toOnOptionParseFunc(this, "setParseHooks", pre_parse_func), toOnOptionParseFunc(this, "setParseHooks", post_parse_func));
    }

    /**
     * Sets the function which is used to translate user-visible strings,
     * <br>for `--help` output. Different groups can use different
     * <br>&#35;GTranslateFuncs. If &#64;func is %NULL, strings are not translated.
     * <br>
     * <br>If you are using gettext(), you only need to set the translation
     * <br>domain, see g_option_group_set_translation_domain().
     * @param func the &#35;GTranslateFunc, or %NULL
     * @param data user data to pass to &#64;func, or %NULL
     * @param destroy_notify a function which gets called to free &#64;data, or %NULL
    */
    public void setTranslateFunc(OnTranslateFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy_notify)  {
        JnaOptionGroup.INST().g_option_group_set_translate_func(asCPointer(), toOnTranslateFunc(this, "setTranslateFunc", func), asCPointer(data), toOnDestroyNotify(this, "setTranslateFunc", destroy_notify));
    }

    /**
     * A convenience function to use gettext() for translating
     * <br>user-visible strings.
     * @param domain the domain to use
    */
    public void setTranslationDomain(@Nonnull ch.bailu.gtk.type.Str domain)  {
        JnaOptionGroup.INST().g_option_group_set_translation_domain(asCPointer(), asCPointerNotNull(domain));
    }

    /**
     * A convenience function to use gettext() for translating
     * <br>user-visible strings.
     * @param domain the domain to use
    */
    public void setTranslationDomain(String domain)  {
        JnaOptionGroup.INST().g_option_group_set_translation_domain(asCPointer(), domain);
    }

    /**
     * Decrements the reference count of &#64;group by one.
     * <br>If the reference count drops to 0, the &#64;group will be freed.
     * <br>and all memory allocated by the &#64;group is released.
    */
    public void unref()  {
        JnaOptionGroup.INST().g_option_group_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaOptionGroup.INST().g_option_group_get_type(); 
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

[MethodModel:java-type-not-supported:addEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOptionEntry*}}:{j:}]

[MethodModel:cb-deprecated:free:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
