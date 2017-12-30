package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKeyColumns_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKeyColumns_0() {
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
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_2 = new TagInfo("c:if", //$NON-NLS-1$
            6, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_2 = new TagInfo("c:if", //$NON-NLS-1$
            7, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_9 = new TagInfo("c:get", //$NON-NLS-1$
            9, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_64 = new TagInfo("c:get", //$NON-NLS-1$
            9, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_116 = new TagInfo("c:get", //$NON-NLS-1$
            9, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_175 = new TagInfo("c:get", //$NON-NLS-1$
            9, 175,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_14 = new TagInfo("c:get", //$NON-NLS-1$
            11, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_66 = new TagInfo("c:get", //$NON-NLS-1$
            11, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_118 = new TagInfo("c:get", //$NON-NLS-1$
            11, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_9 = new TagInfo("c:get", //$NON-NLS-1$
            15, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_64 = new TagInfo("c:get", //$NON-NLS-1$
            15, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_116 = new TagInfo("c:get", //$NON-NLS-1$
            15, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_175 = new TagInfo("c:get", //$NON-NLS-1$
            15, 175,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_17_4 = new TagInfo("java:import", //$NON-NLS-1$
            17, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_17_85 = new TagInfo("c:get", //$NON-NLS-1$
            17, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_137 = new TagInfo("c:get", //$NON-NLS-1$
            17, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_213 = new TagInfo("c:get", //$NON-NLS-1$
            17, 213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_12 = new TagInfo("c:get", //$NON-NLS-1$
            18, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_50 = new TagInfo("c:get", //$NON-NLS-1$
            18, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_19_12 = new TagInfo("java:import", //$NON-NLS-1$
            19, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_24_1 = new TagInfo("c:if", //$NON-NLS-1$
            24, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_9 = new TagInfo("c:get", //$NON-NLS-1$
            26, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_64 = new TagInfo("c:get", //$NON-NLS-1$
            26, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_116 = new TagInfo("c:get", //$NON-NLS-1$
            26, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_176 = new TagInfo("c:get", //$NON-NLS-1$
            26, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_14 = new TagInfo("c:get", //$NON-NLS-1$
            28, 14,
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
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_118 = new TagInfo("c:get", //$NON-NLS-1$
            28, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_9 = new TagInfo("c:get", //$NON-NLS-1$
            32, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_64 = new TagInfo("c:get", //$NON-NLS-1$
            32, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_116 = new TagInfo("c:get", //$NON-NLS-1$
            32, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_176 = new TagInfo("c:get", //$NON-NLS-1$
            32, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_34_4 = new TagInfo("java:import", //$NON-NLS-1$
            34, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_34_85 = new TagInfo("c:get", //$NON-NLS-1$
            34, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_137 = new TagInfo("c:get", //$NON-NLS-1$
            34, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_213 = new TagInfo("c:get", //$NON-NLS-1$
            34, 213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_12 = new TagInfo("c:get", //$NON-NLS-1$
            35, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_50 = new TagInfo("c:get", //$NON-NLS-1$
            35, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_36_12 = new TagInfo("java:import", //$NON-NLS-1$
            36, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_41_1 = new TagInfo("c:if", //$NON-NLS-1$
            41, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_9 = new TagInfo("c:get", //$NON-NLS-1$
            43, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_64 = new TagInfo("c:get", //$NON-NLS-1$
            43, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_116 = new TagInfo("c:get", //$NON-NLS-1$
            43, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_43_168 = new TagInfo("java:import", //$NON-NLS-1$
            43, 168,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_43_210 = new TagInfo("c:get", //$NON-NLS-1$
            43, 210,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_14 = new TagInfo("c:get", //$NON-NLS-1$
            45, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_66 = new TagInfo("c:get", //$NON-NLS-1$
            45, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_118 = new TagInfo("c:get", //$NON-NLS-1$
            45, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_9 = new TagInfo("c:get", //$NON-NLS-1$
            49, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_64 = new TagInfo("c:get", //$NON-NLS-1$
            49, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_116 = new TagInfo("c:get", //$NON-NLS-1$
            49, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_173 = new TagInfo("c:get", //$NON-NLS-1$
            49, 173,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_51_4 = new TagInfo("java:import", //$NON-NLS-1$
            51, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_85 = new TagInfo("c:get", //$NON-NLS-1$
            51, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_137 = new TagInfo("c:get", //$NON-NLS-1$
            51, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_213 = new TagInfo("c:get", //$NON-NLS-1$
            51, 213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_12 = new TagInfo("c:get", //$NON-NLS-1$
            52, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_50 = new TagInfo("c:get", //$NON-NLS-1$
            52, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_53_12 = new TagInfo("java:import", //$NON-NLS-1$
            53, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_58_1 = new TagInfo("c:if", //$NON-NLS-1$
            58, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_9 = new TagInfo("c:get", //$NON-NLS-1$
            60, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_64 = new TagInfo("c:get", //$NON-NLS-1$
            60, 64,
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
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_60_168 = new TagInfo("java:import", //$NON-NLS-1$
            60, 168,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_60_216 = new TagInfo("c:get", //$NON-NLS-1$
            60, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_14 = new TagInfo("c:get", //$NON-NLS-1$
            62, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_66 = new TagInfo("c:get", //$NON-NLS-1$
            62, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_118 = new TagInfo("c:get", //$NON-NLS-1$
            62, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_9 = new TagInfo("c:get", //$NON-NLS-1$
            66, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_64 = new TagInfo("c:get", //$NON-NLS-1$
            66, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_116 = new TagInfo("c:get", //$NON-NLS-1$
            66, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_179 = new TagInfo("c:get", //$NON-NLS-1$
            66, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_68_4 = new TagInfo("java:import", //$NON-NLS-1$
            68, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_68_85 = new TagInfo("c:get", //$NON-NLS-1$
            68, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_137 = new TagInfo("c:get", //$NON-NLS-1$
            68, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_213 = new TagInfo("c:get", //$NON-NLS-1$
            68, 213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_12 = new TagInfo("c:get", //$NON-NLS-1$
            69, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_50 = new TagInfo("c:get", //$NON-NLS-1$
            69, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_70_12 = new TagInfo("java:import", //$NON-NLS-1$
            70, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_76_1 = new TagInfo("c:if", //$NON-NLS-1$
            76, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_77_1 = new TagInfo("c:if", //$NON-NLS-1$
            77, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_9 = new TagInfo("c:get", //$NON-NLS-1$
            79, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_64 = new TagInfo("c:get", //$NON-NLS-1$
            79, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_116 = new TagInfo("c:get", //$NON-NLS-1$
            79, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_180 = new TagInfo("c:get", //$NON-NLS-1$
            79, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_14 = new TagInfo("c:get", //$NON-NLS-1$
            81, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_66 = new TagInfo("c:get", //$NON-NLS-1$
            81, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_123 = new TagInfo("c:get", //$NON-NLS-1$
            81, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_9 = new TagInfo("c:get", //$NON-NLS-1$
            85, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_64 = new TagInfo("c:get", //$NON-NLS-1$
            85, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_116 = new TagInfo("c:get", //$NON-NLS-1$
            85, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_180 = new TagInfo("c:get", //$NON-NLS-1$
            85, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_87_4 = new TagInfo("java:import", //$NON-NLS-1$
            87, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_87_85 = new TagInfo("c:get", //$NON-NLS-1$
            87, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_137 = new TagInfo("c:get", //$NON-NLS-1$
            87, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_218 = new TagInfo("c:get", //$NON-NLS-1$
            87, 218,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_12 = new TagInfo("c:get", //$NON-NLS-1$
            88, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_50 = new TagInfo("c:get", //$NON-NLS-1$
            88, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_89_12 = new TagInfo("java:import", //$NON-NLS-1$
            89, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_94_1 = new TagInfo("c:if", //$NON-NLS-1$
            94, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_9 = new TagInfo("c:get", //$NON-NLS-1$
            96, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_64 = new TagInfo("c:get", //$NON-NLS-1$
            96, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_116 = new TagInfo("c:get", //$NON-NLS-1$
            96, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_181 = new TagInfo("c:get", //$NON-NLS-1$
            96, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_14 = new TagInfo("c:get", //$NON-NLS-1$
            98, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_66 = new TagInfo("c:get", //$NON-NLS-1$
            98, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_123 = new TagInfo("c:get", //$NON-NLS-1$
            98, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_9 = new TagInfo("c:get", //$NON-NLS-1$
            102, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_64 = new TagInfo("c:get", //$NON-NLS-1$
            102, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_116 = new TagInfo("c:get", //$NON-NLS-1$
            102, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_181 = new TagInfo("c:get", //$NON-NLS-1$
            102, 181,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_104_4 = new TagInfo("java:import", //$NON-NLS-1$
            104, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_104_85 = new TagInfo("c:get", //$NON-NLS-1$
            104, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_137 = new TagInfo("c:get", //$NON-NLS-1$
            104, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_104_218 = new TagInfo("c:get", //$NON-NLS-1$
            104, 218,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_12 = new TagInfo("c:get", //$NON-NLS-1$
            105, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_50 = new TagInfo("c:get", //$NON-NLS-1$
            105, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_106_12 = new TagInfo("java:import", //$NON-NLS-1$
            106, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_111_1 = new TagInfo("c:if", //$NON-NLS-1$
            111, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_9 = new TagInfo("c:get", //$NON-NLS-1$
            113, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_64 = new TagInfo("c:get", //$NON-NLS-1$
            113, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_116 = new TagInfo("c:get", //$NON-NLS-1$
            113, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_113_173 = new TagInfo("java:import", //$NON-NLS-1$
            113, 173,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_113_215 = new TagInfo("c:get", //$NON-NLS-1$
            113, 215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_14 = new TagInfo("c:get", //$NON-NLS-1$
            115, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_66 = new TagInfo("c:get", //$NON-NLS-1$
            115, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_123 = new TagInfo("c:get", //$NON-NLS-1$
            115, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_9 = new TagInfo("c:get", //$NON-NLS-1$
            119, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_64 = new TagInfo("c:get", //$NON-NLS-1$
            119, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_116 = new TagInfo("c:get", //$NON-NLS-1$
            119, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_178 = new TagInfo("c:get", //$NON-NLS-1$
            119, 178,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_121_4 = new TagInfo("java:import", //$NON-NLS-1$
            121, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_121_85 = new TagInfo("c:get", //$NON-NLS-1$
            121, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_137 = new TagInfo("c:get", //$NON-NLS-1$
            121, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_218 = new TagInfo("c:get", //$NON-NLS-1$
            121, 218,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_12 = new TagInfo("c:get", //$NON-NLS-1$
            122, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_50 = new TagInfo("c:get", //$NON-NLS-1$
            122, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_123_12 = new TagInfo("java:import", //$NON-NLS-1$
            123, 12,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_128_1 = new TagInfo("c:if", //$NON-NLS-1$
            128, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_9 = new TagInfo("c:get", //$NON-NLS-1$
            130, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_64 = new TagInfo("c:get", //$NON-NLS-1$
            130, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_130_116 = new TagInfo("c:get", //$NON-NLS-1$
            130, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_130_173 = new TagInfo("java:import", //$NON-NLS-1$
            130, 173,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_130_221 = new TagInfo("c:get", //$NON-NLS-1$
            130, 221,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_14 = new TagInfo("c:get", //$NON-NLS-1$
            132, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_66 = new TagInfo("c:get", //$NON-NLS-1$
            132, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_123 = new TagInfo("c:get", //$NON-NLS-1$
            132, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_9 = new TagInfo("c:get", //$NON-NLS-1$
            136, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_64 = new TagInfo("c:get", //$NON-NLS-1$
            136, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_116 = new TagInfo("c:get", //$NON-NLS-1$
            136, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_136_184 = new TagInfo("c:get", //$NON-NLS-1$
            136, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_138_4 = new TagInfo("java:import", //$NON-NLS-1$
            138, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_138_85 = new TagInfo("c:get", //$NON-NLS-1$
            138, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_137 = new TagInfo("c:get", //$NON-NLS-1$
            138, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_138_218 = new TagInfo("c:get", //$NON-NLS-1$
            138, 218,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_12 = new TagInfo("c:get", //$NON-NLS-1$
            139, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_50 = new TagInfo("c:get", //$NON-NLS-1$
            139, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_140_12 = new TagInfo("java:import", //$NON-NLS-1$
            140, 12,
            new String[] {
            },
            new String[] {
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
        RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_1.setRuntimeParent(null);
        _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
        _jettag_c_iterate_5_1.doStart(context, out);
        while (_jettag_c_iterate_5_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_6_2.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_6_2.setTagInfo(_td_c_if_6_2);
            _jettag_c_if_6_2.doStart(context, out);
            while (_jettag_c_if_6_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_2.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_if_7_2.setTagInfo(_td_c_if_7_2);
                _jettag_c_if_7_2.doStart(context, out);
                while (_jettag_c_if_7_2.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_9.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_9_9.setTagInfo(_td_c_get_9_9);
                    _jettag_c_get_9_9.doStart(context, out);
                    _jettag_c_get_9_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_64.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_9_64.setTagInfo(_td_c_get_9_64);
                    _jettag_c_get_9_64.doStart(context, out);
                    _jettag_c_get_9_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_116.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_9_116.setTagInfo(_td_c_get_9_116);
                    _jettag_c_get_9_116.doStart(context, out);
                    _jettag_c_get_9_116.doEnd();
                    out.write("(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_175); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_175.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_9_175.setTagInfo(_td_c_get_9_175);
                    _jettag_c_get_9_175.doStart(context, out);
                    _jettag_c_get_9_175.doEnd();
                    out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_14.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_11_14.setTagInfo(_td_c_get_11_14);
                    _jettag_c_get_11_14.doStart(context, out);
                    _jettag_c_get_11_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_66.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_11_66.setTagInfo(_td_c_get_11_66);
                    _jettag_c_get_11_66.doStart(context, out);
                    _jettag_c_get_11_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_118.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_11_118.setTagInfo(_td_c_get_11_118);
                    _jettag_c_get_11_118.doStart(context, out);
                    _jettag_c_get_11_118.doEnd();
                    out.write(", -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_9.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_15_9.setTagInfo(_td_c_get_15_9);
                    _jettag_c_get_15_9.doStart(context, out);
                    _jettag_c_get_15_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_64.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_15_64.setTagInfo(_td_c_get_15_64);
                    _jettag_c_get_15_64.doStart(context, out);
                    _jettag_c_get_15_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_116.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_15_116.setTagInfo(_td_c_get_15_116);
                    _jettag_c_get_15_116.doStart(context, out);
                    _jettag_c_get_15_116.doEnd();
                    out.write("(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_175); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_175.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_15_175.setTagInfo(_td_c_get_15_175);
                    _jettag_c_get_15_175.doStart(context, out);
                    _jettag_c_get_15_175.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_17_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_17_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_17_4.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_java_import_17_4.setTagInfo(_td_java_import_17_4);
                    _jettag_java_import_17_4.doStart(context, out);
                    JET2Writer _jettag_java_import_17_4_saved_out = out;
                    while (_jettag_java_import_17_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_17_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_17_4_saved_out;
                    _jettag_java_import_17_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_85.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_17_85.setTagInfo(_td_c_get_17_85);
                    _jettag_c_get_17_85.doStart(context, out);
                    _jettag_c_get_17_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_137.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_17_137.setTagInfo(_td_c_get_17_137);
                    _jettag_c_get_17_137.doStart(context, out);
                    _jettag_c_get_17_137.doEnd();
                    out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_213); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_213.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_17_213.setTagInfo(_td_c_get_17_213);
                    _jettag_c_get_17_213.doStart(context, out);
                    _jettag_c_get_17_213.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_12.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_18_12.setTagInfo(_td_c_get_18_12);
                    _jettag_c_get_18_12.doStart(context, out);
                    _jettag_c_get_18_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_50.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_c_get_18_50.setTagInfo(_td_c_get_18_50);
                    _jettag_c_get_18_50.doStart(context, out);
                    _jettag_c_get_18_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_19_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_19_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_19_12.setRuntimeParent(_jettag_c_if_7_2);
                    _jettag_java_import_19_12.setTagInfo(_td_java_import_19_12);
                    _jettag_java_import_19_12.doStart(context, out);
                    JET2Writer _jettag_java_import_19_12_saved_out = out;
                    while (_jettag_java_import_19_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_19_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_19_12_saved_out;
                    _jettag_java_import_19_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_7_2.handleBodyContent(out);
                }
                _jettag_c_if_7_2.doEnd();
                RuntimeTagElement _jettag_c_if_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_24_1.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_if_24_1.setTagInfo(_td_c_if_24_1);
                _jettag_c_if_24_1.doStart(context, out);
                while (_jettag_c_if_24_1.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_9.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_26_9.setTagInfo(_td_c_get_26_9);
                    _jettag_c_get_26_9.doStart(context, out);
                    _jettag_c_get_26_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_64.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_26_64.setTagInfo(_td_c_get_26_64);
                    _jettag_c_get_26_64.doStart(context, out);
                    _jettag_c_get_26_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_116.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_26_116.setTagInfo(_td_c_get_26_116);
                    _jettag_c_get_26_116.doStart(context, out);
                    _jettag_c_get_26_116.doEnd();
                    out.write("(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_176); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_176.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_26_176.setTagInfo(_td_c_get_26_176);
                    _jettag_c_get_26_176.doStart(context, out);
                    _jettag_c_get_26_176.doEnd();
                    out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_14.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_28_14.setTagInfo(_td_c_get_28_14);
                    _jettag_c_get_28_14.doStart(context, out);
                    _jettag_c_get_28_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_66.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_28_66.setTagInfo(_td_c_get_28_66);
                    _jettag_c_get_28_66.doStart(context, out);
                    _jettag_c_get_28_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_118.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_28_118.setTagInfo(_td_c_get_28_118);
                    _jettag_c_get_28_118.doStart(context, out);
                    _jettag_c_get_28_118.doEnd();
                    out.write(", -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_9.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_32_9.setTagInfo(_td_c_get_32_9);
                    _jettag_c_get_32_9.doStart(context, out);
                    _jettag_c_get_32_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_64.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_32_64.setTagInfo(_td_c_get_32_64);
                    _jettag_c_get_32_64.doStart(context, out);
                    _jettag_c_get_32_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_116.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_32_116.setTagInfo(_td_c_get_32_116);
                    _jettag_c_get_32_116.doStart(context, out);
                    _jettag_c_get_32_116.doEnd();
                    out.write("(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_176); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_176.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_32_176.setTagInfo(_td_c_get_32_176);
                    _jettag_c_get_32_176.doStart(context, out);
                    _jettag_c_get_32_176.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_34_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_34_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_34_4.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_java_import_34_4.setTagInfo(_td_java_import_34_4);
                    _jettag_java_import_34_4.doStart(context, out);
                    JET2Writer _jettag_java_import_34_4_saved_out = out;
                    while (_jettag_java_import_34_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_34_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_34_4_saved_out;
                    _jettag_java_import_34_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_34_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_85.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_34_85.setTagInfo(_td_c_get_34_85);
                    _jettag_c_get_34_85.doStart(context, out);
                    _jettag_c_get_34_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_34_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_137.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_34_137.setTagInfo(_td_c_get_34_137);
                    _jettag_c_get_34_137.doStart(context, out);
                    _jettag_c_get_34_137.doEnd();
                    out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_34_213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_213); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_34_213.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_34_213.setTagInfo(_td_c_get_34_213);
                    _jettag_c_get_34_213.doStart(context, out);
                    _jettag_c_get_34_213.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_12.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_35_12.setTagInfo(_td_c_get_35_12);
                    _jettag_c_get_35_12.doStart(context, out);
                    _jettag_c_get_35_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_50.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_c_get_35_50.setTagInfo(_td_c_get_35_50);
                    _jettag_c_get_35_50.doStart(context, out);
                    _jettag_c_get_35_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_36_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_36_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_36_12.setRuntimeParent(_jettag_c_if_24_1);
                    _jettag_java_import_36_12.setTagInfo(_td_java_import_36_12);
                    _jettag_java_import_36_12.doStart(context, out);
                    JET2Writer _jettag_java_import_36_12_saved_out = out;
                    while (_jettag_java_import_36_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_36_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_36_12_saved_out;
                    _jettag_java_import_36_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_24_1.handleBodyContent(out);
                }
                _jettag_c_if_24_1.doEnd();
                RuntimeTagElement _jettag_c_if_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_41_1.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_if_41_1.setTagInfo(_td_c_if_41_1);
                _jettag_c_if_41_1.doStart(context, out);
                while (_jettag_c_if_41_1.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_43_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_9.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_43_9.setTagInfo(_td_c_get_43_9);
                    _jettag_c_get_43_9.doStart(context, out);
                    _jettag_c_get_43_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_43_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_64.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_43_64.setTagInfo(_td_c_get_43_64);
                    _jettag_c_get_43_64.doStart(context, out);
                    _jettag_c_get_43_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_43_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_116.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_43_116.setTagInfo(_td_c_get_43_116);
                    _jettag_c_get_43_116.doStart(context, out);
                    _jettag_c_get_43_116.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_43_168 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_43_168); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_43_168.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_java_import_43_168.setTagInfo(_td_java_import_43_168);
                    _jettag_java_import_43_168.doStart(context, out);
                    JET2Writer _jettag_java_import_43_168_saved_out = out;
                    while (_jettag_java_import_43_168.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_43_168.handleBodyContent(out);
                    }
                    out = _jettag_java_import_43_168_saved_out;
                    _jettag_java_import_43_168.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_43_210 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_210); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_210.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_43_210.setTagInfo(_td_c_get_43_210);
                    _jettag_c_get_43_210.doStart(context, out);
                    _jettag_c_get_43_210.doEnd();
                    out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_14.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_45_14.setTagInfo(_td_c_get_45_14);
                    _jettag_c_get_45_14.doStart(context, out);
                    _jettag_c_get_45_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_66.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_45_66.setTagInfo(_td_c_get_45_66);
                    _jettag_c_get_45_66.doStart(context, out);
                    _jettag_c_get_45_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_118.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_45_118.setTagInfo(_td_c_get_45_118);
                    _jettag_c_get_45_118.doStart(context, out);
                    _jettag_c_get_45_118.doEnd();
                    out.write(", -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_9.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_49_9.setTagInfo(_td_c_get_49_9);
                    _jettag_c_get_49_9.doStart(context, out);
                    _jettag_c_get_49_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_64.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_49_64.setTagInfo(_td_c_get_49_64);
                    _jettag_c_get_49_64.doStart(context, out);
                    _jettag_c_get_49_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_116.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_49_116.setTagInfo(_td_c_get_49_116);
                    _jettag_c_get_49_116.doStart(context, out);
                    _jettag_c_get_49_116.doEnd();
                    out.write("(Date ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_173 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_173); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_173.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_49_173.setTagInfo(_td_c_get_49_173);
                    _jettag_c_get_49_173.doStart(context, out);
                    _jettag_c_get_49_173.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_51_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_51_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_51_4.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_java_import_51_4.setTagInfo(_td_java_import_51_4);
                    _jettag_java_import_51_4.doStart(context, out);
                    JET2Writer _jettag_java_import_51_4_saved_out = out;
                    while (_jettag_java_import_51_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_51_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_51_4_saved_out;
                    _jettag_java_import_51_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_85.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_51_85.setTagInfo(_td_c_get_51_85);
                    _jettag_c_get_51_85.doStart(context, out);
                    _jettag_c_get_51_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_137.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_51_137.setTagInfo(_td_c_get_51_137);
                    _jettag_c_get_51_137.doStart(context, out);
                    _jettag_c_get_51_137.doEnd();
                    out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_213); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_213.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_51_213.setTagInfo(_td_c_get_51_213);
                    _jettag_c_get_51_213.doStart(context, out);
                    _jettag_c_get_51_213.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_52_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_52_12.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_52_12.setTagInfo(_td_c_get_52_12);
                    _jettag_c_get_52_12.doStart(context, out);
                    _jettag_c_get_52_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_52_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_52_50.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_c_get_52_50.setTagInfo(_td_c_get_52_50);
                    _jettag_c_get_52_50.doStart(context, out);
                    _jettag_c_get_52_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_53_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_53_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_53_12.setRuntimeParent(_jettag_c_if_41_1);
                    _jettag_java_import_53_12.setTagInfo(_td_java_import_53_12);
                    _jettag_java_import_53_12.doStart(context, out);
                    JET2Writer _jettag_java_import_53_12_saved_out = out;
                    while (_jettag_java_import_53_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_53_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_53_12_saved_out;
                    _jettag_java_import_53_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_41_1.handleBodyContent(out);
                }
                _jettag_c_if_41_1.doEnd();
                RuntimeTagElement _jettag_c_if_58_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_58_1.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_if_58_1.setTagInfo(_td_c_if_58_1);
                _jettag_c_if_58_1.doStart(context, out);
                while (_jettag_c_if_58_1.okToProcessBody()) {
                    out.write("@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_9.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_60_9.setTagInfo(_td_c_get_60_9);
                    _jettag_c_get_60_9.doStart(context, out);
                    _jettag_c_get_60_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_64.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_60_64.setTagInfo(_td_c_get_60_64);
                    _jettag_c_get_60_64.doStart(context, out);
                    _jettag_c_get_60_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_116.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_60_116.setTagInfo(_td_c_get_60_116);
                    _jettag_c_get_60_116.doStart(context, out);
                    _jettag_c_get_60_116.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_60_168 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_60_168); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_60_168.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_java_import_60_168.setTagInfo(_td_java_import_60_168);
                    _jettag_java_import_60_168.doStart(context, out);
                    JET2Writer _jettag_java_import_60_168_saved_out = out;
                    while (_jettag_java_import_60_168.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_60_168.handleBodyContent(out);
                    }
                    out = _jettag_java_import_60_168_saved_out;
                    _jettag_java_import_60_168.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_60_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_216); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_60_216.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_60_216.setTagInfo(_td_c_get_60_216);
                    _jettag_c_get_60_216.doStart(context, out);
                    _jettag_c_get_60_216.doEnd();
                    out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_62_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_62_14.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_62_14.setTagInfo(_td_c_get_62_14);
                    _jettag_c_get_62_14.doStart(context, out);
                    _jettag_c_get_62_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_62_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_62_66.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_62_66.setTagInfo(_td_c_get_62_66);
                    _jettag_c_get_62_66.doStart(context, out);
                    _jettag_c_get_62_66.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_62_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_118); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_62_118.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_62_118.setTagInfo(_td_c_get_62_118);
                    _jettag_c_get_62_118.doStart(context, out);
                    _jettag_c_get_62_118.doEnd();
                    out.write(", -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_66_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_9.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_66_9.setTagInfo(_td_c_get_66_9);
                    _jettag_c_get_66_9.doStart(context, out);
                    _jettag_c_get_66_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_66_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_64.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_66_64.setTagInfo(_td_c_get_66_64);
                    _jettag_c_get_66_64.doStart(context, out);
                    _jettag_c_get_66_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_66_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_116.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_66_116.setTagInfo(_td_c_get_66_116);
                    _jettag_c_get_66_116.doStart(context, out);
                    _jettag_c_get_66_116.doEnd();
                    out.write("(BigDecimal ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_66_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_179); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_66_179.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_66_179.setTagInfo(_td_c_get_66_179);
                    _jettag_c_get_66_179.doStart(context, out);
                    _jettag_c_get_66_179.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_68_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_68_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_68_4.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_java_import_68_4.setTagInfo(_td_java_import_68_4);
                    _jettag_java_import_68_4.doStart(context, out);
                    JET2Writer _jettag_java_import_68_4_saved_out = out;
                    while (_jettag_java_import_68_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_68_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_68_4_saved_out;
                    _jettag_java_import_68_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_68_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_68_85.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_68_85.setTagInfo(_td_c_get_68_85);
                    _jettag_c_get_68_85.doStart(context, out);
                    _jettag_c_get_68_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_68_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_68_137.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_68_137.setTagInfo(_td_c_get_68_137);
                    _jettag_c_get_68_137.doStart(context, out);
                    _jettag_c_get_68_137.doEnd();
                    out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_68_213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_213); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_68_213.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_68_213.setTagInfo(_td_c_get_68_213);
                    _jettag_c_get_68_213.doStart(context, out);
                    _jettag_c_get_68_213.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_69_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_12.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_69_12.setTagInfo(_td_c_get_69_12);
                    _jettag_c_get_69_12.doStart(context, out);
                    _jettag_c_get_69_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_69_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_50.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_c_get_69_50.setTagInfo(_td_c_get_69_50);
                    _jettag_c_get_69_50.doStart(context, out);
                    _jettag_c_get_69_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_70_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_70_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_70_12.setRuntimeParent(_jettag_c_if_58_1);
                    _jettag_java_import_70_12.setTagInfo(_td_java_import_70_12);
                    _jettag_java_import_70_12.doStart(context, out);
                    JET2Writer _jettag_java_import_70_12_saved_out = out;
                    while (_jettag_java_import_70_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_70_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_70_12_saved_out;
                    _jettag_java_import_70_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_58_1.handleBodyContent(out);
                }
                _jettag_c_if_58_1.doEnd();
                _jettag_c_if_6_2.handleBodyContent(out);
            }
            _jettag_c_if_6_2.doEnd();
            RuntimeTagElement _jettag_c_if_76_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_76_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_76_1.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_76_1.setTagInfo(_td_c_if_76_1);
            _jettag_c_if_76_1.doStart(context, out);
            while (_jettag_c_if_76_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_77_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_77_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_77_1.setRuntimeParent(_jettag_c_if_76_1);
                _jettag_c_if_77_1.setTagInfo(_td_c_if_77_1);
                _jettag_c_if_77_1.doStart(context, out);
                while (_jettag_c_if_77_1.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_9.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_79_9.setTagInfo(_td_c_get_79_9);
                    _jettag_c_get_79_9.doStart(context, out);
                    _jettag_c_get_79_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_64.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_79_64.setTagInfo(_td_c_get_79_64);
                    _jettag_c_get_79_64.doStart(context, out);
                    _jettag_c_get_79_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_116.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_79_116.setTagInfo(_td_c_get_79_116);
                    _jettag_c_get_79_116.doStart(context, out);
                    _jettag_c_get_79_116.doEnd();
                    out.write("Field(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_79_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_79_180.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_79_180.setTagInfo(_td_c_get_79_180);
                    _jettag_c_get_79_180.doStart(context, out);
                    _jettag_c_get_79_180.doEnd();
                    out.write("Field) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_81_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_81_14.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_81_14.setTagInfo(_td_c_get_81_14);
                    _jettag_c_get_81_14.doStart(context, out);
                    _jettag_c_get_81_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_81_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_81_66.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_81_66.setTagInfo(_td_c_get_81_66);
                    _jettag_c_get_81_66.doStart(context, out);
                    _jettag_c_get_81_66.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_81_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_123); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_81_123.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_81_123.setTagInfo(_td_c_get_81_123);
                    _jettag_c_get_81_123.doStart(context, out);
                    _jettag_c_get_81_123.doEnd();
                    out.write("Field, -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_85_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_9.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_85_9.setTagInfo(_td_c_get_85_9);
                    _jettag_c_get_85_9.doStart(context, out);
                    _jettag_c_get_85_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_85_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_64.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_85_64.setTagInfo(_td_c_get_85_64);
                    _jettag_c_get_85_64.doStart(context, out);
                    _jettag_c_get_85_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_85_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_116.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_85_116.setTagInfo(_td_c_get_85_116);
                    _jettag_c_get_85_116.doStart(context, out);
                    _jettag_c_get_85_116.doEnd();
                    out.write("Field(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_85_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_85_180.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_85_180.setTagInfo(_td_c_get_85_180);
                    _jettag_c_get_85_180.doStart(context, out);
                    _jettag_c_get_85_180.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_87_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_87_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_87_4.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_java_import_87_4.setTagInfo(_td_java_import_87_4);
                    _jettag_java_import_87_4.doStart(context, out);
                    JET2Writer _jettag_java_import_87_4_saved_out = out;
                    while (_jettag_java_import_87_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_87_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_87_4_saved_out;
                    _jettag_java_import_87_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_87_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_87_85.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_87_85.setTagInfo(_td_c_get_87_85);
                    _jettag_c_get_87_85.doStart(context, out);
                    _jettag_c_get_87_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_87_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_87_137.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_87_137.setTagInfo(_td_c_get_87_137);
                    _jettag_c_get_87_137.doStart(context, out);
                    _jettag_c_get_87_137.doEnd();
                    out.write("Field\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_87_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_218); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_87_218.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_87_218.setTagInfo(_td_c_get_87_218);
                    _jettag_c_get_87_218.doStart(context, out);
                    _jettag_c_get_87_218.doEnd();
                    out.write("Field);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_88_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_88_12.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_88_12.setTagInfo(_td_c_get_88_12);
                    _jettag_c_get_88_12.doStart(context, out);
                    _jettag_c_get_88_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_88_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_88_50.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_c_get_88_50.setTagInfo(_td_c_get_88_50);
                    _jettag_c_get_88_50.doStart(context, out);
                    _jettag_c_get_88_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_89_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_89_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_89_12.setRuntimeParent(_jettag_c_if_77_1);
                    _jettag_java_import_89_12.setTagInfo(_td_java_import_89_12);
                    _jettag_java_import_89_12.doStart(context, out);
                    JET2Writer _jettag_java_import_89_12_saved_out = out;
                    while (_jettag_java_import_89_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_89_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_89_12_saved_out;
                    _jettag_java_import_89_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_77_1.handleBodyContent(out);
                }
                _jettag_c_if_77_1.doEnd();
                RuntimeTagElement _jettag_c_if_94_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_94_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_94_1.setRuntimeParent(_jettag_c_if_76_1);
                _jettag_c_if_94_1.setTagInfo(_td_c_if_94_1);
                _jettag_c_if_94_1.doStart(context, out);
                while (_jettag_c_if_94_1.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_96_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_9.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_96_9.setTagInfo(_td_c_get_96_9);
                    _jettag_c_get_96_9.doStart(context, out);
                    _jettag_c_get_96_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_96_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_64.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_96_64.setTagInfo(_td_c_get_96_64);
                    _jettag_c_get_96_64.doStart(context, out);
                    _jettag_c_get_96_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_96_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_116.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_96_116.setTagInfo(_td_c_get_96_116);
                    _jettag_c_get_96_116.doStart(context, out);
                    _jettag_c_get_96_116.doEnd();
                    out.write("Field(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_96_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_181); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_96_181.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_96_181.setTagInfo(_td_c_get_96_181);
                    _jettag_c_get_96_181.doStart(context, out);
                    _jettag_c_get_96_181.doEnd();
                    out.write("Field) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_98_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_98_14.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_98_14.setTagInfo(_td_c_get_98_14);
                    _jettag_c_get_98_14.doStart(context, out);
                    _jettag_c_get_98_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_98_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_98_66.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_98_66.setTagInfo(_td_c_get_98_66);
                    _jettag_c_get_98_66.doStart(context, out);
                    _jettag_c_get_98_66.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_98_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_123); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_98_123.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_98_123.setTagInfo(_td_c_get_98_123);
                    _jettag_c_get_98_123.doStart(context, out);
                    _jettag_c_get_98_123.doEnd();
                    out.write("Field, -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_102_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_9.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_102_9.setTagInfo(_td_c_get_102_9);
                    _jettag_c_get_102_9.doStart(context, out);
                    _jettag_c_get_102_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_102_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_64.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_102_64.setTagInfo(_td_c_get_102_64);
                    _jettag_c_get_102_64.doStart(context, out);
                    _jettag_c_get_102_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_102_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_116.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_102_116.setTagInfo(_td_c_get_102_116);
                    _jettag_c_get_102_116.doStart(context, out);
                    _jettag_c_get_102_116.doEnd();
                    out.write("Field(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_102_181 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_181); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_102_181.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_102_181.setTagInfo(_td_c_get_102_181);
                    _jettag_c_get_102_181.doStart(context, out);
                    _jettag_c_get_102_181.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_104_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_104_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_104_4.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_java_import_104_4.setTagInfo(_td_java_import_104_4);
                    _jettag_java_import_104_4.doStart(context, out);
                    JET2Writer _jettag_java_import_104_4_saved_out = out;
                    while (_jettag_java_import_104_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_104_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_104_4_saved_out;
                    _jettag_java_import_104_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_104_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_104_85.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_104_85.setTagInfo(_td_c_get_104_85);
                    _jettag_c_get_104_85.doStart(context, out);
                    _jettag_c_get_104_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_104_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_104_137.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_104_137.setTagInfo(_td_c_get_104_137);
                    _jettag_c_get_104_137.doStart(context, out);
                    _jettag_c_get_104_137.doEnd();
                    out.write("Field\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_104_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_218); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_104_218.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_104_218.setTagInfo(_td_c_get_104_218);
                    _jettag_c_get_104_218.doStart(context, out);
                    _jettag_c_get_104_218.doEnd();
                    out.write("Field);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_105_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_105_12.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_105_12.setTagInfo(_td_c_get_105_12);
                    _jettag_c_get_105_12.doStart(context, out);
                    _jettag_c_get_105_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_105_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_105_50.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_c_get_105_50.setTagInfo(_td_c_get_105_50);
                    _jettag_c_get_105_50.doStart(context, out);
                    _jettag_c_get_105_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_106_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_106_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_106_12.setRuntimeParent(_jettag_c_if_94_1);
                    _jettag_java_import_106_12.setTagInfo(_td_java_import_106_12);
                    _jettag_java_import_106_12.doStart(context, out);
                    JET2Writer _jettag_java_import_106_12_saved_out = out;
                    while (_jettag_java_import_106_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_106_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_106_12_saved_out;
                    _jettag_java_import_106_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_94_1.handleBodyContent(out);
                }
                _jettag_c_if_94_1.doEnd();
                RuntimeTagElement _jettag_c_if_111_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_111_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_111_1.setRuntimeParent(_jettag_c_if_76_1);
                _jettag_c_if_111_1.setTagInfo(_td_c_if_111_1);
                _jettag_c_if_111_1.doStart(context, out);
                while (_jettag_c_if_111_1.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_113_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_113_9.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_113_9.setTagInfo(_td_c_get_113_9);
                    _jettag_c_get_113_9.doStart(context, out);
                    _jettag_c_get_113_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_113_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_113_64.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_113_64.setTagInfo(_td_c_get_113_64);
                    _jettag_c_get_113_64.doStart(context, out);
                    _jettag_c_get_113_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_113_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_113_116.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_113_116.setTagInfo(_td_c_get_113_116);
                    _jettag_c_get_113_116.doStart(context, out);
                    _jettag_c_get_113_116.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_113_173 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_113_173); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_113_173.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_java_import_113_173.setTagInfo(_td_java_import_113_173);
                    _jettag_java_import_113_173.doStart(context, out);
                    JET2Writer _jettag_java_import_113_173_saved_out = out;
                    while (_jettag_java_import_113_173.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_113_173.handleBodyContent(out);
                    }
                    out = _jettag_java_import_113_173_saved_out;
                    _jettag_java_import_113_173.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_113_215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_215); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_113_215.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_113_215.setTagInfo(_td_c_get_113_215);
                    _jettag_c_get_113_215.doStart(context, out);
                    _jettag_c_get_113_215.doEnd();
                    out.write("Field) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_115_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_115_14.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_115_14.setTagInfo(_td_c_get_115_14);
                    _jettag_c_get_115_14.doStart(context, out);
                    _jettag_c_get_115_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_115_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_115_66.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_115_66.setTagInfo(_td_c_get_115_66);
                    _jettag_c_get_115_66.doStart(context, out);
                    _jettag_c_get_115_66.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_115_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_123); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_115_123.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_115_123.setTagInfo(_td_c_get_115_123);
                    _jettag_c_get_115_123.doStart(context, out);
                    _jettag_c_get_115_123.doEnd();
                    out.write("Field, -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_119_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_119_9.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_119_9.setTagInfo(_td_c_get_119_9);
                    _jettag_c_get_119_9.doStart(context, out);
                    _jettag_c_get_119_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_119_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_119_64.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_119_64.setTagInfo(_td_c_get_119_64);
                    _jettag_c_get_119_64.doStart(context, out);
                    _jettag_c_get_119_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_119_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_119_116.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_119_116.setTagInfo(_td_c_get_119_116);
                    _jettag_c_get_119_116.doStart(context, out);
                    _jettag_c_get_119_116.doEnd();
                    out.write("Field(Date ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_119_178 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_178); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_119_178.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_119_178.setTagInfo(_td_c_get_119_178);
                    _jettag_c_get_119_178.doStart(context, out);
                    _jettag_c_get_119_178.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_121_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_121_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_121_4.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_java_import_121_4.setTagInfo(_td_java_import_121_4);
                    _jettag_java_import_121_4.doStart(context, out);
                    JET2Writer _jettag_java_import_121_4_saved_out = out;
                    while (_jettag_java_import_121_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_121_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_121_4_saved_out;
                    _jettag_java_import_121_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_121_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_85.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_121_85.setTagInfo(_td_c_get_121_85);
                    _jettag_c_get_121_85.doStart(context, out);
                    _jettag_c_get_121_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_121_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_137.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_121_137.setTagInfo(_td_c_get_121_137);
                    _jettag_c_get_121_137.doStart(context, out);
                    _jettag_c_get_121_137.doEnd();
                    out.write("Field\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_121_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_218); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_121_218.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_121_218.setTagInfo(_td_c_get_121_218);
                    _jettag_c_get_121_218.doStart(context, out);
                    _jettag_c_get_121_218.doEnd();
                    out.write("Field);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_122_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_122_12.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_122_12.setTagInfo(_td_c_get_122_12);
                    _jettag_c_get_122_12.doStart(context, out);
                    _jettag_c_get_122_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_122_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_122_50.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_c_get_122_50.setTagInfo(_td_c_get_122_50);
                    _jettag_c_get_122_50.doStart(context, out);
                    _jettag_c_get_122_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_123_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_123_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_123_12.setRuntimeParent(_jettag_c_if_111_1);
                    _jettag_java_import_123_12.setTagInfo(_td_java_import_123_12);
                    _jettag_java_import_123_12.doStart(context, out);
                    JET2Writer _jettag_java_import_123_12_saved_out = out;
                    while (_jettag_java_import_123_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_123_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_123_12_saved_out;
                    _jettag_java_import_123_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_111_1.handleBodyContent(out);
                }
                _jettag_c_if_111_1.doEnd();
                RuntimeTagElement _jettag_c_if_128_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_128_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_128_1.setRuntimeParent(_jettag_c_if_76_1);
                _jettag_c_if_128_1.setTagInfo(_td_c_if_128_1);
                _jettag_c_if_128_1.doStart(context, out);
                while (_jettag_c_if_128_1.okToProcessBody()) {
                    out.write("@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_130_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_9.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_130_9.setTagInfo(_td_c_get_130_9);
                    _jettag_c_get_130_9.doStart(context, out);
                    _jettag_c_get_130_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_130_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_64.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_130_64.setTagInfo(_td_c_get_130_64);
                    _jettag_c_get_130_64.doStart(context, out);
                    _jettag_c_get_130_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_130_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_116.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_130_116.setTagInfo(_td_c_get_130_116);
                    _jettag_c_get_130_116.doStart(context, out);
                    _jettag_c_get_130_116.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_130_173 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_130_173); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_130_173.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_java_import_130_173.setTagInfo(_td_java_import_130_173);
                    _jettag_java_import_130_173.doStart(context, out);
                    JET2Writer _jettag_java_import_130_173_saved_out = out;
                    while (_jettag_java_import_130_173.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_130_173.handleBodyContent(out);
                    }
                    out = _jettag_java_import_130_173_saved_out;
                    _jettag_java_import_130_173.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_130_221 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_130_221); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_130_221.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_130_221.setTagInfo(_td_c_get_130_221);
                    _jettag_c_get_130_221.doStart(context, out);
                    _jettag_c_get_130_221.doEnd();
                    out.write("Field) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("\t\treturn find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_132_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_132_14.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_132_14.setTagInfo(_td_c_get_132_14);
                    _jettag_c_get_132_14.doStart(context, out);
                    _jettag_c_get_132_14.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_132_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_66); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_132_66.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_132_66.setTagInfo(_td_c_get_132_66);
                    _jettag_c_get_132_66.doStart(context, out);
                    _jettag_c_get_132_66.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_132_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_123); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_132_123.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_132_123.setTagInfo(_td_c_get_132_123);
                    _jettag_c_get_132_123.doStart(context, out);
                    _jettag_c_get_132_123.doEnd();
                    out.write("Field, -1, -1);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_136_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_136_9.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_136_9.setTagInfo(_td_c_get_136_9);
                    _jettag_c_get_136_9.doStart(context, out);
                    _jettag_c_get_136_9.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_136_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_64); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_136_64.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_136_64.setTagInfo(_td_c_get_136_64);
                    _jettag_c_get_136_64.doStart(context, out);
                    _jettag_c_get_136_64.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_136_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_136_116.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_136_116.setTagInfo(_td_c_get_136_116);
                    _jettag_c_get_136_116.doStart(context, out);
                    _jettag_c_get_136_116.doEnd();
                    out.write("Field(BigDecimal ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_136_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_136_184); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_136_184.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_136_184.setTagInfo(_td_c_get_136_184);
                    _jettag_c_get_136_184.doStart(context, out);
                    _jettag_c_get_136_184.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\ttry {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_138_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_138_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_138_4.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_java_import_138_4.setTagInfo(_td_java_import_138_4);
                    _jettag_java_import_138_4.doStart(context, out);
                    JET2Writer _jettag_java_import_138_4_saved_out = out;
                    while (_jettag_java_import_138_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.Query");  //$NON-NLS-1$        
                        _jettag_java_import_138_4.handleBodyContent(out);
                    }
                    out = _jettag_java_import_138_4_saved_out;
                    _jettag_java_import_138_4.doEnd();
                    out.write(" query = createNamedQuery(\"find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_138_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_138_85.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_138_85.setTagInfo(_td_c_get_138_85);
                    _jettag_c_get_138_85.doStart(context, out);
                    _jettag_c_get_138_85.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_138_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_137); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_138_137.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_138_137.setTagInfo(_td_c_get_138_137);
                    _jettag_c_get_138_137.doStart(context, out);
                    _jettag_c_get_138_137.doEnd();
                    out.write("Field\", startResult, maxRows, ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_138_218 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_218); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_138_218.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_138_218.setTagInfo(_td_c_get_138_218);
                    _jettag_c_get_138_218.doStart(context, out);
                    _jettag_c_get_138_218.doEnd();
                    out.write("Field);");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_139_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_12.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_139_12.setTagInfo(_td_c_get_139_12);
                    _jettag_c_get_139_12.doStart(context, out);
                    _jettag_c_get_139_12.doEnd();
                    out.write(".domain.");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_139_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_139_50.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_c_get_139_50.setTagInfo(_td_c_get_139_50);
                    _jettag_c_get_139_50.doStart(context, out);
                    _jettag_c_get_139_50.doEnd();
                    out.write(") query.getSingleResult();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t} catch (");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_140_12 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_140_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_140_12.setRuntimeParent(_jettag_c_if_128_1);
                    _jettag_java_import_140_12.setTagInfo(_td_java_import_140_12);
                    _jettag_java_import_140_12.doStart(context, out);
                    JET2Writer _jettag_java_import_140_12_saved_out = out;
                    while (_jettag_java_import_140_12.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("javax.persistence.NoResultException");  //$NON-NLS-1$        
                        _jettag_java_import_140_12.handleBodyContent(out);
                    }
                    out = _jettag_java_import_140_12_saved_out;
                    _jettag_java_import_140_12.doEnd();
                    out.write(" nre) {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn null;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_128_1.handleBodyContent(out);
                }
                _jettag_c_if_128_1.doEnd();
                _jettag_c_if_76_1.handleBodyContent(out);
            }
            _jettag_c_if_76_1.doEnd();
            _jettag_c_iterate_5_1.handleBodyContent(out);
        }
        _jettag_c_iterate_5_1.doEnd();
    }
}
