/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRecentData {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("RecentData size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({RecentData.DISPLAY_NAME, RecentData.DESCRIPTION, RecentData.MIME_TYPE, RecentData.APP_NAME, RecentData.APP_EXEC, RecentData.GROUPS, RecentData.IS_PRIVATE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long display_name;
        public long description;
        public long mime_type;
        public long app_name;
        public long app_exec;
        public long groups;
        public boolean is_private;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
