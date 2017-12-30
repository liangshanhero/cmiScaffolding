package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKeyColumns implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKeyColumns() {
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
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_8 = new TagInfo("c:get", //$NON-NLS-1$
            8, 8,
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
    private static final TagInfo _td_c_get_8_115 = new TagInfo("c:get", //$NON-NLS-1$
            8, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_174 = new TagInfo("c:get", //$NON-NLS-1$
            8, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_8 = new TagInfo("c:get", //$NON-NLS-1$
            10, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_63 = new TagInfo("c:get", //$NON-NLS-1$
            10, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_115 = new TagInfo("c:get", //$NON-NLS-1$
            10, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_174 = new TagInfo("c:get", //$NON-NLS-1$
            10, 174,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_8 = new TagInfo("c:get", //$NON-NLS-1$
            13, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_63 = new TagInfo("c:get", //$NON-NLS-1$
            13, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_115 = new TagInfo("c:get", //$NON-NLS-1$
            13, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_175 = new TagInfo("c:get", //$NON-NLS-1$
            13, 175,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_8 = new TagInfo("c:get", //$NON-NLS-1$
            15, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_63 = new TagInfo("c:get", //$NON-NLS-1$
            15, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_115 = new TagInfo("c:get", //$NON-NLS-1$
            15, 115,
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
    private static final TagInfo _td_c_if_17_1 = new TagInfo("c:if", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_8 = new TagInfo("c:get", //$NON-NLS-1$
            18, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_63 = new TagInfo("c:get", //$NON-NLS-1$
            18, 63,
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
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_18_167 = new TagInfo("java:import", //$NON-NLS-1$
            18, 167,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_18_209 = new TagInfo("c:get", //$NON-NLS-1$
            18, 209,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_8 = new TagInfo("c:get", //$NON-NLS-1$
            20, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_63 = new TagInfo("c:get", //$NON-NLS-1$
            20, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_115 = new TagInfo("c:get", //$NON-NLS-1$
            20, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_20_167 = new TagInfo("java:import", //$NON-NLS-1$
            20, 167,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_20_209 = new TagInfo("c:get", //$NON-NLS-1$
            20, 209,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_1 = new TagInfo("c:if", //$NON-NLS-1$
            22, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_8 = new TagInfo("c:get", //$NON-NLS-1$
            23, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_63 = new TagInfo("c:get", //$NON-NLS-1$
            23, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_115 = new TagInfo("c:get", //$NON-NLS-1$
            23, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_23_167 = new TagInfo("java:import", //$NON-NLS-1$
            23, 167,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_23_215 = new TagInfo("c:get", //$NON-NLS-1$
            23, 215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_8 = new TagInfo("c:get", //$NON-NLS-1$
            25, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_63 = new TagInfo("c:get", //$NON-NLS-1$
            25, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_115 = new TagInfo("c:get", //$NON-NLS-1$
            25, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_25_167 = new TagInfo("java:import", //$NON-NLS-1$
            25, 167,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_25_215 = new TagInfo("c:get", //$NON-NLS-1$
            25, 215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_28_1 = new TagInfo("c:if", //$NON-NLS-1$
            28, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_8 = new TagInfo("c:get", //$NON-NLS-1$
            30, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_63 = new TagInfo("c:get", //$NON-NLS-1$
            30, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_115 = new TagInfo("c:get", //$NON-NLS-1$
            30, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_179 = new TagInfo("c:get", //$NON-NLS-1$
            30, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_8 = new TagInfo("c:get", //$NON-NLS-1$
            32, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_63 = new TagInfo("c:get", //$NON-NLS-1$
            32, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_115 = new TagInfo("c:get", //$NON-NLS-1$
            32, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_179 = new TagInfo("c:get", //$NON-NLS-1$
            32, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_34_1 = new TagInfo("c:if", //$NON-NLS-1$
            34, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_8 = new TagInfo("c:get", //$NON-NLS-1$
            35, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_63 = new TagInfo("c:get", //$NON-NLS-1$
            35, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_115 = new TagInfo("c:get", //$NON-NLS-1$
            35, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_180 = new TagInfo("c:get", //$NON-NLS-1$
            35, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_8 = new TagInfo("c:get", //$NON-NLS-1$
            37, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_63 = new TagInfo("c:get", //$NON-NLS-1$
            37, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_115 = new TagInfo("c:get", //$NON-NLS-1$
            37, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_180 = new TagInfo("c:get", //$NON-NLS-1$
            37, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_1 = new TagInfo("c:if", //$NON-NLS-1$
            39, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_8 = new TagInfo("c:get", //$NON-NLS-1$
            40, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_63 = new TagInfo("c:get", //$NON-NLS-1$
            40, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_115 = new TagInfo("c:get", //$NON-NLS-1$
            40, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_40_172 = new TagInfo("java:import", //$NON-NLS-1$
            40, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_40_214 = new TagInfo("c:get", //$NON-NLS-1$
            40, 214,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_8 = new TagInfo("c:get", //$NON-NLS-1$
            42, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_63 = new TagInfo("c:get", //$NON-NLS-1$
            42, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_115 = new TagInfo("c:get", //$NON-NLS-1$
            42, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_42_172 = new TagInfo("java:import", //$NON-NLS-1$
            42, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_42_214 = new TagInfo("c:get", //$NON-NLS-1$
            42, 214,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_44_1 = new TagInfo("c:if", //$NON-NLS-1$
            44, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_8 = new TagInfo("c:get", //$NON-NLS-1$
            45, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_63 = new TagInfo("c:get", //$NON-NLS-1$
            45, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_115 = new TagInfo("c:get", //$NON-NLS-1$
            45, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_45_172 = new TagInfo("java:import", //$NON-NLS-1$
            45, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_45_220 = new TagInfo("c:get", //$NON-NLS-1$
            45, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_8 = new TagInfo("c:get", //$NON-NLS-1$
            47, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_63 = new TagInfo("c:get", //$NON-NLS-1$
            47, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_115 = new TagInfo("c:get", //$NON-NLS-1$
            47, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_47_172 = new TagInfo("java:import", //$NON-NLS-1$
            47, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_47_220 = new TagInfo("c:get", //$NON-NLS-1$
            47, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
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
            RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_6_1.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
            _jettag_c_if_6_1.doStart(context, out);
            while (_jettag_c_if_6_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
                _jettag_c_if_7_1.doStart(context, out);
                while (_jettag_c_if_7_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_8.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
                    _jettag_c_get_8_8.doStart(context, out);
                    _jettag_c_get_8_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_63.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_63.setTagInfo(_td_c_get_8_63);
                    _jettag_c_get_8_63.doStart(context, out);
                    _jettag_c_get_8_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_115.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_115.setTagInfo(_td_c_get_8_115);
                    _jettag_c_get_8_115.doStart(context, out);
                    _jettag_c_get_8_115.doEnd();
                    out.write("(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_174.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_174.setTagInfo(_td_c_get_8_174);
                    _jettag_c_get_8_174.doStart(context, out);
                    _jettag_c_get_8_174.doEnd();
                    out.write(") throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_8.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_10_8.setTagInfo(_td_c_get_10_8);
                    _jettag_c_get_10_8.doStart(context, out);
                    _jettag_c_get_10_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_63.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_10_63.setTagInfo(_td_c_get_10_63);
                    _jettag_c_get_10_63.doStart(context, out);
                    _jettag_c_get_10_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_115.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_10_115.setTagInfo(_td_c_get_10_115);
                    _jettag_c_get_10_115.doStart(context, out);
                    _jettag_c_get_10_115.doEnd();
                    out.write("(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_174); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_174.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_10_174.setTagInfo(_td_c_get_10_174);
                    _jettag_c_get_10_174.doStart(context, out);
                    _jettag_c_get_10_174.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_7_1.handleBodyContent(out);
                }
                _jettag_c_if_7_1.doEnd();
                RuntimeTagElement _jettag_c_if_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_12_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_if_12_1.setTagInfo(_td_c_if_12_1);
                _jettag_c_if_12_1.doStart(context, out);
                while (_jettag_c_if_12_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_8.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_13_8.setTagInfo(_td_c_get_13_8);
                    _jettag_c_get_13_8.doStart(context, out);
                    _jettag_c_get_13_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_63.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_13_63.setTagInfo(_td_c_get_13_63);
                    _jettag_c_get_13_63.doStart(context, out);
                    _jettag_c_get_13_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_115.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_13_115.setTagInfo(_td_c_get_13_115);
                    _jettag_c_get_13_115.doStart(context, out);
                    _jettag_c_get_13_115.doEnd();
                    out.write("(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_175); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_175.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_13_175.setTagInfo(_td_c_get_13_175);
                    _jettag_c_get_13_175.doStart(context, out);
                    _jettag_c_get_13_175.doEnd();
                    out.write(") throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_8.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_15_8.setTagInfo(_td_c_get_15_8);
                    _jettag_c_get_15_8.doStart(context, out);
                    _jettag_c_get_15_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_63.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_15_63.setTagInfo(_td_c_get_15_63);
                    _jettag_c_get_15_63.doStart(context, out);
                    _jettag_c_get_15_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_115.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_15_115.setTagInfo(_td_c_get_15_115);
                    _jettag_c_get_15_115.doStart(context, out);
                    _jettag_c_get_15_115.doEnd();
                    out.write("(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_175); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_175.setRuntimeParent(_jettag_c_if_12_1);
                    _jettag_c_get_15_175.setTagInfo(_td_c_get_15_175);
                    _jettag_c_get_15_175.doStart(context, out);
                    _jettag_c_get_15_175.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_12_1.handleBodyContent(out);
                }
                _jettag_c_if_12_1.doEnd();
                RuntimeTagElement _jettag_c_if_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_if_17_1.setTagInfo(_td_c_if_17_1);
                _jettag_c_if_17_1.doStart(context, out);
                while (_jettag_c_if_17_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_8.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_18_8.setTagInfo(_td_c_get_18_8);
                    _jettag_c_get_18_8.doStart(context, out);
                    _jettag_c_get_18_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_63.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_18_63.setTagInfo(_td_c_get_18_63);
                    _jettag_c_get_18_63.doStart(context, out);
                    _jettag_c_get_18_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_115.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_18_115.setTagInfo(_td_c_get_18_115);
                    _jettag_c_get_18_115.doStart(context, out);
                    _jettag_c_get_18_115.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_18_167 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_18_167); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_18_167.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_java_import_18_167.setTagInfo(_td_java_import_18_167);
                    _jettag_java_import_18_167.doStart(context, out);
                    JET2Writer _jettag_java_import_18_167_saved_out = out;
                    while (_jettag_java_import_18_167.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_18_167.handleBodyContent(out);
                    }
                    out = _jettag_java_import_18_167_saved_out;
                    _jettag_java_import_18_167.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_209); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_209.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_18_209.setTagInfo(_td_c_get_18_209);
                    _jettag_c_get_18_209.doStart(context, out);
                    _jettag_c_get_18_209.doEnd();
                    out.write(") throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_8.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_20_8.setTagInfo(_td_c_get_20_8);
                    _jettag_c_get_20_8.doStart(context, out);
                    _jettag_c_get_20_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_63.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_20_63.setTagInfo(_td_c_get_20_63);
                    _jettag_c_get_20_63.doStart(context, out);
                    _jettag_c_get_20_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_115.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_20_115.setTagInfo(_td_c_get_20_115);
                    _jettag_c_get_20_115.doStart(context, out);
                    _jettag_c_get_20_115.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_20_167 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_20_167); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_20_167.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_java_import_20_167.setTagInfo(_td_java_import_20_167);
                    _jettag_java_import_20_167.doStart(context, out);
                    JET2Writer _jettag_java_import_20_167_saved_out = out;
                    while (_jettag_java_import_20_167.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_20_167.handleBodyContent(out);
                    }
                    out = _jettag_java_import_20_167_saved_out;
                    _jettag_java_import_20_167.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_209); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_209.setRuntimeParent(_jettag_c_if_17_1);
                    _jettag_c_get_20_209.setTagInfo(_td_c_get_20_209);
                    _jettag_c_get_20_209.doStart(context, out);
                    _jettag_c_get_20_209.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_17_1.handleBodyContent(out);
                }
                _jettag_c_if_17_1.doEnd();
                RuntimeTagElement _jettag_c_if_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_if_22_1.setTagInfo(_td_c_if_22_1);
                _jettag_c_if_22_1.doStart(context, out);
                while (_jettag_c_if_22_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_8.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_23_8.setTagInfo(_td_c_get_23_8);
                    _jettag_c_get_23_8.doStart(context, out);
                    _jettag_c_get_23_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_63.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_23_63.setTagInfo(_td_c_get_23_63);
                    _jettag_c_get_23_63.doStart(context, out);
                    _jettag_c_get_23_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_115.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_23_115.setTagInfo(_td_c_get_23_115);
                    _jettag_c_get_23_115.doStart(context, out);
                    _jettag_c_get_23_115.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_23_167 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_23_167); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_23_167.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_java_import_23_167.setTagInfo(_td_java_import_23_167);
                    _jettag_java_import_23_167.doStart(context, out);
                    JET2Writer _jettag_java_import_23_167_saved_out = out;
                    while (_jettag_java_import_23_167.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_23_167.handleBodyContent(out);
                    }
                    out = _jettag_java_import_23_167_saved_out;
                    _jettag_java_import_23_167.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_23_215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_215); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_23_215.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_23_215.setTagInfo(_td_c_get_23_215);
                    _jettag_c_get_23_215.doStart(context, out);
                    _jettag_c_get_23_215.doEnd();
                    out.write(") throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_8.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_25_8.setTagInfo(_td_c_get_25_8);
                    _jettag_c_get_25_8.doStart(context, out);
                    _jettag_c_get_25_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_63.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_25_63.setTagInfo(_td_c_get_25_63);
                    _jettag_c_get_25_63.doStart(context, out);
                    _jettag_c_get_25_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_115.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_25_115.setTagInfo(_td_c_get_25_115);
                    _jettag_c_get_25_115.doStart(context, out);
                    _jettag_c_get_25_115.doEnd();
                    out.write("(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_25_167 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_25_167); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_25_167.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_java_import_25_167.setTagInfo(_td_java_import_25_167);
                    _jettag_java_import_25_167.doStart(context, out);
                    JET2Writer _jettag_java_import_25_167_saved_out = out;
                    while (_jettag_java_import_25_167.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_25_167.handleBodyContent(out);
                    }
                    out = _jettag_java_import_25_167_saved_out;
                    _jettag_java_import_25_167.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_25_215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_215); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_25_215.setRuntimeParent(_jettag_c_if_22_1);
                    _jettag_c_get_25_215.setTagInfo(_td_c_get_25_215);
                    _jettag_c_get_25_215.doStart(context, out);
                    _jettag_c_get_25_215.doEnd();
                    out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_22_1.handleBodyContent(out);
                }
                _jettag_c_if_22_1.doEnd();
                _jettag_c_if_6_1.handleBodyContent(out);
            }
            _jettag_c_if_6_1.doEnd();
            RuntimeTagElement _jettag_c_if_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_28_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_28_1.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_28_1.setTagInfo(_td_c_if_28_1);
            _jettag_c_if_28_1.doStart(context, out);
            while (_jettag_c_if_28_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_29_1.setRuntimeParent(_jettag_c_if_28_1);
                _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
                _jettag_c_if_29_1.doStart(context, out);
                while (_jettag_c_if_29_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_8.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_30_8.setTagInfo(_td_c_get_30_8);
                    _jettag_c_get_30_8.doStart(context, out);
                    _jettag_c_get_30_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_63.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_30_63.setTagInfo(_td_c_get_30_63);
                    _jettag_c_get_30_63.doStart(context, out);
                    _jettag_c_get_30_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_115.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_30_115.setTagInfo(_td_c_get_30_115);
                    _jettag_c_get_30_115.doStart(context, out);
                    _jettag_c_get_30_115.doEnd();
                    out.write("Field(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_179); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_179.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_30_179.setTagInfo(_td_c_get_30_179);
                    _jettag_c_get_30_179.doStart(context, out);
                    _jettag_c_get_30_179.doEnd();
                    out.write("Field) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_8.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_32_8.setTagInfo(_td_c_get_32_8);
                    _jettag_c_get_32_8.doStart(context, out);
                    _jettag_c_get_32_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_63.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_32_63.setTagInfo(_td_c_get_32_63);
                    _jettag_c_get_32_63.doStart(context, out);
                    _jettag_c_get_32_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_115.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_32_115.setTagInfo(_td_c_get_32_115);
                    _jettag_c_get_32_115.doStart(context, out);
                    _jettag_c_get_32_115.doEnd();
                    out.write("Field(String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_32_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_179); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_32_179.setRuntimeParent(_jettag_c_if_29_1);
                    _jettag_c_get_32_179.setTagInfo(_td_c_get_32_179);
                    _jettag_c_get_32_179.doStart(context, out);
                    _jettag_c_get_32_179.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_29_1.handleBodyContent(out);
                }
                _jettag_c_if_29_1.doEnd();
                RuntimeTagElement _jettag_c_if_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_34_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_34_1.setRuntimeParent(_jettag_c_if_28_1);
                _jettag_c_if_34_1.setTagInfo(_td_c_if_34_1);
                _jettag_c_if_34_1.doStart(context, out);
                while (_jettag_c_if_34_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_8.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_35_8.setTagInfo(_td_c_get_35_8);
                    _jettag_c_get_35_8.doStart(context, out);
                    _jettag_c_get_35_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_63.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_35_63.setTagInfo(_td_c_get_35_63);
                    _jettag_c_get_35_63.doStart(context, out);
                    _jettag_c_get_35_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_115.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_35_115.setTagInfo(_td_c_get_35_115);
                    _jettag_c_get_35_115.doStart(context, out);
                    _jettag_c_get_35_115.doEnd();
                    out.write("Field(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_180.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_35_180.setTagInfo(_td_c_get_35_180);
                    _jettag_c_get_35_180.doStart(context, out);
                    _jettag_c_get_35_180.doEnd();
                    out.write("Field) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_37_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_8.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_37_8.setTagInfo(_td_c_get_37_8);
                    _jettag_c_get_37_8.doStart(context, out);
                    _jettag_c_get_37_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_37_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_63.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_37_63.setTagInfo(_td_c_get_37_63);
                    _jettag_c_get_37_63.doStart(context, out);
                    _jettag_c_get_37_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_37_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_115.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_37_115.setTagInfo(_td_c_get_37_115);
                    _jettag_c_get_37_115.doStart(context, out);
                    _jettag_c_get_37_115.doEnd();
                    out.write("Field(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_37_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_180); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_180.setRuntimeParent(_jettag_c_if_34_1);
                    _jettag_c_get_37_180.setTagInfo(_td_c_get_37_180);
                    _jettag_c_get_37_180.doStart(context, out);
                    _jettag_c_get_37_180.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_34_1.handleBodyContent(out);
                }
                _jettag_c_if_34_1.doEnd();
                RuntimeTagElement _jettag_c_if_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_39_1.setRuntimeParent(_jettag_c_if_28_1);
                _jettag_c_if_39_1.setTagInfo(_td_c_if_39_1);
                _jettag_c_if_39_1.doStart(context, out);
                while (_jettag_c_if_39_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_8.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_40_8.setTagInfo(_td_c_get_40_8);
                    _jettag_c_get_40_8.doStart(context, out);
                    _jettag_c_get_40_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_63.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_40_63.setTagInfo(_td_c_get_40_63);
                    _jettag_c_get_40_63.doStart(context, out);
                    _jettag_c_get_40_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_115.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_40_115.setTagInfo(_td_c_get_40_115);
                    _jettag_c_get_40_115.doStart(context, out);
                    _jettag_c_get_40_115.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_40_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_40_172); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_40_172.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_java_import_40_172.setTagInfo(_td_java_import_40_172);
                    _jettag_java_import_40_172.doStart(context, out);
                    JET2Writer _jettag_java_import_40_172_saved_out = out;
                    while (_jettag_java_import_40_172.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_40_172.handleBodyContent(out);
                    }
                    out = _jettag_java_import_40_172_saved_out;
                    _jettag_java_import_40_172.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_214 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_214); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_214.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_40_214.setTagInfo(_td_c_get_40_214);
                    _jettag_c_get_40_214.doStart(context, out);
                    _jettag_c_get_40_214.doEnd();
                    out.write("Field) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_8.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_42_8.setTagInfo(_td_c_get_42_8);
                    _jettag_c_get_42_8.doStart(context, out);
                    _jettag_c_get_42_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_63.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_42_63.setTagInfo(_td_c_get_42_63);
                    _jettag_c_get_42_63.doStart(context, out);
                    _jettag_c_get_42_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_115.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_42_115.setTagInfo(_td_c_get_42_115);
                    _jettag_c_get_42_115.doStart(context, out);
                    _jettag_c_get_42_115.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_42_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_42_172); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_42_172.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_java_import_42_172.setTagInfo(_td_java_import_42_172);
                    _jettag_java_import_42_172.doStart(context, out);
                    JET2Writer _jettag_java_import_42_172_saved_out = out;
                    while (_jettag_java_import_42_172.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_42_172.handleBodyContent(out);
                    }
                    out = _jettag_java_import_42_172_saved_out;
                    _jettag_java_import_42_172.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_214 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_214); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_214.setRuntimeParent(_jettag_c_if_39_1);
                    _jettag_c_get_42_214.setTagInfo(_td_c_get_42_214);
                    _jettag_c_get_42_214.doStart(context, out);
                    _jettag_c_get_42_214.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_39_1.handleBodyContent(out);
                }
                _jettag_c_if_39_1.doEnd();
                RuntimeTagElement _jettag_c_if_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_44_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_44_1.setRuntimeParent(_jettag_c_if_28_1);
                _jettag_c_if_44_1.setTagInfo(_td_c_if_44_1);
                _jettag_c_if_44_1.doStart(context, out);
                while (_jettag_c_if_44_1.okToProcessBody()) {
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_8.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_45_8.setTagInfo(_td_c_get_45_8);
                    _jettag_c_get_45_8.doStart(context, out);
                    _jettag_c_get_45_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_63.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_45_63.setTagInfo(_td_c_get_45_63);
                    _jettag_c_get_45_63.doStart(context, out);
                    _jettag_c_get_45_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_115.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_45_115.setTagInfo(_td_c_get_45_115);
                    _jettag_c_get_45_115.doStart(context, out);
                    _jettag_c_get_45_115.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_45_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_45_172); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_45_172.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_java_import_45_172.setTagInfo(_td_java_import_45_172);
                    _jettag_java_import_45_172.doStart(context, out);
                    JET2Writer _jettag_java_import_45_172_saved_out = out;
                    while (_jettag_java_import_45_172.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_45_172.handleBodyContent(out);
                    }
                    out = _jettag_java_import_45_172_saved_out;
                    _jettag_java_import_45_172.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_45_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_220.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_45_220.setTagInfo(_td_c_get_45_220);
                    _jettag_c_get_45_220.doStart(context, out);
                    _jettag_c_get_45_220.doEnd();
                    out.write("Field) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write(NL);         
                    out.write("public ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_47_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_47_8.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_47_8.setTagInfo(_td_c_get_47_8);
                    _jettag_c_get_47_8.doStart(context, out);
                    _jettag_c_get_47_8.doEnd();
                    out.write(" find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_47_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_63); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_47_63.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_47_63.setTagInfo(_td_c_get_47_63);
                    _jettag_c_get_47_63.doStart(context, out);
                    _jettag_c_get_47_63.doEnd();
                    out.write("By");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_47_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_115); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_47_115.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_47_115.setTagInfo(_td_c_get_47_115);
                    _jettag_c_get_47_115.doStart(context, out);
                    _jettag_c_get_47_115.doEnd();
                    out.write("Field(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_47_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_47_172); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_47_172.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_java_import_47_172.setTagInfo(_td_java_import_47_172);
                    _jettag_java_import_47_172.doStart(context, out);
                    JET2Writer _jettag_java_import_47_172_saved_out = out;
                    while (_jettag_java_import_47_172.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_47_172.handleBodyContent(out);
                    }
                    out = _jettag_java_import_47_172_saved_out;
                    _jettag_java_import_47_172.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_47_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_47_220.setRuntimeParent(_jettag_c_if_44_1);
                    _jettag_c_get_47_220.setTagInfo(_td_c_get_47_220);
                    _jettag_c_get_47_220.doStart(context, out);
                    _jettag_c_get_47_220.doEnd();
                    out.write("Field, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_44_1.handleBodyContent(out);
                }
                _jettag_c_if_44_1.doEnd();
                _jettag_c_if_28_1.handleBodyContent(out);
            }
            _jettag_c_if_28_1.doEnd();
            _jettag_c_iterate_5_1.handleBodyContent(out);
        }
        _jettag_c_iterate_5_1.doEnd();
    }
}
