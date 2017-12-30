package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_saveEntity_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_saveEntity_1() {
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
    private static final TagInfo _td_c_get_11_18 = new TagInfo("c:get", //$NON-NLS-1$
            11, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_69 = new TagInfo("c:get", //$NON-NLS-1$
            11, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_120 = new TagInfo("c:get", //$NON-NLS-1$
            11, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_13_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            13, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_18 = new TagInfo("c:get", //$NON-NLS-1$
            14, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_69 = new TagInfo("c:get", //$NON-NLS-1$
            14, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_120 = new TagInfo("c:get", //$NON-NLS-1$
            14, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_c_iterate_23_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_3 = new TagInfo("c:if", //$NON-NLS-1$
            24, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_9 = new TagInfo("c:get", //$NON-NLS-1$
            29, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
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
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_173 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 173,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_240 = new TagInfo("c:if", //$NON-NLS-1$
            29, 240,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_483 = new TagInfo("c:get", //$NON-NLS-1$
            29, 483,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_525 = new TagInfo("c:if", //$NON-NLS-1$
            29, 525,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_688 = new TagInfo("c:get", //$NON-NLS-1$
            29, 688,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_730 = new TagInfo("c:if", //$NON-NLS-1$
            29, 730,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_881 = new TagInfo("java:import", //$NON-NLS-1$
            29, 881,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_923 = new TagInfo("c:get", //$NON-NLS-1$
            29, 923,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_965 = new TagInfo("c:if", //$NON-NLS-1$
            29, 965,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_1116 = new TagInfo("java:import", //$NON-NLS-1$
            29, 1116,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_29_1164 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1164,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_1206 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 1206,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1255 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1255,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1299 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1299,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_1366 = new TagInfo("c:get", //$NON-NLS-1$
            29, 1366,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_34_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            34, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_35_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            35, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_37_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_39_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            39, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_3 = new TagInfo("c:if", //$NON-NLS-1$
            40, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_44_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            44, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_46_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            46, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_4 = new TagInfo("c:if", //$NON-NLS-1$
            49, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_4 = new TagInfo("c:if", //$NON-NLS-1$
            50, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_11 = new TagInfo("c:get", //$NON-NLS-1$
            51, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_66 = new TagInfo("c:get", //$NON-NLS-1$
            51, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_116 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 116,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_51_181 = new TagInfo("c:choose", //$NON-NLS-1$
            51, 181,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_51_191 = new TagInfo("c:when", //$NON-NLS-1$
            51, 191,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_51_256 = new TagInfo("c:otherwise", //$NON-NLS-1$
            51, 256,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_269 = new TagInfo("c:get", //$NON-NLS-1$
            51, 269,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_365 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 365,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_432 = new TagInfo("c:if", //$NON-NLS-1$
            51, 432,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_675 = new TagInfo("c:get", //$NON-NLS-1$
            51, 675,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_717 = new TagInfo("c:if", //$NON-NLS-1$
            51, 717,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_880 = new TagInfo("c:get", //$NON-NLS-1$
            51, 880,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_922 = new TagInfo("c:if", //$NON-NLS-1$
            51, 922,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_51_1073 = new TagInfo("java:import", //$NON-NLS-1$
            51, 1073,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_1115 = new TagInfo("c:get", //$NON-NLS-1$
            51, 1115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_1157 = new TagInfo("c:if", //$NON-NLS-1$
            51, 1157,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_51_1308 = new TagInfo("java:import", //$NON-NLS-1$
            51, 1308,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_1356 = new TagInfo("c:get", //$NON-NLS-1$
            51, 1356,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_51_1398 = new TagInfo("c:setVariable", //$NON-NLS-1$
            51, 1398,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_1447 = new TagInfo("c:if", //$NON-NLS-1$
            51, 1447,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_1491 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 1491,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_51_1556 = new TagInfo("c:choose", //$NON-NLS-1$
            51, 1556,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_51_1566 = new TagInfo("c:when", //$NON-NLS-1$
            51, 1566,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_51_1631 = new TagInfo("c:otherwise", //$NON-NLS-1$
            51, 1631,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_1644 = new TagInfo("c:get", //$NON-NLS-1$
            51, 1644,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_51_1747 = new TagInfo("c:iterate", //$NON-NLS-1$
            51, 1747,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_51_1812 = new TagInfo("c:choose", //$NON-NLS-1$
            51, 1812,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_51_1822 = new TagInfo("c:when", //$NON-NLS-1$
            51, 1822,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_51_1887 = new TagInfo("c:otherwise", //$NON-NLS-1$
            51, 1887,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_1900 = new TagInfo("c:get", //$NON-NLS-1$
            51, 1900,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_4 = new TagInfo("c:if", //$NON-NLS-1$
            53, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_11 = new TagInfo("c:get", //$NON-NLS-1$
            55, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_66 = new TagInfo("c:get", //$NON-NLS-1$
            55, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_116 = new TagInfo("c:get", //$NON-NLS-1$
            55, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_169 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 169,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_236 = new TagInfo("c:if", //$NON-NLS-1$
            55, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_479 = new TagInfo("c:get", //$NON-NLS-1$
            55, 479,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_521 = new TagInfo("c:if", //$NON-NLS-1$
            55, 521,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_684 = new TagInfo("c:get", //$NON-NLS-1$
            55, 684,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_726 = new TagInfo("c:if", //$NON-NLS-1$
            55, 726,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_55_877 = new TagInfo("java:import", //$NON-NLS-1$
            55, 877,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_55_919 = new TagInfo("c:get", //$NON-NLS-1$
            55, 919,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_961 = new TagInfo("c:if", //$NON-NLS-1$
            55, 961,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_55_1112 = new TagInfo("java:import", //$NON-NLS-1$
            55, 1112,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_55_1160 = new TagInfo("c:get", //$NON-NLS-1$
            55, 1160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_55_1202 = new TagInfo("c:setVariable", //$NON-NLS-1$
            55, 1202,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_1251 = new TagInfo("c:if", //$NON-NLS-1$
            55, 1251,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_1295 = new TagInfo("c:get", //$NON-NLS-1$
            55, 1295,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_55_1355 = new TagInfo("c:get", //$NON-NLS-1$
            55, 1355,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_4 = new TagInfo("c:if", //$NON-NLS-1$
            58, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>0", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_60_66 = new TagInfo("c:get", //$NON-NLS-1$
            60, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_116 = new TagInfo("c:get", //$NON-NLS-1$
            60, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_169 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 169,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_236 = new TagInfo("c:if", //$NON-NLS-1$
            60, 236,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_479 = new TagInfo("c:get", //$NON-NLS-1$
            60, 479,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_521 = new TagInfo("c:if", //$NON-NLS-1$
            60, 521,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_684 = new TagInfo("c:get", //$NON-NLS-1$
            60, 684,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_726 = new TagInfo("c:if", //$NON-NLS-1$
            60, 726,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_877 = new TagInfo("java:import", //$NON-NLS-1$
            60, 877,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_919 = new TagInfo("c:get", //$NON-NLS-1$
            60, 919,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_961 = new TagInfo("c:if", //$NON-NLS-1$
            60, 961,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_1112 = new TagInfo("java:import", //$NON-NLS-1$
            60, 1112,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_1160 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_1202 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 1202,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1251 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1251,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1295 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1295,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_1355 = new TagInfo("c:get", //$NON-NLS-1$
            60, 1355,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
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
                out.write("\tpublic void save");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_18.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_18.setTagInfo(_td_c_get_11_18);
                _jettag_c_get_11_18.doStart(context, out);
                _jettag_c_get_11_18.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_69.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_69.setTagInfo(_td_c_get_11_69);
                _jettag_c_get_11_69.doStart(context, out);
                _jettag_c_get_11_69.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_120.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_11_120.setTagInfo(_td_c_get_11_120);
                _jettag_c_get_11_120.doStart(context, out);
                _jettag_c_get_11_120.doEnd();
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
                out.write("\tpublic void save");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_18.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_18.setTagInfo(_td_c_get_14_18);
                _jettag_c_get_14_18.doStart(context, out);
                _jettag_c_get_14_18.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_69.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_69.setTagInfo(_td_c_get_14_69);
                _jettag_c_get_14_69.doStart(context, out);
                _jettag_c_get_14_69.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_120.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_get_14_120.setTagInfo(_td_c_get_14_120);
                _jettag_c_get_14_120.doStart(context, out);
                _jettag_c_get_14_120.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
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
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_iterate_23_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_23_3.setRuntimeParent(_jettag_c_iterate_16_2);
                    _jettag_c_iterate_23_3.setTagInfo(_td_c_iterate_23_3);
                    _jettag_c_iterate_23_3.doStart(context, out);
                    while (_jettag_c_iterate_23_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_24_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_24_3.setRuntimeParent(_jettag_c_iterate_23_3);
                        _jettag_c_if_24_3.setTagInfo(_td_c_if_24_3);
                        _jettag_c_if_24_3.doStart(context, out);
                        while (_jettag_c_if_24_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_25_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_25_3.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_setVariable_25_3.setTagInfo(_td_c_setVariable_25_3);
                            _jettag_c_setVariable_25_3.doStart(context, out);
                            _jettag_c_setVariable_25_3.doEnd();
                            RuntimeTagElement _jettag_c_iterate_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_26_3.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_iterate_26_3.setTagInfo(_td_c_iterate_26_3);
                            _jettag_c_iterate_26_3.doStart(context, out);
                            while (_jettag_c_iterate_26_3.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_3); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_27_3.setRuntimeParent(_jettag_c_iterate_26_3);
                                _jettag_c_setVariable_27_3.setTagInfo(_td_c_setVariable_27_3);
                                _jettag_c_setVariable_27_3.doStart(context, out);
                                _jettag_c_setVariable_27_3.doEnd();
                                _jettag_c_iterate_26_3.handleBodyContent(out);
                            }
                            _jettag_c_iterate_26_3.doEnd();
                            out.write("\tpublic ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_9); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_9.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_get_29_9.setTagInfo(_td_c_get_29_9);
                            _jettag_c_get_29_9.doStart(context, out);
                            _jettag_c_get_29_9.doEnd();
                            out.write(" save");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_64); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_64.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_get_29_64.setTagInfo(_td_c_get_29_64);
                            _jettag_c_get_29_64.doStart(context, out);
                            _jettag_c_get_29_64.doEnd();
                            RuntimeTagElement _jettag_c_get_29_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_114); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_114.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_get_29_114.setTagInfo(_td_c_get_29_114);
                            _jettag_c_get_29_114.doStart(context, out);
                            _jettag_c_get_29_114.doEnd();
                            out.write("(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_29_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_173); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_29_173.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_iterate_29_173.setTagInfo(_td_c_iterate_29_173);
                            _jettag_c_iterate_29_173.doStart(context, out);
                            while (_jettag_c_iterate_29_173.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_29_240 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_240); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_29_240.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_if_29_240.setTagInfo(_td_c_if_29_240);
                                _jettag_c_if_29_240.doStart(context, out);
                                while (_jettag_c_if_29_240.okToProcessBody()) {
                                    out.write("String ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_29_483 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_483); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_29_483.setRuntimeParent(_jettag_c_if_29_240);
                                    _jettag_c_get_29_483.setTagInfo(_td_c_get_29_483);
                                    _jettag_c_get_29_483.doStart(context, out);
                                    _jettag_c_get_29_483.doEnd();
                                    _jettag_c_if_29_240.handleBodyContent(out);
                                }
                                _jettag_c_if_29_240.doEnd();
                                RuntimeTagElement _jettag_c_if_29_525 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_525); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_29_525.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_if_29_525.setTagInfo(_td_c_if_29_525);
                                _jettag_c_if_29_525.doStart(context, out);
                                while (_jettag_c_if_29_525.okToProcessBody()) {
                                    out.write("Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_29_688 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_688); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_29_688.setRuntimeParent(_jettag_c_if_29_525);
                                    _jettag_c_get_29_688.setTagInfo(_td_c_get_29_688);
                                    _jettag_c_get_29_688.doStart(context, out);
                                    _jettag_c_get_29_688.doEnd();
                                    _jettag_c_if_29_525.handleBodyContent(out);
                                }
                                _jettag_c_if_29_525.doEnd();
                                RuntimeTagElement _jettag_c_if_29_730 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_730); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_29_730.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_if_29_730.setTagInfo(_td_c_if_29_730);
                                _jettag_c_if_29_730.doStart(context, out);
                                while (_jettag_c_if_29_730.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_29_881 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_881); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_29_881.setRuntimeParent(_jettag_c_if_29_730);
                                    _jettag_java_import_29_881.setTagInfo(_td_java_import_29_881);
                                    _jettag_java_import_29_881.doStart(context, out);
                                    JET2Writer _jettag_java_import_29_881_saved_out = out;
                                    while (_jettag_java_import_29_881.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                        _jettag_java_import_29_881.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_29_881_saved_out;
                                    _jettag_java_import_29_881.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_29_923 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_923); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_29_923.setRuntimeParent(_jettag_c_if_29_730);
                                    _jettag_c_get_29_923.setTagInfo(_td_c_get_29_923);
                                    _jettag_c_get_29_923.doStart(context, out);
                                    _jettag_c_get_29_923.doEnd();
                                    _jettag_c_if_29_730.handleBodyContent(out);
                                }
                                _jettag_c_if_29_730.doEnd();
                                RuntimeTagElement _jettag_c_if_29_965 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_965); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_29_965.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_if_29_965.setTagInfo(_td_c_if_29_965);
                                _jettag_c_if_29_965.doStart(context, out);
                                while (_jettag_c_if_29_965.okToProcessBody()) {
                                    RuntimeTagElement _jettag_java_import_29_1116 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_1116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_java_import_29_1116.setRuntimeParent(_jettag_c_if_29_965);
                                    _jettag_java_import_29_1116.setTagInfo(_td_java_import_29_1116);
                                    _jettag_java_import_29_1116.doStart(context, out);
                                    JET2Writer _jettag_java_import_29_1116_saved_out = out;
                                    while (_jettag_java_import_29_1116.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                        _jettag_java_import_29_1116.handleBodyContent(out);
                                    }
                                    out = _jettag_java_import_29_1116_saved_out;
                                    _jettag_java_import_29_1116.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_29_1164 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1164); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_29_1164.setRuntimeParent(_jettag_c_if_29_965);
                                    _jettag_c_get_29_1164.setTagInfo(_td_c_get_29_1164);
                                    _jettag_c_get_29_1164.doStart(context, out);
                                    _jettag_c_get_29_1164.doEnd();
                                    _jettag_c_if_29_965.handleBodyContent(out);
                                }
                                _jettag_c_if_29_965.doEnd();
                                RuntimeTagElement _jettag_c_setVariable_29_1206 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_1206); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_29_1206.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_setVariable_29_1206.setTagInfo(_td_c_setVariable_29_1206);
                                _jettag_c_setVariable_29_1206.doStart(context, out);
                                _jettag_c_setVariable_29_1206.doEnd();
                                RuntimeTagElement _jettag_c_if_29_1255 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1255); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_29_1255.setRuntimeParent(_jettag_c_iterate_29_173);
                                _jettag_c_if_29_1255.setTagInfo(_td_c_if_29_1255);
                                _jettag_c_if_29_1255.doStart(context, out);
                                while (_jettag_c_if_29_1255.okToProcessBody()) {
                                    out.write(",");  //$NON-NLS-1$        
                                    _jettag_c_if_29_1255.handleBodyContent(out);
                                }
                                _jettag_c_if_29_1255.doEnd();
                                _jettag_c_iterate_29_173.handleBodyContent(out);
                            }
                            _jettag_c_iterate_29_173.doEnd();
                            out.write(", ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1299 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1299); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1299.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_get_29_1299.setTagInfo(_td_c_get_29_1299);
                            _jettag_c_get_29_1299.doStart(context, out);
                            _jettag_c_get_29_1299.doEnd();
                            out.write(" related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_29_1366 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_1366); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_29_1366.setRuntimeParent(_jettag_c_if_24_3);
                            _jettag_c_get_29_1366.setTagInfo(_td_c_get_29_1366);
                            _jettag_c_get_29_1366.doStart(context, out);
                            _jettag_c_get_29_1366.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_24_3.handleBodyContent(out);
                        }
                        _jettag_c_if_24_3.doEnd();
                        _jettag_c_iterate_23_3.handleBodyContent(out);
                    }
                    _jettag_c_iterate_23_3.doEnd();
                    _jettag_c_iterate_16_2.handleBodyContent(out);
                }
                _jettag_c_iterate_16_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_33_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_setVariable_33_2.setTagInfo(_td_c_setVariable_33_2);
                _jettag_c_setVariable_33_2.doStart(context, out);
                _jettag_c_setVariable_33_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_34_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_34_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_iterate_34_2.setTagInfo(_td_c_iterate_34_2);
                _jettag_c_iterate_34_2.doStart(context, out);
                while (_jettag_c_iterate_34_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_35_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_35_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_35_2.setRuntimeParent(_jettag_c_iterate_34_2);
                    _jettag_c_setVariable_35_2.setTagInfo(_td_c_setVariable_35_2);
                    _jettag_c_setVariable_35_2.doStart(context, out);
                    _jettag_c_setVariable_35_2.doEnd();
                    _jettag_c_iterate_34_2.handleBodyContent(out);
                }
                _jettag_c_iterate_34_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_37_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_setVariable_37_2.setTagInfo(_td_c_setVariable_37_2);
                _jettag_c_setVariable_37_2.doStart(context, out);
                _jettag_c_setVariable_37_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_38_2.setRuntimeParent(_jettag_c_otherwise_13_2);
                _jettag_c_iterate_38_2.setTagInfo(_td_c_iterate_38_2);
                _jettag_c_iterate_38_2.doStart(context, out);
                while (_jettag_c_iterate_38_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_39_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_39_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_39_2.setRuntimeParent(_jettag_c_iterate_38_2);
                    _jettag_c_iterate_39_2.setTagInfo(_td_c_iterate_39_2);
                    _jettag_c_iterate_39_2.doStart(context, out);
                    while (_jettag_c_iterate_39_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_40_3.setRuntimeParent(_jettag_c_iterate_39_2);
                        _jettag_c_if_40_3.setTagInfo(_td_c_if_40_3);
                        _jettag_c_if_40_3.doStart(context, out);
                        while (_jettag_c_if_40_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_41_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_setVariable_41_4.setTagInfo(_td_c_setVariable_41_4);
                            _jettag_c_setVariable_41_4.doStart(context, out);
                            _jettag_c_setVariable_41_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_42_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_setVariable_42_4.setTagInfo(_td_c_setVariable_42_4);
                            _jettag_c_setVariable_42_4.doStart(context, out);
                            _jettag_c_setVariable_42_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_43_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_43_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_iterate_43_4.setTagInfo(_td_c_iterate_43_4);
                            _jettag_c_iterate_43_4.doStart(context, out);
                            while (_jettag_c_iterate_43_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_44_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_44_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_44_5.setRuntimeParent(_jettag_c_iterate_43_4);
                                _jettag_c_setVariable_44_5.setTagInfo(_td_c_setVariable_44_5);
                                _jettag_c_setVariable_44_5.doStart(context, out);
                                _jettag_c_setVariable_44_5.doEnd();
                                _jettag_c_iterate_43_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_43_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_46_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_46_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_46_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_iterate_46_4.setTagInfo(_td_c_iterate_46_4);
                            _jettag_c_iterate_46_4.doStart(context, out);
                            while (_jettag_c_iterate_46_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_47_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_47_5.setRuntimeParent(_jettag_c_iterate_46_4);
                                _jettag_c_setVariable_47_5.setTagInfo(_td_c_setVariable_47_5);
                                _jettag_c_setVariable_47_5.doStart(context, out);
                                _jettag_c_setVariable_47_5.doEnd();
                                _jettag_c_iterate_46_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_46_4.doEnd();
                            RuntimeTagElement _jettag_c_if_49_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_49_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_if_49_4.setTagInfo(_td_c_if_49_4);
                            _jettag_c_if_49_4.doStart(context, out);
                            while (_jettag_c_if_49_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_50_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_50_4.setRuntimeParent(_jettag_c_if_49_4);
                                _jettag_c_if_50_4.setTagInfo(_td_c_if_50_4);
                                _jettag_c_if_50_4.doStart(context, out);
                                while (_jettag_c_if_50_4.okToProcessBody()) {
                                    out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_51_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_11); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_51_11.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_get_51_11.setTagInfo(_td_c_get_51_11);
                                    _jettag_c_get_51_11.doStart(context, out);
                                    _jettag_c_get_51_11.doEnd();
                                    out.write(" save");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_51_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_66); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_51_66.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_get_51_66.setTagInfo(_td_c_get_51_66);
                                    _jettag_c_get_51_66.doStart(context, out);
                                    _jettag_c_get_51_66.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_51_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_51_116.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_iterate_51_116.setTagInfo(_td_c_iterate_51_116);
                                    _jettag_c_iterate_51_116.doStart(context, out);
                                    while (_jettag_c_iterate_51_116.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_51_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_51_181); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_51_181.setRuntimeParent(_jettag_c_iterate_51_116);
                                        _jettag_c_choose_51_181.setTagInfo(_td_c_choose_51_181);
                                        _jettag_c_choose_51_181.doStart(context, out);
                                        JET2Writer _jettag_c_choose_51_181_saved_out = out;
                                        while (_jettag_c_choose_51_181.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_51_191 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_51_191); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_51_191.setRuntimeParent(_jettag_c_choose_51_181);
                                            _jettag_c_when_51_191.setTagInfo(_td_c_when_51_191);
                                            _jettag_c_when_51_191.doStart(context, out);
                                            JET2Writer _jettag_c_when_51_191_saved_out = out;
                                            while (_jettag_c_when_51_191.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_51_191.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_51_191_saved_out;
                                            _jettag_c_when_51_191.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_51_256 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_51_256); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_51_256.setRuntimeParent(_jettag_c_choose_51_181);
                                            _jettag_c_otherwise_51_256.setTagInfo(_td_c_otherwise_51_256);
                                            _jettag_c_otherwise_51_256.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_51_256_saved_out = out;
                                            while (_jettag_c_otherwise_51_256.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_get_51_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_269); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_51_269.setRuntimeParent(_jettag_c_otherwise_51_256);
                                                _jettag_c_get_51_269.setTagInfo(_td_c_get_51_269);
                                                _jettag_c_get_51_269.doStart(context, out);
                                                _jettag_c_get_51_269.doEnd();
                                                _jettag_c_otherwise_51_256.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_51_256_saved_out;
                                            _jettag_c_otherwise_51_256.doEnd();
                                            _jettag_c_choose_51_181.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_51_181_saved_out;
                                        _jettag_c_choose_51_181.doEnd();
                                        _jettag_c_iterate_51_116.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_51_116.doEnd();
                                    out.write("s(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_51_365 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_365); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_51_365.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_iterate_51_365.setTagInfo(_td_c_iterate_51_365);
                                    _jettag_c_iterate_51_365.doStart(context, out);
                                    while (_jettag_c_iterate_51_365.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_51_432 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_432); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_51_432.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_if_51_432.setTagInfo(_td_c_if_51_432);
                                        _jettag_c_if_51_432.doStart(context, out);
                                        while (_jettag_c_if_51_432.okToProcessBody()) {
                                            out.write("String ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_51_675 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_675); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_51_675.setRuntimeParent(_jettag_c_if_51_432);
                                            _jettag_c_get_51_675.setTagInfo(_td_c_get_51_675);
                                            _jettag_c_get_51_675.doStart(context, out);
                                            _jettag_c_get_51_675.doEnd();
                                            _jettag_c_if_51_432.handleBodyContent(out);
                                        }
                                        _jettag_c_if_51_432.doEnd();
                                        RuntimeTagElement _jettag_c_if_51_717 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_717); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_51_717.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_if_51_717.setTagInfo(_td_c_if_51_717);
                                        _jettag_c_if_51_717.doStart(context, out);
                                        while (_jettag_c_if_51_717.okToProcessBody()) {
                                            out.write("Integer ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_51_880 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_880); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_51_880.setRuntimeParent(_jettag_c_if_51_717);
                                            _jettag_c_get_51_880.setTagInfo(_td_c_get_51_880);
                                            _jettag_c_get_51_880.doStart(context, out);
                                            _jettag_c_get_51_880.doEnd();
                                            _jettag_c_if_51_717.handleBodyContent(out);
                                        }
                                        _jettag_c_if_51_717.doEnd();
                                        RuntimeTagElement _jettag_c_if_51_922 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_922); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_51_922.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_if_51_922.setTagInfo(_td_c_if_51_922);
                                        _jettag_c_if_51_922.doStart(context, out);
                                        while (_jettag_c_if_51_922.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_51_1073 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_51_1073); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_51_1073.setRuntimeParent(_jettag_c_if_51_922);
                                            _jettag_java_import_51_1073.setTagInfo(_td_java_import_51_1073);
                                            _jettag_java_import_51_1073.doStart(context, out);
                                            JET2Writer _jettag_java_import_51_1073_saved_out = out;
                                            while (_jettag_java_import_51_1073.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_51_1073.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_51_1073_saved_out;
                                            _jettag_java_import_51_1073.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_51_1115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_1115); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_51_1115.setRuntimeParent(_jettag_c_if_51_922);
                                            _jettag_c_get_51_1115.setTagInfo(_td_c_get_51_1115);
                                            _jettag_c_get_51_1115.doStart(context, out);
                                            _jettag_c_get_51_1115.doEnd();
                                            _jettag_c_if_51_922.handleBodyContent(out);
                                        }
                                        _jettag_c_if_51_922.doEnd();
                                        RuntimeTagElement _jettag_c_if_51_1157 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_1157); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_51_1157.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_if_51_1157.setTagInfo(_td_c_if_51_1157);
                                        _jettag_c_if_51_1157.doStart(context, out);
                                        while (_jettag_c_if_51_1157.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_51_1308 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_51_1308); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_51_1308.setRuntimeParent(_jettag_c_if_51_1157);
                                            _jettag_java_import_51_1308.setTagInfo(_td_java_import_51_1308);
                                            _jettag_java_import_51_1308.doStart(context, out);
                                            JET2Writer _jettag_java_import_51_1308_saved_out = out;
                                            while (_jettag_java_import_51_1308.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_51_1308.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_51_1308_saved_out;
                                            _jettag_java_import_51_1308.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_51_1356 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_1356); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_51_1356.setRuntimeParent(_jettag_c_if_51_1157);
                                            _jettag_c_get_51_1356.setTagInfo(_td_c_get_51_1356);
                                            _jettag_c_get_51_1356.doStart(context, out);
                                            _jettag_c_get_51_1356.doEnd();
                                            _jettag_c_if_51_1157.handleBodyContent(out);
                                        }
                                        _jettag_c_if_51_1157.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_51_1398 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_51_1398); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_51_1398.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_setVariable_51_1398.setTagInfo(_td_c_setVariable_51_1398);
                                        _jettag_c_setVariable_51_1398.doStart(context, out);
                                        _jettag_c_setVariable_51_1398.doEnd();
                                        RuntimeTagElement _jettag_c_if_51_1447 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_1447); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_51_1447.setRuntimeParent(_jettag_c_iterate_51_365);
                                        _jettag_c_if_51_1447.setTagInfo(_td_c_if_51_1447);
                                        _jettag_c_if_51_1447.doStart(context, out);
                                        while (_jettag_c_if_51_1447.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_51_1447.handleBodyContent(out);
                                        }
                                        _jettag_c_if_51_1447.doEnd();
                                        _jettag_c_iterate_51_365.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_51_365.doEnd();
                                    out.write(", ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_51_1491 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_1491); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_51_1491.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_iterate_51_1491.setTagInfo(_td_c_iterate_51_1491);
                                    _jettag_c_iterate_51_1491.doStart(context, out);
                                    while (_jettag_c_iterate_51_1491.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_51_1556 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_51_1556); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_51_1556.setRuntimeParent(_jettag_c_iterate_51_1491);
                                        _jettag_c_choose_51_1556.setTagInfo(_td_c_choose_51_1556);
                                        _jettag_c_choose_51_1556.doStart(context, out);
                                        JET2Writer _jettag_c_choose_51_1556_saved_out = out;
                                        while (_jettag_c_choose_51_1556.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_51_1566 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_51_1566); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_51_1566.setRuntimeParent(_jettag_c_choose_51_1556);
                                            _jettag_c_when_51_1566.setTagInfo(_td_c_when_51_1566);
                                            _jettag_c_when_51_1566.doStart(context, out);
                                            JET2Writer _jettag_c_when_51_1566_saved_out = out;
                                            while (_jettag_c_when_51_1566.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_51_1566.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_51_1566_saved_out;
                                            _jettag_c_when_51_1566.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_51_1631 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_51_1631); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_51_1631.setRuntimeParent(_jettag_c_choose_51_1556);
                                            _jettag_c_otherwise_51_1631.setTagInfo(_td_c_otherwise_51_1631);
                                            _jettag_c_otherwise_51_1631.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_51_1631_saved_out = out;
                                            while (_jettag_c_otherwise_51_1631.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_get_51_1644 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_1644); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_51_1644.setRuntimeParent(_jettag_c_otherwise_51_1631);
                                                _jettag_c_get_51_1644.setTagInfo(_td_c_get_51_1644);
                                                _jettag_c_get_51_1644.doStart(context, out);
                                                _jettag_c_get_51_1644.doEnd();
                                                _jettag_c_otherwise_51_1631.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_51_1631_saved_out;
                                            _jettag_c_otherwise_51_1631.doEnd();
                                            _jettag_c_choose_51_1556.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_51_1556_saved_out;
                                        _jettag_c_choose_51_1556.doEnd();
                                        _jettag_c_iterate_51_1491.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_51_1491.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_51_1747 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_51_1747); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_51_1747.setRuntimeParent(_jettag_c_if_50_4);
                                    _jettag_c_iterate_51_1747.setTagInfo(_td_c_iterate_51_1747);
                                    _jettag_c_iterate_51_1747.doStart(context, out);
                                    while (_jettag_c_iterate_51_1747.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_51_1812 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_51_1812); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_51_1812.setRuntimeParent(_jettag_c_iterate_51_1747);
                                        _jettag_c_choose_51_1812.setTagInfo(_td_c_choose_51_1812);
                                        _jettag_c_choose_51_1812.doStart(context, out);
                                        JET2Writer _jettag_c_choose_51_1812_saved_out = out;
                                        while (_jettag_c_choose_51_1812.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_51_1822 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_51_1822); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_51_1822.setRuntimeParent(_jettag_c_choose_51_1812);
                                            _jettag_c_when_51_1822.setTagInfo(_td_c_when_51_1822);
                                            _jettag_c_when_51_1822.doStart(context, out);
                                            JET2Writer _jettag_c_when_51_1822_saved_out = out;
                                            while (_jettag_c_when_51_1822.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_51_1822.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_51_1822_saved_out;
                                            _jettag_c_when_51_1822.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_51_1887 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_51_1887); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_51_1887.setRuntimeParent(_jettag_c_choose_51_1812);
                                            _jettag_c_otherwise_51_1887.setTagInfo(_td_c_otherwise_51_1887);
                                            _jettag_c_otherwise_51_1887.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_51_1887_saved_out = out;
                                            while (_jettag_c_otherwise_51_1887.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_get_51_1900 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_1900); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_51_1900.setRuntimeParent(_jettag_c_otherwise_51_1887);
                                                _jettag_c_get_51_1900.setTagInfo(_td_c_get_51_1900);
                                                _jettag_c_get_51_1900.doStart(context, out);
                                                _jettag_c_get_51_1900.doEnd();
                                                _jettag_c_otherwise_51_1887.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_51_1887_saved_out;
                                            _jettag_c_otherwise_51_1887.doEnd();
                                            _jettag_c_choose_51_1812.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_51_1812_saved_out;
                                        _jettag_c_choose_51_1812.doEnd();
                                        _jettag_c_iterate_51_1747.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_51_1747.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_50_4.handleBodyContent(out);
                                }
                                _jettag_c_if_50_4.doEnd();
                                RuntimeTagElement _jettag_c_if_53_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_53_4.setRuntimeParent(_jettag_c_if_49_4);
                                _jettag_c_if_53_4.setTagInfo(_td_c_if_53_4);
                                _jettag_c_if_53_4.doStart(context, out);
                                while (_jettag_c_if_53_4.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_54_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_54_4.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_setVariable_54_4.setTagInfo(_td_c_setVariable_54_4);
                                    _jettag_c_setVariable_54_4.doStart(context, out);
                                    _jettag_c_setVariable_54_4.doEnd();
                                    out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_55_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_11); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_55_11.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_get_55_11.setTagInfo(_td_c_get_55_11);
                                    _jettag_c_get_55_11.doStart(context, out);
                                    _jettag_c_get_55_11.doEnd();
                                    out.write(" save");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_55_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_66); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_55_66.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_get_55_66.setTagInfo(_td_c_get_55_66);
                                    _jettag_c_get_55_66.doStart(context, out);
                                    _jettag_c_get_55_66.doEnd();
                                    RuntimeTagElement _jettag_c_get_55_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_55_116.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_get_55_116.setTagInfo(_td_c_get_55_116);
                                    _jettag_c_get_55_116.doStart(context, out);
                                    _jettag_c_get_55_116.doEnd();
                                    out.write("s(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_55_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_169); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_55_169.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_iterate_55_169.setTagInfo(_td_c_iterate_55_169);
                                    _jettag_c_iterate_55_169.doStart(context, out);
                                    while (_jettag_c_iterate_55_169.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_55_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_236); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_55_236.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_if_55_236.setTagInfo(_td_c_if_55_236);
                                        _jettag_c_if_55_236.doStart(context, out);
                                        while (_jettag_c_if_55_236.okToProcessBody()) {
                                            out.write("String ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_55_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_479); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_55_479.setRuntimeParent(_jettag_c_if_55_236);
                                            _jettag_c_get_55_479.setTagInfo(_td_c_get_55_479);
                                            _jettag_c_get_55_479.doStart(context, out);
                                            _jettag_c_get_55_479.doEnd();
                                            _jettag_c_if_55_236.handleBodyContent(out);
                                        }
                                        _jettag_c_if_55_236.doEnd();
                                        RuntimeTagElement _jettag_c_if_55_521 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_521); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_55_521.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_if_55_521.setTagInfo(_td_c_if_55_521);
                                        _jettag_c_if_55_521.doStart(context, out);
                                        while (_jettag_c_if_55_521.okToProcessBody()) {
                                            out.write("Integer ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_55_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_684); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_55_684.setRuntimeParent(_jettag_c_if_55_521);
                                            _jettag_c_get_55_684.setTagInfo(_td_c_get_55_684);
                                            _jettag_c_get_55_684.doStart(context, out);
                                            _jettag_c_get_55_684.doEnd();
                                            _jettag_c_if_55_521.handleBodyContent(out);
                                        }
                                        _jettag_c_if_55_521.doEnd();
                                        RuntimeTagElement _jettag_c_if_55_726 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_726); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_55_726.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_if_55_726.setTagInfo(_td_c_if_55_726);
                                        _jettag_c_if_55_726.doStart(context, out);
                                        while (_jettag_c_if_55_726.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_55_877 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_877); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_55_877.setRuntimeParent(_jettag_c_if_55_726);
                                            _jettag_java_import_55_877.setTagInfo(_td_java_import_55_877);
                                            _jettag_java_import_55_877.doStart(context, out);
                                            JET2Writer _jettag_java_import_55_877_saved_out = out;
                                            while (_jettag_java_import_55_877.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_55_877.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_55_877_saved_out;
                                            _jettag_java_import_55_877.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_55_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_919); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_55_919.setRuntimeParent(_jettag_c_if_55_726);
                                            _jettag_c_get_55_919.setTagInfo(_td_c_get_55_919);
                                            _jettag_c_get_55_919.doStart(context, out);
                                            _jettag_c_get_55_919.doEnd();
                                            _jettag_c_if_55_726.handleBodyContent(out);
                                        }
                                        _jettag_c_if_55_726.doEnd();
                                        RuntimeTagElement _jettag_c_if_55_961 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_961); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_55_961.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_if_55_961.setTagInfo(_td_c_if_55_961);
                                        _jettag_c_if_55_961.doStart(context, out);
                                        while (_jettag_c_if_55_961.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_55_1112 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_1112); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_55_1112.setRuntimeParent(_jettag_c_if_55_961);
                                            _jettag_java_import_55_1112.setTagInfo(_td_java_import_55_1112);
                                            _jettag_java_import_55_1112.doStart(context, out);
                                            JET2Writer _jettag_java_import_55_1112_saved_out = out;
                                            while (_jettag_java_import_55_1112.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_55_1112.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_55_1112_saved_out;
                                            _jettag_java_import_55_1112.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_55_1160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_1160); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_55_1160.setRuntimeParent(_jettag_c_if_55_961);
                                            _jettag_c_get_55_1160.setTagInfo(_td_c_get_55_1160);
                                            _jettag_c_get_55_1160.doStart(context, out);
                                            _jettag_c_get_55_1160.doEnd();
                                            _jettag_c_if_55_961.handleBodyContent(out);
                                        }
                                        _jettag_c_if_55_961.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_55_1202 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_55_1202); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_55_1202.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_setVariable_55_1202.setTagInfo(_td_c_setVariable_55_1202);
                                        _jettag_c_setVariable_55_1202.doStart(context, out);
                                        _jettag_c_setVariable_55_1202.doEnd();
                                        RuntimeTagElement _jettag_c_if_55_1251 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_1251); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_55_1251.setRuntimeParent(_jettag_c_iterate_55_169);
                                        _jettag_c_if_55_1251.setTagInfo(_td_c_if_55_1251);
                                        _jettag_c_if_55_1251.doStart(context, out);
                                        while (_jettag_c_if_55_1251.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_55_1251.handleBodyContent(out);
                                        }
                                        _jettag_c_if_55_1251.doEnd();
                                        _jettag_c_iterate_55_169.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_55_169.doEnd();
                                    out.write(", ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_55_1295 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_1295); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_55_1295.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_get_55_1295.setTagInfo(_td_c_get_55_1295);
                                    _jettag_c_get_55_1295.doStart(context, out);
                                    _jettag_c_get_55_1295.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_55_1355 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_1355); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_55_1355.setRuntimeParent(_jettag_c_if_53_4);
                                    _jettag_c_get_55_1355.setTagInfo(_td_c_get_55_1355);
                                    _jettag_c_get_55_1355.doStart(context, out);
                                    _jettag_c_get_55_1355.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_53_4.handleBodyContent(out);
                                }
                                _jettag_c_if_53_4.doEnd();
                                _jettag_c_if_49_4.handleBodyContent(out);
                            }
                            _jettag_c_if_49_4.doEnd();
                            RuntimeTagElement _jettag_c_if_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_58_4.setRuntimeParent(_jettag_c_if_40_3);
                            _jettag_c_if_58_4.setTagInfo(_td_c_if_58_4);
                            _jettag_c_if_58_4.doStart(context, out);
                            while (_jettag_c_if_58_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_59_4.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_setVariable_59_4.setTagInfo(_td_c_setVariable_59_4);
                                _jettag_c_setVariable_59_4.doStart(context, out);
                                _jettag_c_setVariable_59_4.doEnd();
                                out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_60_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_11); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_60_11.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_get_60_11.setTagInfo(_td_c_get_60_11);
                                _jettag_c_get_60_11.doStart(context, out);
                                _jettag_c_get_60_11.doEnd();
                                out.write(" save");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_60_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_66); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_60_66.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_get_60_66.setTagInfo(_td_c_get_60_66);
                                _jettag_c_get_60_66.doStart(context, out);
                                _jettag_c_get_60_66.doEnd();
                                RuntimeTagElement _jettag_c_get_60_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_116); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_60_116.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_get_60_116.setTagInfo(_td_c_get_60_116);
                                _jettag_c_get_60_116.doStart(context, out);
                                _jettag_c_get_60_116.doEnd();
                                out.write("s(");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_iterate_60_169 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_169); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_iterate_60_169.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_iterate_60_169.setTagInfo(_td_c_iterate_60_169);
                                _jettag_c_iterate_60_169.doStart(context, out);
                                while (_jettag_c_iterate_60_169.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_if_60_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_236); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_60_236.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_if_60_236.setTagInfo(_td_c_if_60_236);
                                    _jettag_c_if_60_236.doStart(context, out);
                                    while (_jettag_c_if_60_236.okToProcessBody()) {
                                        out.write("String ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_479 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_479); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_479.setRuntimeParent(_jettag_c_if_60_236);
                                        _jettag_c_get_60_479.setTagInfo(_td_c_get_60_479);
                                        _jettag_c_get_60_479.doStart(context, out);
                                        _jettag_c_get_60_479.doEnd();
                                        _jettag_c_if_60_236.handleBodyContent(out);
                                    }
                                    _jettag_c_if_60_236.doEnd();
                                    RuntimeTagElement _jettag_c_if_60_521 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_521); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_60_521.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_if_60_521.setTagInfo(_td_c_if_60_521);
                                    _jettag_c_if_60_521.doStart(context, out);
                                    while (_jettag_c_if_60_521.okToProcessBody()) {
                                        out.write("Integer ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_684 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_684); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_684.setRuntimeParent(_jettag_c_if_60_521);
                                        _jettag_c_get_60_684.setTagInfo(_td_c_get_60_684);
                                        _jettag_c_get_60_684.doStart(context, out);
                                        _jettag_c_get_60_684.doEnd();
                                        _jettag_c_if_60_521.handleBodyContent(out);
                                    }
                                    _jettag_c_if_60_521.doEnd();
                                    RuntimeTagElement _jettag_c_if_60_726 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_726); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_60_726.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_if_60_726.setTagInfo(_td_c_if_60_726);
                                    _jettag_c_if_60_726.doStart(context, out);
                                    while (_jettag_c_if_60_726.okToProcessBody()) {
                                        RuntimeTagElement _jettag_java_import_60_877 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_877); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_java_import_60_877.setRuntimeParent(_jettag_c_if_60_726);
                                        _jettag_java_import_60_877.setTagInfo(_td_java_import_60_877);
                                        _jettag_java_import_60_877.doStart(context, out);
                                        JET2Writer _jettag_java_import_60_877_saved_out = out;
                                        while (_jettag_java_import_60_877.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            out.write("java.util.Date");  //$NON-NLS-1$        
                                            _jettag_java_import_60_877.handleBodyContent(out);
                                        }
                                        out = _jettag_java_import_60_877_saved_out;
                                        _jettag_java_import_60_877.doEnd();
                                        out.write(" ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_919 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_919); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_919.setRuntimeParent(_jettag_c_if_60_726);
                                        _jettag_c_get_60_919.setTagInfo(_td_c_get_60_919);
                                        _jettag_c_get_60_919.doStart(context, out);
                                        _jettag_c_get_60_919.doEnd();
                                        _jettag_c_if_60_726.handleBodyContent(out);
                                    }
                                    _jettag_c_if_60_726.doEnd();
                                    RuntimeTagElement _jettag_c_if_60_961 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_961); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_60_961.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_if_60_961.setTagInfo(_td_c_if_60_961);
                                    _jettag_c_if_60_961.doStart(context, out);
                                    while (_jettag_c_if_60_961.okToProcessBody()) {
                                        RuntimeTagElement _jettag_java_import_60_1112 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_1112); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_java_import_60_1112.setRuntimeParent(_jettag_c_if_60_961);
                                        _jettag_java_import_60_1112.setTagInfo(_td_java_import_60_1112);
                                        _jettag_java_import_60_1112.doStart(context, out);
                                        JET2Writer _jettag_java_import_60_1112_saved_out = out;
                                        while (_jettag_java_import_60_1112.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                            _jettag_java_import_60_1112.handleBodyContent(out);
                                        }
                                        out = _jettag_java_import_60_1112_saved_out;
                                        _jettag_java_import_60_1112.doEnd();
                                        out.write(" ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_1160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1160); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_1160.setRuntimeParent(_jettag_c_if_60_961);
                                        _jettag_c_get_60_1160.setTagInfo(_td_c_get_60_1160);
                                        _jettag_c_get_60_1160.doStart(context, out);
                                        _jettag_c_get_60_1160.doEnd();
                                        _jettag_c_if_60_961.handleBodyContent(out);
                                    }
                                    _jettag_c_if_60_961.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_60_1202 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_1202); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_60_1202.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_setVariable_60_1202.setTagInfo(_td_c_setVariable_60_1202);
                                    _jettag_c_setVariable_60_1202.doStart(context, out);
                                    _jettag_c_setVariable_60_1202.doEnd();
                                    RuntimeTagElement _jettag_c_if_60_1251 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1251); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_60_1251.setRuntimeParent(_jettag_c_iterate_60_169);
                                    _jettag_c_if_60_1251.setTagInfo(_td_c_if_60_1251);
                                    _jettag_c_if_60_1251.doStart(context, out);
                                    while (_jettag_c_if_60_1251.okToProcessBody()) {
                                        out.write(",");  //$NON-NLS-1$        
                                        _jettag_c_if_60_1251.handleBodyContent(out);
                                    }
                                    _jettag_c_if_60_1251.doEnd();
                                    _jettag_c_iterate_60_169.handleBodyContent(out);
                                }
                                _jettag_c_iterate_60_169.doEnd();
                                out.write(", ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_60_1295 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1295); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_60_1295.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_get_60_1295.setTagInfo(_td_c_get_60_1295);
                                _jettag_c_get_60_1295.doStart(context, out);
                                _jettag_c_get_60_1295.doEnd();
                                out.write(" related_");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_60_1355 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_1355); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_60_1355.setRuntimeParent(_jettag_c_if_58_4);
                                _jettag_c_get_60_1355.setTagInfo(_td_c_get_60_1355);
                                _jettag_c_get_60_1355.doStart(context, out);
                                _jettag_c_get_60_1355.doEnd();
                                out.write("s);");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_58_4.handleBodyContent(out);
                            }
                            _jettag_c_if_58_4.doEnd();
                            _jettag_c_if_40_3.handleBodyContent(out);
                        }
                        _jettag_c_if_40_3.doEnd();
                        _jettag_c_iterate_39_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_39_2.doEnd();
                    _jettag_c_iterate_38_2.handleBodyContent(out);
                }
                _jettag_c_iterate_38_2.doEnd();
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
