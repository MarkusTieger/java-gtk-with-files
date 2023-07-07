/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAssistant` is used to represent a complex as a series of steps.
 * <br>
 * <br>![An example GtkAssistant](assistant.png)
 * <br>
 * <br>Each step consists of one or more pages. `GtkAssistant` guides the user
 * <br>through the pages, and controls the page flow to collect the data needed
 * <br>for the operation.
 * <br>
 * <br>`GtkAssistant` handles which buttons to show and to make sensitive based
 * <br>on page sequence knowledge and the [enum&#64;Gtk.AssistantPageType] of each
 * <br>page in addition to state information like the *completed* and *committed*
 * <br>page statuses.
 * <br>
 * <br>If you have a case that doesn’t quite fit in `GtkAssistant`s way of
 * <br>handling buttons, you can use the %GTK_ASSISTANT_PAGE_CUSTOM page
 * <br>type and handle buttons yourself.
 * <br>
 * <br>`GtkAssistant` maintains a `GtkAssistantPage` object for each added
 * <br>child, which holds additional per-child properties. You
 * <br>obtain the `GtkAssistantPage` for a child with [method&#64;Gtk.Assistant.get_page].
 * <br>
 * <br>&#35; GtkAssistant as GtkBuildable
 * <br>
 * <br>The `GtkAssistant` implementation of the `GtkBuildable` interface
 * <br>exposes the &#64;action_area as internal children with the name
 * <br>“action_area”.
 * <br>
 * <br>To add pages to an assistant in `GtkBuilder`, simply add it as a
 * <br>child to the `GtkAssistant` object. If you need to set per-object
 * <br>properties, create a `GtkAssistantPage` object explicitly, and
 * <br>set the child widget as a property on it.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkAssistant` has a single CSS node with the name window and style
 * <br>class .assistant.
 * <p><a href="https://docs.gtk.org/gtk4/class.Assistant.html">https://docs.gtk.org/gtk4/class.Assistant.html</a></p>
