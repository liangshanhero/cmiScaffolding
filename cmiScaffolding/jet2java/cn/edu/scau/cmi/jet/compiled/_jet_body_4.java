package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body_4 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_body_4() {
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
    private static final TagInfo _td_c_replaceStrings_2_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            2, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_22 = new TagInfo("c:get", //$NON-NLS-1$
            8, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_79 = new TagInfo("c:get", //$NON-NLS-1$
            11, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_132 = new TagInfo("c:get", //$NON-NLS-1$
            11, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_3 = new TagInfo("c:include", //$NON-NLS-1$
            15, 3,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/deleteRelate/tbody.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_82 = new TagInfo("c:get", //$NON-NLS-1$
            17, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_132 = new TagInfo("c:get", //$NON-NLS-1$
            17, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($relateTableName)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_184 = new TagInfo("c:get", //$NON-NLS-1$
            17, 184,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_236 = new TagInfo("c:get", //$NON-NLS-1$
            17, 236,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_283 = new TagInfo("c:get", //$NON-NLS-1$
            17, 283,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_336 = new TagInfo("c:get", //$NON-NLS-1$
            17, 336,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
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
            out.write(NL);         
            RuntimeTagElement _jettag_c_replaceStrings_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_2_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_replaceStrings_2_1.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_replaceStrings_2_1.setTagInfo(_td_c_replaceStrings_2_1);
            _jettag_c_replaceStrings_2_1.doStart(context, out);
            JET2Writer _jettag_c_replaceStrings_2_1_saved_out = out;
            while (_jettag_c_replaceStrings_2_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write(NL);         
                out.write("<body>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t<div id=\"contentarea\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<fmt:message key=\"navigation.view\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_22.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_8_22.setTagInfo(_td_c_get_8_22);
                _jettag_c_get_8_22.doStart(context, out);
                _jettag_c_get_8_22.doEnd();
                out.write(".title\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</h3>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<div class=\"navitem\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<a class=\"button\" href=\"doller_sign{pageContext.request.contextPath}/select");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_79.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_11_79.setTagInfo(_td_c_get_11_79);
                _jettag_c_get_11_79.doStart(context, out);
                _jettag_c_get_11_79.doEnd();
                out.write("?idKey=doller_sign{");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_132); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_132.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_11_132.setTagInfo(_td_c_get_11_132);
                _jettag_c_get_11_132.doStart(context, out);
                _jettag_c_get_11_132.doEnd();
                out.write("_id}&page=firstPage\"><span><img");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\tsrc=\"images/icons/back.gif\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<fmt:message key=\"navigation.back\" /></span></a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_15_3.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_include_15_3.setTagInfo(_td_c_include_15_3);
                _jettag_c_include_15_3.doStart(context, out);
                _jettag_c_include_15_3.doEnd();
                out.write("\t\t\t<div class=\"navitem\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_82); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_82.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_82.setTagInfo(_td_c_get_17_82);
                _jettag_c_get_17_82.doStart(context, out);
                _jettag_c_get_17_82.doEnd();
                RuntimeTagElement _jettag_c_get_17_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_132); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_132.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_132.setTagInfo(_td_c_get_17_132);
                _jettag_c_get_17_132.doStart(context, out);
                _jettag_c_get_17_132.doEnd();
                out.write("s?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_184 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_184); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_184.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_184.setTagInfo(_td_c_get_17_184);
                _jettag_c_get_17_184.doStart(context, out);
                _jettag_c_get_17_184.doEnd();
                out.write("_id=Dollar_symbol{");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_236 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_236); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_236.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_236.setTagInfo(_td_c_get_17_236);
                _jettag_c_get_17_236.doStart(context, out);
                _jettag_c_get_17_236.doEnd();
                out.write("_id}&related_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_283 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_283); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_283.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_283.setTagInfo(_td_c_get_17_283);
                _jettag_c_get_17_283.doStart(context, out);
                _jettag_c_get_17_283.doEnd();
                out.write("s_id=Dollar_symbol{");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_336 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_336); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_336.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_17_336.setTagInfo(_td_c_get_17_336);
                _jettag_c_get_17_336.doStart(context, out);
                _jettag_c_get_17_336.doEnd();
                out.write(".id}&\"><span><img");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\tsrc=\"images/icons/delete.gif\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<fmt:message key=\"navigation.delete\" /></span></a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<div class=\"clear\">&nbsp;</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</body>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_replaceStrings_2_1.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_2_1_saved_out;
            _jettag_c_replaceStrings_2_1.doEnd();
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
