/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAnalysis` structure stores information about
 * <br>the properties of a segment of text.
 * <p><a href="https://docs.gtk.org/Pango/struct.Analysis.html">https://docs.gtk.org/Pango/struct.Analysis.html</a></p>
*/
public class Analysis extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Analysis.class.getCanonicalName());
    }

    public Analysis(PointerContainer pointer) {
        super(pointer);
    }

    public Analysis() {
        super(cast(JnaAnalysis.allocateStructure()));
    }

    private JnaAnalysis.Fields _fields;
    
    JnaAnalysis.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAnalysis.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * unused, reserved
    */
    public static final String SHAPE_ENGINE = "shape_engine";

    /**
     * unused, reserved
    */
    public void setFieldShapeEngine(ch.bailu.gtk.type.Pointer shape_engine) {
        toFields().shape_engine = shape_engine.asCPointer();
        toFields().writeField(SHAPE_ENGINE);
    }

    /**
     * unused, reserved
    */
    public ch.bailu.gtk.type.Pointer getFieldShapeEngine() {
       toFields().readField(SHAPE_ENGINE);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().shape_engine));
    } 

    /**
     * unused, reserved
    */
    public static final String LANG_ENGINE = "lang_engine";

    /**
     * unused, reserved
    */
    public void setFieldLangEngine(ch.bailu.gtk.type.Pointer lang_engine) {
        toFields().lang_engine = lang_engine.asCPointer();
        toFields().writeField(LANG_ENGINE);
    }

    /**
     * unused, reserved
    */
    public ch.bailu.gtk.type.Pointer getFieldLangEngine() {
       toFields().readField(LANG_ENGINE);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().lang_engine));
    } 

    /**
     * the font for this segment.
    */
    public static final String FONT = "font";

    /**
     * the font for this segment.
    */
    public void setFieldFont(Font font) {
        toFields().font = font.asCPointer();
        toFields().writeField(FONT);
    }

    /**
     * the font for this segment.
    */
    public Font getFieldFont() {
       toFields().readField(FONT);
       return new Font(new PointerContainer(toFields().font));
    } 

    /**
     * the bidirectional level for this segment.
    */
    public static final String LEVEL = "level";

    /**
     * the bidirectional level for this segment.
    */
    public void setFieldLevel(int level) {
        toFields().level = level;
        toFields().writeField(LEVEL);
    }

    /**
     * the bidirectional level for this segment.
    */
    public int getFieldLevel() {
       toFields().readField(LEVEL);
       return toFields().level;
    } 

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
    */
    public static final String GRAVITY = "gravity";

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
    */
    public void setFieldGravity(int gravity) {
        toFields().gravity = gravity;
        toFields().writeField(GRAVITY);
    }

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
    */
    public int getFieldGravity() {
       toFields().readField(GRAVITY);
       return toFields().gravity;
    } 

    /**
     * boolean flags for this segment (Since: 1.16).
    */
    public static final String FLAGS = "flags";

    /**
     * boolean flags for this segment (Since: 1.16).
    */
    public void setFieldFlags(int flags) {
        toFields().flags = flags;
        toFields().writeField(FLAGS);
    }

    /**
     * boolean flags for this segment (Since: 1.16).
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
    */
    public static final String SCRIPT = "script";

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
    */
    public void setFieldScript(int script) {
        toFields().script = script;
        toFields().writeField(SCRIPT);
    }

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
    */
    public int getFieldScript() {
       toFields().readField(SCRIPT);
       return toFields().script;
    } 

    /**
     * the detected language for this segment.
    */
    public static final String LANGUAGE = "language";

    /**
     * the detected language for this segment.
    */
    public void setFieldLanguage(Language language) {
        toFields().language = language.asCPointer();
        toFields().writeField(LANGUAGE);
    }

    /**
     * the detected language for this segment.
    */
    public Language getFieldLanguage() {
       toFields().readField(LANGUAGE);
       return new Language(new PointerContainer(toFields().language));
    } 

    /**
     * extra attributes for this segment.
    */
    public static final String EXTRA_ATTRS = "extra_attrs";

    /**
     * extra attributes for this segment.
    */
    public void setFieldExtraAttrs(ch.bailu.gtk.glib.SList extra_attrs) {
        toFields().extra_attrs = extra_attrs.asCPointer();
        toFields().writeField(EXTRA_ATTRS);
    }

    /**
     * extra attributes for this segment.
    */
    public ch.bailu.gtk.glib.SList getFieldExtraAttrs() {
       toFields().readField(EXTRA_ATTRS);
       return new ch.bailu.gtk.glib.SList(new PointerContainer(toFields().extra_attrs));
    } 

}

/*
record-type
all-fields-supported
*/
