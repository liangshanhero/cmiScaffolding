package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_new implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_new() {
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
    private static final TagInfo _td_c_get_8_63 = new TagInfo("c:get", //$NON-NLS-1$
            8, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_127 = new TagInfo("c:get", //$NON-NLS-1$
            8, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_178 = new TagInfo("c:get", //$NON-NLS-1$
            8, 178,
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
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_9 = new TagInfo("c:get", //$NON-NLS-1$
            29, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_64 = new TagInfo("c:get", //$NON-NLS-1$
            29, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_114 = new TagInfo("c:get", //$NON-NLS-1$
            29, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_166 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 166,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_233 = new TagInfo("c:if", //$NON-NLS-1$
            29, 233,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_490 = new TagInfo("c:get", //$NON-NLS-1$
            29, 490,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_525 = new TagInfo("c:get", //$NON-NLS-1$
            29, 525,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_567 = new TagInfo("c:if", //$NON-NLS-1$
            29, 567,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_744 = new TagInfo("c:get", //$NON-NLS-1$
            29, 744,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_779 = new TagInfo("c:get", //$NON-NLS-1$
            29, 779,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_821 = new TagInfo("c:if", //$NON-NLS-1$
            29, 821,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_972 = new TagInfo("java:import", //$NON-NLS-1$
            29, 972,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_1028 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1028,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1063 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1063,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1105 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1105,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_1256 = new TagInfo("java:import", //$NON-NLS-1$
            29, 1256,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_1318 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1318,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1353 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1353,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_1395 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 1395,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1444 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1444,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1501 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1501,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1553 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1553,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
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
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_151 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 151,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_218 = new TagInfo("c:get", //$NON-NLS-1$
            31, 218,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_253 = new TagInfo("c:get", //$NON-NLS-1$
            31, 253,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_31_288 = new TagInfo("c:setVariable", //$NON-NLS-1$
            31, 288,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_337 = new TagInfo("c:if", //$NON-NLS-1$
            31, 337,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_381 = new TagInfo("c:get", //$NON-NLS-1$
            31, 381,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
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
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_53 = new TagInfo("c:get", //$NON-NLS-1$
            33, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_117 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 117,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_181 = new TagInfo("c:get", //$NON-NLS-1$
            33, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_220 = new TagInfo("c:get", //$NON-NLS-1$
            33, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_269 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 269,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_322 = new TagInfo("c:if", //$NON-NLS-1$
            33, 322,
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
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_53 = new TagInfo("c:get", //$NON-NLS-1$
            36, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_117 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 117,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_181 = new TagInfo("c:get", //$NON-NLS-1$
            36, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_220 = new TagInfo("c:get", //$NON-NLS-1$
            36, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_274 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 274,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_327 = new TagInfo("c:if", //$NON-NLS-1$
            36, 327,
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
    private static final TagInfo _td_c_get_71_56 = new TagInfo("c:get", //$NON-NLS-1$
            71, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_106 = new TagInfo("c:get", //$NON-NLS-1$
            71, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_71_151 = new TagInfo("c:iterate", //$NON-NLS-1$
            71, 151,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_218 = new TagInfo("c:if", //$NON-NLS-1$
            71, 218,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_475 = new TagInfo("c:get", //$NON-NLS-1$
            71, 475,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_510 = new TagInfo("c:get", //$NON-NLS-1$
            71, 510,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_552 = new TagInfo("c:if", //$NON-NLS-1$
            71, 552,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_729 = new TagInfo("c:get", //$NON-NLS-1$
            71, 729,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_764 = new TagInfo("c:get", //$NON-NLS-1$
            71, 764,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_806 = new TagInfo("c:if", //$NON-NLS-1$
            71, 806,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_71_957 = new TagInfo("java:import", //$NON-NLS-1$
            71, 957,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_71_1013 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1013,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1048 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1048,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_1090 = new TagInfo("c:if", //$NON-NLS-1$
            71, 1090,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_71_1241 = new TagInfo("java:import", //$NON-NLS-1$
            71, 1241,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_71_1303 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1303,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1338 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1338,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_71_1380 = new TagInfo("c:setVariable", //$NON-NLS-1$
            71, 1380,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_1429 = new TagInfo("c:if", //$NON-NLS-1$
            71, 1429,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1486 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1486,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_1530 = new TagInfo("c:get", //$NON-NLS-1$
            71, 1530,
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
    private static final TagInfo _td_c_get_75_188 = new TagInfo("c:get", //$NON-NLS-1$
            75, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_75_237 = new TagInfo("c:setVariable", //$NON-NLS-1$
            75, 237,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_290 = new TagInfo("c:if", //$NON-NLS-1$
            75, 290,
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
    private static final TagInfo _td_c_get_78_188 = new TagInfo("c:get", //$NON-NLS-1$
            78, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_78_242 = new TagInfo("c:setVariable", //$NON-NLS-1$
            78, 242,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_78_295 = new TagInfo("c:if", //$NON-NLS-1$
            78, 295,
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
    private static final TagInfo _td_c_get_96_68 = new TagInfo("c:get", //$NON-NLS-1$
            96, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_118 = new TagInfo("c:get", //$NON-NLS-1$
            96, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_96_175 = new TagInfo("c:iterate", //$NON-NLS-1$
            96, 175,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_242 = new TagInfo("c:if", //$NON-NLS-1$
            96, 242,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_499 = new TagInfo("c:get", //$NON-NLS-1$
            96, 499,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_534 = new TagInfo("c:get", //$NON-NLS-1$
            96, 534,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_576 = new TagInfo("c:if", //$NON-NLS-1$
            96, 576,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_753 = new TagInfo("c:get", //$NON-NLS-1$
            96, 753,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_788 = new TagInfo("c:get", //$NON-NLS-1$
            96, 788,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_830 = new TagInfo("c:if", //$NON-NLS-1$
            96, 830,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_96_981 = new TagInfo("java:import", //$NON-NLS-1$
            96, 981,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_96_1037 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1037,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1072 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1072,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_1114 = new TagInfo("c:if", //$NON-NLS-1$
            96, 1114,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_96_1265 = new TagInfo("java:import", //$NON-NLS-1$
            96, 1265,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_96_1327 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1327,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1362 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1362,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_96_1404 = new TagInfo("c:setVariable", //$NON-NLS-1$
            96, 1404,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_1453 = new TagInfo("c:if", //$NON-NLS-1$
            96, 1453,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1510 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1510,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_1566 = new TagInfo("c:get", //$NON-NLS-1$
            96, 1566,
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
    private static final TagInfo _td_c_get_100_236 = new TagInfo("c:get", //$NON-NLS-1$
            100, 236,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_100_285 = new TagInfo("c:setVariable", //$NON-NLS-1$
            100, 285,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_100_338 = new TagInfo("c:if", //$NON-NLS-1$
            100, 338,
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
    private static final TagInfo _td_c_get_103_236 = new TagInfo("c:get", //$NON-NLS-1$
            103, 236,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($priKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_103_290 = new TagInfo("c:setVariable", //$NON-NLS-1$
            103, 290,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_103_343 = new TagInfo("c:if", //$NON-NLS-1$
            103, 343,
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
        out.write("\", method = RequestMethod.POST)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@ResponseBody");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write(" new");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_63.setRuntimeParent(null);
        _jettag_c_get_8_63.setTagInfo(_td_c_get_8_63);
        _jettag_c_get_8_63.doStart(context, out);
        _jettag_c_get_8_63.doEnd();
        out.write("(@RequestBody ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_127); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_127.setRuntimeParent(null);
        _jettag_c_get_8_127.setTagInfo(_td_c_get_8_127);
        _jettag_c_get_8_127.doStart(context, out);
        _jettag_c_get_8_127.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_178 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_178); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_178.setRuntimeParent(null);
        _jettag_c_get_8_178.setTagInfo(_td_c_get_8_178);
        _jettag_c_get_8_178.doStart(context, out);
        _jettag_c_get_8_178.doEnd();
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
                    out.write("\", method = RequestMethod.POST)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@ResponseBody");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_9.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_9.setTagInfo(_td_c_get_29_9);
                    _jettag_c_get_29_9.doStart(context, out);
                    _jettag_c_get_29_9.doEnd();
                    out.write(" new");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_64.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_64.setTagInfo(_td_c_get_29_64);
                    _jettag_c_get_29_64.doStart(context, out);
                    _jettag_c_get_29_64.doEnd();
                    RuntimeTagElement _jettag_c_get_29_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_114); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_114.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_114.setTagInfo(_td_c_get_29_114);
                    _jettag_c_get_29_114.doStart(context, out);
                    _jettag_c_get_29_114.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_29_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_29_166.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_29_166.setTagInfo(_td_c_iterate_29_166);
                    _jettag_c_iterate_29_166.doStart(context, out);
                    while (_jettag_c_iterate_29_166.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_29_233 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_233); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_233.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_if_29_233.setTagInfo(_td_c_if_29_233);
                        _jettag_c_if_29_233.doStart(context, out);
                        while (_jettag_c_if_29_233.okToProcessBody()) {
                            out.write("@PathVariable String ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_490 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_490); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_490.setRuntimeParent(_jettag_c_if_29_233);
                            _jettag_c_get_29_490.setTagInfo(_td_c_get_29_490);
                            _jettag_c_get_29_490.doStart(context, out);
                            _jettag_c_get_29_490.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_525 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_525); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_525.setRuntimeParent(_jettag_c_if_29_233);
                            _jettag_c_get_29_525.setTagInfo(_td_c_get_29_525);
                            _jettag_c_get_29_525.doStart(context, out);
                            _jettag_c_get_29_525.doEnd();
                            _jettag_c_if_29_233.handleBodyContent(out);
                        }
                        _jettag_c_if_29_233.doEnd();
                        RuntimeTagElement _jettag_c_if_29_567 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_567); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_567.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_if_29_567.setTagInfo(_td_c_if_29_567);
                        _jettag_c_if_29_567.doStart(context, out);
                        while (_jettag_c_if_29_567.okToProcessBody()) {
                            out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_744 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_744); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_744.setRuntimeParent(_jettag_c_if_29_567);
                            _jettag_c_get_29_744.setTagInfo(_td_c_get_29_744);
                            _jettag_c_get_29_744.doStart(context, out);
                            _jettag_c_get_29_744.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_779 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_779); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_779.setRuntimeParent(_jettag_c_if_29_567);
                            _jettag_c_get_29_779.setTagInfo(_td_c_get_29_779);
                            _jettag_c_get_29_779.doStart(context, out);
                            _jettag_c_get_29_779.doEnd();
                            _jettag_c_if_29_567.handleBodyContent(out);
                        }
                        _jettag_c_if_29_567.doEnd();
                        RuntimeTagElement _jettag_c_if_29_821 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_821); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_821.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_if_29_821.setTagInfo(_td_c_if_29_821);
                        _jettag_c_if_29_821.doStart(context, out);
                        while (_jettag_c_if_29_821.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_29_972 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_972); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_29_972.setRuntimeParent(_jettag_c_if_29_821);
                            _jettag_java_import_29_972.setTagInfo(_td_java_import_29_972);
                            _jettag_java_import_29_972.doStart(context, out);
                            JET2Writer _jettag_java_import_29_972_saved_out = out;
                            while (_jettag_java_import_29_972.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                _jettag_java_import_29_972.handleBodyContent(out);
                            }
                            out = _jettag_java_import_29_972_saved_out;
                            _jettag_java_import_29_972.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1028 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1028); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1028.setRuntimeParent(_jettag_c_if_29_821);
                            _jettag_c_get_29_1028.setTagInfo(_td_c_get_29_1028);
                            _jettag_c_get_29_1028.doStart(context, out);
                            _jettag_c_get_29_1028.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1063 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1063); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1063.setRuntimeParent(_jettag_c_if_29_821);
                            _jettag_c_get_29_1063.setTagInfo(_td_c_get_29_1063);
                            _jettag_c_get_29_1063.doStart(context, out);
                            _jettag_c_get_29_1063.doEnd();
                            _jettag_c_if_29_821.handleBodyContent(out);
                        }
                        _jettag_c_if_29_821.doEnd();
                        RuntimeTagElement _jettag_c_if_29_1105 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1105); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_1105.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_if_29_1105.setTagInfo(_td_c_if_29_1105);
                        _jettag_c_if_29_1105.doStart(context, out);
                        while (_jettag_c_if_29_1105.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_29_1256 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_1256); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_29_1256.setRuntimeParent(_jettag_c_if_29_1105);
                            _jettag_java_import_29_1256.setTagInfo(_td_java_import_29_1256);
                            _jettag_java_import_29_1256.doStart(context, out);
                            JET2Writer _jettag_java_import_29_1256_saved_out = out;
                            while (_jettag_java_import_29_1256.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                _jettag_java_import_29_1256.handleBodyContent(out);
                            }
                            out = _jettag_java_import_29_1256_saved_out;
                            _jettag_java_import_29_1256.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1318 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1318); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1318.setRuntimeParent(_jettag_c_if_29_1105);
                            _jettag_c_get_29_1318.setTagInfo(_td_c_get_29_1318);
                            _jettag_c_get_29_1318.doStart(context, out);
                            _jettag_c_get_29_1318.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1353 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1353); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1353.setRuntimeParent(_jettag_c_if_29_1105);
                            _jettag_c_get_29_1353.setTagInfo(_td_c_get_29_1353);
                            _jettag_c_get_29_1353.doStart(context, out);
                            _jettag_c_get_29_1353.doEnd();
                            _jettag_c_if_29_1105.handleBodyContent(out);
                        }
                        _jettag_c_if_29_1105.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_29_1395 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_1395); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_29_1395.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_setVariable_29_1395.setTagInfo(_td_c_setVariable_29_1395);
                        _jettag_c_setVariable_29_1395.doStart(context, out);
                        _jettag_c_setVariable_29_1395.doEnd();
                        RuntimeTagElement _jettag_c_if_29_1444 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1444); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_1444.setRuntimeParent(_jettag_c_iterate_29_166);
                        _jettag_c_if_29_1444.setTagInfo(_td_c_if_29_1444);
                        _jettag_c_if_29_1444.doStart(context, out);
                        while (_jettag_c_if_29_1444.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_29_1444.handleBodyContent(out);
                        }
                        _jettag_c_if_29_1444.doEnd();
                        _jettag_c_iterate_29_166.handleBodyContent(out);
                    }
                    _jettag_c_iterate_29_166.doEnd();
                    out.write(", @RequestBody ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_1501 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1501); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_1501.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_1501.setTagInfo(_td_c_get_29_1501);
                    _jettag_c_get_29_1501.doStart(context, out);
                    _jettag_c_get_29_1501.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_1553 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1553); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_1553.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_29_1553.setTagInfo(_td_c_get_29_1553);
                    _jettag_c_get_29_1553.doStart(context, out);
                    _jettag_c_get_29_1553.doEnd();
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
                    RuntimeTagElement _jettag_c_iterate_31_151 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_151); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_31_151.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_iterate_31_151.setTagInfo(_td_c_iterate_31_151);
                    _jettag_c_iterate_31_151.doStart(context, out);
                    while (_jettag_c_iterate_31_151.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_31_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_218); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_31_218.setRuntimeParent(_jettag_c_iterate_31_151);
                        _jettag_c_get_31_218.setTagInfo(_td_c_get_31_218);
                        _jettag_c_get_31_218.doStart(context, out);
                        _jettag_c_get_31_218.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_31_253 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_253); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_31_253.setRuntimeParent(_jettag_c_iterate_31_151);
                        _jettag_c_get_31_253.setTagInfo(_td_c_get_31_253);
                        _jettag_c_get_31_253.doStart(context, out);
                        _jettag_c_get_31_253.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_31_288 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_31_288); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_31_288.setRuntimeParent(_jettag_c_iterate_31_151);
                        _jettag_c_setVariable_31_288.setTagInfo(_td_c_setVariable_31_288);
                        _jettag_c_setVariable_31_288.doStart(context, out);
                        _jettag_c_setVariable_31_288.doEnd();
                        RuntimeTagElement _jettag_c_if_31_337 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_337); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_31_337.setRuntimeParent(_jettag_c_iterate_31_151);
                        _jettag_c_if_31_337.setTagInfo(_td_c_if_31_337);
                        _jettag_c_if_31_337.doStart(context, out);
                        while (_jettag_c_if_31_337.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_31_337.handleBodyContent(out);
                        }
                        _jettag_c_if_31_337.doEnd();
                        _jettag_c_iterate_31_151.handleBodyContent(out);
                    }
                    _jettag_c_iterate_31_151.doEnd();
                    out.write(", ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_381 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_381); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_381.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_31_381.setTagInfo(_td_c_get_31_381);
                    _jettag_c_get_31_381.doStart(context, out);
                    _jettag_c_get_31_381.doEnd();
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
                        RuntimeTagElement _jettag_c_get_33_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_53); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_33_53.setRuntimeParent(_jettag_c_if_32_3);
                        _jettag_c_get_33_53.setTagInfo(_td_c_get_33_53);
                        _jettag_c_get_33_53.doStart(context, out);
                        _jettag_c_get_33_53.doEnd();
                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_33_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_117); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_33_117.setRuntimeParent(_jettag_c_if_32_3);
                        _jettag_c_iterate_33_117.setTagInfo(_td_c_iterate_33_117);
                        _jettag_c_iterate_33_117.doStart(context, out);
                        while (_jettag_c_iterate_33_117.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_get_33_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_181); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_181.setRuntimeParent(_jettag_c_iterate_33_117);
                            _jettag_c_get_33_181.setTagInfo(_td_c_get_33_181);
                            _jettag_c_get_33_181.doStart(context, out);
                            _jettag_c_get_33_181.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_33_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_220); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_33_220.setRuntimeParent(_jettag_c_iterate_33_117);
                            _jettag_c_get_33_220.setTagInfo(_td_c_get_33_220);
                            _jettag_c_get_33_220.doStart(context, out);
                            _jettag_c_get_33_220.doEnd();
                            out.write("()");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_setVariable_33_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_269); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_33_269.setRuntimeParent(_jettag_c_iterate_33_117);
                            _jettag_c_setVariable_33_269.setTagInfo(_td_c_setVariable_33_269);
                            _jettag_c_setVariable_33_269.doStart(context, out);
                            _jettag_c_setVariable_33_269.doEnd();
                            RuntimeTagElement _jettag_c_if_33_322 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_322); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_33_322.setRuntimeParent(_jettag_c_iterate_33_117);
                            _jettag_c_if_33_322.setTagInfo(_td_c_if_33_322);
                            _jettag_c_if_33_322.doStart(context, out);
                            while (_jettag_c_if_33_322.okToProcessBody()) {
                                out.write(",");  //$NON-NLS-1$        
                                _jettag_c_if_33_322.handleBodyContent(out);
                            }
                            _jettag_c_if_33_322.doEnd();
                            _jettag_c_iterate_33_117.handleBodyContent(out);
                        }
                        _jettag_c_iterate_33_117.doEnd();
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
                        RuntimeTagElement _jettag_c_get_36_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_53); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_36_53.setRuntimeParent(_jettag_c_if_35_3);
                        _jettag_c_get_36_53.setTagInfo(_td_c_get_36_53);
                        _jettag_c_get_36_53.doStart(context, out);
                        _jettag_c_get_36_53.doEnd();
                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_iterate_36_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_117); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_36_117.setRuntimeParent(_jettag_c_if_35_3);
                        _jettag_c_iterate_36_117.setTagInfo(_td_c_iterate_36_117);
                        _jettag_c_iterate_36_117.doStart(context, out);
                        while (_jettag_c_iterate_36_117.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_get_36_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_181); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_36_181.setRuntimeParent(_jettag_c_iterate_36_117);
                            _jettag_c_get_36_181.setTagInfo(_td_c_get_36_181);
                            _jettag_c_get_36_181.doStart(context, out);
                            _jettag_c_get_36_181.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_36_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_220); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_36_220.setRuntimeParent(_jettag_c_iterate_36_117);
                            _jettag_c_get_36_220.setTagInfo(_td_c_get_36_220);
                            _jettag_c_get_36_220.doStart(context, out);
                            _jettag_c_get_36_220.doEnd();
                            out.write("Field()");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_setVariable_36_274 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_274); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_36_274.setRuntimeParent(_jettag_c_iterate_36_117);
                            _jettag_c_setVariable_36_274.setTagInfo(_td_c_setVariable_36_274);
                            _jettag_c_setVariable_36_274.doStart(context, out);
                            _jettag_c_setVariable_36_274.doEnd();
                            RuntimeTagElement _jettag_c_if_36_327 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_327); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_36_327.setRuntimeParent(_jettag_c_iterate_36_117);
                            _jettag_c_if_36_327.setTagInfo(_td_c_if_36_327);
                            _jettag_c_if_36_327.doStart(context, out);
                            while (_jettag_c_if_36_327.okToProcessBody()) {
                                out.write(",");  //$NON-NLS-1$        
                                _jettag_c_if_36_327.handleBodyContent(out);
                            }
                            _jettag_c_if_36_327.doEnd();
                            _jettag_c_iterate_36_117.handleBodyContent(out);
                        }
                        _jettag_c_iterate_36_117.doEnd();
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
                                                out.write("s\", method = RequestMethod.POST)");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t@ResponseBody");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\tpublic ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_9); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_9.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_9.setTagInfo(_td_c_get_71_9);
                                                _jettag_c_get_71_9.doStart(context, out);
                                                _jettag_c_get_71_9.doEnd();
                                                out.write(" new");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_56); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_56.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_56.setTagInfo(_td_c_get_71_56);
                                                _jettag_c_get_71_56.doStart(context, out);
                                                _jettag_c_get_71_56.doEnd();
                                                RuntimeTagElement _jettag_c_get_71_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_106); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_106.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_106.setTagInfo(_td_c_get_71_106);
                                                _jettag_c_get_71_106.doStart(context, out);
                                                _jettag_c_get_71_106.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_71_151 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_71_151); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_71_151.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_iterate_71_151.setTagInfo(_td_c_iterate_71_151);
                                                _jettag_c_iterate_71_151.doStart(context, out);
                                                while (_jettag_c_iterate_71_151.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_71_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_218); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_218.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_if_71_218.setTagInfo(_td_c_if_71_218);
                                                    _jettag_c_if_71_218.doStart(context, out);
                                                    while (_jettag_c_if_71_218.okToProcessBody()) {
                                                        out.write("@PathVariable String ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_475 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_475); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_475.setRuntimeParent(_jettag_c_if_71_218);
                                                        _jettag_c_get_71_475.setTagInfo(_td_c_get_71_475);
                                                        _jettag_c_get_71_475.doStart(context, out);
                                                        _jettag_c_get_71_475.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_510 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_510); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_510.setRuntimeParent(_jettag_c_if_71_218);
                                                        _jettag_c_get_71_510.setTagInfo(_td_c_get_71_510);
                                                        _jettag_c_get_71_510.doStart(context, out);
                                                        _jettag_c_get_71_510.doEnd();
                                                        _jettag_c_if_71_218.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_218.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_552 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_552); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_552.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_if_71_552.setTagInfo(_td_c_if_71_552);
                                                    _jettag_c_if_71_552.doStart(context, out);
                                                    while (_jettag_c_if_71_552.okToProcessBody()) {
                                                        out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_729 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_729); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_729.setRuntimeParent(_jettag_c_if_71_552);
                                                        _jettag_c_get_71_729.setTagInfo(_td_c_get_71_729);
                                                        _jettag_c_get_71_729.doStart(context, out);
                                                        _jettag_c_get_71_729.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_764 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_764); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_764.setRuntimeParent(_jettag_c_if_71_552);
                                                        _jettag_c_get_71_764.setTagInfo(_td_c_get_71_764);
                                                        _jettag_c_get_71_764.doStart(context, out);
                                                        _jettag_c_get_71_764.doEnd();
                                                        _jettag_c_if_71_552.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_552.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_806 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_806); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_806.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_if_71_806.setTagInfo(_td_c_if_71_806);
                                                    _jettag_c_if_71_806.doStart(context, out);
                                                    while (_jettag_c_if_71_806.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_71_957 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_71_957); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_71_957.setRuntimeParent(_jettag_c_if_71_806);
                                                        _jettag_java_import_71_957.setTagInfo(_td_java_import_71_957);
                                                        _jettag_java_import_71_957.doStart(context, out);
                                                        JET2Writer _jettag_java_import_71_957_saved_out = out;
                                                        while (_jettag_java_import_71_957.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                                            _jettag_java_import_71_957.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_71_957_saved_out;
                                                        _jettag_java_import_71_957.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1013 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1013); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1013.setRuntimeParent(_jettag_c_if_71_806);
                                                        _jettag_c_get_71_1013.setTagInfo(_td_c_get_71_1013);
                                                        _jettag_c_get_71_1013.doStart(context, out);
                                                        _jettag_c_get_71_1013.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1048 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1048); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1048.setRuntimeParent(_jettag_c_if_71_806);
                                                        _jettag_c_get_71_1048.setTagInfo(_td_c_get_71_1048);
                                                        _jettag_c_get_71_1048.doStart(context, out);
                                                        _jettag_c_get_71_1048.doEnd();
                                                        _jettag_c_if_71_806.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_806.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_1090 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_1090); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_1090.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_if_71_1090.setTagInfo(_td_c_if_71_1090);
                                                    _jettag_c_if_71_1090.doStart(context, out);
                                                    while (_jettag_c_if_71_1090.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_71_1241 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_71_1241); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_71_1241.setRuntimeParent(_jettag_c_if_71_1090);
                                                        _jettag_java_import_71_1241.setTagInfo(_td_java_import_71_1241);
                                                        _jettag_java_import_71_1241.doStart(context, out);
                                                        JET2Writer _jettag_java_import_71_1241_saved_out = out;
                                                        while (_jettag_java_import_71_1241.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                                            _jettag_java_import_71_1241.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_71_1241_saved_out;
                                                        _jettag_java_import_71_1241.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1303 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1303); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1303.setRuntimeParent(_jettag_c_if_71_1090);
                                                        _jettag_c_get_71_1303.setTagInfo(_td_c_get_71_1303);
                                                        _jettag_c_get_71_1303.doStart(context, out);
                                                        _jettag_c_get_71_1303.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_71_1338 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1338); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_71_1338.setRuntimeParent(_jettag_c_if_71_1090);
                                                        _jettag_c_get_71_1338.setTagInfo(_td_c_get_71_1338);
                                                        _jettag_c_get_71_1338.doStart(context, out);
                                                        _jettag_c_get_71_1338.doEnd();
                                                        _jettag_c_if_71_1090.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_1090.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_71_1380 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_71_1380); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_71_1380.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_setVariable_71_1380.setTagInfo(_td_c_setVariable_71_1380);
                                                    _jettag_c_setVariable_71_1380.doStart(context, out);
                                                    _jettag_c_setVariable_71_1380.doEnd();
                                                    RuntimeTagElement _jettag_c_if_71_1429 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_1429); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_71_1429.setRuntimeParent(_jettag_c_iterate_71_151);
                                                    _jettag_c_if_71_1429.setTagInfo(_td_c_if_71_1429);
                                                    _jettag_c_if_71_1429.doStart(context, out);
                                                    while (_jettag_c_if_71_1429.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_71_1429.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_71_1429.doEnd();
                                                    _jettag_c_iterate_71_151.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_71_151.doEnd();
                                                out.write(", @RequestBody ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_1486 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1486); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_1486.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_1486.setTagInfo(_td_c_get_71_1486);
                                                _jettag_c_get_71_1486.doStart(context, out);
                                                _jettag_c_get_71_1486.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_71_1530 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_1530); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_71_1530.setRuntimeParent(_jettag_c_if_63_2);
                                                _jettag_c_get_71_1530.setTagInfo(_td_c_get_71_1530);
                                                _jettag_c_get_71_1530.doStart(context, out);
                                                _jettag_c_get_71_1530.doEnd();
                                                out.write("){");  //$NON-NLS-1$        
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
                                                out.write(");");  //$NON-NLS-1$        
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
                                                        out.write(".get");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_75_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_188); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_75_188.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_get_75_188.setTagInfo(_td_c_get_75_188);
                                                        _jettag_c_get_75_188.doStart(context, out);
                                                        _jettag_c_get_75_188.doEnd();
                                                        out.write("()");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_setVariable_75_237 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_75_237); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_75_237.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_setVariable_75_237.setTagInfo(_td_c_setVariable_75_237);
                                                        _jettag_c_setVariable_75_237.doStart(context, out);
                                                        _jettag_c_setVariable_75_237.doEnd();
                                                        RuntimeTagElement _jettag_c_if_75_290 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_290); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_75_290.setRuntimeParent(_jettag_c_iterate_75_101);
                                                        _jettag_c_if_75_290.setTagInfo(_td_c_if_75_290);
                                                        _jettag_c_if_75_290.doStart(context, out);
                                                        while (_jettag_c_if_75_290.okToProcessBody()) {
                                                            out.write(",");  //$NON-NLS-1$        
                                                            _jettag_c_if_75_290.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_75_290.doEnd();
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
                                                        out.write(".get");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_78_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_188); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_78_188.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_get_78_188.setTagInfo(_td_c_get_78_188);
                                                        _jettag_c_get_78_188.doStart(context, out);
                                                        _jettag_c_get_78_188.doEnd();
                                                        out.write("Field()");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_setVariable_78_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_78_242); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_78_242.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_setVariable_78_242.setTagInfo(_td_c_setVariable_78_242);
                                                        _jettag_c_setVariable_78_242.doStart(context, out);
                                                        _jettag_c_setVariable_78_242.doEnd();
                                                        RuntimeTagElement _jettag_c_if_78_295 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_78_295); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_if_78_295.setRuntimeParent(_jettag_c_iterate_78_101);
                                                        _jettag_c_if_78_295.setTagInfo(_td_c_if_78_295);
                                                        _jettag_c_if_78_295.doStart(context, out);
                                                        while (_jettag_c_if_78_295.okToProcessBody()) {
                                                            out.write(",");  //$NON-NLS-1$        
                                                            _jettag_c_if_78_295.handleBodyContent(out);
                                                        }
                                                        _jettag_c_if_78_295.doEnd();
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
                            out.write("s\", method = RequestMethod.POST)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ResponseBody");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\tpublic ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_9.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_9.setTagInfo(_td_c_get_96_9);
                            _jettag_c_get_96_9.doStart(context, out);
                            _jettag_c_get_96_9.doEnd();
                            out.write(" new");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_68); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_68.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_68.setTagInfo(_td_c_get_96_68);
                            _jettag_c_get_96_68.doStart(context, out);
                            _jettag_c_get_96_68.doEnd();
                            RuntimeTagElement _jettag_c_get_96_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_118); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_118.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_118.setTagInfo(_td_c_get_96_118);
                            _jettag_c_get_96_118.doStart(context, out);
                            _jettag_c_get_96_118.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_96_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_96_175); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_96_175.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_iterate_96_175.setTagInfo(_td_c_iterate_96_175);
                            _jettag_c_iterate_96_175.doStart(context, out);
                            while (_jettag_c_iterate_96_175.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_96_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_242); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_242.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_if_96_242.setTagInfo(_td_c_if_96_242);
                                _jettag_c_if_96_242.doStart(context, out);
                                while (_jettag_c_if_96_242.okToProcessBody()) {
                                    out.write("@PathVariable String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_499 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_499); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_499.setRuntimeParent(_jettag_c_if_96_242);
                                    _jettag_c_get_96_499.setTagInfo(_td_c_get_96_499);
                                    _jettag_c_get_96_499.doStart(context, out);
                                    _jettag_c_get_96_499.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_534 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_534); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_534.setRuntimeParent(_jettag_c_if_96_242);
                                    _jettag_c_get_96_534.setTagInfo(_td_c_get_96_534);
                                    _jettag_c_get_96_534.doStart(context, out);
                                    _jettag_c_get_96_534.doEnd();
                                    _jettag_c_if_96_242.handleBodyContent(out);
                                }
                                _jettag_c_if_96_242.doEnd();
                                RuntimeTagElement _jettag_c_if_96_576 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_576); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_576.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_if_96_576.setTagInfo(_td_c_if_96_576);
                                _jettag_c_if_96_576.doStart(context, out);
                                while (_jettag_c_if_96_576.okToProcessBody()) {
                                    out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_753 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_753); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_753.setRuntimeParent(_jettag_c_if_96_576);
                                    _jettag_c_get_96_753.setTagInfo(_td_c_get_96_753);
                                    _jettag_c_get_96_753.doStart(context, out);
                                    _jettag_c_get_96_753.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_788 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_788); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_788.setRuntimeParent(_jettag_c_if_96_576);
                                    _jettag_c_get_96_788.setTagInfo(_td_c_get_96_788);
                                    _jettag_c_get_96_788.doStart(context, out);
                                    _jettag_c_get_96_788.doEnd();
                                    _jettag_c_if_96_576.handleBodyContent(out);
                                }
                                _jettag_c_if_96_576.doEnd();
                                RuntimeTagElement _jettag_c_if_96_830 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_830); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_830.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_if_96_830.setTagInfo(_td_c_if_96_830);
                                _jettag_c_if_96_830.doStart(context, out);
                                while (_jettag_c_if_96_830.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_96_981 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_96_981); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_96_981.setRuntimeParent(_jettag_c_if_96_830);
                                    _jettag_java_import_96_981.setTagInfo(_td_java_import_96_981);
                                    _jettag_java_import_96_981.doStart(context, out);
                                    JET2Writer _jettag_java_import_96_981_saved_out = out;
                                    while (_jettag_java_import_96_981.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_96_981.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_96_981_saved_out;
                                    _jettag_java_import_96_981.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1037 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1037); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1037.setRuntimeParent(_jettag_c_if_96_830);
                                    _jettag_c_get_96_1037.setTagInfo(_td_c_get_96_1037);
                                    _jettag_c_get_96_1037.doStart(context, out);
                                    _jettag_c_get_96_1037.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1072 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1072); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1072.setRuntimeParent(_jettag_c_if_96_830);
                                    _jettag_c_get_96_1072.setTagInfo(_td_c_get_96_1072);
                                    _jettag_c_get_96_1072.doStart(context, out);
                                    _jettag_c_get_96_1072.doEnd();
                                    _jettag_c_if_96_830.handleBodyContent(out);
                                }
                                _jettag_c_if_96_830.doEnd();
                                RuntimeTagElement _jettag_c_if_96_1114 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_1114); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_1114.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_if_96_1114.setTagInfo(_td_c_if_96_1114);
                                _jettag_c_if_96_1114.doStart(context, out);
                                while (_jettag_c_if_96_1114.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_96_1265 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_96_1265); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_96_1265.setRuntimeParent(_jettag_c_if_96_1114);
                                    _jettag_java_import_96_1265.setTagInfo(_td_java_import_96_1265);
                                    _jettag_java_import_96_1265.doStart(context, out);
                                    JET2Writer _jettag_java_import_96_1265_saved_out = out;
                                    while (_jettag_java_import_96_1265.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_96_1265.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_96_1265_saved_out;
                                    _jettag_java_import_96_1265.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1327 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1327); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1327.setRuntimeParent(_jettag_c_if_96_1114);
                                    _jettag_c_get_96_1327.setTagInfo(_td_c_get_96_1327);
                                    _jettag_c_get_96_1327.doStart(context, out);
                                    _jettag_c_get_96_1327.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_96_1362 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1362); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_96_1362.setRuntimeParent(_jettag_c_if_96_1114);
                                    _jettag_c_get_96_1362.setTagInfo(_td_c_get_96_1362);
                                    _jettag_c_get_96_1362.doStart(context, out);
                                    _jettag_c_get_96_1362.doEnd();
                                    _jettag_c_if_96_1114.handleBodyContent(out);
                                }
                                _jettag_c_if_96_1114.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_96_1404 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_96_1404); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_96_1404.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_setVariable_96_1404.setTagInfo(_td_c_setVariable_96_1404);
                                _jettag_c_setVariable_96_1404.doStart(context, out);
                                _jettag_c_setVariable_96_1404.doEnd();
                                RuntimeTagElement _jettag_c_if_96_1453 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_1453); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_96_1453.setRuntimeParent(_jettag_c_iterate_96_175);
                                _jettag_c_if_96_1453.setTagInfo(_td_c_if_96_1453);
                                _jettag_c_if_96_1453.doStart(context, out);
                                while (_jettag_c_if_96_1453.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_96_1453.handleBodyContent(out);
                                }
                                _jettag_c_if_96_1453.doEnd();
                                _jettag_c_iterate_96_175.handleBodyContent(out);
                            }
                            _jettag_c_iterate_96_175.doEnd();
                            out.write(", @RequestBody ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_1510 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1510); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_1510.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_1510.setTagInfo(_td_c_get_96_1510);
                            _jettag_c_get_96_1510.doStart(context, out);
                            _jettag_c_get_96_1510.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_96_1566 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_1566); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_96_1566.setRuntimeParent(_jettag_c_otherwise_87_2);
                            _jettag_c_get_96_1566.setTagInfo(_td_c_get_96_1566);
                            _jettag_c_get_96_1566.doStart(context, out);
                            _jettag_c_get_96_1566.doEnd();
                            out.write("){");  //$NON-NLS-1$        
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
                            out.write(");");  //$NON-NLS-1$        
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
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_100_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_236); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_100_236.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_get_100_236.setTagInfo(_td_c_get_100_236);
                                    _jettag_c_get_100_236.doStart(context, out);
                                    _jettag_c_get_100_236.doEnd();
                                    out.write("()");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_setVariable_100_285 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_100_285); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_100_285.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_setVariable_100_285.setTagInfo(_td_c_setVariable_100_285);
                                    _jettag_c_setVariable_100_285.doStart(context, out);
                                    _jettag_c_setVariable_100_285.doEnd();
                                    RuntimeTagElement _jettag_c_if_100_338 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_100_338); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_100_338.setRuntimeParent(_jettag_c_iterate_100_125);
                                    _jettag_c_if_100_338.setTagInfo(_td_c_if_100_338);
                                    _jettag_c_if_100_338.doStart(context, out);
                                    while (_jettag_c_if_100_338.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_100_338.handleBodyContent(out);
                                    }
                                    _jettag_c_if_100_338.doEnd();
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
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_103_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_103_236); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_103_236.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_get_103_236.setTagInfo(_td_c_get_103_236);
                                    _jettag_c_get_103_236.doStart(context, out);
                                    _jettag_c_get_103_236.doEnd();
                                    out.write("Field()");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_setVariable_103_290 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_103_290); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_103_290.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_setVariable_103_290.setTagInfo(_td_c_setVariable_103_290);
                                    _jettag_c_setVariable_103_290.doStart(context, out);
                                    _jettag_c_setVariable_103_290.doEnd();
                                    RuntimeTagElement _jettag_c_if_103_343 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_103_343); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_103_343.setRuntimeParent(_jettag_c_iterate_103_125);
                                    _jettag_c_if_103_343.setTagInfo(_td_c_if_103_343);
                                    _jettag_c_if_103_343.doStart(context, out);
                                    while (_jettag_c_if_103_343.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_103_343.handleBodyContent(out);
                                    }
                                    _jettag_c_if_103_343.doEnd();
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
