/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontFaceClass {

    @FunctionalInterface
    public interface OnGetFaceName extends com.sun.jna.Callback {
        long invoke(long face);
    }

    @FunctionalInterface
    public interface OnDescribe extends com.sun.jna.Callback {
        long invoke(long face);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FontFaceClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FontFaceClass.PARENT_CLASS, FontFaceClass.GET_FACE_NAME, FontFaceClass.DESCRIBE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnGetFaceName get_face_name;
        public OnDescribe describe;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
