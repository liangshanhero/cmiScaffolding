package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_variable_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_variable_1() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_5_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_3 = new TagInfo("c:if", //$NON-NLS-1$
            7, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_16_4 = new TagInfo("c:choose", //$NON-NLS-1$
            16, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_17_4 = new TagInfo("c:when", //$NON-NLS-1$
            17, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_19_4 = new TagInfo("c:choose", //$NON-NLS-1$
            19, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_20_4 = new TagInfo("c:when", //$NON-NLS-1$
            20, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_22_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            22, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_24_15 = new TagInfo("c:get", //$NON-NLS-1$
            24, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_30_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            30, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_31_15 = new TagInfo("c:get", //$NON-NLS-1$
            31, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_15 = new TagInfo("c:get", //$NON-NLS-1$
            32, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_39_3 = new TagInfo("java:import", //$NON-NLS-1$
            39, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_40_10 = new TagInfo("java:import", //$NON-NLS-1$
            40, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_40_23 = new TagInfo("c:get", //$NON-NLS-1$
            40, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_58 = new TagInfo("c:get", //$NON-NLS-1$
            40, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_126 = new TagInfo("c:get", //$NON-NLS-1$
            40, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_43_10 = new TagInfo("java:import", //$NON-NLS-1$
            43, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_43_23 = new TagInfo("c:get", //$NON-NLS-1$
            43, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_62 = new TagInfo("c:get", //$NON-NLS-1$
            43, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_134 = new TagInfo("c:get", //$NON-NLS-1$
            43, 134,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_45_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_46_2 = new TagInfo("c:choose", //$NON-NLS-1$
            46, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_47_2 = new TagInfo("c:when", //$NON-NLS-1$
            47, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_49_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            49, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_10 = new TagInfo("c:get", //$NON-NLS-1$
            51, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_72 = new TagInfo("c:get", //$NON-NLS-1$
            51, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_56_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            56, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_57_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            57, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_3 = new TagInfo("c:if", //$NON-NLS-1$
            58, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_60_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_62_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            62, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_64_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            64, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_65_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            65, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_67_4 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_68_4 = new TagInfo("c:when", //$NON-NLS-1$
            68, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_70_4 = new TagInfo("c:choose", //$NON-NLS-1$
            70, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_71_4 = new TagInfo("c:when", //$NON-NLS-1$
            71, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_12 = new TagInfo("c:get", //$NON-NLS-1$
            73, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_67 = new TagInfo("c:get", //$NON-NLS-1$
            73, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_76_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            76, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_78_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            78, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_79_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            79, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_80_4 = new TagInfo("c:choose", //$NON-NLS-1$
            80, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_81_4 = new TagInfo("c:when", //$NON-NLS-1$
            81, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_83_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            83, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_84_4 = new TagInfo("c:if", //$NON-NLS-1$
            84, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_85_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            85, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_4 = new TagInfo("c:if", //$NON-NLS-1$
            90, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$flag=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_12 = new TagInfo("c:get", //$NON-NLS-1$
            92, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_92_73 = new TagInfo("c:get", //$NON-NLS-1$
            92, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_12 = new TagInfo("c:get", //$NON-NLS-1$
            96, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_96_77 = new TagInfo("c:get", //$NON-NLS-1$
            96, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_101_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            101, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_102_4 = new TagInfo("c:choose", //$NON-NLS-1$
            102, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_103_4 = new TagInfo("c:when", //$NON-NLS-1$
            103, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_105_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            105, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_106_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            106, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_108_4 = new TagInfo("c:choose", //$NON-NLS-1$
            108, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_109_4 = new TagInfo("c:when", //$NON-NLS-1$
            109, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_111_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            111, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_112_4 = new TagInfo("c:if", //$NON-NLS-1$
            112, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_113_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            113, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_118_4 = new TagInfo("c:if", //$NON-NLS-1$
            118, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$flag=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_12 = new TagInfo("c:get", //$NON-NLS-1$
            120, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_120_67 = new TagInfo("c:get", //$NON-NLS-1$
            120, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_12 = new TagInfo("c:get", //$NON-NLS-1$
            124, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_71 = new TagInfo("c:get", //$NON-NLS-1$
            124, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\tstatic int pageNumber=0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tstatic int pageSize=10;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tstatic int editPageSize=10;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_2.setRuntimeParent(null);
        _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
        _jettag_c_iterate_5_2.doStart(context, out);
        while (_jettag_c_iterate_5_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_6_3.setRuntimeParent(_jettag_c_iterate_5_2);
            _jettag_c_iterate_6_3.setTagInfo(_td_c_iterate_6_3);
            _jettag_c_iterate_6_3.doStart(context, out);
            while (_jettag_c_iterate_6_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_3.setRuntimeParent(_jettag_c_iterate_6_3);
                _jettag_c_if_7_3.setTagInfo(_td_c_if_7_3);
                _jettag_c_if_7_3.doStart(context, out);
                while (_jettag_c_if_7_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_8_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_8_4.setRuntimeParent(_jettag_c_if_7_3);
                    _jettag_c_setVariable_8_4.setTagInfo(_td_c_setVariable_8_4);
                    _jettag_c_setVariable_8_4.doStart(context, out);
                    _jettag_c_setVariable_8_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_9_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_9_4.setRuntimeParent(_jettag_c_if_7_3);
                    _jettag_c_setVariable_9_4.setTagInfo(_td_c_setVariable_9_4);
                    _jettag_c_setVariable_9_4.doStart(context, out);
                    _jettag_c_setVariable_9_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_10_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_10_4.setRuntimeParent(_jettag_c_if_7_3);
                    _jettag_c_iterate_10_4.setTagInfo(_td_c_iterate_10_4);
                    _jettag_c_iterate_10_4.doStart(context, out);
                    while (_jettag_c_iterate_10_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_11_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_11_5.setRuntimeParent(_jettag_c_iterate_10_4);
                        _jettag_c_setVariable_11_5.setTagInfo(_td_c_setVariable_11_5);
                        _jettag_c_setVariable_11_5.doStart(context, out);
                        _jettag_c_setVariable_11_5.doEnd();
                        _jettag_c_iterate_10_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_10_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_13_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_13_4.setRuntimeParent(_jettag_c_if_7_3);
                    _jettag_c_iterate_13_4.setTagInfo(_td_c_iterate_13_4);
                    _jettag_c_iterate_13_4.doStart(context, out);
                    while (_jettag_c_iterate_13_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_14_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_14_5.setRuntimeParent(_jettag_c_iterate_13_4);
                        _jettag_c_setVariable_14_5.setTagInfo(_td_c_setVariable_14_5);
                        _jettag_c_setVariable_14_5.doStart(context, out);
                        _jettag_c_setVariable_14_5.doEnd();
                        _jettag_c_iterate_13_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_13_4.doEnd();
                    RuntimeTagElement _jettag_c_choose_16_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_16_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_16_4.setRuntimeParent(_jettag_c_if_7_3);
                    _jettag_c_choose_16_4.setTagInfo(_td_c_choose_16_4);
                    _jettag_c_choose_16_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_16_4_saved_out = out;
                    while (_jettag_c_choose_16_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_17_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_17_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_17_4.setRuntimeParent(_jettag_c_choose_16_4);
                        _jettag_c_when_17_4.setTagInfo(_td_c_when_17_4);
                        _jettag_c_when_17_4.doStart(context, out);
                        JET2Writer _jettag_c_when_17_4_saved_out = out;
                        while (_jettag_c_when_17_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_18_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_18_4.setRuntimeParent(_jettag_c_when_17_4);
                            _jettag_c_iterate_18_4.setTagInfo(_td_c_iterate_18_4);
                            _jettag_c_iterate_18_4.doStart(context, out);
                            while (_jettag_c_iterate_18_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_19_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_19_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_19_4.setRuntimeParent(_jettag_c_iterate_18_4);
                                _jettag_c_choose_19_4.setTagInfo(_td_c_choose_19_4);
                                _jettag_c_choose_19_4.doStart(context, out);
                                JET2Writer _jettag_c_choose_19_4_saved_out = out;
                                while (_jettag_c_choose_19_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_20_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_20_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_20_4.setRuntimeParent(_jettag_c_choose_19_4);
                                    _jettag_c_when_20_4.setTagInfo(_td_c_when_20_4);
                                    _jettag_c_when_20_4.doStart(context, out);
                                    JET2Writer _jettag_c_when_20_4_saved_out = out;
                                    while (_jettag_c_when_20_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_20_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_20_4_saved_out;
                                    _jettag_c_when_20_4.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_22_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_22_4.setRuntimeParent(_jettag_c_choose_19_4);
                                    _jettag_c_otherwise_22_4.setTagInfo(_td_c_otherwise_22_4);
                                    _jettag_c_otherwise_22_4.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_22_4_saved_out = out;
                                    while (_jettag_c_otherwise_22_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        //待添加多对多的分页
                                        out.write("\t\t\tstatic int ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_24_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_15); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_24_15.setRuntimeParent(_jettag_c_otherwise_22_4);
                                        _jettag_c_get_24_15.setTagInfo(_td_c_get_24_15);
                                        _jettag_c_get_24_15.doStart(context, out);
                                        _jettag_c_get_24_15.doEnd();
                                        out.write("PageNumber=0;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tstatic int ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_25_15.setRuntimeParent(_jettag_c_otherwise_22_4);
                                        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
                                        _jettag_c_get_25_15.doStart(context, out);
                                        _jettag_c_get_25_15.doEnd();
                                        out.write("PageSize=10;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_22_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_22_4_saved_out;
                                    _jettag_c_otherwise_22_4.doEnd();
                                    _jettag_c_choose_19_4.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_19_4_saved_out;
                                _jettag_c_choose_19_4.doEnd();
                                _jettag_c_iterate_18_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_18_4.doEnd();
                            _jettag_c_when_17_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_17_4_saved_out;
                        _jettag_c_when_17_4.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_30_4.setRuntimeParent(_jettag_c_choose_16_4);
                        _jettag_c_otherwise_30_4.setTagInfo(_td_c_otherwise_30_4);
                        _jettag_c_otherwise_30_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_30_4_saved_out = out;
                        while (_jettag_c_otherwise_30_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\tstatic int ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_31_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_15); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_31_15.setRuntimeParent(_jettag_c_otherwise_30_4);
                            _jettag_c_get_31_15.setTagInfo(_td_c_get_31_15);
                            _jettag_c_get_31_15.doStart(context, out);
                            _jettag_c_get_31_15.doEnd();
                            out.write("PageNumber=0;");  //$NON-NLS-1$        
                            out.write(NL);         
                            out.write("\t\t\tstatic int ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_32_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_15); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_32_15.setRuntimeParent(_jettag_c_otherwise_30_4);
                            _jettag_c_get_32_15.setTagInfo(_td_c_get_32_15);
                            _jettag_c_get_32_15.doStart(context, out);
                            _jettag_c_get_32_15.doEnd();
                            out.write("PageSize=10;");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_30_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_30_4_saved_out;
                        _jettag_c_otherwise_30_4.doEnd();
                        _jettag_c_choose_16_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_16_4_saved_out;
                    _jettag_c_choose_16_4.doEnd();
                    _jettag_c_if_7_3.handleBodyContent(out);
                }
                _jettag_c_if_7_3.doEnd();
                _jettag_c_iterate_6_3.handleBodyContent(out);
            }
            _jettag_c_iterate_6_3.doEnd();
            _jettag_c_iterate_5_2.handleBodyContent(out);
        }
        _jettag_c_iterate_5_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_39_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_39_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_39_3.setRuntimeParent(null);
        _jettag_java_import_39_3.setTagInfo(_td_java_import_39_3);
        _jettag_java_import_39_3.doStart(context, out);
        JET2Writer _jettag_java_import_39_3_saved_out = out;
        while (_jettag_java_import_39_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.beans.factory.annotation.Autowired");  //$NON-NLS-1$        
            _jettag_java_import_39_3.handleBodyContent(out);
        }
        out = _jettag_java_import_39_3_saved_out;
        _jettag_java_import_39_3.doEnd();
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_40_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_40_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_40_10.setRuntimeParent(null);
        _jettag_java_import_40_10.setTagInfo(_td_java_import_40_10);
        _jettag_java_import_40_10.doStart(context, out);
        JET2Writer _jettag_java_import_40_10_saved_out = out;
        while (_jettag_java_import_40_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_40_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_23.setRuntimeParent(_jettag_java_import_40_10);
            _jettag_c_get_40_23.setTagInfo(_td_c_get_40_23);
            _jettag_c_get_40_23.doStart(context, out);
            _jettag_c_get_40_23.doEnd();
            out.write(".dao.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_40_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_40_58.setRuntimeParent(_jettag_java_import_40_10);
            _jettag_c_get_40_58.setTagInfo(_td_c_get_40_58);
            _jettag_c_get_40_58.doStart(context, out);
            _jettag_c_get_40_58.doEnd();
            out.write("DAO");  //$NON-NLS-1$        
            _jettag_java_import_40_10.handleBodyContent(out);
        }
        out = _jettag_java_import_40_10_saved_out;
        _jettag_java_import_40_10.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_126.setRuntimeParent(null);
        _jettag_c_get_40_126.setTagInfo(_td_c_get_40_126);
        _jettag_c_get_40_126.doStart(context, out);
        _jettag_c_get_40_126.doEnd();
        out.write("DAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_43_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_43_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_43_10.setRuntimeParent(null);
        _jettag_java_import_43_10.setTagInfo(_td_java_import_43_10);
        _jettag_java_import_43_10.doStart(context, out);
        JET2Writer _jettag_java_import_43_10_saved_out = out;
        while (_jettag_java_import_43_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_43_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_43_23.setRuntimeParent(_jettag_java_import_43_10);
            _jettag_c_get_43_23.setTagInfo(_td_c_get_43_23);
            _jettag_c_get_43_23.doStart(context, out);
            _jettag_c_get_43_23.doEnd();
            out.write(".service.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_43_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_43_62.setRuntimeParent(_jettag_java_import_43_10);
            _jettag_c_get_43_62.setTagInfo(_td_c_get_43_62);
            _jettag_c_get_43_62.doStart(context, out);
            _jettag_c_get_43_62.doEnd();
            out.write("Service");  //$NON-NLS-1$        
            _jettag_java_import_43_10.handleBodyContent(out);
        }
        out = _jettag_java_import_43_10_saved_out;
        _jettag_java_import_43_10.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_134); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_134.setRuntimeParent(null);
        _jettag_c_get_43_134.setTagInfo(_td_c_get_43_134);
        _jettag_c_get_43_134.doStart(context, out);
        _jettag_c_get_43_134.doEnd();
        out.write("Service;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_45_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_45_2.setRuntimeParent(null);
        _jettag_c_iterate_45_2.setTagInfo(_td_c_iterate_45_2);
        _jettag_c_iterate_45_2.doStart(context, out);
        while (_jettag_c_iterate_45_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_46_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_46_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_46_2.setRuntimeParent(_jettag_c_iterate_45_2);
            _jettag_c_choose_46_2.setTagInfo(_td_c_choose_46_2);
            _jettag_c_choose_46_2.doStart(context, out);
            JET2Writer _jettag_c_choose_46_2_saved_out = out;
            while (_jettag_c_choose_46_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_47_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_47_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_47_2.setRuntimeParent(_jettag_c_choose_46_2);
                _jettag_c_when_47_2.setTagInfo(_td_c_when_47_2);
                _jettag_c_when_47_2.doStart(context, out);
                JET2Writer _jettag_c_when_47_2_saved_out = out;
                while (_jettag_c_when_47_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_47_2.handleBodyContent(out);
                }
                out = _jettag_c_when_47_2_saved_out;
                _jettag_c_when_47_2.doEnd();
                RuntimeTagElement _jettag_c_otherwise_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_49_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_49_2.setRuntimeParent(_jettag_c_choose_46_2);
                _jettag_c_otherwise_49_2.setTagInfo(_td_c_otherwise_49_2);
                _jettag_c_otherwise_49_2.doStart(context, out);
                JET2Writer _jettag_c_otherwise_49_2_saved_out = out;
                while (_jettag_c_otherwise_49_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t@Autowired");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tprivate ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_10.setRuntimeParent(_jettag_c_otherwise_49_2);
                    _jettag_c_get_51_10.setTagInfo(_td_c_get_51_10);
                    _jettag_c_get_51_10.doStart(context, out);
                    _jettag_c_get_51_10.doEnd();
                    out.write("DAO ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_72.setRuntimeParent(_jettag_c_otherwise_49_2);
                    _jettag_c_get_51_72.setTagInfo(_td_c_get_51_72);
                    _jettag_c_get_51_72.doStart(context, out);
                    _jettag_c_get_51_72.doEnd();
                    out.write("DAO;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_49_2.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_49_2_saved_out;
                _jettag_c_otherwise_49_2.doEnd();
                _jettag_c_choose_46_2.handleBodyContent(out);
            }
            out = _jettag_c_choose_46_2_saved_out;
            _jettag_c_choose_46_2.doEnd();
            _jettag_c_iterate_45_2.handleBodyContent(out);
        }
        _jettag_c_iterate_45_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_56_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_56_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_56_2.setRuntimeParent(null);
        _jettag_c_iterate_56_2.setTagInfo(_td_c_iterate_56_2);
        _jettag_c_iterate_56_2.doStart(context, out);
        while (_jettag_c_iterate_56_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_57_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_57_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_57_2.setRuntimeParent(_jettag_c_iterate_56_2);
            _jettag_c_iterate_57_2.setTagInfo(_td_c_iterate_57_2);
            _jettag_c_iterate_57_2.doStart(context, out);
            while (_jettag_c_iterate_57_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_58_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_58_3.setRuntimeParent(_jettag_c_iterate_57_2);
                _jettag_c_if_58_3.setTagInfo(_td_c_if_58_3);
                _jettag_c_if_58_3.doStart(context, out);
                while (_jettag_c_if_58_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_59_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_59_4.setRuntimeParent(_jettag_c_if_58_3);
                    _jettag_c_setVariable_59_4.setTagInfo(_td_c_setVariable_59_4);
                    _jettag_c_setVariable_59_4.doStart(context, out);
                    _jettag_c_setVariable_59_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_60_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_60_4.setRuntimeParent(_jettag_c_if_58_3);
                    _jettag_c_setVariable_60_4.setTagInfo(_td_c_setVariable_60_4);
                    _jettag_c_setVariable_60_4.doStart(context, out);
                    _jettag_c_setVariable_60_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_61_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_61_4.setRuntimeParent(_jettag_c_if_58_3);
                    _jettag_c_iterate_61_4.setTagInfo(_td_c_iterate_61_4);
                    _jettag_c_iterate_61_4.doStart(context, out);
                    while (_jettag_c_iterate_61_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_62_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_62_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_62_5.setRuntimeParent(_jettag_c_iterate_61_4);
                        _jettag_c_setVariable_62_5.setTagInfo(_td_c_setVariable_62_5);
                        _jettag_c_setVariable_62_5.doStart(context, out);
                        _jettag_c_setVariable_62_5.doEnd();
                        _jettag_c_iterate_61_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_61_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_64_4.setRuntimeParent(_jettag_c_if_58_3);
                    _jettag_c_iterate_64_4.setTagInfo(_td_c_iterate_64_4);
                    _jettag_c_iterate_64_4.doStart(context, out);
                    while (_jettag_c_iterate_64_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_65_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_65_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_65_5.setRuntimeParent(_jettag_c_iterate_64_4);
                        _jettag_c_setVariable_65_5.setTagInfo(_td_c_setVariable_65_5);
                        _jettag_c_setVariable_65_5.doStart(context, out);
                        _jettag_c_setVariable_65_5.doEnd();
                        _jettag_c_iterate_64_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_64_4.doEnd();
                    RuntimeTagElement _jettag_c_choose_67_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_67_4.setRuntimeParent(_jettag_c_if_58_3);
                    _jettag_c_choose_67_4.setTagInfo(_td_c_choose_67_4);
                    _jettag_c_choose_67_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_67_4_saved_out = out;
                    while (_jettag_c_choose_67_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_68_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_68_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_68_4.setRuntimeParent(_jettag_c_choose_67_4);
                        _jettag_c_when_68_4.setTagInfo(_td_c_when_68_4);
                        _jettag_c_when_68_4.doStart(context, out);
                        JET2Writer _jettag_c_when_68_4_saved_out = out;
                        while (_jettag_c_when_68_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_69_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_69_4.setRuntimeParent(_jettag_c_when_68_4);
                            _jettag_c_iterate_69_4.setTagInfo(_td_c_iterate_69_4);
                            _jettag_c_iterate_69_4.doStart(context, out);
                            while (_jettag_c_iterate_69_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_70_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_70_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_70_4.setRuntimeParent(_jettag_c_iterate_69_4);
                                _jettag_c_choose_70_4.setTagInfo(_td_c_choose_70_4);
                                _jettag_c_choose_70_4.doStart(context, out);
                                JET2Writer _jettag_c_choose_70_4_saved_out = out;
                                while (_jettag_c_choose_70_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_71_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_71_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_71_4.setRuntimeParent(_jettag_c_choose_70_4);
                                    _jettag_c_when_71_4.setTagInfo(_td_c_when_71_4);
                                    _jettag_c_when_71_4.doStart(context, out);
                                    JET2Writer _jettag_c_when_71_4_saved_out = out;
                                    while (_jettag_c_when_71_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_73_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_73_12.setRuntimeParent(_jettag_c_when_71_4);
                                        _jettag_c_get_73_12.setTagInfo(_td_c_get_73_12);
                                        _jettag_c_get_73_12.doStart(context, out);
                                        _jettag_c_get_73_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_73_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_67); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_73_67.setRuntimeParent(_jettag_c_when_71_4);
                                        _jettag_c_get_73_67.setTagInfo(_td_c_get_73_67);
                                        _jettag_c_get_73_67.doStart(context, out);
                                        _jettag_c_get_73_67.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_when_71_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_71_4_saved_out;
                                    _jettag_c_when_71_4.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_76_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_76_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_76_4.setRuntimeParent(_jettag_c_choose_70_4);
                                    _jettag_c_otherwise_76_4.setTagInfo(_td_c_otherwise_76_4);
                                    _jettag_c_otherwise_76_4.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_76_4_saved_out = out;
                                    while (_jettag_c_otherwise_76_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        RuntimeTagElement _jettag_c_setVariable_78_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_78_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_78_4.setRuntimeParent(_jettag_c_otherwise_76_4);
                                        _jettag_c_setVariable_78_4.setTagInfo(_td_c_setVariable_78_4);
                                        _jettag_c_setVariable_78_4.doStart(context, out);
                                        _jettag_c_setVariable_78_4.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_79_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_79_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_79_4.setRuntimeParent(_jettag_c_otherwise_76_4);
                                        _jettag_c_iterate_79_4.setTagInfo(_td_c_iterate_79_4);
                                        _jettag_c_iterate_79_4.doStart(context, out);
                                        while (_jettag_c_iterate_79_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_choose_80_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_80_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_choose_80_4.setRuntimeParent(_jettag_c_iterate_79_4);
                                            _jettag_c_choose_80_4.setTagInfo(_td_c_choose_80_4);
                                            _jettag_c_choose_80_4.doStart(context, out);
                                            JET2Writer _jettag_c_choose_80_4_saved_out = out;
                                            while (_jettag_c_choose_80_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_when_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_when_81_4.setRuntimeParent(_jettag_c_choose_80_4);
                                                _jettag_c_when_81_4.setTagInfo(_td_c_when_81_4);
                                                _jettag_c_when_81_4.doStart(context, out);
                                                JET2Writer _jettag_c_when_81_4_saved_out = out;
                                                while (_jettag_c_when_81_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    _jettag_c_when_81_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_when_81_4_saved_out;
                                                _jettag_c_when_81_4.doEnd();
                                                RuntimeTagElement _jettag_c_otherwise_83_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_83_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_otherwise_83_4.setRuntimeParent(_jettag_c_choose_80_4);
                                                _jettag_c_otherwise_83_4.setTagInfo(_td_c_otherwise_83_4);
                                                _jettag_c_otherwise_83_4.doStart(context, out);
                                                JET2Writer _jettag_c_otherwise_83_4_saved_out = out;
                                                while (_jettag_c_otherwise_83_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    RuntimeTagElement _jettag_c_if_84_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_84_4.setRuntimeParent(_jettag_c_otherwise_83_4);
                                                    _jettag_c_if_84_4.setTagInfo(_td_c_if_84_4);
                                                    _jettag_c_if_84_4.doStart(context, out);
                                                    while (_jettag_c_if_84_4.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_setVariable_85_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_85_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_85_4.setRuntimeParent(_jettag_c_if_84_4);
                                                        _jettag_c_setVariable_85_4.setTagInfo(_td_c_setVariable_85_4);
                                                        _jettag_c_setVariable_85_4.doStart(context, out);
                                                        _jettag_c_setVariable_85_4.doEnd();
                                                        _jettag_c_if_84_4.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_84_4.doEnd();
                                                    _jettag_c_otherwise_83_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_otherwise_83_4_saved_out;
                                                _jettag_c_otherwise_83_4.doEnd();
                                                _jettag_c_choose_80_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_choose_80_4_saved_out;
                                            _jettag_c_choose_80_4.doEnd();
                                            _jettag_c_iterate_79_4.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_79_4.doEnd();
                                        RuntimeTagElement _jettag_c_if_90_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_90_4.setRuntimeParent(_jettag_c_otherwise_76_4);
                                        _jettag_c_if_90_4.setTagInfo(_td_c_if_90_4);
                                        _jettag_c_if_90_4.doStart(context, out);
                                        while (_jettag_c_if_90_4.okToProcessBody()) {
                                            out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_92_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_12); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_92_12.setRuntimeParent(_jettag_c_if_90_4);
                                            _jettag_c_get_92_12.setTagInfo(_td_c_get_92_12);
                                            _jettag_c_get_92_12.doStart(context, out);
                                            _jettag_c_get_92_12.doEnd();
                                            out.write("DAO ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_92_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_92_73); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_92_73.setRuntimeParent(_jettag_c_if_90_4);
                                            _jettag_c_get_92_73.setTagInfo(_td_c_get_92_73);
                                            _jettag_c_get_92_73.doStart(context, out);
                                            _jettag_c_get_92_73.doEnd();
                                            out.write("DAO;");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_90_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_90_4.doEnd();
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_96_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_96_12.setRuntimeParent(_jettag_c_otherwise_76_4);
                                        _jettag_c_get_96_12.setTagInfo(_td_c_get_96_12);
                                        _jettag_c_get_96_12.doStart(context, out);
                                        _jettag_c_get_96_12.doEnd();
                                        out.write("Service ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_96_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_96_77); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_96_77.setRuntimeParent(_jettag_c_otherwise_76_4);
                                        _jettag_c_get_96_77.setTagInfo(_td_c_get_96_77);
                                        _jettag_c_get_96_77.doStart(context, out);
                                        _jettag_c_get_96_77.doEnd();
                                        out.write("Service;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_76_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_76_4_saved_out;
                                    _jettag_c_otherwise_76_4.doEnd();
                                    _jettag_c_choose_70_4.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_70_4_saved_out;
                                _jettag_c_choose_70_4.doEnd();
                                _jettag_c_iterate_69_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_69_4.doEnd();
                            out.write(NL);         
                            _jettag_c_when_68_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_68_4_saved_out;
                        _jettag_c_when_68_4.doEnd();
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_otherwise_101_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_101_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_101_4.setRuntimeParent(_jettag_c_choose_67_4);
                        _jettag_c_otherwise_101_4.setTagInfo(_td_c_otherwise_101_4);
                        _jettag_c_otherwise_101_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_101_4_saved_out = out;
                        while (_jettag_c_otherwise_101_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_choose_102_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_102_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_102_4.setRuntimeParent(_jettag_c_otherwise_101_4);
                            _jettag_c_choose_102_4.setTagInfo(_td_c_choose_102_4);
                            _jettag_c_choose_102_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_102_4_saved_out = out;
                            while (_jettag_c_choose_102_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_103_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_103_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_103_4.setRuntimeParent(_jettag_c_choose_102_4);
                                _jettag_c_when_103_4.setTagInfo(_td_c_when_103_4);
                                _jettag_c_when_103_4.doStart(context, out);
                                JET2Writer _jettag_c_when_103_4_saved_out = out;
                                while (_jettag_c_when_103_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    _jettag_c_when_103_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_103_4_saved_out;
                                _jettag_c_when_103_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_105_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_105_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_105_4.setRuntimeParent(_jettag_c_choose_102_4);
                                _jettag_c_otherwise_105_4.setTagInfo(_td_c_otherwise_105_4);
                                _jettag_c_otherwise_105_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_105_4_saved_out = out;
                                while (_jettag_c_otherwise_105_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_setVariable_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_106_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_106_4.setRuntimeParent(_jettag_c_otherwise_105_4);
                                    _jettag_c_setVariable_106_4.setTagInfo(_td_c_setVariable_106_4);
                                    _jettag_c_setVariable_106_4.doStart(context, out);
                                    _jettag_c_setVariable_106_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_107_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_107_4.setRuntimeParent(_jettag_c_otherwise_105_4);
                                    _jettag_c_iterate_107_4.setTagInfo(_td_c_iterate_107_4);
                                    _jettag_c_iterate_107_4.doStart(context, out);
                                    while (_jettag_c_iterate_107_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_108_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_108_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_108_4.setRuntimeParent(_jettag_c_iterate_107_4);
                                        _jettag_c_choose_108_4.setTagInfo(_td_c_choose_108_4);
                                        _jettag_c_choose_108_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_108_4_saved_out = out;
                                        while (_jettag_c_choose_108_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_109_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_109_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_109_4.setRuntimeParent(_jettag_c_choose_108_4);
                                            _jettag_c_when_109_4.setTagInfo(_td_c_when_109_4);
                                            _jettag_c_when_109_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_109_4_saved_out = out;
                                            while (_jettag_c_when_109_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_109_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_109_4_saved_out;
                                            _jettag_c_when_109_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_111_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_111_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_111_4.setRuntimeParent(_jettag_c_choose_108_4);
                                            _jettag_c_otherwise_111_4.setTagInfo(_td_c_otherwise_111_4);
                                            _jettag_c_otherwise_111_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_111_4_saved_out = out;
                                            while (_jettag_c_otherwise_111_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_if_112_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_112_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_112_4.setRuntimeParent(_jettag_c_otherwise_111_4);
                                                _jettag_c_if_112_4.setTagInfo(_td_c_if_112_4);
                                                _jettag_c_if_112_4.doStart(context, out);
                                                while (_jettag_c_if_112_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_113_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_113_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_113_4.setRuntimeParent(_jettag_c_if_112_4);
                                                    _jettag_c_setVariable_113_4.setTagInfo(_td_c_setVariable_113_4);
                                                    _jettag_c_setVariable_113_4.doStart(context, out);
                                                    _jettag_c_setVariable_113_4.doEnd();
                                                    _jettag_c_if_112_4.handleBodyContent(out);
                                                }
                                                _jettag_c_if_112_4.doEnd();
                                                _jettag_c_otherwise_111_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_111_4_saved_out;
                                            _jettag_c_otherwise_111_4.doEnd();
                                            _jettag_c_choose_108_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_108_4_saved_out;
                                        _jettag_c_choose_108_4.doEnd();
                                        _jettag_c_iterate_107_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_107_4.doEnd();
                                    RuntimeTagElement _jettag_c_if_118_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_118_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_118_4.setRuntimeParent(_jettag_c_otherwise_105_4);
                                    _jettag_c_if_118_4.setTagInfo(_td_c_if_118_4);
                                    _jettag_c_if_118_4.doStart(context, out);
                                    while (_jettag_c_if_118_4.okToProcessBody()) {
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_120_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_120_12.setRuntimeParent(_jettag_c_if_118_4);
                                        _jettag_c_get_120_12.setTagInfo(_td_c_get_120_12);
                                        _jettag_c_get_120_12.doStart(context, out);
                                        _jettag_c_get_120_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_120_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_120_67); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_120_67.setRuntimeParent(_jettag_c_if_118_4);
                                        _jettag_c_get_120_67.setTagInfo(_td_c_get_120_67);
                                        _jettag_c_get_120_67.doStart(context, out);
                                        _jettag_c_get_120_67.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_118_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_118_4.doEnd();
                                    out.write("\t\t\t");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_124_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_12); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_124_12.setRuntimeParent(_jettag_c_otherwise_105_4);
                                    _jettag_c_get_124_12.setTagInfo(_td_c_get_124_12);
                                    _jettag_c_get_124_12.doStart(context, out);
                                    _jettag_c_get_124_12.doEnd();
                                    out.write("Service ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_124_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_71); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_124_71.setRuntimeParent(_jettag_c_otherwise_105_4);
                                    _jettag_c_get_124_71.setTagInfo(_td_c_get_124_71);
                                    _jettag_c_get_124_71.doStart(context, out);
                                    _jettag_c_get_124_71.doEnd();
                                    out.write("Service;");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_105_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_105_4_saved_out;
                                _jettag_c_otherwise_105_4.doEnd();
                                _jettag_c_choose_102_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_102_4_saved_out;
                            _jettag_c_choose_102_4.doEnd();
                            _jettag_c_otherwise_101_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_101_4_saved_out;
                        _jettag_c_otherwise_101_4.doEnd();
                        _jettag_c_choose_67_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_67_4_saved_out;
                    _jettag_c_choose_67_4.doEnd();
                    _jettag_c_if_58_3.handleBodyContent(out);
                }
                _jettag_c_if_58_3.doEnd();
                _jettag_c_iterate_57_2.handleBodyContent(out);
            }
            _jettag_c_iterate_57_2.doEnd();
            _jettag_c_iterate_56_2.handleBodyContent(out);
        }
        _jettag_c_iterate_56_2.doEnd();
    }
}
