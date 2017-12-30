package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_tbody implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_tbody() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_f_replaceAll_1_1 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            1, 1,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "Dollar_symbol", //$NON-NLS-1$
                "$", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_55 = new TagInfo("c:get", //$NON-NLS-1$
            12, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_90 = new TagInfo("c:get", //$NON-NLS-1$
            12, 90,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_3 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_14_3 = new TagInfo("c:when", //$NON-NLS-1$
            14, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_77 = new TagInfo("c:get", //$NON-NLS-1$
            15, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_112 = new TagInfo("c:get", //$NON-NLS-1$
            15, 112,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_17_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            17, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_18_24 = new TagInfo("c:get", //$NON-NLS-1$
            18, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_59 = new TagInfo("c:get", //$NON-NLS-1$
            18, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_f_replaceAll_1_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_replaceAll_1_1.setRuntimeParent(null);
        _jettag_f_replaceAll_1_1.setTagInfo(_td_f_replaceAll_1_1);
        _jettag_f_replaceAll_1_1.doStart(context, out);
        JET2Writer _jettag_f_replaceAll_1_1_saved_out = out;
        while (_jettag_f_replaceAll_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t\t<tbody>");  //$NON-NLS-1$        
            out.write(NL);         
            //
            //<c:iterate select="$eachTable/primaryKeys/column" var="primaryKey">
            //				<tr>
            //					<td class="label" valign="top"><fmt:message key="<c:get select="$eachTable/@name"/>.<c:get select="$primaryKey/@name"/>.title"/>:</td>
            //					<td>Dollar_symbol{<c:get select="$eachTable/@name"/>.<c:get select="lowercaseFirst($primaryKey/@name)"/>}&nbsp;</td>
            //				</tr>
            //</c:iterate>
            RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_10_1.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
            _jettag_c_iterate_10_1.doStart(context, out);
            while (_jettag_c_iterate_10_1.okToProcessBody()) {
                out.write("\t\t\t\t<tr>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<td class=\"label\" valign=\"top\"><fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_55.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_get_12_55.setTagInfo(_td_c_get_12_55);
                _jettag_c_get_12_55.doStart(context, out);
                _jettag_c_get_12_55.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_90 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_90); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_90.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_get_12_90.setTagInfo(_td_c_get_12_90);
                _jettag_c_get_12_90.doStart(context, out);
                _jettag_c_get_12_90.doEnd();
                out.write(".title\"/>:</td>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_choose_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_13_3.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_choose_13_3.setTagInfo(_td_c_choose_13_3);
                _jettag_c_choose_13_3.doStart(context, out);
                JET2Writer _jettag_c_choose_13_3_saved_out = out;
                while (_jettag_c_choose_13_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_14_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_14_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_14_3.setRuntimeParent(_jettag_c_choose_13_3);
                    _jettag_c_when_14_3.setTagInfo(_td_c_when_14_3);
                    _jettag_c_when_14_3.doStart(context, out);
                    JET2Writer _jettag_c_when_14_3_saved_out = out;
                    while (_jettag_c_when_14_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\t\t\t\t<td><fmt:formatDate pattern=\"yyyy-MM-dd HH:mm:ss\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_15_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_77); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_15_77.setRuntimeParent(_jettag_c_when_14_3);
                        _jettag_c_get_15_77.setTagInfo(_td_c_get_15_77);
                        _jettag_c_get_15_77.doStart(context, out);
                        _jettag_c_get_15_77.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_15_112 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_112); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_15_112.setRuntimeParent(_jettag_c_when_14_3);
                        _jettag_c_get_15_112.setTagInfo(_td_c_get_15_112);
                        _jettag_c_get_15_112.doStart(context, out);
                        _jettag_c_get_15_112.doEnd();
                        out.write("}\"/>&nbsp;</td>");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_14_3.handleBodyContent(out);
                    }
                    out = _jettag_c_when_14_3_saved_out;
                    _jettag_c_when_14_3.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_17_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_17_3.setRuntimeParent(_jettag_c_choose_13_3);
                    _jettag_c_otherwise_17_3.setTagInfo(_td_c_otherwise_17_3);
                    _jettag_c_otherwise_17_3.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_17_3_saved_out = out;
                    while (_jettag_c_otherwise_17_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t\t\t\t\t<td>Dollar_symbol{");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_18_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_24); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_18_24.setRuntimeParent(_jettag_c_otherwise_17_3);
                        _jettag_c_get_18_24.setTagInfo(_td_c_get_18_24);
                        _jettag_c_get_18_24.doStart(context, out);
                        _jettag_c_get_18_24.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_18_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_59); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_18_59.setRuntimeParent(_jettag_c_otherwise_17_3);
                        _jettag_c_get_18_59.setTagInfo(_td_c_get_18_59);
                        _jettag_c_get_18_59.doStart(context, out);
                        _jettag_c_get_18_59.doEnd();
                        out.write("}&nbsp;</td>");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_otherwise_17_3.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_17_3_saved_out;
                    _jettag_c_otherwise_17_3.doEnd();
                    _jettag_c_choose_13_3.handleBodyContent(out);
                }
                out = _jettag_c_choose_13_3_saved_out;
                _jettag_c_choose_13_3.doEnd();
                out.write("\t\t\t\t</tr>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_10_1.handleBodyContent(out);
            }
            _jettag_c_iterate_10_1.doEnd();
            out.write("\t\t\t</tbody>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
