package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_propertiesEditor implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_propertiesEditor() {
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
                "pkcount", //$NON-NLS-1$
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
                "$pkcount+1", //$NON-NLS-1$
                "pkcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkcount", //$NON-NLS-1$
                "pknum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_9 = new TagInfo("c:get", //$NON-NLS-1$
            6, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_7_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            7, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "org.example", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_8 = new TagInfo("c:get", //$NON-NLS-1$
            8, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_8 = new TagInfo("c:get", //$NON-NLS-1$
            9, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_11_2 = new TagInfo("java:import", //$NON-NLS-1$
            11, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_11_71 = new TagInfo("c:get", //$NON-NLS-1$
            11, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_14 = new TagInfo("c:get", //$NON-NLS-1$
            12, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_80 = new TagInfo("java:import", //$NON-NLS-1$
            12, 80,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_14_3 = new TagInfo("java:import", //$NON-NLS-1$
            14, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_10 = new TagInfo("c:get", //$NON-NLS-1$
            15, 10,
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
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_31 = new TagInfo("c:get", //$NON-NLS-1$
            17, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_19_3 = new TagInfo("java:import", //$NON-NLS-1$
            19, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_19_44 = new TagInfo("c:get", //$NON-NLS-1$
            19, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_96 = new TagInfo("c:get", //$NON-NLS-1$
            19, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_19_140 = new TagInfo("java:import", //$NON-NLS-1$
            19, 140,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_19_185 = new TagInfo("c:get", //$NON-NLS-1$
            19, 185,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_6 = new TagInfo("c:get", //$NON-NLS-1$
            20, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_18 = new TagInfo("c:get", //$NON-NLS-1$
            21, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_80 = new TagInfo("c:get", //$NON-NLS-1$
            21, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_13 = new TagInfo("c:get", //$NON-NLS-1$
            22, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_16 = new TagInfo("c:get", //$NON-NLS-1$
            23, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_68 = new TagInfo("c:get", //$NON-NLS-1$
            23, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_14 = new TagInfo("c:get", //$NON-NLS-1$
            24, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_62 = new TagInfo("c:get", //$NON-NLS-1$
            24, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primariKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_14 = new TagInfo("c:get", //$NON-NLS-1$
            27, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_56 = new TagInfo("c:get", //$NON-NLS-1$
            27, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_81 = new TagInfo("c:get", //$NON-NLS-1$
            27, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_127 = new TagInfo("c:get", //$NON-NLS-1$
            27, 127,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_5 = new TagInfo("c:get", //$NON-NLS-1$
            30, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_56 = new TagInfo("c:get", //$NON-NLS-1$
            30, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_93 = new TagInfo("c:get", //$NON-NLS-1$
            30, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_135 = new TagInfo("c:get", //$NON-NLS-1$
            30, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_198 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 198,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_30_233 = new TagInfo("c:iterate", //$NON-NLS-1$
            30, 233,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primariKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_300 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 300,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_355 = new TagInfo("c:get", //$NON-NLS-1$
            30, 355,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_397 = new TagInfo("c:get", //$NON-NLS-1$
            30, 397,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_421 = new TagInfo("c:if", //$NON-NLS-1$
            30, 421,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i<$pknum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_5 = new TagInfo("c:get", //$NON-NLS-1$
            31, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_47 = new TagInfo("c:get", //$NON-NLS-1$
            31, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_13 = new TagInfo("c:get", //$NON-NLS-1$
            34, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_1.setRuntimeParent(null);
        _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
        _jettag_c_setVariable_5_1.doStart(context, out);
        _jettag_c_setVariable_5_1.doEnd();
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_9.setRuntimeParent(null);
        _jettag_c_get_6_9.setTagInfo(_td_c_get_6_9);
        _jettag_c_get_6_9.doStart(context, out);
        _jettag_c_get_6_9.doEnd();
        out.write(".initBinder;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_7_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_7_1.setRuntimeParent(null);
        _jettag_java_importsLocation_7_1.setTagInfo(_td_java_importsLocation_7_1);
        _jettag_java_importsLocation_7_1.doStart(context, out);
        _jettag_java_importsLocation_7_1.doEnd();
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_8.setRuntimeParent(null);
        _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
        _jettag_c_get_8_8.doStart(context, out);
        _jettag_c_get_8_8.doEnd();
        out.write(".dao.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_8.setRuntimeParent(null);
        _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
        _jettag_c_get_9_8.doStart(context, out);
        _jettag_c_get_9_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_11_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_11_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_11_2.setRuntimeParent(null);
        _jettag_java_import_11_2.setTagInfo(_td_java_import_11_2);
        _jettag_java_import_11_2.doStart(context, out);
        JET2Writer _jettag_java_import_11_2_saved_out = out;
        while (_jettag_java_import_11_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.stereotype.Component");  //$NON-NLS-1$        
            _jettag_java_import_11_2.handleBodyContent(out);
        }
        out = _jettag_java_import_11_2_saved_out;
        _jettag_java_import_11_2.doEnd();
        out.write("(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_71.setRuntimeParent(null);
        _jettag_c_get_11_71.setTagInfo(_td_c_get_11_71);
        _jettag_c_get_11_71.doStart(context, out);
        _jettag_c_get_11_71.doEnd();
        out.write("sEditor\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_14.setRuntimeParent(null);
        _jettag_c_get_12_14.setTagInfo(_td_c_get_12_14);
        _jettag_c_get_12_14.doStart(context, out);
        _jettag_c_get_12_14.doEnd();
        out.write("sEditor extends ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_12_80 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_80); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_12_80.setRuntimeParent(null);
        _jettag_java_import_12_80.setTagInfo(_td_java_import_12_80);
        _jettag_java_import_12_80.doStart(context, out);
        JET2Writer _jettag_java_import_12_80_saved_out = out;
        while (_jettag_java_import_12_80.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.beans.PropertyEditorSupport");  //$NON-NLS-1$        
            _jettag_java_import_12_80.handleBodyContent(out);
        }
        out = _jettag_java_import_12_80_saved_out;
        _jettag_java_import_12_80.doEnd();
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_14_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_14_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_14_3.setRuntimeParent(null);
        _jettag_java_import_14_3.setTagInfo(_td_java_import_14_3);
        _jettag_java_import_14_3.doStart(context, out);
        JET2Writer _jettag_java_import_14_3_saved_out = out;
        while (_jettag_java_import_14_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.beans.factory.annotation.Autowired");  //$NON-NLS-1$        
            _jettag_java_import_14_3.handleBodyContent(out);
        }
        out = _jettag_java_import_14_3_saved_out;
        _jettag_java_import_14_3.doEnd();
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_10.setRuntimeParent(null);
        _jettag_c_get_15_10.setTagInfo(_td_c_get_15_10);
        _jettag_c_get_15_10.doStart(context, out);
        _jettag_c_get_15_10.doEnd();
        out.write("DAO ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_64.setRuntimeParent(null);
        _jettag_c_get_15_64.setTagInfo(_td_c_get_15_64);
        _jettag_c_get_15_64.doStart(context, out);
        _jettag_c_get_15_64.doEnd();
        out.write("DAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setAsText(String ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_31.setRuntimeParent(null);
        _jettag_c_get_17_31.setTagInfo(_td_c_get_17_31);
        _jettag_c_get_17_31.doStart(context, out);
        _jettag_c_get_17_31.doEnd();
        out.write("s){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_19_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_19_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_19_3.setRuntimeParent(null);
        _jettag_java_import_19_3.setTagInfo(_td_java_import_19_3);
        _jettag_java_import_19_3.doStart(context, out);
        JET2Writer _jettag_java_import_19_3_saved_out = out;
        while (_jettag_java_import_19_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Set");  //$NON-NLS-1$        
            _jettag_java_import_19_3.handleBodyContent(out);
        }
        out = _jettag_java_import_19_3_saved_out;
        _jettag_java_import_19_3.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_44.setRuntimeParent(null);
        _jettag_c_get_19_44.setTagInfo(_td_c_get_19_44);
        _jettag_c_get_19_44.doStart(context, out);
        _jettag_c_get_19_44.doEnd();
        out.write("> ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_96.setRuntimeParent(null);
        _jettag_c_get_19_96.setTagInfo(_td_c_get_19_96);
        _jettag_c_get_19_96.doStart(context, out);
        _jettag_c_get_19_96.doEnd();
        out.write("Set = new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_19_140 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_19_140); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_19_140.setRuntimeParent(null);
        _jettag_java_import_19_140.setTagInfo(_td_java_import_19_140);
        _jettag_java_import_19_140.doStart(context, out);
        JET2Writer _jettag_java_import_19_140_saved_out = out;
        while (_jettag_java_import_19_140.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.HashSet");  //$NON-NLS-1$        
            _jettag_java_import_19_140.handleBodyContent(out);
        }
        out = _jettag_java_import_19_140_saved_out;
        _jettag_java_import_19_140.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_185 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_185); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_185.setRuntimeParent(null);
        _jettag_c_get_19_185.setTagInfo(_td_c_get_19_185);
        _jettag_c_get_19_185.doStart(context, out);
        _jettag_c_get_19_185.doEnd();
        out.write(">();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_6.setRuntimeParent(null);
        _jettag_c_get_20_6.setTagInfo(_td_c_get_20_6);
        _jettag_c_get_20_6.doStart(context, out);
        _jettag_c_get_20_6.doEnd();
        out.write("s.length()>0){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString[] source");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_18.setRuntimeParent(null);
        _jettag_c_get_21_18.setTagInfo(_td_c_get_21_18);
        _jettag_c_get_21_18.doStart(context, out);
        _jettag_c_get_21_18.doEnd();
        out.write("StringSet = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_80); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_80.setRuntimeParent(null);
        _jettag_c_get_21_80.setTagInfo(_td_c_get_21_80);
        _jettag_c_get_21_80.doStart(context, out);
        _jettag_c_get_21_80.doEnd();
        out.write("s.split(\",\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (source");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_13.setRuntimeParent(null);
        _jettag_c_get_22_13.setTagInfo(_td_c_get_22_13);
        _jettag_c_get_22_13.doStart(context, out);
        _jettag_c_get_22_13.doEnd();
        out.write("StringSet != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (String ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_16.setRuntimeParent(null);
        _jettag_c_get_23_16.setTagInfo(_td_c_get_23_16);
        _jettag_c_get_23_16.doStart(context, out);
        _jettag_c_get_23_16.doEnd();
        out.write("StringSet : source");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_68.setRuntimeParent(null);
        _jettag_c_get_23_68.setTagInfo(_td_c_get_23_68);
        _jettag_c_get_23_68.doStart(context, out);
        _jettag_c_get_23_68.doEnd();
        out.write("StringSet) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tString[] ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_14.setRuntimeParent(null);
        _jettag_c_get_24_14.setTagInfo(_td_c_get_24_14);
        _jettag_c_get_24_14.doStart(context, out);
        _jettag_c_get_24_14.doEnd();
        out.write("IdStringSet = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_62.setRuntimeParent(null);
        _jettag_c_get_24_62.setTagInfo(_td_c_get_24_62);
        _jettag_c_get_24_62.doStart(context, out);
        _jettag_c_get_24_62.doEnd();
        out.write("StringSet.split(\"\\\\] \");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_25_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_25_5.setRuntimeParent(null);
        _jettag_c_setVariable_25_5.setTagInfo(_td_c_setVariable_25_5);
        _jettag_c_setVariable_25_5.doStart(context, out);
        _jettag_c_setVariable_25_5.doEnd();
        RuntimeTagElement _jettag_c_iterate_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_26_5.setRuntimeParent(null);
        _jettag_c_iterate_26_5.setTagInfo(_td_c_iterate_26_5);
        _jettag_c_iterate_26_5.doStart(context, out);
        while (_jettag_c_iterate_26_5.okToProcessBody()) {
            out.write("\t\t\t\tString[] ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_14.setRuntimeParent(_jettag_c_iterate_26_5);
            _jettag_c_get_27_14.setTagInfo(_td_c_get_27_14);
            _jettag_c_get_27_14.doStart(context, out);
            _jettag_c_get_27_14.doEnd();
            out.write("IdString");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_56.setRuntimeParent(_jettag_c_iterate_26_5);
            _jettag_c_get_27_56.setTagInfo(_td_c_get_27_56);
            _jettag_c_get_27_56.doStart(context, out);
            _jettag_c_get_27_56.doEnd();
            out.write(" = ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_81.setRuntimeParent(_jettag_c_iterate_26_5);
            _jettag_c_get_27_81.setTagInfo(_td_c_get_27_81);
            _jettag_c_get_27_81.doStart(context, out);
            _jettag_c_get_27_81.doEnd();
            out.write("IdStringSet[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_127); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_127.setRuntimeParent(_jettag_c_iterate_26_5);
            _jettag_c_get_27_127.setTagInfo(_td_c_get_27_127);
            _jettag_c_get_27_127.doStart(context, out);
            _jettag_c_get_27_127.doEnd();
            out.write("].split(\"\\\\=\\\\[\");");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_28_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_28_5.setRuntimeParent(_jettag_c_iterate_26_5);
            _jettag_c_setVariable_28_5.setTagInfo(_td_c_setVariable_28_5);
            _jettag_c_setVariable_28_5.doStart(context, out);
            _jettag_c_setVariable_28_5.doEnd();
            _jettag_c_iterate_26_5.handleBodyContent(out);
        }
        _jettag_c_iterate_26_5.doEnd();
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_5.setRuntimeParent(null);
        _jettag_c_get_30_5.setTagInfo(_td_c_get_30_5);
        _jettag_c_get_30_5.doStart(context, out);
        _jettag_c_get_30_5.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_56.setRuntimeParent(null);
        _jettag_c_get_30_56.setTagInfo(_td_c_get_30_56);
        _jettag_c_get_30_56.doStart(context, out);
        _jettag_c_get_30_56.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_93); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_93.setRuntimeParent(null);
        _jettag_c_get_30_93.setTagInfo(_td_c_get_30_93);
        _jettag_c_get_30_93.doStart(context, out);
        _jettag_c_get_30_93.doEnd();
        out.write("DAO.find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_135); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_135.setRuntimeParent(null);
        _jettag_c_get_30_135.setTagInfo(_td_c_get_30_135);
        _jettag_c_get_30_135.doStart(context, out);
        _jettag_c_get_30_135.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_30_198 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_198); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_30_198.setRuntimeParent(null);
        _jettag_c_setVariable_30_198.setTagInfo(_td_c_setVariable_30_198);
        _jettag_c_setVariable_30_198.doStart(context, out);
        _jettag_c_setVariable_30_198.doEnd();
        RuntimeTagElement _jettag_c_iterate_30_233 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_30_233); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_30_233.setRuntimeParent(null);
        _jettag_c_iterate_30_233.setTagInfo(_td_c_iterate_30_233);
        _jettag_c_iterate_30_233.doStart(context, out);
        while (_jettag_c_iterate_30_233.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_30_300 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_300); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_30_300.setRuntimeParent(_jettag_c_iterate_30_233);
            _jettag_c_setVariable_30_300.setTagInfo(_td_c_setVariable_30_300);
            _jettag_c_setVariable_30_300.doStart(context, out);
            _jettag_c_setVariable_30_300.doEnd();
            out.write("Integer.parseInt(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_355 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_355); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_355.setRuntimeParent(_jettag_c_iterate_30_233);
            _jettag_c_get_30_355.setTagInfo(_td_c_get_30_355);
            _jettag_c_get_30_355.doStart(context, out);
            _jettag_c_get_30_355.doEnd();
            out.write("IdString");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_397 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_397); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_397.setRuntimeParent(_jettag_c_iterate_30_233);
            _jettag_c_get_30_397.setTagInfo(_td_c_get_30_397);
            _jettag_c_get_30_397.doStart(context, out);
            _jettag_c_get_30_397.doEnd();
            out.write("[1])");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_30_421 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_421); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_30_421.setRuntimeParent(_jettag_c_iterate_30_233);
            _jettag_c_if_30_421.setTagInfo(_td_c_if_30_421);
            _jettag_c_if_30_421.doStart(context, out);
            while (_jettag_c_if_30_421.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_30_421.handleBodyContent(out);
            }
            _jettag_c_if_30_421.doEnd();
            _jettag_c_iterate_30_233.handleBodyContent(out);
        }
        _jettag_c_iterate_30_233.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_5.setRuntimeParent(null);
        _jettag_c_get_31_5.setTagInfo(_td_c_get_31_5);
        _jettag_c_get_31_5.doStart(context, out);
        _jettag_c_get_31_5.doEnd();
        out.write("Set.add(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_47.setRuntimeParent(null);
        _jettag_c_get_31_47.setTagInfo(_td_c_get_31_47);
        _jettag_c_get_31_47.doStart(context, out);
        _jettag_c_get_31_47.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetValue(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_13.setRuntimeParent(null);
        _jettag_c_get_34_13.setTagInfo(_td_c_get_34_13);
        _jettag_c_get_34_13.doStart(context, out);
        _jettag_c_get_34_13.doEnd();
        out.write("Set);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetValue(null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
