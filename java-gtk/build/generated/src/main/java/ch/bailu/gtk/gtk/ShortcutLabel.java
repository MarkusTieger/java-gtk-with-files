/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkShortcutLabel` displays a single keyboard shortcut or gesture.
 * <br>
 * <br>The main use case for `GtkShortcutLabel` is inside a [class&#64;Gtk.ShortcutsWindow].
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutLabel.html">https://docs.gtk.org/gtk4/class.ShortcutLabel.html</a></p>
*/
public class ShortcutLabel extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutLabel.class.getCanonicalName());
    }

    public ShortcutLabel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkShortcutLabel` with &#64;accelerator set.
     * @param accelerator the initial accelerator
    */
    public ShortcutLabel(@Nonnull ch.bailu.gtk.type.Str accelerator) {
        super(cast(JnaShortcutLabel.INST().gtk_shortcut_label_new(asCPointerNotNull(accelerator))));
    }

    /**
     * Creates a new `GtkShortcutLabel` with &#64;accelerator set.
     * @param accelerator the initial accelerator
    */
    public ShortcutLabel(String accelerator) {
        super(cast(JnaShortcutLabel.INST().gtk_shortcut_label_new(accelerator)));
    }

    /**
     * Retrieves the current accelerator of &#64;self.
     * @return the current accelerator.
    */
    public ch.bailu.gtk.type.Str getAccelerator()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaShortcutLabel.INST().gtk_shortcut_label_get_accelerator(asCPointer())));
    }

    /**
     * Retrieves the text that is displayed when no accelerator is set.
     * @return the current text displayed when no accelerator is set.
    */
    public ch.bailu.gtk.type.Str getDisabledText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaShortcutLabel.INST().gtk_shortcut_label_get_disabled_text(asCPointer())));
    }

    /**
     * Sets the accelerator to be displayed by &#64;self.
     * @param accelerator the new accelerator
    */
    public void setAccelerator(@Nonnull ch.bailu.gtk.type.Str accelerator)  {
        JnaShortcutLabel.INST().gtk_shortcut_label_set_accelerator(asCPointer(), asCPointerNotNull(accelerator));
    }

    /**
     * Sets the accelerator to be displayed by &#64;self.
     * @param accelerator the new accelerator
    */
    public void setAccelerator(String accelerator)  {
        JnaShortcutLabel.INST().gtk_shortcut_label_set_accelerator(asCPointer(), accelerator);
    }

    /**
     * Sets the text to be displayed by &#64;self when no accelerator is set.
     * @param disabled_text the text to be displayed when no accelerator is set
    */
    public void setDisabledText(@Nonnull ch.bailu.gtk.type.Str disabled_text)  {
        JnaShortcutLabel.INST().gtk_shortcut_label_set_disabled_text(asCPointer(), asCPointerNotNull(disabled_text));
    }

    /**
     * Sets the text to be displayed by &#64;self when no accelerator is set.
     * @param disabled_text the text to be displayed when no accelerator is set
    */
    public void setDisabledText(String disabled_text)  {
        JnaShortcutLabel.INST().gtk_shortcut_label_set_disabled_text(asCPointer(), disabled_text);
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
        return JnaShortcutLabel.INST().gtk_shortcut_label_get_type(); 
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
