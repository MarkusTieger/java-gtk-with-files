/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure holding in-depth information for a specific signal.
 * <br>
 * <br>See also: g_signal_query()
 * <p><a href="https://docs.gtk.org/gobject/struct.SignalQuery.html">https://docs.gtk.org/gobject/struct.SignalQuery.html</a></p>
*/
public class SignalQuery extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SignalQuery.class.getCanonicalName());
    }

    public SignalQuery(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSignalQuery.Fields _fields;
    
    JnaSignalQuery.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSignalQuery.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The signal id of the signal being queried, or 0 if the
     * <br> signal to be queried was unknown.
    */
    public static final String SIGNAL_ID = "signal_id";

    /**
     * The signal id of the signal being queried, or 0 if the
     * <br> signal to be queried was unknown.
    */
    public void setFieldSignalId(int signal_id) {
        toFields().signal_id = signal_id;
        toFields().writeField(SIGNAL_ID);
    }

    /**
     * The signal id of the signal being queried, or 0 if the
     * <br> signal to be queried was unknown.
    */
    public int getFieldSignalId() {
       toFields().readField(SIGNAL_ID);
       return toFields().signal_id;
    } 

    /**
     * The signal name.
    */
    public static final String SIGNAL_NAME = "signal_name";

    /**
     * The signal name.
    */
    public void setFieldSignalName(ch.bailu.gtk.type.Str signal_name) {
        toFields().signal_name = signal_name.asCPointer();
        toFields().writeField(SIGNAL_NAME);
    }

    /**
     * The signal name.
    */
    public ch.bailu.gtk.type.Str getFieldSignalName() {
       toFields().readField(SIGNAL_NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().signal_name));
    } 

    /**
     * The interface/instance type that this signal can be emitted for.
    */
    public static final String ITYPE = "itype";

    /**
     * The interface/instance type that this signal can be emitted for.
    */
    public void setFieldItype(long itype) {
        toFields().itype = itype;
        toFields().writeField(ITYPE);
    }

    /**
     * The interface/instance type that this signal can be emitted for.
    */
    public long getFieldItype() {
       toFields().readField(ITYPE);
       return toFields().itype;
    } 

    /**
     * The signal flags as passed in to g_signal_new().
    */
    public static final String SIGNAL_FLAGS = "signal_flags";

    /**
     * The signal flags as passed in to g_signal_new().
    */
    public void setFieldSignalFlags(int signal_flags) {
        toFields().signal_flags = signal_flags;
        toFields().writeField(SIGNAL_FLAGS);
    }

    /**
     * The signal flags as passed in to g_signal_new().
    */
    public int getFieldSignalFlags() {
       toFields().readField(SIGNAL_FLAGS);
       return toFields().signal_flags;
    } 

    /**
     * The return type for user callbacks.
    */
    public static final String RETURN_TYPE = "return_type";

    /**
     * The return type for user callbacks.
    */
    public void setFieldReturnType(long return_type) {
        toFields().return_type = return_type;
        toFields().writeField(RETURN_TYPE);
    }

    /**
     * The return type for user callbacks.
    */
    public long getFieldReturnType() {
       toFields().readField(RETURN_TYPE);
       return toFields().return_type;
    } 

    /**
     * The number of parameters that user callbacks take.
    */
    public static final String N_PARAMS = "n_params";

    /**
     * The number of parameters that user callbacks take.
    */
    public void setFieldNParams(int n_params) {
        toFields().n_params = n_params;
        toFields().writeField(N_PARAMS);
    }

    /**
     * The number of parameters that user callbacks take.
    */
    public int getFieldNParams() {
       toFields().readField(N_PARAMS);
       return toFields().n_params;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:param_types:java-type-not-supported:{G_::{c:const GType*}}:{j:}]
*/
