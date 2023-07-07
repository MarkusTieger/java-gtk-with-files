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
public class Glib extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Glib.class.getCanonicalName());
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
    
    private static JnaGlib.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaGlib.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDataForeachFunc {
        /**
         * Specifies the type of function passed to g_dataset_foreach(). It is
         * <br>called with each &#35;GQuark id and associated data element, together
         * <br>with the &#64;user_data parameter supplied to g_dataset_foreach().
         * @param key_id the &#35;GQuark id to identifying the data element.
         * @param data the data element.
         * @param user_data user data passed to g_dataset_foreach().
        */
        void onDataForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, int key_id, @Nullable ch.bailu.gtk.type.Pointer data, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnDataForeachFunc toOnDataForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnDataForeachFunc in) {
        JnaGlib.OnDataForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key_id, _data, _user_data) -> in.onDataForeachFunc(__callback, _key_id, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceFunc {
        /**
         * Specifies the type of function passed to g_timeout_add(),
         * <br>g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
         * <br>
         * <br>When calling g_source_set_callback(), you may need to cast a function of a
         * <br>different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
         * <br>incompatible function types.
         * @param user_data data passed to the function, set when the source was     created with one of the above functions
         * @return %FALSE if the source should be removed. %G_SOURCE_CONTINUE and %G_SOURCE_REMOVE are more memorable names for the return value.
        */
        boolean onSourceFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnSourceFunc toOnSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceFunc in) {
        JnaGlib.OnSourceFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onSourceFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceOnceFunc {
        /**
         * A source function that is only called once before being removed from the main
         * <br>context automatically.
         * <br>
         * <br>See: g_idle_add_once(), g_timeout_add_once()
         * @param user_data data passed to the function, set when the source was   created
        */
        void onSourceOnceFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnSourceOnceFunc toOnSourceOnceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceOnceFunc in) {
        JnaGlib.OnSourceOnceFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onSourceOnceFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIOFunc {
        /**
         * Specifies the type of function passed to g_io_add_watch() or
         * <br>g_io_add_watch_full(), which is called when the requested condition
         * <br>on a &#35;GIOChannel is satisfied.
         * @param source the &#35;GIOChannel event source
         * @param condition the condition which has been satisfied
         * @param user_data user data set in g_io_add_watch() or g_io_add_watch_full()
         * @return the function should return %FALSE if the event source          should be removed
        */
        boolean onIOFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IOChannel source, int condition, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnIOFunc toOnIOFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnIOFunc in) {
        JnaGlib.OnIOFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source, _condition, _user_data) -> in.onIOFunc(__callback, new IOChannel(new PointerContainer(_source)), _condition, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLogFunc {
        /**
         * Specifies the prototype of log handler functions.
         * <br>
         * <br>The default log handler, g_log_default_handler(), automatically appends a
         * <br>new-line character to &#64;message when printing it. It is advised that any
         * <br>custom log handler functions behave similarly, so that logging calls in user
         * <br>code do not need modifying to add a new-line character to the message if the
         * <br>log handler is changed.
         * <br>
         * <br>This is not used if structured logging is enabled; see
         * <br>[Using Structured Logging][using-structured-logging].
         * @param log_domain the log domain of the message
         * @param log_level the log level of the message (including the     fatal and recursion flags)
         * @param message the message to process
         * @param user_data user data, set in g_log_set_handler()
        */
        void onLogFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull ch.bailu.gtk.type.Str message, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnLogFunc toOnLogFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnLogFunc in) {
        JnaGlib.OnLogFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_log_domain, _log_level, _message, _user_data) -> in.onLogFunc(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_log_domain)), _log_level, new ch.bailu.gtk.type.Str(new PointerContainer(_message)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaGlib.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestDataFunc {
        /**
         * The type used for test case functions that take an extra pointer
         * <br>argument.
         * @param user_data the data provided when registering the test
        */
        void onTestDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnTestDataFunc toOnTestDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestDataFunc in) {
        JnaGlib.OnTestDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onTestDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestFunc {
        /**
         * The type used for test case functions.
        */
        void onTestFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaGlib.OnTestFunc toOnTestFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestFunc in) {
        JnaGlib.OnTestFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onTestFunc(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestFixtureFunc {
        /**
         * The type used for functions that operate on test fixtures.  This is
         * <br>used for the fixture setup and teardown functions as well as for the
         * <br>testcases themselves.
         * <br>
         * <br>&#64;user_data is a pointer to the data that was given when registering
         * <br>the test case.
         * <br>
         * <br>&#64;fixture will be a pointer to the area of memory allocated by the
         * <br>test framework, of the size requested.  If the requested size was
         * <br>zero then &#64;fixture will be equal to &#64;user_data.
         * @param fixture the test fixture
         * @param user_data the data provided when registering the test
        */
        void onTestFixtureFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer fixture, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnTestFixtureFunc toOnTestFixtureFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestFixtureFunc in) {
        JnaGlib.OnTestFixtureFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fixture, _user_data) -> in.onTestFixtureFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_fixture)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestLogFatalFunc {
        /**
         * Specifies the prototype of fatal log handler functions.
         * @param log_domain the log domain of the message
         * @param log_level the log level of the message (including the fatal and recursion flags)
         * @param message the message to process
         * @param user_data user data, set in g_test_log_set_fatal_handler()
         * @return %TRUE if the program should abort, %FALSE otherwise
        */
        boolean onTestLogFatalFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull ch.bailu.gtk.type.Str message, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnTestLogFatalFunc toOnTestLogFatalFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestLogFatalFunc in) {
        JnaGlib.OnTestLogFatalFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_log_domain, _log_level, _message, _user_data) -> in.onTestLogFatalFunc(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_log_domain)), _log_level, new ch.bailu.gtk.type.Str(new PointerContainer(_message)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnixFDSourceFunc {
        /**
         * The type of functions to be called when a UNIX fd watch source
         * <br>triggers.
         * @param fd the fd that triggered the event
         * @param condition the IO conditions reported on &#64;fd
         * @param user_data user data passed to g_unix_fd_add()
         * @return %FALSE if the source should be removed
        */
        boolean onUnixFDSourceFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, int fd, int condition, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaGlib.OnUnixFDSourceFunc toOnUnixFDSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnixFDSourceFunc in) {
        JnaGlib.OnUnixFDSourceFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fd, _condition, _user_data) -> in.onUnixFDSourceFunc(__callback, _fd, _condition, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * A wrapper for the POSIX access() function. This function is used to
     * <br>test a pathname for one or several of read, write or execute
     * <br>permissions, or just existence.
     * <br>
     * <br>On Windows, the file protection mechanism is not at all POSIX-like,
     * <br>and the underlying function in the C library only checks the
     * <br>FAT-style READONLY attribute, and does not look at the ACL of a
     * <br>file at all. This function is this in practise almost useless on
     * <br>Windows. Software that needs to handle file permissions on Windows
     * <br>more exactly should use the Win32 API.
     * <br>
     * <br>See your C library manual for more details about access().
     * @param filename a pathname in the GLib file name encoding     (UTF-8 on Windows)
     * @param mode as in access()
     * @return zero if the pathname refers to an existing file system     object that has all the tested permissions, or -1 otherwise     or on error.
    */
    public static int access(@Nonnull ch.bailu.gtk.type.Str filename, int mode)  {
        return JnaGlib.INST().g_access(asCPointerNotNull(filename), mode);
    }

    /**
     * This function is similar to g_malloc(), allocating (&#64;n_blocks * &#64;n_block_bytes)
     * <br>bytes, but care is taken to align the allocated memory to with the given
     * <br>alignment value. Additionally, it will detect possible overflow during
     * <br>multiplication.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * <br>
     * <br>Aligned memory allocations returned by this function can only be
     * <br>freed using g_aligned_free().
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @param alignment the alignment to be enforced, which must be a positive power of 2   and a multiple of `sizeof(void*)`
     * @return the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer alignedAlloc(long n_blocks, long n_block_bytes, long alignment)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_aligned_alloc(n_blocks, n_block_bytes, alignment)));
    }

    /**
     * This function is similar to g_aligned_alloc(), but it will
     * <br>also clear the allocated memory before returning it.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @param alignment the alignment to be enforced, which must be a positive power of 2   and a multiple of `sizeof(void*)`
     * @return the allocated, cleared memory
    */
    public static ch.bailu.gtk.type.Pointer alignedAlloc0(long n_blocks, long n_block_bytes, long alignment)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_aligned_alloc0(n_blocks, n_block_bytes, alignment)));
    }

    /**
     * Frees the memory allocated by g_aligned_alloc().
     * @param mem the memory to deallocate
    */
    public static void alignedFree(@Nullable ch.bailu.gtk.type.Pointer mem)  {
        JnaGlib.INST().g_aligned_free(asCPointer(mem));
    }

    /**
     * Determines the numeric value of a character as a decimal digit.
     * <br>Differs from g_unichar_digit_value() because it takes a char, so
     * <br>there's no worry about sign extension if characters are signed.
     * @param c an ASCII character
     * @return If &#64;c is a decimal digit (according to g_ascii_isdigit()),    its numeric value. Otherwise, -1.
    */
    public static int asciiDigitValue(byte c)  {
        return JnaGlib.INST().g_ascii_digit_value(c);
    }

    /**
     * Converts a &#35;gdouble to a string, using the '.' as
     * <br>decimal point.
     * <br>
     * <br>This function generates enough precision that converting
     * <br>the string back using g_ascii_strtod() gives the same machine-number
     * <br>(on machines with IEEE compatible 64bit doubles). It is
     * <br>guaranteed that the size of the resulting string will never
     * <br>be larger than %G_ASCII_DTOSTR_BUF_SIZE bytes, including the terminating
     * <br>nul character, which is always added.
     * @param buffer A buffer to place the resulting string in
     * @param buf_len The length of the buffer.
     * @param d The &#35;gdouble to convert
     * @return The pointer to the buffer with the converted string.
    */
    public static ch.bailu.gtk.type.Str asciiDtostr(@Nonnull ch.bailu.gtk.type.Str buffer, int buf_len, double d)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ascii_dtostr(asCPointerNotNull(buffer), buf_len, d)));
    }

    /**
     * Converts a &#35;gdouble to a string, using the '.' as
     * <br>decimal point. To format the number you pass in
     * <br>a printf()-style format string. Allowed conversion
     * <br>specifiers are 'e', 'E', 'f', 'F', 'g' and 'G'.
     * <br>
     * <br>The &#64;format must just be a single format specifier
     * <br>starting with `%`, expecting a &#35;gdouble argument.
     * <br>
     * <br>The returned buffer is guaranteed to be nul-terminated.
     * <br>
     * <br>If you just want to want to serialize the value into a
     * <br>string, use g_ascii_dtostr().
     * @param buffer A buffer to place the resulting string in
     * @param buf_len The length of the buffer.
     * @param format The printf()-style format to use for the   code to use for converting
     * @param d The &#35;gdouble to convert
     * @return The pointer to the buffer with the converted string.
    */
    public static ch.bailu.gtk.type.Str asciiFormatd(@Nonnull ch.bailu.gtk.type.Str buffer, int buf_len, @Nonnull ch.bailu.gtk.type.Str format, double d)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ascii_formatd(asCPointerNotNull(buffer), buf_len, asCPointerNotNull(format), d)));
    }

    /**
     * Compare two strings, ignoring the case of ASCII characters.
     * <br>
     * <br>Unlike the BSD strcasecmp() function, this only recognizes standard
     * <br>ASCII letters and ignores the locale, treating all non-ASCII
     * <br>bytes as if they are not letters.
     * <br>
     * <br>This function should be used only on strings that are known to be
     * <br>in encodings where the bytes corresponding to ASCII letters always
     * <br>represent themselves. This includes UTF-8 and the ISO-8859-*
     * <br>charsets, but not for instance double-byte encodings like the
     * <br>Windows Codepage 932, where the trailing bytes of double-byte
     * <br>characters include all ASCII letters. If you compare two CP932
     * <br>strings using this function, you will get false matches.
     * <br>
     * <br>Both &#64;s1 and &#64;s2 must be non-%NULL.
     * @param s1 string to compare with &#64;s2
     * @param s2 string to compare with &#64;s1
     * @return 0 if the strings match, a negative value if &#64;s1 &lt; &#64;s2,     or a positive value if &#64;s1 &gt; &#64;s2.
    */
    public static int asciiStrcasecmp(@Nonnull ch.bailu.gtk.type.Str s1, @Nonnull ch.bailu.gtk.type.Str s2)  {
        return JnaGlib.INST().g_ascii_strcasecmp(asCPointerNotNull(s1), asCPointerNotNull(s2));
    }

    /**
     * Converts all upper case ASCII letters to lower case ASCII letters.
     * @param str a string
     * @param len length of &#64;str in bytes, or -1 if &#64;str is nul-terminated
     * @return a newly-allocated string, with all the upper case     characters in &#64;str converted to lower case, with semantics that     exactly match g_ascii_tolower(). (Note that this is unlike the     old g_strdown(), which modified the string in place.)
    */
    public static ch.bailu.gtk.type.Str asciiStrdown(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ascii_strdown(asCPointerNotNull(str), len)));
    }

    /**
     * Compare &#64;s1 and &#64;s2, ignoring the case of ASCII characters and any
     * <br>characters after the first &#64;n in each string. If either string is
     * <br>less than &#64;n bytes long, comparison will stop at the first nul byte
     * <br>encountered.
     * <br>
     * <br>Unlike the BSD strcasecmp() function, this only recognizes standard
     * <br>ASCII letters and ignores the locale, treating all non-ASCII
     * <br>characters as if they are not letters.
     * <br>
     * <br>The same warning as in g_ascii_strcasecmp() applies: Use this
     * <br>function only on strings known to be in encodings where bytes
     * <br>corresponding to ASCII letters always represent themselves.
     * @param s1 string to compare with &#64;s2
     * @param s2 string to compare with &#64;s1
     * @param n number of characters to compare
     * @return 0 if the strings match, a negative value if &#64;s1 &lt; &#64;s2,     or a positive value if &#64;s1 &gt; &#64;s2.
    */
    public static int asciiStrncasecmp(@Nonnull ch.bailu.gtk.type.Str s1, @Nonnull ch.bailu.gtk.type.Str s2, long n)  {
        return JnaGlib.INST().g_ascii_strncasecmp(asCPointerNotNull(s1), asCPointerNotNull(s2), n);
    }

    /**
     * Converts all lower case ASCII letters to upper case ASCII letters.
     * @param str a string
     * @param len length of &#64;str in bytes, or -1 if &#64;str is nul-terminated
     * @return a newly allocated string, with all the lower case     characters in &#64;str converted to upper case, with semantics that     exactly match g_ascii_toupper(). (Note that this is unlike the     old g_strup(), which modified the string in place.)
    */
    public static ch.bailu.gtk.type.Str asciiStrup(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ascii_strup(asCPointerNotNull(str), len)));
    }

    /**
     * Convert a character to ASCII lower case.
     * <br>
     * <br>Unlike the standard C library tolower() function, this only
     * <br>recognizes standard ASCII letters and ignores the locale, returning
     * <br>all non-ASCII characters unchanged, even if they are lower case
     * <br>letters in a particular character set. Also unlike the standard
     * <br>library function, this takes and returns a char, not an int, so
     * <br>don't call it on %EOF but no need to worry about casting to &#35;guchar
     * <br>before passing a possibly non-ASCII character in.
     * @param c any character
     * @return the result of converting &#64;c to lower case. If &#64;c is     not an ASCII upper case letter, &#64;c is returned unchanged.
    */
    public static byte asciiTolower(byte c)  {
        return JnaGlib.INST().g_ascii_tolower(c);
    }

    /**
     * Convert a character to ASCII upper case.
     * <br>
     * <br>Unlike the standard C library toupper() function, this only
     * <br>recognizes standard ASCII letters and ignores the locale, returning
     * <br>all non-ASCII characters unchanged, even if they are upper case
     * <br>letters in a particular character set. Also unlike the standard
     * <br>library function, this takes and returns a char, not an int, so
     * <br>don't call it on %EOF but no need to worry about casting to &#35;guchar
     * <br>before passing a possibly non-ASCII character in.
     * @param c any character
     * @return the result of converting &#64;c to upper case. If &#64;c is not    an ASCII lower case letter, &#64;c is returned unchanged.
    */
    public static byte asciiToupper(byte c)  {
        return JnaGlib.INST().g_ascii_toupper(c);
    }

    /**
     * Determines the numeric value of a character as a hexadecimal
     * <br>digit. Differs from g_unichar_xdigit_value() because it takes
     * <br>a char, so there's no worry about sign extension if characters
     * <br>are signed.
     * @param c an ASCII character.
     * @return If &#64;c is a hex digit (according to g_ascii_isxdigit()),     its numeric value. Otherwise, -1.
    */
    public static int asciiXdigitValue(byte c)  {
        return JnaGlib.INST().g_ascii_xdigit_value(c);
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param message 
    */
    public static void assertionMessage(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str message)  {
        JnaGlib.INST().g_assertion_message(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointerNotNull(message));
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param expr 
     * @param arg1 
     * @param cmp 
     * @param arg2 
    */
    public static void assertionMessageCmpstr(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str expr, @Nonnull ch.bailu.gtk.type.Str arg1, @Nonnull ch.bailu.gtk.type.Str cmp, @Nonnull ch.bailu.gtk.type.Str arg2)  {
        JnaGlib.INST().g_assertion_message_cmpstr(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointerNotNull(expr), asCPointerNotNull(arg1), asCPointerNotNull(cmp), asCPointerNotNull(arg2));
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param expr 
     * @param arg1 
     * @param arg2 
     * @param first_wrong_idx 
    */
    public static void assertionMessageCmpstrv(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str expr, @Nonnull ch.bailu.gtk.type.Strs arg1, @Nonnull ch.bailu.gtk.type.Strs arg2, long first_wrong_idx)  {
        JnaGlib.INST().g_assertion_message_cmpstrv(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointerNotNull(expr), asCPointerNotNull(arg1), asCPointerNotNull(arg2), first_wrong_idx);
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param expr 
     * @param error 
     * @param error_domain 
     * @param error_code 
    */
    public static void assertionMessageError(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str expr, @Nonnull Error error, int error_domain, int error_code)  {
        JnaGlib.INST().g_assertion_message_error(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointerNotNull(expr), asCPointerNotNull(error), error_domain, error_code);
    }

    /**
     * Internal function used to print messages from the public g_assert() and
     * <br>g_assert_not_reached() macros.
     * @param domain log domain
     * @param file file containing the assertion
     * @param line line number of the assertion
     * @param func function containing the assertion
     * @param expr expression which failed
    */
    public static void assertionMessageExpr(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nullable ch.bailu.gtk.type.Str expr)  {
        JnaGlib.INST().g_assertion_message_expr(asCPointer(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointer(expr));
    }

    /**
     * Compares &#64;atomic to &#64;oldval and, if equal, sets it to &#64;newval.
     * <br>If &#64;atomic was not equal to &#64;oldval then no change occurs.
     * <br>In any case the value of &#64;atomic before this operation is stored in &#64;preval.
     * <br>
     * <br>This compare and exchange is done atomically.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>See also g_atomic_int_compare_and_exchange()
     * @param atomic a pointer to a &#35;gint or &#35;guint
     * @param oldval the value to compare with
     * @param newval the value to conditionally replace with
     * @param preval the contents of &#64;atomic before this operation
     * @return %TRUE if the exchange took place
    */
    public static boolean atomicIntCompareAndExchangeFull(@Nonnull ch.bailu.gtk.type.Int atomic, int oldval, int newval, @Nonnull ch.bailu.gtk.type.Int preval)  {
        return JnaGlib.INST().g_atomic_int_compare_and_exchange_full(asCPointerNotNull(atomic), oldval, newval, asCPointerNotNull(preval));
    }

    /**
     * Sets the &#64;atomic to &#64;newval and returns the old value from &#64;atomic.
     * <br>
     * <br>This exchange is done atomically.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic = val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * @param atomic a pointer to a &#35;gint or &#35;guint
     * @param newval the value to replace with
     * @return the value of &#64;atomic before the exchange, signed
    */
    public static int atomicIntExchange(@Nonnull ch.bailu.gtk.type.Int atomic, int newval)  {
        return JnaGlib.INST().g_atomic_int_exchange(asCPointerNotNull(atomic), newval);
    }

    /**
     * Atomically adds &#64;val to the value of &#64;atomic.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic += val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param val the value to add
     * @return the value of &#64;atomic before the add, signed
    */
    public static long atomicPointerAdd(@Nonnull ch.bailu.gtk.type.Pointer atomic, long val)  {
        return JnaGlib.INST().g_atomic_pointer_add(asCPointerNotNull(atomic), val);
    }

    /**
     * Performs an atomic bitwise 'and' of the value of &#64;atomic and &#64;val,
     * <br>storing the result back in &#64;atomic.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic &amp;= val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param val the value to 'and'
     * @return the value of &#64;atomic before the operation, unsigned
    */
    public static long atomicPointerAnd(@Nonnull ch.bailu.gtk.type.Pointer atomic, long val)  {
        return JnaGlib.INST().g_atomic_pointer_and(asCPointerNotNull(atomic), val);
    }

    /**
     * Compares &#64;atomic to &#64;oldval and, if equal, sets it to &#64;newval.
     * <br>If &#64;atomic was not equal to &#64;oldval then no change occurs.
     * <br>
     * <br>This compare and exchange is done atomically.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param oldval the value to compare with
     * @param newval the value to conditionally replace with
     * @return %TRUE if the exchange took place
    */
    public static boolean atomicPointerCompareAndExchange(@Nonnull ch.bailu.gtk.type.Pointer atomic, @Nullable ch.bailu.gtk.type.Pointer oldval, @Nullable ch.bailu.gtk.type.Pointer newval)  {
        return JnaGlib.INST().g_atomic_pointer_compare_and_exchange(asCPointerNotNull(atomic), asCPointer(oldval), asCPointer(newval));
    }

    /**
     * Compares &#64;atomic to &#64;oldval and, if equal, sets it to &#64;newval.
     * <br>If &#64;atomic was not equal to &#64;oldval then no change occurs.
     * <br>In any case the value of &#64;atomic before this operation is stored in &#64;preval.
     * <br>
     * <br>This compare and exchange is done atomically.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>See also g_atomic_pointer_compare_and_exchange()
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param oldval the value to compare with
     * @param newval the value to conditionally replace with
     * @param preval the contents of &#64;atomic before this operation
     * @return %TRUE if the exchange took place
    */
    public static boolean atomicPointerCompareAndExchangeFull(@Nonnull ch.bailu.gtk.type.Pointer atomic, @Nullable ch.bailu.gtk.type.Pointer oldval, @Nullable ch.bailu.gtk.type.Pointer newval, @Nonnull ch.bailu.gtk.type.Pointer preval)  {
        return JnaGlib.INST().g_atomic_pointer_compare_and_exchange_full(asCPointerNotNull(atomic), asCPointer(oldval), asCPointer(newval), asCPointerNotNull(preval));
    }

    /**
     * Sets the &#64;atomic to &#64;newval and returns the old value from &#64;atomic.
     * <br>
     * <br>This exchange is done atomically.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic = val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param newval the value to replace with
     * @return the value of &#64;atomic before the exchange
    */
    public static ch.bailu.gtk.type.Pointer atomicPointerExchange(@Nullable ch.bailu.gtk.type.Pointer atomic, @Nullable ch.bailu.gtk.type.Pointer newval)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_pointer_exchange(asCPointer(atomic), asCPointer(newval))));
    }

    /**
     * Gets the current value of &#64;atomic.
     * <br>
     * <br>This call acts as a full compiler and hardware
     * <br>memory barrier (before the get).
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @return the value of the pointer
    */
    public static ch.bailu.gtk.type.Pointer atomicPointerGet(@Nonnull ch.bailu.gtk.type.Pointer atomic)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_pointer_get(asCPointerNotNull(atomic))));
    }

    /**
     * Performs an atomic bitwise 'or' of the value of &#64;atomic and &#64;val,
     * <br>storing the result back in &#64;atomic.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic |= val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param val the value to 'or'
     * @return the value of &#64;atomic before the operation, unsigned
    */
    public static long atomicPointerOr(@Nonnull ch.bailu.gtk.type.Pointer atomic, long val)  {
        return JnaGlib.INST().g_atomic_pointer_or(asCPointerNotNull(atomic), val);
    }

    /**
     * Sets the value of &#64;atomic to &#64;newval.
     * <br>
     * <br>This call acts as a full compiler and hardware
     * <br>memory barrier (after the set).
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param newval a new value to store
    */
    public static void atomicPointerSet(@Nonnull ch.bailu.gtk.type.Pointer atomic, @Nullable ch.bailu.gtk.type.Pointer newval)  {
        JnaGlib.INST().g_atomic_pointer_set(asCPointerNotNull(atomic), asCPointer(newval));
    }

    /**
     * Performs an atomic bitwise 'xor' of the value of &#64;atomic and &#64;val,
     * <br>storing the result back in &#64;atomic.
     * <br>
     * <br>Think of this operation as an atomic version of
     * <br>`{ tmp = *atomic; *atomic ^= val; return tmp; }`.
     * <br>
     * <br>This call acts as a full compiler and hardware memory barrier.
     * <br>
     * <br>While &#64;atomic has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param atomic a pointer to a &#35;gpointer-sized value
     * @param val the value to 'xor'
     * @return the value of &#64;atomic before the operation, unsigned
    */
    public static long atomicPointerXor(@Nonnull ch.bailu.gtk.type.Pointer atomic, long val)  {
        return JnaGlib.INST().g_atomic_pointer_xor(asCPointerNotNull(atomic), val);
    }

    /**
     * Atomically acquires a reference on the data pointed by &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @return a pointer to the data,   with its reference count increased
    */
    public static ch.bailu.gtk.type.Pointer atomicRcBoxAcquire(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_rc_box_acquire(asCPointerNotNull(mem_block))));
    }

    /**
     * Allocates &#64;block_size bytes of memory, and adds atomic
     * <br>reference counting semantics to it.
     * <br>
     * <br>The data will be freed when its reference count drops to
     * <br>zero.
     * <br>
     * <br>The allocated data is guaranteed to be suitably aligned for any
     * <br>built-in type.
     * @param block_size the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer atomicRcBoxAlloc(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_rc_box_alloc(block_size)));
    }

    /**
     * Allocates &#64;block_size bytes of memory, and adds atomic
     * <br>reference counting semantics to it.
     * <br>
     * <br>The contents of the returned data is set to zero.
     * <br>
     * <br>The data will be freed when its reference count drops to
     * <br>zero.
     * <br>
     * <br>The allocated data is guaranteed to be suitably aligned for any
     * <br>built-in type.
     * @param block_size the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer atomicRcBoxAlloc0(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_rc_box_alloc0(block_size)));
    }

    /**
     * Allocates a new block of data with atomic reference counting
     * <br>semantics, and copies &#64;block_size bytes of &#64;mem_block
     * <br>into it.
     * @param block_size the number of bytes to copy, must be greater than 0
     * @param mem_block the memory to copy
     * @return a pointer to the allocated   memory
    */
    public static ch.bailu.gtk.type.Pointer atomicRcBoxDup(long block_size, @Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_atomic_rc_box_dup(block_size, asCPointerNotNull(mem_block))));
    }

    /**
     * Retrieves the size of the reference counted data pointed by &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @return the size of the data, in bytes
    */
    public static long atomicRcBoxGetSize(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return JnaGlib.INST().g_atomic_rc_box_get_size(asCPointerNotNull(mem_block));
    }

    /**
     * Atomically releases a reference on the data pointed by &#64;mem_block.
     * <br>
     * <br>If the reference was the last one, it will free the
     * <br>resources allocated for &#64;mem_block.
     * @param mem_block a pointer to reference counted data
    */
    public static void atomicRcBoxRelease(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        JnaGlib.INST().g_atomic_rc_box_release(asCPointerNotNull(mem_block));
    }

    /**
     * Atomically releases a reference on the data pointed by &#64;mem_block.
     * <br>
     * <br>If the reference was the last one, it will call &#64;clear_func
     * <br>to clear the contents of &#64;mem_block, and then will free the
     * <br>resources allocated for &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @param clear_func a function to call when clearing the data
    */
    public static void atomicRcBoxReleaseFull(@Nonnull ch.bailu.gtk.type.Pointer mem_block, OnDestroyNotify clear_func)  {
        JnaGlib.INST().g_atomic_rc_box_release_full(asCPointerNotNull(mem_block), toOnDestroyNotify(getClassHandler().getInstance(), "atomicRcBoxReleaseFull", clear_func));
    }

    /**
     * Flush the status from a sequence of calls to g_base64_encode_step().
     * <br>
     * <br>The output buffer must be large enough to fit all the data that will
     * <br>be written to it. It will need up to 4 bytes, or up to 5 bytes if
     * <br>line-breaking is enabled.
     * <br>
     * <br>The &#64;out array will not be automatically nul-terminated.
     * @param break_lines whether to break long lines
     * @param out pointer to destination buffer
     * @param state Saved state from g_base64_encode_step()
     * @param save Saved state from g_base64_encode_step()
     * @return The number of bytes of output that was written
    */
    public static long base64EncodeClose(boolean break_lines, @Nonnull ch.bailu.gtk.type.Str out, @Nonnull ch.bailu.gtk.type.Int state, @Nonnull ch.bailu.gtk.type.Int save)  {
        return JnaGlib.INST().g_base64_encode_close(break_lines, asCPointerNotNull(out), asCPointerNotNull(state), asCPointerNotNull(save));
    }

    /**
     * Find the position of the first bit set in &#64;mask, searching
     * <br>from (but not including) &#64;nth_bit upwards. Bits are numbered
     * <br>from 0 (least significant) to sizeof(&#35;gulong) * 8 - 1 (31 or 63,
     * <br>usually). To start searching from the 0th bit, set &#64;nth_bit to -1.
     * @param mask a &#35;gulong containing flags
     * @param nth_bit the index of the bit to start the search from
     * @return the index of the first bit set which is higher than &#64;nth_bit, or -1    if no higher bits are set
    */
    public static int bitNthLsf(long mask, int nth_bit)  {
        return JnaGlib.INST().g_bit_nth_lsf(mask, nth_bit);
    }

    /**
     * Find the position of the first bit set in &#64;mask, searching
     * <br>from (but not including) &#64;nth_bit downwards. Bits are numbered
     * <br>from 0 (least significant) to sizeof(&#35;gulong) * 8 - 1 (31 or 63,
     * <br>usually). To start searching from the last bit, set &#64;nth_bit to
     * <br>-1 or GLIB_SIZEOF_LONG * 8.
     * @param mask a &#35;gulong containing flags
     * @param nth_bit the index of the bit to start the search from
     * @return the index of the first bit set which is lower than &#64;nth_bit, or -1    if no lower bits are set
    */
    public static int bitNthMsf(long mask, int nth_bit)  {
        return JnaGlib.INST().g_bit_nth_msf(mask, nth_bit);
    }

    /**
     * Gets the number of bits used to hold &#64;number,
     * <br>e.g. if &#64;number is 4, 3 bits are needed.
     * @param number a &#35;guint
     * @return the number of bits used to hold &#64;number
    */
    public static int bitStorage(long number)  {
        return JnaGlib.INST().g_bit_storage(number);
    }

    /**
     * 
     * @return 
    */
    public static int bookmarkFileErrorQuark()  {
        return JnaGlib.INST().g_bookmark_file_error_quark();
    }

    /**
     * Creates a filename from a series of elements using the correct
     * <br>separator for filenames.
     * <br>
     * <br>On Unix, this function behaves identically to `g_build_path
     * <br>(G_DIR_SEPARATOR_S, first_element, ....)`.
     * <br>
     * <br>On Windows, it takes into account that either the backslash
     * <br>(`&#92;` or slash (`/`) can be used as separator in filenames, but
     * <br>otherwise behaves as on UNIX. When file pathname separators need
     * <br>to be inserted, the one that last previously occurred in the
     * <br>parameters (reading from left to right) is used.
     * <br>
     * <br>No attempt is made to force the resulting filename to be an absolute
     * <br>path. If the first element is a relative path, the result will
     * <br>be a relative path.
     * @param first_element the first element in the path
     * @param _elipse remaining elements in path, terminated by %NULL
     * @return a newly-allocated string that     must be freed with g_free().
    */
    public static ch.bailu.gtk.type.Str buildFilename(@Nonnull ch.bailu.gtk.type.Str first_element, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_build_filename(asCPointerNotNull(first_element), _elipse)));
    }

    /**
     * Creates a path from a series of elements using &#64;separator as the
     * <br>separator between elements. At the boundary between two elements,
     * <br>any trailing occurrences of separator in the first element, or
     * <br>leading occurrences of separator in the second element are removed
     * <br>and exactly one copy of the separator is inserted.
     * <br>
     * <br>Empty elements are ignored.
     * <br>
     * <br>The number of leading copies of the separator on the result is
     * <br>the same as the number of leading copies of the separator on
     * <br>the first non-empty element.
     * <br>
     * <br>The number of trailing copies of the separator on the result is
     * <br>the same as the number of trailing copies of the separator on
     * <br>the last non-empty element. (Determination of the number of
     * <br>trailing copies is done without stripping leading copies, so
     * <br>if the separator is `ABA`, then `ABABA` has 1 trailing copy.)
     * <br>
     * <br>However, if there is only a single non-empty element, and there
     * <br>are no characters in that element not part of the leading or
     * <br>trailing separators, then the result is exactly the original value
     * <br>of that element.
     * <br>
     * <br>Other than for determination of the number of leading and trailing
     * <br>copies of the separator, elements consisting only of copies
     * <br>of the separator are ignored.
     * @param separator a string used to separator the elements of the path.
     * @param first_element the first element in the path
     * @param _elipse remaining elements in path, terminated by %NULL
     * @return a newly-allocated string that     must be freed with g_free().
    */
    public static ch.bailu.gtk.type.Str buildPath(@Nonnull ch.bailu.gtk.type.Str separator, @Nonnull ch.bailu.gtk.type.Str first_element, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_build_path(asCPointerNotNull(separator), asCPointerNotNull(first_element), _elipse)));
    }

    /**
     * Transfers the data from the &#35;GByteArray into a new immutable &#35;GBytes.
     * <br>
     * <br>The &#35;GByteArray is freed unless the reference count of &#64;array is greater
     * <br>than one, the &#35;GByteArray wrapper is preserved but the size of &#64;array
     * <br>will be set to zero.
     * <br>
     * <br>This is identical to using g_bytes_new_take() and g_byte_array_free()
     * <br>together.
     * @param array a &#35;GByteArray
     * @return a new immutable &#35;GBytes representing same     byte data that was in the array
    */
    public static Bytes byteArrayFreeToBytes(@Nonnull ByteArray array)  {
        return new Bytes(new PointerContainer(JnaGlib.INST().g_byte_array_free_to_bytes(asCPointerNotNull(array))));
    }

    /**
     * Creates a new &#35;GByteArray with a reference count of 1.
     * @return the new &#35;GByteArray
    */
    public static ByteArray byteArrayNew()  {
        return new ByteArray(new PointerContainer(JnaGlib.INST().g_byte_array_new()));
    }

    /**
     * Atomically decrements the reference count of &#64;array by one. If the
     * <br>reference count drops to 0, all memory allocated by the array is
     * <br>released. This function is thread-safe and may be called from any
     * <br>thread.
     * @param array A &#35;GByteArray
    */
    public static void byteArrayUnref(@Nonnull ByteArray array)  {
        JnaGlib.INST().g_byte_array_unref(asCPointerNotNull(array));
    }

    /**
     * Gets the canonical file name from &#64;filename. All triple slashes are turned into
     * <br>single slashes, and all `..` and `.`s resolved against &#64;relative_to.
     * <br>
     * <br>Symlinks are not followed, and the returned path is guaranteed to be absolute.
     * <br>
     * <br>If &#64;filename is an absolute path, &#64;relative_to is ignored. Otherwise,
     * <br>&#64;relative_to will be prepended to &#64;filename to make it absolute. &#64;relative_to
     * <br>must be an absolute path, or %NULL. If &#64;relative_to is %NULL, it'll fallback
     * <br>to g_get_current_dir().
     * <br>
     * <br>This function never fails, and will canonicalize file paths even if they don't
     * <br>exist.
     * <br>
     * <br>No file system I/O is done.
     * @param filename the name of the file
     * @param relative_to the relative directory, or %NULL to use the current working directory
     * @return a newly allocated string with the canonical file path
    */
    public static ch.bailu.gtk.type.Str canonicalizeFilename(@Nonnull ch.bailu.gtk.type.Str filename, @Nullable ch.bailu.gtk.type.Str relative_to)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_canonicalize_filename(asCPointerNotNull(filename), asCPointer(relative_to))));
    }

    /**
     * A wrapper for the POSIX chdir() function. The function changes the
     * <br>current directory of the process to &#64;path.
     * <br>
     * <br>See your C library manual for more details about chdir().
     * @param path a pathname in the GLib file name encoding     (UTF-8 on Windows)
     * @return 0 on success, -1 if an error occurred.
    */
    public static int chdir(@Nonnull ch.bailu.gtk.type.Str path)  {
        return JnaGlib.INST().g_chdir(asCPointerNotNull(path));
    }

    /**
     * Checks that the GLib library in use is compatible with the
     * <br>given version.
     * <br>
     * <br>Generally you would pass in the constants %GLIB_MAJOR_VERSION,
     * <br>%GLIB_MINOR_VERSION, %GLIB_MICRO_VERSION as the three arguments
     * <br>to this function; that produces a check that the library in use
     * <br>is compatible with the version of GLib the application or module
     * <br>was compiled against.
     * <br>
     * <br>Compatibility is defined by two things: first the version
     * <br>of the running library is newer than the version
     * <br>`&#64;required_major.required_minor.&#64;required_micro`. Second
     * <br>the running library must be binary compatible with the
     * <br>version `&#64;required_major.&#64;required_minor.&#64;required_micro`
     * <br>(same major version.)
     * @param required_major the required major version
     * @param required_minor the required minor version
     * @param required_micro the required micro version
     * @return %NULL if the GLib library is   compatible with the given version, or a string describing the   version mismatch. The returned string is owned by GLib and must   not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str checkVersion(int required_major, int required_minor, int required_micro)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().glib_check_version(required_major, required_minor, required_micro)));
    }

    /**
     * Gets the length in bytes of digests of type &#64;checksum_type
     * @param checksum_type a &#35;GChecksumType
     * @return the checksum length, or -1 if &#64;checksum_type is not supported.
    */
    public static long checksumTypeGetLength(int checksum_type)  {
        return JnaGlib.INST().g_checksum_type_get_length(checksum_type);
    }

    /**
     * If &#64;err or *&#64;err is %NULL, does nothing. Otherwise,
     * <br>calls g_error_free() on *&#64;err and sets *&#64;err to %NULL.
    */
    public static void clearError() throws ch.bailu.gtk.type.exception.AllocationError {
        JnaGlib.INST().g_clear_error(0L);
    }

    /**
     * This wraps the close() call; in case of error, %errno will be
     * <br>preserved, but the error will also be stored as a &#35;GError in &#64;error.
     * <br>
     * <br>Besides using &#35;GError, there is another major reason to prefer this
     * <br>function over the call provided by the system; on Unix, it will
     * <br>attempt to correctly handle %EINTR, which has platform-specific
     * <br>semantics.
     * @param fd A file descriptor
     * @return %TRUE on success, %FALSE if there was an error.
    */
    public static boolean close(int fd) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_close(fd, 0L);
    }

    /**
     * Computes the checksum for a binary &#64;data. This is a
     * <br>convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * <br>and g_checksum_free().
     * <br>
     * <br>The hexadecimal string returned will be in lower case.
     * @param checksum_type a &#35;GChecksumType
     * @param data binary blob to compute the digest of
     * @return the digest of the binary data as a   string in hexadecimal, or %NULL if g_checksum_new() fails for   &#64;checksum_type. The returned string should be freed with g_free() when   done using it.
    */
    public static ch.bailu.gtk.type.Str computeChecksumForBytes(int checksum_type, @Nonnull Bytes data)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_compute_checksum_for_bytes(checksum_type, asCPointerNotNull(data))));
    }

    /**
     * Computes the checksum of a string.
     * <br>
     * <br>The hexadecimal string returned will be in lower case.
     * @param checksum_type a &#35;GChecksumType
     * @param str the string to compute the checksum of
     * @param length the length of the string, or -1 if the string is null-terminated.
     * @return the checksum as a hexadecimal string,   or %NULL if g_checksum_new() fails for &#64;checksum_type. The returned string   should be freed with g_free() when done using it.
    */
    public static ch.bailu.gtk.type.Str computeChecksumForString(int checksum_type, @Nonnull ch.bailu.gtk.type.Str str, long length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_compute_checksum_for_string(checksum_type, asCPointerNotNull(str), length)));
    }

    /**
     * Computes the HMAC for a binary &#64;data. This is a
     * <br>convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * <br>and g_hmac_unref().
     * <br>
     * <br>The hexadecimal string returned will be in lower case.
     * @param digest_type a &#35;GChecksumType to use for the HMAC
     * @param key the key to use in the HMAC
     * @param data binary blob to compute the HMAC of
     * @return the HMAC of the binary data as a string in hexadecimal.   The returned string should be freed with g_free() when done using it.
    */
    public static ch.bailu.gtk.type.Str computeHmacForBytes(int digest_type, @Nonnull Bytes key, @Nonnull Bytes data)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_compute_hmac_for_bytes(digest_type, asCPointerNotNull(key), asCPointerNotNull(data))));
    }

    /**
     * Converts a string from one character set to another.
     * <br>
     * <br>Note that you should use g_iconv() for streaming conversions.
     * <br>Despite the fact that &#64;bytes_read can return information about partial
     * <br>characters, the g_convert_... functions are not generally suitable
     * <br>for streaming. If the underlying converter maintains internal state,
     * <br>then this won't be preserved across successive calls to g_convert(),
     * <br>g_convert_with_iconv() or g_convert_with_fallback(). (An example of
     * <br>this is the GNU C converter for CP1255 which does not emit a base
     * <br>character until it knows that the next character is not a mark that
     * <br>could combine with the base character.)
     * <br>
     * <br>Using extensions such as &quot;//TRANSLIT&quot; may not work (or may not work
     * <br>well) on many platforms.  Consider using g_str_to_ascii() instead.
     * @param str                  the string to convert.
     * @param len the length of the string in bytes, or -1 if the string is                 nul-terminated (Note that some encodings may allow nul                 bytes to occur inside strings. In that case, using -1                 for the &#64;len parameter is unsafe)
     * @param to_codeset name of character set into which to convert &#64;str
     * @param from_codeset character set of &#64;str.
     * @param bytes_read location to store the number of bytes in                 the input string that were successfully converted, or %NULL.                 Even if the conversion was successful, this may be                 less than &#64;len if there were partial characters                 at the end of the input. If the error                 %G_CONVERT_ERROR_ILLEGAL_SEQUENCE occurs, the value                 stored will be the byte offset after the last valid                 input sequence.
     * @param bytes_written the number of bytes stored in                 the output buffer (not including the terminating nul).
     * @return           If the conversion was successful, a newly allocated buffer          containing the converted string, which must be freed with g_free().          Otherwise %NULL and &#64;error will be set.
    */
    public static ch.bailu.gtk.type.Str convert(@Nonnull ch.bailu.gtk.type.Str str, long len, @Nonnull ch.bailu.gtk.type.Str to_codeset, @Nonnull ch.bailu.gtk.type.Str from_codeset, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_convert(asCPointerNotNull(str), len, asCPointerNotNull(to_codeset), asCPointerNotNull(from_codeset), asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * 
     * @return 
    */
    public static int convertErrorQuark()  {
        return JnaGlib.INST().g_convert_error_quark();
    }

    /**
     * Converts a string from one character set to another, possibly
     * <br>including fallback sequences for characters not representable
     * <br>in the output. Note that it is not guaranteed that the specification
     * <br>for the fallback sequences in &#64;fallback will be honored. Some
     * <br>systems may do an approximate conversion from &#64;from_codeset
     * <br>to &#64;to_codeset in their iconv() functions,
     * <br>in which case GLib will simply return that approximate conversion.
     * <br>
     * <br>Note that you should use g_iconv() for streaming conversions.
     * <br>Despite the fact that &#64;bytes_read can return information about partial
     * <br>characters, the g_convert_... functions are not generally suitable
     * <br>for streaming. If the underlying converter maintains internal state,
     * <br>then this won't be preserved across successive calls to g_convert(),
     * <br>g_convert_with_iconv() or g_convert_with_fallback(). (An example of
     * <br>this is the GNU C converter for CP1255 which does not emit a base
     * <br>character until it knows that the next character is not a mark that
     * <br>could combine with the base character.)
     * @param str                 the string to convert.
     * @param len the length of the string in bytes, or -1 if the string is                 nul-terminated (Note that some encodings may allow nul                 bytes to occur inside strings. In that case, using -1                 for the &#64;len parameter is unsafe)
     * @param to_codeset name of character set into which to convert &#64;str
     * @param from_codeset character set of &#64;str.
     * @param fallback UTF-8 string to use in place of characters not                present in the target encoding. (The string must be                representable in the target encoding).                If %NULL, characters not in the target encoding will                be represented as Unicode escapes &#92;uxxxx or &#92;Uxxxxyyyy.
     * @param bytes_read location to store the number of bytes in                the input string that were successfully converted, or %NULL.                Even if the conversion was successful, this may be                less than &#64;len if there were partial characters                at the end of the input.
     * @param bytes_written the number of bytes stored in                 the output buffer (not including the terminating nul).
     * @return           If the conversion was successful, a newly allocated buffer          containing the converted string, which must be freed with g_free().          Otherwise %NULL and &#64;error will be set.
    */
    public static ch.bailu.gtk.type.Str convertWithFallback(@Nonnull ch.bailu.gtk.type.Str str, long len, @Nonnull ch.bailu.gtk.type.Str to_codeset, @Nonnull ch.bailu.gtk.type.Str from_codeset, @Nonnull ch.bailu.gtk.type.Str fallback, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_convert_with_fallback(asCPointerNotNull(str), len, asCPointerNotNull(to_codeset), asCPointerNotNull(from_codeset), asCPointerNotNull(fallback), asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * Destroys the dataset, freeing all memory allocated, and calling any
     * <br>destroy functions set for data elements.
     * @param dataset_location the location identifying the dataset.
    */
    public static void datasetDestroy(@Nonnull ch.bailu.gtk.type.Pointer dataset_location)  {
        JnaGlib.INST().g_dataset_destroy(asCPointerNotNull(dataset_location));
    }

    /**
     * Calls the given function for each data element which is associated
     * <br>with the given location. Note that this function is NOT thread-safe.
     * <br>So unless &#64;dataset_location can be protected from any modifications
     * <br>during invocation of this function, it should not be called.
     * <br>
     * <br>&#64;func can make changes to the dataset, but the iteration will not
     * <br>reflect changes made during the g_dataset_foreach() call, other
     * <br>than skipping over elements that are removed.
     * @param dataset_location the location identifying the dataset.
     * @param func the function to call for each data element.
     * @param user_data user data to pass to the function.
    */
    public static void datasetForeach(@Nonnull ch.bailu.gtk.type.Pointer dataset_location, OnDataForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGlib.INST().g_dataset_foreach(asCPointerNotNull(dataset_location), toOnDataForeachFunc(getClassHandler().getInstance(), "datasetForeach", func), asCPointer(user_data));
    }

    /**
     * Gets the data element corresponding to a &#35;GQuark.
     * @param dataset_location the location identifying the dataset.
     * @param key_id the &#35;GQuark id to identify the data element.
     * @return the data element corresponding to          the &#35;GQuark, or %NULL if it is not found.
    */
    public static ch.bailu.gtk.type.Pointer datasetIdGetData(@Nonnull ch.bailu.gtk.type.Pointer dataset_location, int key_id)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_dataset_id_get_data(asCPointerNotNull(dataset_location), key_id)));
    }

    /**
     * Removes an element, without calling its destroy notification
     * <br>function.
     * @param dataset_location the location identifying the dataset.
     * @param key_id the &#35;GQuark ID identifying the data element.
     * @return the data previously stored at &#64;key_id,          or %NULL if none.
    */
    public static ch.bailu.gtk.type.Pointer datasetIdRemoveNoNotify(@Nonnull ch.bailu.gtk.type.Pointer dataset_location, int key_id)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_dataset_id_remove_no_notify(asCPointerNotNull(dataset_location), key_id)));
    }

    /**
     * Sets the data element associated with the given &#35;GQuark id, and also
     * <br>the function to call when the data element is destroyed. Any
     * <br>previous data with the same key is removed, and its destroy function
     * <br>is called.
     * @param dataset_location the location identifying the dataset.
     * @param key_id the &#35;GQuark id to identify the data element.
     * @param data the data element.
     * @param destroy_func the function to call when the data element is                removed. This function will be called with the data                element and can be used to free any memory allocated                for it.
    */
    public static void datasetIdSetDataFull(@Nonnull ch.bailu.gtk.type.Pointer dataset_location, int key_id, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy_func)  {
        JnaGlib.INST().g_dataset_id_set_data_full(asCPointerNotNull(dataset_location), key_id, asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "datasetIdSetDataFull", destroy_func));
    }

    /**
     * Generates a printed representation of the date, in a
     * <br>[locale][setlocale]-specific way.
     * <br>Works just like the platform's C library strftime() function,
     * <br>but only accepts date-related formats; time-related formats
     * <br>give undefined results. Date must be valid. Unlike strftime()
     * <br>(which uses the locale encoding), works on a UTF-8 format
     * <br>string and stores a UTF-8 result.
     * <br>
     * <br>This function does not provide any conversion specifiers in
     * <br>addition to those implemented by the platform's C library.
     * <br>For example, don't expect that using g_date_strftime() would
     * <br>make the &#92;%F provided by the C99 strftime() work on Windows
     * <br>where the C library only complies to C89.
     * @param s destination buffer
     * @param slen buffer size
     * @param format format string
     * @param date valid &#35;GDate
     * @return number of characters written to the buffer, or 0 the buffer was too small
    */
    public static long dateStrftime(@Nonnull ch.bailu.gtk.type.Str s, long slen, @Nonnull ch.bailu.gtk.type.Str format, @Nonnull Date date)  {
        return JnaGlib.INST().g_date_strftime(asCPointerNotNull(s), slen, asCPointerNotNull(format), asCPointerNotNull(date));
    }

    /**
     * Returns %TRUE if the Julian day is valid. Anything greater than zero
     * <br>is basically a valid Julian, though there is a 32-bit limit.
     * @param julian_date Julian day to check
     * @return %TRUE if the Julian day is valid
    */
    public static boolean dateValidJulian(int julian_date)  {
        return JnaGlib.INST().g_date_valid_julian(julian_date);
    }

    /**
     * Returns %TRUE if the month value is valid. The 12 &#35;GDateMonth
     * <br>enumeration values are the only valid months.
     * @param month month
     * @return %TRUE if the month is valid
    */
    public static boolean dateValidMonth(int month)  {
        return JnaGlib.INST().g_date_valid_month(month);
    }

    /**
     * Returns %TRUE if the weekday is valid. The seven &#35;GDateWeekday enumeration
     * <br>values are the only valid weekdays.
     * @param weekday weekday
     * @return %TRUE if the weekday is valid
    */
    public static boolean dateValidWeekday(int weekday)  {
        return JnaGlib.INST().g_date_valid_weekday(weekday);
    }

    /**
     * This is a variant of g_dgettext() that allows specifying a locale
     * <br>category instead of always using `LC_MESSAGES`. See g_dgettext() for
     * <br>more information about how this functions differs from calling
     * <br>dcgettext() directly.
     * @param domain the translation domain to use, or %NULL to use   the domain set with textdomain()
     * @param msgid message to translate
     * @param category a locale category
     * @return the translated string for the given locale category
    */
    public static ch.bailu.gtk.type.Str dcgettext(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str msgid, int category)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dcgettext(asCPointer(domain), asCPointerNotNull(msgid), category)));
    }

    /**
     * This function is a wrapper of dgettext() which does not translate
     * <br>the message if the default domain as set with textdomain() has no
     * <br>translations for the current locale.
     * <br>
     * <br>The advantage of using this function over dgettext() proper is that
     * <br>libraries using this function (like GTK+) will not use translations
     * <br>if the application using the library does not have translations for
     * <br>the current locale.  This results in a consistent English-only
     * <br>interface instead of one having partial translations.  For this
     * <br>feature to work, the call to textdomain() and setlocale() should
     * <br>precede any g_dgettext() invocations.  For GTK+, it means calling
     * <br>textdomain() before gtk_init or its variants.
     * <br>
     * <br>This function disables translations if and only if upon its first
     * <br>call all the following conditions hold:
     * <br>
     * <br>- &#64;domain is not %NULL
     * <br>
     * <br>- textdomain() has been called to set a default text domain
     * <br>
     * <br>- there is no translations available for the default text domain
     * <br>  and the current locale
     * <br>
     * <br>- current locale is not &quot;C&quot; or any English locales (those
     * <br>  starting with &quot;en_&quot;)
     * <br>
     * <br>Note that this behavior may not be desired for example if an application
     * <br>has its untranslated messages in a language other than English. In those
     * <br>cases the application should call textdomain() after initializing GTK+.
     * <br>
     * <br>Applications should normally not use this function directly,
     * <br>but use the _() macro for translations.
     * @param domain the translation domain to use, or %NULL to use   the domain set with textdomain()
     * @param msgid message to translate
     * @return The translated string
    */
    public static ch.bailu.gtk.type.Str dgettext(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str msgid)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dgettext(asCPointer(domain), asCPointerNotNull(msgid))));
    }

    /**
     * Creates a subdirectory in the preferred directory for temporary
     * <br>files (as returned by g_get_tmp_dir()).
     * <br>
     * <br>&#64;tmpl should be a string in the GLib file name encoding containing
     * <br>a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * <br>However, unlike these functions, the template should only be a
     * <br>basename, no directory components are allowed. If template is
     * <br>%NULL, a default template is used.
     * <br>
     * <br>Note that in contrast to g_mkdtemp() (and mkdtemp()) &#64;tmpl is not
     * <br>modified, and might thus be a read-only literal string.
     * @param tmpl Template for directory name,     as in g_mkdtemp(), basename only, or %NULL for a default template
     * @return The actual name used. This string     should be freed with g_free() when not needed any longer and is     is in the GLib file name encoding. In case of errors, %NULL is     returned and &#64;error will be set.
    */
    public static ch.bailu.gtk.type.Str dirMakeTmp(@Nullable ch.bailu.gtk.type.Str tmpl) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dir_make_tmp(asCPointer(tmpl), 0L)));
    }

    /**
     * Compares two &#35;gpointer arguments and returns %TRUE if they are equal.
     * <br>It can be passed to g_hash_table_new() as the &#64;key_equal_func
     * <br>parameter, when using opaque pointers compared by pointer value as
     * <br>keys in a &#35;GHashTable.
     * <br>
     * <br>This equality function is also appropriate for keys that are integers
     * <br>stored in pointers, such as `GINT_TO_POINTER (n)`.
     * @param v1 a key
     * @param v2 a key to compare with &#64;v1
     * @return %TRUE if the two keys match.
    */
    public static boolean directEqual(@Nullable ch.bailu.gtk.type.Pointer v1, @Nullable ch.bailu.gtk.type.Pointer v2)  {
        return JnaGlib.INST().g_direct_equal(asCPointer(v1), asCPointer(v2));
    }

    /**
     * Converts a gpointer to a hash value.
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>when using opaque pointers compared by pointer value as keys in a
     * <br>&#35;GHashTable.
     * <br>
     * <br>This hash function is also appropriate for keys that are integers
     * <br>stored in pointers, such as `GINT_TO_POINTER (n)`.
     * @param v a &#35;gpointer key
     * @return a hash value corresponding to the key.
    */
    public static int directHash(@Nullable ch.bailu.gtk.type.Pointer v)  {
        return JnaGlib.INST().g_direct_hash(asCPointer(v));
    }

    /**
     * This function is a wrapper of dngettext() which does not translate
     * <br>the message if the default domain as set with textdomain() has no
     * <br>translations for the current locale.
     * <br>
     * <br>See g_dgettext() for details of how this differs from dngettext()
     * <br>proper.
     * @param domain the translation domain to use, or %NULL to use   the domain set with textdomain()
     * @param msgid message to translate
     * @param msgid_plural plural form of the message
     * @param n the quantity for which translation is needed
     * @return The translated string
    */
    public static ch.bailu.gtk.type.Str dngettext(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str msgid, @Nonnull ch.bailu.gtk.type.Str msgid_plural, long n)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dngettext(asCPointer(domain), asCPointerNotNull(msgid), asCPointerNotNull(msgid_plural), n)));
    }

    /**
     * Compares the two &#35;gdouble values being pointed to and returns
     * <br>%TRUE if they are equal.
     * <br>It can be passed to g_hash_table_new() as the &#64;key_equal_func
     * <br>parameter, when using non-%NULL pointers to doubles as keys in a
     * <br>&#35;GHashTable.
     * @param v1 a pointer to a &#35;gdouble key
     * @param v2 a pointer to a &#35;gdouble key to compare with &#64;v1
     * @return %TRUE if the two keys match.
    */
    public static boolean doubleEqual(@Nonnull ch.bailu.gtk.type.Pointer v1, @Nonnull ch.bailu.gtk.type.Pointer v2)  {
        return JnaGlib.INST().g_double_equal(asCPointerNotNull(v1), asCPointerNotNull(v2));
    }

    /**
     * Converts a pointer to a &#35;gdouble to a hash value.
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>when using non-%NULL pointers to doubles as keys in a &#35;GHashTable.
     * @param v a pointer to a &#35;gdouble key
     * @return a hash value corresponding to the key.
    */
    public static int doubleHash(@Nonnull ch.bailu.gtk.type.Pointer v)  {
        return JnaGlib.INST().g_double_hash(asCPointerNotNull(v));
    }

    /**
     * This function is a variant of g_dgettext() which supports
     * <br>a disambiguating message context. GNU gettext uses the
     * <br>'&#92;004' character to separate the message context and
     * <br>message id in &#64;msgctxtid.
     * <br>If 0 is passed as &#64;msgidoffset, this function will fall back to
     * <br>trying to use the deprecated convention of using &quot;|&quot; as a separation
     * <br>character.
     * <br>
     * <br>This uses g_dgettext() internally. See that functions for differences
     * <br>with dgettext() proper.
     * <br>
     * <br>Applications should normally not use this function directly,
     * <br>but use the C_() macro for translations with context.
     * @param domain the translation domain to use, or %NULL to use   the domain set with textdomain()
     * @param msgctxtid a combined message context and message id, separated   by a &#92;004 character
     * @param msgidoffset the offset of the message id in &#64;msgctxid
     * @return The translated string
    */
    public static ch.bailu.gtk.type.Str dpgettext(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str msgctxtid, long msgidoffset)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dpgettext(asCPointer(domain), asCPointerNotNull(msgctxtid), msgidoffset)));
    }

    /**
     * This function is a variant of g_dgettext() which supports
     * <br>a disambiguating message context. GNU gettext uses the
     * <br>'&#92;004' character to separate the message context and
     * <br>message id in &#64;msgctxtid.
     * <br>
     * <br>This uses g_dgettext() internally. See that functions for differences
     * <br>with dgettext() proper.
     * <br>
     * <br>This function differs from C_() in that it is not a macro and
     * <br>thus you may use non-string-literals as context and msgid arguments.
     * @param domain the translation domain to use, or %NULL to use   the domain set with textdomain()
     * @param context the message context
     * @param msgid the message
     * @return The translated string
    */
    public static ch.bailu.gtk.type.Str dpgettext2(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str context, @Nonnull ch.bailu.gtk.type.Str msgid)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_dpgettext2(asCPointer(domain), asCPointerNotNull(context), asCPointerNotNull(msgid))));
    }

    /**
     * Gets a &#35;GFileError constant based on the passed-in &#64;err_no.
     * <br>
     * <br>For example, if you pass in `EEXIST` this function returns
     * <br>%G_FILE_ERROR_EXIST. Unlike `errno` values, you can portably
     * <br>assume that all &#35;GFileError values will exist.
     * <br>
     * <br>Normally a &#35;GFileError value goes into a &#35;GError returned
     * <br>from a function that manipulates files. So you would use
     * <br>g_file_error_from_errno() when constructing a &#35;GError.
     * @param err_no an &quot;errno&quot; value
     * @return &#35;GFileError corresponding to the given &#64;err_no
    */
    public static int fileErrorFromErrno(int err_no)  {
        return JnaGlib.INST().g_file_error_from_errno(err_no);
    }

    /**
     * 
     * @return 
    */
    public static int fileErrorQuark()  {
        return JnaGlib.INST().g_file_error_quark();
    }

    /**
     * Reads the contents of the symbolic link &#64;filename like the POSIX
     * <br>readlink() function.  The returned string is in the encoding used
     * <br>for filenames. Use g_filename_to_utf8() to convert it to UTF-8.
     * @param filename the symbolic link
     * @return A newly-allocated string with     the contents of the symbolic link, or %NULL if an error occurred.
    */
    public static ch.bailu.gtk.type.Str fileReadLink(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_file_read_link(asCPointerNotNull(filename), 0L)));
    }

    /**
     * Writes all of &#64;contents to a file named &#64;filename. This is a convenience
     * <br>wrapper around calling g_file_set_contents_full() with `flags` set to
     * <br>`G_FILE_SET_CONTENTS_CONSISTENT | G_FILE_SET_CONTENTS_ONLY_EXISTING` and
     * <br>`mode` set to `0666`.
     * @param filename name of a file to write &#64;contents to, in the GLib file name   encoding
     * @param contents string to write to the file
     * @param length length of &#64;contents, or -1 if &#64;contents is a nul-terminated string
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public static boolean fileSetContents(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Str contents, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_file_set_contents(asCPointerNotNull(filename), asCPointerNotNull(contents), length, 0L);
    }

    /**
     * Writes all of &#64;contents to a file named &#64;filename, with good error checking.
     * <br>If a file called &#64;filename already exists it will be overwritten.
     * <br>
     * <br>&#64;flags control the properties of the write operation: whether it’s atomic,
     * <br>and what the tradeoff is between returning quickly or being resilient to
     * <br>system crashes.
     * <br>
     * <br>As this function performs file I/O, it is recommended to not call it anywhere
     * <br>where blocking would cause problems, such as in the main loop of a graphical
     * <br>application. In particular, if &#64;flags has any value other than
     * <br>%G_FILE_SET_CONTENTS_NONE then this function may call `fsync()`.
     * <br>
     * <br>If %G_FILE_SET_CONTENTS_CONSISTENT is set in &#64;flags, the operation is atomic
     * <br>in the sense that it is first written to a temporary file which is then
     * <br>renamed to the final name.
     * <br>
     * <br>Notes:
     * <br>
     * <br>- On UNIX, if &#64;filename already exists hard links to &#64;filename will break.
     * <br>  Also since the file is recreated, existing permissions, access control
     * <br>  lists, metadata etc. may be lost. If &#64;filename is a symbolic link,
     * <br>  the link itself will be replaced, not the linked file.
     * <br>
     * <br>- On UNIX, if &#64;filename already exists and is non-empty, and if the system
     * <br>  supports it (via a journalling filesystem or equivalent), and if
     * <br>  %G_FILE_SET_CONTENTS_CONSISTENT is set in &#64;flags, the `fsync()` call (or
     * <br>  equivalent) will be used to ensure atomic replacement: &#64;filename
     * <br>  will contain either its old contents or &#64;contents, even in the face of
     * <br>  system power loss, the disk being unsafely removed, etc.
     * <br>
     * <br>- On UNIX, if &#64;filename does not already exist or is empty, there is a
     * <br>  possibility that system power loss etc. after calling this function will
     * <br>  leave &#64;filename empty or full of NUL bytes, depending on the underlying
     * <br>  filesystem, unless %G_FILE_SET_CONTENTS_DURABLE and
     * <br>  %G_FILE_SET_CONTENTS_CONSISTENT are set in &#64;flags.
     * <br>
     * <br>- On Windows renaming a file will not remove an existing file with the
     * <br>  new name, so on Windows there is a race condition between the existing
     * <br>  file being removed and the temporary file being renamed.
     * <br>
     * <br>- On Windows there is no way to remove a file that is open to some
     * <br>  process, or mapped into memory. Thus, this function will fail if
     * <br>  &#64;filename already exists and is open.
     * <br>
     * <br>If the call was successful, it returns %TRUE. If the call was not successful,
     * <br>it returns %FALSE and sets &#64;error. The error domain is %G_FILE_ERROR.
     * <br>Possible error codes are those in the &#35;GFileError enumeration.
     * <br>
     * <br>Note that the name for the temporary file is constructed by appending up
     * <br>to 7 characters to &#64;filename.
     * <br>
     * <br>If the file didn’t exist before and is created, it will be given the
     * <br>permissions from &#64;mode. Otherwise, the permissions of the existing file may
     * <br>be changed to &#64;mode depending on &#64;flags, or they may remain unchanged.
     * @param filename name of a file to write &#64;contents to, in the GLib file name   encoding
     * @param contents string to write to the file
     * @param length length of &#64;contents, or -1 if &#64;contents is a nul-terminated string
     * @param flags flags controlling the safety vs speed of the operation
     * @param mode file mode, as passed to `open()`; typically this will be `0666`
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public static boolean fileSetContentsFull(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Str contents, long length, int flags, int mode) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_file_set_contents_full(asCPointerNotNull(filename), asCPointerNotNull(contents), length, flags, mode, 0L);
    }

    /**
     * Returns %TRUE if any of the tests in the bitfield &#64;test are
     * <br>%TRUE. For example, `(G_FILE_TEST_EXISTS | G_FILE_TEST_IS_DIR)`
     * <br>will return %TRUE if the file exists; the check whether it's a
     * <br>directory doesn't matter since the existence test is %TRUE. With
     * <br>the current set of available tests, there's no point passing in
     * <br>more than one test at a time.
     * <br>
     * <br>Apart from %G_FILE_TEST_IS_SYMLINK all tests follow symbolic links,
     * <br>so for a symbolic link to a regular file g_file_test() will return
     * <br>%TRUE for both %G_FILE_TEST_IS_SYMLINK and %G_FILE_TEST_IS_REGULAR.
     * <br>
     * <br>Note, that for a dangling symbolic link g_file_test() will return
     * <br>%TRUE for %G_FILE_TEST_IS_SYMLINK and %FALSE for all other flags.
     * <br>
     * <br>You should never use g_file_test() to test whether it is safe
     * <br>to perform an operation, because there is always the possibility
     * <br>of the condition changing before you actually perform the operation.
     * <br>For example, you might think you could use %G_FILE_TEST_IS_SYMLINK
     * <br>to know whether it is safe to write to a file without being
     * <br>tricked into writing into a different location. It doesn't work!
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  // DON'T DO THIS
     *  if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
     *    {
     *      fd = g_open (filename, O_WRONLY);
     *      // write to fd
     *    }
     * </pre>
     * <br>
     * <br>Another thing to note is that %G_FILE_TEST_EXISTS and
     * <br>%G_FILE_TEST_IS_EXECUTABLE are implemented using the access()
     * <br>system call. This usually doesn't matter, but if your program
     * <br>is setuid or setgid it means that these tests will give you
     * <br>the answer for the real user ID and group ID, rather than the
     * <br>effective user ID and group ID.
     * <br>
     * <br>On Windows, there are no symlinks, so testing for
     * <br>%G_FILE_TEST_IS_SYMLINK will always return %FALSE. Testing for
     * <br>%G_FILE_TEST_IS_EXECUTABLE will just check that the file exists and
     * <br>its name indicates that it is executable, checking for well-known
     * <br>extensions and those listed in the `PATHEXT` environment variable.
     * @param filename a filename to test in the     GLib file name encoding
     * @param test bitfield of &#35;GFileTest flags
     * @return whether a test was %TRUE
    */
    public static boolean fileTest(@Nonnull ch.bailu.gtk.type.Str filename, int test)  {
        return JnaGlib.INST().g_file_test(asCPointerNotNull(filename), test);
    }

    /**
     * Returns the display basename for the particular filename, guaranteed
     * <br>to be valid UTF-8. The display name might not be identical to the filename,
     * <br>for instance there might be problems converting it to UTF-8, and some files
     * <br>can be translated in the display.
     * <br>
     * <br>If GLib cannot make sense of the encoding of &#64;filename, as a last resort it
     * <br>replaces unknown characters with U+FFFD, the Unicode replacement character.
     * <br>You can search the result for the UTF-8 encoding of this character (which is
     * <br>&quot;&#92;357&#92;277&#92;275&quot; in octal notation) to find out if &#64;filename was in an invalid
     * <br>encoding.
     * <br>
     * <br>You must pass the whole absolute pathname to this functions so that
     * <br>translation of well known locations can be done.
     * <br>
     * <br>This function is preferred over g_filename_display_name() if you know the
     * <br>whole path, as it allows translation.
     * @param filename an absolute pathname in the     GLib file name encoding
     * @return a newly allocated string containing   a rendition of the basename of the filename in valid UTF-8
    */
    public static ch.bailu.gtk.type.Str filenameDisplayBasename(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_filename_display_basename(asCPointerNotNull(filename))));
    }

    /**
     * Converts a filename into a valid UTF-8 string. The conversion is
     * <br>not necessarily reversible, so you should keep the original around
     * <br>and use the return value of this function only for display purposes.
     * <br>Unlike g_filename_to_utf8(), the result is guaranteed to be non-%NULL
     * <br>even if the filename actually isn't in the GLib file name encoding.
     * <br>
     * <br>If GLib cannot make sense of the encoding of &#64;filename, as a last resort it
     * <br>replaces unknown characters with U+FFFD, the Unicode replacement character.
     * <br>You can search the result for the UTF-8 encoding of this character (which is
     * <br>&quot;&#92;357&#92;277&#92;275&quot; in octal notation) to find out if &#64;filename was in an invalid
     * <br>encoding.
     * <br>
     * <br>If you know the whole pathname of the file you should use
     * <br>g_filename_display_basename(), since that allows location-based
     * <br>translation of filenames.
     * @param filename a pathname hopefully in the     GLib file name encoding
     * @return a newly allocated string containing   a rendition of the filename in valid UTF-8
    */
    public static ch.bailu.gtk.type.Str filenameDisplayName(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_filename_display_name(asCPointerNotNull(filename))));
    }

    /**
     * Converts a string from UTF-8 to the encoding GLib uses for
     * <br>filenames. Note that on Windows GLib uses UTF-8 for filenames;
     * <br>on other platforms, this function indirectly depends on the
     * <br>[current locale][setlocale].
     * <br>
     * <br>The input string shall not contain nul characters even if the &#64;len
     * <br>argument is positive. A nul character found inside the string will result
     * <br>in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. If the filename encoding is
     * <br>not UTF-8 and the conversion output contains a nul character, the error
     * <br>%G_CONVERT_ERROR_EMBEDDED_NUL is set and the function returns %NULL.
     * @param utf8string a UTF-8 encoded string.
     * @param len the length of the string, or -1 if the string is                 nul-terminated.
     * @param bytes_read location to store the number of bytes in                 the input string that were successfully converted, or %NULL.                 Even if the conversion was successful, this may be                 less than &#64;len if there were partial characters                 at the end of the input. If the error                 %G_CONVERT_ERROR_ILLEGAL_SEQUENCE occurs, the value                 stored will be the byte offset after the last valid                 input sequence.
     * @param bytes_written the number of bytes stored in                 the output buffer (not including the terminating nul).
     * @return                The converted string, or %NULL on an error.
    */
    public static ch.bailu.gtk.type.Str filenameFromUtf8(@Nonnull ch.bailu.gtk.type.Str utf8string, long len, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_filename_from_utf8(asCPointerNotNull(utf8string), len, asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * Converts an absolute filename to an escaped ASCII-encoded URI, with the path
     * <br>component following Section 3.3. of RFC 2396.
     * @param filename an absolute filename specified in the GLib file     name encoding, which is the on-disk file name bytes on Unix, and UTF-8     on Windows
     * @param hostname A UTF-8 encoded hostname, or %NULL for none.
     * @return a newly-allocated string holding the resulting               URI, or %NULL on an error.
    */
    public static ch.bailu.gtk.type.Str filenameToUri(@Nonnull ch.bailu.gtk.type.Str filename, @Nullable ch.bailu.gtk.type.Str hostname) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_filename_to_uri(asCPointerNotNull(filename), asCPointer(hostname), 0L)));
    }

    /**
     * Converts a string which is in the encoding used by GLib for
     * <br>filenames into a UTF-8 string. Note that on Windows GLib uses UTF-8
     * <br>for filenames; on other platforms, this function indirectly depends on
     * <br>the [current locale][setlocale].
     * <br>
     * <br>The input string shall not contain nul characters even if the &#64;len
     * <br>argument is positive. A nul character found inside the string will result
     * <br>in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE.
     * <br>If the source encoding is not UTF-8 and the conversion output contains a
     * <br>nul character, the error %G_CONVERT_ERROR_EMBEDDED_NUL is set and the
     * <br>function returns %NULL. Use g_convert() to produce output that
     * <br>may contain embedded nul characters.
     * @param opsysstring a string in the encoding for filenames
     * @param len the length of the string, or -1 if the string is                 nul-terminated (Note that some encodings may allow nul                 bytes to occur inside strings. In that case, using -1                 for the &#64;len parameter is unsafe)
     * @param bytes_read location to store the number of bytes in the                 input string that were successfully converted, or %NULL.                 Even if the conversion was successful, this may be                 less than &#64;len if there were partial characters                 at the end of the input. If the error                 %G_CONVERT_ERROR_ILLEGAL_SEQUENCE occurs, the value                 stored will be the byte offset after the last valid                 input sequence.
     * @param bytes_written the number of bytes stored in the output                 buffer (not including the terminating nul).
     * @return The converted string, or %NULL on an error.
    */
    public static ch.bailu.gtk.type.Str filenameToUtf8(@Nonnull ch.bailu.gtk.type.Str opsysstring, long len, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_filename_to_utf8(asCPointerNotNull(opsysstring), len, asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * Locates the first executable named &#64;program in the user's path, in the
     * <br>same way that execvp() would locate it. Returns an allocated string
     * <br>with the absolute path name, or %NULL if the program is not found in
     * <br>the path. If &#64;program is already an absolute path, returns a copy of
     * <br>&#64;program if &#64;program exists and is executable, and %NULL otherwise.
     * <br> 
     * <br>On Windows, if &#64;program does not have a file type suffix, tries
     * <br>with the suffixes .exe, .cmd, .bat and .com, and the suffixes in
     * <br>the `PATHEXT` environment variable.
     * <br>
     * <br>On Windows, it looks for the file in the same way as CreateProcess()
     * <br>would. This means first in the directory where the executing
     * <br>program was loaded from, then in the current directory, then in the
     * <br>Windows 32-bit system directory, then in the Windows directory, and
     * <br>finally in the directories in the `PATH` environment variable. If
     * <br>the program is found, the return value contains the full name
     * <br>including the type suffix.
     * @param program a program name in the GLib file name encoding
     * @return a newly-allocated   string with the absolute path, or %NULL
    */
    public static ch.bailu.gtk.type.Str findProgramInPath(@Nonnull ch.bailu.gtk.type.Str program)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_find_program_in_path(asCPointerNotNull(program))));
    }

    /**
     * Formats a size (for example the size of a file) into a human readable
     * <br>string.  Sizes are rounded to the nearest size prefix (kB, MB, GB)
     * <br>and are displayed rounded to the nearest tenth. E.g. the file size
     * <br>3292528 bytes will be converted into the string &quot;3.2 MB&quot;. The returned string
     * <br>is UTF-8, and may use a non-breaking space to separate the number and units,
     * <br>to ensure they aren’t separated when line wrapped.
     * <br>
     * <br>The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
     * <br>
     * <br>This string should be freed with g_free() when not needed any longer.
     * <br>
     * <br>See g_format_size_full() for more options about how the size might be
     * <br>formatted.
     * @param size a size in bytes
     * @return a newly-allocated formatted string containing   a human readable file size
    */
    public static ch.bailu.gtk.type.Str formatSize(long size)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_format_size(size)));
    }

    /**
     * Formats a size.
     * <br>
     * <br>This function is similar to g_format_size() but allows for flags
     * <br>that modify the output. See &#35;GFormatSizeFlags.
     * @param size a size in bytes
     * @param flags &#35;GFormatSizeFlags to modify the output
     * @return a newly-allocated formatted string   containing a human readable file size
    */
    public static ch.bailu.gtk.type.Str formatSizeFull(long size, int flags)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_format_size_full(size, flags)));
    }

    /**
     * Frees the memory pointed to by &#64;mem.
     * <br>
     * <br>If &#64;mem is %NULL it simply returns, so there is no need to check &#64;mem
     * <br>against %NULL before calling this function.
     * @param mem the memory to free
    */
    public static void free(@Nullable ch.bailu.gtk.type.Pointer mem)  {
        JnaGlib.INST().g_free(asCPointer(mem));
    }

    /**
     * Gets a human-readable name for the application, as set by
     * <br>g_set_application_name(). This name should be localized if
     * <br>possible, and is intended for display to the user.  Contrast with
     * <br>g_get_prgname(), which gets a non-localized name. If
     * <br>g_set_application_name() has not been called, returns the result of
     * <br>g_get_prgname() (which may be %NULL if g_set_prgname() has also not
     * <br>been called).
     * @return human-readable application   name. May return %NULL
    */
    public static ch.bailu.gtk.type.Str getApplicationName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_application_name()));
    }

    /**
     * Obtains the character set for the [current locale][setlocale]; you
     * <br>might use this character set as an argument to g_convert(), to convert
     * <br>from the current locale's encoding to some other encoding. (Frequently
     * <br>g_locale_to_utf8() and g_locale_from_utf8() are nice shortcuts, though.)
     * <br>
     * <br>On Windows the character set returned by this function is the
     * <br>so-called system default ANSI code-page. That is the character set
     * <br>used by the &quot;narrow&quot; versions of C library and Win32 functions that
     * <br>handle file names. It might be different from the character set
     * <br>used by the C library's current locale.
     * <br>
     * <br>On Linux, the character set is found by consulting nl_langinfo() if
     * <br>available. If not, the environment variables `LC_ALL`, `LC_CTYPE`, `LANG`
     * <br>and `CHARSET` are queried in order.
     * <br>
     * <br>The return value is %TRUE if the locale's encoding is UTF-8, in that
     * <br>case you can perhaps avoid calling g_convert().
     * <br>
     * <br>The string returned in &#64;charset is not allocated, and should not be
     * <br>freed.
     * @param charset return location for character set   name, or %NULL.
     * @return %TRUE if the returned charset is UTF-8
    */
    public static boolean getCharset(@Nullable ch.bailu.gtk.type.Strs charset)  {
        return JnaGlib.INST().g_get_charset(asCPointer(charset));
    }

    /**
     * Gets the character set for the current locale.
     * @return a newly allocated string containing the name     of the character set. This string must be freed with g_free().
    */
    public static ch.bailu.gtk.type.Str getCodeset()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_codeset()));
    }

    /**
     * Obtains the character set used by the console attached to the process,
     * <br>which is suitable for printing output to the terminal.
     * <br>
     * <br>Usually this matches the result returned by g_get_charset(), but in
     * <br>environments where the locale's character set does not match the encoding
     * <br>of the console this function tries to guess a more suitable value instead.
     * <br>
     * <br>On Windows the character set returned by this function is the
     * <br>output code page used by the console associated with the calling process.
     * <br>If the codepage can't be determined (for example because there is no
     * <br>console attached) UTF-8 is assumed.
     * <br>
     * <br>The return value is %TRUE if the locale's encoding is UTF-8, in that
     * <br>case you can perhaps avoid calling g_convert().
     * <br>
     * <br>The string returned in &#64;charset is not allocated, and should not be
     * <br>freed.
     * @param charset return location for character set   name, or %NULL.
     * @return %TRUE if the returned charset is UTF-8
    */
    public static boolean getConsoleCharset(@Nullable ch.bailu.gtk.type.Strs charset)  {
        return JnaGlib.INST().g_get_console_charset(asCPointer(charset));
    }

    /**
     * Gets the current directory.
     * <br>
     * <br>The returned string should be freed when no longer needed.
     * <br>The encoding of the returned string is system defined.
     * <br>On Windows, it is always UTF-8.
     * <br>
     * <br>Since GLib 2.40, this function will return the value of the &quot;PWD&quot;
     * <br>environment variable if it is set and it happens to be the same as
     * <br>the current directory.  This can make a difference in the case that
     * <br>the current directory is the target of a symbolic link.
     * @return the current directory
    */
    public static ch.bailu.gtk.type.Str getCurrentDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_current_dir()));
    }

    /**
     * Gets the current user's home directory.
     * <br>
     * <br>As with most UNIX tools, this function will return the value of the
     * <br>`HOME` environment variable if it is set to an existing absolute path
     * <br>name, falling back to the `passwd` file in the case that it is unset.
     * <br>
     * <br>If the path given in `HOME` is non-absolute, does not exist, or is
     * <br>not a directory, the result is undefined.
     * <br>
     * <br>Before version 2.36 this function would ignore the `HOME` environment
     * <br>variable, taking the value from the `passwd` database instead. This was
     * <br>changed to increase the compatibility of GLib with other programs (and
     * <br>the XDG basedir specification) and to increase testability of programs
     * <br>based on GLib (by making it easier to run them from test frameworks).
     * <br>
     * <br>If your program has a strong requirement for either the new or the
     * <br>old behaviour (and if you don't wish to increase your GLib
     * <br>dependency to ensure that the new behaviour is in effect) then you
     * <br>should either directly check the `HOME` environment variable yourself
     * <br>or unset it before calling any functions in GLib.
     * @return the current user's home directory
    */
    public static ch.bailu.gtk.type.Str getHomeDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_home_dir()));
    }

    /**
     * Return a name for the machine.
     * <br>
     * <br>The returned name is not necessarily a fully-qualified domain name,
     * <br>or even present in DNS or some other name service at all. It need
     * <br>not even be unique on your local network or site, but usually it
     * <br>is. Callers should not rely on the return value having any specific
     * <br>properties like uniqueness for security purposes. Even if the name
     * <br>of the machine is changed while an application is running, the
     * <br>return value from this function does not change. The returned
     * <br>string is owned by GLib and should not be modified or freed. If no
     * <br>name can be determined, a default fixed string &quot;localhost&quot; is
     * <br>returned.
     * <br>
     * <br>The encoding of the returned string is UTF-8.
     * @return the host name of the machine.
    */
    public static ch.bailu.gtk.type.Str getHostName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_host_name()));
    }

    /**
     * Queries the system monotonic time.
     * <br>
     * <br>The monotonic clock will always increase and doesn't suffer
     * <br>discontinuities when the user (or NTP) changes the system time.  It
     * <br>may or may not continue to tick during times where the machine is
     * <br>suspended.
     * <br>
     * <br>We try to use the clock that corresponds as closely as possible to
     * <br>the passage of time as measured by system calls such as poll() but it
     * <br>may not always be possible to do this.
     * @return the monotonic time, in microseconds
    */
    public static long getMonotonicTime()  {
        return JnaGlib.INST().g_get_monotonic_time();
    }

    /**
     * Determine the approximate number of threads that the system will
     * <br>schedule simultaneously for this process.  This is intended to be
     * <br>used as a parameter to g_thread_pool_new() for CPU bound tasks and
     * <br>similar cases.
     * @return Number of schedulable threads, always greater than 0
    */
    public static int getNumProcessors()  {
        return JnaGlib.INST().g_get_num_processors();
    }

    /**
     * Get information about the operating system.
     * <br>
     * <br>On Linux this comes from the `/etc/os-release` file. On other systems, it may
     * <br>come from a variety of sources. You can either use the standard key names
     * <br>like %G_OS_INFO_KEY_NAME or pass any UTF-8 string key name. For example,
     * <br>`/etc/os-release` provides a number of other less commonly used values that may
     * <br>be useful. No key is guaranteed to be provided, so the caller should always
     * <br>check if the result is %NULL.
     * @param key_name a key for the OS info being requested, for example %G_OS_INFO_KEY_NAME.
     * @return The associated value for the requested key or %NULL if   this information is not provided.
    */
    public static ch.bailu.gtk.type.Str getOsInfo(@Nonnull ch.bailu.gtk.type.Str key_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_os_info(asCPointerNotNull(key_name))));
    }

    /**
     * Gets the name of the program. This name should not be localized,
     * <br>in contrast to g_get_application_name().
     * <br>
     * <br>If you are using &#35;GApplication the program name is set in
     * <br>g_application_run(). In case of GDK or GTK+ it is set in
     * <br>gdk_init(), which is called by gtk_init() and the
     * <br>&#35;GtkApplication::startup handler. The program name is found by
     * <br>taking the last component of &#64;argv[0].
     * @return the name of the program,   or %NULL if it has not been set yet. The returned string belongs   to GLib and must not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getPrgname()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_prgname()));
    }

    /**
     * Gets the real name of the user. This usually comes from the user's
     * <br>entry in the `passwd` file. The encoding of the returned string is
     * <br>system-defined. (On Windows, it is, however, always UTF-8.) If the
     * <br>real user name cannot be determined, the string &quot;Unknown&quot; is
     * <br>returned.
     * @return the user's real name.
    */
    public static ch.bailu.gtk.type.Str getRealName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_real_name()));
    }

    /**
     * Queries the system wall-clock time.
     * <br>
     * <br>This call is functionally equivalent to g_get_current_time() except
     * <br>that the return value is often more convenient than dealing with a
     * <br>&#35;GTimeVal.
     * <br>
     * <br>You should only use this call if you are actually interested in the real
     * <br>wall-clock time.  g_get_monotonic_time() is probably more useful for
     * <br>measuring intervals.
     * @return the number of microseconds since January 1, 1970 UTC.
    */
    public static long getRealTime()  {
        return JnaGlib.INST().g_get_real_time();
    }

    /**
     * Gets the directory to use for temporary files.
     * <br>
     * <br>On UNIX, this is taken from the `TMPDIR` environment variable.
     * <br>If the variable is not set, `P_tmpdir` is
     * <br>used, as defined by the system C library. Failing that, a
     * <br>hard-coded default of &quot;/tmp&quot; is returned.
     * <br>
     * <br>On Windows, the `TEMP` environment variable is used, with the
     * <br>root directory of the Windows installation (eg: &quot;C:&#92;&quot;) used
     * <br>as a default.
     * <br>
     * <br>The encoding of the returned string is system-defined. On Windows,
     * <br>it is always UTF-8. The return value is never %NULL or the empty
     * <br>string.
     * @return the directory to use for temporary files.
    */
    public static ch.bailu.gtk.type.Str getTmpDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_tmp_dir()));
    }

    /**
     * Returns a base directory in which to store non-essential, cached
     * <br>data specific to particular user.
     * <br>
     * <br>On UNIX platforms this is determined using the mechanisms described
     * <br>in the
     * <br>[XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * <br>In this case the directory retrieved will be `XDG_CACHE_HOME`.
     * <br>
     * <br>On Windows it follows XDG Base Directory Specification if `XDG_CACHE_HOME` is defined.
     * <br>If `XDG_CACHE_HOME` is undefined, the directory that serves as a common
     * <br>repository for temporary Internet files is used instead. A typical path is
     * <br>`C:&#92;Documents and Settings&#92;username&#92;Local Settings&#92;Temporary Internet Files`.
     * <br>See the [documentation for `FOLDERID_InternetCache`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * <br>
     * <br>The return value is cached and modifying it at runtime is not supported, as
     * <br>it’s not thread-safe to modify environment variables at runtime.
     * @return a string owned by GLib that   must not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserCacheDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_cache_dir()));
    }

    /**
     * Returns a base directory in which to store user-specific application
     * <br>configuration information such as user preferences and settings.
     * <br>
     * <br>On UNIX platforms this is determined using the mechanisms described
     * <br>in the
     * <br>[XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * <br>In this case the directory retrieved will be `XDG_CONFIG_HOME`.
     * <br>
     * <br>On Windows it follows XDG Base Directory Specification if `XDG_CONFIG_HOME` is defined.
     * <br>If `XDG_CONFIG_HOME` is undefined, the folder to use for local (as opposed
     * <br>to roaming) application data is used instead. See the
     * <br>[documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * <br>Note that in this case on Windows it will be  the same
     * <br>as what g_get_user_data_dir() returns.
     * <br>
     * <br>The return value is cached and modifying it at runtime is not supported, as
     * <br>it’s not thread-safe to modify environment variables at runtime.
     * @return a string owned by GLib that   must not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserConfigDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_config_dir()));
    }

    /**
     * Returns a base directory in which to access application data such
     * <br>as icons that is customized for a particular user.
     * <br>
     * <br>On UNIX platforms this is determined using the mechanisms described
     * <br>in the
     * <br>[XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * <br>In this case the directory retrieved will be `XDG_DATA_HOME`.
     * <br>
     * <br>On Windows it follows XDG Base Directory Specification if `XDG_DATA_HOME`
     * <br>is defined. If `XDG_DATA_HOME` is undefined, the folder to use for local (as
     * <br>opposed to roaming) application data is used instead. See the
     * <br>[documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * <br>Note that in this case on Windows it will be the same
     * <br>as what g_get_user_config_dir() returns.
     * <br>
     * <br>The return value is cached and modifying it at runtime is not supported, as
     * <br>it’s not thread-safe to modify environment variables at runtime.
     * @return a string owned by GLib that must   not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserDataDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_data_dir()));
    }

    /**
     * Gets the user name of the current user. The encoding of the returned
     * <br>string is system-defined. On UNIX, it might be the preferred file name
     * <br>encoding, or something else, and there is no guarantee that it is even
     * <br>consistent on a machine. On Windows, it is always UTF-8.
     * @return the user name of the current user.
    */
    public static ch.bailu.gtk.type.Str getUserName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_name()));
    }

    /**
     * Returns a directory that is unique to the current user on the local
     * <br>system.
     * <br>
     * <br>This is determined using the mechanisms described
     * <br>in the
     * <br>[XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * <br>This is the directory
     * <br>specified in the `XDG_RUNTIME_DIR` environment variable.
     * <br>In the case that this variable is not set, we return the value of
     * <br>g_get_user_cache_dir(), after verifying that it exists.
     * <br>
     * <br>The return value is cached and modifying it at runtime is not supported, as
     * <br>it’s not thread-safe to modify environment variables at runtime.
     * @return a string owned by GLib that must not be     modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserRuntimeDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_runtime_dir()));
    }

    /**
     * Returns the full path of a special directory using its logical id.
     * <br>
     * <br>On UNIX this is done using the XDG special user directories.
     * <br>For compatibility with existing practise, %G_USER_DIRECTORY_DESKTOP
     * <br>falls back to `$HOME/Desktop` when XDG special user directories have
     * <br>not been set up.
     * <br>
     * <br>Depending on the platform, the user might be able to change the path
     * <br>of the special directory without requiring the session to restart; GLib
     * <br>will not reflect any change once the special directories are loaded.
     * @param directory the logical id of special directory
     * @return the path to the specified special   directory, or %NULL if the logical id was not found. The returned string is   owned by GLib and should not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserSpecialDir(int directory)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_special_dir(directory)));
    }

    /**
     * Returns a base directory in which to store state files specific to
     * <br>particular user.
     * <br>
     * <br>On UNIX platforms this is determined using the mechanisms described
     * <br>in the
     * <br>[XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * <br>In this case the directory retrieved will be `XDG_STATE_HOME`.
     * <br>
     * <br>On Windows it follows XDG Base Directory Specification if `XDG_STATE_HOME` is defined.
     * <br>If `XDG_STATE_HOME` is undefined, the folder to use for local (as opposed
     * <br>to roaming) application data is used instead. See the
     * <br>[documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * <br>Note that in this case on Windows it will be the same
     * <br>as what g_get_user_data_dir() returns.
     * <br>
     * <br>The return value is cached and modifying it at runtime is not supported, as
     * <br>it’s not thread-safe to modify environment variables at runtime.
     * @return a string owned by GLib that   must not be modified or freed.
    */
    public static ch.bailu.gtk.type.Str getUserStateDir()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_get_user_state_dir()));
    }

    /**
     * Returns the value of an environment variable.
     * <br>
     * <br>On UNIX, the name and value are byte strings which might or might not
     * <br>be in some consistent character set and encoding. On Windows, they are
     * <br>in UTF-8.
     * <br>On Windows, in case the environment variable's value contains
     * <br>references to other environment variables, they are expanded.
     * @param variable the environment variable to get
     * @return the value of the environment variable, or %NULL if     the environment variable is not found. The returned string     may be overwritten by the next call to g_getenv(), g_setenv()     or g_unsetenv().
    */
    public static ch.bailu.gtk.type.Str getenv(@Nonnull ch.bailu.gtk.type.Str variable)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_getenv(asCPointerNotNull(variable))));
    }

    /**
     * This is a convenience function for using a &#35;GHashTable as a set.  It
     * <br>is equivalent to calling g_hash_table_replace() with &#64;key as both the
     * <br>key and the value.
     * <br>
     * <br>In particular, this means that if &#64;key already exists in the hash table, then
     * <br>the old copy of &#64;key in the hash table is freed and &#64;key replaces it in the
     * <br>table.
     * <br>
     * <br>When a hash table only ever contains keys that have themselves as the
     * <br>corresponding value it is able to be stored more efficiently.  See
     * <br>the discussion in the section description.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @return %TRUE if the key did not exist yet
    */
    public static boolean hashTableAdd(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaGlib.INST().g_hash_table_add(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Checks if &#64;key is in &#64;hash_table.
     * @param hash_table a &#35;GHashTable
     * @param key a key to check
     * @return %TRUE if &#64;key is in &#64;hash_table, %FALSE otherwise.
    */
    public static boolean hashTableContains(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaGlib.INST().g_hash_table_contains(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Destroys all keys and values in the &#35;GHashTable and decrements its
     * <br>reference count by 1. If keys and/or values are dynamically allocated,
     * <br>you should either free them first or create the &#35;GHashTable with destroy
     * <br>notifiers using g_hash_table_new_full(). In the latter case the destroy
     * <br>functions you supplied will be called on all keys and values during the
     * <br>destruction phase.
     * @param hash_table a &#35;GHashTable
    */
    public static void hashTableDestroy(@Nonnull HashTable hash_table)  {
        JnaGlib.INST().g_hash_table_destroy(asCPointerNotNull(hash_table));
    }

    /**
     * Inserts a new key and value into a &#35;GHashTable.
     * <br>
     * <br>If the key already exists in the &#35;GHashTable its current
     * <br>value is replaced with the new value. If you supplied a
     * <br>&#64;value_destroy_func when creating the &#35;GHashTable, the old
     * <br>value is freed using that function. If you supplied a
     * <br>&#64;key_destroy_func when creating the &#35;GHashTable, the passed
     * <br>key is freed using that function.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return %TRUE if the key did not exist yet
    */
    public static boolean hashTableInsert(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return JnaGlib.INST().g_hash_table_insert(asCPointerNotNull(hash_table), asCPointer(key), asCPointer(value));
    }

    /**
     * Looks up a key in a &#35;GHashTable. Note that this function cannot
     * <br>distinguish between a key that is not present and one which is present
     * <br>and has the value %NULL. If you need this distinction, use
     * <br>g_hash_table_lookup_extended().
     * @param hash_table a &#35;GHashTable
     * @param key the key to look up
     * @return the associated value, or %NULL if the key is not found
    */
    public static ch.bailu.gtk.type.Pointer hashTableLookup(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_hash_table_lookup(asCPointerNotNull(hash_table), asCPointer(key))));
    }

    /**
     * Creates a new &#35;GHashTable like g_hash_table_new_full() with a reference
     * <br>count of 1.
     * <br>
     * <br>It inherits the hash function, the key equal function, the key destroy function,
     * <br>as well as the value destroy function, from &#64;other_hash_table.
     * <br>
     * <br>The returned hash table will be empty; it will not contain the keys
     * <br>or values from &#64;other_hash_table.
     * @param other_hash_table Another &#35;GHashTable
     * @return a new &#35;GHashTable
    */
    public static HashTable hashTableNewSimilar(@Nonnull HashTable other_hash_table)  {
        return new HashTable(new PointerContainer(JnaGlib.INST().g_hash_table_new_similar(asCPointerNotNull(other_hash_table))));
    }

    /**
     * Removes a key and its associated value from a &#35;GHashTable.
     * <br>
     * <br>If the &#35;GHashTable was created using g_hash_table_new_full(), the
     * <br>key and value are freed using the supplied destroy functions, otherwise
     * <br>you have to make sure that any dynamically allocated values are freed
     * <br>yourself.
     * @param hash_table a &#35;GHashTable
     * @param key the key to remove
     * @return %TRUE if the key was found and removed from the &#35;GHashTable
    */
    public static boolean hashTableRemove(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaGlib.INST().g_hash_table_remove(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Removes all keys and their associated values from a &#35;GHashTable.
     * <br>
     * <br>If the &#35;GHashTable was created using g_hash_table_new_full(),
     * <br>the keys and values are freed using the supplied destroy functions,
     * <br>otherwise you have to make sure that any dynamically allocated
     * <br>values are freed yourself.
     * @param hash_table a &#35;GHashTable
    */
    public static void hashTableRemoveAll(@Nonnull HashTable hash_table)  {
        JnaGlib.INST().g_hash_table_remove_all(asCPointerNotNull(hash_table));
    }

    /**
     * Inserts a new key and value into a &#35;GHashTable similar to
     * <br>g_hash_table_insert(). The difference is that if the key
     * <br>already exists in the &#35;GHashTable, it gets replaced by the
     * <br>new key. If you supplied a &#64;value_destroy_func when creating
     * <br>the &#35;GHashTable, the old value is freed using that function.
     * <br>If you supplied a &#64;key_destroy_func when creating the
     * <br>&#35;GHashTable, the old key is freed using that function.
     * <br>
     * <br>Starting from GLib 2.40, this function returns a boolean value to
     * <br>indicate whether the newly added value was already in the hash table
     * <br>or not.
     * @param hash_table a &#35;GHashTable
     * @param key a key to insert
     * @param value the value to associate with the key
     * @return %TRUE if the key did not exist yet
    */
    public static boolean hashTableReplace(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return JnaGlib.INST().g_hash_table_replace(asCPointerNotNull(hash_table), asCPointer(key), asCPointer(value));
    }

    /**
     * Returns the number of elements contained in the &#35;GHashTable.
     * @param hash_table a &#35;GHashTable
     * @return the number of key/value pairs in the &#35;GHashTable.
    */
    public static int hashTableSize(@Nonnull HashTable hash_table)  {
        return JnaGlib.INST().g_hash_table_size(asCPointerNotNull(hash_table));
    }

    /**
     * Removes a key and its associated value from a &#35;GHashTable without
     * <br>calling the key and value destroy functions.
     * @param hash_table a &#35;GHashTable
     * @param key the key to remove
     * @return %TRUE if the key was found and removed from the &#35;GHashTable
    */
    public static boolean hashTableSteal(@Nonnull HashTable hash_table, @Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaGlib.INST().g_hash_table_steal(asCPointerNotNull(hash_table), asCPointer(key));
    }

    /**
     * Removes all keys and their associated values from a &#35;GHashTable
     * <br>without calling the key and value destroy functions.
     * @param hash_table a &#35;GHashTable
    */
    public static void hashTableStealAll(@Nonnull HashTable hash_table)  {
        JnaGlib.INST().g_hash_table_steal_all(asCPointerNotNull(hash_table));
    }

    /**
     * Atomically decrements the reference count of &#64;hash_table by one.
     * <br>If the reference count drops to 0, all keys and values will be
     * <br>destroyed, and all memory allocated by the hash table is released.
     * <br>This function is MT-safe and may be called from any thread.
     * @param hash_table a valid &#35;GHashTable
    */
    public static void hashTableUnref(@Nonnull HashTable hash_table)  {
        JnaGlib.INST().g_hash_table_unref(asCPointerNotNull(hash_table));
    }

    /**
     * Destroys a &#35;GHook, given its ID.
     * @param hook_list a &#35;GHookList
     * @param hook_id a hook ID
     * @return %TRUE if the &#35;GHook was found in the &#35;GHookList and destroyed
    */
    public static boolean hookDestroy(@Nonnull HookList hook_list, long hook_id)  {
        return JnaGlib.INST().g_hook_destroy(asCPointerNotNull(hook_list), hook_id);
    }

    /**
     * Removes one &#35;GHook from a &#35;GHookList, marking it
     * <br>inactive and calling g_hook_unref() on it.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to remove
    */
    public static void hookDestroyLink(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaGlib.INST().g_hook_destroy_link(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Calls the &#35;GHookList &#64;finalize_hook function if it exists,
     * <br>and frees the memory allocated for the &#35;GHook.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to free
    */
    public static void hookFree(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaGlib.INST().g_hook_free(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Inserts a &#35;GHook into a &#35;GHookList, before a given &#35;GHook.
     * @param hook_list a &#35;GHookList
     * @param sibling the &#35;GHook to insert the new &#35;GHook before
     * @param hook the &#35;GHook to insert
    */
    public static void hookInsertBefore(@Nonnull HookList hook_list, @Nullable Hook sibling, @Nonnull Hook hook)  {
        JnaGlib.INST().g_hook_insert_before(asCPointerNotNull(hook_list), asCPointer(sibling), asCPointerNotNull(hook));
    }

    /**
     * Prepends a &#35;GHook on the start of a &#35;GHookList.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to add to the start of &#64;hook_list
    */
    public static void hookPrepend(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaGlib.INST().g_hook_prepend(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Decrements the reference count of a &#35;GHook.
     * <br>If the reference count falls to 0, the &#35;GHook is removed
     * <br>from the &#35;GHookList and g_hook_free() is called to free it.
     * @param hook_list a &#35;GHookList
     * @param hook the &#35;GHook to unref
    */
    public static void hookUnref(@Nonnull HookList hook_list, @Nonnull Hook hook)  {
        JnaGlib.INST().g_hook_unref(asCPointerNotNull(hook_list), asCPointerNotNull(hook));
    }

    /**
     * Tests if &#64;hostname contains segments with an ASCII-compatible
     * <br>encoding of an Internationalized Domain Name. If this returns
     * <br>%TRUE, you should decode the hostname with g_hostname_to_unicode()
     * <br>before displaying it to the user.
     * <br>
     * <br>Note that a hostname might contain a mix of encoded and unencoded
     * <br>segments, and so it is possible for g_hostname_is_non_ascii() and
     * <br>g_hostname_is_ascii_encoded() to both return %TRUE for a name.
     * @param hostname a hostname
     * @return %TRUE if &#64;hostname contains any ASCII-encoded segments.
    */
    public static boolean hostnameIsAsciiEncoded(@Nonnull ch.bailu.gtk.type.Str hostname)  {
        return JnaGlib.INST().g_hostname_is_ascii_encoded(asCPointerNotNull(hostname));
    }

    /**
     * Tests if &#64;hostname is the string form of an IPv4 or IPv6 address.
     * <br>(Eg, &quot;192.168.0.1&quot;.)
     * <br>
     * <br>Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
     * @param hostname a hostname (or IP address in string form)
     * @return %TRUE if &#64;hostname is an IP address
    */
    public static boolean hostnameIsIpAddress(@Nonnull ch.bailu.gtk.type.Str hostname)  {
        return JnaGlib.INST().g_hostname_is_ip_address(asCPointerNotNull(hostname));
    }

    /**
     * Tests if &#64;hostname contains Unicode characters. If this returns
     * <br>%TRUE, you need to encode the hostname with g_hostname_to_ascii()
     * <br>before using it in non-IDN-aware contexts.
     * <br>
     * <br>Note that a hostname might contain a mix of encoded and unencoded
     * <br>segments, and so it is possible for g_hostname_is_non_ascii() and
     * <br>g_hostname_is_ascii_encoded() to both return %TRUE for a name.
     * @param hostname a hostname
     * @return %TRUE if &#64;hostname contains any non-ASCII characters
    */
    public static boolean hostnameIsNonAscii(@Nonnull ch.bailu.gtk.type.Str hostname)  {
        return JnaGlib.INST().g_hostname_is_non_ascii(asCPointerNotNull(hostname));
    }

    /**
     * Converts &#64;hostname to its canonical ASCII form; an ASCII-only
     * <br>string containing no uppercase letters and not ending with a
     * <br>trailing dot.
     * @param hostname a valid UTF-8 or ASCII hostname
     * @return an ASCII hostname, which must be freed,    or %NULL if &#64;hostname is in some way invalid.
    */
    public static ch.bailu.gtk.type.Str hostnameToAscii(@Nonnull ch.bailu.gtk.type.Str hostname)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_hostname_to_ascii(asCPointerNotNull(hostname))));
    }

    /**
     * Converts &#64;hostname to its canonical presentation form; a UTF-8
     * <br>string in Unicode normalization form C, containing no uppercase
     * <br>letters, no forbidden characters, and no ASCII-encoded segments,
     * <br>and not ending with a trailing dot.
     * <br>
     * <br>Of course if &#64;hostname is not an internationalized hostname, then
     * <br>the canonical presentation form will be entirely ASCII.
     * @param hostname a valid UTF-8 or ASCII hostname
     * @return a UTF-8 hostname, which must be freed,    or %NULL if &#64;hostname is in some way invalid.
    */
    public static ch.bailu.gtk.type.Str hostnameToUnicode(@Nonnull ch.bailu.gtk.type.Str hostname)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_hostname_to_unicode(asCPointerNotNull(hostname))));
    }

    /**
     * Adds a function to be called whenever there are no higher priority
     * <br>events pending to the default main loop. The function is given the
     * <br>default idle priority, %G_PRIORITY_DEFAULT_IDLE.  If the function
     * <br>returns %FALSE it is automatically removed from the list of event
     * <br>sources and will not be called again.
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>This internally creates a main loop source using g_idle_source_new()
     * <br>and attaches it to the global &#35;GMainContext using g_source_attach(), so
     * <br>the callback will be invoked in whichever thread is running that main
     * <br>context. You can do these steps manually if you need greater control or to
     * <br>use a custom main context.
     * @param function function to call
     * @param data data to pass to &#64;function.
     * @return the ID (greater than 0) of the event source.
    */
    public static int idleAdd(OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_idle_add(toOnSourceFunc(getClassHandler().getInstance(), "idleAdd", function), asCPointer(data));
    }

    /**
     * Adds a function to be called whenever there are no higher priority
     * <br>events pending.
     * <br>
     * <br>If the function returns %G_SOURCE_REMOVE or %FALSE it is automatically
     * <br>removed from the list of event sources and will not be called again.
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>This internally creates a main loop source using g_idle_source_new()
     * <br>and attaches it to the global &#35;GMainContext using g_source_attach(), so
     * <br>the callback will be invoked in whichever thread is running that main
     * <br>context. You can do these steps manually if you need greater control or to
     * <br>use a custom main context.
     * @param priority the priority of the idle source. Typically this will be in the   range between %G_PRIORITY_DEFAULT_IDLE and %G_PRIORITY_HIGH_IDLE.
     * @param function function to call
     * @param data data to pass to &#64;function
     * @param notify function to call when the idle is removed, or %NULL
     * @return the ID (greater than 0) of the event source.
    */
    public static int idleAddFull(int priority, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_idle_add_full(priority, toOnSourceFunc(getClassHandler().getInstance(), "idleAddFull", function), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "idleAddFull", notify));
    }

    /**
     * Adds a function to be called whenever there are no higher priority
     * <br>events pending to the default main loop. The function is given the
     * <br>default idle priority, %G_PRIORITY_DEFAULT_IDLE.
     * <br>
     * <br>The function will only be called once and then the source will be
     * <br>automatically removed from the main context.
     * <br>
     * <br>This function otherwise behaves like g_idle_add().
     * @param function function to call
     * @param data data to pass to &#64;function
     * @return the ID (greater than 0) of the event source
    */
    public static int idleAddOnce(OnSourceOnceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_idle_add_once(toOnSourceOnceFunc(getClassHandler().getInstance(), "idleAddOnce", function), asCPointer(data));
    }

    /**
     * Removes the idle function with the given data.
     * @param data the data for the idle source's callback.
     * @return %TRUE if an idle source was found and removed.
    */
    public static boolean idleRemoveByData(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_idle_remove_by_data(asCPointer(data));
    }

    /**
     * Creates a new idle source.
     * <br>
     * <br>The source will not initially be associated with any &#35;GMainContext
     * <br>and must be added to one with g_source_attach() before it will be
     * <br>executed. Note that the default priority for idle sources is
     * <br>%G_PRIORITY_DEFAULT_IDLE, as compared to other sources which
     * <br>have a default priority of %G_PRIORITY_DEFAULT.
     * @return the newly-created idle source
    */
    public static Source idleSourceNew()  {
        return new Source(new PointerContainer(JnaGlib.INST().g_idle_source_new()));
    }

    /**
     * Compares the two &#35;gint64 values being pointed to and returns
     * <br>%TRUE if they are equal.
     * <br>It can be passed to g_hash_table_new() as the &#64;key_equal_func
     * <br>parameter, when using non-%NULL pointers to 64-bit integers as keys in a
     * <br>&#35;GHashTable.
     * @param v1 a pointer to a &#35;gint64 key
     * @param v2 a pointer to a &#35;gint64 key to compare with &#64;v1
     * @return %TRUE if the two keys match.
    */
    public static boolean int64Equal(@Nonnull ch.bailu.gtk.type.Pointer v1, @Nonnull ch.bailu.gtk.type.Pointer v2)  {
        return JnaGlib.INST().g_int64_equal(asCPointerNotNull(v1), asCPointerNotNull(v2));
    }

    /**
     * Converts a pointer to a &#35;gint64 to a hash value.
     * <br>
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>when using non-%NULL pointers to 64-bit integer values as keys in a
     * <br>&#35;GHashTable.
     * @param v a pointer to a &#35;gint64 key
     * @return a hash value corresponding to the key.
    */
    public static int int64Hash(@Nonnull ch.bailu.gtk.type.Pointer v)  {
        return JnaGlib.INST().g_int64_hash(asCPointerNotNull(v));
    }

    /**
     * Compares the two &#35;gint values being pointed to and returns
     * <br>%TRUE if they are equal.
     * <br>It can be passed to g_hash_table_new() as the &#64;key_equal_func
     * <br>parameter, when using non-%NULL pointers to integers as keys in a
     * <br>&#35;GHashTable.
     * <br>
     * <br>Note that this function acts on pointers to &#35;gint, not on &#35;gint
     * <br>directly: if your hash table's keys are of the form
     * <br>`GINT_TO_POINTER (n)`, use g_direct_equal() instead.
     * @param v1 a pointer to a &#35;gint key
     * @param v2 a pointer to a &#35;gint key to compare with &#64;v1
     * @return %TRUE if the two keys match.
    */
    public static boolean intEqual(@Nonnull ch.bailu.gtk.type.Pointer v1, @Nonnull ch.bailu.gtk.type.Pointer v2)  {
        return JnaGlib.INST().g_int_equal(asCPointerNotNull(v1), asCPointerNotNull(v2));
    }

    /**
     * Converts a pointer to a &#35;gint to a hash value.
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>when using non-%NULL pointers to integer values as keys in a &#35;GHashTable.
     * <br>
     * <br>Note that this function acts on pointers to &#35;gint, not on &#35;gint
     * <br>directly: if your hash table's keys are of the form
     * <br>`GINT_TO_POINTER (n)`, use g_direct_hash() instead.
     * @param v a pointer to a &#35;gint key
     * @return a hash value corresponding to the key.
    */
    public static int intHash(@Nonnull ch.bailu.gtk.type.Pointer v)  {
        return JnaGlib.INST().g_int_hash(asCPointerNotNull(v));
    }

    /**
     * Returns a canonical representation for &#64;string. Interned strings
     * <br>can be compared for equality by comparing the pointers, instead of
     * <br>using strcmp(). g_intern_static_string() does not copy the string,
     * <br>therefore &#64;string must not be freed or modified.
     * <br>
     * <br>This function must not be used before library constructors have finished
     * <br>running. In particular, this means it cannot be used to initialize global
     * <br>variables in C++.
     * @param string a static string
     * @return a canonical representation for the string
    */
    public static ch.bailu.gtk.type.Str internStaticString(@Nullable ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_intern_static_string(asCPointer(string))));
    }

    /**
     * Returns a canonical representation for &#64;string. Interned strings
     * <br>can be compared for equality by comparing the pointers, instead of
     * <br>using strcmp().
     * <br>
     * <br>This function must not be used before library constructors have finished
     * <br>running. In particular, this means it cannot be used to initialize global
     * <br>variables in C++.
     * @param string a string
     * @return a canonical representation for the string
    */
    public static ch.bailu.gtk.type.Str internString(@Nullable ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_intern_string(asCPointer(string))));
    }

    /**
     * Adds the &#35;GIOChannel into the default main loop context
     * <br>with the default priority.
     * @param channel a &#35;GIOChannel
     * @param condition the condition to watch for
     * @param func the function to call when the condition is satisfied
     * @param user_data user data to pass to &#64;func
     * @return the event source id
    */
    public static int ioAddWatch(@Nonnull IOChannel channel, int condition, OnIOFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_io_add_watch(asCPointerNotNull(channel), condition, toOnIOFunc(getClassHandler().getInstance(), "ioAddWatch", func), asCPointer(user_data));
    }

    /**
     * Adds the &#35;GIOChannel into the default main loop context
     * <br>with the given priority.
     * <br>
     * <br>This internally creates a main loop source using g_io_create_watch()
     * <br>and attaches it to the main loop context with g_source_attach().
     * <br>You can do these steps manually if you need greater control.
     * @param channel a &#35;GIOChannel
     * @param priority the priority of the &#35;GIOChannel source
     * @param condition the condition to watch for
     * @param func the function to call when the condition is satisfied
     * @param user_data user data to pass to &#64;func
     * @param notify the function to call when the source is removed
     * @return the event source id
    */
    public static int ioAddWatchFull(@Nonnull IOChannel channel, int priority, int condition, OnIOFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_io_add_watch_full(asCPointerNotNull(channel), priority, condition, toOnIOFunc(getClassHandler().getInstance(), "ioAddWatchFull", func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "ioAddWatchFull", notify));
    }

    /**
     * Converts an `errno` error number to a &#35;GIOChannelError.
     * @param en an `errno` error number, e.g. `EINVAL`
     * @return a &#35;GIOChannelError error number, e.g.      %G_IO_CHANNEL_ERROR_INVAL.
    */
    public static int ioChannelErrorFromErrno(int en)  {
        return JnaGlib.INST().g_io_channel_error_from_errno(en);
    }

    /**
     * 
     * @return 
    */
    public static int ioChannelErrorQuark()  {
        return JnaGlib.INST().g_io_channel_error_quark();
    }

    /**
     * Creates a &#35;GSource that's dispatched when &#64;condition is met for the
     * <br>given &#64;channel. For example, if condition is %G_IO_IN, the source will
     * <br>be dispatched when there's data available for reading.
     * <br>
     * <br>The callback function invoked by the &#35;GSource should be added with
     * <br>g_source_set_callback(), but it has type &#35;GIOFunc (not &#35;GSourceFunc).
     * <br>
     * <br>g_io_add_watch() is a simpler interface to this same functionality, for
     * <br>the case where you want to add the source to the default main loop context
     * <br>at the default priority.
     * <br>
     * <br>On Windows, polling a &#35;GSource created to watch a channel for a socket
     * <br>puts the socket in non-blocking mode. This is a side-effect of the
     * <br>implementation and unavoidable.
     * @param channel a &#35;GIOChannel to watch
     * @param condition conditions to watch for
     * @return a new &#35;GSource
    */
    public static Source ioCreateWatch(@Nonnull IOChannel channel, int condition)  {
        return new Source(new PointerContainer(JnaGlib.INST().g_io_create_watch(asCPointerNotNull(channel), condition)));
    }

    /**
     * 
     * @return 
    */
    public static int keyFileErrorQuark()  {
        return JnaGlib.INST().g_key_file_error_quark();
    }

    /**
     * Converts a string from UTF-8 to the encoding used for strings by
     * <br>the C runtime (usually the same as that used by the operating
     * <br>system) in the [current locale][setlocale]. On Windows this means
     * <br>the system codepage.
     * <br>
     * <br>The input string shall not contain nul characters even if the &#64;len
     * <br>argument is positive. A nul character found inside the string will result
     * <br>in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. Use g_convert() to convert
     * <br>input that may contain embedded nul characters.
     * @param utf8string a UTF-8 encoded string
     * @param len the length of the string, or -1 if the string is                 nul-terminated.
     * @param bytes_read location to store the number of bytes in the                 input string that were successfully converted, or %NULL.                 Even if the conversion was successful, this may be                 less than &#64;len if there were partial characters                 at the end of the input. If the error                 %G_CONVERT_ERROR_ILLEGAL_SEQUENCE occurs, the value                 stored will be the byte offset after the last valid                 input sequence.
     * @param bytes_written the number of bytes stored in the output                 buffer (not including the terminating nul).
     * @return           A newly-allocated buffer containing the converted string,          or %NULL on an error, and error will be set.
    */
    public static ch.bailu.gtk.type.Str localeFromUtf8(@Nonnull ch.bailu.gtk.type.Str utf8string, long len, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_locale_from_utf8(asCPointerNotNull(utf8string), len, asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * Converts a string which is in the encoding used for strings by
     * <br>the C runtime (usually the same as that used by the operating
     * <br>system) in the [current locale][setlocale] into a UTF-8 string.
     * <br>
     * <br>If the source encoding is not UTF-8 and the conversion output contains a
     * <br>nul character, the error %G_CONVERT_ERROR_EMBEDDED_NUL is set and the
     * <br>function returns %NULL.
     * <br>If the source encoding is UTF-8, an embedded nul character is treated with
     * <br>the %G_CONVERT_ERROR_ILLEGAL_SEQUENCE error for backward compatibility with
     * <br>earlier versions of this library. Use g_convert() to produce output that
     * <br>may contain embedded nul characters.
     * @param opsysstring a string in the                 encoding of the current locale. On Windows                 this means the system codepage.
     * @param len the length of the string, or -1 if the string is                 nul-terminated (Note that some encodings may allow nul                 bytes to occur inside strings. In that case, using -1                 for the &#64;len parameter is unsafe)
     * @param bytes_read location to store the number of bytes in the                 input string that were successfully converted, or %NULL.                 Even if the conversion was successful, this may be                 less than &#64;len if there were partial characters                 at the end of the input. If the error                 %G_CONVERT_ERROR_ILLEGAL_SEQUENCE occurs, the value                 stored will be the byte offset after the last valid                 input sequence.
     * @param bytes_written the number of bytes stored in the output                 buffer (not including the terminating nul).
     * @return The converted string, or %NULL on an error.
    */
    public static ch.bailu.gtk.type.Str localeToUtf8(@Nonnull ch.bailu.gtk.type.Str opsysstring, long len, @Nullable ch.bailu.gtk.type.Int64 bytes_read, @Nullable ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_locale_to_utf8(asCPointerNotNull(opsysstring), len, asCPointer(bytes_read), asCPointer(bytes_written), 0L)));
    }

    /**
     * Logs an error or debugging message.
     * <br>
     * <br>If the log level has been set as fatal, G_BREAKPOINT() is called
     * <br>to terminate the program. See the documentation for G_BREAKPOINT() for
     * <br>details of the debugging options this provides.
     * <br>
     * <br>If g_log_default_handler() is used as the log handler function, a new-line
     * <br>character will automatically be appended to &#64;..., and need not be entered
     * <br>manually.
     * <br>
     * <br>If [structured logging is enabled][using-structured-logging] this will
     * <br>output via the structured log writer function (see g_log_set_writer_func()).
     * @param log_domain the log domain, usually %G_LOG_DOMAIN, or %NULL   for the default
     * @param log_level the log level, either from &#35;GLogLevelFlags   or a user-defined level
     * @param format the message format. See the `printf()` documentation
     * @param _elipse the parameters to insert into the format string
    */
    public static void log(@Nullable ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_log(asCPointer(log_domain), log_level, asCPointerNotNull(format), _elipse);
    }

    /**
     * The default log handler set up by GLib; g_log_set_default_handler()
     * <br>allows to install an alternate default log handler.
     * <br>This is used if no log handler has been set for the particular log
     * <br>domain and log level combination. It outputs the message to stderr
     * <br>or stdout and if the log level is fatal it calls G_BREAKPOINT(). It automatically
     * <br>prints a new-line character after the message, so one does not need to be
     * <br>manually included in &#64;message.
     * <br>
     * <br>The behavior of this log handler can be influenced by a number of
     * <br>environment variables:
     * <br>
     * <br>- `G_MESSAGES_PREFIXED`: A :-separated list of log levels for which
     * <br>  messages should be prefixed by the program name and PID of the
     * <br>  application.
     * <br>
     * <br>- `G_MESSAGES_DEBUG`: A space-separated list of log domains for
     * <br>  which debug and informational messages are printed. By default
     * <br>  these messages are not printed.
     * <br>
     * <br>stderr is used for levels %G_LOG_LEVEL_ERROR, %G_LOG_LEVEL_CRITICAL,
     * <br>%G_LOG_LEVEL_WARNING and %G_LOG_LEVEL_MESSAGE. stdout is used for
     * <br>the rest, unless stderr was requested by
     * <br>g_log_writer_default_set_use_stderr().
     * <br>
     * <br>This has no effect if structured logging is enabled; see
     * <br>[Using Structured Logging][using-structured-logging].
     * @param log_domain the log domain of the message, or %NULL for the default &quot;&quot; application domain
     * @param log_level the level of the message
     * @param message the message
     * @param unused_data data passed from g_log() which is unused
    */
    public static void logDefaultHandler(@Nullable ch.bailu.gtk.type.Str log_domain, int log_level, @Nullable ch.bailu.gtk.type.Str message, @Nullable ch.bailu.gtk.type.Pointer unused_data)  {
        JnaGlib.INST().g_log_default_handler(asCPointer(log_domain), log_level, asCPointer(message), asCPointer(unused_data));
    }

    /**
     * Return whether debug output from the GLib logging system is enabled.
     * <br>
     * <br>Note that this should not be used to conditionalise calls to g_debug() or
     * <br>other logging functions; it should only be used from %GLogWriterFunc
     * <br>implementations.
     * <br>
     * <br>Note also that the value of this does not depend on `G_MESSAGES_DEBUG`; see
     * <br>the docs for g_log_set_debug_enabled().
     * @return %TRUE if debug output is enabled, %FALSE otherwise
    */
    public static boolean logGetDebugEnabled()  {
        return JnaGlib.INST().g_log_get_debug_enabled();
    }

    /**
     * Removes the log handler.
     * <br>
     * <br>This has no effect if structured logging is enabled; see
     * <br>[Using Structured Logging][using-structured-logging].
     * @param log_domain the log domain
     * @param handler_id the id of the handler, which was returned     in g_log_set_handler()
    */
    public static void logRemoveHandler(@Nonnull ch.bailu.gtk.type.Str log_domain, int handler_id)  {
        JnaGlib.INST().g_log_remove_handler(asCPointerNotNull(log_domain), handler_id);
    }

    /**
     * Sets the message levels which are always fatal, in any log domain.
     * <br>When a message with any of these levels is logged the program terminates.
     * <br>You can only set the levels defined by GLib to be fatal.
     * <br>%G_LOG_LEVEL_ERROR is always fatal.
     * <br>
     * <br>You can also make some message levels fatal at runtime by setting
     * <br>the `G_DEBUG` environment variable (see
     * <br>[Running GLib Applications](glib-running.html)).
     * <br>
     * <br>Libraries should not call this function, as it affects all messages logged
     * <br>by a process, including those from other libraries.
     * <br>
     * <br>Structured log messages (using g_log_structured() and
     * <br>g_log_structured_array()) are fatal only if the default log writer is used;
     * <br>otherwise it is up to the writer function to determine which log messages
     * <br>are fatal. See [Using Structured Logging][using-structured-logging].
     * @param fatal_mask the mask containing bits set for each level     of error which is to be fatal
     * @return the old fatal mask
    */
    public static int logSetAlwaysFatal(int fatal_mask)  {
        return JnaGlib.INST().g_log_set_always_fatal(fatal_mask);
    }

    /**
     * Enable or disable debug output from the GLib logging system for all domains.
     * <br>This value interacts disjunctively with `G_MESSAGES_DEBUG` — if either of
     * <br>them would allow a debug message to be outputted, it will be.
     * <br>
     * <br>Note that this should not be used from within library code to enable debug
     * <br>output — it is intended for external use.
     * @param enabled %TRUE to enable debug output, %FALSE otherwise
    */
    public static void logSetDebugEnabled(boolean enabled)  {
        JnaGlib.INST().g_log_set_debug_enabled(enabled);
    }

    /**
     * Sets the log levels which are fatal in the given domain.
     * <br>%G_LOG_LEVEL_ERROR is always fatal.
     * <br>
     * <br>This has no effect on structured log messages (using g_log_structured() or
     * <br>g_log_structured_array()). To change the fatal behaviour for specific log
     * <br>messages, programs must install a custom log writer function using
     * <br>g_log_set_writer_func(). See
     * <br>[Using Structured Logging][using-structured-logging].
     * <br>
     * <br>This function is mostly intended to be used with
     * <br>%G_LOG_LEVEL_CRITICAL.  You should typically not set
     * <br>%G_LOG_LEVEL_WARNING, %G_LOG_LEVEL_MESSAGE, %G_LOG_LEVEL_INFO or
     * <br>%G_LOG_LEVEL_DEBUG as fatal except inside of test programs.
     * @param log_domain the log domain
     * @param fatal_mask the new fatal mask
     * @return the old fatal mask for the log domain
    */
    public static int logSetFatalMask(@Nonnull ch.bailu.gtk.type.Str log_domain, int fatal_mask)  {
        return JnaGlib.INST().g_log_set_fatal_mask(asCPointerNotNull(log_domain), fatal_mask);
    }

    /**
     * Sets the log handler for a domain and a set of log levels.
     * <br>
     * <br>To handle fatal and recursive messages the &#64;log_levels parameter
     * <br>must be combined with the %G_LOG_FLAG_FATAL and %G_LOG_FLAG_RECURSION
     * <br>bit flags.
     * <br>
     * <br>Note that since the %G_LOG_LEVEL_ERROR log level is always fatal, if
     * <br>you want to set a handler for this log level you must combine it with
     * <br>%G_LOG_FLAG_FATAL.
     * <br>
     * <br>This has no effect if structured logging is enabled; see
     * <br>[Using Structured Logging][using-structured-logging].
     * <br>
     * <br>Here is an example for adding a log handler for all warning messages
     * <br>in the default domain:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_log_set_handler (NULL, G_LOG_LEVEL_WARNING | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * </pre>
     * <br>
     * <br>This example adds a log handler for all critical messages from GTK+:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_log_set_handler (&quot;Gtk&quot;, G_LOG_LEVEL_CRITICAL | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * </pre>
     * <br>
     * <br>This example adds a log handler for all messages from GLib:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_log_set_handler (&quot;GLib&quot;, G_LOG_LEVEL_MASK | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * </pre>
     * @param log_domain the log domain, or %NULL for the default &quot;&quot;    application domain
     * @param log_levels the log levels to apply the log handler for.    To handle fatal and recursive messages as well, combine    the log levels with the %G_LOG_FLAG_FATAL and    %G_LOG_FLAG_RECURSION bit flags.
     * @param log_func the log handler function
     * @param user_data data passed to the log handler
     * @return the id of the new handler
    */
    public static int logSetHandler(@Nullable ch.bailu.gtk.type.Str log_domain, int log_levels, OnLogFunc log_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_log_set_handler(asCPointer(log_domain), log_levels, toOnLogFunc(getClassHandler().getInstance(), "logSetHandler", log_func), asCPointer(user_data));
    }

    /**
     * Like g_log_set_handler(), but takes a destroy notify for the &#64;user_data.
     * <br>
     * <br>This has no effect if structured logging is enabled; see
     * <br>[Using Structured Logging][using-structured-logging].
     * @param log_domain the log domain, or %NULL for the default &quot;&quot;   application domain
     * @param log_levels the log levels to apply the log handler for.   To handle fatal and recursive messages as well, combine   the log levels with the %G_LOG_FLAG_FATAL and   %G_LOG_FLAG_RECURSION bit flags.
     * @param log_func the log handler function
     * @param user_data data passed to the log handler
     * @param destroy destroy notify for &#64;user_data, or %NULL
     * @return the id of the new handler
    */
    public static int logSetHandlerFull(@Nullable ch.bailu.gtk.type.Str log_domain, int log_levels, OnLogFunc log_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        return JnaGlib.INST().g_log_set_handler_full(asCPointer(log_domain), log_levels, toOnLogFunc(getClassHandler().getInstance(), "logSetHandlerFull", log_func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "logSetHandlerFull", destroy));
    }

    /**
     * Log a message with structured data.
     * <br>
     * <br>The message will be passed through to the log writer set by the application
     * <br>using g_log_set_writer_func(). If the message is fatal (i.e. its log level
     * <br>is %G_LOG_LEVEL_ERROR), the program will be aborted by calling
     * <br>G_BREAKPOINT() at the end of this function. If the log writer returns
     * <br>%G_LOG_WRITER_UNHANDLED (failure), no other fallback writers will be tried.
     * <br>See the documentation for &#35;GLogWriterFunc for information on chaining
     * <br>writers.
     * <br>
     * <br>The structured data is provided as key–value pairs, where keys are UTF-8
     * <br>strings, and values are arbitrary pointers — typically pointing to UTF-8
     * <br>strings, but that is not a requirement. To pass binary (non-nul-terminated)
     * <br>structured data, use g_log_structured_array(). The keys for structured data
     * <br>should follow the [systemd journal
     * <br>fields](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html)
     * <br>specification. It is suggested that custom keys are namespaced according to
     * <br>the code which sets them. For example, custom keys from GLib all have a
     * <br>`GLIB_` prefix.
     * <br>
     * <br>The &#64;log_domain will be converted into a `GLIB_DOMAIN` field. &#64;log_level will
     * <br>be converted into a
     * <br>[`PRIORITY`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;PRIORITY=)
     * <br>field. The format string will have its placeholders substituted for the provided
     * <br>values and be converted into a
     * <br>[`MESSAGE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;MESSAGE=)
     * <br>field.
     * <br>
     * <br>Other fields you may commonly want to pass into this function:
     * <br>
     * <br> * [`MESSAGE_ID`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;MESSAGE_ID=)
     * <br> * [`CODE_FILE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;CODE_FILE=)
     * <br> * [`CODE_LINE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;CODE_LINE=)
     * <br> * [`CODE_FUNC`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;CODE_FUNC=)
     * <br> * [`ERRNO`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;ERRNO=)
     * <br>
     * <br>Note that `CODE_FILE`, `CODE_LINE` and `CODE_FUNC` are automatically set by
     * <br>the logging macros, G_DEBUG_HERE(), g_message(), g_warning(), g_critical(),
     * <br>g_error(), etc, if the symbols `G_LOG_USE_STRUCTURED` is defined before including
     * <br>`glib.h`.
     * <br>
     * <br>For example:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * g_log_structured (G_LOG_DOMAIN, G_LOG_LEVEL_DEBUG,
     *                   &quot;MESSAGE_ID&quot;, &quot;06d4df59e6c24647bfe69d2c27ef0b4e&quot;,
     *                   &quot;MY_APPLICATION_CUSTOM_FIELD&quot;, &quot;some debug string&quot;,
     *                   &quot;MESSAGE&quot;, &quot;This is a debug message about pointer %p and integer %u.&quot;,
     *                   some_pointer, some_integer);
     * </pre>
     * <br>
     * <br>Note that each `MESSAGE_ID` must be [uniquely and randomly
     * <br>generated](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html&#35;MESSAGE_ID=).
     * <br>If adding a `MESSAGE_ID`, consider shipping a [message
     * <br>catalog](https://www.freedesktop.org/wiki/Software/systemd/catalog/) with
     * <br>your software.
     * <br>
     * <br>To pass a user data pointer to the log writer function which is specific to
     * <br>this logging call, you must use g_log_structured_array() and pass the pointer
     * <br>as a field with &#35;GLogField.length set to zero, otherwise it will be
     * <br>interpreted as a string.
     * <br>
     * <br>For example:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * const GLogField fields[] = {
     *   { &quot;MESSAGE&quot;, &quot;This is a debug message.&quot;, -1 },
     *   { &quot;MESSAGE_ID&quot;, &quot;fcfb2e1e65c3494386b74878f1abf893&quot;, -1 },
     *   { &quot;MY_APPLICATION_CUSTOM_FIELD&quot;, &quot;some debug string&quot;, -1 },
     *   { &quot;MY_APPLICATION_STATE&quot;, state_object, 0 },
     * };
     * g_log_structured_array (G_LOG_LEVEL_DEBUG, fields, G_N_ELEMENTS (fields));
     * </pre>
     * <br>
     * <br>Note also that, even if no other structured fields are specified, there
     * <br>must always be a `MESSAGE` key before the format string. The `MESSAGE`-format
     * <br>pair has to be the last of the key-value pairs, and `MESSAGE` is the only
     * <br>field for which printf()-style formatting is supported.
     * <br>
     * <br>The default writer function for `stdout` and `stderr` will automatically
     * <br>append a new-line character after the message, so you should not add one
     * <br>manually to the format string.
     * @param log_domain log domain, usually %G_LOG_DOMAIN
     * @param log_level log level, either from &#35;GLogLevelFlags, or a user-defined    level
     * @param _elipse key-value pairs of structured data to add to the log entry, followed    by the key &quot;MESSAGE&quot;, followed by a printf()-style message format,    followed by parameters to insert in the format string
    */
    public static void logStructured(@Nonnull ch.bailu.gtk.type.Str log_domain, int log_level, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_log_structured(asCPointerNotNull(log_domain), log_level, _elipse);
    }

    /**
     * 
     * @param log_domain 
     * @param log_level 
     * @param file 
     * @param line 
     * @param func 
     * @param message_format 
     * @param _elipse 
    */
    public static void logStructuredStandard(@Nonnull ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull ch.bailu.gtk.type.Str file, @Nonnull ch.bailu.gtk.type.Str line, @Nonnull ch.bailu.gtk.type.Str func, @Nonnull ch.bailu.gtk.type.Str message_format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_log_structured_standard(asCPointerNotNull(log_domain), log_level, asCPointerNotNull(file), asCPointerNotNull(line), asCPointerNotNull(func), asCPointerNotNull(message_format), _elipse);
    }

    /**
     * Log a message with structured data, accepting the data within a &#35;GVariant. This
     * <br>version is especially useful for use in other languages, via introspection.
     * <br>
     * <br>The only mandatory item in the &#64;fields dictionary is the &quot;MESSAGE&quot; which must
     * <br>contain the text shown to the user.
     * <br>
     * <br>The values in the &#64;fields dictionary are likely to be of type String
     * <br>(%G_VARIANT_TYPE_STRING). Array of bytes (%G_VARIANT_TYPE_BYTESTRING) is also
     * <br>supported. In this case the message is handled as binary and will be forwarded
     * <br>to the log writer as such. The size of the array should not be higher than
     * <br>%G_MAXSSIZE. Otherwise it will be truncated to this size. For other types
     * <br>g_variant_print() will be used to convert the value into a string.
     * <br>
     * <br>For more details on its usage and about the parameters, see g_log_structured().
     * @param log_domain log domain, usually %G_LOG_DOMAIN
     * @param log_level log level, either from &#35;GLogLevelFlags, or a user-defined    level
     * @param fields a dictionary (&#35;GVariant of the type %G_VARIANT_TYPE_VARDICT) containing the key-value pairs of message data.
    */
    public static void logVariant(@Nullable ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull Variant fields)  {
        JnaGlib.INST().g_log_variant(asCPointer(log_domain), log_level, asCPointerNotNull(fields));
    }

    /**
     * Configure whether the built-in log functions
     * <br>(g_log_default_handler() for the old-style API, and both
     * <br>g_log_writer_default() and g_log_writer_standard_streams() for the
     * <br>structured API) will output all log messages to `stderr`.
     * <br>
     * <br>By default, log messages of levels %G_LOG_LEVEL_INFO and
     * <br>%G_LOG_LEVEL_DEBUG are sent to `stdout`, and other log messages are
     * <br>sent to `stderr`. This is problematic for applications that intend
     * <br>to reserve `stdout` for structured output such as JSON or XML.
     * <br>
     * <br>This function sets global state. It is not thread-aware, and should be
     * <br>called at the very start of a program, before creating any other threads
     * <br>or creating objects that could create worker threads of their own.
     * @param use_stderr If %TRUE, use `stderr` for log messages that would  normally have appeared on `stdout`
    */
    public static void logWriterDefaultSetUseStderr(boolean use_stderr)  {
        JnaGlib.INST().g_log_writer_default_set_use_stderr(use_stderr);
    }

    /**
     * Check whether g_log_writer_default() and g_log_default_handler() would
     * <br>ignore a message with the given domain and level.
     * <br>
     * <br>As with g_log_default_handler(), this function drops debug and informational
     * <br>messages unless their log domain (or `all`) is listed in the space-separated
     * <br>`G_MESSAGES_DEBUG` environment variable.
     * <br>
     * <br>This can be used when implementing log writers with the same filtering
     * <br>behaviour as the default, but a different destination or output format:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   if (g_log_writer_default_would_drop (log_level, log_domain))
     *     return G_LOG_WRITER_HANDLED;
     * </pre>
     * <br>
     * <br>or to skip an expensive computation if it is only needed for a debugging
     * <br>message, and `G_MESSAGES_DEBUG` is not set:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
     *     {
     *       gchar *result = expensive_computation (my_object);
     * 
     *       g_debug (&quot;my_object result: %s&quot;, result);
     *       g_free (result);
     *     }
     * </pre>
     * @param log_level log level, either from &#35;GLogLevelFlags, or a user-defined    level
     * @param log_domain log domain
     * @return %TRUE if the log message would be dropped by GLib's  default log handlers
    */
    public static boolean logWriterDefaultWouldDrop(int log_level, @Nullable ch.bailu.gtk.type.Str log_domain)  {
        return JnaGlib.INST().g_log_writer_default_would_drop(log_level, asCPointer(log_domain));
    }

    /**
     * Check whether the given &#64;output_fd file descriptor is a connection to the
     * <br>systemd journal, or something else (like a log file or `stdout` or
     * <br>`stderr`).
     * <br>
     * <br>Invalid file descriptors are accepted and return %FALSE, which allows for
     * <br>the following construct without needing any additional error handling:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   is_journald = g_log_writer_is_journald (fileno (stderr));
     * </pre>
     * @param output_fd output file descriptor to check
     * @return %TRUE if &#64;output_fd points to the journal, %FALSE otherwise
    */
    public static boolean logWriterIsJournald(int output_fd)  {
        return JnaGlib.INST().g_log_writer_is_journald(output_fd);
    }

    /**
     * Check whether the given &#64;output_fd file descriptor supports ANSI color
     * <br>escape sequences. If so, they can safely be used when formatting log
     * <br>messages.
     * @param output_fd output file descriptor to check
     * @return %TRUE if ANSI color escapes are supported, %FALSE otherwise
    */
    public static boolean logWriterSupportsColor(int output_fd)  {
        return JnaGlib.INST().g_log_writer_supports_color(output_fd);
    }

    /**
     * Returns the global default main context. This is the main context
     * <br>used for main loop functions when a main loop is not explicitly
     * <br>specified, and corresponds to the &quot;main&quot; main loop. See also
     * <br>g_main_context_get_thread_default().
     * @return the global default main context.
    */
    public static MainContext mainContextDefault()  {
        return new MainContext(new PointerContainer(JnaGlib.INST().g_main_context_default()));
    }

    /**
     * Gets the thread-default &#35;GMainContext for this thread. Asynchronous
     * <br>operations that want to be able to be run in contexts other than
     * <br>the default one should call this method or
     * <br>g_main_context_ref_thread_default() to get a &#35;GMainContext to add
     * <br>their &#35;GSources to. (Note that even in single-threaded
     * <br>programs applications may sometimes want to temporarily push a
     * <br>non-default context, so it is not safe to assume that this will
     * <br>always return %NULL if you are running in the default thread.)
     * <br>
     * <br>If you need to hold a reference on the context, use
     * <br>g_main_context_ref_thread_default() instead.
     * @return the thread-default &#35;GMainContext, or %NULL if the thread-default context is the global default context.
    */
    public static MainContext mainContextGetThreadDefault()  {
        return new MainContext(new PointerContainer(JnaGlib.INST().g_main_context_get_thread_default()));
    }

    /**
     * Gets the thread-default &#35;GMainContext for this thread, as with
     * <br>g_main_context_get_thread_default(), but also adds a reference to
     * <br>it with g_main_context_ref(). In addition, unlike
     * <br>g_main_context_get_thread_default(), if the thread-default context
     * <br>is the global default context, this will return that &#35;GMainContext
     * <br>(with a ref added to it) rather than returning %NULL.
     * @return the thread-default &#35;GMainContext. Unref     with g_main_context_unref() when you are done with it.
    */
    public static MainContext mainContextRefThreadDefault()  {
        return new MainContext(new PointerContainer(JnaGlib.INST().g_main_context_ref_thread_default()));
    }

    /**
     * Returns the currently firing source for this thread.
     * @return The currently firing source or %NULL.
    */
    public static Source mainCurrentSource()  {
        return new Source(new PointerContainer(JnaGlib.INST().g_main_current_source()));
    }

    /**
     * Returns the depth of the stack of calls to
     * <br>g_main_context_dispatch() on any &#35;GMainContext in the current thread.
     * <br> That is, when called from the toplevel, it gives 0. When
     * <br>called from within a callback from g_main_context_iteration()
     * <br>(or g_main_loop_run(), etc.) it returns 1. When called from within
     * <br>a callback to a recursive call to g_main_context_iteration(),
     * <br>it returns 2. And so forth.
     * <br>
     * <br>This function is useful in a situation like the following:
     * <br>Imagine an extremely simple &quot;garbage collected&quot; system.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static GList *free_list;
     * 
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   gpointer result = g_malloc (size);
     *   free_list = g_list_prepend (free_list, result);
     *   return result;
     * }
     * 
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *   for (l = free_list; l; l = l-&gt;next);
     *     g_free (l-&gt;data);
     *   g_list_free (free_list);
     *   free_list = NULL;
     *  }
     * 
     * [...]
     * 
     * while (TRUE);
     *  {
     *    g_main_context_iteration (NULL, TRUE);
     *    free_allocated_memory();
     *   }
     * </pre>
     * <br>
     * <br>This works from an application, however, if you want to do the same
     * <br>thing from a library, it gets more difficult, since you no longer
     * <br>control the main loop. You might think you can simply use an idle
     * <br>function to make the call to free_allocated_memory(), but that
     * <br>doesn't work, since the idle function could be called from a
     * <br>recursive callback. This can be fixed by using g_main_depth()
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   FreeListBlock *block = g_new (FreeListBlock, 1);
     *   block-&gt;mem = g_malloc (size);
     *   block-&gt;depth = g_main_depth ();
     *   free_list = g_list_prepend (free_list, block);
     *   return block-&gt;mem;
     * }
     * 
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *   
     *   int depth = g_main_depth ();
     *   for (l = free_list; l; );
     *     {
     *       GList *next = l-&gt;next;
     *       FreeListBlock *block = l-&gt;data;
     *       if (block-&gt;depth &gt; depth)
     *         {
     *           g_free (block-&gt;mem);
     *           g_free (block);
     *           free_list = g_list_delete_link (free_list, l);
     *         }
     *               
     *       l = next;
     *     }
     *   }
     * </pre>
     * <br>
     * <br>There is a temptation to use g_main_depth() to solve
     * <br>problems with reentrancy. For instance, while waiting for data
     * <br>to be received from the network in response to a menu item,
     * <br>the menu item might be selected again. It might seem that
     * <br>one could make the menu item's callback return immediately
     * <br>and do nothing if g_main_depth() returns a value greater than 1.
     * <br>However, this should be avoided since the user then sees selecting
     * <br>the menu item do nothing. Furthermore, you'll find yourself adding
     * <br>these checks all over your code, since there are doubtless many,
     * <br>many things that the user could do. Instead, you can use the
     * <br>following techniques:
     * <br>
     * <br>1. Use gtk_widget_set_sensitive() or modal dialogs to prevent
     * <br>   the user from interacting with elements while the main
     * <br>   loop is recursing.
     * <br>
     * <br>2. Avoid main loop recursion in situations where you can't handle
     * <br>   arbitrary  callbacks. Instead, structure your code so that you
     * <br>   simply return to the main loop and then get called again when
     * <br>   there is more work to do.
     * @return The main loop recursion level in the current thread
    */
    public static int mainDepth()  {
        return JnaGlib.INST().g_main_depth();
    }

    /**
     * Allocates &#64;n_bytes bytes of memory.
     * <br>If &#64;n_bytes is 0 it returns %NULL.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param n_bytes the number of bytes to allocate
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer malloc(long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_malloc(n_bytes)));
    }

    /**
     * Allocates &#64;n_bytes bytes of memory, initialized to 0's.
     * <br>If &#64;n_bytes is 0 it returns %NULL.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param n_bytes the number of bytes to allocate
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer malloc0(long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_malloc0(n_bytes)));
    }

    /**
     * This function is similar to g_malloc0(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer malloc0N(long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_malloc0_n(n_blocks, n_block_bytes)));
    }

    /**
     * This function is similar to g_malloc(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer mallocN(long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_malloc_n(n_blocks, n_block_bytes)));
    }

    /**
     * 
     * @return 
    */
    public static int markupErrorQuark()  {
        return JnaGlib.INST().g_markup_error_quark();
    }

    /**
     * Escapes text so that the markup parser will parse it verbatim.
     * <br>Less than, greater than, ampersand, etc. are replaced with the
     * <br>corresponding entities. This function would typically be used
     * <br>when writing out a file to be parsed with the markup parser.
     * <br>
     * <br>Note that this function doesn't protect whitespace and line endings
     * <br>from being processed according to the XML rules for normalization
     * <br>of line endings and attribute values.
     * <br>
     * <br>Note also that this function will produce character references in
     * <br>the range of &amp;&#35;x1; ... &amp;&#35;x1f; for all control sequences
     * <br>except for tabstop, newline and carriage return.  The character
     * <br>references in this range are not valid XML 1.0, but they are
     * <br>valid XML 1.1 and will be accepted by the GMarkup parser.
     * @param text some valid UTF-8 text
     * @param length length of &#64;text in bytes, or -1 if the text is nul-terminated
     * @return a newly allocated string with the escaped text
    */
    public static ch.bailu.gtk.type.Str markupEscapeText(@Nonnull ch.bailu.gtk.type.Str text, long length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_markup_escape_text(asCPointerNotNull(text), length)));
    }

    /**
     * Formats arguments according to &#64;format, escaping
     * <br>all string and character arguments in the fashion
     * <br>of g_markup_escape_text(). This is useful when you
     * <br>want to insert literal strings into XML-style markup
     * <br>output, without having to worry that the strings
     * <br>might themselves contain markup.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * const char *store = &quot;Fortnum &amp; Mason&quot;;
     * const char *item = &quot;Tea&quot;;
     * char *output;
     * 
     * output = g_markup_printf_escaped (&quot;&lt;purchase&gt;&quot;
     *                                   &quot;&lt;store&gt;%s&lt;/store&gt;&quot;
     *                                   &quot;&lt;item&gt;%s&lt;/item&gt;&quot;
     *                                   &quot;&lt;/purchase&gt;&quot;,
     *                                   store, item);
     * </pre>
     * @param format printf() style format string
     * @param _elipse the arguments to insert in the format string
     * @return newly allocated result from formatting    operation. Free with g_free().
    */
    public static ch.bailu.gtk.type.Str markupPrintfEscaped(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_markup_printf_escaped(asCPointerNotNull(format), _elipse)));
    }

    /**
     * Allocates &#64;byte_size bytes of memory, and copies &#64;byte_size bytes into it
     * <br>from &#64;mem. If &#64;mem is %NULL it returns %NULL.
     * <br>
     * <br>This replaces g_memdup(), which was prone to integer overflows when
     * <br>converting the argument from a &#35;gsize to a &#35;guint.
     * @param mem the memory to copy.
     * @param byte_size the number of bytes to copy.
     * @return a pointer to the newly-allocated copy of the memory,    or %NULL if &#64;mem is %NULL.
    */
    public static ch.bailu.gtk.type.Pointer memdup2(@Nullable ch.bailu.gtk.type.Pointer mem, long byte_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_memdup2(asCPointer(mem), byte_size)));
    }

    /**
     * Create a directory if it doesn't already exist. Create intermediate
     * <br>parent directories as needed, too.
     * @param pathname a pathname in the GLib file name encoding
     * @param mode permissions to use for newly created directories
     * @return 0 if the directory already exists, or was successfully created. Returns -1 if an error occurred, with errno set.
    */
    public static int mkdirWithParents(@Nonnull ch.bailu.gtk.type.Str pathname, int mode)  {
        return JnaGlib.INST().g_mkdir_with_parents(asCPointerNotNull(pathname), mode);
    }

    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * <br>on most UNIX-like systems.
     * <br>
     * <br>The parameter is a string that should follow the rules for
     * <br>mkdtemp() templates, i.e. contain the string &quot;XXXXXX&quot;.
     * <br>g_mkdtemp() is slightly more flexible than mkdtemp() in that the
     * <br>sequence does not have to occur at the very end of the template.
     * <br>The X string will be modified to form the name of a directory that
     * <br>didn't exist.
     * <br>The string should be in the GLib file name encoding. Most importantly,
     * <br>on Windows it should be in UTF-8.
     * <br>
     * <br>If you are going to be creating a temporary directory inside the
     * <br>directory returned by g_get_tmp_dir(), you might want to use
     * <br>g_dir_make_tmp() instead.
     * @param tmpl template directory name
     * @return A pointer to &#64;tmpl, which has been     modified to hold the directory name.  In case of errors, %NULL is     returned and %errno will be set.
    */
    public static ch.bailu.gtk.type.Str mkdtemp(@Nonnull ch.bailu.gtk.type.Str tmpl)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_mkdtemp(asCPointerNotNull(tmpl))));
    }

    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * <br>on most UNIX-like systems.
     * <br>
     * <br>The parameter is a string that should follow the rules for
     * <br>mkdtemp() templates, i.e. contain the string &quot;XXXXXX&quot;.
     * <br>g_mkdtemp_full() is slightly more flexible than mkdtemp() in that the
     * <br>sequence does not have to occur at the very end of the template
     * <br>and you can pass a &#64;mode. The X string will be modified to form
     * <br>the name of a directory that didn't exist. The string should be
     * <br>in the GLib file name encoding. Most importantly, on Windows it
     * <br>should be in UTF-8.
     * <br>
     * <br>If you are going to be creating a temporary directory inside the
     * <br>directory returned by g_get_tmp_dir(), you might want to use
     * <br>g_dir_make_tmp() instead.
     * @param tmpl template directory name
     * @param mode permissions to create the temporary directory with
     * @return A pointer to &#64;tmpl, which has been     modified to hold the directory name. In case of errors, %NULL is     returned, and %errno will be set.
    */
    public static ch.bailu.gtk.type.Str mkdtempFull(@Nonnull ch.bailu.gtk.type.Str tmpl, int mode)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_mkdtemp_full(asCPointerNotNull(tmpl), mode)));
    }

    /**
     * Opens a temporary file. See the mkstemp() documentation
     * <br>on most UNIX-like systems.
     * <br>
     * <br>The parameter is a string that should follow the rules for
     * <br>mkstemp() templates, i.e. contain the string &quot;XXXXXX&quot;.
     * <br>g_mkstemp() is slightly more flexible than mkstemp() in that the
     * <br>sequence does not have to occur at the very end of the template.
     * <br>The X string will be modified to form the name of a file that
     * <br>didn't exist. The string should be in the GLib file name encoding.
     * <br>Most importantly, on Windows it should be in UTF-8.
     * @param tmpl template filename
     * @return A file handle (as from open()) to the file     opened for reading and writing. The file is opened in binary     mode on platforms where there is a difference. The file handle     should be closed with close(). In case of errors, -1 is     returned and %errno will be set.
    */
    public static int mkstemp(@Nonnull ch.bailu.gtk.type.Str tmpl)  {
        return JnaGlib.INST().g_mkstemp(asCPointerNotNull(tmpl));
    }

    /**
     * Opens a temporary file. See the mkstemp() documentation
     * <br>on most UNIX-like systems.
     * <br>
     * <br>The parameter is a string that should follow the rules for
     * <br>mkstemp() templates, i.e. contain the string &quot;XXXXXX&quot;.
     * <br>g_mkstemp_full() is slightly more flexible than mkstemp()
     * <br>in that the sequence does not have to occur at the very end of the
     * <br>template and you can pass a &#64;mode and additional &#64;flags. The X
     * <br>string will be modified to form the name of a file that didn't exist.
     * <br>The string should be in the GLib file name encoding. Most importantly,
     * <br>on Windows it should be in UTF-8.
     * @param tmpl template filename
     * @param flags flags to pass to an open() call in addition to O_EXCL     and O_CREAT, which are passed automatically
     * @param mode permissions to create the temporary file with
     * @return A file handle (as from open()) to the file     opened for reading and writing. The file handle should be     closed with close(). In case of errors, -1 is returned     and %errno will be set.
    */
    public static int mkstempFull(@Nonnull ch.bailu.gtk.type.Str tmpl, int flags, int mode)  {
        return JnaGlib.INST().g_mkstemp_full(asCPointerNotNull(tmpl), flags, mode);
    }

    /**
     * 
     * @return 
    */
    public static int numberParserErrorQuark()  {
        return JnaGlib.INST().g_number_parser_error_quark();
    }

    /**
     * Prompts the user with
     * <br>`[E]xit, [H]alt, show [S]tack trace or [P]roceed`.
     * <br>This function is intended to be used for debugging use only.
     * <br>The following example shows how it can be used together with
     * <br>the g_log() functions.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * &#35;include &lt;glib.h&gt;
     * 
     * static void
     * log_handler (const gchar   *log_domain,
     *              GLogLevelFlags log_level,
     *              const gchar   *message,
     *              gpointer       user_data)
     * {
     *   g_log_default_handler (log_domain, log_level, message, user_data);
     * 
     *   g_on_error_query (MY_PROGRAM_NAME);
     * }
     * 
     * int
     * main (int argc, char *argv[])
     * {
     *   g_log_set_handler (MY_LOG_DOMAIN,
     *                      G_LOG_LEVEL_WARNING |
     *                      G_LOG_LEVEL_ERROR |
     *                      G_LOG_LEVEL_CRITICAL,
     *                      log_handler,
     *                      NULL);
     *   ...
     * </pre>
     * <br>
     * <br>If &quot;[E]xit&quot; is selected, the application terminates with a call
     * <br>to _exit(0).
     * <br>
     * <br>If &quot;[S]tack&quot; trace is selected, g_on_error_stack_trace() is called.
     * <br>This invokes gdb, which attaches to the current process and shows
     * <br>a stack trace. The prompt is then shown again.
     * <br>
     * <br>If &quot;[P]roceed&quot; is selected, the function returns.
     * <br>
     * <br>This function may cause different actions on non-UNIX platforms.
     * <br>
     * <br>On Windows consider using the `G_DEBUGGER` environment
     * <br>variable (see [Running GLib Applications](glib-running.html)) and
     * <br>calling g_on_error_stack_trace() instead.
     * @param prg_name the program name, needed by gdb for the &quot;[S]tack trace&quot;     option. If &#64;prg_name is %NULL, g_get_prgname() is called to get     the program name (which will work correctly if gdk_init() or     gtk_init() has been called)
    */
    public static void onErrorQuery(@Nonnull ch.bailu.gtk.type.Str prg_name)  {
        JnaGlib.INST().g_on_error_query(asCPointerNotNull(prg_name));
    }

    /**
     * Invokes gdb, which attaches to the current process and shows a
     * <br>stack trace. Called by g_on_error_query() when the &quot;[S]tack trace&quot;
     * <br>option is selected. You can get the current process's program name
     * <br>with g_get_prgname(), assuming that you have called gtk_init() or
     * <br>gdk_init().
     * <br>
     * <br>This function may cause different actions on non-UNIX platforms.
     * <br>
     * <br>When running on Windows, this function is *not* called by
     * <br>g_on_error_query(). If called directly, it will raise an
     * <br>exception, which will crash the program. If the `G_DEBUGGER` environment
     * <br>variable is set, a debugger will be invoked to attach and
     * <br>handle that exception (see [Running GLib Applications](glib-running.html)).
     * @param prg_name the program name, needed by gdb for the &quot;[S]tack trace&quot;     option
    */
    public static void onErrorStackTrace(@Nonnull ch.bailu.gtk.type.Str prg_name)  {
        JnaGlib.INST().g_on_error_stack_trace(asCPointerNotNull(prg_name));
    }

    /**
     * Function to be called when starting a critical initialization
     * <br>section. The argument &#64;location must point to a static
     * <br>0-initialized variable that will be set to a value other than 0 at
     * <br>the end of the initialization section. In combination with
     * <br>g_once_init_leave() and the unique address &#64;value_location, it can
     * <br>be ensured that an initialization section will be executed only once
     * <br>during a program's life time, and that concurrent threads are
     * <br>blocked until initialization completed. To be used in constructs
     * <br>like this:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&amp;initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&amp;initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * </pre>
     * <br>
     * <br>While &#64;location has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param location location of a static initializable variable    containing 0
     * @return %TRUE if the initialization section should be entered,     %FALSE and blocks otherwise
    */
    public static boolean onceInitEnter(@Nonnull ch.bailu.gtk.type.Pointer location)  {
        return JnaGlib.INST().g_once_init_enter(asCPointerNotNull(location));
    }

    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * <br>0-initialized initialization variable, and an initialization value
     * <br>other than 0. Sets the variable to the initialization value, and
     * <br>releases concurrent threads blocking in g_once_init_enter() on this
     * <br>initialization variable.
     * <br>
     * <br>While &#64;location has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param location location of a static initializable variable    containing 0
     * @param result new non-0 value for *&#64;value_location
    */
    public static void onceInitLeave(@Nonnull ch.bailu.gtk.type.Pointer location, long result)  {
        JnaGlib.INST().g_once_init_leave(asCPointerNotNull(location), result);
    }

    /**
     * 
     * @return 
    */
    public static int optionErrorQuark()  {
        return JnaGlib.INST().g_option_error_quark();
    }

    /**
     * Gets the last component of the filename.
     * <br>
     * <br>If &#64;file_name ends with a directory separator it gets the component
     * <br>before the last slash. If &#64;file_name consists only of directory
     * <br>separators (and on Windows, possibly a drive letter), a single
     * <br>separator is returned. If &#64;file_name is empty, it gets &quot;.&quot;.
     * @param file_name the name of the file
     * @return a newly allocated string    containing the last component of the filename
    */
    public static ch.bailu.gtk.type.Str pathGetBasename(@Nonnull ch.bailu.gtk.type.Str file_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_path_get_basename(asCPointerNotNull(file_name))));
    }

    /**
     * Gets the directory components of a file name. For example, the directory
     * <br>component of `/usr/bin/test` is `/usr/bin`. The directory component of `/`
     * <br>is `/`.
     * <br>
     * <br>If the file name has no directory components &quot;.&quot; is returned.
     * <br>The returned string should be freed when no longer needed.
     * @param file_name the name of the file
     * @return the directory components of the file
    */
    public static ch.bailu.gtk.type.Str pathGetDirname(@Nonnull ch.bailu.gtk.type.Str file_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_path_get_dirname(asCPointerNotNull(file_name))));
    }

    /**
     * Returns %TRUE if the given &#64;file_name is an absolute file name.
     * <br>Note that this is a somewhat vague concept on Windows.
     * <br>
     * <br>On POSIX systems, an absolute file name is well-defined. It always
     * <br>starts from the single root directory. For example &quot;/usr/local&quot;.
     * <br>
     * <br>On Windows, the concepts of current drive and drive-specific
     * <br>current directory introduce vagueness. This function interprets as
     * <br>an absolute file name one that either begins with a directory
     * <br>separator such as &quot;&#92;Users&#92;tml&quot; or begins with the root on a drive,
     * <br>for example &quot;C:&#92;Windows&quot;. The first case also includes UNC paths
     * <br>such as &quot;&#92;&#92;&#92;&#92;myserver&#92;docs&#92;foo&quot;. In all cases, either slashes or
     * <br>backslashes are accepted.
     * <br>
     * <br>Note that a file name relative to the current drive root does not
     * <br>truly specify a file uniquely over time and across processes, as
     * <br>the current drive is a per-process value and can be changed.
     * <br>
     * <br>File names relative the current directory on some specific drive,
     * <br>such as &quot;D:foo/bar&quot;, are not interpreted as absolute by this
     * <br>function, but they obviously are not relative to the normal current
     * <br>directory as returned by getcwd() or g_get_current_dir()
     * <br>either. Such paths should be avoided, or need to be handled using
     * <br>Windows-specific code.
     * @param file_name a file name
     * @return %TRUE if &#64;file_name is absolute
    */
    public static boolean pathIsAbsolute(@Nonnull ch.bailu.gtk.type.Str file_name)  {
        return JnaGlib.INST().g_path_is_absolute(asCPointerNotNull(file_name));
    }

    /**
     * Returns a pointer into &#64;file_name after the root component,
     * <br>i.e. after the &quot;/&quot; in UNIX or &quot;C:&#92;&quot; under Windows. If &#64;file_name
     * <br>is not an absolute path it returns %NULL.
     * @param file_name a file name
     * @return a pointer into &#64;file_name after the     root component
    */
    public static ch.bailu.gtk.type.Str pathSkipRoot(@Nonnull ch.bailu.gtk.type.Str file_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_path_skip_root(asCPointerNotNull(file_name))));
    }

    /**
     * Matches a string against a pattern given as a string. If this
     * <br>function is to be called in a loop, it's more efficient to compile
     * <br>the pattern once with g_pattern_spec_new() and call
     * <br>g_pattern_match_string() repeatedly.
     * @param pattern the UTF-8 encoded pattern
     * @param string the UTF-8 encoded string to match
     * @return %TRUE if &#64;string matches &#64;pspec
    */
    public static boolean patternMatchSimple(@Nonnull ch.bailu.gtk.type.Str pattern, @Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_pattern_match_simple(asCPointerNotNull(pattern), asCPointerNotNull(string));
    }

    /**
     * This is equivalent to g_bit_lock, but working on pointers (or other
     * <br>pointer-sized values).
     * <br>
     * <br>For portability reasons, you may only lock on the bottom 32 bits of
     * <br>the pointer.
     * <br>
     * <br>While &#64;address has a `volatile` qualifier, this is a historical
     * <br>artifact and the argument passed to it should not be `volatile`.
     * @param address a pointer to a &#35;gpointer-sized value
     * @param lock_bit a bit value between 0 and 31
    */
    public static void pointerBitLock(@Nonnull ch.bailu.gtk.type.Pointer address, int lock_bit)  {
        JnaGlib.INST().g_pointer_bit_lock(asCPointerNotNull(address), lock_bit);
    }

    /**
     * This is equivalent to g_bit_trylock(), but working on pointers (or
     * <br>other pointer-sized values).
     * <br>
     * <br>For portability reasons, you may only lock on the bottom 32 bits of
     * <br>the pointer.
     * <br>
     * <br>While &#64;address has a `volatile` qualifier, this is a historical
     * <br>artifact and the argument passed to it should not be `volatile`.
     * @param address a pointer to a &#35;gpointer-sized value
     * @param lock_bit a bit value between 0 and 31
     * @return %TRUE if the lock was acquired
    */
    public static boolean pointerBitTrylock(@Nonnull ch.bailu.gtk.type.Pointer address, int lock_bit)  {
        return JnaGlib.INST().g_pointer_bit_trylock(asCPointerNotNull(address), lock_bit);
    }

    /**
     * This is equivalent to g_bit_unlock, but working on pointers (or other
     * <br>pointer-sized values).
     * <br>
     * <br>For portability reasons, you may only lock on the bottom 32 bits of
     * <br>the pointer.
     * <br>
     * <br>While &#64;address has a `volatile` qualifier, this is a historical
     * <br>artifact and the argument passed to it should not be `volatile`.
     * @param address a pointer to a &#35;gpointer-sized value
     * @param lock_bit a bit value between 0 and 31
    */
    public static void pointerBitUnlock(@Nonnull ch.bailu.gtk.type.Pointer address, int lock_bit)  {
        JnaGlib.INST().g_pointer_bit_unlock(asCPointerNotNull(address), lock_bit);
    }

    /**
     * Polls &#64;fds, as with the poll() system call, but portably. (On
     * <br>systems that don't have poll(), it is emulated using select().)
     * <br>This is used internally by &#35;GMainContext, but it can be called
     * <br>directly if you need to block until a file descriptor is ready, but
     * <br>don't want to run the full main loop.
     * <br>
     * <br>Each element of &#64;fds is a &#35;GPollFD describing a single file
     * <br>descriptor to poll. The &#64;fd field indicates the file descriptor,
     * <br>and the &#64;events field indicates the events to poll for. On return,
     * <br>the &#64;revents fields will be filled with the events that actually
     * <br>occurred.
     * <br>
     * <br>On POSIX systems, the file descriptors in &#64;fds can be any sort of
     * <br>file descriptor, but the situation is much more complicated on
     * <br>Windows. If you need to use g_poll() in code that has to run on
     * <br>Windows, the easiest solution is to construct all of your
     * <br>&#35;GPollFDs with g_io_channel_win32_make_pollfd().
     * @param fds file descriptors to poll
     * @param nfds the number of file descriptors in &#64;fds
     * @param timeout amount of time to wait, in milliseconds, or -1 to wait forever
     * @return the number of entries in &#64;fds whose &#64;revents fields were filled in, or 0 if the operation timed out, or -1 on error or if the call was interrupted.
    */
    public static int poll(@Nonnull PollFD fds, int nfds, int timeout)  {
        return JnaGlib.INST().g_poll(asCPointerNotNull(fds), nfds, timeout);
    }

    /**
     * Outputs a formatted message via the print handler.
     * <br>The default print handler simply outputs the message to stdout, without
     * <br>appending a trailing new-line character. Typically, &#64;format should end with
     * <br>its own new-line character.
     * <br>
     * <br>g_print() should not be used from within libraries for debugging
     * <br>messages, since it may be redirected by applications to special
     * <br>purpose message windows or even files. Instead, libraries should
     * <br>use g_log(), g_log_structured(), or the convenience macros g_message(),
     * <br>g_warning() and g_error().
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public static void print(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_print(asCPointerNotNull(format), _elipse);
    }

    /**
     * Outputs a formatted message via the error message handler.
     * <br>The default handler simply outputs the message to stderr, without appending
     * <br>a trailing new-line character. Typically, &#64;format should end with its own
     * <br>new-line character.
     * <br>
     * <br>g_printerr() should not be used from within libraries.
     * <br>Instead g_log() or g_log_structured() should be used, or the convenience
     * <br>macros g_message(), g_warning() and g_error().
     * @param format the message format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public static void printerr(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_printerr(asCPointerNotNull(format), _elipse);
    }

    /**
     * An implementation of the standard printf() function which supports
     * <br>positional parameters, as specified in the Single Unix Specification.
     * <br>
     * <br>As with the standard printf(), this does not automatically append a trailing
     * <br>new-line character to the message, so typically &#64;format should end with its
     * <br>own new-line character.
     * <br>
     * <br>`glib/gprintf.h` must be explicitly included in order to use this function.
     * @param format a standard printf() format string, but notice          [string precision pitfalls][string-precision]
     * @param _elipse the arguments to insert in the output.
     * @return the number of bytes printed.
    */
    public static int printf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return JnaGlib.INST().g_printf(asCPointerNotNull(format), _elipse);
    }

    /**
     * This is just like the standard C qsort() function, but
     * <br>the comparison routine accepts a user data argument.
     * <br>
     * <br>This is guaranteed to be a stable sort since version 2.32.
     * @param pbase start of array to sort
     * @param total_elems elements in the array
     * @param size size of each element
     * @param compare_func function to compare elements
     * @param user_data data to pass to &#64;compare_func
    */
    public static void qsortWithData(@Nonnull ch.bailu.gtk.type.Pointer pbase, int total_elems, long size, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGlib.INST().g_qsort_with_data(asCPointerNotNull(pbase), total_elems, size, toOnCompareDataFunc(getClassHandler().getInstance(), "qsortWithData", compare_func), asCPointer(user_data));
    }

    /**
     * Gets the &#35;GQuark identifying the given (static) string. If the
     * <br>string does not currently have an associated &#35;GQuark, a new &#35;GQuark
     * <br>is created, linked to the given string.
     * <br>
     * <br>Note that this function is identical to g_quark_from_string() except
     * <br>that if a new &#35;GQuark is created the string itself is used rather
     * <br>than a copy. This saves memory, but can only be used if the string
     * <br>will continue to exist until the program terminates. It can be used
     * <br>with statically allocated strings in the main program, but not with
     * <br>statically allocated memory in dynamically loaded modules, if you
     * <br>expect to ever unload the module again (e.g. do not use this
     * <br>function in GTK+ theme engines).
     * <br>
     * <br>This function must not be used before library constructors have finished
     * <br>running. In particular, this means it cannot be used to initialize global
     * <br>variables in C++.
     * @param string a string
     * @return the &#35;GQuark identifying the string, or 0 if &#64;string is %NULL
    */
    public static int quarkFromStaticString(@Nullable ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_quark_from_static_string(asCPointer(string));
    }

    /**
     * Gets the &#35;GQuark identifying the given string. If the string does
     * <br>not currently have an associated &#35;GQuark, a new &#35;GQuark is created,
     * <br>using a copy of the string.
     * <br>
     * <br>This function must not be used before library constructors have finished
     * <br>running. In particular, this means it cannot be used to initialize global
     * <br>variables in C++.
     * @param string a string
     * @return the &#35;GQuark identifying the string, or 0 if &#64;string is %NULL
    */
    public static int quarkFromString(@Nullable ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_quark_from_string(asCPointer(string));
    }

    /**
     * Gets the string associated with the given &#35;GQuark.
     * @param quark a &#35;GQuark.
     * @return the string associated with the &#35;GQuark
    */
    public static ch.bailu.gtk.type.Str quarkToString(int quark)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_quark_to_string(quark)));
    }

    /**
     * Gets the &#35;GQuark associated with the given string, or 0 if string is
     * <br>%NULL or it has no associated &#35;GQuark.
     * <br>
     * <br>If you want the GQuark to be created if it doesn't already exist,
     * <br>use g_quark_from_string() or g_quark_from_static_string().
     * <br>
     * <br>This function must not be used before library constructors have finished
     * <br>running.
     * @param string a string
     * @return the &#35;GQuark associated with the string, or 0 if &#64;string is     %NULL or there is no &#35;GQuark associated with it
    */
    public static int quarkTryString(@Nullable ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_quark_try_string(asCPointer(string));
    }

    /**
     * Returns a random &#35;gdouble equally distributed over the range [0..1).
     * @return a random number
    */
    public static double randomDouble()  {
        return JnaGlib.INST().g_random_double();
    }

    /**
     * Returns a random &#35;gdouble equally distributed over the range
     * <br>[&#64;begin..&#64;end).
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
    */
    public static double randomDoubleRange(double begin, double end)  {
        return JnaGlib.INST().g_random_double_range(begin, end);
    }

    /**
     * Return a random &#35;guint32 equally distributed over the range
     * <br>[0..2^32-1].
     * @return a random number
    */
    public static int randomInt()  {
        return JnaGlib.INST().g_random_int();
    }

    /**
     * Returns a random &#35;gint32 equally distributed over the range
     * <br>[&#64;begin..&#64;end-1].
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
    */
    public static int randomIntRange(int begin, int end)  {
        return JnaGlib.INST().g_random_int_range(begin, end);
    }

    /**
     * Sets the seed for the global random number generator, which is used
     * <br>by the g_random_* functions, to &#64;seed.
     * @param seed a value to reinitialize the global random number generator
    */
    public static void randomSetSeed(int seed)  {
        JnaGlib.INST().g_random_set_seed(seed);
    }

    /**
     * Acquires a reference on the data pointed by &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @return a pointer to the data,   with its reference count increased
    */
    public static ch.bailu.gtk.type.Pointer rcBoxAcquire(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_rc_box_acquire(asCPointerNotNull(mem_block))));
    }

    /**
     * Allocates &#64;block_size bytes of memory, and adds reference
     * <br>counting semantics to it.
     * <br>
     * <br>The data will be freed when its reference count drops to
     * <br>zero.
     * <br>
     * <br>The allocated data is guaranteed to be suitably aligned for any
     * <br>built-in type.
     * @param block_size the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer rcBoxAlloc(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_rc_box_alloc(block_size)));
    }

    /**
     * Allocates &#64;block_size bytes of memory, and adds reference
     * <br>counting semantics to it.
     * <br>
     * <br>The contents of the returned data is set to zero.
     * <br>
     * <br>The data will be freed when its reference count drops to
     * <br>zero.
     * <br>
     * <br>The allocated data is guaranteed to be suitably aligned for any
     * <br>built-in type.
     * @param block_size the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer rcBoxAlloc0(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_rc_box_alloc0(block_size)));
    }

    /**
     * Allocates a new block of data with reference counting
     * <br>semantics, and copies &#64;block_size bytes of &#64;mem_block
     * <br>into it.
     * @param block_size the number of bytes to copy, must be greater than 0
     * @param mem_block the memory to copy
     * @return a pointer to the allocated   memory
    */
    public static ch.bailu.gtk.type.Pointer rcBoxDup(long block_size, @Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_rc_box_dup(block_size, asCPointerNotNull(mem_block))));
    }

    /**
     * Retrieves the size of the reference counted data pointed by &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @return the size of the data, in bytes
    */
    public static long rcBoxGetSize(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        return JnaGlib.INST().g_rc_box_get_size(asCPointerNotNull(mem_block));
    }

    /**
     * Releases a reference on the data pointed by &#64;mem_block.
     * <br>
     * <br>If the reference was the last one, it will free the
     * <br>resources allocated for &#64;mem_block.
     * @param mem_block a pointer to reference counted data
    */
    public static void rcBoxRelease(@Nonnull ch.bailu.gtk.type.Pointer mem_block)  {
        JnaGlib.INST().g_rc_box_release(asCPointerNotNull(mem_block));
    }

    /**
     * Releases a reference on the data pointed by &#64;mem_block.
     * <br>
     * <br>If the reference was the last one, it will call &#64;clear_func
     * <br>to clear the contents of &#64;mem_block, and then will free the
     * <br>resources allocated for &#64;mem_block.
     * @param mem_block a pointer to reference counted data
     * @param clear_func a function to call when clearing the data
    */
    public static void rcBoxReleaseFull(@Nonnull ch.bailu.gtk.type.Pointer mem_block, OnDestroyNotify clear_func)  {
        JnaGlib.INST().g_rc_box_release_full(asCPointerNotNull(mem_block), toOnDestroyNotify(getClassHandler().getInstance(), "rcBoxReleaseFull", clear_func));
    }

    /**
     * Reallocates the memory pointed to by &#64;mem, so that it now has space for
     * <br>&#64;n_bytes bytes of memory. It returns the new address of the memory, which may
     * <br>have been moved. &#64;mem may be %NULL, in which case it's considered to
     * <br>have zero-length. &#64;n_bytes may be 0, in which case %NULL will be returned
     * <br>and &#64;mem will be freed unless it is %NULL.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param mem the memory to reallocate
     * @param n_bytes new size of the memory in bytes
     * @return the new address of the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer realloc(@Nullable ch.bailu.gtk.type.Pointer mem, long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_realloc(asCPointer(mem), n_bytes)));
    }

    /**
     * This function is similar to g_realloc(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * <br>
     * <br>If the allocation fails (because the system is out of memory),
     * <br>the program is terminated.
     * @param mem the memory to reallocate
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return the new address of the allocated memory
    */
    public static ch.bailu.gtk.type.Pointer reallocN(@Nullable ch.bailu.gtk.type.Pointer mem, long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_realloc_n(asCPointer(mem), n_blocks, n_block_bytes)));
    }

    /**
     * Acquires a reference on a string.
     * @param str a reference counted string
     * @return the given string, with its reference count increased
    */
    public static ch.bailu.gtk.type.Str refStringAcquire(@Nonnull ch.bailu.gtk.type.Str str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ref_string_acquire(asCPointerNotNull(str))));
    }

    /**
     * Retrieves the length of &#64;str.
     * @param str a reference counted string
     * @return the length of the given string, in bytes
    */
    public static long refStringLength(@Nonnull ch.bailu.gtk.type.Str str)  {
        return JnaGlib.INST().g_ref_string_length(asCPointerNotNull(str));
    }

    /**
     * Creates a new reference counted string and copies the contents of &#64;str
     * <br>into it.
     * @param str a NUL-terminated string
     * @return the newly created reference counted string
    */
    public static ch.bailu.gtk.type.Str refStringNew(@Nonnull ch.bailu.gtk.type.Str str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ref_string_new(asCPointerNotNull(str))));
    }

    /**
     * Creates a new reference counted string and copies the content of &#64;str
     * <br>into it.
     * <br>
     * <br>If you call this function multiple times with the same &#64;str, or with
     * <br>the same contents of &#64;str, it will return a new reference, instead of
     * <br>creating a new string.
     * @param str a NUL-terminated string
     * @return the newly created reference   counted string, or a new reference to an existing string
    */
    public static ch.bailu.gtk.type.Str refStringNewIntern(@Nonnull ch.bailu.gtk.type.Str str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ref_string_new_intern(asCPointerNotNull(str))));
    }

    /**
     * Creates a new reference counted string and copies the contents of &#64;str
     * <br>into it, up to &#64;len bytes.
     * <br>
     * <br>Since this function does not stop at nul bytes, it is the caller's
     * <br>responsibility to ensure that &#64;str has at least &#64;len addressable bytes.
     * @param str a string
     * @param len length of &#64;str to use, or -1 if &#64;str is nul-terminated
     * @return the newly created reference counted string
    */
    public static ch.bailu.gtk.type.Str refStringNewLen(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_ref_string_new_len(asCPointerNotNull(str), len)));
    }

    /**
     * Releases a reference on a string; if it was the last reference, the
     * <br>resources allocated by the string are freed as well.
     * @param str a reference counted string
    */
    public static void refStringRelease(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaGlib.INST().g_ref_string_release(asCPointerNotNull(str));
    }

    /**
     * Checks whether &#64;replacement is a valid replacement string
     * <br>(see g_regex_replace()), i.e. that all escape sequences in
     * <br>it are valid.
     * <br>
     * <br>If &#64;has_references is not %NULL then &#64;replacement is checked
     * <br>for pattern references. For instance, replacement text 'foo&#92;n'
     * <br>does not contain references and may be evaluated without information
     * <br>about actual match, but '&#92;0&#92;1' (whole match followed by first
     * <br>subpattern) requires valid &#35;GMatchInfo object.
     * @param replacement the replacement string
     * @param has_references location to store information about   references in &#64;replacement or %NULL
     * @return whether &#64;replacement is a valid replacement string
    */
    public static boolean regexCheckReplacement(@Nonnull ch.bailu.gtk.type.Str replacement, @Nullable ch.bailu.gtk.type.Int has_references) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_regex_check_replacement(asCPointerNotNull(replacement), asCPointer(has_references), 0L);
    }

    /**
     * 
     * @return 
    */
    public static int regexErrorQuark()  {
        return JnaGlib.INST().g_regex_error_quark();
    }

    /**
     * Escapes the nul characters in &#64;string to &quot;&#92;x00&quot;.  It can be used
     * <br>to compile a regex with embedded nul characters.
     * <br>
     * <br>For completeness, &#64;length can be -1 for a nul-terminated string.
     * <br>In this case the output string will be of course equal to &#64;string.
     * @param string the string to escape
     * @param length the length of &#64;string
     * @return a newly-allocated escaped string
    */
    public static ch.bailu.gtk.type.Str regexEscapeNul(@Nonnull ch.bailu.gtk.type.Str string, int length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_regex_escape_nul(asCPointerNotNull(string), length)));
    }

    /**
     * Escapes the special characters used for regular expressions
     * <br>in &#64;string, for instance &quot;a.b*c&quot; becomes &quot;a&#92;.b&#92;*c&quot;. This
     * <br>function is useful to dynamically generate regular expressions.
     * <br>
     * <br>&#64;string can contain nul characters that are replaced with &quot;&#92;0&quot;,
     * <br>in this case remember to specify the correct length of &#64;string
     * <br>in &#64;length.
     * @param string the string to escape
     * @param length the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @return a newly-allocated escaped string
    */
    public static ch.bailu.gtk.type.Str regexEscapeString(@Nonnull ch.bailu.gtk.type.Str string, int length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_regex_escape_string(asCPointerNotNull(string), length)));
    }

    /**
     * Scans for a match in &#64;string for &#64;pattern.
     * <br>
     * <br>This function is equivalent to g_regex_match() but it does not
     * <br>require to compile the pattern with g_regex_new(), avoiding some
     * <br>lines of code when you need just to do a match without extracting
     * <br>substrings, capture counts, and so on.
     * <br>
     * <br>If this function is to be called on the same &#64;pattern more than
     * <br>once, it's more efficient to compile the pattern once with
     * <br>g_regex_new() and then use g_regex_match().
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compile_options compile options for the regular expression, or 0
     * @param match_options match options, or 0
     * @return %TRUE if the string matched, %FALSE otherwise
    */
    public static boolean regexMatchSimple(@Nonnull ch.bailu.gtk.type.Str pattern, @Nonnull ch.bailu.gtk.type.Str string, int compile_options, int match_options)  {
        return JnaGlib.INST().g_regex_match_simple(asCPointerNotNull(pattern), asCPointerNotNull(string), compile_options, match_options);
    }

    /**
     * Resets the cache used for g_get_user_special_dir(), so
     * <br>that the latest on-disk version is used. Call this only
     * <br>if you just changed the data on disk yourself.
     * <br>
     * <br>Due to thread safety issues this may cause leaking of strings
     * <br>that were previously returned from g_get_user_special_dir()
     * <br>that can't be freed. We ensure to only leak the data for
     * <br>the directories that actually changed value though.
    */
    public static void reloadUserSpecialDirsCache()  {
        JnaGlib.INST().g_reload_user_special_dirs_cache();
    }

    /**
     * Internal function used to print messages from the public g_return_if_fail()
     * <br>and g_return_val_if_fail() macros.
     * @param log_domain log domain
     * @param pretty_function function containing the assertion
     * @param expression expression which failed
    */
    public static void returnIfFailWarning(@Nullable ch.bailu.gtk.type.Str log_domain, @Nonnull ch.bailu.gtk.type.Str pretty_function, @Nullable ch.bailu.gtk.type.Str expression)  {
        JnaGlib.INST().g_return_if_fail_warning(asCPointer(log_domain), asCPointerNotNull(pretty_function), asCPointer(expression));
    }

    /**
     * A wrapper for the POSIX rmdir() function. The rmdir() function
     * <br>deletes a directory from the filesystem.
     * <br>
     * <br>See your C library manual for more details about how rmdir() works
     * <br>on your system.
     * @param filename a pathname in the GLib file name encoding     (UTF-8 on Windows)
     * @return 0 if the directory was successfully removed, -1 if an error    occurred
    */
    public static int rmdir(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return JnaGlib.INST().g_rmdir(asCPointerNotNull(filename));
    }

    /**
     * Returns the data that &#64;iter points to.
     * @param iter a &#35;GSequenceIter
     * @return the data that &#64;iter points to
    */
    public static ch.bailu.gtk.type.Pointer sequenceGet(@Nonnull SequenceIter iter)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_sequence_get(asCPointerNotNull(iter))));
    }

    /**
     * Inserts a new item just before the item pointed to by &#64;iter.
     * @param iter a &#35;GSequenceIter
     * @param data the data for the new item
     * @return an iterator pointing to the new item
    */
    public static SequenceIter sequenceInsertBefore(@Nonnull SequenceIter iter, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new SequenceIter(new PointerContainer(JnaGlib.INST().g_sequence_insert_before(asCPointerNotNull(iter), asCPointer(data))));
    }

    /**
     * Moves the item pointed to by &#64;src to the position indicated by &#64;dest.
     * <br>After calling this function &#64;dest will point to the position immediately
     * <br>after &#64;src. It is allowed for &#64;src and &#64;dest to point into different
     * <br>sequences.
     * @param src a &#35;GSequenceIter pointing to the item to move
     * @param dest a &#35;GSequenceIter pointing to the position to which     the item is moved
    */
    public static void sequenceMove(@Nonnull SequenceIter src, @Nonnull SequenceIter dest)  {
        JnaGlib.INST().g_sequence_move(asCPointerNotNull(src), asCPointerNotNull(dest));
    }

    /**
     * Inserts the (&#64;begin, &#64;end) range at the destination pointed to by &#64;dest.
     * <br>The &#64;begin and &#64;end iters must point into the same sequence. It is
     * <br>allowed for &#64;dest to point to a different sequence than the one pointed
     * <br>into by &#64;begin and &#64;end.
     * <br>
     * <br>If &#64;dest is %NULL, the range indicated by &#64;begin and &#64;end is
     * <br>removed from the sequence. If &#64;dest points to a place within
     * <br>the (&#64;begin, &#64;end) range, the range does not move.
     * @param dest a &#35;GSequenceIter
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
    */
    public static void sequenceMoveRange(@Nonnull SequenceIter dest, @Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        JnaGlib.INST().g_sequence_move_range(asCPointerNotNull(dest), asCPointerNotNull(begin), asCPointerNotNull(end));
    }

    /**
     * Finds an iterator somewhere in the range (&#64;begin, &#64;end). This
     * <br>iterator will be close to the middle of the range, but is not
     * <br>guaranteed to be exactly in the middle.
     * <br>
     * <br>The &#64;begin and &#64;end iterators must both point to the same sequence
     * <br>and &#64;begin must come before or be equal to &#64;end in the sequence.
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
     * @return a &#35;GSequenceIter pointing somewhere in the    (&#64;begin, &#64;end) range
    */
    public static SequenceIter sequenceRangeGetMidpoint(@Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        return new SequenceIter(new PointerContainer(JnaGlib.INST().g_sequence_range_get_midpoint(asCPointerNotNull(begin), asCPointerNotNull(end))));
    }

    /**
     * Removes the item pointed to by &#64;iter. It is an error to pass the
     * <br>end iterator to this function.
     * <br>
     * <br>If the sequence has a data destroy function associated with it, this
     * <br>function is called on the data for the removed item.
     * @param iter a &#35;GSequenceIter
    */
    public static void sequenceRemove(@Nonnull SequenceIter iter)  {
        JnaGlib.INST().g_sequence_remove(asCPointerNotNull(iter));
    }

    /**
     * Removes all items in the (&#64;begin, &#64;end) range.
     * <br>
     * <br>If the sequence has a data destroy function associated with it, this
     * <br>function is called on the data for the removed items.
     * @param begin a &#35;GSequenceIter
     * @param end a &#35;GSequenceIter
    */
    public static void sequenceRemoveRange(@Nonnull SequenceIter begin, @Nonnull SequenceIter end)  {
        JnaGlib.INST().g_sequence_remove_range(asCPointerNotNull(begin), asCPointerNotNull(end));
    }

    /**
     * Changes the data for the item pointed to by &#64;iter to be &#64;data. If
     * <br>the sequence has a data destroy function associated with it, that
     * <br>function is called on the existing data that &#64;iter pointed to.
     * @param iter a &#35;GSequenceIter
     * @param data new data for the item
    */
    public static void sequenceSet(@Nonnull SequenceIter iter, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaGlib.INST().g_sequence_set(asCPointerNotNull(iter), asCPointer(data));
    }

    /**
     * Swaps the items pointed to by &#64;a and &#64;b. It is allowed for &#64;a and &#64;b
     * <br>to point into difference sequences.
     * @param a a &#35;GSequenceIter
     * @param b a &#35;GSequenceIter
    */
    public static void sequenceSwap(@Nonnull SequenceIter a, @Nonnull SequenceIter b)  {
        JnaGlib.INST().g_sequence_swap(asCPointerNotNull(a), asCPointerNotNull(b));
    }

    /**
     * Sets a human-readable name for the application. This name should be
     * <br>localized if possible, and is intended for display to the user.
     * <br>Contrast with g_set_prgname(), which sets a non-localized name.
     * <br>g_set_prgname() will be called automatically by gtk_init(),
     * <br>but g_set_application_name() will not.
     * <br>
     * <br>Note that for thread safety reasons, this function can only
     * <br>be called once.
     * <br>
     * <br>The application name will be used in contexts such as error messages,
     * <br>or when displaying an application's name in the task list.
     * @param application_name localized name of the application
    */
    public static void setApplicationName(@Nonnull ch.bailu.gtk.type.Str application_name)  {
        JnaGlib.INST().g_set_application_name(asCPointerNotNull(application_name));
    }

    /**
     * Sets the name of the program. This name should not be localized,
     * <br>in contrast to g_set_application_name().
     * <br>
     * <br>If you are using &#35;GApplication the program name is set in
     * <br>g_application_run(). In case of GDK or GTK+ it is set in
     * <br>gdk_init(), which is called by gtk_init() and the
     * <br>&#35;GtkApplication::startup handler. The program name is found by
     * <br>taking the last component of &#64;argv[0].
     * <br>
     * <br>Since GLib 2.72, this function can be called multiple times
     * <br>and is fully thread safe. Prior to GLib 2.72, this function
     * <br>could only be called once per process.
     * @param prgname the name of the program.
    */
    public static void setPrgname(@Nonnull ch.bailu.gtk.type.Str prgname)  {
        JnaGlib.INST().g_set_prgname(asCPointerNotNull(prgname));
    }

    /**
     * Sets an environment variable. On UNIX, both the variable's name and
     * <br>value can be arbitrary byte strings, except that the variable's name
     * <br>cannot contain '='. On Windows, they should be in UTF-8.
     * <br>
     * <br>Note that on some systems, when variables are overwritten, the memory
     * <br>used for the previous variables and its value isn't reclaimed.
     * <br>
     * <br>You should be mindful of the fact that environment variable handling
     * <br>in UNIX is not thread-safe, and your program may crash if one thread
     * <br>calls g_setenv() while another thread is calling getenv(). (And note
     * <br>that many functions, such as gettext(), call getenv() internally.)
     * <br>This function is only safe to use at the very start of your program,
     * <br>before creating any other threads (or creating objects that create
     * <br>worker threads of their own).
     * <br>
     * <br>If you need to set up the environment for a child process, you can
     * <br>use g_get_environ() to get an environment array, modify that with
     * <br>g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * <br>array directly to execvpe(), g_spawn_async(), or the like.
     * @param variable the environment variable to set, must not     contain '='.
     * @param value the value for to set the variable to.
     * @param overwrite whether to change the variable if it already exists.
     * @return %FALSE if the environment variable couldn't be set.
    */
    public static boolean setenv(@Nonnull ch.bailu.gtk.type.Str variable, @Nonnull ch.bailu.gtk.type.Str value, boolean overwrite)  {
        return JnaGlib.INST().g_setenv(asCPointerNotNull(variable), asCPointerNotNull(value), overwrite);
    }

    /**
     * 
     * @return 
    */
    public static int shellErrorQuark()  {
        return JnaGlib.INST().g_shell_error_quark();
    }

    /**
     * Quotes a string so that the shell (/bin/sh) will interpret the
     * <br>quoted string to mean &#64;unquoted_string.
     * <br>
     * <br>If you pass a filename to the shell, for example, you should first
     * <br>quote it with this function.
     * <br>
     * <br>The return value must be freed with g_free().
     * <br>
     * <br>The quoting style used is undefined (single or double quotes may be
     * <br>used).
     * @param unquoted_string a literal string
     * @return quoted string
    */
    public static ch.bailu.gtk.type.Str shellQuote(@Nonnull ch.bailu.gtk.type.Str unquoted_string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_shell_quote(asCPointerNotNull(unquoted_string))));
    }

    /**
     * Unquotes a string as the shell (/bin/sh) would.
     * <br>
     * <br>This function only handles quotes; if a string contains file globs,
     * <br>arithmetic operators, variables, backticks, redirections, or other
     * <br>special-to-the-shell features, the result will be different from the
     * <br>result a real shell would produce (the variables, backticks, etc.
     * <br>will be passed through literally instead of being expanded).
     * <br>
     * <br>This function is guaranteed to succeed if applied to the result of
     * <br>g_shell_quote(). If it fails, it returns %NULL and sets the
     * <br>error.
     * <br>
     * <br>The &#64;quoted_string need not actually contain quoted or escaped text;
     * <br>g_shell_unquote() simply goes through the string and unquotes/unescapes
     * <br>anything that the shell would. Both single and double quotes are
     * <br>handled, as are escapes including escaped newlines.
     * <br>
     * <br>The return value must be freed with g_free().
     * <br>
     * <br>Possible errors are in the %G_SHELL_ERROR domain.
     * <br>
     * <br>Shell quoting rules are a bit strange. Single quotes preserve the
     * <br>literal string exactly. escape sequences are not allowed; not even
     * <br>`&#92;'` - if you want a `'` in the quoted text, you have to do something
     * <br>like `'foo'&#92;''bar'`. Double quotes allow `$`, ```, `&quot;`, `&#92;`, and
     * <br>newline to be escaped with backslash. Otherwise double quotes
     * <br>preserve things literally.
     * @param quoted_string shell-quoted string
     * @return an unquoted string
    */
    public static ch.bailu.gtk.type.Str shellUnquote(@Nonnull ch.bailu.gtk.type.Str quoted_string) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_shell_unquote(asCPointerNotNull(quoted_string), 0L)));
    }

    /**
     * Allocates a block of memory from the slice allocator.
     * <br>
     * <br>The block address handed out can be expected to be aligned
     * <br>to at least `1 * sizeof (void*)`, though in general slices
     * <br>are `2 * sizeof (void*)` bytes aligned; if a `malloc()`
     * <br>fallback implementation is used instead, the alignment may
     * <br>be reduced in a libc dependent fashion.
     * <br>
     * <br>Note that the underlying slice allocation mechanism can
     * <br>be changed with the [`G_SLICE=always-malloc`][G_SLICE]
     * <br>environment variable.
     * @param block_size the number of bytes to allocate
     * @return a pointer to the allocated memory block, which will   be %NULL if and only if &#64;mem_size is 0
    */
    public static ch.bailu.gtk.type.Pointer sliceAlloc(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_slice_alloc(block_size)));
    }

    /**
     * Allocates a block of memory via g_slice_alloc() and initializes
     * <br>the returned memory to 0. Note that the underlying slice allocation
     * <br>mechanism can be changed with the [`G_SLICE=always-malloc`][G_SLICE]
     * <br>environment variable.
     * @param block_size the number of bytes to allocate
     * @return a pointer to the allocated block, which will be %NULL if and only    if &#64;mem_size is 0
    */
    public static ch.bailu.gtk.type.Pointer sliceAlloc0(long block_size)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_slice_alloc0(block_size)));
    }

    /**
     * Allocates a block of memory from the slice allocator
     * <br>and copies &#64;block_size bytes into it from &#64;mem_block.
     * <br>
     * <br>&#64;mem_block must be non-%NULL if &#64;block_size is non-zero.
     * @param block_size the number of bytes to allocate
     * @param mem_block the memory to copy
     * @return a pointer to the allocated memory block, which will be %NULL if and    only if &#64;mem_size is 0
    */
    public static ch.bailu.gtk.type.Pointer sliceCopy(long block_size, @Nullable ch.bailu.gtk.type.Pointer mem_block)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_slice_copy(block_size, asCPointer(mem_block))));
    }

    /**
     * Frees a block of memory.
     * <br>
     * <br>The memory must have been allocated via g_slice_alloc() or
     * <br>g_slice_alloc0() and the &#64;block_size has to match the size
     * <br>specified upon allocation. Note that the exact release behaviour
     * <br>can be changed with the [`G_DEBUG=gc-friendly`][G_DEBUG] environment
     * <br>variable, also see [`G_SLICE`][G_SLICE] for related debugging options.
     * <br>
     * <br>If &#64;mem_block is %NULL, this function does nothing.
     * @param block_size the size of the block
     * @param mem_block a pointer to the block to free
    */
    public static void sliceFree1(long block_size, @Nullable ch.bailu.gtk.type.Pointer mem_block)  {
        JnaGlib.INST().g_slice_free1(block_size, asCPointer(mem_block));
    }

    /**
     * Frees a linked list of memory blocks of structure type &#64;type.
     * <br>
     * <br>The memory blocks must be equal-sized, allocated via
     * <br>g_slice_alloc() or g_slice_alloc0() and linked together by a
     * <br>&#64;next pointer (similar to &#35;GSList). The offset of the &#64;next
     * <br>field in each block is passed as third argument.
     * <br>Note that the exact release behaviour can be changed with the
     * <br>[`G_DEBUG=gc-friendly`][G_DEBUG] environment variable, also see
     * <br>[`G_SLICE`][G_SLICE] for related debugging options.
     * <br>
     * <br>If &#64;mem_chain is %NULL, this function does nothing.
     * @param block_size the size of the blocks
     * @param mem_chain a pointer to the first block of the chain
     * @param next_offset the offset of the &#64;next field in the blocks
    */
    public static void sliceFreeChainWithOffset(long block_size, @Nullable ch.bailu.gtk.type.Pointer mem_chain, long next_offset)  {
        JnaGlib.INST().g_slice_free_chain_with_offset(block_size, asCPointer(mem_chain), next_offset);
    }

    /**
     * 
     * @param ckey 
     * @return 
    */
    public static long sliceGetConfig(int ckey)  {
        return JnaGlib.INST().g_slice_get_config(ckey);
    }

    /**
     * 
     * @param ckey 
     * @param value 
    */
    public static void sliceSetConfig(int ckey, long value)  {
        JnaGlib.INST().g_slice_set_config(ckey, value);
    }

    /**
     * A safer form of the standard sprintf() function. The output is guaranteed
     * <br>to not exceed &#64;n characters (including the terminating nul character), so
     * <br>it is easy to ensure that a buffer overflow cannot occur.
     * <br>
     * <br>See also g_strdup_printf().
     * <br>
     * <br>In versions of GLib prior to 1.2.3, this function may return -1 if the
     * <br>output was truncated, and the truncated string may not be nul-terminated.
     * <br>In versions prior to 1.3.12, this function returns the length of the output
     * <br>string.
     * <br>
     * <br>The return value of g_snprintf() conforms to the snprintf()
     * <br>function as standardized in ISO C99. Note that this is different from
     * <br>traditional snprintf(), which returns the length of the output string.
     * <br>
     * <br>The format string may contain positional parameters, as specified in
     * <br>the Single Unix Specification.
     * @param string the buffer to hold the output.
     * @param n the maximum number of bytes to produce (including the     terminating nul character).
     * @param format a standard printf() format string, but notice          [string precision pitfalls][string-precision]
     * @param _elipse the arguments to insert in the output.
     * @return the number of bytes which would be produced if the buffer     was large enough.
    */
    public static int snprintf(@Nonnull ch.bailu.gtk.type.Str string, long n, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return JnaGlib.INST().g_snprintf(asCPointerNotNull(string), n, asCPointerNotNull(format), _elipse);
    }

    /**
     * Removes the source with the given ID from the default main context. You must
     * <br>use g_source_destroy() for sources added to a non-default main context.
     * <br>
     * <br>The ID of a &#35;GSource is given by g_source_get_id(), or will be
     * <br>returned by the functions g_source_attach(), g_idle_add(),
     * <br>g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * <br>g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * <br>g_io_add_watch_full().
     * <br>
     * <br>It is a programmer error to attempt to remove a non-existent source.
     * <br>
     * <br>More specifically: source IDs can be reissued after a source has been
     * <br>destroyed and therefore it is never valid to use this function with a
     * <br>source ID which may have already been removed.  An example is when
     * <br>scheduling an idle to run in another thread with g_idle_add(): the
     * <br>idle may already have run and been removed by the time this function
     * <br>is called on its (now invalid) source ID.  This source ID may have
     * <br>been reissued, leading to the operation being performed against the
     * <br>wrong source.
     * @param tag the ID of the source to remove.
     * @return %TRUE if the source was found and removed.
    */
    public static boolean sourceRemove(int tag)  {
        return JnaGlib.INST().g_source_remove(tag);
    }

    /**
     * Removes a source from the default main loop context given the
     * <br>source functions and user data. If multiple sources exist with the
     * <br>same source functions and user data, only one will be destroyed.
     * @param funcs The &#64;source_funcs passed to g_source_new()
     * @param user_data the user data for the callback
     * @return %TRUE if a source was found and removed.
    */
    public static boolean sourceRemoveByFuncsUserData(@Nonnull SourceFuncs funcs, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_source_remove_by_funcs_user_data(asCPointerNotNull(funcs), asCPointer(user_data));
    }

    /**
     * Removes a source from the default main loop context given the user
     * <br>data for the callback. If multiple sources exist with the same user
     * <br>data, only one will be destroyed.
     * @param user_data the user_data for the callback.
     * @return %TRUE if a source was found and removed.
    */
    public static boolean sourceRemoveByUserData(@Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_source_remove_by_user_data(asCPointer(user_data));
    }

    /**
     * Sets the name of a source using its ID.
     * <br>
     * <br>This is a convenience utility to set source names from the return
     * <br>value of g_idle_add(), g_timeout_add(), etc.
     * <br>
     * <br>It is a programmer error to attempt to set the name of a non-existent
     * <br>source.
     * <br>
     * <br>More specifically: source IDs can be reissued after a source has been
     * <br>destroyed and therefore it is never valid to use this function with a
     * <br>source ID which may have already been removed.  An example is when
     * <br>scheduling an idle to run in another thread with g_idle_add(): the
     * <br>idle may already have run and been removed by the time this function
     * <br>is called on its (now invalid) source ID.  This source ID may have
     * <br>been reissued, leading to the operation being performed against the
     * <br>wrong source.
     * @param tag a &#35;GSource ID
     * @param name debug name for the source
    */
    public static void sourceSetNameById(int tag, @Nonnull ch.bailu.gtk.type.Str name)  {
        JnaGlib.INST().g_source_set_name_by_id(tag, asCPointerNotNull(name));
    }

    /**
     * Gets the smallest prime number from a built-in array of primes which
     * <br>is larger than &#64;num. This is used within GLib to calculate the optimum
     * <br>size of a &#35;GHashTable.
     * <br>
     * <br>The built-in array of primes ranges from 11 to 13845163 such that
     * <br>each prime is approximately 1.5-2 times the previous prime.
     * @param num a &#35;guint
     * @return the smallest prime number from a built-in array of primes     which is larger than &#64;num
    */
    public static int spacedPrimesClosest(int num)  {
        return JnaGlib.INST().g_spaced_primes_closest(num);
    }

    /**
     * Set &#64;error if &#64;wait_status indicates the child exited abnormally
     * <br>(e.g. with a nonzero exit code, or via a fatal signal).
     * <br>
     * <br>The g_spawn_sync() and g_child_watch_add() family of APIs return the
     * <br>status of subprocesses encoded in a platform-specific way.
     * <br>On Unix, this is guaranteed to be in the same format waitpid() returns,
     * <br>and on Windows it is guaranteed to be the result of GetExitCodeProcess().
     * <br>
     * <br>Prior to the introduction of this function in GLib 2.34, interpreting
     * <br>&#64;wait_status required use of platform-specific APIs, which is problematic
     * <br>for software using GLib as a cross-platform layer.
     * <br>
     * <br>Additionally, many programs simply want to determine whether or not
     * <br>the child exited successfully, and either propagate a &#35;GError or
     * <br>print a message to standard error. In that common case, this function
     * <br>can be used. Note that the error message in &#64;error will contain
     * <br>human-readable information about the wait status.
     * <br>
     * <br>The &#64;domain and &#64;code of &#64;error have special semantics in the case
     * <br>where the process has an &quot;exit code&quot;, as opposed to being killed by
     * <br>a signal. On Unix, this happens if WIFEXITED() would be true of
     * <br>&#64;wait_status. On Windows, it is always the case.
     * <br>
     * <br>The special semantics are that the actual exit code will be the
     * <br>code set in &#64;error, and the domain will be %G_SPAWN_EXIT_ERROR.
     * <br>This allows you to differentiate between different exit codes.
     * <br>
     * <br>If the process was terminated by some means other than an exit
     * <br>status (for example if it was killed by a signal), the domain will be
     * <br>%G_SPAWN_ERROR and the code will be %G_SPAWN_ERROR_FAILED.
     * <br>
     * <br>This function just offers convenience; you can of course also check
     * <br>the available platform via a macro such as %G_OS_UNIX, and use
     * <br>WIFEXITED() and WEXITSTATUS() on &#64;wait_status directly. Do not attempt
     * <br>to scan or parse the error message string; it may be translated and/or
     * <br>change in future versions of GLib.
     * <br>
     * <br>Prior to version 2.70, g_spawn_check_exit_status() provides the same
     * <br>functionality, although under a misleading name.
     * @param wait_status A platform-specific wait status as returned from g_spawn_sync()
     * @return %TRUE if child exited successfully, %FALSE otherwise (and   &#64;error will be set)
    */
    public static boolean spawnCheckWaitStatus(int wait_status) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_spawn_check_wait_status(wait_status, 0L);
    }

    /**
     * A simple version of g_spawn_async() that parses a command line with
     * <br>g_shell_parse_argv() and passes it to g_spawn_async().
     * <br>
     * <br>Runs a command line in the background. Unlike g_spawn_async(), the
     * <br>%G_SPAWN_SEARCH_PATH flag is enabled, other flags are not. Note
     * <br>that %G_SPAWN_SEARCH_PATH can have security implications, so
     * <br>consider using g_spawn_async() directly if appropriate. Possible
     * <br>errors are those from g_shell_parse_argv() and g_spawn_async().
     * <br>
     * <br>The same concerns on Windows apply as for g_spawn_command_line_sync().
     * @param command_line a command line
     * @return %TRUE on success, %FALSE if error is set
    */
    public static boolean spawnCommandLineAsync(@Nonnull ch.bailu.gtk.type.Str command_line) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_spawn_command_line_async(asCPointerNotNull(command_line), 0L);
    }

    /**
     * 
     * @return 
    */
    public static int spawnErrorQuark()  {
        return JnaGlib.INST().g_spawn_error_quark();
    }

    /**
     * 
     * @return 
    */
    public static int spawnExitErrorQuark()  {
        return JnaGlib.INST().g_spawn_exit_error_quark();
    }

    /**
     * An implementation of the standard sprintf() function which supports
     * <br>positional parameters, as specified in the Single Unix Specification.
     * <br>
     * <br>Note that it is usually better to use g_snprintf(), to avoid the
     * <br>risk of buffer overflow.
     * <br>
     * <br>`glib/gprintf.h` must be explicitly included in order to use this function.
     * <br>
     * <br>See also g_strdup_printf().
     * @param string A pointer to a memory buffer to contain the resulting string. It          is up to the caller to ensure that the allocated buffer is large          enough to hold the formatted result
     * @param format a standard printf() format string, but notice          [string precision pitfalls][string-precision]
     * @param _elipse the arguments to insert in the output.
     * @return the number of bytes printed.
    */
    public static int sprintf(@Nonnull ch.bailu.gtk.type.Str string, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return JnaGlib.INST().g_sprintf(asCPointerNotNull(string), asCPointerNotNull(format), _elipse);
    }

    /**
     * Copies a nul-terminated string into the dest buffer, include the
     * <br>trailing nul, and return a pointer to the trailing nul byte.
     * <br>This is useful for concatenating multiple strings together
     * <br>without having to repeatedly scan for the end.
     * @param dest destination buffer.
     * @param src source string.
     * @return a pointer to trailing nul byte.
    */
    public static ch.bailu.gtk.type.Str stpcpy(@Nonnull ch.bailu.gtk.type.Str dest, @Nonnull ch.bailu.gtk.type.Str src)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_stpcpy(asCPointerNotNull(dest), asCPointerNotNull(src))));
    }

    /**
     * Compares two strings for byte-by-byte equality and returns %TRUE
     * <br>if they are equal. It can be passed to g_hash_table_new() as the
     * <br>&#64;key_equal_func parameter, when using non-%NULL strings as keys in a
     * <br>&#35;GHashTable.
     * <br>
     * <br>This function is typically used for hash table comparisons, but can be used
     * <br>for general purpose comparisons of non-%NULL strings. For a %NULL-safe string
     * <br>comparison function, see g_strcmp0().
     * @param v1 a key
     * @param v2 a key to compare with &#64;v1
     * @return %TRUE if the two keys match
    */
    public static boolean strEqual(@Nonnull ch.bailu.gtk.type.Pointer v1, @Nonnull ch.bailu.gtk.type.Pointer v2)  {
        return JnaGlib.INST().g_str_equal(asCPointerNotNull(v1), asCPointerNotNull(v2));
    }

    /**
     * Looks whether the string &#64;str begins with &#64;prefix.
     * @param str a nul-terminated string
     * @param prefix the nul-terminated prefix to look for
     * @return %TRUE if &#64;str begins with &#64;prefix, %FALSE otherwise.
    */
    public static boolean strHasPrefix(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Str prefix)  {
        return JnaGlib.INST().g_str_has_prefix(asCPointerNotNull(str), asCPointerNotNull(prefix));
    }

    /**
     * Looks whether the string &#64;str ends with &#64;suffix.
     * @param str a nul-terminated string
     * @param suffix the nul-terminated suffix to look for
     * @return %TRUE if &#64;str end with &#64;suffix, %FALSE otherwise.
    */
    public static boolean strHasSuffix(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Str suffix)  {
        return JnaGlib.INST().g_str_has_suffix(asCPointerNotNull(str), asCPointerNotNull(suffix));
    }

    /**
     * Converts a string to a hash value.
     * <br>
     * <br>This function implements the widely used &quot;djb&quot; hash apparently
     * <br>posted by Daniel Bernstein to comp.lang.c some time ago.  The 32
     * <br>bit unsigned hash value starts at 5381 and for each byte 'c' in
     * <br>the string, is updated: `hash = hash * 33 + c`. This function
     * <br>uses the signed value of each byte.
     * <br>
     * <br>It can be passed to g_hash_table_new() as the &#64;hash_func parameter,
     * <br>when using non-%NULL strings as keys in a &#35;GHashTable.
     * <br>
     * <br>Note that this function may not be a perfect fit for all use cases.
     * <br>For example, it produces some hash collisions with strings as short
     * <br>as 2.
     * @param v a string key
     * @return a hash value corresponding to the key
    */
    public static int strHash(@Nonnull ch.bailu.gtk.type.Pointer v)  {
        return JnaGlib.INST().g_str_hash(asCPointerNotNull(v));
    }

    /**
     * Determines if a string is pure ASCII. A string is pure ASCII if it
     * <br>contains no bytes with the high bit set.
     * @param str a string
     * @return %TRUE if &#64;str is ASCII
    */
    public static boolean strIsAscii(@Nonnull ch.bailu.gtk.type.Str str)  {
        return JnaGlib.INST().g_str_is_ascii(asCPointerNotNull(str));
    }

    /**
     * Checks if a search conducted for &#64;search_term should match
     * <br>&#64;potential_hit.
     * <br>
     * <br>This function calls g_str_tokenize_and_fold() on both
     * <br>&#64;search_term and &#64;potential_hit.  ASCII alternates are never taken
     * <br>for &#64;search_term but will be taken for &#64;potential_hit according to
     * <br>the value of &#64;accept_alternates.
     * <br>
     * <br>A hit occurs when each folded token in &#64;search_term is a prefix of a
     * <br>folded token from &#64;potential_hit.
     * <br>
     * <br>Depending on how you're performing the search, it will typically be
     * <br>faster to call g_str_tokenize_and_fold() on each string in
     * <br>your corpus and build an index on the returned folded tokens, then
     * <br>call g_str_tokenize_and_fold() on the search term and
     * <br>perform lookups into that index.
     * <br>
     * <br>As some examples, searching for ‘fred’ would match the potential hit
     * <br>‘Smith, Fred’ and also ‘Frédéric’.  Searching for ‘Fréd’ would match
     * <br>‘Frédéric’ but not ‘Frederic’ (due to the one-directional nature of
     * <br>accent matching).  Searching ‘fo’ would match ‘Foo’ and ‘Bar Foo
     * <br>Baz’, but not ‘SFO’ (because no word has ‘fo’ as a prefix).
     * @param search_term the search term from the user
     * @param potential_hit the text that may be a hit
     * @param accept_alternates %TRUE to accept ASCII alternates
     * @return %TRUE if &#64;potential_hit is a hit
    */
    public static boolean strMatchString(@Nonnull ch.bailu.gtk.type.Str search_term, @Nonnull ch.bailu.gtk.type.Str potential_hit, boolean accept_alternates)  {
        return JnaGlib.INST().g_str_match_string(asCPointerNotNull(search_term), asCPointerNotNull(potential_hit), accept_alternates);
    }

    /**
     * Transliterate &#64;str to plain ASCII.
     * <br>
     * <br>For best results, &#64;str should be in composed normalised form.
     * <br>
     * <br>This function performs a reasonably good set of character
     * <br>replacements.  The particular set of replacements that is done may
     * <br>change by version or even by runtime environment.
     * <br>
     * <br>If the source language of &#64;str is known, it can used to improve the
     * <br>accuracy of the translation by passing it as &#64;from_locale.  It should
     * <br>be a valid POSIX locale string (of the form
     * <br>`language[_territory][.codeset][&#64;modifier]`).
     * <br>
     * <br>If &#64;from_locale is %NULL then the current locale is used.
     * <br>
     * <br>If you want to do translation for no specific locale, and you want it
     * <br>to be done independently of the currently locale, specify `&quot;C&quot;` for
     * <br>&#64;from_locale.
     * @param str a string, in UTF-8
     * @param from_locale the source locale, if known
     * @return a string in plain ASCII
    */
    public static ch.bailu.gtk.type.Str strToAscii(@Nonnull ch.bailu.gtk.type.Str str, @Nullable ch.bailu.gtk.type.Str from_locale)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_str_to_ascii(asCPointerNotNull(str), asCPointer(from_locale))));
    }

    /**
     * For each character in &#64;string, if the character is not in &#64;valid_chars,
     * <br>replaces the character with &#64;substitutor.
     * <br>
     * <br>Modifies &#64;string in place, and return &#64;string itself, not a copy. The
     * <br>return value is to allow nesting such as:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   g_ascii_strup (g_strcanon (str, &quot;abc&quot;, '?'))
     * </pre>
     * <br>
     * <br>In order to modify a copy, you may use g_strdup():
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   reformatted = g_strcanon (g_strdup (const_str), &quot;abc&quot;, '?');
     *   ...
     *   g_free (reformatted);
     * </pre>
     * @param string a nul-terminated array of bytes
     * @param valid_chars bytes permitted in &#64;string
     * @param substitutor replacement character for disallowed bytes
     * @return the modified &#64;string
    */
    public static ch.bailu.gtk.type.Str strcanon(@Nonnull ch.bailu.gtk.type.Str string, @Nonnull ch.bailu.gtk.type.Str valid_chars, byte substitutor)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strcanon(asCPointerNotNull(string), asCPointerNotNull(valid_chars), substitutor)));
    }

    /**
     * Removes trailing whitespace from a string.
     * <br>
     * <br>This function doesn't allocate or reallocate any memory;
     * <br>it modifies &#64;string in place. Therefore, it cannot be used
     * <br>on statically allocated strings.
     * <br>
     * <br>The pointer to &#64;string is returned to allow the nesting of functions.
     * <br>
     * <br>Also see g_strchug() and g_strstrip().
     * @param string a string to remove the trailing whitespace from
     * @return &#64;string
    */
    public static ch.bailu.gtk.type.Str strchomp(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strchomp(asCPointerNotNull(string))));
    }

    /**
     * Removes leading whitespace from a string, by moving the rest
     * <br>of the characters forward.
     * <br>
     * <br>This function doesn't allocate or reallocate any memory;
     * <br>it modifies &#64;string in place. Therefore, it cannot be used on
     * <br>statically allocated strings.
     * <br>
     * <br>The pointer to &#64;string is returned to allow the nesting of functions.
     * <br>
     * <br>Also see g_strchomp() and g_strstrip().
     * @param string a string to remove the leading whitespace from
     * @return &#64;string
    */
    public static ch.bailu.gtk.type.Str strchug(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strchug(asCPointerNotNull(string))));
    }

    /**
     * Compares &#64;str1 and &#64;str2 like strcmp(). Handles %NULL
     * <br>gracefully by sorting it before non-%NULL strings.
     * <br>Comparing two %NULL pointers returns 0.
     * @param str1 a C string or %NULL
     * @param str2 another C string or %NULL
     * @return an integer less than, equal to, or greater than zero, if &#64;str1 is &lt;, == or &gt; than &#64;str2.
    */
    public static int strcmp0(@Nullable ch.bailu.gtk.type.Str str1, @Nullable ch.bailu.gtk.type.Str str2)  {
        return JnaGlib.INST().g_strcmp0(asCPointer(str1), asCPointer(str2));
    }

    /**
     * Replaces all escaped characters with their one byte equivalent.
     * <br>
     * <br>This function does the reverse conversion of g_strescape().
     * @param source a string to compress
     * @return a newly-allocated copy of &#64;source with all escaped     character compressed
    */
    public static ch.bailu.gtk.type.Str strcompress(@Nonnull ch.bailu.gtk.type.Str source)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strcompress(asCPointerNotNull(source))));
    }

    /**
     * Concatenates all of the given strings into one long string. The
     * <br>returned string should be freed with g_free() when no longer needed.
     * <br>
     * <br>The variable argument list must end with %NULL. If you forget the %NULL,
     * <br>g_strconcat() will start appending random memory junk to your string.
     * <br>
     * <br>Note that this function is usually not the right function to use to
     * <br>assemble a translated message from pieces, since proper translation
     * <br>often requires the pieces to be reordered.
     * @param string1 the first string to add, which must not be %NULL
     * @param _elipse a %NULL-terminated list of strings to append to the string
     * @return a newly-allocated string containing all the string arguments
    */
    public static ch.bailu.gtk.type.Str strconcat(@Nonnull ch.bailu.gtk.type.Str string1, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strconcat(asCPointerNotNull(string1), _elipse)));
    }

    /**
     * Converts any delimiter characters in &#64;string to &#64;new_delimiter.
     * <br>
     * <br>Any characters in &#64;string which are found in &#64;delimiters are
     * <br>changed to the &#64;new_delimiter character. Modifies &#64;string in place,
     * <br>and returns &#64;string itself, not a copy.
     * <br>
     * <br>The return value is to allow nesting such as:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   g_ascii_strup (g_strdelimit (str, &quot;abc&quot;, '?'))
     * </pre>
     * <br>
     * <br>In order to modify a copy, you may use g_strdup():
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   reformatted = g_strdelimit (g_strdup (const_str), &quot;abc&quot;, '?');
     *   ...
     *   g_free (reformatted);
     * </pre>
     * @param string the string to convert
     * @param delimiters a string containing the current delimiters,     or %NULL to use the standard delimiters defined in %G_STR_DELIMITERS
     * @param new_delimiter the new delimiter character
     * @return the modified &#64;string
    */
    public static ch.bailu.gtk.type.Str strdelimit(@Nonnull ch.bailu.gtk.type.Str string, @Nullable ch.bailu.gtk.type.Str delimiters, byte new_delimiter)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strdelimit(asCPointerNotNull(string), asCPointer(delimiters), new_delimiter)));
    }

    /**
     * Duplicates a string. If &#64;str is %NULL it returns %NULL.
     * <br>The returned string should be freed with g_free()
     * <br>when no longer needed.
     * @param str the string to duplicate
     * @return a newly-allocated copy of &#64;str
    */
    public static ch.bailu.gtk.type.Str strdup(@Nullable ch.bailu.gtk.type.Str str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strdup(asCPointer(str))));
    }

    /**
     * Similar to the standard C sprintf() function but safer, since it
     * <br>calculates the maximum space required and allocates memory to hold
     * <br>the result. The returned string should be freed with g_free() when no
     * <br>longer needed.
     * <br>
     * <br>The returned string is guaranteed to be non-NULL, unless &#64;format
     * <br>contains `%lc` or `%ls` conversions, which can fail if no multibyte
     * <br>representation is available for the given character.
     * @param format a standard printf() format string, but notice     [string precision pitfalls][string-precision]
     * @param _elipse the parameters to insert into the format string
     * @return a newly-allocated string holding the result
    */
    public static ch.bailu.gtk.type.Str strdupPrintf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strdup_printf(asCPointerNotNull(format), _elipse)));
    }

    /**
     * Returns a string corresponding to the given error code, e.g. &quot;no
     * <br>such process&quot;. Unlike strerror(), this always returns a string in
     * <br>UTF-8 encoding, and the pointer is guaranteed to remain valid for
     * <br>the lifetime of the process.
     * <br>
     * <br>Note that the string may be translated according to the current locale.
     * <br>
     * <br>The value of %errno will not be changed by this function. However, it may
     * <br>be changed by intermediate function calls, so you should save its value
     * <br>as soon as the call returns:
     * <pre>
     *   int saved_errno;
     * 
     *   ret = read (blah);
     *   saved_errno = errno;
     * 
     *   g_strerror (saved_errno);
     * </pre>
     * @param errnum the system error number. See the standard C %errno     documentation
     * @return a UTF-8 string describing the error code. If the error code     is unknown, it returns a string like &quot;Unknown error: &lt;code&gt;&quot;.
    */
    public static ch.bailu.gtk.type.Str strerror(int errnum)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strerror(errnum)));
    }

    /**
     * Escapes the special characters '&#92;b', '&#92;f', '&#92;n', '&#92;r', '&#92;t', '&#92;v', '&#92;'
     * <br>and '&quot;' in the string &#64;source by inserting a '&#92;' before
     * <br>them. Additionally all characters in the range 0x01-0x1F (everything
     * <br>below SPACE) and in the range 0x7F-0xFF (all non-ASCII chars) are
     * <br>replaced with a '&#92;' followed by their octal representation.
     * <br>Characters supplied in &#64;exceptions are not escaped.
     * <br>
     * <br>g_strcompress() does the reverse conversion.
     * @param source a string to escape
     * @param exceptions a string of characters not to escape in &#64;source
     * @return a newly-allocated copy of &#64;source with certain     characters escaped. See above.
    */
    public static ch.bailu.gtk.type.Str strescape(@Nonnull ch.bailu.gtk.type.Str source, @Nullable ch.bailu.gtk.type.Str exceptions)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strescape(asCPointerNotNull(source), asCPointer(exceptions))));
    }

    /**
     * An auxiliary function for gettext() support (see Q_()).
     * @param msgid a string
     * @param msgval another string
     * @return &#64;msgval, unless &#64;msgval is identical to &#64;msgid     and contains a '|' character, in which case a pointer to     the substring of msgid after the first '|' character is returned.
    */
    public static ch.bailu.gtk.type.Str stripContext(@Nonnull ch.bailu.gtk.type.Str msgid, @Nonnull ch.bailu.gtk.type.Str msgval)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strip_context(asCPointerNotNull(msgid), asCPointerNotNull(msgval))));
    }

    /**
     * Joins a number of strings together to form one long string, with the
     * <br>optional &#64;separator inserted between each of them. The returned string
     * <br>should be freed with g_free().
     * @param separator a string to insert between each of the     strings, or %NULL
     * @param _elipse a %NULL-terminated list of strings to join
     * @return a newly-allocated string containing all of the strings joined     together, with &#64;separator between them
    */
    public static ch.bailu.gtk.type.Str strjoin(@Nullable ch.bailu.gtk.type.Str separator, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strjoin(asCPointer(separator), _elipse)));
    }

    /**
     * Portability wrapper that calls strlcat() on systems which have it,
     * <br>and emulates it otherwise. Appends nul-terminated &#64;src string to &#64;dest,
     * <br>guaranteeing nul-termination for &#64;dest. The total size of &#64;dest won't
     * <br>exceed &#64;dest_size.
     * <br>
     * <br>At most &#64;dest_size - 1 characters will be copied. Unlike strncat(),
     * <br>&#64;dest_size is the full size of dest, not the space left over. This
     * <br>function does not allocate memory. It always nul-terminates (unless
     * <br>&#64;dest_size == 0 or there were no nul characters in the &#64;dest_size
     * <br>characters of dest to start with).
     * <br>
     * <br>Caveat: this is supposedly a more secure alternative to strcat() or
     * <br>strncat(), but for real security g_strconcat() is harder to mess up.
     * @param dest destination buffer, already containing one nul-terminated string
     * @param src source buffer
     * @param dest_size length of &#64;dest buffer in bytes (not length of existing string     inside &#64;dest)
     * @return size of attempted result, which is MIN (dest_size, strlen     (original dest)) + strlen (src), so if retval &gt;= dest_size,     truncation occurred.
    */
    public static long strlcat(@Nonnull ch.bailu.gtk.type.Str dest, @Nonnull ch.bailu.gtk.type.Str src, long dest_size)  {
        return JnaGlib.INST().g_strlcat(asCPointerNotNull(dest), asCPointerNotNull(src), dest_size);
    }

    /**
     * Portability wrapper that calls strlcpy() on systems which have it,
     * <br>and emulates strlcpy() otherwise. Copies &#64;src to &#64;dest; &#64;dest is
     * <br>guaranteed to be nul-terminated; &#64;src must be nul-terminated;
     * <br>&#64;dest_size is the buffer size, not the number of bytes to copy.
     * <br>
     * <br>At most &#64;dest_size - 1 characters will be copied. Always nul-terminates
     * <br>(unless &#64;dest_size is 0). This function does not allocate memory. Unlike
     * <br>strncpy(), this function doesn't pad &#64;dest (so it's often faster). It
     * <br>returns the size of the attempted result, strlen (src), so if
     * <br>&#64;retval &gt;= &#64;dest_size, truncation occurred.
     * <br>
     * <br>Caveat: strlcpy() is supposedly more secure than strcpy() or strncpy(),
     * <br>but if you really want to avoid screwups, g_strdup() is an even better
     * <br>idea.
     * @param dest destination buffer
     * @param src source buffer
     * @param dest_size length of &#64;dest in bytes
     * @return length of &#64;src
    */
    public static long strlcpy(@Nonnull ch.bailu.gtk.type.Str dest, @Nonnull ch.bailu.gtk.type.Str src, long dest_size)  {
        return JnaGlib.INST().g_strlcpy(asCPointerNotNull(dest), asCPointerNotNull(src), dest_size);
    }

    /**
     * Duplicates the first &#64;n bytes of a string, returning a newly-allocated
     * <br>buffer &#64;n + 1 bytes long which will always be nul-terminated. If &#64;str
     * <br>is less than &#64;n bytes long the buffer is padded with nuls. If &#64;str is
     * <br>%NULL it returns %NULL. The returned value should be freed when no longer
     * <br>needed.
     * <br>
     * <br>To copy a number of characters from a UTF-8 encoded string,
     * <br>use g_utf8_strncpy() instead.
     * @param str the string to duplicate
     * @param n the maximum number of bytes to copy from &#64;str
     * @return a newly-allocated buffer containing the first &#64;n bytes     of &#64;str, nul-terminated
    */
    public static ch.bailu.gtk.type.Str strndup(@Nonnull ch.bailu.gtk.type.Str str, long n)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strndup(asCPointerNotNull(str), n)));
    }

    /**
     * Creates a new string &#64;length bytes long filled with &#64;fill_char.
     * <br>The returned string should be freed when no longer needed.
     * @param length the length of the new string
     * @param fill_char the byte to fill the string with
     * @return a newly-allocated string filled the &#64;fill_char
    */
    public static ch.bailu.gtk.type.Str strnfill(long length, byte fill_char)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strnfill(length, fill_char)));
    }

    /**
     * Reverses all of the bytes in a string. For example,
     * <br>`g_strreverse (&quot;abcdef&quot;)` will result in &quot;fedcba&quot;.
     * <br>
     * <br>Note that g_strreverse() doesn't work on UTF-8 strings
     * <br>containing multibyte characters. For that purpose, use
     * <br>g_utf8_strreverse().
     * @param string the string to reverse
     * @return the same pointer passed in as &#64;string
    */
    public static ch.bailu.gtk.type.Str strreverse(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strreverse(asCPointerNotNull(string))));
    }

    /**
     * Searches the string &#64;haystack for the last occurrence
     * <br>of the string &#64;needle.
     * @param haystack a nul-terminated string
     * @param needle the nul-terminated string to search for
     * @return a pointer to the found occurrence, or    %NULL if not found.
    */
    public static ch.bailu.gtk.type.Str strrstr(@Nonnull ch.bailu.gtk.type.Str haystack, @Nonnull ch.bailu.gtk.type.Str needle)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strrstr(asCPointerNotNull(haystack), asCPointerNotNull(needle))));
    }

    /**
     * Searches the string &#64;haystack for the last occurrence
     * <br>of the string &#64;needle, limiting the length of the search
     * <br>to &#64;haystack_len.
     * @param haystack a nul-terminated string
     * @param haystack_len the maximum length of &#64;haystack in bytes. A length of -1     can be used to mean &quot;search the entire string&quot;, like g_strrstr().
     * @param needle the nul-terminated string to search for
     * @return a pointer to the found occurrence, or    %NULL if not found.
    */
    public static ch.bailu.gtk.type.Str strrstrLen(@Nonnull ch.bailu.gtk.type.Str haystack, long haystack_len, @Nonnull ch.bailu.gtk.type.Str needle)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strrstr_len(asCPointerNotNull(haystack), haystack_len, asCPointerNotNull(needle))));
    }

    /**
     * Returns a string describing the given signal, e.g. &quot;Segmentation fault&quot;.
     * <br>You should use this function in preference to strsignal(), because it
     * <br>returns a string in UTF-8 encoding, and since not all platforms support
     * <br>the strsignal() function.
     * @param signum the signal number. See the `signal` documentation
     * @return a UTF-8 string describing the signal. If the signal is unknown,     it returns &quot;unknown signal (&lt;signum&gt;)&quot;.
    */
    public static ch.bailu.gtk.type.Str strsignal(int signum)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strsignal(signum)));
    }

    /**
     * Searches the string &#64;haystack for the first occurrence
     * <br>of the string &#64;needle, limiting the length of the search
     * <br>to &#64;haystack_len.
     * @param haystack a nul-terminated string
     * @param haystack_len the maximum length of &#64;haystack in bytes. A length of -1     can be used to mean &quot;search the entire string&quot;, like `strstr()`.
     * @param needle the string to search for
     * @return a pointer to the found occurrence, or    %NULL if not found.
    */
    public static ch.bailu.gtk.type.Str strstrLen(@Nonnull ch.bailu.gtk.type.Str haystack, long haystack_len, @Nonnull ch.bailu.gtk.type.Str needle)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_strstr_len(asCPointerNotNull(haystack), haystack_len, asCPointerNotNull(needle))));
    }

    /**
     * 
     * @return 
    */
    public static long strvGetType()  {
        return JnaGlib.INST().g_strv_get_type();
    }

    /**
     * Create a new test case, similar to g_test_create_case(). However
     * <br>the test is assumed to use no fixture, and test suites are automatically
     * <br>created on the fly and added to the root fixture, based on the
     * <br>slash-separated portions of &#64;testpath. The &#64;test_data argument
     * <br>will be passed as first argument to &#64;test_func.
     * <br>
     * <br>If &#64;testpath includes the component &quot;subprocess&quot; anywhere in it,
     * <br>the test will be skipped by default, and only run if explicitly
     * <br>required via the `-p` command-line option or g_test_trap_subprocess().
     * <br>
     * <br>No component of &#64;testpath may start with a dot (`.`) if the
     * <br>%G_TEST_OPTION_ISOLATE_DIRS option is being used; and it is recommended to
     * <br>do so even if it isn’t.
     * @param testpath /-separated test case path name for the test.
     * @param test_data Test data argument for the test function.
     * @param test_func The test function to invoke for this test.
    */
    public static void testAddDataFunc(@Nonnull ch.bailu.gtk.type.Str testpath, @Nullable ch.bailu.gtk.type.Pointer test_data, OnTestDataFunc test_func)  {
        JnaGlib.INST().g_test_add_data_func(asCPointerNotNull(testpath), asCPointer(test_data), toOnTestDataFunc(getClassHandler().getInstance(), "testAddDataFunc", test_func));
    }

    /**
     * Create a new test case, as with g_test_add_data_func(), but freeing
     * <br>&#64;test_data after the test run is complete.
     * @param testpath /-separated test case path name for the test.
     * @param test_data Test data argument for the test function.
     * @param test_func The test function to invoke for this test.
     * @param data_free_func &#35;GDestroyNotify for &#64;test_data.
    */
    public static void testAddDataFuncFull(@Nonnull ch.bailu.gtk.type.Str testpath, @Nullable ch.bailu.gtk.type.Pointer test_data, OnTestDataFunc test_func, OnDestroyNotify data_free_func)  {
        JnaGlib.INST().g_test_add_data_func_full(asCPointerNotNull(testpath), asCPointer(test_data), toOnTestDataFunc(getClassHandler().getInstance(), "testAddDataFuncFull", test_func), toOnDestroyNotify(getClassHandler().getInstance(), "testAddDataFuncFull", data_free_func));
    }

    /**
     * Create a new test case, similar to g_test_create_case(). However
     * <br>the test is assumed to use no fixture, and test suites are automatically
     * <br>created on the fly and added to the root fixture, based on the
     * <br>slash-separated portions of &#64;testpath.
     * <br>
     * <br>If &#64;testpath includes the component &quot;subprocess&quot; anywhere in it,
     * <br>the test will be skipped by default, and only run if explicitly
     * <br>required via the `-p` command-line option or g_test_trap_subprocess().
     * <br>
     * <br>No component of &#64;testpath may start with a dot (`.`) if the
     * <br>%G_TEST_OPTION_ISOLATE_DIRS option is being used; and it is recommended to
     * <br>do so even if it isn’t.
     * @param testpath /-separated test case path name for the test.
     * @param test_func The test function to invoke for this test.
    */
    public static void testAddFunc(@Nonnull ch.bailu.gtk.type.Str testpath, OnTestFunc test_func)  {
        JnaGlib.INST().g_test_add_func(asCPointerNotNull(testpath), toOnTestFunc(getClassHandler().getInstance(), "testAddFunc", test_func));
    }

    /**
     * 
     * @param testpath 
     * @param data_size 
     * @param test_data 
     * @param data_setup 
     * @param data_test 
     * @param data_teardown 
    */
    public static void testAddVtable(@Nonnull ch.bailu.gtk.type.Str testpath, long data_size, @Nullable ch.bailu.gtk.type.Pointer test_data, OnTestFixtureFunc data_setup, OnTestFixtureFunc data_test, OnTestFixtureFunc data_teardown)  {
        JnaGlib.INST().g_test_add_vtable(asCPointerNotNull(testpath), data_size, asCPointer(test_data), toOnTestFixtureFunc(getClassHandler().getInstance(), "testAddVtable", data_setup), toOnTestFixtureFunc(getClassHandler().getInstance(), "testAddVtable", data_test), toOnTestFixtureFunc(getClassHandler().getInstance(), "testAddVtable", data_teardown));
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
    */
    public static void testAssertExpectedMessagesInternal(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func)  {
        JnaGlib.INST().g_test_assert_expected_messages_internal(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func));
    }

    /**
     * This function adds a message to test reports that
     * <br>associates a bug URI with a test case.
     * <br>
     * <br>Bug URIs are constructed from a base URI set with g_test_bug_base()
     * <br>and &#64;bug_uri_snippet. If g_test_bug_base() has not been called, it is
     * <br>assumed to be the empty string, so a full URI can be provided to
     * <br>g_test_bug() instead.
     * <br>
     * <br>Since GLib 2.70, the base URI is not prepended to &#64;bug_uri_snippet if it
     * <br>is already a valid URI.
     * @param bug_uri_snippet Bug specific bug tracker URI or URI portion.
    */
    public static void testBug(@Nonnull ch.bailu.gtk.type.Str bug_uri_snippet)  {
        JnaGlib.INST().g_test_bug(asCPointerNotNull(bug_uri_snippet));
    }

    /**
     * Specify the base URI for bug reports.
     * <br>
     * <br>The base URI is used to construct bug report messages for
     * <br>g_test_message() when g_test_bug() is called.
     * <br>Calling this function outside of a test case sets the
     * <br>default base URI for all test cases. Calling it from within
     * <br>a test case changes the base URI for the scope of the test
     * <br>case only.
     * <br>Bug URIs are constructed by appending a bug specific URI
     * <br>portion to &#64;uri_pattern, or by replacing the special string
     * <br>`%s` within &#64;uri_pattern if that is present.
     * <br>
     * <br>If g_test_bug_base() is not called, bug URIs are formed solely
     * <br>from the value provided by g_test_bug().
     * @param uri_pattern the base pattern for bug URIs
    */
    public static void testBugBase(@Nonnull ch.bailu.gtk.type.Str uri_pattern)  {
        JnaGlib.INST().g_test_bug_base(asCPointerNotNull(uri_pattern));
    }

    /**
     * Creates the pathname to a data file that is required for a test.
     * <br>
     * <br>This function is conceptually similar to g_build_filename() except
     * <br>that the first argument has been replaced with a &#35;GTestFileType
     * <br>argument.
     * <br>
     * <br>The data file should either have been distributed with the module
     * <br>containing the test (%G_TEST_DIST) or built as part of the build
     * <br>system of that module (%G_TEST_BUILT).
     * <br>
     * <br>In order for this function to work in srcdir != builddir situations,
     * <br>the G_TEST_SRCDIR and G_TEST_BUILDDIR environment variables need to
     * <br>have been defined.  As of 2.38, this is done by the glib.mk
     * <br>included in GLib.  Please ensure that your copy is up to date before
     * <br>using this function.
     * <br>
     * <br>In case neither variable is set, this function will fall back to
     * <br>using the dirname portion of argv[0], possibly removing &quot;.libs&quot;.
     * <br>This allows for casual running of tests directly from the commandline
     * <br>in the srcdir == builddir case and should also support running of
     * <br>installed tests, assuming the data files have been installed in the
     * <br>same relative path as the test binary.
     * @param file_type the type of file (built vs. distributed)
     * @param first_path the first segment of the pathname
     * @param _elipse %NULL-terminated additional path segments
     * @return the path of the file, to be freed using g_free()
    */
    public static ch.bailu.gtk.type.Str testBuildFilename(int file_type, @Nonnull ch.bailu.gtk.type.Str first_path, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_test_build_filename(file_type, asCPointerNotNull(first_path), _elipse)));
    }

    /**
     * Create a new &#35;GTestCase, named &#64;test_name.
     * <br>
     * <br>This API is fairly low level, and calling g_test_add() or g_test_add_func()
     * <br>is preferable.
     * <br>
     * <br>When this test is executed, a fixture structure of size &#64;data_size
     * <br>will be automatically allocated and filled with zeros. Then &#64;data_setup is
     * <br>called to initialize the fixture. After fixture setup, the actual test
     * <br>function &#64;data_test is called. Once the test run completes, the
     * <br>fixture structure is torn down by calling &#64;data_teardown and
     * <br>after that the memory is automatically released by the test framework.
     * <br>
     * <br>Splitting up a test run into fixture setup, test function and
     * <br>fixture teardown is most useful if the same fixture type is used for
     * <br>multiple tests. In this cases, g_test_create_case() will be
     * <br>called with the same type of fixture (the &#64;data_size argument), but varying
     * <br>&#64;test_name and &#64;data_test arguments.
     * @param test_name the name for the test case
     * @param data_size the size of the fixture data structure
     * @param test_data test data argument for the test functions
     * @param data_setup the function to set up the fixture data
     * @param data_test the actual test function
     * @param data_teardown the function to teardown the fixture data
     * @return a newly allocated &#35;GTestCase.
    */
    public static TestCase testCreateCase(@Nonnull ch.bailu.gtk.type.Str test_name, long data_size, @Nullable ch.bailu.gtk.type.Pointer test_data, OnTestFixtureFunc data_setup, OnTestFixtureFunc data_test, OnTestFixtureFunc data_teardown)  {
        return new TestCase(new PointerContainer(JnaGlib.INST().g_test_create_case(asCPointerNotNull(test_name), data_size, asCPointer(test_data), toOnTestFixtureFunc(getClassHandler().getInstance(), "testCreateCase", data_setup), toOnTestFixtureFunc(getClassHandler().getInstance(), "testCreateCase", data_test), toOnTestFixtureFunc(getClassHandler().getInstance(), "testCreateCase", data_teardown))));
    }

    /**
     * Create a new test suite with the name &#64;suite_name.
     * @param suite_name a name for the suite
     * @return A newly allocated &#35;GTestSuite instance.
    */
    public static TestSuite testCreateSuite(@Nonnull ch.bailu.gtk.type.Str suite_name)  {
        return new TestSuite(new PointerContainer(JnaGlib.INST().g_test_create_suite(asCPointerNotNull(suite_name))));
    }

    /**
     * Indicates that a message with the given &#64;log_domain and &#64;log_level,
     * <br>with text matching &#64;pattern, is expected to be logged. When this
     * <br>message is logged, it will not be printed, and the test case will
     * <br>not abort.
     * <br>
     * <br>This API may only be used with the old logging API (g_log() without
     * <br>%G_LOG_USE_STRUCTURED defined). It will not work with the structured logging
     * <br>API. See [Testing for Messages][testing-for-messages].
     * <br>
     * <br>Use g_test_assert_expected_messages() to assert that all
     * <br>previously-expected messages have been seen and suppressed.
     * <br>
     * <br>You can call this multiple times in a row, if multiple messages are
     * <br>expected as a result of a single call. (The messages must appear in
     * <br>the same order as the calls to g_test_expect_message().)
     * <br>
     * <br>For example:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   // g_main_context_push_thread_default() should fail if the
     *   // context is already owned by another thread.
     *   g_test_expect_message (G_LOG_DOMAIN,
     *                          G_LOG_LEVEL_CRITICAL,
     *                          &quot;assertion*acquired_context*failed&quot;);
     *   g_main_context_push_thread_default (bad_context);
     *   g_test_assert_expected_messages ();
     * </pre>
     * <br>
     * <br>Note that you cannot use this to test g_error() messages, since
     * <br>g_error() intentionally never returns even if the program doesn't
     * <br>abort; use g_test_trap_subprocess() in this case.
     * <br>
     * <br>If messages at %G_LOG_LEVEL_DEBUG are emitted, but not explicitly
     * <br>expected via g_test_expect_message() then they will be ignored.
     * @param log_domain the log domain of the message
     * @param log_level the log level of the message
     * @param pattern a glob-style [pattern][glib-Glob-style-pattern-matching]
    */
    public static void testExpectMessage(@Nullable ch.bailu.gtk.type.Str log_domain, int log_level, @Nonnull ch.bailu.gtk.type.Str pattern)  {
        JnaGlib.INST().g_test_expect_message(asCPointer(log_domain), log_level, asCPointerNotNull(pattern));
    }

    /**
     * Indicates that a test failed. This function can be called
     * <br>multiple times from the same test. You can use this function
     * <br>if your test failed in a recoverable way.
     * <br>
     * <br>Do not use this function if the failure of a test could cause
     * <br>other tests to malfunction.
     * <br>
     * <br>Calling this function will not stop the test from running, you
     * <br>need to return from the test function yourself. So you can
     * <br>produce additional diagnostic messages or even continue running
     * <br>the test.
     * <br>
     * <br>If not called from inside a test, this function does nothing.
     * <br>
     * <br>Note that unlike g_test_skip() and g_test_incomplete(), this
     * <br>function does not log a message alongside the test failure.
     * <br>If details of the test failure are available, either log them with
     * <br>g_test_message() before g_test_fail(), or use g_test_fail_printf()
     * <br>instead.
    */
    public static void testFail()  {
        JnaGlib.INST().g_test_fail();
    }

    /**
     * Equivalent to g_test_fail(), but also record a message like
     * <br>g_test_skip_printf().
     * @param format the format string
     * @param _elipse printf-like arguments to &#64;format
    */
    public static void testFailPrintf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_fail_printf(asCPointerNotNull(format), _elipse);
    }

    /**
     * Returns whether a test has already failed. This will
     * <br>be the case when g_test_fail(), g_test_incomplete()
     * <br>or g_test_skip() have been called, but also if an
     * <br>assertion has failed.
     * <br>
     * <br>This can be useful to return early from a test if
     * <br>continuing after a failed assertion might be harmful.
     * <br>
     * <br>The return value of this function is only meaningful
     * <br>if it is called from inside a test function.
     * @return %TRUE if the test has failed
    */
    public static boolean testFailed()  {
        return JnaGlib.INST().g_test_failed();
    }

    /**
     * Gets the pathname of the directory containing test files of the type
     * <br>specified by &#64;file_type.
     * <br>
     * <br>This is approximately the same as calling g_test_build_filename(&quot;.&quot;),
     * <br>but you don't need to free the return value.
     * @param file_type the type of file (built vs. distributed)
     * @return the path of the directory, owned by GLib
    */
    public static ch.bailu.gtk.type.Str testGetDir(int file_type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_test_get_dir(file_type)));
    }

    /**
     * Gets the pathname to a data file that is required for a test.
     * <br>
     * <br>This is the same as g_test_build_filename() with two differences.
     * <br>The first difference is that you must only use this function from within
     * <br>a testcase function.  The second difference is that you need not free
     * <br>the return value — it will be automatically freed when the testcase
     * <br>finishes running.
     * <br>
     * <br>It is safe to use this function from a thread inside of a testcase
     * <br>but you must ensure that all such uses occur before the main testcase
     * <br>function returns (ie: it is best to ensure that all threads have been
     * <br>joined).
     * @param file_type the type of file (built vs. distributed)
     * @param first_path the first segment of the pathname
     * @param _elipse %NULL-terminated additional path segments
     * @return the path, automatically freed at the end of the testcase
    */
    public static ch.bailu.gtk.type.Str testGetFilename(int file_type, @Nonnull ch.bailu.gtk.type.Str first_path, java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_test_get_filename(file_type, asCPointerNotNull(first_path), _elipse)));
    }

    /**
     * Gets the test path for the test currently being run.
     * <br>
     * <br>In essence, it will be the same string passed as the first argument to
     * <br>e.g. g_test_add() when the test was added.
     * <br>
     * <br>This function returns a valid string only within a test function.
     * @return the test path for the test currently being run
    */
    public static ch.bailu.gtk.type.Str testGetPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_test_get_path()));
    }

    /**
     * Get the toplevel test suite for the test path API.
     * @return the toplevel &#35;GTestSuite
    */
    public static TestSuite testGetRoot()  {
        return new TestSuite(new PointerContainer(JnaGlib.INST().g_test_get_root()));
    }

    /**
     * Indicates that a test failed because of some incomplete
     * <br>functionality. This function can be called multiple times
     * <br>from the same test.
     * <br>
     * <br>Calling this function will not stop the test from running, you
     * <br>need to return from the test function yourself. So you can
     * <br>produce additional diagnostic messages or even continue running
     * <br>the test.
     * <br>
     * <br>If not called from inside a test, this function does nothing.
     * @param msg explanation
    */
    public static void testIncomplete(@Nullable ch.bailu.gtk.type.Str msg)  {
        JnaGlib.INST().g_test_incomplete(asCPointer(msg));
    }

    /**
     * Equivalent to g_test_incomplete(), but the explanation is formatted
     * <br>as if by g_strdup_printf().
     * @param format the format string
     * @param _elipse printf-like arguments to &#64;format
    */
    public static void testIncompletePrintf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_incomplete_printf(asCPointerNotNull(format), _elipse);
    }

    /**
     * Installs a non-error fatal log handler which can be
     * <br>used to decide whether log messages which are counted
     * <br>as fatal abort the program.
     * <br>
     * <br>The use case here is that you are running a test case
     * <br>that depends on particular libraries or circumstances
     * <br>and cannot prevent certain known critical or warning
     * <br>messages. So you install a handler that compares the
     * <br>domain and message to precisely not abort in such a case.
     * <br>
     * <br>Note that the handler is reset at the beginning of
     * <br>any test case, so you have to set it inside each test
     * <br>function which needs the special behavior.
     * <br>
     * <br>This handler has no effect on g_error messages.
     * <br>
     * <br>This handler also has no effect on structured log messages (using
     * <br>g_log_structured() or g_log_structured_array()). To change the fatal
     * <br>behaviour for specific log messages, programs must install a custom log
     * <br>writer function using g_log_set_writer_func().See
     * <br>[Using Structured Logging][using-structured-logging].
     * @param log_func the log handler function.
     * @param user_data data passed to the log handler.
    */
    public static void testLogSetFatalHandler(OnTestLogFatalFunc log_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaGlib.INST().g_test_log_set_fatal_handler(toOnTestLogFatalFunc(getClassHandler().getInstance(), "testLogSetFatalHandler", log_func), asCPointer(user_data));
    }

    /**
     * 
     * @param log_type 
     * @return 
    */
    public static ch.bailu.gtk.type.Str testLogTypeName(int log_type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_test_log_type_name(log_type)));
    }

    /**
     * Report the result of a performance or measurement test.
     * <br>The test should generally strive to maximize the reported
     * <br>quantities (larger values are better than smaller ones),
     * <br>this and &#64;maximized_quantity can determine sorting
     * <br>order for test result reports.
     * @param maximized_quantity the reported value
     * @param format the format string of the report message
     * @param _elipse arguments to pass to the printf() function
    */
    public static void testMaximizedResult(double maximized_quantity, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_maximized_result(maximized_quantity, asCPointerNotNull(format), _elipse);
    }

    /**
     * Add a message to the test report.
     * @param format the format string
     * @param _elipse printf-like arguments to &#64;format
    */
    public static void testMessage(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_message(asCPointerNotNull(format), _elipse);
    }

    /**
     * Report the result of a performance or measurement test.
     * <br>The test should generally strive to minimize the reported
     * <br>quantities (smaller values are better than larger ones),
     * <br>this and &#64;minimized_quantity can determine sorting
     * <br>order for test result reports.
     * @param minimized_quantity the reported value
     * @param format the format string of the report message
     * @param _elipse arguments to pass to the printf() function
    */
    public static void testMinimizedResult(double minimized_quantity, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_minimized_result(minimized_quantity, asCPointerNotNull(format), _elipse);
    }

    /**
     * This function enqueus a callback &#64;destroy_func to be executed
     * <br>during the next test case teardown phase. This is most useful
     * <br>to auto destruct allocated test resources at the end of a test run.
     * <br>Resources are released in reverse queue order, that means enqueueing
     * <br>callback A before callback B will cause B() to be called before
     * <br>A() during teardown.
     * @param destroy_func Destroy callback for teardown phase.
     * @param destroy_data Destroy callback data.
    */
    public static void testQueueDestroy(OnDestroyNotify destroy_func, @Nullable ch.bailu.gtk.type.Pointer destroy_data)  {
        JnaGlib.INST().g_test_queue_destroy(toOnDestroyNotify(getClassHandler().getInstance(), "testQueueDestroy", destroy_func), asCPointer(destroy_data));
    }

    /**
     * Enqueue a pointer to be released with g_free() during the next
     * <br>teardown phase. This is equivalent to calling g_test_queue_destroy()
     * <br>with a destroy callback of g_free().
     * @param gfree_pointer the pointer to be stored.
    */
    public static void testQueueFree(@Nullable ch.bailu.gtk.type.Pointer gfree_pointer)  {
        JnaGlib.INST().g_test_queue_free(asCPointer(gfree_pointer));
    }

    /**
     * Get a reproducible random floating point number,
     * <br>see g_test_rand_int() for details on test case random numbers.
     * @return a random number from the seeded random number generator.
    */
    public static double testRandDouble()  {
        return JnaGlib.INST().g_test_rand_double();
    }

    /**
     * Get a reproducible random floating pointer number out of a specified range,
     * <br>see g_test_rand_int() for details on test case random numbers.
     * @param range_start the minimum value returned by this function
     * @param range_end the minimum value not returned by this function
     * @return a number with &#64;range_start &lt;= number &lt; &#64;range_end.
    */
    public static double testRandDoubleRange(double range_start, double range_end)  {
        return JnaGlib.INST().g_test_rand_double_range(range_start, range_end);
    }

    /**
     * Get a reproducible random integer number.
     * <br>
     * <br>The random numbers generated by the g_test_rand_*() family of functions
     * <br>change with every new test program start, unless the --seed option is
     * <br>given when starting test programs.
     * <br>
     * <br>For individual test cases however, the random number generator is
     * <br>reseeded, to avoid dependencies between tests and to make --seed
     * <br>effective for all test cases.
     * @return a random number from the seeded random number generator.
    */
    public static int testRandInt()  {
        return JnaGlib.INST().g_test_rand_int();
    }

    /**
     * Get a reproducible random integer number out of a specified range,
     * <br>see g_test_rand_int() for details on test case random numbers.
     * @param begin the minimum value returned by this function
     * @param end the smallest value not to be returned by this function
     * @return a number with &#64;begin &lt;= number &lt; &#64;end.
    */
    public static int testRandIntRange(int begin, int end)  {
        return JnaGlib.INST().g_test_rand_int_range(begin, end);
    }

    /**
     * Runs all tests under the toplevel suite which can be retrieved
     * <br>with g_test_get_root(). Similar to g_test_run_suite(), the test
     * <br>cases to be run are filtered according to test path arguments
     * <br>(`-p testpath` and `-s testpath`) as parsed by g_test_init().
     * <br>g_test_run_suite() or g_test_run() may only be called once in a
     * <br>program.
     * <br>
     * <br>In general, the tests and sub-suites within each suite are run in
     * <br>the order in which they are defined. However, note that prior to
     * <br>GLib 2.36, there was a bug in the `g_test_add_*`
     * <br>functions which caused them to create multiple suites with the same
     * <br>name, meaning that if you created tests &quot;/foo/simple&quot;,
     * <br>&quot;/bar/simple&quot;, and &quot;/foo/using-bar&quot; in that order, they would get
     * <br>run in that order (since g_test_run() would run the first &quot;/foo&quot;
     * <br>suite, then the &quot;/bar&quot; suite, then the second &quot;/foo&quot; suite). As of
     * <br>2.36, this bug is fixed, and adding the tests in that order would
     * <br>result in a running order of &quot;/foo/simple&quot;, &quot;/foo/using-bar&quot;,
     * <br>&quot;/bar/simple&quot;. If this new ordering is sub-optimal (because it puts
     * <br>more-complicated tests before simpler ones, making it harder to
     * <br>figure out exactly what has failed), you can fix it by changing the
     * <br>test paths to group tests by suite in a way that will result in the
     * <br>desired running order. Eg, &quot;/simple/foo&quot;, &quot;/simple/bar&quot;,
     * <br>&quot;/complex/foo-using-bar&quot;.
     * <br>
     * <br>However, you should never make the actual result of a test depend
     * <br>on the order that tests are run in. If you need to ensure that some
     * <br>particular code runs before or after a given test case, use
     * <br>g_test_add(), which lets you specify setup and teardown functions.
     * <br>
     * <br>If all tests are skipped or marked as incomplete (expected failures),
     * <br>this function will return 0 if producing TAP output, or 77 (treated
     * <br>as &quot;skip test&quot; by Automake) otherwise.
     * @return 0 on success, 1 on failure (assuming it returns at all),   0 or 77 if all tests were skipped with g_test_skip() and/or   g_test_incomplete()
    */
    public static int testRun()  {
        return JnaGlib.INST().g_test_run();
    }

    /**
     * Execute the tests within &#64;suite and all nested &#35;GTestSuites.
     * <br>The test suites to be executed are filtered according to
     * <br>test path arguments (`-p testpath` and `-s testpath`) as parsed by
     * <br>g_test_init(). See the g_test_run() documentation for more
     * <br>information on the order that tests are run in.
     * <br>
     * <br>g_test_run_suite() or g_test_run() may only be called once
     * <br>in a program.
     * @param suite a &#35;GTestSuite
     * @return 0 on success
    */
    public static int testRunSuite(@Nonnull TestSuite suite)  {
        return JnaGlib.INST().g_test_run_suite(asCPointerNotNull(suite));
    }

    /**
     * Changes the behaviour of the various `g_assert_*()` macros,
     * <br>g_test_assert_expected_messages() and the various
     * <br>`g_test_trap_assert_*()` macros to not abort to program, but instead
     * <br>call g_test_fail() and continue. (This also changes the behavior of
     * <br>g_test_fail() so that it will not cause the test program to abort
     * <br>after completing the failed test.)
     * <br>
     * <br>Note that the g_assert_not_reached() and g_assert() macros are not
     * <br>affected by this.
     * <br>
     * <br>This function can only be called after g_test_init().
    */
    public static void testSetNonfatalAssertions()  {
        JnaGlib.INST().g_test_set_nonfatal_assertions();
    }

    /**
     * Indicates that a test was skipped.
     * <br>
     * <br>Calling this function will not stop the test from running, you
     * <br>need to return from the test function yourself. So you can
     * <br>produce additional diagnostic messages or even continue running
     * <br>the test.
     * <br>
     * <br>If not called from inside a test, this function does nothing.
     * @param msg explanation
    */
    public static void testSkip(@Nullable ch.bailu.gtk.type.Str msg)  {
        JnaGlib.INST().g_test_skip(asCPointer(msg));
    }

    /**
     * Equivalent to g_test_skip(), but the explanation is formatted
     * <br>as if by g_strdup_printf().
     * @param format the format string
     * @param _elipse printf-like arguments to &#64;format
    */
    public static void testSkipPrintf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGlib.INST().g_test_skip_printf(asCPointerNotNull(format), _elipse);
    }

    /**
     * Returns %TRUE (after g_test_init() has been called) if the test
     * <br>program is running under g_test_trap_subprocess().
     * @return %TRUE if the test program is running under g_test_trap_subprocess().
    */
    public static boolean testSubprocess()  {
        return JnaGlib.INST().g_test_subprocess();
    }

    /**
     * Set the summary for a test, which describes what the test checks, and how it
     * <br>goes about checking it. This may be included in test report output, and is
     * <br>useful documentation for anyone reading the source code or modifying a test
     * <br>in future. It must be a single line.
     * <br>
     * <br>This should be called at the top of a test function.
     * <br>
     * <br>For example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static void
     * test_array_sort (void)
     * {
     *   g_test_summary (&quot;Test my_array_sort() sorts the array correctly and stably, &quot;
     *                   &quot;including testing zero length and one-element arrays.&quot;);
     * 
     *   …
     * }
     * </pre>
     * @param summary One or two sentences summarising what the test checks, and how it    checks it.
    */
    public static void testSummary(@Nonnull ch.bailu.gtk.type.Str summary)  {
        JnaGlib.INST().g_test_summary(asCPointerNotNull(summary));
    }

    /**
     * Get the number of seconds since the last start of the timer with
     * <br>g_test_timer_start().
     * @return the time since the last start of the timer in seconds, as a double
    */
    public static double testTimerElapsed()  {
        return JnaGlib.INST().g_test_timer_elapsed();
    }

    /**
     * Report the last result of g_test_timer_elapsed().
     * @return the last result of g_test_timer_elapsed(), as a double
    */
    public static double testTimerLast()  {
        return JnaGlib.INST().g_test_timer_last();
    }

    /**
     * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
     * <br>to be done. Call this function again to restart the timer.
    */
    public static void testTimerStart()  {
        JnaGlib.INST().g_test_timer_start();
    }

    /**
     * 
     * @param domain 
     * @param file 
     * @param line 
     * @param func 
     * @param assertion_flags 
     * @param pattern 
    */
    public static void testTrapAssertions(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, long assertion_flags, @Nonnull ch.bailu.gtk.type.Str pattern)  {
        JnaGlib.INST().g_test_trap_assertions(asCPointerNotNull(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), assertion_flags, asCPointerNotNull(pattern));
    }

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     * @return %TRUE if the last test subprocess terminated successfully.
    */
    public static boolean testTrapHasPassed()  {
        return JnaGlib.INST().g_test_trap_has_passed();
    }

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     * @return %TRUE if the last test subprocess got killed due to a timeout.
    */
    public static boolean testTrapReachedTimeout()  {
        return JnaGlib.INST().g_test_trap_reached_timeout();
    }

    /**
     * Respawns the test program to run only &#64;test_path in a subprocess.
     * <br>This can be used for a test case that might not return, or that
     * <br>might abort.
     * <br>
     * <br>If &#64;test_path is %NULL then the same test is re-run in a subprocess.
     * <br>You can use g_test_subprocess() to determine whether the test is in
     * <br>a subprocess or not.
     * <br>
     * <br>&#64;test_path can also be the name of the parent test, followed by
     * <br>&quot;`/subprocess/`&quot; and then a name for the specific subtest (or just
     * <br>ending with &quot;`/subprocess`&quot; if the test only has one child test);
     * <br>tests with names of this form will automatically be skipped in the
     * <br>parent process.
     * <br>
     * <br>If &#64;usec_timeout is non-0, the test subprocess is aborted and
     * <br>considered failing if its run time exceeds it.
     * <br>
     * <br>The subprocess behavior can be configured with the
     * <br>&#35;GTestSubprocessFlags flags.
     * <br>
     * <br>You can use methods such as g_test_trap_assert_passed(),
     * <br>g_test_trap_assert_failed(), and g_test_trap_assert_stderr() to
     * <br>check the results of the subprocess. (But note that
     * <br>g_test_trap_assert_stdout() and g_test_trap_assert_stderr()
     * <br>cannot be used if &#64;test_flags specifies that the child should
     * <br>inherit the parent stdout/stderr.)
     * <br>
     * <br>If your `main ()` needs to behave differently in
     * <br>the subprocess, you can call g_test_subprocess() (after calling
     * <br>g_test_init()) to see whether you are in a subprocess.
     * <br>
     * <br>The following example tests that calling
     * <br>`my_object_new(1000000)` will abort with an error
     * <br>message.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   static void
     *   test_create_large_object (void)
     *   {
     *     if (g_test_subprocess ())
     *       {
     *         my_object_new (1000000);
     *         return;
     *       }
     * 
     *     // Reruns this same test in a subprocess
     *     g_test_trap_subprocess (NULL, 0, G_TEST_SUBPROCESS_DEFAULT);
     *     g_test_trap_assert_failed ();
     *     g_test_trap_assert_stderr (&quot;*ERROR*too large*&quot;);
     *   }
     * 
     *   int
     *   main (int argc, char **argv)
     *   {
     *     g_test_init (&amp;argc, &amp;argv, NULL);
     * 
     *     g_test_add_func (&quot;/myobject/create_large_object&quot;,
     *                      test_create_large_object);
     *     return g_test_run ();
     *   }
     * </pre>
     * @param test_path Test to run in a subprocess
     * @param usec_timeout Timeout for the subprocess test in micro seconds.
     * @param test_flags Flags to modify subprocess behaviour.
    */
    public static void testTrapSubprocess(@Nullable ch.bailu.gtk.type.Str test_path, long usec_timeout, int test_flags)  {
        JnaGlib.INST().g_test_trap_subprocess(asCPointer(test_path), usec_timeout, test_flags);
    }

    /**
     * 
     * @return 
    */
    public static int threadErrorQuark()  {
        return JnaGlib.INST().g_thread_error_quark();
    }

    /**
     * Terminates the current thread.
     * <br>
     * <br>If another thread is waiting for us using g_thread_join() then the
     * <br>waiting thread will be woken up and get &#64;retval as the return value
     * <br>of g_thread_join().
     * <br>
     * <br>Calling g_thread_exit() with a parameter &#64;retval is equivalent to
     * <br>returning &#64;retval from the function &#64;func, as given to g_thread_new().
     * <br>
     * <br>You must only call g_thread_exit() from a thread that you created
     * <br>yourself with g_thread_new() or related APIs. You must not call
     * <br>this function from a thread created with another threading library
     * <br>or or from within a &#35;GThreadPool.
     * @param retval the return value of this thread
    */
    public static void threadExit(@Nullable ch.bailu.gtk.type.Pointer retval)  {
        JnaGlib.INST().g_thread_exit(asCPointer(retval));
    }

    /**
     * This function will return the maximum &#64;interval that a
     * <br>thread will wait in the thread pool for new tasks before
     * <br>being stopped.
     * <br>
     * <br>If this function returns 0, threads waiting in the thread
     * <br>pool for new work are not stopped.
     * @return the maximum &#64;interval (milliseconds) to wait     for new tasks in the thread pool before stopping the     thread
    */
    public static int threadPoolGetMaxIdleTime()  {
        return JnaGlib.INST().g_thread_pool_get_max_idle_time();
    }

    /**
     * Returns the maximal allowed number of unused threads.
     * @return the maximal number of unused threads
    */
    public static int threadPoolGetMaxUnusedThreads()  {
        return JnaGlib.INST().g_thread_pool_get_max_unused_threads();
    }

    /**
     * Returns the number of currently unused threads.
     * @return the number of currently unused threads
    */
    public static int threadPoolGetNumUnusedThreads()  {
        return JnaGlib.INST().g_thread_pool_get_num_unused_threads();
    }

    /**
     * This function will set the maximum &#64;interval that a thread
     * <br>waiting in the pool for new tasks can be idle for before
     * <br>being stopped. This function is similar to calling
     * <br>g_thread_pool_stop_unused_threads() on a regular timeout,
     * <br>except this is done on a per thread basis.
     * <br>
     * <br>By setting &#64;interval to 0, idle threads will not be stopped.
     * <br>
     * <br>The default value is 15000 (15 seconds).
     * @param interval the maximum &#64;interval (in milliseconds)     a thread can be idle
    */
    public static void threadPoolSetMaxIdleTime(int interval)  {
        JnaGlib.INST().g_thread_pool_set_max_idle_time(interval);
    }

    /**
     * Sets the maximal number of unused threads to &#64;max_threads.
     * <br>If &#64;max_threads is -1, no limit is imposed on the number
     * <br>of unused threads.
     * <br>
     * <br>The default value is 2.
     * @param max_threads maximal number of unused threads
    */
    public static void threadPoolSetMaxUnusedThreads(int max_threads)  {
        JnaGlib.INST().g_thread_pool_set_max_unused_threads(max_threads);
    }

    /**
     * Stops all currently unused threads. This does not change the
     * <br>maximal number of unused threads. This function can be used to
     * <br>regularly stop all unused threads e.g. from g_timeout_add().
    */
    public static void threadPoolStopUnusedThreads()  {
        JnaGlib.INST().g_thread_pool_stop_unused_threads();
    }

    /**
     * This function returns the &#35;GThread corresponding to the
     * <br>current thread. Note that this function does not increase
     * <br>the reference count of the returned struct.
     * <br>
     * <br>This function will return a &#35;GThread even for threads that
     * <br>were not created by GLib (i.e. those created by other threading
     * <br>APIs). This may be useful for thread identification purposes
     * <br>(i.e. comparisons) but you must not use GLib functions (such
     * <br>as g_thread_join()) on these threads.
     * @return the &#35;GThread representing the current thread
    */
    public static Thread threadSelf()  {
        return new Thread(new PointerContainer(JnaGlib.INST().g_thread_self()));
    }

    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * <br>that other threads can run.
     * <br>
     * <br>This function is often used as a method to make busy wait less evil.
    */
    public static void threadYield()  {
        JnaGlib.INST().g_thread_yield();
    }

    /**
     * Sets a function to be called at regular intervals, with the default
     * <br>priority, %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The given &#64;function is called repeatedly until it returns %G_SOURCE_REMOVE
     * <br>or %FALSE, at which point the timeout is automatically destroyed and the
     * <br>function will not be called again. The first call to the function will be
     * <br>at the end of the first &#64;interval.
     * <br>
     * <br>Note that timeout functions may be delayed, due to the processing of other
     * <br>event sources. Thus they should not be relied on for precise timing.
     * <br>After each call to the timeout function, the time of the next
     * <br>timeout is recalculated based on the current time and the given interval
     * <br>(it does not try to 'catch up' time lost in delays).
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>If you want to have a timer in the &quot;seconds&quot; range and do not care
     * <br>about the exact time of the first call of the timer, use the
     * <br>g_timeout_add_seconds() function; this function allows for more
     * <br>optimizations and more efficient system power usage.
     * <br>
     * <br>This internally creates a main loop source using g_timeout_source_new()
     * <br>and attaches it to the global &#35;GMainContext using g_source_attach(), so
     * <br>the callback will be invoked in whichever thread is running that main
     * <br>context. You can do these steps manually if you need greater control or to
     * <br>use a custom main context.
     * <br>
     * <br>It is safe to call this function from any thread.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock
     * <br>time.  See g_get_monotonic_time().
     * @param interval the time between calls to the function, in milliseconds    (1/1000ths of a second)
     * @param function function to call
     * @param data data to pass to &#64;function
     * @return the ID (greater than 0) of the event source.
    */
    public static int timeoutAdd(int interval, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_timeout_add(interval, toOnSourceFunc(getClassHandler().getInstance(), "timeoutAdd", function), asCPointer(data));
    }

    /**
     * Sets a function to be called at regular intervals, with the given
     * <br>priority.  The function is called repeatedly until it returns
     * <br>%FALSE, at which point the timeout is automatically destroyed and
     * <br>the function will not be called again.  The &#64;notify function is
     * <br>called when the timeout is destroyed.  The first call to the
     * <br>function will be at the end of the first &#64;interval.
     * <br>
     * <br>Note that timeout functions may be delayed, due to the processing of other
     * <br>event sources. Thus they should not be relied on for precise timing.
     * <br>After each call to the timeout function, the time of the next
     * <br>timeout is recalculated based on the current time and the given interval
     * <br>(it does not try to 'catch up' time lost in delays).
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>This internally creates a main loop source using g_timeout_source_new()
     * <br>and attaches it to the global &#35;GMainContext using g_source_attach(), so
     * <br>the callback will be invoked in whichever thread is running that main
     * <br>context. You can do these steps manually if you need greater control or to
     * <br>use a custom main context.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock time.
     * <br>See g_get_monotonic_time().
     * @param priority the priority of the timeout source. Typically this will be in   the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param interval the time between calls to the function, in milliseconds   (1/1000ths of a second)
     * @param function function to call
     * @param data data to pass to &#64;function
     * @param notify function to call when the timeout is removed, or %NULL
     * @return the ID (greater than 0) of the event source.
    */
    public static int timeoutAddFull(int priority, int interval, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_timeout_add_full(priority, interval, toOnSourceFunc(getClassHandler().getInstance(), "timeoutAddFull", function), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "timeoutAddFull", notify));
    }

    /**
     * Sets a function to be called after &#64;interval milliseconds have elapsed,
     * <br>with the default priority, %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The given &#64;function is called once and then the source will be automatically
     * <br>removed from the main context.
     * <br>
     * <br>This function otherwise behaves like g_timeout_add().
     * @param interval the time after which the function will be called, in   milliseconds (1/1000ths of a second)
     * @param function function to call
     * @param data data to pass to &#64;function
     * @return the ID (greater than 0) of the event source
    */
    public static int timeoutAddOnce(int interval, OnSourceOnceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_timeout_add_once(interval, toOnSourceOnceFunc(getClassHandler().getInstance(), "timeoutAddOnce", function), asCPointer(data));
    }

    /**
     * Sets a function to be called at regular intervals with the default
     * <br>priority, %G_PRIORITY_DEFAULT.
     * <br>
     * <br>The function is called repeatedly until it returns %G_SOURCE_REMOVE
     * <br>or %FALSE, at which point the timeout is automatically destroyed
     * <br>and the function will not be called again.
     * <br>
     * <br>This internally creates a main loop source using
     * <br>g_timeout_source_new_seconds() and attaches it to the main loop context
     * <br>using g_source_attach(). You can do these steps manually if you need
     * <br>greater control. Also see g_timeout_add_seconds_full().
     * <br>
     * <br>It is safe to call this function from any thread.
     * <br>
     * <br>Note that the first call of the timer may not be precise for timeouts
     * <br>of one second. If you need finer precision and have such a timeout,
     * <br>you may want to use g_timeout_add() instead.
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock
     * <br>time.  See g_get_monotonic_time().
     * @param interval the time between calls to the function, in seconds
     * @param function function to call
     * @param data data to pass to &#64;function
     * @return the ID (greater than 0) of the event source.
    */
    public static int timeoutAddSeconds(int interval, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGlib.INST().g_timeout_add_seconds(interval, toOnSourceFunc(getClassHandler().getInstance(), "timeoutAddSeconds", function), asCPointer(data));
    }

    /**
     * Sets a function to be called at regular intervals, with &#64;priority.
     * <br>
     * <br>The function is called repeatedly until it returns %G_SOURCE_REMOVE
     * <br>or %FALSE, at which point the timeout is automatically destroyed and
     * <br>the function will not be called again.
     * <br>
     * <br>Unlike g_timeout_add(), this function operates at whole second granularity.
     * <br>The initial starting point of the timer is determined by the implementation
     * <br>and the implementation is expected to group multiple timers together so that
     * <br>they fire all at the same time. To allow this grouping, the &#64;interval to the
     * <br>first timer is rounded and can deviate up to one second from the specified
     * <br>interval. Subsequent timer iterations will generally run at the specified
     * <br>interval.
     * <br>
     * <br>Note that timeout functions may be delayed, due to the processing of other
     * <br>event sources. Thus they should not be relied on for precise timing.
     * <br>After each call to the timeout function, the time of the next
     * <br>timeout is recalculated based on the current time and the given &#64;interval
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle the return value and memory management of &#64;data.
     * <br>
     * <br>If you want timing more precise than whole seconds, use g_timeout_add()
     * <br>instead.
     * <br>
     * <br>The grouping of timers to fire at the same time results in a more power
     * <br>and CPU efficient behavior so if your timer is in multiples of seconds
     * <br>and you don't require the first timer exactly one second from now, the
     * <br>use of g_timeout_add_seconds() is preferred over g_timeout_add().
     * <br>
     * <br>This internally creates a main loop source using
     * <br>g_timeout_source_new_seconds() and attaches it to the main loop context
     * <br>using g_source_attach(). You can do these steps manually if you need
     * <br>greater control.
     * <br>
     * <br>It is safe to call this function from any thread.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock
     * <br>time.  See g_get_monotonic_time().
     * @param priority the priority of the timeout source. Typically this will be in   the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param interval the time between calls to the function, in seconds
     * @param function function to call
     * @param data data to pass to &#64;function
     * @param notify function to call when the timeout is removed, or %NULL
     * @return the ID (greater than 0) of the event source.
    */
    public static int timeoutAddSecondsFull(int priority, int interval, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_timeout_add_seconds_full(priority, interval, toOnSourceFunc(getClassHandler().getInstance(), "timeoutAddSecondsFull", function), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "timeoutAddSecondsFull", notify));
    }

    /**
     * Creates a new timeout source.
     * <br>
     * <br>The source will not initially be associated with any &#35;GMainContext
     * <br>and must be added to one with g_source_attach() before it will be
     * <br>executed.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock
     * <br>time.  See g_get_monotonic_time().
     * @param interval the timeout interval in milliseconds.
     * @return the newly-created timeout source
    */
    public static Source timeoutSourceNew(int interval)  {
        return new Source(new PointerContainer(JnaGlib.INST().g_timeout_source_new(interval)));
    }

    /**
     * Creates a new timeout source.
     * <br>
     * <br>The source will not initially be associated with any &#35;GMainContext
     * <br>and must be added to one with g_source_attach() before it will be
     * <br>executed.
     * <br>
     * <br>The scheduling granularity/accuracy of this timeout source will be
     * <br>in seconds.
     * <br>
     * <br>The interval given is in terms of monotonic time, not wall clock time.
     * <br>See g_get_monotonic_time().
     * @param interval the timeout interval in seconds
     * @return the newly-created timeout source
    */
    public static Source timeoutSourceNewSeconds(int interval)  {
        return new Source(new PointerContainer(JnaGlib.INST().g_timeout_source_new_seconds(interval)));
    }

    /**
     * Attempts to allocate &#64;n_bytes, and returns %NULL on failure.
     * <br>Contrast with g_malloc(), which aborts the program on failure.
     * @param n_bytes number of bytes to allocate.
     * @return the allocated memory, or %NULL.
    */
    public static ch.bailu.gtk.type.Pointer tryMalloc(long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_malloc(n_bytes)));
    }

    /**
     * Attempts to allocate &#64;n_bytes, initialized to 0's, and returns %NULL on
     * <br>failure. Contrast with g_malloc0(), which aborts the program on failure.
     * @param n_bytes number of bytes to allocate
     * @return the allocated memory, or %NULL
    */
    public static ch.bailu.gtk.type.Pointer tryMalloc0(long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_malloc0(n_bytes)));
    }

    /**
     * This function is similar to g_try_malloc0(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return the allocated memory, or %NULL
    */
    public static ch.bailu.gtk.type.Pointer tryMalloc0N(long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_malloc0_n(n_blocks, n_block_bytes)));
    }

    /**
     * This function is similar to g_try_malloc(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return the allocated memory, or %NULL.
    */
    public static ch.bailu.gtk.type.Pointer tryMallocN(long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_malloc_n(n_blocks, n_block_bytes)));
    }

    /**
     * Attempts to realloc &#64;mem to a new size, &#64;n_bytes, and returns %NULL
     * <br>on failure. Contrast with g_realloc(), which aborts the program
     * <br>on failure.
     * <br>
     * <br>If &#64;mem is %NULL, behaves the same as g_try_malloc().
     * @param mem previously-allocated memory, or %NULL.
     * @param n_bytes number of bytes to allocate.
     * @return the allocated memory, or %NULL.
    */
    public static ch.bailu.gtk.type.Pointer tryRealloc(@Nullable ch.bailu.gtk.type.Pointer mem, long n_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_realloc(asCPointer(mem), n_bytes)));
    }

    /**
     * This function is similar to g_try_realloc(), allocating (&#64;n_blocks * &#64;n_block_bytes) bytes,
     * <br>but care is taken to detect possible overflow during multiplication.
     * @param mem previously-allocated memory, or %NULL.
     * @param n_blocks the number of blocks to allocate
     * @param n_block_bytes the size of each block in bytes
     * @return the allocated memory, or %NULL.
    */
    public static ch.bailu.gtk.type.Pointer tryReallocN(@Nullable ch.bailu.gtk.type.Pointer mem, long n_blocks, long n_block_bytes)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGlib.INST().g_try_realloc_n(asCPointer(mem), n_blocks, n_block_bytes)));
    }

    /**
     * Determines the break type of &#64;c. &#64;c should be a Unicode character
     * <br>(to derive a character from UTF-8 encoded text, use
     * <br>g_utf8_get_char()). The break type is used to find word and line
     * <br>breaks (&quot;text boundaries&quot;), Pango implements the Unicode boundary
     * <br>resolution algorithms and normally you would use a function such
     * <br>as pango_break() instead of caring about break types yourself.
     * @param c a Unicode character
     * @return the break type of &#64;c
    */
    public static int unicharBreakType(byte c)  {
        return JnaGlib.INST().g_unichar_break_type(c);
    }

    /**
     * Determines the canonical combining class of a Unicode character.
     * @param uc a Unicode character
     * @return the combining class of the character
    */
    public static int unicharCombiningClass(byte uc)  {
        return JnaGlib.INST().g_unichar_combining_class(uc);
    }

    /**
     * Determines the numeric value of a character as a decimal
     * <br>digit.
     * @param c a Unicode character
     * @return If &#64;c is a decimal digit (according to g_unichar_isdigit()), its numeric value. Otherwise, -1.
    */
    public static int unicharDigitValue(byte c)  {
        return JnaGlib.INST().g_unichar_digit_value(c);
    }

    /**
     * Looks up the &#35;GUnicodeScript for a particular character (as defined
     * <br>by Unicode Standard Annex &#92;&#35;24). No check is made for &#64;ch being a
     * <br>valid Unicode character; if you pass in invalid character, the
     * <br>result is undefined.
     * <br>
     * <br>This function is equivalent to pango_script_for_unichar() and the
     * <br>two are interchangeable.
     * @param ch a Unicode character
     * @return the &#35;GUnicodeScript for the character.
    */
    public static int unicharGetScript(byte ch)  {
        return JnaGlib.INST().g_unichar_get_script(ch);
    }

    /**
     * Determines whether a character is alphanumeric.
     * <br>Given some UTF-8 text, obtain a character value
     * <br>with g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is an alphanumeric character
    */
    public static boolean unicharIsalnum(byte c)  {
        return JnaGlib.INST().g_unichar_isalnum(c);
    }

    /**
     * Determines whether a character is alphabetic (i.e. a letter).
     * <br>Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is an alphabetic character
    */
    public static boolean unicharIsalpha(byte c)  {
        return JnaGlib.INST().g_unichar_isalpha(c);
    }

    /**
     * Determines whether a character is a control character.
     * <br>Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a control character
    */
    public static boolean unicharIscntrl(byte c)  {
        return JnaGlib.INST().g_unichar_iscntrl(c);
    }

    /**
     * Determines if a given character is assigned in the Unicode
     * <br>standard.
     * @param c a Unicode character
     * @return %TRUE if the character has an assigned value
    */
    public static boolean unicharIsdefined(byte c)  {
        return JnaGlib.INST().g_unichar_isdefined(c);
    }

    /**
     * Determines whether a character is numeric (i.e. a digit).  This
     * <br>covers ASCII 0-9 and also digits in other languages/scripts.  Given
     * <br>some UTF-8 text, obtain a character value with g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a digit
    */
    public static boolean unicharIsdigit(byte c)  {
        return JnaGlib.INST().g_unichar_isdigit(c);
    }

    /**
     * Determines whether a character is printable and not a space
     * <br>(returns %FALSE for control characters, format characters, and
     * <br>spaces). g_unichar_isprint() is similar, but returns %TRUE for
     * <br>spaces. Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is printable unless it's a space
    */
    public static boolean unicharIsgraph(byte c)  {
        return JnaGlib.INST().g_unichar_isgraph(c);
    }

    /**
     * Determines whether a character is a lowercase letter.
     * <br>Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a lowercase letter
    */
    public static boolean unicharIslower(byte c)  {
        return JnaGlib.INST().g_unichar_islower(c);
    }

    /**
     * Determines whether a character is a mark (non-spacing mark,
     * <br>combining mark, or enclosing mark in Unicode speak).
     * <br>Given some UTF-8 text, obtain a character value
     * <br>with g_utf8_get_char().
     * <br>
     * <br>Note: in most cases where isalpha characters are allowed,
     * <br>ismark characters should be allowed to as they are essential
     * <br>for writing most European languages as well as many non-Latin
     * <br>scripts.
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a mark character
    */
    public static boolean unicharIsmark(byte c)  {
        return JnaGlib.INST().g_unichar_ismark(c);
    }

    /**
     * Determines whether a character is printable.
     * <br>Unlike g_unichar_isgraph(), returns %TRUE for spaces.
     * <br>Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is printable
    */
    public static boolean unicharIsprint(byte c)  {
        return JnaGlib.INST().g_unichar_isprint(c);
    }

    /**
     * Determines whether a character is punctuation or a symbol.
     * <br>Given some UTF-8 text, obtain a character value with
     * <br>g_utf8_get_char().
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a punctuation or symbol character
    */
    public static boolean unicharIspunct(byte c)  {
        return JnaGlib.INST().g_unichar_ispunct(c);
    }

    /**
     * Determines whether a character is a space, tab, or line separator
     * <br>(newline, carriage return, etc.).  Given some UTF-8 text, obtain a
     * <br>character value with g_utf8_get_char().
     * <br>
     * <br>(Note: don't use this to do word breaking; you have to use
     * <br>Pango or equivalent to get word breaking right, the algorithm
     * <br>is fairly complex.)
     * @param c a Unicode character
     * @return %TRUE if &#64;c is a space character
    */
    public static boolean unicharIsspace(byte c)  {
        return JnaGlib.INST().g_unichar_isspace(c);
    }

    /**
     * Determines if a character is titlecase. Some characters in
     * <br>Unicode which are composites, such as the DZ digraph
     * <br>have three case variants instead of just two. The titlecase
     * <br>form is used at the beginning of a word where only the
     * <br>first letter is capitalized. The titlecase form of the DZ
     * <br>digraph is U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
     * @param c a Unicode character
     * @return %TRUE if the character is titlecase
    */
    public static boolean unicharIstitle(byte c)  {
        return JnaGlib.INST().g_unichar_istitle(c);
    }

    /**
     * Determines if a character is uppercase.
     * @param c a Unicode character
     * @return %TRUE if &#64;c is an uppercase character
    */
    public static boolean unicharIsupper(byte c)  {
        return JnaGlib.INST().g_unichar_isupper(c);
    }

    /**
     * Determines if a character is typically rendered in a double-width
     * <br>cell.
     * @param c a Unicode character
     * @return %TRUE if the character is wide
    */
    public static boolean unicharIswide(byte c)  {
        return JnaGlib.INST().g_unichar_iswide(c);
    }

    /**
     * Determines if a character is typically rendered in a double-width
     * <br>cell under legacy East Asian locales.  If a character is wide according to
     * <br>g_unichar_iswide(), then it is also reported wide with this function, but
     * <br>the converse is not necessarily true. See the
     * <br>[Unicode Standard Annex &#35;11](http://www.unicode.org/reports/tr11/)
     * <br>for details.
     * <br>
     * <br>If a character passes the g_unichar_iswide() test then it will also pass
     * <br>this test, but not the other way around.  Note that some characters may
     * <br>pass both this test and g_unichar_iszerowidth().
     * @param c a Unicode character
     * @return %TRUE if the character is wide in legacy East Asian locales
    */
    public static boolean unicharIswideCjk(byte c)  {
        return JnaGlib.INST().g_unichar_iswide_cjk(c);
    }

    /**
     * Determines if a character is a hexadecimal digit.
     * @param c a Unicode character.
     * @return %TRUE if the character is a hexadecimal digit
    */
    public static boolean unicharIsxdigit(byte c)  {
        return JnaGlib.INST().g_unichar_isxdigit(c);
    }

    /**
     * Determines if a given character typically takes zero width when rendered.
     * <br>The return value is %TRUE for all non-spacing and enclosing marks
     * <br>(e.g., combining accents), format characters, zero-width
     * <br>space, but not U+00AD SOFT HYPHEN.
     * <br>
     * <br>A typical use of this function is with one of g_unichar_iswide() or
     * <br>g_unichar_iswide_cjk() to determine the number of cells a string occupies
     * <br>when displayed on a grid display (terminals).  However, note that not all
     * <br>terminals support zero-width rendering of zero-width marks.
     * @param c a Unicode character
     * @return %TRUE if the character has zero width
    */
    public static boolean unicharIszerowidth(byte c)  {
        return JnaGlib.INST().g_unichar_iszerowidth(c);
    }

    /**
     * Converts a single character to UTF-8.
     * @param c a Unicode character code
     * @param outbuf output buffer, must have at       least 6 bytes of space. If %NULL, the length will be computed and       returned and nothing will be written to &#64;outbuf.
     * @return number of bytes written
    */
    public static int unicharToUtf8(byte c, @Nullable ch.bailu.gtk.type.Str outbuf)  {
        return JnaGlib.INST().g_unichar_to_utf8(c, asCPointer(outbuf));
    }

    /**
     * Converts a character to lower case.
     * @param c a Unicode character.
     * @return the result of converting &#64;c to lower case.               If &#64;c is not an upperlower or titlecase character,               or has no lowercase equivalent &#64;c is returned unchanged.
    */
    public static byte unicharTolower(byte c)  {
        return JnaGlib.INST().g_unichar_tolower(c);
    }

    /**
     * Converts a character to the titlecase.
     * @param c a Unicode character
     * @return the result of converting &#64;c to titlecase.               If &#64;c is not an uppercase or lowercase character,               &#64;c is returned unchanged.
    */
    public static byte unicharTotitle(byte c)  {
        return JnaGlib.INST().g_unichar_totitle(c);
    }

    /**
     * Converts a character to uppercase.
     * @param c a Unicode character
     * @return the result of converting &#64;c to uppercase.               If &#64;c is not a lowercase or titlecase character,               or has no upper case equivalent &#64;c is returned unchanged.
    */
    public static byte unicharToupper(byte c)  {
        return JnaGlib.INST().g_unichar_toupper(c);
    }

    /**
     * Classifies a Unicode character by type.
     * @param c a Unicode character
     * @return the type of the character.
    */
    public static int unicharType(byte c)  {
        return JnaGlib.INST().g_unichar_type(c);
    }

    /**
     * Checks whether &#64;ch is a valid Unicode character. Some possible
     * <br>integer values of &#64;ch will not be valid. 0 is considered a valid
     * <br>character, though it's normally a string terminator.
     * @param ch a Unicode character
     * @return %TRUE if &#64;ch is a valid Unicode character
    */
    public static boolean unicharValidate(byte ch)  {
        return JnaGlib.INST().g_unichar_validate(ch);
    }

    /**
     * Determines the numeric value of a character as a hexadecimal
     * <br>digit.
     * @param c a Unicode character
     * @return If &#64;c is a hex digit (according to g_unichar_isxdigit()), its numeric value. Otherwise, -1.
    */
    public static int unicharXdigitValue(byte c)  {
        return JnaGlib.INST().g_unichar_xdigit_value(c);
    }

    /**
     * Looks up the Unicode script for &#64;iso15924.  ISO 15924 assigns four-letter
     * <br>codes to scripts.  For example, the code for Arabic is 'Arab'.
     * <br>This function accepts four letter codes encoded as a &#64;guint32 in a
     * <br>big-endian fashion.  That is, the code expected for Arabic is
     * <br>0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     * <br>
     * <br>See
     * <br>[Codes for the representation of names of scripts](http://unicode.org/iso15924/codelists.html)
     * <br>for details.
     * @param iso15924 a Unicode script
     * @return the Unicode script for &#64;iso15924, or   of %G_UNICODE_SCRIPT_INVALID_CODE if &#64;iso15924 is zero and   %G_UNICODE_SCRIPT_UNKNOWN if &#64;iso15924 is unknown.
    */
    public static int unicodeScriptFromIso15924(int iso15924)  {
        return JnaGlib.INST().g_unicode_script_from_iso15924(iso15924);
    }

    /**
     * Looks up the ISO 15924 code for &#64;script.  ISO 15924 assigns four-letter
     * <br>codes to scripts.  For example, the code for Arabic is 'Arab'.  The
     * <br>four letter codes are encoded as a &#64;guint32 by this function in a
     * <br>big-endian fashion.  That is, the code returned for Arabic is
     * <br>0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     * <br>
     * <br>See
     * <br>[Codes for the representation of names of scripts](http://unicode.org/iso15924/codelists.html)
     * <br>for details.
     * @param script a Unicode script
     * @return the ISO 15924 code for &#64;script, encoded as an integer,   of zero if &#64;script is %G_UNICODE_SCRIPT_INVALID_CODE or   ISO 15924 code 'Zzzz' (script code for UNKNOWN) if &#64;script is not understood.
    */
    public static int unicodeScriptToIso15924(int script)  {
        return JnaGlib.INST().g_unicode_script_to_iso15924(script);
    }

    /**
     * 
     * @return 
    */
    public static int unixErrorQuark()  {
        return JnaGlib.INST().g_unix_error_quark();
    }

    /**
     * Sets a function to be called when the IO condition, as specified by
     * <br>&#64;condition becomes true for &#64;fd.
     * <br>
     * <br>&#64;function will be called when the specified IO condition becomes
     * <br>%TRUE.  The function is expected to clear whatever event caused the
     * <br>IO condition to become true and return %TRUE in order to be notified
     * <br>when it happens again.  If &#64;function returns %FALSE then the watch
     * <br>will be cancelled.
     * <br>
     * <br>The return value of this function can be passed to g_source_remove()
     * <br>to cancel the watch at any time that it exists.
     * <br>
     * <br>The source will never close the fd -- you must do it yourself.
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on &#64;fd
     * @param function a &#35;GUnixFDSourceFunc
     * @param user_data data to pass to &#64;function
     * @return the ID (greater than 0) of the event source
    */
    public static int unixFdAdd(int fd, int condition, OnUnixFDSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_unix_fd_add(fd, condition, toOnUnixFDSourceFunc(getClassHandler().getInstance(), "unixFdAdd", function), asCPointer(user_data));
    }

    /**
     * Sets a function to be called when the IO condition, as specified by
     * <br>&#64;condition becomes true for &#64;fd.
     * <br>
     * <br>This is the same as g_unix_fd_add(), except that it allows you to
     * <br>specify a non-default priority and a provide a &#35;GDestroyNotify for
     * <br>&#64;user_data.
     * @param priority the priority of the source
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on &#64;fd
     * @param function a &#35;GUnixFDSourceFunc
     * @param user_data data to pass to &#64;function
     * @param notify function to call when the idle is removed, or %NULL
     * @return the ID (greater than 0) of the event source
    */
    public static int unixFdAddFull(int priority, int fd, int condition, OnUnixFDSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_unix_fd_add_full(priority, fd, condition, toOnUnixFDSourceFunc(getClassHandler().getInstance(), "unixFdAddFull", function), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "unixFdAddFull", notify));
    }

    /**
     * Creates a &#35;GSource to watch for a particular IO condition on a file
     * <br>descriptor.
     * <br>
     * <br>The source will never close the fd -- you must do it yourself.
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on &#64;fd
     * @return the newly created &#35;GSource
    */
    public static Source unixFdSourceNew(int fd, int condition)  {
        return new Source(new PointerContainer(JnaGlib.INST().g_unix_fd_source_new(fd, condition)));
    }

    /**
     * Similar to the UNIX pipe() call, but on modern systems like Linux
     * <br>uses the pipe2() system call, which atomically creates a pipe with
     * <br>the configured flags. The only supported flag currently is
     * <br>%FD_CLOEXEC. If for example you want to configure %O_NONBLOCK, that
     * <br>must still be done separately with fcntl().
     * <br>
     * <br>This function does not take %O_CLOEXEC, it takes %FD_CLOEXEC as if
     * <br>for fcntl(); these are different on Linux/glibc.
     * @param fds Array of two integers
     * @param flags Bitfield of file descriptor flags, as for fcntl()
     * @return %TRUE on success, %FALSE if not (and errno will be set).
    */
    public static boolean unixOpenPipe(@Nonnull ch.bailu.gtk.type.Int fds, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_unix_open_pipe(asCPointerNotNull(fds), flags, 0L);
    }

    /**
     * Control the non-blocking state of the given file descriptor,
     * <br>according to &#64;nonblock. On most systems this uses %O_NONBLOCK, but
     * <br>on some older ones may use %O_NDELAY.
     * @param fd A file descriptor
     * @param nonblock If %TRUE, set the descriptor to be non-blocking
     * @return %TRUE if successful
    */
    public static boolean unixSetFdNonblocking(int fd, boolean nonblock) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_unix_set_fd_nonblocking(fd, nonblock, 0L);
    }

    /**
     * A convenience function for g_unix_signal_source_new(), which
     * <br>attaches to the default &#35;GMainContext.  You can remove the watch
     * <br>using g_source_remove().
     * @param signum Signal number
     * @param handler Callback
     * @param user_data Data for &#64;handler
     * @return An ID (greater than 0) for the event source
    */
    public static int unixSignalAdd(int signum, OnSourceFunc handler, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaGlib.INST().g_unix_signal_add(signum, toOnSourceFunc(getClassHandler().getInstance(), "unixSignalAdd", handler), asCPointer(user_data));
    }

    /**
     * A convenience function for g_unix_signal_source_new(), which
     * <br>attaches to the default &#35;GMainContext.  You can remove the watch
     * <br>using g_source_remove().
     * @param priority the priority of the signal source. Typically this will be in            the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param signum Signal number
     * @param handler Callback
     * @param user_data Data for &#64;handler
     * @param notify &#35;GDestroyNotify for &#64;handler
     * @return An ID (greater than 0) for the event source
    */
    public static int unixSignalAddFull(int priority, int signum, OnSourceFunc handler, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify notify)  {
        return JnaGlib.INST().g_unix_signal_add_full(priority, signum, toOnSourceFunc(getClassHandler().getInstance(), "unixSignalAddFull", handler), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "unixSignalAddFull", notify));
    }

    /**
     * Create a &#35;GSource that will be dispatched upon delivery of the UNIX
     * <br>signal &#64;signum.  In GLib versions before 2.36, only `SIGHUP`, `SIGINT`,
     * <br>`SIGTERM` can be monitored.  In GLib 2.36, `SIGUSR1` and `SIGUSR2`
     * <br>were added. In GLib 2.54, `SIGWINCH` was added.
     * <br>
     * <br>Note that unlike the UNIX default, all sources which have created a
     * <br>watch will be dispatched, regardless of which underlying thread
     * <br>invoked g_unix_signal_source_new().
     * <br>
     * <br>For example, an effective use of this function is to handle `SIGTERM`
     * <br>cleanly; flushing any outstanding files, and then calling
     * <br>g_main_loop_quit().  It is not safe to do any of this from a regular
     * <br>UNIX signal handler; such a handler may be invoked while malloc() or
     * <br>another library function is running, causing reentrancy issues if the
     * <br>handler attempts to use those functions.  None of the GLib/GObject
     * <br>API is safe against this kind of reentrancy.
     * <br>
     * <br>The interaction of this source when combined with native UNIX
     * <br>functions like sigprocmask() is not defined.
     * <br>
     * <br>The source will not initially be associated with any &#35;GMainContext
     * <br>and must be added to one with g_source_attach() before it will be
     * <br>executed.
     * @param signum A signal number
     * @return A newly created &#35;GSource
    */
    public static Source unixSignalSourceNew(int signum)  {
        return new Source(new PointerContainer(JnaGlib.INST().g_unix_signal_source_new(signum)));
    }

    /**
     * A wrapper for the POSIX unlink() function. The unlink() function
     * <br>deletes a name from the filesystem. If this was the last link to the
     * <br>file and no processes have it opened, the diskspace occupied by the
     * <br>file is freed.
     * <br>
     * <br>See your C library manual for more details about unlink(). Note
     * <br>that on Windows, it is in general not possible to delete files that
     * <br>are open to some process, or mapped into memory.
     * @param filename a pathname in the GLib file name encoding     (UTF-8 on Windows)
     * @return 0 if the name was successfully deleted, -1 if an error    occurred
    */
    public static int unlink(@Nonnull ch.bailu.gtk.type.Str filename)  {
        return JnaGlib.INST().g_unlink(asCPointerNotNull(filename));
    }

    /**
     * Removes an environment variable from the environment.
     * <br>
     * <br>Note that on some systems, when variables are overwritten, the
     * <br>memory used for the previous variables and its value isn't reclaimed.
     * <br>
     * <br>You should be mindful of the fact that environment variable handling
     * <br>in UNIX is not thread-safe, and your program may crash if one thread
     * <br>calls g_unsetenv() while another thread is calling getenv(). (And note
     * <br>that many functions, such as gettext(), call getenv() internally.) This
     * <br>function is only safe to use at the very start of your program, before
     * <br>creating any other threads (or creating objects that create worker
     * <br>threads of their own).
     * <br>
     * <br>If you need to set up the environment for a child process, you can
     * <br>use g_get_environ() to get an environment array, modify that with
     * <br>g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * <br>array directly to execvpe(), g_spawn_async(), or the like.
     * @param variable the environment variable to remove, must     not contain '='
    */
    public static void unsetenv(@Nonnull ch.bailu.gtk.type.Str variable)  {
        JnaGlib.INST().g_unsetenv(asCPointerNotNull(variable));
    }

    /**
     * Creates a new &#35;GUri from the given components according to &#64;flags.
     * <br>
     * <br>See also g_uri_build_with_user(), which allows specifying the
     * <br>components of the &quot;userinfo&quot; separately.
     * @param flags flags describing how to build the &#35;GUri
     * @param scheme the URI scheme
     * @param userinfo the userinfo component, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return a new &#35;GUri
    */
    public static Uri uriBuild(int flags, @Nonnull ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str userinfo, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new Uri(new PointerContainer(JnaGlib.INST().g_uri_build(flags, asCPointerNotNull(scheme), asCPointer(userinfo), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Creates a new &#35;GUri from the given components according to &#64;flags
     * <br>(%G_URI_FLAGS_HAS_PASSWORD is added unconditionally). The &#64;flags must be
     * <br>coherent with the passed values, in particular use `%`-encoded values with
     * <br>%G_URI_FLAGS_ENCODED.
     * <br>
     * <br>In contrast to g_uri_build(), this allows specifying the components
     * <br>of the ‘userinfo’ field separately. Note that &#64;user must be non-%NULL
     * <br>if either &#64;password or &#64;auth_params is non-%NULL.
     * @param flags flags describing how to build the &#35;GUri
     * @param scheme the URI scheme
     * @param user the user component of the userinfo, or %NULL
     * @param password the password component of the userinfo, or %NULL
     * @param auth_params the auth params of the userinfo, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return a new &#35;GUri
    */
    public static Uri uriBuildWithUser(int flags, @Nonnull ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str user, @Nullable ch.bailu.gtk.type.Str password, @Nullable ch.bailu.gtk.type.Str auth_params, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new Uri(new PointerContainer(JnaGlib.INST().g_uri_build_with_user(flags, asCPointerNotNull(scheme), asCPointer(user), asCPointer(password), asCPointer(auth_params), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * 
     * @return 
    */
    public static int uriErrorQuark()  {
        return JnaGlib.INST().g_uri_error_quark();
    }

    /**
     * Escapes a string for use in a URI.
     * <br>
     * <br>Normally all characters that are not &quot;unreserved&quot; (i.e. ASCII
     * <br>alphanumerical characters plus dash, dot, underscore and tilde) are
     * <br>escaped. But if you specify characters in &#64;reserved_chars_allowed
     * <br>they are not escaped. This is useful for the &quot;reserved&quot; characters
     * <br>in the URI specification, since those are allowed unescaped in some
     * <br>portions of a URI.
     * @param unescaped the unescaped input string.
     * @param reserved_chars_allowed a string of reserved   characters that are allowed to be used, or %NULL.
     * @param allow_utf8 %TRUE if the result can include UTF-8 characters.
     * @return an escaped version of &#64;unescaped. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str uriEscapeString(@Nonnull ch.bailu.gtk.type.Str unescaped, @Nullable ch.bailu.gtk.type.Str reserved_chars_allowed, boolean allow_utf8)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_escape_string(asCPointerNotNull(unescaped), asCPointer(reserved_chars_allowed), allow_utf8)));
    }

    /**
     * Parses &#64;uri_string according to &#64;flags, to determine whether it is a valid
     * <br>[absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
     * <br>relative to another URI using g_uri_parse_relative().
     * <br>
     * <br>If it’s not a valid URI, an error is returned explaining how it’s invalid.
     * <br>
     * <br>See g_uri_split(), and the definition of &#35;GUriFlags, for more
     * <br>information on the effect of &#64;flags.
     * @param uri_string a string containing an absolute URI
     * @param flags flags for parsing &#64;uri_string
     * @return %TRUE if &#64;uri_string is a valid absolute URI, %FALSE on error.
    */
    public static boolean uriIsValid(@Nonnull ch.bailu.gtk.type.Str uri_string, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGlib.INST().g_uri_is_valid(asCPointerNotNull(uri_string), flags, 0L);
    }

    /**
     * Joins the given components together according to &#64;flags to create
     * <br>an absolute URI string. &#64;path may not be %NULL (though it may be the empty
     * <br>string).
     * <br>
     * <br>When &#64;host is present, &#64;path must either be empty or begin with a slash (`/`)
     * <br>character. When &#64;host is not present, &#64;path cannot begin with two slash
     * <br>   characters (`//`). See
     * <br>[RFC 3986, section 3](https://tools.ietf.org/html/rfc3986&#35;section-3).
     * <br>
     * <br>See also g_uri_join_with_user(), which allows specifying the
     * <br>components of the ‘userinfo’ separately.
     * <br>
     * <br>%G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * <br>in &#64;flags.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or %NULL
     * @param userinfo the userinfo component, or %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return an absolute URI string
    */
    public static ch.bailu.gtk.type.Str uriJoin(int flags, @Nullable ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str userinfo, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_join(flags, asCPointer(scheme), asCPointer(userinfo), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Joins the given components together according to &#64;flags to create
     * <br>an absolute URI string. &#64;path may not be %NULL (though it may be the empty
     * <br>string).
     * <br>
     * <br>In contrast to g_uri_join(), this allows specifying the components
     * <br>of the ‘userinfo’ separately. It otherwise behaves the same.
     * <br>
     * <br>%G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * <br>in &#64;flags.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or %NULL
     * @param user the user component of the userinfo, or %NULL
     * @param password the password component of the userinfo, or   %NULL
     * @param auth_params the auth params of the userinfo, or   %NULL
     * @param host the host component, or %NULL
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or %NULL
     * @param fragment the fragment, or %NULL
     * @return an absolute URI string
    */
    public static ch.bailu.gtk.type.Str uriJoinWithUser(int flags, @Nullable ch.bailu.gtk.type.Str scheme, @Nullable ch.bailu.gtk.type.Str user, @Nullable ch.bailu.gtk.type.Str password, @Nullable ch.bailu.gtk.type.Str auth_params, @Nullable ch.bailu.gtk.type.Str host, int port, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str query, @Nullable ch.bailu.gtk.type.Str fragment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_join_with_user(flags, asCPointer(scheme), asCPointer(user), asCPointer(password), asCPointer(auth_params), asCPointer(host), port, asCPointerNotNull(path), asCPointer(query), asCPointer(fragment))));
    }

    /**
     * Parses &#64;uri_string according to &#64;flags. If the result is not a
     * <br>valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * <br>error returned.
     * @param uri_string a string representing an absolute URI
     * @param flags flags describing how to parse &#64;uri_string
     * @return a new &#35;GUri, or NULL on error.
    */
    public static Uri uriParse(@Nonnull ch.bailu.gtk.type.Str uri_string, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Uri(new PointerContainer(JnaGlib.INST().g_uri_parse(asCPointerNotNull(uri_string), flags, 0L)));
    }

    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * <br>value. This method can be used to parse them into a hash table. When an
     * <br>attribute has multiple occurrences, the last value is the final returned
     * <br>value. If you need to handle repeated attributes differently, use
     * <br>&#35;GUriParamsIter.
     * <br>
     * <br>The &#64;params string is assumed to still be `%`-encoded, but the returned
     * <br>values will be fully decoded. (Thus it is possible that the returned values
     * <br>may contain `=` or &#64;separators, if the value was encoded in the input.)
     * <br>Invalid `%`-encoding is treated as with the %G_URI_FLAGS_PARSE_RELAXED
     * <br>rules for g_uri_parse(). (However, if &#64;params is the path or query string
     * <br>from a &#35;GUri that was parsed without %G_URI_FLAGS_PARSE_RELAXED and
     * <br>%G_URI_FLAGS_ENCODED, then you already know that it does not contain any
     * <br>invalid encoding.)
     * <br>
     * <br>%G_URI_PARAMS_WWW_FORM is handled as documented for g_uri_params_iter_init().
     * <br>
     * <br>If %G_URI_PARAMS_CASE_INSENSITIVE is passed to &#64;flags, attributes will be
     * <br>compared case-insensitively, so a params string `attr=123&amp;Attr=456` will only
     * <br>return a single attribute–value pair, `Attr=456`. Case will be preserved in
     * <br>the returned attributes.
     * <br>
     * <br>If &#64;params cannot be parsed (for example, it contains two &#64;separators
     * <br>characters in a row), then &#64;error is set and %NULL is returned.
     * @param params a `%`-encoded string containing `attribute=value`   parameters
     * @param length the length of &#64;params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually   `&amp;`, but sometimes `;` or both `&amp;;`). Note that this function works on   bytes not characters, so it can't be used to delimit UTF-8 strings for   anything but ASCII characters. You may pass an empty set, in which case   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     * @return      A hash table of attribute/value pairs, with both names and values     fully-decoded; or %NULL on error.
    */
    public static HashTable uriParseParams(@Nonnull ch.bailu.gtk.type.Str params, long length, @Nonnull ch.bailu.gtk.type.Str separators, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new HashTable(new PointerContainer(JnaGlib.INST().g_uri_parse_params(asCPointerNotNull(params), length, asCPointerNotNull(separators), flags, 0L)));
    }

    /**
     * Gets the scheme portion of a URI string.
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-3) decodes the scheme
     * <br>as:
     * <pre>
     * URI = scheme &quot;:&quot; hier-part [ &quot;?&quot; query ] [ &quot;&#35;&quot; fragment ]
     * </pre>
     * <br>Common schemes include `file`, `https`, `svn+ssh`, etc.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or     %NULL on error. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str uriParseScheme(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_parse_scheme(asCPointerNotNull(uri))));
    }

    /**
     * Gets the scheme portion of a URI string.
     * <br>[RFC 3986](https://tools.ietf.org/html/rfc3986&#35;section-3) decodes the scheme
     * <br>as:
     * <pre>
     * URI = scheme &quot;:&quot; hier-part [ &quot;?&quot; query ] [ &quot;&#35;&quot; fragment ]
     * </pre>
     * <br>Common schemes include `file`, `https`, `svn+ssh`, etc.
     * <br>
     * <br>Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * <br>all-lowercase and does not need to be freed.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or     %NULL on error. The returned string is normalized to all-lowercase, and     interned via g_intern_string(), so it does not need to be freed.
    */
    public static ch.bailu.gtk.type.Str uriPeekScheme(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_peek_scheme(asCPointerNotNull(uri))));
    }

    /**
     * Parses &#64;uri_ref according to &#64;flags and, if it is a
     * <br>[relative URI][relative-absolute-uris], resolves it relative to
     * <br>&#64;base_uri_string. If the result is not a valid absolute URI, it will be
     * <br>discarded, and an error returned.
     * <br>
     * <br>(If &#64;base_uri_string is %NULL, this just returns &#64;uri_ref, or
     * <br>%NULL if &#64;uri_ref is invalid or not absolute.)
     * @param base_uri_string a string representing a base URI
     * @param uri_ref a string representing a relative or absolute URI
     * @param flags flags describing how to parse &#64;uri_ref
     * @return the resolved URI string, or NULL on error.
    */
    public static ch.bailu.gtk.type.Str uriResolveRelative(@Nullable ch.bailu.gtk.type.Str base_uri_string, @Nonnull ch.bailu.gtk.type.Str uri_ref, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_resolve_relative(asCPointer(base_uri_string), asCPointerNotNull(uri_ref), flags, 0L)));
    }

    /**
     * Unescapes a segment of an escaped string as binary data.
     * <br>
     * <br>Note that in contrast to g_uri_unescape_string(), this does allow
     * <br>nul bytes to appear in the output.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters appears as an escaped
     * <br>character in &#64;escaped_string, then that is an error and %NULL will be
     * <br>returned. This is useful if you want to avoid for instance having a slash
     * <br>being expanded in an escaped path element, which might confuse pathname
     * <br>handling.
     * @param escaped_string A URI-escaped string
     * @param length the length (in bytes) of &#64;escaped_string to escape, or `-1` if it   is nul-terminated.
     * @param illegal_characters a string of illegal characters   not to be allowed, or %NULL.
     * @return an unescaped version of &#64;escaped_string     or %NULL on error (if decoding failed, using %G_URI_ERROR_FAILED error     code). The returned &#35;GBytes should be unreffed when no longer needed.
    */
    public static Bytes uriUnescapeBytes(@Nonnull ch.bailu.gtk.type.Str escaped_string, long length, @Nullable ch.bailu.gtk.type.Str illegal_characters) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Bytes(new PointerContainer(JnaGlib.INST().g_uri_unescape_bytes(asCPointerNotNull(escaped_string), length, asCPointer(illegal_characters), 0L)));
    }

    /**
     * Unescapes a segment of an escaped string.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters or the NUL
     * <br>character appears as an escaped character in &#64;escaped_string, then
     * <br>that is an error and %NULL will be returned. This is useful if you
     * <br>want to avoid for instance having a slash being expanded in an
     * <br>escaped path element, which might confuse pathname handling.
     * <br>
     * <br>Note: `NUL` byte is not accepted in the output, in contrast to
     * <br>g_uri_unescape_bytes().
     * @param escaped_string A string, may be %NULL
     * @param escaped_string_end Pointer to end of &#64;escaped_string,   may be %NULL
     * @param illegal_characters An optional string of illegal   characters not to be allowed, may be %NULL
     * @return an unescaped version of &#64;escaped_string, or %NULL on error. The returned string should be freed when no longer needed.  As a special case if %NULL is given for &#64;escaped_string, this function will return %NULL.
    */
    public static ch.bailu.gtk.type.Str uriUnescapeSegment(@Nullable ch.bailu.gtk.type.Str escaped_string, @Nullable ch.bailu.gtk.type.Str escaped_string_end, @Nullable ch.bailu.gtk.type.Str illegal_characters)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_unescape_segment(asCPointer(escaped_string), asCPointer(escaped_string_end), asCPointer(illegal_characters))));
    }

    /**
     * Unescapes a whole escaped string.
     * <br>
     * <br>If any of the characters in &#64;illegal_characters or the NUL
     * <br>character appears as an escaped character in &#64;escaped_string, then
     * <br>that is an error and %NULL will be returned. This is useful if you
     * <br>want to avoid for instance having a slash being expanded in an
     * <br>escaped path element, which might confuse pathname handling.
     * @param escaped_string an escaped string to be unescaped.
     * @param illegal_characters a string of illegal characters   not to be allowed, or %NULL.
     * @return an unescaped version of &#64;escaped_string. The returned string should be freed when no longer needed.
    */
    public static ch.bailu.gtk.type.Str uriUnescapeString(@Nonnull ch.bailu.gtk.type.Str escaped_string, @Nullable ch.bailu.gtk.type.Str illegal_characters)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uri_unescape_string(asCPointerNotNull(escaped_string), asCPointer(illegal_characters))));
    }

    /**
     * Pauses the current thread for the given number of microseconds.
     * <br>
     * <br>There are 1 million microseconds per second (represented by the
     * <br>%G_USEC_PER_SEC macro). g_usleep() may have limited precision,
     * <br>depending on hardware and operating system; don't rely on the exact
     * <br>length of the sleep.
     * @param microseconds number of microseconds to pause
    */
    public static void usleep(long microseconds)  {
        JnaGlib.INST().g_usleep(microseconds);
    }

    /**
     * Converts a string into a form that is independent of case. The
     * <br>result will not correspond to any particular case, but can be
     * <br>compared for equality or ordered with the results of calling
     * <br>g_utf8_casefold() on other strings.
     * <br>
     * <br>Note that calling g_utf8_casefold() followed by g_utf8_collate() is
     * <br>only an approximation to the correct linguistic case insensitive
     * <br>ordering, though it is a fairly good one. Getting this exactly
     * <br>right would require a more sophisticated collation function that
     * <br>takes case sensitivity into account. GLib does not currently
     * <br>provide such a function.
     * @param str a UTF-8 encoded string
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @return a newly allocated string, that is a   case independent form of &#64;str.
    */
    public static ch.bailu.gtk.type.Str utf8Casefold(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_casefold(asCPointerNotNull(str), len)));
    }

    /**
     * Compares two strings for ordering using the linguistically
     * <br>correct rules for the [current locale][setlocale].
     * <br>When sorting a large number of strings, it will be significantly
     * <br>faster to obtain collation keys with g_utf8_collate_key() and
     * <br>compare the keys with strcmp() when sorting instead of sorting
     * <br>the original strings.
     * <br>
     * <br>If the two strings are not comparable due to being in different collation
     * <br>sequences, the result is undefined. This can happen if the strings are in
     * <br>different language scripts, for example.
     * @param str1 a UTF-8 encoded string
     * @param str2 a UTF-8 encoded string
     * @return &lt; 0 if &#64;str1 compares before &#64;str2,   0 if they compare equal, &gt; 0 if &#64;str1 compares after &#64;str2.
    */
    public static int utf8Collate(@Nonnull ch.bailu.gtk.type.Str str1, @Nonnull ch.bailu.gtk.type.Str str2)  {
        return JnaGlib.INST().g_utf8_collate(asCPointerNotNull(str1), asCPointerNotNull(str2));
    }

    /**
     * Converts a string into a collation key that can be compared
     * <br>with other collation keys produced by the same function using
     * <br>strcmp().
     * <br>
     * <br>The results of comparing the collation keys of two strings
     * <br>with strcmp() will always be the same as comparing the two
     * <br>original keys with g_utf8_collate().
     * <br>
     * <br>Note that this function depends on the [current locale][setlocale].
     * @param str a UTF-8 encoded string.
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @return a newly allocated string. This string should   be freed with g_free() when you are done with it.
    */
    public static ch.bailu.gtk.type.Str utf8CollateKey(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_collate_key(asCPointerNotNull(str), len)));
    }

    /**
     * Converts a string into a collation key that can be compared
     * <br>with other collation keys produced by the same function using strcmp().
     * <br>
     * <br>In order to sort filenames correctly, this function treats the dot '.'
     * <br>as a special case. Most dictionary orderings seem to consider it
     * <br>insignificant, thus producing the ordering &quot;event.c&quot; &quot;eventgenerator.c&quot;
     * <br>&quot;event.h&quot; instead of &quot;event.c&quot; &quot;event.h&quot; &quot;eventgenerator.c&quot;. Also, we
     * <br>would like to treat numbers intelligently so that &quot;file1&quot; &quot;file10&quot; &quot;file5&quot;
     * <br>is sorted as &quot;file1&quot; &quot;file5&quot; &quot;file10&quot;.
     * <br>
     * <br>Note that this function depends on the [current locale][setlocale].
     * @param str a UTF-8 encoded string.
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @return a newly allocated string. This string should   be freed with g_free() when you are done with it.
    */
    public static ch.bailu.gtk.type.Str utf8CollateKeyForFilename(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_collate_key_for_filename(asCPointerNotNull(str), len)));
    }

    /**
     * Finds the start of the next UTF-8 character in the string after &#64;p.
     * <br>
     * <br>&#64;p does not have to be at the beginning of a UTF-8 character. No check
     * <br>is made to see if the character found is actually valid other than
     * <br>it starts with an appropriate byte.
     * <br>
     * <br>If &#64;end is %NULL, the return value will never be %NULL: if the end of the
     * <br>string is reached, a pointer to the terminating nul byte is returned. If
     * <br>&#64;end is non-%NULL, the return value will be %NULL if the end of the string
     * <br>is reached.
     * @param p a pointer to a position within a UTF-8 encoded string
     * @param end a pointer to the byte following the end of the string,     or %NULL to indicate that the string is nul-terminated
     * @return a pointer to the found character or %NULL if &#64;end is    set and is reached
    */
    public static ch.bailu.gtk.type.Str utf8FindNextChar(@Nonnull ch.bailu.gtk.type.Str p, @Nullable ch.bailu.gtk.type.Str end)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_find_next_char(asCPointerNotNull(p), asCPointer(end))));
    }

    /**
     * Given a position &#64;p with a UTF-8 encoded string &#64;str, find the start
     * <br>of the previous UTF-8 character starting before &#64;p. Returns %NULL if no
     * <br>UTF-8 characters are present in &#64;str before &#64;p.
     * <br>
     * <br>&#64;p does not have to be at the beginning of a UTF-8 character. No check
     * <br>is made to see if the character found is actually valid other than
     * <br>it starts with an appropriate byte.
     * @param str pointer to the beginning of a UTF-8 encoded string
     * @param p pointer to some position within &#64;str
     * @return a pointer to the found character or %NULL.
    */
    public static ch.bailu.gtk.type.Str utf8FindPrevChar(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Str p)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_find_prev_char(asCPointerNotNull(str), asCPointerNotNull(p))));
    }

    /**
     * Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
     * <br>
     * <br>If &#64;p does not point to a valid UTF-8 encoded character, results
     * <br>are undefined. If you are not sure that the bytes are complete
     * <br>valid Unicode characters, you should use g_utf8_get_char_validated()
     * <br>instead.
     * @param p a pointer to Unicode character encoded as UTF-8
     * @return the resulting character
    */
    public static byte utf8GetChar(@Nonnull ch.bailu.gtk.type.Str p)  {
        return JnaGlib.INST().g_utf8_get_char(asCPointerNotNull(p));
    }

    /**
     * Convert a sequence of bytes encoded as UTF-8 to a Unicode character.
     * <br>This function checks for incomplete characters, for invalid characters
     * <br>such as characters that are out of the range of Unicode, and for
     * <br>overlong encodings of valid characters.
     * <br>
     * <br>Note that g_utf8_get_char_validated() returns (gunichar)-2 if
     * <br>&#64;max_len is positive and any of the bytes in the first UTF-8 character
     * <br>sequence are nul.
     * @param p a pointer to Unicode character encoded as UTF-8
     * @param max_len the maximum number of bytes to read, or -1 if &#64;p is nul-terminated
     * @return the resulting character. If &#64;p points to a partial     sequence at the end of a string that could begin a valid     character (or if &#64;max_len is zero), returns (gunichar)-2;     otherwise, if &#64;p does not point to a valid UTF-8 encoded     Unicode character, returns (gunichar)-1.
    */
    public static byte utf8GetCharValidated(@Nonnull ch.bailu.gtk.type.Str p, long max_len)  {
        return JnaGlib.INST().g_utf8_get_char_validated(asCPointerNotNull(p), max_len);
    }

    /**
     * If the provided string is valid UTF-8, return a copy of it. If not,
     * <br>return a copy in which bytes that could not be interpreted as valid Unicode
     * <br>are replaced with the Unicode replacement character (U+FFFD).
     * <br>
     * <br>For example, this is an appropriate function to use if you have received
     * <br>a string that was incorrectly declared to be UTF-8, and you need a valid
     * <br>UTF-8 version of it that can be logged or displayed to the user, with the
     * <br>assumption that it is close enough to ASCII or UTF-8 to be mostly
     * <br>readable as-is.
     * @param str string to coerce into UTF-8
     * @param len the maximum length of &#64;str to use, in bytes. If &#64;len &lt; 0,     then the string is nul-terminated.
     * @return a valid UTF-8 string whose content resembles &#64;str
    */
    public static ch.bailu.gtk.type.Str utf8MakeValid(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_make_valid(asCPointerNotNull(str), len)));
    }

    /**
     * Converts a string into canonical form, standardizing
     * <br>such issues as whether a character with an accent
     * <br>is represented as a base character and combining
     * <br>accent or as a single precomposed character. The
     * <br>string has to be valid UTF-8, otherwise %NULL is
     * <br>returned. You should generally call g_utf8_normalize()
     * <br>before comparing two Unicode strings.
     * <br>
     * <br>The normalization mode %G_NORMALIZE_DEFAULT only
     * <br>standardizes differences that do not affect the
     * <br>text content, such as the above-mentioned accent
     * <br>representation. %G_NORMALIZE_ALL also standardizes
     * <br>the &quot;compatibility&quot; characters in Unicode, such
     * <br>as SUPERSCRIPT THREE to the standard forms
     * <br>(in this case DIGIT THREE). Formatting information
     * <br>may be lost but for most text operations such
     * <br>characters should be considered the same.
     * <br>
     * <br>%G_NORMALIZE_DEFAULT_COMPOSE and %G_NORMALIZE_ALL_COMPOSE
     * <br>are like %G_NORMALIZE_DEFAULT and %G_NORMALIZE_ALL,
     * <br>but returned a result with composed forms rather
     * <br>than a maximally decomposed form. This is often
     * <br>useful if you intend to convert the string to
     * <br>a legacy encoding or pass it to a system with
     * <br>less capable Unicode handling.
     * @param str a UTF-8 encoded string.
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @param mode the type of normalization to perform.
     * @return a newly allocated string, that   is the normalized form of &#64;str, or %NULL if &#64;str   is not valid UTF-8.
    */
    public static ch.bailu.gtk.type.Str utf8Normalize(@Nonnull ch.bailu.gtk.type.Str str, long len, int mode)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_normalize(asCPointerNotNull(str), len, mode)));
    }

    /**
     * Converts from an integer character offset to a pointer to a position
     * <br>within the string.
     * <br>
     * <br>Since 2.10, this function allows to pass a negative &#64;offset to
     * <br>step backwards. It is usually worth stepping backwards from the end
     * <br>instead of forwards if &#64;offset is in the last fourth of the string,
     * <br>since moving forward is about 3 times faster than moving backward.
     * <br>
     * <br>Note that this function doesn't abort when reaching the end of &#64;str.
     * <br>Therefore you should be sure that &#64;offset is within string boundaries
     * <br>before calling that function. Call g_utf8_strlen() when unsure.
     * <br>This limitation exists as this function is called frequently during
     * <br>text rendering and therefore has to be as fast as possible.
     * @param str a UTF-8 encoded string
     * @param offset a character offset within &#64;str
     * @return the resulting pointer
    */
    public static ch.bailu.gtk.type.Str utf8OffsetToPointer(@Nonnull ch.bailu.gtk.type.Str str, long offset)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_offset_to_pointer(asCPointerNotNull(str), offset)));
    }

    /**
     * Converts from a pointer to position within a string to an integer
     * <br>character offset.
     * <br>
     * <br>Since 2.10, this function allows &#64;pos to be before &#64;str, and returns
     * <br>a negative offset in this case.
     * @param str a UTF-8 encoded string
     * @param pos a pointer to a position within &#64;str
     * @return the resulting character offset
    */
    public static long utf8PointerToOffset(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Str pos)  {
        return JnaGlib.INST().g_utf8_pointer_to_offset(asCPointerNotNull(str), asCPointerNotNull(pos));
    }

    /**
     * Finds the previous UTF-8 character in the string before &#64;p.
     * <br>
     * <br>&#64;p does not have to be at the beginning of a UTF-8 character. No check
     * <br>is made to see if the character found is actually valid other than
     * <br>it starts with an appropriate byte. If &#64;p might be the first
     * <br>character of the string, you must use g_utf8_find_prev_char() instead.
     * @param p a pointer to a position within a UTF-8 encoded string
     * @return a pointer to the found character
    */
    public static ch.bailu.gtk.type.Str utf8PrevChar(@Nonnull ch.bailu.gtk.type.Str p)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_prev_char(asCPointerNotNull(p))));
    }

    /**
     * Finds the leftmost occurrence of the given Unicode character
     * <br>in a UTF-8 encoded string, while limiting the search to &#64;len bytes.
     * <br>If &#64;len is -1, allow unbounded search.
     * @param p a nul-terminated UTF-8 encoded string
     * @param len the maximum length of &#64;p
     * @param c a Unicode character
     * @return %NULL if the string does not contain the character,     otherwise, a pointer to the start of the leftmost occurrence     of the character in the string.
    */
    public static ch.bailu.gtk.type.Str utf8Strchr(@Nonnull ch.bailu.gtk.type.Str p, long len, byte c)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strchr(asCPointerNotNull(p), len, c)));
    }

    /**
     * Converts all Unicode characters in the string that have a case
     * <br>to lowercase. The exact manner that this is done depends
     * <br>on the current locale, and may result in the number of
     * <br>characters in the string changing.
     * @param str a UTF-8 encoded string
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @return a newly allocated string, with all characters    converted to lowercase.
    */
    public static ch.bailu.gtk.type.Str utf8Strdown(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strdown(asCPointerNotNull(str), len)));
    }

    /**
     * Computes the length of the string in characters, not including
     * <br>the terminating nul character. If the &#64;max'th byte falls in the
     * <br>middle of a character, the last (partial) character is not counted.
     * @param p pointer to the start of a UTF-8 encoded string
     * @param max the maximum number of bytes to examine. If &#64;max       is less than 0, then the string is assumed to be       nul-terminated. If &#64;max is 0, &#64;p will not be examined and       may be %NULL. If &#64;max is greater than 0, up to &#64;max       bytes are examined
     * @return the length of the string in characters
    */
    public static long utf8Strlen(@Nonnull ch.bailu.gtk.type.Str p, long max)  {
        return JnaGlib.INST().g_utf8_strlen(asCPointerNotNull(p), max);
    }

    /**
     * Like the standard C strncpy() function, but copies a given number
     * <br>of characters instead of a given number of bytes. The &#64;src string
     * <br>must be valid UTF-8 encoded text. (Use g_utf8_validate() on all
     * <br>text before trying to use UTF-8 utility functions with it.)
     * <br>
     * <br>Note you must ensure &#64;dest is at least 4 * &#64;n + 1 to fit the
     * <br>largest possible UTF-8 characters
     * @param dest buffer to fill with characters from &#64;src
     * @param src UTF-8 encoded string
     * @param n character count
     * @return &#64;dest
    */
    public static ch.bailu.gtk.type.Str utf8Strncpy(@Nonnull ch.bailu.gtk.type.Str dest, @Nonnull ch.bailu.gtk.type.Str src, long n)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strncpy(asCPointerNotNull(dest), asCPointerNotNull(src), n)));
    }

    /**
     * Find the rightmost occurrence of the given Unicode character
     * <br>in a UTF-8 encoded string, while limiting the search to &#64;len bytes.
     * <br>If &#64;len is -1, allow unbounded search.
     * @param p a nul-terminated UTF-8 encoded string
     * @param len the maximum length of &#64;p
     * @param c a Unicode character
     * @return %NULL if the string does not contain the character,     otherwise, a pointer to the start of the rightmost occurrence     of the character in the string.
    */
    public static ch.bailu.gtk.type.Str utf8Strrchr(@Nonnull ch.bailu.gtk.type.Str p, long len, byte c)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strrchr(asCPointerNotNull(p), len, c)));
    }

    /**
     * Reverses a UTF-8 string. &#64;str must be valid UTF-8 encoded text.
     * <br>(Use g_utf8_validate() on all text before trying to use UTF-8
     * <br>utility functions with it.)
     * <br>
     * <br>This function is intended for programmatic uses of reversed strings.
     * <br>It pays no attention to decomposed characters, combining marks, byte
     * <br>order marks, directional indicators (LRM, LRO, etc) and similar
     * <br>characters which might need special handling when reversing a string
     * <br>for display purposes.
     * <br>
     * <br>Note that unlike g_strreverse(), this function returns
     * <br>newly-allocated memory, which should be freed with g_free() when
     * <br>no longer needed.
     * @param str a UTF-8 encoded string
     * @param len the maximum length of &#64;str to use, in bytes. If &#64;len &lt; 0,     then the string is nul-terminated.
     * @return a newly-allocated string which is the reverse of &#64;str
    */
    public static ch.bailu.gtk.type.Str utf8Strreverse(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strreverse(asCPointerNotNull(str), len)));
    }

    /**
     * Converts all Unicode characters in the string that have a case
     * <br>to uppercase. The exact manner that this is done depends
     * <br>on the current locale, and may result in the number of
     * <br>characters in the string increasing. (For instance, the
     * <br>German ess-zet will be changed to SS.)
     * @param str a UTF-8 encoded string
     * @param len length of &#64;str, in bytes, or -1 if &#64;str is nul-terminated.
     * @return a newly allocated string, with all characters    converted to uppercase.
    */
    public static ch.bailu.gtk.type.Str utf8Strup(@Nonnull ch.bailu.gtk.type.Str str, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_strup(asCPointerNotNull(str), len)));
    }

    /**
     * Copies a substring out of a UTF-8 encoded string.
     * <br>The substring will contain &#64;end_pos - &#64;start_pos characters.
     * <br>
     * <br>Since GLib 2.72, `-1` can be passed to &#64;end_pos to indicate the
     * <br>end of the string.
     * @param str a UTF-8 encoded string
     * @param start_pos a character offset within &#64;str
     * @param end_pos another character offset within &#64;str,   or `-1` to indicate the end of the string
     * @return a newly allocated copy of the requested     substring. Free with g_free() when no longer needed.
    */
    public static ch.bailu.gtk.type.Str utf8Substring(@Nonnull ch.bailu.gtk.type.Str str, long start_pos, long end_pos)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_utf8_substring(asCPointerNotNull(str), start_pos, end_pos)));
    }

    /**
     * Parses the string &#64;str and verify if it is a UUID.
     * <br>
     * <br>The function accepts the following syntax:
     * <br>
     * <br>- simple forms (e.g. `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`)
     * <br>
     * <br>Note that hyphens are required within the UUID string itself,
     * <br>as per the aforementioned RFC.
     * @param str a string representing a UUID
     * @return %TRUE if &#64;str is a valid UUID, %FALSE otherwise.
    */
    public static boolean uuidStringIsValid(@Nonnull ch.bailu.gtk.type.Str str)  {
        return JnaGlib.INST().g_uuid_string_is_valid(asCPointerNotNull(str));
    }

    /**
     * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
     * <br>randomness guarantees as &#35;GRand, so must not be used for cryptographic
     * <br>purposes such as key generation, nonces, salts or one-time pads.
     * @return A string that should be freed with g_free().
    */
    public static ch.bailu.gtk.type.Str uuidStringRandom()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_uuid_string_random()));
    }

    /**
     * 
     * @return 
    */
    public static long variantGetGtype()  {
        return JnaGlib.INST().g_variant_get_gtype();
    }

    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * <br>should ensure that a string is a valid D-Bus object path before
     * <br>passing it to g_variant_new_object_path().
     * <br>
     * <br>A valid object path starts with `/` followed by zero or more
     * <br>sequences of characters separated by `/` characters.  Each sequence
     * <br>must contain only the characters `[A-Z][a-z][0-9]_`.  No sequence
     * <br>(including the one following the final `/` character) may be empty.
     * @param string a normal C nul-terminated string
     * @return %TRUE if &#64;string is a D-Bus object path
    */
    public static boolean variantIsObjectPath(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_variant_is_object_path(asCPointerNotNull(string));
    }

    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * <br>should ensure that a string is a valid D-Bus type signature before
     * <br>passing it to g_variant_new_signature().
     * <br>
     * <br>D-Bus type signatures consist of zero or more definite &#35;GVariantType
     * <br>strings in sequence.
     * @param string a normal C nul-terminated string
     * @return %TRUE if &#64;string is a D-Bus type signature
    */
    public static boolean variantIsSignature(@Nonnull ch.bailu.gtk.type.Str string)  {
        return JnaGlib.INST().g_variant_is_signature(asCPointerNotNull(string));
    }

    /**
     * Pretty-prints a message showing the context of a &#35;GVariant parse
     * <br>error within the string for which parsing was attempted.
     * <br>
     * <br>The resulting string is suitable for output to the console or other
     * <br>monospace media where newlines are treated in the usual way.
     * <br>
     * <br>The message will typically look something like one of the following:
     * <br>
     * <pre>
     * unterminated string constant:
     *   (1, 2, 3, 'abc
     *             ^^^^
     * </pre>
     * <br>
     * <br>or
     * <br>
     * <pre>
     * unable to find a common type:
     *   [1, 2, 3, 'str']
     *    ^        ^^^^^
     * </pre>
     * <br>
     * <br>The format of the message may change in a future version.
     * <br>
     * <br>&#64;error must have come from a failed attempt to g_variant_parse() and
     * <br>&#64;source_str must be exactly the same string that caused the error.
     * <br>If &#64;source_str was not nul-terminated when you passed it to
     * <br>g_variant_parse() then you must add nul termination before using this
     * <br>function.
     * @param error a &#35;GError from the &#35;GVariantParseError domain
     * @param source_str the string that was given to the parser
     * @return the printed message
    */
    public static ch.bailu.gtk.type.Str variantParseErrorPrintContext(@Nonnull Error error, @Nonnull ch.bailu.gtk.type.Str source_str)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGlib.INST().g_variant_parse_error_print_context(asCPointerNotNull(error), asCPointerNotNull(source_str))));
    }

    /**
     * 
     * @return 
    */
    public static int variantParseErrorQuark()  {
        return JnaGlib.INST().g_variant_parse_error_quark();
    }

    /**
     * 
     * @param arg0 
     * @return 
    */
    public static VariantType variantTypeChecked(@Nonnull ch.bailu.gtk.type.Str arg0)  {
        return new VariantType(new PointerContainer(JnaGlib.INST().g_variant_type_checked_(asCPointerNotNull(arg0))));
    }

    /**
     * 
     * @param type_string 
     * @return 
    */
    public static long variantTypeStringGetDepth(@Nonnull ch.bailu.gtk.type.Str type_string)  {
        return JnaGlib.INST().g_variant_type_string_get_depth_(asCPointerNotNull(type_string));
    }

    /**
     * Checks if &#64;type_string is a valid GVariant type string.  This call is
     * <br>equivalent to calling g_variant_type_string_scan() and confirming
     * <br>that the following character is a nul terminator.
     * @param type_string a pointer to any string
     * @return %TRUE if &#64;type_string is exactly one valid type string  Since 2.24
    */
    public static boolean variantTypeStringIsValid(@Nonnull ch.bailu.gtk.type.Str type_string)  {
        return JnaGlib.INST().g_variant_type_string_is_valid(asCPointerNotNull(type_string));
    }

    /**
     * Internal function used to print messages from the public g_warn_if_reached()
     * <br>and g_warn_if_fail() macros.
     * @param domain log domain
     * @param file file containing the warning
     * @param line line number of the warning
     * @param func function containing the warning
     * @param warnexpr expression which failed
    */
    public static void warnMessage(@Nullable ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str file, int line, @Nonnull ch.bailu.gtk.type.Str func, @Nullable ch.bailu.gtk.type.Str warnexpr)  {
        JnaGlib.INST().g_warn_message(asCPointer(domain), asCPointerNotNull(file), line, asCPointerNotNull(func), asCPointer(warnexpr));
    }

}

/*
package-type

[MethodModel:java-type-not-supported:asciiStringToSigned:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gint64*}}:{j:}]

[MethodModel:java-type-not-supported:asciiStringToUnsigned:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint64*}}:{j:}]

[MethodModel:java-type-not-supported:asciiStrtod:[ParameterModel:Supported:{G_::{c:gdouble}}:{j:double}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:asciiStrtoll:[ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:asciiStrtoull:[ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:assertWarning:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const int}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:assertionMessageCmpnum:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:long double}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:long double}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:char}}:{j:}]

[MethodModel:cb-deprecated:atexit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:[MethodModel:Supported:VoidFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:java-type-not-supported:atomicIntAdd:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntAnd:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntCompareAndExchange:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntDecAndTest:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:atomicIntExchangeAndAdd:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntGet:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile const gint*}}:{j:}]

[MethodModel:java-type-not-supported:atomicIntInc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]

[MethodModel:java-type-not-supported:atomicIntOr:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntSet:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicIntXor:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile guint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicRefCountCompare:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gatomicrefcount*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:atomicRefCountDec:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gatomicrefcount*}}:{j:}]

[MethodModel:java-type-not-supported:atomicRefCountInc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gatomicrefcount*}}:{j:}]

[MethodModel:java-type-not-supported:atomicRefCountInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gatomicrefcount*}}:{j:}]

[MethodModel:cb-return-value-not-supported:base64Decode:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:base64DecodeInplace:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:base64DecodeStep:[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:base64Encode:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:base64EncodeStep:[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:cb-deprecated:basename:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:bitLock:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:bitTrylock:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:bitUnlock:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:volatile gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:buildFilenameValist:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list*}}:{j:}]

[MethodModel:java-type-not-supported:buildFilenamev:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:buildPathv:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-return-value-not-supported:byteArrayFree:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:java-type-not-supported:byteArrayNewTake:[ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-return-value-not-supported:byteArraySteal:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gg:ByteArray:{c:GByteArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:cb-not-supported:childWatchAdd:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ChildWatchFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:cb-not-supported:childWatchAddFull:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ChildWatchFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:childWatchSourceNew:[ParameterModel:Supported:{Gg:Source:{c:GSource*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]

[MethodModel:java-type-not-supported:clearHandleId:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:ClearHandleFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]

[MethodModel:java-type-not-supported:clearList:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GList**}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:clearPointer:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:clearSlist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GSList**}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:computeChecksumForData:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GChecksumType}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:computeHmacForData:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GChecksumType}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:computeHmacForString:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GChecksumType}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:direct-type:convertWithIconv:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:direct-type:{Gg:IConv:{c:GIConv}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:datalistClear:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]

[MethodModel:java-type-not-supported:datalistForeach:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:[MethodModel:Supported:DataForeachFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:datalistGetData:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:datalistGetFlags:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]

[MethodModel:java-type-not-supported:datalistIdDupData:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:DuplicateFunc:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:datalistIdGetData:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]

[MethodModel:java-type-not-supported:java-type-not-supported:datalistIdRemoveMultiple:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GQuark*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:datalistIdRemoveNoNotify:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]

[MethodModel:java-type-not-supported:datalistIdReplaceData:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:datalistIdSetDataFull:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:datalistInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]

[MethodModel:java-type-not-supported:datalistSetFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:datalistUnsetFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GData**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:dateGetDaysInMonth:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:dateGetMondayWeeksInYear:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:dateGetSundayWeeksInYear:[ParameterModel:Supported:{G_::{c:guint8}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:dateIsLeapYear:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:dateValidDay:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:dateValidDmy:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateDay}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GDateMonth}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:dateValidYear:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateYear}}:{j:}]

[MethodModel:java-type-not-supported:environGetenv:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:environSetenv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:environUnsetenv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:fileGetContents:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:fileOpenTmp:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:filenameFromUri:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:formatSizeForDisplay:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]

[MethodModel:java-type-not-supported:fprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:FILE*}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-deprecated:getCurrentTime:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getEnviron:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:java-type-not-supported:getFilenameCharsets:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar***}}:{j:}]

[MethodModel:cb-return-value-not-supported:getLanguageNames:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getLanguageNamesWithCategory:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getLocaleVariants:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getSystemConfigDirs:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getSystemDataDirs:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:java-type-not-supported:java-type-not-supported:hashTableLookupExtended:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:hashTableStealExtended:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:HashTable:{c:GHashTable*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:direct-type:java-type-not-supported:java-type-not-supported:iconv:[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:direct-type:{Gg:IConv:{c:GIConv}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:iconvOpen:[ParameterModel:direct-type:{Gg:IConv:{c:GIConv}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:listenv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:cb-returns-callback:logSetDefaultHandler:[ParameterModel:Supported:[MethodModel:Supported:LogFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]
        [ParameterModel:Supported:[MethodModel:Supported:LogFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:logSetWriterFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:LogWriterFunc:[ParameterModel:Supported:{G_::{c:GLogWriterOutput}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:logStructuredArray:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:logWriterDefault:[ParameterModel:Supported:{G_::{c:GLogWriterOutput}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:logWriterFormatFields:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:java-type-not-supported:logWriterJournald:[ParameterModel:Supported:{G_::{c:GLogWriterOutput}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:logWriterStandardStreams:[ParameterModel:Supported:{G_::{c:GLogWriterOutput}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GLogField*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:logv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GLogLevelFlags}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:markupCollectAttributes:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GMarkupCollectType}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:markupVprintfEscaped:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-deprecated:memIsSystemMalloc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:cb-deprecated:memProfile:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:memSetVtable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MemVTable:{c:GMemVTable*}}:{j:long}]

[MethodModel:cb-deprecated:memdup:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:nullifyPointer:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:java-type-not-supported:parseDebugString:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GDebugKey*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-deprecated:patternMatch:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PatternSpec:{c:GPatternSpec*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:patternMatchString:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PatternSpec:{c:GPatternSpec*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:prefixError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:prefixErrorLiteral:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:printfStringUpperBound:[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:propagateError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]

[MethodModel:java-type-not-supported:propagatePrefixedError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:ptrArrayFind:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:ptrArrayFindWithEqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PtrArray:{c:GPtrArray*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:EqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:refCountCompare:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:grefcount*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:refCountDec:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:grefcount*}}:{j:}]

[MethodModel:java-type-not-supported:refCountInc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:grefcount*}}:{j:}]

[MethodModel:java-type-not-supported:refCountInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:grefcount*}}:{j:}]

[MethodModel:cb-return-value-not-supported:regexSplitSimple:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GRegexCompileFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]

[MethodModel:java-type-not-supported:setError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:setErrorLiteral:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-returns-callback:setPrintHandler:[ParameterModel:Supported:[MethodModel:Supported:PrintFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]]
        [ParameterModel:Supported:[MethodModel:Supported:PrintFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:cb-returns-callback:setPrinterrHandler:[ParameterModel:Supported:[MethodModel:Supported:PrintFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]]
        [ParameterModel:Supported:[MethodModel:Supported:PrintFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]

[MethodModel:java-type-not-supported:shellParseArgv:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:sliceGetConfigState:[ParameterModel:java-type-not-supported:{G_::{c:gint64*}}:{j:}]]
        [ParameterModel:Supported:{G_::{c:GSliceConfig}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:spawnAsync:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:spawnAsyncWithFds:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:spawnAsyncWithPipes:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:spawnAsyncWithPipesAndFds:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gint*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:cb-deprecated:spawnCheckExitStatus:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:spawnClosePid:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:spawnCommandLineSync:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:spawnSync:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:strTokenizeAndFold:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]

[MethodModel:cb-deprecated:strcasecmp:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:strdown:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:strdupVprintf:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:strdupv:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:strfreev:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:strjoinv:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-deprecated:strncasecmp:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:strsplit:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:strsplitSet:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:java-type-not-supported:strtod:[ParameterModel:Supported:{G_::{c:gdouble}}:{j:double}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-deprecated:strup:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:strvContains:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:strvEqual:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]

[MethodModel:java-type-not-supported:strvLength:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:testInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:char***}}:{j:}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-deprecated:testTrapFork:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GTestTrapFlags}}:{j:int}]

[MethodModel:cb-deprecated:timeValFromIso8601:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:cb-deprecated:java-type-not-supported:trashStackHeight:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:trashStackPeek:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:trashStackPop:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:trashStackPush:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:ucs4ToUtf16:[ParameterModel:java-type-not-supported:{G_::{c:gunichar2*}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gunichar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:ucs4ToUtf8:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gunichar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:java-type-not-supported:unicharCompose:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:unicharDecompose:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:java-type-not-supported:unicharFullyDecompose:[ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:unicharGetMirrorChar:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:cb-deprecated:cb-return-value-not-supported:unicodeCanonicalDecomposition:[ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:unicodeCanonicalOrdering:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-return-value-not-supported:unixGetPasswdEntry:[ParameterModel:java-type-not-supported:{G_::{c:passwd*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:uriEscapeBytes:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:uriListExtractUris:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:uriSplit:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:uriSplitNetwork:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:uriSplitWithUser:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GUriFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:utf16ToUcs4:[ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gunichar2*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:utf16ToUtf8:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gunichar2*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:java-type-not-supported:utf8ToUcs4:[ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:utf8ToUcs4Fast:[ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:java-type-not-supported:utf8ToUtf16:[ParameterModel:java-type-not-supported:{G_::{c:gunichar2*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:glong*}}:{j:}]

[MethodModel:java-type-not-supported:utf8Validate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]

[MethodModel:java-type-not-supported:utf8ValidateLen:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]

[MethodModel:java-type-not-supported:variantParse:[ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:VariantType:{c:const GVariantType*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]

[MethodModel:cb-deprecated:variantParserGetErrorQuark:[ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]]

[MethodModel:java-type-not-supported:variantTypeStringScan:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:vasprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:vfprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:FILE*}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:vprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:vsnprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gulong}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:vsprintf:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
