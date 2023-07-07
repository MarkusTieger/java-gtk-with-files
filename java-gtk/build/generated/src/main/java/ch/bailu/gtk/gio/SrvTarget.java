/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * SRV (service) records are used by some network protocols to provide
 * <br>service-specific aliasing and load-balancing. For example, XMPP
 * <br>(Jabber) uses SRV records to locate the XMPP server for a domain;
 * <br>rather than connecting directly to &quot;example.com&quot; or assuming a
 * <br>specific server hostname like &quot;xmpp.example.com&quot;, an XMPP client
 * <br>would look up the &quot;xmpp-client&quot; SRV record for &quot;example.com&quot;, and
 * <br>then connect to whatever host was pointed to by that record.
 * <br>
 * <br>You can use g_resolver_lookup_service() or
 * <br>g_resolver_lookup_service_async() to find the &#35;GSrvTargets
 * <br>for a given service. However, if you are simply planning to connect
 * <br>to the remote service, you can use &#35;GNetworkService's
 * <br>&#35;GSocketConnectable interface and not need to worry about
 * <br>&#35;GSrvTarget at all.
 * <p><a href="https://docs.gtk.org/gio/struct.SrvTarget.html">https://docs.gtk.org/gio/struct.SrvTarget.html</a></p>
*/
public class SrvTarget extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SrvTarget.class.getCanonicalName());
    }

    public SrvTarget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSrvTarget with the given parameters.
     * <br>
     * <br>You should not need to use this; normally &#35;GSrvTargets are
     * <br>created by &#35;GResolver.
     * @param hostname the host that the service is running on
     * @param port the port that the service is running on
     * @param priority the target's priority
     * @param weight the target's weight
    */
    public SrvTarget(@Nonnull ch.bailu.gtk.type.Str hostname, int port, int priority, int weight) {
        super(cast(JnaSrvTarget.INST().g_srv_target_new(asCPointerNotNull(hostname), port, priority, weight)));
    }

    /**
     * Creates a new &#35;GSrvTarget with the given parameters.
     * <br>
     * <br>You should not need to use this; normally &#35;GSrvTargets are
     * <br>created by &#35;GResolver.
     * @param hostname the host that the service is running on
     * @param port the port that the service is running on
     * @param priority the target's priority
     * @param weight the target's weight
    */
    public SrvTarget(String hostname, int port, int priority, int weight) {
        super(cast(JnaSrvTarget.INST().g_srv_target_new(hostname, port, priority, weight)));
    }

    /**
     * Copies &#64;target
     * @return a copy of &#64;target
    */
    public SrvTarget copy()  {
        return new SrvTarget(new PointerContainer(JnaSrvTarget.INST().g_srv_target_copy(asCPointer())));
    }

    /**
     * Frees &#64;target
    */
    public void free()  {
        JnaSrvTarget.INST().g_srv_target_free(asCPointer());
    }

    /**
     * Gets &#64;target's hostname (in ASCII form; if you are going to present
     * <br>this to the user, you should use g_hostname_is_ascii_encoded() to
     * <br>check if it contains encoded Unicode segments, and use
     * <br>g_hostname_to_unicode() to convert it if it does.)
     * @return &#64;target's hostname
    */
    public ch.bailu.gtk.type.Str getHostname()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSrvTarget.INST().g_srv_target_get_hostname(asCPointer())));
    }

    /**
     * Gets &#64;target's port
     * @return &#64;target's port
    */
    public int getPort()  {
        return JnaSrvTarget.INST().g_srv_target_get_port(asCPointer());
    }

    /**
     * Gets &#64;target's priority. You should not need to look at this;
     * <br>&#35;GResolver already sorts the targets according to the algorithm in
     * <br>RFC 2782.
     * @return &#64;target's priority
    */
    public int getPriority()  {
        return JnaSrvTarget.INST().g_srv_target_get_priority(asCPointer());
    }

    /**
     * Gets &#64;target's weight. You should not need to look at this;
     * <br>&#35;GResolver already sorts the targets according to the algorithm in
     * <br>RFC 2782.
     * @return &#64;target's weight
    */
    public int getWeight()  {
        return JnaSrvTarget.INST().g_srv_target_get_weight(asCPointer());
    }

    /**
     * Sorts &#64;targets in place according to the algorithm in RFC 2782.
     * @param targets a &#35;GList of &#35;GSrvTarget
     * @return the head of the sorted list.
    */
    public static ch.bailu.gtk.glib.List listSort(@Nonnull ch.bailu.gtk.glib.List targets)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaSrvTarget.INST().g_srv_target_list_sort(asCPointerNotNull(targets))));
    }

    public static long getTypeID() { 
        return JnaSrvTarget.INST().g_srv_target_get_type(); 
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
record-type
all-fields-supported
*/
