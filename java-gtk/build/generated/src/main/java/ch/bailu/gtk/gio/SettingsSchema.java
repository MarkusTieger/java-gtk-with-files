/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GSettingsSchemaSource and &#35;GSettingsSchema APIs provide a
 * <br>mechanism for advanced control over the loading of schemas and a
 * <br>mechanism for introspecting their content.
 * <br>
 * <br>Plugin loading systems that wish to provide plugins a way to access
 * <br>settings face the problem of how to make the schemas for these
 * <br>settings visible to GSettings.  Typically, a plugin will want to ship
 * <br>the schema along with itself and it won't be installed into the
 * <br>standard system directories for schemas.
 * <br>
 * <br>&#35;GSettingsSchemaSource provides a mechanism for dealing with this by
 * <br>allowing the creation of a new 'schema source' from which schemas can
 * <br>be acquired.  This schema source can then become part of the metadata
 * <br>associated with the plugin and queried whenever the plugin requires
 * <br>access to some settings.
 * <br>
 * <br>Consider the following example:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * typedef struct
 * {
 *    ...
 *    GSettingsSchemaSource *schema_source;
 *    ...
 * } Plugin;
 * 
 * Plugin *
 * initialise_plugin (const gchar *dir)
 * {
 *   Plugin *plugin;
 * 
 *   ...
 * 
 *   plugin-&gt;schema_source =
 *     g_settings_schema_source_new_from_directory (dir,
 *       g_settings_schema_source_get_default (), FALSE, NULL);
 * 
 *   ...
 * 
 *   return plugin;
 * }
 * 
 * ...
 * 
 * GSettings *
 * plugin_get_settings (Plugin      *plugin,
 *                      const gchar *schema_id)
 * {
 *   GSettingsSchema *schema;
 * 
 *   if (schema_id == NULL)
 *     schema_id = plugin-&gt;identifier;
 * 
 *   schema = g_settings_schema_source_lookup (plugin-&gt;schema_source,
 *                                             schema_id, FALSE);
 * 
 *   if (schema == NULL)
 *     {
 *       ... disable the plugin or abort, etc ...
 *     }
 * 
 *   return g_settings_new_full (schema, NULL, NULL);
 * }
 * </pre>
 * <br>
 * <br>The code above shows how hooks should be added to the code that
 * <br>initialises (or enables) the plugin to create the schema source and
 * <br>how an API can be added to the plugin system to provide a convenient
 * <br>way for the plugin to access its settings, using the schemas that it
 * <br>ships.
 * <br>
 * <br>From the standpoint of the plugin, it would need to ensure that it
 * <br>ships a gschemas.compiled file as part of itself, and then simply do
 * <br>the following:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * {
 *   GSettings *settings;
 *   gint some_value;
 * 
 *   settings = plugin_get_settings (self, NULL);
 *   some_value = g_settings_get_int (settings, &quot;some-value&quot;);
 *   ...
 * }
 * </pre>
 * <br>
 * <br>It's also possible that the plugin system expects the schema source
 * <br>files (ie: .gschema.xml files) instead of a gschemas.compiled file.
 * <br>In that case, the plugin loading system must compile the schemas for
 * <br>itself before attempting to create the settings source.
 * <p><a href="https://docs.gtk.org/gio/struct.SettingsSchema.html">https://docs.gtk.org/gio/struct.SettingsSchema.html</a></p>
*/
public class SettingsSchema extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsSchema.class.getCanonicalName());
    }

    public SettingsSchema(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get the ID of &#64;schema.
     * @return the ID
    */
    public ch.bailu.gtk.type.Str getId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettingsSchema.INST().g_settings_schema_get_id(asCPointer())));
    }

    /**
     * Gets the key named &#64;name from &#64;schema.
     * <br>
     * <br>It is a programmer error to request a key that does not exist.  See
     * <br>g_settings_schema_list_keys().
     * @param name the name of a key
     * @return the &#35;GSettingsSchemaKey for &#64;name
    */
    public SettingsSchemaKey getKey(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new SettingsSchemaKey(new PointerContainer(JnaSettingsSchema.INST().g_settings_schema_get_key(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets the key named &#64;name from &#64;schema.
     * <br>
     * <br>It is a programmer error to request a key that does not exist.  See
     * <br>g_settings_schema_list_keys().
     * @param name the name of a key
     * @return the &#35;GSettingsSchemaKey for &#64;name
    */
    public SettingsSchemaKey getKey(String name)  {
        return new SettingsSchemaKey(new PointerContainer(JnaSettingsSchema.INST().g_settings_schema_get_key(asCPointer(), name)));
    }

    /**
     * Gets the path associated with &#64;schema, or %NULL.
     * <br>
     * <br>Schemas may be single-instance or relocatable.  Single-instance
     * <br>schemas correspond to exactly one set of keys in the backend
     * <br>database: those located at the path returned by this function.
     * <br>
     * <br>Relocatable schemas can be referenced by other schemas and can
     * <br>therefore describe multiple sets of keys at different locations.  For
     * <br>relocatable schemas, this function will return %NULL.
     * @return the path of the schema, or %NULL
    */
    public ch.bailu.gtk.type.Str getPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettingsSchema.INST().g_settings_schema_get_path(asCPointer())));
    }

    /**
     * Checks if &#64;schema has a key named &#64;name.
     * @param name the name of a key
     * @return %TRUE if such a key exists
    */
    public boolean hasKey(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaSettingsSchema.INST().g_settings_schema_has_key(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Checks if &#64;schema has a key named &#64;name.
     * @param name the name of a key
     * @return %TRUE if such a key exists
    */
    public boolean hasKey(String name)  {
        return JnaSettingsSchema.INST().g_settings_schema_has_key(asCPointer(), name);
    }

    /**
     * Increase the reference count of &#64;schema, returning a new reference.
     * @return a new reference to &#64;schema
    */
    public SettingsSchema ref()  {
        return new SettingsSchema(new PointerContainer(JnaSettingsSchema.INST().g_settings_schema_ref(asCPointer())));
    }

    /**
     * Decrease the reference count of &#64;schema, possibly freeing it.
    */
    public void unref()  {
        JnaSettingsSchema.INST().g_settings_schema_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaSettingsSchema.INST().g_settings_schema_get_type(); 
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

[MethodModel:cb-return-value-not-supported:listChildren:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:cb-return-value-not-supported:listKeys:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
*/
