package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_save implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_save() {
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
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_2_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_28 = new TagInfo("c:get", //$NON-NLS-1$
            6, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_64 = new TagInfo("c:get", //$NON-NLS-1$
            8, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_128 = new TagInfo("c:get", //$NON-NLS-1$
            8, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_179 = new TagInfo("c:get", //$NON-NLS-1$
            8, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_3 = new TagInfo("c:get", //$NON-NLS-1$
            9, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_49 = new TagInfo("c:get", //$NON-NLS-1$
            9, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_100 = new TagInfo("c:get", //$NON-NLS-1$
            9, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_3 = new TagInfo("c:if", //$NON-NLS-1$
            10, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_10 = new TagInfo("c:get", //$NON-NLS-1$
            11, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_52 = new TagInfo("c:get", //$NON-NLS-1$
            11, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_115 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 115,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_182 = new TagInfo("c:get", //$NON-NLS-1$
            11, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_220 = new TagInfo("c:get", //$NON-NLS-1$
            11, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_273 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 273,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_322 = new TagInfo("c:if", //$NON-NLS-1$
            11, 322,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_3 = new TagInfo("c:if", //$NON-NLS-1$
            13, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_10 = new TagInfo("c:get", //$NON-NLS-1$
            14, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_52 = new TagInfo("c:get", //$NON-NLS-1$
            14, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_115 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 115,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_182 = new TagInfo("c:get", //$NON-NLS-1$
            14, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_220 = new TagInfo("c:get", //$NON-NLS-1$
            14, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_278 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 278,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_327 = new TagInfo("c:if", //$NON-NLS-1$
            14, 327,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_2 = new TagInfo("c:if", //$NON-NLS-1$
            20, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_28 = new TagInfo("c:get", //$NON-NLS-1$
            27, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_147 = new TagInfo("c:get", //$NON-NLS-1$
            27, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_182 = new TagInfo("c:get", //$NON-NLS-1$
            27, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_231 = new TagInfo("c:get", //$NON-NLS-1$
            27, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_9 = new TagInfo("c:get", //$NON-NLS-1$
            29, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_72 = new TagInfo("c:get", //$NON-NLS-1$
            29, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_122 = new TagInfo("c:get", //$NON-NLS-1$
            29, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_181 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 181,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_248 = new TagInfo("c:if", //$NON-NLS-1$
            29, 248,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_505 = new TagInfo("c:get", //$NON-NLS-1$
            29, 505,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_540 = new TagInfo("c:get", //$NON-NLS-1$
            29, 540,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_582 = new TagInfo("c:if", //$NON-NLS-1$
            29, 582,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_759 = new TagInfo("c:get", //$NON-NLS-1$
            29, 759,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_794 = new TagInfo("c:get", //$NON-NLS-1$
            29, 794,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_836 = new TagInfo("c:if", //$NON-NLS-1$
            29, 836,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_987 = new TagInfo("java:import", //$NON-NLS-1$
            29, 987,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_1043 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1043,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1078 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1078,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1120 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1120,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_1271 = new TagInfo("java:import", //$NON-NLS-1$
            29, 1271,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_1333 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1333,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1368 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1368,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_1410 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 1410,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1459 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1459,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1516 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1516,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1575 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1575,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_3 = new TagInfo("c:get", //$NON-NLS-1$
            31, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_49 = new TagInfo("c:get", //$NON-NLS-1$
            31, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_99 = new TagInfo("c:get", //$NON-NLS-1$
            31, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_158 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 158,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_225 = new TagInfo("c:get", //$NON-NLS-1$
            31, 225,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_260 = new TagInfo("c:get", //$NON-NLS-1$
            31, 260,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_31_295 = new TagInfo("c:setVariable", //$NON-NLS-1$
            31, 295,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_344 = new TagInfo("c:if", //$NON-NLS-1$
            31, 344,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_388 = new TagInfo("c:get", //$NON-NLS-1$
            31, 388,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_3 = new TagInfo("c:if", //$NON-NLS-1$
            32, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_10 = new TagInfo("c:get", //$NON-NLS-1$
            33, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_60 = new TagInfo("c:get", //$NON-NLS-1$
            33, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_131 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 131,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_195 = new TagInfo("c:get", //$NON-NLS-1$
            33, 195,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_234 = new TagInfo("c:get", //$NON-NLS-1$
            33, 234,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_283 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 283,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_336 = new TagInfo("c:if", //$NON-NLS-1$
            33, 336,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_3 = new TagInfo("c:if", //$NON-NLS-1$
            35, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_10 = new TagInfo("c:get", //$NON-NLS-1$
            36, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_60 = new TagInfo("c:get", //$NON-NLS-1$
            36, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_131 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 131,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_195 = new TagInfo("c:get", //$NON-NLS-1$
            36, 195,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_234 = new TagInfo("c:get", //$NON-NLS-1$
            36, 234,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_288 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 288,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_341 = new TagInfo("c:if", //$NON-NLS-1$
            36, 341,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_45_2 = new TagInfo("c:if", //$NON-NLS-1$
            45, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_46_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            46, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_49_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            49, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_52_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            52, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_54_2 = new TagInfo("c:choose", //$NON-NLS-1$
            54, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_55_2 = new TagInfo("c:when", //$NON-NLS-1$
            55, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0 and $j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_56_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            56, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_57_2 = new TagInfo("c:choose", //$NON-NLS-1$
            57, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_58_2 = new TagInfo("c:when", //$NON-NLS-1$
            58, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_60_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            60, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_61_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            61, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_2 = new TagInfo("c:if", //$NON-NLS-1$
            63, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_64_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            64, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_65_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_66_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            66, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_68_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            68, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_28 = new TagInfo("c:get", //$NON-NLS-1$
            69, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_147 = new TagInfo("c:get", //$NON-NLS-1$
            69, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_182 = new TagInfo("c:get", //$NON-NLS-1$
            69, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_231 = new TagInfo("c:get", //$NON-NLS-1$
            69, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_9 = new TagInfo("c:get", //$NON-NLS-1$
            71, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_57 = new TagInfo("c:get", //$NON-NLS-1$
            71, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_107 = new TagInfo("c:get", //$NON-NLS-1$
            71, 107,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_71_152 = new TagInfo("c:iterate", //$NON-NLS-1$
            71, 152,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_219 = new TagInfo("c:if", //$NON-NLS-1$
            71, 219,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_476 = new TagInfo("c:get", //$NON-NLS-1$
            71, 476,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_511 = new TagInfo("c:get", //$NON-NLS-1$
            71, 511,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_553 = new TagInfo("c:if", //$NON-NLS-1$
            71, 553,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_730 = new TagInfo("c:get", //$NON-NLS-1$
            71, 730,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_765 = new TagInfo("c:get", //$NON-NLS-1$
            71, 765,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_807 = new TagInfo("c:if", //$NON-NLS-1$
            71, 807,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_71_958 = new TagInfo("java:import", //$NON-NLS-1$
            71, 958,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_71_1014 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1014,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1049 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1049,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_1091 = new TagInfo("c:if", //$NON-NLS-1$
            71, 1091,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_71_1242 = new TagInfo("java:import", //$NON-NLS-1$
            71, 1242,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_71_1304 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1304,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1339 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1339,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_71_1381 = new TagInfo("c:setVariable", //$NON-NLS-1$
            71, 1381,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_1430 = new TagInfo("c:if", //$NON-NLS-1$
            71, 1430,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1487 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1487,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1531 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1531,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_72_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            72, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_3 = new TagInfo("c:get", //$NON-NLS-1$
            73, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_49 = new TagInfo("c:get", //$NON-NLS-1$
            73, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_99 = new TagInfo("c:get", //$NON-NLS-1$
            73, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_144 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 144,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_211 = new TagInfo("c:get", //$NON-NLS-1$
            73, 211,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_246 = new TagInfo("c:get", //$NON-NLS-1$
            73, 246,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_73_281 = new TagInfo("c:setVariable", //$NON-NLS-1$
            73, 281,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_330 = new TagInfo("c:if", //$NON-NLS-1$
            73, 330,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_374 = new TagInfo("c:get", //$NON-NLS-1$
            73, 374,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_3 = new TagInfo("c:if", //$NON-NLS-1$
            74, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_10 = new TagInfo("c:get", //$NON-NLS-1$
            75, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_45 = new TagInfo("c:get", //$NON-NLS-1$
            75, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_75_101 = new TagInfo("c:iterate", //$NON-NLS-1$
            75, 101,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_157 = new TagInfo("c:get", //$NON-NLS-1$
            75, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_189 = new TagInfo("c:get", //$NON-NLS-1$
            75, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_75_238 = new TagInfo("c:setVariable", //$NON-NLS-1$
            75, 238,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_291 = new TagInfo("c:if", //$NON-NLS-1$
            75, 291,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_77_3 = new TagInfo("c:if", //$NON-NLS-1$
            77, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_10 = new TagInfo("c:get", //$NON-NLS-1$
            78, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_45 = new TagInfo("c:get", //$NON-NLS-1$
            78, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_78_101 = new TagInfo("c:iterate", //$NON-NLS-1$
            78, 101,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_157 = new TagInfo("c:get", //$NON-NLS-1$
            78, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_189 = new TagInfo("c:get", //$NON-NLS-1$
            78, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_78_243 = new TagInfo("c:setVariable", //$NON-NLS-1$
            78, 243,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_296 = new TagInfo("c:if", //$NON-NLS-1$
            78, 296,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_87_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            87, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_88_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            88, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_89_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            89, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_90_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            90, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_91_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            91, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_93_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            93, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_28 = new TagInfo("c:get", //$NON-NLS-1$
            94, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_94_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            94, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_147 = new TagInfo("c:get", //$NON-NLS-1$
            94, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_182 = new TagInfo("c:get", //$NON-NLS-1$
            94, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_231 = new TagInfo("c:get", //$NON-NLS-1$
            94, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_9 = new TagInfo("c:get", //$NON-NLS-1$
            96, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_69 = new TagInfo("c:get", //$NON-NLS-1$
            96, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_119 = new TagInfo("c:get", //$NON-NLS-1$
            96, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_96_176 = new TagInfo("c:iterate", //$NON-NLS-1$
            96, 176,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_243 = new TagInfo("c:if", //$NON-NLS-1$
            96, 243,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_500 = new TagInfo("c:get", //$NON-NLS-1$
            96, 500,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_535 = new TagInfo("c:get", //$NON-NLS-1$
            96, 535,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_577 = new TagInfo("c:if", //$NON-NLS-1$
            96, 577,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_754 = new TagInfo("c:get", //$NON-NLS-1$
            96, 754,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_789 = new TagInfo("c:get", //$NON-NLS-1$
            96, 789,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_831 = new TagInfo("c:if", //$NON-NLS-1$
            96, 831,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_96_982 = new TagInfo("java:import", //$NON-NLS-1$
            96, 982,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_96_1038 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1038,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1073 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1073,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_1115 = new TagInfo("c:if", //$NON-NLS-1$
            96, 1115,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_96_1266 = new TagInfo("java:import", //$NON-NLS-1$
            96, 1266,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_96_1328 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1328,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1363 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1363,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_96_1405 = new TagInfo("c:setVariable", //$NON-NLS-1$
            96, 1405,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_1454 = new TagInfo("c:if", //$NON-NLS-1$
            96, 1454,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1511 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1511,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1567 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1567,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_97_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            97, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_3 = new TagInfo("c:get", //$NON-NLS-1$
            98, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_49 = new TagInfo("c:get", //$NON-NLS-1$
            98, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_99 = new TagInfo("c:get", //$NON-NLS-1$
            98, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_98_156 = new TagInfo("c:iterate", //$NON-NLS-1$
            98, 156,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_223 = new TagInfo("c:get", //$NON-NLS-1$
            98, 223,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_258 = new TagInfo("c:get", //$NON-NLS-1$
            98, 258,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_98_293 = new TagInfo("c:setVariable", //$NON-NLS-1$
            98, 293,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_98_342 = new TagInfo("c:if", //$NON-NLS-1$
            98, 342,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_386 = new TagInfo("c:get", //$NON-NLS-1$
            98, 386,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_99_3 = new TagInfo("c:if", //$NON-NLS-1$
            99, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_10 = new TagInfo("c:get", //$NON-NLS-1$
            100, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_57 = new TagInfo("c:get", //$NON-NLS-1$
            100, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_100_125 = new TagInfo("c:iterate", //$NON-NLS-1$
            100, 125,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_193 = new TagInfo("c:get", //$NON-NLS-1$
            100, 193,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_237 = new TagInfo("c:get", //$NON-NLS-1$
            100, 237,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_100_286 = new TagInfo("c:setVariable", //$NON-NLS-1$
            100, 286,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_100_339 = new TagInfo("c:if", //$NON-NLS-1$
            100, 339,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_102_3 = new TagInfo("c:if", //$NON-NLS-1$
            102, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_10 = new TagInfo("c:get", //$NON-NLS-1$
            103, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_57 = new TagInfo("c:get", //$NON-NLS-1$
            103, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_103_125 = new TagInfo("c:iterate", //$NON-NLS-1$
            103, 125,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_193 = new TagInfo("c:get", //$NON-NLS-1$
            103, 193,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_103_237 = new TagInfo("c:get", //$NON-NLS-1$
            103, 237,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_103_291 = new TagInfo("c:setVariable", //$NON-NLS-1$
            103, 291,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_103_344 = new TagInfo("c:if", //$NON-NLS-1$
            103, 344,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_iterate_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_2.setRuntimeParent(null);
        _jettag_c_iterate_2_2.setTagInfo(_td_c_iterate_2_2);
        _jettag_c_iterate_2_2.doStart(context, out);
        while (_jettag_c_iterate_2_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_2.setRuntimeParent(_jettag_c_iterate_2_2);
            _jettag_c_setVariable_3_2.setTagInfo(_td_c_setVariable_3_2);
            _jettag_c_setVariable_3_2.doStart(context, out);
            _jettag_c_setVariable_3_2.doEnd();
            _jettag_c_iterate_2_2.handleBodyContent(out);
        }
        _jettag_c_iterate_2_2.doEnd();
        RuntimeTagElement _jettag_c_setVariable_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_2.setRuntimeParent(null);
        _jettag_c_setVariable_5_2.setTagInfo(_td_c_setVariable_5_2);
        _jettag_c_setVariable_5_2.doStart(context, out);
        _jettag_c_setVariable_5_2.doEnd();
        out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_28.setRuntimeParent(null);
        _jettag_c_get_6_28.setTagInfo(_td_c_get_6_28);
        _jettag_c_get_6_28.doStart(context, out);
        _jettag_c_get_6_28.doEnd();
        out.write("\", method = RequestMethod.PUT)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@ResponseBody");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write(" save");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_64.setRuntimeParent(null);
        _jettag_c_get_8_64.setTagInfo(_td_c_get_8_64);
        _jettag_c_get_8_64.doStart(context, out);
        _jettag_c_get_8_64.doEnd();
        out.write("(@RequestBody ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_128.setRuntimeParent(null);
        _jettag_c_get_8_128.setTagInfo(_td_c_get_8_128);
        _jettag_c_get_8_128.doStart(context, out);
        _jettag_c_get_8_128.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_179); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_179.setRuntimeParent(null);
        _jettag_c_get_8_179.setTagInfo(_td_c_get_8_179);
        _jettag_c_get_8_179.doStart(context, out);
        _jettag_c_get_8_179.doEnd();
        out.write(") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_3.setRuntimeParent(null);
        _jettag_c_get_9_3.setTagInfo(_td_c_get_9_3);
        _jettag_c_get_9_3.doStart(context, out);
        _jettag_c_get_9_3.doEnd();
        out.write("Service.save");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_49.setRuntimeParent(null);
        _jettag_c_get_9_49.setTagInfo(_td_c_get_9_49);
        _jettag_c_get_9_49.doStart(context, out);
        _jettag_c_get_9_49.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_100); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_100.setRuntimeParent(null);
        _jettag_c_get_9_100.setTagInfo(_td_c_get_9_100);
        _jettag_c_get_9_100.doStart(context, out);
        _jettag_c_get_9_100.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_3.setRuntimeParent(null);
        _jettag_c_if_10_3.setTagInfo(_td_c_if_10_3);
        _jettag_c_if_10_3.doStart(context, out);
        while (_jettag_c_if_10_3.okToProcessBody()) {
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_10.setRuntimeParent(_jettag_c_if_10_3);
            _jettag_c_get_11_10.setTagInfo(_td_c_get_11_10);
            _jettag_c_get_11_10.doStart(context, out);
            _jettag_c_get_11_10.doEnd();
            out.write("DAO.find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_52.setRuntimeParent(_jettag_c_if_10_3);
            _jettag_c_get_11_52.setTagInfo(_td_c_get_11_52);
            _jettag_c_get_11_52.doStart(context, out);
            _jettag_c_get_11_52.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_11_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_115); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_11_115.setRuntimeParent(_jettag_c_if_10_3);
            _jettag_c_iterate_11_115.setTagInfo(_td_c_iterate_11_115);
            _jettag_c_iterate_11_115.doStart(context, out);
            while (_jettag_c_iterate_11_115.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_11_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_182.setRuntimeParent(_jettag_c_iterate_11_115);
                _jettag_c_get_11_182.setTagInfo(_td_c_get_11_182);
                _jettag_c_get_11_182.doStart(context, out);
                _jettag_c_get_11_182.doEnd();
                out.write(".get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_220); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_220.setRuntimeParent(_jettag_c_iterate_11_115);
                _jettag_c_get_11_220.setTagInfo(_td_c_get_11_220);
                _jettag_c_get_11_220.doStart(context, out);
                _jettag_c_get_11_220.doEnd();
                out.write("()");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_11_273 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_273); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_11_273.setRuntimeParent(_jettag_c_iterate_11_115);
                _jettag_c_setVariable_11_273.setTagInfo(_td_c_setVariable_11_273);
                _jettag_c_setVariable_11_273.doStart(context, out);
                _jettag_c_setVariable_11_273.doEnd();
                RuntimeTagElement _jettag_c_if_11_322 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_322); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_11_322.setRuntimeParent(_jettag_c_iterate_11_115);
                _jettag_c_if_11_322.setTagInfo(_td_c_if_11_322);
                _jettag_c_if_11_322.doStart(context, out);
                while (_jettag_c_if_11_322.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_11_322.handleBodyContent(out);
                }
                _jettag_c_if_11_322.doEnd();
                _jettag_c_iterate_11_115.handleBodyContent(out);
            }
            _jettag_c_iterate_11_115.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_10_3.handleBodyContent(out);
        }
        _jettag_c_if_10_3.doEnd();
        RuntimeTagElement _jettag_c_if_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_13_3.setRuntimeParent(null);
        _jettag_c_if_13_3.setTagInfo(_td_c_if_13_3);
        _jettag_c_if_13_3.doStart(context, out);
        while (_jettag_c_if_13_3.okToProcessBody()) {
            out.write("\t\treturn ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_10.setRuntimeParent(_jettag_c_if_13_3);
            _jettag_c_get_14_10.setTagInfo(_td_c_get_14_10);
            _jettag_c_get_14_10.doStart(context, out);
            _jettag_c_get_14_10.doEnd();
            out.write("DAO.find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_52.setRuntimeParent(_jettag_c_if_13_3);
            _jettag_c_get_14_52.setTagInfo(_td_c_get_14_52);
            _jettag_c_get_14_52.doStart(context, out);
            _jettag_c_get_14_52.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_14_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_115); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_14_115.setRuntimeParent(_jettag_c_if_13_3);
            _jettag_c_iterate_14_115.setTagInfo(_td_c_iterate_14_115);
            _jettag_c_iterate_14_115.doStart(context, out);
            while (_jettag_c_iterate_14_115.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_14_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_182.setRuntimeParent(_jettag_c_iterate_14_115);
                _jettag_c_get_14_182.setTagInfo(_td_c_get_14_182);
                _jettag_c_get_14_182.doStart(context, out);
                _jettag_c_get_14_182.doEnd();
                out.write(".get");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_220); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_220.setRuntimeParent(_jettag_c_iterate_14_115);
                _jettag_c_get_14_220.setTagInfo(_td_c_get_14_220);
                _jettag_c_get_14_220.doStart(context, out);
                _jettag_c_get_14_220.doEnd();
                out.write("Field()");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_14_278 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_278); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_14_278.setRuntimeParent(_jettag_c_iterate_14_115);
                _jettag_c_setVariable_14_278.setTagInfo(_td_c_setVariable_14_278);
                _jettag_c_setVariable_14_278.doStart(context, out);
                _jettag_c_setVariable_14_278.doEnd();
                RuntimeTagElement _jettag_c_if_14_327 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_327); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_14_327.setRuntimeParent(_jettag_c_iterate_14_115);
                _jettag_c_if_14_327.setTagInfo(_td_c_if_14_327);
                _jettag_c_if_14_327.doStart(context, out);
                while (_jettag_c_if_14_327.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_14_327.handleBodyContent(out);
                }
                _jettag_c_if_14_327.doEnd();
                _jettag_c_iterate_14_115.handleBodyContent(out);
            }
            _jettag_c_iterate_14_115.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_13_3.handleBodyContent(out);
        }
        _jettag_c_if_13_3.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_18_2.setRuntimeParent(null);
        _jettag_c_iterate_18_2.setTagInfo(_td_c_iterate_18_2);
        _jettag_c_iterate_18_2.doStart(context, out);
        while (_jettag_c_iterate_18_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_19_2.setRuntimeParent(_jettag_c_iterate_18_2);
            _jettag_c_iterate_19_2.setTagInfo(_td_c_iterate_19_2);
            _jettag_c_iterate_19_2.doStart(context, out);
            while (_jettag_c_iterate_19_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_2.setRuntimeParent(_jettag_c_iterate_19_2);
                _jettag_c_if_20_2.setTagInfo(_td_c_if_20_2);
                _jettag_c_if_20_2.doStart(context, out);
                while (_jettag_c_if_20_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_21_2.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_setVariable_21_2.setTagInfo(_td_c_setVariable_21_2);
                    _jettag_c_setVariable_21_2.doStart(context, out);
                    _jettag_c_setVariable_21_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_22_2.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_setVariable_22_2.setTagInfo(_td_c_setVariable_22_2);
                    _jettag_c_setVariable_22_2.doStart(context, out);
                    _jettag_c_setVariable_22_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_23_2.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_23_2.setTagInfo(_td_c_iterate_23_2);
                    _jettag_c_iterate_23_2.doStart(context, out);
                    while (_jettag_c_iterate_23_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_c_iterate_23_2);
                        _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
                        _jettag_c_setVariable_24_2.doStart(context, out);
                        _jettag_c_setVariable_24_2.doEnd();
                        _jettag_c_iterate_23_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_23_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_26_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_26_2.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_setVariable_26_2.setTagInfo(_td_c_setVariable_26_2);
                    _jettag_c_setVariable_26_2.doStart(context, out);
                    _jettag_c_setVariable_26_2.doEnd();
                    out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_27_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_27_28.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_27_28.setTagInfo(_td_c_get_27_28);
                    _jettag_c_get_27_28.doStart(context, out);
                    _jettag_c_get_27_28.doEnd();
                    RuntimeTagElement _jettag_c_iterate_27_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_27_78.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_27_78.setTagInfo(_td_c_iterate_27_78);
                    _jettag_c_iterate_27_78.doStart(context, out);
                    while (_jettag_c_iterate_27_78.okToProcessBody()) {
                        out.write("/{");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_27_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_147); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_27_147.setRuntimeParent(_jettag_c_iterate_27_78);
                        _jettag_c_get_27_147.setTagInfo(_td_c_get_27_147);
                        _jettag_c_get_27_147.doStart(context, out);
                        _jettag_c_get_27_147.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_27_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_182); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_27_182.setRuntimeParent(_jettag_c_iterate_27_78);
                        _jettag_c_get_27_182.setTagInfo(_td_c_get_27_182);
                        _jettag_c_get_27_182.doStart(context, out);
                        _jettag_c_get_27_182.doEnd();
                        out.write("}");  //$NON-NLS-1$        
                        _jettag_c_iterate_27_78.handleBodyContent(out);
                    }
                    _jettag_c_iterate_27_78.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_27_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_231); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_27_231.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_27_231.setTagInfo(_td_c_get_27_231);
                    _jettag_c_get_27_231.doStart(context, out);
                    _jettag_c_get_27_231.doEnd();
                    out.write("\", method = RequestMethod.PUT)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@ResponseBody");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_9.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_9.setTagInfo(_td_c_get_29_9);
                    _jettag_c_get_29_9.doStart(context, out);
                    _jettag_c_get_29_9.doEnd();
                    out.write(" save");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_72.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_72.setTagInfo(_td_c_get_29_72);
                    _jettag_c_get_29_72.doStart(context, out);
                    _jettag_c_get_29_72.doEnd();
                    RuntimeTagElement _jettag_c_get_29_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_122.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_122.setTagInfo(_td_c_get_29_122);
                    _jettag_c_get_29_122.doStart(context, out);
                    _jettag_c_get_29_122.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_29_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_181); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_29_181.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_29_181.setTagInfo(_td_c_iterate_29_181);
                    _jettag_c_iterate_29_181.doStart(context, out);
                    while (_jettag_c_iterate_29_181.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_29_248 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_248); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_248.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_if_29_248.setTagInfo(_td_c_if_29_248);
                        _jettag_c_if_29_248.doStart(context, out);
                        while (_jettag_c_if_29_248.okToProcessBody()) {
                            out.write("@PathVariable String ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_505 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_505); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_505.setRuntimeParent(_jettag_c_if_29_248);
                            _jettag_c_get_29_505.setTagInfo(_td_c_get_29_505);
                            _jettag_c_get_29_505.doStart(context, out);
                            _jettag_c_get_29_505.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_540 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_540); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_540.setRuntimeParent(_jettag_c_if_29_248);
                            _jettag_c_get_29_540.setTagInfo(_td_c_get_29_540);
                            _jettag_c_get_29_540.doStart(context, out);
                            _jettag_c_get_29_540.doEnd();
                            _jettag_c_if_29_248.handleBodyContent(out);
                        }
                        _jettag_c_if_29_248.doEnd();
                        RuntimeTagElement _jettag_c_if_29_582 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_582); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_582.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_if_29_582.setTagInfo(_td_c_if_29_582);
                        _jettag_c_if_29_582.doStart(context, out);
                        while (_jettag_c_if_29_582.okToProcessBody()) {
                            out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_759 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_759); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_759.setRuntimeParent(_jettag_c_if_29_582);
                            _jettag_c_get_29_759.setTagInfo(_td_c_get_29_759);
                            _jettag_c_get_29_759.doStart(context, out);
                            _jettag_c_get_29_759.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_794 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_794); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_794.setRuntimeParent(_jettag_c_if_29_582);
                            _jettag_c_get_29_794.setTagInfo(_td_c_get_29_794);
                            _jettag_c_get_29_794.doStart(context, out);
                            _jettag_c_get_29_794.doEnd();
                            _jettag_c_if_29_582.handleBodyContent(out);
                        }
                        _jettag_c_if_29_582.doEnd();
                        RuntimeTagElement _jettag_c_if_29_836 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_836); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_836.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_if_29_836.setTagInfo(_td_c_if_29_836);
                        _jettag_c_if_29_836.doStart(context, out);
                        while (_jettag_c_if_29_836.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_29_987 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_987); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_29_987.setRuntimeParent(_jettag_c_if_29_836);
                            _jettag_java_import_29_987.setTagInfo(_td_java_import_29_987);
                            _jettag_java_import_29_987.doStart(context, out);
                            JET2Writer _jettag_java_import_29_987_saved_out = out;
                            while (_jettag_java_import_29_987.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                _jettag_java_import_29_987.handleBodyContent(out);
                            }
                            out = _jettag_java_import_29_987_saved_out;
                            _jettag_java_import_29_987.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1043 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1043); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1043.setRuntimeParent(_jettag_c_if_29_836);
                            _jettag_c_get_29_1043.setTagInfo(_td_c_get_29_1043);
                            _jettag_c_get_29_1043.doStart(context, out);
                            _jettag_c_get_29_1043.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1078 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1078); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1078.setRuntimeParent(_jettag_c_if_29_836);
                            _jettag_c_get_29_1078.setTagInfo(_td_c_get_29_1078);
                            _jettag_c_get_29_1078.doStart(context, out);
                            _jettag_c_get_29_1078.doEnd();
                            _jettag_c_if_29_836.handleBodyContent(out);
                        }
                        _jettag_c_if_29_836.doEnd();
                        RuntimeTagElement _jettag_c_if_29_1120 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1120); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_1120.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_if_29_1120.setTagInfo(_td_c_if_29_1120);
                        _jettag_c_if_29_1120.doStart(context, out);
                        while (_jettag_c_if_29_1120.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_29_1271 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_1271); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_29_1271.setRuntimeParent(_jettag_c_if_29_1120);
                            _jettag_java_import_29_1271.setTagInfo(_td_java_import_29_1271);
                            _jettag_java_import_29_1271.doStart(context, out);
                            JET2Writer _jettag_java_import_29_1271_saved_out = out;
                            while (_jettag_java_import_29_1271.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                _jettag_java_import_29_1271.handleBodyContent(out);
                            }
                            out = _jettag_java_import_29_1271_saved_out;
                            _jettag_java_import_29_1271.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1333 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1333); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1333.setRuntimeParent(_jettag_c_if_29_1120);
                            _jettag_c_get_29_1333.setTagInfo(_td_c_get_29_1333);
                            _jettag_c_get_29_1333.doStart(context, out);
                            _jettag_c_get_29_1333.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1368 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1368); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1368.setRuntimeParent(_jettag_c_if_29_1120);
                            _jettag_c_get_29_1368.setTagInfo(_td_c_get_29_1368);
                            _jettag_c_get_29_1368.doStart(context, out);
                            _jettag_c_get_29_1368.doEnd();
                            _jettag_c_if_29_1120.handleBodyContent(out);
                        }
                        _jettag_c_if_29_1120.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_29_1410 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_1410); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_29_1410.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_setVariable_29_1410.setTagInfo(_td_c_setVariable_29_1410);
                        _jettag_c_setVariable_29_1410.doStart(context, out);
                        _jettag_c_setVariable_29_1410.doEnd();
                        RuntimeTagElement _jettag_c_if_29_1459 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1459); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_1459.setRuntimeParent(_jettag_c_iterate_29_181);
                        _jettag_c_if_29_1459.setTagInfo(_td_c_if_29_1459);
                        _jettag_c_if_29_1459.doStart(context, out);
                        while (_jettag_c_if_29_1459.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_29_1459.handleBodyContent(out);
                        }
                        _jettag_c_if_29_1459.doEnd();
                        _jettag_c_iterate_29_181.handleBodyContent(out);
                    }
                    _jettag_c_iterate_29_181.doEnd();
                    out.write(", @RequestBody ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_1516 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1516); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_1516.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_1516.setTagInfo(_td_c_get_29_1516);
                    _jettag_c_get_29_1516.doStart(context, out);
                    _jettag_c_get_29_1516.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_1575 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1575); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_1575.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_1575.setTagInfo(_td_c_get_29_1575);
                    _jettag_c_get_29_1575.doStart(context, out);
                    _jettag_c_get_29_1575.doEnd();
                    out.write("){");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_setVariable_30_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_30_3.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_setVariable_30_3.setTagInfo(_td_c_setVariable_30_3);
                    _jettag_c_setVariable_30_3.doStart(context, out);
                    _jettag_c_setVariable_30_3.doEnd();
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_3.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_31_3.setTagInfo(_td_c_get_31_3);
                    _jettag_c_get_31_3.doStart(context, out);
                    _jettag_c_get_31_3.doEnd();
                    out.write("Service.save");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_49.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_31_49.setTagInfo(_td_c_get_31_49);
                    _jettag_c_get_31_49.doStart(context, out);
                    _jettag_c_get_31_49.doEnd();
                    RuntimeTagElement _jettag_c_get_31_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_99); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_99.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_31_99.setTagInfo(_td_c_get_31_99);
                    _jettag_c_get_31_99.doStart(context, out);
                    _jettag_c_get_31_99.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_31_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_158); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_31_158.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_31_158.setTagInfo(_td_c_iterate_31_158);
                    _jettag_c_iterate_31_158.doStart(context, out);
                    while (_jettag_c_iterate_31_158.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_31_225 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_225); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_31_225.setRuntimeParent(_jettag_c_iterate_31_158);
                        _jettag_c_get_31_225.setTagInfo(_td_c_get_31_225);
                        _jettag_c_get_31_225.doStart(context, out);
                        _jettag_c_get_31_225.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_31_260 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_260); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_31_260.setRuntimeParent(_jettag_c_iterate_31_158);
                        _jettag_c_get_31_260.setTagInfo(_td_c_get_31_260);
                        _jettag_c_get_31_260.doStart(context, out);
                        _jettag_c_get_31_260.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_31_295 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_31_295); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_31_295.setRuntimeParent(_jettag_c_iterate_31_158);
                        _jettag_c_setVariable_31_295.setTagInfo(_td_c_setVariable_31_295);
                        _jettag_c_setVariable_31_295.doStart(context, out);
                        _jettag_c_setVariable_31_295.doEnd();
                        RuntimeTagElement _jettag_c_if_31_344 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_344); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_31_344.setRuntimeParent(_jettag_c_iterate_31_158);
                        _jettag_c_if_31_344.setTagInfo(_td_c_if_31_344);
                        _jettag_c_if_31_344.doStart(context, out);
                        while (_jettag_c_if_31_344.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_31_344.handleBodyContent(out);
                        }
                        _jettag_c_if_31_344.doEnd();
                        _jettag_c_iterate_31_158.handleBodyContent(out);
                    }
                    _jettag_c_iterate_31_158.doEnd();
                    out.write(", ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_388 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_388); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_388.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_31_388.setTagInfo(_td_c_get_31_388);
                    _jettag_c_get_31_388.doStart(context, out);
                    _jettag_c_get_31_388.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_if_32_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_32_3.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_if_32_3.setTagInfo(_td_c_if_32_3);
                    _jettag_c_if_32_3.doStart(context, out);
                    while (_jettag_c_if_32_3.okToProcessBody()) {
                        out.write("\t\treturn ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_33_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_10.setRuntimeParent(_jettag_c_if_32_3);
                        _jettag_c_get_33_10.setTagInfo(_td_c_get_33_10);
                        _jettag_c_get_33_10.doStart(context, out);
                        _jettag_c_get_33_10.doEnd();
                        out.write("DAO.find");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_33_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_60); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_60.setRuntimeParent(_jettag_c_if_32_3);
                        _jettag_c_get_33_60.setTagInfo(_td_c_get_33_60);
                        _jettag_c_get_33_60.doStart(context, out);
                        _jettag_c_get_33_60.doEnd();
                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_33_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_131); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_33_131.setRuntimeParent(_jettag_c_if_32_3);
                        _jettag_c_iterate_33_131.setTagInfo(_td_c_iterate_33_131);
                        _jettag_c_iterate_33_131.doStart(context, out);
                        while (_jettag_c_iterate_33_131.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_get_33_195 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_195); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_195.setRuntimeParent(_jettag_c_iterate_33_131);
                            _jettag_c_get_33_195.setTagInfo(_td_c_get_33_195);
                            _jettag_c_get_33_195.doStart(context, out);
                            _jettag_c_get_33_195.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_33_234 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_234); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_234.setRuntimeParent(_jettag_c_iterate_33_131);
                            _jettag_c_get_33_234.setTagInfo(_td_c_get_33_234);
                            _jettag_c_get_33_234.doStart(context, out);
                            _jettag_c_get_33_234.doEnd();
                            out.write("()");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_setVariable_33_283 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_283); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_33_283.setRuntimeParent(_jettag_c_iterate_33_131);
                            _jettag_c_setVariable_33_283.setTagInfo(_td_c_setVariable_33_283);
                            _jettag_c_setVariable_33_283.doStart(context, out);
                            _jettag_c_setVariable_33_283.doEnd();
                            RuntimeTagElement _jettag_c_if_33_336 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_336); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_33_336.setRuntimeParent(_jettag_c_iterate_33_131);
                            _jettag_c_if_33_336.setTagInfo(_td_c_if_33_336);
                            _jettag_c_if_33_336.doStart(context, out);
                            while (_jettag_c_if_33_336.okToProcessBody()) {
                                out.write(",");  //$NON-NLS-1$        
                                _jettag_c_if_33_336.handleBodyContent(out);
                            }
                            _jettag_c_if_33_336.doEnd();
                            _jettag_c_iterate_33_131.handleBodyContent(out);
                        }
                        _jettag_c_iterate_33_131.doEnd();
                        out.write(");");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_32_3.handleBodyContent(out);
                    }
                    _jettag_c_if_32_3.doEnd();
                    RuntimeTagElement _jettag_c_if_35_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_35_3.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_if_35_3.setTagInfo(_td_c_if_35_3);
                    _jettag_c_if_35_3.doStart(context, out);
                    while (_jettag_c_if_35_3.okToProcessBody()) {
                        out.write("\t\treturn ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_36_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_10.setRuntimeParent(_jettag_c_if_35_3);
                        _jettag_c_get_36_10.setTagInfo(_td_c_get_36_10);
                        _jettag_c_get_36_10.doStart(context, out);
                        _jettag_c_get_36_10.doEnd();
                        out.write("DAO.find");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_36_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_60); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_60.setRuntimeParent(_jettag_c_if_35_3);
                        _jettag_c_get_36_60.setTagInfo(_td_c_get_36_60);
                        _jettag_c_get_36_60.doStart(context, out);
                        _jettag_c_get_36_60.doEnd();
                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_36_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_131); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_36_131.setRuntimeParent(_jettag_c_if_35_3);
                        _jettag_c_iterate_36_131.setTagInfo(_td_c_iterate_36_131);
                        _jettag_c_iterate_36_131.doStart(context, out);
                        while (_jettag_c_iterate_36_131.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_get_36_195 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_195); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_36_195.setRuntimeParent(_jettag_c_iterate_36_131);
                            _jettag_c_get_36_195.setTagInfo(_td_c_get_36_195);
                            _jettag_c_get_36_195.doStart(context, out);
                            _jettag_c_get_36_195.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_36_234 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_234); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_36_234.setRuntimeParent(_jettag_c_iterate_36_131);
                            _jettag_c_get_36_234.setTagInfo(_td_c_get_36_234);
                            _jettag_c_get_36_234.doStart(context, out);
                            _jettag_c_get_36_234.doEnd();
                            out.write("Field()");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_setVariable_36_288 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_288); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_36_288.setRuntimeParent(_jettag_c_iterate_36_131);
                            _jettag_c_setVariable_36_288.setTagInfo(_td_c_setVariable_36_288);
                            _jettag_c_setVariable_36_288.doStart(context, out);
                            _jettag_c_setVariable_36_288.doEnd();
                            RuntimeTagElement _jettag_c_if_36_341 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_341); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_36_341.setRuntimeParent(_jettag_c_iterate_36_131);
                            _jettag_c_if_36_341.setTagInfo(_td_c_if_36_341);
                            _jettag_c_if_36_341.doStart(context, out);
                            while (_jettag_c_if_36_341.okToProcessBody()) {
                                out.write(",");  //$NON-NLS-1$        
                                _jettag_c_if_36_341.handleBodyContent(out);
                            }
                            _jettag_c_if_36_341.doEnd();
                            _jettag_c_iterate_36_131.handleBodyContent(out);
                        }
                        _jettag_c_iterate_36_131.doEnd();
                        out.write(");");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_35_3.handleBodyContent(out);
                    }
                    _jettag_c_if_35_3.doEnd();
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_20_2.handleBodyContent(out);
                }
                _jettag_c_if_20_2.doEnd();
                _jettag_c_iterate_19_2.handleBodyContent(out);
            }
            _jettag_c_iterate_19_2.doEnd();
            _jettag_c_iterate_18_2.handleBodyContent(out);
        }
        _jettag_c_iterate_18_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_43_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_43_2.setRuntimeParent(null);
        _jettag_c_iterate_43_2.setTagInfo(_td_c_iterate_43_2);
        _jettag_c_iterate_43_2.doStart(context, out);
        while (_jettag_c_iterate_43_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_44_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_44_2.setRuntimeParent(_jettag_c_iterate_43_2);
            _jettag_c_iterate_44_2.setTagInfo(_td_c_iterate_44_2);
            _jettag_c_iterate_44_2.doStart(context, out);
            while (_jettag_c_iterate_44_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_45_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_45_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_45_2.setRuntimeParent(_jettag_c_iterate_44_2);
                _jettag_c_if_45_2.setTagInfo(_td_c_if_45_2);
                _jettag_c_if_45_2.doStart(context, out);
                while (_jettag_c_if_45_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_46_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_46_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_46_2.setRuntimeParent(_jettag_c_if_45_2);
                    _jettag_c_setVariable_46_2.setTagInfo(_td_c_setVariable_46_2);
                    _jettag_c_setVariable_46_2.doStart(context, out);
                    _jettag_c_setVariable_46_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_47_2.setRuntimeParent(_jettag_c_if_45_2);
                    _jettag_c_setVariable_47_2.setTagInfo(_td_c_setVariable_47_2);
                    _jettag_c_setVariable_47_2.doStart(context, out);
                    _jettag_c_setVariable_47_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_48_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_48_2.setRuntimeParent(_jettag_c_if_45_2);
                    _jettag_c_iterate_48_2.setTagInfo(_td_c_iterate_48_2);
                    _jettag_c_iterate_48_2.doStart(context, out);
                    while (_jettag_c_iterate_48_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_49_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_49_2.setRuntimeParent(_jettag_c_iterate_48_2);
                        _jettag_c_setVariable_49_2.setTagInfo(_td_c_setVariable_49_2);
                        _jettag_c_setVariable_49_2.doStart(context, out);
                        _jettag_c_setVariable_49_2.doEnd();
                        _jettag_c_iterate_48_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_48_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_51_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_51_2.setRuntimeParent(_jettag_c_if_45_2);
                    _jettag_c_iterate_51_2.setTagInfo(_td_c_iterate_51_2);
                    _jettag_c_iterate_51_2.doStart(context, out);
                    while (_jettag_c_iterate_51_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_52_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_52_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_52_2.setRuntimeParent(_jettag_c_iterate_51_2);
                        _jettag_c_setVariable_52_2.setTagInfo(_td_c_setVariable_52_2);
                        _jettag_c_setVariable_52_2.doStart(context, out);
                        _jettag_c_setVariable_52_2.doEnd();
                        _jettag_c_iterate_51_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_51_2.doEnd();
                    RuntimeTagElement _jettag_c_choose_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_54_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_54_2.setRuntimeParent(_jettag_c_if_45_2);
                    _jettag_c_choose_54_2.setTagInfo(_td_c_choose_54_2);
                    _jettag_c_choose_54_2.doStart(context, out);
                    JET2Writer _jettag_c_choose_54_2_saved_out = out;
                    while (_jettag_c_choose_54_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_55_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_55_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_55_2.setRuntimeParent(_jettag_c_choose_54_2);
                        _jettag_c_when_55_2.setTagInfo(_td_c_when_55_2);
                        _jettag_c_when_55_2.doStart(context, out);
                        JET2Writer _jettag_c_when_55_2_saved_out = out;
                        while (_jettag_c_when_55_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_56_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_56_2.setRuntimeParent(_jettag_c_when_55_2);
                            _jettag_c_iterate_56_2.setTagInfo(_td_c_iterate_56_2);
                            _jettag_c_iterate_56_2.doStart(context, out);
                            while (_jettag_c_iterate_56_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_57_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_57_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_57_2.setRuntimeParent(_jettag_c_iterate_56_2);
                                _jettag_c_choose_57_2.setTagInfo(_td_c_choose_57_2);
                                _jettag_c_choose_57_2.doStart(context, out);
                                JET2Writer _jettag_c_choose_57_2_saved_out = out;
                                while (_jettag_c_choose_57_2.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_58_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_58_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_58_2.setRuntimeParent(_jettag_c_choose_57_2);
                                    _jettag_c_when_58_2.setTagInfo(_td_c_when_58_2);
                                    _jettag_c_when_58_2.doStart(context, out);
                                    JET2Writer _jettag_c_when_58_2_saved_out = out;
                                    while (_jettag_c_when_58_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_58_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_58_2_saved_out;
                                    _jettag_c_when_58_2.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_60_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_60_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_60_2.setRuntimeParent(_jettag_c_choose_57_2);
                                    _jettag_c_otherwise_60_2.setTagInfo(_td_c_otherwise_60_2);
                                    _jettag_c_otherwise_60_2.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_60_2_saved_out = out;
                                    while (_jettag_c_otherwise_60_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_setVariable_61_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_61_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_61_2.setRuntimeParent(_jettag_c_otherwise_60_2);
                                        _jettag_c_setVariable_61_2.setTagInfo(_td_c_setVariable_61_2);
                                        _jettag_c_setVariable_61_2.doStart(context, out);
                                        _jettag_c_setVariable_61_2.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_62_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_62_2.setRuntimeParent(_jettag_c_otherwise_60_2);
                                        _jettag_c_iterate_62_2.setTagInfo(_td_c_iterate_62_2);
                                        _jettag_c_iterate_62_2.doStart(context, out);
                                        while (_jettag_c_iterate_62_2.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_if_63_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_2); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_63_2.setRuntimeParent(_jettag_c_iterate_62_2);
                                            _jettag_c_if_63_2.setTagInfo(_td_c_if_63_2);
                                            _jettag_c_if_63_2.doStart(context, out);
                                            while (_jettag_c_if_63_2.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_setVariable_64_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_64_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_64_2.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_setVariable_64_2.setTagInfo(_td_c_setVariable_64_2);
                                                _jettag_c_setVariable_64_2.doStart(context, out);
                                                _jettag_c_setVariable_64_2.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_65_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_65_2.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_iterate_65_2.setTagInfo(_td_c_iterate_65_2);
                                                _jettag_c_iterate_65_2.doStart(context, out);
                                                while (_jettag_c_iterate_65_2.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_66_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_66_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_66_2.setRuntimeParent(_jettag_c_iterate_65_2);
                                                    _jettag_c_setVariable_66_2.setTagInfo(_td_c_setVariable_66_2);
                                                    _jettag_c_setVariable_66_2.doStart(context, out);
                                                    _jettag_c_setVariable_66_2.doEnd();
                                                    _jettag_c_iterate_65_2.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_65_2.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_68_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_68_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_68_2.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_setVariable_68_2.setTagInfo(_td_c_setVariable_68_2);
                                                _jettag_c_setVariable_68_2.doStart(context, out);
                                                _jettag_c_setVariable_68_2.doEnd();
                                                out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_69_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_28); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_69_28.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_69_28.setTagInfo(_td_c_get_69_28);
                                                _jettag_c_get_69_28.doStart(context, out);
                                                _jettag_c_get_69_28.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_69_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_78); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_69_78.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_iterate_69_78.setTagInfo(_td_c_iterate_69_78);
                                                _jettag_c_iterate_69_78.doStart(context, out);
                                                while (_jettag_c_iterate_69_78.okToProcessBody()) {
                                                    out.write("/{");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_69_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_147); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_69_147.setRuntimeParent(_jettag_c_iterate_69_78);
                                                    _jettag_c_get_69_147.setTagInfo(_td_c_get_69_147);
                                                    _jettag_c_get_69_147.doStart(context, out);
                                                    _jettag_c_get_69_147.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_69_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_182); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_69_182.setRuntimeParent(_jettag_c_iterate_69_78);
                                                    _jettag_c_get_69_182.setTagInfo(_td_c_get_69_182);
                                                    _jettag_c_get_69_182.doStart(context, out);
                                                    _jettag_c_get_69_182.doEnd();
                                                    out.write("}");  //$NON-NLS-1$        
                                                    _jettag_c_iterate_69_78.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_69_78.doEnd();
                                                out.write("/");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_69_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_231); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_69_231.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_69_231.setTagInfo(_td_c_get_69_231);
                                                _jettag_c_get_69_231.doStart(context, out);
                                                _jettag_c_get_69_231.doEnd();
                                                out.write("s\", method = RequestMethod.PUT)");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t@ResponseBody");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\tpublic ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_9); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_9.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_9.setTagInfo(_td_c_get_71_9);
                                                _jettag_c_get_71_9.doStart(context, out);
                                                _jettag_c_get_71_9.doEnd();
                                                out.write(" save");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_57); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_57.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_57.setTagInfo(_td_c_get_71_57);
                                                _jettag_c_get_71_57.doStart(context, out);
                                                _jettag_c_get_71_57.doEnd();
                                                RuntimeTagElement _jettag_c_get_71_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_107); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_107.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_107.setTagInfo(_td_c_get_71_107);
                                                _jettag_c_get_71_107.doStart(context, out);
                                                _jettag_c_get_71_107.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_71_152 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_71_152); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_71_152.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_iterate_71_152.setTagInfo(_td_c_iterate_71_152);
                                                _jettag_c_iterate_71_152.doStart(context, out);
                                                while (_jettag_c_iterate_71_152.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_71_219 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_219); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_219.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_if_71_219.setTagInfo(_td_c_if_71_219);
                                                    _jettag_c_if_71_219.doStart(context, out);
                                                    while (_jettag_c_if_71_219.okToProcessBody()) {
                                                        out.write("@PathVariable String ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_476 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_476); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_476.setRuntimeParent(_jettag_c_if_71_219);
                                                        _jettag_c_get_71_476.setTagInfo(_td_c_get_71_476);
                                                        _jettag_c_get_71_476.doStart(context, out);
                                                        _jettag_c_get_71_476.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_511 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_511); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_511.setRuntimeParent(_jettag_c_if_71_219);
                                                        _jettag_c_get_71_511.setTagInfo(_td_c_get_71_511);
                                                        _jettag_c_get_71_511.doStart(context, out);
                                                        _jettag_c_get_71_511.doEnd();
                                                        _jettag_c_if_71_219.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_219.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_553 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_553); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_553.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_if_71_553.setTagInfo(_td_c_if_71_553);
                                                    _jettag_c_if_71_553.doStart(context, out);
                                                    while (_jettag_c_if_71_553.okToProcessBody()) {
                                                        out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_730 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_730); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_730.setRuntimeParent(_jettag_c_if_71_553);
                                                        _jettag_c_get_71_730.setTagInfo(_td_c_get_71_730);
                                                        _jettag_c_get_71_730.doStart(context, out);
                                                        _jettag_c_get_71_730.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_765 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_765); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_765.setRuntimeParent(_jettag_c_if_71_553);
                                                        _jettag_c_get_71_765.setTagInfo(_td_c_get_71_765);
                                                        _jettag_c_get_71_765.doStart(context, out);
                                                        _jettag_c_get_71_765.doEnd();
                                                        _jettag_c_if_71_553.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_553.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_807 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_807); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_807.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_if_71_807.setTagInfo(_td_c_if_71_807);
                                                    _jettag_c_if_71_807.doStart(context, out);
                                                    while (_jettag_c_if_71_807.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_71_958 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_71_958); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_71_958.setRuntimeParent(_jettag_c_if_71_807);
                                                        _jettag_java_import_71_958.setTagInfo(_td_java_import_71_958);
                                                        _jettag_java_import_71_958.doStart(context, out);
                                                        JET2Writer _jettag_java_import_71_958_saved_out = out;
                                                        while (_jettag_java_import_71_958.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                                            _jettag_java_import_71_958.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_71_958_saved_out;
                                                        _jettag_java_import_71_958.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1014 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1014); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1014.setRuntimeParent(_jettag_c_if_71_807);
                                                        _jettag_c_get_71_1014.setTagInfo(_td_c_get_71_1014);
                                                        _jettag_c_get_71_1014.doStart(context, out);
                                                        _jettag_c_get_71_1014.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1049 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1049); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1049.setRuntimeParent(_jettag_c_if_71_807);
                                                        _jettag_c_get_71_1049.setTagInfo(_td_c_get_71_1049);
                                                        _jettag_c_get_71_1049.doStart(context, out);
                                                        _jettag_c_get_71_1049.doEnd();
                                                        _jettag_c_if_71_807.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_807.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_1091 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_1091); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_1091.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_if_71_1091.setTagInfo(_td_c_if_71_1091);
                                                    _jettag_c_if_71_1091.doStart(context, out);
                                                    while (_jettag_c_if_71_1091.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_71_1242 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_71_1242); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_71_1242.setRuntimeParent(_jettag_c_if_71_1091);
                                                        _jettag_java_import_71_1242.setTagInfo(_td_java_import_71_1242);
                                                        _jettag_java_import_71_1242.doStart(context, out);
                                                        JET2Writer _jettag_java_import_71_1242_saved_out = out;
                                                        while (_jettag_java_import_71_1242.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                                            _jettag_java_import_71_1242.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_71_1242_saved_out;
                                                        _jettag_java_import_71_1242.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1304 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1304); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1304.setRuntimeParent(_jettag_c_if_71_1091);
                                                        _jettag_c_get_71_1304.setTagInfo(_td_c_get_71_1304);
                                                        _jettag_c_get_71_1304.doStart(context, out);
                                                        _jettag_c_get_71_1304.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1339 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1339); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1339.setRuntimeParent(_jettag_c_if_71_1091);
                                                        _jettag_c_get_71_1339.setTagInfo(_td_c_get_71_1339);
                                                        _jettag_c_get_71_1339.doStart(context, out);
                                                        _jettag_c_get_71_1339.doEnd();
                                                        _jettag_c_if_71_1091.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_1091.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_71_1381 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_71_1381); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_71_1381.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_setVariable_71_1381.setTagInfo(_td_c_setVariable_71_1381);
                                                    _jettag_c_setVariable_71_1381.doStart(context, out);
                                                    _jettag_c_setVariable_71_1381.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_1430 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_1430); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_1430.setRuntimeParent(_jettag_c_iterate_71_152);
                                                    _jettag_c_if_71_1430.setTagInfo(_td_c_if_71_1430);
                                                    _jettag_c_if_71_1430.doStart(context, out);
                                                    while (_jettag_c_if_71_1430.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_71_1430.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_1430.doEnd();
                                                    _jettag_c_iterate_71_152.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_71_152.doEnd();
                                                out.write(", @RequestBody ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_1487 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1487); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_1487.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_1487.setTagInfo(_td_c_get_71_1487);
                                                _jettag_c_get_71_1487.doStart(context, out);
                                                _jettag_c_get_71_1487.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_1531 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1531); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_1531.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_1531.setTagInfo(_td_c_get_71_1531);
                                                _jettag_c_get_71_1531.doStart(context, out);
                                                _jettag_c_get_71_1531.doEnd();
                                                out.write("s){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_setVariable_72_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_72_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_72_3.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_setVariable_72_3.setTagInfo(_td_c_setVariable_72_3);
                                                _jettag_c_setVariable_72_3.doStart(context, out);
                                                _jettag_c_setVariable_72_3.doEnd();
                                                out.write("\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_3.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_73_3.setTagInfo(_td_c_get_73_3);
                                                _jettag_c_get_73_3.doStart(context, out);
                                                _jettag_c_get_73_3.doEnd();
                                                out.write("Service.save");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_49); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_49.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_73_49.setTagInfo(_td_c_get_73_49);
                                                _jettag_c_get_73_49.doStart(context, out);
                                                _jettag_c_get_73_49.doEnd();
                                                RuntimeTagElement _jettag_c_get_73_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_99); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_99.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_73_99.setTagInfo(_td_c_get_73_99);
                                                _jettag_c_get_73_99.doStart(context, out);
                                                _jettag_c_get_73_99.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_73_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_144); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_73_144.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_iterate_73_144.setTagInfo(_td_c_iterate_73_144);
                                                _jettag_c_iterate_73_144.doStart(context, out);
                                                while (_jettag_c_iterate_73_144.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_get_73_211 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_211); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_73_211.setRuntimeParent(_jettag_c_iterate_73_144);
                                                    _jettag_c_get_73_211.setTagInfo(_td_c_get_73_211);
                                                    _jettag_c_get_73_211.doStart(context, out);
                                                    _jettag_c_get_73_211.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_73_246 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_246); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_73_246.setRuntimeParent(_jettag_c_iterate_73_144);
                                                    _jettag_c_get_73_246.setTagInfo(_td_c_get_73_246);
                                                    _jettag_c_get_73_246.doStart(context, out);
                                                    _jettag_c_get_73_246.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_73_281 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_73_281); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_73_281.setRuntimeParent(_jettag_c_iterate_73_144);
                                                    _jettag_c_setVariable_73_281.setTagInfo(_td_c_setVariable_73_281);
                                                    _jettag_c_setVariable_73_281.doStart(context, out);
                                                    _jettag_c_setVariable_73_281.doEnd();
                                                    RuntimeTagElement _jettag_c_if_73_330 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_330); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_73_330.setRuntimeParent(_jettag_c_iterate_73_144);
                                                    _jettag_c_if_73_330.setTagInfo(_td_c_if_73_330);
                                                    _jettag_c_if_73_330.doStart(context, out);
                                                    while (_jettag_c_if_73_330.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_73_330.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_73_330.doEnd();
                                                    _jettag_c_iterate_73_144.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_73_144.doEnd();
                                                out.write(", ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_374 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_374); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_374.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_73_374.setTagInfo(_td_c_get_73_374);
                                                _jettag_c_get_73_374.doStart(context, out);
                                                _jettag_c_get_73_374.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_if_74_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_74_3.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_if_74_3.setTagInfo(_td_c_if_74_3);
                                                _jettag_c_if_74_3.doStart(context, out);
                                                while (_jettag_c_if_74_3.okToProcessBody()) {
                                                    out.write("\t\treturn ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_75_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_10); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_75_10.setRuntimeParent(_jettag_c_if_74_3);
                                                    _jettag_c_get_75_10.setTagInfo(_td_c_get_75_10);
                                                    _jettag_c_get_75_10.doStart(context, out);
                                                    _jettag_c_get_75_10.doEnd();
                                                    out.write("DAO.find");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_75_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_45); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_75_45.setRuntimeParent(_jettag_c_if_74_3);
                                                    _jettag_c_get_75_45.setTagInfo(_td_c_get_75_45);
                                                    _jettag_c_get_75_45.doStart(context, out);
                                                    _jettag_c_get_75_45.doEnd();
                                                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_iterate_75_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_75_101); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_iterate_75_101.setRuntimeParent(_jettag_c_if_74_3);
                                                    _jettag_c_iterate_75_101.setTagInfo(_td_c_iterate_75_101);
                                                    _jettag_c_iterate_75_101.doStart(context, out);
                                                    while (_jettag_c_iterate_75_101.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_get_75_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_157); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_75_157.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_get_75_157.setTagInfo(_td_c_get_75_157);
                                                        _jettag_c_get_75_157.doStart(context, out);
                                                        _jettag_c_get_75_157.doEnd();
                                                        out.write("s.get");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_75_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_189); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_75_189.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_get_75_189.setTagInfo(_td_c_get_75_189);
                                                        _jettag_c_get_75_189.doStart(context, out);
                                                        _jettag_c_get_75_189.doEnd();
                                                        out.write("()");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_setVariable_75_238 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_75_238); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_75_238.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_setVariable_75_238.setTagInfo(_td_c_setVariable_75_238);
                                                        _jettag_c_setVariable_75_238.doStart(context, out);
                                                        _jettag_c_setVariable_75_238.doEnd();
                                                        RuntimeTagElement _jettag_c_if_75_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_291); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_75_291.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_if_75_291.setTagInfo(_td_c_if_75_291);
                                                        _jettag_c_if_75_291.doStart(context, out);
                                                        while (_jettag_c_if_75_291.okToProcessBody()) {
                                                            out.write(",");  //$NON-NLS-1$        
                                                            _jettag_c_if_75_291.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_75_291.doEnd();
                                                        _jettag_c_iterate_75_101.handleBodyContent(out);
                                                    }
                                                    _jettag_c_iterate_75_101.doEnd();
                                                    out.write(");");  //$NON-NLS-1$        
                                                    out.write(NL);         
                                                    _jettag_c_if_74_3.handleBodyContent(out);
                                                }
                                                _jettag_c_if_74_3.doEnd();
                                                RuntimeTagElement _jettag_c_if_77_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_77_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_77_3.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_if_77_3.setTagInfo(_td_c_if_77_3);
                                                _jettag_c_if_77_3.doStart(context, out);
                                                while (_jettag_c_if_77_3.okToProcessBody()) {
                                                    out.write("\t\treturn ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_78_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_10); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_78_10.setRuntimeParent(_jettag_c_if_77_3);
                                                    _jettag_c_get_78_10.setTagInfo(_td_c_get_78_10);
                                                    _jettag_c_get_78_10.doStart(context, out);
                                                    _jettag_c_get_78_10.doEnd();
                                                    out.write("DAO.find");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_78_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_45); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_78_45.setRuntimeParent(_jettag_c_if_77_3);
                                                    _jettag_c_get_78_45.setTagInfo(_td_c_get_78_45);
                                                    _jettag_c_get_78_45.doStart(context, out);
                                                    _jettag_c_get_78_45.doEnd();
                                                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_iterate_78_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_78_101); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_iterate_78_101.setRuntimeParent(_jettag_c_if_77_3);
                                                    _jettag_c_iterate_78_101.setTagInfo(_td_c_iterate_78_101);
                                                    _jettag_c_iterate_78_101.doStart(context, out);
                                                    while (_jettag_c_iterate_78_101.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_get_78_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_157); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_78_157.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_get_78_157.setTagInfo(_td_c_get_78_157);
                                                        _jettag_c_get_78_157.doStart(context, out);
                                                        _jettag_c_get_78_157.doEnd();
                                                        out.write("s.get");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_78_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_189); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_78_189.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_get_78_189.setTagInfo(_td_c_get_78_189);
                                                        _jettag_c_get_78_189.doStart(context, out);
                                                        _jettag_c_get_78_189.doEnd();
                                                        out.write("Field()");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_setVariable_78_243 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_78_243); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_78_243.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_setVariable_78_243.setTagInfo(_td_c_setVariable_78_243);
                                                        _jettag_c_setVariable_78_243.doStart(context, out);
                                                        _jettag_c_setVariable_78_243.doEnd();
                                                        RuntimeTagElement _jettag_c_if_78_296 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_296); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_78_296.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_if_78_296.setTagInfo(_td_c_if_78_296);
                                                        _jettag_c_if_78_296.doStart(context, out);
                                                        while (_jettag_c_if_78_296.okToProcessBody()) {
                                                            out.write(",");  //$NON-NLS-1$        
                                                            _jettag_c_if_78_296.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_78_296.doEnd();
                                                        _jettag_c_iterate_78_101.handleBodyContent(out);
                                                    }
                                                    _jettag_c_iterate_78_101.doEnd();
                                                    out.write(");");  //$NON-NLS-1$        
                                                    out.write(NL);         
                                                    _jettag_c_if_77_3.handleBodyContent(out);
                                                }
                                                _jettag_c_if_77_3.doEnd();
                                                out.write("\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_63_2.handleBodyContent(out);
                                            }
                                            _jettag_c_if_63_2.doEnd();
                                            _jettag_c_iterate_62_2.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_62_2.doEnd();
                                        _jettag_c_otherwise_60_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_60_2_saved_out;
                                    _jettag_c_otherwise_60_2.doEnd();
                                    _jettag_c_choose_57_2.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_57_2_saved_out;
                                _jettag_c_choose_57_2.doEnd();
                                _jettag_c_iterate_56_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_56_2.doEnd();
                            _jettag_c_when_55_2.handleBodyContent(out);
                        }
                        out = _jettag_c_when_55_2_saved_out;
                        _jettag_c_when_55_2.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_87_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_87_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_87_2.setRuntimeParent(_jettag_c_choose_54_2);
                        _jettag_c_otherwise_87_2.setTagInfo(_td_c_otherwise_87_2);
                        _jettag_c_otherwise_87_2.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_87_2_saved_out = out;
                        while (_jettag_c_otherwise_87_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_setVariable_88_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_88_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_88_2.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_setVariable_88_2.setTagInfo(_td_c_setVariable_88_2);
                            _jettag_c_setVariable_88_2.doStart(context, out);
                            _jettag_c_setVariable_88_2.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_89_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_89_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_89_2.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_setVariable_89_2.setTagInfo(_td_c_setVariable_89_2);
                            _jettag_c_setVariable_89_2.doStart(context, out);
                            _jettag_c_setVariable_89_2.doEnd();
                            RuntimeTagElement _jettag_c_iterate_90_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_90_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_90_2.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_iterate_90_2.setTagInfo(_td_c_iterate_90_2);
                            _jettag_c_iterate_90_2.doStart(context, out);
                            while (_jettag_c_iterate_90_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_91_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_91_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_91_2.setRuntimeParent(_jettag_c_iterate_90_2);
                                _jettag_c_setVariable_91_2.setTagInfo(_td_c_setVariable_91_2);
                                _jettag_c_setVariable_91_2.doStart(context, out);
                                _jettag_c_setVariable_91_2.doEnd();
                                _jettag_c_iterate_90_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_90_2.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_93_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_93_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_93_2.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_setVariable_93_2.setTagInfo(_td_c_setVariable_93_2);
                            _jettag_c_setVariable_93_2.doStart(context, out);
                            _jettag_c_setVariable_93_2.doEnd();
                            out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_94_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_28); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_94_28.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_94_28.setTagInfo(_td_c_get_94_28);
                            _jettag_c_get_94_28.doStart(context, out);
                            _jettag_c_get_94_28.doEnd();
                            RuntimeTagElement _jettag_c_iterate_94_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_94_78); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_94_78.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_iterate_94_78.setTagInfo(_td_c_iterate_94_78);
                            _jettag_c_iterate_94_78.doStart(context, out);
                            while (_jettag_c_iterate_94_78.okToProcessBody()) {
                                out.write("/{");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_94_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_147); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_94_147.setRuntimeParent(_jettag_c_iterate_94_78);
                                _jettag_c_get_94_147.setTagInfo(_td_c_get_94_147);
                                _jettag_c_get_94_147.doStart(context, out);
                                _jettag_c_get_94_147.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_94_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_182); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_94_182.setRuntimeParent(_jettag_c_iterate_94_78);
                                _jettag_c_get_94_182.setTagInfo(_td_c_get_94_182);
                                _jettag_c_get_94_182.doStart(context, out);
                                _jettag_c_get_94_182.doEnd();
                                out.write("}");  //$NON-NLS-1$        
                                _jettag_c_iterate_94_78.handleBodyContent(out);
                            }
                            _jettag_c_iterate_94_78.doEnd();
                            out.write("/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_94_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_231); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_94_231.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_94_231.setTagInfo(_td_c_get_94_231);
                            _jettag_c_get_94_231.doStart(context, out);
                            _jettag_c_get_94_231.doEnd();
                            out.write("s\", method = RequestMethod.PUT)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ResponseBody");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\tpublic ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_9.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_9.setTagInfo(_td_c_get_96_9);
                            _jettag_c_get_96_9.doStart(context, out);
                            _jettag_c_get_96_9.doEnd();
                            out.write(" save");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_69); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_69.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_69.setTagInfo(_td_c_get_96_69);
                            _jettag_c_get_96_69.doStart(context, out);
                            _jettag_c_get_96_69.doEnd();
                            RuntimeTagElement _jettag_c_get_96_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_119); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_119.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_119.setTagInfo(_td_c_get_96_119);
                            _jettag_c_get_96_119.doStart(context, out);
                            _jettag_c_get_96_119.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_96_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_96_176); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_96_176.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_iterate_96_176.setTagInfo(_td_c_iterate_96_176);
                            _jettag_c_iterate_96_176.doStart(context, out);
                            while (_jettag_c_iterate_96_176.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_96_243 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_243); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_243.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_if_96_243.setTagInfo(_td_c_if_96_243);
                                _jettag_c_if_96_243.doStart(context, out);
                                while (_jettag_c_if_96_243.okToProcessBody()) {
                                    out.write("@PathVariable String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_500 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_500); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_500.setRuntimeParent(_jettag_c_if_96_243);
                                    _jettag_c_get_96_500.setTagInfo(_td_c_get_96_500);
                                    _jettag_c_get_96_500.doStart(context, out);
                                    _jettag_c_get_96_500.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_535 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_535); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_535.setRuntimeParent(_jettag_c_if_96_243);
                                    _jettag_c_get_96_535.setTagInfo(_td_c_get_96_535);
                                    _jettag_c_get_96_535.doStart(context, out);
                                    _jettag_c_get_96_535.doEnd();
                                    _jettag_c_if_96_243.handleBodyContent(out);
                                }
                                _jettag_c_if_96_243.doEnd();
                                RuntimeTagElement _jettag_c_if_96_577 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_577); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_577.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_if_96_577.setTagInfo(_td_c_if_96_577);
                                _jettag_c_if_96_577.doStart(context, out);
                                while (_jettag_c_if_96_577.okToProcessBody()) {
                                    out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_754 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_754); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_754.setRuntimeParent(_jettag_c_if_96_577);
                                    _jettag_c_get_96_754.setTagInfo(_td_c_get_96_754);
                                    _jettag_c_get_96_754.doStart(context, out);
                                    _jettag_c_get_96_754.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_789 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_789); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_789.setRuntimeParent(_jettag_c_if_96_577);
                                    _jettag_c_get_96_789.setTagInfo(_td_c_get_96_789);
                                    _jettag_c_get_96_789.doStart(context, out);
                                    _jettag_c_get_96_789.doEnd();
                                    _jettag_c_if_96_577.handleBodyContent(out);
                                }
                                _jettag_c_if_96_577.doEnd();
                                RuntimeTagElement _jettag_c_if_96_831 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_831); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_831.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_if_96_831.setTagInfo(_td_c_if_96_831);
                                _jettag_c_if_96_831.doStart(context, out);
                                while (_jettag_c_if_96_831.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_96_982 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_96_982); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_96_982.setRuntimeParent(_jettag_c_if_96_831);
                                    _jettag_java_import_96_982.setTagInfo(_td_java_import_96_982);
                                    _jettag_java_import_96_982.doStart(context, out);
                                    JET2Writer _jettag_java_import_96_982_saved_out = out;
                                    while (_jettag_java_import_96_982.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_96_982.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_96_982_saved_out;
                                    _jettag_java_import_96_982.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1038 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1038); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1038.setRuntimeParent(_jettag_c_if_96_831);
                                    _jettag_c_get_96_1038.setTagInfo(_td_c_get_96_1038);
                                    _jettag_c_get_96_1038.doStart(context, out);
                                    _jettag_c_get_96_1038.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1073 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1073); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1073.setRuntimeParent(_jettag_c_if_96_831);
                                    _jettag_c_get_96_1073.setTagInfo(_td_c_get_96_1073);
                                    _jettag_c_get_96_1073.doStart(context, out);
                                    _jettag_c_get_96_1073.doEnd();
                                    _jettag_c_if_96_831.handleBodyContent(out);
                                }
                                _jettag_c_if_96_831.doEnd();
                                RuntimeTagElement _jettag_c_if_96_1115 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_1115); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_1115.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_if_96_1115.setTagInfo(_td_c_if_96_1115);
                                _jettag_c_if_96_1115.doStart(context, out);
                                while (_jettag_c_if_96_1115.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_96_1266 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_96_1266); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_96_1266.setRuntimeParent(_jettag_c_if_96_1115);
                                    _jettag_java_import_96_1266.setTagInfo(_td_java_import_96_1266);
                                    _jettag_java_import_96_1266.doStart(context, out);
                                    JET2Writer _jettag_java_import_96_1266_saved_out = out;
                                    while (_jettag_java_import_96_1266.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_96_1266.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_96_1266_saved_out;
                                    _jettag_java_import_96_1266.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1328 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1328); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1328.setRuntimeParent(_jettag_c_if_96_1115);
                                    _jettag_c_get_96_1328.setTagInfo(_td_c_get_96_1328);
                                    _jettag_c_get_96_1328.doStart(context, out);
                                    _jettag_c_get_96_1328.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1363 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1363); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1363.setRuntimeParent(_jettag_c_if_96_1115);
                                    _jettag_c_get_96_1363.setTagInfo(_td_c_get_96_1363);
                                    _jettag_c_get_96_1363.doStart(context, out);
                                    _jettag_c_get_96_1363.doEnd();
                                    _jettag_c_if_96_1115.handleBodyContent(out);
                                }
                                _jettag_c_if_96_1115.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_96_1405 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_96_1405); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_96_1405.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_setVariable_96_1405.setTagInfo(_td_c_setVariable_96_1405);
                                _jettag_c_setVariable_96_1405.doStart(context, out);
                                _jettag_c_setVariable_96_1405.doEnd();
                                RuntimeTagElement _jettag_c_if_96_1454 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_1454); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_1454.setRuntimeParent(_jettag_c_iterate_96_176);
                                _jettag_c_if_96_1454.setTagInfo(_td_c_if_96_1454);
                                _jettag_c_if_96_1454.doStart(context, out);
                                while (_jettag_c_if_96_1454.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_96_1454.handleBodyContent(out);
                                }
                                _jettag_c_if_96_1454.doEnd();
                                _jettag_c_iterate_96_176.handleBodyContent(out);
                            }
                            _jettag_c_iterate_96_176.doEnd();
                            out.write(", @RequestBody ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_1511 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1511); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_1511.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_1511.setTagInfo(_td_c_get_96_1511);
                            _jettag_c_get_96_1511.doStart(context, out);
                            _jettag_c_get_96_1511.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_1567 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1567); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_1567.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_1567.setTagInfo(_td_c_get_96_1567);
                            _jettag_c_get_96_1567.doStart(context, out);
                            _jettag_c_get_96_1567.doEnd();
                            out.write("s){");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_setVariable_97_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_97_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_97_3.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_setVariable_97_3.setTagInfo(_td_c_setVariable_97_3);
                            _jettag_c_setVariable_97_3.doStart(context, out);
                            _jettag_c_setVariable_97_3.doEnd();
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_98_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_98_3.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_98_3.setTagInfo(_td_c_get_98_3);
                            _jettag_c_get_98_3.doStart(context, out);
                            _jettag_c_get_98_3.doEnd();
                            out.write("Service.save");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_98_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_49); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_98_49.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_98_49.setTagInfo(_td_c_get_98_49);
                            _jettag_c_get_98_49.doStart(context, out);
                            _jettag_c_get_98_49.doEnd();
                            RuntimeTagElement _jettag_c_get_98_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_99); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_98_99.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_98_99.setTagInfo(_td_c_get_98_99);
                            _jettag_c_get_98_99.doStart(context, out);
                            _jettag_c_get_98_99.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_98_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_98_156); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_98_156.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_iterate_98_156.setTagInfo(_td_c_iterate_98_156);
                            _jettag_c_iterate_98_156.doStart(context, out);
                            while (_jettag_c_iterate_98_156.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_get_98_223 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_223); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_98_223.setRuntimeParent(_jettag_c_iterate_98_156);
                                _jettag_c_get_98_223.setTagInfo(_td_c_get_98_223);
                                _jettag_c_get_98_223.doStart(context, out);
                                _jettag_c_get_98_223.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_98_258 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_258); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_98_258.setRuntimeParent(_jettag_c_iterate_98_156);
                                _jettag_c_get_98_258.setTagInfo(_td_c_get_98_258);
                                _jettag_c_get_98_258.doStart(context, out);
                                _jettag_c_get_98_258.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_98_293 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_98_293); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_98_293.setRuntimeParent(_jettag_c_iterate_98_156);
                                _jettag_c_setVariable_98_293.setTagInfo(_td_c_setVariable_98_293);
                                _jettag_c_setVariable_98_293.doStart(context, out);
                                _jettag_c_setVariable_98_293.doEnd();
                                RuntimeTagElement _jettag_c_if_98_342 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_98_342); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_98_342.setRuntimeParent(_jettag_c_iterate_98_156);
                                _jettag_c_if_98_342.setTagInfo(_td_c_if_98_342);
                                _jettag_c_if_98_342.doStart(context, out);
                                while (_jettag_c_if_98_342.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_98_342.handleBodyContent(out);
                                }
                                _jettag_c_if_98_342.doEnd();
                                _jettag_c_iterate_98_156.handleBodyContent(out);
                            }
                            _jettag_c_iterate_98_156.doEnd();
                            out.write(", ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_98_386 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_386); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_98_386.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_98_386.setTagInfo(_td_c_get_98_386);
                            _jettag_c_get_98_386.doStart(context, out);
                            _jettag_c_get_98_386.doEnd();
                            out.write("s);");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_if_99_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_99_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_99_3.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_if_99_3.setTagInfo(_td_c_if_99_3);
                            _jettag_c_if_99_3.doStart(context, out);
                            while (_jettag_c_if_99_3.okToProcessBody()) {
                                out.write("\t\treturn ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_100_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_10); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_100_10.setRuntimeParent(_jettag_c_if_99_3);
                                _jettag_c_get_100_10.setTagInfo(_td_c_get_100_10);
                                _jettag_c_get_100_10.doStart(context, out);
                                _jettag_c_get_100_10.doEnd();
                                out.write("DAO.find");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_100_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_57); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_100_57.setRuntimeParent(_jettag_c_if_99_3);
                                _jettag_c_get_100_57.setTagInfo(_td_c_get_100_57);
                                _jettag_c_get_100_57.doStart(context, out);
                                _jettag_c_get_100_57.doEnd();
                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_100_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_100_125); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_100_125.setRuntimeParent(_jettag_c_if_99_3);
                                _jettag_c_iterate_100_125.setTagInfo(_td_c_iterate_100_125);
                                _jettag_c_iterate_100_125.doStart(context, out);
                                while (_jettag_c_iterate_100_125.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_get_100_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_193); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_100_193.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_get_100_193.setTagInfo(_td_c_get_100_193);
                                    _jettag_c_get_100_193.doStart(context, out);
                                    _jettag_c_get_100_193.doEnd();
                                    out.write("s.get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_100_237 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_237); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_100_237.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_get_100_237.setTagInfo(_td_c_get_100_237);
                                    _jettag_c_get_100_237.doStart(context, out);
                                    _jettag_c_get_100_237.doEnd();
                                    out.write("()");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_setVariable_100_286 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_100_286); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_100_286.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_setVariable_100_286.setTagInfo(_td_c_setVariable_100_286);
                                    _jettag_c_setVariable_100_286.doStart(context, out);
                                    _jettag_c_setVariable_100_286.doEnd();
                                    RuntimeTagElement _jettag_c_if_100_339 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_100_339); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_100_339.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_if_100_339.setTagInfo(_td_c_if_100_339);
                                    _jettag_c_if_100_339.doStart(context, out);
                                    while (_jettag_c_if_100_339.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_100_339.handleBodyContent(out);
                                    }
                                    _jettag_c_if_100_339.doEnd();
                                    _jettag_c_iterate_100_125.handleBodyContent(out);
                                }
                                _jettag_c_iterate_100_125.doEnd();
                                out.write(");");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_99_3.handleBodyContent(out);
                            }
                            _jettag_c_if_99_3.doEnd();
                            RuntimeTagElement _jettag_c_if_102_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_102_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_102_3.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_if_102_3.setTagInfo(_td_c_if_102_3);
                            _jettag_c_if_102_3.doStart(context, out);
                            while (_jettag_c_if_102_3.okToProcessBody()) {
                                out.write("\t\treturn ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_103_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_10); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_103_10.setRuntimeParent(_jettag_c_if_102_3);
                                _jettag_c_get_103_10.setTagInfo(_td_c_get_103_10);
                                _jettag_c_get_103_10.doStart(context, out);
                                _jettag_c_get_103_10.doEnd();
                                out.write("DAO.find");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_103_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_57); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_103_57.setRuntimeParent(_jettag_c_if_102_3);
                                _jettag_c_get_103_57.setTagInfo(_td_c_get_103_57);
                                _jettag_c_get_103_57.doStart(context, out);
                                _jettag_c_get_103_57.doEnd();
                                out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_103_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_103_125); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_103_125.setRuntimeParent(_jettag_c_if_102_3);
                                _jettag_c_iterate_103_125.setTagInfo(_td_c_iterate_103_125);
                                _jettag_c_iterate_103_125.doStart(context, out);
                                while (_jettag_c_iterate_103_125.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_get_103_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_193); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_103_193.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_get_103_193.setTagInfo(_td_c_get_103_193);
                                    _jettag_c_get_103_193.doStart(context, out);
                                    _jettag_c_get_103_193.doEnd();
                                    out.write("s.get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_103_237 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_237); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_103_237.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_get_103_237.setTagInfo(_td_c_get_103_237);
                                    _jettag_c_get_103_237.doStart(context, out);
                                    _jettag_c_get_103_237.doEnd();
                                    out.write("Field()");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_setVariable_103_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_103_291); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_103_291.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_setVariable_103_291.setTagInfo(_td_c_setVariable_103_291);
                                    _jettag_c_setVariable_103_291.doStart(context, out);
                                    _jettag_c_setVariable_103_291.doEnd();
                                    RuntimeTagElement _jettag_c_if_103_344 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_103_344); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_103_344.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_if_103_344.setTagInfo(_td_c_if_103_344);
                                    _jettag_c_if_103_344.doStart(context, out);
                                    while (_jettag_c_if_103_344.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_103_344.handleBodyContent(out);
                                    }
                                    _jettag_c_if_103_344.doEnd();
                                    _jettag_c_iterate_103_125.handleBodyContent(out);
                                }
                                _jettag_c_iterate_103_125.doEnd();
                                out.write(");");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_102_3.handleBodyContent(out);
                            }
                            _jettag_c_if_102_3.doEnd();
                            out.write("\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_87_2.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_87_2_saved_out;
                        _jettag_c_otherwise_87_2.doEnd();
                        _jettag_c_choose_54_2.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_54_2_saved_out;
                    _jettag_c_choose_54_2.doEnd();
                    _jettag_c_if_45_2.handleBodyContent(out);
                }
                _jettag_c_if_45_2.doEnd();
                _jettag_c_iterate_44_2.handleBodyContent(out);
            }
            _jettag_c_iterate_44_2.doEnd();
            _jettag_c_iterate_43_2.handleBodyContent(out);
        }
        _jettag_c_iterate_43_2.doEnd();
    }
}
