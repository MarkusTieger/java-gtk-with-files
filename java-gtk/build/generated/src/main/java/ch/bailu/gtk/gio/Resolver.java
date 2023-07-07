/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GResolver provides cancellable synchronous and asynchronous DNS
 * <br>resolution, for hostnames (g_resolver_lookup_by_address(),
 * <br>g_resolver_lookup_by_name() and their async variants) and SRV
 * <br>(service) records (g_resolver_lookup_service()).
 * <br>
 * <br>&#35;GNetworkAddress and &#35;GNetworkService provide wrappers around
 * <br>&#35;GResolver functionality that also implement &#35;GSocketConnectable,
 * <br>making it easy to connect to a remote host/service.
 * <p><a href="https://docs.gtk.org/gio/class.Resolver.html">https://docs.gtk.org/gio/class.Resolver.html</a></p>
*/
public class Resolver extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Resolver.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaResolver.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaResolver.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReload {
        /**
         * Emitted when the resolver notices that the system resolver
         * <br>configuration has changed.
        */
        void onReload();
    }
    
    private static com.sun.jna.Callback toOnReload(OnReload in) {
        return (in == null) ? null: (JnaResolver.OnReload) (__self, __data) -> in.onReload();
    }

    public Resolver(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Synchronously reverse-resolves &#64;address to determine its
     * <br>associated hostname.
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * @param address the address to reverse-resolve
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a hostname (either ASCII-only, or in ASCII-encoded     form), or %NULL on error.
    */
    public ch.bailu.gtk.type.Str lookupByAddress(@Nonnull InetAddress address, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_address(asCPointer(), asCPointerNotNull(address), asCPointer(cancellable), 0L)));
    }

    /**
     * Begins asynchronously reverse-resolving &#64;address to determine its
     * <br>associated hostname, and eventually calls &#64;callback, which must
     * <br>call g_resolver_lookup_by_address_finish() to get the final result.
     * @param address the address to reverse-resolve
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupByAddressAsync(@Nonnull InetAddress address, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_by_address_async(asCPointer(), asCPointerNotNull(address), asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupByAddressAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a previous call to
     * <br>g_resolver_lookup_by_address_async().
     * <br>
     * <br>If the DNS resolution failed, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError. If the operation was cancelled,
     * <br>&#64;error will be set to %G_IO_ERROR_CANCELLED.
     * @param result the result passed to your &#35;GAsyncReadyCallback
     * @return a hostname (either ASCII-only, or in ASCII-encoded form), or %NULL on error.
    */
    public ch.bailu.gtk.type.Str lookupByAddressFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_address_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Synchronously resolves &#64;hostname to determine its associated IP
     * <br>address(es). &#64;hostname may be an ASCII-only or UTF-8 hostname, or
     * <br>the textual form of an IP address (in which case this just becomes
     * <br>a wrapper around g_inet_address_new_from_string()).
     * <br>
     * <br>On success, g_resolver_lookup_by_name() will return a non-empty &#35;GList of
     * <br>&#35;GInetAddress, sorted in order of preference and guaranteed to not
     * <br>contain duplicates. That is, if using the result to connect to
     * <br>&#64;hostname, you should attempt to connect to the first address
     * <br>first, then the second if the first fails, etc. If you are using
     * <br>the result to listen on a socket, it is appropriate to add each
     * <br>result using e.g. g_socket_listener_add_address().
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to a
     * <br>value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * <br>
     * <br>If you are planning to connect to a socket on the resolved IP
     * <br>address, it may be easier to create a &#35;GNetworkAddress and use its
     * <br>&#35;GSocketConnectable interface.
     * @param hostname the hostname to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupByName(@Nonnull ch.bailu.gtk.type.Str hostname, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name(asCPointer(), asCPointerNotNull(hostname), asCPointer(cancellable), 0L)));
    }

    /**
     * Synchronously resolves &#64;hostname to determine its associated IP
     * <br>address(es). &#64;hostname may be an ASCII-only or UTF-8 hostname, or
     * <br>the textual form of an IP address (in which case this just becomes
     * <br>a wrapper around g_inet_address_new_from_string()).
     * <br>
     * <br>On success, g_resolver_lookup_by_name() will return a non-empty &#35;GList of
     * <br>&#35;GInetAddress, sorted in order of preference and guaranteed to not
     * <br>contain duplicates. That is, if using the result to connect to
     * <br>&#64;hostname, you should attempt to connect to the first address
     * <br>first, then the second if the first fails, etc. If you are using
     * <br>the result to listen on a socket, it is appropriate to add each
     * <br>result using e.g. g_socket_listener_add_address().
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to a
     * <br>value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * <br>
     * <br>If you are planning to connect to a socket on the resolved IP
     * <br>address, it may be easier to create a &#35;GNetworkAddress and use its
     * <br>&#35;GSocketConnectable interface.
     * @param hostname the hostname to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupByName(String hostname, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name(asCPointer(), hostname, asCPointer(cancellable), 0L)));
    }

    /**
     * Begins asynchronously resolving &#64;hostname to determine its
     * <br>associated IP address(es), and eventually calls &#64;callback, which
     * <br>must call g_resolver_lookup_by_name_finish() to get the result.
     * <br>See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupByNameAsync(@Nonnull ch.bailu.gtk.type.Str hostname, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_by_name_async(asCPointer(), asCPointerNotNull(hostname), asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupByNameAsync", callback), asCPointer(user_data));
    }

    /**
     * Begins asynchronously resolving &#64;hostname to determine its
     * <br>associated IP address(es), and eventually calls &#64;callback, which
     * <br>must call g_resolver_lookup_by_name_finish() to get the result.
     * <br>See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupByNameAsync(String hostname, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_by_name_async(asCPointer(), hostname, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupByNameAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a call to
     * <br>g_resolver_lookup_by_name_async().
     * <br>
     * <br>If the DNS resolution failed, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError. If the operation was cancelled,
     * <br>&#64;error will be set to %G_IO_ERROR_CANCELLED.
     * @param result the result passed to your &#35;GAsyncReadyCallback
     * @return a &#35;GList of &#35;GInetAddress, or %NULL on error. See g_resolver_lookup_by_name() for more details.
    */
    public ch.bailu.gtk.glib.List lookupByNameFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * <br>the lookup behavior with &#64;flags. For example this can be used to limit
     * <br>results with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
     * @param hostname the hostname to look up
     * @param flags extra &#35;GResolverNameLookupFlags for the lookup
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupByNameWithFlags(@Nonnull ch.bailu.gtk.type.Str hostname, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name_with_flags(asCPointer(), asCPointerNotNull(hostname), flags, asCPointer(cancellable), 0L)));
    }

    /**
     * This differs from g_resolver_lookup_by_name() in that you can modify
     * <br>the lookup behavior with &#64;flags. For example this can be used to limit
     * <br>results with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
     * @param hostname the hostname to look up
     * @param flags extra &#35;GResolverNameLookupFlags for the lookup
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GInetAddress, or %NULL on error. You must unref each of the addresses and free the list when you are done with it. (You can use g_resolver_free_addresses() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupByNameWithFlags(String hostname, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name_with_flags(asCPointer(), hostname, flags, asCPointer(cancellable), 0L)));
    }

    /**
     * Begins asynchronously resolving &#64;hostname to determine its
     * <br>associated IP address(es), and eventually calls &#64;callback, which
     * <br>must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * <br>See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param flags extra &#35;GResolverNameLookupFlags for the lookup
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupByNameWithFlagsAsync(@Nonnull ch.bailu.gtk.type.Str hostname, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_by_name_with_flags_async(asCPointer(), asCPointerNotNull(hostname), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupByNameWithFlagsAsync", callback), asCPointer(user_data));
    }

    /**
     * Begins asynchronously resolving &#64;hostname to determine its
     * <br>associated IP address(es), and eventually calls &#64;callback, which
     * <br>must call g_resolver_lookup_by_name_with_flags_finish() to get the result.
     * <br>See g_resolver_lookup_by_name() for more details.
     * @param hostname the hostname to look up the address of
     * @param flags extra &#35;GResolverNameLookupFlags for the lookup
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupByNameWithFlagsAsync(String hostname, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_by_name_with_flags_async(asCPointer(), hostname, flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupByNameWithFlagsAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a call to
     * <br>g_resolver_lookup_by_name_with_flags_async().
     * <br>
     * <br>If the DNS resolution failed, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError. If the operation was cancelled,
     * <br>&#64;error will be set to %G_IO_ERROR_CANCELLED.
     * @param result the result passed to your &#35;GAsyncReadyCallback
     * @return a &#35;GList of &#35;GInetAddress, or %NULL on error. See g_resolver_lookup_by_name() for more details.
    */
    public ch.bailu.gtk.glib.List lookupByNameWithFlagsFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_by_name_with_flags_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Synchronously performs a DNS record lookup for the given &#64;rrname and returns
     * <br>a list of records as &#35;GVariant tuples. See &#35;GResolverRecordType for
     * <br>information on what the records contain for each &#64;record_type.
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * @param rrname the DNS name to look up the record for
     * @param record_type the type of DNS record to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GVariant, or %NULL on error. You must free each of the records and the list when you are done with it. (You can use g_list_free_full() with g_variant_unref() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupRecords(@Nonnull ch.bailu.gtk.type.Str rrname, int record_type, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_records(asCPointer(), asCPointerNotNull(rrname), record_type, asCPointer(cancellable), 0L)));
    }

    /**
     * Synchronously performs a DNS record lookup for the given &#64;rrname and returns
     * <br>a list of records as &#35;GVariant tuples. See &#35;GResolverRecordType for
     * <br>information on what the records contain for each &#64;record_type.
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * @param rrname the DNS name to look up the record for
     * @param record_type the type of DNS record to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GVariant, or %NULL on error. You must free each of the records and the list when you are done with it. (You can use g_list_free_full() with g_variant_unref() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupRecords(String rrname, int record_type, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_records(asCPointer(), rrname, record_type, asCPointer(cancellable), 0L)));
    }

    /**
     * Begins asynchronously performing a DNS lookup for the given
     * <br>&#64;rrname, and eventually calls &#64;callback, which must call
     * <br>g_resolver_lookup_records_finish() to get the final result. See
     * <br>g_resolver_lookup_records() for more details.
     * @param rrname the DNS name to look up the record for
     * @param record_type the type of DNS record to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupRecordsAsync(@Nonnull ch.bailu.gtk.type.Str rrname, int record_type, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_records_async(asCPointer(), asCPointerNotNull(rrname), record_type, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupRecordsAsync", callback), asCPointer(user_data));
    }

    /**
     * Begins asynchronously performing a DNS lookup for the given
     * <br>&#64;rrname, and eventually calls &#64;callback, which must call
     * <br>g_resolver_lookup_records_finish() to get the final result. See
     * <br>g_resolver_lookup_records() for more details.
     * @param rrname the DNS name to look up the record for
     * @param record_type the type of DNS record to look up
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupRecordsAsync(String rrname, int record_type, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_records_async(asCPointer(), rrname, record_type, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupRecordsAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a previous call to
     * <br>g_resolver_lookup_records_async(). Returns a non-empty list of records as
     * <br>&#35;GVariant tuples. See &#35;GResolverRecordType for information on what the
     * <br>records contain.
     * <br>
     * <br>If the DNS resolution failed, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError. If the operation was cancelled,
     * <br>&#64;error will be set to %G_IO_ERROR_CANCELLED.
     * @param result the result passed to your &#35;GAsyncReadyCallback
     * @return a non-empty &#35;GList of &#35;GVariant, or %NULL on error. You must free each of the records and the list when you are done with it. (You can use g_list_free_full() with g_variant_unref() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupRecordsFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_records_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Synchronously performs a DNS SRV lookup for the given &#64;service and
     * <br>&#64;protocol in the given &#64;domain and returns an array of &#35;GSrvTarget.
     * <br>&#64;domain may be an ASCII-only or UTF-8 hostname. Note also that the
     * <br>&#64;service and &#64;protocol arguments do not include the leading underscore
     * <br>that appears in the actual DNS entry.
     * <br>
     * <br>On success, g_resolver_lookup_service() will return a non-empty &#35;GList of
     * <br>&#35;GSrvTarget, sorted in order of preference. (That is, you should
     * <br>attempt to connect to the first target first, then the second if
     * <br>the first fails, etc.)
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * <br>
     * <br>If you are planning to connect to the service, it is usually easier
     * <br>to create a &#35;GNetworkService and use its &#35;GSocketConnectable
     * <br>interface.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GSrvTarget, or %NULL on error. You must free each of the targets and the list when you are done with it. (You can use g_resolver_free_targets() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupService(@Nonnull ch.bailu.gtk.type.Str service, @Nonnull ch.bailu.gtk.type.Str protocol, @Nonnull ch.bailu.gtk.type.Str domain, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_service(asCPointer(), asCPointerNotNull(service), asCPointerNotNull(protocol), asCPointerNotNull(domain), asCPointer(cancellable), 0L)));
    }

    /**
     * Synchronously performs a DNS SRV lookup for the given &#64;service and
     * <br>&#64;protocol in the given &#64;domain and returns an array of &#35;GSrvTarget.
     * <br>&#64;domain may be an ASCII-only or UTF-8 hostname. Note also that the
     * <br>&#64;service and &#64;protocol arguments do not include the leading underscore
     * <br>that appears in the actual DNS entry.
     * <br>
     * <br>On success, g_resolver_lookup_service() will return a non-empty &#35;GList of
     * <br>&#35;GSrvTarget, sorted in order of preference. (That is, you should
     * <br>attempt to connect to the first target first, then the second if
     * <br>the first fails, etc.)
     * <br>
     * <br>If the DNS resolution fails, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError and %NULL will be returned.
     * <br>
     * <br>If &#64;cancellable is non-%NULL, it can be used to cancel the
     * <br>operation, in which case &#64;error (if non-%NULL) will be set to
     * <br>%G_IO_ERROR_CANCELLED.
     * <br>
     * <br>If you are planning to connect to the service, it is usually easier
     * <br>to create a &#35;GNetworkService and use its &#35;GSocketConnectable
     * <br>interface.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a non-empty &#35;GList of &#35;GSrvTarget, or %NULL on error. You must free each of the targets and the list when you are done with it. (You can use g_resolver_free_targets() to do this.)
    */
    public ch.bailu.gtk.glib.List lookupService(String service, String protocol, String domain, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_service(asCPointer(), service, protocol, domain, asCPointer(cancellable), 0L)));
    }

    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * <br>&#64;service and &#64;protocol in the given &#64;domain, and eventually calls
     * <br>&#64;callback, which must call g_resolver_lookup_service_finish() to
     * <br>get the final result. See g_resolver_lookup_service() for more
     * <br>details.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupServiceAsync(@Nonnull ch.bailu.gtk.type.Str service, @Nonnull ch.bailu.gtk.type.Str protocol, @Nonnull ch.bailu.gtk.type.Str domain, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_service_async(asCPointer(), asCPointerNotNull(service), asCPointerNotNull(protocol), asCPointerNotNull(domain), asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupServiceAsync", callback), asCPointer(user_data));
    }

    /**
     * Begins asynchronously performing a DNS SRV lookup for the given
     * <br>&#64;service and &#64;protocol in the given &#64;domain, and eventually calls
     * <br>&#64;callback, which must call g_resolver_lookup_service_finish() to
     * <br>get the final result. See g_resolver_lookup_service() for more
     * <br>details.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupServiceAsync(String service, String protocol, String domain, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaResolver.INST().g_resolver_lookup_service_async(asCPointer(), service, protocol, domain, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupServiceAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a previous call to
     * <br>g_resolver_lookup_service_async().
     * <br>
     * <br>If the DNS resolution failed, &#64;error (if non-%NULL) will be set to
     * <br>a value from &#35;GResolverError. If the operation was cancelled,
     * <br>&#64;error will be set to %G_IO_ERROR_CANCELLED.
     * @param result the result passed to your &#35;GAsyncReadyCallback
     * @return a non-empty &#35;GList of &#35;GSrvTarget, or %NULL on error. See g_resolver_lookup_service() for more details.
    */
    public ch.bailu.gtk.glib.List lookupServiceFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaResolver.INST().g_resolver_lookup_service_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Sets &#64;resolver to be the application's default resolver (reffing
     * <br>&#64;resolver, and unreffing the previous default resolver, if any).
     * <br>Future calls to g_resolver_get_default() will return this resolver.
     * <br>
     * <br>This can be used if an application wants to perform any sort of DNS
     * <br>caching or &quot;pinning&quot;; it can implement its own &#35;GResolver that
     * <br>calls the original default resolver for DNS operations, and
     * <br>implements its own cache policies on top of that, and then set
     * <br>itself as the default resolver for all later code to use.
    */
    public void setDefault()  {
        JnaResolver.INST().g_resolver_set_default(asCPointer());
    }

    public final static String SIGNAL_ON_RELOAD = "reload";
    
    /**
     * Connect to signal "reload".
     * <br>See {@link OnReload#onReload} for signal description.
     * <br>Field {@link #SIGNAL_ON_RELOAD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onReload(OnReload signal) {
        return connectSignal(SIGNAL_ON_RELOAD, toOnReload(signal));
    }

    /**
     * Frees &#64;addresses (which should be the return value from
     * <br>g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()).
     * <br>(This is a convenience method; you can also simply free the results
     * <br>by hand.)
     * @param addresses a &#35;GList of &#35;GInetAddress
    */
    public static void freeAddresses(@Nonnull ch.bailu.gtk.glib.List addresses)  {
        JnaResolver.INST().g_resolver_free_addresses(asCPointerNotNull(addresses));
    }

    /**
     * Frees &#64;targets (which should be the return value from
     * <br>g_resolver_lookup_service() or g_resolver_lookup_service_finish()).
     * <br>(This is a convenience method; you can also simply free the
     * <br>results by hand.)
     * @param targets a &#35;GList of &#35;GSrvTarget
    */
    public static void freeTargets(@Nonnull ch.bailu.gtk.glib.List targets)  {
        JnaResolver.INST().g_resolver_free_targets(asCPointerNotNull(targets));
    }

    /**
     * Gets the default &#35;GResolver. You should unref it when you are done
     * <br>with it. &#35;GResolver may use its reference count as a hint about how
     * <br>many threads it should allocate for concurrent DNS resolutions.
     * @return the default &#35;GResolver.
    */
    public static Resolver getDefault()  {
        return new Resolver(new PointerContainer(JnaResolver.INST().g_resolver_get_default()));
    }

    public static long getTypeID() { 
        return JnaResolver.INST().g_resolver_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
