/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPermissionClass {

    @FunctionalInterface
    public interface OnAcquire extends com.sun.jna.Callback {
        boolean invoke(long permission, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnAcquireAsync extends com.sun.jna.Callback {
        void invoke(long permission, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnAcquireFinish extends com.sun.jna.Callback {
        boolean invoke(long permission, long result, long _error);
    }

    @FunctionalInterface
    public interface OnRelease extends com.sun.jna.Callback {
        boolean invoke(long permission, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnReleaseAsync extends com.sun.jna.Callback {
        void invoke(long permission, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnReleaseFinish extends com.sun.jna.Callback {
        boolean invoke(long permission, long result, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("PermissionClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({PermissionClass.PARENT_CLASS, PermissionClass.ACQUIRE, PermissionClass.ACQUIRE_ASYNC, PermissionClass.ACQUIRE_FINISH, PermissionClass.RELEASE, PermissionClass.RELEASE_ASYNC, PermissionClass.RELEASE_FINISH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnAcquire acquire;
        public OnAcquireAsync acquire_async;
        public OnAcquireFinish acquire_finish;
        public OnRelease release;
        public OnReleaseAsync release_async;
        public OnReleaseFinish release_finish;
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
