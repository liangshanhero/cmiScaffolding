package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_rscontroller implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_rscontroller() {
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
    private static final TagInfo _td_c_get_6_8 = new TagInfo("c:get", //$NON-NLS-1$
            6, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_8 = new TagInfo("c:get", //$NON-NLS-1$
            7, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
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
    private static final TagInfo _td_java_format_12_1 = new TagInfo("java:format", //$NON-NLS-1$
            12, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_13_2 = new TagInfo("java:import", //$NON-NLS-1$
            13, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_72 = new TagInfo("c:get", //$NON-NLS-1$
            13, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_14 = new TagInfo("c:get", //$NON-NLS-1$
            14, 14,
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
                "templates/content/java/method/rscontroller/variable.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_2 = new TagInfo("c:include", //$NON-NLS-1$
            16, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/delete.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_2 = new TagInfo("c:include", //$NON-NLS-1$
            17, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/get.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_2 = new TagInfo("c:include", //$NON-NLS-1$
            18, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/list.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_2 = new TagInfo("c:include", //$NON-NLS-1$
            19, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/load.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_20_2 = new TagInfo("c:include", //$NON-NLS-1$
            20, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/new.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_2 = new TagInfo("c:include", //$NON-NLS-1$
            21, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/rscontroller/save.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".RS;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_2_1.setRuntimeParent(null);
        _jettag_java_importsLocation_2_1.setTagInfo(_td_java_importsLocation_2_1);
        _jettag_java_importsLocation_2_1.doStart(context, out);
        _jettag_java_importsLocation_2_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_8.setRuntimeParent(null);
        _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
        _jettag_c_get_6_8.doStart(context, out);
        _jettag_c_get_6_8.doEnd();
        out.write(".dao.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_8.setRuntimeParent(null);
        _jettag_c_get_7_8.setTagInfo(_td_c_get_7_8);
        _jettag_c_get_7_8.doStart(context, out);
        _jettag_c_get_7_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_8.setRuntimeParent(null);
        _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
        _jettag_c_get_8_8.doStart(context, out);
        _jettag_c_get_8_8.doEnd();
        out.write(".service.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_8.setRuntimeParent(null);
        _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
        _jettag_c_get_9_8.doStart(context, out);
        _jettag_c_get_9_8.doEnd();
        out.write(".web.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.annotation.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_12_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_12_1.setRuntimeParent(null);
        _jettag_java_format_12_1.setTagInfo(_td_java_format_12_1);
        _jettag_java_format_12_1.doStart(context, out);
        JET2Writer _jettag_java_format_12_1_saved_out = out;
        while (_jettag_java_format_12_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("@");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_13_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_13_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_13_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_java_import_13_2.setTagInfo(_td_java_import_13_2);
            _jettag_java_import_13_2.doStart(context, out);
            JET2Writer _jettag_java_import_13_2_saved_out = out;
            while (_jettag_java_import_13_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("org.springframework.stereotype.Controller");  //$NON-NLS-1$        
                _jettag_java_import_13_2.handleBodyContent(out);
            }
            out = _jettag_java_import_13_2_saved_out;
            _jettag_java_import_13_2.doEnd();
            out.write("(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_72.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_get_13_72.setTagInfo(_td_c_get_13_72);
            _jettag_c_get_13_72.doStart(context, out);
            _jettag_c_get_13_72.doEnd();
            out.write("RestController\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_14.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_get_14_14.setTagInfo(_td_c_get_14_14);
            _jettag_c_get_14_14.doStart(context, out);
            _jettag_c_get_14_14.doEnd();
            out.write("RestController extends CmiController{");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_15_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_15_2.setTagInfo(_td_c_include_15_2);
            _jettag_c_include_15_2.doStart(context, out);
            _jettag_c_include_15_2.doEnd();
            RuntimeTagElement _jettag_c_include_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_16_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_16_2.setTagInfo(_td_c_include_16_2);
            _jettag_c_include_16_2.doStart(context, out);
            _jettag_c_include_16_2.doEnd();
            RuntimeTagElement _jettag_c_include_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_17_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_17_2.setTagInfo(_td_c_include_17_2);
            _jettag_c_include_17_2.doStart(context, out);
            _jettag_c_include_17_2.doEnd();
            RuntimeTagElement _jettag_c_include_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_18_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_18_2.setTagInfo(_td_c_include_18_2);
            _jettag_c_include_18_2.doStart(context, out);
            _jettag_c_include_18_2.doEnd();
            RuntimeTagElement _jettag_c_include_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_19_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_19_2.setTagInfo(_td_c_include_19_2);
            _jettag_c_include_19_2.doStart(context, out);
            _jettag_c_include_19_2.doEnd();
            RuntimeTagElement _jettag_c_include_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_20_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_20_2.setTagInfo(_td_c_include_20_2);
            _jettag_c_include_20_2.doStart(context, out);
            _jettag_c_include_20_2.doEnd();
            RuntimeTagElement _jettag_c_include_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_21_2.setRuntimeParent(_jettag_java_format_12_1);
            _jettag_c_include_21_2.setTagInfo(_td_c_include_21_2);
            _jettag_c_include_21_2.doStart(context, out);
            _jettag_c_include_21_2.doEnd();
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_12_1.handleBodyContent(out);
        }
        out = _jettag_java_format_12_1_saved_out;
        _jettag_java_format_12_1.doEnd();
    }
}
