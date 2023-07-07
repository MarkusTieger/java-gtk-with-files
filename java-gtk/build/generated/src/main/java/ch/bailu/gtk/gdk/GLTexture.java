/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GdkTexture representing a GL texture object.
 * <p><a href="https://docs.gtk.org/gdk4/class.GLTexture.html">https://docs.gtk.org/gdk4/class.GLTexture.html</a></p>
*/
public class GLTexture extends Texture {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLTexture.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaGLTexture.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaGLTexture.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public GLTexture(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new texture for an existing GL texture.
     * <br>
     * <br>Note that the GL texture must not be modified until &#64;destroy is called,
     * <br>which will happen when the GdkTexture object is finalized, or due to
     * <br>an explicit call of [method&#64;Gdk.GLTexture.release].
     * @param context a `GdkGLContext`
     * @param id the ID of a texture that was created with &#64;context
     * @param width the nominal width of the texture
     * @param height the nominal height of the texture
     * @param destroy a destroy notify that will be called when the GL resources   are released
     * @param data data that gets passed to &#64;destroy
    */
    public GLTexture(@Nonnull GLContext context, int id, int width, int height, OnDestroyNotify destroy, @Nullable ch.bailu.gtk.type.Pointer data) {
        super(cast(JnaGLTexture.INST().gdk_gl_texture_new(asCPointerNotNull(context), id, width, height, toOnDestroyNotify(getClassHandler().getInstance(), "_new", destroy), asCPointer(data))));
    }

    /**
     * Releases the GL resources held by a `GdkGLTexture`.
     * <br>
     * <br>The texture contents are still available via the
     * <br>[method&#64;Gdk.Texture.download] function, after this
     * <br>function has been called.
    */
    public void release()  {
        JnaGLTexture.INST().gdk_gl_texture_release(asCPointer());
    }

    /**
     * Implements interface {@link Paintable}. Call this to get access to interface functions.
     * @return {@link Paintable}
    */
    public Paintable asPaintable() {
        return new Paintable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.Icon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.Icon}
    */
    public ch.bailu.gtk.gio.Icon asIcon() {
        return new ch.bailu.gtk.gio.Icon(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.LoadableIcon}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.LoadableIcon}
    */
    public ch.bailu.gtk.gio.LoadableIcon asLoadableIcon() {
        return new ch.bailu.gtk.gio.LoadableIcon(cast());
    }

    public static long getTypeID() { 
        return JnaGLTexture.INST().gdk_gl_texture_get_type(); 
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
