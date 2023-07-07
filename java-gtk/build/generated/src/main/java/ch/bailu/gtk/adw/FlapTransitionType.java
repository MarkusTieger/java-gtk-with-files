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
public interface FlapTransitionType {

    /**
     * The flap slides over the content, which is
     * <br>  dimmed. When folded, only the flap can be swiped.
    */
    int OVER = 0;

    /**
     * The content slides over the flap. Only the
     * <br>  content can be swiped.
    */
    int UNDER = 1;

    /**
     * The flap slides offscreen when hidden,
     * <br>  neither the flap nor content overlap each other. Both widgets can be
     * <br>  swiped.
    */
    int SLIDE = 2;

}

/*
enumeration-type
*/
