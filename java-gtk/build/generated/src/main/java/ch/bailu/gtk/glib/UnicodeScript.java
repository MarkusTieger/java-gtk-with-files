/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface UnicodeScript {

    /**
     * a value never returned from g_unichar_get_script()
    */
    int INVALID_CODE = -1;

    /**
     * a character used by multiple different scripts
    */
    int COMMON = 0;

    /**
     * a mark glyph that takes its script from the
     * <br>                              base glyph to which it is attached
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
     * New Tai Lue
    */
    int NEW_TAI_LUE = 54;

    /**
     * Buginese
    */
    int BUGINESE = 55;

    /**
     * Glagolitic
    */
    int GLAGOLITIC = 56;

    /**
     * Tifinagh
    */
    int TIFINAGH = 57;

    /**
     * Syloti Nagri
    */
    int SYLOTI_NAGRI = 58;

    /**
     * Old Persian
    */
    int OLD_PERSIAN = 59;

    /**
     * Kharoshthi
    */
    int KHAROSHTHI = 60;

    /**
     * an unassigned code point
    */
    int UNKNOWN = 61;

    /**
     * Balinese
    */
    int BALINESE = 62;

    /**
     * Cuneiform
    */
    int CUNEIFORM = 63;

    /**
     * Phoenician
    */
    int PHOENICIAN = 64;

    /**
     * Phags-pa
    */
    int PHAGS_PA = 65;

    /**
     * N'Ko
    */
    int NKO = 66;

    /**
     * Kayah Li. Since 2.16.3
    */
    int KAYAH_LI = 67;

    /**
     * Lepcha. Since 2.16.3
    */
    int LEPCHA = 68;

    /**
     * Rejang. Since 2.16.3
    */
    int REJANG = 69;

    /**
     * Sundanese. Since 2.16.3
    */
    int SUNDANESE = 70;

    /**
     * Saurashtra. Since 2.16.3
    */
    int SAURASHTRA = 71;

    /**
     * Cham. Since 2.16.3
    */
    int CHAM = 72;

    /**
     * Ol Chiki. Since 2.16.3
    */
    int OL_CHIKI = 73;

    /**
     * Vai. Since 2.16.3
    */
    int VAI = 74;

    /**
     * Carian. Since 2.16.3
    */
    int CARIAN = 75;

    /**
     * Lycian. Since 2.16.3
    */
    int LYCIAN = 76;

    /**
     * Lydian. Since 2.16.3
    */
    int LYDIAN = 77;

    /**
     * Avestan. Since 2.26
    */
    int AVESTAN = 78;

    /**
     * Bamum. Since 2.26
    */
    int BAMUM = 79;

    /**
     * Egyptian Hieroglpyhs. Since 2.26
    */
    int EGYPTIAN_HIEROGLYPHS = 80;

    /**
     * Imperial Aramaic. Since 2.26
    */
    int IMPERIAL_ARAMAIC = 81;

    /**
     * Inscriptional Pahlavi. Since 2.26
    */
    int INSCRIPTIONAL_PAHLAVI = 82;

    /**
     * Inscriptional Parthian. Since 2.26
    */
    int INSCRIPTIONAL_PARTHIAN = 83;

    /**
     * Javanese. Since 2.26
    */
    int JAVANESE = 84;

    /**
     * Kaithi. Since 2.26
    */
    int KAITHI = 85;

    /**
     * Lisu. Since 2.26
    */
    int LISU = 86;

    /**
     * Meetei Mayek. Since 2.26
    */
    int MEETEI_MAYEK = 87;

    /**
     * Old South Arabian. Since 2.26
    */
    int OLD_SOUTH_ARABIAN = 88;

    /**
     * Old Turkic. Since 2.28
    */
    int OLD_TURKIC = 89;

    /**
     * Samaritan. Since 2.26
    */
    int SAMARITAN = 90;

    /**
     * Tai Tham. Since 2.26
    */
    int TAI_THAM = 91;

    /**
     * Tai Viet. Since 2.26
    */
    int TAI_VIET = 92;

    /**
     * Batak. Since 2.28
    */
    int BATAK = 93;

    /**
     * Brahmi. Since 2.28
    */
    int BRAHMI = 94;

    /**
     * Mandaic. Since 2.28
    */
    int MANDAIC = 95;

    /**
     * Chakma. Since: 2.32
    */
    int CHAKMA = 96;

    /**
     * Meroitic Cursive. Since: 2.32
    */
    int MEROITIC_CURSIVE = 97;

    /**
     * Meroitic Hieroglyphs. Since: 2.32
    */
    int MEROITIC_HIEROGLYPHS = 98;

    /**
     * Miao. Since: 2.32
    */
    int MIAO = 99;

    /**
     * Sharada. Since: 2.32
    */
    int SHARADA = 100;

    /**
     * Sora Sompeng. Since: 2.32
    */
    int SORA_SOMPENG = 101;

    /**
     * Takri. Since: 2.32
    */
    int TAKRI = 102;

    /**
     * Bassa. Since: 2.42
    */
    int BASSA_VAH = 103;

    /**
     * Caucasian Albanian. Since: 2.42
    */
    int CAUCASIAN_ALBANIAN = 104;

    /**
     * Duployan. Since: 2.42
    */
    int DUPLOYAN = 105;

    /**
     * Elbasan. Since: 2.42
    */
    int ELBASAN = 106;

    /**
     * Grantha. Since: 2.42
    */
    int GRANTHA = 107;

    /**
     * Kjohki. Since: 2.42
    */
    int KHOJKI = 108;

    /**
     * Khudawadi, Sindhi. Since: 2.42
    */
    int KHUDAWADI = 109;

    /**
     * Linear A. Since: 2.42
    */
    int LINEAR_A = 110;

    /**
     * Mahajani. Since: 2.42
    */
    int MAHAJANI = 111;

    /**
     * Manichaean. Since: 2.42
    */
    int MANICHAEAN = 112;

    /**
     * Mende Kikakui. Since: 2.42
    */
    int MENDE_KIKAKUI = 113;

    /**
     * Modi. Since: 2.42
    */
    int MODI = 114;

    /**
     * Mro. Since: 2.42
    */
    int MRO = 115;

    /**
     * Nabataean. Since: 2.42
    */
    int NABATAEAN = 116;

    /**
     * Old North Arabian. Since: 2.42
    */
    int OLD_NORTH_ARABIAN = 117;

    /**
     * Old Permic. Since: 2.42
    */
    int OLD_PERMIC = 118;

    /**
     * Pahawh Hmong. Since: 2.42
    */
    int PAHAWH_HMONG = 119;

    /**
     * Palmyrene. Since: 2.42
    */
    int PALMYRENE = 120;

    /**
     * Pau Cin Hau. Since: 2.42
    */
    int PAU_CIN_HAU = 121;

    /**
     * Psalter Pahlavi. Since: 2.42
    */
    int PSALTER_PAHLAVI = 122;

    /**
     * Siddham. Since: 2.42
    */
    int SIDDHAM = 123;

    /**
     * Tirhuta. Since: 2.42
    */
    int TIRHUTA = 124;

    /**
     * Warang Citi. Since: 2.42
    */
    int WARANG_CITI = 125;

    /**
     * Ahom. Since: 2.48
    */
    int AHOM = 126;

    /**
     * Anatolian Hieroglyphs. Since: 2.48
    */
    int ANATOLIAN_HIEROGLYPHS = 127;

    /**
     * Hatran. Since: 2.48
    */
    int HATRAN = 128;

    /**
     * Multani. Since: 2.48
    */
    int MULTANI = 129;

    /**
     * Old Hungarian. Since: 2.48
    */
    int OLD_HUNGARIAN = 130;

    /**
     * Signwriting. Since: 2.48
    */
    int SIGNWRITING = 131;

    /**
     * Adlam. Since: 2.50
    */
    int ADLAM = 132;

    /**
     * Bhaiksuki. Since: 2.50
    */
    int BHAIKSUKI = 133;

    /**
     * Marchen. Since: 2.50
    */
    int MARCHEN = 134;

    /**
     * Newa. Since: 2.50
    */
    int NEWA = 135;

    /**
     * Osage. Since: 2.50
    */
    int OSAGE = 136;

    /**
     * Tangut. Since: 2.50
    */
    int TANGUT = 137;

    /**
     * Masaram Gondi. Since: 2.54
    */
    int MASARAM_GONDI = 138;

    /**
     * Nushu. Since: 2.54
    */
    int NUSHU = 139;

    /**
     * Soyombo. Since: 2.54
    */
    int SOYOMBO = 140;

    /**
     * Zanabazar Square. Since: 2.54
    */
    int ZANABAZAR_SQUARE = 141;

    /**
     * Dogra. Since: 2.58
    */
    int DOGRA = 142;

    /**
     * Gunjala Gondi. Since: 2.58
    */
    int GUNJALA_GONDI = 143;

    /**
     * Hanifi Rohingya. Since: 2.58
    */
    int HANIFI_ROHINGYA = 144;

    /**
     * Makasar. Since: 2.58
    */
    int MAKASAR = 145;

    /**
     * Medefaidrin. Since: 2.58
    */
    int MEDEFAIDRIN = 146;

    /**
     * Old Sogdian. Since: 2.58
    */
    int OLD_SOGDIAN = 147;

    /**
     * Sogdian. Since: 2.58
    */
    int SOGDIAN = 148;

    /**
     * Elym. Since: 2.62
    */
    int ELYMAIC = 149;

    /**
     * Nand. Since: 2.62
    */
    int NANDINAGARI = 150;

    /**
     * Rohg. Since: 2.62
    */
    int NYIAKENG_PUACHUE_HMONG = 151;

    /**
     * Wcho. Since: 2.62
    */
    int WANCHO = 152;

    /**
     * Chorasmian. Since: 2.66
    */
    int CHORASMIAN = 153;

    /**
     * Dives Akuru. Since: 2.66
    */
    int DIVES_AKURU = 154;

    /**
     * Khitan small script. Since: 2.66
    */
    int KHITAN_SMALL_SCRIPT = 155;

    /**
     * Yezidi. Since: 2.66
    */
    int YEZIDI = 156;

    /**
     * Cypro-Minoan. Since: 2.72
    */
    int CYPRO_MINOAN = 157;

    /**
     * Old Uyghur. Since: 2.72
    */
    int OLD_UYGHUR = 158;

    /**
     * Tangsa. Since: 2.72
    */
    int TANGSA = 159;

    /**
     * Toto. Since: 2.72
    */
    int TOTO = 160;

    /**
     * Vithkuqi. Since: 2.72
    */
    int VITHKUQI = 161;

    /**
     * Mathematical notation. Since: 2.72
    */
    int MATH = 162;

    /**
     * Kawi. Since 2.74
    */
    int KAWI = 163;

    /**
     * Nag Mundari. Since 2.74
    */
    int NAG_MUNDARI = 164;

}

/*
enumeration-type
*/
