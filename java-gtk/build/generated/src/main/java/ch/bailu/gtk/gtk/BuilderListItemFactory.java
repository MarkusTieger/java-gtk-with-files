/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBuilderListItemFactory` is a `GtkListItemFactory` that creates
 * <br>widgets by instantiating `GtkBuilder` UI templates.
 * <br>
 * <br>The templates must be extending `GtkListItem`, and typically use
 * <br>`GtkExpression`s to obtain data from the items in the model.
 * <br>
 * <br>Example:
 * <br>```xml
 * <br>  &lt;interface&gt;
 * <br>    &lt;template class=&quot;GtkListItem&quot;&gt;
 * <br>      &lt;property name=&quot;child&quot;&gt;
 * <br>        &lt;object class=&quot;GtkLabel&quot;&gt;
 * <br>          &lt;property name=&quot;xalign&quot;&gt;0&lt;/property&gt;
 * <br>          &lt;binding name=&quot;label&quot;&gt;
 * <br>            &lt;lookup name=&quot;name&quot; type=&quot;SettingsKey&quot;&gt;
 * <br>              &lt;lookup name=&quot;item&quot;&gt;GtkListItem&lt;/lookup&gt;
 * <br>            &lt;/lookup&gt;
 * <br>          &lt;/binding&gt;
 * <br>        &lt;/object&gt;
 * <br>      &lt;/property&gt;
 * <br>    &lt;/template&gt;
 * <br>  &lt;/interface&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.BuilderListItemFactory.html">https://docs.gtk.org/gtk4/class.BuilderListItemFactory.html</a></p>
*/
public class BuilderListItemFactory extends ListItemFactory {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuilderListItemFactory.class.getCanonicalName());
    }

    public BuilderListItemFactory(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * <br>using &#64;bytes as the data to pass to `GtkBuilder`.
     * @param scope A scope to use when instantiating
     * @param bytes the `GBytes` containing the ui file to instantiate
     * @return a new `GtkBuilderListItemFactory`
    */
    public static BuilderListItemFactory newFromBytesBuilderListItemFactory(@Nullable BuilderScope scope, @Nonnull ch.bailu.gtk.glib.Bytes bytes)  {
        PointerContainer __self = cast(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_new_from_bytes(asCPointer(scope), asCPointerNotNull(bytes)));
        if (__self.isNull()) {
            throw new NullPointerException("BuilderListItemFactory:newFromBytes");
        }
        return new BuilderListItemFactory(__self);
    }        
    

    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * <br>using data read from the given &#64;resource_path to pass to `GtkBuilder`.
     * @param scope A scope to use when instantiating
     * @param resource_path valid path to a resource that contains the data
     * @return a new `GtkBuilderListItemFactory`
    */
    public static BuilderListItemFactory newFromResourceBuilderListItemFactory(@Nullable BuilderScope scope, @Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_new_from_resource(asCPointer(scope), asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("BuilderListItemFactory:newFromResource");
        }
        return new BuilderListItemFactory(__self);
    }        
    

    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * <br>using data read from the given &#64;resource_path to pass to `GtkBuilder`.
     * @param scope A scope to use when instantiating
     * @param resource_path valid path to a resource that contains the data
     * @return a new `GtkBuilderListItemFactory`
    */
    public static BuilderListItemFactory newFromResourceBuilderListItemFactory(@Nullable BuilderScope scope, String resource_path)  {
        PointerContainer __self = cast(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_new_from_resource(asCPointer(scope), resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("BuilderListItemFactory:newFromResource");
        }
        return new BuilderListItemFactory(__self);
    }        
    

    /**
     * Gets the data used as the `GtkBuilder` UI template for constructing
     * <br>listitems.
     * @return The `GtkBuilder` data
    */
    public ch.bailu.gtk.glib.Bytes getBytes()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_get_bytes(asCPointer())));
    }

    /**
     * If the data references a resource, gets the path of that resource.
     * @return The path to the resource
    */
    public ch.bailu.gtk.type.Str getResource()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_get_resource(asCPointer())));
    }

    /**
     * Gets the scope used when constructing listitems.
     * @return The scope used when constructing listitems
    */
    public BuilderScope getScope()  {
        return new BuilderScope(new PointerContainer(JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_get_scope(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaBuilderListItemFactory.INST().gtk_builder_list_item_factory_get_type(); 
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
