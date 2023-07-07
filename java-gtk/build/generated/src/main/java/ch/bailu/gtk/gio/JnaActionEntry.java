/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaActionEntry {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long action, long parameter, long user_data);
    }

    @FunctionalInterface
    public interface OnChangeState extends com.sun.jna.Callback {
        void invoke(long action, long value, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ActionEntry size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ActionEntry.NAME, ActionEntry.ACTIVATE, ActionEntry.PARAMETER_TYPE, ActionEntry.STATE, ActionEntry.CHANGE_STATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long name;
        public OnActivate activate;
        public long parameter_type;
        public long state;
        public OnChangeState change_state;
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
