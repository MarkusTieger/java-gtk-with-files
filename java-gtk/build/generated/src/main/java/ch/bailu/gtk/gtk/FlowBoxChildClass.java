/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.FlowBoxChildClass.html">https://docs.gtk.org/gtk4/struct.FlowBoxChildClass.html</a></p>
*/
public class FlowBoxChildClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlowBoxChildClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param child 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FlowBoxChild child);
    }
    
    private static JnaFlowBoxChildClass.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaFlowBoxChildClass.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_child) -> in.onActivate(__callback, new FlowBoxChild(new PointerContainer(_child)));
            __callback.register(out);
        }
        return out;
    }

    public FlowBoxChildClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFlowBoxChildClass.Fields _fields;
    
    JnaFlowBoxChildClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFlowBoxChildClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaFlowBoxChildClass.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FlowBoxChild.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(FlowBoxChild.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
