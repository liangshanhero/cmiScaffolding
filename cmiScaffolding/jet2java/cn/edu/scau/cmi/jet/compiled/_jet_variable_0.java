package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_variable_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_variable_0() {
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
    private static final TagInfo _td_c_iterate_5_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_6_2 = new TagInfo("c:choose", //$NON-NLS-1$
            6, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_7_2 = new TagInfo("c:when", //$NON-NLS-1$
            7, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_9_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            9, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_11_10 = new TagInfo("c:get", //$NON-NLS-1$
            11, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_72 = new TagInfo("c:get", //$NON-NLS-1$
            11, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_10 = new TagInfo("c:get", //$NON-NLS-1$
            14, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_76 = new TagInfo("c:get", //$NON-NLS-1$
            14, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_3 = new TagInfo("c:if", //$NON-NLS-1$
            21, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_30_4 = new TagInfo("c:choose", //$NON-NLS-1$
            30, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_31_4 = new TagInfo("c:when", //$NON-NLS-1$
            31, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_33_4 = new TagInfo("c:choose", //$NON-NLS-1$
            33, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_34_4 = new TagInfo("c:when", //$NON-NLS-1$
            34, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_36_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            36, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_38_12 = new TagInfo("c:get", //$NON-NLS-1$
            38, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreig/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_73 = new TagInfo("c:get", //$NON-NLS-1$
            38, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_41_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            41, 4,
            new String[] {
            },
            new String[] {
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
                "$referenced/@name=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_45_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            45, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_46_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            46, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_47_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            47, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_48_4 = new TagInfo("c:choose", //$NON-NLS-1$
            48, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_49_4 = new TagInfo("c:when", //$NON-NLS-1$
            49, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_51_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            51, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_52_4 = new TagInfo("c:if", //$NON-NLS-1$
            52, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_53_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            53, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
                "flag", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_58_4 = new TagInfo("c:if", //$NON-NLS-1$
            58, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$flag=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_12 = new TagInfo("c:get", //$NON-NLS-1$
            60, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_60_67 = new TagInfo("c:get", //$NON-NLS-1$
            60, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_12 = new TagInfo("c:get", //$NON-NLS-1$
            63, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_71 = new TagInfo("c:get", //$NON-NLS-1$
            63, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_73_3 = new TagInfo("java:import", //$NON-NLS-1$
            73, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_73_79 = new TagInfo("c:get", //$NON-NLS-1$
            73, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_74_10 = new TagInfo("java:import", //$NON-NLS-1$
            74, 10,
            new String[] {
            },
            new String[] {
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
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_2.setRuntimeParent(null);
        _jettag_c_iterate_5_2.setTagInfo(_td_c_iterate_5_2);
        _jettag_c_iterate_5_2.doStart(context, out);
        while (_jettag_c_iterate_5_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_6_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_6_2.setRuntimeParent(_jettag_c_iterate_5_2);
            _jettag_c_choose_6_2.setTagInfo(_td_c_choose_6_2);
            _jettag_c_choose_6_2.doStart(context, out);
            JET2Writer _jettag_c_choose_6_2_saved_out = out;
            while (_jettag_c_choose_6_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_7_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_7_2.setRuntimeParent(_jettag_c_choose_6_2);
                _jettag_c_when_7_2.setTagInfo(_td_c_when_7_2);
                _jettag_c_when_7_2.doStart(context, out);
                JET2Writer _jettag_c_when_7_2_saved_out = out;
                while (_jettag_c_when_7_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_7_2.handleBodyContent(out);
                }
                out = _jettag_c_when_7_2_saved_out;
                _jettag_c_when_7_2.doEnd();
                RuntimeTagElement _jettag_c_otherwise_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_9_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_9_2.setRuntimeParent(_jettag_c_choose_6_2);
                _jettag_c_otherwise_9_2.setTagInfo(_td_c_otherwise_9_2);
                _jettag_c_otherwise_9_2.doStart(context, out);
                JET2Writer _jettag_c_otherwise_9_2_saved_out = out;
                while (_jettag_c_otherwise_9_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t@Autowired");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tprivate ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_10.setRuntimeParent(_jettag_c_otherwise_9_2);
                    _jettag_c_get_11_10.setTagInfo(_td_c_get_11_10);
                    _jettag_c_get_11_10.doStart(context, out);
                    _jettag_c_get_11_10.doEnd();
                    out.write("DAO ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_72.setRuntimeParent(_jettag_c_otherwise_9_2);
                    _jettag_c_get_11_72.setTagInfo(_td_c_get_11_72);
                    _jettag_c_get_11_72.doStart(context, out);
                    _jettag_c_get_11_72.doEnd();
                    out.write("DAO;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t@Autowired");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tprivate ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_10); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_10.setRuntimeParent(_jettag_c_otherwise_9_2);
                    _jettag_c_get_14_10.setTagInfo(_td_c_get_14_10);
                    _jettag_c_get_14_10.doStart(context, out);
                    _jettag_c_get_14_10.doEnd();
                    out.write("Service ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_76); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_76.setRuntimeParent(_jettag_c_otherwise_9_2);
                    _jettag_c_get_14_76.setTagInfo(_td_c_get_14_76);
                    _jettag_c_get_14_76.doStart(context, out);
                    _jettag_c_get_14_76.doEnd();
                    out.write("Service;");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_9_2.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_9_2_saved_out;
                _jettag_c_otherwise_9_2.doEnd();
                _jettag_c_choose_6_2.handleBodyContent(out);
            }
            out = _jettag_c_choose_6_2_saved_out;
            _jettag_c_choose_6_2.doEnd();
            _jettag_c_iterate_5_2.handleBodyContent(out);
        }
        _jettag_c_iterate_5_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_19_2.setRuntimeParent(null);
        _jettag_c_iterate_19_2.setTagInfo(_td_c_iterate_19_2);
        _jettag_c_iterate_19_2.doStart(context, out);
        while (_jettag_c_iterate_19_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_20_2.setRuntimeParent(_jettag_c_iterate_19_2);
            _jettag_c_iterate_20_2.setTagInfo(_td_c_iterate_20_2);
            _jettag_c_iterate_20_2.doStart(context, out);
            while (_jettag_c_iterate_20_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_21_3.setRuntimeParent(_jettag_c_iterate_20_2);
                _jettag_c_if_21_3.setTagInfo(_td_c_if_21_3);
                _jettag_c_if_21_3.doStart(context, out);
                while (_jettag_c_if_21_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_22_4.setRuntimeParent(_jettag_c_if_21_3);
                    _jettag_c_setVariable_22_4.setTagInfo(_td_c_setVariable_22_4);
                    _jettag_c_setVariable_22_4.doStart(context, out);
                    _jettag_c_setVariable_22_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_23_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_23_4.setRuntimeParent(_jettag_c_if_21_3);
                    _jettag_c_setVariable_23_4.setTagInfo(_td_c_setVariable_23_4);
                    _jettag_c_setVariable_23_4.doStart(context, out);
                    _jettag_c_setVariable_23_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_24_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_24_4.setRuntimeParent(_jettag_c_if_21_3);
                    _jettag_c_iterate_24_4.setTagInfo(_td_c_iterate_24_4);
                    _jettag_c_iterate_24_4.doStart(context, out);
                    while (_jettag_c_iterate_24_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_25_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_25_5.setRuntimeParent(_jettag_c_iterate_24_4);
                        _jettag_c_setVariable_25_5.setTagInfo(_td_c_setVariable_25_5);
                        _jettag_c_setVariable_25_5.doStart(context, out);
                        _jettag_c_setVariable_25_5.doEnd();
                        _jettag_c_iterate_24_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_24_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_27_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_27_4.setRuntimeParent(_jettag_c_if_21_3);
                    _jettag_c_iterate_27_4.setTagInfo(_td_c_iterate_27_4);
                    _jettag_c_iterate_27_4.doStart(context, out);
                    while (_jettag_c_iterate_27_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_28_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_28_5.setRuntimeParent(_jettag_c_iterate_27_4);
                        _jettag_c_setVariable_28_5.setTagInfo(_td_c_setVariable_28_5);
                        _jettag_c_setVariable_28_5.doStart(context, out);
                        _jettag_c_setVariable_28_5.doEnd();
                        _jettag_c_iterate_27_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_27_4.doEnd();
                    RuntimeTagElement _jettag_c_choose_30_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_30_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_30_4.setRuntimeParent(_jettag_c_if_21_3);
                    _jettag_c_choose_30_4.setTagInfo(_td_c_choose_30_4);
                    _jettag_c_choose_30_4.doStart(context, out);
                    JET2Writer _jettag_c_choose_30_4_saved_out = out;
                    while (_jettag_c_choose_30_4.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_31_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_31_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_31_4.setRuntimeParent(_jettag_c_choose_30_4);
                        _jettag_c_when_31_4.setTagInfo(_td_c_when_31_4);
                        _jettag_c_when_31_4.doStart(context, out);
                        JET2Writer _jettag_c_when_31_4_saved_out = out;
                        while (_jettag_c_when_31_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_iterate_32_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_32_4.setRuntimeParent(_jettag_c_when_31_4);
                            _jettag_c_iterate_32_4.setTagInfo(_td_c_iterate_32_4);
                            _jettag_c_iterate_32_4.doStart(context, out);
                            while (_jettag_c_iterate_32_4.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_choose_33_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_33_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_choose_33_4.setRuntimeParent(_jettag_c_iterate_32_4);
                                _jettag_c_choose_33_4.setTagInfo(_td_c_choose_33_4);
                                _jettag_c_choose_33_4.doStart(context, out);
                                JET2Writer _jettag_c_choose_33_4_saved_out = out;
                                while (_jettag_c_choose_33_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_when_34_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_34_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_when_34_4.setRuntimeParent(_jettag_c_choose_33_4);
                                    _jettag_c_when_34_4.setTagInfo(_td_c_when_34_4);
                                    _jettag_c_when_34_4.doStart(context, out);
                                    JET2Writer _jettag_c_when_34_4_saved_out = out;
                                    while (_jettag_c_when_34_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        _jettag_c_when_34_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_when_34_4_saved_out;
                                    _jettag_c_when_34_4.doEnd();
                                    RuntimeTagElement _jettag_c_otherwise_36_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_36_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_otherwise_36_4.setRuntimeParent(_jettag_c_choose_33_4);
                                    _jettag_c_otherwise_36_4.setTagInfo(_td_c_otherwise_36_4);
                                    _jettag_c_otherwise_36_4.doStart(context, out);
                                    JET2Writer _jettag_c_otherwise_36_4_saved_out = out;
                                    while (_jettag_c_otherwise_36_4.okToProcessBody()) {
                                        out = out.newNestedContentWriter();
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_38_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_38_12.setRuntimeParent(_jettag_c_otherwise_36_4);
                                        _jettag_c_get_38_12.setTagInfo(_td_c_get_38_12);
                                        _jettag_c_get_38_12.doStart(context, out);
                                        _jettag_c_get_38_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_38_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_73); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_38_73.setRuntimeParent(_jettag_c_otherwise_36_4);
                                        _jettag_c_get_38_73.setTagInfo(_td_c_get_38_73);
                                        _jettag_c_get_38_73.doStart(context, out);
                                        _jettag_c_get_38_73.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_otherwise_36_4.handleBodyContent(out);
                                    }
                                    out = _jettag_c_otherwise_36_4_saved_out;
                                    _jettag_c_otherwise_36_4.doEnd();
                                    _jettag_c_choose_33_4.handleBodyContent(out);
                                }
                                out = _jettag_c_choose_33_4_saved_out;
                                _jettag_c_choose_33_4.doEnd();
                                _jettag_c_iterate_32_4.handleBodyContent(out);
                            }
                            _jettag_c_iterate_32_4.doEnd();
                            out.write(NL);         
                            _jettag_c_when_31_4.handleBodyContent(out);
                        }
                        out = _jettag_c_when_31_4_saved_out;
                        _jettag_c_when_31_4.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_41_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_41_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_41_4.setRuntimeParent(_jettag_c_choose_30_4);
                        _jettag_c_otherwise_41_4.setTagInfo(_td_c_otherwise_41_4);
                        _jettag_c_otherwise_41_4.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_41_4_saved_out = out;
                        while (_jettag_c_otherwise_41_4.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_choose_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_42_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_42_4.setRuntimeParent(_jettag_c_otherwise_41_4);
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
                                    RuntimeTagElement _jettag_c_setVariable_46_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_46_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_46_4.setRuntimeParent(_jettag_c_otherwise_45_4);
                                    _jettag_c_setVariable_46_4.setTagInfo(_td_c_setVariable_46_4);
                                    _jettag_c_setVariable_46_4.doStart(context, out);
                                    _jettag_c_setVariable_46_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_47_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_47_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_47_4.setRuntimeParent(_jettag_c_otherwise_45_4);
                                    _jettag_c_iterate_47_4.setTagInfo(_td_c_iterate_47_4);
                                    _jettag_c_iterate_47_4.doStart(context, out);
                                    while (_jettag_c_iterate_47_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_48_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_48_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_48_4.setRuntimeParent(_jettag_c_iterate_47_4);
                                        _jettag_c_choose_48_4.setTagInfo(_td_c_choose_48_4);
                                        _jettag_c_choose_48_4.doStart(context, out);
                                        JET2Writer _jettag_c_choose_48_4_saved_out = out;
                                        while (_jettag_c_choose_48_4.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_49_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_49_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_49_4.setRuntimeParent(_jettag_c_choose_48_4);
                                            _jettag_c_when_49_4.setTagInfo(_td_c_when_49_4);
                                            _jettag_c_when_49_4.doStart(context, out);
                                            JET2Writer _jettag_c_when_49_4_saved_out = out;
                                            while (_jettag_c_when_49_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_49_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_49_4_saved_out;
                                            _jettag_c_when_49_4.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_51_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_51_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_51_4.setRuntimeParent(_jettag_c_choose_48_4);
                                            _jettag_c_otherwise_51_4.setTagInfo(_td_c_otherwise_51_4);
                                            _jettag_c_otherwise_51_4.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_51_4_saved_out = out;
                                            while (_jettag_c_otherwise_51_4.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                RuntimeTagElement _jettag_c_if_52_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_52_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_if_52_4.setRuntimeParent(_jettag_c_otherwise_51_4);
                                                _jettag_c_if_52_4.setTagInfo(_td_c_if_52_4);
                                                _jettag_c_if_52_4.doStart(context, out);
                                                while (_jettag_c_if_52_4.okToProcessBody()) {
                                                    RuntimeTagElement _jettag_c_setVariable_53_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_53_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_setVariable_53_4.setRuntimeParent(_jettag_c_if_52_4);
                                                    _jettag_c_setVariable_53_4.setTagInfo(_td_c_setVariable_53_4);
                                                    _jettag_c_setVariable_53_4.doStart(context, out);
                                                    _jettag_c_setVariable_53_4.doEnd();
                                                    _jettag_c_if_52_4.handleBodyContent(out);
                                                }
                                                _jettag_c_if_52_4.doEnd();
                                                _jettag_c_otherwise_51_4.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_51_4_saved_out;
                                            _jettag_c_otherwise_51_4.doEnd();
                                            _jettag_c_choose_48_4.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_48_4_saved_out;
                                        _jettag_c_choose_48_4.doEnd();
                                        _jettag_c_iterate_47_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_47_4.doEnd();
                                    RuntimeTagElement _jettag_c_if_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_58_4.setRuntimeParent(_jettag_c_otherwise_45_4);
                                    _jettag_c_if_58_4.setTagInfo(_td_c_if_58_4);
                                    _jettag_c_if_58_4.doStart(context, out);
                                    while (_jettag_c_if_58_4.okToProcessBody()) {
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_12.setRuntimeParent(_jettag_c_if_58_4);
                                        _jettag_c_get_60_12.setTagInfo(_td_c_get_60_12);
                                        _jettag_c_get_60_12.doStart(context, out);
                                        _jettag_c_get_60_12.doEnd();
                                        out.write("DAO ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_60_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_60_67); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_60_67.setRuntimeParent(_jettag_c_if_58_4);
                                        _jettag_c_get_60_67.setTagInfo(_td_c_get_60_67);
                                        _jettag_c_get_60_67.doStart(context, out);
                                        _jettag_c_get_60_67.doEnd();
                                        out.write("DAO;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\t@Autowired");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        out.write("\t\t\tprivate ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_63_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_12); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_63_12.setRuntimeParent(_jettag_c_if_58_4);
                                        _jettag_c_get_63_12.setTagInfo(_td_c_get_63_12);
                                        _jettag_c_get_63_12.doStart(context, out);
                                        _jettag_c_get_63_12.doEnd();
                                        out.write("Service ");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_c_get_63_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_71); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_get_63_71.setRuntimeParent(_jettag_c_if_58_4);
                                        _jettag_c_get_63_71.setTagInfo(_td_c_get_63_71);
                                        _jettag_c_get_63_71.doStart(context, out);
                                        _jettag_c_get_63_71.doEnd();
                                        out.write("Service;");  //$NON-NLS-1$        
                                        out.write(NL);         
                                        _jettag_c_if_58_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_58_4.doEnd();
                                    _jettag_c_otherwise_45_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_45_4_saved_out;
                                _jettag_c_otherwise_45_4.doEnd();
                                _jettag_c_choose_42_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_42_4_saved_out;
                            _jettag_c_choose_42_4.doEnd();
                            _jettag_c_otherwise_41_4.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_41_4_saved_out;
                        _jettag_c_otherwise_41_4.doEnd();
                        _jettag_c_choose_30_4.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_30_4_saved_out;
                    _jettag_c_choose_30_4.doEnd();
                    _jettag_c_if_21_3.handleBodyContent(out);
                }
                _jettag_c_if_21_3.doEnd();
                _jettag_c_iterate_20_2.handleBodyContent(out);
            }
            _jettag_c_iterate_20_2.doEnd();
            _jettag_c_iterate_19_2.handleBodyContent(out);
        }
        _jettag_c_iterate_19_2.doEnd();
        out.write(NL);         
        out.write("\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_73_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_73_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_73_3.setRuntimeParent(null);
        _jettag_java_import_73_3.setTagInfo(_td_java_import_73_3);
        _jettag_java_import_73_3.doStart(context, out);
        JET2Writer _jettag_java_import_73_3_saved_out = out;
        while (_jettag_java_import_73_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.PersistenceContext");  //$NON-NLS-1$        
            _jettag_java_import_73_3.handleBodyContent(out);
        }
        out = _jettag_java_import_73_3_saved_out;
        _jettag_java_import_73_3.doEnd();
        out.write("(unitName = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_73_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_73_79.setRuntimeParent(null);
        _jettag_c_get_73_79.setTagInfo(_td_c_get_73_79);
        _jettag_c_get_73_79.doStart(context, out);
        _jettag_c_get_73_79.doEnd();
        out.write("\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_74_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_74_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_74_10.setRuntimeParent(null);
        _jettag_java_import_74_10.setTagInfo(_td_java_import_74_10);
        _jettag_java_import_74_10.doStart(context, out);
        JET2Writer _jettag_java_import_74_10_saved_out = out;
        while (_jettag_java_import_74_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.EntityManager");  //$NON-NLS-1$        
            _jettag_java_import_74_10.handleBodyContent(out);
        }
        out = _jettag_java_import_74_10_saved_out;
        _jettag_java_import_74_10.doEnd();
        out.write(" entityManager;");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
