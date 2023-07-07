/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSettingsBackend interface defines a generic interface for
 * <br>non-strictly-typed data that is stored in a hierarchy. To implement
 * <br>an alternative storage backend for &#35;GSettings, you need to implement
 * <br>the &#35;GSettingsBackend interface and then make it implement the
 * <br>extension point %G_SETTINGS_BACKEND_EXTENSION_POINT_NAME.
 * <br>
 * <br>The interface defines methods for reading and writing values, a
 * <br>method for determining if writing of certain values will fail
 * <br>(lockdown) and a change notification mechanism.
 * <br>
 * <br>The semantics of the interface are very precisely defined and
 * <br>implementations must carefully adhere to the expectations of
 * <br>callers that are documented on each of the interface methods.
 * <br>
 * <br>Some of the &#35;GSettingsBackend functions accept or return a &#35;GTree.
 * <br>These trees always have strings as keys and &#35;GVariant as values.
 * <br>g_settings_backend_create_tree() is a convenience function to create
 * <br>suitable trees.
 * <br>
 * <br>The &#35;GSettingsBackend API is exported to allow third-party
 * <br>implementations, but does not carry the same stability guarantees
 * <br>as the public GIO API. For this reason, you have to define the
 * <br>C preprocessor symbol %G_SETTINGS_ENABLE_BACKEND before including
 * <br>`gio/gsettingsbackend.h`.
 * <p><a href="https://docs.gtk.org/gio/class.SettingsBackend.html">https://docs.gtk.org/gio/class.SettingsBackend.html</a></p>