*/
public class Assistant extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Assistant.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAssistantPageFunc {
        /**
         * Type of callback used to calculate the next page in a `GtkAssistant`.
         * <br>
         * <br>It’s called both for computing the next page when the user presses the
         * <br>“forward” button and for handling the behavior of the “last” button.
         * <br>
         * <br>See [method&#64;Gtk.Assistant.set_forward_page_func].
         * @param current_page The page number used to calculate the next page.
         * @param data user data.
         * @return The next page number
        */
        int onAssistantPageFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, int current_page, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaAssistant.OnAssistantPageFunc toOnAssistantPageFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnAssistantPageFunc in) {
        JnaAssistant.OnAssistantPageFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_current_page, _data) -> in.onAssistantPageFunc(__callback, _current_page, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaAssistant.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaAssistant.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnApply {
        /**
         * Emitted when the apply button is clicked.
         * <br>
         * <br>The default behavior of the `GtkAssistant` is to switch to the page
         * <br>after the current page, unless the current page is the last one.
         * <br>
         * <br>A handler for the ::apply signal should carry out the actions for
         * <br>which the wizard has collected data. If the action takes a long time
         * <br>to complete, you might consider putting a page of type
         * <br>%GTK_ASSISTANT_PAGE_PROGRESS after the confirmation page and handle
         * <br>this operation within the [signal&#64;Gtk.Assistant::prepare] signal of
         * <br>the progress page.
        */
        void onApply();
    }
    
    private static com.sun.jna.Callback toOnApply(OnApply in) {
        return (in == null) ? null: (JnaAssistant.OnApply) (__self, __data) -> in.onApply();
    }

    @FunctionalInterface
    public interface OnCancel {
        /**
         * Emitted when then the cancel button is clicked.
        */
        void onCancel();
    }
    
    private static com.sun.jna.Callback toOnCancel(OnCancel in) {
        return (in == null) ? null: (JnaAssistant.OnCancel) (__self, __data) -> in.onCancel();
    }

    @FunctionalInterface
    public interface OnClose {
        /**
         * Emitted either when the close button of a summary page is clicked,
         * <br>or when the apply button in the last page in the flow (of type
         * <br>%GTK_ASSISTANT_PAGE_CONFIRM) is clicked.
        */
        void onClose();
    }
    
    private static com.sun.jna.Callback toOnClose(OnClose in) {
        return (in == null) ? null: (JnaAssistant.OnClose) (__self, __data) -> in.onClose();
    }

    @FunctionalInterface
    public interface OnEscape {
        /**
         * The action signal for the Escape binding.
        */
        void onEscape();
    }
    
    private static com.sun.jna.Callback toOnEscape(OnEscape in) {
        return (in == null) ? null: (JnaAssistant.OnEscape) (__self, __data) -> in.onEscape();
    }

    @FunctionalInterface
    public interface OnPrepare {
        /**
         * Emitted when a new page is set as the assistant's current page,
         * <br>before making the new page visible.
         * <br>
         * <br>A handler for this signal can do any preparations which are
         * <br>necessary before showing &#64;page.
         * @param page the current page
        */
        void onPrepare(@Nonnull Widget page);
    }
    
    private static com.sun.jna.Callback toOnPrepare(OnPrepare in) {
        return (in == null) ? null: (JnaAssistant.OnPrepare) (__self, _page, __data) -> in.onPrepare(new Widget(new PointerContainer(_page)));
    }

    public Assistant(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAssistant`.
    */
    public Assistant() {
        super(cast(JnaAssistant.INST().gtk_assistant_new()));
    }

    /**
     * Adds a widget to the action area of a `GtkAssistant`.
     * @param child a `GtkWidget`
    */
    public void addActionWidget(@Nonnull Widget child)  {
        JnaAssistant.INST().gtk_assistant_add_action_widget(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Appends a page to the &#64;assistant.
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
    */
    public int appendPage(@Nonnull Widget page)  {
        return JnaAssistant.INST().gtk_assistant_append_page(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Erases the visited page history.
     * <br>
     * <br>GTK will then hide the back button on the current page,
     * <br>and removes the cancel button from subsequent pages.
     * <br>
     * <br>Use this when the information provided up to the current
     * <br>page is hereafter deemed permanent and cannot be modified
     * <br>or undone. For example, showing a progress page to track
     * <br>a long-running, unreversible operation after the user has
     * <br>clicked apply on a confirmation page.
    */
    public void commit()  {
        JnaAssistant.INST().gtk_assistant_commit(asCPointer());
    }

    /**
     * Returns the page number of the current page.
     * @return The index (starting from 0) of the current   page in the &#64;assistant, or -1 if the &#64;assistant has no pages,   or no current page
    */
    public int getCurrentPage()  {
        return JnaAssistant.INST().gtk_assistant_get_current_page(asCPointer());
    }

    /**
     * Returns the number of pages in the &#64;assistant
     * @return the number of pages in the &#64;assistant
    */
    public int getNPages()  {
        return JnaAssistant.INST().gtk_assistant_get_n_pages(asCPointer());
    }

    /**
     * Returns the child widget contained in page number &#64;page_num.
     * @param page_num the index of a page in the &#64;assistant,   or -1 to get the last page
     * @return the child widget, or %NULL   if &#64;page_num is out of bounds
    */
    public Widget getNthPage(int page_num)  {
        return new Widget(new PointerContainer(JnaAssistant.INST().gtk_assistant_get_nth_page(asCPointer(), page_num)));
    }

    /**
     * Returns the `GtkAssistantPage` object for &#64;child.
     * @param child a child of &#64;assistant
     * @return the `GtkAssistantPage` for &#64;child
    */
    public AssistantPage getPage(@Nonnull Widget child)  {
        return new AssistantPage(new PointerContainer(JnaAssistant.INST().gtk_assistant_get_page(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Gets whether &#64;page is complete.
     * @param page a page of &#64;assistant
     * @return %TRUE if &#64;page is complete.
    */
    public boolean getPageComplete(@Nonnull Widget page)  {
        return JnaAssistant.INST().gtk_assistant_get_page_complete(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Gets the title for &#64;page.
     * @param page a page of &#64;assistant
     * @return the title for &#64;page
    */
    public ch.bailu.gtk.type.Str getPageTitle(@Nonnull Widget page)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAssistant.INST().gtk_assistant_get_page_title(asCPointer(), asCPointerNotNull(page))));
    }

    /**
     * Gets the page type of &#64;page.
     * @param page a page of &#64;assistant
     * @return the page type of &#64;page
    */
    public int getPageType(@Nonnull Widget page)  {
        return JnaAssistant.INST().gtk_assistant_get_page_type(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Gets a list model of the assistant pages.
     * @return A list model of the pages.
    */
    public ch.bailu.gtk.gio.ListModel getPages()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaAssistant.INST().gtk_assistant_get_pages(asCPointer())));
    }

    /**
     * Inserts a page in the &#64;assistant at a given position.
     * @param page a `GtkWidget`
     * @param position the index (starting at 0) at which to insert the page,   or -1 to append the page to the &#64;assistant
     * @return the index (starting from 0) of the inserted page
    */
    public int insertPage(@Nonnull Widget page, int position)  {
        return JnaAssistant.INST().gtk_assistant_insert_page(asCPointer(), asCPointerNotNull(page), position);
    }

    /**
     * Navigate to the next page.
     * <br>
     * <br>It is a programming error to call this function when
     * <br>there is no next page.
     * <br>
     * <br>This function is for use when creating pages of the
     * <br>%GTK_ASSISTANT_PAGE_CUSTOM type.
    */
    public void nextPage()  {
        JnaAssistant.INST().gtk_assistant_next_page(asCPointer());
    }

    /**
     * Prepends a page to the &#64;assistant.
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
    */
    public int prependPage(@Nonnull Widget page)  {
        return JnaAssistant.INST().gtk_assistant_prepend_page(asCPointer(), asCPointerNotNull(page));
    }

    /**
     * Navigate to the previous visited page.
     * <br>
     * <br>It is a programming error to call this function when
     * <br>no previous page is available.
     * <br>
     * <br>This function is for use when creating pages of the
     * <br>%GTK_ASSISTANT_PAGE_CUSTOM type.
    */
    public void previousPage()  {
        JnaAssistant.INST().gtk_assistant_previous_page(asCPointer());
    }

    /**
     * Removes a widget from the action area of a `GtkAssistant`.
     * @param child a `GtkWidget`
    */
    public void removeActionWidget(@Nonnull Widget child)  {
        JnaAssistant.INST().gtk_assistant_remove_action_widget(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes the &#64;page_num’s page from &#64;assistant.
     * @param page_num the index of a page in the &#64;assistant,   or -1 to remove the last page
    */
    public void removePage(int page_num)  {
        JnaAssistant.INST().gtk_assistant_remove_page(asCPointer(), page_num);
    }

    /**
     * Switches the page to &#64;page_num.
     * <br>
     * <br>Note that this will only be necessary in custom buttons,
     * <br>as the &#64;assistant flow can be set with
     * <br>gtk_assistant_set_forward_page_func().
     * @param page_num index of the page to switch to, starting from 0.   If negative, the last page will be used. If greater   than the number of pages in the &#64;assistant, nothing   will be done.
    */
    public void setCurrentPage(int page_num)  {
        JnaAssistant.INST().gtk_assistant_set_current_page(asCPointer(), page_num);
    }

    /**
     * Sets the page forwarding function to be &#64;page_func.
     * <br>
     * <br>This function will be used to determine what will be
     * <br>the next page when the user presses the forward button.
     * <br>Setting &#64;page_func to %NULL will make the assistant to
     * <br>use the default forward function, which just goes to the
     * <br>next visible page.
     * @param page_func the `GtkAssistantPageFunc`, or %NULL   to use the default one
     * @param data user data for &#64;page_func
     * @param destroy destroy notifier for &#64;data
    */
    public void setForwardPageFunc(OnAssistantPageFunc page_func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaAssistant.INST().gtk_assistant_set_forward_page_func(asCPointer(), toOnAssistantPageFunc(this, "setForwardPageFunc", page_func), asCPointer(data), toOnDestroyNotify(this, "setForwardPageFunc", destroy));
    }

    /**
     * Sets whether &#64;page contents are complete.
     * <br>
     * <br>This will make &#64;assistant update the buttons state
     * <br>to be able to continue the task.
     * @param page a page of &#64;assistant
     * @param complete the completeness status of the page
    */
    public void setPageComplete(@Nonnull Widget page, boolean complete)  {
        JnaAssistant.INST().gtk_assistant_set_page_complete(asCPointer(), asCPointerNotNull(page), complete);
    }

    /**
     * Sets a title for &#64;page.
     * <br>
     * <br>The title is displayed in the header area of the assistant
     * <br>when &#64;page is the current page.
     * @param page a page of &#64;assistant
     * @param title the new title for &#64;page
    */
    public void setPageTitle(@Nonnull Widget page, @Nonnull ch.bailu.gtk.type.Str title)  {
        JnaAssistant.INST().gtk_assistant_set_page_title(asCPointer(), asCPointerNotNull(page), asCPointerNotNull(title));
    }

    /**
     * Sets a title for &#64;page.
     * <br>
     * <br>The title is displayed in the header area of the assistant
     * <br>when &#64;page is the current page.
     * @param page a page of &#64;assistant
     * @param title the new title for &#64;page
    */
    public void setPageTitle(@Nonnull Widget page, String title)  {
        JnaAssistant.INST().gtk_assistant_set_page_title(asCPointer(), asCPointerNotNull(page), title);
    }

    /**
     * Sets the page type for &#64;page.
     * <br>
     * <br>The page type determines the page behavior in the &#64;assistant.
     * @param page a page of &#64;assistant
     * @param type the new type for &#64;page
    */
    public void setPageType(@Nonnull Widget page, int type)  {
        JnaAssistant.INST().gtk_assistant_set_page_type(asCPointer(), asCPointerNotNull(page), type);
    }

    /**
     * Forces &#64;assistant to recompute the buttons state.
     * <br>
     * <br>GTK automatically takes care of this in most situations,
     * <br>e.g. when the user goes to a different page, or when the
     * <br>visibility or completeness of a page changes.
     * <br>
     * <br>One situation where it can be necessary to call this
     * <br>function is when changing a value on the current page
     * <br>affects the future page flow of the assistant.
    */
    public void updateButtonsState()  {
        JnaAssistant.INST().gtk_assistant_update_buttons_state(asCPointer());
    }

    public final static String SIGNAL_ON_APPLY = "apply";
    
    /**
     * Connect to signal "apply".
     * <br>See {@link OnApply#onApply} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApply(OnApply signal) {
        return connectSignal(SIGNAL_ON_APPLY, toOnApply(signal));
    }

    public final static String SIGNAL_ON_CANCEL = "cancel";
    
    /**
     * Connect to signal "cancel".
     * <br>See {@link OnCancel#onCancel} for signal description.
     * <br>Field {@link #SIGNAL_ON_CANCEL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCancel(OnCancel signal) {
        return connectSignal(SIGNAL_ON_CANCEL, toOnCancel(signal));
    }

    public final static String SIGNAL_ON_CLOSE = "close";
    
    /**
     * Connect to signal "close".
     * <br>See {@link OnClose#onClose} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClose(OnClose signal) {
        return connectSignal(SIGNAL_ON_CLOSE, toOnClose(signal));
    }

    public final static String SIGNAL_ON_ESCAPE = "escape";
    
    /**
     * Connect to signal "escape".
     * <br>See {@link OnEscape#onEscape} for signal description.
     * <br>Field {@link #SIGNAL_ON_ESCAPE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEscape(OnEscape signal) {
        return connectSignal(SIGNAL_ON_ESCAPE, toOnEscape(signal));
    }

    public final static String SIGNAL_ON_PREPARE = "prepare";
    
    /**
     * Connect to signal "prepare".
     * <br>See {@link OnPrepare#onPrepare} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREPARE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPrepare(OnPrepare signal) {
        return connectSignal(SIGNAL_ON_PREPARE, toOnPrepare(signal));
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

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaAssistant.INST().gtk_assistant_get_type(); 
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
