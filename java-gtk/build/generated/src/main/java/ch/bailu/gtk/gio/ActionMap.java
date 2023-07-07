/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GActionMap interface is implemented by &#35;GActionGroup
 * <br>implementations that operate by containing a number of
 * <br>named &#35;GAction instances, such as &#35;GSimpleActionGroup.
 * <br>
 * <br>One useful application of this interface is to map the
 * <br>names of actions from various action groups to unique,
 * <br>prefixed names (e.g. by prepending &quot;app.&quot; or &quot;win.&quot;).
 * <br>This is the motivation for the 'Map' part of the interface
 * <br>name.
 * <p><a href="https://docs.gtk.org/gio/iface.ActionMap.html">https://docs.gtk.org/gio/iface.ActionMap.html</a></p>
*/
public class ActionMap extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionMap.class.getCanonicalName());
    }

    public ActionMap(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds an action to the &#64;action_map.
     * <br>
     * <br>If the action map already contains an action with the same name
     * <br>as &#64;action then the old action is dropped from the action map.
     * <br>
     * <br>The action map takes its own reference on &#64;action.
     * @param action a &#35;GAction
    */
    public void addAction(@Nonnull Action action)  {
        JnaActionMap.INST().g_action_map_add_action(asCPointer(), asCPointerNotNull(action));
    }

    /**
     * Looks up the action with the name &#64;action_name in &#64;action_map.
     * <br>
     * <br>If no such action exists, returns %NULL.
     * @param action_name the name of an action
     * @return a &#35;GAction, or %NULL
    */
    public Action lookupAction(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new Action(new PointerContainer(JnaActionMap.INST().g_action_map_lookup_action(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Looks up the action with the name &#64;action_name in &#64;action_map.
     * <br>
     * <br>If no such action exists, returns %NULL.
     * @param action_name the name of an action
     * @return a &#35;GAction, or %NULL
    */
    public Action lookupAction(String action_name)  {
        return new Action(new PointerContainer(JnaActionMap.INST().g_action_map_lookup_action(asCPointer(), action_name)));
    }

    /**
     * Removes the named action from the action map.
     * <br>
     * <br>If no action of this name is in the map then nothing happens.
     * @param action_name the name of the action
    */
    public void removeAction(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        JnaActionMap.INST().g_action_map_remove_action(asCPointer(), asCPointerNotNull(action_name));
    }

    /**
     * Removes the named action from the action map.
     * <br>
     * <br>If no action of this name is in the map then nothing happens.
     * @param action_name the name of the action
    */
    public void removeAction(String action_name)  {
        JnaActionMap.INST().g_action_map_remove_action(asCPointer(), action_name);
    }

    public static long getTypeID() { 
        return JnaActionMap.INST().g_action_map_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:addActionEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GActionEntry*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
