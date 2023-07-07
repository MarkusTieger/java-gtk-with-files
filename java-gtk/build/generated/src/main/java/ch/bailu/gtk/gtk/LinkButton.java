/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkLinkButton` is a button with a hyperlink.
 * <br>
 * <br>![An example GtkLinkButton](link-button.png)
 * <br>
 * <br>It is useful to show quick links to resources.
 * <br>
 * <br>A link button is created by calling either [ctor&#64;Gtk.LinkButton.new] or
 * <br>[ctor&#64;Gtk.LinkButton.new_with_label]. If using the former, the URI you
 * <br>pass to the constructor is used as a label for the widget.
 * <br>
 * <br>The URI bound to a `GtkLinkButton` can be set specifically using
 * <br>[method&#64;Gtk.LinkButton.set_uri].
 * <br>
 * <br>By default, `GtkLinkButton` calls [func&#64;Gtk.show_uri] when the button
 * <br>is clicked. This behaviour can be overridden by connecting to the
 * <br>[signal&#64;Gtk.LinkButton::activate-link] signal and returning %TRUE from
 * <br>the signal handler.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkLinkButton` has a single CSS node with name button. To differentiate
 * <br>it from a plain `GtkButton`, it gets the .link style class.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkLinkButton` uses the %GTK_ACCESSIBLE_ROLE_LINK role.
 * <p><a href="https://docs.gtk.org/gtk4/class.LinkButton.html">https://docs.gtk.org/gtk4/class.LinkButton.html</a></p>
*/
public class LinkButton extends Button {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LinkButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateLink {
        /**
         * Emitted each time the `GtkLinkButton` is clicked.
         * <br>
         * <br>The default handler will call [func&#64;Gtk.show_uri] with the URI
         * <br>stored inside the [property&#64;Gtk.LinkButton:uri] property.
         * <br>
         * <br>To override the default behavior, you can connect to the
         * <br>::activate-link signal and stop the propagation of the signal
         * <br>by returning %TRUE from your handler.
         * @return %TRUE if the signal has been handled
        */
        boolean onActivateLink();
    }
    
    private static com.sun.jna.Callback toOnActivateLink(OnActivateLink in) {
        return (in == null) ? null: (JnaLinkButton.OnActivateLink) (__self, __data) -> in.onActivateLink();
    }

    public LinkButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkLinkButton` containing a label.
     * @param uri a valid URI
     * @param label the text of the button
     * @return a new link button widget.
    */
    public static LinkButton newWithLabelLinkButton(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaLinkButton.INST().gtk_link_button_new_with_label(asCPointerNotNull(uri), asCPointer(label)));
        if (__self.isNull()) {
            throw new NullPointerException("LinkButton:newWithLabel");
        }
        return new LinkButton(__self);
    }        
    

    /**
     * Creates a new `GtkLinkButton` containing a label.
     * @param uri a valid URI
     * @param label the text of the button
     * @return a new link button widget.
    */
    public static LinkButton newWithLabelLinkButton(String uri, String label)  {
        PointerContainer __self = cast(JnaLinkButton.INST().gtk_link_button_new_with_label(uri, label));
        if (__self.isNull()) {
            throw new NullPointerException("LinkButton:newWithLabel");
        }
        return new LinkButton(__self);
    }        
    

    /**
     * Creates a new `GtkLinkButton` with the URI as its text.
     * @param uri a valid URI
    */
    public LinkButton(@Nonnull ch.bailu.gtk.type.Str uri) {
        super(cast(JnaLinkButton.INST().gtk_link_button_new(asCPointerNotNull(uri))));
    }

    /**
     * Creates a new `GtkLinkButton` with the URI as its text.
     * @param uri a valid URI
    */
    public LinkButton(String uri) {
        super(cast(JnaLinkButton.INST().gtk_link_button_new(uri)));
    }

    /**
     * Retrieves the URI of the `GtkLinkButton`.
     * @return a valid URI. The returned string is owned by the link button   and should not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getUri()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLinkButton.INST().gtk_link_button_get_uri(asCPointer())));
    }

    /**
     * Retrieves the “visited” state of the `GtkLinkButton`.
     * <br>
     * <br>The button becomes visited when it is clicked. If the URI
     * <br>is changed on the button, the “visited” state is unset again.
     * <br>
     * <br>The state may also be changed using [method&#64;Gtk.LinkButton.set_visited].
     * @return %TRUE if the link has been visited, %FALSE otherwise
    */
    public boolean getVisited()  {
        return JnaLinkButton.INST().gtk_link_button_get_visited(asCPointer());
    }

    /**
     * Sets &#64;uri as the URI where the `GtkLinkButton` points.
     * <br>
     * <br>As a side-effect this unsets the “visited” state of the button.
     * @param uri a valid URI
    */
    public void setUri(@Nonnull ch.bailu.gtk.type.Str uri)  {
        JnaLinkButton.INST().gtk_link_button_set_uri(asCPointer(), asCPointerNotNull(uri));
    }

    /**
     * Sets &#64;uri as the URI where the `GtkLinkButton` points.
     * <br>
     * <br>As a side-effect this unsets the “visited” state of the button.
     * @param uri a valid URI
    */
    public void setUri(String uri)  {
        JnaLinkButton.INST().gtk_link_button_set_uri(asCPointer(), uri);
    }

    /**
     * Sets the “visited” state of the `GtkLinkButton`.
     * <br>
     * <br>See [method&#64;Gtk.LinkButton.get_visited] for more details.
     * @param visited the new “visited” state
    */
    public void setVisited(boolean visited)  {
        JnaLinkButton.INST().gtk_link_button_set_visited(asCPointer(), visited);
    }

    public final static String SIGNAL_ON_ACTIVATE_LINK = "activate-link";
    
    /**
     * Connect to signal "activate-link".
     * <br>See {@link OnActivateLink#onActivateLink} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_LINK} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateLink(OnActivateLink signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_LINK, toOnActivateLink(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Actionable}. Call this to get access to interface functions.
     * @return {@link Actionable}
    */
    public Actionable asActionable() {
        return new Actionable(cast());
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
        return JnaLinkButton.INST().gtk_link_button_get_type(); 
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
