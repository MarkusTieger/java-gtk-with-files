/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface SignalFlags {

    /**
     * Invoke the object method handler in the first emission stage.
    */
    int RUN_FIRST = 1;

    /**
     * Invoke the object method handler in the third emission stage.
    */
    int RUN_LAST = 2;

    /**
     * Invoke the object method handler in the last emission stage.
    */
    int RUN_CLEANUP = 4;

    /**
     * Signals being emitted for an object while currently being in
     * <br> emission for this very object will not be emitted recursively,
     * <br> but instead cause the first emission to be restarted.
    */
    int NO_RECURSE = 8;

    /**
     * This signal supports &quot;::detail&quot; appendices to the signal name
     * <br> upon handler connections and emissions.
    */
    int DETAILED = 16;

    /**
     * Action signals are signals that may freely be emitted on alive
     * <br> objects from user code via g_signal_emit() and friends, without
     * <br> the need of being embedded into extra code that performs pre or
     * <br> post emission adjustments on the object. They can also be thought
     * <br> of as object methods which can be called generically by
     * <br> third-party code.
    */
    int ACTION = 32;

    /**
     * No emissions hooks are supported for this signal.
    */
    int NO_HOOKS = 64;

    /**
     * Varargs signal emission will always collect the
     * <br>  arguments, even if there are no signal handlers connected.  Since 2.30.
    */
    int MUST_COLLECT = 128;

    /**
     * The signal is deprecated and will be removed
     * <br>  in a future version. A warning will be generated if it is connected while
     * <br>  running with G_ENABLE_DIAGNOSTIC=1.  Since 2.32.
    */
    int DEPRECATED = 256;

    /**
     * Only used in &#35;GSignalAccumulator accumulator
     * <br>  functions for the &#35;GSignalInvocationHint::run_type field to mark the first
     * <br>  call to the accumulator function for a signal emission.  Since 2.68.
    */
    int ACCUMULATOR_FIRST_RUN = 131072;

}

/*
enumeration-type
*/
