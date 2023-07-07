/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual table for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class ClientIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClientIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHandleStart {
        /**
         * 
         * @param object 
         * @param invocation 
         * @return 
        */
        boolean onHandleStart(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static JnaClientIface.OnHandleStart toOnHandleStart(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleStart in) {
        JnaClientIface.OnHandleStart out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation) -> in.onHandleStart(__callback, new Client(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleStop {
        /**
         * 
         * @param object 
         * @param invocation 
         * @return 
        */
        boolean onHandleStop(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static JnaClientIface.OnHandleStop toOnHandleStop(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleStop in) {
        JnaClientIface.OnHandleStop out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation) -> in.onHandleStop(__callback, new Client(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetActive {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value.
        */
        boolean onGetActive(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetActive toOnGetActive(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetActive in) {
        JnaClientIface.OnGetActive out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetActive(__callback, new Client(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDesktopId {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
        */
        ch.bailu.gtk.type.Str onGetDesktopId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetDesktopId toOnGetDesktopId(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDesktopId in) {
        JnaClientIface.OnGetDesktopId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetDesktopId(__callback, new Client(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDistanceThreshold {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value.
        */
        int onGetDistanceThreshold(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetDistanceThreshold toOnGetDistanceThreshold(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDistanceThreshold in) {
        JnaClientIface.OnGetDistanceThreshold out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetDistanceThreshold(__callback, new Client(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLocation {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
        */
        ch.bailu.gtk.type.Str onGetLocation(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetLocation toOnGetLocation(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLocation in) {
        JnaClientIface.OnGetLocation out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetLocation(__callback, new Client(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRequestedAccuracyLevel {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value.
        */
        int onGetRequestedAccuracyLevel(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetRequestedAccuracyLevel toOnGetRequestedAccuracyLevel(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRequestedAccuracyLevel in) {
        JnaClientIface.OnGetRequestedAccuracyLevel out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetRequestedAccuracyLevel(__callback, new Client(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetTimeThreshold {
        /**
         * 
         * @param object A &#35;GClueClient.
         * @return The property value.
        */
        int onGetTimeThreshold(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object);
    }
    
    private static JnaClientIface.OnGetTimeThreshold toOnGetTimeThreshold(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetTimeThreshold in) {
        JnaClientIface.OnGetTimeThreshold out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetTimeThreshold(__callback, new Client(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLocationUpdated {
        /**
         * 
         * @param object 
         * @param arg_old 
         * @param arg_new 
        */
        void onLocationUpdated(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Client object, @Nonnull ch.bailu.gtk.type.Str arg_old, @Nonnull ch.bailu.gtk.type.Str arg_new);
    }
    
    private static JnaClientIface.OnLocationUpdated toOnLocationUpdated(ch.bailu.gtk.type.Pointer instance, String methodName, OnLocationUpdated in) {
        JnaClientIface.OnLocationUpdated out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _arg_old, _arg_new) -> in.onLocationUpdated(__callback, new Client(new PointerContainer(_object)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_old)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_new)));
            __callback.register(out);
        }
        return out;
    }

    public ClientIface(PointerContainer pointer) {
        super(pointer);
    }

    public ClientIface() {
        super(cast(JnaClientIface.allocateStructure()));
    }

    private JnaClientIface.Fields _fields;
    
    JnaClientIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaClientIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String PARENT_IFACE = "parent_iface";

    /**
     * 
     * <br>See {@link OnHandleStart#onHandleStart}
    */
    public static final String HANDLE_START = "handle_start";

    /**
     * 
     * <br>See {@link OnHandleStart#onHandleStart}
    */
    public void setFieldHandleStart(OnHandleStart handle_start) {
        toFields().handle_start = toOnHandleStart(this, HANDLE_START, handle_start);
        toFields().writeField(HANDLE_START);
    }

    /**
     * 
     * <br>See {@link OnHandleStart#onHandleStart}
    */
    public JnaClientIface.OnHandleStart getFieldHandleStart() {
       toFields().readField(HANDLE_START);
       return toFields().handle_start;
    } 

    /**
     * 
     * <br>See {@link OnHandleStop#onHandleStop}
    */
    public static final String HANDLE_STOP = "handle_stop";

    /**
     * 
     * <br>See {@link OnHandleStop#onHandleStop}
    */
    public void setFieldHandleStop(OnHandleStop handle_stop) {
        toFields().handle_stop = toOnHandleStop(this, HANDLE_STOP, handle_stop);
        toFields().writeField(HANDLE_STOP);
    }

    /**
     * 
     * <br>See {@link OnHandleStop#onHandleStop}
    */
    public JnaClientIface.OnHandleStop getFieldHandleStop() {
       toFields().readField(HANDLE_STOP);
       return toFields().handle_stop;
    } 

    /**
     * 
     * <br>See {@link OnGetActive#onGetActive}
    */
    public static final String GET_ACTIVE = "get_active";

    /**
     * 
     * <br>See {@link OnGetActive#onGetActive}
    */
    public void setFieldGetActive(OnGetActive get_active) {
        toFields().get_active = toOnGetActive(this, GET_ACTIVE, get_active);
        toFields().writeField(GET_ACTIVE);
    }

    /**
     * 
     * <br>See {@link OnGetActive#onGetActive}
    */
    public JnaClientIface.OnGetActive getFieldGetActive() {
       toFields().readField(GET_ACTIVE);
       return toFields().get_active;
    } 

    /**
     * 
     * <br>See {@link OnGetDesktopId#onGetDesktopId}
    */
    public static final String GET_DESKTOP_ID = "get_desktop_id";

    /**
     * 
     * <br>See {@link OnGetDesktopId#onGetDesktopId}
    */
    public void setFieldGetDesktopId(OnGetDesktopId get_desktop_id) {
        toFields().get_desktop_id = toOnGetDesktopId(this, GET_DESKTOP_ID, get_desktop_id);
        toFields().writeField(GET_DESKTOP_ID);
    }

    /**
     * 
     * <br>See {@link OnGetDesktopId#onGetDesktopId}
    */
    public JnaClientIface.OnGetDesktopId getFieldGetDesktopId() {
       toFields().readField(GET_DESKTOP_ID);
       return toFields().get_desktop_id;
    } 

    /**
     * 
     * <br>See {@link OnGetDistanceThreshold#onGetDistanceThreshold}
    */
    public static final String GET_DISTANCE_THRESHOLD = "get_distance_threshold";

    /**
     * 
     * <br>See {@link OnGetDistanceThreshold#onGetDistanceThreshold}
    */
    public void setFieldGetDistanceThreshold(OnGetDistanceThreshold get_distance_threshold) {
        toFields().get_distance_threshold = toOnGetDistanceThreshold(this, GET_DISTANCE_THRESHOLD, get_distance_threshold);
        toFields().writeField(GET_DISTANCE_THRESHOLD);
    }

    /**
     * 
     * <br>See {@link OnGetDistanceThreshold#onGetDistanceThreshold}
    */
    public JnaClientIface.OnGetDistanceThreshold getFieldGetDistanceThreshold() {
       toFields().readField(GET_DISTANCE_THRESHOLD);
       return toFields().get_distance_threshold;
    } 

    /**
     * 
     * <br>See {@link OnGetLocation#onGetLocation}
    */
    public static final String GET_LOCATION = "get_location";

    /**
     * 
     * <br>See {@link OnGetLocation#onGetLocation}
    */
    public void setFieldGetLocation(OnGetLocation get_location) {
        toFields().get_location = toOnGetLocation(this, GET_LOCATION, get_location);
        toFields().writeField(GET_LOCATION);
    }

    /**
     * 
     * <br>See {@link OnGetLocation#onGetLocation}
    */
    public JnaClientIface.OnGetLocation getFieldGetLocation() {
       toFields().readField(GET_LOCATION);
       return toFields().get_location;
    } 

    /**
     * 
     * <br>See {@link OnGetRequestedAccuracyLevel#onGetRequestedAccuracyLevel}
    */
    public static final String GET_REQUESTED_ACCURACY_LEVEL = "get_requested_accuracy_level";

    /**
     * 
     * <br>See {@link OnGetRequestedAccuracyLevel#onGetRequestedAccuracyLevel}
    */
    public void setFieldGetRequestedAccuracyLevel(OnGetRequestedAccuracyLevel get_requested_accuracy_level) {
        toFields().get_requested_accuracy_level = toOnGetRequestedAccuracyLevel(this, GET_REQUESTED_ACCURACY_LEVEL, get_requested_accuracy_level);
        toFields().writeField(GET_REQUESTED_ACCURACY_LEVEL);
    }

    /**
     * 
     * <br>See {@link OnGetRequestedAccuracyLevel#onGetRequestedAccuracyLevel}
    */
    public JnaClientIface.OnGetRequestedAccuracyLevel getFieldGetRequestedAccuracyLevel() {
       toFields().readField(GET_REQUESTED_ACCURACY_LEVEL);
       return toFields().get_requested_accuracy_level;
    } 

    /**
     * 
     * <br>See {@link OnGetTimeThreshold#onGetTimeThreshold}
    */
    public static final String GET_TIME_THRESHOLD = "get_time_threshold";

    /**
     * 
     * <br>See {@link OnGetTimeThreshold#onGetTimeThreshold}
    */
    public void setFieldGetTimeThreshold(OnGetTimeThreshold get_time_threshold) {
        toFields().get_time_threshold = toOnGetTimeThreshold(this, GET_TIME_THRESHOLD, get_time_threshold);
        toFields().writeField(GET_TIME_THRESHOLD);
    }

    /**
     * 
     * <br>See {@link OnGetTimeThreshold#onGetTimeThreshold}
    */
    public JnaClientIface.OnGetTimeThreshold getFieldGetTimeThreshold() {
       toFields().readField(GET_TIME_THRESHOLD);
       return toFields().get_time_threshold;
    } 

    /**
     * 
     * <br>See {@link OnLocationUpdated#onLocationUpdated}
    */
    public static final String LOCATION_UPDATED = "location_updated";

    /**
     * 
     * <br>See {@link OnLocationUpdated#onLocationUpdated}
    */
    public void setFieldLocationUpdated(OnLocationUpdated location_updated) {
        toFields().location_updated = toOnLocationUpdated(this, LOCATION_UPDATED, location_updated);
        toFields().writeField(LOCATION_UPDATED);
    }

    /**
     * 
     * <br>See {@link OnLocationUpdated#onLocationUpdated}
    */
    public JnaClientIface.OnLocationUpdated getFieldLocationUpdated() {
       toFields().readField(LOCATION_UPDATED);
       return toFields().location_updated;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Client.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Client.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
