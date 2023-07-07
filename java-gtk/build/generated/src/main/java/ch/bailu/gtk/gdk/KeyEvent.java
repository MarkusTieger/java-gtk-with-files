/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a key-based device.
 * <p><a href="https://docs.gtk.org/gdk4/class.KeyEvent.html">https://docs.gtk.org/gdk4/class.KeyEvent.html</a></p>
*/
public class KeyEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(KeyEvent.class.getCanonicalName());
    }

    public KeyEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts the consumed modifiers from a key event.
     * @return the consumed modifiers or &#64;event
    */
    public int getConsumedModifiers()  {
        return JnaKeyEvent.INST().gdk_key_event_get_consumed_modifiers(asCPointer());
    }

    /**
     * Extracts the keycode from a key event.
     * @return the keycode of &#64;event
    */
    public int getKeycode()  {
        return JnaKeyEvent.INST().gdk_key_event_get_keycode(asCPointer());
    }

    /**
     * Extracts the keyval from a key event.
     * @return the keyval of &#64;event
    */
    public int getKeyval()  {
        return JnaKeyEvent.INST().gdk_key_event_get_keyval(asCPointer());
    }

    /**
     * Extracts the layout from a key event.
     * @return the layout of &#64;event
    */
    public int getLayout()  {
        return JnaKeyEvent.INST().gdk_key_event_get_layout(asCPointer());
    }

    /**
     * Extracts the shift level from a key event.
     * @return the shift level of &#64;event
    */
    public int getLevel()  {
        return JnaKeyEvent.INST().gdk_key_event_get_level(asCPointer());
    }

    /**
     * Extracts whether the key event is for a modifier key.
     * @return %TRUE if the &#64;event is for a modifier key
    */
    public boolean isModifier()  {
        return JnaKeyEvent.INST().gdk_key_event_is_modifier(asCPointer());
    }

    /**
     * Matches a key event against a keyval and modifiers.
     * <br>
     * <br>This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     * <br>
     * <br>Partial matches are possible where the combination matches
     * <br>if the currently active group is ignored.
     * <br>
     * <br>Note that we ignore Caps Lock for matching.
     * @param keyval the keyval to match
     * @param modifiers the modifiers to match
     * @return a `GdkKeyMatch` value describing whether &#64;event matches
    */
    public int matches(int keyval, int modifiers)  {
        return JnaKeyEvent.INST().gdk_key_event_matches(asCPointer(), keyval, modifiers);
    }

    public static long getTypeID() { 
        return JnaKeyEvent.INST().gdk_key_event_get_type(); 
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

[MethodModel:java-type-not-supported:getMatch:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
*/
