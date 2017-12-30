package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_namedQuery implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_namedQuery() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_2_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_2 = new TagInfo("java:import", //$NON-NLS-1$
            5, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_6_2 = new TagInfo("java:import", //$NON-NLS-1$
            6, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_7_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_3 = new TagInfo("c:if", //$NON-NLS-1$
            9, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_3 = new TagInfo("c:if", //$NON-NLS-1$
            10, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_30 = new TagInfo("c:get", //$NON-NLS-1$
            11, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_88 = new TagInfo("c:get", //$NON-NLS-1$
            11, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_160 = new TagInfo("c:get", //$NON-NLS-1$
            11, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_216 = new TagInfo("c:get", //$NON-NLS-1$
            11, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_269 = new TagInfo("c:get", //$NON-NLS-1$
            11, 269,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_328 = new TagInfo("c:get", //$NON-NLS-1$
            11, 328,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_379 = new TagInfo("c:get", //$NON-NLS-1$
            11, 379,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_3 = new TagInfo("c:if", //$NON-NLS-1$
            13, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_30 = new TagInfo("c:get", //$NON-NLS-1$
            14, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_88 = new TagInfo("c:get", //$NON-NLS-1$
            14, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_160 = new TagInfo("c:get", //$NON-NLS-1$
            14, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_216 = new TagInfo("c:get", //$NON-NLS-1$
            14, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_269 = new TagInfo("c:get", //$NON-NLS-1$
            14, 269,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_328 = new TagInfo("c:get", //$NON-NLS-1$
            14, 328,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_379 = new TagInfo("c:get", //$NON-NLS-1$
            14, 379,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_19_4 = new TagInfo("java:import", //$NON-NLS-1$
            19, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_19_75 = new TagInfo("c:get", //$NON-NLS-1$
            19, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_147 = new TagInfo("c:get", //$NON-NLS-1$
            19, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_203 = new TagInfo("c:get", //$NON-NLS-1$
            19, 203,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_256 = new TagInfo("c:get", //$NON-NLS-1$
            19, 256,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_3 = new TagInfo("c:if", //$NON-NLS-1$
            21, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_27 = new TagInfo("c:get", //$NON-NLS-1$
            22, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_79 = new TagInfo("c:get", //$NON-NLS-1$
            22, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_151 = new TagInfo("c:get", //$NON-NLS-1$
            22, 151,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_207 = new TagInfo("c:get", //$NON-NLS-1$
            22, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_260 = new TagInfo("c:get", //$NON-NLS-1$
            22, 260,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_319 = new TagInfo("c:get", //$NON-NLS-1$
            22, 319,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_370 = new TagInfo("c:get", //$NON-NLS-1$
            22, 370,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_3 = new TagInfo("c:if", //$NON-NLS-1$
            23, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_27 = new TagInfo("c:get", //$NON-NLS-1$
            24, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_79 = new TagInfo("c:get", //$NON-NLS-1$
            24, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_161 = new TagInfo("c:get", //$NON-NLS-1$
            24, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_217 = new TagInfo("c:get", //$NON-NLS-1$
            24, 217,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_270 = new TagInfo("c:get", //$NON-NLS-1$
            24, 270,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_329 = new TagInfo("c:get", //$NON-NLS-1$
            24, 329,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_380 = new TagInfo("c:get", //$NON-NLS-1$
            24, 380,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_3 = new TagInfo("c:if", //$NON-NLS-1$
            27, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_27 = new TagInfo("c:get", //$NON-NLS-1$
            28, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_79 = new TagInfo("c:get", //$NON-NLS-1$
            28, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_156 = new TagInfo("c:get", //$NON-NLS-1$
            28, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_212 = new TagInfo("c:get", //$NON-NLS-1$
            28, 212,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_265 = new TagInfo("c:get", //$NON-NLS-1$
            28, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_324 = new TagInfo("c:get", //$NON-NLS-1$
            28, 324,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_375 = new TagInfo("c:get", //$NON-NLS-1$
            28, 375,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_3 = new TagInfo("c:if", //$NON-NLS-1$
            29, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_27 = new TagInfo("c:get", //$NON-NLS-1$
            30, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_79 = new TagInfo("c:get", //$NON-NLS-1$
            30, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_166 = new TagInfo("c:get", //$NON-NLS-1$
            30, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_222 = new TagInfo("c:get", //$NON-NLS-1$
            30, 222,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_275 = new TagInfo("c:get", //$NON-NLS-1$
            30, 275,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_334 = new TagInfo("c:get", //$NON-NLS-1$
            30, 334,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_385 = new TagInfo("c:get", //$NON-NLS-1$
            30, 385,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_34_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            34, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_27 = new TagInfo("c:get", //$NON-NLS-1$
            35, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_79 = new TagInfo("c:get", //$NON-NLS-1$
            35, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_150 = new TagInfo("c:get", //$NON-NLS-1$
            35, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_206 = new TagInfo("c:get", //$NON-NLS-1$
            35, 206,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_259 = new TagInfo("c:get", //$NON-NLS-1$
            35, 259,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_318 = new TagInfo("c:get", //$NON-NLS-1$
            35, 318,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_369 = new TagInfo("c:get", //$NON-NLS-1$
            35, 369,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_3 = new TagInfo("c:if", //$NON-NLS-1$
            36, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='VARCHAR'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_27 = new TagInfo("c:get", //$NON-NLS-1$
            37, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_79 = new TagInfo("c:get", //$NON-NLS-1$
            37, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_160 = new TagInfo("c:get", //$NON-NLS-1$
            37, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_216 = new TagInfo("c:get", //$NON-NLS-1$
            37, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_269 = new TagInfo("c:get", //$NON-NLS-1$
            37, 269,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_328 = new TagInfo("c:get", //$NON-NLS-1$
            37, 328,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_379 = new TagInfo("c:get", //$NON-NLS-1$
            37, 379,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_44_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            44, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "k", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_46_3 = new TagInfo("c:if", //$NON-NLS-1$
            46, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_27 = new TagInfo("c:get", //$NON-NLS-1$
            47, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_110 = new TagInfo("c:get", //$NON-NLS-1$
            47, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_166 = new TagInfo("c:get", //$NON-NLS-1$
            47, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_219 = new TagInfo("c:get", //$NON-NLS-1$
            47, 219,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_278 = new TagInfo("c:get", //$NON-NLS-1$
            47, 278,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_329 = new TagInfo("c:get", //$NON-NLS-1$
            47, 329,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($eachTable/primaryKeys/column/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_3 = new TagInfo("c:if", //$NON-NLS-1$
            48, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column/@type='VARCHAR'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_27 = new TagInfo("c:get", //$NON-NLS-1$
            49, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_120 = new TagInfo("c:get", //$NON-NLS-1$
            49, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_176 = new TagInfo("c:get", //$NON-NLS-1$
            49, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_229 = new TagInfo("c:get", //$NON-NLS-1$
            49, 229,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_288 = new TagInfo("c:get", //$NON-NLS-1$
            49, 288,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_339 = new TagInfo("c:get", //$NON-NLS-1$
            49, 339,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($eachTable/primaryKeys/column/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_3 = new TagInfo("c:if", //$NON-NLS-1$
            52, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_27 = new TagInfo("c:get", //$NON-NLS-1$
            53, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_110 = new TagInfo("c:get", //$NON-NLS-1$
            53, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_166 = new TagInfo("c:get", //$NON-NLS-1$
            53, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_219 = new TagInfo("c:get", //$NON-NLS-1$
            53, 219,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_276 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 276,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_345 = new TagInfo("c:get", //$NON-NLS-1$
            53, 345,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_396 = new TagInfo("c:get", //$NON-NLS-1$
            53, 396,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_456 = new TagInfo("c:if", //$NON-NLS-1$
            53, 456,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$k<($j+1)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_479 = new TagInfo("c:get", //$NON-NLS-1$
            53, 479,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$k", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_499 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 499,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$k+1", //$NON-NLS-1$
                "k", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_544 = new TagInfo("c:if", //$NON-NLS-1$
            53, 544,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_567 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 567,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+(-1)", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_55_2 = new TagInfo("java:import", //$NON-NLS-1$
            55, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_55_64 = new TagInfo("c:get", //$NON-NLS-1$
            55, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_128 = new TagInfo("c:get", //$NON-NLS-1$
            55, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_56_2 = new TagInfo("java:import", //$NON-NLS-1$
            56, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_57_2 = new TagInfo("java:import", //$NON-NLS-1$
            57, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_57_76 = new TagInfo("c:get", //$NON-NLS-1$
            57, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_107 = new TagInfo("c:get", //$NON-NLS-1$
            57, 107,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_155 = new TagInfo("c:get", //$NON-NLS-1$
            57, 155,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
            _jettag_c_setVariable_3_1.doStart(context, out);
            _jettag_c_setVariable_3_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_5_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_5_2.setRuntimeParent(null);
        _jettag_java_import_5_2.setTagInfo(_td_java_import_5_2);
        _jettag_java_import_5_2.doStart(context, out);
        JET2Writer _jettag_java_import_5_2_saved_out = out;
        while (_jettag_java_import_5_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.Entity");  //$NON-NLS-1$        
            _jettag_java_import_5_2.handleBodyContent(out);
        }
        out = _jettag_java_import_5_2_saved_out;
        _jettag_java_import_5_2.doEnd();
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_6_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_6_2.setRuntimeParent(null);
        _jettag_java_import_6_2.setTagInfo(_td_java_import_6_2);
        _jettag_java_import_6_2.doStart(context, out);
        JET2Writer _jettag_java_import_6_2_saved_out = out;
        while (_jettag_java_import_6_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.NamedQueries");  //$NON-NLS-1$        
            _jettag_java_import_6_2.handleBodyContent(out);
        }
        out = _jettag_java_import_6_2_saved_out;
        _jettag_java_import_6_2.doEnd();
        out.write("({");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_3.setRuntimeParent(null);
        _jettag_c_iterate_7_3.setTagInfo(_td_c_iterate_7_3);
        _jettag_c_iterate_7_3.doStart(context, out);
        while (_jettag_c_iterate_7_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_8_3.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_iterate_8_3.setTagInfo(_td_c_iterate_8_3);
            _jettag_c_iterate_8_3.doStart(context, out);
            while (_jettag_c_iterate_8_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_3.setRuntimeParent(_jettag_c_iterate_8_3);
                _jettag_c_if_9_3.setTagInfo(_td_c_if_9_3);
                _jettag_c_if_9_3.doStart(context, out);
                while (_jettag_c_if_9_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_10_3.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_if_10_3.setTagInfo(_td_c_if_10_3);
                    _jettag_c_if_10_3.doStart(context, out);
                    while (_jettag_c_if_10_3.okToProcessBody()) {
                        out.write("\t\t@NamedQuery(name = \"findAll");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_30.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_30.setTagInfo(_td_c_get_11_30);
                        _jettag_c_get_11_30.doStart(context, out);
                        _jettag_c_get_11_30.doEnd();
                        RuntimeTagElement _jettag_c_get_11_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_88); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_88.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_88.setTagInfo(_td_c_get_11_88);
                        _jettag_c_get_11_88.doStart(context, out);
                        _jettag_c_get_11_88.doEnd();
                        out.write("s\", query = \"select my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_160); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_160.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_160.setTagInfo(_td_c_get_11_160);
                        _jettag_c_get_11_160.doStart(context, out);
                        _jettag_c_get_11_160.doEnd();
                        out.write(" from ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_216); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_216.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_216.setTagInfo(_td_c_get_11_216);
                        _jettag_c_get_11_216.doStart(context, out);
                        _jettag_c_get_11_216.doEnd();
                        out.write(" my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_269); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_269.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_269.setTagInfo(_td_c_get_11_269);
                        _jettag_c_get_11_269.doStart(context, out);
                        _jettag_c_get_11_269.doEnd();
                        out.write(" where my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_328 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_328); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_328.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_328.setTagInfo(_td_c_get_11_328);
                        _jettag_c_get_11_328.doStart(context, out);
                        _jettag_c_get_11_328.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_11_379 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_379); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_11_379.setRuntimeParent(_jettag_c_if_10_3);
                        _jettag_c_get_11_379.setTagInfo(_td_c_get_11_379);
                        _jettag_c_get_11_379.doStart(context, out);
                        _jettag_c_get_11_379.doEnd();
                        out.write("Id = ?1\"),");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_10_3.handleBodyContent(out);
                    }
                    _jettag_c_if_10_3.doEnd();
                    RuntimeTagElement _jettag_c_if_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_13_3.setRuntimeParent(_jettag_c_if_9_3);
                    _jettag_c_if_13_3.setTagInfo(_td_c_if_13_3);
                    _jettag_c_if_13_3.doStart(context, out);
                    while (_jettag_c_if_13_3.okToProcessBody()) {
                        out.write("\t\t@NamedQuery(name = \"findAll");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_30); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_30.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_30.setTagInfo(_td_c_get_14_30);
                        _jettag_c_get_14_30.doStart(context, out);
                        _jettag_c_get_14_30.doEnd();
                        RuntimeTagElement _jettag_c_get_14_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_88); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_88.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_88.setTagInfo(_td_c_get_14_88);
                        _jettag_c_get_14_88.doStart(context, out);
                        _jettag_c_get_14_88.doEnd();
                        out.write("s\", query = \"select my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_160); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_160.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_160.setTagInfo(_td_c_get_14_160);
                        _jettag_c_get_14_160.doStart(context, out);
                        _jettag_c_get_14_160.doEnd();
                        out.write(" from ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_216); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_216.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_216.setTagInfo(_td_c_get_14_216);
                        _jettag_c_get_14_216.doStart(context, out);
                        _jettag_c_get_14_216.doEnd();
                        out.write(" my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_269); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_269.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_269.setTagInfo(_td_c_get_14_269);
                        _jettag_c_get_14_269.doStart(context, out);
                        _jettag_c_get_14_269.doEnd();
                        out.write(" where my");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_328 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_328); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_328.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_328.setTagInfo(_td_c_get_14_328);
                        _jettag_c_get_14_328.doStart(context, out);
                        _jettag_c_get_14_328.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_379 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_379); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_379.setRuntimeParent(_jettag_c_if_13_3);
                        _jettag_c_get_14_379.setTagInfo(_td_c_get_14_379);
                        _jettag_c_get_14_379.doStart(context, out);
                        _jettag_c_get_14_379.doEnd();
                        out.write("Field = ?1\"),");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_13_3.handleBodyContent(out);
                    }
                    _jettag_c_if_13_3.doEnd();
                    _jettag_c_if_9_3.handleBodyContent(out);
                }
                _jettag_c_if_9_3.doEnd();
                _jettag_c_iterate_8_3.handleBodyContent(out);
            }
            _jettag_c_iterate_8_3.doEnd();
            _jettag_c_iterate_7_3.handleBodyContent(out);
        }
        _jettag_c_iterate_7_3.doEnd();
        out.write("\t\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_19_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_19_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_19_4.setRuntimeParent(null);
        _jettag_java_import_19_4.setTagInfo(_td_java_import_19_4);
        _jettag_java_import_19_4.doStart(context, out);
        JET2Writer _jettag_java_import_19_4_saved_out = out;
        while (_jettag_java_import_19_4.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.NamedQuery");  //$NON-NLS-1$        
            _jettag_java_import_19_4.handleBodyContent(out);
        }
        out = _jettag_java_import_19_4_saved_out;
        _jettag_java_import_19_4.doEnd();
        out.write("(name = \"findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_75.setRuntimeParent(null);
        _jettag_c_get_19_75.setTagInfo(_td_c_get_19_75);
        _jettag_c_get_19_75.doStart(context, out);
        _jettag_c_get_19_75.doEnd();
        out.write("s\", query = \"select my");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_147); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_147.setRuntimeParent(null);
        _jettag_c_get_19_147.setTagInfo(_td_c_get_19_147);
        _jettag_c_get_19_147.doStart(context, out);
        _jettag_c_get_19_147.doEnd();
        out.write(" from ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_203 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_203); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_203.setRuntimeParent(null);
        _jettag_c_get_19_203.setTagInfo(_td_c_get_19_203);
        _jettag_c_get_19_203.doStart(context, out);
        _jettag_c_get_19_203.doEnd();
        out.write(" my");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_256 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_256); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_256.setRuntimeParent(null);
        _jettag_c_get_19_256.setTagInfo(_td_c_get_19_256);
        _jettag_c_get_19_256.doStart(context, out);
        _jettag_c_get_19_256.doEnd();
        out.write("\"),");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_20_3.setRuntimeParent(null);
        _jettag_c_iterate_20_3.setTagInfo(_td_c_iterate_20_3);
        _jettag_c_iterate_20_3.doStart(context, out);
        while (_jettag_c_iterate_20_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_21_3.setRuntimeParent(_jettag_c_iterate_20_3);
            _jettag_c_if_21_3.setTagInfo(_td_c_if_21_3);
            _jettag_c_if_21_3.doStart(context, out);
            while (_jettag_c_if_21_3.okToProcessBody()) {
                out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_27.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_27.setTagInfo(_td_c_get_22_27);
                _jettag_c_get_22_27.doStart(context, out);
                _jettag_c_get_22_27.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_79.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_79.setTagInfo(_td_c_get_22_79);
                _jettag_c_get_22_79.doStart(context, out);
                _jettag_c_get_22_79.doEnd();
                out.write("\", query = \"select my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_151 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_151); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_151.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_151.setTagInfo(_td_c_get_22_151);
                _jettag_c_get_22_151.doStart(context, out);
                _jettag_c_get_22_151.doEnd();
                out.write(" from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_207); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_207.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_207.setTagInfo(_td_c_get_22_207);
                _jettag_c_get_22_207.doStart(context, out);
                _jettag_c_get_22_207.doEnd();
                out.write(" my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_260 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_260); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_260.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_260.setTagInfo(_td_c_get_22_260);
                _jettag_c_get_22_260.doStart(context, out);
                _jettag_c_get_22_260.doEnd();
                out.write(" where my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_319 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_319); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_319.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_319.setTagInfo(_td_c_get_22_319);
                _jettag_c_get_22_319.doStart(context, out);
                _jettag_c_get_22_319.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_370 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_370); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_370.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_get_22_370.setTagInfo(_td_c_get_22_370);
                _jettag_c_get_22_370.doStart(context, out);
                _jettag_c_get_22_370.doEnd();
                out.write(" = ?1\"),");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_23_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_23_3.setRuntimeParent(_jettag_c_if_21_3);
                _jettag_c_if_23_3.setTagInfo(_td_c_if_23_3);
                _jettag_c_if_23_3.doStart(context, out);
                while (_jettag_c_if_23_3.okToProcessBody()) {
                    out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_27); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_27.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_27.setTagInfo(_td_c_get_24_27);
                    _jettag_c_get_24_27.doStart(context, out);
                    _jettag_c_get_24_27.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_79); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_79.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_79.setTagInfo(_td_c_get_24_79);
                    _jettag_c_get_24_79.doStart(context, out);
                    _jettag_c_get_24_79.doEnd();
                    out.write("Containing\", query = \"select my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_161); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_161.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_161.setTagInfo(_td_c_get_24_161);
                    _jettag_c_get_24_161.doStart(context, out);
                    _jettag_c_get_24_161.doEnd();
                    out.write(" from ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_217 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_217); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_217.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_217.setTagInfo(_td_c_get_24_217);
                    _jettag_c_get_24_217.doStart(context, out);
                    _jettag_c_get_24_217.doEnd();
                    out.write(" my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_270); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_270.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_270.setTagInfo(_td_c_get_24_270);
                    _jettag_c_get_24_270.doStart(context, out);
                    _jettag_c_get_24_270.doEnd();
                    out.write(" where my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_329 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_329); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_329.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_329.setTagInfo(_td_c_get_24_329);
                    _jettag_c_get_24_329.doStart(context, out);
                    _jettag_c_get_24_329.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_24_380 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_380); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_24_380.setRuntimeParent(_jettag_c_if_23_3);
                    _jettag_c_get_24_380.setTagInfo(_td_c_get_24_380);
                    _jettag_c_get_24_380.doStart(context, out);
                    _jettag_c_get_24_380.doEnd();
                    out.write(" like ?1\"),");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_23_3.handleBodyContent(out);
                }
                _jettag_c_if_23_3.doEnd();
                _jettag_c_if_21_3.handleBodyContent(out);
            }
            _jettag_c_if_21_3.doEnd();
            RuntimeTagElement _jettag_c_if_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_27_3.setRuntimeParent(_jettag_c_iterate_20_3);
            _jettag_c_if_27_3.setTagInfo(_td_c_if_27_3);
            _jettag_c_if_27_3.doStart(context, out);
            while (_jettag_c_if_27_3.okToProcessBody()) {
                out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_27.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_27.setTagInfo(_td_c_get_28_27);
                _jettag_c_get_28_27.doStart(context, out);
                _jettag_c_get_28_27.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_79.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_79.setTagInfo(_td_c_get_28_79);
                _jettag_c_get_28_79.doStart(context, out);
                _jettag_c_get_28_79.doEnd();
                out.write("Field\", query = \"select my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_156.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_156.setTagInfo(_td_c_get_28_156);
                _jettag_c_get_28_156.doStart(context, out);
                _jettag_c_get_28_156.doEnd();
                out.write(" from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_212 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_212); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_212.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_212.setTagInfo(_td_c_get_28_212);
                _jettag_c_get_28_212.doStart(context, out);
                _jettag_c_get_28_212.doEnd();
                out.write(" my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_265); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_265.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_265.setTagInfo(_td_c_get_28_265);
                _jettag_c_get_28_265.doStart(context, out);
                _jettag_c_get_28_265.doEnd();
                out.write(" where my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_324 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_324); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_324.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_324.setTagInfo(_td_c_get_28_324);
                _jettag_c_get_28_324.doStart(context, out);
                _jettag_c_get_28_324.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_375 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_375); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_375.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_get_28_375.setTagInfo(_td_c_get_28_375);
                _jettag_c_get_28_375.doStart(context, out);
                _jettag_c_get_28_375.doEnd();
                out.write("Field = ?1\"),");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_29_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_29_3.setRuntimeParent(_jettag_c_if_27_3);
                _jettag_c_if_29_3.setTagInfo(_td_c_if_29_3);
                _jettag_c_if_29_3.doStart(context, out);
                while (_jettag_c_if_29_3.okToProcessBody()) {
                    out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_27); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_27.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_27.setTagInfo(_td_c_get_30_27);
                    _jettag_c_get_30_27.doStart(context, out);
                    _jettag_c_get_30_27.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_79); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_79.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_79.setTagInfo(_td_c_get_30_79);
                    _jettag_c_get_30_79.doStart(context, out);
                    _jettag_c_get_30_79.doEnd();
                    out.write("FieldContaining\", query = \"select my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_166.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_166.setTagInfo(_td_c_get_30_166);
                    _jettag_c_get_30_166.doStart(context, out);
                    _jettag_c_get_30_166.doEnd();
                    out.write(" from ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_222 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_222); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_222.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_222.setTagInfo(_td_c_get_30_222);
                    _jettag_c_get_30_222.doStart(context, out);
                    _jettag_c_get_30_222.doEnd();
                    out.write(" my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_275 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_275); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_275.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_275.setTagInfo(_td_c_get_30_275);
                    _jettag_c_get_30_275.doStart(context, out);
                    _jettag_c_get_30_275.doEnd();
                    out.write(" where my");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_334 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_334); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_334.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_334.setTagInfo(_td_c_get_30_334);
                    _jettag_c_get_30_334.doStart(context, out);
                    _jettag_c_get_30_334.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_385 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_385); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_385.setRuntimeParent(_jettag_c_if_29_3);
                    _jettag_c_get_30_385.setTagInfo(_td_c_get_30_385);
                    _jettag_c_get_30_385.doStart(context, out);
                    _jettag_c_get_30_385.doEnd();
                    out.write("Field like ?1\"),");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_29_3.handleBodyContent(out);
                }
                _jettag_c_if_29_3.doEnd();
                _jettag_c_if_27_3.handleBodyContent(out);
            }
            _jettag_c_if_27_3.doEnd();
            _jettag_c_iterate_20_3.handleBodyContent(out);
        }
        _jettag_c_iterate_20_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_34_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_34_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_34_3.setRuntimeParent(null);
        _jettag_c_iterate_34_3.setTagInfo(_td_c_iterate_34_3);
        _jettag_c_iterate_34_3.doStart(context, out);
        while (_jettag_c_iterate_34_3.okToProcessBody()) {
            out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_27); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_27.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_27.setTagInfo(_td_c_get_35_27);
            _jettag_c_get_35_27.doStart(context, out);
            _jettag_c_get_35_27.doEnd();
            out.write("By");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_79); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_79.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_79.setTagInfo(_td_c_get_35_79);
            _jettag_c_get_35_79.doStart(context, out);
            _jettag_c_get_35_79.doEnd();
            out.write("\", query = \"select my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_150); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_150.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_150.setTagInfo(_td_c_get_35_150);
            _jettag_c_get_35_150.doStart(context, out);
            _jettag_c_get_35_150.doEnd();
            out.write(" from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_206 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_206); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_206.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_206.setTagInfo(_td_c_get_35_206);
            _jettag_c_get_35_206.doStart(context, out);
            _jettag_c_get_35_206.doEnd();
            out.write(" my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_259 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_259); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_259.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_259.setTagInfo(_td_c_get_35_259);
            _jettag_c_get_35_259.doStart(context, out);
            _jettag_c_get_35_259.doEnd();
            out.write(" where my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_318 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_318); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_318.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_318.setTagInfo(_td_c_get_35_318);
            _jettag_c_get_35_318.doStart(context, out);
            _jettag_c_get_35_318.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_35_369 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_369); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_35_369.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_get_35_369.setTagInfo(_td_c_get_35_369);
            _jettag_c_get_35_369.doStart(context, out);
            _jettag_c_get_35_369.doEnd();
            out.write(" = ?1\"),");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_36_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_36_3.setRuntimeParent(_jettag_c_iterate_34_3);
            _jettag_c_if_36_3.setTagInfo(_td_c_if_36_3);
            _jettag_c_if_36_3.doStart(context, out);
            while (_jettag_c_if_36_3.okToProcessBody()) {
                out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_27.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_27.setTagInfo(_td_c_get_37_27);
                _jettag_c_get_37_27.doStart(context, out);
                _jettag_c_get_37_27.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_79.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_79.setTagInfo(_td_c_get_37_79);
                _jettag_c_get_37_79.doStart(context, out);
                _jettag_c_get_37_79.doEnd();
                out.write("Containing\", query = \"select my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_160); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_160.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_160.setTagInfo(_td_c_get_37_160);
                _jettag_c_get_37_160.doStart(context, out);
                _jettag_c_get_37_160.doEnd();
                out.write(" from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_216); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_216.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_216.setTagInfo(_td_c_get_37_216);
                _jettag_c_get_37_216.doStart(context, out);
                _jettag_c_get_37_216.doEnd();
                out.write(" my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_269); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_269.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_269.setTagInfo(_td_c_get_37_269);
                _jettag_c_get_37_269.doStart(context, out);
                _jettag_c_get_37_269.doEnd();
                out.write(" where my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_328 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_328); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_328.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_328.setTagInfo(_td_c_get_37_328);
                _jettag_c_get_37_328.doStart(context, out);
                _jettag_c_get_37_328.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_379 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_379); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_379.setRuntimeParent(_jettag_c_if_36_3);
                _jettag_c_get_37_379.setTagInfo(_td_c_get_37_379);
                _jettag_c_get_37_379.doStart(context, out);
                _jettag_c_get_37_379.doEnd();
                out.write(" like ?1\"),");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_36_3.handleBodyContent(out);
            }
            _jettag_c_if_36_3.doEnd();
            _jettag_c_iterate_34_3.handleBodyContent(out);
        }
        _jettag_c_iterate_34_3.doEnd();
        RuntimeTagElement _jettag_c_setVariable_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_40_3.setRuntimeParent(null);
        _jettag_c_setVariable_40_3.setTagInfo(_td_c_setVariable_40_3);
        _jettag_c_setVariable_40_3.doStart(context, out);
        _jettag_c_setVariable_40_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_41_3.setRuntimeParent(null);
        _jettag_c_iterate_41_3.setTagInfo(_td_c_iterate_41_3);
        _jettag_c_iterate_41_3.doStart(context, out);
        while (_jettag_c_iterate_41_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_42_4.setRuntimeParent(_jettag_c_iterate_41_3);
            _jettag_c_setVariable_42_4.setTagInfo(_td_c_setVariable_42_4);
            _jettag_c_setVariable_42_4.doStart(context, out);
            _jettag_c_setVariable_42_4.doEnd();
            _jettag_c_iterate_41_3.handleBodyContent(out);
        }
        _jettag_c_iterate_41_3.doEnd();
        RuntimeTagElement _jettag_c_setVariable_44_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_44_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_44_3.setRuntimeParent(null);
        _jettag_c_setVariable_44_3.setTagInfo(_td_c_setVariable_44_3);
        _jettag_c_setVariable_44_3.doStart(context, out);
        _jettag_c_setVariable_44_3.doEnd();
        RuntimeTagElement _jettag_c_setVariable_45_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_45_3.setRuntimeParent(null);
        _jettag_c_setVariable_45_3.setTagInfo(_td_c_setVariable_45_3);
        _jettag_c_setVariable_45_3.doStart(context, out);
        _jettag_c_setVariable_45_3.doEnd();
        RuntimeTagElement _jettag_c_if_46_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_46_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_46_3.setRuntimeParent(null);
        _jettag_c_if_46_3.setTagInfo(_td_c_if_46_3);
        _jettag_c_if_46_3.doStart(context, out);
        while (_jettag_c_if_46_3.okToProcessBody()) {
            out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_27); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_27.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_27.setTagInfo(_td_c_get_47_27);
            _jettag_c_get_47_27.doStart(context, out);
            _jettag_c_get_47_27.doEnd();
            out.write("ByPrimaryKey\", query = \"select my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_110.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_110.setTagInfo(_td_c_get_47_110);
            _jettag_c_get_47_110.doStart(context, out);
            _jettag_c_get_47_110.doEnd();
            out.write(" from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_166); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_166.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_166.setTagInfo(_td_c_get_47_166);
            _jettag_c_get_47_166.doStart(context, out);
            _jettag_c_get_47_166.doEnd();
            out.write(" my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_219 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_219); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_219.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_219.setTagInfo(_td_c_get_47_219);
            _jettag_c_get_47_219.doStart(context, out);
            _jettag_c_get_47_219.doEnd();
            out.write(" where my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_278 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_278); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_278.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_278.setTagInfo(_td_c_get_47_278);
            _jettag_c_get_47_278.doStart(context, out);
            _jettag_c_get_47_278.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_329 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_329); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_329.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_get_47_329.setTagInfo(_td_c_get_47_329);
            _jettag_c_get_47_329.doStart(context, out);
            _jettag_c_get_47_329.doEnd();
            out.write(" = ?1\")");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_48_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_48_3.setRuntimeParent(_jettag_c_if_46_3);
            _jettag_c_if_48_3.setTagInfo(_td_c_if_48_3);
            _jettag_c_if_48_3.doStart(context, out);
            while (_jettag_c_if_48_3.okToProcessBody()) {
                out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_27.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_27.setTagInfo(_td_c_get_49_27);
                _jettag_c_get_49_27.doStart(context, out);
                _jettag_c_get_49_27.doEnd();
                out.write("ByPrimaryKeyContaining\", query = \"select my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_120.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_120.setTagInfo(_td_c_get_49_120);
                _jettag_c_get_49_120.doStart(context, out);
                _jettag_c_get_49_120.doEnd();
                out.write(" from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_176.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_176.setTagInfo(_td_c_get_49_176);
                _jettag_c_get_49_176.doStart(context, out);
                _jettag_c_get_49_176.doEnd();
                out.write(" my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_229 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_229); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_229.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_229.setTagInfo(_td_c_get_49_229);
                _jettag_c_get_49_229.doStart(context, out);
                _jettag_c_get_49_229.doEnd();
                out.write(" where my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_288 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_288); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_288.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_288.setTagInfo(_td_c_get_49_288);
                _jettag_c_get_49_288.doStart(context, out);
                _jettag_c_get_49_288.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_339 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_339); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_339.setRuntimeParent(_jettag_c_if_48_3);
                _jettag_c_get_49_339.setTagInfo(_td_c_get_49_339);
                _jettag_c_get_49_339.doStart(context, out);
                _jettag_c_get_49_339.doEnd();
                out.write(" like ?1\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_48_3.handleBodyContent(out);
            }
            _jettag_c_if_48_3.doEnd();
            _jettag_c_if_46_3.handleBodyContent(out);
        }
        _jettag_c_if_46_3.doEnd();
        RuntimeTagElement _jettag_c_if_52_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_52_3.setRuntimeParent(null);
        _jettag_c_if_52_3.setTagInfo(_td_c_if_52_3);
        _jettag_c_if_52_3.doStart(context, out);
        while (_jettag_c_if_52_3.okToProcessBody()) {
            out.write("\t\t@NamedQuery(name = \"find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_27); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_27.setRuntimeParent(_jettag_c_if_52_3);
            _jettag_c_get_53_27.setTagInfo(_td_c_get_53_27);
            _jettag_c_get_53_27.doStart(context, out);
            _jettag_c_get_53_27.doEnd();
            out.write("ByPrimaryKey\", query = \"select my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_110); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_110.setRuntimeParent(_jettag_c_if_52_3);
            _jettag_c_get_53_110.setTagInfo(_td_c_get_53_110);
            _jettag_c_get_53_110.doStart(context, out);
            _jettag_c_get_53_110.doEnd();
            out.write(" from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_166); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_166.setRuntimeParent(_jettag_c_if_52_3);
            _jettag_c_get_53_166.setTagInfo(_td_c_get_53_166);
            _jettag_c_get_53_166.doStart(context, out);
            _jettag_c_get_53_166.doEnd();
            out.write(" my");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_219 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_219); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_219.setRuntimeParent(_jettag_c_if_52_3);
            _jettag_c_get_53_219.setTagInfo(_td_c_get_53_219);
            _jettag_c_get_53_219.doStart(context, out);
            _jettag_c_get_53_219.doEnd();
            out.write(" where ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_53_276 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_276); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_53_276.setRuntimeParent(_jettag_c_if_52_3);
            _jettag_c_iterate_53_276.setTagInfo(_td_c_iterate_53_276);
            _jettag_c_iterate_53_276.doStart(context, out);
            while (_jettag_c_iterate_53_276.okToProcessBody()) {
                out.write("my");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_53_345 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_345); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_345.setRuntimeParent(_jettag_c_iterate_53_276);
                _jettag_c_get_53_345.setTagInfo(_td_c_get_53_345);
                _jettag_c_get_53_345.doStart(context, out);
                _jettag_c_get_53_345.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_53_396 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_396); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_396.setRuntimeParent(_jettag_c_iterate_53_276);
                _jettag_c_get_53_396.setTagInfo(_td_c_get_53_396);
                _jettag_c_get_53_396.doStart(context, out);
                _jettag_c_get_53_396.doEnd();
                out.write("Field = ?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_53_456 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_456); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_53_456.setRuntimeParent(_jettag_c_iterate_53_276);
                _jettag_c_if_53_456.setTagInfo(_td_c_if_53_456);
                _jettag_c_if_53_456.doStart(context, out);
                while (_jettag_c_if_53_456.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_53_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_479); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_53_479.setRuntimeParent(_jettag_c_if_53_456);
                    _jettag_c_get_53_479.setTagInfo(_td_c_get_53_479);
                    _jettag_c_get_53_479.doStart(context, out);
                    _jettag_c_get_53_479.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_53_499 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_499); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_53_499.setRuntimeParent(_jettag_c_if_53_456);
                    _jettag_c_setVariable_53_499.setTagInfo(_td_c_setVariable_53_499);
                    _jettag_c_setVariable_53_499.doStart(context, out);
                    _jettag_c_setVariable_53_499.doEnd();
                    _jettag_c_if_53_456.handleBodyContent(out);
                }
                _jettag_c_if_53_456.doEnd();
                RuntimeTagElement _jettag_c_if_53_544 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_544); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_53_544.setRuntimeParent(_jettag_c_iterate_53_276);
                _jettag_c_if_53_544.setTagInfo(_td_c_if_53_544);
                _jettag_c_if_53_544.doStart(context, out);
                while (_jettag_c_if_53_544.okToProcessBody()) {
                    out.write(" and ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_53_567 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_567); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_53_567.setRuntimeParent(_jettag_c_if_53_544);
                    _jettag_c_setVariable_53_567.setTagInfo(_td_c_setVariable_53_567);
                    _jettag_c_setVariable_53_567.doStart(context, out);
                    _jettag_c_setVariable_53_567.doEnd();
                    _jettag_c_if_53_544.handleBodyContent(out);
                }
                _jettag_c_if_53_544.doEnd();
                _jettag_c_iterate_53_276.handleBodyContent(out);
            }
            _jettag_c_iterate_53_276.doEnd();
            out.write("\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            _jettag_c_if_52_3.handleBodyContent(out);
        }
        _jettag_c_if_52_3.doEnd();
        out.write("})");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_55_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_55_2.setRuntimeParent(null);
        _jettag_java_import_55_2.setTagInfo(_td_java_import_55_2);
        _jettag_java_import_55_2.doStart(context, out);
        JET2Writer _jettag_java_import_55_2_saved_out = out;
        while (_jettag_java_import_55_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.Table");  //$NON-NLS-1$        
            _jettag_java_import_55_2.handleBodyContent(out);
        }
        out = _jettag_java_import_55_2_saved_out;
        _jettag_java_import_55_2.doEnd();
        out.write("(catalog = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_55_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_64.setRuntimeParent(null);
        _jettag_c_get_55_64.setTagInfo(_td_c_get_55_64);
        _jettag_c_get_55_64.doStart(context, out);
        _jettag_c_get_55_64.doEnd();
        out.write("\", name = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_55_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_55_128.setRuntimeParent(null);
        _jettag_c_get_55_128.setTagInfo(_td_c_get_55_128);
        _jettag_c_get_55_128.doStart(context, out);
        _jettag_c_get_55_128.doEnd();
        out.write("\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_56_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_56_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_56_2.setRuntimeParent(null);
        _jettag_java_import_56_2.setTagInfo(_td_java_import_56_2);
        _jettag_java_import_56_2.doStart(context, out);
        JET2Writer _jettag_java_import_56_2_saved_out = out;
        while (_jettag_java_import_56_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.xml.bind.annotation.XmlAccessorType");  //$NON-NLS-1$        
            _jettag_java_import_56_2.handleBodyContent(out);
        }
        out = _jettag_java_import_56_2_saved_out;
        _jettag_java_import_56_2.doEnd();
        out.write("(XmlAccessType.FIELD)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_57_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_57_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_57_2.setRuntimeParent(null);
        _jettag_java_import_57_2.setTagInfo(_td_java_import_57_2);
        _jettag_java_import_57_2.doStart(context, out);
        JET2Writer _jettag_java_import_57_2_saved_out = out;
        while (_jettag_java_import_57_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.xml.bind.annotation.XmlType");  //$NON-NLS-1$        
            _jettag_java_import_57_2.handleBodyContent(out);
        }
        out = _jettag_java_import_57_2_saved_out;
        _jettag_java_import_57_2.doEnd();
        out.write("(namespace = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_76.setRuntimeParent(null);
        _jettag_c_get_57_76.setTagInfo(_td_c_get_57_76);
        _jettag_c_get_57_76.doStart(context, out);
        _jettag_c_get_57_76.doEnd();
        out.write("/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_107); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_107.setRuntimeParent(null);
        _jettag_c_get_57_107.setTagInfo(_td_c_get_57_107);
        _jettag_c_get_57_107.doStart(context, out);
        _jettag_c_get_57_107.doEnd();
        out.write("/domain\", name = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_57_155 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_155); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_57_155.setRuntimeParent(null);
        _jettag_c_get_57_155.setTagInfo(_td_c_get_57_155);
        _jettag_c_get_57_155.doStart(context, out);
        _jettag_c_get_57_155.doEnd();
        out.write("\")");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
