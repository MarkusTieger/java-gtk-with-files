/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface GdkConstants {

    /**
     * Defines all possible DND actions.
     * <br>
     * <br>This can be used in [method&#64;Gdk.Drop.status] messages when any drop
     * <br>can be accepted or a more specific drop method is not yet known.
    */
    int ACTION_ALL = 7;

    /**
     * The middle button.
    */
    int BUTTON_MIDDLE = 2;

    /**
     * The primary button. This is typically the left mouse button, or the
     * <br>right button in a left-handed setup.
    */
    int BUTTON_PRIMARY = 1;

    /**
     * The secondary button. This is typically the right mouse button, or the
     * <br>left button in a left-handed setup.
    */
    int BUTTON_SECONDARY = 3;

    /**
     * Represents the current time, and can be used anywhere a time is expected.
    */
    int CURRENT_TIME = 0;

    /**
     * Use this macro as the return value for continuing the propagation of
     * <br>an event handler.
    */
    boolean EVENT_PROPAGATE = false;

    /**
     * Use this macro as the return value for stopping the propagation of
     * <br>an event handler.
    */
    boolean EVENT_STOP = true;

    /**
     * 
    */
    int KEY_0 = 48;

    /**
     * 
    */
    int KEY_1 = 49;

    /**
     * 
    */
    int KEY_2 = 50;

    /**
     * 
    */
    int KEY_3 = 51;

    /**
     * 
    */
    int KEY_3270_AltCursor = 64784;

    /**
     * 
    */
    int KEY_3270_Attn = 64782;

    /**
     * 
    */
    int KEY_3270_BackTab = 64773;

    /**
     * 
    */
    int KEY_3270_ChangeScreen = 64793;

    /**
     * 
    */
    int KEY_3270_Copy = 64789;

    /**
     * 
    */
    int KEY_3270_CursorBlink = 64783;

    /**
     * 
    */
    int KEY_3270_CursorSelect = 64796;

    /**
     * 
    */
    int KEY_3270_DeleteWord = 64794;

    /**
     * 
    */
    int KEY_3270_Duplicate = 64769;

    /**
     * 
    */
    int KEY_3270_Enter = 64798;

    /**
     * 
    */
    int KEY_3270_EraseEOF = 64774;

    /**
     * 
    */
    int KEY_3270_EraseInput = 64775;

    /**
     * 
    */
    int KEY_3270_ExSelect = 64795;

    /**
     * 
    */
    int KEY_3270_FieldMark = 64770;

    /**
     * 
    */
    int KEY_3270_Ident = 64787;

    /**
     * 
    */
    int KEY_3270_Jump = 64786;

    /**
     * 
    */
    int KEY_3270_KeyClick = 64785;

    /**
     * 
    */
    int KEY_3270_Left2 = 64772;

    /**
     * 
    */
    int KEY_3270_PA1 = 64778;

    /**
     * 
    */
    int KEY_3270_PA2 = 64779;

    /**
     * 
    */
    int KEY_3270_PA3 = 64780;

    /**
     * 
    */
    int KEY_3270_Play = 64790;

    /**
     * 
    */
    int KEY_3270_PrintScreen = 64797;

    /**
     * 
    */
    int KEY_3270_Quit = 64777;

    /**
     * 
    */
    int KEY_3270_Record = 64792;

    /**
     * 
    */
    int KEY_3270_Reset = 64776;

    /**
     * 
    */
    int KEY_3270_Right2 = 64771;

    /**
     * 
    */
    int KEY_3270_Rule = 64788;

    /**
     * 
    */
    int KEY_3270_Setup = 64791;

    /**
     * 
    */
    int KEY_3270_Test = 64781;

    /**
     * 
    */
    int KEY_4 = 52;

    /**
     * 
    */
    int KEY_5 = 53;

    /**
     * 
    */
    int KEY_6 = 54;

    /**
     * 
    */
    int KEY_7 = 55;

    /**
     * 
    */
    int KEY_8 = 56;

    /**
     * 
    */
    int KEY_9 = 57;

    /**
     * 
    */
    int KEY_A = 65;

    /**
     * 
    */
    int KEY_AE = 198;

    /**
     * 
    */
    int KEY_Aacute = 193;

    /**
     * 
    */
    int KEY_Abelowdot = 16785056;

    /**
     * 
    */
    int KEY_Abreve = 451;

    /**
     * 
    */
    int KEY_Abreveacute = 16785070;

    /**
     * 
    */
    int KEY_Abrevebelowdot = 16785078;

    /**
     * 
    */
    int KEY_Abrevegrave = 16785072;

    /**
     * 
    */
    int KEY_Abrevehook = 16785074;

    /**
     * 
    */
    int KEY_Abrevetilde = 16785076;

    /**
     * 
    */
    int KEY_AccessX_Enable = 65136;

    /**
     * 
    */
    int KEY_AccessX_Feedback_Enable = 65137;

    /**
     * 
    */
    int KEY_Acircumflex = 194;

    /**
     * 
    */
    int KEY_Acircumflexacute = 16785060;

    /**
     * 
    */
    int KEY_Acircumflexbelowdot = 16785068;

    /**
     * 
    */
    int KEY_Acircumflexgrave = 16785062;

    /**
     * 
    */
    int KEY_Acircumflexhook = 16785064;

    /**
     * 
    */
    int KEY_Acircumflextilde = 16785066;

    /**
     * 
    */
    int KEY_AddFavorite = 269025081;

    /**
     * 
    */
    int KEY_Adiaeresis = 196;

    /**
     * 
    */
    int KEY_Agrave = 192;

    /**
     * 
    */
    int KEY_Ahook = 16785058;

    /**
     * 
    */
    int KEY_Alt_L = 65513;

    /**
     * 
    */
    int KEY_Alt_R = 65514;

    /**
     * 
    */
    int KEY_Amacron = 960;

    /**
     * 
    */
    int KEY_Aogonek = 417;

    /**
     * 
    */
    int KEY_ApplicationLeft = 269025104;

    /**
     * 
    */
    int KEY_ApplicationRight = 269025105;

    /**
     * 
    */
    int KEY_Arabic_0 = 16778848;

    /**
     * 
    */
    int KEY_Arabic_1 = 16778849;

    /**
     * 
    */
    int KEY_Arabic_2 = 16778850;

    /**
     * 
    */
    int KEY_Arabic_3 = 16778851;

    /**
     * 
    */
    int KEY_Arabic_4 = 16778852;

    /**
     * 
    */
    int KEY_Arabic_5 = 16778853;

    /**
     * 
    */
    int KEY_Arabic_6 = 16778854;

    /**
     * 
    */
    int KEY_Arabic_7 = 16778855;

    /**
     * 
    */
    int KEY_Arabic_8 = 16778856;

    /**
     * 
    */
    int KEY_Arabic_9 = 16778857;

    /**
     * 
    */
    int KEY_Arabic_ain = 1497;

    /**
     * 
    */
    int KEY_Arabic_alef = 1479;

    /**
     * 
    */
    int KEY_Arabic_alefmaksura = 1513;

    /**
     * 
    */
    int KEY_Arabic_beh = 1480;

    /**
     * 
    */
    int KEY_Arabic_comma = 1452;

    /**
     * 
    */
    int KEY_Arabic_dad = 1494;

    /**
     * 
    */
    int KEY_Arabic_dal = 1487;

    /**
     * 
    */
    int KEY_Arabic_damma = 1519;

    /**
     * 
    */
    int KEY_Arabic_dammatan = 1516;

    /**
     * 
    */
    int KEY_Arabic_ddal = 16778888;

    /**
     * 
    */
    int KEY_Arabic_farsi_yeh = 16778956;

    /**
     * 
    */
    int KEY_Arabic_fatha = 1518;

    /**
     * 
    */
    int KEY_Arabic_fathatan = 1515;

    /**
     * 
    */
    int KEY_Arabic_feh = 1505;

    /**
     * 
    */
    int KEY_Arabic_fullstop = 16778964;

    /**
     * 
    */
    int KEY_Arabic_gaf = 16778927;

    /**
     * 
    */
    int KEY_Arabic_ghain = 1498;

    /**
     * 
    */
    int KEY_Arabic_ha = 1511;

    /**
     * 
    */
    int KEY_Arabic_hah = 1485;

    /**
     * 
    */
    int KEY_Arabic_hamza = 1473;

    /**
     * 
    */
    int KEY_Arabic_hamza_above = 16778836;

    /**
     * 
    */
    int KEY_Arabic_hamza_below = 16778837;

    /**
     * 
    */
    int KEY_Arabic_hamzaonalef = 1475;

    /**
     * 
    */
    int KEY_Arabic_hamzaonwaw = 1476;

    /**
     * 
    */
    int KEY_Arabic_hamzaonyeh = 1478;

    /**
     * 
    */
    int KEY_Arabic_hamzaunderalef = 1477;

    /**
     * 
    */
    int KEY_Arabic_heh = 1511;

    /**
     * 
    */
    int KEY_Arabic_heh_doachashmee = 16778942;

    /**
     * 
    */
    int KEY_Arabic_heh_goal = 16778945;

    /**
     * 
    */
    int KEY_Arabic_jeem = 1484;

    /**
     * 
    */
    int KEY_Arabic_jeh = 16778904;

    /**
     * 
    */
    int KEY_Arabic_kaf = 1507;

    /**
     * 
    */
    int KEY_Arabic_kasra = 1520;

    /**
     * 
    */
    int KEY_Arabic_kasratan = 1517;

    /**
     * 
    */
    int KEY_Arabic_keheh = 16778921;

    /**
     * 
    */
    int KEY_Arabic_khah = 1486;

    /**
     * 
    */
    int KEY_Arabic_lam = 1508;

    /**
     * 
    */
    int KEY_Arabic_madda_above = 16778835;

    /**
     * 
    */
    int KEY_Arabic_maddaonalef = 1474;

    /**
     * 
    */
    int KEY_Arabic_meem = 1509;

    /**
     * 
    */
    int KEY_Arabic_noon = 1510;

    /**
     * 
    */
    int KEY_Arabic_noon_ghunna = 16778938;

    /**
     * 
    */
    int KEY_Arabic_peh = 16778878;

    /**
     * 
    */
    int KEY_Arabic_percent = 16778858;

    /**
     * 
    */
    int KEY_Arabic_qaf = 1506;

    /**
     * 
    */
    int KEY_Arabic_question_mark = 1471;

    /**
     * 
    */
    int KEY_Arabic_ra = 1489;

    /**
     * 
    */
    int KEY_Arabic_rreh = 16778897;

    /**
     * 
    */
    int KEY_Arabic_sad = 1493;

    /**
     * 
    */
    int KEY_Arabic_seen = 1491;

    /**
     * 
    */
    int KEY_Arabic_semicolon = 1467;

    /**
     * 
    */
    int KEY_Arabic_shadda = 1521;

    /**
     * 
    */
    int KEY_Arabic_sheen = 1492;

    /**
     * 
    */
    int KEY_Arabic_sukun = 1522;

    /**
     * 
    */
    int KEY_Arabic_superscript_alef = 16778864;

    /**
     * 
    */
    int KEY_Arabic_switch = 65406;

    /**
     * 
    */
    int KEY_Arabic_tah = 1495;

    /**
     * 
    */
    int KEY_Arabic_tatweel = 1504;

    /**
     * 
    */
    int KEY_Arabic_tcheh = 16778886;

    /**
     * 
    */
    int KEY_Arabic_teh = 1482;

    /**
     * 
    */
    int KEY_Arabic_tehmarbuta = 1481;

    /**
     * 
    */
    int KEY_Arabic_thal = 1488;

    /**
     * 
    */
    int KEY_Arabic_theh = 1483;

    /**
     * 
    */
    int KEY_Arabic_tteh = 16778873;

    /**
     * 
    */
    int KEY_Arabic_veh = 16778916;

    /**
     * 
    */
    int KEY_Arabic_waw = 1512;

    /**
     * 
    */
    int KEY_Arabic_yeh = 1514;

    /**
     * 
    */
    int KEY_Arabic_yeh_baree = 16778962;

    /**
     * 
    */
    int KEY_Arabic_zah = 1496;

    /**
     * 
    */
    int KEY_Arabic_zain = 1490;

    /**
     * 
    */
    int KEY_Aring = 197;

    /**
     * 
    */
    int KEY_Armenian_AT = 16778552;

    /**
     * 
    */
    int KEY_Armenian_AYB = 16778545;

    /**
     * 
    */
    int KEY_Armenian_BEN = 16778546;

    /**
     * 
    */
    int KEY_Armenian_CHA = 16778569;

    /**
     * 
    */
    int KEY_Armenian_DA = 16778548;

    /**
     * 
    */
    int KEY_Armenian_DZA = 16778561;

    /**
     * 
    */
    int KEY_Armenian_E = 16778551;

    /**
     * 
    */
    int KEY_Armenian_FE = 16778582;

    /**
     * 
    */
    int KEY_Armenian_GHAT = 16778562;

    /**
     * 
    */
    int KEY_Armenian_GIM = 16778547;

    /**
     * 
    */
    int KEY_Armenian_HI = 16778565;

    /**
     * 
    */
    int KEY_Armenian_HO = 16778560;

    /**
     * 
    */
    int KEY_Armenian_INI = 16778555;

    /**
     * 
    */
    int KEY_Armenian_JE = 16778571;

    /**
     * 
    */
    int KEY_Armenian_KE = 16778580;

    /**
     * 
    */
    int KEY_Armenian_KEN = 16778559;

    /**
     * 
    */
    int KEY_Armenian_KHE = 16778557;

    /**
     * 
    */
    int KEY_Armenian_LYUN = 16778556;

    /**
     * 
    */
    int KEY_Armenian_MEN = 16778564;

    /**
     * 
    */
    int KEY_Armenian_NU = 16778566;

    /**
     * 
    */
    int KEY_Armenian_O = 16778581;

    /**
     * 
    */
    int KEY_Armenian_PE = 16778570;

    /**
     * 
    */
    int KEY_Armenian_PYUR = 16778579;

    /**
     * 
    */
    int KEY_Armenian_RA = 16778572;

    /**
     * 
    */
    int KEY_Armenian_RE = 16778576;

    /**
     * 
    */
    int KEY_Armenian_SE = 16778573;

    /**
     * 
    */
    int KEY_Armenian_SHA = 16778567;

    /**
     * 
    */
    int KEY_Armenian_TCHE = 16778563;

    /**
     * 
    */
    int KEY_Armenian_TO = 16778553;

    /**
     * 
    */
    int KEY_Armenian_TSA = 16778558;

    /**
     * 
    */
    int KEY_Armenian_TSO = 16778577;

    /**
     * 
    */
    int KEY_Armenian_TYUN = 16778575;

    /**
     * 
    */
    int KEY_Armenian_VEV = 16778574;

    /**
     * 
    */
    int KEY_Armenian_VO = 16778568;

    /**
     * 
    */
    int KEY_Armenian_VYUN = 16778578;

    /**
     * 
    */
    int KEY_Armenian_YECH = 16778549;

    /**
     * 
    */
    int KEY_Armenian_ZA = 16778550;

    /**
     * 
    */
    int KEY_Armenian_ZHE = 16778554;

    /**
     * 
    */
    int KEY_Armenian_accent = 16778587;

    /**
     * 
    */
    int KEY_Armenian_amanak = 16778588;

    /**
     * 
    */
    int KEY_Armenian_apostrophe = 16778586;

    /**
     * 
    */
    int KEY_Armenian_at = 16778600;

    /**
     * 
    */
    int KEY_Armenian_ayb = 16778593;

    /**
     * 
    */
    int KEY_Armenian_ben = 16778594;

    /**
     * 
    */
    int KEY_Armenian_but = 16778589;

    /**
     * 
    */
    int KEY_Armenian_cha = 16778617;

    /**
     * 
    */
    int KEY_Armenian_da = 16778596;

    /**
     * 
    */
    int KEY_Armenian_dza = 16778609;

    /**
     * 
    */
    int KEY_Armenian_e = 16778599;

    /**
     * 
    */
    int KEY_Armenian_exclam = 16778588;

    /**
     * 
    */
    int KEY_Armenian_fe = 16778630;

    /**
     * 
    */
    int KEY_Armenian_full_stop = 16778633;

    /**
     * 
    */
    int KEY_Armenian_ghat = 16778610;

    /**
     * 
    */
    int KEY_Armenian_gim = 16778595;

    /**
     * 
    */
    int KEY_Armenian_hi = 16778613;

    /**
     * 
    */
    int KEY_Armenian_ho = 16778608;

    /**
     * 
    */
    int KEY_Armenian_hyphen = 16778634;

    /**
     * 
    */
    int KEY_Armenian_ini = 16778603;

    /**
     * 
    */
    int KEY_Armenian_je = 16778619;

    /**
     * 
    */
    int KEY_Armenian_ke = 16778628;

    /**
     * 
    */
    int KEY_Armenian_ken = 16778607;

    /**
     * 
    */
    int KEY_Armenian_khe = 16778605;

    /**
     * 
    */
    int KEY_Armenian_ligature_ew = 16778631;

    /**
     * 
    */
    int KEY_Armenian_lyun = 16778604;

    /**
     * 
    */
    int KEY_Armenian_men = 16778612;

    /**
     * 
    */
    int KEY_Armenian_nu = 16778614;

    /**
     * 
    */
    int KEY_Armenian_o = 16778629;

    /**
     * 
    */
    int KEY_Armenian_paruyk = 16778590;

    /**
     * 
    */
    int KEY_Armenian_pe = 16778618;

    /**
     * 
    */
    int KEY_Armenian_pyur = 16778627;

    /**
     * 
    */
    int KEY_Armenian_question = 16778590;

    /**
     * 
    */
    int KEY_Armenian_ra = 16778620;

    /**
     * 
    */
    int KEY_Armenian_re = 16778624;

    /**
     * 
    */
    int KEY_Armenian_se = 16778621;

    /**
     * 
    */
    int KEY_Armenian_separation_mark = 16778589;

    /**
     * 
    */
    int KEY_Armenian_sha = 16778615;

    /**
     * 
    */
    int KEY_Armenian_shesht = 16778587;

    /**
     * 
    */
    int KEY_Armenian_tche = 16778611;

    /**
     * 
    */
    int KEY_Armenian_to = 16778601;

    /**
     * 
    */
    int KEY_Armenian_tsa = 16778606;

    /**
     * 
    */
    int KEY_Armenian_tso = 16778625;

    /**
     * 
    */
    int KEY_Armenian_tyun = 16778623;

    /**
     * 
    */
    int KEY_Armenian_verjaket = 16778633;

    /**
     * 
    */
    int KEY_Armenian_vev = 16778622;

    /**
     * 
    */
    int KEY_Armenian_vo = 16778616;

    /**
     * 
    */
    int KEY_Armenian_vyun = 16778626;

    /**
     * 
    */
    int KEY_Armenian_yech = 16778597;

    /**
     * 
    */
    int KEY_Armenian_yentamna = 16778634;

    /**
     * 
    */
    int KEY_Armenian_za = 16778598;

    /**
     * 
    */
    int KEY_Armenian_zhe = 16778602;

    /**
     * 
    */
    int KEY_Atilde = 195;

    /**
     * 
    */
    int KEY_AudibleBell_Enable = 65146;

    /**
     * 
    */
    int KEY_AudioCycleTrack = 269025179;

    /**
     * 
    */
    int KEY_AudioForward = 269025175;

    /**
     * 
    */
    int KEY_AudioLowerVolume = 269025041;

    /**
     * 
    */
    int KEY_AudioMedia = 269025074;

    /**
     * 
    */
    int KEY_AudioMicMute = 269025202;

    /**
     * 
    */
    int KEY_AudioMute = 269025042;

    /**
     * 
    */
    int KEY_AudioNext = 269025047;

    /**
     * 
    */
    int KEY_AudioPause = 269025073;

    /**
     * 
    */
    int KEY_AudioPlay = 269025044;

    /**
     * 
    */
    int KEY_AudioPreset = 269025206;

    /**
     * 
    */
    int KEY_AudioPrev = 269025046;

    /**
     * 
    */
    int KEY_AudioRaiseVolume = 269025043;

    /**
     * 
    */
    int KEY_AudioRandomPlay = 269025177;

    /**
     * 
    */
    int KEY_AudioRecord = 269025052;

    /**
     * 
    */
    int KEY_AudioRepeat = 269025176;

    /**
     * 
    */
    int KEY_AudioRewind = 269025086;

    /**
     * 
    */
    int KEY_AudioStop = 269025045;

    /**
     * 
    */
    int KEY_Away = 269025165;

    /**
     * 
    */
    int KEY_B = 66;

    /**
     * 
    */
    int KEY_Babovedot = 16784898;

    /**
     * 
    */
    int KEY_Back = 269025062;

    /**
     * 
    */
    int KEY_BackForward = 269025087;

    /**
     * 
    */
    int KEY_BackSpace = 65288;

    /**
     * 
    */
    int KEY_Battery = 269025171;

    /**
     * 
    */
    int KEY_Begin = 65368;

    /**
     * 
    */
    int KEY_Blue = 269025190;

    /**
     * 
    */
    int KEY_Bluetooth = 269025172;

    /**
     * 
    */
    int KEY_Book = 269025106;

    /**
     * 
    */
    int KEY_BounceKeys_Enable = 65140;

    /**
     * 
    */
    int KEY_Break = 65387;

    /**
     * 
    */
    int KEY_BrightnessAdjust = 269025083;

    /**
     * 
    */
    int KEY_Byelorussian_SHORTU = 1726;

    /**
     * 
    */
    int KEY_Byelorussian_shortu = 1710;

    /**
     * 
    */
    int KEY_C = 67;

    /**
     * 
    */
    int KEY_CD = 269025107;

    /**
     * 
    */
    int KEY_CH = 65186;

    /**
     * 
    */
    int KEY_C_H = 65189;

    /**
     * 
    */
    int KEY_C_h = 65188;

    /**
     * 
    */
    int KEY_Cabovedot = 709;

    /**
     * 
    */
    int KEY_Cacute = 454;

    /**
     * 
    */
    int KEY_Calculator = 269025053;

    /**
     * 
    */
    int KEY_Calendar = 269025056;

    /**
     * 
    */
    int KEY_Cancel = 65385;

    /**
     * 
    */
    int KEY_Caps_Lock = 65509;

    /**
     * 
    */
    int KEY_Ccaron = 456;

    /**
     * 
    */
    int KEY_Ccedilla = 199;

    /**
     * 
    */
    int KEY_Ccircumflex = 710;

    /**
     * 
    */
    int KEY_Ch = 65185;

    /**
     * 
    */
    int KEY_Clear = 65291;

    /**
     * 
    */
    int KEY_ClearGrab = 269024801;

    /**
     * 
    */
    int KEY_Close = 269025110;

    /**
     * 
    */
    int KEY_Codeinput = 65335;

    /**
     * 
    */
    int KEY_ColonSign = 16785569;

    /**
     * 
    */
    int KEY_Community = 269025085;

    /**
     * 
    */
    int KEY_ContrastAdjust = 269025058;

    /**
     * 
    */
    int KEY_Control_L = 65507;

    /**
     * 
    */
    int KEY_Control_R = 65508;

    /**
     * 
    */
    int KEY_Copy = 269025111;

    /**
     * 
    */
    int KEY_CruzeiroSign = 16785570;

    /**
     * 
    */
    int KEY_Cut = 269025112;

    /**
     * 
    */
    int KEY_CycleAngle = 269025180;

    /**
     * 
    */
    int KEY_Cyrillic_A = 1761;

    /**
     * 
    */
    int KEY_Cyrillic_BE = 1762;

    /**
     * 
    */
    int KEY_Cyrillic_CHE = 1790;

    /**
     * 
    */
    int KEY_Cyrillic_CHE_descender = 16778422;

    /**
     * 
    */
    int KEY_Cyrillic_CHE_vertstroke = 16778424;

    /**
     * 
    */
    int KEY_Cyrillic_DE = 1764;

    /**
     * 
    */
    int KEY_Cyrillic_DZHE = 1727;

    /**
     * 
    */
    int KEY_Cyrillic_E = 1788;

    /**
     * 
    */
    int KEY_Cyrillic_EF = 1766;

    /**
     * 
    */
    int KEY_Cyrillic_EL = 1772;

    /**
     * 
    */
    int KEY_Cyrillic_EM = 1773;

    /**
     * 
    */
    int KEY_Cyrillic_EN = 1774;

    /**
     * 
    */
    int KEY_Cyrillic_EN_descender = 16778402;

    /**
     * 
    */
    int KEY_Cyrillic_ER = 1778;

    /**
     * 
    */
    int KEY_Cyrillic_ES = 1779;

    /**
     * 
    */
    int KEY_Cyrillic_GHE = 1767;

    /**
     * 
    */
    int KEY_Cyrillic_GHE_bar = 16778386;

    /**
     * 
    */
    int KEY_Cyrillic_HA = 1768;

    /**
     * 
    */
    int KEY_Cyrillic_HARDSIGN = 1791;

    /**
     * 
    */
    int KEY_Cyrillic_HA_descender = 16778418;

    /**
     * 
    */
    int KEY_Cyrillic_I = 1769;

    /**
     * 
    */
    int KEY_Cyrillic_IE = 1765;

    /**
     * 
    */
    int KEY_Cyrillic_IO = 1715;

    /**
     * 
    */
    int KEY_Cyrillic_I_macron = 16778466;

    /**
     * 
    */
    int KEY_Cyrillic_JE = 1720;

    /**
     * 
    */
    int KEY_Cyrillic_KA = 1771;

    /**
     * 
    */
    int KEY_Cyrillic_KA_descender = 16778394;

    /**
     * 
    */
    int KEY_Cyrillic_KA_vertstroke = 16778396;

    /**
     * 
    */
    int KEY_Cyrillic_LJE = 1721;

    /**
     * 
    */
    int KEY_Cyrillic_NJE = 1722;

    /**
     * 
    */
    int KEY_Cyrillic_O = 1775;

    /**
     * 
    */
    int KEY_Cyrillic_O_bar = 16778472;

    /**
     * 
    */
    int KEY_Cyrillic_PE = 1776;

    /**
     * 
    */
    int KEY_Cyrillic_SCHWA = 16778456;

    /**
     * 
    */
    int KEY_Cyrillic_SHA = 1787;

    /**
     * 
    */
    int KEY_Cyrillic_SHCHA = 1789;

    /**
     * 
    */
    int KEY_Cyrillic_SHHA = 16778426;

    /**
     * 
    */
    int KEY_Cyrillic_SHORTI = 1770;

    /**
     * 
    */
    int KEY_Cyrillic_SOFTSIGN = 1784;

    /**
     * 
    */
    int KEY_Cyrillic_TE = 1780;

    /**
     * 
    */
    int KEY_Cyrillic_TSE = 1763;

    /**
     * 
    */
    int KEY_Cyrillic_U = 1781;

    /**
     * 
    */
    int KEY_Cyrillic_U_macron = 16778478;

    /**
     * 
    */
    int KEY_Cyrillic_U_straight = 16778414;

    /**
     * 
    */
    int KEY_Cyrillic_U_straight_bar = 16778416;

    /**
     * 
    */
    int KEY_Cyrillic_VE = 1783;

    /**
     * 
    */
    int KEY_Cyrillic_YA = 1777;

    /**
     * 
    */
    int KEY_Cyrillic_YERU = 1785;

    /**
     * 
    */
    int KEY_Cyrillic_YU = 1760;

    /**
     * 
    */
    int KEY_Cyrillic_ZE = 1786;

    /**
     * 
    */
    int KEY_Cyrillic_ZHE = 1782;

    /**
     * 
    */
    int KEY_Cyrillic_ZHE_descender = 16778390;

    /**
     * 
    */
    int KEY_Cyrillic_a = 1729;

    /**
     * 
    */
    int KEY_Cyrillic_be = 1730;

    /**
     * 
    */
    int KEY_Cyrillic_che = 1758;

    /**
     * 
    */
    int KEY_Cyrillic_che_descender = 16778423;

    /**
     * 
    */
    int KEY_Cyrillic_che_vertstroke = 16778425;

    /**
     * 
    */
    int KEY_Cyrillic_de = 1732;

    /**
     * 
    */
    int KEY_Cyrillic_dzhe = 1711;

    /**
     * 
    */
    int KEY_Cyrillic_e = 1756;

    /**
     * 
    */
    int KEY_Cyrillic_ef = 1734;

    /**
     * 
    */
    int KEY_Cyrillic_el = 1740;

    /**
     * 
    */
    int KEY_Cyrillic_em = 1741;

    /**
     * 
    */
    int KEY_Cyrillic_en = 1742;

    /**
     * 
    */
    int KEY_Cyrillic_en_descender = 16778403;

    /**
     * 
    */
    int KEY_Cyrillic_er = 1746;

    /**
     * 
    */
    int KEY_Cyrillic_es = 1747;

    /**
     * 
    */
    int KEY_Cyrillic_ghe = 1735;

    /**
     * 
    */
    int KEY_Cyrillic_ghe_bar = 16778387;

    /**
     * 
    */
    int KEY_Cyrillic_ha = 1736;

    /**
     * 
    */
    int KEY_Cyrillic_ha_descender = 16778419;

    /**
     * 
    */
    int KEY_Cyrillic_hardsign = 1759;

    /**
     * 
    */
    int KEY_Cyrillic_i = 1737;

    /**
     * 
    */
    int KEY_Cyrillic_i_macron = 16778467;

    /**
     * 
    */
    int KEY_Cyrillic_ie = 1733;

    /**
     * 
    */
    int KEY_Cyrillic_io = 1699;

    /**
     * 
    */
    int KEY_Cyrillic_je = 1704;

    /**
     * 
    */
    int KEY_Cyrillic_ka = 1739;

    /**
     * 
    */
    int KEY_Cyrillic_ka_descender = 16778395;

    /**
     * 
    */
    int KEY_Cyrillic_ka_vertstroke = 16778397;

    /**
     * 
    */
    int KEY_Cyrillic_lje = 1705;

    /**
     * 
    */
    int KEY_Cyrillic_nje = 1706;

    /**
     * 
    */
    int KEY_Cyrillic_o = 1743;

    /**
     * 
    */
    int KEY_Cyrillic_o_bar = 16778473;

    /**
     * 
    */
    int KEY_Cyrillic_pe = 1744;

    /**
     * 
    */
    int KEY_Cyrillic_schwa = 16778457;

    /**
     * 
    */
    int KEY_Cyrillic_sha = 1755;

    /**
     * 
    */
    int KEY_Cyrillic_shcha = 1757;

    /**
     * 
    */
    int KEY_Cyrillic_shha = 16778427;

    /**
     * 
    */
    int KEY_Cyrillic_shorti = 1738;

    /**
     * 
    */
    int KEY_Cyrillic_softsign = 1752;

    /**
     * 
    */
    int KEY_Cyrillic_te = 1748;

    /**
     * 
    */
    int KEY_Cyrillic_tse = 1731;

    /**
     * 
    */
    int KEY_Cyrillic_u = 1749;

    /**
     * 
    */
    int KEY_Cyrillic_u_macron = 16778479;

    /**
     * 
    */
    int KEY_Cyrillic_u_straight = 16778415;

    /**
     * 
    */
    int KEY_Cyrillic_u_straight_bar = 16778417;

    /**
     * 
    */
    int KEY_Cyrillic_ve = 1751;

    /**
     * 
    */
    int KEY_Cyrillic_ya = 1745;

    /**
     * 
    */
    int KEY_Cyrillic_yeru = 1753;

    /**
     * 
    */
    int KEY_Cyrillic_yu = 1728;

    /**
     * 
    */
    int KEY_Cyrillic_ze = 1754;

    /**
     * 
    */
    int KEY_Cyrillic_zhe = 1750;

    /**
     * 
    */
    int KEY_Cyrillic_zhe_descender = 16778391;

    /**
     * 
    */
    int KEY_D = 68;

    /**
     * 
    */
    int KEY_DOS = 269025114;

    /**
     * 
    */
    int KEY_Dabovedot = 16784906;

    /**
     * 
    */
    int KEY_Dcaron = 463;

    /**
     * 
    */
    int KEY_Delete = 65535;

    /**
     * 
    */
    int KEY_Display = 269025113;

    /**
     * 
    */
    int KEY_Documents = 269025115;

    /**
     * 
    */
    int KEY_DongSign = 16785579;

    /**
     * 
    */
    int KEY_Down = 65364;

    /**
     * 
    */
    int KEY_Dstroke = 464;

    /**
     * 
    */
    int KEY_E = 69;

    /**
     * 
    */
    int KEY_ENG = 957;

    /**
     * 
    */
    int KEY_ETH = 208;

    /**
     * 
    */
    int KEY_EZH = 16777655;

    /**
     * 
    */
    int KEY_Eabovedot = 972;

    /**
     * 
    */
    int KEY_Eacute = 201;

    /**
     * 
    */
    int KEY_Ebelowdot = 16785080;

    /**
     * 
    */
    int KEY_Ecaron = 460;

    /**
     * 
    */
    int KEY_Ecircumflex = 202;

    /**
     * 
    */
    int KEY_Ecircumflexacute = 16785086;

    /**
     * 
    */
    int KEY_Ecircumflexbelowdot = 16785094;

    /**
     * 
    */
    int KEY_Ecircumflexgrave = 16785088;

    /**
     * 
    */
    int KEY_Ecircumflexhook = 16785090;

    /**
     * 
    */
    int KEY_Ecircumflextilde = 16785092;

    /**
     * 
    */
    int KEY_EcuSign = 16785568;

    /**
     * 
    */
    int KEY_Ediaeresis = 203;

    /**
     * 
    */
    int KEY_Egrave = 200;

    /**
     * 
    */
    int KEY_Ehook = 16785082;

    /**
     * 
    */
    int KEY_Eisu_Shift = 65327;

    /**
     * 
    */
    int KEY_Eisu_toggle = 65328;

    /**
     * 
    */
    int KEY_Eject = 269025068;

    /**
     * 
    */
    int KEY_Emacron = 938;

    /**
     * 
    */
    int KEY_End = 65367;

    /**
     * 
    */
    int KEY_Eogonek = 458;

    /**
     * 
    */
    int KEY_Escape = 65307;

    /**
     * 
    */
    int KEY_Eth = 208;

    /**
     * 
    */
    int KEY_Etilde = 16785084;

    /**
     * 
    */
    int KEY_EuroSign = 8364;

    /**
     * 
    */
    int KEY_Excel = 269025116;

    /**
     * 
    */
    int KEY_Execute = 65378;

    /**
     * 
    */
    int KEY_Explorer = 269025117;

    /**
     * 
    */
    int KEY_F = 70;

    /**
     * 
    */
    int KEY_F1 = 65470;

    /**
     * 
    */
    int KEY_F10 = 65479;

    /**
     * 
    */
    int KEY_F11 = 65480;

    /**
     * 
    */
    int KEY_F12 = 65481;

    /**
     * 
    */
    int KEY_F13 = 65482;

    /**
     * 
    */
    int KEY_F14 = 65483;

    /**
     * 
    */
    int KEY_F15 = 65484;

    /**
     * 
    */
    int KEY_F16 = 65485;

    /**
     * 
    */
    int KEY_F17 = 65486;

    /**
     * 
    */
    int KEY_F18 = 65487;

    /**
     * 
    */
    int KEY_F19 = 65488;

    /**
     * 
    */
    int KEY_F2 = 65471;

    /**
     * 
    */
    int KEY_F20 = 65489;

    /**
     * 
    */
    int KEY_F21 = 65490;

    /**
     * 
    */
    int KEY_F22 = 65491;

    /**
     * 
    */
    int KEY_F23 = 65492;

    /**
     * 
    */
    int KEY_F24 = 65493;

    /**
     * 
    */
    int KEY_F25 = 65494;

    /**
     * 
    */
    int KEY_F26 = 65495;

    /**
     * 
    */
    int KEY_F27 = 65496;

    /**
     * 
    */
    int KEY_F28 = 65497;

    /**
     * 
    */
    int KEY_F29 = 65498;

    /**
     * 
    */
    int KEY_F3 = 65472;

    /**
     * 
    */
    int KEY_F30 = 65499;

    /**
     * 
    */
    int KEY_F31 = 65500;

    /**
     * 
    */
    int KEY_F32 = 65501;

    /**
     * 
    */
    int KEY_F33 = 65502;

    /**
     * 
    */
    int KEY_F34 = 65503;

    /**
     * 
    */
    int KEY_F35 = 65504;

    /**
     * 
    */
    int KEY_F4 = 65473;

    /**
     * 
    */
    int KEY_F5 = 65474;

    /**
     * 
    */
    int KEY_F6 = 65475;

    /**
     * 
    */
    int KEY_F7 = 65476;

    /**
     * 
    */
    int KEY_F8 = 65477;

    /**
     * 
    */
    int KEY_F9 = 65478;

    /**
     * 
    */
    int KEY_FFrancSign = 16785571;

    /**
     * 
    */
    int KEY_Fabovedot = 16784926;

    /**
     * 
    */
    int KEY_Farsi_0 = 16778992;

    /**
     * 
    */
    int KEY_Farsi_1 = 16778993;

    /**
     * 
    */
    int KEY_Farsi_2 = 16778994;

    /**
     * 
    */
    int KEY_Farsi_3 = 16778995;

    /**
     * 
    */
    int KEY_Farsi_4 = 16778996;

    /**
     * 
    */
    int KEY_Farsi_5 = 16778997;

    /**
     * 
    */
    int KEY_Farsi_6 = 16778998;

    /**
     * 
    */
    int KEY_Farsi_7 = 16778999;

    /**
     * 
    */
    int KEY_Farsi_8 = 16779000;

    /**
     * 
    */
    int KEY_Farsi_9 = 16779001;

    /**
     * 
    */
    int KEY_Farsi_yeh = 16778956;

    /**
     * 
    */
    int KEY_Favorites = 269025072;

    /**
     * 
    */
    int KEY_Finance = 269025084;

    /**
     * 
    */
    int KEY_Find = 65384;

    /**
     * 
    */
    int KEY_First_Virtual_Screen = 65232;

    /**
     * 
    */
    int KEY_Forward = 269025063;

    /**
     * 
    */
    int KEY_FrameBack = 269025181;

    /**
     * 
    */
    int KEY_FrameForward = 269025182;

    /**
     * 
    */
    int KEY_G = 71;

    /**
     * 
    */
    int KEY_Gabovedot = 725;

    /**
     * 
    */
    int KEY_Game = 269025118;

    /**
     * 
    */
    int KEY_Gbreve = 683;

    /**
     * 
    */
    int KEY_Gcaron = 16777702;

    /**
     * 
    */
    int KEY_Gcedilla = 939;

    /**
     * 
    */
    int KEY_Gcircumflex = 728;

    /**
     * 
    */
    int KEY_Georgian_an = 16781520;

    /**
     * 
    */
    int KEY_Georgian_ban = 16781521;

    /**
     * 
    */
    int KEY_Georgian_can = 16781546;

    /**
     * 
    */
    int KEY_Georgian_char = 16781549;

    /**
     * 
    */
    int KEY_Georgian_chin = 16781545;

    /**
     * 
    */
    int KEY_Georgian_cil = 16781548;

    /**
     * 
    */
    int KEY_Georgian_don = 16781523;

    /**
     * 
    */
    int KEY_Georgian_en = 16781524;

    /**
     * 
    */
    int KEY_Georgian_fi = 16781558;

    /**
     * 
    */
    int KEY_Georgian_gan = 16781522;

    /**
     * 
    */
    int KEY_Georgian_ghan = 16781542;

    /**
     * 
    */
    int KEY_Georgian_hae = 16781552;

    /**
     * 
    */
    int KEY_Georgian_har = 16781556;

    /**
     * 
    */
    int KEY_Georgian_he = 16781553;

    /**
     * 
    */
    int KEY_Georgian_hie = 16781554;

    /**
     * 
    */
    int KEY_Georgian_hoe = 16781557;

    /**
     * 
    */
    int KEY_Georgian_in = 16781528;

    /**
     * 
    */
    int KEY_Georgian_jhan = 16781551;

    /**
     * 
    */
    int KEY_Georgian_jil = 16781547;

    /**
     * 
    */
    int KEY_Georgian_kan = 16781529;

    /**
     * 
    */
    int KEY_Georgian_khar = 16781541;

    /**
     * 
    */
    int KEY_Georgian_las = 16781530;

    /**
     * 
    */
    int KEY_Georgian_man = 16781531;

    /**
     * 
    */
    int KEY_Georgian_nar = 16781532;

    /**
     * 
    */
    int KEY_Georgian_on = 16781533;

    /**
     * 
    */
    int KEY_Georgian_par = 16781534;

    /**
     * 
    */
    int KEY_Georgian_phar = 16781540;

    /**
     * 
    */
    int KEY_Georgian_qar = 16781543;

    /**
     * 
    */
    int KEY_Georgian_rae = 16781536;

    /**
     * 
    */
    int KEY_Georgian_san = 16781537;

    /**
     * 
    */
    int KEY_Georgian_shin = 16781544;

    /**
     * 
    */
    int KEY_Georgian_tan = 16781527;

    /**
     * 
    */
    int KEY_Georgian_tar = 16781538;

    /**
     * 
    */
    int KEY_Georgian_un = 16781539;

    /**
     * 
    */
    int KEY_Georgian_vin = 16781525;

    /**
     * 
    */
    int KEY_Georgian_we = 16781555;

    /**
     * 
    */
    int KEY_Georgian_xan = 16781550;

    /**
     * 
    */
    int KEY_Georgian_zen = 16781526;

    /**
     * 
    */
    int KEY_Georgian_zhar = 16781535;

    /**
     * 
    */
    int KEY_Go = 269025119;

    /**
     * 
    */
    int KEY_Greek_ALPHA = 1985;

    /**
     * 
    */
    int KEY_Greek_ALPHAaccent = 1953;

    /**
     * 
    */
    int KEY_Greek_BETA = 1986;

    /**
     * 
    */
    int KEY_Greek_CHI = 2007;

    /**
     * 
    */
    int KEY_Greek_DELTA = 1988;

    /**
     * 
    */
    int KEY_Greek_EPSILON = 1989;

    /**
     * 
    */
    int KEY_Greek_EPSILONaccent = 1954;

    /**
     * 
    */
    int KEY_Greek_ETA = 1991;

    /**
     * 
    */
    int KEY_Greek_ETAaccent = 1955;

    /**
     * 
    */
    int KEY_Greek_GAMMA = 1987;

    /**
     * 
    */
    int KEY_Greek_IOTA = 1993;

    /**
     * 
    */
    int KEY_Greek_IOTAaccent = 1956;

    /**
     * 
    */
    int KEY_Greek_IOTAdiaeresis = 1957;

    /**
     * 
    */
    int KEY_Greek_IOTAdieresis = 1957;

    /**
     * 
    */
    int KEY_Greek_KAPPA = 1994;

    /**
     * 
    */
    int KEY_Greek_LAMBDA = 1995;

    /**
     * 
    */
    int KEY_Greek_LAMDA = 1995;

    /**
     * 
    */
    int KEY_Greek_MU = 1996;

    /**
     * 
    */
    int KEY_Greek_NU = 1997;

    /**
     * 
    */
    int KEY_Greek_OMEGA = 2009;

    /**
     * 
    */
    int KEY_Greek_OMEGAaccent = 1963;

    /**
     * 
    */
    int KEY_Greek_OMICRON = 1999;

    /**
     * 
    */
    int KEY_Greek_OMICRONaccent = 1959;

    /**
     * 
    */
    int KEY_Greek_PHI = 2006;

    /**
     * 
    */
    int KEY_Greek_PI = 2000;

    /**
     * 
    */
    int KEY_Greek_PSI = 2008;

    /**
     * 
    */
    int KEY_Greek_RHO = 2001;

    /**
     * 
    */
    int KEY_Greek_SIGMA = 2002;

    /**
     * 
    */
    int KEY_Greek_TAU = 2004;

    /**
     * 
    */
    int KEY_Greek_THETA = 1992;

    /**
     * 
    */
    int KEY_Greek_UPSILON = 2005;

    /**
     * 
    */
    int KEY_Greek_UPSILONaccent = 1960;

    /**
     * 
    */
    int KEY_Greek_UPSILONdieresis = 1961;

    /**
     * 
    */
    int KEY_Greek_XI = 1998;

    /**
     * 
    */
    int KEY_Greek_ZETA = 1990;

    /**
     * 
    */
    int KEY_Greek_accentdieresis = 1966;

    /**
     * 
    */
    int KEY_Greek_alpha = 2017;

    /**
     * 
    */
    int KEY_Greek_alphaaccent = 1969;

    /**
     * 
    */
    int KEY_Greek_beta = 2018;

    /**
     * 
    */
    int KEY_Greek_chi = 2039;

    /**
     * 
    */
    int KEY_Greek_delta = 2020;

    /**
     * 
    */
    int KEY_Greek_epsilon = 2021;

    /**
     * 
    */
    int KEY_Greek_epsilonaccent = 1970;

    /**
     * 
    */
    int KEY_Greek_eta = 2023;

    /**
     * 
    */
    int KEY_Greek_etaaccent = 1971;

    /**
     * 
    */
    int KEY_Greek_finalsmallsigma = 2035;

    /**
     * 
    */
    int KEY_Greek_gamma = 2019;

    /**
     * 
    */
    int KEY_Greek_horizbar = 1967;

    /**
     * 
    */
    int KEY_Greek_iota = 2025;

    /**
     * 
    */
    int KEY_Greek_iotaaccent = 1972;

    /**
     * 
    */
    int KEY_Greek_iotaaccentdieresis = 1974;

    /**
     * 
    */
    int KEY_Greek_iotadieresis = 1973;

    /**
     * 
    */
    int KEY_Greek_kappa = 2026;

    /**
     * 
    */
    int KEY_Greek_lambda = 2027;

    /**
     * 
    */
    int KEY_Greek_lamda = 2027;

    /**
     * 
    */
    int KEY_Greek_mu = 2028;

    /**
     * 
    */
    int KEY_Greek_nu = 2029;

    /**
     * 
    */
    int KEY_Greek_omega = 2041;

    /**
     * 
    */
    int KEY_Greek_omegaaccent = 1979;

    /**
     * 
    */
    int KEY_Greek_omicron = 2031;

    /**
     * 
    */
    int KEY_Greek_omicronaccent = 1975;

    /**
     * 
    */
    int KEY_Greek_phi = 2038;

    /**
     * 
    */
    int KEY_Greek_pi = 2032;

    /**
     * 
    */
    int KEY_Greek_psi = 2040;

    /**
     * 
    */
    int KEY_Greek_rho = 2033;

    /**
     * 
    */
    int KEY_Greek_sigma = 2034;

    /**
     * 
    */
    int KEY_Greek_switch = 65406;

    /**
     * 
    */
    int KEY_Greek_tau = 2036;

    /**
     * 
    */
    int KEY_Greek_theta = 2024;

    /**
     * 
    */
    int KEY_Greek_upsilon = 2037;

    /**
     * 
    */
    int KEY_Greek_upsilonaccent = 1976;

    /**
     * 
    */
    int KEY_Greek_upsilonaccentdieresis = 1978;

    /**
     * 
    */
    int KEY_Greek_upsilondieresis = 1977;

    /**
     * 
    */
    int KEY_Greek_xi = 2030;

    /**
     * 
    */
    int KEY_Greek_zeta = 2022;

    /**
     * 
    */
    int KEY_Green = 269025188;

    /**
     * 
    */
    int KEY_H = 72;

    /**
     * 
    */
    int KEY_Hangul = 65329;

    /**
     * 
    */
    int KEY_Hangul_A = 3775;

    /**
     * 
    */
    int KEY_Hangul_AE = 3776;

    /**
     * 
    */
    int KEY_Hangul_AraeA = 3830;

    /**
     * 
    */
    int KEY_Hangul_AraeAE = 3831;

    /**
     * 
    */
    int KEY_Hangul_Banja = 65337;

    /**
     * 
    */
    int KEY_Hangul_Cieuc = 3770;

    /**
     * 
    */
    int KEY_Hangul_Codeinput = 65335;

    /**
     * 
    */
    int KEY_Hangul_Dikeud = 3751;

    /**
     * 
    */
    int KEY_Hangul_E = 3780;

    /**
     * 
    */
    int KEY_Hangul_EO = 3779;

    /**
     * 
    */
    int KEY_Hangul_EU = 3793;

    /**
     * 
    */
    int KEY_Hangul_End = 65331;

    /**
     * 
    */
    int KEY_Hangul_Hanja = 65332;

    /**
     * 
    */
    int KEY_Hangul_Hieuh = 3774;

    /**
     * 
    */
    int KEY_Hangul_I = 3795;

    /**
     * 
    */
    int KEY_Hangul_Ieung = 3767;

    /**
     * 
    */
    int KEY_Hangul_J_Cieuc = 3818;

    /**
     * 
    */
    int KEY_Hangul_J_Dikeud = 3802;

    /**
     * 
    */
    int KEY_Hangul_J_Hieuh = 3822;

    /**
     * 
    */
    int KEY_Hangul_J_Ieung = 3816;

    /**
     * 
    */
    int KEY_Hangul_J_Jieuj = 3817;

    /**
     * 
    */
    int KEY_Hangul_J_Khieuq = 3819;

    /**
     * 
    */
    int KEY_Hangul_J_Kiyeog = 3796;

    /**
     * 
    */
    int KEY_Hangul_J_KiyeogSios = 3798;

    /**
     * 
    */
    int KEY_Hangul_J_KkogjiDalrinIeung = 3833;

    /**
     * 
    */
    int KEY_Hangul_J_Mieum = 3811;

    /**
     * 
    */
    int KEY_Hangul_J_Nieun = 3799;

    /**
     * 
    */
    int KEY_Hangul_J_NieunHieuh = 3801;

    /**
     * 
    */
    int KEY_Hangul_J_NieunJieuj = 3800;

    /**
     * 
    */
    int KEY_Hangul_J_PanSios = 3832;

    /**
     * 
    */
    int KEY_Hangul_J_Phieuf = 3821;

    /**
     * 
    */
    int KEY_Hangul_J_Pieub = 3812;

    /**
     * 
    */
    int KEY_Hangul_J_PieubSios = 3813;

    /**
     * 
    */
    int KEY_Hangul_J_Rieul = 3803;

    /**
     * 
    */
    int KEY_Hangul_J_RieulHieuh = 3810;

    /**
     * 
    */
    int KEY_Hangul_J_RieulKiyeog = 3804;

    /**
     * 
    */
    int KEY_Hangul_J_RieulMieum = 3805;

    /**
     * 
    */
    int KEY_Hangul_J_RieulPhieuf = 3809;

    /**
     * 
    */
    int KEY_Hangul_J_RieulPieub = 3806;

    /**
     * 
    */
    int KEY_Hangul_J_RieulSios = 3807;

    /**
     * 
    */
    int KEY_Hangul_J_RieulTieut = 3808;

    /**
     * 
    */
    int KEY_Hangul_J_Sios = 3814;

    /**
     * 
    */
    int KEY_Hangul_J_SsangKiyeog = 3797;

    /**
     * 
    */
    int KEY_Hangul_J_SsangSios = 3815;

    /**
     * 
    */
    int KEY_Hangul_J_Tieut = 3820;

    /**
     * 
    */
    int KEY_Hangul_J_YeorinHieuh = 3834;

    /**
     * 
    */
    int KEY_Hangul_Jamo = 65333;

    /**
     * 
    */
    int KEY_Hangul_Jeonja = 65336;

    /**
     * 
    */
    int KEY_Hangul_Jieuj = 3768;

    /**
     * 
    */
    int KEY_Hangul_Khieuq = 3771;

    /**
     * 
    */
    int KEY_Hangul_Kiyeog = 3745;

    /**
     * 
    */
    int KEY_Hangul_KiyeogSios = 3747;

    /**
     * 
    */
    int KEY_Hangul_KkogjiDalrinIeung = 3827;

    /**
     * 
    */
    int KEY_Hangul_Mieum = 3761;

    /**
     * 
    */
    int KEY_Hangul_MultipleCandidate = 65341;

    /**
     * 
    */
    int KEY_Hangul_Nieun = 3748;

    /**
     * 
    */
    int KEY_Hangul_NieunHieuh = 3750;

    /**
     * 
    */
    int KEY_Hangul_NieunJieuj = 3749;

    /**
     * 
    */
    int KEY_Hangul_O = 3783;

    /**
     * 
    */
    int KEY_Hangul_OE = 3786;

    /**
     * 
    */
    int KEY_Hangul_PanSios = 3826;

    /**
     * 
    */
    int KEY_Hangul_Phieuf = 3773;

    /**
     * 
    */
    int KEY_Hangul_Pieub = 3762;

    /**
     * 
    */
    int KEY_Hangul_PieubSios = 3764;

    /**
     * 
    */
    int KEY_Hangul_PostHanja = 65339;

    /**
     * 
    */
    int KEY_Hangul_PreHanja = 65338;

    /**
     * 
    */
    int KEY_Hangul_PreviousCandidate = 65342;

    /**
     * 
    */
    int KEY_Hangul_Rieul = 3753;

    /**
     * 
    */
    int KEY_Hangul_RieulHieuh = 3760;

    /**
     * 
    */
    int KEY_Hangul_RieulKiyeog = 3754;

    /**
     * 
    */
    int KEY_Hangul_RieulMieum = 3755;

    /**
     * 
    */
    int KEY_Hangul_RieulPhieuf = 3759;

    /**
     * 
    */
    int KEY_Hangul_RieulPieub = 3756;

    /**
     * 
    */
    int KEY_Hangul_RieulSios = 3757;

    /**
     * 
    */
    int KEY_Hangul_RieulTieut = 3758;

    /**
     * 
    */
    int KEY_Hangul_RieulYeorinHieuh = 3823;

    /**
     * 
    */
    int KEY_Hangul_Romaja = 65334;

    /**
     * 
    */
    int KEY_Hangul_SingleCandidate = 65340;

    /**
     * 
    */
    int KEY_Hangul_Sios = 3765;

    /**
     * 
    */
    int KEY_Hangul_Special = 65343;

    /**
     * 
    */
    int KEY_Hangul_SsangDikeud = 3752;

    /**
     * 
    */
    int KEY_Hangul_SsangJieuj = 3769;

    /**
     * 
    */
    int KEY_Hangul_SsangKiyeog = 3746;

    /**
     * 
    */
    int KEY_Hangul_SsangPieub = 3763;

    /**
     * 
    */
    int KEY_Hangul_SsangSios = 3766;

    /**
     * 
    */
    int KEY_Hangul_Start = 65330;

    /**
     * 
    */
    int KEY_Hangul_SunkyeongeumMieum = 3824;

    /**
     * 
    */
    int KEY_Hangul_SunkyeongeumPhieuf = 3828;

    /**
     * 
    */
    int KEY_Hangul_SunkyeongeumPieub = 3825;

    /**
     * 
    */
    int KEY_Hangul_Tieut = 3772;

    /**
     * 
    */
    int KEY_Hangul_U = 3788;

    /**
     * 
    */
    int KEY_Hangul_WA = 3784;

    /**
     * 
    */
    int KEY_Hangul_WAE = 3785;

    /**
     * 
    */
    int KEY_Hangul_WE = 3790;

    /**
     * 
    */
    int KEY_Hangul_WEO = 3789;

    /**
     * 
    */
    int KEY_Hangul_WI = 3791;

    /**
     * 
    */
    int KEY_Hangul_YA = 3777;

    /**
     * 
    */
    int KEY_Hangul_YAE = 3778;

    /**
     * 
    */
    int KEY_Hangul_YE = 3782;

    /**
     * 
    */
    int KEY_Hangul_YEO = 3781;

    /**
     * 
    */
    int KEY_Hangul_YI = 3794;

    /**
     * 
    */
    int KEY_Hangul_YO = 3787;

    /**
     * 
    */
    int KEY_Hangul_YU = 3792;

    /**
     * 
    */
    int KEY_Hangul_YeorinHieuh = 3829;

    /**
     * 
    */
    int KEY_Hangul_switch = 65406;

    /**
     * 
    */
    int KEY_Hankaku = 65321;

    /**
     * 
    */
    int KEY_Hcircumflex = 678;

    /**
     * 
    */
    int KEY_Hebrew_switch = 65406;

    /**
     * 
    */
    int KEY_Help = 65386;

    /**
     * 
    */
    int KEY_Henkan = 65315;

    /**
     * 
    */
    int KEY_Henkan_Mode = 65315;

    /**
     * 
    */
    int KEY_Hibernate = 269025192;

    /**
     * 
    */
    int KEY_Hiragana = 65317;

    /**
     * 
    */
    int KEY_Hiragana_Katakana = 65319;

    /**
     * 
    */
    int KEY_History = 269025079;

    /**
     * 
    */
    int KEY_Home = 65360;

    /**
     * 
    */
    int KEY_HomePage = 269025048;

    /**
     * 
    */
    int KEY_HotLinks = 269025082;

    /**
     * 
    */
    int KEY_Hstroke = 673;

    /**
     * 
    */
    int KEY_Hyper_L = 65517;

    /**
     * 
    */
    int KEY_Hyper_R = 65518;

    /**
     * 
    */
    int KEY_I = 73;

    /**
     * 
    */
    int KEY_ISO_Center_Object = 65075;

    /**
     * 
    */
    int KEY_ISO_Continuous_Underline = 65072;

    /**
     * 
    */
    int KEY_ISO_Discontinuous_Underline = 65073;

    /**
     * 
    */
    int KEY_ISO_Emphasize = 65074;

    /**
     * 
    */
    int KEY_ISO_Enter = 65076;

    /**
     * 
    */
    int KEY_ISO_Fast_Cursor_Down = 65071;

    /**
     * 
    */
    int KEY_ISO_Fast_Cursor_Left = 65068;

    /**
     * 
    */
    int KEY_ISO_Fast_Cursor_Right = 65069;

    /**
     * 
    */
    int KEY_ISO_Fast_Cursor_Up = 65070;

    /**
     * 
    */
    int KEY_ISO_First_Group = 65036;

    /**
     * 
    */
    int KEY_ISO_First_Group_Lock = 65037;

    /**
     * 
    */
    int KEY_ISO_Group_Latch = 65030;

    /**
     * 
    */
    int KEY_ISO_Group_Lock = 65031;

    /**
     * 
    */
    int KEY_ISO_Group_Shift = 65406;

    /**
     * 
    */
    int KEY_ISO_Last_Group = 65038;

    /**
     * 
    */
    int KEY_ISO_Last_Group_Lock = 65039;

    /**
     * 
    */
    int KEY_ISO_Left_Tab = 65056;

    /**
     * 
    */
    int KEY_ISO_Level2_Latch = 65026;

    /**
     * 
    */
    int KEY_ISO_Level3_Latch = 65028;

    /**
     * 
    */
    int KEY_ISO_Level3_Lock = 65029;

    /**
     * 
    */
    int KEY_ISO_Level3_Shift = 65027;

    /**
     * 
    */
    int KEY_ISO_Level5_Latch = 65042;

    /**
     * 
    */
    int KEY_ISO_Level5_Lock = 65043;

    /**
     * 
    */
    int KEY_ISO_Level5_Shift = 65041;

    /**
     * 
    */
    int KEY_ISO_Lock = 65025;

    /**
     * 
    */
    int KEY_ISO_Move_Line_Down = 65058;

    /**
     * 
    */
    int KEY_ISO_Move_Line_Up = 65057;

    /**
     * 
    */
    int KEY_ISO_Next_Group = 65032;

    /**
     * 
    */
    int KEY_ISO_Next_Group_Lock = 65033;

    /**
     * 
    */
    int KEY_ISO_Partial_Line_Down = 65060;

    /**
     * 
    */
    int KEY_ISO_Partial_Line_Up = 65059;

    /**
     * 
    */
    int KEY_ISO_Partial_Space_Left = 65061;

    /**
     * 
    */
    int KEY_ISO_Partial_Space_Right = 65062;

    /**
     * 
    */
    int KEY_ISO_Prev_Group = 65034;

    /**
     * 
    */
    int KEY_ISO_Prev_Group_Lock = 65035;

    /**
     * 
    */
    int KEY_ISO_Release_Both_Margins = 65067;

    /**
     * 
    */
    int KEY_ISO_Release_Margin_Left = 65065;

    /**
     * 
    */
    int KEY_ISO_Release_Margin_Right = 65066;

    /**
     * 
    */
    int KEY_ISO_Set_Margin_Left = 65063;

    /**
     * 
    */
    int KEY_ISO_Set_Margin_Right = 65064;

    /**
     * 
    */
    int KEY_Iabovedot = 681;

    /**
     * 
    */
    int KEY_Iacute = 205;

    /**
     * 
    */
    int KEY_Ibelowdot = 16785098;

    /**
     * 
    */
    int KEY_Ibreve = 16777516;

    /**
     * 
    */
    int KEY_Icircumflex = 206;

    /**
     * 
    */
    int KEY_Idiaeresis = 207;

    /**
     * 
    */
    int KEY_Igrave = 204;

    /**
     * 
    */
    int KEY_Ihook = 16785096;

    /**
     * 
    */
    int KEY_Imacron = 975;

    /**
     * 
    */
    int KEY_Insert = 65379;

    /**
     * 
    */
    int KEY_Iogonek = 967;

    /**
     * 
    */
    int KEY_Itilde = 933;

    /**
     * 
    */
    int KEY_J = 74;

    /**
     * 
    */
    int KEY_Jcircumflex = 684;

    /**
     * 
    */
    int KEY_K = 75;

    /**
     * 
    */
    int KEY_KP_0 = 65456;

    /**
     * 
    */
    int KEY_KP_1 = 65457;

    /**
     * 
    */
    int KEY_KP_2 = 65458;

    /**
     * 
    */
    int KEY_KP_3 = 65459;

    /**
     * 
    */
    int KEY_KP_4 = 65460;

    /**
     * 
    */
    int KEY_KP_5 = 65461;

    /**
     * 
    */
    int KEY_KP_6 = 65462;

    /**
     * 
    */
    int KEY_KP_7 = 65463;

    /**
     * 
    */
    int KEY_KP_8 = 65464;

    /**
     * 
    */
    int KEY_KP_9 = 65465;

    /**
     * 
    */
    int KEY_KP_Add = 65451;

    /**
     * 
    */
    int KEY_KP_Begin = 65437;

    /**
     * 
    */
    int KEY_KP_Decimal = 65454;

    /**
     * 
    */
    int KEY_KP_Delete = 65439;

    /**
     * 
    */
    int KEY_KP_Divide = 65455;

    /**
     * 
    */
    int KEY_KP_Down = 65433;

    /**
     * 
    */
    int KEY_KP_End = 65436;

    /**
     * 
    */
    int KEY_KP_Enter = 65421;

    /**
     * 
    */
    int KEY_KP_Equal = 65469;

    /**
     * 
    */
    int KEY_KP_F1 = 65425;

    /**
     * 
    */
    int KEY_KP_F2 = 65426;

    /**
     * 
    */
    int KEY_KP_F3 = 65427;

    /**
     * 
    */
    int KEY_KP_F4 = 65428;

    /**
     * 
    */
    int KEY_KP_Home = 65429;

    /**
     * 
    */
    int KEY_KP_Insert = 65438;

    /**
     * 
    */
    int KEY_KP_Left = 65430;

    /**
     * 
    */
    int KEY_KP_Multiply = 65450;

    /**
     * 
    */
    int KEY_KP_Next = 65435;

    /**
     * 
    */
    int KEY_KP_Page_Down = 65435;

    /**
     * 
    */
    int KEY_KP_Page_Up = 65434;

    /**
     * 
    */
    int KEY_KP_Prior = 65434;

    /**
     * 
    */
    int KEY_KP_Right = 65432;

    /**
     * 
    */
    int KEY_KP_Separator = 65452;

    /**
     * 
    */
    int KEY_KP_Space = 65408;

    /**
     * 
    */
    int KEY_KP_Subtract = 65453;

    /**
     * 
    */
    int KEY_KP_Tab = 65417;

    /**
     * 
    */
    int KEY_KP_Up = 65431;

    /**
     * 
    */
    int KEY_Kana_Lock = 65325;

    /**
     * 
    */
    int KEY_Kana_Shift = 65326;

    /**
     * 
    */
    int KEY_Kanji = 65313;

    /**
     * 
    */
    int KEY_Kanji_Bangou = 65335;

    /**
     * 
    */
    int KEY_Katakana = 65318;

    /**
     * 
    */
    int KEY_KbdBrightnessDown = 269025030;

    /**
     * 
    */
    int KEY_KbdBrightnessUp = 269025029;

    /**
     * 
    */
    int KEY_KbdLightOnOff = 269025028;

    /**
     * 
    */
    int KEY_Kcedilla = 979;

    /**
     * 
    */
    int KEY_Keyboard = 269025203;

    /**
     * 
    */
    int KEY_Korean_Won = 3839;

    /**
     * 
    */
    int KEY_L = 76;

    /**
     * 
    */
    int KEY_L1 = 65480;

    /**
     * 
    */
    int KEY_L10 = 65489;

    /**
     * 
    */
    int KEY_L2 = 65481;

    /**
     * 
    */
    int KEY_L3 = 65482;

    /**
     * 
    */
    int KEY_L4 = 65483;

    /**
     * 
    */
    int KEY_L5 = 65484;

    /**
     * 
    */
    int KEY_L6 = 65485;

    /**
     * 
    */
    int KEY_L7 = 65486;

    /**
     * 
    */
    int KEY_L8 = 65487;

    /**
     * 
    */
    int KEY_L9 = 65488;

    /**
     * 
    */
    int KEY_Lacute = 453;

    /**
     * 
    */
    int KEY_Last_Virtual_Screen = 65236;

    /**
     * 
    */
    int KEY_Launch0 = 269025088;

    /**
     * 
    */
    int KEY_Launch1 = 269025089;

    /**
     * 
    */
    int KEY_Launch2 = 269025090;

    /**
     * 
    */
    int KEY_Launch3 = 269025091;

    /**
     * 
    */
    int KEY_Launch4 = 269025092;

    /**
     * 
    */
    int KEY_Launch5 = 269025093;

    /**
     * 
    */
    int KEY_Launch6 = 269025094;

    /**
     * 
    */
    int KEY_Launch7 = 269025095;

    /**
     * 
    */
    int KEY_Launch8 = 269025096;

    /**
     * 
    */
    int KEY_Launch9 = 269025097;

    /**
     * 
    */
    int KEY_LaunchA = 269025098;

    /**
     * 
    */
    int KEY_LaunchB = 269025099;

    /**
     * 
    */
    int KEY_LaunchC = 269025100;

    /**
     * 
    */
    int KEY_LaunchD = 269025101;

    /**
     * 
    */
    int KEY_LaunchE = 269025102;

    /**
     * 
    */
    int KEY_LaunchF = 269025103;

    /**
     * 
    */
    int KEY_Lbelowdot = 16784950;

    /**
     * 
    */
    int KEY_Lcaron = 421;

    /**
     * 
    */
    int KEY_Lcedilla = 934;

    /**
     * 
    */
    int KEY_Left = 65361;

    /**
     * 
    */
    int KEY_LightBulb = 269025077;

    /**
     * 
    */
    int KEY_Linefeed = 65290;

    /**
     * 
    */
    int KEY_LiraSign = 16785572;

    /**
     * 
    */
    int KEY_LogGrabInfo = 269024805;

    /**
     * 
    */
    int KEY_LogOff = 269025121;

    /**
     * 
    */
    int KEY_LogWindowTree = 269024804;

    /**
     * 
    */
    int KEY_Lstroke = 419;

    /**
     * 
    */
    int KEY_M = 77;

    /**
     * 
    */
    int KEY_Mabovedot = 16784960;

    /**
     * 
    */
    int KEY_Macedonia_DSE = 1717;

    /**
     * 
    */
    int KEY_Macedonia_GJE = 1714;

    /**
     * 
    */
    int KEY_Macedonia_KJE = 1724;

    /**
     * 
    */
    int KEY_Macedonia_dse = 1701;

    /**
     * 
    */
    int KEY_Macedonia_gje = 1698;

    /**
     * 
    */
    int KEY_Macedonia_kje = 1708;

    /**
     * 
    */
    int KEY_Mae_Koho = 65342;

    /**
     * 
    */
    int KEY_Mail = 269025049;

    /**
     * 
    */
    int KEY_MailForward = 269025168;

    /**
     * 
    */
    int KEY_Market = 269025122;

    /**
     * 
    */
    int KEY_Massyo = 65324;

    /**
     * 
    */
    int KEY_Meeting = 269025123;

    /**
     * 
    */
    int KEY_Memo = 269025054;

    /**
     * 
    */
    int KEY_Menu = 65383;

    /**
     * 
    */
    int KEY_MenuKB = 269025125;

    /**
     * 
    */
    int KEY_MenuPB = 269025126;

    /**
     * 
    */
    int KEY_Messenger = 269025166;

    /**
     * 
    */
    int KEY_Meta_L = 65511;

    /**
     * 
    */
    int KEY_Meta_R = 65512;

    /**
     * 
    */
    int KEY_MillSign = 16785573;

    /**
     * 
    */
    int KEY_ModeLock = 269025025;

    /**
     * 
    */
    int KEY_Mode_switch = 65406;

    /**
     * 
    */
    int KEY_MonBrightnessDown = 269025027;

    /**
     * 
    */
    int KEY_MonBrightnessUp = 269025026;

    /**
     * 
    */
    int KEY_MouseKeys_Accel_Enable = 65143;

    /**
     * 
    */
    int KEY_MouseKeys_Enable = 65142;

    /**
     * 
    */
    int KEY_Muhenkan = 65314;

    /**
     * 
    */
    int KEY_Multi_key = 65312;

    /**
     * 
    */
    int KEY_MultipleCandidate = 65341;

    /**
     * 
    */
    int KEY_Music = 269025170;

    /**
     * 
    */
    int KEY_MyComputer = 269025075;

    /**
     * 
    */
    int KEY_MySites = 269025127;

    /**
     * 
    */
    int KEY_N = 78;

    /**
     * 
    */
    int KEY_Nacute = 465;

    /**
     * 
    */
    int KEY_NairaSign = 16785574;

    /**
     * 
    */
    int KEY_Ncaron = 466;

    /**
     * 
    */
    int KEY_Ncedilla = 977;

    /**
     * 
    */
    int KEY_New = 269025128;

    /**
     * 
    */
    int KEY_NewSheqelSign = 16785578;

    /**
     * 
    */
    int KEY_News = 269025129;

    /**
     * 
    */
    int KEY_Next = 65366;

    /**
     * 
    */
    int KEY_Next_VMode = 269024802;

    /**
     * 
    */
    int KEY_Next_Virtual_Screen = 65234;

    /**
     * 
    */
    int KEY_Ntilde = 209;

    /**
     * 
    */
    int KEY_Num_Lock = 65407;

    /**
     * 
    */
    int KEY_O = 79;

    /**
     * 
    */
    int KEY_OE = 5052;

    /**
     * 
    */
    int KEY_Oacute = 211;

    /**
     * 
    */
    int KEY_Obarred = 16777631;

    /**
     * 
    */
    int KEY_Obelowdot = 16785100;

    /**
     * 
    */
    int KEY_Ocaron = 16777681;

    /**
     * 
    */
    int KEY_Ocircumflex = 212;

    /**
     * 
    */
    int KEY_Ocircumflexacute = 16785104;

    /**
     * 
    */
    int KEY_Ocircumflexbelowdot = 16785112;

    /**
     * 
    */
    int KEY_Ocircumflexgrave = 16785106;

    /**
     * 
    */
    int KEY_Ocircumflexhook = 16785108;

    /**
     * 
    */
    int KEY_Ocircumflextilde = 16785110;

    /**
     * 
    */
    int KEY_Odiaeresis = 214;

    /**
     * 
    */
    int KEY_Odoubleacute = 469;

    /**
     * 
    */
    int KEY_OfficeHome = 269025130;

    /**
     * 
    */
    int KEY_Ograve = 210;

    /**
     * 
    */
    int KEY_Ohook = 16785102;

    /**
     * 
    */
    int KEY_Ohorn = 16777632;

    /**
     * 
    */
    int KEY_Ohornacute = 16785114;

    /**
     * 
    */
    int KEY_Ohornbelowdot = 16785122;

    /**
     * 
    */
    int KEY_Ohorngrave = 16785116;

    /**
     * 
    */
    int KEY_Ohornhook = 16785118;

    /**
     * 
    */
    int KEY_Ohorntilde = 16785120;

    /**
     * 
    */
    int KEY_Omacron = 978;

    /**
     * 
    */
    int KEY_Ooblique = 216;

    /**
     * 
    */
    int KEY_Open = 269025131;

    /**
     * 
    */
    int KEY_OpenURL = 269025080;

    /**
     * 
    */
    int KEY_Option = 269025132;

    /**
     * 
    */
    int KEY_Oslash = 216;

    /**
     * 
    */
    int KEY_Otilde = 213;

    /**
     * 
    */
    int KEY_Overlay1_Enable = 65144;

    /**
     * 
    */
    int KEY_Overlay2_Enable = 65145;

    /**
     * 
    */
    int KEY_P = 80;

    /**
     * 
    */
    int KEY_Pabovedot = 16784982;

    /**
     * 
    */
    int KEY_Page_Down = 65366;

    /**
     * 
    */
    int KEY_Page_Up = 65365;

    /**
     * 
    */
    int KEY_Paste = 269025133;

    /**
     * 
    */
    int KEY_Pause = 65299;

    /**
     * 
    */
    int KEY_PesetaSign = 16785575;

    /**
     * 
    */
    int KEY_Phone = 269025134;

    /**
     * 
    */
    int KEY_Pictures = 269025169;

    /**
     * 
    */
    int KEY_Pointer_Accelerate = 65274;

    /**
     * 
    */
    int KEY_Pointer_Button1 = 65257;

    /**
     * 
    */
    int KEY_Pointer_Button2 = 65258;

    /**
     * 
    */
    int KEY_Pointer_Button3 = 65259;

    /**
     * 
    */
    int KEY_Pointer_Button4 = 65260;

    /**
     * 
    */
    int KEY_Pointer_Button5 = 65261;

    /**
     * 
    */
    int KEY_Pointer_Button_Dflt = 65256;

    /**
     * 
    */
    int KEY_Pointer_DblClick1 = 65263;

    /**
     * 
    */
    int KEY_Pointer_DblClick2 = 65264;

    /**
     * 
    */
    int KEY_Pointer_DblClick3 = 65265;

    /**
     * 
    */
    int KEY_Pointer_DblClick4 = 65266;

    /**
     * 
    */
    int KEY_Pointer_DblClick5 = 65267;

    /**
     * 
    */
    int KEY_Pointer_DblClick_Dflt = 65262;

    /**
     * 
    */
    int KEY_Pointer_DfltBtnNext = 65275;

    /**
     * 
    */
    int KEY_Pointer_DfltBtnPrev = 65276;

    /**
     * 
    */
    int KEY_Pointer_Down = 65251;

    /**
     * 
    */
    int KEY_Pointer_DownLeft = 65254;

    /**
     * 
    */
    int KEY_Pointer_DownRight = 65255;

    /**
     * 
    */
    int KEY_Pointer_Drag1 = 65269;

    /**
     * 
    */
    int KEY_Pointer_Drag2 = 65270;

    /**
     * 
    */
    int KEY_Pointer_Drag3 = 65271;

    /**
     * 
    */
    int KEY_Pointer_Drag4 = 65272;

    /**
     * 
    */
    int KEY_Pointer_Drag5 = 65277;

    /**
     * 
    */
    int KEY_Pointer_Drag_Dflt = 65268;

    /**
     * 
    */
    int KEY_Pointer_EnableKeys = 65273;

    /**
     * 
    */
    int KEY_Pointer_Left = 65248;

    /**
     * 
    */
    int KEY_Pointer_Right = 65249;

    /**
     * 
    */
    int KEY_Pointer_Up = 65250;

    /**
     * 
    */
    int KEY_Pointer_UpLeft = 65252;

    /**
     * 
    */
    int KEY_Pointer_UpRight = 65253;

    /**
     * 
    */
    int KEY_PowerDown = 269025057;

    /**
     * 
    */
    int KEY_PowerOff = 269025066;

    /**
     * 
    */
    int KEY_Prev_VMode = 269024803;

    /**
     * 
    */
    int KEY_Prev_Virtual_Screen = 65233;

    /**
     * 
    */
    int KEY_PreviousCandidate = 65342;

    /**
     * 
    */
    int KEY_Print = 65377;

    /**
     * 
    */
    int KEY_Prior = 65365;

    /**
     * 
    */
    int KEY_Q = 81;

    /**
     * 
    */
    int KEY_R = 82;

    /**
     * 
    */
    int KEY_R1 = 65490;

    /**
     * 
    */
    int KEY_R10 = 65499;

    /**
     * 
    */
    int KEY_R11 = 65500;

    /**
     * 
    */
    int KEY_R12 = 65501;

    /**
     * 
    */
    int KEY_R13 = 65502;

    /**
     * 
    */
    int KEY_R14 = 65503;

    /**
     * 
    */
    int KEY_R15 = 65504;

    /**
     * 
    */
    int KEY_R2 = 65491;

    /**
     * 
    */
    int KEY_R3 = 65492;

    /**
     * 
    */
    int KEY_R4 = 65493;

    /**
     * 
    */
    int KEY_R5 = 65494;

    /**
     * 
    */
    int KEY_R6 = 65495;

    /**
     * 
    */
    int KEY_R7 = 65496;

    /**
     * 
    */
    int KEY_R8 = 65497;

    /**
     * 
    */
    int KEY_R9 = 65498;

    /**
     * 
    */
    int KEY_RFKill = 269025205;

    /**
     * 
    */
    int KEY_Racute = 448;

    /**
     * 
    */
    int KEY_Rcaron = 472;

    /**
     * 
    */
    int KEY_Rcedilla = 931;

    /**
     * 
    */
    int KEY_Red = 269025187;

    /**
     * 
    */
    int KEY_Redo = 65382;

    /**
     * 
    */
    int KEY_Refresh = 269025065;

    /**
     * 
    */
    int KEY_Reload = 269025139;

    /**
     * 
    */
    int KEY_RepeatKeys_Enable = 65138;

    /**
     * 
    */
    int KEY_Reply = 269025138;

    /**
     * 
    */
    int KEY_Return = 65293;

    /**
     * 
    */
    int KEY_Right = 65363;

    /**
     * 
    */
    int KEY_RockerDown = 269025060;

    /**
     * 
    */
    int KEY_RockerEnter = 269025061;

    /**
     * 
    */
    int KEY_RockerUp = 269025059;

    /**
     * 
    */
    int KEY_Romaji = 65316;

    /**
     * 
    */
    int KEY_RotateWindows = 269025140;

    /**
     * 
    */
    int KEY_RotationKB = 269025142;

    /**
     * 
    */
    int KEY_RotationPB = 269025141;

    /**
     * 
    */
    int KEY_RupeeSign = 16785576;

    /**
     * 
    */
    int KEY_S = 83;

    /**
     * 
    */
    int KEY_SCHWA = 16777615;

    /**
     * 
    */
    int KEY_Sabovedot = 16784992;

    /**
     * 
    */
    int KEY_Sacute = 422;

    /**
     * 
    */
    int KEY_Save = 269025143;

    /**
     * 
    */
    int KEY_Scaron = 425;

    /**
     * 
    */
    int KEY_Scedilla = 426;

    /**
     * 
    */
    int KEY_Scircumflex = 734;

    /**
     * 
    */
    int KEY_ScreenSaver = 269025069;

    /**
     * 
    */
    int KEY_ScrollClick = 269025146;

    /**
     * 
    */
    int KEY_ScrollDown = 269025145;

    /**
     * 
    */
    int KEY_ScrollUp = 269025144;

    /**
     * 
    */
    int KEY_Scroll_Lock = 65300;

    /**
     * 
    */
    int KEY_Search = 269025051;

    /**
     * 
    */
    int KEY_Select = 65376;

    /**
     * 
    */
    int KEY_SelectButton = 269025184;

    /**
     * 
    */
    int KEY_Send = 269025147;

    /**
     * 
    */
    int KEY_Serbian_DJE = 1713;

    /**
     * 
    */
    int KEY_Serbian_DZE = 1727;

    /**
     * 
    */
    int KEY_Serbian_JE = 1720;

    /**
     * 
    */
    int KEY_Serbian_LJE = 1721;

    /**
     * 
    */
    int KEY_Serbian_NJE = 1722;

    /**
     * 
    */
    int KEY_Serbian_TSHE = 1723;

    /**
     * 
    */
    int KEY_Serbian_dje = 1697;

    /**
     * 
    */
    int KEY_Serbian_dze = 1711;

    /**
     * 
    */
    int KEY_Serbian_je = 1704;

    /**
     * 
    */
    int KEY_Serbian_lje = 1705;

    /**
     * 
    */
    int KEY_Serbian_nje = 1706;

    /**
     * 
    */
    int KEY_Serbian_tshe = 1707;

    /**
     * 
    */
    int KEY_Shift_L = 65505;

    /**
     * 
    */
    int KEY_Shift_Lock = 65510;

    /**
     * 
    */
    int KEY_Shift_R = 65506;

    /**
     * 
    */
    int KEY_Shop = 269025078;

    /**
     * 
    */
    int KEY_SingleCandidate = 65340;

    /**
     * 
    */
    int KEY_Sinh_a = 16780677;

    /**
     * 
    */
    int KEY_Sinh_aa = 16780678;

    /**
     * 
    */
    int KEY_Sinh_aa2 = 16780751;

    /**
     * 
    */
    int KEY_Sinh_ae = 16780679;

    /**
     * 
    */
    int KEY_Sinh_ae2 = 16780752;

    /**
     * 
    */
    int KEY_Sinh_aee = 16780680;

    /**
     * 
    */
    int KEY_Sinh_aee2 = 16780753;

    /**
     * 
    */
    int KEY_Sinh_ai = 16780691;

    /**
     * 
    */
    int KEY_Sinh_ai2 = 16780763;

    /**
     * 
    */
    int KEY_Sinh_al = 16780746;

    /**
     * 
    */
    int KEY_Sinh_au = 16780694;

    /**
     * 
    */
    int KEY_Sinh_au2 = 16780766;

    /**
     * 
    */
    int KEY_Sinh_ba = 16780726;

    /**
     * 
    */
    int KEY_Sinh_bha = 16780727;

    /**
     * 
    */
    int KEY_Sinh_ca = 16780704;

    /**
     * 
    */
    int KEY_Sinh_cha = 16780705;

    /**
     * 
    */
    int KEY_Sinh_dda = 16780713;

    /**
     * 
    */
    int KEY_Sinh_ddha = 16780714;

    /**
     * 
    */
    int KEY_Sinh_dha = 16780719;

    /**
     * 
    */
    int KEY_Sinh_dhha = 16780720;

    /**
     * 
    */
    int KEY_Sinh_e = 16780689;

    /**
     * 
    */
    int KEY_Sinh_e2 = 16780761;

    /**
     * 
    */
    int KEY_Sinh_ee = 16780690;

    /**
     * 
    */
    int KEY_Sinh_ee2 = 16780762;

    /**
     * 
    */
    int KEY_Sinh_fa = 16780742;

    /**
     * 
    */
    int KEY_Sinh_ga = 16780700;

    /**
     * 
    */
    int KEY_Sinh_gha = 16780701;

    /**
     * 
    */
    int KEY_Sinh_h2 = 16780675;

    /**
     * 
    */
    int KEY_Sinh_ha = 16780740;

    /**
     * 
    */
    int KEY_Sinh_i = 16780681;

    /**
     * 
    */
    int KEY_Sinh_i2 = 16780754;

    /**
     * 
    */
    int KEY_Sinh_ii = 16780682;

    /**
     * 
    */
    int KEY_Sinh_ii2 = 16780755;

    /**
     * 
    */
    int KEY_Sinh_ja = 16780706;

    /**
     * 
    */
    int KEY_Sinh_jha = 16780707;

    /**
     * 
    */
    int KEY_Sinh_jnya = 16780709;

    /**
     * 
    */
    int KEY_Sinh_ka = 16780698;

    /**
     * 
    */
    int KEY_Sinh_kha = 16780699;

    /**
     * 
    */
    int KEY_Sinh_kunddaliya = 16780788;

    /**
     * 
    */
    int KEY_Sinh_la = 16780733;

    /**
     * 
    */
    int KEY_Sinh_lla = 16780741;

    /**
     * 
    */
    int KEY_Sinh_lu = 16780687;

    /**
     * 
    */
    int KEY_Sinh_lu2 = 16780767;

    /**
     * 
    */
    int KEY_Sinh_luu = 16780688;

    /**
     * 
    */
    int KEY_Sinh_luu2 = 16780787;

    /**
     * 
    */
    int KEY_Sinh_ma = 16780728;

    /**
     * 
    */
    int KEY_Sinh_mba = 16780729;

    /**
     * 
    */
    int KEY_Sinh_na = 16780721;

    /**
     * 
    */
    int KEY_Sinh_ndda = 16780716;

    /**
     * 
    */
    int KEY_Sinh_ndha = 16780723;

    /**
     * 
    */
    int KEY_Sinh_ng = 16780674;

    /**
     * 
    */
    int KEY_Sinh_ng2 = 16780702;

    /**
     * 
    */
    int KEY_Sinh_nga = 16780703;

    /**
     * 
    */
    int KEY_Sinh_nja = 16780710;

    /**
     * 
    */
    int KEY_Sinh_nna = 16780715;

    /**
     * 
    */
    int KEY_Sinh_nya = 16780708;

    /**
     * 
    */
    int KEY_Sinh_o = 16780692;

    /**
     * 
    */
    int KEY_Sinh_o2 = 16780764;

    /**
     * 
    */
    int KEY_Sinh_oo = 16780693;

    /**
     * 
    */
    int KEY_Sinh_oo2 = 16780765;

    /**
     * 
    */
    int KEY_Sinh_pa = 16780724;

    /**
     * 
    */
    int KEY_Sinh_pha = 16780725;

    /**
     * 
    */
    int KEY_Sinh_ra = 16780731;

    /**
     * 
    */
    int KEY_Sinh_ri = 16780685;

    /**
     * 
    */
    int KEY_Sinh_rii = 16780686;

    /**
     * 
    */
    int KEY_Sinh_ru2 = 16780760;

    /**
     * 
    */
    int KEY_Sinh_ruu2 = 16780786;

    /**
     * 
    */
    int KEY_Sinh_sa = 16780739;

    /**
     * 
    */
    int KEY_Sinh_sha = 16780737;

    /**
     * 
    */
    int KEY_Sinh_ssha = 16780738;

    /**
     * 
    */
    int KEY_Sinh_tha = 16780717;

    /**
     * 
    */
    int KEY_Sinh_thha = 16780718;

    /**
     * 
    */
    int KEY_Sinh_tta = 16780711;

    /**
     * 
    */
    int KEY_Sinh_ttha = 16780712;

    /**
     * 
    */
    int KEY_Sinh_u = 16780683;

    /**
     * 
    */
    int KEY_Sinh_u2 = 16780756;

    /**
     * 
    */
    int KEY_Sinh_uu = 16780684;

    /**
     * 
    */
    int KEY_Sinh_uu2 = 16780758;

    /**
     * 
    */
    int KEY_Sinh_va = 16780736;

    /**
     * 
    */
    int KEY_Sinh_ya = 16780730;

    /**
     * 
    */
    int KEY_Sleep = 269025071;

    /**
     * 
    */
    int KEY_SlowKeys_Enable = 65139;

    /**
     * 
    */
    int KEY_Spell = 269025148;

    /**
     * 
    */
    int KEY_SplitScreen = 269025149;

    /**
     * 
    */
    int KEY_Standby = 269025040;

    /**
     * 
    */
    int KEY_Start = 269025050;

    /**
     * 
    */
    int KEY_StickyKeys_Enable = 65141;

    /**
     * 
    */
    int KEY_Stop = 269025064;

    /**
     * 
    */
    int KEY_Subtitle = 269025178;

    /**
     * 
    */
    int KEY_Super_L = 65515;

    /**
     * 
    */
    int KEY_Super_R = 65516;

    /**
     * 
    */
    int KEY_Support = 269025150;

    /**
     * 
    */
    int KEY_Suspend = 269025191;

    /**
     * 
    */
    int KEY_Switch_VT_1 = 269024769;

    /**
     * 
    */
    int KEY_Switch_VT_10 = 269024778;

    /**
     * 
    */
    int KEY_Switch_VT_11 = 269024779;

    /**
     * 
    */
    int KEY_Switch_VT_12 = 269024780;

    /**
     * 
    */
    int KEY_Switch_VT_2 = 269024770;

    /**
     * 
    */
    int KEY_Switch_VT_3 = 269024771;

    /**
     * 
    */
    int KEY_Switch_VT_4 = 269024772;

    /**
     * 
    */
    int KEY_Switch_VT_5 = 269024773;

    /**
     * 
    */
    int KEY_Switch_VT_6 = 269024774;

    /**
     * 
    */
    int KEY_Switch_VT_7 = 269024775;

    /**
     * 
    */
    int KEY_Switch_VT_8 = 269024776;

    /**
     * 
    */
    int KEY_Switch_VT_9 = 269024777;

    /**
     * 
    */
    int KEY_Sys_Req = 65301;

    /**
     * 
    */
    int KEY_T = 84;

    /**
     * 
    */
    int KEY_THORN = 222;

    /**
     * 
    */
    int KEY_Tab = 65289;

    /**
     * 
    */
    int KEY_Tabovedot = 16785002;

    /**
     * 
    */
    int KEY_TaskPane = 269025151;

    /**
     * 
    */
    int KEY_Tcaron = 427;

    /**
     * 
    */
    int KEY_Tcedilla = 478;

    /**
     * 
    */
    int KEY_Terminal = 269025152;

    /**
     * 
    */
    int KEY_Terminate_Server = 65237;

    /**
     * 
    */
    int KEY_Thai_baht = 3551;

    /**
     * 
    */
    int KEY_Thai_bobaimai = 3514;

    /**
     * 
    */
    int KEY_Thai_chochan = 3496;

    /**
     * 
    */
    int KEY_Thai_chochang = 3498;

    /**
     * 
    */
    int KEY_Thai_choching = 3497;

    /**
     * 
    */
    int KEY_Thai_chochoe = 3500;

    /**
     * 
    */
    int KEY_Thai_dochada = 3502;

    /**
     * 
    */
    int KEY_Thai_dodek = 3508;

    /**
     * 
    */
    int KEY_Thai_fofa = 3517;

    /**
     * 
    */
    int KEY_Thai_fofan = 3519;

    /**
     * 
    */
    int KEY_Thai_hohip = 3531;

    /**
     * 
    */
    int KEY_Thai_honokhuk = 3534;

    /**
     * 
    */
    int KEY_Thai_khokhai = 3490;

    /**
     * 
    */
    int KEY_Thai_khokhon = 3493;

    /**
     * 
    */
    int KEY_Thai_khokhuat = 3491;

    /**
     * 
    */
    int KEY_Thai_khokhwai = 3492;

    /**
     * 
    */
    int KEY_Thai_khorakhang = 3494;

    /**
     * 
    */
    int KEY_Thai_kokai = 3489;

    /**
     * 
    */
    int KEY_Thai_lakkhangyao = 3557;

    /**
     * 
    */
    int KEY_Thai_lekchet = 3575;

    /**
     * 
    */
    int KEY_Thai_lekha = 3573;

    /**
     * 
    */
    int KEY_Thai_lekhok = 3574;

    /**
     * 
    */
    int KEY_Thai_lekkao = 3577;

    /**
     * 
    */
    int KEY_Thai_leknung = 3569;

    /**
     * 
    */
    int KEY_Thai_lekpaet = 3576;

    /**
     * 
    */
    int KEY_Thai_leksam = 3571;

    /**
     * 
    */
    int KEY_Thai_leksi = 3572;

    /**
     * 
    */
    int KEY_Thai_leksong = 3570;

    /**
     * 
    */
    int KEY_Thai_leksun = 3568;

    /**
     * 
    */
    int KEY_Thai_lochula = 3532;

    /**
     * 
    */
    int KEY_Thai_loling = 3525;

    /**
     * 
    */
    int KEY_Thai_lu = 3526;

    /**
     * 
    */
    int KEY_Thai_maichattawa = 3563;

    /**
     * 
    */
    int KEY_Thai_maiek = 3560;

    /**
     * 
    */
    int KEY_Thai_maihanakat = 3537;

    /**
     * 
    */
    int KEY_Thai_maihanakat_maitho = 3550;

    /**
     * 
    */
    int KEY_Thai_maitaikhu = 3559;

    /**
     * 
    */
    int KEY_Thai_maitho = 3561;

    /**
     * 
    */
    int KEY_Thai_maitri = 3562;

    /**
     * 
    */
    int KEY_Thai_maiyamok = 3558;

    /**
     * 
    */
    int KEY_Thai_moma = 3521;

    /**
     * 
    */
    int KEY_Thai_ngongu = 3495;

    /**
     * 
    */
    int KEY_Thai_nikhahit = 3565;

    /**
     * 
    */
    int KEY_Thai_nonen = 3507;

    /**
     * 
    */
    int KEY_Thai_nonu = 3513;

    /**
     * 
    */
    int KEY_Thai_oang = 3533;

    /**
     * 
    */
    int KEY_Thai_paiyannoi = 3535;

    /**
     * 
    */
    int KEY_Thai_phinthu = 3546;

    /**
     * 
    */
    int KEY_Thai_phophan = 3518;

    /**
     * 
    */
    int KEY_Thai_phophung = 3516;

    /**
     * 
    */
    int KEY_Thai_phosamphao = 3520;

    /**
     * 
    */
    int KEY_Thai_popla = 3515;

    /**
     * 
    */
    int KEY_Thai_rorua = 3523;

    /**
     * 
    */
    int KEY_Thai_ru = 3524;

    /**
     * 
    */
    int KEY_Thai_saraa = 3536;

    /**
     * 
    */
    int KEY_Thai_saraaa = 3538;

    /**
     * 
    */
    int KEY_Thai_saraae = 3553;

    /**
     * 
    */
    int KEY_Thai_saraaimaimalai = 3556;

    /**
     * 
    */
    int KEY_Thai_saraaimaimuan = 3555;

    /**
     * 
    */
    int KEY_Thai_saraam = 3539;

    /**
     * 
    */
    int KEY_Thai_sarae = 3552;

    /**
     * 
    */
    int KEY_Thai_sarai = 3540;

    /**
     * 
    */
    int KEY_Thai_saraii = 3541;

    /**
     * 
    */
    int KEY_Thai_sarao = 3554;

    /**
     * 
    */
    int KEY_Thai_sarau = 3544;

    /**
     * 
    */
    int KEY_Thai_saraue = 3542;

    /**
     * 
    */
    int KEY_Thai_sarauee = 3543;

    /**
     * 
    */
    int KEY_Thai_sarauu = 3545;

    /**
     * 
    */
    int KEY_Thai_sorusi = 3529;

    /**
     * 
    */
    int KEY_Thai_sosala = 3528;

    /**
     * 
    */
    int KEY_Thai_soso = 3499;

    /**
     * 
    */
    int KEY_Thai_sosua = 3530;

    /**
     * 
    */
    int KEY_Thai_thanthakhat = 3564;

    /**
     * 
    */
    int KEY_Thai_thonangmontho = 3505;

    /**
     * 
    */
    int KEY_Thai_thophuthao = 3506;

    /**
     * 
    */
    int KEY_Thai_thothahan = 3511;

    /**
     * 
    */
    int KEY_Thai_thothan = 3504;

    /**
     * 
    */
    int KEY_Thai_thothong = 3512;

    /**
     * 
    */
    int KEY_Thai_thothung = 3510;

    /**
     * 
    */
    int KEY_Thai_topatak = 3503;

    /**
     * 
    */
    int KEY_Thai_totao = 3509;

    /**
     * 
    */
    int KEY_Thai_wowaen = 3527;

    /**
     * 
    */
    int KEY_Thai_yoyak = 3522;

    /**
     * 
    */
    int KEY_Thai_yoying = 3501;

    /**
     * 
    */
    int KEY_Thorn = 222;

    /**
     * 
    */
    int KEY_Time = 269025183;

    /**
     * 
    */
    int KEY_ToDoList = 269025055;

    /**
     * 
    */
    int KEY_Tools = 269025153;

    /**
     * 
    */
    int KEY_TopMenu = 269025186;

    /**
     * 
    */
    int KEY_TouchpadOff = 269025201;

    /**
     * 
    */
    int KEY_TouchpadOn = 269025200;

    /**
     * 
    */
    int KEY_TouchpadToggle = 269025193;

    /**
     * 
    */
    int KEY_Touroku = 65323;

    /**
     * 
    */
    int KEY_Travel = 269025154;

    /**
     * 
    */
    int KEY_Tslash = 940;

    /**
     * 
    */
    int KEY_U = 85;

    /**
     * 
    */
    int KEY_UWB = 269025174;

    /**
     * 
    */
    int KEY_Uacute = 218;

    /**
     * 
    */
    int KEY_Ubelowdot = 16785124;

    /**
     * 
    */
    int KEY_Ubreve = 733;

    /**
     * 
    */
    int KEY_Ucircumflex = 219;

    /**
     * 
    */
    int KEY_Udiaeresis = 220;

    /**
     * 
    */
    int KEY_Udoubleacute = 475;

    /**
     * 
    */
    int KEY_Ugrave = 217;

    /**
     * 
    */
    int KEY_Uhook = 16785126;

    /**
     * 
    */
    int KEY_Uhorn = 16777647;

    /**
     * 
    */
    int KEY_Uhornacute = 16785128;

    /**
     * 
    */
    int KEY_Uhornbelowdot = 16785136;

    /**
     * 
    */
    int KEY_Uhorngrave = 16785130;

    /**
     * 
    */
    int KEY_Uhornhook = 16785132;

    /**
     * 
    */
    int KEY_Uhorntilde = 16785134;

    /**
     * 
    */
    int KEY_Ukrainian_GHE_WITH_UPTURN = 1725;

    /**
     * 
    */
    int KEY_Ukrainian_I = 1718;

    /**
     * 
    */
    int KEY_Ukrainian_IE = 1716;

    /**
     * 
    */
    int KEY_Ukrainian_YI = 1719;

    /**
     * 
    */
    int KEY_Ukrainian_ghe_with_upturn = 1709;

    /**
     * 
    */
    int KEY_Ukrainian_i = 1702;

    /**
     * 
    */
    int KEY_Ukrainian_ie = 1700;

    /**
     * 
    */
    int KEY_Ukrainian_yi = 1703;

    /**
     * 
    */
    int KEY_Ukranian_I = 1718;

    /**
     * 
    */
    int KEY_Ukranian_JE = 1716;

    /**
     * 
    */
    int KEY_Ukranian_YI = 1719;

    /**
     * 
    */
    int KEY_Ukranian_i = 1702;

    /**
     * 
    */
    int KEY_Ukranian_je = 1700;

    /**
     * 
    */
    int KEY_Ukranian_yi = 1703;

    /**
     * 
    */
    int KEY_Umacron = 990;

    /**
     * 
    */
    int KEY_Undo = 65381;

    /**
     * 
    */
    int KEY_Ungrab = 269024800;

    /**
     * 
    */
    int KEY_Uogonek = 985;

    /**
     * 
    */
    int KEY_Up = 65362;

    /**
     * 
    */
    int KEY_Uring = 473;

    /**
     * 
    */
    int KEY_User1KB = 269025157;

    /**
     * 
    */
    int KEY_User2KB = 269025158;

    /**
     * 
    */
    int KEY_UserPB = 269025156;

    /**
     * 
    */
    int KEY_Utilde = 989;

    /**
     * 
    */
    int KEY_V = 86;

    /**
     * 
    */
    int KEY_VendorHome = 269025076;

    /**
     * 
    */
    int KEY_Video = 269025159;

    /**
     * 
    */
    int KEY_View = 269025185;

    /**
     * 
    */
    int KEY_VoidSymbol = 16777215;

    /**
     * 
    */
    int KEY_W = 87;

    /**
     * 
    */
    int KEY_WLAN = 269025173;

    /**
     * 
    */
    int KEY_WWAN = 269025204;

    /**
     * 
    */
    int KEY_WWW = 269025070;

    /**
     * 
    */
    int KEY_Wacute = 16785026;

    /**
     * 
    */
    int KEY_WakeUp = 269025067;

    /**
     * 
    */
    int KEY_Wcircumflex = 16777588;

    /**
     * 
    */
    int KEY_Wdiaeresis = 16785028;

    /**
     * 
    */
    int KEY_WebCam = 269025167;

    /**
     * 
    */
    int KEY_Wgrave = 16785024;

    /**
     * 
    */
    int KEY_WheelButton = 269025160;

    /**
     * 
    */
    int KEY_WindowClear = 269025109;

    /**
     * 
    */
    int KEY_WonSign = 16785577;

    /**
     * 
    */
    int KEY_Word = 269025161;

    /**
     * 
    */
    int KEY_X = 88;

    /**
     * 
    */
    int KEY_Xabovedot = 16785034;

    /**
     * 
    */
    int KEY_Xfer = 269025162;

    /**
     * 
    */
    int KEY_Y = 89;

    /**
     * 
    */
    int KEY_Yacute = 221;

    /**
     * 
    */
    int KEY_Ybelowdot = 16785140;

    /**
     * 
    */
    int KEY_Ycircumflex = 16777590;

    /**
     * 
    */
    int KEY_Ydiaeresis = 5054;

    /**
     * 
    */
    int KEY_Yellow = 269025189;

    /**
     * 
    */
    int KEY_Ygrave = 16785138;

    /**
     * 
    */
    int KEY_Yhook = 16785142;

    /**
     * 
    */
    int KEY_Ytilde = 16785144;

    /**
     * 
    */
    int KEY_Z = 90;

    /**
     * 
    */
    int KEY_Zabovedot = 431;

    /**
     * 
    */
    int KEY_Zacute = 428;

    /**
     * 
    */
    int KEY_Zcaron = 430;

    /**
     * 
    */
    int KEY_Zen_Koho = 65341;

    /**
     * 
    */
    int KEY_Zenkaku = 65320;

    /**
     * 
    */
    int KEY_Zenkaku_Hankaku = 65322;

    /**
     * 
    */
    int KEY_ZoomIn = 269025163;

    /**
     * 
    */
    int KEY_ZoomOut = 269025164;

    /**
     * 
    */
    int KEY_Zstroke = 16777653;

    /**
     * 
    */
    int KEY_a = 97;

    /**
     * 
    */
    int KEY_aacute = 225;

    /**
     * 
    */
    int KEY_abelowdot = 16785057;

    /**
     * 
    */
    int KEY_abovedot = 511;

    /**
     * 
    */
    int KEY_abreve = 483;

    /**
     * 
    */
    int KEY_abreveacute = 16785071;

    /**
     * 
    */
    int KEY_abrevebelowdot = 16785079;

    /**
     * 
    */
    int KEY_abrevegrave = 16785073;

    /**
     * 
    */
    int KEY_abrevehook = 16785075;

    /**
     * 
    */
    int KEY_abrevetilde = 16785077;

    /**
     * 
    */
    int KEY_acircumflex = 226;

    /**
     * 
    */
    int KEY_acircumflexacute = 16785061;

    /**
     * 
    */
    int KEY_acircumflexbelowdot = 16785069;

    /**
     * 
    */
    int KEY_acircumflexgrave = 16785063;

    /**
     * 
    */
    int KEY_acircumflexhook = 16785065;

    /**
     * 
    */
    int KEY_acircumflextilde = 16785067;

    /**
     * 
    */
    int KEY_acute = 180;

    /**
     * 
    */
    int KEY_adiaeresis = 228;

    /**
     * 
    */
    int KEY_ae = 230;

    /**
     * 
    */
    int KEY_agrave = 224;

    /**
     * 
    */
    int KEY_ahook = 16785059;

    /**
     * 
    */
    int KEY_amacron = 992;

    /**
     * 
    */
    int KEY_ampersand = 38;

    /**
     * 
    */
    int KEY_aogonek = 433;

    /**
     * 
    */
    int KEY_apostrophe = 39;

    /**
     * 
    */
    int KEY_approxeq = 16785992;

    /**
     * 
    */
    int KEY_approximate = 2248;

    /**
     * 
    */
    int KEY_aring = 229;

    /**
     * 
    */
    int KEY_asciicircum = 94;

    /**
     * 
    */
    int KEY_asciitilde = 126;

    /**
     * 
    */
    int KEY_asterisk = 42;

    /**
     * 
    */
    int KEY_at = 64;

    /**
     * 
    */
    int KEY_atilde = 227;

    /**
     * 
    */
    int KEY_b = 98;

    /**
     * 
    */
    int KEY_babovedot = 16784899;

    /**
     * 
    */
    int KEY_backslash = 92;

    /**
     * 
    */
    int KEY_ballotcross = 2804;

    /**
     * 
    */
    int KEY_bar = 124;

    /**
     * 
    */
    int KEY_because = 16785973;

    /**
     * 
    */
    int KEY_blank = 2527;

    /**
     * 
    */
    int KEY_botintegral = 2213;

    /**
     * 
    */
    int KEY_botleftparens = 2220;

    /**
     * 
    */
    int KEY_botleftsqbracket = 2216;

    /**
     * 
    */
    int KEY_botleftsummation = 2226;

    /**
     * 
    */
    int KEY_botrightparens = 2222;

    /**
     * 
    */
    int KEY_botrightsqbracket = 2218;

    /**
     * 
    */
    int KEY_botrightsummation = 2230;

    /**
     * 
    */
    int KEY_bott = 2550;

    /**
     * 
    */
    int KEY_botvertsummationconnector = 2228;

    /**
     * 
    */
    int KEY_braceleft = 123;

    /**
     * 
    */
    int KEY_braceright = 125;

    /**
     * 
    */
    int KEY_bracketleft = 91;

    /**
     * 
    */
    int KEY_bracketright = 93;

    /**
     * 
    */
    int KEY_braille_blank = 16787456;

    /**
     * 
    */
    int KEY_braille_dot_1 = 65521;

    /**
     * 
    */
    int KEY_braille_dot_10 = 65530;

    /**
     * 
    */
    int KEY_braille_dot_2 = 65522;

    /**
     * 
    */
    int KEY_braille_dot_3 = 65523;

    /**
     * 
    */
    int KEY_braille_dot_4 = 65524;

    /**
     * 
    */
    int KEY_braille_dot_5 = 65525;

    /**
     * 
    */
    int KEY_braille_dot_6 = 65526;

    /**
     * 
    */
    int KEY_braille_dot_7 = 65527;

    /**
     * 
    */
    int KEY_braille_dot_8 = 65528;

    /**
     * 
    */
    int KEY_braille_dot_9 = 65529;

    /**
     * 
    */
    int KEY_braille_dots_1 = 16787457;

    /**
     * 
    */
    int KEY_braille_dots_12 = 16787459;

    /**
     * 
    */
    int KEY_braille_dots_123 = 16787463;

    /**
     * 
    */
    int KEY_braille_dots_1234 = 16787471;

    /**
     * 
    */
    int KEY_braille_dots_12345 = 16787487;

    /**
     * 
    */
    int KEY_braille_dots_123456 = 16787519;

    /**
     * 
    */
    int KEY_braille_dots_1234567 = 16787583;

    /**
     * 
    */
    int KEY_braille_dots_12345678 = 16787711;

    /**
     * 
    */
    int KEY_braille_dots_1234568 = 16787647;

    /**
     * 
    */
    int KEY_braille_dots_123457 = 16787551;

    /**
     * 
    */
    int KEY_braille_dots_1234578 = 16787679;

    /**
     * 
    */
    int KEY_braille_dots_123458 = 16787615;

    /**
     * 
    */
    int KEY_braille_dots_12346 = 16787503;

    /**
     * 
    */
    int KEY_braille_dots_123467 = 16787567;

    /**
     * 
    */
    int KEY_braille_dots_1234678 = 16787695;

    /**
     * 
    */
    int KEY_braille_dots_123468 = 16787631;

    /**
     * 
    */
    int KEY_braille_dots_12347 = 16787535;

    /**
     * 
    */
    int KEY_braille_dots_123478 = 16787663;

    /**
     * 
    */
    int KEY_braille_dots_12348 = 16787599;

    /**
     * 
    */
    int KEY_braille_dots_1235 = 16787479;

    /**
     * 
    */
    int KEY_braille_dots_12356 = 16787511;

    /**
     * 
    */
    int KEY_braille_dots_123567 = 16787575;

    /**
     * 
    */
    int KEY_braille_dots_1235678 = 16787703;

    /**
     * 
    */
    int KEY_braille_dots_123568 = 16787639;

    /**
     * 
    */
    int KEY_braille_dots_12357 = 16787543;

    /**
     * 
    */
    int KEY_braille_dots_123578 = 16787671;

    /**
     * 
    */
    int KEY_braille_dots_12358 = 16787607;

    /**
     * 
    */
    int KEY_braille_dots_1236 = 16787495;

    /**
     * 
    */
    int KEY_braille_dots_12367 = 16787559;

    /**
     * 
    */
    int KEY_braille_dots_123678 = 16787687;

    /**
     * 
    */
    int KEY_braille_dots_12368 = 16787623;

    /**
     * 
    */
    int KEY_braille_dots_1237 = 16787527;

    /**
     * 
    */
    int KEY_braille_dots_12378 = 16787655;

    /**
     * 
    */
    int KEY_braille_dots_1238 = 16787591;

    /**
     * 
    */
    int KEY_braille_dots_124 = 16787467;

    /**
     * 
    */
    int KEY_braille_dots_1245 = 16787483;

    /**
     * 
    */
    int KEY_braille_dots_12456 = 16787515;

    /**
     * 
    */
    int KEY_braille_dots_124567 = 16787579;

    /**
     * 
    */
    int KEY_braille_dots_1245678 = 16787707;

    /**
     * 
    */
    int KEY_braille_dots_124568 = 16787643;

    /**
     * 
    */
    int KEY_braille_dots_12457 = 16787547;

    /**
     * 
    */
    int KEY_braille_dots_124578 = 16787675;

    /**
     * 
    */
    int KEY_braille_dots_12458 = 16787611;

    /**
     * 
    */
    int KEY_braille_dots_1246 = 16787499;

    /**
     * 
    */
    int KEY_braille_dots_12467 = 16787563;

    /**
     * 
    */
    int KEY_braille_dots_124678 = 16787691;

    /**
     * 
    */
    int KEY_braille_dots_12468 = 16787627;

    /**
     * 
    */
    int KEY_braille_dots_1247 = 16787531;

    /**
     * 
    */
    int KEY_braille_dots_12478 = 16787659;

    /**
     * 
    */
    int KEY_braille_dots_1248 = 16787595;

    /**
     * 
    */
    int KEY_braille_dots_125 = 16787475;

    /**
     * 
    */
    int KEY_braille_dots_1256 = 16787507;

    /**
     * 
    */
    int KEY_braille_dots_12567 = 16787571;

    /**
     * 
    */
    int KEY_braille_dots_125678 = 16787699;

    /**
     * 
    */
    int KEY_braille_dots_12568 = 16787635;

    /**
     * 
    */
    int KEY_braille_dots_1257 = 16787539;

    /**
     * 
    */
    int KEY_braille_dots_12578 = 16787667;

    /**
     * 
    */
    int KEY_braille_dots_1258 = 16787603;

    /**
     * 
    */
    int KEY_braille_dots_126 = 16787491;

    /**
     * 
    */
    int KEY_braille_dots_1267 = 16787555;

    /**
     * 
    */
    int KEY_braille_dots_12678 = 16787683;

    /**
     * 
    */
    int KEY_braille_dots_1268 = 16787619;

    /**
     * 
    */
    int KEY_braille_dots_127 = 16787523;

    /**
     * 
    */
    int KEY_braille_dots_1278 = 16787651;

    /**
     * 
    */
    int KEY_braille_dots_128 = 16787587;

    /**
     * 
    */
    int KEY_braille_dots_13 = 16787461;

    /**
     * 
    */
    int KEY_braille_dots_134 = 16787469;

    /**
     * 
    */
    int KEY_braille_dots_1345 = 16787485;

    /**
     * 
    */
    int KEY_braille_dots_13456 = 16787517;

    /**
     * 
    */
    int KEY_braille_dots_134567 = 16787581;

    /**
     * 
    */
    int KEY_braille_dots_1345678 = 16787709;

    /**
     * 
    */
    int KEY_braille_dots_134568 = 16787645;

    /**
     * 
    */
    int KEY_braille_dots_13457 = 16787549;

    /**
     * 
    */
    int KEY_braille_dots_134578 = 16787677;

    /**
     * 
    */
    int KEY_braille_dots_13458 = 16787613;

    /**
     * 
    */
    int KEY_braille_dots_1346 = 16787501;

    /**
     * 
    */
    int KEY_braille_dots_13467 = 16787565;

    /**
     * 
    */
    int KEY_braille_dots_134678 = 16787693;

    /**
     * 
    */
    int KEY_braille_dots_13468 = 16787629;

    /**
     * 
    */
    int KEY_braille_dots_1347 = 16787533;

    /**
     * 
    */
    int KEY_braille_dots_13478 = 16787661;

    /**
     * 
    */
    int KEY_braille_dots_1348 = 16787597;

    /**
     * 
    */
    int KEY_braille_dots_135 = 16787477;

    /**
     * 
    */
    int KEY_braille_dots_1356 = 16787509;

    /**
     * 
    */
    int KEY_braille_dots_13567 = 16787573;

    /**
     * 
    */
    int KEY_braille_dots_135678 = 16787701;

    /**
     * 
    */
    int KEY_braille_dots_13568 = 16787637;

    /**
     * 
    */
    int KEY_braille_dots_1357 = 16787541;

    /**
     * 
    */
    int KEY_braille_dots_13578 = 16787669;

    /**
     * 
    */
    int KEY_braille_dots_1358 = 16787605;

    /**
     * 
    */
    int KEY_braille_dots_136 = 16787493;

    /**
     * 
    */
    int KEY_braille_dots_1367 = 16787557;

    /**
     * 
    */
    int KEY_braille_dots_13678 = 16787685;

    /**
     * 
    */
    int KEY_braille_dots_1368 = 16787621;

    /**
     * 
    */
    int KEY_braille_dots_137 = 16787525;

    /**
     * 
    */
    int KEY_braille_dots_1378 = 16787653;

    /**
     * 
    */
    int KEY_braille_dots_138 = 16787589;

    /**
     * 
    */
    int KEY_braille_dots_14 = 16787465;

    /**
     * 
    */
    int KEY_braille_dots_145 = 16787481;

    /**
     * 
    */
    int KEY_braille_dots_1456 = 16787513;

    /**
     * 
    */
    int KEY_braille_dots_14567 = 16787577;

    /**
     * 
    */
    int KEY_braille_dots_145678 = 16787705;

    /**
     * 
    */
    int KEY_braille_dots_14568 = 16787641;

    /**
     * 
    */
    int KEY_braille_dots_1457 = 16787545;

    /**
     * 
    */
    int KEY_braille_dots_14578 = 16787673;

    /**
     * 
    */
    int KEY_braille_dots_1458 = 16787609;

    /**
     * 
    */
    int KEY_braille_dots_146 = 16787497;

    /**
     * 
    */
    int KEY_braille_dots_1467 = 16787561;

    /**
     * 
    */
    int KEY_braille_dots_14678 = 16787689;

    /**
     * 
    */
    int KEY_braille_dots_1468 = 16787625;

    /**
     * 
    */
    int KEY_braille_dots_147 = 16787529;

    /**
     * 
    */
    int KEY_braille_dots_1478 = 16787657;

    /**
     * 
    */
    int KEY_braille_dots_148 = 16787593;

    /**
     * 
    */
    int KEY_braille_dots_15 = 16787473;

    /**
     * 
    */
    int KEY_braille_dots_156 = 16787505;

    /**
     * 
    */
    int KEY_braille_dots_1567 = 16787569;

    /**
     * 
    */
    int KEY_braille_dots_15678 = 16787697;

    /**
     * 
    */
    int KEY_braille_dots_1568 = 16787633;

    /**
     * 
    */
    int KEY_braille_dots_157 = 16787537;

    /**
     * 
    */
    int KEY_braille_dots_1578 = 16787665;

    /**
     * 
    */
    int KEY_braille_dots_158 = 16787601;

    /**
     * 
    */
    int KEY_braille_dots_16 = 16787489;

    /**
     * 
    */
    int KEY_braille_dots_167 = 16787553;

    /**
     * 
    */
    int KEY_braille_dots_1678 = 16787681;

    /**
     * 
    */
    int KEY_braille_dots_168 = 16787617;

    /**
     * 
    */
    int KEY_braille_dots_17 = 16787521;

    /**
     * 
    */
    int KEY_braille_dots_178 = 16787649;

    /**
     * 
    */
    int KEY_braille_dots_18 = 16787585;

    /**
     * 
    */
    int KEY_braille_dots_2 = 16787458;

    /**
     * 
    */
    int KEY_braille_dots_23 = 16787462;

    /**
     * 
    */
    int KEY_braille_dots_234 = 16787470;

    /**
     * 
    */
    int KEY_braille_dots_2345 = 16787486;

    /**
     * 
    */
    int KEY_braille_dots_23456 = 16787518;

    /**
     * 
    */
    int KEY_braille_dots_234567 = 16787582;

    /**
     * 
    */
    int KEY_braille_dots_2345678 = 16787710;

    /**
     * 
    */
    int KEY_braille_dots_234568 = 16787646;

    /**
     * 
    */
    int KEY_braille_dots_23457 = 16787550;

    /**
     * 
    */
    int KEY_braille_dots_234578 = 16787678;

    /**
     * 
    */
    int KEY_braille_dots_23458 = 16787614;

    /**
     * 
    */
    int KEY_braille_dots_2346 = 16787502;

    /**
     * 
    */
    int KEY_braille_dots_23467 = 16787566;

    /**
     * 
    */
    int KEY_braille_dots_234678 = 16787694;

    /**
     * 
    */
    int KEY_braille_dots_23468 = 16787630;

    /**
     * 
    */
    int KEY_braille_dots_2347 = 16787534;

    /**
     * 
    */
    int KEY_braille_dots_23478 = 16787662;

    /**
     * 
    */
    int KEY_braille_dots_2348 = 16787598;

    /**
     * 
    */
    int KEY_braille_dots_235 = 16787478;

    /**
     * 
    */
    int KEY_braille_dots_2356 = 16787510;

    /**
     * 
    */
    int KEY_braille_dots_23567 = 16787574;

    /**
     * 
    */
    int KEY_braille_dots_235678 = 16787702;

    /**
     * 
    */
    int KEY_braille_dots_23568 = 16787638;

    /**
     * 
    */
    int KEY_braille_dots_2357 = 16787542;

    /**
     * 
    */
    int KEY_braille_dots_23578 = 16787670;

    /**
     * 
    */
    int KEY_braille_dots_2358 = 16787606;

    /**
     * 
    */
    int KEY_braille_dots_236 = 16787494;

    /**
     * 
    */
    int KEY_braille_dots_2367 = 16787558;

    /**
     * 
    */
    int KEY_braille_dots_23678 = 16787686;

    /**
     * 
    */
    int KEY_braille_dots_2368 = 16787622;

    /**
     * 
    */
    int KEY_braille_dots_237 = 16787526;

    /**
     * 
    */
    int KEY_braille_dots_2378 = 16787654;

    /**
     * 
    */
    int KEY_braille_dots_238 = 16787590;

    /**
     * 
    */
    int KEY_braille_dots_24 = 16787466;

    /**
     * 
    */
    int KEY_braille_dots_245 = 16787482;

    /**
     * 
    */
    int KEY_braille_dots_2456 = 16787514;

    /**
     * 
    */
    int KEY_braille_dots_24567 = 16787578;

    /**
     * 
    */
    int KEY_braille_dots_245678 = 16787706;

    /**
     * 
    */
    int KEY_braille_dots_24568 = 16787642;

    /**
     * 
    */
    int KEY_braille_dots_2457 = 16787546;

    /**
     * 
    */
    int KEY_braille_dots_24578 = 16787674;

    /**
     * 
    */
    int KEY_braille_dots_2458 = 16787610;

    /**
     * 
    */
    int KEY_braille_dots_246 = 16787498;

    /**
     * 
    */
    int KEY_braille_dots_2467 = 16787562;

    /**
     * 
    */
    int KEY_braille_dots_24678 = 16787690;

    /**
     * 
    */
    int KEY_braille_dots_2468 = 16787626;

    /**
     * 
    */
    int KEY_braille_dots_247 = 16787530;

    /**
     * 
    */
    int KEY_braille_dots_2478 = 16787658;

    /**
     * 
    */
    int KEY_braille_dots_248 = 16787594;

    /**
     * 
    */
    int KEY_braille_dots_25 = 16787474;

    /**
     * 
    */
    int KEY_braille_dots_256 = 16787506;

    /**
     * 
    */
    int KEY_braille_dots_2567 = 16787570;

    /**
     * 
    */
    int KEY_braille_dots_25678 = 16787698;

    /**
     * 
    */
    int KEY_braille_dots_2568 = 16787634;

    /**
     * 
    */
    int KEY_braille_dots_257 = 16787538;

    /**
     * 
    */
    int KEY_braille_dots_2578 = 16787666;

    /**
     * 
    */
    int KEY_braille_dots_258 = 16787602;

    /**
     * 
    */
    int KEY_braille_dots_26 = 16787490;

    /**
     * 
    */
    int KEY_braille_dots_267 = 16787554;

    /**
     * 
    */
    int KEY_braille_dots_2678 = 16787682;

    /**
     * 
    */
    int KEY_braille_dots_268 = 16787618;

    /**
     * 
    */
    int KEY_braille_dots_27 = 16787522;

    /**
     * 
    */
    int KEY_braille_dots_278 = 16787650;

    /**
     * 
    */
    int KEY_braille_dots_28 = 16787586;

    /**
     * 
    */
    int KEY_braille_dots_3 = 16787460;

    /**
     * 
    */
    int KEY_braille_dots_34 = 16787468;

    /**
     * 
    */
    int KEY_braille_dots_345 = 16787484;

    /**
     * 
    */
    int KEY_braille_dots_3456 = 16787516;

    /**
     * 
    */
    int KEY_braille_dots_34567 = 16787580;

    /**
     * 
    */
    int KEY_braille_dots_345678 = 16787708;

    /**
     * 
    */
    int KEY_braille_dots_34568 = 16787644;

    /**
     * 
    */
    int KEY_braille_dots_3457 = 16787548;

    /**
     * 
    */
    int KEY_braille_dots_34578 = 16787676;

    /**
     * 
    */
    int KEY_braille_dots_3458 = 16787612;

    /**
     * 
    */
    int KEY_braille_dots_346 = 16787500;

    /**
     * 
    */
    int KEY_braille_dots_3467 = 16787564;

    /**
     * 
    */
    int KEY_braille_dots_34678 = 16787692;

    /**
     * 
    */
    int KEY_braille_dots_3468 = 16787628;

    /**
     * 
    */
    int KEY_braille_dots_347 = 16787532;

    /**
     * 
    */
    int KEY_braille_dots_3478 = 16787660;

    /**
     * 
    */
    int KEY_braille_dots_348 = 16787596;

    /**
     * 
    */
    int KEY_braille_dots_35 = 16787476;

    /**
     * 
    */
    int KEY_braille_dots_356 = 16787508;

    /**
     * 
    */
    int KEY_braille_dots_3567 = 16787572;

    /**
     * 
    */
    int KEY_braille_dots_35678 = 16787700;

    /**
     * 
    */
    int KEY_braille_dots_3568 = 16787636;

    /**
     * 
    */
    int KEY_braille_dots_357 = 16787540;

    /**
     * 
    */
    int KEY_braille_dots_3578 = 16787668;

    /**
     * 
    */
    int KEY_braille_dots_358 = 16787604;

    /**
     * 
    */
    int KEY_braille_dots_36 = 16787492;

    /**
     * 
    */
    int KEY_braille_dots_367 = 16787556;

    /**
     * 
    */
    int KEY_braille_dots_3678 = 16787684;

    /**
     * 
    */
    int KEY_braille_dots_368 = 16787620;

    /**
     * 
    */
    int KEY_braille_dots_37 = 16787524;

    /**
     * 
    */
    int KEY_braille_dots_378 = 16787652;

    /**
     * 
    */
    int KEY_braille_dots_38 = 16787588;

    /**
     * 
    */
    int KEY_braille_dots_4 = 16787464;

    /**
     * 
    */
    int KEY_braille_dots_45 = 16787480;

    /**
     * 
    */
    int KEY_braille_dots_456 = 16787512;

    /**
     * 
    */
    int KEY_braille_dots_4567 = 16787576;

    /**
     * 
    */
    int KEY_braille_dots_45678 = 16787704;

    /**
     * 
    */
    int KEY_braille_dots_4568 = 16787640;

    /**
     * 
    */
    int KEY_braille_dots_457 = 16787544;

    /**
     * 
    */
    int KEY_braille_dots_4578 = 16787672;

    /**
     * 
    */
    int KEY_braille_dots_458 = 16787608;

    /**
     * 
    */
    int KEY_braille_dots_46 = 16787496;

    /**
     * 
    */
    int KEY_braille_dots_467 = 16787560;

    /**
     * 
    */
    int KEY_braille_dots_4678 = 16787688;

    /**
     * 
    */
    int KEY_braille_dots_468 = 16787624;

    /**
     * 
    */
    int KEY_braille_dots_47 = 16787528;

    /**
     * 
    */
    int KEY_braille_dots_478 = 16787656;

    /**
     * 
    */
    int KEY_braille_dots_48 = 16787592;

    /**
     * 
    */
    int KEY_braille_dots_5 = 16787472;

    /**
     * 
    */
    int KEY_braille_dots_56 = 16787504;

    /**
     * 
    */
    int KEY_braille_dots_567 = 16787568;

    /**
     * 
    */
    int KEY_braille_dots_5678 = 16787696;

    /**
     * 
    */
    int KEY_braille_dots_568 = 16787632;

    /**
     * 
    */
    int KEY_braille_dots_57 = 16787536;

    /**
     * 
    */
    int KEY_braille_dots_578 = 16787664;

    /**
     * 
    */
    int KEY_braille_dots_58 = 16787600;

    /**
     * 
    */
    int KEY_braille_dots_6 = 16787488;

    /**
     * 
    */
    int KEY_braille_dots_67 = 16787552;

    /**
     * 
    */
    int KEY_braille_dots_678 = 16787680;

    /**
     * 
    */
    int KEY_braille_dots_68 = 16787616;

    /**
     * 
    */
    int KEY_braille_dots_7 = 16787520;

    /**
     * 
    */
    int KEY_braille_dots_78 = 16787648;

    /**
     * 
    */
    int KEY_braille_dots_8 = 16787584;

    /**
     * 
    */
    int KEY_breve = 418;

    /**
     * 
    */
    int KEY_brokenbar = 166;

    /**
     * 
    */
    int KEY_c = 99;

    /**
     * 
    */
    int KEY_c_h = 65187;

    /**
     * 
    */
    int KEY_cabovedot = 741;

    /**
     * 
    */
    int KEY_cacute = 486;

    /**
     * 
    */
    int KEY_careof = 2744;

    /**
     * 
    */
    int KEY_caret = 2812;

    /**
     * 
    */
    int KEY_caron = 439;

    /**
     * 
    */
    int KEY_ccaron = 488;

    /**
     * 
    */
    int KEY_ccedilla = 231;

    /**
     * 
    */
    int KEY_ccircumflex = 742;

    /**
     * 
    */
    int KEY_cedilla = 184;

    /**
     * 
    */
    int KEY_cent = 162;

    /**
     * 
    */
    int KEY_ch = 65184;

    /**
     * 
    */
    int KEY_checkerboard = 2529;

    /**
     * 
    */
    int KEY_checkmark = 2803;

    /**
     * 
    */
    int KEY_circle = 3023;

    /**
     * 
    */
    int KEY_club = 2796;

    /**
     * 
    */
    int KEY_colon = 58;

    /**
     * 
    */
    int KEY_comma = 44;

    /**
     * 
    */
    int KEY_containsas = 16785931;

    /**
     * 
    */
    int KEY_copyright = 169;

    /**
     * 
    */
    int KEY_cr = 2532;

    /**
     * 
    */
    int KEY_crossinglines = 2542;

    /**
     * 
    */
    int KEY_cuberoot = 16785947;

    /**
     * 
    */
    int KEY_currency = 164;

    /**
     * 
    */
    int KEY_cursor = 2815;

    /**
     * 
    */
    int KEY_d = 100;

    /**
     * 
    */
    int KEY_dabovedot = 16784907;

    /**
     * 
    */
    int KEY_dagger = 2801;

    /**
     * 
    */
    int KEY_dcaron = 495;

    /**
     * 
    */
    int KEY_dead_A = 65153;

    /**
     * 
    */
    int KEY_dead_E = 65155;

    /**
     * 
    */
    int KEY_dead_I = 65157;

    /**
     * 
    */
    int KEY_dead_O = 65159;

    /**
     * 
    */
    int KEY_dead_U = 65161;

    /**
     * 
    */
    int KEY_dead_a = 65152;

    /**
     * 
    */
    int KEY_dead_abovecomma = 65124;

    /**
     * 
    */
    int KEY_dead_abovedot = 65110;

    /**
     * 
    */
    int KEY_dead_abovereversedcomma = 65125;

    /**
     * 
    */
    int KEY_dead_abovering = 65112;

    /**
     * 
    */
    int KEY_dead_aboveverticalline = 65169;

    /**
     * 
    */
    int KEY_dead_acute = 65105;

    /**
     * 
    */
    int KEY_dead_belowbreve = 65131;

    /**
     * 
    */
    int KEY_dead_belowcircumflex = 65129;

    /**
     * 
    */
    int KEY_dead_belowcomma = 65134;

    /**
     * 
    */
    int KEY_dead_belowdiaeresis = 65132;

    /**
     * 
    */
    int KEY_dead_belowdot = 65120;

    /**
     * 
    */
    int KEY_dead_belowmacron = 65128;

    /**
     * 
    */
    int KEY_dead_belowring = 65127;

    /**
     * 
    */
    int KEY_dead_belowtilde = 65130;

    /**
     * 
    */
    int KEY_dead_belowverticalline = 65170;

    /**
     * 
    */
    int KEY_dead_breve = 65109;

    /**
     * 
    */
    int KEY_dead_capital_schwa = 65163;

    /**
     * 
    */
    int KEY_dead_caron = 65114;

    /**
     * 
    */
    int KEY_dead_cedilla = 65115;

    /**
     * 
    */
    int KEY_dead_circumflex = 65106;

    /**
     * 
    */
    int KEY_dead_currency = 65135;

    /**
     * 
    */
    int KEY_dead_dasia = 65125;

    /**
     * 
    */
    int KEY_dead_diaeresis = 65111;

    /**
     * 
    */
    int KEY_dead_doubleacute = 65113;

    /**
     * 
    */
    int KEY_dead_doublegrave = 65126;

    /**
     * 
    */
    int KEY_dead_e = 65154;

    /**
     * 
    */
    int KEY_dead_grave = 65104;

    /**
     * 
    */
    int KEY_dead_greek = 65164;

    /**
     * 
    */
    int KEY_dead_hook = 65121;

    /**
     * 
    */
    int KEY_dead_horn = 65122;

    /**
     * 
    */
    int KEY_dead_i = 65156;

    /**
     * 
    */
    int KEY_dead_invertedbreve = 65133;

    /**
     * 
    */
    int KEY_dead_iota = 65117;

    /**
     * 
    */
    int KEY_dead_longsolidusoverlay = 65171;

    /**
     * 
    */
    int KEY_dead_lowline = 65168;

    /**
     * 
    */
    int KEY_dead_macron = 65108;

    /**
     * 
    */
    int KEY_dead_o = 65158;

    /**
     * 
    */
    int KEY_dead_ogonek = 65116;

    /**
     * 
    */
    int KEY_dead_perispomeni = 65107;

    /**
     * 
    */
    int KEY_dead_psili = 65124;

    /**
     * 
    */
    int KEY_dead_semivoiced_sound = 65119;

    /**
     * 
    */
    int KEY_dead_small_schwa = 65162;

    /**
     * 
    */
    int KEY_dead_stroke = 65123;

    /**
     * 
    */
    int KEY_dead_tilde = 65107;

    /**
     * 
    */
    int KEY_dead_u = 65160;

    /**
     * 
    */
    int KEY_dead_voiced_sound = 65118;

    /**
     * 
    */
    int KEY_decimalpoint = 2749;

    /**
     * 
    */
    int KEY_degree = 176;

    /**
     * 
    */
    int KEY_diaeresis = 168;

    /**
     * 
    */
    int KEY_diamond = 2797;

    /**
     * 
    */
    int KEY_digitspace = 2725;

    /**
     * 
    */
    int KEY_dintegral = 16785964;

    /**
     * 
    */
    int KEY_division = 247;

    /**
     * 
    */
    int KEY_dollar = 36;

    /**
     * 
    */
    int KEY_doubbaselinedot = 2735;

    /**
     * 
    */
    int KEY_doubleacute = 445;

    /**
     * 
    */
    int KEY_doubledagger = 2802;

    /**
     * 
    */
    int KEY_doublelowquotemark = 2814;

    /**
     * 
    */
    int KEY_downarrow = 2302;

    /**
     * 
    */
    int KEY_downcaret = 2984;

    /**
     * 
    */
    int KEY_downshoe = 3030;

    /**
     * 
    */
    int KEY_downstile = 3012;

    /**
     * 
    */
    int KEY_downtack = 3010;

    /**
     * 
    */
    int KEY_dstroke = 496;

    /**
     * 
    */
    int KEY_e = 101;

    /**
     * 
    */
    int KEY_eabovedot = 1004;

    /**
     * 
    */
    int KEY_eacute = 233;

    /**
     * 
    */
    int KEY_ebelowdot = 16785081;

    /**
     * 
    */
    int KEY_ecaron = 492;

    /**
     * 
    */
    int KEY_ecircumflex = 234;

    /**
     * 
    */
    int KEY_ecircumflexacute = 16785087;

    /**
     * 
    */
    int KEY_ecircumflexbelowdot = 16785095;

    /**
     * 
    */
    int KEY_ecircumflexgrave = 16785089;

    /**
     * 
    */
    int KEY_ecircumflexhook = 16785091;

    /**
     * 
    */
    int KEY_ecircumflextilde = 16785093;

    /**
     * 
    */
    int KEY_ediaeresis = 235;

    /**
     * 
    */
    int KEY_egrave = 232;

    /**
     * 
    */
    int KEY_ehook = 16785083;

    /**
     * 
    */
    int KEY_eightsubscript = 16785544;

    /**
     * 
    */
    int KEY_eightsuperior = 16785528;

    /**
     * 
    */
    int KEY_elementof = 16785928;

    /**
     * 
    */
    int KEY_ellipsis = 2734;

    /**
     * 
    */
    int KEY_em3space = 2723;

    /**
     * 
    */
    int KEY_em4space = 2724;

    /**
     * 
    */
    int KEY_emacron = 954;

    /**
     * 
    */
    int KEY_emdash = 2729;

    /**
     * 
    */
    int KEY_emfilledcircle = 2782;

    /**
     * 
    */
    int KEY_emfilledrect = 2783;

    /**
     * 
    */
    int KEY_emopencircle = 2766;

    /**
     * 
    */
    int KEY_emopenrectangle = 2767;

    /**
     * 
    */
    int KEY_emptyset = 16785925;

    /**
     * 
    */
    int KEY_emspace = 2721;

    /**
     * 
    */
    int KEY_endash = 2730;

    /**
     * 
    */
    int KEY_enfilledcircbullet = 2790;

    /**
     * 
    */
    int KEY_enfilledsqbullet = 2791;

    /**
     * 
    */
    int KEY_eng = 959;

    /**
     * 
    */
    int KEY_enopencircbullet = 2784;

    /**
     * 
    */
    int KEY_enopensquarebullet = 2785;

    /**
     * 
    */
    int KEY_enspace = 2722;

    /**
     * 
    */
    int KEY_eogonek = 490;

    /**
     * 
    */
    int KEY_equal = 61;

    /**
     * 
    */
    int KEY_eth = 240;

    /**
     * 
    */
    int KEY_etilde = 16785085;

    /**
     * 
    */
    int KEY_exclam = 33;

    /**
     * 
    */
    int KEY_exclamdown = 161;

    /**
     * 
    */
    int KEY_ezh = 16777874;

    /**
     * 
    */
    int KEY_f = 102;

    /**
     * 
    */
    int KEY_fabovedot = 16784927;

    /**
     * 
    */
    int KEY_femalesymbol = 2808;

    /**
     * 
    */
    int KEY_ff = 2531;

    /**
     * 
    */
    int KEY_figdash = 2747;

    /**
     * 
    */
    int KEY_filledlefttribullet = 2780;

    /**
     * 
    */
    int KEY_filledrectbullet = 2779;

    /**
     * 
    */
    int KEY_filledrighttribullet = 2781;

    /**
     * 
    */
    int KEY_filledtribulletdown = 2793;

    /**
     * 
    */
    int KEY_filledtribulletup = 2792;

    /**
     * 
    */
    int KEY_fiveeighths = 2757;

    /**
     * 
    */
    int KEY_fivesixths = 2743;

    /**
     * 
    */
    int KEY_fivesubscript = 16785541;

    /**
     * 
    */
    int KEY_fivesuperior = 16785525;

    /**
     * 
    */
    int KEY_fourfifths = 2741;

    /**
     * 
    */
    int KEY_foursubscript = 16785540;

    /**
     * 
    */
    int KEY_foursuperior = 16785524;

    /**
     * 
    */
    int KEY_fourthroot = 16785948;

    /**
     * 
    */
    int KEY_function = 2294;

    /**
     * 
    */
    int KEY_g = 103;

    /**
     * 
    */
    int KEY_gabovedot = 757;

    /**
     * 
    */
    int KEY_gbreve = 699;

    /**
     * 
    */
    int KEY_gcaron = 16777703;

    /**
     * 
    */
    int KEY_gcedilla = 955;

    /**
     * 
    */
    int KEY_gcircumflex = 760;

    /**
     * 
    */
    int KEY_grave = 96;

    /**
     * 
    */
    int KEY_greater = 62;

    /**
     * 
    */
    int KEY_greaterthanequal = 2238;

    /**
     * 
    */
    int KEY_guillemotleft = 171;

    /**
     * 
    */
    int KEY_guillemotright = 187;

    /**
     * 
    */
    int KEY_h = 104;

    /**
     * 
    */
    int KEY_hairspace = 2728;

    /**
     * 
    */
    int KEY_hcircumflex = 694;

    /**
     * 
    */
    int KEY_heart = 2798;

    /**
     * 
    */
    int KEY_hebrew_aleph = 3296;

    /**
     * 
    */
    int KEY_hebrew_ayin = 3314;

    /**
     * 
    */
    int KEY_hebrew_bet = 3297;

    /**
     * 
    */
    int KEY_hebrew_beth = 3297;

    /**
     * 
    */
    int KEY_hebrew_chet = 3303;

    /**
     * 
    */
    int KEY_hebrew_dalet = 3299;

    /**
     * 
    */
    int KEY_hebrew_daleth = 3299;

    /**
     * 
    */
    int KEY_hebrew_doublelowline = 3295;

    /**
     * 
    */
    int KEY_hebrew_finalkaph = 3306;

    /**
     * 
    */
    int KEY_hebrew_finalmem = 3309;

    /**
     * 
    */
    int KEY_hebrew_finalnun = 3311;

    /**
     * 
    */
    int KEY_hebrew_finalpe = 3315;

    /**
     * 
    */
    int KEY_hebrew_finalzade = 3317;

    /**
     * 
    */
    int KEY_hebrew_finalzadi = 3317;

    /**
     * 
    */
    int KEY_hebrew_gimel = 3298;

    /**
     * 
    */
    int KEY_hebrew_gimmel = 3298;

    /**
     * 
    */
    int KEY_hebrew_he = 3300;

    /**
     * 
    */
    int KEY_hebrew_het = 3303;

    /**
     * 
    */
    int KEY_hebrew_kaph = 3307;

    /**
     * 
    */
    int KEY_hebrew_kuf = 3319;

    /**
     * 
    */
    int KEY_hebrew_lamed = 3308;

    /**
     * 
    */
    int KEY_hebrew_mem = 3310;

    /**
     * 
    */
    int KEY_hebrew_nun = 3312;

    /**
     * 
    */
    int KEY_hebrew_pe = 3316;

    /**
     * 
    */
    int KEY_hebrew_qoph = 3319;

    /**
     * 
    */
    int KEY_hebrew_resh = 3320;

    /**
     * 
    */
    int KEY_hebrew_samech = 3313;

    /**
     * 
    */
    int KEY_hebrew_samekh = 3313;

    /**
     * 
    */
    int KEY_hebrew_shin = 3321;

    /**
     * 
    */
    int KEY_hebrew_taf = 3322;

    /**
     * 
    */
    int KEY_hebrew_taw = 3322;

    /**
     * 
    */
    int KEY_hebrew_tet = 3304;

    /**
     * 
    */
    int KEY_hebrew_teth = 3304;

    /**
     * 
    */
    int KEY_hebrew_waw = 3301;

    /**
     * 
    */
    int KEY_hebrew_yod = 3305;

    /**
     * 
    */
    int KEY_hebrew_zade = 3318;

    /**
     * 
    */
    int KEY_hebrew_zadi = 3318;

    /**
     * 
    */
    int KEY_hebrew_zain = 3302;

    /**
     * 
    */
    int KEY_hebrew_zayin = 3302;

    /**
     * 
    */
    int KEY_hexagram = 2778;

    /**
     * 
    */
    int KEY_horizconnector = 2211;

    /**
     * 
    */
    int KEY_horizlinescan1 = 2543;

    /**
     * 
    */
    int KEY_horizlinescan3 = 2544;

    /**
     * 
    */
    int KEY_horizlinescan5 = 2545;

    /**
     * 
    */
    int KEY_horizlinescan7 = 2546;

    /**
     * 
    */
    int KEY_horizlinescan9 = 2547;

    /**
     * 
    */
    int KEY_hstroke = 689;

    /**
     * 
    */
    int KEY_ht = 2530;

    /**
     * 
    */
    int KEY_hyphen = 173;

    /**
     * 
    */
    int KEY_i = 105;

    /**
     * 
    */
    int KEY_iTouch = 269025120;

    /**
     * 
    */
    int KEY_iacute = 237;

    /**
     * 
    */
    int KEY_ibelowdot = 16785099;

    /**
     * 
    */
    int KEY_ibreve = 16777517;

    /**
     * 
    */
    int KEY_icircumflex = 238;

    /**
     * 
    */
    int KEY_identical = 2255;

    /**
     * 
    */
    int KEY_idiaeresis = 239;

    /**
     * 
    */
    int KEY_idotless = 697;

    /**
     * 
    */
    int KEY_ifonlyif = 2253;

    /**
     * 
    */
    int KEY_igrave = 236;

    /**
     * 
    */
    int KEY_ihook = 16785097;

    /**
     * 
    */
    int KEY_imacron = 1007;

    /**
     * 
    */
    int KEY_implies = 2254;

    /**
     * 
    */
    int KEY_includedin = 2266;

    /**
     * 
    */
    int KEY_includes = 2267;

    /**
     * 
    */
    int KEY_infinity = 2242;

    /**
     * 
    */
    int KEY_integral = 2239;

    /**
     * 
    */
    int KEY_intersection = 2268;

    /**
     * 
    */
    int KEY_iogonek = 999;

    /**
     * 
    */
    int KEY_itilde = 949;

    /**
     * 
    */
    int KEY_j = 106;

    /**
     * 
    */
    int KEY_jcircumflex = 700;

    /**
     * 
    */
    int KEY_jot = 3018;

    /**
     * 
    */
    int KEY_k = 107;

    /**
     * 
    */
    int KEY_kana_A = 1201;

    /**
     * 
    */
    int KEY_kana_CHI = 1217;

    /**
     * 
    */
    int KEY_kana_E = 1204;

    /**
     * 
    */
    int KEY_kana_FU = 1228;

    /**
     * 
    */
    int KEY_kana_HA = 1226;

    /**
     * 
    */
    int KEY_kana_HE = 1229;

    /**
     * 
    */
    int KEY_kana_HI = 1227;

    /**
     * 
    */
    int KEY_kana_HO = 1230;

    /**
     * 
    */
    int KEY_kana_HU = 1228;

    /**
     * 
    */
    int KEY_kana_I = 1202;

    /**
     * 
    */
    int KEY_kana_KA = 1206;

    /**
     * 
    */
    int KEY_kana_KE = 1209;

    /**
     * 
    */
    int KEY_kana_KI = 1207;

    /**
     * 
    */
    int KEY_kana_KO = 1210;

    /**
     * 
    */
    int KEY_kana_KU = 1208;

    /**
     * 
    */
    int KEY_kana_MA = 1231;

    /**
     * 
    */
    int KEY_kana_ME = 1234;

    /**
     * 
    */
    int KEY_kana_MI = 1232;

    /**
     * 
    */
    int KEY_kana_MO = 1235;

    /**
     * 
    */
    int KEY_kana_MU = 1233;

    /**
     * 
    */
    int KEY_kana_N = 1245;

    /**
     * 
    */
    int KEY_kana_NA = 1221;

    /**
     * 
    */
    int KEY_kana_NE = 1224;

    /**
     * 
    */
    int KEY_kana_NI = 1222;

    /**
     * 
    */
    int KEY_kana_NO = 1225;

    /**
     * 
    */
    int KEY_kana_NU = 1223;

    /**
     * 
    */
    int KEY_kana_O = 1205;

    /**
     * 
    */
    int KEY_kana_RA = 1239;

    /**
     * 
    */
    int KEY_kana_RE = 1242;

    /**
     * 
    */
    int KEY_kana_RI = 1240;

    /**
     * 
    */
    int KEY_kana_RO = 1243;

    /**
     * 
    */
    int KEY_kana_RU = 1241;

    /**
     * 
    */
    int KEY_kana_SA = 1211;

    /**
     * 
    */
    int KEY_kana_SE = 1214;

    /**
     * 
    */
    int KEY_kana_SHI = 1212;

    /**
     * 
    */
    int KEY_kana_SO = 1215;

    /**
     * 
    */
    int KEY_kana_SU = 1213;

    /**
     * 
    */
    int KEY_kana_TA = 1216;

    /**
     * 
    */
    int KEY_kana_TE = 1219;

    /**
     * 
    */
    int KEY_kana_TI = 1217;

    /**
     * 
    */
    int KEY_kana_TO = 1220;

    /**
     * 
    */
    int KEY_kana_TSU = 1218;

    /**
     * 
    */
    int KEY_kana_TU = 1218;

    /**
     * 
    */
    int KEY_kana_U = 1203;

    /**
     * 
    */
    int KEY_kana_WA = 1244;

    /**
     * 
    */
    int KEY_kana_WO = 1190;

    /**
     * 
    */
    int KEY_kana_YA = 1236;

    /**
     * 
    */
    int KEY_kana_YO = 1238;

    /**
     * 
    */
    int KEY_kana_YU = 1237;

    /**
     * 
    */
    int KEY_kana_a = 1191;

    /**
     * 
    */
    int KEY_kana_closingbracket = 1187;

    /**
     * 
    */
    int KEY_kana_comma = 1188;

    /**
     * 
    */
    int KEY_kana_conjunctive = 1189;

    /**
     * 
    */
    int KEY_kana_e = 1194;

    /**
     * 
    */
    int KEY_kana_fullstop = 1185;

    /**
     * 
    */
    int KEY_kana_i = 1192;

    /**
     * 
    */
    int KEY_kana_middledot = 1189;

    /**
     * 
    */
    int KEY_kana_o = 1195;

    /**
     * 
    */
    int KEY_kana_openingbracket = 1186;

    /**
     * 
    */
    int KEY_kana_switch = 65406;

    /**
     * 
    */
    int KEY_kana_tsu = 1199;

    /**
     * 
    */
    int KEY_kana_tu = 1199;

    /**
     * 
    */
    int KEY_kana_u = 1193;

    /**
     * 
    */
    int KEY_kana_ya = 1196;

    /**
     * 
    */
    int KEY_kana_yo = 1198;

    /**
     * 
    */
    int KEY_kana_yu = 1197;

    /**
     * 
    */
    int KEY_kappa = 930;

    /**
     * 
    */
    int KEY_kcedilla = 1011;

    /**
     * 
    */
    int KEY_kra = 930;

    /**
     * 
    */
    int KEY_l = 108;

    /**
     * 
    */
    int KEY_lacute = 485;

    /**
     * 
    */
    int KEY_latincross = 2777;

    /**
     * 
    */
    int KEY_lbelowdot = 16784951;

    /**
     * 
    */
    int KEY_lcaron = 437;

    /**
     * 
    */
    int KEY_lcedilla = 950;

    /**
     * 
    */
    int KEY_leftanglebracket = 2748;

    /**
     * 
    */
    int KEY_leftarrow = 2299;

    /**
     * 
    */
    int KEY_leftcaret = 2979;

    /**
     * 
    */
    int KEY_leftdoublequotemark = 2770;

    /**
     * 
    */
    int KEY_leftmiddlecurlybrace = 2223;

    /**
     * 
    */
    int KEY_leftopentriangle = 2764;

    /**
     * 
    */
    int KEY_leftpointer = 2794;

    /**
     * 
    */
    int KEY_leftradical = 2209;

    /**
     * 
    */
    int KEY_leftshoe = 3034;

    /**
     * 
    */
    int KEY_leftsinglequotemark = 2768;

    /**
     * 
    */
    int KEY_leftt = 2548;

    /**
     * 
    */
    int KEY_lefttack = 3036;

    /**
     * 
    */
    int KEY_less = 60;

    /**
     * 
    */
    int KEY_lessthanequal = 2236;

    /**
     * 
    */
    int KEY_lf = 2533;

    /**
     * 
    */
    int KEY_logicaland = 2270;

    /**
     * 
    */
    int KEY_logicalor = 2271;

    /**
     * 
    */
    int KEY_lowleftcorner = 2541;

    /**
     * 
    */
    int KEY_lowrightcorner = 2538;

    /**
     * 
    */
    int KEY_lstroke = 435;

    /**
     * 
    */
    int KEY_m = 109;

    /**
     * 
    */
    int KEY_mabovedot = 16784961;

    /**
     * 
    */
    int KEY_macron = 175;

    /**
     * 
    */
    int KEY_malesymbol = 2807;

    /**
     * 
    */
    int KEY_maltesecross = 2800;

    /**
     * 
    */
    int KEY_marker = 2751;

    /**
     * 
    */
    int KEY_masculine = 186;

    /**
     * 
    */
    int KEY_minus = 45;

    /**
     * 
    */
    int KEY_minutes = 2774;

    /**
     * 
    */
    int KEY_mu = 181;

    /**
     * 
    */
    int KEY_multiply = 215;

    /**
     * 
    */
    int KEY_musicalflat = 2806;

    /**
     * 
    */
    int KEY_musicalsharp = 2805;

    /**
     * 
    */
    int KEY_n = 110;

    /**
     * 
    */
    int KEY_nabla = 2245;

    /**
     * 
    */
    int KEY_nacute = 497;

    /**
     * 
    */
    int KEY_ncaron = 498;

    /**
     * 
    */
    int KEY_ncedilla = 1009;

    /**
     * 
    */
    int KEY_ninesubscript = 16785545;

    /**
     * 
    */
    int KEY_ninesuperior = 16785529;

    /**
     * 
    */
    int KEY_nl = 2536;

    /**
     * 
    */
    int KEY_nobreakspace = 160;

    /**
     * 
    */
    int KEY_notapproxeq = 16785991;

    /**
     * 
    */
    int KEY_notelementof = 16785929;

    /**
     * 
    */
    int KEY_notequal = 2237;

    /**
     * 
    */
    int KEY_notidentical = 16786018;

    /**
     * 
    */
    int KEY_notsign = 172;

    /**
     * 
    */
    int KEY_ntilde = 241;

    /**
     * 
    */
    int KEY_numbersign = 35;

    /**
     * 
    */
    int KEY_numerosign = 1712;

    /**
     * 
    */
    int KEY_o = 111;

    /**
     * 
    */
    int KEY_oacute = 243;

    /**
     * 
    */
    int KEY_obarred = 16777845;

    /**
     * 
    */
    int KEY_obelowdot = 16785101;

    /**
     * 
    */
    int KEY_ocaron = 16777682;

    /**
     * 
    */
    int KEY_ocircumflex = 244;

    /**
     * 
    */
    int KEY_ocircumflexacute = 16785105;

    /**
     * 
    */
    int KEY_ocircumflexbelowdot = 16785113;

    /**
     * 
    */
    int KEY_ocircumflexgrave = 16785107;

    /**
     * 
    */
    int KEY_ocircumflexhook = 16785109;

    /**
     * 
    */
    int KEY_ocircumflextilde = 16785111;

    /**
     * 
    */
    int KEY_odiaeresis = 246;

    /**
     * 
    */
    int KEY_odoubleacute = 501;

    /**
     * 
    */
    int KEY_oe = 5053;

    /**
     * 
    */
    int KEY_ogonek = 434;

    /**
     * 
    */
    int KEY_ograve = 242;

    /**
     * 
    */
    int KEY_ohook = 16785103;

    /**
     * 
    */
    int KEY_ohorn = 16777633;

    /**
     * 
    */
    int KEY_ohornacute = 16785115;

    /**
     * 
    */
    int KEY_ohornbelowdot = 16785123;

    /**
     * 
    */
    int KEY_ohorngrave = 16785117;

    /**
     * 
    */
    int KEY_ohornhook = 16785119;

    /**
     * 
    */
    int KEY_ohorntilde = 16785121;

    /**
     * 
    */
    int KEY_omacron = 1010;

    /**
     * 
    */
    int KEY_oneeighth = 2755;

    /**
     * 
    */
    int KEY_onefifth = 2738;

    /**
     * 
    */
    int KEY_onehalf = 189;

    /**
     * 
    */
    int KEY_onequarter = 188;

    /**
     * 
    */
    int KEY_onesixth = 2742;

    /**
     * 
    */
    int KEY_onesubscript = 16785537;

    /**
     * 
    */
    int KEY_onesuperior = 185;

    /**
     * 
    */
    int KEY_onethird = 2736;

    /**
     * 
    */
    int KEY_ooblique = 248;

    /**
     * 
    */
    int KEY_openrectbullet = 2786;

    /**
     * 
    */
    int KEY_openstar = 2789;

    /**
     * 
    */
    int KEY_opentribulletdown = 2788;

    /**
     * 
    */
    int KEY_opentribulletup = 2787;

    /**
     * 
    */
    int KEY_ordfeminine = 170;

    /**
     * 
    */
    int KEY_oslash = 248;

    /**
     * 
    */
    int KEY_otilde = 245;

    /**
     * 
    */
    int KEY_overbar = 3008;

    /**
     * 
    */
    int KEY_overline = 1150;

    /**
     * 
    */
    int KEY_p = 112;

    /**
     * 
    */
    int KEY_pabovedot = 16784983;

    /**
     * 
    */
    int KEY_paragraph = 182;

    /**
     * 
    */
    int KEY_parenleft = 40;

    /**
     * 
    */
    int KEY_parenright = 41;

    /**
     * 
    */
    int KEY_partdifferential = 16785922;

    /**
     * 
    */
    int KEY_partialderivative = 2287;

    /**
     * 
    */
    int KEY_percent = 37;

    /**
     * 
    */
    int KEY_period = 46;

    /**
     * 
    */
    int KEY_periodcentered = 183;

    /**
     * 
    */
    int KEY_permille = 2773;

    /**
     * 
    */
    int KEY_phonographcopyright = 2811;

    /**
     * 
    */
    int KEY_plus = 43;

    /**
     * 
    */
    int KEY_plusminus = 177;

    /**
     * 
    */
    int KEY_prescription = 2772;

    /**
     * 
    */
    int KEY_prolongedsound = 1200;

    /**
     * 
    */
    int KEY_punctspace = 2726;

    /**
     * 
    */
    int KEY_q = 113;

    /**
     * 
    */
    int KEY_quad = 3020;

    /**
     * 
    */
    int KEY_question = 63;

    /**
     * 
    */
    int KEY_questiondown = 191;

    /**
     * 
    */
    int KEY_quotedbl = 34;

    /**
     * 
    */
    int KEY_quoteleft = 96;

    /**
     * 
    */
    int KEY_quoteright = 39;

    /**
     * 
    */
    int KEY_r = 114;

    /**
     * 
    */
    int KEY_racute = 480;

    /**
     * 
    */
    int KEY_radical = 2262;

    /**
     * 
    */
    int KEY_rcaron = 504;

    /**
     * 
    */
    int KEY_rcedilla = 947;

    /**
     * 
    */
    int KEY_registered = 174;

    /**
     * 
    */
    int KEY_rightanglebracket = 2750;

    /**
     * 
    */
    int KEY_rightarrow = 2301;

    /**
     * 
    */
    int KEY_rightcaret = 2982;

    /**
     * 
    */
    int KEY_rightdoublequotemark = 2771;

    /**
     * 
    */
    int KEY_rightmiddlecurlybrace = 2224;

    /**
     * 
    */
    int KEY_rightmiddlesummation = 2231;

    /**
     * 
    */
    int KEY_rightopentriangle = 2765;

    /**
     * 
    */
    int KEY_rightpointer = 2795;

    /**
     * 
    */
    int KEY_rightshoe = 3032;

    /**
     * 
    */
    int KEY_rightsinglequotemark = 2769;

    /**
     * 
    */
    int KEY_rightt = 2549;

    /**
     * 
    */
    int KEY_righttack = 3068;

    /**
     * 
    */
    int KEY_s = 115;

    /**
     * 
    */
    int KEY_sabovedot = 16784993;

    /**
     * 
    */
    int KEY_sacute = 438;

    /**
     * 
    */
    int KEY_scaron = 441;

    /**
     * 
    */
    int KEY_scedilla = 442;

    /**
     * 
    */
    int KEY_schwa = 16777817;

    /**
     * 
    */
    int KEY_scircumflex = 766;

    /**
     * 
    */
    int KEY_script_switch = 65406;

    /**
     * 
    */
    int KEY_seconds = 2775;

    /**
     * 
    */
    int KEY_section = 167;

    /**
     * 
    */
    int KEY_semicolon = 59;

    /**
     * 
    */
    int KEY_semivoicedsound = 1247;

    /**
     * 
    */
    int KEY_seveneighths = 2758;

    /**
     * 
    */
    int KEY_sevensubscript = 16785543;

    /**
     * 
    */
    int KEY_sevensuperior = 16785527;

    /**
     * 
    */
    int KEY_signaturemark = 2762;

    /**
     * 
    */
    int KEY_signifblank = 2732;

    /**
     * 
    */
    int KEY_similarequal = 2249;

    /**
     * 
    */
    int KEY_singlelowquotemark = 2813;

    /**
     * 
    */
    int KEY_sixsubscript = 16785542;

    /**
     * 
    */
    int KEY_sixsuperior = 16785526;

    /**
     * 
    */
    int KEY_slash = 47;

    /**
     * 
    */
    int KEY_soliddiamond = 2528;

    /**
     * 
    */
    int KEY_space = 32;

    /**
     * 
    */
    int KEY_squareroot = 16785946;

    /**
     * 
    */
    int KEY_ssharp = 223;

    /**
     * 
    */
    int KEY_sterling = 163;

    /**
     * 
    */
    int KEY_stricteq = 16786019;

    /**
     * 
    */
    int KEY_t = 116;

    /**
     * 
    */
    int KEY_tabovedot = 16785003;

    /**
     * 
    */
    int KEY_tcaron = 443;

    /**
     * 
    */
    int KEY_tcedilla = 510;

    /**
     * 
    */
    int KEY_telephone = 2809;

    /**
     * 
    */
    int KEY_telephonerecorder = 2810;

    /**
     * 
    */
    int KEY_therefore = 2240;

    /**
     * 
    */
    int KEY_thinspace = 2727;

    /**
     * 
    */
    int KEY_thorn = 254;

    /**
     * 
    */
    int KEY_threeeighths = 2756;

    /**
     * 
    */
    int KEY_threefifths = 2740;

    /**
     * 
    */
    int KEY_threequarters = 190;

    /**
     * 
    */
    int KEY_threesubscript = 16785539;

    /**
     * 
    */
    int KEY_threesuperior = 179;

    /**
     * 
    */
    int KEY_tintegral = 16785965;

    /**
     * 
    */
    int KEY_topintegral = 2212;

    /**
     * 
    */
    int KEY_topleftparens = 2219;

    /**
     * 
    */
    int KEY_topleftradical = 2210;

    /**
     * 
    */
    int KEY_topleftsqbracket = 2215;

    /**
     * 
    */
    int KEY_topleftsummation = 2225;

    /**
     * 
    */
    int KEY_toprightparens = 2221;

    /**
     * 
    */
    int KEY_toprightsqbracket = 2217;

    /**
     * 
    */
    int KEY_toprightsummation = 2229;

    /**
     * 
    */
    int KEY_topt = 2551;

    /**
     * 
    */
    int KEY_topvertsummationconnector = 2227;

    /**
     * 
    */
    int KEY_trademark = 2761;

    /**
     * 
    */
    int KEY_trademarkincircle = 2763;

    /**
     * 
    */
    int KEY_tslash = 956;

    /**
     * 
    */
    int KEY_twofifths = 2739;

    /**
     * 
    */
    int KEY_twosubscript = 16785538;

    /**
     * 
    */
    int KEY_twosuperior = 178;

    /**
     * 
    */
    int KEY_twothirds = 2737;

    /**
     * 
    */
    int KEY_u = 117;

    /**
     * 
    */
    int KEY_uacute = 250;

    /**
     * 
    */
    int KEY_ubelowdot = 16785125;

    /**
     * 
    */
    int KEY_ubreve = 765;

    /**
     * 
    */
    int KEY_ucircumflex = 251;

    /**
     * 
    */
    int KEY_udiaeresis = 252;

    /**
     * 
    */
    int KEY_udoubleacute = 507;

    /**
     * 
    */
    int KEY_ugrave = 249;

    /**
     * 
    */
    int KEY_uhook = 16785127;

    /**
     * 
    */
    int KEY_uhorn = 16777648;

    /**
     * 
    */
    int KEY_uhornacute = 16785129;

    /**
     * 
    */
    int KEY_uhornbelowdot = 16785137;

    /**
     * 
    */
    int KEY_uhorngrave = 16785131;

    /**
     * 
    */
    int KEY_uhornhook = 16785133;

    /**
     * 
    */
    int KEY_uhorntilde = 16785135;

    /**
     * 
    */
    int KEY_umacron = 1022;

    /**
     * 
    */
    int KEY_underbar = 3014;

    /**
     * 
    */
    int KEY_underscore = 95;

    /**
     * 
    */
    int KEY_union = 2269;

    /**
     * 
    */
    int KEY_uogonek = 1017;

    /**
     * 
    */
    int KEY_uparrow = 2300;

    /**
     * 
    */
    int KEY_upcaret = 2985;

    /**
     * 
    */
    int KEY_upleftcorner = 2540;

    /**
     * 
    */
    int KEY_uprightcorner = 2539;

    /**
     * 
    */
    int KEY_upshoe = 3011;

    /**
     * 
    */
    int KEY_upstile = 3027;

    /**
     * 
    */
    int KEY_uptack = 3022;

    /**
     * 
    */
    int KEY_uring = 505;

    /**
     * 
    */
    int KEY_utilde = 1021;

    /**
     * 
    */
    int KEY_v = 118;

    /**
     * 
    */
    int KEY_variation = 2241;

    /**
     * 
    */
    int KEY_vertbar = 2552;

    /**
     * 
    */
    int KEY_vertconnector = 2214;

    /**
     * 
    */
    int KEY_voicedsound = 1246;

    /**
     * 
    */
    int KEY_vt = 2537;

    /**
     * 
    */
    int KEY_w = 119;

    /**
     * 
    */
    int KEY_wacute = 16785027;

    /**
     * 
    */
    int KEY_wcircumflex = 16777589;

    /**
     * 
    */
    int KEY_wdiaeresis = 16785029;

    /**
     * 
    */
    int KEY_wgrave = 16785025;

    /**
     * 
    */
    int KEY_x = 120;

    /**
     * 
    */
    int KEY_xabovedot = 16785035;

    /**
     * 
    */
    int KEY_y = 121;

    /**
     * 
    */
    int KEY_yacute = 253;

    /**
     * 
    */
    int KEY_ybelowdot = 16785141;

    /**
     * 
    */
    int KEY_ycircumflex = 16777591;

    /**
     * 
    */
    int KEY_ydiaeresis = 255;

    /**
     * 
    */
    int KEY_yen = 165;

    /**
     * 
    */
    int KEY_ygrave = 16785139;

    /**
     * 
    */
    int KEY_yhook = 16785143;

    /**
     * 
    */
    int KEY_ytilde = 16785145;

    /**
     * 
    */
    int KEY_z = 122;

    /**
     * 
    */
    int KEY_zabovedot = 447;

    /**
     * 
    */
    int KEY_zacute = 444;

    /**
     * 
    */
    int KEY_zcaron = 446;

    /**
     * 
    */
    int KEY_zerosubscript = 16785536;

    /**
     * 
    */
    int KEY_zerosuperior = 16785520;

    /**
     * 
    */
    int KEY_zstroke = 16777654;

    /**
     * A mask covering all entries in `GdkModifierType`.
    */
    int MODIFIER_MASK = 469769999;

    /**
     * This is the priority that the idle handler processing surface updates
     * <br>is given in the main loop.
    */
    int PRIORITY_REDRAW = 120;

}

/*
enumeration-type
*/
