/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface for swipeable widgets.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SwipeableInterface.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SwipeableInterface.html</a></p>
*/
public class SwipeableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SwipeableInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetDistance {
        /**
         * 
         * @param self a swipeable
         * @return the swipe distance in pixels
        */
        double onGetDistance(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Swipeable self);
    }
    
    private static JnaSwipeableInterface.OnGetDistance toOnGetDistance(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDistance in) {
        JnaSwipeableInterface.OnGetDistance out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_self) -> in.onGetDistance(__callback, new Swipeable(new PointerContainer(_self)));
            __callback.register(out);
        }
        return out;
    }

    public SwipeableInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSwipeableInterface.Fields _fields;
    
    JnaSwipeableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSwipeableInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String PARENT = "parent";

    /**
     * 
     * <br>See {@link OnGetDistance#onGetDistance}
    */
    public static final String GET_DISTANCE = "get_distance";

    /**
     * 
     * <br>See {@link OnGetDistance#onGetDistance}
    */
    public void setFieldGetDistance(OnGetDistance get_distance) {
        toFields().get_distance = toOnGetDistance(this, GET_DISTANCE, get_distance);
        toFields().writeField(GET_DISTANCE);
    }

    /**
     * 
     * <br>See {@link OnGetDistance#onGetDistance}
    */
    public JnaSwipeableInterface.OnGetDistance getFieldGetDistance() {
       toFields().readField(GET_DISTANCE);
       return toFields().get_distance;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Swipeable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Swipeable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_snap_points:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:get_progress:previous-field-unsupported:[MethodModel:Supported:getProgress:[ParameterModel:Supported:{G_::{c:double}}:{j:double}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]]

[MethodModel:Supported:getProgress:[ParameterModel:Supported:{G_::{c:double}}:{j:double}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]

[FieldModel:get_cancel_progress:previous-field-unsupported:[MethodModel:Supported:getCancelProgress:[ParameterModel:Supported:{G_::{c:double}}:{j:double}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]]

[MethodModel:Supported:getCancelProgress:[ParameterModel:Supported:{G_::{c:double}}:{j:double}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]

[FieldModel:get_swipe_area:previous-field-unsupported:[MethodModel:Supported:getSwipeArea:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:AdwNavigationDirection}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:GdkRectangle*}}:{j:long}]]

[MethodModel:Supported:getSwipeArea:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Swipeable:{c:AdwSwipeable*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:AdwNavigationDirection}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:GdkRectangle*}}:{j:long}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
