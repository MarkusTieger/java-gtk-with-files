/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GInetAddressMask represents a range of IPv4 or IPv6 addresses
 * <br>described by a base address and a length indicating how many bits
 * <br>of the base address are relevant for matching purposes. These are
 * <br>often given in string form. Eg, &quot;10.0.0.0/8&quot;, or &quot;fe80::/10&quot;.
 * <p><a href="https://docs.gtk.org/gio/class.InetAddressMask.html">https://docs.gtk.org/gio/class.InetAddressMask.html</a></p>
*/
public class InetAddressMask extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InetAddressMask.class.getCanonicalName());
    }

    public InetAddressMask(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Parses &#64;mask_string as an IP address and (optional) length, and
     * <br>creates a new &#35;GInetAddressMask. The length, if present, is
     * <br>delimited by a &quot;/&quot;. If it is not present, then the length is
     * <br>assumed to be the full length of the address.
     * @param mask_string an IP address or address/length string
     * @return a new &#35;GInetAddressMask corresponding to &#64;string, or %NULL on error.
    */
    public static InetAddressMask newFromStringInetAddressMask(@Nonnull ch.bailu.gtk.type.Str mask_string) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaInetAddressMask.INST().g_inet_address_mask_new_from_string(asCPointerNotNull(mask_string), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("InetAddressMask:newFromString");
        }
        return new InetAddressMask(__self);
    }        
    

    /**
     * Parses &#64;mask_string as an IP address and (optional) length, and
     * <br>creates a new &#35;GInetAddressMask. The length, if present, is
     * <br>delimited by a &quot;/&quot;. If it is not present, then the length is
     * <br>assumed to be the full length of the address.
     * @param mask_string an IP address or address/length string
     * @return a new &#35;GInetAddressMask corresponding to &#64;string, or %NULL on error.
    */
    public static InetAddressMask newFromStringInetAddressMask(String mask_string) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaInetAddressMask.INST().g_inet_address_mask_new_from_string(mask_string, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("InetAddressMask:newFromString");
        }
        return new InetAddressMask(__self);
    }        
    

    /**
     * Creates a new &#35;GInetAddressMask representing all addresses whose
     * <br>first &#64;length bits match &#64;addr.
     * @param addr a &#35;GInetAddress
     * @param length number of bits of &#64;addr to use
    */
    public InetAddressMask(@Nonnull InetAddress addr, int length) {
        super(cast(JnaInetAddressMask.INST().g_inet_address_mask_new(asCPointerNotNull(addr), length, 0L)));
    }

    /**
     * Tests if &#64;mask and &#64;mask2 are the same mask.
     * @param mask2 another &#35;GInetAddressMask
     * @return whether &#64;mask and &#64;mask2 are the same mask
    */
    public boolean equal(@Nonnull InetAddressMask mask2)  {
        return JnaInetAddressMask.INST().g_inet_address_mask_equal(asCPointer(), asCPointerNotNull(mask2));
    }

    /**
     * Gets &#64;mask's base address
     * @return &#64;mask's base address
    */
    public InetAddress getAddress()  {
        return new InetAddress(new PointerContainer(JnaInetAddressMask.INST().g_inet_address_mask_get_address(asCPointer())));
    }

    /**
     * Gets the &#35;GSocketFamily of &#64;mask's address
     * @return the &#35;GSocketFamily of &#64;mask's address
    */
    public int getFamily()  {
        return JnaInetAddressMask.INST().g_inet_address_mask_get_family(asCPointer());
    }

    /**
     * Gets &#64;mask's length
     * @return &#64;mask's length
    */
    public int getLength()  {
        return JnaInetAddressMask.INST().g_inet_address_mask_get_length(asCPointer());
    }

    /**
     * Tests if &#64;address falls within the range described by &#64;mask.
     * @param address a &#35;GInetAddress
     * @return whether &#64;address falls within the range described by &#64;mask.
    */
    public boolean matches(@Nonnull InetAddress address)  {
        return JnaInetAddressMask.INST().g_inet_address_mask_matches(asCPointer(), asCPointerNotNull(address));
    }

    /**
     * Converts &#64;mask back to its corresponding string form.
     * @return a string corresponding to &#64;mask.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaInetAddressMask.INST().g_inet_address_mask_to_string(asCPointer())));
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaInetAddressMask.INST().g_inet_address_mask_get_type(); 
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
