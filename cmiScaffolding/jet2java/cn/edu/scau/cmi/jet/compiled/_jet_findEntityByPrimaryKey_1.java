package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKey_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKey_1() {
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
                "pk", //$NON-NLS-1$
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
    private static final TagInfo _td_c_if_6_5 = new TagInfo("c:if", //$NON-NLS-1$
            6, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
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
    private static final TagInfo _td_c_iterate_8_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_194 = new TagInfo("c:if", //$NON-NLS-1$
            8, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_437 = new TagInfo("c:get", //$NON-NLS-1$
            8, 437,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_479 = new TagInfo("c:if", //$NON-NLS-1$
            8, 479,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_642 = new TagInfo("c:get", //$NON-NLS-1$
            8, 642,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_684 = new TagInfo("c:if", //$NON-NLS-1$
            8, 684,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_835 = new TagInfo("java:import", //$NON-NLS-1$
            8, 835,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_877 = new TagInfo("c:get", //$NON-NLS-1$
            8, 877,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_919 = new TagInfo("c:if", //$NON-NLS-1$
            8, 919,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_1070 = new TagInfo("java:import", //$NON-NLS-1$
            8, 1070,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_1118 = new TagInfo("c:get", //$NON-NLS-1$
            8, 1118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1160 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1160,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1209 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1209,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_1260 = new TagInfo("java:import", //$NON-NLS-1$
            8, 1260,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_14 = new TagInfo("c:get", //$NON-NLS-1$
            9, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_77 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 77,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_144 = new TagInfo("c:get", //$NON-NLS-1$
            9, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_9 = new TagInfo("c:get", //$NON-NLS-1$
            13, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_64 = new TagInfo("c:get", //$NON-NLS-1$
            13, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_194 = new TagInfo("c:if", //$NON-NLS-1$
            13, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_437 = new TagInfo("c:get", //$NON-NLS-1$
            13, 437,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_479 = new TagInfo("c:if", //$NON-NLS-1$
            13, 479,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_642 = new TagInfo("c:get", //$NON-NLS-1$
            13, 642,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_684 = new TagInfo("c:if", //$NON-NLS-1$
            13, 684,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_13_835 = new TagInfo("java:import", //$NON-NLS-1$
            13, 835,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_877 = new TagInfo("c:get", //$NON-NLS-1$
            13, 877,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_919 = new TagInfo("c:if", //$NON-NLS-1$
            13, 919,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_13_1070 = new TagInfo("java:import", //$NON-NLS-1$
            13, 1070,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_1118 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_40 = new TagInfo("c:get", //$NON-NLS-1$
            15, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_194 = new TagInfo("c:get", //$NON-NLS-1$
            15, 194,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_229 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 229,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num+(-1)", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_274 = new TagInfo("c:if", //$NON-NLS-1$
            15, 274,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$num>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_12 = new TagInfo("c:get", //$NON-NLS-1$
            16, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_50 = new TagInfo("c:get", //$NON-NLS-1$
            16, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_2 = new TagInfo("c:if", //$NON-NLS-1$
            23, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_9 = new TagInfo("c:get", //$NON-NLS-1$
            25, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_64 = new TagInfo("c:get", //$NON-NLS-1$
            25, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_194 = new TagInfo("c:if", //$NON-NLS-1$
            25, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_437 = new TagInfo("c:get", //$NON-NLS-1$
            25, 437,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_484 = new TagInfo("c:if", //$NON-NLS-1$
            25, 484,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_647 = new TagInfo("c:get", //$NON-NLS-1$
            25, 647,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_694 = new TagInfo("c:if", //$NON-NLS-1$
            25, 694,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_845 = new TagInfo("java:import", //$NON-NLS-1$
            25, 845,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_887 = new TagInfo("c:get", //$NON-NLS-1$
            25, 887,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_934 = new TagInfo("c:if", //$NON-NLS-1$
            25, 934,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_1085 = new TagInfo("java:import", //$NON-NLS-1$
            25, 1085,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_1133 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_1180 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 1180,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1229 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1229,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_1280 = new TagInfo("java:import", //$NON-NLS-1$
            25, 1280,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_26_14 = new TagInfo("c:get", //$NON-NLS-1$
            26, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_77 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 77,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_144 = new TagInfo("c:get", //$NON-NLS-1$
            26, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_9 = new TagInfo("c:get", //$NON-NLS-1$
            30, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_64 = new TagInfo("c:get", //$NON-NLS-1$
            30, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_194 = new TagInfo("c:if", //$NON-NLS-1$
            30, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_437 = new TagInfo("c:get", //$NON-NLS-1$
            30, 437,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_484 = new TagInfo("c:if", //$NON-NLS-1$
            30, 484,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_647 = new TagInfo("c:get", //$NON-NLS-1$
            30, 647,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_694 = new TagInfo("c:if", //$NON-NLS-1$
            30, 694,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_30_845 = new TagInfo("java:import", //$NON-NLS-1$
            30, 845,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_30_887 = new TagInfo("c:get", //$NON-NLS-1$
            30, 887,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_934 = new TagInfo("c:if", //$NON-NLS-1$
            30, 934,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_30_1085 = new TagInfo("java:import", //$NON-NLS-1$
            30, 1085,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_30_1133 = new TagInfo("c:get", //$NON-NLS-1$
            30, 1133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_40 = new TagInfo("c:get", //$NON-NLS-1$
            32, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_194 = new TagInfo("c:get", //$NON-NLS-1$
            32, 194,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_32_234 = new TagInfo("c:setVariable", //$NON-NLS-1$
            32, 234,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num+(-1)", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_32_279 = new TagInfo("c:if", //$NON-NLS-1$
            32, 279,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$num>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_12 = new TagInfo("c:get", //$NON-NLS-1$
            33, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_50 = new TagInfo("c:get", //$NON-NLS-1$
            33, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_if_6_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_5.setRuntimeParent(null);
        _jettag_c_if_6_5.setTagInfo(_td_c_if_6_5);
        _jettag_c_if_6_5.doStart(context, out);
        while (_jettag_c_if_6_5.okToProcessBody()) {
            out.write("    @Transactional");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_9.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
            _jettag_c_get_8_9.doStart(context, out);
            _jettag_c_get_8_9.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_64.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_8_64.setTagInfo(_td_c_get_8_64);
            _jettag_c_get_8_64.doStart(context, out);
            _jettag_c_get_8_64.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_8_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_8_127.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_iterate_8_127.setTagInfo(_td_c_iterate_8_127);
            _jettag_c_iterate_8_127.doStart(context, out);
            while (_jettag_c_iterate_8_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_8_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_194.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_if_8_194.setTagInfo(_td_c_if_8_194);
                _jettag_c_if_8_194.doStart(context, out);
                while (_jettag_c_if_8_194.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_437 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_437); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_437.setRuntimeParent(_jettag_c_if_8_194);
                    _jettag_c_get_8_437.setTagInfo(_td_c_get_8_437);
                    _jettag_c_get_8_437.doStart(context, out);
                    _jettag_c_get_8_437.doEnd();
                    _jettag_c_if_8_194.handleBodyContent(out);
                }
                _jettag_c_if_8_194.doEnd();
                RuntimeTagElement _jettag_c_if_8_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_479); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_479.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_if_8_479.setTagInfo(_td_c_if_8_479);
                _jettag_c_if_8_479.doStart(context, out);
                while (_jettag_c_if_8_479.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_642 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_642); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_642.setRuntimeParent(_jettag_c_if_8_479);
                    _jettag_c_get_8_642.setTagInfo(_td_c_get_8_642);
                    _jettag_c_get_8_642.doStart(context, out);
                    _jettag_c_get_8_642.doEnd();
                    _jettag_c_if_8_479.handleBodyContent(out);
                }
                _jettag_c_if_8_479.doEnd();
                RuntimeTagElement _jettag_c_if_8_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_684); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_684.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_if_8_684.setTagInfo(_td_c_if_8_684);
                _jettag_c_if_8_684.doStart(context, out);
                while (_jettag_c_if_8_684.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_8_835 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_835); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_8_835.setRuntimeParent(_jettag_c_if_8_684);
                    _jettag_java_import_8_835.setTagInfo(_td_java_import_8_835);
                    _jettag_java_import_8_835.doStart(context, out);
                    JET2Writer _jettag_java_import_8_835_saved_out = out;
                    while (_jettag_java_import_8_835.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_8_835.handleBodyContent(out);
                    }
                    out = _jettag_java_import_8_835_saved_out;
                    _jettag_java_import_8_835.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_877 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_877); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_877.setRuntimeParent(_jettag_c_if_8_684);
                    _jettag_c_get_8_877.setTagInfo(_td_c_get_8_877);
                    _jettag_c_get_8_877.doStart(context, out);
                    _jettag_c_get_8_877.doEnd();
                    _jettag_c_if_8_684.handleBodyContent(out);
                }
                _jettag_c_if_8_684.doEnd();
                RuntimeTagElement _jettag_c_if_8_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_919); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_919.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_if_8_919.setTagInfo(_td_c_if_8_919);
                _jettag_c_if_8_919.doStart(context, out);
                while (_jettag_c_if_8_919.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_8_1070 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_1070); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_8_1070.setRuntimeParent(_jettag_c_if_8_919);
                    _jettag_java_import_8_1070.setTagInfo(_td_java_import_8_1070);
                    _jettag_java_import_8_1070.doStart(context, out);
                    JET2Writer _jettag_java_import_8_1070_saved_out = out;
                    while (_jettag_java_import_8_1070.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_8_1070.handleBodyContent(out);
                    }
                    out = _jettag_java_import_8_1070_saved_out;
                    _jettag_java_import_8_1070.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_1118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_1118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_1118.setRuntimeParent(_jettag_c_if_8_919);
                    _jettag_c_get_8_1118.setTagInfo(_td_c_get_8_1118);
                    _jettag_c_get_8_1118.doStart(context, out);
                    _jettag_c_get_8_1118.doEnd();
                    _jettag_c_if_8_919.handleBodyContent(out);
                }
                _jettag_c_if_8_919.doEnd();
                RuntimeTagElement _jettag_c_setVariable_8_1160 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1160); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_8_1160.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_setVariable_8_1160.setTagInfo(_td_c_setVariable_8_1160);
                _jettag_c_setVariable_8_1160.doStart(context, out);
                _jettag_c_setVariable_8_1160.doEnd();
                RuntimeTagElement _jettag_c_if_8_1209 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1209); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_1209.setRuntimeParent(_jettag_c_iterate_8_127);
                _jettag_c_if_8_1209.setTagInfo(_td_c_if_8_1209);
                _jettag_c_if_8_1209.doStart(context, out);
                while (_jettag_c_if_8_1209.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_8_1209.handleBodyContent(out);
                }
                _jettag_c_if_8_1209.doEnd();
                _jettag_c_iterate_8_127.handleBodyContent(out);
            }
            _jettag_c_iterate_8_127.doEnd();
            out.write(") throws ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_8_1260 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_1260); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_8_1260.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_java_import_8_1260.setTagInfo(_td_java_import_8_1260);
            _jettag_java_import_8_1260.doStart(context, out);
            JET2Writer _jettag_java_import_8_1260_saved_out = out;
            while (_jettag_java_import_8_1260.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                _jettag_java_import_8_1260.handleBodyContent(out);
            }
            out = _jettag_java_import_8_1260_saved_out;
            _jettag_java_import_8_1260.doEnd();
            out.write("{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_14.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_9_14.setTagInfo(_td_c_get_9_14);
            _jettag_c_get_9_14.doStart(context, out);
            _jettag_c_get_9_14.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_9_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_77); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_9_77.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_iterate_9_77.setTagInfo(_td_c_iterate_9_77);
            _jettag_c_iterate_9_77.doStart(context, out);
            while (_jettag_c_iterate_9_77.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_9_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_144.setRuntimeParent(_jettag_c_iterate_9_77);
                _jettag_c_get_9_144.setTagInfo(_td_c_get_9_144);
                _jettag_c_get_9_144.doStart(context, out);
                _jettag_c_get_9_144.doEnd();
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_iterate_9_77.handleBodyContent(out);
            }
            _jettag_c_iterate_9_77.doEnd();
            out.write(" -1, -1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    @Transactional");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_9.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_13_9.setTagInfo(_td_c_get_13_9);
            _jettag_c_get_13_9.doStart(context, out);
            _jettag_c_get_13_9.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_64.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_13_64.setTagInfo(_td_c_get_13_64);
            _jettag_c_get_13_64.doStart(context, out);
            _jettag_c_get_13_64.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_13_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_13_127.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_iterate_13_127.setTagInfo(_td_c_iterate_13_127);
            _jettag_c_iterate_13_127.doStart(context, out);
            while (_jettag_c_iterate_13_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_13_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_194.setRuntimeParent(_jettag_c_iterate_13_127);
                _jettag_c_if_13_194.setTagInfo(_td_c_if_13_194);
                _jettag_c_if_13_194.doStart(context, out);
                while (_jettag_c_if_13_194.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_437 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_437); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_437.setRuntimeParent(_jettag_c_if_13_194);
                    _jettag_c_get_13_437.setTagInfo(_td_c_get_13_437);
                    _jettag_c_get_13_437.doStart(context, out);
                    _jettag_c_get_13_437.doEnd();
                    _jettag_c_if_13_194.handleBodyContent(out);
                }
                _jettag_c_if_13_194.doEnd();
                RuntimeTagElement _jettag_c_if_13_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_479); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_479.setRuntimeParent(_jettag_c_iterate_13_127);
                _jettag_c_if_13_479.setTagInfo(_td_c_if_13_479);
                _jettag_c_if_13_479.doStart(context, out);
                while (_jettag_c_if_13_479.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_642 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_642); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_642.setRuntimeParent(_jettag_c_if_13_479);
                    _jettag_c_get_13_642.setTagInfo(_td_c_get_13_642);
                    _jettag_c_get_13_642.doStart(context, out);
                    _jettag_c_get_13_642.doEnd();
                    _jettag_c_if_13_479.handleBodyContent(out);
                }
                _jettag_c_if_13_479.doEnd();
                RuntimeTagElement _jettag_c_if_13_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_684); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_684.setRuntimeParent(_jettag_c_iterate_13_127);
                _jettag_c_if_13_684.setTagInfo(_td_c_if_13_684);
                _jettag_c_if_13_684.doStart(context, out);
                while (_jettag_c_if_13_684.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_13_835 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_13_835); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_13_835.setRuntimeParent(_jettag_c_if_13_684);
                    _jettag_java_import_13_835.setTagInfo(_td_java_import_13_835);
                    _jettag_java_import_13_835.doStart(context, out);
                    JET2Writer _jettag_java_import_13_835_saved_out = out;
                    while (_jettag_java_import_13_835.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_13_835.handleBodyContent(out);
                    }
                    out = _jettag_java_import_13_835_saved_out;
                    _jettag_java_import_13_835.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_877 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_877); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_877.setRuntimeParent(_jettag_c_if_13_684);
                    _jettag_c_get_13_877.setTagInfo(_td_c_get_13_877);
                    _jettag_c_get_13_877.doStart(context, out);
                    _jettag_c_get_13_877.doEnd();
                    _jettag_c_if_13_684.handleBodyContent(out);
                }
                _jettag_c_if_13_684.doEnd();
                RuntimeTagElement _jettag_c_if_13_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_919); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_919.setRuntimeParent(_jettag_c_iterate_13_127);
                _jettag_c_if_13_919.setTagInfo(_td_c_if_13_919);
                _jettag_c_if_13_919.doStart(context, out);
                while (_jettag_c_if_13_919.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_13_1070 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_13_1070); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_13_1070.setRuntimeParent(_jettag_c_if_13_919);
                    _jettag_java_import_13_1070.setTagInfo(_td_java_import_13_1070);
                    _jettag_java_import_13_1070.doStart(context, out);
                    JET2Writer _jettag_java_import_13_1070_saved_out = out;
                    while (_jettag_java_import_13_1070.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_13_1070.handleBodyContent(out);
                    }
                    out = _jettag_java_import_13_1070_saved_out;
                    _jettag_java_import_13_1070.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_1118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_1118.setRuntimeParent(_jettag_c_if_13_919);
                    _jettag_c_get_13_1118.setTagInfo(_td_c_get_13_1118);
                    _jettag_c_get_13_1118.doStart(context, out);
                    _jettag_c_get_13_1118.doEnd();
                    _jettag_c_if_13_919.handleBodyContent(out);
                }
                _jettag_c_if_13_919.doEnd();
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_iterate_13_127.handleBodyContent(out);
            }
            _jettag_c_iterate_13_127.doEnd();
            out.write(" int startResult, int maxRows) throws DataAccessException{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\ttry {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_40.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_15_40.setTagInfo(_td_c_get_15_40);
            _jettag_c_get_15_40.doStart(context, out);
            _jettag_c_get_15_40.doEnd();
            out.write("ByPrimaryKey\", startResult, maxRows, ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_15_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_127.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_iterate_15_127.setTagInfo(_td_c_iterate_15_127);
            _jettag_c_iterate_15_127.doStart(context, out);
            while (_jettag_c_iterate_15_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_15_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_194.setRuntimeParent(_jettag_c_iterate_15_127);
                _jettag_c_get_15_194.setTagInfo(_td_c_get_15_194);
                _jettag_c_get_15_194.doStart(context, out);
                _jettag_c_get_15_194.doEnd();
                RuntimeTagElement _jettag_c_setVariable_15_229 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_229); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_15_229.setRuntimeParent(_jettag_c_iterate_15_127);
                _jettag_c_setVariable_15_229.setTagInfo(_td_c_setVariable_15_229);
                _jettag_c_setVariable_15_229.doStart(context, out);
                _jettag_c_setVariable_15_229.doEnd();
                RuntimeTagElement _jettag_c_if_15_274 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_274); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_274.setRuntimeParent(_jettag_c_iterate_15_127);
                _jettag_c_if_15_274.setTagInfo(_td_c_if_15_274);
                _jettag_c_if_15_274.doStart(context, out);
                while (_jettag_c_if_15_274.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_15_274.handleBodyContent(out);
                }
                _jettag_c_if_15_274.doEnd();
                _jettag_c_iterate_15_127.handleBodyContent(out);
            }
            _jettag_c_iterate_15_127.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_12.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_16_12.setTagInfo(_td_c_get_16_12);
            _jettag_c_get_16_12.doStart(context, out);
            _jettag_c_get_16_12.doEnd();
            out.write(".domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_16_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_50.setRuntimeParent(_jettag_c_if_6_5);
            _jettag_c_get_16_50.setTagInfo(_td_c_get_16_50);
            _jettag_c_get_16_50.doStart(context, out);
            _jettag_c_get_16_50.doEnd();
            out.write(") query.getSingleResult();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t} catch (NoResultException nre) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn null;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_6_5.handleBodyContent(out);
        }
        _jettag_c_if_6_5.doEnd();
        RuntimeTagElement _jettag_c_setVariable_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_22_2.setRuntimeParent(null);
        _jettag_c_setVariable_22_2.setTagInfo(_td_c_setVariable_22_2);
        _jettag_c_setVariable_22_2.doStart(context, out);
        _jettag_c_setVariable_22_2.doEnd();
        RuntimeTagElement _jettag_c_if_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_23_2.setRuntimeParent(null);
        _jettag_c_if_23_2.setTagInfo(_td_c_if_23_2);
        _jettag_c_if_23_2.doStart(context, out);
        while (_jettag_c_if_23_2.okToProcessBody()) {
            out.write("    @Transactional");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_25_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_9.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_25_9.setTagInfo(_td_c_get_25_9);
            _jettag_c_get_25_9.doStart(context, out);
            _jettag_c_get_25_9.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_25_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_64.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_25_64.setTagInfo(_td_c_get_25_64);
            _jettag_c_get_25_64.doStart(context, out);
            _jettag_c_get_25_64.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_25_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_25_127.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_iterate_25_127.setTagInfo(_td_c_iterate_25_127);
            _jettag_c_iterate_25_127.doStart(context, out);
            while (_jettag_c_iterate_25_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_25_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_194.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_if_25_194.setTagInfo(_td_c_if_25_194);
                _jettag_c_if_25_194.doStart(context, out);
                while (_jettag_c_if_25_194.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_437 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_437); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_437.setRuntimeParent(_jettag_c_if_25_194);
                    _jettag_c_get_25_437.setTagInfo(_td_c_get_25_437);
                    _jettag_c_get_25_437.doStart(context, out);
                    _jettag_c_get_25_437.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_25_194.handleBodyContent(out);
                }
                _jettag_c_if_25_194.doEnd();
                RuntimeTagElement _jettag_c_if_25_484 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_484); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_484.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_if_25_484.setTagInfo(_td_c_if_25_484);
                _jettag_c_if_25_484.doStart(context, out);
                while (_jettag_c_if_25_484.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_647 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_647); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_647.setRuntimeParent(_jettag_c_if_25_484);
                    _jettag_c_get_25_647.setTagInfo(_td_c_get_25_647);
                    _jettag_c_get_25_647.doStart(context, out);
                    _jettag_c_get_25_647.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_25_484.handleBodyContent(out);
                }
                _jettag_c_if_25_484.doEnd();
                RuntimeTagElement _jettag_c_if_25_694 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_694); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_694.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_if_25_694.setTagInfo(_td_c_if_25_694);
                _jettag_c_if_25_694.doStart(context, out);
                while (_jettag_c_if_25_694.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_25_845 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_845); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_25_845.setRuntimeParent(_jettag_c_if_25_694);
                    _jettag_java_import_25_845.setTagInfo(_td_java_import_25_845);
                    _jettag_java_import_25_845.doStart(context, out);
                    JET2Writer _jettag_java_import_25_845_saved_out = out;
                    while (_jettag_java_import_25_845.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_25_845.handleBodyContent(out);
                    }
                    out = _jettag_java_import_25_845_saved_out;
                    _jettag_java_import_25_845.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_887 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_887); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_887.setRuntimeParent(_jettag_c_if_25_694);
                    _jettag_c_get_25_887.setTagInfo(_td_c_get_25_887);
                    _jettag_c_get_25_887.doStart(context, out);
                    _jettag_c_get_25_887.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_25_694.handleBodyContent(out);
                }
                _jettag_c_if_25_694.doEnd();
                RuntimeTagElement _jettag_c_if_25_934 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_934); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_934.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_if_25_934.setTagInfo(_td_c_if_25_934);
                _jettag_c_if_25_934.doStart(context, out);
                while (_jettag_c_if_25_934.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_25_1085 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_1085); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_25_1085.setRuntimeParent(_jettag_c_if_25_934);
                    _jettag_java_import_25_1085.setTagInfo(_td_java_import_25_1085);
                    _jettag_java_import_25_1085.doStart(context, out);
                    JET2Writer _jettag_java_import_25_1085_saved_out = out;
                    while (_jettag_java_import_25_1085.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_25_1085.handleBodyContent(out);
                    }
                    out = _jettag_java_import_25_1085_saved_out;
                    _jettag_java_import_25_1085.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_1133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1133); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_1133.setRuntimeParent(_jettag_c_if_25_934);
                    _jettag_c_get_25_1133.setTagInfo(_td_c_get_25_1133);
                    _jettag_c_get_25_1133.doStart(context, out);
                    _jettag_c_get_25_1133.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_25_934.handleBodyContent(out);
                }
                _jettag_c_if_25_934.doEnd();
                RuntimeTagElement _jettag_c_setVariable_25_1180 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_1180); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_25_1180.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_setVariable_25_1180.setTagInfo(_td_c_setVariable_25_1180);
                _jettag_c_setVariable_25_1180.doStart(context, out);
                _jettag_c_setVariable_25_1180.doEnd();
                RuntimeTagElement _jettag_c_if_25_1229 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1229); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_1229.setRuntimeParent(_jettag_c_iterate_25_127);
                _jettag_c_if_25_1229.setTagInfo(_td_c_if_25_1229);
                _jettag_c_if_25_1229.doStart(context, out);
                while (_jettag_c_if_25_1229.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_25_1229.handleBodyContent(out);
                }
                _jettag_c_if_25_1229.doEnd();
                _jettag_c_iterate_25_127.handleBodyContent(out);
            }
            _jettag_c_iterate_25_127.doEnd();
            out.write(") throws ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_25_1280 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_1280); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_25_1280.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_java_import_25_1280.setTagInfo(_td_java_import_25_1280);
            _jettag_java_import_25_1280.doStart(context, out);
            JET2Writer _jettag_java_import_25_1280_saved_out = out;
            while (_jettag_java_import_25_1280.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                _jettag_java_import_25_1280.handleBodyContent(out);
            }
            out = _jettag_java_import_25_1280_saved_out;
            _jettag_java_import_25_1280.doEnd();
            out.write("{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\treturn find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_26_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_14.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_26_14.setTagInfo(_td_c_get_26_14);
            _jettag_c_get_26_14.doStart(context, out);
            _jettag_c_get_26_14.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_26_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_77); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_26_77.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_iterate_26_77.setTagInfo(_td_c_iterate_26_77);
            _jettag_c_iterate_26_77.doStart(context, out);
            while (_jettag_c_iterate_26_77.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_26_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_144); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_144.setRuntimeParent(_jettag_c_iterate_26_77);
                _jettag_c_get_26_144.setTagInfo(_td_c_get_26_144);
                _jettag_c_get_26_144.doStart(context, out);
                _jettag_c_get_26_144.doEnd();
                out.write("Field,");  //$NON-NLS-1$        
                _jettag_c_iterate_26_77.handleBodyContent(out);
            }
            _jettag_c_iterate_26_77.doEnd();
            out.write(" -1, -1);");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    @Transactional");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_9.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_30_9.setTagInfo(_td_c_get_30_9);
            _jettag_c_get_30_9.doStart(context, out);
            _jettag_c_get_30_9.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_64.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_30_64.setTagInfo(_td_c_get_30_64);
            _jettag_c_get_30_64.doStart(context, out);
            _jettag_c_get_30_64.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_30_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_30_127.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_iterate_30_127.setTagInfo(_td_c_iterate_30_127);
            _jettag_c_iterate_30_127.doStart(context, out);
            while (_jettag_c_iterate_30_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_30_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_194.setRuntimeParent(_jettag_c_iterate_30_127);
                _jettag_c_if_30_194.setTagInfo(_td_c_if_30_194);
                _jettag_c_if_30_194.doStart(context, out);
                while (_jettag_c_if_30_194.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_437 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_437); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_437.setRuntimeParent(_jettag_c_if_30_194);
                    _jettag_c_get_30_437.setTagInfo(_td_c_get_30_437);
                    _jettag_c_get_30_437.doStart(context, out);
                    _jettag_c_get_30_437.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_30_194.handleBodyContent(out);
                }
                _jettag_c_if_30_194.doEnd();
                RuntimeTagElement _jettag_c_if_30_484 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_484); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_484.setRuntimeParent(_jettag_c_iterate_30_127);
                _jettag_c_if_30_484.setTagInfo(_td_c_if_30_484);
                _jettag_c_if_30_484.doStart(context, out);
                while (_jettag_c_if_30_484.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_647 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_647); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_647.setRuntimeParent(_jettag_c_if_30_484);
                    _jettag_c_get_30_647.setTagInfo(_td_c_get_30_647);
                    _jettag_c_get_30_647.doStart(context, out);
                    _jettag_c_get_30_647.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_30_484.handleBodyContent(out);
                }
                _jettag_c_if_30_484.doEnd();
                RuntimeTagElement _jettag_c_if_30_694 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_694); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_694.setRuntimeParent(_jettag_c_iterate_30_127);
                _jettag_c_if_30_694.setTagInfo(_td_c_if_30_694);
                _jettag_c_if_30_694.doStart(context, out);
                while (_jettag_c_if_30_694.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_30_845 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_30_845); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_30_845.setRuntimeParent(_jettag_c_if_30_694);
                    _jettag_java_import_30_845.setTagInfo(_td_java_import_30_845);
                    _jettag_java_import_30_845.doStart(context, out);
                    JET2Writer _jettag_java_import_30_845_saved_out = out;
                    while (_jettag_java_import_30_845.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_30_845.handleBodyContent(out);
                    }
                    out = _jettag_java_import_30_845_saved_out;
                    _jettag_java_import_30_845.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_887 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_887); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_887.setRuntimeParent(_jettag_c_if_30_694);
                    _jettag_c_get_30_887.setTagInfo(_td_c_get_30_887);
                    _jettag_c_get_30_887.doStart(context, out);
                    _jettag_c_get_30_887.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_30_694.handleBodyContent(out);
                }
                _jettag_c_if_30_694.doEnd();
                RuntimeTagElement _jettag_c_if_30_934 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_934); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_934.setRuntimeParent(_jettag_c_iterate_30_127);
                _jettag_c_if_30_934.setTagInfo(_td_c_if_30_934);
                _jettag_c_if_30_934.doStart(context, out);
                while (_jettag_c_if_30_934.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_30_1085 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_30_1085); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_30_1085.setRuntimeParent(_jettag_c_if_30_934);
                    _jettag_java_import_30_1085.setTagInfo(_td_java_import_30_1085);
                    _jettag_java_import_30_1085.doStart(context, out);
                    JET2Writer _jettag_java_import_30_1085_saved_out = out;
                    while (_jettag_java_import_30_1085.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_30_1085.handleBodyContent(out);
                    }
                    out = _jettag_java_import_30_1085_saved_out;
                    _jettag_java_import_30_1085.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_1133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_1133); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_1133.setRuntimeParent(_jettag_c_if_30_934);
                    _jettag_c_get_30_1133.setTagInfo(_td_c_get_30_1133);
                    _jettag_c_get_30_1133.doStart(context, out);
                    _jettag_c_get_30_1133.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_30_934.handleBodyContent(out);
                }
                _jettag_c_if_30_934.doEnd();
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_iterate_30_127.handleBodyContent(out);
            }
            _jettag_c_iterate_30_127.doEnd();
            out.write(" int startResult, int maxRows) throws DataAccessException{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\ttry {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_32_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_32_40.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_32_40.setTagInfo(_td_c_get_32_40);
            _jettag_c_get_32_40.doStart(context, out);
            _jettag_c_get_32_40.doEnd();
            out.write("ByPrimaryKey\", startResult, maxRows, ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_32_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_32_127.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_iterate_32_127.setTagInfo(_td_c_iterate_32_127);
            _jettag_c_iterate_32_127.doStart(context, out);
            while (_jettag_c_iterate_32_127.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_32_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_194.setRuntimeParent(_jettag_c_iterate_32_127);
                _jettag_c_get_32_194.setTagInfo(_td_c_get_32_194);
                _jettag_c_get_32_194.doStart(context, out);
                _jettag_c_get_32_194.doEnd();
                out.write("Field");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_32_234 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_32_234); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_32_234.setRuntimeParent(_jettag_c_iterate_32_127);
                _jettag_c_setVariable_32_234.setTagInfo(_td_c_setVariable_32_234);
                _jettag_c_setVariable_32_234.doStart(context, out);
                _jettag_c_setVariable_32_234.doEnd();
                RuntimeTagElement _jettag_c_if_32_279 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_32_279); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_32_279.setRuntimeParent(_jettag_c_iterate_32_127);
                _jettag_c_if_32_279.setTagInfo(_td_c_if_32_279);
                _jettag_c_if_32_279.doStart(context, out);
                while (_jettag_c_if_32_279.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_32_279.handleBodyContent(out);
                }
                _jettag_c_if_32_279.doEnd();
                _jettag_c_iterate_32_127.handleBodyContent(out);
            }
            _jettag_c_iterate_32_127.doEnd();
            out.write(");");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_33_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_12.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_33_12.setTagInfo(_td_c_get_33_12);
            _jettag_c_get_33_12.doStart(context, out);
            _jettag_c_get_33_12.doEnd();
            out.write(".domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_33_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_50.setRuntimeParent(_jettag_c_if_23_2);
            _jettag_c_get_33_50.setTagInfo(_td_c_get_33_50);
            _jettag_c_get_33_50.doStart(context, out);
            _jettag_c_get_33_50.doEnd();
            out.write(") query.getSingleResult();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t} catch (NoResultException nre) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn null;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_23_2.handleBodyContent(out);
        }
        _jettag_c_if_23_2.doEnd();
    }
}
