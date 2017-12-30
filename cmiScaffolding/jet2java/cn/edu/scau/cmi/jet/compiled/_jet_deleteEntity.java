package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_deleteEntity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_deleteEntity() {
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
    private static final TagInfo _td_c_get_11_20 = new TagInfo("c:get", //$NON-NLS-1$
            11, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_71 = new TagInfo("c:get", //$NON-NLS-1$
            11, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_122 = new TagInfo("c:get", //$NON-NLS-1$
            11, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_13_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            13, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_20 = new TagInfo("c:get", //$NON-NLS-1$
            14, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_71 = new TagInfo("c:get", //$NON-NLS-1$
            14, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_122 = new TagInfo("c:get", //$NON-NLS-1$
            14, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_19_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_2 = new TagInfo("c:if", //$NON-NLS-1$
            23, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_26_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_9 = new TagInfo("c:get", //$NON-NLS-1$
            28, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_66 = new TagInfo("c:get", //$NON-NLS-1$
            28, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_116 = new TagInfo("c:get", //$NON-NLS-1$
            28, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_175 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 175,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_242 = new TagInfo("c:if", //$NON-NLS-1$
            28, 242,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_485 = new TagInfo("c:get", //$NON-NLS-1$
            28, 485,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_527 = new TagInfo("c:if", //$NON-NLS-1$
            28, 527,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_690 = new TagInfo("c:get", //$NON-NLS-1$
            28, 690,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_732 = new TagInfo("c:if", //$NON-NLS-1$
            28, 732,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_28_883 = new TagInfo("java:import", //$NON-NLS-1$
            28, 883,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_925 = new TagInfo("c:get", //$NON-NLS-1$
            28, 925,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_967 = new TagInfo("c:if", //$NON-NLS-1$
            28, 967,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_28_1118 = new TagInfo("java:import", //$NON-NLS-1$
            28, 1118,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_1166 = new TagInfo("c:get", //$NON-NLS-1$
            28, 1166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_1208 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 1208,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1257 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1257,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_1301 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 1301,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1357 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1357,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_1576 = new TagInfo("c:get", //$NON-NLS-1$
            28, 1576,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_1619 = new TagInfo("c:get", //$NON-NLS-1$
            28, 1619,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1657 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1657,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_1808 = new TagInfo("c:get", //$NON-NLS-1$
            28, 1808,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_1851 = new TagInfo("c:get", //$NON-NLS-1$
            28, 1851,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1889 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1889,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_28_2020 = new TagInfo("java:import", //$NON-NLS-1$
            28, 2020,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_2070 = new TagInfo("c:get", //$NON-NLS-1$
            28, 2070,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_2113 = new TagInfo("c:get", //$NON-NLS-1$
            28, 2113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_2151 = new TagInfo("c:if", //$NON-NLS-1$
            28, 2151,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_28_2282 = new TagInfo("java:import", //$NON-NLS-1$
            28, 2282,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_2338 = new TagInfo("c:get", //$NON-NLS-1$
            28, 2338,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_2381 = new TagInfo("c:get", //$NON-NLS-1$
            28, 2381,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_2419 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 2419,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_2472 = new TagInfo("c:if", //$NON-NLS-1$
            28, 2472,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_32_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            32, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_33_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_34_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            34, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_37_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_3 = new TagInfo("c:if", //$NON-NLS-1$
            39, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_42_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            42, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_45_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_46_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            46, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_4 = new TagInfo("c:if", //$NON-NLS-1$
            48, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_4 = new TagInfo("c:if", //$NON-NLS-1$
            49, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_11 = new TagInfo("c:get", //$NON-NLS-1$
            50, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_68 = new TagInfo("c:get", //$NON-NLS-1$
            50, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_118 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 118,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_50_183 = new TagInfo("c:choose", //$NON-NLS-1$
            50, 183,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_50_193 = new TagInfo("c:when", //$NON-NLS-1$
            50, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_50_258 = new TagInfo("c:otherwise", //$NON-NLS-1$
            50, 258,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_271 = new TagInfo("c:get", //$NON-NLS-1$
            50, 271,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_367 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 367,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_434 = new TagInfo("c:if", //$NON-NLS-1$
            50, 434,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_677 = new TagInfo("c:get", //$NON-NLS-1$
            50, 677,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_719 = new TagInfo("c:if", //$NON-NLS-1$
            50, 719,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_882 = new TagInfo("c:get", //$NON-NLS-1$
            50, 882,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_924 = new TagInfo("c:if", //$NON-NLS-1$
            50, 924,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_50_1075 = new TagInfo("java:import", //$NON-NLS-1$
            50, 1075,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_1117 = new TagInfo("c:get", //$NON-NLS-1$
            50, 1117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_1159 = new TagInfo("c:if", //$NON-NLS-1$
            50, 1159,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_50_1310 = new TagInfo("java:import", //$NON-NLS-1$
            50, 1310,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_1358 = new TagInfo("c:get", //$NON-NLS-1$
            50, 1358,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_1400 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 1400,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_1449 = new TagInfo("c:if", //$NON-NLS-1$
            50, 1449,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1492 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1492,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_50_1557 = new TagInfo("c:choose", //$NON-NLS-1$
            50, 1557,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_50_1567 = new TagInfo("c:when", //$NON-NLS-1$
            50, 1567,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_50_1632 = new TagInfo("c:otherwise", //$NON-NLS-1$
            50, 1632,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_50_1645 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1645,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_1697 = new TagInfo("c:if", //$NON-NLS-1$
            50, 1697,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_1744 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 1744,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1784 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1784,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_1835 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 1835,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pcount+1", //$NON-NLS-1$
                "pcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1895 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1895,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "rpk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_1948 = new TagInfo("c:if", //$NON-NLS-1$
            50, 1948,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@type='VARCHAR'or$rpk/@type='CHAR'or$rpk/@type='SET'or$rpk/@type='ENUM'or$rpk/@type='TINYTEXT'or$rpk/@type='TEXT'or$rpk/@type='MEDIUMTEXT'or$rpk/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2143 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2143,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2186 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2186,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_2221 = new TagInfo("c:if", //$NON-NLS-1$
            50, 2221,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@type='SMALLINT'or$rpk/@type='MEDIUMINT'or$rpk/@type='INT'or$rpk/@type='INTEGER'or$rpk/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2357 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2357,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2400 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2400,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_2435 = new TagInfo("c:if", //$NON-NLS-1$
            50, 2435,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@type='TIMESTAMP'or$rpk/@type='DATE'or$rpk/@type='TIME'or$rpk/@type='YEAR'or$rpk/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_50_2551 = new TagInfo("java:import", //$NON-NLS-1$
            50, 2551,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_2601 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2601,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2644 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2644,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_2679 = new TagInfo("c:if", //$NON-NLS-1$
            50, 2679,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@type='DOUBLE'or$rpk/@type='FLOAT'or$rpk/@type='REAL'or$rpk/@type='DECIMAL'or$rpk/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_50_2795 = new TagInfo("java:import", //$NON-NLS-1$
            50, 2795,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_2851 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2851,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_2894 = new TagInfo("c:get", //$NON-NLS-1$
            50, 2894,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rpk/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_2929 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 2929,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pcount+(-1)", //$NON-NLS-1$
                "pcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_2980 = new TagInfo("c:if", //$NON-NLS-1$
            50, 2980,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pcount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_4 = new TagInfo("c:if", //$NON-NLS-1$
            52, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_54_3 = new TagInfo("c:if", //$NON-NLS-1$
            54, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_55_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            55, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_56_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            56, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_11 = new TagInfo("c:get", //$NON-NLS-1$
            60, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_68 = new TagInfo("c:get", //$NON-NLS-1$
            60, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_118 = new TagInfo("c:get", //$NON-NLS-1$
            60, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_171 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 171,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_238 = new TagInfo("c:if", //$NON-NLS-1$
            60, 238,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_481 = new TagInfo("c:get", //$NON-NLS-1$
            60, 481,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_523 = new TagInfo("c:if", //$NON-NLS-1$
            60, 523,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_686 = new TagInfo("c:get", //$NON-NLS-1$
            60, 686,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_728 = new TagInfo("c:if", //$NON-NLS-1$
            60, 728,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_879 = new TagInfo("java:import", //$NON-NLS-1$
            60, 879,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_921 = new TagInfo("c:get", //$NON-NLS-1$
            60, 921,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_963 = new TagInfo("c:if", //$NON-NLS-1$
            60, 963,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_1114 = new TagInfo("java:import", //$NON-NLS-1$
            60, 1114,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_1162 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_1204 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 1204,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1253 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1253,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_1297 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 1297,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1353 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1353,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1572 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1572,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1609 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1609,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1647 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1647,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1798 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1798,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1835 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1835,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1873 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1873,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_2004 = new TagInfo("java:import", //$NON-NLS-1$
            60, 2004,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_2054 = new TagInfo("c:get", //$NON-NLS-1$
            60, 2054,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_2091 = new TagInfo("c:get", //$NON-NLS-1$
            60, 2091,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_2129 = new TagInfo("c:if", //$NON-NLS-1$
            60, 2129,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_2260 = new TagInfo("java:import", //$NON-NLS-1$
            60, 2260,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_2316 = new TagInfo("c:get", //$NON-NLS-1$
            60, 2316,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_2353 = new TagInfo("c:get", //$NON-NLS-1$
            60, 2353,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_2391 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 2391,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_2444 = new TagInfo("c:if", //$NON-NLS-1$
            60, 2444,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_4 = new TagInfo("c:if", //$NON-NLS-1$
            65, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_66_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            66, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_67_3 = new TagInfo("c:if", //$NON-NLS-1$
            67, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_68_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            68, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_70_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            70, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_72_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            72, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_11 = new TagInfo("c:get", //$NON-NLS-1$
            73, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_68 = new TagInfo("c:get", //$NON-NLS-1$
            73, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_118 = new TagInfo("c:get", //$NON-NLS-1$
            73, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_171 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 171,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_238 = new TagInfo("c:if", //$NON-NLS-1$
            73, 238,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_481 = new TagInfo("c:get", //$NON-NLS-1$
            73, 481,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_523 = new TagInfo("c:if", //$NON-NLS-1$
            73, 523,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_686 = new TagInfo("c:get", //$NON-NLS-1$
            73, 686,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_728 = new TagInfo("c:if", //$NON-NLS-1$
            73, 728,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_73_879 = new TagInfo("java:import", //$NON-NLS-1$
            73, 879,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_73_921 = new TagInfo("c:get", //$NON-NLS-1$
            73, 921,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_963 = new TagInfo("c:if", //$NON-NLS-1$
            73, 963,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_73_1114 = new TagInfo("java:import", //$NON-NLS-1$
            73, 1114,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_73_1162 = new TagInfo("c:get", //$NON-NLS-1$
            73, 1162,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_73_1204 = new TagInfo("c:setVariable", //$NON-NLS-1$
            73, 1204,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_1253 = new TagInfo("c:if", //$NON-NLS-1$
            73, 1253,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_73_1297 = new TagInfo("c:iterate", //$NON-NLS-1$
            73, 1297,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_1353 = new TagInfo("c:if", //$NON-NLS-1$
            73, 1353,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_1572 = new TagInfo("c:get", //$NON-NLS-1$
            73, 1572,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_1609 = new TagInfo("c:get", //$NON-NLS-1$
            73, 1609,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_1647 = new TagInfo("c:if", //$NON-NLS-1$
            73, 1647,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_1798 = new TagInfo("c:get", //$NON-NLS-1$
            73, 1798,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_1835 = new TagInfo("c:get", //$NON-NLS-1$
            73, 1835,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_1873 = new TagInfo("c:if", //$NON-NLS-1$
            73, 1873,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_73_2004 = new TagInfo("java:import", //$NON-NLS-1$
            73, 2004,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_73_2054 = new TagInfo("c:get", //$NON-NLS-1$
            73, 2054,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_2091 = new TagInfo("c:get", //$NON-NLS-1$
            73, 2091,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_2129 = new TagInfo("c:if", //$NON-NLS-1$
            73, 2129,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_73_2260 = new TagInfo("java:import", //$NON-NLS-1$
            73, 2260,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_73_2316 = new TagInfo("c:get", //$NON-NLS-1$
            73, 2316,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_2353 = new TagInfo("c:get", //$NON-NLS-1$
            73, 2353,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_73_2391 = new TagInfo("c:setVariable", //$NON-NLS-1$
            73, 2391,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_2444 = new TagInfo("c:if", //$NON-NLS-1$
            73, 2444,
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
                out.write("\tpublic void delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_20.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_20.setTagInfo(_td_c_get_11_20);
                _jettag_c_get_11_20.doStart(context, out);
                _jettag_c_get_11_20.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_71.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_71.setTagInfo(_td_c_get_11_71);
                _jettag_c_get_11_71.doStart(context, out);
                _jettag_c_get_11_71.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_122); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_122.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_122.setTagInfo(_td_c_get_11_122);
                _jettag_c_get_11_122.doStart(context, out);
                _jettag_c_get_11_122.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_10_2.handleBodyContent(out);
            }
            out = _jettag_c_when_10_2_saved_out;
            _jettag_c_when_10_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_13_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_13_2.setRuntimeParent(_jettag_c_choose_9_2);
            _jettag_c_otherwise_13_2.setTagInfo(_td_c_otherwise_13_2);
            _jettag_c_otherwise_13_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_13_2_saved_out = out;
            while (_jettag_c_otherwise_13_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\tpublic void delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_20.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_20.setTagInfo(_td_c_get_14_20);
                _jettag_c_get_14_20.doStart(context, out);
                _jettag_c_get_14_20.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_71.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_71.setTagInfo(_td_c_get_14_71);
                _jettag_c_get_14_71.doStart(context, out);
                _jettag_c_get_14_71.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_122); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_122.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_122.setTagInfo(_td_c_get_14_122);
                _jettag_c_get_14_122.doStart(context, out);
                _jettag_c_get_14_122.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_16_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_iterate_16_2.setTagInfo(_td_c_iterate_16_2);
                _jettag_c_iterate_16_2.doStart(context, out);
                while (_jettag_c_iterate_16_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_17_2.setRuntimeParent(_jettag_c_iterate_16_2);
                    _jettag_c_setVariable_17_2.setTagInfo(_td_c_setVariable_17_2);
                    _jettag_c_setVariable_17_2.doStart(context, out);
                    _jettag_c_setVariable_17_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_18_2.setRuntimeParent(_jettag_c_iterate_16_2);
                    _jettag_c_iterate_18_2.setTagInfo(_td_c_iterate_18_2);
                    _jettag_c_iterate_18_2.doStart(context, out);
                    while (_jettag_c_iterate_18_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_19_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_19_2.setRuntimeParent(_jettag_c_iterate_18_2);
                        _jettag_c_setVariable_19_2.setTagInfo(_td_c_setVariable_19_2);
                        _jettag_c_setVariable_19_2.doStart(context, out);
                        _jettag_c_setVariable_19_2.doEnd();
                        _jettag_c_iterate_18_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_18_2.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_21_2.setRuntimeParent(_jettag_c_iterate_16_2);
                    _jettag_c_setVariable_21_2.setTagInfo(_td_c_setVariable_21_2);
                    _jettag_c_setVariable_21_2.doStart(context, out);
                    _jettag_c_setVariable_21_2.doEnd();
                    RuntimeTagElement _jettag_c_iterate_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_22_2.setRuntimeParent(_jettag_c_iterate_16_2);
                    _jettag_c_iterate_22_2.setTagInfo(_td_c_iterate_22_2);
                    _jettag_c_iterate_22_2.doStart(context, out);
                    while (_jettag_c_iterate_22_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_23_2.setRuntimeParent(_jettag_c_iterate_22_2);
                        _jettag_c_if_23_2.setTagInfo(_td_c_if_23_2);
                        _jettag_c_if_23_2.doStart(context, out);
                        while (_jettag_c_if_23_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
                            _jettag_c_setVariable_24_2.doStart(context, out);
                            _jettag_c_setVariable_24_2.doEnd();
                            RuntimeTagElement _jettag_c_iterate_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_25_2.setRuntimeParent(_jettag_c_if_23_2);
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
                            out.write("\tpublic ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_28_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_28_9.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_get_28_9.setTagInfo(_td_c_get_28_9);
                            _jettag_c_get_28_9.doStart(context, out);
                            _jettag_c_get_28_9.doEnd();
                            out.write(" delete");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_28_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_66); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_28_66.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_get_28_66.setTagInfo(_td_c_get_28_66);
                            _jettag_c_get_28_66.doStart(context, out);
                            _jettag_c_get_28_66.doEnd();
                            RuntimeTagElement _jettag_c_get_28_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_28_116.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_get_28_116.setTagInfo(_td_c_get_28_116);
                            _jettag_c_get_28_116.doStart(context, out);
                            _jettag_c_get_28_116.doEnd();
                            out.write("(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_28_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_175); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_28_175.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_iterate_28_175.setTagInfo(_td_c_iterate_28_175);
                            _jettag_c_iterate_28_175.doStart(context, out);
                            while (_jettag_c_iterate_28_175.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_28_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_242); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_242.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_if_28_242.setTagInfo(_td_c_if_28_242);
                                _jettag_c_if_28_242.doStart(context, out);
                                while (_jettag_c_if_28_242.okToProcessBody()) {
                                    out.write("String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_485 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_485); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_485.setRuntimeParent(_jettag_c_if_28_242);
                                    _jettag_c_get_28_485.setTagInfo(_td_c_get_28_485);
                                    _jettag_c_get_28_485.doStart(context, out);
                                    _jettag_c_get_28_485.doEnd();
                                    _jettag_c_if_28_242.handleBodyContent(out);
                                }
                                _jettag_c_if_28_242.doEnd();
                                RuntimeTagElement _jettag_c_if_28_527 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_527); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_527.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_if_28_527.setTagInfo(_td_c_if_28_527);
                                _jettag_c_if_28_527.doStart(context, out);
                                while (_jettag_c_if_28_527.okToProcessBody()) {
                                    out.write("Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_690 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_690); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_690.setRuntimeParent(_jettag_c_if_28_527);
                                    _jettag_c_get_28_690.setTagInfo(_td_c_get_28_690);
                                    _jettag_c_get_28_690.doStart(context, out);
                                    _jettag_c_get_28_690.doEnd();
                                    _jettag_c_if_28_527.handleBodyContent(out);
                                }
                                _jettag_c_if_28_527.doEnd();
                                RuntimeTagElement _jettag_c_if_28_732 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_732); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_732.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_if_28_732.setTagInfo(_td_c_if_28_732);
                                _jettag_c_if_28_732.doStart(context, out);
                                while (_jettag_c_if_28_732.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_28_883 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_883); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_28_883.setRuntimeParent(_jettag_c_if_28_732);
                                    _jettag_java_import_28_883.setTagInfo(_td_java_import_28_883);
                                    _jettag_java_import_28_883.doStart(context, out);
                                    JET2Writer _jettag_java_import_28_883_saved_out = out;
                                    while (_jettag_java_import_28_883.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_28_883.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_28_883_saved_out;
                                    _jettag_java_import_28_883.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_925 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_925); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_925.setRuntimeParent(_jettag_c_if_28_732);
                                    _jettag_c_get_28_925.setTagInfo(_td_c_get_28_925);
                                    _jettag_c_get_28_925.doStart(context, out);
                                    _jettag_c_get_28_925.doEnd();
                                    _jettag_c_if_28_732.handleBodyContent(out);
                                }
                                _jettag_c_if_28_732.doEnd();
                                RuntimeTagElement _jettag_c_if_28_967 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_967); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_967.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_if_28_967.setTagInfo(_td_c_if_28_967);
                                _jettag_c_if_28_967.doStart(context, out);
                                while (_jettag_c_if_28_967.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_28_1118 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_1118); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_28_1118.setRuntimeParent(_jettag_c_if_28_967);
                                    _jettag_java_import_28_1118.setTagInfo(_td_java_import_28_1118);
                                    _jettag_java_import_28_1118.doStart(context, out);
                                    JET2Writer _jettag_java_import_28_1118_saved_out = out;
                                    while (_jettag_java_import_28_1118.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_28_1118.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_28_1118_saved_out;
                                    _jettag_java_import_28_1118.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_1166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_1166); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_1166.setRuntimeParent(_jettag_c_if_28_967);
                                    _jettag_c_get_28_1166.setTagInfo(_td_c_get_28_1166);
                                    _jettag_c_get_28_1166.doStart(context, out);
                                    _jettag_c_get_28_1166.doEnd();
                                    _jettag_c_if_28_967.handleBodyContent(out);
                                }
                                _jettag_c_if_28_967.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_28_1208 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_1208); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_28_1208.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_setVariable_28_1208.setTagInfo(_td_c_setVariable_28_1208);
                                _jettag_c_setVariable_28_1208.doStart(context, out);
                                _jettag_c_setVariable_28_1208.doEnd();
                                RuntimeTagElement _jettag_c_if_28_1257 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1257); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_1257.setRuntimeParent(_jettag_c_iterate_28_175);
                                _jettag_c_if_28_1257.setTagInfo(_td_c_if_28_1257);
                                _jettag_c_if_28_1257.doStart(context, out);
                                while (_jettag_c_if_28_1257.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_28_1257.handleBodyContent(out);
                                }
                                _jettag_c_if_28_1257.doEnd();
                                _jettag_c_iterate_28_175.handleBodyContent(out);
                            }
                            _jettag_c_iterate_28_175.doEnd();
                            out.write(", ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_28_1301 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_1301); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_28_1301.setRuntimeParent(_jettag_c_if_23_2);
                            _jettag_c_iterate_28_1301.setTagInfo(_td_c_iterate_28_1301);
                            _jettag_c_iterate_28_1301.doStart(context, out);
                            while (_jettag_c_iterate_28_1301.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_28_1357 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1357); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_1357.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_if_28_1357.setTagInfo(_td_c_if_28_1357);
                                _jettag_c_if_28_1357.doStart(context, out);
                                while (_jettag_c_if_28_1357.okToProcessBody()) {
                                    out.write("String related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_1576 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_1576); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_1576.setRuntimeParent(_jettag_c_if_28_1357);
                                    _jettag_c_get_28_1576.setTagInfo(_td_c_get_28_1576);
                                    _jettag_c_get_28_1576.doStart(context, out);
                                    _jettag_c_get_28_1576.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_1619 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_1619); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_1619.setRuntimeParent(_jettag_c_if_28_1357);
                                    _jettag_c_get_28_1619.setTagInfo(_td_c_get_28_1619);
                                    _jettag_c_get_28_1619.doStart(context, out);
                                    _jettag_c_get_28_1619.doEnd();
                                    _jettag_c_if_28_1357.handleBodyContent(out);
                                }
                                _jettag_c_if_28_1357.doEnd();
                                RuntimeTagElement _jettag_c_if_28_1657 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1657); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_1657.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_if_28_1657.setTagInfo(_td_c_if_28_1657);
                                _jettag_c_if_28_1657.doStart(context, out);
                                while (_jettag_c_if_28_1657.okToProcessBody()) {
                                    out.write("Integer related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_1808 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_1808); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_1808.setRuntimeParent(_jettag_c_if_28_1657);
                                    _jettag_c_get_28_1808.setTagInfo(_td_c_get_28_1808);
                                    _jettag_c_get_28_1808.doStart(context, out);
                                    _jettag_c_get_28_1808.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_1851 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_1851); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_1851.setRuntimeParent(_jettag_c_if_28_1657);
                                    _jettag_c_get_28_1851.setTagInfo(_td_c_get_28_1851);
                                    _jettag_c_get_28_1851.doStart(context, out);
                                    _jettag_c_get_28_1851.doEnd();
                                    _jettag_c_if_28_1657.handleBodyContent(out);
                                }
                                _jettag_c_if_28_1657.doEnd();
                                RuntimeTagElement _jettag_c_if_28_1889 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1889); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_1889.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_if_28_1889.setTagInfo(_td_c_if_28_1889);
                                _jettag_c_if_28_1889.doStart(context, out);
                                while (_jettag_c_if_28_1889.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_28_2020 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_2020); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_28_2020.setRuntimeParent(_jettag_c_if_28_1889);
                                    _jettag_java_import_28_2020.setTagInfo(_td_java_import_28_2020);
                                    _jettag_java_import_28_2020.doStart(context, out);
                                    JET2Writer _jettag_java_import_28_2020_saved_out = out;
                                    while (_jettag_java_import_28_2020.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_28_2020.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_28_2020_saved_out;
                                    _jettag_java_import_28_2020.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_2070 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_2070); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_2070.setRuntimeParent(_jettag_c_if_28_1889);
                                    _jettag_c_get_28_2070.setTagInfo(_td_c_get_28_2070);
                                    _jettag_c_get_28_2070.doStart(context, out);
                                    _jettag_c_get_28_2070.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_2113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_2113); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_2113.setRuntimeParent(_jettag_c_if_28_1889);
                                    _jettag_c_get_28_2113.setTagInfo(_td_c_get_28_2113);
                                    _jettag_c_get_28_2113.doStart(context, out);
                                    _jettag_c_get_28_2113.doEnd();
                                    _jettag_c_if_28_1889.handleBodyContent(out);
                                }
                                _jettag_c_if_28_1889.doEnd();
                                RuntimeTagElement _jettag_c_if_28_2151 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_2151); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_2151.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_if_28_2151.setTagInfo(_td_c_if_28_2151);
                                _jettag_c_if_28_2151.doStart(context, out);
                                while (_jettag_c_if_28_2151.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_28_2282 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_28_2282); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_28_2282.setRuntimeParent(_jettag_c_if_28_2151);
                                    _jettag_java_import_28_2282.setTagInfo(_td_java_import_28_2282);
                                    _jettag_java_import_28_2282.doStart(context, out);
                                    JET2Writer _jettag_java_import_28_2282_saved_out = out;
                                    while (_jettag_java_import_28_2282.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_28_2282.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_28_2282_saved_out;
                                    _jettag_java_import_28_2282.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_2338 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_2338); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_2338.setRuntimeParent(_jettag_c_if_28_2151);
                                    _jettag_c_get_28_2338.setTagInfo(_td_c_get_28_2338);
                                    _jettag_c_get_28_2338.doStart(context, out);
                                    _jettag_c_get_28_2338.doEnd();
                                    out.write("_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_2381 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_2381); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_2381.setRuntimeParent(_jettag_c_if_28_2151);
                                    _jettag_c_get_28_2381.setTagInfo(_td_c_get_28_2381);
                                    _jettag_c_get_28_2381.doStart(context, out);
                                    _jettag_c_get_28_2381.doEnd();
                                    _jettag_c_if_28_2151.handleBodyContent(out);
                                }
                                _jettag_c_if_28_2151.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_28_2419 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_2419); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_28_2419.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_setVariable_28_2419.setTagInfo(_td_c_setVariable_28_2419);
                                _jettag_c_setVariable_28_2419.doStart(context, out);
                                _jettag_c_setVariable_28_2419.doEnd();
                                RuntimeTagElement _jettag_c_if_28_2472 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_2472); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_28_2472.setRuntimeParent(_jettag_c_iterate_28_1301);
                                _jettag_c_if_28_2472.setTagInfo(_td_c_if_28_2472);
                                _jettag_c_if_28_2472.doStart(context, out);
                                while (_jettag_c_if_28_2472.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_28_2472.handleBodyContent(out);
                                }
                                _jettag_c_if_28_2472.doEnd();
                                _jettag_c_iterate_28_1301.handleBodyContent(out);
                            }
                            _jettag_c_iterate_28_1301.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_23_2.handleBodyContent(out);
                        }
                        _jettag_c_if_23_2.doEnd();
                        _jettag_c_iterate_22_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_22_2.doEnd();
                    _jettag_c_iterate_16_2.handleBodyContent(out);
                }
                _jettag_c_iterate_16_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_32_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_32_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_setVariable_32_2.setTagInfo(_td_c_setVariable_32_2);
                _jettag_c_setVariable_32_2.doStart(context, out);
                _jettag_c_setVariable_32_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_33_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_33_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_iterate_33_2.setTagInfo(_td_c_iterate_33_2);
                _jettag_c_iterate_33_2.doStart(context, out);
                while (_jettag_c_iterate_33_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_34_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_34_2.setRuntimeParent(_jettag_c_iterate_33_2);
                    _jettag_c_setVariable_34_2.setTagInfo(_td_c_setVariable_34_2);
                    _jettag_c_setVariable_34_2.doStart(context, out);
                    _jettag_c_setVariable_34_2.doEnd();
                    _jettag_c_iterate_33_2.handleBodyContent(out);
                }
                _jettag_c_iterate_33_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_36_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_setVariable_36_2.setTagInfo(_td_c_setVariable_36_2);
                _jettag_c_setVariable_36_2.doStart(context, out);
                _jettag_c_setVariable_36_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_37_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_iterate_37_2.setTagInfo(_td_c_iterate_37_2);
                _jettag_c_iterate_37_2.doStart(context, out);
                while (_jettag_c_iterate_37_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_38_2.setRuntimeParent(_jettag_c_iterate_37_2);
                    _jettag_c_iterate_38_2.setTagInfo(_td_c_iterate_38_2);
                    _jettag_c_iterate_38_2.doStart(context, out);
                    while (_jettag_c_iterate_38_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_39_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_39_3.setRuntimeParent(_jettag_c_iterate_38_2);
                        _jettag_c_if_39_3.setTagInfo(_td_c_if_39_3);
                        _jettag_c_if_39_3.doStart(context, out);
                        while (_jettag_c_if_39_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_40_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_40_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_setVariable_40_4.setTagInfo(_td_c_setVariable_40_4);
                            _jettag_c_setVariable_40_4.doStart(context, out);
                            _jettag_c_setVariable_40_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_41_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_setVariable_41_4.setTagInfo(_td_c_setVariable_41_4);
                            _jettag_c_setVariable_41_4.doStart(context, out);
                            _jettag_c_setVariable_41_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_42_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_42_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_iterate_42_4.setTagInfo(_td_c_iterate_42_4);
                            _jettag_c_iterate_42_4.doStart(context, out);
                            while (_jettag_c_iterate_42_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_43_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_43_5.setRuntimeParent(_jettag_c_iterate_42_4);
                                _jettag_c_setVariable_43_5.setTagInfo(_td_c_setVariable_43_5);
                                _jettag_c_setVariable_43_5.doStart(context, out);
                                _jettag_c_setVariable_43_5.doEnd();
                                _jettag_c_iterate_42_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_42_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_45_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_45_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_iterate_45_4.setTagInfo(_td_c_iterate_45_4);
                            _jettag_c_iterate_45_4.doStart(context, out);
                            while (_jettag_c_iterate_45_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_46_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_46_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_46_5.setRuntimeParent(_jettag_c_iterate_45_4);
                                _jettag_c_setVariable_46_5.setTagInfo(_td_c_setVariable_46_5);
                                _jettag_c_setVariable_46_5.doStart(context, out);
                                _jettag_c_setVariable_46_5.doEnd();
                                _jettag_c_iterate_45_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_45_4.doEnd();
                            RuntimeTagElement _jettag_c_if_48_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_48_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_if_48_4.setTagInfo(_td_c_if_48_4);
                            _jettag_c_if_48_4.doStart(context, out);
                            while (_jettag_c_if_48_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_49_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_49_4.setRuntimeParent(_jettag_c_if_48_4);
                                _jettag_c_if_49_4.setTagInfo(_td_c_if_49_4);
                                _jettag_c_if_49_4.doStart(context, out);
                                while (_jettag_c_if_49_4.okToProcessBody()) {
                                    out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_50_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_11); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_50_11.setRuntimeParent(_jettag_c_if_49_4);
                                    _jettag_c_get_50_11.setTagInfo(_td_c_get_50_11);
                                    _jettag_c_get_50_11.doStart(context, out);
                                    _jettag_c_get_50_11.doEnd();
                                    out.write(" delete");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_50_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_68); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_50_68.setRuntimeParent(_jettag_c_if_49_4);
                                    _jettag_c_get_50_68.setTagInfo(_td_c_get_50_68);
                                    _jettag_c_get_50_68.doStart(context, out);
                                    _jettag_c_get_50_68.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_50_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_118); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_50_118.setRuntimeParent(_jettag_c_if_49_4);
                                    _jettag_c_iterate_50_118.setTagInfo(_td_c_iterate_50_118);
                                    _jettag_c_iterate_50_118.doStart(context, out);
                                    while (_jettag_c_iterate_50_118.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_50_183 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_50_183); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_50_183.setRuntimeParent(_jettag_c_iterate_50_118);
                                        _jettag_c_choose_50_183.setTagInfo(_td_c_choose_50_183);
                                        _jettag_c_choose_50_183.doStart(context, out);
                                        JET2Writer _jettag_c_choose_50_183_saved_out = out;
                                        while (_jettag_c_choose_50_183.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_50_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_50_193); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_50_193.setRuntimeParent(_jettag_c_choose_50_183);
                                            _jettag_c_when_50_193.setTagInfo(_td_c_when_50_193);
                                            _jettag_c_when_50_193.doStart(context, out);
                                            JET2Writer _jettag_c_when_50_193_saved_out = out;
                                            while (_jettag_c_when_50_193.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_50_193.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_50_193_saved_out;
                                            _jettag_c_when_50_193.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_50_258 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_50_258); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_50_258.setRuntimeParent(_jettag_c_choose_50_183);
                                            _jettag_c_otherwise_50_258.setTagInfo(_td_c_otherwise_50_258);
                                            _jettag_c_otherwise_50_258.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_50_258_saved_out = out;
                                            while (_jettag_c_otherwise_50_258.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_get_50_271 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_271); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_50_271.setRuntimeParent(_jettag_c_otherwise_50_258);
                                                _jettag_c_get_50_271.setTagInfo(_td_c_get_50_271);
                                                _jettag_c_get_50_271.doStart(context, out);
                                                _jettag_c_get_50_271.doEnd();
                                                _jettag_c_otherwise_50_258.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_50_258_saved_out;
                                            _jettag_c_otherwise_50_258.doEnd();
                                            _jettag_c_choose_50_183.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_50_183_saved_out;
                                        _jettag_c_choose_50_183.doEnd();
                                        _jettag_c_iterate_50_118.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_50_118.doEnd();
                                    out.write("s(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_50_367 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_367); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_50_367.setRuntimeParent(_jettag_c_if_49_4);
                                    _jettag_c_iterate_50_367.setTagInfo(_td_c_iterate_50_367);
                                    _jettag_c_iterate_50_367.doStart(context, out);
                                    while (_jettag_c_iterate_50_367.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_50_434 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_434); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_50_434.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_if_50_434.setTagInfo(_td_c_if_50_434);
                                        _jettag_c_if_50_434.doStart(context, out);
                                        while (_jettag_c_if_50_434.okToProcessBody()) {
                                            out.write("String ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_50_677 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_677); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_50_677.setRuntimeParent(_jettag_c_if_50_434);
                                            _jettag_c_get_50_677.setTagInfo(_td_c_get_50_677);
                                            _jettag_c_get_50_677.doStart(context, out);
                                            _jettag_c_get_50_677.doEnd();
                                            _jettag_c_if_50_434.handleBodyContent(out);
                                        }
                                        _jettag_c_if_50_434.doEnd();
                                        RuntimeTagElement _jettag_c_if_50_719 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_719); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_50_719.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_if_50_719.setTagInfo(_td_c_if_50_719);
                                        _jettag_c_if_50_719.doStart(context, out);
                                        while (_jettag_c_if_50_719.okToProcessBody()) {
                                            out.write("Integer ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_50_882 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_882); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_50_882.setRuntimeParent(_jettag_c_if_50_719);
                                            _jettag_c_get_50_882.setTagInfo(_td_c_get_50_882);
                                            _jettag_c_get_50_882.doStart(context, out);
                                            _jettag_c_get_50_882.doEnd();
                                            _jettag_c_if_50_719.handleBodyContent(out);
                                        }
                                        _jettag_c_if_50_719.doEnd();
                                        RuntimeTagElement _jettag_c_if_50_924 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_924); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_50_924.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_if_50_924.setTagInfo(_td_c_if_50_924);
                                        _jettag_c_if_50_924.doStart(context, out);
                                        while (_jettag_c_if_50_924.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_50_1075 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_50_1075); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_50_1075.setRuntimeParent(_jettag_c_if_50_924);
                                            _jettag_java_import_50_1075.setTagInfo(_td_java_import_50_1075);
                                            _jettag_java_import_50_1075.doStart(context, out);
                                            JET2Writer _jettag_java_import_50_1075_saved_out = out;
                                            while (_jettag_java_import_50_1075.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_50_1075.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_50_1075_saved_out;
                                            _jettag_java_import_50_1075.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_50_1117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_1117); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_50_1117.setRuntimeParent(_jettag_c_if_50_924);
                                            _jettag_c_get_50_1117.setTagInfo(_td_c_get_50_1117);
                                            _jettag_c_get_50_1117.doStart(context, out);
                                            _jettag_c_get_50_1117.doEnd();
                                            _jettag_c_if_50_924.handleBodyContent(out);
                                        }
                                        _jettag_c_if_50_924.doEnd();
                                        RuntimeTagElement _jettag_c_if_50_1159 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_1159); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_50_1159.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_if_50_1159.setTagInfo(_td_c_if_50_1159);
                                        _jettag_c_if_50_1159.doStart(context, out);
                                        while (_jettag_c_if_50_1159.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_50_1310 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_50_1310); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_50_1310.setRuntimeParent(_jettag_c_if_50_1159);
                                            _jettag_java_import_50_1310.setTagInfo(_td_java_import_50_1310);
                                            _jettag_java_import_50_1310.doStart(context, out);
                                            JET2Writer _jettag_java_import_50_1310_saved_out = out;
                                            while (_jettag_java_import_50_1310.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_50_1310.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_50_1310_saved_out;
                                            _jettag_java_import_50_1310.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_50_1358 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_1358); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_50_1358.setRuntimeParent(_jettag_c_if_50_1159);
                                            _jettag_c_get_50_1358.setTagInfo(_td_c_get_50_1358);
                                            _jettag_c_get_50_1358.doStart(context, out);
                                            _jettag_c_get_50_1358.doEnd();
                                            _jettag_c_if_50_1159.handleBodyContent(out);
                                        }
                                        _jettag_c_if_50_1159.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_50_1400 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_1400); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_50_1400.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_setVariable_50_1400.setTagInfo(_td_c_setVariable_50_1400);
                                        _jettag_c_setVariable_50_1400.doStart(context, out);
                                        _jettag_c_setVariable_50_1400.doEnd();
                                        RuntimeTagElement _jettag_c_if_50_1449 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_1449); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_50_1449.setRuntimeParent(_jettag_c_iterate_50_367);
                                        _jettag_c_if_50_1449.setTagInfo(_td_c_if_50_1449);
                                        _jettag_c_if_50_1449.doStart(context, out);
                                        while (_jettag_c_if_50_1449.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_50_1449.handleBodyContent(out);
                                        }
                                        _jettag_c_if_50_1449.doEnd();
                                        _jettag_c_iterate_50_367.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_50_367.doEnd();
                                    out.write(",");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_50_1492 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1492); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_50_1492.setRuntimeParent(_jettag_c_if_49_4);
                                    _jettag_c_iterate_50_1492.setTagInfo(_td_c_iterate_50_1492);
                                    _jettag_c_iterate_50_1492.doStart(context, out);
                                    while (_jettag_c_iterate_50_1492.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_50_1557 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_50_1557); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_50_1557.setRuntimeParent(_jettag_c_iterate_50_1492);
                                        _jettag_c_choose_50_1557.setTagInfo(_td_c_choose_50_1557);
                                        _jettag_c_choose_50_1557.doStart(context, out);
                                        JET2Writer _jettag_c_choose_50_1557_saved_out = out;
                                        while (_jettag_c_choose_50_1557.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_50_1567 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_50_1567); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_50_1567.setRuntimeParent(_jettag_c_choose_50_1557);
                                            _jettag_c_when_50_1567.setTagInfo(_td_c_when_50_1567);
                                            _jettag_c_when_50_1567.doStart(context, out);
                                            JET2Writer _jettag_c_when_50_1567_saved_out = out;
                                            while (_jettag_c_when_50_1567.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_50_1567.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_50_1567_saved_out;
                                            _jettag_c_when_50_1567.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_50_1632 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_50_1632); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_50_1632.setRuntimeParent(_jettag_c_choose_50_1557);
                                            _jettag_c_otherwise_50_1632.setTagInfo(_td_c_otherwise_50_1632);
                                            _jettag_c_otherwise_50_1632.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_50_1632_saved_out = out;
                                            while (_jettag_c_otherwise_50_1632.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_iterate_50_1645 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1645); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_50_1645.setRuntimeParent(_jettag_c_otherwise_50_1632);
                                                _jettag_c_iterate_50_1645.setTagInfo(_td_c_iterate_50_1645);
                                                _jettag_c_iterate_50_1645.doStart(context, out);
                                                while (_jettag_c_iterate_50_1645.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_50_1697 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_1697); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_50_1697.setRuntimeParent(_jettag_c_iterate_50_1645);
                                                    _jettag_c_if_50_1697.setTagInfo(_td_c_if_50_1697);
                                                    _jettag_c_if_50_1697.doStart(context, out);
                                                    while (_jettag_c_if_50_1697.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_setVariable_50_1744 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_1744); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_50_1744.setRuntimeParent(_jettag_c_if_50_1697);
                                                        _jettag_c_setVariable_50_1744.setTagInfo(_td_c_setVariable_50_1744);
                                                        _jettag_c_setVariable_50_1744.doStart(context, out);
                                                        _jettag_c_setVariable_50_1744.doEnd();
                                                        RuntimeTagElement _jettag_c_iterate_50_1784 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1784); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_50_1784.setRuntimeParent(_jettag_c_if_50_1697);
                                                        _jettag_c_iterate_50_1784.setTagInfo(_td_c_iterate_50_1784);
                                                        _jettag_c_iterate_50_1784.doStart(context, out);
                                                        while (_jettag_c_iterate_50_1784.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_setVariable_50_1835 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_1835); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_50_1835.setRuntimeParent(_jettag_c_iterate_50_1784);
                                                            _jettag_c_setVariable_50_1835.setTagInfo(_td_c_setVariable_50_1835);
                                                            _jettag_c_setVariable_50_1835.doStart(context, out);
                                                            _jettag_c_setVariable_50_1835.doEnd();
                                                            _jettag_c_iterate_50_1784.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_50_1784.doEnd();
                                                        RuntimeTagElement _jettag_c_iterate_50_1895 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1895); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_50_1895.setRuntimeParent(_jettag_c_if_50_1697);
                                                        _jettag_c_iterate_50_1895.setTagInfo(_td_c_iterate_50_1895);
                                                        _jettag_c_iterate_50_1895.doStart(context, out);
                                                        while (_jettag_c_iterate_50_1895.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_if_50_1948 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_1948); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_50_1948.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_if_50_1948.setTagInfo(_td_c_if_50_1948);
                                                            _jettag_c_if_50_1948.doStart(context, out);
                                                            while (_jettag_c_if_50_1948.okToProcessBody()) {
                                                                out.write("String related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2143 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2143); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2143.setRuntimeParent(_jettag_c_if_50_1948);
                                                                _jettag_c_get_50_2143.setTagInfo(_td_c_get_50_2143);
                                                                _jettag_c_get_50_2143.doStart(context, out);
                                                                _jettag_c_get_50_2143.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2186 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2186); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2186.setRuntimeParent(_jettag_c_if_50_1948);
                                                                _jettag_c_get_50_2186.setTagInfo(_td_c_get_50_2186);
                                                                _jettag_c_get_50_2186.doStart(context, out);
                                                                _jettag_c_get_50_2186.doEnd();
                                                                _jettag_c_if_50_1948.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_50_1948.doEnd();
                                                            RuntimeTagElement _jettag_c_if_50_2221 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_2221); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_50_2221.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_if_50_2221.setTagInfo(_td_c_if_50_2221);
                                                            _jettag_c_if_50_2221.doStart(context, out);
                                                            while (_jettag_c_if_50_2221.okToProcessBody()) {
                                                                out.write("Integer related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2357 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2357); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2357.setRuntimeParent(_jettag_c_if_50_2221);
                                                                _jettag_c_get_50_2357.setTagInfo(_td_c_get_50_2357);
                                                                _jettag_c_get_50_2357.doStart(context, out);
                                                                _jettag_c_get_50_2357.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2400 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2400); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2400.setRuntimeParent(_jettag_c_if_50_2221);
                                                                _jettag_c_get_50_2400.setTagInfo(_td_c_get_50_2400);
                                                                _jettag_c_get_50_2400.doStart(context, out);
                                                                _jettag_c_get_50_2400.doEnd();
                                                                _jettag_c_if_50_2221.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_50_2221.doEnd();
                                                            RuntimeTagElement _jettag_c_if_50_2435 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_2435); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_50_2435.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_if_50_2435.setTagInfo(_td_c_if_50_2435);
                                                            _jettag_c_if_50_2435.doStart(context, out);
                                                            while (_jettag_c_if_50_2435.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_50_2551 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_50_2551); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_50_2551.setRuntimeParent(_jettag_c_if_50_2435);
                                                                _jettag_java_import_50_2551.setTagInfo(_td_java_import_50_2551);
                                                                _jettag_java_import_50_2551.doStart(context, out);
                                                                JET2Writer _jettag_java_import_50_2551_saved_out = out;
                                                                while (_jettag_java_import_50_2551.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.util.Date");  //$NON-NLS-1$        
                                                                    _jettag_java_import_50_2551.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_50_2551_saved_out;
                                                                _jettag_java_import_50_2551.doEnd();
                                                                out.write(" related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2601 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2601); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2601.setRuntimeParent(_jettag_c_if_50_2435);
                                                                _jettag_c_get_50_2601.setTagInfo(_td_c_get_50_2601);
                                                                _jettag_c_get_50_2601.doStart(context, out);
                                                                _jettag_c_get_50_2601.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2644 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2644); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2644.setRuntimeParent(_jettag_c_if_50_2435);
                                                                _jettag_c_get_50_2644.setTagInfo(_td_c_get_50_2644);
                                                                _jettag_c_get_50_2644.doStart(context, out);
                                                                _jettag_c_get_50_2644.doEnd();
                                                                _jettag_c_if_50_2435.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_50_2435.doEnd();
                                                            RuntimeTagElement _jettag_c_if_50_2679 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_2679); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_50_2679.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_if_50_2679.setTagInfo(_td_c_if_50_2679);
                                                            _jettag_c_if_50_2679.doStart(context, out);
                                                            while (_jettag_c_if_50_2679.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_50_2795 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_50_2795); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_50_2795.setRuntimeParent(_jettag_c_if_50_2679);
                                                                _jettag_java_import_50_2795.setTagInfo(_td_java_import_50_2795);
                                                                _jettag_java_import_50_2795.doStart(context, out);
                                                                JET2Writer _jettag_java_import_50_2795_saved_out = out;
                                                                while (_jettag_java_import_50_2795.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                                    _jettag_java_import_50_2795.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_50_2795_saved_out;
                                                                _jettag_java_import_50_2795.doEnd();
                                                                out.write(" related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2851 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2851); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2851.setRuntimeParent(_jettag_c_if_50_2679);
                                                                _jettag_c_get_50_2851.setTagInfo(_td_c_get_50_2851);
                                                                _jettag_c_get_50_2851.doStart(context, out);
                                                                _jettag_c_get_50_2851.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_50_2894 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_2894); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_50_2894.setRuntimeParent(_jettag_c_if_50_2679);
                                                                _jettag_c_get_50_2894.setTagInfo(_td_c_get_50_2894);
                                                                _jettag_c_get_50_2894.doStart(context, out);
                                                                _jettag_c_get_50_2894.doEnd();
                                                                _jettag_c_if_50_2679.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_50_2679.doEnd();
                                                            RuntimeTagElement _jettag_c_setVariable_50_2929 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_2929); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_50_2929.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_setVariable_50_2929.setTagInfo(_td_c_setVariable_50_2929);
                                                            _jettag_c_setVariable_50_2929.doStart(context, out);
                                                            _jettag_c_setVariable_50_2929.doEnd();
                                                            RuntimeTagElement _jettag_c_if_50_2980 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_2980); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_50_2980.setRuntimeParent(_jettag_c_iterate_50_1895);
                                                            _jettag_c_if_50_2980.setTagInfo(_td_c_if_50_2980);
                                                            _jettag_c_if_50_2980.doStart(context, out);
                                                            while (_jettag_c_if_50_2980.okToProcessBody()) {
                                                                out.write(",");  //$NON-NLS-1$        
                                                                _jettag_c_if_50_2980.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_50_2980.doEnd();
                                                            _jettag_c_iterate_50_1895.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_50_1895.doEnd();
                                                        _jettag_c_if_50_1697.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_50_1697.doEnd();
                                                    _jettag_c_iterate_50_1645.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_50_1645.doEnd();
                                                _jettag_c_otherwise_50_1632.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_50_1632_saved_out;
                                            _jettag_c_otherwise_50_1632.doEnd();
                                            _jettag_c_choose_50_1557.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_50_1557_saved_out;
                                        _jettag_c_choose_50_1557.doEnd();
                                        _jettag_c_iterate_50_1492.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_50_1492.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_49_4.handleBodyContent(out);
                                }
                                _jettag_c_if_49_4.doEnd();
                                RuntimeTagElement _jettag_c_if_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_52_4.setRuntimeParent(_jettag_c_if_48_4);
                                _jettag_c_if_52_4.setTagInfo(_td_c_if_52_4);
                                _jettag_c_if_52_4.doStart(context, out);
                                while (_jettag_c_if_52_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_iterate_53_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_53_4.setRuntimeParent(_jettag_c_if_52_4);
                                    _jettag_c_iterate_53_4.setTagInfo(_td_c_iterate_53_4);
                                    _jettag_c_iterate_53_4.doStart(context, out);
                                    while (_jettag_c_iterate_53_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_54_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_54_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_54_3.setRuntimeParent(_jettag_c_iterate_53_4);
                                        _jettag_c_if_54_3.setTagInfo(_td_c_if_54_3);
                                        _jettag_c_if_54_3.doStart(context, out);
                                        while (_jettag_c_if_54_3.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_55_3); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_55_3.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_setVariable_55_3.setTagInfo(_td_c_setVariable_55_3);
                                            _jettag_c_setVariable_55_3.doStart(context, out);
                                            _jettag_c_setVariable_55_3.doEnd();
                                            RuntimeTagElement _jettag_c_iterate_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_56_3); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_56_3.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_iterate_56_3.setTagInfo(_td_c_iterate_56_3);
                                            _jettag_c_iterate_56_3.doStart(context, out);
                                            while (_jettag_c_iterate_56_3.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_setVariable_57_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_3); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_57_3.setRuntimeParent(_jettag_c_iterate_56_3);
                                                _jettag_c_setVariable_57_3.setTagInfo(_td_c_setVariable_57_3);
                                                _jettag_c_setVariable_57_3.doStart(context, out);
                                                _jettag_c_setVariable_57_3.doEnd();
                                                _jettag_c_iterate_56_3.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_56_3.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_59_4.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_setVariable_59_4.setTagInfo(_td_c_setVariable_59_4);
                                            _jettag_c_setVariable_59_4.doStart(context, out);
                                            _jettag_c_setVariable_59_4.doEnd();
                                            out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_60_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_11); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_60_11.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_get_60_11.setTagInfo(_td_c_get_60_11);
                                            _jettag_c_get_60_11.doStart(context, out);
                                            _jettag_c_get_60_11.doEnd();
                                            out.write(" delete");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_60_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_68); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_60_68.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_get_60_68.setTagInfo(_td_c_get_60_68);
                                            _jettag_c_get_60_68.doStart(context, out);
                                            _jettag_c_get_60_68.doEnd();
                                            RuntimeTagElement _jettag_c_get_60_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_118); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_60_118.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_get_60_118.setTagInfo(_td_c_get_60_118);
                                            _jettag_c_get_60_118.doStart(context, out);
                                            _jettag_c_get_60_118.doEnd();
                                            out.write("s(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_60_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_171); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_60_171.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_iterate_60_171.setTagInfo(_td_c_iterate_60_171);
                                            _jettag_c_iterate_60_171.doStart(context, out);
                                            while (_jettag_c_iterate_60_171.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_if_60_238 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_238); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_238.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_if_60_238.setTagInfo(_td_c_if_60_238);
                                                _jettag_c_if_60_238.doStart(context, out);
                                                while (_jettag_c_if_60_238.okToProcessBody()) {
                                                    out.write("String ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_481 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_481); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_481.setRuntimeParent(_jettag_c_if_60_238);
                                                    _jettag_c_get_60_481.setTagInfo(_td_c_get_60_481);
                                                    _jettag_c_get_60_481.doStart(context, out);
                                                    _jettag_c_get_60_481.doEnd();
                                                    _jettag_c_if_60_238.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_238.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_523 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_523); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_523.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_if_60_523.setTagInfo(_td_c_if_60_523);
                                                _jettag_c_if_60_523.doStart(context, out);
                                                while (_jettag_c_if_60_523.okToProcessBody()) {
                                                    out.write("Integer ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_686 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_686); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_686.setRuntimeParent(_jettag_c_if_60_523);
                                                    _jettag_c_get_60_686.setTagInfo(_td_c_get_60_686);
                                                    _jettag_c_get_60_686.doStart(context, out);
                                                    _jettag_c_get_60_686.doEnd();
                                                    _jettag_c_if_60_523.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_523.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_728 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_728); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_728.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_if_60_728.setTagInfo(_td_c_if_60_728);
                                                _jettag_c_if_60_728.doStart(context, out);
                                                while (_jettag_c_if_60_728.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_60_879 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_879); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_60_879.setRuntimeParent(_jettag_c_if_60_728);
                                                    _jettag_java_import_60_879.setTagInfo(_td_java_import_60_879);
                                                    _jettag_java_import_60_879.doStart(context, out);
                                                    JET2Writer _jettag_java_import_60_879_saved_out = out;
                                                    while (_jettag_java_import_60_879.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                                        _jettag_java_import_60_879.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_60_879_saved_out;
                                                    _jettag_java_import_60_879.doEnd();
                                                    out.write(" ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_921 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_921); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_921.setRuntimeParent(_jettag_c_if_60_728);
                                                    _jettag_c_get_60_921.setTagInfo(_td_c_get_60_921);
                                                    _jettag_c_get_60_921.doStart(context, out);
                                                    _jettag_c_get_60_921.doEnd();
                                                    _jettag_c_if_60_728.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_728.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_963 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_963); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_963.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_if_60_963.setTagInfo(_td_c_if_60_963);
                                                _jettag_c_if_60_963.doStart(context, out);
                                                while (_jettag_c_if_60_963.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_60_1114 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_1114); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_60_1114.setRuntimeParent(_jettag_c_if_60_963);
                                                    _jettag_java_import_60_1114.setTagInfo(_td_java_import_60_1114);
                                                    _jettag_java_import_60_1114.doStart(context, out);
                                                    JET2Writer _jettag_java_import_60_1114_saved_out = out;
                                                    while (_jettag_java_import_60_1114.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                        _jettag_java_import_60_1114.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_60_1114_saved_out;
                                                    _jettag_java_import_60_1114.doEnd();
                                                    out.write(" ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_1162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1162); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_1162.setRuntimeParent(_jettag_c_if_60_963);
                                                    _jettag_c_get_60_1162.setTagInfo(_td_c_get_60_1162);
                                                    _jettag_c_get_60_1162.doStart(context, out);
                                                    _jettag_c_get_60_1162.doEnd();
                                                    _jettag_c_if_60_963.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_963.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_60_1204 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_1204); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_60_1204.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_setVariable_60_1204.setTagInfo(_td_c_setVariable_60_1204);
                                                _jettag_c_setVariable_60_1204.doStart(context, out);
                                                _jettag_c_setVariable_60_1204.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_1253 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1253); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_1253.setRuntimeParent(_jettag_c_iterate_60_171);
                                                _jettag_c_if_60_1253.setTagInfo(_td_c_if_60_1253);
                                                _jettag_c_if_60_1253.doStart(context, out);
                                                while (_jettag_c_if_60_1253.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_60_1253.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_1253.doEnd();
                                                _jettag_c_iterate_60_171.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_60_171.doEnd();
                                            out.write(", ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_60_1297 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_1297); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_60_1297.setRuntimeParent(_jettag_c_if_54_3);
                                            _jettag_c_iterate_60_1297.setTagInfo(_td_c_iterate_60_1297);
                                            _jettag_c_iterate_60_1297.doStart(context, out);
                                            while (_jettag_c_iterate_60_1297.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_if_60_1353 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1353); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_1353.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_if_60_1353.setTagInfo(_td_c_if_60_1353);
                                                _jettag_c_if_60_1353.doStart(context, out);
                                                while (_jettag_c_if_60_1353.okToProcessBody()) {
                                                    out.write("String related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_1572 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1572); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_1572.setRuntimeParent(_jettag_c_if_60_1353);
                                                    _jettag_c_get_60_1572.setTagInfo(_td_c_get_60_1572);
                                                    _jettag_c_get_60_1572.doStart(context, out);
                                                    _jettag_c_get_60_1572.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_1609 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1609); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_1609.setRuntimeParent(_jettag_c_if_60_1353);
                                                    _jettag_c_get_60_1609.setTagInfo(_td_c_get_60_1609);
                                                    _jettag_c_get_60_1609.doStart(context, out);
                                                    _jettag_c_get_60_1609.doEnd();
                                                    _jettag_c_if_60_1353.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_1353.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_1647 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1647); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_1647.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_if_60_1647.setTagInfo(_td_c_if_60_1647);
                                                _jettag_c_if_60_1647.doStart(context, out);
                                                while (_jettag_c_if_60_1647.okToProcessBody()) {
                                                    out.write("Integer related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_1798 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1798); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_1798.setRuntimeParent(_jettag_c_if_60_1647);
                                                    _jettag_c_get_60_1798.setTagInfo(_td_c_get_60_1798);
                                                    _jettag_c_get_60_1798.doStart(context, out);
                                                    _jettag_c_get_60_1798.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_1835 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1835); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_1835.setRuntimeParent(_jettag_c_if_60_1647);
                                                    _jettag_c_get_60_1835.setTagInfo(_td_c_get_60_1835);
                                                    _jettag_c_get_60_1835.doStart(context, out);
                                                    _jettag_c_get_60_1835.doEnd();
                                                    _jettag_c_if_60_1647.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_1647.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_1873 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1873); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_1873.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_if_60_1873.setTagInfo(_td_c_if_60_1873);
                                                _jettag_c_if_60_1873.doStart(context, out);
                                                while (_jettag_c_if_60_1873.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_60_2004 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_2004); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_60_2004.setRuntimeParent(_jettag_c_if_60_1873);
                                                    _jettag_java_import_60_2004.setTagInfo(_td_java_import_60_2004);
                                                    _jettag_java_import_60_2004.doStart(context, out);
                                                    JET2Writer _jettag_java_import_60_2004_saved_out = out;
                                                    while (_jettag_java_import_60_2004.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                                        _jettag_java_import_60_2004.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_60_2004_saved_out;
                                                    _jettag_java_import_60_2004.doEnd();
                                                    out.write(" related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_2054 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_2054); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_2054.setRuntimeParent(_jettag_c_if_60_1873);
                                                    _jettag_c_get_60_2054.setTagInfo(_td_c_get_60_2054);
                                                    _jettag_c_get_60_2054.doStart(context, out);
                                                    _jettag_c_get_60_2054.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_2091 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_2091); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_2091.setRuntimeParent(_jettag_c_if_60_1873);
                                                    _jettag_c_get_60_2091.setTagInfo(_td_c_get_60_2091);
                                                    _jettag_c_get_60_2091.doStart(context, out);
                                                    _jettag_c_get_60_2091.doEnd();
                                                    _jettag_c_if_60_1873.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_1873.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_2129 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_2129); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_2129.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_if_60_2129.setTagInfo(_td_c_if_60_2129);
                                                _jettag_c_if_60_2129.doStart(context, out);
                                                while (_jettag_c_if_60_2129.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_60_2260 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_2260); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_60_2260.setRuntimeParent(_jettag_c_if_60_2129);
                                                    _jettag_java_import_60_2260.setTagInfo(_td_java_import_60_2260);
                                                    _jettag_java_import_60_2260.doStart(context, out);
                                                    JET2Writer _jettag_java_import_60_2260_saved_out = out;
                                                    while (_jettag_java_import_60_2260.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                        _jettag_java_import_60_2260.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_60_2260_saved_out;
                                                    _jettag_java_import_60_2260.doEnd();
                                                    out.write(" related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_2316 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_2316); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_2316.setRuntimeParent(_jettag_c_if_60_2129);
                                                    _jettag_c_get_60_2316.setTagInfo(_td_c_get_60_2316);
                                                    _jettag_c_get_60_2316.doStart(context, out);
                                                    _jettag_c_get_60_2316.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_60_2353 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_2353); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_60_2353.setRuntimeParent(_jettag_c_if_60_2129);
                                                    _jettag_c_get_60_2353.setTagInfo(_td_c_get_60_2353);
                                                    _jettag_c_get_60_2353.doStart(context, out);
                                                    _jettag_c_get_60_2353.doEnd();
                                                    _jettag_c_if_60_2129.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_2129.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_60_2391 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_2391); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_60_2391.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_setVariable_60_2391.setTagInfo(_td_c_setVariable_60_2391);
                                                _jettag_c_setVariable_60_2391.doStart(context, out);
                                                _jettag_c_setVariable_60_2391.doEnd();
                                                RuntimeTagElement _jettag_c_if_60_2444 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_2444); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_60_2444.setRuntimeParent(_jettag_c_iterate_60_1297);
                                                _jettag_c_if_60_2444.setTagInfo(_td_c_if_60_2444);
                                                _jettag_c_if_60_2444.doStart(context, out);
                                                while (_jettag_c_if_60_2444.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_60_2444.handleBodyContent(out);
                                                }
                                                _jettag_c_if_60_2444.doEnd();
                                                _jettag_c_iterate_60_1297.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_60_1297.doEnd();
                                            out.write(");");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_54_3.handleBodyContent(out);
                                        }
                                        _jettag_c_if_54_3.doEnd();
                                        _jettag_c_iterate_53_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_53_4.doEnd();
                                    _jettag_c_if_52_4.handleBodyContent(out);
                                }
                                _jettag_c_if_52_4.doEnd();
                                _jettag_c_if_48_4.handleBodyContent(out);
                            }
                            _jettag_c_if_48_4.doEnd();
                            RuntimeTagElement _jettag_c_if_65_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_65_4.setRuntimeParent(_jettag_c_if_39_3);
                            _jettag_c_if_65_4.setTagInfo(_td_c_if_65_4);
                            _jettag_c_if_65_4.doStart(context, out);
                            while (_jettag_c_if_65_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_iterate_66_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_66_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_66_4.setRuntimeParent(_jettag_c_if_65_4);
                                _jettag_c_iterate_66_4.setTagInfo(_td_c_iterate_66_4);
                                _jettag_c_iterate_66_4.doStart(context, out);
                                while (_jettag_c_iterate_66_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_67_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_67_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_67_3.setRuntimeParent(_jettag_c_iterate_66_4);
                                    _jettag_c_if_67_3.setTagInfo(_td_c_if_67_3);
                                    _jettag_c_if_67_3.doStart(context, out);
                                    while (_jettag_c_if_67_3.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_68_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_68_3.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_setVariable_68_3.setTagInfo(_td_c_setVariable_68_3);
                                        _jettag_c_setVariable_68_3.doStart(context, out);
                                        _jettag_c_setVariable_68_3.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_69_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_69_3.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_iterate_69_3.setTagInfo(_td_c_iterate_69_3);
                                        _jettag_c_iterate_69_3.doStart(context, out);
                                        while (_jettag_c_iterate_69_3.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_70_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_70_3); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_70_3.setRuntimeParent(_jettag_c_iterate_69_3);
                                            _jettag_c_setVariable_70_3.setTagInfo(_td_c_setVariable_70_3);
                                            _jettag_c_setVariable_70_3.doStart(context, out);
                                            _jettag_c_setVariable_70_3.doEnd();
                                            _jettag_c_iterate_69_3.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_69_3.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_72_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_72_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_72_4.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_setVariable_72_4.setTagInfo(_td_c_setVariable_72_4);
                                        _jettag_c_setVariable_72_4.doStart(context, out);
                                        _jettag_c_setVariable_72_4.doEnd();
                                        out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_73_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_11); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_73_11.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_get_73_11.setTagInfo(_td_c_get_73_11);
                                        _jettag_c_get_73_11.doStart(context, out);
                                        _jettag_c_get_73_11.doEnd();
                                        out.write(" delete");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_73_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_68); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_73_68.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_get_73_68.setTagInfo(_td_c_get_73_68);
                                        _jettag_c_get_73_68.doStart(context, out);
                                        _jettag_c_get_73_68.doEnd();
                                        RuntimeTagElement _jettag_c_get_73_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_118); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_73_118.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_get_73_118.setTagInfo(_td_c_get_73_118);
                                        _jettag_c_get_73_118.doStart(context, out);
                                        _jettag_c_get_73_118.doEnd();
                                        out.write("s(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_73_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_171); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_73_171.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_iterate_73_171.setTagInfo(_td_c_iterate_73_171);
                                        _jettag_c_iterate_73_171.doStart(context, out);
                                        while (_jettag_c_iterate_73_171.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_if_73_238 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_238); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_238.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_if_73_238.setTagInfo(_td_c_if_73_238);
                                            _jettag_c_if_73_238.doStart(context, out);
                                            while (_jettag_c_if_73_238.okToProcessBody()) {
                                                out.write("String ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_481 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_481); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_481.setRuntimeParent(_jettag_c_if_73_238);
                                                _jettag_c_get_73_481.setTagInfo(_td_c_get_73_481);
                                                _jettag_c_get_73_481.doStart(context, out);
                                                _jettag_c_get_73_481.doEnd();
                                                _jettag_c_if_73_238.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_238.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_523 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_523); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_523.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_if_73_523.setTagInfo(_td_c_if_73_523);
                                            _jettag_c_if_73_523.doStart(context, out);
                                            while (_jettag_c_if_73_523.okToProcessBody()) {
                                                out.write("Integer ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_686 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_686); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_686.setRuntimeParent(_jettag_c_if_73_523);
                                                _jettag_c_get_73_686.setTagInfo(_td_c_get_73_686);
                                                _jettag_c_get_73_686.doStart(context, out);
                                                _jettag_c_get_73_686.doEnd();
                                                _jettag_c_if_73_523.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_523.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_728 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_728); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_728.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_if_73_728.setTagInfo(_td_c_if_73_728);
                                            _jettag_c_if_73_728.doStart(context, out);
                                            while (_jettag_c_if_73_728.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_73_879 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_73_879); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_73_879.setRuntimeParent(_jettag_c_if_73_728);
                                                _jettag_java_import_73_879.setTagInfo(_td_java_import_73_879);
                                                _jettag_java_import_73_879.doStart(context, out);
                                                JET2Writer _jettag_java_import_73_879_saved_out = out;
                                                while (_jettag_java_import_73_879.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("java.util.Date");  //$NON-NLS-1$        
                                                    _jettag_java_import_73_879.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_73_879_saved_out;
                                                _jettag_java_import_73_879.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_921 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_921); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_921.setRuntimeParent(_jettag_c_if_73_728);
                                                _jettag_c_get_73_921.setTagInfo(_td_c_get_73_921);
                                                _jettag_c_get_73_921.doStart(context, out);
                                                _jettag_c_get_73_921.doEnd();
                                                _jettag_c_if_73_728.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_728.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_963 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_963); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_963.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_if_73_963.setTagInfo(_td_c_if_73_963);
                                            _jettag_c_if_73_963.doStart(context, out);
                                            while (_jettag_c_if_73_963.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_73_1114 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_73_1114); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_73_1114.setRuntimeParent(_jettag_c_if_73_963);
                                                _jettag_java_import_73_1114.setTagInfo(_td_java_import_73_1114);
                                                _jettag_java_import_73_1114.doStart(context, out);
                                                JET2Writer _jettag_java_import_73_1114_saved_out = out;
                                                while (_jettag_java_import_73_1114.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                    _jettag_java_import_73_1114.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_73_1114_saved_out;
                                                _jettag_java_import_73_1114.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_1162 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_1162); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_1162.setRuntimeParent(_jettag_c_if_73_963);
                                                _jettag_c_get_73_1162.setTagInfo(_td_c_get_73_1162);
                                                _jettag_c_get_73_1162.doStart(context, out);
                                                _jettag_c_get_73_1162.doEnd();
                                                _jettag_c_if_73_963.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_963.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_73_1204 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_73_1204); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_73_1204.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_setVariable_73_1204.setTagInfo(_td_c_setVariable_73_1204);
                                            _jettag_c_setVariable_73_1204.doStart(context, out);
                                            _jettag_c_setVariable_73_1204.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_1253 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_1253); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_1253.setRuntimeParent(_jettag_c_iterate_73_171);
                                            _jettag_c_if_73_1253.setTagInfo(_td_c_if_73_1253);
                                            _jettag_c_if_73_1253.doStart(context, out);
                                            while (_jettag_c_if_73_1253.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_73_1253.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_1253.doEnd();
                                            _jettag_c_iterate_73_171.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_73_171.doEnd();
                                        out.write(", ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_iterate_73_1297 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_73_1297); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_73_1297.setRuntimeParent(_jettag_c_if_67_3);
                                        _jettag_c_iterate_73_1297.setTagInfo(_td_c_iterate_73_1297);
                                        _jettag_c_iterate_73_1297.doStart(context, out);
                                        while (_jettag_c_iterate_73_1297.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_if_73_1353 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_1353); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_1353.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_if_73_1353.setTagInfo(_td_c_if_73_1353);
                                            _jettag_c_if_73_1353.doStart(context, out);
                                            while (_jettag_c_if_73_1353.okToProcessBody()) {
                                                out.write("String related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_1572 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_1572); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_1572.setRuntimeParent(_jettag_c_if_73_1353);
                                                _jettag_c_get_73_1572.setTagInfo(_td_c_get_73_1572);
                                                _jettag_c_get_73_1572.doStart(context, out);
                                                _jettag_c_get_73_1572.doEnd();
                                                out.write("s_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_1609 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_1609); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_1609.setRuntimeParent(_jettag_c_if_73_1353);
                                                _jettag_c_get_73_1609.setTagInfo(_td_c_get_73_1609);
                                                _jettag_c_get_73_1609.doStart(context, out);
                                                _jettag_c_get_73_1609.doEnd();
                                                _jettag_c_if_73_1353.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_1353.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_1647 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_1647); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_1647.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_if_73_1647.setTagInfo(_td_c_if_73_1647);
                                            _jettag_c_if_73_1647.doStart(context, out);
                                            while (_jettag_c_if_73_1647.okToProcessBody()) {
                                                out.write("Integer related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_1798 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_1798); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_1798.setRuntimeParent(_jettag_c_if_73_1647);
                                                _jettag_c_get_73_1798.setTagInfo(_td_c_get_73_1798);
                                                _jettag_c_get_73_1798.doStart(context, out);
                                                _jettag_c_get_73_1798.doEnd();
                                                out.write("s_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_1835 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_1835); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_1835.setRuntimeParent(_jettag_c_if_73_1647);
                                                _jettag_c_get_73_1835.setTagInfo(_td_c_get_73_1835);
                                                _jettag_c_get_73_1835.doStart(context, out);
                                                _jettag_c_get_73_1835.doEnd();
                                                _jettag_c_if_73_1647.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_1647.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_1873 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_1873); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_1873.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_if_73_1873.setTagInfo(_td_c_if_73_1873);
                                            _jettag_c_if_73_1873.doStart(context, out);
                                            while (_jettag_c_if_73_1873.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_73_2004 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_73_2004); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_73_2004.setRuntimeParent(_jettag_c_if_73_1873);
                                                _jettag_java_import_73_2004.setTagInfo(_td_java_import_73_2004);
                                                _jettag_java_import_73_2004.doStart(context, out);
                                                JET2Writer _jettag_java_import_73_2004_saved_out = out;
                                                while (_jettag_java_import_73_2004.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("java.util.Date");  //$NON-NLS-1$        
                                                    _jettag_java_import_73_2004.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_73_2004_saved_out;
                                                _jettag_java_import_73_2004.doEnd();
                                                out.write(" related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_2054 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_2054); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_2054.setRuntimeParent(_jettag_c_if_73_1873);
                                                _jettag_c_get_73_2054.setTagInfo(_td_c_get_73_2054);
                                                _jettag_c_get_73_2054.doStart(context, out);
                                                _jettag_c_get_73_2054.doEnd();
                                                out.write("s_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_2091 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_2091); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_2091.setRuntimeParent(_jettag_c_if_73_1873);
                                                _jettag_c_get_73_2091.setTagInfo(_td_c_get_73_2091);
                                                _jettag_c_get_73_2091.doStart(context, out);
                                                _jettag_c_get_73_2091.doEnd();
                                                _jettag_c_if_73_1873.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_1873.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_2129 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_2129); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_2129.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_if_73_2129.setTagInfo(_td_c_if_73_2129);
                                            _jettag_c_if_73_2129.doStart(context, out);
                                            while (_jettag_c_if_73_2129.okToProcessBody()) {
                                                RuntimeTagElement _jettag_java_import_73_2260 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_73_2260); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_java_import_73_2260.setRuntimeParent(_jettag_c_if_73_2129);
                                                _jettag_java_import_73_2260.setTagInfo(_td_java_import_73_2260);
                                                _jettag_java_import_73_2260.doStart(context, out);
                                                JET2Writer _jettag_java_import_73_2260_saved_out = out;
                                                while (_jettag_java_import_73_2260.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                    _jettag_java_import_73_2260.handleBodyContent(out);
                                                }
                                                out = _jettag_java_import_73_2260_saved_out;
                                                _jettag_java_import_73_2260.doEnd();
                                                out.write(" related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_2316 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_2316); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_2316.setRuntimeParent(_jettag_c_if_73_2129);
                                                _jettag_c_get_73_2316.setTagInfo(_td_c_get_73_2316);
                                                _jettag_c_get_73_2316.doStart(context, out);
                                                _jettag_c_get_73_2316.doEnd();
                                                out.write("s_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_73_2353 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_2353); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_73_2353.setRuntimeParent(_jettag_c_if_73_2129);
                                                _jettag_c_get_73_2353.setTagInfo(_td_c_get_73_2353);
                                                _jettag_c_get_73_2353.doStart(context, out);
                                                _jettag_c_get_73_2353.doEnd();
                                                _jettag_c_if_73_2129.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_2129.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_73_2391 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_73_2391); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_73_2391.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_setVariable_73_2391.setTagInfo(_td_c_setVariable_73_2391);
                                            _jettag_c_setVariable_73_2391.doStart(context, out);
                                            _jettag_c_setVariable_73_2391.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_2444 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_2444); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_2444.setRuntimeParent(_jettag_c_iterate_73_1297);
                                            _jettag_c_if_73_2444.setTagInfo(_td_c_if_73_2444);
                                            _jettag_c_if_73_2444.doStart(context, out);
                                            while (_jettag_c_if_73_2444.okToProcessBody()) {
                                                out.write(",");  //$NON-NLS-1$        
                                                _jettag_c_if_73_2444.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_2444.doEnd();
                                            _jettag_c_iterate_73_1297.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_73_1297.doEnd();
                                        out.write(");");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_67_3.handleBodyContent(out);
                                    }
                                    _jettag_c_if_67_3.doEnd();
                                    _jettag_c_iterate_66_4.handleBodyContent(out);
                                }
                                _jettag_c_iterate_66_4.doEnd();
                                _jettag_c_if_65_4.handleBodyContent(out);
                            }
                            _jettag_c_if_65_4.doEnd();
                            _jettag_c_if_39_3.handleBodyContent(out);
                        }
                        _jettag_c_if_39_3.doEnd();
                        _jettag_c_iterate_38_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_38_2.doEnd();
                    _jettag_c_iterate_37_2.handleBodyContent(out);
                }
                _jettag_c_iterate_37_2.doEnd();
                _jettag_c_otherwise_13_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_13_2_saved_out;
            _jettag_c_otherwise_13_2.doEnd();
            _jettag_c_choose_9_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_9_2_saved_out;
        _jettag_c_choose_9_2.doEnd();
    }
}
