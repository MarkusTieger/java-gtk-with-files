/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkButton` widget is generally used to trigger a callback function that is
 * <br>called when the button is pressed.
 * <br>
 * <br>![An example GtkButton](button.png)
 * <br>
 * <br>The `GtkButton` widget can hold any valid child widget. That is, it can hold
 * <br>almost any other standard `GtkWidget`. The most commonly used child is the
 * <br>`GtkLabel`.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkButton` has a single CSS node with name button. The node will get the
 * <br>style classes .image-button or .text-button, if the content is just an
 * <br>image or label, respectively. It may also receive the .flat style class.
 * <br>When activating a button via the keyboard, the button will temporarily
 * <br>gain the .keyboard-activating style class.
 * <br>
 * <br>Other style classes that are commonly used with `GtkButton` include
 * <br>.suggested-action and .destructive-action. In special cases, buttons
 * <br>can be made round by adding the .circular style class.
 * <br>
 * <br>Button-like widgets like [class&#64;Gtk.ToggleButton], [class&#64;Gtk.MenuButton],
 * <br>[class&#64;Gtk.VolumeButton], [class&#64;Gtk.LockButton], [class&#64;Gtk.ColorButton]
 * <br>or [class&#64;Gtk.FontButton] use style classes such as .toggle, .popup, .scale,
 * <br>.lock, .color on the button node to differentiate themselves from a plain
 * <br>`GtkButton`.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Button.html">https://docs.gtk.org/gtk4/class.Button.html</a></p>
*/
public class Button extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Button.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to animate press then release.
         * <br>
         * <br>This is an action signal. Applications should never connect
         * <br>to this signal, but use the [signal&#64;Gtk.Button::clicked] signal.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnClicked {
        /**
         * Emitted when the button has been activated (pressed and released).
        */
        void onClicked();
    }
    
    private static com.sun.jna.Callback toOnClicked(OnClicked in) {
        return (in == null) ? null: (JnaButton.OnClicked) (__self, __data) -> in.onClicked();
    }

    public Button(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new button containing an icon from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead. If the current icon theme is changed, the icon
     * <br>will be updated appropriately.
     * @param icon_name an icon name
     * @return a new `GtkButton` displaying the themed icon
    */
    public static Button newFromIconNameButton(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_from_icon_name(asCPointer(icon_name)));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newFromIconName");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a new button containing an icon from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead. If the current icon theme is changed, the icon
     * <br>will be updated appropriately.
     * @param icon_name an icon name
     * @return a new `GtkButton` displaying the themed icon
    */
    public static Button newFromIconNameButton(String icon_name)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_from_icon_name(icon_name));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newFromIconName");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a `GtkButton` widget with a `GtkLabel` child.
     * @param label The text you want the `GtkLabel` to hold
     * @return The newly created `GtkButton` widget
    */
    public static Button newWithLabelButton(@Nonnull ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_with_label(asCPointerNotNull(label)));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newWithLabel");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a `GtkButton` widget with a `GtkLabel` child.
     * @param label The text you want the `GtkLabel` to hold
     * @return The newly created `GtkButton` widget
    */
    public static Button newWithLabelButton(String label)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_with_label(label));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newWithLabel");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a new `GtkButton` containing a label.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are underlined.
     * <br>If you need a literal underscore character in a label, use “__” (two
     * <br>underscores). The first underlined character represents a keyboard
     * <br>accelerator called a mnemonic. Pressing Alt and that key activates the button.
     * @param label The text of the button, with an underscore in front of the   mnemonic character
     * @return a new `GtkButton`
    */
    public static Button newWithMnemonicButton(@Nonnull ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_with_mnemonic(asCPointerNotNull(label)));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newWithMnemonic");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a new `GtkButton` containing a label.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are underlined.
     * <br>If you need a literal underscore character in a label, use “__” (two
     * <br>underscores). The first underlined character represents a keyboard
     * <br>accelerator called a mnemonic. Pressing Alt and that key activates the button.
     * @param label The text of the button, with an underscore in front of the   mnemonic character
     * @return a new `GtkButton`
    */
    public static Button newWithMnemonicButton(String label)  {
        PointerContainer __self = cast(JnaButton.INST().gtk_button_new_with_mnemonic(label));
        if (__self.isNull()) {
            throw new NullPointerException("Button:newWithMnemonic");
        }
        return new Button(__self);
    }        
    

    /**
     * Creates a new `GtkButton` widget.
     * <br>
     * <br>To add a child widget to the button, use [method&#64;Gtk.Button.set_child].
    */
    public Button() {
        super(cast(JnaButton.INST().gtk_button_new()));
    }

    /**
     * Gets the child widget of &#64;button.
     * @return the child widget of &#64;button
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaButton.INST().gtk_button_get_child(asCPointer())));
    }

    /**
     * Returns whether the button has a frame.
     * @return %TRUE if the button has a frame
    */
    public boolean getHasFrame()  {
        return JnaButton.INST().gtk_button_get_has_frame(asCPointer());
    }

    /**
     * Returns the icon name of the button.
     * <br>
     * <br>If the icon name has not been set with [method&#64;Gtk.Button.set_icon_name]
     * <br>the return value will be %NULL. This will be the case if you create
     * <br>an empty button with [ctor&#64;Gtk.Button.new] to use as a container.
     * @return The icon name set via [method&#64;Gtk.Button.set_icon_name]
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaButton.INST().gtk_button_get_icon_name(asCPointer())));
    }

    /**
     * Fetches the text from the label of the button.
     * <br>
     * <br>If the label text has not been set with [method&#64;Gtk.Button.set_label]
     * <br>the return value will be %NULL. This will be the case if you create
     * <br>an empty button with [ctor&#64;Gtk.Button.new] to use as a container.
     * @return The text of the label widget. This string is owned by the widget and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaButton.INST().gtk_button_get_label(asCPointer())));
    }

    /**
     * gets whether underlines are interpreted as mnemonics.
     * <br>
     * <br>See [method&#64;Gtk.Button.set_use_underline].
     * @return %TRUE if an embedded underline in the button label   indicates the mnemonic accelerator keys.
    */
    public boolean getUseUnderline()  {
        return JnaButton.INST().gtk_button_get_use_underline(asCPointer());
    }

    /**
     * Sets the child widget of &#64;button.
     * <br>
     * <br>Note that by using this API, you take full responsibility for setting
     * <br>up the proper accessibility label and description information for &#64;button.
     * <br>Most likely, you'll either set the accessibility label or description
     * <br>for &#64;button explicitly, or you'll set a labelled-by or described-by
     * <br>relations from &#64;child to &#64;button.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaButton.INST().gtk_button_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the style of the button.
     * <br>
     * <br>Buttons can has a flat appearance or have a frame drawn around them.
     * @param has_frame whether the button should have a visible frame
    */
    public void setHasFrame(boolean has_frame)  {
        JnaButton.INST().gtk_button_set_has_frame(asCPointer(), has_frame);
    }

    /**
     * Adds a `GtkImage` with the given icon name as a child.
     * <br>
     * <br>If &#64;button already contains a child widget, that child widget will
     * <br>be removed and replaced with the image.
     * @param icon_name An icon name
    */
    public void setIconName(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        JnaButton.INST().gtk_button_set_icon_name(asCPointer(), asCPointerNotNull(icon_name));
    }

    /**
     * Adds a `GtkImage` with the given icon name as a child.
     * <br>
     * <br>If &#64;button already contains a child widget, that child widget will
     * <br>be removed and replaced with the image.
     * @param icon_name An icon name
    */
    public void setIconName(String icon_name)  {
        JnaButton.INST().gtk_button_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the text of the label of the button to &#64;label.
     * <br>
     * <br>This will also clear any previously set labels.
     * @param label a string
    */
    public void setLabel(@Nonnull ch.bailu.gtk.type.Str label)  {
        JnaButton.INST().gtk_button_set_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Sets the text of the label of the button to &#64;label.
     * <br>
     * <br>This will also clear any previously set labels.
     * @param label a string
    */
    public void setLabel(String label)  {
        JnaButton.INST().gtk_button_set_label(asCPointer(), label);
    }

    /**
     * Sets whether to use underlines as mnemonics.
     * <br>
     * <br>If true, an underline in the text of the button label indicates
     * <br>the next character should be used for the mnemonic accelerator key.
     * @param use_underline %TRUE if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaButton.INST().gtk_button_set_use_underline(asCPointer(), use_underline);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
    }

    public final static String SIGNAL_ON_CLICKED = "clicked";
    
    /**
     * Connect to signal "clicked".
     * <br>See {@link OnClicked#onClicked} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLICKED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClicked(OnClicked signal) {
        return connectSignal(SIGNAL_ON_CLICKED, toOnClicked(signal));
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
        return JnaButton.INST().gtk_button_get_type(); 
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
