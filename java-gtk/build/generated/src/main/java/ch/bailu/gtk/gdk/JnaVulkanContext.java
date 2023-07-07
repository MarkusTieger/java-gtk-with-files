/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaVulkanContext {

    @FunctionalInterface
    public interface OnImagesUpdated extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_vulkan_context_get_type();
    }

}
