package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_get implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_get() {
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
    private static final TagInfo _td_c_iterate_6_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_2 = new TagInfo("c:if", //$NON-NLS-1$
            8, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_28 = new TagInfo("c:get", //$NON-NLS-1$
            10, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_147 = new TagInfo("c:get", //$NON-NLS-1$
            10, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_182 = new TagInfo("c:get", //$NON-NLS-1$
            10, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_231 = new TagInfo("c:get", //$NON-NLS-1$
            10, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_9 = new TagInfo("c:get", //$NON-NLS-1$
            12, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_71 = new TagInfo("c:get", //$NON-NLS-1$
            12, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_121 = new TagInfo("c:get", //$NON-NLS-1$
            12, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_180 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 180,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_247 = new TagInfo("c:if", //$NON-NLS-1$
            12, 247,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_504 = new TagInfo("c:get", //$NON-NLS-1$
            12, 504,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_539 = new TagInfo("c:get", //$NON-NLS-1$
            12, 539,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_581 = new TagInfo("c:if", //$NON-NLS-1$
            12, 581,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_758 = new TagInfo("c:get", //$NON-NLS-1$
            12, 758,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_793 = new TagInfo("c:get", //$NON-NLS-1$
            12, 793,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_835 = new TagInfo("c:if", //$NON-NLS-1$
            12, 835,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_986 = new TagInfo("java:import", //$NON-NLS-1$
            12, 986,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_12_1042 = new TagInfo("c:get", //$NON-NLS-1$
            12, 1042,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_1077 = new TagInfo("c:get", //$NON-NLS-1$
            12, 1077,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1119 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1119,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_1270 = new TagInfo("java:import", //$NON-NLS-1$
            12, 1270,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_12_1332 = new TagInfo("c:get", //$NON-NLS-1$
            12, 1332,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_1367 = new TagInfo("c:get", //$NON-NLS-1$
            12, 1367,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_12_1409 = new TagInfo("c:setVariable", //$NON-NLS-1$
            12, 1409,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1458 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1458,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_14_217 = new TagInfo("c:get", //$NON-NLS-1$
            14, 217,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_252 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 252,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_301 = new TagInfo("c:if", //$NON-NLS-1$
            14, 301,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_348 = new TagInfo("c:get", //$NON-NLS-1$
            14, 348,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_2 = new TagInfo("c:if", //$NON-NLS-1$
            22, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_31_2 = new TagInfo("c:choose", //$NON-NLS-1$
            31, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_32_2 = new TagInfo("c:when", //$NON-NLS-1$
            32, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0 and $j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_34_2 = new TagInfo("c:choose", //$NON-NLS-1$
            34, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_35_2 = new TagInfo("c:when", //$NON-NLS-1$
            35, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_37_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            37, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_38_28 = new TagInfo("c:get", //$NON-NLS-1$
            38, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_147 = new TagInfo("c:get", //$NON-NLS-1$
            38, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_182 = new TagInfo("c:get", //$NON-NLS-1$
            38, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_231 = new TagInfo("c:get", //$NON-NLS-1$
            38, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_14 = new TagInfo("c:get", //$NON-NLS-1$
            41, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_76 = new TagInfo("c:get", //$NON-NLS-1$
            41, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_126 = new TagInfo("c:get", //$NON-NLS-1$
            41, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_185 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 185,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_252 = new TagInfo("c:if", //$NON-NLS-1$
            41, 252,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_509 = new TagInfo("c:get", //$NON-NLS-1$
            41, 509,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_544 = new TagInfo("c:get", //$NON-NLS-1$
            41, 544,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_586 = new TagInfo("c:if", //$NON-NLS-1$
            41, 586,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_763 = new TagInfo("c:get", //$NON-NLS-1$
            41, 763,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_798 = new TagInfo("c:get", //$NON-NLS-1$
            41, 798,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_840 = new TagInfo("c:if", //$NON-NLS-1$
            41, 840,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_41_991 = new TagInfo("java:import", //$NON-NLS-1$
            41, 991,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_41_1047 = new TagInfo("c:get", //$NON-NLS-1$
            41, 1047,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_1082 = new TagInfo("c:get", //$NON-NLS-1$
            41, 1082,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_1124 = new TagInfo("c:if", //$NON-NLS-1$
            41, 1124,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_41_1275 = new TagInfo("java:import", //$NON-NLS-1$
            41, 1275,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_41_1337 = new TagInfo("c:get", //$NON-NLS-1$
            41, 1337,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_1372 = new TagInfo("c:get", //$NON-NLS-1$
            41, 1372,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_1414 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 1414,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_1463 = new TagInfo("c:if", //$NON-NLS-1$
            41, 1463,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_34 = new TagInfo("c:get", //$NON-NLS-1$
            43, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_93 = new TagInfo("c:get", //$NON-NLS-1$
            43, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_135 = new TagInfo("c:get", //$NON-NLS-1$
            43, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_265 = new TagInfo("c:get", //$NON-NLS-1$
            43, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_300 = new TagInfo("c:get", //$NON-NLS-1$
            43, 300,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_335 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 335,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_384 = new TagInfo("c:if", //$NON-NLS-1$
            43, 384,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_431 = new TagInfo("c:get", //$NON-NLS-1$
            43, 431,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_49_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            49, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_50_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_28 = new TagInfo("c:get", //$NON-NLS-1$
            51, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_78 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 78,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_147 = new TagInfo("c:get", //$NON-NLS-1$
            51, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_182 = new TagInfo("c:get", //$NON-NLS-1$
            51, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_231 = new TagInfo("c:get", //$NON-NLS-1$
            51, 231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_14 = new TagInfo("c:get", //$NON-NLS-1$
            53, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_74 = new TagInfo("c:get", //$NON-NLS-1$
            53, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_124 = new TagInfo("c:get", //$NON-NLS-1$
            53, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_181 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 181,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_248 = new TagInfo("c:if", //$NON-NLS-1$
            53, 248,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_505 = new TagInfo("c:get", //$NON-NLS-1$
            53, 505,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_540 = new TagInfo("c:get", //$NON-NLS-1$
            53, 540,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_582 = new TagInfo("c:if", //$NON-NLS-1$
            53, 582,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_759 = new TagInfo("c:get", //$NON-NLS-1$
            53, 759,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_794 = new TagInfo("c:get", //$NON-NLS-1$
            53, 794,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_836 = new TagInfo("c:if", //$NON-NLS-1$
            53, 836,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_53_987 = new TagInfo("java:import", //$NON-NLS-1$
            53, 987,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_53_1043 = new TagInfo("c:get", //$NON-NLS-1$
            53, 1043,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_1078 = new TagInfo("c:get", //$NON-NLS-1$
            53, 1078,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_1120 = new TagInfo("c:if", //$NON-NLS-1$
            53, 1120,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_53_1271 = new TagInfo("java:import", //$NON-NLS-1$
            53, 1271,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_53_1333 = new TagInfo("c:get", //$NON-NLS-1$
            53, 1333,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_1368 = new TagInfo("c:get", //$NON-NLS-1$
            53, 1368,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_1410 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 1410,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_1459 = new TagInfo("c:if", //$NON-NLS-1$
            53, 1459,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_34 = new TagInfo("c:get", //$NON-NLS-1$
            55, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_91 = new TagInfo("c:get", //$NON-NLS-1$
            55, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_133 = new TagInfo("c:get", //$NON-NLS-1$
            55, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_196 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 196,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_263 = new TagInfo("c:get", //$NON-NLS-1$
            55, 263,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_298 = new TagInfo("c:get", //$NON-NLS-1$
            55, 298,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_55_333 = new TagInfo("c:setVariable", //$NON-NLS-1$
            55, 333,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_382 = new TagInfo("c:if", //$NON-NLS-1$
            55, 382,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_429 = new TagInfo("c:get", //$NON-NLS-1$
            55, 429,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_iterate_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_6_2.setRuntimeParent(null);
        _jettag_c_iterate_6_2.setTagInfo(_td_c_iterate_6_2);
        _jettag_c_iterate_6_2.doStart(context, out);
        while (_jettag_c_iterate_6_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_7_2.setRuntimeParent(_jettag_c_iterate_6_2);
            _jettag_c_iterate_7_2.setTagInfo(_td_c_iterate_7_2);
            _jettag_c_iterate_7_2.doStart(context, out);
            while (_jettag_c_iterate_7_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_2.setRuntimeParent(_jettag_c_iterate_7_2);
                _jettag_c_if_8_2.setTagInfo(_td_c_if_8_2);
                _jettag_c_if_8_2.doStart(context, out);
                while (_jettag_c_if_8_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_9_2.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_setVariable_9_2.setTagInfo(_td_c_setVariable_9_2);
                    _jettag_c_setVariable_9_2.doStart(context, out);
                    _jettag_c_setVariable_9_2.doEnd();
                    out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_28.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_10_28.setTagInfo(_td_c_get_10_28);
                    _jettag_c_get_10_28.doStart(context, out);
                    _jettag_c_get_10_28.doEnd();
                    RuntimeTagElement _jettag_c_iterate_10_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_10_78.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_iterate_10_78.setTagInfo(_td_c_iterate_10_78);
                    _jettag_c_iterate_10_78.doStart(context, out);
                    while (_jettag_c_iterate_10_78.okToProcessBody()) {
                        out.write("/{");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_10_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_147); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_10_147.setRuntimeParent(_jettag_c_iterate_10_78);
                        _jettag_c_get_10_147.setTagInfo(_td_c_get_10_147);
                        _jettag_c_get_10_147.doStart(context, out);
                        _jettag_c_get_10_147.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_10_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_182); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_10_182.setRuntimeParent(_jettag_c_iterate_10_78);
                        _jettag_c_get_10_182.setTagInfo(_td_c_get_10_182);
                        _jettag_c_get_10_182.doStart(context, out);
                        _jettag_c_get_10_182.doEnd();
                        out.write("}");  //$NON-NLS-1$        
                        _jettag_c_iterate_10_78.handleBodyContent(out);
                    }
                    _jettag_c_iterate_10_78.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_231); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_231.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_10_231.setTagInfo(_td_c_get_10_231);
                    _jettag_c_get_10_231.doStart(context, out);
                    _jettag_c_get_10_231.doEnd();
                    out.write("\", method = RequestMethod.GET)");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@ResponseBody");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_12_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_9.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_12_9.setTagInfo(_td_c_get_12_9);
                    _jettag_c_get_12_9.doStart(context, out);
                    _jettag_c_get_12_9.doEnd();
                    out.write(" get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_12_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_71); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_71.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_12_71.setTagInfo(_td_c_get_12_71);
                    _jettag_c_get_12_71.doStart(context, out);
                    _jettag_c_get_12_71.doEnd();
                    RuntimeTagElement _jettag_c_get_12_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_121); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_12_121.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_12_121.setTagInfo(_td_c_get_12_121);
                    _jettag_c_get_12_121.doStart(context, out);
                    _jettag_c_get_12_121.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_12_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_12_180.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_iterate_12_180.setTagInfo(_td_c_iterate_12_180);
                    _jettag_c_iterate_12_180.doStart(context, out);
                    while (_jettag_c_iterate_12_180.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_12_247 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_247); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_12_247.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_if_12_247.setTagInfo(_td_c_if_12_247);
                        _jettag_c_if_12_247.doStart(context, out);
                        while (_jettag_c_if_12_247.okToProcessBody()) {
                            out.write("@PathVariable String ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_504 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_504); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_504.setRuntimeParent(_jettag_c_if_12_247);
                            _jettag_c_get_12_504.setTagInfo(_td_c_get_12_504);
                            _jettag_c_get_12_504.doStart(context, out);
                            _jettag_c_get_12_504.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_539 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_539); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_539.setRuntimeParent(_jettag_c_if_12_247);
                            _jettag_c_get_12_539.setTagInfo(_td_c_get_12_539);
                            _jettag_c_get_12_539.doStart(context, out);
                            _jettag_c_get_12_539.doEnd();
                            _jettag_c_if_12_247.handleBodyContent(out);
                        }
                        _jettag_c_if_12_247.doEnd();
                        RuntimeTagElement _jettag_c_if_12_581 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_581); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_12_581.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_if_12_581.setTagInfo(_td_c_if_12_581);
                        _jettag_c_if_12_581.doStart(context, out);
                        while (_jettag_c_if_12_581.okToProcessBody()) {
                            out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_758 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_758); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_758.setRuntimeParent(_jettag_c_if_12_581);
                            _jettag_c_get_12_758.setTagInfo(_td_c_get_12_758);
                            _jettag_c_get_12_758.doStart(context, out);
                            _jettag_c_get_12_758.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_793 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_793); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_793.setRuntimeParent(_jettag_c_if_12_581);
                            _jettag_c_get_12_793.setTagInfo(_td_c_get_12_793);
                            _jettag_c_get_12_793.doStart(context, out);
                            _jettag_c_get_12_793.doEnd();
                            _jettag_c_if_12_581.handleBodyContent(out);
                        }
                        _jettag_c_if_12_581.doEnd();
                        RuntimeTagElement _jettag_c_if_12_835 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_835); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_12_835.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_if_12_835.setTagInfo(_td_c_if_12_835);
                        _jettag_c_if_12_835.doStart(context, out);
                        while (_jettag_c_if_12_835.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_12_986 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_986); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_12_986.setRuntimeParent(_jettag_c_if_12_835);
                            _jettag_java_import_12_986.setTagInfo(_td_java_import_12_986);
                            _jettag_java_import_12_986.doStart(context, out);
                            JET2Writer _jettag_java_import_12_986_saved_out = out;
                            while (_jettag_java_import_12_986.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                _jettag_java_import_12_986.handleBodyContent(out);
                            }
                            out = _jettag_java_import_12_986_saved_out;
                            _jettag_java_import_12_986.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_1042 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_1042); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_1042.setRuntimeParent(_jettag_c_if_12_835);
                            _jettag_c_get_12_1042.setTagInfo(_td_c_get_12_1042);
                            _jettag_c_get_12_1042.doStart(context, out);
                            _jettag_c_get_12_1042.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_1077 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_1077); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_1077.setRuntimeParent(_jettag_c_if_12_835);
                            _jettag_c_get_12_1077.setTagInfo(_td_c_get_12_1077);
                            _jettag_c_get_12_1077.doStart(context, out);
                            _jettag_c_get_12_1077.doEnd();
                            _jettag_c_if_12_835.handleBodyContent(out);
                        }
                        _jettag_c_if_12_835.doEnd();
                        RuntimeTagElement _jettag_c_if_12_1119 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1119); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_12_1119.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_if_12_1119.setTagInfo(_td_c_if_12_1119);
                        _jettag_c_if_12_1119.doStart(context, out);
                        while (_jettag_c_if_12_1119.okToProcessBody()) {
                            RuntimeTagElement _jettag_java_import_12_1270 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_1270); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_java_import_12_1270.setRuntimeParent(_jettag_c_if_12_1119);
                            _jettag_java_import_12_1270.setTagInfo(_td_java_import_12_1270);
                            _jettag_java_import_12_1270.doStart(context, out);
                            JET2Writer _jettag_java_import_12_1270_saved_out = out;
                            while (_jettag_java_import_12_1270.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                _jettag_java_import_12_1270.handleBodyContent(out);
                            }
                            out = _jettag_java_import_12_1270_saved_out;
                            _jettag_java_import_12_1270.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_1332 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_1332); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_1332.setRuntimeParent(_jettag_c_if_12_1119);
                            _jettag_c_get_12_1332.setTagInfo(_td_c_get_12_1332);
                            _jettag_c_get_12_1332.doStart(context, out);
                            _jettag_c_get_12_1332.doEnd();
                            out.write("_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_12_1367 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_1367); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_12_1367.setRuntimeParent(_jettag_c_if_12_1119);
                            _jettag_c_get_12_1367.setTagInfo(_td_c_get_12_1367);
                            _jettag_c_get_12_1367.doStart(context, out);
                            _jettag_c_get_12_1367.doEnd();
                            _jettag_c_if_12_1119.handleBodyContent(out);
                        }
                        _jettag_c_if_12_1119.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_12_1409 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_12_1409); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_12_1409.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_setVariable_12_1409.setTagInfo(_td_c_setVariable_12_1409);
                        _jettag_c_setVariable_12_1409.doStart(context, out);
                        _jettag_c_setVariable_12_1409.doEnd();
                        RuntimeTagElement _jettag_c_if_12_1458 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1458); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_12_1458.setRuntimeParent(_jettag_c_iterate_12_180);
                        _jettag_c_if_12_1458.setTagInfo(_td_c_if_12_1458);
                        _jettag_c_if_12_1458.doStart(context, out);
                        while (_jettag_c_if_12_1458.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_12_1458.handleBodyContent(out);
                        }
                        _jettag_c_if_12_1458.doEnd();
                        _jettag_c_iterate_12_180.handleBodyContent(out);
                    }
                    _jettag_c_iterate_12_180.doEnd();
                    out.write("){");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_setVariable_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_13_3.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_setVariable_13_3.setTagInfo(_td_c_setVariable_13_3);
                    _jettag_c_setVariable_13_3.doStart(context, out);
                    _jettag_c_setVariable_13_3.doEnd();
                    out.write("\t\treturn ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_10.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_14_10.setTagInfo(_td_c_get_14_10);
                    _jettag_c_get_14_10.doStart(context, out);
                    _jettag_c_get_14_10.doEnd();
                    out.write("DAO.find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_52); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_52.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_14_52.setTagInfo(_td_c_get_14_52);
                    _jettag_c_get_14_52.doStart(context, out);
                    _jettag_c_get_14_52.doEnd();
                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_iterate_14_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_14_115.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_iterate_14_115.setTagInfo(_td_c_iterate_14_115);
                    _jettag_c_iterate_14_115.doStart(context, out);
                    while (_jettag_c_iterate_14_115.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_get_14_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_182); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_182.setRuntimeParent(_jettag_c_iterate_14_115);
                        _jettag_c_get_14_182.setTagInfo(_td_c_get_14_182);
                        _jettag_c_get_14_182.doStart(context, out);
                        _jettag_c_get_14_182.doEnd();
                        out.write("_");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_14_217 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_217); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_217.setRuntimeParent(_jettag_c_iterate_14_115);
                        _jettag_c_get_14_217.setTagInfo(_td_c_get_14_217);
                        _jettag_c_get_14_217.doStart(context, out);
                        _jettag_c_get_14_217.doEnd();
                        RuntimeTagElement _jettag_c_setVariable_14_252 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_252); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_14_252.setRuntimeParent(_jettag_c_iterate_14_115);
                        _jettag_c_setVariable_14_252.setTagInfo(_td_c_setVariable_14_252);
                        _jettag_c_setVariable_14_252.doStart(context, out);
                        _jettag_c_setVariable_14_252.doEnd();
                        RuntimeTagElement _jettag_c_if_14_301 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_301); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_14_301.setRuntimeParent(_jettag_c_iterate_14_115);
                        _jettag_c_if_14_301.setTagInfo(_td_c_if_14_301);
                        _jettag_c_if_14_301.doStart(context, out);
                        while (_jettag_c_if_14_301.okToProcessBody()) {
                            out.write(",");  //$NON-NLS-1$        
                            _jettag_c_if_14_301.handleBodyContent(out);
                        }
                        _jettag_c_if_14_301.doEnd();
                        _jettag_c_iterate_14_115.handleBodyContent(out);
                    }
                    _jettag_c_iterate_14_115.doEnd();
                    out.write(").get");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_348 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_348); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_348.setRuntimeParent(_jettag_c_if_8_2);
                    _jettag_c_get_14_348.setTagInfo(_td_c_get_14_348);
                    _jettag_c_get_14_348.doStart(context, out);
                    _jettag_c_get_14_348.doEnd();
                    out.write("();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_8_2.handleBodyContent(out);
                }
                _jettag_c_if_8_2.doEnd();
                _jettag_c_iterate_7_2.handleBodyContent(out);
            }
            _jettag_c_iterate_7_2.doEnd();
            _jettag_c_iterate_6_2.handleBodyContent(out);
        }
        _jettag_c_iterate_6_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_20_2.setRuntimeParent(null);
        _jettag_c_iterate_20_2.setTagInfo(_td_c_iterate_20_2);
        _jettag_c_iterate_20_2.doStart(context, out);
        while (_jettag_c_iterate_20_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_21_2.setRuntimeParent(_jettag_c_iterate_20_2);
            _jettag_c_iterate_21_2.setTagInfo(_td_c_iterate_21_2);
            _jettag_c_iterate_21_2.doStart(context, out);
            while (_jettag_c_iterate_21_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_2.setRuntimeParent(_jettag_c_iterate_21_2);
                _jettag_c_if_22_2.setTagInfo(_td_c_if_22_2);
                _jettag_c_if_22_2.doStart(context, out);
                while (_jettag_c_if_22_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_23_2.setRuntimeParent(_jettag_c_if_22_2);
                    _jettag_c_setVariable_23_2.setTagInfo(_td_c_setVariable_23_2);
                    _jettag_c_setVariable_23_2.doStart(context, out);
                    _jettag_c_setVariable_23_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_c_if_22_2);
                    _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
                    _jettag_c_setVariable_24_2.doStart(context, out);
                    _jettag_c_setVariable_24_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_25_2.setRuntimeParent(_jettag_c_if_22_2);
                    _jettag_c_iterate_25_2.setTagInfo(_td_c_iterate_25_2);
                    _jettag_c_iterate_25_2.doStart(context, out);
                    while (_jettag_c_iterate_25_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_26_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_26_2.setRuntimeParent(_jettag_c_iterate_25_2);
                        _jettag_c_setVariable_26_2.setTagInfo(_td_c_setVariable_26_2);
                        _jettag_c_setVariable_26_2.doStart(context, out);
                        _jettag_c_setVariable_26_2.doEnd();
                        _jettag_c_iterate_25_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_25_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_28_2.setRuntimeParent(_jettag_c_if_22_2);
                    _jettag_c_iterate_28_2.setTagInfo(_td_c_iterate_28_2);
                    _jettag_c_iterate_28_2.doStart(context, out);
                    while (_jettag_c_iterate_28_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_29_2.setRuntimeParent(_jettag_c_iterate_28_2);
                        _jettag_c_setVariable_29_2.setTagInfo(_td_c_setVariable_29_2);
                        _jettag_c_setVariable_29_2.doStart(context, out);
                        _jettag_c_setVariable_29_2.doEnd();
                        _jettag_c_iterate_28_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_28_2.doEnd();
                    RuntimeTagElement _jettag_c_choose_31_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_31_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_31_2.setRuntimeParent(_jettag_c_if_22_2);
                    _jettag_c_choose_31_2.setTagInfo(_td_c_choose_31_2);
                    _jettag_c_choose_31_2.doStart(context, out);
                    JET2Writer _jettag_c_choose_31_2_saved_out = out;
                    while (_jettag_c_choose_31_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_32_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_32_2.setRuntimeParent(_jettag_c_choose_31_2);
                        _jettag_c_when_32_2.setTagInfo(_td_c_when_32_2);
                        _jettag_c_when_32_2.doStart(context, out);
                        JET2Writer _jettag_c_when_32_2_saved_out = out;
                        while (_jettag_c_when_32_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_33_2.setRuntimeParent(_jettag_c_when_32_2);
                            _jettag_c_iterate_33_2.setTagInfo(_td_c_iterate_33_2);
                            _jettag_c_iterate_33_2.doStart(context, out);
                            while (_jettag_c_iterate_33_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_34_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_34_2.setRuntimeParent(_jettag_c_iterate_33_2);
                                _jettag_c_choose_34_2.setTagInfo(_td_c_choose_34_2);
                                _jettag_c_choose_34_2.doStart(context, out);
                                JET2Writer _jettag_c_choose_34_2_saved_out = out;
                                while (_jettag_c_choose_34_2.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_35_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_35_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_35_2.setRuntimeParent(_jettag_c_choose_34_2);
                                    _jettag_c_when_35_2.setTagInfo(_td_c_when_35_2);
                                    _jettag_c_when_35_2.doStart(context, out);
                                    JET2Writer _jettag_c_when_35_2_saved_out = out;
                                    while (_jettag_c_when_35_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_35_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_35_2_saved_out;
                                    _jettag_c_when_35_2.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_37_2.setRuntimeParent(_jettag_c_choose_34_2);
                                    _jettag_c_otherwise_37_2.setTagInfo(_td_c_otherwise_37_2);
                                    _jettag_c_otherwise_37_2.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_37_2_saved_out = out;
                                    while (_jettag_c_otherwise_37_2.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_38_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_28); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_38_28.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_38_28.setTagInfo(_td_c_get_38_28);
                                        _jettag_c_get_38_28.doStart(context, out);
                                        _jettag_c_get_38_28.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_38_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_78); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_38_78.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_iterate_38_78.setTagInfo(_td_c_iterate_38_78);
                                        _jettag_c_iterate_38_78.doStart(context, out);
                                        while (_jettag_c_iterate_38_78.okToProcessBody()) {
                                            out.write("/{");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_38_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_147); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_38_147.setRuntimeParent(_jettag_c_iterate_38_78);
                                            _jettag_c_get_38_147.setTagInfo(_td_c_get_38_147);
                                            _jettag_c_get_38_147.doStart(context, out);
                                            _jettag_c_get_38_147.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_38_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_182); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_38_182.setRuntimeParent(_jettag_c_iterate_38_78);
                                            _jettag_c_get_38_182.setTagInfo(_td_c_get_38_182);
                                            _jettag_c_get_38_182.doStart(context, out);
                                            _jettag_c_get_38_182.doEnd();
                                            out.write("}");  //$NON-NLS-1$        
                                            _jettag_c_iterate_38_78.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_38_78.doEnd();
                                        out.write("/");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_38_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_231); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_38_231.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_38_231.setTagInfo(_td_c_get_38_231);
                                        _jettag_c_get_38_231.doStart(context, out);
                                        _jettag_c_get_38_231.doEnd();
                                        out.write("s\", method = RequestMethod.GET)");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t@ResponseBody");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        RuntimeTagElement _jettag_c_setVariable_40_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_40_2.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_setVariable_40_2.setTagInfo(_td_c_setVariable_40_2);
                                        _jettag_c_setVariable_40_2.doStart(context, out);
                                        _jettag_c_setVariable_40_2.doEnd();
                                        out.write("\tpublic List<");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_41_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_14); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_41_14.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_41_14.setTagInfo(_td_c_get_41_14);
                                        _jettag_c_get_41_14.doStart(context, out);
                                        _jettag_c_get_41_14.doEnd();
                                        out.write("> get");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_41_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_76); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_41_76.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_41_76.setTagInfo(_td_c_get_41_76);
                                        _jettag_c_get_41_76.doStart(context, out);
                                        _jettag_c_get_41_76.doEnd();
                                        RuntimeTagElement _jettag_c_get_41_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_126); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_41_126.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_41_126.setTagInfo(_td_c_get_41_126);
                                        _jettag_c_get_41_126.doStart(context, out);
                                        _jettag_c_get_41_126.doEnd();
                                        out.write("s(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_41_185 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_185); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_41_185.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_iterate_41_185.setTagInfo(_td_c_iterate_41_185);
                                        _jettag_c_iterate_41_185.doStart(context, out);
                                        while (_jettag_c_iterate_41_185.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_if_41_252 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_252); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_41_252.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_if_41_252.setTagInfo(_td_c_if_41_252);
                                            _jettag_c_if_41_252.doStart(context, out);
                                            while (_jettag_c_if_41_252.okToProcessBody()) {
                                                out.write("@PathVariable String ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_509 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_509); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_509.setRuntimeParent(_jettag_c_if_41_252);
                                                _jettag_c_get_41_509.setTagInfo(_td_c_get_41_509);
                                                _jettag_c_get_41_509.doStart(context, out);
                                                _jettag_c_get_41_509.doEnd();
                                                out.write("_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_544 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_544); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_544.setRuntimeParent(_jettag_c_if_41_252);
                                                _jettag_c_get_41_544.setTagInfo(_td_c_get_41_544);
                                                _jettag_c_get_41_544.doStart(context, out);
                                                _jettag_c_get_41_544.doEnd();
                                                _jettag_c_if_41_252.handleBodyContent(out);
                                            }
                                            _jettag_c_if_41_252.doEnd();
                                            RuntimeTagElement _jettag_c_if_41_586 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_586); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_41_586.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_if_41_586.setTagInfo(_td_c_if_41_586);
                                            _jettag_c_if_41_586.doStart(context, out);
                                            while (_jettag_c_if_41_586.okToProcessBody()) {
                                                out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_763 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_763); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_763.setRuntimeParent(_jettag_c_if_41_586);
                                                _jettag_c_get_41_763.setTagInfo(_td_c_get_41_763);
                                                _jettag_c_get_41_763.doStart(context, out);
                                                _jettag_c_get_41_763.doEnd();
                                                out.write("_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_798 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_798); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_798.setRuntimeParent(_jettag_c_if_41_586);
                                                _jettag_c_get_41_798.setTagInfo(_td_c_get_41_798);
                                                _jettag_c_get_41_798.doStart(context, out);
                                                _jettag_c_get_41_798.doEnd();
                                                _jettag_c_if_41_586.handleBodyContent(out);
                                            }
                                            _jettag_c_if_41_586.doEnd();
                                            RuntimeTagElement _jettag_c_if_41_840 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_840); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_41_840.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_if_41_840.setTagInfo(_td_c_if_41_840);
                                            _jettag_c_if_41_840.doStart(context, out);
                                            while (_jettag_c_if_41_840.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_41_991 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_41_991); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_41_991.setRuntimeParent(_jettag_c_if_41_840);
                                                _jettag_java_import_41_991.setTagInfo(_td_java_import_41_991);
                                                _jettag_java_import_41_991.doStart(context, out);
                                                JET2Writer _jettag_java_import_41_991_saved_out = out;
                                                while (_jettag_java_import_41_991.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                                    _jettag_java_import_41_991.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_41_991_saved_out;
                                                _jettag_java_import_41_991.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_1047 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_1047); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_1047.setRuntimeParent(_jettag_c_if_41_840);
                                                _jettag_c_get_41_1047.setTagInfo(_td_c_get_41_1047);
                                                _jettag_c_get_41_1047.doStart(context, out);
                                                _jettag_c_get_41_1047.doEnd();
                                                out.write("_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_1082 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_1082); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_1082.setRuntimeParent(_jettag_c_if_41_840);
                                                _jettag_c_get_41_1082.setTagInfo(_td_c_get_41_1082);
                                                _jettag_c_get_41_1082.doStart(context, out);
                                                _jettag_c_get_41_1082.doEnd();
                                                _jettag_c_if_41_840.handleBodyContent(out);
                                            }
                                            _jettag_c_if_41_840.doEnd();
                                            RuntimeTagElement _jettag_c_if_41_1124 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_1124); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_41_1124.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_if_41_1124.setTagInfo(_td_c_if_41_1124);
                                            _jettag_c_if_41_1124.doStart(context, out);
                                            while (_jettag_c_if_41_1124.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_41_1275 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_41_1275); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_41_1275.setRuntimeParent(_jettag_c_if_41_1124);
                                                _jettag_java_import_41_1275.setTagInfo(_td_java_import_41_1275);
                                                _jettag_java_import_41_1275.doStart(context, out);
                                                JET2Writer _jettag_java_import_41_1275_saved_out = out;
                                                while (_jettag_java_import_41_1275.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                                    _jettag_java_import_41_1275.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_41_1275_saved_out;
                                                _jettag_java_import_41_1275.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_1337 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_1337); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_1337.setRuntimeParent(_jettag_c_if_41_1124);
                                                _jettag_c_get_41_1337.setTagInfo(_td_c_get_41_1337);
                                                _jettag_c_get_41_1337.doStart(context, out);
                                                _jettag_c_get_41_1337.doEnd();
                                                out.write("_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_41_1372 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_1372); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_41_1372.setRuntimeParent(_jettag_c_if_41_1124);
                                                _jettag_c_get_41_1372.setTagInfo(_td_c_get_41_1372);
                                                _jettag_c_get_41_1372.doStart(context, out);
                                                _jettag_c_get_41_1372.doEnd();
                                                _jettag_c_if_41_1124.handleBodyContent(out);
                                            }
                                            _jettag_c_if_41_1124.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_41_1414 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_1414); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_41_1414.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_setVariable_41_1414.setTagInfo(_td_c_setVariable_41_1414);
                                            _jettag_c_setVariable_41_1414.doStart(context, out);
                                            _jettag_c_setVariable_41_1414.doEnd();
                                            RuntimeTagElement _jettag_c_if_41_1463 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_1463); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_41_1463.setRuntimeParent(_jettag_c_iterate_41_185);
                                            _jettag_c_if_41_1463.setTagInfo(_td_c_if_41_1463);
                                            _jettag_c_if_41_1463.doStart(context, out);
                                            while (_jettag_c_if_41_1463.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_41_1463.handleBodyContent(out);
                                            }
                                            _jettag_c_if_41_1463.doEnd();
                                            _jettag_c_iterate_41_185.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_41_185.doEnd();
                                        out.write("){");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        RuntimeTagElement _jettag_c_setVariable_42_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_42_3.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_setVariable_42_3.setTagInfo(_td_c_setVariable_42_3);
                                        _jettag_c_setVariable_42_3.doStart(context, out);
                                        _jettag_c_setVariable_42_3.doEnd();
                                        out.write("\t\treturn new java.util.ArrayList<");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_43_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_34); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_43_34.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_43_34.setTagInfo(_td_c_get_43_34);
                                        _jettag_c_get_43_34.doStart(context, out);
                                        _jettag_c_get_43_34.doEnd();
                                        out.write(">(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_43_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_93); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_43_93.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_43_93.setTagInfo(_td_c_get_43_93);
                                        _jettag_c_get_43_93.doStart(context, out);
                                        _jettag_c_get_43_93.doEnd();
                                        out.write("DAO.find");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_43_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_135); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_43_135.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_43_135.setTagInfo(_td_c_get_43_135);
                                        _jettag_c_get_43_135.doStart(context, out);
                                        _jettag_c_get_43_135.doEnd();
                                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_43_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_198); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_43_198.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_iterate_43_198.setTagInfo(_td_c_iterate_43_198);
                                        _jettag_c_iterate_43_198.doStart(context, out);
                                        while (_jettag_c_iterate_43_198.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_get_43_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_265); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_43_265.setRuntimeParent(_jettag_c_iterate_43_198);
                                            _jettag_c_get_43_265.setTagInfo(_td_c_get_43_265);
                                            _jettag_c_get_43_265.doStart(context, out);
                                            _jettag_c_get_43_265.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_43_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_300); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_43_300.setRuntimeParent(_jettag_c_iterate_43_198);
                                            _jettag_c_get_43_300.setTagInfo(_td_c_get_43_300);
                                            _jettag_c_get_43_300.doStart(context, out);
                                            _jettag_c_get_43_300.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_43_335 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_335); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_43_335.setRuntimeParent(_jettag_c_iterate_43_198);
                                            _jettag_c_setVariable_43_335.setTagInfo(_td_c_setVariable_43_335);
                                            _jettag_c_setVariable_43_335.doStart(context, out);
                                            _jettag_c_setVariable_43_335.doEnd();
                                            RuntimeTagElement _jettag_c_if_43_384 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_384); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_43_384.setRuntimeParent(_jettag_c_iterate_43_198);
                                            _jettag_c_if_43_384.setTagInfo(_td_c_if_43_384);
                                            _jettag_c_if_43_384.doStart(context, out);
                                            while (_jettag_c_if_43_384.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_43_384.handleBodyContent(out);
                                            }
                                            _jettag_c_if_43_384.doEnd();
                                            _jettag_c_iterate_43_198.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_43_198.doEnd();
                                        out.write(").get");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_43_431 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_431); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_43_431.setRuntimeParent(_jettag_c_otherwise_37_2);
                                        _jettag_c_get_43_431.setTagInfo(_td_c_get_43_431);
                                        _jettag_c_get_43_431.doStart(context, out);
                                        _jettag_c_get_43_431.doEnd();
                                        out.write("s());");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t}");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_37_2.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_37_2_saved_out;
                                    _jettag_c_otherwise_37_2.doEnd();
                                    _jettag_c_choose_34_2.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_34_2_saved_out;
                                _jettag_c_choose_34_2.doEnd();
                                _jettag_c_iterate_33_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_33_2.doEnd();
                            _jettag_c_when_32_2.handleBodyContent(out);
                        }
                        out = _jettag_c_when_32_2_saved_out;
                        _jettag_c_when_32_2.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_49_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_49_2.setRuntimeParent(_jettag_c_choose_31_2);
                        _jettag_c_otherwise_49_2.setTagInfo(_td_c_otherwise_49_2);
                        _jettag_c_otherwise_49_2.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_49_2_saved_out = out;
                        while (_jettag_c_otherwise_49_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_setVariable_50_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_50_2.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_setVariable_50_2.setTagInfo(_td_c_setVariable_50_2);
                            _jettag_c_setVariable_50_2.doStart(context, out);
                            _jettag_c_setVariable_50_2.doEnd();
                            out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_51_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_28); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_51_28.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_51_28.setTagInfo(_td_c_get_51_28);
                            _jettag_c_get_51_28.doStart(context, out);
                            _jettag_c_get_51_28.doEnd();
                            RuntimeTagElement _jettag_c_iterate_51_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_78); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_51_78.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_iterate_51_78.setTagInfo(_td_c_iterate_51_78);
                            _jettag_c_iterate_51_78.doStart(context, out);
                            while (_jettag_c_iterate_51_78.okToProcessBody()) {
                                out.write("/{");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_51_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_147); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_51_147.setRuntimeParent(_jettag_c_iterate_51_78);
                                _jettag_c_get_51_147.setTagInfo(_td_c_get_51_147);
                                _jettag_c_get_51_147.doStart(context, out);
                                _jettag_c_get_51_147.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_51_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_182); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_51_182.setRuntimeParent(_jettag_c_iterate_51_78);
                                _jettag_c_get_51_182.setTagInfo(_td_c_get_51_182);
                                _jettag_c_get_51_182.doStart(context, out);
                                _jettag_c_get_51_182.doEnd();
                                out.write("}");  //$NON-NLS-1$        
                                _jettag_c_iterate_51_78.handleBodyContent(out);
                            }
                            _jettag_c_iterate_51_78.doEnd();
                            out.write("/");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_51_231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_231); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_51_231.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_51_231.setTagInfo(_td_c_get_51_231);
                            _jettag_c_get_51_231.doStart(context, out);
                            _jettag_c_get_51_231.doEnd();
                            out.write("s\", method = RequestMethod.GET)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ResponseBody");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\tpublic List<");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_53_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_14); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_53_14.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_53_14.setTagInfo(_td_c_get_53_14);
                            _jettag_c_get_53_14.doStart(context, out);
                            _jettag_c_get_53_14.doEnd();
                            out.write("> get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_53_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_74); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_53_74.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_53_74.setTagInfo(_td_c_get_53_74);
                            _jettag_c_get_53_74.doStart(context, out);
                            _jettag_c_get_53_74.doEnd();
                            RuntimeTagElement _jettag_c_get_53_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_124); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_53_124.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_53_124.setTagInfo(_td_c_get_53_124);
                            _jettag_c_get_53_124.doStart(context, out);
                            _jettag_c_get_53_124.doEnd();
                            out.write("s(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_53_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_181); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_53_181.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_iterate_53_181.setTagInfo(_td_c_iterate_53_181);
                            _jettag_c_iterate_53_181.doStart(context, out);
                            while (_jettag_c_iterate_53_181.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_53_248 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_248); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_248.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_if_53_248.setTagInfo(_td_c_if_53_248);
                                _jettag_c_if_53_248.doStart(context, out);
                                while (_jettag_c_if_53_248.okToProcessBody()) {
                                    out.write("@PathVariable String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_505 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_505); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_505.setRuntimeParent(_jettag_c_if_53_248);
                                    _jettag_c_get_53_505.setTagInfo(_td_c_get_53_505);
                                    _jettag_c_get_53_505.doStart(context, out);
                                    _jettag_c_get_53_505.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_540 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_540); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_540.setRuntimeParent(_jettag_c_if_53_248);
                                    _jettag_c_get_53_540.setTagInfo(_td_c_get_53_540);
                                    _jettag_c_get_53_540.doStart(context, out);
                                    _jettag_c_get_53_540.doEnd();
                                    _jettag_c_if_53_248.handleBodyContent(out);
                                }
                                _jettag_c_if_53_248.doEnd();
                                RuntimeTagElement _jettag_c_if_53_582 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_582); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_582.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_if_53_582.setTagInfo(_td_c_if_53_582);
                                _jettag_c_if_53_582.doStart(context, out);
                                while (_jettag_c_if_53_582.okToProcessBody()) {
                                    out.write("@PathVariable Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_759 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_759); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_759.setRuntimeParent(_jettag_c_if_53_582);
                                    _jettag_c_get_53_759.setTagInfo(_td_c_get_53_759);
                                    _jettag_c_get_53_759.doStart(context, out);
                                    _jettag_c_get_53_759.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_794 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_794); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_794.setRuntimeParent(_jettag_c_if_53_582);
                                    _jettag_c_get_53_794.setTagInfo(_td_c_get_53_794);
                                    _jettag_c_get_53_794.doStart(context, out);
                                    _jettag_c_get_53_794.doEnd();
                                    _jettag_c_if_53_582.handleBodyContent(out);
                                }
                                _jettag_c_if_53_582.doEnd();
                                RuntimeTagElement _jettag_c_if_53_836 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_836); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_836.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_if_53_836.setTagInfo(_td_c_if_53_836);
                                _jettag_c_if_53_836.doStart(context, out);
                                while (_jettag_c_if_53_836.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_53_987 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_53_987); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_53_987.setRuntimeParent(_jettag_c_if_53_836);
                                    _jettag_java_import_53_987.setTagInfo(_td_java_import_53_987);
                                    _jettag_java_import_53_987.doStart(context, out);
                                    JET2Writer _jettag_java_import_53_987_saved_out = out;
                                    while (_jettag_java_import_53_987.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_53_987.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_53_987_saved_out;
                                    _jettag_java_import_53_987.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_1043 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_1043); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_1043.setRuntimeParent(_jettag_c_if_53_836);
                                    _jettag_c_get_53_1043.setTagInfo(_td_c_get_53_1043);
                                    _jettag_c_get_53_1043.doStart(context, out);
                                    _jettag_c_get_53_1043.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_1078 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_1078); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_1078.setRuntimeParent(_jettag_c_if_53_836);
                                    _jettag_c_get_53_1078.setTagInfo(_td_c_get_53_1078);
                                    _jettag_c_get_53_1078.doStart(context, out);
                                    _jettag_c_get_53_1078.doEnd();
                                    _jettag_c_if_53_836.handleBodyContent(out);
                                }
                                _jettag_c_if_53_836.doEnd();
                                RuntimeTagElement _jettag_c_if_53_1120 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_1120); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_1120.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_if_53_1120.setTagInfo(_td_c_if_53_1120);
                                _jettag_c_if_53_1120.doStart(context, out);
                                while (_jettag_c_if_53_1120.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_53_1271 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_53_1271); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_53_1271.setRuntimeParent(_jettag_c_if_53_1120);
                                    _jettag_java_import_53_1271.setTagInfo(_td_java_import_53_1271);
                                    _jettag_java_import_53_1271.doStart(context, out);
                                    JET2Writer _jettag_java_import_53_1271_saved_out = out;
                                    while (_jettag_java_import_53_1271.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("@PathVariable java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_53_1271.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_53_1271_saved_out;
                                    _jettag_java_import_53_1271.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_1333 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_1333); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_1333.setRuntimeParent(_jettag_c_if_53_1120);
                                    _jettag_c_get_53_1333.setTagInfo(_td_c_get_53_1333);
                                    _jettag_c_get_53_1333.doStart(context, out);
                                    _jettag_c_get_53_1333.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_53_1368 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_1368); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_53_1368.setRuntimeParent(_jettag_c_if_53_1120);
                                    _jettag_c_get_53_1368.setTagInfo(_td_c_get_53_1368);
                                    _jettag_c_get_53_1368.doStart(context, out);
                                    _jettag_c_get_53_1368.doEnd();
                                    _jettag_c_if_53_1120.handleBodyContent(out);
                                }
                                _jettag_c_if_53_1120.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_53_1410 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_1410); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_53_1410.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_setVariable_53_1410.setTagInfo(_td_c_setVariable_53_1410);
                                _jettag_c_setVariable_53_1410.doStart(context, out);
                                _jettag_c_setVariable_53_1410.doEnd();
                                RuntimeTagElement _jettag_c_if_53_1459 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_1459); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_1459.setRuntimeParent(_jettag_c_iterate_53_181);
                                _jettag_c_if_53_1459.setTagInfo(_td_c_if_53_1459);
                                _jettag_c_if_53_1459.doStart(context, out);
                                while (_jettag_c_if_53_1459.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_53_1459.handleBodyContent(out);
                                }
                                _jettag_c_if_53_1459.doEnd();
                                _jettag_c_iterate_53_181.handleBodyContent(out);
                            }
                            _jettag_c_iterate_53_181.doEnd();
                            out.write("){");  //$NON-NLS-1$        
                            out.write(NL);         
                            RuntimeTagElement _jettag_c_setVariable_54_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_54_3.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_setVariable_54_3.setTagInfo(_td_c_setVariable_54_3);
                            _jettag_c_setVariable_54_3.doStart(context, out);
                            _jettag_c_setVariable_54_3.doEnd();
                            out.write("\t\treturn new java.util.ArrayList<");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_55_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_34); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_55_34.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_55_34.setTagInfo(_td_c_get_55_34);
                            _jettag_c_get_55_34.doStart(context, out);
                            _jettag_c_get_55_34.doEnd();
                            out.write(">(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_55_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_91); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_55_91.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_55_91.setTagInfo(_td_c_get_55_91);
                            _jettag_c_get_55_91.doStart(context, out);
                            _jettag_c_get_55_91.doEnd();
                            out.write("DAO.find");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_55_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_133); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_55_133.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_55_133.setTagInfo(_td_c_get_55_133);
                            _jettag_c_get_55_133.doStart(context, out);
                            _jettag_c_get_55_133.doEnd();
                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_55_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_196); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_55_196.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_iterate_55_196.setTagInfo(_td_c_iterate_55_196);
                            _jettag_c_iterate_55_196.doStart(context, out);
                            while (_jettag_c_iterate_55_196.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_get_55_263 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_263); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_55_263.setRuntimeParent(_jettag_c_iterate_55_196);
                                _jettag_c_get_55_263.setTagInfo(_td_c_get_55_263);
                                _jettag_c_get_55_263.doStart(context, out);
                                _jettag_c_get_55_263.doEnd();
                                out.write("_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_55_298 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_298); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_55_298.setRuntimeParent(_jettag_c_iterate_55_196);
                                _jettag_c_get_55_298.setTagInfo(_td_c_get_55_298);
                                _jettag_c_get_55_298.doStart(context, out);
                                _jettag_c_get_55_298.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_55_333 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_55_333); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_55_333.setRuntimeParent(_jettag_c_iterate_55_196);
                                _jettag_c_setVariable_55_333.setTagInfo(_td_c_setVariable_55_333);
                                _jettag_c_setVariable_55_333.doStart(context, out);
                                _jettag_c_setVariable_55_333.doEnd();
                                RuntimeTagElement _jettag_c_if_55_382 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_382); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_55_382.setRuntimeParent(_jettag_c_iterate_55_196);
                                _jettag_c_if_55_382.setTagInfo(_td_c_if_55_382);
                                _jettag_c_if_55_382.doStart(context, out);
                                while (_jettag_c_if_55_382.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_55_382.handleBodyContent(out);
                                }
                                _jettag_c_if_55_382.doEnd();
                                _jettag_c_iterate_55_196.handleBodyContent(out);
                            }
                            _jettag_c_iterate_55_196.doEnd();
                            out.write(").get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_55_429 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_429); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_55_429.setRuntimeParent(_jettag_c_otherwise_49_2);
                            _jettag_c_get_55_429.setTagInfo(_td_c_get_55_429);
                            _jettag_c_get_55_429.doStart(context, out);
                            _jettag_c_get_55_429.doEnd();
                            out.write("s());");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_49_2.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_49_2_saved_out;
                        _jettag_c_otherwise_49_2.doEnd();
                        _jettag_c_choose_31_2.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_31_2_saved_out;
                    _jettag_c_choose_31_2.doEnd();
                    _jettag_c_if_22_2.handleBodyContent(out);
                }
                _jettag_c_if_22_2.doEnd();
                _jettag_c_iterate_21_2.handleBodyContent(out);
            }
            _jettag_c_iterate_21_2.doEnd();
            _jettag_c_iterate_20_2.handleBodyContent(out);
        }
        _jettag_c_iterate_20_2.doEnd();
    }
}
