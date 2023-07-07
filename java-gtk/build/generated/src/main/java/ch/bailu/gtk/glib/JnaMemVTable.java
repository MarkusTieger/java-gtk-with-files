/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaMemVTable {

    @FunctionalInterface
    public interface OnMalloc extends com.sun.jna.Callback {
        long invoke(long n_bytes);
    }

    @FunctionalInterface
    public interface OnRealloc extends com.sun.jna.Callback {
        long invoke(long mem, long n_bytes);
    }

    @FunctionalInterface
    public interface OnFree extends com.sun.jna.Callback {
        void invoke(long mem);
    }

    @FunctionalInterface
    public interface OnCalloc extends com.sun.jna.Callback {
        long invoke(long n_blocks, long n_block_bytes);
    }

    @FunctionalInterface
    public interface OnTryMalloc extends com.sun.jna.Callback {
        long invoke(long n_bytes);
    }

    @FunctionalInterface
    public interface OnTryRealloc extends com.sun.jna.Callback {
        long invoke(long mem, long n_bytes);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("MemVTable size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({MemVTable.MALLOC, MemVTable.REALLOC, MemVTable.FREE, MemVTable.CALLOC, MemVTable.TRY_MALLOC, MemVTable.TRY_REALLOC})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public OnMalloc malloc;
        public OnRealloc realloc;
        public OnFree free;
        public OnCalloc calloc;
        public OnTryMalloc try_malloc;
        public OnTryRealloc try_realloc;
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
