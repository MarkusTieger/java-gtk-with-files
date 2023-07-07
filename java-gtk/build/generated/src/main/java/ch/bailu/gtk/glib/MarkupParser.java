/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Any of the fields in &#35;GMarkupParser can be %NULL, in which case they
 * <br>will be ignored. Except for the &#64;error function, any of these callbacks
 * <br>can set an error; in particular the %G_MARKUP_ERROR_UNKNOWN_ELEMENT,
 * <br>%G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE, and %G_MARKUP_ERROR_INVALID_CONTENT
 * <br>errors are intended to be set from these callbacks. If you set an error
 * <br>from a callback, g_markup_parse_context_parse() will report that error
 * <br>back to its caller.
 * <p><a href="https://docs.gtk.org/glib/struct.MarkupParser.html">https://docs.gtk.org/glib/struct.MarkupParser.html</a></p>
*/
public class MarkupParser extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MarkupParser.class.getCanonicalName());
    }

    public MarkupParser(PointerContainer pointer) {
        super(pointer);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:start_element:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:end_element:previous-field-unsupported:[MethodModel:Supported:endElement:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:endElement:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:text:previous-field-unsupported:[MethodModel:Supported:text:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:text:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:passthrough:previous-field-unsupported:[MethodModel:Supported:passthrough:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:passthrough:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:error:previous-field-unsupported:[MethodModel:Supported:error:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:error:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
