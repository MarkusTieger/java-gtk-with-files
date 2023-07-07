/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual table for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Location.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Location&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class LocationIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LocationIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetAccuracy {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetAccuracy(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetAccuracy toOnGetAccuracy(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetAccuracy in) {
        JnaLocationIface.OnGetAccuracy out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetAccuracy(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetAltitude {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetAltitude(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetAltitude toOnGetAltitude(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetAltitude in) {
        JnaLocationIface.OnGetAltitude out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetAltitude(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDescription {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
        */
        ch.bailu.gtk.type.Str onGetDescription(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetDescription toOnGetDescription(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDescription in) {
        JnaLocationIface.OnGetDescription out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetDescription(__callback, new Location(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetHeading {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetHeading(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetHeading toOnGetHeading(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetHeading in) {
        JnaLocationIface.OnGetHeading out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetHeading(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLatitude {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetLatitude(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetLatitude toOnGetLatitude(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLatitude in) {
        JnaLocationIface.OnGetLatitude out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetLatitude(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetLongitude {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetLongitude(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetLongitude toOnGetLongitude(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetLongitude in) {
        JnaLocationIface.OnGetLongitude out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetLongitude(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSpeed {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value.
        */
        double onGetSpeed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetSpeed toOnGetSpeed(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSpeed in) {
        JnaLocationIface.OnGetSpeed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetSpeed(__callback, new Location(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetTimestamp {
        /**
         * 
         * @param object A &#35;GClueLocation.
         * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
        */
        ch.bailu.gtk.glib.Variant onGetTimestamp(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Location object);
    }
    
    private static JnaLocationIface.OnGetTimestamp toOnGetTimestamp(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetTimestamp in) {
        JnaLocationIface.OnGetTimestamp out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetTimestamp(__callback, new Location(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public LocationIface(PointerContainer pointer) {
        super(pointer);
    }

    public LocationIface() {
        super(cast(JnaLocationIface.allocateStructure()));
    }

    private JnaLocationIface.Fields _fields;
    
    JnaLocationIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLocationIface.Fields(asCPointer());
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
     * <br>See {@link OnGetAccuracy#onGetAccuracy}
    */
    public static final String GET_ACCURACY = "get_accuracy";

    /**
     * 
     * <br>See {@link OnGetAccuracy#onGetAccuracy}
    */
    public void setFieldGetAccuracy(OnGetAccuracy get_accuracy) {
        toFields().get_accuracy = toOnGetAccuracy(this, GET_ACCURACY, get_accuracy);
        toFields().writeField(GET_ACCURACY);
    }

    /**
     * 
     * <br>See {@link OnGetAccuracy#onGetAccuracy}
    */
    public JnaLocationIface.OnGetAccuracy getFieldGetAccuracy() {
       toFields().readField(GET_ACCURACY);
       return toFields().get_accuracy;
    } 

    /**
     * 
     * <br>See {@link OnGetAltitude#onGetAltitude}
    */
    public static final String GET_ALTITUDE = "get_altitude";

    /**
     * 
     * <br>See {@link OnGetAltitude#onGetAltitude}
    */
    public void setFieldGetAltitude(OnGetAltitude get_altitude) {
        toFields().get_altitude = toOnGetAltitude(this, GET_ALTITUDE, get_altitude);
        toFields().writeField(GET_ALTITUDE);
    }

    /**
     * 
     * <br>See {@link OnGetAltitude#onGetAltitude}
    */
    public JnaLocationIface.OnGetAltitude getFieldGetAltitude() {
       toFields().readField(GET_ALTITUDE);
       return toFields().get_altitude;
    } 

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public static final String GET_DESCRIPTION = "get_description";

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public void setFieldGetDescription(OnGetDescription get_description) {
        toFields().get_description = toOnGetDescription(this, GET_DESCRIPTION, get_description);
        toFields().writeField(GET_DESCRIPTION);
    }

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public JnaLocationIface.OnGetDescription getFieldGetDescription() {
       toFields().readField(GET_DESCRIPTION);
       return toFields().get_description;
    } 

    /**
     * 
     * <br>See {@link OnGetHeading#onGetHeading}
    */
    public static final String GET_HEADING = "get_heading";

    /**
     * 
     * <br>See {@link OnGetHeading#onGetHeading}
    */
    public void setFieldGetHeading(OnGetHeading get_heading) {
        toFields().get_heading = toOnGetHeading(this, GET_HEADING, get_heading);
        toFields().writeField(GET_HEADING);
    }

    /**
     * 
     * <br>See {@link OnGetHeading#onGetHeading}
    */
    public JnaLocationIface.OnGetHeading getFieldGetHeading() {
       toFields().readField(GET_HEADING);
       return toFields().get_heading;
    } 

    /**
     * 
     * <br>See {@link OnGetLatitude#onGetLatitude}
    */
    public static final String GET_LATITUDE = "get_latitude";

    /**
     * 
     * <br>See {@link OnGetLatitude#onGetLatitude}
    */
    public void setFieldGetLatitude(OnGetLatitude get_latitude) {
        toFields().get_latitude = toOnGetLatitude(this, GET_LATITUDE, get_latitude);
        toFields().writeField(GET_LATITUDE);
    }

    /**
     * 
     * <br>See {@link OnGetLatitude#onGetLatitude}
    */
    public JnaLocationIface.OnGetLatitude getFieldGetLatitude() {
       toFields().readField(GET_LATITUDE);
       return toFields().get_latitude;
    } 

    /**
     * 
     * <br>See {@link OnGetLongitude#onGetLongitude}
    */
    public static final String GET_LONGITUDE = "get_longitude";

    /**
     * 
     * <br>See {@link OnGetLongitude#onGetLongitude}
    */
    public void setFieldGetLongitude(OnGetLongitude get_longitude) {
        toFields().get_longitude = toOnGetLongitude(this, GET_LONGITUDE, get_longitude);
        toFields().writeField(GET_LONGITUDE);
    }

    /**
     * 
     * <br>See {@link OnGetLongitude#onGetLongitude}
    */
    public JnaLocationIface.OnGetLongitude getFieldGetLongitude() {
       toFields().readField(GET_LONGITUDE);
       return toFields().get_longitude;
    } 

    /**
     * 
     * <br>See {@link OnGetSpeed#onGetSpeed}
    */
    public static final String GET_SPEED = "get_speed";

    /**
     * 
     * <br>See {@link OnGetSpeed#onGetSpeed}
    */
    public void setFieldGetSpeed(OnGetSpeed get_speed) {
        toFields().get_speed = toOnGetSpeed(this, GET_SPEED, get_speed);
        toFields().writeField(GET_SPEED);
    }

    /**
     * 
     * <br>See {@link OnGetSpeed#onGetSpeed}
    */
    public JnaLocationIface.OnGetSpeed getFieldGetSpeed() {
       toFields().readField(GET_SPEED);
       return toFields().get_speed;
    } 

    /**
     * 
     * <br>See {@link OnGetTimestamp#onGetTimestamp}
    */
    public static final String GET_TIMESTAMP = "get_timestamp";

    /**
     * 
     * <br>See {@link OnGetTimestamp#onGetTimestamp}
    */
    public void setFieldGetTimestamp(OnGetTimestamp get_timestamp) {
        toFields().get_timestamp = toOnGetTimestamp(this, GET_TIMESTAMP, get_timestamp);
        toFields().writeField(GET_TIMESTAMP);
    }

    /**
     * 
     * <br>See {@link OnGetTimestamp#onGetTimestamp}
    */
    public JnaLocationIface.OnGetTimestamp getFieldGetTimestamp() {
       toFields().readField(GET_TIMESTAMP);
       return toFields().get_timestamp;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Location.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Location.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
