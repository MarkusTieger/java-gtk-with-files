/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Completes partial file and directory names given a partial string by
 * <br>looking in the file system for clues. Can return a list of possible
 * <br>completion strings for widget implementations.
 * <p><a href="https://docs.gtk.org/gio/class.FilenameCompleter.html">https://docs.gtk.org/gio/class.FilenameCompleter.html</a></p>
*/
public class FilenameCompleter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FilenameCompleter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGotCompletionData {
        /**
         * Emitted when the file name completion information comes available.
        */
        void onGotCompletionData();
    }
    
    private static com.sun.jna.Callback toOnGotCompletionData(OnGotCompletionData in) {
        return (in == null) ? null: (JnaFilenameCompleter.OnGotCompletionData) (__self, __data) -> in.onGotCompletionData();
    }

    public FilenameCompleter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new filename completer.
    */
    public FilenameCompleter() {
        super(cast(JnaFilenameCompleter.INST().g_filename_completer_new()));
    }

    /**
     * Obtains a completion for &#64;initial_text from &#64;completer.
     * @param initial_text text to be completed.
     * @return a completed string, or %NULL if no     completion exists. This string is not owned by GIO, so remember to g_free()     it when finished.
    */
    public ch.bailu.gtk.type.Str getCompletionSuffix(@Nonnull ch.bailu.gtk.type.Str initial_text)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFilenameCompleter.INST().g_filename_completer_get_completion_suffix(asCPointer(), asCPointerNotNull(initial_text))));
    }

    /**
     * Obtains a completion for &#64;initial_text from &#64;completer.
     * @param initial_text text to be completed.
     * @return a completed string, or %NULL if no     completion exists. This string is not owned by GIO, so remember to g_free()     it when finished.
    */
    public ch.bailu.gtk.type.Str getCompletionSuffix(String initial_text)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFilenameCompleter.INST().g_filename_completer_get_completion_suffix(asCPointer(), initial_text)));
    }

    /**
     * Gets an array of completion strings for a given initial text.
     * @param initial_text text to be completed.
     * @return array of strings with possible completions for &#64;initial_text. This array must be freed by g_strfreev() when finished.
    */
    public ch.bailu.gtk.type.Strs getCompletions(@Nonnull ch.bailu.gtk.type.Str initial_text)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFilenameCompleter.INST().g_filename_completer_get_completions(asCPointer(), asCPointerNotNull(initial_text))));
    }

    /**
     * Gets an array of completion strings for a given initial text.
     * @param initial_text text to be completed.
     * @return array of strings with possible completions for &#64;initial_text. This array must be freed by g_strfreev() when finished.
    */
    public ch.bailu.gtk.type.Strs getCompletions(String initial_text)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFilenameCompleter.INST().g_filename_completer_get_completions(asCPointer(), initial_text)));
    }

    /**
     * If &#64;dirs_only is %TRUE, &#64;completer will only
     * <br>complete directory names, and not file names.
     * @param dirs_only a &#35;gboolean.
    */
    public void setDirsOnly(boolean dirs_only)  {
        JnaFilenameCompleter.INST().g_filename_completer_set_dirs_only(asCPointer(), dirs_only);
    }

    public final static String SIGNAL_ON_GOT_COMPLETION_DATA = "got-completion-data";
    
    /**
     * Connect to signal "got-completion-data".
     * <br>See {@link OnGotCompletionData#onGotCompletionData} for signal description.
     * <br>Field {@link #SIGNAL_ON_GOT_COMPLETION_DATA} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGotCompletionData(OnGotCompletionData signal) {
        return connectSignal(SIGNAL_ON_GOT_COMPLETION_DATA, toOnGotCompletionData(signal));
    }

    public static long getTypeID() { 
        return JnaFilenameCompleter.INST().g_filename_completer_get_type(); 
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
