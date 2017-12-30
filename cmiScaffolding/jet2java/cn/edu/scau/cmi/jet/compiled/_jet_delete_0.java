package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_delete_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_delete_0() {
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
    private static final TagInfo _td_java_import_6_3 = new TagInfo("java:import", //$NON-NLS-1$
            6, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_6_95 = new TagInfo("c:get", //$NON-NLS-1$
            6, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_145 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 145,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_214 = new TagInfo("c:get", //$NON-NLS-1$
            6, 214,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_249 = new TagInfo("c:get", //$NON-NLS-1$
            6, 249,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_6_309 = new TagInfo("java:import", //$NON-NLS-1$
            6, 309,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_20 = new TagInfo("c:get", //$NON-NLS-1$
            8, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_71 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 71,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_138 = new TagInfo("c:if", //$NON-NLS-1$
            8, 138,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_395 = new TagInfo("c:get", //$NON-NLS-1$
            8, 395,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_430 = new TagInfo("c:get", //$NON-NLS-1$
            8, 430,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_472 = new TagInfo("c:if", //$NON-NLS-1$
            8, 472,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_628 = new TagInfo("java:import", //$NON-NLS-1$
            8, 628,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_716 = new TagInfo("c:get", //$NON-NLS-1$
            8, 716,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_751 = new TagInfo("c:get", //$NON-NLS-1$
            8, 751,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_793 = new TagInfo("c:if", //$NON-NLS-1$
            8, 793,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_944 = new TagInfo("java:import", //$NON-NLS-1$
            8, 944,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_1000 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1000,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_1035 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1035,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1077 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1077,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_1228 = new TagInfo("java:import", //$NON-NLS-1$
            8, 1228,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_1290 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1290,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_1325 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1325,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1367 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1367,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1416 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1416,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_3 = new TagInfo("c:get", //$NON-NLS-1$
            10, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_54 = new TagInfo("c:get", //$NON-NLS-1$
            10, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_91 = new TagInfo("c:get", //$NON-NLS-1$
            10, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_133 = new TagInfo("c:get", //$NON-NLS-1$
            10, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_196 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 196,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_263 = new TagInfo("c:get", //$NON-NLS-1$
            10, 263,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_298 = new TagInfo("c:get", //$NON-NLS-1$
            10, 298,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_333 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 333,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_382 = new TagInfo("c:if", //$NON-NLS-1$
            10, 382,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_3 = new TagInfo("c:get", //$NON-NLS-1$
            11, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_51 = new TagInfo("c:get", //$NON-NLS-1$
            11, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_102 = new TagInfo("c:get", //$NON-NLS-1$
            11, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_2 = new TagInfo("c:if", //$NON-NLS-1$
            16, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_18_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_20_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_28 = new TagInfo("c:get", //$NON-NLS-1$
            23, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_147 = new TagInfo("c:get", //$NON-NLS-1$
            23, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_182 = new TagInfo("c:get", //$NON-NLS-1$
            23, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_231 = new TagInfo("c:get", //$NON-NLS-1$
            23, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_273 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 273,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_348 = new TagInfo("c:get", //$NON-NLS-1$
            23, 348,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_384 = new TagInfo("c:get", //$NON-NLS-1$
            23, 384,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_20 = new TagInfo("c:get", //$NON-NLS-1$
            25, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_70 = new TagInfo("c:get", //$NON-NLS-1$
            25, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_122 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 122,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_189 = new TagInfo("c:if", //$NON-NLS-1$
            25, 189,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_446 = new TagInfo("c:get", //$NON-NLS-1$
            25, 446,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_481 = new TagInfo("c:get", //$NON-NLS-1$
            25, 481,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_523 = new TagInfo("c:if", //$NON-NLS-1$
            25, 523,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_700 = new TagInfo("c:get", //$NON-NLS-1$
            25, 700,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_735 = new TagInfo("c:get", //$NON-NLS-1$
            25, 735,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_777 = new TagInfo("c:if", //$NON-NLS-1$
            25, 777,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_928 = new TagInfo("java:import", //$NON-NLS-1$
            25, 928,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_984 = new TagInfo("c:get", //$NON-NLS-1$
            25, 984,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1019 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1019,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1061 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1061,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_1212 = new TagInfo("java:import", //$NON-NLS-1$
            25, 1212,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_1274 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1274,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1309 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1309,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_1351 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 1351,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1400 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1400,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1443 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1443,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1507 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1507,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1741 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1741,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1777 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1777,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1815 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1815,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1981 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1981,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_2017 = new TagInfo("c:get", //$NON-NLS-1$
            25, 2017,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_2055 = new TagInfo("c:if", //$NON-NLS-1$
            25, 2055,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_2186 = new TagInfo("java:import", //$NON-NLS-1$
            25, 2186,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_2251 = new TagInfo("c:get", //$NON-NLS-1$
            25, 2251,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_2287 = new TagInfo("c:get", //$NON-NLS-1$
            25, 2287,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_2325 = new TagInfo("c:if", //$NON-NLS-1$
            25, 2325,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_2456 = new TagInfo("java:import", //$NON-NLS-1$
            25, 2456,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_2527 = new TagInfo("c:get", //$NON-NLS-1$
            25, 2527,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_2563 = new TagInfo("c:get", //$NON-NLS-1$
            25, 2563,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_2601 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 2601,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_2654 = new TagInfo("c:if", //$NON-NLS-1$
            25, 2654,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_3 = new TagInfo("c:get", //$NON-NLS-1$
            28, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_51 = new TagInfo("c:get", //$NON-NLS-1$
            28, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_101 = new TagInfo("c:get", //$NON-NLS-1$
            28, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($existTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_153 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 153,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_220 = new TagInfo("c:get", //$NON-NLS-1$
            28, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_255 = new TagInfo("c:get", //$NON-NLS-1$
            28, 255,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_290 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 290,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_339 = new TagInfo("c:if", //$NON-NLS-1$
            28, 339,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_78 = new TagInfo("c:get", //$NON-NLS-1$
            29, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_114 = new TagInfo("c:get", //$NON-NLS-1$
            29, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_145 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 145,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_198 = new TagInfo("c:if", //$NON-NLS-1$
            29, 198,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_35_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            35, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_37_2 = new TagInfo("c:if", //$NON-NLS-1$
            37, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_38_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            38, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_39_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            39, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_40_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            40, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_44_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            44, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_46_2 = new TagInfo("c:choose", //$NON-NLS-1$
            46, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_47_2 = new TagInfo("c:when", //$NON-NLS-1$
            47, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0 and $j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_49_2 = new TagInfo("c:choose", //$NON-NLS-1$
            49, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_50_2 = new TagInfo("c:when", //$NON-NLS-1$
            50, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_52_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            52, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_53_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_54_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            54, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_2 = new TagInfo("c:if", //$NON-NLS-1$
            55, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_56_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            56, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_57_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            57, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_58_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            58, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_28 = new TagInfo("c:get", //$NON-NLS-1$
            61, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_147 = new TagInfo("c:get", //$NON-NLS-1$
            61, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_182 = new TagInfo("c:get", //$NON-NLS-1$
            61, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_231 = new TagInfo("c:get", //$NON-NLS-1$
            61, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_259 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 259,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_326 = new TagInfo("c:get", //$NON-NLS-1$
            61, 326,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_354 = new TagInfo("c:get", //$NON-NLS-1$
            61, 354,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_20 = new TagInfo("c:get", //$NON-NLS-1$
            63, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_70 = new TagInfo("c:get", //$NON-NLS-1$
            63, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_115 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 115,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_182 = new TagInfo("c:if", //$NON-NLS-1$
            63, 182,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_439 = new TagInfo("c:get", //$NON-NLS-1$
            63, 439,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_474 = new TagInfo("c:get", //$NON-NLS-1$
            63, 474,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_516 = new TagInfo("c:if", //$NON-NLS-1$
            63, 516,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_693 = new TagInfo("c:get", //$NON-NLS-1$
            63, 693,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_728 = new TagInfo("c:get", //$NON-NLS-1$
            63, 728,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_770 = new TagInfo("c:if", //$NON-NLS-1$
            63, 770,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_63_921 = new TagInfo("java:import", //$NON-NLS-1$
            63, 921,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_977 = new TagInfo("c:get", //$NON-NLS-1$
            63, 977,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1012 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1012,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_1054 = new TagInfo("c:if", //$NON-NLS-1$
            63, 1054,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_63_1205 = new TagInfo("java:import", //$NON-NLS-1$
            63, 1205,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_1267 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1267,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1302 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1302,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_1344 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 1344,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_1393 = new TagInfo("c:if", //$NON-NLS-1$
            63, 1393,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_1436 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 1436,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_1492 = new TagInfo("c:if", //$NON-NLS-1$
            63, 1492,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1726 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1726,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1754 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1754,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_1792 = new TagInfo("c:if", //$NON-NLS-1$
            63, 1792,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1958 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1958,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_1986 = new TagInfo("c:get", //$NON-NLS-1$
            63, 1986,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_2024 = new TagInfo("c:if", //$NON-NLS-1$
            63, 2024,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_63_2155 = new TagInfo("java:import", //$NON-NLS-1$
            63, 2155,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_2220 = new TagInfo("c:get", //$NON-NLS-1$
            63, 2220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_2248 = new TagInfo("c:get", //$NON-NLS-1$
            63, 2248,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_2286 = new TagInfo("c:if", //$NON-NLS-1$
            63, 2286,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_63_2417 = new TagInfo("java:import", //$NON-NLS-1$
            63, 2417,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_63_2488 = new TagInfo("c:get", //$NON-NLS-1$
            63, 2488,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_2516 = new TagInfo("c:get", //$NON-NLS-1$
            63, 2516,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_2554 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 2554,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_2607 = new TagInfo("c:if", //$NON-NLS-1$
            63, 2607,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_64_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            64, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_65_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            65, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_3 = new TagInfo("c:get", //$NON-NLS-1$
            66, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_51 = new TagInfo("c:get", //$NON-NLS-1$
            66, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_101 = new TagInfo("c:get", //$NON-NLS-1$
            66, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rt/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_66_146 = new TagInfo("c:iterate", //$NON-NLS-1$
            66, 146,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_213 = new TagInfo("c:get", //$NON-NLS-1$
            66, 213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_248 = new TagInfo("c:get", //$NON-NLS-1$
            66, 248,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_66_283 = new TagInfo("c:setVariable", //$NON-NLS-1$
            66, 283,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_332 = new TagInfo("c:if", //$NON-NLS-1$
            66, 332,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_70 = new TagInfo("c:get", //$NON-NLS-1$
            67, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_98 = new TagInfo("c:get", //$NON-NLS-1$
            67, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_67_129 = new TagInfo("c:setVariable", //$NON-NLS-1$
            67, 129,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_182 = new TagInfo("c:if", //$NON-NLS-1$
            67, 182,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_75_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            75, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_76_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            76, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_77_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            77, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_78_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            78, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_79_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            79, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_81_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            81, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_28 = new TagInfo("c:get", //$NON-NLS-1$
            82, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_147 = new TagInfo("c:get", //$NON-NLS-1$
            82, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_182 = new TagInfo("c:get", //$NON-NLS-1$
            82, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_231 = new TagInfo("c:get", //$NON-NLS-1$
            82, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_271 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 271,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_350 = new TagInfo("c:get", //$NON-NLS-1$
            82, 350,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_390 = new TagInfo("c:get", //$NON-NLS-1$
            82, 390,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_20 = new TagInfo("c:get", //$NON-NLS-1$
            84, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_70 = new TagInfo("c:get", //$NON-NLS-1$
            84, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_84_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            84, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_194 = new TagInfo("c:if", //$NON-NLS-1$
            84, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_451 = new TagInfo("c:get", //$NON-NLS-1$
            84, 451,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_486 = new TagInfo("c:get", //$NON-NLS-1$
            84, 486,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_528 = new TagInfo("c:if", //$NON-NLS-1$
            84, 528,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_705 = new TagInfo("c:get", //$NON-NLS-1$
            84, 705,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_740 = new TagInfo("c:get", //$NON-NLS-1$
            84, 740,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_782 = new TagInfo("c:if", //$NON-NLS-1$
            84, 782,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_84_933 = new TagInfo("java:import", //$NON-NLS-1$
            84, 933,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_84_989 = new TagInfo("c:get", //$NON-NLS-1$
            84, 989,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_1024 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1024,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_1066 = new TagInfo("c:if", //$NON-NLS-1$
            84, 1066,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_84_1217 = new TagInfo("java:import", //$NON-NLS-1$
            84, 1217,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_84_1279 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1279,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_1314 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1314,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_84_1356 = new TagInfo("c:setVariable", //$NON-NLS-1$
            84, 1356,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_1405 = new TagInfo("c:if", //$NON-NLS-1$
            84, 1405,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_84_1448 = new TagInfo("c:iterate", //$NON-NLS-1$
            84, 1448,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_1516 = new TagInfo("c:if", //$NON-NLS-1$
            84, 1516,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_1750 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1750,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_1790 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1790,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_1828 = new TagInfo("c:if", //$NON-NLS-1$
            84, 1828,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_1994 = new TagInfo("c:get", //$NON-NLS-1$
            84, 1994,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_2034 = new TagInfo("c:get", //$NON-NLS-1$
            84, 2034,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_2072 = new TagInfo("c:if", //$NON-NLS-1$
            84, 2072,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_84_2203 = new TagInfo("java:import", //$NON-NLS-1$
            84, 2203,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_84_2268 = new TagInfo("c:get", //$NON-NLS-1$
            84, 2268,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_2308 = new TagInfo("c:get", //$NON-NLS-1$
            84, 2308,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_2346 = new TagInfo("c:if", //$NON-NLS-1$
            84, 2346,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_84_2477 = new TagInfo("java:import", //$NON-NLS-1$
            84, 2477,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_84_2548 = new TagInfo("c:get", //$NON-NLS-1$
            84, 2548,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_84_2588 = new TagInfo("c:get", //$NON-NLS-1$
            84, 2588,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_84_2626 = new TagInfo("c:setVariable", //$NON-NLS-1$
            84, 2626,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_2679 = new TagInfo("c:if", //$NON-NLS-1$
            84, 2679,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_85_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            85, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_86_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            86, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_3 = new TagInfo("c:get", //$NON-NLS-1$
            87, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_51 = new TagInfo("c:get", //$NON-NLS-1$
            87, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_101 = new TagInfo("c:get", //$NON-NLS-1$
            87, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_87_158 = new TagInfo("c:iterate", //$NON-NLS-1$
            87, 158,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_225 = new TagInfo("c:get", //$NON-NLS-1$
            87, 225,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_260 = new TagInfo("c:get", //$NON-NLS-1$
            87, 260,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_87_295 = new TagInfo("c:setVariable", //$NON-NLS-1$
            87, 295,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_87_344 = new TagInfo("c:if", //$NON-NLS-1$
            87, 344,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_88_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            88, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_82 = new TagInfo("c:get", //$NON-NLS-1$
            88, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_122 = new TagInfo("c:get", //$NON-NLS-1$
            88, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_88_153 = new TagInfo("c:setVariable", //$NON-NLS-1$
            88, 153,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_88_206 = new TagInfo("c:if", //$NON-NLS-1$
            88, 206,
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
        out.write("\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_6_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_6_3.setRuntimeParent(null);
        _jettag_java_import_6_3.setTagInfo(_td_java_import_6_3);
        _jettag_java_import_6_3.doStart(context, out);
        JET2Writer _jettag_java_import_6_3_saved_out = out;
        while (_jettag_java_import_6_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.web.bind.annotation.RequestMapping");  //$NON-NLS-1$        
            _jettag_java_import_6_3.handleBodyContent(out);
        }
        out = _jettag_java_import_6_3_saved_out;
        _jettag_java_import_6_3.doEnd();
        out.write("(value = \"/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_95.setRuntimeParent(null);
        _jettag_c_get_6_95.setTagInfo(_td_c_get_6_95);
        _jettag_c_get_6_95.doStart(context, out);
        _jettag_c_get_6_95.doEnd();
        RuntimeTagElement _jettag_c_iterate_6_145 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_145); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_6_145.setRuntimeParent(null);
        _jettag_c_iterate_6_145.setTagInfo(_td_c_iterate_6_145);
        _jettag_c_iterate_6_145.doStart(context, out);
        while (_jettag_c_iterate_6_145.okToProcessBody()) {
            out.write("/{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_214 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_214); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_214.setRuntimeParent(_jettag_c_iterate_6_145);
            _jettag_c_get_6_214.setTagInfo(_td_c_get_6_214);
            _jettag_c_get_6_214.doStart(context, out);
            _jettag_c_get_6_214.doEnd();
            out.write("_");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_249 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_249); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_249.setRuntimeParent(_jettag_c_iterate_6_145);
            _jettag_c_get_6_249.setTagInfo(_td_c_get_6_249);
            _jettag_c_get_6_249.doStart(context, out);
            _jettag_c_get_6_249.doEnd();
            out.write("}");  //$NON-NLS-1$        
            _jettag_c_iterate_6_145.handleBodyContent(out);
        }
        _jettag_c_iterate_6_145.doEnd();
        out.write("\", method = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_6_309 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_6_309); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_6_309.setRuntimeParent(null);
        _jettag_java_import_6_309.setTagInfo(_td_java_import_6_309);
        _jettag_java_import_6_309.doStart(context, out);
        JET2Writer _jettag_java_import_6_309_saved_out = out;
        while (_jettag_java_import_6_309.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.web.bind.annotation.RequestMethod");  //$NON-NLS-1$        
            _jettag_java_import_6_309.handleBodyContent(out);
        }
        out = _jettag_java_import_6_309_saved_out;
        _jettag_java_import_6_309.doEnd();
        out.write(".DELETE)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@ResponseBody");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void delete");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_20.setRuntimeParent(null);
        _jettag_c_get_8_20.setTagInfo(_td_c_get_8_20);
        _jettag_c_get_8_20.doStart(context, out);
        _jettag_c_get_8_20.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_8_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_71.setRuntimeParent(null);
        _jettag_c_iterate_8_71.setTagInfo(_td_c_iterate_8_71);
        _jettag_c_iterate_8_71.doStart(context, out);
        while (_jettag_c_iterate_8_71.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_8_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_138); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_138.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_if_8_138.setTagInfo(_td_c_if_8_138);
            _jettag_c_if_8_138.doStart(context, out);
            while (_jettag_c_if_8_138.okToProcessBody()) {
                out.write("@PathVariable String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_395 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_395); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_395.setRuntimeParent(_jettag_c_if_8_138);
                _jettag_c_get_8_395.setTagInfo(_td_c_get_8_395);
                _jettag_c_get_8_395.doStart(context, out);
                _jettag_c_get_8_395.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_430 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_430); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_430.setRuntimeParent(_jettag_c_if_8_138);
                _jettag_c_get_8_430.setTagInfo(_td_c_get_8_430);
                _jettag_c_get_8_430.doStart(context, out);
                _jettag_c_get_8_430.doEnd();
                _jettag_c_if_8_138.handleBodyContent(out);
            }
            _jettag_c_if_8_138.doEnd();
            RuntimeTagElement _jettag_c_if_8_472 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_472); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_472.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_if_8_472.setTagInfo(_td_c_if_8_472);
            _jettag_c_if_8_472.doStart(context, out);
            while (_jettag_c_if_8_472.okToProcessBody()) {
                out.write("@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_8_628 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_628); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_8_628.setRuntimeParent(_jettag_c_if_8_472);
                _jettag_java_import_8_628.setTagInfo(_td_java_import_8_628);
                _jettag_java_import_8_628.doStart(context, out);
                JET2Writer _jettag_java_import_8_628_saved_out = out;
                while (_jettag_java_import_8_628.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.web.bind.annotation.PathVariable");  //$NON-NLS-1$        
                    _jettag_java_import_8_628.handleBodyContent(out);
                }
                out = _jettag_java_import_8_628_saved_out;
                _jettag_java_import_8_628.doEnd();
                out.write(" Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_716 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_716); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_716.setRuntimeParent(_jettag_c_if_8_472);
                _jettag_c_get_8_716.setTagInfo(_td_c_get_8_716);
                _jettag_c_get_8_716.doStart(context, out);
                _jettag_c_get_8_716.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_751 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_751); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_751.setRuntimeParent(_jettag_c_if_8_472);
                _jettag_c_get_8_751.setTagInfo(_td_c_get_8_751);
                _jettag_c_get_8_751.doStart(context, out);
                _jettag_c_get_8_751.doEnd();
                _jettag_c_if_8_472.handleBodyContent(out);
            }
            _jettag_c_if_8_472.doEnd();
            RuntimeTagElement _jettag_c_if_8_793 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_793); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_793.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_if_8_793.setTagInfo(_td_c_if_8_793);
            _jettag_c_if_8_793.doStart(context, out);
            while (_jettag_c_if_8_793.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_8_944 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_944); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_8_944.setRuntimeParent(_jettag_c_if_8_793);
                _jettag_java_import_8_944.setTagInfo(_td_java_import_8_944);
                _jettag_java_import_8_944.doStart(context, out);
                JET2Writer _jettag_java_import_8_944_saved_out = out;
                while (_jettag_java_import_8_944.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                    _jettag_java_import_8_944.handleBodyContent(out);
                }
                out = _jettag_java_import_8_944_saved_out;
                _jettag_java_import_8_944.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_1000 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1000); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_1000.setRuntimeParent(_jettag_c_if_8_793);
                _jettag_c_get_8_1000.setTagInfo(_td_c_get_8_1000);
                _jettag_c_get_8_1000.doStart(context, out);
                _jettag_c_get_8_1000.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_1035 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1035); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_1035.setRuntimeParent(_jettag_c_if_8_793);
                _jettag_c_get_8_1035.setTagInfo(_td_c_get_8_1035);
                _jettag_c_get_8_1035.doStart(context, out);
                _jettag_c_get_8_1035.doEnd();
                _jettag_c_if_8_793.handleBodyContent(out);
            }
            _jettag_c_if_8_793.doEnd();
            RuntimeTagElement _jettag_c_if_8_1077 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1077); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_1077.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_if_8_1077.setTagInfo(_td_c_if_8_1077);
            _jettag_c_if_8_1077.doStart(context, out);
            while (_jettag_c_if_8_1077.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_8_1228 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_1228); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_8_1228.setRuntimeParent(_jettag_c_if_8_1077);
                _jettag_java_import_8_1228.setTagInfo(_td_java_import_8_1228);
                _jettag_java_import_8_1228.doStart(context, out);
                JET2Writer _jettag_java_import_8_1228_saved_out = out;
                while (_jettag_java_import_8_1228.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                    _jettag_java_import_8_1228.handleBodyContent(out);
                }
                out = _jettag_java_import_8_1228_saved_out;
                _jettag_java_import_8_1228.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_1290 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1290); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_1290.setRuntimeParent(_jettag_c_if_8_1077);
                _jettag_c_get_8_1290.setTagInfo(_td_c_get_8_1290);
                _jettag_c_get_8_1290.doStart(context, out);
                _jettag_c_get_8_1290.doEnd();
                out.write("_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_1325 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1325); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_1325.setRuntimeParent(_jettag_c_if_8_1077);
                _jettag_c_get_8_1325.setTagInfo(_td_c_get_8_1325);
                _jettag_c_get_8_1325.doStart(context, out);
                _jettag_c_get_8_1325.doEnd();
                _jettag_c_if_8_1077.handleBodyContent(out);
            }
            _jettag_c_if_8_1077.doEnd();
            RuntimeTagElement _jettag_c_setVariable_8_1367 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1367); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_8_1367.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_setVariable_8_1367.setTagInfo(_td_c_setVariable_8_1367);
            _jettag_c_setVariable_8_1367.doStart(context, out);
            _jettag_c_setVariable_8_1367.doEnd();
            RuntimeTagElement _jettag_c_if_8_1416 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1416); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_1416.setRuntimeParent(_jettag_c_iterate_8_71);
            _jettag_c_if_8_1416.setTagInfo(_td_c_if_8_1416);
            _jettag_c_if_8_1416.doStart(context, out);
            while (_jettag_c_if_8_1416.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_8_1416.handleBodyContent(out);
            }
            _jettag_c_if_8_1416.doEnd();
            _jettag_c_iterate_8_71.handleBodyContent(out);
        }
        _jettag_c_iterate_8_71.doEnd();
        out.write("){");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_9_3.setRuntimeParent(null);
        _jettag_c_setVariable_9_3.setTagInfo(_td_c_setVariable_9_3);
        _jettag_c_setVariable_9_3.doStart(context, out);
        _jettag_c_setVariable_9_3.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_3.setRuntimeParent(null);
        _jettag_c_get_10_3.setTagInfo(_td_c_get_10_3);
        _jettag_c_get_10_3.doStart(context, out);
        _jettag_c_get_10_3.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_54.setRuntimeParent(null);
        _jettag_c_get_10_54.setTagInfo(_td_c_get_10_54);
        _jettag_c_get_10_54.doStart(context, out);
        _jettag_c_get_10_54.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_91.setRuntimeParent(null);
        _jettag_c_get_10_91.setTagInfo(_td_c_get_10_91);
        _jettag_c_get_10_91.doStart(context, out);
        _jettag_c_get_10_91.doEnd();
        out.write("DAO.find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_133); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_133.setRuntimeParent(null);
        _jettag_c_get_10_133.setTagInfo(_td_c_get_10_133);
        _jettag_c_get_10_133.doStart(context, out);
        _jettag_c_get_10_133.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_10_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_196); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_196.setRuntimeParent(null);
        _jettag_c_iterate_10_196.setTagInfo(_td_c_iterate_10_196);
        _jettag_c_iterate_10_196.doStart(context, out);
        while (_jettag_c_iterate_10_196.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_10_263 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_263); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_263.setRuntimeParent(_jettag_c_iterate_10_196);
            _jettag_c_get_10_263.setTagInfo(_td_c_get_10_263);
            _jettag_c_get_10_263.doStart(context, out);
            _jettag_c_get_10_263.doEnd();
            out.write("_");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_298 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_298); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_298.setRuntimeParent(_jettag_c_iterate_10_196);
            _jettag_c_get_10_298.setTagInfo(_td_c_get_10_298);
            _jettag_c_get_10_298.doStart(context, out);
            _jettag_c_get_10_298.doEnd();
            RuntimeTagElement _jettag_c_setVariable_10_333 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_333); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_333.setRuntimeParent(_jettag_c_iterate_10_196);
            _jettag_c_setVariable_10_333.setTagInfo(_td_c_setVariable_10_333);
            _jettag_c_setVariable_10_333.doStart(context, out);
            _jettag_c_setVariable_10_333.doEnd();
            RuntimeTagElement _jettag_c_if_10_382 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_382); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_382.setRuntimeParent(_jettag_c_iterate_10_196);
            _jettag_c_if_10_382.setTagInfo(_td_c_if_10_382);
            _jettag_c_if_10_382.doStart(context, out);
            while (_jettag_c_if_10_382.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_10_382.handleBodyContent(out);
            }
            _jettag_c_if_10_382.doEnd();
            _jettag_c_iterate_10_196.handleBodyContent(out);
        }
        _jettag_c_iterate_10_196.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_3.setRuntimeParent(null);
        _jettag_c_get_11_3.setTagInfo(_td_c_get_11_3);
        _jettag_c_get_11_3.doStart(context, out);
        _jettag_c_get_11_3.doEnd();
        out.write("Service.delete");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_51.setRuntimeParent(null);
        _jettag_c_get_11_51.setTagInfo(_td_c_get_11_51);
        _jettag_c_get_11_51.doStart(context, out);
        _jettag_c_get_11_51.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_102); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_102.setRuntimeParent(null);
        _jettag_c_get_11_102.setTagInfo(_td_c_get_11_102);
        _jettag_c_get_11_102.doStart(context, out);
        _jettag_c_get_11_102.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_14_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_14_2.setRuntimeParent(null);
        _jettag_c_iterate_14_2.setTagInfo(_td_c_iterate_14_2);
        _jettag_c_iterate_14_2.doStart(context, out);
        while (_jettag_c_iterate_14_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_2.setRuntimeParent(_jettag_c_iterate_14_2);
            _jettag_c_iterate_15_2.setTagInfo(_td_c_iterate_15_2);
            _jettag_c_iterate_15_2.doStart(context, out);
            while (_jettag_c_iterate_15_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_16_2.setRuntimeParent(_jettag_c_iterate_15_2);
                _jettag_c_if_16_2.setTagInfo(_td_c_if_16_2);
                _jettag_c_if_16_2.doStart(context, out);
                while (_jettag_c_if_16_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_17_2.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_setVariable_17_2.setTagInfo(_td_c_setVariable_17_2);
                    _jettag_c_setVariable_17_2.doStart(context, out);
                    _jettag_c_setVariable_17_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_18_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_18_2.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_setVariable_18_2.setTagInfo(_td_c_setVariable_18_2);
                    _jettag_c_setVariable_18_2.doStart(context, out);
                    _jettag_c_setVariable_18_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_19_2.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_19_2.setTagInfo(_td_c_iterate_19_2);
                    _jettag_c_iterate_19_2.doStart(context, out);
                    while (_jettag_c_iterate_19_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_20_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_20_2.setRuntimeParent(_jettag_c_iterate_19_2);
                        _jettag_c_setVariable_20_2.setTagInfo(_td_c_setVariable_20_2);
                        _jettag_c_setVariable_20_2.doStart(context, out);
                        _jettag_c_setVariable_20_2.doEnd();
                        _jettag_c_iterate_19_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_19_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_22_2.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_setVariable_22_2.setTagInfo(_td_c_setVariable_22_2);
                    _jettag_c_setVariable_22_2.doStart(context, out);
                    _jettag_c_setVariable_22_2.doEnd();
                    out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_28.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_23_28.setTagInfo(_td_c_get_23_28);
                    _jettag_c_get_23_28.doStart(context, out);
                    _jettag_c_get_23_28.doEnd();
                    RuntimeTagElement _jettag_c_iterate_23_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_23_78.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_23_78.setTagInfo(_td_c_iterate_23_78);
                    _jettag_c_iterate_23_78.doStart(context, out);
                    while (_jettag_c_iterate_23_78.okToProcessBody()) {
                        out.write("/{");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_147); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_147.setRuntimeParent(_jettag_c_iterate_23_78);
                        _jettag_c_get_23_147.setTagInfo(_td_c_get_23_147);
                        _jettag_c_get_23_147.doStart(context, out);
                        _jettag_c_get_23_147.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_182); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_182.setRuntimeParent(_jettag_c_iterate_23_78);
                        _jettag_c_get_23_182.setTagInfo(_td_c_get_23_182);
                        _jettag_c_get_23_182.doStart(context, out);
                        _jettag_c_get_23_182.doEnd();
                        out.write("}");  //$NON-NLS-1$        
                        _jettag_c_iterate_23_78.handleBodyContent(out);
                    }
                    _jettag_c_iterate_23_78.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_231); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_231.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_23_231.setTagInfo(_td_c_get_23_231);
                    _jettag_c_get_23_231.doStart(context, out);
                    _jettag_c_get_23_231.doEnd();
                    RuntimeTagElement _jettag_c_iterate_23_273 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_273); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_23_273.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_23_273.setTagInfo(_td_c_iterate_23_273);
                    _jettag_c_iterate_23_273.doStart(context, out);
                    while (_jettag_c_iterate_23_273.okToProcessBody()) {
                        out.write("/{relative_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_348 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_348); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_348.setRuntimeParent(_jettag_c_iterate_23_273);
                        _jettag_c_get_23_348.setTagInfo(_td_c_get_23_348);
                        _jettag_c_get_23_348.doStart(context, out);
                        _jettag_c_get_23_348.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_23_384 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_384); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_23_384.setRuntimeParent(_jettag_c_iterate_23_273);
                        _jettag_c_get_23_384.setTagInfo(_td_c_get_23_384);
                        _jettag_c_get_23_384.doStart(context, out);
                        _jettag_c_get_23_384.doEnd();
                        out.write("}");  //$NON-NLS-1$        
                        _jettag_c_iterate_23_273.handleBodyContent(out);
                    }
                    _jettag_c_iterate_23_273.doEnd();
                    out.write("\", method = RequestMethod.DELETE)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@ResponseBody");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic void delete");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_20); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_20.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_25_20.setTagInfo(_td_c_get_25_20);
                    _jettag_c_get_25_20.doStart(context, out);
                    _jettag_c_get_25_20.doEnd();
                    RuntimeTagElement _jettag_c_get_25_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_70.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_25_70.setTagInfo(_td_c_get_25_70);
                    _jettag_c_get_25_70.doStart(context, out);
                    _jettag_c_get_25_70.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_25_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_122); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_25_122.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_25_122.setTagInfo(_td_c_iterate_25_122);
                    _jettag_c_iterate_25_122.doStart(context, out);
                    while (_jettag_c_iterate_25_122.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_25_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_189); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_189.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_if_25_189.setTagInfo(_td_c_if_25_189);
                        _jettag_c_if_25_189.doStart(context, out);
                        while (_jettag_c_if_25_189.okToProcessBody()) {
                            out.write("@PathVariable String ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_446 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_446); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_446.setRuntimeParent(_jettag_c_if_25_189);
                            _jettag_c_get_25_446.setTagInfo(_td_c_get_25_446);
                            _jettag_c_get_25_446.doStart(context, out);
                            _jettag_c_get_25_446.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_481 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_481); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_481.setRuntimeParent(_jettag_c_if_25_189);
                            _jettag_c_get_25_481.setTagInfo(_td_c_get_25_481);
                            _jettag_c_get_25_481.doStart(context, out);
                            _jettag_c_get_25_481.doEnd();
                            _jettag_c_if_25_189.handleBodyContent(out);
                        }
                        _jettag_c_if_25_189.doEnd();
                        RuntimeTagElement _jettag_c_if_25_523 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_523); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_523.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_if_25_523.setTagInfo(_td_c_if_25_523);
                        _jettag_c_if_25_523.doStart(context, out);
                        while (_jettag_c_if_25_523.okToProcessBody()) {
                            out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_700 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_700); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_700.setRuntimeParent(_jettag_c_if_25_523);
                            _jettag_c_get_25_700.setTagInfo(_td_c_get_25_700);
                            _jettag_c_get_25_700.doStart(context, out);
                            _jettag_c_get_25_700.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_735 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_735); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_735.setRuntimeParent(_jettag_c_if_25_523);
                            _jettag_c_get_25_735.setTagInfo(_td_c_get_25_735);
                            _jettag_c_get_25_735.doStart(context, out);
                            _jettag_c_get_25_735.doEnd();
                            _jettag_c_if_25_523.handleBodyContent(out);
                        }
                        _jettag_c_if_25_523.doEnd();
                        RuntimeTagElement _jettag_c_if_25_777 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_777); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_777.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_if_25_777.setTagInfo(_td_c_if_25_777);
                        _jettag_c_if_25_777.doStart(context, out);
                        while (_jettag_c_if_25_777.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_25_928 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_928); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_25_928.setRuntimeParent(_jettag_c_if_25_777);
                            _jettag_java_import_25_928.setTagInfo(_td_java_import_25_928);
                            _jettag_java_import_25_928.doStart(context, out);
                            JET2Writer _jettag_java_import_25_928_saved_out = out;
                            while (_jettag_java_import_25_928.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                _jettag_java_import_25_928.handleBodyContent(out);
                            }
                            out = _jettag_java_import_25_928_saved_out;
                            _jettag_java_import_25_928.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_984 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_984); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_984.setRuntimeParent(_jettag_c_if_25_777);
                            _jettag_c_get_25_984.setTagInfo(_td_c_get_25_984);
                            _jettag_c_get_25_984.doStart(context, out);
                            _jettag_c_get_25_984.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1019 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1019); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1019.setRuntimeParent(_jettag_c_if_25_777);
                            _jettag_c_get_25_1019.setTagInfo(_td_c_get_25_1019);
                            _jettag_c_get_25_1019.doStart(context, out);
                            _jettag_c_get_25_1019.doEnd();
                            _jettag_c_if_25_777.handleBodyContent(out);
                        }
                        _jettag_c_if_25_777.doEnd();
                        RuntimeTagElement _jettag_c_if_25_1061 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1061); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_1061.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_if_25_1061.setTagInfo(_td_c_if_25_1061);
                        _jettag_c_if_25_1061.doStart(context, out);
                        while (_jettag_c_if_25_1061.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_25_1212 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_1212); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_25_1212.setRuntimeParent(_jettag_c_if_25_1061);
                            _jettag_java_import_25_1212.setTagInfo(_td_java_import_25_1212);
                            _jettag_java_import_25_1212.doStart(context, out);
                            JET2Writer _jettag_java_import_25_1212_saved_out = out;
                            while (_jettag_java_import_25_1212.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                _jettag_java_import_25_1212.handleBodyContent(out);
                            }
                            out = _jettag_java_import_25_1212_saved_out;
                            _jettag_java_import_25_1212.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1274 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1274); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1274.setRuntimeParent(_jettag_c_if_25_1061);
                            _jettag_c_get_25_1274.setTagInfo(_td_c_get_25_1274);
                            _jettag_c_get_25_1274.doStart(context, out);
                            _jettag_c_get_25_1274.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1309 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1309); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1309.setRuntimeParent(_jettag_c_if_25_1061);
                            _jettag_c_get_25_1309.setTagInfo(_td_c_get_25_1309);
                            _jettag_c_get_25_1309.doStart(context, out);
                            _jettag_c_get_25_1309.doEnd();
                            _jettag_c_if_25_1061.handleBodyContent(out);
                        }
                        _jettag_c_if_25_1061.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_25_1351 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_1351); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_25_1351.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_setVariable_25_1351.setTagInfo(_td_c_setVariable_25_1351);
                        _jettag_c_setVariable_25_1351.doStart(context, out);
                        _jettag_c_setVariable_25_1351.doEnd();
                        RuntimeTagElement _jettag_c_if_25_1400 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1400); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_1400.setRuntimeParent(_jettag_c_iterate_25_122);
                        _jettag_c_if_25_1400.setTagInfo(_td_c_if_25_1400);
                        _jettag_c_if_25_1400.doStart(context, out);
                        while (_jettag_c_if_25_1400.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_25_1400.handleBodyContent(out);
                        }
                        _jettag_c_if_25_1400.doEnd();
                        _jettag_c_iterate_25_122.handleBodyContent(out);
                    }
                    _jettag_c_iterate_25_122.doEnd();
                    out.write(",");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_25_1443 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1443); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_25_1443.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_25_1443.setTagInfo(_td_c_iterate_25_1443);
                    _jettag_c_iterate_25_1443.doStart(context, out);
                    while (_jettag_c_iterate_25_1443.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_25_1507 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1507); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_1507.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_if_25_1507.setTagInfo(_td_c_if_25_1507);
                        _jettag_c_if_25_1507.doStart(context, out);
                        while (_jettag_c_if_25_1507.okToProcessBody()) {
                            out.write("@PathVariable String relative_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1741 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1741); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1741.setRuntimeParent(_jettag_c_if_25_1507);
                            _jettag_c_get_25_1741.setTagInfo(_td_c_get_25_1741);
                            _jettag_c_get_25_1741.doStart(context, out);
                            _jettag_c_get_25_1741.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1777 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1777); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1777.setRuntimeParent(_jettag_c_if_25_1507);
                            _jettag_c_get_25_1777.setTagInfo(_td_c_get_25_1777);
                            _jettag_c_get_25_1777.doStart(context, out);
                            _jettag_c_get_25_1777.doEnd();
                            _jettag_c_if_25_1507.handleBodyContent(out);
                        }
                        _jettag_c_if_25_1507.doEnd();
                        RuntimeTagElement _jettag_c_if_25_1815 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1815); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_1815.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_if_25_1815.setTagInfo(_td_c_if_25_1815);
                        _jettag_c_if_25_1815.doStart(context, out);
                        while (_jettag_c_if_25_1815.okToProcessBody()) {
                            out.write("@PathVariable Integer relative_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_1981 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1981); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_1981.setRuntimeParent(_jettag_c_if_25_1815);
                            _jettag_c_get_25_1981.setTagInfo(_td_c_get_25_1981);
                            _jettag_c_get_25_1981.doStart(context, out);
                            _jettag_c_get_25_1981.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_2017 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_2017); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_2017.setRuntimeParent(_jettag_c_if_25_1815);
                            _jettag_c_get_25_2017.setTagInfo(_td_c_get_25_2017);
                            _jettag_c_get_25_2017.doStart(context, out);
                            _jettag_c_get_25_2017.doEnd();
                            _jettag_c_if_25_1815.handleBodyContent(out);
                        }
                        _jettag_c_if_25_1815.doEnd();
                        RuntimeTagElement _jettag_c_if_25_2055 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_2055); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_2055.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_if_25_2055.setTagInfo(_td_c_if_25_2055);
                        _jettag_c_if_25_2055.doStart(context, out);
                        while (_jettag_c_if_25_2055.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_25_2186 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_2186); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_25_2186.setRuntimeParent(_jettag_c_if_25_2055);
                            _jettag_java_import_25_2186.setTagInfo(_td_java_import_25_2186);
                            _jettag_java_import_25_2186.doStart(context, out);
                            JET2Writer _jettag_java_import_25_2186_saved_out = out;
                            while (_jettag_java_import_25_2186.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                _jettag_java_import_25_2186.handleBodyContent(out);
                            }
                            out = _jettag_java_import_25_2186_saved_out;
                            _jettag_java_import_25_2186.doEnd();
                            out.write(" relative_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_2251 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_2251); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_2251.setRuntimeParent(_jettag_c_if_25_2055);
                            _jettag_c_get_25_2251.setTagInfo(_td_c_get_25_2251);
                            _jettag_c_get_25_2251.doStart(context, out);
                            _jettag_c_get_25_2251.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_2287 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_2287); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_2287.setRuntimeParent(_jettag_c_if_25_2055);
                            _jettag_c_get_25_2287.setTagInfo(_td_c_get_25_2287);
                            _jettag_c_get_25_2287.doStart(context, out);
                            _jettag_c_get_25_2287.doEnd();
                            _jettag_c_if_25_2055.handleBodyContent(out);
                        }
                        _jettag_c_if_25_2055.doEnd();
                        RuntimeTagElement _jettag_c_if_25_2325 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_2325); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_2325.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_if_25_2325.setTagInfo(_td_c_if_25_2325);
                        _jettag_c_if_25_2325.doStart(context, out);
                        while (_jettag_c_if_25_2325.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_25_2456 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_2456); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_25_2456.setRuntimeParent(_jettag_c_if_25_2325);
                            _jettag_java_import_25_2456.setTagInfo(_td_java_import_25_2456);
                            _jettag_java_import_25_2456.doStart(context, out);
                            JET2Writer _jettag_java_import_25_2456_saved_out = out;
                            while (_jettag_java_import_25_2456.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                _jettag_java_import_25_2456.handleBodyContent(out);
                            }
                            out = _jettag_java_import_25_2456_saved_out;
                            _jettag_java_import_25_2456.doEnd();
                            out.write(" relative_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_2527 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_2527); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_2527.setRuntimeParent(_jettag_c_if_25_2325);
                            _jettag_c_get_25_2527.setTagInfo(_td_c_get_25_2527);
                            _jettag_c_get_25_2527.doStart(context, out);
                            _jettag_c_get_25_2527.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_25_2563 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_2563); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_25_2563.setRuntimeParent(_jettag_c_if_25_2325);
                            _jettag_c_get_25_2563.setTagInfo(_td_c_get_25_2563);
                            _jettag_c_get_25_2563.doStart(context, out);
                            _jettag_c_get_25_2563.doEnd();
                            _jettag_c_if_25_2325.handleBodyContent(out);
                        }
                        _jettag_c_if_25_2325.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_25_2601 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_2601); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_25_2601.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_setVariable_25_2601.setTagInfo(_td_c_setVariable_25_2601);
                        _jettag_c_setVariable_25_2601.doStart(context, out);
                        _jettag_c_setVariable_25_2601.doEnd();
                        RuntimeTagElement _jettag_c_if_25_2654 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_2654); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_25_2654.setRuntimeParent(_jettag_c_iterate_25_1443);
                        _jettag_c_if_25_2654.setTagInfo(_td_c_if_25_2654);
                        _jettag_c_if_25_2654.doStart(context, out);
                        while (_jettag_c_if_25_2654.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_25_2654.handleBodyContent(out);
                        }
                        _jettag_c_if_25_2654.doEnd();
                        _jettag_c_iterate_25_1443.handleBodyContent(out);
                    }
                    _jettag_c_iterate_25_1443.doEnd();
                    out.write("){");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_setVariable_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_26_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_26_3.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_setVariable_26_3.setTagInfo(_td_c_setVariable_26_3);
                    _jettag_c_setVariable_26_3.doStart(context, out);
                    _jettag_c_setVariable_26_3.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_27_3.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_setVariable_27_3.setTagInfo(_td_c_setVariable_27_3);
                    _jettag_c_setVariable_27_3.doStart(context, out);
                    _jettag_c_setVariable_27_3.doEnd();
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_3.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_28_3.setTagInfo(_td_c_get_28_3);
                    _jettag_c_get_28_3.doStart(context, out);
                    _jettag_c_get_28_3.doEnd();
                    out.write("Service.delete");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_51.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_28_51.setTagInfo(_td_c_get_28_51);
                    _jettag_c_get_28_51.doStart(context, out);
                    _jettag_c_get_28_51.doEnd();
                    RuntimeTagElement _jettag_c_get_28_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_101.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_28_101.setTagInfo(_td_c_get_28_101);
                    _jettag_c_get_28_101.doStart(context, out);
                    _jettag_c_get_28_101.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_28_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_153); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_28_153.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_28_153.setTagInfo(_td_c_iterate_28_153);
                    _jettag_c_iterate_28_153.doStart(context, out);
                    while (_jettag_c_iterate_28_153.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_28_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_220); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_28_220.setRuntimeParent(_jettag_c_iterate_28_153);
                        _jettag_c_get_28_220.setTagInfo(_td_c_get_28_220);
                        _jettag_c_get_28_220.doStart(context, out);
                        _jettag_c_get_28_220.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_28_255 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_255); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_28_255.setRuntimeParent(_jettag_c_iterate_28_153);
                        _jettag_c_get_28_255.setTagInfo(_td_c_get_28_255);
                        _jettag_c_get_28_255.doStart(context, out);
                        _jettag_c_get_28_255.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_28_290 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_290); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_28_290.setRuntimeParent(_jettag_c_iterate_28_153);
                        _jettag_c_setVariable_28_290.setTagInfo(_td_c_setVariable_28_290);
                        _jettag_c_setVariable_28_290.doStart(context, out);
                        _jettag_c_setVariable_28_290.doEnd();
                        RuntimeTagElement _jettag_c_if_28_339 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_339); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_28_339.setRuntimeParent(_jettag_c_iterate_28_153);
                        _jettag_c_if_28_339.setTagInfo(_td_c_if_28_339);
                        _jettag_c_if_28_339.doStart(context, out);
                        while (_jettag_c_if_28_339.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_28_339.handleBodyContent(out);
                        }
                        _jettag_c_if_28_339.doEnd();
                        _jettag_c_iterate_28_153.handleBodyContent(out);
                    }
                    _jettag_c_iterate_28_153.doEnd();
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_29_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_29_5.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_iterate_29_5.setTagInfo(_td_c_iterate_29_5);
                    _jettag_c_iterate_29_5.doStart(context, out);
                    while (_jettag_c_iterate_29_5.okToProcessBody()) {
                        out.write("relative_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_29_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_78); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_29_78.setRuntimeParent(_jettag_c_iterate_29_5);
                        _jettag_c_get_29_78.setTagInfo(_td_c_get_29_78);
                        _jettag_c_get_29_78.doStart(context, out);
                        _jettag_c_get_29_78.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_29_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_114); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_29_114.setRuntimeParent(_jettag_c_iterate_29_5);
                        _jettag_c_get_29_114.setTagInfo(_td_c_get_29_114);
                        _jettag_c_get_29_114.doStart(context, out);
                        _jettag_c_get_29_114.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_29_145 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_145); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_29_145.setRuntimeParent(_jettag_c_iterate_29_5);
                        _jettag_c_setVariable_29_145.setTagInfo(_td_c_setVariable_29_145);
                        _jettag_c_setVariable_29_145.doStart(context, out);
                        _jettag_c_setVariable_29_145.doEnd();
                        RuntimeTagElement _jettag_c_if_29_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_198); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_29_198.setRuntimeParent(_jettag_c_iterate_29_5);
                        _jettag_c_if_29_198.setTagInfo(_td_c_if_29_198);
                        _jettag_c_if_29_198.doStart(context, out);
                        while (_jettag_c_if_29_198.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_29_198.handleBodyContent(out);
                        }
                        _jettag_c_if_29_198.doEnd();
                        _jettag_c_iterate_29_5.handleBodyContent(out);
                    }
                    _jettag_c_iterate_29_5.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_16_2.handleBodyContent(out);
                }
                _jettag_c_if_16_2.doEnd();
                _jettag_c_iterate_15_2.handleBodyContent(out);
            }
            _jettag_c_iterate_15_2.doEnd();
            _jettag_c_iterate_14_2.handleBodyContent(out);
        }
        _jettag_c_iterate_14_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_35_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_35_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_35_2.setRuntimeParent(null);
        _jettag_c_iterate_35_2.setTagInfo(_td_c_iterate_35_2);
        _jettag_c_iterate_35_2.doStart(context, out);
        while (_jettag_c_iterate_35_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_36_2.setRuntimeParent(_jettag_c_iterate_35_2);
            _jettag_c_iterate_36_2.setTagInfo(_td_c_iterate_36_2);
            _jettag_c_iterate_36_2.doStart(context, out);
            while (_jettag_c_iterate_36_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_37_2.setRuntimeParent(_jettag_c_iterate_36_2);
                _jettag_c_if_37_2.setTagInfo(_td_c_if_37_2);
                _jettag_c_if_37_2.doStart(context, out);
                while (_jettag_c_if_37_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_38_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_38_2.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_setVariable_38_2.setTagInfo(_td_c_setVariable_38_2);
                    _jettag_c_setVariable_38_2.doStart(context, out);
                    _jettag_c_setVariable_38_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_39_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_39_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_39_2.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_setVariable_39_2.setTagInfo(_td_c_setVariable_39_2);
                    _jettag_c_setVariable_39_2.doStart(context, out);
                    _jettag_c_setVariable_39_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_40_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_40_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_40_2.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_iterate_40_2.setTagInfo(_td_c_iterate_40_2);
                    _jettag_c_iterate_40_2.doStart(context, out);
                    while (_jettag_c_iterate_40_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_41_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_41_2.setRuntimeParent(_jettag_c_iterate_40_2);
                        _jettag_c_setVariable_41_2.setTagInfo(_td_c_setVariable_41_2);
                        _jettag_c_setVariable_41_2.doStart(context, out);
                        _jettag_c_setVariable_41_2.doEnd();
                        _jettag_c_iterate_40_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_40_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_43_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_43_2.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_iterate_43_2.setTagInfo(_td_c_iterate_43_2);
                    _jettag_c_iterate_43_2.doStart(context, out);
                    while (_jettag_c_iterate_43_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_44_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_44_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_44_2.setRuntimeParent(_jettag_c_iterate_43_2);
                        _jettag_c_setVariable_44_2.setTagInfo(_td_c_setVariable_44_2);
                        _jettag_c_setVariable_44_2.doStart(context, out);
                        _jettag_c_setVariable_44_2.doEnd();
                        _jettag_c_iterate_43_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_43_2.doEnd();
                    RuntimeTagElement _jettag_c_choose_46_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_46_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_46_2.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_choose_46_2.setTagInfo(_td_c_choose_46_2);
                    _jettag_c_choose_46_2.doStart(context, out);
                    JET2Writer _jettag_c_choose_46_2_saved_out = out;
                    while (_jettag_c_choose_46_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_47_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_47_2.setRuntimeParent(_jettag_c_choose_46_2);
                        _jettag_c_when_47_2.setTagInfo(_td_c_when_47_2);
                        _jettag_c_when_47_2.doStart(context, out);
                        JET2Writer _jettag_c_when_47_2_saved_out = out;
                        while (_jettag_c_when_47_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_48_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_48_2.setRuntimeParent(_jettag_c_when_47_2);
                            _jettag_c_iterate_48_2.setTagInfo(_td_c_iterate_48_2);
                            _jettag_c_iterate_48_2.doStart(context, out);
                            while (_jettag_c_iterate_48_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_49_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_49_2.setRuntimeParent(_jettag_c_iterate_48_2);
                                _jettag_c_choose_49_2.setTagInfo(_td_c_choose_49_2);
                                _jettag_c_choose_49_2.doStart(context, out);
                                JET2Writer _jettag_c_choose_49_2_saved_out = out;
                                while (_jettag_c_choose_49_2.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_50_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_50_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_50_2.setRuntimeParent(_jettag_c_choose_49_2);
                                    _jettag_c_when_50_2.setTagInfo(_td_c_when_50_2);
                                    _jettag_c_when_50_2.doStart(context, out);
                                    JET2Writer _jettag_c_when_50_2_saved_out = out;
                                    while (_jettag_c_when_50_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_50_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_50_2_saved_out;
                                    _jettag_c_when_50_2.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_52_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_52_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_52_2.setRuntimeParent(_jettag_c_choose_49_2);
                                    _jettag_c_otherwise_52_2.setTagInfo(_td_c_otherwise_52_2);
                                    _jettag_c_otherwise_52_2.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_52_2_saved_out = out;
                                    while (_jettag_c_otherwise_52_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_setVariable_53_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_53_2.setRuntimeParent(_jettag_c_otherwise_52_2);
                                        _jettag_c_setVariable_53_2.setTagInfo(_td_c_setVariable_53_2);
                                        _jettag_c_setVariable_53_2.doStart(context, out);
                                        _jettag_c_setVariable_53_2.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_54_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_54_2.setRuntimeParent(_jettag_c_otherwise_52_2);
                                        _jettag_c_iterate_54_2.setTagInfo(_td_c_iterate_54_2);
                                        _jettag_c_iterate_54_2.doStart(context, out);
                                        while (_jettag_c_iterate_54_2.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_if_55_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_2); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_55_2.setRuntimeParent(_jettag_c_iterate_54_2);
                                            _jettag_c_if_55_2.setTagInfo(_td_c_if_55_2);
                                            _jettag_c_if_55_2.doStart(context, out);
                                            while (_jettag_c_if_55_2.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_setVariable_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_56_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_56_2.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_setVariable_56_2.setTagInfo(_td_c_setVariable_56_2);
                                                _jettag_c_setVariable_56_2.doStart(context, out);
                                                _jettag_c_setVariable_56_2.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_57_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_57_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_57_2.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_57_2.setTagInfo(_td_c_iterate_57_2);
                                                _jettag_c_iterate_57_2.doStart(context, out);
                                                while (_jettag_c_iterate_57_2.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_58_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_58_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_58_2.setRuntimeParent(_jettag_c_iterate_57_2);
                                                    _jettag_c_setVariable_58_2.setTagInfo(_td_c_setVariable_58_2);
                                                    _jettag_c_setVariable_58_2.doStart(context, out);
                                                    _jettag_c_setVariable_58_2.doEnd();
                                                    _jettag_c_iterate_57_2.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_57_2.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_60_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_2); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_60_2.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_setVariable_60_2.setTagInfo(_td_c_setVariable_60_2);
                                                _jettag_c_setVariable_60_2.doStart(context, out);
                                                _jettag_c_setVariable_60_2.doEnd();
                                                out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_61_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_28); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_61_28.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_61_28.setTagInfo(_td_c_get_61_28);
                                                _jettag_c_get_61_28.doStart(context, out);
                                                _jettag_c_get_61_28.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_61_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_78); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_61_78.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_61_78.setTagInfo(_td_c_iterate_61_78);
                                                _jettag_c_iterate_61_78.doStart(context, out);
                                                while (_jettag_c_iterate_61_78.okToProcessBody()) {
                                                    out.write("/{");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_61_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_147); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_61_147.setRuntimeParent(_jettag_c_iterate_61_78);
                                                    _jettag_c_get_61_147.setTagInfo(_td_c_get_61_147);
                                                    _jettag_c_get_61_147.doStart(context, out);
                                                    _jettag_c_get_61_147.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_61_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_182); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_61_182.setRuntimeParent(_jettag_c_iterate_61_78);
                                                    _jettag_c_get_61_182.setTagInfo(_td_c_get_61_182);
                                                    _jettag_c_get_61_182.doStart(context, out);
                                                    _jettag_c_get_61_182.doEnd();
                                                    out.write("}");  //$NON-NLS-1$        
                                                    _jettag_c_iterate_61_78.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_61_78.doEnd();
                                                out.write("/");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_61_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_231); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_61_231.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_61_231.setTagInfo(_td_c_get_61_231);
                                                _jettag_c_get_61_231.doStart(context, out);
                                                _jettag_c_get_61_231.doEnd();
                                                out.write("s");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_61_259 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_259); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_61_259.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_61_259.setTagInfo(_td_c_iterate_61_259);
                                                _jettag_c_iterate_61_259.doStart(context, out);
                                                while (_jettag_c_iterate_61_259.okToProcessBody()) {
                                                    out.write("/{relative_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_61_326 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_326); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_61_326.setRuntimeParent(_jettag_c_iterate_61_259);
                                                    _jettag_c_get_61_326.setTagInfo(_td_c_get_61_326);
                                                    _jettag_c_get_61_326.doStart(context, out);
                                                    _jettag_c_get_61_326.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_61_354 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_354); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_61_354.setRuntimeParent(_jettag_c_iterate_61_259);
                                                    _jettag_c_get_61_354.setTagInfo(_td_c_get_61_354);
                                                    _jettag_c_get_61_354.doStart(context, out);
                                                    _jettag_c_get_61_354.doEnd();
                                                    out.write("}");  //$NON-NLS-1$        
                                                    _jettag_c_iterate_61_259.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_61_259.doEnd();
                                                out.write("\", method = RequestMethod.DELETE)");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t@ResponseBody");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\tpublic void delete");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_63_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_20); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_63_20.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_63_20.setTagInfo(_td_c_get_63_20);
                                                _jettag_c_get_63_20.doStart(context, out);
                                                _jettag_c_get_63_20.doEnd();
                                                RuntimeTagElement _jettag_c_get_63_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_70); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_63_70.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_63_70.setTagInfo(_td_c_get_63_70);
                                                _jettag_c_get_63_70.doStart(context, out);
                                                _jettag_c_get_63_70.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_63_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_115); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_63_115.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_63_115.setTagInfo(_td_c_iterate_63_115);
                                                _jettag_c_iterate_63_115.doStart(context, out);
                                                while (_jettag_c_iterate_63_115.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_63_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_182); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_182.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_if_63_182.setTagInfo(_td_c_if_63_182);
                                                    _jettag_c_if_63_182.doStart(context, out);
                                                    while (_jettag_c_if_63_182.okToProcessBody()) {
                                                        out.write("@PathVariable String ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_439 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_439); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_439.setRuntimeParent(_jettag_c_if_63_182);
                                                        _jettag_c_get_63_439.setTagInfo(_td_c_get_63_439);
                                                        _jettag_c_get_63_439.doStart(context, out);
                                                        _jettag_c_get_63_439.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_474 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_474); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_474.setRuntimeParent(_jettag_c_if_63_182);
                                                        _jettag_c_get_63_474.setTagInfo(_td_c_get_63_474);
                                                        _jettag_c_get_63_474.doStart(context, out);
                                                        _jettag_c_get_63_474.doEnd();
                                                        _jettag_c_if_63_182.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_182.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_516 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_516); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_516.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_if_63_516.setTagInfo(_td_c_if_63_516);
                                                    _jettag_c_if_63_516.doStart(context, out);
                                                    while (_jettag_c_if_63_516.okToProcessBody()) {
                                                        out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_693 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_693); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_693.setRuntimeParent(_jettag_c_if_63_516);
                                                        _jettag_c_get_63_693.setTagInfo(_td_c_get_63_693);
                                                        _jettag_c_get_63_693.doStart(context, out);
                                                        _jettag_c_get_63_693.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_728 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_728); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_728.setRuntimeParent(_jettag_c_if_63_516);
                                                        _jettag_c_get_63_728.setTagInfo(_td_c_get_63_728);
                                                        _jettag_c_get_63_728.doStart(context, out);
                                                        _jettag_c_get_63_728.doEnd();
                                                        _jettag_c_if_63_516.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_516.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_770 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_770); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_770.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_if_63_770.setTagInfo(_td_c_if_63_770);
                                                    _jettag_c_if_63_770.doStart(context, out);
                                                    while (_jettag_c_if_63_770.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_63_921 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_63_921); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_63_921.setRuntimeParent(_jettag_c_if_63_770);
                                                        _jettag_java_import_63_921.setTagInfo(_td_java_import_63_921);
                                                        _jettag_java_import_63_921.doStart(context, out);
                                                        JET2Writer _jettag_java_import_63_921_saved_out = out;
                                                        while (_jettag_java_import_63_921.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                                            _jettag_java_import_63_921.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_63_921_saved_out;
                                                        _jettag_java_import_63_921.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_977 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_977); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_977.setRuntimeParent(_jettag_c_if_63_770);
                                                        _jettag_c_get_63_977.setTagInfo(_td_c_get_63_977);
                                                        _jettag_c_get_63_977.doStart(context, out);
                                                        _jettag_c_get_63_977.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1012 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1012); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1012.setRuntimeParent(_jettag_c_if_63_770);
                                                        _jettag_c_get_63_1012.setTagInfo(_td_c_get_63_1012);
                                                        _jettag_c_get_63_1012.doStart(context, out);
                                                        _jettag_c_get_63_1012.doEnd();
                                                        _jettag_c_if_63_770.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_770.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_1054 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_1054); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_1054.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_if_63_1054.setTagInfo(_td_c_if_63_1054);
                                                    _jettag_c_if_63_1054.doStart(context, out);
                                                    while (_jettag_c_if_63_1054.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_63_1205 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_63_1205); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_63_1205.setRuntimeParent(_jettag_c_if_63_1054);
                                                        _jettag_java_import_63_1205.setTagInfo(_td_java_import_63_1205);
                                                        _jettag_java_import_63_1205.doStart(context, out);
                                                        JET2Writer _jettag_java_import_63_1205_saved_out = out;
                                                        while (_jettag_java_import_63_1205.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                                            _jettag_java_import_63_1205.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_63_1205_saved_out;
                                                        _jettag_java_import_63_1205.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1267 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1267); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1267.setRuntimeParent(_jettag_c_if_63_1054);
                                                        _jettag_c_get_63_1267.setTagInfo(_td_c_get_63_1267);
                                                        _jettag_c_get_63_1267.doStart(context, out);
                                                        _jettag_c_get_63_1267.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1302 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1302); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1302.setRuntimeParent(_jettag_c_if_63_1054);
                                                        _jettag_c_get_63_1302.setTagInfo(_td_c_get_63_1302);
                                                        _jettag_c_get_63_1302.doStart(context, out);
                                                        _jettag_c_get_63_1302.doEnd();
                                                        _jettag_c_if_63_1054.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_1054.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_63_1344 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_1344); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_63_1344.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_setVariable_63_1344.setTagInfo(_td_c_setVariable_63_1344);
                                                    _jettag_c_setVariable_63_1344.doStart(context, out);
                                                    _jettag_c_setVariable_63_1344.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_1393 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_1393); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_1393.setRuntimeParent(_jettag_c_iterate_63_115);
                                                    _jettag_c_if_63_1393.setTagInfo(_td_c_if_63_1393);
                                                    _jettag_c_if_63_1393.doStart(context, out);
                                                    while (_jettag_c_if_63_1393.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_63_1393.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_1393.doEnd();
                                                    _jettag_c_iterate_63_115.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_63_115.doEnd();
                                                out.write(",");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_63_1436 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_1436); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_63_1436.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_63_1436.setTagInfo(_td_c_iterate_63_1436);
                                                _jettag_c_iterate_63_1436.doStart(context, out);
                                                while (_jettag_c_iterate_63_1436.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_63_1492 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_1492); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_1492.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_if_63_1492.setTagInfo(_td_c_if_63_1492);
                                                    _jettag_c_if_63_1492.doStart(context, out);
                                                    while (_jettag_c_if_63_1492.okToProcessBody()) {
                                                        out.write("@PathVariable String relative_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1726 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1726); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1726.setRuntimeParent(_jettag_c_if_63_1492);
                                                        _jettag_c_get_63_1726.setTagInfo(_td_c_get_63_1726);
                                                        _jettag_c_get_63_1726.doStart(context, out);
                                                        _jettag_c_get_63_1726.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1754 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1754); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1754.setRuntimeParent(_jettag_c_if_63_1492);
                                                        _jettag_c_get_63_1754.setTagInfo(_td_c_get_63_1754);
                                                        _jettag_c_get_63_1754.doStart(context, out);
                                                        _jettag_c_get_63_1754.doEnd();
                                                        _jettag_c_if_63_1492.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_1492.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_1792 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_1792); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_1792.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_if_63_1792.setTagInfo(_td_c_if_63_1792);
                                                    _jettag_c_if_63_1792.doStart(context, out);
                                                    while (_jettag_c_if_63_1792.okToProcessBody()) {
                                                        out.write("@PathVariable Integer relative_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1958 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1958); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1958.setRuntimeParent(_jettag_c_if_63_1792);
                                                        _jettag_c_get_63_1958.setTagInfo(_td_c_get_63_1958);
                                                        _jettag_c_get_63_1958.doStart(context, out);
                                                        _jettag_c_get_63_1958.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_1986 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_1986); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_1986.setRuntimeParent(_jettag_c_if_63_1792);
                                                        _jettag_c_get_63_1986.setTagInfo(_td_c_get_63_1986);
                                                        _jettag_c_get_63_1986.doStart(context, out);
                                                        _jettag_c_get_63_1986.doEnd();
                                                        _jettag_c_if_63_1792.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_1792.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_2024 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_2024); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_2024.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_if_63_2024.setTagInfo(_td_c_if_63_2024);
                                                    _jettag_c_if_63_2024.doStart(context, out);
                                                    while (_jettag_c_if_63_2024.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_63_2155 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_63_2155); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_63_2155.setRuntimeParent(_jettag_c_if_63_2024);
                                                        _jettag_java_import_63_2155.setTagInfo(_td_java_import_63_2155);
                                                        _jettag_java_import_63_2155.doStart(context, out);
                                                        JET2Writer _jettag_java_import_63_2155_saved_out = out;
                                                        while (_jettag_java_import_63_2155.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                                            _jettag_java_import_63_2155.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_63_2155_saved_out;
                                                        _jettag_java_import_63_2155.doEnd();
                                                        out.write(" relative_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_2220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_2220); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_2220.setRuntimeParent(_jettag_c_if_63_2024);
                                                        _jettag_c_get_63_2220.setTagInfo(_td_c_get_63_2220);
                                                        _jettag_c_get_63_2220.doStart(context, out);
                                                        _jettag_c_get_63_2220.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_2248 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_2248); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_2248.setRuntimeParent(_jettag_c_if_63_2024);
                                                        _jettag_c_get_63_2248.setTagInfo(_td_c_get_63_2248);
                                                        _jettag_c_get_63_2248.doStart(context, out);
                                                        _jettag_c_get_63_2248.doEnd();
                                                        _jettag_c_if_63_2024.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_2024.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_2286 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_2286); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_2286.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_if_63_2286.setTagInfo(_td_c_if_63_2286);
                                                    _jettag_c_if_63_2286.doStart(context, out);
                                                    while (_jettag_c_if_63_2286.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_java_import_63_2417 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_63_2417); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_java_import_63_2417.setRuntimeParent(_jettag_c_if_63_2286);
                                                        _jettag_java_import_63_2417.setTagInfo(_td_java_import_63_2417);
                                                        _jettag_java_import_63_2417.doStart(context, out);
                                                        JET2Writer _jettag_java_import_63_2417_saved_out = out;
                                                        while (_jettag_java_import_63_2417.okToProcessBody()) {
                                                            out = out.newNestedContentWriter();
                                                            out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                                            _jettag_java_import_63_2417.handleBodyContent(out);
                                                        }
                                                        out = _jettag_java_import_63_2417_saved_out;
                                                        _jettag_java_import_63_2417.doEnd();
                                                        out.write(" relative_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_2488 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_2488); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_2488.setRuntimeParent(_jettag_c_if_63_2286);
                                                        _jettag_c_get_63_2488.setTagInfo(_td_c_get_63_2488);
                                                        _jettag_c_get_63_2488.doStart(context, out);
                                                        _jettag_c_get_63_2488.doEnd();
                                                        out.write("_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_63_2516 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_2516); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_63_2516.setRuntimeParent(_jettag_c_if_63_2286);
                                                        _jettag_c_get_63_2516.setTagInfo(_td_c_get_63_2516);
                                                        _jettag_c_get_63_2516.doStart(context, out);
                                                        _jettag_c_get_63_2516.doEnd();
                                                        _jettag_c_if_63_2286.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_2286.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_63_2554 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_2554); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_63_2554.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_setVariable_63_2554.setTagInfo(_td_c_setVariable_63_2554);
                                                    _jettag_c_setVariable_63_2554.doStart(context, out);
                                                    _jettag_c_setVariable_63_2554.doEnd();
                                                    RuntimeTagElement _jettag_c_if_63_2607 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_2607); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_63_2607.setRuntimeParent(_jettag_c_iterate_63_1436);
                                                    _jettag_c_if_63_2607.setTagInfo(_td_c_if_63_2607);
                                                    _jettag_c_if_63_2607.doStart(context, out);
                                                    while (_jettag_c_if_63_2607.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_63_2607.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_63_2607.doEnd();
                                                    _jettag_c_iterate_63_1436.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_63_1436.doEnd();
                                                out.write("){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                RuntimeTagElement _jettag_c_setVariable_64_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_64_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_64_3.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_setVariable_64_3.setTagInfo(_td_c_setVariable_64_3);
                                                _jettag_c_setVariable_64_3.doStart(context, out);
                                                _jettag_c_setVariable_64_3.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_65_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_65_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_65_3.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_setVariable_65_3.setTagInfo(_td_c_setVariable_65_3);
                                                _jettag_c_setVariable_65_3.doStart(context, out);
                                                _jettag_c_setVariable_65_3.doEnd();
                                                out.write("\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_66_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_66_3.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_66_3.setTagInfo(_td_c_get_66_3);
                                                _jettag_c_get_66_3.doStart(context, out);
                                                _jettag_c_get_66_3.doEnd();
                                                out.write("Service.delete");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_66_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_51); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_66_51.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_66_51.setTagInfo(_td_c_get_66_51);
                                                _jettag_c_get_66_51.doStart(context, out);
                                                _jettag_c_get_66_51.doEnd();
                                                RuntimeTagElement _jettag_c_get_66_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_101); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_66_101.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_get_66_101.setTagInfo(_td_c_get_66_101);
                                                _jettag_c_get_66_101.doStart(context, out);
                                                _jettag_c_get_66_101.doEnd();
                                                out.write("s(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_66_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_66_146); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_66_146.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_66_146.setTagInfo(_td_c_iterate_66_146);
                                                _jettag_c_iterate_66_146.doStart(context, out);
                                                while (_jettag_c_iterate_66_146.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_get_66_213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_213); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_66_213.setRuntimeParent(_jettag_c_iterate_66_146);
                                                    _jettag_c_get_66_213.setTagInfo(_td_c_get_66_213);
                                                    _jettag_c_get_66_213.doStart(context, out);
                                                    _jettag_c_get_66_213.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_66_248 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_248); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_66_248.setRuntimeParent(_jettag_c_iterate_66_146);
                                                    _jettag_c_get_66_248.setTagInfo(_td_c_get_66_248);
                                                    _jettag_c_get_66_248.doStart(context, out);
                                                    _jettag_c_get_66_248.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_66_283 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_66_283); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_66_283.setRuntimeParent(_jettag_c_iterate_66_146);
                                                    _jettag_c_setVariable_66_283.setTagInfo(_td_c_setVariable_66_283);
                                                    _jettag_c_setVariable_66_283.doStart(context, out);
                                                    _jettag_c_setVariable_66_283.doEnd();
                                                    RuntimeTagElement _jettag_c_if_66_332 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_332); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_66_332.setRuntimeParent(_jettag_c_iterate_66_146);
                                                    _jettag_c_if_66_332.setTagInfo(_td_c_if_66_332);
                                                    _jettag_c_if_66_332.doStart(context, out);
                                                    while (_jettag_c_if_66_332.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_66_332.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_66_332.doEnd();
                                                    _jettag_c_iterate_66_146.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_66_146.doEnd();
                                                out.write(",");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_iterate_67_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_67_5.setRuntimeParent(_jettag_c_if_55_2);
                                                _jettag_c_iterate_67_5.setTagInfo(_td_c_iterate_67_5);
                                                _jettag_c_iterate_67_5.doStart(context, out);
                                                while (_jettag_c_iterate_67_5.okToProcessBody()) {
                                                    out.write("relative_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_67_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_70); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_67_70.setRuntimeParent(_jettag_c_iterate_67_5);
                                                    _jettag_c_get_67_70.setTagInfo(_td_c_get_67_70);
                                                    _jettag_c_get_67_70.doStart(context, out);
                                                    _jettag_c_get_67_70.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_67_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_98); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_67_98.setRuntimeParent(_jettag_c_iterate_67_5);
                                                    _jettag_c_get_67_98.setTagInfo(_td_c_get_67_98);
                                                    _jettag_c_get_67_98.doStart(context, out);
                                                    _jettag_c_get_67_98.doEnd();
                                                    RuntimeTagElement _jettag_c_setVariable_67_129 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_67_129); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_67_129.setRuntimeParent(_jettag_c_iterate_67_5);
                                                    _jettag_c_setVariable_67_129.setTagInfo(_td_c_setVariable_67_129);
                                                    _jettag_c_setVariable_67_129.doStart(context, out);
                                                    _jettag_c_setVariable_67_129.doEnd();
                                                    RuntimeTagElement _jettag_c_if_67_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_182); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_67_182.setRuntimeParent(_jettag_c_iterate_67_5);
                                                    _jettag_c_if_67_182.setTagInfo(_td_c_if_67_182);
                                                    _jettag_c_if_67_182.doStart(context, out);
                                                    while (_jettag_c_if_67_182.okToProcessBody()) {
                                                        out.write(",");  //$NON-NLS-1$        
                                                        _jettag_c_if_67_182.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_67_182.doEnd();
                                                    _jettag_c_iterate_67_5.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_67_5.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_55_2.handleBodyContent(out);
                                            }
                                            _jettag_c_if_55_2.doEnd();
                                            _jettag_c_iterate_54_2.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_54_2.doEnd();
                                        _jettag_c_otherwise_52_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_52_2_saved_out;
                                    _jettag_c_otherwise_52_2.doEnd();
                                    _jettag_c_choose_49_2.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_49_2_saved_out;
                                _jettag_c_choose_49_2.doEnd();
                                _jettag_c_iterate_48_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_48_2.doEnd();
                            _jettag_c_when_47_2.handleBodyContent(out);
                        }
                        out = _jettag_c_when_47_2_saved_out;
                        _jettag_c_when_47_2.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_75_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_75_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_75_2.setRuntimeParent(_jettag_c_choose_46_2);
                        _jettag_c_otherwise_75_2.setTagInfo(_td_c_otherwise_75_2);
                        _jettag_c_otherwise_75_2.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_75_2_saved_out = out;
                        while (_jettag_c_otherwise_75_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_setVariable_76_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_76_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_76_2.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_setVariable_76_2.setTagInfo(_td_c_setVariable_76_2);
                            _jettag_c_setVariable_76_2.doStart(context, out);
                            _jettag_c_setVariable_76_2.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_77_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_77_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_77_2.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_setVariable_77_2.setTagInfo(_td_c_setVariable_77_2);
                            _jettag_c_setVariable_77_2.doStart(context, out);
                            _jettag_c_setVariable_77_2.doEnd();
                            RuntimeTagElement _jettag_c_iterate_78_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_78_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_78_2.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_78_2.setTagInfo(_td_c_iterate_78_2);
                            _jettag_c_iterate_78_2.doStart(context, out);
                            while (_jettag_c_iterate_78_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_79_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_79_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_79_2.setRuntimeParent(_jettag_c_iterate_78_2);
                                _jettag_c_setVariable_79_2.setTagInfo(_td_c_setVariable_79_2);
                                _jettag_c_setVariable_79_2.doStart(context, out);
                                _jettag_c_setVariable_79_2.doEnd();
                                _jettag_c_iterate_78_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_78_2.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_81_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_81_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_81_2.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_setVariable_81_2.setTagInfo(_td_c_setVariable_81_2);
                            _jettag_c_setVariable_81_2.doStart(context, out);
                            _jettag_c_setVariable_81_2.doEnd();
                            out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_82_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_28); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_82_28.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_82_28.setTagInfo(_td_c_get_82_28);
                            _jettag_c_get_82_28.doStart(context, out);
                            _jettag_c_get_82_28.doEnd();
                            RuntimeTagElement _jettag_c_iterate_82_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_78); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_82_78.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_82_78.setTagInfo(_td_c_iterate_82_78);
                            _jettag_c_iterate_82_78.doStart(context, out);
                            while (_jettag_c_iterate_82_78.okToProcessBody()) {
                                out.write("/{");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_82_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_147); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_82_147.setRuntimeParent(_jettag_c_iterate_82_78);
                                _jettag_c_get_82_147.setTagInfo(_td_c_get_82_147);
                                _jettag_c_get_82_147.doStart(context, out);
                                _jettag_c_get_82_147.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_82_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_182); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_82_182.setRuntimeParent(_jettag_c_iterate_82_78);
                                _jettag_c_get_82_182.setTagInfo(_td_c_get_82_182);
                                _jettag_c_get_82_182.doStart(context, out);
                                _jettag_c_get_82_182.doEnd();
                                out.write("}");  //$NON-NLS-1$        
                                _jettag_c_iterate_82_78.handleBodyContent(out);
                            }
                            _jettag_c_iterate_82_78.doEnd();
                            out.write("/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_82_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_231); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_82_231.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_82_231.setTagInfo(_td_c_get_82_231);
                            _jettag_c_get_82_231.doStart(context, out);
                            _jettag_c_get_82_231.doEnd();
                            out.write("s");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_82_271 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_271); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_82_271.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_82_271.setTagInfo(_td_c_iterate_82_271);
                            _jettag_c_iterate_82_271.doStart(context, out);
                            while (_jettag_c_iterate_82_271.okToProcessBody()) {
                                out.write("/{relative_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_82_350 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_350); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_82_350.setRuntimeParent(_jettag_c_iterate_82_271);
                                _jettag_c_get_82_350.setTagInfo(_td_c_get_82_350);
                                _jettag_c_get_82_350.doStart(context, out);
                                _jettag_c_get_82_350.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_82_390 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_390); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_82_390.setRuntimeParent(_jettag_c_iterate_82_271);
                                _jettag_c_get_82_390.setTagInfo(_td_c_get_82_390);
                                _jettag_c_get_82_390.doStart(context, out);
                                _jettag_c_get_82_390.doEnd();
                                out.write("}");  //$NON-NLS-1$        
                                _jettag_c_iterate_82_271.handleBodyContent(out);
                            }
                            _jettag_c_iterate_82_271.doEnd();
                            out.write("\", method = RequestMethod.DELETE)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ResponseBody");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\tpublic void delete");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_84_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_20); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_84_20.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_84_20.setTagInfo(_td_c_get_84_20);
                            _jettag_c_get_84_20.doStart(context, out);
                            _jettag_c_get_84_20.doEnd();
                            RuntimeTagElement _jettag_c_get_84_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_70); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_84_70.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_84_70.setTagInfo(_td_c_get_84_70);
                            _jettag_c_get_84_70.doStart(context, out);
                            _jettag_c_get_84_70.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_84_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_84_127); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_84_127.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_84_127.setTagInfo(_td_c_iterate_84_127);
                            _jettag_c_iterate_84_127.doStart(context, out);
                            while (_jettag_c_iterate_84_127.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_84_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_194); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_194.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_if_84_194.setTagInfo(_td_c_if_84_194);
                                _jettag_c_if_84_194.doStart(context, out);
                                while (_jettag_c_if_84_194.okToProcessBody()) {
                                    out.write("@PathVariable String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_451 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_451); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_451.setRuntimeParent(_jettag_c_if_84_194);
                                    _jettag_c_get_84_451.setTagInfo(_td_c_get_84_451);
                                    _jettag_c_get_84_451.doStart(context, out);
                                    _jettag_c_get_84_451.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_486 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_486); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_486.setRuntimeParent(_jettag_c_if_84_194);
                                    _jettag_c_get_84_486.setTagInfo(_td_c_get_84_486);
                                    _jettag_c_get_84_486.doStart(context, out);
                                    _jettag_c_get_84_486.doEnd();
                                    _jettag_c_if_84_194.handleBodyContent(out);
                                }
                                _jettag_c_if_84_194.doEnd();
                                RuntimeTagElement _jettag_c_if_84_528 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_528); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_528.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_if_84_528.setTagInfo(_td_c_if_84_528);
                                _jettag_c_if_84_528.doStart(context, out);
                                while (_jettag_c_if_84_528.okToProcessBody()) {
                                    out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_705 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_705); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_705.setRuntimeParent(_jettag_c_if_84_528);
                                    _jettag_c_get_84_705.setTagInfo(_td_c_get_84_705);
                                    _jettag_c_get_84_705.doStart(context, out);
                                    _jettag_c_get_84_705.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_740 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_740); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_740.setRuntimeParent(_jettag_c_if_84_528);
                                    _jettag_c_get_84_740.setTagInfo(_td_c_get_84_740);
                                    _jettag_c_get_84_740.doStart(context, out);
                                    _jettag_c_get_84_740.doEnd();
                                    _jettag_c_if_84_528.handleBodyContent(out);
                                }
                                _jettag_c_if_84_528.doEnd();
                                RuntimeTagElement _jettag_c_if_84_782 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_782); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_782.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_if_84_782.setTagInfo(_td_c_if_84_782);
                                _jettag_c_if_84_782.doStart(context, out);
                                while (_jettag_c_if_84_782.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_84_933 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_84_933); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_84_933.setRuntimeParent(_jettag_c_if_84_782);
                                    _jettag_java_import_84_933.setTagInfo(_td_java_import_84_933);
                                    _jettag_java_import_84_933.doStart(context, out);
                                    JET2Writer _jettag_java_import_84_933_saved_out = out;
                                    while (_jettag_java_import_84_933.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_84_933.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_84_933_saved_out;
                                    _jettag_java_import_84_933.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_989 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_989); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_989.setRuntimeParent(_jettag_c_if_84_782);
                                    _jettag_c_get_84_989.setTagInfo(_td_c_get_84_989);
                                    _jettag_c_get_84_989.doStart(context, out);
                                    _jettag_c_get_84_989.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1024 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1024); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1024.setRuntimeParent(_jettag_c_if_84_782);
                                    _jettag_c_get_84_1024.setTagInfo(_td_c_get_84_1024);
                                    _jettag_c_get_84_1024.doStart(context, out);
                                    _jettag_c_get_84_1024.doEnd();
                                    _jettag_c_if_84_782.handleBodyContent(out);
                                }
                                _jettag_c_if_84_782.doEnd();
                                RuntimeTagElement _jettag_c_if_84_1066 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_1066); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_1066.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_if_84_1066.setTagInfo(_td_c_if_84_1066);
                                _jettag_c_if_84_1066.doStart(context, out);
                                while (_jettag_c_if_84_1066.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_84_1217 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_84_1217); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_84_1217.setRuntimeParent(_jettag_c_if_84_1066);
                                    _jettag_java_import_84_1217.setTagInfo(_td_java_import_84_1217);
                                    _jettag_java_import_84_1217.doStart(context, out);
                                    JET2Writer _jettag_java_import_84_1217_saved_out = out;
                                    while (_jettag_java_import_84_1217.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_84_1217.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_84_1217_saved_out;
                                    _jettag_java_import_84_1217.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1279 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1279); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1279.setRuntimeParent(_jettag_c_if_84_1066);
                                    _jettag_c_get_84_1279.setTagInfo(_td_c_get_84_1279);
                                    _jettag_c_get_84_1279.doStart(context, out);
                                    _jettag_c_get_84_1279.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1314 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1314); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1314.setRuntimeParent(_jettag_c_if_84_1066);
                                    _jettag_c_get_84_1314.setTagInfo(_td_c_get_84_1314);
                                    _jettag_c_get_84_1314.doStart(context, out);
                                    _jettag_c_get_84_1314.doEnd();
                                    _jettag_c_if_84_1066.handleBodyContent(out);
                                }
                                _jettag_c_if_84_1066.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_84_1356 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_84_1356); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_84_1356.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_setVariable_84_1356.setTagInfo(_td_c_setVariable_84_1356);
                                _jettag_c_setVariable_84_1356.doStart(context, out);
                                _jettag_c_setVariable_84_1356.doEnd();
                                RuntimeTagElement _jettag_c_if_84_1405 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_1405); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_1405.setRuntimeParent(_jettag_c_iterate_84_127);
                                _jettag_c_if_84_1405.setTagInfo(_td_c_if_84_1405);
                                _jettag_c_if_84_1405.doStart(context, out);
                                while (_jettag_c_if_84_1405.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_84_1405.handleBodyContent(out);
                                }
                                _jettag_c_if_84_1405.doEnd();
                                _jettag_c_iterate_84_127.handleBodyContent(out);
                            }
                            _jettag_c_iterate_84_127.doEnd();
                            out.write(",");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_84_1448 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_84_1448); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_84_1448.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_84_1448.setTagInfo(_td_c_iterate_84_1448);
                            _jettag_c_iterate_84_1448.doStart(context, out);
                            while (_jettag_c_iterate_84_1448.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_84_1516 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_1516); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_1516.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_if_84_1516.setTagInfo(_td_c_if_84_1516);
                                _jettag_c_if_84_1516.doStart(context, out);
                                while (_jettag_c_if_84_1516.okToProcessBody()) {
                                    out.write("@PathVariable String relative_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1750 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1750); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1750.setRuntimeParent(_jettag_c_if_84_1516);
                                    _jettag_c_get_84_1750.setTagInfo(_td_c_get_84_1750);
                                    _jettag_c_get_84_1750.doStart(context, out);
                                    _jettag_c_get_84_1750.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1790 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1790); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1790.setRuntimeParent(_jettag_c_if_84_1516);
                                    _jettag_c_get_84_1790.setTagInfo(_td_c_get_84_1790);
                                    _jettag_c_get_84_1790.doStart(context, out);
                                    _jettag_c_get_84_1790.doEnd();
                                    _jettag_c_if_84_1516.handleBodyContent(out);
                                }
                                _jettag_c_if_84_1516.doEnd();
                                RuntimeTagElement _jettag_c_if_84_1828 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_1828); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_1828.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_if_84_1828.setTagInfo(_td_c_if_84_1828);
                                _jettag_c_if_84_1828.doStart(context, out);
                                while (_jettag_c_if_84_1828.okToProcessBody()) {
                                    out.write("@PathVariable Integer relative_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_1994 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_1994); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_1994.setRuntimeParent(_jettag_c_if_84_1828);
                                    _jettag_c_get_84_1994.setTagInfo(_td_c_get_84_1994);
                                    _jettag_c_get_84_1994.doStart(context, out);
                                    _jettag_c_get_84_1994.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_2034 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_2034); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_2034.setRuntimeParent(_jettag_c_if_84_1828);
                                    _jettag_c_get_84_2034.setTagInfo(_td_c_get_84_2034);
                                    _jettag_c_get_84_2034.doStart(context, out);
                                    _jettag_c_get_84_2034.doEnd();
                                    _jettag_c_if_84_1828.handleBodyContent(out);
                                }
                                _jettag_c_if_84_1828.doEnd();
                                RuntimeTagElement _jettag_c_if_84_2072 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_2072); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_2072.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_if_84_2072.setTagInfo(_td_c_if_84_2072);
                                _jettag_c_if_84_2072.doStart(context, out);
                                while (_jettag_c_if_84_2072.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_84_2203 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_84_2203); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_84_2203.setRuntimeParent(_jettag_c_if_84_2072);
                                    _jettag_java_import_84_2203.setTagInfo(_td_java_import_84_2203);
                                    _jettag_java_import_84_2203.doStart(context, out);
                                    JET2Writer _jettag_java_import_84_2203_saved_out = out;
                                    while (_jettag_java_import_84_2203.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_84_2203.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_84_2203_saved_out;
                                    _jettag_java_import_84_2203.doEnd();
                                    out.write(" relative_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_2268 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_2268); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_2268.setRuntimeParent(_jettag_c_if_84_2072);
                                    _jettag_c_get_84_2268.setTagInfo(_td_c_get_84_2268);
                                    _jettag_c_get_84_2268.doStart(context, out);
                                    _jettag_c_get_84_2268.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_2308 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_2308); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_2308.setRuntimeParent(_jettag_c_if_84_2072);
                                    _jettag_c_get_84_2308.setTagInfo(_td_c_get_84_2308);
                                    _jettag_c_get_84_2308.doStart(context, out);
                                    _jettag_c_get_84_2308.doEnd();
                                    _jettag_c_if_84_2072.handleBodyContent(out);
                                }
                                _jettag_c_if_84_2072.doEnd();
                                RuntimeTagElement _jettag_c_if_84_2346 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_2346); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_2346.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_if_84_2346.setTagInfo(_td_c_if_84_2346);
                                _jettag_c_if_84_2346.doStart(context, out);
                                while (_jettag_c_if_84_2346.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_84_2477 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_84_2477); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_84_2477.setRuntimeParent(_jettag_c_if_84_2346);
                                    _jettag_java_import_84_2477.setTagInfo(_td_java_import_84_2477);
                                    _jettag_java_import_84_2477.doStart(context, out);
                                    JET2Writer _jettag_java_import_84_2477_saved_out = out;
                                    while (_jettag_java_import_84_2477.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_84_2477.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_84_2477_saved_out;
                                    _jettag_java_import_84_2477.doEnd();
                                    out.write(" relative_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_2548 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_2548); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_2548.setRuntimeParent(_jettag_c_if_84_2346);
                                    _jettag_c_get_84_2548.setTagInfo(_td_c_get_84_2548);
                                    _jettag_c_get_84_2548.doStart(context, out);
                                    _jettag_c_get_84_2548.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_84_2588 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_84_2588); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_84_2588.setRuntimeParent(_jettag_c_if_84_2346);
                                    _jettag_c_get_84_2588.setTagInfo(_td_c_get_84_2588);
                                    _jettag_c_get_84_2588.doStart(context, out);
                                    _jettag_c_get_84_2588.doEnd();
                                    _jettag_c_if_84_2346.handleBodyContent(out);
                                }
                                _jettag_c_if_84_2346.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_84_2626 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_84_2626); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_84_2626.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_setVariable_84_2626.setTagInfo(_td_c_setVariable_84_2626);
                                _jettag_c_setVariable_84_2626.doStart(context, out);
                                _jettag_c_setVariable_84_2626.doEnd();
                                RuntimeTagElement _jettag_c_if_84_2679 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_2679); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_84_2679.setRuntimeParent(_jettag_c_iterate_84_1448);
                                _jettag_c_if_84_2679.setTagInfo(_td_c_if_84_2679);
                                _jettag_c_if_84_2679.doStart(context, out);
                                while (_jettag_c_if_84_2679.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_84_2679.handleBodyContent(out);
                                }
                                _jettag_c_if_84_2679.doEnd();
                                _jettag_c_iterate_84_1448.handleBodyContent(out);
                            }
                            _jettag_c_iterate_84_1448.doEnd();
                            out.write("){");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_setVariable_85_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_85_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_85_3.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_setVariable_85_3.setTagInfo(_td_c_setVariable_85_3);
                            _jettag_c_setVariable_85_3.doStart(context, out);
                            _jettag_c_setVariable_85_3.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_86_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_86_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_86_3.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_setVariable_86_3.setTagInfo(_td_c_setVariable_86_3);
                            _jettag_c_setVariable_86_3.doStart(context, out);
                            _jettag_c_setVariable_86_3.doEnd();
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_87_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_87_3.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_87_3.setTagInfo(_td_c_get_87_3);
                            _jettag_c_get_87_3.doStart(context, out);
                            _jettag_c_get_87_3.doEnd();
                            out.write("Service.delete");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_87_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_51); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_87_51.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_87_51.setTagInfo(_td_c_get_87_51);
                            _jettag_c_get_87_51.doStart(context, out);
                            _jettag_c_get_87_51.doEnd();
                            RuntimeTagElement _jettag_c_get_87_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_101); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_87_101.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_get_87_101.setTagInfo(_td_c_get_87_101);
                            _jettag_c_get_87_101.doStart(context, out);
                            _jettag_c_get_87_101.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_87_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_87_158); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_87_158.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_87_158.setTagInfo(_td_c_iterate_87_158);
                            _jettag_c_iterate_87_158.doStart(context, out);
                            while (_jettag_c_iterate_87_158.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_get_87_225 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_225); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_87_225.setRuntimeParent(_jettag_c_iterate_87_158);
                                _jettag_c_get_87_225.setTagInfo(_td_c_get_87_225);
                                _jettag_c_get_87_225.doStart(context, out);
                                _jettag_c_get_87_225.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_87_260 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_260); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_87_260.setRuntimeParent(_jettag_c_iterate_87_158);
                                _jettag_c_get_87_260.setTagInfo(_td_c_get_87_260);
                                _jettag_c_get_87_260.doStart(context, out);
                                _jettag_c_get_87_260.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_87_295 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_87_295); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_87_295.setRuntimeParent(_jettag_c_iterate_87_158);
                                _jettag_c_setVariable_87_295.setTagInfo(_td_c_setVariable_87_295);
                                _jettag_c_setVariable_87_295.doStart(context, out);
                                _jettag_c_setVariable_87_295.doEnd();
                                RuntimeTagElement _jettag_c_if_87_344 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_87_344); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_87_344.setRuntimeParent(_jettag_c_iterate_87_158);
                                _jettag_c_if_87_344.setTagInfo(_td_c_if_87_344);
                                _jettag_c_if_87_344.doStart(context, out);
                                while (_jettag_c_if_87_344.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_87_344.handleBodyContent(out);
                                }
                                _jettag_c_if_87_344.doEnd();
                                _jettag_c_iterate_87_158.handleBodyContent(out);
                            }
                            _jettag_c_iterate_87_158.doEnd();
                            out.write(",");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_88_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_88_5); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_88_5.setRuntimeParent(_jettag_c_otherwise_75_2);
                            _jettag_c_iterate_88_5.setTagInfo(_td_c_iterate_88_5);
                            _jettag_c_iterate_88_5.doStart(context, out);
                            while (_jettag_c_iterate_88_5.okToProcessBody()) {
                                out.write("relative_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_88_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_82); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_88_82.setRuntimeParent(_jettag_c_iterate_88_5);
                                _jettag_c_get_88_82.setTagInfo(_td_c_get_88_82);
                                _jettag_c_get_88_82.doStart(context, out);
                                _jettag_c_get_88_82.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_88_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_122); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_88_122.setRuntimeParent(_jettag_c_iterate_88_5);
                                _jettag_c_get_88_122.setTagInfo(_td_c_get_88_122);
                                _jettag_c_get_88_122.doStart(context, out);
                                _jettag_c_get_88_122.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_88_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_88_153); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_88_153.setRuntimeParent(_jettag_c_iterate_88_5);
                                _jettag_c_setVariable_88_153.setTagInfo(_td_c_setVariable_88_153);
                                _jettag_c_setVariable_88_153.doStart(context, out);
                                _jettag_c_setVariable_88_153.doEnd();
                                RuntimeTagElement _jettag_c_if_88_206 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_206); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_88_206.setRuntimeParent(_jettag_c_iterate_88_5);
                                _jettag_c_if_88_206.setTagInfo(_td_c_if_88_206);
                                _jettag_c_if_88_206.doStart(context, out);
                                while (_jettag_c_if_88_206.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_88_206.handleBodyContent(out);
                                }
                                _jettag_c_if_88_206.doEnd();
                                _jettag_c_iterate_88_5.handleBodyContent(out);
                            }
                            _jettag_c_iterate_88_5.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_75_2.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_75_2_saved_out;
                        _jettag_c_otherwise_75_2.doEnd();
                        _jettag_c_choose_46_2.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_46_2_saved_out;
                    _jettag_c_choose_46_2.doEnd();
                    _jettag_c_if_37_2.handleBodyContent(out);
                }
                _jettag_c_if_37_2.doEnd();
                _jettag_c_iterate_36_2.handleBodyContent(out);
            }
            _jettag_c_iterate_36_2.doEnd();
            _jettag_c_iterate_35_2.handleBodyContent(out);
        }
        _jettag_c_iterate_35_2.doEnd();
    }
}
