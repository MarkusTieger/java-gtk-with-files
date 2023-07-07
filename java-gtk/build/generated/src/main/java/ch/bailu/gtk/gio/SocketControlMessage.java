/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GSocketControlMessage is a special-purpose utility message that
 * <br>can be sent to or received from a &#35;GSocket. These types of
 * <br>messages are often called &quot;ancillary data&quot;.
 * <br>
 * <br>The message can represent some sort of special instruction to or
 * <br>information from the socket or can represent a special kind of
 * <br>transfer to the peer (for example, sending a file descriptor over
 * <br>a UNIX socket).
 * <br>
 * <br>These messages are sent with g_socket_send_message() and received
 * <br>with g_socket_receive_message().
 * <br>
 * <br>To extend the set of control message that can be sent, subclass this
 * <br>class and override the get_size, get_level, get_type and serialize
 * <br>methods.
 * <br>
 * <br>To extend the set of control messages that can be received, subclass
 * <br>this class and implement the deserialize method. Also, make sure your
 * <br>class is registered with the GType typesystem before calling
 * <br>g_socket_receive_message() to read such a message.
 * <p><a href="https://docs.gtk.org/gio/class.SocketControlMessage.html">https://docs.gtk.org/gio/class.SocketControlMessage.html</a></p>
*/
public class SocketControlMessage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketControlMessage.class.getCanonicalName());
    }

    public SocketControlMessage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the &quot;level&quot; (i.e. the originating protocol) of the control message.
     * <br>This is often SOL_SOCKET.
     * @return an integer describing the level
    */
    public int getLevel()  {
        return JnaSocketControlMessage.INST().g_socket_control_message_get_level(asCPointer());
    }

    /**
     * Returns the protocol specific type of the control message.
     * <br>For instance, for UNIX fd passing this would be SCM_RIGHTS.
     * @return an integer describing the type of control message
    */
    public int getMsgType()  {
        return JnaSocketControlMessage.INST().g_socket_control_message_get_msg_type(asCPointer());
    }

    /**
     * Returns the space required for the control message, not including
     * <br>headers or alignment.
     * @return The number of bytes required.
    */
    public long getSize()  {
        return JnaSocketControlMessage.INST().g_socket_control_message_get_size(asCPointer());
    }

    /**
     * Converts the data in the message to bytes placed in the
     * <br>message.
     * <br>
     * <br>&#64;data is guaranteed to have enough space to fit the size
     * <br>returned by g_socket_control_message_get_size() on this
     * <br>object.
     * @param data A buffer to write data to
    */
    public void serialize(@Nonnull ch.bailu.gtk.type.Pointer data)  {
        JnaSocketControlMessage.INST().g_socket_control_message_serialize(asCPointer(), asCPointerNotNull(data));
    }

    /**
     * Tries to deserialize a socket control message of a given
     * <br>&#64;level and &#64;type. This will ask all known (to GType) subclasses
     * <br>of &#35;GSocketControlMessage if they can understand this kind
     * <br>of message and if so deserialize it into a &#35;GSocketControlMessage.
     * <br>
     * <br>If there is no implementation for this kind of control message, %NULL
     * <br>will be returned.
     * @param level a socket level
     * @param type a socket control message type for the given &#64;level
     * @param size the size of the data in bytes
     * @param data pointer to the message data
     * @return the deserialized message or %NULL
    */
    public static SocketControlMessage deserialize(int level, int type, long size, @Nonnull ch.bailu.gtk.type.Pointer data)  {
        return new SocketControlMessage(new PointerContainer(JnaSocketControlMessage.INST().g_socket_control_message_deserialize(level, type, size, asCPointerNotNull(data))));
    }

    public static long getTypeID() { 
        return JnaSocketControlMessage.INST().g_socket_control_message_get_type(); 
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
