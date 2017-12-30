package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_menu_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_menu_0() {
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
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$table", //$NON-NLS-1$
                "eachtable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_12_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            12, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachtable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachtable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_18_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            18, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_3 = new TagInfo("c:if", //$NON-NLS-1$
            20, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i!=0 or $j!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_35 = new TagInfo("c:get", //$NON-NLS-1$
            21, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachtable/@name", //$NON-NLS-1$
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
                out.write("%Left_angle_brackets%@page language=\"java\" isELIgnored=\"false\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tcontentType=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"%%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<jsp:directive.include file=\"/WEB-INF/sitemesh-decorators/include.jsp\" />");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<style>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("#content {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\ttext-align: center;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("}");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</style>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("<div id=\"contentarea\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_11_1.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
                _jettag_c_iterate_11_1.doStart(context, out);
                while (_jettag_c_iterate_11_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_12_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_12_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_12_3.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_setVariable_12_3.setTagInfo(_td_c_setVariable_12_3);
                    _jettag_c_setVariable_12_3.doStart(context, out);
                    _jettag_c_setVariable_12_3.doEnd();
                    RuntimeTagElement _jettag_c_iterate_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_13_3.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_iterate_13_3.setTagInfo(_td_c_iterate_13_3);
                    _jettag_c_iterate_13_3.doStart(context, out);
                    while (_jettag_c_iterate_13_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_14_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_14_3.setRuntimeParent(_jettag_c_iterate_13_3);
                        _jettag_c_setVariable_14_3.setTagInfo(_td_c_setVariable_14_3);
                        _jettag_c_setVariable_14_3.doStart(context, out);
                        _jettag_c_setVariable_14_3.doEnd();
                        _jettag_c_iterate_13_3.handleBodyContent(out);
                    }
                    _jettag_c_iterate_13_3.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_16_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_16_3.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_setVariable_16_3.setTagInfo(_td_c_setVariable_16_3);
                    _jettag_c_setVariable_16_3.doStart(context, out);
                    _jettag_c_setVariable_16_3.doEnd();
                    RuntimeTagElement _jettag_c_iterate_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_17_3.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_iterate_17_3.setTagInfo(_td_c_iterate_17_3);
                    _jettag_c_iterate_17_3.doStart(context, out);
                    while (_jettag_c_iterate_17_3.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_18_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_18_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_18_3.setRuntimeParent(_jettag_c_iterate_17_3);
                        _jettag_c_setVariable_18_3.setTagInfo(_td_c_setVariable_18_3);
                        _jettag_c_setVariable_18_3.doStart(context, out);
                        _jettag_c_setVariable_18_3.doEnd();
                        _jettag_c_iterate_17_3.handleBodyContent(out);
                    }
                    _jettag_c_iterate_17_3.doEnd();
                    RuntimeTagElement _jettag_c_if_20_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_20_3.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_if_20_3.setTagInfo(_td_c_if_20_3);
                    _jettag_c_if_20_3.doStart(context, out);
                    while (_jettag_c_if_20_3.okToProcessBody()) {
                        out.write("<jsp:include page=\"/WEB-INF/pages/");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_21_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_35); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_21_35.setRuntimeParent(_jettag_c_if_20_3);
                        _jettag_c_get_21_35.setTagInfo(_td_c_get_21_35);
                        _jettag_c_get_21_35.doStart(context, out);
                        _jettag_c_get_21_35.doEnd();
                        out.write("/menu.jsp\" />");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_if_20_3.handleBodyContent(out);
                    }
                    _jettag_c_if_20_3.doEnd();
                    _jettag_c_iterate_11_1.handleBodyContent(out);
                }
                _jettag_c_iterate_11_1.doEnd();
                out.write("\t\t<div class=\"clear\">&nbsp;</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</div>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_replaceStrings_1_53.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_1_53_saved_out;
            _jettag_c_replaceStrings_1_53.doEnd();
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
    }
}
