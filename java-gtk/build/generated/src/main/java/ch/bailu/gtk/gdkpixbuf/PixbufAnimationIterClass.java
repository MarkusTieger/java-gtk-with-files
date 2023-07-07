/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Modules supporting animations must derive a type from
 * <br>&#35;GdkPixbufAnimationIter, providing suitable implementations of the
 * <br>virtual functions.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufAnimationIterClass.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufAnimationIterClass.html</a></p>
*/
public class PixbufAnimationIterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufAnimationIterClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetDelayTime {
        /**
         * 
         * @param iter an animation iterator
         * @return delay time in milliseconds (thousandths of a second)
        */
        int onGetDelayTime(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimationIter iter);
    }
    
    private static JnaPixbufAnimationIterClass.OnGetDelayTime toOnGetDelayTime(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDelayTime in) {
        JnaPixbufAnimationIterClass.OnGetDelayTime out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_iter) -> in.onGetDelayTime(__callback, new PixbufAnimationIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPixbuf {
        /**
         * 
         * @param iter an animation iterator
         * @return the pixbuf to be displayed
        */
        Pixbuf onGetPixbuf(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimationIter iter);
    }
    
    private static JnaPixbufAnimationIterClass.OnGetPixbuf toOnGetPixbuf(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPixbuf in) {
        JnaPixbufAnimationIterClass.OnGetPixbuf out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_iter) -> in.onGetPixbuf(__callback, new PixbufAnimationIter(new PointerContainer(_iter))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnOnCurrentlyLoadingFrame {
        /**
         * 
         * @param iter a &#35;GdkPixbufAnimationIter
         * @return `TRUE` if the frame we're on is partially loaded, or the last frame
        */
        boolean onOnCurrentlyLoadingFrame(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimationIter iter);
    }
    
    private static JnaPixbufAnimationIterClass.OnOnCurrentlyLoadingFrame toOnOnCurrentlyLoadingFrame(ch.bailu.gtk.type.Pointer instance, String methodName, OnOnCurrentlyLoadingFrame in) {
        JnaPixbufAnimationIterClass.OnOnCurrentlyLoadingFrame out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_iter) -> in.onOnCurrentlyLoadingFrame(__callback, new PixbufAnimationIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAdvance {
        /**
         * 
         * @param iter a &#35;GdkPixbufAnimationIter
         * @param current_time current time
         * @return `TRUE` if the image may need updating
        */
        boolean onAdvance(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufAnimationIter iter, @Nullable ch.bailu.gtk.glib.TimeVal current_time);
    }
    
    private static JnaPixbufAnimationIterClass.OnAdvance toOnAdvance(ch.bailu.gtk.type.Pointer instance, String methodName, OnAdvance in) {
        JnaPixbufAnimationIterClass.OnAdvance out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_iter, _current_time) -> in.onAdvance(__callback, new PixbufAnimationIter(new PointerContainer(_iter)), new ch.bailu.gtk.glib.TimeVal(new PointerContainer(_current_time)));
            __callback.register(out);
        }
        return out;
    }

    public PixbufAnimationIterClass(PointerContainer pointer) {
        super(pointer);
    }

    public PixbufAnimationIterClass() {
        super(cast(JnaPixbufAnimationIterClass.allocateStructure()));
    }

    private JnaPixbufAnimationIterClass.Fields _fields;
    
    JnaPixbufAnimationIterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufAnimationIterClass.Fields(asCPointer());
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
     * <br>See {@link OnGetDelayTime#onGetDelayTime}
    */
    public static final String GET_DELAY_TIME = "get_delay_time";

    /**
     * 
     * <br>See {@link OnGetDelayTime#onGetDelayTime}
    */
    public void setFieldGetDelayTime(OnGetDelayTime get_delay_time) {
        toFields().get_delay_time = toOnGetDelayTime(this, GET_DELAY_TIME, get_delay_time);
        toFields().writeField(GET_DELAY_TIME);
    }

    /**
     * 
     * <br>See {@link OnGetDelayTime#onGetDelayTime}
    */
    public JnaPixbufAnimationIterClass.OnGetDelayTime getFieldGetDelayTime() {
       toFields().readField(GET_DELAY_TIME);
       return toFields().get_delay_time;
    } 

    /**
     * 
     * <br>See {@link OnGetPixbuf#onGetPixbuf}
    */
    public static final String GET_PIXBUF = "get_pixbuf";

    /**
     * 
     * <br>See {@link OnGetPixbuf#onGetPixbuf}
    */
    public void setFieldGetPixbuf(OnGetPixbuf get_pixbuf) {
        toFields().get_pixbuf = toOnGetPixbuf(this, GET_PIXBUF, get_pixbuf);
        toFields().writeField(GET_PIXBUF);
    }

    /**
     * 
     * <br>See {@link OnGetPixbuf#onGetPixbuf}
    */
    public JnaPixbufAnimationIterClass.OnGetPixbuf getFieldGetPixbuf() {
       toFields().readField(GET_PIXBUF);
       return toFields().get_pixbuf;
    } 

    /**
     * 
     * <br>See {@link OnOnCurrentlyLoadingFrame#onOnCurrentlyLoadingFrame}
    */
    public static final String ON_CURRENTLY_LOADING_FRAME = "on_currently_loading_frame";

    /**
     * 
     * <br>See {@link OnOnCurrentlyLoadingFrame#onOnCurrentlyLoadingFrame}
    */
    public void setFieldOnCurrentlyLoadingFrame(OnOnCurrentlyLoadingFrame on_currently_loading_frame) {
        toFields().on_currently_loading_frame = toOnOnCurrentlyLoadingFrame(this, ON_CURRENTLY_LOADING_FRAME, on_currently_loading_frame);
        toFields().writeField(ON_CURRENTLY_LOADING_FRAME);
    }

    /**
     * 
     * <br>See {@link OnOnCurrentlyLoadingFrame#onOnCurrentlyLoadingFrame}
    */
    public JnaPixbufAnimationIterClass.OnOnCurrentlyLoadingFrame getFieldOnCurrentlyLoadingFrame() {
       toFields().readField(ON_CURRENTLY_LOADING_FRAME);
       return toFields().on_currently_loading_frame;
    } 

    /**
     * 
     * <br>See {@link OnAdvance#onAdvance}
    */
    public static final String ADVANCE = "advance";

    /**
     * 
     * <br>See {@link OnAdvance#onAdvance}
    */
    public void setFieldAdvance(OnAdvance advance) {
        toFields().advance = toOnAdvance(this, ADVANCE, advance);
        toFields().writeField(ADVANCE);
    }

    /**
     * 
     * <br>See {@link OnAdvance#onAdvance}
    */
    public JnaPixbufAnimationIterClass.OnAdvance getFieldAdvance() {
       toFields().readField(ADVANCE);
       return toFields().advance;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufAnimationIter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufAnimationIter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
