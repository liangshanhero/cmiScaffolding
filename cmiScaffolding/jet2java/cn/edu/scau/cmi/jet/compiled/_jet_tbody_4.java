package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_tbody_4 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_tbody_4() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_f_replaceAll_1_1 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            1, 1,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "Dollar_symbol", //$NON-NLS-1$
                "$", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_1_53 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 53,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_1_135 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 135,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_1_174 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 174,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_1_233 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 233,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_1_291 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 291,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_55 = new TagInfo("c:get", //$NON-NLS-1$
            2, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_114 = new TagInfo("c:get", //$NON-NLS-1$
            13, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_165 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 165,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_232 = new TagInfo("c:get", //$NON-NLS-1$
            13, 232,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_290 = new TagInfo("c:get", //$NON-NLS-1$
            13, 290,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_326 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 326,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_375 = new TagInfo("c:if", //$NON-NLS-1$
            13, 375,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_417 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 417,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_488 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 488,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_552 = new TagInfo("c:if", //$NON-NLS-1$
            13, 552,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_605 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 605,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_640 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 640,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_675 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 675,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_736 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 736,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_786 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 786,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_855 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 855,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_905 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 905,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_13_915 = new TagInfo("c:when", //$NON-NLS-1$
            13, 915,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_942 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 942,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_1008 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 1008,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_13_1018 = new TagInfo("c:when", //$NON-NLS-1$
            13, 1018,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_13_1084 = new TagInfo("c:otherwise", //$NON-NLS-1$
            13, 1084,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_1098 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1098,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_13_1199 = new TagInfo("c:otherwise", //$NON-NLS-1$
            13, 1199,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_1213 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_112 = new TagInfo("c:get", //$NON-NLS-1$
            15, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_163 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 163,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_230 = new TagInfo("c:get", //$NON-NLS-1$
            15, 230,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_288 = new TagInfo("c:get", //$NON-NLS-1$
            15, 288,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_324 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 324,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_373 = new TagInfo("c:if", //$NON-NLS-1$
            15, 373,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_415 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 415,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_486 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 486,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_550 = new TagInfo("c:if", //$NON-NLS-1$
            15, 550,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_603 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 603,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_638 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 638,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_673 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 673,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_734 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 734,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_784 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 784,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_853 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 853,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_15_903 = new TagInfo("c:choose", //$NON-NLS-1$
            15, 903,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_15_913 = new TagInfo("c:when", //$NON-NLS-1$
            15, 913,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_940 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 940,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_15_1006 = new TagInfo("c:choose", //$NON-NLS-1$
            15, 1006,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_15_1016 = new TagInfo("c:when", //$NON-NLS-1$
            15, 1016,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_15_1082 = new TagInfo("c:otherwise", //$NON-NLS-1$
            15, 1082,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_1096 = new TagInfo("c:get", //$NON-NLS-1$
            15, 1096,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_15_1201 = new TagInfo("c:otherwise", //$NON-NLS-1$
            15, 1201,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_1215 = new TagInfo("c:get", //$NON-NLS-1$
            15, 1215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_123 = new TagInfo("c:get", //$NON-NLS-1$
            17, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_174 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 174,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_241 = new TagInfo("c:get", //$NON-NLS-1$
            17, 241,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_299 = new TagInfo("c:get", //$NON-NLS-1$
            17, 299,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_335 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 335,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_384 = new TagInfo("c:if", //$NON-NLS-1$
            17, 384,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_20_4 = new TagInfo("c:choose", //$NON-NLS-1$
            20, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_21_4 = new TagInfo("c:when", //$NON-NLS-1$
            21, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_116 = new TagInfo("c:get", //$NON-NLS-1$
            22, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_24_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            24, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_63 = new TagInfo("c:get", //$NON-NLS-1$
            25, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_4 = new TagInfo("c:if", //$NON-NLS-1$
            31, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_33_4 = new TagInfo("c:choose", //$NON-NLS-1$
            33, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_34_4 = new TagInfo("c:when", //$NON-NLS-1$
            34, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@name='name'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_63 = new TagInfo("c:get", //$NON-NLS-1$
            35, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_37_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            37, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_38_4 = new TagInfo("c:if", //$NON-NLS-1$
            38, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@display='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_63 = new TagInfo("c:get", //$NON-NLS-1$
            39, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_106 = new TagInfo("c:get", //$NON-NLS-1$
            39, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($col/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_47_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            47, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_4 = new TagInfo("c:if", //$NON-NLS-1$
            49, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_51_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            51, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_52_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            52, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_56_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            56, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_4 = new TagInfo("c:if", //$NON-NLS-1$
            58, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_4 = new TagInfo("c:if", //$NON-NLS-1$
            59, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_61_4 = new TagInfo("c:choose", //$NON-NLS-1$
            61, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_62_4 = new TagInfo("c:when", //$NON-NLS-1$
            62, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_64_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            64, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_66_64 = new TagInfo("c:get", //$NON-NLS-1$
            66, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_31 = new TagInfo("c:get", //$NON-NLS-1$
            67, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_64 = new TagInfo("c:get", //$NON-NLS-1$
            70, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_74_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            74, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_4 = new TagInfo("c:if", //$NON-NLS-1$
            75, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_76_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            76, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_77_4 = new TagInfo("c:choose", //$NON-NLS-1$
            77, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_78_4 = new TagInfo("c:when", //$NON-NLS-1$
            78, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@name='name'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_81_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            81, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_82_4 = new TagInfo("c:if", //$NON-NLS-1$
            82, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@display='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_30 = new TagInfo("c:get", //$NON-NLS-1$
            83, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($col/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_67 = new TagInfo("c:get", //$NON-NLS-1$
            93, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_117 = new TagInfo("c:get", //$NON-NLS-1$
            93, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_93_176 = new TagInfo("c:iterate", //$NON-NLS-1$
            93, 176,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_243 = new TagInfo("c:get", //$NON-NLS-1$
            93, 243,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_278 = new TagInfo("c:get", //$NON-NLS-1$
            93, 278,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_336 = new TagInfo("c:get", //$NON-NLS-1$
            93, 336,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_93_372 = new TagInfo("c:setVariable", //$NON-NLS-1$
            93, 372,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_93_421 = new TagInfo("c:if", //$NON-NLS-1$
            93, 421,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_102_4 = new TagInfo("c:if", //$NON-NLS-1$
            102, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_64 = new TagInfo("c:get", //$NON-NLS-1$
            104, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_31 = new TagInfo("c:get", //$NON-NLS-1$
            105, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_64 = new TagInfo("c:get", //$NON-NLS-1$
            108, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_112_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            112, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_113_4 = new TagInfo("c:if", //$NON-NLS-1$
            113, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_114_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            114, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_115_4 = new TagInfo("c:choose", //$NON-NLS-1$
            115, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_116_4 = new TagInfo("c:when", //$NON-NLS-1$
            116, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@name='name'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_119_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            119, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_120_4 = new TagInfo("c:if", //$NON-NLS-1$
            120, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@display='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_30 = new TagInfo("c:get", //$NON-NLS-1$
            121, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($col/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_67 = new TagInfo("c:get", //$NON-NLS-1$
            131, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_117 = new TagInfo("c:get", //$NON-NLS-1$
            131, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_131_170 = new TagInfo("c:iterate", //$NON-NLS-1$
            131, 170,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_237 = new TagInfo("c:get", //$NON-NLS-1$
            131, 237,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_272 = new TagInfo("c:get", //$NON-NLS-1$
            131, 272,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_131_330 = new TagInfo("c:get", //$NON-NLS-1$
            131, 330,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_131_366 = new TagInfo("c:setVariable", //$NON-NLS-1$
            131, 366,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_131_415 = new TagInfo("c:if", //$NON-NLS-1$
            131, 415,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_138_4 = new TagInfo("c:if", //$NON-NLS-1$
            138, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_140_64 = new TagInfo("c:get", //$NON-NLS-1$
            140, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_31 = new TagInfo("c:get", //$NON-NLS-1$
            141, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_144_64 = new TagInfo("c:get", //$NON-NLS-1$
            144, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_148_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            148, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_149_4 = new TagInfo("c:if", //$NON-NLS-1$
            149, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_150_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            150, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_151_4 = new TagInfo("c:choose", //$NON-NLS-1$
            151, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_152_4 = new TagInfo("c:when", //$NON-NLS-1$
            152, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@name='name'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_155_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            155, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_156_4 = new TagInfo("c:if", //$NON-NLS-1$
            156, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$col/@display='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_157_30 = new TagInfo("c:get", //$NON-NLS-1$
            157, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($col/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_67 = new TagInfo("c:get", //$NON-NLS-1$
            167, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_117 = new TagInfo("c:get", //$NON-NLS-1$
            167, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_167_170 = new TagInfo("c:iterate", //$NON-NLS-1$
            167, 170,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_237 = new TagInfo("c:get", //$NON-NLS-1$
            167, 237,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_272 = new TagInfo("c:get", //$NON-NLS-1$
            167, 272,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_330 = new TagInfo("c:get", //$NON-NLS-1$
            167, 330,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_167_366 = new TagInfo("c:setVariable", //$NON-NLS-1$
            167, 366,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_167_415 = new TagInfo("c:if", //$NON-NLS-1$
            167, 415,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_f_replaceAll_1_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_replaceAll_1_1.setRuntimeParent(null);
        _jettag_f_replaceAll_1_1.setTagInfo(_td_f_replaceAll_1_1);
        _jettag_f_replaceAll_1_1.doStart(context, out);
        JET2Writer _jettag_f_replaceAll_1_1_saved_out = out;
        while (_jettag_f_replaceAll_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_replaceStrings_1_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_replaceStrings_1_53.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_replaceStrings_1_53.setTagInfo(_td_c_replaceStrings_1_53);
            _jettag_c_replaceStrings_1_53.doStart(context, out);
            JET2Writer _jettag_c_replaceStrings_1_53_saved_out = out;
            while (_jettag_c_replaceStrings_1_53.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_1_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_1_135.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_1_135.setTagInfo(_td_c_setVariable_1_135);
                _jettag_c_setVariable_1_135.doStart(context, out);
                _jettag_c_setVariable_1_135.doEnd();
                RuntimeTagElement _jettag_c_iterate_1_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_174); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_1_174.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_1_174.setTagInfo(_td_c_iterate_1_174);
                _jettag_c_iterate_1_174.doStart(context, out);
                while (_jettag_c_iterate_1_174.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_1_233 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_233); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_1_233.setRuntimeParent(_jettag_c_iterate_1_174);
                    _jettag_c_setVariable_1_233.setTagInfo(_td_c_setVariable_1_233);
                    _jettag_c_setVariable_1_233.doStart(context, out);
                    _jettag_c_setVariable_1_233.doEnd();
                    _jettag_c_iterate_1_174.handleBodyContent(out);
                }
                _jettag_c_iterate_1_174.doEnd();
                RuntimeTagElement _jettag_c_setVariable_1_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_291); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_1_291.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_1_291.setTagInfo(_td_c_setVariable_1_291);
                _jettag_c_setVariable_1_291.doStart(context, out);
                _jettag_c_setVariable_1_291.doEnd();
                out.write("\t\t\t<tbody>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:forEach items=\"Dollar_symbol{");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_2_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_2_55.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_2_55.setTagInfo(_td_c_get_2_55);
                _jettag_c_get_2_55.doStart(context, out);
                _jettag_c_get_2_55.doEnd();
                out.write("s}\" var=\"current\" varStatus=\"i\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:choose%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:when test=\"Dollar_symbol{(i.count) % 2 == 0}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:set var=\"rowclass\" value=\"rowtwo\"/%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:when%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:set var=\"rowclass\" value=\"rowone\"/%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:choose%Right_angle_brackets\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<tr class=\"Dollar_symbol{rowclass}\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<a title=\"<fmt:message key=\"navigation.view\" />\" href=\"Dollar_symbol{pageContext.request.contextPath}/select");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_114); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_114.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_13_114.setTagInfo(_td_c_get_13_114);
                _jettag_c_get_13_114.doStart(context, out);
                _jettag_c_get_13_114.doEnd();
                out.write("?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_13_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_165); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_13_165.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_13_165.setTagInfo(_td_c_iterate_13_165);
                _jettag_c_iterate_13_165.doStart(context, out);
                while (_jettag_c_iterate_13_165.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_13_232 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_232); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_232.setRuntimeParent(_jettag_c_iterate_13_165);
                    _jettag_c_get_13_232.setTagInfo(_td_c_get_13_232);
                    _jettag_c_get_13_232.doStart(context, out);
                    _jettag_c_get_13_232.doEnd();
                    out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_290 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_290); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_290.setRuntimeParent(_jettag_c_iterate_13_165);
                    _jettag_c_get_13_290.setTagInfo(_td_c_get_13_290);
                    _jettag_c_get_13_290.doStart(context, out);
                    _jettag_c_get_13_290.doEnd();
                    out.write("}");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_13_326 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_326); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_13_326.setRuntimeParent(_jettag_c_iterate_13_165);
                    _jettag_c_setVariable_13_326.setTagInfo(_td_c_setVariable_13_326);
                    _jettag_c_setVariable_13_326.doStart(context, out);
                    _jettag_c_setVariable_13_326.doEnd();
                    RuntimeTagElement _jettag_c_if_13_375 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_375); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_13_375.setRuntimeParent(_jettag_c_iterate_13_165);
                    _jettag_c_if_13_375.setTagInfo(_td_c_if_13_375);
                    _jettag_c_if_13_375.doStart(context, out);
                    while (_jettag_c_if_13_375.okToProcessBody()) {
                        out.write("&");  //$NON-NLS-1$        
                        _jettag_c_if_13_375.handleBodyContent(out);
                    }
                    _jettag_c_if_13_375.doEnd();
                    _jettag_c_iterate_13_165.handleBodyContent(out);
                }
                _jettag_c_iterate_13_165.doEnd();
                RuntimeTagElement _jettag_c_iterate_13_417 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_417); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_13_417.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_13_417.setTagInfo(_td_c_iterate_13_417);
                _jettag_c_iterate_13_417.doStart(context, out);
                while (_jettag_c_iterate_13_417.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_13_488 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_488); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_13_488.setRuntimeParent(_jettag_c_iterate_13_417);
                    _jettag_c_iterate_13_488.setTagInfo(_td_c_iterate_13_488);
                    _jettag_c_iterate_13_488.doStart(context, out);
                    while (_jettag_c_iterate_13_488.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_13_552 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_552); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_13_552.setRuntimeParent(_jettag_c_iterate_13_488);
                        _jettag_c_if_13_552.setTagInfo(_td_c_if_13_552);
                        _jettag_c_if_13_552.doStart(context, out);
                        while (_jettag_c_if_13_552.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_13_605 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_605); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_13_605.setRuntimeParent(_jettag_c_if_13_552);
                            _jettag_c_setVariable_13_605.setTagInfo(_td_c_setVariable_13_605);
                            _jettag_c_setVariable_13_605.doStart(context, out);
                            _jettag_c_setVariable_13_605.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_13_640 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_640); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_13_640.setRuntimeParent(_jettag_c_if_13_552);
                            _jettag_c_setVariable_13_640.setTagInfo(_td_c_setVariable_13_640);
                            _jettag_c_setVariable_13_640.doStart(context, out);
                            _jettag_c_setVariable_13_640.doEnd();
                            RuntimeTagElement _jettag_c_iterate_13_675 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_675); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_13_675.setRuntimeParent(_jettag_c_if_13_552);
                            _jettag_c_iterate_13_675.setTagInfo(_td_c_iterate_13_675);
                            _jettag_c_iterate_13_675.doStart(context, out);
                            while (_jettag_c_iterate_13_675.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_13_736 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_736); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_13_736.setRuntimeParent(_jettag_c_iterate_13_675);
                                _jettag_c_setVariable_13_736.setTagInfo(_td_c_setVariable_13_736);
                                _jettag_c_setVariable_13_736.doStart(context, out);
                                _jettag_c_setVariable_13_736.doEnd();
                                _jettag_c_iterate_13_675.handleBodyContent(out);
                            }
                            _jettag_c_iterate_13_675.doEnd();
                            RuntimeTagElement _jettag_c_iterate_13_786 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_786); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_13_786.setRuntimeParent(_jettag_c_if_13_552);
                            _jettag_c_iterate_13_786.setTagInfo(_td_c_iterate_13_786);
                            _jettag_c_iterate_13_786.doStart(context, out);
                            while (_jettag_c_iterate_13_786.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_13_855 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_855); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_13_855.setRuntimeParent(_jettag_c_iterate_13_786);
                                _jettag_c_setVariable_13_855.setTagInfo(_td_c_setVariable_13_855);
                                _jettag_c_setVariable_13_855.doStart(context, out);
                                _jettag_c_setVariable_13_855.doEnd();
                                _jettag_c_iterate_13_786.handleBodyContent(out);
                            }
                            _jettag_c_iterate_13_786.doEnd();
                            RuntimeTagElement _jettag_c_choose_13_905 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_905); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_13_905.setRuntimeParent(_jettag_c_if_13_552);
                            _jettag_c_choose_13_905.setTagInfo(_td_c_choose_13_905);
                            _jettag_c_choose_13_905.doStart(context, out);
                            JET2Writer _jettag_c_choose_13_905_saved_out = out;
                            while (_jettag_c_choose_13_905.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_13_915 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_13_915); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_13_915.setRuntimeParent(_jettag_c_choose_13_905);
                                _jettag_c_when_13_915.setTagInfo(_td_c_when_13_915);
                                _jettag_c_when_13_915.doStart(context, out);
                                JET2Writer _jettag_c_when_13_915_saved_out = out;
                                while (_jettag_c_when_13_915.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_13_942 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_942); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_13_942.setRuntimeParent(_jettag_c_when_13_915);
                                    _jettag_c_iterate_13_942.setTagInfo(_td_c_iterate_13_942);
                                    _jettag_c_iterate_13_942.doStart(context, out);
                                    while (_jettag_c_iterate_13_942.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_13_1008 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_1008); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_13_1008.setRuntimeParent(_jettag_c_iterate_13_942);
                                        _jettag_c_choose_13_1008.setTagInfo(_td_c_choose_13_1008);
                                        _jettag_c_choose_13_1008.doStart(context, out);
                                        JET2Writer _jettag_c_choose_13_1008_saved_out = out;
                                        while (_jettag_c_choose_13_1008.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_13_1018 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_13_1018); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_13_1018.setRuntimeParent(_jettag_c_choose_13_1008);
                                            _jettag_c_when_13_1018.setTagInfo(_td_c_when_13_1018);
                                            _jettag_c_when_13_1018.doStart(context, out);
                                            JET2Writer _jettag_c_when_13_1018_saved_out = out;
                                            while (_jettag_c_when_13_1018.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_13_1018.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_13_1018_saved_out;
                                            _jettag_c_when_13_1018.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_13_1084 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_13_1084); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_13_1084.setRuntimeParent(_jettag_c_choose_13_1008);
                                            _jettag_c_otherwise_13_1084.setTagInfo(_td_c_otherwise_13_1084);
                                            _jettag_c_otherwise_13_1084.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_13_1084_saved_out = out;
                                            while (_jettag_c_otherwise_13_1084.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("&");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_13_1098 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1098); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_13_1098.setRuntimeParent(_jettag_c_otherwise_13_1084);
                                                _jettag_c_get_13_1098.setTagInfo(_td_c_get_13_1098);
                                                _jettag_c_get_13_1098.doStart(context, out);
                                                _jettag_c_get_13_1098.doEnd();
                                                out.write("Page=homePage");  //$NON-NLS-1$        
                                                _jettag_c_otherwise_13_1084.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_13_1084_saved_out;
                                            _jettag_c_otherwise_13_1084.doEnd();
                                            _jettag_c_choose_13_1008.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_13_1008_saved_out;
                                        _jettag_c_choose_13_1008.doEnd();
                                        _jettag_c_iterate_13_942.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_13_942.doEnd();
                                    _jettag_c_when_13_915.handleBodyContent(out);
                                }
                                out = _jettag_c_when_13_915_saved_out;
                                _jettag_c_when_13_915.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_13_1199 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_13_1199); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_13_1199.setRuntimeParent(_jettag_c_choose_13_905);
                                _jettag_c_otherwise_13_1199.setTagInfo(_td_c_otherwise_13_1199);
                                _jettag_c_otherwise_13_1199.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_13_1199_saved_out = out;
                                while (_jettag_c_otherwise_13_1199.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("&");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_13_1213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1213); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_13_1213.setRuntimeParent(_jettag_c_otherwise_13_1199);
                                    _jettag_c_get_13_1213.setTagInfo(_td_c_get_13_1213);
                                    _jettag_c_get_13_1213.doStart(context, out);
                                    _jettag_c_get_13_1213.doEnd();
                                    out.write("Page=homePage");  //$NON-NLS-1$        
                                    _jettag_c_otherwise_13_1199.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_13_1199_saved_out;
                                _jettag_c_otherwise_13_1199.doEnd();
                                _jettag_c_choose_13_905.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_13_905_saved_out;
                            _jettag_c_choose_13_905.doEnd();
                            _jettag_c_if_13_552.handleBodyContent(out);
                        }
                        _jettag_c_if_13_552.doEnd();
                        _jettag_c_iterate_13_488.handleBodyContent(out);
                    }
                    _jettag_c_iterate_13_488.doEnd();
                    _jettag_c_iterate_13_417.handleBodyContent(out);
                }
                _jettag_c_iterate_13_417.doEnd();
                out.write("\"><img src=\"images/icons/view.gif\" /></a>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_14_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_14_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_14_4.setTagInfo(_td_c_setVariable_14_4);
                _jettag_c_setVariable_14_4.doStart(context, out);
                _jettag_c_setVariable_14_4.doEnd();
                out.write("\t\t\t\t\t<a title=\"<fmt:message key=\"navigation.edit\" />\" href=\"Dollar_symbol{pageContext.request.contextPath}/edit");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_15_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_112); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_112.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_15_112.setTagInfo(_td_c_get_15_112);
                _jettag_c_get_15_112.doStart(context, out);
                _jettag_c_get_15_112.doEnd();
                out.write("?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_15_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_163); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_15_163.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_15_163.setTagInfo(_td_c_iterate_15_163);
                _jettag_c_iterate_15_163.doStart(context, out);
                while (_jettag_c_iterate_15_163.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_15_230 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_230); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_230.setRuntimeParent(_jettag_c_iterate_15_163);
                    _jettag_c_get_15_230.setTagInfo(_td_c_get_15_230);
                    _jettag_c_get_15_230.doStart(context, out);
                    _jettag_c_get_15_230.doEnd();
                    out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_288 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_288); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_288.setRuntimeParent(_jettag_c_iterate_15_163);
                    _jettag_c_get_15_288.setTagInfo(_td_c_get_15_288);
                    _jettag_c_get_15_288.doStart(context, out);
                    _jettag_c_get_15_288.doEnd();
                    out.write("}");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_15_324 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_324); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_15_324.setRuntimeParent(_jettag_c_iterate_15_163);
                    _jettag_c_setVariable_15_324.setTagInfo(_td_c_setVariable_15_324);
                    _jettag_c_setVariable_15_324.doStart(context, out);
                    _jettag_c_setVariable_15_324.doEnd();
                    RuntimeTagElement _jettag_c_if_15_373 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_373); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_15_373.setRuntimeParent(_jettag_c_iterate_15_163);
                    _jettag_c_if_15_373.setTagInfo(_td_c_if_15_373);
                    _jettag_c_if_15_373.doStart(context, out);
                    while (_jettag_c_if_15_373.okToProcessBody()) {
                        out.write("&");  //$NON-NLS-1$        
                        _jettag_c_if_15_373.handleBodyContent(out);
                    }
                    _jettag_c_if_15_373.doEnd();
                    _jettag_c_iterate_15_163.handleBodyContent(out);
                }
                _jettag_c_iterate_15_163.doEnd();
                RuntimeTagElement _jettag_c_iterate_15_415 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_415); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_15_415.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_15_415.setTagInfo(_td_c_iterate_15_415);
                _jettag_c_iterate_15_415.doStart(context, out);
                while (_jettag_c_iterate_15_415.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_15_486 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_486); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_15_486.setRuntimeParent(_jettag_c_iterate_15_415);
                    _jettag_c_iterate_15_486.setTagInfo(_td_c_iterate_15_486);
                    _jettag_c_iterate_15_486.doStart(context, out);
                    while (_jettag_c_iterate_15_486.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_15_550 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_550); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_15_550.setRuntimeParent(_jettag_c_iterate_15_486);
                        _jettag_c_if_15_550.setTagInfo(_td_c_if_15_550);
                        _jettag_c_if_15_550.doStart(context, out);
                        while (_jettag_c_if_15_550.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_15_603 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_603); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_15_603.setRuntimeParent(_jettag_c_if_15_550);
                            _jettag_c_setVariable_15_603.setTagInfo(_td_c_setVariable_15_603);
                            _jettag_c_setVariable_15_603.doStart(context, out);
                            _jettag_c_setVariable_15_603.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_15_638 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_638); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_15_638.setRuntimeParent(_jettag_c_if_15_550);
                            _jettag_c_setVariable_15_638.setTagInfo(_td_c_setVariable_15_638);
                            _jettag_c_setVariable_15_638.doStart(context, out);
                            _jettag_c_setVariable_15_638.doEnd();
                            RuntimeTagElement _jettag_c_iterate_15_673 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_673); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_15_673.setRuntimeParent(_jettag_c_if_15_550);
                            _jettag_c_iterate_15_673.setTagInfo(_td_c_iterate_15_673);
                            _jettag_c_iterate_15_673.doStart(context, out);
                            while (_jettag_c_iterate_15_673.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_15_734 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_734); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_15_734.setRuntimeParent(_jettag_c_iterate_15_673);
                                _jettag_c_setVariable_15_734.setTagInfo(_td_c_setVariable_15_734);
                                _jettag_c_setVariable_15_734.doStart(context, out);
                                _jettag_c_setVariable_15_734.doEnd();
                                _jettag_c_iterate_15_673.handleBodyContent(out);
                            }
                            _jettag_c_iterate_15_673.doEnd();
                            RuntimeTagElement _jettag_c_iterate_15_784 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_784); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_15_784.setRuntimeParent(_jettag_c_if_15_550);
                            _jettag_c_iterate_15_784.setTagInfo(_td_c_iterate_15_784);
                            _jettag_c_iterate_15_784.doStart(context, out);
                            while (_jettag_c_iterate_15_784.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_15_853 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_853); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_15_853.setRuntimeParent(_jettag_c_iterate_15_784);
                                _jettag_c_setVariable_15_853.setTagInfo(_td_c_setVariable_15_853);
                                _jettag_c_setVariable_15_853.doStart(context, out);
                                _jettag_c_setVariable_15_853.doEnd();
                                _jettag_c_iterate_15_784.handleBodyContent(out);
                            }
                            _jettag_c_iterate_15_784.doEnd();
                            RuntimeTagElement _jettag_c_choose_15_903 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_15_903); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_15_903.setRuntimeParent(_jettag_c_if_15_550);
                            _jettag_c_choose_15_903.setTagInfo(_td_c_choose_15_903);
                            _jettag_c_choose_15_903.doStart(context, out);
                            JET2Writer _jettag_c_choose_15_903_saved_out = out;
                            while (_jettag_c_choose_15_903.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_15_913 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_913); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_15_913.setRuntimeParent(_jettag_c_choose_15_903);
                                _jettag_c_when_15_913.setTagInfo(_td_c_when_15_913);
                                _jettag_c_when_15_913.doStart(context, out);
                                JET2Writer _jettag_c_when_15_913_saved_out = out;
                                while (_jettag_c_when_15_913.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_15_940 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_940); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_15_940.setRuntimeParent(_jettag_c_when_15_913);
                                    _jettag_c_iterate_15_940.setTagInfo(_td_c_iterate_15_940);
                                    _jettag_c_iterate_15_940.doStart(context, out);
                                    while (_jettag_c_iterate_15_940.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_15_1006 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_15_1006); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_15_1006.setRuntimeParent(_jettag_c_iterate_15_940);
                                        _jettag_c_choose_15_1006.setTagInfo(_td_c_choose_15_1006);
                                        _jettag_c_choose_15_1006.doStart(context, out);
                                        JET2Writer _jettag_c_choose_15_1006_saved_out = out;
                                        while (_jettag_c_choose_15_1006.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_15_1016 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_1016); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_15_1016.setRuntimeParent(_jettag_c_choose_15_1006);
                                            _jettag_c_when_15_1016.setTagInfo(_td_c_when_15_1016);
                                            _jettag_c_when_15_1016.doStart(context, out);
                                            JET2Writer _jettag_c_when_15_1016_saved_out = out;
                                            while (_jettag_c_when_15_1016.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_15_1016.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_15_1016_saved_out;
                                            _jettag_c_when_15_1016.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_15_1082 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_15_1082); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_15_1082.setRuntimeParent(_jettag_c_choose_15_1006);
                                            _jettag_c_otherwise_15_1082.setTagInfo(_td_c_otherwise_15_1082);
                                            _jettag_c_otherwise_15_1082.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_15_1082_saved_out = out;
                                            while (_jettag_c_otherwise_15_1082.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("&");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_15_1096 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_1096); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_15_1096.setRuntimeParent(_jettag_c_otherwise_15_1082);
                                                _jettag_c_get_15_1096.setTagInfo(_td_c_get_15_1096);
                                                _jettag_c_get_15_1096.doStart(context, out);
                                                _jettag_c_get_15_1096.doEnd();
                                                out.write("Page=previousPage");  //$NON-NLS-1$        
                                                _jettag_c_otherwise_15_1082.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_15_1082_saved_out;
                                            _jettag_c_otherwise_15_1082.doEnd();
                                            _jettag_c_choose_15_1006.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_15_1006_saved_out;
                                        _jettag_c_choose_15_1006.doEnd();
                                        _jettag_c_iterate_15_940.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_15_940.doEnd();
                                    _jettag_c_when_15_913.handleBodyContent(out);
                                }
                                out = _jettag_c_when_15_913_saved_out;
                                _jettag_c_when_15_913.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_15_1201 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_15_1201); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_15_1201.setRuntimeParent(_jettag_c_choose_15_903);
                                _jettag_c_otherwise_15_1201.setTagInfo(_td_c_otherwise_15_1201);
                                _jettag_c_otherwise_15_1201.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_15_1201_saved_out = out;
                                while (_jettag_c_otherwise_15_1201.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("&");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_15_1215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_1215); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_15_1215.setRuntimeParent(_jettag_c_otherwise_15_1201);
                                    _jettag_c_get_15_1215.setTagInfo(_td_c_get_15_1215);
                                    _jettag_c_get_15_1215.doStart(context, out);
                                    _jettag_c_get_15_1215.doEnd();
                                    out.write("Page=previousPage");  //$NON-NLS-1$        
                                    _jettag_c_otherwise_15_1201.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_15_1201_saved_out;
                                _jettag_c_otherwise_15_1201.doEnd();
                                _jettag_c_choose_15_903.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_15_903_saved_out;
                            _jettag_c_choose_15_903.doEnd();
                            _jettag_c_if_15_550.handleBodyContent(out);
                        }
                        _jettag_c_if_15_550.doEnd();
                        _jettag_c_iterate_15_486.handleBodyContent(out);
                    }
                    _jettag_c_iterate_15_486.doEnd();
                    _jettag_c_iterate_15_415.handleBodyContent(out);
                }
                _jettag_c_iterate_15_415.doEnd();
                out.write("\"><img src=\"images/icons/edit.gif\" /></a>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_16_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_16_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_16_4.setTagInfo(_td_c_setVariable_16_4);
                _jettag_c_setVariable_16_4.doStart(context, out);
                _jettag_c_setVariable_16_4.doEnd();
                out.write("\t\t\t\t\t<a title=\"<fmt:message key=\"navigation.delete\" />\" href=\"Dollar_symbol{pageContext.request.contextPath}/confirmDelete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_123); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_123.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_17_123.setTagInfo(_td_c_get_17_123);
                _jettag_c_get_17_123.doStart(context, out);
                _jettag_c_get_17_123.doEnd();
                out.write("?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_17_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_174); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_17_174.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_17_174.setTagInfo(_td_c_iterate_17_174);
                _jettag_c_iterate_17_174.doStart(context, out);
                while (_jettag_c_iterate_17_174.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_17_241 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_241); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_241.setRuntimeParent(_jettag_c_iterate_17_174);
                    _jettag_c_get_17_241.setTagInfo(_td_c_get_17_241);
                    _jettag_c_get_17_241.doStart(context, out);
                    _jettag_c_get_17_241.doEnd();
                    out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_299 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_299); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_299.setRuntimeParent(_jettag_c_iterate_17_174);
                    _jettag_c_get_17_299.setTagInfo(_td_c_get_17_299);
                    _jettag_c_get_17_299.doStart(context, out);
                    _jettag_c_get_17_299.doEnd();
                    out.write("}");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_17_335 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_335); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_17_335.setRuntimeParent(_jettag_c_iterate_17_174);
                    _jettag_c_setVariable_17_335.setTagInfo(_td_c_setVariable_17_335);
                    _jettag_c_setVariable_17_335.doStart(context, out);
                    _jettag_c_setVariable_17_335.doEnd();
                    RuntimeTagElement _jettag_c_if_17_384 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_384); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_17_384.setRuntimeParent(_jettag_c_iterate_17_174);
                    _jettag_c_if_17_384.setTagInfo(_td_c_if_17_384);
                    _jettag_c_if_17_384.doStart(context, out);
                    while (_jettag_c_if_17_384.okToProcessBody()) {
                        out.write("&");  //$NON-NLS-1$        
                        _jettag_c_if_17_384.handleBodyContent(out);
                    }
                    _jettag_c_if_17_384.doEnd();
                    _jettag_c_iterate_17_174.handleBodyContent(out);
                }
                _jettag_c_iterate_17_174.doEnd();
                out.write("\"><img src=\"images/icons/delete.gif\" /></a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</td>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_19_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_19_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_19_4.setTagInfo(_td_c_iterate_19_4);
                _jettag_c_iterate_19_4.doStart(context, out);
                while (_jettag_c_iterate_19_4.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_choose_20_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_20_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_20_4.setRuntimeParent(_jettag_c_iterate_19_4);
                    _jettag_c_choose_20_4.setTagInfo(_td_c_choose_20_4);
                    _jettag_c_choose_20_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_20_4_saved_out = out;
                    while (_jettag_c_choose_20_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_21_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_21_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_21_4.setRuntimeParent(_jettag_c_choose_20_4);
                        _jettag_c_when_21_4.setTagInfo(_td_c_when_21_4);
                        _jettag_c_when_21_4.doStart(context, out);
                        JET2Writer _jettag_c_when_21_4_saved_out = out;
                        while (_jettag_c_when_21_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\"><fmt:formatDate pattern=\"yyyy-MM-dd HH:mm:ss\" value=\"Dollar_symbol{current.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_22_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_22_116.setRuntimeParent(_jettag_c_when_21_4);
                            _jettag_c_get_22_116.setTagInfo(_td_c_get_22_116);
                            _jettag_c_get_22_116.doStart(context, out);
                            _jettag_c_get_22_116.doEnd();
                            out.write("}\"/>&nbsp;</td>");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_21_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_21_4_saved_out;
                        _jettag_c_when_21_4.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_24_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_24_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_24_4.setRuntimeParent(_jettag_c_choose_20_4);
                        _jettag_c_otherwise_24_4.setTagInfo(_td_c_otherwise_24_4);
                        _jettag_c_otherwise_24_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_24_4_saved_out = out;
                        while (_jettag_c_otherwise_24_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">Dollar_symbol{current.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_63); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_63.setRuntimeParent(_jettag_c_otherwise_24_4);
                            _jettag_c_get_25_63.setTagInfo(_td_c_get_25_63);
                            _jettag_c_get_25_63.doStart(context, out);
                            _jettag_c_get_25_63.doEnd();
                            out.write("} &nbsp;</td>");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_24_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_24_4_saved_out;
                        _jettag_c_otherwise_24_4.doEnd();
                        _jettag_c_choose_20_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_20_4_saved_out;
                    _jettag_c_choose_20_4.doEnd();
                    _jettag_c_iterate_19_4.handleBodyContent(out);
                }
                _jettag_c_iterate_19_4.doEnd();
                RuntimeTagElement _jettag_c_iterate_29_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_29_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_29_4.setTagInfo(_td_c_iterate_29_4);
                _jettag_c_iterate_29_4.doStart(context, out);
                while (_jettag_c_iterate_29_4.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_30_4.setRuntimeParent(_jettag_c_iterate_29_4);
                    _jettag_c_iterate_30_4.setTagInfo(_td_c_iterate_30_4);
                    _jettag_c_iterate_30_4.doStart(context, out);
                    while (_jettag_c_iterate_30_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_31_4.setRuntimeParent(_jettag_c_iterate_30_4);
                        _jettag_c_if_31_4.setTagInfo(_td_c_if_31_4);
                        _jettag_c_if_31_4.doStart(context, out);
                        while (_jettag_c_if_31_4.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_32_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_32_4.setRuntimeParent(_jettag_c_if_31_4);
                            _jettag_c_iterate_32_4.setTagInfo(_td_c_iterate_32_4);
                            _jettag_c_iterate_32_4.doStart(context, out);
                            while (_jettag_c_iterate_32_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_33_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_33_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_33_4.setRuntimeParent(_jettag_c_iterate_32_4);
                                _jettag_c_choose_33_4.setTagInfo(_td_c_choose_33_4);
                                _jettag_c_choose_33_4.doStart(context, out);
                                JET2Writer _jettag_c_choose_33_4_saved_out = out;
                                while (_jettag_c_choose_33_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_34_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_34_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_34_4.setRuntimeParent(_jettag_c_choose_33_4);
                                    _jettag_c_when_34_4.setTagInfo(_td_c_when_34_4);
                                    _jettag_c_when_34_4.doStart(context, out);
                                    JET2Writer _jettag_c_when_34_4_saved_out = out;
                                    while (_jettag_c_when_34_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">Dollar_symbol{current.");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_35_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_63); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_35_63.setRuntimeParent(_jettag_c_when_34_4);
                                        _jettag_c_get_35_63.setTagInfo(_td_c_get_35_63);
                                        _jettag_c_get_35_63.doStart(context, out);
                                        _jettag_c_get_35_63.doEnd();
                                        out.write(".name} &nbsp;</td>");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_when_34_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_34_4_saved_out;
                                    _jettag_c_when_34_4.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_37_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_37_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_37_4.setRuntimeParent(_jettag_c_choose_33_4);
                                    _jettag_c_otherwise_37_4.setTagInfo(_td_c_otherwise_37_4);
                                    _jettag_c_otherwise_37_4.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_37_4_saved_out = out;
                                    while (_jettag_c_otherwise_37_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_if_38_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_38_4.setRuntimeParent(_jettag_c_otherwise_37_4);
                                        _jettag_c_if_38_4.setTagInfo(_td_c_if_38_4);
                                        _jettag_c_if_38_4.doStart(context, out);
                                        while (_jettag_c_if_38_4.okToProcessBody()) {
                                            out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">Dollar_symbol{current.");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_39_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_63); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_39_63.setRuntimeParent(_jettag_c_if_38_4);
                                            _jettag_c_get_39_63.setTagInfo(_td_c_get_39_63);
                                            _jettag_c_get_39_63.doStart(context, out);
                                            _jettag_c_get_39_63.doEnd();
                                            out.write(".");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_39_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_106); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_39_106.setRuntimeParent(_jettag_c_if_38_4);
                                            _jettag_c_get_39_106.setTagInfo(_td_c_get_39_106);
                                            _jettag_c_get_39_106.doStart(context, out);
                                            _jettag_c_get_39_106.doEnd();
                                            out.write("} &nbsp;</td>");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_38_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_38_4.doEnd();
                                        _jettag_c_otherwise_37_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_37_4_saved_out;
                                    _jettag_c_otherwise_37_4.doEnd();
                                    _jettag_c_choose_33_4.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_33_4_saved_out;
                                _jettag_c_choose_33_4.doEnd();
                                _jettag_c_iterate_32_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_32_4.doEnd();
                            _jettag_c_if_31_4.handleBodyContent(out);
                        }
                        _jettag_c_if_31_4.doEnd();
                        _jettag_c_iterate_30_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_30_4.doEnd();
                    _jettag_c_iterate_29_4.handleBodyContent(out);
                }
                _jettag_c_iterate_29_4.doEnd();
                RuntimeTagElement _jettag_c_iterate_47_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_47_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_47_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_47_4.setTagInfo(_td_c_iterate_47_4);
                _jettag_c_iterate_47_4.doStart(context, out);
                while (_jettag_c_iterate_47_4.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_48_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_48_4.setRuntimeParent(_jettag_c_iterate_47_4);
                    _jettag_c_iterate_48_4.setTagInfo(_td_c_iterate_48_4);
                    _jettag_c_iterate_48_4.doStart(context, out);
                    while (_jettag_c_iterate_48_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_49_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_49_4.setRuntimeParent(_jettag_c_iterate_48_4);
                        _jettag_c_if_49_4.setTagInfo(_td_c_if_49_4);
                        _jettag_c_if_49_4.doStart(context, out);
                        while (_jettag_c_if_49_4.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_50_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_50_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_setVariable_50_4.setTagInfo(_td_c_setVariable_50_4);
                            _jettag_c_setVariable_50_4.doStart(context, out);
                            _jettag_c_setVariable_50_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_51_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_51_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_51_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_setVariable_51_4.setTagInfo(_td_c_setVariable_51_4);
                            _jettag_c_setVariable_51_4.doStart(context, out);
                            _jettag_c_setVariable_51_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_52_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_iterate_52_4.setTagInfo(_td_c_iterate_52_4);
                            _jettag_c_iterate_52_4.doStart(context, out);
                            while (_jettag_c_iterate_52_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_53_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_53_5.setRuntimeParent(_jettag_c_iterate_52_4);
                                _jettag_c_setVariable_53_5.setTagInfo(_td_c_setVariable_53_5);
                                _jettag_c_setVariable_53_5.doStart(context, out);
                                _jettag_c_setVariable_53_5.doEnd();
                                _jettag_c_iterate_52_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_52_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_55_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_55_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_iterate_55_4.setTagInfo(_td_c_iterate_55_4);
                            _jettag_c_iterate_55_4.doStart(context, out);
                            while (_jettag_c_iterate_55_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_56_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_56_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_56_5.setRuntimeParent(_jettag_c_iterate_55_4);
                                _jettag_c_setVariable_56_5.setTagInfo(_td_c_setVariable_56_5);
                                _jettag_c_setVariable_56_5.doStart(context, out);
                                _jettag_c_setVariable_56_5.doEnd();
                                _jettag_c_iterate_55_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_55_4.doEnd();
                            RuntimeTagElement _jettag_c_if_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_58_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_if_58_4.setTagInfo(_td_c_if_58_4);
                            _jettag_c_if_58_4.doStart(context, out);
                            while (_jettag_c_if_58_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_59_4.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_if_59_4.setTagInfo(_td_c_if_59_4);
                                _jettag_c_if_59_4.doStart(context, out);
                                while (_jettag_c_if_59_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_iterate_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_60_4.setRuntimeParent(_jettag_c_if_59_4);
                                    _jettag_c_iterate_60_4.setTagInfo(_td_c_iterate_60_4);
                                    _jettag_c_iterate_60_4.doStart(context, out);
                                    while (_jettag_c_iterate_60_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_61_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_61_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_61_4.setRuntimeParent(_jettag_c_iterate_60_4);
                                        _jettag_c_choose_61_4.setTagInfo(_td_c_choose_61_4);
                                        _jettag_c_choose_61_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_61_4_saved_out = out;
                                        while (_jettag_c_choose_61_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_62_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_62_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_62_4.setRuntimeParent(_jettag_c_choose_61_4);
                                            _jettag_c_when_62_4.setTagInfo(_td_c_when_62_4);
                                            _jettag_c_when_62_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_62_4_saved_out = out;
                                            while (_jettag_c_when_62_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_62_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_62_4_saved_out;
                                            _jettag_c_when_62_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_64_4.setRuntimeParent(_jettag_c_choose_61_4);
                                            _jettag_c_otherwise_64_4.setTagInfo(_td_c_otherwise_64_4);
                                            _jettag_c_otherwise_64_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_64_4_saved_out = out;
                                            while (_jettag_c_otherwise_64_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{empty(current.");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_66_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_64); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_66_64.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_get_66_64.setTagInfo(_td_c_get_66_64);
                                                _jettag_c_get_66_64.doStart(context, out);
                                                _jettag_c_get_66_64.doEnd();
                                                out.write("s) }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t<span style=\"color:red\">暂无");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_67_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_31); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_67_31.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_get_67_31.setTagInfo(_td_c_get_67_31);
                                                _jettag_c_get_67_31.doStart(context, out);
                                                _jettag_c_get_67_31.doEnd();
                                                out.write("</span>");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets ");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"0\"/%Right_angle_brackets ");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:forEach items=\"Dollar_symbol{current.");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_70_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_64); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_70_64.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_get_70_64.setTagInfo(_td_c_get_70_64);
                                                _jettag_c_get_70_64.doStart(context, out);
                                                _jettag_c_get_70_64.doEnd();
                                                out.write("s}\" var=\"referenced\" varStatus=\"i\"%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{isDone == '0' }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:choose>");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:when test=\"Dollar_symbol{i.count <6 }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_iterate_74_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_74_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_74_4.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_iterate_74_4.setTagInfo(_td_c_iterate_74_4);
                                                _jettag_c_iterate_74_4.doStart(context, out);
                                                while (_jettag_c_iterate_74_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_75_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_75_4.setRuntimeParent(_jettag_c_iterate_74_4);
                                                    _jettag_c_if_75_4.setTagInfo(_td_c_if_75_4);
                                                    _jettag_c_if_75_4.doStart(context, out);
                                                    while (_jettag_c_if_75_4.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_iterate_76_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_76_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_76_4.setRuntimeParent(_jettag_c_if_75_4);
                                                        _jettag_c_iterate_76_4.setTagInfo(_td_c_iterate_76_4);
                                                        _jettag_c_iterate_76_4.doStart(context, out);
                                                        while (_jettag_c_iterate_76_4.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_choose_77_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_77_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_choose_77_4.setRuntimeParent(_jettag_c_iterate_76_4);
                                                            _jettag_c_choose_77_4.setTagInfo(_td_c_choose_77_4);
                                                            _jettag_c_choose_77_4.doStart(context, out);
                                                            JET2Writer _jettag_c_choose_77_4_saved_out = out;
                                                            while (_jettag_c_choose_77_4.okToProcessBody()) {
                                                                out = out.newNestedContentWriter();
                                                                RuntimeTagElement _jettag_c_when_78_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_78_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_when_78_4.setRuntimeParent(_jettag_c_choose_77_4);
                                                                _jettag_c_when_78_4.setTagInfo(_td_c_when_78_4);
                                                                _jettag_c_when_78_4.doStart(context, out);
                                                                JET2Writer _jettag_c_when_78_4_saved_out = out;
                                                                while (_jettag_c_when_78_4.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("\t\t\t\tDollar_symbol{referenced.name}<br />");  //$NON-NLS-1$        
                                                                    out.write(NL);         
                                                                    _jettag_c_when_78_4.handleBodyContent(out);
                                                                }
                                                                out = _jettag_c_when_78_4_saved_out;
                                                                _jettag_c_when_78_4.doEnd();
                                                                RuntimeTagElement _jettag_c_otherwise_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_otherwise_81_4.setRuntimeParent(_jettag_c_choose_77_4);
                                                                _jettag_c_otherwise_81_4.setTagInfo(_td_c_otherwise_81_4);
                                                                _jettag_c_otherwise_81_4.doStart(context, out);
                                                                JET2Writer _jettag_c_otherwise_81_4_saved_out = out;
                                                                while (_jettag_c_otherwise_81_4.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    RuntimeTagElement _jettag_c_if_82_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_82_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                                    _jettag_c_if_82_4.setRuntimeParent(_jettag_c_otherwise_81_4);
                                                                    _jettag_c_if_82_4.setTagInfo(_td_c_if_82_4);
                                                                    _jettag_c_if_82_4.doStart(context, out);
                                                                    while (_jettag_c_if_82_4.okToProcessBody()) {
                                                                        out.write("\t\t\t\tDollar_symbol{referenced.");  //$NON-NLS-1$        
                                                                        RuntimeTagElement _jettag_c_get_83_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_30); //$NON-NLS-1$ //$NON-NLS-2$
                                                                        _jettag_c_get_83_30.setRuntimeParent(_jettag_c_if_82_4);
                                                                        _jettag_c_get_83_30.setTagInfo(_td_c_get_83_30);
                                                                        _jettag_c_get_83_30.doStart(context, out);
                                                                        _jettag_c_get_83_30.doEnd();
                                                                        out.write("}<br />");  //$NON-NLS-1$        
                                                                        out.write(NL);         
                                                                        _jettag_c_if_82_4.handleBodyContent(out);
                                                                    }
                                                                    _jettag_c_if_82_4.doEnd();
                                                                    _jettag_c_otherwise_81_4.handleBodyContent(out);
                                                                }
                                                                out = _jettag_c_otherwise_81_4_saved_out;
                                                                _jettag_c_otherwise_81_4.doEnd();
                                                                _jettag_c_choose_77_4.handleBodyContent(out);
                                                            }
                                                            out = _jettag_c_choose_77_4_saved_out;
                                                            _jettag_c_choose_77_4.doEnd();
                                                            _jettag_c_iterate_76_4.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_76_4.doEnd();
                                                        _jettag_c_if_75_4.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_75_4.doEnd();
                                                    _jettag_c_iterate_74_4.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_74_4.doEnd();
                                                out.write("\t\t\t\t%Left_angle_brackets/c:when%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"1\"/%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t<a href=\"Dollar_symbol{pageContext.request.contextPath}/select");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_93_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_67); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_93_67.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_get_93_67.setTagInfo(_td_c_get_93_67);
                                                _jettag_c_get_93_67.doStart(context, out);
                                                _jettag_c_get_93_67.doEnd();
                                                RuntimeTagElement _jettag_c_get_93_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_117); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_93_117.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_get_93_117.setTagInfo(_td_c_get_93_117);
                                                _jettag_c_get_93_117.doStart(context, out);
                                                _jettag_c_get_93_117.doEnd();
                                                out.write("s?");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_93_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_93_176); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_93_176.setRuntimeParent(_jettag_c_otherwise_64_4);
                                                _jettag_c_iterate_93_176.setTagInfo(_td_c_iterate_93_176);
                                                _jettag_c_iterate_93_176.doStart(context, out);
                                                while (_jettag_c_iterate_93_176.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_get_93_243 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_243); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_93_243.setRuntimeParent(_jettag_c_iterate_93_176);
                                                    _jettag_c_get_93_243.setTagInfo(_td_c_get_93_243);
                                                    _jettag_c_get_93_243.doStart(context, out);
                                                    _jettag_c_get_93_243.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_93_278 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_278); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_93_278.setRuntimeParent(_jettag_c_iterate_93_176);
                                                    _jettag_c_get_93_278.setTagInfo(_td_c_get_93_278);
                                                    _jettag_c_get_93_278.doStart(context, out);
                                                    _jettag_c_get_93_278.doEnd();
                                                    out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_93_336 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_336); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_93_336.setRuntimeParent(_jettag_c_iterate_93_176);
                                                    _jettag_c_get_93_336.setTagInfo(_td_c_get_93_336);
                                                    _jettag_c_get_93_336.doStart(context, out);
                                                    _jettag_c_get_93_336.doEnd();
                                                    out.write("}");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_setVariable_93_372 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_93_372); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_93_372.setRuntimeParent(_jettag_c_iterate_93_176);
                                                    _jettag_c_setVariable_93_372.setTagInfo(_td_c_setVariable_93_372);
                                                    _jettag_c_setVariable_93_372.doStart(context, out);
                                                    _jettag_c_setVariable_93_372.doEnd();
                                                    RuntimeTagElement _jettag_c_if_93_421 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_93_421); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_93_421.setRuntimeParent(_jettag_c_iterate_93_176);
                                                    _jettag_c_if_93_421.setTagInfo(_td_c_if_93_421);
                                                    _jettag_c_if_93_421.doStart(context, out);
                                                    while (_jettag_c_if_93_421.okToProcessBody()) {
                                                        out.write("&");  //$NON-NLS-1$        
                                                        _jettag_c_if_93_421.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_93_421.doEnd();
                                                    _jettag_c_iterate_93_176.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_93_176.doEnd();
                                                out.write("&page=homePage\">更多</a>");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_brackets/c:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_brackets/c:choose%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t%Left_angle_brackets/c:forEach%Right_angle_brackets &nbsp;</td>");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_64_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_64_4_saved_out;
                                            _jettag_c_otherwise_64_4.doEnd();
                                            _jettag_c_choose_61_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_61_4_saved_out;
                                        _jettag_c_choose_61_4.doEnd();
                                        _jettag_c_iterate_60_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_60_4.doEnd();
                                    _jettag_c_if_59_4.handleBodyContent(out);
                                }
                                _jettag_c_if_59_4.doEnd();
                                RuntimeTagElement _jettag_c_if_102_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_102_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_102_4.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_if_102_4.setTagInfo(_td_c_if_102_4);
                                _jettag_c_if_102_4.doStart(context, out);
                                while (_jettag_c_if_102_4.okToProcessBody()) {
                                    out.write("\t\t\t\t<td nowrap=\"nowrap\" class=\"tabletd\">");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{empty(current.");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_104_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_64); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_104_64.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_get_104_64.setTagInfo(_td_c_get_104_64);
                                    _jettag_c_get_104_64.doStart(context, out);
                                    _jettag_c_get_104_64.doEnd();
                                    out.write("s) }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t<span style=\"color:red\">暂无");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_105_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_31); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_105_31.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_get_105_31.setTagInfo(_td_c_get_105_31);
                                    _jettag_c_get_105_31.doStart(context, out);
                                    _jettag_c_get_105_31.doEnd();
                                    out.write("s</span>");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets ");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"0\"/%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:forEach items=\"Dollar_symbol{current.");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_108_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_64); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_64.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_get_108_64.setTagInfo(_td_c_get_108_64);
                                    _jettag_c_get_108_64.doStart(context, out);
                                    _jettag_c_get_108_64.doEnd();
                                    out.write("s}\" var=\"referenced\" varStatus=\"i\"%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{isDone == '0' }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:choose%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:when test=\"Dollar_symbol{i.count <6 }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_iterate_112_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_112_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_112_4.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_iterate_112_4.setTagInfo(_td_c_iterate_112_4);
                                    _jettag_c_iterate_112_4.doStart(context, out);
                                    while (_jettag_c_iterate_112_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_113_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_113_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_113_4.setRuntimeParent(_jettag_c_iterate_112_4);
                                        _jettag_c_if_113_4.setTagInfo(_td_c_if_113_4);
                                        _jettag_c_if_113_4.doStart(context, out);
                                        while (_jettag_c_if_113_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_iterate_114_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_114_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_114_4.setRuntimeParent(_jettag_c_if_113_4);
                                            _jettag_c_iterate_114_4.setTagInfo(_td_c_iterate_114_4);
                                            _jettag_c_iterate_114_4.doStart(context, out);
                                            while (_jettag_c_iterate_114_4.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_choose_115_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_115_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_choose_115_4.setRuntimeParent(_jettag_c_iterate_114_4);
                                                _jettag_c_choose_115_4.setTagInfo(_td_c_choose_115_4);
                                                _jettag_c_choose_115_4.doStart(context, out);
                                                JET2Writer _jettag_c_choose_115_4_saved_out = out;
                                                while (_jettag_c_choose_115_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    RuntimeTagElement _jettag_c_when_116_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_116_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_when_116_4.setRuntimeParent(_jettag_c_choose_115_4);
                                                    _jettag_c_when_116_4.setTagInfo(_td_c_when_116_4);
                                                    _jettag_c_when_116_4.doStart(context, out);
                                                    JET2Writer _jettag_c_when_116_4_saved_out = out;
                                                    while (_jettag_c_when_116_4.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("\t\t\t\tDollar_symbol{referenced.name}<br />");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        _jettag_c_when_116_4.handleBodyContent(out);
                                                    }
                                                    out = _jettag_c_when_116_4_saved_out;
                                                    _jettag_c_when_116_4.doEnd();
                                                    RuntimeTagElement _jettag_c_otherwise_119_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_119_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_otherwise_119_4.setRuntimeParent(_jettag_c_choose_115_4);
                                                    _jettag_c_otherwise_119_4.setTagInfo(_td_c_otherwise_119_4);
                                                    _jettag_c_otherwise_119_4.doStart(context, out);
                                                    JET2Writer _jettag_c_otherwise_119_4_saved_out = out;
                                                    while (_jettag_c_otherwise_119_4.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        RuntimeTagElement _jettag_c_if_120_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_120_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_120_4.setRuntimeParent(_jettag_c_otherwise_119_4);
                                                        _jettag_c_if_120_4.setTagInfo(_td_c_if_120_4);
                                                        _jettag_c_if_120_4.doStart(context, out);
                                                        while (_jettag_c_if_120_4.okToProcessBody()) {
                                                            out.write("\t\t\t\tDollar_symbol{referenced.");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_121_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_30); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_121_30.setRuntimeParent(_jettag_c_if_120_4);
                                                            _jettag_c_get_121_30.setTagInfo(_td_c_get_121_30);
                                                            _jettag_c_get_121_30.doStart(context, out);
                                                            _jettag_c_get_121_30.doEnd();
                                                            out.write("}<br />");  //$NON-NLS-1$        
                                                            out.write(NL);         
                                                            _jettag_c_if_120_4.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_120_4.doEnd();
                                                        _jettag_c_otherwise_119_4.handleBodyContent(out);
                                                    }
                                                    out = _jettag_c_otherwise_119_4_saved_out;
                                                    _jettag_c_otherwise_119_4.doEnd();
                                                    _jettag_c_choose_115_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_choose_115_4_saved_out;
                                                _jettag_c_choose_115_4.doEnd();
                                                _jettag_c_iterate_114_4.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_114_4.doEnd();
                                            _jettag_c_if_113_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_113_4.doEnd();
                                        _jettag_c_iterate_112_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_112_4.doEnd();
                                    out.write("\t\t\t\t%Left_angle_brackets/c:when%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"1\"/%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t<a href=\"Dollar_symbol{pageContext.request.contextPath}/select");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_131_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_67); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_131_67.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_get_131_67.setTagInfo(_td_c_get_131_67);
                                    _jettag_c_get_131_67.doStart(context, out);
                                    _jettag_c_get_131_67.doEnd();
                                    RuntimeTagElement _jettag_c_get_131_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_117); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_131_117.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_get_131_117.setTagInfo(_td_c_get_131_117);
                                    _jettag_c_get_131_117.doStart(context, out);
                                    _jettag_c_get_131_117.doEnd();
                                    out.write("s?");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_131_170 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_131_170); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_131_170.setRuntimeParent(_jettag_c_if_102_4);
                                    _jettag_c_iterate_131_170.setTagInfo(_td_c_iterate_131_170);
                                    _jettag_c_iterate_131_170.doStart(context, out);
                                    while (_jettag_c_iterate_131_170.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_get_131_237 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_237); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_131_237.setRuntimeParent(_jettag_c_iterate_131_170);
                                        _jettag_c_get_131_237.setTagInfo(_td_c_get_131_237);
                                        _jettag_c_get_131_237.doStart(context, out);
                                        _jettag_c_get_131_237.doEnd();
                                        out.write("_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_131_272 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_272); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_131_272.setRuntimeParent(_jettag_c_iterate_131_170);
                                        _jettag_c_get_131_272.setTagInfo(_td_c_get_131_272);
                                        _jettag_c_get_131_272.doStart(context, out);
                                        _jettag_c_get_131_272.doEnd();
                                        out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_131_330 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_131_330); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_131_330.setRuntimeParent(_jettag_c_iterate_131_170);
                                        _jettag_c_get_131_330.setTagInfo(_td_c_get_131_330);
                                        _jettag_c_get_131_330.doStart(context, out);
                                        _jettag_c_get_131_330.doEnd();
                                        out.write("}");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_setVariable_131_366 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_131_366); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_131_366.setRuntimeParent(_jettag_c_iterate_131_170);
                                        _jettag_c_setVariable_131_366.setTagInfo(_td_c_setVariable_131_366);
                                        _jettag_c_setVariable_131_366.doStart(context, out);
                                        _jettag_c_setVariable_131_366.doEnd();
                                        RuntimeTagElement _jettag_c_if_131_415 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_131_415); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_131_415.setRuntimeParent(_jettag_c_iterate_131_170);
                                        _jettag_c_if_131_415.setTagInfo(_td_c_if_131_415);
                                        _jettag_c_if_131_415.doStart(context, out);
                                        while (_jettag_c_if_131_415.okToProcessBody()) {
                                            out.write("&");  //$NON-NLS-1$        
                                            _jettag_c_if_131_415.handleBodyContent(out);
                                        }
                                        _jettag_c_if_131_415.doEnd();
                                        _jettag_c_iterate_131_170.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_131_170.doEnd();
                                    out.write("&page=homePage\">更多</a>");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_brackets/c:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_brackets/c:choose%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t%Left_angle_brackets/c:forEach%Right_angle_brackets &nbsp;</td>");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_102_4.handleBodyContent(out);
                                }
                                _jettag_c_if_102_4.doEnd();
                                _jettag_c_if_58_4.handleBodyContent(out);
                            }
                            _jettag_c_if_58_4.doEnd();
                            RuntimeTagElement _jettag_c_if_138_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_138_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_138_4.setRuntimeParent(_jettag_c_if_49_4);
                            _jettag_c_if_138_4.setTagInfo(_td_c_if_138_4);
                            _jettag_c_if_138_4.doStart(context, out);
                            while (_jettag_c_if_138_4.okToProcessBody()) {
                                out.write("\t       \t    <td nowrap=\"nowrap\" class=\"tabletd\">");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{empty(current.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_140_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_140_64); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_140_64.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_get_140_64.setTagInfo(_td_c_get_140_64);
                                _jettag_c_get_140_64.doStart(context, out);
                                _jettag_c_get_140_64.doEnd();
                                out.write("s) }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t<span style=\"color:red\">暂无");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_141_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_31); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_141_31.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_get_141_31.setTagInfo(_td_c_get_141_31);
                                _jettag_c_get_141_31.doStart(context, out);
                                _jettag_c_get_141_31.doEnd();
                                out.write("s</span>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets ");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"0\"/%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:forEach items=\"Dollar_symbol{current.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_144_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_64); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_144_64.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_get_144_64.setTagInfo(_td_c_get_144_64);
                                _jettag_c_get_144_64.doStart(context, out);
                                _jettag_c_get_144_64.doEnd();
                                out.write("s}\" var=\"referenced\" varStatus=\"i\"%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{isDone == '0' }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:choose%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:when test=\"Dollar_symbol{i.count <6 }\"%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                RuntimeTagElement _jettag_c_iterate_148_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_148_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_148_4.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_iterate_148_4.setTagInfo(_td_c_iterate_148_4);
                                _jettag_c_iterate_148_4.doStart(context, out);
                                while (_jettag_c_iterate_148_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_149_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_149_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_149_4.setRuntimeParent(_jettag_c_iterate_148_4);
                                    _jettag_c_if_149_4.setTagInfo(_td_c_if_149_4);
                                    _jettag_c_if_149_4.doStart(context, out);
                                    while (_jettag_c_if_149_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_iterate_150_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_150_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_150_4.setRuntimeParent(_jettag_c_if_149_4);
                                        _jettag_c_iterate_150_4.setTagInfo(_td_c_iterate_150_4);
                                        _jettag_c_iterate_150_4.doStart(context, out);
                                        while (_jettag_c_iterate_150_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_choose_151_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_151_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_choose_151_4.setRuntimeParent(_jettag_c_iterate_150_4);
                                            _jettag_c_choose_151_4.setTagInfo(_td_c_choose_151_4);
                                            _jettag_c_choose_151_4.doStart(context, out);
                                            JET2Writer _jettag_c_choose_151_4_saved_out = out;
                                            while (_jettag_c_choose_151_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_when_152_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_152_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_when_152_4.setRuntimeParent(_jettag_c_choose_151_4);
                                                _jettag_c_when_152_4.setTagInfo(_td_c_when_152_4);
                                                _jettag_c_when_152_4.doStart(context, out);
                                                JET2Writer _jettag_c_when_152_4_saved_out = out;
                                                while (_jettag_c_when_152_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("\t\t\t\tDollar_symbol{referenced.name}<br />");  //$NON-NLS-1$        
                                                    out.write(NL);         
                                                    _jettag_c_when_152_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_when_152_4_saved_out;
                                                _jettag_c_when_152_4.doEnd();
                                                RuntimeTagElement _jettag_c_otherwise_155_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_155_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_otherwise_155_4.setRuntimeParent(_jettag_c_choose_151_4);
                                                _jettag_c_otherwise_155_4.setTagInfo(_td_c_otherwise_155_4);
                                                _jettag_c_otherwise_155_4.doStart(context, out);
                                                JET2Writer _jettag_c_otherwise_155_4_saved_out = out;
                                                while (_jettag_c_otherwise_155_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    RuntimeTagElement _jettag_c_if_156_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_156_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_156_4.setRuntimeParent(_jettag_c_otherwise_155_4);
                                                    _jettag_c_if_156_4.setTagInfo(_td_c_if_156_4);
                                                    _jettag_c_if_156_4.doStart(context, out);
                                                    while (_jettag_c_if_156_4.okToProcessBody()) {
                                                        out.write("\t\t\t\tDollar_symbol{referenced.");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_157_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_157_30); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_157_30.setRuntimeParent(_jettag_c_if_156_4);
                                                        _jettag_c_get_157_30.setTagInfo(_td_c_get_157_30);
                                                        _jettag_c_get_157_30.doStart(context, out);
                                                        _jettag_c_get_157_30.doEnd();
                                                        out.write("}<br />");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        _jettag_c_if_156_4.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_156_4.doEnd();
                                                    _jettag_c_otherwise_155_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_otherwise_155_4_saved_out;
                                                _jettag_c_otherwise_155_4.doEnd();
                                                _jettag_c_choose_151_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_choose_151_4_saved_out;
                                            _jettag_c_choose_151_4.doEnd();
                                            _jettag_c_iterate_150_4.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_150_4.doEnd();
                                        _jettag_c_if_149_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_149_4.doEnd();
                                    _jettag_c_iterate_148_4.handleBodyContent(out);
                                }
                                _jettag_c_iterate_148_4.doEnd();
                                out.write("\t\t\t\t%Left_angle_brackets/c:when%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_bracketsc:set var=\"isDone\" value=\"1\"/%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t<a href=\"Dollar_symbol{pageContext.request.contextPath}/select");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_167_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_67); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_167_67.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_get_167_67.setTagInfo(_td_c_get_167_67);
                                _jettag_c_get_167_67.doStart(context, out);
                                _jettag_c_get_167_67.doEnd();
                                RuntimeTagElement _jettag_c_get_167_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_117); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_167_117.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_get_167_117.setTagInfo(_td_c_get_167_117);
                                _jettag_c_get_167_117.doStart(context, out);
                                _jettag_c_get_167_117.doEnd();
                                out.write("s?");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_167_170 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_167_170); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_167_170.setRuntimeParent(_jettag_c_if_138_4);
                                _jettag_c_iterate_167_170.setTagInfo(_td_c_iterate_167_170);
                                _jettag_c_iterate_167_170.doStart(context, out);
                                while (_jettag_c_iterate_167_170.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_get_167_237 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_237); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_167_237.setRuntimeParent(_jettag_c_iterate_167_170);
                                    _jettag_c_get_167_237.setTagInfo(_td_c_get_167_237);
                                    _jettag_c_get_167_237.doStart(context, out);
                                    _jettag_c_get_167_237.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_167_272 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_272); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_167_272.setRuntimeParent(_jettag_c_iterate_167_170);
                                    _jettag_c_get_167_272.setTagInfo(_td_c_get_167_272);
                                    _jettag_c_get_167_272.doStart(context, out);
                                    _jettag_c_get_167_272.doEnd();
                                    out.write("=Dollar_symbol{current.");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_167_330 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_330); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_167_330.setRuntimeParent(_jettag_c_iterate_167_170);
                                    _jettag_c_get_167_330.setTagInfo(_td_c_get_167_330);
                                    _jettag_c_get_167_330.doStart(context, out);
                                    _jettag_c_get_167_330.doEnd();
                                    out.write("}");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_setVariable_167_366 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_167_366); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_167_366.setRuntimeParent(_jettag_c_iterate_167_170);
                                    _jettag_c_setVariable_167_366.setTagInfo(_td_c_setVariable_167_366);
                                    _jettag_c_setVariable_167_366.doStart(context, out);
                                    _jettag_c_setVariable_167_366.doEnd();
                                    RuntimeTagElement _jettag_c_if_167_415 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_167_415); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_167_415.setRuntimeParent(_jettag_c_iterate_167_170);
                                    _jettag_c_if_167_415.setTagInfo(_td_c_if_167_415);
                                    _jettag_c_if_167_415.doStart(context, out);
                                    while (_jettag_c_if_167_415.okToProcessBody()) {
                                        out.write("&");  //$NON-NLS-1$        
                                        _jettag_c_if_167_415.handleBodyContent(out);
                                    }
                                    _jettag_c_if_167_415.doEnd();
                                    _jettag_c_iterate_167_170.handleBodyContent(out);
                                }
                                _jettag_c_iterate_167_170.doEnd();
                                out.write("&page=homePage\">更多</a>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_brackets/c:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_brackets/c:choose%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t%Left_angle_brackets/c:forEach%Right_angle_brackets &nbsp;</td>");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_138_4.handleBodyContent(out);
                            }
                            _jettag_c_if_138_4.doEnd();
                            _jettag_c_if_49_4.handleBodyContent(out);
                        }
                        _jettag_c_if_49_4.doEnd();
                        _jettag_c_iterate_48_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_48_4.doEnd();
                    _jettag_c_iterate_47_4.handleBodyContent(out);
                }
                _jettag_c_iterate_47_4.doEnd();
                out.write("\t\t\t</tr>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t%Left_angle_brackets/c:forEach%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</tbody>");  //$NON-NLS-1$        
                _jettag_c_replaceStrings_1_53.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_1_53_saved_out;
            _jettag_c_replaceStrings_1_53.doEnd();
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
