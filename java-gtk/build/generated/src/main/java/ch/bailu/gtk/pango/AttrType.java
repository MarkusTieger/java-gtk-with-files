/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface AttrType {

    /**
     * does not happen
    */
    int INVALID = 0;

    /**
     * language ([struct&#64;Pango.AttrLanguage])
    */
    int LANGUAGE = 1;

    /**
     * font family name list ([struct&#64;Pango.AttrString])
    */
    int FAMILY = 2;

    /**
     * font slant style ([struct&#64;Pango.AttrInt])
    */
    int STYLE = 3;

    /**
     * font weight ([struct&#64;Pango.AttrInt])
    */
    int WEIGHT = 4;

    /**
     * font variant (normal or small caps) ([struct&#64;Pango.AttrInt])
    */
    int VARIANT = 5;

    /**
     * font stretch ([struct&#64;Pango.AttrInt])
    */
    int STRETCH = 6;

    /**
     * font size in points scaled by %PANGO_SCALE ([struct&#64;Pango.AttrInt])
    */
    int SIZE = 7;

    /**
     * font description ([struct&#64;Pango.AttrFontDesc])
    */
    int FONT_DESC = 8;

    /**
     * foreground color ([struct&#64;Pango.AttrColor])
    */
    int FOREGROUND = 9;

    /**
     * background color ([struct&#64;Pango.AttrColor])
    */
    int BACKGROUND = 10;

    /**
     * whether the text has an underline ([struct&#64;Pango.AttrInt])
    */
    int UNDERLINE = 11;

    /**
     * whether the text is struck-through ([struct&#64;Pango.AttrInt])
    */
    int STRIKETHROUGH = 12;

    /**
     * baseline displacement ([struct&#64;Pango.AttrInt])
    */
    int RISE = 13;

    /**
     * shape ([struct&#64;Pango.AttrShape])
    */
    int SHAPE = 14;

    /**
     * font size scale factor ([struct&#64;Pango.AttrFloat])
    */
    int SCALE = 15;

    /**
     * whether fallback is enabled ([struct&#64;Pango.AttrInt])
    */
    int FALLBACK = 16;

    /**
     * letter spacing ([struct&#64;PangoAttrInt])
    */
    int LETTER_SPACING = 17;

    /**
     * underline color ([struct&#64;Pango.AttrColor])
    */
    int UNDERLINE_COLOR = 18;

    /**
     * strikethrough color ([struct&#64;Pango.AttrColor])
    */
    int STRIKETHROUGH_COLOR = 19;

    /**
     * font size in pixels scaled by %PANGO_SCALE ([struct&#64;Pango.AttrInt])
    */
    int ABSOLUTE_SIZE = 20;

    /**
     * base text gravity ([struct&#64;Pango.AttrInt])
    */
    int GRAVITY = 21;

    /**
     * gravity hint ([struct&#64;Pango.AttrInt])
    */
    int GRAVITY_HINT = 22;

    /**
     * OpenType font features ([struct&#64;Pango.AttrFontFeatures]). Since 1.38
    */
    int FONT_FEATURES = 23;

    /**
     * foreground alpha ([struct&#64;Pango.AttrInt]). Since 1.38
    */
    int FOREGROUND_ALPHA = 24;

    /**
     * background alpha ([struct&#64;Pango.AttrInt]). Since 1.38
    */
    int BACKGROUND_ALPHA = 25;

    /**
     * whether breaks are allowed ([struct&#64;Pango.AttrInt]). Since 1.44
    */
    int ALLOW_BREAKS = 26;

    /**
     * how to render invisible characters ([struct&#64;Pango.AttrInt]). Since 1.44
    */
    int SHOW = 27;

    /**
     * whether to insert hyphens at intra-word line breaks ([struct&#64;Pango.AttrInt]). Since 1.44
    */
    int INSERT_HYPHENS = 28;

    /**
     * whether the text has an overline ([struct&#64;Pango.AttrInt]). Since 1.46
    */
    int OVERLINE = 29;

    /**
     * overline color ([struct&#64;Pango.AttrColor]). Since 1.46
    */
    int OVERLINE_COLOR = 30;

    /**
     * line height factor ([struct&#64;Pango.AttrFloat]). Since: 1.50
    */
    int LINE_HEIGHT = 31;

    /**
     * line height ([struct&#64;Pango.AttrInt]). Since: 1.50
    */
    int ABSOLUTE_LINE_HEIGHT = 32;

    /**
     * 
    */
    int TEXT_TRANSFORM = 33;

    /**
     * override segmentation to classify the range of the attribute as a single word ([struct&#64;Pango.AttrInt]). Since 1.50
    */
    int WORD = 34;

    /**
     * override segmentation to classify the range of the attribute as a single sentence ([struct&#64;Pango.AttrInt]). Since 1.50
    */
    int SENTENCE = 35;

    /**
     * baseline displacement ([struct&#64;Pango.AttrInt]). Since 1.50
    */
    int BASELINE_SHIFT = 36;

    /**
     * font-relative size change ([struct&#64;Pango.AttrInt]). Since 1.50
    */
    int FONT_SCALE = 37;

}

/*
enumeration-type
*/
