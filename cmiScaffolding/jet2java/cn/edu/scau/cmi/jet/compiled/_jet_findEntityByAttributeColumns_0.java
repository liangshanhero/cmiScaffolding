package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByAttributeColumns_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByAttributeColumns_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='BINARY'or$attribute/@type='VARBINARY'or$attribute/@type='POINT'or$attribute/@type='LINESTRING'or$attribute/@type='POLYGON'or$attribute/@type='GEOMETRY'or$attribute/@type='MULTIPOINT'or$attribute/@type='MULTILINESTRING'or$attribute/@type='MULTIPOLYGON'or$attribute/@type='TINYBLOB'or$attribute/@type='BLOB'or$attribute/@type='MEDIUMBLOB'or$attribute/@type='LONGBLOB'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_8 = new TagInfo("java:import", //$NON-NLS-1$
            3, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_49 = new TagInfo("c:get", //$NON-NLS-1$
            3, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_105 = new TagInfo("c:get", //$NON-NLS-1$
            3, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_157 = new TagInfo("c:get", //$NON-NLS-1$
            3, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_215 = new TagInfo("c:get", //$NON-NLS-1$
            3, 215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_258 = new TagInfo("java:import", //$NON-NLS-1$
            3, 258,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_12 = new TagInfo("c:get", //$NON-NLS-1$
            5, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_68 = new TagInfo("c:get", //$NON-NLS-1$
            5, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_120 = new TagInfo("c:get", //$NON-NLS-1$
            5, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_178 = new TagInfo("c:get", //$NON-NLS-1$
            5, 178,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_12 = new TagInfo("c:get", //$NON-NLS-1$
            7, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_68 = new TagInfo("c:get", //$NON-NLS-1$
            7, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_120 = new TagInfo("c:get", //$NON-NLS-1$
            7, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_188 = new TagInfo("c:get", //$NON-NLS-1$
            7, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_12 = new TagInfo("c:get", //$NON-NLS-1$
            9, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_68 = new TagInfo("c:get", //$NON-NLS-1$
            9, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_120 = new TagInfo("c:get", //$NON-NLS-1$
            9, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_188 = new TagInfo("c:get", //$NON-NLS-1$
            9, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_1 = new TagInfo("c:if", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='CHAR'or$attribute/@type='VARCHAR'or$attribute/@type='SET'or$attribute/@type='ENUM'or$attribute/@type='TINYTEXT'or$attribute/@type='TEXT'or$attribute/@type='MEDIUMTEXT'or$attribute/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_8 = new TagInfo("java:import", //$NON-NLS-1$
            12, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_12_49 = new TagInfo("c:get", //$NON-NLS-1$
            12, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_105 = new TagInfo("c:get", //$NON-NLS-1$
            12, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_157 = new TagInfo("c:get", //$NON-NLS-1$
            12, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_215 = new TagInfo("c:get", //$NON-NLS-1$
            12, 215,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_258 = new TagInfo("java:import", //$NON-NLS-1$
            12, 258,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_12 = new TagInfo("c:get", //$NON-NLS-1$
            14, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_68 = new TagInfo("c:get", //$NON-NLS-1$
            14, 68,
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
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_178 = new TagInfo("c:get", //$NON-NLS-1$
            14, 178,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_12 = new TagInfo("c:get", //$NON-NLS-1$
            16, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_68 = new TagInfo("c:get", //$NON-NLS-1$
            16, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_120 = new TagInfo("c:get", //$NON-NLS-1$
            16, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_188 = new TagInfo("c:get", //$NON-NLS-1$
            16, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_12 = new TagInfo("c:get", //$NON-NLS-1$
            18, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_68 = new TagInfo("c:get", //$NON-NLS-1$
            18, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_120 = new TagInfo("c:get", //$NON-NLS-1$
            18, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_188 = new TagInfo("c:get", //$NON-NLS-1$
            18, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_1 = new TagInfo("c:if", //$NON-NLS-1$
            20, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='DOUBLE'or$attribute/@type='FLOAT'or$attribute/@type='REAL'or$attribute/@type='DECIMAL'or$attribute/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_8 = new TagInfo("java:import", //$NON-NLS-1$
            21, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_21_49 = new TagInfo("c:get", //$NON-NLS-1$
            21, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_105 = new TagInfo("c:get", //$NON-NLS-1$
            21, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_157 = new TagInfo("c:get", //$NON-NLS-1$
            21, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_208 = new TagInfo("java:import", //$NON-NLS-1$
            21, 208,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_21_256 = new TagInfo("c:get", //$NON-NLS-1$
            21, 256,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_299 = new TagInfo("java:import", //$NON-NLS-1$
            21, 299,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_23_12 = new TagInfo("c:get", //$NON-NLS-1$
            23, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_68 = new TagInfo("c:get", //$NON-NLS-1$
            23, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_120 = new TagInfo("c:get", //$NON-NLS-1$
            23, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_182 = new TagInfo("c:get", //$NON-NLS-1$
            23, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_12 = new TagInfo("c:get", //$NON-NLS-1$
            25, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_68 = new TagInfo("c:get", //$NON-NLS-1$
            25, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_120 = new TagInfo("c:get", //$NON-NLS-1$
            25, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_192 = new TagInfo("c:get", //$NON-NLS-1$
            25, 192,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_12 = new TagInfo("c:get", //$NON-NLS-1$
            27, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_68 = new TagInfo("c:get", //$NON-NLS-1$
            27, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_120 = new TagInfo("c:get", //$NON-NLS-1$
            27, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_192 = new TagInfo("c:get", //$NON-NLS-1$
            27, 192,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='SMALLINT'or$attribute/@type='MEDIUMINT'or$attribute/@type='INT'or$attribute/@type='INTEGER'or$attribute/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_30_8 = new TagInfo("java:import", //$NON-NLS-1$
            30, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_30_49 = new TagInfo("c:get", //$NON-NLS-1$
            30, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_105 = new TagInfo("c:get", //$NON-NLS-1$
            30, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_157 = new TagInfo("c:get", //$NON-NLS-1$
            30, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_216 = new TagInfo("c:get", //$NON-NLS-1$
            30, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_30_259 = new TagInfo("java:import", //$NON-NLS-1$
            30, 259,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_32_12 = new TagInfo("c:get", //$NON-NLS-1$
            32, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_68 = new TagInfo("c:get", //$NON-NLS-1$
            32, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_120 = new TagInfo("c:get", //$NON-NLS-1$
            32, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_179 = new TagInfo("c:get", //$NON-NLS-1$
            32, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_12 = new TagInfo("c:get", //$NON-NLS-1$
            34, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_68 = new TagInfo("c:get", //$NON-NLS-1$
            34, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_120 = new TagInfo("c:get", //$NON-NLS-1$
            34, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_189 = new TagInfo("c:get", //$NON-NLS-1$
            34, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_12 = new TagInfo("c:get", //$NON-NLS-1$
            36, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_68 = new TagInfo("c:get", //$NON-NLS-1$
            36, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_120 = new TagInfo("c:get", //$NON-NLS-1$
            36, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_189 = new TagInfo("c:get", //$NON-NLS-1$
            36, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_38_1 = new TagInfo("c:if", //$NON-NLS-1$
            38, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_39_8 = new TagInfo("java:import", //$NON-NLS-1$
            39, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_39_49 = new TagInfo("c:get", //$NON-NLS-1$
            39, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_105 = new TagInfo("c:get", //$NON-NLS-1$
            39, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_157 = new TagInfo("c:get", //$NON-NLS-1$
            39, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_39_208 = new TagInfo("java:import", //$NON-NLS-1$
            39, 208,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_39_250 = new TagInfo("c:get", //$NON-NLS-1$
            39, 250,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_39_293 = new TagInfo("java:import", //$NON-NLS-1$
            39, 293,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_41_12 = new TagInfo("c:get", //$NON-NLS-1$
            41, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_68 = new TagInfo("c:get", //$NON-NLS-1$
            41, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_120 = new TagInfo("c:get", //$NON-NLS-1$
            41, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_176 = new TagInfo("c:get", //$NON-NLS-1$
            41, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_12 = new TagInfo("c:get", //$NON-NLS-1$
            43, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_68 = new TagInfo("c:get", //$NON-NLS-1$
            43, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_120 = new TagInfo("c:get", //$NON-NLS-1$
            43, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_186 = new TagInfo("c:get", //$NON-NLS-1$
            43, 186,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_12 = new TagInfo("c:get", //$NON-NLS-1$
            45, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_68 = new TagInfo("c:get", //$NON-NLS-1$
            45, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_120 = new TagInfo("c:get", //$NON-NLS-1$
            45, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_186 = new TagInfo("c:get", //$NON-NLS-1$
            45, 186,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_1 = new TagInfo("c:if", //$NON-NLS-1$
            47, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TINYINT'or$attribute/@type='BIT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_48_8 = new TagInfo("java:import", //$NON-NLS-1$
            48, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_48_49 = new TagInfo("c:get", //$NON-NLS-1$
            48, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_105 = new TagInfo("c:get", //$NON-NLS-1$
            48, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_157 = new TagInfo("c:get", //$NON-NLS-1$
            48, 157,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_216 = new TagInfo("c:get", //$NON-NLS-1$
            48, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_48_259 = new TagInfo("java:import", //$NON-NLS-1$
            48, 259,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_50_12 = new TagInfo("c:get", //$NON-NLS-1$
            50, 12,
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
    private static final TagInfo _td_c_get_50_120 = new TagInfo("c:get", //$NON-NLS-1$
            50, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_179 = new TagInfo("c:get", //$NON-NLS-1$
            50, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_12 = new TagInfo("c:get", //$NON-NLS-1$
            52, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_68 = new TagInfo("c:get", //$NON-NLS-1$
            52, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_120 = new TagInfo("c:get", //$NON-NLS-1$
            52, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_189 = new TagInfo("c:get", //$NON-NLS-1$
            52, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_12 = new TagInfo("c:get", //$NON-NLS-1$
            54, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_68 = new TagInfo("c:get", //$NON-NLS-1$
            54, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_120 = new TagInfo("c:get", //$NON-NLS-1$
            54, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_189 = new TagInfo("c:get", //$NON-NLS-1$
            54, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_2_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
            _jettag_c_if_2_1.doStart(context, out);
            while (_jettag_c_if_2_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_3_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_3_8.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_java_import_3_8.setTagInfo(_td_java_import_3_8);
                _jettag_java_import_3_8.doStart(context, out);
                JET2Writer _jettag_java_import_3_8_saved_out = out;
                while (_jettag_java_import_3_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_3_8.handleBodyContent(out);
                }
                out = _jettag_java_import_3_8_saved_out;
                _jettag_java_import_3_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_49.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_3_49.setTagInfo(_td_c_get_3_49);
                _jettag_c_get_3_49.doStart(context, out);
                _jettag_c_get_3_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_105.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_3_105.setTagInfo(_td_c_get_3_105);
                _jettag_c_get_3_105.doStart(context, out);
                _jettag_c_get_3_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_157.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_3_157.setTagInfo(_td_c_get_3_157);
                _jettag_c_get_3_157.doStart(context, out);
                _jettag_c_get_3_157.doEnd();
                out.write("(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_215); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_215.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_3_215.setTagInfo(_td_c_get_3_215);
                _jettag_c_get_3_215.doStart(context, out);
                _jettag_c_get_3_215.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_3_258 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_258); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_3_258.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_java_import_3_258.setTagInfo(_td_java_import_3_258);
                _jettag_java_import_3_258.doStart(context, out);
                JET2Writer _jettag_java_import_3_258_saved_out = out;
                while (_jettag_java_import_3_258.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_3_258.handleBodyContent(out);
                }
                out = _jettag_java_import_3_258_saved_out;
                _jettag_java_import_3_258.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_12.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_5_12.setTagInfo(_td_c_get_5_12);
                _jettag_c_get_5_12.doStart(context, out);
                _jettag_c_get_5_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_68.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_5_68.setTagInfo(_td_c_get_5_68);
                _jettag_c_get_5_68.doStart(context, out);
                _jettag_c_get_5_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_120.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_5_120.setTagInfo(_td_c_get_5_120);
                _jettag_c_get_5_120.doStart(context, out);
                _jettag_c_get_5_120.doEnd();
                out.write("(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_178 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_178); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_178.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_5_178.setTagInfo(_td_c_get_5_178);
                _jettag_c_get_5_178.doStart(context, out);
                _jettag_c_get_5_178.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_12.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_7_12.setTagInfo(_td_c_get_7_12);
                _jettag_c_get_7_12.doStart(context, out);
                _jettag_c_get_7_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_68.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_7_68.setTagInfo(_td_c_get_7_68);
                _jettag_c_get_7_68.doStart(context, out);
                _jettag_c_get_7_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_120.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_7_120.setTagInfo(_td_c_get_7_120);
                _jettag_c_get_7_120.doStart(context, out);
                _jettag_c_get_7_120.doEnd();
                out.write("Containing(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_188.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_7_188.setTagInfo(_td_c_get_7_188);
                _jettag_c_get_7_188.doStart(context, out);
                _jettag_c_get_7_188.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_12.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_9_12.setTagInfo(_td_c_get_9_12);
                _jettag_c_get_9_12.doStart(context, out);
                _jettag_c_get_9_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_68.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_9_68.setTagInfo(_td_c_get_9_68);
                _jettag_c_get_9_68.doStart(context, out);
                _jettag_c_get_9_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_120.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_9_120.setTagInfo(_td_c_get_9_120);
                _jettag_c_get_9_120.doStart(context, out);
                _jettag_c_get_9_120.doEnd();
                out.write("Containing(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_188.setRuntimeParent(_jettag_c_if_2_1);
                _jettag_c_get_9_188.setTagInfo(_td_c_get_9_188);
                _jettag_c_get_9_188.doStart(context, out);
                _jettag_c_get_9_188.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_2_1.handleBodyContent(out);
            }
            _jettag_c_if_2_1.doEnd();
            RuntimeTagElement _jettag_c_if_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_11_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_11_1.setTagInfo(_td_c_if_11_1);
            _jettag_c_if_11_1.doStart(context, out);
            while (_jettag_c_if_11_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_12_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_12_8.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_java_import_12_8.setTagInfo(_td_java_import_12_8);
                _jettag_java_import_12_8.doStart(context, out);
                JET2Writer _jettag_java_import_12_8_saved_out = out;
                while (_jettag_java_import_12_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_12_8.handleBodyContent(out);
                }
                out = _jettag_java_import_12_8_saved_out;
                _jettag_java_import_12_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_49.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_12_49.setTagInfo(_td_c_get_12_49);
                _jettag_c_get_12_49.doStart(context, out);
                _jettag_c_get_12_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_105.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_12_105.setTagInfo(_td_c_get_12_105);
                _jettag_c_get_12_105.doStart(context, out);
                _jettag_c_get_12_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_157.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_12_157.setTagInfo(_td_c_get_12_157);
                _jettag_c_get_12_157.doStart(context, out);
                _jettag_c_get_12_157.doEnd();
                out.write("(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_215 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_215); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_215.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_12_215.setTagInfo(_td_c_get_12_215);
                _jettag_c_get_12_215.doStart(context, out);
                _jettag_c_get_12_215.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_12_258 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_258); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_12_258.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_java_import_12_258.setTagInfo(_td_java_import_12_258);
                _jettag_java_import_12_258.doStart(context, out);
                JET2Writer _jettag_java_import_12_258_saved_out = out;
                while (_jettag_java_import_12_258.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_12_258.handleBodyContent(out);
                }
                out = _jettag_java_import_12_258_saved_out;
                _jettag_java_import_12_258.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_12.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_14_12.setTagInfo(_td_c_get_14_12);
                _jettag_c_get_14_12.doStart(context, out);
                _jettag_c_get_14_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_68.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_14_68.setTagInfo(_td_c_get_14_68);
                _jettag_c_get_14_68.doStart(context, out);
                _jettag_c_get_14_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_120.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_14_120.setTagInfo(_td_c_get_14_120);
                _jettag_c_get_14_120.doStart(context, out);
                _jettag_c_get_14_120.doEnd();
                out.write("(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_178 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_178); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_178.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_14_178.setTagInfo(_td_c_get_14_178);
                _jettag_c_get_14_178.doStart(context, out);
                _jettag_c_get_14_178.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_12.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_16_12.setTagInfo(_td_c_get_16_12);
                _jettag_c_get_16_12.doStart(context, out);
                _jettag_c_get_16_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_68.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_16_68.setTagInfo(_td_c_get_16_68);
                _jettag_c_get_16_68.doStart(context, out);
                _jettag_c_get_16_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_120.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_16_120.setTagInfo(_td_c_get_16_120);
                _jettag_c_get_16_120.doStart(context, out);
                _jettag_c_get_16_120.doEnd();
                out.write("Containing(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_16_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_16_188.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_16_188.setTagInfo(_td_c_get_16_188);
                _jettag_c_get_16_188.doStart(context, out);
                _jettag_c_get_16_188.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_12.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_18_12.setTagInfo(_td_c_get_18_12);
                _jettag_c_get_18_12.doStart(context, out);
                _jettag_c_get_18_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_68.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_18_68.setTagInfo(_td_c_get_18_68);
                _jettag_c_get_18_68.doStart(context, out);
                _jettag_c_get_18_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_120.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_18_120.setTagInfo(_td_c_get_18_120);
                _jettag_c_get_18_120.doStart(context, out);
                _jettag_c_get_18_120.doEnd();
                out.write("Containing(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_188.setRuntimeParent(_jettag_c_if_11_1);
                _jettag_c_get_18_188.setTagInfo(_td_c_get_18_188);
                _jettag_c_get_18_188.doStart(context, out);
                _jettag_c_get_18_188.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_11_1.handleBodyContent(out);
            }
            _jettag_c_if_11_1.doEnd();
            RuntimeTagElement _jettag_c_if_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_20_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_20_1.setTagInfo(_td_c_if_20_1);
            _jettag_c_if_20_1.doStart(context, out);
            while (_jettag_c_if_20_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_8.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_java_import_21_8.setTagInfo(_td_java_import_21_8);
                _jettag_java_import_21_8.doStart(context, out);
                JET2Writer _jettag_java_import_21_8_saved_out = out;
                while (_jettag_java_import_21_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_21_8.handleBodyContent(out);
                }
                out = _jettag_java_import_21_8_saved_out;
                _jettag_java_import_21_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_49.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_21_49.setTagInfo(_td_c_get_21_49);
                _jettag_c_get_21_49.doStart(context, out);
                _jettag_c_get_21_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_105.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_21_105.setTagInfo(_td_c_get_21_105);
                _jettag_c_get_21_105.doStart(context, out);
                _jettag_c_get_21_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_157.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_21_157.setTagInfo(_td_c_get_21_157);
                _jettag_c_get_21_157.doStart(context, out);
                _jettag_c_get_21_157.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_208 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_208); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_208.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_java_import_21_208.setTagInfo(_td_java_import_21_208);
                _jettag_java_import_21_208.doStart(context, out);
                JET2Writer _jettag_java_import_21_208_saved_out = out;
                while (_jettag_java_import_21_208.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                    _jettag_java_import_21_208.handleBodyContent(out);
                }
                out = _jettag_java_import_21_208_saved_out;
                _jettag_java_import_21_208.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_256 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_256); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_256.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_21_256.setTagInfo(_td_c_get_21_256);
                _jettag_c_get_21_256.doStart(context, out);
                _jettag_c_get_21_256.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_21_299 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_299); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_21_299.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_java_import_21_299.setTagInfo(_td_java_import_21_299);
                _jettag_java_import_21_299.doStart(context, out);
                JET2Writer _jettag_java_import_21_299_saved_out = out;
                while (_jettag_java_import_21_299.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_21_299.handleBodyContent(out);
                }
                out = _jettag_java_import_21_299_saved_out;
                _jettag_java_import_21_299.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_12.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_23_12.setTagInfo(_td_c_get_23_12);
                _jettag_c_get_23_12.doStart(context, out);
                _jettag_c_get_23_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_68.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_23_68.setTagInfo(_td_c_get_23_68);
                _jettag_c_get_23_68.doStart(context, out);
                _jettag_c_get_23_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_120.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_23_120.setTagInfo(_td_c_get_23_120);
                _jettag_c_get_23_120.doStart(context, out);
                _jettag_c_get_23_120.doEnd();
                out.write("(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_182); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_182.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_23_182.setTagInfo(_td_c_get_23_182);
                _jettag_c_get_23_182.doStart(context, out);
                _jettag_c_get_23_182.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_12.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_25_12.setTagInfo(_td_c_get_25_12);
                _jettag_c_get_25_12.doStart(context, out);
                _jettag_c_get_25_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_68.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_25_68.setTagInfo(_td_c_get_25_68);
                _jettag_c_get_25_68.doStart(context, out);
                _jettag_c_get_25_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_120.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_25_120.setTagInfo(_td_c_get_25_120);
                _jettag_c_get_25_120.doStart(context, out);
                _jettag_c_get_25_120.doEnd();
                out.write("Containing(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_192 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_192); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_192.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_25_192.setTagInfo(_td_c_get_25_192);
                _jettag_c_get_25_192.doStart(context, out);
                _jettag_c_get_25_192.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_12.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_27_12.setTagInfo(_td_c_get_27_12);
                _jettag_c_get_27_12.doStart(context, out);
                _jettag_c_get_27_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_68.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_27_68.setTagInfo(_td_c_get_27_68);
                _jettag_c_get_27_68.doStart(context, out);
                _jettag_c_get_27_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_120.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_27_120.setTagInfo(_td_c_get_27_120);
                _jettag_c_get_27_120.doStart(context, out);
                _jettag_c_get_27_120.doEnd();
                out.write("Containing(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_192 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_192); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_192.setRuntimeParent(_jettag_c_if_20_1);
                _jettag_c_get_27_192.setTagInfo(_td_c_get_27_192);
                _jettag_c_get_27_192.doStart(context, out);
                _jettag_c_get_27_192.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_20_1.handleBodyContent(out);
            }
            _jettag_c_if_20_1.doEnd();
            RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_29_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
            _jettag_c_if_29_1.doStart(context, out);
            while (_jettag_c_if_29_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_30_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_30_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_30_8.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_java_import_30_8.setTagInfo(_td_java_import_30_8);
                _jettag_java_import_30_8.doStart(context, out);
                JET2Writer _jettag_java_import_30_8_saved_out = out;
                while (_jettag_java_import_30_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_30_8.handleBodyContent(out);
                }
                out = _jettag_java_import_30_8_saved_out;
                _jettag_java_import_30_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_30_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_49.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_30_49.setTagInfo(_td_c_get_30_49);
                _jettag_c_get_30_49.doStart(context, out);
                _jettag_c_get_30_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_30_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_105.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_30_105.setTagInfo(_td_c_get_30_105);
                _jettag_c_get_30_105.doStart(context, out);
                _jettag_c_get_30_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_30_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_157.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_30_157.setTagInfo(_td_c_get_30_157);
                _jettag_c_get_30_157.doStart(context, out);
                _jettag_c_get_30_157.doEnd();
                out.write("(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_30_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_216); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_30_216.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_30_216.setTagInfo(_td_c_get_30_216);
                _jettag_c_get_30_216.doStart(context, out);
                _jettag_c_get_30_216.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_30_259 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_30_259); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_30_259.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_java_import_30_259.setTagInfo(_td_java_import_30_259);
                _jettag_java_import_30_259.doStart(context, out);
                JET2Writer _jettag_java_import_30_259_saved_out = out;
                while (_jettag_java_import_30_259.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_30_259.handleBodyContent(out);
                }
                out = _jettag_java_import_30_259_saved_out;
                _jettag_java_import_30_259.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_12.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_32_12.setTagInfo(_td_c_get_32_12);
                _jettag_c_get_32_12.doStart(context, out);
                _jettag_c_get_32_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_68.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_32_68.setTagInfo(_td_c_get_32_68);
                _jettag_c_get_32_68.doStart(context, out);
                _jettag_c_get_32_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_120.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_32_120.setTagInfo(_td_c_get_32_120);
                _jettag_c_get_32_120.doStart(context, out);
                _jettag_c_get_32_120.doEnd();
                out.write("(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_179.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_32_179.setTagInfo(_td_c_get_32_179);
                _jettag_c_get_32_179.doStart(context, out);
                _jettag_c_get_32_179.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_12.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_34_12.setTagInfo(_td_c_get_34_12);
                _jettag_c_get_34_12.doStart(context, out);
                _jettag_c_get_34_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_68.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_34_68.setTagInfo(_td_c_get_34_68);
                _jettag_c_get_34_68.doStart(context, out);
                _jettag_c_get_34_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_120.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_34_120.setTagInfo(_td_c_get_34_120);
                _jettag_c_get_34_120.doStart(context, out);
                _jettag_c_get_34_120.doEnd();
                out.write("Containing(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_189.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_34_189.setTagInfo(_td_c_get_34_189);
                _jettag_c_get_34_189.doStart(context, out);
                _jettag_c_get_34_189.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_12.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_36_12.setTagInfo(_td_c_get_36_12);
                _jettag_c_get_36_12.doStart(context, out);
                _jettag_c_get_36_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_68.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_36_68.setTagInfo(_td_c_get_36_68);
                _jettag_c_get_36_68.doStart(context, out);
                _jettag_c_get_36_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_120.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_36_120.setTagInfo(_td_c_get_36_120);
                _jettag_c_get_36_120.doStart(context, out);
                _jettag_c_get_36_120.doEnd();
                out.write("Containing(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_189.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_36_189.setTagInfo(_td_c_get_36_189);
                _jettag_c_get_36_189.doStart(context, out);
                _jettag_c_get_36_189.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_29_1.handleBodyContent(out);
            }
            _jettag_c_if_29_1.doEnd();
            RuntimeTagElement _jettag_c_if_38_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_38_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_38_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_38_1.setTagInfo(_td_c_if_38_1);
            _jettag_c_if_38_1.doStart(context, out);
            while (_jettag_c_if_38_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_39_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_39_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_39_8.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_java_import_39_8.setTagInfo(_td_java_import_39_8);
                _jettag_java_import_39_8.doStart(context, out);
                JET2Writer _jettag_java_import_39_8_saved_out = out;
                while (_jettag_java_import_39_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_39_8.handleBodyContent(out);
                }
                out = _jettag_java_import_39_8_saved_out;
                _jettag_java_import_39_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_49.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_39_49.setTagInfo(_td_c_get_39_49);
                _jettag_c_get_39_49.doStart(context, out);
                _jettag_c_get_39_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_105.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_39_105.setTagInfo(_td_c_get_39_105);
                _jettag_c_get_39_105.doStart(context, out);
                _jettag_c_get_39_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_157.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_39_157.setTagInfo(_td_c_get_39_157);
                _jettag_c_get_39_157.doStart(context, out);
                _jettag_c_get_39_157.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_39_208 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_39_208); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_39_208.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_java_import_39_208.setTagInfo(_td_java_import_39_208);
                _jettag_java_import_39_208.doStart(context, out);
                JET2Writer _jettag_java_import_39_208_saved_out = out;
                while (_jettag_java_import_39_208.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Date");  //$NON-NLS-1$        
                    _jettag_java_import_39_208.handleBodyContent(out);
                }
                out = _jettag_java_import_39_208_saved_out;
                _jettag_java_import_39_208.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_250 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_250); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_250.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_39_250.setTagInfo(_td_c_get_39_250);
                _jettag_c_get_39_250.doStart(context, out);
                _jettag_c_get_39_250.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_39_293 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_39_293); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_39_293.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_java_import_39_293.setTagInfo(_td_java_import_39_293);
                _jettag_java_import_39_293.doStart(context, out);
                JET2Writer _jettag_java_import_39_293_saved_out = out;
                while (_jettag_java_import_39_293.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_39_293.handleBodyContent(out);
                }
                out = _jettag_java_import_39_293_saved_out;
                _jettag_java_import_39_293.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_41_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_12.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_41_12.setTagInfo(_td_c_get_41_12);
                _jettag_c_get_41_12.doStart(context, out);
                _jettag_c_get_41_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_41_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_68.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_41_68.setTagInfo(_td_c_get_41_68);
                _jettag_c_get_41_68.doStart(context, out);
                _jettag_c_get_41_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_41_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_120.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_41_120.setTagInfo(_td_c_get_41_120);
                _jettag_c_get_41_120.doStart(context, out);
                _jettag_c_get_41_120.doEnd();
                out.write("(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_41_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_41_176.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_41_176.setTagInfo(_td_c_get_41_176);
                _jettag_c_get_41_176.doStart(context, out);
                _jettag_c_get_41_176.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_43_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_12.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_43_12.setTagInfo(_td_c_get_43_12);
                _jettag_c_get_43_12.doStart(context, out);
                _jettag_c_get_43_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_43_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_68.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_43_68.setTagInfo(_td_c_get_43_68);
                _jettag_c_get_43_68.doStart(context, out);
                _jettag_c_get_43_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_43_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_120.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_43_120.setTagInfo(_td_c_get_43_120);
                _jettag_c_get_43_120.doStart(context, out);
                _jettag_c_get_43_120.doEnd();
                out.write("Containing(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_43_186 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_186); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_186.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_43_186.setTagInfo(_td_c_get_43_186);
                _jettag_c_get_43_186.doStart(context, out);
                _jettag_c_get_43_186.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_12.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_45_12.setTagInfo(_td_c_get_45_12);
                _jettag_c_get_45_12.doStart(context, out);
                _jettag_c_get_45_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_68.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_45_68.setTagInfo(_td_c_get_45_68);
                _jettag_c_get_45_68.doStart(context, out);
                _jettag_c_get_45_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_120.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_45_120.setTagInfo(_td_c_get_45_120);
                _jettag_c_get_45_120.doStart(context, out);
                _jettag_c_get_45_120.doEnd();
                out.write("Containing(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_186 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_186); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_186.setRuntimeParent(_jettag_c_if_38_1);
                _jettag_c_get_45_186.setTagInfo(_td_c_get_45_186);
                _jettag_c_get_45_186.doStart(context, out);
                _jettag_c_get_45_186.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_38_1.handleBodyContent(out);
            }
            _jettag_c_if_38_1.doEnd();
            RuntimeTagElement _jettag_c_if_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_47_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_47_1.setTagInfo(_td_c_if_47_1);
            _jettag_c_if_47_1.doStart(context, out);
            while (_jettag_c_if_47_1.okToProcessBody()) {
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_48_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_48_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_48_8.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_java_import_48_8.setTagInfo(_td_java_import_48_8);
                _jettag_java_import_48_8.doStart(context, out);
                JET2Writer _jettag_java_import_48_8_saved_out = out;
                while (_jettag_java_import_48_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Set");  //$NON-NLS-1$        
                    _jettag_java_import_48_8.handleBodyContent(out);
                }
                out = _jettag_java_import_48_8_saved_out;
                _jettag_java_import_48_8.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_49.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_48_49.setTagInfo(_td_c_get_48_49);
                _jettag_c_get_48_49.doStart(context, out);
                _jettag_c_get_48_49.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_105); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_105.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_48_105.setTagInfo(_td_c_get_48_105);
                _jettag_c_get_48_105.doStart(context, out);
                _jettag_c_get_48_105.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_157 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_157); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_157.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_48_157.setTagInfo(_td_c_get_48_157);
                _jettag_c_get_48_157.doStart(context, out);
                _jettag_c_get_48_157.doEnd();
                out.write("(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_216); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_216.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_48_216.setTagInfo(_td_c_get_48_216);
                _jettag_c_get_48_216.doStart(context, out);
                _jettag_c_get_48_216.doEnd();
                out.write(") throws ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_48_259 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_48_259); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_48_259.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_java_import_48_259.setTagInfo(_td_java_import_48_259);
                _jettag_java_import_48_259.doStart(context, out);
                JET2Writer _jettag_java_import_48_259_saved_out = out;
                while (_jettag_java_import_48_259.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
                    _jettag_java_import_48_259.handleBodyContent(out);
                }
                out = _jettag_java_import_48_259_saved_out;
                _jettag_java_import_48_259.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_12.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_50_12.setTagInfo(_td_c_get_50_12);
                _jettag_c_get_50_12.doStart(context, out);
                _jettag_c_get_50_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_68.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_50_68.setTagInfo(_td_c_get_50_68);
                _jettag_c_get_50_68.doStart(context, out);
                _jettag_c_get_50_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_120.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_50_120.setTagInfo(_td_c_get_50_120);
                _jettag_c_get_50_120.doStart(context, out);
                _jettag_c_get_50_120.doEnd();
                out.write("(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_179.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_50_179.setTagInfo(_td_c_get_50_179);
                _jettag_c_get_50_179.doStart(context, out);
                _jettag_c_get_50_179.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_12.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_52_12.setTagInfo(_td_c_get_52_12);
                _jettag_c_get_52_12.doStart(context, out);
                _jettag_c_get_52_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_68.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_52_68.setTagInfo(_td_c_get_52_68);
                _jettag_c_get_52_68.doStart(context, out);
                _jettag_c_get_52_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_120.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_52_120.setTagInfo(_td_c_get_52_120);
                _jettag_c_get_52_120.doStart(context, out);
                _jettag_c_get_52_120.doEnd();
                out.write("Containing(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_189.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_52_189.setTagInfo(_td_c_get_52_189);
                _jettag_c_get_52_189.doStart(context, out);
                _jettag_c_get_52_189.doEnd();
                out.write("_1) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("public Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_54_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_12.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_54_12.setTagInfo(_td_c_get_54_12);
                _jettag_c_get_54_12.doStart(context, out);
                _jettag_c_get_54_12.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_54_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_68.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_54_68.setTagInfo(_td_c_get_54_68);
                _jettag_c_get_54_68.doStart(context, out);
                _jettag_c_get_54_68.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_54_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_120); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_120.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_54_120.setTagInfo(_td_c_get_54_120);
                _jettag_c_get_54_120.doStart(context, out);
                _jettag_c_get_54_120.doEnd();
                out.write("Containing(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_54_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_54_189.setRuntimeParent(_jettag_c_if_47_1);
                _jettag_c_get_54_189.setTagInfo(_td_c_get_54_189);
                _jettag_c_get_54_189.doStart(context, out);
                _jettag_c_get_54_189.doEnd();
                out.write("_1, int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_47_1.handleBodyContent(out);
            }
            _jettag_c_if_47_1.doEnd();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
    }
}
