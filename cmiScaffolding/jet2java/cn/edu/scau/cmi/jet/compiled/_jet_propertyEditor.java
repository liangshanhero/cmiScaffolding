package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_propertyEditor implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_propertyEditor() {
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
    private static final TagInfo _td_java_import_12_79 = new TagInfo("java:import", //$NON-NLS-1$
            12, 79,
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
    private static final TagInfo _td_c_get_18_3 = new TagInfo("c:get", //$NON-NLS-1$
            18, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_54 = new TagInfo("c:get", //$NON-NLS-1$
            18, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_93 = new TagInfo("c:get", //$NON-NLS-1$
            18, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_6 = new TagInfo("c:get", //$NON-NLS-1$
            19, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_12 = new TagInfo("c:get", //$NON-NLS-1$
            20, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_56 = new TagInfo("c:get", //$NON-NLS-1$
            20, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_21_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            21, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primariKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_25 = new TagInfo("c:get", //$NON-NLS-1$
            23, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_48 = new TagInfo("c:get", //$NON-NLS-1$
            23, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_92 = new TagInfo("c:get", //$NON-NLS-1$
            23, 92,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_3 = new TagInfo("c:get", //$NON-NLS-1$
            27, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_38 = new TagInfo("c:get", //$NON-NLS-1$
            27, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_80 = new TagInfo("c:get", //$NON-NLS-1$
            27, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_143 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 143,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_178 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 178,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primariKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_245 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 245,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_313 = new TagInfo("c:get", //$NON-NLS-1$
            27, 313,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_337 = new TagInfo("c:if", //$NON-NLS-1$
            27, 337,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i<$pknum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_12 = new TagInfo("c:get", //$NON-NLS-1$
            28, 12,
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
        out.write("Editor\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_14.setRuntimeParent(null);
        _jettag_c_get_12_14.setTagInfo(_td_c_get_12_14);
        _jettag_c_get_12_14.doStart(context, out);
        _jettag_c_get_12_14.doEnd();
        out.write("Editor extends ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_12_79 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_79); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_12_79.setRuntimeParent(null);
        _jettag_java_import_12_79.setTagInfo(_td_java_import_12_79);
        _jettag_java_import_12_79.doStart(context, out);
        JET2Writer _jettag_java_import_12_79_saved_out = out;
        while (_jettag_java_import_12_79.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.beans.PropertyEditorSupport");  //$NON-NLS-1$        
            _jettag_java_import_12_79.handleBodyContent(out);
        }
        out = _jettag_java_import_12_79_saved_out;
        _jettag_java_import_12_79.doEnd();
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
        out.write("String){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_3.setRuntimeParent(null);
        _jettag_c_get_18_3.setTagInfo(_td_c_get_18_3);
        _jettag_c_get_18_3.doStart(context, out);
        _jettag_c_get_18_3.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_54.setRuntimeParent(null);
        _jettag_c_get_18_54.setTagInfo(_td_c_get_18_54);
        _jettag_c_get_18_54.doStart(context, out);
        _jettag_c_get_18_54.doEnd();
        out.write("=new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_93); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_93.setRuntimeParent(null);
        _jettag_c_get_18_93.setTagInfo(_td_c_get_18_93);
        _jettag_c_get_18_93.doStart(context, out);
        _jettag_c_get_18_93.doEnd();
        out.write("();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_6.setRuntimeParent(null);
        _jettag_c_get_19_6.setTagInfo(_td_c_get_19_6);
        _jettag_c_get_19_6.doStart(context, out);
        _jettag_c_get_19_6.doEnd();
        out.write("String.length()>0){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString[] ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_12.setRuntimeParent(null);
        _jettag_c_get_20_12.setTagInfo(_td_c_get_20_12);
        _jettag_c_get_20_12.doStart(context, out);
        _jettag_c_get_20_12.doEnd();
        out.write("StringSet=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_56); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_56.setRuntimeParent(null);
        _jettag_c_get_20_56.setTagInfo(_td_c_get_20_56);
        _jettag_c_get_20_56.doStart(context, out);
        _jettag_c_get_20_56.doEnd();
        out.write("String.split(\"\\\\] \");");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_21_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_21_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_21_3.setRuntimeParent(null);
        _jettag_c_setVariable_21_3.setTagInfo(_td_c_setVariable_21_3);
        _jettag_c_setVariable_21_3.doStart(context, out);
        _jettag_c_setVariable_21_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_22_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_3.setRuntimeParent(null);
        _jettag_c_iterate_22_3.setTagInfo(_td_c_iterate_22_3);
        _jettag_c_iterate_22_3.doStart(context, out);
        while (_jettag_c_iterate_22_3.okToProcessBody()) {
            out.write("\t\tString[] room2deviceId");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_23_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_25.setRuntimeParent(_jettag_c_iterate_22_3);
            _jettag_c_get_23_25.setTagInfo(_td_c_get_23_25);
            _jettag_c_get_23_25.doStart(context, out);
            _jettag_c_get_23_25.doEnd();
            out.write("=");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_23_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_48.setRuntimeParent(_jettag_c_iterate_22_3);
            _jettag_c_get_23_48.setTagInfo(_td_c_get_23_48);
            _jettag_c_get_23_48.doStart(context, out);
            _jettag_c_get_23_48.doEnd();
            out.write("StringSet[");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_23_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_92.setRuntimeParent(_jettag_c_iterate_22_3);
            _jettag_c_get_23_92.setTagInfo(_td_c_get_23_92);
            _jettag_c_get_23_92.doStart(context, out);
            _jettag_c_get_23_92.doEnd();
            out.write("].split(\"\\\\=\\\\[\");");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_24_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_24_3.setRuntimeParent(_jettag_c_iterate_22_3);
            _jettag_c_setVariable_24_3.setTagInfo(_td_c_setVariable_24_3);
            _jettag_c_setVariable_24_3.doStart(context, out);
            _jettag_c_setVariable_24_3.doEnd();
            _jettag_c_iterate_22_3.handleBodyContent(out);
        }
        _jettag_c_iterate_22_3.doEnd();
        out.write("\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_3.setRuntimeParent(null);
        _jettag_c_get_27_3.setTagInfo(_td_c_get_27_3);
        _jettag_c_get_27_3.doStart(context, out);
        _jettag_c_get_27_3.doEnd();
        out.write("=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_38); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_38.setRuntimeParent(null);
        _jettag_c_get_27_38.setTagInfo(_td_c_get_27_38);
        _jettag_c_get_27_38.doStart(context, out);
        _jettag_c_get_27_38.doEnd();
        out.write("DAO.find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_80); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_80.setRuntimeParent(null);
        _jettag_c_get_27_80.setTagInfo(_td_c_get_27_80);
        _jettag_c_get_27_80.doStart(context, out);
        _jettag_c_get_27_80.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_27_143 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_143); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_27_143.setRuntimeParent(null);
        _jettag_c_setVariable_27_143.setTagInfo(_td_c_setVariable_27_143);
        _jettag_c_setVariable_27_143.doStart(context, out);
        _jettag_c_setVariable_27_143.doEnd();
        RuntimeTagElement _jettag_c_iterate_27_178 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_178); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_27_178.setRuntimeParent(null);
        _jettag_c_iterate_27_178.setTagInfo(_td_c_iterate_27_178);
        _jettag_c_iterate_27_178.doStart(context, out);
        while (_jettag_c_iterate_27_178.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_27_245 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_245); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_27_245.setRuntimeParent(_jettag_c_iterate_27_178);
            _jettag_c_setVariable_27_245.setTagInfo(_td_c_setVariable_27_245);
            _jettag_c_setVariable_27_245.doStart(context, out);
            _jettag_c_setVariable_27_245.doEnd();
            out.write("Integer.parseInt(room2deviceId");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_27_313 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_313); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_313.setRuntimeParent(_jettag_c_iterate_27_178);
            _jettag_c_get_27_313.setTagInfo(_td_c_get_27_313);
            _jettag_c_get_27_313.doStart(context, out);
            _jettag_c_get_27_313.doEnd();
            out.write("[1])");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_27_337 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_337); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_27_337.setRuntimeParent(_jettag_c_iterate_27_178);
            _jettag_c_if_27_337.setTagInfo(_td_c_if_27_337);
            _jettag_c_if_27_337.doStart(context, out);
            while (_jettag_c_if_27_337.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_27_337.handleBodyContent(out);
            }
            _jettag_c_if_27_337.doEnd();
            _jettag_c_iterate_27_178.handleBodyContent(out);
        }
        _jettag_c_iterate_27_178.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetValue(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_12.setRuntimeParent(null);
        _jettag_c_get_28_12.setTagInfo(_td_c_get_28_12);
        _jettag_c_get_28_12.doStart(context, out);
        _jettag_c_get_28_12.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetValue(null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
