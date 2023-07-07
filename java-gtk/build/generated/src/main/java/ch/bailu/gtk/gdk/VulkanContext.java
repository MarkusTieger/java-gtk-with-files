/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkVulkanContext` is an object representing the platform-specific
 * <br>Vulkan draw context.
 * <br>
 * <br>`GdkVulkanContext`s are created for a surface using
 * <br>[method&#64;Gdk.Surface.create_vulkan_context], and the context will match
 * <br>the characteristics of the surface.
 * <br>
 * <br>Support for `GdkVulkanContext` is platform-specific and context creation
 * <br>can fail, returning %NULL context.
 * <p><a href="https://docs.gtk.org/gdk4/class.VulkanContext.html">https://docs.gtk.org/gdk4/class.VulkanContext.html</a></p>
*/
public class VulkanContext extends DrawContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VulkanContext.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnImagesUpdated {
        /**
         * Emitted when the images managed by this context have changed.
         * <br>
         * <br>Usually this means that the swapchain had to be recreated,
         * <br>for example in response to a change of the surface size.
        */
        void onImagesUpdated();
    }
    
    private static com.sun.jna.Callback toOnImagesUpdated(OnImagesUpdated in) {
        return (in == null) ? null: (JnaVulkanContext.OnImagesUpdated) (__self, __data) -> in.onImagesUpdated();
    }

    public VulkanContext(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_IMAGES_UPDATED = "images-updated";
    
    /**
     * Connect to signal "images-updated".
     * <br>See {@link OnImagesUpdated#onImagesUpdated} for signal description.
     * <br>Field {@link #SIGNAL_ON_IMAGES_UPDATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onImagesUpdated(OnImagesUpdated signal) {
        return connectSignal(SIGNAL_ON_IMAGES_UPDATED, toOnImagesUpdated(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.Initable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.Initable}
    */
    public ch.bailu.gtk.gio.Initable asInitable() {
        return new ch.bailu.gtk.gio.Initable(cast());
    }

    public static long getTypeID() { 
        return JnaVulkanContext.INST().gdk_vulkan_context_get_type(); 
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
