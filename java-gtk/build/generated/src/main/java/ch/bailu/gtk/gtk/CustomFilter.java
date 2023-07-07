/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 * <p><a href="https://docs.gtk.org/gtk4/class.CustomFilter.html">https://docs.gtk.org/gtk4/class.CustomFilter.html</a></p>
*/
public class CustomFilter extends Filter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CustomFilter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCustomFilterFunc {
        /**
         * User function that is called to determine if the &#64;item should be matched.
         * <br>
         * <br>If the filter matches the item, this function must return %TRUE. If the
         * <br>item should be filtered out, %FALSE must be returned.
         * @param item The item to be matched
         * @param user_data user data
         * @return %TRUE to keep the item around
        */
        boolean onCustomFilterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer item, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaCustomFilter.OnCustomFilterFunc toOnCustomFilterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCustomFilterFunc in) {
        JnaCustomFilter.OnCustomFilterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_item, _user_data) -> in.onCustomFilterFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaCustomFilter.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCustomFilter.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public CustomFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new filter using the given &#64;match_func to filter
     * <br>items.
     * <br>
     * <br>If &#64;match_func is %NULL, the filter matches all items.
     * <br>
     * <br>If the filter func changes its filtering behavior,
     * <br>gtk_filter_changed() needs to be called.
     * @param match_func function to filter items
     * @param user_data user data to pass to &#64;match_func
     * @param user_destroy destroy notify for &#64;user_data
    */
    public CustomFilter(OnCustomFilterFunc match_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy) {
        super(cast(JnaCustomFilter.INST().gtk_custom_filter_new(toOnCustomFilterFunc(getClassHandler().getInstance(), "_new", match_func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", user_destroy))));
    }

    /**
     * Sets the function used for filtering items.
     * <br>
     * <br>If &#64;match_func is %NULL, the filter matches all items.
     * <br>
     * <br>If the filter func changes its filtering behavior,
     * <br>gtk_filter_changed() needs to be called.
     * <br>
     * <br>If a previous function was set, its &#64;user_destroy will be
     * <br>called now.
     * @param match_func function to filter items
     * @param user_data user data to pass to &#64;match_func
     * @param user_destroy destroy notify for &#64;user_data
    */
    public void setFilterFunc(OnCustomFilterFunc match_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy)  {
        JnaCustomFilter.INST().gtk_custom_filter_set_filter_func(asCPointer(), toOnCustomFilterFunc(this, "setFilterFunc", match_func), asCPointer(user_data), toOnDestroyNotify(this, "setFilterFunc", user_destroy));
    }

    public static long getTypeID() { 
        return JnaCustomFilter.INST().gtk_custom_filter_get_type(); 
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
