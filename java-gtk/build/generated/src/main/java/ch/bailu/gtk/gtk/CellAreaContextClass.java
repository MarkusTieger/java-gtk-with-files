/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.CellAreaContextClass.html">https://docs.gtk.org/gtk4/struct.CellAreaContextClass.html</a></p>
*/
public class CellAreaContextClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellAreaContextClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAllocate {
        /**
         * 
         * @param context a `GtkCellAreaContext`
         * @param width the allocated width for all `GtkTreeModel` rows rendered   with &#64;context, or -1
         * @param height the allocated height for all `GtkTreeModel` rows rendered   with &#64;context, or -1
        */
        void onAllocate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellAreaContext context, int width, int height);
    }
    
    private static JnaCellAreaContextClass.OnAllocate toOnAllocate(ch.bailu.gtk.type.Pointer instance, String methodName, OnAllocate in) {
        JnaCellAreaContextClass.OnAllocate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _width, _height) -> in.onAllocate(__callback, new CellAreaContext(new PointerContainer(_context)), _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReset {
        /**
         * 
         * @param context a `GtkCellAreaContext`
        */
        void onReset(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellAreaContext context);
    }
    
    private static JnaCellAreaContextClass.OnReset toOnReset(ch.bailu.gtk.type.Pointer instance, String methodName, OnReset in) {
        JnaCellAreaContextClass.OnReset out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context) -> in.onReset(__callback, new CellAreaContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredHeightForWidth {
        /**
         * 
         * @param context a `GtkCellAreaContext`
         * @param width a proposed width for allocation
         * @param minimum_height location to store the minimum height
         * @param natural_height location to store the natural height
        */
        void onGetPreferredHeightForWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellAreaContext context, int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height);
    }
    
    private static JnaCellAreaContextClass.OnGetPreferredHeightForWidth toOnGetPreferredHeightForWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredHeightForWidth in) {
        JnaCellAreaContextClass.OnGetPreferredHeightForWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _width, _minimum_height, _natural_height) -> in.onGetPreferredHeightForWidth(__callback, new CellAreaContext(new PointerContainer(_context)), _width, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_height)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_height)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPreferredWidthForHeight {
        /**
         * 
         * @param context a `GtkCellAreaContext`
         * @param height a proposed height for allocation
         * @param minimum_width location to store the minimum width
         * @param natural_width location to store the natural width
        */
        void onGetPreferredWidthForHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellAreaContext context, int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width);
    }
    
    private static JnaCellAreaContextClass.OnGetPreferredWidthForHeight toOnGetPreferredWidthForHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPreferredWidthForHeight in) {
        JnaCellAreaContextClass.OnGetPreferredWidthForHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _height, _minimum_width, _natural_width) -> in.onGetPreferredWidthForHeight(__callback, new CellAreaContext(new PointerContainer(_context)), _height, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_width)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_width)));
            __callback.register(out);
        }
        return out;
    }

    public CellAreaContextClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCellAreaContextClass.Fields _fields;
    
    JnaCellAreaContextClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCellAreaContextClass.Fields(asCPointer());
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
     * <br>See {@link OnAllocate#onAllocate}
    */
    public static final String ALLOCATE = "allocate";

    /**
     * 
     * <br>See {@link OnAllocate#onAllocate}
    */
    public void setFieldAllocate(OnAllocate allocate) {
        toFields().allocate = toOnAllocate(this, ALLOCATE, allocate);
        toFields().writeField(ALLOCATE);
    }

    /**
     * 
     * <br>See {@link OnAllocate#onAllocate}
    */
    public JnaCellAreaContextClass.OnAllocate getFieldAllocate() {
       toFields().readField(ALLOCATE);
       return toFields().allocate;
    } 

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public static final String RESET = "reset";

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public void setFieldReset(OnReset reset) {
        toFields().reset = toOnReset(this, RESET, reset);
        toFields().writeField(RESET);
    }

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public JnaCellAreaContextClass.OnReset getFieldReset() {
       toFields().readField(RESET);
       return toFields().reset;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public static final String GET_PREFERRED_HEIGHT_FOR_WIDTH = "get_preferred_height_for_width";

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public void setFieldGetPreferredHeightForWidth(OnGetPreferredHeightForWidth get_preferred_height_for_width) {
        toFields().get_preferred_height_for_width = toOnGetPreferredHeightForWidth(this, GET_PREFERRED_HEIGHT_FOR_WIDTH, get_preferred_height_for_width);
        toFields().writeField(GET_PREFERRED_HEIGHT_FOR_WIDTH);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredHeightForWidth#onGetPreferredHeightForWidth}
    */
    public JnaCellAreaContextClass.OnGetPreferredHeightForWidth getFieldGetPreferredHeightForWidth() {
       toFields().readField(GET_PREFERRED_HEIGHT_FOR_WIDTH);
       return toFields().get_preferred_height_for_width;
    } 

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public static final String GET_PREFERRED_WIDTH_FOR_HEIGHT = "get_preferred_width_for_height";

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public void setFieldGetPreferredWidthForHeight(OnGetPreferredWidthForHeight get_preferred_width_for_height) {
        toFields().get_preferred_width_for_height = toOnGetPreferredWidthForHeight(this, GET_PREFERRED_WIDTH_FOR_HEIGHT, get_preferred_width_for_height);
        toFields().writeField(GET_PREFERRED_WIDTH_FOR_HEIGHT);
    }

    /**
     * 
     * <br>See {@link OnGetPreferredWidthForHeight#onGetPreferredWidthForHeight}
    */
    public JnaCellAreaContextClass.OnGetPreferredWidthForHeight getFieldGetPreferredWidthForHeight() {
       toFields().readField(GET_PREFERRED_WIDTH_FOR_HEIGHT);
       return toFields().get_preferred_width_for_height;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellAreaContext.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CellAreaContext.getParentTypeID());
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
