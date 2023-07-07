/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/</a></p>
*/
public interface FlapFoldPolicy {

    /**
     * Disable folding, the flap cannot reach narrow
     * <br>  sizes.
    */
    int NEVER = 0;

    /**
     * Keep the flap always folded.
    */
    int ALWAYS = 1;

    /**
     * Fold and unfold the flap based on available
     * <br>  space.
    */
    int AUTO = 2;

}

/*
enumeration-type
*/
