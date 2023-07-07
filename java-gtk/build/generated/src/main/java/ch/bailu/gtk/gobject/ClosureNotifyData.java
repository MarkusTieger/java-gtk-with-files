/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gobject/struct.ClosureNotifyData.html">https://docs.gtk.org/gobject/struct.ClosureNotifyData.html</a></p>
*/
public class ClosureNotifyData extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClosureNotifyData.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClosureNotify {
        /**
         * The type used for the various notification callbacks which can be registered
         * <br>on closures.
         * @param data data specified when registering the notification callback
         * @param closure the &#35;GClosure on which the notification is emitted
        */
        void onClosureNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Closure closure);
    }
    
    private static JnaClosureNotifyData.OnClosureNotify toOnClosureNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosureNotify in) {
        JnaClosureNotifyData.OnClosureNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _closure) -> in.onClosureNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Closure(new PointerContainer(_closure)));
            __callback.register(out);
        }
        return out;
    }

    public ClosureNotifyData(PointerContainer pointer) {
        super(pointer);
    }

    public ClosureNotifyData() {
        super(cast(JnaClosureNotifyData.allocateStructure()));
    }

    private JnaClosureNotifyData.Fields _fields;
    
    JnaClosureNotifyData.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaClosureNotifyData.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String DATA = "data";

    /**
     * 
    */
    public void setFieldData(ch.bailu.gtk.type.Pointer data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * 
     * <br>See {@link OnClosureNotify#onClosureNotify}
    */
    public static final String NOTIFY = "notify";

    /**
     * 
     * <br>See {@link OnClosureNotify#onClosureNotify}
    */
    public void setFieldNotify(OnClosureNotify notify) {
        toFields().notify = toOnClosureNotify(this, NOTIFY, notify);
        toFields().writeField(NOTIFY);
    }

    /**
     * 
     * <br>See {@link OnClosureNotify#onClosureNotify}
    */
    public JnaClosureNotifyData.OnClosureNotify getFieldNotify() {
       toFields().readField(NOTIFY);
       return toFields().notify;
    } 

}

/*
record-type
all-fields-supported
*/
