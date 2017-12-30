package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_body_0() {
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
    private static final TagInfo _td_c_get_8_31 = new TagInfo("c:get", //$NON-NLS-1$
            8, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_72 = new TagInfo("c:get", //$NON-NLS-1$
            12, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_12 = new TagInfo("c:include", //$NON-NLS-1$
            16, 12,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/viewRelate/tbody.jet", //$NON-NLS-1$
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
                out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t<h1>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fmt:message key=\"navigation.view\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_31); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_31.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_8_31.setTagInfo(_td_c_get_8_31);
                _jettag_c_get_8_31.doStart(context, out);
                _jettag_c_get_8_31.doEnd();
                out.write(".title\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t</h1>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"navitem\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"button\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_72); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_72.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_12_72.setTagInfo(_td_c_get_12_72);
                _jettag_c_get_12_72.doStart(context, out);
                _jettag_c_get_12_72.doEnd();
                out.write("?page=homePage\"><span><img");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"images/icons/back.gif\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<fmt:message key=\"navigation.back\" /></span></a>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t\t\t\t\t\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_16_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_16_12.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_include_16_12.setTagInfo(_td_c_include_16_12);
                _jettag_c_include_16_12.doStart(context, out);
                _jettag_c_include_16_12.doEnd();
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
