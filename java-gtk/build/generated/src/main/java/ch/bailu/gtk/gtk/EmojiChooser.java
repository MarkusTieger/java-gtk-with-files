/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkEmojiChooser` is used by text widgets such as `GtkEntry` or
 * <br>`GtkTextView` to let users insert Emoji characters.
 * <br>
 * <br>![An example GtkEmojiChooser](emojichooser.png)
 * <br>
 * <br>`GtkEmojiChooser` emits the [signal&#64;Gtk.EmojiChooser::emoji-picked]
 * <br>signal when an Emoji is selected.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>popover
 * <br>├── box.emoji-searchbar
 * <br>│   ╰── entry.search
 * <br>╰── box.emoji-toolbar
 * <br>    ├── button.image-button.emoji-section
 * <br>    ├── ...
 * <br>    ╰── button.image-button.emoji-section
 * <br>```
 * <br>
 * <br>Every `GtkEmojiChooser` consists of a main node called popover.
 * <br>The contents of the popover are largely implementation defined
 * <br>and supposed to inherit general styles.
 * <br>The top searchbar used to search emoji and gets the .emoji-searchbar
 * <br>style class itself.
 * <br>The bottom toolbar used to switch between different emoji categories
 * <br>consists of buttons with the .emoji-section style class and gets the
 * <br>.emoji-toolbar style class itself.
 * <p><a href="https://docs.gtk.org/gtk4/class.EmojiChooser.html">https://docs.gtk.org/gtk4/class.EmojiChooser.html</a></p>
*/
public class EmojiChooser extends Popover {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EmojiChooser.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEmojiPicked {
        /**
         * Emitted when the user selects an Emoji.
         * @param text the Unicode sequence for the picked Emoji, in UTF-8
        */
        void onEmojiPicked(@Nonnull ch.bailu.gtk.type.Str text);
    }
    
    private static com.sun.jna.Callback toOnEmojiPicked(OnEmojiPicked in) {
        return (in == null) ? null: (JnaEmojiChooser.OnEmojiPicked) (__self, _text, __data) -> in.onEmojiPicked(new ch.bailu.gtk.type.Str(new PointerContainer(_text)));
    }

    public EmojiChooser(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkEmojiChooser`.
    */
    public EmojiChooser() {
        super(cast(JnaEmojiChooser.INST().gtk_emoji_chooser_new()));
    }

    public final static String SIGNAL_ON_EMOJI_PICKED = "emoji-picked";
    
    /**
     * Connect to signal "emoji-picked".
     * <br>See {@link OnEmojiPicked#onEmojiPicked} for signal description.
     * <br>Field {@link #SIGNAL_ON_EMOJI_PICKED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEmojiPicked(OnEmojiPicked signal) {
        return connectSignal(SIGNAL_ON_EMOJI_PICKED, toOnEmojiPicked(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaEmojiChooser.INST().gtk_emoji_chooser_get_type(); 
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
