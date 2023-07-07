/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
 * <br>function.
 * <p><a href="https://docs.gtk.org/gtk4/class.CustomSorter.html">https://docs.gtk.org/gtk4/class.CustomSorter.html</a></p>
*/
public class CustomSorter extends Sorter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CustomSorter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaCustomSorter.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaCustomSorter.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaCustomSorter.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCustomSorter.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public CustomSorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSorter` that works by calling
     * <br>&#64;sort_func to compare items.
     * <br>
     * <br>If &#64;sort_func is %NULL, all items are considered equal.
     * @param sort_func the `GCompareDataFunc` to use for sorting
     * @param user_data user data to pass to &#64;sort_func
     * @param user_destroy destroy notify for &#64;user_data
    */
    public CustomSorter(OnCompareDataFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy) {
        super(cast(JnaCustomSorter.INST().gtk_custom_sorter_new(toOnCompareDataFunc(getClassHandler().getInstance(), "_new", sort_func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", user_destroy))));
    }

    /**
     * Sets (or unsets) the function used for sorting items.
     * <br>
     * <br>If &#64;sort_func is %NULL, all items are considered equal.
     * <br>
     * <br>If the sort func changes its sorting behavior,
     * <br>gtk_sorter_changed() needs to be called.
     * <br>
     * <br>If a previous function was set, its &#64;user_destroy will be
     * <br>called now.
     * @param sort_func function to sort items
     * @param user_data user data to pass to &#64;match_func
     * @param user_destroy destroy notify for &#64;user_data
    */
    public void setSortFunc(OnCompareDataFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy)  {
        JnaCustomSorter.INST().gtk_custom_sorter_set_sort_func(asCPointer(), toOnCompareDataFunc(this, "setSortFunc", sort_func), asCPointer(user_data), toOnDestroyNotify(this, "setSortFunc", user_destroy));
    }

    public static long getTypeID() { 
        return JnaCustomSorter.INST().gtk_custom_sorter_get_type(); 
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
