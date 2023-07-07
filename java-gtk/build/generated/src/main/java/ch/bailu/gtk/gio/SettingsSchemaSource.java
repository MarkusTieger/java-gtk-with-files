/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This is an opaque structure type.  You may not access it directly.
 * <p><a href="https://docs.gtk.org/gio/struct.SettingsSchemaSource.html">https://docs.gtk.org/gio/struct.SettingsSchemaSource.html</a></p>
*/
public class SettingsSchemaSource extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsSchemaSource.class.getCanonicalName());
    }

    public SettingsSchemaSource(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Attempts to create a new schema source corresponding to the contents
     * <br>of the given directory.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems.
     * <br>
     * <br>The directory should contain a file called `gschemas.compiled` as
     * <br>produced by the [glib-compile-schemas][glib-compile-schemas] tool.
     * <br>
     * <br>If &#64;trusted is %TRUE then `gschemas.compiled` is trusted not to be
     * <br>corrupted. This assumption has a performance advantage, but can result
     * <br>in crashes or inconsistent behaviour in the case of a corrupted file.
     * <br>Generally, you should set &#64;trusted to %TRUE for files installed by the
     * <br>system and to %FALSE for files in the home directory.
     * <br>
     * <br>In either case, an empty file or some types of corruption in the file will
     * <br>result in %G_FILE_ERROR_INVAL being returned.
     * <br>
     * <br>If &#64;parent is non-%NULL then there are two effects.
     * <br>
     * <br>First, if g_settings_schema_source_lookup() is called with the
     * <br>&#64;recursive flag set to %TRUE and the schema can not be found in the
     * <br>source, the lookup will recurse to the parent.
     * <br>
     * <br>Second, any references to other schemas specified within this
     * <br>source (ie: `child` or `extends`) references may be resolved
     * <br>from the &#64;parent.
     * <br>
     * <br>For this second reason, except in very unusual situations, the
     * <br>&#64;parent should probably be given as the default schema source, as
     * <br>returned by g_settings_schema_source_get_default().
     * @param directory the filename of a directory
     * @param parent a &#35;GSettingsSchemaSource, or %NULL
     * @param trusted %TRUE, if the directory is trusted
     * @return 
    */
    public static SettingsSchemaSource newFromDirectorySettingsSchemaSource(@Nonnull ch.bailu.gtk.type.Str directory, @Nullable SettingsSchemaSource parent, boolean trusted) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSettingsSchemaSource.INST().g_settings_schema_source_new_from_directory(asCPointerNotNull(directory), asCPointer(parent), trusted, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("SettingsSchemaSource:newFromDirectory");
        }
        return new SettingsSchemaSource(__self);
    }        
    

    /**
     * Attempts to create a new schema source corresponding to the contents
     * <br>of the given directory.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems.
     * <br>
     * <br>The directory should contain a file called `gschemas.compiled` as
     * <br>produced by the [glib-compile-schemas][glib-compile-schemas] tool.
     * <br>
     * <br>If &#64;trusted is %TRUE then `gschemas.compiled` is trusted not to be
     * <br>corrupted. This assumption has a performance advantage, but can result
     * <br>in crashes or inconsistent behaviour in the case of a corrupted file.
     * <br>Generally, you should set &#64;trusted to %TRUE for files installed by the
     * <br>system and to %FALSE for files in the home directory.
     * <br>
     * <br>In either case, an empty file or some types of corruption in the file will
     * <br>result in %G_FILE_ERROR_INVAL being returned.
     * <br>
     * <br>If &#64;parent is non-%NULL then there are two effects.
     * <br>
     * <br>First, if g_settings_schema_source_lookup() is called with the
     * <br>&#64;recursive flag set to %TRUE and the schema can not be found in the
     * <br>source, the lookup will recurse to the parent.
     * <br>
     * <br>Second, any references to other schemas specified within this
     * <br>source (ie: `child` or `extends`) references may be resolved
     * <br>from the &#64;parent.
     * <br>
     * <br>For this second reason, except in very unusual situations, the
     * <br>&#64;parent should probably be given as the default schema source, as
     * <br>returned by g_settings_schema_source_get_default().
     * @param directory the filename of a directory
     * @param parent a &#35;GSettingsSchemaSource, or %NULL
     * @param trusted %TRUE, if the directory is trusted
     * @return 
    */
    public static SettingsSchemaSource newFromDirectorySettingsSchemaSource(String directory, @Nullable SettingsSchemaSource parent, boolean trusted) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSettingsSchemaSource.INST().g_settings_schema_source_new_from_directory(directory, asCPointer(parent), trusted, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("SettingsSchemaSource:newFromDirectory");
        }
        return new SettingsSchemaSource(__self);
    }        
    

    /**
     * Looks up a schema with the identifier &#64;schema_id in &#64;source.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems or to those who
     * <br>want to introspect the content of schemas.
     * <br>
     * <br>If the schema isn't found directly in &#64;source and &#64;recursive is %TRUE
     * <br>then the parent sources will also be checked.
     * <br>
     * <br>If the schema isn't found, %NULL is returned.
     * @param schema_id a schema ID
     * @param recursive %TRUE if the lookup should be recursive
     * @return a new &#35;GSettingsSchema
    */
    public SettingsSchema lookup(@Nonnull ch.bailu.gtk.type.Str schema_id, boolean recursive)  {
        return new SettingsSchema(new PointerContainer(JnaSettingsSchemaSource.INST().g_settings_schema_source_lookup(asCPointer(), asCPointerNotNull(schema_id), recursive)));
    }

    /**
     * Looks up a schema with the identifier &#64;schema_id in &#64;source.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems or to those who
     * <br>want to introspect the content of schemas.
     * <br>
     * <br>If the schema isn't found directly in &#64;source and &#64;recursive is %TRUE
     * <br>then the parent sources will also be checked.
     * <br>
     * <br>If the schema isn't found, %NULL is returned.
     * @param schema_id a schema ID
     * @param recursive %TRUE if the lookup should be recursive
     * @return a new &#35;GSettingsSchema
    */
    public SettingsSchema lookup(String schema_id, boolean recursive)  {
        return new SettingsSchema(new PointerContainer(JnaSettingsSchemaSource.INST().g_settings_schema_source_lookup(asCPointer(), schema_id, recursive)));
    }

    /**
     * Increase the reference count of &#64;source, returning a new reference.
     * @return a new reference to &#64;source
    */
    public SettingsSchemaSource ref()  {
        return new SettingsSchemaSource(new PointerContainer(JnaSettingsSchemaSource.INST().g_settings_schema_source_ref(asCPointer())));
    }

    /**
     * Decrease the reference count of &#64;source, possibly freeing it.
    */
    public void unref()  {
        JnaSettingsSchemaSource.INST().g_settings_schema_source_unref(asCPointer());
    }

    /**
     * Gets the default system schema source.
     * <br>
     * <br>This function is not required for normal uses of &#35;GSettings but it
     * <br>may be useful to authors of plugin management systems or to those who
     * <br>want to introspect the content of schemas.
     * <br>
     * <br>If no schemas are installed, %NULL will be returned.
     * <br>
     * <br>The returned source may actually consist of multiple schema sources
     * <br>from different directories, depending on which directories were given
     * <br>in `XDG_DATA_DIRS` and `GSETTINGS_SCHEMA_DIR`. For this reason, all
     * <br>lookups performed against the default source should probably be done
     * <br>recursively.
     * @return the default schema source
    */
    public static SettingsSchemaSource getDefault()  {
        return new SettingsSchemaSource(new PointerContainer(JnaSettingsSchemaSource.INST().g_settings_schema_source_get_default()));
    }

    public static long getTypeID() { 
        return JnaSettingsSchemaSource.INST().g_settings_schema_source_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:listSchemas:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]
*/
