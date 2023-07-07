/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeModelFilterClass.html">https://docs.gtk.org/gtk4/struct.TreeModelFilterClass.html</a></p>
*/
public class TreeModelFilterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeModelFilterClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnVisible {
        /**
         * 
         * @param self 
         * @param child_model 
         * @param iter 
         * @return 
        */
        boolean onVisible(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModelFilter self, @Nonnull TreeModel child_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelFilterClass.OnVisible toOnVisible(ch.bailu.gtk.type.Pointer instance, String methodName, OnVisible in) {
        JnaTreeModelFilterClass.OnVisible out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _child_model, _iter) -> in.onVisible(__callback, new TreeModelFilter(new PointerContainer(_self)), new TreeModel(new PointerContainer(_child_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnModify {
        /**
         * 
         * @param self 
         * @param child_model 
         * @param iter 
         * @param value 
         * @param column 
        */
        void onModify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModelFilter self, @Nonnull TreeModel child_model, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.gobject.Value value, int column);
    }
    
    private static JnaTreeModelFilterClass.OnModify toOnModify(ch.bailu.gtk.type.Pointer instance, String methodName, OnModify in) {
        JnaTreeModelFilterClass.OnModify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self, _child_model, _iter, _value, _column) -> in.onModify(__callback, new TreeModelFilter(new PointerContainer(_self)), new TreeModel(new PointerContainer(_child_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), _column);
            __callback.register(out);
        }
        return out;
    }

    public TreeModelFilterClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTreeModelFilterClass.Fields _fields;
    
    JnaTreeModelFilterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeModelFilterClass.Fields(asCPointer());
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
     * <br>See {@link OnVisible#onVisible}
    */
    public static final String VISIBLE = "visible";

    /**
     * 
     * <br>See {@link OnVisible#onVisible}
    */
    public void setFieldVisible(OnVisible visible) {
        toFields().visible = toOnVisible(this, VISIBLE, visible);
        toFields().writeField(VISIBLE);
    }

    /**
     * 
     * <br>See {@link OnVisible#onVisible}
    */
    public JnaTreeModelFilterClass.OnVisible getFieldVisible() {
       toFields().readField(VISIBLE);
       return toFields().visible;
    } 

    /**
     * 
     * <br>See {@link OnModify#onModify}
    */
    public static final String MODIFY = "modify";

    /**
     * 
     * <br>See {@link OnModify#onModify}
    */
    public void setFieldModify(OnModify modify) {
        toFields().modify = toOnModify(this, MODIFY, modify);
        toFields().writeField(MODIFY);
    }

    /**
     * 
     * <br>See {@link OnModify#onModify}
    */
    public JnaTreeModelFilterClass.OnModify getFieldModify() {
       toFields().readField(MODIFY);
       return toFields().modify;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeModelFilter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeModelFilter.getParentTypeID());
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
