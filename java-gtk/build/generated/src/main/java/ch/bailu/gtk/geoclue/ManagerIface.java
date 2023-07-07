/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Virtual table for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Manager.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Manager&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class ManagerIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ManagerIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnHandleAddAgent {
        /**
         * 
         * @param object 
         * @param invocation 
         * @param arg_id 
         * @return 
        */
        boolean onHandleAddAgent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str arg_id);
    }
    
    private static JnaManagerIface.OnHandleAddAgent toOnHandleAddAgent(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleAddAgent in) {
        JnaManagerIface.OnHandleAddAgent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation, _arg_id) -> in.onHandleAddAgent(__callback, new Manager(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_id)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleCreateClient {
        /**
         * 
         * @param object 
         * @param invocation 
         * @return 
        */
        boolean onHandleCreateClient(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static JnaManagerIface.OnHandleCreateClient toOnHandleCreateClient(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleCreateClient in) {
        JnaManagerIface.OnHandleCreateClient out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation) -> in.onHandleCreateClient(__callback, new Manager(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleDeleteClient {
        /**
         * 
         * @param object 
         * @param invocation 
         * @param arg_client 
         * @return 
        */
        boolean onHandleDeleteClient(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str arg_client);
    }
    
    private static JnaManagerIface.OnHandleDeleteClient toOnHandleDeleteClient(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleDeleteClient in) {
        JnaManagerIface.OnHandleDeleteClient out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation, _arg_client) -> in.onHandleDeleteClient(__callback, new Manager(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_client)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleGetClient {
        /**
         * 
         * @param object 
         * @param invocation 
         * @return 
        */
        boolean onHandleGetClient(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object, @Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static JnaManagerIface.OnHandleGetClient toOnHandleGetClient(ch.bailu.gtk.type.Pointer instance, String methodName, OnHandleGetClient in) {
        JnaManagerIface.OnHandleGetClient out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _invocation) -> in.onHandleGetClient(__callback, new Manager(new PointerContainer(_object)), new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetAvailableAccuracyLevel {
        /**
         * 
         * @param object A &#35;GClueManager.
         * @return The property value.
        */
        int onGetAvailableAccuracyLevel(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object);
    }
    
    private static JnaManagerIface.OnGetAvailableAccuracyLevel toOnGetAvailableAccuracyLevel(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetAvailableAccuracyLevel in) {
        JnaManagerIface.OnGetAvailableAccuracyLevel out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetAvailableAccuracyLevel(__callback, new Manager(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetInUse {
        /**
         * 
         * @param object A &#35;GClueManager.
         * @return The property value.
        */
        boolean onGetInUse(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Manager object);
    }
    
    private static JnaManagerIface.OnGetInUse toOnGetInUse(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInUse in) {
        JnaManagerIface.OnGetInUse out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetInUse(__callback, new Manager(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    public ManagerIface(PointerContainer pointer) {
        super(pointer);
    }

    public ManagerIface() {
        super(cast(JnaManagerIface.allocateStructure()));
    }

    private JnaManagerIface.Fields _fields;
    
    JnaManagerIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaManagerIface.Fields(asCPointer());
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
     * <br>See {@link OnHandleAddAgent#onHandleAddAgent}
    */
    public static final String HANDLE_ADD_AGENT = "handle_add_agent";

    /**
     * 
     * <br>See {@link OnHandleAddAgent#onHandleAddAgent}
    */
    public void setFieldHandleAddAgent(OnHandleAddAgent handle_add_agent) {
        toFields().handle_add_agent = toOnHandleAddAgent(this, HANDLE_ADD_AGENT, handle_add_agent);
        toFields().writeField(HANDLE_ADD_AGENT);
    }

    /**
     * 
     * <br>See {@link OnHandleAddAgent#onHandleAddAgent}
    */
    public JnaManagerIface.OnHandleAddAgent getFieldHandleAddAgent() {
       toFields().readField(HANDLE_ADD_AGENT);
       return toFields().handle_add_agent;
    } 

    /**
     * 
     * <br>See {@link OnHandleCreateClient#onHandleCreateClient}
    */
    public static final String HANDLE_CREATE_CLIENT = "handle_create_client";

    /**
     * 
     * <br>See {@link OnHandleCreateClient#onHandleCreateClient}
    */
    public void setFieldHandleCreateClient(OnHandleCreateClient handle_create_client) {
        toFields().handle_create_client = toOnHandleCreateClient(this, HANDLE_CREATE_CLIENT, handle_create_client);
        toFields().writeField(HANDLE_CREATE_CLIENT);
    }

    /**
     * 
     * <br>See {@link OnHandleCreateClient#onHandleCreateClient}
    */
    public JnaManagerIface.OnHandleCreateClient getFieldHandleCreateClient() {
       toFields().readField(HANDLE_CREATE_CLIENT);
       return toFields().handle_create_client;
    } 

    /**
     * 
     * <br>See {@link OnHandleDeleteClient#onHandleDeleteClient}
    */
    public static final String HANDLE_DELETE_CLIENT = "handle_delete_client";

    /**
     * 
     * <br>See {@link OnHandleDeleteClient#onHandleDeleteClient}
    */
    public void setFieldHandleDeleteClient(OnHandleDeleteClient handle_delete_client) {
        toFields().handle_delete_client = toOnHandleDeleteClient(this, HANDLE_DELETE_CLIENT, handle_delete_client);
        toFields().writeField(HANDLE_DELETE_CLIENT);
    }

    /**
     * 
     * <br>See {@link OnHandleDeleteClient#onHandleDeleteClient}
    */
    public JnaManagerIface.OnHandleDeleteClient getFieldHandleDeleteClient() {
       toFields().readField(HANDLE_DELETE_CLIENT);
       return toFields().handle_delete_client;
    } 

    /**
     * 
     * <br>See {@link OnHandleGetClient#onHandleGetClient}
    */
    public static final String HANDLE_GET_CLIENT = "handle_get_client";

    /**
     * 
     * <br>See {@link OnHandleGetClient#onHandleGetClient}
    */
    public void setFieldHandleGetClient(OnHandleGetClient handle_get_client) {
        toFields().handle_get_client = toOnHandleGetClient(this, HANDLE_GET_CLIENT, handle_get_client);
        toFields().writeField(HANDLE_GET_CLIENT);
    }

    /**
     * 
     * <br>See {@link OnHandleGetClient#onHandleGetClient}
    */
    public JnaManagerIface.OnHandleGetClient getFieldHandleGetClient() {
       toFields().readField(HANDLE_GET_CLIENT);
       return toFields().handle_get_client;
    } 

    /**
     * 
     * <br>See {@link OnGetAvailableAccuracyLevel#onGetAvailableAccuracyLevel}
    */
    public static final String GET_AVAILABLE_ACCURACY_LEVEL = "get_available_accuracy_level";

    /**
     * 
     * <br>See {@link OnGetAvailableAccuracyLevel#onGetAvailableAccuracyLevel}
    */
    public void setFieldGetAvailableAccuracyLevel(OnGetAvailableAccuracyLevel get_available_accuracy_level) {
        toFields().get_available_accuracy_level = toOnGetAvailableAccuracyLevel(this, GET_AVAILABLE_ACCURACY_LEVEL, get_available_accuracy_level);
        toFields().writeField(GET_AVAILABLE_ACCURACY_LEVEL);
    }

    /**
     * 
     * <br>See {@link OnGetAvailableAccuracyLevel#onGetAvailableAccuracyLevel}
    */
    public JnaManagerIface.OnGetAvailableAccuracyLevel getFieldGetAvailableAccuracyLevel() {
       toFields().readField(GET_AVAILABLE_ACCURACY_LEVEL);
       return toFields().get_available_accuracy_level;
    } 

    /**
     * 
     * <br>See {@link OnGetInUse#onGetInUse}
    */
    public static final String GET_IN_USE = "get_in_use";

    /**
     * 
     * <br>See {@link OnGetInUse#onGetInUse}
    */
    public void setFieldGetInUse(OnGetInUse get_in_use) {
        toFields().get_in_use = toOnGetInUse(this, GET_IN_USE, get_in_use);
        toFields().writeField(GET_IN_USE);
    }

    /**
     * 
     * <br>See {@link OnGetInUse#onGetInUse}
    */
    public JnaManagerIface.OnGetInUse getFieldGetInUse() {
       toFields().readField(GET_IN_USE);
       return toFields().get_in_use;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Manager.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Manager.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
