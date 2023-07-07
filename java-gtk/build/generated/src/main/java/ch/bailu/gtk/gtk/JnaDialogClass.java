/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDialogClass {

    @FunctionalInterface
    public interface OnResponse extends com.sun.jna.Callback {
        void invoke(long dialog, int response_id);
    }

    @FunctionalInterface
    public interface OnClose extends com.sun.jna.Callback {
        void invoke(long dialog);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DialogClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DialogClass.PARENT_CLASS, DialogClass.RESPONSE, DialogClass.CLOSE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[WindowClass.getInstanceSize()];
        public OnResponse response;
        public OnClose close;
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
