package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_deleteEntity_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_deleteEntity_0() {
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
    private static final TagInfo _td_c_get_12_21 = new TagInfo("c:get", //$NON-NLS-1$
            12, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_72 = new TagInfo("c:get", //$NON-NLS-1$
            12, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_123 = new TagInfo("c:get", //$NON-NLS-1$
            12, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_4 = new TagInfo("c:get", //$NON-NLS-1$
            13, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_49 = new TagInfo("c:get", //$NON-NLS-1$
            13, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_4 = new TagInfo("c:get", //$NON-NLS-1$
            14, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_17_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            17, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_19_20 = new TagInfo("c:get", //$NON-NLS-1$
            19, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_71 = new TagInfo("c:get", //$NON-NLS-1$
            19, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_122 = new TagInfo("c:get", //$NON-NLS-1$
            19, 122,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "referenceTables/table", //$NON-NLS-1$
                "reference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_3 = new TagInfo("c:if", //$NON-NLS-1$
            23, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$reference/foreigns/column", //$NON-NLS-1$
                "fcol", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_3 = new TagInfo("c:if", //$NON-NLS-1$
            25, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@name=$eachTale/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_3 = new TagInfo("c:get", //$NON-NLS-1$
            26, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($reference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_54 = new TagInfo("c:get", //$NON-NLS-1$
            26, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_89 = new TagInfo("c:get", //$NON-NLS-1$
            26, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_127 = new TagInfo("c:get", //$NON-NLS-1$
            26, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($reference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_3 = new TagInfo("c:if", //$NON-NLS-1$
            27, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@nullable='false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_3 = new TagInfo("c:get", //$NON-NLS-1$
            28, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_51 = new TagInfo("c:get", //$NON-NLS-1$
            28, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($reference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_102 = new TagInfo("c:get", //$NON-NLS-1$
            28, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_3 = new TagInfo("c:if", //$NON-NLS-1$
            30, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@nullable='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_3 = new TagInfo("c:get", //$NON-NLS-1$
            31, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_41 = new TagInfo("c:get", //$NON-NLS-1$
            31, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_25 = new TagInfo("c:get", //$NON-NLS-1$
            32, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$reference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_4 = new TagInfo("c:get", //$NON-NLS-1$
            38, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_42 = new TagInfo("c:get", //$NON-NLS-1$
            38, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_42_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            42, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_43_3 = new TagInfo("c:if", //$NON-NLS-1$
            43, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_44_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            44, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_46_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            46, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_52_4 = new TagInfo("c:choose", //$NON-NLS-1$
            52, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_53_4 = new TagInfo("c:when", //$NON-NLS-1$
            53, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_54_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            54, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_55_4 = new TagInfo("c:choose", //$NON-NLS-1$
            55, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_56_4 = new TagInfo("c:when", //$NON-NLS-1$
            56, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_58_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            58, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_59_5 = new TagInfo("c:get", //$NON-NLS-1$
            59, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_43 = new TagInfo("c:get", //$NON-NLS-1$
            59, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_64_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            64, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_65_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            65, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "fcol", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_66_3 = new TagInfo("c:if", //$NON-NLS-1$
            66, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@name=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_7 = new TagInfo("c:get", //$NON-NLS-1$
            67, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_64 = new TagInfo("c:get", //$NON-NLS-1$
            67, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_107 = new TagInfo("c:get", //$NON-NLS-1$
            67, 107,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_145 = new TagInfo("c:get", //$NON-NLS-1$
            67, 145,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_68_3 = new TagInfo("c:if", //$NON-NLS-1$
            68, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@nullable='false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_7 = new TagInfo("c:get", //$NON-NLS-1$
            69, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_63 = new TagInfo("c:get", //$NON-NLS-1$
            69, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_103 = new TagInfo("c:get", //$NON-NLS-1$
            69, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_4 = new TagInfo("c:get", //$NON-NLS-1$
            70, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_57 = new TagInfo("c:get", //$NON-NLS-1$
            70, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_113 = new TagInfo("c:get", //$NON-NLS-1$
            70, 113,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_73_3 = new TagInfo("c:if", //$NON-NLS-1$
            73, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$fcol/@nullable='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_7 = new TagInfo("c:get", //$NON-NLS-1$
            74, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenceTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_63 = new TagInfo("c:get", //$NON-NLS-1$
            74, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_103 = new TagInfo("c:get", //$NON-NLS-1$
            74, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_4 = new TagInfo("c:get", //$NON-NLS-1$
            75, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_47 = new TagInfo("c:get", //$NON-NLS-1$
            75, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_76_26 = new TagInfo("c:get", //$NON-NLS-1$
            76, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_4 = new TagInfo("c:get", //$NON-NLS-1$
            81, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_42 = new TagInfo("c:get", //$NON-NLS-1$
            81, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_25 = new TagInfo("c:get", //$NON-NLS-1$
            87, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_3 = new TagInfo("c:get", //$NON-NLS-1$
            88, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_88_48 = new TagInfo("c:get", //$NON-NLS-1$
            88, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_3 = new TagInfo("c:get", //$NON-NLS-1$
            89, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_92_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            92, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_93_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            93, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_94_2 = new TagInfo("c:if", //$NON-NLS-1$
            94, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_95_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            95, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_96_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            96, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_97_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            97, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_99_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            99, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_100_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            100, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_101_2 = new TagInfo("c:if", //$NON-NLS-1$
            101, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_102_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            102, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_103_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            103, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_104_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            104, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_106_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            106, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_9 = new TagInfo("c:get", //$NON-NLS-1$
            108, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_66 = new TagInfo("c:get", //$NON-NLS-1$
            108, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_116 = new TagInfo("c:get", //$NON-NLS-1$
            108, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_108_175 = new TagInfo("c:iterate", //$NON-NLS-1$
            108, 175,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_242 = new TagInfo("c:if", //$NON-NLS-1$
            108, 242,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_485 = new TagInfo("c:get", //$NON-NLS-1$
            108, 485,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_520 = new TagInfo("c:get", //$NON-NLS-1$
            108, 520,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_562 = new TagInfo("c:if", //$NON-NLS-1$
            108, 562,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_725 = new TagInfo("c:get", //$NON-NLS-1$
            108, 725,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_760 = new TagInfo("c:get", //$NON-NLS-1$
            108, 760,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_802 = new TagInfo("c:if", //$NON-NLS-1$
            108, 802,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_108_953 = new TagInfo("java:import", //$NON-NLS-1$
            108, 953,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_108_995 = new TagInfo("c:get", //$NON-NLS-1$
            108, 995,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1030 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1030,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_1072 = new TagInfo("c:if", //$NON-NLS-1$
            108, 1072,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_108_1223 = new TagInfo("java:import", //$NON-NLS-1$
            108, 1223,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_108_1271 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1271,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1306 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1306,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_108_1348 = new TagInfo("c:setVariable", //$NON-NLS-1$
            108, 1348,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_1397 = new TagInfo("c:if", //$NON-NLS-1$
            108, 1397,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_108_1441 = new TagInfo("c:iterate", //$NON-NLS-1$
            108, 1441,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_1497 = new TagInfo("c:if", //$NON-NLS-1$
            108, 1497,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1716 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1716,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1759 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1759,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_1797 = new TagInfo("c:if", //$NON-NLS-1$
            108, 1797,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1948 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1948,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_1991 = new TagInfo("c:get", //$NON-NLS-1$
            108, 1991,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_2029 = new TagInfo("c:if", //$NON-NLS-1$
            108, 2029,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_108_2160 = new TagInfo("java:import", //$NON-NLS-1$
            108, 2160,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_108_2210 = new TagInfo("c:get", //$NON-NLS-1$
            108, 2210,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_2253 = new TagInfo("c:get", //$NON-NLS-1$
            108, 2253,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_2291 = new TagInfo("c:if", //$NON-NLS-1$
            108, 2291,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_108_2422 = new TagInfo("java:import", //$NON-NLS-1$
            108, 2422,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_108_2478 = new TagInfo("c:get", //$NON-NLS-1$
            108, 2478,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_2521 = new TagInfo("c:get", //$NON-NLS-1$
            108, 2521,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_108_2559 = new TagInfo("c:setVariable", //$NON-NLS-1$
            108, 2559,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_108_2612 = new TagInfo("c:if", //$NON-NLS-1$
            108, 2612,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_109_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            109, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_3 = new TagInfo("c:get", //$NON-NLS-1$
            110, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_54 = new TagInfo("c:get", //$NON-NLS-1$
            110, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_91 = new TagInfo("c:get", //$NON-NLS-1$
            110, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_133 = new TagInfo("c:get", //$NON-NLS-1$
            110, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_110_196 = new TagInfo("c:iterate", //$NON-NLS-1$
            110, 196,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_263 = new TagInfo("c:get", //$NON-NLS-1$
            110, 263,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_298 = new TagInfo("c:get", //$NON-NLS-1$
            110, 298,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_110_333 = new TagInfo("c:setVariable", //$NON-NLS-1$
            110, 333,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_110_382 = new TagInfo("c:if", //$NON-NLS-1$
            110, 382,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_111_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            111, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_3 = new TagInfo("c:get", //$NON-NLS-1$
            112, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_70 = new TagInfo("c:get", //$NON-NLS-1$
            112, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_115 = new TagInfo("c:get", //$NON-NLS-1$
            112, 115,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_165 = new TagInfo("c:get", //$NON-NLS-1$
            112, 165,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_112_236 = new TagInfo("c:iterate", //$NON-NLS-1$
            112, 236,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_300 = new TagInfo("c:get", //$NON-NLS-1$
            112, 300,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_112_343 = new TagInfo("c:get", //$NON-NLS-1$
            112, 343,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_112_374 = new TagInfo("c:setVariable", //$NON-NLS-1$
            112, 374,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_112_427 = new TagInfo("c:if", //$NON-NLS-1$
            112, 427,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_3 = new TagInfo("c:get", //$NON-NLS-1$
            115, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_41 = new TagInfo("c:get", //$NON-NLS-1$
            115, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_11 = new TagInfo("c:get", //$NON-NLS-1$
            116, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_57 = new TagInfo("c:get", //$NON-NLS-1$
            116, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_116_118 = new TagInfo("c:get", //$NON-NLS-1$
            116, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_3 = new TagInfo("c:get", //$NON-NLS-1$
            117, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_40 = new TagInfo("c:get", //$NON-NLS-1$
            117, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_84 = new TagInfo("c:get", //$NON-NLS-1$
            117, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_118_3 = new TagInfo("c:get", //$NON-NLS-1$
            118, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_11 = new TagInfo("c:get", //$NON-NLS-1$
            119, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_56 = new TagInfo("c:get", //$NON-NLS-1$
            119, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_119_116 = new TagInfo("c:get", //$NON-NLS-1$
            119, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_3 = new TagInfo("c:get", //$NON-NLS-1$
            121, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_10 = new TagInfo("c:get", //$NON-NLS-1$
            122, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_128_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            128, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_129_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            129, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_130_3 = new TagInfo("c:if", //$NON-NLS-1$
            130, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_131_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            131, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_132_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            132, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_133_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            133, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_134_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            134, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_136_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            136, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_137_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            137, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_139_4 = new TagInfo("c:choose", //$NON-NLS-1$
            139, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_140_4 = new TagInfo("c:when", //$NON-NLS-1$
            140, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_141_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            141, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_142_4 = new TagInfo("c:choose", //$NON-NLS-1$
            142, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_143_4 = new TagInfo("c:when", //$NON-NLS-1$
            143, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_145_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            145, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_146_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            146, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_147_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            147, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_148_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            148, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_150_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            150, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_151_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            151, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_152_4 = new TagInfo("c:if", //$NON-NLS-1$
            152, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_153_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            153, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_154_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            154, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_155_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            155, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_157_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            157, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_11 = new TagInfo("c:get", //$NON-NLS-1$
            159, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_68 = new TagInfo("c:get", //$NON-NLS-1$
            159, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_118 = new TagInfo("c:get", //$NON-NLS-1$
            159, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_159_177 = new TagInfo("c:iterate", //$NON-NLS-1$
            159, 177,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_244 = new TagInfo("c:if", //$NON-NLS-1$
            159, 244,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_487 = new TagInfo("c:get", //$NON-NLS-1$
            159, 487,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_522 = new TagInfo("c:get", //$NON-NLS-1$
            159, 522,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_564 = new TagInfo("c:if", //$NON-NLS-1$
            159, 564,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_727 = new TagInfo("c:get", //$NON-NLS-1$
            159, 727,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_762 = new TagInfo("c:get", //$NON-NLS-1$
            159, 762,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_804 = new TagInfo("c:if", //$NON-NLS-1$
            159, 804,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_159_955 = new TagInfo("java:import", //$NON-NLS-1$
            159, 955,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_159_997 = new TagInfo("c:get", //$NON-NLS-1$
            159, 997,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1032 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1032,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1074 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1074,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_159_1225 = new TagInfo("java:import", //$NON-NLS-1$
            159, 1225,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_159_1273 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1273,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1308 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1308,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_159_1350 = new TagInfo("c:setVariable", //$NON-NLS-1$
            159, 1350,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1399 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1399,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_159_1443 = new TagInfo("c:iterate", //$NON-NLS-1$
            159, 1443,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1499 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1499,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1718 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1718,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1747 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1747,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1785 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1785,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1936 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1936,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_1965 = new TagInfo("c:get", //$NON-NLS-1$
            159, 1965,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_2003 = new TagInfo("c:if", //$NON-NLS-1$
            159, 2003,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_159_2134 = new TagInfo("java:import", //$NON-NLS-1$
            159, 2134,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_159_2184 = new TagInfo("c:get", //$NON-NLS-1$
            159, 2184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_2213 = new TagInfo("c:get", //$NON-NLS-1$
            159, 2213,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_2251 = new TagInfo("c:if", //$NON-NLS-1$
            159, 2251,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_159_2382 = new TagInfo("java:import", //$NON-NLS-1$
            159, 2382,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_159_2438 = new TagInfo("c:get", //$NON-NLS-1$
            159, 2438,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_159_2467 = new TagInfo("c:get", //$NON-NLS-1$
            159, 2467,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_159_2505 = new TagInfo("c:setVariable", //$NON-NLS-1$
            159, 2505,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_2558 = new TagInfo("c:if", //$NON-NLS-1$
            159, 2558,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_160_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            160, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_5 = new TagInfo("c:get", //$NON-NLS-1$
            161, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_56 = new TagInfo("c:get", //$NON-NLS-1$
            161, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_93 = new TagInfo("c:get", //$NON-NLS-1$
            161, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_135 = new TagInfo("c:get", //$NON-NLS-1$
            161, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_161_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            161, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_265 = new TagInfo("c:get", //$NON-NLS-1$
            161, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_161_300 = new TagInfo("c:get", //$NON-NLS-1$
            161, 300,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_161_335 = new TagInfo("c:setVariable", //$NON-NLS-1$
            161, 335,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_161_384 = new TagInfo("c:if", //$NON-NLS-1$
            161, 384,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_162_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            162, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_5 = new TagInfo("c:get", //$NON-NLS-1$
            163, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_71 = new TagInfo("c:get", //$NON-NLS-1$
            163, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_116 = new TagInfo("c:get", //$NON-NLS-1$
            163, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_165 = new TagInfo("c:get", //$NON-NLS-1$
            163, 165,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_163_235 = new TagInfo("c:iterate", //$NON-NLS-1$
            163, 235,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_299 = new TagInfo("c:get", //$NON-NLS-1$
            163, 299,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_163_342 = new TagInfo("c:get", //$NON-NLS-1$
            163, 342,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_163_373 = new TagInfo("c:setVariable", //$NON-NLS-1$
            163, 373,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_163_426 = new TagInfo("c:if", //$NON-NLS-1$
            163, 426,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_5 = new TagInfo("c:get", //$NON-NLS-1$
            166, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_43 = new TagInfo("c:get", //$NON-NLS-1$
            166, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_166_119 = new TagInfo("c:get", //$NON-NLS-1$
            166, 119,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_13 = new TagInfo("c:get", //$NON-NLS-1$
            167, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_59 = new TagInfo("c:get", //$NON-NLS-1$
            167, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_120 = new TagInfo("c:get", //$NON-NLS-1$
            167, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_5 = new TagInfo("c:get", //$NON-NLS-1$
            168, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_42 = new TagInfo("c:get", //$NON-NLS-1$
            168, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_168_86 = new TagInfo("c:get", //$NON-NLS-1$
            168, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_169_5 = new TagInfo("c:get", //$NON-NLS-1$
            169, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_13 = new TagInfo("c:get", //$NON-NLS-1$
            171, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_58 = new TagInfo("c:get", //$NON-NLS-1$
            171, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_171_117 = new TagInfo("c:get", //$NON-NLS-1$
            171, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_172_5 = new TagInfo("c:get", //$NON-NLS-1$
            172, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_173_5 = new TagInfo("c:get", //$NON-NLS-1$
            173, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_174_12 = new TagInfo("c:get", //$NON-NLS-1$
            174, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_180_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            180, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_181_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            181, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_182_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            182, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_183_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            183, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_185_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            185, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_186_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            186, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_187_4 = new TagInfo("c:if", //$NON-NLS-1$
            187, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_188_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            188, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_189_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            189, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_190_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            190, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+1", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_192_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            192, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount", //$NON-NLS-1$
                "pkNum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_11 = new TagInfo("c:get", //$NON-NLS-1$
            194, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_68 = new TagInfo("c:get", //$NON-NLS-1$
            194, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_118 = new TagInfo("c:get", //$NON-NLS-1$
            194, 118,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_194_171 = new TagInfo("c:iterate", //$NON-NLS-1$
            194, 171,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_238 = new TagInfo("c:if", //$NON-NLS-1$
            194, 238,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_481 = new TagInfo("c:get", //$NON-NLS-1$
            194, 481,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_516 = new TagInfo("c:get", //$NON-NLS-1$
            194, 516,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_558 = new TagInfo("c:if", //$NON-NLS-1$
            194, 558,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_721 = new TagInfo("c:get", //$NON-NLS-1$
            194, 721,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_756 = new TagInfo("c:get", //$NON-NLS-1$
            194, 756,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_798 = new TagInfo("c:if", //$NON-NLS-1$
            194, 798,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_194_949 = new TagInfo("java:import", //$NON-NLS-1$
            194, 949,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_194_991 = new TagInfo("c:get", //$NON-NLS-1$
            194, 991,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1026 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1026,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_1068 = new TagInfo("c:if", //$NON-NLS-1$
            194, 1068,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_194_1219 = new TagInfo("java:import", //$NON-NLS-1$
            194, 1219,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_194_1267 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1267,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1302 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1302,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_194_1344 = new TagInfo("c:setVariable", //$NON-NLS-1$
            194, 1344,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_1393 = new TagInfo("c:if", //$NON-NLS-1$
            194, 1393,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_194_1437 = new TagInfo("c:iterate", //$NON-NLS-1$
            194, 1437,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_1493 = new TagInfo("c:if", //$NON-NLS-1$
            194, 1493,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='VARCHAR'or$priKey/@type='CHAR'or$priKey/@type='SET'or$priKey/@type='ENUM'or$priKey/@type='TINYTEXT'or$priKey/@type='TEXT'or$priKey/@type='MEDIUMTEXT'or$priKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1712 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1712,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1749 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1749,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_1787 = new TagInfo("c:if", //$NON-NLS-1$
            194, 1787,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='SMALLINT'or$priKey/@type='MEDIUMINT'or$priKey/@type='INT'or$priKey/@type='INTEGER'or$priKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1938 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1938,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_1975 = new TagInfo("c:get", //$NON-NLS-1$
            194, 1975,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_2013 = new TagInfo("c:if", //$NON-NLS-1$
            194, 2013,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='TIMESTAMP'or$priKey/@type='DATE'or$priKey/@type='TIME'or$priKey/@type='YEAR'or$priKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_194_2144 = new TagInfo("java:import", //$NON-NLS-1$
            194, 2144,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_194_2194 = new TagInfo("c:get", //$NON-NLS-1$
            194, 2194,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_2231 = new TagInfo("c:get", //$NON-NLS-1$
            194, 2231,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_2269 = new TagInfo("c:if", //$NON-NLS-1$
            194, 2269,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@type='DOUBLE'or$priKey/@type='FLOAT'or$priKey/@type='REAL'or$priKey/@type='DECIMAL'or$priKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_194_2400 = new TagInfo("java:import", //$NON-NLS-1$
            194, 2400,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_194_2456 = new TagInfo("c:get", //$NON-NLS-1$
            194, 2456,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_194_2493 = new TagInfo("c:get", //$NON-NLS-1$
            194, 2493,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_194_2531 = new TagInfo("c:setVariable", //$NON-NLS-1$
            194, 2531,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_194_2584 = new TagInfo("c:if", //$NON-NLS-1$
            194, 2584,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_195_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            195, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkNum", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_5 = new TagInfo("c:get", //$NON-NLS-1$
            196, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_65 = new TagInfo("c:get", //$NON-NLS-1$
            196, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_104 = new TagInfo("c:get", //$NON-NLS-1$
            196, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_147 = new TagInfo("c:get", //$NON-NLS-1$
            196, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_196_211 = new TagInfo("c:iterate", //$NON-NLS-1$
            196, 211,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/primaryKeys/column", //$NON-NLS-1$
                "priKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_275 = new TagInfo("c:get", //$NON-NLS-1$
            196, 275,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_312 = new TagInfo("c:get", //$NON-NLS-1$
            196, 312,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$priKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_196_343 = new TagInfo("c:setVariable", //$NON-NLS-1$
            196, 343,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount+(-1)", //$NON-NLS-1$
                "pkCount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_196_396 = new TagInfo("c:if", //$NON-NLS-1$
            196, 396,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkCount>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_197_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            197, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_5 = new TagInfo("c:get", //$NON-NLS-1$
            198, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_56 = new TagInfo("c:get", //$NON-NLS-1$
            198, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_93 = new TagInfo("c:get", //$NON-NLS-1$
            198, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_135 = new TagInfo("c:get", //$NON-NLS-1$
            198, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_198_198 = new TagInfo("c:iterate", //$NON-NLS-1$
            198, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_265 = new TagInfo("c:get", //$NON-NLS-1$
            198, 265,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_198_300 = new TagInfo("c:get", //$NON-NLS-1$
            198, 300,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_198_335 = new TagInfo("c:setVariable", //$NON-NLS-1$
            198, 335,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_198_384 = new TagInfo("c:if", //$NON-NLS-1$
            198, 384,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_201_9 = new TagInfo("c:get", //$NON-NLS-1$
            201, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_201_62 = new TagInfo("c:get", //$NON-NLS-1$
            201, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_201_101 = new TagInfo("c:get", //$NON-NLS-1$
            201, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_201_139 = new TagInfo("c:get", //$NON-NLS-1$
            201, 139,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_202_5 = new TagInfo("c:get", //$NON-NLS-1$
            202, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_202_68 = new TagInfo("c:get", //$NON-NLS-1$
            202, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_203_8 = new TagInfo("c:get", //$NON-NLS-1$
            203, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_204_9 = new TagInfo("c:get", //$NON-NLS-1$
            204, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_204_64 = new TagInfo("c:get", //$NON-NLS-1$
            204, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_205_21 = new TagInfo("c:get", //$NON-NLS-1$
            205, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_206_22 = new TagInfo("c:get", //$NON-NLS-1$
            206, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_211_15 = new TagInfo("c:get", //$NON-NLS-1$
            211, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_5 = new TagInfo("c:get", //$NON-NLS-1$
            212, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_43 = new TagInfo("c:get", //$NON-NLS-1$
            212, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_214_35 = new TagInfo("c:get", //$NON-NLS-1$
            214, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_215_27 = new TagInfo("c:get", //$NON-NLS-1$
            215, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_216_5 = new TagInfo("c:get", //$NON-NLS-1$
            216, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_12 = new TagInfo("c:get", //$NON-NLS-1$
            218, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
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
                out.write("\t\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tpublic void delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_21.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_12_21.setTagInfo(_td_c_get_12_21);
                _jettag_c_get_12_21.doStart(context, out);
                _jettag_c_get_12_21.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_72); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_72.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_12_72.setTagInfo(_td_c_get_12_72);
                _jettag_c_get_12_72.doStart(context, out);
                _jettag_c_get_12_72.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_123); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_123.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_12_123.setTagInfo(_td_c_get_12_123);
                _jettag_c_get_12_123.doStart(context, out);
                _jettag_c_get_12_123.doEnd();
                out.write(") {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_4.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_13_4.setTagInfo(_td_c_get_13_4);
                _jettag_c_get_13_4.doStart(context, out);
                _jettag_c_get_13_4.doEnd();
                out.write("DAO.remove(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_49); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_49.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_13_49.setTagInfo(_td_c_get_13_49);
                _jettag_c_get_13_49.doStart(context, out);
                _jettag_c_get_13_49.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_4.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_14_4.setTagInfo(_td_c_get_14_4);
                _jettag_c_get_14_4.doStart(context, out);
                _jettag_c_get_14_4.doEnd();
                out.write("DAO.flush();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t}");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_10_2.handleBodyContent(out);
            }
            out = _jettag_c_when_10_2_saved_out;
            _jettag_c_when_10_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_17_2.setRuntimeParent(_jettag_c_choose_9_2);
            _jettag_c_otherwise_17_2.setTagInfo(_td_c_otherwise_17_2);
            _jettag_c_otherwise_17_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_17_2_saved_out = out;
            while (_jettag_c_otherwise_17_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t@Transactional");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tpublic void delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_20.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_19_20.setTagInfo(_td_c_get_19_20);
                _jettag_c_get_19_20.doStart(context, out);
                _jettag_c_get_19_20.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_71); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_71.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_19_71.setTagInfo(_td_c_get_19_71);
                _jettag_c_get_19_71.doStart(context, out);
                _jettag_c_get_19_71.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_122); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_122.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_19_122.setTagInfo(_td_c_get_19_122);
                _jettag_c_get_19_122.doStart(context, out);
                _jettag_c_get_19_122.doEnd();
                out.write("){");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_21_3.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_iterate_21_3.setTagInfo(_td_c_iterate_21_3);
                _jettag_c_iterate_21_3.doStart(context, out);
                while (_jettag_c_iterate_21_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_22_3.setRuntimeParent(_jettag_c_iterate_21_3);
                    _jettag_c_iterate_22_3.setTagInfo(_td_c_iterate_22_3);
                    _jettag_c_iterate_22_3.doStart(context, out);
                    while (_jettag_c_iterate_22_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_23_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_23_3.setRuntimeParent(_jettag_c_iterate_22_3);
                        _jettag_c_if_23_3.setTagInfo(_td_c_if_23_3);
                        _jettag_c_if_23_3.doStart(context, out);
                        while (_jettag_c_if_23_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_24_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_24_3.setRuntimeParent(_jettag_c_if_23_3);
                            _jettag_c_iterate_24_3.setTagInfo(_td_c_iterate_24_3);
                            _jettag_c_iterate_24_3.doStart(context, out);
                            while (_jettag_c_iterate_24_3.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_25_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_3); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_25_3.setRuntimeParent(_jettag_c_iterate_24_3);
                                _jettag_c_if_25_3.setTagInfo(_td_c_if_25_3);
                                _jettag_c_if_25_3.doStart(context, out);
                                while (_jettag_c_if_25_3.okToProcessBody()) {
                                    out.write("\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_26_3.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_get_26_3.setTagInfo(_td_c_get_26_3);
                                    _jettag_c_get_26_3.doStart(context, out);
                                    _jettag_c_get_26_3.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_26_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_54); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_26_54.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_get_26_54.setTagInfo(_td_c_get_26_54);
                                    _jettag_c_get_26_54.doStart(context, out);
                                    _jettag_c_get_26_54.doEnd();
                                    out.write("=");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_26_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_89); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_26_89.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_get_26_89.setTagInfo(_td_c_get_26_89);
                                    _jettag_c_get_26_89.doStart(context, out);
                                    _jettag_c_get_26_89.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_26_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_127); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_26_127.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_get_26_127.setTagInfo(_td_c_get_26_127);
                                    _jettag_c_get_26_127.doStart(context, out);
                                    _jettag_c_get_26_127.doEnd();
                                    out.write("();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_if_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_27_3.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_if_27_3.setTagInfo(_td_c_if_27_3);
                                    _jettag_c_if_27_3.doStart(context, out);
                                    while (_jettag_c_if_27_3.okToProcessBody()) {
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_28_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_28_3.setRuntimeParent(_jettag_c_if_27_3);
                                        _jettag_c_get_28_3.setTagInfo(_td_c_get_28_3);
                                        _jettag_c_get_28_3.doStart(context, out);
                                        _jettag_c_get_28_3.doEnd();
                                        out.write("Service.delete");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_28_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_51); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_28_51.setRuntimeParent(_jettag_c_if_27_3);
                                        _jettag_c_get_28_51.setTagInfo(_td_c_get_28_51);
                                        _jettag_c_get_28_51.doStart(context, out);
                                        _jettag_c_get_28_51.doEnd();
                                        out.write("(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_28_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_102); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_28_102.setRuntimeParent(_jettag_c_if_27_3);
                                        _jettag_c_get_28_102.setTagInfo(_td_c_get_28_102);
                                        _jettag_c_get_28_102.doStart(context, out);
                                        _jettag_c_get_28_102.doEnd();
                                        out.write(");");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_27_3.handleBodyContent(out);
                                    }
                                    _jettag_c_if_27_3.doEnd();
                                    RuntimeTagElement _jettag_c_if_30_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_30_3.setRuntimeParent(_jettag_c_if_25_3);
                                    _jettag_c_if_30_3.setTagInfo(_td_c_if_30_3);
                                    _jettag_c_if_30_3.doStart(context, out);
                                    while (_jettag_c_if_30_3.okToProcessBody()) {
                                        out.write("\t\t");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_31_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_31_3.setRuntimeParent(_jettag_c_if_30_3);
                                        _jettag_c_get_31_3.setTagInfo(_td_c_get_31_3);
                                        _jettag_c_get_31_3.doStart(context, out);
                                        _jettag_c_get_31_3.doEnd();
                                        out.write(".set");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_31_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_41); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_31_41.setRuntimeParent(_jettag_c_if_30_3);
                                        _jettag_c_get_31_41.setTagInfo(_td_c_get_31_41);
                                        _jettag_c_get_31_41.doStart(context, out);
                                        _jettag_c_get_31_41.doEnd();
                                        out.write("(null);");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\tentityManager.persist(");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_32_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_25); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_32_25.setRuntimeParent(_jettag_c_if_30_3);
                                        _jettag_c_get_32_25.setTagInfo(_td_c_get_32_25);
                                        _jettag_c_get_32_25.doStart(context, out);
                                        _jettag_c_get_32_25.doEnd();
                                        out.write(");");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_30_3.handleBodyContent(out);
                                    }
                                    _jettag_c_if_30_3.doEnd();
                                    _jettag_c_if_25_3.handleBodyContent(out);
                                }
                                _jettag_c_if_25_3.doEnd();
                                _jettag_c_iterate_24_3.handleBodyContent(out);
                            }
                            _jettag_c_iterate_24_3.doEnd();
                            _jettag_c_if_23_3.handleBodyContent(out);
                        }
                        _jettag_c_if_23_3.doEnd();
                        _jettag_c_iterate_22_3.handleBodyContent(out);
                    }
                    _jettag_c_iterate_22_3.doEnd();
                    out.write("\t\t ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_38_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_4.setRuntimeParent(_jettag_c_iterate_21_3);
                    _jettag_c_get_38_4.setTagInfo(_td_c_get_38_4);
                    _jettag_c_get_38_4.doStart(context, out);
                    _jettag_c_get_38_4.doEnd();
                    out.write(".set");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_38_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_42); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_38_42.setRuntimeParent(_jettag_c_iterate_21_3);
                    _jettag_c_get_38_42.setTagInfo(_td_c_get_38_42);
                    _jettag_c_get_38_42.doStart(context, out);
                    _jettag_c_get_38_42.doEnd();
                    out.write("(null);");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_21_3.handleBodyContent(out);
                }
                _jettag_c_iterate_21_3.doEnd();
                out.write("\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_41_3.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_iterate_41_3.setTagInfo(_td_c_iterate_41_3);
                _jettag_c_iterate_41_3.doStart(context, out);
                while (_jettag_c_iterate_41_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_42_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_42_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_42_3.setRuntimeParent(_jettag_c_iterate_41_3);
                    _jettag_c_iterate_42_3.setTagInfo(_td_c_iterate_42_3);
                    _jettag_c_iterate_42_3.doStart(context, out);
                    while (_jettag_c_iterate_42_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_43_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_43_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_43_3.setRuntimeParent(_jettag_c_iterate_42_3);
                        _jettag_c_if_43_3.setTagInfo(_td_c_if_43_3);
                        _jettag_c_if_43_3.doStart(context, out);
                        while (_jettag_c_if_43_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_44_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_44_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_44_4.setRuntimeParent(_jettag_c_if_43_3);
                            _jettag_c_setVariable_44_4.setTagInfo(_td_c_setVariable_44_4);
                            _jettag_c_setVariable_44_4.doStart(context, out);
                            _jettag_c_setVariable_44_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_45_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_45_4.setRuntimeParent(_jettag_c_if_43_3);
                            _jettag_c_setVariable_45_4.setTagInfo(_td_c_setVariable_45_4);
                            _jettag_c_setVariable_45_4.doStart(context, out);
                            _jettag_c_setVariable_45_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_46_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_46_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_46_4.setRuntimeParent(_jettag_c_if_43_3);
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
                            RuntimeTagElement _jettag_c_iterate_49_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_49_4.setRuntimeParent(_jettag_c_if_43_3);
                            _jettag_c_iterate_49_4.setTagInfo(_td_c_iterate_49_4);
                            _jettag_c_iterate_49_4.doStart(context, out);
                            while (_jettag_c_iterate_49_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_50_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_50_5.setRuntimeParent(_jettag_c_iterate_49_4);
                                _jettag_c_setVariable_50_5.setTagInfo(_td_c_setVariable_50_5);
                                _jettag_c_setVariable_50_5.doStart(context, out);
                                _jettag_c_setVariable_50_5.doEnd();
                                _jettag_c_iterate_49_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_49_4.doEnd();
                            RuntimeTagElement _jettag_c_choose_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_52_4.setRuntimeParent(_jettag_c_if_43_3);
                            _jettag_c_choose_52_4.setTagInfo(_td_c_choose_52_4);
                            _jettag_c_choose_52_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_52_4_saved_out = out;
                            while (_jettag_c_choose_52_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_53_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_53_4.setRuntimeParent(_jettag_c_choose_52_4);
                                _jettag_c_when_53_4.setTagInfo(_td_c_when_53_4);
                                _jettag_c_when_53_4.doStart(context, out);
                                JET2Writer _jettag_c_when_53_4_saved_out = out;
                                while (_jettag_c_when_53_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_54_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_54_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_54_4.setRuntimeParent(_jettag_c_when_53_4);
                                    _jettag_c_iterate_54_4.setTagInfo(_td_c_iterate_54_4);
                                    _jettag_c_iterate_54_4.doStart(context, out);
                                    while (_jettag_c_iterate_54_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_55_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_55_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_55_4.setRuntimeParent(_jettag_c_iterate_54_4);
                                        _jettag_c_choose_55_4.setTagInfo(_td_c_choose_55_4);
                                        _jettag_c_choose_55_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_55_4_saved_out = out;
                                        while (_jettag_c_choose_55_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_56_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_56_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_56_4.setRuntimeParent(_jettag_c_choose_55_4);
                                            _jettag_c_when_56_4.setTagInfo(_td_c_when_56_4);
                                            _jettag_c_when_56_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_56_4_saved_out = out;
                                            while (_jettag_c_when_56_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_56_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_56_4_saved_out;
                                            _jettag_c_when_56_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_58_4.setRuntimeParent(_jettag_c_choose_55_4);
                                            _jettag_c_otherwise_58_4.setTagInfo(_td_c_otherwise_58_4);
                                            _jettag_c_otherwise_58_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_58_4_saved_out = out;
                                            while (_jettag_c_otherwise_58_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("\t\t\t ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_59_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_59_5.setRuntimeParent(_jettag_c_otherwise_58_4);
                                                _jettag_c_get_59_5.setTagInfo(_td_c_get_59_5);
                                                _jettag_c_get_59_5.doStart(context, out);
                                                _jettag_c_get_59_5.doEnd();
                                                out.write(".set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_59_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_43); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_59_43.setRuntimeParent(_jettag_c_otherwise_58_4);
                                                _jettag_c_get_59_43.setTagInfo(_td_c_get_59_43);
                                                _jettag_c_get_59_43.doStart(context, out);
                                                _jettag_c_get_59_43.doEnd();
                                                out.write("s(null);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_58_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_58_4_saved_out;
                                            _jettag_c_otherwise_58_4.doEnd();
                                            _jettag_c_choose_55_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_55_4_saved_out;
                                        _jettag_c_choose_55_4.doEnd();
                                        _jettag_c_iterate_54_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_54_4.doEnd();
                                    _jettag_c_when_53_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_53_4_saved_out;
                                _jettag_c_when_53_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_64_4.setRuntimeParent(_jettag_c_choose_52_4);
                                _jettag_c_otherwise_64_4.setTagInfo(_td_c_otherwise_64_4);
                                _jettag_c_otherwise_64_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_64_4_saved_out = out;
                                while (_jettag_c_otherwise_64_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_65_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_65_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_65_3.setRuntimeParent(_jettag_c_otherwise_64_4);
                                    _jettag_c_iterate_65_3.setTagInfo(_td_c_iterate_65_3);
                                    _jettag_c_iterate_65_3.doStart(context, out);
                                    while (_jettag_c_iterate_65_3.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_66_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_66_3); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_66_3.setRuntimeParent(_jettag_c_iterate_65_3);
                                        _jettag_c_if_66_3.setTagInfo(_td_c_if_66_3);
                                        _jettag_c_if_66_3.doStart(context, out);
                                        while (_jettag_c_if_66_3.okToProcessBody()) {
                                            out.write("\t\tSet<");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_67_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_7); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_67_7.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_get_67_7.setTagInfo(_td_c_get_67_7);
                                            _jettag_c_get_67_7.doStart(context, out);
                                            _jettag_c_get_67_7.doEnd();
                                            out.write("> ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_67_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_64); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_67_64.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_get_67_64.setTagInfo(_td_c_get_67_64);
                                            _jettag_c_get_67_64.doStart(context, out);
                                            _jettag_c_get_67_64.doEnd();
                                            out.write("Set=");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_67_107 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_107); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_67_107.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_get_67_107.setTagInfo(_td_c_get_67_107);
                                            _jettag_c_get_67_107.doStart(context, out);
                                            _jettag_c_get_67_107.doEnd();
                                            out.write(".get");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_67_145 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_145); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_67_145.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_get_67_145.setTagInfo(_td_c_get_67_145);
                                            _jettag_c_get_67_145.doStart(context, out);
                                            _jettag_c_get_67_145.doEnd();
                                            out.write("s();");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            RuntimeTagElement _jettag_c_if_68_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_68_3); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_68_3.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_if_68_3.setTagInfo(_td_c_if_68_3);
                                            _jettag_c_if_68_3.doStart(context, out);
                                            while (_jettag_c_if_68_3.okToProcessBody()) {
                                                out.write("\t\tfor(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_69_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_7); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_69_7.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_69_7.setTagInfo(_td_c_get_69_7);
                                                _jettag_c_get_69_7.doStart(context, out);
                                                _jettag_c_get_69_7.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_69_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_63); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_69_63.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_69_63.setTagInfo(_td_c_get_69_63);
                                                _jettag_c_get_69_63.doStart(context, out);
                                                _jettag_c_get_69_63.doEnd();
                                                out.write(":");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_69_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_103); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_69_103.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_69_103.setTagInfo(_td_c_get_69_103);
                                                _jettag_c_get_69_103.doStart(context, out);
                                                _jettag_c_get_69_103.doEnd();
                                                out.write("Set){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_70_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_70_4.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_70_4.setTagInfo(_td_c_get_70_4);
                                                _jettag_c_get_70_4.doStart(context, out);
                                                _jettag_c_get_70_4.doEnd();
                                                out.write("Service.delete");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_70_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_57); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_70_57.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_70_57.setTagInfo(_td_c_get_70_57);
                                                _jettag_c_get_70_57.doStart(context, out);
                                                _jettag_c_get_70_57.doEnd();
                                                out.write("(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_70_113 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_113); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_70_113.setRuntimeParent(_jettag_c_if_68_3);
                                                _jettag_c_get_70_113.setTagInfo(_td_c_get_70_113);
                                                _jettag_c_get_70_113.doStart(context, out);
                                                _jettag_c_get_70_113.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_68_3.handleBodyContent(out);
                                            }
                                            _jettag_c_if_68_3.doEnd();
                                            RuntimeTagElement _jettag_c_if_73_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_73_3); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_if_73_3.setRuntimeParent(_jettag_c_if_66_3);
                                            _jettag_c_if_73_3.setTagInfo(_td_c_if_73_3);
                                            _jettag_c_if_73_3.doStart(context, out);
                                            while (_jettag_c_if_73_3.okToProcessBody()) {
                                                out.write("\t\tfor(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_74_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_7); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_74_7.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_74_7.setTagInfo(_td_c_get_74_7);
                                                _jettag_c_get_74_7.doStart(context, out);
                                                _jettag_c_get_74_7.doEnd();
                                                out.write(" ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_74_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_63); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_74_63.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_74_63.setTagInfo(_td_c_get_74_63);
                                                _jettag_c_get_74_63.doStart(context, out);
                                                _jettag_c_get_74_63.doEnd();
                                                out.write(":");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_74_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_103); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_74_103.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_74_103.setTagInfo(_td_c_get_74_103);
                                                _jettag_c_get_74_103.doStart(context, out);
                                                _jettag_c_get_74_103.doEnd();
                                                out.write("Set){");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_75_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_75_4.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_75_4.setTagInfo(_td_c_get_75_4);
                                                _jettag_c_get_75_4.doStart(context, out);
                                                _jettag_c_get_75_4.doEnd();
                                                out.write(".set");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_75_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_47); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_75_47.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_75_47.setTagInfo(_td_c_get_75_47);
                                                _jettag_c_get_75_47.doStart(context, out);
                                                _jettag_c_get_75_47.doEnd();
                                                out.write("(null);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_76_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_76_26); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_76_26.setRuntimeParent(_jettag_c_if_73_3);
                                                _jettag_c_get_76_26.setTagInfo(_td_c_get_76_26);
                                                _jettag_c_get_76_26.doStart(context, out);
                                                _jettag_c_get_76_26.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_if_73_3.handleBodyContent(out);
                                            }
                                            _jettag_c_if_73_3.doEnd();
                                            _jettag_c_if_66_3.handleBodyContent(out);
                                        }
                                        _jettag_c_if_66_3.doEnd();
                                        _jettag_c_iterate_65_3.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_65_3.doEnd();
                                    out.write("\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_81_4.setRuntimeParent(_jettag_c_otherwise_64_4);
                                    _jettag_c_get_81_4.setTagInfo(_td_c_get_81_4);
                                    _jettag_c_get_81_4.doStart(context, out);
                                    _jettag_c_get_81_4.doEnd();
                                    out.write(".set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_81_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_42); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_81_42.setRuntimeParent(_jettag_c_otherwise_64_4);
                                    _jettag_c_get_81_42.setTagInfo(_td_c_get_81_42);
                                    _jettag_c_get_81_42.doStart(context, out);
                                    _jettag_c_get_81_42.doEnd();
                                    out.write("s(null);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_64_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_64_4_saved_out;
                                _jettag_c_otherwise_64_4.doEnd();
                                _jettag_c_choose_52_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_52_4_saved_out;
                            _jettag_c_choose_52_4.doEnd();
                            _jettag_c_if_43_3.handleBodyContent(out);
                        }
                        _jettag_c_if_43_3.doEnd();
                        _jettag_c_iterate_42_3.handleBodyContent(out);
                    }
                    _jettag_c_iterate_42_3.doEnd();
                    _jettag_c_iterate_41_3.handleBodyContent(out);
                }
                _jettag_c_iterate_41_3.doEnd();
                out.write("\t\tentityManager.persist(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_87_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_87_25.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_87_25.setTagInfo(_td_c_get_87_25);
                _jettag_c_get_87_25.doStart(context, out);
                _jettag_c_get_87_25.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_88_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_3.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_88_3.setTagInfo(_td_c_get_88_3);
                _jettag_c_get_88_3.doStart(context, out);
                _jettag_c_get_88_3.doEnd();
                out.write("DAO.remove(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_88_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_88_48); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_88_48.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_88_48.setTagInfo(_td_c_get_88_48);
                _jettag_c_get_88_48.doStart(context, out);
                _jettag_c_get_88_48.doEnd();
                out.write(");");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_89_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_3.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_get_89_3.setTagInfo(_td_c_get_89_3);
                _jettag_c_get_89_3.doStart(context, out);
                _jettag_c_get_89_3.doEnd();
                out.write("DAO.flush();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_92_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_92_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_92_2.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_iterate_92_2.setTagInfo(_td_c_iterate_92_2);
                _jettag_c_iterate_92_2.doStart(context, out);
                while (_jettag_c_iterate_92_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_93_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_93_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_93_2.setRuntimeParent(_jettag_c_iterate_92_2);
                    _jettag_c_iterate_93_2.setTagInfo(_td_c_iterate_93_2);
                    _jettag_c_iterate_93_2.doStart(context, out);
                    while (_jettag_c_iterate_93_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_94_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_94_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_94_2.setRuntimeParent(_jettag_c_iterate_93_2);
                        _jettag_c_if_94_2.setTagInfo(_td_c_if_94_2);
                        _jettag_c_if_94_2.doStart(context, out);
                        while (_jettag_c_if_94_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_95_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_95_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_95_2.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_setVariable_95_2.setTagInfo(_td_c_setVariable_95_2);
                            _jettag_c_setVariable_95_2.doStart(context, out);
                            _jettag_c_setVariable_95_2.doEnd();
                            RuntimeTagElement _jettag_c_iterate_96_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_96_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_96_2.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_iterate_96_2.setTagInfo(_td_c_iterate_96_2);
                            _jettag_c_iterate_96_2.doStart(context, out);
                            while (_jettag_c_iterate_96_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_97_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_97_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_97_2.setRuntimeParent(_jettag_c_iterate_96_2);
                                _jettag_c_setVariable_97_2.setTagInfo(_td_c_setVariable_97_2);
                                _jettag_c_setVariable_97_2.doStart(context, out);
                                _jettag_c_setVariable_97_2.doEnd();
                                _jettag_c_iterate_96_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_96_2.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_99_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_99_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_99_2.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_setVariable_99_2.setTagInfo(_td_c_setVariable_99_2);
                            _jettag_c_setVariable_99_2.doStart(context, out);
                            _jettag_c_setVariable_99_2.doEnd();
                            RuntimeTagElement _jettag_c_iterate_100_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_100_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_100_2.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_iterate_100_2.setTagInfo(_td_c_iterate_100_2);
                            _jettag_c_iterate_100_2.doStart(context, out);
                            while (_jettag_c_iterate_100_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_101_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_101_2); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_101_2.setRuntimeParent(_jettag_c_iterate_100_2);
                                _jettag_c_if_101_2.setTagInfo(_td_c_if_101_2);
                                _jettag_c_if_101_2.doStart(context, out);
                                while (_jettag_c_if_101_2.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_102_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_102_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_102_2.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_setVariable_102_2.setTagInfo(_td_c_setVariable_102_2);
                                    _jettag_c_setVariable_102_2.doStart(context, out);
                                    _jettag_c_setVariable_102_2.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_103_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_103_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_103_2.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_iterate_103_2.setTagInfo(_td_c_iterate_103_2);
                                    _jettag_c_iterate_103_2.doStart(context, out);
                                    while (_jettag_c_iterate_103_2.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_104_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_104_2); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_104_2.setRuntimeParent(_jettag_c_iterate_103_2);
                                        _jettag_c_setVariable_104_2.setTagInfo(_td_c_setVariable_104_2);
                                        _jettag_c_setVariable_104_2.doStart(context, out);
                                        _jettag_c_setVariable_104_2.doEnd();
                                        _jettag_c_iterate_103_2.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_103_2.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_106_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_106_2); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_106_2.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_setVariable_106_2.setTagInfo(_td_c_setVariable_106_2);
                                    _jettag_c_setVariable_106_2.doStart(context, out);
                                    _jettag_c_setVariable_106_2.doEnd();
                                    out.write("\t@Transactional");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\tpublic ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_108_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_9); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_9.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_108_9.setTagInfo(_td_c_get_108_9);
                                    _jettag_c_get_108_9.doStart(context, out);
                                    _jettag_c_get_108_9.doEnd();
                                    out.write(" delete");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_108_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_66); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_66.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_108_66.setTagInfo(_td_c_get_108_66);
                                    _jettag_c_get_108_66.doStart(context, out);
                                    _jettag_c_get_108_66.doEnd();
                                    RuntimeTagElement _jettag_c_get_108_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_116); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_108_116.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_108_116.setTagInfo(_td_c_get_108_116);
                                    _jettag_c_get_108_116.doStart(context, out);
                                    _jettag_c_get_108_116.doEnd();
                                    out.write("(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_108_175 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_108_175); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_108_175.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_iterate_108_175.setTagInfo(_td_c_iterate_108_175);
                                    _jettag_c_iterate_108_175.doStart(context, out);
                                    while (_jettag_c_iterate_108_175.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_108_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_242); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_242.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_if_108_242.setTagInfo(_td_c_if_108_242);
                                        _jettag_c_if_108_242.doStart(context, out);
                                        while (_jettag_c_if_108_242.okToProcessBody()) {
                                            out.write("String ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_485 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_485); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_485.setRuntimeParent(_jettag_c_if_108_242);
                                            _jettag_c_get_108_485.setTagInfo(_td_c_get_108_485);
                                            _jettag_c_get_108_485.doStart(context, out);
                                            _jettag_c_get_108_485.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_520 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_520); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_520.setRuntimeParent(_jettag_c_if_108_242);
                                            _jettag_c_get_108_520.setTagInfo(_td_c_get_108_520);
                                            _jettag_c_get_108_520.doStart(context, out);
                                            _jettag_c_get_108_520.doEnd();
                                            _jettag_c_if_108_242.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_242.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_562 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_562); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_562.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_if_108_562.setTagInfo(_td_c_if_108_562);
                                        _jettag_c_if_108_562.doStart(context, out);
                                        while (_jettag_c_if_108_562.okToProcessBody()) {
                                            out.write("Integer ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_725 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_725); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_725.setRuntimeParent(_jettag_c_if_108_562);
                                            _jettag_c_get_108_725.setTagInfo(_td_c_get_108_725);
                                            _jettag_c_get_108_725.doStart(context, out);
                                            _jettag_c_get_108_725.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_760 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_760); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_760.setRuntimeParent(_jettag_c_if_108_562);
                                            _jettag_c_get_108_760.setTagInfo(_td_c_get_108_760);
                                            _jettag_c_get_108_760.doStart(context, out);
                                            _jettag_c_get_108_760.doEnd();
                                            _jettag_c_if_108_562.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_562.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_802 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_802); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_802.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_if_108_802.setTagInfo(_td_c_if_108_802);
                                        _jettag_c_if_108_802.doStart(context, out);
                                        while (_jettag_c_if_108_802.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_108_953 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_108_953); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_108_953.setRuntimeParent(_jettag_c_if_108_802);
                                            _jettag_java_import_108_953.setTagInfo(_td_java_import_108_953);
                                            _jettag_java_import_108_953.doStart(context, out);
                                            JET2Writer _jettag_java_import_108_953_saved_out = out;
                                            while (_jettag_java_import_108_953.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_108_953.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_108_953_saved_out;
                                            _jettag_java_import_108_953.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_995 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_995); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_995.setRuntimeParent(_jettag_c_if_108_802);
                                            _jettag_c_get_108_995.setTagInfo(_td_c_get_108_995);
                                            _jettag_c_get_108_995.doStart(context, out);
                                            _jettag_c_get_108_995.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1030 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1030); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1030.setRuntimeParent(_jettag_c_if_108_802);
                                            _jettag_c_get_108_1030.setTagInfo(_td_c_get_108_1030);
                                            _jettag_c_get_108_1030.doStart(context, out);
                                            _jettag_c_get_108_1030.doEnd();
                                            _jettag_c_if_108_802.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_802.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_1072 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_1072); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_1072.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_if_108_1072.setTagInfo(_td_c_if_108_1072);
                                        _jettag_c_if_108_1072.doStart(context, out);
                                        while (_jettag_c_if_108_1072.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_108_1223 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_108_1223); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_108_1223.setRuntimeParent(_jettag_c_if_108_1072);
                                            _jettag_java_import_108_1223.setTagInfo(_td_java_import_108_1223);
                                            _jettag_java_import_108_1223.doStart(context, out);
                                            JET2Writer _jettag_java_import_108_1223_saved_out = out;
                                            while (_jettag_java_import_108_1223.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_108_1223.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_108_1223_saved_out;
                                            _jettag_java_import_108_1223.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1271 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1271); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1271.setRuntimeParent(_jettag_c_if_108_1072);
                                            _jettag_c_get_108_1271.setTagInfo(_td_c_get_108_1271);
                                            _jettag_c_get_108_1271.doStart(context, out);
                                            _jettag_c_get_108_1271.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1306 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1306); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1306.setRuntimeParent(_jettag_c_if_108_1072);
                                            _jettag_c_get_108_1306.setTagInfo(_td_c_get_108_1306);
                                            _jettag_c_get_108_1306.doStart(context, out);
                                            _jettag_c_get_108_1306.doEnd();
                                            _jettag_c_if_108_1072.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_1072.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_108_1348 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_108_1348); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_108_1348.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_setVariable_108_1348.setTagInfo(_td_c_setVariable_108_1348);
                                        _jettag_c_setVariable_108_1348.doStart(context, out);
                                        _jettag_c_setVariable_108_1348.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_1397 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_1397); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_1397.setRuntimeParent(_jettag_c_iterate_108_175);
                                        _jettag_c_if_108_1397.setTagInfo(_td_c_if_108_1397);
                                        _jettag_c_if_108_1397.doStart(context, out);
                                        while (_jettag_c_if_108_1397.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_108_1397.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_1397.doEnd();
                                        _jettag_c_iterate_108_175.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_108_175.doEnd();
                                    out.write(", ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_108_1441 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_108_1441); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_108_1441.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_iterate_108_1441.setTagInfo(_td_c_iterate_108_1441);
                                    _jettag_c_iterate_108_1441.doStart(context, out);
                                    while (_jettag_c_iterate_108_1441.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_108_1497 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_1497); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_1497.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_if_108_1497.setTagInfo(_td_c_if_108_1497);
                                        _jettag_c_if_108_1497.doStart(context, out);
                                        while (_jettag_c_if_108_1497.okToProcessBody()) {
                                            out.write("String related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1716 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1716); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1716.setRuntimeParent(_jettag_c_if_108_1497);
                                            _jettag_c_get_108_1716.setTagInfo(_td_c_get_108_1716);
                                            _jettag_c_get_108_1716.doStart(context, out);
                                            _jettag_c_get_108_1716.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1759 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1759); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1759.setRuntimeParent(_jettag_c_if_108_1497);
                                            _jettag_c_get_108_1759.setTagInfo(_td_c_get_108_1759);
                                            _jettag_c_get_108_1759.doStart(context, out);
                                            _jettag_c_get_108_1759.doEnd();
                                            _jettag_c_if_108_1497.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_1497.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_1797 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_1797); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_1797.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_if_108_1797.setTagInfo(_td_c_if_108_1797);
                                        _jettag_c_if_108_1797.doStart(context, out);
                                        while (_jettag_c_if_108_1797.okToProcessBody()) {
                                            out.write("Integer related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1948 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1948); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1948.setRuntimeParent(_jettag_c_if_108_1797);
                                            _jettag_c_get_108_1948.setTagInfo(_td_c_get_108_1948);
                                            _jettag_c_get_108_1948.doStart(context, out);
                                            _jettag_c_get_108_1948.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_1991 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_1991); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_1991.setRuntimeParent(_jettag_c_if_108_1797);
                                            _jettag_c_get_108_1991.setTagInfo(_td_c_get_108_1991);
                                            _jettag_c_get_108_1991.doStart(context, out);
                                            _jettag_c_get_108_1991.doEnd();
                                            _jettag_c_if_108_1797.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_1797.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_2029 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_2029); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_2029.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_if_108_2029.setTagInfo(_td_c_if_108_2029);
                                        _jettag_c_if_108_2029.doStart(context, out);
                                        while (_jettag_c_if_108_2029.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_108_2160 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_108_2160); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_108_2160.setRuntimeParent(_jettag_c_if_108_2029);
                                            _jettag_java_import_108_2160.setTagInfo(_td_java_import_108_2160);
                                            _jettag_java_import_108_2160.doStart(context, out);
                                            JET2Writer _jettag_java_import_108_2160_saved_out = out;
                                            while (_jettag_java_import_108_2160.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.util.Date");  //$NON-NLS-1$        
                                                _jettag_java_import_108_2160.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_108_2160_saved_out;
                                            _jettag_java_import_108_2160.doEnd();
                                            out.write(" related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_2210 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_2210); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_2210.setRuntimeParent(_jettag_c_if_108_2029);
                                            _jettag_c_get_108_2210.setTagInfo(_td_c_get_108_2210);
                                            _jettag_c_get_108_2210.doStart(context, out);
                                            _jettag_c_get_108_2210.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_2253 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_2253); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_2253.setRuntimeParent(_jettag_c_if_108_2029);
                                            _jettag_c_get_108_2253.setTagInfo(_td_c_get_108_2253);
                                            _jettag_c_get_108_2253.doStart(context, out);
                                            _jettag_c_get_108_2253.doEnd();
                                            _jettag_c_if_108_2029.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_2029.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_2291 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_2291); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_2291.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_if_108_2291.setTagInfo(_td_c_if_108_2291);
                                        _jettag_c_if_108_2291.doStart(context, out);
                                        while (_jettag_c_if_108_2291.okToProcessBody()) {
                                            RuntimeTagElement _jettag_java_import_108_2422 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_108_2422); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_java_import_108_2422.setRuntimeParent(_jettag_c_if_108_2291);
                                            _jettag_java_import_108_2422.setTagInfo(_td_java_import_108_2422);
                                            _jettag_java_import_108_2422.doStart(context, out);
                                            JET2Writer _jettag_java_import_108_2422_saved_out = out;
                                            while (_jettag_java_import_108_2422.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                _jettag_java_import_108_2422.handleBodyContent(out);
                                            }
                                            out = _jettag_java_import_108_2422_saved_out;
                                            _jettag_java_import_108_2422.doEnd();
                                            out.write(" related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_2478 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_2478); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_2478.setRuntimeParent(_jettag_c_if_108_2291);
                                            _jettag_c_get_108_2478.setTagInfo(_td_c_get_108_2478);
                                            _jettag_c_get_108_2478.doStart(context, out);
                                            _jettag_c_get_108_2478.doEnd();
                                            out.write("_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_108_2521 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_2521); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_108_2521.setRuntimeParent(_jettag_c_if_108_2291);
                                            _jettag_c_get_108_2521.setTagInfo(_td_c_get_108_2521);
                                            _jettag_c_get_108_2521.doStart(context, out);
                                            _jettag_c_get_108_2521.doEnd();
                                            _jettag_c_if_108_2291.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_2291.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_108_2559 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_108_2559); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_108_2559.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_setVariable_108_2559.setTagInfo(_td_c_setVariable_108_2559);
                                        _jettag_c_setVariable_108_2559.doStart(context, out);
                                        _jettag_c_setVariable_108_2559.doEnd();
                                        RuntimeTagElement _jettag_c_if_108_2612 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_108_2612); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_108_2612.setRuntimeParent(_jettag_c_iterate_108_1441);
                                        _jettag_c_if_108_2612.setTagInfo(_td_c_if_108_2612);
                                        _jettag_c_if_108_2612.doStart(context, out);
                                        while (_jettag_c_if_108_2612.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_108_2612.handleBodyContent(out);
                                        }
                                        _jettag_c_if_108_2612.doEnd();
                                        _jettag_c_iterate_108_1441.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_108_1441.doEnd();
                                    out.write("){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_setVariable_109_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_109_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_109_3.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_setVariable_109_3.setTagInfo(_td_c_setVariable_109_3);
                                    _jettag_c_setVariable_109_3.doStart(context, out);
                                    _jettag_c_setVariable_109_3.doEnd();
                                    out.write("\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_3.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_110_3.setTagInfo(_td_c_get_110_3);
                                    _jettag_c_get_110_3.doStart(context, out);
                                    _jettag_c_get_110_3.doEnd();
                                    out.write(" ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_54); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_54.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_110_54.setTagInfo(_td_c_get_110_54);
                                    _jettag_c_get_110_54.doStart(context, out);
                                    _jettag_c_get_110_54.doEnd();
                                    out.write(" = ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_91); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_91.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_110_91.setTagInfo(_td_c_get_110_91);
                                    _jettag_c_get_110_91.doStart(context, out);
                                    _jettag_c_get_110_91.doEnd();
                                    out.write("DAO.find");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_110_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_133); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_110_133.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_110_133.setTagInfo(_td_c_get_110_133);
                                    _jettag_c_get_110_133.doStart(context, out);
                                    _jettag_c_get_110_133.doEnd();
                                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_110_196 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_110_196); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_110_196.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_iterate_110_196.setTagInfo(_td_c_iterate_110_196);
                                    _jettag_c_iterate_110_196.doStart(context, out);
                                    while (_jettag_c_iterate_110_196.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_get_110_263 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_263); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_110_263.setRuntimeParent(_jettag_c_iterate_110_196);
                                        _jettag_c_get_110_263.setTagInfo(_td_c_get_110_263);
                                        _jettag_c_get_110_263.doStart(context, out);
                                        _jettag_c_get_110_263.doEnd();
                                        out.write("_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_110_298 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_298); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_110_298.setRuntimeParent(_jettag_c_iterate_110_196);
                                        _jettag_c_get_110_298.setTagInfo(_td_c_get_110_298);
                                        _jettag_c_get_110_298.doStart(context, out);
                                        _jettag_c_get_110_298.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_110_333 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_110_333); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_110_333.setRuntimeParent(_jettag_c_iterate_110_196);
                                        _jettag_c_setVariable_110_333.setTagInfo(_td_c_setVariable_110_333);
                                        _jettag_c_setVariable_110_333.doStart(context, out);
                                        _jettag_c_setVariable_110_333.doEnd();
                                        RuntimeTagElement _jettag_c_if_110_382 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_110_382); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_110_382.setRuntimeParent(_jettag_c_iterate_110_196);
                                        _jettag_c_if_110_382.setTagInfo(_td_c_if_110_382);
                                        _jettag_c_if_110_382.doStart(context, out);
                                        while (_jettag_c_if_110_382.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_110_382.handleBodyContent(out);
                                        }
                                        _jettag_c_if_110_382.doEnd();
                                        _jettag_c_iterate_110_196.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_110_196.doEnd();
                                    out.write(", -1, -1);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    RuntimeTagElement _jettag_c_setVariable_111_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_111_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_111_3.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_setVariable_111_3.setTagInfo(_td_c_setVariable_111_3);
                                    _jettag_c_setVariable_111_3.doStart(context, out);
                                    _jettag_c_setVariable_111_3.doEnd();
                                    out.write("\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_112_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_3); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_112_3.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_112_3.setTagInfo(_td_c_get_112_3);
                                    _jettag_c_get_112_3.doStart(context, out);
                                    _jettag_c_get_112_3.doEnd();
                                    out.write(" related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_112_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_70); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_112_70.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_112_70.setTagInfo(_td_c_get_112_70);
                                    _jettag_c_get_112_70.doStart(context, out);
                                    _jettag_c_get_112_70.doEnd();
                                    out.write(" = ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_112_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_115); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_112_115.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_112_115.setTagInfo(_td_c_get_112_115);
                                    _jettag_c_get_112_115.doStart(context, out);
                                    _jettag_c_get_112_115.doEnd();
                                    out.write("DAO.find");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_112_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_165); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_112_165.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_get_112_165.setTagInfo(_td_c_get_112_165);
                                    _jettag_c_get_112_165.doStart(context, out);
                                    _jettag_c_get_112_165.doEnd();
                                    out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_iterate_112_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_112_236); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_112_236.setRuntimeParent(_jettag_c_if_101_2);
                                    _jettag_c_iterate_112_236.setTagInfo(_td_c_iterate_112_236);
                                    _jettag_c_iterate_112_236.doStart(context, out);
                                    while (_jettag_c_iterate_112_236.okToProcessBody()) {
                                        out.write("related_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_112_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_300); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_112_300.setRuntimeParent(_jettag_c_iterate_112_236);
                                        _jettag_c_get_112_300.setTagInfo(_td_c_get_112_300);
                                        _jettag_c_get_112_300.doStart(context, out);
                                        _jettag_c_get_112_300.doEnd();
                                        out.write("_");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_112_343 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_112_343); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_112_343.setRuntimeParent(_jettag_c_iterate_112_236);
                                        _jettag_c_get_112_343.setTagInfo(_td_c_get_112_343);
                                        _jettag_c_get_112_343.doStart(context, out);
                                        _jettag_c_get_112_343.doEnd();
                                        RuntimeTagElement _jettag_c_setVariable_112_374 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_112_374); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_112_374.setRuntimeParent(_jettag_c_iterate_112_236);
                                        _jettag_c_setVariable_112_374.setTagInfo(_td_c_setVariable_112_374);
                                        _jettag_c_setVariable_112_374.doStart(context, out);
                                        _jettag_c_setVariable_112_374.doEnd();
                                        RuntimeTagElement _jettag_c_if_112_427 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_112_427); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_112_427.setRuntimeParent(_jettag_c_iterate_112_236);
                                        _jettag_c_if_112_427.setTagInfo(_td_c_if_112_427);
                                        _jettag_c_if_112_427.doStart(context, out);
                                        while (_jettag_c_if_112_427.okToProcessBody()) {
                                            out.write(",");  //$NON-NLS-1$        
                                            _jettag_c_if_112_427.handleBodyContent(out);
                                        }
                                        _jettag_c_if_112_427.doEnd();
                                        _jettag_c_iterate_112_236.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_112_236.doEnd();
                                    out.write(", -1, -1);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_if_101_2.handleBodyContent(out);
                                }
                                _jettag_c_if_101_2.doEnd();
                                _jettag_c_iterate_100_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_100_2.doEnd();
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_115_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_115_3.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_115_3.setTagInfo(_td_c_get_115_3);
                            _jettag_c_get_115_3.doStart(context, out);
                            _jettag_c_get_115_3.doEnd();
                            out.write(".set");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_115_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_41); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_115_41.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_115_41.setTagInfo(_td_c_get_115_41);
                            _jettag_c_get_115_41.doStart(context, out);
                            _jettag_c_get_115_41.doEnd();
                            out.write("(null);");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_116_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_11); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_116_11.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_116_11.setTagInfo(_td_c_get_116_11);
                            _jettag_c_get_116_11.doStart(context, out);
                            _jettag_c_get_116_11.doEnd();
                            out.write(".get");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_116_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_57); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_116_57.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_116_57.setTagInfo(_td_c_get_116_57);
                            _jettag_c_get_116_57.doStart(context, out);
                            _jettag_c_get_116_57.doEnd();
                            out.write("s().remove(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_116_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_116_118); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_116_118.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_116_118.setTagInfo(_td_c_get_116_118);
                            _jettag_c_get_116_118.doStart(context, out);
                            _jettag_c_get_116_118.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_117_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_117_3.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_117_3.setTagInfo(_td_c_get_117_3);
                            _jettag_c_get_117_3.doStart(context, out);
                            _jettag_c_get_117_3.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_117_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_40); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_117_40.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_117_40.setTagInfo(_td_c_get_117_40);
                            _jettag_c_get_117_40.doStart(context, out);
                            _jettag_c_get_117_40.doEnd();
                            out.write("DAO.store(");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_117_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_84); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_117_84.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_117_84.setTagInfo(_td_c_get_117_84);
                            _jettag_c_get_117_84.doStart(context, out);
                            _jettag_c_get_117_84.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_118_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_118_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_118_3.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_118_3.setTagInfo(_td_c_get_118_3);
                            _jettag_c_get_118_3.doStart(context, out);
                            _jettag_c_get_118_3.doEnd();
                            out.write("DAO.flush();");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\trelated_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_119_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_11); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_119_11.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_119_11.setTagInfo(_td_c_get_119_11);
                            _jettag_c_get_119_11.doStart(context, out);
                            _jettag_c_get_119_11.doEnd();
                            out.write(" = ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_119_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_56); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_119_56.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_119_56.setTagInfo(_td_c_get_119_56);
                            _jettag_c_get_119_56.doStart(context, out);
                            _jettag_c_get_119_56.doEnd();
                            out.write("DAO.store(related_");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_119_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_119_116); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_119_116.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_119_116.setTagInfo(_td_c_get_119_116);
                            _jettag_c_get_119_116.doStart(context, out);
                            _jettag_c_get_119_116.doEnd();
                            out.write(");");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write(NL);         
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_121_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_121_3.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_121_3.setTagInfo(_td_c_get_121_3);
                            _jettag_c_get_121_3.doStart(context, out);
                            _jettag_c_get_121_3.doEnd();
                            out.write("DAO.flush();");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\treturn ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_122_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_10); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_122_10.setRuntimeParent(_jettag_c_if_94_2);
                            _jettag_c_get_122_10.setTagInfo(_td_c_get_122_10);
                            _jettag_c_get_122_10.doStart(context, out);
                            _jettag_c_get_122_10.doEnd();
                            out.write(";");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t}");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_if_94_2.handleBodyContent(out);
                        }
                        _jettag_c_if_94_2.doEnd();
                        _jettag_c_iterate_93_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_93_2.doEnd();
                    _jettag_c_iterate_92_2.handleBodyContent(out);
                }
                _jettag_c_iterate_92_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_128_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_128_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_128_2.setRuntimeParent(_jettag_c_otherwise_17_2);
                _jettag_c_iterate_128_2.setTagInfo(_td_c_iterate_128_2);
                _jettag_c_iterate_128_2.doStart(context, out);
                while (_jettag_c_iterate_128_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_129_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_129_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_129_2.setRuntimeParent(_jettag_c_iterate_128_2);
                    _jettag_c_iterate_129_2.setTagInfo(_td_c_iterate_129_2);
                    _jettag_c_iterate_129_2.doStart(context, out);
                    while (_jettag_c_iterate_129_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_130_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_130_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_130_3.setRuntimeParent(_jettag_c_iterate_129_2);
                        _jettag_c_if_130_3.setTagInfo(_td_c_if_130_3);
                        _jettag_c_if_130_3.doStart(context, out);
                        while (_jettag_c_if_130_3.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_131_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_131_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_131_4.setRuntimeParent(_jettag_c_if_130_3);
                            _jettag_c_setVariable_131_4.setTagInfo(_td_c_setVariable_131_4);
                            _jettag_c_setVariable_131_4.doStart(context, out);
                            _jettag_c_setVariable_131_4.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_132_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_132_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_132_4.setRuntimeParent(_jettag_c_if_130_3);
                            _jettag_c_setVariable_132_4.setTagInfo(_td_c_setVariable_132_4);
                            _jettag_c_setVariable_132_4.doStart(context, out);
                            _jettag_c_setVariable_132_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_133_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_133_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_133_4.setRuntimeParent(_jettag_c_if_130_3);
                            _jettag_c_iterate_133_4.setTagInfo(_td_c_iterate_133_4);
                            _jettag_c_iterate_133_4.doStart(context, out);
                            while (_jettag_c_iterate_133_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_134_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_134_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_134_5.setRuntimeParent(_jettag_c_iterate_133_4);
                                _jettag_c_setVariable_134_5.setTagInfo(_td_c_setVariable_134_5);
                                _jettag_c_setVariable_134_5.doStart(context, out);
                                _jettag_c_setVariable_134_5.doEnd();
                                _jettag_c_iterate_133_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_133_4.doEnd();
                            RuntimeTagElement _jettag_c_iterate_136_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_136_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_136_4.setRuntimeParent(_jettag_c_if_130_3);
                            _jettag_c_iterate_136_4.setTagInfo(_td_c_iterate_136_4);
                            _jettag_c_iterate_136_4.doStart(context, out);
                            while (_jettag_c_iterate_136_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_137_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_137_5); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_137_5.setRuntimeParent(_jettag_c_iterate_136_4);
                                _jettag_c_setVariable_137_5.setTagInfo(_td_c_setVariable_137_5);
                                _jettag_c_setVariable_137_5.doStart(context, out);
                                _jettag_c_setVariable_137_5.doEnd();
                                _jettag_c_iterate_136_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_136_4.doEnd();
                            RuntimeTagElement _jettag_c_choose_139_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_139_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_139_4.setRuntimeParent(_jettag_c_if_130_3);
                            _jettag_c_choose_139_4.setTagInfo(_td_c_choose_139_4);
                            _jettag_c_choose_139_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_139_4_saved_out = out;
                            while (_jettag_c_choose_139_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_140_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_140_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_140_4.setRuntimeParent(_jettag_c_choose_139_4);
                                _jettag_c_when_140_4.setTagInfo(_td_c_when_140_4);
                                _jettag_c_when_140_4.doStart(context, out);
                                JET2Writer _jettag_c_when_140_4_saved_out = out;
                                while (_jettag_c_when_140_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_141_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_141_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_141_4.setRuntimeParent(_jettag_c_when_140_4);
                                    _jettag_c_iterate_141_4.setTagInfo(_td_c_iterate_141_4);
                                    _jettag_c_iterate_141_4.doStart(context, out);
                                    while (_jettag_c_iterate_141_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_142_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_142_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_142_4.setRuntimeParent(_jettag_c_iterate_141_4);
                                        _jettag_c_choose_142_4.setTagInfo(_td_c_choose_142_4);
                                        _jettag_c_choose_142_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_142_4_saved_out = out;
                                        while (_jettag_c_choose_142_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_143_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_143_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_143_4.setRuntimeParent(_jettag_c_choose_142_4);
                                            _jettag_c_when_143_4.setTagInfo(_td_c_when_143_4);
                                            _jettag_c_when_143_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_143_4_saved_out = out;
                                            while (_jettag_c_when_143_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_143_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_143_4_saved_out;
                                            _jettag_c_when_143_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_145_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_145_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_145_4.setRuntimeParent(_jettag_c_choose_142_4);
                                            _jettag_c_otherwise_145_4.setTagInfo(_td_c_otherwise_145_4);
                                            _jettag_c_otherwise_145_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_145_4_saved_out = out;
                                            while (_jettag_c_otherwise_145_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_setVariable_146_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_146_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_146_4.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_setVariable_146_4.setTagInfo(_td_c_setVariable_146_4);
                                                _jettag_c_setVariable_146_4.doStart(context, out);
                                                _jettag_c_setVariable_146_4.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_147_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_147_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_147_4.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_iterate_147_4.setTagInfo(_td_c_iterate_147_4);
                                                _jettag_c_iterate_147_4.doStart(context, out);
                                                while (_jettag_c_iterate_147_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_148_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_148_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_148_4.setRuntimeParent(_jettag_c_iterate_147_4);
                                                    _jettag_c_setVariable_148_4.setTagInfo(_td_c_setVariable_148_4);
                                                    _jettag_c_setVariable_148_4.doStart(context, out);
                                                    _jettag_c_setVariable_148_4.doEnd();
                                                    _jettag_c_iterate_147_4.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_147_4.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_150_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_150_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_150_4.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_setVariable_150_4.setTagInfo(_td_c_setVariable_150_4);
                                                _jettag_c_setVariable_150_4.doStart(context, out);
                                                _jettag_c_setVariable_150_4.doEnd();
                                                RuntimeTagElement _jettag_c_iterate_151_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_151_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_iterate_151_4.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_iterate_151_4.setTagInfo(_td_c_iterate_151_4);
                                                _jettag_c_iterate_151_4.doStart(context, out);
                                                while (_jettag_c_iterate_151_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_if_152_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_152_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_152_4.setRuntimeParent(_jettag_c_iterate_151_4);
                                                    _jettag_c_if_152_4.setTagInfo(_td_c_if_152_4);
                                                    _jettag_c_if_152_4.doStart(context, out);
                                                    while (_jettag_c_if_152_4.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_setVariable_153_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_153_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_153_4.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_setVariable_153_4.setTagInfo(_td_c_setVariable_153_4);
                                                        _jettag_c_setVariable_153_4.doStart(context, out);
                                                        _jettag_c_setVariable_153_4.doEnd();
                                                        RuntimeTagElement _jettag_c_iterate_154_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_154_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_154_4.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_iterate_154_4.setTagInfo(_td_c_iterate_154_4);
                                                        _jettag_c_iterate_154_4.doStart(context, out);
                                                        while (_jettag_c_iterate_154_4.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_setVariable_155_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_155_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_155_4.setRuntimeParent(_jettag_c_iterate_154_4);
                                                            _jettag_c_setVariable_155_4.setTagInfo(_td_c_setVariable_155_4);
                                                            _jettag_c_setVariable_155_4.doStart(context, out);
                                                            _jettag_c_setVariable_155_4.doEnd();
                                                            _jettag_c_iterate_154_4.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_154_4.doEnd();
                                                        RuntimeTagElement _jettag_c_setVariable_157_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_157_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_157_4.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_setVariable_157_4.setTagInfo(_td_c_setVariable_157_4);
                                                        _jettag_c_setVariable_157_4.doStart(context, out);
                                                        _jettag_c_setVariable_157_4.doEnd();
                                                        out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_159_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_11); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_159_11.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_159_11.setTagInfo(_td_c_get_159_11);
                                                        _jettag_c_get_159_11.doStart(context, out);
                                                        _jettag_c_get_159_11.doEnd();
                                                        out.write(" delete");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_159_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_68); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_159_68.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_159_68.setTagInfo(_td_c_get_159_68);
                                                        _jettag_c_get_159_68.doStart(context, out);
                                                        _jettag_c_get_159_68.doEnd();
                                                        RuntimeTagElement _jettag_c_get_159_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_118); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_159_118.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_159_118.setTagInfo(_td_c_get_159_118);
                                                        _jettag_c_get_159_118.doStart(context, out);
                                                        _jettag_c_get_159_118.doEnd();
                                                        out.write("s(");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_iterate_159_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_159_177); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_159_177.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_iterate_159_177.setTagInfo(_td_c_iterate_159_177);
                                                        _jettag_c_iterate_159_177.doStart(context, out);
                                                        while (_jettag_c_iterate_159_177.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_if_159_244 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_244); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_244.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_if_159_244.setTagInfo(_td_c_if_159_244);
                                                            _jettag_c_if_159_244.doStart(context, out);
                                                            while (_jettag_c_if_159_244.okToProcessBody()) {
                                                                out.write("String ");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_487 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_487); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_487.setRuntimeParent(_jettag_c_if_159_244);
                                                                _jettag_c_get_159_487.setTagInfo(_td_c_get_159_487);
                                                                _jettag_c_get_159_487.doStart(context, out);
                                                                _jettag_c_get_159_487.doEnd();
                                                                out.write("_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_522 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_522); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_522.setRuntimeParent(_jettag_c_if_159_244);
                                                                _jettag_c_get_159_522.setTagInfo(_td_c_get_159_522);
                                                                _jettag_c_get_159_522.doStart(context, out);
                                                                _jettag_c_get_159_522.doEnd();
                                                                _jettag_c_if_159_244.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_244.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_564 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_564); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_564.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_if_159_564.setTagInfo(_td_c_if_159_564);
                                                            _jettag_c_if_159_564.doStart(context, out);
                                                            while (_jettag_c_if_159_564.okToProcessBody()) {
                                                                out.write("Integer ");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_727 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_727); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_727.setRuntimeParent(_jettag_c_if_159_564);
                                                                _jettag_c_get_159_727.setTagInfo(_td_c_get_159_727);
                                                                _jettag_c_get_159_727.doStart(context, out);
                                                                _jettag_c_get_159_727.doEnd();
                                                                out.write("_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_762 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_762); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_762.setRuntimeParent(_jettag_c_if_159_564);
                                                                _jettag_c_get_159_762.setTagInfo(_td_c_get_159_762);
                                                                _jettag_c_get_159_762.doStart(context, out);
                                                                _jettag_c_get_159_762.doEnd();
                                                                _jettag_c_if_159_564.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_564.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_804 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_804); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_804.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_if_159_804.setTagInfo(_td_c_if_159_804);
                                                            _jettag_c_if_159_804.doStart(context, out);
                                                            while (_jettag_c_if_159_804.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_159_955 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_159_955); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_159_955.setRuntimeParent(_jettag_c_if_159_804);
                                                                _jettag_java_import_159_955.setTagInfo(_td_java_import_159_955);
                                                                _jettag_java_import_159_955.doStart(context, out);
                                                                JET2Writer _jettag_java_import_159_955_saved_out = out;
                                                                while (_jettag_java_import_159_955.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.util.Date");  //$NON-NLS-1$        
                                                                    _jettag_java_import_159_955.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_159_955_saved_out;
                                                                _jettag_java_import_159_955.doEnd();
                                                                out.write(" ");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_997 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_997); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_997.setRuntimeParent(_jettag_c_if_159_804);
                                                                _jettag_c_get_159_997.setTagInfo(_td_c_get_159_997);
                                                                _jettag_c_get_159_997.doStart(context, out);
                                                                _jettag_c_get_159_997.doEnd();
                                                                out.write("_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1032 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1032); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1032.setRuntimeParent(_jettag_c_if_159_804);
                                                                _jettag_c_get_159_1032.setTagInfo(_td_c_get_159_1032);
                                                                _jettag_c_get_159_1032.doStart(context, out);
                                                                _jettag_c_get_159_1032.doEnd();
                                                                _jettag_c_if_159_804.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_804.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_1074 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1074); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_1074.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_if_159_1074.setTagInfo(_td_c_if_159_1074);
                                                            _jettag_c_if_159_1074.doStart(context, out);
                                                            while (_jettag_c_if_159_1074.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_159_1225 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_159_1225); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_159_1225.setRuntimeParent(_jettag_c_if_159_1074);
                                                                _jettag_java_import_159_1225.setTagInfo(_td_java_import_159_1225);
                                                                _jettag_java_import_159_1225.doStart(context, out);
                                                                JET2Writer _jettag_java_import_159_1225_saved_out = out;
                                                                while (_jettag_java_import_159_1225.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                                    _jettag_java_import_159_1225.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_159_1225_saved_out;
                                                                _jettag_java_import_159_1225.doEnd();
                                                                out.write(" ");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1273 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1273); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1273.setRuntimeParent(_jettag_c_if_159_1074);
                                                                _jettag_c_get_159_1273.setTagInfo(_td_c_get_159_1273);
                                                                _jettag_c_get_159_1273.doStart(context, out);
                                                                _jettag_c_get_159_1273.doEnd();
                                                                out.write("_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1308 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1308); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1308.setRuntimeParent(_jettag_c_if_159_1074);
                                                                _jettag_c_get_159_1308.setTagInfo(_td_c_get_159_1308);
                                                                _jettag_c_get_159_1308.doStart(context, out);
                                                                _jettag_c_get_159_1308.doEnd();
                                                                _jettag_c_if_159_1074.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_1074.doEnd();
                                                            RuntimeTagElement _jettag_c_setVariable_159_1350 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_159_1350); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_159_1350.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_setVariable_159_1350.setTagInfo(_td_c_setVariable_159_1350);
                                                            _jettag_c_setVariable_159_1350.doStart(context, out);
                                                            _jettag_c_setVariable_159_1350.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_1399 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1399); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_1399.setRuntimeParent(_jettag_c_iterate_159_177);
                                                            _jettag_c_if_159_1399.setTagInfo(_td_c_if_159_1399);
                                                            _jettag_c_if_159_1399.doStart(context, out);
                                                            while (_jettag_c_if_159_1399.okToProcessBody()) {
                                                                out.write(",");  //$NON-NLS-1$        
                                                                _jettag_c_if_159_1399.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_1399.doEnd();
                                                            _jettag_c_iterate_159_177.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_159_177.doEnd();
                                                        out.write(", ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_iterate_159_1443 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_159_1443); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_159_1443.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_iterate_159_1443.setTagInfo(_td_c_iterate_159_1443);
                                                        _jettag_c_iterate_159_1443.doStart(context, out);
                                                        while (_jettag_c_iterate_159_1443.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_if_159_1499 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1499); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_1499.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_if_159_1499.setTagInfo(_td_c_if_159_1499);
                                                            _jettag_c_if_159_1499.doStart(context, out);
                                                            while (_jettag_c_if_159_1499.okToProcessBody()) {
                                                                out.write("String related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1718 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1718); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1718.setRuntimeParent(_jettag_c_if_159_1499);
                                                                _jettag_c_get_159_1718.setTagInfo(_td_c_get_159_1718);
                                                                _jettag_c_get_159_1718.doStart(context, out);
                                                                _jettag_c_get_159_1718.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1747 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1747); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1747.setRuntimeParent(_jettag_c_if_159_1499);
                                                                _jettag_c_get_159_1747.setTagInfo(_td_c_get_159_1747);
                                                                _jettag_c_get_159_1747.doStart(context, out);
                                                                _jettag_c_get_159_1747.doEnd();
                                                                _jettag_c_if_159_1499.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_1499.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_1785 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1785); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_1785.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_if_159_1785.setTagInfo(_td_c_if_159_1785);
                                                            _jettag_c_if_159_1785.doStart(context, out);
                                                            while (_jettag_c_if_159_1785.okToProcessBody()) {
                                                                out.write("Integer related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1936 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1936); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1936.setRuntimeParent(_jettag_c_if_159_1785);
                                                                _jettag_c_get_159_1936.setTagInfo(_td_c_get_159_1936);
                                                                _jettag_c_get_159_1936.doStart(context, out);
                                                                _jettag_c_get_159_1936.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_1965 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_1965); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_1965.setRuntimeParent(_jettag_c_if_159_1785);
                                                                _jettag_c_get_159_1965.setTagInfo(_td_c_get_159_1965);
                                                                _jettag_c_get_159_1965.doStart(context, out);
                                                                _jettag_c_get_159_1965.doEnd();
                                                                _jettag_c_if_159_1785.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_1785.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_2003 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_2003); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_2003.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_if_159_2003.setTagInfo(_td_c_if_159_2003);
                                                            _jettag_c_if_159_2003.doStart(context, out);
                                                            while (_jettag_c_if_159_2003.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_159_2134 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_159_2134); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_159_2134.setRuntimeParent(_jettag_c_if_159_2003);
                                                                _jettag_java_import_159_2134.setTagInfo(_td_java_import_159_2134);
                                                                _jettag_java_import_159_2134.doStart(context, out);
                                                                JET2Writer _jettag_java_import_159_2134_saved_out = out;
                                                                while (_jettag_java_import_159_2134.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.util.Date");  //$NON-NLS-1$        
                                                                    _jettag_java_import_159_2134.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_159_2134_saved_out;
                                                                _jettag_java_import_159_2134.doEnd();
                                                                out.write(" related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_2184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_2184); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_2184.setRuntimeParent(_jettag_c_if_159_2003);
                                                                _jettag_c_get_159_2184.setTagInfo(_td_c_get_159_2184);
                                                                _jettag_c_get_159_2184.doStart(context, out);
                                                                _jettag_c_get_159_2184.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_2213 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_2213); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_2213.setRuntimeParent(_jettag_c_if_159_2003);
                                                                _jettag_c_get_159_2213.setTagInfo(_td_c_get_159_2213);
                                                                _jettag_c_get_159_2213.doStart(context, out);
                                                                _jettag_c_get_159_2213.doEnd();
                                                                _jettag_c_if_159_2003.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_2003.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_2251 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_2251); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_2251.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_if_159_2251.setTagInfo(_td_c_if_159_2251);
                                                            _jettag_c_if_159_2251.doStart(context, out);
                                                            while (_jettag_c_if_159_2251.okToProcessBody()) {
                                                                RuntimeTagElement _jettag_java_import_159_2382 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_159_2382); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_java_import_159_2382.setRuntimeParent(_jettag_c_if_159_2251);
                                                                _jettag_java_import_159_2382.setTagInfo(_td_java_import_159_2382);
                                                                _jettag_java_import_159_2382.doStart(context, out);
                                                                JET2Writer _jettag_java_import_159_2382_saved_out = out;
                                                                while (_jettag_java_import_159_2382.okToProcessBody()) {
                                                                    out = out.newNestedContentWriter();
                                                                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                                    _jettag_java_import_159_2382.handleBodyContent(out);
                                                                }
                                                                out = _jettag_java_import_159_2382_saved_out;
                                                                _jettag_java_import_159_2382.doEnd();
                                                                out.write(" related_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_2438 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_2438); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_2438.setRuntimeParent(_jettag_c_if_159_2251);
                                                                _jettag_c_get_159_2438.setTagInfo(_td_c_get_159_2438);
                                                                _jettag_c_get_159_2438.doStart(context, out);
                                                                _jettag_c_get_159_2438.doEnd();
                                                                out.write("s_");  //$NON-NLS-1$        
                                                                RuntimeTagElement _jettag_c_get_159_2467 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_159_2467); //$NON-NLS-1$ //$NON-NLS-2$
                                                                _jettag_c_get_159_2467.setRuntimeParent(_jettag_c_if_159_2251);
                                                                _jettag_c_get_159_2467.setTagInfo(_td_c_get_159_2467);
                                                                _jettag_c_get_159_2467.doStart(context, out);
                                                                _jettag_c_get_159_2467.doEnd();
                                                                _jettag_c_if_159_2251.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_2251.doEnd();
                                                            RuntimeTagElement _jettag_c_setVariable_159_2505 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_159_2505); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_159_2505.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_setVariable_159_2505.setTagInfo(_td_c_setVariable_159_2505);
                                                            _jettag_c_setVariable_159_2505.doStart(context, out);
                                                            _jettag_c_setVariable_159_2505.doEnd();
                                                            RuntimeTagElement _jettag_c_if_159_2558 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_2558); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_159_2558.setRuntimeParent(_jettag_c_iterate_159_1443);
                                                            _jettag_c_if_159_2558.setTagInfo(_td_c_if_159_2558);
                                                            _jettag_c_if_159_2558.doStart(context, out);
                                                            while (_jettag_c_if_159_2558.okToProcessBody()) {
                                                                out.write(",");  //$NON-NLS-1$        
                                                                _jettag_c_if_159_2558.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_159_2558.doEnd();
                                                            _jettag_c_iterate_159_1443.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_159_1443.doEnd();
                                                        out.write("){");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        RuntimeTagElement _jettag_c_setVariable_160_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_160_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_160_5.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_setVariable_160_5.setTagInfo(_td_c_setVariable_160_5);
                                                        _jettag_c_setVariable_160_5.doStart(context, out);
                                                        _jettag_c_setVariable_160_5.doEnd();
                                                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_161_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_161_5.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_161_5.setTagInfo(_td_c_get_161_5);
                                                        _jettag_c_get_161_5.doStart(context, out);
                                                        _jettag_c_get_161_5.doEnd();
                                                        out.write(" ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_161_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_56); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_161_56.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_161_56.setTagInfo(_td_c_get_161_56);
                                                        _jettag_c_get_161_56.doStart(context, out);
                                                        _jettag_c_get_161_56.doEnd();
                                                        out.write(" = ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_161_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_93); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_161_93.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_161_93.setTagInfo(_td_c_get_161_93);
                                                        _jettag_c_get_161_93.doStart(context, out);
                                                        _jettag_c_get_161_93.doEnd();
                                                        out.write("DAO.find");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_161_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_135); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_161_135.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_161_135.setTagInfo(_td_c_get_161_135);
                                                        _jettag_c_get_161_135.doStart(context, out);
                                                        _jettag_c_get_161_135.doEnd();
                                                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_iterate_161_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_161_198); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_161_198.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_iterate_161_198.setTagInfo(_td_c_iterate_161_198);
                                                        _jettag_c_iterate_161_198.doStart(context, out);
                                                        while (_jettag_c_iterate_161_198.okToProcessBody()) {
                                                            RuntimeTagElement _jettag_c_get_161_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_265); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_161_265.setRuntimeParent(_jettag_c_iterate_161_198);
                                                            _jettag_c_get_161_265.setTagInfo(_td_c_get_161_265);
                                                            _jettag_c_get_161_265.doStart(context, out);
                                                            _jettag_c_get_161_265.doEnd();
                                                            out.write("_");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_161_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_161_300); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_161_300.setRuntimeParent(_jettag_c_iterate_161_198);
                                                            _jettag_c_get_161_300.setTagInfo(_td_c_get_161_300);
                                                            _jettag_c_get_161_300.doStart(context, out);
                                                            _jettag_c_get_161_300.doEnd();
                                                            RuntimeTagElement _jettag_c_setVariable_161_335 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_161_335); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_161_335.setRuntimeParent(_jettag_c_iterate_161_198);
                                                            _jettag_c_setVariable_161_335.setTagInfo(_td_c_setVariable_161_335);
                                                            _jettag_c_setVariable_161_335.doStart(context, out);
                                                            _jettag_c_setVariable_161_335.doEnd();
                                                            RuntimeTagElement _jettag_c_if_161_384 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_161_384); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_161_384.setRuntimeParent(_jettag_c_iterate_161_198);
                                                            _jettag_c_if_161_384.setTagInfo(_td_c_if_161_384);
                                                            _jettag_c_if_161_384.doStart(context, out);
                                                            while (_jettag_c_if_161_384.okToProcessBody()) {
                                                                out.write(",");  //$NON-NLS-1$        
                                                                _jettag_c_if_161_384.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_161_384.doEnd();
                                                            _jettag_c_iterate_161_198.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_161_198.doEnd();
                                                        out.write(", -1, -1);");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        RuntimeTagElement _jettag_c_setVariable_162_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_162_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_162_5.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_setVariable_162_5.setTagInfo(_td_c_setVariable_162_5);
                                                        _jettag_c_setVariable_162_5.doStart(context, out);
                                                        _jettag_c_setVariable_162_5.doEnd();
                                                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_163_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_163_5.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_163_5.setTagInfo(_td_c_get_163_5);
                                                        _jettag_c_get_163_5.doStart(context, out);
                                                        _jettag_c_get_163_5.doEnd();
                                                        out.write(" related_");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_163_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_71); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_163_71.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_163_71.setTagInfo(_td_c_get_163_71);
                                                        _jettag_c_get_163_71.doStart(context, out);
                                                        _jettag_c_get_163_71.doEnd();
                                                        out.write("s = ");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_163_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_116); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_163_116.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_163_116.setTagInfo(_td_c_get_163_116);
                                                        _jettag_c_get_163_116.doStart(context, out);
                                                        _jettag_c_get_163_116.doEnd();
                                                        out.write("DAO.find");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_get_163_165 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_165); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_get_163_165.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_get_163_165.setTagInfo(_td_c_get_163_165);
                                                        _jettag_c_get_163_165.doStart(context, out);
                                                        _jettag_c_get_163_165.doEnd();
                                                        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_c_iterate_163_235 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_163_235); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_iterate_163_235.setRuntimeParent(_jettag_c_if_152_4);
                                                        _jettag_c_iterate_163_235.setTagInfo(_td_c_iterate_163_235);
                                                        _jettag_c_iterate_163_235.doStart(context, out);
                                                        while (_jettag_c_iterate_163_235.okToProcessBody()) {
                                                            out.write("related_");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_163_299 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_299); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_163_299.setRuntimeParent(_jettag_c_iterate_163_235);
                                                            _jettag_c_get_163_299.setTagInfo(_td_c_get_163_299);
                                                            _jettag_c_get_163_299.doStart(context, out);
                                                            _jettag_c_get_163_299.doEnd();
                                                            out.write("s_");  //$NON-NLS-1$        
                                                            RuntimeTagElement _jettag_c_get_163_342 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_163_342); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_get_163_342.setRuntimeParent(_jettag_c_iterate_163_235);
                                                            _jettag_c_get_163_342.setTagInfo(_td_c_get_163_342);
                                                            _jettag_c_get_163_342.doStart(context, out);
                                                            _jettag_c_get_163_342.doEnd();
                                                            RuntimeTagElement _jettag_c_setVariable_163_373 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_163_373); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_setVariable_163_373.setRuntimeParent(_jettag_c_iterate_163_235);
                                                            _jettag_c_setVariable_163_373.setTagInfo(_td_c_setVariable_163_373);
                                                            _jettag_c_setVariable_163_373.doStart(context, out);
                                                            _jettag_c_setVariable_163_373.doEnd();
                                                            RuntimeTagElement _jettag_c_if_163_426 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_163_426); //$NON-NLS-1$ //$NON-NLS-2$
                                                            _jettag_c_if_163_426.setRuntimeParent(_jettag_c_iterate_163_235);
                                                            _jettag_c_if_163_426.setTagInfo(_td_c_if_163_426);
                                                            _jettag_c_if_163_426.doStart(context, out);
                                                            while (_jettag_c_if_163_426.okToProcessBody()) {
                                                                out.write(",");  //$NON-NLS-1$        
                                                                _jettag_c_if_163_426.handleBodyContent(out);
                                                            }
                                                            _jettag_c_if_163_426.doEnd();
                                                            _jettag_c_iterate_163_235.handleBodyContent(out);
                                                        }
                                                        _jettag_c_iterate_163_235.doEnd();
                                                        out.write(", -1, -1);");  //$NON-NLS-1$        
                                                        out.write(NL);         
                                                        _jettag_c_if_152_4.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_152_4.doEnd();
                                                    _jettag_c_iterate_151_4.handleBodyContent(out);
                                                }
                                                _jettag_c_iterate_151_4.doEnd();
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_166_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_166_5.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_166_5.setTagInfo(_td_c_get_166_5);
                                                _jettag_c_get_166_5.doStart(context, out);
                                                _jettag_c_get_166_5.doEnd();
                                                out.write(".get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_166_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_43); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_166_43.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_166_43.setTagInfo(_td_c_get_166_43);
                                                _jettag_c_get_166_43.doStart(context, out);
                                                _jettag_c_get_166_43.doEnd();
                                                out.write("s().remove(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_166_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_166_119); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_166_119.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_166_119.setTagInfo(_td_c_get_166_119);
                                                _jettag_c_get_166_119.doStart(context, out);
                                                _jettag_c_get_166_119.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\trelated_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_167_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_13); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_167_13.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_167_13.setTagInfo(_td_c_get_167_13);
                                                _jettag_c_get_167_13.doStart(context, out);
                                                _jettag_c_get_167_13.doEnd();
                                                out.write("s.get");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_167_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_59); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_167_59.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_167_59.setTagInfo(_td_c_get_167_59);
                                                _jettag_c_get_167_59.doStart(context, out);
                                                _jettag_c_get_167_59.doEnd();
                                                out.write("s().remove(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_167_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_120); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_167_120.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_167_120.setTagInfo(_td_c_get_167_120);
                                                _jettag_c_get_167_120.doStart(context, out);
                                                _jettag_c_get_167_120.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_168_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_168_5.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_168_5.setTagInfo(_td_c_get_168_5);
                                                _jettag_c_get_168_5.doStart(context, out);
                                                _jettag_c_get_168_5.doEnd();
                                                out.write(" = ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_168_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_42); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_168_42.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_168_42.setTagInfo(_td_c_get_168_42);
                                                _jettag_c_get_168_42.doStart(context, out);
                                                _jettag_c_get_168_42.doEnd();
                                                out.write("DAO.store(");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_168_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_168_86); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_168_86.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_168_86.setTagInfo(_td_c_get_168_86);
                                                _jettag_c_get_168_86.doStart(context, out);
                                                _jettag_c_get_168_86.doEnd();
                                                out.write(");");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_169_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_169_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_169_5.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_169_5.setTagInfo(_td_c_get_169_5);
                                                _jettag_c_get_169_5.doStart(context, out);
                                                _jettag_c_get_169_5.doEnd();
                                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write(NL);         
                                                out.write("\t\t\t\trelated_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_171_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_13); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_171_13.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_171_13.setTagInfo(_td_c_get_171_13);
                                                _jettag_c_get_171_13.doStart(context, out);
                                                _jettag_c_get_171_13.doEnd();
                                                out.write("s = ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_171_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_58); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_171_58.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_171_58.setTagInfo(_td_c_get_171_58);
                                                _jettag_c_get_171_58.doStart(context, out);
                                                _jettag_c_get_171_58.doEnd();
                                                out.write("DAO.store(related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_171_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_171_117); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_171_117.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_171_117.setTagInfo(_td_c_get_171_117);
                                                _jettag_c_get_171_117.doStart(context, out);
                                                _jettag_c_get_171_117.doEnd();
                                                out.write("s);");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_172_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_172_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_172_5.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_172_5.setTagInfo(_td_c_get_172_5);
                                                _jettag_c_get_172_5.doStart(context, out);
                                                _jettag_c_get_172_5.doEnd();
                                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_173_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_173_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_173_5.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_173_5.setTagInfo(_td_c_get_173_5);
                                                _jettag_c_get_173_5.doStart(context, out);
                                                _jettag_c_get_173_5.doEnd();
                                                out.write("DAO.flush();");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t\treturn ");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_174_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_174_12); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_174_12.setRuntimeParent(_jettag_c_otherwise_145_4);
                                                _jettag_c_get_174_12.setTagInfo(_td_c_get_174_12);
                                                _jettag_c_get_174_12.doStart(context, out);
                                                _jettag_c_get_174_12.doEnd();
                                                out.write(";");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                out.write("\t\t\t}");  //$NON-NLS-1$        
                                                out.write(NL);         
                                                _jettag_c_otherwise_145_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_145_4_saved_out;
                                            _jettag_c_otherwise_145_4.doEnd();
                                            _jettag_c_choose_142_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_142_4_saved_out;
                                        _jettag_c_choose_142_4.doEnd();
                                        _jettag_c_iterate_141_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_141_4.doEnd();
                                    _jettag_c_when_140_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_140_4_saved_out;
                                _jettag_c_when_140_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_180_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_180_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_180_4.setRuntimeParent(_jettag_c_choose_139_4);
                                _jettag_c_otherwise_180_4.setTagInfo(_td_c_otherwise_180_4);
                                _jettag_c_otherwise_180_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_180_4_saved_out = out;
                                while (_jettag_c_otherwise_180_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_setVariable_181_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_181_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_181_4.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_setVariable_181_4.setTagInfo(_td_c_setVariable_181_4);
                                    _jettag_c_setVariable_181_4.doStart(context, out);
                                    _jettag_c_setVariable_181_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_182_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_182_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_182_4.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_iterate_182_4.setTagInfo(_td_c_iterate_182_4);
                                    _jettag_c_iterate_182_4.doStart(context, out);
                                    while (_jettag_c_iterate_182_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_183_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_183_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_183_4.setRuntimeParent(_jettag_c_iterate_182_4);
                                        _jettag_c_setVariable_183_4.setTagInfo(_td_c_setVariable_183_4);
                                        _jettag_c_setVariable_183_4.doStart(context, out);
                                        _jettag_c_setVariable_183_4.doEnd();
                                        _jettag_c_iterate_182_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_182_4.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_185_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_185_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_185_4.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_setVariable_185_4.setTagInfo(_td_c_setVariable_185_4);
                                    _jettag_c_setVariable_185_4.doStart(context, out);
                                    _jettag_c_setVariable_185_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_186_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_186_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_186_4.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_iterate_186_4.setTagInfo(_td_c_iterate_186_4);
                                    _jettag_c_iterate_186_4.doStart(context, out);
                                    while (_jettag_c_iterate_186_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_187_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_187_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_187_4.setRuntimeParent(_jettag_c_iterate_186_4);
                                        _jettag_c_if_187_4.setTagInfo(_td_c_if_187_4);
                                        _jettag_c_if_187_4.doStart(context, out);
                                        while (_jettag_c_if_187_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_188_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_188_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_188_4.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_setVariable_188_4.setTagInfo(_td_c_setVariable_188_4);
                                            _jettag_c_setVariable_188_4.doStart(context, out);
                                            _jettag_c_setVariable_188_4.doEnd();
                                            RuntimeTagElement _jettag_c_iterate_189_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_189_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_189_4.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_iterate_189_4.setTagInfo(_td_c_iterate_189_4);
                                            _jettag_c_iterate_189_4.doStart(context, out);
                                            while (_jettag_c_iterate_189_4.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_setVariable_190_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_190_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_190_4.setRuntimeParent(_jettag_c_iterate_189_4);
                                                _jettag_c_setVariable_190_4.setTagInfo(_td_c_setVariable_190_4);
                                                _jettag_c_setVariable_190_4.doStart(context, out);
                                                _jettag_c_setVariable_190_4.doEnd();
                                                _jettag_c_iterate_189_4.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_189_4.doEnd();
                                            RuntimeTagElement _jettag_c_setVariable_192_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_192_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_192_4.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_setVariable_192_4.setTagInfo(_td_c_setVariable_192_4);
                                            _jettag_c_setVariable_192_4.doStart(context, out);
                                            _jettag_c_setVariable_192_4.doEnd();
                                            out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            out.write("\t\t\tpublic ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_194_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_11); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_194_11.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_194_11.setTagInfo(_td_c_get_194_11);
                                            _jettag_c_get_194_11.doStart(context, out);
                                            _jettag_c_get_194_11.doEnd();
                                            out.write(" delete");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_194_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_68); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_194_68.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_194_68.setTagInfo(_td_c_get_194_68);
                                            _jettag_c_get_194_68.doStart(context, out);
                                            _jettag_c_get_194_68.doEnd();
                                            RuntimeTagElement _jettag_c_get_194_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_118); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_194_118.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_194_118.setTagInfo(_td_c_get_194_118);
                                            _jettag_c_get_194_118.doStart(context, out);
                                            _jettag_c_get_194_118.doEnd();
                                            out.write("s(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_194_171 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_194_171); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_194_171.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_iterate_194_171.setTagInfo(_td_c_iterate_194_171);
                                            _jettag_c_iterate_194_171.doStart(context, out);
                                            while (_jettag_c_iterate_194_171.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_if_194_238 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_238); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_238.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_if_194_238.setTagInfo(_td_c_if_194_238);
                                                _jettag_c_if_194_238.doStart(context, out);
                                                while (_jettag_c_if_194_238.okToProcessBody()) {
                                                    out.write("String ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_481 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_481); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_481.setRuntimeParent(_jettag_c_if_194_238);
                                                    _jettag_c_get_194_481.setTagInfo(_td_c_get_194_481);
                                                    _jettag_c_get_194_481.doStart(context, out);
                                                    _jettag_c_get_194_481.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_516 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_516); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_516.setRuntimeParent(_jettag_c_if_194_238);
                                                    _jettag_c_get_194_516.setTagInfo(_td_c_get_194_516);
                                                    _jettag_c_get_194_516.doStart(context, out);
                                                    _jettag_c_get_194_516.doEnd();
                                                    _jettag_c_if_194_238.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_238.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_558 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_558); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_558.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_if_194_558.setTagInfo(_td_c_if_194_558);
                                                _jettag_c_if_194_558.doStart(context, out);
                                                while (_jettag_c_if_194_558.okToProcessBody()) {
                                                    out.write("Integer ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_721 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_721); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_721.setRuntimeParent(_jettag_c_if_194_558);
                                                    _jettag_c_get_194_721.setTagInfo(_td_c_get_194_721);
                                                    _jettag_c_get_194_721.doStart(context, out);
                                                    _jettag_c_get_194_721.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_756 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_756); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_756.setRuntimeParent(_jettag_c_if_194_558);
                                                    _jettag_c_get_194_756.setTagInfo(_td_c_get_194_756);
                                                    _jettag_c_get_194_756.doStart(context, out);
                                                    _jettag_c_get_194_756.doEnd();
                                                    _jettag_c_if_194_558.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_558.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_798 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_798); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_798.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_if_194_798.setTagInfo(_td_c_if_194_798);
                                                _jettag_c_if_194_798.doStart(context, out);
                                                while (_jettag_c_if_194_798.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_194_949 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_194_949); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_194_949.setRuntimeParent(_jettag_c_if_194_798);
                                                    _jettag_java_import_194_949.setTagInfo(_td_java_import_194_949);
                                                    _jettag_java_import_194_949.doStart(context, out);
                                                    JET2Writer _jettag_java_import_194_949_saved_out = out;
                                                    while (_jettag_java_import_194_949.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                                        _jettag_java_import_194_949.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_194_949_saved_out;
                                                    _jettag_java_import_194_949.doEnd();
                                                    out.write(" ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_991 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_991); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_991.setRuntimeParent(_jettag_c_if_194_798);
                                                    _jettag_c_get_194_991.setTagInfo(_td_c_get_194_991);
                                                    _jettag_c_get_194_991.doStart(context, out);
                                                    _jettag_c_get_194_991.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1026 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1026); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1026.setRuntimeParent(_jettag_c_if_194_798);
                                                    _jettag_c_get_194_1026.setTagInfo(_td_c_get_194_1026);
                                                    _jettag_c_get_194_1026.doStart(context, out);
                                                    _jettag_c_get_194_1026.doEnd();
                                                    _jettag_c_if_194_798.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_798.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_1068 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_1068); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_1068.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_if_194_1068.setTagInfo(_td_c_if_194_1068);
                                                _jettag_c_if_194_1068.doStart(context, out);
                                                while (_jettag_c_if_194_1068.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_194_1219 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_194_1219); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_194_1219.setRuntimeParent(_jettag_c_if_194_1068);
                                                    _jettag_java_import_194_1219.setTagInfo(_td_java_import_194_1219);
                                                    _jettag_java_import_194_1219.doStart(context, out);
                                                    JET2Writer _jettag_java_import_194_1219_saved_out = out;
                                                    while (_jettag_java_import_194_1219.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                        _jettag_java_import_194_1219.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_194_1219_saved_out;
                                                    _jettag_java_import_194_1219.doEnd();
                                                    out.write(" ");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1267 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1267); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1267.setRuntimeParent(_jettag_c_if_194_1068);
                                                    _jettag_c_get_194_1267.setTagInfo(_td_c_get_194_1267);
                                                    _jettag_c_get_194_1267.doStart(context, out);
                                                    _jettag_c_get_194_1267.doEnd();
                                                    out.write("_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1302 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1302); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1302.setRuntimeParent(_jettag_c_if_194_1068);
                                                    _jettag_c_get_194_1302.setTagInfo(_td_c_get_194_1302);
                                                    _jettag_c_get_194_1302.doStart(context, out);
                                                    _jettag_c_get_194_1302.doEnd();
                                                    _jettag_c_if_194_1068.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_1068.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_194_1344 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_194_1344); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_194_1344.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_setVariable_194_1344.setTagInfo(_td_c_setVariable_194_1344);
                                                _jettag_c_setVariable_194_1344.doStart(context, out);
                                                _jettag_c_setVariable_194_1344.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_1393 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_1393); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_1393.setRuntimeParent(_jettag_c_iterate_194_171);
                                                _jettag_c_if_194_1393.setTagInfo(_td_c_if_194_1393);
                                                _jettag_c_if_194_1393.doStart(context, out);
                                                while (_jettag_c_if_194_1393.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_194_1393.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_1393.doEnd();
                                                _jettag_c_iterate_194_171.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_194_171.doEnd();
                                            out.write(", ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_194_1437 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_194_1437); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_194_1437.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_iterate_194_1437.setTagInfo(_td_c_iterate_194_1437);
                                            _jettag_c_iterate_194_1437.doStart(context, out);
                                            while (_jettag_c_iterate_194_1437.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_if_194_1493 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_1493); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_1493.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_if_194_1493.setTagInfo(_td_c_if_194_1493);
                                                _jettag_c_if_194_1493.doStart(context, out);
                                                while (_jettag_c_if_194_1493.okToProcessBody()) {
                                                    out.write("String related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1712 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1712); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1712.setRuntimeParent(_jettag_c_if_194_1493);
                                                    _jettag_c_get_194_1712.setTagInfo(_td_c_get_194_1712);
                                                    _jettag_c_get_194_1712.doStart(context, out);
                                                    _jettag_c_get_194_1712.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1749 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1749); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1749.setRuntimeParent(_jettag_c_if_194_1493);
                                                    _jettag_c_get_194_1749.setTagInfo(_td_c_get_194_1749);
                                                    _jettag_c_get_194_1749.doStart(context, out);
                                                    _jettag_c_get_194_1749.doEnd();
                                                    _jettag_c_if_194_1493.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_1493.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_1787 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_1787); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_1787.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_if_194_1787.setTagInfo(_td_c_if_194_1787);
                                                _jettag_c_if_194_1787.doStart(context, out);
                                                while (_jettag_c_if_194_1787.okToProcessBody()) {
                                                    out.write("Integer related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1938 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1938); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1938.setRuntimeParent(_jettag_c_if_194_1787);
                                                    _jettag_c_get_194_1938.setTagInfo(_td_c_get_194_1938);
                                                    _jettag_c_get_194_1938.doStart(context, out);
                                                    _jettag_c_get_194_1938.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_1975 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_1975); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_1975.setRuntimeParent(_jettag_c_if_194_1787);
                                                    _jettag_c_get_194_1975.setTagInfo(_td_c_get_194_1975);
                                                    _jettag_c_get_194_1975.doStart(context, out);
                                                    _jettag_c_get_194_1975.doEnd();
                                                    _jettag_c_if_194_1787.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_1787.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_2013 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_2013); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_2013.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_if_194_2013.setTagInfo(_td_c_if_194_2013);
                                                _jettag_c_if_194_2013.doStart(context, out);
                                                while (_jettag_c_if_194_2013.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_194_2144 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_194_2144); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_194_2144.setRuntimeParent(_jettag_c_if_194_2013);
                                                    _jettag_java_import_194_2144.setTagInfo(_td_java_import_194_2144);
                                                    _jettag_java_import_194_2144.doStart(context, out);
                                                    JET2Writer _jettag_java_import_194_2144_saved_out = out;
                                                    while (_jettag_java_import_194_2144.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.util.Date");  //$NON-NLS-1$        
                                                        _jettag_java_import_194_2144.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_194_2144_saved_out;
                                                    _jettag_java_import_194_2144.doEnd();
                                                    out.write(" related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_2194 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_2194); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_2194.setRuntimeParent(_jettag_c_if_194_2013);
                                                    _jettag_c_get_194_2194.setTagInfo(_td_c_get_194_2194);
                                                    _jettag_c_get_194_2194.doStart(context, out);
                                                    _jettag_c_get_194_2194.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_2231 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_2231); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_2231.setRuntimeParent(_jettag_c_if_194_2013);
                                                    _jettag_c_get_194_2231.setTagInfo(_td_c_get_194_2231);
                                                    _jettag_c_get_194_2231.doStart(context, out);
                                                    _jettag_c_get_194_2231.doEnd();
                                                    _jettag_c_if_194_2013.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_2013.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_2269 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_2269); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_2269.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_if_194_2269.setTagInfo(_td_c_if_194_2269);
                                                _jettag_c_if_194_2269.doStart(context, out);
                                                while (_jettag_c_if_194_2269.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_java_import_194_2400 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_194_2400); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_java_import_194_2400.setRuntimeParent(_jettag_c_if_194_2269);
                                                    _jettag_java_import_194_2400.setTagInfo(_td_java_import_194_2400);
                                                    _jettag_java_import_194_2400.doStart(context, out);
                                                    JET2Writer _jettag_java_import_194_2400_saved_out = out;
                                                    while (_jettag_java_import_194_2400.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                                                        _jettag_java_import_194_2400.handleBodyContent(out);
                                                    }
                                                    out = _jettag_java_import_194_2400_saved_out;
                                                    _jettag_java_import_194_2400.doEnd();
                                                    out.write(" related_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_2456 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_2456); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_2456.setRuntimeParent(_jettag_c_if_194_2269);
                                                    _jettag_c_get_194_2456.setTagInfo(_td_c_get_194_2456);
                                                    _jettag_c_get_194_2456.doStart(context, out);
                                                    _jettag_c_get_194_2456.doEnd();
                                                    out.write("s_");  //$NON-NLS-1$        
                                                    RuntimeTagElement _jettag_c_get_194_2493 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_194_2493); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_get_194_2493.setRuntimeParent(_jettag_c_if_194_2269);
                                                    _jettag_c_get_194_2493.setTagInfo(_td_c_get_194_2493);
                                                    _jettag_c_get_194_2493.doStart(context, out);
                                                    _jettag_c_get_194_2493.doEnd();
                                                    _jettag_c_if_194_2269.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_2269.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_194_2531 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_194_2531); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_194_2531.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_setVariable_194_2531.setTagInfo(_td_c_setVariable_194_2531);
                                                _jettag_c_setVariable_194_2531.doStart(context, out);
                                                _jettag_c_setVariable_194_2531.doEnd();
                                                RuntimeTagElement _jettag_c_if_194_2584 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_194_2584); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_194_2584.setRuntimeParent(_jettag_c_iterate_194_1437);
                                                _jettag_c_if_194_2584.setTagInfo(_td_c_if_194_2584);
                                                _jettag_c_if_194_2584.doStart(context, out);
                                                while (_jettag_c_if_194_2584.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_194_2584.handleBodyContent(out);
                                                }
                                                _jettag_c_if_194_2584.doEnd();
                                                _jettag_c_iterate_194_1437.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_194_1437.doEnd();
                                            out.write("){");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            RuntimeTagElement _jettag_c_setVariable_195_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_195_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_195_5.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_setVariable_195_5.setTagInfo(_td_c_setVariable_195_5);
                                            _jettag_c_setVariable_195_5.doStart(context, out);
                                            _jettag_c_setVariable_195_5.doEnd();
                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_196_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_196_5.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_196_5.setTagInfo(_td_c_get_196_5);
                                            _jettag_c_get_196_5.doStart(context, out);
                                            _jettag_c_get_196_5.doEnd();
                                            out.write(" related_");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_196_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_65); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_196_65.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_196_65.setTagInfo(_td_c_get_196_65);
                                            _jettag_c_get_196_65.doStart(context, out);
                                            _jettag_c_get_196_65.doEnd();
                                            out.write("s = ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_196_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_104); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_196_104.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_196_104.setTagInfo(_td_c_get_196_104);
                                            _jettag_c_get_196_104.doStart(context, out);
                                            _jettag_c_get_196_104.doEnd();
                                            out.write("DAO.find");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_196_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_147); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_196_147.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_196_147.setTagInfo(_td_c_get_196_147);
                                            _jettag_c_get_196_147.doStart(context, out);
                                            _jettag_c_get_196_147.doEnd();
                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_196_211 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_196_211); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_196_211.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_iterate_196_211.setTagInfo(_td_c_iterate_196_211);
                                            _jettag_c_iterate_196_211.doStart(context, out);
                                            while (_jettag_c_iterate_196_211.okToProcessBody()) {
                                                out.write("related_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_196_275 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_275); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_196_275.setRuntimeParent(_jettag_c_iterate_196_211);
                                                _jettag_c_get_196_275.setTagInfo(_td_c_get_196_275);
                                                _jettag_c_get_196_275.doStart(context, out);
                                                _jettag_c_get_196_275.doEnd();
                                                out.write("s_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_196_312 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_312); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_196_312.setRuntimeParent(_jettag_c_iterate_196_211);
                                                _jettag_c_get_196_312.setTagInfo(_td_c_get_196_312);
                                                _jettag_c_get_196_312.doStart(context, out);
                                                _jettag_c_get_196_312.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_196_343 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_196_343); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_196_343.setRuntimeParent(_jettag_c_iterate_196_211);
                                                _jettag_c_setVariable_196_343.setTagInfo(_td_c_setVariable_196_343);
                                                _jettag_c_setVariable_196_343.doStart(context, out);
                                                _jettag_c_setVariable_196_343.doEnd();
                                                RuntimeTagElement _jettag_c_if_196_396 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_196_396); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_196_396.setRuntimeParent(_jettag_c_iterate_196_211);
                                                _jettag_c_if_196_396.setTagInfo(_td_c_if_196_396);
                                                _jettag_c_if_196_396.doStart(context, out);
                                                while (_jettag_c_if_196_396.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_196_396.handleBodyContent(out);
                                                }
                                                _jettag_c_if_196_396.doEnd();
                                                _jettag_c_iterate_196_211.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_196_211.doEnd();
                                            out.write(", -1, -1);");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            RuntimeTagElement _jettag_c_setVariable_197_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_197_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_197_5.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_setVariable_197_5.setTagInfo(_td_c_setVariable_197_5);
                                            _jettag_c_setVariable_197_5.doStart(context, out);
                                            _jettag_c_setVariable_197_5.doEnd();
                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_198_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_198_5.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_198_5.setTagInfo(_td_c_get_198_5);
                                            _jettag_c_get_198_5.doStart(context, out);
                                            _jettag_c_get_198_5.doEnd();
                                            out.write(" ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_198_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_56); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_198_56.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_198_56.setTagInfo(_td_c_get_198_56);
                                            _jettag_c_get_198_56.doStart(context, out);
                                            _jettag_c_get_198_56.doEnd();
                                            out.write(" = ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_198_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_93); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_198_93.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_198_93.setTagInfo(_td_c_get_198_93);
                                            _jettag_c_get_198_93.doStart(context, out);
                                            _jettag_c_get_198_93.doEnd();
                                            out.write("DAO.find");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_198_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_135); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_198_135.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_get_198_135.setTagInfo(_td_c_get_198_135);
                                            _jettag_c_get_198_135.doStart(context, out);
                                            _jettag_c_get_198_135.doEnd();
                                            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_iterate_198_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_198_198); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_198_198.setRuntimeParent(_jettag_c_if_187_4);
                                            _jettag_c_iterate_198_198.setTagInfo(_td_c_iterate_198_198);
                                            _jettag_c_iterate_198_198.doStart(context, out);
                                            while (_jettag_c_iterate_198_198.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_get_198_265 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_265); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_198_265.setRuntimeParent(_jettag_c_iterate_198_198);
                                                _jettag_c_get_198_265.setTagInfo(_td_c_get_198_265);
                                                _jettag_c_get_198_265.doStart(context, out);
                                                _jettag_c_get_198_265.doEnd();
                                                out.write("_");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_198_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_198_300); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_198_300.setRuntimeParent(_jettag_c_iterate_198_198);
                                                _jettag_c_get_198_300.setTagInfo(_td_c_get_198_300);
                                                _jettag_c_get_198_300.doStart(context, out);
                                                _jettag_c_get_198_300.doEnd();
                                                RuntimeTagElement _jettag_c_setVariable_198_335 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_198_335); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_setVariable_198_335.setRuntimeParent(_jettag_c_iterate_198_198);
                                                _jettag_c_setVariable_198_335.setTagInfo(_td_c_setVariable_198_335);
                                                _jettag_c_setVariable_198_335.doStart(context, out);
                                                _jettag_c_setVariable_198_335.doEnd();
                                                RuntimeTagElement _jettag_c_if_198_384 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_198_384); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_198_384.setRuntimeParent(_jettag_c_iterate_198_198);
                                                _jettag_c_if_198_384.setTagInfo(_td_c_if_198_384);
                                                _jettag_c_if_198_384.doStart(context, out);
                                                while (_jettag_c_if_198_384.okToProcessBody()) {
                                                    out.write(",");  //$NON-NLS-1$        
                                                    _jettag_c_if_198_384.handleBodyContent(out);
                                                }
                                                _jettag_c_if_198_384.doEnd();
                                                _jettag_c_iterate_198_198.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_198_198.doEnd();
                                            out.write(", -1, -1);");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_187_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_187_4.doEnd();
                                        _jettag_c_iterate_186_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_186_4.doEnd();
                                    out.write("\t\t\t\tSet<");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_201_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_201_9); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_201_9.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_201_9.setTagInfo(_td_c_get_201_9);
                                    _jettag_c_get_201_9.doStart(context, out);
                                    _jettag_c_get_201_9.doEnd();
                                    out.write("> ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_201_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_201_62); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_201_62.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_201_62.setTagInfo(_td_c_get_201_62);
                                    _jettag_c_get_201_62.doStart(context, out);
                                    _jettag_c_get_201_62.doEnd();
                                    out.write("Set=");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_201_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_201_101); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_201_101.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_201_101.setTagInfo(_td_c_get_201_101);
                                    _jettag_c_get_201_101.doStart(context, out);
                                    _jettag_c_get_201_101.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_201_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_201_139); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_201_139.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_201_139.setTagInfo(_td_c_get_201_139);
                                    _jettag_c_get_201_139.doStart(context, out);
                                    _jettag_c_get_201_139.doEnd();
                                    out.write("s();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_202_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_202_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_202_5.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_202_5.setTagInfo(_td_c_get_202_5);
                                    _jettag_c_get_202_5.doStart(context, out);
                                    _jettag_c_get_202_5.doEnd();
                                    out.write(" teache=new ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_202_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_202_68); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_202_68.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_202_68.setTagInfo(_td_c_get_202_68);
                                    _jettag_c_get_202_68.doStart(context, out);
                                    _jettag_c_get_202_68.doEnd();
                                    out.write("();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tif(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_203_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_203_8); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_203_8.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_203_8.setTagInfo(_td_c_get_203_8);
                                    _jettag_c_get_203_8.doStart(context, out);
                                    _jettag_c_get_203_8.doEnd();
                                    out.write("Set.size()>0)");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tfor(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_204_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_204_9); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_204_9.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_204_9.setTagInfo(_td_c_get_204_9);
                                    _jettag_c_get_204_9.doStart(context, out);
                                    _jettag_c_get_204_9.doEnd();
                                    out.write(" th:");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_204_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_204_64); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_204_64.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_204_64.setTagInfo(_td_c_get_204_64);
                                    _jettag_c_get_204_64.doStart(context, out);
                                    _jettag_c_get_204_64.doEnd();
                                    out.write("Set){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tif(th==related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_205_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_205_21); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_205_21.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_205_21.setTagInfo(_td_c_get_205_21);
                                    _jettag_c_get_205_21.doStart(context, out);
                                    _jettag_c_get_205_21.doEnd();
                                    out.write("s){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\t\tteache=related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_206_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_206_22); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_206_22.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_206_22.setTagInfo(_td_c_get_206_22);
                                    _jettag_c_get_206_22.doStart(context, out);
                                    _jettag_c_get_206_22.doEnd();
                                    out.write("s;");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\tentityManager.persist(teache);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tif(teache!=null){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tteache.set");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_211_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_211_15); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_211_15.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_211_15.setTagInfo(_td_c_get_211_15);
                                    _jettag_c_get_211_15.doStart(context, out);
                                    _jettag_c_get_211_15.doEnd();
                                    out.write("(null);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_212_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_212_5.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_212_5.setTagInfo(_td_c_get_212_5);
                                    _jettag_c_get_212_5.doStart(context, out);
                                    _jettag_c_get_212_5.doEnd();
                                    out.write(".get");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_212_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_43); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_212_43.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_212_43.setTagInfo(_td_c_get_212_43);
                                    _jettag_c_get_212_43.doStart(context, out);
                                    _jettag_c_get_212_43.doEnd();
                                    out.write("s().remove(teache);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tentityManager.persist(related_");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_214_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_214_35); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_214_35.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_214_35.setTagInfo(_td_c_get_214_35);
                                    _jettag_c_get_214_35.doStart(context, out);
                                    _jettag_c_get_214_35.doEnd();
                                    out.write("s);");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tentityManager.persist(");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_215_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_215_27); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_215_27.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_215_27.setTagInfo(_td_c_get_215_27);
                                    _jettag_c_get_215_27.doStart(context, out);
                                    _jettag_c_get_215_27.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_216_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_216_5); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_216_5.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_216_5.setTagInfo(_td_c_get_216_5);
                                    _jettag_c_get_216_5.doStart(context, out);
                                    _jettag_c_get_216_5.doEnd();
                                    out.write("DAO.flush();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write(NL);         
                                    out.write("\t\t\t\treturn ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_218_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_12); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_218_12.setRuntimeParent(_jettag_c_otherwise_180_4);
                                    _jettag_c_get_218_12.setTagInfo(_td_c_get_218_12);
                                    _jettag_c_get_218_12.doStart(context, out);
                                    _jettag_c_get_218_12.doEnd();
                                    out.write(";");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_180_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_180_4_saved_out;
                                _jettag_c_otherwise_180_4.doEnd();
                                _jettag_c_choose_139_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_139_4_saved_out;
                            _jettag_c_choose_139_4.doEnd();
                            _jettag_c_if_130_3.handleBodyContent(out);
                        }
                        _jettag_c_if_130_3.doEnd();
                        _jettag_c_iterate_129_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_129_2.doEnd();
                    _jettag_c_iterate_128_2.handleBodyContent(out);
                }
                _jettag_c_iterate_128_2.doEnd();
                _jettag_c_otherwise_17_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_17_2_saved_out;
            _jettag_c_otherwise_17_2.doEnd();
            _jettag_c_choose_9_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_9_2_saved_out;
        _jettag_c_choose_9_2.doEnd();
    }
}
