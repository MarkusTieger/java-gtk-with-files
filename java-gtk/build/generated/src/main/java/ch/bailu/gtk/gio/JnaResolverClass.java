/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaResolverClass {

    @FunctionalInterface
    public interface OnReload extends com.sun.jna.Callback {
        void invoke(long resolver);
    }

    @FunctionalInterface
    public interface OnLookupByName extends com.sun.jna.Callback {
        long invoke(long resolver, long hostname, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupByNameAsync extends com.sun.jna.Callback {
        void invoke(long resolver, long hostname, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupByNameFinish extends com.sun.jna.Callback {
        long invoke(long resolver, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupByAddress extends com.sun.jna.Callback {
        long invoke(long resolver, long address, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupByAddressAsync extends com.sun.jna.Callback {
        void invoke(long resolver, long address, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupByAddressFinish extends com.sun.jna.Callback {
        long invoke(long resolver, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupService extends com.sun.jna.Callback {
        long invoke(long resolver, long rrname, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupServiceAsync extends com.sun.jna.Callback {
        void invoke(long resolver, long rrname, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupServiceFinish extends com.sun.jna.Callback {
        long invoke(long resolver, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupRecords extends com.sun.jna.Callback {
        long invoke(long resolver, long rrname, int record_type, long cancellable, long _error);
    }

    @FunctionalInterface
    public interface OnLookupRecordsAsync extends com.sun.jna.Callback {
        void invoke(long resolver, long rrname, int record_type, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupRecordsFinish extends com.sun.jna.Callback {
        long invoke(long resolver, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupByNameWithFlagsAsync extends com.sun.jna.Callback {
        void invoke(long resolver, long hostname, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnLookupByNameWithFlagsFinish extends com.sun.jna.Callback {
        long invoke(long resolver, long result, long _error);
    }

    @FunctionalInterface
    public interface OnLookupByNameWithFlags extends com.sun.jna.Callback {
        long invoke(long resolver, long hostname, int flags, long cancellable, long _error);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("ResolverClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({ResolverClass.PARENT_CLASS, ResolverClass.RELOAD, ResolverClass.LOOKUP_BY_NAME, ResolverClass.LOOKUP_BY_NAME_ASYNC, ResolverClass.LOOKUP_BY_NAME_FINISH, ResolverClass.LOOKUP_BY_ADDRESS, ResolverClass.LOOKUP_BY_ADDRESS_ASYNC, ResolverClass.LOOKUP_BY_ADDRESS_FINISH, ResolverClass.LOOKUP_SERVICE, ResolverClass.LOOKUP_SERVICE_ASYNC, ResolverClass.LOOKUP_SERVICE_FINISH, ResolverClass.LOOKUP_RECORDS, ResolverClass.LOOKUP_RECORDS_ASYNC, ResolverClass.LOOKUP_RECORDS_FINISH, ResolverClass.LOOKUP_BY_NAME_WITH_FLAGS_ASYNC, ResolverClass.LOOKUP_BY_NAME_WITH_FLAGS_FINISH, ResolverClass.LOOKUP_BY_NAME_WITH_FLAGS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnReload reload;
        public OnLookupByName lookup_by_name;
        public OnLookupByNameAsync lookup_by_name_async;
        public OnLookupByNameFinish lookup_by_name_finish;
        public OnLookupByAddress lookup_by_address;
        public OnLookupByAddressAsync lookup_by_address_async;
        public OnLookupByAddressFinish lookup_by_address_finish;
        public OnLookupService lookup_service;
        public OnLookupServiceAsync lookup_service_async;
        public OnLookupServiceFinish lookup_service_finish;
        public OnLookupRecords lookup_records;
        public OnLookupRecordsAsync lookup_records_async;
        public OnLookupRecordsFinish lookup_records_finish;
        public OnLookupByNameWithFlagsAsync lookup_by_name_with_flags_async;
        public OnLookupByNameWithFlagsFinish lookup_by_name_with_flags_finish;
        public OnLookupByNameWithFlags lookup_by_name_with_flags;
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
