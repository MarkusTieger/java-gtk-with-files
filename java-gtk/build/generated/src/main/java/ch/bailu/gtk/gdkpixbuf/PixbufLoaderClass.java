/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufLoaderClass.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufLoaderClass.html</a></p>
*/
public class PixbufLoaderClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufLoaderClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSizePrepared {
        /**
         * 
         * @param loader 
         * @param width 
         * @param height 
        */
        void onSizePrepared(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufLoader loader, int width, int height);
    }
    
    private static JnaPixbufLoaderClass.OnSizePrepared toOnSizePrepared(ch.bailu.gtk.type.Pointer instance, String methodName, OnSizePrepared in) {
        JnaPixbufLoaderClass.OnSizePrepared out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_loader, _width, _height) -> in.onSizePrepared(__callback, new PixbufLoader(new PointerContainer(_loader)), _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAreaPrepared {
        /**
         * 
         * @param loader 
        */
        void onAreaPrepared(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufLoader loader);
    }
    
    private static JnaPixbufLoaderClass.OnAreaPrepared toOnAreaPrepared(ch.bailu.gtk.type.Pointer instance, String methodName, OnAreaPrepared in) {
        JnaPixbufLoaderClass.OnAreaPrepared out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_loader) -> in.onAreaPrepared(__callback, new PixbufLoader(new PointerContainer(_loader)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAreaUpdated {
        /**
         * 
         * @param loader 
         * @param x 
         * @param y 
         * @param width 
         * @param height 
        */
        void onAreaUpdated(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufLoader loader, int x, int y, int width, int height);
    }
    
    private static JnaPixbufLoaderClass.OnAreaUpdated toOnAreaUpdated(ch.bailu.gtk.type.Pointer instance, String methodName, OnAreaUpdated in) {
        JnaPixbufLoaderClass.OnAreaUpdated out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_loader, _x, _y, _width, _height) -> in.onAreaUpdated(__callback, new PixbufLoader(new PointerContainer(_loader)), _x, _y, _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * 
         * @param loader 
        */
        void onClosed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PixbufLoader loader);
    }
    
    private static JnaPixbufLoaderClass.OnClosed toOnClosed(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosed in) {
        JnaPixbufLoaderClass.OnClosed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_loader) -> in.onClosed(__callback, new PixbufLoader(new PointerContainer(_loader)));
            __callback.register(out);
        }
        return out;
    }

    public PixbufLoaderClass(PointerContainer pointer) {
        super(pointer);
    }

    public PixbufLoaderClass() {
        super(cast(JnaPixbufLoaderClass.allocateStructure()));
    }

    private JnaPixbufLoaderClass.Fields _fields;
    
    JnaPixbufLoaderClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufLoaderClass.Fields(asCPointer());
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
     * <br>See {@link OnSizePrepared#onSizePrepared}
    */
    public static final String SIZE_PREPARED = "size_prepared";

    /**
     * 
     * <br>See {@link OnSizePrepared#onSizePrepared}
    */
    public void setFieldSizePrepared(OnSizePrepared size_prepared) {
        toFields().size_prepared = toOnSizePrepared(this, SIZE_PREPARED, size_prepared);
        toFields().writeField(SIZE_PREPARED);
    }

    /**
     * 
     * <br>See {@link OnSizePrepared#onSizePrepared}
    */
    public JnaPixbufLoaderClass.OnSizePrepared getFieldSizePrepared() {
       toFields().readField(SIZE_PREPARED);
       return toFields().size_prepared;
    } 

    /**
     * 
     * <br>See {@link OnAreaPrepared#onAreaPrepared}
    */
    public static final String AREA_PREPARED = "area_prepared";

    /**
     * 
     * <br>See {@link OnAreaPrepared#onAreaPrepared}
    */
    public void setFieldAreaPrepared(OnAreaPrepared area_prepared) {
        toFields().area_prepared = toOnAreaPrepared(this, AREA_PREPARED, area_prepared);
        toFields().writeField(AREA_PREPARED);
    }

    /**
     * 
     * <br>See {@link OnAreaPrepared#onAreaPrepared}
    */
    public JnaPixbufLoaderClass.OnAreaPrepared getFieldAreaPrepared() {
       toFields().readField(AREA_PREPARED);
       return toFields().area_prepared;
    } 

    /**
     * 
     * <br>See {@link OnAreaUpdated#onAreaUpdated}
    */
    public static final String AREA_UPDATED = "area_updated";

    /**
     * 
     * <br>See {@link OnAreaUpdated#onAreaUpdated}
    */
    public void setFieldAreaUpdated(OnAreaUpdated area_updated) {
        toFields().area_updated = toOnAreaUpdated(this, AREA_UPDATED, area_updated);
        toFields().writeField(AREA_UPDATED);
    }

    /**
     * 
     * <br>See {@link OnAreaUpdated#onAreaUpdated}
    */
    public JnaPixbufLoaderClass.OnAreaUpdated getFieldAreaUpdated() {
       toFields().readField(AREA_UPDATED);
       return toFields().area_updated;
    } 

    /**
     * 
     * <br>See {@link OnClosed#onClosed}
    */
    public static final String CLOSED = "closed";

    /**
     * 
     * <br>See {@link OnClosed#onClosed}
    */
    public void setFieldClosed(OnClosed closed) {
        toFields().closed = toOnClosed(this, CLOSED, closed);
        toFields().writeField(CLOSED);
    }

    /**
     * 
     * <br>See {@link OnClosed#onClosed}
    */
    public JnaPixbufLoaderClass.OnClosed getFieldClosed() {
       toFields().readField(CLOSED);
       return toFields().closed;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufLoader.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PixbufLoader.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
