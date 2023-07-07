/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GSourceCallbackFuncs` struct contains
 * <br>functions for managing callback objects.
 * <p><a href="https://docs.gtk.org/glib/struct.SourceCallbackFuncs.html">https://docs.gtk.org/glib/struct.SourceCallbackFuncs.html</a></p>
*/
public class SourceCallbackFuncs extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SourceCallbackFuncs.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRef {
        /**
         * 
         * @param cb_data 
        */
        void onRef(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer cb_data);
    }
    
    private static JnaSourceCallbackFuncs.OnRef toOnRef(ch.bailu.gtk.type.Pointer instance, String methodName, OnRef in) {
        JnaSourceCallbackFuncs.OnRef out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cb_data) -> in.onRef(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_cb_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnref {
        /**
         * 
         * @param cb_data 
        */
        void onUnref(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer cb_data);
    }
    
    private static JnaSourceCallbackFuncs.OnUnref toOnUnref(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnref in) {
        JnaSourceCallbackFuncs.OnUnref out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cb_data) -> in.onUnref(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_cb_data)));
            __callback.register(out);
        }
        return out;
    }

    public SourceCallbackFuncs(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSourceCallbackFuncs.Fields _fields;
    
    JnaSourceCallbackFuncs.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSourceCallbackFuncs.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnRef#onRef}
    */
    public static final String REF = "ref";

    /**
     * 
     * <br>See {@link OnRef#onRef}
    */
    public void setFieldRef(OnRef ref) {
        toFields().ref = toOnRef(this, REF, ref);
        toFields().writeField(REF);
    }

    /**
     * 
     * <br>See {@link OnRef#onRef}
    */
    public JnaSourceCallbackFuncs.OnRef getFieldRef() {
       toFields().readField(REF);
       return toFields().ref;
    } 

    /**
     * 
     * <br>See {@link OnUnref#onUnref}
    */
    public static final String UNREF = "unref";

    /**
     * 
     * <br>See {@link OnUnref#onUnref}
    */
    public void setFieldUnref(OnUnref unref) {
        toFields().unref = toOnUnref(this, UNREF, unref);
        toFields().writeField(UNREF);
    }

    /**
     * 
     * <br>See {@link OnUnref#onUnref}
    */
    public JnaSourceCallbackFuncs.OnUnref getFieldUnref() {
       toFields().readField(UNREF);
       return toFields().unref;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:get:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
