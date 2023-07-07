/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for initializing object such that initialization
 * <br>may fail.
 * <p><a href="https://docs.gtk.org/gio/struct.InitableIface.html">https://docs.gtk.org/gio/struct.InitableIface.html</a></p>
*/
public class InitableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InitableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInit {
        /**
         * 
         * @param initable a &#35;GInitable.
         * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
         * @return %TRUE if successful. If an error has occurred, this function will     return %FALSE and set &#64;error appropriately if present.
        */
        boolean onInit(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Initable initable, @Nullable Cancellable cancellable);
    }
    
    private static JnaInitableIface.OnInit toOnInit(ch.bailu.gtk.type.Pointer instance, String methodName, OnInit in) {
        JnaInitableIface.OnInit out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_initable, _cancellable, _error) -> in.onInit(__callback, new Initable(new PointerContainer(_initable)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    public InitableIface(PointerContainer pointer) {
        super(pointer);
    }

    public InitableIface() {
        super(cast(JnaInitableIface.allocateStructure()));
    }

    private JnaInitableIface.Fields _fields;
    
    JnaInitableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInitableIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnInit#onInit}
    */
    public static final String INIT = "init";

    /**
     * 
     * <br>See {@link OnInit#onInit}
    */
    public void setFieldInit(OnInit init) {
        toFields().init = toOnInit(this, INIT, init);
        toFields().writeField(INIT);
    }

    /**
     * 
     * <br>See {@link OnInit#onInit}
    */
    public JnaInitableIface.OnInit getFieldInit() {
       toFields().readField(INIT);
       return toFields().init;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Initable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Initable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
