/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaItem {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("Item size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({Item.OFFSET, Item.LENGTH, Item.NUM_CHARS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int offset;
        public int length;
        public int num_chars;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_item_new();
        void pango_item_apply_attrs(long _self, long iter);
        long pango_item_copy(long _self);
        void pango_item_free(long _self);
        long pango_item_split(long _self, int split_index, int split_offset);
        long pango_item_get_type();
    }

}
