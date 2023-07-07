/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaLocationIface {

    @FunctionalInterface
    public interface OnGetAccuracy extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetAltitude extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetDescription extends com.sun.jna.Callback {
        long invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetHeading extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetLatitude extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetLongitude extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetSpeed extends com.sun.jna.Callback {
        double invoke(long object);
    }

    @FunctionalInterface
    public interface OnGetTimestamp extends com.sun.jna.Callback {
        long invoke(long object);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("LocationIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({LocationIface.PARENT_IFACE, LocationIface.GET_ACCURACY, LocationIface.GET_ALTITUDE, LocationIface.GET_DESCRIPTION, LocationIface.GET_HEADING, LocationIface.GET_LATITUDE, LocationIface.GET_LONGITUDE, LocationIface.GET_SPEED, LocationIface.GET_TIMESTAMP})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnGetAccuracy get_accuracy;
        public OnGetAltitude get_altitude;
        public OnGetDescription get_description;
        public OnGetHeading get_heading;
        public OnGetLatitude get_latitude;
        public OnGetLongitude get_longitude;
        public OnGetSpeed get_speed;
        public OnGetTimestamp get_timestamp;
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
