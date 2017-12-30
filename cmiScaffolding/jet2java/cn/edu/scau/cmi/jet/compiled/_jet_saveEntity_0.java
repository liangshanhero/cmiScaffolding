package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_saveEntity_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_saveEntity_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$x+1", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$y+1", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_9_2 = new TagInfo("c:choose", //$NON-NLS-1$
            9, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_10_2 = new TagInfo("c:when", //$NON-NLS-1$
            10, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($x=0)and($y=0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_18 = new TagInfo("c:get", //$NON-NLS-1$
            16, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_69 = new TagInfo("c:get", //$NON-NLS-1$
            16, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_120 = new TagInfo("c:get", //$NON-NLS-1$
            16, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_3 = new TagInfo("c:if", //$NON-NLS-1$
            17, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_3 = new TagInfo("c:get", //$NON-NLS-1$
            18, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_62 = new TagInfo("c:get", //$NON-NLS-1$
            18, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_115 = new TagInfo("c:get", //$NON-NLS-1$
            18, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_157 = new TagInfo("c:get", //$NON-NLS-1$
            18, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_287 = new TagInfo("c:get", //$NON-NLS-1$
            18, 287,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_325 = new TagInfo("c:get", //$NON-NLS-1$
            18, 325,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_18_378 = new TagInfo("c:setVariable", //$NON-NLS-1$
            18, 378,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_427 = new TagInfo("c:if", //$NON-NLS-1$
            18, 427,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_3 = new TagInfo("c:if", //$NON-NLS-1$
            20, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_3 = new TagInfo("c:get", //$NON-NLS-1$
            21, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_62 = new TagInfo("c:get", //$NON-NLS-1$
            21, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_115 = new TagInfo("c:get", //$NON-NLS-1$
            21, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_157 = new TagInfo("c:get", //$NON-NLS-1$
            21, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_287 = new TagInfo("c:get", //$NON-NLS-1$
            21, 287,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_325 = new TagInfo("c:get", //$NON-NLS-1$
            21, 325,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_383 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 383,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_432 = new TagInfo("c:if", //$NON-NLS-1$
            21, 432,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_15 = new TagInfo("c:get", //$NON-NLS-1$
            23, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_16 = new TagInfo("c:get", //$NON-NLS-1$
            24, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_70 = new TagInfo("c:get", //$NON-NLS-1$
            24, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_13 = new TagInfo("c:get", //$NON-NLS-1$
            26, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_67 = new TagInfo("c:get", //$NON-NLS-1$
            26, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($PK/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_111 = new TagInfo("c:get", //$NON-NLS-1$
            26, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_149 = new TagInfo("c:get", //$NON-NLS-1$
            26, 149,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($PK/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_7 = new TagInfo("c:get", //$NON-NLS-1$
            31, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_45 = new TagInfo("c:get", //$NON-NLS-1$
            31, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_26 = new TagInfo("c:get", //$NON-NLS-1$
            32, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_64 = new TagInfo("c:get", //$NON-NLS-1$
            32, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_12 = new TagInfo("c:get", //$NON-NLS-1$
            33, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_66 = new TagInfo("c:get", //$NON-NLS-1$
            33, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_125 = new TagInfo("c:get", //$NON-NLS-1$
            33, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_163 = new TagInfo("c:get", //$NON-NLS-1$
            33, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_13 = new TagInfo("c:get", //$NON-NLS-1$
            36, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_67 = new TagInfo("c:get", //$NON-NLS-1$
            36, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_4 = new TagInfo("c:get", //$NON-NLS-1$
            39, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_41 = new TagInfo("c:get", //$NON-NLS-1$
            39, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_93 = new TagInfo("c:get", //$NON-NLS-1$
            39, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_26 = new TagInfo("c:get", //$NON-NLS-1$
            41, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_4 = new TagInfo("c:get", //$NON-NLS-1$
            42, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_41 = new TagInfo("c:get", //$NON-NLS-1$
            42, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_85 = new TagInfo("c:get", //$NON-NLS-1$
            42, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_3 = new TagInfo("c:get", //$NON-NLS-1$
            44, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_47_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            47, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_48_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            48, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_52_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            52, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_18 = new TagInfo("c:get", //$NON-NLS-1$
            55, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_69 = new TagInfo("c:get", //$NON-NLS-1$
            55, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_120 = new TagInfo("c:get", //$NON-NLS-1$
            55, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_3 = new TagInfo("c:if", //$NON-NLS-1$
            56, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_3 = new TagInfo("c:get", //$NON-NLS-1$
            57, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_62 = new TagInfo("c:get", //$NON-NLS-1$
            57, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_115 = new TagInfo("c:get", //$NON-NLS-1$
            57, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_157 = new TagInfo("c:get", //$NON-NLS-1$
            57, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_57_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            57, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_287 = new TagInfo("c:get", //$NON-NLS-1$
            57, 287,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_325 = new TagInfo("c:get", //$NON-NLS-1$
            57, 325,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_378 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 378,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_57_427 = new TagInfo("c:if", //$NON-NLS-1$
            57, 427,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_59_3 = new TagInfo("c:if", //$NON-NLS-1$
            59, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_3 = new TagInfo("c:get", //$NON-NLS-1$
            60, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_62 = new TagInfo("c:get", //$NON-NLS-1$
            60, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_115 = new TagInfo("c:get", //$NON-NLS-1$
            60, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_157 = new TagInfo("c:get", //$NON-NLS-1$
            60, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_287 = new TagInfo("c:get", //$NON-NLS-1$
            60, 287,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_325 = new TagInfo("c:get", //$NON-NLS-1$
            60, 325,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_383 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 383,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_432 = new TagInfo("c:if", //$NON-NLS-1$
            60, 432,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_15 = new TagInfo("c:get", //$NON-NLS-1$
            62, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_15 = new TagInfo("c:get", //$NON-NLS-1$
            63, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_67 = new TagInfo("c:get", //$NON-NLS-1$
            63, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_64_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            64, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_12 = new TagInfo("c:get", //$NON-NLS-1$
            65, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_66 = new TagInfo("c:get", //$NON-NLS-1$
            65, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_117 = new TagInfo("c:get", //$NON-NLS-1$
            65, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_155 = new TagInfo("c:get", //$NON-NLS-1$
            65, 155,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_7 = new TagInfo("c:get", //$NON-NLS-1$
            70, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_45 = new TagInfo("c:get", //$NON-NLS-1$
            70, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_26 = new TagInfo("c:get", //$NON-NLS-1$
            71, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_64 = new TagInfo("c:get", //$NON-NLS-1$
            71, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_12 = new TagInfo("c:get", //$NON-NLS-1$
            72, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_66 = new TagInfo("c:get", //$NON-NLS-1$
            72, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_125 = new TagInfo("c:get", //$NON-NLS-1$
            72, 125,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_163 = new TagInfo("c:get", //$NON-NLS-1$
            72, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_13 = new TagInfo("c:get", //$NON-NLS-1$
            75, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_67 = new TagInfo("c:get", //$NON-NLS-1$
            75, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_78_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            78, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_79_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            79, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_80_4 = new TagInfo("c:if", //$NON-NLS-1$
            80, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_81_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            81, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_82_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            82, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_84_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            84, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_86_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            86, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_87_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            87, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_89_4 = new TagInfo("c:choose", //$NON-NLS-1$
            89, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_90_4 = new TagInfo("c:when", //$NON-NLS-1$
            90, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_91_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            91, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_92_4 = new TagInfo("c:choose", //$NON-NLS-1$
            92, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_93_4 = new TagInfo("c:when", //$NON-NLS-1$
            93, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_95_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            95, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_96_7 = new TagInfo("c:get", //$NON-NLS-1$
            96, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_45 = new TagInfo("c:get", //$NON-NLS-1$
            96, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_9 = new TagInfo("c:get", //$NON-NLS-1$
            97, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_75 = new TagInfo("c:get", //$NON-NLS-1$
            97, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_133 = new TagInfo("c:get", //$NON-NLS-1$
            97, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_97_171 = new TagInfo("c:get", //$NON-NLS-1$
            97, 171,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_35 = new TagInfo("c:get", //$NON-NLS-1$
            98, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_13 = new TagInfo("c:get", //$NON-NLS-1$
            99, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_67 = new TagInfo("c:get", //$NON-NLS-1$
            99, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_126 = new TagInfo("c:get", //$NON-NLS-1$
            99, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_164 = new TagInfo("c:get", //$NON-NLS-1$
            99, 164,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_13 = new TagInfo("c:get", //$NON-NLS-1$
            102, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_67 = new TagInfo("c:get", //$NON-NLS-1$
            102, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_107_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            107, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_108_7 = new TagInfo("c:get", //$NON-NLS-1$
            108, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_45 = new TagInfo("c:get", //$NON-NLS-1$
            108, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_9 = new TagInfo("c:get", //$NON-NLS-1$
            109, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_73 = new TagInfo("c:get", //$NON-NLS-1$
            109, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_129 = new TagInfo("c:get", //$NON-NLS-1$
            109, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_109_167 = new TagInfo("c:get", //$NON-NLS-1$
            109, 167,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_13 = new TagInfo("c:get", //$NON-NLS-1$
            110, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_72 = new TagInfo("c:get", //$NON-NLS-1$
            110, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_131 = new TagInfo("c:get", //$NON-NLS-1$
            110, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_35 = new TagInfo("c:get", //$NON-NLS-1$
            111, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_13 = new TagInfo("c:get", //$NON-NLS-1$
            113, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_67 = new TagInfo("c:get", //$NON-NLS-1$
            113, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_124 = new TagInfo("c:get", //$NON-NLS-1$
            113, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_162 = new TagInfo("c:get", //$NON-NLS-1$
            113, 162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_13 = new TagInfo("c:get", //$NON-NLS-1$
            116, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_67 = new TagInfo("c:get", //$NON-NLS-1$
            116, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_34 = new TagInfo("c:get", //$NON-NLS-1$
            122, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_26 = new TagInfo("c:get", //$NON-NLS-1$
            124, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_4 = new TagInfo("c:get", //$NON-NLS-1$
            125, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_41 = new TagInfo("c:get", //$NON-NLS-1$
            125, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_85 = new TagInfo("c:get", //$NON-NLS-1$
            125, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_3 = new TagInfo("c:get", //$NON-NLS-1$
            127, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_130_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            130, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_131_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            131, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_132_2 = new TagInfo("c:if", //$NON-NLS-1$
            132, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_133_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            133, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_9 = new TagInfo("c:get", //$NON-NLS-1$
            135, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_64 = new TagInfo("c:get", //$NON-NLS-1$
            135, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_114 = new TagInfo("c:get", //$NON-NLS-1$
            135, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_135_173 = new TagInfo("c:iterate", //$NON-NLS-1$
            135, 173,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_240 = new TagInfo("c:if", //$NON-NLS-1$
            135, 240,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_483 = new TagInfo("c:get", //$NON-NLS-1$
            135, 483,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_525 = new TagInfo("c:if", //$NON-NLS-1$
            135, 525,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_688 = new TagInfo("c:get", //$NON-NLS-1$
            135, 688,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_730 = new TagInfo("c:if", //$NON-NLS-1$
            135, 730,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_135_881 = new TagInfo("java:import", //$NON-NLS-1$
            135, 881,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_135_923 = new TagInfo("c:get", //$NON-NLS-1$
            135, 923,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_965 = new TagInfo("c:if", //$NON-NLS-1$
            135, 965,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_135_1116 = new TagInfo("java:import", //$NON-NLS-1$
            135, 1116,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_135_1164 = new TagInfo("c:get", //$NON-NLS-1$
            135, 1164,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_135_1206 = new TagInfo("c:setVariable", //$NON-NLS-1$
            135, 1206,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_135_1255 = new TagInfo("c:if", //$NON-NLS-1$
            135, 1255,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_1299 = new TagInfo("c:get", //$NON-NLS-1$
            135, 1299,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_135_1366 = new TagInfo("c:get", //$NON-NLS-1$
            135, 1366,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_136_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            136, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_3 = new TagInfo("c:get", //$NON-NLS-1$
            137, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_54 = new TagInfo("c:get", //$NON-NLS-1$
            137, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_91 = new TagInfo("c:get", //$NON-NLS-1$
            137, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_133 = new TagInfo("c:get", //$NON-NLS-1$
            137, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_137_196 = new TagInfo("c:iterate", //$NON-NLS-1$
            137, 196,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_137_263 = new TagInfo("c:get", //$NON-NLS-1$
            137, 263,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_137_298 = new TagInfo("c:setVariable", //$NON-NLS-1$
            137, 298,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_347 = new TagInfo("c:if", //$NON-NLS-1$
            137, 347,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_138_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            138, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_139_3 = new TagInfo("c:if", //$NON-NLS-1$
            139, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_140_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            140, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_141_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            141, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_142_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            142, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_144_3 = new TagInfo("c:if", //$NON-NLS-1$
            144, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_3 = new TagInfo("c:get", //$NON-NLS-1$
            145, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_70 = new TagInfo("c:get", //$NON-NLS-1$
            145, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_131 = new TagInfo("c:get", //$NON-NLS-1$
            145, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_181 = new TagInfo("c:get", //$NON-NLS-1$
            145, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_145_252 = new TagInfo("c:iterate", //$NON-NLS-1$
            145, 252,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_316 = new TagInfo("c:get", //$NON-NLS-1$
            145, 316,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_362 = new TagInfo("c:get", //$NON-NLS-1$
            145, 362,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_145_411 = new TagInfo("c:setVariable", //$NON-NLS-1$
            145, 411,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_145_464 = new TagInfo("c:if", //$NON-NLS-1$
            145, 464,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_147_3 = new TagInfo("c:if", //$NON-NLS-1$
            147, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_3 = new TagInfo("c:get", //$NON-NLS-1$
            148, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_70 = new TagInfo("c:get", //$NON-NLS-1$
            148, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_131 = new TagInfo("c:get", //$NON-NLS-1$
            148, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_181 = new TagInfo("c:get", //$NON-NLS-1$
            148, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_148_252 = new TagInfo("c:iterate", //$NON-NLS-1$
            148, 252,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_316 = new TagInfo("c:get", //$NON-NLS-1$
            148, 316,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_362 = new TagInfo("c:get", //$NON-NLS-1$
            148, 362,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_148_416 = new TagInfo("c:setVariable", //$NON-NLS-1$
            148, 416,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_148_469 = new TagInfo("c:if", //$NON-NLS-1$
            148, 469,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_15 = new TagInfo("c:get", //$NON-NLS-1$
            152, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_153_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            153, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_154_4 = new TagInfo("c:if", //$NON-NLS-1$
            154, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ref/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_155_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            155, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_12 = new TagInfo("c:get", //$NON-NLS-1$
            156, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_74 = new TagInfo("c:get", //$NON-NLS-1$
            156, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_134 = new TagInfo("c:get", //$NON-NLS-1$
            156, 134,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_156_180 = new TagInfo("c:get", //$NON-NLS-1$
            156, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_158_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            158, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_12 = new TagInfo("c:get", //$NON-NLS-1$
            159, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_74 = new TagInfo("c:get", //$NON-NLS-1$
            159, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_133 = new TagInfo("c:get", //$NON-NLS-1$
            159, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_179 = new TagInfo("c:get", //$NON-NLS-1$
            159, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_12 = new TagInfo("c:get", //$NON-NLS-1$
            163, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_65 = new TagInfo("c:get", //$NON-NLS-1$
            163, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_12 = new TagInfo("c:get", //$NON-NLS-1$
            165, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_57 = new TagInfo("c:get", //$NON-NLS-1$
            165, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_165_117 = new TagInfo("c:get", //$NON-NLS-1$
            165, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_4 = new TagInfo("c:get", //$NON-NLS-1$
            166, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_3 = new TagInfo("c:get", //$NON-NLS-1$
            168, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_41 = new TagInfo("c:get", //$NON-NLS-1$
            168, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_108 = new TagInfo("c:get", //$NON-NLS-1$
            168, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_11 = new TagInfo("c:get", //$NON-NLS-1$
            169, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_57 = new TagInfo("c:get", //$NON-NLS-1$
            169, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_115 = new TagInfo("c:get", //$NON-NLS-1$
            169, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_3 = new TagInfo("c:get", //$NON-NLS-1$
            170, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_40 = new TagInfo("c:get", //$NON-NLS-1$
            170, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_170_84 = new TagInfo("c:get", //$NON-NLS-1$
            170, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_3 = new TagInfo("c:get", //$NON-NLS-1$
            171, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_11 = new TagInfo("c:get", //$NON-NLS-1$
            173, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_56 = new TagInfo("c:get", //$NON-NLS-1$
            173, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_116 = new TagInfo("c:get", //$NON-NLS-1$
            173, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_3 = new TagInfo("c:get", //$NON-NLS-1$
            174, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_176_10 = new TagInfo("c:get", //$NON-NLS-1$
            176, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_181_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            181, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_182_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            182, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_183_3 = new TagInfo("c:if", //$NON-NLS-1$
            183, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_184_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            184, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_185_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            185, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_186_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            186, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_187_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            187, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_189_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            189, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_190_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            190, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_192_4 = new TagInfo("c:if", //$NON-NLS-1$
            192, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_193_4 = new TagInfo("c:if", //$NON-NLS-1$
            193, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_194_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            194, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_195_4 = new TagInfo("c:choose", //$NON-NLS-1$
            195, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_196_4 = new TagInfo("c:when", //$NON-NLS-1$
            196, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_198_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            198, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_199_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            199, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_200_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            200, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_201_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            201, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_203_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            203, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_11 = new TagInfo("c:get", //$NON-NLS-1$
            205, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_66 = new TagInfo("c:get", //$NON-NLS-1$
            205, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_116 = new TagInfo("c:get", //$NON-NLS-1$
            205, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_205_175 = new TagInfo("c:iterate", //$NON-NLS-1$
            205, 175,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_242 = new TagInfo("c:if", //$NON-NLS-1$
            205, 242,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_485 = new TagInfo("c:get", //$NON-NLS-1$
            205, 485,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_527 = new TagInfo("c:if", //$NON-NLS-1$
            205, 527,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_690 = new TagInfo("c:get", //$NON-NLS-1$
            205, 690,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_732 = new TagInfo("c:if", //$NON-NLS-1$
            205, 732,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_205_883 = new TagInfo("java:import", //$NON-NLS-1$
            205, 883,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_205_925 = new TagInfo("c:get", //$NON-NLS-1$
            205, 925,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_967 = new TagInfo("c:if", //$NON-NLS-1$
            205, 967,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_205_1118 = new TagInfo("java:import", //$NON-NLS-1$
            205, 1118,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_205_1166 = new TagInfo("c:get", //$NON-NLS-1$
            205, 1166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_205_1208 = new TagInfo("c:setVariable", //$NON-NLS-1$
            205, 1208,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_1257 = new TagInfo("c:if", //$NON-NLS-1$
            205, 1257,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_1301 = new TagInfo("c:get", //$NON-NLS-1$
            205, 1301,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_1367 = new TagInfo("c:get", //$NON-NLS-1$
            205, 1367,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_206_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            206, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_5 = new TagInfo("c:get", //$NON-NLS-1$
            207, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_56 = new TagInfo("c:get", //$NON-NLS-1$
            207, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_93 = new TagInfo("c:get", //$NON-NLS-1$
            207, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_135 = new TagInfo("c:get", //$NON-NLS-1$
            207, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_207_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            207, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_207_265 = new TagInfo("c:get", //$NON-NLS-1$
            207, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_207_300 = new TagInfo("c:setVariable", //$NON-NLS-1$
            207, 300,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_207_349 = new TagInfo("c:if", //$NON-NLS-1$
            207, 349,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_208_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            208, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_209_5 = new TagInfo("c:if", //$NON-NLS-1$
            209, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_210_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            210, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_211_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            211, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_212_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            212, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_214_5 = new TagInfo("c:if", //$NON-NLS-1$
            214, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_5 = new TagInfo("c:get", //$NON-NLS-1$
            215, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_71 = new TagInfo("c:get", //$NON-NLS-1$
            215, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_132 = new TagInfo("c:get", //$NON-NLS-1$
            215, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_181 = new TagInfo("c:get", //$NON-NLS-1$
            215, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_215_251 = new TagInfo("c:iterate", //$NON-NLS-1$
            215, 251,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_315 = new TagInfo("c:get", //$NON-NLS-1$
            215, 315,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_361 = new TagInfo("c:get", //$NON-NLS-1$
            215, 361,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_215_410 = new TagInfo("c:setVariable", //$NON-NLS-1$
            215, 410,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_215_463 = new TagInfo("c:if", //$NON-NLS-1$
            215, 463,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_217_5 = new TagInfo("c:if", //$NON-NLS-1$
            217, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_5 = new TagInfo("c:get", //$NON-NLS-1$
            218, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_71 = new TagInfo("c:get", //$NON-NLS-1$
            218, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_132 = new TagInfo("c:get", //$NON-NLS-1$
            218, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_181 = new TagInfo("c:get", //$NON-NLS-1$
            218, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_218_251 = new TagInfo("c:iterate", //$NON-NLS-1$
            218, 251,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_315 = new TagInfo("c:get", //$NON-NLS-1$
            218, 315,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_361 = new TagInfo("c:get", //$NON-NLS-1$
            218, 361,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_218_415 = new TagInfo("c:setVariable", //$NON-NLS-1$
            218, 415,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_218_468 = new TagInfo("c:if", //$NON-NLS-1$
            218, 468,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_17 = new TagInfo("c:get", //$NON-NLS-1$
            222, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_223_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            223, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_224_6 = new TagInfo("c:if", //$NON-NLS-1$
            224, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ref/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_225_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            225, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_14 = new TagInfo("c:get", //$NON-NLS-1$
            226, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_76 = new TagInfo("c:get", //$NON-NLS-1$
            226, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_136 = new TagInfo("c:get", //$NON-NLS-1$
            226, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_226_182 = new TagInfo("c:get", //$NON-NLS-1$
            226, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_228_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            228, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_14 = new TagInfo("c:get", //$NON-NLS-1$
            229, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_76 = new TagInfo("c:get", //$NON-NLS-1$
            229, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_135 = new TagInfo("c:get", //$NON-NLS-1$
            229, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_229_181 = new TagInfo("c:get", //$NON-NLS-1$
            229, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_14 = new TagInfo("c:get", //$NON-NLS-1$
            233, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_233_67 = new TagInfo("c:get", //$NON-NLS-1$
            233, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_234_36 = new TagInfo("c:get", //$NON-NLS-1$
            234, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_236_36 = new TagInfo("c:get", //$NON-NLS-1$
            236, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_6 = new TagInfo("c:get", //$NON-NLS-1$
            237, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_240_27 = new TagInfo("c:get", //$NON-NLS-1$
            240, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_241_5 = new TagInfo("c:get", //$NON-NLS-1$
            241, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_241_43 = new TagInfo("c:get", //$NON-NLS-1$
            241, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_241_116 = new TagInfo("c:get", //$NON-NLS-1$
            241, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_242_35 = new TagInfo("c:get", //$NON-NLS-1$
            242, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_243_5 = new TagInfo("c:get", //$NON-NLS-1$
            243, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_12 = new TagInfo("c:get", //$NON-NLS-1$
            245, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_251_4 = new TagInfo("c:if", //$NON-NLS-1$
            251, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_252_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            252, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_253_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            253, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_254_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            254, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_256_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            256, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_11 = new TagInfo("c:get", //$NON-NLS-1$
            258, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_66 = new TagInfo("c:get", //$NON-NLS-1$
            258, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_116 = new TagInfo("c:get", //$NON-NLS-1$
            258, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_258_169 = new TagInfo("c:iterate", //$NON-NLS-1$
            258, 169,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_236 = new TagInfo("c:if", //$NON-NLS-1$
            258, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_479 = new TagInfo("c:get", //$NON-NLS-1$
            258, 479,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_521 = new TagInfo("c:if", //$NON-NLS-1$
            258, 521,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_684 = new TagInfo("c:get", //$NON-NLS-1$
            258, 684,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_726 = new TagInfo("c:if", //$NON-NLS-1$
            258, 726,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_258_877 = new TagInfo("java:import", //$NON-NLS-1$
            258, 877,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_258_919 = new TagInfo("c:get", //$NON-NLS-1$
            258, 919,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_961 = new TagInfo("c:if", //$NON-NLS-1$
            258, 961,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_258_1112 = new TagInfo("java:import", //$NON-NLS-1$
            258, 1112,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_258_1160 = new TagInfo("c:get", //$NON-NLS-1$
            258, 1160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_258_1202 = new TagInfo("c:setVariable", //$NON-NLS-1$
            258, 1202,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_258_1251 = new TagInfo("c:if", //$NON-NLS-1$
            258, 1251,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_1295 = new TagInfo("c:get", //$NON-NLS-1$
            258, 1295,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_258_1355 = new TagInfo("c:get", //$NON-NLS-1$
            258, 1355,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_259_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            259, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_5 = new TagInfo("c:get", //$NON-NLS-1$
            260, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_56 = new TagInfo("c:get", //$NON-NLS-1$
            260, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_93 = new TagInfo("c:get", //$NON-NLS-1$
            260, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_135 = new TagInfo("c:get", //$NON-NLS-1$
            260, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_260_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            260, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_260_265 = new TagInfo("c:get", //$NON-NLS-1$
            260, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_260_300 = new TagInfo("c:setVariable", //$NON-NLS-1$
            260, 300,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_260_349 = new TagInfo("c:if", //$NON-NLS-1$
            260, 349,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_261_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            261, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_262_5 = new TagInfo("c:if", //$NON-NLS-1$
            262, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_263_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            263, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_264_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            264, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_265_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            265, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_267_5 = new TagInfo("c:if", //$NON-NLS-1$
            267, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_5 = new TagInfo("c:get", //$NON-NLS-1$
            268, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_65 = new TagInfo("c:get", //$NON-NLS-1$
            268, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_120 = new TagInfo("c:get", //$NON-NLS-1$
            268, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_163 = new TagInfo("c:get", //$NON-NLS-1$
            268, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_268_227 = new TagInfo("c:iterate", //$NON-NLS-1$
            268, 227,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_291 = new TagInfo("c:get", //$NON-NLS-1$
            268, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_268_331 = new TagInfo("c:get", //$NON-NLS-1$
            268, 331,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_268_380 = new TagInfo("c:setVariable", //$NON-NLS-1$
            268, 380,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_268_433 = new TagInfo("c:if", //$NON-NLS-1$
            268, 433,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_270_5 = new TagInfo("c:if", //$NON-NLS-1$
            270, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_5 = new TagInfo("c:get", //$NON-NLS-1$
            271, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_65 = new TagInfo("c:get", //$NON-NLS-1$
            271, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_120 = new TagInfo("c:get", //$NON-NLS-1$
            271, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_163 = new TagInfo("c:get", //$NON-NLS-1$
            271, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_271_227 = new TagInfo("c:iterate", //$NON-NLS-1$
            271, 227,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_291 = new TagInfo("c:get", //$NON-NLS-1$
            271, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_271_331 = new TagInfo("c:get", //$NON-NLS-1$
            271, 331,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_271_385 = new TagInfo("c:setVariable", //$NON-NLS-1$
            271, 385,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_271_438 = new TagInfo("c:if", //$NON-NLS-1$
            271, 438,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_275_17 = new TagInfo("c:get", //$NON-NLS-1$
            275, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_276_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            276, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_277_6 = new TagInfo("c:if", //$NON-NLS-1$
            277, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ref/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_278_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            278, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_14 = new TagInfo("c:get", //$NON-NLS-1$
            279, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_70 = new TagInfo("c:get", //$NON-NLS-1$
            279, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_130 = new TagInfo("c:get", //$NON-NLS-1$
            279, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_279_170 = new TagInfo("c:get", //$NON-NLS-1$
            279, 170,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_281_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            281, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_282_14 = new TagInfo("c:get", //$NON-NLS-1$
            282, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_282_70 = new TagInfo("c:get", //$NON-NLS-1$
            282, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_282_129 = new TagInfo("c:get", //$NON-NLS-1$
            282, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_282_169 = new TagInfo("c:get", //$NON-NLS-1$
            282, 169,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_286_14 = new TagInfo("c:get", //$NON-NLS-1$
            286, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_286_61 = new TagInfo("c:get", //$NON-NLS-1$
            286, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_287_36 = new TagInfo("c:get", //$NON-NLS-1$
            287, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_289_36 = new TagInfo("c:get", //$NON-NLS-1$
            289, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_290_6 = new TagInfo("c:get", //$NON-NLS-1$
            290, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_292_28 = new TagInfo("c:get", //$NON-NLS-1$
            292, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_293_14 = new TagInfo("c:get", //$NON-NLS-1$
            293, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_293_54 = new TagInfo("c:get", //$NON-NLS-1$
            293, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_293_105 = new TagInfo("c:get", //$NON-NLS-1$
            293, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_294_6 = new TagInfo("c:get", //$NON-NLS-1$
            294, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_294_44 = new TagInfo("c:get", //$NON-NLS-1$
            294, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_294_111 = new TagInfo("c:get", //$NON-NLS-1$
            294, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_295_28 = new TagInfo("c:get", //$NON-NLS-1$
            295, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_296_36 = new TagInfo("c:get", //$NON-NLS-1$
            296, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_297_6 = new TagInfo("c:get", //$NON-NLS-1$
            297, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_299_13 = new TagInfo("c:get", //$NON-NLS-1$
            299, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_303_4 = new TagInfo("c:if", //$NON-NLS-1$
            303, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_304_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            304, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_305_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            305, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_306_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            306, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_308_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            308, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_11 = new TagInfo("c:get", //$NON-NLS-1$
            310, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_66 = new TagInfo("c:get", //$NON-NLS-1$
            310, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_116 = new TagInfo("c:get", //$NON-NLS-1$
            310, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_310_169 = new TagInfo("c:iterate", //$NON-NLS-1$
            310, 169,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_310_236 = new TagInfo("c:if", //$NON-NLS-1$
            310, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_479 = new TagInfo("c:get", //$NON-NLS-1$
            310, 479,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_310_521 = new TagInfo("c:if", //$NON-NLS-1$
            310, 521,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_684 = new TagInfo("c:get", //$NON-NLS-1$
            310, 684,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_310_726 = new TagInfo("c:if", //$NON-NLS-1$
            310, 726,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_310_877 = new TagInfo("java:import", //$NON-NLS-1$
            310, 877,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_310_919 = new TagInfo("c:get", //$NON-NLS-1$
            310, 919,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_310_961 = new TagInfo("c:if", //$NON-NLS-1$
            310, 961,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_310_1112 = new TagInfo("java:import", //$NON-NLS-1$
            310, 1112,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_310_1160 = new TagInfo("c:get", //$NON-NLS-1$
            310, 1160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_310_1202 = new TagInfo("c:setVariable", //$NON-NLS-1$
            310, 1202,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_310_1251 = new TagInfo("c:if", //$NON-NLS-1$
            310, 1251,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_1295 = new TagInfo("c:get", //$NON-NLS-1$
            310, 1295,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_310_1355 = new TagInfo("c:get", //$NON-NLS-1$
            310, 1355,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_311_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            311, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_312_5 = new TagInfo("c:get", //$NON-NLS-1$
            312, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_312_56 = new TagInfo("c:get", //$NON-NLS-1$
            312, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_312_93 = new TagInfo("c:get", //$NON-NLS-1$
            312, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_312_135 = new TagInfo("c:get", //$NON-NLS-1$
            312, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_312_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            312, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_312_265 = new TagInfo("c:get", //$NON-NLS-1$
            312, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_312_300 = new TagInfo("c:setVariable", //$NON-NLS-1$
            312, 300,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_312_349 = new TagInfo("c:if", //$NON-NLS-1$
            312, 349,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_313_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            313, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_314_5 = new TagInfo("c:if", //$NON-NLS-1$
            314, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_315_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            315, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_316_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            316, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_317_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            317, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_319_5 = new TagInfo("c:if", //$NON-NLS-1$
            319, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_5 = new TagInfo("c:get", //$NON-NLS-1$
            320, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_65 = new TagInfo("c:get", //$NON-NLS-1$
            320, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_120 = new TagInfo("c:get", //$NON-NLS-1$
            320, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_163 = new TagInfo("c:get", //$NON-NLS-1$
            320, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_320_227 = new TagInfo("c:iterate", //$NON-NLS-1$
            320, 227,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_291 = new TagInfo("c:get", //$NON-NLS-1$
            320, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_320_331 = new TagInfo("c:get", //$NON-NLS-1$
            320, 331,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_320_380 = new TagInfo("c:setVariable", //$NON-NLS-1$
            320, 380,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_320_433 = new TagInfo("c:if", //$NON-NLS-1$
            320, 433,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_322_5 = new TagInfo("c:if", //$NON-NLS-1$
            322, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_5 = new TagInfo("c:get", //$NON-NLS-1$
            323, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_65 = new TagInfo("c:get", //$NON-NLS-1$
            323, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_120 = new TagInfo("c:get", //$NON-NLS-1$
            323, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_163 = new TagInfo("c:get", //$NON-NLS-1$
            323, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_323_227 = new TagInfo("c:iterate", //$NON-NLS-1$
            323, 227,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_291 = new TagInfo("c:get", //$NON-NLS-1$
            323, 291,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_323_331 = new TagInfo("c:get", //$NON-NLS-1$
            323, 331,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_323_385 = new TagInfo("c:setVariable", //$NON-NLS-1$
            323, 385,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_323_438 = new TagInfo("c:if", //$NON-NLS-1$
            323, 438,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_327_17 = new TagInfo("c:get", //$NON-NLS-1$
            327, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_328_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            328, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_329_6 = new TagInfo("c:if", //$NON-NLS-1$
            329, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ref/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_330_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            330, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_331_14 = new TagInfo("c:get", //$NON-NLS-1$
            331, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_331_70 = new TagInfo("c:get", //$NON-NLS-1$
            331, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_331_130 = new TagInfo("c:get", //$NON-NLS-1$
            331, 130,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_331_170 = new TagInfo("c:get", //$NON-NLS-1$
            331, 170,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_333_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            333, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ref/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_334_14 = new TagInfo("c:get", //$NON-NLS-1$
            334, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_334_70 = new TagInfo("c:get", //$NON-NLS-1$
            334, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_334_129 = new TagInfo("c:get", //$NON-NLS-1$
            334, 129,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_334_169 = new TagInfo("c:get", //$NON-NLS-1$
            334, 169,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_338_14 = new TagInfo("c:get", //$NON-NLS-1$
            338, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_338_61 = new TagInfo("c:get", //$NON-NLS-1$
            338, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_339_36 = new TagInfo("c:get", //$NON-NLS-1$
            339, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_341_36 = new TagInfo("c:get", //$NON-NLS-1$
            341, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_342_6 = new TagInfo("c:get", //$NON-NLS-1$
            342, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_344_28 = new TagInfo("c:get", //$NON-NLS-1$
            344, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_345_14 = new TagInfo("c:get", //$NON-NLS-1$
            345, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_345_54 = new TagInfo("c:get", //$NON-NLS-1$
            345, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_345_105 = new TagInfo("c:get", //$NON-NLS-1$
            345, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_346_6 = new TagInfo("c:get", //$NON-NLS-1$
            346, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_346_44 = new TagInfo("c:get", //$NON-NLS-1$
            346, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_346_111 = new TagInfo("c:get", //$NON-NLS-1$
            346, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_347_28 = new TagInfo("c:get", //$NON-NLS-1$
            347, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_348_36 = new TagInfo("c:get", //$NON-NLS-1$
            348, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_349_6 = new TagInfo("c:get", //$NON-NLS-1$
            349, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_351_13 = new TagInfo("c:get", //$NON-NLS-1$
            351, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_1_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_2.setRuntimeParent(null);
        _jettag_c_setVariable_1_2.setTagInfo(_td_c_setVariable_1_2);
        _jettag_c_setVariable_1_2.doStart(context, out);
        _jettag_c_setVariable_1_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_2.setRuntimeParent(null);
        _jettag_c_setVariable_2_2.setTagInfo(_td_c_setVariable_2_2);
        _jettag_c_setVariable_2_2.doStart(context, out);
        _jettag_c_setVariable_2_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_2.setRuntimeParent(null);
        _jettag_c_iterate_3_2.setTagInfo(_td_c_iterate_3_2);
        _jettag_c_iterate_3_2.doStart(context, out);
        while (_jettag_c_iterate_3_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_4_3.setRuntimeParent(_jettag_c_iterate_3_2);
            _jettag_c_setVariable_4_3.setTagInfo(_td_c_setVariable_4_3);
            _jettag_c_setVariable_4_3.doStart(context, out);
            _jettag_c_setVariable_4_3.doEnd();
            _jettag_c_iterate_3_2.handleBodyContent(out);
        }
        _jettag_c_iterate_3_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_6_2.setRuntimeParent(null);
        _jettag_c_iterate_6_2.setTagInfo(_td_c_iterate_6_2);
        _jettag_c_iterate_6_2.doStart(context, out);
        while (_jettag_c_iterate_6_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_7_3.setRuntimeParent(_jettag_c_iterate_6_2);
            _jettag_c_setVariable_7_3.setTagInfo(_td_c_setVariable_7_3);
            _jettag_c_setVariable_7_3.doStart(context, out);
            _jettag_c_setVariable_7_3.doEnd();
            _jettag_c_iterate_6_2.handleBodyContent(out);
        }
        _jettag_c_iterate_6_2.doEnd();
        RuntimeTagElement _jettag_c_choose_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_9_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_9_2.setRuntimeParent(null);
        _jettag_c_choose_9_2.setTagInfo(_td_c_choose_9_2);
        _jettag_c_choose_9_2.doStart(context, out);
        JET2Writer _jettag_c_choose_9_2_saved_out = out;
        while (_jettag_c_choose_9_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_10_2.setRuntimeParent(_jettag_c_choose_9_2);
            _jettag_c_when_10_2.setTagInfo(_td_c_when_10_2);
            _jettag_c_when_10_2.doStart(context, out);
            JET2Writer _jettag_c_when_10_2_saved_out = out;
            while (_jettag_c_when_10_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_11_2.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_setVariable_11_2.setTagInfo(_td_c_setVariable_11_2);
                _jettag_c_setVariable_11_2.doStart(context, out);
                _jettag_c_setVariable_11_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_12_2.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_iterate_12_2.setTagInfo(_td_c_iterate_12_2);
                _jettag_c_iterate_12_2.doStart(context, out);
                while (_jettag_c_iterate_12_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_13_2.setRuntimeParent(_jettag_c_iterate_12_2);
                    _jettag_c_setVariable_13_2.setTagInfo(_td_c_setVariable_13_2);
                    _jettag_c_setVariable_13_2.doStart(context, out);
                    _jettag_c_setVariable_13_2.doEnd();
                    _jettag_c_iterate_12_2.handleBodyContent(out);
                }
                _jettag_c_iterate_12_2.doEnd();
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic void save");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_18.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_16_18.setTagInfo(_td_c_get_16_18);
                _jettag_c_get_16_18.doStart(context, out);
                _jettag_c_get_16_18.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_69.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_16_69.setTagInfo(_td_c_get_16_69);
                _jettag_c_get_16_69.doStart(context, out);
                _jettag_c_get_16_69.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_120.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_16_120.setTagInfo(_td_c_get_16_120);
                _jettag_c_get_16_120.doStart(context, out);
                _jettag_c_get_16_120.doEnd();
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_3.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_if_17_3.setTagInfo(_td_c_if_17_3);
                _jettag_c_if_17_3.doStart(context, out);
                while (_jettag_c_if_17_3.okToProcessBody()) {
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_3.setRuntimeParent(_jettag_c_if_17_3);
                    _jettag_c_get_18_3.setTagInfo(_td_c_get_18_3);
                    _jettag_c_get_18_3.doStart(context, out);
                    _jettag_c_get_18_3.doEnd();
                    out.write(" existing");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_62.setRuntimeParent(_jettag_c_if_17_3);
                    _jettag_c_get_18_62.setTagInfo(_td_c_get_18_62);
                    _jettag_c_get_18_62.doStart(context, out);
                    _jettag_c_get_18_62.doEnd();
                    out.write(" = ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_115.setRuntimeParent(_jettag_c_if_17_3);
                    _jettag_c_get_18_115.setTagInfo(_td_c_get_18_115);
                    _jettag_c_get_18_115.doStart(context, out);
                    _jettag_c_get_18_115.doEnd();
                    out.write("DAO.find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_157); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_157.setRuntimeParent(_jettag_c_if_17_3);
                    _jettag_c_get_18_157.setTagInfo(_td_c_get_18_157);
                    _jettag_c_get_18_157.doStart(context, out);
                    _jettag_c_get_18_157.doEnd();
                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_18_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_18_220.setRuntimeParent(_jettag_c_if_17_3);
                    _jettag_c_iterate_18_220.setTagInfo(_td_c_iterate_18_220);
                    _jettag_c_iterate_18_220.doStart(context, out);
                    while (_jettag_c_iterate_18_220.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_18_287 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_287); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_18_287.setRuntimeParent(_jettag_c_iterate_18_220);
                        _jettag_c_get_18_287.setTagInfo(_td_c_get_18_287);
                        _jettag_c_get_18_287.doStart(context, out);
                        _jettag_c_get_18_287.doEnd();
                        out.write(".get");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_18_325 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_325); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_18_325.setRuntimeParent(_jettag_c_iterate_18_220);
                        _jettag_c_get_18_325.setTagInfo(_td_c_get_18_325);
                        _jettag_c_get_18_325.doStart(context, out);
                        _jettag_c_get_18_325.doEnd();
                        out.write("()");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_setVariable_18_378 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_18_378); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_18_378.setRuntimeParent(_jettag_c_iterate_18_220);
                        _jettag_c_setVariable_18_378.setTagInfo(_td_c_setVariable_18_378);
                        _jettag_c_setVariable_18_378.doStart(context, out);
                        _jettag_c_setVariable_18_378.doEnd();
                        RuntimeTagElement _jettag_c_if_18_427 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_427); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_18_427.setRuntimeParent(_jettag_c_iterate_18_220);
                        _jettag_c_if_18_427.setTagInfo(_td_c_if_18_427);
                        _jettag_c_if_18_427.doStart(context, out);
                        while (_jettag_c_if_18_427.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_18_427.handleBodyContent(out);
                        }
                        _jettag_c_if_18_427.doEnd();
                        _jettag_c_iterate_18_220.handleBodyContent(out);
                    }
                    _jettag_c_iterate_18_220.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_17_3.handleBodyContent(out);
                }
                _jettag_c_if_17_3.doEnd();
                RuntimeTagElement _jettag_c_if_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_3.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_if_20_3.setTagInfo(_td_c_if_20_3);
                _jettag_c_if_20_3.doStart(context, out);
                while (_jettag_c_if_20_3.okToProcessBody()) {
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_3.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_get_21_3.setTagInfo(_td_c_get_21_3);
                    _jettag_c_get_21_3.doStart(context, out);
                    _jettag_c_get_21_3.doEnd();
                    out.write(" existing");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_21_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_62.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_get_21_62.setTagInfo(_td_c_get_21_62);
                    _jettag_c_get_21_62.doStart(context, out);
                    _jettag_c_get_21_62.doEnd();
                    out.write(" = ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_21_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_115.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_get_21_115.setTagInfo(_td_c_get_21_115);
                    _jettag_c_get_21_115.doStart(context, out);
                    _jettag_c_get_21_115.doEnd();
                    out.write("DAO.find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_21_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_157); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_157.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_get_21_157.setTagInfo(_td_c_get_21_157);
                    _jettag_c_get_21_157.doStart(context, out);
                    _jettag_c_get_21_157.doEnd();
                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_21_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_21_220.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_iterate_21_220.setTagInfo(_td_c_iterate_21_220);
                    _jettag_c_iterate_21_220.doStart(context, out);
                    while (_jettag_c_iterate_21_220.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_21_287 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_287); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_21_287.setRuntimeParent(_jettag_c_iterate_21_220);
                        _jettag_c_get_21_287.setTagInfo(_td_c_get_21_287);
                        _jettag_c_get_21_287.doStart(context, out);
                        _jettag_c_get_21_287.doEnd();
                        out.write(".get");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_21_325 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_325); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_21_325.setRuntimeParent(_jettag_c_iterate_21_220);
                        _jettag_c_get_21_325.setTagInfo(_td_c_get_21_325);
                        _jettag_c_get_21_325.doStart(context, out);
                        _jettag_c_get_21_325.doEnd();
                        out.write("Field()");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_setVariable_21_383 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_383); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_21_383.setRuntimeParent(_jettag_c_iterate_21_220);
                        _jettag_c_setVariable_21_383.setTagInfo(_td_c_setVariable_21_383);
                        _jettag_c_setVariable_21_383.doStart(context, out);
                        _jettag_c_setVariable_21_383.doEnd();
                        RuntimeTagElement _jettag_c_if_21_432 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_432); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_21_432.setRuntimeParent(_jettag_c_iterate_21_220);
                        _jettag_c_if_21_432.setTagInfo(_td_c_if_21_432);
                        _jettag_c_if_21_432.doStart(context, out);
                        while (_jettag_c_if_21_432.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_21_432.handleBodyContent(out);
                        }
                        _jettag_c_if_21_432.doEnd();
                        _jettag_c_iterate_21_220.handleBodyContent(out);
                    }
                    _jettag_c_iterate_21_220.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_20_3.handleBodyContent(out);
                }
                _jettag_c_if_20_3.doEnd();
                out.write("\t\tif (existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_15.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_23_15.setTagInfo(_td_c_get_23_15);
                _jettag_c_get_23_15.doStart(context, out);
                _jettag_c_get_23_15.doEnd();
                out.write(" != null) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tif (existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_16.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_24_16.setTagInfo(_td_c_get_24_16);
                _jettag_c_get_24_16.doStart(context, out);
                _jettag_c_get_24_16.doEnd();
                out.write(" != ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_70.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_24_70.setTagInfo(_td_c_get_24_70);
                _jettag_c_get_24_70.doStart(context, out);
                _jettag_c_get_24_70.doEnd();
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_25_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_25_5.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_iterate_25_5.setTagInfo(_td_c_iterate_25_5);
                _jettag_c_iterate_25_5.doStart(context, out);
                while (_jettag_c_iterate_25_5.okToProcessBody()) {
                    out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_13.setRuntimeParent(_jettag_c_iterate_25_5);
                    _jettag_c_get_26_13.setTagInfo(_td_c_get_26_13);
                    _jettag_c_get_26_13.doStart(context, out);
                    _jettag_c_get_26_13.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_67.setRuntimeParent(_jettag_c_iterate_25_5);
                    _jettag_c_get_26_67.setTagInfo(_td_c_get_26_67);
                    _jettag_c_get_26_67.doStart(context, out);
                    _jettag_c_get_26_67.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_111); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_111.setRuntimeParent(_jettag_c_iterate_25_5);
                    _jettag_c_get_26_111.setTagInfo(_td_c_get_26_111);
                    _jettag_c_get_26_111.doStart(context, out);
                    _jettag_c_get_26_111.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_149); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_149.setRuntimeParent(_jettag_c_iterate_25_5);
                    _jettag_c_get_26_149.setTagInfo(_td_c_get_26_149);
                    _jettag_c_get_26_149.doStart(context, out);
                    _jettag_c_get_26_149.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_25_5.handleBodyContent(out);
                }
                _jettag_c_iterate_25_5.doEnd();
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_30_4.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_iterate_30_4.setTagInfo(_td_c_iterate_30_4);
                _jettag_c_iterate_30_4.doStart(context, out);
                while (_jettag_c_iterate_30_4.okToProcessBody()) {
                    out.write("\t\t\tif(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_7.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_31_7.setTagInfo(_td_c_get_31_7);
                    _jettag_c_get_31_7.doStart(context, out);
                    _jettag_c_get_31_7.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_45.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_31_45.setTagInfo(_td_c_get_31_45);
                    _jettag_c_get_31_45.doStart(context, out);
                    _jettag_c_get_31_45.doEnd();
                    out.write("()!=null){");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_26); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_26.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_32_26.setTagInfo(_td_c_get_32_26);
                    _jettag_c_get_32_26.doStart(context, out);
                    _jettag_c_get_32_26.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_64.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_32_64.setTagInfo(_td_c_get_32_64);
                    _jettag_c_get_32_64.doStart(context, out);
                    _jettag_c_get_32_64.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_33_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_12.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_33_12.setTagInfo(_td_c_get_33_12);
                    _jettag_c_get_33_12.doStart(context, out);
                    _jettag_c_get_33_12.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_33_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_66.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_33_66.setTagInfo(_td_c_get_33_66);
                    _jettag_c_get_33_66.doStart(context, out);
                    _jettag_c_get_33_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_33_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_125); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_125.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_33_125.setTagInfo(_td_c_get_33_125);
                    _jettag_c_get_33_125.doStart(context, out);
                    _jettag_c_get_33_125.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_33_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_163); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_33_163.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_33_163.setTagInfo(_td_c_get_33_163);
                    _jettag_c_get_33_163.doStart(context, out);
                    _jettag_c_get_33_163.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\telse");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_36_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_13.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_36_13.setTagInfo(_td_c_get_36_13);
                    _jettag_c_get_36_13.doStart(context, out);
                    _jettag_c_get_36_13.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_36_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_36_67.setRuntimeParent(_jettag_c_iterate_30_4);
                    _jettag_c_get_36_67.setTagInfo(_td_c_get_36_67);
                    _jettag_c_get_36_67.doStart(context, out);
                    _jettag_c_get_36_67.doEnd();
                    out.write("(null);");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_30_4.handleBodyContent(out);
                }
                _jettag_c_iterate_30_4.doEnd();
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_4.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_39_4.setTagInfo(_td_c_get_39_4);
                _jettag_c_get_39_4.doStart(context, out);
                _jettag_c_get_39_4.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_41.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_39_41.setTagInfo(_td_c_get_39_41);
                _jettag_c_get_39_41.doStart(context, out);
                _jettag_c_get_39_41.doEnd();
                out.write("DAO.store(existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_93); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_93.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_39_93.setTagInfo(_td_c_get_39_93);
                _jettag_c_get_39_93.doStart(context, out);
                _jettag_c_get_39_93.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t} else {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_41_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_26); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_26.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_41_26.setTagInfo(_td_c_get_41_26);
                _jettag_c_get_41_26.doStart(context, out);
                _jettag_c_get_41_26.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_4.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_42_4.setTagInfo(_td_c_get_42_4);
                _jettag_c_get_42_4.doStart(context, out);
                _jettag_c_get_42_4.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_42_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_41.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_42_41.setTagInfo(_td_c_get_42_41);
                _jettag_c_get_42_41.doStart(context, out);
                _jettag_c_get_42_41.doEnd();
                out.write("DAO.store(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_42_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_85.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_42_85.setTagInfo(_td_c_get_42_85);
                _jettag_c_get_42_85.doStart(context, out);
                _jettag_c_get_42_85.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_3.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_44_3.setTagInfo(_td_c_get_44_3);
                _jettag_c_get_44_3.doStart(context, out);
                _jettag_c_get_44_3.doEnd();
                out.write("DAO.flush();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_10_2.handleBodyContent(out);
            }
            out = _jettag_c_when_10_2_saved_out;
            _jettag_c_when_10_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_47_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_47_2.setRuntimeParent(_jettag_c_choose_9_2);
            _jettag_c_otherwise_47_2.setTagInfo(_td_c_otherwise_47_2);
            _jettag_c_otherwise_47_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_47_2_saved_out = out;
            while (_jettag_c_otherwise_47_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_48_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_48_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_48_2.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_setVariable_48_2.setTagInfo(_td_c_setVariable_48_2);
                _jettag_c_setVariable_48_2.doStart(context, out);
                _jettag_c_setVariable_48_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_49_2.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_49_2.setTagInfo(_td_c_iterate_49_2);
                _jettag_c_iterate_49_2.doStart(context, out);
                while (_jettag_c_iterate_49_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_50_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_50_2.setRuntimeParent(_jettag_c_iterate_49_2);
                    _jettag_c_setVariable_50_2.setTagInfo(_td_c_setVariable_50_2);
                    _jettag_c_setVariable_50_2.doStart(context, out);
                    _jettag_c_setVariable_50_2.doEnd();
                    _jettag_c_iterate_49_2.handleBodyContent(out);
                }
                _jettag_c_iterate_49_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_52_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_52_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_52_2.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_setVariable_52_2.setTagInfo(_td_c_setVariable_52_2);
                _jettag_c_setVariable_52_2.doStart(context, out);
                _jettag_c_setVariable_52_2.doEnd();
                out.write("\t@SuppressWarnings({ \"unchecked\", \"unused\" })");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic void save");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_18.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_55_18.setTagInfo(_td_c_get_55_18);
                _jettag_c_get_55_18.doStart(context, out);
                _jettag_c_get_55_18.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_69.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_55_69.setTagInfo(_td_c_get_55_69);
                _jettag_c_get_55_69.doStart(context, out);
                _jettag_c_get_55_69.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_55_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_55_120.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_55_120.setTagInfo(_td_c_get_55_120);
                _jettag_c_get_55_120.doStart(context, out);
                _jettag_c_get_55_120.doEnd();
                out.write("){");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_56_3.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_if_56_3.setTagInfo(_td_c_if_56_3);
                _jettag_c_if_56_3.doStart(context, out);
                while (_jettag_c_if_56_3.okToProcessBody()) {
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_3.setRuntimeParent(_jettag_c_if_56_3);
                    _jettag_c_get_57_3.setTagInfo(_td_c_get_57_3);
                    _jettag_c_get_57_3.doStart(context, out);
                    _jettag_c_get_57_3.doEnd();
                    out.write(" existing");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_57_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_62.setRuntimeParent(_jettag_c_if_56_3);
                    _jettag_c_get_57_62.setTagInfo(_td_c_get_57_62);
                    _jettag_c_get_57_62.doStart(context, out);
                    _jettag_c_get_57_62.doEnd();
                    out.write(" = ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_57_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_115.setRuntimeParent(_jettag_c_if_56_3);
                    _jettag_c_get_57_115.setTagInfo(_td_c_get_57_115);
                    _jettag_c_get_57_115.doStart(context, out);
                    _jettag_c_get_57_115.doEnd();
                    out.write("DAO.find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_57_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_157); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_57_157.setRuntimeParent(_jettag_c_if_56_3);
                    _jettag_c_get_57_157.setTagInfo(_td_c_get_57_157);
                    _jettag_c_get_57_157.doStart(context, out);
                    _jettag_c_get_57_157.doEnd();
                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_57_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_57_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_57_220.setRuntimeParent(_jettag_c_if_56_3);
                    _jettag_c_iterate_57_220.setTagInfo(_td_c_iterate_57_220);
                    _jettag_c_iterate_57_220.doStart(context, out);
                    while (_jettag_c_iterate_57_220.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_57_287 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_287); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_57_287.setRuntimeParent(_jettag_c_iterate_57_220);
                        _jettag_c_get_57_287.setTagInfo(_td_c_get_57_287);
                        _jettag_c_get_57_287.doStart(context, out);
                        _jettag_c_get_57_287.doEnd();
                        out.write(".get");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_57_325 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_325); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_57_325.setRuntimeParent(_jettag_c_iterate_57_220);
                        _jettag_c_get_57_325.setTagInfo(_td_c_get_57_325);
                        _jettag_c_get_57_325.doStart(context, out);
                        _jettag_c_get_57_325.doEnd();
                        out.write("()");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_setVariable_57_378 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_378); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_57_378.setRuntimeParent(_jettag_c_iterate_57_220);
                        _jettag_c_setVariable_57_378.setTagInfo(_td_c_setVariable_57_378);
                        _jettag_c_setVariable_57_378.doStart(context, out);
                        _jettag_c_setVariable_57_378.doEnd();
                        RuntimeTagElement _jettag_c_if_57_427 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_57_427); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_57_427.setRuntimeParent(_jettag_c_iterate_57_220);
                        _jettag_c_if_57_427.setTagInfo(_td_c_if_57_427);
                        _jettag_c_if_57_427.doStart(context, out);
                        while (_jettag_c_if_57_427.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_57_427.handleBodyContent(out);
                        }
                        _jettag_c_if_57_427.doEnd();
                        _jettag_c_iterate_57_220.handleBodyContent(out);
                    }
                    _jettag_c_iterate_57_220.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_56_3.handleBodyContent(out);
                }
                _jettag_c_if_56_3.doEnd();
                RuntimeTagElement _jettag_c_if_59_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_59_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_59_3.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_if_59_3.setTagInfo(_td_c_if_59_3);
                _jettag_c_if_59_3.doStart(context, out);
                while (_jettag_c_if_59_3.okToProcessBody()) {
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_3.setRuntimeParent(_jettag_c_if_59_3);
                    _jettag_c_get_60_3.setTagInfo(_td_c_get_60_3);
                    _jettag_c_get_60_3.doStart(context, out);
                    _jettag_c_get_60_3.doEnd();
                    out.write(" existing");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_62.setRuntimeParent(_jettag_c_if_59_3);
                    _jettag_c_get_60_62.setTagInfo(_td_c_get_60_62);
                    _jettag_c_get_60_62.doStart(context, out);
                    _jettag_c_get_60_62.doEnd();
                    out.write(" = ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_115.setRuntimeParent(_jettag_c_if_59_3);
                    _jettag_c_get_60_115.setTagInfo(_td_c_get_60_115);
                    _jettag_c_get_60_115.doStart(context, out);
                    _jettag_c_get_60_115.doEnd();
                    out.write("DAO.find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_157); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_157.setRuntimeParent(_jettag_c_if_59_3);
                    _jettag_c_get_60_157.setTagInfo(_td_c_get_60_157);
                    _jettag_c_get_60_157.doStart(context, out);
                    _jettag_c_get_60_157.doEnd();
                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_60_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_60_220.setRuntimeParent(_jettag_c_if_59_3);
                    _jettag_c_iterate_60_220.setTagInfo(_td_c_iterate_60_220);
                    _jettag_c_iterate_60_220.doStart(context, out);
                    while (_jettag_c_iterate_60_220.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_60_287 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_287); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_60_287.setRuntimeParent(_jettag_c_iterate_60_220);
                        _jettag_c_get_60_287.setTagInfo(_td_c_get_60_287);
                        _jettag_c_get_60_287.doStart(context, out);
                        _jettag_c_get_60_287.doEnd();
                        out.write(".get");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_60_325 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_325); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_60_325.setRuntimeParent(_jettag_c_iterate_60_220);
                        _jettag_c_get_60_325.setTagInfo(_td_c_get_60_325);
                        _jettag_c_get_60_325.doStart(context, out);
                        _jettag_c_get_60_325.doEnd();
                        out.write("Field()");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_setVariable_60_383 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_383); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_60_383.setRuntimeParent(_jettag_c_iterate_60_220);
                        _jettag_c_setVariable_60_383.setTagInfo(_td_c_setVariable_60_383);
                        _jettag_c_setVariable_60_383.doStart(context, out);
                        _jettag_c_setVariable_60_383.doEnd();
                        RuntimeTagElement _jettag_c_if_60_432 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_432); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_60_432.setRuntimeParent(_jettag_c_iterate_60_220);
                        _jettag_c_if_60_432.setTagInfo(_td_c_if_60_432);
                        _jettag_c_if_60_432.doStart(context, out);
                        while (_jettag_c_if_60_432.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_60_432.handleBodyContent(out);
                        }
                        _jettag_c_if_60_432.doEnd();
                        _jettag_c_iterate_60_220.handleBodyContent(out);
                    }
                    _jettag_c_iterate_60_220.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_59_3.handleBodyContent(out);
                }
                _jettag_c_if_59_3.doEnd();
                out.write("\t\tif (existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_15.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_62_15.setTagInfo(_td_c_get_62_15);
                _jettag_c_get_62_15.doStart(context, out);
                _jettag_c_get_62_15.doEnd();
                out.write(" != null) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tif(existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_15.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_63_15.setTagInfo(_td_c_get_63_15);
                _jettag_c_get_63_15.doStart(context, out);
                _jettag_c_get_63_15.doEnd();
                out.write("!=");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_63_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_63_67.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_63_67.setTagInfo(_td_c_get_63_67);
                _jettag_c_get_63_67.doStart(context, out);
                _jettag_c_get_63_67.doEnd();
                out.write("){");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_64_4.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_64_4.setTagInfo(_td_c_iterate_64_4);
                _jettag_c_iterate_64_4.doStart(context, out);
                while (_jettag_c_iterate_64_4.okToProcessBody()) {
                    out.write("\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_65_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_12.setRuntimeParent(_jettag_c_iterate_64_4);
                    _jettag_c_get_65_12.setTagInfo(_td_c_get_65_12);
                    _jettag_c_get_65_12.doStart(context, out);
                    _jettag_c_get_65_12.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_65_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_66.setRuntimeParent(_jettag_c_iterate_64_4);
                    _jettag_c_get_65_66.setTagInfo(_td_c_get_65_66);
                    _jettag_c_get_65_66.doStart(context, out);
                    _jettag_c_get_65_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_65_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_117); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_117.setRuntimeParent(_jettag_c_iterate_64_4);
                    _jettag_c_get_65_117.setTagInfo(_td_c_get_65_117);
                    _jettag_c_get_65_117.doStart(context, out);
                    _jettag_c_get_65_117.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_65_155 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_155); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_65_155.setRuntimeParent(_jettag_c_iterate_64_4);
                    _jettag_c_get_65_155.setTagInfo(_td_c_get_65_155);
                    _jettag_c_get_65_155.doStart(context, out);
                    _jettag_c_get_65_155.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_64_4.handleBodyContent(out);
                }
                _jettag_c_iterate_64_4.doEnd();
                out.write("\t\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_69_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_69_4.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_69_4.setTagInfo(_td_c_iterate_69_4);
                _jettag_c_iterate_69_4.doStart(context, out);
                while (_jettag_c_iterate_69_4.okToProcessBody()) {
                    out.write("\t\t\tif(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_70_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_7.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_70_7.setTagInfo(_td_c_get_70_7);
                    _jettag_c_get_70_7.doStart(context, out);
                    _jettag_c_get_70_7.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_70_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_70_45.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_70_45.setTagInfo(_td_c_get_70_45);
                    _jettag_c_get_70_45.doStart(context, out);
                    _jettag_c_get_70_45.doEnd();
                    out.write("()!=null){");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_71_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_26); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_26.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_71_26.setTagInfo(_td_c_get_71_26);
                    _jettag_c_get_71_26.doStart(context, out);
                    _jettag_c_get_71_26.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_71_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_71_64.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_71_64.setTagInfo(_td_c_get_71_64);
                    _jettag_c_get_71_64.doStart(context, out);
                    _jettag_c_get_71_64.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_12.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_72_12.setTagInfo(_td_c_get_72_12);
                    _jettag_c_get_72_12.doStart(context, out);
                    _jettag_c_get_72_12.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_66.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_72_66.setTagInfo(_td_c_get_72_66);
                    _jettag_c_get_72_66.doStart(context, out);
                    _jettag_c_get_72_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_125); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_125.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_72_125.setTagInfo(_td_c_get_72_125);
                    _jettag_c_get_72_125.doStart(context, out);
                    _jettag_c_get_72_125.doEnd();
                    out.write(".get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_163); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_163.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_72_163.setTagInfo(_td_c_get_72_163);
                    _jettag_c_get_72_163.doStart(context, out);
                    _jettag_c_get_72_163.doEnd();
                    out.write("());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\telse");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_75_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_75_13.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_75_13.setTagInfo(_td_c_get_75_13);
                    _jettag_c_get_75_13.doStart(context, out);
                    _jettag_c_get_75_13.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_75_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_67); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_75_67.setRuntimeParent(_jettag_c_iterate_69_4);
                    _jettag_c_get_75_67.setTagInfo(_td_c_get_75_67);
                    _jettag_c_get_75_67.doStart(context, out);
                    _jettag_c_get_75_67.doEnd();
                    out.write("(null);");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_69_4.handleBodyContent(out);
                }
                _jettag_c_iterate_69_4.doEnd();
                out.write("\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_78_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_78_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_78_4.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_78_4.setTagInfo(_td_c_iterate_78_4);
                _jettag_c_iterate_78_4.doStart(context, out);
                while (_jettag_c_iterate_78_4.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_79_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_79_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_79_4.setRuntimeParent(_jettag_c_iterate_78_4);
                    _jettag_c_iterate_79_4.setTagInfo(_td_c_iterate_79_4);
                    _jettag_c_iterate_79_4.doStart(context, out);
                    while (_jettag_c_iterate_79_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_80_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_80_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_80_4.setRuntimeParent(_jettag_c_iterate_79_4);
                        _jettag_c_if_80_4.setTagInfo(_td_c_if_80_4);
                        _jettag_c_if_80_4.doStart(context, out);
                        while (_jettag_c_if_80_4.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_81_4.setRuntimeParent(_jettag_c_if_80_4);
                            _jettag_c_setVariable_81_4.setTagInfo(_td_c_setVariable_81_4);
                            _jettag_c_setVariable_81_4.doStart(context, out);
                            _jettag_c_setVariable_81_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_82_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_82_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_82_4.setRuntimeParent(_jettag_c_if_80_4);
                            _jettag_c_setVariable_82_4.setTagInfo(_td_c_setVariable_82_4);
                            _jettag_c_setVariable_82_4.doStart(context, out);
                            _jettag_c_setVariable_82_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_83_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_83_4.setRuntimeParent(_jettag_c_if_80_4);
                            _jettag_c_iterate_83_4.setTagInfo(_td_c_iterate_83_4);
                            _jettag_c_iterate_83_4.doStart(context, out);
                            while (_jettag_c_iterate_83_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_84_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_84_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_84_5.setRuntimeParent(_jettag_c_iterate_83_4);
                                _jettag_c_setVariable_84_5.setTagInfo(_td_c_setVariable_84_5);
                                _jettag_c_setVariable_84_5.doStart(context, out);
                                _jettag_c_setVariable_84_5.doEnd();
                                _jettag_c_iterate_83_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_83_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_86_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_86_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_86_4.setRuntimeParent(_jettag_c_if_80_4);
                            _jettag_c_iterate_86_4.setTagInfo(_td_c_iterate_86_4);
                            _jettag_c_iterate_86_4.doStart(context, out);
                            while (_jettag_c_iterate_86_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_87_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_87_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_87_5.setRuntimeParent(_jettag_c_iterate_86_4);
                                _jettag_c_setVariable_87_5.setTagInfo(_td_c_setVariable_87_5);
                                _jettag_c_setVariable_87_5.doStart(context, out);
                                _jettag_c_setVariable_87_5.doEnd();
                                _jettag_c_iterate_86_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_86_4.doEnd();
                            RuntimeTagElement _jettag_c_choose_89_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_89_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_89_4.setRuntimeParent(_jettag_c_if_80_4);
                            _jettag_c_choose_89_4.setTagInfo(_td_c_choose_89_4);
                            _jettag_c_choose_89_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_89_4_saved_out = out;
                            while (_jettag_c_choose_89_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_90_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_90_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_90_4.setRuntimeParent(_jettag_c_choose_89_4);
                                _jettag_c_when_90_4.setTagInfo(_td_c_when_90_4);
                                _jettag_c_when_90_4.doStart(context, out);
                                JET2Writer _jettag_c_when_90_4_saved_out = out;
                                while (_jettag_c_when_90_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_91_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_91_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_91_4.setRuntimeParent(_jettag_c_when_90_4);
                                    _jettag_c_iterate_91_4.setTagInfo(_td_c_iterate_91_4);
                                    _jettag_c_iterate_91_4.doStart(context, out);
                                    while (_jettag_c_iterate_91_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_92_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_92_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_92_4.setRuntimeParent(_jettag_c_iterate_91_4);
                                        _jettag_c_choose_92_4.setTagInfo(_td_c_choose_92_4);
                                        _jettag_c_choose_92_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_92_4_saved_out = out;
                                        while (_jettag_c_choose_92_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_93_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_93_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_93_4.setRuntimeParent(_jettag_c_choose_92_4);
                                            _jettag_c_when_93_4.setTagInfo(_td_c_when_93_4);
                                            _jettag_c_when_93_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_93_4_saved_out = out;
                                            while (_jettag_c_when_93_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_93_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_93_4_saved_out;
                                            _jettag_c_when_93_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_95_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_95_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_95_4.setRuntimeParent(_jettag_c_choose_92_4);
                                            _jettag_c_otherwise_95_4.setTagInfo(_td_c_otherwise_95_4);
                                            _jettag_c_otherwise_95_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_95_4_saved_out = out;
                                            while (_jettag_c_otherwise_95_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t\tif(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_96_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_7); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_96_7.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_96_7.setTagInfo(_td_c_get_96_7);
                                                _jettag_c_get_96_7.doStart(context, out);
                                                _jettag_c_get_96_7.doEnd();
                                                out.write(".get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_96_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_45); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_96_45.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_96_45.setTagInfo(_td_c_get_96_45);
                                                _jettag_c_get_96_45.doStart(context, out);
                                                _jettag_c_get_96_45.doEnd();
                                                out.write("s()!=null){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\tfor(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_97_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_9); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_97_9.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_97_9.setTagInfo(_td_c_get_97_9);
                                                _jettag_c_get_97_9.doStart(context, out);
                                                _jettag_c_get_97_9.doEnd();
                                                out.write(" relative");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_97_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_75); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_97_75.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_97_75.setTagInfo(_td_c_get_97_75);
                                                _jettag_c_get_97_75.doStart(context, out);
                                                _jettag_c_get_97_75.doEnd();
                                                out.write(":");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_97_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_133); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_97_133.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_97_133.setTagInfo(_td_c_get_97_133);
                                                _jettag_c_get_97_133.doStart(context, out);
                                                _jettag_c_get_97_133.doEnd();
                                                out.write(".get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_97_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_97_171); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_97_171.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_97_171.setTagInfo(_td_c_get_97_171);
                                                _jettag_c_get_97_171.doStart(context, out);
                                                _jettag_c_get_97_171.doEnd();
                                                out.write("s())");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\tentityManager.persist(relative");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_98_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_35); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_98_35.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_98_35.setTagInfo(_td_c_get_98_35);
                                                _jettag_c_get_98_35.doStart(context, out);
                                                _jettag_c_get_98_35.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_99_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_13); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_99_13.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_99_13.setTagInfo(_td_c_get_99_13);
                                                _jettag_c_get_99_13.doStart(context, out);
                                                _jettag_c_get_99_13.doEnd();
                                                out.write(".set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_99_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_67); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_99_67.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_99_67.setTagInfo(_td_c_get_99_67);
                                                _jettag_c_get_99_67.doStart(context, out);
                                                _jettag_c_get_99_67.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_99_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_126); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_99_126.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_99_126.setTagInfo(_td_c_get_99_126);
                                                _jettag_c_get_99_126.doStart(context, out);
                                                _jettag_c_get_99_126.doEnd();
                                                out.write(".get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_99_164 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_164); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_99_164.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_99_164.setTagInfo(_td_c_get_99_164);
                                                _jettag_c_get_99_164.doStart(context, out);
                                                _jettag_c_get_99_164.doEnd();
                                                out.write("s());");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\telse");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_102_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_13); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_102_13.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_102_13.setTagInfo(_td_c_get_102_13);
                                                _jettag_c_get_102_13.doStart(context, out);
                                                _jettag_c_get_102_13.doEnd();
                                                out.write(".set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_102_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_67); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_102_67.setRuntimeParent(_jettag_c_otherwise_95_4);
                                                _jettag_c_get_102_67.setTagInfo(_td_c_get_102_67);
                                                _jettag_c_get_102_67.doStart(context, out);
                                                _jettag_c_get_102_67.doEnd();
                                                out.write("s(null);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_95_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_95_4_saved_out;
                                            _jettag_c_otherwise_95_4.doEnd();
                                            _jettag_c_choose_92_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_92_4_saved_out;
                                        _jettag_c_choose_92_4.doEnd();
                                        _jettag_c_iterate_91_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_91_4.doEnd();
                                    _jettag_c_when_90_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_90_4_saved_out;
                                _jettag_c_when_90_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_107_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_107_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_107_4.setRuntimeParent(_jettag_c_choose_89_4);
                                _jettag_c_otherwise_107_4.setTagInfo(_td_c_otherwise_107_4);
                                _jettag_c_otherwise_107_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_107_4_saved_out = out;
                                while (_jettag_c_otherwise_107_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("\t\t\tif(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_108_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_7); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_7.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_108_7.setTagInfo(_td_c_get_108_7);
                                    _jettag_c_get_108_7.doStart(context, out);
                                    _jettag_c_get_108_7.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_108_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_45); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_45.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_108_45.setTagInfo(_td_c_get_108_45);
                                    _jettag_c_get_108_45.doStart(context, out);
                                    _jettag_c_get_108_45.doEnd();
                                    out.write("s()!=null){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tfor(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_109_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_9); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_109_9.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_109_9.setTagInfo(_td_c_get_109_9);
                                    _jettag_c_get_109_9.doStart(context, out);
                                    _jettag_c_get_109_9.doEnd();
                                    out.write(" relative");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_109_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_73); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_109_73.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_109_73.setTagInfo(_td_c_get_109_73);
                                    _jettag_c_get_109_73.doStart(context, out);
                                    _jettag_c_get_109_73.doEnd();
                                    out.write(":");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_109_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_129); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_109_129.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_109_129.setTagInfo(_td_c_get_109_129);
                                    _jettag_c_get_109_129.doStart(context, out);
                                    _jettag_c_get_109_129.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_109_167 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_109_167); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_109_167.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_109_167.setTagInfo(_td_c_get_109_167);
                                    _jettag_c_get_109_167.doStart(context, out);
                                    _jettag_c_get_109_167.doEnd();
                                    out.write("s()){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\trelative");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_13); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_13.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_110_13.setTagInfo(_td_c_get_110_13);
                                    _jettag_c_get_110_13.doStart(context, out);
                                    _jettag_c_get_110_13.doEnd();
                                    out.write(".set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_72); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_72.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_110_72.setTagInfo(_td_c_get_110_72);
                                    _jettag_c_get_110_72.doStart(context, out);
                                    _jettag_c_get_110_72.doEnd();
                                    out.write("(existing");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_131); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_131.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_110_131.setTagInfo(_td_c_get_110_131);
                                    _jettag_c_get_110_131.doStart(context, out);
                                    _jettag_c_get_110_131.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tentityManager.persist(relative");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_111_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_35); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_111_35.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_111_35.setTagInfo(_td_c_get_111_35);
                                    _jettag_c_get_111_35.doStart(context, out);
                                    _jettag_c_get_111_35.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_113_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_13); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_113_13.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_113_13.setTagInfo(_td_c_get_113_13);
                                    _jettag_c_get_113_13.doStart(context, out);
                                    _jettag_c_get_113_13.doEnd();
                                    out.write(".set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_113_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_67); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_113_67.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_113_67.setTagInfo(_td_c_get_113_67);
                                    _jettag_c_get_113_67.doStart(context, out);
                                    _jettag_c_get_113_67.doEnd();
                                    out.write("s(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_113_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_124); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_113_124.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_113_124.setTagInfo(_td_c_get_113_124);
                                    _jettag_c_get_113_124.doStart(context, out);
                                    _jettag_c_get_113_124.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_113_162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_162); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_113_162.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_113_162.setTagInfo(_td_c_get_113_162);
                                    _jettag_c_get_113_162.doStart(context, out);
                                    _jettag_c_get_113_162.doEnd();
                                    out.write("s());");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\telse");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\texisting");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_116_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_13); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_116_13.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_116_13.setTagInfo(_td_c_get_116_13);
                                    _jettag_c_get_116_13.doStart(context, out);
                                    _jettag_c_get_116_13.doEnd();
                                    out.write(".set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_116_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_67); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_116_67.setRuntimeParent(_jettag_c_otherwise_107_4);
                                    _jettag_c_get_116_67.setTagInfo(_td_c_get_116_67);
                                    _jettag_c_get_116_67.doStart(context, out);
                                    _jettag_c_get_116_67.doEnd();
                                    out.write("s(null);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_107_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_107_4_saved_out;
                                _jettag_c_otherwise_107_4.doEnd();
                                _jettag_c_choose_89_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_89_4_saved_out;
                            _jettag_c_choose_89_4.doEnd();
                            _jettag_c_if_80_4.handleBodyContent(out);
                        }
                        _jettag_c_if_80_4.doEnd();
                        _jettag_c_iterate_79_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_79_4.doEnd();
                    _jettag_c_iterate_78_4.handleBodyContent(out);
                }
                _jettag_c_iterate_78_4.doEnd();
                out.write("\t\t\tentityManager.persist(existing");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_122_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_34); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_122_34.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_122_34.setTagInfo(_td_c_get_122_34);
                _jettag_c_get_122_34.doStart(context, out);
                _jettag_c_get_122_34.doEnd();
                out.write(");\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t} else {\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_124_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_26); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_124_26.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_124_26.setTagInfo(_td_c_get_124_26);
                _jettag_c_get_124_26.doStart(context, out);
                _jettag_c_get_124_26.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_4.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_125_4.setTagInfo(_td_c_get_125_4);
                _jettag_c_get_125_4.doStart(context, out);
                _jettag_c_get_125_4.doEnd();
                out.write(" = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_41.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_125_41.setTagInfo(_td_c_get_125_41);
                _jettag_c_get_125_41.doStart(context, out);
                _jettag_c_get_125_41.doEnd();
                out.write("DAO.store(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_85); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_85.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_125_85.setTagInfo(_td_c_get_125_85);
                _jettag_c_get_125_85.doStart(context, out);
                _jettag_c_get_125_85.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_127_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_3.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_get_127_3.setTagInfo(_td_c_get_127_3);
                _jettag_c_get_127_3.doStart(context, out);
                _jettag_c_get_127_3.doEnd();
                out.write("DAO.flush();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_130_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_130_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_130_2.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_130_2.setTagInfo(_td_c_iterate_130_2);
                _jettag_c_iterate_130_2.doStart(context, out);
                while (_jettag_c_iterate_130_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_131_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_131_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_131_2.setRuntimeParent(_jettag_c_iterate_130_2);
                    _jettag_c_iterate_131_2.setTagInfo(_td_c_iterate_131_2);
                    _jettag_c_iterate_131_2.doStart(context, out);
                    while (_jettag_c_iterate_131_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_132_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_132_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_132_2.setRuntimeParent(_jettag_c_iterate_131_2);
                        _jettag_c_if_132_2.setTagInfo(_td_c_if_132_2);
                        _jettag_c_if_132_2.doStart(context, out);
                        while (_jettag_c_if_132_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_133_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_133_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_133_2.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_setVariable_133_2.setTagInfo(_td_c_setVariable_133_2);
                            _jettag_c_setVariable_133_2.doStart(context, out);
                            _jettag_c_setVariable_133_2.doEnd();
                            out.write("\t@Transactional");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\tpublic ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_135_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_135_9.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_135_9.setTagInfo(_td_c_get_135_9);
                            _jettag_c_get_135_9.doStart(context, out);
                            _jettag_c_get_135_9.doEnd();
                            out.write(" save");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_135_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_64); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_135_64.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_135_64.setTagInfo(_td_c_get_135_64);
                            _jettag_c_get_135_64.doStart(context, out);
                            _jettag_c_get_135_64.doEnd();
                            RuntimeTagElement _jettag_c_get_135_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_114); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_135_114.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_135_114.setTagInfo(_td_c_get_135_114);
                            _jettag_c_get_135_114.doStart(context, out);
                            _jettag_c_get_135_114.doEnd();
                            out.write("(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_135_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_135_173); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_135_173.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_iterate_135_173.setTagInfo(_td_c_iterate_135_173);
                            _jettag_c_iterate_135_173.doStart(context, out);
                            while (_jettag_c_iterate_135_173.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_135_240 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_240); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_135_240.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_if_135_240.setTagInfo(_td_c_if_135_240);
                                _jettag_c_if_135_240.doStart(context, out);
                                while (_jettag_c_if_135_240.okToProcessBody()) {
                                    out.write("String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_135_483 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_483); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_135_483.setRuntimeParent(_jettag_c_if_135_240);
                                    _jettag_c_get_135_483.setTagInfo(_td_c_get_135_483);
                                    _jettag_c_get_135_483.doStart(context, out);
                                    _jettag_c_get_135_483.doEnd();
                                    _jettag_c_if_135_240.handleBodyContent(out);
                                }
                                _jettag_c_if_135_240.doEnd();
                                RuntimeTagElement _jettag_c_if_135_525 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_525); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_135_525.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_if_135_525.setTagInfo(_td_c_if_135_525);
                                _jettag_c_if_135_525.doStart(context, out);
                                while (_jettag_c_if_135_525.okToProcessBody()) {
                                    out.write("Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_135_688 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_688); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_135_688.setRuntimeParent(_jettag_c_if_135_525);
                                    _jettag_c_get_135_688.setTagInfo(_td_c_get_135_688);
                                    _jettag_c_get_135_688.doStart(context, out);
                                    _jettag_c_get_135_688.doEnd();
                                    _jettag_c_if_135_525.handleBodyContent(out);
                                }
                                _jettag_c_if_135_525.doEnd();
                                RuntimeTagElement _jettag_c_if_135_730 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_730); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_135_730.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_if_135_730.setTagInfo(_td_c_if_135_730);
                                _jettag_c_if_135_730.doStart(context, out);
                                while (_jettag_c_if_135_730.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_135_881 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_135_881); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_135_881.setRuntimeParent(_jettag_c_if_135_730);
                                    _jettag_java_import_135_881.setTagInfo(_td_java_import_135_881);
                                    _jettag_java_import_135_881.doStart(context, out);
                                    JET2Writer _jettag_java_import_135_881_saved_out = out;
                                    while (_jettag_java_import_135_881.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_135_881.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_135_881_saved_out;
                                    _jettag_java_import_135_881.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_135_923 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_923); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_135_923.setRuntimeParent(_jettag_c_if_135_730);
                                    _jettag_c_get_135_923.setTagInfo(_td_c_get_135_923);
                                    _jettag_c_get_135_923.doStart(context, out);
                                    _jettag_c_get_135_923.doEnd();
                                    _jettag_c_if_135_730.handleBodyContent(out);
                                }
                                _jettag_c_if_135_730.doEnd();
                                RuntimeTagElement _jettag_c_if_135_965 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_965); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_135_965.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_if_135_965.setTagInfo(_td_c_if_135_965);
                                _jettag_c_if_135_965.doStart(context, out);
                                while (_jettag_c_if_135_965.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_135_1116 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_135_1116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_135_1116.setRuntimeParent(_jettag_c_if_135_965);
                                    _jettag_java_import_135_1116.setTagInfo(_td_java_import_135_1116);
                                    _jettag_java_import_135_1116.doStart(context, out);
                                    JET2Writer _jettag_java_import_135_1116_saved_out = out;
                                    while (_jettag_java_import_135_1116.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_135_1116.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_135_1116_saved_out;
                                    _jettag_java_import_135_1116.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_135_1164 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_1164); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_135_1164.setRuntimeParent(_jettag_c_if_135_965);
                                    _jettag_c_get_135_1164.setTagInfo(_td_c_get_135_1164);
                                    _jettag_c_get_135_1164.doStart(context, out);
                                    _jettag_c_get_135_1164.doEnd();
                                    _jettag_c_if_135_965.handleBodyContent(out);
                                }
                                _jettag_c_if_135_965.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_135_1206 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_135_1206); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_135_1206.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_setVariable_135_1206.setTagInfo(_td_c_setVariable_135_1206);
                                _jettag_c_setVariable_135_1206.doStart(context, out);
                                _jettag_c_setVariable_135_1206.doEnd();
                                RuntimeTagElement _jettag_c_if_135_1255 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_135_1255); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_135_1255.setRuntimeParent(_jettag_c_iterate_135_173);
                                _jettag_c_if_135_1255.setTagInfo(_td_c_if_135_1255);
                                _jettag_c_if_135_1255.doStart(context, out);
                                while (_jettag_c_if_135_1255.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_135_1255.handleBodyContent(out);
                                }
                                _jettag_c_if_135_1255.doEnd();
                                _jettag_c_iterate_135_173.handleBodyContent(out);
                            }
                            _jettag_c_iterate_135_173.doEnd();
                            out.write(", ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_135_1299 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_1299); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_135_1299.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_135_1299.setTagInfo(_td_c_get_135_1299);
                            _jettag_c_get_135_1299.doStart(context, out);
                            _jettag_c_get_135_1299.doEnd();
                            out.write(" related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_135_1366 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_135_1366); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_135_1366.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_135_1366.setTagInfo(_td_c_get_135_1366);
                            _jettag_c_get_135_1366.doStart(context, out);
                            _jettag_c_get_135_1366.doEnd();
                            out.write("){");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_setVariable_136_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_136_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_136_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_setVariable_136_3.setTagInfo(_td_c_setVariable_136_3);
                            _jettag_c_setVariable_136_3.doStart(context, out);
                            _jettag_c_setVariable_136_3.doEnd();
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_137_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_137_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_137_3.setTagInfo(_td_c_get_137_3);
                            _jettag_c_get_137_3.doStart(context, out);
                            _jettag_c_get_137_3.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_137_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_54); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_137_54.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_137_54.setTagInfo(_td_c_get_137_54);
                            _jettag_c_get_137_54.doStart(context, out);
                            _jettag_c_get_137_54.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_137_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_91); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_137_91.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_137_91.setTagInfo(_td_c_get_137_91);
                            _jettag_c_get_137_91.doStart(context, out);
                            _jettag_c_get_137_91.doEnd();
                            out.write("DAO.find");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_137_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_133); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_137_133.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_137_133.setTagInfo(_td_c_get_137_133);
                            _jettag_c_get_137_133.doStart(context, out);
                            _jettag_c_get_137_133.doEnd();
                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_137_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_137_196); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_137_196.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_iterate_137_196.setTagInfo(_td_c_iterate_137_196);
                            _jettag_c_iterate_137_196.doStart(context, out);
                            while (_jettag_c_iterate_137_196.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_get_137_263 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_137_263); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_137_263.setRuntimeParent(_jettag_c_iterate_137_196);
                                _jettag_c_get_137_263.setTagInfo(_td_c_get_137_263);
                                _jettag_c_get_137_263.doStart(context, out);
                                _jettag_c_get_137_263.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_137_298 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_137_298); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_137_298.setRuntimeParent(_jettag_c_iterate_137_196);
                                _jettag_c_setVariable_137_298.setTagInfo(_td_c_setVariable_137_298);
                                _jettag_c_setVariable_137_298.doStart(context, out);
                                _jettag_c_setVariable_137_298.doEnd();
                                RuntimeTagElement _jettag_c_if_137_347 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_347); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_137_347.setRuntimeParent(_jettag_c_iterate_137_196);
                                _jettag_c_if_137_347.setTagInfo(_td_c_if_137_347);
                                _jettag_c_if_137_347.doStart(context, out);
                                while (_jettag_c_if_137_347.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_137_347.handleBodyContent(out);
                                }
                                _jettag_c_if_137_347.doEnd();
                                _jettag_c_iterate_137_196.handleBodyContent(out);
                            }
                            _jettag_c_iterate_137_196.doEnd();
                            out.write(", -1, -1);");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_iterate_138_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_138_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_138_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_iterate_138_3.setTagInfo(_td_c_iterate_138_3);
                            _jettag_c_iterate_138_3.doStart(context, out);
                            while (_jettag_c_iterate_138_3.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_139_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_139_3); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_139_3.setRuntimeParent(_jettag_c_iterate_138_3);
                                _jettag_c_if_139_3.setTagInfo(_td_c_if_139_3);
                                _jettag_c_if_139_3.doStart(context, out);
                                while (_jettag_c_if_139_3.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_140_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_140_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_140_3.setRuntimeParent(_jettag_c_if_139_3);
                                    _jettag_c_setVariable_140_3.setTagInfo(_td_c_setVariable_140_3);
                                    _jettag_c_setVariable_140_3.doStart(context, out);
                                    _jettag_c_setVariable_140_3.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_141_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_141_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_141_3.setRuntimeParent(_jettag_c_if_139_3);
                                    _jettag_c_iterate_141_3.setTagInfo(_td_c_iterate_141_3);
                                    _jettag_c_iterate_141_3.doStart(context, out);
                                    while (_jettag_c_iterate_141_3.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_142_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_142_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_142_3.setRuntimeParent(_jettag_c_iterate_141_3);
                                        _jettag_c_setVariable_142_3.setTagInfo(_td_c_setVariable_142_3);
                                        _jettag_c_setVariable_142_3.doStart(context, out);
                                        _jettag_c_setVariable_142_3.doEnd();
                                        _jettag_c_iterate_141_3.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_141_3.doEnd();
                                    RuntimeTagElement _jettag_c_if_144_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_144_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_144_3.setRuntimeParent(_jettag_c_if_139_3);
                                    _jettag_c_if_144_3.setTagInfo(_td_c_if_144_3);
                                    _jettag_c_if_144_3.doStart(context, out);
                                    while (_jettag_c_if_144_3.okToProcessBody()) {
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_145_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_145_3.setRuntimeParent(_jettag_c_if_144_3);
                                        _jettag_c_get_145_3.setTagInfo(_td_c_get_145_3);
                                        _jettag_c_get_145_3.doStart(context, out);
                                        _jettag_c_get_145_3.doEnd();
                                        out.write(" existing");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_145_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_70); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_145_70.setRuntimeParent(_jettag_c_if_144_3);
                                        _jettag_c_get_145_70.setTagInfo(_td_c_get_145_70);
                                        _jettag_c_get_145_70.doStart(context, out);
                                        _jettag_c_get_145_70.doEnd();
                                        out.write(" = ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_145_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_131); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_145_131.setRuntimeParent(_jettag_c_if_144_3);
                                        _jettag_c_get_145_131.setTagInfo(_td_c_get_145_131);
                                        _jettag_c_get_145_131.doStart(context, out);
                                        _jettag_c_get_145_131.doEnd();
                                        out.write("DAO.find");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_145_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_181); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_145_181.setRuntimeParent(_jettag_c_if_144_3);
                                        _jettag_c_get_145_181.setTagInfo(_td_c_get_145_181);
                                        _jettag_c_get_145_181.doStart(context, out);
                                        _jettag_c_get_145_181.doEnd();
                                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_145_252 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_145_252); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_145_252.setRuntimeParent(_jettag_c_if_144_3);
                                        _jettag_c_iterate_145_252.setTagInfo(_td_c_iterate_145_252);
                                        _jettag_c_iterate_145_252.doStart(context, out);
                                        while (_jettag_c_iterate_145_252.okToProcessBody()) {
                                            out.write("related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_145_316 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_316); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_145_316.setRuntimeParent(_jettag_c_iterate_145_252);
                                            _jettag_c_get_145_316.setTagInfo(_td_c_get_145_316);
                                            _jettag_c_get_145_316.doStart(context, out);
                                            _jettag_c_get_145_316.doEnd();
                                            out.write(".get");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_145_362 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_362); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_145_362.setRuntimeParent(_jettag_c_iterate_145_252);
                                            _jettag_c_get_145_362.setTagInfo(_td_c_get_145_362);
                                            _jettag_c_get_145_362.doStart(context, out);
                                            _jettag_c_get_145_362.doEnd();
                                            out.write("()");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_setVariable_145_411 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_145_411); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_145_411.setRuntimeParent(_jettag_c_iterate_145_252);
                                            _jettag_c_setVariable_145_411.setTagInfo(_td_c_setVariable_145_411);
                                            _jettag_c_setVariable_145_411.doStart(context, out);
                                            _jettag_c_setVariable_145_411.doEnd();
                                            RuntimeTagElement _jettag_c_if_145_464 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_145_464); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_145_464.setRuntimeParent(_jettag_c_iterate_145_252);
                                            _jettag_c_if_145_464.setTagInfo(_td_c_if_145_464);
                                            _jettag_c_if_145_464.doStart(context, out);
                                            while (_jettag_c_if_145_464.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_145_464.handleBodyContent(out);
                                            }
                                            _jettag_c_if_145_464.doEnd();
                                            _jettag_c_iterate_145_252.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_145_252.doEnd();
                                        out.write(");");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_144_3.handleBodyContent(out);
                                    }
                                    _jettag_c_if_144_3.doEnd();
                                    RuntimeTagElement _jettag_c_if_147_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_147_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_147_3.setRuntimeParent(_jettag_c_if_139_3);
                                    _jettag_c_if_147_3.setTagInfo(_td_c_if_147_3);
                                    _jettag_c_if_147_3.doStart(context, out);
                                    while (_jettag_c_if_147_3.okToProcessBody()) {
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_148_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_148_3.setRuntimeParent(_jettag_c_if_147_3);
                                        _jettag_c_get_148_3.setTagInfo(_td_c_get_148_3);
                                        _jettag_c_get_148_3.doStart(context, out);
                                        _jettag_c_get_148_3.doEnd();
                                        out.write(" existing");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_148_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_70); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_148_70.setRuntimeParent(_jettag_c_if_147_3);
                                        _jettag_c_get_148_70.setTagInfo(_td_c_get_148_70);
                                        _jettag_c_get_148_70.doStart(context, out);
                                        _jettag_c_get_148_70.doEnd();
                                        out.write(" = ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_148_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_131); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_148_131.setRuntimeParent(_jettag_c_if_147_3);
                                        _jettag_c_get_148_131.setTagInfo(_td_c_get_148_131);
                                        _jettag_c_get_148_131.doStart(context, out);
                                        _jettag_c_get_148_131.doEnd();
                                        out.write("DAO.find");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_148_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_181); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_148_181.setRuntimeParent(_jettag_c_if_147_3);
                                        _jettag_c_get_148_181.setTagInfo(_td_c_get_148_181);
                                        _jettag_c_get_148_181.doStart(context, out);
                                        _jettag_c_get_148_181.doEnd();
                                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_148_252 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_148_252); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_148_252.setRuntimeParent(_jettag_c_if_147_3);
                                        _jettag_c_iterate_148_252.setTagInfo(_td_c_iterate_148_252);
                                        _jettag_c_iterate_148_252.doStart(context, out);
                                        while (_jettag_c_iterate_148_252.okToProcessBody()) {
                                            out.write("related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_148_316 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_316); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_148_316.setRuntimeParent(_jettag_c_iterate_148_252);
                                            _jettag_c_get_148_316.setTagInfo(_td_c_get_148_316);
                                            _jettag_c_get_148_316.doStart(context, out);
                                            _jettag_c_get_148_316.doEnd();
                                            out.write(".get");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_148_362 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_362); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_148_362.setRuntimeParent(_jettag_c_iterate_148_252);
                                            _jettag_c_get_148_362.setTagInfo(_td_c_get_148_362);
                                            _jettag_c_get_148_362.doStart(context, out);
                                            _jettag_c_get_148_362.doEnd();
                                            out.write("Field()");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_setVariable_148_416 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_148_416); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_148_416.setRuntimeParent(_jettag_c_iterate_148_252);
                                            _jettag_c_setVariable_148_416.setTagInfo(_td_c_setVariable_148_416);
                                            _jettag_c_setVariable_148_416.doStart(context, out);
                                            _jettag_c_setVariable_148_416.doEnd();
                                            RuntimeTagElement _jettag_c_if_148_469 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_148_469); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_148_469.setRuntimeParent(_jettag_c_iterate_148_252);
                                            _jettag_c_if_148_469.setTagInfo(_td_c_if_148_469);
                                            _jettag_c_if_148_469.doStart(context, out);
                                            while (_jettag_c_if_148_469.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_148_469.handleBodyContent(out);
                                            }
                                            _jettag_c_if_148_469.doEnd();
                                            _jettag_c_iterate_148_252.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_148_252.doEnd();
                                        out.write(");");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_147_3.handleBodyContent(out);
                                    }
                                    _jettag_c_if_147_3.doEnd();
                                    _jettag_c_if_139_3.handleBodyContent(out);
                                }
                                _jettag_c_if_139_3.doEnd();
                                _jettag_c_iterate_138_3.handleBodyContent(out);
                            }
                            _jettag_c_iterate_138_3.doEnd();
                            out.write("\t\tif (existing");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_152_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_15); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_152_15.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_152_15.setTagInfo(_td_c_get_152_15);
                            _jettag_c_get_152_15.doStart(context, out);
                            _jettag_c_get_152_15.doEnd();
                            out.write(" != null) {");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_iterate_153_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_153_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_153_4.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_iterate_153_4.setTagInfo(_td_c_iterate_153_4);
                            _jettag_c_iterate_153_4.doStart(context, out);
                            while (_jettag_c_iterate_153_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_154_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_154_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_154_4.setRuntimeParent(_jettag_c_iterate_153_4);
                                _jettag_c_if_154_4.setTagInfo(_td_c_if_154_4);
                                _jettag_c_if_154_4.doStart(context, out);
                                while (_jettag_c_if_154_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_iterate_155_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_155_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_155_4.setRuntimeParent(_jettag_c_if_154_4);
                                    _jettag_c_iterate_155_4.setTagInfo(_td_c_iterate_155_4);
                                    _jettag_c_iterate_155_4.doStart(context, out);
                                    while (_jettag_c_iterate_155_4.okToProcessBody()) {
                                        out.write("\t\t\texisting");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_156_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_156_12.setRuntimeParent(_jettag_c_iterate_155_4);
                                        _jettag_c_get_156_12.setTagInfo(_td_c_get_156_12);
                                        _jettag_c_get_156_12.doStart(context, out);
                                        _jettag_c_get_156_12.doEnd();
                                        out.write(".set");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_156_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_74); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_156_74.setRuntimeParent(_jettag_c_iterate_155_4);
                                        _jettag_c_get_156_74.setTagInfo(_td_c_get_156_74);
                                        _jettag_c_get_156_74.doStart(context, out);
                                        _jettag_c_get_156_74.doEnd();
                                        out.write("(related_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_156_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_134); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_156_134.setRuntimeParent(_jettag_c_iterate_155_4);
                                        _jettag_c_get_156_134.setTagInfo(_td_c_get_156_134);
                                        _jettag_c_get_156_134.doStart(context, out);
                                        _jettag_c_get_156_134.doEnd();
                                        out.write(".get");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_156_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_156_180); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_156_180.setRuntimeParent(_jettag_c_iterate_155_4);
                                        _jettag_c_get_156_180.setTagInfo(_td_c_get_156_180);
                                        _jettag_c_get_156_180.doStart(context, out);
                                        _jettag_c_get_156_180.doEnd();
                                        out.write("());");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_iterate_155_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_155_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_158_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_158_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_158_4.setRuntimeParent(_jettag_c_if_154_4);
                                    _jettag_c_iterate_158_4.setTagInfo(_td_c_iterate_158_4);
                                    _jettag_c_iterate_158_4.doStart(context, out);
                                    while (_jettag_c_iterate_158_4.okToProcessBody()) {
                                        out.write("\t\t\texisting");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_159_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_159_12.setRuntimeParent(_jettag_c_iterate_158_4);
                                        _jettag_c_get_159_12.setTagInfo(_td_c_get_159_12);
                                        _jettag_c_get_159_12.doStart(context, out);
                                        _jettag_c_get_159_12.doEnd();
                                        out.write(".set");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_159_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_74); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_159_74.setRuntimeParent(_jettag_c_iterate_158_4);
                                        _jettag_c_get_159_74.setTagInfo(_td_c_get_159_74);
                                        _jettag_c_get_159_74.doStart(context, out);
                                        _jettag_c_get_159_74.doEnd();
                                        out.write("(related_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_159_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_133); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_159_133.setRuntimeParent(_jettag_c_iterate_158_4);
                                        _jettag_c_get_159_133.setTagInfo(_td_c_get_159_133);
                                        _jettag_c_get_159_133.doStart(context, out);
                                        _jettag_c_get_159_133.doEnd();
                                        out.write(".get");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_159_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_179); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_159_179.setRuntimeParent(_jettag_c_iterate_158_4);
                                        _jettag_c_get_159_179.setTagInfo(_td_c_get_159_179);
                                        _jettag_c_get_159_179.doStart(context, out);
                                        _jettag_c_get_159_179.doEnd();
                                        out.write("());");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_iterate_158_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_158_4.doEnd();
                                    _jettag_c_if_154_4.handleBodyContent(out);
                                }
                                _jettag_c_if_154_4.doEnd();
                                _jettag_c_iterate_153_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_153_4.doEnd();
                            out.write("\t\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_163_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_12); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_163_12.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_163_12.setTagInfo(_td_c_get_163_12);
                            _jettag_c_get_163_12.doStart(context, out);
                            _jettag_c_get_163_12.doEnd();
                            out.write(" = existing");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_163_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_65); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_163_65.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_163_65.setTagInfo(_td_c_get_163_65);
                            _jettag_c_get_163_65.doStart(context, out);
                            _jettag_c_get_163_65.doEnd();
                            out.write(";");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t} else {");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_165_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_12); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_165_12.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_165_12.setTagInfo(_td_c_get_165_12);
                            _jettag_c_get_165_12.doStart(context, out);
                            _jettag_c_get_165_12.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_165_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_57); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_165_57.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_165_57.setTagInfo(_td_c_get_165_57);
                            _jettag_c_get_165_57.doStart(context, out);
                            _jettag_c_get_165_57.doEnd();
                            out.write("DAO.store(related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_165_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_165_117); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_165_117.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_165_117.setTagInfo(_td_c_get_165_117);
                            _jettag_c_get_165_117.doStart(context, out);
                            _jettag_c_get_165_117.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_166_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_166_4.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_166_4.setTagInfo(_td_c_get_166_4);
                            _jettag_c_get_166_4.doStart(context, out);
                            _jettag_c_get_166_4.doEnd();
                            out.write("DAO.flush();");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_168_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_168_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_168_3.setTagInfo(_td_c_get_168_3);
                            _jettag_c_get_168_3.doStart(context, out);
                            _jettag_c_get_168_3.doEnd();
                            out.write(".set");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_168_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_41); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_168_41.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_168_41.setTagInfo(_td_c_get_168_41);
                            _jettag_c_get_168_41.doStart(context, out);
                            _jettag_c_get_168_41.doEnd();
                            out.write("(related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_168_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_108); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_168_108.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_168_108.setTagInfo(_td_c_get_168_108);
                            _jettag_c_get_168_108.doStart(context, out);
                            _jettag_c_get_168_108.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_169_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_11); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_169_11.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_169_11.setTagInfo(_td_c_get_169_11);
                            _jettag_c_get_169_11.doStart(context, out);
                            _jettag_c_get_169_11.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_169_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_57); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_169_57.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_169_57.setTagInfo(_td_c_get_169_57);
                            _jettag_c_get_169_57.doStart(context, out);
                            _jettag_c_get_169_57.doEnd();
                            out.write("s().add(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_169_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_115); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_169_115.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_169_115.setTagInfo(_td_c_get_169_115);
                            _jettag_c_get_169_115.doStart(context, out);
                            _jettag_c_get_169_115.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_170_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_170_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_170_3.setTagInfo(_td_c_get_170_3);
                            _jettag_c_get_170_3.doStart(context, out);
                            _jettag_c_get_170_3.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_170_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_40); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_170_40.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_170_40.setTagInfo(_td_c_get_170_40);
                            _jettag_c_get_170_40.doStart(context, out);
                            _jettag_c_get_170_40.doEnd();
                            out.write("DAO.store(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_170_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_170_84); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_170_84.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_170_84.setTagInfo(_td_c_get_170_84);
                            _jettag_c_get_170_84.doStart(context, out);
                            _jettag_c_get_170_84.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_171_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_171_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_171_3.setTagInfo(_td_c_get_171_3);
                            _jettag_c_get_171_3.doStart(context, out);
                            _jettag_c_get_171_3.doEnd();
                            out.write("DAO.flush();");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write(NL);         
                            out.write("\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_173_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_11); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_173_11.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_173_11.setTagInfo(_td_c_get_173_11);
                            _jettag_c_get_173_11.doStart(context, out);
                            _jettag_c_get_173_11.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_173_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_56); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_173_56.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_173_56.setTagInfo(_td_c_get_173_56);
                            _jettag_c_get_173_56.doStart(context, out);
                            _jettag_c_get_173_56.doEnd();
                            out.write("DAO.store(related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_173_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_173_116.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_173_116.setTagInfo(_td_c_get_173_116);
                            _jettag_c_get_173_116.doStart(context, out);
                            _jettag_c_get_173_116.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_174_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_174_3.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_174_3.setTagInfo(_td_c_get_174_3);
                            _jettag_c_get_174_3.doStart(context, out);
                            _jettag_c_get_174_3.doEnd();
                            out.write("DAO.flush();");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write(NL);         
                            out.write("\t\treturn ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_176_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_176_10); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_176_10.setRuntimeParent(_jettag_c_if_132_2);
                            _jettag_c_get_176_10.setTagInfo(_td_c_get_176_10);
                            _jettag_c_get_176_10.doStart(context, out);
                            _jettag_c_get_176_10.doEnd();
                            out.write(";");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_132_2.handleBodyContent(out);
                        }
                        _jettag_c_if_132_2.doEnd();
                        _jettag_c_iterate_131_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_131_2.doEnd();
                    _jettag_c_iterate_130_2.handleBodyContent(out);
                }
                _jettag_c_iterate_130_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_181_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_181_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_181_2.setRuntimeParent(_jettag_c_otherwise_47_2);
                _jettag_c_iterate_181_2.setTagInfo(_td_c_iterate_181_2);
                _jettag_c_iterate_181_2.doStart(context, out);
                while (_jettag_c_iterate_181_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_182_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_182_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_182_2.setRuntimeParent(_jettag_c_iterate_181_2);
                    _jettag_c_iterate_182_2.setTagInfo(_td_c_iterate_182_2);
                    _jettag_c_iterate_182_2.doStart(context, out);
                    while (_jettag_c_iterate_182_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_183_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_183_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_183_3.setRuntimeParent(_jettag_c_iterate_182_2);
                        _jettag_c_if_183_3.setTagInfo(_td_c_if_183_3);
                        _jettag_c_if_183_3.doStart(context, out);
                        while (_jettag_c_if_183_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_184_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_184_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_184_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_setVariable_184_4.setTagInfo(_td_c_setVariable_184_4);
                            _jettag_c_setVariable_184_4.doStart(context, out);
                            _jettag_c_setVariable_184_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_185_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_185_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_185_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_setVariable_185_4.setTagInfo(_td_c_setVariable_185_4);
                            _jettag_c_setVariable_185_4.doStart(context, out);
                            _jettag_c_setVariable_185_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_186_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_186_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_186_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_iterate_186_4.setTagInfo(_td_c_iterate_186_4);
                            _jettag_c_iterate_186_4.doStart(context, out);
                            while (_jettag_c_iterate_186_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_187_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_187_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_187_5.setRuntimeParent(_jettag_c_iterate_186_4);
                                _jettag_c_setVariable_187_5.setTagInfo(_td_c_setVariable_187_5);
                                _jettag_c_setVariable_187_5.doStart(context, out);
                                _jettag_c_setVariable_187_5.doEnd();
                                _jettag_c_iterate_186_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_186_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_189_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_189_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_189_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_iterate_189_4.setTagInfo(_td_c_iterate_189_4);
                            _jettag_c_iterate_189_4.doStart(context, out);
                            while (_jettag_c_iterate_189_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_190_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_190_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_190_5.setRuntimeParent(_jettag_c_iterate_189_4);
                                _jettag_c_setVariable_190_5.setTagInfo(_td_c_setVariable_190_5);
                                _jettag_c_setVariable_190_5.doStart(context, out);
                                _jettag_c_setVariable_190_5.doEnd();
                                _jettag_c_iterate_189_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_189_4.doEnd();
                            RuntimeTagElement _jettag_c_if_192_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_192_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_192_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_if_192_4.setTagInfo(_td_c_if_192_4);
                            _jettag_c_if_192_4.doStart(context, out);
                            while (_jettag_c_if_192_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_193_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_193_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_193_4.setRuntimeParent(_jettag_c_if_192_4);
                                _jettag_c_if_193_4.setTagInfo(_td_c_if_193_4);
                                _jettag_c_if_193_4.doStart(context, out);
                                while (_jettag_c_if_193_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_iterate_194_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_194_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_194_4.setRuntimeParent(_jettag_c_if_193_4);
                                    _jettag_c_iterate_194_4.setTagInfo(_td_c_iterate_194_4);
                                    _jettag_c_iterate_194_4.doStart(context, out);
                                    while (_jettag_c_iterate_194_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_195_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_195_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_195_4.setRuntimeParent(_jettag_c_iterate_194_4);
                                        _jettag_c_choose_195_4.setTagInfo(_td_c_choose_195_4);
                                        _jettag_c_choose_195_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_195_4_saved_out = out;
                                        while (_jettag_c_choose_195_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_196_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_196_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_196_4.setRuntimeParent(_jettag_c_choose_195_4);
                                            _jettag_c_when_196_4.setTagInfo(_td_c_when_196_4);
                                            _jettag_c_when_196_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_196_4_saved_out = out;
                                            while (_jettag_c_when_196_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_196_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_196_4_saved_out;
                                            _jettag_c_when_196_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_198_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_198_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_198_4.setRuntimeParent(_jettag_c_choose_195_4);
                                            _jettag_c_otherwise_198_4.setTagInfo(_td_c_otherwise_198_4);
                                            _jettag_c_otherwise_198_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_198_4_saved_out = out;
                                            while (_jettag_c_otherwise_198_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_setVariable_199_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_199_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_199_4.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_setVariable_199_4.setTagInfo(_td_c_setVariable_199_4);
                                                _jettag_c_setVariable_199_4.doStart(context, out);
                                                _jettag_c_setVariable_199_4.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_200_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_200_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_200_4.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_iterate_200_4.setTagInfo(_td_c_iterate_200_4);
                                                _jettag_c_iterate_200_4.doStart(context, out);
                                                while (_jettag_c_iterate_200_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_201_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_201_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_201_4.setRuntimeParent(_jettag_c_iterate_200_4);
                                                    _jettag_c_setVariable_201_4.setTagInfo(_td_c_setVariable_201_4);
                                                    _jettag_c_setVariable_201_4.doStart(context, out);
                                                    _jettag_c_setVariable_201_4.doEnd();
                                                    _jettag_c_iterate_200_4.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_200_4.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_203_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_203_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_203_4.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_setVariable_203_4.setTagInfo(_td_c_setVariable_203_4);
                                                _jettag_c_setVariable_203_4.doStart(context, out);
                                                _jettag_c_setVariable_203_4.doEnd();
                                                out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_205_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_11); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_205_11.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_205_11.setTagInfo(_td_c_get_205_11);
                                                _jettag_c_get_205_11.doStart(context, out);
                                                _jettag_c_get_205_11.doEnd();
                                                out.write(" save");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_205_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_66); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_205_66.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_205_66.setTagInfo(_td_c_get_205_66);
                                                _jettag_c_get_205_66.doStart(context, out);
                                                _jettag_c_get_205_66.doEnd();
                                                RuntimeTagElement _jettag_c_get_205_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_116); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_205_116.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_205_116.setTagInfo(_td_c_get_205_116);
                                                _jettag_c_get_205_116.doStart(context, out);
                                                _jettag_c_get_205_116.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_205_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_205_175); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_205_175.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_iterate_205_175.setTagInfo(_td_c_iterate_205_175);
                                                _jettag_c_iterate_205_175.doStart(context, out);
                                                while (_jettag_c_iterate_205_175.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_205_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_242); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_205_242.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_if_205_242.setTagInfo(_td_c_if_205_242);
                                                    _jettag_c_if_205_242.doStart(context, out);
                                                    while (_jettag_c_if_205_242.okToProcessBody()) {
                                                        out.write("String ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_205_485 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_485); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_205_485.setRuntimeParent(_jettag_c_if_205_242);
                                                        _jettag_c_get_205_485.setTagInfo(_td_c_get_205_485);
                                                        _jettag_c_get_205_485.doStart(context, out);
                                                        _jettag_c_get_205_485.doEnd();
                                                        _jettag_c_if_205_242.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_205_242.doEnd();
                                                    RuntimeTagElement _jettag_c_if_205_527 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_527); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_205_527.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_if_205_527.setTagInfo(_td_c_if_205_527);
                                                    _jettag_c_if_205_527.doStart(context, out);
                                                    while (_jettag_c_if_205_527.okToProcessBody()) {
                                                        out.write("Integer ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_205_690 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_690); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_205_690.setRuntimeParent(_jettag_c_if_205_527);
                                                        _jettag_c_get_205_690.setTagInfo(_td_c_get_205_690);
                                                        _jettag_c_get_205_690.doStart(context, out);
                                                        _jettag_c_get_205_690.doEnd();
                                                        _jettag_c_if_205_527.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_205_527.doEnd();
                                                    RuntimeTagElement _jettag_c_if_205_732 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_732); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_205_732.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_if_205_732.setTagInfo(_td_c_if_205_732);
                                                    _jettag_c_if_205_732.doStart(context, out);
                                                    while (_jettag_c_if_205_732.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_205_883 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_205_883); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_205_883.setRuntimeParent(_jettag_c_if_205_732);
                                                        _jettag_java_import_205_883.setTagInfo(_td_java_import_205_883);
                                                        _jettag_java_import_205_883.doStart(context, out);
                                                        JET2Writer _jettag_java_import_205_883_saved_out = out;
                                                        while (_jettag_java_import_205_883.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("java.util.Date");  //$NON-NLS-1$        
                                                            _jettag_java_import_205_883.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_205_883_saved_out;
                                                        _jettag_java_import_205_883.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_205_925 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_925); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_205_925.setRuntimeParent(_jettag_c_if_205_732);
                                                        _jettag_c_get_205_925.setTagInfo(_td_c_get_205_925);
                                                        _jettag_c_get_205_925.doStart(context, out);
                                                        _jettag_c_get_205_925.doEnd();
                                                        _jettag_c_if_205_732.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_205_732.doEnd();
                                                    RuntimeTagElement _jettag_c_if_205_967 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_967); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_205_967.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_if_205_967.setTagInfo(_td_c_if_205_967);
                                                    _jettag_c_if_205_967.doStart(context, out);
                                                    while (_jettag_c_if_205_967.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_205_1118 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_205_1118); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_205_1118.setRuntimeParent(_jettag_c_if_205_967);
                                                        _jettag_java_import_205_1118.setTagInfo(_td_java_import_205_1118);
                                                        _jettag_java_import_205_1118.doStart(context, out);
                                                        JET2Writer _jettag_java_import_205_1118_saved_out = out;
                                                        while (_jettag_java_import_205_1118.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                            _jettag_java_import_205_1118.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_205_1118_saved_out;
                                                        _jettag_java_import_205_1118.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_205_1166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_1166); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_205_1166.setRuntimeParent(_jettag_c_if_205_967);
                                                        _jettag_c_get_205_1166.setTagInfo(_td_c_get_205_1166);
                                                        _jettag_c_get_205_1166.doStart(context, out);
                                                        _jettag_c_get_205_1166.doEnd();
                                                        _jettag_c_if_205_967.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_205_967.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_205_1208 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_205_1208); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_205_1208.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_setVariable_205_1208.setTagInfo(_td_c_setVariable_205_1208);
                                                    _jettag_c_setVariable_205_1208.doStart(context, out);
                                                    _jettag_c_setVariable_205_1208.doEnd();
                                                    RuntimeTagElement _jettag_c_if_205_1257 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_1257); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_205_1257.setRuntimeParent(_jettag_c_iterate_205_175);
                                                    _jettag_c_if_205_1257.setTagInfo(_td_c_if_205_1257);
                                                    _jettag_c_if_205_1257.doStart(context, out);
                                                    while (_jettag_c_if_205_1257.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_205_1257.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_205_1257.doEnd();
                                                    _jettag_c_iterate_205_175.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_205_175.doEnd();
                                                out.write(", ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_205_1301 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_1301); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_205_1301.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_205_1301.setTagInfo(_td_c_get_205_1301);
                                                _jettag_c_get_205_1301.doStart(context, out);
                                                _jettag_c_get_205_1301.doEnd();
                                                out.write(" related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_205_1367 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_1367); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_205_1367.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_205_1367.setTagInfo(_td_c_get_205_1367);
                                                _jettag_c_get_205_1367.doStart(context, out);
                                                _jettag_c_get_205_1367.doEnd();
                                                out.write("s){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_setVariable_206_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_206_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_206_5.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_setVariable_206_5.setTagInfo(_td_c_setVariable_206_5);
                                                _jettag_c_setVariable_206_5.doStart(context, out);
                                                _jettag_c_setVariable_206_5.doEnd();
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_207_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_207_5.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_207_5.setTagInfo(_td_c_get_207_5);
                                                _jettag_c_get_207_5.doStart(context, out);
                                                _jettag_c_get_207_5.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_207_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_56); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_207_56.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_207_56.setTagInfo(_td_c_get_207_56);
                                                _jettag_c_get_207_56.doStart(context, out);
                                                _jettag_c_get_207_56.doEnd();
                                                out.write(" = ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_207_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_93); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_207_93.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_207_93.setTagInfo(_td_c_get_207_93);
                                                _jettag_c_get_207_93.doStart(context, out);
                                                _jettag_c_get_207_93.doEnd();
                                                out.write("DAO.find");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_207_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_135); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_207_135.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_207_135.setTagInfo(_td_c_get_207_135);
                                                _jettag_c_get_207_135.doStart(context, out);
                                                _jettag_c_get_207_135.doEnd();
                                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_207_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_207_198); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_207_198.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_iterate_207_198.setTagInfo(_td_c_iterate_207_198);
                                                _jettag_c_iterate_207_198.doStart(context, out);
                                                while (_jettag_c_iterate_207_198.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_get_207_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_207_265); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_207_265.setRuntimeParent(_jettag_c_iterate_207_198);
                                                    _jettag_c_get_207_265.setTagInfo(_td_c_get_207_265);
                                                    _jettag_c_get_207_265.doStart(context, out);
                                                    _jettag_c_get_207_265.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_207_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_207_300); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_207_300.setRuntimeParent(_jettag_c_iterate_207_198);
                                                    _jettag_c_setVariable_207_300.setTagInfo(_td_c_setVariable_207_300);
                                                    _jettag_c_setVariable_207_300.doStart(context, out);
                                                    _jettag_c_setVariable_207_300.doEnd();
                                                    RuntimeTagElement _jettag_c_if_207_349 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_207_349); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_207_349.setRuntimeParent(_jettag_c_iterate_207_198);
                                                    _jettag_c_if_207_349.setTagInfo(_td_c_if_207_349);
                                                    _jettag_c_if_207_349.doStart(context, out);
                                                    while (_jettag_c_if_207_349.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_207_349.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_207_349.doEnd();
                                                    _jettag_c_iterate_207_198.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_207_198.doEnd();
                                                out.write(", -1, -1);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_iterate_208_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_208_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_208_5.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_iterate_208_5.setTagInfo(_td_c_iterate_208_5);
                                                _jettag_c_iterate_208_5.doStart(context, out);
                                                while (_jettag_c_iterate_208_5.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_209_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_209_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_209_5.setRuntimeParent(_jettag_c_iterate_208_5);
                                                    _jettag_c_if_209_5.setTagInfo(_td_c_if_209_5);
                                                    _jettag_c_if_209_5.doStart(context, out);
                                                    while (_jettag_c_if_209_5.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_setVariable_210_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_210_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_210_5.setRuntimeParent(_jettag_c_if_209_5);
                                                        _jettag_c_setVariable_210_5.setTagInfo(_td_c_setVariable_210_5);
                                                        _jettag_c_setVariable_210_5.doStart(context, out);
                                                        _jettag_c_setVariable_210_5.doEnd();
                                                        RuntimeTagElement _jettag_c_iterate_211_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_211_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_211_5.setRuntimeParent(_jettag_c_if_209_5);
                                                        _jettag_c_iterate_211_5.setTagInfo(_td_c_iterate_211_5);
                                                        _jettag_c_iterate_211_5.doStart(context, out);
                                                        while (_jettag_c_iterate_211_5.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_setVariable_212_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_212_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_212_5.setRuntimeParent(_jettag_c_iterate_211_5);
                                                            _jettag_c_setVariable_212_5.setTagInfo(_td_c_setVariable_212_5);
                                                            _jettag_c_setVariable_212_5.doStart(context, out);
                                                            _jettag_c_setVariable_212_5.doEnd();
                                                            _jettag_c_iterate_211_5.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_211_5.doEnd();
                                                        RuntimeTagElement _jettag_c_if_214_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_214_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_214_5.setRuntimeParent(_jettag_c_if_209_5);
                                                        _jettag_c_if_214_5.setTagInfo(_td_c_if_214_5);
                                                        _jettag_c_if_214_5.doStart(context, out);
                                                        while (_jettag_c_if_214_5.okToProcessBody()) {
                                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_215_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_215_5.setRuntimeParent(_jettag_c_if_214_5);
                                                            _jettag_c_get_215_5.setTagInfo(_td_c_get_215_5);
                                                            _jettag_c_get_215_5.doStart(context, out);
                                                            _jettag_c_get_215_5.doEnd();
                                                            out.write(" existing");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_215_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_71); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_215_71.setRuntimeParent(_jettag_c_if_214_5);
                                                            _jettag_c_get_215_71.setTagInfo(_td_c_get_215_71);
                                                            _jettag_c_get_215_71.doStart(context, out);
                                                            _jettag_c_get_215_71.doEnd();
                                                            out.write("s = ");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_215_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_132); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_215_132.setRuntimeParent(_jettag_c_if_214_5);
                                                            _jettag_c_get_215_132.setTagInfo(_td_c_get_215_132);
                                                            _jettag_c_get_215_132.doStart(context, out);
                                                            _jettag_c_get_215_132.doEnd();
                                                            out.write("DAO.find");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_215_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_181); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_215_181.setRuntimeParent(_jettag_c_if_214_5);
                                                            _jettag_c_get_215_181.setTagInfo(_td_c_get_215_181);
                                                            _jettag_c_get_215_181.doStart(context, out);
                                                            _jettag_c_get_215_181.doEnd();
                                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_iterate_215_251 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_215_251); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_iterate_215_251.setRuntimeParent(_jettag_c_if_214_5);
                                                            _jettag_c_iterate_215_251.setTagInfo(_td_c_iterate_215_251);
                                                            _jettag_c_iterate_215_251.doStart(context, out);
                                                            while (_jettag_c_iterate_215_251.okToProcessBody()) {
                                                                out.write("related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_215_315 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_315); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_215_315.setRuntimeParent(_jettag_c_iterate_215_251);
                                                                _jettag_c_get_215_315.setTagInfo(_td_c_get_215_315);
                                                                _jettag_c_get_215_315.doStart(context, out);
                                                                _jettag_c_get_215_315.doEnd();
                                                                out.write("s.get");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_215_361 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_361); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_215_361.setRuntimeParent(_jettag_c_iterate_215_251);
                                                                _jettag_c_get_215_361.setTagInfo(_td_c_get_215_361);
                                                                _jettag_c_get_215_361.doStart(context, out);
                                                                _jettag_c_get_215_361.doEnd();
                                                                out.write("()");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_setVariable_215_410 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_215_410); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_setVariable_215_410.setRuntimeParent(_jettag_c_iterate_215_251);
                                                                _jettag_c_setVariable_215_410.setTagInfo(_td_c_setVariable_215_410);
                                                                _jettag_c_setVariable_215_410.doStart(context, out);
                                                                _jettag_c_setVariable_215_410.doEnd();
                                                                RuntimeTagElement _jettag_c_if_215_463 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_215_463); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_if_215_463.setRuntimeParent(_jettag_c_iterate_215_251);
                                                                _jettag_c_if_215_463.setTagInfo(_td_c_if_215_463);
                                                                _jettag_c_if_215_463.doStart(context, out);
                                                                while (_jettag_c_if_215_463.okToProcessBody()) {
                                                                    out.write(",");  //$NON-NLS-1$        
                                                                    _jettag_c_if_215_463.handleBodyContent(out);
                                                                }
                                                                _jettag_c_if_215_463.doEnd();
                                                                _jettag_c_iterate_215_251.handleBodyContent(out);
                                                            }
                                                            _jettag_c_iterate_215_251.doEnd();
                                                            out.write(");");  //$NON-NLS-1$        
                                                            out.write(NL);         
                                                            _jettag_c_if_214_5.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_214_5.doEnd();
                                                        RuntimeTagElement _jettag_c_if_217_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_217_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_217_5.setRuntimeParent(_jettag_c_if_209_5);
                                                        _jettag_c_if_217_5.setTagInfo(_td_c_if_217_5);
                                                        _jettag_c_if_217_5.doStart(context, out);
                                                        while (_jettag_c_if_217_5.okToProcessBody()) {
                                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_218_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_218_5.setRuntimeParent(_jettag_c_if_217_5);
                                                            _jettag_c_get_218_5.setTagInfo(_td_c_get_218_5);
                                                            _jettag_c_get_218_5.doStart(context, out);
                                                            _jettag_c_get_218_5.doEnd();
                                                            out.write(" existing");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_218_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_71); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_218_71.setRuntimeParent(_jettag_c_if_217_5);
                                                            _jettag_c_get_218_71.setTagInfo(_td_c_get_218_71);
                                                            _jettag_c_get_218_71.doStart(context, out);
                                                            _jettag_c_get_218_71.doEnd();
                                                            out.write("s = ");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_218_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_132); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_218_132.setRuntimeParent(_jettag_c_if_217_5);
                                                            _jettag_c_get_218_132.setTagInfo(_td_c_get_218_132);
                                                            _jettag_c_get_218_132.doStart(context, out);
                                                            _jettag_c_get_218_132.doEnd();
                                                            out.write("DAO.find");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_218_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_181); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_218_181.setRuntimeParent(_jettag_c_if_217_5);
                                                            _jettag_c_get_218_181.setTagInfo(_td_c_get_218_181);
                                                            _jettag_c_get_218_181.doStart(context, out);
                                                            _jettag_c_get_218_181.doEnd();
                                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_iterate_218_251 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_218_251); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_iterate_218_251.setRuntimeParent(_jettag_c_if_217_5);
                                                            _jettag_c_iterate_218_251.setTagInfo(_td_c_iterate_218_251);
                                                            _jettag_c_iterate_218_251.doStart(context, out);
                                                            while (_jettag_c_iterate_218_251.okToProcessBody()) {
                                                                out.write("related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_218_315 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_315); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_218_315.setRuntimeParent(_jettag_c_iterate_218_251);
                                                                _jettag_c_get_218_315.setTagInfo(_td_c_get_218_315);
                                                                _jettag_c_get_218_315.doStart(context, out);
                                                                _jettag_c_get_218_315.doEnd();
                                                                out.write("s.get");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_218_361 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_361); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_218_361.setRuntimeParent(_jettag_c_iterate_218_251);
                                                                _jettag_c_get_218_361.setTagInfo(_td_c_get_218_361);
                                                                _jettag_c_get_218_361.doStart(context, out);
                                                                _jettag_c_get_218_361.doEnd();
                                                                out.write("Field()");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_setVariable_218_415 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_218_415); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_setVariable_218_415.setRuntimeParent(_jettag_c_iterate_218_251);
                                                                _jettag_c_setVariable_218_415.setTagInfo(_td_c_setVariable_218_415);
                                                                _jettag_c_setVariable_218_415.doStart(context, out);
                                                                _jettag_c_setVariable_218_415.doEnd();
                                                                RuntimeTagElement _jettag_c_if_218_468 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_218_468); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_if_218_468.setRuntimeParent(_jettag_c_iterate_218_251);
                                                                _jettag_c_if_218_468.setTagInfo(_td_c_if_218_468);
                                                                _jettag_c_if_218_468.doStart(context, out);
                                                                while (_jettag_c_if_218_468.okToProcessBody()) {
                                                                    out.write(",");  //$NON-NLS-1$        
                                                                    _jettag_c_if_218_468.handleBodyContent(out);
                                                                }
                                                                _jettag_c_if_218_468.doEnd();
                                                                _jettag_c_iterate_218_251.handleBodyContent(out);
                                                            }
                                                            _jettag_c_iterate_218_251.doEnd();
                                                            out.write(");");  //$NON-NLS-1$        
                                                            out.write(NL);         
                                                            _jettag_c_if_217_5.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_217_5.doEnd();
                                                        _jettag_c_if_209_5.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_209_5.doEnd();
                                                    _jettag_c_iterate_208_5.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_208_5.doEnd();
                                                out.write("\t\t\t\tif (existing");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_222_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_17); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_222_17.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_222_17.setTagInfo(_td_c_get_222_17);
                                                _jettag_c_get_222_17.doStart(context, out);
                                                _jettag_c_get_222_17.doEnd();
                                                out.write("s != null) {");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_iterate_223_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_223_6); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_223_6.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_iterate_223_6.setTagInfo(_td_c_iterate_223_6);
                                                _jettag_c_iterate_223_6.doStart(context, out);
                                                while (_jettag_c_iterate_223_6.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_224_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_224_6); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_224_6.setRuntimeParent(_jettag_c_iterate_223_6);
                                                    _jettag_c_if_224_6.setTagInfo(_td_c_if_224_6);
                                                    _jettag_c_if_224_6.doStart(context, out);
                                                    while (_jettag_c_if_224_6.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_iterate_225_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_225_6); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_225_6.setRuntimeParent(_jettag_c_if_224_6);
                                                        _jettag_c_iterate_225_6.setTagInfo(_td_c_iterate_225_6);
                                                        _jettag_c_iterate_225_6.doStart(context, out);
                                                        while (_jettag_c_iterate_225_6.okToProcessBody()) {
                                                            out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_226_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_14); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_226_14.setRuntimeParent(_jettag_c_iterate_225_6);
                                                            _jettag_c_get_226_14.setTagInfo(_td_c_get_226_14);
                                                            _jettag_c_get_226_14.doStart(context, out);
                                                            _jettag_c_get_226_14.doEnd();
                                                            out.write("s.set");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_226_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_76); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_226_76.setRuntimeParent(_jettag_c_iterate_225_6);
                                                            _jettag_c_get_226_76.setTagInfo(_td_c_get_226_76);
                                                            _jettag_c_get_226_76.doStart(context, out);
                                                            _jettag_c_get_226_76.doEnd();
                                                            out.write("(related_");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_226_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_136); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_226_136.setRuntimeParent(_jettag_c_iterate_225_6);
                                                            _jettag_c_get_226_136.setTagInfo(_td_c_get_226_136);
                                                            _jettag_c_get_226_136.doStart(context, out);
                                                            _jettag_c_get_226_136.doEnd();
                                                            out.write("s.get");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_226_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_226_182); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_226_182.setRuntimeParent(_jettag_c_iterate_225_6);
                                                            _jettag_c_get_226_182.setTagInfo(_td_c_get_226_182);
                                                            _jettag_c_get_226_182.doStart(context, out);
                                                            _jettag_c_get_226_182.doEnd();
                                                            out.write("());");  //$NON-NLS-1$        
                                                            out.write(NL);         
                                                            _jettag_c_iterate_225_6.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_225_6.doEnd();
                                                        RuntimeTagElement _jettag_c_iterate_228_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_228_6); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_228_6.setRuntimeParent(_jettag_c_if_224_6);
                                                        _jettag_c_iterate_228_6.setTagInfo(_td_c_iterate_228_6);
                                                        _jettag_c_iterate_228_6.doStart(context, out);
                                                        while (_jettag_c_iterate_228_6.okToProcessBody()) {
                                                            out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_229_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_14); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_229_14.setRuntimeParent(_jettag_c_iterate_228_6);
                                                            _jettag_c_get_229_14.setTagInfo(_td_c_get_229_14);
                                                            _jettag_c_get_229_14.doStart(context, out);
                                                            _jettag_c_get_229_14.doEnd();
                                                            out.write("s.set");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_229_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_76); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_229_76.setRuntimeParent(_jettag_c_iterate_228_6);
                                                            _jettag_c_get_229_76.setTagInfo(_td_c_get_229_76);
                                                            _jettag_c_get_229_76.doStart(context, out);
                                                            _jettag_c_get_229_76.doEnd();
                                                            out.write("(related_");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_229_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_135); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_229_135.setRuntimeParent(_jettag_c_iterate_228_6);
                                                            _jettag_c_get_229_135.setTagInfo(_td_c_get_229_135);
                                                            _jettag_c_get_229_135.doStart(context, out);
                                                            _jettag_c_get_229_135.doEnd();
                                                            out.write("s.get");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_229_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_229_181); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_229_181.setRuntimeParent(_jettag_c_iterate_228_6);
                                                            _jettag_c_get_229_181.setTagInfo(_td_c_get_229_181);
                                                            _jettag_c_get_229_181.doStart(context, out);
                                                            _jettag_c_get_229_181.doEnd();
                                                            out.write("());");  //$NON-NLS-1$        
                                                            out.write(NL);         
                                                            _jettag_c_iterate_228_6.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_228_6.doEnd();
                                                        _jettag_c_if_224_6.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_224_6.doEnd();
                                                    _jettag_c_iterate_223_6.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_223_6.doEnd();
                                                out.write("\t\t\t\t\trelated_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_233_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_14); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_233_14.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_233_14.setTagInfo(_td_c_get_233_14);
                                                _jettag_c_get_233_14.doStart(context, out);
                                                _jettag_c_get_233_14.doEnd();
                                                out.write("s = existing");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_233_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_233_67); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_233_67.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_233_67.setTagInfo(_td_c_get_233_67);
                                                _jettag_c_get_233_67.doStart(context, out);
                                                _jettag_c_get_233_67.doEnd();
                                                out.write("s;");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_234_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_234_36); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_234_36.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_234_36.setTagInfo(_td_c_get_234_36);
                                                _jettag_c_get_234_36.doStart(context, out);
                                                _jettag_c_get_234_36.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_236_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_236_36); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_236_36.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_236_36.setTagInfo(_td_c_get_236_36);
                                                _jettag_c_get_236_36.doStart(context, out);
                                                _jettag_c_get_236_36.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_237_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_6); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_237_6.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_237_6.setTagInfo(_td_c_get_237_6);
                                                _jettag_c_get_237_6.doStart(context, out);
                                                _jettag_c_get_237_6.doEnd();
                                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write(NL);         
                                                out.write("\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_240_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_240_27); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_240_27.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_240_27.setTagInfo(_td_c_get_240_27);
                                                _jettag_c_get_240_27.doStart(context, out);
                                                _jettag_c_get_240_27.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_241_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_241_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_241_5.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_241_5.setTagInfo(_td_c_get_241_5);
                                                _jettag_c_get_241_5.doStart(context, out);
                                                _jettag_c_get_241_5.doEnd();
                                                out.write(".get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_241_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_241_43); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_241_43.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_241_43.setTagInfo(_td_c_get_241_43);
                                                _jettag_c_get_241_43.doStart(context, out);
                                                _jettag_c_get_241_43.doEnd();
                                                out.write("s().add(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_241_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_241_116); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_241_116.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_241_116.setTagInfo(_td_c_get_241_116);
                                                _jettag_c_get_241_116.doStart(context, out);
                                                _jettag_c_get_241_116.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_242_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_242_35); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_242_35.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_242_35.setTagInfo(_td_c_get_242_35);
                                                _jettag_c_get_242_35.doStart(context, out);
                                                _jettag_c_get_242_35.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_243_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_243_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_243_5.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_243_5.setTagInfo(_td_c_get_243_5);
                                                _jettag_c_get_243_5.doStart(context, out);
                                                _jettag_c_get_243_5.doEnd();
                                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write(NL);         
                                                out.write("\t\t\t\treturn ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_245_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_12); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_245_12.setRuntimeParent(_jettag_c_otherwise_198_4);
                                                _jettag_c_get_245_12.setTagInfo(_td_c_get_245_12);
                                                _jettag_c_get_245_12.doStart(context, out);
                                                _jettag_c_get_245_12.doEnd();
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_198_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_198_4_saved_out;
                                            _jettag_c_otherwise_198_4.doEnd();
                                            _jettag_c_choose_195_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_195_4_saved_out;
                                        _jettag_c_choose_195_4.doEnd();
                                        _jettag_c_iterate_194_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_194_4.doEnd();
                                    _jettag_c_if_193_4.handleBodyContent(out);
                                }
                                _jettag_c_if_193_4.doEnd();
                                RuntimeTagElement _jettag_c_if_251_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_251_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_251_4.setRuntimeParent(_jettag_c_if_192_4);
                                _jettag_c_if_251_4.setTagInfo(_td_c_if_251_4);
                                _jettag_c_if_251_4.doStart(context, out);
                                while (_jettag_c_if_251_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_252_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_252_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_252_4.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_setVariable_252_4.setTagInfo(_td_c_setVariable_252_4);
                                    _jettag_c_setVariable_252_4.doStart(context, out);
                                    _jettag_c_setVariable_252_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_253_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_253_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_253_4.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_iterate_253_4.setTagInfo(_td_c_iterate_253_4);
                                    _jettag_c_iterate_253_4.doStart(context, out);
                                    while (_jettag_c_iterate_253_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_254_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_254_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_254_4.setRuntimeParent(_jettag_c_iterate_253_4);
                                        _jettag_c_setVariable_254_4.setTagInfo(_td_c_setVariable_254_4);
                                        _jettag_c_setVariable_254_4.doStart(context, out);
                                        _jettag_c_setVariable_254_4.doEnd();
                                        _jettag_c_iterate_253_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_253_4.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_256_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_256_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_256_4.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_setVariable_256_4.setTagInfo(_td_c_setVariable_256_4);
                                    _jettag_c_setVariable_256_4.doStart(context, out);
                                    _jettag_c_setVariable_256_4.doEnd();
                                    out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_258_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_11); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_258_11.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_258_11.setTagInfo(_td_c_get_258_11);
                                    _jettag_c_get_258_11.doStart(context, out);
                                    _jettag_c_get_258_11.doEnd();
                                    out.write(" save");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_258_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_66); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_258_66.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_258_66.setTagInfo(_td_c_get_258_66);
                                    _jettag_c_get_258_66.doStart(context, out);
                                    _jettag_c_get_258_66.doEnd();
                                    RuntimeTagElement _jettag_c_get_258_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_258_116.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_258_116.setTagInfo(_td_c_get_258_116);
                                    _jettag_c_get_258_116.doStart(context, out);
                                    _jettag_c_get_258_116.doEnd();
                                    out.write("s(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_258_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_258_169); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_258_169.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_iterate_258_169.setTagInfo(_td_c_iterate_258_169);
                                    _jettag_c_iterate_258_169.doStart(context, out);
                                    while (_jettag_c_iterate_258_169.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_258_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_236); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_258_236.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_if_258_236.setTagInfo(_td_c_if_258_236);
                                        _jettag_c_if_258_236.doStart(context, out);
                                        while (_jettag_c_if_258_236.okToProcessBody()) {
                                            out.write("String ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_258_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_479); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_258_479.setRuntimeParent(_jettag_c_if_258_236);
                                            _jettag_c_get_258_479.setTagInfo(_td_c_get_258_479);
                                            _jettag_c_get_258_479.doStart(context, out);
                                            _jettag_c_get_258_479.doEnd();
                                            _jettag_c_if_258_236.handleBodyContent(out);
                                        }
                                        _jettag_c_if_258_236.doEnd();
                                        RuntimeTagElement _jettag_c_if_258_521 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_521); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_258_521.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_if_258_521.setTagInfo(_td_c_if_258_521);
                                        _jettag_c_if_258_521.doStart(context, out);
                                        while (_jettag_c_if_258_521.okToProcessBody()) {
                                            out.write("Integer ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_258_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_684); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_258_684.setRuntimeParent(_jettag_c_if_258_521);
                                            _jettag_c_get_258_684.setTagInfo(_td_c_get_258_684);
                                            _jettag_c_get_258_684.doStart(context, out);
                                            _jettag_c_get_258_684.doEnd();
                                            _jettag_c_if_258_521.handleBodyContent(out);
                                        }
                                        _jettag_c_if_258_521.doEnd();
                                        RuntimeTagElement _jettag_c_if_258_726 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_726); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_258_726.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_if_258_726.setTagInfo(_td_c_if_258_726);
                                        _jettag_c_if_258_726.doStart(context, out);
                                        while (_jettag_c_if_258_726.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_258_877 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_258_877); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_258_877.setRuntimeParent(_jettag_c_if_258_726);
                                            _jettag_java_import_258_877.setTagInfo(_td_java_import_258_877);
                                            _jettag_java_import_258_877.doStart(context, out);
                                            JET2Writer _jettag_java_import_258_877_saved_out = out;
                                            while (_jettag_java_import_258_877.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_258_877.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_258_877_saved_out;
                                            _jettag_java_import_258_877.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_258_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_919); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_258_919.setRuntimeParent(_jettag_c_if_258_726);
                                            _jettag_c_get_258_919.setTagInfo(_td_c_get_258_919);
                                            _jettag_c_get_258_919.doStart(context, out);
                                            _jettag_c_get_258_919.doEnd();
                                            _jettag_c_if_258_726.handleBodyContent(out);
                                        }
                                        _jettag_c_if_258_726.doEnd();
                                        RuntimeTagElement _jettag_c_if_258_961 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_961); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_258_961.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_if_258_961.setTagInfo(_td_c_if_258_961);
                                        _jettag_c_if_258_961.doStart(context, out);
                                        while (_jettag_c_if_258_961.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_258_1112 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_258_1112); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_258_1112.setRuntimeParent(_jettag_c_if_258_961);
                                            _jettag_java_import_258_1112.setTagInfo(_td_java_import_258_1112);
                                            _jettag_java_import_258_1112.doStart(context, out);
                                            JET2Writer _jettag_java_import_258_1112_saved_out = out;
                                            while (_jettag_java_import_258_1112.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_258_1112.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_258_1112_saved_out;
                                            _jettag_java_import_258_1112.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_258_1160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_1160); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_258_1160.setRuntimeParent(_jettag_c_if_258_961);
                                            _jettag_c_get_258_1160.setTagInfo(_td_c_get_258_1160);
                                            _jettag_c_get_258_1160.doStart(context, out);
                                            _jettag_c_get_258_1160.doEnd();
                                            _jettag_c_if_258_961.handleBodyContent(out);
                                        }
                                        _jettag_c_if_258_961.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_258_1202 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_258_1202); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_258_1202.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_setVariable_258_1202.setTagInfo(_td_c_setVariable_258_1202);
                                        _jettag_c_setVariable_258_1202.doStart(context, out);
                                        _jettag_c_setVariable_258_1202.doEnd();
                                        RuntimeTagElement _jettag_c_if_258_1251 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_258_1251); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_258_1251.setRuntimeParent(_jettag_c_iterate_258_169);
                                        _jettag_c_if_258_1251.setTagInfo(_td_c_if_258_1251);
                                        _jettag_c_if_258_1251.doStart(context, out);
                                        while (_jettag_c_if_258_1251.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_258_1251.handleBodyContent(out);
                                        }
                                        _jettag_c_if_258_1251.doEnd();
                                        _jettag_c_iterate_258_169.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_258_169.doEnd();
                                    out.write(", ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_258_1295 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_1295); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_258_1295.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_258_1295.setTagInfo(_td_c_get_258_1295);
                                    _jettag_c_get_258_1295.doStart(context, out);
                                    _jettag_c_get_258_1295.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_258_1355 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_258_1355); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_258_1355.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_258_1355.setTagInfo(_td_c_get_258_1355);
                                    _jettag_c_get_258_1355.doStart(context, out);
                                    _jettag_c_get_258_1355.doEnd();
                                    out.write("s){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_setVariable_259_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_259_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_259_5.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_setVariable_259_5.setTagInfo(_td_c_setVariable_259_5);
                                    _jettag_c_setVariable_259_5.doStart(context, out);
                                    _jettag_c_setVariable_259_5.doEnd();
                                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_260_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_260_5.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_260_5.setTagInfo(_td_c_get_260_5);
                                    _jettag_c_get_260_5.doStart(context, out);
                                    _jettag_c_get_260_5.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_260_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_56); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_260_56.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_260_56.setTagInfo(_td_c_get_260_56);
                                    _jettag_c_get_260_56.doStart(context, out);
                                    _jettag_c_get_260_56.doEnd();
                                    out.write(" = ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_260_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_93); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_260_93.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_260_93.setTagInfo(_td_c_get_260_93);
                                    _jettag_c_get_260_93.doStart(context, out);
                                    _jettag_c_get_260_93.doEnd();
                                    out.write("DAO.find");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_260_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_135); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_260_135.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_260_135.setTagInfo(_td_c_get_260_135);
                                    _jettag_c_get_260_135.doStart(context, out);
                                    _jettag_c_get_260_135.doEnd();
                                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_260_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_260_198); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_260_198.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_iterate_260_198.setTagInfo(_td_c_iterate_260_198);
                                    _jettag_c_iterate_260_198.doStart(context, out);
                                    while (_jettag_c_iterate_260_198.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_get_260_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_260_265); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_260_265.setRuntimeParent(_jettag_c_iterate_260_198);
                                        _jettag_c_get_260_265.setTagInfo(_td_c_get_260_265);
                                        _jettag_c_get_260_265.doStart(context, out);
                                        _jettag_c_get_260_265.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_260_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_260_300); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_260_300.setRuntimeParent(_jettag_c_iterate_260_198);
                                        _jettag_c_setVariable_260_300.setTagInfo(_td_c_setVariable_260_300);
                                        _jettag_c_setVariable_260_300.doStart(context, out);
                                        _jettag_c_setVariable_260_300.doEnd();
                                        RuntimeTagElement _jettag_c_if_260_349 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_260_349); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_260_349.setRuntimeParent(_jettag_c_iterate_260_198);
                                        _jettag_c_if_260_349.setTagInfo(_td_c_if_260_349);
                                        _jettag_c_if_260_349.doStart(context, out);
                                        while (_jettag_c_if_260_349.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_260_349.handleBodyContent(out);
                                        }
                                        _jettag_c_if_260_349.doEnd();
                                        _jettag_c_iterate_260_198.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_260_198.doEnd();
                                    out.write(", -1, -1);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_iterate_261_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_261_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_261_5.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_iterate_261_5.setTagInfo(_td_c_iterate_261_5);
                                    _jettag_c_iterate_261_5.doStart(context, out);
                                    while (_jettag_c_iterate_261_5.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_262_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_262_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_262_5.setRuntimeParent(_jettag_c_iterate_261_5);
                                        _jettag_c_if_262_5.setTagInfo(_td_c_if_262_5);
                                        _jettag_c_if_262_5.doStart(context, out);
                                        while (_jettag_c_if_262_5.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_263_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_263_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_263_5.setRuntimeParent(_jettag_c_if_262_5);
                                            _jettag_c_setVariable_263_5.setTagInfo(_td_c_setVariable_263_5);
                                            _jettag_c_setVariable_263_5.doStart(context, out);
                                            _jettag_c_setVariable_263_5.doEnd();
                                            RuntimeTagElement _jettag_c_iterate_264_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_264_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_264_5.setRuntimeParent(_jettag_c_if_262_5);
                                            _jettag_c_iterate_264_5.setTagInfo(_td_c_iterate_264_5);
                                            _jettag_c_iterate_264_5.doStart(context, out);
                                            while (_jettag_c_iterate_264_5.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_setVariable_265_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_265_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_265_5.setRuntimeParent(_jettag_c_iterate_264_5);
                                                _jettag_c_setVariable_265_5.setTagInfo(_td_c_setVariable_265_5);
                                                _jettag_c_setVariable_265_5.doStart(context, out);
                                                _jettag_c_setVariable_265_5.doEnd();
                                                _jettag_c_iterate_264_5.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_264_5.doEnd();
                                            RuntimeTagElement _jettag_c_if_267_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_267_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_267_5.setRuntimeParent(_jettag_c_if_262_5);
                                            _jettag_c_if_267_5.setTagInfo(_td_c_if_267_5);
                                            _jettag_c_if_267_5.doStart(context, out);
                                            while (_jettag_c_if_267_5.okToProcessBody()) {
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_268_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_268_5.setRuntimeParent(_jettag_c_if_267_5);
                                                _jettag_c_get_268_5.setTagInfo(_td_c_get_268_5);
                                                _jettag_c_get_268_5.doStart(context, out);
                                                _jettag_c_get_268_5.doEnd();
                                                out.write(" existing");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_268_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_65); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_268_65.setRuntimeParent(_jettag_c_if_267_5);
                                                _jettag_c_get_268_65.setTagInfo(_td_c_get_268_65);
                                                _jettag_c_get_268_65.doStart(context, out);
                                                _jettag_c_get_268_65.doEnd();
                                                out.write("s = ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_268_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_120); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_268_120.setRuntimeParent(_jettag_c_if_267_5);
                                                _jettag_c_get_268_120.setTagInfo(_td_c_get_268_120);
                                                _jettag_c_get_268_120.doStart(context, out);
                                                _jettag_c_get_268_120.doEnd();
                                                out.write("DAO.find");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_268_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_163); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_268_163.setRuntimeParent(_jettag_c_if_267_5);
                                                _jettag_c_get_268_163.setTagInfo(_td_c_get_268_163);
                                                _jettag_c_get_268_163.doStart(context, out);
                                                _jettag_c_get_268_163.doEnd();
                                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_268_227 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_268_227); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_268_227.setRuntimeParent(_jettag_c_if_267_5);
                                                _jettag_c_iterate_268_227.setTagInfo(_td_c_iterate_268_227);
                                                _jettag_c_iterate_268_227.doStart(context, out);
                                                while (_jettag_c_iterate_268_227.okToProcessBody()) {
                                                    out.write("related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_268_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_291); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_268_291.setRuntimeParent(_jettag_c_iterate_268_227);
                                                    _jettag_c_get_268_291.setTagInfo(_td_c_get_268_291);
                                                    _jettag_c_get_268_291.doStart(context, out);
                                                    _jettag_c_get_268_291.doEnd();
                                                    out.write("s.get");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_268_331 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_268_331); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_268_331.setRuntimeParent(_jettag_c_iterate_268_227);
                                                    _jettag_c_get_268_331.setTagInfo(_td_c_get_268_331);
                                                    _jettag_c_get_268_331.doStart(context, out);
                                                    _jettag_c_get_268_331.doEnd();
                                                    out.write("()");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_setVariable_268_380 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_268_380); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_268_380.setRuntimeParent(_jettag_c_iterate_268_227);
                                                    _jettag_c_setVariable_268_380.setTagInfo(_td_c_setVariable_268_380);
                                                    _jettag_c_setVariable_268_380.doStart(context, out);
                                                    _jettag_c_setVariable_268_380.doEnd();
                                                    RuntimeTagElement _jettag_c_if_268_433 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_268_433); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_268_433.setRuntimeParent(_jettag_c_iterate_268_227);
                                                    _jettag_c_if_268_433.setTagInfo(_td_c_if_268_433);
                                                    _jettag_c_if_268_433.doStart(context, out);
                                                    while (_jettag_c_if_268_433.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_268_433.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_268_433.doEnd();
                                                    _jettag_c_iterate_268_227.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_268_227.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_267_5.handleBodyContent(out);
                                            }
                                            _jettag_c_if_267_5.doEnd();
                                            RuntimeTagElement _jettag_c_if_270_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_270_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_270_5.setRuntimeParent(_jettag_c_if_262_5);
                                            _jettag_c_if_270_5.setTagInfo(_td_c_if_270_5);
                                            _jettag_c_if_270_5.doStart(context, out);
                                            while (_jettag_c_if_270_5.okToProcessBody()) {
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_271_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_271_5.setRuntimeParent(_jettag_c_if_270_5);
                                                _jettag_c_get_271_5.setTagInfo(_td_c_get_271_5);
                                                _jettag_c_get_271_5.doStart(context, out);
                                                _jettag_c_get_271_5.doEnd();
                                                out.write(" existing");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_271_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_65); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_271_65.setRuntimeParent(_jettag_c_if_270_5);
                                                _jettag_c_get_271_65.setTagInfo(_td_c_get_271_65);
                                                _jettag_c_get_271_65.doStart(context, out);
                                                _jettag_c_get_271_65.doEnd();
                                                out.write("s = ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_271_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_120); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_271_120.setRuntimeParent(_jettag_c_if_270_5);
                                                _jettag_c_get_271_120.setTagInfo(_td_c_get_271_120);
                                                _jettag_c_get_271_120.doStart(context, out);
                                                _jettag_c_get_271_120.doEnd();
                                                out.write("DAO.find");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_271_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_163); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_271_163.setRuntimeParent(_jettag_c_if_270_5);
                                                _jettag_c_get_271_163.setTagInfo(_td_c_get_271_163);
                                                _jettag_c_get_271_163.doStart(context, out);
                                                _jettag_c_get_271_163.doEnd();
                                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_271_227 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_271_227); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_271_227.setRuntimeParent(_jettag_c_if_270_5);
                                                _jettag_c_iterate_271_227.setTagInfo(_td_c_iterate_271_227);
                                                _jettag_c_iterate_271_227.doStart(context, out);
                                                while (_jettag_c_iterate_271_227.okToProcessBody()) {
                                                    out.write("related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_271_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_291); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_271_291.setRuntimeParent(_jettag_c_iterate_271_227);
                                                    _jettag_c_get_271_291.setTagInfo(_td_c_get_271_291);
                                                    _jettag_c_get_271_291.doStart(context, out);
                                                    _jettag_c_get_271_291.doEnd();
                                                    out.write("s.get");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_271_331 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_271_331); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_271_331.setRuntimeParent(_jettag_c_iterate_271_227);
                                                    _jettag_c_get_271_331.setTagInfo(_td_c_get_271_331);
                                                    _jettag_c_get_271_331.doStart(context, out);
                                                    _jettag_c_get_271_331.doEnd();
                                                    out.write("Field()");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_setVariable_271_385 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_271_385); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_271_385.setRuntimeParent(_jettag_c_iterate_271_227);
                                                    _jettag_c_setVariable_271_385.setTagInfo(_td_c_setVariable_271_385);
                                                    _jettag_c_setVariable_271_385.doStart(context, out);
                                                    _jettag_c_setVariable_271_385.doEnd();
                                                    RuntimeTagElement _jettag_c_if_271_438 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_271_438); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_271_438.setRuntimeParent(_jettag_c_iterate_271_227);
                                                    _jettag_c_if_271_438.setTagInfo(_td_c_if_271_438);
                                                    _jettag_c_if_271_438.doStart(context, out);
                                                    while (_jettag_c_if_271_438.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_271_438.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_271_438.doEnd();
                                                    _jettag_c_iterate_271_227.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_271_227.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_270_5.handleBodyContent(out);
                                            }
                                            _jettag_c_if_270_5.doEnd();
                                            _jettag_c_if_262_5.handleBodyContent(out);
                                        }
                                        _jettag_c_if_262_5.doEnd();
                                        _jettag_c_iterate_261_5.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_261_5.doEnd();
                                    out.write("\t\t\t\tif (existing");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_275_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_275_17); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_275_17.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_275_17.setTagInfo(_td_c_get_275_17);
                                    _jettag_c_get_275_17.doStart(context, out);
                                    _jettag_c_get_275_17.doEnd();
                                    out.write("s != null) {");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_iterate_276_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_276_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_276_6.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_iterate_276_6.setTagInfo(_td_c_iterate_276_6);
                                    _jettag_c_iterate_276_6.doStart(context, out);
                                    while (_jettag_c_iterate_276_6.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_277_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_277_6); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_277_6.setRuntimeParent(_jettag_c_iterate_276_6);
                                        _jettag_c_if_277_6.setTagInfo(_td_c_if_277_6);
                                        _jettag_c_if_277_6.doStart(context, out);
                                        while (_jettag_c_if_277_6.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_iterate_278_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_278_6); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_278_6.setRuntimeParent(_jettag_c_if_277_6);
                                            _jettag_c_iterate_278_6.setTagInfo(_td_c_iterate_278_6);
                                            _jettag_c_iterate_278_6.doStart(context, out);
                                            while (_jettag_c_iterate_278_6.okToProcessBody()) {
                                                out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_279_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_14); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_279_14.setRuntimeParent(_jettag_c_iterate_278_6);
                                                _jettag_c_get_279_14.setTagInfo(_td_c_get_279_14);
                                                _jettag_c_get_279_14.doStart(context, out);
                                                _jettag_c_get_279_14.doEnd();
                                                out.write("s.set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_279_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_70); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_279_70.setRuntimeParent(_jettag_c_iterate_278_6);
                                                _jettag_c_get_279_70.setTagInfo(_td_c_get_279_70);
                                                _jettag_c_get_279_70.doStart(context, out);
                                                _jettag_c_get_279_70.doEnd();
                                                out.write("(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_279_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_130); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_279_130.setRuntimeParent(_jettag_c_iterate_278_6);
                                                _jettag_c_get_279_130.setTagInfo(_td_c_get_279_130);
                                                _jettag_c_get_279_130.doStart(context, out);
                                                _jettag_c_get_279_130.doEnd();
                                                out.write("s.get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_279_170 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_279_170); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_279_170.setRuntimeParent(_jettag_c_iterate_278_6);
                                                _jettag_c_get_279_170.setTagInfo(_td_c_get_279_170);
                                                _jettag_c_get_279_170.doStart(context, out);
                                                _jettag_c_get_279_170.doEnd();
                                                out.write("());");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_iterate_278_6.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_278_6.doEnd();
                                            RuntimeTagElement _jettag_c_iterate_281_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_281_6); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_281_6.setRuntimeParent(_jettag_c_if_277_6);
                                            _jettag_c_iterate_281_6.setTagInfo(_td_c_iterate_281_6);
                                            _jettag_c_iterate_281_6.doStart(context, out);
                                            while (_jettag_c_iterate_281_6.okToProcessBody()) {
                                                out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_282_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_282_14); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_282_14.setRuntimeParent(_jettag_c_iterate_281_6);
                                                _jettag_c_get_282_14.setTagInfo(_td_c_get_282_14);
                                                _jettag_c_get_282_14.doStart(context, out);
                                                _jettag_c_get_282_14.doEnd();
                                                out.write("s.set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_282_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_282_70); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_282_70.setRuntimeParent(_jettag_c_iterate_281_6);
                                                _jettag_c_get_282_70.setTagInfo(_td_c_get_282_70);
                                                _jettag_c_get_282_70.doStart(context, out);
                                                _jettag_c_get_282_70.doEnd();
                                                out.write("(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_282_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_282_129); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_282_129.setRuntimeParent(_jettag_c_iterate_281_6);
                                                _jettag_c_get_282_129.setTagInfo(_td_c_get_282_129);
                                                _jettag_c_get_282_129.doStart(context, out);
                                                _jettag_c_get_282_129.doEnd();
                                                out.write("s.get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_282_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_282_169); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_282_169.setRuntimeParent(_jettag_c_iterate_281_6);
                                                _jettag_c_get_282_169.setTagInfo(_td_c_get_282_169);
                                                _jettag_c_get_282_169.doStart(context, out);
                                                _jettag_c_get_282_169.doEnd();
                                                out.write("());");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_iterate_281_6.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_281_6.doEnd();
                                            _jettag_c_if_277_6.handleBodyContent(out);
                                        }
                                        _jettag_c_if_277_6.doEnd();
                                        _jettag_c_iterate_276_6.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_276_6.doEnd();
                                    out.write("\t\t\t\t\trelated_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_286_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_286_14); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_286_14.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_286_14.setTagInfo(_td_c_get_286_14);
                                    _jettag_c_get_286_14.doStart(context, out);
                                    _jettag_c_get_286_14.doEnd();
                                    out.write("s = existing");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_286_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_286_61); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_286_61.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_286_61.setTagInfo(_td_c_get_286_61);
                                    _jettag_c_get_286_61.doStart(context, out);
                                    _jettag_c_get_286_61.doEnd();
                                    out.write("s;");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_287_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_287_36); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_287_36.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_287_36.setTagInfo(_td_c_get_287_36);
                                    _jettag_c_get_287_36.doStart(context, out);
                                    _jettag_c_get_287_36.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_289_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_289_36); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_289_36.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_289_36.setTagInfo(_td_c_get_289_36);
                                    _jettag_c_get_289_36.doStart(context, out);
                                    _jettag_c_get_289_36.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_290_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_290_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_290_6.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_290_6.setTagInfo(_td_c_get_290_6);
                                    _jettag_c_get_290_6.doStart(context, out);
                                    _jettag_c_get_290_6.doEnd();
                                    out.write("DAO.flush();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_292_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_292_28); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_292_28.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_292_28.setTagInfo(_td_c_get_292_28);
                                    _jettag_c_get_292_28.doStart(context, out);
                                    _jettag_c_get_292_28.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\trelated_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_293_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_293_14); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_293_14.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_293_14.setTagInfo(_td_c_get_293_14);
                                    _jettag_c_get_293_14.doStart(context, out);
                                    _jettag_c_get_293_14.doEnd();
                                    out.write("s.set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_293_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_293_54); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_293_54.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_293_54.setTagInfo(_td_c_get_293_54);
                                    _jettag_c_get_293_54.doStart(context, out);
                                    _jettag_c_get_293_54.doEnd();
                                    out.write("(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_293_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_293_105); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_293_105.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_293_105.setTagInfo(_td_c_get_293_105);
                                    _jettag_c_get_293_105.doStart(context, out);
                                    _jettag_c_get_293_105.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_294_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_294_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_294_6.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_294_6.setTagInfo(_td_c_get_294_6);
                                    _jettag_c_get_294_6.doStart(context, out);
                                    _jettag_c_get_294_6.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_294_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_294_44); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_294_44.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_294_44.setTagInfo(_td_c_get_294_44);
                                    _jettag_c_get_294_44.doStart(context, out);
                                    _jettag_c_get_294_44.doEnd();
                                    out.write("s().add(related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_294_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_294_111); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_294_111.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_294_111.setTagInfo(_td_c_get_294_111);
                                    _jettag_c_get_294_111.doStart(context, out);
                                    _jettag_c_get_294_111.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_295_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_295_28); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_295_28.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_295_28.setTagInfo(_td_c_get_295_28);
                                    _jettag_c_get_295_28.doStart(context, out);
                                    _jettag_c_get_295_28.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_296_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_296_36); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_296_36.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_296_36.setTagInfo(_td_c_get_296_36);
                                    _jettag_c_get_296_36.doStart(context, out);
                                    _jettag_c_get_296_36.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_297_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_297_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_297_6.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_297_6.setTagInfo(_td_c_get_297_6);
                                    _jettag_c_get_297_6.doStart(context, out);
                                    _jettag_c_get_297_6.doEnd();
                                    out.write("DAO.flush();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write(NL);         
                                    out.write("\t\t\t\t\treturn ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_299_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_299_13); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_299_13.setRuntimeParent(_jettag_c_if_251_4);
                                    _jettag_c_get_299_13.setTagInfo(_td_c_get_299_13);
                                    _jettag_c_get_299_13.doStart(context, out);
                                    _jettag_c_get_299_13.doEnd();
                                    out.write(";");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_251_4.handleBodyContent(out);
                                }
                                _jettag_c_if_251_4.doEnd();
                                _jettag_c_if_192_4.handleBodyContent(out);
                            }
                            _jettag_c_if_192_4.doEnd();
                            RuntimeTagElement _jettag_c_if_303_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_303_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_303_4.setRuntimeParent(_jettag_c_if_183_3);
                            _jettag_c_if_303_4.setTagInfo(_td_c_if_303_4);
                            _jettag_c_if_303_4.doStart(context, out);
                            while (_jettag_c_if_303_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_304_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_304_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_304_4.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_setVariable_304_4.setTagInfo(_td_c_setVariable_304_4);
                                _jettag_c_setVariable_304_4.doStart(context, out);
                                _jettag_c_setVariable_304_4.doEnd();
                                RuntimeTagElement _jettag_c_iterate_305_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_305_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_305_4.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_iterate_305_4.setTagInfo(_td_c_iterate_305_4);
                                _jettag_c_iterate_305_4.doStart(context, out);
                                while (_jettag_c_iterate_305_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_306_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_306_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_306_4.setRuntimeParent(_jettag_c_iterate_305_4);
                                    _jettag_c_setVariable_306_4.setTagInfo(_td_c_setVariable_306_4);
                                    _jettag_c_setVariable_306_4.doStart(context, out);
                                    _jettag_c_setVariable_306_4.doEnd();
                                    _jettag_c_iterate_305_4.handleBodyContent(out);
                                }
                                _jettag_c_iterate_305_4.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_308_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_308_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_308_4.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_setVariable_308_4.setTagInfo(_td_c_setVariable_308_4);
                                _jettag_c_setVariable_308_4.doStart(context, out);
                                _jettag_c_setVariable_308_4.doEnd();
                                out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_310_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_11); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_310_11.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_310_11.setTagInfo(_td_c_get_310_11);
                                _jettag_c_get_310_11.doStart(context, out);
                                _jettag_c_get_310_11.doEnd();
                                out.write(" save");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_310_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_66); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_310_66.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_310_66.setTagInfo(_td_c_get_310_66);
                                _jettag_c_get_310_66.doStart(context, out);
                                _jettag_c_get_310_66.doEnd();
                                RuntimeTagElement _jettag_c_get_310_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_116); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_310_116.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_310_116.setTagInfo(_td_c_get_310_116);
                                _jettag_c_get_310_116.doStart(context, out);
                                _jettag_c_get_310_116.doEnd();
                                out.write("s(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_310_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_310_169); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_310_169.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_iterate_310_169.setTagInfo(_td_c_iterate_310_169);
                                _jettag_c_iterate_310_169.doStart(context, out);
                                while (_jettag_c_iterate_310_169.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_310_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_310_236); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_310_236.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_if_310_236.setTagInfo(_td_c_if_310_236);
                                    _jettag_c_if_310_236.doStart(context, out);
                                    while (_jettag_c_if_310_236.okToProcessBody()) {
                                        out.write("String ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_310_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_479); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_310_479.setRuntimeParent(_jettag_c_if_310_236);
                                        _jettag_c_get_310_479.setTagInfo(_td_c_get_310_479);
                                        _jettag_c_get_310_479.doStart(context, out);
                                        _jettag_c_get_310_479.doEnd();
                                        _jettag_c_if_310_236.handleBodyContent(out);
                                    }
                                    _jettag_c_if_310_236.doEnd();
                                    RuntimeTagElement _jettag_c_if_310_521 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_310_521); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_310_521.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_if_310_521.setTagInfo(_td_c_if_310_521);
                                    _jettag_c_if_310_521.doStart(context, out);
                                    while (_jettag_c_if_310_521.okToProcessBody()) {
                                        out.write("Integer ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_310_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_684); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_310_684.setRuntimeParent(_jettag_c_if_310_521);
                                        _jettag_c_get_310_684.setTagInfo(_td_c_get_310_684);
                                        _jettag_c_get_310_684.doStart(context, out);
                                        _jettag_c_get_310_684.doEnd();
                                        _jettag_c_if_310_521.handleBodyContent(out);
                                    }
                                    _jettag_c_if_310_521.doEnd();
                                    RuntimeTagElement _jettag_c_if_310_726 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_310_726); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_310_726.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_if_310_726.setTagInfo(_td_c_if_310_726);
                                    _jettag_c_if_310_726.doStart(context, out);
                                    while (_jettag_c_if_310_726.okToProcessBody()) {
                                        RuntimeTagElement _jettag_java_import_310_877 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_310_877); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_java_import_310_877.setRuntimeParent(_jettag_c_if_310_726);
                                        _jettag_java_import_310_877.setTagInfo(_td_java_import_310_877);
                                        _jettag_java_import_310_877.doStart(context, out);
                                        JET2Writer _jettag_java_import_310_877_saved_out = out;
                                        while (_jettag_java_import_310_877.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            out.write("java.util.Date");  //$NON-NLS-1$        
                                            _jettag_java_import_310_877.handleBodyContent(out);
                                        }
                                        out = _jettag_java_import_310_877_saved_out;
                                        _jettag_java_import_310_877.doEnd();
                                        out.write(" ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_310_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_919); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_310_919.setRuntimeParent(_jettag_c_if_310_726);
                                        _jettag_c_get_310_919.setTagInfo(_td_c_get_310_919);
                                        _jettag_c_get_310_919.doStart(context, out);
                                        _jettag_c_get_310_919.doEnd();
                                        _jettag_c_if_310_726.handleBodyContent(out);
                                    }
                                    _jettag_c_if_310_726.doEnd();
                                    RuntimeTagElement _jettag_c_if_310_961 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_310_961); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_310_961.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_if_310_961.setTagInfo(_td_c_if_310_961);
                                    _jettag_c_if_310_961.doStart(context, out);
                                    while (_jettag_c_if_310_961.okToProcessBody()) {
                                        RuntimeTagElement _jettag_java_import_310_1112 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_310_1112); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_java_import_310_1112.setRuntimeParent(_jettag_c_if_310_961);
                                        _jettag_java_import_310_1112.setTagInfo(_td_java_import_310_1112);
                                        _jettag_java_import_310_1112.doStart(context, out);
                                        JET2Writer _jettag_java_import_310_1112_saved_out = out;
                                        while (_jettag_java_import_310_1112.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                            _jettag_java_import_310_1112.handleBodyContent(out);
                                        }
                                        out = _jettag_java_import_310_1112_saved_out;
                                        _jettag_java_import_310_1112.doEnd();
                                        out.write(" ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_310_1160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_1160); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_310_1160.setRuntimeParent(_jettag_c_if_310_961);
                                        _jettag_c_get_310_1160.setTagInfo(_td_c_get_310_1160);
                                        _jettag_c_get_310_1160.doStart(context, out);
                                        _jettag_c_get_310_1160.doEnd();
                                        _jettag_c_if_310_961.handleBodyContent(out);
                                    }
                                    _jettag_c_if_310_961.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_310_1202 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_310_1202); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_310_1202.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_setVariable_310_1202.setTagInfo(_td_c_setVariable_310_1202);
                                    _jettag_c_setVariable_310_1202.doStart(context, out);
                                    _jettag_c_setVariable_310_1202.doEnd();
                                    RuntimeTagElement _jettag_c_if_310_1251 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_310_1251); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_310_1251.setRuntimeParent(_jettag_c_iterate_310_169);
                                    _jettag_c_if_310_1251.setTagInfo(_td_c_if_310_1251);
                                    _jettag_c_if_310_1251.doStart(context, out);
                                    while (_jettag_c_if_310_1251.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_310_1251.handleBodyContent(out);
                                    }
                                    _jettag_c_if_310_1251.doEnd();
                                    _jettag_c_iterate_310_169.handleBodyContent(out);
                                }
                                _jettag_c_iterate_310_169.doEnd();
                                out.write(", ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_310_1295 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_1295); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_310_1295.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_310_1295.setTagInfo(_td_c_get_310_1295);
                                _jettag_c_get_310_1295.doStart(context, out);
                                _jettag_c_get_310_1295.doEnd();
                                out.write(" related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_310_1355 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_310_1355); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_310_1355.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_310_1355.setTagInfo(_td_c_get_310_1355);
                                _jettag_c_get_310_1355.doStart(context, out);
                                _jettag_c_get_310_1355.doEnd();
                                out.write("s){");  //$NON-NLS-1$        
                                out.write(NL);         
                                RuntimeTagElement _jettag_c_setVariable_311_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_311_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_311_5.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_setVariable_311_5.setTagInfo(_td_c_setVariable_311_5);
                                _jettag_c_setVariable_311_5.doStart(context, out);
                                _jettag_c_setVariable_311_5.doEnd();
                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_312_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_312_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_312_5.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_312_5.setTagInfo(_td_c_get_312_5);
                                _jettag_c_get_312_5.doStart(context, out);
                                _jettag_c_get_312_5.doEnd();
                                out.write(" ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_312_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_312_56); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_312_56.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_312_56.setTagInfo(_td_c_get_312_56);
                                _jettag_c_get_312_56.doStart(context, out);
                                _jettag_c_get_312_56.doEnd();
                                out.write(" = ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_312_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_312_93); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_312_93.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_312_93.setTagInfo(_td_c_get_312_93);
                                _jettag_c_get_312_93.doStart(context, out);
                                _jettag_c_get_312_93.doEnd();
                                out.write("DAO.find");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_312_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_312_135); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_312_135.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_312_135.setTagInfo(_td_c_get_312_135);
                                _jettag_c_get_312_135.doStart(context, out);
                                _jettag_c_get_312_135.doEnd();
                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_312_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_312_198); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_312_198.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_iterate_312_198.setTagInfo(_td_c_iterate_312_198);
                                _jettag_c_iterate_312_198.doStart(context, out);
                                while (_jettag_c_iterate_312_198.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_get_312_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_312_265); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_312_265.setRuntimeParent(_jettag_c_iterate_312_198);
                                    _jettag_c_get_312_265.setTagInfo(_td_c_get_312_265);
                                    _jettag_c_get_312_265.doStart(context, out);
                                    _jettag_c_get_312_265.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_312_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_312_300); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_312_300.setRuntimeParent(_jettag_c_iterate_312_198);
                                    _jettag_c_setVariable_312_300.setTagInfo(_td_c_setVariable_312_300);
                                    _jettag_c_setVariable_312_300.doStart(context, out);
                                    _jettag_c_setVariable_312_300.doEnd();
                                    RuntimeTagElement _jettag_c_if_312_349 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_312_349); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_312_349.setRuntimeParent(_jettag_c_iterate_312_198);
                                    _jettag_c_if_312_349.setTagInfo(_td_c_if_312_349);
                                    _jettag_c_if_312_349.doStart(context, out);
                                    while (_jettag_c_if_312_349.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_312_349.handleBodyContent(out);
                                    }
                                    _jettag_c_if_312_349.doEnd();
                                    _jettag_c_iterate_312_198.handleBodyContent(out);
                                }
                                _jettag_c_iterate_312_198.doEnd();
                                out.write(", -1, -1);");  //$NON-NLS-1$        
                                out.write(NL);         
                                RuntimeTagElement _jettag_c_iterate_313_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_313_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_313_5.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_iterate_313_5.setTagInfo(_td_c_iterate_313_5);
                                _jettag_c_iterate_313_5.doStart(context, out);
                                while (_jettag_c_iterate_313_5.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_314_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_314_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_314_5.setRuntimeParent(_jettag_c_iterate_313_5);
                                    _jettag_c_if_314_5.setTagInfo(_td_c_if_314_5);
                                    _jettag_c_if_314_5.doStart(context, out);
                                    while (_jettag_c_if_314_5.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_315_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_315_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_315_5.setRuntimeParent(_jettag_c_if_314_5);
                                        _jettag_c_setVariable_315_5.setTagInfo(_td_c_setVariable_315_5);
                                        _jettag_c_setVariable_315_5.doStart(context, out);
                                        _jettag_c_setVariable_315_5.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_316_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_316_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_316_5.setRuntimeParent(_jettag_c_if_314_5);
                                        _jettag_c_iterate_316_5.setTagInfo(_td_c_iterate_316_5);
                                        _jettag_c_iterate_316_5.doStart(context, out);
                                        while (_jettag_c_iterate_316_5.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_317_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_317_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_317_5.setRuntimeParent(_jettag_c_iterate_316_5);
                                            _jettag_c_setVariable_317_5.setTagInfo(_td_c_setVariable_317_5);
                                            _jettag_c_setVariable_317_5.doStart(context, out);
                                            _jettag_c_setVariable_317_5.doEnd();
                                            _jettag_c_iterate_316_5.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_316_5.doEnd();
                                        RuntimeTagElement _jettag_c_if_319_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_319_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_319_5.setRuntimeParent(_jettag_c_if_314_5);
                                        _jettag_c_if_319_5.setTagInfo(_td_c_if_319_5);
                                        _jettag_c_if_319_5.doStart(context, out);
                                        while (_jettag_c_if_319_5.okToProcessBody()) {
                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_320_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_320_5.setRuntimeParent(_jettag_c_if_319_5);
                                            _jettag_c_get_320_5.setTagInfo(_td_c_get_320_5);
                                            _jettag_c_get_320_5.doStart(context, out);
                                            _jettag_c_get_320_5.doEnd();
                                            out.write(" existing");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_320_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_65); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_320_65.setRuntimeParent(_jettag_c_if_319_5);
                                            _jettag_c_get_320_65.setTagInfo(_td_c_get_320_65);
                                            _jettag_c_get_320_65.doStart(context, out);
                                            _jettag_c_get_320_65.doEnd();
                                            out.write("s = ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_320_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_120); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_320_120.setRuntimeParent(_jettag_c_if_319_5);
                                            _jettag_c_get_320_120.setTagInfo(_td_c_get_320_120);
                                            _jettag_c_get_320_120.doStart(context, out);
                                            _jettag_c_get_320_120.doEnd();
                                            out.write("DAO.find");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_320_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_163); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_320_163.setRuntimeParent(_jettag_c_if_319_5);
                                            _jettag_c_get_320_163.setTagInfo(_td_c_get_320_163);
                                            _jettag_c_get_320_163.doStart(context, out);
                                            _jettag_c_get_320_163.doEnd();
                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_320_227 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_320_227); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_320_227.setRuntimeParent(_jettag_c_if_319_5);
                                            _jettag_c_iterate_320_227.setTagInfo(_td_c_iterate_320_227);
                                            _jettag_c_iterate_320_227.doStart(context, out);
                                            while (_jettag_c_iterate_320_227.okToProcessBody()) {
                                                out.write("related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_320_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_291); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_320_291.setRuntimeParent(_jettag_c_iterate_320_227);
                                                _jettag_c_get_320_291.setTagInfo(_td_c_get_320_291);
                                                _jettag_c_get_320_291.doStart(context, out);
                                                _jettag_c_get_320_291.doEnd();
                                                out.write("s.get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_320_331 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_320_331); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_320_331.setRuntimeParent(_jettag_c_iterate_320_227);
                                                _jettag_c_get_320_331.setTagInfo(_td_c_get_320_331);
                                                _jettag_c_get_320_331.doStart(context, out);
                                                _jettag_c_get_320_331.doEnd();
                                                out.write("()");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_setVariable_320_380 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_320_380); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_320_380.setRuntimeParent(_jettag_c_iterate_320_227);
                                                _jettag_c_setVariable_320_380.setTagInfo(_td_c_setVariable_320_380);
                                                _jettag_c_setVariable_320_380.doStart(context, out);
                                                _jettag_c_setVariable_320_380.doEnd();
                                                RuntimeTagElement _jettag_c_if_320_433 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_320_433); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_320_433.setRuntimeParent(_jettag_c_iterate_320_227);
                                                _jettag_c_if_320_433.setTagInfo(_td_c_if_320_433);
                                                _jettag_c_if_320_433.doStart(context, out);
                                                while (_jettag_c_if_320_433.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_320_433.handleBodyContent(out);
                                                }
                                                _jettag_c_if_320_433.doEnd();
                                                _jettag_c_iterate_320_227.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_320_227.doEnd();
                                            out.write(");");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_319_5.handleBodyContent(out);
                                        }
                                        _jettag_c_if_319_5.doEnd();
                                        RuntimeTagElement _jettag_c_if_322_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_322_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_322_5.setRuntimeParent(_jettag_c_if_314_5);
                                        _jettag_c_if_322_5.setTagInfo(_td_c_if_322_5);
                                        _jettag_c_if_322_5.doStart(context, out);
                                        while (_jettag_c_if_322_5.okToProcessBody()) {
                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_323_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_323_5.setRuntimeParent(_jettag_c_if_322_5);
                                            _jettag_c_get_323_5.setTagInfo(_td_c_get_323_5);
                                            _jettag_c_get_323_5.doStart(context, out);
                                            _jettag_c_get_323_5.doEnd();
                                            out.write(" existing");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_323_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_65); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_323_65.setRuntimeParent(_jettag_c_if_322_5);
                                            _jettag_c_get_323_65.setTagInfo(_td_c_get_323_65);
                                            _jettag_c_get_323_65.doStart(context, out);
                                            _jettag_c_get_323_65.doEnd();
                                            out.write("s = ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_323_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_120); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_323_120.setRuntimeParent(_jettag_c_if_322_5);
                                            _jettag_c_get_323_120.setTagInfo(_td_c_get_323_120);
                                            _jettag_c_get_323_120.doStart(context, out);
                                            _jettag_c_get_323_120.doEnd();
                                            out.write("DAO.find");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_323_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_163); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_323_163.setRuntimeParent(_jettag_c_if_322_5);
                                            _jettag_c_get_323_163.setTagInfo(_td_c_get_323_163);
                                            _jettag_c_get_323_163.doStart(context, out);
                                            _jettag_c_get_323_163.doEnd();
                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_323_227 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_323_227); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_323_227.setRuntimeParent(_jettag_c_if_322_5);
                                            _jettag_c_iterate_323_227.setTagInfo(_td_c_iterate_323_227);
                                            _jettag_c_iterate_323_227.doStart(context, out);
                                            while (_jettag_c_iterate_323_227.okToProcessBody()) {
                                                out.write("related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_323_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_291); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_323_291.setRuntimeParent(_jettag_c_iterate_323_227);
                                                _jettag_c_get_323_291.setTagInfo(_td_c_get_323_291);
                                                _jettag_c_get_323_291.doStart(context, out);
                                                _jettag_c_get_323_291.doEnd();
                                                out.write("s.get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_323_331 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_323_331); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_323_331.setRuntimeParent(_jettag_c_iterate_323_227);
                                                _jettag_c_get_323_331.setTagInfo(_td_c_get_323_331);
                                                _jettag_c_get_323_331.doStart(context, out);
                                                _jettag_c_get_323_331.doEnd();
                                                out.write("Field()");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_setVariable_323_385 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_323_385); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_323_385.setRuntimeParent(_jettag_c_iterate_323_227);
                                                _jettag_c_setVariable_323_385.setTagInfo(_td_c_setVariable_323_385);
                                                _jettag_c_setVariable_323_385.doStart(context, out);
                                                _jettag_c_setVariable_323_385.doEnd();
                                                RuntimeTagElement _jettag_c_if_323_438 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_323_438); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_323_438.setRuntimeParent(_jettag_c_iterate_323_227);
                                                _jettag_c_if_323_438.setTagInfo(_td_c_if_323_438);
                                                _jettag_c_if_323_438.doStart(context, out);
                                                while (_jettag_c_if_323_438.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_323_438.handleBodyContent(out);
                                                }
                                                _jettag_c_if_323_438.doEnd();
                                                _jettag_c_iterate_323_227.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_323_227.doEnd();
                                            out.write(");");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_322_5.handleBodyContent(out);
                                        }
                                        _jettag_c_if_322_5.doEnd();
                                        _jettag_c_if_314_5.handleBodyContent(out);
                                    }
                                    _jettag_c_if_314_5.doEnd();
                                    _jettag_c_iterate_313_5.handleBodyContent(out);
                                }
                                _jettag_c_iterate_313_5.doEnd();
                                out.write("\t\t\t\tif (existing");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_327_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_327_17); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_327_17.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_327_17.setTagInfo(_td_c_get_327_17);
                                _jettag_c_get_327_17.doStart(context, out);
                                _jettag_c_get_327_17.doEnd();
                                out.write("s != null) {");  //$NON-NLS-1$        
                                out.write(NL);         
                                RuntimeTagElement _jettag_c_iterate_328_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_328_6); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_328_6.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_iterate_328_6.setTagInfo(_td_c_iterate_328_6);
                                _jettag_c_iterate_328_6.doStart(context, out);
                                while (_jettag_c_iterate_328_6.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_329_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_329_6); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_329_6.setRuntimeParent(_jettag_c_iterate_328_6);
                                    _jettag_c_if_329_6.setTagInfo(_td_c_if_329_6);
                                    _jettag_c_if_329_6.doStart(context, out);
                                    while (_jettag_c_if_329_6.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_iterate_330_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_330_6); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_330_6.setRuntimeParent(_jettag_c_if_329_6);
                                        _jettag_c_iterate_330_6.setTagInfo(_td_c_iterate_330_6);
                                        _jettag_c_iterate_330_6.doStart(context, out);
                                        while (_jettag_c_iterate_330_6.okToProcessBody()) {
                                            out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_331_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_331_14); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_331_14.setRuntimeParent(_jettag_c_iterate_330_6);
                                            _jettag_c_get_331_14.setTagInfo(_td_c_get_331_14);
                                            _jettag_c_get_331_14.doStart(context, out);
                                            _jettag_c_get_331_14.doEnd();
                                            out.write("s.set");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_331_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_331_70); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_331_70.setRuntimeParent(_jettag_c_iterate_330_6);
                                            _jettag_c_get_331_70.setTagInfo(_td_c_get_331_70);
                                            _jettag_c_get_331_70.doStart(context, out);
                                            _jettag_c_get_331_70.doEnd();
                                            out.write("(related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_331_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_331_130); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_331_130.setRuntimeParent(_jettag_c_iterate_330_6);
                                            _jettag_c_get_331_130.setTagInfo(_td_c_get_331_130);
                                            _jettag_c_get_331_130.doStart(context, out);
                                            _jettag_c_get_331_130.doEnd();
                                            out.write("s.get");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_331_170 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_331_170); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_331_170.setRuntimeParent(_jettag_c_iterate_330_6);
                                            _jettag_c_get_331_170.setTagInfo(_td_c_get_331_170);
                                            _jettag_c_get_331_170.doStart(context, out);
                                            _jettag_c_get_331_170.doEnd();
                                            out.write("());");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_iterate_330_6.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_330_6.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_333_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_333_6); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_333_6.setRuntimeParent(_jettag_c_if_329_6);
                                        _jettag_c_iterate_333_6.setTagInfo(_td_c_iterate_333_6);
                                        _jettag_c_iterate_333_6.doStart(context, out);
                                        while (_jettag_c_iterate_333_6.okToProcessBody()) {
                                            out.write("\t\t\t\t\texisting");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_334_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_334_14); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_334_14.setRuntimeParent(_jettag_c_iterate_333_6);
                                            _jettag_c_get_334_14.setTagInfo(_td_c_get_334_14);
                                            _jettag_c_get_334_14.doStart(context, out);
                                            _jettag_c_get_334_14.doEnd();
                                            out.write("s.set");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_334_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_334_70); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_334_70.setRuntimeParent(_jettag_c_iterate_333_6);
                                            _jettag_c_get_334_70.setTagInfo(_td_c_get_334_70);
                                            _jettag_c_get_334_70.doStart(context, out);
                                            _jettag_c_get_334_70.doEnd();
                                            out.write("(related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_334_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_334_129); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_334_129.setRuntimeParent(_jettag_c_iterate_333_6);
                                            _jettag_c_get_334_129.setTagInfo(_td_c_get_334_129);
                                            _jettag_c_get_334_129.doStart(context, out);
                                            _jettag_c_get_334_129.doEnd();
                                            out.write("s.get");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_334_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_334_169); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_334_169.setRuntimeParent(_jettag_c_iterate_333_6);
                                            _jettag_c_get_334_169.setTagInfo(_td_c_get_334_169);
                                            _jettag_c_get_334_169.doStart(context, out);
                                            _jettag_c_get_334_169.doEnd();
                                            out.write("());");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_iterate_333_6.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_333_6.doEnd();
                                        _jettag_c_if_329_6.handleBodyContent(out);
                                    }
                                    _jettag_c_if_329_6.doEnd();
                                    _jettag_c_iterate_328_6.handleBodyContent(out);
                                }
                                _jettag_c_iterate_328_6.doEnd();
                                out.write("\t\t\t\t\trelated_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_338_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_338_14); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_338_14.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_338_14.setTagInfo(_td_c_get_338_14);
                                _jettag_c_get_338_14.doStart(context, out);
                                _jettag_c_get_338_14.doEnd();
                                out.write("s = existing");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_338_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_338_61); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_338_61.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_338_61.setTagInfo(_td_c_get_338_61);
                                _jettag_c_get_338_61.doStart(context, out);
                                _jettag_c_get_338_61.doEnd();
                                out.write("s;");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_339_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_339_36); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_339_36.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_339_36.setTagInfo(_td_c_get_339_36);
                                _jettag_c_get_339_36.doStart(context, out);
                                _jettag_c_get_339_36.doEnd();
                                out.write("s);");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_341_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_341_36); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_341_36.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_341_36.setTagInfo(_td_c_get_341_36);
                                _jettag_c_get_341_36.doStart(context, out);
                                _jettag_c_get_341_36.doEnd();
                                out.write("s);");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_342_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_342_6); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_342_6.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_342_6.setTagInfo(_td_c_get_342_6);
                                _jettag_c_get_342_6.doStart(context, out);
                                _jettag_c_get_342_6.doEnd();
                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_344_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_344_28); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_344_28.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_344_28.setTagInfo(_td_c_get_344_28);
                                _jettag_c_get_344_28.doStart(context, out);
                                _jettag_c_get_344_28.doEnd();
                                out.write(");");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\trelated_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_345_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_345_14); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_345_14.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_345_14.setTagInfo(_td_c_get_345_14);
                                _jettag_c_get_345_14.doStart(context, out);
                                _jettag_c_get_345_14.doEnd();
                                out.write("s.set");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_345_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_345_54); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_345_54.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_345_54.setTagInfo(_td_c_get_345_54);
                                _jettag_c_get_345_54.doStart(context, out);
                                _jettag_c_get_345_54.doEnd();
                                out.write("(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_345_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_345_105); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_345_105.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_345_105.setTagInfo(_td_c_get_345_105);
                                _jettag_c_get_345_105.doStart(context, out);
                                _jettag_c_get_345_105.doEnd();
                                out.write(");");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_346_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_346_6); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_346_6.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_346_6.setTagInfo(_td_c_get_346_6);
                                _jettag_c_get_346_6.doStart(context, out);
                                _jettag_c_get_346_6.doEnd();
                                out.write(".get");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_346_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_346_44); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_346_44.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_346_44.setTagInfo(_td_c_get_346_44);
                                _jettag_c_get_346_44.doStart(context, out);
                                _jettag_c_get_346_44.doEnd();
                                out.write("s().add(related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_346_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_346_111); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_346_111.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_346_111.setTagInfo(_td_c_get_346_111);
                                _jettag_c_get_346_111.doStart(context, out);
                                _jettag_c_get_346_111.doEnd();
                                out.write("s);");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_347_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_347_28); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_347_28.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_347_28.setTagInfo(_td_c_get_347_28);
                                _jettag_c_get_347_28.doStart(context, out);
                                _jettag_c_get_347_28.doEnd();
                                out.write(");");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_348_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_348_36); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_348_36.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_348_36.setTagInfo(_td_c_get_348_36);
                                _jettag_c_get_348_36.doStart(context, out);
                                _jettag_c_get_348_36.doEnd();
                                out.write("s);");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_349_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_349_6); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_349_6.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_349_6.setTagInfo(_td_c_get_349_6);
                                _jettag_c_get_349_6.doStart(context, out);
                                _jettag_c_get_349_6.doEnd();
                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write(NL);         
                                out.write("\t\t\t\t\treturn ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_351_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_351_13); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_351_13.setRuntimeParent(_jettag_c_if_303_4);
                                _jettag_c_get_351_13.setTagInfo(_td_c_get_351_13);
                                _jettag_c_get_351_13.doStart(context, out);
                                _jettag_c_get_351_13.doEnd();
                                out.write(";");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_303_4.handleBodyContent(out);
                            }
                            _jettag_c_if_303_4.doEnd();
                            _jettag_c_if_183_3.handleBodyContent(out);
                        }
                        _jettag_c_if_183_3.doEnd();
                        _jettag_c_iterate_182_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_182_2.doEnd();
                    _jettag_c_iterate_181_2.handleBodyContent(out);
                }
                _jettag_c_iterate_181_2.doEnd();
                _jettag_c_otherwise_47_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_47_2_saved_out;
            _jettag_c_otherwise_47_2.doEnd();
            _jettag_c_choose_9_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_9_2_saved_out;
        _jettag_c_choose_9_2.doEnd();
    }
}
