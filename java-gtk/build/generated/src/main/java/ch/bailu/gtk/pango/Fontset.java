/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
 * <br>
 * <br>A `PangoFontset` is the result of resolving a `PangoFontDescription`
 * <br>against a particular `PangoContext`. It has operations for finding the
 * <br>component font for a particular Unicode character, and for finding a
 * <br>composite set of metrics for the entire fontset.
 * <p><a href="https://docs.gtk.org/Pango/class.Fontset.html">https://docs.gtk.org/Pango/class.Fontset.html</a></p>
*/
public class Fontset extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Fontset.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnFontsetForeachFunc {
        /**
         * Callback used when enumerating fonts in a fontset.
         * <br>
         * <br>See [method&#64;Pango.Fontset.foreach].
         * @param fontset a `PangoFontset`
         * @param font a font from &#64;fontset
         * @param user_data callback data
         * @return if %TRUE, stop iteration and return immediately.
        */
        boolean onFontsetForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Fontset fontset, @Nonnull Font font, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFontset.OnFontsetForeachFunc toOnFontsetForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFontsetForeachFunc in) {
        JnaFontset.OnFontsetForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_fontset, _font, _user_data) -> in.onFontsetForeachFunc(__callback, new Fontset(new PointerContainer(_fontset)), new Font(new PointerContainer(_font)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Fontset(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Iterates through all the fonts in a fontset, calling &#64;func for
     * <br>each one.
     * <br>
     * <br>If &#64;func returns %TRUE, that stops the iteration.
     * @param func Callback function
     * @param data data to pass to the callback function
    */
    public void foreach(OnFontsetForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaFontset.INST().pango_fontset_foreach(asCPointer(), toOnFontsetForeachFunc(this, "foreach", func), asCPointer(data));
    }

    /**
     * Returns the font in the fontset that contains the best
     * <br>glyph for a Unicode character.
     * @param wc a Unicode character
     * @return a `PangoFont`
    */
    public Font getFont(int wc)  {
        return new Font(new PointerContainer(JnaFontset.INST().pango_fontset_get_font(asCPointer(), wc)));
    }

    /**
     * Get overall metric information for the fonts in the fontset.
     * @return a `PangoFontMetrics` object
    */
    public FontMetrics getMetrics()  {
        return new FontMetrics(new PointerContainer(JnaFontset.INST().pango_fontset_get_metrics(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaFontset.INST().pango_fontset_get_type(); 
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
