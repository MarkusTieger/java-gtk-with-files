/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkExpander` allows the user to reveal its child by clicking
 * <br>on an expander triangle.
 * <br>
 * <br>![An example GtkExpander](expander.png)
 * <br>
 * <br>This is similar to the triangles used in a `GtkTreeView`.
 * <br>
 * <br>Normally you use an expander as you would use a frame; you create
 * <br>the child widget and use [method&#64;Gtk.Expander.set_child] to add it
 * <br>to the expander. When the expander is toggled, it will take care of
 * <br>showing and hiding the child automatically.
 * <br>
 * <br>&#35; Special Usage
 * <br>
 * <br>There are situations in which you may prefer to show and hide the
 * <br>expanded widget yourself, such as when you want to actually create
 * <br>the widget at expansion time. In this case, create a `GtkExpander`
 * <br>but do not add a child to it. The expander widget has an
 * <br>[property&#64;Gtk.Expander:expanded[ property which can be used to
 * <br>monitor its expansion state. You should watch this property with
 * <br>a signal connection as follows:
 * <br>
 * <br>```c
 * <br>static void
 * <br>expander_callback (GObject    *object,
 * <br>                   GParamSpec *param_spec,
 * <br>                   gpointer    user_data)
 * <br>{
 * <br>  GtkExpander *expander;
 * <br>
 * <br>  expander = GTK_EXPANDER (object);
 * <br>
 * <br>  if (gtk_expander_get_expanded (expander))
 * <br>    {
 * <br>      // Show or create widgets
 * <br>    }
 * <br>  else
 * <br>    {
 * <br>      // Hide or destroy widgets
 * <br>    }
 * <br>}
 * <br>
 * <br>static void
 * <br>create_expander (void)
 * <br>{
 * <br>  GtkWidget *expander = gtk_expander_new_with_mnemonic (&quot;_More Options&quot;);
 * <br>  g_signal_connect (expander, &quot;notify::expanded&quot;,
 * <br>                    G_CALLBACK (expander_callback), NULL);
 * <br>
 * <br>  // ...
 * <br>}
 * <br>```
 * <br>
 * <br>&#35; GtkExpander as GtkBuildable
 * <br>
 * <br>The `GtkExpander` implementation of the `GtkBuildable` interface supports
 * <br>placing a child in the label position by specifying “label” as the
 * <br>“type” attribute of a &lt;child&gt; element. A normal content child can be
 * <br>specified without specifying a &lt;child&gt; type attribute.
 * <br>
 * <br>An example of a UI definition fragment with GtkExpander:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkExpander&quot;&gt;
 * <br>  &lt;child type=&quot;label&quot;&gt;
 * <br>    &lt;object class=&quot;GtkLabel&quot; id=&quot;expander-label&quot;/&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkEntry&quot; id=&quot;expander-content&quot;/&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>expander
 * <br>╰── box
 * <br>    ├── title
 * <br>    │   ├── arrow
 * <br>    │   ╰── &lt;label widget&gt;
 * <br>    ╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>`GtkExpander` has three CSS nodes, the main node with the name expander,
 * <br>a subnode with name title and node below it with name arrow. The arrow of an
 * <br>expander that is showing its child gets the :checked pseudoclass added to it.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkExpander` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Expander.html">https://docs.gtk.org/gtk4/class.Expander.html</a></p>
