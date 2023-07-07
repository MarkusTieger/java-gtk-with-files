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
public interface Script {

    /**
     * a value never returned from pango_script_for_unichar()
    */
    int INVALID_CODE = -1;

    /**
     * a character used by multiple different scripts
    */
    int COMMON = 0;

    /**
     * a mark glyph that takes its script from the
     * <br>base glyph to which it is attached
    */
    int INHERITED = 1;

    /**
     * Arabic
    */
    int ARABIC = 2;

    /**
     * Armenian
    */
    int ARMENIAN = 3;

    /**
     * Bengali
    */
    int BENGALI = 4;

    /**
     * Bopomofo
    */
    int BOPOMOFO = 5;

    /**
     * Cherokee
    */
    int CHEROKEE = 6;

    /**
     * Coptic
    */
    int COPTIC = 7;

    /**
     * Cyrillic
    */
    int CYRILLIC = 8;

    /**
     * Deseret
    */
    int DESERET = 9;

    /**
     * Devanagari
    */
    int DEVANAGARI = 10;

    /**
     * Ethiopic
    */
    int ETHIOPIC = 11;

    /**
     * Georgian
    */
    int GEORGIAN = 12;

    /**
     * Gothic
    */
    int GOTHIC = 13;

    /**
     * Greek
    */
    int GREEK = 14;

    /**
     * Gujarati
    */
    int GUJARATI = 15;

    /**
     * Gurmukhi
    */
    int GURMUKHI = 16;

    /**
     * Han
    */
    int HAN = 17;

    /**
     * Hangul
    */
    int HANGUL = 18;

    /**
     * Hebrew
    */
    int HEBREW = 19;

    /**
     * Hiragana
    */
    int HIRAGANA = 20;

    /**
     * Kannada
    */
    int KANNADA = 21;

    /**
     * Katakana
    */
    int KATAKANA = 22;

    /**
     * Khmer
    */
    int KHMER = 23;

    /**
     * Lao
    */
    int LAO = 24;

    /**
     * Latin
    */
    int LATIN = 25;

    /**
     * Malayalam
    */
    int MALAYALAM = 26;

    /**
     * Mongolian
    */
    int MONGOLIAN = 27;

    /**
     * Myanmar
    */
    int MYANMAR = 28;

    /**
     * Ogham
    */
    int OGHAM = 29;

    /**
     * Old Italic
    */
    int OLD_ITALIC = 30;

    /**
     * Oriya
    */
    int ORIYA = 31;

    /**
     * Runic
    */
    int RUNIC = 32;

    /**
     * Sinhala
    */
    int SINHALA = 33;

    /**
     * Syriac
    */
    int SYRIAC = 34;

    /**
     * Tamil
    */
    int TAMIL = 35;

    /**
     * Telugu
    */
    int TELUGU = 36;

    /**
     * Thaana
    */
    int THAANA = 37;

    /**
     * Thai
    */
    int THAI = 38;

    /**
     * Tibetan
    */
    int TIBETAN = 39;

    /**
     * Canadian Aboriginal
    */
    int CANADIAN_ABORIGINAL = 40;

    /**
     * Yi
    */
    int YI = 41;

    /**
     * Tagalog
    */
    int TAGALOG = 42;

    /**
     * Hanunoo
    */
    int HANUNOO = 43;

    /**
     * Buhid
    */
    int BUHID = 44;

    /**
     * Tagbanwa
    */
    int TAGBANWA = 45;

    /**
     * Braille
    */
    int BRAILLE = 46;

    /**
     * Cypriot
    */
    int CYPRIOT = 47;

    /**
     * Limbu
    */
    int LIMBU = 48;

    /**
     * Osmanya
    */
    int OSMANYA = 49;

    /**
     * Shavian
    */
    int SHAVIAN = 50;

    /**
     * Linear B
    */
    int LINEAR_B = 51;

    /**
     * Tai Le
    */
    int TAI_LE = 52;

    /**
     * Ugaritic
    */
    int UGARITIC = 53;

    /**
     * New Tai Lue. Since 1.10
    */
    int NEW_TAI_LUE = 54;

    /**
     * Buginese. Since 1.10
    */
    int BUGINESE = 55;

    /**
     * Glagolitic. Since 1.10
    */
    int GLAGOLITIC = 56;

    /**
     * Tifinagh. Since 1.10
    */
    int TIFINAGH = 57;

    /**
     * Syloti Nagri. Since 1.10
    */
    int SYLOTI_NAGRI = 58;

    /**
     * Old Persian. Since 1.10
    */
    int OLD_PERSIAN = 59;

    /**
     * Kharoshthi. Since 1.10
    */
    int KHAROSHTHI = 60;

    /**
     * an unassigned code point. Since 1.14
    */
    int UNKNOWN = 61;

    /**
     * Balinese. Since 1.14
    */
    int BALINESE = 62;

    /**
     * Cuneiform. Since 1.14
    */
    int CUNEIFORM = 63;

    /**
     * Phoenician. Since 1.14
    */
    int PHOENICIAN = 64;

