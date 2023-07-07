/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.ScrollableInterface.html">https://docs.gtk.org/gtk4/struct.ScrollableInterface.html</a></p>
*/
public class ScrollableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScrollableInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetBorder {
        /**
         * 
         * @param scrollable a `GtkScrollable`
         * @param border return location for the results
         * @return %TRUE if &#64;border has been set
        */
        boolean onGetBorder(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Scrollable scrollable, @Nonnull Border border);
    }
    
    private static JnaScrollableInterface.OnGetBorder toOnGetBorder(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetBorder in) {
        JnaScrollableInterface.OnGetBorder out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_scrollable, _border) -> in.onGetBorder(__callback, new Scrollable(new PointerContainer(_scrollable)), new Border(new PointerContainer(_border)));
            __callback.register(out);
        }
        return out;
    }

    public ScrollableInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ScrollableInterface() {
        super(cast(JnaScrollableInterface.allocateStructure()));
    }

    private JnaScrollableInterface.Fields _fields;
    
    JnaScrollableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaScrollableInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_IFACE = "base_iface";

    /**
     * 
     * <br>See {@link OnGetBorder#onGetBorder}
    */
    public static final String GET_BORDER = "get_border";

    /**
     * 
     * <br>See {@link OnGetBorder#onGetBorder}
    */
    public void setFieldGetBorder(OnGetBorder get_border) {
        toFields().get_border = toOnGetBorder(this, GET_BORDER, get_border);
        toFields().writeField(GET_BORDER);
    }

    /**
     * 
     * <br>See {@link OnGetBorder#onGetBorder}
    */
    public JnaScrollableInterface.OnGetBorder getFieldGetBorder() {
       toFields().readField(GET_BORDER);
       return toFields().get_border;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Scrollable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Scrollable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
