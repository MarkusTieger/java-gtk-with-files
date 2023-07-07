/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Native dialogs are platform dialogs that don't use `GtkDialog`.
 * <br>
 * <br>They are used in order to integrate better with a platform, by
 * <br>looking the same as other native applications and supporting
 * <br>platform specific features.
 * <br>
 * <br>The [class&#64;Gtk.Dialog] functions cannot be used on such objects,
 * <br>but we need a similar API in order to drive them. The `GtkNativeDialog`
 * <br>object is an API that allows you to do this. It allows you to set
 * <br>various common properties on the dialog, as well as show and hide
 * <br>it and get a [signal&#64;Gtk.NativeDialog::response] signal when the user
 * <br>finished with the dialog.
 * <br>
 * <br>Note that unlike `GtkDialog`, `GtkNativeDialog` objects are not
 * <br>toplevel widgets, and GTK does not keep them alive. It is your
 * <br>responsibility to keep a reference until you are done with the
 * <br>object.
 * <p><a href="https://docs.gtk.org/gtk4/class.NativeDialog.html">https://docs.gtk.org/gtk4/class.NativeDialog.html</a></p>
*/
public class NativeDialog extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NativeDialog.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnResponse {
        /**
         * Emitted when the user responds to the dialog.
         * <br>
         * <br>When this is called the dialog has been hidden.
         * <br>
         * <br>If you call [method&#64;Gtk.NativeDialog.hide] before the user
         * <br>responds to the dialog this signal will not be emitted.
         * @param response_id the response ID
        */
        void onResponse(int response_id);
    }
    
    private static com.sun.jna.Callback toOnResponse(OnResponse in) {
        return (in == null) ? null: (JnaNativeDialog.OnResponse) (__self, _response_id, __data) -> in.onResponse(_response_id);
    }

    public NativeDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Destroys a dialog.
     * <br>
     * <br>When a dialog is destroyed, it will break any references it holds
     * <br>to other objects.
     * <br>
     * <br>If it is visible it will be hidden and any underlying window system
     * <br>resources will be destroyed.
     * <br>
     * <br>Note that this does not release any reference to the object (as opposed
     * <br>to destroying a `GtkWindow`) because there is no reference from the
     * <br>windowing system to the `GtkNativeDialog`.
    */
    public void destroy()  {
        JnaNativeDialog.INST().gtk_native_dialog_destroy(asCPointer());
    }

    /**
     * Returns whether the dialog is modal.
     * @return %TRUE if the dialog is set to be modal
    */
    public boolean getModal()  {
        return JnaNativeDialog.INST().gtk_native_dialog_get_modal(asCPointer());
    }

    /**
     * Gets the title of the `GtkNativeDialog`.
     * @return the title of the dialog, or %NULL if none has    been set explicitly. The returned string is owned by the widget    and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNativeDialog.INST().gtk_native_dialog_get_title(asCPointer())));
    }

    /**
     * Fetches the transient parent for this window.
     * @return the transient parent for this window,   or %NULL if no transient parent has been set.
    */
    public Window getTransientFor()  {
        return new Window(new PointerContainer(JnaNativeDialog.INST().gtk_native_dialog_get_transient_for(asCPointer())));
    }

    /**
     * Determines whether the dialog is visible.
     * @return %TRUE if the dialog is visible
    */
    public boolean getVisible()  {
        return JnaNativeDialog.INST().gtk_native_dialog_get_visible(asCPointer());
    }

    /**
     * Hides the dialog if it is visible, aborting any interaction.
     * <br>
     * <br>Once this is called the [signal&#64;Gtk.NativeDialog::response] signal
     * <br>will *not* be emitted until after the next call to
     * <br>[method&#64;Gtk.NativeDialog.show].
     * <br>
     * <br>If the dialog is not visible this does nothing.
    */
    public void hide()  {
        JnaNativeDialog.INST().gtk_native_dialog_hide(asCPointer());
    }

    /**
     * Sets a dialog modal or non-modal.
     * <br>
     * <br>Modal dialogs prevent interaction with other windows in the same
     * <br>application. To keep modal dialogs on top of main application
     * <br>windows, use [method&#64;Gtk.NativeDialog.set_transient_for] to make
     * <br>the dialog transient for the parent; most window managers will
     * <br>then disallow lowering the dialog below the parent.
     * @param modal whether the window is modal
    */
    public void setModal(boolean modal)  {
        JnaNativeDialog.INST().gtk_native_dialog_set_modal(asCPointer(), modal);
    }

    /**
     * Sets the title of the `GtkNativeDialog.`
     * @param title title of the dialog
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaNativeDialog.INST().gtk_native_dialog_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of the `GtkNativeDialog.`
     * @param title title of the dialog
    */
    public void setTitle(String title)  {
        JnaNativeDialog.INST().gtk_native_dialog_set_title(asCPointer(), title);
    }

    /**
     * Dialog windows should be set transient for the main application
     * <br>window they were spawned from.
     * <br>
     * <br>This allows window managers to e.g. keep the dialog on top of the
     * <br>main window, or center the dialog over the main window.
     * <br>
     * <br>Passing %NULL for &#64;parent unsets the current transient window.
     * @param parent parent window
    */
    public void setTransientFor(@Nullable Window parent)  {
        JnaNativeDialog.INST().gtk_native_dialog_set_transient_for(asCPointer(), asCPointer(parent));
    }

    /**
     * Shows the dialog on the display.
     * <br>
     * <br>When the user accepts the state of the dialog the dialog will
     * <br>be automatically hidden and the [signal&#64;Gtk.NativeDialog::response]
     * <br>signal will be emitted.
     * <br>
     * <br>Multiple calls while the dialog is visible will be ignored.
    */
    public void show()  {
        JnaNativeDialog.INST().gtk_native_dialog_show(asCPointer());
    }

    public final static String SIGNAL_ON_RESPONSE = "response";
    
    /**
     * Connect to signal "response".
     * <br>See {@link OnResponse#onResponse} for signal description.
     * <br>Field {@link #SIGNAL_ON_RESPONSE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onResponse(OnResponse signal) {
        return connectSignal(SIGNAL_ON_RESPONSE, toOnResponse(signal));
    }

    public static long getTypeID() { 
        return JnaNativeDialog.INST().gtk_native_dialog_get_type(); 
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
