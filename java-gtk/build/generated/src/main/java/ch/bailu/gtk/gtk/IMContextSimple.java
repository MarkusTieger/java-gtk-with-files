/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkIMContextSimple` is an input method supporting table-based input methods.
 * <br>
 * <br>&#35;&#35; Compose sequences
 * <br>
 * <br>`GtkIMContextSimple` reads compose sequences from the first of the
 * <br>following files that is found: ~/.config/gtk-4.0/Compose, ~/.XCompose,
 * <br>/usr/share/X11/locale/$locale/Compose (for locales that have a nontrivial
 * <br>Compose file). The syntax of these files is described in the Compose(5)
 * <br>manual page.
 * <br>
 * <br>If none of these files is found, `GtkIMContextSimple` uses a built-in table
 * <br>of compose sequences that is derived from the X11 Compose files.
 * <br>
 * <br>Note that compose sequences typically start with the Compose_key, which is
 * <br>often not available as a dedicated key on keyboards. Keyboard layouts may
 * <br>map this keysym to other keys, such as the right Control key.
 * <br>
 * <br>&#35;&#35; Unicode characters
 * <br>
 * <br>`GtkIMContextSimple` also supports numeric entry of Unicode characters
 * <br>by typing &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;u&lt;/kbd&gt;, followed by a
 * <br>hexadecimal Unicode codepoint.
 * <br>
 * <br>For example,
 * <br>
 * <br>    Ctrl-Shift-u 1 2 3 Enter
 * <br>
 * <br>yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 * <br>
 * <br>&#35;&#35; Dead keys
 * <br>
 * <br>`GtkIMContextSimple` supports dead keys. For example, typing
 * <br>
 * <br>    dead_acute a
 * <br>
 * <br> yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 * <br> depends on the keyboard layout including dead keys.
 * <p><a href="https://docs.gtk.org/gtk4/class.IMContextSimple.html">https://docs.gtk.org/gtk4/class.IMContextSimple.html</a></p>
*/
public class IMContextSimple extends IMContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IMContextSimple.class.getCanonicalName());
    }

    public IMContextSimple(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkIMContextSimple`.
    */
    public IMContextSimple() {
        super(cast(JnaIMContextSimple.INST().gtk_im_context_simple_new()));
    }

    /**
     * Adds an additional table from the X11 compose file.
     * @param compose_file The path of compose file
    */
    public void addComposeFile(@Nonnull ch.bailu.gtk.type.Str compose_file)  {
        JnaIMContextSimple.INST().gtk_im_context_simple_add_compose_file(asCPointer(), asCPointerNotNull(compose_file));
    }

    /**
     * Adds an additional table from the X11 compose file.
     * @param compose_file The path of compose file
    */
    public void addComposeFile(String compose_file)  {
        JnaIMContextSimple.INST().gtk_im_context_simple_add_compose_file(asCPointer(), compose_file);
    }

    public static long getTypeID() { 
        return JnaIMContextSimple.INST().gtk_im_context_simple_get_type(); 
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

[MethodModel:cb-deprecated:java-type-not-supported:addTable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint16*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
