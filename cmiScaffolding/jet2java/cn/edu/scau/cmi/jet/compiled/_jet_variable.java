package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_variable implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_variable() {
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
    private static final TagInfo _td_c_iterate_8_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_2 = new TagInfo("c:if", //$NON-NLS-1$
            9, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_18 = new TagInfo("c:get", //$NON-NLS-1$
            10, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_3 = new TagInfo("java:import", //$NON-NLS-1$
            12, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_13_2 = new TagInfo("c:if", //$NON-NLS-1$
            13, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_2 = new TagInfo("c:if", //$NON-NLS-1$
            17, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_9 = new TagInfo("c:get", //$NON-NLS-1$
            18, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_2 = new TagInfo("c:if", //$NON-NLS-1$
            20, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_9 = new TagInfo("c:get", //$NON-NLS-1$
            21, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_2 = new TagInfo("c:if", //$NON-NLS-1$
            26, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_18 = new TagInfo("c:get", //$NON-NLS-1$
            27, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_29_3 = new TagInfo("java:import", //$NON-NLS-1$
            29, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_30_2 = new TagInfo("c:if", //$NON-NLS-1$
            30, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_34_2 = new TagInfo("c:if", //$NON-NLS-1$
            34, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_10 = new TagInfo("c:get", //$NON-NLS-1$
            35, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_37_2 = new TagInfo("c:if", //$NON-NLS-1$
            37, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_10 = new TagInfo("c:get", //$NON-NLS-1$
            38, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_2 = new TagInfo("c:if", //$NON-NLS-1$
            43, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_18 = new TagInfo("c:get", //$NON-NLS-1$
            44, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_46_3 = new TagInfo("java:import", //$NON-NLS-1$
            46, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_47_2 = new TagInfo("c:if", //$NON-NLS-1$
            47, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_51_2 = new TagInfo("c:if", //$NON-NLS-1$
            51, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_52_2 = new TagInfo("java:import", //$NON-NLS-1$
            52, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_52_44 = new TagInfo("c:get", //$NON-NLS-1$
            52, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_54_2 = new TagInfo("c:if", //$NON-NLS-1$
            54, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_55_2 = new TagInfo("java:import", //$NON-NLS-1$
            55, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_55_44 = new TagInfo("c:get", //$NON-NLS-1$
            55, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_2 = new TagInfo("c:if", //$NON-NLS-1$
            60, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_18 = new TagInfo("c:get", //$NON-NLS-1$
            61, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_63_3 = new TagInfo("java:import", //$NON-NLS-1$
            63, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_64_2 = new TagInfo("c:if", //$NON-NLS-1$
            64, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_68_2 = new TagInfo("c:if", //$NON-NLS-1$
            68, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_69_2 = new TagInfo("java:import", //$NON-NLS-1$
            69, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_69_50 = new TagInfo("c:get", //$NON-NLS-1$
            69, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_2 = new TagInfo("c:if", //$NON-NLS-1$
            71, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_72_2 = new TagInfo("java:import", //$NON-NLS-1$
            72, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_72_50 = new TagInfo("c:get", //$NON-NLS-1$
            72, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_79_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            79, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_80_2 = new TagInfo("c:if", //$NON-NLS-1$
            80, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='BINARY'or$attribute/@type='VARBINARY'or$attribute/@type='POINT'or$attribute/@type='LINESTRING'or$attribute/@type='POLYGON'or$attribute/@type='GEOMETRY'or$attribute/@type='MULTIPOINT'or$attribute/@type='MULTILINESTRING'or$attribute/@type='MULTIPOLYGON'or$attribute/@type='TINYBLOB'or$attribute/@type='BLOB'or$attribute/@type='MEDIUMBLOB'or$attribute/@type='LONGBLOB'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_18 = new TagInfo("c:get", //$NON-NLS-1$
            81, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_85_2 = new TagInfo("c:choose", //$NON-NLS-1$
            85, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_86_2 = new TagInfo("c:when", //$NON-NLS-1$
            86, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_9 = new TagInfo("c:get", //$NON-NLS-1$
            87, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_89_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            89, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_90_9 = new TagInfo("c:get", //$NON-NLS-1$
            90, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_95_2 = new TagInfo("c:if", //$NON-NLS-1$
            95, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='CHAR'or$attribute/@type='VARCHAR'or$attribute/@type='SET'or$attribute/@type='ENUM'or$attribute/@type='TINYTEXT'or$attribute/@type='TEXT'or$attribute/@type='MEDIUMTEXT'or$attribute/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_18 = new TagInfo("c:get", //$NON-NLS-1$
            96, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_99_2 = new TagInfo("c:choose", //$NON-NLS-1$
            99, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_100_2 = new TagInfo("c:when", //$NON-NLS-1$
            100, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_9 = new TagInfo("c:get", //$NON-NLS-1$
            101, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_103_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            103, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_104_9 = new TagInfo("c:get", //$NON-NLS-1$
            104, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_109_2 = new TagInfo("c:if", //$NON-NLS-1$
            109, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='DOUBLE'or$attribute/@type='FLOAT'or$attribute/@type='REAL'or$attribute/@type='DECIMAL'or$attribute/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_18 = new TagInfo("c:get", //$NON-NLS-1$
            110, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_113_2 = new TagInfo("c:choose", //$NON-NLS-1$
            113, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_114_2 = new TagInfo("c:when", //$NON-NLS-1$
            114, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_115_2 = new TagInfo("java:import", //$NON-NLS-1$
            115, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_115_50 = new TagInfo("c:get", //$NON-NLS-1$
            115, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_117_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            117, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_118_2 = new TagInfo("java:import", //$NON-NLS-1$
            118, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_118_50 = new TagInfo("c:get", //$NON-NLS-1$
            118, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_123_2 = new TagInfo("c:if", //$NON-NLS-1$
            123, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='SMALLINT'or$attribute/@type='MEDIUMINT'or$attribute/@type='INT'or$attribute/@type='INTEGER'or$attribute/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_18 = new TagInfo("c:get", //$NON-NLS-1$
            124, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_127_2 = new TagInfo("c:choose", //$NON-NLS-1$
            127, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_128_2 = new TagInfo("c:when", //$NON-NLS-1$
            128, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_10 = new TagInfo("c:get", //$NON-NLS-1$
            129, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_131_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            131, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_132_10 = new TagInfo("c:get", //$NON-NLS-1$
            132, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_137_2 = new TagInfo("c:if", //$NON-NLS-1$
            137, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_139_18 = new TagInfo("c:get", //$NON-NLS-1$
            139, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_142_2 = new TagInfo("c:choose", //$NON-NLS-1$
            142, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_143_2 = new TagInfo("c:when", //$NON-NLS-1$
            143, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_144_2 = new TagInfo("java:import", //$NON-NLS-1$
            144, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_144_44 = new TagInfo("c:get", //$NON-NLS-1$
            144, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_146_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            146, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_147_2 = new TagInfo("java:import", //$NON-NLS-1$
            147, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_147_44 = new TagInfo("c:get", //$NON-NLS-1$
            147, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_152_2 = new TagInfo("c:if", //$NON-NLS-1$
            152, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TINYINT'or$attribute/@type='BIT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_153_18 = new TagInfo("c:get", //$NON-NLS-1$
            153, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_156_2 = new TagInfo("c:choose", //$NON-NLS-1$
            156, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_157_2 = new TagInfo("c:when", //$NON-NLS-1$
            157, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_158_10 = new TagInfo("c:get", //$NON-NLS-1$
            158, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_160_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            160, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_161_10 = new TagInfo("c:get", //$NON-NLS-1$
            161, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_167_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            167, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_168_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            168, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_169_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            169, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_170_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            170, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$x+1", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_172_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            172, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_173_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            173, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$y+1", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_175_2 = new TagInfo("c:choose", //$NON-NLS-1$
            175, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_176_2 = new TagInfo("c:when", //$NON-NLS-1$
            176, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($x=0)and($y=0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_178_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            178, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_179_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            179, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_180_2 = new TagInfo("c:if", //$NON-NLS-1$
            180, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_181_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            181, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_182_2 = new TagInfo("c:if", //$NON-NLS-1$
            182, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_183_18 = new TagInfo("c:get", //$NON-NLS-1$
            183, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_186_10 = new TagInfo("c:get", //$NON-NLS-1$
            186, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_190_37 = new TagInfo("c:get", //$NON-NLS-1$
            190, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_190_96 = new TagInfo("c:get", //$NON-NLS-1$
            190, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceColumn", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_2 = new TagInfo("c:get", //$NON-NLS-1$
            192, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_192_61 = new TagInfo("c:get", //$NON-NLS-1$
            192, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_198_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            198, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_199_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            199, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_201_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            201, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_202_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            202, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_203_2 = new TagInfo("c:if", //$NON-NLS-1$
            203, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_204_2 = new TagInfo("c:if", //$NON-NLS-1$
            204, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_18 = new TagInfo("c:get", //$NON-NLS-1$
            205, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_208_10 = new TagInfo("c:get", //$NON-NLS-1$
            208, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_37 = new TagInfo("c:get", //$NON-NLS-1$
            212, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_96 = new TagInfo("c:get", //$NON-NLS-1$
            212, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceColumn", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_2 = new TagInfo("c:get", //$NON-NLS-1$
            214, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_61 = new TagInfo("c:get", //$NON-NLS-1$
            214, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_223_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            223, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_224_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            224, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_225_3 = new TagInfo("c:if", //$NON-NLS-1$
            225, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_226_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            226, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_227_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            227, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_228_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            228, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_229_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            229, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_231_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            231, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_232_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            232, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_234_4 = new TagInfo("c:choose", //$NON-NLS-1$
            234, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_235_4 = new TagInfo("c:when", //$NON-NLS-1$
            235, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_26 = new TagInfo("c:get", //$NON-NLS-1$
            237, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_90 = new TagInfo("c:get", //$NON-NLS-1$
            237, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_168 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 168,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "rec", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_237_230 = new TagInfo("c:choose", //$NON-NLS-1$
            237, 230,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_237_240 = new TagInfo("c:when", //$NON-NLS-1$
            237, 240,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($rec/@referenceTable)=($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_237_297 = new TagInfo("c:get", //$NON-NLS-1$
            237, 297,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rec/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_237_334 = new TagInfo("c:otherwise", //$NON-NLS-1$
            237, 334,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_237_411 = new TagInfo("c:get", //$NON-NLS-1$
            237, 411,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced/column/@referencedColumn", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_573 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 573,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "rec", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_237_635 = new TagInfo("c:choose", //$NON-NLS-1$
            237, 635,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_237_645 = new TagInfo("c:when", //$NON-NLS-1$
            237, 645,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($rec/@referenceTable)=($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_237_711 = new TagInfo("c:otherwise", //$NON-NLS-1$
            237, 711,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_237_724 = new TagInfo("c:get", //$NON-NLS-1$
            237, 724,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rec/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_237_816 = new TagInfo("c:iterate", //$NON-NLS-1$
            237, 816,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_237_881 = new TagInfo("c:choose", //$NON-NLS-1$
            237, 881,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_237_891 = new TagInfo("c:when", //$NON-NLS-1$
            237, 891,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_237_956 = new TagInfo("c:otherwise", //$NON-NLS-1$
            237, 956,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_237_969 = new TagInfo("c:get", //$NON-NLS-1$
            237, 969,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceColumn", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_239_18 = new TagInfo("c:get", //$NON-NLS-1$
            239, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_239_56 = new TagInfo("c:iterate", //$NON-NLS-1$
            239, 56,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_239_121 = new TagInfo("c:choose", //$NON-NLS-1$
            239, 121,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_239_131 = new TagInfo("c:when", //$NON-NLS-1$
            239, 131,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_239_196 = new TagInfo("c:otherwise", //$NON-NLS-1$
            239, 196,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_239_209 = new TagInfo("c:get", //$NON-NLS-1$
            239, 209,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_239_305 = new TagInfo("c:iterate", //$NON-NLS-1$
            239, 305,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_239_370 = new TagInfo("c:choose", //$NON-NLS-1$
            239, 370,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_239_380 = new TagInfo("c:when", //$NON-NLS-1$
            239, 380,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_239_445 = new TagInfo("c:otherwise", //$NON-NLS-1$
            239, 445,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_239_458 = new TagInfo("c:get", //$NON-NLS-1$
            239, 458,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_239_499 = new TagInfo("c:get", //$NON-NLS-1$
            239, 499,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/column/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_242_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            242, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_243_27 = new TagInfo("c:get", //$NON-NLS-1$
            243, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_18 = new TagInfo("c:get", //$NON-NLS-1$
            245, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_56 = new TagInfo("c:get", //$NON-NLS-1$
            245, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_109 = new TagInfo("c:get", //$NON-NLS-1$
            245, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_245_144 = new TagInfo("c:get", //$NON-NLS-1$
            245, 144,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/column/@name)", //$NON-NLS-1$
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
        out.write("\tprivate static final long serialVersionUID = 1L;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_2.setRuntimeParent(null);
        _jettag_c_iterate_8_2.setTagInfo(_td_c_iterate_8_2);
        _jettag_c_iterate_8_2.doStart(context, out);
        while (_jettag_c_iterate_8_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_9_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_9_2.setTagInfo(_td_c_if_9_2);
            _jettag_c_if_9_2.doStart(context, out);
            while (_jettag_c_if_9_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_18.setRuntimeParent(_jettag_c_if_9_2);
                _jettag_c_get_10_18.setTagInfo(_td_c_get_10_18);
                _jettag_c_get_10_18.doStart(context, out);
                _jettag_c_get_10_18.doEnd();
                out.write("\",nullable = false)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_12_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_12_3.setRuntimeParent(_jettag_c_if_9_2);
                _jettag_java_import_12_3.setTagInfo(_td_java_import_12_3);
                _jettag_java_import_12_3.doStart(context, out);
                JET2Writer _jettag_java_import_12_3_saved_out = out;
                while (_jettag_java_import_12_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("javax.persistence.Id");  //$NON-NLS-1$        
                    _jettag_java_import_12_3.handleBodyContent(out);
                }
                out = _jettag_java_import_12_3_saved_out;
                _jettag_java_import_12_3.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_2.setRuntimeParent(_jettag_c_if_9_2);
                _jettag_c_if_13_2.setTagInfo(_td_c_if_13_2);
                _jettag_c_if_13_2.doStart(context, out);
                while (_jettag_c_if_13_2.okToProcessBody()) {
                    out.write("\t@GeneratedValue(strategy=GenerationType.IDENTITY)");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_13_2.handleBodyContent(out);
                }
                _jettag_c_if_13_2.doEnd();
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_2.setRuntimeParent(_jettag_c_if_9_2);
                _jettag_c_if_17_2.setTagInfo(_td_c_if_17_2);
                _jettag_c_if_17_2.doStart(context, out);
                while (_jettag_c_if_17_2.okToProcessBody()) {
                    out.write("\tString ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_9.setRuntimeParent(_jettag_c_if_17_2);
                    _jettag_c_get_18_9.setTagInfo(_td_c_get_18_9);
                    _jettag_c_get_18_9.doStart(context, out);
                    _jettag_c_get_18_9.doEnd();
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_17_2.handleBodyContent(out);
                }
                _jettag_c_if_17_2.doEnd();
                RuntimeTagElement _jettag_c_if_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_2.setRuntimeParent(_jettag_c_if_9_2);
                _jettag_c_if_20_2.setTagInfo(_td_c_if_20_2);
                _jettag_c_if_20_2.doStart(context, out);
                while (_jettag_c_if_20_2.okToProcessBody()) {
                    out.write("\tString ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_21_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_9.setRuntimeParent(_jettag_c_if_20_2);
                    _jettag_c_get_21_9.setTagInfo(_td_c_get_21_9);
                    _jettag_c_get_21_9.doStart(context, out);
                    _jettag_c_get_21_9.doEnd();
                    out.write("Field;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_20_2.handleBodyContent(out);
                }
                _jettag_c_if_20_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_9_2.handleBodyContent(out);
            }
            _jettag_c_if_9_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_26_2.setTagInfo(_td_c_if_26_2);
            _jettag_c_if_26_2.doStart(context, out);
            while (_jettag_c_if_26_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_18.setRuntimeParent(_jettag_c_if_26_2);
                _jettag_c_get_27_18.setTagInfo(_td_c_get_27_18);
                _jettag_c_get_27_18.doStart(context, out);
                _jettag_c_get_27_18.doEnd();
                out.write("\",nullable = false)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_29_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_29_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_29_3.setRuntimeParent(_jettag_c_if_26_2);
                _jettag_java_import_29_3.setTagInfo(_td_java_import_29_3);
                _jettag_java_import_29_3.doStart(context, out);
                JET2Writer _jettag_java_import_29_3_saved_out = out;
                while (_jettag_java_import_29_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("javax.persistence.Id");  //$NON-NLS-1$        
                    _jettag_java_import_29_3.handleBodyContent(out);
                }
                out = _jettag_java_import_29_3_saved_out;
                _jettag_java_import_29_3.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_30_2.setRuntimeParent(_jettag_c_if_26_2);
                _jettag_c_if_30_2.setTagInfo(_td_c_if_30_2);
                _jettag_c_if_30_2.doStart(context, out);
                while (_jettag_c_if_30_2.okToProcessBody()) {
                    out.write("\t@GeneratedValue(strategy=GenerationType.IDENTITY)");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_30_2.handleBodyContent(out);
                }
                _jettag_c_if_30_2.doEnd();
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_34_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_34_2.setRuntimeParent(_jettag_c_if_26_2);
                _jettag_c_if_34_2.setTagInfo(_td_c_if_34_2);
                _jettag_c_if_34_2.doStart(context, out);
                while (_jettag_c_if_34_2.okToProcessBody()) {
                    out.write("\tInteger ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_35_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_35_10.setRuntimeParent(_jettag_c_if_34_2);
                    _jettag_c_get_35_10.setTagInfo(_td_c_get_35_10);
                    _jettag_c_get_35_10.doStart(context, out);
                    _jettag_c_get_35_10.doEnd();
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_34_2.handleBodyContent(out);
                }
                _jettag_c_if_34_2.doEnd();
                RuntimeTagElement _jettag_c_if_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_37_2.setRuntimeParent(_jettag_c_if_26_2);
                _jettag_c_if_37_2.setTagInfo(_td_c_if_37_2);
                _jettag_c_if_37_2.doStart(context, out);
                while (_jettag_c_if_37_2.okToProcessBody()) {
                    out.write("\tInteger ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_38_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_10.setRuntimeParent(_jettag_c_if_37_2);
                    _jettag_c_get_38_10.setTagInfo(_td_c_get_38_10);
                    _jettag_c_get_38_10.doStart(context, out);
                    _jettag_c_get_38_10.doEnd();
                    out.write("Field;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_37_2.handleBodyContent(out);
                }
                _jettag_c_if_37_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_26_2.handleBodyContent(out);
            }
            _jettag_c_if_26_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_43_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_43_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_43_2.setTagInfo(_td_c_if_43_2);
            _jettag_c_if_43_2.doStart(context, out);
            while (_jettag_c_if_43_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_18.setRuntimeParent(_jettag_c_if_43_2);
                _jettag_c_get_44_18.setTagInfo(_td_c_get_44_18);
                _jettag_c_get_44_18.doStart(context, out);
                _jettag_c_get_44_18.doEnd();
                out.write("\",nullable = false)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_46_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_46_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_46_3.setRuntimeParent(_jettag_c_if_43_2);
                _jettag_java_import_46_3.setTagInfo(_td_java_import_46_3);
                _jettag_java_import_46_3.doStart(context, out);
                JET2Writer _jettag_java_import_46_3_saved_out = out;
                while (_jettag_java_import_46_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("javax.persistence.Id");  //$NON-NLS-1$        
                    _jettag_java_import_46_3.handleBodyContent(out);
                }
                out = _jettag_java_import_46_3_saved_out;
                _jettag_java_import_46_3.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_47_2.setRuntimeParent(_jettag_c_if_43_2);
                _jettag_c_if_47_2.setTagInfo(_td_c_if_47_2);
                _jettag_c_if_47_2.doStart(context, out);
                while (_jettag_c_if_47_2.okToProcessBody()) {
                    out.write("\t@GeneratedValue(strategy=GenerationType.IDENTITY)");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_47_2.handleBodyContent(out);
                }
                _jettag_c_if_47_2.doEnd();
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_51_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_51_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_51_2.setRuntimeParent(_jettag_c_if_43_2);
                _jettag_c_if_51_2.setTagInfo(_td_c_if_51_2);
                _jettag_c_if_51_2.doStart(context, out);
                while (_jettag_c_if_51_2.okToProcessBody()) {
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_52_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_52_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_52_2.setRuntimeParent(_jettag_c_if_51_2);
                    _jettag_java_import_52_2.setTagInfo(_td_java_import_52_2);
                    _jettag_java_import_52_2.doStart(context, out);
                    JET2Writer _jettag_java_import_52_2_saved_out = out;
                    while (_jettag_java_import_52_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_52_2.handleBodyContent(out);
                    }
                    out = _jettag_java_import_52_2_saved_out;
                    _jettag_java_import_52_2.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_52_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_52_44.setRuntimeParent(_jettag_c_if_51_2);
                    _jettag_c_get_52_44.setTagInfo(_td_c_get_52_44);
                    _jettag_c_get_52_44.doStart(context, out);
                    _jettag_c_get_52_44.doEnd();
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_51_2.handleBodyContent(out);
                }
                _jettag_c_if_51_2.doEnd();
                RuntimeTagElement _jettag_c_if_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_54_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_54_2.setRuntimeParent(_jettag_c_if_43_2);
                _jettag_c_if_54_2.setTagInfo(_td_c_if_54_2);
                _jettag_c_if_54_2.doStart(context, out);
                while (_jettag_c_if_54_2.okToProcessBody()) {
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_55_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_55_2.setRuntimeParent(_jettag_c_if_54_2);
                    _jettag_java_import_55_2.setTagInfo(_td_java_import_55_2);
                    _jettag_java_import_55_2.doStart(context, out);
                    JET2Writer _jettag_java_import_55_2_saved_out = out;
                    while (_jettag_java_import_55_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_55_2.handleBodyContent(out);
                    }
                    out = _jettag_java_import_55_2_saved_out;
                    _jettag_java_import_55_2.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_55_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_55_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_55_44.setRuntimeParent(_jettag_c_if_54_2);
                    _jettag_c_get_55_44.setTagInfo(_td_c_get_55_44);
                    _jettag_c_get_55_44.doStart(context, out);
                    _jettag_c_get_55_44.doEnd();
                    out.write("Field;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_54_2.handleBodyContent(out);
                }
                _jettag_c_if_54_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_43_2.handleBodyContent(out);
            }
            _jettag_c_if_43_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_60_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_60_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_if_60_2.setTagInfo(_td_c_if_60_2);
            _jettag_c_if_60_2.doStart(context, out);
            while (_jettag_c_if_60_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_61_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_18.setRuntimeParent(_jettag_c_if_60_2);
                _jettag_c_get_61_18.setTagInfo(_td_c_get_61_18);
                _jettag_c_get_61_18.doStart(context, out);
                _jettag_c_get_61_18.doEnd();
                out.write("\",nullable = false)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_import_63_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_63_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_63_3.setRuntimeParent(_jettag_c_if_60_2);
                _jettag_java_import_63_3.setTagInfo(_td_java_import_63_3);
                _jettag_java_import_63_3.doStart(context, out);
                JET2Writer _jettag_java_import_63_3_saved_out = out;
                while (_jettag_java_import_63_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("javax.persistence.Id");  //$NON-NLS-1$        
                    _jettag_java_import_63_3.handleBodyContent(out);
                }
                out = _jettag_java_import_63_3_saved_out;
                _jettag_java_import_63_3.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_64_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_64_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_64_2.setRuntimeParent(_jettag_c_if_60_2);
                _jettag_c_if_64_2.setTagInfo(_td_c_if_64_2);
                _jettag_c_if_64_2.doStart(context, out);
                while (_jettag_c_if_64_2.okToProcessBody()) {
                    out.write("\t@GeneratedValue(strategy=GenerationType.IDENTITY)");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_64_2.handleBodyContent(out);
                }
                _jettag_c_if_64_2.doEnd();
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_68_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_68_2.setRuntimeParent(_jettag_c_if_60_2);
                _jettag_c_if_68_2.setTagInfo(_td_c_if_68_2);
                _jettag_c_if_68_2.doStart(context, out);
                while (_jettag_c_if_68_2.okToProcessBody()) {
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_69_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_69_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_69_2.setRuntimeParent(_jettag_c_if_68_2);
                    _jettag_java_import_69_2.setTagInfo(_td_java_import_69_2);
                    _jettag_java_import_69_2.doStart(context, out);
                    JET2Writer _jettag_java_import_69_2_saved_out = out;
                    while (_jettag_java_import_69_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_69_2.handleBodyContent(out);
                    }
                    out = _jettag_java_import_69_2_saved_out;
                    _jettag_java_import_69_2.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_69_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_50.setRuntimeParent(_jettag_c_if_68_2);
                    _jettag_c_get_69_50.setTagInfo(_td_c_get_69_50);
                    _jettag_c_get_69_50.doStart(context, out);
                    _jettag_c_get_69_50.doEnd();
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_68_2.handleBodyContent(out);
                }
                _jettag_c_if_68_2.doEnd();
                RuntimeTagElement _jettag_c_if_71_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_71_2.setRuntimeParent(_jettag_c_if_60_2);
                _jettag_c_if_71_2.setTagInfo(_td_c_if_71_2);
                _jettag_c_if_71_2.doStart(context, out);
                while (_jettag_c_if_71_2.okToProcessBody()) {
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_java_import_72_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_72_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_72_2.setRuntimeParent(_jettag_c_if_71_2);
                    _jettag_java_import_72_2.setTagInfo(_td_java_import_72_2);
                    _jettag_java_import_72_2.doStart(context, out);
                    JET2Writer _jettag_java_import_72_2_saved_out = out;
                    while (_jettag_java_import_72_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_72_2.handleBodyContent(out);
                    }
                    out = _jettag_java_import_72_2_saved_out;
                    _jettag_java_import_72_2.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_50); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_50.setRuntimeParent(_jettag_c_if_71_2);
                    _jettag_c_get_72_50.setTagInfo(_td_c_get_72_50);
                    _jettag_c_get_72_50.doStart(context, out);
                    _jettag_c_get_72_50.doEnd();
                    out.write("Field;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_71_2.handleBodyContent(out);
                }
                _jettag_c_if_71_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_60_2.handleBodyContent(out);
            }
            _jettag_c_if_60_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_8_2.handleBodyContent(out);
        }
        _jettag_c_iterate_8_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_79_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_79_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_79_2.setRuntimeParent(null);
        _jettag_c_iterate_79_2.setTagInfo(_td_c_iterate_79_2);
        _jettag_c_iterate_79_2.doStart(context, out);
        while (_jettag_c_iterate_79_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_80_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_80_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_80_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_80_2.setTagInfo(_td_c_if_80_2);
            _jettag_c_if_80_2.doStart(context, out);
            while (_jettag_c_if_80_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_81_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_81_18.setRuntimeParent(_jettag_c_if_80_2);
                _jettag_c_get_81_18.setTagInfo(_td_c_get_81_18);
                _jettag_c_get_81_18.doStart(context, out);
                _jettag_c_get_81_18.doEnd();
                out.write("\", columnDefinition = \"BLOB\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Lob");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_85_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_85_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_85_2.setRuntimeParent(_jettag_c_if_80_2);
                _jettag_c_choose_85_2.setTagInfo(_td_c_choose_85_2);
                _jettag_c_choose_85_2.doStart(context, out);
                JET2Writer _jettag_c_choose_85_2_saved_out = out;
                while (_jettag_c_choose_85_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_86_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_86_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_86_2.setRuntimeParent(_jettag_c_choose_85_2);
                    _jettag_c_when_86_2.setTagInfo(_td_c_when_86_2);
                    _jettag_c_when_86_2.doStart(context, out);
                    JET2Writer _jettag_c_when_86_2_saved_out = out;
                    while (_jettag_c_when_86_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tbyte[] ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_87_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_87_9.setRuntimeParent(_jettag_c_when_86_2);
                        _jettag_c_get_87_9.setTagInfo(_td_c_get_87_9);
                        _jettag_c_get_87_9.doStart(context, out);
                        _jettag_c_get_87_9.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_86_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_86_2_saved_out;
                    _jettag_c_when_86_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_89_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_89_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_89_2.setRuntimeParent(_jettag_c_choose_85_2);
                    _jettag_c_otherwise_89_2.setTagInfo(_td_c_otherwise_89_2);
                    _jettag_c_otherwise_89_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_89_2_saved_out = out;
                    while (_jettag_c_otherwise_89_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tbyte[] ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_90_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_90_9.setRuntimeParent(_jettag_c_otherwise_89_2);
                        _jettag_c_get_90_9.setTagInfo(_td_c_get_90_9);
                        _jettag_c_get_90_9.doStart(context, out);
                        _jettag_c_get_90_9.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_89_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_89_2_saved_out;
                    _jettag_c_otherwise_89_2.doEnd();
                    _jettag_c_choose_85_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_85_2_saved_out;
                _jettag_c_choose_85_2.doEnd();
                _jettag_c_if_80_2.handleBodyContent(out);
            }
            _jettag_c_if_80_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_95_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_95_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_95_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_95_2.setTagInfo(_td_c_if_95_2);
            _jettag_c_if_95_2.doStart(context, out);
            while (_jettag_c_if_95_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_96_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_96_18.setRuntimeParent(_jettag_c_if_95_2);
                _jettag_c_get_96_18.setTagInfo(_td_c_get_96_18);
                _jettag_c_get_96_18.doStart(context, out);
                _jettag_c_get_96_18.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_99_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_99_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_99_2.setRuntimeParent(_jettag_c_if_95_2);
                _jettag_c_choose_99_2.setTagInfo(_td_c_choose_99_2);
                _jettag_c_choose_99_2.doStart(context, out);
                JET2Writer _jettag_c_choose_99_2_saved_out = out;
                while (_jettag_c_choose_99_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_100_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_100_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_100_2.setRuntimeParent(_jettag_c_choose_99_2);
                    _jettag_c_when_100_2.setTagInfo(_td_c_when_100_2);
                    _jettag_c_when_100_2.doStart(context, out);
                    JET2Writer _jettag_c_when_100_2_saved_out = out;
                    while (_jettag_c_when_100_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tString ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_101_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_101_9.setRuntimeParent(_jettag_c_when_100_2);
                        _jettag_c_get_101_9.setTagInfo(_td_c_get_101_9);
                        _jettag_c_get_101_9.doStart(context, out);
                        _jettag_c_get_101_9.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_100_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_100_2_saved_out;
                    _jettag_c_when_100_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_103_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_103_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_103_2.setRuntimeParent(_jettag_c_choose_99_2);
                    _jettag_c_otherwise_103_2.setTagInfo(_td_c_otherwise_103_2);
                    _jettag_c_otherwise_103_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_103_2_saved_out = out;
                    while (_jettag_c_otherwise_103_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tString ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_104_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_104_9.setRuntimeParent(_jettag_c_otherwise_103_2);
                        _jettag_c_get_104_9.setTagInfo(_td_c_get_104_9);
                        _jettag_c_get_104_9.doStart(context, out);
                        _jettag_c_get_104_9.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_103_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_103_2_saved_out;
                    _jettag_c_otherwise_103_2.doEnd();
                    _jettag_c_choose_99_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_99_2_saved_out;
                _jettag_c_choose_99_2.doEnd();
                _jettag_c_if_95_2.handleBodyContent(out);
            }
            _jettag_c_if_95_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_109_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_109_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_109_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_109_2.setTagInfo(_td_c_if_109_2);
            _jettag_c_if_109_2.doStart(context, out);
            while (_jettag_c_if_109_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_110_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_110_18.setRuntimeParent(_jettag_c_if_109_2);
                _jettag_c_get_110_18.setTagInfo(_td_c_get_110_18);
                _jettag_c_get_110_18.doStart(context, out);
                _jettag_c_get_110_18.doEnd();
                out.write("\", precision = 22)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_113_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_113_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_113_2.setRuntimeParent(_jettag_c_if_109_2);
                _jettag_c_choose_113_2.setTagInfo(_td_c_choose_113_2);
                _jettag_c_choose_113_2.doStart(context, out);
                JET2Writer _jettag_c_choose_113_2_saved_out = out;
                while (_jettag_c_choose_113_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_114_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_114_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_114_2.setRuntimeParent(_jettag_c_choose_113_2);
                    _jettag_c_when_114_2.setTagInfo(_td_c_when_114_2);
                    _jettag_c_when_114_2.doStart(context, out);
                    JET2Writer _jettag_c_when_114_2_saved_out = out;
                    while (_jettag_c_when_114_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_java_import_115_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_115_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_import_115_2.setRuntimeParent(_jettag_c_when_114_2);
                        _jettag_java_import_115_2.setTagInfo(_td_java_import_115_2);
                        _jettag_java_import_115_2.doStart(context, out);
                        JET2Writer _jettag_java_import_115_2_saved_out = out;
                        while (_jettag_java_import_115_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                            _jettag_java_import_115_2.handleBodyContent(out);
                        }
                        out = _jettag_java_import_115_2_saved_out;
                        _jettag_java_import_115_2.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_115_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_50); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_115_50.setRuntimeParent(_jettag_c_when_114_2);
                        _jettag_c_get_115_50.setTagInfo(_td_c_get_115_50);
                        _jettag_c_get_115_50.doStart(context, out);
                        _jettag_c_get_115_50.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_114_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_114_2_saved_out;
                    _jettag_c_when_114_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_117_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_117_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_117_2.setRuntimeParent(_jettag_c_choose_113_2);
                    _jettag_c_otherwise_117_2.setTagInfo(_td_c_otherwise_117_2);
                    _jettag_c_otherwise_117_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_117_2_saved_out = out;
                    while (_jettag_c_otherwise_117_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_java_import_118_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_118_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_import_118_2.setRuntimeParent(_jettag_c_otherwise_117_2);
                        _jettag_java_import_118_2.setTagInfo(_td_java_import_118_2);
                        _jettag_java_import_118_2.doStart(context, out);
                        JET2Writer _jettag_java_import_118_2_saved_out = out;
                        while (_jettag_java_import_118_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                            _jettag_java_import_118_2.handleBodyContent(out);
                        }
                        out = _jettag_java_import_118_2_saved_out;
                        _jettag_java_import_118_2.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_118_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_50); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_118_50.setRuntimeParent(_jettag_c_otherwise_117_2);
                        _jettag_c_get_118_50.setTagInfo(_td_c_get_118_50);
                        _jettag_c_get_118_50.doStart(context, out);
                        _jettag_c_get_118_50.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_117_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_117_2_saved_out;
                    _jettag_c_otherwise_117_2.doEnd();
                    _jettag_c_choose_113_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_113_2_saved_out;
                _jettag_c_choose_113_2.doEnd();
                _jettag_c_if_109_2.handleBodyContent(out);
            }
            _jettag_c_if_109_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_123_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_123_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_123_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_123_2.setTagInfo(_td_c_if_123_2);
            _jettag_c_if_123_2.doStart(context, out);
            while (_jettag_c_if_123_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_124_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_124_18.setRuntimeParent(_jettag_c_if_123_2);
                _jettag_c_get_124_18.setTagInfo(_td_c_get_124_18);
                _jettag_c_get_124_18.doStart(context, out);
                _jettag_c_get_124_18.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_127_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_127_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_127_2.setRuntimeParent(_jettag_c_if_123_2);
                _jettag_c_choose_127_2.setTagInfo(_td_c_choose_127_2);
                _jettag_c_choose_127_2.doStart(context, out);
                JET2Writer _jettag_c_choose_127_2_saved_out = out;
                while (_jettag_c_choose_127_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_128_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_128_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_128_2.setRuntimeParent(_jettag_c_choose_127_2);
                    _jettag_c_when_128_2.setTagInfo(_td_c_when_128_2);
                    _jettag_c_when_128_2.doStart(context, out);
                    JET2Writer _jettag_c_when_128_2_saved_out = out;
                    while (_jettag_c_when_128_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tInteger ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_129_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_129_10.setRuntimeParent(_jettag_c_when_128_2);
                        _jettag_c_get_129_10.setTagInfo(_td_c_get_129_10);
                        _jettag_c_get_129_10.doStart(context, out);
                        _jettag_c_get_129_10.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_128_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_128_2_saved_out;
                    _jettag_c_when_128_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_131_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_131_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_131_2.setRuntimeParent(_jettag_c_choose_127_2);
                    _jettag_c_otherwise_131_2.setTagInfo(_td_c_otherwise_131_2);
                    _jettag_c_otherwise_131_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_131_2_saved_out = out;
                    while (_jettag_c_otherwise_131_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tInteger ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_132_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_132_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_132_10.setRuntimeParent(_jettag_c_otherwise_131_2);
                        _jettag_c_get_132_10.setTagInfo(_td_c_get_132_10);
                        _jettag_c_get_132_10.doStart(context, out);
                        _jettag_c_get_132_10.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_131_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_131_2_saved_out;
                    _jettag_c_otherwise_131_2.doEnd();
                    _jettag_c_choose_127_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_127_2_saved_out;
                _jettag_c_choose_127_2.doEnd();
                _jettag_c_if_123_2.handleBodyContent(out);
            }
            _jettag_c_if_123_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_137_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_137_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_137_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_137_2.setTagInfo(_td_c_if_137_2);
            _jettag_c_if_137_2.doStart(context, out);
            while (_jettag_c_if_137_2.okToProcessBody()) {
                out.write("\t@Temporal(TemporalType.TIMESTAMP)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_139_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_139_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_139_18.setRuntimeParent(_jettag_c_if_137_2);
                _jettag_c_get_139_18.setTagInfo(_td_c_get_139_18);
                _jettag_c_get_139_18.doStart(context, out);
                _jettag_c_get_139_18.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_142_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_142_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_142_2.setRuntimeParent(_jettag_c_if_137_2);
                _jettag_c_choose_142_2.setTagInfo(_td_c_choose_142_2);
                _jettag_c_choose_142_2.doStart(context, out);
                JET2Writer _jettag_c_choose_142_2_saved_out = out;
                while (_jettag_c_choose_142_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_143_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_143_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_143_2.setRuntimeParent(_jettag_c_choose_142_2);
                    _jettag_c_when_143_2.setTagInfo(_td_c_when_143_2);
                    _jettag_c_when_143_2.doStart(context, out);
                    JET2Writer _jettag_c_when_143_2_saved_out = out;
                    while (_jettag_c_when_143_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_java_import_144_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_144_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_import_144_2.setRuntimeParent(_jettag_c_when_143_2);
                        _jettag_java_import_144_2.setTagInfo(_td_java_import_144_2);
                        _jettag_java_import_144_2.doStart(context, out);
                        JET2Writer _jettag_java_import_144_2_saved_out = out;
                        while (_jettag_java_import_144_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("java.util.Date");  //$NON-NLS-1$        
                            _jettag_java_import_144_2.handleBodyContent(out);
                        }
                        out = _jettag_java_import_144_2_saved_out;
                        _jettag_java_import_144_2.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_144_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_144_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_144_44.setRuntimeParent(_jettag_c_when_143_2);
                        _jettag_c_get_144_44.setTagInfo(_td_c_get_144_44);
                        _jettag_c_get_144_44.doStart(context, out);
                        _jettag_c_get_144_44.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_143_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_143_2_saved_out;
                    _jettag_c_when_143_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_146_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_146_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_146_2.setRuntimeParent(_jettag_c_choose_142_2);
                    _jettag_c_otherwise_146_2.setTagInfo(_td_c_otherwise_146_2);
                    _jettag_c_otherwise_146_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_146_2_saved_out = out;
                    while (_jettag_c_otherwise_146_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_java_import_147_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_147_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_import_147_2.setRuntimeParent(_jettag_c_otherwise_146_2);
                        _jettag_java_import_147_2.setTagInfo(_td_java_import_147_2);
                        _jettag_java_import_147_2.doStart(context, out);
                        JET2Writer _jettag_java_import_147_2_saved_out = out;
                        while (_jettag_java_import_147_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("java.util.Date");  //$NON-NLS-1$        
                            _jettag_java_import_147_2.handleBodyContent(out);
                        }
                        out = _jettag_java_import_147_2_saved_out;
                        _jettag_java_import_147_2.doEnd();
                        out.write(" ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_147_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_147_44); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_147_44.setRuntimeParent(_jettag_c_otherwise_146_2);
                        _jettag_c_get_147_44.setTagInfo(_td_c_get_147_44);
                        _jettag_c_get_147_44.doStart(context, out);
                        _jettag_c_get_147_44.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_146_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_146_2_saved_out;
                    _jettag_c_otherwise_146_2.doEnd();
                    _jettag_c_choose_142_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_142_2_saved_out;
                _jettag_c_choose_142_2.doEnd();
                _jettag_c_if_137_2.handleBodyContent(out);
            }
            _jettag_c_if_137_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_152_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_152_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_152_2.setRuntimeParent(_jettag_c_iterate_79_2);
            _jettag_c_if_152_2.setTagInfo(_td_c_if_152_2);
            _jettag_c_if_152_2.doStart(context, out);
            while (_jettag_c_if_152_2.okToProcessBody()) {
                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_153_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_153_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_153_18.setRuntimeParent(_jettag_c_if_152_2);
                _jettag_c_get_153_18.setTagInfo(_td_c_get_153_18);
                _jettag_c_get_153_18.doStart(context, out);
                _jettag_c_get_153_18.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@XmlElement");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_156_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_156_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_156_2.setRuntimeParent(_jettag_c_if_152_2);
                _jettag_c_choose_156_2.setTagInfo(_td_c_choose_156_2);
                _jettag_c_choose_156_2.doStart(context, out);
                JET2Writer _jettag_c_choose_156_2_saved_out = out;
                while (_jettag_c_choose_156_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_157_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_157_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_157_2.setRuntimeParent(_jettag_c_choose_156_2);
                    _jettag_c_when_157_2.setTagInfo(_td_c_when_157_2);
                    _jettag_c_when_157_2.doStart(context, out);
                    JET2Writer _jettag_c_when_157_2_saved_out = out;
                    while (_jettag_c_when_157_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tBoolean ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_158_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_158_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_158_10.setRuntimeParent(_jettag_c_when_157_2);
                        _jettag_c_get_158_10.setTagInfo(_td_c_get_158_10);
                        _jettag_c_get_158_10.doStart(context, out);
                        _jettag_c_get_158_10.doEnd();
                        out.write("_1;");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_157_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_157_2_saved_out;
                    _jettag_c_when_157_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_160_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_160_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_160_2.setRuntimeParent(_jettag_c_choose_156_2);
                    _jettag_c_otherwise_160_2.setTagInfo(_td_c_otherwise_160_2);
                    _jettag_c_otherwise_160_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_160_2_saved_out = out;
                    while (_jettag_c_otherwise_160_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\tBoolean ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_161_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_10); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_161_10.setRuntimeParent(_jettag_c_otherwise_160_2);
                        _jettag_c_get_161_10.setTagInfo(_td_c_get_161_10);
                        _jettag_c_get_161_10.doStart(context, out);
                        _jettag_c_get_161_10.doEnd();
                        out.write(";");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_160_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_160_2_saved_out;
                    _jettag_c_otherwise_160_2.doEnd();
                    _jettag_c_choose_156_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_156_2_saved_out;
                _jettag_c_choose_156_2.doEnd();
                _jettag_c_if_152_2.handleBodyContent(out);
            }
            _jettag_c_if_152_2.doEnd();
            _jettag_c_iterate_79_2.handleBodyContent(out);
        }
        _jettag_c_iterate_79_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_167_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_167_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_167_2.setRuntimeParent(null);
        _jettag_c_setVariable_167_2.setTagInfo(_td_c_setVariable_167_2);
        _jettag_c_setVariable_167_2.doStart(context, out);
        _jettag_c_setVariable_167_2.doEnd();
        RuntimeTagElement _jettag_c_setVariable_168_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_168_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_168_2.setRuntimeParent(null);
        _jettag_c_setVariable_168_2.setTagInfo(_td_c_setVariable_168_2);
        _jettag_c_setVariable_168_2.doStart(context, out);
        _jettag_c_setVariable_168_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_169_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_169_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_169_2.setRuntimeParent(null);
        _jettag_c_iterate_169_2.setTagInfo(_td_c_iterate_169_2);
        _jettag_c_iterate_169_2.doStart(context, out);
        while (_jettag_c_iterate_169_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_170_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_170_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_170_3.setRuntimeParent(_jettag_c_iterate_169_2);
            _jettag_c_setVariable_170_3.setTagInfo(_td_c_setVariable_170_3);
            _jettag_c_setVariable_170_3.doStart(context, out);
            _jettag_c_setVariable_170_3.doEnd();
            _jettag_c_iterate_169_2.handleBodyContent(out);
        }
        _jettag_c_iterate_169_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_172_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_172_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_172_2.setRuntimeParent(null);
        _jettag_c_iterate_172_2.setTagInfo(_td_c_iterate_172_2);
        _jettag_c_iterate_172_2.doStart(context, out);
        while (_jettag_c_iterate_172_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_173_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_173_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_173_3.setRuntimeParent(_jettag_c_iterate_172_2);
            _jettag_c_setVariable_173_3.setTagInfo(_td_c_setVariable_173_3);
            _jettag_c_setVariable_173_3.doStart(context, out);
            _jettag_c_setVariable_173_3.doEnd();
            _jettag_c_iterate_172_2.handleBodyContent(out);
        }
        _jettag_c_iterate_172_2.doEnd();
        RuntimeTagElement _jettag_c_choose_175_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_175_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_175_2.setRuntimeParent(null);
        _jettag_c_choose_175_2.setTagInfo(_td_c_choose_175_2);
        _jettag_c_choose_175_2.doStart(context, out);
        JET2Writer _jettag_c_choose_175_2_saved_out = out;
        while (_jettag_c_choose_175_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_176_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_176_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_176_2.setRuntimeParent(_jettag_c_choose_175_2);
            _jettag_c_when_176_2.setTagInfo(_td_c_when_176_2);
            _jettag_c_when_176_2.doStart(context, out);
            JET2Writer _jettag_c_when_176_2_saved_out = out;
            while (_jettag_c_when_176_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_178_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_178_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_178_2.setRuntimeParent(_jettag_c_when_176_2);
                _jettag_c_iterate_178_2.setTagInfo(_td_c_iterate_178_2);
                _jettag_c_iterate_178_2.doStart(context, out);
                while (_jettag_c_iterate_178_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_179_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_179_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_179_2.setRuntimeParent(_jettag_c_iterate_178_2);
                    _jettag_c_iterate_179_2.setTagInfo(_td_c_iterate_179_2);
                    _jettag_c_iterate_179_2.doStart(context, out);
                    while (_jettag_c_iterate_179_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_180_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_180_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_180_2.setRuntimeParent(_jettag_c_iterate_179_2);
                        _jettag_c_if_180_2.setTagInfo(_td_c_if_180_2);
                        _jettag_c_if_180_2.doStart(context, out);
                        while (_jettag_c_if_180_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_181_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_181_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_181_2.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_setVariable_181_2.setTagInfo(_td_c_setVariable_181_2);
                            _jettag_c_setVariable_181_2.doStart(context, out);
                            _jettag_c_setVariable_181_2.doEnd();
                            RuntimeTagElement _jettag_c_if_182_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_182_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_182_2.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_if_182_2.setTagInfo(_td_c_if_182_2);
                            _jettag_c_if_182_2.doStart(context, out);
                            while (_jettag_c_if_182_2.okToProcessBody()) {
                                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_183_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_183_18); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_183_18.setRuntimeParent(_jettag_c_if_182_2);
                                _jettag_c_get_183_18.setTagInfo(_td_c_get_183_18);
                                _jettag_c_get_183_18.doStart(context, out);
                                _jettag_c_get_183_18.doEnd();
                                out.write("\")");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t@XmlElement");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\tInteger ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_186_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_186_10); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_186_10.setRuntimeParent(_jettag_c_if_182_2);
                                _jettag_c_get_186_10.setTagInfo(_td_c_get_186_10);
                                _jettag_c_get_186_10.doStart(context, out);
                                _jettag_c_get_186_10.doEnd();
                                out.write("Id;");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_182_2.handleBodyContent(out);
                            }
                            _jettag_c_if_182_2.doEnd();
                            out.write("\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ManyToOne(fetch = FetchType.LAZY)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@JoinColumns({ @JoinColumn(name = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_190_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_190_37); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_190_37.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_get_190_37.setTagInfo(_td_c_get_190_37);
                            _jettag_c_get_190_37.doStart(context, out);
                            _jettag_c_get_190_37.doEnd();
                            out.write("\", referencedColumnName = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_190_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_190_96); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_190_96.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_get_190_96.setTagInfo(_td_c_get_190_96);
                            _jettag_c_get_190_96.doStart(context, out);
                            _jettag_c_get_190_96.doEnd();
                            out.write("\", nullable = false, insertable = false, updatable = false) })");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@XmlTransient");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_192_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_192_2.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_get_192_2.setTagInfo(_td_c_get_192_2);
                            _jettag_c_get_192_2.doStart(context, out);
                            _jettag_c_get_192_2.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_192_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_192_61); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_192_61.setRuntimeParent(_jettag_c_if_180_2);
                            _jettag_c_get_192_61.setTagInfo(_td_c_get_192_61);
                            _jettag_c_get_192_61.doStart(context, out);
                            _jettag_c_get_192_61.doEnd();
                            out.write(";");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_180_2.handleBodyContent(out);
                        }
                        _jettag_c_if_180_2.doEnd();
                        _jettag_c_iterate_179_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_179_2.doEnd();
                    _jettag_c_iterate_178_2.handleBodyContent(out);
                }
                _jettag_c_iterate_178_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_176_2.handleBodyContent(out);
            }
            out = _jettag_c_when_176_2_saved_out;
            _jettag_c_when_176_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_198_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_198_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_198_2.setRuntimeParent(_jettag_c_choose_175_2);
            _jettag_c_otherwise_198_2.setTagInfo(_td_c_otherwise_198_2);
            _jettag_c_otherwise_198_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_198_2_saved_out = out;
            while (_jettag_c_otherwise_198_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_199_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_199_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_199_2.setRuntimeParent(_jettag_c_otherwise_198_2);
                _jettag_c_setVariable_199_2.setTagInfo(_td_c_setVariable_199_2);
                _jettag_c_setVariable_199_2.doStart(context, out);
                _jettag_c_setVariable_199_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_201_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_201_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_201_2.setRuntimeParent(_jettag_c_otherwise_198_2);
                _jettag_c_iterate_201_2.setTagInfo(_td_c_iterate_201_2);
                _jettag_c_iterate_201_2.doStart(context, out);
                while (_jettag_c_iterate_201_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_202_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_202_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_202_2.setRuntimeParent(_jettag_c_iterate_201_2);
                    _jettag_c_iterate_202_2.setTagInfo(_td_c_iterate_202_2);
                    _jettag_c_iterate_202_2.doStart(context, out);
                    while (_jettag_c_iterate_202_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_203_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_203_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_203_2.setRuntimeParent(_jettag_c_iterate_202_2);
                        _jettag_c_if_203_2.setTagInfo(_td_c_if_203_2);
                        _jettag_c_if_203_2.doStart(context, out);
                        while (_jettag_c_if_203_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_if_204_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_204_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_if_204_2.setRuntimeParent(_jettag_c_if_203_2);
                            _jettag_c_if_204_2.setTagInfo(_td_c_if_204_2);
                            _jettag_c_if_204_2.doStart(context, out);
                            while (_jettag_c_if_204_2.okToProcessBody()) {
                                out.write("\t@Column(name = \"");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_205_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_18); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_205_18.setRuntimeParent(_jettag_c_if_204_2);
                                _jettag_c_get_205_18.setTagInfo(_td_c_get_205_18);
                                _jettag_c_get_205_18.doStart(context, out);
                                _jettag_c_get_205_18.doEnd();
                                out.write("\")");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t@Basic(fetch = FetchType.EAGER)");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t@XmlElement");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\tInteger ");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_208_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_208_10); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_208_10.setRuntimeParent(_jettag_c_if_204_2);
                                _jettag_c_get_208_10.setTagInfo(_td_c_get_208_10);
                                _jettag_c_get_208_10.doStart(context, out);
                                _jettag_c_get_208_10.doEnd();
                                out.write("Id;");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_if_204_2.handleBodyContent(out);
                            }
                            _jettag_c_if_204_2.doEnd();
                            out.write("\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@ManyToOne(fetch = FetchType.LAZY)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@JoinColumns({ @JoinColumn(name = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_212_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_37); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_212_37.setRuntimeParent(_jettag_c_if_203_2);
                            _jettag_c_get_212_37.setTagInfo(_td_c_get_212_37);
                            _jettag_c_get_212_37.doStart(context, out);
                            _jettag_c_get_212_37.doEnd();
                            out.write("\", referencedColumnName = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_212_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_96); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_212_96.setRuntimeParent(_jettag_c_if_203_2);
                            _jettag_c_get_212_96.setTagInfo(_td_c_get_212_96);
                            _jettag_c_get_212_96.doStart(context, out);
                            _jettag_c_get_212_96.doEnd();
                            out.write("\",nullable = false, insertable = false, updatable = false) })");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t@XmlTransient");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_214_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_214_2.setRuntimeParent(_jettag_c_if_203_2);
                            _jettag_c_get_214_2.setTagInfo(_td_c_get_214_2);
                            _jettag_c_get_214_2.doStart(context, out);
                            _jettag_c_get_214_2.doEnd();
                            out.write(" ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_214_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_61); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_214_61.setRuntimeParent(_jettag_c_if_203_2);
                            _jettag_c_get_214_61.setTagInfo(_td_c_get_214_61);
                            _jettag_c_get_214_61.doStart(context, out);
                            _jettag_c_get_214_61.doEnd();
                            out.write(";");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_203_2.handleBodyContent(out);
                        }
                        _jettag_c_if_203_2.doEnd();
                        _jettag_c_iterate_202_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_202_2.doEnd();
                    _jettag_c_iterate_201_2.handleBodyContent(out);
                }
                _jettag_c_iterate_201_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_198_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_198_2_saved_out;
            _jettag_c_otherwise_198_2.doEnd();
            _jettag_c_choose_175_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_175_2_saved_out;
        _jettag_c_choose_175_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_223_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_223_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_223_2.setRuntimeParent(null);
        _jettag_c_iterate_223_2.setTagInfo(_td_c_iterate_223_2);
        _jettag_c_iterate_223_2.doStart(context, out);
        while (_jettag_c_iterate_223_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_224_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_224_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_224_2.setRuntimeParent(_jettag_c_iterate_223_2);
            _jettag_c_iterate_224_2.setTagInfo(_td_c_iterate_224_2);
            _jettag_c_iterate_224_2.doStart(context, out);
            while (_jettag_c_iterate_224_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_225_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_225_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_225_3.setRuntimeParent(_jettag_c_iterate_224_2);
                _jettag_c_if_225_3.setTagInfo(_td_c_if_225_3);
                _jettag_c_if_225_3.doStart(context, out);
                while (_jettag_c_if_225_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_226_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_226_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_226_4.setRuntimeParent(_jettag_c_if_225_3);
                    _jettag_c_setVariable_226_4.setTagInfo(_td_c_setVariable_226_4);
                    _jettag_c_setVariable_226_4.doStart(context, out);
                    _jettag_c_setVariable_226_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_227_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_227_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_227_4.setRuntimeParent(_jettag_c_if_225_3);
                    _jettag_c_setVariable_227_4.setTagInfo(_td_c_setVariable_227_4);
                    _jettag_c_setVariable_227_4.doStart(context, out);
                    _jettag_c_setVariable_227_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_228_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_228_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_228_4.setRuntimeParent(_jettag_c_if_225_3);
                    _jettag_c_iterate_228_4.setTagInfo(_td_c_iterate_228_4);
                    _jettag_c_iterate_228_4.doStart(context, out);
                    while (_jettag_c_iterate_228_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_229_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_229_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_229_5.setRuntimeParent(_jettag_c_iterate_228_4);
                        _jettag_c_setVariable_229_5.setTagInfo(_td_c_setVariable_229_5);
                        _jettag_c_setVariable_229_5.doStart(context, out);
                        _jettag_c_setVariable_229_5.doEnd();
                        _jettag_c_iterate_228_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_228_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_231_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_231_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_231_4.setRuntimeParent(_jettag_c_if_225_3);
                    _jettag_c_iterate_231_4.setTagInfo(_td_c_iterate_231_4);
                    _jettag_c_iterate_231_4.doStart(context, out);
                    while (_jettag_c_iterate_231_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_232_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_232_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_232_5.setRuntimeParent(_jettag_c_iterate_231_4);
                        _jettag_c_setVariable_232_5.setTagInfo(_td_c_setVariable_232_5);
                        _jettag_c_setVariable_232_5.doStart(context, out);
                        _jettag_c_setVariable_232_5.doEnd();
                        _jettag_c_iterate_231_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_231_4.doEnd();
                    RuntimeTagElement _jettag_c_choose_234_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_234_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_234_4.setRuntimeParent(_jettag_c_if_225_3);
                    _jettag_c_choose_234_4.setTagInfo(_td_c_choose_234_4);
                    _jettag_c_choose_234_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_234_4_saved_out = out;
                    while (_jettag_c_choose_234_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_235_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_235_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_235_4.setRuntimeParent(_jettag_c_choose_234_4);
                        _jettag_c_when_235_4.setTagInfo(_td_c_when_235_4);
                        _jettag_c_when_235_4.doStart(context, out);
                        JET2Writer _jettag_c_when_235_4_saved_out = out;
                        while (_jettag_c_when_235_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t@ManyToMany(fetch = FetchType.LAZY)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t@JoinTable(catalog = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_237_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_26); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_237_26.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_get_237_26.setTagInfo(_td_c_get_237_26);
                            _jettag_c_get_237_26.doStart(context, out);
                            _jettag_c_get_237_26.doEnd();
                            out.write("\", name = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_237_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_90); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_237_90.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_get_237_90.setTagInfo(_td_c_get_237_90);
                            _jettag_c_get_237_90.doStart(context, out);
                            _jettag_c_get_237_90.doEnd();
                            out.write("\", joinColumns = { @JoinColumn(name = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_237_168 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_168); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_237_168.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_iterate_237_168.setTagInfo(_td_c_iterate_237_168);
                            _jettag_c_iterate_237_168.doStart(context, out);
                            while (_jettag_c_iterate_237_168.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_237_230 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_237_230); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_237_230.setRuntimeParent(_jettag_c_iterate_237_168);
                                _jettag_c_choose_237_230.setTagInfo(_td_c_choose_237_230);
                                _jettag_c_choose_237_230.doStart(context, out);
                                JET2Writer _jettag_c_choose_237_230_saved_out = out;
                                while (_jettag_c_choose_237_230.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_237_240 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_237_240); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_237_240.setRuntimeParent(_jettag_c_choose_237_230);
                                    _jettag_c_when_237_240.setTagInfo(_td_c_when_237_240);
                                    _jettag_c_when_237_240.doStart(context, out);
                                    JET2Writer _jettag_c_when_237_240_saved_out = out;
                                    while (_jettag_c_when_237_240.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_get_237_297 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_297); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_237_297.setRuntimeParent(_jettag_c_when_237_240);
                                        _jettag_c_get_237_297.setTagInfo(_td_c_get_237_297);
                                        _jettag_c_get_237_297.doStart(context, out);
                                        _jettag_c_get_237_297.doEnd();
                                        _jettag_c_when_237_240.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_237_240_saved_out;
                                    _jettag_c_when_237_240.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_237_334 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_237_334); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_237_334.setRuntimeParent(_jettag_c_choose_237_230);
                                    _jettag_c_otherwise_237_334.setTagInfo(_td_c_otherwise_237_334);
                                    _jettag_c_otherwise_237_334.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_237_334_saved_out = out;
                                    while (_jettag_c_otherwise_237_334.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_otherwise_237_334.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_237_334_saved_out;
                                    _jettag_c_otherwise_237_334.doEnd();
                                    _jettag_c_choose_237_230.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_237_230_saved_out;
                                _jettag_c_choose_237_230.doEnd();
                                _jettag_c_iterate_237_168.handleBodyContent(out);
                            }
                            _jettag_c_iterate_237_168.doEnd();
                            out.write("\", referencedColumnName = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_237_411 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_411); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_237_411.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_get_237_411.setTagInfo(_td_c_get_237_411);
                            _jettag_c_get_237_411.doStart(context, out);
                            _jettag_c_get_237_411.doEnd();
                            out.write("\", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_237_573 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_573); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_237_573.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_iterate_237_573.setTagInfo(_td_c_iterate_237_573);
                            _jettag_c_iterate_237_573.doStart(context, out);
                            while (_jettag_c_iterate_237_573.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_237_635 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_237_635); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_237_635.setRuntimeParent(_jettag_c_iterate_237_573);
                                _jettag_c_choose_237_635.setTagInfo(_td_c_choose_237_635);
                                _jettag_c_choose_237_635.doStart(context, out);
                                JET2Writer _jettag_c_choose_237_635_saved_out = out;
                                while (_jettag_c_choose_237_635.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_237_645 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_237_645); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_237_645.setRuntimeParent(_jettag_c_choose_237_635);
                                    _jettag_c_when_237_645.setTagInfo(_td_c_when_237_645);
                                    _jettag_c_when_237_645.doStart(context, out);
                                    JET2Writer _jettag_c_when_237_645_saved_out = out;
                                    while (_jettag_c_when_237_645.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_237_645.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_237_645_saved_out;
                                    _jettag_c_when_237_645.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_237_711 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_237_711); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_237_711.setRuntimeParent(_jettag_c_choose_237_635);
                                    _jettag_c_otherwise_237_711.setTagInfo(_td_c_otherwise_237_711);
                                    _jettag_c_otherwise_237_711.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_237_711_saved_out = out;
                                    while (_jettag_c_otherwise_237_711.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_get_237_724 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_724); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_237_724.setRuntimeParent(_jettag_c_otherwise_237_711);
                                        _jettag_c_get_237_724.setTagInfo(_td_c_get_237_724);
                                        _jettag_c_get_237_724.doStart(context, out);
                                        _jettag_c_get_237_724.doEnd();
                                        _jettag_c_otherwise_237_711.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_237_711_saved_out;
                                    _jettag_c_otherwise_237_711.doEnd();
                                    _jettag_c_choose_237_635.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_237_635_saved_out;
                                _jettag_c_choose_237_635.doEnd();
                                _jettag_c_iterate_237_573.handleBodyContent(out);
                            }
                            _jettag_c_iterate_237_573.doEnd();
                            out.write("\", referencedColumnName = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_237_816 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_237_816); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_237_816.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_iterate_237_816.setTagInfo(_td_c_iterate_237_816);
                            _jettag_c_iterate_237_816.doStart(context, out);
                            while (_jettag_c_iterate_237_816.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_237_881 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_237_881); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_237_881.setRuntimeParent(_jettag_c_iterate_237_816);
                                _jettag_c_choose_237_881.setTagInfo(_td_c_choose_237_881);
                                _jettag_c_choose_237_881.doStart(context, out);
                                JET2Writer _jettag_c_choose_237_881_saved_out = out;
                                while (_jettag_c_choose_237_881.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_237_891 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_237_891); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_237_891.setRuntimeParent(_jettag_c_choose_237_881);
                                    _jettag_c_when_237_891.setTagInfo(_td_c_when_237_891);
                                    _jettag_c_when_237_891.doStart(context, out);
                                    JET2Writer _jettag_c_when_237_891_saved_out = out;
                                    while (_jettag_c_when_237_891.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_237_891.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_237_891_saved_out;
                                    _jettag_c_when_237_891.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_237_956 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_237_956); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_237_956.setRuntimeParent(_jettag_c_choose_237_881);
                                    _jettag_c_otherwise_237_956.setTagInfo(_td_c_otherwise_237_956);
                                    _jettag_c_otherwise_237_956.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_237_956_saved_out = out;
                                    while (_jettag_c_otherwise_237_956.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_get_237_969 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_237_969); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_237_969.setRuntimeParent(_jettag_c_otherwise_237_956);
                                        _jettag_c_get_237_969.setTagInfo(_td_c_get_237_969);
                                        _jettag_c_get_237_969.doStart(context, out);
                                        _jettag_c_get_237_969.doEnd();
                                        _jettag_c_otherwise_237_956.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_237_956_saved_out;
                                    _jettag_c_otherwise_237_956.doEnd();
                                    _jettag_c_choose_237_881.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_237_881_saved_out;
                                _jettag_c_choose_237_881.doEnd();
                                _jettag_c_iterate_237_816.handleBodyContent(out);
                            }
                            _jettag_c_iterate_237_816.doEnd();
                            out.write("\", nullable = false, updatable = false) })");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t@XmlElement(name = \"\", namespace = \"\")");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\tjava.util.Set<");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_239_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_18); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_239_18.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_get_239_18.setTagInfo(_td_c_get_239_18);
                            _jettag_c_get_239_18.doStart(context, out);
                            _jettag_c_get_239_18.doEnd();
                            out.write(".domain.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_239_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_239_56); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_239_56.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_iterate_239_56.setTagInfo(_td_c_iterate_239_56);
                            _jettag_c_iterate_239_56.doStart(context, out);
                            while (_jettag_c_iterate_239_56.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_239_121 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_239_121); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_239_121.setRuntimeParent(_jettag_c_iterate_239_56);
                                _jettag_c_choose_239_121.setTagInfo(_td_c_choose_239_121);
                                _jettag_c_choose_239_121.doStart(context, out);
                                JET2Writer _jettag_c_choose_239_121_saved_out = out;
                                while (_jettag_c_choose_239_121.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_239_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_239_131); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_239_131.setRuntimeParent(_jettag_c_choose_239_121);
                                    _jettag_c_when_239_131.setTagInfo(_td_c_when_239_131);
                                    _jettag_c_when_239_131.doStart(context, out);
                                    JET2Writer _jettag_c_when_239_131_saved_out = out;
                                    while (_jettag_c_when_239_131.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_239_131.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_239_131_saved_out;
                                    _jettag_c_when_239_131.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_239_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_239_196); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_239_196.setRuntimeParent(_jettag_c_choose_239_121);
                                    _jettag_c_otherwise_239_196.setTagInfo(_td_c_otherwise_239_196);
                                    _jettag_c_otherwise_239_196.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_239_196_saved_out = out;
                                    while (_jettag_c_otherwise_239_196.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_get_239_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_209); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_239_209.setRuntimeParent(_jettag_c_otherwise_239_196);
                                        _jettag_c_get_239_209.setTagInfo(_td_c_get_239_209);
                                        _jettag_c_get_239_209.doStart(context, out);
                                        _jettag_c_get_239_209.doEnd();
                                        _jettag_c_otherwise_239_196.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_239_196_saved_out;
                                    _jettag_c_otherwise_239_196.doEnd();
                                    _jettag_c_choose_239_121.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_239_121_saved_out;
                                _jettag_c_choose_239_121.doEnd();
                                _jettag_c_iterate_239_56.handleBodyContent(out);
                            }
                            _jettag_c_iterate_239_56.doEnd();
                            out.write("> ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_iterate_239_305 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_239_305); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_239_305.setRuntimeParent(_jettag_c_when_235_4);
                            _jettag_c_iterate_239_305.setTagInfo(_td_c_iterate_239_305);
                            _jettag_c_iterate_239_305.doStart(context, out);
                            while (_jettag_c_iterate_239_305.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_239_370 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_239_370); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_239_370.setRuntimeParent(_jettag_c_iterate_239_305);
                                _jettag_c_choose_239_370.setTagInfo(_td_c_choose_239_370);
                                _jettag_c_choose_239_370.doStart(context, out);
                                JET2Writer _jettag_c_choose_239_370_saved_out = out;
                                while (_jettag_c_choose_239_370.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_239_380 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_239_380); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_239_380.setRuntimeParent(_jettag_c_choose_239_370);
                                    _jettag_c_when_239_380.setTagInfo(_td_c_when_239_380);
                                    _jettag_c_when_239_380.doStart(context, out);
                                    JET2Writer _jettag_c_when_239_380_saved_out = out;
                                    while (_jettag_c_when_239_380.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_239_380.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_239_380_saved_out;
                                    _jettag_c_when_239_380.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_239_445 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_239_445); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_239_445.setRuntimeParent(_jettag_c_choose_239_370);
                                    _jettag_c_otherwise_239_445.setTagInfo(_td_c_otherwise_239_445);
                                    _jettag_c_otherwise_239_445.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_239_445_saved_out = out;
                                    while (_jettag_c_otherwise_239_445.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        RuntimeTagElement _jettag_c_get_239_458 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_458); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_239_458.setRuntimeParent(_jettag_c_otherwise_239_445);
                                        _jettag_c_get_239_458.setTagInfo(_td_c_get_239_458);
                                        _jettag_c_get_239_458.doStart(context, out);
                                        _jettag_c_get_239_458.doEnd();
                                        RuntimeTagElement _jettag_c_get_239_499 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_239_499); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_239_499.setRuntimeParent(_jettag_c_otherwise_239_445);
                                        _jettag_c_get_239_499.setTagInfo(_td_c_get_239_499);
                                        _jettag_c_get_239_499.doStart(context, out);
                                        _jettag_c_get_239_499.doEnd();
                                        _jettag_c_otherwise_239_445.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_239_445_saved_out;
                                    _jettag_c_otherwise_239_445.doEnd();
                                    _jettag_c_choose_239_370.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_239_370_saved_out;
                                _jettag_c_choose_239_370.doEnd();
                                _jettag_c_iterate_239_305.handleBodyContent(out);
                            }
                            _jettag_c_iterate_239_305.doEnd();
                            out.write("s;");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_235_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_235_4_saved_out;
                        _jettag_c_when_235_4.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_242_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_242_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_242_4.setRuntimeParent(_jettag_c_choose_234_4);
                        _jettag_c_otherwise_242_4.setTagInfo(_td_c_otherwise_242_4);
                        _jettag_c_otherwise_242_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_242_4_saved_out = out;
                        while (_jettag_c_otherwise_242_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t@OneToMany(mappedBy = \"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_243_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_243_27); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_243_27.setRuntimeParent(_jettag_c_otherwise_242_4);
                            _jettag_c_get_243_27.setTagInfo(_td_c_get_243_27);
                            _jettag_c_get_243_27.doStart(context, out);
                            _jettag_c_get_243_27.doEnd();
                            out.write("\", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t@XmlElement(name = \"\", namespace = \"\")");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\tjava.util.Set<");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_245_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_18); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_245_18.setRuntimeParent(_jettag_c_otherwise_242_4);
                            _jettag_c_get_245_18.setTagInfo(_td_c_get_245_18);
                            _jettag_c_get_245_18.doStart(context, out);
                            _jettag_c_get_245_18.doEnd();
                            out.write(".domain.");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_245_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_56); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_245_56.setRuntimeParent(_jettag_c_otherwise_242_4);
                            _jettag_c_get_245_56.setTagInfo(_td_c_get_245_56);
                            _jettag_c_get_245_56.doStart(context, out);
                            _jettag_c_get_245_56.doEnd();
                            out.write("> ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_245_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_109); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_245_109.setRuntimeParent(_jettag_c_otherwise_242_4);
                            _jettag_c_get_245_109.setTagInfo(_td_c_get_245_109);
                            _jettag_c_get_245_109.doStart(context, out);
                            _jettag_c_get_245_109.doEnd();
                            RuntimeTagElement _jettag_c_get_245_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_245_144); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_245_144.setRuntimeParent(_jettag_c_otherwise_242_4);
                            _jettag_c_get_245_144.setTagInfo(_td_c_get_245_144);
                            _jettag_c_get_245_144.doStart(context, out);
                            _jettag_c_get_245_144.doEnd();
                            out.write("s;");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\t");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_242_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_242_4_saved_out;
                        _jettag_c_otherwise_242_4.doEnd();
                        _jettag_c_choose_234_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_234_4_saved_out;
                    _jettag_c_choose_234_4.doEnd();
                    _jettag_c_if_225_3.handleBodyContent(out);
                }
                _jettag_c_if_225_3.doEnd();
                _jettag_c_iterate_224_2.handleBodyContent(out);
            }
            _jettag_c_iterate_224_2.doEnd();
            _jettag_c_iterate_223_2.handleBodyContent(out);
        }
        _jettag_c_iterate_223_2.doEnd();
    }
}
