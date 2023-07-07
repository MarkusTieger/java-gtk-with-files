/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Modules supporting animations must derive a type from
 * <br>&#35;GdkPixbufAnimation, providing suitable implementations of the
 * <br>virtual functions.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufAnimationClass.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufAnimationClass.html</a></p>
*/
public class PixbufAnimationClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufAnimationClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIsStaticImage {
        /**
         * 
         * @param animation a &#35;GdkPixbufAnimation
         * @return `TRUE` if the &quot;animation&quot; was really just an image
        */
        boolean onIsStaticImage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimation animation);
    }
    
    private static JnaPixbufAnimationClass.OnIsStaticImage toOnIsStaticImage(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsStaticImage in) {
        JnaPixbufAnimationClass.OnIsStaticImage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_animation) -> in.onIsStaticImage(__callback, new PixbufAnimation(new PointerContainer(_animation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStaticImage {
        /**
         * 
         * @param animation a &#35;GdkPixbufAnimation
         * @return unanimated image representing the animation
        */
        Pixbuf onGetStaticImage(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimation animation);
    }
    
    private static JnaPixbufAnimationClass.OnGetStaticImage toOnGetStaticImage(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStaticImage in) {
        JnaPixbufAnimationClass.OnGetStaticImage out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_animation) -> in.onGetStaticImage(__callback, new PixbufAnimation(new PointerContainer(_animation))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSize {
        /**
         * 
         * @param animation 
         * @param width 
         * @param height 
        */
        void onGetSize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimation animation, @Nonnull ch.bailu.gtk.type.Int width, @Nonnull ch.bailu.gtk.type.Int height);
    }
    
    private static JnaPixbufAnimationClass.OnGetSize toOnGetSize(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSize in) {
        JnaPixbufAnimationClass.OnGetSize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_animation, _width, _height) -> in.onGetSize(__callback, new PixbufAnimation(new PointerContainer(_animation)), new ch.bailu.gtk.type.Int(new PointerContainer(_width)), new ch.bailu.gtk.type.Int(new PointerContainer(_height)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIter {
        /**
         * 
         * @param animation a &#35;GdkPixbufAnimation
         * @param start_time time when the animation starts playing
         * @return an iterator to move over the animation
        */
        PixbufAnimationIter onGetIter(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimation animation, @Nullable ch.bailu.gtk.glib.TimeVal start_time);
    }
    
    private static JnaPixbufAnimationClass.OnGetIter toOnGetIter(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIter in) {
        JnaPixbufAnimationClass.OnGetIter out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_animation, _start_time) -> in.onGetIter(__callback, new PixbufAnimation(new PointerContainer(_animation)), new ch.bailu.gtk.glib.TimeVal(new PointerContainer(_start_time))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public PixbufAnimationClass(PointerContainer pointer) {
        super(pointer);
    }

    public PixbufAnimationClass() {
        super(cast(JnaPixbufAnimationClass.allocateStructure()));
    }

    private JnaPixbufAnimationClass.Fields _fields;
    
    JnaPixbufAnimationClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufAnimationClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnIsStaticImage#onIsStaticImage}
    */
    public static final String IS_STATIC_IMAGE = "is_static_image";

    /**
     * 
     * <br>See {@link OnIsStaticImage#onIsStaticImage}
    */
    public void setFieldIsStaticImage(OnIsStaticImage is_static_image) {
        toFields().is_static_image = toOnIsStaticImage(this, IS_STATIC_IMAGE, is_static_image);
        toFields().writeField(IS_STATIC_IMAGE);
    }

    /**
     * 
     * <br>See {@link OnIsStaticImage#onIsStaticImage}
    */
    public JnaPixbufAnimationClass.OnIsStaticImage getFieldIsStaticImage() {
       toFields().readField(IS_STATIC_IMAGE);
       return toFields().is_static_image;
    } 

    /**
     * 
     * <br>See {@link OnGetStaticImage#onGetStaticImage}
    */
    public static final String GET_STATIC_IMAGE = "get_static_image";

    /**
     * 
     * <br>See {@link OnGetStaticImage#onGetStaticImage}
    */
    public void setFieldGetStaticImage(OnGetStaticImage get_static_image) {
        toFields().get_static_image = toOnGetStaticImage(this, GET_STATIC_IMAGE, get_static_image);
        toFields().writeField(GET_STATIC_IMAGE);
    }

    /**
     * 
     * <br>See {@link OnGetStaticImage#onGetStaticImage}
    */
    public JnaPixbufAnimationClass.OnGetStaticImage getFieldGetStaticImage() {
       toFields().readField(GET_STATIC_IMAGE);
       return toFields().get_static_image;
    } 

    /**
     * 
     * <br>See {@link OnGetSize#onGetSize}
    */
    public static final String GET_SIZE = "get_size";

    /**
     * 
     * <br>See {@link OnGetSize#onGetSize}
    */
    public void setFieldGetSize(OnGetSize get_size) {
        toFields().get_size = toOnGetSize(this, GET_SIZE, get_size);
        toFields().writeField(GET_SIZE);
    }

    /**
     * 
     * <br>See {@link OnGetSize#onGetSize}
    */
    public JnaPixbufAnimationClass.OnGetSize getFieldGetSize() {
       toFields().readField(GET_SIZE);
       return toFields().get_size;
    } 

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public static final String GET_ITER = "get_iter";

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public void setFieldGetIter(OnGetIter get_iter) {
        toFields().get_iter = toOnGetIter(this, GET_ITER, get_iter);
        toFields().writeField(GET_ITER);
    }

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public JnaPixbufAnimationClass.OnGetIter getFieldGetIter() {
       toFields().readField(GET_ITER);
       return toFields().get_iter;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufAnimation.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufAnimation.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