*/
public class Expander extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Expander.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Activates the `GtkExpander`.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaExpander.OnActivate) (__self, __data) -> in.onActivate();
    }

    public Expander(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new expander using &#64;label as the text of the label.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key activates the button.
     * @param label the text of the label with an underscore   in front of the mnemonic character
     * @return a new `GtkExpander` widget.
    */
    public static Expander newWithMnemonicExpander(@Nullable ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaExpander.INST().gtk_expander_new_with_mnemonic(asCPointer(label)));
        if (__self.isNull()) {
            throw new NullPointerException("Expander:newWithMnemonic");
        }
        return new Expander(__self);
    }        
    

    /**
     * Creates a new expander using &#64;label as the text of the label.
     * <br>
     * <br>If characters in &#64;label are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label,
     * <br>use “__” (two underscores). The first underlined character represents
     * <br>a keyboard accelerator called a mnemonic.
     * <br>
     * <br>Pressing Alt and that key activates the button.
     * @param label the text of the label with an underscore   in front of the mnemonic character
     * @return a new `GtkExpander` widget.
    */
    public static Expander newWithMnemonicExpander(String label)  {
        PointerContainer __self = cast(JnaExpander.INST().gtk_expander_new_with_mnemonic(label));
        if (__self.isNull()) {
            throw new NullPointerException("Expander:newWithMnemonic");
        }
        return new Expander(__self);
    }        
    

    /**
     * Creates a new expander using &#64;label as the text of the label.
     * @param label the text of the label
    */
    public Expander(@Nullable ch.bailu.gtk.type.Str label) {
        super(cast(JnaExpander.INST().gtk_expander_new(asCPointer(label))));
    }

    /**
     * Creates a new expander using &#64;label as the text of the label.
     * @param label the text of the label
    */
    public Expander(String label) {
        super(cast(JnaExpander.INST().gtk_expander_new(label)));
    }

    /**
     * Gets the child widget of &#64;expander.
     * @return the child widget of &#64;expander
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaExpander.INST().gtk_expander_get_child(asCPointer())));
    }

    /**
     * Queries a `GtkExpander` and returns its current state.
     * <br>
     * <br>Returns %TRUE if the child widget is revealed.
     * @return the current state of the expander
    */
    public boolean getExpanded()  {
        return JnaExpander.INST().gtk_expander_get_expanded(asCPointer());
    }

    /**
     * Fetches the text from a label widget.
     * <br>
     * <br>This is including any embedded underlines indicating mnemonics and
     * <br>Pango markup, as set by [method&#64;Gtk.Expander.set_label]. If the label
     * <br>text has not been set the return value will be %NULL. This will be the
     * <br>case if you create an empty button with gtk_button_new() to use as a
     * <br>container.
     * @return The text of the label widget. This string is owned   by the widget and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaExpander.INST().gtk_expander_get_label(asCPointer())));
    }

    /**
     * Retrieves the label widget for the frame.
     * @return the label widget
    */
    public Widget getLabelWidget()  {
        return new Widget(new PointerContainer(JnaExpander.INST().gtk_expander_get_label_widget(asCPointer())));
    }

    /**
     * Returns whether the expander will resize the toplevel widget
     * <br>containing the expander upon resizing and collpasing.
     * @return the “resize toplevel” setting.
    */
    public boolean getResizeToplevel()  {
        return JnaExpander.INST().gtk_expander_get_resize_toplevel(asCPointer());
    }

    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     * @return %TRUE if the label’s text will be parsed for markup
    */
    public boolean getUseMarkup()  {
        return JnaExpander.INST().gtk_expander_get_use_markup(asCPointer());
    }

    /**
     * Returns whether an underline in the text indicates a mnemonic.
     * @return %TRUE if an embedded underline in the expander   label indicates the mnemonic accelerator keys
    */
    public boolean getUseUnderline()  {
        return JnaExpander.INST().gtk_expander_get_use_underline(asCPointer());
    }

    /**
     * Sets the child widget of &#64;expander.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaExpander.INST().gtk_expander_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the state of the expander.
     * <br>
     * <br>Set to %TRUE, if you want the child widget to be revealed,
     * <br>and %FALSE if you want the child widget to be hidden.
     * @param expanded whether the child widget is revealed
    */
    public void setExpanded(boolean expanded)  {
        JnaExpander.INST().gtk_expander_set_expanded(asCPointer(), expanded);
    }

    /**
     * Sets the text of the label of the expander to &#64;label.
     * <br>
     * <br>This will also clear any previously set labels.
     * @param label a string
    */
    public void setLabel(@Nullable ch.bailu.gtk.type.Str label)  {
        JnaExpander.INST().gtk_expander_set_label(asCPointer(), asCPointer(label));
    }

    /**
     * Sets the text of the label of the expander to &#64;label.
     * <br>
     * <br>This will also clear any previously set labels.
     * @param label a string
    */
    public void setLabel(String label)  {
        JnaExpander.INST().gtk_expander_set_label(asCPointer(), label);
    }

    /**
     * Set the label widget for the expander.
     * <br>
     * <br>This is the widget that will appear embedded alongside
     * <br>the expander arrow.
     * @param label_widget the new label widget
    */
    public void setLabelWidget(@Nullable Widget label_widget)  {
        JnaExpander.INST().gtk_expander_set_label_widget(asCPointer(), asCPointer(label_widget));
    }

    /**
     * Sets whether the expander will resize the toplevel widget
     * <br>containing the expander upon resizing and collpasing.
     * @param resize_toplevel whether to resize the toplevel
    */
    public void setResizeToplevel(boolean resize_toplevel)  {
        JnaExpander.INST().gtk_expander_set_resize_toplevel(asCPointer(), resize_toplevel);
    }

    /**
     * Sets whether the text of the label contains Pango markup.
     * @param use_markup %TRUE if the label’s text should be parsed for markup
    */
    public void setUseMarkup(boolean use_markup)  {
        JnaExpander.INST().gtk_expander_set_use_markup(asCPointer(), use_markup);
    }

    /**
     * If true, an underline in the text indicates a mnemonic.
     * @param use_underline %TRUE if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaExpander.INST().gtk_expander_set_use_underline(asCPointer(), use_underline);
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
        return JnaExpander.INST().gtk_expander_get_type(); 
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
