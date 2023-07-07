/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GSourceFuncs` struct contains a table of
 * <br>functions used to handle event sources in a generic manner.
 * <br>
 * <br>For idle sources, the prepare and check functions always return %TRUE
 * <br>to indicate that the source is always ready to be processed. The prepare
 * <br>function also returns a timeout value of 0 to ensure that the poll() call
 * <br>doesn't block (since that would be time wasted which could have been spent
 * <br>running the idle function).
 * <br>
 * <br>For timeout sources, the prepare and check functions both return %TRUE
 * <br>if the timeout interval has expired. The prepare function also returns
 * <br>a timeout value to ensure that the poll() call doesn't block too long
 * <br>and miss the next timeout.
 * <br>
 * <br>For file descriptor sources, the prepare function typically returns %FALSE,
 * <br>since it must wait until poll() has been called before it knows whether
 * <br>any events need to be processed. It sets the returned timeout to -1 to
 * <br>indicate that it doesn't mind how long the poll() call blocks. In the
 * <br>check function, it tests the results of the poll() call to see if the
 * <br>required condition has been met, and returns %TRUE if so.
 * <p><a href="https://docs.gtk.org/glib/struct.SourceFuncs.html">https://docs.gtk.org/glib/struct.SourceFuncs.html</a></p>
*/
public class SourceFuncs extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SourceFuncs.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPrepare {
        /**
         * 
         * @param source 
         * @param timeout_ 
         * @return 
        */
        boolean onPrepare(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Source source, @Nonnull ch.bailu.gtk.type.Int timeout_);
    }
    
    private static JnaSourceFuncs.OnPrepare toOnPrepare(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrepare in) {
        JnaSourceFuncs.OnPrepare out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source, _timeout_) -> in.onPrepare(__callback, new Source(new PointerContainer(_source)), new ch.bailu.gtk.type.Int(new PointerContainer(_timeout_)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCheck {
        /**
         * 
         * @param source 
         * @return 
        */
        boolean onCheck(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Source source);
    }
    
    private static JnaSourceFuncs.OnCheck toOnCheck(ch.bailu.gtk.type.Pointer instance, String methodName, OnCheck in) {
        JnaSourceFuncs.OnCheck out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source) -> in.onCheck(__callback, new Source(new PointerContainer(_source)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFinalize {
        /**
         * 
         * @param source 
        */
        void onFinalize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Source source);
    }
    
    private static JnaSourceFuncs.OnFinalize toOnFinalize(ch.bailu.gtk.type.Pointer instance, String methodName, OnFinalize in) {
        JnaSourceFuncs.OnFinalize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source) -> in.onFinalize(__callback, new Source(new PointerContainer(_source)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceFunc {
        /**
         * Specifies the type of function passed to g_timeout_add(),
         * <br>g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
         * <br>
         * <br>When calling g_source_set_callback(), you may need to cast a function of a
         * <br>different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
         * <br>incompatible function types.
         * @param user_data data passed to the function, set when the source was     created with one of the above functions
         * @return %FALSE if the source should be removed. %G_SOURCE_CONTINUE and %G_SOURCE_REMOVE are more memorable names for the return value.
        */
        boolean onSourceFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSourceFuncs.OnSourceFunc toOnSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceFunc in) {
        JnaSourceFuncs.OnSourceFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onSourceFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceDummyMarshal {
        /**
         * This is just a placeholder for &#35;GClosureMarshal,
         * <br>which cannot be used here for dependency reasons.
        */
        void onSourceDummyMarshal(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaSourceFuncs.OnSourceDummyMarshal toOnSourceDummyMarshal(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceDummyMarshal in) {
        JnaSourceFuncs.OnSourceDummyMarshal out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onSourceDummyMarshal(__callback);
            __callback.register(out);
        }
        return out;
    }

    public SourceFuncs(PointerContainer pointer) {
        super(pointer);
    }

    public SourceFuncs() {
        super(cast(JnaSourceFuncs.allocateStructure()));
    }

    private JnaSourceFuncs.Fields _fields;
    
    JnaSourceFuncs.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSourceFuncs.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>See {@link OnPrepare#onPrepare}
    */
    public static final String PREPARE = "prepare";

    /**
     * 
     * <br>See {@link OnPrepare#onPrepare}
    */
    public void setFieldPrepare(OnPrepare prepare) {
        toFields().prepare = toOnPrepare(this, PREPARE, prepare);
        toFields().writeField(PREPARE);
    }

    /**
     * 
     * <br>See {@link OnPrepare#onPrepare}
    */
    public JnaSourceFuncs.OnPrepare getFieldPrepare() {
       toFields().readField(PREPARE);
       return toFields().prepare;
    } 

    /**
     * 
     * <br>See {@link OnCheck#onCheck}
    */
    public static final String CHECK = "check";

    /**
     * 
     * <br>See {@link OnCheck#onCheck}
    */
    public void setFieldCheck(OnCheck check) {
        toFields().check = toOnCheck(this, CHECK, check);
        toFields().writeField(CHECK);
    }

    /**
     * 
     * <br>See {@link OnCheck#onCheck}
    */
    public JnaSourceFuncs.OnCheck getFieldCheck() {
       toFields().readField(CHECK);
       return toFields().check;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String DISPATCH = "dispatch";

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public static final String FINALIZE = "finalize";

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public void setFieldFinalize(OnFinalize finalize) {
        toFields().finalize = toOnFinalize(this, FINALIZE, finalize);
        toFields().writeField(FINALIZE);
    }

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public JnaSourceFuncs.OnFinalize getFieldFinalize() {
       toFields().readField(FINALIZE);
       return toFields().finalize;
    } 

    /**
     * 
     * <br>See {@link OnSourceFunc#onSourceFunc}
    */
    public static final String CLOSURE_CALLBACK = "closure_callback";

    /**
     * 
     * <br>See {@link OnSourceFunc#onSourceFunc}
    */
    public void setFieldClosureCallback(OnSourceFunc closure_callback) {
        toFields().closure_callback = toOnSourceFunc(this, CLOSURE_CALLBACK, closure_callback);
        toFields().writeField(CLOSURE_CALLBACK);
    }

    /**
     * 
     * <br>See {@link OnSourceFunc#onSourceFunc}
    */
    public JnaSourceFuncs.OnSourceFunc getFieldClosureCallback() {
       toFields().readField(CLOSURE_CALLBACK);
       return toFields().closure_callback;
    } 

    /**
     * 
     * <br>See {@link OnSourceDummyMarshal#onSourceDummyMarshal}
    */
    public static final String CLOSURE_MARSHAL = "closure_marshal";

    /**
     * 
     * <br>See {@link OnSourceDummyMarshal#onSourceDummyMarshal}
    */
    public void setFieldClosureMarshal(OnSourceDummyMarshal closure_marshal) {
        toFields().closure_marshal = toOnSourceDummyMarshal(this, CLOSURE_MARSHAL, closure_marshal);
        toFields().writeField(CLOSURE_MARSHAL);
    }

    /**
     * 
     * <br>See {@link OnSourceDummyMarshal#onSourceDummyMarshal}
    */
    public JnaSourceFuncs.OnSourceDummyMarshal getFieldClosureMarshal() {
       toFields().readField(CLOSURE_MARSHAL);
       return toFields().closure_marshal;
    } 

}

/*
record-type
all-fields-supported
*/
