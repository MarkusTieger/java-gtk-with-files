/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The list of functions that can be implemented for the `GdkPaintable`
 * <br>interface.
 * <br>
 * <br>Note that apart from the [vfunc&#64;Gdk.Paintable.snapshot] function,
 * <br>no virtual function of this interface is mandatory to implement, though it
 * <br>is a good idea to implement [vfunc&#64;Gdk.Paintable.get_current_image]
 * <br>for non-static paintables and [vfunc&#64;Gdk.Paintable.get_flags] if the
 * <br>image is not dynamic as the default implementation returns no flags and
 * <br>that will make the implementation likely quite slow.
 * <p><a href="https://docs.gtk.org/gdk4/struct.PaintableInterface.html">https://docs.gtk.org/gdk4/struct.PaintableInterface.html</a></p>
*/
public class PaintableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PaintableInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSnapshot {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @param snapshot a `GdkSnapshot` to snapshot to
         * @param width width to snapshot in
         * @param height height to snapshot in
        */
        void onSnapshot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable, @Nonnull Snapshot snapshot, double width, double height);
    }
    
    private static JnaPaintableInterface.OnSnapshot toOnSnapshot(ch.bailu.gtk.type.Pointer instance, String methodName, OnSnapshot in) {
        JnaPaintableInterface.OnSnapshot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable, _snapshot, _width, _height) -> in.onSnapshot(__callback, new Paintable(new PointerContainer(_paintable)), new Snapshot(new PointerContainer(_snapshot)), _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCurrentImage {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @return An immutable paintable for the current   contents of &#64;paintable
        */
        Paintable onGetCurrentImage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable);
    }
    
    private static JnaPaintableInterface.OnGetCurrentImage toOnGetCurrentImage(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCurrentImage in) {
        JnaPaintableInterface.OnGetCurrentImage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable) -> in.onGetCurrentImage(__callback, new Paintable(new PointerContainer(_paintable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFlags {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @return The `GdkPaintableFlags` for this paintable
        */
        int onGetFlags(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable);
    }
    
    private static JnaPaintableInterface.OnGetFlags toOnGetFlags(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFlags in) {
        JnaPaintableInterface.OnGetFlags out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable) -> in.onGetFlags(__callback, new Paintable(new PointerContainer(_paintable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIntrinsicWidth {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @return the intrinsic width of &#64;paintable or 0 if none.
        */
        int onGetIntrinsicWidth(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable);
    }
    
    private static JnaPaintableInterface.OnGetIntrinsicWidth toOnGetIntrinsicWidth(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIntrinsicWidth in) {
        JnaPaintableInterface.OnGetIntrinsicWidth out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable) -> in.onGetIntrinsicWidth(__callback, new Paintable(new PointerContainer(_paintable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIntrinsicHeight {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @return the intrinsic height of &#64;paintable or 0 if none.
        */
        int onGetIntrinsicHeight(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable);
    }
    
    private static JnaPaintableInterface.OnGetIntrinsicHeight toOnGetIntrinsicHeight(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIntrinsicHeight in) {
        JnaPaintableInterface.OnGetIntrinsicHeight out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable) -> in.onGetIntrinsicHeight(__callback, new Paintable(new PointerContainer(_paintable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIntrinsicAspectRatio {
        /**
         * 
         * @param paintable a `GdkPaintable`
         * @return the intrinsic aspect ratio of &#64;paintable or 0 if none.
        */
        double onGetIntrinsicAspectRatio(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Paintable paintable);
    }
    
    private static JnaPaintableInterface.OnGetIntrinsicAspectRatio toOnGetIntrinsicAspectRatio(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIntrinsicAspectRatio in) {
        JnaPaintableInterface.OnGetIntrinsicAspectRatio out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_paintable) -> in.onGetIntrinsicAspectRatio(__callback, new Paintable(new PointerContainer(_paintable)));
            __callback.register(out);
        }
        return out;
    }

    public PaintableInterface(PointerContainer pointer) {
        super(pointer);
    }

    public PaintableInterface() {
        super(cast(JnaPaintableInterface.allocateStructure()));
    }

    private JnaPaintableInterface.Fields _fields;
    
    JnaPaintableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPaintableInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public static final String SNAPSHOT = "snapshot";

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public void setFieldSnapshot(OnSnapshot snapshot) {
        toFields().snapshot = toOnSnapshot(this, SNAPSHOT, snapshot);
        toFields().writeField(SNAPSHOT);
    }

    /**
     * 
     * <br>See {@link OnSnapshot#onSnapshot}
    */
    public JnaPaintableInterface.OnSnapshot getFieldSnapshot() {
       toFields().readField(SNAPSHOT);
       return toFields().snapshot;
    } 

    /**
     * 
     * <br>See {@link OnGetCurrentImage#onGetCurrentImage}
    */
    public static final String GET_CURRENT_IMAGE = "get_current_image";

    /**
     * 
     * <br>See {@link OnGetCurrentImage#onGetCurrentImage}
    */
    public void setFieldGetCurrentImage(OnGetCurrentImage get_current_image) {
        toFields().get_current_image = toOnGetCurrentImage(this, GET_CURRENT_IMAGE, get_current_image);
        toFields().writeField(GET_CURRENT_IMAGE);
    }

    /**
     * 
     * <br>See {@link OnGetCurrentImage#onGetCurrentImage}
    */
    public JnaPaintableInterface.OnGetCurrentImage getFieldGetCurrentImage() {
       toFields().readField(GET_CURRENT_IMAGE);
       return toFields().get_current_image;
    } 

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public static final String GET_FLAGS = "get_flags";

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public void setFieldGetFlags(OnGetFlags get_flags) {
        toFields().get_flags = toOnGetFlags(this, GET_FLAGS, get_flags);
        toFields().writeField(GET_FLAGS);
    }

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public JnaPaintableInterface.OnGetFlags getFieldGetFlags() {
       toFields().readField(GET_FLAGS);
       return toFields().get_flags;
    } 

    /**
     * 
     * <br>See {@link OnGetIntrinsicWidth#onGetIntrinsicWidth}
    */
    public static final String GET_INTRINSIC_WIDTH = "get_intrinsic_width";

    /**
     * 
     * <br>See {@link OnGetIntrinsicWidth#onGetIntrinsicWidth}
    */
    public void setFieldGetIntrinsicWidth(OnGetIntrinsicWidth get_intrinsic_width) {
        toFields().get_intrinsic_width = toOnGetIntrinsicWidth(this, GET_INTRINSIC_WIDTH, get_intrinsic_width);
        toFields().writeField(GET_INTRINSIC_WIDTH);
    }

    /**
     * 
     * <br>See {@link OnGetIntrinsicWidth#onGetIntrinsicWidth}
    */
    public JnaPaintableInterface.OnGetIntrinsicWidth getFieldGetIntrinsicWidth() {
       toFields().readField(GET_INTRINSIC_WIDTH);
       return toFields().get_intrinsic_width;
    } 

    /**
     * 
     * <br>See {@link OnGetIntrinsicHeight#onGetIntrinsicHeight}
    */
    public static final String GET_INTRINSIC_HEIGHT = "get_intrinsic_height";

    /**
     * 
     * <br>See {@link OnGetIntrinsicHeight#onGetIntrinsicHeight}
    */
    public void setFieldGetIntrinsicHeight(OnGetIntrinsicHeight get_intrinsic_height) {
        toFields().get_intrinsic_height = toOnGetIntrinsicHeight(this, GET_INTRINSIC_HEIGHT, get_intrinsic_height);
        toFields().writeField(GET_INTRINSIC_HEIGHT);
    }

    /**
     * 
     * <br>See {@link OnGetIntrinsicHeight#onGetIntrinsicHeight}
    */
    public JnaPaintableInterface.OnGetIntrinsicHeight getFieldGetIntrinsicHeight() {
       toFields().readField(GET_INTRINSIC_HEIGHT);
       return toFields().get_intrinsic_height;
    } 

    /**
     * 
     * <br>See {@link OnGetIntrinsicAspectRatio#onGetIntrinsicAspectRatio}
    */
    public static final String GET_INTRINSIC_ASPECT_RATIO = "get_intrinsic_aspect_ratio";

    /**
     * 
     * <br>See {@link OnGetIntrinsicAspectRatio#onGetIntrinsicAspectRatio}
    */
    public void setFieldGetIntrinsicAspectRatio(OnGetIntrinsicAspectRatio get_intrinsic_aspect_ratio) {
        toFields().get_intrinsic_aspect_ratio = toOnGetIntrinsicAspectRatio(this, GET_INTRINSIC_ASPECT_RATIO, get_intrinsic_aspect_ratio);
        toFields().writeField(GET_INTRINSIC_ASPECT_RATIO);
    }

    /**
     * 
     * <br>See {@link OnGetIntrinsicAspectRatio#onGetIntrinsicAspectRatio}
    */
    public JnaPaintableInterface.OnGetIntrinsicAspectRatio getFieldGetIntrinsicAspectRatio() {
       toFields().readField(GET_INTRINSIC_ASPECT_RATIO);
       return toFields().get_intrinsic_aspect_ratio;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Paintable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Paintable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
