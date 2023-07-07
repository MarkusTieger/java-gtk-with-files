/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCustomLayout` uses closures for size negotiation.
 * <br>
 * <br>A `GtkCustomLayout `uses closures matching to the old `GtkWidget`
 * <br>virtual functions for size negotiation, as a convenience API to
 * <br>ease the porting towards the corresponding `GtkLayoutManager
 * <br>virtual functions.
 * <p><a href="https://docs.gtk.org/gtk4/class.CustomLayout.html">https://docs.gtk.org/gtk4/class.CustomLayout.html</a></p>
*/
public class CustomLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CustomLayout.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCustomRequestModeFunc {
        /**
         * Queries a widget for its preferred size request mode.
         * @param widget the widget to be queried
         * @return the size request mode
        */
        int onCustomRequestModeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget);
    }
    
    private static JnaCustomLayout.OnCustomRequestModeFunc toOnCustomRequestModeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCustomRequestModeFunc in) {
        JnaCustomLayout.OnCustomRequestModeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget) -> in.onCustomRequestModeFunc(__callback, new Widget(new PointerContainer(_widget)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCustomMeasureFunc {
        /**
         * A function to be used by `GtkCustomLayout` to measure a widget.
         * @param widget the widget to be measured
         * @param orientation the direction to be measured
         * @param for_size the size to be measured for
         * @param minimum the measured minimum size of the widget
         * @param natural the measured natural size of the widget
         * @param minimum_baseline the measured minimum baseline of the widget
         * @param natural_baseline the measured natural baseline of the widget
        */
        void onCustomMeasureFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int orientation, int for_size, @Nonnull ch.bailu.gtk.type.Int minimum, @Nonnull ch.bailu.gtk.type.Int natural, @Nonnull ch.bailu.gtk.type.Int minimum_baseline, @Nonnull ch.bailu.gtk.type.Int natural_baseline);
    }
    
    private static JnaCustomLayout.OnCustomMeasureFunc toOnCustomMeasureFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCustomMeasureFunc in) {
        JnaCustomLayout.OnCustomMeasureFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _orientation, _for_size, _minimum, _natural, _minimum_baseline, _natural_baseline) -> in.onCustomMeasureFunc(__callback, new Widget(new PointerContainer(_widget)), _orientation, _for_size, new ch.bailu.gtk.type.Int(new PointerContainer(_minimum)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural)), new ch.bailu.gtk.type.Int(new PointerContainer(_minimum_baseline)), new ch.bailu.gtk.type.Int(new PointerContainer(_natural_baseline)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCustomAllocateFunc {
        /**
         * A function to be used by `GtkCustomLayout` to allocate a widget.
         * @param widget the widget to allocate
         * @param width the new width of the widget
         * @param height the new height of the widget
         * @param baseline the new baseline of the widget, or -1
        */
        void onCustomAllocateFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Widget widget, int width, int height, int baseline);
    }
    
    private static JnaCustomLayout.OnCustomAllocateFunc toOnCustomAllocateFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCustomAllocateFunc in) {
        JnaCustomLayout.OnCustomAllocateFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_widget, _width, _height, _baseline) -> in.onCustomAllocateFunc(__callback, new Widget(new PointerContainer(_widget)), _width, _height, _baseline);
            __callback.register(out);
        }
        return out;
    }

    public CustomLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new legacy layout manager.
     * <br>
     * <br>Legacy layout managers map to the old `GtkWidget` size negotiation
     * <br>virtual functions, and are meant to be used during the transition
     * <br>from layout containers to layout manager delegates.
     * @param request_mode a function to retrieve   the `GtkSizeRequestMode` of the widget using the layout; the   default request mode is %GTK_SIZE_REQUEST_CONSTANT_SIZE
     * @param measure a function to measure the widget using the layout manager
     * @param allocate a function to allocate the children of the widget using   the layout manager
    */
    public CustomLayout(OnCustomRequestModeFunc request_mode, OnCustomMeasureFunc measure, OnCustomAllocateFunc allocate) {
        super(cast(JnaCustomLayout.INST().gtk_custom_layout_new(toOnCustomRequestModeFunc(getClassHandler().getInstance(), "_new", request_mode), toOnCustomMeasureFunc(getClassHandler().getInstance(), "_new", measure), toOnCustomAllocateFunc(getClassHandler().getInstance(), "_new", allocate))));
    }

    public static long getTypeID() { 
        return JnaCustomLayout.INST().gtk_custom_layout_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
