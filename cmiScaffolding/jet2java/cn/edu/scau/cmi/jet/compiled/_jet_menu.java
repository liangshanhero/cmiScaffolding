package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_menu implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_menu() {
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
    private static final TagInfo _td_c_get_5_34 = new TagInfo("c:get", //$NON-NLS-1$
            5, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_77 = new TagInfo("c:get", //$NON-NLS-1$
            6, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_239 = new TagInfo("c:get", //$NON-NLS-1$
            6, 239,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
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
                out.write("%Left_angle_brackets%@page language=\"java\" isELIgnored=\"false\" contentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<jsp:directive.include file=\"/WEB-INF/sitemesh-decorators/include.jsp\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<fmt:setBundle basename=\"bundles.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_34); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_34.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_5_34.setTagInfo(_td_c_get_5_34);
                _jettag_c_get_5_34.doStart(context, out);
                _jettag_c_get_5_34.doEnd();
                out.write("-resources\"/>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_77); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_77.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_6_77.setTagInfo(_td_c_get_6_77);
                _jettag_c_get_6_77.doStart(context, out);
                _jettag_c_get_6_77.doEnd();
                out.write("?page=homePage\"><span><img src=\"images/icons/view.gif\" /><fmt:message key=\"navigation.view\"/> <fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_239 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_239); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_239.setRuntimeParent(_jettag_c_replaceStrings_2_1);
                _jettag_c_get_6_239.setTagInfo(_td_c_get_6_239);
                _jettag_c_get_6_239.doStart(context, out);
                _jettag_c_get_6_239.doEnd();
                out.write(".title\"/></span></a>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_replaceStrings_2_1.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_2_1_saved_out;
            _jettag_c_replaceStrings_2_1.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
        out.write(NL);         
    }
}
