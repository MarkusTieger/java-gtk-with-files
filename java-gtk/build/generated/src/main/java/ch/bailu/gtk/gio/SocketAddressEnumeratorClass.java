/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GSocketAddressEnumerator.
 * <p><a href="https://docs.gtk.org/gio/struct.SocketAddressEnumeratorClass.html">https://docs.gtk.org/gio/struct.SocketAddressEnumeratorClass.html</a></p>
*/
public class SocketAddressEnumeratorClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketAddressEnumeratorClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnNext {
        /**
         * 
         * @param enumerator a &#35;GSocketAddressEnumerator
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return a &#35;GSocketAddress (owned by the caller), or %NULL on     error (in which case *&#64;error will be set) or if there are no     more addresses.
        */
        SocketAddress onNext(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketAddressEnumerator enumerator, @Nullable Cancellable cancellable);
    }
    
    private static JnaSocketAddressEnumeratorClass.OnNext toOnNext(ch.bailu.gtk.type.Pointer instance, String methodName, OnNext in) {
        JnaSocketAddressEnumeratorClass.OnNext out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _cancellable, _error) -> in.onNext(__callback, new SocketAddressEnumerator(new PointerContainer(_enumerator)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnNextFinish {
        /**
         * 
         * @param enumerator a &#35;GSocketAddressEnumerator
         * @param result a &#35;GAsyncResult
         * @return a &#35;GSocketAddress (owned by the caller), or %NULL on     error (in which case *&#64;error will be set) or if there are no     more addresses.
        */
        SocketAddress onNextFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SocketAddressEnumerator enumerator, @Nonnull AsyncResult result);
    }
    
    private static JnaSocketAddressEnumeratorClass.OnNextFinish toOnNextFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnNextFinish in) {
        JnaSocketAddressEnumeratorClass.OnNextFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_enumerator, _result, _error) -> in.onNextFinish(__callback, new SocketAddressEnumerator(new PointerContainer(_enumerator)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public SocketAddressEnumeratorClass(PointerContainer pointer) {
        super(pointer);
    }

    public SocketAddressEnumeratorClass() {
        super(cast(JnaSocketAddressEnumeratorClass.allocateStructure()));
    }

    private JnaSocketAddressEnumeratorClass.Fields _fields;
    
    JnaSocketAddressEnumeratorClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSocketAddressEnumeratorClass.Fields(asCPointer());
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
     * <br>See {@link OnNext#onNext}
    */
    public static final String NEXT = "next";

    /**
     * 
     * <br>See {@link OnNext#onNext}
    */
    public void setFieldNext(OnNext next) {
        toFields().next = toOnNext(this, NEXT, next);
        toFields().writeField(NEXT);
    }

    /**
     * 
     * <br>See {@link OnNext#onNext}
    */
    public JnaSocketAddressEnumeratorClass.OnNext getFieldNext() {
       toFields().readField(NEXT);
       return toFields().next;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String NEXT_ASYNC = "next_async";

    /**
     * 
     * <br>See {@link OnNextFinish#onNextFinish}
    */
    public static final String NEXT_FINISH = "next_finish";

    /**
     * 
     * <br>See {@link OnNextFinish#onNextFinish}
    */
    public void setFieldNextFinish(OnNextFinish next_finish) {
        toFields().next_finish = toOnNextFinish(this, NEXT_FINISH, next_finish);
        toFields().writeField(NEXT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnNextFinish#onNextFinish}
    */
    public JnaSocketAddressEnumeratorClass.OnNextFinish getFieldNextFinish() {
       toFields().readField(NEXT_FINISH);
       return toFields().next_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketAddressEnumerator.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SocketAddressEnumerator.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
