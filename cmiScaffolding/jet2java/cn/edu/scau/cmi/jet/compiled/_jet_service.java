package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_service implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_service() {
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
    private static final TagInfo _td_java_format_5_1 = new TagInfo("java:format", //$NON-NLS-1$
            5, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_6_18 = new TagInfo("c:get", //$NON-NLS-1$
            6, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_1 = new TagInfo("c:include", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/saveEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_1 = new TagInfo("c:include", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/loadEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/deleteEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_1 = new TagInfo("c:include", //$NON-NLS-1$
            17, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/findAllEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_20_1 = new TagInfo("c:include", //$NON-NLS-1$
            20, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/findEntityByPrimaryKey.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_1 = new TagInfo("c:include", //$NON-NLS-1$
            23, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/service/countEntity.jet", //$NON-NLS-1$
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
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_5_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_5_1.setRuntimeParent(null);
        _jettag_java_format_5_1.setTagInfo(_td_java_format_5_1);
        _jettag_java_format_5_1.doStart(context, out);
        JET2Writer _jettag_java_format_5_1_saved_out = out;
        while (_jettag_java_format_5_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("public interface ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_18.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_get_6_18.setTagInfo(_td_c_get_6_18);
            _jettag_c_get_6_18.doStart(context, out);
            _jettag_c_get_6_18.doEnd();
            out.write("Service {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_8_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_8_1.setTagInfo(_td_c_include_8_1);
            _jettag_c_include_8_1.doStart(context, out);
            _jettag_c_include_8_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_11_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_11_1.setTagInfo(_td_c_include_11_1);
            _jettag_c_include_11_1.doStart(context, out);
            _jettag_c_include_11_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_14_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
            _jettag_c_include_14_1.doStart(context, out);
            _jettag_c_include_14_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_17_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_17_1.setTagInfo(_td_c_include_17_1);
            _jettag_c_include_17_1.doStart(context, out);
            _jettag_c_include_17_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_20_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_20_1.setTagInfo(_td_c_include_20_1);
            _jettag_c_include_20_1.doStart(context, out);
            _jettag_c_include_20_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_23_1.setRuntimeParent(_jettag_java_format_5_1);
            _jettag_c_include_23_1.setTagInfo(_td_c_include_23_1);
            _jettag_c_include_23_1.doStart(context, out);
            _jettag_c_include_23_1.doEnd();
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_5_1.handleBodyContent(out);
        }
        out = _jettag_java_format_5_1_saved_out;
        _jettag_java_format_5_1.doEnd();
    }
}
