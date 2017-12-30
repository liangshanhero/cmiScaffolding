package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_domain implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_domain() {
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
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_format_7_1 = new TagInfo("java:format", //$NON-NLS-1$
            7, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_8_1 = new TagInfo("c:include", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/namedQuery.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_14 = new TagInfo("c:get", //$NON-NLS-1$
            10, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_10_76 = new TagInfo("java:import", //$NON-NLS-1$
            10, 76,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_12_1 = new TagInfo("c:include", //$NON-NLS-1$
            12, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/variable.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/getAndSet.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_1 = new TagInfo("c:include", //$NON-NLS-1$
            16, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/copy.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_1 = new TagInfo("c:include", //$NON-NLS-1$
            19, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/toString.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_1 = new TagInfo("c:include", //$NON-NLS-1$
            22, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/hashCode.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_1 = new TagInfo("c:include", //$NON-NLS-1$
            25, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daomain/equals.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".domain;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_2_1.setRuntimeParent(null);
        _jettag_java_importsLocation_2_1.setTagInfo(_td_java_importsLocation_2_1);
        _jettag_java_importsLocation_2_1.doStart(context, out);
        _jettag_java_importsLocation_2_1.doEnd();
        out.write(NL);         
        out.write("import javax.persistence.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.xml.bind.annotation.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_7_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_7_1.setRuntimeParent(null);
        _jettag_java_format_7_1.setTagInfo(_td_java_format_7_1);
        _jettag_java_format_7_1.doStart(context, out);
        JET2Writer _jettag_java_format_7_1_saved_out = out;
        while (_jettag_java_format_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_8_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_8_1.setTagInfo(_td_c_include_8_1);
            _jettag_c_include_8_1.doStart(context, out);
            _jettag_c_include_8_1.doEnd();
            out.write(NL);         
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_14.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_get_10_14.setTagInfo(_td_c_get_10_14);
            _jettag_c_get_10_14.doStart(context, out);
            _jettag_c_get_10_14.doEnd();
            out.write(" implements ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_10_76 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_10_76); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_10_76.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_java_import_10_76.setTagInfo(_td_java_import_10_76);
            _jettag_java_import_10_76.doStart(context, out);
            JET2Writer _jettag_java_import_10_76_saved_out = out;
            while (_jettag_java_import_10_76.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("java.io.Serializable");  //$NON-NLS-1$        
                _jettag_java_import_10_76.handleBodyContent(out);
            }
            out = _jettag_java_import_10_76_saved_out;
            _jettag_java_import_10_76.doEnd();
            out.write(" {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_12_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_12_1.setTagInfo(_td_c_include_12_1);
            _jettag_c_include_12_1.doStart(context, out);
            _jettag_c_include_12_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_14_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
            _jettag_c_include_14_1.doStart(context, out);
            _jettag_c_include_14_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_16_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_16_1.setTagInfo(_td_c_include_16_1);
            _jettag_c_include_16_1.doStart(context, out);
            _jettag_c_include_16_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_19_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_19_1.setTagInfo(_td_c_include_19_1);
            _jettag_c_include_19_1.doStart(context, out);
            _jettag_c_include_19_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_22_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_22_1.setTagInfo(_td_c_include_22_1);
            _jettag_c_include_22_1.doStart(context, out);
            _jettag_c_include_22_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_25_1.setRuntimeParent(_jettag_java_format_7_1);
            _jettag_c_include_25_1.setTagInfo(_td_c_include_25_1);
            _jettag_c_include_25_1.doStart(context, out);
            _jettag_c_include_25_1.doEnd();
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_7_1.handleBodyContent(out);
        }
        out = _jettag_java_format_7_1_saved_out;
        _jettag_java_format_7_1.doEnd();
    }
}
