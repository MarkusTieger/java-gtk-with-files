/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAppLaunchContextClass {

    @FunctionalInterface
    public interface OnGetDisplay extends com.sun.jna.Callback {
        long invoke(long context, long info, long files);
    }

    @FunctionalInterface
    public interface OnGetStartupNotifyId extends com.sun.jna.Callback {
        long invoke(long context, long info, long files);
    }

    @FunctionalInterface
    public interface OnLaunchFailed extends com.sun.jna.Callback {
        void invoke(long context, long startup_notify_id);
    }

    @FunctionalInterface
    public interface OnLaunched extends com.sun.jna.Callback {
        void invoke(long context, long info, long platform_data);
    }

    @FunctionalInterface
    public interface OnLaunchStarted extends com.sun.jna.Callback {
        void invoke(long context, long info, long platform_data);
    }

    @FunctionalInterface
    public interface OnGReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("AppLaunchContextClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({AppLaunchContextClass.PARENT_CLASS, AppLaunchContextClass.GET_DISPLAY, AppLaunchContextClass.GET_STARTUP_NOTIFY_ID, AppLaunchContextClass.LAUNCH_FAILED, AppLaunchContextClass.LAUNCHED, AppLaunchContextClass.LAUNCH_STARTED, AppLaunchContextClass._G_RESERVED1, AppLaunchContextClass._G_RESERVED2, AppLaunchContextClass._G_RESERVED3})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetDisplay get_display;
        public OnGetStartupNotifyId get_startup_notify_id;
        public OnLaunchFailed launch_failed;
        public OnLaunched launched;
        public OnLaunchStarted launch_started;
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
