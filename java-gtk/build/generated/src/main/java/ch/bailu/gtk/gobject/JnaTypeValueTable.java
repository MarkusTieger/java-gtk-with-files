/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeValueTable {

    @FunctionalInterface
    public interface OnValueInit extends com.sun.jna.Callback {
        void invoke(long value);
    }

    @FunctionalInterface
    public interface OnValueFree extends com.sun.jna.Callback {
        void invoke(long value);
    }

    @FunctionalInterface
    public interface OnValueCopy extends com.sun.jna.Callback {
        void invoke(long src_value, long dest_value);
    }

    @FunctionalInterface
    public interface OnValuePeekPointer extends com.sun.jna.Callback {
        long invoke(long value);
    }

    @FunctionalInterface
    public interface OnCollectValue extends com.sun.jna.Callback {
        long invoke(long value, int n_collect_values, long collect_values, int collect_flags);
    }

    @FunctionalInterface
    public interface OnLcopyValue extends com.sun.jna.Callback {
        long invoke(long value, int n_collect_values, long collect_values, int collect_flags);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("TypeValueTable size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({TypeValueTable.VALUE_INIT, TypeValueTable.VALUE_FREE, TypeValueTable.VALUE_COPY, TypeValueTable.VALUE_PEEK_POINTER, TypeValueTable.COLLECT_FORMAT, TypeValueTable.COLLECT_VALUE, TypeValueTable.LCOPY_FORMAT, TypeValueTable.LCOPY_VALUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnValueInit value_init;
        public OnValueFree value_free;
        public OnValueCopy value_copy;
        public OnValuePeekPointer value_peek_pointer;
        public long collect_format;
        public OnCollectValue collect_value;
        public long lcopy_format;
        public OnLcopyValue lcopy_value;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_type_value_table_peek(long type);
    }

}
