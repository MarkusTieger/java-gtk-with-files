/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.FrameClass.html">https://docs.gtk.org/gtk4/struct.FrameClass.html</a></p>
*/
public class FrameClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FrameClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnComputeChildAllocation {
        /**
         * 
         * @param frame 
         * @param allocation 
        */
        void onComputeChildAllocation(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Frame frame, @Nonnull ch.bailu.gtk.gdk.Rectangle allocation);
    }
    
    private static JnaFrameClass.OnComputeChildAllocation toOnComputeChildAllocation(ch.bailu.gtk.type.Pointer instance, String methodName, OnComputeChildAllocation in) {
        JnaFrameClass.OnComputeChildAllocation out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_frame, _allocation) -> in.onComputeChildAllocation(__callback, new Frame(new PointerContainer(_frame)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_allocation)));
            __callback.register(out);
        }
        return out;
    }

    public FrameClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFrameClass.Fields _fields;
    
    JnaFrameClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFrameClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnComputeChildAllocation#onComputeChildAllocation}
    */
    public static final String COMPUTE_CHILD_ALLOCATION = "compute_child_allocation";

    /**
     * 
     * <br>See {@link OnComputeChildAllocation#onComputeChildAllocation}
    */
    public void setFieldComputeChildAllocation(OnComputeChildAllocation compute_child_allocation) {
        toFields().compute_child_allocation = toOnComputeChildAllocation(this, COMPUTE_CHILD_ALLOCATION, compute_child_allocation);
        toFields().writeField(COMPUTE_CHILD_ALLOCATION);
    }

    /**
     * 
     * <br>See {@link OnComputeChildAllocation#onComputeChildAllocation}
    */
    public JnaFrameClass.OnComputeChildAllocation getFieldComputeChildAllocation() {
       toFields().readField(COMPUTE_CHILD_ALLOCATION);
       return toFields().compute_child_allocation;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Frame.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Frame.getParentTypeID());
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
