/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutsSection` collects all the keyboard shortcuts and gestures
 * <br>for a major application mode.
 * <br>
 * <br>If your application needs multiple sections, you should give each
 * <br>section a unique [property&#64;Gtk.ShortcutsSection:section-name] and
 * <br>a [property&#64;Gtk.ShortcutsSection:title] that can be shown in the
 * <br>section selector of the [class&#64;Gtk.ShortcutsWindow].
 * <br>
 * <br>The [property&#64;Gtk.ShortcutsSection:max-height] property can be used
 * <br>to influence how the groups in the section are distributed over pages
 * <br>and columns.
 * <br>
 * <br>This widget is only meant to be used with [class&#64;Gtk.ShortcutsWindow].
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutsSection.html">https://docs.gtk.org/gtk4/class.ShortcutsSection.html</a></p>
*/
public class ShortcutsSection extends Box {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutsSection.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChangeCurrentPage {
        /**
         * 
         * @param object 
         * @return 
        */
        boolean onChangeCurrentPage(int object);
    }
    
    private static com.sun.jna.Callback toOnChangeCurrentPage(OnChangeCurrentPage in) {
        return (in == null) ? null: (JnaShortcutsSection.OnChangeCurrentPage) (__self, _object, __data) -> in.onChangeCurrentPage(_object);
    }

    public ShortcutsSection(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_CHANGE_CURRENT_PAGE = "change-current-page";
    
    /**
     * Connect to signal "change-current-page".
     * <br>See {@link OnChangeCurrentPage#onChangeCurrentPage} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGE_CURRENT_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChangeCurrentPage(OnChangeCurrentPage signal) {
        return connectSignal(SIGNAL_ON_CHANGE_CURRENT_PAGE, toOnChangeCurrentPage(signal));
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
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaShortcutsSection.INST().gtk_shortcuts_section_get_type(); 
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
