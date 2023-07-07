/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a precise time, with seconds and microseconds.
 * <br>
 * <br>Similar to the struct timeval returned by the `gettimeofday()`
 * <br>UNIX system call.
 * <br>
 * <br>GLib is attempting to unify around the use of 64-bit integers to
 * <br>represent microsecond-precision time. As such, this type will be
 * <br>removed from a future version of GLib. A consequence of using `glong` for
 * <br>`tv_sec` is that on 32-bit systems `GTimeVal` is subject to the year 2038
 * <br>problem.
 * <p><a href="https://docs.gtk.org/glib/struct.TimeVal.html">https://docs.gtk.org/glib/struct.TimeVal.html</a></p>
*/
public class TimeVal extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TimeVal.class.getCanonicalName());
    }

    public TimeVal(PointerContainer pointer) {
        super(pointer);
    }

    public TimeVal() {
        super(cast(JnaTimeVal.allocateStructure()));
    }

    private JnaTimeVal.Fields _fields;
    
    JnaTimeVal.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTimeVal.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * seconds
    */
    public static final String TV_SEC = "tv_sec";

    /**
     * seconds
    */
    public void setFieldTvSec(long tv_sec) {
        toFields().tv_sec = tv_sec;
        toFields().writeField(TV_SEC);
    }

    /**
     * seconds
    */
    public long getFieldTvSec() {
       toFields().readField(TV_SEC);
       return toFields().tv_sec;
    } 

    /**
     * microseconds
    */
    public static final String TV_USEC = "tv_usec";

    /**
     * microseconds
    */
    public void setFieldTvUsec(long tv_usec) {
        toFields().tv_usec = tv_usec;
        toFields().writeField(TV_USEC);
    }

    /**
     * microseconds
    */
    public long getFieldTvUsec() {
       toFields().readField(TV_USEC);
       return toFields().tv_usec;
    } 

}

/*
record-type
all-fields-supported

[MethodModel:cb-deprecated:add:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:glong}}:{j:long}]

[MethodModel:cb-deprecated:toIso8601:[ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]]

[MethodModel:cb-deprecated:fromIso8601:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]
*/
