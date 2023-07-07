/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkStatusbar` widget is usually placed along the bottom of an application's
 * <br>main [class&#64;Gtk.Window].
 * <br>
 * <br>![An example GtkStatusbar](statusbar.png)
 * <br>
 * <br>A `GtkStatusBar` may provide a regular commentary of the application's
 * <br>status (as is usually the case in a web browser, for example), or may be
 * <br>used to simply output a message when the status changes, (when an upload
 * <br>is complete in an FTP client, for example).
 * <br>
 * <br>Status bars in GTK maintain a stack of messages. The message at
 * <br>the top of the each bar’s stack is the one that will currently be displayed.
 * <br>
 * <br>Any messages added to a statusbar’s stack must specify a context id that
 * <br>is used to uniquely identify the source of a message. This context id can
 * <br>be generated by [method&#64;Gtk.Statusbar.get_context_id], given a message and
 * <br>the statusbar that it will be added to. Note that messages are stored in a
 * <br>stack, and when choosing which message to display, the stack structure is
 * <br>adhered to, regardless of the context identifier of a message.
 * <br>
 * <br>One could say that a statusbar maintains one stack of messages for
 * <br>display purposes, but allows multiple message producers to maintain
 * <br>sub-stacks of the messages they produced (via context ids).
 * <br>
 * <br>Status bars are created using [ctor&#64;Gtk.Statusbar.new].
 * <br>
 * <br>Messages are added to the bar’s stack with [method&#64;Gtk.Statusbar.push].
 * <br>
 * <br>The message at the top of the stack can be removed using
 * <br>[method&#64;Gtk.Statusbar.pop]. A message can be removed from anywhere in the
 * <br>stack if its message id was recorded at the time it was added. This is done
 * <br>using [method&#64;Gtk.Statusbar.remove].
 * <br>
 * <br>&#35;&#35; CSS node
 * <br>
 * <br>`GtkStatusbar` has a single CSS node with name `statusbar`.
 * <p><a href="https://docs.gtk.org/gtk4/class.Statusbar.html">https://docs.gtk.org/gtk4/class.Statusbar.html</a></p>
*/
public class Statusbar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Statusbar.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTextPopped {
        /**
         * Emitted whenever a new message is popped off a statusbar's stack.
         * @param context_id the context id of the relevant message/statusbar
         * @param text the message that was just popped
        */
        void onTextPopped(int context_id, @Nonnull ch.bailu.gtk.type.Str text);
    }
    
    private static com.sun.jna.Callback toOnTextPopped(OnTextPopped in) {
        return (in == null) ? null: (JnaStatusbar.OnTextPopped) (__self, _context_id, _text, __data) -> in.onTextPopped(_context_id, new ch.bailu.gtk.type.Str(new PointerContainer(_text)));
    }

    @FunctionalInterface
    public interface OnTextPushed {
        /**
         * Emitted whenever a new message gets pushed onto a statusbar's stack.
         * @param context_id the context id of the relevant message/statusbar
         * @param text the message that was pushed
        */
        void onTextPushed(int context_id, @Nonnull ch.bailu.gtk.type.Str text);
    }
    
    private static com.sun.jna.Callback toOnTextPushed(OnTextPushed in) {
        return (in == null) ? null: (JnaStatusbar.OnTextPushed) (__self, _context_id, _text, __data) -> in.onTextPushed(_context_id, new ch.bailu.gtk.type.Str(new PointerContainer(_text)));
    }

    public Statusbar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkStatusbar` ready for messages.
    */
    public Statusbar() {
        super(cast(JnaStatusbar.INST().gtk_statusbar_new()));
    }

    /**
     * Returns a new context identifier, given a description
     * <br>of the actual context.
     * <br>
     * <br>Note that the description is not shown in the UI.
     * @param context_description textual description of what context   the new message is being used in
     * @return an integer id
    */
    public int getContextId(@Nonnull ch.bailu.gtk.type.Str context_description)  {
        return JnaStatusbar.INST().gtk_statusbar_get_context_id(asCPointer(), asCPointerNotNull(context_description));
    }

    /**
     * Returns a new context identifier, given a description
     * <br>of the actual context.
     * <br>
     * <br>Note that the description is not shown in the UI.
     * @param context_description textual description of what context   the new message is being used in
     * @return an integer id
    */
    public int getContextId(String context_description)  {
        return JnaStatusbar.INST().gtk_statusbar_get_context_id(asCPointer(), context_description);
    }

    /**
     * Removes the first message in the `GtkStatusbar`’s stack
     * <br>with the given context id.
     * <br>
     * <br>Note that this may not change the displayed message,
     * <br>if the message at the top of the stack has a different
     * <br>context id.
     * @param context_id a context identifier
    */
    public void pop(int context_id)  {
        JnaStatusbar.INST().gtk_statusbar_pop(asCPointer(), context_id);
    }

    /**
     * Pushes a new message onto a statusbar’s stack.
     * @param context_id the message’s context id, as returned by    gtk_statusbar_get_context_id()
     * @param text the message to add to the statusbar
     * @return a message id that can be used with   [method&#64;Gtk.Statusbar.remove].
    */
    public int push(int context_id, @Nonnull ch.bailu.gtk.type.Str text)  {
        return JnaStatusbar.INST().gtk_statusbar_push(asCPointer(), context_id, asCPointerNotNull(text));
    }

    /**
     * Pushes a new message onto a statusbar’s stack.
     * @param context_id the message’s context id, as returned by    gtk_statusbar_get_context_id()
     * @param text the message to add to the statusbar
     * @return a message id that can be used with   [method&#64;Gtk.Statusbar.remove].
    */
    public int push(int context_id, String text)  {
        return JnaStatusbar.INST().gtk_statusbar_push(asCPointer(), context_id, text);
    }

    /**
     * Forces the removal of a message from a statusbar’s stack.
     * <br>The exact &#64;context_id and &#64;message_id must be specified.
     * @param context_id a context identifier
     * @param message_id a message identifier, as returned by [method&#64;Gtk.Statusbar.push]
    */
    public void remove(int context_id, int message_id)  {
        JnaStatusbar.INST().gtk_statusbar_remove(asCPointer(), context_id, message_id);
    }

    /**
     * Forces the removal of all messages from a statusbar's
     * <br>stack with the exact &#64;context_id.
     * @param context_id a context identifier
    */
    public void removeAll(int context_id)  {
        JnaStatusbar.INST().gtk_statusbar_remove_all(asCPointer(), context_id);
    }

    public final static String SIGNAL_ON_TEXT_POPPED = "text-popped";
    
    /**
     * Connect to signal "text-popped".
     * <br>See {@link OnTextPopped#onTextPopped} for signal description.
     * <br>Field {@link #SIGNAL_ON_TEXT_POPPED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTextPopped(OnTextPopped signal) {
        return connectSignal(SIGNAL_ON_TEXT_POPPED, toOnTextPopped(signal));
    }

    public final static String SIGNAL_ON_TEXT_PUSHED = "text-pushed";
    
    /**
     * Connect to signal "text-pushed".
     * <br>See {@link OnTextPushed#onTextPushed} for signal description.
     * <br>Field {@link #SIGNAL_ON_TEXT_PUSHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTextPushed(OnTextPushed signal) {
        return connectSignal(SIGNAL_ON_TEXT_PUSHED, toOnTextPushed(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaStatusbar.INST().gtk_statusbar_get_type(); 
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