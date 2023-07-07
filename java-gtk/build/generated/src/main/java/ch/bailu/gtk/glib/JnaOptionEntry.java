/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaOptionEntry {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("OptionEntry size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({OptionEntry.LONG_NAME, OptionEntry.SHORT_NAME, OptionEntry.FLAGS, OptionEntry.ARG, OptionEntry.ARG_DATA, OptionEntry.DESCRIPTION, OptionEntry.ARG_DESCRIPTION})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long long_name;
        public byte short_name;
        public int flags;
        public int arg;
        public long arg_data;
        public long description;
        public long arg_description;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
