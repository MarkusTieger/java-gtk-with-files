/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSignalInvocationHint structure is used to pass on additional information
 * <br>to callbacks during a signal emission.
 * <p><a href="https://docs.gtk.org/gobject/struct.SignalInvocationHint.html">https://docs.gtk.org/gobject/struct.SignalInvocationHint.html</a></p>
*/
public class SignalInvocationHint extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SignalInvocationHint.class.getCanonicalName());
    }

    public SignalInvocationHint(PointerContainer pointer) {
        super(pointer);
    }

    public SignalInvocationHint() {
        super(cast(JnaSignalInvocationHint.allocateStructure()));
    }

    private JnaSignalInvocationHint.Fields _fields;
    
    JnaSignalInvocationHint.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSignalInvocationHint.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The signal id of the signal invoking the callback
    */
    public static final String SIGNAL_ID = "signal_id";

    /**
     * The signal id of the signal invoking the callback
    */
    public void setFieldSignalId(int signal_id) {
        toFields().signal_id = signal_id;
        toFields().writeField(SIGNAL_ID);
    }

    /**
     * The signal id of the signal invoking the callback
    */
    public int getFieldSignalId() {
       toFields().readField(SIGNAL_ID);
       return toFields().signal_id;
    } 

    /**
     * The detail passed on for this emission
    */
    public static final String DETAIL = "detail";

    /**
     * The detail passed on for this emission
    */
    public void setFieldDetail(int detail) {
        toFields().detail = detail;
        toFields().writeField(DETAIL);
    }

    /**
     * The detail passed on for this emission
    */
    public int getFieldDetail() {
       toFields().readField(DETAIL);
       return toFields().detail;
    } 

    /**
     * The stage the signal emission is currently in, this
     * <br> field will contain one of %G_SIGNAL_RUN_FIRST,
     * <br> %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     * <br> %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     * <br> function for a signal emission.
    */
    public static final String RUN_TYPE = "run_type";

    /**
     * The stage the signal emission is currently in, this
     * <br> field will contain one of %G_SIGNAL_RUN_FIRST,
     * <br> %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     * <br> %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     * <br> function for a signal emission.
    */
    public void setFieldRunType(int run_type) {
        toFields().run_type = run_type;
        toFields().writeField(RUN_TYPE);
    }

    /**
     * The stage the signal emission is currently in, this
     * <br> field will contain one of %G_SIGNAL_RUN_FIRST,
     * <br> %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     * <br> %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     * <br> function for a signal emission.
    */
    public int getFieldRunType() {
       toFields().readField(RUN_TYPE);
       return toFields().run_type;
    } 

}

/*
record-type
all-fields-supported
*/
