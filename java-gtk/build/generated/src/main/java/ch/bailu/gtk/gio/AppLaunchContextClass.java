/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.AppLaunchContextClass.html">https://docs.gtk.org/gio/struct.AppLaunchContextClass.html</a></p>
*/
public class AppLaunchContextClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppLaunchContextClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetDisplay {
        /**
         * 
         * @param context a &#35;GAppLaunchContext
         * @param info a &#35;GAppInfo
         * @param files a &#35;GList of &#35;GFile objects
         * @return a display string for the display.
        */
        ch.bailu.gtk.type.Str onGetDisplay(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppLaunchContext context, @Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.List files);
    }
    
    private static JnaAppLaunchContextClass.OnGetDisplay toOnGetDisplay(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDisplay in) {
        JnaAppLaunchContextClass.OnGetDisplay out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _info, _files) -> in.onGetDisplay(__callback, new AppLaunchContext(new PointerContainer(_context)), new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.List(new PointerContainer(_files))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStartupNotifyId {
        /**
         * 
         * @param context a &#35;GAppLaunchContext
         * @param info a &#35;GAppInfo
         * @param files a &#35;GList of of &#35;GFile objects
         * @return a startup notification ID for the application, or %NULL if     not supported.
        */
        ch.bailu.gtk.type.Str onGetStartupNotifyId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppLaunchContext context, @Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.List files);
    }
    
    private static JnaAppLaunchContextClass.OnGetStartupNotifyId toOnGetStartupNotifyId(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStartupNotifyId in) {
        JnaAppLaunchContextClass.OnGetStartupNotifyId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _info, _files) -> in.onGetStartupNotifyId(__callback, new AppLaunchContext(new PointerContainer(_context)), new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.List(new PointerContainer(_files))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunchFailed {
        /**
         * 
         * @param context a &#35;GAppLaunchContext.
         * @param startup_notify_id the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
        */
        void onLaunchFailed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppLaunchContext context, @Nonnull ch.bailu.gtk.type.Str startup_notify_id);
    }
    
    private static JnaAppLaunchContextClass.OnLaunchFailed toOnLaunchFailed(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunchFailed in) {
        JnaAppLaunchContextClass.OnLaunchFailed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _startup_notify_id) -> in.onLaunchFailed(__callback, new AppLaunchContext(new PointerContainer(_context)), new ch.bailu.gtk.type.Str(new PointerContainer(_startup_notify_id)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunched {
        /**
         * 
         * @param context 
         * @param info 
         * @param platform_data 
        */
        void onLaunched(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppLaunchContext context, @Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static JnaAppLaunchContextClass.OnLaunched toOnLaunched(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunched in) {
        JnaAppLaunchContextClass.OnLaunched out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _info, _platform_data) -> in.onLaunched(__callback, new AppLaunchContext(new PointerContainer(_context)), new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunchStarted {
        /**
         * 
         * @param context 
         * @param info 
         * @param platform_data 
        */
        void onLaunchStarted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppLaunchContext context, @Nonnull AppInfo info, @Nonnull ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static JnaAppLaunchContextClass.OnLaunchStarted toOnLaunchStarted(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunchStarted in) {
        JnaAppLaunchContextClass.OnLaunchStarted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_context, _info, _platform_data) -> in.onLaunchStarted(__callback, new AppLaunchContext(new PointerContainer(_context)), new AppInfo(new PointerContainer(_info)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaAppLaunchContextClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaAppLaunchContextClass.OnGReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved2 {
        void onGReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaAppLaunchContextClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaAppLaunchContextClass.OnGReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved3 {
        void onGReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaAppLaunchContextClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaAppLaunchContextClass.OnGReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    public AppLaunchContextClass(PointerContainer pointer) {
        super(pointer);
    }

    public AppLaunchContextClass() {
        super(cast(JnaAppLaunchContextClass.allocateStructure()));
    }

    private JnaAppLaunchContextClass.Fields _fields;
    
    JnaAppLaunchContextClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAppLaunchContextClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnGetDisplay#onGetDisplay}
    */
    public static final String GET_DISPLAY = "get_display";

    /**
     * 
     * <br>See {@link OnGetDisplay#onGetDisplay}
    */
    public void setFieldGetDisplay(OnGetDisplay get_display) {
        toFields().get_display = toOnGetDisplay(this, GET_DISPLAY, get_display);
        toFields().writeField(GET_DISPLAY);
    }

    /**
     * 
     * <br>See {@link OnGetDisplay#onGetDisplay}
    */
    public JnaAppLaunchContextClass.OnGetDisplay getFieldGetDisplay() {
       toFields().readField(GET_DISPLAY);
       return toFields().get_display;
    } 

    /**
     * 
     * <br>See {@link OnGetStartupNotifyId#onGetStartupNotifyId}
    */
    public static final String GET_STARTUP_NOTIFY_ID = "get_startup_notify_id";

    /**
     * 
     * <br>See {@link OnGetStartupNotifyId#onGetStartupNotifyId}
    */
    public void setFieldGetStartupNotifyId(OnGetStartupNotifyId get_startup_notify_id) {
        toFields().get_startup_notify_id = toOnGetStartupNotifyId(this, GET_STARTUP_NOTIFY_ID, get_startup_notify_id);
        toFields().writeField(GET_STARTUP_NOTIFY_ID);
    }

    /**
     * 
     * <br>See {@link OnGetStartupNotifyId#onGetStartupNotifyId}
    */
    public JnaAppLaunchContextClass.OnGetStartupNotifyId getFieldGetStartupNotifyId() {
       toFields().readField(GET_STARTUP_NOTIFY_ID);
       return toFields().get_startup_notify_id;
    } 

    /**
     * 
     * <br>See {@link OnLaunchFailed#onLaunchFailed}
    */
    public static final String LAUNCH_FAILED = "launch_failed";

    /**
     * 
     * <br>See {@link OnLaunchFailed#onLaunchFailed}
    */
    public void setFieldLaunchFailed(OnLaunchFailed launch_failed) {
        toFields().launch_failed = toOnLaunchFailed(this, LAUNCH_FAILED, launch_failed);
        toFields().writeField(LAUNCH_FAILED);
    }

    /**
     * 
     * <br>See {@link OnLaunchFailed#onLaunchFailed}
    */
    public JnaAppLaunchContextClass.OnLaunchFailed getFieldLaunchFailed() {
       toFields().readField(LAUNCH_FAILED);
       return toFields().launch_failed;
    } 

    /**
     * 
     * <br>See {@link OnLaunched#onLaunched}
    */
    public static final String LAUNCHED = "launched";

    /**
     * 
     * <br>See {@link OnLaunched#onLaunched}
    */
    public void setFieldLaunched(OnLaunched launched) {
        toFields().launched = toOnLaunched(this, LAUNCHED, launched);
        toFields().writeField(LAUNCHED);
    }

    /**
     * 
     * <br>See {@link OnLaunched#onLaunched}
    */
    public JnaAppLaunchContextClass.OnLaunched getFieldLaunched() {
       toFields().readField(LAUNCHED);
       return toFields().launched;
    } 

    /**
     * 
     * <br>See {@link OnLaunchStarted#onLaunchStarted}
    */
    public static final String LAUNCH_STARTED = "launch_started";

    /**
     * 
     * <br>See {@link OnLaunchStarted#onLaunchStarted}
    */
    public void setFieldLaunchStarted(OnLaunchStarted launch_started) {
        toFields().launch_started = toOnLaunchStarted(this, LAUNCH_STARTED, launch_started);
        toFields().writeField(LAUNCH_STARTED);
    }

    /**
     * 
     * <br>See {@link OnLaunchStarted#onLaunchStarted}
    */
    public JnaAppLaunchContextClass.OnLaunchStarted getFieldLaunchStarted() {
       toFields().readField(LAUNCH_STARTED);
       return toFields().launch_started;
    } 

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public static final String _G_RESERVED1 = "_g_reserved1";

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public void setFieldGReserved1(OnGReserved1 _g_reserved1) {
        toFields()._g_reserved1 = toOnGReserved1(this, _G_RESERVED1, _g_reserved1);
        toFields().writeField(_G_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public JnaAppLaunchContextClass.OnGReserved1 getFieldGReserved1() {
       toFields().readField(_G_RESERVED1);
       return toFields()._g_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public static final String _G_RESERVED2 = "_g_reserved2";

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public void setFieldGReserved2(OnGReserved2 _g_reserved2) {
        toFields()._g_reserved2 = toOnGReserved2(this, _G_RESERVED2, _g_reserved2);
        toFields().writeField(_G_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public JnaAppLaunchContextClass.OnGReserved2 getFieldGReserved2() {
       toFields().readField(_G_RESERVED2);
       return toFields()._g_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public static final String _G_RESERVED3 = "_g_reserved3";

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public void setFieldGReserved3(OnGReserved3 _g_reserved3) {
        toFields()._g_reserved3 = toOnGReserved3(this, _G_RESERVED3, _g_reserved3);
        toFields().writeField(_G_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public JnaAppLaunchContextClass.OnGReserved3 getFieldGReserved3() {
       toFields().readField(_G_RESERVED3);
       return toFields()._g_reserved3;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AppLaunchContext.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AppLaunchContext.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
