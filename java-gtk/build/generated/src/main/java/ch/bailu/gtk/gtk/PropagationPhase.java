/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface PropagationPhase {

    /**
     * Events are not delivered.
    */
    int NONE = 0;

    /**
     * Events are delivered in the capture phase. The
     * <br>  capture phase happens before the bubble phase, runs from the toplevel down
     * <br>  to the event widget. This option should only be used on containers that
     * <br>  might possibly handle events before their children do.
    */
    int CAPTURE = 1;

    /**
     * Events are delivered in the bubble phase. The bubble
     * <br>  phase happens after the capture phase, and before the default handlers
     * <br>  are run. This phase runs from the event widget, up to the toplevel.
    */
    int BUBBLE = 2;

    /**
     * Events are delivered in the default widget event handlers,
     * <br>  note that widget implementations must chain up on button, motion, touch and
     * <br>  grab broken handlers for controllers in this phase to be run.
    */
    int TARGET = 3;

}

/*
enumeration-type
*/
