/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSimpleActionGroup is a hash table filled with &#35;GAction objects,
 * <br>implementing the &#35;GActionGroup and &#35;GActionMap interfaces.
 * <p><a href="https://docs.gtk.org/gio/class.SimpleActionGroup.html">https://docs.gtk.org/gio/class.SimpleActionGroup.html</a></p>
*/
public class SimpleActionGroup extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimpleActionGroup.class.getCanonicalName());
    }

    public SimpleActionGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new, empty, &#35;GSimpleActionGroup.
    */
    public SimpleActionGroup() {
        super(cast(JnaSimpleActionGroup.INST().g_simple_action_group_new()));
    }

    /**
     * Implements interface {@link ActionGroup}. Call this to get access to interface functions.
     * @return {@link ActionGroup}
    */
    public ActionGroup asActionGroup() {
        return new ActionGroup(cast());
    }

    /**
     * Implements interface {@link ActionMap}. Call this to get access to interface functions.
     * @return {@link ActionMap}
    */
    public ActionMap asActionMap() {
        return new ActionMap(cast());
    }

    public static long getTypeID() { 
        return JnaSimpleActionGroup.INST().g_simple_action_group_get_type(); 
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

[MethodModel:cb-deprecated:java-type-not-supported:addEntries:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GActionEntry*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:insert:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Action:{c:GAction*}}:{j:long}]

[MethodModel:cb-deprecated:lookup:[ParameterModel:Supported:{Gg:Action:{c:GAction*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:remove:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
*/
