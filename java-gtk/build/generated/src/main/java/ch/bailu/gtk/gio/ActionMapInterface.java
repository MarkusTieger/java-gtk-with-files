/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GActionMap.
 * <p><a href="https://docs.gtk.org/gio/struct.ActionMapInterface.html">https://docs.gtk.org/gio/struct.ActionMapInterface.html</a></p>
*/
public class ActionMapInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionMapInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLookupAction {
        /**
         * 
         * @param action_map a &#35;GActionMap
         * @param action_name the name of an action
         * @return a &#35;GAction, or %NULL
        */
        Action onLookupAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ActionMap action_map, @Nonnull ch.bailu.gtk.type.Str action_name);
    }
    
    private static JnaActionMapInterface.OnLookupAction toOnLookupAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupAction in) {
        JnaActionMapInterface.OnLookupAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action_map, _action_name) -> in.onLookupAction(__callback, new ActionMap(new PointerContainer(_action_map)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAddAction {
        /**
         * 
         * @param action_map a &#35;GActionMap
         * @param action a &#35;GAction
        */
        void onAddAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ActionMap action_map, @Nonnull Action action);
    }
    
    private static JnaActionMapInterface.OnAddAction toOnAddAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnAddAction in) {
        JnaActionMapInterface.OnAddAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action_map, _action) -> in.onAddAction(__callback, new ActionMap(new PointerContainer(_action_map)), new Action(new PointerContainer(_action)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoveAction {
        /**
         * 
         * @param action_map a &#35;GActionMap
         * @param action_name the name of the action
        */
        void onRemoveAction(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ActionMap action_map, @Nonnull ch.bailu.gtk.type.Str action_name);
    }
    
    private static JnaActionMapInterface.OnRemoveAction toOnRemoveAction(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoveAction in) {
        JnaActionMapInterface.OnRemoveAction out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action_map, _action_name) -> in.onRemoveAction(__callback, new ActionMap(new PointerContainer(_action_map)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)));
            __callback.register(out);
        }
        return out;
    }

    public ActionMapInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ActionMapInterface() {
        super(cast(JnaActionMapInterface.allocateStructure()));
    }

    private JnaActionMapInterface.Fields _fields;
    
    JnaActionMapInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionMapInterface.Fields(asCPointer());
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
     * <br>See {@link OnLookupAction#onLookupAction}
    */
    public static final String LOOKUP_ACTION = "lookup_action";

    /**
     * 
     * <br>See {@link OnLookupAction#onLookupAction}
    */
    public void setFieldLookupAction(OnLookupAction lookup_action) {
        toFields().lookup_action = toOnLookupAction(this, LOOKUP_ACTION, lookup_action);
        toFields().writeField(LOOKUP_ACTION);
    }

    /**
     * 
     * <br>See {@link OnLookupAction#onLookupAction}
    */
    public JnaActionMapInterface.OnLookupAction getFieldLookupAction() {
       toFields().readField(LOOKUP_ACTION);
       return toFields().lookup_action;
    } 

    /**
     * 
     * <br>See {@link OnAddAction#onAddAction}
    */
    public static final String ADD_ACTION = "add_action";

    /**
     * 
     * <br>See {@link OnAddAction#onAddAction}
    */
    public void setFieldAddAction(OnAddAction add_action) {
        toFields().add_action = toOnAddAction(this, ADD_ACTION, add_action);
        toFields().writeField(ADD_ACTION);
    }

    /**
     * 
     * <br>See {@link OnAddAction#onAddAction}
    */
    public JnaActionMapInterface.OnAddAction getFieldAddAction() {
       toFields().readField(ADD_ACTION);
       return toFields().add_action;
    } 

    /**
     * 
     * <br>See {@link OnRemoveAction#onRemoveAction}
    */
    public static final String REMOVE_ACTION = "remove_action";

    /**
     * 
     * <br>See {@link OnRemoveAction#onRemoveAction}
    */
    public void setFieldRemoveAction(OnRemoveAction remove_action) {
        toFields().remove_action = toOnRemoveAction(this, REMOVE_ACTION, remove_action);
        toFields().writeField(REMOVE_ACTION);
    }

    /**
     * 
     * <br>See {@link OnRemoveAction#onRemoveAction}
    */
    public JnaActionMapInterface.OnRemoveAction getFieldRemoveAction() {
       toFields().readField(REMOVE_ACTION);
       return toFields().remove_action;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionMap.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ActionMap.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
