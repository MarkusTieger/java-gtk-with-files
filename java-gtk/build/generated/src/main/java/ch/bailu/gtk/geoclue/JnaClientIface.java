/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaClientIface {

    @FunctionalInterface
    public interface OnHandleStart extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation);
    }

    @FunctionalInterface
    public interface OnHandleStop extends com.sun.jna.Callback {
        boolean invoke(long object, long invocation);
    }

    @FunctionalInterface
    public interface OnGetActive extends com.sun.jna.Callback {
        boolean invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetDesktopId extends com.sun.jna.Callback {
        long invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetDistanceThreshold extends com.sun.jna.Callback {
        int invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetLocation extends com.sun.jna.Callback {
        long invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetRequestedAccuracyLevel extends com.sun.jna.Callback {
        int invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetTimeThreshold extends com.sun.jna.Callback {
        int invoke(long object);
    }

    @FunctionalInterface
    public interface OnLocationUpdated extends com.sun.jna.Callback {
        void invoke(long object, long arg_old, long arg_new);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ClientIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ClientIface.PARENT_IFACE, ClientIface.HANDLE_START, ClientIface.HANDLE_STOP, ClientIface.GET_ACTIVE, ClientIface.GET_DESKTOP_ID, ClientIface.GET_DISTANCE_THRESHOLD, ClientIface.GET_LOCATION, ClientIface.GET_REQUESTED_ACCURACY_LEVEL, ClientIface.GET_TIME_THRESHOLD, ClientIface.LOCATION_UPDATED})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnHandleStart handle_start;
        public OnHandleStop handle_stop;
        public OnGetActive get_active;
        public OnGetDesktopId get_desktop_id;
        public OnGetDistanceThreshold get_distance_threshold;
        public OnGetLocation get_location;
        public OnGetRequestedAccuracyLevel get_requested_accuracy_level;
        public OnGetTimeThreshold get_time_threshold;
        public OnLocationUpdated location_updated;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
