/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpecPool maintains a collection of &#35;GParamSpecs which can be
 * <br>quickly accessed by owner and name.
 * <br>
 * <br>The implementation of the &#35;GObject property system uses such a pool to
 * <br>store the &#35;GParamSpecs of the properties all object types.
 * <p><a href="https://docs.gtk.org/gobject/struct.ParamSpecPool.html">https://docs.gtk.org/gobject/struct.ParamSpecPool.html</a></p>
*/
class ParamSpecPool extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecPool.class.getCanonicalName());
    }

    public ParamSpecPool(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Inserts a &#35;GParamSpec in the pool.
     * @param pspec the &#35;GParamSpec to insert
     * @param owner_type a &#35;GType identifying the owner of &#64;pspec
    */
    public void insert(@Nonnull ParamSpec pspec, long owner_type)  {
        JnaParamSpecPool.INST().g_param_spec_pool_insert(asCPointer(), asCPointerNotNull(pspec), owner_type);
    }

    /**
     * Gets an &#35;GList of all &#35;GParamSpecs owned by &#64;owner_type in
     * <br>the pool.
     * @param owner_type the owner to look for
     * @return a          &#35;GList of all &#35;GParamSpecs owned by &#64;owner_type in          the pool&#35;GParamSpecs.
    */
    public ch.bailu.gtk.glib.List listOwned(long owner_type)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaParamSpecPool.INST().g_param_spec_pool_list_owned(asCPointer(), owner_type)));
    }

    /**
     * Looks up a &#35;GParamSpec in the pool.
     * @param param_name the name to look for
     * @param owner_type the owner to look for
     * @param walk_ancestors If %TRUE, also try to find a &#35;GParamSpec with &#64;param_name  owned by an ancestor of &#64;owner_type.
     * @return The found &#35;GParamSpec, or %NULL if no matching &#35;GParamSpec was found.
    */
    public ParamSpec lookup(@Nonnull ch.bailu.gtk.type.Str param_name, long owner_type, boolean walk_ancestors)  {
        return new ParamSpec(new PointerContainer(JnaParamSpecPool.INST().g_param_spec_pool_lookup(asCPointer(), asCPointerNotNull(param_name), owner_type, walk_ancestors)));
    }

    /**
     * Looks up a &#35;GParamSpec in the pool.
     * @param param_name the name to look for
     * @param owner_type the owner to look for
     * @param walk_ancestors If %TRUE, also try to find a &#35;GParamSpec with &#64;param_name  owned by an ancestor of &#64;owner_type.
     * @return The found &#35;GParamSpec, or %NULL if no matching &#35;GParamSpec was found.
    */
    public ParamSpec lookup(String param_name, long owner_type, boolean walk_ancestors)  {
        return new ParamSpec(new PointerContainer(JnaParamSpecPool.INST().g_param_spec_pool_lookup(asCPointer(), param_name, owner_type, walk_ancestors)));
    }

    /**
     * Removes a &#35;GParamSpec from the pool.
     * @param pspec the &#35;GParamSpec to remove
    */
    public void remove(@Nonnull ParamSpec pspec)  {
        JnaParamSpecPool.INST().g_param_spec_pool_remove(asCPointer(), asCPointerNotNull(pspec));
    }

    /**
     * Creates a new &#35;GParamSpecPool.
     * <br>
     * <br>If &#64;type_prefixing is %TRUE, lookups in the newly created pool will
     * <br>allow to specify the owner as a colon-separated prefix of the
     * <br>property name, like &quot;GtkContainer:border-width&quot;. This feature is
     * <br>deprecated, so you should always set &#64;type_prefixing to %FALSE.
     * @param type_prefixing Whether the pool will support type-prefixed property names.
     * @return a newly allocated &#35;GParamSpecPool.
    */
    public static ParamSpecPool _new(boolean type_prefixing)  {
        return new ParamSpecPool(new PointerContainer(JnaParamSpecPool.INST().g_param_spec_pool_new(type_prefixing)));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:cb-return-value-not-supported:java-type-not-supported:list:[ParameterModel:java-type-not-supported:{G_::{c:GParamSpec**}}:{j:}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
