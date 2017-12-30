package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body_3 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_body_3() {
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
    private static final TagInfo _td_c_setVariable_1_135 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 135,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_1_174 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 174,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_1_233 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 233,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_1_291 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 291,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_25 = new TagInfo("c:get", //$NON-NLS-1$
            3, 25,
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
    private static final TagInfo _td_c_include_6_3 = new TagInfo("c:include", //$NON-NLS-1$
            6, 3,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/delete/tbody.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_101 = new TagInfo("c:get", //$NON-NLS-1$
            8, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_152 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 152,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_219 = new TagInfo("c:get", //$NON-NLS-1$
            8, 219,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_269 = new TagInfo("c:get", //$NON-NLS-1$
            8, 269,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_304 = new TagInfo("c:get", //$NON-NLS-1$
            8, 304,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_340 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 340,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_389 = new TagInfo("c:if", //$NON-NLS-1$
            8, 389,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
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
                RuntimeTagElement _jettag_c_setVariable_1_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_1_135.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_1_135.setTagInfo(_td_c_setVariable_1_135);
                _jettag_c_setVariable_1_135.doStart(context, out);
                _jettag_c_setVariable_1_135.doEnd();
                RuntimeTagElement _jettag_c_iterate_1_174 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_174); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_1_174.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_1_174.setTagInfo(_td_c_iterate_1_174);
                _jettag_c_iterate_1_174.doStart(context, out);
                while (_jettag_c_iterate_1_174.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_1_233 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_233); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_1_233.setRuntimeParent(_jettag_c_iterate_1_174);
                    _jettag_c_setVariable_1_233.setTagInfo(_td_c_setVariable_1_233);
                    _jettag_c_setVariable_1_233.doStart(context, out);
                    _jettag_c_setVariable_1_233.doEnd();
                    _jettag_c_iterate_1_174.handleBodyContent(out);
                }
                _jettag_c_iterate_1_174.doEnd();
                RuntimeTagElement _jettag_c_setVariable_1_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_291); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_1_291.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_1_291.setTagInfo(_td_c_setVariable_1_291);
                _jettag_c_setVariable_1_291.doStart(context, out);
                _jettag_c_setVariable_1_291.doEnd();
                out.write("<body>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<h1><fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_25.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_3_25.setTagInfo(_td_c_get_3_25);
                _jettag_c_get_3_25.doStart(context, out);
                _jettag_c_get_3_25.doEnd();
                out.write(".title\"/>Details</h1>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div class=\"navitem\"><a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_100); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_100.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_4_100.setTagInfo(_td_c_get_4_100);
                _jettag_c_get_4_100.doStart(context, out);
                _jettag_c_get_4_100.doEnd();
                out.write("?page=homePage\"><span><img src=\"images/icons/back.gif\" /><fmt:message key=\"navigation.back\"/></span></a></div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_6_3.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_include_6_3.setTagInfo(_td_c_include_6_3);
                _jettag_c_include_6_3.doStart(context, out);
                _jettag_c_include_6_3.doEnd();
                out.write("\t\t</table>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div class=\"navitem\"><a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/delete");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_101.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_8_101.setTagInfo(_td_c_get_8_101);
                _jettag_c_get_8_101.doStart(context, out);
                _jettag_c_get_8_101.doEnd();
                out.write("?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_8_152 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_152); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_8_152.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_8_152.setTagInfo(_td_c_iterate_8_152);
                _jettag_c_iterate_8_152.doStart(context, out);
                while (_jettag_c_iterate_8_152.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_8_219 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_219); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_219.setRuntimeParent(_jettag_c_iterate_8_152);
                    _jettag_c_get_8_219.setTagInfo(_td_c_get_8_219);
                    _jettag_c_get_8_219.doStart(context, out);
                    _jettag_c_get_8_219.doEnd();
                    out.write("=Dollar_symbol{");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_269 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_269); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_269.setRuntimeParent(_jettag_c_iterate_8_152);
                    _jettag_c_get_8_269.setTagInfo(_td_c_get_8_269);
                    _jettag_c_get_8_269.doStart(context, out);
                    _jettag_c_get_8_269.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_304 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_304); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_304.setRuntimeParent(_jettag_c_iterate_8_152);
                    _jettag_c_get_8_304.setTagInfo(_td_c_get_8_304);
                    _jettag_c_get_8_304.doStart(context, out);
                    _jettag_c_get_8_304.doEnd();
                    out.write("}");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_setVariable_8_340 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_340); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_8_340.setRuntimeParent(_jettag_c_iterate_8_152);
                    _jettag_c_setVariable_8_340.setTagInfo(_td_c_setVariable_8_340);
                    _jettag_c_setVariable_8_340.doStart(context, out);
                    _jettag_c_setVariable_8_340.doEnd();
                    RuntimeTagElement _jettag_c_if_8_389 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_389); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_8_389.setRuntimeParent(_jettag_c_iterate_8_152);
                    _jettag_c_if_8_389.setTagInfo(_td_c_if_8_389);
                    _jettag_c_if_8_389.doStart(context, out);
                    while (_jettag_c_if_8_389.okToProcessBody()) {
                        out.write("&");  //$NON-NLS-1$        
                        _jettag_c_if_8_389.handleBodyContent(out);
                    }
                    _jettag_c_if_8_389.doEnd();
                    _jettag_c_iterate_8_152.handleBodyContent(out);
                }
                _jettag_c_iterate_8_152.doEnd();
                out.write("\"><span><img src=\"images/icons/delete.gif\" /><fmt:message key=\"navigation.delete\"/></span></a></div>");  //$NON-NLS-1$        
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
