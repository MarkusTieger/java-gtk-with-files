/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkPrintContext` encapsulates context information that is required when
 * <br>drawing pages for printing.
 * <br>
 * <br>This includes the cairo context and important parameters like page size
 * <br>and resolution. It also lets you easily create [class&#64;Pango.Layout] and
 * <br>[class&#64;Pango.Context] objects that match the font metrics of the cairo surface.
 * <br>
 * <br>`GtkPrintContext` objects get passed to the
 * <br>[signal&#64;Gtk.PrintOperation::begin-print],
 * <br>[signal&#64;Gtk.PrintOperation::end-print],
 * <br>[signal&#64;Gtk.PrintOperation::request-page-setup] and
 * <br>[signal&#64;Gtk.PrintOperation::draw-page] signals on the
 * <br>[class&#64;Gtk.PrintOperation] object.
 * <br>
 * <br>&#35;&#35; Using GtkPrintContext in a ::draw-page callback
 * <br>
 * <br>```c
 * <br>static void
 * <br>draw_page (GtkPrintOperation *operation,
 * <br>           GtkPrintContext   *context,
 * <br>           int                page_nr)
 * <br>{
 * <br>  cairo_t *cr;
 * <br>  PangoLayout *layout;
 * <br>  PangoFontDescription *desc;
 * <br>
 * <br>  cr = gtk_print_context_get_cairo_context (context);
 * <br>
 * <br>  // Draw a red rectangle, as wide as the paper (inside the margins)
 * <br>  cairo_set_source_rgb (cr, 1.0, 0, 0);
 * <br>  cairo_rectangle (cr, 0, 0, gtk_print_context_get_width (context), 50);
 * <br>
 * <br>  cairo_fill (cr);
 * <br>
 * <br>  // Draw some lines
 * <br>  cairo_move_to (cr, 20, 10);
 * <br>  cairo_line_to (cr, 40, 20);
 * <br>  cairo_arc (cr, 60, 60, 20, 0, M_PI);
 * <br>  cairo_line_to (cr, 80, 20);
 * <br>
 * <br>  cairo_set_source_rgb (cr, 0, 0, 0);
 * <br>  cairo_set_line_width (cr, 5);
 * <br>  cairo_set_line_cap (cr, CAIRO_LINE_CAP_ROUND);
 * <br>  cairo_set_line_join (cr, CAIRO_LINE_JOIN_ROUND);
 * <br>
 * <br>  cairo_stroke (cr);
 * <br>
 * <br>  // Draw some text
 * <br>  layout = gtk_print_context_create_pango_layout (context);
 * <br>  pango_layout_set_text (layout, &quot;Hello World! Printing is easy&quot;, -1);
 * <br>  desc = pango_font_description_from_string (&quot;sans 28&quot;);
 * <br>  pango_layout_set_font_description (layout, desc);
 * <br>  pango_font_description_free (desc);
 * <br>
 * <br>  cairo_move_to (cr, 30, 20);
 * <br>  pango_cairo_layout_path (cr, layout);
 * <br>
 * <br>  // Font Outline
 * <br>  cairo_set_source_rgb (cr, 0.93, 1.0, 0.47);
 * <br>  cairo_set_line_width (cr, 0.5);
 * <br>  cairo_stroke_preserve (cr);
 * <br>
 * <br>  // Font Fill
 * <br>  cairo_set_source_rgb (cr, 0, 0.0, 1.0);
 * <br>  cairo_fill (cr);
 * <br>
 * <br>  g_object_unref (layout);
 * <br>}
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.PrintContext.html">https://docs.gtk.org/gtk4/class.PrintContext.html</a></p>
*/
public class PrintContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintContext.class.getCanonicalName());
    }

    public PrintContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `PangoContext` that can be used with the
     * <br>`GtkPrintContext`.
     * @return a new Pango context for &#64;context
    */
    public ch.bailu.gtk.pango.Context createPangoContext()  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaPrintContext.INST().gtk_print_context_create_pango_context(asCPointer())));
    }

    /**
     * Creates a new `PangoLayout` that is suitable for use
     * <br>with the `GtkPrintContext`.
     * @return a new Pango layout for &#64;context
    */
    public ch.bailu.gtk.pango.Layout createPangoLayout()  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaPrintContext.INST().gtk_print_context_create_pango_layout(asCPointer())));
    }

    /**
     * Obtains the cairo context that is associated with the
     * <br>`GtkPrintContext`.
     * @return the cairo context of &#64;context
    */
    public ch.bailu.gtk.cairo.Context getCairoContext()  {
        return new ch.bailu.gtk.cairo.Context(new PointerContainer(JnaPrintContext.INST().gtk_print_context_get_cairo_context(asCPointer())));
    }

    /**
     * Obtains the horizontal resolution of the `GtkPrintContext`,
     * <br>in dots per inch.
     * @return the horizontal resolution of &#64;context
    */
    public double getDpiX()  {
        return JnaPrintContext.INST().gtk_print_context_get_dpi_x(asCPointer());
    }

    /**
     * Obtains the vertical resolution of the `GtkPrintContext`,
     * <br>in dots per inch.
     * @return the vertical resolution of &#64;context
    */
    public double getDpiY()  {
        return JnaPrintContext.INST().gtk_print_context_get_dpi_y(asCPointer());
    }

    /**
     * Obtains the height of the `GtkPrintContext`, in pixels.
     * @return the height of &#64;context
    */
    public double getHeight()  {
        return JnaPrintContext.INST().gtk_print_context_get_height(asCPointer());
    }

    /**
     * Obtains the `GtkPageSetup` that determines the page
     * <br>dimensions of the `GtkPrintContext`.
     * @return the page setup of &#64;context
    */
    public PageSetup getPageSetup()  {
        return new PageSetup(new PointerContainer(JnaPrintContext.INST().gtk_print_context_get_page_setup(asCPointer())));
    }

    /**
     * Returns a `PangoFontMap` that is suitable for use
     * <br>with the `GtkPrintContext`.
     * @return the font map of &#64;context
    */
    public ch.bailu.gtk.pango.FontMap getPangoFontmap()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaPrintContext.INST().gtk_print_context_get_pango_fontmap(asCPointer())));
    }

    /**
     * Obtains the width of the `GtkPrintContext`, in pixels.
     * @return the width of &#64;context
    */
    public double getWidth()  {
        return JnaPrintContext.INST().gtk_print_context_get_width(asCPointer());
    }

    /**
     * Sets a new cairo context on a print context.
     * <br>
     * <br>This function is intended to be used when implementing
     * <br>an internal print preview, it is not needed for printing,
     * <br>since GTK itself creates a suitable cairo context in that
     * <br>case.
     * @param cr the cairo context
     * @param dpi_x the horizontal resolution to use with &#64;cr
     * @param dpi_y the vertical resolution to use with &#64;cr
    */
    public void setCairoContext(@Nonnull ch.bailu.gtk.cairo.Context cr, double dpi_x, double dpi_y)  {
        JnaPrintContext.INST().gtk_print_context_set_cairo_context(asCPointer(), asCPointerNotNull(cr), dpi_x, dpi_y);
    }

    public static long getTypeID() { 
        return JnaPrintContext.INST().gtk_print_context_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:getHardMargins:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
