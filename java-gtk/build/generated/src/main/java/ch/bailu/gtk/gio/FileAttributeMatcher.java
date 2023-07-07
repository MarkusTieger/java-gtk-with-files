/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Determines if a string matches a file attribute.
 * <p><a href="https://docs.gtk.org/gio/struct.FileAttributeMatcher.html">https://docs.gtk.org/gio/struct.FileAttributeMatcher.html</a></p>
*/
public class FileAttributeMatcher extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileAttributeMatcher.class.getCanonicalName());
    }

    public FileAttributeMatcher(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new file attribute matcher, which matches attributes
     * <br>against a given string. &#35;GFileAttributeMatchers are reference
     * <br>counted structures, and are created with a reference count of 1. If
     * <br>the number of references falls to 0, the &#35;GFileAttributeMatcher is
     * <br>automatically destroyed.
     * <br>
     * <br>The &#64;attributes string should be formatted with specific keys separated
     * <br>from namespaces with a double colon. Several &quot;namespace::key&quot; strings may be
     * <br>concatenated with a single comma (e.g. &quot;standard::type,standard::is-hidden&quot;).
     * <br>The wildcard &quot;*&quot; may be used to match all keys and namespaces, or
     * <br>&quot;namespace::*&quot; will match all keys in a given namespace.
     * <br>
     * <br>&#35;&#35; Examples of file attribute matcher strings and results
     * <br>
     * <br>- `&quot;*&quot;`: matches all attributes.
     * <br>- `&quot;standard::is-hidden&quot;`: matches only the key is-hidden in the
     * <br>  standard namespace.
     * <br>- `&quot;standard::type,unix::*&quot;`: matches the type key in the standard
     * <br>  namespace and all keys in the unix namespace.
     * @param attributes an attribute string to match.
    */
    public FileAttributeMatcher(@Nonnull ch.bailu.gtk.type.Str attributes) {
        super(cast(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_new(asCPointerNotNull(attributes))));
    }

    /**
     * Creates a new file attribute matcher, which matches attributes
     * <br>against a given string. &#35;GFileAttributeMatchers are reference
     * <br>counted structures, and are created with a reference count of 1. If
     * <br>the number of references falls to 0, the &#35;GFileAttributeMatcher is
     * <br>automatically destroyed.
     * <br>
     * <br>The &#64;attributes string should be formatted with specific keys separated
     * <br>from namespaces with a double colon. Several &quot;namespace::key&quot; strings may be
     * <br>concatenated with a single comma (e.g. &quot;standard::type,standard::is-hidden&quot;).
     * <br>The wildcard &quot;*&quot; may be used to match all keys and namespaces, or
     * <br>&quot;namespace::*&quot; will match all keys in a given namespace.
     * <br>
     * <br>&#35;&#35; Examples of file attribute matcher strings and results
     * <br>
     * <br>- `&quot;*&quot;`: matches all attributes.
     * <br>- `&quot;standard::is-hidden&quot;`: matches only the key is-hidden in the
     * <br>  standard namespace.
     * <br>- `&quot;standard::type,unix::*&quot;`: matches the type key in the standard
     * <br>  namespace and all keys in the unix namespace.
     * @param attributes an attribute string to match.
    */
    public FileAttributeMatcher(String attributes) {
        super(cast(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_new(attributes)));
    }

    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * <br>This will always return %TRUE if a wildcard character is in use (e.g. if
     * <br>matcher was created with &quot;standard::*&quot; and &#64;ns is &quot;standard&quot;, or if matcher was created
     * <br>using &quot;*&quot; and namespace is anything.)
     * <br>
     * <br>TODO: this is awkwardly worded.
     * @param ns a string containing a file attribute namespace.
     * @return %TRUE if the matcher matches all of the entries in the given &#64;ns, %FALSE otherwise.
    */
    public boolean enumerateNamespace(@Nonnull ch.bailu.gtk.type.Str ns)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_enumerate_namespace(asCPointer(), asCPointerNotNull(ns));
    }

    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * <br>This will always return %TRUE if a wildcard character is in use (e.g. if
     * <br>matcher was created with &quot;standard::*&quot; and &#64;ns is &quot;standard&quot;, or if matcher was created
     * <br>using &quot;*&quot; and namespace is anything.)
     * <br>
     * <br>TODO: this is awkwardly worded.
     * @param ns a string containing a file attribute namespace.
     * @return %TRUE if the matcher matches all of the entries in the given &#64;ns, %FALSE otherwise.
    */
    public boolean enumerateNamespace(String ns)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_enumerate_namespace(asCPointer(), ns);
    }

    /**
     * Gets the next matched attribute from a &#35;GFileAttributeMatcher.
     * @return a string containing the next attribute or, %NULL if no more attribute exist.
    */
    public ch.bailu.gtk.type.Str enumerateNext()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_enumerate_next(asCPointer())));
    }

    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * <br>the matcher was created with the &quot;*&quot; matching string, this function
     * <br>will always return %TRUE.
     * @param attribute a file attribute key.
     * @return %TRUE if &#64;attribute matches &#64;matcher. %FALSE otherwise.
    */
    public boolean matches(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_matches(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * <br>the matcher was created with the &quot;*&quot; matching string, this function
     * <br>will always return %TRUE.
     * @param attribute a file attribute key.
     * @return %TRUE if &#64;attribute matches &#64;matcher. %FALSE otherwise.
    */
    public boolean matches(String attribute)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_matches(asCPointer(), attribute);
    }

    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * <br>returns %FALSE if &quot;*&quot; was used when creating the matcher.
     * @param attribute a file attribute key.
     * @return %TRUE if the matcher only matches &#64;attribute. %FALSE otherwise.
    */
    public boolean matchesOnly(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_matches_only(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Checks if a attribute matcher only matches a given attribute. Always
     * <br>returns %FALSE if &quot;*&quot; was used when creating the matcher.
     * @param attribute a file attribute key.
     * @return %TRUE if the matcher only matches &#64;attribute. %FALSE otherwise.
    */
    public boolean matchesOnly(String attribute)  {
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_matches_only(asCPointer(), attribute);
    }

    /**
     * References a file attribute matcher.
     * @return a &#35;GFileAttributeMatcher.
    */
    public FileAttributeMatcher ref()  {
        return new FileAttributeMatcher(new PointerContainer(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_ref(asCPointer())));
    }

    /**
     * Subtracts all attributes of &#64;subtract from &#64;matcher and returns
     * <br>a matcher that supports those attributes.
     * <br>
     * <br>Note that currently it is not possible to remove a single
     * <br>attribute when the &#64;matcher matches the whole namespace - or remove
     * <br>a namespace or attribute when the matcher matches everything. This
     * <br>is a limitation of the current implementation, but may be fixed
     * <br>in the future.
     * @param subtract The matcher to subtract
     * @return A file attribute matcher matching all attributes of     &#64;matcher that are not matched by &#64;subtract
    */
    public FileAttributeMatcher subtract(@Nullable FileAttributeMatcher subtract)  {
        return new FileAttributeMatcher(new PointerContainer(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_subtract(asCPointer(), asCPointer(subtract))));
    }

    /**
     * Prints what the matcher is matching against. The format will be
     * <br>equal to the format passed to g_file_attribute_matcher_new().
     * <br>The output however, might not be identical, as the matcher may
     * <br>decide to use a different order or omit needless parts.
     * @return a string describing the attributes the matcher matches   against or %NULL if &#64;matcher was %NULL.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileAttributeMatcher.INST().g_file_attribute_matcher_to_string(asCPointer())));
    }

    /**
     * Unreferences &#64;matcher. If the reference count falls below 1,
     * <br>the &#64;matcher is automatically freed.
    */
    public void unref()  {
        JnaFileAttributeMatcher.INST().g_file_attribute_matcher_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFileAttributeMatcher.INST().g_file_attribute_matcher_get_type(); 
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