    /**
     * Phags-pa. Since 1.14
    */
    int PHAGS_PA = 65;

    /**
     * N'Ko. Since 1.14
    */
    int NKO = 66;

    /**
     * Kayah Li. Since 1.20.1
    */
    int KAYAH_LI = 67;

    /**
     * Lepcha. Since 1.20.1
    */
    int LEPCHA = 68;

    /**
     * Rejang. Since 1.20.1
    */
    int REJANG = 69;

    /**
     * Sundanese. Since 1.20.1
    */
    int SUNDANESE = 70;

    /**
     * Saurashtra. Since 1.20.1
    */
    int SAURASHTRA = 71;

    /**
     * Cham. Since 1.20.1
    */
    int CHAM = 72;

    /**
     * Ol Chiki. Since 1.20.1
    */
    int OL_CHIKI = 73;

    /**
     * Vai. Since 1.20.1
    */
    int VAI = 74;

    /**
     * Carian. Since 1.20.1
    */
    int CARIAN = 75;

    /**
     * Lycian. Since 1.20.1
    */
    int LYCIAN = 76;

    /**
     * Lydian. Since 1.20.1
    */
    int LYDIAN = 77;

    /**
     * Batak. Since 1.32
    */
    int BATAK = 78;

    /**
     * Brahmi. Since 1.32
    */
    int BRAHMI = 79;

    /**
     * Mandaic. Since 1.32
    */
    int MANDAIC = 80;

    /**
     * Chakma. Since: 1.32
    */
    int CHAKMA = 81;

    /**
     * Meroitic Cursive. Since: 1.32
    */
    int MEROITIC_CURSIVE = 82;

    /**
     * Meroitic Hieroglyphs. Since: 1.32
    */
    int MEROITIC_HIEROGLYPHS = 83;

    /**
     * Miao. Since: 1.32
    */
    int MIAO = 84;

    /**
     * Sharada. Since: 1.32
    */
    int SHARADA = 85;

    /**
     * Sora Sompeng. Since: 1.32
    */
    int SORA_SOMPENG = 86;

    /**
     * Takri. Since: 1.32
    */
    int TAKRI = 87;

    /**
     * Bassa. Since: 1.40
    */
    int BASSA_VAH = 88;

    /**
     * Caucasian Albanian. Since: 1.40
    */
    int CAUCASIAN_ALBANIAN = 89;

    /**
     * Duployan. Since: 1.40
    */
    int DUPLOYAN = 90;

    /**
     * Elbasan. Since: 1.40
    */
    int ELBASAN = 91;

    /**
     * Grantha. Since: 1.40
    */
    int GRANTHA = 92;

    /**
     * Kjohki. Since: 1.40
    */
    int KHOJKI = 93;

    /**
     * Khudawadi, Sindhi. Since: 1.40
    */
    int KHUDAWADI = 94;

    /**
     * Linear A. Since: 1.40
    */
    int LINEAR_A = 95;

    /**
     * Mahajani. Since: 1.40
    */
    int MAHAJANI = 96;

    /**
     * Manichaean. Since: 1.40
    */
    int MANICHAEAN = 97;

    /**
     * Mende Kikakui. Since: 1.40
    */
    int MENDE_KIKAKUI = 98;

    /**
     * Modi. Since: 1.40
    */
    int MODI = 99;

    /**
     * Mro. Since: 1.40
    */
    int MRO = 100;

    /**
     * Nabataean. Since: 1.40
    */
    int NABATAEAN = 101;

    /**
     * Old North Arabian. Since: 1.40
    */
    int OLD_NORTH_ARABIAN = 102;

    /**
     * Old Permic. Since: 1.40
    */
    int OLD_PERMIC = 103;

    /**
     * Pahawh Hmong. Since: 1.40
    */
    int PAHAWH_HMONG = 104;

    /**
     * Palmyrene. Since: 1.40
    */
    int PALMYRENE = 105;

    /**
     * Pau Cin Hau. Since: 1.40
    */
    int PAU_CIN_HAU = 106;

    /**
     * Psalter Pahlavi. Since: 1.40
    */
    int PSALTER_PAHLAVI = 107;

    /**
     * Siddham. Since: 1.40
    */
    int SIDDHAM = 108;

    /**
     * Tirhuta. Since: 1.40
    */
    int TIRHUTA = 109;

    /**
     * Warang Citi. Since: 1.40
    */
    int WARANG_CITI = 110;

    /**
     * Ahom. Since: 1.40
    */
    int AHOM = 111;

    /**
     * Anatolian Hieroglyphs. Since: 1.40
    */
    int ANATOLIAN_HIEROGLYPHS = 112;

    /**
     * Hatran. Since: 1.40
    */
    int HATRAN = 113;

    /**
     * Multani. Since: 1.40
    */
    int MULTANI = 114;

    /**
     * Old Hungarian. Since: 1.40
    */
    int OLD_HUNGARIAN = 115;

    /**
     * Signwriting. Since: 1.40
    */
    int SIGNWRITING = 116;

}

/*
enumeration-type
*/
