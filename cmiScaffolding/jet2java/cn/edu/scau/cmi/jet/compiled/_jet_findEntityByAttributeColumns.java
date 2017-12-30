package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByAttributeColumns implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByAttributeColumns() {
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
    private static final TagInfo _td_c_if_2_2 = new TagInfo("c:if", //$NON-NLS-1$
            2, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='BINARY'or$attribute/@type='VARBINARY'or$attribute/@type='POINT'or$attribute/@type='LINESTRING'or$attribute/@type='POLYGON'or$attribute/@type='GEOMETRY'or$attribute/@type='MULTIPOINT'or$attribute/@type='MULTILINESTRING'or$attribute/@type='MULTIPOLYGON'or$attribute/@type='TINYBLOB'or$attribute/@type='BLOB'or$attribute/@type='MEDIUMBLOB'or$attribute/@type='LONGBLOB'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_13 = new TagInfo("c:get", //$NON-NLS-1$
            4, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_69 = new TagInfo("c:get", //$NON-NLS-1$
            4, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_121 = new TagInfo("c:get", //$NON-NLS-1$
            4, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_179 = new TagInfo("c:get", //$NON-NLS-1$
            4, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_14 = new TagInfo("c:get", //$NON-NLS-1$
            6, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_66 = new TagInfo("c:get", //$NON-NLS-1$
            6, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_117 = new TagInfo("c:get", //$NON-NLS-1$
            6, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_13 = new TagInfo("c:get", //$NON-NLS-1$
            11, 13,
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
    private static final TagInfo _td_c_get_11_121 = new TagInfo("c:get", //$NON-NLS-1$
            11, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_179 = new TagInfo("c:get", //$NON-NLS-1$
            11, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_39 = new TagInfo("c:get", //$NON-NLS-1$
            12, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_91 = new TagInfo("c:get", //$NON-NLS-1$
            12, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_166 = new TagInfo("c:get", //$NON-NLS-1$
            12, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_28 = new TagInfo("c:get", //$NON-NLS-1$
            13, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_13 = new TagInfo("c:get", //$NON-NLS-1$
            17, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_69 = new TagInfo("c:get", //$NON-NLS-1$
            17, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_121 = new TagInfo("c:get", //$NON-NLS-1$
            17, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_189 = new TagInfo("c:get", //$NON-NLS-1$
            17, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_14 = new TagInfo("c:get", //$NON-NLS-1$
            19, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_66 = new TagInfo("c:get", //$NON-NLS-1$
            19, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_127 = new TagInfo("c:get", //$NON-NLS-1$
            19, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_13 = new TagInfo("c:get", //$NON-NLS-1$
            24, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_69 = new TagInfo("c:get", //$NON-NLS-1$
            24, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_121 = new TagInfo("c:get", //$NON-NLS-1$
            24, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_189 = new TagInfo("c:get", //$NON-NLS-1$
            24, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_39 = new TagInfo("c:get", //$NON-NLS-1$
            25, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_91 = new TagInfo("c:get", //$NON-NLS-1$
            25, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_176 = new TagInfo("c:get", //$NON-NLS-1$
            25, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_26_14 = new TagInfo("java:import", //$NON-NLS-1$
            26, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_26_65 = new TagInfo("c:get", //$NON-NLS-1$
            26, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='CHAR'or$attribute/@type='VARCHAR'or$attribute/@type='SET'or$attribute/@type='ENUM'or$attribute/@type='TINYTEXT'or$attribute/@type='TEXT'or$attribute/@type='MEDIUMTEXT'or$attribute/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_13 = new TagInfo("c:get", //$NON-NLS-1$
            31, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_69 = new TagInfo("c:get", //$NON-NLS-1$
            31, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_121 = new TagInfo("c:get", //$NON-NLS-1$
            31, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_179 = new TagInfo("c:get", //$NON-NLS-1$
            31, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_14 = new TagInfo("c:get", //$NON-NLS-1$
            33, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_66 = new TagInfo("c:get", //$NON-NLS-1$
            33, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_117 = new TagInfo("c:get", //$NON-NLS-1$
            33, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_13 = new TagInfo("c:get", //$NON-NLS-1$
            38, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_69 = new TagInfo("c:get", //$NON-NLS-1$
            38, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_121 = new TagInfo("c:get", //$NON-NLS-1$
            38, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_179 = new TagInfo("c:get", //$NON-NLS-1$
            38, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_39 = new TagInfo("c:get", //$NON-NLS-1$
            39, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_91 = new TagInfo("c:get", //$NON-NLS-1$
            39, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_166 = new TagInfo("c:get", //$NON-NLS-1$
            39, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_28 = new TagInfo("c:get", //$NON-NLS-1$
            40, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_13 = new TagInfo("c:get", //$NON-NLS-1$
            44, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_69 = new TagInfo("c:get", //$NON-NLS-1$
            44, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_121 = new TagInfo("c:get", //$NON-NLS-1$
            44, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_189 = new TagInfo("c:get", //$NON-NLS-1$
            44, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_14 = new TagInfo("c:get", //$NON-NLS-1$
            46, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_66 = new TagInfo("c:get", //$NON-NLS-1$
            46, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_127 = new TagInfo("c:get", //$NON-NLS-1$
            46, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_13 = new TagInfo("c:get", //$NON-NLS-1$
            51, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_69 = new TagInfo("c:get", //$NON-NLS-1$
            51, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_121 = new TagInfo("c:get", //$NON-NLS-1$
            51, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_189 = new TagInfo("c:get", //$NON-NLS-1$
            51, 189,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_39 = new TagInfo("c:get", //$NON-NLS-1$
            52, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_91 = new TagInfo("c:get", //$NON-NLS-1$
            52, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_176 = new TagInfo("c:get", //$NON-NLS-1$
            52, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_53_14 = new TagInfo("java:import", //$NON-NLS-1$
            53, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_53_65 = new TagInfo("c:get", //$NON-NLS-1$
            53, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_1 = new TagInfo("c:if", //$NON-NLS-1$
            56, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='DOUBLE'or$attribute/@type='FLOAT'or$attribute/@type='REAL'or$attribute/@type='DECIMAL'or$attribute/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_13 = new TagInfo("c:get", //$NON-NLS-1$
            58, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_69 = new TagInfo("c:get", //$NON-NLS-1$
            58, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_121 = new TagInfo("c:get", //$NON-NLS-1$
            58, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_58_172 = new TagInfo("java:import", //$NON-NLS-1$
            58, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_58_220 = new TagInfo("c:get", //$NON-NLS-1$
            58, 220,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_14 = new TagInfo("c:get", //$NON-NLS-1$
            60, 14,
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
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_117 = new TagInfo("c:get", //$NON-NLS-1$
            60, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_13 = new TagInfo("c:get", //$NON-NLS-1$
            65, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_69 = new TagInfo("c:get", //$NON-NLS-1$
            65, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_121 = new TagInfo("c:get", //$NON-NLS-1$
            65, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_183 = new TagInfo("c:get", //$NON-NLS-1$
            65, 183,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_39 = new TagInfo("c:get", //$NON-NLS-1$
            66, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_91 = new TagInfo("c:get", //$NON-NLS-1$
            66, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_166 = new TagInfo("c:get", //$NON-NLS-1$
            66, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_28 = new TagInfo("c:get", //$NON-NLS-1$
            67, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_13 = new TagInfo("c:get", //$NON-NLS-1$
            71, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_69 = new TagInfo("c:get", //$NON-NLS-1$
            71, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_121 = new TagInfo("c:get", //$NON-NLS-1$
            71, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_193 = new TagInfo("c:get", //$NON-NLS-1$
            71, 193,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_14 = new TagInfo("c:get", //$NON-NLS-1$
            73, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_66 = new TagInfo("c:get", //$NON-NLS-1$
            73, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_127 = new TagInfo("c:get", //$NON-NLS-1$
            73, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_13 = new TagInfo("c:get", //$NON-NLS-1$
            78, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_69 = new TagInfo("c:get", //$NON-NLS-1$
            78, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_121 = new TagInfo("c:get", //$NON-NLS-1$
            78, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_78_193 = new TagInfo("c:get", //$NON-NLS-1$
            78, 193,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_39 = new TagInfo("c:get", //$NON-NLS-1$
            79, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_91 = new TagInfo("c:get", //$NON-NLS-1$
            79, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_176 = new TagInfo("c:get", //$NON-NLS-1$
            79, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_80_14 = new TagInfo("java:import", //$NON-NLS-1$
            80, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_80_65 = new TagInfo("c:get", //$NON-NLS-1$
            80, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_83_1 = new TagInfo("c:if", //$NON-NLS-1$
            83, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='SMALLINT'or$attribute/@type='MEDIUMINT'or$attribute/@type='INT'or$attribute/@type='INTEGER'or$attribute/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_13 = new TagInfo("c:get", //$NON-NLS-1$
            85, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_69 = new TagInfo("c:get", //$NON-NLS-1$
            85, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_121 = new TagInfo("c:get", //$NON-NLS-1$
            85, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_180 = new TagInfo("c:get", //$NON-NLS-1$
            85, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_14 = new TagInfo("c:get", //$NON-NLS-1$
            87, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_66 = new TagInfo("c:get", //$NON-NLS-1$
            87, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_117 = new TagInfo("c:get", //$NON-NLS-1$
            87, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_13 = new TagInfo("c:get", //$NON-NLS-1$
            92, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_69 = new TagInfo("c:get", //$NON-NLS-1$
            92, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_121 = new TagInfo("c:get", //$NON-NLS-1$
            92, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_180 = new TagInfo("c:get", //$NON-NLS-1$
            92, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_39 = new TagInfo("c:get", //$NON-NLS-1$
            93, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_91 = new TagInfo("c:get", //$NON-NLS-1$
            93, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_166 = new TagInfo("c:get", //$NON-NLS-1$
            93, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_28 = new TagInfo("c:get", //$NON-NLS-1$
            94, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_13 = new TagInfo("c:get", //$NON-NLS-1$
            98, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_69 = new TagInfo("c:get", //$NON-NLS-1$
            98, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_121 = new TagInfo("c:get", //$NON-NLS-1$
            98, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_98_190 = new TagInfo("c:get", //$NON-NLS-1$
            98, 190,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_14 = new TagInfo("c:get", //$NON-NLS-1$
            100, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_66 = new TagInfo("c:get", //$NON-NLS-1$
            100, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_127 = new TagInfo("c:get", //$NON-NLS-1$
            100, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_13 = new TagInfo("c:get", //$NON-NLS-1$
            105, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_69 = new TagInfo("c:get", //$NON-NLS-1$
            105, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_121 = new TagInfo("c:get", //$NON-NLS-1$
            105, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_105_190 = new TagInfo("c:get", //$NON-NLS-1$
            105, 190,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_39 = new TagInfo("c:get", //$NON-NLS-1$
            106, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_91 = new TagInfo("c:get", //$NON-NLS-1$
            106, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_176 = new TagInfo("c:get", //$NON-NLS-1$
            106, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_107_14 = new TagInfo("java:import", //$NON-NLS-1$
            107, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_107_65 = new TagInfo("c:get", //$NON-NLS-1$
            107, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_110_1 = new TagInfo("c:if", //$NON-NLS-1$
            110, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_13 = new TagInfo("c:get", //$NON-NLS-1$
            112, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_69 = new TagInfo("c:get", //$NON-NLS-1$
            112, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_121 = new TagInfo("c:get", //$NON-NLS-1$
            112, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_112_172 = new TagInfo("java:import", //$NON-NLS-1$
            112, 172,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_112_214 = new TagInfo("c:get", //$NON-NLS-1$
            112, 214,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_14 = new TagInfo("c:get", //$NON-NLS-1$
            114, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_66 = new TagInfo("c:get", //$NON-NLS-1$
            114, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_114_117 = new TagInfo("c:get", //$NON-NLS-1$
            114, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_13 = new TagInfo("c:get", //$NON-NLS-1$
            119, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_69 = new TagInfo("c:get", //$NON-NLS-1$
            119, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_121 = new TagInfo("c:get", //$NON-NLS-1$
            119, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_177 = new TagInfo("c:get", //$NON-NLS-1$
            119, 177,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_39 = new TagInfo("c:get", //$NON-NLS-1$
            120, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_91 = new TagInfo("c:get", //$NON-NLS-1$
            120, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_166 = new TagInfo("c:get", //$NON-NLS-1$
            120, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_28 = new TagInfo("c:get", //$NON-NLS-1$
            121, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_13 = new TagInfo("c:get", //$NON-NLS-1$
            125, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_69 = new TagInfo("c:get", //$NON-NLS-1$
            125, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_121 = new TagInfo("c:get", //$NON-NLS-1$
            125, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_187 = new TagInfo("c:get", //$NON-NLS-1$
            125, 187,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_14 = new TagInfo("c:get", //$NON-NLS-1$
            127, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_66 = new TagInfo("c:get", //$NON-NLS-1$
            127, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_127_127 = new TagInfo("c:get", //$NON-NLS-1$
            127, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_13 = new TagInfo("c:get", //$NON-NLS-1$
            132, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_69 = new TagInfo("c:get", //$NON-NLS-1$
            132, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_121 = new TagInfo("c:get", //$NON-NLS-1$
            132, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_132_187 = new TagInfo("c:get", //$NON-NLS-1$
            132, 187,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_39 = new TagInfo("c:get", //$NON-NLS-1$
            133, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_91 = new TagInfo("c:get", //$NON-NLS-1$
            133, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_133_176 = new TagInfo("c:get", //$NON-NLS-1$
            133, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_134_14 = new TagInfo("java:import", //$NON-NLS-1$
            134, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_134_65 = new TagInfo("c:get", //$NON-NLS-1$
            134, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_1 = new TagInfo("c:if", //$NON-NLS-1$
            137, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TINYINT'or$attribute/@type='BIT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_13 = new TagInfo("c:get", //$NON-NLS-1$
            139, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_69 = new TagInfo("c:get", //$NON-NLS-1$
            139, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_121 = new TagInfo("c:get", //$NON-NLS-1$
            139, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_180 = new TagInfo("c:get", //$NON-NLS-1$
            139, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_14 = new TagInfo("c:get", //$NON-NLS-1$
            141, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_66 = new TagInfo("c:get", //$NON-NLS-1$
            141, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_141_117 = new TagInfo("c:get", //$NON-NLS-1$
            141, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_13 = new TagInfo("c:get", //$NON-NLS-1$
            146, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_69 = new TagInfo("c:get", //$NON-NLS-1$
            146, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_121 = new TagInfo("c:get", //$NON-NLS-1$
            146, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_146_180 = new TagInfo("c:get", //$NON-NLS-1$
            146, 180,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_39 = new TagInfo("c:get", //$NON-NLS-1$
            147, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_91 = new TagInfo("c:get", //$NON-NLS-1$
            147, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_147_166 = new TagInfo("c:get", //$NON-NLS-1$
            147, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_148_28 = new TagInfo("c:get", //$NON-NLS-1$
            148, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_13 = new TagInfo("c:get", //$NON-NLS-1$
            152, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_69 = new TagInfo("c:get", //$NON-NLS-1$
            152, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_121 = new TagInfo("c:get", //$NON-NLS-1$
            152, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_152_190 = new TagInfo("c:get", //$NON-NLS-1$
            152, 190,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_14 = new TagInfo("c:get", //$NON-NLS-1$
            154, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_66 = new TagInfo("c:get", //$NON-NLS-1$
            154, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_154_127 = new TagInfo("c:get", //$NON-NLS-1$
            154, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_13 = new TagInfo("c:get", //$NON-NLS-1$
            159, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_69 = new TagInfo("c:get", //$NON-NLS-1$
            159, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_121 = new TagInfo("c:get", //$NON-NLS-1$
            159, 121,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_190 = new TagInfo("c:get", //$NON-NLS-1$
            159, 190,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_39 = new TagInfo("c:get", //$NON-NLS-1$
            160, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_91 = new TagInfo("c:get", //$NON-NLS-1$
            160, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_176 = new TagInfo("c:get", //$NON-NLS-1$
            160, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_161_14 = new TagInfo("java:import", //$NON-NLS-1$
            161, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_161_65 = new TagInfo("c:get", //$NON-NLS-1$
            161, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_2_2.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_2_2.setTagInfo(_td_c_if_2_2);
            _jettag_c_if_2_2.doStart(context, out);
            while (_jettag_c_if_2_2.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_13.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_4_13.setTagInfo(_td_c_get_4_13);
                _jettag_c_get_4_13.doStart(context, out);
                _jettag_c_get_4_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_69.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_4_69.setTagInfo(_td_c_get_4_69);
                _jettag_c_get_4_69.doStart(context, out);
                _jettag_c_get_4_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_121.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_4_121.setTagInfo(_td_c_get_4_121);
                _jettag_c_get_4_121.doStart(context, out);
                _jettag_c_get_4_121.doEnd();
                out.write("(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_179.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_4_179.setTagInfo(_td_c_get_4_179);
                _jettag_c_get_4_179.doStart(context, out);
                _jettag_c_get_4_179.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_14.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_6_14.setTagInfo(_td_c_get_6_14);
                _jettag_c_get_6_14.doStart(context, out);
                _jettag_c_get_6_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_66.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_6_66.setTagInfo(_td_c_get_6_66);
                _jettag_c_get_6_66.doStart(context, out);
                _jettag_c_get_6_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_117.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_6_117.setTagInfo(_td_c_get_6_117);
                _jettag_c_get_6_117.doStart(context, out);
                _jettag_c_get_6_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_13.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_11_13.setTagInfo(_td_c_get_11_13);
                _jettag_c_get_11_13.doStart(context, out);
                _jettag_c_get_11_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_69.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_11_69.setTagInfo(_td_c_get_11_69);
                _jettag_c_get_11_69.doStart(context, out);
                _jettag_c_get_11_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_121.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_11_121.setTagInfo(_td_c_get_11_121);
                _jettag_c_get_11_121.doStart(context, out);
                _jettag_c_get_11_121.doEnd();
                out.write("(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_179.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_11_179.setTagInfo(_td_c_get_11_179);
                _jettag_c_get_11_179.doStart(context, out);
                _jettag_c_get_11_179.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_39.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_12_39.setTagInfo(_td_c_get_12_39);
                _jettag_c_get_12_39.doStart(context, out);
                _jettag_c_get_12_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_91.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_12_91.setTagInfo(_td_c_get_12_91);
                _jettag_c_get_12_91.doStart(context, out);
                _jettag_c_get_12_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_166.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_12_166.setTagInfo(_td_c_get_12_166);
                _jettag_c_get_12_166.doStart(context, out);
                _jettag_c_get_12_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_28.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_13_28.setTagInfo(_td_c_get_13_28);
                _jettag_c_get_13_28.doStart(context, out);
                _jettag_c_get_13_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_13.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_17_13.setTagInfo(_td_c_get_17_13);
                _jettag_c_get_17_13.doStart(context, out);
                _jettag_c_get_17_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_69.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_17_69.setTagInfo(_td_c_get_17_69);
                _jettag_c_get_17_69.doStart(context, out);
                _jettag_c_get_17_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_121.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_17_121.setTagInfo(_td_c_get_17_121);
                _jettag_c_get_17_121.doStart(context, out);
                _jettag_c_get_17_121.doEnd();
                out.write("Containing(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_189.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_17_189.setTagInfo(_td_c_get_17_189);
                _jettag_c_get_17_189.doStart(context, out);
                _jettag_c_get_17_189.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_14.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_19_14.setTagInfo(_td_c_get_19_14);
                _jettag_c_get_19_14.doStart(context, out);
                _jettag_c_get_19_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_66.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_19_66.setTagInfo(_td_c_get_19_66);
                _jettag_c_get_19_66.doStart(context, out);
                _jettag_c_get_19_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_127.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_19_127.setTagInfo(_td_c_get_19_127);
                _jettag_c_get_19_127.doStart(context, out);
                _jettag_c_get_19_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_13.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_24_13.setTagInfo(_td_c_get_24_13);
                _jettag_c_get_24_13.doStart(context, out);
                _jettag_c_get_24_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_69.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_24_69.setTagInfo(_td_c_get_24_69);
                _jettag_c_get_24_69.doStart(context, out);
                _jettag_c_get_24_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_121.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_24_121.setTagInfo(_td_c_get_24_121);
                _jettag_c_get_24_121.doStart(context, out);
                _jettag_c_get_24_121.doEnd();
                out.write("Containing(byte[] ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_189.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_24_189.setTagInfo(_td_c_get_24_189);
                _jettag_c_get_24_189.doStart(context, out);
                _jettag_c_get_24_189.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_39.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_25_39.setTagInfo(_td_c_get_25_39);
                _jettag_c_get_25_39.doStart(context, out);
                _jettag_c_get_25_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_91.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_25_91.setTagInfo(_td_c_get_25_91);
                _jettag_c_get_25_91.doStart(context, out);
                _jettag_c_get_25_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_176.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_25_176.setTagInfo(_td_c_get_25_176);
                _jettag_c_get_25_176.doStart(context, out);
                _jettag_c_get_25_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_26_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_26_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_26_14.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_java_import_26_14.setTagInfo(_td_java_import_26_14);
                _jettag_java_import_26_14.doStart(context, out);
                JET2Writer _jettag_java_import_26_14_saved_out = out;
                while (_jettag_java_import_26_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_26_14.handleBodyContent(out);
                }
                out = _jettag_java_import_26_14_saved_out;
                _jettag_java_import_26_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_65.setRuntimeParent(_jettag_c_if_2_2);
                _jettag_c_get_26_65.setTagInfo(_td_c_get_26_65);
                _jettag_c_get_26_65.doStart(context, out);
                _jettag_c_get_26_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_2_2.handleBodyContent(out);
            }
            _jettag_c_if_2_2.doEnd();
            RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_29_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
            _jettag_c_if_29_1.doStart(context, out);
            while (_jettag_c_if_29_1.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_13.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_31_13.setTagInfo(_td_c_get_31_13);
                _jettag_c_get_31_13.doStart(context, out);
                _jettag_c_get_31_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_69.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_31_69.setTagInfo(_td_c_get_31_69);
                _jettag_c_get_31_69.doStart(context, out);
                _jettag_c_get_31_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_121.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_31_121.setTagInfo(_td_c_get_31_121);
                _jettag_c_get_31_121.doStart(context, out);
                _jettag_c_get_31_121.doEnd();
                out.write("(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_31_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_31_179.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_31_179.setTagInfo(_td_c_get_31_179);
                _jettag_c_get_31_179.doStart(context, out);
                _jettag_c_get_31_179.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_14.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_33_14.setTagInfo(_td_c_get_33_14);
                _jettag_c_get_33_14.doStart(context, out);
                _jettag_c_get_33_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_66.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_33_66.setTagInfo(_td_c_get_33_66);
                _jettag_c_get_33_66.doStart(context, out);
                _jettag_c_get_33_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_117.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_33_117.setTagInfo(_td_c_get_33_117);
                _jettag_c_get_33_117.doStart(context, out);
                _jettag_c_get_33_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_13.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_38_13.setTagInfo(_td_c_get_38_13);
                _jettag_c_get_38_13.doStart(context, out);
                _jettag_c_get_38_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_69.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_38_69.setTagInfo(_td_c_get_38_69);
                _jettag_c_get_38_69.doStart(context, out);
                _jettag_c_get_38_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_121.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_38_121.setTagInfo(_td_c_get_38_121);
                _jettag_c_get_38_121.doStart(context, out);
                _jettag_c_get_38_121.doEnd();
                out.write("(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_179.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_38_179.setTagInfo(_td_c_get_38_179);
                _jettag_c_get_38_179.doStart(context, out);
                _jettag_c_get_38_179.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_39.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_39_39.setTagInfo(_td_c_get_39_39);
                _jettag_c_get_39_39.doStart(context, out);
                _jettag_c_get_39_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_91.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_39_91.setTagInfo(_td_c_get_39_91);
                _jettag_c_get_39_91.doStart(context, out);
                _jettag_c_get_39_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_166.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_39_166.setTagInfo(_td_c_get_39_166);
                _jettag_c_get_39_166.doStart(context, out);
                _jettag_c_get_39_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_40_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_28.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_40_28.setTagInfo(_td_c_get_40_28);
                _jettag_c_get_40_28.doStart(context, out);
                _jettag_c_get_40_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_13.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_44_13.setTagInfo(_td_c_get_44_13);
                _jettag_c_get_44_13.doStart(context, out);
                _jettag_c_get_44_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_69.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_44_69.setTagInfo(_td_c_get_44_69);
                _jettag_c_get_44_69.doStart(context, out);
                _jettag_c_get_44_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_121.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_44_121.setTagInfo(_td_c_get_44_121);
                _jettag_c_get_44_121.doStart(context, out);
                _jettag_c_get_44_121.doEnd();
                out.write("Containing(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_189.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_44_189.setTagInfo(_td_c_get_44_189);
                _jettag_c_get_44_189.doStart(context, out);
                _jettag_c_get_44_189.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_46_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_14.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_46_14.setTagInfo(_td_c_get_46_14);
                _jettag_c_get_46_14.doStart(context, out);
                _jettag_c_get_46_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_46_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_66.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_46_66.setTagInfo(_td_c_get_46_66);
                _jettag_c_get_46_66.doStart(context, out);
                _jettag_c_get_46_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_46_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_127.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_46_127.setTagInfo(_td_c_get_46_127);
                _jettag_c_get_46_127.doStart(context, out);
                _jettag_c_get_46_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_13.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_51_13.setTagInfo(_td_c_get_51_13);
                _jettag_c_get_51_13.doStart(context, out);
                _jettag_c_get_51_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_69.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_51_69.setTagInfo(_td_c_get_51_69);
                _jettag_c_get_51_69.doStart(context, out);
                _jettag_c_get_51_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_121.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_51_121.setTagInfo(_td_c_get_51_121);
                _jettag_c_get_51_121.doStart(context, out);
                _jettag_c_get_51_121.doEnd();
                out.write("Containing(String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_189); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_189.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_51_189.setTagInfo(_td_c_get_51_189);
                _jettag_c_get_51_189.doStart(context, out);
                _jettag_c_get_51_189.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_39.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_52_39.setTagInfo(_td_c_get_52_39);
                _jettag_c_get_52_39.doStart(context, out);
                _jettag_c_get_52_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_91.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_52_91.setTagInfo(_td_c_get_52_91);
                _jettag_c_get_52_91.doStart(context, out);
                _jettag_c_get_52_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_52_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_52_176.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_52_176.setTagInfo(_td_c_get_52_176);
                _jettag_c_get_52_176.doStart(context, out);
                _jettag_c_get_52_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_53_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_53_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_53_14.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_java_import_53_14.setTagInfo(_td_java_import_53_14);
                _jettag_java_import_53_14.doStart(context, out);
                JET2Writer _jettag_java_import_53_14_saved_out = out;
                while (_jettag_java_import_53_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_53_14.handleBodyContent(out);
                }
                out = _jettag_java_import_53_14_saved_out;
                _jettag_java_import_53_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_53_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_65.setRuntimeParent(_jettag_c_if_29_1);
                _jettag_c_get_53_65.setTagInfo(_td_c_get_53_65);
                _jettag_c_get_53_65.doStart(context, out);
                _jettag_c_get_53_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_29_1.handleBodyContent(out);
            }
            _jettag_c_if_29_1.doEnd();
            RuntimeTagElement _jettag_c_if_56_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_56_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_56_1.setTagInfo(_td_c_if_56_1);
            _jettag_c_if_56_1.doStart(context, out);
            while (_jettag_c_if_56_1.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_13.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_58_13.setTagInfo(_td_c_get_58_13);
                _jettag_c_get_58_13.doStart(context, out);
                _jettag_c_get_58_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_69.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_58_69.setTagInfo(_td_c_get_58_69);
                _jettag_c_get_58_69.doStart(context, out);
                _jettag_c_get_58_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_121.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_58_121.setTagInfo(_td_c_get_58_121);
                _jettag_c_get_58_121.doStart(context, out);
                _jettag_c_get_58_121.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_58_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_58_172); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_58_172.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_java_import_58_172.setTagInfo(_td_java_import_58_172);
                _jettag_java_import_58_172.doStart(context, out);
                JET2Writer _jettag_java_import_58_172_saved_out = out;
                while (_jettag_java_import_58_172.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                    _jettag_java_import_58_172.handleBodyContent(out);
                }
                out = _jettag_java_import_58_172_saved_out;
                _jettag_java_import_58_172.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_58_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_220); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_58_220.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_58_220.setTagInfo(_td_c_get_58_220);
                _jettag_c_get_58_220.doStart(context, out);
                _jettag_c_get_58_220.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_60_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_14.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_60_14.setTagInfo(_td_c_get_60_14);
                _jettag_c_get_60_14.doStart(context, out);
                _jettag_c_get_60_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_60_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_66.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_60_66.setTagInfo(_td_c_get_60_66);
                _jettag_c_get_60_66.doStart(context, out);
                _jettag_c_get_60_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_60_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_60_117.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_60_117.setTagInfo(_td_c_get_60_117);
                _jettag_c_get_60_117.doStart(context, out);
                _jettag_c_get_60_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_13.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_65_13.setTagInfo(_td_c_get_65_13);
                _jettag_c_get_65_13.doStart(context, out);
                _jettag_c_get_65_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_69.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_65_69.setTagInfo(_td_c_get_65_69);
                _jettag_c_get_65_69.doStart(context, out);
                _jettag_c_get_65_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_121.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_65_121.setTagInfo(_td_c_get_65_121);
                _jettag_c_get_65_121.doStart(context, out);
                _jettag_c_get_65_121.doEnd();
                out.write("(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_65_183 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_183); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_65_183.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_65_183.setTagInfo(_td_c_get_65_183);
                _jettag_c_get_65_183.doStart(context, out);
                _jettag_c_get_65_183.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_66_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_39.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_66_39.setTagInfo(_td_c_get_66_39);
                _jettag_c_get_66_39.doStart(context, out);
                _jettag_c_get_66_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_66_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_91.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_66_91.setTagInfo(_td_c_get_66_91);
                _jettag_c_get_66_91.doStart(context, out);
                _jettag_c_get_66_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_66_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_166.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_66_166.setTagInfo(_td_c_get_66_166);
                _jettag_c_get_66_166.doStart(context, out);
                _jettag_c_get_66_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_28.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_67_28.setTagInfo(_td_c_get_67_28);
                _jettag_c_get_67_28.doStart(context, out);
                _jettag_c_get_67_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_71_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_13.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_71_13.setTagInfo(_td_c_get_71_13);
                _jettag_c_get_71_13.doStart(context, out);
                _jettag_c_get_71_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_71_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_69.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_71_69.setTagInfo(_td_c_get_71_69);
                _jettag_c_get_71_69.doStart(context, out);
                _jettag_c_get_71_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_71_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_121.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_71_121.setTagInfo(_td_c_get_71_121);
                _jettag_c_get_71_121.doStart(context, out);
                _jettag_c_get_71_121.doEnd();
                out.write("Containing(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_71_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_71_193.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_71_193.setTagInfo(_td_c_get_71_193);
                _jettag_c_get_71_193.doStart(context, out);
                _jettag_c_get_71_193.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_73_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_14.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_73_14.setTagInfo(_td_c_get_73_14);
                _jettag_c_get_73_14.doStart(context, out);
                _jettag_c_get_73_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_73_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_66.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_73_66.setTagInfo(_td_c_get_73_66);
                _jettag_c_get_73_66.doStart(context, out);
                _jettag_c_get_73_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_73_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_73_127.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_73_127.setTagInfo(_td_c_get_73_127);
                _jettag_c_get_73_127.doStart(context, out);
                _jettag_c_get_73_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_13.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_78_13.setTagInfo(_td_c_get_78_13);
                _jettag_c_get_78_13.doStart(context, out);
                _jettag_c_get_78_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_69.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_78_69.setTagInfo(_td_c_get_78_69);
                _jettag_c_get_78_69.doStart(context, out);
                _jettag_c_get_78_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_121.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_78_121.setTagInfo(_td_c_get_78_121);
                _jettag_c_get_78_121.doStart(context, out);
                _jettag_c_get_78_121.doEnd();
                out.write("Containing(BigDecimal ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_78_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_78_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_78_193.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_78_193.setTagInfo(_td_c_get_78_193);
                _jettag_c_get_78_193.doStart(context, out);
                _jettag_c_get_78_193.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_79_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_39.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_79_39.setTagInfo(_td_c_get_79_39);
                _jettag_c_get_79_39.doStart(context, out);
                _jettag_c_get_79_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_79_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_91.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_79_91.setTagInfo(_td_c_get_79_91);
                _jettag_c_get_79_91.doStart(context, out);
                _jettag_c_get_79_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_79_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_79_176.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_79_176.setTagInfo(_td_c_get_79_176);
                _jettag_c_get_79_176.doStart(context, out);
                _jettag_c_get_79_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_80_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_80_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_80_14.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_java_import_80_14.setTagInfo(_td_java_import_80_14);
                _jettag_java_import_80_14.doStart(context, out);
                JET2Writer _jettag_java_import_80_14_saved_out = out;
                while (_jettag_java_import_80_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_80_14.handleBodyContent(out);
                }
                out = _jettag_java_import_80_14_saved_out;
                _jettag_java_import_80_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_80_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_80_65.setRuntimeParent(_jettag_c_if_56_1);
                _jettag_c_get_80_65.setTagInfo(_td_c_get_80_65);
                _jettag_c_get_80_65.doStart(context, out);
                _jettag_c_get_80_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_56_1.handleBodyContent(out);
            }
            _jettag_c_if_56_1.doEnd();
            RuntimeTagElement _jettag_c_if_83_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_83_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_83_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_83_1.setTagInfo(_td_c_if_83_1);
            _jettag_c_if_83_1.doStart(context, out);
            while (_jettag_c_if_83_1.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_85_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_13.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_85_13.setTagInfo(_td_c_get_85_13);
                _jettag_c_get_85_13.doStart(context, out);
                _jettag_c_get_85_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_85_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_69.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_85_69.setTagInfo(_td_c_get_85_69);
                _jettag_c_get_85_69.doStart(context, out);
                _jettag_c_get_85_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_85_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_121.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_85_121.setTagInfo(_td_c_get_85_121);
                _jettag_c_get_85_121.doStart(context, out);
                _jettag_c_get_85_121.doEnd();
                out.write("(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_85_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_180); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_85_180.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_85_180.setTagInfo(_td_c_get_85_180);
                _jettag_c_get_85_180.doStart(context, out);
                _jettag_c_get_85_180.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_14.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_87_14.setTagInfo(_td_c_get_87_14);
                _jettag_c_get_87_14.doStart(context, out);
                _jettag_c_get_87_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_66.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_87_66.setTagInfo(_td_c_get_87_66);
                _jettag_c_get_87_66.doStart(context, out);
                _jettag_c_get_87_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_117.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_87_117.setTagInfo(_td_c_get_87_117);
                _jettag_c_get_87_117.doStart(context, out);
                _jettag_c_get_87_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_13.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_92_13.setTagInfo(_td_c_get_92_13);
                _jettag_c_get_92_13.doStart(context, out);
                _jettag_c_get_92_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_69.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_92_69.setTagInfo(_td_c_get_92_69);
                _jettag_c_get_92_69.doStart(context, out);
                _jettag_c_get_92_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_121.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_92_121.setTagInfo(_td_c_get_92_121);
                _jettag_c_get_92_121.doStart(context, out);
                _jettag_c_get_92_121.doEnd();
                out.write("(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_92_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_180); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_92_180.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_92_180.setTagInfo(_td_c_get_92_180);
                _jettag_c_get_92_180.doStart(context, out);
                _jettag_c_get_92_180.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_93_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_39.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_93_39.setTagInfo(_td_c_get_93_39);
                _jettag_c_get_93_39.doStart(context, out);
                _jettag_c_get_93_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_93_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_91.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_93_91.setTagInfo(_td_c_get_93_91);
                _jettag_c_get_93_91.doStart(context, out);
                _jettag_c_get_93_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_93_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_93_166.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_93_166.setTagInfo(_td_c_get_93_166);
                _jettag_c_get_93_166.doStart(context, out);
                _jettag_c_get_93_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_94_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_94_28.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_94_28.setTagInfo(_td_c_get_94_28);
                _jettag_c_get_94_28.doStart(context, out);
                _jettag_c_get_94_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_98_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_98_13.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_98_13.setTagInfo(_td_c_get_98_13);
                _jettag_c_get_98_13.doStart(context, out);
                _jettag_c_get_98_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_98_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_98_69.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_98_69.setTagInfo(_td_c_get_98_69);
                _jettag_c_get_98_69.doStart(context, out);
                _jettag_c_get_98_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_98_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_98_121.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_98_121.setTagInfo(_td_c_get_98_121);
                _jettag_c_get_98_121.doStart(context, out);
                _jettag_c_get_98_121.doEnd();
                out.write("Containing(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_98_190 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_98_190); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_98_190.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_98_190.setTagInfo(_td_c_get_98_190);
                _jettag_c_get_98_190.doStart(context, out);
                _jettag_c_get_98_190.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_100_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_100_14.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_100_14.setTagInfo(_td_c_get_100_14);
                _jettag_c_get_100_14.doStart(context, out);
                _jettag_c_get_100_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_100_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_100_66.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_100_66.setTagInfo(_td_c_get_100_66);
                _jettag_c_get_100_66.doStart(context, out);
                _jettag_c_get_100_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_100_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_100_127.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_100_127.setTagInfo(_td_c_get_100_127);
                _jettag_c_get_100_127.doStart(context, out);
                _jettag_c_get_100_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_105_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_13.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_105_13.setTagInfo(_td_c_get_105_13);
                _jettag_c_get_105_13.doStart(context, out);
                _jettag_c_get_105_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_105_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_69.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_105_69.setTagInfo(_td_c_get_105_69);
                _jettag_c_get_105_69.doStart(context, out);
                _jettag_c_get_105_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_105_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_121.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_105_121.setTagInfo(_td_c_get_105_121);
                _jettag_c_get_105_121.doStart(context, out);
                _jettag_c_get_105_121.doEnd();
                out.write("Containing(Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_105_190 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_105_190); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_105_190.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_105_190.setTagInfo(_td_c_get_105_190);
                _jettag_c_get_105_190.doStart(context, out);
                _jettag_c_get_105_190.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_106_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_106_39.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_106_39.setTagInfo(_td_c_get_106_39);
                _jettag_c_get_106_39.doStart(context, out);
                _jettag_c_get_106_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_106_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_106_91.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_106_91.setTagInfo(_td_c_get_106_91);
                _jettag_c_get_106_91.doStart(context, out);
                _jettag_c_get_106_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_106_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_106_176.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_106_176.setTagInfo(_td_c_get_106_176);
                _jettag_c_get_106_176.doStart(context, out);
                _jettag_c_get_106_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_107_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_107_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_107_14.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_java_import_107_14.setTagInfo(_td_java_import_107_14);
                _jettag_java_import_107_14.doStart(context, out);
                JET2Writer _jettag_java_import_107_14_saved_out = out;
                while (_jettag_java_import_107_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_107_14.handleBodyContent(out);
                }
                out = _jettag_java_import_107_14_saved_out;
                _jettag_java_import_107_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_107_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_107_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_107_65.setRuntimeParent(_jettag_c_if_83_1);
                _jettag_c_get_107_65.setTagInfo(_td_c_get_107_65);
                _jettag_c_get_107_65.doStart(context, out);
                _jettag_c_get_107_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_83_1.handleBodyContent(out);
            }
            _jettag_c_if_83_1.doEnd();
            RuntimeTagElement _jettag_c_if_110_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_110_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_110_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_110_1.setTagInfo(_td_c_if_110_1);
            _jettag_c_if_110_1.doStart(context, out);
            while (_jettag_c_if_110_1.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_112_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_13.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_112_13.setTagInfo(_td_c_get_112_13);
                _jettag_c_get_112_13.doStart(context, out);
                _jettag_c_get_112_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_112_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_69.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_112_69.setTagInfo(_td_c_get_112_69);
                _jettag_c_get_112_69.doStart(context, out);
                _jettag_c_get_112_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_112_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_121.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_112_121.setTagInfo(_td_c_get_112_121);
                _jettag_c_get_112_121.doStart(context, out);
                _jettag_c_get_112_121.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_112_172 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_112_172); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_112_172.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_java_import_112_172.setTagInfo(_td_java_import_112_172);
                _jettag_java_import_112_172.doStart(context, out);
                JET2Writer _jettag_java_import_112_172_saved_out = out;
                while (_jettag_java_import_112_172.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Date");  //$NON-NLS-1$        
                    _jettag_java_import_112_172.handleBodyContent(out);
                }
                out = _jettag_java_import_112_172_saved_out;
                _jettag_java_import_112_172.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_112_214 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_214); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_112_214.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_112_214.setTagInfo(_td_c_get_112_214);
                _jettag_c_get_112_214.doStart(context, out);
                _jettag_c_get_112_214.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_14.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_114_14.setTagInfo(_td_c_get_114_14);
                _jettag_c_get_114_14.doStart(context, out);
                _jettag_c_get_114_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_66.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_114_66.setTagInfo(_td_c_get_114_66);
                _jettag_c_get_114_66.doStart(context, out);
                _jettag_c_get_114_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_114_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_114_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_114_117.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_114_117.setTagInfo(_td_c_get_114_117);
                _jettag_c_get_114_117.doStart(context, out);
                _jettag_c_get_114_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_119_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_119_13.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_119_13.setTagInfo(_td_c_get_119_13);
                _jettag_c_get_119_13.doStart(context, out);
                _jettag_c_get_119_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_119_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_119_69.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_119_69.setTagInfo(_td_c_get_119_69);
                _jettag_c_get_119_69.doStart(context, out);
                _jettag_c_get_119_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_119_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_119_121.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_119_121.setTagInfo(_td_c_get_119_121);
                _jettag_c_get_119_121.doStart(context, out);
                _jettag_c_get_119_121.doEnd();
                out.write("(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_119_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_177); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_119_177.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_119_177.setTagInfo(_td_c_get_119_177);
                _jettag_c_get_119_177.doStart(context, out);
                _jettag_c_get_119_177.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_120_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_120_39.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_120_39.setTagInfo(_td_c_get_120_39);
                _jettag_c_get_120_39.doStart(context, out);
                _jettag_c_get_120_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_120_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_120_91.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_120_91.setTagInfo(_td_c_get_120_91);
                _jettag_c_get_120_91.doStart(context, out);
                _jettag_c_get_120_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_120_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_120_166.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_120_166.setTagInfo(_td_c_get_120_166);
                _jettag_c_get_120_166.doStart(context, out);
                _jettag_c_get_120_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_121_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_121_28.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_121_28.setTagInfo(_td_c_get_121_28);
                _jettag_c_get_121_28.doStart(context, out);
                _jettag_c_get_121_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_13.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_125_13.setTagInfo(_td_c_get_125_13);
                _jettag_c_get_125_13.doStart(context, out);
                _jettag_c_get_125_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_69.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_125_69.setTagInfo(_td_c_get_125_69);
                _jettag_c_get_125_69.doStart(context, out);
                _jettag_c_get_125_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_121.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_125_121.setTagInfo(_td_c_get_125_121);
                _jettag_c_get_125_121.doStart(context, out);
                _jettag_c_get_125_121.doEnd();
                out.write("Containing(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_125_187 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_187); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_125_187.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_125_187.setTagInfo(_td_c_get_125_187);
                _jettag_c_get_125_187.doStart(context, out);
                _jettag_c_get_125_187.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_127_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_14.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_127_14.setTagInfo(_td_c_get_127_14);
                _jettag_c_get_127_14.doStart(context, out);
                _jettag_c_get_127_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_127_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_66.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_127_66.setTagInfo(_td_c_get_127_66);
                _jettag_c_get_127_66.doStart(context, out);
                _jettag_c_get_127_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_127_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_127_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_127_127.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_127_127.setTagInfo(_td_c_get_127_127);
                _jettag_c_get_127_127.doStart(context, out);
                _jettag_c_get_127_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_132_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_13.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_132_13.setTagInfo(_td_c_get_132_13);
                _jettag_c_get_132_13.doStart(context, out);
                _jettag_c_get_132_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_132_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_69.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_132_69.setTagInfo(_td_c_get_132_69);
                _jettag_c_get_132_69.doStart(context, out);
                _jettag_c_get_132_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_132_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_121.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_132_121.setTagInfo(_td_c_get_132_121);
                _jettag_c_get_132_121.doStart(context, out);
                _jettag_c_get_132_121.doEnd();
                out.write("Containing(Date ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_132_187 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_187); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_132_187.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_132_187.setTagInfo(_td_c_get_132_187);
                _jettag_c_get_132_187.doStart(context, out);
                _jettag_c_get_132_187.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_133_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_39.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_133_39.setTagInfo(_td_c_get_133_39);
                _jettag_c_get_133_39.doStart(context, out);
                _jettag_c_get_133_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_133_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_91.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_133_91.setTagInfo(_td_c_get_133_91);
                _jettag_c_get_133_91.doStart(context, out);
                _jettag_c_get_133_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_133_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_133_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_133_176.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_133_176.setTagInfo(_td_c_get_133_176);
                _jettag_c_get_133_176.doStart(context, out);
                _jettag_c_get_133_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_134_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_134_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_134_14.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_java_import_134_14.setTagInfo(_td_java_import_134_14);
                _jettag_java_import_134_14.doStart(context, out);
                JET2Writer _jettag_java_import_134_14_saved_out = out;
                while (_jettag_java_import_134_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_134_14.handleBodyContent(out);
                }
                out = _jettag_java_import_134_14_saved_out;
                _jettag_java_import_134_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_134_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_134_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_134_65.setRuntimeParent(_jettag_c_if_110_1);
                _jettag_c_get_134_65.setTagInfo(_td_c_get_134_65);
                _jettag_c_get_134_65.doStart(context, out);
                _jettag_c_get_134_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_110_1.handleBodyContent(out);
            }
            _jettag_c_if_110_1.doEnd();
            RuntimeTagElement _jettag_c_if_137_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_137_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_if_137_1.setTagInfo(_td_c_if_137_1);
            _jettag_c_if_137_1.doStart(context, out);
            while (_jettag_c_if_137_1.okToProcessBody()) {
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_139_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_139_13.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_139_13.setTagInfo(_td_c_get_139_13);
                _jettag_c_get_139_13.doStart(context, out);
                _jettag_c_get_139_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_139_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_139_69.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_139_69.setTagInfo(_td_c_get_139_69);
                _jettag_c_get_139_69.doStart(context, out);
                _jettag_c_get_139_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_139_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_139_121.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_139_121.setTagInfo(_td_c_get_139_121);
                _jettag_c_get_139_121.doStart(context, out);
                _jettag_c_get_139_121.doEnd();
                out.write("(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_139_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_180); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_139_180.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_139_180.setTagInfo(_td_c_get_139_180);
                _jettag_c_get_139_180.doStart(context, out);
                _jettag_c_get_139_180.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_141_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_14.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_141_14.setTagInfo(_td_c_get_141_14);
                _jettag_c_get_141_14.doStart(context, out);
                _jettag_c_get_141_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_141_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_66.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_141_66.setTagInfo(_td_c_get_141_66);
                _jettag_c_get_141_66.doStart(context, out);
                _jettag_c_get_141_66.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_141_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_141_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_141_117.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_141_117.setTagInfo(_td_c_get_141_117);
                _jettag_c_get_141_117.doStart(context, out);
                _jettag_c_get_141_117.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_146_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_146_13.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_146_13.setTagInfo(_td_c_get_146_13);
                _jettag_c_get_146_13.doStart(context, out);
                _jettag_c_get_146_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_146_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_146_69.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_146_69.setTagInfo(_td_c_get_146_69);
                _jettag_c_get_146_69.doStart(context, out);
                _jettag_c_get_146_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_146_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_146_121.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_146_121.setTagInfo(_td_c_get_146_121);
                _jettag_c_get_146_121.doStart(context, out);
                _jettag_c_get_146_121.doEnd();
                out.write("(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_146_180 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_146_180); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_146_180.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_146_180.setTagInfo(_td_c_get_146_180);
                _jettag_c_get_146_180.doStart(context, out);
                _jettag_c_get_146_180.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_147_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_39.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_147_39.setTagInfo(_td_c_get_147_39);
                _jettag_c_get_147_39.doStart(context, out);
                _jettag_c_get_147_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_147_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_91.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_147_91.setTagInfo(_td_c_get_147_91);
                _jettag_c_get_147_91.doStart(context, out);
                _jettag_c_get_147_91.doEnd();
                out.write("\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_147_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_166); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_147_166.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_147_166.setTagInfo(_td_c_get_147_166);
                _jettag_c_get_147_166.doStart(context, out);
                _jettag_c_get_147_166.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_148_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_148_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_148_28.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_148_28.setTagInfo(_td_c_get_148_28);
                _jettag_c_get_148_28.doStart(context, out);
                _jettag_c_get_148_28.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_152_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_13.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_152_13.setTagInfo(_td_c_get_152_13);
                _jettag_c_get_152_13.doStart(context, out);
                _jettag_c_get_152_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_152_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_69.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_152_69.setTagInfo(_td_c_get_152_69);
                _jettag_c_get_152_69.doStart(context, out);
                _jettag_c_get_152_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_152_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_121.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_152_121.setTagInfo(_td_c_get_152_121);
                _jettag_c_get_152_121.doStart(context, out);
                _jettag_c_get_152_121.doEnd();
                out.write("Containing(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_152_190 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_152_190); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_152_190.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_152_190.setTagInfo(_td_c_get_152_190);
                _jettag_c_get_152_190.doStart(context, out);
                _jettag_c_get_152_190.doEnd();
                out.write(") throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                out.write("\t\treturn find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_154_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_14.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_154_14.setTagInfo(_td_c_get_154_14);
                _jettag_c_get_154_14.doStart(context, out);
                _jettag_c_get_154_14.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_154_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_66.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_154_66.setTagInfo(_td_c_get_154_66);
                _jettag_c_get_154_66.doStart(context, out);
                _jettag_c_get_154_66.doEnd();
                out.write("Containing(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_154_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_154_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_154_127.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_154_127.setTagInfo(_td_c_get_154_127);
                _jettag_c_get_154_127.doStart(context, out);
                _jettag_c_get_154_127.doEnd();
                out.write(", -1, -1);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic Set<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_159_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_13.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_159_13.setTagInfo(_td_c_get_159_13);
                _jettag_c_get_159_13.doStart(context, out);
                _jettag_c_get_159_13.doEnd();
                out.write("> find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_159_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_69.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_159_69.setTagInfo(_td_c_get_159_69);
                _jettag_c_get_159_69.doStart(context, out);
                _jettag_c_get_159_69.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_159_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_121); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_121.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_159_121.setTagInfo(_td_c_get_159_121);
                _jettag_c_get_159_121.doStart(context, out);
                _jettag_c_get_159_121.doEnd();
                out.write("Containing(Boolean ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_159_190 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_190); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_159_190.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_159_190.setTagInfo(_td_c_get_159_190);
                _jettag_c_get_159_190.doStart(context, out);
                _jettag_c_get_159_190.doEnd();
                out.write(", int startResult, int maxRows) throws DataAccessException {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tQuery query = createNamedQuery(\"find");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_160_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_39.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_160_39.setTagInfo(_td_c_get_160_39);
                _jettag_c_get_160_39.doStart(context, out);
                _jettag_c_get_160_39.doEnd();
                out.write("By");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_160_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_91.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_160_91.setTagInfo(_td_c_get_160_91);
                _jettag_c_get_160_91.doStart(context, out);
                _jettag_c_get_160_91.doEnd();
                out.write("Containing\", startResult, maxRows, ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_160_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_176); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_160_176.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_160_176.setTagInfo(_td_c_get_160_176);
                _jettag_c_get_160_176.doStart(context, out);
                _jettag_c_get_160_176.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\treturn new ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_161_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_161_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_161_14.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_java_import_161_14.setTagInfo(_td_java_import_161_14);
                _jettag_java_import_161_14.doStart(context, out);
                JET2Writer _jettag_java_import_161_14_saved_out = out;
                while (_jettag_java_import_161_14.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
                    _jettag_java_import_161_14.handleBodyContent(out);
                }
                out = _jettag_java_import_161_14_saved_out;
                _jettag_java_import_161_14.doEnd();
                out.write("<");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_161_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_65); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_161_65.setRuntimeParent(_jettag_c_if_137_1);
                _jettag_c_get_161_65.setTagInfo(_td_c_get_161_65);
                _jettag_c_get_161_65.doStart(context, out);
                _jettag_c_get_161_65.doEnd();
                out.write(">(query.getResultList());");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_137_1.handleBodyContent(out);
            }
            _jettag_c_if_137_1.doEnd();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
        _jettag_c_iterate_1_1.doEnd();
    }
}
