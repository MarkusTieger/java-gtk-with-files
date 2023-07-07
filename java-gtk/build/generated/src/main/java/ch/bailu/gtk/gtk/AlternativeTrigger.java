/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutTrigger` that combines two triggers.
 * <br>
 * <br>The `GtkAlternativeTrigger` triggers when either of two trigger.
 * <br>
 * <br>This can be cascaded to combine more than two triggers.
 * <p><a href="https://docs.gtk.org/gtk4/class.AlternativeTrigger.html">https://docs.gtk.org/gtk4/class.AlternativeTrigger.html</a></p>
*/
public class AlternativeTrigger extends ShortcutTrigger {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AlternativeTrigger.class.getCanonicalName());
    }

    public AlternativeTrigger(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * <br>either of the two given triggers gets triggered.
     * <br>
     * <br>Note that nesting is allowed, so if you want more than two
     * <br>alternative, create a new alternative trigger for each option.
     * @param first The first trigger that may trigger
     * @param second The second trigger that may trigger
    */
    public AlternativeTrigger(@Nonnull ShortcutTrigger first, @Nonnull ShortcutTrigger second) {
        super(cast(JnaAlternativeTrigger.INST().gtk_alternative_trigger_new(asCPointerNotNull(first), asCPointerNotNull(second))));
    }

    /**
     * Gets the first of the two alternative triggers that may
     * <br>trigger &#64;self.
     * <br>
     * <br>[method&#64;Gtk.AlternativeTrigger.get_second] will return
     * <br>the other one.
     * @return the first alternative trigger
    */
    public ShortcutTrigger getFirst()  {
        return new ShortcutTrigger(new PointerContainer(JnaAlternativeTrigger.INST().gtk_alternative_trigger_get_first(asCPointer())));
    }

    /**
     * Gets the second of the two alternative triggers that may
     * <br>trigger &#64;self.
     * <br>
     * <br>[method&#64;Gtk.AlternativeTrigger.get_first] will return
     * <br>the other one.
     * @return the second alternative trigger
    */
    public ShortcutTrigger getSecond()  {
        return new ShortcutTrigger(new PointerContainer(JnaAlternativeTrigger.INST().gtk_alternative_trigger_get_second(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaAlternativeTrigger.INST().gtk_alternative_trigger_get_type(); 
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
