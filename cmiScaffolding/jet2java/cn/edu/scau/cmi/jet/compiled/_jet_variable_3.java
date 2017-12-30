package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_variable_3 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_variable_3() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_1_3 = new TagInfo("java:import", //$NON-NLS-1$
            1, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_2_10 = new TagInfo("java:import", //$NON-NLS-1$
            2, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_23 = new TagInfo("c:get", //$NON-NLS-1$
            2, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_58 = new TagInfo("c:get", //$NON-NLS-1$
            2, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_126 = new TagInfo("c:get", //$NON-NLS-1$
            2, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_10 = new TagInfo("java:import", //$NON-NLS-1$
            5, 10,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_23 = new TagInfo("c:get", //$NON-NLS-1$
            5, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_62 = new TagInfo("c:get", //$NON-NLS-1$
            5, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_134 = new TagInfo("c:get", //$NON-NLS-1$
            5, 134,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_8_2 = new TagInfo("c:choose", //$NON-NLS-1$
            8, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_9_2 = new TagInfo("c:when", //$NON-NLS-1$
            9, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_11_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            11, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_10 = new TagInfo("c:get", //$NON-NLS-1$
            13, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_72 = new TagInfo("c:get", //$NON-NLS-1$
            13, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_3 = new TagInfo("c:if", //$NON-NLS-1$
            20, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_29_4 = new TagInfo("c:choose", //$NON-NLS-1$
            29, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_30_4 = new TagInfo("c:when", //$NON-NLS-1$
            30, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_32_4 = new TagInfo("c:choose", //$NON-NLS-1$
            32, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_33_4 = new TagInfo("c:when", //$NON-NLS-1$
            33, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_12 = new TagInfo("c:get", //$NON-NLS-1$
            35, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_67 = new TagInfo("c:get", //$NON-NLS-1$
            35, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_38_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            38, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_40_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_42_4 = new TagInfo("c:choose", //$NON-NLS-1$
            42, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_43_4 = new TagInfo("c:when", //$NON-NLS-1$
            43, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_45_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            45, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_46_4 = new TagInfo("c:if", //$NON-NLS-1$
            46, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_52_4 = new TagInfo("c:if", //$NON-NLS-1$
            52, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$flag=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_12 = new TagInfo("c:get", //$NON-NLS-1$
            54, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_73 = new TagInfo("c:get", //$NON-NLS-1$
            54, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_12 = new TagInfo("c:get", //$NON-NLS-1$
            58, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_77 = new TagInfo("c:get", //$NON-NLS-1$
            58, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_63_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            63, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_64_4 = new TagInfo("c:choose", //$NON-NLS-1$
            64, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_65_4 = new TagInfo("c:when", //$NON-NLS-1$
            65, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_67_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            67, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_68_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            68, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
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
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_73_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            73, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_74_4 = new TagInfo("c:if", //$NON-NLS-1$
            74, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_75_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            75, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_80_4 = new TagInfo("c:if", //$NON-NLS-1$
            80, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$flag=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_12 = new TagInfo("c:get", //$NON-NLS-1$
            82, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_82_67 = new TagInfo("c:get", //$NON-NLS-1$
            82, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_12 = new TagInfo("c:get", //$NON-NLS-1$
            86, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_71 = new TagInfo("c:get", //$NON-NLS-1$
            86, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_1_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_1_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_1_3.setRuntimeParent(null);
        _jettag_java_import_1_3.setTagInfo(_td_java_import_1_3);
        _jettag_java_import_1_3.doStart(context, out);
        JET2Writer _jettag_java_import_1_3_saved_out = out;
        while (_jettag_java_import_1_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.beans.factory.annotation.Autowired");  //$NON-NLS-1$        
            _jettag_java_import_1_3.handleBodyContent(out);
        }
        out = _jettag_java_import_1_3_saved_out;
        _jettag_java_import_1_3.doEnd();
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_2_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_2_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_2_10.setRuntimeParent(null);
        _jettag_java_import_2_10.setTagInfo(_td_java_import_2_10);
        _jettag_java_import_2_10.doStart(context, out);
        JET2Writer _jettag_java_import_2_10_saved_out = out;
        while (_jettag_java_import_2_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_2_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_23.setRuntimeParent(_jettag_java_import_2_10);
            _jettag_c_get_2_23.setTagInfo(_td_c_get_2_23);
            _jettag_c_get_2_23.doStart(context, out);
            _jettag_c_get_2_23.doEnd();
            out.write(".dao.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_2_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_58.setRuntimeParent(_jettag_java_import_2_10);
            _jettag_c_get_2_58.setTagInfo(_td_c_get_2_58);
            _jettag_c_get_2_58.doStart(context, out);
            _jettag_c_get_2_58.doEnd();
            out.write("DAO");  //$NON-NLS-1$        
            _jettag_java_import_2_10.handleBodyContent(out);
        }
        out = _jettag_java_import_2_10_saved_out;
        _jettag_java_import_2_10.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_126.setRuntimeParent(null);
        _jettag_c_get_2_126.setTagInfo(_td_c_get_2_126);
        _jettag_c_get_2_126.doStart(context, out);
        _jettag_c_get_2_126.doEnd();
        out.write("DAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_5_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_5_10.setRuntimeParent(null);
        _jettag_java_import_5_10.setTagInfo(_td_java_import_5_10);
        _jettag_java_import_5_10.doStart(context, out);
        JET2Writer _jettag_java_import_5_10_saved_out = out;
        while (_jettag_java_import_5_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_5_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_23.setRuntimeParent(_jettag_java_import_5_10);
            _jettag_c_get_5_23.setTagInfo(_td_c_get_5_23);
            _jettag_c_get_5_23.doStart(context, out);
            _jettag_c_get_5_23.doEnd();
            out.write(".service.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_5_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_62.setRuntimeParent(_jettag_java_import_5_10);
            _jettag_c_get_5_62.setTagInfo(_td_c_get_5_62);
            _jettag_c_get_5_62.doStart(context, out);
            _jettag_c_get_5_62.doEnd();
            out.write("Service");  //$NON-NLS-1$        
            _jettag_java_import_5_10.handleBodyContent(out);
        }
        out = _jettag_java_import_5_10_saved_out;
        _jettag_java_import_5_10.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_134); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_134.setRuntimeParent(null);
        _jettag_c_get_5_134.setTagInfo(_td_c_get_5_134);
        _jettag_c_get_5_134.doStart(context, out);
        _jettag_c_get_5_134.doEnd();
        out.write("Service;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_2.setRuntimeParent(null);
        _jettag_c_iterate_7_2.setTagInfo(_td_c_iterate_7_2);
        _jettag_c_iterate_7_2.doStart(context, out);
        while (_jettag_c_iterate_7_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_8_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_8_2.setRuntimeParent(_jettag_c_iterate_7_2);
            _jettag_c_choose_8_2.setTagInfo(_td_c_choose_8_2);
            _jettag_c_choose_8_2.doStart(context, out);
            JET2Writer _jettag_c_choose_8_2_saved_out = out;
            while (_jettag_c_choose_8_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_9_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_9_2.setRuntimeParent(_jettag_c_choose_8_2);
                _jettag_c_when_9_2.setTagInfo(_td_c_when_9_2);
                _jettag_c_when_9_2.doStart(context, out);
                JET2Writer _jettag_c_when_9_2_saved_out = out;
                while (_jettag_c_when_9_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_9_2.handleBodyContent(out);
                }
                out = _jettag_c_when_9_2_saved_out;
                _jettag_c_when_9_2.doEnd();
                RuntimeTagElement _jettag_c_otherwise_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_11_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_11_2.setRuntimeParent(_jettag_c_choose_8_2);
                _jettag_c_otherwise_11_2.setTagInfo(_td_c_otherwise_11_2);
                _jettag_c_otherwise_11_2.doStart(context, out);
                JET2Writer _jettag_c_otherwise_11_2_saved_out = out;
                while (_jettag_c_otherwise_11_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t@Autowired");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tprivate ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_10.setRuntimeParent(_jettag_c_otherwise_11_2);
                    _jettag_c_get_13_10.setTagInfo(_td_c_get_13_10);
                    _jettag_c_get_13_10.doStart(context, out);
                    _jettag_c_get_13_10.doEnd();
                    out.write("DAO ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_72.setRuntimeParent(_jettag_c_otherwise_11_2);
                    _jettag_c_get_13_72.setTagInfo(_td_c_get_13_72);
                    _jettag_c_get_13_72.doStart(context, out);
                    _jettag_c_get_13_72.doEnd();
                    out.write("DAO;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_11_2.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_11_2_saved_out;
                _jettag_c_otherwise_11_2.doEnd();
                _jettag_c_choose_8_2.handleBodyContent(out);
            }
            out = _jettag_c_choose_8_2_saved_out;
            _jettag_c_choose_8_2.doEnd();
            _jettag_c_iterate_7_2.handleBodyContent(out);
        }
        _jettag_c_iterate_7_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_18_2.setRuntimeParent(null);
        _jettag_c_iterate_18_2.setTagInfo(_td_c_iterate_18_2);
        _jettag_c_iterate_18_2.doStart(context, out);
        while (_jettag_c_iterate_18_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_19_2.setRuntimeParent(_jettag_c_iterate_18_2);
            _jettag_c_iterate_19_2.setTagInfo(_td_c_iterate_19_2);
            _jettag_c_iterate_19_2.doStart(context, out);
            while (_jettag_c_iterate_19_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_20_3.setRuntimeParent(_jettag_c_iterate_19_2);
                _jettag_c_if_20_3.setTagInfo(_td_c_if_20_3);
                _jettag_c_if_20_3.doStart(context, out);
                while (_jettag_c_if_20_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_21_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_21_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_setVariable_21_4.setTagInfo(_td_c_setVariable_21_4);
                    _jettag_c_setVariable_21_4.doStart(context, out);
                    _jettag_c_setVariable_21_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_22_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_setVariable_22_4.setTagInfo(_td_c_setVariable_22_4);
                    _jettag_c_setVariable_22_4.doStart(context, out);
                    _jettag_c_setVariable_22_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_23_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_23_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_iterate_23_4.setTagInfo(_td_c_iterate_23_4);
                    _jettag_c_iterate_23_4.doStart(context, out);
                    while (_jettag_c_iterate_23_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_24_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_24_5.setRuntimeParent(_jettag_c_iterate_23_4);
                        _jettag_c_setVariable_24_5.setTagInfo(_td_c_setVariable_24_5);
                        _jettag_c_setVariable_24_5.doStart(context, out);
                        _jettag_c_setVariable_24_5.doEnd();
                        _jettag_c_iterate_23_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_23_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_26_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_26_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_iterate_26_4.setTagInfo(_td_c_iterate_26_4);
                    _jettag_c_iterate_26_4.doStart(context, out);
                    while (_jettag_c_iterate_26_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_27_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_27_5.setRuntimeParent(_jettag_c_iterate_26_4);
                        _jettag_c_setVariable_27_5.setTagInfo(_td_c_setVariable_27_5);
                        _jettag_c_setVariable_27_5.doStart(context, out);
                        _jettag_c_setVariable_27_5.doEnd();
                        _jettag_c_iterate_26_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_26_4.doEnd();
                    RuntimeTagElement _jettag_c_choose_29_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_29_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_29_4.setRuntimeParent(_jettag_c_if_20_3);
                    _jettag_c_choose_29_4.setTagInfo(_td_c_choose_29_4);
                    _jettag_c_choose_29_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_29_4_saved_out = out;
                    while (_jettag_c_choose_29_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_30_4.setRuntimeParent(_jettag_c_choose_29_4);
                        _jettag_c_when_30_4.setTagInfo(_td_c_when_30_4);
                        _jettag_c_when_30_4.doStart(context, out);
                        JET2Writer _jettag_c_when_30_4_saved_out = out;
                        while (_jettag_c_when_30_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_31_4.setRuntimeParent(_jettag_c_when_30_4);
                            _jettag_c_iterate_31_4.setTagInfo(_td_c_iterate_31_4);
                            _jettag_c_iterate_31_4.doStart(context, out);
                            while (_jettag_c_iterate_31_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_32_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_32_4.setRuntimeParent(_jettag_c_iterate_31_4);
                                _jettag_c_choose_32_4.setTagInfo(_td_c_choose_32_4);
                                _jettag_c_choose_32_4.doStart(context, out);
                                JET2Writer _jettag_c_choose_32_4_saved_out = out;
                                while (_jettag_c_choose_32_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_33_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_33_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_33_4.setRuntimeParent(_jettag_c_choose_32_4);
                                    _jettag_c_when_33_4.setTagInfo(_td_c_when_33_4);
                                    _jettag_c_when_33_4.doStart(context, out);
                                    JET2Writer _jettag_c_when_33_4_saved_out = out;
                                    while (_jettag_c_when_33_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_35_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_35_12.setRuntimeParent(_jettag_c_when_33_4);
                                        _jettag_c_get_35_12.setTagInfo(_td_c_get_35_12);
                                        _jettag_c_get_35_12.doStart(context, out);
                                        _jettag_c_get_35_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_35_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_67); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_35_67.setRuntimeParent(_jettag_c_when_33_4);
                                        _jettag_c_get_35_67.setTagInfo(_td_c_get_35_67);
                                        _jettag_c_get_35_67.doStart(context, out);
                                        _jettag_c_get_35_67.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_when_33_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_33_4_saved_out;
                                    _jettag_c_when_33_4.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_38_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_38_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_38_4.setRuntimeParent(_jettag_c_choose_32_4);
                                    _jettag_c_otherwise_38_4.setTagInfo(_td_c_otherwise_38_4);
                                    _jettag_c_otherwise_38_4.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_38_4_saved_out = out;
                                    while (_jettag_c_otherwise_38_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        RuntimeTagElement _jettag_c_setVariable_40_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_40_4.setRuntimeParent(_jettag_c_otherwise_38_4);
                                        _jettag_c_setVariable_40_4.setTagInfo(_td_c_setVariable_40_4);
                                        _jettag_c_setVariable_40_4.doStart(context, out);
                                        _jettag_c_setVariable_40_4.doEnd();
                                        RuntimeTagElement _jettag_c_iterate_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_iterate_41_4.setRuntimeParent(_jettag_c_otherwise_38_4);
                                        _jettag_c_iterate_41_4.setTagInfo(_td_c_iterate_41_4);
                                        _jettag_c_iterate_41_4.doStart(context, out);
                                        while (_jettag_c_iterate_41_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_choose_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_42_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_choose_42_4.setRuntimeParent(_jettag_c_iterate_41_4);
                                            _jettag_c_choose_42_4.setTagInfo(_td_c_choose_42_4);
                                            _jettag_c_choose_42_4.doStart(context, out);
                                            JET2Writer _jettag_c_choose_42_4_saved_out = out;
                                            while (_jettag_c_choose_42_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_when_43_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_43_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_when_43_4.setRuntimeParent(_jettag_c_choose_42_4);
                                                _jettag_c_when_43_4.setTagInfo(_td_c_when_43_4);
                                                _jettag_c_when_43_4.doStart(context, out);
                                                JET2Writer _jettag_c_when_43_4_saved_out = out;
                                                while (_jettag_c_when_43_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    _jettag_c_when_43_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_when_43_4_saved_out;
                                                _jettag_c_when_43_4.doEnd();
                                                RuntimeTagElement _jettag_c_otherwise_45_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_45_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_otherwise_45_4.setRuntimeParent(_jettag_c_choose_42_4);
                                                _jettag_c_otherwise_45_4.setTagInfo(_td_c_otherwise_45_4);
                                                _jettag_c_otherwise_45_4.doStart(context, out);
                                                JET2Writer _jettag_c_otherwise_45_4_saved_out = out;
                                                while (_jettag_c_otherwise_45_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    RuntimeTagElement _jettag_c_if_46_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_46_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_if_46_4.setRuntimeParent(_jettag_c_otherwise_45_4);
                                                    _jettag_c_if_46_4.setTagInfo(_td_c_if_46_4);
                                                    _jettag_c_if_46_4.doStart(context, out);
                                                    while (_jettag_c_if_46_4.okToProcessBody()) {
                                                        RuntimeTagElement _jettag_c_setVariable_47_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_47_4.setRuntimeParent(_jettag_c_if_46_4);
                                                        _jettag_c_setVariable_47_4.setTagInfo(_td_c_setVariable_47_4);
                                                        _jettag_c_setVariable_47_4.doStart(context, out);
                                                        _jettag_c_setVariable_47_4.doEnd();
                                                        _jettag_c_if_46_4.handleBodyContent(out);
                                                    }
                                                    _jettag_c_if_46_4.doEnd();
                                                    _jettag_c_otherwise_45_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_otherwise_45_4_saved_out;
                                                _jettag_c_otherwise_45_4.doEnd();
                                                _jettag_c_choose_42_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_choose_42_4_saved_out;
                                            _jettag_c_choose_42_4.doEnd();
                                            _jettag_c_iterate_41_4.handleBodyContent(out);
                                        }
                                        _jettag_c_iterate_41_4.doEnd();
                                        RuntimeTagElement _jettag_c_if_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_52_4.setRuntimeParent(_jettag_c_otherwise_38_4);
                                        _jettag_c_if_52_4.setTagInfo(_td_c_if_52_4);
                                        _jettag_c_if_52_4.doStart(context, out);
                                        while (_jettag_c_if_52_4.okToProcessBody()) {
                                            out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_54_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_12); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_54_12.setRuntimeParent(_jettag_c_if_52_4);
                                            _jettag_c_get_54_12.setTagInfo(_td_c_get_54_12);
                                            _jettag_c_get_54_12.doStart(context, out);
                                            _jettag_c_get_54_12.doEnd();
                                            out.write("DAO ");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_c_get_54_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_73); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_get_54_73.setRuntimeParent(_jettag_c_if_52_4);
                                            _jettag_c_get_54_73.setTagInfo(_td_c_get_54_73);
                                            _jettag_c_get_54_73.doStart(context, out);
                                            _jettag_c_get_54_73.doEnd();
                                            out.write("DAO;");  //$NON-NLS-1$        
                                            out.write(NL);         
                                            _jettag_c_if_52_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_52_4.doEnd();
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_58_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_58_12.setRuntimeParent(_jettag_c_otherwise_38_4);
                                        _jettag_c_get_58_12.setTagInfo(_td_c_get_58_12);
                                        _jettag_c_get_58_12.doStart(context, out);
                                        _jettag_c_get_58_12.doEnd();
                                        out.write("Service ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_58_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_77); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_58_77.setRuntimeParent(_jettag_c_otherwise_38_4);
                                        _jettag_c_get_58_77.setTagInfo(_td_c_get_58_77);
                                        _jettag_c_get_58_77.doStart(context, out);
                                        _jettag_c_get_58_77.doEnd();
                                        out.write("Service;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_38_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_38_4_saved_out;
                                    _jettag_c_otherwise_38_4.doEnd();
                                    _jettag_c_choose_32_4.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_32_4_saved_out;
                                _jettag_c_choose_32_4.doEnd();
                                _jettag_c_iterate_31_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_31_4.doEnd();
                            out.write(NL);         
                            _jettag_c_when_30_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_30_4_saved_out;
                        _jettag_c_when_30_4.doEnd();
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_otherwise_63_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_63_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_63_4.setRuntimeParent(_jettag_c_choose_29_4);
                        _jettag_c_otherwise_63_4.setTagInfo(_td_c_otherwise_63_4);
                        _jettag_c_otherwise_63_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_63_4_saved_out = out;
                        while (_jettag_c_otherwise_63_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_choose_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_64_4.setRuntimeParent(_jettag_c_otherwise_63_4);
                            _jettag_c_choose_64_4.setTagInfo(_td_c_choose_64_4);
                            _jettag_c_choose_64_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_64_4_saved_out = out;
                            while (_jettag_c_choose_64_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_65_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_65_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_65_4.setRuntimeParent(_jettag_c_choose_64_4);
                                _jettag_c_when_65_4.setTagInfo(_td_c_when_65_4);
                                _jettag_c_when_65_4.doStart(context, out);
                                JET2Writer _jettag_c_when_65_4_saved_out = out;
                                while (_jettag_c_when_65_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    _jettag_c_when_65_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_65_4_saved_out;
                                _jettag_c_when_65_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_67_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_67_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_67_4.setRuntimeParent(_jettag_c_choose_64_4);
                                _jettag_c_otherwise_67_4.setTagInfo(_td_c_otherwise_67_4);
                                _jettag_c_otherwise_67_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_67_4_saved_out = out;
                                while (_jettag_c_otherwise_67_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_setVariable_68_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_68_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_68_4.setRuntimeParent(_jettag_c_otherwise_67_4);
                                    _jettag_c_setVariable_68_4.setTagInfo(_td_c_setVariable_68_4);
                                    _jettag_c_setVariable_68_4.doStart(context, out);
                                    _jettag_c_setVariable_68_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_69_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_69_4.setRuntimeParent(_jettag_c_otherwise_67_4);
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
                                                _jettag_c_when_71_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_71_4_saved_out;
                                            _jettag_c_when_71_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_73_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_73_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_73_4.setRuntimeParent(_jettag_c_choose_70_4);
                                            _jettag_c_otherwise_73_4.setTagInfo(_td_c_otherwise_73_4);
                                            _jettag_c_otherwise_73_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_73_4_saved_out = out;
                                            while (_jettag_c_otherwise_73_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_if_74_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_74_4.setRuntimeParent(_jettag_c_otherwise_73_4);
                                                _jettag_c_if_74_4.setTagInfo(_td_c_if_74_4);
                                                _jettag_c_if_74_4.doStart(context, out);
                                                while (_jettag_c_if_74_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_75_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_75_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_75_4.setRuntimeParent(_jettag_c_if_74_4);
                                                    _jettag_c_setVariable_75_4.setTagInfo(_td_c_setVariable_75_4);
                                                    _jettag_c_setVariable_75_4.doStart(context, out);
                                                    _jettag_c_setVariable_75_4.doEnd();
                                                    _jettag_c_if_74_4.handleBodyContent(out);
                                                }
                                                _jettag_c_if_74_4.doEnd();
                                                _jettag_c_otherwise_73_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_73_4_saved_out;
                                            _jettag_c_otherwise_73_4.doEnd();
                                            _jettag_c_choose_70_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_70_4_saved_out;
                                        _jettag_c_choose_70_4.doEnd();
                                        _jettag_c_iterate_69_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_69_4.doEnd();
                                    RuntimeTagElement _jettag_c_if_80_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_80_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_80_4.setRuntimeParent(_jettag_c_otherwise_67_4);
                                    _jettag_c_if_80_4.setTagInfo(_td_c_if_80_4);
                                    _jettag_c_if_80_4.doStart(context, out);
                                    while (_jettag_c_if_80_4.okToProcessBody()) {
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_82_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_82_12.setRuntimeParent(_jettag_c_if_80_4);
                                        _jettag_c_get_82_12.setTagInfo(_td_c_get_82_12);
                                        _jettag_c_get_82_12.doStart(context, out);
                                        _jettag_c_get_82_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_82_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_67); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_82_67.setRuntimeParent(_jettag_c_if_80_4);
                                        _jettag_c_get_82_67.setTagInfo(_td_c_get_82_67);
                                        _jettag_c_get_82_67.doStart(context, out);
                                        _jettag_c_get_82_67.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_80_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_80_4.doEnd();
                                    out.write("\t\t\t");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_86_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_12); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_86_12.setRuntimeParent(_jettag_c_otherwise_67_4);
                                    _jettag_c_get_86_12.setTagInfo(_td_c_get_86_12);
                                    _jettag_c_get_86_12.doStart(context, out);
                                    _jettag_c_get_86_12.doEnd();
                                    out.write("Service ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_86_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_71); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_86_71.setRuntimeParent(_jettag_c_otherwise_67_4);
                                    _jettag_c_get_86_71.setTagInfo(_td_c_get_86_71);
                                    _jettag_c_get_86_71.doStart(context, out);
                                    _jettag_c_get_86_71.doEnd();
                                    out.write("Service;");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_67_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_67_4_saved_out;
                                _jettag_c_otherwise_67_4.doEnd();
                                _jettag_c_choose_64_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_64_4_saved_out;
                            _jettag_c_choose_64_4.doEnd();
                            _jettag_c_otherwise_63_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_63_4_saved_out;
                        _jettag_c_otherwise_63_4.doEnd();
                        _jettag_c_choose_29_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_29_4_saved_out;
                    _jettag_c_choose_29_4.doEnd();
                    _jettag_c_if_20_3.handleBodyContent(out);
                }
                _jettag_c_if_20_3.doEnd();
                _jettag_c_iterate_19_2.handleBodyContent(out);
            }
            _jettag_c_iterate_19_2.doEnd();
            _jettag_c_iterate_18_2.handleBodyContent(out);
        }
        _jettag_c_iterate_18_2.doEnd();
    }
}
