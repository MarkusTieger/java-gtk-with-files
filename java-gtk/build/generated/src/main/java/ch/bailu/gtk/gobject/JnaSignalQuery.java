/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaSignalQuery {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SignalQuery size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SignalQuery.SIGNAL_ID, SignalQuery.SIGNAL_NAME, SignalQuery.ITYPE, SignalQuery.SIGNAL_FLAGS, SignalQuery.RETURN_TYPE, SignalQuery.N_PARAMS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int signal_id;
        public long signal_name;
        public long itype;
        public int signal_flags;
        public long return_type;
        public int n_params;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
