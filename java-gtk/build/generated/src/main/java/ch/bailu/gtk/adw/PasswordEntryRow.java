/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;EntryRow] tailored for entering secrets.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;password-entry-row-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;password-entry-row.png&quot; alt=&quot;password-entry-row&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>It does not show its contents in clear text, does not allow to copy it to the
 * <br>clipboard, and shows a warning when Caps Lock is engaged. If the underlying
 * <br>platform allows it, `AdwPasswordEntryRow` will also place the text in a
 * <br>non-pageable memory area, to avoid it being written out to disk by the
 * <br>operating system.
 * <br>
 * <br>It offer a way to reveal the contents in clear text.
 * <br>
 * <br>&#35;&#35; CSS Nodes
 * <br>
 * <br>`AdwPasswordEntryRow` has a single CSS node with name `row` that carries
 * <br>`.entry` and `.password` style classes.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PasswordEntryRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PasswordEntryRow.html</a></p>
*/
public class PasswordEntryRow extends EntryRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PasswordEntryRow.class.getCanonicalName());
    }

    public PasswordEntryRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPasswordEntryRow`.
    */
    public PasswordEntryRow() {
        super(cast(JnaPasswordEntryRow.INST().adw_password_entry_row_new()));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Actionable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Actionable}
    */
    public ch.bailu.gtk.gtk.Actionable asActionable() {
        return new ch.bailu.gtk.gtk.Actionable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Editable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Editable}
    */
    public ch.bailu.gtk.gtk.Editable asEditable() {
        return new ch.bailu.gtk.gtk.Editable(cast());
    }

    public static long getTypeID() { 
        return JnaPasswordEntryRow.INST().adw_password_entry_row_get_type(); 
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
