/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Structure used for scatter/gather data input when receiving multiple
 * <br>messages or packets in one go. You generally pass in an array of empty
 * <br>&#35;GInputVectors and the operation will use all the buffers as if they
 * <br>were one buffer, and will set &#64;bytes_received to the total number of bytes
 * <br>received across all &#35;GInputVectors.
 * <br>
 * <br>This structure closely mirrors `struct mmsghdr` and `struct msghdr` from
 * <br>the POSIX sockets API (see `man 2 recvmmsg`).
 * <br>
 * <br>If &#64;address is non-%NULL then it is set to the source address the message
 * <br>was received from, and the caller must free it afterwards.
 * <br>
 * <br>If &#64;control_messages is non-%NULL then it is set to an array of control
 * <br>messages received with the message (if any), and the caller must free it
 * <br>afterwards. &#64;num_control_messages is set to the number of elements in
 * <br>this array, which may be zero.
 * <br>
 * <br>Flags relevant to this message will be returned in &#64;flags. For example,
 * <br>`MSG_EOR` or `MSG_TRUNC`.
 * <p><a href="https://docs.gtk.org/gio/struct.InputMessage.html">https://docs.gtk.org/gio/struct.InputMessage.html</a></p>
*/
public class InputMessage extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InputMessage.class.getCanonicalName());
    }

    public InputMessage(PointerContainer pointer) {
        super(pointer);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:address:java-type-not-supported:{G_::{c:GSocketAddress**}}:{j:}]

[FieldModel:vectors:java-type-not-supported:previous-field-unsupported:{G_::{c:GInputVector*}}:{j:}]

[FieldModel:num_vectors:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:bytes_received:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:flags:previous-field-unsupported:{G_::{c:gint}}:{j:int}]

[FieldModel:control_messages:java-type-not-supported:previous-field-unsupported:{G_::{c:GSocketControlMessage***}}:{j:}]

[FieldModel:num_control_messages:java-type-not-supported:previous-field-unsupported:{G_::{c:guint*}}:{j:}]
*/
