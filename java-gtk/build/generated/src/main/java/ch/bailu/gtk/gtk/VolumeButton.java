/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkVolumeButton` is a `GtkScaleButton` subclass tailored for
 * <br>volume control.
 * <br>
 * <br>![An example GtkVolumeButton](volumebutton.png)
 * <p><a href="https://docs.gtk.org/gtk4/class.VolumeButton.html">https://docs.gtk.org/gtk4/class.VolumeButton.html</a></p>
*/
public class VolumeButton extends ScaleButton {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VolumeButton.class.getCanonicalName());
    }

    public VolumeButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkVolumeButton`.
     * <br>
     * <br>The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * <br>Volume values can be obtained and modified using the functions from
     * <br>[class&#64;Gtk.ScaleButton].
    */
    public VolumeButton() {
        super(cast(JnaVolumeButton.INST().gtk_volume_button_new()));
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
        return JnaVolumeButton.INST().gtk_volume_button_get_type(); 
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
