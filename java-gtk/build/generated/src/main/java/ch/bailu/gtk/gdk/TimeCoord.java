/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkTimeCoord` stores a single event in a motion history.
 * <br>
 * <br>To check whether an axis is present, check whether the corresponding
 * <br>flag from the [flags&#64;Gdk.AxisFlags] enumeration is set in the &#64;flags
 * <br>To access individual axis values, use the values of the values of
 * <br>the [enum&#64;Gdk.AxisUse] enumerations as indices.
 * <p><a href="https://docs.gtk.org/gdk4/struct.TimeCoord.html">https://docs.gtk.org/gdk4/struct.TimeCoord.html</a></p>
*/
public class TimeCoord extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TimeCoord.class.getCanonicalName());
    }

    public TimeCoord(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTimeCoord.Fields _fields;
    
    JnaTimeCoord.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTimeCoord.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The timestamp for this event
    */
    public static final String TIME = "time";

    /**
     * The timestamp for this event
    */
    public void setFieldTime(int time) {
        toFields().time = time;
        toFields().writeField(TIME);
    }

    /**
     * The timestamp for this event
    */
    public int getFieldTime() {
       toFields().readField(TIME);
       return toFields().time;
    } 

    /**
     * Flags indicating what axes are present, see [flags&#64;Gdk.AxisFlags]
    */
    public static final String FLAGS = "flags";

    /**
     * Flags indicating what axes are present, see [flags&#64;Gdk.AxisFlags]
    */
    public void setFieldFlags(int flags) {
        toFields().flags = flags;
        toFields().writeField(FLAGS);
    }

    /**
     * Flags indicating what axes are present, see [flags&#64;Gdk.AxisFlags]
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:axes:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
