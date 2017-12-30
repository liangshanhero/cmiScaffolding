package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_tbody_2 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_tbody_2() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_3_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ft", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_3 = new TagInfo("c:if", //$NON-NLS-1$
            4, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ft/@name=$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ft/primaryKeys/column", //$NON-NLS-1$
                "fc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_8 = new TagInfo("c:get", //$NON-NLS-1$
            8, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_43 = new TagInfo("c:get", //$NON-NLS-1$
            8, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_21 = new TagInfo("c:get", //$NON-NLS-1$
            9, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_56 = new TagInfo("c:get", //$NON-NLS-1$
            9, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ft/columns/column", //$NON-NLS-1$
                "fc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_52 = new TagInfo("c:get", //$NON-NLS-1$
            14, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_87 = new TagInfo("c:get", //$NON-NLS-1$
            14, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_21 = new TagInfo("c:get", //$NON-NLS-1$
            15, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_56 = new TagInfo("c:get", //$NON-NLS-1$
            15, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_3.setRuntimeParent(null);
        _jettag_c_iterate_3_3.setTagInfo(_td_c_iterate_3_3);
        _jettag_c_iterate_3_3.doStart(context, out);
        while (_jettag_c_iterate_3_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_3.setRuntimeParent(_jettag_c_iterate_3_3);
            _jettag_c_if_4_3.setTagInfo(_td_c_if_4_3);
            _jettag_c_if_4_3.doStart(context, out);
            while (_jettag_c_if_4_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_iterate_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_5_3.setRuntimeParent(_jettag_c_if_4_3);
                _jettag_c_iterate_5_3.setTagInfo(_td_c_iterate_5_3);
                _jettag_c_iterate_5_3.doStart(context, out);
                while (_jettag_c_iterate_5_3.okToProcessBody()) {
                    out.write("\t\t<tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t<td class=\"label\" valign=\"top\"><fmt:message");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tkey=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_8.setRuntimeParent(_jettag_c_iterate_5_3);
                    _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
                    _jettag_c_get_8_8.doStart(context, out);
                    _jettag_c_get_8_8.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_43); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_43.setRuntimeParent(_jettag_c_iterate_5_3);
                    _jettag_c_get_8_43.setTagInfo(_td_c_get_8_43);
                    _jettag_c_get_8_43.doStart(context, out);
                    _jettag_c_get_8_43.doEnd();
                    out.write(".title\" />:</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t<td>Dollar_symbol{");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_21); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_21.setRuntimeParent(_jettag_c_iterate_5_3);
                    _jettag_c_get_9_21.setTagInfo(_td_c_get_9_21);
                    _jettag_c_get_9_21.doStart(context, out);
                    _jettag_c_get_9_21.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_56.setRuntimeParent(_jettag_c_iterate_5_3);
                    _jettag_c_get_9_56.setTagInfo(_td_c_get_9_56);
                    _jettag_c_get_9_56.doStart(context, out);
                    _jettag_c_get_9_56.doEnd();
                    out.write("} &nbsp;</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t</tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_5_3.handleBodyContent(out);
                }
                _jettag_c_iterate_5_3.doEnd();
                RuntimeTagElement _jettag_c_iterate_12_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_12_3.setRuntimeParent(_jettag_c_if_4_3);
                _jettag_c_iterate_12_3.setTagInfo(_td_c_iterate_12_3);
                _jettag_c_iterate_12_3.doStart(context, out);
                while (_jettag_c_iterate_12_3.okToProcessBody()) {
                    out.write("\t\t<tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t<td class=\"label\" valign=\"top\"><fmt:message key=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_52); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_52.setRuntimeParent(_jettag_c_iterate_12_3);
                    _jettag_c_get_14_52.setTagInfo(_td_c_get_14_52);
                    _jettag_c_get_14_52.doStart(context, out);
                    _jettag_c_get_14_52.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_87); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_87.setRuntimeParent(_jettag_c_iterate_12_3);
                    _jettag_c_get_14_87.setTagInfo(_td_c_get_14_87);
                    _jettag_c_get_14_87.doStart(context, out);
                    _jettag_c_get_14_87.doEnd();
                    out.write(".title\" />:</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t<td>Dollar_symbol{");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_21); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_21.setRuntimeParent(_jettag_c_iterate_12_3);
                    _jettag_c_get_15_21.setTagInfo(_td_c_get_15_21);
                    _jettag_c_get_15_21.doStart(context, out);
                    _jettag_c_get_15_21.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_56); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_56.setRuntimeParent(_jettag_c_iterate_12_3);
                    _jettag_c_get_15_56.setTagInfo(_td_c_get_15_56);
                    _jettag_c_get_15_56.doStart(context, out);
                    _jettag_c_get_15_56.doEnd();
                    out.write("} &nbsp;</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t</tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_12_3.handleBodyContent(out);
                }
                _jettag_c_iterate_12_3.doEnd();
                _jettag_c_if_4_3.handleBodyContent(out);
            }
            _jettag_c_if_4_3.doEnd();
            _jettag_c_iterate_3_3.handleBodyContent(out);
        }
        _jettag_c_iterate_3_3.doEnd();
        out.write("\t\t</tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</table>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
