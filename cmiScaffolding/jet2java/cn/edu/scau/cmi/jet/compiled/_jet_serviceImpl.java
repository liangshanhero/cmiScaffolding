package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_serviceImpl implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_serviceImpl() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_2_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            2, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "org.example", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_8 = new TagInfo("c:get", //$NON-NLS-1$
            3, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_8 = new TagInfo("c:get", //$NON-NLS-1$
            4, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_6_2 = new TagInfo("java:import", //$NON-NLS-1$
            6, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_6_69 = new TagInfo("c:get", //$NON-NLS-1$
            6, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_7_2 = new TagInfo("java:import", //$NON-NLS-1$
            7, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_format_8_1 = new TagInfo("java:format", //$NON-NLS-1$
            8, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_14 = new TagInfo("c:get", //$NON-NLS-1$
            9, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_87 = new TagInfo("c:get", //$NON-NLS-1$
            9, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_10_2 = new TagInfo("c:include", //$NON-NLS-1$
            10, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/variable.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_9 = new TagInfo("c:get", //$NON-NLS-1$
            12, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_2 = new TagInfo("c:include", //$NON-NLS-1$
            15, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/saveEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_2 = new TagInfo("c:include", //$NON-NLS-1$
            17, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/deleteEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_2 = new TagInfo("c:include", //$NON-NLS-1$
            19, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/loadEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_2 = new TagInfo("c:include", //$NON-NLS-1$
            21, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/findAllEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_2 = new TagInfo("c:include", //$NON-NLS-1$
            23, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/findEntityByPrimaryKey.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_2 = new TagInfo("c:include", //$NON-NLS-1$
            25, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/serviceImpl/countEntity.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".service;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_2_1.setRuntimeParent(null);
        _jettag_java_importsLocation_2_1.setTagInfo(_td_java_importsLocation_2_1);
        _jettag_java_importsLocation_2_1.doStart(context, out);
        _jettag_java_importsLocation_2_1.doEnd();
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_8.setRuntimeParent(null);
        _jettag_c_get_3_8.setTagInfo(_td_c_get_3_8);
        _jettag_c_get_3_8.doStart(context, out);
        _jettag_c_get_3_8.doEnd();
        out.write(".dao.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_8.setRuntimeParent(null);
        _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
        _jettag_c_get_4_8.doStart(context, out);
        _jettag_c_get_4_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_6_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_6_2.setRuntimeParent(null);
        _jettag_java_import_6_2.setTagInfo(_td_java_import_6_2);
        _jettag_java_import_6_2.doStart(context, out);
        JET2Writer _jettag_java_import_6_2_saved_out = out;
        while (_jettag_java_import_6_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.stereotype.Service");  //$NON-NLS-1$        
            _jettag_java_import_6_2.handleBodyContent(out);
        }
        out = _jettag_java_import_6_2_saved_out;
        _jettag_java_import_6_2.doEnd();
        out.write("(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_69); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_69.setRuntimeParent(null);
        _jettag_c_get_6_69.setTagInfo(_td_c_get_6_69);
        _jettag_c_get_6_69.doStart(context, out);
        _jettag_c_get_6_69.doEnd();
        out.write("Service\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_7_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_7_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_7_2.setRuntimeParent(null);
        _jettag_java_import_7_2.setTagInfo(_td_java_import_7_2);
        _jettag_java_import_7_2.doStart(context, out);
        JET2Writer _jettag_java_import_7_2_saved_out = out;
        while (_jettag_java_import_7_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.transaction.annotation.Transactional");  //$NON-NLS-1$        
            _jettag_java_import_7_2.handleBodyContent(out);
        }
        out = _jettag_java_import_7_2_saved_out;
        _jettag_java_import_7_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_8_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_8_1.setRuntimeParent(null);
        _jettag_java_format_8_1.setTagInfo(_td_java_format_8_1);
        _jettag_java_format_8_1.doStart(context, out);
        JET2Writer _jettag_java_format_8_1_saved_out = out;
        while (_jettag_java_format_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_14.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_get_9_14.setTagInfo(_td_c_get_9_14);
            _jettag_c_get_9_14.doStart(context, out);
            _jettag_c_get_9_14.doEnd();
            out.write("ServiceImpl implements ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_87); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_87.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_get_9_87.setTagInfo(_td_c_get_9_87);
            _jettag_c_get_9_87.doStart(context, out);
            _jettag_c_get_9_87.doEnd();
            out.write("Service {");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_10_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_10_2.setTagInfo(_td_c_include_10_2);
            _jettag_c_include_10_2.doStart(context, out);
            _jettag_c_include_10_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpublic ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_9.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_get_12_9.setTagInfo(_td_c_get_12_9);
            _jettag_c_get_12_9.doStart(context, out);
            _jettag_c_get_12_9.doEnd();
            out.write("ServiceImpl() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_15_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_15_2.setTagInfo(_td_c_include_15_2);
            _jettag_c_include_15_2.doStart(context, out);
            _jettag_c_include_15_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_17_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_17_2.setTagInfo(_td_c_include_17_2);
            _jettag_c_include_17_2.doStart(context, out);
            _jettag_c_include_17_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_19_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_19_2.setTagInfo(_td_c_include_19_2);
            _jettag_c_include_19_2.doStart(context, out);
            _jettag_c_include_19_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_21_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_21_2.setTagInfo(_td_c_include_21_2);
            _jettag_c_include_21_2.doStart(context, out);
            _jettag_c_include_21_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_23_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_23_2.setTagInfo(_td_c_include_23_2);
            _jettag_c_include_23_2.doStart(context, out);
            _jettag_c_include_23_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_25_2.setRuntimeParent(_jettag_java_format_8_1);
            _jettag_c_include_25_2.setTagInfo(_td_c_include_25_2);
            _jettag_c_include_25_2.doStart(context, out);
            _jettag_c_include_25_2.doEnd();
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_8_1.handleBodyContent(out);
        }
        out = _jettag_java_format_8_1_saved_out;
        _jettag_java_format_8_1.doEnd();
        out.write(NL);         
    }
}
