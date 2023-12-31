/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GStaticResource is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/gio/struct.StaticResource.html">https://docs.gtk.org/gio/struct.StaticResource.html</a></p>
*/
public class StaticResource extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StaticResource.class.getCanonicalName());
    }

    public StaticResource(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Finalized a GResource initialized by g_static_resource_init().
     * <br>
     * <br>This is normally used by code generated by
     * <br>[glib-compile-resources][glib-compile-resources]
     * <br>and is not typically used by other code.
    */
    public void fini()  {
        JnaStaticResource.INST().g_static_resource_fini(asCPointer());
    }

    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     * <br>
     * <br>This is normally used by code generated by
     * <br>[glib-compile-resources][glib-compile-resources]
     * <br>and is not typically used by other code.
     * @return a &#35;GResource
    */
    public Resource getResource()  {
        return new Resource(new PointerContainer(JnaStaticResource.INST().g_static_resource_get_resource(asCPointer())));
    }

    /**
     * Initializes a GResource from static data using a
     * <br>GStaticResource.
     * <br>
     * <br>This is normally used by code generated by
     * <br>[glib-compile-resources][glib-compile-resources]
     * <br>and is not typically used by other code.
    */
    public void init()  {
        JnaStaticResource.INST().g_static_resource_init(asCPointer());
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:data:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]

[FieldModel:data_len:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:resource:previous-field-unsupported:{Gg:Resource:{c:GResource*}}:{j:long}]

[FieldModel:next:previous-field-unsupported:{Gg:StaticResource:{c:GStaticResource*}}:{j:long}]

[FieldModel:padding:previous-field-unsupported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
