package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_body_1() {
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
    private static final TagInfo _td_c_replaceStrings_1_53 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 53,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_62 = new TagInfo("c:get", //$NON-NLS-1$
            3, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_100 = new TagInfo("c:get", //$NON-NLS-1$
            4, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_73 = new TagInfo("c:get", //$NON-NLS-1$
            5, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_155 = new TagInfo("c:get", //$NON-NLS-1$
            5, 155,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_3 = new TagInfo("c:include", //$NON-NLS-1$
            7, 3,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/edit/tbody.jet", //$NON-NLS-1$
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
            RuntimeTagElement _jettag_c_replaceStrings_1_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_replaceStrings_1_53.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_replaceStrings_1_53.setTagInfo(_td_c_replaceStrings_1_53);
            _jettag_c_replaceStrings_1_53.doStart(context, out);
            JET2Writer _jettag_c_replaceStrings_1_53_saved_out = out;
            while (_jettag_c_replaceStrings_1_53.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("<body>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<h1><fmt:message key=\"navigation.edit\" /><fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_62.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_3_62.setTagInfo(_td_c_get_3_62);
                _jettag_c_get_3_62.doStart(context, out);
                _jettag_c_get_3_62.doEnd();
                out.write(".title\" /></h1>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div class=\"navitem\"><a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_100.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_4_100.setTagInfo(_td_c_get_4_100);
                _jettag_c_get_4_100.doStart(context, out);
                _jettag_c_get_4_100.doEnd();
                out.write("?page=homePage\"><span><img src=\"images/icons/back.gif\" /> <fmt:message key=\"navigation.back\" /></span></a></div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<form:form action=\"Dollar_symbol{pageContext.request.contextPath}/save");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_73); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_73.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_5_73.setTagInfo(_td_c_get_5_73);
                _jettag_c_get_5_73.doStart(context, out);
                _jettag_c_get_5_73.doEnd();
                out.write("\" method=\"POST\" modelAttribute=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_155 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_155); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_155.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_5_155.setTagInfo(_td_c_get_5_155);
                _jettag_c_get_5_155.doStart(context, out);
                _jettag_c_get_5_155.doEnd();
                out.write("\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_7_3.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_include_7_3.setTagInfo(_td_c_include_7_3);
                _jettag_c_include_7_3.doStart(context, out);
                _jettag_c_include_7_3.doEnd();
                out.write("\t\t</table>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<span class=\"inputbutton\"><input class=\"savebutton\" id=\"save\" type=\"submit\" value=\"<fmt:message key=\"navigation.save\"/>\" /></span>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<script type=\"text/javascript\">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId : 'save',event : 'onclick'}));</script>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</form:form>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div class=\"clear\">&nbsp;</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</body>");  //$NON-NLS-1$        
                _jettag_c_replaceStrings_1_53.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_1_53_saved_out;
            _jettag_c_replaceStrings_1_53.doEnd();
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
