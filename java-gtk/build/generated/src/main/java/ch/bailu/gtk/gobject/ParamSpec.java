/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GParamSpec is an object structure that encapsulates the metadata
 * <br>required to specify parameters, such as e.g. &#35;GObject properties.
 * <br>
 * <br>&#35;&#35; Parameter names &#35; {&#35;canonical-parameter-names}
 * <br>
 * <br>A property name consists of one or more segments consisting of ASCII letters
 * <br>and digits, separated by either the `-` or `_` character. The first
 * <br>character of a property name must be a letter. These are the same rules as
 * <br>for signal naming (see g_signal_new()).
 * <br>
 * <br>When creating and looking up a &#35;GParamSpec, either separator can be
 * <br>used, but they cannot be mixed. Using `-` is considerably more
 * <br>efficient, and is the ‘canonical form’. Using `_` is discouraged.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpec.html">https://docs.gtk.org/gobject/class.ParamSpec.html</a></p>
*/
public class ParamSpec extends ch.bailu.gtk.type.Pointer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpec.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaParamSpec.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaParamSpec.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public ParamSpec(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get the short description of a &#35;GParamSpec.
     * @return the short description of &#64;pspec.
    */
    public ch.bailu.gtk.type.Str getBlurb()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_blurb(asCPointer())));
    }

    /**
     * Gets the default value of &#64;pspec as a pointer to a &#35;GValue.
     * <br>
     * <br>The &#35;GValue will remain valid for the life of &#64;pspec.
     * @return a pointer to a &#35;GValue which must not be modified
    */
    public Value getDefaultValue()  {
        return new Value(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_default_value(asCPointer())));
    }

    /**
     * Get the name of a &#35;GParamSpec.
     * <br>
     * <br>The name is always an &quot;interned&quot; string (as per g_intern_string()).
     * <br>This allows for pointer-value comparisons.
     * @return the name of &#64;pspec.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_name(asCPointer())));
    }

    /**
     * Gets the GQuark for the name.
     * @return the GQuark for &#64;pspec-&gt;name.
    */
    public int getNameQuark()  {
        return JnaParamSpec.INST().g_param_spec_get_name_quark(asCPointer());
    }

    /**
     * Get the nickname of a &#35;GParamSpec.
     * @return the nickname of &#64;pspec.
    */
    public ch.bailu.gtk.type.Str getNick()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_nick(asCPointer())));
    }

    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     * @param quark a &#35;GQuark, naming the user data pointer
     * @return the user data pointer set, or %NULL
    */
    public ch.bailu.gtk.type.Pointer getQdata(int quark)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_qdata(asCPointer(), quark)));
    }

    /**
     * If the paramspec redirects operations to another paramspec,
     * <br>returns that paramspec. Redirect is used typically for
     * <br>providing a new implementation of a property in a derived
     * <br>type while preserving all the properties from the parent
     * <br>type. Redirection is established by creating a property
     * <br>of type &#35;GParamSpecOverride. See g_object_class_override_property()
     * <br>for an example of the use of this capability.
     * @return paramspec to which requests on this          paramspec should be redirected, or %NULL if none.
    */
    public ParamSpec getRedirectTarget()  {
        return new ParamSpec(new PointerContainer(JnaParamSpec.INST().g_param_spec_get_redirect_target(asCPointer())));
    }

    /**
     * Increments the reference count of &#64;pspec.
     * @return the &#35;GParamSpec that was passed into this function
    */
    public ParamSpec ref()  {
        return new ParamSpec(new PointerContainer(JnaParamSpec.INST().g_param_spec_ref(asCPointer())));
    }

    /**
     * Convenience function to ref and sink a &#35;GParamSpec.
     * @return the &#35;GParamSpec that was passed into this function
    */
    public ParamSpec refSink()  {
        return new ParamSpec(new PointerContainer(JnaParamSpec.INST().g_param_spec_ref_sink(asCPointer())));
    }

    /**
     * Sets an opaque, named pointer on a &#35;GParamSpec. The name is
     * <br>specified through a &#35;GQuark (retrieved e.g. via
     * <br>g_quark_from_static_string()), and the pointer can be gotten back
     * <br>from the &#64;pspec with g_param_spec_get_qdata().  Setting a
     * <br>previously set user data pointer, overrides (frees) the old pointer
     * <br>set, using %NULL as pointer essentially removes the data stored.
     * @param quark a &#35;GQuark, naming the user data pointer
     * @param data an opaque user data pointer
    */
    public void setQdata(int quark, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaParamSpec.INST().g_param_spec_set_qdata(asCPointer(), quark, asCPointer(data));
    }

    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * <br>a `void (*destroy) (gpointer)` function may be
     * <br>specified which is called with &#64;data as argument when the &#64;pspec is
     * <br>finalized, or the data is being overwritten by a call to
     * <br>g_param_spec_set_qdata() with the same &#64;quark.
     * @param quark a &#35;GQuark, naming the user data pointer
     * @param data an opaque user data pointer
     * @param destroy function to invoke with &#64;data as argument, when &#64;data needs to  be freed
    */
    public void setQdataFull(int quark, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaParamSpec.INST().g_param_spec_set_qdata_full(asCPointer(), quark, asCPointer(data), toOnDestroyNotify(this, "setQdataFull", destroy));
    }

    /**
     * The initial reference count of a newly created &#35;GParamSpec is 1,
     * <br>even though no one has explicitly called g_param_spec_ref() on it
     * <br>yet. So the initial reference count is flagged as &quot;floating&quot;, until
     * <br>someone calls `g_param_spec_ref (pspec); g_param_spec_sink
     * <br>(pspec);` in sequence on it, taking over the initial
     * <br>reference count (thus ending up with a &#64;pspec that has a reference
     * <br>count of 1 still, but is not flagged &quot;floating&quot; anymore).
    */
    public void sink()  {
        JnaParamSpec.INST().g_param_spec_sink(asCPointer());
    }

    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * <br>and removes the &#64;data from &#64;pspec without invoking its destroy()
     * <br>function (if any was set).  Usually, calling this function is only
     * <br>required to update user data pointers with a destroy notifier.
     * @param quark a &#35;GQuark, naming the user data pointer
     * @return the user data pointer set, or %NULL
    */
    public ch.bailu.gtk.type.Pointer stealQdata(int quark)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaParamSpec.INST().g_param_spec_steal_qdata(asCPointer(), quark)));
    }

    /**
     * Decrements the reference count of a &#64;pspec.
    */
    public void unref()  {
        JnaParamSpec.INST().g_param_spec_unref(asCPointer());
    }

    /**
     * Creates a new &#35;GParamSpec instance.
     * <br>
     * <br>See [canonical parameter names][canonical-parameter-names] for details of
     * <br>the rules for &#64;name. Names which violate these rules lead to undefined
     * <br>behaviour.
     * <br>
     * <br>Beyond the name, &#35;GParamSpecs have two more descriptive strings, the
     * <br>&#64;nick and &#64;blurb, which may be used as a localized label and description.
     * <br>For GTK and related libraries these are considered deprecated and may be
     * <br>omitted, while for other libraries such as GStreamer and its plugins they
     * <br>are essential. When in doubt, follow the conventions used in the
     * <br>surrounding code and supporting libraries.
     * @param param_type the &#35;GType for the property; must be derived from %G_TYPE_PARAM
     * @param name the canonical name of the property
     * @param nick the nickname of the property
     * @param blurb a short description of the property
     * @param flags a combination of &#35;GParamFlags
     * @return (transfer floating): a newly allocated     &#35;GParamSpec instance, which is initially floating
    */
    public static ch.bailu.gtk.type.Pointer internal(long param_type, @Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int flags)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaParamSpec.INST().g_param_spec_internal(param_type, asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), flags)));
    }

    /**
     * Validate a property name for a &#35;GParamSpec. This can be useful for
     * <br>dynamically-generated properties which need to be validated at run-time
     * <br>before actually trying to create them.
     * <br>
     * <br>See [canonical parameter names][canonical-parameter-names] for details of
     * <br>the rules for valid names.
     * @param name the canonical name of the property
     * @return %TRUE if &#64;name is a valid property name, %FALSE otherwise.
    */
    public static boolean isValidName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaParamSpec.INST().g_param_spec_is_valid_name(asCPointerNotNull(name));
    }

    public static long getTypeID() { 
        return JnaParamSpec.INST().intern(); 
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

[FieldModel:g_type_instance:direct-type:{Gg:TypeInstance:{c:GTypeInstance}}:{j:long}]

[FieldModel:name:previous-field-unsupported:{Gw:Str:{c:const gchar*}}:{j:long}]

[FieldModel:flags:previous-field-unsupported:{G_::{c:GParamFlags}}:{j:int}]

[FieldModel:value_type:previous-field-unsupported:{G_::{c:GType}}:{j:long}]

[FieldModel:owner_type:previous-field-unsupported:{G_::{c:GType}}:{j:long}]

[FieldModel:_nick:previous-field-unsupported:{Gw:Str:{c:gchar*}}:{j:long}]

[FieldModel:_blurb:previous-field-unsupported:{Gw:Str:{c:gchar*}}:{j:long}]

[FieldModel:qdata:previous-field-unsupported:{Gg:Data:{c:GData*}}:{j:long}]

[FieldModel:ref_count:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:param_id:previous-field-unsupported:{G_::{c:guint}}:{j:int}]
*/
