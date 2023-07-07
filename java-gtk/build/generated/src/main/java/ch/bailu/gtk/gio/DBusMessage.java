/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A type for representing D-Bus messages that can be sent or received
 * <br>on a &#35;GDBusConnection.
 * <p><a href="https://docs.gtk.org/gio/class.DBusMessage.html">https://docs.gtk.org/gio/class.DBusMessage.html</a></p>
*/
public class DBusMessage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusMessage.class.getCanonicalName());
    }

    public DBusMessage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDBusMessage for a method call.
     * @param name A valid D-Bus name or %NULL.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name or %NULL.
     * @param method A valid method name.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public static DBusMessage newMethodCallDBusMessage(@Nullable ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Str interface_, @Nonnull ch.bailu.gtk.type.Str method)  {
        PointerContainer __self = cast(JnaDBusMessage.INST().g_dbus_message_new_method_call(asCPointer(name), asCPointerNotNull(path), asCPointer(interface_), asCPointerNotNull(method)));
        if (__self.isNull()) {
            throw new NullPointerException("DBusMessage:newMethodCall");
        }
        return new DBusMessage(__self);
    }        
    

    /**
     * Creates a new &#35;GDBusMessage for a method call.
     * @param name A valid D-Bus name or %NULL.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name or %NULL.
     * @param method A valid method name.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public static DBusMessage newMethodCallDBusMessage(String name, String path, String interface_, String method)  {
        PointerContainer __self = cast(JnaDBusMessage.INST().g_dbus_message_new_method_call(name, path, interface_, method));
        if (__self.isNull()) {
            throw new NullPointerException("DBusMessage:newMethodCall");
        }
        return new DBusMessage(__self);
    }        
    

    /**
     * Creates a new &#35;GDBusMessage for a signal emission.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name.
     * @param signal A valid signal name.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public static DBusMessage newSignalDBusMessage(@Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.type.Str interface_, @Nonnull ch.bailu.gtk.type.Str signal)  {
        PointerContainer __self = cast(JnaDBusMessage.INST().g_dbus_message_new_signal(asCPointerNotNull(path), asCPointerNotNull(interface_), asCPointerNotNull(signal)));
        if (__self.isNull()) {
            throw new NullPointerException("DBusMessage:newSignal");
        }
        return new DBusMessage(__self);
    }        
    

    /**
     * Creates a new &#35;GDBusMessage for a signal emission.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name.
     * @param signal A valid signal name.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public static DBusMessage newSignalDBusMessage(String path, String interface_, String signal)  {
        PointerContainer __self = cast(JnaDBusMessage.INST().g_dbus_message_new_signal(path, interface_, signal));
        if (__self.isNull()) {
            throw new NullPointerException("DBusMessage:newSignal");
        }
        return new DBusMessage(__self);
    }        
    

    /**
     * Creates a new empty &#35;GDBusMessage.
    */
    public DBusMessage() {
        super(cast(JnaDBusMessage.INST().g_dbus_message_new()));
    }

    /**
     * Copies &#64;message. The copy is a deep copy and the returned
     * <br>&#35;GDBusMessage is completely identical except that it is guaranteed
     * <br>to not be locked.
     * <br>
     * <br>This operation can fail if e.g. &#64;message contains file descriptors
     * <br>and the per-process or system-wide open files limit is reached.
     * @return A new &#35;GDBusMessage or %NULL if &#64;error is set.     Free with g_object_unref().
    */
    public DBusMessage copy() throws ch.bailu.gtk.type.exception.AllocationError {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_copy(asCPointer(), 0L)));
    }

    /**
     * Convenience to get the first item in the body of &#64;message.
     * @return The string item or %NULL if the first item in the body of &#64;message is not a string.
    */
    public ch.bailu.gtk.type.Str getArg0()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_arg0(asCPointer())));
    }

    /**
     * Gets the body of a message.
     * @return A &#35;GVariant or %NULL if the body is empty. Do not free, it is owned by &#64;message.
    */
    public ch.bailu.gtk.glib.Variant getBody()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_body(asCPointer())));
    }

    /**
     * Gets the byte order of &#64;message.
     * @return The byte order.
    */
    public int getByteOrder()  {
        return JnaDBusMessage.INST().g_dbus_message_get_byte_order(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getDestination()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_destination(asCPointer())));
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getErrorName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_error_name(asCPointer())));
    }

    /**
     * Gets the flags for &#64;message.
     * @return Flags that are set (typically values from the &#35;GDBusMessageFlags enumeration bitwise ORed together).
    */
    public int getFlags()  {
        return JnaDBusMessage.INST().g_dbus_message_get_flags(asCPointer());
    }

    /**
     * Gets a header field on &#64;message.
     * <br>
     * <br>The caller is responsible for checking the type of the returned &#35;GVariant
     * <br>matches what is expected.
     * @param header_field A 8-bit unsigned integer (typically a value from the &#35;GDBusMessageHeaderField enumeration)
     * @return A &#35;GVariant with the value if the header was found, %NULL otherwise. Do not free, it is owned by &#64;message.
    */
    public ch.bailu.gtk.glib.Variant getHeader(int header_field)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_header(asCPointer(), header_field)));
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getInterface()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_interface(asCPointer())));
    }

    /**
     * Checks whether &#64;message is locked. To monitor changes to this
     * <br>value, conncet to the &#35;GObject::notify signal to listen for changes
     * <br>on the &#35;GDBusMessage:locked property.
     * @return %TRUE if &#64;message is locked, %FALSE otherwise.
    */
    public boolean getLocked()  {
        return JnaDBusMessage.INST().g_dbus_message_get_locked(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getMember()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_member(asCPointer())));
    }

    /**
     * Gets the type of &#64;message.
     * @return A 8-bit unsigned integer (typically a value from the &#35;GDBusMessageType enumeration).
    */
    public int getMessageType()  {
        return JnaDBusMessage.INST().g_dbus_message_get_message_type(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     * @return The value.
    */
    public int getNumUnixFds()  {
        return JnaDBusMessage.INST().g_dbus_message_get_num_unix_fds(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_path(asCPointer())));
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     * @return The value.
    */
    public int getReplySerial()  {
        return JnaDBusMessage.INST().g_dbus_message_get_reply_serial(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getSender()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_sender(asCPointer())));
    }

    /**
     * Gets the serial for &#64;message.
     * @return A &#35;guint32.
    */
    public int getSerial()  {
        return JnaDBusMessage.INST().g_dbus_message_get_serial(asCPointer());
    }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     * <br>
     * <br>This will always be non-%NULL, but may be an empty string.
     * @return The value.
    */
    public ch.bailu.gtk.type.Str getSignature()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_signature(asCPointer())));
    }

    /**
     * Gets the UNIX file descriptors associated with &#64;message, if any.
     * <br>
     * <br>This method is only available on UNIX.
     * <br>
     * <br>The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * <br>values in the body of the message. For example,
     * <br>if g_variant_get_handle() returns 5, that is intended to be a reference
     * <br>to the file descriptor that can be accessed by
     * <br>`g_unix_fd_list_get (list, 5, ...)`.
     * @return A &#35;GUnixFDList or %NULL if no file descriptors are associated. Do not free, this object is owned by &#64;message.
    */
    public UnixFDList getUnixFdList()  {
        return new UnixFDList(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_get_unix_fd_list(asCPointer())));
    }

    /**
     * If &#64;message is locked, does nothing. Otherwise locks the message.
    */
    public void lock()  {
        JnaDBusMessage.INST().g_dbus_message_lock(asCPointer());
    }

    /**
     * Creates a new &#35;GDBusMessage that is an error reply to &#64;method_call_message.
     * @param error_name A valid D-Bus error name.
     * @param error_message_format The D-Bus error message in a printf() format.
     * @param _elipse Arguments for &#64;error_message_format.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public DBusMessage newMethodError(@Nonnull ch.bailu.gtk.type.Str error_name, @Nonnull ch.bailu.gtk.type.Str error_message_format, java.lang.Object... _elipse)  {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_new_method_error(asCPointer(), asCPointerNotNull(error_name), asCPointerNotNull(error_message_format), _elipse)));
    }

    /**
     * Creates a new &#35;GDBusMessage that is an error reply to &#64;method_call_message.
     * @param error_name A valid D-Bus error name.
     * @param error_message_format The D-Bus error message in a printf() format.
     * @param _elipse Arguments for &#64;error_message_format.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public DBusMessage newMethodError(String error_name, String error_message_format, java.lang.Object... _elipse)  {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_new_method_error(asCPointer(), error_name, error_message_format, _elipse)));
    }

    /**
     * Creates a new &#35;GDBusMessage that is an error reply to &#64;method_call_message.
     * @param error_name A valid D-Bus error name.
     * @param error_message The D-Bus error message.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public DBusMessage newMethodErrorLiteral(@Nonnull ch.bailu.gtk.type.Str error_name, @Nonnull ch.bailu.gtk.type.Str error_message)  {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_new_method_error_literal(asCPointer(), asCPointerNotNull(error_name), asCPointerNotNull(error_message))));
    }

    /**
     * Creates a new &#35;GDBusMessage that is an error reply to &#64;method_call_message.
     * @param error_name A valid D-Bus error name.
     * @param error_message The D-Bus error message.
     * @return A &#35;GDBusMessage. Free with g_object_unref().
    */
    public DBusMessage newMethodErrorLiteral(String error_name, String error_message)  {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_new_method_error_literal(asCPointer(), error_name, error_message)));
    }

    /**
     * Creates a new &#35;GDBusMessage that is a reply to &#64;method_call_message.
     * @return &#35;GDBusMessage. Free with g_object_unref().
    */
    public DBusMessage newMethodReply()  {
        return new DBusMessage(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_new_method_reply(asCPointer())));
    }

    /**
     * Produces a human-readable multi-line description of &#64;message.
     * <br>
     * <br>The contents of the description has no ABI guarantees, the contents
     * <br>and formatting is subject to change at any time. Typical output
     * <br>looks something like this:
     * <pre>
     * Flags:   none
     * Version: 0
     * Serial:  4
     * Headers:
     *   path -&gt; objectpath '/org/gtk/GDBus/TestObject'
     *   interface -&gt; 'org.gtk.GDBus.TestInterface'
     *   member -&gt; 'GimmeStdout'
     *   destination -&gt; ':1.146'
     * Body: ()
     * UNIX File Descriptors:
     *   (none)
     * </pre>
     * <br>or
     * <pre>
     * Flags:   no-reply-expected
     * Version: 0
     * Serial:  477
     * Headers:
     *   reply-serial -&gt; uint32 4
     *   destination -&gt; ':1.159'
     *   sender -&gt; ':1.146'
     *   num-unix-fds -&gt; uint32 1
     * Body: ()
     * UNIX File Descriptors:
     *   fd 12: dev=0:10,mode=020620,ino=5,uid=500,gid=5,rdev=136:2,size=0,atime=1273085037,mtime=1273085851,ctime=1272982635
     * </pre>
     * @param indent Indentation level.
     * @return A string that should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str print(int indent)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMessage.INST().g_dbus_message_print(asCPointer(), indent)));
    }

    /**
     * Sets the body &#64;message. As a side-effect the
     * <br>%G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field is set to the
     * <br>type string of &#64;body (or cleared if &#64;body is %NULL).
     * <br>
     * <br>If &#64;body is floating, &#64;message assumes ownership of &#64;body.
     * @param body Either %NULL or a &#35;GVariant that is a tuple.
    */
    public void setBody(@Nonnull ch.bailu.gtk.glib.Variant body)  {
        JnaDBusMessage.INST().g_dbus_message_set_body(asCPointer(), asCPointerNotNull(body));
    }

    /**
     * Sets the byte order of &#64;message.
     * @param byte_order The byte order.
    */
    public void setByteOrder(int byte_order)  {
        JnaDBusMessage.INST().g_dbus_message_set_byte_order(asCPointer(), byte_order);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     * @param value The value to set.
    */
    public void setDestination(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_destination(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     * @param value The value to set.
    */
    public void setDestination(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_destination(asCPointer(), value);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     * @param value The value to set.
    */
    public void setErrorName(@Nonnull ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_error_name(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     * @param value The value to set.
    */
    public void setErrorName(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_error_name(asCPointer(), value);
    }

    /**
     * Sets the flags to set on &#64;message.
     * @param flags Flags for &#64;message that are set (typically values from the &#35;GDBusMessageFlags enumeration bitwise ORed together).
    */
    public void setFlags(int flags)  {
        JnaDBusMessage.INST().g_dbus_message_set_flags(asCPointer(), flags);
    }

    /**
     * Sets a header field on &#64;message.
     * <br>
     * <br>If &#64;value is floating, &#64;message assumes ownership of &#64;value.
     * @param header_field A 8-bit unsigned integer (typically a value from the &#35;GDBusMessageHeaderField enumeration)
     * @param value A &#35;GVariant to set the header field or %NULL to clear the header field.
    */
    public void setHeader(int header_field, @Nullable ch.bailu.gtk.glib.Variant value)  {
        JnaDBusMessage.INST().g_dbus_message_set_header(asCPointer(), header_field, asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     * @param value The value to set.
    */
    public void setInterface(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_interface(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     * @param value The value to set.
    */
    public void setInterface(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_interface(asCPointer(), value);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     * @param value The value to set.
    */
    public void setMember(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_member(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     * @param value The value to set.
    */
    public void setMember(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_member(asCPointer(), value);
    }

    /**
     * Sets &#64;message to be of &#64;type.
     * @param type A 8-bit unsigned integer (typically a value from the &#35;GDBusMessageType enumeration).
    */
    public void setMessageType(int type)  {
        JnaDBusMessage.INST().g_dbus_message_set_message_type(asCPointer(), type);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     * @param value The value to set.
    */
    public void setNumUnixFds(int value)  {
        JnaDBusMessage.INST().g_dbus_message_set_num_unix_fds(asCPointer(), value);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     * @param value The value to set.
    */
    public void setPath(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_path(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     * @param value The value to set.
    */
    public void setPath(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_path(asCPointer(), value);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     * @param value The value to set.
    */
    public void setReplySerial(int value)  {
        JnaDBusMessage.INST().g_dbus_message_set_reply_serial(asCPointer(), value);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     * @param value The value to set.
    */
    public void setSender(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_sender(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     * @param value The value to set.
    */
    public void setSender(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_sender(asCPointer(), value);
    }

    /**
     * Sets the serial for &#64;message.
     * @param serial A &#35;guint32.
    */
    public void setSerial(int serial)  {
        JnaDBusMessage.INST().g_dbus_message_set_serial(asCPointer(), serial);
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     * @param value The value to set.
    */
    public void setSignature(@Nullable ch.bailu.gtk.type.Str value)  {
        JnaDBusMessage.INST().g_dbus_message_set_signature(asCPointer(), asCPointer(value));
    }

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     * @param value The value to set.
    */
    public void setSignature(String value)  {
        JnaDBusMessage.INST().g_dbus_message_set_signature(asCPointer(), value);
    }

    /**
     * Sets the UNIX file descriptors associated with &#64;message. As a
     * <br>side-effect the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header
     * <br>field is set to the number of fds in &#64;fd_list (or cleared if
     * <br>&#64;fd_list is %NULL).
     * <br>
     * <br>This method is only available on UNIX.
     * <br>
     * <br>When designing D-Bus APIs that are intended to be interoperable,
     * <br>please note that non-GDBus implementations of D-Bus can usually only
     * <br>access file descriptors if they are referenced by a value of type
     * <br>%G_VARIANT_TYPE_HANDLE in the body of the message.
     * @param fd_list A &#35;GUnixFDList or %NULL.
    */
    public void setUnixFdList(@Nullable UnixFDList fd_list)  {
        JnaDBusMessage.INST().g_dbus_message_set_unix_fd_list(asCPointer(), asCPointer(fd_list));
    }

    /**
     * If &#64;message is not of type %G_DBUS_MESSAGE_TYPE_ERROR does
     * <br>nothing and returns %FALSE.
     * <br>
     * <br>Otherwise this method encodes the error in &#64;message as a &#35;GError
     * <br>using g_dbus_error_set_dbus_error() using the information in the
     * <br>%G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field of &#64;message as
     * <br>well as the first string item in &#64;message's body.
     * @return %TRUE if &#64;error was set, %FALSE otherwise.
    */
    public boolean toGerror() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusMessage.INST().g_dbus_message_to_gerror(asCPointer(), 0L);
    }

    public static long getTypeID() { 
        return JnaDBusMessage.INST().g_dbus_message_get_type(); 
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

[MethodModel:java-type-not-supported:newFromBlob:[ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusCapabilityFlags}}:{j:int}]

[MethodModel:cb-return-value-not-supported:getHeaderFields:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]

[MethodModel:java-type-not-supported:newMethodErrorValist:[ParameterModel:Supported:{Gg:DBusMessage:{c:GDBusMessage*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-return-value-not-supported:toBlob:[ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDBusCapabilityFlags}}:{j:int}]

[MethodModel:java-type-not-supported:bytesNeeded:[ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