*/
public class SettingsBackend extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsBackend.class.getCanonicalName());
    }

    public SettingsBackend(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Signals that a single key has possibly changed.  Backend
     * <br>implementations should call this if a key has possibly changed its
     * <br>value.
     * <br>
     * <br>&#64;key must be a valid key (ie starting with a slash, not containing
     * <br>'//', and not ending with a slash).
     * <br>
     * <br>The implementation must call this function during any call to
     * <br>g_settings_backend_write(), before the call returns (except in the
     * <br>case that no keys are actually changed and it cares to detect this
     * <br>fact).  It may not rely on the existence of a mainloop for
     * <br>dispatching the signal later.
     * <br>
     * <br>The implementation may call this function at any other time it likes
     * <br>in response to other events (such as changes occurring outside of the
     * <br>program).  These calls may originate from a mainloop or may originate
     * <br>in response to any other action (including from calls to
     * <br>g_settings_backend_write()).
     * <br>
     * <br>In the case that this call is in response to a call to
     * <br>g_settings_backend_write() then &#64;origin_tag must be set to the same
     * <br>value that was passed to that call.
     * @param key the name of the key
     * @param origin_tag the origin tag
    */
    public void changed(@Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Pointer origin_tag)  {
        JnaSettingsBackend.INST().g_settings_backend_changed(asCPointer(), asCPointerNotNull(key), asCPointer(origin_tag));
    }

    /**
     * Signals that a single key has possibly changed.  Backend
     * <br>implementations should call this if a key has possibly changed its
     * <br>value.
     * <br>
     * <br>&#64;key must be a valid key (ie starting with a slash, not containing
     * <br>'//', and not ending with a slash).
     * <br>
     * <br>The implementation must call this function during any call to
     * <br>g_settings_backend_write(), before the call returns (except in the
     * <br>case that no keys are actually changed and it cares to detect this
     * <br>fact).  It may not rely on the existence of a mainloop for
     * <br>dispatching the signal later.
     * <br>
     * <br>The implementation may call this function at any other time it likes
     * <br>in response to other events (such as changes occurring outside of the
     * <br>program).  These calls may originate from a mainloop or may originate
     * <br>in response to any other action (including from calls to
     * <br>g_settings_backend_write()).
     * <br>
     * <br>In the case that this call is in response to a call to
     * <br>g_settings_backend_write() then &#64;origin_tag must be set to the same
     * <br>value that was passed to that call.
     * @param key the name of the key
     * @param origin_tag the origin tag
    */
    public void changed(String key, @Nullable ch.bailu.gtk.type.Pointer origin_tag)  {
        JnaSettingsBackend.INST().g_settings_backend_changed(asCPointer(), key, asCPointer(origin_tag));
    }

    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * <br>&#64;tree, computes the longest common prefix and calls
     * <br>g_settings_backend_changed().
     * @param tree a &#35;GTree containing the changes
     * @param origin_tag the origin tag
    */
    public void changedTree(@Nonnull ch.bailu.gtk.glib.Tree tree, @Nullable ch.bailu.gtk.type.Pointer origin_tag)  {
        JnaSettingsBackend.INST().g_settings_backend_changed_tree(asCPointer(), asCPointerNotNull(tree), asCPointer(origin_tag));
    }

    /**
     * Signals that all keys below a given path may have possibly changed.
     * <br>Backend implementations should call this if an entire path of keys
     * <br>have possibly changed their values.
     * <br>
     * <br>&#64;path must be a valid path (ie starting and ending with a slash and
     * <br>not containing '//').
     * <br>
     * <br>The meaning of this signal is that any of the key which has a name
     * <br>starting with &#64;path may have changed.
     * <br>
     * <br>The same rules for when notifications must occur apply as per
     * <br>g_settings_backend_changed().  This call might be an appropriate
     * <br>reasponse to a 'reset' call but implementations are also free to
     * <br>explicitly list the keys that were affected by that call if they can
     * <br>easily do so.
     * <br>
     * <br>For efficiency reasons, the implementation should strive for &#64;path to
     * <br>be as long as possible (ie: the longest common prefix of all of the
     * <br>keys that were changed) but this is not strictly required.  As an
     * <br>example, if this function is called with the path of &quot;/&quot; then every
     * <br>single key in the application will be notified of a possible change.
     * @param path the path containing the changes
     * @param origin_tag the origin tag
    */
    public void pathChanged(@Nonnull ch.bailu.gtk.type.Str path, @Nullable ch.bailu.gtk.type.Pointer origin_tag)  {
        JnaSettingsBackend.INST().g_settings_backend_path_changed(asCPointer(), asCPointerNotNull(path), asCPointer(origin_tag));
    }

    /**
     * Signals that all keys below a given path may have possibly changed.
     * <br>Backend implementations should call this if an entire path of keys
     * <br>have possibly changed their values.
     * <br>
     * <br>&#64;path must be a valid path (ie starting and ending with a slash and
     * <br>not containing '//').
     * <br>
     * <br>The meaning of this signal is that any of the key which has a name
     * <br>starting with &#64;path may have changed.
     * <br>
     * <br>The same rules for when notifications must occur apply as per
     * <br>g_settings_backend_changed().  This call might be an appropriate
     * <br>reasponse to a 'reset' call but implementations are also free to
     * <br>explicitly list the keys that were affected by that call if they can
     * <br>easily do so.
     * <br>
     * <br>For efficiency reasons, the implementation should strive for &#64;path to
     * <br>be as long as possible (ie: the longest common prefix of all of the
     * <br>keys that were changed) but this is not strictly required.  As an
     * <br>example, if this function is called with the path of &quot;/&quot; then every
     * <br>single key in the application will be notified of a possible change.
     * @param path the path containing the changes
     * @param origin_tag the origin tag
    */
    public void pathChanged(String path, @Nullable ch.bailu.gtk.type.Pointer origin_tag)  {
        JnaSettingsBackend.INST().g_settings_backend_path_changed(asCPointer(), path, asCPointer(origin_tag));
    }

    /**
     * Signals that the writability of all keys below a given path may have
     * <br>changed.
     * <br>
     * <br>Since GSettings performs no locking operations for itself, this call
     * <br>will always be made in response to external events.
     * @param path the name of the path
    */
    public void pathWritableChanged(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaSettingsBackend.INST().g_settings_backend_path_writable_changed(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Signals that the writability of all keys below a given path may have
     * <br>changed.
     * <br>
     * <br>Since GSettings performs no locking operations for itself, this call
     * <br>will always be made in response to external events.
     * @param path the name of the path
    */
    public void pathWritableChanged(String path)  {
        JnaSettingsBackend.INST().g_settings_backend_path_writable_changed(asCPointer(), path);
    }

    /**
     * Signals that the writability of a single key has possibly changed.
     * <br>
     * <br>Since GSettings performs no locking operations for itself, this call
     * <br>will always be made in response to external events.
     * @param key the name of the key
    */
    public void writableChanged(@Nonnull ch.bailu.gtk.type.Str key)  {
        JnaSettingsBackend.INST().g_settings_backend_writable_changed(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Signals that the writability of a single key has possibly changed.
     * <br>
     * <br>Since GSettings performs no locking operations for itself, this call
     * <br>will always be made in response to external events.
     * @param key the name of the key
    */
    public void writableChanged(String key)  {
        JnaSettingsBackend.INST().g_settings_backend_writable_changed(asCPointer(), key);
    }

    /**
     * Returns the default &#35;GSettingsBackend. It is possible to override
     * <br>the default by setting the `GSETTINGS_BACKEND` environment variable
     * <br>to the name of a settings backend.
     * <br>
     * <br>The user gets a reference to the backend.
     * @return the default &#35;GSettingsBackend,     which will be a dummy (memory) settings backend if no other settings     backend is available.
    */
    public static SettingsBackend getDefault()  {
        return new SettingsBackend(new PointerContainer(JnaSettingsBackend.INST().g_settings_backend_get_default()));
    }

    public static long getTypeID() { 
        return JnaSettingsBackend.INST().g_settings_backend_get_type(); 
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

[MethodModel:java-type-not-supported:keysChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:flattenTree:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Tree:{c:GTree*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar***}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant***}}:{j:}]
*/
