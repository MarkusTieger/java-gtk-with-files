/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcut`Action that emits a signal.
 * <br>
 * <br>Signals that are used in this way are referred to as keybinding signals,
 * <br>and they are expected to be defined with the %G_SIGNAL_ACTION flag.
 * <p><a href="https://docs.gtk.org/gtk4/class.SignalAction.html">https://docs.gtk.org/gtk4/class.SignalAction.html</a></p>
*/
public class SignalAction extends ShortcutAction {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SignalAction.class.getCanonicalName());
    }

    public SignalAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates an action that when activated, emits the given action signal
     * <br>on the provided widget.
     * <br>
     * <br>It will also unpack the args into arguments passed to the signal.
     * @param signal_name name of the signal to emit
    */
    public SignalAction(@Nonnull ch.bailu.gtk.type.Str signal_name) {
        super(cast(JnaSignalAction.INST().gtk_signal_action_new(asCPointerNotNull(signal_name))));
    }

    /**
     * Creates an action that when activated, emits the given action signal
     * <br>on the provided widget.
     * <br>
     * <br>It will also unpack the args into arguments passed to the signal.
     * @param signal_name name of the signal to emit
    */
    public SignalAction(String signal_name) {
        super(cast(JnaSignalAction.INST().gtk_signal_action_new(signal_name)));
    }

    /**
     * Returns the name of the signal that will be emitted.
     * @return the name of the signal to emit
    */
    public ch.bailu.gtk.type.Str getSignalName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSignalAction.INST().gtk_signal_action_get_signal_name(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaSignalAction.INST().gtk_signal_action_get_type(); 
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
