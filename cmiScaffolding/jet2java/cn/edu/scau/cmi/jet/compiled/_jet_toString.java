package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_toString implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_toString() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_3_3 = new TagInfo("java:import", //$NON-NLS-1$
            3, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_4_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_18 = new TagInfo("c:get", //$NON-NLS-1$
            5, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$p/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_56 = new TagInfo("c:get", //$NON-NLS-1$
            5, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($p/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "c", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_8_3 = new TagInfo("c:choose", //$NON-NLS-1$
            8, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_9_3 = new TagInfo("c:when", //$NON-NLS-1$
            9, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$c/@name='id'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_18 = new TagInfo("c:get", //$NON-NLS-1$
            10, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$c/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_58 = new TagInfo("c:get", //$NON-NLS-1$
            10, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($c/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_12_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            12, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_18 = new TagInfo("c:get", //$NON-NLS-1$
            13, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$c/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_56 = new TagInfo("c:get", //$NON-NLS-1$
            13, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($c/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public String toString() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_3_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_3_3.setRuntimeParent(null);
        _jettag_java_import_3_3.setTagInfo(_td_java_import_3_3);
        _jettag_java_import_3_3.doStart(context, out);
        JET2Writer _jettag_java_import_3_3_saved_out = out;
        while (_jettag_java_import_3_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.lang.StringBuilder");  //$NON-NLS-1$        
            _jettag_java_import_3_3.handleBodyContent(out);
        }
        out = _jettag_java_import_3_3_saved_out;
        _jettag_java_import_3_3.doEnd();
        out.write(" buffer = new StringBuilder();");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_4_3.setRuntimeParent(null);
        _jettag_c_iterate_4_3.setTagInfo(_td_c_iterate_4_3);
        _jettag_c_iterate_4_3.doStart(context, out);
        while (_jettag_c_iterate_4_3.okToProcessBody()) {
            out.write("\t\tbuffer.append(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_5_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_18.setRuntimeParent(_jettag_c_iterate_4_3);
            _jettag_c_get_5_18.setTagInfo(_td_c_get_5_18);
            _jettag_c_get_5_18.doStart(context, out);
            _jettag_c_get_5_18.doEnd();
            out.write("=[\").append(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_5_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_5_56.setRuntimeParent(_jettag_c_iterate_4_3);
            _jettag_c_get_5_56.setTagInfo(_td_c_get_5_56);
            _jettag_c_get_5_56.doStart(context, out);
            _jettag_c_get_5_56.doEnd();
            out.write(").append(\"] \");");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_4_3.handleBodyContent(out);
        }
        _jettag_c_iterate_4_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_3.setRuntimeParent(null);
        _jettag_c_iterate_7_3.setTagInfo(_td_c_iterate_7_3);
        _jettag_c_iterate_7_3.doStart(context, out);
        while (_jettag_c_iterate_7_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_8_3.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_choose_8_3.setTagInfo(_td_c_choose_8_3);
            _jettag_c_choose_8_3.doStart(context, out);
            JET2Writer _jettag_c_choose_8_3_saved_out = out;
            while (_jettag_c_choose_8_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_9_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_9_3.setRuntimeParent(_jettag_c_choose_8_3);
                _jettag_c_when_9_3.setTagInfo(_td_c_when_9_3);
                _jettag_c_when_9_3.doStart(context, out);
                JET2Writer _jettag_c_when_9_3_saved_out = out;
                while (_jettag_c_when_9_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\tbuffer.append(\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_18); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_18.setRuntimeParent(_jettag_c_when_9_3);
                    _jettag_c_get_10_18.setTagInfo(_td_c_get_10_18);
                    _jettag_c_get_10_18.doStart(context, out);
                    _jettag_c_get_10_18.doEnd();
                    out.write("_1=[\").append(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_58.setRuntimeParent(_jettag_c_when_9_3);
                    _jettag_c_get_10_58.setTagInfo(_td_c_get_10_58);
                    _jettag_c_get_10_58.doStart(context, out);
                    _jettag_c_get_10_58.doEnd();
                    out.write("_1).append(\"] \");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_9_3.handleBodyContent(out);
                }
                out = _jettag_c_when_9_3_saved_out;
                _jettag_c_when_9_3.doEnd();
                RuntimeTagElement _jettag_c_otherwise_12_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_12_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_12_3.setRuntimeParent(_jettag_c_choose_8_3);
                _jettag_c_otherwise_12_3.setTagInfo(_td_c_otherwise_12_3);
                _jettag_c_otherwise_12_3.doStart(context, out);
                JET2Writer _jettag_c_otherwise_12_3_saved_out = out;
                while (_jettag_c_otherwise_12_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\tbuffer.append(\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_18); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_18.setRuntimeParent(_jettag_c_otherwise_12_3);
                    _jettag_c_get_13_18.setTagInfo(_td_c_get_13_18);
                    _jettag_c_get_13_18.doStart(context, out);
                    _jettag_c_get_13_18.doEnd();
                    out.write("=[\").append(");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_56.setRuntimeParent(_jettag_c_otherwise_12_3);
                    _jettag_c_get_13_56.setTagInfo(_td_c_get_13_56);
                    _jettag_c_get_13_56.doStart(context, out);
                    _jettag_c_get_13_56.doEnd();
                    out.write(").append(\"] \");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_12_3.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_12_3_saved_out;
                _jettag_c_otherwise_12_3.doEnd();
                _jettag_c_choose_8_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_8_3_saved_out;
            _jettag_c_choose_8_3.doEnd();
            _jettag_c_iterate_7_3.handleBodyContent(out);
        }
        _jettag_c_iterate_7_3.doEnd();
        out.write(NL);         
        out.write("\t\treturn buffer.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
