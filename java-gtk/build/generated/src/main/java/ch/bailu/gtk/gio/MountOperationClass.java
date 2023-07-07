/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.MountOperationClass.html">https://docs.gtk.org/gio/struct.MountOperationClass.html</a></p>
*/
public class MountOperationClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MountOperationClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAskPassword {
        /**
         * 
         * @param op 
         * @param message 
         * @param default_user 
         * @param default_domain 
         * @param flags 
        */
        void onAskPassword(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MountOperation op, @Nonnull ch.bailu.gtk.type.Str message, @Nonnull ch.bailu.gtk.type.Str default_user, @Nonnull ch.bailu.gtk.type.Str default_domain, int flags);
    }
    
    private static JnaMountOperationClass.OnAskPassword toOnAskPassword(ch.bailu.gtk.type.Pointer instance, String methodName, OnAskPassword in) {
        JnaMountOperationClass.OnAskPassword out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_op, _message, _default_user, _default_domain, _flags) -> in.onAskPassword(__callback, new MountOperation(new PointerContainer(_op)), new ch.bailu.gtk.type.Str(new PointerContainer(_message)), new ch.bailu.gtk.type.Str(new PointerContainer(_default_user)), new ch.bailu.gtk.type.Str(new PointerContainer(_default_domain)), _flags);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAskQuestion {
        /**
         * 
         * @param op a &#35;GMountOperation
         * @param message string containing a message to display to the user
         * @param choices an array of    strings for each possible choice
        */
        void onAskQuestion(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MountOperation op, @Nonnull ch.bailu.gtk.type.Str message, @Nonnull ch.bailu.gtk.type.Strs choices);
    }
    
    private static JnaMountOperationClass.OnAskQuestion toOnAskQuestion(ch.bailu.gtk.type.Pointer instance, String methodName, OnAskQuestion in) {
        JnaMountOperationClass.OnAskQuestion out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_op, _message, _choices) -> in.onAskQuestion(__callback, new MountOperation(new PointerContainer(_op)), new ch.bailu.gtk.type.Str(new PointerContainer(_message)), new ch.bailu.gtk.type.Strs(new PointerContainer(_choices)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReply {
        /**
         * 
         * @param op a &#35;GMountOperation
         * @param result a &#35;GMountOperationResult
        */
        void onReply(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MountOperation op, int result);
    }
    
    private static JnaMountOperationClass.OnReply toOnReply(ch.bailu.gtk.type.Pointer instance, String methodName, OnReply in) {
        JnaMountOperationClass.OnReply out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_op, _result) -> in.onReply(__callback, new MountOperation(new PointerContainer(_op)), _result);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAborted {
        /**
         * 
         * @param op 
        */
        void onAborted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MountOperation op);
    }
    
    private static JnaMountOperationClass.OnAborted toOnAborted(ch.bailu.gtk.type.Pointer instance, String methodName, OnAborted in) {
        JnaMountOperationClass.OnAborted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_op) -> in.onAborted(__callback, new MountOperation(new PointerContainer(_op)));
            __callback.register(out);
        }
        return out;
    }

    public MountOperationClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMountOperationClass.Fields _fields;
    
    JnaMountOperationClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMountOperationClass.Fields(asCPointer());
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
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public static final String ASK_PASSWORD = "ask_password";

    /**
     * 
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public void setFieldAskPassword(OnAskPassword ask_password) {
        toFields().ask_password = toOnAskPassword(this, ASK_PASSWORD, ask_password);
        toFields().writeField(ASK_PASSWORD);
    }

    /**
     * 
     * <br>See {@link OnAskPassword#onAskPassword}
    */
    public JnaMountOperationClass.OnAskPassword getFieldAskPassword() {
       toFields().readField(ASK_PASSWORD);
       return toFields().ask_password;
    } 

    /**
     * 
     * <br>See {@link OnAskQuestion#onAskQuestion}
    */
    public static final String ASK_QUESTION = "ask_question";

    /**
     * 
     * <br>See {@link OnAskQuestion#onAskQuestion}
    */
    public void setFieldAskQuestion(OnAskQuestion ask_question) {
        toFields().ask_question = toOnAskQuestion(this, ASK_QUESTION, ask_question);
        toFields().writeField(ASK_QUESTION);
    }

    /**
     * 
     * <br>See {@link OnAskQuestion#onAskQuestion}
    */
    public JnaMountOperationClass.OnAskQuestion getFieldAskQuestion() {
       toFields().readField(ASK_QUESTION);
       return toFields().ask_question;
    } 

    /**
     * 
     * <br>See {@link OnReply#onReply}
    */
    public static final String REPLY = "reply";

    /**
     * 
     * <br>See {@link OnReply#onReply}
    */
    public void setFieldReply(OnReply reply) {
        toFields().reply = toOnReply(this, REPLY, reply);
        toFields().writeField(REPLY);
    }

    /**
     * 
     * <br>See {@link OnReply#onReply}
    */
    public JnaMountOperationClass.OnReply getFieldReply() {
       toFields().readField(REPLY);
       return toFields().reply;
    } 

    /**
     * 
     * <br>See {@link OnAborted#onAborted}
    */
    public static final String ABORTED = "aborted";

    /**
     * 
     * <br>See {@link OnAborted#onAborted}
    */
    public void setFieldAborted(OnAborted aborted) {
        toFields().aborted = toOnAborted(this, ABORTED, aborted);
        toFields().writeField(ABORTED);
    }

    /**
     * 
     * <br>See {@link OnAborted#onAborted}
    */
    public JnaMountOperationClass.OnAborted getFieldAborted() {
       toFields().readField(ABORTED);
       return toFields().aborted;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MountOperation.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MountOperation.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:show_processes:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:show_unmount_progress:previous-field-unsupported:[MethodModel:Supported:showUnmountProgress:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]]

[MethodModel:Supported:showUnmountProgress:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]

[FieldModel:_g_reserved1:previous-field-unsupported:[MethodModel:Supported:gReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved1:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved2:previous-field-unsupported:[MethodModel:Supported:gReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved3:previous-field-unsupported:[MethodModel:Supported:gReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved4:previous-field-unsupported:[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved5:previous-field-unsupported:[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved5:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved6:previous-field-unsupported:[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved6:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved7:previous-field-unsupported:[MethodModel:Supported:gReserved7:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved7:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved8:previous-field-unsupported:[MethodModel:Supported:gReserved8:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved8:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_g_reserved9:previous-field-unsupported:[MethodModel:Supported:gReserved9:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:gReserved9:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
