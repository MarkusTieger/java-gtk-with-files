/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.ResolverClass.html">https://docs.gtk.org/gio/struct.ResolverClass.html</a></p>
*/
public class ResolverClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ResolverClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnReload {
        /**
         * 
         * @param resolver 
        */
        void onReload(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver);
    }
    
    private static JnaResolverClass.OnReload toOnReload(ch.bailu.gtk.type.Pointer instance, String methodName, OnReload in) {
        JnaResolverClass.OnReload out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver) -> in.onReload(__callback, new Resolver(new PointerContainer(_resolver)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByName {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param hostname the hostname to look up
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
        */
        ch.bailu.gtk.glib.List onLookupByName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull ch.bailu.gtk.type.Str hostname, @Nullable Cancellable cancellable);
    }
    
    private static JnaResolverClass.OnLookupByName toOnLookupByName(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByName in) {
        JnaResolverClass.OnLookupByName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _hostname, _cancellable, _error) -> in.onLookupByName(__callback, new Resolver(new PointerContainer(_resolver)), new ch.bailu.gtk.type.Str(new PointerContainer(_hostname)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByNameFinish {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param result the result passed to your &#35;GAsyncReadyCallback
         * @return a &#35;GList of &#35;GInetAddress, or %NULL on error. See g_resolver_lookup_by_name() for more details.
        */
        ch.bailu.gtk.glib.List onLookupByNameFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull AsyncResult result);
    }
    
    private static JnaResolverClass.OnLookupByNameFinish toOnLookupByNameFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByNameFinish in) {
        JnaResolverClass.OnLookupByNameFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _result, _error) -> in.onLookupByNameFinish(__callback, new Resolver(new PointerContainer(_resolver)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByAddress {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param address the address to reverse-resolve
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a hostname (either ASCII-only, or in ASCII-encoded     form), or %NULL on error.
        */
        ch.bailu.gtk.type.Str onLookupByAddress(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull InetAddress address, @Nullable Cancellable cancellable);
    }
    
    private static JnaResolverClass.OnLookupByAddress toOnLookupByAddress(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByAddress in) {
        JnaResolverClass.OnLookupByAddress out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _address, _cancellable, _error) -> in.onLookupByAddress(__callback, new Resolver(new PointerContainer(_resolver)), new InetAddress(new PointerContainer(_address)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByAddressFinish {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param result the result passed to your &#35;GAsyncReadyCallback
         * @return a hostname (either ASCII-only, or in ASCII-encoded form), or %NULL on error.
        */
        ch.bailu.gtk.type.Str onLookupByAddressFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull AsyncResult result);
    }
    
    private static JnaResolverClass.OnLookupByAddressFinish toOnLookupByAddressFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByAddressFinish in) {
        JnaResolverClass.OnLookupByAddressFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _result, _error) -> in.onLookupByAddressFinish(__callback, new Resolver(new PointerContainer(_resolver)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupService {
        /**
         * 
         * @param resolver 
         * @param rrname 
         * @param cancellable 
         * @return 
        */
        ch.bailu.gtk.glib.List onLookupService(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull ch.bailu.gtk.type.Str rrname, @Nullable Cancellable cancellable);
    }
    
    private static JnaResolverClass.OnLookupService toOnLookupService(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupService in) {
        JnaResolverClass.OnLookupService out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _rrname, _cancellable, _error) -> in.onLookupService(__callback, new Resolver(new PointerContainer(_resolver)), new ch.bailu.gtk.type.Str(new PointerContainer(_rrname)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupServiceFinish {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param result the result passed to your &#35;GAsyncReadyCallback
         * @return a non-empty &#35;GList of &#35;GSrvTarget, or %NULL on error. See g_resolver_lookup_service() for more details.
        */
        ch.bailu.gtk.glib.List onLookupServiceFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull AsyncResult result);
    }
    
    private static JnaResolverClass.OnLookupServiceFinish toOnLookupServiceFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupServiceFinish in) {
        JnaResolverClass.OnLookupServiceFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _result, _error) -> in.onLookupServiceFinish(__callback, new Resolver(new PointerContainer(_resolver)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupRecords {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param rrname the DNS name to look up the record for
         * @param record_type the type of DNS record to look up
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a non-empty &#35;GList of &#35;GVariant, or %NULL on error. You must free each of the records and the list when you are done with it. (You can use g_list_free_full() with g_variant_unref() to do this.)
        */
        ch.bailu.gtk.glib.List onLookupRecords(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull ch.bailu.gtk.type.Str rrname, int record_type, @Nullable Cancellable cancellable);
    }
    
    private static JnaResolverClass.OnLookupRecords toOnLookupRecords(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupRecords in) {
        JnaResolverClass.OnLookupRecords out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _rrname, _record_type, _cancellable, _error) -> in.onLookupRecords(__callback, new Resolver(new PointerContainer(_resolver)), new ch.bailu.gtk.type.Str(new PointerContainer(_rrname)), _record_type, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupRecordsFinish {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param result the result passed to your &#35;GAsyncReadyCallback
         * @return a non-empty &#35;GList of &#35;GVariant, or %NULL on error. You must free each of the records and the list when you are done with it. (You can use g_list_free_full() with g_variant_unref() to do this.)
        */
        ch.bailu.gtk.glib.List onLookupRecordsFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull AsyncResult result);
    }
    
    private static JnaResolverClass.OnLookupRecordsFinish toOnLookupRecordsFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupRecordsFinish in) {
        JnaResolverClass.OnLookupRecordsFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _result, _error) -> in.onLookupRecordsFinish(__callback, new Resolver(new PointerContainer(_resolver)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByNameWithFlagsFinish {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param result the result passed to your &#35;GAsyncReadyCallback
         * @return a &#35;GList of &#35;GInetAddress, or %NULL on error. See g_resolver_lookup_by_name() for more details.
        */
        ch.bailu.gtk.glib.List onLookupByNameWithFlagsFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull AsyncResult result);
    }
    
    private static JnaResolverClass.OnLookupByNameWithFlagsFinish toOnLookupByNameWithFlagsFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByNameWithFlagsFinish in) {
        JnaResolverClass.OnLookupByNameWithFlagsFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _result, _error) -> in.onLookupByNameWithFlagsFinish(__callback, new Resolver(new PointerContainer(_resolver)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLookupByNameWithFlags {
        /**
         * 
         * @param resolver a &#35;GResolver
         * @param hostname the hostname to look up
         * @param flags extra &#35;GResolverNameLookupFlags for the lookup
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
        */
        ch.bailu.gtk.glib.List onLookupByNameWithFlags(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Resolver resolver, @Nonnull ch.bailu.gtk.type.Str hostname, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaResolverClass.OnLookupByNameWithFlags toOnLookupByNameWithFlags(ch.bailu.gtk.type.Pointer instance, String methodName, OnLookupByNameWithFlags in) {
        JnaResolverClass.OnLookupByNameWithFlags out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_resolver, _hostname, _flags, _cancellable, _error) -> in.onLookupByNameWithFlags(__callback, new Resolver(new PointerContainer(_resolver)), new ch.bailu.gtk.type.Str(new PointerContainer(_hostname)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public ResolverClass(PointerContainer pointer) {
        super(pointer);
    }

    public ResolverClass() {
        super(cast(JnaResolverClass.allocateStructure()));
    }

    private JnaResolverClass.Fields _fields;
    
    JnaResolverClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaResolverClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnReload#onReload}
    */
    public static final String RELOAD = "reload";

    /**
     * 
     * <br>See {@link OnReload#onReload}
    */
    public void setFieldReload(OnReload reload) {
        toFields().reload = toOnReload(this, RELOAD, reload);
        toFields().writeField(RELOAD);
    }

    /**
     * 
     * <br>See {@link OnReload#onReload}
    */
    public JnaResolverClass.OnReload getFieldReload() {
       toFields().readField(RELOAD);
       return toFields().reload;
    } 

    /**
     * 
     * <br>See {@link OnLookupByName#onLookupByName}
    */
    public static final String LOOKUP_BY_NAME = "lookup_by_name";

    /**
     * 
     * <br>See {@link OnLookupByName#onLookupByName}
    */
    public void setFieldLookupByName(OnLookupByName lookup_by_name) {
        toFields().lookup_by_name = toOnLookupByName(this, LOOKUP_BY_NAME, lookup_by_name);
        toFields().writeField(LOOKUP_BY_NAME);
    }

    /**
     * 
     * <br>See {@link OnLookupByName#onLookupByName}
    */
    public JnaResolverClass.OnLookupByName getFieldLookupByName() {
       toFields().readField(LOOKUP_BY_NAME);
       return toFields().lookup_by_name;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_BY_NAME_ASYNC = "lookup_by_name_async";

    /**
     * 
     * <br>See {@link OnLookupByNameFinish#onLookupByNameFinish}
    */
    public static final String LOOKUP_BY_NAME_FINISH = "lookup_by_name_finish";

    /**
     * 
     * <br>See {@link OnLookupByNameFinish#onLookupByNameFinish}
    */
    public void setFieldLookupByNameFinish(OnLookupByNameFinish lookup_by_name_finish) {
        toFields().lookup_by_name_finish = toOnLookupByNameFinish(this, LOOKUP_BY_NAME_FINISH, lookup_by_name_finish);
        toFields().writeField(LOOKUP_BY_NAME_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupByNameFinish#onLookupByNameFinish}
    */
    public JnaResolverClass.OnLookupByNameFinish getFieldLookupByNameFinish() {
       toFields().readField(LOOKUP_BY_NAME_FINISH);
       return toFields().lookup_by_name_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupByAddress#onLookupByAddress}
    */
    public static final String LOOKUP_BY_ADDRESS = "lookup_by_address";

    /**
     * 
     * <br>See {@link OnLookupByAddress#onLookupByAddress}
    */
    public void setFieldLookupByAddress(OnLookupByAddress lookup_by_address) {
        toFields().lookup_by_address = toOnLookupByAddress(this, LOOKUP_BY_ADDRESS, lookup_by_address);
        toFields().writeField(LOOKUP_BY_ADDRESS);
    }

    /**
     * 
     * <br>See {@link OnLookupByAddress#onLookupByAddress}
    */
    public JnaResolverClass.OnLookupByAddress getFieldLookupByAddress() {
       toFields().readField(LOOKUP_BY_ADDRESS);
       return toFields().lookup_by_address;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_BY_ADDRESS_ASYNC = "lookup_by_address_async";

    /**
     * 
     * <br>See {@link OnLookupByAddressFinish#onLookupByAddressFinish}
    */
    public static final String LOOKUP_BY_ADDRESS_FINISH = "lookup_by_address_finish";

    /**
     * 
     * <br>See {@link OnLookupByAddressFinish#onLookupByAddressFinish}
    */
    public void setFieldLookupByAddressFinish(OnLookupByAddressFinish lookup_by_address_finish) {
        toFields().lookup_by_address_finish = toOnLookupByAddressFinish(this, LOOKUP_BY_ADDRESS_FINISH, lookup_by_address_finish);
        toFields().writeField(LOOKUP_BY_ADDRESS_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupByAddressFinish#onLookupByAddressFinish}
    */
    public JnaResolverClass.OnLookupByAddressFinish getFieldLookupByAddressFinish() {
       toFields().readField(LOOKUP_BY_ADDRESS_FINISH);
       return toFields().lookup_by_address_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupService#onLookupService}
    */
    public static final String LOOKUP_SERVICE = "lookup_service";

    /**
     * 
     * <br>See {@link OnLookupService#onLookupService}
    */
    public void setFieldLookupService(OnLookupService lookup_service) {
        toFields().lookup_service = toOnLookupService(this, LOOKUP_SERVICE, lookup_service);
        toFields().writeField(LOOKUP_SERVICE);
    }

    /**
     * 
     * <br>See {@link OnLookupService#onLookupService}
    */
    public JnaResolverClass.OnLookupService getFieldLookupService() {
       toFields().readField(LOOKUP_SERVICE);
       return toFields().lookup_service;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_SERVICE_ASYNC = "lookup_service_async";

    /**
     * 
     * <br>See {@link OnLookupServiceFinish#onLookupServiceFinish}
    */
    public static final String LOOKUP_SERVICE_FINISH = "lookup_service_finish";

    /**
     * 
     * <br>See {@link OnLookupServiceFinish#onLookupServiceFinish}
    */
    public void setFieldLookupServiceFinish(OnLookupServiceFinish lookup_service_finish) {
        toFields().lookup_service_finish = toOnLookupServiceFinish(this, LOOKUP_SERVICE_FINISH, lookup_service_finish);
        toFields().writeField(LOOKUP_SERVICE_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupServiceFinish#onLookupServiceFinish}
    */
    public JnaResolverClass.OnLookupServiceFinish getFieldLookupServiceFinish() {
       toFields().readField(LOOKUP_SERVICE_FINISH);
       return toFields().lookup_service_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupRecords#onLookupRecords}
    */
    public static final String LOOKUP_RECORDS = "lookup_records";

    /**
     * 
     * <br>See {@link OnLookupRecords#onLookupRecords}
    */
    public void setFieldLookupRecords(OnLookupRecords lookup_records) {
        toFields().lookup_records = toOnLookupRecords(this, LOOKUP_RECORDS, lookup_records);
        toFields().writeField(LOOKUP_RECORDS);
    }

    /**
     * 
     * <br>See {@link OnLookupRecords#onLookupRecords}
    */
    public JnaResolverClass.OnLookupRecords getFieldLookupRecords() {
       toFields().readField(LOOKUP_RECORDS);
       return toFields().lookup_records;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_RECORDS_ASYNC = "lookup_records_async";

    /**
     * 
     * <br>See {@link OnLookupRecordsFinish#onLookupRecordsFinish}
    */
    public static final String LOOKUP_RECORDS_FINISH = "lookup_records_finish";

    /**
     * 
     * <br>See {@link OnLookupRecordsFinish#onLookupRecordsFinish}
    */
    public void setFieldLookupRecordsFinish(OnLookupRecordsFinish lookup_records_finish) {
        toFields().lookup_records_finish = toOnLookupRecordsFinish(this, LOOKUP_RECORDS_FINISH, lookup_records_finish);
        toFields().writeField(LOOKUP_RECORDS_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupRecordsFinish#onLookupRecordsFinish}
    */
    public JnaResolverClass.OnLookupRecordsFinish getFieldLookupRecordsFinish() {
       toFields().readField(LOOKUP_RECORDS_FINISH);
       return toFields().lookup_records_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LOOKUP_BY_NAME_WITH_FLAGS_ASYNC = "lookup_by_name_with_flags_async";

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlagsFinish#onLookupByNameWithFlagsFinish}
    */
    public static final String LOOKUP_BY_NAME_WITH_FLAGS_FINISH = "lookup_by_name_with_flags_finish";

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlagsFinish#onLookupByNameWithFlagsFinish}
    */
    public void setFieldLookupByNameWithFlagsFinish(OnLookupByNameWithFlagsFinish lookup_by_name_with_flags_finish) {
        toFields().lookup_by_name_with_flags_finish = toOnLookupByNameWithFlagsFinish(this, LOOKUP_BY_NAME_WITH_FLAGS_FINISH, lookup_by_name_with_flags_finish);
        toFields().writeField(LOOKUP_BY_NAME_WITH_FLAGS_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlagsFinish#onLookupByNameWithFlagsFinish}
    */
    public JnaResolverClass.OnLookupByNameWithFlagsFinish getFieldLookupByNameWithFlagsFinish() {
       toFields().readField(LOOKUP_BY_NAME_WITH_FLAGS_FINISH);
       return toFields().lookup_by_name_with_flags_finish;
    } 

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlags#onLookupByNameWithFlags}
    */
    public static final String LOOKUP_BY_NAME_WITH_FLAGS = "lookup_by_name_with_flags";

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlags#onLookupByNameWithFlags}
    */
    public void setFieldLookupByNameWithFlags(OnLookupByNameWithFlags lookup_by_name_with_flags) {
        toFields().lookup_by_name_with_flags = toOnLookupByNameWithFlags(this, LOOKUP_BY_NAME_WITH_FLAGS, lookup_by_name_with_flags);
        toFields().writeField(LOOKUP_BY_NAME_WITH_FLAGS);
    }

    /**
     * 
     * <br>See {@link OnLookupByNameWithFlags#onLookupByNameWithFlags}
    */
    public JnaResolverClass.OnLookupByNameWithFlags getFieldLookupByNameWithFlags() {
       toFields().readField(LOOKUP_BY_NAME_WITH_FLAGS);
       return toFields().lookup_by_name_with_flags;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Resolver.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Resolver.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
